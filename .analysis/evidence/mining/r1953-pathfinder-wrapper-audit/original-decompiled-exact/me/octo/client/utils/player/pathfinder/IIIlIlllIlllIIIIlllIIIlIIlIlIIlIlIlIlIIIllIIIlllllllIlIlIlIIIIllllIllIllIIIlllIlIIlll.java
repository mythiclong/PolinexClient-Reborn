/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.CollectionsKt
 *  kotlin.comparisons.ComparisonsKt
 *  kotlin.enums.EnumEntries
 *  kotlin.enums.EnumEntriesKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.octo.client.utils.player.pathfinder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
import me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
import me.octo.client.utils.player.pathfinder.NativePathFinder;
import me.octo.client.utils.player.pathfinder.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
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
    public final List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(@Nullable Entity entity) {
        BlockPos blockPos;
        BlockPos blockPos2;
        block7: {
            block6: {
                BlockPos blockPos3;
                int n;
                block5: {
                    block4: {
                        n = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j();
                        if (n != 0) break block4;
                        blockPos3 = this.b((Entity)this.a().player);
                        if (blockPos3 != null) break block5;
                    }
                    return null;
                }
                blockPos2 = blockPos3;
                if (n != 0) break block6;
                blockPos = this.b(entity);
                if (blockPos != null) break block7;
            }
            return null;
        }
        BlockPos blockPos4 = blockPos;
        return this.a(blockPos4, blockPos2, true);
    }

    @Nullable
    public final List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(@NotNull BlockPos blockPos) {
        BlockPos blockPos2;
        block3: {
            block2: {
                int n = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
                Intrinsics.checkNotNullParameter((Object)blockPos, (String)"to");
                int n2 = n;
                if (n2 == 0) break block2;
                blockPos2 = this.b((Entity)this.a().player);
                if (blockPos2 != null) break block3;
            }
            return null;
        }
        BlockPos blockPos3 = blockPos2;
        return this.a(blockPos, blockPos3, true);
    }

    @Nullable
    public final List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(@NotNull BlockPos blockPos, boolean bl) {
        BlockPos blockPos2;
        block3: {
            block2: {
                int n = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
                Intrinsics.checkNotNullParameter((Object)blockPos, (String)"to");
                int n2 = n;
                if (n2 == 0) break block2;
                blockPos2 = this.b((Entity)this.a().player);
                if (blockPos2 != null) break block3;
            }
            return null;
        }
        BlockPos blockPos3 = blockPos2;
        return this.a(blockPos, blockPos3, bl);
    }

    @Nullable
    public final List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(@NotNull BlockPos blockPos, @NotNull BlockPos blockPos2) {
        Intrinsics.checkNotNullParameter((Object)blockPos, (String)"to");
        Intrinsics.checkNotNullParameter((Object)blockPos2, (String)"from");
        return this.a(blockPos, blockPos2, true);
    }

    @Nullable
    public final List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> a(@NotNull BlockPos blockPos, @NotNull BlockPos blockPos2, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)blockPos, (String)"to");
        Intrinsics.checkNotNullParameter((Object)blockPos2, (String)"from");
        long l = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(blockPos);
        long l2 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(blockPos2);
        int n = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
        double d = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.o();
        double d2 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i();
        long[] lArray = NativePathFinder.findPath(l, l2, (float)d, (int)d2, true);
        Intrinsics.checkNotNull((Object)lArray);
        int n2 = lArray.length;
        if (n != 0) {
            n2 = n2 == 0 ? 1 : 0;
        }
        if (n2 != 0) {
            return null;
        }
        return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(lArray, d, d2, bl);
    }

    @Nullable
    public final List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b(@NotNull BlockPos blockPos) {
        BlockPos blockPos2;
        block3: {
            block2: {
                int n = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
                Intrinsics.checkNotNullParameter((Object)blockPos, (String)"to");
                int n2 = n;
                if (n2 == 0) break block2;
                blockPos2 = this.b((Entity)this.a().player);
                if (blockPos2 != null) break block3;
            }
            return null;
        }
        BlockPos blockPos3 = blockPos2;
        return this.b(blockPos, blockPos3);
    }

    @Nullable
    public final List<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b(@NotNull BlockPos blockPos, @NotNull BlockPos blockPos2) {
        int n = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
        Intrinsics.checkNotNullParameter((Object)blockPos, (String)"to");
        Intrinsics.checkNotNullParameter((Object)blockPos2, (String)"from");
        int n2 = n;
        long l = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(blockPos);
        long l2 = IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(blockPos2);
        double d = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.o();
        double d2 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i();
        long[] lArray = NativePathFinder.findPath(l, l2, (float)d, (int)d2, true);
        Intrinsics.checkNotNull((Object)lArray);
        int n3 = lArray.length;
        if (n2 != 0) {
            n3 = n3 == 0 ? 1 : 0;
        }
        if (n3 != 0) {
            return null;
        }
        return llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(lArray, d2);
    }

    @Nullable
    public final BlockPos b(@Nullable Entity entity) {
        Collection collection;
        Object object;
        int n;
        ClientLevel clientLevel;
        block10: {
            clientLevel = this.a().level;
            n = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k();
            if (entity == null || clientLevel == null) {
                return null;
            }
            AABB aABB = entity.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue((Object)aABB, (String)"getBoundingBox(...)");
            AABB aABB2 = aABB;
            double d = entity.getY() - 0.01;
            object = new BlockPos[]{BlockPos.containing((double)aABB2.minX, (double)d, (double)aABB2.minZ), BlockPos.containing((double)aABB2.minX, (double)d, (double)aABB2.maxZ), BlockPos.containing((double)aABB2.maxX, (double)d, (double)aABB2.minZ), BlockPos.containing((double)aABB2.maxX, (double)d, (double)aABB2.maxZ)};
            object = CollectionsKt.distinct((Iterable)CollectionsKt.listOf((Object[])object));
            boolean bl = false;
            Object object2 = object;
            collection = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)object, (int)10));
            boolean bl2 = false;
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t = iterator.next();
                BlockPos blockPos = (BlockPos)t;
                Collection collection2 = collection;
                boolean bl3 = false;
                double d2 = Math.max(0.0, Math.min(aABB2.maxX, (double)blockPos.getX() + 1.0) - Math.max(aABB2.minX, (double)blockPos.getX()));
                double d3 = Math.max(0.0, Math.min(aABB2.maxZ, (double)blockPos.getZ() + 1.0) - Math.max(aABB2.minZ, (double)blockPos.getZ()));
                collection2.add(TuplesKt.to((Object)blockPos, (Object)(d2 * d3)));
                if (n != 0) {
                    if (n != 0) continue;
                    break;
                }
                break block10;
            }
            object = (List)collection;
            bl = false;
        }
        List list = CollectionsKt.sortedWith((Iterable)object, (Comparator)new Comparator(){

            public final int compare(T t, T t2) {
                Pair pair = (Pair)t2;
                boolean bl = false;
                Comparable comparable = (Double)pair.getSecond();
                pair = (Pair)t;
                Comparable comparable2 = comparable;
                bl = false;
                return ComparisonsKt.compareValues((Comparable)comparable2, (Comparable)((Double)pair.getSecond()));
            }
        });
        for (int i = 0; i < 257; ++i) {
            block2: for (Object object2 : list) {
                BlockPos blockPos = ((BlockPos)object2.getFirst()).offset(0, -i, 0);
                Object object3 = blockPos;
                Intrinsics.checkNotNullExpressionValue((Object)blockPos, (String)"offset(...)");
                do {
                    collection = object3;
                    boolean bl = NativePathFinder.isWalkable(IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a((BlockPos)collection));
                    if (n != 0) {
                        if (bl) {
                            return collection;
                        }
                        bl = clientLevel.getBlockState((BlockPos)collection).is((Object)Blocks.LADDER);
                    }
                    if (n != 0) {
                        if (!bl) continue block2;
                        bl = clientLevel.getBlockState(collection.offset(0, 1, 0)).is((Object)Blocks.LADDER);
                    }
                    if (n != 0) {
                        if (!bl) continue block2;
                        bl = clientLevel.getBlockState(collection.offset(0, 2, 0)).is((Object)Blocks.LADDER);
                    }
                    if (!bl) continue block2;
                    object3 = collection;
                } while (n == 0);
                return object3;
            }
            if (n != 0) continue;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[6];
                var3_1 = 0;
                var2_2 = "\u009bE\u0002\u00c8\u001a\u0004dQ\u0014\u009a\u0004{\u00e0\u00f7\u00ac";
                var4_3 = "\u009bE\u0002\u00c8\u001a\u0004dQ\u0014\u009a\u0004{\u00e0\u00f7\u00ac".length();
                var1_4 = 2;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 112;
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
                    var2_2 = "hx\u0081K\u0014\u00e8!\u0082\t\u00a5\u00cd\u00e4\u00a3\u00a1\u00fe\u008a\u00af[\u0086\u000bO\u0092~D\u00b1\u001f\u0098\u0017\u00f7T\u00f3";
                    var4_3 = "hx\u0081K\u0014\u00e8!\u0082\t\u00a5\u00cd\u00e4\u00a3\u00a1\u00fe\u008a\u00af[\u0086\u000bO\u0092~D\u00b1\u001f\u0098\u0017\u00f7T\u00f3".length();
                    var1_4 = 19;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 18;
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
                            v15 = 85;
                            break;
                        }
                        case 2: {
                            v15 = 13;
                            break;
                        }
                        case 3: {
                            v15 = 53;
                            break;
                        }
                        case 4: {
                            v15 = 64;
                            break;
                        }
                        case 5: {
                            v15 = 8;
                            break;
                        }
                        default: {
                            v15 = 23;
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
        IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.c = var5;
        IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d = new String[6];
        IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll();
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0x5BE3) & 0xFFFF;
        if (d[n3] == null) {
            int n4;
            char[] cArray = c[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
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
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d[n3] = new String(cArray).intern();
        }
        return d[n3];
    }

    public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        @NotNull
        private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        @NotNull
        private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        @NotNull
        private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        private static String[] a;
        private static String[] b;

        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull BlockPos blockPos, @NotNull Vec3 vec3, @NotNull IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll) {
            Intrinsics.checkNotNullParameter((Object)blockPos, (String)"pos");
            Intrinsics.checkNotNullParameter((Object)vec3, (String)"topCenter");
            Intrinsics.checkNotNullParameter((Object)((Object)iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll), (String)"type");
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = blockPos;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = vec3;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
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
        public final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll c() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }

        public final void a(@NotNull IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll) {
            Intrinsics.checkNotNullParameter((Object)((Object)iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll), (String)"<set-?>");
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
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
        public final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll f() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }

        @NotNull
        public final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(@NotNull BlockPos blockPos, @NotNull Vec3 vec3, @NotNull IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll) {
            Intrinsics.checkNotNullParameter((Object)blockPos, (String)"pos");
            Intrinsics.checkNotNullParameter((Object)vec3, (String)"topCenter");
            Intrinsics.checkNotNullParameter((Object)((Object)iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll), (String)"type");
            return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(blockPos, vec3, iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll);
        }

        public static /* synthetic */ llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, BlockPos blockPos, Vec3 vec3, IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll, int n, Object object) {
            int n2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j();
            int n3 = n & 1;
            if (n2 == 0) {
                if (n3 != 0) {
                    blockPos = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                }
                n3 = n & 2;
            }
            if (n2 == 0) {
                if (n3 != 0) {
                    vec3 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                }
                n3 = n & 4;
            }
            if (n3 != 0) {
                iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
            return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a(blockPos, vec3, iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll);
        }

        @NotNull
        public String toString() {
            IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            Vec3 vec3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            BlockPos blockPos = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            return "Node(pos=" + blockPos + ", topCenter=" + vec3 + ", type=" + iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll + ")";
        }

        public int hashCode() {
            int n = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            n = n * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
            n = n * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
            return n;
        }

        public boolean equals(@Nullable Object object) {
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2;
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll3;
            block10: {
                boolean bl;
                block9: {
                    int n = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j();
                    Object object2 = this;
                    if (n == 0) {
                        if (object2 == object) {
                            return true;
                        }
                        object2 = object;
                    }
                    if (n == 0) {
                        if (!(object2 instanceof llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)) {
                            return false;
                        }
                        object2 = object;
                    }
                    llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll3 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)object2;
                    bl = Intrinsics.areEqual((Object)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, (Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
                    if (n != 0) break block9;
                    if (!bl) {
                        return false;
                    }
                    llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2 = this;
                    if (n != 0) break block10;
                    bl = Intrinsics.areEqual((Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, (Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                }
                if (!bl) {
                    return false;
                }
                llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2 = this;
            }
            return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }

        /*
         * Unable to fully structure code
         */
        static {
            block20: {
                block19: {
                    var5 = new String[10];
                    var3_1 = 0;
                    var2_2 = "\u00c4\u007fT,\u0003[\u00f6 \t\u00bd\u00e7{\u00cde\u0085\u00edK\u00bf\fug5W=R@2?\u00c6\u009f=\t\u00b9\u0019\u00fb\u0012u~\u00ef4\u00ff\u0003\u00d0\u00e1Q\u0007a\u0018\u00b4\u009ac\u00ef&\u0007.\u00c8^\u00b4P\u00dc\u00b5";
                    var4_3 = "\u00c4\u007fT,\u0003[\u00f6 \t\u00bd\u00e7{\u00cde\u0085\u00edK\u00bf\fug5W=R@2?\u00c6\u009f=\t\u00b9\u0019\u00fb\u0012u~\u00ef4\u00ff\u0003\u00d0\u00e1Q\u0007a\u0018\u00b4\u009ac\u00ef&\u0007.\u00c8^\u00b4P\u00dc\u00b5".length();
                    var1_4 = 4;
                    var0_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 48;
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
                        var2_2 = "L\u00a9\u00e5V\t\u00e6\r\u00d9\u0016J\u00a2W\u00c4\u007f";
                        var4_3 = "L\u00a9\u00e5V\t\u00e6\r\u00d9\u0016J\u00a2W\u00c4\u007f".length();
                        var1_4 = 4;
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
                                v15 = 67;
                                break;
                            }
                            case 1: {
                                v15 = 117;
                                break;
                            }
                            case 2: {
                                v15 = 24;
                                break;
                            }
                            case 3: {
                                v15 = 104;
                                break;
                            }
                            case 4: {
                                v15 = 36;
                                break;
                            }
                            case 5: {
                                v15 = 66;
                                break;
                            }
                            default: {
                                v15 = 78;
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
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b = new String[10];
        }

        private static String a(int n, int n2) {
            int n3 = (n ^ 0xFFFF9438) & 0xFFFF;
            if (b[n3] == null) {
                int n4;
                char[] cArray = a[n3].toCharArray();
                int n5 = switch (cArray[0] & 0xFF) {
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

    public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
    extends Enum<IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> {
        public static /* enum */ IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        public static /* enum */ IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        public static /* enum */ IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        public static /* enum */ IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
        public static /* enum */ IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
        private static /* synthetic */ IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
        private static /* synthetic */ EnumEntries IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;

        public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] a() {
            return (IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.clone();
        }

        public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(String string) {
            return Enum.valueOf(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.class, string);
        }

        @NotNull
        public static EnumEntries<IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> b() {
            return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
        }

        private static final /* synthetic */ IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] c() {
            IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlllArray = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII};
            return iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlllArray;
        }

        /*
         * Unable to fully structure code
         */
        static {
            block20: {
                block19: {
                    var0 = new String[5];
                    var4_1 = 0;
                    var3_2 = "]\fF>\u0004V\u0016_+\u0004D\u000eB#";
                    var5_3 = "]\fF>\u0004V\u0016_+\u0004D\u000eB#".length();
                    var2_4 = 4;
                    var1_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 65;
                        v1 = ++var1_5;
                        v2 = var3_2.substring(v1, v1 + var2_4);
                        v3 = -1;
                        break block19;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var0[var4_1++] = v4.intern();
                        if ((var1_5 += var2_4) < var5_3) {
                            var2_4 = var3_2.charAt(var1_5);
                            ** continue;
                        }
                        var3_2 = "\rU\nh\t\u001f@\u000efB\u0005{\bD";
                        var5_3 = "\rU\nh\t\u001f@\u000efB\u0005{\bD".length();
                        var2_4 = 4;
                        var1_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 12;
                            v5 = ++var1_5;
                            v2 = var3_2.substring(v5, v5 + var2_4);
                            v3 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var0[var4_1++] = v4.intern();
                        if ((var1_5 += var2_4) < var5_3) {
                            var2_4 = var3_2.charAt(var1_5);
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
                                v15 = 86;
                                break;
                            }
                            case 1: {
                                v15 = 24;
                                break;
                            }
                            case 2: {
                                v15 = 74;
                                break;
                            }
                            case 3: {
                                v15 = 47;
                                break;
                            }
                            case 4: {
                                v15 = 28;
                                break;
                            }
                            case 5: {
                                v15 = 94;
                                break;
                            }
                            default: {
                                v15 = 54;
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
            IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
            IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
            IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
            IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
            IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
            IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.c();
            IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = EnumEntriesKt.enumEntries((Enum[])IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
        }
    }
}

