package me.octo.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI;
import me.octo.client.events.impl.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
import me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import java.util.Collection;
import net.minecraft.world.entity.Entity;
import me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
import me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import kotlin.collections.IntIterator;
import java.util.Iterator;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.particles.ParticleTypes;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;

public final class IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI {
   private boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private List<? extends BlockPos> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private List<? extends BlockPos> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @Nullable
   private BlockPos lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private Vec3 lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private ArrayList<BlockPos> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final ArrayList<BlockPos> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final ArrayList<BlockPos> IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private boolean llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private int IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private int IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @Nullable
   private BlockPos llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private boolean lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @NotNull
   private Vec3 IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private boolean lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private long lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private long IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   @Nullable
   private BlockPos IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   private boolean IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   private long lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   private float lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   private boolean lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   private long llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private long IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   private int llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private boolean lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private boolean IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private int lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   private int llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private long IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private ArrayList<Pair<BlockPos, lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI>> lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private static String[] a;
   private static String[] b;

   public IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI() {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = -19364;
      short var10004 = 9170;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var10001;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new ArrayList<>();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new ArrayList<>();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new ArrayList<>();
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = 300;
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      Vec3 var1 = Vec3.ZERO;
      var10003 = -19353;
      var10004 = 29693;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var1;
      this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = 150L;
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = 89.0F;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = 200L;
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = 150L;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = 1300L;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new ArrayList<>();
   }

