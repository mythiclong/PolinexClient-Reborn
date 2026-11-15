/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Lazy
 *  kotlin.LazyKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.CoroutineContext
 *  kotlin.enums.EnumEntries
 *  kotlin.enums.EnumEntriesKt
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.ranges.RangesKt
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.CoroutineScopeKt
 *  kotlinx.coroutines.Dispatchers
 *  kotlinx.coroutines.JobKt
 *  kotlinx.coroutines.SupervisorKt
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.level.ChunkPos
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.octo.client;

import java.lang.invoke.LambdaMetafactory;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
import me.octo.client.IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll;
import me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll;
import me.octo.client.IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI;
import me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll;
import me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl;
import me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;
import me.octo.client.utils.IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll
extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
    @NotNull
    public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
    @NotNull
    private final Lazy lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
    @NotNull
    private final ConcurrentHashMap<BlockPos, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
    private final Set<ChunkPos> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
    private int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
    private final int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
    @NotNull
    private CoroutineScope IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
    @JvmField
    @NotNull
    public static IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll();
    @NotNull
    private static Function1<Block, Boolean> IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
    @NotNull
    private static Function1<Block, Boolean> llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
    @NotNull
    private static Function1<Block, Boolean> IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
    @NotNull
    private static Function1<Block, Boolean> lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
    @NotNull
    private static Function1<Block, Boolean> llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
    @NotNull
    private static Function1<Block, Boolean> lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
    @NotNull
    private static Function1<Block, Boolean> IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
    @NotNull
    private static Function1<Block, Boolean> IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
    @NotNull
    private static Function1<Block, Boolean> IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
    @NotNull
    private static Function1<Block, Boolean> llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
    @NotNull
    private static Function1<Block, Boolean> lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
    @NotNull
    private static Function1<Block, Boolean> IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
    @NotNull
    private static Function1<Block, Boolean> IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
    @NotNull
    private static Function1<Block, Boolean> lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
    @NotNull
    private static Function1<Block, Boolean> lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
    @NotNull
    private static Function1<Block, Boolean> IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
    @NotNull
    private static Function1<Block, Boolean> IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
    @NotNull
    private static Function1<Block, Boolean> IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
    @NotNull
    private static Function1<Block, Boolean> IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
    @NotNull
    private static Function1<Block, Boolean> IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
    @NotNull
    private static Function1<Block, Boolean> lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
    @NotNull
    private static Function1<Block, Boolean> lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
    @NotNull
    private static Function1<Block, Boolean> lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
    @NotNull
    private static Function1<Block, Boolean> IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
    @NotNull
    private static Function1<Block, Boolean> llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
    @NotNull
    private static Function1<Block, Boolean> llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
    @NotNull
    private static Function1<Block, Boolean> IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
    @NotNull
    private static Function1<Block, Boolean> llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
    @NotNull
    private static Function1<Block, Boolean> lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
    @NotNull
    private static Function1<Block, Boolean> IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
    @NotNull
    private static Function1<Block, Boolean> lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;

    public static final kotlin.jvm.functions.Function1 a0() { return lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 a1() { return lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 a2() { return lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 a3() { return IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 a4() { return llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 a5() { return llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 a6() { return IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 a7() { return llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 a8() { return lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 a9() { return IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aG() { return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aH() { return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aI() { return IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aJ() { return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aK() { return llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aL() { return lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aM() { return IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aN() { return IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aO() { return IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aP() { return llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aQ() { return lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aR() { return IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aS() { return IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aT() { return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aU() { return lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aV() { return IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aW() { return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aX() { return IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aY() { return IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 aZ() { return IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */

    public static final kotlin.jvm.functions.Function1 a_() { return lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    private static String[] f;
    private static String[] g;

    private IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll() {
        IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] iIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlllArray = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.a(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.b(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.c(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.d(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.e(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.f(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.g(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.h(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.i(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.j(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.k(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.l(), IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.m()};
        super("Structure Scanner", "Finds important structures in Crystal Hollows.", me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, "Crystal Hollows", iIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlllArray);
        this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = LazyKt.lazy(IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll::ai);
        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new ConcurrentHashMap();
        this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = Collections.synchronizedSet(new LinkedHashSet());
        this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 8;
        this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getDefault().plus((CoroutineContext)SupervisorKt.SupervisorJob((kotlinx.coroutines.Job)null)));
    }

    private final List<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> ag() {
        Lazy lazy = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
        return (List)lazy.getValue();
    }

    @Override
    public void aB() {
        super.aB();
        this.ah();
    }

    @Override
    public void aC() {
        this.ah();
        super.aC();
    }

    @SubscribeEvent
    public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl iIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl) {
        Intrinsics.checkNotNullParameter((Object)iIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl, (String)"event");
        this.ah();
    }

    private final void ah() {
        block2: {
            int[] nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
            CoroutineScopeKt.cancel((CoroutineScope)this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, (java.util.concurrent.CancellationException)null);
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getDefault().plus((CoroutineContext)SupervisorKt.SupervisorJob((kotlinx.coroutines.Job)null)));
            Iterator iterator = ((ConcurrentHashMap.KeySetView)this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.keySet()).iterator();
            Intrinsics.checkNotNullExpressionValue(iterator, (String)"iterator(...)");
            Iterator iterator2 = iterator;
            int[] nArray2 = nArray;
            while (iterator2.hasNext()) {
                BlockPos blockPos = (BlockPos)iterator2.next();
                Intrinsics.checkNotNull((Object)blockPos);
                IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(this.a(blockPos));
                IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(this.b(blockPos));
                if (nArray2 != null) {
                    if (nArray2 != null) continue;
                }
                break block2;
            }
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
        }
    }

    private final String a(BlockPos blockPos) {
        return "structure:" + blockPos;
    }

    private final String b(BlockPos blockPos) {
        return "structure-beam:" + blockPos;
    }

    @SubscribeEvent
    public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII2) {
        int[] nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
        Intrinsics.checkNotNullParameter((Object)llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII2, (String)"event");
        int[] nArray2 = nArray;
        if (nArray2 != null) {
            if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
                return;
            }
            ++this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
        }
        IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll illlIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll = this;
        if (nArray2 != null) {
            if (illlIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI % 8 != 0) {
                return;
            }
            illlIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll = this;
        }
        final var illlFinal = illlIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll; // PX-FIX: 内部类捕获 final 副本
        BuildersKt.launch((CoroutineScope)illlIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, (CoroutineContext)kotlin.coroutines.EmptyCoroutineContext.INSTANCE, kotlinx.coroutines.CoroutineStart.DEFAULT, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Unit> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll this$0;
            private static String a;
            {
                this.this$0 = illlFinal;
                /* PX-FIX removed super call */
            }

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(Object var1_1) {
               return null;
            }

            public final Continuation<Unit> create(Object object, Continuation<?> continuation) {
                return (Continuation)null /* PX-FIX */;
            }

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static IllegalStateException a(IllegalStateException illegalStateException) {
                return illegalStateException;
            }

            /*
             * Handled impossible loop by duplicating code
             * Enabled aggressive block sorting
             */
            static {
                char[] cArray;
                block12: {
                    int n;
                    char[] cArray2;
                    int n2;
                    int n3;
                    block11: {
                        char[] cArray3 = "v~v\t8O!58h\u0000kN#p8:\u0007}]!gz:BqU8zt\u007fB8L'aw:\u0006wI!`ks\u000b}".toCharArray();
                        int n4 = cArray3.length;
                        n3 = 0;
                        n2 = 17;
                        cArray2 = cArray3;
                        n = n4;
                        if (n4 <= 1) break block11;
                        cArray = cArray2;
                        n = n;
                        if (n <= n3) break block12;
                    }
                    do {
                        int n5 = n2;
                        cArray2 = cArray2;
                        char[] cArray4 = cArray2;
                        int n6 = n2;
                        int n7 = n3;
                        while (true) {
                            cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                                case 0 -> 4;
                                case 1 -> 14;
                                case 2 -> 11;
                                case 3 -> 116;
                                case 4 -> 9;
                                case 5 -> 42;
                                default -> 95;
                            })));
                            ++n3;
                            n2 = n5;
                            if (n5 != 0) break;
                            n5 = n2;
                            cArray2 = cArray2;
                            n7 = n2;
                            cArray4 = cArray2;
                            n6 = n2;
                        }
                        cArray = cArray2;
                        n = n;
                    } while (n > n3);
                }
                a = new String(cArray).intern();
            }
        }));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private final Object a(Continuation<? super Unit> continuation) {
      // decoy `g()` padding array and every `aload_2; ifnull/ifnonnull` fold dropped (COMMON decoy family); the dead `iconst_0; istore 11` at offset 119 dropped too.
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      ClientLevel var3 = this.ap().level;
      if (var3 == null) {
         return Unit.INSTANCE;
      }
      LocalPlayer var4 = this.ap().player;
      if (var4 == null) {
         return Unit.INSTANCE;
      }
      int var5 = var4.getBlockX() >> 4;
      int var6 = var4.getBlockZ() >> 4;
      for (int var7 = var5 - IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl; var7 <= var5 + IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl; var7++) {
         for (int var9 = var6 - IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl; var9 <= var6 + IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl; var9++) {
            JobKt.ensureActive(continuation.getContext());
            ChunkPos var11 = new ChunkPos(var7, var9);
            if (!IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.contains(var11) && var3.getChunkSource().hasChunk(var7, var9)) {
               for (int var12 = 0; var12 < 16; var12++) {
                  for (int var13 = 0; var13 < 16; var13++) {
                     this.a(var7 * 16 + var12, var9 * 16 + var13);
                  }
               }
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.add(var11);
            }
         }
      }
      return Unit.INSTANCE;
    }

    /*
     * Unable to fully structure code
     */
    private final void a(int var1_1, int var2_2) {
      int[] var3 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var3 == null) {
         return;
      }

      ClientLevel var4 = this.ap().level;
      if (var4 == null) {
         return;
      }

      for (var var6 : this.ag()) {
         if (!var6.d().al()) {
            continue;
         }

         if (!var6.c().a(var1_1, var2_2)) {
            continue;
         }

         for (int var7 = 28; var7 < 191; var7++) {
            if (!var6.c().a(var7)) {
               continue;
            }

            if (Intrinsics.areEqual(var4.getBlockState(new BlockPos(var1_1, var7, var2_2)).getBlock(), Blocks.AIR)) {
               continue;
            }

            for (var var9 : var6.e()) {
               if (!this.a(var1_1, var7, var2_2, var9)) {
                  continue;
               }

               this.a(new BlockPos(var1_1, var7, var2_2), var6);
            }
         }
      }
    }

    private final boolean a(int n, int n2, int n3, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2) {
        ClientLevel clientLevel;
        int[] nArray;
        block7: {
            block6: {
                nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
                if (nArray == null) break block6;
                clientLevel = this.ap().level;
                if (clientLevel != null) break block7;
            }
            return false;
        }
        ClientLevel clientLevel2 = clientLevel;
        Iterator iterator = ((Iterable)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a()).iterator();
        int n4 = 0;
        block0: while (iterator.hasNext()) {
            int n5 = n4;
            int n6 = n4 + 1;
            do {
                Block block;
                n4 = n6;
                Function1 function1 = (Function1)iterator.next();
                block = clientLevel2.getBlockState(new BlockPos(n, n2 + n5, n3)).getBlock();
                Intrinsics.checkNotNullExpressionValue((Object)block, (String)"getBlock(...)");
                Block block2 = block;
                if (nArray != null) {
                    block2 = Intrinsics.areEqual((Object)block2, (Object)Blocks.FIRE) ? Blocks.AIR : block;
                }
                Block block3 = block2;
                Intrinsics.checkNotNull((Object)block3);
                if (((Boolean)function1.invoke((Object)block3)).booleanValue()) continue block0;
                n6 = 0;
            } while (nArray == null);
            return n6 != 0;
        }
        return true;
    }

    private final void a(BlockPos blockPos, IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll) {
        Enumeration<BlockPos> enumeration = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.keys();
        Intrinsics.checkNotNullExpressionValue(enumeration, (String)"keys(...)");
        Iterator iterator = CollectionsKt.iterator(enumeration);
        while (iterator.hasNext()) {
            double d;
            BlockPos blockPos2 = (BlockPos)iterator.next();
            double d2 = blockPos.getX() - blockPos2.getX();
            if (!(Math.sqrt(d2 * d2 + (d = (double)(blockPos.getZ() - blockPos2.getZ())) * d) <= 40.0)) continue;
            return;
        }
        ((Map)this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll).put(blockPos, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll);
        int n = iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b().o();
        int n2 = iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b().a(0.5f).o();
        AABB aABB = new AABB((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ(), (double)blockPos.getX() + 1.0, (double)blockPos.getY() + 1.0, (double)blockPos.getZ() + 1.0);
        AABB aABB2 = new AABB((double)blockPos.getX() + 0.4, (double)blockPos.getY(), (double)blockPos.getZ() + 0.4, (double)blockPos.getX() + 0.6, (double)blockPos.getY() + 150.0, (double)blockPos.getZ() + 0.6);
        IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a((Object)this.a(blockPos), aABB, new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(n2), new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(n), 4.0f, null, null, 0.0f, false, 0.0f, 992, null);
        IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a((Object)this.b(blockPos), aABB2, new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(n), null, 0.0f, null, null, 0.0f, false, 0.0f, 1016, null);
        this.ap().execute(() -> IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll.a(iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, blockPos));
    }

    @SubscribeEvent(priority=EventPriority.HIGH)
    public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl ilIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl) {
        int[] nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
        Intrinsics.checkNotNullParameter((Object)ilIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl, (String)"event");
        int[] nArray2 = nArray;
        if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
        }
        LocalPlayer localPlayer = this.ap().player;
        if (localPlayer == null) {
            return;
        }
        LocalPlayer localPlayer2 = localPlayer;
        Map map = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
        boolean bl = false;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry;
            Map.Entry entry2 = entry = ((Map.Entry)(iterator.next()));
            boolean bl2 = false;
            BlockPos blockPos = (BlockPos)entry2.getKey();
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)entry2.getValue();
            double d = (double)blockPos.getX() + 0.5;
            double d2 = (double)blockPos.getZ() + 0.5;
            double d3 = localPlayer2.getX() - d;
            double d4 = localPlayer2.getY() - ((double)blockPos.getY() + 1.5);
            double d5 = localPlayer2.getZ() - d2;
            double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
            float f = (float)RangesKt.coerceIn((double)(d6 / 6.5), (double)1.0, (double)20.0);
            IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a(iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a() + " - " + (int)d6 + "m", new Vec3(d, (double)blockPos.getY() + 1.5, d2), f, false, iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b(), null, 0.0f, null, 224, null);
            if (nArray2 == null) break;
            if (nArray2 != null) continue;
            break;
        }
    }

    private static final List ai() {
        Object[] objectArray = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[14];
        Object[] objectArray2 = new Function1[]{lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII};
        objectArray[0] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Corleone Batcave", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 165, 50), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.a(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new Function1[]{lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI, lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll, IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII};
        objectArray[1] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Corleone Hideaway", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 165, 50), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.a(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[3];
        Object[] objectArray3 = new Function1[]{llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll};
        objectArray2[0] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray3));
        objectArray3 = new Function1[]{llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI, lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI, llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll};
        objectArray2[1] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray3));
        objectArray3 = new Function1[]{llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI, llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI, IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl, llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll};
        objectArray2[2] = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray3));
        objectArray[2] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Spiral", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(150, 200, 255), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.b(), CollectionsKt.listOf((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])objectArray2));
        objectArray2 = new Function1[]{IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI, IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll, IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll, lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII, lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII, lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII};
        objectArray[3] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Precursor City", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(100, 220, 255), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.c(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new Function1[]{lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI, lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII, IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII, lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII};
        objectArray[4] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Mines of Divan", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 215, 0), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.d(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new Function1[]{IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI};
        objectArray[5] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Jungle Temple", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(100, 200, 100), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.e(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new Function1[]{lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll, lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll, lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll, llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI, IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll, IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll, llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI, IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll, lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll};
        objectArray[6] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Goblin Queen", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 100, 150), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.f(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new Function1[]{IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI};
        objectArray[7] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Dragon's Lair", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 80, 80), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.g(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new Function1[]{IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll};
        objectArray[8] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Bal", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 50, 50), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.h(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new Function1[]{lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll, IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl};
        objectArray[9] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Goblin King", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(200, 255, 100), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.i(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new Function1[]{llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll, IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI};
        objectArray[10] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Odawa", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 150, 150), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.j(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new Function1[]{llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII};
        objectArray[11] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Xalx", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 120, 120), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.k(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray2 = new Function1[]{lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI};
        objectArray[12] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Pete", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 200, 50), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.l(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf((Function1<Block,Boolean>[])objectArray2))));
        objectArray[13] = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll("Fairy Grotto", new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 85, 255), llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, IIlllIllIIIllIIlIlIlllIIIllIIIIIllIIlllIIlllllIIlIIIllllllIIllIlIIIIllllIIIIlIIIIlllI.m(), CollectionsKt.listOf(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(CollectionsKt.listOf(IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI))));
        return CollectionsKt.listOf((Object[])objectArray);
    }

    private static final void a(IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, BlockPos blockPos) {
        int n = blockPos.getZ();
        int n2 = blockPos.getY();
        int n3 = blockPos.getX();
        String string = iIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a();
        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Found <bold>" + string + "</bold> at " + n3 + " " + n2 + " " + n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean a(Block block) {
        int[] nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
        Intrinsics.checkNotNullParameter((Object)block, (String)"it");
        int[] nArray2 = nArray;
        boolean bl = Intrinsics.areEqual((Object)block, (Object)Blocks.MAGENTA_STAINED_GLASS);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.MAGENTA_STAINED_GLASS_PANE);
        if (nArray2 == null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean b(Block block) {
        int[] nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
        Intrinsics.checkNotNullParameter((Object)block, (String)"b");
        int[] nArray2 = nArray;
        boolean bl = Intrinsics.areEqual((Object)block, (Object)Blocks.TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.WHITE_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.ORANGE_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.MAGENTA_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.LIGHT_BLUE_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.YELLOW_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.LIME_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.PINK_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.GRAY_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.LIGHT_GRAY_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.CYAN_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.PURPLE_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.BLUE_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.BROWN_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.GREEN_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.RED_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (bl) return true;
        bl = Intrinsics.areEqual((Object)block, (Object)Blocks.BLACK_TERRACOTTA);
        if (nArray2 == null) return bl;
        if (!bl) return false;
        return true;
    }

    public static final /* synthetic */ Object a(IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll illlIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll, Continuation continuation) {
        return illlIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll.a((Continuation<? super Unit>)continuation);
    }

    private static String d(int n, int n2) {
        int n3 = (n ^ 0x4240) & 0xFFFF;
        if (g[n3] == null) {
            int n4;
            char[] cArray = f[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 198;
                case 1 -> 26;
                case 2 -> 228;
                case 3 -> 55;
                case 4 -> 192;
                case 5 -> 131;
                case 6 -> 167;
                case 7 -> 205;
                case 8 -> 241;
                case 9 -> 112;
                case 10 -> 104;
                case 11 -> 5;
                case 12 -> 70;
                case 13 -> 10;
                case 14 -> 146;
                case 15 -> 188;
                case 16 -> 216;
                case 17 -> 179;
                case 18 -> 24;
                case 19 -> 76;
                case 20 -> 203;
                case 21 -> 94;
                case 22 -> 136;
                case 23 -> 220;
                case 24 -> 186;
                case 25 -> 2;
                case 26 -> 199;
                case 27 -> 204;
                case 28 -> 105;
                case 29 -> 250;
                case 30 -> 242;
                case 31 -> 81;
                case 32 -> 122;
                case 33 -> 180;
                case 34 -> 102;
                case 35 -> 158;
                case 36 -> 124;
                case 37 -> 114;
                case 38 -> 43;
                case 39 -> 116;
                case 40 -> 127;
                case 41 -> 61;
                case 42 -> 119;
                case 43 -> 171;
                case 44 -> 210;
                case 45 -> 142;
                case 46 -> 110;
                case 47 -> 96;
                case 48 -> 46;
                case 49 -> 236;
                case 50 -> 14;
                case 51 -> 30;
                case 52 -> 231;
                case 53 -> 108;
                case 54 -> 40;
                case 55 -> 27;
                case 56 -> 153;
                case 57 -> 33;
                case 58 -> 67;
                case 59 -> 49;
                case 60 -> 85;
                case 61 -> 206;
                case 62 -> 7;
                case 63 -> 62;
                case 64 -> 170;
                case 65 -> 177;
                case 66 -> 65;
                case 67 -> 178;
                case 68 -> 212;
                case 69 -> 168;
                case 70 -> 141;
                case 71 -> 208;
                case 72 -> 97;
                case 73 -> 68;
                case 74 -> 139;
                case 75 -> 169;
                case 76 -> 21;
                case 77 -> 95;
                case 78 -> 243;
                case 79 -> 22;
                case 80 -> 159;
                case 81 -> 254;
                case 82 -> 249;
                case 83 -> 230;
                case 84 -> 92;
                case 85 -> 246;
                case 86 -> 56;
                case 87 -> 200;
                case 88 -> 42;
                case 89 -> 154;
                case 90 -> 101;
                case 91 -> 28;
                case 92 -> 126;
                case 93 -> 138;
                case 94 -> 58;
                case 95 -> 196;
                case 96 -> 224;
                case 97 -> 248;
                case 98 -> 80;
                case 99 -> 209;
                case 100 -> 45;
                case 101 -> 89;
                case 102 -> 25;
                case 103 -> 52;
                case 104 -> 38;
                case 105 -> 174;
                case 106 -> 84;
                case 107 -> 75;
                case 108 -> 166;
                case 109 -> 144;
                case 110 -> 182;
                case 111 -> 213;
                case 112 -> 115;
                case 113 -> 117;
                case 114 -> 145;
                case 115 -> 223;
                case 116 -> 207;
                case 117 -> 147;
                case 118 -> 133;
                case 119 -> 51;
                case 120 -> 225;
                case 121 -> 91;
                case 122 -> 44;
                case 123 -> 12;
                case 124 -> 72;
                case 125 -> 123;
                case 126 -> 157;
                case 127 -> 181;
                case 128 -> 118;
                case 129 -> 53;
                case 130 -> 227;
                case 131 -> 23;
                case 132 -> 20;
                case 133 -> 152;
                case 134 -> 162;
                case 135 -> 140;
                case 136 -> 113;
                case 137 -> 175;
                case 138 -> 130;
                case 139 -> 64;
                case 140 -> 234;
                case 141 -> 202;
                case 142 -> 201;
                case 143 -> 218;
                case 144 -> 193;
                case 145 -> 3;
                case 146 -> 251;
                case 147 -> 87;
                case 148 -> 190;
                case 149 -> 244;
                case 150 -> 255;
                case 151 -> 160;
                case 152 -> 219;
                case 153 -> 195;
                case 154 -> 253;
                case 155 -> 245;
                case 156 -> 132;
                case 157 -> 6;
                case 158 -> 197;
                case 159 -> 211;
                case 160 -> 226;
                case 161 -> 88;
                case 162 -> 128;
                case 163 -> 148;
                case 164 -> 215;
                case 165 -> 13;
                case 166 -> 34;
                case 167 -> 48;
                case 168 -> 29;
                case 169 -> 106;
                case 170 -> 135;
                case 171 -> 247;
                case 172 -> 78;
                case 173 -> 235;
                case 174 -> 15;
                case 175 -> 233;
                case 176 -> 143;
                case 177 -> 66;
                case 178 -> 194;
                case 179 -> 163;
                case 180 -> 238;
                case 181 -> 165;
                case 182 -> 47;
                case 183 -> 229;
                case 184 -> 240;
                case 185 -> 121;
                case 186 -> 50;
                case 187 -> 86;
                case 188 -> 71;
                case 189 -> 17;
                case 190 -> 69;
                case 191 -> 176;
                case 192 -> 150;
                case 193 -> 185;
                case 194 -> 9;
                case 195 -> 156;
                case 196 -> 90;
                case 197 -> 137;
                case 198 -> 100;
                case 199 -> 0;
                case 200 -> 83;
                case 201 -> 111;
                case 202 -> 73;
                case 203 -> 189;
                case 204 -> 151;
                case 205 -> 39;
                case 206 -> 99;
                case 207 -> 18;
                case 208 -> 41;
                case 209 -> 164;
                case 210 -> 8;
                case 211 -> 155;
                case 212 -> 183;
                case 213 -> 36;
                case 214 -> 37;
                case 215 -> 172;
                case 216 -> 187;
                case 217 -> 221;
                case 218 -> 11;
                case 219 -> 149;
                case 220 -> 184;
                case 221 -> 79;
                case 222 -> 107;
                case 223 -> 125;
                case 224 -> 252;
                case 225 -> 103;
                case 226 -> 54;
                case 227 -> 173;
                case 228 -> 237;
                case 229 -> 60;
                case 230 -> 59;
                case 231 -> 214;
                case 232 -> 19;
                case 233 -> 82;
                case 234 -> 161;
                case 235 -> 16;
                case 236 -> 98;
                case 237 -> 222;
                case 238 -> 4;
                case 239 -> 129;
                case 240 -> 77;
                case 241 -> 217;
                case 242 -> 109;
                case 243 -> 232;
                case 244 -> 57;
                case 245 -> 35;
                case 246 -> 1;
                case 247 -> 74;
                case 248 -> 63;
                case 249 -> 32;
                case 250 -> 191;
                case 251 -> 31;
                case 252 -> 239;
                case 253 -> 93;
                case 254 -> 120;
                default -> 134;
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
            IlllIllIllllIIIllIIIIlIlIllIlIlllIlllIlIIllIIlllIllIIIIlllIlIlIIIllllIIIlIIIlIIIIllll.g[n3] = new String(cArray).intern();
        }
        return g[n3];
    }

    private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        @NotNull
        private final List<Function1<Block, Boolean>> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        private static String[] a;
        private static String[] b;

        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull List<? extends Function1<? super Block, Boolean>> list) {
            Intrinsics.checkNotNullParameter(list, (String)"matchers");
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = ((List<Function1<Block,Boolean>>)(Object)(list));
        }

        @NotNull
        public final List<Function1<Block, Boolean>> a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }

        @NotNull
        public final List<Function1<Block, Boolean>> b() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }

        @NotNull
        public final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(@NotNull List<? extends Function1<? super Block, Boolean>> list) {
            Intrinsics.checkNotNullParameter(list, (String)"matchers");
            return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(list);
        }

        public static /* synthetic */ llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, List list, int n, Object object) {
            if ((n & 1) != 0) {
                list = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
            return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a(list);
        }

        @NotNull
        public String toString() {
            return "Check(matchers=" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + ")";
        }

        public int hashCode() {
            return ((Object)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).hashCode();
        }

        public boolean equals(@Nullable Object object) {
            int[] nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
            Object object2 = this;
            if (nArray != null) {
                if (object2 == object) {
                    return true;
                }
                object2 = object;
            }
            if (nArray != null) {
                if (!(object2 instanceof llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)) {
                    return false;
                }
                object2 = object;
            }
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)object2;
            boolean bl = Intrinsics.areEqual(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            if (nArray != null) {
                if (!bl) {
                    return false;
                }
                bl = true;
            }
            return bl;
        }

        private static String a(int n, int n2) {
            int n3 = (n ^ 0xFFFFF0BE) & 0xFFFF;
            if (b[n3] == null) {
                int n4;
                char[] cArray = a[n3].toCharArray();
                int n5 = switch (cArray[0] & 0xFF) {
                    case 0 -> 24;
                    case 1 -> 162;
                    case 2 -> 238;
                    case 3 -> 113;
                    case 4 -> 84;
                    case 5 -> 211;
                    case 6 -> 133;
                    case 7 -> 172;
                    case 8 -> 160;
                    case 9 -> 237;
                    case 10 -> 212;
                    case 11 -> 153;
                    case 12 -> 157;
                    case 13 -> 122;
                    case 14 -> 52;
                    case 15 -> 78;
                    case 16 -> 22;
                    case 17 -> 27;
                    case 18 -> 49;
                    case 19 -> 235;
                    case 20 -> 206;
                    case 21 -> 221;
                    case 22 -> 87;
                    case 23 -> 226;
                    case 24 -> 60;
                    case 25 -> 201;
                    case 26 -> 199;
                    case 27 -> 82;
                    case 28 -> 254;
                    case 29 -> 140;
                    case 30 -> 95;
                    case 31 -> 29;
                    case 32 -> 9;
                    case 33 -> 196;
                    case 34 -> 244;
                    case 35 -> 85;
                    case 36 -> 159;
                    case 37 -> 139;
                    case 38 -> 51;
                    case 39 -> 143;
                    case 40 -> 178;
                    case 41 -> 73;
                    case 42 -> 233;
                    case 43 -> 92;
                    case 44 -> 146;
                    case 45 -> 246;
                    case 46 -> 222;
                    case 47 -> 103;
                    case 48 -> 183;
                    case 49 -> 20;
                    case 50 -> 4;
                    case 51 -> 45;
                    case 52 -> 12;
                    case 53 -> 37;
                    case 54 -> 75;
                    case 55 -> 191;
                    case 56 -> 106;
                    case 57 -> 30;
                    case 58 -> 156;
                    case 59 -> 108;
                    case 60 -> 17;
                    case 61 -> 25;
                    case 62 -> 76;
                    case 63 -> 202;
                    case 64 -> 50;
                    case 65 -> 200;
                    case 66 -> 203;
                    case 67 -> 110;
                    case 68 -> 96;
                    case 69 -> 241;
                    case 70 -> 88;
                    case 71 -> 129;
                    case 72 -> 130;
                    case 73 -> 179;
                    case 74 -> 55;
                    case 75 -> 177;
                    case 76 -> 93;
                    case 77 -> 165;
                    case 78 -> 134;
                    case 79 -> 217;
                    case 80 -> 155;
                    case 81 -> 252;
                    case 82 -> 188;
                    case 83 -> 61;
                    case 84 -> 1;
                    case 85 -> 80;
                    case 86 -> 175;
                    case 87 -> 118;
                    case 88 -> 195;
                    case 89 -> 69;
                    case 90 -> 149;
                    case 91 -> 216;
                    case 92 -> 44;
                    case 93 -> 250;
                    case 94 -> 70;
                    case 95 -> 255;
                    case 96 -> 47;
                    case 97 -> 121;
                    case 98 -> 26;
                    case 99 -> 148;
                    case 100 -> 151;
                    case 101 -> 242;
                    case 102 -> 115;
                    case 103 -> 228;
                    case 104 -> 240;
                    case 105 -> 41;
                    case 106 -> 56;
                    case 107 -> 42;
                    case 108 -> 71;
                    case 109 -> 8;
                    case 110 -> 79;
                    case 111 -> 205;
                    case 112 -> 174;
                    case 113 -> 105;
                    case 114 -> 81;
                    case 115 -> 112;
                    case 116 -> 207;
                    case 117 -> 46;
                    case 118 -> 171;
                    case 119 -> 100;
                    case 120 -> 7;
                    case 121 -> 213;
                    case 122 -> 239;
                    case 123 -> 6;
                    case 124 -> 135;
                    case 125 -> 94;
                    case 126 -> 66;
                    case 127 -> 145;
                    case 128 -> 204;
                    case 129 -> 225;
                    case 130 -> 166;
                    case 131 -> 131;
                    case 132 -> 39;
                    case 133 -> 167;
                    case 134 -> 99;
                    case 135 -> 247;
                    case 136 -> 125;
                    case 137 -> 126;
                    case 138 -> 57;
                    case 139 -> 223;
                    case 140 -> 152;
                    case 141 -> 72;
                    case 142 -> 161;
                    case 143 -> 158;
                    case 144 -> 3;
                    case 145 -> 102;
                    case 146 -> 150;
                    case 147 -> 11;
                    case 148 -> 136;
                    case 149 -> 40;
                    case 150 -> 21;
                    case 151 -> 186;
                    case 152 -> 190;
                    case 153 -> 35;
                    case 154 -> 120;
                    case 155 -> 2;
                    case 156 -> 83;
                    case 157 -> 215;
                    case 158 -> 169;
                    case 159 -> 184;
                    case 160 -> 236;
                    case 161 -> 170;
                    case 162 -> 232;
                    case 163 -> 128;
                    case 164 -> 18;
                    case 165 -> 208;
                    case 166 -> 90;
                    case 167 -> 89;
                    case 168 -> 36;
                    case 169 -> 67;
                    case 170 -> 144;
                    case 171 -> 119;
                    case 172 -> 28;
                    case 173 -> 182;
                    case 174 -> 5;
                    case 175 -> 59;
                    case 176 -> 194;
                    case 177 -> 98;
                    case 178 -> 189;
                    case 179 -> 248;
                    case 180 -> 86;
                    case 181 -> 15;
                    case 182 -> 193;
                    case 183 -> 38;
                    case 184 -> 154;
                    case 185 -> 16;
                    case 186 -> 123;
                    case 187 -> 197;
                    case 188 -> 68;
                    case 189 -> 10;
                    case 190 -> 230;
                    case 191 -> 218;
                    case 192 -> 209;
                    case 193 -> 117;
                    case 194 -> 220;
                    case 195 -> 109;
                    case 196 -> 48;
                    case 197 -> 34;
                    case 198 -> 43;
                    case 199 -> 111;
                    case 200 -> 219;
                    case 201 -> 141;
                    case 202 -> 251;
                    case 203 -> 77;
                    case 204 -> 164;
                    case 205 -> 245;
                    case 206 -> 253;
                    case 207 -> 19;
                    case 208 -> 234;
                    case 209 -> 32;
                    case 210 -> 229;
                    case 211 -> 224;
                    case 212 -> 127;
                    case 213 -> 168;
                    case 214 -> 173;
                    case 215 -> 53;
                    case 216 -> 33;
                    case 217 -> 192;
                    case 218 -> 163;
                    case 219 -> 104;
                    case 220 -> 101;
                    case 221 -> 13;
                    case 222 -> 187;
                    case 223 -> 97;
                    case 224 -> 185;
                    case 225 -> 65;
                    case 226 -> 132;
                    case 227 -> 23;
                    case 228 -> 91;
                    case 229 -> 107;
                    case 230 -> 137;
                    case 231 -> 63;
                    case 232 -> 114;
                    case 233 -> 181;
                    case 234 -> 138;
                    case 235 -> 142;
                    case 236 -> 180;
                    case 237 -> 124;
                    case 238 -> 58;
                    case 239 -> 147;
                    case 240 -> 64;
                    case 241 -> 31;
                    case 242 -> 231;
                    case 243 -> 198;
                    case 244 -> 214;
                    case 245 -> 176;
                    case 246 -> 116;
                    case 247 -> 210;
                    case 248 -> 0;
                    case 249 -> 74;
                    case 250 -> 62;
                    case 251 -> 249;
                    case 252 -> 14;
                    case 253 -> 243;
                    case 254 -> 227;
                    default -> 54;
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
        private static String a;

        private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
        }

        private final Function1<Block, Boolean> a(Block block) {
            return arg_0 -> IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(block, arg_0);
        }

        @NotNull
        public final Function1<Block, Boolean> a() {
            return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
        }

        @NotNull
        public final Function1<Block, Boolean> b() {
            return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
        }

        @NotNull
        public final Function1<Block, Boolean> c() {
            return IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
        }

        @NotNull
        public final Function1<Block, Boolean> d() {
            return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
        }

        @NotNull
        public final Function1<Block, Boolean> e() {
            return llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
        }

        @NotNull
        public final Function1<Block, Boolean> f() {
            return lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
        }

        @NotNull
        public final Function1<Block, Boolean> g() {
            return IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
        }

        @NotNull
        public final Function1<Block, Boolean> h() {
            return IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
        }

        @NotNull
        public final Function1<Block, Boolean> i() {
            return IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
        }

        @NotNull
        public final Function1<Block, Boolean> j() {
            return llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
        }

        @NotNull
        public final Function1<Block, Boolean> k() {
            return lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
        }

        @NotNull
        public final Function1<Block, Boolean> l() {
            return IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
        }

        @NotNull
        public final Function1<Block, Boolean> m() {
            return IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
        }

        @NotNull
        public final Function1<Block, Boolean> n() {
            return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
        }

        @NotNull
        public final Function1<Block, Boolean> o() {
            return lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
        }

        @NotNull
        public final Function1<Block, Boolean> p() {
            return IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
        }

        @NotNull
        public final Function1<Block, Boolean> q() {
            return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
        }

        @NotNull
        public final Function1<Block, Boolean> r() {
            return IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
        }

        @NotNull
        public final Function1<Block, Boolean> s() {
            return IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
        }

        @NotNull
        public final Function1<Block, Boolean> t() {
            return IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
        }

        @NotNull
        public final Function1<Block, Boolean> u() {
            return lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
        }

        @NotNull
        public final Function1<Block, Boolean> v() {
            return lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
        }

        @NotNull
        public final Function1<Block, Boolean> w() {
            return lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
        }

        @NotNull
        public final Function1<Block, Boolean> x() {
            return IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
        }

        @NotNull
        public final Function1<Block, Boolean> y() {
            return llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
        }

        @NotNull
        public final Function1<Block, Boolean> z() {
            return llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
        }

        @NotNull
        public final Function1<Block, Boolean> A() {
            return IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
        }

        @NotNull
        public final Function1<Block, Boolean> B() {
            return llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
        }

        @NotNull
        public final Function1<Block, Boolean> C() {
            return lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
        }

        @NotNull
        public final Function1<Block, Boolean> D() {
            return IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
        }

        @NotNull
        public final Function1<Block, Boolean> E() {
            return lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
        }

        private static final boolean a(Block block, Block block2) {
            Intrinsics.checkNotNullParameter((Object)block2, (String)a);
            return Intrinsics.areEqual((Object)block2, (Object)block);
        }

        public /* synthetic */ IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ Function1 a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, Block block) {
            return illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(block);
        }

        /*
         * Handled impossible loop by duplicating code
         * Enabled aggressive block sorting
         */
        static {
            char[] cArray;
            block12: {
                int n;
                char[] cArray2;
                int n2;
                int n3;
                block11: {
                    char[] cArray3 = "\u0010p".toCharArray();
                    int n4 = cArray3.length;
                    n3 = 0;
                    n2 = 52;
                    cArray2 = cArray3;
                    n = n4;
                    if (n4 <= 1) break block11;
                    cArray = cArray2;
                    n = n;
                    if (n <= n3) break block12;
                }
                do {
                    int n5 = n2;
                    cArray2 = cArray2;
                    char[] cArray4 = cArray2;
                    int n6 = n2;
                    int n7 = n3;
                    while (true) {
                        cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                            case 0 -> 77;
                            case 1 -> 48;
                            case 2 -> 113;
                            case 3 -> 103;
                            case 4 -> 25;
                            case 5 -> 127;
                            default -> 92;
                        })));
                        ++n3;
                        n2 = n5;
                        if (n5 != 0) break;
                        n5 = n2;
                        cArray2 = cArray2;
                        n7 = n2;
                        cArray4 = cArray2;
                        n6 = n2;
                    }
                    cArray = cArray2;
                    n = n;
                } while (n > n3);
            }
            a = new String(cArray).intern();
        }
    }

    private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
        @NotNull
        private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        @NotNull
        private final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        @NotNull
        private final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        @NotNull
        private final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
        @NotNull
        private final List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
        private static String[] a;
        private static String[] b;

        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(@NotNull String string, @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll2, @NotNull llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll2, @NotNull IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl illIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl, @NotNull List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> list) {
            Intrinsics.checkNotNullParameter((Object)string, (String)"name");
            Intrinsics.checkNotNullParameter((Object)llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll2, (String)"color");
            int[] nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
            Intrinsics.checkNotNullParameter((Object)((Object)llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll2), (String)"zone");
            int[] nArray2 = nArray;
            Intrinsics.checkNotNullParameter((Object)illIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl, (String)"toggle");
            Intrinsics.checkNotNullParameter(list, (String)"checks");
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = string;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll2;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll2;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = illIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = list;
            if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
                lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b(new int[2]);
            }
        }

        @NotNull
        public final String a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }

        @NotNull
        public final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }

        @NotNull
        public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll c() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }

        @NotNull
        public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl d() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
        }

        @NotNull
        public final List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> e() {
            return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
        }

        private static String a(int n, int n2) {
            int n3 = (n ^ 0xFFFFF5DE) & 0xFFFF;
            if (b[n3] == null) {
                int n4;
                char[] cArray = a[n3].toCharArray();
                int n5 = switch (cArray[0] & 0xFF) {
                    case 0 -> 57;
                    case 1 -> 154;
                    case 2 -> 50;
                    case 3 -> 216;
                    case 4 -> 37;
                    case 5 -> 139;
                    case 6 -> 222;
                    case 7 -> 224;
                    case 8 -> 1;
                    case 9 -> 61;
                    case 10 -> 230;
                    case 11 -> 163;
                    case 12 -> 109;
                    case 13 -> 97;
                    case 14 -> 126;
                    case 15 -> 183;
                    case 16 -> 52;
                    case 17 -> 174;
                    case 18 -> 47;
                    case 19 -> 123;
                    case 20 -> 95;
                    case 21 -> 101;
                    case 22 -> 112;
                    case 23 -> 6;
                    case 24 -> 133;
                    case 25 -> 21;
                    case 26 -> 103;
                    case 27 -> 94;
                    case 28 -> 15;
                    case 29 -> 169;
                    case 30 -> 187;
                    case 31 -> 122;
                    case 32 -> 83;
                    case 33 -> 217;
                    case 34 -> 25;
                    case 35 -> 98;
                    case 36 -> 35;
                    case 37 -> 49;
                    case 38 -> 210;
                    case 39 -> 175;
                    case 40 -> 114;
                    case 41 -> 24;
                    case 42 -> 219;
                    case 43 -> 147;
                    case 44 -> 150;
                    case 45 -> 232;
                    case 46 -> 82;
                    case 47 -> 194;
                    case 48 -> 41;
                    case 49 -> 88;
                    case 50 -> 89;
                    case 51 -> 166;
                    case 52 -> 18;
                    case 53 -> 32;
                    case 54 -> 116;
                    case 55 -> 212;
                    case 56 -> 64;
                    case 57 -> 189;
                    case 58 -> 233;
                    case 59 -> 248;
                    case 60 -> 43;
                    case 61 -> 215;
                    case 62 -> 203;
                    case 63 -> 161;
                    case 64 -> 201;
                    case 65 -> 130;
                    case 66 -> 190;
                    case 67 -> 172;
                    case 68 -> 237;
                    case 69 -> 79;
                    case 70 -> 68;
                    case 71 -> 99;
                    case 72 -> 62;
                    case 73 -> 13;
                    case 74 -> 54;
                    case 75 -> 235;
                    case 76 -> 242;
                    case 77 -> 141;
                    case 78 -> 40;
                    case 79 -> 165;
                    case 80 -> 229;
                    case 81 -> 119;
                    case 82 -> 34;
                    case 83 -> 155;
                    case 84 -> 198;
                    case 85 -> 193;
                    case 86 -> 108;
                    case 87 -> 120;
                    case 88 -> 241;
                    case 89 -> 207;
                    case 90 -> 76;
                    case 91 -> 100;
                    case 92 -> 160;
                    case 93 -> 77;
                    case 94 -> 209;
                    case 95 -> 8;
                    case 96 -> 182;
                    case 97 -> 44;
                    case 98 -> 17;
                    case 99 -> 92;
                    case 100 -> 16;
                    case 101 -> 246;
                    case 102 -> 31;
                    case 103 -> 251;
                    case 104 -> 115;
                    case 105 -> 93;
                    case 106 -> 106;
                    case 107 -> 181;
                    case 108 -> 226;
                    case 109 -> 186;
                    case 110 -> 7;
                    case 111 -> 33;
                    case 112 -> 142;
                    case 113 -> 91;
                    case 114 -> 195;
                    case 115 -> 4;
                    case 116 -> 158;
                    case 117 -> 137;
                    case 118 -> 177;
                    case 119 -> 149;
                    case 120 -> 136;
                    case 121 -> 75;
                    case 122 -> 86;
                    case 123 -> 221;
                    case 124 -> 51;
                    case 125 -> 227;
                    case 126 -> 153;
                    case 127 -> 129;
                    case 128 -> 255;
                    case 129 -> 63;
                    case 130 -> 208;
                    case 131 -> 11;
                    case 132 -> 2;
                    case 133 -> 164;
                    case 134 -> 113;
                    case 135 -> 218;
                    case 136 -> 157;
                    case 137 -> 247;
                    case 138 -> 117;
                    case 139 -> 238;
                    case 140 -> 138;
                    case 141 -> 236;
                    case 142 -> 250;
                    case 143 -> 213;
                    case 144 -> 143;
                    case 145 -> 105;
                    case 146 -> 204;
                    case 147 -> 58;
                    case 148 -> 152;
                    case 149 -> 167;
                    case 150 -> 145;
                    case 151 -> 211;
                    case 152 -> 118;
                    case 153 -> 127;
                    case 154 -> 74;
                    case 155 -> 159;
                    case 156 -> 223;
                    case 157 -> 59;
                    case 158 -> 48;
                    case 159 -> 162;
                    case 160 -> 253;
                    case 161 -> 252;
                    case 162 -> 121;
                    case 163 -> 36;
                    case 164 -> 70;
                    case 165 -> 196;
                    case 166 -> 56;
                    case 167 -> 102;
                    case 168 -> 185;
                    case 169 -> 80;
                    case 170 -> 85;
                    case 171 -> 205;
                    case 172 -> 239;
                    case 173 -> 27;
                    case 174 -> 214;
                    case 175 -> 140;
                    case 176 -> 60;
                    case 177 -> 42;
                    case 178 -> 30;
                    case 179 -> 23;
                    case 180 -> 173;
                    case 181 -> 197;
                    case 182 -> 111;
                    case 183 -> 132;
                    case 184 -> 55;
                    case 185 -> 178;
                    case 186 -> 9;
                    case 187 -> 90;
                    case 188 -> 156;
                    case 189 -> 228;
                    case 190 -> 131;
                    case 191 -> 225;
                    case 192 -> 170;
                    case 193 -> 10;
                    case 194 -> 249;
                    case 195 -> 5;
                    case 196 -> 243;
                    case 197 -> 191;
                    case 198 -> 234;
                    case 199 -> 199;
                    case 200 -> 176;
                    case 201 -> 96;
                    case 202 -> 19;
                    case 203 -> 0;
                    case 204 -> 135;
                    case 205 -> 188;
                    case 206 -> 179;
                    case 207 -> 84;
                    case 208 -> 66;
                    case 209 -> 29;
                    case 210 -> 202;
                    case 211 -> 46;
                    case 212 -> 67;
                    case 213 -> 39;
                    case 214 -> 22;
                    case 215 -> 168;
                    case 216 -> 3;
                    case 217 -> 125;
                    case 218 -> 73;
                    case 219 -> 184;
                    case 220 -> 171;
                    case 221 -> 72;
                    case 222 -> 200;
                    case 223 -> 38;
                    case 224 -> 151;
                    case 225 -> 110;
                    case 226 -> 71;
                    case 227 -> 20;
                    case 228 -> 87;
                    case 229 -> 53;
                    case 230 -> 231;
                    case 231 -> 128;
                    case 232 -> 45;
                    case 233 -> 180;
                    case 234 -> 192;
                    case 235 -> 206;
                    case 236 -> 148;
                    case 237 -> 69;
                    case 238 -> 28;
                    case 239 -> 124;
                    case 240 -> 254;
                    case 241 -> 220;
                    case 242 -> 14;
                    case 243 -> 144;
                    case 244 -> 146;
                    case 245 -> 134;
                    case 246 -> 240;
                    case 247 -> 244;
                    case 248 -> 78;
                    case 249 -> 104;
                    case 250 -> 107;
                    case 251 -> 65;
                    case 252 -> 26;
                    case 253 -> 12;
                    case 254 -> 245;
                    default -> 81;
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

    private enum llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
        IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII(201, 512, 512, 824),
        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI(512, 824, 512, 824),
        IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll(201, 512, 201, 512),
        lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll(512, 824, 201, 512),
        IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII(201, 824, 201, 824),
        llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI(201, 824, 201, 824);
        private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
        private static /* synthetic */ llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
        private static /* synthetic */ EnumEntries lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;

        private llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(int n2, int n3, int n4, int n5) {
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = n2;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = n3;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = n4;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = n5;
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
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
        }

        public final boolean a(int n, int n2) {
            block17: {
                int n3;
                block23: {
                    block22: {
                        int n4;
                        block21: {
                            int n5;
                            int[] nArray;
                            block20: {
                                block19: {
                                    int n6;
                                    block18: {
                                        block16: {
                                            int n7;
                                            block15: {
                                                block14: {
                                                    int n8;
                                                    block13: {
                                                        block12: {
                                                            int n9;
                                                            block11: {
                                                                int n10 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + 1;
                                                                nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
                                                                n8 = n;
                                                                n9 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                                                                if (nArray == null) break block11;
                                                                if (n8 >= n9) break block12;
                                                                n8 = n10;
                                                                if (nArray == null) break block13;
                                                                n9 = n;
                                                            }
                                                            n8 = n8 <= n9 ? 1 : 0;
                                                            break block13;
                                                        }
                                                        n8 = 0;
                                                    }
                                                    if (n8 == 0) break block14;
                                                    n7 = n2;
                                                    if (nArray == null) break block15;
                                                    if (n7 <= this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) break block14;
                                                    n7 = n2;
                                                    if (nArray == null) break block15;
                                                    if (n7 < this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) break block16;
                                                }
                                                n7 = 0;
                                            }
                                            return n7 != 0;
                                        }
                                        if (this != llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) break block17;
                                        n5 = 476;
                                        n6 = n;
                                        if (nArray == null) break block18;
                                        if (n5 > n6) break block19;
                                        n5 = n;
                                        if (nArray == null) break block20;
                                        n6 = 553;
                                    }
                                    n5 = n5 < n6 ? 1 : 0;
                                    break block20;
                                }
                                n5 = 0;
                            }
                            if (n5 == 0) break block17;
                            n3 = 476;
                            n4 = n2;
                            if (nArray == null) break block21;
                            if (n3 > n4) break block22;
                            n3 = n2;
                            if (nArray == null) break block23;
                            n4 = 553;
                        }
                        n3 = n3 < n4 ? 1 : 0;
                        break block23;
                    }
                    n3 = 0;
                }
                if (n3 != 0) {
                    return false;
                }
            }
            return true;
        }

        public final boolean a(int n) {
            block3: {
                int n2;
                block6: {
                    block5: {
                        int n3;
                        block4: {
                            int[] nArray = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
                            if (this != llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) break block3;
                            n2 = 69;
                            n3 = n;
                            if (nArray == null) break block4;
                            if (n2 > n3) break block5;
                            n2 = n;
                            if (nArray == null) break block6;
                            n3 = 182;
                        }
                        n2 = n2 < n3 ? 1 : 0;
                        break block6;
                    }
                    n2 = 0;
                }
                if (n2 != 0) {
                    return false;
                }
            }
            return true;
        }

        public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] e() {
            return (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.clone();
        }

        public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(String string) {
            return Enum.valueOf(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.class, string);
        }

        @NotNull
        public static EnumEntries<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> f() {
            return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
        }

        private static final /* synthetic */ llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] g() {
            llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[] llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIllArray = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll[]{IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI};
            return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIllArray;
        }

        static {
            lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = g();
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = EnumEntriesKt.enumEntries(g());
        }
    }
}

