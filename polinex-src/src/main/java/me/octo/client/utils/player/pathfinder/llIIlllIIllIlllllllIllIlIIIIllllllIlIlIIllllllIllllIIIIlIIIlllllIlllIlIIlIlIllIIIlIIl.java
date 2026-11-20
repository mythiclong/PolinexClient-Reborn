package me.octo.client.utils.player.pathfinder;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl;
import me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {

   @NotNull
   public static llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   public static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Minecraft lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   public static byte IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static byte IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static byte lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static byte IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static byte llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static byte lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static byte lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static byte lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static byte lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static byte IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static byte llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static byte IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static byte IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static byte IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static byte IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static byte llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static byte IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static byte lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static byte llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static byte lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static byte IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static byte IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static byte IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   public static int llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   public static int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   public static int IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static long IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static boolean lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static boolean lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @NotNull
   private static ArrayList<llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   @NotNull
   private static HashMap<Long, llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   @NotNull
   private static HashMap<Long, llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   @NotNull
   private static ArrayList<llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   @NotNull
   private static HashSet<Pair<Integer, Integer>> IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   @NotNull
   private static me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   @NotNull
   private static me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @NotNull
   private static AtomicBoolean lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @NotNull
   private static AtomicInteger IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   private static String[] a;
   private static String[] b;

   private llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl() {
   }

   public final boolean a() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void a(boolean var1) {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = 25973;
      short var10003 = 2435;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      if (NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
         me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
         me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
         if (var2 == 0) {
            if (var10 == lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI) {
               return;
            }

            var10 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g();
            var10001 = me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         if (var10 != var10001) {
            short var11 =((short)(( lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI) ? 1 : 0));
            if (var2 == 0) {
               if (lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI) {
                  return;
               }

               var11 =((short)(( lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI) ? 1 : 0));
            }

            if ((var11 == 0)) {
               return;
            }

            long var3 = System.nanoTime();
            lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g();
            lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = false;
            String var10004 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a();
            short var10005 = 25971;
            byte var10006 = -92;
            File var17 = new File(var10004, "pathfind-cache-v2");
            String var20 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
               .name();
            short var24 = 25980;
            var10005 = -29285;
            File var5 = new File(var17, var20 + ".dat");
            File var12 = var5;
            if (var2 == 0) {
               if (!var5.exists()) {
                  var11 = 25953;
                  short var16 = 9951;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "ERROR cache is not loaded for this island!"
                  );
                  lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = true;
                  lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = true;
                  return;
               }

               var12 = var5;
            }

            byte[] var6;
            try {
               var6 = Files.readAllBytes(var12.toPath());
            }
            catch (java.io.IOException iOException) {
               throw rethrowIoException(iOException);
            }
            int var7 = var6.length;
            NativePathFinder.loadCache(var6, var7);
            lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = true;
            lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = true;
            short var14 = 25959;
            var10002 = 14865;
            String var8 = "%.3f";
            Object[] var9 = new Object[]{(System.nanoTime() - var3) / 1000000.0};
            String var15 = String.format(var8, Arrays.copyOf(var9, var9.length));
            var10003 = 25962;
            short var25 = -4683;
            Intrinsics.checkNotNullExpressionValue(var15, "format(...)");
            var10002 = 25963;
            var10003 = -26416;
            var10003 = 25975;
            short var26 = -27072;
            short var27 = 25954;
            var10005 = -30446;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d(
               "Loaded " + var7 + " bytes of pathfinder data in " + var15 + " ms."
            );
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = 25956;
      short var10002 = 13459;
      Intrinsics.checkNotNullParameter(var1, "event");
      IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.clear();
      IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(
            me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = false;
      int var2 = var10000;
      if (var2 != 0) {
         if (!NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            return;
         }

         NativePathFinder.clearCache();
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var1) {
      Object var26 = null; // PX-FIX
      int var20 = 0; // PX-FIX
      int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var10000 = var1;
      if (var2 != 0) {
         short var10001 = 25956;
         short var10002 = 13459;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (!NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            return;
         }

         var10000 = var1;
      }

      BlockPos var19 = var10000.k();
      if (var19 != null) {
         BlockPos var3;
         label113: {
            var3 = var19;
            int var4 = var3.getY();
            var20 = 0;
            int var29 = var4;
            if (var2 != 0) {
               if (0 > var4) {
                  var20 = 0;
                  break label113;
               }

               var20 = var4;
               if (var2 == 0) {
                  break label113;
               }

               var29 = 257;
            }

            var20 = var20 < var29 ? 1 : 0;
         }

         if (var20 != 0) {
            int var6;
            long var7;
            int var18;
            label101: {
               var18 = var3.getX() >> 4;
               int var5 = var3.getY() >> 4;
               var6 = var3.getZ() >> 4;
               var7 = this.b(var18, var5, var6);
               Object var21 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
               Long var30 = var7;
               if (var2 != 0) {
                  if (((java.util.Map)var21).containsKey(var30)) {
                     break label101;
                  }

                  var21 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
                  var30 = var7;
               }

               ((java.util.Map)var21).put(
                  var30,
                  new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                     var18, var5, var6, new IntArrayList(), new ByteArrayList()
                  )
               );
            }

            BlockState var22 = var1.l();
            if (var22 == null) {
               return;
            }

            BlockState var9 = var22;
            if (var2 == 0) {
               return;
            }

            BlockState var23 = var1.m();
            if (var23 == null) {
               return;
            }

            BlockState var10 = var23;
            if (var2 == 0) {
               return;
            }

            if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.level == null) {
               return;
            }

            int var12;
            int var13;
            label121: {
               ClientLevel var11 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.level;
               var12 = var3.getX() & 15;
               var13 = var3.getZ() & 15;
               Object var24 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.get(var7);
               Intrinsics.checkNotNull(var24);
               ((llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var24)
                  .d()
                  .add(this.a(var12, var3.getY() & 15, var13));
               var24 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.get(var7);
               Intrinsics.checkNotNull(var24);
               ((llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var24)
                  .e()
                  .add(this.a(var10, var3, var11));
               var26 = var10.isAir();
               label79:
               if (var2 != 0) {
                  if (((Boolean)(var26))) {
                     var26 = var9.isAir();
                     if (var2 == 0) {
                        break label79;
                     }

                     if (!((Boolean)var26)) {
                        break label121;
                     }
                  }

                  var26 = var10.isAir();
               }

               if (var2 != 0) {
                  if (((Boolean)(var26))) {
                     return;
                  }

                  var26 = var9.isAir();
               }

               if (!((Boolean)var26)) {
                  return;
               }
            }

            long var14 = this.b(var18, 0, var6);
            short var27 = ((short)((IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.containsKey(var14)) ? 1 : 0));
            if (var2 != 0) {
               if (var27 == 0) {
                  IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.put(
                     var14,
                     new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                        var18, var6, new ShortArrayList()
                     )
                  );
               }

               var27 = (short)this.a(var12, 0, var13);
            }

            short var16 = var27;
            Object var28 = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.get(var14);
            Intrinsics.checkNotNull(var28);
            ShortArrayList var17 = ((llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var28)
               .c();
            if (var2 != 0 && !var17.contains(var16)) {
               var17.add(var16);
            }
         }
      }
   }

   @SubscribeEvent
   public final void b(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      int var10002 = 25956;
      int var10003 = 13459;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      short var22 = ((short)((NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0));
      if (var2 != 0) {
         if (!NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            return;
         }

         var22 =((short)(( lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI) ? 1 : 0));
      }

      if (var2 != 0) {
         if ((var22 == 0)) {
            return;
         }

         var22 =((short)(( lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI) ? 1 : 0));
      }

      if ((var22 != 0)) {
         label147: {
            me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var23 = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
            if (var2 != 0) {
               if (lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII
                  == IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g()) {
                  break label147;
               }

               var23 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g();
            }

            lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = var23;
            IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.clear();
         }

         lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.set(true);
         if (IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.get() == 0) {
            long var3 = System.nanoTime();
            boolean var5 = false;
            var22 = ((short)((IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.isEmpty()) ? 1 : 0));
            if (var2 != 0) {
               var22 = (((short)((var22 == 0) ? 1 : 0)));
            }

            if ((var22 != 0)) {
               Iterator var25 = IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.iterator();
               var10002 = (short)25978;
               var10003 = (short)17225;
               Intrinsics.checkNotNullExpressionValue(var25, "iterator(...)");
               Iterator var6 = var25;

               label135: {
                  while (var6.hasNext()) {
                     Object var26 = var6.next();
                     var10002 = (short)25969;
                     var10003 = (short)2660;
                     Intrinsics.checkNotNullExpressionValue(var26, "next(...)");
                     llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = (llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var26;
                     NativePathFinder.processChunk(var7.a(), var7.b(), var7.c());
                     if (var2 == 0) {
                        break label135;
                     }

                     if (var2 == 0) {
                        break;
                     }
                  }

                  IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.clear();
               }

               var5 = true;
            }

            me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[] var15 = new me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[]{
               me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            };
            var22 = ((short)((CollectionsKt.listOf(var15)
               .contains(
                  IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g()
               )) ? 1 : 0));
            if (var2 != 0) {
               if ((var22 == 0)) {
                  var22 = ((short)((IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.isEmpty()) ? 1 : 0));
                  if (var2 != 0) {
                     var22 = (((short)((var22 == 0) ? 1 : 0)));
                  }

                  if ((var22 != 0)) {
                     Iterator var29 = IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.iterator();
                     var10002 = (short)25983;
                     var10003 = (short)-13355;
                     Intrinsics.checkNotNullExpressionValue(var29, "iterator(...)");
                     Iterator var16 = var29;

                     while (true) {
                        if (var16.hasNext()) {
                           Object var30 = var16.next();
                           var10002 = (short)25955;
                           var10003 = (short)-27772;
                           Intrinsics.checkNotNullExpressionValue(var30, "next(...)");
                           llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var19 = (llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var30;
                           var22 = 25957;
                           IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.add(TuplesKt.to(var19.a(), var19.b()));
                           short var10001 = -19702;
                           this.a(var19.a(), var19.b(), var19.c());
                           var10002 = var19.a();
                           var10003 = var19.b();
                           String var12 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .g()
                              .name();
                           int var13 = var10003;
                           int var14 = var10002;
                           short var38 = 25968;
                           short var44 = -25937;
                           short var10004 = 25977;
                           short var10005 = 32018;
                           me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                              "Wrote chunk(x=" + var14 + ", z=" + var13 + ") for " + var12
                           );
                           if (var2 == 0) {
                              break;
                           }

                           if (var2 != 0) {
                              continue;
                           }
                        }

                        IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.clear();
                        break;
                     }

                     var5 = true;
                  }
               }

               var22 = ((short)((IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.isEmpty()) ? 1 : 0));
            }

            if (var2 != 0) {
               var22 = (((short)((var22 == 0) ? 1 : 0)));
            }

            if ((var22 != 0)) {
               Iterator var17 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.entrySet().iterator();

               label103: {
                  while (var17.hasNext()) {
                     llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = (llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)((Entry)var17.next())
                        .getValue();
                     IntArrayList var9 = var8.d();
                     ByteArrayList var10 = var8.e();
                     int var11 = var9.size();
                     NativePathFinder.updateChunk(var8.a(), var8.b(), var8.c(), var9.toArray(new int[var11]), var10.toArray(new byte[var11]), var11);
                     if (var2 == 0) {
                        break label103;
                     }

                     if (var2 == 0) {
                        break;
                     }
                  }

                  IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.clear();
               }

               var5 = true;
            }

            boolean var32 = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.isEmpty();
            if (var2 != 0) {
               var32 = !var32;
            }

            if (var32) {
               Iterator var18 = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.entrySet().iterator();

               label89: {
                  while (var18.hasNext()) {
                     llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var20 = (llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)((Entry)var18.next())
                        .getValue();
                     int var21 = var20.c().size();
                     NativePathFinder.updateHeights(var20.a(), var20.b(), var20.c().toArray(new short[var21]), var21);
                     if (var2 == 0) {
                        break label89;
                     }

                     if (var2 == 0) {
                        break;
                     }
                  }

                  IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.clear();
               }

               var5 = true;
            }

            if (var5) {
            }

            lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.set(false);
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl var1) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      short var10002 = 25956;
      short var10003 = 13459;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var2 = var10000;
      if (var2 == 0) {
         if (!NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
            return;
         }

         new Thread(() -> b(var1)).start();
      }
   }

   private final void a(int param1, int param2, ByteBuffer param3) {
      int var4 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
      java.io.File var5 = new java.io.File(me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(), "pathfind-cache-v2");
      if (var4 == 0) {
         if (!var5.exists()) {
            var5.mkdir();
         }
      }

      java.io.File var6 = var4 != 0 ? var5 : new java.io.File(var5, me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().name());
      if (var4 == 0) {
         if (!var6.exists()) {
            var6.mkdir();
         }
      }

      java.lang.String var7 = "chunk_" + param1 + "_" + param2 + ".dat";
      java.io.File var8 = new java.io.File(var6, var7);
      java.nio.ByteBuffer var9 = java.nio.ByteBuffer.allocateDirect(65544);
      var9.putInt(param1);
      var9.putInt(param2);
      param3.rewind();
      var9.put(param3);
      var9.flip();
      try {
         try (java.nio.channels.FileChannel var12 = java.nio.channels.FileChannel.open(var8.toPath(), new java.nio.file.OpenOption[]{java.nio.file.StandardOpenOption.WRITE, java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.TRUNCATE_EXISTING})) {
            while (var9.hasRemaining()) {
               var12.write(var9);
               if (var4 != 0) {
                  break;
               }
            }
         }
      } catch (java.io.IOException var13) {
         throw rethrowIoException(var13);
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Wrote data to: " + var7 + " for " + me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().name());
   }

   @SuppressWarnings("unchecked")
   private static <T extends Throwable> RuntimeException rethrowIoException(java.io.IOException exception) throws T {
      throw (T)exception;
   }

   @SuppressWarnings("unchecked")
   private static <T extends Throwable> RuntimeException rethrowInterruptedException(InterruptedException exception) throws T {
      throw (T)exception;
   }

   private final byte a(BlockState var1, BlockPos var2, BlockGetter var3) {
      Object var9 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      FluidState var10001 = var1.getFluidState();
      short var10003 = 25979;
      short var10004 = -25659;
      Intrinsics.checkNotNullExpressionValue(var10001, "getFluidState(...)");
      FluidState var5 = var10001;
      int var4 = var10000;
      int var8 = ((var1.isAir()) ? 1 : 0);
      if (var4 != 0) {
         if ((var8 != 0)) {
            return 0;
         }

         var8 = ((var5.isEmpty()) ? 1 : 0);
      }

      label169: {
         if (var4 != 0) {
            if ((var8 == 0)) {
               var8 = ((var5.is(Fluids.LAVA)) ? 1 : 0);
               if (var4 != 0) {
                  if (var8 == 0) {
                     var8 = ((var5.is(Fluids.FLOWING_LAVA)) ? 1 : 0);
                     if (var4 == 0) {
                        return (byte)(var8);
                     }

                     if (var8 == 0) {
                        return 14;
                     }
                  }

                  var8 = (byte)15;
               }

               return (byte)(var8);
            }

            var9 = var1;
            if (var4 == 0) {
               break label169;
            }

            var8 = ((var1.getCollisionShape(var3, var2).isEmpty()) ? 1 : 0);
         }

         if ((var8 != 0)) {
            return 0;
         }

         var9 = var1;
      }

      Block var10 = ((BlockState)var9).getBlock();
      short var10002 = 25974;
      var10003 = -25932;
      Intrinsics.checkNotNullExpressionValue(var10, "getBlock(...)");
      Block var6 = var10;
      var8 = ((var6 instanceof SlabBlock) ? 1 : 0);
      if (var4 != 0) {
         if (var8 != 0 && var1.getValue(SlabBlock.TYPE) == SlabType.BOTTOM) {
            return 2;
         }

         var8 = ((var6 instanceof StairBlock) ? 1 : 0);
      }

      if (var4 != 0) {
         if (var8 != 0) {
            Comparable var12 = var1.getValue(StairBlock.HALF);
            if (var4 != 0) {
               if (var12 != Half.BOTTOM) {
                  return 1;
               }

               var12 = var1.getValue(StairBlock.FACING);
            }

            var8 = ((int[])llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[((Direction)var12)
               .ordinal()];
            if (var4 != 0) {
               switch (var8) {
                  case 1:
                     return 17;
                  case 2:
                     return 18;
                  case 3:
                     return 19;
                  default:
                     var8 = 20;
               }
            }

            return (byte)var8;
         }

         var8 = ((var6 instanceof TrapDoorBlock) ? 1 : 0);
      }

      if (var4 != 0) {
         if (var8 != 0) {
            boolean var10005 = var1.getValue(TrapDoorBlock.OPEN);
            if (var4 != 0) {
               var8 = var10005 ? 22 : 21;
            }

            return (byte)var8;
         }

         var8 = ((var6 instanceof CarpetBlock) ? 1 : 0);
      }

      if (var4 != 0) {
         if (var8 != 0) {
            return 3;
         }

         var8 = ((var6 instanceof LadderBlock) ? 1 : 0);
      }

      if (var4 != 0) {
         if (var8 != 0) {
            return 16;
         }

         var8 = ((var6 instanceof FenceBlock) ? 1 : 0);
      }

      if (var4 != 0) {
         if (var8 == 0) {
            int var15 = ((var6 instanceof FenceGateBlock) ? 1 : 0);
            if (var4 == 0) {
               return (byte)var15;
            }

            label121:
            if (var15 == 0) {
               var15 = ((var6 instanceof WallBlock) ? 1 : 0);
               if (var4 != 0) {
                  if (var15 != 0) {
                     break label121;
                  }

                  var15 = ((var6 instanceof SnowLayerBlock) ? 1 : 0);
               }

               if (var4 != 0) {
                  if (var15 != 0) {
                     var15 = var1.getValue(SnowLayerBlock.LAYERS);
                     if (var4 != 0) {
                        switch (var15) {
                           case 1:
                              return 5;
                           case 2:
                              return 6;
                           case 3:
                              return 7;
                           case 4:
                              return 8;
                           case 5:
                              return 9;
                           case 6:
                              return 10;
                           case 7:
                              return 11;
                           default:
                              var15 = 12;
                        }
                     }

                     return (byte)var15;
                  }

                  var15 = ((Intrinsics.areEqual(var6, Blocks.SNOW_BLOCK)) ? 1 : 0);
               }

               if (var4 != 0) {
                  var15 = var15 != 0 ? 13 : 1;
               }

               return (byte)var15;
            }
         }

         var8 = (byte)4;
      }

      return (byte)(var8);
   }

   public final int a(int var1, int var2, int var3) {
      return var2 << 8 | var3 << 4 | var1;
   }

   private final long b(int var1, int var2, int var3) {
      return (var1 & 2097151L) << 42 | (var2 & 2097151L) << 21 | var3 & 2097151L;
   }

   private static final void b(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl var0) {
      int var10000 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.k();
      long var2 = System.nanoTime();
      int var1 = var10000;

      while (true) {
         if (lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.get()) {
            try {
               Thread.sleep(1L);
            }
            catch (InterruptedException exception) {
               throw rethrowInterruptedException(exception);
            }
            if (var1 == 0) {
               break;
            }

            if (var1 != 0) {
               continue;
            }
         }

         IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.addAndGet(1);
         break;
      }

      MutableBlockPos var4 = new MutableBlockPos();
      if (var1 != 0) {
         LevelChunk var15 = var0.l();
         if (var15 != null) {
            LevelChunk var5 = var15;
            int var6 = var5.getPos().x() * 16;
            int var7 = var5.getPos().z() * 16;
            ByteBuffer var8 = ByteBuffer.allocateDirect(65536).order(ByteOrder.nativeOrder());
            int var9 = 0;
            int var10 = 0;

            label72:
            while (true) {
               var10000 = var10;

               label69:
               while (var10000 < 256) {
                  var10000 = 0;
                  if (var1 == 0) {
                     break label72;
                  }

                  int var11 = 0;

                  while (var11 < 16) {
                     var10000 = 0;
                     if (var1 == 0) {
                        continue label69;
                     }

                     int var12 = 0;

                     while (true) {
                        if (var12 < 16) {
                           var4.set(var6 + var12, var10, var7 + var11);
                           llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var18 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           BlockState var10001 = var5.getBlockState(var4);
                           short var10003 = 25982;
                           short var10004 = -18682;
                           Intrinsics.checkNotNullExpressionValue(var10001, "getBlockState(...)");
                           byte var13 = var18.a(var10001, var4, var5);
                           var8.put(var9++, var13);
                           var12++;
                           if (var1 == 0) {
                              break;
                           }

                           if (var1 != 0) {
                              continue;
                           }
                        }

                        var11++;
                        break;
                     }

                     if (var1 == 0) {
                        break;
                     }
                  }

                  var10++;
                  if (var1 != 0) {
                     continue label72;
                  }
                  break;
               }

               var10 = var5.getPos().x();
               var10000 = var5.getPos().z();
               break;
            }

            int var14 = var10000;
            ArrayList var19 = IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
            Intrinsics.checkNotNull(var8);
            var19.add(
               new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  var10, var14, var8
               )
            );
            if (var1 != 0) {
               if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                  boolean var20 = IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.contains(TuplesKt.to(var10, var14));
                  if (var1 == 0) {
                     return;
                  }

                  if (!var20) {
                     IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.add(
                        new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var10, var14, var8
                        )
                     );
                  }
               }

               IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.addAndGet(-1);
            }

            return;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var23 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[27];
      int var3 = 0;
      String var2 = "ºH\u001dþß7;\u001b-¨\u009e\u0099\u0012]×Ð\u0000\u0006Ç¶Â\u000f\bù\t7\u0006}¯\u0010Å\u0005 ¦\u0004¨ã\u0086·\u001dY\u00916º\u0015:OèoÿåZRj\u000b\u0085åB\u009a6¾CV´4¬FÛq\r\u0087¿O®\u009fTu¾M¿xÒ)\u0005Ö\u00036d\u009b\u0004ú\u0017\u0095¬\u0012ZÚô\u0006èß\u0091\u0099áï¶\u0093\u001a¤ySªz\r£ü\u0015Åê\u0014{×\u0001¨ñ0\u0018\u0006@ø\"\u0086|\u0096\u0011±\u000b|\u0096ó:¾º\u009d\u009c\u0088\u001fÐ\u008d\u008fÊ\u000b\r\u0084Ûñ!v\u0088èDsÚ¿~Ñ\u0012\u0099v\u008c\u0097çszZ×ypAÂþb\u0018É\u0013\u0011òë\u0014\u008aþ¹\u001fÊ©\u0092\u000eÞ\u0000µ\u0095ÍH\u0004\u0014ôHÐ\t/\u0089~^pû\tg'\u0004£;c[*)\u00adÚ0ñdA\u0014\u0080ç¨YQx\u0093¸y\u0012m0â[~\u0003\u0091iXb\u000e*ÉÛJ\u0089)\u0098¶{x\u0000Â\u0086\u000f\u0097\u009e`I\u000b\u0017ÈzA# ½«s\n\u0004ÇI\nv\u0010\u008fqN|½xd®Ü»\u008f°ò\u0011F$\u000eÙI©³2Hè\u0098£X\u0016`X\u0018\u0005ïA\u0011,\u007f\u0007®©1\u0001îH0";
      int var4 = "ºH\u001dþß7;\u001b-¨\u009e\u0099\u0012]×Ð\u0000\u0006Ç¶Â\u000f\bù\t7\u0006}¯\u0010Å\u0005 ¦\u0004¨ã\u0086·\u001dY\u00916º\u0015:OèoÿåZRj\u000b\u0085åB\u009a6¾CV´4¬FÛq\r\u0087¿O®\u009fTu¾M¿xÒ)\u0005Ö\u00036d\u009b\u0004ú\u0017\u0095¬\u0012ZÚô\u0006èß\u0091\u0099áï¶\u0093\u001a¤ySªz\r£ü\u0015Åê\u0014{×\u0001¨ñ0\u0018\u0006@ø\"\u0086|\u0096\u0011±\u000b|\u0096ó:¾º\u009d\u009c\u0088\u001fÐ\u008d\u008fÊ\u000b\r\u0084Ûñ!v\u0088èDsÚ¿~Ñ\u0012\u0099v\u008c\u0097çszZ×ypAÂþb\u0018É\u0013\u0011òë\u0014\u008aþ¹\u001fÊ©\u0092\u000eÞ\u0000µ\u0095ÍH\u0004\u0014ôHÐ\t/\u0089~^pû\tg'\u0004£;c[*)\u00adÚ0ñdA\u0014\u0080ç¨YQx\u0093¸y\u0012m0â[~\u0003\u0091iXb\u000e*ÉÛJ\u0089)\u0098¶{x\u0000Â\u0086\u000f\u0097\u009e`I\u000b\u0017ÈzA# ½«s\n\u0004ÇI\nv\u0010\u008fqN|½xd®Ü»\u008f°ò\u0011F$\u000eÙI©³2Hè\u0098£X\u0016`X\u0018\u0005ïA\u0011,\u007f\u0007®©1\u0001îH0"
         .length();
      char var1 = 17;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 73;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var6 = 0;
               byte var31 = (byte)var10000;
               var23 = var28;
               int var16 = var10004;
               byte var37;
               char[] var41;
               int var10006;
               if (var10004 <= 1) {
                  var41 = var28;
                  var37 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var31 = (byte)var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var41 = var28;
                  var37 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var41[var10006] = (char)(var41[var10006] ^ var37 ^ switch (var6 % 7) {
                     case 0 -> 113;
                     case 1 -> 45;
                     case 2 -> 14;
                     case 3 -> 23;
                     case 4 -> 65;
                     case 5 -> 102;
                     default -> 76;
                  });
                  var6++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var41 = var23;
                     var37 = var31;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var41 = var23;
                     var37 = var31;
                     var10006 = var6;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var33;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[27];
                     var10000 = 25981;
                     short var18 = 19994;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "pathfind-cache-v2";
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl();
                     Minecraft var11 = Minecraft.getInstance();
                     var10002 = 25958;
                     short var34 = -11212;
                     Intrinsics.checkNotNullExpressionValue(var11, "getInstance(...)");
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var11;
                     lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = true;
                     IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new ArrayList<>();
                     IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = new HashMap<>();
                     IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = new HashMap<>();
                     IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = new ArrayList<>();
                     IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = new HashSet<>();
                     lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = new AtomicBoolean(false);
                     IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = new AtomicInteger(0);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var33;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u009e\u0003qg©\u0086nã0Ã,\u0005\u008b÷@Îp";
                  var4 = "\u009e\u0003qg©\u0086nã0Ã,\u0005\u008b÷@Îp".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 80;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 25971) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 195;
            case 1 -> 219;
            case 2 -> 36;
            case 3 -> 4;
            case 4 -> 213;
            case 5 -> 78;
            case 6 -> 76;
            case 7 -> 181;
            case 8 -> 51;
            case 9 -> 127;
            case 10 -> 22;
            case 11 -> 224;
            case 12 -> 203;
            case 13 -> 126;
            case 14 -> 124;
            case 15 -> 3;
            case 16 -> 63;
            case 17 -> 139;
            case 18 -> 233;
            case 19 -> 45;
            case 20 -> 175;
            case 21 -> 230;
            case 22 -> 211;
            case 23 -> 11;
            case 24 -> 117;
            case 25 -> 34;
            case 26 -> 134;
            case 27 -> 93;
            case 28 -> 66;
            case 29 -> 20;
            case 30 -> 196;
            case 31 -> 6;
            case 32 -> 234;
            case 33 -> 223;
            case 34 -> 109;
            case 35 -> 131;
            case 36 -> 102;
            case 37 -> 121;
            case 38 -> 59;
            case 39 -> 95;
            case 40 -> 239;
            case 41 -> 130;
            case 42 -> 174;
            case 43 -> 123;
            case 44 -> 153;
            case 45 -> 202;
            case 46 -> 77;
            case 47 -> 190;
            case 48 -> 199;
            case 49 -> 57;
            case 50 -> 144;
            case 51 -> 24;
            case 52 -> 170;
            case 53 -> 242;
            case 54 -> 236;
            case 55 -> 107;
            case 56 -> 143;
            case 57 -> 120;
            case 58 -> 128;
            case 59 -> 32;
            case 60 -> 247;
            case 61 -> 228;
            case 62 -> 215;
            case 63 -> 25;
            case 64 -> 122;
            case 65 -> 151;
            case 66 -> 116;
            case 67 -> 41;
            case 68 -> 161;
            case 69 -> 58;
            case 70 -> 253;
            case 71 -> 82;
            case 72 -> 30;
            case 73 -> 194;
            case 74 -> 157;
            case 75 -> 108;
            case 76 -> 168;
            case 77 -> 226;
            case 78 -> 169;
            case 79 -> 23;
            case 80 -> 48;
            case 81 -> 240;
            case 82 -> 183;
            case 83 -> 249;
            case 84 -> 216;
            case 85 -> 137;
            case 86 -> 49;
            case 87 -> 119;
            case 88 -> 21;
            case 89 -> 222;
            case 90 -> 141;
            case 91 -> 17;
            case 92 -> 206;
            case 93 -> 85;
            case 94 -> 98;
            case 95 -> 81;
            case 96 -> 189;
            case 97 -> 255;
            case 98 -> 192;
            case 99 -> 73;
            case 100 -> 112;
            case 101 -> 47;
            case 102 -> 90;
            case 103 -> 163;
            case 104 -> 166;
            case 105 -> 244;
            case 106 -> 33;
            case 107 -> 52;
            case 108 -> 200;
            case 109 -> 113;
            case 110 -> 232;
            case 111 -> 28;
            case 112 -> 133;
            case 113 -> 197;
            case 114 -> 42;
            case 115 -> 104;
            case 116 -> 19;
            case 117 -> 26;
            case 118 -> 179;
            case 119 -> 140;
            case 120 -> 193;
            case 121 -> 38;
            case 122 -> 7;
            case 123 -> 83;
            case 124 -> 159;
            case 125 -> 118;
            case 126 -> 210;
            case 127 -> 44;
            case 128 -> 186;
            case 129 -> 5;
            case 130 -> 178;
            case 131 -> 56;
            case 132 -> 125;
            case 133 -> 156;
            case 134 -> 129;
            case 135 -> 110;
            case 136 -> 65;
            case 137 -> 114;
            case 138 -> 94;
            case 139 -> 152;
            case 140 -> 149;
            case 141 -> 173;
            case 142 -> 60;
            case 143 -> 209;
            case 144 -> 243;
            case 145 -> 165;
            case 146 -> 136;
            case 147 -> 61;
            case 148 -> 164;
            case 149 -> 201;
            case 150 -> 246;
            case 151 -> 241;
            case 152 -> 217;
            case 153 -> 254;
            case 154 -> 10;
            case 155 -> 87;
            case 156 -> 205;
            case 157 -> 235;
            case 158 -> 188;
            case 159 -> 212;
            case 160 -> 138;
            case 161 -> 64;
            case 162 -> 86;
            case 163 -> 191;
            case 164 -> 147;
            case 165 -> 132;
            case 166 -> 245;
            case 167 -> 154;
            case 168 -> 155;
            case 169 -> 62;
            case 170 -> 180;
            case 171 -> 105;
            case 172 -> 12;
            case 173 -> 158;
            case 174 -> 92;
            case 175 -> 1;
            case 176 -> 176;
            case 177 -> 218;
            case 178 -> 31;
            case 179 -> 101;
            case 180 -> 251;
            case 181 -> 227;
            case 182 -> 106;
            case 183 -> 100;
            case 184 -> 74;
            case 185 -> 71;
            case 186 -> 148;
            case 187 -> 54;
            case 188 -> 0;
            case 189 -> 91;
            case 190 -> 142;
            case 191 -> 220;
            case 192 -> 238;
            case 193 -> 15;
            case 194 -> 177;
            case 195 -> 198;
            case 196 -> 185;
            case 197 -> 67;
            case 198 -> 80;
            case 199 -> 35;
            case 200 -> 146;
            case 201 -> 70;
            case 202 -> 96;
            case 203 -> 187;
            case 204 -> 204;
            case 205 -> 50;
            case 206 -> 184;
            case 207 -> 214;
            case 208 -> 103;
            case 209 -> 2;
            case 210 -> 88;
            case 211 -> 135;
            case 212 -> 37;
            case 213 -> 237;
            case 214 -> 167;
            case 215 -> 225;
            case 216 -> 16;
            case 217 -> 18;
            case 218 -> 115;
            case 219 -> 8;
            case 220 -> 46;
            case 221 -> 252;
            case 222 -> 69;
            case 223 -> 231;
            case 224 -> 182;
            case 225 -> 84;
            case 226 -> 207;
            case 227 -> 40;
            case 228 -> 27;
            case 229 -> 229;
            case 230 -> 89;
            case 231 -> 162;
            case 232 -> 208;
            case 233 -> 171;
            case 234 -> 172;
            case 235 -> 53;
            case 236 -> 145;
            case 237 -> 79;
            case 238 -> 248;
            case 239 -> 29;
            case 240 -> 97;
            case 241 -> 160;
            case 242 -> 68;
            case 243 -> 39;
            case 244 -> 111;
            case 245 -> 43;
            case 246 -> 250;
            case 247 -> 99;
            case 248 -> 75;
            case 249 -> 9;
            case 250 -> 221;
            case 251 -> 13;
            case 252 -> 150;
            case 253 -> 72;
            case 254 -> 14;
            default -> 55;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final ShortArrayList IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(int var1, int var2, @NotNull ShortArrayList var3) {
         short var10001 = 429;
         short var10002 = 28228;
         Intrinsics.checkNotNullParameter(var3, "indices");
         super();
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

      @NotNull
      public final ShortArrayList c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final ShortArrayList f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         int var1, int var2, @NotNull ShortArrayList var3
      ) {
         short var10001 = 431;
         short var10002 = 20895;
         Intrinsics.checkNotNullParameter(var3, "indices");
         return new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 428;
         ShortArrayList var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -12423;
         short var10002 = 427;
         short var10003 = -10294;
         short var10004 = 430;
         short var10005 = -6827;
         return "HeightChunkChange(cx=" + var3 + ", cz=" + var2 + ", indices=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var4 = null; // PX-FIX
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
               var10000 instanceof llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         label48: {
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var2 != 0) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  return false;
               }

               var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var2 == 0) {
                  break label48;
               }

               var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((Boolean)var4 != ((var10001 == 0))) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != 0) {
            if (((Boolean)(var4))) {
               return false;
            }

            var4 = 1;
         }

         return (boolean)var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "fa®\u0097Uþq\nð>\u009cü¸x;\u009dÖ\u0005\u0007?@\u0085³0zÝ";
         int var4 = "fa®\u0097Uþq\nð>\u009cü¸x;\u009dÖ\u0005\u0007?@\u0085³0zÝ".length();
         char var1 = 7;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 99;
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
                        case 0 -> 48;
                        case 1 -> 98;
                        case 2 -> 75;
                        case 3 -> 50;
                        case 4 -> 109;
                        case 5 -> 100;
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
                        b = new String[5];
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

                     var2 = "¢\u0003éhÍ\bï÷¹`!0°<y·|óùÑ}\u0005\u0089Ên¡#";
                     var4 = "¢\u0003éhÍ\bï÷¹`!0°<y·|óùÑ}\u0005\u0089Ên¡#".length();
                     var1 = 21;
                     var8 = -1;
               }

               var10000 = 63;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 431) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 34;
               case 1 -> 132;
               case 2 -> 93;
               case 3 -> 168;
               case 4 -> 231;
               case 5 -> 118;
               case 6 -> 248;
               case 7 -> 3;
               case 8 -> 13;
               case 9 -> 120;
               case 10 -> 218;
               case 11 -> 192;
               case 12 -> 233;
               case 13 -> 232;
               case 14 -> 133;
               case 15 -> 110;
               case 16 -> 190;
               case 17 -> 41;
               case 18 -> 77;
               case 19 -> 250;
               case 20 -> 161;
               case 21 -> 140;
               case 22 -> 142;
               case 23 -> 91;
               case 24 -> 101;
               case 25 -> 156;
               case 26 -> 185;
               case 27 -> 184;
               case 28 -> 112;
               case 29 -> 226;
               case 30 -> 83;
               case 31 -> 8;
               case 32 -> 62;
               case 33 -> 2;
               case 34 -> 103;
               case 35 -> 18;
               case 36 -> 10;
               case 37 -> 219;
               case 38 -> 193;
               case 39 -> 82;
               case 40 -> 0;
               case 41 -> 66;
               case 42 -> 214;
               case 43 -> 39;
               case 44 -> 141;
               case 45 -> 14;
               case 46 -> 238;
               case 47 -> 197;
               case 48 -> 153;
               case 49 -> 50;
               case 50 -> 245;
               case 51 -> 229;
               case 52 -> 199;
               case 53 -> 67;
               case 54 -> 92;
               case 55 -> 84;
               case 56 -> 209;
               case 57 -> 105;
               case 58 -> 207;
               case 59 -> 78;
               case 60 -> 246;
               case 61 -> 247;
               case 62 -> 107;
               case 63 -> 152;
               case 64 -> 42;
               case 65 -> 126;
               case 66 -> 216;
               case 67 -> 89;
               case 68 -> 52;
               case 69 -> 54;
               case 70 -> 171;
               case 71 -> 187;
               case 72 -> 194;
               case 73 -> 160;
               case 74 -> 174;
               case 75 -> 255;
               case 76 -> 186;
               case 77 -> 251;
               case 78 -> 99;
               case 79 -> 217;
               case 80 -> 224;
               case 81 -> 235;
               case 82 -> 28;
               case 83 -> 23;
               case 84 -> 19;
               case 85 -> 227;
               case 86 -> 100;
               case 87 -> 188;
               case 88 -> 88;
               case 89 -> 167;
               case 90 -> 73;
               case 91 -> 113;
               case 92 -> 46;
               case 93 -> 96;
               case 94 -> 204;
               case 95 -> 26;
               case 96 -> 131;
               case 97 -> 108;
               case 98 -> 139;
               case 99 -> 254;
               case 100 -> 215;
               case 101 -> 24;
               case 102 -> 178;
               case 103 -> 230;
               case 104 -> 1;
               case 105 -> 37;
               case 106 -> 15;
               case 107 -> 236;
               case 108 -> 63;
               case 109 -> 11;
               case 110 -> 208;
               case 111 -> 134;
               case 112 -> 65;
               case 113 -> 144;
               case 114 -> 243;
               case 115 -> 27;
               case 116 -> 106;
               case 117 -> 74;
               case 118 -> 225;
               case 119 -> 158;
               case 120 -> 61;
               case 121 -> 150;
               case 122 -> 239;
               case 123 -> 166;
               case 124 -> 119;
               case 125 -> 143;
               case 126 -> 136;
               case 127 -> 25;
               case 128 -> 47;
               case 129 -> 104;
               case 130 -> 191;
               case 131 -> 177;
               case 132 -> 76;
               case 133 -> 55;
               case 134 -> 32;
               case 135 -> 147;
               case 136 -> 176;
               case 137 -> 97;
               case 138 -> 181;
               case 139 -> 203;
               case 140 -> 252;
               case 141 -> 173;
               case 142 -> 124;
               case 143 -> 228;
               case 144 -> 116;
               case 145 -> 5;
               case 146 -> 151;
               case 147 -> 7;
               case 148 -> 59;
               case 149 -> 220;
               case 150 -> 165;
               case 151 -> 117;
               case 152 -> 175;
               case 153 -> 210;
               case 154 -> 234;
               case 155 -> 195;
               case 156 -> 58;
               case 157 -> 20;
               case 158 -> 114;
               case 159 -> 68;
               case 160 -> 122;
               case 161 -> 115;
               case 162 -> 123;
               case 163 -> 198;
               case 164 -> 128;
               case 165 -> 90;
               case 166 -> 16;
               case 167 -> 200;
               case 168 -> 241;
               case 169 -> 56;
               case 170 -> 75;
               case 171 -> 182;
               case 172 -> 146;
               case 173 -> 148;
               case 174 -> 222;
               case 175 -> 138;
               case 176 -> 130;
               case 177 -> 240;
               case 178 -> 71;
               case 179 -> 109;
               case 180 -> 201;
               case 181 -> 213;
               case 182 -> 159;
               case 183 -> 145;
               case 184 -> 125;
               case 185 -> 33;
               case 186 -> 79;
               case 187 -> 98;
               case 188 -> 180;
               case 189 -> 172;
               case 190 -> 169;
               case 191 -> 179;
               case 192 -> 163;
               case 193 -> 162;
               case 194 -> 157;
               case 195 -> 249;
               case 196 -> 40;
               case 197 -> 154;
               case 198 -> 31;
               case 199 -> 69;
               case 200 -> 43;
               case 201 -> 60;
               case 202 -> 21;
               case 203 -> 51;
               case 204 -> 183;
               case 205 -> 189;
               case 206 -> 49;
               case 207 -> 44;
               case 208 -> 48;
               case 209 -> 102;
               case 210 -> 223;
               case 211 -> 4;
               case 212 -> 111;
               case 213 -> 94;
               case 214 -> 17;
               case 215 -> 244;
               case 216 -> 80;
               case 217 -> 164;
               case 218 -> 202;
               case 219 -> 253;
               case 220 -> 211;
               case 221 -> 137;
               case 222 -> 87;
               case 223 -> 206;
               case 224 -> 205;
               case 225 -> 30;
               case 226 -> 221;
               case 227 -> 196;
               case 228 -> 149;
               case 229 -> 45;
               case 230 -> 135;
               case 231 -> 22;
               case 232 -> 129;
               case 233 -> 170;
               case 234 -> 57;
               case 235 -> 121;
               case 236 -> 212;
               case 237 -> 242;
               case 238 -> 9;
               case 239 -> 155;
               case 240 -> 86;
               case 241 -> 72;
               case 242 -> 12;
               case 243 -> 127;
               case 244 -> 36;
               case 245 -> 38;
               case 246 -> 85;
               case 247 -> 95;
               case 248 -> 64;
               case 249 -> 70;
               case 250 -> 237;
               case 251 -> 6;
               case 252 -> 29;
               case 253 -> 81;
               case 254 -> 35;
               default -> 53;
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
      public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll o, int var1, int var2, it.unimi.dsi.fastutil.shorts.ShortArrayList var3, int var4, Object var5) {
         short mask = 0;
         if ((mask & 1) != 0) var1 = o.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((mask & 2) != 0) var2 = o.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((mask & 4) != 0) var3 = o.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         return o.a(var1, var2, var3);
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final IntArrayList lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final ByteArrayList IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         int var1, int var2, int var3, @NotNull IntArrayList var4, @NotNull ByteArrayList var5
      ) {
         short var10001 = 16135;
         short var10002 = 11810;
         Intrinsics.checkNotNullParameter(var4, "indices");
         var10001 = 16128;
         var10002 = 25383;
         Intrinsics.checkNotNullParameter(var5, "states");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
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

      @NotNull
      public final IntArrayList d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final ByteArrayList e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IntArrayList i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final ByteArrayList j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1, int var2, int var3, @NotNull IntArrayList var4, @NotNull ByteArrayList var5
      ) {
         short var10001 = 16137;
         short var10002 = -15879;
         Intrinsics.checkNotNullParameter(var4, "indices");
         var10001 = 16129;
         var10002 = 28303;
         Intrinsics.checkNotNullParameter(var5, "states");
         return new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 16134;
         ByteArrayList var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         IntArrayList var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 18625;
         short var10002 = 16132;
         short var10003 = -5528;
         short var10004 = 16131;
         short var10005 = 8065;
         short var10006 = 16133;
         short var10007 = -1073;
         short var10008 = 16130;
         short var10009 = 2574;
         return "ChunkChange(cx=" + var5 + ", cy=" + var4 + ", cz=" + var3 + ", indices=" + var2 + ", states=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
         return var1 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 == 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label64: {
            if (var2 == 0) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var2 != 0) {
                  break label64;
               }

               var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[9];
         int var3 = 0;
         String var2 = "\u009bcRDZ\b\u0006\u0007ZÁc(ì\u0005÷\u0007i\u0018'\t\u0099\u008f´\u0007Ògþ\u0014\u0004\nÏ\u0081dÜ\u0094X\u0095[áÂ\u0005¸(\u0080þ\u001a\u0007°¥kØÞ3+";
         int var4 = "\u009bcRDZ\b\u0006\u0007ZÁc(ì\u0005÷\u0007i\u0018'\t\u0099\u008f´\u0007Ògþ\u0014\u0004\nÏ\u0081dÜ\u0094X\u0095[áÂ\u0005¸(\u0080þ\u001a\u0007°¥kØÞ3+"
            .length();
         char var1 = 6;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 45;
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
                        case 0 -> 84;
                        case 1 -> 74;
                        case 2 -> 95;
                        case 3 -> 103;
                        case 4 -> 91;
                        case 5 -> 109;
                        default -> 111;
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
                        b = new String[9];
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

                     var2 = "¹3È7mó³¹®¼Iðv;q\u0007L\u001d\b3N²Å";
                     var4 = "¹3È7mó³¹®¼Iðv;q\u0007L\u001d\b3N²Å".length();
                     var1 = 15;
                     var8 = -1;
               }

               var10000 = 50;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 16129) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 12;
               case 1 -> 84;
               case 2 -> 115;
               case 3 -> 146;
               case 4 -> 36;
               case 5 -> 189;
               case 6 -> 228;
               case 7 -> 230;
               case 8 -> 218;
               case 9 -> 35;
               case 10 -> 9;
               case 11 -> 25;
               case 12 -> 89;
               case 13 -> 6;
               case 14 -> 24;
               case 15 -> 174;
               case 16 -> 246;
               case 17 -> 52;
               case 18 -> 15;
               case 19 -> 147;
               case 20 -> 110;
               case 21 -> 47;
               case 22 -> 10;
               case 23 -> 216;
               case 24 -> 171;
               case 25 -> 3;
               case 26 -> 160;
               case 27 -> 0;
               case 28 -> 102;
               case 29 -> 113;
               case 30 -> 151;
               case 31 -> 219;
               case 32 -> 195;
               case 33 -> 22;
               case 34 -> 161;
               case 35 -> 192;
               case 36 -> 252;
               case 37 -> 212;
               case 38 -> 172;
               case 39 -> 99;
               case 40 -> 76;
               case 41 -> 153;
               case 42 -> 182;
               case 43 -> 79;
               case 44 -> 111;
               case 45 -> 239;
               case 46 -> 70;
               case 47 -> 14;
               case 48 -> 8;
               case 49 -> 154;
               case 50 -> 90;
               case 51 -> 55;
               case 52 -> 93;
               case 53 -> 131;
               case 54 -> 233;
               case 55 -> 23;
               case 56 -> 167;
               case 57 -> 1;
               case 58 -> 217;
               case 59 -> 253;
               case 60 -> 178;
               case 61 -> 179;
               case 62 -> 200;
               case 63 -> 199;
               case 64 -> 42;
               case 65 -> 50;
               case 66 -> 145;
               case 67 -> 201;
               case 68 -> 83;
               case 69 -> 61;
               case 70 -> 88;
               case 71 -> 72;
               case 72 -> 173;
               case 73 -> 119;
               case 74 -> 106;
               case 75 -> 103;
               case 76 -> 58;
               case 77 -> 236;
               case 78 -> 181;
               case 79 -> 177;
               case 80 -> 80;
               case 81 -> 142;
               case 82 -> 191;
               case 83 -> 32;
               case 84 -> 13;
               case 85 -> 62;
               case 86 -> 56;
               case 87 -> 134;
               case 88 -> 224;
               case 89 -> 21;
               case 90 -> 140;
               case 91 -> 49;
               case 92 -> 46;
               case 93 -> 255;
               case 94 -> 245;
               case 95 -> 54;
               case 96 -> 196;
               case 97 -> 163;
               case 98 -> 77;
               case 99 -> 144;
               case 100 -> 31;
               case 101 -> 44;
               case 102 -> 162;
               case 103 -> 69;
               case 104 -> 126;
               case 105 -> 198;
               case 106 -> 169;
               case 107 -> 94;
               case 108 -> 19;
               case 109 -> 190;
               case 110 -> 11;
               case 111 -> 139;
               case 112 -> 136;
               case 113 -> 185;
               case 114 -> 20;
               case 115 -> 215;
               case 116 -> 108;
               case 117 -> 241;
               case 118 -> 187;
               case 119 -> 101;
               case 120 -> 63;
               case 121 -> 18;
               case 122 -> 243;
               case 123 -> 137;
               case 124 -> 183;
               case 125 -> 158;
               case 126 -> 26;
               case 127 -> 68;
               case 128 -> 138;
               case 129 -> 248;
               case 130 -> 17;
               case 131 -> 65;
               case 132 -> 150;
               case 133 -> 132;
               case 134 -> 237;
               case 135 -> 168;
               case 136 -> 118;
               case 137 -> 244;
               case 138 -> 40;
               case 139 -> 2;
               case 140 -> 43;
               case 141 -> 157;
               case 142 -> 223;
               case 143 -> 211;
               case 144 -> 117;
               case 145 -> 38;
               case 146 -> 73;
               case 147 -> 194;
               case 148 -> 184;
               case 149 -> 156;
               case 150 -> 235;
               case 151 -> 82;
               case 152 -> 64;
               case 153 -> 98;
               case 154 -> 220;
               case 155 -> 28;
               case 156 -> 104;
               case 157 -> 175;
               case 158 -> 207;
               case 159 -> 209;
               case 160 -> 107;
               case 161 -> 203;
               case 162 -> 159;
               case 163 -> 186;
               case 164 -> 109;
               case 165 -> 213;
               case 166 -> 85;
               case 167 -> 112;
               case 168 -> 95;
               case 169 -> 208;
               case 170 -> 170;
               case 171 -> 152;
               case 172 -> 148;
               case 173 -> 222;
               case 174 -> 39;
               case 175 -> 135;
               case 176 -> 176;
               case 177 -> 249;
               case 178 -> 204;
               case 179 -> 127;
               case 180 -> 210;
               case 181 -> 60;
               case 182 -> 53;
               case 183 -> 51;
               case 184 -> 105;
               case 185 -> 92;
               case 186 -> 231;
               case 187 -> 75;
               case 188 -> 225;
               case 189 -> 206;
               case 190 -> 16;
               case 191 -> 129;
               case 192 -> 205;
               case 193 -> 123;
               case 194 -> 97;
               case 195 -> 180;
               case 196 -> 128;
               case 197 -> 7;
               case 198 -> 234;
               case 199 -> 41;
               case 200 -> 48;
               case 201 -> 130;
               case 202 -> 100;
               case 203 -> 202;
               case 204 -> 116;
               case 205 -> 247;
               case 206 -> 155;
               case 207 -> 166;
               case 208 -> 143;
               case 209 -> 197;
               case 210 -> 188;
               case 211 -> 86;
               case 212 -> 30;
               case 213 -> 114;
               case 214 -> 242;
               case 215 -> 57;
               case 216 -> 149;
               case 217 -> 227;
               case 218 -> 45;
               case 219 -> 240;
               case 220 -> 87;
               case 221 -> 229;
               case 222 -> 221;
               case 223 -> 37;
               case 224 -> 66;
               case 225 -> 214;
               case 226 -> 254;
               case 227 -> 5;
               case 228 -> 78;
               case 229 -> 96;
               case 230 -> 141;
               case 231 -> 122;
               case 232 -> 71;
               case 233 -> 193;
               case 234 -> 250;
               case 235 -> 67;
               case 236 -> 4;
               case 237 -> 226;
               case 238 -> 238;
               case 239 -> 29;
               case 240 -> 74;
               case 241 -> 33;
               case 242 -> 121;
               case 243 -> 165;
               case 244 -> 27;
               case 245 -> 81;
               case 246 -> 91;
               case 247 -> 164;
               case 248 -> 251;
               case 249 -> 232;
               case 250 -> 133;
               case 251 -> 120;
               case 252 -> 59;
               case 253 -> 125;
               case 254 -> 124;
               default -> 34;
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
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI o, int var1, int var2, int var3, it.unimi.dsi.fastutil.ints.IntArrayList var4, it.unimi.dsi.fastutil.bytes.ByteArrayList var5, int var6, Object var7) {
         short mask = 0;
         if ((mask & 1) != 0) var1 = o.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((mask & 2) != 0) var2 = o.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((mask & 4) != 0) var3 = o.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((mask & 8) != 0) var4 = o.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if ((mask & 16) != 0) var5 = o.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         return o.a(var1, var2, var3, var4, var5);
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final ByteBuffer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int var1, int var2, @NotNull ByteBuffer var3) {
         short var10001 = 14352;
         short var10002 = -293;
         Intrinsics.checkNotNullParameter(var3, "stateBuffer");
         super();
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

      @NotNull
      public final ByteBuffer c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final ByteBuffer f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, int var2, @NotNull ByteBuffer var3
      ) {
         short var10001 = 14355;
         short var10002 = -13284;
         Intrinsics.checkNotNullParameter(var3, "stateBuffer");
         return new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 14354;
         ByteBuffer var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -10993;
         short var10002 = 14353;
         short var10003 = -28519;
         short var10004 = 14359;
         short var10005 = -18434;
         return "Chunk(cx=" + var3 + ", cz=" + var2 + ", stateBuffer=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var4 = null; // PX-FIX
         int var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.PXEvMid.j();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         label48: {
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var2 == 0) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  return false;
               }

               var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var2 != 0) {
                  break label48;
               }

               var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((Boolean)var4 != ((var10001 == 0))) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == 0) {
            if (((Boolean)(var4))) {
               return false;
            }

            var4 = 1;
         }

         return (boolean)var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "ÄUs\u0017¥\u0088?ÅéàÖ\tûl¶µ\u0085ïâ\u0010Ý\u0005n\u001b\u0090\u000eÃ";
         int var4 = "ÄUs\u0017¥\u0088?ÅéàÖ\tûl¶µ\u0085ïâ\u0010Ý\u0005n\u001b\u0090\u000eÃ".length();
         char var1 = 11;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 4;
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
                        case 0 -> 18;
                        case 1 -> 116;
                        case 2 -> 81;
                        case 3 -> 57;
                        case 4 -> 77;
                        case 5 -> 113;
                        default -> 26;
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

                     var2 = "¾ú.ð\u001cf\u001a\n_\u000b\u0012\u000e¥\bëpð@\u0013\u001a\u007fªskv¼";
                     var4 = "¾ú.ð\u001cf\u001a\n_\u000b\u0012\u000e¥\bëpð@\u0013\u001a\u007fªskv¼".length();
                     var1 = 11;
                     var8 = -1;
               }

               var10000 = 20;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 14355) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 44;
               case 1 -> 116;
               case 2 -> 161;
               case 3 -> 201;
               case 4 -> 194;
               case 5 -> 13;
               case 6 -> 203;
               case 7 -> 205;
               case 8 -> 91;
               case 9 -> 96;
               case 10 -> 210;
               case 11 -> 43;
               case 12 -> 198;
               case 13 -> 101;
               case 14 -> 230;
               case 15 -> 88;
               case 16 -> 134;
               case 17 -> 207;
               case 18 -> 85;
               case 19 -> 66;
               case 20 -> 108;
               case 21 -> 0;
               case 22 -> 39;
               case 23 -> 74;
               case 24 -> 254;
               case 25 -> 20;
               case 26 -> 26;
               case 27 -> 57;
               case 28 -> 32;
               case 29 -> 110;
               case 30 -> 62;
               case 31 -> 140;
               case 32 -> 124;
               case 33 -> 151;
               case 34 -> 130;
               case 35 -> 120;
               case 36 -> 42;
               case 37 -> 141;
               case 38 -> 4;
               case 39 -> 248;
               case 40 -> 172;
               case 41 -> 144;
               case 42 -> 165;
               case 43 -> 3;
               case 44 -> 164;
               case 45 -> 190;
               case 46 -> 211;
               case 47 -> 189;
               case 48 -> 229;
               case 49 -> 114;
               case 50 -> 192;
               case 51 -> 56;
               case 52 -> 217;
               case 53 -> 136;
               case 54 -> 250;
               case 55 -> 214;
               case 56 -> 158;
               case 57 -> 160;
               case 58 -> 242;
               case 59 -> 175;
               case 60 -> 128;
               case 61 -> 9;
               case 62 -> 188;
               case 63 -> 112;
               case 64 -> 63;
               case 65 -> 245;
               case 66 -> 197;
               case 67 -> 121;
               case 68 -> 38;
               case 69 -> 246;
               case 70 -> 105;
               case 71 -> 183;
               case 72 -> 187;
               case 73 -> 12;
               case 74 -> 54;
               case 75 -> 94;
               case 76 -> 171;
               case 77 -> 37;
               case 78 -> 178;
               case 79 -> 218;
               case 80 -> 122;
               case 81 -> 87;
               case 82 -> 202;
               case 83 -> 72;
               case 84 -> 182;
               case 85 -> 252;
               case 86 -> 247;
               case 87 -> 90;
               case 88 -> 137;
               case 89 -> 61;
               case 90 -> 80;
               case 91 -> 153;
               case 92 -> 234;
               case 93 -> 220;
               case 94 -> 131;
               case 95 -> 35;
               case 96 -> 204;
               case 97 -> 139;
               case 98 -> 68;
               case 99 -> 71;
               case 100 -> 60;
               case 101 -> 235;
               case 102 -> 145;
               case 103 -> 75;
               case 104 -> 1;
               case 105 -> 23;
               case 106 -> 52;
               case 107 -> 59;
               case 108 -> 233;
               case 109 -> 5;
               case 110 -> 177;
               case 111 -> 195;
               case 112 -> 173;
               case 113 -> 227;
               case 114 -> 221;
               case 115 -> 22;
               case 116 -> 228;
               case 117 -> 209;
               case 118 -> 2;
               case 119 -> 81;
               case 120 -> 69;
               case 121 -> 15;
               case 122 -> 167;
               case 123 -> 159;
               case 124 -> 34;
               case 125 -> 41;
               case 126 -> 118;
               case 127 -> 196;
               case 128 -> 212;
               case 129 -> 206;
               case 130 -> 100;
               case 131 -> 184;
               case 132 -> 10;
               case 133 -> 255;
               case 134 -> 93;
               case 135 -> 132;
               case 136 -> 244;
               case 137 -> 84;
               case 138 -> 225;
               case 139 -> 25;
               case 140 -> 46;
               case 141 -> 77;
               case 142 -> 7;
               case 143 -> 219;
               case 144 -> 103;
               case 145 -> 14;
               case 146 -> 215;
               case 147 -> 129;
               case 148 -> 191;
               case 149 -> 82;
               case 150 -> 186;
               case 151 -> 31;
               case 152 -> 193;
               case 153 -> 79;
               case 154 -> 49;
               case 155 -> 149;
               case 156 -> 162;
               case 157 -> 216;
               case 158 -> 27;
               case 159 -> 155;
               case 160 -> 152;
               case 161 -> 142;
               case 162 -> 83;
               case 163 -> 111;
               case 164 -> 115;
               case 165 -> 50;
               case 166 -> 106;
               case 167 -> 73;
               case 168 -> 147;
               case 169 -> 127;
               case 170 -> 17;
               case 171 -> 169;
               case 172 -> 21;
               case 173 -> 180;
               case 174 -> 64;
               case 175 -> 18;
               case 176 -> 156;
               case 177 -> 30;
               case 178 -> 33;
               case 179 -> 55;
               case 180 -> 199;
               case 181 -> 119;
               case 182 -> 179;
               case 183 -> 222;
               case 184 -> 16;
               case 185 -> 170;
               case 186 -> 251;
               case 187 -> 36;
               case 188 -> 126;
               case 189 -> 28;
               case 190 -> 174;
               case 191 -> 241;
               case 192 -> 238;
               case 193 -> 226;
               case 194 -> 143;
               case 195 -> 58;
               case 196 -> 249;
               case 197 -> 86;
               case 198 -> 67;
               case 199 -> 113;
               case 200 -> 65;
               case 201 -> 47;
               case 202 -> 53;
               case 203 -> 157;
               case 204 -> 6;
               case 205 -> 236;
               case 206 -> 148;
               case 207 -> 163;
               case 208 -> 99;
               case 209 -> 51;
               case 210 -> 123;
               case 211 -> 109;
               case 212 -> 40;
               case 213 -> 70;
               case 214 -> 166;
               case 215 -> 24;
               case 216 -> 185;
               case 217 -> 232;
               case 218 -> 76;
               case 219 -> 8;
               case 220 -> 133;
               case 221 -> 95;
               case 222 -> 135;
               case 223 -> 154;
               case 224 -> 89;
               case 225 -> 176;
               case 226 -> 150;
               case 227 -> 78;
               case 228 -> 224;
               case 229 -> 98;
               case 230 -> 243;
               case 231 -> 107;
               case 232 -> 11;
               case 233 -> 240;
               case 234 -> 237;
               case 235 -> 29;
               case 236 -> 231;
               case 237 -> 97;
               case 238 -> 168;
               case 239 -> 213;
               case 240 -> 138;
               case 241 -> 48;
               case 242 -> 239;
               case 243 -> 104;
               case 244 -> 45;
               case 245 -> 125;
               case 246 -> 208;
               case 247 -> 200;
               case 248 -> 146;
               case 249 -> 92;
               case 250 -> 223;
               case 251 -> 102;
               case 252 -> 181;
               case 253 -> 117;
               case 254 -> 253;
               default -> 19;
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
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll o, int var1, int var2, java.nio.ByteBuffer var3, int var4, Object var5) {
         short mask = 0;
         if ((mask & 1) != 0) var1 = o.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((mask & 2) != 0) var2 = o.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((mask & 4) != 0) var3 = o.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         return o.a(var1, var2, var3);
      }
   }
}