   public final boolean a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final void a(boolean var1) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final boolean b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void b(boolean var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final boolean c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void c(boolean var1) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   public final int d() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void a(int var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   private final int e() {
      return 5;
   }

   @NotNull
   public final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI f() {
      IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = null; // PX-FIX: init（乱序赋值）
      IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10001 = null; // PX-FIX: init（乱序赋值）
      boolean var10002 = false; // PX-FIX: init（乱序赋值）
      boolean var10003 = false; // PX-FIX: init（乱序赋值）
      boolean var10004 = false; // PX-FIX: init（乱序赋值）
      IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10005 = null; // PX-FIX: init（乱序赋值）
      BlockPos var10006 = null; // PX-FIX: init（乱序赋值）
      boolean var10007 = false; // PX-FIX: init（乱序赋值）
      BlockPos var10008 = null; // PX-FIX: init（乱序赋值）
      label31: {
         try {
            var10000 = new IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var10002,
                        var10003,
                        var10004,
                        var10005,
                        var10006,
                        var10007,
                        var10008,
                        this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null
                           ? this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.b()
                           : null,
                        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
                        this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.size(),
                        (BlockPos)CollectionsKt.lastOrNull(this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl),
                        this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.size(),
                        (BlockPos)CollectionsKt.lastOrNull(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI),
                        this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.size(),
                        (BlockPos)CollectionsKt.lastOrNull(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl),
                        this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null
                           ? this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.size()
                           : null,
                        this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null
                           ? this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.size()
                           : null,
                        this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
                        this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll,
                        this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
                        this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII,
                        this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.size()); // PX-FIX
            var10001 = var10000;
            var10002 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var10003 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            var10004 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            var10005 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var10006 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            var10007 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
               var10008 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.a();
               break label31;
            }
         } catch (NoWhenBranchMatchedException var1) {
            throw (RuntimeException)a(var1);
         }

         var10008 = null;
      }

      return var10000;
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 0003: aload 1
      // 0004: sipush -19361
      // 0007: sipush 13609
      // 000a: pop2
      // 000b: ldc_w "event"
      // 000e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 0011: astore 2
      // 0012: aload 0
      // 0013: aload 2
      // 0014: ifnull 002a
      // 0017: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 001a: ifne 0029
      // 001d: goto 0024
      // 0020: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0023: athrow
      // 0024: return
      // 0025: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0028: athrow
      // 0029: aload 0
      // 002a: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 002d: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 0030: dup
      // 0031: ifnonnull 003a
      // 0034: pop
      // 0035: return
      // 0036: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0039: athrow
      // 003a: astore 3
      // 003b: aload 2
      // 003c: ifnull 0059
      // 003f: aload 0
      // 0040: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 0043: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 0046: dup
      // 0047: ifnonnull 005a
      // 004a: goto 0051
      // 004d: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0050: athrow
      // 0051: pop
      // 0052: goto 0059
      // 0055: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0058: athrow
      // 0059: return
      // 005a: astore 4
      // 005c: aload 2
      // 005d: ifnull 00ba
      // 0060: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n ()Z
      // 0063: ifne 008c
      // 0066: goto 006d
      // 0069: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 006c: athrow
      // 006d: aload 0
      // 006e: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 0071: getfield net/minecraft/client/Minecraft.screen Lnet/minecraft/client/gui/screens/Screen;
      // 0074: instanceof net/minecraft/client/gui/screens/ChatScreen
      // 0077: aload 2
      // 0078: ifnull 00c7
      // 007b: goto 0082
      // 007e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0081: athrow
      // 0082: ifeq 00bb
      // 0085: goto 008c
      // 0088: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 008b: athrow
      // 008c: aload 0
      // 008d: bipush 1
      // 008e: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI Z
      // 0091: aload 0
      // 0092: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0095: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0098: aload 0
      // 0099: aload 0
      // 009a: ldc2_w 200
      // 009d: ldc2_w 80
      // 00a0: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (JJ)J
      // 00a3: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll J
      // 00a6: aload 0
      // 00a7: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 00aa: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 00ad: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 00b0: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.t ()V
      // 00b3: goto 00ba
      // 00b6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 00b9: athrow
      // 00ba: return
      // 00bb: aload 0
      // 00bc: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 00bf: getstatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 00c2: swap
      // 00c3: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.ordinal ()I
      // 00c6: iaload
      // 00c7: aload 2
      // 00c8: ifnull 00f3
      // 00cb: tableswitch 5738 1 3 29 2885 4743
      // 00e4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 00e7: athrow
      // 00e8: aload 0
      // 00e9: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl Z
      // 00ec: goto 00f3
      // 00ef: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 00f2: athrow
      // 00f3: aload 2
      // 00f4: ifnull 020b
      // 00f7: ifeq 0207
      // 00fa: goto 0101
      // 00fd: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0100: athrow
      // 0101: aload 0
      // 0102: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI I
      // 0105: aload 2
      // 0106: ifnull 0149
      // 0109: goto 0110
      // 010c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 010f: athrow
      // 0110: bipush 1
      // 0111: if_icmple 0138
      // 0114: goto 011b
      // 0117: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 011a: athrow
      // 011b: aload 0
      // 011c: bipush 0
      // 011d: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI I
      // 0120: getstatic me/octo/client/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0123: invokevirtual me/octo/client/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
      // 0126: sipush -19360
      // 0129: sipush 15056
      // 012c: pop2
      // 012d: ldc_w "DETECTED UNBREAKABLE BLOCKS"
      // 0130: invokevirtual me/octo/client/IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.f (Ljava/lang/String;)V
      // 0133: return
      // 0134: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0137: athrow
      // 0138: aload 0
      // 0139: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 013c: aload 0
      // 013d: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII J
      // 0140: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0143: checkcast java/lang/Number
      // 0146: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0149: aload 2
      // 014a: ifnull 0162
      // 014d: ifeq 0206
      // 0150: goto 0157
      // 0153: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0156: athrow
      // 0157: aload 0
      // 0158: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI Z
      // 015b: goto 0162
      // 015e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0161: athrow
      // 0162: aload 2
      // 0163: ifnull 01bc
      // 0166: ifne 01a6
      // 0169: goto 0170
      // 016c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 016f: athrow
      // 0170: aload 0
      // 0171: bipush 1
      // 0172: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI Z
      // 0175: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0178: sipush -19337
      // 017b: sipush -8685
      // 017e: pop2
      // 017f: ldc_w "attack"
      // 0182: bipush 0
      // 0183: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 0186: aload 0
      // 0187: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 018a: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 018d: aload 0
      // 018e: aload 0
      // 018f: ldc2_w 110
      // 0192: ldc2_w 50
      // 0195: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (JJ)J
      // 0198: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII J
      // 019b: aload 2
      // 019c: ifnonnull 0206
      // 019f: goto 01a6
      // 01a2: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01a5: athrow
      // 01a6: aload 0
      // 01a7: aload 2
      // 01a8: ifnull 01f1
      // 01ab: goto 01b2
      // 01ae: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01b1: athrow
      // 01b2: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII I
      // 01b5: goto 01bc
      // 01b8: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01bb: athrow
      // 01bc: ifle 01e9
      // 01bf: invokestatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.l ()V
      // 01c2: aload 0
      // 01c3: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII I
      // 01c6: istore 5
      // 01c8: aload 0
      // 01c9: iload 5
      // 01cb: bipush -1
      // 01cc: iadd
      // 01cd: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII I
      // 01d0: aload 0
      // 01d1: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 01d4: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 01d7: aload 0
      // 01d8: aload 0
      // 01d9: ldc2_w 110
      // 01dc: ldc2_w 50
      // 01df: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (JJ)J
      // 01e2: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII J
      // 01e5: aload 2
      // 01e6: ifnonnull 0206
      // 01e9: aload 0
      // 01ea: goto 01f1
      // 01ed: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01f0: athrow
      // 01f1: bipush 0
      // 01f2: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl Z
      // 01f5: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 01f8: sipush -19365
      // 01fb: sipush 1962
      // 01fe: pop2
      // 01ff: ldc_w "attack"
      // 0202: bipush 1
      // 0203: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 0206: return
      // 0207: aload 0
      // 0208: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI I
      // 020b: aload 2
      // 020c: ifnull 024e
      // 020f: ifle 024a
      // 0212: goto 0219
      // 0215: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0218: athrow
      // 0219: aload 0
      // 021a: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 021d: sipush 3500
      // 0220: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0223: checkcast java/lang/Number
      // 0226: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0229: aload 2
      // 022a: ifnull 024e
      // 022d: goto 0234
      // 0230: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0233: athrow
      // 0234: ifeq 024a
      // 0237: goto 023e
      // 023a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 023d: athrow
      // 023e: aload 0
      // 023f: bipush 0
      // 0240: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI I
      // 0243: goto 024a
      // 0246: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0249: athrow
      // 024a: aload 0
      // 024b: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI Z
      // 024e: aload 2
      // 024f: ifnull 027f
      // 0252: ifeq 02bf
      // 0255: goto 025c
      // 0258: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 025b: athrow
      // 025c: aload 0
      // 025d: aload 2
      // 025e: ifnull 029e
      // 0261: goto 0268
      // 0264: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0267: athrow
      // 0268: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 026b: aload 0
      // 026c: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll J
      // 026f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0272: checkcast java/lang/Number
      // 0275: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0278: goto 027f
      // 027b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 027e: athrow
      // 027f: ifeq 02a6
      // 0282: invokestatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.l ()V
      // 0285: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0288: sipush -19365
      // 028b: sipush 1962
      // 028e: pop2
      // 028f: ldc_w "attack"
      // 0292: bipush 1
      // 0293: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 0296: aload 0
      // 0297: goto 029e
      // 029a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 029d: athrow
      // 029e: bipush 0
      // 029f: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI Z
      // 02a2: aload 2
      // 02a3: ifnonnull 02be
      // 02a6: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 02a9: sipush -19365
      // 02ac: sipush 1962
      // 02af: pop2
      // 02b0: ldc_w "attack"
      // 02b3: bipush 0
      // 02b4: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 02b7: goto 02be
      // 02ba: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02bd: athrow
      // 02be: return
      // 02bf: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 02c2: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.I ()Lnet/minecraft/world/phys/BlockHitResult;
      // 02c5: dup
      // 02c6: ifnull 02d3
      // 02c9: invokevirtual net/minecraft/world/phys/BlockHitResult.getBlockPos ()Lnet/minecraft/core/BlockPos;
      // 02cc: goto 02d5
      // 02cf: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02d2: athrow
      // 02d3: pop
      // 02d4: aconst_null
      // 02d5: astore 5
      // 02d7: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 02da: sipush -19365
      // 02dd: sipush 1962
      // 02e0: pop2
      // 02e1: ldc_w "attack"
      // 02e4: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;)Z
      // 02e7: aload 2
      // 02e8: ifnull 03de
      // 02eb: ifeq 03dd
      // 02ee: goto 02f5
      // 02f1: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02f4: athrow
      // 02f5: aload 5
      // 02f7: ifnull 03dd
      // 02fa: goto 0301
      // 02fd: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0300: athrow
      // 0301: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 0304: aload 4
      // 0306: aload 5
      // 0308: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 030b: dup
      // 030c: sipush -19362
      // 030f: sipush -23441
      // 0312: pop2
      // 0313: ldc_w "getBlockState(...)"
      // 0316: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0319: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.o (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 031c: aload 2
      // 031d: ifnull 03de
      // 0320: goto 0327
      // 0323: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0326: athrow
      // 0327: ifeq 03dd
      // 032a: goto 0331
      // 032d: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0330: athrow
      // 0331: aload 0
      // 0332: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Ljava/util/ArrayList;
      // 0335: checkcast java/lang/Iterable
      // 0338: astore 6
      // 033a: bipush 0
      // 033b: istore 7
      // 033d: aload 6
      // 033f: aload 2
      // 0340: ifnull 0379
      // 0343: instanceof java/util/Collection
      // 0346: ifeq 0377
      // 0349: goto 0350
      // 034c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 034f: athrow
      // 0350: aload 6
      // 0352: checkcast java/util/Collection
      // 0355: aload 2
      // 0356: ifnull 0379
      // 0359: goto 0360
      // 035c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 035f: athrow
      // 0360: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0365: ifeq 0377
      // 0368: goto 036f
      // 036b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 036e: athrow
      // 036f: bipush 1
      // 0370: goto 03bf
      // 0373: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0376: athrow
      // 0377: aload 6
      // 0379: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 037e: astore 8
      // 0380: aload 8
      // 0382: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0387: ifeq 03be
      // 038a: aload 8
      // 038c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0391: astore 9
      // 0393: aload 9
      // 0395: checkcast kotlin/Pair
      // 0398: astore 10
      // 039a: bipush 0
      // 039b: istore 11
      // 039d: aload 10
      // 039f: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 03a2: aload 5
      // 03a4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 03a7: aload 2
      // 03a8: ifnull 03af
      // 03ab: ifne 03b2
      // 03ae: bipush 1
      // 03af: goto 03b3
      // 03b2: bipush 0
      // 03b3: ifne 0380
      // 03b6: bipush 0
      // 03b7: aload 2
      // 03b8: ifnull 03a7
      // 03bb: goto 03bf
      // 03be: bipush 1
      // 03bf: ifeq 03dd
      // 03c2: aload 0
      // 03c3: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Ljava/util/ArrayList;
      // 03c6: aload 5
      // 03c8: new me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI
      // 03cb: dup
      // 03cc: invokespecial me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.<init> ()V
      // 03cf: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 03d2: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 03d5: pop
      // 03d6: goto 03dd
      // 03d9: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03dc: athrow
      // 03dd: bipush 0
      // 03de: istore 6
      // 03e0: new java/util/ArrayList
      // 03e3: dup
      // 03e4: invokespecial java/util/ArrayList.<init> ()V
      // 03e7: astore 7
      // 03e9: aload 0
      // 03ea: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Ljava/util/ArrayList;
      // 03ed: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 03f0: dup
      // 03f1: sipush -19339
      // 03f4: sipush 19425
      // 03f7: pop2
      // 03f8: ldc_w "iterator(...)"
      // 03fb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 03fe: astore 8
      // 0400: aload 8
      // 0402: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0407: ifeq 04d4
      // 040a: aload 8
      // 040c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0411: dup
      // 0412: sipush -19350
      // 0415: sipush 876
      // 0418: pop2
      // 0419: ldc_w "next(...)"
      // 041c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 041f: checkcast kotlin/Pair
      // 0422: astore 9
      // 0424: aload 9
      // 0426: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 0429: checkcast net/minecraft/core/BlockPos
      // 042c: astore 10
      // 042e: aload 9
      // 0430: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 0433: checkcast me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI
      // 0436: astore 11
      // 0438: aload 2
      // 0439: ifnull 04da
      // 043c: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 043f: aload 10
      // 0441: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 0444: dup
      // 0445: sipush -19336
      // 0448: sipush 16875
      // 044b: pop2
      // 044c: ldc_w "getCenter(...)"
      // 044f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0452: bipush 1
      // 0453: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 0456: ldc2_w 6.0
      // 0459: dcmpl
      // 045a: aload 2
      // 045b: ifnull 0480
      // 045e: goto 0465
      // 0461: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0464: athrow
      // 0465: ifgt 048e
      // 0468: goto 046f
      // 046b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 046e: athrow
      // 046f: aload 4
      // 0471: aload 10
      // 0473: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0476: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 0479: goto 0480
      // 047c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 047f: athrow
      // 0480: aload 2
      // 0481: ifnull 04a7
      // 0484: ifeq 0499
      // 0487: goto 048e
      // 048a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 048d: athrow
      // 048e: aload 2
      // 048f: ifnonnull 0400
      // 0492: goto 0499
      // 0495: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0498: athrow
      // 0499: aload 11
      // 049b: sipush 1000
      // 049e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 04a1: checkcast java/lang/Number
      // 04a4: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 04a7: aload 2
      // 04a8: ifnull 04cf
      // 04ab: ifeq 04c1
      // 04ae: goto 04b5
      // 04b1: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04b4: athrow
      // 04b5: aload 7
      // 04b7: invokevirtual java/util/ArrayList.clear ()V
      // 04ba: bipush 1
      // 04bb: istore 6
      // 04bd: aload 2
      // 04be: ifnonnull 04d4
      // 04c1: aload 7
      // 04c3: aload 9
      // 04c5: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 04c8: goto 04cf
      // 04cb: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04ce: athrow
      // 04cf: pop
      // 04d0: aload 2
      // 04d1: ifnonnull 0400
      // 04d4: aload 0
      // 04d5: aload 7
      // 04d7: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Ljava/util/ArrayList;
      // 04da: aload 0
      // 04db: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lnet/minecraft/core/BlockPos;
      // 04de: astore 8
      // 04e0: aload 8
      // 04e2: ifnull 050f
      // 04e5: aload 0
      // 04e6: aload 8
      // 04e8: bipush 0
      // 04e9: bipush 2
      // 04ea: aconst_null
      // 04eb: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI;Lnet/minecraft/core/BlockPos;ZILjava/lang/Object;)Z
      // 04ee: aload 2
      // 04ef: ifnull 0524
      // 04f2: goto 04f9
      // 04f5: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04f8: athrow
      // 04f9: ifeq 050f
      // 04fc: goto 0503
      // 04ff: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0502: athrow
      // 0503: aload 0
      // 0504: aconst_null
      // 0505: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lnet/minecraft/core/BlockPos;
      // 0508: goto 050f
      // 050b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 050e: athrow
      // 050f: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0512: aload 0
      // 0513: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI Lnet/minecraft/world/phys/Vec3;
      // 0516: aload 3
      // 0517: checkcast net/minecraft/world/entity/Entity
      // 051a: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 051d: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 0520: ldc2_w 0.5
      // 0523: dcmpl
      // 0524: ifle 0540
      // 0527: aload 0
      // 0528: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 052b: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 052e: aload 0
      // 052f: aload 3
      // 0530: checkcast net/minecraft/world/entity/Entity
      // 0533: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 0536: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI Lnet/minecraft/world/phys/Vec3;
      // 0539: goto 0540
      // 053c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 053f: athrow
      // 0540: aload 0
      // 0541: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lnet/minecraft/core/BlockPos;
      // 0544: aload 2
      // 0545: ifnull 05a9
      // 0548: ifnull 0594
      // 054b: goto 0552
      // 054e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0551: athrow
      // 0552: aload 0
      // 0553: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0556: aload 0
      // 0557: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Z
      // 055a: aload 2
      // 055b: ifnull 0572
      // 055e: goto 0565
      // 0561: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0564: athrow
      // 0565: ifeq 0575
      // 0568: goto 056f
      // 056b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 056e: athrow
      // 056f: sipush 1500
      // 0572: goto 0578
      // 0575: sipush 3000
      // 0578: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 057b: checkcast java/lang/Number
      // 057e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0581: aload 2
      // 0582: ifnull 0591
      // 0585: ifne 0594
      // 0588: goto 058f
      // 058b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 058e: athrow
      // 058f: iload 6
      // 0591: ifeq 05ab
      // 0594: aload 0
      // 0595: aload 0
      // 0596: iload 6
      // 0598: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.d (Z)Lnet/minecraft/core/BlockPos;
      // 059b: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lnet/minecraft/core/BlockPos;
      // 059e: aload 0
      // 059f: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lnet/minecraft/core/BlockPos;
      // 05a2: goto 05a9
      // 05a5: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 05a8: athrow
      // 05a9: astore 8
      // 05ab: aload 8
      // 05ad: ifnull 09e0
      // 05b0: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 05b3: aload 8
      // 05b5: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 05b8: astore 9
      // 05ba: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 05bd: aload 9
      // 05bf: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 05c2: astore 10
      // 05c4: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 05c7: getstatic me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
      // 05ca: invokevirtual me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.h ()F
      // 05cd: aload 10
      // 05cf: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 05d2: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (FF)F
      // 05d5: fstore 11
      // 05d7: aload 0
      // 05d8: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 05db: sipush 500
      // 05de: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05e1: checkcast java/lang/Number
      // 05e4: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 05e7: istore 12
      // 05e9: aload 0
      // 05ea: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 05ed: sipush 500
      // 05f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05f3: checkcast java/lang/Number
      // 05f6: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 05f9: istore 13
      // 05fb: aload 0
      // 05fc: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 05ff: sipush 1500
      // 0602: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0605: checkcast java/lang/Number
      // 0608: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 060b: istore 14
      // 060d: getstatic me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
      // 0610: invokevirtual me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.g ()Z
      // 0613: aload 2
      // 0614: ifnull 0631
      // 0617: ifeq 0664
      // 061a: goto 0621
      // 061d: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0620: athrow
      // 0621: fload 11
      // 0623: invokestatic java/lang/Math.abs (F)F
      // 0626: ldc_w 5.0
      // 0629: fcmpl
      // 062a: goto 0631
      // 062d: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0630: athrow
      // 0631: aload 2
      // 0632: ifnull 0641
      // 0635: ifgt 0664
      // 0638: goto 063f
      // 063b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 063e: athrow
      // 063f: iload 13
      // 0641: aload 2
      // 0642: ifnull 0651
      // 0645: ifne 0664
      // 0648: goto 064f
      // 064b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 064e: athrow
      // 064f: iload 12
      // 0651: aload 2
      // 0652: ifnull 0661
      // 0655: ifne 0664
      // 0658: goto 065f
      // 065b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 065e: athrow
      // 065f: iload 14
      // 0661: ifeq 072f
      // 0664: aload 0
      // 0665: aload 8
      // 0667: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.b (Lnet/minecraft/core/BlockPos;)Ljava/lang/Float;
      // 066a: dup
      // 066b: ifnull 067f
      // 066e: goto 0675
      // 0671: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0674: athrow
      // 0675: invokevirtual java/lang/Float.floatValue ()F
      // 0678: goto 0690
      // 067b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 067e: athrow
      // 067f: pop
      // 0680: iload 12
      // 0682: ifeq 068f
      // 0685: ldc_w 6.0
      // 0688: goto 0690
      // 068b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 068e: athrow
      // 068f: fconst_0
      // 0690: fstore 16
      // 0692: ldc_w 9.0
      // 0695: fstore 17
      // 0697: fload 16
      // 0699: fload 17
      // 069b: invokestatic java/lang/Math.min (FF)F
      // 069e: fstore 16
      // 06a0: ldc_w -15.0
      // 06a3: fstore 17
      // 06a5: fload 16
      // 06a7: fload 17
      // 06a9: invokestatic java/lang/Math.max (FF)F
      // 06ac: fstore 15
      // 06ae: getstatic me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
      // 06b1: aload 10
      // 06b3: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 06b6: fload 15
      // 06b8: ldc_w 40.0
      // 06bb: fload 15
      // 06bd: aload 2
      // 06be: ifnull 06d7
      // 06c1: fconst_0
      // 06c2: fcmpl
      // 06c3: iflt 06da
      // 06c6: goto 06cd
      // 06c9: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06cc: athrow
      // 06cd: ldc_w 5.0
      // 06d0: goto 06d7
      // 06d3: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06d6: athrow
      // 06d7: goto 06dd
      // 06da: ldc_w 15.0
      // 06dd: invokevirtual me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.a (FFFF)V
      // 06e0: iload 12
      // 06e2: aload 2
      // 06e3: ifnull 0700
      // 06e6: ifeq 06fe
      // 06e9: goto 06f0
      // 06ec: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06ef: athrow
      // 06f0: aload 0
      // 06f1: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 06f4: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 06f7: goto 06fe
      // 06fa: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06fd: athrow
      // 06fe: iload 13
      // 0700: aload 2
      // 0701: ifnull 071e
      // 0704: ifeq 071c
      // 0707: goto 070e
      // 070a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 070d: athrow
      // 070e: aload 0
      // 070f: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0712: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0715: goto 071c
      // 0718: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 071b: athrow
      // 071c: iload 14
      // 071e: ifeq 072f
      // 0721: aload 0
      // 0722: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0725: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0728: goto 072f
      // 072b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 072e: athrow
      // 072f: aload 3
      // 0730: checkcast net/minecraft/world/entity/Entity
      // 0733: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 0736: astore 15
      // 0738: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 073b: aload 15
      // 073d: aload 9
      // 073f: aconst_null
      // 0740: bipush 0
      // 0741: bipush 30
      // 0743: bipush 0
      // 0744: bipush 0
      // 0745: bipush 108
      // 0747: aconst_null
      // 0748: invokestatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.b (Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IIZZILjava/lang/Object;)Ljava/util/ArrayList;
      // 074b: astore 16
      // 074d: aload 16
      // 074f: aload 2
      // 0750: ifnull 078c
      // 0753: ifnull 0785
      // 0756: goto 075d
      // 0759: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 075c: athrow
      // 075d: aload 0
      // 075e: aload 16
      // 0760: bipush 5
      // 0761: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Ljava/util/ArrayList;I)Z
      // 0764: aload 2
      // 0765: ifnull 0791
      // 0768: goto 076f
      // 076b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 076e: athrow
      // 076f: ifeq 0785
      // 0772: goto 0779
      // 0775: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0778: athrow
      // 0779: aload 0
      // 077a: aconst_null
      // 077b: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lnet/minecraft/core/BlockPos;
      // 077e: goto 0785
      // 0781: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0784: athrow
      // 0785: aload 0
      // 0786: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Ljava/util/ArrayList;
      // 0789: checkcast java/util/Collection
      // 078c: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0791: aload 2
      // 0792: ifnull 07a0
      // 0795: ifne 07a3
      // 0798: goto 079f
      // 079b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 079e: athrow
      // 079f: bipush 1
      // 07a0: goto 07a4
      // 07a3: bipush 0
      // 07a4: ifeq 07ba
      // 07a7: aload 0
      // 07a8: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Ljava/util/ArrayList;
      // 07ab: invokevirtual java/util/ArrayList.clear ()V
      // 07ae: aload 0
      // 07af: aconst_null
      // 07b0: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lnet/minecraft/core/BlockPos;
      // 07b3: goto 07ba
      // 07b6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 07b9: athrow
      // 07ba: aload 16
      // 07bc: aload 2
      // 07bd: ifnull 07d8
      // 07c0: dup
      // 07c1: ifnull 07de
      // 07c4: goto 07cb
      // 07c7: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 07ca: athrow
      // 07cb: checkcast java/util/List
      // 07ce: invokestatic kotlin/collections/CollectionsKt.last (Ljava/util/List;)Ljava/lang/Object;
      // 07d1: goto 07d8
      // 07d4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 07d7: athrow
      // 07d8: checkcast net/minecraft/world/phys/Vec3
      // 07db: goto 07e0
      // 07de: pop
      // 07df: aconst_null
      // 07e0: astore 17
      // 07e2: aload 2
      // 07e3: ifnull 086d
      // 07e6: aload 17
      // 07e8: ifnull 085f
      // 07eb: goto 07f2
      // 07ee: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 07f1: athrow
      // 07f2: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 07f5: aload 15
      // 07f7: aload 17
      // 07f9: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 07fc: ldc2_w 2.7
      // 07ff: dcmpg
      // 0800: aload 2
      // 0801: ifnull 0840
      // 0804: goto 080b
      // 0807: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 080a: athrow
      // 080b: ifge 085f
      // 080e: goto 0815
      // 0811: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0814: athrow
      // 0815: aload 0
      // 0816: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0819: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 081c: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 081f: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 0822: aload 2
      // 0823: ifnull 085b
      // 0826: goto 082d
      // 0829: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 082c: athrow
      // 082d: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0830: aload 15
      // 0832: aload 17
      // 0834: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 0837: dconst_1
      // 0838: dcmpg
      // 0839: goto 0840
      // 083c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 083f: athrow
      // 0840: ifge 087c
      // 0843: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0846: sipush -19335
      // 0849: sipush 24173
      // 084c: pop2
      // 084d: ldc_w "backward"
      // 0850: bipush 1
      // 0851: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 0854: goto 085b
      // 0857: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 085a: athrow
      // 085b: aload 2
      // 085c: ifnonnull 087c
      // 085f: aload 0
      // 0860: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0863: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0866: goto 086d
      // 0869: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 086c: athrow
      // 086d: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0870: aload 15
      // 0872: aload 9
      // 0874: bipush 0
      // 0875: dconst_0
      // 0876: bipush 12
      // 0878: aconst_null
      // 0879: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZDILjava/lang/Object;)V
      // 087c: aload 3
      // 087d: getstatic net/minecraft/world/entity/ai/attributes/Attributes.MOVEMENT_SPEED Lnet/minecraft/core/Holder;
      // 0880: invokevirtual net/minecraft/client/player/LocalPlayer.getAttribute (Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;
      // 0883: astore 18
      // 0885: aload 2
      // 0886: ifnull 08a1
      // 0889: aload 18
      // 088b: dup
      // 088c: ifnull 08a0
      // 088f: goto 0896
      // 0892: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0895: athrow
      // 0896: invokevirtual net/minecraft/world/entity/ai/attributes/AttributeInstance.getValue ()D
      // 0899: goto 08a4
      // 089c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 089f: athrow
      // 08a0: pop
      // 08a1: ldc2_w 0.4
      // 08a4: dstore 20
      // 08a6: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 08a9: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.P ()Z
      // 08ac: aload 2
      // 08ad: ifnull 08c7
      // 08b0: ifne 08d9
      // 08b3: goto 08ba
      // 08b6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08b9: athrow
      // 08ba: dload 20
      // 08bc: ldc2_w 0.15
      // 08bf: dcmpl
      // 08c0: goto 08c7
      // 08c3: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08c6: athrow
      // 08c7: aload 2
      // 08c8: ifnull 08d6
      // 08cb: iflt 08d9
      // 08ce: goto 08d5
      // 08d1: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08d4: athrow
      // 08d5: bipush 1
      // 08d6: goto 08da
      // 08d9: bipush 0
      // 08da: istore 23
      // 08dc: iload 23
      // 08de: aload 2
      // 08df: ifnull 090d
      // 08e2: aload 0
      // 08e3: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Z
      // 08e6: if_icmpeq 090b
      // 08e9: goto 08f0
      // 08ec: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08ef: athrow
      // 08f0: aload 0
      // 08f1: iload 23
      // 08f3: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Z
      // 08f6: aload 0
      // 08f7: aload 0
      // 08f8: ldc2_w 150
      // 08fb: ldc2_w 95
      // 08fe: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (JJ)J
      // 0901: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI J
      // 0904: goto 090b
      // 0907: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 090a: athrow
      // 090b: iload 23
      // 090d: istore 24
      // 090f: iload 23
      // 0911: aload 2
      // 0912: ifnull 0949
      // 0915: ifne 0931
      // 0918: goto 091f
      // 091b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 091e: athrow
      // 091f: aload 0
      // 0920: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0923: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0926: aload 2
      // 0927: ifnonnull 095a
      // 092a: goto 0931
      // 092d: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0930: athrow
      // 0931: aload 0
      // 0932: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0935: aload 0
      // 0936: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI J
      // 0939: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 093c: checkcast java/lang/Number
      // 093f: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0942: goto 0949
      // 0945: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0948: athrow
      // 0949: aload 2
      // 094a: ifnull 095c
      // 094d: ifne 095a
      // 0950: goto 0957
      // 0953: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0956: athrow
      // 0957: bipush 0
      // 0958: istore 24
      // 095a: iload 24
      // 095c: aload 2
      // 095d: ifnull 0994
      // 0960: ifeq 097c
      // 0963: goto 096a
      // 0966: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0969: athrow
      // 096a: aload 0
      // 096b: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 096e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0971: aload 2
      // 0972: ifnonnull 09a5
      // 0975: goto 097c
      // 0978: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 097b: athrow
      // 097c: aload 0
      // 097d: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0980: aload 0
      // 0981: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI J
      // 0984: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0987: checkcast java/lang/Number
      // 098a: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 098d: goto 0994
      // 0990: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0993: athrow
      // 0994: aload 2
      // 0995: ifnull 09a3
      // 0998: ifne 09a5
      // 099b: goto 09a2
      // 099e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09a1: athrow
      // 09a2: bipush 1
      // 09a3: istore 24
      // 09a5: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 09a8: sipush -19366
      // 09ab: sipush -11470
      // 09ae: pop2
      // 09af: ldc_w "sneak"
      // 09b2: iload 24
      // 09b4: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 09b7: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 09ba: sipush -19342
      // 09bd: sipush -30864
      // 09c0: pop2
      // 09c1: ldc_w "sprint"
      // 09c4: dload 20
      // 09c6: ldc2_w 0.15
      // 09c9: dcmpg
      // 09ca: aload 2
      // 09cb: ifnull 09d9
      // 09ce: ifge 09dc
      // 09d1: goto 09d8
      // 09d4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09d7: athrow
      // 09d8: bipush 1
      // 09d9: goto 09dd
      // 09dc: bipush 0
      // 09dd: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 09e0: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 09e3: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.p ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 09e6: dup
      // 09e7: ifnull 0a24
      // 09ea: astore 11
      // 09ec: bipush 0
      // 09ed: istore 12
      // 09ef: aload 2
      // 09f0: ifnull 0a1e
      // 09f3: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 09f6: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 09f9: aload 11
      // 09fb: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 09fe: if_icmpeq 0a19
      // 0a01: goto 0a08
      // 0a04: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a07: athrow
      // 0a08: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0a0b: aload 11
      // 0a0d: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0a10: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 0a13: pop
      // 0a14: return
      // 0a15: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a18: athrow
      // 0a19: nop
      // 0a1a: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0a1d: pop
      // 0a1e: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0a21: goto 0a26
      // 0a24: pop
      // 0a25: aconst_null
      // 0a26: pop
      // 0a27: aload 0
      // 0a28: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.m ()Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0a2b: astore 9
      // 0a2d: aload 2
      // 0a2e: ifnull 0adb
      // 0a31: aload 9
      // 0a33: ifnull 0acf
      // 0a36: goto 0a3d
      // 0a39: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a3c: athrow
      // 0a3d: aload 0
      // 0a3e: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lnet/minecraft/core/BlockPos;
      // 0a41: aload 9
      // 0a43: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/core/BlockPos;
      // 0a46: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0a49: aload 2
      // 0a4a: ifnull 0a9f
      // 0a4d: goto 0a54
      // 0a50: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a53: athrow
      // 0a54: ifne 0a83
      // 0a57: goto 0a5e
      // 0a5a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a5d: athrow
      // 0a5e: aload 0
      // 0a5f: aload 9
      // 0a61: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/core/BlockPos;
      // 0a64: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lnet/minecraft/core/BlockPos;
      // 0a67: aload 0
      // 0a68: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0a6b: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0a6e: aload 0
      // 0a6f: aload 0
      // 0a70: ldc2_w 60
      // 0a73: ldc2_w 40
      // 0a76: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (JJ)J
      // 0a79: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI J
      // 0a7c: goto 0a83
      // 0a7f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a82: athrow
      // 0a83: aload 0
      // 0a84: aload 2
      // 0a85: ifnull 0ac6
      // 0a88: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0a8b: aload 0
      // 0a8c: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI J
      // 0a8f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a92: checkcast java/lang/Number
      // 0a95: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0a98: goto 0a9f
      // 0a9b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a9e: athrow
      // 0a9f: ifeq 0c0a
      // 0aa2: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0aa5: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 0aa8: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0aab: sipush -19365
      // 0aae: sipush 1962
      // 0ab1: pop2
      // 0ab2: ldc_w "attack"
      // 0ab5: bipush 0
      // 0ab6: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 0ab9: aload 0
      // 0aba: aconst_null
      // 0abb: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lnet/minecraft/core/BlockPos;
      // 0abe: aload 0
      // 0abf: goto 0ac6
      // 0ac2: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ac5: athrow
      // 0ac6: aload 9
      // 0ac8: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)V
      // 0acb: aload 2
      // 0acc: ifnonnull 0c0a
      // 0acf: aload 0
      // 0ad0: aconst_null
      // 0ad1: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lnet/minecraft/core/BlockPos;
      // 0ad4: goto 0adb
      // 0ad7: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ada: athrow
      // 0adb: aload 2
      // 0adc: ifnull 0afb
      // 0adf: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0ae2: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.I ()Lnet/minecraft/world/phys/BlockHitResult;
      // 0ae5: dup
      // 0ae6: ifnull 0afa
      // 0ae9: goto 0af0
      // 0aec: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0aef: athrow
      // 0af0: invokevirtual net/minecraft/world/phys/BlockHitResult.getBlockPos ()Lnet/minecraft/core/BlockPos;
      // 0af3: goto 0afc
      // 0af6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0af9: athrow
      // 0afa: pop
      // 0afb: aconst_null
      // 0afc: astore 10
      // 0afe: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0b01: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.s ()Lnet/minecraft/core/BlockPos;
      // 0b04: astore 11
      // 0b06: aload 10
      // 0b08: aload 2
      // 0b09: ifnull 0b18
      // 0b0c: ifnull 0b2e
      // 0b0f: goto 0b16
      // 0b12: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b15: athrow
      // 0b16: aload 10
      // 0b18: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 0b1b: aload 2
      // 0b1c: ifnull 0b36
      // 0b1f: aload 11
      // 0b21: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 0b24: if_icmpeq 0b39
      // 0b27: goto 0b2e
      // 0b2a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b2d: athrow
      // 0b2e: bipush 1
      // 0b2f: goto 0b36
      // 0b32: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b35: athrow
      // 0b36: goto 0b3a
      // 0b39: bipush 0
      // 0b3a: istore 12
      // 0b3c: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0b3f: sipush -19365
      // 0b42: sipush 1962
      // 0b45: pop2
      // 0b46: ldc_w "attack"
      // 0b49: iload 12
      // 0b4b: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 0b4e: aload 10
      // 0b50: aload 2
      // 0b51: ifnull 0b60
      // 0b54: ifnull 0bbb
      // 0b57: goto 0b5e
      // 0b5a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b5d: athrow
      // 0b5e: aload 10
      // 0b60: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 0b63: aload 2
      // 0b64: ifnull 0b87
      // 0b67: aload 11
      // 0b69: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 0b6c: if_icmpeq 0bbb
      // 0b6f: goto 0b76
      // 0b72: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b75: athrow
      // 0b76: aload 4
      // 0b78: aload 10
      // 0b7a: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0b7d: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 0b80: goto 0b87
      // 0b83: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b86: athrow
      // 0b87: aload 2
      // 0b88: ifnull 0ba9
      // 0b8b: ifne 0bbb
      // 0b8e: goto 0b95
      // 0b91: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b94: athrow
      // 0b95: aload 4
      // 0b97: aload 10
      // 0b99: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0b9c: getstatic net/minecraft/world/level/block/Blocks.BEDROCK Lnet/minecraft/world/level/block/Block;
      // 0b9f: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 0ba2: goto 0ba9
      // 0ba5: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ba8: athrow
      // 0ba9: aload 2
      // 0baa: ifnull 0bb8
      // 0bad: ifne 0bbb
      // 0bb0: goto 0bb7
      // 0bb3: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bb6: athrow
      // 0bb7: bipush 1
      // 0bb8: goto 0bbc
      // 0bbb: bipush 0
      // 0bbc: istore 13
      // 0bbe: iload 13
      // 0bc0: aload 2
      // 0bc1: ifnull 0bf1
      // 0bc4: ifeq 0bfc
      // 0bc7: goto 0bce
      // 0bca: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bcd: athrow
      // 0bce: aload 0
      // 0bcf: aload 2
      // 0bd0: ifnull 0bf5
      // 0bd3: goto 0bda
      // 0bd6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bd9: athrow
      // 0bda: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0bdd: aload 0
      // 0bde: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll J
      // 0be1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0be4: checkcast java/lang/Number
      // 0be7: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0bea: goto 0bf1
      // 0bed: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bf0: athrow
      // 0bf1: ifeq 0c0a
      // 0bf4: aload 0
      // 0bf5: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.g ()V
      // 0bf8: aload 2
      // 0bf9: ifnonnull 0c0a
      // 0bfc: aload 0
      // 0bfd: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0c00: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0c03: goto 0c0a
      // 0c06: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c09: athrow
      // 0c0a: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0c0d: goto 173d
      // 0c10: aload 0
      // 0c11: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0c14: astore 5
      // 0c16: aload 5
      // 0c18: aload 2
      // 0c19: ifnull 0cfe
      // 0c1c: ifnull 0cfc
      // 0c1f: goto 0c26
      // 0c22: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c25: athrow
      // 0c26: aload 0
      // 0c27: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Z
      // 0c2a: aload 2
      // 0c2b: ifnull 0c58
      // 0c2e: goto 0c35
      // 0c31: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c34: athrow
      // 0c35: ifeq 0c90
      // 0c38: goto 0c3f
      // 0c3b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c3e: athrow
      // 0c3f: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0c42: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.l ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0c45: sipush 500
      // 0c48: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c4b: checkcast java/lang/Number
      // 0c4e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0c51: goto 0c58
      // 0c54: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c57: athrow
      // 0c58: ifeq 0c90
      // 0c5b: aload 0
      // 0c5c: aload 5
      // 0c5e: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/core/BlockPos;
      // 0c61: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;
      // 0c64: astore 6
      // 0c66: aload 6
      // 0c68: ifnonnull 0c71
      // 0c6b: aconst_null
      // 0c6c: astore 5
      // 0c6e: goto 0c90
      // 0c71: aload 0
      // 0c72: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0c75: dup
      // 0c76: ifnull 0c88
      // 0c79: aload 6
      // 0c7b: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Lnet/minecraft/core/BlockPos;)V
      // 0c7e: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0c81: goto 0c8a
      // 0c84: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c87: athrow
      // 0c88: pop
      // 0c89: aconst_null
      // 0c8a: pop
      // 0c8b: aload 0
      // 0c8c: bipush 0
      // 0c8d: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Z
      // 0c90: aload 5
      // 0c92: aload 2
      // 0c93: ifnull 0cfe
      // 0c96: ifnull 0cfc
      // 0c99: goto 0ca0
      // 0c9c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c9f: athrow
      // 0ca0: aload 0
      // 0ca1: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0ca4: sipush 5000
      // 0ca7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0caa: checkcast java/lang/Number
      // 0cad: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0cb0: aload 2
      // 0cb1: ifnull 0cd4
      // 0cb4: goto 0cbb
      // 0cb7: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cba: athrow
      // 0cbb: ifne 0cf9
      // 0cbe: goto 0cc5
      // 0cc1: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cc4: athrow
      // 0cc5: aload 5
      // 0cc7: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/core/BlockPos;
      // 0cca: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 0ccd: goto 0cd4
      // 0cd0: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cd3: athrow
      // 0cd4: i2d
      // 0cd5: aload 3
      // 0cd6: invokevirtual net/minecraft/client/player/LocalPlayer.getEyeY ()D
      // 0cd9: dsub
      // 0cda: invokestatic java/lang/Math.abs (D)D
      // 0cdd: ldc2_w 3.5
      // 0ce0: getstatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll Lme/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0ce3: invokevirtual me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()I
      // 0ce6: bipush 20
      // 0ce8: if_icmpge 0cf3
      // 0ceb: dconst_1
      // 0cec: goto 0cf4
      // 0cef: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cf2: athrow
      // 0cf3: dconst_0
      // 0cf4: dsub
      // 0cf5: dcmpl
      // 0cf6: iflt 0cfc
      // 0cf9: aconst_null
      // 0cfa: astore 5
      // 0cfc: aload 5
      // 0cfe: aload 2
      // 0cff: ifnull 0d32
      // 0d02: ifnull 0d23
      // 0d05: goto 0d0c
      // 0d08: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d0b: athrow
      // 0d0c: aload 4
      // 0d0e: aload 5
      // 0d10: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/core/BlockPos;
      // 0d13: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0d16: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 0d19: ifeq 0d61
      // 0d1c: goto 0d23
      // 0d1f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d22: athrow
      // 0d23: aload 0
      // 0d24: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.l ()V
      // 0d27: aload 0
      // 0d28: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.m ()Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0d2b: goto 0d32
      // 0d2e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d31: athrow
      // 0d32: astore 6
      // 0d34: aload 2
      // 0d35: ifnull 0d51
      // 0d38: aload 6
      // 0d3a: ifnull 0d55
      // 0d3d: goto 0d44
      // 0d40: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d43: athrow
      // 0d44: aload 0
      // 0d45: aload 6
      // 0d47: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)V
      // 0d4a: goto 0d51
      // 0d4d: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d50: athrow
      // 0d51: aload 2
      // 0d52: ifnonnull 0d60
      // 0d55: aload 0
      // 0d56: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.h ()V
      // 0d59: goto 0d60
      // 0d5c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d5f: athrow
      // 0d60: return
      // 0d61: aload 3
      // 0d62: checkcast net/minecraft/world/entity/Entity
      // 0d65: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 0d68: astore 6
      // 0d6a: aload 3
      // 0d6b: invokevirtual net/minecraft/client/player/LocalPlayer.getEyePosition ()Lnet/minecraft/world/phys/Vec3;
      // 0d6e: dup
      // 0d6f: sipush -19352
      // 0d72: sipush 21258
      // 0d75: pop2
      // 0d76: ldc_w "getEyePosition(...)"
      // 0d79: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0d7c: astore 7
      // 0d7e: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0d81: sipush -19345
      // 0d84: sipush 20095
      // 0d87: pop2
      // 0d88: ldc_w "sneak"
      // 0d8b: aload 0
      // 0d8c: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0d8f: sipush 300
      // 0d92: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d95: checkcast java/lang/Number
      // 0d98: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0d9b: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 0d9e: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 0da1: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.r ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0da4: dup
      // 0da5: aload 2
      // 0da6: ifnull 0dc2
      // 0da9: ifnonnull 0dc1
      // 0dac: goto 0db3
      // 0daf: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0db2: athrow
      // 0db3: pop
      // 0db4: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 0db7: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.p ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0dba: goto 0dc1
      // 0dbd: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0dc0: athrow
      // 0dc1: dup
      // 0dc2: ifnull 0dff
      // 0dc5: astore 10
      // 0dc7: bipush 0
      // 0dc8: istore 11
      // 0dca: aload 2
      // 0dcb: ifnull 0df9
      // 0dce: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0dd1: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 0dd4: aload 10
      // 0dd6: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0dd9: if_icmpeq 0df4
      // 0ddc: goto 0de3
      // 0ddf: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0de2: athrow
      // 0de3: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0de6: aload 10
      // 0de8: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0deb: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 0dee: pop
      // 0def: return
      // 0df0: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0df3: athrow
      // 0df4: nop
      // 0df5: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0df8: pop
      // 0df9: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0dfc: goto 0e01
      // 0dff: pop
      // 0e00: aconst_null
      // 0e01: pop
      // 0e02: aconst_null
      // 0e03: astore 8
      // 0e05: getstatic net/minecraft/world/phys/Vec3.ZERO Lnet/minecraft/world/phys/Vec3;
      // 0e08: dup
      // 0e09: sipush -19355
      // 0e0c: sipush 7798
      // 0e0f: pop2
      // 0e10: ldc "ZERO"
      // 0e12: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e15: astore 8
      // 0e17: aload 5
      // 0e19: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/core/BlockPos;
      // 0e1c: astore 9
      // 0e1e: aload 5
      // 0e20: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Lnet/minecraft/core/BlockPos;
      // 0e23: astore 10
      // 0e25: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0e28: aload 7
      // 0e2a: aload 9
      // 0e2c: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 0e2f: dup
      // 0e30: sipush -19336
      // 0e33: sipush 16875
      // 0e36: pop2
      // 0e37: ldc_w "getCenter(...)"
      // 0e3a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e3d: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 0e40: dstore 11
      // 0e42: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 0e45: aload 9
      // 0e47: aconst_null
      // 0e48: aconst_null
      // 0e49: dconst_0
      // 0e4a: dconst_0
      // 0e4b: dconst_0
      // 0e4c: bipush 62
      // 0e4e: aconst_null
      // 0e4f: invokestatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a (Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;Ljava/lang/Object;Ljava/util/List;Lnet/minecraft/world/phys/Vec3;DDDILjava/lang/Object;)Ljava/util/List;
      // 0e52: checkcast java/lang/Iterable
      // 0e55: astore 14
      // 0e57: bipush 0
      // 0e58: istore 15
      // 0e5a: aload 14
      // 0e5c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0e61: astore 16
      // 0e63: aload 16
      // 0e65: aload 2
      // 0e66: ifnull 0e87
      // 0e69: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e6e: ifne 0e80
      // 0e71: goto 0e78
      // 0e74: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e77: athrow
      // 0e78: aconst_null
      // 0e79: goto 0efe
      // 0e7c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e7f: athrow
      // 0e80: aload 16
      // 0e82: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e87: astore 17
      // 0e89: aload 16
      // 0e8b: aload 2
      // 0e8c: ifnull 0ea9
      // 0e8f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e94: ifne 0ea7
      // 0e97: goto 0e9e
      // 0e9a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e9d: athrow
      // 0e9e: aload 17
      // 0ea0: goto 0efe
      // 0ea3: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ea6: athrow
      // 0ea7: aload 17
      // 0ea9: checkcast net/minecraft/world/phys/Vec3
      // 0eac: astore 18
      // 0eae: bipush 0
      // 0eaf: istore 20
      // 0eb1: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0eb4: aload 7
      // 0eb6: aload 18
      // 0eb8: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 0ebb: dstore 18
      // 0ebd: aload 16
      // 0ebf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ec4: astore 20
      // 0ec6: aload 20
      // 0ec8: checkcast net/minecraft/world/phys/Vec3
      // 0ecb: astore 21
      // 0ecd: bipush 0
      // 0ece: istore 23
      // 0ed0: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0ed3: aload 7
      // 0ed5: aload 21
      // 0ed7: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 0eda: dstore 21
      // 0edc: dload 18
      // 0ede: dload 21
      // 0ee0: invokestatic java/lang/Double.compare (DD)I
      // 0ee3: ifle 0eee
      // 0ee6: aload 20
      // 0ee8: astore 17
      // 0eea: dload 21
      // 0eec: dstore 18
      // 0eee: aload 16
      // 0ef0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ef5: ifne 0ebd
      // 0ef8: aload 2
      // 0ef9: ifnull 0eea
      // 0efc: aload 17
      // 0efe: checkcast net/minecraft/world/phys/Vec3
      // 0f01: astore 13
      // 0f03: aload 13
      // 0f05: aload 2
      // 0f06: ifnull 0fc8
      // 0f09: ifnull 0fae
      // 0f0c: goto 0f13
      // 0f0f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f12: athrow
      // 0f13: aload 0
      // 0f14: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0f17: sipush 400
      // 0f1a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f1d: checkcast java/lang/Number
      // 0f20: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0f23: aload 2
      // 0f24: ifnull 0f68
      // 0f27: goto 0f2e
      // 0f2a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f2d: athrow
      // 0f2e: ifne 0f53
      // 0f31: goto 0f38
      // 0f34: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f37: athrow
      // 0f38: dload 11
      // 0f3a: ldc2_w 2.5
      // 0f3d: dcmpl
      // 0f3e: aload 2
      // 0f3f: ifnull 0f68
      // 0f42: goto 0f49
      // 0f45: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f48: athrow
      // 0f49: ifgt 0fae
      // 0f4c: goto 0f53
      // 0f4f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f52: athrow
      // 0f53: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0f56: aload 7
      // 0f58: aload 13
      // 0f5a: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 0f5d: ldc2_w 3.0
      // 0f60: dcmpl
      // 0f61: goto 0f68
      // 0f64: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f67: athrow
      // 0f68: aload 2
      // 0f69: ifnull 0f83
      // 0f6c: ifgt 0fae
      // 0f6f: goto 0f76
      // 0f72: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f75: athrow
      // 0f76: getstatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll Lme/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 0f79: invokevirtual me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()I
      // 0f7c: goto 0f83
      // 0f7f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f82: athrow
      // 0f83: bipush 20
      // 0f85: aload 2
      // 0f86: ifnull 1119
      // 0f89: if_icmpge 1100
      // 0f8c: goto 0f93
      // 0f8f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f92: athrow
      // 0f93: dload 11
      // 0f95: ldc2_w 3.0
      // 0f98: dcmpl
      // 0f99: aload 2
      // 0f9a: ifnull 1117
      // 0f9d: goto 0fa4
      // 0fa0: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fa3: athrow
      // 0fa4: ifle 1100
      // 0fa7: goto 0fae
      // 0faa: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fad: athrow
      // 0fae: aload 10
      // 0fb0: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 0fb3: dup
      // 0fb4: sipush -19336
      // 0fb7: sipush 16875
      // 0fba: pop2
      // 0fbb: ldc_w "getCenter(...)"
      // 0fbe: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0fc1: goto 0fc8
      // 0fc4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fc7: athrow
      // 0fc8: astore 14
      // 0fca: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 0fcd: aload 14
      // 0fcf: aload 6
      // 0fd1: ldc2_w 0.25
      // 0fd4: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 0fd7: aload 2
      // 0fd8: ifnull 0ffc
      // 0fdb: ifeq 0ff8
      // 0fde: goto 0fe5
      // 0fe1: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fe4: athrow
      // 0fe5: aload 0
      // 0fe6: bipush 1
      // 0fe7: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Z
      // 0fea: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0fed: bipush 1
      // 0fee: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.g (Z)V
      // 0ff1: goto 0ff8
      // 0ff4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ff7: athrow
      // 0ff8: aload 0
      // 0ff9: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Z
      // 0ffc: aload 2
      // 0ffd: ifnull 1018
      // 1000: ifne 1026
      // 1003: goto 100a
      // 1006: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1009: athrow
      // 100a: aload 9
      // 100c: aload 10
      // 100e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1011: goto 1018
      // 1014: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1017: athrow
      // 1018: aload 2
      // 1019: ifnull 1067
      // 101c: ifeq 1051
      // 101f: goto 1026
      // 1022: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1025: athrow
      // 1026: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1029: aload 6
      // 102b: aload 9
      // 102d: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 1030: dup
      // 1031: sipush -19336
      // 1034: sipush 16875
      // 1037: pop2
      // 1038: ldc_w "getCenter(...)"
      // 103b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 103e: bipush 0
      // 103f: dconst_0
      // 1040: bipush 12
      // 1042: aconst_null
      // 1043: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZDILjava/lang/Object;)V
      // 1046: aload 2
      // 1047: ifnonnull 10e5
      // 104a: goto 1051
      // 104d: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1050: athrow
      // 1051: aload 9
      // 1053: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 1056: i2d
      // 1057: aload 3
      // 1058: invokevirtual net/minecraft/client/player/LocalPlayer.getY ()D
      // 105b: dsub
      // 105c: ldc2_w 2.0
      // 105f: dcmpl
      // 1060: goto 1067
      // 1063: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1066: athrow
      // 1067: aload 2
      // 1068: ifnull 1099
      // 106b: iflt 10be
      // 106e: goto 1075
      // 1071: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1074: athrow
      // 1075: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 1078: aload 6
      // 107a: aload 9
      // 107c: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 107f: dup
      // 1080: sipush -19336
      // 1083: sipush 16875
      // 1086: pop2
      // 1087: ldc_w "getCenter(...)"
      // 108a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 108d: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 1090: dconst_1
      // 1091: dcmpg
      // 1092: goto 1099
      // 1095: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1098: athrow
      // 1099: ifge 10be
      // 109c: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 109f: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 10a2: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 10a5: sipush -19358
      // 10a8: sipush 17704
      // 10ab: pop2
      // 10ac: ldc_w "backwards"
      // 10af: bipush 1
      // 10b0: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 10b3: aload 2
      // 10b4: ifnonnull 10e5
      // 10b7: goto 10be
      // 10ba: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10bd: athrow
      // 10be: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 10c1: aload 6
      // 10c3: aload 10
      // 10c5: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 10c8: dup
      // 10c9: sipush -19336
      // 10cc: sipush 16875
      // 10cf: pop2
      // 10d0: ldc_w "getCenter(...)"
      // 10d3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 10d6: bipush 0
      // 10d7: dconst_0
      // 10d8: bipush 12
      // 10da: aconst_null
      // 10db: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZDILjava/lang/Object;)V
      // 10de: goto 10e5
      // 10e1: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10e4: athrow
      // 10e5: aload 9
      // 10e7: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 10ea: dup
      // 10eb: sipush -19336
      // 10ee: sipush 16875
      // 10f1: pop2
      // 10f2: ldc_w "getCenter(...)"
      // 10f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 10f8: astore 8
      // 10fa: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 10fd: goto 129c
      // 1100: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1103: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 1106: aload 2
      // 1107: ifnull 1120
      // 110a: getstatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll Lme/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 110d: invokevirtual me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()I
      // 1110: goto 1117
      // 1113: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1116: athrow
      // 1117: bipush 20
      // 1119: if_icmplt 127f
      // 111c: aload 13
      // 111e: astore 8
      // 1120: aload 2
      // 1121: ifnull 1140
      // 1124: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 1127: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.I ()Lnet/minecraft/world/phys/BlockHitResult;
      // 112a: dup
      // 112b: ifnull 113f
      // 112e: goto 1135
      // 1131: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1134: athrow
      // 1135: invokevirtual net/minecraft/world/phys/BlockHitResult.getBlockPos ()Lnet/minecraft/core/BlockPos;
      // 1138: goto 1141
      // 113b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 113e: athrow
      // 113f: pop
      // 1140: aconst_null
      // 1141: astore 14
      // 1143: aload 14
      // 1145: aload 2
      // 1146: ifnull 1155
      // 1149: ifnull 116c
      // 114c: goto 1153
      // 114f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1152: athrow
      // 1153: aload 14
      // 1155: aload 9
      // 1157: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 115a: aload 2
      // 115b: ifnull 1169
      // 115e: ifeq 116c
      // 1161: goto 1168
      // 1164: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1167: athrow
      // 1168: bipush 1
      // 1169: goto 116d
      // 116c: bipush 0
      // 116d: istore 15
      // 116f: iload 15
      // 1171: aload 2
      // 1172: ifnull 11c6
      // 1175: ifeq 11bd
      // 1178: goto 117f
      // 117b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 117e: athrow
      // 117f: aload 0
      // 1180: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII Z
      // 1183: aload 2
      // 1184: ifnull 11c6
      // 1187: goto 118e
      // 118a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 118d: athrow
      // 118e: ifne 11bd
      // 1191: goto 1198
      // 1194: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1197: athrow
      // 1198: aload 0
      // 1199: bipush 1
      // 119a: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII Z
      // 119d: aload 0
      // 119e: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 11a1: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 11a4: aload 0
      // 11a5: aload 0
      // 11a6: ldc2_w 35
      // 11a9: ldc2_w 30
      // 11ac: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (JJ)J
      // 11af: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII J
      // 11b2: aload 2
      // 11b3: ifnonnull 11e0
      // 11b6: goto 11bd
      // 11b9: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11bc: athrow
      // 11bd: iload 15
      // 11bf: goto 11c6
      // 11c2: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11c5: athrow
      // 11c6: aload 2
      // 11c7: ifnull 11f1
      // 11ca: ifne 11e0
      // 11cd: goto 11d4
      // 11d0: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11d3: athrow
      // 11d4: aload 0
      // 11d5: bipush 0
      // 11d6: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII Z
      // 11d9: goto 11e0
      // 11dc: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11df: athrow
      // 11e0: aload 0
      // 11e1: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 11e4: aload 0
      // 11e5: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll I
      // 11e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11eb: checkcast java/lang/Number
      // 11ee: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 11f1: aload 2
      // 11f2: ifnull 1201
      // 11f5: ifeq 1279
      // 11f8: goto 11ff
      // 11fb: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11fe: athrow
      // 11ff: iload 15
      // 1201: aload 2
      // 1202: ifnull 1227
      // 1205: ifeq 1279
      // 1208: goto 120f
      // 120b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 120e: athrow
      // 120f: aload 0
      // 1210: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 1213: aload 0
      // 1214: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII J
      // 1217: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 121a: checkcast java/lang/Number
      // 121d: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 1220: goto 1227
      // 1223: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1226: athrow
      // 1227: aload 2
      // 1228: ifnull 124c
      // 122b: ifeq 1279
      // 122e: goto 1235
      // 1231: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1234: athrow
      // 1235: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1238: sipush -19365
      // 123b: sipush 1962
      // 123e: pop2
      // 123f: ldc_w "attack"
      // 1242: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;)Z
      // 1245: goto 124c
      // 1248: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 124b: athrow
      // 124c: aload 2
      // 124d: ifnull 1267
      // 1250: ifne 1279
      // 1253: goto 125a
      // 1256: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1259: athrow
      // 125a: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 125d: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.j ()Z
      // 1260: goto 1267
      // 1263: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1266: athrow
      // 1267: ifeq 1279
      // 126a: aload 0
      // 126b: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.k ()V
      // 126e: aload 0
      // 126f: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.l ()V
      // 1272: goto 1279
      // 1275: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1278: athrow
      // 1279: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 127c: goto 129c
      // 127f: aload 0
      // 1280: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Lnet/minecraft/world/phys/Vec3;
      // 1283: dup
      // 1284: ifnull 129a
      // 1287: astore 16
      // 1289: bipush 0
      // 128a: istore 17
      // 128c: aload 16
      // 128e: astore 8
      // 1290: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1293: pop
      // 1294: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1297: goto 129c
      // 129a: pop
      // 129b: aconst_null
      // 129c: pop
      // 129d: aload 8
      // 129f: getstatic net/minecraft/world/phys/Vec3.ZERO Lnet/minecraft/world/phys/Vec3;
      // 12a2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 12a5: ifne 12c5
      // 12a8: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 12ab: aload 8
      // 12ad: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 12b0: astore 14
      // 12b2: getstatic me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
      // 12b5: aload 14
      // 12b7: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 12ba: aload 14
      // 12bc: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.b ()F
      // 12bf: fconst_0
      // 12c0: bipush 4
      // 12c1: aconst_null
      // 12c2: invokestatic me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.b (Lme/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;FFFILjava/lang/Object;)V
      // 12c5: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 12c8: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.I ()Lnet/minecraft/world/phys/BlockHitResult;
      // 12cb: dup
      // 12cc: ifnull 12d9
      // 12cf: invokevirtual net/minecraft/world/phys/BlockHitResult.getBlockPos ()Lnet/minecraft/core/BlockPos;
      // 12d2: goto 12db
      // 12d5: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12d8: athrow
      // 12d9: pop
      // 12da: aconst_null
      // 12db: astore 14
      // 12dd: aload 14
      // 12df: ifnull 133b
      // 12e2: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 12e5: aload 8
      // 12e7: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d (Lnet/minecraft/world/phys/Vec3;)D
      // 12ea: ldc2_w 10.0
      // 12ed: dcmpg
      // 12ee: ifge 133b
      // 12f1: goto 12f8
      // 12f4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12f7: athrow
      // 12f8: aload 4
      // 12fa: aload 14
      // 12fc: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 12ff: dup
      // 1300: sipush -19362
      // 1303: sipush -23441
      // 1306: pop2
      // 1307: ldc_w "getBlockState(...)"
      // 130a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 130d: astore 15
      // 130f: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1312: sipush -19365
      // 1315: sipush 1962
      // 1318: pop2
      // 1319: ldc_w "attack"
      // 131c: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 131f: aload 15
      // 1321: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 1324: dup
      // 1325: sipush -19349
      // 1328: sipush 7149
      // 132b: pop2
      // 132c: ldc_w "getBlock(...)"
      // 132f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1332: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.a (Lnet/minecraft/world/level/block/Block;)Z
      // 1335: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 1338: goto 134c
      // 133b: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 133e: sipush -19365
      // 1341: sipush 1962
      // 1344: pop2
      // 1345: ldc_w "attack"
      // 1348: bipush 0
      // 1349: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 134c: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 134f: goto 173d
      // 1352: aload 0
      // 1353: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lnet/minecraft/core/BlockPos;
      // 1356: dup
      // 1357: ifnonnull 1360
      // 135a: pop
      // 135b: return
      // 135c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 135f: athrow
      // 1360: astore 5
      // 1362: aload 3
      // 1363: checkcast net/minecraft/world/entity/Entity
      // 1366: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 1369: astore 6
      // 136b: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 136e: aload 5
      // 1370: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 1373: astore 7
      // 1375: aload 2
      // 1376: ifnull 1395
      // 1379: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 137c: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.I ()Lnet/minecraft/world/phys/BlockHitResult;
      // 137f: dup
      // 1380: ifnull 1394
      // 1383: goto 138a
      // 1386: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1389: athrow
      // 138a: invokevirtual net/minecraft/world/phys/BlockHitResult.getBlockPos ()Lnet/minecraft/core/BlockPos;
      // 138d: goto 1396
      // 1390: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1393: athrow
      // 1394: pop
      // 1395: aconst_null
      // 1396: astore 8
      // 1398: aload 8
      // 139a: ifnull 13eb
      // 139d: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 13a0: aload 4
      // 13a2: aload 8
      // 13a4: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 13a7: dup
      // 13a8: sipush -19362
      // 13ab: sipush -23441
      // 13ae: pop2
      // 13af: ldc_w "getBlockState(...)"
      // 13b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 13b5: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.G (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 13b8: aload 2
      // 13b9: ifnull 13e8
      // 13bc: goto 13c3
      // 13bf: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13c2: athrow
      // 13c3: ifeq 13eb
      // 13c6: goto 13cd
      // 13c9: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13cc: athrow
      // 13cd: aload 0
      // 13ce: aload 2
      // 13cf: ifnull 1405
      // 13d2: goto 13d9
      // 13d5: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13d8: athrow
      // 13d9: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 13dc: aload 8
      // 13de: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 13e1: goto 13e8
      // 13e4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13e7: athrow
      // 13e8: ifeq 1404
      // 13eb: aload 0
      // 13ec: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 13ef: aload 2
      // 13f0: ifnull 1408
      // 13f3: goto 13fa
      // 13f6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13f9: athrow
      // 13fa: ifnull 15d7
      // 13fd: goto 1404
      // 1400: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1403: athrow
      // 1404: aload 0
      // 1405: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1408: aload 2
      // 1409: ifnull 1442
      // 140c: ifnonnull 143e
      // 140f: goto 1416
      // 1412: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1415: athrow
      // 1416: aload 0
      // 1417: new me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 141a: dup
      // 141b: aload 8
      // 141d: dup
      // 141e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1421: getstatic net/minecraft/core/BlockPos.ZERO Lnet/minecraft/core/BlockPos;
      // 1424: dup
      // 1425: sipush -19353
      // 1428: sipush 29693
      // 142b: pop2
      // 142c: ldc "ZERO"
      // 142e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1431: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)V
      // 1434: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1437: goto 143e
      // 143a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 143d: athrow
      // 143e: aload 0
      // 143f: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1442: dup
      // 1443: ifnonnull 144c
      // 1446: pop
      // 1447: return
      // 1448: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 144b: athrow
      // 144c: astore 9
      // 144e: getstatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll Lme/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 1451: invokevirtual me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()I
      // 1454: bipush 20
      // 1456: if_icmplt 159f
      // 1459: aload 8
      // 145b: aload 2
      // 145c: ifnull 1472
      // 145f: goto 1466
      // 1462: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1465: athrow
      // 1466: ifnull 148c
      // 1469: goto 1470
      // 146c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 146f: athrow
      // 1470: aload 8
      // 1472: aload 9
      // 1474: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/core/BlockPos;
      // 1477: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 147a: aload 2
      // 147b: ifnull 1489
      // 147e: ifeq 148c
      // 1481: goto 1488
      // 1484: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1487: athrow
      // 1488: bipush 1
      // 1489: goto 148d
      // 148c: bipush 0
      // 148d: istore 10
      // 148f: iload 10
      // 1491: aload 2
      // 1492: ifnull 14e6
      // 1495: ifeq 14dd
      // 1498: goto 149f
      // 149b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 149e: athrow
      // 149f: aload 0
      // 14a0: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII Z
      // 14a3: aload 2
      // 14a4: ifnull 14e6
      // 14a7: goto 14ae
      // 14aa: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14ad: athrow
      // 14ae: ifne 14dd
      // 14b1: goto 14b8
      // 14b4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14b7: athrow
      // 14b8: aload 0
      // 14b9: bipush 1
      // 14ba: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII Z
      // 14bd: aload 0
      // 14be: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 14c1: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 14c4: aload 0
      // 14c5: aload 0
      // 14c6: ldc2_w 35
      // 14c9: ldc2_w 30
      // 14cc: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (JJ)J
      // 14cf: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII J
      // 14d2: aload 2
      // 14d3: ifnonnull 1500
      // 14d6: goto 14dd
      // 14d9: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14dc: athrow
      // 14dd: iload 10
      // 14df: goto 14e6
      // 14e2: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14e5: athrow
      // 14e6: aload 2
      // 14e7: ifnull 1511
      // 14ea: ifne 1500
      // 14ed: goto 14f4
      // 14f0: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14f3: athrow
      // 14f4: aload 0
      // 14f5: bipush 0
      // 14f6: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII Z
      // 14f9: goto 1500
      // 14fc: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14ff: athrow
      // 1500: aload 0
      // 1501: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 1504: aload 0
      // 1505: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll I
      // 1508: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 150b: checkcast java/lang/Number
      // 150e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 1511: aload 2
      // 1512: ifnull 1521
      // 1515: ifeq 1599
      // 1518: goto 151f
      // 151b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 151e: athrow
      // 151f: iload 10
      // 1521: aload 2
      // 1522: ifnull 1547
      // 1525: ifeq 1599
      // 1528: goto 152f
      // 152b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 152e: athrow
      // 152f: aload 0
      // 1530: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 1533: aload 0
      // 1534: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII J
      // 1537: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 153a: checkcast java/lang/Number
      // 153d: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 1540: goto 1547
      // 1543: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1546: athrow
      // 1547: aload 2
      // 1548: ifnull 156c
      // 154b: ifeq 1599
      // 154e: goto 1555
      // 1551: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1554: athrow
      // 1555: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1558: sipush -19365
      // 155b: sipush 1962
      // 155e: pop2
      // 155f: ldc_w "attack"
      // 1562: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;)Z
      // 1565: goto 156c
      // 1568: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 156b: athrow
      // 156c: aload 2
      // 156d: ifnull 1587
      // 1570: ifne 1599
      // 1573: goto 157a
      // 1576: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1579: athrow
      // 157a: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 157d: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.j ()Z
      // 1580: goto 1587
      // 1583: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1586: athrow
      // 1587: ifeq 1599
      // 158a: aload 0
      // 158b: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.k ()V
      // 158e: aload 0
      // 158f: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.l ()V
      // 1592: goto 1599
      // 1595: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1598: athrow
      // 1599: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 159c: goto 15b6
      // 159f: aload 0
      // 15a0: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Lnet/minecraft/world/phys/Vec3;
      // 15a3: dup
      // 15a4: ifnull 15b4
      // 15a7: astore 12
      // 15a9: bipush 0
      // 15aa: istore 13
      // 15ac: aload 12
      // 15ae: invokestatic me/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 15b1: goto 15b6
      // 15b4: pop
      // 15b5: aconst_null
      // 15b6: pop
      // 15b7: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 15ba: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 15bd: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 15c0: sipush -19365
      // 15c3: sipush 1962
      // 15c6: pop2
      // 15c7: ldc_w "attack"
      // 15ca: bipush 0
      // 15cb: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 15ce: aload 0
      // 15cf: bipush 0
      // 15d0: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII Z
      // 15d3: aload 2
      // 15d4: ifnonnull 171e
      // 15d7: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 15da: aload 7
      // 15dc: aload 6
      // 15de: ldc2_w 0.15
      // 15e1: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 15e4: aload 2
      // 15e5: ifnull 162b
      // 15e8: goto 15ef
      // 15eb: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15ee: athrow
      // 15ef: ifeq 16f0
      // 15f2: goto 15f9
      // 15f5: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15f8: athrow
      // 15f9: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 15fc: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 15ff: getstatic me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
      // 1602: aload 3
      // 1603: invokevirtual net/minecraft/client/player/LocalPlayer.getYRot ()F
      // 1606: aload 0
      // 1607: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI F
      // 160a: fconst_0
      // 160b: bipush 4
      // 160c: aconst_null
      // 160d: invokestatic me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.b (Lme/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;FFFILjava/lang/Object;)V
      // 1610: aload 3
      // 1611: invokevirtual net/minecraft/client/player/LocalPlayer.getY ()D
      // 1614: aload 7
      // 1616: getfield net/minecraft/world/phys/Vec3.y D
      // 1619: aload 0
      // 161a: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.e ()I
      // 161d: i2d
      // 161e: dsub
      // 161f: dsub
      // 1620: ldc2_w 0.5
      // 1623: dcmpg
      // 1624: goto 162b
      // 1627: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 162a: athrow
      // 162b: aload 2
      // 162c: ifnull 1678
      // 162f: ifgt 165d
      // 1632: goto 1639
      // 1635: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1638: athrow
      // 1639: aload 3
      // 163a: invokevirtual net/minecraft/client/player/LocalPlayer.onGround ()Z
      // 163d: aload 2
      // 163e: ifnull 1678
      // 1641: goto 1648
      // 1644: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1647: athrow
      // 1648: ifeq 165d
      // 164b: goto 1652
      // 164e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1651: athrow
      // 1652: aload 0
      // 1653: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.h ()V
      // 1656: goto 165d
      // 1659: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 165c: athrow
      // 165d: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1660: sipush -19365
      // 1663: sipush 1962
      // 1666: pop2
      // 1667: ldc_w "attack"
      // 166a: aload 2
      // 166b: ifnull 16b0
      // 166e: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;)Z
      // 1671: goto 1678
      // 1674: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1677: athrow
      // 1678: ifeq 16a3
      // 167b: aload 0
      // 167c: aload 2
      // 167d: ifnull 169c
      // 1680: goto 1687
      // 1683: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1686: athrow
      // 1687: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII Z
      // 168a: ifne 16a3
      // 168d: goto 1694
      // 1690: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1693: athrow
      // 1694: aload 0
      // 1695: goto 169c
      // 1698: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 169b: athrow
      // 169c: bipush 1
      // 169d: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII Z
      // 16a0: invokestatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.l ()V
      // 16a3: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 16a6: sipush -19365
      // 16a9: sipush 1962
      // 16ac: pop2
      // 16ad: ldc_w "attack"
      // 16b0: aload 8
      // 16b2: aload 2
      // 16b3: ifnull 16c2
      // 16b6: ifnull 16dd
      // 16b9: goto 16c0
      // 16bc: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16bf: athrow
      // 16c0: aload 8
      // 16c2: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 16c5: aload 2
      // 16c6: ifnull 16e5
      // 16c9: aload 5
      // 16cb: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 16ce: aload 0
      // 16cf: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.e ()I
      // 16d2: isub
      // 16d3: if_icmple 16e8
      // 16d6: goto 16dd
      // 16d9: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16dc: athrow
      // 16dd: bipush 1
      // 16de: goto 16e5
      // 16e1: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16e4: athrow
      // 16e5: goto 16e9
      // 16e8: bipush 0
      // 16e9: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 16ec: aload 2
      // 16ed: ifnonnull 171e
      // 16f0: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 16f3: aload 6
      // 16f5: aload 7
      // 16f7: bipush 0
      // 16f8: dconst_0
      // 16f9: bipush 12
      // 16fb: aconst_null
      // 16fc: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZDILjava/lang/Object;)V
      // 16ff: getstatic me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
      // 1702: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 1705: aload 7
      // 1707: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 170a: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 170d: aload 0
      // 170e: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI F
      // 1711: fconst_0
      // 1712: bipush 4
      // 1713: aconst_null
      // 1714: invokestatic me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.b (Lme/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;FFFILjava/lang/Object;)V
      // 1717: goto 171e
      // 171a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 171d: athrow
      // 171e: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1721: sipush -19345
      // 1724: sipush 20095
      // 1727: pop2
      // 1728: ldc_w "sneak"
      // 172b: bipush 1
      // 172c: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 172f: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1732: goto 173d
      // 1735: new kotlin/NoWhenBranchMatchedException
      // 1738: dup
      // 1739: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 173c: athrow
      // 173d: pop
      // 173e: return
   }

