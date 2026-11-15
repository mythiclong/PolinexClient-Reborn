package me.octo.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.multiplayer.ClientLevel;
import java.util.Collection;
import java.util.Map;
import me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;

public final class IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl {
   public static me.octo.client.PXDyn var5 = null; // PX-FIX missing field v2

   @NotNull
   private Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private Set<Block> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final Set<Block> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Set<Block> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private List<? extends AABB> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final HashMap<BlockPos, IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final HashMap<BlockPos, Double> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final HashMap<BlockPos, Double> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private BlockPos lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private List<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static int[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] a;
   private static String[] b;

   public IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl() { IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var5 = null; // PX-FIX hoist
        
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = 6947;
      short var10004 = 7632;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      Block[] var2 = new Block[]{
         Blocks.INFESTED_STONE,
         Blocks.GOLD_ORE,
         Blocks.IRON_ORE,
         Blocks.COAL_ORE,
         Blocks.LAPIS_ORE,
         Blocks.DIAMOND_ORE,
         Blocks.REDSTONE_ORE,
         Blocks.EMERALD_ORE,
         Blocks.STONE,
         Blocks.WHITE_TERRACOTTA,
         Blocks.ORANGE_TERRACOTTA,
         Blocks.MAGENTA_TERRACOTTA,
         Blocks.LIGHT_BLUE_TERRACOTTA,
         Blocks.YELLOW_TERRACOTTA,
         Blocks.LIME_TERRACOTTA,
         Blocks.PINK_TERRACOTTA,
         Blocks.GRAY_TERRACOTTA,
         Blocks.LIGHT_GRAY_TERRACOTTA,
         Blocks.CYAN_TERRACOTTA,
         Blocks.PURPLE_TERRACOTTA,
         Blocks.BLUE_TERRACOTTA,
         Blocks.BROWN_TERRACOTTA,
         Blocks.GREEN_TERRACOTTA,
         Blocks.RED_TERRACOTTA,
         Blocks.BLACK_TERRACOTTA,
         Blocks.WHITE_WOOL,
         Blocks.ORANGE_WOOL,
         Blocks.MAGENTA_WOOL,
         Blocks.LIGHT_BLUE_WOOL,
         Blocks.YELLOW_WOOL,
         Blocks.LIME_WOOL,
         Blocks.PINK_WOOL,
         Blocks.GRAY_WOOL,
         Blocks.LIGHT_GRAY_WOOL,
         Blocks.CYAN_WOOL,
         Blocks.PURPLE_WOOL,
         Blocks.BLUE_WOOL,
         Blocks.BROWN_WOOL,
         Blocks.GREEN_WOOL,
         Blocks.RED_WOOL,
         Blocks.BLACK_WOOL
      };
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = SetsKt.setOf(var2);
      int[] var10000 = d();
      var2 = new Block[]{
         Blocks.WHITE_STAINED_GLASS,
         Blocks.ORANGE_STAINED_GLASS,
         Blocks.MAGENTA_STAINED_GLASS,
         Blocks.LIGHT_BLUE_STAINED_GLASS,
         Blocks.YELLOW_STAINED_GLASS,
         Blocks.LIME_STAINED_GLASS,
         Blocks.PINK_STAINED_GLASS,
         Blocks.GRAY_STAINED_GLASS,
         Blocks.LIGHT_GRAY_STAINED_GLASS,
         Blocks.CYAN_STAINED_GLASS,
         Blocks.PURPLE_STAINED_GLASS,
         Blocks.BLUE_STAINED_GLASS,
         Blocks.BROWN_STAINED_GLASS,
         Blocks.GREEN_STAINED_GLASS,
         Blocks.RED_STAINED_GLASS,
         Blocks.BLACK_STAINED_GLASS,
         Blocks.WHITE_STAINED_GLASS_PANE,
         Blocks.ORANGE_STAINED_GLASS_PANE,
         Blocks.MAGENTA_STAINED_GLASS_PANE,
         Blocks.LIGHT_BLUE_STAINED_GLASS_PANE,
         Blocks.YELLOW_STAINED_GLASS_PANE,
         Blocks.LIME_STAINED_GLASS_PANE,
         Blocks.PINK_STAINED_GLASS_PANE,
         Blocks.GRAY_STAINED_GLASS_PANE,
         Blocks.LIGHT_GRAY_STAINED_GLASS_PANE,
         Blocks.CYAN_STAINED_GLASS_PANE,
         Blocks.PURPLE_STAINED_GLASS_PANE,
         Blocks.BLUE_STAINED_GLASS_PANE,
         Blocks.BROWN_STAINED_GLASS_PANE,
         Blocks.GREEN_STAINED_GLASS_PANE,
         Blocks.RED_STAINED_GLASS_PANE,
         Blocks.BLACK_STAINED_GLASS_PANE,
         Blocks.PRISMARINE
      };
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = SetsKt.setOf(var2);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = SetsKt.plus(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = CollectionsKt.emptyList();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap<>();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap<>();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap<>();
      BlockPos var10002 = BlockPos.ZERO;
      var10004 = 6948;
      short var10005 = 15717;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var10002;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
       var5 = new IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
         new IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            1, 0
         ),
         new IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            -1, 0
         ),
         new IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            0, 1
         ),
         new IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            0, -1
         )
      };
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.listOf(var5);
      int[] var1 = var10000;

      try {
         if (var1 == null) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
            );
         }
      } catch (NoWhenBranchMatchedException var3) {
         throw (RuntimeException)a(var3);
      }
   }

   @NotNull
   public final Set<Block> a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final Set<Block> b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final ArrayList<BlockPos> a(@NotNull BlockPos param1, @NotNull ArrayList<AABB> param2, boolean param3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [35[WHILELOOP], 34[DOLOOP]], but top level block is 36[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
   }

   private final ArrayList<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> a(
      IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      int[] var2 = d();
      ArrayList<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var3 = new ArrayList<>();
      IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = var1;

      while (var4 != null) {
         if (var2 == null) {
            break;
         }

         var3.add(var4);
         var4 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var4.f());
      }

      return var3;
   }
   private final ArrayList<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> a(
      List<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> param1
   ) {
      int[] var2 = d();
      ArrayList<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var3 = new ArrayList<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>();
      var3.add(CollectionsKt.first(param1));
      int var4 = 0;
      while (var4 < param1.size() - 1) {
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = param1.get(var4);
         int var6 = var4 + 1;
         while (var6 < param1.size() && this.a(var5, param1.get(var6))) {
            var6++;
         }
         int var7 = var6 - 1;
         if (var7 != var4) {
            var3.add(param1.get(var7));
            var4 = var7;
         } else {
            var3.add(param1.get(var6));
            var4 = var6;
         }
      }
      if (!Intrinsics.areEqual(CollectionsKt.last(var3).a(), CollectionsKt.last(param1).a())) {
         var3.add(CollectionsKt.last(param1));
      }
      return var3;
   }

   private final boolean a(
      IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param1,
      IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param2
   ) {
      Vec3 var4 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(param1.a());
      int[] var3 = d();
      Vec3 var5 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(param2.a());
      lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI var6 = new lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI(lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var4, var5).a());
      Vec3 var7 = var6.c().scale(0.5);
      Intrinsics.checkNotNullExpressionValue(var7, "scale(...)");
      Vec3 var8 = var6.d().scale(0.5);
      Intrinsics.checkNotNullExpressionValue(var8, "scale(...)");
      ArrayList[] var10 = new ArrayList[3];
      var10[0] = this.a(var4, var5);
      Vec3 var11 = var4.add(var7);
      Intrinsics.checkNotNullExpressionValue(var11, "add(...)");
      Vec3 var12 = var5.add(var7);
      Intrinsics.checkNotNullExpressionValue(var12, "add(...)");
      var10[1] = this.a(var11, var12);
      Vec3 var13 = var4.add(var8);
      Intrinsics.checkNotNullExpressionValue(var13, "add(...)");
      Vec3 var14 = var5.add(var8);
      Intrinsics.checkNotNullExpressionValue(var14, "add(...)");
      var10[2] = this.a(var13, var14);
      ArrayList var9 = CollectionsKt.arrayListOf(var10);
      java.util.Iterator var15 = var9.iterator();
      Intrinsics.checkNotNullExpressionValue(var15, "iterator(...)");
      while (var15.hasNext()) {
         Object var16 = var15.next();
         Intrinsics.checkNotNullExpressionValue(var16, "next(...)");
         ArrayList var17 = (ArrayList)var16;
         java.util.Iterator var18 = var17.iterator();
         Intrinsics.checkNotNullExpressionValue(var18, "iterator(...)");
         while (var18.hasNext()) {
            Object var19 = var18.next();
            Intrinsics.checkNotNullExpressionValue(var19, "next(...)");
            BlockPos var20 = (BlockPos)var19;
            Minecraft var21 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            ClientLevel var22 = var21.level;
            Intrinsics.checkNotNull(var22);
            Block var23 = var22.getBlockState(var20).getBlock();
            Intrinsics.checkNotNullExpressionValue(var23, "getBlock(...)");
            if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(var23)
               && !IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.contains(var23)) {
               return false;
            }
            Minecraft var24 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            ClientLevel var25 = var24.level;
            Intrinsics.checkNotNull(var25);
            Block var26 = var25.getBlockState(var20.offset(0, 1, 0)).getBlock();
            Intrinsics.checkNotNullExpressionValue(var26, "getBlock(...)");
            if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(var26)
               && !var26.defaultBlockState().isAir()) {
               return false;
            }
            Minecraft var27 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            ClientLevel var28 = var27.level;
            Intrinsics.checkNotNull(var28);
            Block var29 = var28.getBlockState(var20.offset(0, 2, 0)).getBlock();
            Intrinsics.checkNotNullExpressionValue(var29, "getBlock(...)");
            if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(var29)
               || var29.defaultBlockState().isAir()) {
               continue;
            }
            return false;
         }
      }
      return true;
   }

   @NotNull
   public final ArrayList<BlockPos> a(@NotNull Vec3 param1, @NotNull Vec3 param2) {
      // Decoy: `d()` returns this class's static pad int[] (local 3); only `aload_3; ifnull/ifnonnull` padding
      // folds at 172-173, 178-179 and 243-244 test it, so those branches and the pad local are inert.
      Intrinsics.checkNotNullParameter(param1, "vec1");
      Intrinsics.checkNotNullParameter(param2, "vec2");
      ArrayList<BlockPos> var4 = new ArrayList<>();
      double var5 = param2.x - param1.x;
      double var7 = param2.y - param1.y;
      double var9 = param2.z - param1.z;
      double var11 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
      double var13 = var11 * 5.0;
      double var15 = var5 / var13;
      double var17 = var7 / var13;
      double var19 = var9 / var13;
      double var21 = param1.x;
      double var23 = param1.y;
      double var25 = param1.z;
      int[] var3 = d();
      for (int var27 = 0; (double)var27 <= var13; var27++) {
         BlockPos var28 = new BlockPos((int)var21, (int)var23, (int)var25);
         if (!var4.contains(var28)) {
            var4.add(var28);
         }
         var21 += var15;
         var23 += var17;
         var25 += var19;
      }
      return var4;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: sipush 6969
      // 04: sipush -994
      // 07: pop2
      // 08: ldc_w "vec1"
      // 0b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e: aload 2
      // 0f: sipush 6970
      // 12: sipush 15727
      // 15: pop2
      // 16: ldc_w "vec2"
      // 19: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 1c: new java/util/ArrayList
      // 1f: dup
      // 20: invokespecial java/util/ArrayList.<init> ()V
      // 23: astore 4
      // 25: aload 2
      // 26: getfield net/minecraft/world/phys/Vec3.x D
      // 29: aload 1
      // 2a: getfield net/minecraft/world/phys/Vec3.x D
      // 2d: dsub
      // 2e: dstore 5
      // 30: aload 2
      // 31: getfield net/minecraft/world/phys/Vec3.y D
      // 34: aload 1
      // 35: getfield net/minecraft/world/phys/Vec3.y D
      // 38: dsub
      // 39: dstore 7
      // 3b: aload 2
      // 3c: getfield net/minecraft/world/phys/Vec3.z D
      // 3f: aload 1
      // 40: getfield net/minecraft/world/phys/Vec3.z D
      // 43: dsub
      // 44: dstore 9
      // 46: dload 5
      // 48: dload 5
      // 4a: dmul
      // 4b: dload 7
      // 4d: dload 7
      // 4f: dmul
      // 50: dadd
      // 51: dload 9
      // 53: dload 9
      // 55: dmul
      // 56: dadd
      // 57: invokestatic java/lang/Math.sqrt (D)D
      // 5a: dstore 11
      // 5c: dload 11
      // 5e: bipush 5
      // 5f: i2d
      // 60: dmul
      // 61: dstore 13
      // 63: dload 5
      // 65: dload 13
      // 67: ddiv
      // 68: dstore 15
      // 6a: dload 7
      // 6c: dload 13
      // 6e: ddiv
      // 6f: dstore 17
      // 71: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d ()[I
      // 74: dload 9
      // 76: dload 13
      // 78: ddiv
      // 79: dstore 19
      // 7b: aload 1
      // 7c: getfield net/minecraft/world/phys/Vec3.x D
      // 7f: dstore 21
      // 81: aload 1
      // 82: getfield net/minecraft/world/phys/Vec3.y D
      // 85: dstore 23
      // 87: aload 1
      // 88: getfield net/minecraft/world/phys/Vec3.z D
      // 8b: dstore 25
      // 8d: bipush 0
      // 8e: istore 27
      // 90: astore 3
      // 91: iload 27
      // 93: i2d
      // 94: dload 13
      // 96: dcmpg
      // 97: ifgt f7
      // 9a: new net/minecraft/core/BlockPos
      // 9d: dup
      // 9e: dload 21
      // a0: d2i
      // a1: dload 23
      // a3: d2i
      // a4: dload 25
      // a6: d2i
      // a7: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // aa: astore 28
      // ac: aload 3
      // ad: ifnull f3
      // b0: aload 4
      // b2: aload 3
      // b3: ifnull f9
      // b6: goto bd
      // b9: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // bc: athrow
      // bd: aload 28
      // bf: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // c2: ifne db
      // c5: goto cc
      // c8: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // cb: athrow
      // cc: aload 4
      // ce: aload 28
      // d0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // d3: pop
      // d4: goto db
      // d7: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // da: athrow
      // db: dload 21
      // dd: dload 15
      // df: dadd
      // e0: dstore 21
      // e2: dload 23
      // e4: dload 17
      // e6: dadd
      // e7: dstore 23
      // e9: dload 25
      // eb: dload 19
      // ed: dadd
      // ee: dstore 25
      // f0: iinc 27 1
      // f3: aload 3
      // f4: ifnonnull 91
      // f7: aload 4
      // f9: areturn
   }

   private final ArrayList<BlockPos> a(
      ArrayList<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> param1
   ) {
      int[] pad = d();
      var result = CollectionsKt.arrayListOf(new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{param1.get(0)});
      var last = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(0, 0);
      int lastIndex = CollectionsKt.getLastIndex(param1);
      for (int i = 1; i <= lastIndex; i++) {
         var p1 = param1.get(i - 1).a();
         var p2 = param1.get(i).a();
         var cur = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(p1.getX() - p2.getX(), p1.getZ() - p2.getZ());
         if (cur.a() != last.a() || cur.b() != last.b()) {
            result.add(param1.get(i - 1));
         }
         last = cur;
      }
      result.add(CollectionsKt.last(param1));
      Collection<BlockPos> dest = new ArrayList<BlockPos>(CollectionsKt.collectionSizeOrDefault(result, 10));
      Iterable<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> it = result;
      for (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI x : it) {
         dest.add(x.a());
      }
      return (ArrayList<BlockPos>)CollectionsKt.toCollection(dest, new ArrayList());
   }

   private final double a(BlockPos param1) {
      // decoy `d()` padding array, every `aload_2; ifnull/ifnonnull` fold and the `NoWhenBranchMatchedException` rethrow shims dropped (COMMON decoy family).
      int[] var2 = d();
      double var3 = 0.0;
      for (int var5 = -1; var5 < 2; var5++) {
         for (int var6 = -1; var6 < 2; var6++) {
            for (int var7 = 0; var7 < 3; var7++) {
               BlockPos var8 = param1.offset(var5, var7, var6);
               Block var9 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level.getBlockState(var8).getBlock();
               boolean var10;
               if (var7 == 0) {
                  var10 = var9.defaultBlockState().isAir();
               } else {
                  var10 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.contains(var9);
               }
               if (var10) {
                  var3 += 0.1;
               }
            }
         }
      }
      return var3;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d ()[I
      // 03: dconst_0
      // 04: dstore 3
      // 05: astore 2
      // 06: bipush -1
      // 07: istore 5
      // 09: iload 5
      // 0b: bipush 2
      // 0c: if_icmpge d3
      // 0f: bipush -1
      // 10: istore 6
      // 12: iload 6
      // 14: bipush 2
      // 15: if_icmpge cc
      // 18: bipush 0
      // 19: aload 2
      // 1a: ifnull 0b
      // 1d: istore 7
      // 1f: iload 7
      // 21: bipush 3
      // 22: if_icmpge c5
      // 25: aload 1
      // 26: iload 5
      // 28: iload 7
      // 2a: iload 6
      // 2c: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 2f: dup
      // 30: sipush 6961
      // 33: sipush 16660
      // 36: pop2
      // 37: ldc_w "offset(...)"
      // 3a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3d: astore 8
      // 3f: aload 0
      // 40: getfield me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lnet/minecraft/client/Minecraft;
      // 43: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 46: dup
      // 47: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 4a: aload 8
      // 4c: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 4f: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 52: dup
      // 53: sipush 6946
      // 56: sipush -30762
      // 59: pop2
      // 5a: ldc_w "getBlock(...)"
      // 5d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 60: astore 9
      // 62: iload 7
      // 64: aload 2
      // 65: ifnull 14
      // 68: aload 2
      // 69: ifnull 95
      // 6c: ifne 93
      // 6f: goto 76
      // 72: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 75: athrow
      // 76: aload 9
      // 78: invokevirtual net/minecraft/world/level/block/Block.defaultBlockState ()Lnet/minecraft/world/level/block/state/BlockState;
      // 7b: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 7e: aload 2
      // 7f: ifnull 95
      // 82: goto 89
      // 85: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 88: athrow
      // 89: ifne b8
      // 8c: goto 93
      // 8f: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 92: athrow
      // 93: iload 7
      // 95: aload 2
      // 96: ifnull b5
      // 99: ifeq be
      // 9c: goto a3
      // 9f: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // a2: athrow
      // a3: aload 0
      // a4: getfield me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/util/Set;
      // a7: aload 9
      // a9: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // ae: goto b5
      // b1: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // b4: athrow
      // b5: ifeq be
      // b8: dload 3
      // b9: ldc2_w 0.1
      // bc: dadd
      // bd: dstore 3
      // be: iinc 7 1
      // c1: aload 2
      // c2: ifnonnull 1f
      // c5: iinc 6 1
      // c8: aload 2
      // c9: ifnonnull 12
      // cc: iinc 5 1
      // cf: aload 2
      // d0: ifnonnull 09
      // d3: dload 3
      // d4: dreturn
   }

   private final ArrayList<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b(
      BlockPos param1
   ) {
      int[] var2 = d();
      ArrayList<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> var3 = new ArrayList<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      java.util.Iterator var8 = ((Iterable)(Object)this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl).iterator();
      while (var8.hasNext()) {
         Object var9 = var8.next();
         IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10 = (IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var9;
         if (a(param1, this, var3, var10.a(), var10.b(), 1.0)) {
            if (var10.a() == 0) {
               var5.add(Integer.valueOf(var10.b()));
            } else {
               var4.add(Integer.valueOf(var10.a()));
            }
         }
      }
      java.util.Iterator var6 = var4.iterator();
      Intrinsics.checkNotNullExpressionValue(var6, "iterator(...)");
      while (var6.hasNext()) {
         Object var16 = var6.next();
         Intrinsics.checkNotNullExpressionValue(var16, "next(...)");
         int var7 = ((Number)var16).intValue();
         java.util.Iterator var17 = var5.iterator();
         Intrinsics.checkNotNullExpressionValue(var17, "iterator(...)");
         while (var17.hasNext()) {
            Object var18 = var17.next();
            Intrinsics.checkNotNullExpressionValue(var18, "next(...)");
            int var19 = ((Number)var18).intValue();
            a(param1, this, var3, var7, var19, 1.4);
         }
      }
      return var3;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d ()[I
      // 003: new java/util/ArrayList
      // 006: dup
      // 007: invokespecial java/util/ArrayList.<init> ()V
      // 00a: astore 3
      // 00b: new java/util/ArrayList
      // 00e: dup
      // 00f: invokespecial java/util/ArrayList.<init> ()V
      // 012: astore 4
      // 014: new java/util/ArrayList
      // 017: dup
      // 018: invokespecial java/util/ArrayList.<init> ()V
      // 01b: astore 5
      // 01d: aload 0
      // 01e: getfield me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/util/List;
      // 021: checkcast java/lang/Iterable
      // 024: astore 6
      // 026: bipush 0
      // 027: istore 7
      // 029: astore 2
      // 02a: aload 6
      // 02c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 031: astore 8
      // 033: aload 8
      // 035: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03a: ifeq 0bf
      // 03d: aload 8
      // 03f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 044: astore 9
      // 046: aload 9
      // 048: checkcast me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 04b: astore 10
      // 04d: bipush 0
      // 04e: istore 11
      // 050: aload 2
      // 051: ifnull 0c0
      // 054: aload 2
      // 055: ifnull 0bb
      // 058: goto 05f
      // 05b: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 05e: athrow
      // 05f: aload 1
      // 060: aload 0
      // 061: aload 3
      // 062: aload 10
      // 064: invokevirtual me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()I
      // 067: aload 10
      // 069: invokevirtual me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()I
      // 06c: dconst_1
      // 06d: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lnet/minecraft/core/BlockPos;Lme/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl;Ljava/util/ArrayList;IID)Z
      // 070: ifeq 0b9
      // 073: goto 07a
      // 076: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 079: athrow
      // 07a: aload 10
      // 07c: invokevirtual me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()I
      // 07f: aload 2
      // 080: ifnull 0a8
      // 083: goto 08a
      // 086: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 089: athrow
      // 08a: ifne 0ab
      // 08d: goto 094
      // 090: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 093: athrow
      // 094: aload 5
      // 096: aload 10
      // 098: invokevirtual me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b ()I
      // 09b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0a1: goto 0a8
      // 0a4: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a7: athrow
      // 0a8: goto 0b8
      // 0ab: aload 4
      // 0ad: aload 10
      // 0af: invokevirtual me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a ()I
      // 0b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b5: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0b8: pop
      // 0b9: nop
      // 0ba: nop
      // 0bb: aload 2
      // 0bc: ifnonnull 033
      // 0bf: nop
      // 0c0: aload 4
      // 0c2: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0c5: dup
      // 0c6: sipush 6975
      // 0c9: sipush -19177
      // 0cc: pop2
      // 0cd: ldc_w "iterator(...)"
      // 0d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0d3: astore 6
      // 0d5: aload 6
      // 0d7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0dc: ifeq 159
      // 0df: aload 6
      // 0e1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e6: dup
      // 0e7: sipush 6972
      // 0ea: sipush -23283
      // 0ed: pop2
      // 0ee: ldc_w "next(...)"
      // 0f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f4: checkcast java/lang/Number
      // 0f7: invokevirtual java/lang/Number.intValue ()I
      // 0fa: istore 7
      // 0fc: aload 5
      // 0fe: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 101: dup
      // 102: sipush 6975
      // 105: sipush -19177
      // 108: pop2
      // 109: ldc_w "iterator(...)"
      // 10c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 10f: astore 8
      // 111: aload 8
      // 113: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 118: ifeq 0d5
      // 11b: aload 8
      // 11d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 122: dup
      // 123: sipush 6972
      // 126: sipush -23283
      // 129: pop2
      // 12a: ldc_w "next(...)"
      // 12d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 130: checkcast java/lang/Number
      // 133: invokevirtual java/lang/Number.intValue ()I
      // 136: istore 9
      // 138: aload 1
      // 139: aload 0
      // 13a: aload 3
      // 13b: iload 7
      // 13d: iload 9
      // 13f: ldc2_w 1.4
      // 142: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lnet/minecraft/core/BlockPos;Lme/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl;Ljava/util/ArrayList;IID)Z
      // 145: pop
      // 146: aload 2
      // 147: ifnull 0fc
      // 14a: aload 2
      // 14b: ifnull 159
      // 14e: aload 2
      // 14f: ifnonnull 111
      // 152: goto 159
      // 155: invokestatic me/octo/client/IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 158: athrow
      // 159: aload 3
      // 15a: areturn
   }

   private final double c(BlockPos param1) {
        double d;
        block11: {
            Double d2;
            block6: {
                Double d3;
                block7: {
                    double d4;
                    block10: {
                        double d5;
                        double d6;
                        block8: {
                            double d7;
                            double d8;
                            block9: {
                                d3 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(param1);
                                int[] nArray = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
                                try {
                                    d2 = d3;
                                    if (nArray == null) break block6;
                                    if (d2 != null) break block7;
                                }
                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                    throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                }
                                d8 = Math.abs((double)(param1.getX() - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.getX()));
                                d7 = Math.abs((double)(param1.getZ() - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.getZ()));
                                try {
                                    try {
                                        d6 = d8;
                                        d5 = d7;
                                        if (nArray == null) break block8;
                                        if (!(d6 < d5)) break block9;
                                    }
                                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                        throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                    }
                                    d4 = 1.4 * d8 + (d7 - d8);
                                    break block10;
                                }
                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                    throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                }
                            }
                            d6 = 1.4 * d7;
                            d5 = d8 - d7;
                        }
                        d4 = d6 + d5;
                    }
                    double d9 = d4;
                    ((Map)this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII).put(param1, d9);
                    d = d9;
                    break block11;
                }
                d2 = d3;
            }
            d = d2;
        }
        return d;
   }

   private final ArrayList<AABB> c() { AABB[] var5 = null; // PX-FIX hoist
        
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      label45: {
         label46: {
            label47: {
               try {
                  switch (((int[])IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                     .ordinal()]) {
                     case 1:
                        return new ArrayList<>();
                     case 2:
                        break label45;
                     case 3:
                        break label46;
                     case 4:
                        break label47;
                     case 5:
                        break;
                     default:
                        throw new NoWhenBranchMatchedException();
                  }
               } catch (NoWhenBranchMatchedException var2) {
                  throw (RuntimeException)a(var2);
               }

               AABB[] var1 = new AABB[]{
                  lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(new BlockPos(514, 0, 0), new BlockPos(1000, 256, 513))
               };
               return CollectionsKt.arrayListOf(var1);
            }

            AABB[] var3 = new AABB[]{
               lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(new BlockPos(0, 0, 0), new BlockPos(513, 256, 513))
            };
            return CollectionsKt.arrayListOf(var3);
         }

         AABB[] var4 = new AABB[]{
            lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(new BlockPos(514, 0, 514), new BlockPos(1000, 256, 1000))
         };
         return CollectionsKt.arrayListOf(var4);
      }

       var5 = new AABB[]{
         lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(new BlockPos(0, 0, 514), new BlockPos(513, 256, 1000))
      };
      return CollectionsKt.arrayListOf(var5);
   }

   private final void a(boolean param1, int param2) {
      int[] var2 = d();
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Total ms:" + this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b());
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Closed set size:" + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.size());
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Open set size:" + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.c());
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Cached heuristic size:" + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.size());
      String var3 = "Path size:" + param2;
      if (var2 != null) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var3);
      }

      String var4 = param1 ? "SUCCESS" : "FAIL";
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("RESULT:" + var4);
   }

   private static final boolean a(
      BlockPos param0,
      IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl param1,
      ArrayList<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> param2,
      int param3,
      int param4,
      double param5
   ) {
        boolean bl;
        block42: {
            BlockPos blockPos2;
            block43: {
                IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl iIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl2;
                Object object2;
                int[] nArray;
                block39: {
                    block40: {
                        boolean bl2;
                        block41: {
                            IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl iIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl3;
                            block37: {
                                block38: {
                                    Iterable iterable;
                                    block44: {
                                        boolean bl3;
                                        block32: {
                                            block33: {
                                                boolean bl4 = false;
                                                block36: {
                                                    Iterable iterable2;
                                                    block34: {
                                                        block35: {
                                                            int[] nArray2 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
                                                            BlockPos blockPos3 = param0.offset(param3, 0, param4);
                                                            Intrinsics.checkNotNullExpressionValue((Object)blockPos3, (String)"offset(...)");
                                                            blockPos2 = blockPos3;
                                                            nArray = nArray2;
                                                            try {
                                                                bl3 = ((Map)param1.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll).containsKey(blockPos2);
                                                                if (nArray == null) break block32;
                                                                if (bl3) break block33;
                                                            }
                                                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                                            }
                                                            iterable = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                                            boolean bl5 = false;
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            iterable2 = iterable;
                                                                            if (nArray == null) break block34;
                                                                            if (!(iterable2 instanceof Collection)) break block35;
                                                                        }
                                                                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                            throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                                                        }
                                                                        iterable2 = (Collection)iterable;
                                                                        if (nArray == null) break block34;
                                                                    }
                                                                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                        throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                                                    }
                                                                    if (!((java.util.Collection)iterable2).isEmpty()) break block35;
                                                                }
                                                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                    throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                                                }
                                                                bl4 = false;
                                                                break block36;
                                                            }
                                                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                                            }
                                                        }
                                                        iterable2 = iterable;
                                                    }
                                                    for (Object object2x : iterable2) {
                                                        AABB aABB = (AABB)object2x;
                                                        boolean bl6 = false;
                                                        boolean bl7 = aABB.contains(blockPos2.getCenter());
                                                        while (bl7) {
                                                            bl7 = true;
                                                            if (nArray == null) continue;
                                                            break block36;
                                                        }
                                                    }
                                                    bl4 = false;
                                                }
                                                if (!bl4) break block44;
                                            }
                                            bl3 = false;
                                        }
                                        return bl3;
                                    }
                                    ClientLevel clientLevel = param1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
                                    Intrinsics.checkNotNull((Object)clientLevel);
                                    Block block = clientLevel.getBlockState(blockPos2).getBlock();
                                    Intrinsics.checkNotNullExpressionValue((Object)block, (String)"getBlock(...)");
                                    try {
                                        try {
                                            iIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl3 = param1;
                                            if (nArray == null) break block37;
                                            if (iIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.contains(iterable)) break block38;
                                        }
                                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                            throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                        }
                                        return false;
                                    }
                                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                        throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                    }
                                }
                                iIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl3 = param1;
                            }
                            ClientLevel clientLevel = iIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
                            Intrinsics.checkNotNull((Object)clientLevel);
                            Block block = clientLevel.getBlockState(blockPos2.offset(0, 1, 0)).getBlock();
                            Intrinsics.checkNotNullExpressionValue((Object)block, (String)"getBlock(...)");
                            Block block2 = block;
                            boolean bl8 = block2.defaultBlockState().isAir();
                            try {
                                try {
                                    try {
                                        iIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl2 = param1;
                                        if (nArray == null) break block39;
                                        if (iIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl2.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(block2)) break block40;
                                    }
                                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                        throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                    }
                                    bl2 = bl8;
                                    if (nArray == null) break block41;
                                }
                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                    throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                                }
                                if (bl2) break block40;
                            }
                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                            }
                            bl2 = false;
                        }
                        return bl2;
                    }
                    iIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl2 = param1;
                }
                ClientLevel clientLevel = iIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.level;
                Intrinsics.checkNotNull((Object)clientLevel);
                Block block = clientLevel.getBlockState(blockPos2.offset(0, 2, 0)).getBlock();
                Intrinsics.checkNotNullExpressionValue((Object)block, (String)"getBlock(...)");
                object2 = block;
                boolean bl9 = ((Block)object2).defaultBlockState().isAir();
                try {
                    try {
                        try {
                            try {
                                bl = param1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(object2);
                                if (nArray == null) break block42;
                                if (bl) break block43;
                            }
                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                            }
                            bl = bl9;
                            if (nArray == null) break block42;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                        }
                        if (bl) break block43;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                    }
                    return false;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.a(noWhenBranchMatchedException);
                }
            }
            param2.add(new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(blockPos2, param5 + param1.a(blockPos2)));
            bl = true;
        }
        return bl;
   }

   public static void b(int[] var0) {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var0;
   }

   public static int[] d() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { String[] var5 = null; // PX-FIX hoist
        
      char[] var21 = null; // PX-FIX
   pxClinit: {
       var5 = new String[26];
      int[] var10000 = new int[1];
      int var3 = 0;
      String var2 = "qýÚÔ¶\u008b.Ã\u00046\u008eÜ_\u000b¸5.Ô!áø\u0098_\u000b\u0082\u0003ñ\u0084î\txÞ\tÍU\u007f\u0094Z\u0013\u000bU\bY\u008fÚõ+©\u0007ç¢\rÆiú\râÖãC\u0018\u009d«]¥\bØÐ\u008d\tï\u0098?\u009d\u0007«1Ò1\u001fL`\u0004Áw>¾\u0004´ú\u0090\f\u0017\u0015Ç7v§Ý K\u0006¤Ð\rG¬ìO$>â²@)¢\r ¤è·\u009e¬Ìmpb¦¢\u0004\r\u0010Îþú\\\u0005\u0094X{ÄÇv(\bnS9\u0001Ê1¡\u0094\tnöËÈ\rß\u009fNr\u0010ª`w'QåÀ°Ïå\u0094°g(Y\u0084\r£\u008bVQw]Q2N³a\u0098ü\nøÀ¾ÐÔÁ@K\u008ev\nÓ\"Û\u008cxJÕ:<X\u0011\u0098\u0013\u008a[\u009d\u0000gëîÉ\u009f\u009b¬)Äi¬\n\u0005Õ×òG!Y\u0003\u0092\u0080\u0010©î\u0019,g\u0018\u008eÜôÓ\u001f\u0091=}0è\u0004Åy&&";
      int var4 = "qýÚÔ¶\u008b.Ã\u00046\u008eÜ_\u000b¸5.Ô!áø\u0098_\u000b\u0082\u0003ñ\u0084î\txÞ\tÍU\u007f\u0094Z\u0013\u000bU\bY\u008fÚõ+©\u0007ç¢\rÆiú\râÖãC\u0018\u009d«]¥\bØÐ\u008d\tï\u0098?\u009d\u0007«1Ò1\u001fL`\u0004Áw>¾\u0004´ú\u0090\f\u0017\u0015Ç7v§Ý K\u0006¤Ð\rG¬ìO$>â²@)¢\r ¤è·\u009e¬Ìmpb¦¢\u0004\r\u0010Îþú\\\u0005\u0094X{ÄÇv(\bnS9\u0001Ê1¡\u0094\tnöËÈ\rß\u009fNr\u0010ª`w'QåÀ°Ïå\u0094°g(Y\u0084\r£\u008bVQw]Q2N³a\u0098ü\nøÀ¾ÐÔÁ@K\u008ev\nÓ\"Û\u008cxJÕ:<X\u0011\u0098\u0013\u008a[\u009d\u0000gëîÉ\u009f\u009b¬)Äi¬\n\u0005Õ×òG!Y\u0003\u0092\u0080\u0010©î\u0019,g\u0018\u008eÜôÓ\u001f\u0091=}0è\u0004Åy&&"
         .length();
      char var1 = '\b';
      int var8 = -1;
      b(var10000);

      label52:
      while (true) {
         byte var9 = 89;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var9;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               } else {
                  var28 = var9;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 103;
                     case 1 -> 28;
                     case 2 -> 67;
                     case 3 -> 90;
                     case 4 -> 49;
                     case 5 -> 43;
                     default -> 105;
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
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[26];
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "yE\u0004Èvp\u0000¸R\u001d1\u000f?¾ë~\u00ad\u001fÛèÃ[\u008c5°\u0086\u009d";
                  var4 = "yE\u0004Èvp\u0000¸R\u001d1\u000f?¾ë~\u00ad\u001fÛèÃ[\u008c5°\u0086\u009d".length();
                  var1 = 11;
                  var8 = -1;
            }

            var9 = 73;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
      int var2 = (var0 ^ 6963) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 154;
            case 1 -> 25;
            case 2 -> 227;
            case 3 -> 172;
            case 4 -> 204;
            case 5 -> 41;
            case 6 -> 237;
            case 7 -> 4;
            case 8 -> 8;
            case 9 -> 40;
            case 10 -> 246;
            case 11 -> 144;
            case 12 -> 210;
            case 13 -> 62;
            case 14 -> 20;
            case 15 -> 151;
            case 16 -> 49;
            case 17 -> 206;
            case 18 -> 181;
            case 19 -> 71;
            case 20 -> 197;
            case 21 -> 203;
            case 22 -> 55;
            case 23 -> 139;
            case 24 -> 132;
            case 25 -> 202;
            case 26 -> 66;
            case 27 -> 23;
            case 28 -> 183;
            case 29 -> 94;
            case 30 -> 188;
            case 31 -> 250;
            case 32 -> 173;
            case 33 -> 74;
            case 34 -> 201;
            case 35 -> 244;
            case 36 -> 223;
            case 37 -> 243;
            case 38 -> 141;
            case 39 -> 193;
            case 40 -> 31;
            case 41 -> 247;
            case 42 -> 76;
            case 43 -> 29;
            case 44 -> 30;
            case 45 -> 26;
            case 46 -> 65;
            case 47 -> 95;
            case 48 -> 11;
            case 49 -> 131;
            case 50 -> 102;
            case 51 -> 96;
            case 52 -> 92;
            case 53 -> 114;
            case 54 -> 251;
            case 55 -> 107;
            case 56 -> 148;
            case 57 -> 91;
            case 58 -> 186;
            case 59 -> 149;
            case 60 -> 179;
            case 61 -> 75;
            case 62 -> 42;
            case 63 -> 252;
            case 64 -> 238;
            case 65 -> 60;
            case 66 -> 211;
            case 67 -> 61;
            case 68 -> 254;
            case 69 -> 111;
            case 70 -> 104;
            case 71 -> 198;
            case 72 -> 160;
            case 73 -> 130;
            case 74 -> 56;
            case 75 -> 93;
            case 76 -> 24;
            case 77 -> 64;
            case 78 -> 53;
            case 79 -> 28;
            case 80 -> 207;
            case 81 -> 184;
            case 82 -> 116;
            case 83 -> 10;
            case 84 -> 68;
            case 85 -> 180;
            case 86 -> 7;
            case 87 -> 78;
            case 88 -> 3;
            case 89 -> 138;
            case 90 -> 168;
            case 91 -> 82;
            case 92 -> 233;
            case 93 -> 48;
            case 94 -> 232;
            case 95 -> 17;
            case 96 -> 70;
            case 97 -> 67;
            case 98 -> 189;
            case 99 -> 22;
            case 100 -> 108;
            case 101 -> 134;
            case 102 -> 6;
            case 103 -> 128;
            case 104 -> 248;
            case 105 -> 109;
            case 106 -> 234;
            case 107 -> 121;
            case 108 -> 145;
            case 109 -> 63;
            case 110 -> 89;
            case 111 -> 106;
            case 112 -> 2;
            case 113 -> 133;
            case 114 -> 178;
            case 115 -> 38;
            case 116 -> 182;
            case 117 -> 14;
            case 118 -> 86;
            case 119 -> 59;
            case 120 -> 175;
            case 121 -> 164;
            case 122 -> 120;
            case 123 -> 240;
            case 124 -> 171;
            case 125 -> 219;
            case 126 -> 118;
            case 127 -> 140;
            case 128 -> 176;
            case 129 -> 150;
            case 130 -> 122;
            case 131 -> 54;
            case 132 -> 45;
            case 133 -> 88;
            case 134 -> 43;
            case 135 -> 19;
            case 136 -> 123;
            case 137 -> 69;
            case 138 -> 34;
            case 139 -> 44;
            case 140 -> 79;
            case 141 -> 129;
            case 142 -> 21;
            case 143 -> 185;
            case 144 -> 225;
            case 145 -> 5;
            case 146 -> 81;
            case 147 -> 249;
            case 148 -> 221;
            case 149 -> 0;
            case 150 -> 112;
            case 151 -> 239;
            case 152 -> 33;
            case 153 -> 101;
            case 154 -> 13;
            case 155 -> 117;
            case 156 -> 73;
            case 157 -> 220;
            case 158 -> 32;
            case 159 -> 165;
            case 160 -> 100;
            case 161 -> 216;
            case 162 -> 105;
            case 163 -> 177;
            case 164 -> 12;
            case 165 -> 84;
            case 166 -> 200;
            case 167 -> 147;
            case 168 -> 9;
            case 169 -> 217;
            case 170 -> 110;
            case 171 -> 97;
            case 172 -> 15;
            case 173 -> 113;
            case 174 -> 199;
            case 175 -> 224;
            case 176 -> 27;
            case 177 -> 46;
            case 178 -> 77;
            case 179 -> 136;
            case 180 -> 229;
            case 181 -> 142;
            case 182 -> 85;
            case 183 -> 167;
            case 184 -> 212;
            case 185 -> 214;
            case 186 -> 226;
            case 187 -> 152;
            case 188 -> 208;
            case 189 -> 1;
            case 190 -> 143;
            case 191 -> 137;
            case 192 -> 174;
            case 193 -> 50;
            case 194 -> 170;
            case 195 -> 162;
            case 196 -> 103;
            case 197 -> 47;
            case 198 -> 155;
            case 199 -> 213;
            case 200 -> 37;
            case 201 -> 18;
            case 202 -> 163;
            case 203 -> 187;
            case 204 -> 159;
            case 205 -> 228;
            case 206 -> 83;
            case 207 -> 39;
            case 208 -> 157;
            case 209 -> 87;
            case 210 -> 215;
            case 211 -> 52;
            case 212 -> 192;
            case 213 -> 57;
            case 214 -> 235;
            case 215 -> 36;
            case 216 -> 146;
            case 217 -> 236;
            case 218 -> 158;
            case 219 -> 205;
            case 220 -> 161;
            case 221 -> 35;
            case 222 -> 115;
            case 223 -> 58;
            case 224 -> 72;
            case 225 -> 253;
            case 226 -> 156;
            case 227 -> 194;
            case 228 -> 124;
            case 229 -> 127;
            case 230 -> 135;
            case 231 -> 153;
            case 232 -> 16;
            case 233 -> 245;
            case 234 -> 242;
            case 235 -> 190;
            case 236 -> 90;
            case 237 -> 99;
            case 238 -> 119;
            case 239 -> 241;
            case 240 -> 191;
            case 241 -> 51;
            case 242 -> 166;
            case 243 -> 126;
            case 244 -> 195;
            case 245 -> 255;
            case 246 -> 209;
            case 247 -> 231;
            case 248 -> 218;
            case 249 -> 169;
            case 250 -> 80;
            case 251 -> 196;
            case 252 -> 98;
            case 253 -> 222;
            case 254 -> 125;
            default -> 230;
         };
          var5 = (var1 & 0xFF) - var4;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(int var1, int var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         int var1, int var2
      ) {
         return new IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -19748;
         short var10003 = 26072;
         var10003 = -19747;
         short var10004 = -23931;
         return "Offset(x="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", z="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 == null) {
               return (boolean)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0);
            }

            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
        
   pxClinit: {
          var5 = new String[2];
         int var3 = 0;
         String var2 = "a\u0099ð^\u009aÊ3\u00952\u0004sÜ¡6";
         int var4 = "a\u0099ð^\u009aÊ3\u00952\u0004sÜ¡6".length();
         char var1 = '\t';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 65;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 65;
                  var10006 = var6;
               } else {
                  var13 = 65;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 65;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 98;
                     case 1 -> 36;
                     case 2 -> 57;
                     case 3 -> 89;
                     case 4 -> 5;
                     case 5 -> 42;
                     default -> 72;
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

      private static String b(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
         int var2 = (var0 ^ -19748) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 96;
               case 1 -> 121;
               case 2 -> 14;
               case 3 -> 210;
               case 4 -> 68;
               case 5 -> 191;
               case 6 -> 228;
               case 7 -> 73;
               case 8 -> 141;
               case 9 -> 224;
               case 10 -> 254;
               case 11 -> 245;
               case 12 -> 242;
               case 13 -> 211;
               case 14 -> 120;
               case 15 -> 227;
               case 16 -> 81;
               case 17 -> 190;
               case 18 -> 200;
               case 19 -> 75;
               case 20 -> 142;
               case 21 -> 29;
               case 22 -> 209;
               case 23 -> 131;
               case 24 -> 109;
               case 25 -> 250;
               case 26 -> 202;
               case 27 -> 236;
               case 28 -> 127;
               case 29 -> 187;
               case 30 -> 155;
               case 31 -> 218;
               case 32 -> 48;
               case 33 -> 166;
               case 34 -> 230;
               case 35 -> 255;
               case 36 -> 103;
               case 37 -> 252;
               case 38 -> 168;
               case 39 -> 16;
               case 40 -> 207;
               case 41 -> 1;
               case 42 -> 189;
               case 43 -> 102;
               case 44 -> 143;
               case 45 -> 87;
               case 46 -> 136;
               case 47 -> 158;
               case 48 -> 214;
               case 49 -> 113;
               case 50 -> 199;
               case 51 -> 67;
               case 52 -> 201;
               case 53 -> 46;
               case 54 -> 197;
               case 55 -> 144;
               case 56 -> 164;
               case 57 -> 124;
               case 58 -> 50;
               case 59 -> 91;
               case 60 -> 194;
               case 61 -> 111;
               case 62 -> 39;
               case 63 -> 248;
               case 64 -> 3;
               case 65 -> 63;
               case 66 -> 203;
               case 67 -> 247;
               case 68 -> 11;
               case 69 -> 20;
               case 70 -> 66;
               case 71 -> 62;
               case 72 -> 226;
               case 73 -> 183;
               case 74 -> 36;
               case 75 -> 30;
               case 76 -> 0;
               case 77 -> 49;
               case 78 -> 35;
               case 79 -> 232;
               case 80 -> 9;
               case 81 -> 119;
               case 82 -> 2;
               case 83 -> 44;
               case 84 -> 208;
               case 85 -> 19;
               case 86 -> 162;
               case 87 -> 74;
               case 88 -> 243;
               case 89 -> 98;
               case 90 -> 82;
               case 91 -> 132;
               case 92 -> 160;
               case 93 -> 40;
               case 94 -> 126;
               case 95 -> 78;
               case 96 -> 237;
               case 97 -> 15;
               case 98 -> 137;
               case 99 -> 130;
               case 100 -> 115;
               case 101 -> 246;
               case 102 -> 253;
               case 103 -> 238;
               case 104 -> 84;
               case 105 -> 76;
               case 106 -> 112;
               case 107 -> 231;
               case 108 -> 184;
               case 109 -> 135;
               case 110 -> 225;
               case 111 -> 133;
               case 112 -> 129;
               case 113 -> 159;
               case 114 -> 110;
               case 115 -> 215;
               case 116 -> 105;
               case 117 -> 213;
               case 118 -> 177;
               case 119 -> 41;
               case 120 -> 86;
               case 121 -> 134;
               case 122 -> 52;
               case 123 -> 95;
               case 124 -> 53;
               case 125 -> 55;
               case 126 -> 60;
               case 127 -> 116;
               case 128 -> 170;
               case 129 -> 23;
               case 130 -> 64;
               case 131 -> 88;
               case 132 -> 5;
               case 133 -> 108;
               case 134 -> 217;
               case 135 -> 138;
               case 136 -> 83;
               case 137 -> 212;
               case 138 -> 150;
               case 139 -> 196;
               case 140 -> 12;
               case 141 -> 79;
               case 142 -> 65;
               case 143 -> 178;
               case 144 -> 17;
               case 145 -> 45;
               case 146 -> 118;
               case 147 -> 77;
               case 148 -> 58;
               case 149 -> 18;
               case 150 -> 22;
               case 151 -> 47;
               case 152 -> 165;
               case 153 -> 174;
               case 154 -> 153;
               case 155 -> 8;
               case 156 -> 206;
               case 157 -> 249;
               case 158 -> 145;
               case 159 -> 195;
               case 160 -> 117;
               case 161 -> 123;
               case 162 -> 171;
               case 163 -> 176;
               case 164 -> 27;
               case 165 -> 26;
               case 166 -> 220;
               case 167 -> 222;
               case 168 -> 179;
               case 169 -> 10;
               case 170 -> 99;
               case 171 -> 42;
               case 172 -> 33;
               case 173 -> 198;
               case 174 -> 4;
               case 175 -> 24;
               case 176 -> 90;
               case 177 -> 25;
               case 178 -> 204;
               case 179 -> 161;
               case 180 -> 186;
               case 181 -> 205;
               case 182 -> 57;
               case 183 -> 28;
               case 184 -> 6;
               case 185 -> 167;
               case 186 -> 244;
               case 187 -> 139;
               case 188 -> 71;
               case 189 -> 147;
               case 190 -> 92;
               case 191 -> 149;
               case 192 -> 157;
               case 193 -> 69;
               case 194 -> 188;
               case 195 -> 172;
               case 196 -> 34;
               case 197 -> 240;
               case 198 -> 152;
               case 199 -> 114;
               case 200 -> 101;
               case 201 -> 93;
               case 202 -> 43;
               case 203 -> 89;
               case 204 -> 234;
               case 205 -> 51;
               case 206 -> 181;
               case 207 -> 251;
               case 208 -> 229;
               case 209 -> 125;
               case 210 -> 235;
               case 211 -> 216;
               case 212 -> 97;
               case 213 -> 122;
               case 214 -> 233;
               case 215 -> 219;
               case 216 -> 175;
               case 217 -> 80;
               case 218 -> 180;
               case 219 -> 154;
               case 220 -> 37;
               case 221 -> 173;
               case 222 -> 163;
               case 223 -> 100;
               case 224 -> 104;
               case 225 -> 38;
               case 226 -> 151;
               case 227 -> 59;
               case 228 -> 140;
               case 229 -> 241;
               case 230 -> 7;
               case 231 -> 94;
               case 232 -> 72;
               case 233 -> 107;
               case 234 -> 32;
               case 235 -> 169;
               case 236 -> 223;
               case 237 -> 193;
               case 238 -> 128;
               case 239 -> 54;
               case 240 -> 13;
               case 241 -> 61;
               case 242 -> 185;
               case 243 -> 85;
               case 244 -> 156;
               case 245 -> 182;
               case 246 -> 239;
               case 247 -> 21;
               case 248 -> 192;
               case 249 -> 148;
               case 250 -> 56;
               case 251 -> 106;
               case 252 -> 31;
               case 253 -> 146;
               case 254 -> 221;
               default -> 70;
            };
             var5 = (var1 & 0xFF) - var4;
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
   
    public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0, int var1, int var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        return var0.a(var1, var2);
    }}

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
           this((BlockPos)null, 0.0); // PX-FIX: 委托主构造器（final 字段初始化）
        }

      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @Nullable
      private static BlockPos IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String a;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull BlockPos var1, double var2) {
         Intrinsics.checkNotNullParameter(var1, a);
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final void a(double var1) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      }

      public final double d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final void b(double var1) {
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
      }

      public final double e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void c(double var1) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final BlockPos f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final void a(@Nullable BlockPos var1) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         char[] var10003 = ".:\u0018".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 69;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 69;
            var10006 = var0;
         } else {
            var6 = 69;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 69;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 27;
               case 1 -> 16;
               case 2 -> 46;
               case 3 -> 62;
               case 4 -> 8;
               case 5 -> 65;
               default -> 49;
            });
            var0++;
            if (var6 == 0) {
               var10006 = var6;
               var10005 = var10002;
               var10 = var6;
            } else {
               if (var1 <= var0) {
                  String var8 = new String(var10002).intern();
                  byte var3 = -1;
                  a = var8;
                  break pxClinit;
               }

               var10005 = var10002;
               var10 = var6;
               var10006 = var0;
            }
         }
      }
}
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final ArrayList<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new ArrayList<>();
      @NotNull
      private final HashMap<BlockPos, Integer> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new HashMap<>();
      private static String[] a;
      private static String[] b;

      @Nullable
      public final IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull BlockPos var1
      ) {
         int[] var10000 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
         short var10002 = -5259;
         short var10003 = -25604;
         Intrinsics.checkNotNullParameter(var1, "nodePos");
         int[] var2 = var10000;
         if (var2 != null) {
            Integer var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
            if (var4 != null) {
               int var3 = var4;
               return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var3);
            }
         }

         return null;
      }

      public final void a(
         @NotNull IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
      ) {
         short var10001 = -5262;
         short var10002 = -25902;
         Intrinsics.checkNotNullParameter(var1, "node");
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.add(var1);
         int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var1.a(), var2);
         this.a(var2);
      }

      @Nullable
      public final IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a() { short var5 = (short)0; // PX-FIX hoist
        
         int[] var1 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
         Object var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var1 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty()) {
               return null;
            }

            var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(0);
            short var10002 = -5263;
            short var10003 = -17663;
            Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
         }

         IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = (IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var2.a());
         var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var1 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() == 1) {
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.remove(0);
               return var2;
            }

            var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .remove(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1);
             var5 = -5257;
            short var6 = 2352;
            Intrinsics.checkNotNullExpressionValue(var10000, "removeAt(...)");
         }

         IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(0, var3);
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var3.a(), 0);
         this.b(0);
         return var2;
      }

      public final void b() {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.clear();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
      }

      public final boolean b(@NotNull BlockPos var1) {
         short var10001 = -5261;
         short var10002 = 8146;
         Intrinsics.checkNotNullParameter(var1, "pos");
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.containsKey(var1);
      }

      public final void b(
         @NotNull IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
      ) {
         Object var10000 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
         short var10002 = -5264;
         short var10003 = -11966;
         Intrinsics.checkNotNullParameter(var1, "node");
         Object var2 = var10000;
         Integer var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1.a());
         var10000 = var3;
         if (var2 != null) {
            if (var3 == null) {
               this.a(var1);
               return;
            }

            var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var3);
         }

         double var4 = ((IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000)
            .c();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var1);
         double var8;
         int var7 = (var8 = var1.c() - var4) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
         if (var2 != null) {
            if (var7 < 0) {
               this.a(var3);
               if (var2 != null) {
                  return;
               }
            }

            double var9;
            var7 = (var9 = var1.c() - var4) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
         }

         if (var7 > 0) {
            this.b(var3);
         }
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
      }

      public final boolean d() {
         int[] var1 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
         boolean var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty();
         if (var1 != null) {
            var10000 = !var10000;
         }

         return var10000;
      }

      private final void a(int var1) { int var5 = 0; // PX-FIX hoist
        
         Object var10000 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
         int var3 = var1;
         Object var2 = var10000;
         var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var1);
         short var10002 = -5258;
         short var10003 = -5987;
         Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
         IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = (IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;

         while (var3 > 0) {
             var5 = (var3 - 1) / 2;
            var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var5);
            var10002 = -5258;
            var10003 = -5987;
            Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
            IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6 = (IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
            double var12;
            int var9 = (var12 = var6.c() - var4.c()) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
            if (var2 != null) {
               if (var9 <= 0 && var2 != null) {
                  break;
               }

               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var6);
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var5, var4);
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var6.a(), var3);
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var4.a(), var5);
               var9 = var5;
            }

            var3 = var9;
            if (var2 == null) {
               break;
            }
         }
      }

      private final void b(int var1) { IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = null; // PX-FIX hoist
        
      int var13 = 0; // PX-FIX
      IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var11 = null; // PX-FIX
      int var10 = 0; // PX-FIX
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
         Object var10000 = IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.d();
         int var4 = var1;
         Object var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var1);
         short var10003 = -5258;
         short var10004 = -5987;
         Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
          var5 = (IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10001;
         Object var2 = var10000;

         do {
            int var8;
            label53: {
               label52: {
                  label51: {
                     label59: {
                        label60: {
                           label48: {
                              int var6 = 2 * var4 + 1;
                              int var7 = 2 * var4 + 2;
                              var8 = -1;
                              if (var6 < var3) {
                                 var8 = var6;
                                 var10 = var7;
                                 var13 = var3;
                                 if (var2 == null || var2 == null) {
                                    break label60;
                                 }

                                 if (var7 < var3) {
                                    double var15;
                                    var10 = (
                                             var15 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var7).c()
                                                - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var6).c()
                                          )
                                          == 0.0
                                       ? 0
                                       : (var15 < 0.0 ? -1 : 1);
                                    if (var2 == null) {
                                       break label48;
                                    }

                                    if (var10 < 0) {
                                       var8 = var7;
                                    }
                                 }
                              }

                              var10 = var8;
                           }

                           if (var2 == null) {
                              break label59;
                           }

                           var13 = -1;
                        }

                        if (var10 ==( ((var13 == 0)) ? 1 : 0)) {
                           break label51;
                        }

                        var11 = var5;
                        if (var2 == null) {
                           break label53;
                        }

                        double var16;
                        var10 = (var16 = var5.c() - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var8).c())
                              == 0.0
                           ? 0
                           : (var16 < 0.0 ? -1 : 1);
                     }

                     if (var10 > 0) {
                        break label52;
                     }
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var8);
               short var10002 = -5258;
               var10003 = -5987;
               Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
               var11 = (IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
            }

            IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = var11;
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var4, var9);
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var8, var5);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var9.a(), var4);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var5.a(), var8);
            var4 = var8;
         } while (var2 != null);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
          var5 = new String[7];
         int var3 = 0;
         String var2 = "¾\u0012\u0080\u0004ª\u0095È÷\b$\n!\u0002Å â\u001c\u0004¨X\u0088N\r\u0016NÉÍº½1À¡\u0096\u0095\"\u0093";
         int var4 = "¾\u0012\u0080\u0004ª\u0095È÷\b$\n!\u0002Å â\u001c\u0004¨X\u0088N\r\u0016NÉÍº½1À¡\u0096\u0095\"\u0093".length();
         char var1 = 3;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 80;
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
                        case 0 -> 90;
                        case 1 -> 60;
                        case 2 -> 75;
                        case 3 -> 127;
                        case 4 -> 6;
                        case 5 -> 86;
                        default -> 5;
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
                        b = new String[7];
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

                     var2 = "rC»{ÆßÒ£\u0007\u0087\u0081=%z±©";
                     var4 = "rC»{ÆßÒ£\u0007\u0087\u0081=%z±©".length();
                     var1 = '\b';
                     var8 = -1;
               }

               var10000 = 66;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
         int var2 = (var0 ^ -5261) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 205;
               case 1 -> 189;
               case 2 -> 58;
               case 3 -> 203;
               case 4 -> 187;
               case 5 -> 150;
               case 6 -> 242;
               case 7 -> 21;
               case 8 -> 47;
               case 9 -> 20;
               case 10 -> 116;
               case 11 -> 13;
               case 12 -> 123;
               case 13 -> 233;
               case 14 -> 46;
               case 15 -> 218;
               case 16 -> 38;
               case 17 -> 248;
               case 18 -> 59;
               case 19 -> 192;
               case 20 -> 51;
               case 21 -> 49;
               case 22 -> 107;
               case 23 -> 157;
               case 24 -> 26;
               case 25 -> 81;
               case 26 -> 27;
               case 27 -> 124;
               case 28 -> 194;
               case 29 -> 63;
               case 30 -> 103;
               case 31 -> 185;
               case 32 -> 34;
               case 33 -> 191;
               case 34 -> 253;
               case 35 -> 97;
               case 36 -> 69;
               case 37 -> 113;
               case 38 -> 161;
               case 39 -> 201;
               case 40 -> 93;
               case 41 -> 56;
               case 42 -> 134;
               case 43 -> 208;
               case 44 -> 128;
               case 45 -> 169;
               case 46 -> 184;
               case 47 -> 5;
               case 48 -> 152;
               case 49 -> 166;
               case 50 -> 100;
               case 51 -> 127;
               case 52 -> 111;
               case 53 -> 236;
               case 54 -> 50;
               case 55 -> 73;
               case 56 -> 225;
               case 57 -> 249;
               case 58 -> 176;
               case 59 -> 199;
               case 60 -> 106;
               case 61 -> 204;
               case 62 -> 254;
               case 63 -> 1;
               case 64 -> 105;
               case 65 -> 197;
               case 66 -> 228;
               case 67 -> 85;
               case 68 -> 119;
               case 69 -> 211;
               case 70 -> 57;
               case 71 -> 231;
               case 72 -> 158;
               case 73 -> 246;
               case 74 -> 142;
               case 75 -> 68;
               case 76 -> 101;
               case 77 -> 172;
               case 78 -> 155;
               case 79 -> 163;
               case 80 -> 209;
               case 81 -> 186;
               case 82 -> 188;
               case 83 -> 148;
               case 84 -> 151;
               case 85 -> 180;
               case 86 -> 102;
               case 87 -> 165;
               case 88 -> 22;
               case 89 -> 179;
               case 90 -> 66;
               case 91 -> 207;
               case 92 -> 226;
               case 93 -> 238;
               case 94 -> 223;
               case 95 -> 10;
               case 96 -> 227;
               case 97 -> 78;
               case 98 -> 45;
               case 99 -> 210;
               case 100 -> 52;
               case 101 -> 65;
               case 102 -> 86;
               case 103 -> 168;
               case 104 -> 19;
               case 105 -> 31;
               case 106 -> 144;
               case 107 -> 234;
               case 108 -> 137;
               case 109 -> 37;
               case 110 -> 175;
               case 111 -> 160;
               case 112 -> 72;
               case 113 -> 76;
               case 114 -> 215;
               case 115 -> 252;
               case 116 -> 133;
               case 117 -> 41;
               case 118 -> 43;
               case 119 -> 39;
               case 120 -> 7;
               case 121 -> 82;
               case 122 -> 196;
               case 123 -> 16;
               case 124 -> 30;
               case 125 -> 88;
               case 126 -> 115;
               case 127 -> 162;
               case 128 -> 117;
               case 129 -> 87;
               case 130 -> 9;
               case 131 -> 112;
               case 132 -> 224;
               case 133 -> 136;
               case 134 -> 190;
               case 135 -> 183;
               case 136 -> 132;
               case 137 -> 6;
               case 138 -> 138;
               case 139 -> 145;
               case 140 -> 122;
               case 141 -> 214;
               case 142 -> 108;
               case 143 -> 255;
               case 144 -> 229;
               case 145 -> 129;
               case 146 -> 241;
               case 147 -> 12;
               case 148 -> 67;
               case 149 -> 3;
               case 150 -> 217;
               case 151 -> 240;
               case 152 -> 237;
               case 153 -> 213;
               case 154 -> 104;
               case 155 -> 80;
               case 156 -> 121;
               case 157 -> 221;
               case 158 -> 156;
               case 159 -> 11;
               case 160 -> 4;
               case 161 -> 143;
               case 162 -> 118;
               case 163 -> 0;
               case 164 -> 212;
               case 165 -> 95;
               case 166 -> 120;
               case 167 -> 48;
               case 168 -> 164;
               case 169 -> 36;
               case 170 -> 71;
               case 171 -> 126;
               case 172 -> 177;
               case 173 -> 149;
               case 174 -> 29;
               case 175 -> 55;
               case 176 -> 89;
               case 177 -> 2;
               case 178 -> 109;
               case 179 -> 24;
               case 180 -> 14;
               case 181 -> 92;
               case 182 -> 17;
               case 183 -> 28;
               case 184 -> 154;
               case 185 -> 32;
               case 186 -> 54;
               case 187 -> 74;
               case 188 -> 159;
               case 189 -> 139;
               case 190 -> 60;
               case 191 -> 79;
               case 192 -> 243;
               case 193 -> 91;
               case 194 -> 110;
               case 195 -> 75;
               case 196 -> 25;
               case 197 -> 182;
               case 198 -> 42;
               case 199 -> 245;
               case 200 -> 147;
               case 201 -> 140;
               case 202 -> 250;
               case 203 -> 114;
               case 204 -> 202;
               case 205 -> 70;
               case 206 -> 181;
               case 207 -> 251;
               case 208 -> 90;
               case 209 -> 247;
               case 210 -> 83;
               case 211 -> 230;
               case 212 -> 33;
               case 213 -> 244;
               case 214 -> 141;
               case 215 -> 178;
               case 216 -> 220;
               case 217 -> 8;
               case 218 -> 170;
               case 219 -> 198;
               case 220 -> 193;
               case 221 -> 195;
               case 222 -> 94;
               case 223 -> 146;
               case 224 -> 53;
               case 225 -> 174;
               case 226 -> 239;
               case 227 -> 153;
               case 228 -> 235;
               case 229 -> 130;
               case 230 -> 98;
               case 231 -> 171;
               case 232 -> 18;
               case 233 -> 44;
               case 234 -> 219;
               case 235 -> 96;
               case 236 -> 77;
               case 237 -> 23;
               case 238 -> 173;
               case 239 -> 222;
               case 240 -> 62;
               case 241 -> 125;
               case 242 -> 131;
               case 243 -> 15;
               case 244 -> 206;
               case 245 -> 167;
               case 246 -> 40;
               case 247 -> 35;
               case 248 -> 232;
               case 249 -> 135;
               case 250 -> 64;
               case 251 -> 216;
               case 252 -> 200;
               case 253 -> 99;
               case 254 -> 61;
               default -> 84;
            };
             var5 = (var1 & 0xFF) - var4;
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

   public static enum llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

      private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = {IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII};

      public static IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] a() {
         return (IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clone();
      }

      public static IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
         String var0
      ) {
         return Enum.valueOf(
            IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> b() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = kotlin.enums.EnumEntriesKt.enumEntries(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
   

  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] c() { return new me.octo.client.IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII }; }
}

   public static final ArrayList a(
      IIIIIIIIlIlIIIllIlllIIIIlIIIIllIIllIlIIlIIllIlIlIllIIIllIlllIllIlIIlllIIIlIIIIIlllIIl var0,
      @NotNull BlockPos var1, ArrayList var2, boolean var3, int var4, Object var5
   ) {
      int[] var6 = d();
      if ((var4 & 2) != 0) {
         if (var6 != null) {
            throw a(new NoWhenBranchMatchedException());
         }

         var2 = new ArrayList();
      }

      if ((var4 & 4) != 0) {
         if (var6 != null) {
            throw a(new NoWhenBranchMatchedException());
         }

         var3 = false;
      }

      return var0.a(var1, var2, var3);
   }
}
