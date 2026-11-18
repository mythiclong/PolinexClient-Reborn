/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.shorts.ShortArrayList
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.io.CloseableKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.BlockPos$MutableBlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.CarpetBlock
 *  net.minecraft.world.level.block.FenceBlock
 *  net.minecraft.world.level.block.FenceGateBlock
 *  net.minecraft.world.level.block.LadderBlock
 *  net.minecraft.world.level.block.SlabBlock
 *  net.minecraft.world.level.block.SnowLayerBlock
 *  net.minecraft.world.level.block.StairBlock
 *  net.minecraft.world.level.block.TrapDoorBlock
 *  net.minecraft.world.level.block.WallBlock
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.Half
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraft.world.level.block.state.properties.SlabType
 *  net.minecraft.world.level.chunk.LevelChunk
 *  net.minecraft.world.level.material.FluidState
 *  net.minecraft.world.level.material.Fluids
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.octo.client.utils.player.pathfinder;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import java.io.Closeable;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl;
import me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
import me.octo.client.utils.player.pathfinder.NativePathFinder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import net.minecraft.world.level.block.state.properties.Property;
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
    private static boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = false;
    public static byte IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 0;
    private static byte IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 1;
    private static byte lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 2;
    private static byte IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 3;
    private static byte llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 4;
    private static byte lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 5;
    private static byte lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 6;
    private static byte lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 7;
    private static byte lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 8;
    private static byte IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 9;
    private static byte llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 10;
    private static byte IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 11;
    private static byte IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 12;
    private static byte IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 13;
    private static byte IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 14;
    private static byte llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 15;
    private static byte IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 16;
    private static byte lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = 17;
    private static byte llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = 18;
    private static byte lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = 19;
    private static byte IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = 20;
    private static byte IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = 21;
    private static byte IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = 22;
    public static int llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = 16;
    public static int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = 256;
    public static int IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = 16;
    private static long IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = 0x1FFFFFL;
    private static boolean lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
    private static boolean lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
    @NotNull
    private static ArrayList<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
    @NotNull
    private static HashMap<Long, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
    @NotNull
    private static HashMap<Long, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
    @NotNull
    private static ArrayList<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
    @NotNull
    private static HashSet<Pair<Integer, Integer>> IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
    @NotNull
    private static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
    @NotNull
    private static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
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

    public final void a(boolean bl) {
        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = bl;
    }

    @SubscribeEvent
    public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII2) {
        block8: {
            File file;
            boolean bl;
            int n;
            block9: {
                IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
                IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2;
                block7: {
                    int n2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j();
                    Intrinsics.checkNotNullParameter((Object)llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII2, (String)"event");
                    n = n2;
                    if (!NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                        return;
                    }
                    iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
                    iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI = lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
                    if (n != 0) break block7;
                    if (iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 == iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI) break block8;
                    iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
                    iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                }
                if (iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 == iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI) break block8;
                bl = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
                if (n != 0) break block9;
                if (bl) break block8;
                bl = lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
            }
            if (!bl) {
                return;
            }
            long l = System.nanoTime();
            lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
            lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = false;
            File file2 = file = new File(new File(llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(), "pathfind-cache-v2"), IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().name() + ".dat");
            if (n == 0) {
                if (!file2.exists()) {
                    me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("ERROR cache is not loaded for this island!");
                    lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = true;
                    lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = true;
                    return;
                }
                file2 = file;
            }
            byte[] byArray = Files.readAllBytes(file2.toPath());
            int n3 = byArray.length;
            NativePathFinder.loadCache(byArray, n3);
            lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = true;
            lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = true;
            String string = "%.3f";
            Object[] objectArray = new Object[]{(double)(System.nanoTime() - l) / 1000000.0};
            String string2 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
            Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"format(...)");
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d("Loaded " + n3 + " bytes of pathfinder data in " + string2 + " ms.");
        }
    }

    @SubscribeEvent
    public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl iIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl) {
        Intrinsics.checkNotNullParameter((Object)iIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl, (String)"event");
        IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.clear();
        IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
        lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = false;
        int n = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
        if (n != 0) {
            if (!NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                return;
            }
            NativePathFinder.clearCache();
        }
    }

    @SubscribeEvent
    public final void a(@NotNull IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI illIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI) {
        block28: {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            block37: {
                boolean bl;
                block38: {
                    BlockState blockState;
                    block35: {
                        BlockState blockState2;
                        block36: {
                            ClientLevel clientLevel;
                            long l;
                            BlockPos blockPos;
                            block34: {
                                block33: {
                                    BlockState blockState3;
                                    block32: {
                                        block31: {
                                            block30: {
                                                Long l2;
                                                Map<Long, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> map2;
                                                int n6;
                                                block29: {
                                                    int n7;
                                                    block27: {
                                                        block26: {
                                                            int n8;
                                                            block25: {
                                                                n5 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
                                                                IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI illIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI2 = illIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
                                                                if (n5 != 0) {
                                                                    Intrinsics.checkNotNullParameter((Object)illIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI2, (String)"event");
                                                                    if (!NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                                                                        return;
                                                                    }
                                                                    illIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI2 = illIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
                                                                }
                                                                BlockPos blockPos2 = illIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI2.k();
                                                                if (blockPos2 == null) {
                                                                    return;
                                                                }
                                                                blockPos = blockPos2;
                                                                n4 = blockPos.getY();
                                                                int n8 = 0;
                                                                n8 = n4;
                                                                if (n5 == 0) break block25;
                                                                if (n7 > n8) break block26;
                                                                n7 = n4;
                                                                if (n5 == 0) break block27;
                                                                n8 = 257;
                                                            }
                                                            n7 = n7 < n8 ? 1 : 0;
                                                            break block27;
                                                        }
                                                        n7 = 0;
                                                    }
                                                    if (n7 == 0) break block28;
                                                    n4 = blockPos.getX() >> 4;
                                                    n6 = blockPos.getY() >> 4;
                                                    n3 = blockPos.getZ() >> 4;
                                                    l = this.b(n4, n6, n3);
                                                    map2 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
                                                    l2 = l;
                                                    if (n5 == 0) break block29;
                                                    if (((HashMap)map2).containsKey(l2)) break block30;
                                                    map2 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
                                                    l2 = l;
                                                }
                                                map2.put(l2, new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(n4, n6, n3, new IntArrayList(), new ByteArrayList()));
                                            }
                                            BlockState blockState4 = illIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.l();
                                            if (blockState4 == null) {
                                                return;
                                            }
                                            blockState = blockState4;
                                            if (n5 == 0) break block31;
                                            blockState3 = illIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.m();
                                            if (blockState3 != null) break block32;
                                        }
                                        return;
                                    }
                                    blockState2 = blockState3;
                                    if (n5 == 0) break block33;
                                    clientLevel = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.level;
                                    if (clientLevel != null) break block34;
                                }
                                return;
                            }
                            ClientLevel clientLevel2 = clientLevel;
                            n2 = blockPos.getX() & 0xF;
                            n = blockPos.getZ() & 0xF;
                            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.get(l);
                            Intrinsics.checkNotNull((Object)illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI);
                            illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d().add(this.a(n2, blockPos.getY() & 0xF, n));
                            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI2 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.get(l);
                            Intrinsics.checkNotNull((Object)illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI2);
                            illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI2.e().add(this.a(blockState2, blockPos, (BlockGetter)clientLevel2));
                            bl = blockState2.isAir();
                            if (n5 == 0) break block35;
                            if (!bl) break block36;
                            bl = blockState.isAir();
                            if (n5 == 0) break block35;
                            if (!bl) break block37;
                        }
                        bl = blockState2.isAir();
                    }
                    if (n5 == 0) break block38;
                    if (bl) break block28;
                    bl = blockState.isAir();
                }
                if (!bl) break block28;
            }
            long l = this.b(n4, 0, n3);
            short s = ((Map)IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI).containsKey(l);
            if (n5 != 0) {
                if (s == 0) {
                    ((Map)IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI).put(l, new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(n4, n3, new ShortArrayList()));
                }
                s = (short)this.a(n2, 0, n);
            }
            short s2 = s;
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.get(l);
            Intrinsics.checkNotNull((Object)iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
            ShortArrayList shortArrayList = iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.c();
            boolean bl = shortArrayList.contains(s2);
            if (n5 != 0 && !bl) {
                bl = shortArrayList.add(s2);
            }
        }
    }

    @SubscribeEvent
    public final void b(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII2) {
        Object object;
        llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2;
        Object object2;
        int n;
        block39: {
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
            block38: {
                block37: {
                    block35: {
                        boolean bl;
                        block36: {
                            block34: {
                                int n2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
                                Intrinsics.checkNotNullParameter((Object)llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII2, (String)"event");
                                n = n2;
                                bl = NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                if (n == 0) break block34;
                                if (!bl) break block35;
                                bl = lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
                            }
                            if (n == 0) break block36;
                            if (!bl) break block35;
                            bl = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
                        }
                        if (bl) break block37;
                    }
                    return;
                }
                iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
                if (n == 0) break block38;
                if (iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI == IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g()) break block39;
                iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
            }
            lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
            IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.clear();
        }
        lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.set(true);
        if (IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.get() != 0) {
            return;
        }
        long l = System.nanoTime();
        boolean bl = false;
        boolean bl2 = ((Collection)IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl).isEmpty();
        if (n != 0) {
            bl2 = !bl2;
        }
        if (bl2) {
            block30: {
                Iterator<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> iterator = IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.iterator();
                Intrinsics.checkNotNullExpressionValue(iterator, (String)"iterator(...)");
                object2 = iterator;
                while (object2.hasNext()) {
                    Object e = object2.next();
                    Intrinsics.checkNotNullExpressionValue(e, (String)"next(...)");
                    llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)e;
                    NativePathFinder.processChunk(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a(), llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.b(), llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.c());
                    if (n != 0) {
                        if (n != 0) continue;
                    }
                    break block30;
                }
                IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.clear();
            }
            bl = true;
        }
        object2 = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[]{IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};
        boolean bl3 = CollectionsKt.listOf((Object[])object2).contains((Object)IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g());
        if (n != 0) {
            if (!bl3) {
                boolean bl4 = ((Collection)IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII).isEmpty();
                if (n != 0) {
                    bl4 = !bl4;
                }
                if (bl4) {
                    block31: {
                        Iterator<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> iterator = IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.iterator();
                        Intrinsics.checkNotNullExpressionValue(iterator, (String)"iterator(...)");
                        object2 = iterator;
                        while (object2.hasNext()) {
                            Object e = object2.next();
                            Intrinsics.checkNotNullExpressionValue(e, (String)"next(...)");
                            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)e;
                            IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.add((Pair<Integer, Integer>)TuplesKt.to((Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a(), (Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.b()));
                            this.a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a(), llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.b(), llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.c());
                            String string = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().name();
                            int n3 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.b();
                            int n4 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a();
                            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Wrote chunk(x=" + n4 + ", z=" + n3 + ") for " + string);
                            if (n != 0) {
                                if (n != 0) continue;
                            }
                            break block31;
                        }
                        IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.clear();
                    }
                    bl = true;
                }
            }
            bl3 = ((Map)IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI).isEmpty();
        }
        if (n != 0) {
            bl3 = !bl3;
        }
        if (bl3) {
            block32: {
                object2 = ((Map)IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI).entrySet().iterator();
                while (object2.hasNext()) {
                    object = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)((Map.Entry)object2.next()).getValue();
                    IntArrayList intArrayList = ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)object).d();
                    ByteArrayList byteArrayList = ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)object).e();
                    int n5 = intArrayList.size();
                    NativePathFinder.updateChunk(((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)object).a(), ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)object).b(), ((IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)object).c(), intArrayList.toArray(new int[n5]), byteArrayList.toArray(new byte[n5]), n5);
                    if (n != 0) {
                        if (n != 0) continue;
                    }
                    break block32;
                }
                IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.clear();
            }
            bl = true;
        }
        boolean bl5 = ((Map)IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI).isEmpty();
        if (n != 0) {
            bl5 = !bl5;
        }
        if (bl5) {
            block33: {
                object2 = ((Map)IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI).entrySet().iterator();
                while (object2.hasNext()) {
                    object = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)((Map.Entry)object2.next()).getValue();
                    int n6 = ((IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)object).c().size();
                    NativePathFinder.updateHeights(((IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)object).a(), ((IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)object).b(), ((IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)object).c().toArray(new short[n6]), n6);
                    if (n != 0) {
                        if (n != 0) continue;
                    }
                    break block33;
                }
                IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.clear();
            }
            bl = true;
        }
        if (bl) {
            // empty if block
        }
        lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.set(false);
    }

    @SubscribeEvent
    public final void a(@NotNull IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl ilIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl) {
        int n = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j();
        Intrinsics.checkNotNullParameter((Object)ilIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl, (String)"event");
        int n2 = n;
        if (n2 == 0) {
            if (!NativePathFinder.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                return;
            }
            new Thread(() -> llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.b(ilIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl)).start();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private final void a(int n, int n2, ByteBuffer byteBuffer) {
        int n3;
        File file;
        int n4;
        block18: {
            block19: {
                File file2;
                block16: {
                    File file3;
                    block17: {
                        file3 = new File(llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(), "pathfind-cache-v2");
                        n4 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j();
                        file2 = file3;
                        if (n4 != 0) break block16;
                        try {
                            block20: {
                                if (file2.exists()) break block17;
                                break block20;
                                catch (Throwable throwable) {
                                    throw llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(throwable);
                                }
                            }
                            file3.mkdir();
                        }
                        catch (Throwable throwable) {
                            throw llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(throwable);
                        }
                    }
                    file2 = new File(file3, IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().name());
                }
                file = file2;
                n3 = file.exists();
                if (n4 != 0) break block18;
                try {
                    block21: {
                        if (n3 != 0) break block19;
                        break block21;
                        catch (Throwable throwable) {
                            throw llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(throwable);
                        }
                    }
                    file.mkdir();
                }
                catch (Throwable throwable) {
                    throw llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(throwable);
                }
            }
            n3 = n;
        }
        String string = "chunk_" + n3 + "_" + n2 + ".dat";
        File file4 = new File(file, string);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(65544);
        byteBuffer2.putInt(n);
        byteBuffer2.putInt(n2);
        byteBuffer.rewind();
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        Object object = new OpenOption[]{StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING};
        object = FileChannel.open(file4.toPath(), object);
        Throwable throwable = null;
        try {
            FileChannel fileChannel = (FileChannel)object;
            boolean bl = false;
            while (byteBuffer2.hasRemaining()) {
                try {
                    fileChannel.write(byteBuffer2);
                    if (n4 == 0 && n4 == 0) continue;
                    break;
                }
                catch (Throwable throwable2) {
                    throw llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(throwable2);
                }
            }
            fileChannel = Unit.INSTANCE;
        }
        catch (Throwable throwable3) {
            throwable = throwable3;
            throw throwable3;
        }
        finally {
            CloseableKt.closeFinally((Closeable)object, (Throwable)throwable);
        }
        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Wrote data to: " + string + " for " + IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().name());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final byte a(BlockState blockState, BlockPos blockPos, BlockGetter blockGetter) {
        Block block;
        BlockState blockState2;
        int n;
        block37: {
            boolean bl;
            block36: {
                int n2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
                FluidState fluidState = blockState.getFluidState();
                Intrinsics.checkNotNullExpressionValue((Object)fluidState, (String)"getFluidState(...)");
                FluidState fluidState2 = fluidState;
                n = n2;
                bl = blockState.isAir();
                if (n != 0) {
                    if (bl) {
                        return 0;
                    }
                    bl = fluidState2.isEmpty();
                }
                if (n == 0) break block36;
                if (!bl) {
                    int n3 = fluidState2.is((Object)Fluids.LAVA);
                    if (n == 0) return (byte)n3;
                    if (n3 != 0) return (byte)15;
                    n3 = fluidState2.is((Object)Fluids.FLOWING_LAVA) ? 1 : 0;
                    if (n == 0) return (byte)n3;
                    if (n3 == 0) return (byte)14;
                    return (byte)15;
                }
                blockState2 = blockState;
                if (n == 0) break block37;
                bl = blockState2.getCollisionShape(blockGetter, blockPos).isEmpty();
            }
            if (bl) {
                return 0;
            }
            blockState2 = blockState;
        }
        Block block2 = blockState2.getBlock();
        Intrinsics.checkNotNullExpressionValue((Object)block2, (String)"getBlock(...)");
        Block block3 = block = block2;
        int n4 = block3 instanceof SlabBlock;
        if (n != 0) {
            if (n4 != 0 && blockState.getValue((Property)SlabBlock.TYPE) == SlabType.BOTTOM) {
                return (byte)2;
            }
            n4 = block3 instanceof StairBlock;
        }
        if (n != 0) {
            if (n4 != 0) {
                Comparable comparable = blockState.getValue((Property)StairBlock.HALF);
                if (n != 0) {
                    if (comparable != Half.BOTTOM) return (byte)1;
                    comparable = blockState.getValue((Property)StairBlock.FACING);
                }
                n4 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[((Direction)comparable).ordinal()];
                if (n == 0) return (byte)n4;
                switch (n4) {
                    case 1: {
                        return (byte)17;
                    }
                    case 2: {
                        return (byte)18;
                    }
                    case 3: {
                        return (byte)19;
                    }
                    default: {
                        return (byte)20;
                    }
                }
            }
            n4 = block3 instanceof TrapDoorBlock;
        }
        if (n != 0) {
            if (n4 != 0) {
                n4 = ((Boolean)blockState.getValue((Property)TrapDoorBlock.OPEN)).booleanValue() ? 1 : 0;
                if (n == 0) return (byte)n4;
                if (n4 == 0) return (byte)21;
                return (byte)22;
            }
            n4 = block3 instanceof CarpetBlock;
        }
        if (n != 0) {
            if (n4 != 0) {
                return (byte)3;
            }
            n4 = block3 instanceof LadderBlock;
        }
        if (n != 0) {
            if (n4 != 0) {
                return (byte)16;
            }
            n4 = block3 instanceof FenceBlock;
        }
        if (n == 0) return (byte)n4;
        if (n4 != 0) return (byte)4;
        n4 = block3 instanceof FenceGateBlock;
        if (n == 0) return (byte)n4;
        if (n4 != 0) return (byte)4;
        n4 = block3 instanceof WallBlock;
        if (n != 0) {
            if (n4 != 0) {
                return (byte)4;
            }
            n4 = block3 instanceof SnowLayerBlock;
        }
        if (n != 0) {
            if (n4 != 0) {
                n4 = (Integer)blockState.getValue((Property)SnowLayerBlock.LAYERS);
                if (n == 0) return (byte)n4;
                switch (n4) {
                    case 1: {
                        return (byte)5;
                    }
                    case 2: {
                        return (byte)6;
                    }
                    case 3: {
                        return (byte)7;
                    }
                    case 4: {
                        return (byte)8;
                    }
                    case 5: {
                        return (byte)9;
                    }
                    case 6: {
                        return (byte)10;
                    }
                    case 7: {
                        return (byte)11;
                    }
                    default: {
                        return (byte)12;
                    }
                }
            }
            n4 = Intrinsics.areEqual((Object)block3, (Object)Blocks.SNOW_BLOCK) ? 1 : 0;
        }
        if (n == 0) return (byte)n4;
        if (n4 == 0) return (byte)1;
        return (byte)13;
    }

    public final int a(int n, int n2, int n3) {
        return n2 << 8 | n3 << 4 | n;
    }

    private final long b(int n, int n2, int n3) {
        return ((long)n & 0x1FFFFFL) << 42 | ((long)n2 & 0x1FFFFFL) << 21 | (long)n3 & 0x1FFFFFL;
    }

    private static final void b(IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl ilIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl) {
        block21: {
            int n;
            block22: {
                int n2;
                int n3;
                int n4;
                ByteBuffer byteBuffer;
                int n5;
                block17: {
                    LevelChunk levelChunk;
                    BlockPos.MutableBlockPos mutableBlockPos;
                    block20: {
                        block19: {
                            block16: {
                                long l = System.nanoTime();
                                n5 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
                                while (lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.get()) {
                                    Thread.sleep(1L);
                                    if (n5 != 0) {
                                        if (n5 != 0) continue;
                                    }
                                    break block16;
                                }
                                IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.addAndGet(1);
                            }
                            mutableBlockPos = new BlockPos.MutableBlockPos();
                            if (n5 == 0) break block19;
                            levelChunk = ilIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl.l();
                            if (levelChunk != null) break block20;
                        }
                        return;
                    }
                    LevelChunk levelChunk2 = levelChunk;
                    int n6 = levelChunk2.getPos().x() * 16;
                    int n7 = levelChunk2.getPos().z() * 16;
                    byteBuffer = ByteBuffer.allocateDirect(65536).order(ByteOrder.nativeOrder());
                    int n8 = 0;
                    n4 = 0;
                    block1: while (true) {
                        int n9 = n4;
                        block2: while (n9 < 256) {
                            n3 = 0;
                            if (n5 == 0) break block17;
                            n2 = n3;
                            while (n2 < 16) {
                                block18: {
                                    n9 = 0;
                                    if (n5 == 0) continue block2;
                                    for (int i = v16423; i < 16; ++i) {
                                        mutableBlockPos.set(n6 + i, n4, n7 + n2);
                                        BlockState blockState = levelChunk2.getBlockState((BlockPos)mutableBlockPos);
                                        Intrinsics.checkNotNullExpressionValue((Object)blockState, (String)"getBlockState(...)");
                                        byte by = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(blockState, (BlockPos)mutableBlockPos, (BlockGetter)levelChunk2);
                                        byteBuffer.put(n8++, by);
                                        if (n5 != 0) {
                                            if (n5 != 0) continue;
                                        }
                                        break block18;
                                    }
                                    ++n2;
                                }
                                if (n5 != 0) continue;
                            }
                            ++n4;
                            if (n5 != 0) continue block1;
                        }
                        break;
                    }
                    n4 = levelChunk2.getPos().x();
                    n3 = levelChunk2.getPos().z();
                }
                n2 = n3;
                Intrinsics.checkNotNull((Object)byteBuffer);
                IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.add(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(n4, n2, byteBuffer));
                n = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                if (n5 == 0) break block21;
                if (n == 0) break block22;
                n = IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.contains(TuplesKt.to((Object)n4, (Object)n2)) ? 1 : 0;
                if (n5 == 0) break block21;
                if (n == 0) {
                    IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.add(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(n4, n2, byteBuffer));
                }
            }
            n = IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.addAndGet(-1);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[27];
                var3_1 = 0;
                var2_2 = "\u00baH\u001d\u00fe\u00df7;\u001b-\u00a8\u009e\u0099\u0012]\u00d7\u00d0\u0000\u0006\u00c7\u00b6\u00c2\u000f\b\u00f9\t7\u0006}\u00af\u0010\u00c5\u0005\u00a0\u00a6\u0004\u00a8\u00e3\u0086\u00b7\u001dY\u00916\u00ba\u0015:O\u00e8o\u00ff\u00e5ZRj\u000b\u0085\u00e5B\u009a6\u00beCV\u00b44\u00acF\u00dbq\r\u0087\u00bfO\u00ae\u009fTu\u00beM\u00bfx\u00d2)\u0005\u00d6\u00036d\u009b\u0004\u00fa\u0017\u0095\u00ac\u0012Z\u00da\u00f4\u0006\u00e8\u00df\u0091\u0099\u00e1\u00ef\u00b6\u0093\u001a\u00a4yS\u00aaz\r\u00a3\u00fc\u0015\u00c5\u00ea\u0014{\u00d7\u0001\u00a8\u00f10\u0018\u0006@\u00f8\"\u0086|\u0096\u0011\u00b1\u000b|\u0096\u00f3:\u00be\u00ba\u009d\u009c\u0088\u001f\u00d0\u008d\u008f\u00ca\u000b\r\u0084\u00db\u00f1!v\u0088\u00e8Ds\u00da\u00bf~\u00d1\u0012\u0099v\u008c\u0097\u00e7szZ\u00d7ypA\u00c2\u00feb\u0018\u00c9\u0013\u0011\u00f2\u00eb\u0014\u008a\u00fe\u00b9\u001f\u00ca\u00a9\u0092\u000e\u00de\u0000\u00b5\u0095\u00cdH\u0004\u0014\u00f4H\u00d0\t/\u0089~^p\u00fb\tg'\u0004\u00a3;c[*)\u00ad\u00da0\u00f1dA\u0014\u0080\u00e7\u00a8YQx\u0093\u00b8y\u0012m0\u00e2[~\u0003\u0091iXb\u000e*\u00c9\u00dbJ\u0089)\u0098\u00b6{x\u0000\u00c2\u0086\u000f\u0097\u009e`I\u000b\u0017\u00c8zA# \u00bd\u00abs\n\u0004\u00c7I\nv\u0010\u008fqN|\u00bdxd\u00ae\u00dc\u00bb\u008f\u00b0\u00f2\u0011F$\u000e\u00d9I\u00a9\u00b32H\u00e8\u0098\u00a3X\u0016`X\u0018\u0005\u00efA\u0011,\u007f\u0007\u00ae\u00a91\u0001\u00eeH0";
                var4_3 = "\u00baH\u001d\u00fe\u00df7;\u001b-\u00a8\u009e\u0099\u0012]\u00d7\u00d0\u0000\u0006\u00c7\u00b6\u00c2\u000f\b\u00f9\t7\u0006}\u00af\u0010\u00c5\u0005\u00a0\u00a6\u0004\u00a8\u00e3\u0086\u00b7\u001dY\u00916\u00ba\u0015:O\u00e8o\u00ff\u00e5ZRj\u000b\u0085\u00e5B\u009a6\u00beCV\u00b44\u00acF\u00dbq\r\u0087\u00bfO\u00ae\u009fTu\u00beM\u00bfx\u00d2)\u0005\u00d6\u00036d\u009b\u0004\u00fa\u0017\u0095\u00ac\u0012Z\u00da\u00f4\u0006\u00e8\u00df\u0091\u0099\u00e1\u00ef\u00b6\u0093\u001a\u00a4yS\u00aaz\r\u00a3\u00fc\u0015\u00c5\u00ea\u0014{\u00d7\u0001\u00a8\u00f10\u0018\u0006@\u00f8\"\u0086|\u0096\u0011\u00b1\u000b|\u0096\u00f3:\u00be\u00ba\u009d\u009c\u0088\u001f\u00d0\u008d\u008f\u00ca\u000b\r\u0084\u00db\u00f1!v\u0088\u00e8Ds\u00da\u00bf~\u00d1\u0012\u0099v\u008c\u0097\u00e7szZ\u00d7ypA\u00c2\u00feb\u0018\u00c9\u0013\u0011\u00f2\u00eb\u0014\u008a\u00fe\u00b9\u001f\u00ca\u00a9\u0092\u000e\u00de\u0000\u00b5\u0095\u00cdH\u0004\u0014\u00f4H\u00d0\t/\u0089~^p\u00fb\tg'\u0004\u00a3;c[*)\u00ad\u00da0\u00f1dA\u0014\u0080\u00e7\u00a8YQx\u0093\u00b8y\u0012m0\u00e2[~\u0003\u0091iXb\u000e*\u00c9\u00dbJ\u0089)\u0098\u00b6{x\u0000\u00c2\u0086\u000f\u0097\u009e`I\u000b\u0017\u00c8zA# \u00bd\u00abs\n\u0004\u00c7I\nv\u0010\u008fqN|\u00bdxd\u00ae\u00dc\u00bb\u008f\u00b0\u00f2\u0011F$\u000e\u00d9I\u00a9\u00b32H\u00e8\u0098\u00a3X\u0016`X\u0018\u0005\u00efA\u0011,\u007f\u0007\u00ae\u00a91\u0001\u00eeH0".length();
                var1_4 = 17;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 73;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u009e\u0003qg\u00a9\u0086n\u00e30\u00c3,\u0005\u008b\u00f7@\u00cep";
                    var4_3 = "\u009e\u0003qg\u00a9\u0086n\u00e30\u00c3,\u0005\u008b\u00f7@\u00cep".length();
                    var1_4 = 11;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 80;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 113;
                            break;
                        }
                        case 1: {
                            v15 = 45;
                            break;
                        }
                        case 2: {
                            v15 = 14;
                            break;
                        }
                        case 3: {
                            v15 = 23;
                            break;
                        }
                        case 4: {
                            v15 = 65;
                            break;
                        }
                        case 5: {
                            v15 = 102;
                            break;
                        }
                        default: {
                            v15 = 76;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a = var5;
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.b = new String[27];
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "pathfind-cache-v2";
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl();
        v17 = Minecraft.getInstance();
        Intrinsics.checkNotNullExpressionValue((Object)v17, (String)"getInstance(...)");
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = v17;
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = true;
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new ArrayList<E>();
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = new HashMap<K, V>();
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = new HashMap<K, V>();
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = new ArrayList<E>();
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = new HashSet<E>();
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = new AtomicBoolean(false);
        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = new AtomicInteger(0);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x6573) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
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
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n7 = 0;
            while (n7 < cArray.length) {
                int n8 = n7 % 2;
                int n9 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n9];
                if (n8 == 0) {
                    cArray2[n9] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n9] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        @NotNull
        private final ByteBuffer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        private static String[] a;
        private static String[] b;

        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int n, int n2, @NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter((Object)byteBuffer, (String)"stateBuffer");
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = n;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = n2;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = byteBuffer;
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
        public final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(int n, int n2, @NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter((Object)byteBuffer, (String)"stateBuffer");
            return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(n, n2, byteBuffer);
        }

        public static /* synthetic */ llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, int n, int n2, ByteBuffer byteBuffer, int n3, Object object) {
            int n4 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j();
            int n5 = n3 & 1;
            if (n4 == 0) {
                if (n5 != 0) {
                    n = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                }
                n5 = n3 & 2;
            }
            if (n4 == 0) {
                if (n5 != 0) {
                    n2 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                }
                n5 = n3 & 4;
            }
            if (n5 != 0) {
                byteBuffer = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
            return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a(n, n2, byteBuffer);
        }

        @NotNull
        public String toString() {
            ByteBuffer byteBuffer = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            int n = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            int n2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            return "Chunk(cx=" + n2 + ", cz=" + n + ", stateBuffer=" + byteBuffer + ")";
        }

        public int hashCode() {
            int n = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            n = n * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            n = n * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
            return n;
        }

        public boolean equals(@Nullable Object object) {
            int n;
            int n2;
            block12: {
                int n3;
                llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2;
                block11: {
                    n2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j();
                    Object object2 = this;
                    if (n2 == 0) {
                        if (object2 == object) {
                            return true;
                        }
                        object2 = object;
                    }
                    if (n2 == 0) {
                        if (!(object2 instanceof llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)) {
                            return false;
                        }
                        object2 = object;
                    }
                    llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)object2;
                    n = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                    n3 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                    if (n2 != 0) break block11;
                    if (n != n3) {
                        return false;
                    }
                    n = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                    if (n2 != 0) break block12;
                    n3 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                }
                if (n != n3) {
                    return false;
                }
                n = Intrinsics.areEqual((Object)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, (Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0;
            }
            if (n2 == 0) {
                if (!n) {
                    return false;
                }
                n = 1;
            }
            return n;
        }

        /*
         * Unable to fully structure code
         */
        static {
            block20: {
                block19: {
                    var5 = new String[5];
                    var3_1 = 0;
                    var2_2 = "\u00c4Us\u0017\u00a5\u0088?\u00c5\u00e9\u00e0\u00d6\t\u00fbl\u00b6\u00b5\u0085\u00ef\u00e2\u0010\u00dd\u0005n\u001b\u0090\u000e\u00c3";
                    var4_3 = "\u00c4Us\u0017\u00a5\u0088?\u00c5\u00e9\u00e0\u00d6\t\u00fbl\u00b6\u00b5\u0085\u00ef\u00e2\u0010\u00dd\u0005n\u001b\u0090\u000e\u00c3".length();
                    var1_4 = 11;
                    var0_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 4;
                        v1 = ++var0_5;
                        v2 = var2_2.substring(v1, v1 + var1_4);
                        v3 = -1;
                        break block19;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var5[var3_1++] = v4.intern();
                        if ((var0_5 += var1_4) < var4_3) {
                            var1_4 = var2_2.charAt(var0_5);
                            ** continue;
                        }
                        var2_2 = "\u00be\u00fa.\u00f0\u001cf\u001a\n_\u000b\u0012\u000e\u00a5\b\u00ebp\u00f0@\u0013\u001a\u007f\u00aaskv\u00bc";
                        var4_3 = "\u00be\u00fa.\u00f0\u001cf\u001a\n_\u000b\u0012\u000e\u00a5\b\u00ebp\u00f0@\u0013\u001a\u007f\u00aaskv\u00bc".length();
                        var1_4 = 11;
                        var0_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 20;
                            v5 = ++var0_5;
                            v2 = var2_2.substring(v5, v5 + var1_4);
                            v3 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var5[var3_1++] = v4.intern();
                        if ((var0_5 += var1_4) < var4_3) {
                            var1_4 = var2_2.charAt(var0_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var6_6;
                    while (true) {
                        switch (var6_6 % 7) {
                            case 0: {
                                v15 = 18;
                                break;
                            }
                            case 1: {
                                v15 = 116;
                                break;
                            }
                            case 2: {
                                v15 = 81;
                                break;
                            }
                            case 3: {
                                v15 = 57;
                                break;
                            }
                            case 4: {
                                v15 = 77;
                                break;
                            }
                            case 5: {
                                v15 = 113;
                                break;
                            }
                            default: {
                                v15 = 26;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var6_6;
                        v8 = v11;
                        if (v11 != 0) break;
                        v11 = v8;
                        v9 = v9;
                        v14 = v8;
                        v12 = v9;
                        v13 = v8;
                    }
lbl85:
                    // 2 sources

                    v16 = v9;
                    v10 = v10;
                } while (v10 > var6_6);
                v4 = new String(v16);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl95:
                    // 1 sources

                    ** continue;
                }
            }
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a = var5;
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b = new String[5];
        }

        private static String a(int n, int n2) {
            int n3 = (n ^ 0x3813) & 0xFFFF;
            if (b[n3] == null) {
                int n4;
                char[] cArray = a[n3].toCharArray();
                int n5 = switch (cArray[0] & 0xFF) {
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
                int n6 = (n2 & 0xFF) - n5;
                if (n6 < 0) {
                    n6 += 256;
                }
                if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                    n4 += 256;
                }
                int n7 = 0;
                while (n7 < cArray.length) {
                    int n8 = n7 % 2;
                    int n9 = n7;
                    char[] cArray2 = cArray;
                    char c = cArray[n9];
                    if (n8 == 0) {
                        cArray2[n9] = (char)(c ^ n6);
                        n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                    } else {
                        cArray2[n9] = (char)(c ^ n4);
                        n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                    }
                    ++n7;
                }
                llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b[n3] = new String(cArray).intern();
            }
            return b[n3];
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

        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(int n, int n2, int n3, @NotNull IntArrayList intArrayList, @NotNull ByteArrayList byteArrayList) {
            Intrinsics.checkNotNullParameter((Object)intArrayList, (String)"indices");
            Intrinsics.checkNotNullParameter((Object)byteArrayList, (String)"states");
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = n;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = n2;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = n3;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = intArrayList;
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = byteArrayList;
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
        public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(int n, int n2, int n3, @NotNull IntArrayList intArrayList, @NotNull ByteArrayList byteArrayList) {
            Intrinsics.checkNotNullParameter((Object)intArrayList, (String)"indices");
            Intrinsics.checkNotNullParameter((Object)byteArrayList, (String)"states");
            return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(n, n2, n3, intArrayList, byteArrayList);
        }

        public static /* synthetic */ IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, int n, int n2, int n3, IntArrayList intArrayList, ByteArrayList byteArrayList, int n4, Object object) {
            int n5 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j();
            int n6 = n4 & 1;
            if (n5 == 0) {
                if (n6 != 0) {
                    n = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                }
                n6 = n4 & 2;
            }
            if (n5 == 0) {
                if (n6 != 0) {
                    n2 = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                }
                n6 = n4 & 4;
            }
            if (n5 == 0) {
                if (n6 != 0) {
                    n3 = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                }
                n6 = n4 & 8;
            }
            if (n5 == 0) {
                if (n6 != 0) {
                    intArrayList = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                }
                n6 = n4 & 0x10;
            }
            if (n6 != 0) {
                byteArrayList = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }
            return illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(n, n2, n3, intArrayList, byteArrayList);
        }

        @NotNull
        public String toString() {
            ByteArrayList byteArrayList = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            IntArrayList intArrayList = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            int n = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            int n2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            int n3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            return "ChunkChange(cx=" + n3 + ", cy=" + n2 + ", cz=" + n + ", indices=" + intArrayList + ", states=" + byteArrayList + ")";
        }

        public int hashCode() {
            int n = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            n = n * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            n = n * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            n = n * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
            n = n * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
            return n;
        }

        public boolean equals(@Nullable Object object) {
            int n;
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
            int n2;
            block16: {
                int n3;
                block15: {
                    n2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j();
                    Object object2 = this;
                    if (n2 == 0) {
                        if (object2 == object) {
                            return true;
                        }
                        object2 = object;
                    }
                    if (n2 == 0) {
                        if (!(object2 instanceof IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)) {
                            return false;
                        }
                        object2 = object;
                    }
                    illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)object2;
                    int n3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                    n3 = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                    if (n2 == 0) {
                        if (n != n3) {
                            return false;
                        }
                        int n3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                        n3 = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                    }
                    if (n2 != 0) break block15;
                    if (n != n3) {
                        return false;
                    }
                    n = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                    if (n2 != 0) break block16;
                    n3 = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                }
                if (n != n3) {
                    return false;
                }
                n = Intrinsics.areEqual((Object)this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, (Object)illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0;
            }
            if (n2 == 0) {
                if (!n) {
                    return false;
                }
                n = Intrinsics.areEqual((Object)this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, (Object)illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            }
            if (n2 == 0) {
                if (!n) {
                    return false;
                }
                n = 1;
            }
            return n;
        }

        /*
         * Unable to fully structure code
         */
        static {
            block20: {
                block19: {
                    var5 = new String[9];
                    var3_1 = 0;
                    var2_2 = "\u009bcRDZ\b\u0006\u0007Z\u00c1c(\u00ec\u0005\u00f7\u0007i\u0018'\t\u0099\u008f\u00b4\u0007\u00d2g\u00fe\u0014\u0004\n\u00cf\u0081d\u00dc\u0094X\u0095[\u00e1\u00c2\u0005\u00b8(\u0080\u00fe\u001a\u0007\u00b0\u00a5k\u00d8\u00de3+";
                    var4_3 = "\u009bcRDZ\b\u0006\u0007Z\u00c1c(\u00ec\u0005\u00f7\u0007i\u0018'\t\u0099\u008f\u00b4\u0007\u00d2g\u00fe\u0014\u0004\n\u00cf\u0081d\u00dc\u0094X\u0095[\u00e1\u00c2\u0005\u00b8(\u0080\u00fe\u001a\u0007\u00b0\u00a5k\u00d8\u00de3+".length();
                    var1_4 = 6;
                    var0_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 45;
                        v1 = ++var0_5;
                        v2 = var2_2.substring(v1, v1 + var1_4);
                        v3 = -1;
                        break block19;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var5[var3_1++] = v4.intern();
                        if ((var0_5 += var1_4) < var4_3) {
                            var1_4 = var2_2.charAt(var0_5);
                            ** continue;
                        }
                        var2_2 = "\u00b93\u00c87m\u00f3\u00b3\u00b9\u00ae\u00bcI\u00f0v;q\u0007L\u001d\b3N\u00b2\u00c5";
                        var4_3 = "\u00b93\u00c87m\u00f3\u00b3\u00b9\u00ae\u00bcI\u00f0v;q\u0007L\u001d\b3N\u00b2\u00c5".length();
                        var1_4 = 15;
                        var0_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 50;
                            v5 = ++var0_5;
                            v2 = var2_2.substring(v5, v5 + var1_4);
                            v3 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var5[var3_1++] = v4.intern();
                        if ((var0_5 += var1_4) < var4_3) {
                            var1_4 = var2_2.charAt(var0_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var6_6;
                    while (true) {
                        switch (var6_6 % 7) {
                            case 0: {
                                v15 = 84;
                                break;
                            }
                            case 1: {
                                v15 = 74;
                                break;
                            }
                            case 2: {
                                v15 = 95;
                                break;
                            }
                            case 3: {
                                v15 = 103;
                                break;
                            }
                            case 4: {
                                v15 = 91;
                                break;
                            }
                            case 5: {
                                v15 = 109;
                                break;
                            }
                            default: {
                                v15 = 111;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var6_6;
                        v8 = v11;
                        if (v11 != 0) break;
                        v11 = v8;
                        v9 = v9;
                        v14 = v8;
                        v12 = v9;
                        v13 = v8;
                    }
lbl85:
                    // 2 sources

                    v16 = v9;
                    v10 = v10;
                } while (v10 > var6_6);
                v4 = new String(v16);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl95:
                    // 1 sources

                    ** continue;
                }
            }
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a = var5;
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b = new String[9];
        }

        private static String a(int n, int n2) {
            int n3 = (n ^ 0x3F01) & 0xFFFF;
            if (b[n3] == null) {
                int n4;
                char[] cArray = a[n3].toCharArray();
                int n5 = switch (cArray[0] & 0xFF) {
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
                int n6 = (n2 & 0xFF) - n5;
                if (n6 < 0) {
                    n6 += 256;
                }
                if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                    n4 += 256;
                }
                int n7 = 0;
                while (n7 < cArray.length) {
                    int n8 = n7 % 2;
                    int n9 = n7;
                    char[] cArray2 = cArray;
                    char c = cArray[n9];
                    if (n8 == 0) {
                        cArray2[n9] = (char)(c ^ n6);
                        n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                    } else {
                        cArray2[n9] = (char)(c ^ n4);
                        n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                    }
                    ++n7;
                }
                IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b[n3] = new String(cArray).intern();
            }
            return b[n3];
        }
    }

    public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
        private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        @NotNull
        private final ShortArrayList IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        private static String[] a;
        private static String[] b;

        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(int n, int n2, @NotNull ShortArrayList shortArrayList) {
            Intrinsics.checkNotNullParameter((Object)shortArrayList, (String)"indices");
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = n;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = n2;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = shortArrayList;
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
        public final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(int n, int n2, @NotNull ShortArrayList shortArrayList) {
            Intrinsics.checkNotNullParameter((Object)shortArrayList, (String)"indices");
            return new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(n, n2, shortArrayList);
        }

        public static /* synthetic */ IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, int n, int n2, ShortArrayList shortArrayList, int n3, Object object) {
            int n4 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
            int n5 = n3 & 1;
            if (n4 != 0) {
                if (n5 != 0) {
                    n = iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                }
                n5 = n3 & 2;
            }
            if (n4 != 0) {
                if (n5 != 0) {
                    n2 = iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                }
                n5 = n3 & 4;
            }
            if (n5 != 0) {
                shortArrayList = iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
            return iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a(n, n2, shortArrayList);
        }

        @NotNull
        public String toString() {
            ShortArrayList shortArrayList = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            int n = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            int n2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            return "HeightChunkChange(cx=" + n2 + ", cz=" + n + ", indices=" + shortArrayList + ")";
        }

        public int hashCode() {
            int n = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            n = n * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            n = n * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
            return n;
        }

        public boolean equals(@Nullable Object object) {
            int n;
            int n2;
            block12: {
                int n3;
                IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
                block11: {
                    n2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
                    Object object2 = this;
                    if (n2 != 0) {
                        if (object2 == object) {
                            return true;
                        }
                        object2 = object;
                    }
                    if (n2 != 0) {
                        if (!(object2 instanceof IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)) {
                            return false;
                        }
                        object2 = object;
                    }
                    iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)object2;
                    n = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                    n3 = iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                    if (n2 == 0) break block11;
                    if (n != n3) {
                        return false;
                    }
                    n = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                    if (n2 == 0) break block12;
                    n3 = iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                }
                if (n != n3) {
                    return false;
                }
                n = Intrinsics.areEqual((Object)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, (Object)iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0;
            }
            if (n2 != 0) {
                if (!n) {
                    return false;
                }
                n = 1;
            }
            return n;
        }

        /*
         * Unable to fully structure code
         */
        static {
            block20: {
                block19: {
                    var5 = new String[5];
                    var3_1 = 0;
                    var2_2 = "fa\u00ae\u0097U\u00feq\n\u00f0>\u009c\u00fc\u00b8x;\u009d\u00d6\u0005\u0007?@\u0085\u00b30z\u00dd";
                    var4_3 = "fa\u00ae\u0097U\u00feq\n\u00f0>\u009c\u00fc\u00b8x;\u009d\u00d6\u0005\u0007?@\u0085\u00b30z\u00dd".length();
                    var1_4 = 7;
                    var0_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 99;
                        v1 = ++var0_5;
                        v2 = var2_2.substring(v1, v1 + var1_4);
                        v3 = -1;
                        break block19;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var5[var3_1++] = v4.intern();
                        if ((var0_5 += var1_4) < var4_3) {
                            var1_4 = var2_2.charAt(var0_5);
                            ** continue;
                        }
                        var2_2 = "\u00a2\u0003\u00e9h\u00cd\b\u00ef\u00f7\u00b9`!0\u00b0<y\u00b7|\u00f3\u00f9\u00d1}\u0005\u0089\u00can\u00a1#";
                        var4_3 = "\u00a2\u0003\u00e9h\u00cd\b\u00ef\u00f7\u00b9`!0\u00b0<y\u00b7|\u00f3\u00f9\u00d1}\u0005\u0089\u00can\u00a1#".length();
                        var1_4 = 21;
                        var0_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 63;
                            v5 = ++var0_5;
                            v2 = var2_2.substring(v5, v5 + var1_4);
                            v3 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var5[var3_1++] = v4.intern();
                        if ((var0_5 += var1_4) < var4_3) {
                            var1_4 = var2_2.charAt(var0_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var6_6;
                    while (true) {
                        switch (var6_6 % 7) {
                            case 0: {
                                v15 = 48;
                                break;
                            }
                            case 1: {
                                v15 = 98;
                                break;
                            }
                            case 2: {
                                v15 = 75;
                                break;
                            }
                            case 3: {
                                v15 = 50;
                                break;
                            }
                            case 4: {
                                v15 = 109;
                                break;
                            }
                            case 5: {
                                v15 = 100;
                                break;
                            }
                            default: {
                                v15 = 5;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var6_6;
                        v8 = v11;
                        if (v11 != 0) break;
                        v11 = v8;
                        v9 = v9;
                        v14 = v8;
                        v12 = v9;
                        v13 = v8;
                    }
lbl85:
                    // 2 sources

                    v16 = v9;
                    v10 = v10;
                } while (v10 > var6_6);
                v4 = new String(v16);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl95:
                    // 1 sources

                    ** continue;
                }
            }
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a = var5;
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b = new String[5];
        }

        private static String a(int n, int n2) {
            int n3 = (n ^ 0x1AF) & 0xFFFF;
            if (b[n3] == null) {
                int n4;
                char[] cArray = a[n3].toCharArray();
                int n5 = switch (cArray[0] & 0xFF) {
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
                int n6 = (n2 & 0xFF) - n5;
                if (n6 < 0) {
                    n6 += 256;
                }
                if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                    n4 += 256;
                }
                int n7 = 0;
                while (n7 < cArray.length) {
                    int n8 = n7 % 2;
                    int n9 = n7;
                    char[] cArray2 = cArray;
                    char c = cArray[n9];
                    if (n8 == 0) {
                        cArray2[n9] = (char)(c ^ n6);
                        n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                    } else {
                        cArray2[n9] = (char)(c ^ n4);
                        n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                    }
                    ++n7;
                }
                IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b[n3] = new String(cArray).intern();
            }
            return b[n3];
        }
    }

    public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
        public static /* synthetic */ int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

        static {
            int[] nArray = new int[Direction.values().length];
            try {
                nArray[Direction.EAST.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[Direction.WEST.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[Direction.SOUTH.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = nArray;
        }
    }
}