   @SubscribeEvent
   public final void a(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 2
      // 006: ifnull 02a
      // 009: sipush -19329
      // 00c: sipush -27163
      // 00f: pop2
      // 010: ldc_w "event"
      // 013: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 016: aload 0
      // 017: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 01a: ifne 029
      // 01d: goto 024
      // 020: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 023: athrow
      // 024: return
      // 025: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 028: athrow
      // 029: aload 1
      // 02a: getfield me/octo/client/events/impl/IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lnet/minecraft/network/protocol/Packet;
      // 02d: astore 3
      // 02e: aload 3
      // 02f: instanceof net/minecraft/network/protocol/game/ClientboundSystemChatPacket
      // 032: ifeq 354
      // 035: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 038: aload 3
      // 039: checkcast net/minecraft/network/protocol/game/ClientboundSystemChatPacket
      // 03c: invokevirtual net/minecraft/network/protocol/game/ClientboundSystemChatPacket.content ()Lnet/minecraft/network/chat/Component;
      // 03f: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 044: dup
      // 045: sipush -19369
      // 048: sipush -1785
      // 04b: pop2
      // 04c: ldc_w "getString(...)"
      // 04f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 052: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 055: astore 4
      // 057: getstatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll Lme/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 05a: invokevirtual me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()I
      // 05d: aload 2
      // 05e: ifnull 12d
      // 061: bipush 20
      // 063: if_icmpge 116
      // 066: goto 06d
      // 069: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06c: athrow
      // 06d: aload 0
      // 06e: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 071: sipush 300
      // 074: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 077: checkcast java/lang/Number
      // 07a: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 07d: aload 2
      // 07e: ifnull 12d
      // 081: goto 088
      // 084: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 087: athrow
      // 088: ifeq 116
      // 08b: goto 092
      // 08e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 091: athrow
      // 092: aload 4
      // 094: sipush -19351
      // 097: sipush 5703
      // 09a: pop2
      // 09b: ldc_w "You have successfully picked the lock on this chest"
      // 09e: bipush 0
      // 09f: bipush 2
      // 0a0: aconst_null
      // 0a1: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 0a4: aload 2
      // 0a5: ifnull 0d2
      // 0a8: goto 0af
      // 0ab: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ae: athrow
      // 0af: ifne 107
      // 0b2: goto 0b9
      // 0b5: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b8: athrow
      // 0b9: aload 4
      // 0bb: sipush -19338
      // 0be: sipush 27300
      // 0c1: pop2
      // 0c2: ldc_w "  CHEST LOCKPICKED"
      // 0c5: bipush 0
      // 0c6: bipush 2
      // 0c7: aconst_null
      // 0c8: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 0cb: goto 0d2
      // 0ce: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d1: athrow
      // 0d2: aload 2
      // 0d3: ifnull 0f9
      // 0d6: ifne 107
      // 0d9: goto 0e0
      // 0dc: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0df: athrow
      // 0e0: aload 4
      // 0e2: sipush -19363
      // 0e5: sipush -24956
      // 0e8: pop2
      // 0e9: ldc_w "  REWARDS"
      // 0ec: bipush 0
      // 0ed: bipush 2
      // 0ee: aconst_null
      // 0ef: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 0f2: goto 0f9
      // 0f5: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f8: athrow
      // 0f9: aload 2
      // 0fa: ifnull 12d
      // 0fd: ifeq 116
      // 100: goto 107
      // 103: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 106: athrow
      // 107: aload 0
      // 108: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.l ()V
      // 10b: aload 2
      // 10c: ifnonnull 354
      // 10f: goto 116
      // 112: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 115: athrow
      // 116: aload 0
      // 117: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 11a: sipush 5000
      // 11d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 120: checkcast java/lang/Number
      // 123: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 126: goto 12d
      // 129: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12c: athrow
      // 12d: aload 2
      // 12e: ifnull 15a
      // 131: ifeq 354
      // 134: goto 13b
      // 137: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13a: athrow
      // 13b: aload 4
      // 13d: checkcast java/lang/CharSequence
      // 140: sipush -19372
      // 143: sipush -29338
      // 146: pop2
      // 147: ldc_w "A magical force surrounding this area"
      // 14a: checkcast java/lang/CharSequence
      // 14d: bipush 0
      // 14e: bipush 2
      // 14f: aconst_null
      // 150: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 153: goto 15a
      // 156: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 159: athrow
      // 15a: aload 2
      // 15b: ifnull 187
      // 15e: ifne 1b7
      // 161: goto 168
      // 164: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 167: athrow
      // 168: aload 4
      // 16a: checkcast java/lang/CharSequence
      // 16d: sipush -19330
      // 170: sipush -20211
      // 173: pop2
      // 174: ldc_w "You are entering the jungle temple"
      // 177: checkcast java/lang/CharSequence
      // 17a: bipush 0
      // 17b: bipush 2
      // 17c: aconst_null
      // 17d: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 180: goto 187
      // 183: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 186: athrow
      // 187: aload 2
      // 188: ifnull 1b4
      // 18b: ifne 1b7
      // 18e: goto 195
      // 191: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 194: athrow
      // 195: aload 4
      // 197: checkcast java/lang/CharSequence
      // 19a: sipush -19348
      // 19d: sipush 21651
      // 1a0: pop2
      // 1a1: ldc_w "You cannot mine this close"
      // 1a4: checkcast java/lang/CharSequence
      // 1a7: bipush 0
      // 1a8: bipush 2
      // 1a9: aconst_null
      // 1aa: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 1ad: goto 1b4
      // 1b0: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b3: athrow
      // 1b4: ifeq 354
      // 1b7: aload 0
      // 1b8: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 1bb: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1be: dup
      // 1bf: ifnonnull 1cf
      // 1c2: goto 1c9
      // 1c5: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c8: athrow
      // 1c9: pop
      // 1ca: return
      // 1cb: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ce: athrow
      // 1cf: astore 5
      // 1d1: aload 0
      // 1d2: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 1d5: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 1d8: getstatic me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 1db: aload 5
      // 1dd: checkcast net/minecraft/world/entity/Entity
      // 1e0: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 1e3: ldc2_w 6.0
      // 1e6: invokevirtual me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;D)Z
      // 1e9: ifeq 1f1
      // 1ec: return
      // 1ed: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f0: athrow
      // 1f1: new me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI
      // 1f4: dup
      // 1f5: getstatic me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
      // 1f8: invokevirtual me/octo/client/utils/player/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.h ()F
      // 1fb: fconst_0
      // 1fc: invokespecial me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.<init> (FF)V
      // 1ff: astore 6
      // 201: aload 6
      // 203: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.e ()Lnet/minecraft/world/phys/Vec3;
      // 206: invokevirtual net/minecraft/world/phys/Vec3.normalize ()Lnet/minecraft/world/phys/Vec3;
      // 209: ldc2_w 5.0
      // 20c: invokevirtual net/minecraft/world/phys/Vec3.scale (D)Lnet/minecraft/world/phys/Vec3;
      // 20f: dup
      // 210: sipush -19346
      // 213: sipush 3357
      // 216: pop2
      // 217: ldc_w "scale(...)"
      // 21a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 21d: astore 7
      // 21f: aload 6
      // 221: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.c ()Lnet/minecraft/world/phys/Vec3;
      // 224: invokevirtual net/minecraft/world/phys/Vec3.normalize ()Lnet/minecraft/world/phys/Vec3;
      // 227: ldc2_w 5.0
      // 22a: invokevirtual net/minecraft/world/phys/Vec3.scale (D)Lnet/minecraft/world/phys/Vec3;
      // 22d: dup
      // 22e: sipush -19346
      // 231: sipush 3357
      // 234: pop2
      // 235: ldc_w "scale(...)"
      // 238: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 23b: astore 8
      // 23d: aload 5
      // 23f: checkcast net/minecraft/world/entity/Entity
      // 242: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 245: aload 6
      // 247: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.c ()Lnet/minecraft/world/phys/Vec3;
      // 24a: invokevirtual net/minecraft/world/phys/Vec3.normalize ()Lnet/minecraft/world/phys/Vec3;
      // 24d: dconst_1
      // 24e: invokevirtual net/minecraft/world/phys/Vec3.scale (D)Lnet/minecraft/world/phys/Vec3;
      // 251: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 254: dup
      // 255: sipush -19344
      // 258: sipush -24090
      // 25b: pop2
      // 25c: ldc_w "add(...)"
      // 25f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 262: astore 9
      // 264: aload 9
      // 266: aload 7
      // 268: invokevirtual net/minecraft/world/phys/Vec3.subtract (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 26b: dup
      // 26c: sipush -19371
      // 26f: sipush -17756
      // 272: pop2
      // 273: ldc_w "subtract(...)"
      // 276: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 279: astore 10
      // 27b: aload 9
      // 27d: aload 7
      // 27f: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 282: dup
      // 283: sipush -19344
      // 286: sipush -24090
      // 289: pop2
      // 28a: ldc_w "add(...)"
      // 28d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 290: astore 11
      // 292: aload 9
      // 294: aload 7
      // 296: invokevirtual net/minecraft/world/phys/Vec3.subtract (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 299: aload 8
      // 29b: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 29e: dup
      // 29f: sipush -19344
      // 2a2: sipush -24090
      // 2a5: pop2
      // 2a6: ldc_w "add(...)"
      // 2a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2ac: astore 12
      // 2ae: getstatic me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 2b1: invokevirtual me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a ()Ljava/util/ArrayList;
      // 2b4: new me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 2b7: dup
      // 2b8: new net/minecraft/world/phys/Vec3
      // 2bb: dup
      // 2bc: aload 10
      // 2be: getfield net/minecraft/world/phys/Vec3.x D
      // 2c1: aload 5
      // 2c3: invokevirtual net/minecraft/client/player/LocalPlayer.getY ()D
      // 2c6: aload 0
      // 2c7: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.e ()I
      // 2ca: i2d
      // 2cb: dsub
      // 2cc: bipush 1
      // 2cd: i2d
      // 2ce: dsub
      // 2cf: aload 10
      // 2d1: getfield net/minecraft/world/phys/Vec3.z D
      // 2d4: invokespecial net/minecraft/world/phys/Vec3.<init> (DDD)V
      // 2d7: aload 11
      // 2d9: new net/minecraft/world/phys/Vec3
      // 2dc: dup
      // 2dd: aload 12
      // 2df: getfield net/minecraft/world/phys/Vec3.x D
      // 2e2: aload 5
      // 2e4: invokevirtual net/minecraft/client/player/LocalPlayer.getY ()D
      // 2e7: aload 0
      // 2e8: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.e ()I
      // 2eb: i2d
      // 2ec: dadd
      // 2ed: bipush 1
      // 2ee: i2d
      // 2ef: dadd
      // 2f0: aload 12
      // 2f2: getfield net/minecraft/world/phys/Vec3.z D
      // 2f5: invokespecial net/minecraft/world/phys/Vec3.<init> (DDD)V
      // 2f8: invokespecial me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.<init> (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)V
      // 2fb: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 2fe: pop
      // 2ff: aload 0
      // 300: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.l ()V
      // 303: aload 0
      // 304: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/ArrayList;
      // 307: checkcast java/lang/Iterable
      // 30a: astore 13
      // 30c: bipush 0
      // 30d: istore 14
      // 30f: aload 13
      // 311: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 316: astore 15
      // 318: aload 15
      // 31a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 31f: ifeq 34f
      // 322: aload 15
      // 324: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 329: astore 16
      // 32b: aload 16
      // 32d: checkcast net/minecraft/core/BlockPos
      // 330: astore 17
      // 332: bipush 0
      // 333: istore 18
      // 335: aload 0
      // 336: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 339: aload 17
      // 33b: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 33e: pop
      // 33f: nop
      // 340: aload 2
      // 341: ifnull 350
      // 344: aload 2
      // 345: ifnonnull 318
      // 348: goto 34f
      // 34b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 34e: athrow
      // 34f: nop
      // 350: aload 0
      // 351: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.h ()V
      // 354: return
   }

