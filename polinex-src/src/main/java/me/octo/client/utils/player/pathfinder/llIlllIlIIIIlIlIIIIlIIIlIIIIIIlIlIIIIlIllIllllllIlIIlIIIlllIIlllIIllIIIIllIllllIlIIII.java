package me.octo.client.utils.player.pathfinder;

import it.unimi.dsi.fastutil.objects.Object2DoubleOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII {
   public llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
      HashMap<BlockPos, ArrayList<BlockPos>> var1, HashMap<BlockPos, ArrayList<BlockPos>> var2, int var3, kotlin.jvm.internal.DefaultConstructorMarker var4
   ) {
      if ((var3 & 1) != 0) {
         var1 = new HashMap<BlockPos, ArrayList<BlockPos>>();
      }
      if ((var3 & 2) != 0) {
         var2 = new HashMap<BlockPos, ArrayList<BlockPos>>();
      }
      this(var1, var2);
   }

   public static ArrayList a(llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var0, Object var1, boolean var2, double var3, boolean var5, int var6, Object var7) {
      if ((var6 & 2) != 0) {
         var2 = false;
      }
      if ((var6 & 4) != 0) {
         var3 = 1.0;
      }
      if ((var6 & 8) != 0) {
         var5 = false;
      }
      return var0.a(var1, var2, var3, var5);
   }

   public static final List c() {
      return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   }


   @NotNull
   public static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final HashMap<BlockPos, ArrayList<BlockPos>> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final HashMap<BlockPos, ArrayList<BlockPos>> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final Minecraft lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final HashMap<Byte, Double> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final Object2ObjectOpenHashMap<BlockPos, Byte> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final Object2ObjectOpenHashMap<BlockPos, llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final Object2DoubleOpenHashMap<BlockPos> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final Object2DoubleOpenHashMap<BlockPos> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private final Object2ObjectOpenHashMap<BlockPos, Boolean> lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final Object2ObjectOpenHashMap<BlockPos, Boolean> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final Object2DoubleOpenHashMap<BlockPos> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private final double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private final double llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @Nullable
   private ArrayList<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   public static byte IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   public static byte llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   public static byte IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   public static byte lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   public static byte llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   public static byte lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   public static byte IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   public static byte IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   public static byte IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   public static byte llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   public static byte lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   public static byte IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   public static byte IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   public static byte lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   public static byte lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   public static byte IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   @NotNull
   private static List<Byte> IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private static String[] a;
   private static String[] b;

   public llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
      @NotNull HashMap<BlockPos, ArrayList<BlockPos>> var1, @NotNull HashMap<BlockPos, ArrayList<BlockPos>> var2
   ) { Minecraft var12 = null; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
      short var10001 = -31387;
       var10002 = -16407;
      Intrinsics.checkNotNullParameter(var1, "etherwarpNodes");
      var10001 = -31361;
      var10002 = 8862;
      Intrinsics.checkNotNullParameter(var2, "dropDownNodes");
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
       var12 = Minecraft.getInstance();
      short var10004 = -31374;
      short var10005 = 22541;
      Intrinsics.checkNotNullExpressionValue(var12, "getInstance(...)");
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var12;
      HashMap var4 = new HashMap();
      boolean var6 = false;
      var4.put((byte)0, 1.0);
      var4.put((byte)8, 1.0);
      var4.put((byte)12, 0.5);
      var4.put((byte)10, 1.0);
      int var3 = var10000;
      var4.put((byte)14, 0.0625);
      var4.put((byte)13, 1.0);
      var4.put((byte)6, 1.1);
      var4.put((byte)15, 0.0);
      var4.put((byte)7, 0.125);
      var4.put((byte)3, 0.25);
      var4.put((byte)1, 0.375);
      var4.put((byte)6, 0.5);
      var4.put((byte)5, 0.625);
      var4.put((byte)11, 0.75);
      var4.put((byte)4, 0.875);
      var4.put((byte)9, 1.0);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[] var9 = new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[]{
         new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            1, 0, 0
         ),
         new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            -1, 0, 0
         ),
         new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            0, 0, 1
         ),
         new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            0, 0, -1
         )
      };
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = CollectionsKt.listOf(var9);
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new Object2ObjectOpenHashMap();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new Object2ObjectOpenHashMap();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new Object2DoubleOpenHashMap();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new Object2DoubleOpenHashMap();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new Object2ObjectOpenHashMap();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new Object2ObjectOpenHashMap();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new Object2DoubleOpenHashMap();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 1.0;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 10.0;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.b(
            ++var3
         );
      }
   }

   private final ClientLevel a() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.level;
   }

   @Nullable
   public final ArrayList<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> b() {
      return this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   public final void a(
      @Nullable ArrayList<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> var1
   ) {
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var1;
   }

   @Nullable
   public final ArrayList<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> a(
      @Nullable Object var1, boolean var2, double var3, boolean var5
   ) { Double var42 = null; // PX-FIX hoist
         double var16 = 0.0; // PX-FIX hoist
         double var12 = 0.0; // PX-FIX hoist
         double var43 = 0.0; // PX-FIX hoist
         double var47 = 0.0; // PX-FIX hoist
         double var57 = 0.0; // PX-FIX hoist
         double var58 = 0.0; // PX-FIX hoist
         double var49;
         int var10002;
         int var44;
         int var46;
         int var48;
         int var50;
         int var56;
        
      int var6;
      BlockPos var40;
      label293: {
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.f();
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.f();
         var6 = var10000;
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = null;
         boolean var39 = var1 instanceof BlockPos;
         if (var6 != 0) {
            if (var39) {
               var40 = (BlockPos)var1;
               break label293;
            }

            var39 = var1 instanceof Entity;
         }

         var40 = var39 ? this.a((Entity)var1) : null;
      }

      if (var40 == null) {
         return null;
      } else {
         BlockPos var7 = var40;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b();
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.clear();
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.clear();
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.clear();
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.clear();
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
         double var8 = 0.07;
         double var10 = 1.0;
          var12 = 0.3;
         double var14 = 3.5;
          var16 = 21.0;
         if (var6 != 0) {
            LocalPlayer var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player;
            short var10003 = -31362;
            short var10004 = 10328;
            Intrinsics.checkNotNull(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player,
               "null cannot be cast to non-null type net.minecraft.world.entity.Entity"
            );
            var40 = this.a(var10001);
            if (var40 != null) {
               BlockPos var18;
               byte var19;
               label282: {
                  var18 = var40;
                  var19 = this.a(var18);
                  if (var6 != 0) {
                      var42 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(var19);
                     if (var42 != null) {
                        var43 = var42;
                        break label282;
                     }
                  }

                  var43 = 1.0;
               }

               double var20 = var43;
               llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var22 = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                  var18,
                  var19,
                  new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                     0, 0, 0
                  ),
                  var20
               );
               var22.b(a(this, var7, var22.a()));
               var22.c(0.0);
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a(var22);
               ((Map)this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl).put(var18, var22.g());

               label275:
               while (true) {
                  var44 = (int)(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.d() ? 1 : 0);

                  label272:
                  while (var44 != 0) {
                     var44 = ((java.util.function.Supplier<Integer>)(() -> { this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.a(300); return 0; })).get();

                     while (true) {
                        if (var6 == 0) {
                           break label275;
                        }

                        if (var44 != 0) {
                           break label272;
                        }

                        llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var23 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                           .a();
                        llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var45 = this;
                        if (var6 != 0) {
                           ((Map)this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII).put(var23.a(), var23);
                           if (Intrinsics.areEqual(var23.a(), var7)) {
                              ArrayList var37 = (ArrayList)CollectionsKt.toCollection(CollectionsKt.reversed(this.a(var23)), new ArrayList());
                              ArrayList var38 = this.a(var37, var3);
                              if (!var5) {
                                 this.a(true, var37.size());
                              }

                              return var38;
                           }

                           var45 = this;
                        }

                        Iterator var24 = var45.a(var23, var2).iterator();

                        while (true) {
                           if (!var24.hasNext()) {
                              continue label275;
                           }

                           llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var25 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var24.next();
                           double var26 = var25.d() - var23.d();
                           var44 = Math.abs(var25.c().a());
                           if (var6 == 0) {
                              break;
                           }

                           if (var6 == 0) {
                              continue label272;
                           }

                           label265:
                           if (var6 != 0) {
                              if (var44 <= 1) {
                                 var44 = Math.abs(var25.c().c());
                                 if (var6 == 0) {
                                    break label265;
                                 }

                                 if (var44 <= 1) {
                                    var44 = 0;
                                    break label265;
                                 }
                              }

                              var44 = 1;
                           }

                           int var28;
                           var28 = var44;
                           double var66;
                           var46 = (var66 = var26 - 1.0) == 0.0 ? 0 : (var66 < 0.0 ? -1 : 1);
                           label257:
                           if (var6 != 0) {
                              if (var46 > 0) {
                                 var46 = var28;
                                 if (var6 == 0) {
                                    break label257;
                                 }

                                 if (var28 == 0 && var6 != 0) {
                                    continue;
                                 }
                              }

                              var46 = Math.abs(var25.c().a());
                           }

                           label250: {
                              label249:
                              if (var6 != 0) {
                                 if (var46 == 1) {
                                    var46 = Math.abs(var25.c().c());
                                    if (var6 == 0) {
                                       break label249;
                                    }

                                    if (var46 == 1) {
                                       var47 = 1.4;
                                       break label250;
                                    }
                                 }

                                 var46 = var28;
                              }

                              var47 = var46 != 0 ? this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl : 1.0;
                           }

                           double var31;
                           BlockPos var33;
                           label240: {
                              label301: {
                                 byte var34;
                                 me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var35;
                                 label302: {
                                    label303: {
                                       label236: {
                                          double var29 = var47;
                                          var31 = var23.g() + var29 + a(this, var8, var10, var25);
                                          var33 = var25.a();
                                          var34 = var25.b();
                                          var35 = var25.c();
                                          if (var6 != 0) {
                                             if (var23.b() != 13) {
                                                var48 = var28;
                                                if (var6 == 0) {
                                                   break label303;
                                                }

                                                if (var28 == 0) {
                                                   break label236;
                                                }
                                             }

                                             var31 += 2.0;
                                          }

                                          if (var6 != 0) {
                                             break label301;
                                          }
                                       }

                                       var49 = Math.abs(var26);
                                       if (var6 == 0) {
                                          break label302;
                                       }

                                       double var67;
                                        var48 = (var67 = var49 - 0.5625) == 0.0 ? 0 : (var67 < 0.0 ? -1 : 1);
                                    }

                                    if (var48 <= 0) {
                                       var50 = var34;
                                       label221:
                                       if (var6 != 0) {
                                          if (var34 == 12) {
                                             BlockPos var55 = var33.offset(var35.a(), -1, var35.c());
                                             var10003 = -31373;
                                             var10004 = 17128;
                                             Intrinsics.checkNotNullExpressionValue(var55, "offset(...)");
                                             var50 = this.a(var55);
                                             if (var6 == 0) {
                                                break label221;
                                             }

                                             if (var50 == 0) {
                                                var31++;
                                             }
                                          }

                                          double var68;
                                          var50 = (var68 = Math.abs(var26) - 0.5625) == 0.0 ? 0 : (var68 < 0.0 ? -1 : 1);
                                       }

                                       if (var6 == 0) {
                                          break label240;
                                       }

                                       if (var50 >= 0) {
                                          break label301;
                                       }

                                       var31 += Math.abs(var26);
                                       if (var6 != 0) {
                                          break label301;
                                       }
                                    }

                                    var49 = var31;
                                 }

                                 label208: {
                                    double var62;
                                    label305: {
                                       label306: {
                                          var56 = var23.b();
                                          var10002 = 10;
                                          label205:
                                          if (var6 != 0) {
                                             if (var56 == 10) {
                                                var56 = var34;
                                                var10002 = 10;
                                                if (var6 == 0) {
                                                   break label205;
                                                }

                                                if (var34 == 10) {
                                                   var57 = var12;
                                                   break label208;
                                                }
                                             }

                                             var56 = var34;
                                             if (var6 == 0) {
                                                break label306;
                                             }

                                             var10002 = 10;
                                          }

                                          if (var56 == var10002) {
                                             BlockPos var61 = var33.offset(var35.a(), var35.b(), var35.c());
                                             var10004 = -31373;
                                             short var10005 = 17128;
                                             Intrinsics.checkNotNullExpressionValue(var61, "offset(...)");
                                             var56 = this.a(var61);
                                             if (var6 == 0) {
                                                break label306;
                                             }

                                             if (var56 == 10) {
                                                var57 = var12;
                                                break label208;
                                             }
                                          }

                                          var58 = var26;
                                          var62 = 0.0;
                                          if (var6 == 0) {
                                             break label305;
                                          }

                                          double var69;
                                          var56 = (var69 = var26 - 0.0) == 0.0 ? 0 : (var69 < 0.0 ? -1 : 1);
                                       }

                                       if (var56 >= 0) {
                                          var57 = var16;
                                          break label208;
                                       }

                                       var58 = Math.abs(var26);
                                       var62 = var14;
                                    }

                                    var57 = var58 * var62;
                                 }

                                 var31 = var49 + var57;
                              }

                              var50 = 0;
                           }

                           int var36;
                           label308: {
                              var36 = var50;
                              int var51 = ((this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b(var33)) ? 1 : 0);
                              if (var6 != 0) {
                                 if (var51 != 0) {
                                    Double var52 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var33);
                                    Intrinsics.checkNotNull(var52);
                                    double var70;
                                    int var53 = (var70 = var52 - var31) == 0.0 ? 0 : (var70 < 0.0 ? -1 : 1);
                                    if (var6 != 0) {
                                       if (var53 <= 0) {
                                          continue;
                                       }

                                       Double var59 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var33);
                                       Intrinsics.checkNotNull(var59);
                                       var25.b(var59);
                                       var53 = 1;
                                    }

                                    var36 = var53;
                                    if (var6 != 0) {
                                       break label308;
                                    }
                                 }

                                 var51 = ((((Map)this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII).containsKey(var33) ? 1 : 0));
                              }

                              label172: {
                                 label309: {
                                    if (var6 != 0) {
                                       if (var51 == 0) {
                                          break label172;
                                       }

                                       Double var54 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var33);
                                       Intrinsics.checkNotNull(var54);
                                       if (var6 == 0) {
                                          break label309;
                                       }

                                       double var71;
                                       var51 = (var71 = var54 - var31) == 0.0 ? 0 : (var71 < 0.0 ? -1 : 1);
                                    }

                                    if (var51 <= 0) {
                                       continue;
                                    }

                                    this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.remove(var33);
                                 }

                                 Double var60 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var33);
                                 Intrinsics.checkNotNull(var60);
                                 var25.b(var60);
                                 if (var6 != 0) {
                                    break label308;
                                 }
                              }

                              var25.b(a(this, var7, var33));
                           }

                           var25.c(var31);
                           var25.a(var23.a());
                           ((Map)this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl).put(var33, var31);
                           if (var6 != 0) {
                              if (var36 != 0) {
                                 this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.b(var25);
                                 if (var6 != 0) {
                                    continue;
                                 }
                              }

                              this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.a(var25);
                           }

                           if (var6 == 0) {
                              break label272;
                           }
                        }
                     }
                  }

                  var44 = (int)(var5 ? 1 : 0);
                  break;
               }

               if (var44 != 0) {
                  this.a(false, 0);
               }

               return null;
            }
         }

         return null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Nullable
   public final BlockPos a(@NotNull Entity var1) { int var5 = 0; // PX-FIX hoist
         Object var18 = null; // PX-FIX hoist
         boolean var16 = false; // PX-FIX hoist
         BlockPos var12 = null; // PX-FIX hoist
         boolean var11 = false; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
      short var10001 = -31376;
       var10002 = 32756;
      Intrinsics.checkNotNullParameter(var1, "entity");
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      ArrayList var3 = new ArrayList();
      BlockPos var4 = new BlockPos((int)Math.floor(var1.getX()), (int)Math.floor(var1.getY()), (int)Math.floor(var1.getZ()));
       var5 = -1;
      int var2 = var10000;

      label110:
      while (true) {
         var10000 = var5;

         label108:
         while (true) {
            if (var10000 >= 2) {
               break label110;
            }

            int var6 = -1;

            label105:
            while (true) {
               var10000 = var6;

               label103:
               while (true) {
                  if (var10000 >= 2) {
                     break label105;
                  }

                  var10000 = -6;
                  if (var2 == 0) {
                     continue label108;
                  }

                  int var7 = -6;

                  while (var7 < 2) {
                     BlockPos var24 = var4.offset(var5, var7, var6);
                     var10002 = -31373;
                     short var10003 = 17128;
                     Intrinsics.checkNotNullExpressionValue(var24, "offset(...)");
                     BlockPos var8 = var24;
                     if (var2 != 0) {
                        var10000 = this.a(var8);
                        if (var2 == 0) {
                           continue label103;
                        }

                        label93:
                        if (var10000 != 0) {
                           BlockPos var29 = var8.offset(0, 1, 0);
                           var10003 = -31373;
                           short var10004 = 17128;
                           Intrinsics.checkNotNullExpressionValue(var29, "offset(...)");
                           boolean var25 = this.b(var29);
                           if (var2 != 0) {
                              if (!var25) {
                                 break label93;
                              }

                              BlockPos var30 = var8.offset(0, 2, 0);
                              var10003 = -31373;
                              var10004 = 17128;
                              Intrinsics.checkNotNullExpressionValue(var30, "offset(...)");
                              var25 = this.c(var30);
                           }

                           if (var2 != 0 && var25) {
                              var3.add(var8);
                           }
                        }

                        var7++;
                     }

                     if (var2 == 0) {
                        break;
                     }
                  }

                  var6++;
                  if (var2 == 0) {
                     break label105;
                  }
                  break;
               }
            }

            var5++;
            if (var2 == 0) {
               break label110;
            }
            break;
         }
      }

      Iterable var15 = var3;
       var16 = false;
      Iterator var17 = var15.iterator();
      Object var26 = var17;
      if (var2 != 0) {
         if (!var17.hasNext()) {
            return (BlockPos)null;
         }

         var26 = var17.next();
      }

       var18 = var26;
      Object var27 = var17;
      if (var2 != 0) {
         if (!var17.hasNext()) {
            return (BlockPos)var18;
         }

         var27 = var18;
      }

      BlockPos var9 = (BlockPos)var27;
       var11 = false;
      double var19 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var1),
            lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g(var9)
         );

      while (true) {
         Object var20 = var17.next();
          var12 = (BlockPos)var20;
         boolean var14 = false;
         double var21 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var1),
               lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g(var12)
            );
         if (Double.compare(var19, var21) > 0) {
            var18 = var20;
            var19 = var21;
         }

         while (!var17.hasNext()) {
            if (var2 != 0) {
               return (BlockPos)var18;
            }

            var19 = var21;
         }
      }
   }

   private final List<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> a(
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1,
      boolean var2
   ) { Iterator var43 = null; // PX-FIX hoist
         Iterator var41 = null; // PX-FIX hoist
         int var40 = 0; // PX-FIX hoist
         boolean var16 = false; // PX-FIX hoist
         boolean var11 = false; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
      int var3;
      BlockPos var4;
      ArrayList var5;
      ArrayList var38;
      label108: {
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         var4 = var1.a();
         var5 = new ArrayList();
         var3 = var10000;
         ArrayList var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1.a());
         if (var2) {
            var38 = var6;
            if (var3 != 0) {
               break label108;
            }

            label105:
            if (var6 != null) {
               Iterable var7 = var6;
               boolean var8 = false;
               var var10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var7, 10));
                var11 = false;

               for (Object var13 : var7) {
                  BlockPos var14 = (BlockPos)var13;
                  boolean var15 = false;
                  var10.add(
                     new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                        var14,
                        (byte)8,
                        new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                           var14.getX() - var1.a().getX(), var14.getY() - var1.a().getY(), var14.getZ() - var1.a().getZ()
                        ),
                        1.0
                     )
                  );
                  if (var3 != 0) {
                     break label105;
                  }

                  if (var3 != 0) {
                     break;
                  }
               }

               var5.addAll(var10);
            }
         }

         var38 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(var1.a());
      }

      ArrayList var19 = var38;
      var38 = var19;
      if (var3 == 0) {
         label80:
         if (var19 != null) {
            Iterable var20 = var19;
            boolean var9 = false;
            var var25 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var20, 10));
            boolean var28 = false;

            for (Object var34 : var20) {
               BlockPos var36 = (BlockPos)var34;
                var16 = false;
               var25.add(
                  new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                     var36,
                     (byte)8,
                     new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                        var36.getX() - var1.a().getX(), var36.getY() - var1.a().getY(), var36.getZ() - var1.a().getZ()
                     ),
                     1.0
                  )
               );
               if (var3 != 0) {
                  break label80;
               }

               if (var3 != 0) {
                  break;
               }
            }

            var5.addAll(var25);
         }

         var38 = new ArrayList();
      }

      ArrayList var21 = var38;
      ArrayList var22 = new ArrayList();
      Iterable var23 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      int var26 = 0;

      for (Object var32 : var23) {
         me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var35 = (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var32;
         boolean var37 = false;
         if (var3 == 0) {
            if (var3 == 0 && a(var4, this, var5, var35.a(), var35.c(), 1.0)) {
                var40 = var35.a();
               if (var3 == 0) {
                  if (var40 == 0) {
                     var22.add(var35.c());
                  } else {
                     var21.add(var35.a());
                  }
               }
            }

            if (var3 == 0) {
               continue;
            }
         }
         break;
      }

       var41 = var21.iterator();
       var10002 = -31383;
      short var10003 = 16443;
      Intrinsics.checkNotNullExpressionValue(var41, "iterator(...)");
      Iterator var24 = var41;

      label65:
      while (var24.hasNext()) {
         var38 = (ArrayList)var24.next();
         var10002 = -31379;
         var10003 = -11397;
         Intrinsics.checkNotNullExpressionValue(var38, "next(...)");
         var26 = ((Number)(Object)var38).intValue();

         label63:
         while (true) {
             var43 = var22.iterator();
            var10002 = -31383;
            var10003 = 16443;
            Intrinsics.checkNotNullExpressionValue(var43, "iterator(...)");
            Iterator var30 = var43;

            do {
               if (!var30.hasNext()) {
                  continue label65;
               }

               var38 = (ArrayList)var30.next();
               var10002 = -31379;
               var10003 = -11397;
               Intrinsics.checkNotNullExpressionValue(var38, "next(...)");
               int var33 = ((Number)(Object)var38).intValue();
               a(var4, this, var5, var26, var33, 1.4);
               if (var3 != 0) {
                  continue label63;
               }
            } while (var3 == 0 && var3 == 0);

            return var5;
         }
      }

      return var5;
   }

   private final void a(boolean var1, int var2) { short var5 = (short)0; // PX-FIX hoist
         short var13 = (short)0; // PX-FIX hoist
         short var12 = (short)0; // PX-FIX hoist
         short var11 = (short)0; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      long var10001 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.b();
       var10002 = -31377;
      short var10003 = 7301;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Total ms: " + var10001);
      var10001 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.b();
      var10002 = -31375;
      var10003 = 6358;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Ms finding: " + var10001);
      int var8 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.size();
      var10002 = -31388;
      var10003 = 23743;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Closed set size: " + var8);
      int var9 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.c();
      var10002 = -31364;
      var10003 = 26781;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Open set size: " + var9);
      int var10 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.size();
      var10002 = -31370;
      var10003 = 705;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Cached heuristic size: " + var10);
      int var3 = var10000;
       var11 = -31371;
      var10002 = -32059;
      String var4 = "Path size: " + var2;
      if (var3 == 0) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var4);
         if (var1) {
             var5 = -31368;
             var12 = -14177;
            var4 = "SUCCESS";
         } else {
            short var6 = -31382;
             var13 = -1376;
            var4 = "FAIL";
         }
      }

      short var14 = -31366;
      var10002 = -4190;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("RESULT: " + var4);
   }

   private final ArrayList<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> a(
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      ArrayList var3 = new ArrayList();
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4 = var1;
      int var2 = var10000;

      while (true) {
         if (var4 != null) {
            if (var2 == 0) {
               break;
            }

            var3.add(var4);
            var4 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               .get(var4.h());
            if (var2 != 0) {
               continue;
            }
         }

         break;
      }

      return var3;
   }

   private final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll b(
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      int var12;
      int var13;
      int var2;
      BlockPos var3;
      double var11;
      label48: {
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         var3 = var1.a();
         var2 = var10000;
         if (var2 == 0) {
            Double var10 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(var1.b());
            if (var10 != null) {
               var11 = var10;
               break label48;
            }
         }

         var11 = 1.0;
      }

      double var4;
      var4 = var11;
      var12 = Math.abs(var1.c().a());
      label42:
      if (var2 == 0) {
         if (var12 <= 1) {
            var12 = Math.abs(var1.c().c());
            if (var2 != 0) {
               break label42;
            }

            if (var12 <= 1) {
               var12 = 0;
               break label42;
            }
         }

         var12 = 1;
      }

      int var6;
      label34: {
         label51: {
            var6 = var12;
            double var7 = var1.d() - (var1.a().getY() + var4 - var1.c().b());
            double var14;
            var13 = (var14 = var7 - 0.5625) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
            if (var2 == 0) {
               if (var13 <= 0) {
                  break label51;
               }

               var13 = var1.b();
            }

            if (var2 != 0) {
               break label34;
            }

            if (var13 != 10) {
               var13 = 1;
               break label34;
            }
         }

         var13 = 0;
      }

      int var9 = var13;
      return new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         var3.getX() + 0.5, var3.getY() + var4, var3.getZ() + 0.5, (var6 != 0), var1.a(), ((((((Boolean)(Object)((boolean)(Object)var9
        ? 1 : 0))) ? 1 : 0)!= 0)));
   }

   private final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll c(
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) { ClientLevel var5 = null; // PX-FIX hoist
        
      BlockPos var3;
      int var8;
      label18: {
         var8 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         var3 = var1.a();
         int var2 = var8;
         if (var2 == 0) {
             var5 = this.a();
            if (var5 != null) {
               BlockState var6 = var5.getBlockState(var3);
               if (var6 != null) {
                  Integer var7 = var6.getValue(SnowLayerBlock.LAYERS);
                  if (var7 != null) {
                     var8 = var7;
                     break label18;
                  }
               }
            }
         }

         var8 = 1;
      }

      int var4 = var8;
      return new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         var3.getX() + 0.5, var3.getY() + (var4 - 1) * 0.125, var3.getZ() + 0.5, false, var1.a(), false
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final ArrayList<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> a(
      ArrayList<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var1,
      double var2
   ) { double var58 = 0.0; // PX-FIX hoist
         float var57 = 0.0f; // PX-FIX hoist
         ArrayList var5 = null; // PX-FIX hoist
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var42 = null; // PX-FIX hoist
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var49 = null; // PX-FIX hoist
         double var47 = 0.0; // PX-FIX hoist
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var46 = null; // PX-FIX hoist
         int var44 = 0; // PX-FIX hoist
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var43 = null; // PX-FIX hoist
          llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var74;
         int var40 = 0; // PX-FIX hoist
         int var34 = 0; // PX-FIX hoist
         double var31 = 0.0; // PX-FIX hoist
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var18 = null; // PX-FIX hoist
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var16 = null; // PX-FIX hoist
         Object var13 = null; // PX-FIX hoist
         Iterator var12 = null; // PX-FIX hoist
         int var11 = 0; // PX-FIX hoist
        
       var5 = new ArrayList();
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      Iterable var7 = var1;
      int var8 = 0;
      int var4 = var10000;
      var var10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var7, 10));
       var11 = 0;
       var12 = var7.iterator();

      while (true) {
         if (var12.hasNext()) {
             var13 = var12.next();
            llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var14 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var13;
            boolean var15 = false;
            if (var4 != 0) {
               break;
            }

            var10.add(IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.contains(var14.b()) ? this.c(var14) : this.b(var14));
            if (var4 == 0) {
               continue;
            }
         }

         break;
      }

      ArrayList var6 = (ArrayList)CollectionsKt.toCollection(var10, new ArrayList());
      ArrayList var63 = var6;
      if (var4 == 0) {
         if (var6.isEmpty()) {
            return var5;
         }

         var63 = new ArrayList();
      }

      ArrayList var36 = var63;
      var36.add(CollectionsKt.first(var6));
      var8 = 0;

      while (true) {
         if (var8 < var6.size() - 1) {
            int var9 = var8 + 1;
            lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var39 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(
                  ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var6.get(
                        var8
                     ))
                     .g(),
                  ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var6.get(
                        var9
                     ))
                     .g()
               );
            var11 = var8 + 2;
            var10000 = var6.size();
            if (var4 != 0) {
               break;
            }

             var44 = var10000;

            label232:
            do {
               var10000 = var11;

               do {
                  if (var10000 >= var44) {
                     break label232;
                  }

                  var10000 = ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var6.get(
                        var11
                     ))
                     .f() ? 1 : 0;
               } while (var4 != 0);

               label229: { Object var10002 = null; // PX-FIX hoist
        
                  label254: {
                     if (var4 == 0) {
                        if (var10000 != 0) {
                           break label254;
                        }

                        Object var10001 = var6.get(var8);
                        short var10003 = -31384;
                        short var10004 = -18251;
                        Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
                        var10001 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10001;
                         var10002 = var6.get(var11);
                        var10004 = -31380;
                        short var10005 = 13411;
                        Intrinsics.checkNotNullExpressionValue(var10002, "get(...)");
                        var10000 = ((a(
                           this,
                           (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10001,
                           (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10002
                        )) ? 1 : 0);
                     }

                     if (var4 == 0) {
                        if (var10000 == 0) {
                           break label254;
                        }

                        var10000 = var11;
                     }

                     var9 = var10000;
                     if (var4 == 0) {
                        break label229;
                     }
                  }

                  if (var4 == 0) {
                     break;
                  }
               }

               var11++;
            } while (var4 == 0);

            label205: {
               label255: {
                  Object var66 = var6.get(var9);
                  short var82 = -31380;
                  short var88 = 13411;
                  Intrinsics.checkNotNullExpressionValue(var66, "get(...)");
                  var42 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var66;
                  lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var45 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a(
                        ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var6.get(
                              var8
                           ))
                           .g(),
                        var42.g()
                     );
                   var47 = 0.2;
                  var10000 = var9;
                  if (var4 == 0) {
                     if (var9 >= var6.size() - 1) {
                        break label255;
                     }

                     float var95;
                     var10000 = (
                              var95 = Math.abs(
                                    me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a(var39, var45)
                                       .a()
                                 )
                                 - 40.0F
                           )
                           == 0.0F
                        ? 0
                        : (var95 < 0.0F ? -1 : 1);
                  }

                  if (var4 == 0) {
                     if (var10000 <= 0) {
                        break label255;
                     }

                     double var96;
                     var10000 = (var96 = var2 - 1.0) == 0.0 ? 0 : (var96 < 0.0 ? -1 : 1);
                  }

                  if (var10000 >= 0) {
                        Object var68 = var6.get(var8);
                        var82 = -31380;
                        var88 = 13411;
                        Intrinsics.checkNotNullExpressionValue(var68, "get(...)");
                         var49 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var68;
                         var16 = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                              (Double)(Double)(Double)var42.a() - var49.a(), 0.0, ((Double)var42.c()) - var49.c(), false, null, false, 56, null
                           )
                           .i();
                        int var17 = var9 + 1;
                         var18 = var17
                              < var6.size()
                           ? new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                                 ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var6.get(
                                          var17
                                       ))
                                       .a()
                                    - (Double)var42.a(),
                                 0.0,
                                 ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var6.get(
                                          var17
                                       ))
                                       .c()
                                    - (Double)var42.c(),
                                 false,
                                 null,
                                 false,
                                 56,
                                 null
                              )
                              .i()
                           : var16;
                        llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var19 = var16.c(
                           var18
                        );
                        llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var20 = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                           -var16.c(), 0.0, var16.a(), false, null, false, 56, null
                        );
                         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var21 = var4 == 0 && var19.b() > 0.0
                            ? var42.b(var47).d(var20)
                            : var42.b(-var47).d(var20);
                     var36.add(var21);
                     break label205;
                  }
               }

               var36.add(var42);
            }

            var8 = var9;
            if (var4 == 0) {
               continue;
            }
         }

         var10000 = ((Intrinsics.areEqual(
            ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)CollectionsKt.last(
                  var36
               ))
               .e(),
            ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)CollectionsKt.last(
                  var6
               ))
               .e()
         )) ? 1 : 0);
         break;
      }

      if (var4 == 0) {
         if (var10000 == 0) {
            var36.add(CollectionsKt.last(var6));
         }

         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var36;
         var5.add(var36.get(0));
         var10000 = 0;
      }

      int var38 = var10000;
       var40 = var36.size() - 1;

      while (true) {
         if (var38 < var40) {
            Object var71 = var36.get(var38);
            short var84 = -31380;
            short var90 = 13411;
            Intrinsics.checkNotNullExpressionValue(var71, "get(...)");
             var43 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var71;
            Object var72 = var36.get(var38 + 1);
            var84 = -31380;
            var90 = 13411;
            Intrinsics.checkNotNullExpressionValue(var72, "get(...)");
             var46 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var72;
            int var73 = ((var43.d()) ? 1 : 0);
            if (var4 != 0) {
               break;
            }

            label174: {
               label258: {
                  label172: {
                     label171: {
                        if (var4 == 0) {
                           if ((var73 == 0)) {
                              var74 = var46;
                              if (var4 != 0) {
                                 break label172;
                              }

                              if (!var46.d()) {
                                 break label171;
                              }
                           }

                           var5.add(var43);
                        }

                        if (var4 == 0) {
                           break label258;
                        }
                     }

                     var74 = var43;
                  }

                  double var48;
                  label159: {
                     label158: {
                        var48 = var74.b(var46);
                        double var97;
                        var73 = (var97 = var48 - 1.5) == 0.0 ? 0 : (var97 < 0.0 ? -1 : 1);
                        if (var4 == 0) {
                           if (var73 >= 0) {
                              double var98;
                              var73 = (var98 = var2 - 1.0) == 0.0 ? 0 : (var98 < 0.0 ? -1 : 1);
                              if (var4 != 0) {
                                 break label159;
                              }

                              if (var73 < 0) {
                                 break label158;
                              }
                           }

                           var5.add(var46);
                        }

                        if (var4 == 0) {
                           break label258;
                        }
                     }

                     var73 = var38;
                  }

                  Vec3 var54;
                  Vec3 var55;
                  double var56;
                  label145: {
                     llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var51 = var73
                           > 0
                        ? (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var36.get(
                           var38 - 1
                        )
                        : var43;
                     Intrinsics.checkNotNull(var51);
                     llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var53 = var38
                              + 2
                           < var36.size()
                        ? (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var36.get(
                           var38 + 2
                        )
                        : var46;
                     Intrinsics.checkNotNull(var53);
                     Vec3 var77 = new Vec3(var46.a() - var51.a(), var46.b() - var51.b(), var46.c() - var51.c()).normalize();
                     var84 = -31378;
                     var90 = 23564;
                     Intrinsics.checkNotNullExpressionValue(var77, "normalize(...)");
                     var54 = var77;
                     Vec3 var78 = new Vec3(var53.a() - var43.a(), var53.b() - var43.b(), var53.c() - var43.c()).normalize();
                     var84 = -31367;
                     var90 = 13453;
                     Intrinsics.checkNotNullExpressionValue(var78, "normalize(...)");
                     var55 = var78;
                     var56 = 0.15;
                     var73 = var38;
                     if (var4 == 0) {
                        if (var38 <= 0) {
                           break label145;
                        }

                        var73 = var38 + 2;
                     }

                     if (var73 < var36.size()) {
                         var57 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var51.g(), var43.g())
                           .a();
                        float var22 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var43.g(), var46.g())
                           .a();
                        float var23 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var46.g(), var53.g())
                           .a();
                        float var24 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .c(var22 - var57)
                           + me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .c(var23 - var23);
                        if (Math.abs(var24) > 50.0F) {
                           var56 = 0.35;
                        }
                     }
                  }

                  ArrayList var26;
                  label139: {
                      var58 = var48 * var56;
                     llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var59 = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        var43.a() + var54.x * var58, var43.b() + var54.y * var58, var43.c() + var54.z * var58, false, null, false, 56, null
                     );
                     llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var60 = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        var46.a() - var55.x * var58, var46.b() - var55.y * var58, var46.c() - var55.z * var58, false, null, false, 56, null
                     );
                     int var25 = Math.max(1, (int)(var48 / var2));
                     var26 = new ArrayList();
                     int var27 = 1;
                     var73 = var27;
                     if (var4 == 0) {
                        if (var27 > var25) {
                           break label139;
                        }

                        var73 = var27;
                     }

                     while (true) {
                        double var28 = (double)var73 / var25;
                        llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var30 = this.a(
                           var43, var59, var60, var46, var28
                        );
                        var26.add(var30);
                        if (var27 == var25) {
                           break;
                        }

                        var27++;
                        if (var4 != 0) {
                           break label174;
                        }

                        if (var4 != 0) {
                           break;
                        }

                        var73 = var27;
                     }
                  }

                  double var61 = var43.b();
                  double var29 = var46.b();
                   var31 = (var29 - var61) / RangesKt.coerceAtLeast(var26.size() - 1.0, 1.0);
                  int var33 = 0;
                   var34 = var26.size();

                  while (var33 < var34) {
                     ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var26.get(
                           var33
                        ))
                        .a(var61 + var33 * var31);
                     var33++;
                     if (var4 != 0) {
                        break label174;
                     }

                     if (var4 != 0) {
                        break;
                     }
                  }

                  var5.addAll(var26);
               }

               var38++;
            }

            if (var4 == 0) {
               continue;
            }
         }

         var5.add(CollectionsKt.last(var36));
         break;
      }

      return var5;
   }

   private final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1,
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var2,
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3,
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4,
      double var5
   ) { double var13 = 0.0; // PX-FIX hoist
         double var11 = 0.0; // PX-FIX hoist
        
      double var7 = 1.0 - var5;
      double var9 = var7 * var7;
       var11 = var9 * var7;
       var13 = var5 * var5;
      double var15 = var13 * var5;
      double var17 = var11 * var1.a() + 3 * var9 * var5 * var2.a() + 3 * var7 * var13 * var3.a() + var15 * var4.a();
      double var19 = var11 * var1.b() + 3 * var9 * var5 * var2.b() + 3 * var7 * var13 * var3.b() + var15 * var4.b();
      double var21 = var11 * var1.c() + 3 * var9 * var5 * var2.c() + 3 * var7 * var13 * var3.c() + var15 * var4.c();
      boolean var23 = var4.f();
      BlockPos var24 = var4.e();
      return new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         var17, var19, var21, false, var24, var23, 8, null
      );
   }

   private final byte a(BlockPos var1) { BlockState var5 = null; // PX-FIX hoist
         Block var12 = null; // PX-FIX hoist
         BlockState var11 = null; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Byte var3 = (Byte)this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var1);
      int var2 = var10000;
      Byte var8 = var3;
      if (var2 != 0) {
         if (var3 == null) {
            ClientLevel var10 = this.a();
            if (var10 == null) {
               return 0;
            }

            ClientLevel var4 = var10;
             var11 = var4.getBlockState(var1);
             var10002 = -31386;
            short var10003 = -12100;
            Intrinsics.checkNotNullExpressionValue(var11, "getBlockState(...)");
             var5 = var11;
             var12 = var5.getBlock();
            var10002 = -31381;
            var10003 = -12417;
            Intrinsics.checkNotNullExpressionValue(var12, "getBlock(...)");
            Block var6 = var12;
            var10000 = ((var5.isAir()) ? 1 : 0);
            label85:
            if (var2 != 0) {
               label107:
               if (var10000 == 0) {
                  var10000 = ((var5.getCollisionShape(var4, var1).isEmpty()) ? 1 : 0);
                  if (var2 != 0) {
                     if (var10000 != 0) {
                        break label107;
                     }

                     var10000 = ((var6 instanceof SlabBlock) ? 1 : 0);
                  }

                  if (var2 != 0) {
                     if (var10000 != 0 && var5.getValue(SlabBlock.TYPE) == SlabType.BOTTOM) {
                        var10000 = 12;
                        break label85;
                     }

                     var10000 = ((var6 instanceof StairBlock) ? 1 : 0);
                  }

                  if (var2 != 0) {
                     if (var10000 != 0) {
                        var10000 = 10;
                        break label85;
                     }

                     var10000 = ((var6 instanceof CarpetBlock) ? 1 : 0);
                  }

                  if (var2 != 0) {
                     if (var10000 != 0) {
                        var10000 = 14;
                        break label85;
                     }

                     var10000 = ((var6 instanceof FenceBlock) ? 1 : 0);
                  }

                  if (var2 == 0) {
                     break label85;
                  }

                  label92:
                  if (var10000 == 0) {
                     var10000 = ((var6 instanceof WallBlock) ? 1 : 0);
                     if (var2 != 0) {
                        if (var10000 != 0) {
                           break label92;
                        }

                        var10000 = ((var5.getFluidState().isEmpty()) ? 1 : 0);
                     }

                     if (var2 != 0) {
                        if (var10000 == 0) {
                           var10000 = 13;
                           break label85;
                        }

                        var10000 = ((var6 instanceof SnowLayerBlock) ? 1 : 0);
                     }

                     if (var2 != 0) {
                        if (var10000 != 0) {
                           var10000 = var5.getValue(SnowLayerBlock.LAYERS);
                           if (var2 != 0) {
                              switch (var10000) {
                                 case 1:
                                    var10000 = 15;
                                    break label85;
                                 case 2:
                                    var10000 = 7;
                                    break label85;
                                 case 3:
                                    var10000 = 3;
                                    break label85;
                                 case 4:
                                    var10000 = 1;
                                    break label85;
                                 case 5:
                                    var10000 = 6;
                                    break label85;
                                 case 6:
                                    var10000 = 5;
                                    break label85;
                                 case 7:
                                    var10000 = 11;
                                    break label85;
                                 default:
                                    var10000 = 4;
                              }
                           }
                           break label85;
                        }

                        var10000 = ((Intrinsics.areEqual(var6, Blocks.SNOW)) ? 1 : 0);
                     }

                     if (var2 != 0) {
                        var10000 = var10000 != 0 ? 9 : 8;
                     }
                     break label85;
                  }

                  var10000 = 6;
                  break label85;
               }

               var10000 = 0;
            }

            int var7 = var10000;
            ((Map)this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll).put(var1, Byte.valueOf((byte)var7));
            return (byte)var7;
         }

         var8 = var3;
      }

      return var8;
   }

   private final boolean b(BlockPos var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      byte var3 = this.a(var1);
      int var2 = var10000;
      byte var4 = var3;
      if (var2 != 0) {
         if (var3 != 0) {
            if (var2 == 0) {
               return (var3 != 0);
            }

            if (var3 != 14) {
               return (0 != 0);
            }
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   private final boolean c(BlockPos var1) {
      int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      int var10000 = this.a(var1);
      if (var2 == 0) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   private static final double a(
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var0,
      double var1,
      double var3,
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5
   ) { short var50 = (short)0; // PX-FIX hoist
         short var49 = (short)0; // PX-FIX hoist
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var44 = null; // PX-FIX hoist
         BlockPos var43 = null; // PX-FIX hoist
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var31 = null; // PX-FIX hoist
         int var18 = 0; // PX-FIX hoist
         byte var16 = (byte)0; // PX-FIX hoist
         int var12 = 0; // PX-FIX hoist
         boolean var11 = false; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
         int var40;
         int var41;
        
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Double var7 = var0.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var5.a());
      int var6 = var10000;
      Object var33 = var7;
      if (var6 != 0) {
         if (var7 == null) {
            double var24 = 0.0;
            BlockPos var25 = var5.a();
            var10000 = var5.b();
            if (var6 != 0) {
               var10000 = var10000 == 12 ? 1 : 0;
            }

            byte var26;
            label173: {
               int var10 = var10000;
               var26 = ((byte)((IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.contains(var5.b())) ? 1 : 0));
               var10000 = var10;
               if (var6 != 0) {
                  if (var10 == 0) {
                     break label173;
                  }

                  var10000 = 0;
               }

                var12 = var10000;

               for (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var14 : var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
                  byte var48;
                  BlockPos var10001 = var25.offset(var14.a(), 0, var14.c());
                  short var10003 = -31373;
                  short var10004 = 17128;
                  Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
                  byte var15 = var0.a(var10001);
                  var10000 = var15;
                  var48 = 12;
                  label155:
                  if (var6 != 0) {
                     label153: {
                        if (var15 != 12) {
                           var10000 = ((IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.contains(var15)) ? 1 : 0);
                           if (var6 == 0) {
                              break label153;
                           }

                           if (var10000 == 0) {
                              var10000 = var15;
                              var48 = 9;
                              if (var6 == 0) {
                                 break label155;
                              }

                              if (var15 != 9) {
                                 continue;
                              }
                           }
                        }

                        var10000 = ++var12;
                     }

                     var48 = 2;
                  }

                  if (var10000 >= var48) {
                     break;
                  }
               }

               if (var12 < 2) {
                  var24 += 6.0;
               }
            }

            label137:
            for (Object var37 : var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
               while (true) {
                  me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var28 = (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var37;
                  int var29 = 1;

                  while (true) {
                     if (var29 >= 3) {
                        continue label137;
                     }

                     label176: {
                        BlockPos var38 = var25.offset(var28.a(), var29, var28.c());
                         var10002 = -31373;
                         var50 = 17128;
                        Intrinsics.checkNotNullExpressionValue(var38, "offset(...)");
                        BlockPos var30 = var38;
                        llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var39 = var0;
                        if (var6 != 0) {
                           var37 = (Boolean)var0.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.get(var30);
                           if (var6 == 0) {
                              break;
                           }

                           if (var6 == 0) {
                              return var24;
                           }

                           if (var37 != null) {
                              var41 = ((Boolean)var37).booleanValue() ? 1 : 0;
                              break label176;
                           }

                           var39 = var0;
                        }

                        llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var19;
                        label121: {
                           label178: {
                              var19 = var39;
                              boolean var20 = false;
                              byte var21 = var19.a(var30);
                              var40 = var21;
                              if (var6 != 0) {
                                 if (var21 == 0) {
                                    break label178;
                                 }

                                 var40 = var21;
                              }

                              if (var6 == 0) {
                                 break label121;
                              }

                              if (var40 != 12) {
                                 var40 = 1;
                                 break label121;
                              }
                           }

                           var40 = 0;
                        }

                        byte var22 = (byte)(var40);

                        ((Map)var19.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI)
                           .put(var30, Boolean.valueOf(var22 != 0));
                        var41 = var22;
                     }

                      var16 = (byte)var41;
                     var10000 = var16;
                     if (var6 != 0) {
                        if (var16 != 0) {
                           var24 += var1;
                        }

                        var10000 = var26;
                     }

                     label109: {
                        label108: {
                           if (var6 != 0) {
                              if (var10000 == 0) {
                                 break label108;
                              }

                              var10000 = var29;
                           }

                           if (var10000 == 2) {
                              label180: {
                                  var43 = var25.offset(var28.a(), -1, var28.c());
                                  var49 = -31373;
                                 short var51 = 17128;
                                 Intrinsics.checkNotNullExpressionValue(var43, "offset(...)");
                                 BlockPos var17 = var43;
                                  var44 = var0;
                                 if (var6 != 0) {
                                    Boolean var45 = (Boolean)var0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                                       .get(var17);
                                    if (var45 != null) {
                                       var10000 = var45 ? 1 : 0;
                                       break label180;
                                    }

                                    var44 = var0;
                                 }

                                  var31 = var44;
                                 boolean var32 = false;
                                 var10000 = var31.a(var17);
                                 if (var6 != 0) {
                                    var10000 = var10000 == 0 ? 1 : 0;
                                 }

                                 int var23 = var10000;
                                 ((Map)var31.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl)
                                    .put(var17, Boolean.valueOf(var23 != 0));
                                 var10000 = var23;
                              }

                               var18 = var10000;
                              if (var6 == 0) {
                                 break label109;
                              }

                              if (var18 != 0) {
                                 var24 += var3;
                              }
                           }
                        }

                        var29++;
                     }

                     if (var6 == 0) {
                        break label137;
                     }
                  }
               }
            }

            ((Map)var0.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll).put(var5.a(), var24);
            return var24;
         }

         var33 = var7;
      }

      double var9 = ((Number)var33).doubleValue();
       var11 = false;
      return var9;
   }

   private static final double a(llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var0, BlockPos var1, BlockPos var2) { double var5 = 0.0; // PX-FIX hoist
         Double var11 = null; // PX-FIX hoist
        
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      Double var4 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var2);
      int var3 = var10000;
       var11 = var4;
      if (var3 != 0) {
         if (var4 == null) {
             var5 = var2.getX() - var1.getX();
            double var7 = var2.getZ() - var1.getZ();
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            ((Map)var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI).put(var2, var9);
            return var9;
         }

         var11 = var4;
      }

      return var11;
   }

   private static final boolean a(
      BlockPos var0,
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1,
      ArrayList<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var2,
      int var3,
      int var4,
      double var5
   ) { double var12 = 0.0; // PX-FIX hoist
         byte var11 = (byte)0; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
         int var16;
         Object var18;
        
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      BlockPos var10001 = var0.offset(var3, 0, var4);
      short var10003 = -31363;
      short var10004 = -13814;
      Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
      BlockPos var8 = var10001;
      int var9 = 1;
      int var7 = var10000;

      while (true) {
         if (-5 < var9) {
            BlockPos var15 = var8.offset(0, var9, 0);
             var10002 = -31373;
            var10003 = 17128;
            Intrinsics.checkNotNullExpressionValue(var15, "offset(...)");
            BlockPos var10 = var15;
            var16 = (int)(((Map)var1.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII).containsKey(var10) ? 1 : 0);
            if (var7 != 0) {
               break;
            }

            if (var7 == 0) {
               if (var16 != 0) {
                  return false;
               }

               var16 = var1.a(var10);
            }

             var11 = (byte)var16;
            if (var7 == 0) {
               if (var11 != 0) {
                  var10001 = var10.offset(0, 1, 0);
                  var10003 = -31373;
                  var10004 = 17128;
                  Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
                  var10000 = ((var1.b(var10001)) ? 1 : 0);
                  if (var7 == 0) {
                     if (var10000 == 0) {
                        return false;
                     }

                     var10001 = var10.offset(0, 2, 0);
                     var10003 = -31373;
                     var10004 = 17128;
                     Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
                     var10000 = ((var1.c(var10001)) ? 1 : 0);
                  }

                  if (var7 == 0) {
                     if (var10000 == 0) {
                        return false;
                     }

                     var10000 = var9;
                  }

                  label72:
                  if (var7 == 0) {
                     if (var10000 < 0) {
                        var10001 = var8.offset(0, 2, 0);
                        var10003 = -31373;
                        var10004 = 17128;
                        Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
                        var10000 = ((var1.c(var10001)) ? 1 : 0);
                        if (var7 != 0) {
                           break label72;
                        }

                        if (var10000 == 0) {
                           return false;
                        }
                     }

                     var10000 = var9;
                  }

                  label65: {
                     label64: {
                        if (var7 == 0) {
                           if (var10000 != 1) {
                              break label64;
                           }

                           var18 = var1;
                           var10001 = var0.offset(0, 3, 0);
                           var10003 = -31373;
                           var10004 = 17128;
                           Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
                           if (var7 != 0) {
                              break label65;
                           }

                           var10000 = ((var1.c(var10001)) ? 1 : 0);
                        }

                        if (var10000 == 0) {
                           return false;
                        }
                     }

                     var18 = ((HashMap)var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII).get(var11);
                  }

                  Intrinsics.checkNotNull(var18);
                  var12 = ((Number)var18).doubleValue();
                  llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var14 = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                     var10,
                     var11,
                     new me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                        var3, var9, var4
                     ),
                     var12
                  );
                  var2.add(var14);
                  var10000 = var9;
                  if (var7 == 0) {
                     var10000 = var9 == 0 ? 1 : 0;
                  }

                  return (var10000 != 0);
               }

               var9--;
            }

            if (var7 == 0) {
               continue;
            }
         }

         var16 = 0;
         break;
      }

      return var16 != 0;
   }

   private static final boolean a(
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var0,
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1,
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var2
   ) { boolean var70 = false; // PX-FIX hoist
         short var57 = (short)0; // PX-FIX hoist
         BlockPos var47 = null; // PX-FIX hoist
         BlockPos var46 = null; // PX-FIX hoist
         BlockPos var44 = null; // PX-FIX hoist
         Vec3 var43 = null; // PX-FIX hoist
         Object var18 = null; // PX-FIX hoist
         boolean var16 = false; // PX-FIX hoist
         BlockHitResult var13 = null; // PX-FIX hoist
         ClientLevel var12 = null; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
      BlockHitResult var31 = null; // PX-FIX hoist
      BlockHitResult var34 = null; // PX-FIX hoist
      Collection var40 = null; // PX-FIX hoist
      int var41;
        
      int var3;
      Vec3 var10;
      Vec3 var11;
      Type var32;
      label167: {
         label166: {
            label171: {
               int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
               double var4 = var2.b() - var1.b();
               var3 = var10000;
               Vec3 var6 = new Vec3(0.0, var4 == 0.0 ? 0.5 : (var4 > 0.0 ? 0.7 : 0.4), 0.0);
               Vec3 var7 = new Vec3(0.0, var4 == 0.0 ? 1.5 : (var4 > 0.0 ? 1.7 : 1.4), 0.0);
               Vec3 var26 = var1.g().add(var6);
                var10002 = -31365;
               short var10003 = -1663;
               Intrinsics.checkNotNullExpressionValue(var26, "add(...)");
               Vec3 var8 = var26;
               Vec3 var27 = var2.g().add(var6);
               var10002 = -31385;
               var10003 = -5496;
               Intrinsics.checkNotNullExpressionValue(var27, "add(...)");
               Vec3 var9 = var27;
               Vec3 var28 = var1.g().add(var7);
               var10002 = -31385;
               var10003 = -5496;
               Intrinsics.checkNotNullExpressionValue(var28, "add(...)");
               var10 = var28;
               Vec3 var29 = var2.g().add(var7);
               var10002 = -31385;
               var10003 = -5496;
               Intrinsics.checkNotNullExpressionValue(var29, "add(...)");
               var11 = var29;
                var12 = var0.a();
               ClientLevel var30 = var12;
               if (var3 == 0) {
                  if (var12 == null) {
                     break label171;
                  }

                  var30 = var12;
               }

               ClipContext var10001 = new ClipContext(
                  var8,
                                    var9,
                                    net.minecraft.world.level.ClipContext.Block.COLLIDER,
                                    Fluid.NONE,
                                    var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player); // PX-FIX
               if (var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player == null) {
                  return false;
               }

                var13 = var30.clip(var10001);
               var31 = var13;
               if (var3 != 0) {
                  break label166;
               }

               if (var13 != null) {
                  var31 = var13;
                  break label166;
               }
            }

            var32 = null;
            break label167;
         }

         var32 = var31.getType();
      }

      if (var32 != Type.MISS) {
         return false;
      } else {
         label152: { ClipContext var42 = null; // PX-FIX hoist
        
            label151: {
               label172: {
                  ClientLevel var21 = var0.a();
                  ClientLevel var33 = var21;
                  if (var3 == 0) {
                     if (var21 == null) {
                        break label172;
                     }

                     var33 = var21;
                  }

                   var42 = new ClipContext(
                     var10,
                                          var11,
                                          net.minecraft.world.level.ClipContext.Block.COLLIDER,
                                          Fluid.NONE,
                                          var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player); // PX-FIX
                  if (var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player == null) {
                     return false;
                  }

                  BlockHitResult var23 = var33.clip(var42);
                  var34 = var23;
                  if (var3 != 0) {
                     break label151;
                  }

                  if (var23 != null) {
                     var34 = var23;
                     break label151;
                  }
               }

               var32 = null;
               break label152;
            }

            var32 = var34.getType();
         }

         if (var32 != Type.MISS) {
            return false;
         } else {
            llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll var36 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
             var43 = var1.g().add(0.0, -0.5, 0.0);
             var57 = -31385;
            short var10004 = -5496;
            Intrinsics.checkNotNullExpressionValue(var43, "add(...)");
            Vec3 var51 = var2.g().add(0.0, -0.5, 0.0);
            var10004 = -31385;
            short var10005 = -5496;
            Intrinsics.checkNotNullExpressionValue(var51, "add(...)");
            ArrayList var22 = var36.b(var43, var51);
            Iterator var37 = var22.iterator();
            short var52 = -31372;
            var57 = 23562;
            Intrinsics.checkNotNullExpressionValue(var37, "iterator(...)");
            Iterator var24 = var37;

            label137:
            while (true) {
               byte var38 = ((byte)((var24.hasNext()) ? 1 : 0));

               while (var38 != 0) {
                  BlockPos var14;
                  label174: {
                     var32 = (Type)var24.next();
                     short var53 = -31369;
                     var57 = 12463;
                     Intrinsics.checkNotNullExpressionValue(var32, "next(...)");
                     var14 = (BlockPos)(Object)var32;
                     var var15 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                      var16 = false;
                     var40 = var15;
                     label131:
                     if (var3 == 0) {
                        if (var15 instanceof Collection) {
                           var40 = (Collection)var15;
                           if (var3 != 0) {
                              break label131;
                           }

                           if (var40.isEmpty()) {
                              var41 = 0;
                              break label174;
                           }
                        }

                        var40 = var15;
                     }

                     Iterator var17 = var40.iterator();

                     label124:
                     while (true) {
                        if (!var17.hasNext()) {
                           var41 = 0;
                           break;
                        }

                         var18 = var17.next();
                        me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var19 = (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var18;
                        boolean var20 = false;
                         var44 = var14.offset(var19.a(), 2, var19.c());
                        var57 = -31373;
                        var10004 = 17128;
                        Intrinsics.checkNotNullExpressionValue(var44, "offset(...)");
                        var41 = var0.a(var44);

                        while (true) {
                           if (var3 == 0) {
                              var41 = var41 != 0 ? 1 : 0;
                           }

                           if (var41 == 0) {
                              break;
                           }

                           var41 = 1;
                           if (var3 == 0) {
                              break label124;
                           }
                        }
                     }
                  }

                  if (var41 != 0) {
                     continue label137;
                  }

                  byte var25 = var0.a(var14);
                  if (var3 != 0) {
                     return (var25 != 0);
                  }

                  if (var25 != 0) {
                     if (var3 != 0) {
                        return (var25 != 0);
                     }

                     if (var25 != 13) {
                        BlockPos var45 = var14.offset(0, 1, 0);
                        var57 = -31373;
                        var10004 = 17128;
                        Intrinsics.checkNotNullExpressionValue(var45, "offset(...)");
                        boolean var69 = var0.b(var45);
                        if (var3 != 0) {
                           return var69;
                        }

                        if (var69) {
                            var46 = var14.offset(0, 2, 0);
                           var57 = -31373;
                           var10004 = 17128;
                           Intrinsics.checkNotNullExpressionValue(var46, "offset(...)");
                            var70 = var0.c(var46);
                           if (var3 != 0) {
                              return var70;
                           }

                           if (var70) {
                               var47 = var14.offset(0, 3, 0);
                              var57 = -31373;
                              var10004 = 17128;
                              Intrinsics.checkNotNullExpressionValue(var47, "offset(...)");
                              if (var0.c(var47)) {
                                 continue label137;
                              }
                           }
                        }
                     }
                  }

                  var38 = 0;
                  if (var3 == 0) {
                     return (0 != 0);
                  }
               }

               return true;
            }
         }
      }
   }

   public llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII() {
      this(null, null, 3, null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { String[] var5 = null; // PX-FIX hoist
         byte var10002 = (byte)0; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
       var5 = new String[28];
      int var3 = 0;
      String var2 = "Ù\u008dfU\u0000L\u001c§I\u0088Ö\u000f[&\u0011éÈb¥ß\u0094Ëâ\u001dòQM\r½:\u00896ôXØ\u001d\u0005Ö~>ÛF)ßSq¨#\u00adÿ_\u008a\u0001ð7¢\u00127¾§íFÎyÊz/\u0081Å\u0000¿\u0006ù<©UBcßr\u0087\u009a\u00989k@õõ\u0006_g(¡1\u008dÎÐ|/ËÙùò>\u009eé\t\u0001\u0085é±ý\u000eóF\u0016\u001a\u009c`Jm¡\tî!\u0097\u001b\u0007ÌüZ\u001e&4\u0087\b\u000b\u008bñ\u008cû\u001dG\u009b\be°^\u0093½VµÎ\u000b÷\u0094i\u008aôÈ.\u0084-&q\r\u00820È³²±\u0089DR#t¢Ã\töa¼¬ËÎ\u0087æû\u0017 Üå\u0083Õþ®¥]\u001d-\u0012e\u008f\"¡\u0099u}Fs=N\ff\u0087±¶x\u009dÒ\u0083\u0015ê\u0006õ\u0006¥\u0004°w\u009b\\\u000b=Cú\u008c\u0093wnÀ\u0007d\u001f\u0010Ñ\u0015|\u001f\u0018\u007f)ixºôsö\u0090á\u0019\t¬Ò÷Ú¢\u0000ª?^\b\u0014ØÄÇOtÑ¶\n¬\u0011\u0086üE}Ù\u0002\bÄ\u000eªÆ=\nùbæ-4\u0001\\ Á;\rñü¦*\u007f\u00820\"eï\u0092;\u001f\b[C-´r\u001av{\r\u000b¤'\"q®QÆÄI¦ï\u0099\u0004åUÂ²\u000eR\bR£^Ek¹\u0099ü\u001f\u007f\u008b\u0089\u00116ç;S\u0083\u009cdò\u0004\u008eT[HñÒø\n";
      int var4 = "Ù\u008dfU\u0000L\u001c§I\u0088Ö\u000f[&\u0011éÈb¥ß\u0094Ëâ\u001dòQM\r½:\u00896ôXØ\u001d\u0005Ö~>ÛF)ßSq¨#\u00adÿ_\u008a\u0001ð7¢\u00127¾§íFÎyÊz/\u0081Å\u0000¿\u0006ù<©UBcßr\u0087\u009a\u00989k@õõ\u0006_g(¡1\u008dÎÐ|/ËÙùò>\u009eé\t\u0001\u0085é±ý\u000eóF\u0016\u001a\u009c`Jm¡\tî!\u0097\u001b\u0007ÌüZ\u001e&4\u0087\b\u000b\u008bñ\u008cû\u001dG\u009b\be°^\u0093½VµÎ\u000b÷\u0094i\u008aôÈ.\u0084-&q\r\u00820È³²±\u0089DR#t¢Ã\töa¼¬ËÎ\u0087æû\u0017 Üå\u0083Õþ®¥]\u001d-\u0012e\u008f\"¡\u0099u}Fs=N\ff\u0087±¶x\u009dÒ\u0083\u0015ê\u0006õ\u0006¥\u0004°w\u009b\\\u000b=Cú\u008c\u0093wnÀ\u0007d\u001f\u0010Ñ\u0015|\u001f\u0018\u007f)ixºôsö\u0090á\u0019\t¬Ò÷Ú¢\u0000ª?^\b\u0014ØÄÇOtÑ¶\n¬\u0011\u0086üE}Ù\u0002\bÄ\u000eªÆ=\nùbæ-4\u0001\\ Á;\rñü¦*\u007f\u00820\"eï\u0092;\u001f\b[C-´r\u001av{\r\u000b¤'\"q®QÆÄI¦ï\u0099\u0004åUÂ²\u000eR\bR£^Ek¹\u0099ü\u001f\u007f\u008b\u0089\u00116ç;S\u0083\u009cdò\u0004\u008eT[HñÒø\n"
         .length();
      char var1 = 11;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 72;
         String var10001 = var2.substring(++var9, var9 + var1);
          var10002 = -1;

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
                     case 0 -> 22;
                     case 1 -> 11;
                     case 2 -> 58;
                     case 3 -> 29;
                     case 4 -> 5;
                     case 5 -> 109;
                     default -> 28;
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
                     a = var5;
                     b = new String[28];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     Byte[] var7 = new Byte[]{(byte)15, (byte)7, (byte)3, (byte)1, (byte)6, (byte)5, (byte)11, (byte)4};
                     IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = CollectionsKt.listOf(var7);
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "aÛ\r7ÕÛ3ò\u0012Ü÷lù©dû.[¿¿Ëáç\u0090\u0087ß¾";
                  var4 = "aÛ\r7ÕÛ3ò\u0012Ü÷lù©dû.[¿¿Ëáç\u0090\u0087ß¾".length();
                  var1 = '\b';
                  var9 = -1;
            }

            var10000 = 54;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         char var10002 = '\0'; // PX-FIX hoist
        
      int var2 = (var0 ^ -31363) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 149;
            case 1 -> 40;
            case 2 -> 247;
            case 3 -> 172;
            case 4 -> 189;
            case 5 -> 83;
            case 6 -> 95;
            case 7 -> 91;
            case 8 -> 168;
            case 9 -> 47;
            case 10 -> 75;
            case 11 -> 131;
            case 12 -> 128;
            case 13 -> 90;
            case 14 -> 217;
            case 15 -> 28;
            case 16 -> 27;
            case 17 -> 250;
            case 18 -> 216;
            case 19 -> 237;
            case 20 -> 121;
            case 21 -> 6;
            case 22 -> 150;
            case 23 -> 5;
            case 24 -> 48;
            case 25 -> 179;
            case 26 -> 70;
            case 27 -> 158;
            case 28 -> 201;
            case 29 -> 200;
            case 30 -> 175;
            case 31 -> 13;
            case 32 -> 194;
            case 33 -> 122;
            case 34 -> 185;
            case 35 -> 164;
            case 36 -> 142;
            case 37 -> 144;
            case 38 -> 79;
            case 39 -> 130;
            case 40 -> 16;
            case 41 -> 159;
            case 42 -> 39;
            case 43 -> 138;
            case 44 -> 226;
            case 45 -> 177;
            case 46 -> 196;
            case 47 -> 171;
            case 48 -> 22;
            case 49 -> 161;
            case 50 -> 219;
            case 51 -> 61;
            case 52 -> 203;
            case 53 -> 211;
            case 54 -> 76;
            case 55 -> 253;
            case 56 -> 97;
            case 57 -> 145;
            case 58 -> 15;
            case 59 -> 57;
            case 60 -> 94;
            case 61 -> 132;
            case 62 -> 69;
            case 63 -> 165;
            case 64 -> 212;
            case 65 -> 104;
            case 66 -> 243;
            case 67 -> 30;
            case 68 -> 7;
            case 69 -> 8;
            case 70 -> 143;
            case 71 -> 221;
            case 72 -> 2;
            case 73 -> 80;
            case 74 -> 54;
            case 75 -> 236;
            case 76 -> 102;
            case 77 -> 38;
            case 78 -> 157;
            case 79 -> 245;
            case 80 -> 110;
            case 81 -> 188;
            case 82 -> 21;
            case 83 -> 118;
            case 84 -> 141;
            case 85 -> 77;
            case 86 -> 182;
            case 87 -> 136;
            case 88 -> 186;
            case 89 -> 227;
            case 90 -> 120;
            case 91 -> 43;
            case 92 -> 208;
            case 93 -> 160;
            case 94 -> 239;
            case 95 -> 199;
            case 96 -> 67;
            case 97 -> 254;
            case 98 -> 210;
            case 99 -> 220;
            case 100 -> 51;
            case 101 -> 135;
            case 102 -> 103;
            case 103 -> 162;
            case 104 -> 148;
            case 105 -> 72;
            case 106 -> 181;
            case 107 -> 41;
            case 108 -> 192;
            case 109 -> 197;
            case 110 -> 35;
            case 111 -> 62;
            case 112 -> 218;
            case 113 -> 105;
            case 114 -> 24;
            case 115 -> 96;
            case 116 -> 229;
            case 117 -> 166;
            case 118 -> 124;
            case 119 -> 63;
            case 120 -> 127;
            case 121 -> 111;
            case 122 -> 153;
            case 123 -> 119;
            case 124 -> 190;
            case 125 -> 242;
            case 126 -> 9;
            case 127 -> 36;
            case 128 -> 180;
            case 129 -> 112;
            case 130 -> 59;
            case 131 -> 238;
            case 132 -> 230;
            case 133 -> 251;
            case 134 -> 17;
            case 135 -> 34;
            case 136 -> 225;
            case 137 -> 25;
            case 138 -> 68;
            case 139 -> 152;
            case 140 -> 235;
            case 141 -> 49;
            case 142 -> 224;
            case 143 -> 37;
            case 144 -> 147;
            case 145 -> 99;
            case 146 -> 222;
            case 147 -> 133;
            case 148 -> 20;
            case 149 -> 73;
            case 150 -> 12;
            case 151 -> 206;
            case 152 -> 64;
            case 153 -> 151;
            case 154 -> 155;
            case 155 -> 231;
            case 156 -> 66;
            case 157 -> 232;
            case 158 -> 255;
            case 159 -> 26;
            case 160 -> 125;
            case 161 -> 11;
            case 162 -> 173;
            case 163 -> 107;
            case 164 -> 98;
            case 165 -> 249;
            case 166 -> 58;
            case 167 -> 174;
            case 168 -> 233;
            case 169 -> 204;
            case 170 -> 167;
            case 171 -> 89;
            case 172 -> 215;
            case 173 -> 202;
            case 174 -> 10;
            case 175 -> 117;
            case 176 -> 0;
            case 177 -> 87;
            case 178 -> 29;
            case 179 -> 109;
            case 180 -> 101;
            case 181 -> 116;
            case 182 -> 71;
            case 183 -> 81;
            case 184 -> 129;
            case 185 -> 42;
            case 186 -> 65;
            case 187 -> 163;
            case 188 -> 207;
            case 189 -> 246;
            case 190 -> 3;
            case 191 -> 176;
            case 192 -> 156;
            case 193 -> 74;
            case 194 -> 56;
            case 195 -> 92;
            case 196 -> 44;
            case 197 -> 115;
            case 198 -> 93;
            case 199 -> 187;
            case 200 -> 252;
            case 201 -> 146;
            case 202 -> 45;
            case 203 -> 193;
            case 204 -> 123;
            case 205 -> 240;
            case 206 -> 244;
            case 207 -> 139;
            case 208 -> 134;
            case 209 -> 137;
            case 210 -> 170;
            case 211 -> 154;
            case 212 -> 205;
            case 213 -> 100;
            case 214 -> 88;
            case 215 -> 140;
            case 216 -> 191;
            case 217 -> 183;
            case 218 -> 209;
            case 219 -> 60;
            case 220 -> 85;
            case 221 -> 18;
            case 222 -> 31;
            case 223 -> 55;
            case 224 -> 178;
            case 225 -> 195;
            case 226 -> 126;
            case 227 -> 23;
            case 228 -> 32;
            case 229 -> 241;
            case 230 -> 108;
            case 231 -> 106;
            case 232 -> 234;
            case 233 -> 53;
            case 234 -> 169;
            case 235 -> 1;
            case 236 -> 228;
            case 237 -> 14;
            case 238 -> 184;
            case 239 -> 248;
            case 240 -> 198;
            case 241 -> 52;
            case 242 -> 223;
            case 243 -> 19;
            case 244 -> 114;
            case 245 -> 84;
            case 246 -> 50;
            case 247 -> 82;
            case 248 -> 214;
            case 249 -> 78;
            case 250 -> 213;
            case 251 -> 86;
            case 252 -> 33;
            case 253 -> 113;
            case 254 -> 4;
            default -> 46;
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
             var10002 = var3[var7];
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
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final byte lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @Nullable
      private BlockPos lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull BlockPos var1,
         byte var2,
         @NotNull me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3,
         double var4
      ) { short var10002 = (short)0; // PX-FIX hoist
        
         short var10001 = 7635;
          var10002 = 15495;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = 7634;
         var10002 = 28320;
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
      public final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI c() {
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

      @Nullable
      public final BlockPos h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final void a(@Nullable BlockPos var1) {
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
         byte var13 = (byte)0; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
          var5 = new String[2];
         int var3 = 0;
         String var2 = "5\\ôÜka\u0003?Y\\";
         int var4 = "5\\ôÜka\u0003?Y\\".length();
         char var1 = 6;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
                var13 = 4;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 4;
                  var10006 = var6;
               } else {
                  var13 = 4;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 4;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 48;
                     case 1 -> 2;
                     case 2 -> 52;
                     case 3 -> 74;
                     case 4 -> 56;
                     case 5 -> 94;
                     default -> 68;
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
               break pxClinit; // PX-FIX
            }

            var1 = var2.charAt(var0);
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         char var10002 = '\0'; // PX-FIX hoist
        
         int var2 = (var0 ^ 7634) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 96;
               case 1 -> 50;
               case 2 -> 90;
               case 3 -> 199;
               case 4 -> 48;
               case 5 -> 79;
               case 6 -> 20;
               case 7 -> 108;
               case 8 -> 15;
               case 9 -> 45;
               case 10 -> 149;
               case 11 -> 12;
               case 12 -> 168;
               case 13 -> 92;
               case 14 -> 21;
               case 15 -> 187;
               case 16 -> 177;
               case 17 -> 76;
               case 18 -> 160;
               case 19 -> 51;
               case 20 -> 229;
               case 21 -> 249;
               case 22 -> 230;
               case 23 -> 47;
               case 24 -> 26;
               case 25 -> 232;
               case 26 -> 170;
               case 27 -> 214;
               case 28 -> 93;
               case 29 -> 24;
               case 30 -> 39;
               case 31 -> 4;
               case 32 -> 42;
               case 33 -> 95;
               case 34 -> 155;
               case 35 -> 34;
               case 36 -> 235;
               case 37 -> 85;
               case 38 -> 31;
               case 39 -> 43;
               case 40 -> 9;
               case 41 -> 11;
               case 42 -> 241;
               case 43 -> 17;
               case 44 -> 227;
               case 45 -> 188;
               case 46 -> 35;
               case 47 -> 73;
               case 48 -> 22;
               case 49 -> 37;
               case 50 -> 87;
               case 51 -> 236;
               case 52 -> 112;
               case 53 -> 254;
               case 54 -> 38;
               case 55 -> 195;
               case 56 -> 67;
               case 57 -> 13;
               case 58 -> 210;
               case 59 -> 116;
               case 60 -> 204;
               case 61 -> 19;
               case 62 -> 74;
               case 63 -> 218;
               case 64 -> 240;
               case 65 -> 23;
               case 66 -> 78;
               case 67 -> 105;
               case 68 -> 94;
               case 69 -> 186;
               case 70 -> 251;
               case 71 -> 25;
               case 72 -> 213;
               case 73 -> 33;
               case 74 -> 89;
               case 75 -> 30;
               case 76 -> 161;
               case 77 -> 252;
               case 78 -> 104;
               case 79 -> 245;
               case 80 -> 247;
               case 81 -> 202;
               case 82 -> 52;
               case 83 -> 233;
               case 84 -> 110;
               case 85 -> 139;
               case 86 -> 81;
               case 87 -> 152;
               case 88 -> 192;
               case 89 -> 255;
               case 90 -> 221;
               case 91 -> 183;
               case 92 -> 185;
               case 93 -> 144;
               case 94 -> 56;
               case 95 -> 103;
               case 96 -> 217;
               case 97 -> 156;
               case 98 -> 234;
               case 99 -> 166;
               case 100 -> 133;
               case 101 -> 142;
               case 102 -> 130;
               case 103 -> 72;
               case 104 -> 179;
               case 105 -> 121;
               case 106 -> 174;
               case 107 -> 83;
               case 108 -> 220;
               case 109 -> 191;
               case 110 -> 102;
               case 111 -> 248;
               case 112 -> 197;
               case 113 -> 153;
               case 114 -> 127;
               case 115 -> 106;
               case 116 -> 61;
               case 117 -> 134;
               case 118 -> 164;
               case 119 -> 0;
               case 120 -> 119;
               case 121 -> 99;
               case 122 -> 117;
               case 123 -> 111;
               case 124 -> 53;
               case 125 -> 140;
               case 126 -> 60;
               case 127 -> 10;
               case 128 -> 109;
               case 129 -> 59;
               case 130 -> 123;
               case 131 -> 125;
               case 132 -> 178;
               case 133 -> 159;
               case 134 -> 57;
               case 135 -> 64;
               case 136 -> 163;
               case 137 -> 238;
               case 138 -> 244;
               case 139 -> 173;
               case 140 -> 239;
               case 141 -> 148;
               case 142 -> 212;
               case 143 -> 215;
               case 144 -> 146;
               case 145 -> 114;
               case 146 -> 237;
               case 147 -> 208;
               case 148 -> 207;
               case 149 -> 176;
               case 150 -> 129;
               case 151 -> 54;
               case 152 -> 158;
               case 153 -> 71;
               case 154 -> 147;
               case 155 -> 172;
               case 156 -> 250;
               case 157 -> 63;
               case 158 -> 7;
               case 159 -> 169;
               case 160 -> 138;
               case 161 -> 242;
               case 162 -> 141;
               case 163 -> 77;
               case 164 -> 14;
               case 165 -> 41;
               case 166 -> 62;
               case 167 -> 182;
               case 168 -> 203;
               case 169 -> 122;
               case 170 -> 206;
               case 171 -> 198;
               case 172 -> 124;
               case 173 -> 222;
               case 174 -> 2;
               case 175 -> 6;
               case 176 -> 3;
               case 177 -> 98;
               case 178 -> 27;
               case 179 -> 18;
               case 180 -> 200;
               case 181 -> 137;
               case 182 -> 162;
               case 183 -> 5;
               case 184 -> 175;
               case 185 -> 219;
               case 186 -> 32;
               case 187 -> 184;
               case 188 -> 97;
               case 189 -> 154;
               case 190 -> 226;
               case 191 -> 118;
               case 192 -> 224;
               case 193 -> 55;
               case 194 -> 205;
               case 195 -> 75;
               case 196 -> 46;
               case 197 -> 225;
               case 198 -> 246;
               case 199 -> 113;
               case 200 -> 193;
               case 201 -> 82;
               case 202 -> 128;
               case 203 -> 223;
               case 204 -> 69;
               case 205 -> 88;
               case 206 -> 101;
               case 207 -> 107;
               case 208 -> 40;
               case 209 -> 190;
               case 210 -> 44;
               case 211 -> 115;
               case 212 -> 181;
               case 213 -> 145;
               case 214 -> 136;
               case 215 -> 1;
               case 216 -> 91;
               case 217 -> 16;
               case 218 -> 58;
               case 219 -> 49;
               case 220 -> 243;
               case 221 -> 132;
               case 222 -> 194;
               case 223 -> 216;
               case 224 -> 131;
               case 225 -> 209;
               case 226 -> 66;
               case 227 -> 171;
               case 228 -> 84;
               case 229 -> 150;
               case 230 -> 100;
               case 231 -> 167;
               case 232 -> 86;
               case 233 -> 189;
               case 234 -> 165;
               case 235 -> 120;
               case 236 -> 135;
               case 237 -> 28;
               case 238 -> 36;
               case 239 -> 65;
               case 240 -> 196;
               case 241 -> 201;
               case 242 -> 231;
               case 243 -> 68;
               case 244 -> 253;
               case 245 -> 228;
               case 246 -> 126;
               case 247 -> 157;
               case 248 -> 151;
               case 249 -> 8;
               case 250 -> 29;
               case 251 -> 70;
               case 252 -> 211;
               case 253 -> 80;
               case 254 -> 143;
               default -> 180;
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
                var10002 = var3[var7];
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

   public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(Object... px) {
           this(0.0, 0.0, 0.0, false, null, false); // PX-FIX: 委托主构造器（final 字段初始化）
        }

      private final double IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @Nullable
      private final BlockPos IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         double var1, double var3, double var5, boolean var7, @Nullable BlockPos var8, boolean var9
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var5;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var7;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var8;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
      }

      public final double a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void a(double var1) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }

      public final double c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final BlockPos e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final Vec3 g() {
         return new Vec3(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
      }

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @NotNull Vec3 var1
      ) { short var10002 = (short)0; // PX-FIX hoist
        
         short var10001 = -4439;
          var10002 = -3103;
         Intrinsics.checkNotNullParameter(var1, "vec");
         return new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + var1.x,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII + var1.y,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl + var1.z,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            null,
            false,
            48,
            null
         );
      }

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1
      ) { short var10002 = (short)0; // PX-FIX hoist
        
         short var10001 = -4440;
          var10002 = -18903;
         Intrinsics.checkNotNullParameter(var1, "point");
         return new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               + var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               + var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               + var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            null,
            false,
            48,
            null
         );
      }

      public final double b(
         @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1
      ) { short var10002 = (short)0; // PX-FIX hoist
        
         short var10001 = -4437;
          var10002 = 19499;
         Intrinsics.checkNotNullParameter(var1, "point");
         return Math.sqrt(
            Math.pow(
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     - var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                  2
               )
               + Math.pow(
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     - var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  2
               )
               + Math.pow(
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     - var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                  2
               )
         );
      }

      public final double h() {
         return Math.sqrt(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  * this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  * this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  * this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
      }

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll i() {
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         double var2 = this.h();
         int var1 = var10000;
         double var5;
         var10000 = (var5 = var2 - 0.0) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
         if (var1 == 0) {
            var10000 = (((var10000 == 0) ? 1 : 0));
         }

         return (var10000 != 0)
            ? new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
               0.0, 0.0, 0.0, false, null, false, 56, null
            )
            : new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl / var2,
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / var2,
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / var2,
               false,
               null,
               false,
               56,
               null
            );
      }

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll c(
         @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1
      ) { short var10002 = (short)0; // PX-FIX hoist
        
         short var10001 = -4434;
          var10002 = -8701;
         Intrinsics.checkNotNullParameter(var1, "other");
         double var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               * var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               * var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         double var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               * var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               * var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         double var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               * var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               * var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         return new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var2, var4, var6, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, null, false, 48, null
         );
      }

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll b(
         double var1
      ) {
         return new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl * var1,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII * var1,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl * var1,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            null,
            false,
            48,
            null
         );
      }

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll d(
         @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1
      ) { short var10002 = (short)0; // PX-FIX hoist
        
         short var10001 = -4438;
          var10002 = 2490;
         Intrinsics.checkNotNullParameter(var1, "other");
         return new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               + var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               + var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               + var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            null,
            false,
            48,
            null
         );
      }

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll j() {
         return new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            -this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            -this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            -this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            null,
            false,
            48,
            null
         );
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
         byte var10002 = (byte)0; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
          var5 = new String[5];
         int var3 = 0;
         String var2 = "ðT\u0095\u0089®\u0005Zê=-\u009c\u0005^\u009a½#\u008c";
         int var4 = "ðT\u0095\u0089®\u0005Zê=-\u009c\u0005^\u009a½#\u008c".length();
         char var1 = 5;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 30;
            String var10001 = var2.substring(++var8, var8 + var1);
             var10002 = -1;

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
                        case 0 -> 92;
                        case 1 -> 18;
                        case 2 -> 55;
                        case 3 -> 3;
                        case 4 -> 48;
                        case 5 -> 101;
                        default -> 96;
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
                        b = new String[5];
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

                     var2 = "hÇ6\u00050N\fK\u001c";
                     var4 = "hÇ6\u00050N\fK\u001c".length();
                     var1 = 3;
                     var8 = -1;
               }

               var10000 = 59;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         char var10002 = '\0'; // PX-FIX hoist
        
         int var2 = (var0 ^ -4438) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 82;
               case 1 -> 162;
               case 2 -> 28;
               case 3 -> 89;
               case 4 -> 154;
               case 5 -> 157;
               case 6 -> 222;
               case 7 -> 192;
               case 8 -> 54;
               case 9 -> 243;
               case 10 -> 141;
               case 11 -> 129;
               case 12 -> 230;
               case 13 -> 8;
               case 14 -> 50;
               case 15 -> 104;
               case 16 -> 92;
               case 17 -> 140;
               case 18 -> 253;
               case 19 -> 131;
               case 20 -> 22;
               case 21 -> 116;
               case 22 -> 176;
               case 23 -> 41;
               case 24 -> 195;
               case 25 -> 171;
               case 26 -> 105;
               case 27 -> 46;
               case 28 -> 189;
               case 29 -> 120;
               case 30 -> 216;
               case 31 -> 175;
               case 32 -> 184;
               case 33 -> 72;
               case 34 -> 85;
               case 35 -> 169;
               case 36 -> 218;
               case 37 -> 158;
               case 38 -> 177;
               case 39 -> 142;
               case 40 -> 112;
               case 41 -> 125;
               case 42 -> 24;
               case 43 -> 210;
               case 44 -> 123;
               case 45 -> 198;
               case 46 -> 238;
               case 47 -> 97;
               case 48 -> 214;
               case 49 -> 234;
               case 50 -> 106;
               case 51 -> 167;
               case 52 -> 48;
               case 53 -> 205;
               case 54 -> 185;
               case 55 -> 70;
               case 56 -> 181;
               case 57 -> 130;
               case 58 -> 0;
               case 59 -> 15;
               case 60 -> 2;
               case 61 -> 75;
               case 62 -> 71;
               case 63 -> 228;
               case 64 -> 83;
               case 65 -> 180;
               case 66 -> 159;
               case 67 -> 190;
               case 68 -> 201;
               case 69 -> 35;
               case 70 -> 27;
               case 71 -> 31;
               case 72 -> 86;
               case 73 -> 217;
               case 74 -> 179;
               case 75 -> 32;
               case 76 -> 135;
               case 77 -> 90;
               case 78 -> 88;
               case 79 -> 73;
               case 80 -> 34;
               case 81 -> 164;
               case 82 -> 204;
               case 83 -> 150;
               case 84 -> 110;
               case 85 -> 212;
               case 86 -> 126;
               case 87 -> 203;
               case 88 -> 45;
               case 89 -> 21;
               case 90 -> 236;
               case 91 -> 1;
               case 92 -> 63;
               case 93 -> 37;
               case 94 -> 65;
               case 95 -> 36;
               case 96 -> 211;
               case 97 -> 29;
               case 98 -> 111;
               case 99 -> 103;
               case 100 -> 51;
               case 101 -> 241;
               case 102 -> 197;
               case 103 -> 114;
               case 104 -> 26;
               case 105 -> 146;
               case 106 -> 235;
               case 107 -> 255;
               case 108 -> 113;
               case 109 -> 47;
               case 110 -> 233;
               case 111 -> 33;
               case 112 -> 242;
               case 113 -> 223;
               case 114 -> 250;
               case 115 -> 11;
               case 116 -> 151;
               case 117 -> 136;
               case 118 -> 226;
               case 119 -> 166;
               case 120 -> 133;
               case 121 -> 18;
               case 122 -> 58;
               case 123 -> 139;
               case 124 -> 170;
               case 125 -> 220;
               case 126 -> 122;
               case 127 -> 200;
               case 128 -> 40;
               case 129 -> 206;
               case 130 -> 138;
               case 131 -> 44;
               case 132 -> 96;
               case 133 -> 251;
               case 134 -> 156;
               case 135 -> 60;
               case 136 -> 160;
               case 137 -> 229;
               case 138 -> 98;
               case 139 -> 67;
               case 140 -> 209;
               case 141 -> 187;
               case 142 -> 99;
               case 143 -> 191;
               case 144 -> 244;
               case 145 -> 188;
               case 146 -> 147;
               case 147 -> 59;
               case 148 -> 117;
               case 149 -> 237;
               case 150 -> 137;
               case 151 -> 173;
               case 152 -> 68;
               case 153 -> 55;
               case 154 -> 66;
               case 155 -> 6;
               case 156 -> 81;
               case 157 -> 56;
               case 158 -> 80;
               case 159 -> 182;
               case 160 -> 101;
               case 161 -> 13;
               case 162 -> 4;
               case 163 -> 134;
               case 164 -> 183;
               case 165 -> 174;
               case 166 -> 78;
               case 167 -> 231;
               case 168 -> 7;
               case 169 -> 199;
               case 170 -> 64;
               case 171 -> 109;
               case 172 -> 219;
               case 173 -> 57;
               case 174 -> 172;
               case 175 -> 213;
               case 176 -> 79;
               case 177 -> 119;
               case 178 -> 221;
               case 179 -> 178;
               case 180 -> 227;
               case 181 -> 155;
               case 182 -> 127;
               case 183 -> 215;
               case 184 -> 161;
               case 185 -> 128;
               case 186 -> 43;
               case 187 -> 77;
               case 188 -> 69;
               case 189 -> 124;
               case 190 -> 94;
               case 191 -> 186;
               case 192 -> 39;
               case 193 -> 240;
               case 194 -> 38;
               case 195 -> 118;
               case 196 -> 225;
               case 197 -> 245;
               case 198 -> 144;
               case 199 -> 152;
               case 200 -> 248;
               case 201 -> 196;
               case 202 -> 42;
               case 203 -> 145;
               case 204 -> 168;
               case 205 -> 254;
               case 206 -> 246;
               case 207 -> 143;
               case 208 -> 10;
               case 209 -> 53;
               case 210 -> 19;
               case 211 -> 5;
               case 212 -> 25;
               case 213 -> 232;
               case 214 -> 115;
               case 215 -> 202;
               case 216 -> 193;
               case 217 -> 87;
               case 218 -> 20;
               case 219 -> 153;
               case 220 -> 165;
               case 221 -> 102;
               case 222 -> 12;
               case 223 -> 30;
               case 224 -> 208;
               case 225 -> 9;
               case 226 -> 148;
               case 227 -> 247;
               case 228 -> 252;
               case 229 -> 107;
               case 230 -> 95;
               case 231 -> 52;
               case 232 -> 239;
               case 233 -> 61;
               case 234 -> 91;
               case 235 -> 132;
               case 236 -> 76;
               case 237 -> 62;
               case 238 -> 14;
               case 239 -> 100;
               case 240 -> 74;
               case 241 -> 224;
               case 242 -> 249;
               case 243 -> 3;
               case 244 -> 23;
               case 245 -> 17;
               case 246 -> 207;
               case 247 -> 16;
               case 248 -> 121;
               case 249 -> 149;
               case 250 -> 108;
               case 251 -> 163;
               case 252 -> 194;
               case 253 -> 49;
               case 254 -> 84;
               default -> 93;
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
                var10002 = var3[var7];
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
       public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(double var0, double var1, double var2, boolean var3, net.minecraft.core.BlockPos var4, boolean var5, int var6, kotlin.jvm.internal.DefaultConstructorMarker var7) { this(var0, var1, var2, (var6 & 8) != 0 ? false : var3, (var6 & 16) != 0 ? null : var4, (var6 & 32) != 0 ? false : var5); }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final ArrayList<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new ArrayList<>();
      @NotNull
      private final HashMap<BlockPos, Integer> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new HashMap<>();
      private static String[] a;
      private static String[] b;

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull BlockPos var1
      ) { short var10002 = (short)0; // PX-FIX hoist
        
         short var10001 = -19993;
          var10002 = 8832;
         Intrinsics.checkNotNullParameter(var1, "nodePos");
         ArrayList var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         Object var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
         Intrinsics.checkNotNull(var3);
         Object var2 = var10000.get(((Number)var3).intValue());
         var10002 = -19998;
         short var10003 = 9632;
         Intrinsics.checkNotNullExpressionValue(var2, "get(...)");
         return (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var2;
      }

      public final void a(
         @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
      ) { short var10002 = (short)0; // PX-FIX hoist
        
         short var10001 = -19997;
          var10002 = 20055;
         Intrinsics.checkNotNullParameter(var1, "node");
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.add(var1);
         int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var1.a(), var2);
         this.a(var2);
      }

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a() { short var10002 = (short)0; // PX-FIX hoist
        
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         Object var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(0);
         short var10003 = -20000;
         short var10004 = -10624;
         Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10001;
         int var1 = var10000;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.remove(var2.a());
         Object var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var1 != 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() == 1) {
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.remove(0);
               return var2;
            }

            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .remove(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1);
             var10002 = -19994;
            var10003 = 28704;
            Intrinsics.checkNotNullExpressionValue(var4, "removeAt(...)");
         }

         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var4;
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(0, var3);
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var3.a(), 0);
         this.b(0);
         return var2;
      }

      public final void b() {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.clear();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
      }

      public final boolean b(@NotNull BlockPos var1) { short var10002 = (short)0; // PX-FIX hoist
        
         short var10001 = -19995;
          var10002 = -12999;
         Intrinsics.checkNotNullParameter(var1, "pos");
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.containsKey(var1);
      }

      public final void b(
         @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
      ) { short var10002 = (short)0; // PX-FIX hoist
        
         short var10001 = -19999;
          var10002 = -26359;
         Intrinsics.checkNotNullParameter(var1, "node");
         Object var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1.a());
         Intrinsics.checkNotNull(var10000);
         int var3 = ((Number)var10000).intValue();
         double var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var3).e();
         int var6 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var1);
         int var2 = var6;
         double var8;
         int var7 = (var8 = var1.e() - var4) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
         if (var2 == 0) {
            if (var7 < 0) {
               this.a(var3);
               if (var2 == 0) {
                  return;
               }
            }

            double var9;
            var7 = (var9 = var1.e() - var4) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
         }

         if (var7 > 0) {
            this.b(var3);
         }
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
      }

      public final boolean d() {
         int var1 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         boolean var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty();
         if (var1 == 0) {
            var10000 = !var10000;
         }

         return var10000;
      }

      private final void a(int var1) { int var5 = 0; // PX-FIX hoist
         short var10002 = (short)0; // PX-FIX hoist
        
         int var3 = var1;
         int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         Object var10001 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var1);
         short var10003 = -19998;
         short var10004 = 9632;
         Intrinsics.checkNotNullExpressionValue(var10001, "get(...)");
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10001;
         int var2 = var10000;

         while (var3 > 0) {
             var5 = (var3 - 1) / 2;
            Object var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(var5);
             var10002 = -19998;
            var10003 = 9632;
            Intrinsics.checkNotNullExpressionValue(var7, "get(...)");
            llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var6 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var7;
            double var10;
            var10000 = (var10 = var6.e() - var4.e()) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
            if (var2 == 0) {
               if (var10000 <= 0 && var2 == 0) {
                  break;
               }

               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var3, var6);
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var5, var4);
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var6.a(), var3);
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var4.a(), var5);
               var10000 = var5;
            }

            var3 = var10000;
            if (var2 != 0) {
               break;
            }
         }
      }

      private final void b(int startIndex) {
         int size = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
         int gate = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
         int index = startIndex;
         Object currentValue = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(index);
         Intrinsics.checkNotNullExpressionValue(currentValue, "get(...)");
         var current = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) currentValue;

         if (gate == 0) {
            int leftChildIndex = 2 * index + 1;
            int selectedChildIndex = leftChildIndex < size ? leftChildIndex : -1;
            Object childValue = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(selectedChildIndex);
            Intrinsics.checkNotNullExpressionValue(childValue, "get(...)");
            var child = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) childValue;

            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(index, child);
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(selectedChildIndex, current);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(child.a(), index);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(current.a(), selectedChildIndex);
            return;
         }

         while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int selectedChildIndex = -1;
            if (leftChildIndex < size) {
               selectedChildIndex = leftChildIndex;
               if (rightChildIndex < size
                     && this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(rightChildIndex).e()
                           < this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(leftChildIndex).e()) {
                  selectedChildIndex = rightChildIndex;
               }
            }

            if (selectedChildIndex == -1) {
               return;
            }

            Object childValue = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get(selectedChildIndex);
            Intrinsics.checkNotNullExpressionValue(childValue, "get(...)");
            var child = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) childValue;
            double scoreDifference = current.e() - child.e();
            if (!Double.isNaN(scoreDifference) && scoreDifference <= 0.0) {
               return;
            }

            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(index, child);
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(selectedChildIndex, current);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(child.a(), index);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(current.a(), selectedChildIndex);
            index = selectedChildIndex;
         }
      }
      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
         byte var10002 = (byte)0; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
          var5 = new String[7];
         int var3 = 0;
         String var2 = "Ù\u00829Ó\bpº4Òkj\u0011j\u0004k·ou\b\u001e»ùòÒn&ê\u0007ñ_<h\u0006\u0098P";
         int var4 = "Ù\u00829Ó\bpº4Òkj\u0011j\u0004k·ou\b\u001e»ùòÒn&ê\u0007ñ_<h\u0006\u0098P".length();
         char var1 = 4;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 11;
            String var10001 = var2.substring(++var8, var8 + var1);
             var10002 = -1;

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
                        case 0 -> 44;
                        case 1 -> 97;
                        case 2 -> 42;
                        case 3 -> 34;
                        case 4 -> 22;
                        case 5 -> 29;
                        default -> 17;
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

                     var2 = "¬\u0086¢±xAìÓVÈ\u000eF\u0093\u0003i\u008fF";
                     var4 = "¬\u0086¢±xAìÓVÈ\u000eF\u0093\u0003i\u008fF".length();
                     var1 = '\r';
                     var8 = -1;
               }

               var10000 = 101;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         char var10002 = '\0'; // PX-FIX hoist
        
         int var2 = (var0 ^ -19997) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 190;
               case 1 -> 101;
               case 2 -> 177;
               case 3 -> 63;
               case 4 -> 64;
               case 5 -> 107;
               case 6 -> 23;
               case 7 -> 222;
               case 8 -> 43;
               case 9 -> 144;
               case 10 -> 165;
               case 11 -> 87;
               case 12 -> 14;
               case 13 -> 143;
               case 14 -> 161;
               case 15 -> 155;
               case 16 -> 238;
               case 17 -> 38;
               case 18 -> 236;
               case 19 -> 110;
               case 20 -> 206;
               case 21 -> 203;
               case 22 -> 234;
               case 23 -> 89;
               case 24 -> 160;
               case 25 -> 254;
               case 26 -> 71;
               case 27 -> 221;
               case 28 -> 142;
               case 29 -> 94;
               case 30 -> 33;
               case 31 -> 12;
               case 32 -> 233;
               case 33 -> 93;
               case 34 -> 118;
               case 35 -> 103;
               case 36 -> 29;
               case 37 -> 239;
               case 38 -> 252;
               case 39 -> 77;
               case 40 -> 237;
               case 41 -> 180;
               case 42 -> 145;
               case 43 -> 124;
               case 44 -> 128;
               case 45 -> 204;
               case 46 -> 32;
               case 47 -> 223;
               case 48 -> 42;
               case 49 -> 65;
               case 50 -> 219;
               case 51 -> 13;
               case 52 -> 47;
               case 53 -> 208;
               case 54 -> 201;
               case 55 -> 175;
               case 56 -> 27;
               case 57 -> 34;
               case 58 -> 232;
               case 59 -> 35;
               case 60 -> 49;
               case 61 -> 84;
               case 62 -> 194;
               case 63 -> 18;
               case 64 -> 202;
               case 65 -> 0;
               case 66 -> 159;
               case 67 -> 59;
               case 68 -> 191;
               case 69 -> 83;
               case 70 -> 68;
               case 71 -> 73;
               case 72 -> 147;
               case 73 -> 57;
               case 74 -> 53;
               case 75 -> 176;
               case 76 -> 231;
               case 77 -> 228;
               case 78 -> 85;
               case 79 -> 195;
               case 80 -> 67;
               case 81 -> 55;
               case 82 -> 111;
               case 83 -> 146;
               case 84 -> 50;
               case 85 -> 197;
               case 86 -> 210;
               case 87 -> 112;
               case 88 -> 117;
               case 89 -> 82;
               case 90 -> 213;
               case 91 -> 9;
               case 92 -> 207;
               case 93 -> 250;
               case 94 -> 130;
               case 95 -> 172;
               case 96 -> 109;
               case 97 -> 25;
               case 98 -> 104;
               case 99 -> 21;
               case 100 -> 138;
               case 101 -> 185;
               case 102 -> 97;
               case 103 -> 149;
               case 104 -> 92;
               case 105 -> 134;
               case 106 -> 80;
               case 107 -> 170;
               case 108 -> 41;
               case 109 -> 169;
               case 110 -> 122;
               case 111 -> 62;
               case 112 -> 139;
               case 113 -> 81;
               case 114 -> 52;
               case 115 -> 135;
               case 116 -> 224;
               case 117 -> 5;
               case 118 -> 255;
               case 119 -> 44;
               case 120 -> 86;
               case 121 -> 196;
               case 122 -> 148;
               case 123 -> 156;
               case 124 -> 54;
               case 125 -> 214;
               case 126 -> 60;
               case 127 -> 171;
               case 128 -> 36;
               case 129 -> 184;
               case 130 -> 10;
               case 131 -> 253;
               case 132 -> 179;
               case 133 -> 153;
               case 134 -> 121;
               case 135 -> 209;
               case 136 -> 162;
               case 137 -> 28;
               case 138 -> 20;
               case 139 -> 46;
               case 140 -> 113;
               case 141 -> 4;
               case 142 -> 189;
               case 143 -> 75;
               case 144 -> 24;
               case 145 -> 248;
               case 146 -> 17;
               case 147 -> 61;
               case 148 -> 76;
               case 149 -> 178;
               case 150 -> 226;
               case 151 -> 188;
               case 152 -> 186;
               case 153 -> 2;
               case 154 -> 39;
               case 155 -> 235;
               case 156 -> 102;
               case 157 -> 6;
               case 158 -> 30;
               case 159 -> 58;
               case 160 -> 100;
               case 161 -> 19;
               case 162 -> 45;
               case 163 -> 115;
               case 164 -> 220;
               case 165 -> 247;
               case 166 -> 218;
               case 167 -> 95;
               case 168 -> 181;
               case 169 -> 114;
               case 170 -> 136;
               case 171 -> 98;
               case 172 -> 108;
               case 173 -> 125;
               case 174 -> 227;
               case 175 -> 198;
               case 176 -> 151;
               case 177 -> 51;
               case 178 -> 1;
               case 179 -> 88;
               case 180 -> 192;
               case 181 -> 48;
               case 182 -> 11;
               case 183 -> 96;
               case 184 -> 245;
               case 185 -> 7;
               case 186 -> 212;
               case 187 -> 168;
               case 188 -> 91;
               case 189 -> 123;
               case 190 -> 173;
               case 191 -> 215;
               case 192 -> 229;
               case 193 -> 78;
               case 194 -> 79;
               case 195 -> 72;
               case 196 -> 230;
               case 197 -> 205;
               case 198 -> 167;
               case 199 -> 120;
               case 200 -> 15;
               case 201 -> 140;
               case 202 -> 166;
               case 203 -> 119;
               case 204 -> 154;
               case 205 -> 241;
               case 206 -> 40;
               case 207 -> 183;
               case 208 -> 249;
               case 209 -> 131;
               case 210 -> 90;
               case 211 -> 126;
               case 212 -> 164;
               case 213 -> 99;
               case 214 -> 200;
               case 215 -> 141;
               case 216 -> 240;
               case 217 -> 56;
               case 218 -> 70;
               case 219 -> 211;
               case 220 -> 182;
               case 221 -> 133;
               case 222 -> 129;
               case 223 -> 152;
               case 224 -> 105;
               case 225 -> 251;
               case 226 -> 246;
               case 227 -> 217;
               case 228 -> 74;
               case 229 -> 137;
               case 230 -> 216;
               case 231 -> 8;
               case 232 -> 163;
               case 233 -> 106;
               case 234 -> 150;
               case 235 -> 193;
               case 236 -> 243;
               case 237 -> 158;
               case 238 -> 22;
               case 239 -> 31;
               case 240 -> 225;
               case 241 -> 174;
               case 242 -> 116;
               case 243 -> 69;
               case 244 -> 3;
               case 245 -> 244;
               case 246 -> 37;
               case 247 -> 26;
               case 248 -> 187;
               case 249 -> 157;
               case 250 -> 242;
               case 251 -> 132;
               case 252 -> 16;
               case 253 -> 66;
               case 254 -> 199;
               default -> 127;
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
                var10002 = var3[var7];
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final List<Byte> a() {
         return llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }

   public static enum llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

      private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = {IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII};

      public static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] a() {
         return (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clone();
      }

      public static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
         String var0
      ) {
         return Enum.valueOf(
            llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> b() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = kotlin.enums.EnumEntriesKt.enumEntries(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
       private static final me.octo.client.utils.player.pathfinder.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] c() {
           me.octo.client.utils.player.pathfinder.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] var0 = new me.octo.client.utils.player.pathfinder.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[5];
           var0[0] = me.octo.client.utils.player.pathfinder.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
           var0[1] = me.octo.client.utils.player.pathfinder.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
           var0[2] = me.octo.client.utils.player.pathfinder.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
           var0[3] = me.octo.client.utils.player.pathfinder.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
           var0[4] = me.octo.client.utils.player.pathfinder.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
           return var0;
       }
   }
}
