package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import kotlin.io.CloseableKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final List<IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final List<IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final HashMap<BlockPos, Byte> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final HashMap<IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI, HashSet<IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private HashSet<IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private ArrayList<IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private static String IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private static IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;

   public static final String ag() { // SYNB1-staticgetter-a
      return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   }

   public static final IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll ah() { // SYNB1-staticgetter-b
      return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   }

   private static String[] f;
   private static String[] g;

   public IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll() {
      short var10001 = -13401;
      short var10002 = -6361;
      var10002 = -13400;
      short var10003 = 9220;
      short var10004 = -13407;
      short var10005 = -7025;
      super(
         "Chunk Saver",
         "This better not be in main",
         me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "Dev",
         false,
         new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[0]
      );
      IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var1 = new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            1, 0
         ),
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            -1, 0
         ),
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            0, 1
         ),
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            0, -1
         ),
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            1, 1
         ),
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            1, -1
         ),
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            -1, -1
         ),
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            -1, 1
         )
      };
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.listOf(var1);
      var1 = new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            1, 0
         ),
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            -1, 0
         ),
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            0, 1
         ),
         new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            0, -1
         )
      };
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = CollectionsKt.listOf(var1);
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new HashMap<>();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new HashMap<>();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new HashSet<>();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new ArrayList<>();
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl var1) {
      int var14 = 0; // PX-FIX
      Object var13 = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      short var10002 = -13395;
      short var10003 = -22178;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (var2 == null) {
         LevelChunk var11 = var1.l();
         if (var11 != null) {
            ChunkPos var12 = var11.getPos();
            if (var12 != null) {
               IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4;
               label73: {
                  ChunkPos var3 = var12;
                  var4 = new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     var3.x(), var3.z()
                  );
                  var var5 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
                  boolean var6 = false;
                  var13 = var5;
                  label64:
                  if (var2 == null) {
                     if (var5 instanceof Collection) {
                        var13 = var5;
                        if (var2 != null) {
                           break label64;
                        }

                        if (((me.octo.client.PXDyn)var13).isEmpty()) {
                           var14 = 0;
                           break label73;
                        }
                     }

                     var13 = var5;
                  }

                  Iterator var7 = ((me.octo.client.PXDyn)var13).iterator();

                  label55:
                  while (true) {
                     if (!var7.hasNext()) {
                        var14 = 0;
                        break;
                     }

                     Object var8 = var7.next();
                     IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = (IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var8;
                     boolean var10 = false;
                     var14 = var9.a();

                     while (true) {
                        label51: {
                           label50: {
                              int var10001 = var4.a();
                              if (var2 == null) {
                                 if (var14 != var10001) {
                                    break label50;
                                 }

                                 var14 = var9.b();
                                 if (var2 != null) {
                                    break label51;
                                 }

                                 var10001 = var4.b();
                              }

                              if (var14 == var10001) {
                                 var14 = 1;
                                 break label51;
                              }
                           }

                           var14 = 0;
                        }

                        if (var14 == 0) {
                           break;
                        }

                        var14 = 1;
                        if (var2 == null) {
                           break label55;
                        }
                     }
                  }
               }

               if (var14 == 0) {
                  this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.add(var4);
               }

               return;
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -13395;
      short var10002 = -22178;
      Intrinsics.checkNotNullParameter(var1, "event");
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.clear();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
      IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) throws java.io.IOException {
      Intrinsics.checkNotNullParameter(param1, "event");
      ClientLevel var3 = this.ap().level;
      if (var3 == null) {
         return;
      }
      
      List<IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var5 = new ArrayList();
      for (IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 : this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
         boolean var8 = true;
         for (IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var9 : this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            if (!var3.hasChunk(var7.a() + var9.a(), var7.b() + var9.b())) {
               var8 = false;
               break;
            }
         }
         if (var8) {
            var5.add(var7);
         }
      }
      
      for (IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10 : var5) {
         int var11 = var10.a();
         int var12 = var10.b();
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var13 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      HashSet<IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var14 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(var13);
         if (var14 != null && var14.contains(var10)) {
            return;
         }
      
         int var15 = var11 * 16;
         int var16 = var12 * 16;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
      
         for (int var17 = 0; var17 < 257; var17++) {
            for (int var18 = 0; var18 < 16; var18++) {
               for (int var19 = 0; var19 < 16; var19++) {
                  this.a(new BlockPos(var15 + var18, var17, var16 + var19));
               }
            }
         }
      
         File var20 = new File(llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(), IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl);
         if (!var20.exists()) {
            var20.mkdir();
         }
         File var21 = new File(var20, IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().name());
         if (!var21.exists()) {
            var21.mkdir();
         }
      
         if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.keySet().isEmpty()) {
            String var22 = "chunk_" + var11 + "_" + var12 + ".dat";
            File var23 = new File(var21, var22);
            int var24 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.size();
            int var25 = 4 + var24 * 13;
            BufferedOutputStream var26 = new BufferedOutputStream(new FileOutputStream(var23), var25);
            Throwable var27 = null;
            try {
               DataOutputStream var28 = new DataOutputStream(var26);
               Throwable var29 = null;
               try {
                  var28.writeInt(var24);
                  for (Map.Entry var30 : this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.entrySet()) {
                     BlockPos var31 = (BlockPos)var30.getKey();
                     byte var32 = ((Number)var30.getValue()).byteValue();
                     var28.writeByte(var32);
                     var28.writeInt(var31.getX());
                     var28.writeInt(var31.getY());
                     var28.writeInt(var31.getZ());
                  }
                  var28.flush();
               } catch (Throwable var33) {
                  var29 = var33;
                  throw var33;
               } finally {
                  CloseableKt.closeFinally(var28, var29);
               }
            } catch (Throwable var34) {
               var27 = var34;
               throw var34;
            } finally {
               CloseableKt.closeFinally(var26, var27);
            }
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Wrote data to: " + var22 + " for " + IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().name());
         }
      
         if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(var13) == null) {
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.put(var13, new HashSet());
         }
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.remove(var10);
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.add(var10);
         HashSet var35 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(var13);
         Intrinsics.checkNotNull(var35);
         var35.add(var10);
      }
   }

   private final void a(BlockPos var1) {
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      byte var3 = this.d(var1);
      int[] var2 = var10000;
      byte var12 = var3;
      if (var2 == null) {
         if (var3 == 0) {
            return;
         }

         BlockPos var10001 = var1.offset(0, 1, 0);
         short var10003 = -13397;
         short var10004 = -27963;
         Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
         var12 = ((byte)((this.b(var10001)) ? 1 : 0));
      }

      if (var2 == null) {
         if (var12 == 0) {
            return;
         }

         BlockPos var17 = var1.offset(0, 2, 0);
         short var19 = -13397;
         short var22 = -27963;
         Intrinsics.checkNotNullExpressionValue(var17, "offset(...)");
         var12 = ((byte)((this.c(var17)) ? 1 : 0));
      }

      if (var2 == null) {
         if (var12 == 0) {
            return;
         }

         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.put(var1, var3);
         var12 = -1;
      }

      int var4 = var12;

      label88:
      while (true) {
         int var13 = var4;

         label86:
         while (true) {
            if (var13 >= 2) {
               break label88;
            }

            int var5 = -1;

            label83:
            while (true) {
               int var14 = var5;

               label81:
               while (true) {
                  if (var14 >= 2) {
                     break label83;
                  }

                  var13 = -1;
                  if (var2 != null) {
                     continue label86;
                  }

                  int var6 = -1;

                  while (var6 < 3) {
                     BlockPos var15 = var1.offset(var4, var6, var5);
                     short var10002 = -13397;
                     short var20 = -27963;
                     Intrinsics.checkNotNullExpressionValue(var15, "offset(...)");
                     BlockPos var7 = var15;
                     label75:
                     if (var2 == null) {
                        var14 = ((this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.containsKey(var7)) ? 1 : 0);
                        if (var2 != null) {
                           continue label81;
                        }

                        if (var14 == 0) {
                           BlockPos var18 = var1.offset(var4, var6, var5);
                           var20 = -13397;
                           short var23 = -27963;
                           Intrinsics.checkNotNullExpressionValue(var18, "offset(...)");
                           byte var8 = this.d(var18);
                           if (var2 != null) {
                              break label75;
                           }

                           if (var8 != 0) {
                              this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.put(var7, var8);
                           }
                        }

                        var6++;
                     }

                     if (var2 != null) {
                        break;
                     }
                  }

                  var5++;
                  if (var2 != null) {
                     break label83;
                  }
                  break;
               }
            }

            var4++;
            if (var2 != null) {
               break label88;
            }
            break;
         }
      }

      for (IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10 : this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
         if (var2 == null) {
            Pair var16 = this.a(var1, var10);
            if (var16 != null) {
               Pair var11 = var16;
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                  .put((BlockPos)var11.getFirst(), (Byte)var11.getSecond());
               if (var2 != null) {
                  break;
               }
            }
         }
      }
   }

   private final Pair<BlockPos, Byte> a(
      BlockPos var1,
      IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2
   ) {
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      BlockPos var10001 = var1.offset(var2.a(), 0, var2.b());
      short var10003 = -13408;
      short var10004 = 23458;
      Intrinsics.checkNotNullExpressionValue(var10001, "offset(...)");
      BlockPos var4 = var10001;
      int[] var3 = var10000;
      byte var8 = ((byte)((this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.containsKey(var4)) ? 1 : 0));
      if (var3 == null) {
         if (var8 != 0) {
            return null;
         }

         var8 = 1;
      }

      int var5 = var8;

      while (-21 < var5) {
         BlockPos var9 = var4.offset(0, var5, 0);
         short var10002 = -13397;
         var10003 = -27963;
         Intrinsics.checkNotNullExpressionValue(var9, "offset(...)");
         BlockPos var6 = var9;
         byte var7 = this.d(var6);
         if (var3 == null) {
            label34:
            if (var7 != 0) {
               byte var10 = var7;
               byte var11 = 4;
               if (var3 == null) {
                  if (var7 == 4) {
                     break label34;
                  }

                  var10 = var7;
                  var11 = 5;
               }

               if (var10 != var11) {
                  return new Pair(var6, var7);
               }
            }

            var5--;
         }

         if (var3 != null) {
            break;
         }
      }

      return null;
   }

   private final boolean b(BlockPos var1) {
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      byte var3 = this.d(var1);
      int[] var2 = var10000;
      byte var4 = var3;
      if (var2 == null) {
         if (var3 != 0) {
            if (var2 != null) {
               return (var3 != 0);
            }

            if (var3 != 4) {
               if (var2 != null) {
                  return (var3 != 0);
               }

               if (var3 != 5) {
                  return (0 != 0);
               }
            }
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   private final boolean c(BlockPos var1) {
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      byte var3 = this.d(var1);
      int[] var2 = var10000;
      byte var4 = var3;
      if (var2 == null) {
         if (var3 != 0) {
            if (var2 != null) {
               return (var3 != 0);
            }

            if (var3 != 5) {
               return (0 != 0);
            }
         }

         var4 = 1;
      }

      return (var4 != 0);
   }

   private final byte d(BlockPos var1) {
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      ClientLevel var10001 = this.ap().level;
      Intrinsics.checkNotNull(var10001);
      BlockState var6 = var10001.getBlockState(var1);
      short var10003 = -13406;
      short var10004 = -2950;
      Intrinsics.checkNotNullExpressionValue(var6, "getBlockState(...)");
      BlockState var3 = var6;
      Block var7 = var3.getBlock();
      var10003 = -13402;
      var10004 = -26021;
      Intrinsics.checkNotNullExpressionValue(var7, "getBlock(...)");
      Block var4 = var7;
      int[] var2 = var10000;
      byte var5 = ((byte)((var3.isAir()) ? 1 : 0));
      if (var2 == null) {
         if (var5 != 0) {
            return 0;
         }

         var5 = ((byte)((var3.getFluidState().isEmpty()) ? 1 : 0));
      }

      if (var2 == null) {
         if (var5 == 0) {
            return 5;
         }

         var10001 = this.ap().level;
         Intrinsics.checkNotNull(var10001);
         var5 = ((byte)((var3.getCollisionShape(var10001, var1).isEmpty()) ? 1 : 0));
      }

      if (var2 == null) {
         if (var5 != 0) {
            return 0;
         }

         var5 = ((byte)((var4 instanceof SlabBlock) ? 1 : 0));
      }

      if (var2 == null) {
         if (var5 != 0 && var3.getValue(SlabBlock.TYPE) == SlabType.BOTTOM) {
            return 2;
         }

         var5 = ((byte)((var4 instanceof StairBlock) ? 1 : 0));
      }

      if (var2 == null) {
         if (var5 != 0) {
            return (byte)(var3.getValue(StairBlock.HALF) == Half.BOTTOM ? 3 : 1);
         }

         var5 = ((byte)((var4 instanceof CarpetBlock) ? 1 : 0));
      }

      if (var2 == null) {
         if (var5 != 0) {
            return 4;
         }

         var5 = ((byte)((var4 instanceof FenceBlock) ? 1 : 0));
      }

      if (var2 == null) {
         label82:
         if (var5 == 0) {
            int var11 = ((var4 instanceof FenceGateBlock) ? 1 : 0);
            if (var2 == null) {
               if (var11 != 0) {
                  break label82;
               }

               var11 = ((var4 instanceof SnowLayerBlock) ? 1 : 0);
            }

            if (var2 == null) {
               if (var11 != 0) {
                  int var12 = var3.getValue(SnowLayerBlock.LAYERS);
                  if (var2 == null) {
                     switch (var12) {
                        case 1:
                           return 7;
                        case 2:
                           return 8;
                        case 3:
                           return 9;
                        case 4:
                           return 10;
                        case 5:
                           return 11;
                        case 6:
                           return 12;
                        case 7:
                           return 13;
                        default:
                           var12 = 14;
                     }
                  }

                  return (byte)var12;
               }

               var11 = ((Intrinsics.areEqual(var4, Blocks.SNOW)) ? 1 : 0);
            }

            if (var2 == null) {
               var11 = var11 != 0 ? 15 : 1;
            }

            return (byte)var11;
         }

         var5 = 6;
      }

      return var5;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[15];
      int var3 = 0;
      String var2 = "XE\u0001k\u000e\u0011kz\u0011dú\u0003\u000e-\u0095\u0012 u\u0005?×\u00973\u0097Enê¢`ÍgÅÇ`\u000eÎ-=\u009aÚJÔåkÙ\u009e¶ã÷\u0005+.À\u0007[\u000f°þ*\u008dC~\u008e\u00062\u0002\u0086\u0098\u008e\u0098ÿ\rmó¼ïà\u008dÕÔâ\\E¯\u007f\u000b\n¼ñ\u0086oFó\u0001Næ\u0019\u001a_\u001e²ÏÓ\u0093p¤Ìå\u000b´&\u0096\u009f\u000f\u0085º_âê´ì=.e\u0006?es½?^\u0004¿\u0094\u0093\u0014\u000bÂÛR¸dk&5¸\u008dÏ\u0005\u008e¤\u0093X.";
      int var4 = "XE\u0001k\u000e\u0011kz\u0011dú\u0003\u000e-\u0095\u0012 u\u0005?×\u00973\u0097Enê¢`ÍgÅÇ`\u000eÎ-=\u009aÚJÔåkÙ\u009e¶ã÷\u0005+.À\u0007[\u000f°þ*\u008dC~\u008e\u00062\u0002\u0086\u0098\u008e\u0098ÿ\rmó¼ïà\u008dÕÔâ\\E¯\u007f\u000b\n¼ñ\u0086oFó\u0001Næ\u0019\u001a_\u001e²ÏÓ\u0093p¤Ìå\u000b´&\u0096\u009f\u000f\u0085º_âê´ì=.e\u0006?es½?^\u0004¿\u0094\u0093\u0014\u000bÂÛR¸dk&5¸\u008dÏ\u0005\u008e¤\u0093X."
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 74;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = (byte)var10000;
               var22 = var26;
               int var15 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var29 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 5;
                     case 1 -> 88;
                     case 2 -> 77;
                     case 3 -> 18;
                     case 4 -> 75;
                     case 5 -> 84;
                     default -> 33;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     f = var5;
                     g = new String[15];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (Object) null
                     );
                     var10000 = -13405;
                     short var17 = -12189;
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = "pathfind-cache";
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ÚAå\u0018\u001c\u000f\u008fÈ=\u0000^x\u0091\u0000\u000bz²\u0085¼Â%";
                  var4 = "ÚAå\u0018\u001c\u000f\u008fÈ=\u0000^x\u0091\u0000\u000bz²\u0085¼Â%".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 85;
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
      int var2 = (var0 ^ -13408) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 182;
            case 1 -> 153;
            case 2 -> 69;
            case 3 -> 188;
            case 4 -> 253;
            case 5 -> 16;
            case 6 -> 240;
            case 7 -> 163;
            case 8 -> 46;
            case 9 -> 123;
            case 10 -> 65;
            case 11 -> 116;
            case 12 -> 185;
            case 13 -> 70;
            case 14 -> 208;
            case 15 -> 181;
            case 16 -> 192;
            case 17 -> 6;
            case 18 -> 120;
            case 19 -> 225;
            case 20 -> 26;
            case 21 -> 230;
            case 22 -> 76;
            case 23 -> 42;
            case 24 -> 14;
            case 25 -> 122;
            case 26 -> 195;
            case 27 -> 170;
            case 28 -> 180;
            case 29 -> 146;
            case 30 -> 39;
            case 31 -> 1;
            case 32 -> 94;
            case 33 -> 58;
            case 34 -> 22;
            case 35 -> 129;
            case 36 -> 171;
            case 37 -> 234;
            case 38 -> 79;
            case 39 -> 87;
            case 40 -> 186;
            case 41 -> 28;
            case 42 -> 0;
            case 43 -> 34;
            case 44 -> 25;
            case 45 -> 83;
            case 46 -> 169;
            case 47 -> 216;
            case 48 -> 151;
            case 49 -> 203;
            case 50 -> 175;
            case 51 -> 56;
            case 52 -> 2;
            case 53 -> 241;
            case 54 -> 47;
            case 55 -> 159;
            case 56 -> 60;
            case 57 -> 11;
            case 58 -> 152;
            case 59 -> 237;
            case 60 -> 100;
            case 61 -> 17;
            case 62 -> 105;
            case 63 -> 128;
            case 64 -> 95;
            case 65 -> 138;
            case 66 -> 199;
            case 67 -> 5;
            case 68 -> 67;
            case 69 -> 33;
            case 70 -> 177;
            case 71 -> 63;
            case 72 -> 130;
            case 73 -> 162;
            case 74 -> 118;
            case 75 -> 108;
            case 76 -> 97;
            case 77 -> 142;
            case 78 -> 165;
            case 79 -> 140;
            case 80 -> 193;
            case 81 -> 217;
            case 82 -> 78;
            case 83 -> 72;
            case 84 -> 243;
            case 85 -> 168;
            case 86 -> 249;
            case 87 -> 61;
            case 88 -> 222;
            case 89 -> 220;
            case 90 -> 49;
            case 91 -> 57;
            case 92 -> 88;
            case 93 -> 167;
            case 94 -> 215;
            case 95 -> 41;
            case 96 -> 190;
            case 97 -> 223;
            case 98 -> 20;
            case 99 -> 238;
            case 100 -> 212;
            case 101 -> 189;
            case 102 -> 71;
            case 103 -> 179;
            case 104 -> 137;
            case 105 -> 81;
            case 106 -> 131;
            case 107 -> 110;
            case 108 -> 198;
            case 109 -> 202;
            case 110 -> 149;
            case 111 -> 158;
            case 112 -> 101;
            case 113 -> 161;
            case 114 -> 219;
            case 115 -> 59;
            case 116 -> 205;
            case 117 -> 74;
            case 118 -> 213;
            case 119 -> 150;
            case 120 -> 31;
            case 121 -> 50;
            case 122 -> 77;
            case 123 -> 134;
            case 124 -> 233;
            case 125 -> 250;
            case 126 -> 92;
            case 127 -> 166;
            case 128 -> 235;
            case 129 -> 114;
            case 130 -> 232;
            case 131 -> 236;
            case 132 -> 155;
            case 133 -> 107;
            case 134 -> 147;
            case 135 -> 9;
            case 136 -> 24;
            case 137 -> 113;
            case 138 -> 111;
            case 139 -> 141;
            case 140 -> 173;
            case 141 -> 227;
            case 142 -> 127;
            case 143 -> 38;
            case 144 -> 96;
            case 145 -> 44;
            case 146 -> 109;
            case 147 -> 210;
            case 148 -> 139;
            case 149 -> 247;
            case 150 -> 68;
            case 151 -> 254;
            case 152 -> 104;
            case 153 -> 164;
            case 154 -> 132;
            case 155 -> 209;
            case 156 -> 255;
            case 157 -> 252;
            case 158 -> 84;
            case 159 -> 8;
            case 160 -> 7;
            case 161 -> 40;
            case 162 -> 197;
            case 163 -> 51;
            case 164 -> 80;
            case 165 -> 37;
            case 166 -> 112;
            case 167 -> 55;
            case 168 -> 157;
            case 169 -> 174;
            case 170 -> 75;
            case 171 -> 244;
            case 172 -> 29;
            case 173 -> 135;
            case 174 -> 231;
            case 175 -> 53;
            case 176 -> 117;
            case 177 -> 229;
            case 178 -> 45;
            case 179 -> 85;
            case 180 -> 154;
            case 181 -> 90;
            case 182 -> 218;
            case 183 -> 106;
            case 184 -> 201;
            case 185 -> 4;
            case 186 -> 187;
            case 187 -> 184;
            case 188 -> 86;
            case 189 -> 82;
            case 190 -> 178;
            case 191 -> 10;
            case 192 -> 224;
            case 193 -> 89;
            case 194 -> 27;
            case 195 -> 200;
            case 196 -> 98;
            case 197 -> 62;
            case 198 -> 148;
            case 199 -> 133;
            case 200 -> 124;
            case 201 -> 248;
            case 202 -> 206;
            case 203 -> 144;
            case 204 -> 103;
            case 205 -> 121;
            case 206 -> 183;
            case 207 -> 251;
            case 208 -> 172;
            case 209 -> 226;
            case 210 -> 3;
            case 211 -> 54;
            case 212 -> 160;
            case 213 -> 91;
            case 214 -> 194;
            case 215 -> 13;
            case 216 -> 136;
            case 217 -> 156;
            case 218 -> 176;
            case 219 -> 228;
            case 220 -> 35;
            case 221 -> 64;
            case 222 -> 204;
            case 223 -> 66;
            case 224 -> 19;
            case 225 -> 246;
            case 226 -> 99;
            case 227 -> 214;
            case 228 -> 221;
            case 229 -> 126;
            case 230 -> 115;
            case 231 -> 73;
            case 232 -> 245;
            case 233 -> 43;
            case 234 -> 18;
            case 235 -> 191;
            case 236 -> 119;
            case 237 -> 239;
            case 238 -> 52;
            case 239 -> 242;
            case 240 -> 143;
            case 241 -> 102;
            case 242 -> 32;
            case 243 -> 23;
            case 244 -> 207;
            case 245 -> 15;
            case 246 -> 30;
            case 247 -> 93;
            case 248 -> 196;
            case 249 -> 211;
            case 250 -> 125;
            case 251 -> 36;
            case 252 -> 12;
            case 253 -> 21;
            case 254 -> 48;
            default -> 145;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
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
      public final IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         int var1, int var2
      ) {
         return new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -25658;
         short var10003 = -11199;
         var10003 = -25657;
         short var10004 = -11650;
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
         int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 == null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 != null) {
               return (boolean)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0);
            }

            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "å»0£\tÞBD\\\u009e½¬\u0003ü";
         int var4 = "å»0£\tÞBD\\\u009e½¬\u0003ü".length();
         char var1 = 4;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 53;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 53;
                  var10006 = var6;
               } else {
                  var13 = 53;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 53;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 100;
                     case 1 -> 66;
                     case 2 -> 64;
                     case 3 -> 22;
                     case 4 -> 66;
                     case 5 -> 14;
                     default -> 69;
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

      private static String b(int var0, int var1) {
         int var2 = (var0 ^ -25657) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 195;
               case 1 -> 3;
               case 2 -> 135;
               case 3 -> 50;
               case 4 -> 97;
               case 5 -> 6;
               case 6 -> 175;
               case 7 -> 138;
               case 8 -> 179;
               case 9 -> 89;
               case 10 -> 166;
               case 11 -> 177;
               case 12 -> 17;
               case 13 -> 161;
               case 14 -> 193;
               case 15 -> 162;
               case 16 -> 99;
               case 17 -> 76;
               case 18 -> 205;
               case 19 -> 10;
               case 20 -> 125;
               case 21 -> 241;
               case 22 -> 83;
               case 23 -> 57;
               case 24 -> 123;
               case 25 -> 33;
               case 26 -> 191;
               case 27 -> 82;
               case 28 -> 91;
               case 29 -> 252;
               case 30 -> 160;
               case 31 -> 14;
               case 32 -> 43;
               case 33 -> 65;
               case 34 -> 38;
               case 35 -> 121;
               case 36 -> 197;
               case 37 -> 198;
               case 38 -> 81;
               case 39 -> 111;
               case 40 -> 104;
               case 41 -> 47;
               case 42 -> 24;
               case 43 -> 170;
               case 44 -> 130;
               case 45 -> 18;
               case 46 -> 250;
               case 47 -> 92;
               case 48 -> 136;
               case 49 -> 151;
               case 50 -> 80;
               case 51 -> 226;
               case 52 -> 42;
               case 53 -> 235;
               case 54 -> 206;
               case 55 -> 77;
               case 56 -> 165;
               case 57 -> 70;
               case 58 -> 184;
               case 59 -> 164;
               case 60 -> 236;
               case 61 -> 190;
               case 62 -> 207;
               case 63 -> 78;
               case 64 -> 66;
               case 65 -> 218;
               case 66 -> 98;
               case 67 -> 117;
               case 68 -> 86;
               case 69 -> 101;
               case 70 -> 186;
               case 71 -> 183;
               case 72 -> 243;
               case 73 -> 215;
               case 74 -> 139;
               case 75 -> 22;
               case 76 -> 245;
               case 77 -> 204;
               case 78 -> 35;
               case 79 -> 46;
               case 80 -> 147;
               case 81 -> 32;
               case 82 -> 144;
               case 83 -> 153;
               case 84 -> 88;
               case 85 -> 0;
               case 86 -> 233;
               case 87 -> 79;
               case 88 -> 248;
               case 89 -> 84;
               case 90 -> 196;
               case 91 -> 69;
               case 92 -> 30;
               case 93 -> 140;
               case 94 -> 128;
               case 95 -> 172;
               case 96 -> 56;
               case 97 -> 23;
               case 98 -> 5;
               case 99 -> 229;
               case 100 -> 68;
               case 101 -> 52;
               case 102 -> 216;
               case 103 -> 116;
               case 104 -> 71;
               case 105 -> 142;
               case 106 -> 152;
               case 107 -> 238;
               case 108 -> 202;
               case 109 -> 178;
               case 110 -> 29;
               case 111 -> 159;
               case 112 -> 21;
               case 113 -> 100;
               case 114 -> 36;
               case 115 -> 53;
               case 116 -> 44;
               case 117 -> 149;
               case 118 -> 59;
               case 119 -> 113;
               case 120 -> 155;
               case 121 -> 222;
               case 122 -> 93;
               case 123 -> 51;
               case 124 -> 180;
               case 125 -> 213;
               case 126 -> 246;
               case 127 -> 90;
               case 128 -> 127;
               case 129 -> 211;
               case 130 -> 73;
               case 131 -> 210;
               case 132 -> 87;
               case 133 -> 173;
               case 134 -> 96;
               case 135 -> 34;
               case 136 -> 247;
               case 137 -> 85;
               case 138 -> 31;
               case 139 -> 37;
               case 140 -> 201;
               case 141 -> 214;
               case 142 -> 112;
               case 143 -> 129;
               case 144 -> 148;
               case 145 -> 171;
               case 146 -> 240;
               case 147 -> 217;
               case 148 -> 203;
               case 149 -> 158;
               case 150 -> 154;
               case 151 -> 251;
               case 152 -> 49;
               case 153 -> 27;
               case 154 -> 110;
               case 155 -> 55;
               case 156 -> 168;
               case 157 -> 253;
               case 158 -> 244;
               case 159 -> 54;
               case 160 -> 225;
               case 161 -> 94;
               case 162 -> 4;
               case 163 -> 219;
               case 164 -> 7;
               case 165 -> 212;
               case 166 -> 141;
               case 167 -> 114;
               case 168 -> 227;
               case 169 -> 120;
               case 170 -> 220;
               case 171 -> 15;
               case 172 -> 150;
               case 173 -> 119;
               case 174 -> 106;
               case 175 -> 131;
               case 176 -> 134;
               case 177 -> 103;
               case 178 -> 108;
               case 179 -> 64;
               case 180 -> 230;
               case 181 -> 41;
               case 182 -> 60;
               case 183 -> 13;
               case 184 -> 67;
               case 185 -> 118;
               case 186 -> 239;
               case 187 -> 223;
               case 188 -> 185;
               case 189 -> 187;
               case 190 -> 192;
               case 191 -> 255;
               case 192 -> 167;
               case 193 -> 209;
               case 194 -> 199;
               case 195 -> 12;
               case 196 -> 224;
               case 197 -> 74;
               case 198 -> 102;
               case 199 -> 124;
               case 200 -> 126;
               case 201 -> 174;
               case 202 -> 194;
               case 203 -> 8;
               case 204 -> 228;
               case 205 -> 157;
               case 206 -> 115;
               case 207 -> 182;
               case 208 -> 105;
               case 209 -> 249;
               case 210 -> 48;
               case 211 -> 2;
               case 212 -> 163;
               case 213 -> 63;
               case 214 -> 221;
               case 215 -> 231;
               case 216 -> 28;
               case 217 -> 254;
               case 218 -> 19;
               case 219 -> 107;
               case 220 -> 16;
               case 221 -> 132;
               case 222 -> 75;
               case 223 -> 72;
               case 224 -> 169;
               case 225 -> 143;
               case 226 -> 95;
               case 227 -> 25;
               case 228 -> 208;
               case 229 -> 234;
               case 230 -> 122;
               case 231 -> 11;
               case 232 -> 20;
               case 233 -> 188;
               case 234 -> 39;
               case 235 -> 26;
               case 236 -> 237;
               case 237 -> 9;
               case 238 -> 200;
               case 239 -> 58;
               case 240 -> 156;
               case 241 -> 146;
               case 242 -> 181;
               case 243 -> 40;
               case 244 -> 1;
               case 245 -> 62;
               case 246 -> 133;
               case 247 -> 109;
               case 248 -> 137;
               case 249 -> 145;
               case 250 -> 242;
               case 251 -> 232;
               case 252 -> 45;
               case 253 -> 176;
               case 254 -> 61;
               default -> 189;
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
         public static me.octo.client.IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll p0, int p1, int p2, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         return p0.a(p1, p2);
      }
}

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final String a() {
         return IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      }

      @NotNull
      public final IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll b() {
         return IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int var1, int var2) {
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
      public final IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, int var2
      ) {
         return new IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -27784;
         short var10003 = 14331;
         var10003 = -27783;
         short var10004 = -1379;
         return "Chunk(x="
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
         int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 == null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 != null) {
               return (boolean)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0);
            }

            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "ØTÝ\u0010\b£Ñ?²¿8ÉT";
         int var4 = "ØTÝ\u0010\b£Ñ?²¿8ÉT".length();
         char var1 = 4;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 46;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 46;
                  var10006 = var6;
               } else {
                  var13 = 46;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 46;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 108;
                     case 1 -> 73;
                     case 2 -> 115;
                     case 3 -> 65;
                     case 4 -> 109;
                     case 5 -> 38;
                     default -> 6;
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

      private static String b(int var0, int var1) {
         int var2 = (var0 ^ -27783) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 97;
               case 1 -> 157;
               case 2 -> 165;
               case 3 -> 150;
               case 4 -> 199;
               case 5 -> 174;
               case 6 -> 107;
               case 7 -> 226;
               case 8 -> 19;
               case 9 -> 219;
               case 10 -> 227;
               case 11 -> 83;
               case 12 -> 94;
               case 13 -> 54;
               case 14 -> 234;
               case 15 -> 242;
               case 16 -> 15;
               case 17 -> 233;
               case 18 -> 102;
               case 19 -> 142;
               case 20 -> 164;
               case 21 -> 114;
               case 22 -> 152;
               case 23 -> 210;
               case 24 -> 143;
               case 25 -> 75;
               case 26 -> 108;
               case 27 -> 119;
               case 28 -> 230;
               case 29 -> 99;
               case 30 -> 98;
               case 31 -> 72;
               case 32 -> 52;
               case 33 -> 184;
               case 34 -> 140;
               case 35 -> 93;
               case 36 -> 73;
               case 37 -> 6;
               case 38 -> 33;
               case 39 -> 116;
               case 40 -> 179;
               case 41 -> 23;
               case 42 -> 228;
               case 43 -> 243;
               case 44 -> 100;
               case 45 -> 235;
               case 46 -> 229;
               case 47 -> 182;
               case 48 -> 38;
               case 49 -> 170;
               case 50 -> 197;
               case 51 -> 187;
               case 52 -> 168;
               case 53 -> 124;
               case 54 -> 160;
               case 55 -> 201;
               case 56 -> 74;
               case 57 -> 26;
               case 58 -> 206;
               case 59 -> 96;
               case 60 -> 48;
               case 61 -> 252;
               case 62 -> 11;
               case 63 -> 162;
               case 64 -> 255;
               case 65 -> 117;
               case 66 -> 17;
               case 67 -> 18;
               case 68 -> 71;
               case 69 -> 177;
               case 70 -> 169;
               case 71 -> 205;
               case 72 -> 225;
               case 73 -> 138;
               case 74 -> 36;
               case 75 -> 120;
               case 76 -> 167;
               case 77 -> 158;
               case 78 -> 103;
               case 79 -> 125;
               case 80 -> 161;
               case 81 -> 34;
               case 82 -> 151;
               case 83 -> 173;
               case 84 -> 66;
               case 85 -> 3;
               case 86 -> 166;
               case 87 -> 127;
               case 88 -> 193;
               case 89 -> 67;
               case 90 -> 190;
               case 91 -> 128;
               case 92 -> 62;
               case 93 -> 61;
               case 94 -> 55;
               case 95 -> 87;
               case 96 -> 85;
               case 97 -> 171;
               case 98 -> 180;
               case 99 -> 101;
               case 100 -> 194;
               case 101 -> 175;
               case 102 -> 92;
               case 103 -> 39;
               case 104 -> 42;
               case 105 -> 232;
               case 106 -> 236;
               case 107 -> 31;
               case 108 -> 4;
               case 109 -> 9;
               case 110 -> 45;
               case 111 -> 7;
               case 112 -> 245;
               case 113 -> 251;
               case 114 -> 22;
               case 115 -> 132;
               case 116 -> 57;
               case 117 -> 153;
               case 118 -> 77;
               case 119 -> 1;
               case 120 -> 104;
               case 121 -> 207;
               case 122 -> 216;
               case 123 -> 238;
               case 124 -> 43;
               case 125 -> 21;
               case 126 -> 32;
               case 127 -> 109;
               case 128 -> 70;
               case 129 -> 51;
               case 130 -> 249;
               case 131 -> 35;
               case 132 -> 5;
               case 133 -> 0;
               case 134 -> 111;
               case 135 -> 68;
               case 136 -> 246;
               case 137 -> 222;
               case 138 -> 105;
               case 139 -> 14;
               case 140 -> 37;
               case 141 -> 204;
               case 142 -> 253;
               case 143 -> 123;
               case 144 -> 106;
               case 145 -> 237;
               case 146 -> 25;
               case 147 -> 59;
               case 148 -> 215;
               case 149 -> 60;
               case 150 -> 10;
               case 151 -> 2;
               case 152 -> 84;
               case 153 -> 200;
               case 154 -> 231;
               case 155 -> 82;
               case 156 -> 240;
               case 157 -> 130;
               case 158 -> 250;
               case 159 -> 223;
               case 160 -> 148;
               case 161 -> 176;
               case 162 -> 118;
               case 163 -> 129;
               case 164 -> 178;
               case 165 -> 47;
               case 166 -> 115;
               case 167 -> 29;
               case 168 -> 188;
               case 169 -> 112;
               case 170 -> 136;
               case 171 -> 20;
               case 172 -> 88;
               case 173 -> 28;
               case 174 -> 239;
               case 175 -> 63;
               case 176 -> 154;
               case 177 -> 141;
               case 178 -> 244;
               case 179 -> 8;
               case 180 -> 163;
               case 181 -> 224;
               case 182 -> 139;
               case 183 -> 217;
               case 184 -> 41;
               case 185 -> 81;
               case 186 -> 135;
               case 187 -> 49;
               case 188 -> 13;
               case 189 -> 44;
               case 190 -> 110;
               case 191 -> 53;
               case 192 -> 64;
               case 193 -> 241;
               case 194 -> 186;
               case 195 -> 172;
               case 196 -> 79;
               case 197 -> 91;
               case 198 -> 145;
               case 199 -> 30;
               case 200 -> 78;
               case 201 -> 27;
               case 202 -> 220;
               case 203 -> 146;
               case 204 -> 189;
               case 205 -> 195;
               case 206 -> 12;
               case 207 -> 86;
               case 208 -> 191;
               case 209 -> 126;
               case 210 -> 58;
               case 211 -> 149;
               case 212 -> 214;
               case 213 -> 113;
               case 214 -> 181;
               case 215 -> 203;
               case 216 -> 212;
               case 217 -> 183;
               case 218 -> 247;
               case 219 -> 202;
               case 220 -> 121;
               case 221 -> 254;
               case 222 -> 196;
               case 223 -> 208;
               case 224 -> 69;
               case 225 -> 89;
               case 226 -> 144;
               case 227 -> 40;
               case 228 -> 90;
               case 229 -> 137;
               case 230 -> 65;
               case 231 -> 156;
               case 232 -> 122;
               case 233 -> 159;
               case 234 -> 147;
               case 235 -> 155;
               case 236 -> 192;
               case 237 -> 46;
               case 238 -> 95;
               case 239 -> 218;
               case 240 -> 80;
               case 241 -> 248;
               case 242 -> 185;
               case 243 -> 211;
               case 244 -> 76;
               case 245 -> 131;
               case 246 -> 198;
               case 247 -> 209;
               case 248 -> 221;
               case 249 -> 133;
               case 250 -> 24;
               case 251 -> 213;
               case 252 -> 134;
               case 253 -> 16;
               case 254 -> 50;
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
         public static me.octo.client.IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.IIIllIlIIllIIlIlllIIIIlllllIllIlIIIIlIIIlIlIIIlIllIllIIlIIllIIIIllIIlIllIlIIllIllIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, int p1, int p2, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         return p0.a(p1, p2);
      }
}
}