   @SubscribeEvent
   public final void a(@NotNull llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl param1) {
      String var2 = me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(param1, "event");
      if (var2 != null) {
        if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
          return;
        }
        if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != me.octo.client.IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
          return;
        }
        if (this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl) {
          return;
        }
      }
      this.g();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI param1) {
      String var2 = me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(param1, "event");
      if (var2 != null && !this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) { return; }
      if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) { return; }
      net.minecraft.core.BlockPos var3 = param1.k();
      if (var3 == null) { return; }
      net.minecraft.world.level.block.state.BlockState var4 = param1.m();
      if (var4 == null || !var4.isAir()) { return; }
      net.minecraft.world.level.block.state.BlockState var5 = param1.l();
      if (var5 == null || var5.isAir()) { return; }
      if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var3.getCenter(), true) > 6.0D) { return; }
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.f();
   }

   @SubscribeEvent
   public final void a(@NotNull llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI param1) {
      String var2 = me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(param1, "event");
      if (var2 != null) {
        if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
          return;
        }
        if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != me.octo.client.IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
          return;
        }
        if (this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl) {
          return;
        }
      }
      this.g();
   }

    private final void g() {
       this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = true;
       this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = false;
       this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI + 1;
       if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().nextInt(2) > 0) {
          this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().nextInt(4);
       } else {
          this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 0;
       }
       this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll.f();
       this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = this.a(150L, 50L);
       this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.f();
       this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = 1100L + me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().nextInt(101) + 200L;
       this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.f();
    }

   @SubscribeEvent
   public final void a(@NotNull lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI param1) {
      String var2 = me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      if (!this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         return;
      }
      net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket var3 = param1.k();
      if (kotlin.jvm.internal.Intrinsics.areEqual(var3.getParticle().getType(), net.minecraft.core.particles.ParticleTypes.CRIT)) {
         if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl == null) {
            return;
         }
         net.minecraft.world.phys.Vec3 var4 = new net.minecraft.world.phys.Vec3(var3.getX(), var3.getY(), var3.getZ());
         me.octo.client.IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         int var6 = 0;
         net.minecraft.core.BlockPos var7 = var5.a();
         net.minecraft.world.phys.Vec3 var8 = var7.getCenter();
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var8, "getCenter(...)");
         if (var2 != null&& java.lang.Math.abs(var8.x - var4.x) < 0.7D&& java.lang.Math.abs(var8.y - var4.y) < 0.7D&& java.lang.Math.abs(var8.z - var4.z) < 0.7D) {
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var4.subtract(0.0D, 0.27D, 0.0D);
            this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.f();
         }
      }
   }

   private final void h() {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = 0;
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.f();
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.f();
   }

   private final void a(
      IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.f();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.f();
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = false;
      this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = false;
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g(true);
      lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var10001 = var1.a().getCenter();
      short var10003 = -19336;
      short var10004 = 16875;
      Intrinsics.checkNotNullExpressionValue(var10001, "getCenter(...)");
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var2 = var10000.a(var10001);
      lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.a(
         lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         var2.a(),
         var2.b(),
         0.0F);
   }

   private final void i() {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      String var1 = me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = this.j();
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = false;
      this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = 88.7f + kotlin.random.Random.Default.nextFloat() * 0.6f;
      this.l();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
      if (this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI == null) {
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
         return;
      }
      for (BlockPos var6 : this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.add(var6);
      }
      if (this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI != null) {
         float var3 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI)).a();
         me.octo.client.utils.player.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.a(me.octo.client.utils.player.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var3, this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI, 0.0f, 4, null);
      }
   }

   private final BlockPos j() {
      var var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
      if (var2 == null) {
         return null;
      }
      var var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
      if (var3 == null) {
         return null;
      }
      BlockPos var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.s();
      Vec3 var5 = me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var2);
      ArrayList<BlockPos> var6 = new ArrayList<>();
      for (int var7 = -3; var7 < 4; var7++) {
         for (int var8 = -3; var8 < 4; var8++) {
            BlockPos var9 = var4.offset(var7, 0, var8);
            BlockState var10 = var3.getBlockState(var9);
            if (var10.isAir()) {
               continue;
            }
            if (!var10.getFluidState().isEmpty()) {
               continue;
            }
            if (var10.getCollisionShape(var3, var9).isEmpty()) {
               continue;
            }
            if (!var3.getBlockState(var9.offset(0, 1, 0)).isAir()) {
               continue;
            }
            if (!var3.getBlockState(var9.offset(0, 2, 0)).isAir()) {
               continue;
            }
            if (!me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var5, me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var9), null, 0, false, 0.0, false, false, 0.0, 508, null)) {
               continue;
            }
            if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.D(var10)) {
               continue;
            }
            boolean var11 = true;
            for (int var12 = -1; var12 >= 1 - this.e(); var12--) {
               BlockState var13 = var3.getBlockState(var9.offset(0, var12, 0));
               if (!me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var13.getBlock()) && !var13.isAir()) {
                  var11 = false;
                  break;
               }
            }
            if (!var11) {
               continue;
            }
            BlockState var14 = var3.getBlockState(var9.offset(0, -this.e(), 0));
            if (!me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var14.getBlock()) && !me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.D(var14) && !me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.p(var14)) {
               continue;
            }
            var6.add(var9);
         }
      }
      Iterator<BlockPos> var15 = var6.iterator();
      if (!var15.hasNext()) {
         return null;
      }
      BlockPos var16 = var15.next();
      double var17 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var5, var16.getCenter());
      while (var15.hasNext()) {
         BlockPos var18 = var15.next();
         double var19 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var5, var18.getCenter());
         if (var17 > var19) {
            var16 = var18;
            var17 = var19;
         }
      }
      return var16;
   }

   private final void k() {
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.f();
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = (int)this.a(115L, 60L);
   }

   private final long a(long param1, long param3) {
      double var3 = me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().nextGaussian();
      double var8 = var3 > 0.0D ? var3 * (var3 * var3 * 0.45D) : 0.0D;
      return java.lang.Math.max((long)((double)param1 + var8 * (double)param3), 30L);
   }

   private final void l() {
      Object var7 = null; // PX-FIX
      String var10000 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = false;
      String var1 = var10000;

      try {
         label50: {
   pxClinit: {
            if (var1 != null) {
               var7 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
                  break label50;
               }
            }

            break pxClinit;
         }
}
      } catch (NoWhenBranchMatchedException var6) {
         throw (RuntimeException)a(var6);
      }

      IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 =((llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)( var7));
      boolean var3 = false;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.add(var2.a());
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;

      while (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.size() >= 20) {
         try {
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.remove(0);
            if (var1 == null) {
               return;
            }

            if (var1 == null) {
               break;
            }
         } catch (NoWhenBranchMatchedException var5) {
            throw (RuntimeException)a(var5);
         }
      }

      int var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII++;
   }

   private final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll m() {
      String var1 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var1 == null) {
         return null;
      }
      LocalPlayer var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
      if (var2 == null) {
         return null;
      }
      ClientLevel var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
      if (var3 == null) {
         return null;
      }
      BlockPos var4 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.s();
      for (int var5 = -6; var5 < 7; var5++) {
         for (int var6 = -6; var6 < 7; var6++) {
            for (int var7 = 0; var7 < 5; var7++) {
               BlockPos var8 = var4.offset(var5, var7, var6);
               Intrinsics.checkNotNullExpressionValue(var8, "offset(...)");
               Vec3 var9 = var8.getCenter();
               Intrinsics.checkNotNullExpressionValue(var9, "getCenter(...)");
               BlockState var10 = var3.getBlockState(var8);
               Intrinsics.checkNotNullExpressionValue(var10, "getBlockState(...)");
               if (!var10.is(Blocks.CHEST) && !var10.is(Blocks.TRAPPED_CHEST)) {
                  continue;
               }
               if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.contains(var8)) {
                  continue;
               }
               if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.contains(var8)) {
                  continue;
               }
               if (a(var3, var8)) {
                  continue;
               }
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  if (Math.abs(lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c() - 180.0F, 0.0F), lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var9)).a()) < 45.0F
                        && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((Entity)var2), var8.getCenter()) < 2.0D
                        && var7 != 0
                        && var7 <= 2) {
                     this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.add(var8);
                  }
                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.add(var8);
               } else {
                  if (me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(CollectionsKt.listOf("Jungle"), var9, -2.0D)
                        || !lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al()
                        || lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().al()) {
                     if (me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().I(), var9, -2.0D)
                           || !lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().al()) {
                        this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.add(var8);
                        this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.f();
                     } else {
                        this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.add(var8);
                     }
                  } else {
                     this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.add(var8);
                  }
               }
            }
         }
      }
      if (!this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.a((Number)300)
            && this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         return null;
      }
      Vec3 var11 = var2.getEyePosition();
      Intrinsics.checkNotNullExpressionValue(var11, "getEyePosition(...)");
      ArrayList<BlockPos> var12 = new ArrayList<BlockPos>();
      for (BlockPos var15 : this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
         if (!this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.contains(var15)
               && !var3.getBlockState(var15).isAir()
               && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var11, var15.getCenter()) < 144.0D) {
            var12.add(var15);
         }
      }
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new ArrayList<BlockPos>(var12);
      ArrayList<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var13 = new ArrayList<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>();
      Iterator<BlockPos> var14 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.iterator();
      Intrinsics.checkNotNullExpressionValue(var14, "iterator(...)");
      while (var14.hasNext()) {
         BlockPos var16 = var14.next();
         Intrinsics.checkNotNullExpressionValue(var16, "next(...)");
         BlockPos var17 = this.a(var16);
         if (var17 == null) {
            continue;
         }
         var13.add(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var16, var17));
      }
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var18 = null;
      Iterator<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> var19 = var13.iterator();
      if (var19.hasNext()) {
         var18 = var19.next();
         if (var19.hasNext()) {
            double var20 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var11, var18.b().getCenter());
            while (var19.hasNext()) {
               llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var21 = var19.next();
               double var22 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var11, var21.b().getCenter());
               if (var20 > var22) {
                  var18 = var21;
                  var20 = var22;
               }
            }
         }
      }
      return var18;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 1
      // 005: ifnull 022
      // 008: aload 0
      // 009: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 00c: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 00f: dup
      // 010: ifnonnull 024
      // 013: goto 01a
      // 016: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 019: athrow
      // 01a: pop
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 021: athrow
      // 022: aconst_null
      // 023: areturn
      // 024: astore 2
      // 025: aload 1
      // 026: ifnull 043
      // 029: aload 0
      // 02a: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 02d: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 030: dup
      // 031: ifnonnull 045
      // 034: goto 03b
      // 037: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03a: athrow
      // 03b: pop
      // 03c: goto 043
      // 03f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 042: athrow
      // 043: aconst_null
      // 044: areturn
      // 045: astore 3
      // 046: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 049: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.s ()Lnet/minecraft/core/BlockPos;
      // 04c: astore 4
      // 04e: bipush -6
      // 050: istore 5
      // 052: iload 5
      // 054: bipush 7
      // 056: if_icmpge 31a
      // 059: bipush -6
      // 05b: aload 1
      // 05c: ifnull 335
      // 05f: istore 6
      // 061: iload 6
      // 063: bipush 7
      // 065: if_icmpge 313
      // 068: bipush 0
      // 069: aload 1
      // 06a: ifnull 054
      // 06d: istore 7
      // 06f: iload 7
      // 071: bipush 5
      // 072: if_icmpge 30c
      // 075: aload 4
      // 077: iload 5
      // 079: iload 7
      // 07b: iload 6
      // 07d: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 080: dup
      // 081: sipush -19356
      // 084: sipush -1099
      // 087: pop2
      // 088: ldc_w "offset(...)"
      // 08b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 08e: astore 8
      // 090: aload 8
      // 092: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 095: dup
      // 096: sipush -19336
      // 099: sipush 16875
      // 09c: pop2
      // 09d: ldc_w "getCenter(...)"
      // 0a0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0a3: astore 9
      // 0a5: aload 3
      // 0a6: aload 8
      // 0a8: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0ab: dup
      // 0ac: sipush -19362
      // 0af: sipush -23441
      // 0b2: pop2
      // 0b3: ldc_w "getBlockState(...)"
      // 0b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b9: astore 10
      // 0bb: aload 10
      // 0bd: getstatic net/minecraft/world/level/block/Blocks.CHEST Lnet/minecraft/world/level/block/Block;
      // 0c0: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 0c3: aload 1
      // 0c4: ifnull 063
      // 0c7: aload 1
      // 0c8: ifnull 102
      // 0cb: ifne 0f2
      // 0ce: goto 0d5
      // 0d1: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d4: athrow
      // 0d5: aload 10
      // 0d7: getstatic net/minecraft/world/level/block/Blocks.TRAPPED_CHEST Lnet/minecraft/world/level/block/Block;
      // 0da: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 0dd: aload 1
      // 0de: ifnull 102
      // 0e1: goto 0e8
      // 0e4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e7: athrow
      // 0e8: ifeq 305
      // 0eb: goto 0f2
      // 0ee: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/ArrayList;
      // 0f6: aload 8
      // 0f8: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 0fb: goto 102
      // 0fe: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 101: athrow
      // 102: aload 1
      // 103: ifnull 120
      // 106: ifne 305
      // 109: goto 110
      // 10c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 114: aload 8
      // 116: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 119: goto 120
      // 11c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11f: athrow
      // 120: aload 1
      // 121: ifnull 13b
      // 124: ifne 305
      // 127: goto 12e
      // 12a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12d: athrow
      // 12e: aload 3
      // 12f: aload 8
      // 131: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;)Z
      // 134: goto 13b
      // 137: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13a: athrow
      // 13b: aload 1
      // 13c: ifnull 154
      // 13f: ifne 305
      // 142: goto 149
      // 145: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 148: athrow
      // 149: aload 0
      // 14a: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Z
      // 14d: goto 154
      // 150: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 153: athrow
      // 154: aload 1
      // 155: ifnull 247
      // 158: ifeq 228
      // 15b: goto 162
      // 15e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 161: athrow
      // 162: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 165: new me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI
      // 168: dup
      // 169: getstatic me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 16c: invokevirtual me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c ()F
      // 16f: ldc_w 180.0
      // 172: fsub
      // 173: fconst_0
      // 174: invokespecial me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.<init> (FF)V
      // 177: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 17a: aload 9
      // 17c: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 17f: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 182: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 185: invokestatic java/lang/Math.abs (F)F
      // 188: ldc_w 45.0
      // 18b: fcmpg
      // 18c: aload 1
      // 18d: ifnull 223
      // 190: goto 197
      // 193: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 196: athrow
      // 197: ifge 21a
      // 19a: goto 1a1
      // 19d: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a0: athrow
      // 1a1: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 1a4: aload 2
      // 1a5: checkcast net/minecraft/world/entity/Entity
      // 1a8: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 1ab: aload 8
      // 1ad: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 1b0: dup
      // 1b1: sipush -19336
      // 1b4: sipush 16875
      // 1b7: pop2
      // 1b8: ldc_w "getCenter(...)"
      // 1bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1be: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 1c1: ldc2_w 2.0
      // 1c4: dcmpg
      // 1c5: aload 1
      // 1c6: ifnull 223
      // 1c9: goto 1d0
      // 1cc: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1cf: athrow
      // 1d0: ifge 21a
      // 1d3: goto 1da
      // 1d6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d9: athrow
      // 1da: iload 7
      // 1dc: aload 1
      // 1dd: ifnull 223
      // 1e0: goto 1e7
      // 1e3: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1e6: athrow
      // 1e7: ifeq 21a
      // 1ea: goto 1f1
      // 1ed: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f0: athrow
      // 1f1: iload 7
      // 1f3: aload 1
      // 1f4: ifnull 223
      // 1f7: goto 1fe
      // 1fa: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1fd: athrow
      // 1fe: bipush 2
      // 1ff: if_icmpgt 21a
      // 202: goto 209
      // 205: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 208: athrow
      // 209: aload 0
      // 20a: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Ljava/util/ArrayList;
      // 20d: aload 8
      // 20f: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 212: pop
      // 213: goto 21a
      // 216: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 219: athrow
      // 21a: aload 0
      // 21b: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 21e: aload 8
      // 220: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 223: pop
      // 224: aload 1
      // 225: ifnonnull 305
      // 228: getstatic me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 22b: sipush -19334
      // 22e: sipush 19207
      // 231: pop2
      // 232: ldc_w "Jungle"
      // 235: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
      // 238: aload 9
      // 23a: ldc2_w -2.0
      // 23d: invokevirtual me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Ljava/util/List;Lnet/minecraft/world/phys/Vec3;D)Z
      // 240: goto 247
      // 243: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 246: athrow
      // 247: aload 1
      // 248: ifnull 2ac
      // 24b: ifne 291
      // 24e: goto 255
      // 251: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 254: athrow
      // 255: getstatic me/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI;
      // 258: invokevirtual me/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.a ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 25b: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 25e: aload 1
      // 25f: ifnull 2ac
      // 262: goto 269
      // 265: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 268: athrow
      // 269: ifeq 291
      // 26c: goto 273
      // 26f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 272: athrow
      // 273: getstatic me/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI;
      // 276: invokevirtual me/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.b ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 279: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 27c: aload 1
      // 27d: ifnull 2e8
      // 280: goto 287
      // 283: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 286: athrow
      // 287: ifeq 2d8
      // 28a: goto 291
      // 28d: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 290: athrow
      // 291: getstatic me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 294: getstatic me/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI;
      // 297: invokevirtual me/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.c ()Lme/octo/client/lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII;
      // 29a: invokevirtual me/octo/client/lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII.I ()Ljava/util/List;
      // 29d: aload 9
      // 29f: ldc2_w -2.0
      // 2a2: invokevirtual me/octo/client/utils/player/pathfinder/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Ljava/util/List;Lnet/minecraft/world/phys/Vec3;D)Z
      // 2a5: goto 2ac
      // 2a8: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2ab: athrow
      // 2ac: aload 1
      // 2ad: ifnull 2fd
      // 2b0: ifne 2ed
      // 2b3: goto 2ba
      // 2b6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2b9: athrow
      // 2ba: getstatic me/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI;
      // 2bd: invokevirtual me/octo/client/lIIIIIIlIIlIIIlIlIlIIlllllIIIIllIIIlIlIIlllIIIlIllIllIllIlllllIIllIlllIIlIlllIIlIlllI.b ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 2c0: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 2c3: aload 1
      // 2c4: ifnull 2fd
      // 2c7: goto 2ce
      // 2ca: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2cd: athrow
      // 2ce: ifeq 2ed
      // 2d1: goto 2d8
      // 2d4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2d7: athrow
      // 2d8: aload 0
      // 2d9: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 2dc: aload 8
      // 2de: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 2e1: goto 2e8
      // 2e4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2e7: athrow
      // 2e8: pop
      // 2e9: aload 1
      // 2ea: ifnonnull 305
      // 2ed: aload 0
      // 2ee: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/ArrayList;
      // 2f1: aload 8
      // 2f3: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 2f6: goto 2fd
      // 2f9: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2fc: athrow
      // 2fd: pop
      // 2fe: aload 0
      // 2ff: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 302: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 305: iinc 7 1
      // 308: aload 1
      // 309: ifnonnull 06f
      // 30c: iinc 6 1
      // 30f: aload 1
      // 310: ifnonnull 061
      // 313: iinc 5 1
      // 316: aload 1
      // 317: ifnonnull 052
      // 31a: aload 0
      // 31b: aload 1
      // 31c: ifnull 339
      // 31f: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 322: sipush 300
      // 325: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 328: checkcast java/lang/Number
      // 32b: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 32e: goto 335
      // 331: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 334: athrow
      // 335: ifne 348
      // 338: aload 0
      // 339: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 33c: getstatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 33f: if_acmpeq 348
      // 342: aconst_null
      // 343: areturn
      // 344: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 347: athrow
      // 348: aload 2
      // 349: invokevirtual net/minecraft/client/player/LocalPlayer.getEyePosition ()Lnet/minecraft/world/phys/Vec3;
      // 34c: dup
      // 34d: sipush -19331
      // 350: sipush -1760
      // 353: pop2
      // 354: ldc_w "getEyePosition(...)"
      // 357: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 35a: astore 5
      // 35c: aload 0
      // 35d: aload 0
      // 35e: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/ArrayList;
      // 361: checkcast java/lang/Iterable
      // 364: astore 6
      // 366: astore 17
      // 368: bipush 0
      // 369: istore 7
      // 36b: aload 6
      // 36d: astore 8
      // 36f: new java/util/ArrayList
      // 372: dup
      // 373: invokespecial java/util/ArrayList.<init> ()V
      // 376: checkcast java/util/Collection
      // 379: astore 9
      // 37b: bipush 0
      // 37c: istore 10
      // 37e: aload 8
      // 380: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 385: astore 11
      // 387: aload 11
      // 389: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 38e: ifeq 42e
      // 391: aload 11
      // 393: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 398: astore 13
      // 39a: aload 13
      // 39c: checkcast net/minecraft/core/BlockPos
      // 39f: astore 14
      // 3a1: bipush 0
      // 3a2: istore 16
      // 3a4: aload 0
      // 3a5: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Ljava/util/ArrayList;
      // 3a8: aload 1
      // 3a9: ifnull 454
      // 3ac: aload 14
      // 3ae: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 3b1: aload 1
      // 3b2: ifnull 3d6
      // 3b5: goto 3bc
      // 3b8: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3bb: athrow
      // 3bc: ifne 41c
      // 3bf: goto 3c6
      // 3c2: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3c5: athrow
      // 3c6: aload 3
      // 3c7: aload 14
      // 3c9: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 3cc: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 3cf: goto 3d6
      // 3d2: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3d5: athrow
      // 3d6: aload 1
      // 3d7: ifnull 40a
      // 3da: ifne 41c
      // 3dd: goto 3e4
      // 3e0: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3e3: athrow
      // 3e4: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 3e7: aload 5
      // 3e9: aload 14
      // 3eb: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 3ee: dup
      // 3ef: sipush -19336
      // 3f2: sipush 16875
      // 3f5: pop2
      // 3f6: ldc_w "getCenter(...)"
      // 3f9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3fc: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 3ff: ldc2_w 144.0
      // 402: dcmpg
      // 403: goto 40a
      // 406: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 409: athrow
      // 40a: aload 1
      // 40b: ifnull 419
      // 40e: ifge 41c
      // 411: goto 418
      // 414: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 417: athrow
      // 418: bipush 1
      // 419: goto 41d
      // 41c: bipush 0
      // 41d: ifeq 387
      // 420: aload 9
      // 422: aload 13
      // 424: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 429: pop
      // 42a: aload 1
      // 42b: ifnonnull 387
      // 42e: aload 9
      // 430: checkcast java/util/List
      // 433: nop
      // 434: aload 17
      // 436: swap
      // 437: checkcast java/lang/Iterable
      // 43a: new java/util/ArrayList
      // 43d: dup
      // 43e: invokespecial java/util/ArrayList.<init> ()V
      // 441: checkcast java/util/Collection
      // 444: invokestatic kotlin/collections/CollectionsKt.toCollection (Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;
      // 447: checkcast java/util/ArrayList
      // 44a: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/ArrayList;
      // 44d: new java/util/ArrayList
      // 450: dup
      // 451: invokespecial java/util/ArrayList.<init> ()V
      // 454: astore 6
      // 456: aload 0
      // 457: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Ljava/util/ArrayList;
      // 45a: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 45d: dup
      // 45e: sipush -19367
      // 461: sipush -31441
      // 464: pop2
      // 465: ldc_w "iterator(...)"
      // 468: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 46b: astore 7
      // 46d: aload 7
      // 46f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 474: ifeq 4c8
      // 477: aload 7
      // 479: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 47e: dup
      // 47f: sipush -19354
      // 482: sipush -23615
      // 485: pop2
      // 486: ldc_w "next(...)"
      // 489: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 48c: checkcast net/minecraft/core/BlockPos
      // 48f: astore 8
      // 491: aload 1
      // 492: ifnull 4ae
      // 495: aload 0
      // 496: aload 8
      // 498: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;
      // 49b: dup
      // 49c: ifnonnull 4b1
      // 49f: goto 4a6
      // 4a2: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4a5: athrow
      // 4a6: pop
      // 4a7: goto 4ae
      // 4aa: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4ad: athrow
      // 4ae: goto 46d
      // 4b1: astore 9
      // 4b3: aload 6
      // 4b5: new me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 4b8: dup
      // 4b9: aload 8
      // 4bb: aload 9
      // 4bd: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)V
      // 4c0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 4c3: pop
      // 4c4: aload 1
      // 4c5: ifnonnull 46d
      // 4c8: aload 6
      // 4ca: checkcast java/lang/Iterable
      // 4cd: astore 7
      // 4cf: bipush 0
      // 4d0: istore 8
      // 4d2: aload 7
      // 4d4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 4d9: astore 9
      // 4db: aload 9
      // 4dd: aload 1
      // 4de: ifnull 4ff
      // 4e1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4e6: ifne 4f8
      // 4e9: goto 4f0
      // 4ec: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4ef: athrow
      // 4f0: aconst_null
      // 4f1: goto 59e
      // 4f4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4f7: athrow
      // 4f8: aload 9
      // 4fa: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4ff: astore 10
      // 501: aload 9
      // 503: aload 1
      // 504: ifnull 521
      // 507: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 50c: ifne 51f
      // 50f: goto 516
      // 512: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 515: athrow
      // 516: aload 10
      // 518: goto 59e
      // 51b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 51e: athrow
      // 51f: aload 10
      // 521: checkcast me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 524: astore 11
      // 526: bipush 0
      // 527: istore 13
      // 529: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 52c: aload 5
      // 52e: aload 11
      // 530: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Lnet/minecraft/core/BlockPos;
      // 533: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 536: dup
      // 537: sipush -19336
      // 53a: sipush 16875
      // 53d: pop2
      // 53e: ldc_w "getCenter(...)"
      // 541: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 544: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.d (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 547: dstore 11
      // 549: aload 9
      // 54b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 550: astore 13
      // 552: aload 13
      // 554: checkcast me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 557: astore 14
      // 559: bipush 0
      // 55a: istore 16
      // 55c: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 55f: aload 5
      // 561: aload 14
      // 563: invokevirtual me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()Lnet/minecraft/core/BlockPos;
      // 566: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 569: dup
      // 56a: sipush -19336
      // 56d: sipush 16875
      // 570: pop2
      // 571: ldc_w "getCenter(...)"
      // 574: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 577: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.d (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 57a: dstore 14
      // 57c: dload 11
      // 57e: dload 14
      // 580: invokestatic java/lang/Double.compare (DD)I
      // 583: ifle 58e
      // 586: aload 13
      // 588: astore 10
      // 58a: dload 14
      // 58c: dstore 11
      // 58e: aload 9
      // 590: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 595: ifne 549
      // 598: aload 1
      // 599: ifnull 58a
      // 59c: aload 10
      // 59e: checkcast me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 5a1: areturn
   }

   private final BlockPos a(BlockPos param1) {
      String var2 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var2 == null) {
         return null;
      }
      LocalPlayer var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
      if (var3 == null) {
         return null;
      }
      ClientLevel var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
      if (var4 == null) {
         return null;
      }
      HashMap var5 = new HashMap();
      HashMap var6 = new HashMap();
      BlockPos var7 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.s();
      Vec3 var8 = me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((Entity)var3);
      if (this.a(param1, var8)) {
         return param1;
      }
      ArrayList var9 = new ArrayList();
      for (int var10 = -3; var10 < 4; var10++) {
         for (int var11 = -3; var11 < 4; var11++) {
            BlockPos var12 = new BlockPos(param1.getX() + var10, var7.getY(), param1.getZ() + var11);
            Vec3 var13 = var12.getCenter();
            Intrinsics.checkNotNullExpressionValue(var13, "getCenter(...)");
            if (!lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var8, var13, (Vec3)null, 0, false, 0.0, false, false, 0.0, 508, (Object)null)) {
               continue;
            }
            Vec3 var14 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var12).add(0.0, 1.27, 0.0);
            Intrinsics.checkNotNullExpressionValue(var14, "add(...)");
            Vec3 var15 = param1.getCenter();
            Intrinsics.checkNotNullExpressionValue(var15, "getCenter(...)");
            if (IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var14, var15) > 9.0) {
               continue;
            }
            Vec3 var16 = var8.add(0.0, -0.5, 0.0);
            Intrinsics.checkNotNullExpressionValue(var16, "add(...)");
            boolean var17 = false;
            for (BlockPos var18 : llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var16, var13)) {
               if (a(var5, var4, var18)) {
                  var17 = true;
                  break;
               }
            }
            if (var17) {
               continue;
            }
            Vec3 var19 = var8.add(0.0, 0.5, 0.0);
            Intrinsics.checkNotNullExpressionValue(var19, "add(...)");
            Vec3 var20 = var13.add(0.0, 1.0, 0.0);
            Intrinsics.checkNotNullExpressionValue(var20, "add(...)");
            Vec3 var21 = var8.add(0.0, 1.5, 0.0);
            Intrinsics.checkNotNullExpressionValue(var21, "add(...)");
            Vec3 var22 = var13.add(0.0, 2.0, 0.0);
            Intrinsics.checkNotNullExpressionValue(var22, "add(...)");
            boolean var23 = false;
            for (BlockPos var24 : CollectionsKt.plus(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var19, var20), llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var21, var22))) {
               if (b(var6, var4, var24)) {
                  var23 = true;
                  break;
               }
            }
            if (!var23) {
               var9.add(var12);
            }
         }
      }
      Iterator var25 = var9.iterator();
      if (!var25.hasNext()) {
         return null;
      }
      BlockPos var26 = (BlockPos)var25.next();
      while (var25.hasNext()) {
         BlockPos var27 = (BlockPos)var25.next();
         Vec3 var28 = var26.getCenter();
         Intrinsics.checkNotNullExpressionValue(var28, "getCenter(...)");
         double var29 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var8, var28);
         Vec3 var30 = var27.getCenter();
         Intrinsics.checkNotNullExpressionValue(var30, "getCenter(...)");
         double var31 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var8, var30);
         if (Double.compare(var29, var31) > 0) {
            var26 = var27;
         }
      }
      return var26;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 2
      // 005: ifnull 022
      // 008: aload 0
      // 009: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 00c: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 00f: dup
      // 010: ifnonnull 024
      // 013: goto 01a
      // 016: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 019: athrow
      // 01a: pop
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 021: athrow
      // 022: aconst_null
      // 023: areturn
      // 024: astore 3
      // 025: aload 2
      // 026: ifnull 043
      // 029: aload 0
      // 02a: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 02d: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 030: dup
      // 031: ifnonnull 045
      // 034: goto 03b
      // 037: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03a: athrow
      // 03b: pop
      // 03c: goto 043
      // 03f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 042: athrow
      // 043: aconst_null
      // 044: areturn
      // 045: astore 4
      // 047: new java/util/HashMap
      // 04a: dup
      // 04b: invokespecial java/util/HashMap.<init> ()V
      // 04e: astore 5
      // 050: new java/util/HashMap
      // 053: dup
      // 054: invokespecial java/util/HashMap.<init> ()V
      // 057: astore 6
      // 059: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 05c: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.s ()Lnet/minecraft/core/BlockPos;
      // 05f: astore 7
      // 061: aload 3
      // 062: checkcast net/minecraft/world/entity/Entity
      // 065: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 068: astore 8
      // 06a: aload 0
      // 06b: aload 1
      // 06c: aload 8
      // 06e: invokespecial me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Z
      // 071: ifeq 07a
      // 074: aload 1
      // 075: areturn
      // 076: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 079: athrow
      // 07a: new java/util/ArrayList
      // 07d: dup
      // 07e: invokespecial java/util/ArrayList.<init> ()V
      // 081: astore 9
      // 083: bipush -3
      // 085: istore 10
      // 087: iload 10
      // 089: bipush 4
      // 08a: if_icmpge 317
      // 08d: bipush -3
      // 08f: istore 11
      // 091: iload 11
      // 093: bipush 4
      // 094: if_icmpge 310
      // 097: new net/minecraft/core/BlockPos
      // 09a: dup
      // 09b: aload 1
      // 09c: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 09f: iload 10
      // 0a1: iadd
      // 0a2: aload 7
      // 0a4: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 0a7: aload 1
      // 0a8: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 0ab: iload 11
      // 0ad: iadd
      // 0ae: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 0b1: astore 12
      // 0b3: aload 12
      // 0b5: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 0b8: dup
      // 0b9: sipush -19336
      // 0bc: sipush 16875
      // 0bf: pop2
      // 0c0: ldc_w "getCenter(...)"
      // 0c3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c6: astore 13
      // 0c8: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 0cb: aload 8
      // 0cd: aload 13
      // 0cf: aconst_null
      // 0d0: bipush 0
      // 0d1: bipush 0
      // 0d2: dconst_0
      // 0d3: bipush 0
      // 0d4: bipush 0
      // 0d5: dconst_0
      // 0d6: sipush 508
      // 0d9: aconst_null
      // 0da: invokestatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IZDZZDILjava/lang/Object;)Z
      // 0dd: aload 2
      // 0de: ifnull 089
      // 0e1: aload 2
      // 0e2: ifnull 13b
      // 0e5: ifne 0fa
      // 0e8: goto 0ef
      // 0eb: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ee: athrow
      // 0ef: aload 2
      // 0f0: ifnonnull 309
      // 0f3: goto 0fa
      // 0f6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f9: athrow
      // 0fa: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0fd: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 100: aload 12
      // 102: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 105: dconst_0
      // 106: ldc2_w 1.27
      // 109: dconst_0
      // 10a: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 10d: dup
      // 10e: sipush -19344
      // 111: sipush -24090
      // 114: pop2
      // 115: ldc_w "add(...)"
      // 118: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 11b: aload 1
      // 11c: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 11f: dup
      // 120: sipush -19336
      // 123: sipush 16875
      // 126: pop2
      // 127: ldc_w "getCenter(...)"
      // 12a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 12d: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 130: ldc2_w 9.0
      // 133: dcmpl
      // 134: goto 13b
      // 137: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13a: athrow
      // 13b: ifle 149
      // 13e: aload 2
      // 13f: ifnonnull 309
      // 142: goto 149
      // 145: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 148: athrow
      // 149: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 14c: aload 8
      // 14e: dconst_0
      // 14f: ldc2_w -0.5
      // 152: dconst_0
      // 153: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 156: dup
      // 157: sipush -19344
      // 15a: sipush -24090
      // 15d: pop2
      // 15e: ldc_w "add(...)"
      // 161: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 164: aload 13
      // 166: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/ArrayList;
      // 169: astore 14
      // 16b: aload 14
      // 16d: checkcast java/lang/Iterable
      // 170: astore 16
      // 172: bipush 0
      // 173: istore 17
      // 175: aload 16
      // 177: aload 2
      // 178: ifnull 1b1
      // 17b: instanceof java/util/Collection
      // 17e: ifeq 1af
      // 181: goto 188
      // 184: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 187: athrow
      // 188: aload 16
      // 18a: checkcast java/util/Collection
      // 18d: aload 2
      // 18e: ifnull 1b1
      // 191: goto 198
      // 194: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 197: athrow
      // 198: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 19d: ifeq 1af
      // 1a0: goto 1a7
      // 1a3: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a6: athrow
      // 1a7: bipush 0
      // 1a8: goto 1ea
      // 1ab: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ae: athrow
      // 1af: aload 16
      // 1b1: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1b6: astore 19
      // 1b8: aload 19
      // 1ba: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1bf: ifeq 1e9
      // 1c2: aload 19
      // 1c4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c9: astore 20
      // 1cb: aload 20
      // 1cd: checkcast net/minecraft/core/BlockPos
      // 1d0: astore 21
      // 1d2: bipush 0
      // 1d3: istore 22
      // 1d5: aload 5
      // 1d7: aload 4
      // 1d9: aload 21
      // 1db: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Ljava/util/HashMap;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;)Z
      // 1de: ifeq 1b8
      // 1e1: bipush 1
      // 1e2: aload 2
      // 1e3: ifnull 1de
      // 1e6: goto 1ea
      // 1e9: bipush 0
      // 1ea: ifeq 1f8
      // 1ed: aload 2
      // 1ee: ifnonnull 309
      // 1f1: goto 1f8
      // 1f4: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f7: athrow
      // 1f8: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 1fb: aload 8
      // 1fd: dconst_0
      // 1fe: ldc2_w 0.5
      // 201: dconst_0
      // 202: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 205: dup
      // 206: sipush -19344
      // 209: sipush -24090
      // 20c: pop2
      // 20d: ldc_w "add(...)"
      // 210: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 213: aload 13
      // 215: dconst_0
      // 216: dconst_1
      // 217: dconst_0
      // 218: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 21b: dup
      // 21c: sipush -19344
      // 21f: sipush -24090
      // 222: pop2
      // 223: ldc_w "add(...)"
      // 226: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 229: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/ArrayList;
      // 22c: checkcast java/util/Collection
      // 22f: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 232: aload 8
      // 234: dconst_0
      // 235: ldc2_w 1.5
      // 238: dconst_0
      // 239: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 23c: dup
      // 23d: sipush -19344
      // 240: sipush -24090
      // 243: pop2
      // 244: ldc_w "add(...)"
      // 247: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 24a: aload 13
      // 24c: dconst_0
      // 24d: ldc2_w 2.0
      // 250: dconst_0
      // 251: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 254: dup
      // 255: sipush -19344
      // 258: sipush -24090
      // 25b: pop2
      // 25c: ldc_w "add(...)"
      // 25f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 262: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/ArrayList;
      // 265: checkcast java/lang/Iterable
      // 268: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 26b: astore 16
      // 26d: aload 16
      // 26f: checkcast java/lang/Iterable
      // 272: astore 17
      // 274: bipush 0
      // 275: istore 19
      // 277: aload 17
      // 279: aload 2
      // 27a: ifnull 2b3
      // 27d: instanceof java/util/Collection
      // 280: ifeq 2b1
      // 283: goto 28a
      // 286: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 289: athrow
      // 28a: aload 17
      // 28c: checkcast java/util/Collection
      // 28f: aload 2
      // 290: ifnull 2b3
      // 293: goto 29a
      // 296: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 299: athrow
      // 29a: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 29f: ifeq 2b1
      // 2a2: goto 2a9
      // 2a5: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2a8: athrow
      // 2a9: bipush 0
      // 2aa: goto 2ec
      // 2ad: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2b0: athrow
      // 2b1: aload 17
      // 2b3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2b8: astore 20
      // 2ba: aload 20
      // 2bc: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2c1: ifeq 2eb
      // 2c4: aload 20
      // 2c6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2cb: astore 21
      // 2cd: aload 21
      // 2cf: checkcast net/minecraft/core/BlockPos
      // 2d2: astore 22
      // 2d4: bipush 0
      // 2d5: istore 23
      // 2d7: aload 6
      // 2d9: aload 4
      // 2db: aload 22
      // 2dd: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.b (Ljava/util/HashMap;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/core/BlockPos;)Z
      // 2e0: ifeq 2ba
      // 2e3: bipush 1
      // 2e4: aload 2
      // 2e5: ifnull 2e0
      // 2e8: goto 2ec
      // 2eb: bipush 0
      // 2ec: ifeq 2fa
      // 2ef: aload 2
      // 2f0: ifnonnull 309
      // 2f3: goto 2fa
      // 2f6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2f9: athrow
      // 2fa: aload 9
      // 2fc: aload 12
      // 2fe: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 301: pop
      // 302: goto 309
      // 305: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 308: athrow
      // 309: iinc 11 1
      // 30c: aload 2
      // 30d: ifnonnull 091
      // 310: iinc 10 1
      // 313: aload 2
      // 314: ifnonnull 087
      // 317: aload 9
      // 319: checkcast java/lang/Iterable
      // 31c: astore 10
      // 31e: bipush 0
      // 31f: istore 11
      // 321: aload 10
      // 323: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 328: astore 12
      // 32a: aload 12
      // 32c: aload 2
      // 32d: ifnull 34e
      // 330: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 335: ifne 347
      // 338: goto 33f
      // 33b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 33e: athrow
      // 33f: aconst_null
      // 340: goto 3e7
      // 343: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 346: athrow
      // 347: aload 12
      // 349: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 34e: astore 13
      // 350: aload 12
      // 352: aload 2
      // 353: ifnull 370
      // 356: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 35b: ifne 36e
      // 35e: goto 365
      // 361: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 364: athrow
      // 365: aload 13
      // 367: goto 3e7
      // 36a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 36d: athrow
      // 36e: aload 13
      // 370: checkcast net/minecraft/core/BlockPos
      // 373: astore 14
      // 375: bipush 0
      // 376: istore 16
      // 378: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 37b: aload 8
      // 37d: aload 14
      // 37f: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 382: dup
      // 383: sipush -19336
      // 386: sipush 16875
      // 389: pop2
      // 38a: ldc_w "getCenter(...)"
      // 38d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 390: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.d (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 393: dstore 14
      // 395: aload 12
      // 397: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 39c: astore 16
      // 39e: aload 16
      // 3a0: checkcast net/minecraft/core/BlockPos
      // 3a3: astore 17
      // 3a5: bipush 0
      // 3a6: istore 19
      // 3a8: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 3ab: aload 8
      // 3ad: aload 17
      // 3af: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 3b2: dup
      // 3b3: sipush -19336
      // 3b6: sipush 16875
      // 3b9: pop2
      // 3ba: ldc_w "getCenter(...)"
      // 3bd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3c0: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.d (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 3c3: dstore 17
      // 3c5: dload 14
      // 3c7: dload 17
      // 3c9: invokestatic java/lang/Double.compare (DD)I
      // 3cc: ifle 3d7
      // 3cf: aload 16
      // 3d1: astore 13
      // 3d3: dload 17
      // 3d5: dstore 14
      // 3d7: aload 12
      // 3d9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3de: ifne 395
      // 3e1: aload 2
      // 3e2: ifnull 3d3
      // 3e5: aload 13
      // 3e7: checkcast net/minecraft/core/BlockPos
      // 3ea: areturn
   }

   private final boolean a(BlockPos param1, Vec3 param2) {
      // decoy String getter and its `aload_3; ifnull` folds dropped (COMMON decoy family).
      ClientLevel var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
      if (var4 == null) {
         return false;
      }
      BlockPos var5 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.s();
      BlockPos var6 = new BlockPos(param1.getX(), var5.getY(), param1.getZ());
      Vec3 var7 = var6.getCenter();
      ArrayList<BlockPos> var8 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param2.add(0.0, -0.5, 0.0), var7);
      for (BlockPos var13 : var8) {
         BlockState var15 = var4.getBlockState(var13);
         if (var15.isAir() || !var15.getFluidState().isEmpty() || var15.getCollisionShape(var4, var13).isEmpty()) {
            return false;
         }
      }
      List<BlockPos> var9 = kotlin.collections.CollectionsKt.plus(
         llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param2.add(0.0, 0.5, 0.0), var7.add(0.0, 1.0, 0.0)),
         llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param2.add(0.0, 1.5, 0.0), var7.add(0.0, 2.0, 0.0))
      );
      for (BlockPos var14 : var9) {
         BlockState var16 = var4.getBlockState(var14);
         if (!var16.isAir() && !var14.equals(var6)) {
            return false;
         }
      }
      return true;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 3
      // 005: ifnull 022
      // 008: aload 0
      // 009: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 00c: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 00f: dup
      // 010: ifnonnull 024
      // 013: goto 01a
      // 016: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 019: athrow
      // 01a: pop
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 021: athrow
      // 022: bipush 0
      // 023: ireturn
      // 024: astore 4
      // 026: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 029: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.s ()Lnet/minecraft/core/BlockPos;
      // 02c: astore 5
      // 02e: new net/minecraft/core/BlockPos
      // 031: dup
      // 032: aload 1
      // 033: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 036: aload 5
      // 038: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 03b: aload 1
      // 03c: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 03f: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 042: astore 6
      // 044: aload 6
      // 046: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 049: dup
      // 04a: sipush -19336
      // 04d: sipush 16875
      // 050: pop2
      // 051: ldc_w "getCenter(...)"
      // 054: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 057: astore 7
      // 059: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 05c: aload 2
      // 05d: dconst_0
      // 05e: ldc2_w -0.5
      // 061: dconst_0
      // 062: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 065: dup
      // 066: sipush -19344
      // 069: sipush -24090
      // 06c: pop2
      // 06d: ldc_w "add(...)"
      // 070: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 073: aload 7
      // 075: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/ArrayList;
      // 078: astore 8
      // 07a: aload 8
      // 07c: checkcast java/lang/Iterable
      // 07f: astore 9
      // 081: bipush 0
      // 082: istore 10
      // 084: aload 9
      // 086: aload 3
      // 087: ifnull 0c0
      // 08a: instanceof java/util/Collection
      // 08d: ifeq 0be
      // 090: goto 097
      // 093: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 096: athrow
      // 097: aload 9
      // 099: checkcast java/util/Collection
      // 09c: aload 3
      // 09d: ifnull 0c0
      // 0a0: goto 0a7
      // 0a3: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a6: athrow
      // 0a7: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0ac: ifeq 0be
      // 0af: goto 0b6
      // 0b2: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b5: athrow
      // 0b6: bipush 0
      // 0b7: goto 159
      // 0ba: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bd: athrow
      // 0be: aload 9
      // 0c0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0c5: astore 11
      // 0c7: aload 11
      // 0c9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ce: ifeq 158
      // 0d1: aload 11
      // 0d3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d8: astore 12
      // 0da: aload 12
      // 0dc: checkcast net/minecraft/core/BlockPos
      // 0df: astore 13
      // 0e1: bipush 0
      // 0e2: istore 14
      // 0e4: aload 4
      // 0e6: aload 13
      // 0e8: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0eb: dup
      // 0ec: sipush -19362
      // 0ef: sipush -23441
      // 0f2: pop2
      // 0f3: ldc_w "getBlockState(...)"
      // 0f6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f9: astore 15
      // 0fb: aload 15
      // 0fd: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 100: aload 3
      // 101: ifnull 149
      // 104: ifne 148
      // 107: aload 15
      // 109: invokevirtual net/minecraft/world/level/block/state/BlockState.getFluidState ()Lnet/minecraft/world/level/material/FluidState;
      // 10c: invokevirtual net/minecraft/world/level/material/FluidState.isEmpty ()Z
      // 10f: aload 3
      // 110: ifnull 149
      // 113: goto 11a
      // 116: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 119: athrow
      // 11a: ifeq 148
      // 11d: goto 124
      // 120: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 123: athrow
      // 124: aload 15
      // 126: aload 4
      // 128: checkcast net/minecraft/world/level/BlockGetter
      // 12b: aload 13
      // 12d: invokevirtual net/minecraft/world/level/block/state/BlockState.getCollisionShape (Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;
      // 130: invokevirtual net/minecraft/world/phys/shapes/VoxelShape.isEmpty ()Z
      // 133: aload 3
      // 134: ifnull 149
      // 137: goto 13e
      // 13a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13d: athrow
      // 13e: ifeq 14c
      // 141: goto 148
      // 144: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 147: athrow
      // 148: bipush 1
      // 149: goto 14d
      // 14c: bipush 0
      // 14d: ifeq 0c7
      // 150: bipush 1
      // 151: aload 3
      // 152: ifnull 100
      // 155: goto 159
      // 158: bipush 0
      // 159: ifeq 162
      // 15c: bipush 0
      // 15d: ireturn
      // 15e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 161: athrow
      // 162: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 165: aload 2
      // 166: dconst_0
      // 167: ldc2_w 0.5
      // 16a: dconst_0
      // 16b: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 16e: dup
      // 16f: sipush -19344
      // 172: sipush -24090
      // 175: pop2
      // 176: ldc_w "add(...)"
      // 179: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 17c: aload 7
      // 17e: dconst_0
      // 17f: dconst_1
      // 180: dconst_0
      // 181: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 184: dup
      // 185: sipush -19344
      // 188: sipush -24090
      // 18b: pop2
      // 18c: ldc_w "add(...)"
      // 18f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 192: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/ArrayList;
      // 195: checkcast java/util/Collection
      // 198: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 19b: aload 2
      // 19c: dconst_0
      // 19d: ldc2_w 1.5
      // 1a0: dconst_0
      // 1a1: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 1a4: dup
      // 1a5: sipush -19344
      // 1a8: sipush -24090
      // 1ab: pop2
      // 1ac: ldc_w "add(...)"
      // 1af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1b2: aload 7
      // 1b4: dconst_0
      // 1b5: ldc2_w 2.0
      // 1b8: dconst_0
      // 1b9: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 1bc: dup
      // 1bd: sipush -19344
      // 1c0: sipush -24090
      // 1c3: pop2
      // 1c4: ldc_w "add(...)"
      // 1c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1ca: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/ArrayList;
      // 1cd: checkcast java/lang/Iterable
      // 1d0: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 1d3: astore 9
      // 1d5: aload 9
      // 1d7: checkcast java/lang/Iterable
      // 1da: astore 10
      // 1dc: bipush 0
      // 1dd: istore 11
      // 1df: aload 10
      // 1e1: aload 3
      // 1e2: ifnull 21b
      // 1e5: instanceof java/util/Collection
      // 1e8: ifeq 219
      // 1eb: goto 1f2
      // 1ee: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f1: athrow
      // 1f2: aload 10
      // 1f4: checkcast java/util/Collection
      // 1f7: aload 3
      // 1f8: ifnull 21b
      // 1fb: goto 202
      // 1fe: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 201: athrow
      // 202: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 207: ifeq 219
      // 20a: goto 211
      // 20d: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 210: athrow
      // 211: bipush 0
      // 212: goto 28f
      // 215: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 218: athrow
      // 219: aload 10
      // 21b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 220: astore 12
      // 222: aload 12
      // 224: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 229: ifeq 28e
      // 22c: aload 12
      // 22e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 233: astore 13
      // 235: aload 13
      // 237: checkcast net/minecraft/core/BlockPos
      // 23a: astore 14
      // 23c: bipush 0
      // 23d: istore 15
      // 23f: aload 4
      // 241: aload 14
      // 243: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 246: dup
      // 247: sipush -19362
      // 24a: sipush -23441
      // 24d: pop2
      // 24e: ldc_w "getBlockState(...)"
      // 251: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 254: astore 16
      // 256: aload 16
      // 258: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 25b: aload 3
      // 25c: ifnull 270
      // 25f: ifne 282
      // 262: aload 14
      // 264: aload 6
      // 266: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 269: goto 270
      // 26c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 26f: athrow
      // 270: aload 3
      // 271: ifnull 27f
      // 274: ifne 282
      // 277: goto 27e
      // 27a: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 27d: athrow
      // 27e: bipush 1
      // 27f: goto 283
      // 282: bipush 0
      // 283: ifeq 222
      // 286: bipush 1
      // 287: aload 3
      // 288: ifnull 25b
      // 28b: goto 28f
      // 28e: bipush 0
      // 28f: ifne 29a
      // 292: bipush 1
      // 293: goto 29b
      // 296: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 299: athrow
      // 29a: bipush 0
      // 29b: ireturn
   }

   private final boolean a(ArrayList<Vec3> param1, int param2) {
      String var3 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var3 == null) {
         return false;
      }
      ClientLevel var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
      if (var4 == null) {
         return false;
      }
      LocalPlayer var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
      if (var5 == null) {
         return false;
      }
      Vec3 var6 = me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((Entity)var5);
      if (CollectionsKt.last(param1).y < var6.y - 0.5) {
         return true;
      }
      int var7 = 0;
      for (Vec3 var12 : param1) {
         double var14 = var12.x - 0.3;
         double var16 = var12.x + 0.3;
         double var18 = var12.z - 0.3;
         double var20 = var12.z + 0.3;
         double var22 = var12.y + 0.01;
         List<BlockPos> var25 = CollectionsKt.distinct(CollectionsKt.listOf(new BlockPos[]{BlockPos.containing(var14, var22, var18), BlockPos.containing(var14, var22, var20), BlockPos.containing(var16, var22, var18), BlockPos.containing(var16, var22, var20)}));
         int var28 = 0;
         for (BlockPos var31 : var25) {
            BlockState var33 = var4.getBlockState(var31);
            Intrinsics.checkNotNullExpressionValue(var33, "getBlockState(...)");
            net.minecraft.world.level.block.Block var34 = var33.getBlock();
            Intrinsics.checkNotNullExpressionValue(var34, "getBlock(...)");
            if (!IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var34) && !var33.isAir()) {
               if (++var28 < 0) {
                  CollectionsKt.throwCountOverflow();
               }
            }
         }
         if (var28 >= 1) {
            var7++;
         }
         if (var7 == param2) {
            return true;
         }
      }
      return false;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 3
      // 005: ifnull 022
      // 008: aload 0
      // 009: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 00c: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 00f: dup
      // 010: ifnonnull 024
      // 013: goto 01a
      // 016: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 019: athrow
      // 01a: pop
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 021: athrow
      // 022: bipush 0
      // 023: ireturn
      // 024: astore 4
      // 026: aload 3
      // 027: ifnull 044
      // 02a: aload 0
      // 02b: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 02e: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 031: dup
      // 032: ifnonnull 046
      // 035: goto 03c
      // 038: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03b: athrow
      // 03c: pop
      // 03d: goto 044
      // 040: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 043: athrow
      // 044: bipush 0
      // 045: ireturn
      // 046: astore 5
      // 048: aload 5
      // 04a: checkcast net/minecraft/world/entity/Entity
      // 04d: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 050: astore 6
      // 052: aload 1
      // 053: checkcast java/util/List
      // 056: invokestatic kotlin/collections/CollectionsKt.last (Ljava/util/List;)Ljava/lang/Object;
      // 059: checkcast net/minecraft/world/phys/Vec3
      // 05c: getfield net/minecraft/world/phys/Vec3.y D
      // 05f: aload 6
      // 061: getfield net/minecraft/world/phys/Vec3.y D
      // 064: ldc2_w 0.5
      // 067: dsub
      // 068: dcmpg
      // 069: aload 3
      // 06a: ifnull 07e
      // 06d: ifge 07d
      // 070: goto 077
      // 073: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 076: athrow
      // 077: bipush 1
      // 078: ireturn
      // 079: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 07c: athrow
      // 07d: bipush 0
      // 07e: istore 7
      // 080: aload 1
      // 081: checkcast java/lang/Iterable
      // 084: astore 8
      // 086: bipush 0
      // 087: istore 9
      // 089: aload 8
      // 08b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 090: astore 10
      // 092: aload 10
      // 094: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 099: ifeq 271
      // 09c: aload 10
      // 09e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a3: astore 11
      // 0a5: aload 11
      // 0a7: checkcast net/minecraft/world/phys/Vec3
      // 0aa: astore 12
      // 0ac: bipush 0
      // 0ad: istore 13
      // 0af: aload 12
      // 0b1: getfield net/minecraft/world/phys/Vec3.x D
      // 0b4: ldc2_w 0.3
      // 0b7: dsub
      // 0b8: dstore 14
      // 0ba: aload 12
      // 0bc: getfield net/minecraft/world/phys/Vec3.x D
      // 0bf: ldc2_w 0.3
      // 0c2: dadd
      // 0c3: dstore 16
      // 0c5: aload 12
      // 0c7: getfield net/minecraft/world/phys/Vec3.z D
      // 0ca: ldc2_w 0.3
      // 0cd: dsub
      // 0ce: dstore 18
      // 0d0: aload 12
      // 0d2: getfield net/minecraft/world/phys/Vec3.z D
      // 0d5: ldc2_w 0.3
      // 0d8: dadd
      // 0d9: dstore 20
      // 0db: aload 12
      // 0dd: getfield net/minecraft/world/phys/Vec3.y D
      // 0e0: ldc2_w 0.01
      // 0e3: dadd
      // 0e4: dstore 22
      // 0e6: bipush 4
      // 0e7: anewarray 257
      // 0ea: astore 24
      // 0ec: aload 24
      // 0ee: bipush 0
      // 0ef: dload 14
      // 0f1: dload 22
      // 0f3: dload 18
      // 0f5: invokestatic net/minecraft/core/BlockPos.containing (DDD)Lnet/minecraft/core/BlockPos;
      // 0f8: aastore
      // 0f9: aload 24
      // 0fb: bipush 1
      // 0fc: dload 14
      // 0fe: dload 22
      // 100: dload 20
      // 102: invokestatic net/minecraft/core/BlockPos.containing (DDD)Lnet/minecraft/core/BlockPos;
      // 105: aastore
      // 106: aload 24
      // 108: bipush 2
      // 109: dload 16
      // 10b: dload 22
      // 10d: dload 18
      // 10f: invokestatic net/minecraft/core/BlockPos.containing (DDD)Lnet/minecraft/core/BlockPos;
      // 112: aastore
      // 113: aload 24
      // 115: bipush 3
      // 116: dload 16
      // 118: dload 22
      // 11a: dload 20
      // 11c: invokestatic net/minecraft/core/BlockPos.containing (DDD)Lnet/minecraft/core/BlockPos;
      // 11f: aastore
      // 120: aload 24
      // 122: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 125: checkcast java/lang/Iterable
      // 128: invokestatic kotlin/collections/CollectionsKt.distinct (Ljava/lang/Iterable;)Ljava/util/List;
      // 12b: astore 25
      // 12d: aload 25
      // 12f: checkcast java/lang/Iterable
      // 132: astore 26
      // 134: bipush 0
      // 135: istore 27
      // 137: aload 26
      // 139: instanceof java/util/Collection
      // 13c: aload 3
      // 13d: ifnull 273
      // 140: aload 3
      // 141: ifnull 17d
      // 144: goto 14b
      // 147: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14a: athrow
      // 14b: ifeq 17c
      // 14e: goto 155
      // 151: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 154: athrow
      // 155: aload 26
      // 157: checkcast java/util/Collection
      // 15a: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 15f: aload 3
      // 160: ifnull 17d
      // 163: goto 16a
      // 166: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 169: athrow
      // 16a: ifeq 17c
      // 16d: goto 174
      // 170: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 173: athrow
      // 174: bipush 0
      // 175: goto 22c
      // 178: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 17b: athrow
      // 17c: bipush 0
      // 17d: istore 28
      // 17f: aload 26
      // 181: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 186: astore 29
      // 188: aload 29
      // 18a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18f: ifeq 22a
      // 192: aload 29
      // 194: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 199: astore 30
      // 19b: aload 30
      // 19d: checkcast net/minecraft/core/BlockPos
      // 1a0: astore 31
      // 1a2: bipush 0
      // 1a3: istore 32
      // 1a5: aload 4
      // 1a7: aload 31
      // 1a9: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 1ac: dup
      // 1ad: sipush -19362
      // 1b0: sipush -23441
      // 1b3: pop2
      // 1b4: ldc_w "getBlockState(...)"
      // 1b7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1ba: astore 33
      // 1bc: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 1bf: aload 33
      // 1c1: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 1c4: dup
      // 1c5: sipush -19343
      // 1c8: sipush 20460
      // 1cb: pop2
      // 1cc: ldc_w "getBlock(...)"
      // 1cf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1d2: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.a (Lnet/minecraft/world/level/block/Block;)Z
      // 1d5: aload 3
      // 1d6: ifnull 22c
      // 1d9: aload 3
      // 1da: ifnull 1fa
      // 1dd: goto 1e4
      // 1e0: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1e3: athrow
      // 1e4: ifne 20c
      // 1e7: goto 1ee
      // 1ea: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ed: athrow
      // 1ee: aload 33
      // 1f0: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 1f3: goto 1fa
      // 1f6: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f9: athrow
      // 1fa: aload 3
      // 1fb: ifnull 209
      // 1fe: ifne 20c
      // 201: goto 208
      // 204: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 207: athrow
      // 208: bipush 1
      // 209: goto 20d
      // 20c: bipush 0
      // 20d: ifeq 188
      // 210: iinc 28 1
      // 213: aload 3
      // 214: ifnull 226
      // 217: iload 28
      // 219: ifge 188
      // 21c: goto 223
      // 21f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 222: athrow
      // 223: invokestatic kotlin/collections/CollectionsKt.throwCountOverflow ()V
      // 226: aload 3
      // 227: ifnonnull 188
      // 22a: iload 28
      // 22c: bipush 1
      // 22d: if_icmplt 238
      // 230: bipush 1
      // 231: goto 239
      // 234: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 237: athrow
      // 238: bipush 0
      // 239: istore 24
      // 23b: iload 24
      // 23d: aload 3
      // 23e: ifnull 253
      // 241: ifeq 251
      // 244: goto 24b
      // 247: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 24a: athrow
      // 24b: iload 7
      // 24d: bipush 1
      // 24e: iadd
      // 24f: istore 7
      // 251: iload 7
      // 253: aload 3
      // 254: ifnull 26a
      // 257: iload 2
      // 258: if_icmpne 26b
      // 25b: goto 262
      // 25e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 261: athrow
      // 262: bipush 1
      // 263: goto 26a
      // 266: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 269: athrow
      // 26a: ireturn
      // 26b: nop
      // 26c: nop
      // 26d: aload 3
      // 26e: ifnonnull 092
      // 271: nop
      // 272: bipush 0
      // 273: ireturn
   }

   private final Float b(BlockPos param1) {
      LocalPlayer var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
      if (var3 == null) {
         return null;
      }
      ClientLevel var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.level;
      if (var4 == null) {
         return null;
      }
      Vec3 var5 = var3.getEyePosition();
      var var6 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1);
      BlockPos var7 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.s();
      ArrayList<BlockPos> var8 = new ArrayList<>();
      for (int var9 = -6; var9 < 7; var9++) {
         for (int var10 = -6; var10 < 7; var10++) {
            for (int var11 = 1; var11 < 4; var11++) {
               BlockPos var12 = var7.offset(var9, var11, var10);
               Vec3 var13 = var12.getCenter();
               var var14 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var13);
               if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4.getBlockState(var12).getBlock())
                     && Math.abs(me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var6, var14).a()) < 45.0F
                     && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var5, var13) < 4.0D
                     && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var5, var13) > 1.0D
                     && me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var12, CollectionsKt.emptyList(), me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a())) {
                  var8.add(var12);
               }
            }
         }
      }
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = (List)var8;
      if (var8.isEmpty()) {
         return null;
      }
      float var9 = 0.0F;
      float var10 = 0.0F;
      for (BlockPos var12 : var8) {
         Vec3 var13 = new Vec3(var12.getX() + 0.5D, var12.getY() + 0.2D, var12.getZ() + 0.5D);
         float var14 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var13).b();
         float var15 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var13.add(0.0D, 0.6D, 0.0D)).b();
         var10 += 1.0F;
         var9 += (var14 - var9) / var10;
         var10 += 1.0F;
         var9 += (var15 - var9) / var10;
      }
      return var9;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 2
      // 005: ifnull 022
      // 008: aload 0
      // 009: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 00c: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 00f: dup
      // 010: ifnonnull 024
      // 013: goto 01a
      // 016: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 019: athrow
      // 01a: pop
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 021: athrow
      // 022: aconst_null
      // 023: areturn
      // 024: astore 3
      // 025: aload 2
      // 026: ifnull 043
      // 029: aload 0
      // 02a: getfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 02d: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 030: dup
      // 031: ifnonnull 045
      // 034: goto 03b
      // 037: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03a: athrow
      // 03b: pop
      // 03c: goto 043
      // 03f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 042: athrow
      // 043: aconst_null
      // 044: areturn
      // 045: astore 4
      // 047: aload 3
      // 048: invokevirtual net/minecraft/client/player/LocalPlayer.getEyePosition ()Lnet/minecraft/world/phys/Vec3;
      // 04b: dup
      // 04c: sipush -19352
      // 04f: sipush 21258
      // 052: pop2
      // 053: ldc_w "getEyePosition(...)"
      // 056: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 059: astore 5
      // 05b: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 05e: aload 1
      // 05f: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/core/BlockPos;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 062: astore 6
      // 064: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 067: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.s ()Lnet/minecraft/core/BlockPos;
      // 06a: astore 7
      // 06c: new java/util/ArrayList
      // 06f: dup
      // 070: invokespecial java/util/ArrayList.<init> ()V
      // 073: astore 8
      // 075: bipush -6
      // 077: istore 9
      // 079: iload 9
      // 07b: bipush 7
      // 07d: if_icmpge 1b9
      // 080: bipush -6
      // 082: aload 2
      // 083: ifnull 1c7
      // 086: istore 10
      // 088: iload 10
      // 08a: bipush 7
      // 08c: if_icmpge 1b2
      // 08f: bipush 1
      // 090: aload 2
      // 091: ifnull 07b
      // 094: istore 11
      // 096: iload 11
      // 098: bipush 4
      // 099: if_icmpge 1ab
      // 09c: aload 7
      // 09e: iload 9
      // 0a0: iload 11
      // 0a2: iload 10
      // 0a4: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 0a7: dup
      // 0a8: sipush -19356
      // 0ab: sipush -1099
      // 0ae: pop2
      // 0af: ldc_w "offset(...)"
      // 0b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b5: astore 12
      // 0b7: aload 12
      // 0b9: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 0bc: dup
      // 0bd: sipush -19336
      // 0c0: sipush 16875
      // 0c3: pop2
      // 0c4: ldc_w "getCenter(...)"
      // 0c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ca: astore 13
      // 0cc: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 0cf: aload 13
      // 0d1: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 0d4: astore 14
      // 0d6: aload 2
      // 0d7: ifnull 1a7
      // 0da: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 0dd: aload 4
      // 0df: aload 12
      // 0e1: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 0e4: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 0e7: dup
      // 0e8: sipush -19349
      // 0eb: sipush 7149
      // 0ee: pop2
      // 0ef: ldc_w "getBlock(...)"
      // 0f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f5: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.a (Lnet/minecraft/world/level/block/Block;)Z
      // 0f8: aload 2
      // 0f9: ifnull 08a
      // 0fc: goto 103
      // 0ff: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 102: athrow
      // 103: ifeq 1a4
      // 106: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 109: aload 6
      // 10b: aload 14
      // 10d: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 110: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 113: invokestatic java/lang/Math.abs (F)F
      // 116: ldc_w 45.0
      // 119: fcmpg
      // 11a: aload 2
      // 11b: ifnull 144
      // 11e: goto 125
      // 121: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 124: athrow
      // 125: ifge 1a4
      // 128: goto 12f
      // 12b: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12e: athrow
      // 12f: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 132: aload 5
      // 134: aload 13
      // 136: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 139: ldc2_w 4.0
      // 13c: dcmpg
      // 13d: goto 144
      // 140: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 143: athrow
      // 144: aload 2
      // 145: ifnull 165
      // 148: ifge 1a4
      // 14b: goto 152
      // 14e: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 151: athrow
      // 152: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 155: aload 5
      // 157: aload 13
      // 159: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 15c: dconst_1
      // 15d: dcmpl
      // 15e: goto 165
      // 161: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 164: athrow
      // 165: aload 2
      // 166: ifnull 187
      // 169: ifle 1a4
      // 16c: goto 173
      // 16f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 172: athrow
      // 173: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 176: aload 12
      // 178: aconst_null
      // 179: aconst_null
      // 17a: bipush 6
      // 17c: aconst_null
      // 17d: invokestatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.b (Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;Lnet/minecraft/core/BlockPos;Ljava/util/List;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)Z
      // 180: goto 187
      // 183: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 186: athrow
      // 187: aload 2
      // 188: ifnull 1a3
      // 18b: ifeq 1a4
      // 18e: goto 195
      // 191: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 194: athrow
      // 195: aload 8
      // 197: aload 12
      // 199: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 19c: goto 1a3
      // 19f: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a2: athrow
      // 1a3: pop
      // 1a4: iinc 11 1
      // 1a7: aload 2
      // 1a8: ifnonnull 096
      // 1ab: iinc 10 1
      // 1ae: aload 2
      // 1af: ifnonnull 088
      // 1b2: iinc 9 1
      // 1b5: aload 2
      // 1b6: ifnonnull 079
      // 1b9: aload 0
      // 1ba: aload 8
      // 1bc: checkcast java/util/List
      // 1bf: putfield me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Ljava/util/List;
      // 1c2: aload 8
      // 1c4: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 1c7: ifeq 1d0
      // 1ca: aconst_null
      // 1cb: areturn
      // 1cc: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1cf: athrow
      // 1d0: fconst_0
      // 1d1: fstore 9
      // 1d3: fconst_0
      // 1d4: fstore 10
      // 1d6: aload 8
      // 1d8: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 1db: dup
      // 1dc: sipush -19339
      // 1df: sipush 19425
      // 1e2: pop2
      // 1e3: ldc_w "iterator(...)"
      // 1e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1e9: astore 11
      // 1eb: aload 11
      // 1ed: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f2: ifeq 29c
      // 1f5: aload 11
      // 1f7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1fc: dup
      // 1fd: sipush -19350
      // 200: sipush 876
      // 203: pop2
      // 204: ldc_w "next(...)"
      // 207: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 20a: checkcast net/minecraft/core/BlockPos
      // 20d: astore 12
      // 20f: new net/minecraft/world/phys/Vec3
      // 212: dup
      // 213: aload 12
      // 215: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 218: i2d
      // 219: ldc2_w 0.5
      // 21c: dadd
      // 21d: aload 12
      // 21f: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 222: i2d
      // 223: ldc2_w 0.2
      // 226: dadd
      // 227: aload 12
      // 229: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 22c: i2d
      // 22d: ldc2_w 0.5
      // 230: dadd
      // 231: invokespecial net/minecraft/world/phys/Vec3.<init> (DDD)V
      // 234: astore 13
      // 236: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 239: aload 13
      // 23b: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 23e: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.b ()F
      // 241: fstore 14
      // 243: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 246: aload 13
      // 248: dconst_0
      // 249: ldc2_w 0.6
      // 24c: dconst_0
      // 24d: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 250: dup
      // 251: sipush -19344
      // 254: sipush -24090
      // 257: pop2
      // 258: ldc_w "add(...)"
      // 25b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 25e: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 261: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.b ()F
      // 264: fstore 15
      // 266: fload 10
      // 268: fstore 16
      // 26a: fload 16
      // 26c: fconst_1
      // 26d: fadd
      // 26e: fstore 10
      // 270: fload 9
      // 272: fload 14
      // 274: fload 9
      // 276: fsub
      // 277: fload 10
      // 279: fdiv
      // 27a: fadd
      // 27b: fstore 9
      // 27d: fload 10
      // 27f: fstore 16
      // 281: fload 16
      // 283: fconst_1
      // 284: fadd
      // 285: fstore 10
      // 287: fload 9
      // 289: fload 15
      // 28b: fload 9
      // 28d: fsub
      // 28e: fload 10
      // 290: fdiv
      // 291: fadd
      // 292: aload 2
      // 293: ifnull 29e
      // 296: fstore 9
      // 298: aload 2
      // 299: ifnonnull 1eb
      // 29c: fload 9
      // 29e: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 2a1: areturn
   }

   private final BlockPos d(boolean param1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [42[DOLOOP]], but top level block is 19[TRYBLOCK]
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

   private final boolean a(BlockPos param1, boolean param2) {
      net.minecraft.client.player.LocalPlayer var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.player;
      if (var4 == null) { return false; }
      net.minecraft.world.phys.Vec3 var5 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(param1);
      boolean var6;
      if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI || param2) {
         double var7 = param2 ? 1.0 : 0.5;
         var6 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var5, me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((net.minecraft.world.entity.Entity) var4), var7);
      } else {
         var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var5, me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((net.minecraft.world.entity.Entity) var4)) < 2.0;
      }
      return var6;
   }

   public final void n() {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
      this.h();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.clear();
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = true;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.f();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = this.a(200L, 80L);
      me.octo.client.utils.player.pathfinder.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .n()
               + 180.0F
         );
   }

   public final void o() {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(this);
      lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .l();
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
   }

   private static final boolean a(ClientLevel param0, BlockPos param1) {
      for (int var3 = -1; var3 < 2; var3++) {
         for (int var4 = -1; var4 < 2; var4++) {
            net.minecraft.core.BlockPos var5 = param1.offset(var3, -1, var4);
            net.minecraft.world.level.block.state.BlockState var6 = param0.getBlockState(var5);
            if (var6.isAir()) {
               continue;
            }
            if (var6.is(net.minecraft.world.level.block.Blocks.BEDROCK)) {
               continue;
            }
            if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.G(var6)) {
               continue;
            }
            if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var6.getBlock())) {
               continue;
            }
            if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.D(var6)) {
               continue;
            }
            return true;
         }
      }
      return false;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 03: bipush -1
      // 04: istore 3
      // 05: astore 2
      // 06: iload 3
      // 07: bipush 2
      // 08: if_icmpge f2
      // 0b: bipush -1
      // 0c: aload 2
      // 0d: ifnull f3
      // 10: istore 4
      // 12: iload 4
      // 14: bipush 2
      // 15: if_icmpge eb
      // 18: aload 1
      // 19: iload 3
      // 1a: bipush -1
      // 1b: iload 4
      // 1d: invokevirtual net/minecraft/core/BlockPos.offset (III)Lnet/minecraft/core/BlockPos;
      // 20: dup
      // 21: sipush -19347
      // 24: sipush -15499
      // 27: pop2
      // 28: ldc_w "offset(...)"
      // 2b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2e: astore 5
      // 30: aload 0
      // 31: aload 5
      // 33: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 36: dup
      // 37: sipush -19362
      // 3a: sipush -23441
      // 3d: pop2
      // 3e: ldc_w "getBlockState(...)"
      // 41: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 44: astore 6
      // 46: aload 2
      // 47: ifnull e7
      // 4a: aload 6
      // 4c: invokevirtual net/minecraft/world/level/block/state/BlockState.isAir ()Z
      // 4f: aload 2
      // 50: ifnull 07
      // 53: goto 5a
      // 56: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 59: athrow
      // 5a: ifne e4
      // 5d: aload 6
      // 5f: getstatic net/minecraft/world/level/block/Blocks.BEDROCK Lnet/minecraft/world/level/block/Block;
      // 62: invokevirtual net/minecraft/world/level/block/state/BlockState.is (Ljava/lang/Object;)Z
      // 65: aload 2
      // 66: ifnull 89
      // 69: goto 70
      // 6c: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6f: athrow
      // 70: ifne e4
      // 73: goto 7a
      // 76: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 79: athrow
      // 7a: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 7d: aload 6
      // 7f: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.G (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 82: goto 89
      // 85: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 88: athrow
      // 89: aload 2
      // 8a: ifnull b7
      // 8d: ifne e4
      // 90: goto 97
      // 93: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 96: athrow
      // 97: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 9a: aload 6
      // 9c: invokevirtual net/minecraft/world/level/block/state/BlockState.getBlock ()Lnet/minecraft/world/level/block/Block;
      // 9f: dup
      // a0: sipush -19349
      // a3: sipush 7149
      // a6: pop2
      // a7: ldc_w "getBlock(...)"
      // aa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // ad: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.a (Lnet/minecraft/world/level/block/Block;)Z
      // b0: goto b7
      // b3: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // b6: athrow
      // b7: aload 2
      // b8: ifnull d4
      // bb: ifeq e4
      // be: goto c5
      // c1: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // c4: athrow
      // c5: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // c8: aload 6
      // ca: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.D (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // cd: goto d4
      // d0: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // d3: athrow
      // d4: aload 2
      // d5: ifnull e3
      // d8: ifeq e4
      // db: goto e2
      // de: invokestatic me/octo/client/IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // e1: athrow
      // e2: bipush 1
      // e3: ireturn
      // e4: iinc 4 1
      // e7: aload 2
      // e8: ifnonnull 12
      // eb: iinc 3 1
      // ee: aload 2
      // ef: ifnonnull 06
      // f2: bipush 0
      // f3: ireturn
   }

   private static final Boolean a(ClientLevel param0, BlockPos param1, BlockPos param2) {
      Intrinsics.checkNotNullParameter(param2, "it");
      BlockState var3 = param0.getBlockState(param1);
      return !var3.isAir() && var3.getFluidState().isEmpty() && var3.getCollisionShape((BlockGetter)param0, param1).isEmpty();
   }

   private static final Boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Boolean b(ClientLevel var0, BlockPos var1, BlockPos var2) {
      String var10000 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = -19341;
      short var10003 = -567;
      Intrinsics.checkNotNullParameter(var2, "it");
      String var3 = var10000;
      BlockState var6 = var0.getBlockState(var1);
      var10002 = -19370;
      var10003 = -15150;
      Intrinsics.checkNotNullExpressionValue(var6, "getBlockState(...)");
      BlockState var4 = var6;

      try {
         boolean var7 = var4.isAir();
         if (var3 == null) {
            return var7;
         }

         if (!var7) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var5) {
         throw (RuntimeException)a(var5);
      }

      return false;
   }

   private static final Boolean b(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean a(HashMap<BlockPos, Boolean> var0, ClientLevel var1, BlockPos var2) {
      Object var10000 = var0.computeIfAbsent(var2, null);
      short var10002 = -19357;
      short var10003 = 22075;
      Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
      return (Boolean)var10000;
   }

   private static final boolean b(HashMap<BlockPos, Boolean> var0, ClientLevel var1, BlockPos var2) {
      Object var10000 = var0.computeIfAbsent(var2, null);
      short var10002 = -19357;
      short var10003 = 22075;
      Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
      return (Boolean)var10000;
   }

   private static final Boolean c(ClientLevel param0, BlockPos param1, BlockPos param2) {
      BlockState var3 = param0.getBlockState(param1);
      return !var3.isAir() && var3.getFluidState().isEmpty() && var3.getCollisionShape((BlockGetter)param0, param1).isEmpty();
   }

   private static final Boolean c(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Boolean a(ClientLevel param0, BlockPos param1, boolean param2, BlockPos param3) {
      Intrinsics.checkNotNullParameter(param3, "it");
      BlockState var4 = param0.getBlockState(param1);
      return (!var4.isAir() || !IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4.getBlock())) && (!param2 || !IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.o(var4));
   }

   private static final Boolean d(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean c(HashMap<BlockPos, Boolean> var0, ClientLevel var1, BlockPos var2) {
      Object var10000 = var0.computeIfAbsent(var2, null);
      short var10002 = -19332;
      short var10003 = -2472;
      Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
      return (Boolean)var10000;
   }

   private static final boolean a(HashMap<BlockPos, Boolean> var0, ClientLevel var1, boolean var2, BlockPos var3) {
      Object var10000 = var0.computeIfAbsent(var3, null);
      short var10002 = -19357;
      short var10003 = 22075;
      Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
      return (Boolean)var10000;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[44];
      int var3 = 0;
      String var2 = "\u0080xóa\u0015Ym;\"É5.\r\u0082ÿP\u00989\u008e\u009bsÜ\u001c6óØ³=ÇÅ\u008bÍ\f\u0081\u0005\u001c½Ë\u00ad\u0015\u0014ï\u001f{Ý\u000b\u00928í\u008bxuÄÆ\fi)\u001dê·¼\u0013\b·\u001a¶\u0011}Ã\u0005r¯ë\tËìß3\u001co\u0090\u0006Å\\1û8²\bðÿÓóm^\u008f\u0005\u000ekÝvý\u0080ÙJñâ;\u0082µ¶\u0093\bêúôµ7òê{\u0012Uñ)\u009e\u009aâ\rI\u0010¦HèQ\u0091?:mí\u0006Ccµ;þb\u0002çy\r®¯\u0010±{]ª/Ü\u0013Tvk\u0006ÉS²±Õ%\u0002¥î\b\u00959\u007f+øE=f\r\u009eSÈ-^ã®\u0099Ñÿõë_\n[\u0019ó\u008c\u0087{ð`ø*\u0005\u0081Í¬·æ\u001a\u0085\u0010Sl\u0003ëæR3y\biodÀ,A\u0005j\u0095ÎÀ²\u009c\b¥\u000b\u0019À#\rzëI¥\t\u0095/\t\u000f\u008fÞ\u0080UçN5(\rTæ\u0091\u009bu5ËC}¤`\u0080í\u0013^õÐþHtè$\u0017\u008bG\u008d^|m!J-Z3é\u008aÞ?¹\u0081Ã\u0014ÃÜå4'\u000b\u0094ø\r»¶ã©±0\u009f×\r³$\u0093;Ú4Ï\u0000U\u008e`\u001a©Ø´+ÖÕ(\u0012ª-Ø¿\u0085\t\u009fÔÌë\u0017\u008a\u0006\u0098!\u0004§LSç\u000bcÎlÌ\u0093Ót¢®uÛ\u0004\u0093FÕ¦\tg)EÏ\u0001½,\u0092é\u0014ÖU\\\u0094ï»¤È\u0018Ü\u0007P\u0088\u009e {$ \u0090õ\u001bà9`C@ò\u0081ÈÞd}àY´~\u0013\u0003Î\u0094µ\u0090\u0015Y\u0003a\\w\u000eP2\u0011\u0000lf×\u0006QÅôjxh\u0012\u008a\u009dJô\u000eØ¤þëIév6û-_\u0084å\u0005ã\u008e4Ëê\u0010wæõ\u0090û\"O4^LÁ\u007fü\u000bV\u0080\tc'þIA¦ õl\u0005\u000e\u0092]\\Ø\u0006Â\u0016\u0085\u0095ø·\n¦>Lhpç\u000eó'X\r\u0094]Wï\u0093\u0096·V\u007f< \u0093å\u0012¾ÌÌÞÞ\u009d¾V¨\\\u0081Ô;¯\u008cÕ°´\u000eL\u0012\u0092\u0014\rêÕ\u0003º\u000f>3!C";
      int var4 = "\u0080xóa\u0015Ym;\"É5.\r\u0082ÿP\u00989\u008e\u009bsÜ\u001c6óØ³=ÇÅ\u008bÍ\f\u0081\u0005\u001c½Ë\u00ad\u0015\u0014ï\u001f{Ý\u000b\u00928í\u008bxuÄÆ\fi)\u001dê·¼\u0013\b·\u001a¶\u0011}Ã\u0005r¯ë\tËìß3\u001co\u0090\u0006Å\\1û8²\bðÿÓóm^\u008f\u0005\u000ekÝvý\u0080ÙJñâ;\u0082µ¶\u0093\bêúôµ7òê{\u0012Uñ)\u009e\u009aâ\rI\u0010¦HèQ\u0091?:mí\u0006Ccµ;þb\u0002çy\r®¯\u0010±{]ª/Ü\u0013Tvk\u0006ÉS²±Õ%\u0002¥î\b\u00959\u007f+øE=f\r\u009eSÈ-^ã®\u0099Ñÿõë_\n[\u0019ó\u008c\u0087{ð`ø*\u0005\u0081Í¬·æ\u001a\u0085\u0010Sl\u0003ëæR3y\biodÀ,A\u0005j\u0095ÎÀ²\u009c\b¥\u000b\u0019À#\rzëI¥\t\u0095/\t\u000f\u008fÞ\u0080UçN5(\rTæ\u0091\u009bu5ËC}¤`\u0080í\u0013^õÐþHtè$\u0017\u008bG\u008d^|m!J-Z3é\u008aÞ?¹\u0081Ã\u0014ÃÜå4'\u000b\u0094ø\r»¶ã©±0\u009f×\r³$\u0093;Ú4Ï\u0000U\u008e`\u001a©Ø´+ÖÕ(\u0012ª-Ø¿\u0085\t\u009fÔÌë\u0017\u008a\u0006\u0098!\u0004§LSç\u000bcÎlÌ\u0093Ót¢®uÛ\u0004\u0093FÕ¦\tg)EÏ\u0001½,\u0092é\u0014ÖU\\\u0094ï»¤È\u0018Ü\u0007P\u0088\u009e {$ \u0090õ\u001bà9`C@ò\u0081ÈÞd}àY´~\u0013\u0003Î\u0094µ\u0090\u0015Y\u0003a\\w\u000eP2\u0011\u0000lf×\u0006QÅôjxh\u0012\u008a\u009dJô\u000eØ¤þëIév6û-_\u0084å\u0005ã\u008e4Ëê\u0010wæõ\u0090û\"O4^LÁ\u007fü\u000bV\u0080\tc'þIA¦ õl\u0005\u000e\u0092]\\Ø\u0006Â\u0016\u0085\u0095ø·\n¦>Lhpç\u000eó'X\r\u0094]Wï\u0093\u0096·V\u007f< \u0093å\u0012¾ÌÌÞÞ\u009d¾V¨\\\u0081Ô;¯\u008cÕ°´\u000eL\u0012\u0092\u0014\rêÕ\u0003º\u000f>3!C"
         .length();
      char var1 = '"';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 122;
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
                     case 0 -> 54;
                     case 1 -> 84;
                     case 2 -> 23;
                     case 3 -> 115;
                     case 4 -> 6;
                     case 5 -> 120;
                     default -> 18;
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
                     b = new String[44];
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

                  var2 = "\u0092È6\u00144\u0001\r\u008de¼c\u0089\u0013³³þ¬Æ¯ÖÅ\u001bó¼üD\u001bh\u0014æq\u0082\u001f\u008bÖÑ \rÊXFìÁ¡\u0004\u0085\u0000\u0004K\u0010\f";
                  var4 = "\u0092È6\u00144\u0001\r\u008de¼c\u0089\u0013³³þ¬Æ¯ÖÅ\u001bó¼üD\u001bh\u0014æq\u0082\u001f\u008bÖÑ \rÊXFìÁ¡\u0004\u0085\u0000\u0004K\u0010\f"
                     .length();
                  var1 = '%';
                  var8 = -1;
            }

            var10000 = 126;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -19330) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 160;
            case 1 -> 109;
            case 2 -> 139;
            case 3 -> 183;
            case 4 -> 142;
            case 5 -> 162;
            case 6 -> 65;
            case 7 -> 99;
            case 8 -> 6;
            case 9 -> 217;
            case 10 -> 146;
            case 11 -> 77;
            case 12 -> 226;
            case 13 -> 147;
            case 14 -> 158;
            case 15 -> 165;
            case 16 -> 48;
            case 17 -> 248;
            case 18 -> 149;
            case 19 -> 123;
            case 20 -> 67;
            case 21 -> 36;
            case 22 -> 135;
            case 23 -> 185;
            case 24 -> 110;
            case 25 -> 107;
            case 26 -> 60;
            case 27 -> 216;
            case 28 -> 184;
            case 29 -> 181;
            case 30 -> 200;
            case 31 -> 144;
            case 32 -> 19;
            case 33 -> 105;
            case 34 -> 102;
            case 35 -> 12;
            case 36 -> 40;
            case 37 -> 127;
            case 38 -> 44;
            case 39 -> 171;
            case 40 -> 81;
            case 41 -> 188;
            case 42 -> 204;
            case 43 -> 223;
            case 44 -> 136;
            case 45 -> 134;
            case 46 -> 212;
            case 47 -> 117;
            case 48 -> 247;
            case 49 -> 201;
            case 50 -> 159;
            case 51 -> 196;
            case 52 -> 89;
            case 53 -> 87;
            case 54 -> 113;
            case 55 -> 97;
            case 56 -> 251;
            case 57 -> 121;
            case 58 -> 29;
            case 59 -> 118;
            case 60 -> 157;
            case 61 -> 28;
            case 62 -> 50;
            case 63 -> 108;
            case 64 -> 167;
            case 65 -> 249;
            case 66 -> 1;
            case 67 -> 63;
            case 68 -> 253;
            case 69 -> 98;
            case 70 -> 214;
            case 71 -> 16;
            case 72 -> 145;
            case 73 -> 84;
            case 74 -> 0;
            case 75 -> 69;
            case 76 -> 53;
            case 77 -> 246;
            case 78 -> 172;
            case 79 -> 90;
            case 80 -> 176;
            case 81 -> 209;
            case 82 -> 177;
            case 83 -> 155;
            case 84 -> 24;
            case 85 -> 59;
            case 86 -> 54;
            case 87 -> 42;
            case 88 -> 101;
            case 89 -> 34;
            case 90 -> 168;
            case 91 -> 218;
            case 92 -> 111;
            case 93 -> 178;
            case 94 -> 228;
            case 95 -> 250;
            case 96 -> 115;
            case 97 -> 96;
            case 98 -> 244;
            case 99 -> 17;
            case 100 -> 132;
            case 101 -> 131;
            case 102 -> 245;
            case 103 -> 91;
            case 104 -> 116;
            case 105 -> 173;
            case 106 -> 93;
            case 107 -> 25;
            case 108 -> 194;
            case 109 -> 234;
            case 110 -> 10;
            case 111 -> 7;
            case 112 -> 92;
            case 113 -> 130;
            case 114 -> 43;
            case 115 -> 186;
            case 116 -> 233;
            case 117 -> 141;
            case 118 -> 222;
            case 119 -> 13;
            case 120 -> 208;
            case 121 -> 148;
            case 122 -> 18;
            case 123 -> 14;
            case 124 -> 221;
            case 125 -> 80;
            case 126 -> 133;
            case 127 -> 219;
            case 128 -> 156;
            case 129 -> 220;
            case 130 -> 179;
            case 131 -> 255;
            case 132 -> 210;
            case 133 -> 122;
            case 134 -> 174;
            case 135 -> 229;
            case 136 -> 205;
            case 137 -> 68;
            case 138 -> 192;
            case 139 -> 191;
            case 140 -> 202;
            case 141 -> 100;
            case 142 -> 187;
            case 143 -> 239;
            case 144 -> 22;
            case 145 -> 33;
            case 146 -> 94;
            case 147 -> 189;
            case 148 -> 137;
            case 149 -> 154;
            case 150 -> 35;
            case 151 -> 231;
            case 152 -> 125;
            case 153 -> 27;
            case 154 -> 66;
            case 155 -> 64;
            case 156 -> 30;
            case 157 -> 207;
            case 158 -> 242;
            case 159 -> 71;
            case 160 -> 227;
            case 161 -> 79;
            case 162 -> 5;
            case 163 -> 152;
            case 164 -> 164;
            case 165 -> 75;
            case 166 -> 169;
            case 167 -> 78;
            case 168 -> 39;
            case 169 -> 20;
            case 170 -> 9;
            case 171 -> 225;
            case 172 -> 232;
            case 173 -> 224;
            case 174 -> 88;
            case 175 -> 95;
            case 176 -> 236;
            case 177 -> 2;
            case 178 -> 26;
            case 179 -> 235;
            case 180 -> 11;
            case 181 -> 153;
            case 182 -> 129;
            case 183 -> 238;
            case 184 -> 37;
            case 185 -> 58;
            case 186 -> 62;
            case 187 -> 72;
            case 188 -> 230;
            case 189 -> 106;
            case 190 -> 215;
            case 191 -> 166;
            case 192 -> 150;
            case 193 -> 112;
            case 194 -> 240;
            case 195 -> 151;
            case 196 -> 138;
            case 197 -> 38;
            case 198 -> 206;
            case 199 -> 124;
            case 200 -> 197;
            case 201 -> 3;
            case 202 -> 119;
            case 203 -> 190;
            case 204 -> 120;
            case 205 -> 193;
            case 206 -> 8;
            case 207 -> 23;
            case 208 -> 32;
            case 209 -> 52;
            case 210 -> 55;
            case 211 -> 4;
            case 212 -> 252;
            case 213 -> 237;
            case 214 -> 114;
            case 215 -> 15;
            case 216 -> 126;
            case 217 -> 46;
            case 218 -> 203;
            case 219 -> 198;
            case 220 -> 128;
            case 221 -> 182;
            case 222 -> 83;
            case 223 -> 241;
            case 224 -> 74;
            case 225 -> 104;
            case 226 -> 86;
            case 227 -> 195;
            case 228 -> 213;
            case 229 -> 161;
            case 230 -> 199;
            case 231 -> 47;
            case 232 -> 41;
            case 233 -> 73;
            case 234 -> 31;
            case 235 -> 76;
            case 236 -> 51;
            case 237 -> 82;
            case 238 -> 45;
            case 239 -> 56;
            case 240 -> 57;
            case 241 -> 21;
            case 242 -> 61;
            case 243 -> 175;
            case 244 -> 103;
            case 245 -> 243;
            case 246 -> 70;
            case 247 -> 140;
            case 248 -> 180;
            case 249 -> 170;
            case 250 -> 254;
            case 251 -> 85;
            case 252 -> 163;
            case 253 -> 211;
            case 254 -> 49;
            default -> 143;
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

   public static enum IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

      // PX-FIX TOP5F: jar private static final <Self>[] c() (values array builder)
      private static final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] c() {
         return new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[]{ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl };
      }
      private static IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl };

      public static IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] a() {
         return (IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         String var0
      ) {
         return Enum.valueOf(
            IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @Nullable
      private final BlockPos IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @Nullable
      private final BlockPos IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @Nullable
      private final BlockPos lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @Nullable
      private final Vec3 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private final int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      @Nullable
      private final BlockPos lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private final int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      @Nullable
      private final BlockPos lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      private final int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      @Nullable
      private final BlockPos IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      @Nullable
      private final Integer llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      @Nullable
      private final Integer IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      @Nullable
      private final BlockPos IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      private final int IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      private final boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      private boolean llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      private final int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         boolean var1,
         boolean var2,
         boolean var3,
         @NotNull IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4,
         @Nullable BlockPos var5,
         boolean var6,
         @Nullable BlockPos var7,
         @Nullable BlockPos var8,
         @Nullable Vec3 var9,
         int var10,
         @Nullable BlockPos var11,
         int var12,
         @Nullable BlockPos var13,
         int var14,
         @Nullable BlockPos var15,
         @Nullable Integer var16,
         @Nullable Integer var17,
         @Nullable BlockPos var18,
         int var19,
         boolean var20,
         boolean var21,
         int var22
      ) {
         short var10001 = -18053;
         short var10002 = 25718;
         Intrinsics.checkNotNullParameter(var4, "state");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var10;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var11;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var12;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var13;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var14;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var15;
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var16;
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var17;
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var18;
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var19;
         this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var20;
         this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var21;
         this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var22;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final BlockPos e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final BlockPos g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @Nullable
      public final BlockPos h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @Nullable
      public final Vec3 i() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final int j() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      @Nullable
      public final BlockPos k() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final int l() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      @Nullable
      public final BlockPos m() {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      public final int n() {
         return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      @Nullable
      public final BlockPos o() {
         return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      @Nullable
      public final Integer p() {
         return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }

      @Nullable
      public final Integer q() {
         return this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      }

      @Nullable
      public final BlockPos r() {
         return this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      }

      public final int s() {
         return this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      }

      public final boolean t() {
         return this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      }

      public final boolean u() {
         return this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      }

      public final int v() {
         return this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      }

      public final boolean w() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean x() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean y() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll z() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final BlockPos A() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean B() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final BlockPos C() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @Nullable
      public final BlockPos D() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @Nullable
      public final Vec3 E() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final int F() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      @Nullable
      public final BlockPos G() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final int H() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      @Nullable
      public final BlockPos I() {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      public final int J() {
         return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      @Nullable
      public final BlockPos K() {
         return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      @Nullable
      public final Integer L() {
         return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }

      @Nullable
      public final Integer M() {
         return this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      }

      @Nullable
      public final BlockPos N() {
         return this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      }

      public final int O() {
         return this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      }

      public final boolean P() {
         return this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      }

      public final boolean Q() {
         return this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      }

      public final int R() {
         return this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      }

      @NotNull
      public final IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         boolean var1,
         boolean var2,
         boolean var3,
         @NotNull IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4,
         @Nullable BlockPos var5,
         boolean var6,
         @Nullable BlockPos var7,
         @Nullable BlockPos var8,
         @Nullable Vec3 var9,
         int var10,
         @Nullable BlockPos var11,
         int var12,
         @Nullable BlockPos var13,
         int var14,
         @Nullable BlockPos var15,
         @Nullable Integer var16,
         @Nullable Integer var17,
         @Nullable BlockPos var18,
         int var19,
         boolean var20,
         boolean var21,
         int var22
      ) {
         short var10001 = -18059;
         short var10002 = -12148;
         Intrinsics.checkNotNullParameter(var4, "state");
         return new IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -18068;
         int var1 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
         boolean var2 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
         boolean var3 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
         int var4 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
         BlockPos var5 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         Integer var6 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         Integer var7 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         BlockPos var8 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         int var9 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         BlockPos var10 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         int var11 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         BlockPos var12 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         int var13 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         Vec3 var14 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         BlockPos var15 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         BlockPos var16 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         boolean var17 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         BlockPos var18 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var19 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var20 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var21 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var22 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -10737;
         short var10002 = -18065;
         short var10003 = -14748;
         short var10004 = -18061;
         short var10005 = -12027;
         short var10006 = -18055;
         short var10007 = 28628;
         short var10008 = -18056;
         short var10009 = 9432;
         short var10010 = -18049;
         short var10011 = -23483;
         short var10012 = -18057;
         short var10013 = -28342;
         short var10014 = -18066;
         short var10015 = -22216;
         short var10016 = -18070;
         short var10017 = 22739;
         short var10018 = -18052;
         short var10019 = -17462;
         short var10020 = -18051;
         short var10021 = 23457;
         short var10022 = -18072;
         short var10023 = -17631;
         short var10024 = -18069;
         short var10025 = 31403;
         short var10026 = -18064;
         short var10027 = 21032;
         short var10028 = -18054;
         short var10029 = -20260;
         short var10030 = -18058;
         short var10031 = -16394;
         short var10032 = -18062;
         short var10033 = -25959;
         short var10034 = -18060;
         short var10035 = 15667;
         short var10036 = -18067;
         short var10037 = -27568;
         short var10038 = -18071;
         short var10039 = -18172;
         short var10040 = -18050;
         short var10041 = 5129;
         short var10042 = -18063;
         short var10043 = 4706;
         return "ProgressSnapshot(enabled="
            + var22
            + ", finished="
            + var21
            + ", sludgeMiner="
            + var20
            + ", state="
            + var19
            + ", target="
            + var18
            + ", preciseTarget="
            + var17
            + ", chest="
            + var16
            + ", visibleChest="
            + var15
            + ", particlePos="
            + var14
            + ", queuedChestCount="
            + var13
            + ", lastQueuedChest="
            + var12
            + ", openedChestCount="
            + var11
            + ", lastOpenedChest="
            + var10
            + ", collidedChestCount="
            + var9
            + ", lastCollidedChest="
            + var8
            + ", pathSize="
            + var7
            + ", minePositionCount="
            + var6
            + ", digdownPosition="
            + var5
            + ", failedPaths="
            + var4
            + ", reachedPoint="
            + var3
            + ", clicked="
            + var2
            + ", hitOreCount="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var24;
         int var34;
         label117: {
            String var10000 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
            int var2 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var1 = var10000;
            var2 = var2 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var2 = var2 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            var2 = var2 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
            var24 = var2 * 31;
            BlockPos var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var1 != null) {
               if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == null) {
                  var34 = 0;
                  break label117;
               }

               var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }

            var34 = var10001.hashCode();
         }

         label111: {
            int var6 = var24 + var34;
            var6 = var6 * 31 + Boolean.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
            var24 = var6 * 31;
            BlockPos var35 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            if (var1 != null) {
               if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll == null) {
                  var34 = 0;
                  break label111;
               }

               var35 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            }

            var34 = var35.hashCode();
         }

         label105: {
            int var8 = var24 + var34;
            var24 = var8 * 31;
            BlockPos var37 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            if (var1 != null) {
               if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll == null) {
                  var34 = 0;
                  break label105;
               }

               var37 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            }

            var34 = var37.hashCode();
         }

         label99: {
            int var9 = var24 + var34;
            var24 = var9 * 31;
            Vec3 var39 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            if (var1 != null) {
               if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == null) {
                  var34 = 0;
                  break label99;
               }

               var39 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            }

            var34 = var39.hashCode();
         }

         label93: {
            int var10 = var24 + var34;
            var10 = var10 * 31 + Integer.hashCode(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
            var24 = var10 * 31;
            BlockPos var41 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            if (var1 != null) {
               if (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl == null) {
                  var34 = 0;
                  break label93;
               }

               var41 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            }

            var34 = var41.hashCode();
         }

         label87: {
            int var12 = var24 + var34;
            var12 = var12 * 31 + Integer.hashCode(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
            var24 = var12 * 31;
            BlockPos var43 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var1 != null) {
               if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl == null) {
                  var34 = 0;
                  break label87;
               }

               var43 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            }

            var34 = var43.hashCode();
         }

         label81: {
            int var14 = var24 + var34;
            var14 = var14 * 31 + Integer.hashCode(this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
            var24 = var14 * 31;
            BlockPos var45 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            if (var1 != null) {
               if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl == null) {
                  var34 = 0;
                  break label81;
               }

               var45 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            }

            var34 = var45.hashCode();
         }

         label75: {
            int var16 = var24 + var34;
            var24 = var16 * 31;
            Integer var47 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            if (var1 != null) {
               if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == null) {
                  var34 = 0;
                  break label75;
               }

               var47 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            }

            var34 = var47.hashCode();
         }

         label69: {
            int var17 = var24 + var34;
            var24 = var17 * 31;
            Integer var49 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            if (var1 != null) {
               if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl == null) {
                  var34 = 0;
                  break label69;
               }

               var49 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            }

            var34 = var49.hashCode();
         }

         label63: {
            int var18 = var24 + var34;
            var24 = var18 * 31;
            BlockPos var51 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
            if (var1 != null) {
               if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl == null) {
                  var34 = 0;
                  break label63;
               }

               var51 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
            }

            var34 = var51.hashCode();
         }

         int var19 = var24 + var34;
         var19 = var19 * 31 + Integer.hashCode(this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll);
         var19 = var19 * 31 + Boolean.hashCode(this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl);
         var19 = var19 * 31 + Boolean.hashCode(this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI);
         var19 = var19 * 31 + Integer.hashCode(this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll);
         if (var1 == null) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
            );
         }

         return var19;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         boolean var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = ((var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0);
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = ((var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
         }

         label202: {
            if (var2 != null) {
               if (var4 != (var10001 != 0)) {
                  return false;
               }

               var10000 = this;
               if (var2 == null) {
                  break label202;
               }

               var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               var10001 = ((var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
            }

            if (var4 != (var10001 != 0)) {
               return false;
            }

            var10000 = this;
         }

         if (var2 != null) {
            if (((IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000).lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               != var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               return false;
            }

            var10000 = this;
         }

         int var6 = ((Intrinsics.areEqual(
            ((IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000).IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )) ? 1 : 0);
         if (var2 != null) {
            if (var6 == 0) {
               return false;
            }

            var6 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 !=( (!var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0)) {
               return false;
            }

            var6 = ((Intrinsics.areEqual(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 == 0) {
               return false;
            }

            var6 = ((Intrinsics.areEqual(
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
               var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 == 0) {
               return false;
            }

            var6 = ((Intrinsics.areEqual(
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
               var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 == 0) {
               return false;
            }

            var6 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         }

         if (var2 != null) {
            if (var6 != var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
               return false;
            }

            var6 = ((Intrinsics.areEqual(
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 == 0) {
               return false;
            }

            var6 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         }

         if (var2 != null) {
            if (var6 != var3.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) {
               return false;
            }

            var6 = ((Intrinsics.areEqual(
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
               var3.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 == 0) {
               return false;
            }

            var6 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         }

         if (var2 != null) {
            if (var6 != var3.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
               return false;
            }

            var6 = ((Intrinsics.areEqual(
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
               var3.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 == 0) {
               return false;
            }

            var6 = ((Intrinsics.areEqual(
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
               var3.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 == 0) {
               return false;
            }

            var6 = ((Intrinsics.areEqual(
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
               var3.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 == 0) {
               return false;
            }

            var6 = ((Intrinsics.areEqual(
               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl,
               var3.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 == 0) {
               return false;
            }

            var6 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
         }

         var10001 = var3.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
         if (var2 != null) {
            if (var6 != var3.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) {
               return false;
            }

            var6 = ((this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl) ? 1 : 0);
            var10001 = ((var3.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 != var10001) {
               return false;
            }

            var6 = ((this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI) ? 1 : 0);
            var10001 = ((var3.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI) ? 1 : 0);
         }

         if (var2 != null) {
            if (var6 != var10001) {
               return false;
            }

            var6 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
            if (var2 == null) {
               return (boolean)(this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll != 0);
            }

            var10001 = var3.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
         }

         return !(var6 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[24];
         int var3 = 0;
         String var2 = "Ü<\u0084\u0098\u0097º¡G\u0086\u009c&¹Þ¨\n¯&\u008f\u0013c(n\u000ebÿÿßÙ¡/·È·\u0013\u0004Tu\u0081\u0010j\u0091N>G\bWâgÏ\u001eÀy^O\u0093\nÒ\u0095J º\u0006g5\"\u0088\b»~wÅ\u0007¦×\u008c\t3µa©1\u008f`\u0091T\u0005Öé|é2\u0014\u009b\u0095l\u00ad\u008a\u001c\u0010\u0089é\u0005ï°L\u0085\u009c\u009c\u0007ßÈK\u0005éd\u009bXÎ\u0012p0\u0019\u00119\u0092ÜRÛYí\u0097Æ\u0084j©½Ð\bÕÐª\fª\u0007÷_\u000bHÙ\n$Þ1mµBM\u001a\u000e7\u001dý´;\rðýÍÃ½\u0001\u0088¡\u0015AA89ñY©1¸pÇ\u001b&jæ¿\u0093ó\u000bAà\u000eùo?ÿ\u001aêàOv\u0093\u001eÆ\u00823\u0014O\u0014÷\u0095Å\u0003TY\u000f\u001aÒû_Jµ)2\u0093||\u000e#½q¨x¤1\u008e\u0013\u0082\u0016àÛ[\u0019xuà¯y\u008b\u007fT\r#£\"ÚM¶\u0014¦G\u0002Ð\u009e¤4Ë(\u000b\u0005½µ ç©3\u0086²\u000bø\u000f\u001b°f\u0001\u0092\u009d2\u0004¡øÏÄ\u007f:P\u000fÊKXrÃtB{å,a#PK\u000b\u0013\u0003÷|ðý\u009e\f\u008b§+àæ1\u009d,A³Ý}";
         int var4 = "Ü<\u0084\u0098\u0097º¡G\u0086\u009c&¹Þ¨\n¯&\u008f\u0013c(n\u000ebÿÿßÙ¡/·È·\u0013\u0004Tu\u0081\u0010j\u0091N>G\bWâgÏ\u001eÀy^O\u0093\nÒ\u0095J º\u0006g5\"\u0088\b»~wÅ\u0007¦×\u008c\t3µa©1\u008f`\u0091T\u0005Öé|é2\u0014\u009b\u0095l\u00ad\u008a\u001c\u0010\u0089é\u0005ï°L\u0085\u009c\u009c\u0007ßÈK\u0005éd\u009bXÎ\u0012p0\u0019\u00119\u0092ÜRÛYí\u0097Æ\u0084j©½Ð\bÕÐª\fª\u0007÷_\u000bHÙ\n$Þ1mµBM\u001a\u000e7\u001dý´;\rðýÍÃ½\u0001\u0088¡\u0015AA89ñY©1¸pÇ\u001b&jæ¿\u0093ó\u000bAà\u000eùo?ÿ\u001aêàOv\u0093\u001eÆ\u00823\u0014O\u0014÷\u0095Å\u0003TY\u000f\u001aÒû_Jµ)2\u0093||\u000e#½q¨x¤1\u008e\u0013\u0082\u0016àÛ[\u0019xuà¯y\u008b\u007fT\r#£\"ÚM¶\u0014¦G\u0002Ð\u009e¤4Ë(\u000b\u0005½µ ç©3\u0086²\u000bø\u000f\u001b°f\u0001\u0092\u009d2\u0004¡øÏÄ\u007f:P\u000fÊKXrÃtB{å,a#PK\u000b\u0013\u0003÷|ðý\u009e\f\u008b§+àæ1\u009d,A³Ý}"
            .length();
         char var1 = 18;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 98;
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
                        case 0 -> 23;
                        case 1 -> 65;
                        case 2 -> 22;
                        case 3 -> 92;
                        case 4 -> 121;
                        case 5 -> 53;
                        default -> 30;
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
                        b = new String[24];
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

                     var2 = "\u0018\u0093\u001fnçg²ú:\u0096²\u0083Oì;$\u0003ý\u000e2ïFáR\u0096\u0003×çI\u0014\u00198\u0080";
                     var4 = "\u0018\u0093\u001fnçg²ú:\u0096²\u0083Oì;$\u0003ý\u000e2ïFáR\u0096\u0003×çI\u0014\u00198\u0080".length();
                     var1 = 18;
                     var8 = -1;
               }

               var10000 = 40;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -18051) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 248;
               case 1 -> 135;
               case 2 -> 219;
               case 3 -> 7;
               case 4 -> 53;
               case 5 -> 10;
               case 6 -> 149;
               case 7 -> 9;
               case 8 -> 88;
               case 9 -> 123;
               case 10 -> 174;
               case 11 -> 224;
               case 12 -> 79;
               case 13 -> 178;
               case 14 -> 31;
               case 15 -> 87;
               case 16 -> 154;
               case 17 -> 255;
               case 18 -> 161;
               case 19 -> 124;
               case 20 -> 86;
               case 21 -> 186;
               case 22 -> 144;
               case 23 -> 136;
               case 24 -> 107;
               case 25 -> 170;
               case 26 -> 68;
               case 27 -> 251;
               case 28 -> 95;
               case 29 -> 220;
               case 30 -> 185;
               case 31 -> 18;
               case 32 -> 19;
               case 33 -> 64;
               case 34 -> 182;
               case 35 -> 173;
               case 36 -> 85;
               case 37 -> 167;
               case 38 -> 22;
               case 39 -> 160;
               case 40 -> 252;
               case 41 -> 150;
               case 42 -> 17;
               case 43 -> 156;
               case 44 -> 145;
               case 45 -> 97;
               case 46 -> 78;
               case 47 -> 127;
               case 48 -> 70;
               case 49 -> 4;
               case 50 -> 25;
               case 51 -> 43;
               case 52 -> 16;
               case 53 -> 132;
               case 54 -> 192;
               case 55 -> 104;
               case 56 -> 183;
               case 57 -> 46;
               case 58 -> 131;
               case 59 -> 51;
               case 60 -> 67;
               case 61 -> 229;
               case 62 -> 112;
               case 63 -> 175;
               case 64 -> 180;
               case 65 -> 98;
               case 66 -> 244;
               case 67 -> 236;
               case 68 -> 82;
               case 69 -> 198;
               case 70 -> 110;
               case 71 -> 83;
               case 72 -> 66;
               case 73 -> 179;
               case 74 -> 121;
               case 75 -> 208;
               case 76 -> 158;
               case 77 -> 223;
               case 78 -> 117;
               case 79 -> 155;
               case 80 -> 35;
               case 81 -> 169;
               case 82 -> 212;
               case 83 -> 42;
               case 84 -> 74;
               case 85 -> 52;
               case 86 -> 214;
               case 87 -> 227;
               case 88 -> 235;
               case 89 -> 184;
               case 90 -> 241;
               case 91 -> 69;
               case 92 -> 54;
               case 93 -> 209;
               case 94 -> 103;
               case 95 -> 23;
               case 96 -> 202;
               case 97 -> 162;
               case 98 -> 181;
               case 99 -> 130;
               case 100 -> 140;
               case 101 -> 205;
               case 102 -> 122;
               case 103 -> 0;
               case 104 -> 153;
               case 105 -> 221;
               case 106 -> 34;
               case 107 -> 165;
               case 108 -> 45;
               case 109 -> 204;
               case 110 -> 246;
               case 111 -> 92;
               case 112 -> 8;
               case 113 -> 36;
               case 114 -> 207;
               case 115 -> 171;
               case 116 -> 152;
               case 117 -> 172;
               case 118 -> 199;
               case 119 -> 148;
               case 120 -> 13;
               case 121 -> 196;
               case 122 -> 100;
               case 123 -> 33;
               case 124 -> 230;
               case 125 -> 57;
               case 126 -> 48;
               case 127 -> 240;
               case 128 -> 1;
               case 129 -> 231;
               case 130 -> 29;
               case 131 -> 6;
               case 132 -> 193;
               case 133 -> 226;
               case 134 -> 50;
               case 135 -> 15;
               case 136 -> 75;
               case 137 -> 125;
               case 138 -> 159;
               case 139 -> 134;
               case 140 -> 101;
               case 141 -> 58;
               case 142 -> 61;
               case 143 -> 249;
               case 144 -> 147;
               case 145 -> 139;
               case 146 -> 119;
               case 147 -> 72;
               case 148 -> 114;
               case 149 -> 115;
               case 150 -> 211;
               case 151 -> 194;
               case 152 -> 30;
               case 153 -> 96;
               case 154 -> 128;
               case 155 -> 44;
               case 156 -> 157;
               case 157 -> 142;
               case 158 -> 84;
               case 159 -> 228;
               case 160 -> 190;
               case 161 -> 5;
               case 162 -> 73;
               case 163 -> 166;
               case 164 -> 71;
               case 165 -> 20;
               case 166 -> 233;
               case 167 -> 126;
               case 168 -> 94;
               case 169 -> 28;
               case 170 -> 2;
               case 171 -> 195;
               case 172 -> 250;
               case 173 -> 11;
               case 174 -> 237;
               case 175 -> 176;
               case 176 -> 243;
               case 177 -> 24;
               case 178 -> 76;
               case 179 -> 191;
               case 180 -> 60;
               case 181 -> 254;
               case 182 -> 120;
               case 183 -> 55;
               case 184 -> 39;
               case 185 -> 102;
               case 186 -> 109;
               case 187 -> 187;
               case 188 -> 203;
               case 189 -> 59;
               case 190 -> 210;
               case 191 -> 113;
               case 192 -> 111;
               case 193 -> 27;
               case 194 -> 234;
               case 195 -> 164;
               case 196 -> 141;
               case 197 -> 138;
               case 198 -> 206;
               case 199 -> 80;
               case 200 -> 56;
               case 201 -> 93;
               case 202 -> 90;
               case 203 -> 77;
               case 204 -> 146;
               case 205 -> 21;
               case 206 -> 242;
               case 207 -> 133;
               case 208 -> 105;
               case 209 -> 232;
               case 210 -> 65;
               case 211 -> 189;
               case 212 -> 218;
               case 213 -> 213;
               case 214 -> 163;
               case 215 -> 32;
               case 216 -> 151;
               case 217 -> 116;
               case 218 -> 253;
               case 219 -> 197;
               case 220 -> 215;
               case 221 -> 143;
               case 222 -> 12;
               case 223 -> 217;
               case 224 -> 62;
               case 225 -> 245;
               case 226 -> 168;
               case 227 -> 81;
               case 228 -> 38;
               case 229 -> 118;
               case 230 -> 188;
               case 231 -> 37;
               case 232 -> 201;
               case 233 -> 177;
               case 234 -> 108;
               case 235 -> 225;
               case 236 -> 47;
               case 237 -> 137;
               case 238 -> 26;
               case 239 -> 216;
               case 240 -> 129;
               case 241 -> 49;
               case 242 -> 238;
               case 243 -> 63;
               case 244 -> 3;
               case 245 -> 222;
               case 246 -> 91;
               case 247 -> 14;
               case 248 -> 89;
               case 249 -> 239;
               case 250 -> 40;
               case 251 -> 41;
               case 252 -> 200;
               case 253 -> 99;
               case 254 -> 106;
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

            b[var2] = new String(var3).intern();
         }

         return b[var2];
      }
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, boolean var1, boolean var2, boolean var3, me.octo.client.IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4, net.minecraft.core.BlockPos var5, boolean var6, net.minecraft.core.BlockPos var7, net.minecraft.core.BlockPos var8, net.minecraft.world.phys.Vec3 var9, int var10, net.minecraft.core.BlockPos var11, int var12, net.minecraft.core.BlockPos var13, int var14, net.minecraft.core.BlockPos var15, java.lang.Integer var16, java.lang.Integer var17, net.minecraft.core.BlockPos var18, int var19, boolean var20, boolean var21, int var22, int var23, java.lang.Object var24) {
         java.lang.String var25 = me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
         if ((var23 & 1) != 0) {
            if (var25 != null) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var23 & 2) != 0) {
            if (var25 != null) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var23 & 4) != 0) {
            if (var25 != null) {
               var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }
         if ((var23 & 8) != 0) {
            if (var25 != null) {
               var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }
         }
         if ((var23 & 16) != 0) {
            if (var25 != null) {
               var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }
         }
         if ((var23 & 32) != 0) {
            if (var25 != null) {
               var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }
         }
         if ((var23 & 64) != 0) {
            if (var25 != null) {
               var7 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            }
         }
         if ((var23 & 128) != 0) {
            if (var25 != null) {
               var8 = var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            }
         }
         if ((var23 & 256) != 0) {
            if (var25 != null) {
               var9 = var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            }
         }
         if ((var23 & 512) != 0) {
            if (var25 != null) {
               var10 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            }
         }
         if ((var23 & 1024) != 0) {
            if (var25 != null) {
               var11 = var0.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            }
         }
         if ((var23 & 2048) != 0) {
            if (var25 != null) {
               var12 = var0.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            }
         }
         if ((var23 & 4096) != 0) {
            if (var25 != null) {
               var13 = var0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            }
         }
         if ((var23 & 8192) != 0) {
            if (var25 != null) {
               var14 = var0.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
            }
         }
         if ((var23 & 16384) != 0) {
            if (var25 != null) {
               var15 = var0.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            }
         }
         if ((var23 & 32768) != 0) {
            if (var25 != null) {
               var16 = var0.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            }
         }
         if ((var23 & 65536) != 0) {
            if (var25 != null) {
               var17 = var0.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            }
         }
         if ((var23 & 131072) != 0) {
            if (var25 != null) {
               var18 = var0.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
            }
         }
         if ((var23 & 262144) != 0) {
            if (var25 != null) {
               var19 = var0.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
            }
         }
         if ((var23 & 524288) != 0) {
            if (var25 != null) {
               var20 = var0.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
            }
         }
         if ((var23 & 1048576) != 0) {
            if (var25 != null) {
               var21 = var0.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
            }
         }
         if ((var23 & 2097152) != 0) {
            if (var25 != null) {
               var22 = var0.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
            }
         }
         return var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22);
      }
}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private BlockPos lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull BlockPos var1, @NotNull BlockPos var2) {
         short var10001 = 20043;
         short var10002 = -21525;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = 20041;
         var10002 = -25015;
         Intrinsics.checkNotNullParameter(var2, "visiblePos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockPos b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void a(@NotNull BlockPos var1) {
         short var10001 = 20042;
         short var10002 = -7988;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }

      @NotNull
      public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "]\u0000M\u0007\u001bBV\u00955\u0089\u0006\nö\u0000þ\u0099»å*é\u0001ÿ";
         int var4 = "]\u0000M\u0007\u001bBV\u00955\u0089\u0006\nö\u0000þ\u0099»å*é\u0001ÿ".length();
         char var1 = 3;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 26;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 26;
                  var10006 = var6;
               } else {
                  var13 = 26;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 26;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 85;
                     case 1 -> 87;
                     case 2 -> 24;
                     case 3 -> 7;
                     case 4 -> 65;
                     case 5 -> 71;
                     default -> 103;
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
         int var2 = (var0 ^ 20043) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 76;
               case 1 -> 149;
               case 2 -> 110;
               case 3 -> 126;
               case 4 -> 181;
               case 5 -> 30;
               case 6 -> 148;
               case 7 -> 229;
               case 8 -> 13;
               case 9 -> 78;
               case 10 -> 115;
               case 11 -> 106;
               case 12 -> 60;
               case 13 -> 133;
               case 14 -> 67;
               case 15 -> 17;
               case 16 -> 118;
               case 17 -> 43;
               case 18 -> 137;
               case 19 -> 192;
               case 20 -> 206;
               case 21 -> 169;
               case 22 -> 240;
               case 23 -> 134;
               case 24 -> 173;
               case 25 -> 163;
               case 26 -> 247;
               case 27 -> 72;
               case 28 -> 161;
               case 29 -> 175;
               case 30 -> 127;
               case 31 -> 188;
               case 32 -> 217;
               case 33 -> 144;
               case 34 -> 162;
               case 35 -> 19;
               case 36 -> 208;
               case 37 -> 79;
               case 38 -> 231;
               case 39 -> 232;
               case 40 -> 27;
               case 41 -> 182;
               case 42 -> 238;
               case 43 -> 68;
               case 44 -> 224;
               case 45 -> 170;
               case 46 -> 113;
               case 47 -> 129;
               case 48 -> 164;
               case 49 -> 193;
               case 50 -> 230;
               case 51 -> 26;
               case 52 -> 177;
               case 53 -> 4;
               case 54 -> 255;
               case 55 -> 1;
               case 56 -> 145;
               case 57 -> 199;
               case 58 -> 44;
               case 59 -> 233;
               case 60 -> 157;
               case 61 -> 156;
               case 62 -> 242;
               case 63 -> 59;
               case 64 -> 226;
               case 65 -> 212;
               case 66 -> 194;
               case 67 -> 53;
               case 68 -> 241;
               case 69 -> 183;
               case 70 -> 47;
               case 71 -> 69;
               case 72 -> 40;
               case 73 -> 35;
               case 74 -> 105;
               case 75 -> 150;
               case 76 -> 120;
               case 77 -> 104;
               case 78 -> 95;
               case 79 -> 24;
               case 80 -> 77;
               case 81 -> 184;
               case 82 -> 56;
               case 83 -> 130;
               case 84 -> 100;
               case 85 -> 132;
               case 86 -> 11;
               case 87 -> 179;
               case 88 -> 166;
               case 89 -> 153;
               case 90 -> 92;
               case 91 -> 252;
               case 92 -> 83;
               case 93 -> 214;
               case 94 -> 15;
               case 95 -> 2;
               case 96 -> 189;
               case 97 -> 246;
               case 98 -> 114;
               case 99 -> 200;
               case 100 -> 99;
               case 101 -> 140;
               case 102 -> 202;
               case 103 -> 190;
               case 104 -> 187;
               case 105 -> 180;
               case 106 -> 198;
               case 107 -> 197;
               case 108 -> 3;
               case 109 -> 168;
               case 110 -> 22;
               case 111 -> 0;
               case 112 -> 45;
               case 113 -> 131;
               case 114 -> 33;
               case 115 -> 82;
               case 116 -> 155;
               case 117 -> 81;
               case 118 -> 196;
               case 119 -> 62;
               case 120 -> 174;
               case 121 -> 191;
               case 122 -> 64;
               case 123 -> 185;
               case 124 -> 215;
               case 125 -> 236;
               case 126 -> 101;
               case 127 -> 205;
               case 128 -> 28;
               case 129 -> 124;
               case 130 -> 218;
               case 131 -> 143;
               case 132 -> 73;
               case 133 -> 136;
               case 134 -> 8;
               case 135 -> 9;
               case 136 -> 90;
               case 137 -> 147;
               case 138 -> 159;
               case 139 -> 111;
               case 140 -> 211;
               case 141 -> 89;
               case 142 -> 71;
               case 143 -> 146;
               case 144 -> 54;
               case 145 -> 119;
               case 146 -> 14;
               case 147 -> 31;
               case 148 -> 36;
               case 149 -> 219;
               case 150 -> 97;
               case 151 -> 63;
               case 152 -> 117;
               case 153 -> 49;
               case 154 -> 10;
               case 155 -> 139;
               case 156 -> 84;
               case 157 -> 253;
               case 158 -> 135;
               case 159 -> 18;
               case 160 -> 234;
               case 161 -> 142;
               case 162 -> 112;
               case 163 -> 23;
               case 164 -> 96;
               case 165 -> 80;
               case 166 -> 249;
               case 167 -> 171;
               case 168 -> 254;
               case 169 -> 29;
               case 170 -> 160;
               case 171 -> 39;
               case 172 -> 102;
               case 173 -> 186;
               case 174 -> 65;
               case 175 -> 51;
               case 176 -> 55;
               case 177 -> 74;
               case 178 -> 203;
               case 179 -> 88;
               case 180 -> 220;
               case 181 -> 25;
               case 182 -> 48;
               case 183 -> 94;
               case 184 -> 6;
               case 185 -> 122;
               case 186 -> 34;
               case 187 -> 21;
               case 188 -> 209;
               case 189 -> 245;
               case 190 -> 210;
               case 191 -> 52;
               case 192 -> 222;
               case 193 -> 123;
               case 194 -> 7;
               case 195 -> 42;
               case 196 -> 5;
               case 197 -> 221;
               case 198 -> 125;
               case 199 -> 239;
               case 200 -> 251;
               case 201 -> 151;
               case 202 -> 152;
               case 203 -> 66;
               case 204 -> 201;
               case 205 -> 57;
               case 206 -> 178;
               case 207 -> 20;
               case 208 -> 50;
               case 209 -> 216;
               case 210 -> 228;
               case 211 -> 244;
               case 212 -> 98;
               case 213 -> 213;
               case 214 -> 61;
               case 215 -> 108;
               case 216 -> 235;
               case 217 -> 85;
               case 218 -> 75;
               case 219 -> 243;
               case 220 -> 237;
               case 221 -> 225;
               case 222 -> 32;
               case 223 -> 121;
               case 224 -> 172;
               case 225 -> 87;
               case 226 -> 58;
               case 227 -> 141;
               case 228 -> 16;
               case 229 -> 250;
               case 230 -> 109;
               case 231 -> 176;
               case 232 -> 227;
               case 233 -> 158;
               case 234 -> 41;
               case 235 -> 38;
               case 236 -> 70;
               case 237 -> 116;
               case 238 -> 128;
               case 239 -> 12;
               case 240 -> 248;
               case 241 -> 91;
               case 242 -> 103;
               case 243 -> 46;
               case 244 -> 93;
               case 245 -> 167;
               case 246 -> 138;
               case 247 -> 207;
               case 248 -> 195;
               case 249 -> 223;
               case 250 -> 204;
               case 251 -> 107;
               case 252 -> 37;
               case 253 -> 165;
               case 254 -> 86;
               default -> 154;
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

   static boolean a(me.octo.client.IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI p0
   , net.minecraft.core.BlockPos p1
   , boolean p2
   , int pMask, java.lang.Object pDummy) {
      if ((pMask & 2) != 0) {
         p2 = false;
      }
      return p0.a(p1, p2);
   }
   static net.minecraft.core.BlockPos a(me.octo.client.IIlIllIIllIllIIIIIIIIlIllIIIIIIIIIIlllIIlIIlIIllllIIlllIlIlllIlIIllIIllIIllIIlIllIllI p0
   , boolean p1
   , int pMask, java.lang.Object pDummy) {
      if ((pMask & 1) != 0) {
         p1 = false;
      }
      return p0.d(p1);
   }

}
