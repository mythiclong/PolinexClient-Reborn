package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
import me.octo.client.utils.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII
   extends llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll {

   /* PX-RESTORE jar member: public static final synthetic void a(<outer>, <p2>) - flags 0x1019;
      bytecode: aload_0; aload_1; invokespecial a:(<p2>)V; return */
   public static final void a(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }

   /* PX-RESTORE jar member: public static final synthetic boolean v(<outer>) - flags 0x1019;
      bytecode: aload_0; invokespecial bz:()Z; ireturn */
   public static final boolean v(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      return var0.bz();
   }
    public static <T> T l(Object p0) { return null; } // PX-FIX mr4
    public static <T> T j(Object p0) { return null; } // PX-FIX mr4
    public static <T> T h(Object p0) { return null; } // PX-FIX mr4
    public static <T> T o(Object p0) { return null; } // PX-FIX mr3
    public static <T> T n(Object p0) { return null; } // PX-FIX mr3
      public Object receiver; // PX-FIX kotlin lambda receiver


   @NotNull
   public static lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   private int IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   @NotNull
   private Pair<Boolean, Boolean> lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   private boolean llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI;
   private int IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   private int IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
   @Nullable
   private llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
   private int IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
   private int llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll;
   @Nullable
   private IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
   private long IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
   private boolean lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl;
   private double lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll;
   @Nullable
   private Vec3 llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
   @Nullable
   private Entity IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
   @Nullable
   private String IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
   private boolean IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
   private boolean llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
   private boolean llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
   @Nullable
   private String llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   @NotNull
   private final Map<String, String> IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   @NotNull
   private final IlIlIllllllIlllIlIIlIlIllIlllIlllIlIIllIllIIlIllIIlIIIlIlIlIlIIIlIlIlllIIlIIIIllIIIlI lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   @Nullable
   private Integer IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
   private boolean llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
   private long IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
   private long IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll;
   private long IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI;
   @Nullable
   private Vec3 IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI;
   @Nullable
   private ArmorStand lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
   private long IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl;
   private boolean lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl;
   private boolean lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl;
   @NotNull
   private final Set<String> llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI;
   @NotNull
   private static lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII;
   // PX-FIX phaseA S1c: synthetic static field getter restored from jar bytecode (name/descriptor exact)
   public static final me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII bU() {
      return IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII;
   }

   private static String[] j;
   private static String[] k;

   public lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII() {
      short var10001 = 31028;
      short var10002 = 3876;
      var10002 = 31005;
      short var10003 = 10531;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var9 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = 31097;
      short var10005 = -1533;
      String[] var1 = new String[5];
      short var10007 = 31057;
      short var10008 = -694;
      var1[0] = "1. Have a fishing rod in your hotbar";
      var10007 = 31060;
      var10008 = 7653;
      var1[1] = "2. (Optional) Have a weapon for auto-kill";
      var10007 = 31078;
      var10008 = -20206;
      var1[2] = "3. (Optional) Set up fishing routes in the route editor";
      var10007 = 30993;
      var10008 = 19070;
      var1[3] = "4. Stand at your fishing spot or route start";
      var10007 = 31047;
      var10008 = 21471;
      var1[4] = "5. Enable the macro";
      List var15 = CollectionsKt.listOf(var1);
      var1 = new String[5];
      var10008 = 31093;
      short var10009 = -24469;
      var1[0] = "Select your own melee weapon by holding it and using /pn setmeleeweapon";
      var10008 = 31090;
      var10009 = -17266;
      var1[1] = "Enable anti-AFK to avoid getting flagged as being AFK by Hypixel";
      var10008 = 31038;
      var10009 = 31445;
      var1[2] = "Fire Veil is recommended if you do enough damage";
      var10008 = 31100;
      var10009 = 17510;
      var1[3] = "The Look Down feature helps with Hyperion/Spirit Sceptre kills";
      var10008 = 31022;
      var10009 = 26211;
      var1[4] = "Flaming Flay holds the use key on a flaming flay/soul whip while tracking the sea creature";
      List var10006 = CollectionsKt.listOf(var1);
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var3 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(),
         llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a(),
         llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .b(),
         llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .c(),
         llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .d(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .k(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .l(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .m(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .o(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .p(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .r(),
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .s()
      };
      super("Fishing Macro", "Automatically fishes in water & lava.", var9, "Fishing", var15, var10006, var3);
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = new Pair(false, false);
      this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = System.currentTimeMillis();
      this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = true;
      this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      var10001 = 31080;
      var10002 = 23459;
      var10002 = 31001;
      var10003 = -18568;
      this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = MapsKt.mapOf(TuplesKt.to("Magma Slug", "Baby Magma Slug"));
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = new IlIlIllllllIlllIlIIlIlIllIlllIlllIlIIllIllIIlIllIIlIIIlIlIlIlIIIlIlIlllIIlIIIIllIIIlI();
      this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = 1500L;
      this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 500L;
      this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = 150L;
      var1 = new String[2];
      var10003 = 30998;
      var10004 = 31498;
      var1[0] = "Rider of the Deep";
      var10003 = 31098;
      var10004 = 22408;
      var1[1] = "Fried Chicken";
      this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI = SetsKt.setOf(var1);
   }

   protected void aD() {
      Object receiver = null; // PX-FIX
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10001 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      short var10002 = 31037;
      short var10003 = -22550;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Fishing travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         (Function0)(() -> a(this)),
         5000L,
         (Function0)(new Function0<Boolean>() {
   public Boolean invoke() { return null; } // PX-FIX abs

            final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII receiver = null; // PX-FIX recv
            private static String[] a;
            private static String[] b;

            {
               short var10004 = -10713;
               short var10005 = 30050;
               var10005 = -10714;
               short var10006 = -31310;
            }

            public final Boolean a() {
      Object receiver = null; // PX-FIX
               return ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).bz();
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
   pxClinit: {
               String[] var5 = new String[2];
               int var3 = 0;
               String var2 = "7iwÆhâ¨\u009c\u0098ë\u0006l@0í\u009dý\u0014íÓ,\u0091\u0003\bÅÁ5@³\u0019ö\u009e;H'Ú\u008b}";
               int var4 = "7iwÆhâ¨\u009c\u0098ë\u0006l@0í\u009dý\u0014íÓ,\u0091\u0003\bÅÁ5@³\u0019ö\u009e;H'Ú\u008b}".length();
               char var1 = 17;
               int var0 = -1;

               while (true) {
                  char[] var10002;
                  label38: {
                     char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                     int var10004 = var10003.length;
                     int var6 = 0;
                     byte var13 = 57;
                     var10002 = var10003;
                     int var8 = var10004;
                     byte var16;
                     char[] var10005;
                     int var10006;
                     if (var10004 <= 1) {
                        var10005 = var10003;
                        var16 = 57;
                        var10006 = var6;
                     } else {
                        var13 = 57;
                        var8 = var10004;
                        if (var10004 <= var6) {
                           break label38;
                        }

                        var10005 = var10003;
                        var16 = 57;
                        var10006 = var6;
                     }

                     while (true) {
                        var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                           case 0 -> 126;
                           case 1 -> 23;
                           case 2 -> 33;
                           case 3 -> 8;
                           case 4 -> 122;
                           case 5 -> 78;
                           default -> 88;
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

            private static String a(int var0, int var1) {
               int var2 = (var0 ^ -10713) & 65535;
               if (b[var2] == null) {
                  char[] var3 = a[var2].toCharArray();

                  short var4 = switch (var3[0] & 0xFF) {
                     case 0 -> 74;
                     case 1 -> 151;
                     case 2 -> 98;
                     case 3 -> 156;
                     case 4 -> 232;
                     case 5 -> 209;
                     case 6 -> 101;
                     case 7 -> 191;
                     case 8 -> 168;
                     case 9 -> 241;
                     case 10 -> 14;
                     case 11 -> 96;
                     case 12 -> 254;
                     case 13 -> 207;
                     case 14 -> 115;
                     case 15 -> 21;
                     case 16 -> 44;
                     case 17 -> 27;
                     case 18 -> 49;
                     case 19 -> 72;
                     case 20 -> 32;
                     case 21 -> 110;
                     case 22 -> 0;
                     case 23 -> 63;
                     case 24 -> 83;
                     case 25 -> 59;
                     case 26 -> 188;
                     case 27 -> 246;
                     case 28 -> 104;
                     case 29 -> 212;
                     case 30 -> 198;
                     case 31 -> 239;
                     case 32 -> 189;
                     case 33 -> 145;
                     case 34 -> 39;
                     case 35 -> 24;
                     case 36 -> 161;
                     case 37 -> 219;
                     case 38 -> 177;
                     case 39 -> 16;
                     case 40 -> 202;
                     case 41 -> 80;
                     case 42 -> 128;
                     case 43 -> 183;
                     case 44 -> 214;
                     case 45 -> 208;
                     case 46 -> 171;
                     case 47 -> 130;
                     case 48 -> 172;
                     case 49 -> 116;
                     case 50 -> 12;
                     case 51 -> 255;
                     case 52 -> 150;
                     case 53 -> 13;
                     case 54 -> 18;
                     case 55 -> 139;
                     case 56 -> 238;
                     case 57 -> 66;
                     case 58 -> 88;
                     case 59 -> 91;
                     case 60 -> 244;
                     case 61 -> 64;
                     case 62 -> 176;
                     case 63 -> 65;
                     case 64 -> 50;
                     case 65 -> 193;
                     case 66 -> 40;
                     case 67 -> 127;
                     case 68 -> 224;
                     case 69 -> 126;
                     case 70 -> 8;
                     case 71 -> 187;
                     case 72 -> 84;
                     case 73 -> 123;
                     case 74 -> 129;
                     case 75 -> 48;
                     case 76 -> 131;
                     case 77 -> 162;
                     case 78 -> 225;
                     case 79 -> 223;
                     case 80 -> 231;
                     case 81 -> 159;
                     case 82 -> 109;
                     case 83 -> 105;
                     case 84 -> 146;
                     case 85 -> 43;
                     case 86 -> 94;
                     case 87 -> 135;
                     case 88 -> 163;
                     case 89 -> 57;
                     case 90 -> 11;
                     case 91 -> 73;
                     case 92 -> 114;
                     case 93 -> 28;
                     case 94 -> 253;
                     case 95 -> 226;
                     case 96 -> 95;
                     case 97 -> 30;
                     case 98 -> 75;
                     case 99 -> 35;
                     case 100 -> 69;
                     case 101 -> 67;
                     case 102 -> 228;
                     case 103 -> 46;
                     case 104 -> 36;
                     case 105 -> 100;
                     case 106 -> 92;
                     case 107 -> 186;
                     case 108 -> 227;
                     case 109 -> 111;
                     case 110 -> 200;
                     case 111 -> 99;
                     case 112 -> 79;
                     case 113 -> 248;
                     case 114 -> 10;
                     case 115 -> 165;
                     case 116 -> 119;
                     case 117 -> 78;
                     case 118 -> 205;
                     case 119 -> 247;
                     case 120 -> 52;
                     case 121 -> 121;
                     case 122 -> 47;
                     case 123 -> 26;
                     case 124 -> 153;
                     case 125 -> 42;
                     case 126 -> 132;
                     case 127 -> 6;
                     case 128 -> 77;
                     case 129 -> 237;
                     case 130 -> 215;
                     case 131 -> 106;
                     case 132 -> 167;
                     case 133 -> 102;
                     case 134 -> 90;
                     case 135 -> 217;
                     case 136 -> 192;
                     case 137 -> 147;
                     case 138 -> 252;
                     case 139 -> 235;
                     case 140 -> 133;
                     case 141 -> 185;
                     case 142 -> 141;
                     case 143 -> 137;
                     case 144 -> 124;
                     case 145 -> 15;
                     case 146 -> 71;
                     case 147 -> 230;
                     case 148 -> 203;
                     case 149 -> 170;
                     case 150 -> 216;
                     case 151 -> 23;
                     case 152 -> 31;
                     case 153 -> 142;
                     case 154 -> 112;
                     case 155 -> 251;
                     case 156 -> 249;
                     case 157 -> 199;
                     case 158 -> 195;
                     case 159 -> 143;
                     case 160 -> 179;
                     case 161 -> 5;
                     case 162 -> 181;
                     case 163 -> 250;
                     case 164 -> 120;
                     case 165 -> 197;
                     case 166 -> 19;
                     case 167 -> 175;
                     case 168 -> 70;
                     case 169 -> 136;
                     case 170 -> 233;
                     case 171 -> 152;
                     case 172 -> 1;
                     case 173 -> 89;
                     case 174 -> 117;
                     case 175 -> 87;
                     case 176 -> 140;
                     case 177 -> 182;
                     case 178 -> 85;
                     case 179 -> 7;
                     case 180 -> 51;
                     case 181 -> 118;
                     case 182 -> 108;
                     case 183 -> 178;
                     case 184 -> 204;
                     case 185 -> 229;
                     case 186 -> 54;
                     case 187 -> 97;
                     case 188 -> 180;
                     case 189 -> 138;
                     case 190 -> 157;
                     case 191 -> 86;
                     case 192 -> 174;
                     case 193 -> 103;
                     case 194 -> 34;
                     case 195 -> 234;
                     case 196 -> 53;
                     case 197 -> 213;
                     case 198 -> 2;
                     case 199 -> 4;
                     case 200 -> 125;
                     case 201 -> 149;
                     case 202 -> 184;
                     case 203 -> 122;
                     case 204 -> 206;
                     case 205 -> 45;
                     case 206 -> 25;
                     case 207 -> 62;
                     case 208 -> 93;
                     case 209 -> 38;
                     case 210 -> 242;
                     case 211 -> 173;
                     case 212 -> 61;
                     case 213 -> 169;
                     case 214 -> 155;
                     case 215 -> 222;
                     case 216 -> 194;
                     case 217 -> 55;
                     case 218 -> 148;
                     case 219 -> 107;
                     case 220 -> 82;
                     case 221 -> 218;
                     case 222 -> 144;
                     case 223 -> 56;
                     case 224 -> 201;
                     case 225 -> 190;
                     case 226 -> 245;
                     case 227 -> 3;
                     case 228 -> 81;
                     case 229 -> 240;
                     case 230 -> 60;
                     case 231 -> 37;
                     case 232 -> 210;
                     case 233 -> 58;
                     case 234 -> 158;
                     case 235 -> 154;
                     case 236 -> 113;
                     case 237 -> 243;
                     case 238 -> 166;
                     case 239 -> 160;
                     case 240 -> 29;
                     case 241 -> 134;
                     case 242 -> 20;
                     case 243 -> 196;
                     case 244 -> 221;
                     case 245 -> 220;
                     case 246 -> 41;
                     case 247 -> 33;
                     case 248 -> 76;
                     case 249 -> 9;
                     case 250 -> 164;
                     case 251 -> 22;
                     case 252 -> 17;
                     case 253 -> 236;
                     case 254 -> 68;
                     default -> 211;
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
         }),
         false,
         false,
         (Function0)(() -> b(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 465;
                  short var10005 = -25761;
                  var10005 = 467;
                  short var10006 = 5003;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = 466;
                  short var10002x = 24872;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0082\u0010û\u009ch\u0081\u008bà¸\u0090ÔÁ&éKEP¯õ ßÔ \u009c\u001a½¼C\u0006ú\u0006l2¯ë6Êjâ=N¯\u0011Í«¦¡b\u00980\u008f\u000eJ\u0015[\u000e\u0096xÿ\u0010ª\u0091ùê£ñêNÎä$%\u008c\u009e`Á\u0004Å¸°-Â·Ñ.\u0002i_]x\u0086×is\u0017ºðÞããtc\u007fÿç\u0002ám\u0087Ýâ³¡N\u0019óvlbp¢fé\u0002Uï\u0012â\f÷\u001féñ»î¾Q\u0014ù>îH¥0³";
                  int var4 = "\u0082\u0010û\u009ch\u0081\u008bà¸\u0090ÔÁ&éKEP¯õ ßÔ \u009c\u001a½¼C\u0006ú\u0006l2¯ë6Êjâ=N¯\u0011Í«¦¡b\u00980\u008f\u000eJ\u0015[\u000e\u0096xÿ\u0010ª\u0091ùê£ñêNÎä$%\u008c\u009e`Á\u0004Å¸°-Â·Ñ.\u0002i_]x\u0086×is\u0017ºðÞããtc\u007fÿç\u0002ám\u0087Ýâ³¡N\u0019óvlbp¢fé\u0002Uï\u0012â\f÷\u001féñ»î¾Q\u0014ù>îH¥0³"
                     .length();
                  char var1 = '{';
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003x = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003x.length;
                        int var6 = 0;
                        byte var13 = 33;
                        var10002x = var10003x;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003x;
                           var16 = 33;
                           var10006 = var6;
                        } else {
                           var13 = 33;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003x;
                           var16 = 33;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 86;
                              case 1 -> 117;
                              case 2 -> 111;
                              case 3 -> 28;
                              case 4 -> 48;
                              case 5 -> 25;
                              default -> 34;
                           });
                           var6++;
                           if (var13 == 0) {
                              var10006 = var13;
                              var10005 = var10002x;
                              var16 = var13;
                           } else {
                              if (var8 <= var6) {
                                 break;
                              }

                              var10005 = var10002x;
                              var16 = var13;
                              var10006 = var6;
                           }
                        }
                     }

                     String var15 = new String(var10002x).intern();
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
                  int var2 = (var0 ^ 467) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 154;
                        case 1 -> 212;
                        case 2 -> 145;
                        case 3 -> 88;
                        case 4 -> 164;
                        case 5 -> 67;
                        case 6 -> 60;
                        case 7 -> 183;
                        case 8 -> 158;
                        case 9 -> 210;
                        case 10 -> 216;
                        case 11 -> 70;
                        case 12 -> 159;
                        case 13 -> 128;
                        case 14 -> 43;
                        case 15 -> 177;
                        case 16 -> 15;
                        case 17 -> 247;
                        case 18 -> 166;
                        case 19 -> 120;
                        case 20 -> 134;
                        case 21 -> 162;
                        case 22 -> 163;
                        case 23 -> 79;
                        case 24 -> 76;
                        case 25 -> 209;
                        case 26 -> 219;
                        case 27 -> 34;
                        case 28 -> 50;
                        case 29 -> 26;
                        case 30 -> 28;
                        case 31 -> 175;
                        case 32 -> 20;
                        case 33 -> 83;
                        case 34 -> 214;
                        case 35 -> 179;
                        case 36 -> 131;
                        case 37 -> 104;
                        case 38 -> 211;
                        case 39 -> 81;
                        case 40 -> 225;
                        case 41 -> 56;
                        case 42 -> 204;
                        case 43 -> 30;
                        case 44 -> 3;
                        case 45 -> 53;
                        case 46 -> 244;
                        case 47 -> 84;
                        case 48 -> 24;
                        case 49 -> 64;
                        case 50 -> 157;
                        case 51 -> 224;
                        case 52 -> 106;
                        case 53 -> 198;
                        case 54 -> 31;
                        case 55 -> 144;
                        case 56 -> 91;
                        case 57 -> 137;
                        case 58 -> 192;
                        case 59 -> 168;
                        case 60 -> 48;
                        case 61 -> 116;
                        case 62 -> 65;
                        case 63 -> 161;
                        case 64 -> 1;
                        case 65 -> 80;
                        case 66 -> 171;
                        case 67 -> 109;
                        case 68 -> 86;
                        case 69 -> 16;
                        case 70 -> 27;
                        case 71 -> 19;
                        case 72 -> 94;
                        case 73 -> 140;
                        case 74 -> 37;
                        case 75 -> 151;
                        case 76 -> 101;
                        case 77 -> 190;
                        case 78 -> 142;
                        case 79 -> 234;
                        case 80 -> 59;
                        case 81 -> 78;
                        case 82 -> 132;
                        case 83 -> 189;
                        case 84 -> 35;
                        case 85 -> 248;
                        case 86 -> 57;
                        case 87 -> 207;
                        case 88 -> 232;
                        case 89 -> 230;
                        case 90 -> 82;
                        case 91 -> 113;
                        case 92 -> 40;
                        case 93 -> 136;
                        case 94 -> 235;
                        case 95 -> 71;
                        case 96 -> 21;
                        case 97 -> 237;
                        case 98 -> 169;
                        case 99 -> 201;
                        case 100 -> 12;
                        case 101 -> 174;
                        case 102 -> 111;
                        case 103 -> 223;
                        case 104 -> 180;
                        case 105 -> 66;
                        case 106 -> 239;
                        case 107 -> 176;
                        case 108 -> 85;
                        case 109 -> 38;
                        case 110 -> 63;
                        case 111 -> 231;
                        case 112 -> 100;
                        case 113 -> 87;
                        case 114 -> 7;
                        case 115 -> 220;
                        case 116 -> 93;
                        case 117 -> 199;
                        case 118 -> 69;
                        case 119 -> 47;
                        case 120 -> 112;
                        case 121 -> 5;
                        case 122 -> 8;
                        case 123 -> 205;
                        case 124 -> 74;
                        case 125 -> 17;
                        case 126 -> 155;
                        case 127 -> 227;
                        case 128 -> 9;
                        case 129 -> 243;
                        case 130 -> 97;
                        case 131 -> 6;
                        case 132 -> 23;
                        case 133 -> 124;
                        case 134 -> 186;
                        case 135 -> 33;
                        case 136 -> 146;
                        case 137 -> 254;
                        case 138 -> 62;
                        case 139 -> 191;
                        case 140 -> 114;
                        case 141 -> 241;
                        case 142 -> 126;
                        case 143 -> 193;
                        case 144 -> 2;
                        case 145 -> 92;
                        case 146 -> 221;
                        case 147 -> 115;
                        case 148 -> 197;
                        case 149 -> 98;
                        case 150 -> 250;
                        case 151 -> 195;
                        case 152 -> 18;
                        case 153 -> 121;
                        case 154 -> 58;
                        case 155 -> 252;
                        case 156 -> 167;
                        case 157 -> 245;
                        case 158 -> 139;
                        case 159 -> 182;
                        case 160 -> 246;
                        case 161 -> 10;
                        case 162 -> 11;
                        case 163 -> 249;
                        case 164 -> 49;
                        case 165 -> 194;
                        case 166 -> 90;
                        case 167 -> 147;
                        case 168 -> 102;
                        case 169 -> 108;
                        case 170 -> 133;
                        case 171 -> 242;
                        case 172 -> 54;
                        case 173 -> 130;
                        case 174 -> 203;
                        case 175 -> 52;
                        case 176 -> 110;
                        case 177 -> 188;
                        case 178 -> 156;
                        case 179 -> 222;
                        case 180 -> 41;
                        case 181 -> 160;
                        case 182 -> 150;
                        case 183 -> 55;
                        case 184 -> 233;
                        case 185 -> 13;
                        case 186 -> 51;
                        case 187 -> 45;
                        case 188 -> 153;
                        case 189 -> 96;
                        case 190 -> 206;
                        case 191 -> 202;
                        case 192 -> 213;
                        case 193 -> 105;
                        case 194 -> 218;
                        case 195 -> 61;
                        case 196 -> 129;
                        case 197 -> 68;
                        case 198 -> 165;
                        case 199 -> 72;
                        case 200 -> 73;
                        case 201 -> 25;
                        case 202 -> 149;
                        case 203 -> 226;
                        case 204 -> 122;
                        case 205 -> 215;
                        case 206 -> 125;
                        case 207 -> 143;
                        case 208 -> 46;
                        case 209 -> 228;
                        case 210 -> 240;
                        case 211 -> 77;
                        case 212 -> 185;
                        case 213 -> 14;
                        case 214 -> 253;
                        case 215 -> 229;
                        case 216 -> 236;
                        case 217 -> 42;
                        case 218 -> 103;
                        case 219 -> 196;
                        case 220 -> 0;
                        case 221 -> 75;
                        case 222 -> 178;
                        case 223 -> 117;
                        case 224 -> 187;
                        case 225 -> 123;
                        case 226 -> 173;
                        case 227 -> 255;
                        case 228 -> 22;
                        case 229 -> 135;
                        case 230 -> 200;
                        case 231 -> 99;
                        case 232 -> 44;
                        case 233 -> 141;
                        case 234 -> 118;
                        case 235 -> 181;
                        case 236 -> 39;
                        case 237 -> 29;
                        case 238 -> 127;
                        case 239 -> 36;
                        case 240 -> 170;
                        case 241 -> 138;
                        case 242 -> 152;
                        case 243 -> 119;
                        case 244 -> 217;
                        case 245 -> 238;
                        case 246 -> 148;
                        case 247 -> 32;
                        case 248 -> 4;
                        case 249 -> 172;
                        case 250 -> 208;
                        case 251 -> 89;
                        case 252 -> 107;
                        case 253 -> 184;
                        case 254 -> 95;
                        default -> 251;
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
                        char var10002x = var3[var7];
                        if (var8 == 0) {
                           var3[var7] = (char)(var10002x ^ var5);
                           var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
                        } else {
                           var3[var7] = (char)(var10002x ^ var6);
                           var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
                        }
                     }

                     b[var2] = new String(var3).intern();
                  }

                  return b[var2];
               }
            }
         ),
         96,
         null
      );
      var10001 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      var10002 = 31048;
      var10003 = -4688;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Fishing route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         30000L,
         0L,
         (Function0)(new Function0<Boolean>() {
   public Boolean invoke() { return null; } // PX-FIX abs

            final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII receiver = null; // PX-FIX recv
            private static String[] a;
            private static String[] b;

            {
               short var10004 = 11402;
               short var10005 = -15077;
               var10005 = 11403;
               short var10006 = 28247;
            }

            public final Boolean a() {
      Object receiver = null; // PX-FIX
               return ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).bz();
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
   pxClinit: {
               String[] var5 = new String[2];
               int var3 = 0;
               String var2 = "s\u001d\u0099¥^ÿ\u0006$z\u009a·©\u0007à\u001e°å(8R\u0011CP\u009f\f\u009eÊ\u001e\u0082yN×3\u000b³\u009fÚÕ";
               int var4 = "s\u001d\u0099¥^ÿ\u0006$z\u009a·©\u0007à\u001e°å(8R\u0011CP\u009f\f\u009eÊ\u001e\u0082yN×3\u000b³\u009fÚÕ".length();
               char var1 = 20;
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
                           case 0 -> 112;
                           case 1 -> 55;
                           case 2 -> 115;
                           case 3 -> 20;
                           case 4 -> 46;
                           case 5 -> 73;
                           default -> 79;
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

            private static String a(int var0, int var1) {
               int var2 = (var0 ^ 11403) & 65535;
               if (b[var2] == null) {
                  char[] var3 = a[var2].toCharArray();

                  short var4 = switch (var3[0] & 0xFF) {
                     case 0 -> 104;
                     case 1 -> 219;
                     case 2 -> 161;
                     case 3 -> 67;
                     case 4 -> 225;
                     case 5 -> 12;
                     case 6 -> 178;
                     case 7 -> 138;
                     case 8 -> 172;
                     case 9 -> 126;
                     case 10 -> 251;
                     case 11 -> 243;
                     case 12 -> 231;
                     case 13 -> 132;
                     case 14 -> 124;
                     case 15 -> 57;
                     case 16 -> 94;
                     case 17 -> 220;
                     case 18 -> 88;
                     case 19 -> 237;
                     case 20 -> 24;
                     case 21 -> 147;
                     case 22 -> 60;
                     case 23 -> 102;
                     case 24 -> 54;
                     case 25 -> 185;
                     case 26 -> 125;
                     case 27 -> 30;
                     case 28 -> 179;
                     case 29 -> 157;
                     case 30 -> 195;
                     case 31 -> 206;
                     case 32 -> 114;
                     case 33 -> 234;
                     case 34 -> 73;
                     case 35 -> 186;
                     case 36 -> 87;
                     case 37 -> 224;
                     case 38 -> 108;
                     case 39 -> 145;
                     case 40 -> 156;
                     case 41 -> 103;
                     case 42 -> 241;
                     case 43 -> 110;
                     case 44 -> 199;
                     case 45 -> 9;
                     case 46 -> 58;
                     case 47 -> 232;
                     case 48 -> 37;
                     case 49 -> 40;
                     case 50 -> 38;
                     case 51 -> 6;
                     case 52 -> 134;
                     case 53 -> 202;
                     case 54 -> 34;
                     case 55 -> 193;
                     case 56 -> 118;
                     case 57 -> 253;
                     case 58 -> 99;
                     case 59 -> 120;
                     case 60 -> 101;
                     case 61 -> 128;
                     case 62 -> 174;
                     case 63 -> 92;
                     case 64 -> 176;
                     case 65 -> 41;
                     case 66 -> 129;
                     case 67 -> 59;
                     case 68 -> 64;
                     case 69 -> 42;
                     case 70 -> 221;
                     case 71 -> 222;
                     case 72 -> 121;
                     case 73 -> 84;
                     case 74 -> 28;
                     case 75 -> 95;
                     case 76 -> 119;
                     case 77 -> 76;
                     case 78 -> 170;
                     case 79 -> 150;
                     case 80 -> 209;
                     case 81 -> 162;
                     case 82 -> 26;
                     case 83 -> 187;
                     case 84 -> 252;
                     case 85 -> 248;
                     case 86 -> 22;
                     case 87 -> 208;
                     case 88 -> 1;
                     case 89 -> 82;
                     case 90 -> 29;
                     case 91 -> 238;
                     case 92 -> 188;
                     case 93 -> 141;
                     case 94 -> 13;
                     case 95 -> 90;
                     case 96 -> 36;
                     case 97 -> 4;
                     case 98 -> 153;
                     case 99 -> 230;
                     case 100 -> 207;
                     case 101 -> 32;
                     case 102 -> 197;
                     case 103 -> 45;
                     case 104 -> 171;
                     case 105 -> 44;
                     case 106 -> 20;
                     case 107 -> 25;
                     case 108 -> 5;
                     case 109 -> 194;
                     case 110 -> 254;
                     case 111 -> 79;
                     case 112 -> 39;
                     case 113 -> 140;
                     case 114 -> 255;
                     case 115 -> 192;
                     case 116 -> 7;
                     case 117 -> 217;
                     case 118 -> 182;
                     case 119 -> 173;
                     case 120 -> 33;
                     case 121 -> 149;
                     case 122 -> 127;
                     case 123 -> 168;
                     case 124 -> 74;
                     case 125 -> 159;
                     case 126 -> 160;
                     case 127 -> 139;
                     case 128 -> 51;
                     case 129 -> 216;
                     case 130 -> 166;
                     case 131 -> 62;
                     case 132 -> 136;
                     case 133 -> 112;
                     case 134 -> 211;
                     case 135 -> 70;
                     case 136 -> 200;
                     case 137 -> 214;
                     case 138 -> 123;
                     case 139 -> 137;
                     case 140 -> 177;
                     case 141 -> 105;
                     case 142 -> 117;
                     case 143 -> 3;
                     case 144 -> 148;
                     case 145 -> 191;
                     case 146 -> 131;
                     case 147 -> 203;
                     case 148 -> 113;
                     case 149 -> 18;
                     case 150 -> 229;
                     case 151 -> 14;
                     case 152 -> 81;
                     case 153 -> 16;
                     case 154 -> 96;
                     case 155 -> 47;
                     case 156 -> 10;
                     case 157 -> 69;
                     case 158 -> 111;
                     case 159 -> 91;
                     case 160 -> 66;
                     case 161 -> 8;
                     case 162 -> 212;
                     case 163 -> 142;
                     case 164 -> 198;
                     case 165 -> 246;
                     case 166 -> 75;
                     case 167 -> 55;
                     case 168 -> 155;
                     case 169 -> 56;
                     case 170 -> 85;
                     case 171 -> 181;
                     case 172 -> 218;
                     case 173 -> 72;
                     case 174 -> 49;
                     case 175 -> 164;
                     case 176 -> 184;
                     case 177 -> 86;
                     case 178 -> 43;
                     case 179 -> 144;
                     case 180 -> 2;
                     case 181 -> 183;
                     case 182 -> 196;
                     case 183 -> 23;
                     case 184 -> 89;
                     case 185 -> 31;
                     case 186 -> 233;
                     case 187 -> 189;
                     case 188 -> 167;
                     case 189 -> 169;
                     case 190 -> 15;
                     case 191 -> 205;
                     case 192 -> 250;
                     case 193 -> 27;
                     case 194 -> 130;
                     case 195 -> 83;
                     case 196 -> 116;
                     case 197 -> 68;
                     case 198 -> 77;
                     case 199 -> 223;
                     case 200 -> 63;
                     case 201 -> 210;
                     case 202 -> 11;
                     case 203 -> 143;
                     case 204 -> 61;
                     case 205 -> 158;
                     case 206 -> 97;
                     case 207 -> 50;
                     case 208 -> 175;
                     case 209 -> 93;
                     case 210 -> 100;
                     case 211 -> 146;
                     case 212 -> 154;
                     case 213 -> 65;
                     case 214 -> 21;
                     case 215 -> 109;
                     case 216 -> 107;
                     case 217 -> 240;
                     case 218 -> 180;
                     case 219 -> 115;
                     case 220 -> 152;
                     case 221 -> 135;
                     case 222 -> 249;
                     case 223 -> 0;
                     case 224 -> 201;
                     case 225 -> 213;
                     case 226 -> 46;
                     case 227 -> 78;
                     case 228 -> 106;
                     case 229 -> 17;
                     case 230 -> 236;
                     case 231 -> 122;
                     case 232 -> 71;
                     case 233 -> 228;
                     case 234 -> 52;
                     case 235 -> 165;
                     case 236 -> 48;
                     case 237 -> 242;
                     case 238 -> 226;
                     case 239 -> 244;
                     case 240 -> 98;
                     case 241 -> 53;
                     case 242 -> 19;
                     case 243 -> 235;
                     case 244 -> 35;
                     case 245 -> 245;
                     case 246 -> 239;
                     case 247 -> 215;
                     case 248 -> 190;
                     case 249 -> 227;
                     case 250 -> 151;
                     case 251 -> 247;
                     case 252 -> 163;
                     case 253 -> 204;
                     case 254 -> 80;
                     default -> 133;
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
         }),
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -10812;
                  short var10005 = -28775;
                  var10005 = -10811;
                  short var10006 = -22062;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -10810;
                  short var10002 = -18563;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "l\b:GOkÓê©Í.uèÃÅ\u001a\u009d\u009c{÷îI\u009b!ð\u001e\u0099\u0010£\u0019¸\u000ez\u0019-\u0006z \u000bÙæúÆ\u0099é]um&w/\u0003Vq^\u0083{\u0013\u0000á´³´ãQ·\ræ\u008aZE(c\u0086|z,~B\u0085J Æ\u0092h\u0014b\u0080Ýº\u0018Cá\u0086¿d]®¿7<e²#tÔIõ+/êFÈ*ÒÆorÏZ>¥Å\u0000\u0012\u0007s\u0083\u0001ó\u0094Ô°«ô?\u001d÷\t\nU$\u00020Q";
                  int var4 = "l\b:GOkÓê©Í.uèÃÅ\u001a\u009d\u009c{÷îI\u009b!ð\u001e\u0099\u0010£\u0019¸\u000ez\u0019-\u0006z \u000bÙæúÆ\u0099é]um&w/\u0003Vq^\u0083{\u0013\u0000á´³´ãQ·\ræ\u008aZE(c\u0086|z,~B\u0085J Æ\u0092h\u0014b\u0080Ýº\u0018Cá\u0086¿d]®¿7<e²#tÔIõ+/êFÈ*ÒÆorÏZ>¥Å\u0000\u0012\u0007s\u0083\u0001ó\u0094Ô°«ô?\u001d÷\t\nU$\u00020Q"
                     .length();
                  char var1 = 18;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 39;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 39;
                           var10006 = var6;
                        } else {
                           var13 = 39;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 39;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 104;
                              case 1 -> 15;
                              case 2 -> 114;
                              case 3 -> 77;
                              case 4 -> 74;
                              case 5 -> 100;
                              default -> 23;
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
                  int var2 = (var0 ^ -10812) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 89;
                        case 1 -> 250;
                        case 2 -> 121;
                        case 3 -> 164;
                        case 4 -> 134;
                        case 5 -> 171;
                        case 6 -> 198;
                        case 7 -> 66;
                        case 8 -> 62;
                        case 9 -> 59;
                        case 10 -> 22;
                        case 11 -> 129;
                        case 12 -> 127;
                        case 13 -> 4;
                        case 14 -> 35;
                        case 15 -> 145;
                        case 16 -> 40;
                        case 17 -> 136;
                        case 18 -> 57;
                        case 19 -> 157;
                        case 20 -> 251;
                        case 21 -> 73;
                        case 22 -> 69;
                        case 23 -> 137;
                        case 24 -> 255;
                        case 25 -> 63;
                        case 26 -> 81;
                        case 27 -> 68;
                        case 28 -> 14;
                        case 29 -> 248;
                        case 30 -> 71;
                        case 31 -> 219;
                        case 32 -> 90;
                        case 33 -> 27;
                        case 34 -> 44;
                        case 35 -> 78;
                        case 36 -> 39;
                        case 37 -> 74;
                        case 38 -> 102;
                        case 39 -> 166;
                        case 40 -> 82;
                        case 41 -> 216;
                        case 42 -> 12;
                        case 43 -> 109;
                        case 44 -> 163;
                        case 45 -> 189;
                        case 46 -> 190;
                        case 47 -> 115;
                        case 48 -> 203;
                        case 49 -> 15;
                        case 50 -> 112;
                        case 51 -> 126;
                        case 52 -> 209;
                        case 53 -> 172;
                        case 54 -> 46;
                        case 55 -> 170;
                        case 56 -> 249;
                        case 57 -> 48;
                        case 58 -> 111;
                        case 59 -> 105;
                        case 60 -> 107;
                        case 61 -> 237;
                        case 62 -> 206;
                        case 63 -> 124;
                        case 64 -> 160;
                        case 65 -> 142;
                        case 66 -> 150;
                        case 67 -> 244;
                        case 68 -> 230;
                        case 69 -> 52;
                        case 70 -> 226;
                        case 71 -> 213;
                        case 72 -> 128;
                        case 73 -> 118;
                        case 74 -> 25;
                        case 75 -> 144;
                        case 76 -> 0;
                        case 77 -> 191;
                        case 78 -> 104;
                        case 79 -> 154;
                        case 80 -> 242;
                        case 81 -> 220;
                        case 82 -> 10;
                        case 83 -> 149;
                        case 84 -> 113;
                        case 85 -> 18;
                        case 86 -> 92;
                        case 87 -> 132;
                        case 88 -> 180;
                        case 89 -> 169;
                        case 90 -> 130;
                        case 91 -> 125;
                        case 92 -> 228;
                        case 93 -> 208;
                        case 94 -> 51;
                        case 95 -> 167;
                        case 96 -> 156;
                        case 97 -> 200;
                        case 98 -> 181;
                        case 99 -> 79;
                        case 100 -> 16;
                        case 101 -> 223;
                        case 102 -> 28;
                        case 103 -> 11;
                        case 104 -> 61;
                        case 105 -> 97;
                        case 106 -> 179;
                        case 107 -> 221;
                        case 108 -> 186;
                        case 109 -> 38;
                        case 110 -> 31;
                        case 111 -> 184;
                        case 112 -> 17;
                        case 113 -> 88;
                        case 114 -> 224;
                        case 115 -> 67;
                        case 116 -> 26;
                        case 117 -> 247;
                        case 118 -> 254;
                        case 119 -> 218;
                        case 120 -> 152;
                        case 121 -> 85;
                        case 122 -> 101;
                        case 123 -> 43;
                        case 124 -> 182;
                        case 125 -> 217;
                        case 126 -> 56;
                        case 127 -> 110;
                        case 128 -> 8;
                        case 129 -> 155;
                        case 130 -> 235;
                        case 131 -> 33;
                        case 132 -> 225;
                        case 133 -> 196;
                        case 134 -> 19;
                        case 135 -> 72;
                        case 136 -> 151;
                        case 137 -> 29;
                        case 138 -> 227;
                        case 139 -> 84;
                        case 140 -> 135;
                        case 141 -> 231;
                        case 142 -> 188;
                        case 143 -> 236;
                        case 144 -> 7;
                        case 145 -> 54;
                        case 146 -> 245;
                        case 147 -> 30;
                        case 148 -> 239;
                        case 149 -> 83;
                        case 150 -> 246;
                        case 151 -> 252;
                        case 152 -> 47;
                        case 153 -> 95;
                        case 154 -> 138;
                        case 155 -> 70;
                        case 156 -> 119;
                        case 157 -> 91;
                        case 158 -> 37;
                        case 159 -> 173;
                        case 160 -> 60;
                        case 161 -> 240;
                        case 162 -> 99;
                        case 163 -> 234;
                        case 164 -> 94;
                        case 165 -> 114;
                        case 166 -> 199;
                        case 167 -> 243;
                        case 168 -> 233;
                        case 169 -> 168;
                        case 170 -> 80;
                        case 171 -> 6;
                        case 172 -> 45;
                        case 173 -> 238;
                        case 174 -> 202;
                        case 175 -> 177;
                        case 176 -> 41;
                        case 177 -> 140;
                        case 178 -> 229;
                        case 179 -> 64;
                        case 180 -> 50;
                        case 181 -> 1;
                        case 182 -> 98;
                        case 183 -> 65;
                        case 184 -> 2;
                        case 185 -> 214;
                        case 186 -> 86;
                        case 187 -> 147;
                        case 188 -> 158;
                        case 189 -> 232;
                        case 190 -> 23;
                        case 191 -> 53;
                        case 192 -> 123;
                        case 193 -> 76;
                        case 194 -> 241;
                        case 195 -> 21;
                        case 196 -> 205;
                        case 197 -> 165;
                        case 198 -> 195;
                        case 199 -> 9;
                        case 200 -> 146;
                        case 201 -> 5;
                        case 202 -> 93;
                        case 203 -> 108;
                        case 204 -> 24;
                        case 205 -> 106;
                        case 206 -> 116;
                        case 207 -> 210;
                        case 208 -> 49;
                        case 209 -> 3;
                        case 210 -> 204;
                        case 211 -> 185;
                        case 212 -> 32;
                        case 213 -> 148;
                        case 214 -> 162;
                        case 215 -> 42;
                        case 216 -> 215;
                        case 217 -> 222;
                        case 218 -> 133;
                        case 219 -> 117;
                        case 220 -> 77;
                        case 221 -> 120;
                        case 222 -> 103;
                        case 223 -> 20;
                        case 224 -> 153;
                        case 225 -> 87;
                        case 226 -> 36;
                        case 227 -> 13;
                        case 228 -> 34;
                        case 229 -> 139;
                        case 230 -> 175;
                        case 231 -> 193;
                        case 232 -> 183;
                        case 233 -> 201;
                        case 234 -> 192;
                        case 235 -> 178;
                        case 236 -> 75;
                        case 237 -> 161;
                        case 238 -> 211;
                        case 239 -> 143;
                        case 240 -> 141;
                        case 241 -> 174;
                        case 242 -> 55;
                        case 243 -> 131;
                        case 244 -> 58;
                        case 245 -> 194;
                        case 246 -> 197;
                        case 247 -> 207;
                        case 248 -> 176;
                        case 249 -> 253;
                        case 250 -> 96;
                        case 251 -> 100;
                        case 252 -> 122;
                        case 253 -> 187;
                        case 254 -> 159;
                        default -> 212;
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
         ));
      var10001 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      var10002 = 31091;
      var10003 = -1825;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Fishing reposition",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll,
         20000L,
         0L,
         (Function0)(new Function0<Boolean>() {
   public Boolean invoke() { return null; } // PX-FIX abs

            final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII receiver = null; // PX-FIX recv
            private static String[] a;
            private static String[] b;

            {
               short var10004 = -7866;
               short var10005 = -13802;
               var10005 = -7865;
               short var10006 = 17981;
            }

            public final Boolean a() {
      Object receiver = null; // PX-FIX
               return ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).bz();
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
   pxClinit: {
               String[] var5 = new String[2];
               int var3 = 0;
               String var2 = "\u0097òc_À\u000e\u000bg|\u0094p©Q>©Ìu ëí\u0011Ö\u009eKÒÅ¿«QhRòq\u0001%£¯4";
               int var4 = "\u0097òc_À\u000e\u000bg|\u0094p©Q>©Ìu ëí\u0011Ö\u009eKÒÅ¿«QhRòq\u0001%£¯4".length();
               char var1 = 20;
               int var0 = -1;

               while (true) {
                  char[] var10002;
                  label38: {
                     char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                     int var10004 = var10003.length;
                     int var6 = 0;
                     byte var13 = 34;
                     var10002 = var10003;
                     int var8 = var10004;
                     byte var16;
                     char[] var10005;
                     int var10006;
                     if (var10004 <= 1) {
                        var10005 = var10003;
                        var16 = 34;
                        var10006 = var6;
                     } else {
                        var13 = 34;
                        var8 = var10004;
                        if (var10004 <= var6) {
                           break label38;
                        }

                        var10005 = var10003;
                        var16 = 34;
                        var10006 = var6;
                     }

                     while (true) {
                        var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                           case 0 -> 108;
                           case 1 -> 114;
                           case 2 -> 27;
                           case 3 -> 54;
                           case 4 -> 111;
                           case 5 -> 46;
                           default -> 52;
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

            private static String a(int var0, int var1) {
               int var2 = (var0 ^ -7865) & 65535;
               if (b[var2] == null) {
                  char[] var3 = a[var2].toCharArray();

                  short var4 = switch (var3[0] & 0xFF) {
                     case 0 -> 132;
                     case 1 -> 99;
                     case 2 -> 245;
                     case 3 -> 1;
                     case 4 -> 52;
                     case 5 -> 228;
                     case 6 -> 170;
                     case 7 -> 28;
                     case 8 -> 247;
                     case 9 -> 255;
                     case 10 -> 90;
                     case 11 -> 19;
                     case 12 -> 155;
                     case 13 -> 249;
                     case 14 -> 203;
                     case 15 -> 135;
                     case 16 -> 30;
                     case 17 -> 51;
                     case 18 -> 120;
                     case 19 -> 197;
                     case 20 -> 115;
                     case 21 -> 88;
                     case 22 -> 102;
                     case 23 -> 224;
                     case 24 -> 56;
                     case 25 -> 164;
                     case 26 -> 83;
                     case 27 -> 113;
                     case 28 -> 125;
                     case 29 -> 48;
                     case 30 -> 74;
                     case 31 -> 55;
                     case 32 -> 176;
                     case 33 -> 198;
                     case 34 -> 98;
                     case 35 -> 5;
                     case 36 -> 239;
                     case 37 -> 168;
                     case 38 -> 147;
                     case 39 -> 104;
                     case 40 -> 140;
                     case 41 -> 66;
                     case 42 -> 22;
                     case 43 -> 158;
                     case 44 -> 64;
                     case 45 -> 253;
                     case 46 -> 220;
                     case 47 -> 242;
                     case 48 -> 10;
                     case 49 -> 204;
                     case 50 -> 171;
                     case 51 -> 45;
                     case 52 -> 32;
                     case 53 -> 177;
                     case 54 -> 215;
                     case 55 -> 250;
                     case 56 -> 8;
                     case 57 -> 160;
                     case 58 -> 134;
                     case 59 -> 95;
                     case 60 -> 178;
                     case 61 -> 226;
                     case 62 -> 112;
                     case 63 -> 214;
                     case 64 -> 209;
                     case 65 -> 144;
                     case 66 -> 236;
                     case 67 -> 243;
                     case 68 -> 15;
                     case 69 -> 42;
                     case 70 -> 38;
                     case 71 -> 210;
                     case 72 -> 126;
                     case 73 -> 80;
                     case 74 -> 34;
                     case 75 -> 188;
                     case 76 -> 111;
                     case 77 -> 254;
                     case 78 -> 77;
                     case 79 -> 149;
                     case 80 -> 123;
                     case 81 -> 238;
                     case 82 -> 122;
                     case 83 -> 232;
                     case 84 -> 101;
                     case 85 -> 137;
                     case 86 -> 211;
                     case 87 -> 200;
                     case 88 -> 7;
                     case 89 -> 96;
                     case 90 -> 103;
                     case 91 -> 117;
                     case 92 -> 139;
                     case 93 -> 68;
                     case 94 -> 206;
                     case 95 -> 252;
                     case 96 -> 145;
                     case 97 -> 142;
                     case 98 -> 227;
                     case 99 -> 146;
                     case 100 -> 105;
                     case 101 -> 199;
                     case 102 -> 246;
                     case 103 -> 44;
                     case 104 -> 94;
                     case 105 -> 41;
                     case 106 -> 11;
                     case 107 -> 216;
                     case 108 -> 150;
                     case 109 -> 127;
                     case 110 -> 165;
                     case 111 -> 67;
                     case 112 -> 13;
                     case 113 -> 39;
                     case 114 -> 223;
                     case 115 -> 9;
                     case 116 -> 241;
                     case 117 -> 248;
                     case 118 -> 182;
                     case 119 -> 108;
                     case 120 -> 196;
                     case 121 -> 91;
                     case 122 -> 25;
                     case 123 -> 180;
                     case 124 -> 76;
                     case 125 -> 116;
                     case 126 -> 130;
                     case 127 -> 175;
                     case 128 -> 133;
                     case 129 -> 29;
                     case 130 -> 219;
                     case 131 -> 138;
                     case 132 -> 20;
                     case 133 -> 85;
                     case 134 -> 2;
                     case 135 -> 14;
                     case 136 -> 17;
                     case 137 -> 4;
                     case 138 -> 100;
                     case 139 -> 57;
                     case 140 -> 89;
                     case 141 -> 237;
                     case 142 -> 16;
                     case 143 -> 229;
                     case 144 -> 136;
                     case 145 -> 207;
                     case 146 -> 163;
                     case 147 -> 169;
                     case 148 -> 191;
                     case 149 -> 78;
                     case 150 -> 53;
                     case 151 -> 49;
                     case 152 -> 27;
                     case 153 -> 21;
                     case 154 -> 63;
                     case 155 -> 84;
                     case 156 -> 186;
                     case 157 -> 24;
                     case 158 -> 106;
                     case 159 -> 190;
                     case 160 -> 222;
                     case 161 -> 213;
                     case 162 -> 121;
                     case 163 -> 157;
                     case 164 -> 212;
                     case 165 -> 82;
                     case 166 -> 193;
                     case 167 -> 72;
                     case 168 -> 218;
                     case 169 -> 87;
                     case 170 -> 73;
                     case 171 -> 251;
                     case 172 -> 174;
                     case 173 -> 46;
                     case 174 -> 167;
                     case 175 -> 179;
                     case 176 -> 154;
                     case 177 -> 173;
                     case 178 -> 119;
                     case 179 -> 208;
                     case 180 -> 62;
                     case 181 -> 86;
                     case 182 -> 194;
                     case 183 -> 50;
                     case 184 -> 192;
                     case 185 -> 81;
                     case 186 -> 143;
                     case 187 -> 18;
                     case 188 -> 23;
                     case 189 -> 33;
                     case 190 -> 109;
                     case 191 -> 69;
                     case 192 -> 166;
                     case 193 -> 159;
                     case 194 -> 118;
                     case 195 -> 183;
                     case 196 -> 185;
                     case 197 -> 36;
                     case 198 -> 79;
                     case 199 -> 65;
                     case 200 -> 75;
                     case 201 -> 202;
                     case 202 -> 12;
                     case 203 -> 172;
                     case 204 -> 97;
                     case 205 -> 141;
                     case 206 -> 6;
                     case 207 -> 40;
                     case 208 -> 128;
                     case 209 -> 70;
                     case 210 -> 0;
                     case 211 -> 161;
                     case 212 -> 234;
                     case 213 -> 43;
                     case 214 -> 240;
                     case 215 -> 152;
                     case 216 -> 124;
                     case 217 -> 131;
                     case 218 -> 54;
                     case 219 -> 3;
                     case 220 -> 26;
                     case 221 -> 156;
                     case 222 -> 114;
                     case 223 -> 59;
                     case 224 -> 233;
                     case 225 -> 92;
                     case 226 -> 47;
                     case 227 -> 129;
                     case 228 -> 31;
                     case 229 -> 35;
                     case 230 -> 244;
                     case 231 -> 107;
                     case 232 -> 225;
                     case 233 -> 60;
                     case 234 -> 181;
                     case 235 -> 235;
                     case 236 -> 184;
                     case 237 -> 58;
                     case 238 -> 230;
                     case 239 -> 195;
                     case 240 -> 37;
                     case 241 -> 187;
                     case 242 -> 148;
                     case 243 -> 205;
                     case 244 -> 189;
                     case 245 -> 201;
                     case 246 -> 71;
                     case 247 -> 153;
                     case 248 -> 221;
                     case 249 -> 61;
                     case 250 -> 110;
                     case 251 -> 217;
                     case 252 -> 162;
                     case 253 -> 231;
                     case 254 -> 151;
                     default -> 93;
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
         }),
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 2089;
                  short var10005 = 2032;
                  var10005 = 2088;
                  short var10006 = -3947;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 2091;
                  short var10002 = 24300;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "g\u00181\u0017S9Ôd\"v\r\u007fÔ\u0006\u0086É\u009f´{\"#\u0099pFÕvùvÅ\u0087\t\u0085È¬\u0010Ú\u008fÆí\u0081þ\u009a¯Ç¹ÎûÛ\u009cË*é®¨\u0085ÓjK_²Û\u001d2\\Ó=\u00053O\u008b\u0097@DÓ\u001c\u0014KÙü\fÅ\u0015óO¤ý\u0086åÅÒp$¾\u0017\fÒï\u0013\u0083ÒÆ\u0081i{dµ\u0019¤y\u0081døs¯Ø.ª«\u001c\u000b\u0016ò\u0098n}¡ô\u0005\u008c{¡\u0001}{\u001fX8\u009fil3º\u0002Ór";
                  int var4 = "g\u00181\u0017S9Ôd\"v\r\u007fÔ\u0006\u0086É\u009f´{\"#\u0099pFÕvùvÅ\u0087\t\u0085È¬\u0010Ú\u008fÆí\u0081þ\u009a¯Ç¹ÎûÛ\u009cË*é®¨\u0085ÓjK_²Û\u001d2\\Ó=\u00053O\u008b\u0097@DÓ\u001c\u0014KÙü\fÅ\u0015óO¤ý\u0086åÅÒp$¾\u0017\fÒï\u0013\u0083ÒÆ\u0081i{dµ\u0019¤y\u0081døs¯Ø.ª«\u001c\u000b\u0016ò\u0098n}¡ô\u0005\u008c{¡\u0001}{\u001fX8\u009fil3º\u0002Ór"
                     .length();
                  char var1 = 18;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 61;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 61;
                           var10006 = var6;
                        } else {
                           var13 = 61;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 61;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 113;
                              case 1 -> 30;
                              case 2 -> 98;
                              case 3 -> 100;
                              case 4 -> 108;
                              case 5 -> 64;
                              default -> 14;
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
                  int var2 = (var0 ^ 2089) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 239;
                        case 1 -> 148;
                        case 2 -> 193;
                        case 3 -> 37;
                        case 4 -> 136;
                        case 5 -> 116;
                        case 6 -> 241;
                        case 7 -> 105;
                        case 8 -> 15;
                        case 9 -> 223;
                        case 10 -> 219;
                        case 11 -> 25;
                        case 12 -> 147;
                        case 13 -> 41;
                        case 14 -> 238;
                        case 15 -> 103;
                        case 16 -> 245;
                        case 17 -> 97;
                        case 18 -> 163;
                        case 19 -> 4;
                        case 20 -> 130;
                        case 21 -> 76;
                        case 22 -> 250;
                        case 23 -> 79;
                        case 24 -> 190;
                        case 25 -> 139;
                        case 26 -> 132;
                        case 27 -> 27;
                        case 28 -> 19;
                        case 29 -> 236;
                        case 30 -> 35;
                        case 31 -> 138;
                        case 32 -> 129;
                        case 33 -> 234;
                        case 34 -> 180;
                        case 35 -> 178;
                        case 36 -> 145;
                        case 37 -> 166;
                        case 38 -> 120;
                        case 39 -> 28;
                        case 40 -> 55;
                        case 41 -> 108;
                        case 42 -> 112;
                        case 43 -> 173;
                        case 44 -> 111;
                        case 45 -> 46;
                        case 46 -> 134;
                        case 47 -> 102;
                        case 48 -> 216;
                        case 49 -> 92;
                        case 50 -> 183;
                        case 51 -> 101;
                        case 52 -> 248;
                        case 53 -> 48;
                        case 54 -> 175;
                        case 55 -> 174;
                        case 56 -> 198;
                        case 57 -> 240;
                        case 58 -> 246;
                        case 59 -> 140;
                        case 60 -> 231;
                        case 61 -> 185;
                        case 62 -> 154;
                        case 63 -> 206;
                        case 64 -> 210;
                        case 65 -> 1;
                        case 66 -> 235;
                        case 67 -> 199;
                        case 68 -> 214;
                        case 69 -> 22;
                        case 70 -> 9;
                        case 71 -> 151;
                        case 72 -> 51;
                        case 73 -> 167;
                        case 74 -> 23;
                        case 75 -> 208;
                        case 76 -> 8;
                        case 77 -> 75;
                        case 78 -> 243;
                        case 79 -> 69;
                        case 80 -> 95;
                        case 81 -> 16;
                        case 82 -> 233;
                        case 83 -> 110;
                        case 84 -> 14;
                        case 85 -> 255;
                        case 86 -> 73;
                        case 87 -> 57;
                        case 88 -> 117;
                        case 89 -> 152;
                        case 90 -> 40;
                        case 91 -> 220;
                        case 92 -> 157;
                        case 93 -> 204;
                        case 94 -> 228;
                        case 95 -> 94;
                        case 96 -> 85;
                        case 97 -> 222;
                        case 98 -> 44;
                        case 99 -> 224;
                        case 100 -> 78;
                        case 101 -> 74;
                        case 102 -> 205;
                        case 103 -> 26;
                        case 104 -> 70;
                        case 105 -> 53;
                        case 106 -> 5;
                        case 107 -> 232;
                        case 108 -> 212;
                        case 109 -> 172;
                        case 110 -> 143;
                        case 111 -> 133;
                        case 112 -> 162;
                        case 113 -> 141;
                        case 114 -> 29;
                        case 115 -> 188;
                        case 116 -> 58;
                        case 117 -> 194;
                        case 118 -> 242;
                        case 119 -> 6;
                        case 120 -> 60;
                        case 121 -> 88;
                        case 122 -> 38;
                        case 123 -> 30;
                        case 124 -> 197;
                        case 125 -> 43;
                        case 126 -> 81;
                        case 127 -> 32;
                        case 128 -> 124;
                        case 129 -> 127;
                        case 130 -> 17;
                        case 131 -> 187;
                        case 132 -> 230;
                        case 133 -> 252;
                        case 134 -> 229;
                        case 135 -> 87;
                        case 136 -> 254;
                        case 137 -> 33;
                        case 138 -> 123;
                        case 139 -> 170;
                        case 140 -> 77;
                        case 141 -> 3;
                        case 142 -> 191;
                        case 143 -> 144;
                        case 144 -> 98;
                        case 145 -> 142;
                        case 146 -> 100;
                        case 147 -> 106;
                        case 148 -> 227;
                        case 149 -> 182;
                        case 150 -> 56;
                        case 151 -> 45;
                        case 152 -> 119;
                        case 153 -> 176;
                        case 154 -> 12;
                        case 155 -> 195;
                        case 156 -> 59;
                        case 157 -> 64;
                        case 158 -> 109;
                        case 159 -> 253;
                        case 160 -> 203;
                        case 161 -> 161;
                        case 162 -> 80;
                        case 163 -> 10;
                        case 164 -> 83;
                        case 165 -> 71;
                        case 166 -> 201;
                        case 167 -> 156;
                        case 168 -> 13;
                        case 169 -> 196;
                        case 170 -> 82;
                        case 171 -> 113;
                        case 172 -> 66;
                        case 173 -> 61;
                        case 174 -> 65;
                        case 175 -> 104;
                        case 176 -> 90;
                        case 177 -> 189;
                        case 178 -> 42;
                        case 179 -> 207;
                        case 180 -> 237;
                        case 181 -> 251;
                        case 182 -> 128;
                        case 183 -> 67;
                        case 184 -> 121;
                        case 185 -> 155;
                        case 186 -> 20;
                        case 187 -> 107;
                        case 188 -> 68;
                        case 189 -> 158;
                        case 190 -> 0;
                        case 191 -> 150;
                        case 192 -> 202;
                        case 193 -> 213;
                        case 194 -> 49;
                        case 195 -> 99;
                        case 196 -> 91;
                        case 197 -> 34;
                        case 198 -> 168;
                        case 199 -> 50;
                        case 200 -> 184;
                        case 201 -> 211;
                        case 202 -> 153;
                        case 203 -> 7;
                        case 204 -> 96;
                        case 205 -> 169;
                        case 206 -> 47;
                        case 207 -> 135;
                        case 208 -> 221;
                        case 209 -> 54;
                        case 210 -> 137;
                        case 211 -> 164;
                        case 212 -> 52;
                        case 213 -> 192;
                        case 214 -> 18;
                        case 215 -> 36;
                        case 216 -> 89;
                        case 217 -> 186;
                        case 218 -> 177;
                        case 219 -> 159;
                        case 220 -> 225;
                        case 221 -> 215;
                        case 222 -> 217;
                        case 223 -> 2;
                        case 224 -> 209;
                        case 225 -> 21;
                        case 226 -> 244;
                        case 227 -> 86;
                        case 228 -> 165;
                        case 229 -> 146;
                        case 230 -> 218;
                        case 231 -> 131;
                        case 232 -> 115;
                        case 233 -> 126;
                        case 234 -> 114;
                        case 235 -> 200;
                        case 236 -> 39;
                        case 237 -> 24;
                        case 238 -> 249;
                        case 239 -> 179;
                        case 240 -> 118;
                        case 241 -> 62;
                        case 242 -> 160;
                        case 243 -> 181;
                        case 244 -> 171;
                        case 245 -> 247;
                        case 246 -> 72;
                        case 247 -> 125;
                        case 248 -> 11;
                        case 249 -> 149;
                        case 250 -> 63;
                        case 251 -> 122;
                        case 252 -> 31;
                        case 253 -> 93;
                        case 254 -> 226;
                        default -> 84;
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
         ));
      var10001 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      var10002 = 31062;
      var10003 = -8124;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Fishing cast",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
         15000L,
         0L,
         (Function0)(new Function0<Boolean>() {
   public Boolean invoke() { return null; } // PX-FIX abs

            final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII receiver = null; // PX-FIX recv
            private static String[] a;
            private static String[] b;

            {
               short var10004 = 29327;
               short var10005 = 11912;
               var10005 = 29326;
               short var10006 = 24651;
            }

            public final Boolean a() {
      Object receiver = null; // PX-FIX
               return ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).bz();
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
   pxClinit: {
               String[] var5 = new String[2];
               int var3 = 0;
               String var2 = "Ä\u0082ð$\u0013§hKXè\u0081\u0087©â¯\u001fL¯mÊ\u0011bS$\u001e\u0089à;£2õÌ$\u0000\u0096\u009a\u0091ê";
               int var4 = "Ä\u0082ð$\u0013§hKXè\u0081\u0087©â¯\u001fL¯mÊ\u0011bS$\u001e\u0089à;£2õÌ$\u0000\u0096\u009a\u0091ê".length();
               char var1 = 20;
               int var0 = -1;

               while (true) {
                  char[] var10002;
                  label38: {
                     char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                     int var10004 = var10003.length;
                     int var6 = 0;
                     byte var13 = 6;
                     var10002 = var10003;
                     int var8 = var10004;
                     byte var16;
                     char[] var10005;
                     int var10006;
                     if (var10004 <= 1) {
                        var10005 = var10003;
                        var16 = 6;
                        var10006 = var6;
                     } else {
                        var13 = 6;
                        var8 = var10004;
                        if (var10004 <= var6) {
                           break label38;
                        }

                        var10005 = var10003;
                        var16 = 6;
                        var10006 = var6;
                     }

                     while (true) {
                        var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                           case 0 -> 125;
                           case 1 -> 20;
                           case 2 -> 96;
                           case 3 -> 47;
                           case 4 -> 1;
                           case 5 -> 107;
                           default -> 64;
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

            private static String a(int var0, int var1) {
               int var2 = (var0 ^ 29326) & 65535;
               if (b[var2] == null) {
                  char[] var3 = a[var2].toCharArray();

                  short var4 = switch (var3[0] & 0xFF) {
                     case 0 -> 128;
                     case 1 -> 247;
                     case 2 -> 146;
                     case 3 -> 157;
                     case 4 -> 80;
                     case 5 -> 218;
                     case 6 -> 175;
                     case 7 -> 139;
                     case 8 -> 215;
                     case 9 -> 118;
                     case 10 -> 43;
                     case 11 -> 156;
                     case 12 -> 30;
                     case 13 -> 48;
                     case 14 -> 70;
                     case 15 -> 6;
                     case 16 -> 62;
                     case 17 -> 168;
                     case 18 -> 5;
                     case 19 -> 140;
                     case 20 -> 121;
                     case 21 -> 219;
                     case 22 -> 2;
                     case 23 -> 152;
                     case 24 -> 83;
                     case 25 -> 14;
                     case 26 -> 224;
                     case 27 -> 195;
                     case 28 -> 153;
                     case 29 -> 25;
                     case 30 -> 131;
                     case 31 -> 200;
                     case 32 -> 231;
                     case 33 -> 122;
                     case 34 -> 144;
                     case 35 -> 229;
                     case 36 -> 28;
                     case 37 -> 149;
                     case 38 -> 137;
                     case 39 -> 64;
                     case 40 -> 211;
                     case 41 -> 232;
                     case 42 -> 234;
                     case 43 -> 158;
                     case 44 -> 253;
                     case 45 -> 214;
                     case 46 -> 245;
                     case 47 -> 167;
                     case 48 -> 22;
                     case 49 -> 164;
                     case 50 -> 125;
                     case 51 -> 136;
                     case 52 -> 155;
                     case 53 -> 197;
                     case 54 -> 143;
                     case 55 -> 238;
                     case 56 -> 108;
                     case 57 -> 182;
                     case 58 -> 130;
                     case 59 -> 90;
                     case 60 -> 35;
                     case 61 -> 10;
                     case 62 -> 176;
                     case 63 -> 42;
                     case 64 -> 254;
                     case 65 -> 84;
                     case 66 -> 77;
                     case 67 -> 112;
                     case 68 -> 59;
                     case 69 -> 73;
                     case 70 -> 220;
                     case 71 -> 159;
                     case 72 -> 198;
                     case 73 -> 244;
                     case 74 -> 171;
                     case 75 -> 207;
                     case 76 -> 236;
                     case 77 -> 120;
                     case 78 -> 74;
                     case 79 -> 172;
                     case 80 -> 242;
                     case 81 -> 251;
                     case 82 -> 166;
                     case 83 -> 169;
                     case 84 -> 160;
                     case 85 -> 237;
                     case 86 -> 49;
                     case 87 -> 135;
                     case 88 -> 54;
                     case 89 -> 26;
                     case 90 -> 217;
                     case 91 -> 95;
                     case 92 -> 115;
                     case 93 -> 33;
                     case 94 -> 71;
                     case 95 -> 183;
                     case 96 -> 78;
                     case 97 -> 129;
                     case 98 -> 235;
                     case 99 -> 45;
                     case 100 -> 145;
                     case 101 -> 9;
                     case 102 -> 17;
                     case 103 -> 162;
                     case 104 -> 50;
                     case 105 -> 194;
                     case 106 -> 53;
                     case 107 -> 8;
                     case 108 -> 116;
                     case 109 -> 226;
                     case 110 -> 150;
                     case 111 -> 178;
                     case 112 -> 126;
                     case 113 -> 151;
                     case 114 -> 127;
                     case 115 -> 41;
                     case 116 -> 103;
                     case 117 -> 89;
                     case 118 -> 16;
                     case 119 -> 1;
                     case 120 -> 216;
                     case 121 -> 52;
                     case 122 -> 187;
                     case 123 -> 106;
                     case 124 -> 69;
                     case 125 -> 192;
                     case 126 -> 92;
                     case 127 -> 47;
                     case 128 -> 96;
                     case 129 -> 87;
                     case 130 -> 58;
                     case 131 -> 114;
                     case 132 -> 91;
                     case 133 -> 117;
                     case 134 -> 185;
                     case 135 -> 72;
                     case 136 -> 189;
                     case 137 -> 79;
                     case 138 -> 32;
                     case 139 -> 39;
                     case 140 -> 40;
                     case 141 -> 97;
                     case 142 -> 255;
                     case 143 -> 27;
                     case 144 -> 239;
                     case 145 -> 4;
                     case 146 -> 75;
                     case 147 -> 186;
                     case 148 -> 233;
                     case 149 -> 65;
                     case 150 -> 63;
                     case 151 -> 81;
                     case 152 -> 206;
                     case 153 -> 184;
                     case 154 -> 44;
                     case 155 -> 163;
                     case 156 -> 165;
                     case 157 -> 248;
                     case 158 -> 23;
                     case 159 -> 243;
                     case 160 -> 210;
                     case 161 -> 199;
                     case 162 -> 29;
                     case 163 -> 36;
                     case 164 -> 100;
                     case 165 -> 85;
                     case 166 -> 174;
                     case 167 -> 222;
                     case 168 -> 7;
                     case 169 -> 142;
                     case 170 -> 190;
                     case 171 -> 37;
                     case 172 -> 56;
                     case 173 -> 188;
                     case 174 -> 82;
                     case 175 -> 34;
                     case 176 -> 123;
                     case 177 -> 134;
                     case 178 -> 104;
                     case 179 -> 109;
                     case 180 -> 133;
                     case 181 -> 51;
                     case 182 -> 101;
                     case 183 -> 12;
                     case 184 -> 55;
                     case 185 -> 132;
                     case 186 -> 105;
                     case 187 -> 179;
                     case 188 -> 57;
                     case 189 -> 93;
                     case 190 -> 99;
                     case 191 -> 111;
                     case 192 -> 213;
                     case 193 -> 124;
                     case 194 -> 230;
                     case 195 -> 246;
                     case 196 -> 13;
                     case 197 -> 76;
                     case 198 -> 201;
                     case 199 -> 181;
                     case 200 -> 147;
                     case 201 -> 31;
                     case 202 -> 221;
                     case 203 -> 88;
                     case 204 -> 173;
                     case 205 -> 38;
                     case 206 -> 241;
                     case 207 -> 67;
                     case 208 -> 212;
                     case 209 -> 154;
                     case 210 -> 107;
                     case 211 -> 20;
                     case 212 -> 68;
                     case 213 -> 15;
                     case 214 -> 18;
                     case 215 -> 113;
                     case 216 -> 61;
                     case 217 -> 94;
                     case 218 -> 223;
                     case 219 -> 228;
                     case 220 -> 170;
                     case 221 -> 191;
                     case 222 -> 205;
                     case 223 -> 102;
                     case 224 -> 193;
                     case 225 -> 141;
                     case 226 -> 21;
                     case 227 -> 180;
                     case 228 -> 11;
                     case 229 -> 225;
                     case 230 -> 249;
                     case 231 -> 202;
                     case 232 -> 203;
                     case 233 -> 250;
                     case 234 -> 60;
                     case 235 -> 66;
                     case 236 -> 138;
                     case 237 -> 252;
                     case 238 -> 46;
                     case 239 -> 227;
                     case 240 -> 196;
                     case 241 -> 240;
                     case 242 -> 119;
                     case 243 -> 204;
                     case 244 -> 148;
                     case 245 -> 24;
                     case 246 -> 86;
                     case 247 -> 98;
                     case 248 -> 208;
                     case 249 -> 110;
                     case 250 -> 0;
                     case 251 -> 161;
                     case 252 -> 177;
                     case 253 -> 19;
                     case 254 -> 209;
                     default -> 3;
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
         }),
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -28564;
                  short var10005 = 14521;
                  var10005 = -28562;
                  short var10006 = -12561;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -28561;
                  short var10002 = -7479;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0003&V_¡lÕ75÷`Q%\u009cA\u00ad\u008c·\u0012¶Dl\u0015\u0016¹\u0090]\u0081PäQª¤â^õ:\u008fùý¸Ð¥d \u0096¼ñ\\(Q\u0090\u0094º\u0015\u009c5l\u0016\u0097ëô¶,\f´\u001a\u009aE\u0019?Ür¤Ã\u0013\u0017õ\u009c+¬Í\u0012Wð\u0094/\u0088é\u0017wP\u0011\u001e\u001dk$\u0083\u0013\u000e÷Ûs}\u00018{·Ñú½0 x´0¿\u0081<§/\u0001]\u0002\u001d·\u0012¥ \u0082\u009f;t\u00864_\u0097-]\u008c\u001dt\u009d*±";
                  int var4 = "\u0003&V_¡lÕ75÷`Q%\u009cA\u00ad\u008c·\u0012¶Dl\u0015\u0016¹\u0090]\u0081PäQª¤â^õ:\u008fùý¸Ð¥d \u0096¼ñ\\(Q\u0090\u0094º\u0015\u009c5l\u0016\u0097ëô¶,\f´\u001a\u009aE\u0019?Ür¤Ã\u0013\u0017õ\u009c+¬Í\u0012Wð\u0094/\u0088é\u0017wP\u0011\u001e\u001dk$\u0083\u0013\u000e÷Ûs}\u00018{·Ñú½0 x´0¿\u0081<§/\u0001]\u0002\u001d·\u0012¥ \u0082\u009f;t\u00864_\u0097-]\u008c\u001dt\u009d*±"
                     .length();
                  char var1 = '{';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 109;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 109;
                           var10006 = var6;
                        } else {
                           var13 = 109;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 109;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 119;
                              case 1 -> 122;
                              case 2 -> 19;
                              case 3 -> 61;
                              case 4 -> 6;
                              case 5 -> 109;
                              default -> 70;
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
                  int var2 = (var0 ^ -28562) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 16;
                        case 1 -> 227;
                        case 2 -> 137;
                        case 3 -> 246;
                        case 4 -> 168;
                        case 5 -> 104;
                        case 6 -> 63;
                        case 7 -> 82;
                        case 8 -> 113;
                        case 9 -> 255;
                        case 10 -> 61;
                        case 11 -> 65;
                        case 12 -> 235;
                        case 13 -> 191;
                        case 14 -> 32;
                        case 15 -> 218;
                        case 16 -> 107;
                        case 17 -> 245;
                        case 18 -> 30;
                        case 19 -> 17;
                        case 20 -> 186;
                        case 21 -> 124;
                        case 22 -> 187;
                        case 23 -> 1;
                        case 24 -> 14;
                        case 25 -> 126;
                        case 26 -> 8;
                        case 27 -> 121;
                        case 28 -> 212;
                        case 29 -> 22;
                        case 30 -> 80;
                        case 31 -> 166;
                        case 32 -> 29;
                        case 33 -> 204;
                        case 34 -> 43;
                        case 35 -> 196;
                        case 36 -> 169;
                        case 37 -> 94;
                        case 38 -> 215;
                        case 39 -> 146;
                        case 40 -> 88;
                        case 41 -> 39;
                        case 42 -> 239;
                        case 43 -> 206;
                        case 44 -> 52;
                        case 45 -> 92;
                        case 46 -> 175;
                        case 47 -> 189;
                        case 48 -> 201;
                        case 49 -> 58;
                        case 50 -> 101;
                        case 51 -> 45;
                        case 52 -> 240;
                        case 53 -> 192;
                        case 54 -> 254;
                        case 55 -> 161;
                        case 56 -> 125;
                        case 57 -> 136;
                        case 58 -> 147;
                        case 59 -> 181;
                        case 60 -> 160;
                        case 61 -> 139;
                        case 62 -> 127;
                        case 63 -> 197;
                        case 64 -> 55;
                        case 65 -> 3;
                        case 66 -> 118;
                        case 67 -> 67;
                        case 68 -> 49;
                        case 69 -> 141;
                        case 70 -> 72;
                        case 71 -> 40;
                        case 72 -> 162;
                        case 73 -> 31;
                        case 74 -> 79;
                        case 75 -> 78;
                        case 76 -> 119;
                        case 77 -> 250;
                        case 78 -> 4;
                        case 79 -> 150;
                        case 80 -> 151;
                        case 81 -> 165;
                        case 82 -> 163;
                        case 83 -> 24;
                        case 84 -> 11;
                        case 85 -> 74;
                        case 86 -> 62;
                        case 87 -> 208;
                        case 88 -> 190;
                        case 89 -> 171;
                        case 90 -> 131;
                        case 91 -> 157;
                        case 92 -> 0;
                        case 93 -> 199;
                        case 94 -> 180;
                        case 95 -> 91;
                        case 96 -> 73;
                        case 97 -> 102;
                        case 98 -> 242;
                        case 99 -> 28;
                        case 100 -> 100;
                        case 101 -> 143;
                        case 102 -> 247;
                        case 103 -> 6;
                        case 104 -> 251;
                        case 105 -> 26;
                        case 106 -> 224;
                        case 107 -> 95;
                        case 108 -> 69;
                        case 109 -> 234;
                        case 110 -> 54;
                        case 111 -> 9;
                        case 112 -> 53;
                        case 113 -> 114;
                        case 114 -> 155;
                        case 115 -> 203;
                        case 116 -> 225;
                        case 117 -> 98;
                        case 118 -> 68;
                        case 119 -> 12;
                        case 120 -> 50;
                        case 121 -> 85;
                        case 122 -> 236;
                        case 123 -> 241;
                        case 124 -> 38;
                        case 125 -> 66;
                        case 126 -> 89;
                        case 127 -> 207;
                        case 128 -> 87;
                        case 129 -> 18;
                        case 130 -> 83;
                        case 131 -> 20;
                        case 132 -> 193;
                        case 133 -> 96;
                        case 134 -> 111;
                        case 135 -> 2;
                        case 136 -> 35;
                        case 137 -> 177;
                        case 138 -> 57;
                        case 139 -> 173;
                        case 140 -> 116;
                        case 141 -> 13;
                        case 142 -> 216;
                        case 143 -> 211;
                        case 144 -> 15;
                        case 145 -> 84;
                        case 146 -> 230;
                        case 147 -> 248;
                        case 148 -> 46;
                        case 149 -> 231;
                        case 150 -> 149;
                        case 151 -> 51;
                        case 152 -> 194;
                        case 153 -> 154;
                        case 154 -> 253;
                        case 155 -> 86;
                        case 156 -> 167;
                        case 157 -> 185;
                        case 158 -> 90;
                        case 159 -> 232;
                        case 160 -> 158;
                        case 161 -> 10;
                        case 162 -> 184;
                        case 163 -> 108;
                        case 164 -> 5;
                        case 165 -> 164;
                        case 166 -> 220;
                        case 167 -> 159;
                        case 168 -> 213;
                        case 169 -> 44;
                        case 170 -> 214;
                        case 171 -> 71;
                        case 172 -> 117;
                        case 173 -> 200;
                        case 174 -> 182;
                        case 175 -> 170;
                        case 176 -> 7;
                        case 177 -> 120;
                        case 178 -> 81;
                        case 179 -> 222;
                        case 180 -> 27;
                        case 181 -> 134;
                        case 182 -> 59;
                        case 183 -> 233;
                        case 184 -> 148;
                        case 185 -> 138;
                        case 186 -> 223;
                        case 187 -> 48;
                        case 188 -> 156;
                        case 189 -> 47;
                        case 190 -> 237;
                        case 191 -> 226;
                        case 192 -> 172;
                        case 193 -> 210;
                        case 194 -> 195;
                        case 195 -> 228;
                        case 196 -> 219;
                        case 197 -> 174;
                        case 198 -> 152;
                        case 199 -> 252;
                        case 200 -> 110;
                        case 201 -> 129;
                        case 202 -> 217;
                        case 203 -> 122;
                        case 204 -> 198;
                        case 205 -> 103;
                        case 206 -> 36;
                        case 207 -> 178;
                        case 208 -> 123;
                        case 209 -> 106;
                        case 210 -> 19;
                        case 211 -> 97;
                        case 212 -> 140;
                        case 213 -> 34;
                        case 214 -> 132;
                        case 215 -> 37;
                        case 216 -> 77;
                        case 217 -> 130;
                        case 218 -> 75;
                        case 219 -> 144;
                        case 220 -> 112;
                        case 221 -> 176;
                        case 222 -> 179;
                        case 223 -> 221;
                        case 224 -> 205;
                        case 225 -> 243;
                        case 226 -> 56;
                        case 227 -> 133;
                        case 228 -> 93;
                        case 229 -> 244;
                        case 230 -> 41;
                        case 231 -> 42;
                        case 232 -> 64;
                        case 233 -> 115;
                        case 234 -> 25;
                        case 235 -> 183;
                        case 236 -> 70;
                        case 237 -> 105;
                        case 238 -> 76;
                        case 239 -> 209;
                        case 240 -> 153;
                        case 241 -> 99;
                        case 242 -> 128;
                        case 243 -> 202;
                        case 244 -> 23;
                        case 245 -> 188;
                        case 246 -> 229;
                        case 247 -> 135;
                        case 248 -> 142;
                        case 249 -> 249;
                        case 250 -> 33;
                        case 251 -> 60;
                        case 252 -> 238;
                        case 253 -> 21;
                        case 254 -> 109;
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

                     b[var2] = new String(var3).intern();
                  }

                  return b[var2];
               }
            }
         ));
      var10001 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      var10002 = 31014;
      var10003 = -25476;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Fishing bobber",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         (Function0)(() -> bS()),
         0L,
         (Function0)(new Function0<Boolean>() {
   public Boolean invoke() { return null; } // PX-FIX abs

            final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII receiver = null; // PX-FIX recv
            private static String[] a;
            private static String[] b;

            {
               short var10004 = 17438;
               short var10005 = -12432;
               var10005 = 17439;
               short var10006 = 14925;
            }

            public final Boolean a() {
      Object receiver = null; // PX-FIX
               return ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).bz();
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
   pxClinit: {
               String[] var5 = new String[2];
               int var3 = 0;
               String var2 = "Õ®\\¥\\¸\u0098ðë\u0011óbÈGÛ\u0006L\u0088·\u0001\u0011Û.\u009dµdº\u009f°\u000b\u0019ïcKg«\u0002B";
               int var4 = "Õ®\\¥\\¸\u0098ðë\u0011óbÈGÛ\u0006L\u0088·\u0001\u0011Û.\u009dµdº\u009f°\u000b\u0019ïcKg«\u0002B".length();
               char var1 = 20;
               int var0 = -1;

               while (true) {
                  char[] var10002;
                  label38: {
                     char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                     int var10004 = var10003.length;
                     int var6 = 0;
                     byte var13 = 110;
                     var10002 = var10003;
                     int var8 = var10004;
                     byte var16;
                     char[] var10005;
                     int var10006;
                     if (var10004 <= 1) {
                        var10005 = var10003;
                        var16 = 110;
                        var10006 = var6;
                     } else {
                        var13 = 110;
                        var8 = var10004;
                        if (var10004 <= var6) {
                           break label38;
                        }

                        var10005 = var10003;
                        var16 = 110;
                        var10006 = var6;
                     }

                     while (true) {
                        var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                           case 0 -> 9;
                           case 1 -> 31;
                           case 2 -> 5;
                           case 3 -> 47;
                           case 4 -> 18;
                           case 5 -> 33;
                           default -> 94;
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

            private static String a(int var0, int var1) {
               int var2 = (var0 ^ 17439) & 65535;
               if (b[var2] == null) {
                  char[] var3 = a[var2].toCharArray();

                  short var4 = switch (var3[0] & 0xFF) {
                     case 0 -> 146;
                     case 1 -> 126;
                     case 2 -> 75;
                     case 3 -> 153;
                     case 4 -> 53;
                     case 5 -> 58;
                     case 6 -> 242;
                     case 7 -> 80;
                     case 8 -> 42;
                     case 9 -> 21;
                     case 10 -> 215;
                     case 11 -> 248;
                     case 12 -> 125;
                     case 13 -> 56;
                     case 14 -> 194;
                     case 15 -> 64;
                     case 16 -> 182;
                     case 17 -> 123;
                     case 18 -> 29;
                     case 19 -> 87;
                     case 20 -> 130;
                     case 21 -> 106;
                     case 22 -> 225;
                     case 23 -> 27;
                     case 24 -> 30;
                     case 25 -> 200;
                     case 26 -> 23;
                     case 27 -> 172;
                     case 28 -> 186;
                     case 29 -> 51;
                     case 30 -> 92;
                     case 31 -> 132;
                     case 32 -> 149;
                     case 33 -> 78;
                     case 34 -> 84;
                     case 35 -> 171;
                     case 36 -> 181;
                     case 37 -> 168;
                     case 38 -> 199;
                     case 39 -> 7;
                     case 40 -> 179;
                     case 41 -> 167;
                     case 42 -> 122;
                     case 43 -> 192;
                     case 44 -> 207;
                     case 45 -> 109;
                     case 46 -> 118;
                     case 47 -> 134;
                     case 48 -> 222;
                     case 49 -> 81;
                     case 50 -> 44;
                     case 51 -> 26;
                     case 52 -> 239;
                     case 53 -> 74;
                     case 54 -> 94;
                     case 55 -> 110;
                     case 56 -> 162;
                     case 57 -> 96;
                     case 58 -> 177;
                     case 59 -> 86;
                     case 60 -> 72;
                     case 61 -> 224;
                     case 62 -> 226;
                     case 63 -> 107;
                     case 64 -> 120;
                     case 65 -> 217;
                     case 66 -> 104;
                     case 67 -> 136;
                     case 68 -> 184;
                     case 69 -> 43;
                     case 70 -> 164;
                     case 71 -> 208;
                     case 72 -> 39;
                     case 73 -> 244;
                     case 74 -> 253;
                     case 75 -> 188;
                     case 76 -> 166;
                     case 77 -> 223;
                     case 78 -> 111;
                     case 79 -> 176;
                     case 80 -> 205;
                     case 81 -> 2;
                     case 82 -> 154;
                     case 83 -> 196;
                     case 84 -> 59;
                     case 85 -> 65;
                     case 86 -> 140;
                     case 87 -> 151;
                     case 88 -> 227;
                     case 89 -> 52;
                     case 90 -> 40;
                     case 91 -> 238;
                     case 92 -> 79;
                     case 93 -> 93;
                     case 94 -> 170;
                     case 95 -> 252;
                     case 96 -> 218;
                     case 97 -> 47;
                     case 98 -> 141;
                     case 99 -> 202;
                     case 100 -> 183;
                     case 101 -> 73;
                     case 102 -> 159;
                     case 103 -> 247;
                     case 104 -> 237;
                     case 105 -> 99;
                     case 106 -> 18;
                     case 107 -> 85;
                     case 108 -> 54;
                     case 109 -> 204;
                     case 110 -> 103;
                     case 111 -> 128;
                     case 112 -> 216;
                     case 113 -> 250;
                     case 114 -> 90;
                     case 115 -> 8;
                     case 116 -> 95;
                     case 117 -> 116;
                     case 118 -> 139;
                     case 119 -> 3;
                     case 120 -> 213;
                     case 121 -> 206;
                     case 122 -> 236;
                     case 123 -> 46;
                     case 124 -> 112;
                     case 125 -> 71;
                     case 126 -> 9;
                     case 127 -> 191;
                     case 128 -> 115;
                     case 129 -> 169;
                     case 130 -> 195;
                     case 131 -> 251;
                     case 132 -> 210;
                     case 133 -> 219;
                     case 134 -> 150;
                     case 135 -> 77;
                     case 136 -> 91;
                     case 137 -> 70;
                     case 138 -> 13;
                     case 139 -> 180;
                     case 140 -> 185;
                     case 141 -> 66;
                     case 142 -> 148;
                     case 143 -> 189;
                     case 144 -> 127;
                     case 145 -> 97;
                     case 146 -> 203;
                     case 147 -> 33;
                     case 148 -> 212;
                     case 149 -> 105;
                     case 150 -> 101;
                     case 151 -> 143;
                     case 152 -> 234;
                     case 153 -> 31;
                     case 154 -> 117;
                     case 155 -> 228;
                     case 156 -> 35;
                     case 157 -> 25;
                     case 158 -> 63;
                     case 159 -> 137;
                     case 160 -> 254;
                     case 161 -> 34;
                     case 162 -> 24;
                     case 163 -> 152;
                     case 164 -> 158;
                     case 165 -> 17;
                     case 166 -> 144;
                     case 167 -> 121;
                     case 168 -> 55;
                     case 169 -> 61;
                     case 170 -> 5;
                     case 171 -> 246;
                     case 172 -> 240;
                     case 173 -> 235;
                     case 174 -> 57;
                     case 175 -> 243;
                     case 176 -> 60;
                     case 177 -> 209;
                     case 178 -> 124;
                     case 179 -> 135;
                     case 180 -> 214;
                     case 181 -> 38;
                     case 182 -> 114;
                     case 183 -> 178;
                     case 184 -> 175;
                     case 185 -> 197;
                     case 186 -> 102;
                     case 187 -> 4;
                     case 188 -> 145;
                     case 189 -> 67;
                     case 190 -> 20;
                     case 191 -> 142;
                     case 192 -> 198;
                     case 193 -> 12;
                     case 194 -> 1;
                     case 195 -> 36;
                     case 196 -> 165;
                     case 197 -> 147;
                     case 198 -> 62;
                     case 199 -> 19;
                     case 200 -> 160;
                     case 201 -> 45;
                     case 202 -> 173;
                     case 203 -> 241;
                     case 204 -> 233;
                     case 205 -> 76;
                     case 206 -> 163;
                     case 207 -> 201;
                     case 208 -> 68;
                     case 209 -> 187;
                     case 210 -> 229;
                     case 211 -> 249;
                     case 212 -> 28;
                     case 213 -> 89;
                     case 214 -> 190;
                     case 215 -> 98;
                     case 216 -> 155;
                     case 217 -> 255;
                     case 218 -> 129;
                     case 219 -> 220;
                     case 220 -> 16;
                     case 221 -> 232;
                     case 222 -> 119;
                     case 223 -> 11;
                     case 224 -> 83;
                     case 225 -> 6;
                     case 226 -> 50;
                     case 227 -> 88;
                     case 228 -> 113;
                     case 229 -> 133;
                     case 230 -> 0;
                     case 231 -> 32;
                     case 232 -> 230;
                     case 233 -> 156;
                     case 234 -> 138;
                     case 235 -> 15;
                     case 236 -> 231;
                     case 237 -> 100;
                     case 238 -> 245;
                     case 239 -> 157;
                     case 240 -> 69;
                     case 241 -> 49;
                     case 242 -> 82;
                     case 243 -> 48;
                     case 244 -> 174;
                     case 245 -> 193;
                     case 246 -> 22;
                     case 247 -> 14;
                     case 248 -> 161;
                     case 249 -> 108;
                     case 250 -> 10;
                     case 251 -> 41;
                     case 252 -> 211;
                     case 253 -> 37;
                     case 254 -> 131;
                     default -> 221;
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
         }),
         false,
         false,
         (Function0)(() -> f(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -16807;
                  short var10005 = -22583;
                  var10005 = -16808;
                  short var10006 = 13259;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -16805;
                  short var10002 = -7420;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "éï\u0005\u0003È5Rr\u0088Q²\u0086\u00adÌ>êm:{G\u000bÐ\u009fr¦\u0005\u0000b\u001fïO\u0006õKÍÃÞøI³ý¦*ª\u0014í»(îP\u008e\u0087´\u0090Q®\u0015\u000e\u00ad\u0094pN=ÓØÑê[%ü?DLÝèB¯ö\u008aô\u0085ÿlh²óYªË¬Ë\u000e#O1,ß¶`\u008c§Ä°D%·Ûù¯ß)I?sL;Í\u009e\u008aH.\u0087\u00115Û°ÅÍ·ì3dU2ðlKì\u0090xéÒ\u0002¨ä";
                  int var4 = "éï\u0005\u0003È5Rr\u0088Q²\u0086\u00adÌ>êm:{G\u000bÐ\u009fr¦\u0005\u0000b\u001fïO\u0006õKÍÃÞøI³ý¦*ª\u0014í»(îP\u008e\u0087´\u0090Q®\u0015\u000e\u00ad\u0094pN=ÓØÑê[%ü?DLÝèB¯ö\u008aô\u0085ÿlh²óYªË¬Ë\u000e#O1,ß¶`\u008c§Ä°D%·Ûù¯ß)I?sL;Í\u009e\u008aH.\u0087\u00115Û°ÅÍ·ì3dU2ðlKì\u0090xéÒ\u0002¨ä"
                     .length();
                  char var1 = 18;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 8;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 8;
                           var10006 = var6;
                        } else {
                           var13 = 8;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 8;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 51;
                              case 1 -> 30;
                              case 2 -> 92;
                              case 3 -> 29;
                              case 4 -> 37;
                              case 5 -> 114;
                              default -> 65;
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
                  int var2 = (var0 ^ -16807) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 170;
                        case 1 -> 255;
                        case 2 -> 207;
                        case 3 -> 117;
                        case 4 -> 113;
                        case 5 -> 102;
                        case 6 -> 221;
                        case 7 -> 5;
                        case 8 -> 18;
                        case 9 -> 161;
                        case 10 -> 24;
                        case 11 -> 137;
                        case 12 -> 39;
                        case 13 -> 63;
                        case 14 -> 69;
                        case 15 -> 77;
                        case 16 -> 59;
                        case 17 -> 95;
                        case 18 -> 112;
                        case 19 -> 195;
                        case 20 -> 196;
                        case 21 -> 40;
                        case 22 -> 85;
                        case 23 -> 89;
                        case 24 -> 226;
                        case 25 -> 136;
                        case 26 -> 13;
                        case 27 -> 51;
                        case 28 -> 34;
                        case 29 -> 158;
                        case 30 -> 125;
                        case 31 -> 139;
                        case 32 -> 70;
                        case 33 -> 54;
                        case 34 -> 45;
                        case 35 -> 180;
                        case 36 -> 186;
                        case 37 -> 166;
                        case 38 -> 234;
                        case 39 -> 130;
                        case 40 -> 126;
                        case 41 -> 78;
                        case 42 -> 210;
                        case 43 -> 203;
                        case 44 -> 246;
                        case 45 -> 198;
                        case 46 -> 32;
                        case 47 -> 168;
                        case 48 -> 231;
                        case 49 -> 218;
                        case 50 -> 163;
                        case 51 -> 38;
                        case 52 -> 74;
                        case 53 -> 21;
                        case 54 -> 248;
                        case 55 -> 35;
                        case 56 -> 174;
                        case 57 -> 151;
                        case 58 -> 147;
                        case 59 -> 49;
                        case 60 -> 29;
                        case 61 -> 104;
                        case 62 -> 138;
                        case 63 -> 62;
                        case 64 -> 200;
                        case 65 -> 131;
                        case 66 -> 124;
                        case 67 -> 4;
                        case 68 -> 144;
                        case 69 -> 128;
                        case 70 -> 242;
                        case 71 -> 241;
                        case 72 -> 72;
                        case 73 -> 83;
                        case 74 -> 169;
                        case 75 -> 178;
                        case 76 -> 159;
                        case 77 -> 185;
                        case 78 -> 149;
                        case 79 -> 71;
                        case 80 -> 30;
                        case 81 -> 118;
                        case 82 -> 80;
                        case 83 -> 10;
                        case 84 -> 217;
                        case 85 -> 132;
                        case 86 -> 115;
                        case 87 -> 96;
                        case 88 -> 227;
                        case 89 -> 211;
                        case 90 -> 225;
                        case 91 -> 224;
                        case 92 -> 215;
                        case 93 -> 134;
                        case 94 -> 150;
                        case 95 -> 140;
                        case 96 -> 55;
                        case 97 -> 202;
                        case 98 -> 171;
                        case 99 -> 254;
                        case 100 -> 93;
                        case 101 -> 84;
                        case 102 -> 122;
                        case 103 -> 222;
                        case 104 -> 193;
                        case 105 -> 237;
                        case 106 -> 114;
                        case 107 -> 146;
                        case 108 -> 94;
                        case 109 -> 172;
                        case 110 -> 212;
                        case 111 -> 108;
                        case 112 -> 36;
                        case 113 -> 0;
                        case 114 -> 250;
                        case 115 -> 19;
                        case 116 -> 206;
                        case 117 -> 235;
                        case 118 -> 194;
                        case 119 -> 190;
                        case 120 -> 199;
                        case 121 -> 197;
                        case 122 -> 99;
                        case 123 -> 188;
                        case 124 -> 183;
                        case 125 -> 201;
                        case 126 -> 82;
                        case 127 -> 11;
                        case 128 -> 9;
                        case 129 -> 167;
                        case 130 -> 31;
                        case 131 -> 232;
                        case 132 -> 208;
                        case 133 -> 81;
                        case 134 -> 152;
                        case 135 -> 20;
                        case 136 -> 79;
                        case 137 -> 252;
                        case 138 -> 243;
                        case 139 -> 204;
                        case 140 -> 66;
                        case 141 -> 233;
                        case 142 -> 92;
                        case 143 -> 73;
                        case 144 -> 26;
                        case 145 -> 177;
                        case 146 -> 121;
                        case 147 -> 33;
                        case 148 -> 52;
                        case 149 -> 97;
                        case 150 -> 191;
                        case 151 -> 101;
                        case 152 -> 245;
                        case 153 -> 7;
                        case 154 -> 219;
                        case 155 -> 184;
                        case 156 -> 223;
                        case 157 -> 229;
                        case 158 -> 238;
                        case 159 -> 43;
                        case 160 -> 187;
                        case 161 -> 68;
                        case 162 -> 27;
                        case 163 -> 98;
                        case 164 -> 60;
                        case 165 -> 192;
                        case 166 -> 141;
                        case 167 -> 47;
                        case 168 -> 175;
                        case 169 -> 46;
                        case 170 -> 109;
                        case 171 -> 42;
                        case 172 -> 58;
                        case 173 -> 111;
                        case 174 -> 129;
                        case 175 -> 91;
                        case 176 -> 12;
                        case 177 -> 53;
                        case 178 -> 76;
                        case 179 -> 244;
                        case 180 -> 173;
                        case 181 -> 1;
                        case 182 -> 157;
                        case 183 -> 247;
                        case 184 -> 205;
                        case 185 -> 116;
                        case 186 -> 148;
                        case 187 -> 155;
                        case 188 -> 230;
                        case 189 -> 110;
                        case 190 -> 64;
                        case 191 -> 251;
                        case 192 -> 67;
                        case 193 -> 105;
                        case 194 -> 88;
                        case 195 -> 164;
                        case 196 -> 37;
                        case 197 -> 181;
                        case 198 -> 143;
                        case 199 -> 160;
                        case 200 -> 123;
                        case 201 -> 17;
                        case 202 -> 209;
                        case 203 -> 75;
                        case 204 -> 220;
                        case 205 -> 253;
                        case 206 -> 50;
                        case 207 -> 120;
                        case 208 -> 86;
                        case 209 -> 182;
                        case 210 -> 15;
                        case 211 -> 107;
                        case 212 -> 16;
                        case 213 -> 56;
                        case 214 -> 6;
                        case 215 -> 228;
                        case 216 -> 249;
                        case 217 -> 61;
                        case 218 -> 154;
                        case 219 -> 87;
                        case 220 -> 127;
                        case 221 -> 142;
                        case 222 -> 14;
                        case 223 -> 8;
                        case 224 -> 3;
                        case 225 -> 240;
                        case 226 -> 57;
                        case 227 -> 22;
                        case 228 -> 65;
                        case 229 -> 106;
                        case 230 -> 100;
                        case 231 -> 239;
                        case 232 -> 44;
                        case 233 -> 135;
                        case 234 -> 179;
                        case 235 -> 48;
                        case 236 -> 133;
                        case 237 -> 216;
                        case 238 -> 214;
                        case 239 -> 23;
                        case 240 -> 176;
                        case 241 -> 25;
                        case 242 -> 145;
                        case 243 -> 189;
                        case 244 -> 213;
                        case 245 -> 2;
                        case 246 -> 162;
                        case 247 -> 90;
                        case 248 -> 156;
                        case 249 -> 153;
                        case 250 -> 119;
                        case 251 -> 103;
                        case 252 -> 41;
                        case 253 -> 236;
                        case 254 -> 28;
                        default -> 165;
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
         ),
         104,
         null
      );
      var10001 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      var10002 = 31009;
      var10003 = -3279;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Fishing melee combat",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         35000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII::h),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -30571;
                  short var10005 = -4029;
                  var10005 = -30569;
                  short var10006 = -1055;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -30572;
                  short var10002 = 31808;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "»_(ýiÅ# jl\u0006%\u0014ýÅ\u0000u\u008f\u0002£\u009f{\u00965\u008d°Ýlµ\u0095¸Ê\\ñ_g¬SXå\u008f\u0001\u00188\u001fõuë9\u0001~uý\u00156èã\u0016\f\u009a²X,\u008b\u0095\u008eÏFV\u0016îv\u00862ãé\u0006\u0019õ]g<Â||\u009fÔ«\u008c~jjx3óÔôà\u001e)<Ù5\u0094Ü\u0093\u008b\u008d)&.?`÷r\u0083üßåú\u0089 Í\u00833\u008bæD\u0006Qó!\u0004¤µkoßÃ\u0081\\\u0005¢<a";
                  int var4 = "»_(ýiÅ# jl\u0006%\u0014ýÅ\u0000u\u008f\u0002£\u009f{\u00965\u008d°Ýlµ\u0095¸Ê\\ñ_g¬SXå\u008f\u0001\u00188\u001fõuë9\u0001~uý\u00156èã\u0016\f\u009a²X,\u008b\u0095\u008eÏFV\u0016îv\u00862ãé\u0006\u0019õ]g<Â||\u009fÔ«\u008c~jjx3óÔôà\u001e)<Ù5\u0094Ü\u0093\u008b\u008d)&.?`÷r\u0083üßåú\u0089 Í\u00833\u008bæD\u0006Qó!\u0004¤µkoßÃ\u0081\\\u0005¢<a"
                     .length();
                  char var1 = 18;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 104;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 104;
                           var10006 = var6;
                        } else {
                           var13 = 104;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 104;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 123;
                              case 1 -> 59;
                              case 2 -> 94;
                              case 3 -> 61;
                              case 4 -> 13;
                              case 5 -> 53;
                              default -> 109;
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
                  int var2 = (var0 ^ -30571) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 7;
                        case 1 -> 56;
                        case 2 -> 88;
                        case 3 -> 141;
                        case 4 -> 100;
                        case 5 -> 165;
                        case 6 -> 206;
                        case 7 -> 30;
                        case 8 -> 139;
                        case 9 -> 5;
                        case 10 -> 117;
                        case 11 -> 243;
                        case 12 -> 133;
                        case 13 -> 211;
                        case 14 -> 24;
                        case 15 -> 47;
                        case 16 -> 182;
                        case 17 -> 253;
                        case 18 -> 218;
                        case 19 -> 110;
                        case 20 -> 237;
                        case 21 -> 76;
                        case 22 -> 0;
                        case 23 -> 250;
                        case 24 -> 148;
                        case 25 -> 74;
                        case 26 -> 230;
                        case 27 -> 189;
                        case 28 -> 176;
                        case 29 -> 121;
                        case 30 -> 42;
                        case 31 -> 112;
                        case 32 -> 107;
                        case 33 -> 168;
                        case 34 -> 210;
                        case 35 -> 62;
                        case 36 -> 180;
                        case 37 -> 161;
                        case 38 -> 178;
                        case 39 -> 187;
                        case 40 -> 27;
                        case 41 -> 238;
                        case 42 -> 83;
                        case 43 -> 174;
                        case 44 -> 217;
                        case 45 -> 229;
                        case 46 -> 79;
                        case 47 -> 54;
                        case 48 -> 227;
                        case 49 -> 9;
                        case 50 -> 95;
                        case 51 -> 242;
                        case 52 -> 53;
                        case 53 -> 134;
                        case 54 -> 63;
                        case 55 -> 31;
                        case 56 -> 153;
                        case 57 -> 197;
                        case 58 -> 196;
                        case 59 -> 159;
                        case 60 -> 34;
                        case 61 -> 199;
                        case 62 -> 146;
                        case 63 -> 72;
                        case 64 -> 171;
                        case 65 -> 239;
                        case 66 -> 101;
                        case 67 -> 231;
                        case 68 -> 33;
                        case 69 -> 132;
                        case 70 -> 221;
                        case 71 -> 12;
                        case 72 -> 70;
                        case 73 -> 82;
                        case 74 -> 17;
                        case 75 -> 162;
                        case 76 -> 226;
                        case 77 -> 116;
                        case 78 -> 254;
                        case 79 -> 92;
                        case 80 -> 86;
                        case 81 -> 166;
                        case 82 -> 126;
                        case 83 -> 214;
                        case 84 -> 181;
                        case 85 -> 43;
                        case 86 -> 207;
                        case 87 -> 52;
                        case 88 -> 173;
                        case 89 -> 249;
                        case 90 -> 91;
                        case 91 -> 167;
                        case 92 -> 156;
                        case 93 -> 183;
                        case 94 -> 222;
                        case 95 -> 251;
                        case 96 -> 38;
                        case 97 -> 142;
                        case 98 -> 223;
                        case 99 -> 37;
                        case 100 -> 61;
                        case 101 -> 184;
                        case 102 -> 97;
                        case 103 -> 48;
                        case 104 -> 89;
                        case 105 -> 14;
                        case 106 -> 228;
                        case 107 -> 99;
                        case 108 -> 35;
                        case 109 -> 21;
                        case 110 -> 23;
                        case 111 -> 11;
                        case 112 -> 200;
                        case 113 -> 234;
                        case 114 -> 215;
                        case 115 -> 4;
                        case 116 -> 145;
                        case 117 -> 149;
                        case 118 -> 115;
                        case 119 -> 113;
                        case 120 -> 246;
                        case 121 -> 209;
                        case 122 -> 81;
                        case 123 -> 202;
                        case 124 -> 213;
                        case 125 -> 108;
                        case 126 -> 179;
                        case 127 -> 186;
                        case 128 -> 20;
                        case 129 -> 185;
                        case 130 -> 119;
                        case 131 -> 137;
                        case 132 -> 67;
                        case 133 -> 244;
                        case 134 -> 164;
                        case 135 -> 125;
                        case 136 -> 157;
                        case 137 -> 140;
                        case 138 -> 212;
                        case 139 -> 50;
                        case 140 -> 255;
                        case 141 -> 58;
                        case 142 -> 201;
                        case 143 -> 6;
                        case 144 -> 3;
                        case 145 -> 190;
                        case 146 -> 109;
                        case 147 -> 84;
                        case 148 -> 104;
                        case 149 -> 224;
                        case 150 -> 175;
                        case 151 -> 73;
                        case 152 -> 245;
                        case 153 -> 55;
                        case 154 -> 252;
                        case 155 -> 106;
                        case 156 -> 26;
                        case 157 -> 124;
                        case 158 -> 60;
                        case 159 -> 177;
                        case 160 -> 18;
                        case 161 -> 191;
                        case 162 -> 32;
                        case 163 -> 77;
                        case 164 -> 127;
                        case 165 -> 158;
                        case 166 -> 172;
                        case 167 -> 203;
                        case 168 -> 131;
                        case 169 -> 80;
                        case 170 -> 29;
                        case 171 -> 247;
                        case 172 -> 102;
                        case 173 -> 40;
                        case 174 -> 49;
                        case 175 -> 39;
                        case 176 -> 128;
                        case 177 -> 57;
                        case 178 -> 45;
                        case 179 -> 155;
                        case 180 -> 36;
                        case 181 -> 235;
                        case 182 -> 10;
                        case 183 -> 114;
                        case 184 -> 198;
                        case 185 -> 195;
                        case 186 -> 163;
                        case 187 -> 151;
                        case 188 -> 93;
                        case 189 -> 225;
                        case 190 -> 138;
                        case 191 -> 25;
                        case 192 -> 75;
                        case 193 -> 216;
                        case 194 -> 66;
                        case 195 -> 169;
                        case 196 -> 68;
                        case 197 -> 65;
                        case 198 -> 64;
                        case 199 -> 147;
                        case 200 -> 44;
                        case 201 -> 78;
                        case 202 -> 51;
                        case 203 -> 154;
                        case 204 -> 22;
                        case 205 -> 144;
                        case 206 -> 129;
                        case 207 -> 236;
                        case 208 -> 71;
                        case 209 -> 188;
                        case 210 -> 170;
                        case 211 -> 241;
                        case 212 -> 85;
                        case 213 -> 192;
                        case 214 -> 205;
                        case 215 -> 46;
                        case 216 -> 87;
                        case 217 -> 103;
                        case 218 -> 143;
                        case 219 -> 69;
                        case 220 -> 219;
                        case 221 -> 1;
                        case 222 -> 194;
                        case 223 -> 152;
                        case 224 -> 28;
                        case 225 -> 123;
                        case 226 -> 96;
                        case 227 -> 105;
                        case 228 -> 150;
                        case 229 -> 136;
                        case 230 -> 2;
                        case 231 -> 193;
                        case 232 -> 111;
                        case 233 -> 118;
                        case 234 -> 135;
                        case 235 -> 122;
                        case 236 -> 90;
                        case 237 -> 120;
                        case 238 -> 98;
                        case 239 -> 233;
                        case 240 -> 41;
                        case 241 -> 248;
                        case 242 -> 15;
                        case 243 -> 208;
                        case 244 -> 94;
                        case 245 -> 13;
                        case 246 -> 160;
                        case 247 -> 204;
                        case 248 -> 19;
                        case 249 -> 240;
                        case 250 -> 59;
                        case 251 -> 220;
                        case 252 -> 16;
                        case 253 -> 232;
                        case 254 -> 8;
                        default -> 130;
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
         ));
      var10001 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      var10002 = 30999;
      var10003 = 11852;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var2 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
      };
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Fishing ability combat",
         SetsKt.setOf(var2),
         20000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII::j),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -22075;
                  short var10005 = -17760;
                  var10005 = -22076;
                  short var10006 = 18590;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -22074;
                  short var10002 = 21608;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "6\u008cmS\u00ad ~\u0012¹Î¨\u001dq?w ×_\u0012ænÚ©]w\u0092Éë~P\teÄVxß\u0007W\u0007\u008d*ôK\u0019à`ßb\u001aæ`ÔëY·ÊÝ_\u0096¨\u0090^óÅ]\u0014iåfÜç\u009dôÕxpJ%Î¬¿V=\u000e©F\u0099\u008bT:êI[ \r×k>F@ÀKþ\"\u009aoñÀÙ\u007fñª\u0015Ò\u008f<³M\u0097\u0082£8\u0095\u0012®Ô~XÏÁ2>0K\u0099\u00adW)³âO\u0007\u0002oZ";
                  int var4 = "6\u008cmS\u00ad ~\u0012¹Î¨\u001dq?w ×_\u0012ænÚ©]w\u0092Éë~P\teÄVxß\u0007W\u0007\u008d*ôK\u0019à`ßb\u001aæ`ÔëY·ÊÝ_\u0096¨\u0090^óÅ]\u0014iåfÜç\u009dôÕxpJ%Î¬¿V=\u000e©F\u0099\u008bT:êI[ \r×k>F@ÀKþ\"\u009aoñÀÙ\u007fñª\u0015Ò\u008f<³M\u0097\u0082£8\u0095\u0012®Ô~XÏÁ2>0K\u0099\u00adW)³âO\u0007\u0002oZ"
                     .length();
                  char var1 = '{';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 120;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 120;
                           var10006 = var6;
                        } else {
                           var13 = 120;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 120;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 30;
                              case 1 -> 119;
                              case 2 -> 20;
                              case 3 -> 114;
                              case 4 -> 58;
                              case 5 -> 126;
                              default -> 92;
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
                  int var2 = (var0 ^ -22076) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 31;
                        case 1 -> 33;
                        case 2 -> 238;
                        case 3 -> 121;
                        case 4 -> 125;
                        case 5 -> 252;
                        case 6 -> 37;
                        case 7 -> 77;
                        case 8 -> 84;
                        case 9 -> 239;
                        case 10 -> 169;
                        case 11 -> 19;
                        case 12 -> 74;
                        case 13 -> 38;
                        case 14 -> 143;
                        case 15 -> 210;
                        case 16 -> 78;
                        case 17 -> 253;
                        case 18 -> 206;
                        case 19 -> 209;
                        case 20 -> 242;
                        case 21 -> 234;
                        case 22 -> 254;
                        case 23 -> 152;
                        case 24 -> 155;
                        case 25 -> 129;
                        case 26 -> 72;
                        case 27 -> 46;
                        case 28 -> 16;
                        case 29 -> 120;
                        case 30 -> 117;
                        case 31 -> 139;
                        case 32 -> 191;
                        case 33 -> 53;
                        case 34 -> 221;
                        case 35 -> 187;
                        case 36 -> 163;
                        case 37 -> 184;
                        case 38 -> 231;
                        case 39 -> 34;
                        case 40 -> 176;
                        case 41 -> 208;
                        case 42 -> 26;
                        case 43 -> 85;
                        case 44 -> 91;
                        case 45 -> 245;
                        case 46 -> 198;
                        case 47 -> 79;
                        case 48 -> 201;
                        case 49 -> 25;
                        case 50 -> 172;
                        case 51 -> 243;
                        case 52 -> 183;
                        case 53 -> 197;
                        case 54 -> 180;
                        case 55 -> 188;
                        case 56 -> 89;
                        case 57 -> 195;
                        case 58 -> 87;
                        case 59 -> 57;
                        case 60 -> 118;
                        case 61 -> 189;
                        case 62 -> 137;
                        case 63 -> 247;
                        case 64 -> 230;
                        case 65 -> 194;
                        case 66 -> 30;
                        case 67 -> 161;
                        case 68 -> 127;
                        case 69 -> 18;
                        case 70 -> 182;
                        case 71 -> 90;
                        case 72 -> 178;
                        case 73 -> 64;
                        case 74 -> 159;
                        case 75 -> 41;
                        case 76 -> 10;
                        case 77 -> 165;
                        case 78 -> 62;
                        case 79 -> 68;
                        case 80 -> 102;
                        case 81 -> 76;
                        case 82 -> 204;
                        case 83 -> 249;
                        case 84 -> 233;
                        case 85 -> 196;
                        case 86 -> 192;
                        case 87 -> 248;
                        case 88 -> 240;
                        case 89 -> 113;
                        case 90 -> 114;
                        case 91 -> 167;
                        case 92 -> 225;
                        case 93 -> 224;
                        case 94 -> 199;
                        case 95 -> 213;
                        case 96 -> 244;
                        case 97 -> 222;
                        case 98 -> 218;
                        case 99 -> 170;
                        case 100 -> 51;
                        case 101 -> 142;
                        case 102 -> 108;
                        case 103 -> 49;
                        case 104 -> 7;
                        case 105 -> 42;
                        case 106 -> 54;
                        case 107 -> 181;
                        case 108 -> 6;
                        case 109 -> 71;
                        case 110 -> 153;
                        case 111 -> 70;
                        case 112 -> 160;
                        case 113 -> 2;
                        case 114 -> 61;
                        case 115 -> 44;
                        case 116 -> 220;
                        case 117 -> 150;
                        case 118 -> 228;
                        case 119 -> 145;
                        case 120 -> 101;
                        case 121 -> 133;
                        case 122 -> 107;
                        case 123 -> 8;
                        case 124 -> 65;
                        case 125 -> 166;
                        case 126 -> 251;
                        case 127 -> 15;
                        case 128 -> 48;
                        case 129 -> 140;
                        case 130 -> 88;
                        case 131 -> 12;
                        case 132 -> 200;
                        case 133 -> 75;
                        case 134 -> 250;
                        case 135 -> 130;
                        case 136 -> 119;
                        case 137 -> 21;
                        case 138 -> 138;
                        case 139 -> 164;
                        case 140 -> 66;
                        case 141 -> 29;
                        case 142 -> 175;
                        case 143 -> 103;
                        case 144 -> 144;
                        case 145 -> 235;
                        case 146 -> 99;
                        case 147 -> 23;
                        case 148 -> 69;
                        case 149 -> 151;
                        case 150 -> 94;
                        case 151 -> 52;
                        case 152 -> 177;
                        case 153 -> 212;
                        case 154 -> 86;
                        case 155 -> 255;
                        case 156 -> 168;
                        case 157 -> 3;
                        case 158 -> 135;
                        case 159 -> 28;
                        case 160 -> 171;
                        case 161 -> 59;
                        case 162 -> 92;
                        case 163 -> 4;
                        case 164 -> 39;
                        case 165 -> 227;
                        case 166 -> 63;
                        case 167 -> 162;
                        case 168 -> 217;
                        case 169 -> 97;
                        case 170 -> 237;
                        case 171 -> 202;
                        case 172 -> 95;
                        case 173 -> 67;
                        case 174 -> 110;
                        case 175 -> 203;
                        case 176 -> 174;
                        case 177 -> 96;
                        case 178 -> 124;
                        case 179 -> 123;
                        case 180 -> 173;
                        case 181 -> 205;
                        case 182 -> 226;
                        case 183 -> 55;
                        case 184 -> 81;
                        case 185 -> 14;
                        case 186 -> 56;
                        case 187 -> 211;
                        case 188 -> 185;
                        case 189 -> 134;
                        case 190 -> 148;
                        case 191 -> 73;
                        case 192 -> 36;
                        case 193 -> 186;
                        case 194 -> 131;
                        case 195 -> 219;
                        case 196 -> 147;
                        case 197 -> 58;
                        case 198 -> 112;
                        case 199 -> 11;
                        case 200 -> 0;
                        case 201 -> 40;
                        case 202 -> 80;
                        case 203 -> 128;
                        case 204 -> 215;
                        case 205 -> 241;
                        case 206 -> 1;
                        case 207 -> 246;
                        case 208 -> 22;
                        case 209 -> 122;
                        case 210 -> 179;
                        case 211 -> 214;
                        case 212 -> 132;
                        case 213 -> 104;
                        case 214 -> 141;
                        case 215 -> 98;
                        case 216 -> 24;
                        case 217 -> 190;
                        case 218 -> 158;
                        case 219 -> 32;
                        case 220 -> 223;
                        case 221 -> 111;
                        case 222 -> 146;
                        case 223 -> 45;
                        case 224 -> 106;
                        case 225 -> 157;
                        case 226 -> 156;
                        case 227 -> 82;
                        case 228 -> 105;
                        case 229 -> 5;
                        case 230 -> 136;
                        case 231 -> 149;
                        case 232 -> 232;
                        case 233 -> 9;
                        case 234 -> 115;
                        case 235 -> 116;
                        case 236 -> 100;
                        case 237 -> 35;
                        case 238 -> 236;
                        case 239 -> 154;
                        case 240 -> 17;
                        case 241 -> 193;
                        case 242 -> 126;
                        case 243 -> 207;
                        case 244 -> 216;
                        case 245 -> 43;
                        case 246 -> 109;
                        case 247 -> 83;
                        case 248 -> 47;
                        case 249 -> 20;
                        case 250 -> 50;
                        case 251 -> 93;
                        case 252 -> 13;
                        case 253 -> 27;
                        case 254 -> 60;
                        default -> 229;
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
         ));
      var10001 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      var10002 = 31032;
      var10003 = 24444;
      var2 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      };
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10001,
         "Fishing quick combat",
         SetsKt.setOf(var2),
         5000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII::l),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 32474;
                  short var10005 = 22482;
                  var10005 = 32475;
                  short var10006 = 16133;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 32473;
                  short var10002 = -145;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0084{kæë¯H\u0011¥þ`\u009dÑÑ\u0081'YôE*z¡ñb7óx9ªÐÃ>\u001b\u0084}g}\u0010\u0003ã\u0013Ç\u008e¥\b¼D@\u0097@\u000bPÍOÊö\u0090\u0002oH)û:\u0093¾\u008e^09\u0098îÏ\u0085ÔÐé¡ôiÆ\u0000\u009ds\u0089\u0082l¬\u0085tB\u0010¤ÞMöì\u00ad§|©×=\u009aUèce\u0011\u0000ÃsÃ§%\u0089\u0089õB¡\u0081¿\b]\u0012¬\u0018n\u008aK\"\\ 'È0[Û\tÀ<q\u0097\u0002¯g";
                  int var4 = "\u0084{kæë¯H\u0011¥þ`\u009dÑÑ\u0081'YôE*z¡ñb7óx9ªÐÃ>\u001b\u0084}g}\u0010\u0003ã\u0013Ç\u008e¥\b¼D@\u0097@\u000bPÍOÊö\u0090\u0002oH)û:\u0093¾\u008e^09\u0098îÏ\u0085ÔÐé¡ôiÆ\u0000\u009ds\u0089\u0082l¬\u0085tB\u0010¤ÞMöì\u00ad§|©×=\u009aUèce\u0011\u0000ÃsÃ§%\u0089\u0089õB¡\u0081¿\b]\u0012¬\u0018n\u008aK\"\\ 'È0[Û\tÀ<q\u0097\u0002¯g"
                     .length();
                  char var1 = '{';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 118;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 118;
                           var10006 = var6;
                        } else {
                           var13 = 118;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 118;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 112;
                              case 1 -> 72;
                              case 2 -> 70;
                              case 3 -> 17;
                              case 4 -> 57;
                              case 5 -> 100;
                              default -> 13;
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
                  int var2 = (var0 ^ 32475) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 253;
                        case 1 -> 234;
                        case 2 -> 215;
                        case 3 -> 56;
                        case 4 -> 127;
                        case 5 -> 239;
                        case 6 -> 44;
                        case 7 -> 184;
                        case 8 -> 152;
                        case 9 -> 123;
                        case 10 -> 249;
                        case 11 -> 193;
                        case 12 -> 65;
                        case 13 -> 68;
                        case 14 -> 32;
                        case 15 -> 23;
                        case 16 -> 118;
                        case 17 -> 128;
                        case 18 -> 200;
                        case 19 -> 194;
                        case 20 -> 238;
                        case 21 -> 87;
                        case 22 -> 31;
                        case 23 -> 138;
                        case 24 -> 112;
                        case 25 -> 232;
                        case 26 -> 196;
                        case 27 -> 96;
                        case 28 -> 72;
                        case 29 -> 73;
                        case 30 -> 116;
                        case 31 -> 17;
                        case 32 -> 82;
                        case 33 -> 121;
                        case 34 -> 171;
                        case 35 -> 153;
                        case 36 -> 147;
                        case 37 -> 145;
                        case 38 -> 179;
                        case 39 -> 243;
                        case 40 -> 102;
                        case 41 -> 140;
                        case 42 -> 209;
                        case 43 -> 250;
                        case 44 -> 166;
                        case 45 -> 40;
                        case 46 -> 133;
                        case 47 -> 172;
                        case 48 -> 81;
                        case 49 -> 101;
                        case 50 -> 229;
                        case 51 -> 159;
                        case 52 -> 218;
                        case 53 -> 79;
                        case 54 -> 168;
                        case 55 -> 207;
                        case 56 -> 75;
                        case 57 -> 89;
                        case 58 -> 219;
                        case 59 -> 189;
                        case 60 -> 91;
                        case 61 -> 15;
                        case 62 -> 7;
                        case 63 -> 94;
                        case 64 -> 155;
                        case 65 -> 167;
                        case 66 -> 134;
                        case 67 -> 67;
                        case 68 -> 204;
                        case 69 -> 106;
                        case 70 -> 231;
                        case 71 -> 98;
                        case 72 -> 33;
                        case 73 -> 252;
                        case 74 -> 70;
                        case 75 -> 226;
                        case 76 -> 139;
                        case 77 -> 107;
                        case 78 -> 26;
                        case 79 -> 61;
                        case 80 -> 83;
                        case 81 -> 71;
                        case 82 -> 198;
                        case 83 -> 132;
                        case 84 -> 220;
                        case 85 -> 88;
                        case 86 -> 25;
                        case 87 -> 104;
                        case 88 -> 173;
                        case 89 -> 251;
                        case 90 -> 85;
                        case 91 -> 233;
                        case 92 -> 12;
                        case 93 -> 9;
                        case 94 -> 19;
                        case 95 -> 103;
                        case 96 -> 144;
                        case 97 -> 254;
                        case 98 -> 225;
                        case 99 -> 43;
                        case 100 -> 205;
                        case 101 -> 149;
                        case 102 -> 39;
                        case 103 -> 164;
                        case 104 -> 180;
                        case 105 -> 217;
                        case 106 -> 245;
                        case 107 -> 192;
                        case 108 -> 3;
                        case 109 -> 11;
                        case 110 -> 4;
                        case 111 -> 174;
                        case 112 -> 111;
                        case 113 -> 230;
                        case 114 -> 122;
                        case 115 -> 20;
                        case 116 -> 156;
                        case 117 -> 78;
                        case 118 -> 28;
                        case 119 -> 60;
                        case 120 -> 202;
                        case 121 -> 136;
                        case 122 -> 62;
                        case 123 -> 175;
                        case 124 -> 222;
                        case 125 -> 201;
                        case 126 -> 45;
                        case 127 -> 126;
                        case 128 -> 169;
                        case 129 -> 93;
                        case 130 -> 27;
                        case 131 -> 158;
                        case 132 -> 84;
                        case 133 -> 237;
                        case 134 -> 36;
                        case 135 -> 224;
                        case 136 -> 190;
                        case 137 -> 77;
                        case 138 -> 109;
                        case 139 -> 240;
                        case 140 -> 162;
                        case 141 -> 42;
                        case 142 -> 53;
                        case 143 -> 211;
                        case 144 -> 165;
                        case 145 -> 41;
                        case 146 -> 95;
                        case 147 -> 199;
                        case 148 -> 177;
                        case 149 -> 80;
                        case 150 -> 206;
                        case 151 -> 242;
                        case 152 -> 6;
                        case 153 -> 100;
                        case 154 -> 160;
                        case 155 -> 131;
                        case 156 -> 120;
                        case 157 -> 48;
                        case 158 -> 178;
                        case 159 -> 69;
                        case 160 -> 52;
                        case 161 -> 151;
                        case 162 -> 66;
                        case 163 -> 188;
                        case 164 -> 235;
                        case 165 -> 154;
                        case 166 -> 0;
                        case 167 -> 18;
                        case 168 -> 34;
                        case 169 -> 150;
                        case 170 -> 16;
                        case 171 -> 113;
                        case 172 -> 64;
                        case 173 -> 208;
                        case 174 -> 74;
                        case 175 -> 248;
                        case 176 -> 186;
                        case 177 -> 21;
                        case 178 -> 37;
                        case 179 -> 24;
                        case 180 -> 170;
                        case 181 -> 119;
                        case 182 -> 90;
                        case 183 -> 223;
                        case 184 -> 214;
                        case 185 -> 143;
                        case 186 -> 46;
                        case 187 -> 105;
                        case 188 -> 58;
                        case 189 -> 212;
                        case 190 -> 197;
                        case 191 -> 38;
                        case 192 -> 161;
                        case 193 -> 117;
                        case 194 -> 142;
                        case 195 -> 51;
                        case 196 -> 57;
                        case 197 -> 14;
                        case 198 -> 137;
                        case 199 -> 195;
                        case 200 -> 176;
                        case 201 -> 148;
                        case 202 -> 157;
                        case 203 -> 10;
                        case 204 -> 92;
                        case 205 -> 135;
                        case 206 -> 1;
                        case 207 -> 227;
                        case 208 -> 124;
                        case 209 -> 2;
                        case 210 -> 22;
                        case 211 -> 141;
                        case 212 -> 47;
                        case 213 -> 130;
                        case 214 -> 125;
                        case 215 -> 163;
                        case 216 -> 63;
                        case 217 -> 244;
                        case 218 -> 210;
                        case 219 -> 108;
                        case 220 -> 86;
                        case 221 -> 13;
                        case 222 -> 181;
                        case 223 -> 247;
                        case 224 -> 213;
                        case 225 -> 54;
                        case 226 -> 49;
                        case 227 -> 115;
                        case 228 -> 241;
                        case 229 -> 55;
                        case 230 -> 216;
                        case 231 -> 30;
                        case 232 -> 5;
                        case 233 -> 8;
                        case 234 -> 183;
                        case 235 -> 203;
                        case 236 -> 50;
                        case 237 -> 191;
                        case 238 -> 97;
                        case 239 -> 114;
                        case 240 -> 255;
                        case 241 -> 221;
                        case 242 -> 187;
                        case 243 -> 236;
                        case 244 -> 182;
                        case 245 -> 99;
                        case 246 -> 29;
                        case 247 -> 185;
                        case 248 -> 76;
                        case 249 -> 246;
                        case 250 -> 110;
                        case 251 -> 228;
                        case 252 -> 146;
                        case 253 -> 35;
                        case 254 -> 129;
                        default -> 59;
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
         ));
      String var1 = var10000;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var4 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      short var12 = 31076;
      var10002 = 11900;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var4,
         "Fishing golden fish",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl,
         10000L,
         0L,
         (Function0)(new Function0<Boolean>() {
   public Boolean invoke() { return null; } // PX-FIX abs

            final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII receiver = null; // PX-FIX recv
            private static String[] a;
            private static String[] b;

            {
               short var10004 = 6801;
               short var10005 = -11280;
               var10005 = 6800;
               short var10006 = 24557;
            }

            public final Boolean a() {
      Object receiver = null; // PX-FIX
               return ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).bz();
            }

            // $VF: Irreducible bytecode was duplicated to produce valid code
            static {
   pxClinit: {
               String[] var5 = new String[2];
               int var3 = 0;
               String var2 = "}ª\u0080m\u001f\u0082Ø NÒ\u000fÂt{[,\u0095\u0014ïWÒÒUu\u0091^g\r*9Ð\u0004ÏÃ\u0007x\u0006<";
               int var4 = "}ª\u0080m\u001f\u0082Ø NÒ\u000fÂt{[,\u0095\u0014ïWÒÒUu\u0091^g\r*9Ð\u0004ÏÃ\u0007x\u0006<".length();
               char var1 = 17;
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
                           case 0 -> 36;
                           case 1 -> 12;
                           case 2 -> 89;
                           case 3 -> 53;
                           case 4 -> 113;
                           case 5 -> 113;
                           default -> 42;
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

            private static String a(int var0, int var1) {
               int var2 = (var0 ^ 6801) & 65535;
               if (b[var2] == null) {
                  char[] var3 = a[var2].toCharArray();

                  short var4 = switch (var3[0] & 0xFF) {
                     case 0 -> 222;
                     case 1 -> 65;
                     case 2 -> 35;
                     case 3 -> 25;
                     case 4 -> 205;
                     case 5 -> 197;
                     case 6 -> 141;
                     case 7 -> 182;
                     case 8 -> 226;
                     case 9 -> 115;
                     case 10 -> 140;
                     case 11 -> 20;
                     case 12 -> 14;
                     case 13 -> 245;
                     case 14 -> 15;
                     case 15 -> 233;
                     case 16 -> 231;
                     case 17 -> 217;
                     case 18 -> 112;
                     case 19 -> 196;
                     case 20 -> 229;
                     case 21 -> 171;
                     case 22 -> 165;
                     case 23 -> 215;
                     case 24 -> 62;
                     case 25 -> 29;
                     case 26 -> 114;
                     case 27 -> 16;
                     case 28 -> 194;
                     case 29 -> 57;
                     case 30 -> 72;
                     case 31 -> 0;
                     case 32 -> 134;
                     case 33 -> 252;
                     case 34 -> 11;
                     case 35 -> 181;
                     case 36 -> 149;
                     case 37 -> 58;
                     case 38 -> 18;
                     case 39 -> 232;
                     case 40 -> 175;
                     case 41 -> 60;
                     case 42 -> 76;
                     case 43 -> 81;
                     case 44 -> 17;
                     case 45 -> 161;
                     case 46 -> 27;
                     case 47 -> 100;
                     case 48 -> 150;
                     case 49 -> 138;
                     case 50 -> 248;
                     case 51 -> 12;
                     case 52 -> 122;
                     case 53 -> 63;
                     case 54 -> 154;
                     case 55 -> 220;
                     case 56 -> 66;
                     case 57 -> 241;
                     case 58 -> 174;
                     case 59 -> 1;
                     case 60 -> 168;
                     case 61 -> 184;
                     case 62 -> 172;
                     case 63 -> 41;
                     case 64 -> 52;
                     case 65 -> 68;
                     case 66 -> 152;
                     case 67 -> 93;
                     case 68 -> 178;
                     case 69 -> 135;
                     case 70 -> 199;
                     case 71 -> 94;
                     case 72 -> 50;
                     case 73 -> 118;
                     case 74 -> 22;
                     case 75 -> 228;
                     case 76 -> 74;
                     case 77 -> 53;
                     case 78 -> 77;
                     case 79 -> 110;
                     case 80 -> 78;
                     case 81 -> 120;
                     case 82 -> 242;
                     case 83 -> 239;
                     case 84 -> 186;
                     case 85 -> 207;
                     case 86 -> 209;
                     case 87 -> 24;
                     case 88 -> 240;
                     case 89 -> 121;
                     case 90 -> 46;
                     case 91 -> 144;
                     case 92 -> 92;
                     case 93 -> 96;
                     case 94 -> 98;
                     case 95 -> 223;
                     case 96 -> 130;
                     case 97 -> 133;
                     case 98 -> 187;
                     case 99 -> 23;
                     case 100 -> 101;
                     case 101 -> 44;
                     case 102 -> 254;
                     case 103 -> 54;
                     case 104 -> 153;
                     case 105 -> 7;
                     case 106 -> 85;
                     case 107 -> 111;
                     case 108 -> 225;
                     case 109 -> 71;
                     case 110 -> 36;
                     case 111 -> 128;
                     case 112 -> 136;
                     case 113 -> 129;
                     case 114 -> 146;
                     case 115 -> 97;
                     case 116 -> 70;
                     case 117 -> 139;
                     case 118 -> 9;
                     case 119 -> 191;
                     case 120 -> 198;
                     case 121 -> 158;
                     case 122 -> 6;
                     case 123 -> 99;
                     case 124 -> 69;
                     case 125 -> 202;
                     case 126 -> 236;
                     case 127 -> 188;
                     case 128 -> 156;
                     case 129 -> 37;
                     case 130 -> 102;
                     case 131 -> 246;
                     case 132 -> 148;
                     case 133 -> 218;
                     case 134 -> 237;
                     case 135 -> 180;
                     case 136 -> 176;
                     case 137 -> 203;
                     case 138 -> 179;
                     case 139 -> 125;
                     case 140 -> 106;
                     case 141 -> 5;
                     case 142 -> 249;
                     case 143 -> 247;
                     case 144 -> 67;
                     case 145 -> 31;
                     case 146 -> 235;
                     case 147 -> 160;
                     case 148 -> 28;
                     case 149 -> 142;
                     case 150 -> 21;
                     case 151 -> 126;
                     case 152 -> 221;
                     case 153 -> 47;
                     case 154 -> 2;
                     case 155 -> 131;
                     case 156 -> 170;
                     case 157 -> 84;
                     case 158 -> 103;
                     case 159 -> 192;
                     case 160 -> 201;
                     case 161 -> 132;
                     case 162 -> 82;
                     case 163 -> 79;
                     case 164 -> 213;
                     case 165 -> 185;
                     case 166 -> 255;
                     case 167 -> 251;
                     case 168 -> 195;
                     case 169 -> 34;
                     case 170 -> 56;
                     case 171 -> 87;
                     case 172 -> 243;
                     case 173 -> 224;
                     case 174 -> 173;
                     case 175 -> 212;
                     case 176 -> 8;
                     case 177 -> 145;
                     case 178 -> 61;
                     case 179 -> 214;
                     case 180 -> 193;
                     case 181 -> 107;
                     case 182 -> 40;
                     case 183 -> 26;
                     case 184 -> 123;
                     case 185 -> 219;
                     case 186 -> 105;
                     case 187 -> 55;
                     case 188 -> 19;
                     case 189 -> 89;
                     case 190 -> 48;
                     case 191 -> 206;
                     case 192 -> 169;
                     case 193 -> 95;
                     case 194 -> 204;
                     case 195 -> 4;
                     case 196 -> 162;
                     case 197 -> 151;
                     case 198 -> 108;
                     case 199 -> 253;
                     case 200 -> 33;
                     case 201 -> 208;
                     case 202 -> 230;
                     case 203 -> 177;
                     case 204 -> 91;
                     case 205 -> 86;
                     case 206 -> 124;
                     case 207 -> 157;
                     case 208 -> 64;
                     case 209 -> 45;
                     case 210 -> 183;
                     case 211 -> 109;
                     case 212 -> 104;
                     case 213 -> 200;
                     case 214 -> 13;
                     case 215 -> 155;
                     case 216 -> 10;
                     case 217 -> 163;
                     case 218 -> 190;
                     case 219 -> 211;
                     case 220 -> 166;
                     case 221 -> 3;
                     case 222 -> 117;
                     case 223 -> 30;
                     case 224 -> 38;
                     case 225 -> 189;
                     case 226 -> 83;
                     case 227 -> 39;
                     case 228 -> 42;
                     case 229 -> 88;
                     case 230 -> 116;
                     case 231 -> 59;
                     case 232 -> 113;
                     case 233 -> 167;
                     case 234 -> 119;
                     case 235 -> 51;
                     case 236 -> 137;
                     case 237 -> 49;
                     case 238 -> 210;
                     case 239 -> 90;
                     case 240 -> 32;
                     case 241 -> 147;
                     case 242 -> 127;
                     case 243 -> 75;
                     case 244 -> 159;
                     case 245 -> 216;
                     case 246 -> 250;
                     case 247 -> 227;
                     case 248 -> 73;
                     case 249 -> 244;
                     case 250 -> 43;
                     case 251 -> 164;
                     case 252 -> 234;
                     case 253 -> 143;
                     case 254 -> 80;
                     default -> 238;
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
         }),
         false,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 21610;
                  short var10005 = 6561;
                  var10005 = 21608;
                  short var10006 = -24339;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 21611;
                  short var10002 = 15717;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "²\u0012o[w?VHe\u0017è¼çx\f\u0011*¢\u0002\u001d´{âme´6Â~÷`àHBó§\u008eêzÝ=(øª¢ÁÍ\u009b\u0000¹îÃ\u0089ÌNýZ\u0003\u009a^o6¹ð\u0090@\t\u0090xâ\u009d_Iq\u0015wö|\\P4\u0092^\u0087YWÑÔ#g±ÿ´ \f¹ýc\u0089îoGP±^\u0081ln³U\u008b\u007fbH\u0093\u0012Ï\u001b\u00adÔ7Ä|\u0000óÕH8r¸rê\u001akÁ3\u0087Û(/\u0097gz\u0016u";
                  int var4 = "²\u0012o[w?VHe\u0017è¼çx\f\u0011*¢\u0002\u001d´{âme´6Â~÷`àHBó§\u008eêzÝ=(øª¢ÁÍ\u009b\u0000¹îÃ\u0089ÌNýZ\u0003\u009a^o6¹ð\u0090@\t\u0090xâ\u009d_Iq\u0015wö|\\P4\u0092^\u0087YWÑÔ#g±ÿ´ \f¹ýc\u0089îoGP±^\u0081ln³U\u008b\u007fbH\u0093\u0012Ï\u001b\u00adÔ7Ä|\u0000óÕH8r¸rê\u001akÁ3\u0087Û(/\u0097gz\u0016u"
                     .length();
                  char var1 = 18;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 74;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 74;
                           var10006 = var6;
                        } else {
                           var13 = 74;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 74;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 2;
                              case 1 -> 51;
                              case 2 -> 113;
                              case 3 -> 85;
                              case 4 -> 120;
                              case 5 -> 112;
                              default -> 19;
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
                  int var2 = (var0 ^ 21610) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 157;
                        case 1 -> 197;
                        case 2 -> 212;
                        case 3 -> 106;
                        case 4 -> 90;
                        case 5 -> 240;
                        case 6 -> 103;
                        case 7 -> 96;
                        case 8 -> 252;
                        case 9 -> 154;
                        case 10 -> 126;
                        case 11 -> 18;
                        case 12 -> 134;
                        case 13 -> 82;
                        case 14 -> 32;
                        case 15 -> 86;
                        case 16 -> 180;
                        case 17 -> 222;
                        case 18 -> 53;
                        case 19 -> 235;
                        case 20 -> 12;
                        case 21 -> 195;
                        case 22 -> 47;
                        case 23 -> 99;
                        case 24 -> 184;
                        case 25 -> 87;
                        case 26 -> 120;
                        case 27 -> 207;
                        case 28 -> 136;
                        case 29 -> 148;
                        case 30 -> 117;
                        case 31 -> 199;
                        case 32 -> 112;
                        case 33 -> 205;
                        case 34 -> 25;
                        case 35 -> 78;
                        case 36 -> 133;
                        case 37 -> 67;
                        case 38 -> 100;
                        case 39 -> 137;
                        case 40 -> 245;
                        case 41 -> 201;
                        case 42 -> 192;
                        case 43 -> 255;
                        case 44 -> 143;
                        case 45 -> 228;
                        case 46 -> 61;
                        case 47 -> 4;
                        case 48 -> 38;
                        case 49 -> 127;
                        case 50 -> 115;
                        case 51 -> 41;
                        case 52 -> 214;
                        case 53 -> 118;
                        case 54 -> 35;
                        case 55 -> 20;
                        case 56 -> 225;
                        case 57 -> 97;
                        case 58 -> 213;
                        case 59 -> 151;
                        case 60 -> 21;
                        case 61 -> 76;
                        case 62 -> 169;
                        case 63 -> 202;
                        case 64 -> 0;
                        case 65 -> 74;
                        case 66 -> 31;
                        case 67 -> 183;
                        case 68 -> 139;
                        case 69 -> 39;
                        case 70 -> 140;
                        case 71 -> 253;
                        case 72 -> 238;
                        case 73 -> 104;
                        case 74 -> 44;
                        case 75 -> 146;
                        case 76 -> 93;
                        case 77 -> 177;
                        case 78 -> 125;
                        case 79 -> 226;
                        case 80 -> 236;
                        case 81 -> 79;
                        case 82 -> 29;
                        case 83 -> 208;
                        case 84 -> 123;
                        case 85 -> 64;
                        case 86 -> 159;
                        case 87 -> 221;
                        case 88 -> 46;
                        case 89 -> 163;
                        case 90 -> 200;
                        case 91 -> 232;
                        case 92 -> 239;
                        case 93 -> 131;
                        case 94 -> 66;
                        case 95 -> 188;
                        case 96 -> 218;
                        case 97 -> 147;
                        case 98 -> 8;
                        case 99 -> 101;
                        case 100 -> 215;
                        case 101 -> 122;
                        case 102 -> 119;
                        case 103 -> 124;
                        case 104 -> 54;
                        case 105 -> 142;
                        case 106 -> 167;
                        case 107 -> 166;
                        case 108 -> 116;
                        case 109 -> 191;
                        case 110 -> 83;
                        case 111 -> 56;
                        case 112 -> 80;
                        case 113 -> 110;
                        case 114 -> 231;
                        case 115 -> 241;
                        case 116 -> 45;
                        case 117 -> 107;
                        case 118 -> 2;
                        case 119 -> 150;
                        case 120 -> 72;
                        case 121 -> 52;
                        case 122 -> 230;
                        case 123 -> 14;
                        case 124 -> 88;
                        case 125 -> 37;
                        case 126 -> 193;
                        case 127 -> 11;
                        case 128 -> 158;
                        case 129 -> 189;
                        case 130 -> 26;
                        case 131 -> 198;
                        case 132 -> 187;
                        case 133 -> 182;
                        case 134 -> 211;
                        case 135 -> 248;
                        case 136 -> 55;
                        case 137 -> 40;
                        case 138 -> 51;
                        case 139 -> 233;
                        case 140 -> 227;
                        case 141 -> 190;
                        case 142 -> 102;
                        case 143 -> 153;
                        case 144 -> 7;
                        case 145 -> 149;
                        case 146 -> 30;
                        case 147 -> 181;
                        case 148 -> 49;
                        case 149 -> 36;
                        case 150 -> 105;
                        case 151 -> 48;
                        case 152 -> 164;
                        case 153 -> 89;
                        case 154 -> 246;
                        case 155 -> 5;
                        case 156 -> 220;
                        case 157 -> 3;
                        case 158 -> 135;
                        case 159 -> 224;
                        case 160 -> 170;
                        case 161 -> 62;
                        case 162 -> 173;
                        case 163 -> 179;
                        case 164 -> 165;
                        case 165 -> 27;
                        case 166 -> 73;
                        case 167 -> 77;
                        case 168 -> 244;
                        case 169 -> 176;
                        case 170 -> 43;
                        case 171 -> 161;
                        case 172 -> 75;
                        case 173 -> 196;
                        case 174 -> 81;
                        case 175 -> 172;
                        case 176 -> 70;
                        case 177 -> 16;
                        case 178 -> 63;
                        case 179 -> 6;
                        case 180 -> 34;
                        case 181 -> 113;
                        case 182 -> 234;
                        case 183 -> 186;
                        case 184 -> 132;
                        case 185 -> 57;
                        case 186 -> 50;
                        case 187 -> 109;
                        case 188 -> 91;
                        case 189 -> 114;
                        case 190 -> 108;
                        case 191 -> 178;
                        case 192 -> 206;
                        case 193 -> 155;
                        case 194 -> 10;
                        case 195 -> 94;
                        case 196 -> 13;
                        case 197 -> 152;
                        case 198 -> 128;
                        case 199 -> 249;
                        case 200 -> 145;
                        case 201 -> 254;
                        case 202 -> 209;
                        case 203 -> 141;
                        case 204 -> 175;
                        case 205 -> 98;
                        case 206 -> 68;
                        case 207 -> 24;
                        case 208 -> 160;
                        case 209 -> 144;
                        case 210 -> 250;
                        case 211 -> 156;
                        case 212 -> 58;
                        case 213 -> 60;
                        case 214 -> 130;
                        case 215 -> 229;
                        case 216 -> 42;
                        case 217 -> 22;
                        case 218 -> 92;
                        case 219 -> 129;
                        case 220 -> 168;
                        case 221 -> 84;
                        case 222 -> 28;
                        case 223 -> 65;
                        case 224 -> 251;
                        case 225 -> 1;
                        case 226 -> 242;
                        case 227 -> 71;
                        case 228 -> 203;
                        case 229 -> 59;
                        case 230 -> 194;
                        case 231 -> 210;
                        case 232 -> 216;
                        case 233 -> 243;
                        case 234 -> 171;
                        case 235 -> 162;
                        case 236 -> 23;
                        case 237 -> 111;
                        case 238 -> 217;
                        case 239 -> 121;
                        case 240 -> 85;
                        case 241 -> 9;
                        case 242 -> 33;
                        case 243 -> 19;
                        case 244 -> 174;
                        case 245 -> 138;
                        case 246 -> 17;
                        case 247 -> 69;
                        case 248 -> 219;
                        case 249 -> 95;
                        case 250 -> 15;
                        case 251 -> 185;
                        case 252 -> 237;
                        case 253 -> 204;
                        case 254 -> 247;
                        default -> 223;
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
         ));
      if (var1 == null) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[1]
         );
      }
   }

   public void M() {
      boolean var29 = false; // PX-FIX
      Object var28 = null; // PX-FIX
      Object var27 = null; // PX-FIX
      boolean var25 = false; // PX-FIX
      Object var24 = null; // PX-FIX
      Object var22 = null; // PX-FIX
      String var1;
      short var17;
      label217: {
         this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
         this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = 0;
         String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = null;
         this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = 0.0;
         var1 = var10000;
         this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = true;
         this.aM();
         IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI var15 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var1 != null) {
            if (IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .n()
               == null) {
               lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var16 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .f();
               short var10001 = 31049;
               short var10002 = 32200;
               var17 = ((short)((var16.c("Melee")) ? 1 : 0));
               if (var1 == null) {
                  break label217;
               }

               if ((var17 != 0)) {
                  var17 = 31008;
                  var10001 = 31029;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "You don't have a weapon selected! The macro will use its defaults."
                  );
                  var17 = 31045;
                  var10001 = -31532;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "To select a weapon, hold it and run /pn setmeleeweapon or /pn smw"
                  );
               }
            }

            var15 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         var17 = ((short)((var15.e().ae()) ? 1 : 0));
      }

      label209: {
         label220: {
            if (var1 != null) {
               if ((var17 == 0)) {
                  break label220;
               }

               lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var20 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .f();
               short var32 = 31049;
               short var37 = 32200;
               var17 = ((short)((var20.c("Melee")) ? 1 : 0));
            }

            if (var1 == null) {
               break label209;
            }

            if ((var17 != 0)) {
               var17 = 1;
               break label209;
            }
         }

         var17 = 0;
      }

      boolean var2;
      label198: {
         var2 = (var17 != 0);
         boolean var21 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .ae();
         if (var1 != null) {
            if (!var21) {
               break label198;
            }

            var21 = var2;
         }

         if (!var21) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var34;
            label191: {
               label190: {
                  String var3 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .f()
                     .y();
                  int var33 = var3.hashCode();
                  if (var1 != null) {
                     switch (var33) {
                        case -1544148306:
                           short var43 = 31063;
                           short var52 = 15478;
                           if (var3.equals("Flaming Flay")) {
                              var43 = 31063;
                              var52 = 15478;
                              var34 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a("Flaming Flay");
                              if (var1 != null && var34 == null) {
                                 var43 = 31007;
                                 var52 = 19184;
                                 var34 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a("Soul Whip");
                              }
                              break label191;
                           }
                           break label190;
                        case -49670596:
                           short var42 = 31043;
                           short var51 = 4956;
                           if (var3.equals("Hyperion")) {
                              me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var35 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              String[] var4 = new String[4];
                              short var10004 = 31053;
                              short var10005 = -17970;
                              var4[0] = "Hyperion";
                              var10004 = 31092;
                              var10005 = -22092;
                              var4[1] = "Astraea";
                              var10004 = 31011;
                              var10005 = -24457;
                              var4[2] = "Scylla";
                              var10004 = 31055;
                              var10005 = 20933;
                              var4[3] = "Valkyrie";
                              var34 = var35.a(CollectionsKt.listOf(var4));
                              break label191;
                           }
                           break label190;
                        case 1016061853:
                           short var40 = 30994;
                           short var49 = -9648;
                           if (var3.equals("Spirit Sceptre")) {
                              var40 = 31013;
                              var49 = -2533;
                              var34 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a("Spirit Sceptre");
                              break label191;
                           }
                           break label190;
                        case 1658661820:
                           short var38 = 31002;
                           short var10003 = -28712;
                           var33 = ((var3.equals("Fire Veil")) ? 1 : 0);
                           break;
                        default:
                           break label190;
                     }
                  }

                  if (var33 != 0) {
                     short var39 = 31067;
                     short var48 = -32318;
                     var34 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("Fire Veil Wand");
                     break label191;
                  }
               }

               var34 = null;
            }

            this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = var34;
         }
      }

      llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var13;
      var13 = this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
      var22 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e()
         .ae();
      label179:
      if (var1 != null) {
         if (((Boolean)(var22))) {
            var22 = var2;
            if (var1 == null) {
               break label179;
            }

            if (!var2 && this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl == null) {
               var22 = false;
               break label179;
            }
         }

         var22 = true;
      }

      boolean var14;
      label170: {
         var14 =((Boolean)( var22));
         if (this.X() == null) {
            label229: {
               label165:
               if (var13 != null) {
                  Object var23 = var13.e();
                  if (var1 != null) {
                     if (var23 == null) {
                        break label165;
                     }

                     var23 = (Iterable)var23;
                  }

                  label222: {
                     Object var7 = var23;
                     boolean var8 = false;
                     var24 = var7;
                     label157:
                     if (var1 != null) {
                        if (var7 instanceof Collection) {
                           var24 = (Collection)var7;
                           if (var1 == null) {
                              break label157;
                           }

                           if (((me.octo.client.PXDyn)var24).isEmpty()) {
                              var25 = true;
                              break label222;
                           }
                        }

                        var24 = var7;
                     }

                     Iterator var9 = ((me.octo.client.PXDyn)var24).iterator();

                     label148:
                     while (true) {
                        if (!var9.hasNext()) {
                           var25 = true;
                           break;
                        }

                        Object var10 = var9.next();
                        IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var11 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var10;
                        boolean var26 = false;

                        while (
                           var11.b()
                              == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                        ) {
                           var25 = false;
                           if (var1 != null) {
                              break label148;
                           }
                        }
                     }
                  }

                  var27 = var25;
                  break label229;
               }

               var27 = false;
            }

            if (!((Boolean)var27)) {
               var28 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .ae();
               if (var1 == null) {
                  break label170;
               }

               if (!((Boolean)var28)) {
                  var28 = false;
                  break label170;
               }
            }
         }

         var28 = true;
      }

      boolean var5;
      boolean var6;
      var5 =((Boolean)( var28));
      var6 = var13 != null;
      var29 = var14;
      label129:
      if (var1 != null) {
         if (var14) {
            var29 = var5;
            if (var1 == null) {
               break label129;
            }

            if (var5) {
               var29 = var6;
               if (var1 == null) {
                  break label129;
               }

               if (var6) {
                  super.M();
                  return;
               }
            }
         }

         var29 = var14;
      }

      if (var1 != null) {
         if (!var29) {
            String var36 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .f()
               .y();
            short var46 = 31030;
            short var55 = -17361;
            this.a(
               "Missing weapon: " + var36,
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         var29 = var5;
      }

      if (var1 != null) {
         if (!var29) {
            this.aP();
         }

         var29 = var6;
      }

      if (!var29) {
         short var47 = 31028;
         short var56 = 3876;
         var56 = 31019;
         short var61 = 10023;
         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               5000L,
               "Fishing Macro",
               "Failed to setup fishing area",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
      }

      this.N();
   }

   public void N() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var10000 = this;
      if (var1 != null) {
         if (this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.c()) {
            this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.q();
         }

         super.N();
         this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
         this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = 0;
         this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = null;
         var10000 = this;
      }

      var10000.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = 0.0;
   }

   public void aO() {
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      super.aO();
      short var10002 = 31064;
      short var10003 = 29047;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("use", false);
      String var1 = var10000;
      IlIlIllllllIlllIlIIlIlIllIlllIlllIlIIllIllIIlIllIIlIIIlIlIlIlIIIlIlIlllIIlIIIIllIIIlI var2 = this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
      if (var1 != null) {
         if (!this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.c()) {
            return;
         }

         var2 = this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
      }

      var2.q();
   }

   public void aM() {
      Object var5 = null; // PX-FIX
      Object var3 = null; // PX-FIX
      this.bQ();
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = 0;
      this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = 0;
      String var1 = var10000;
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = 0;
      this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = null;
      this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = System.currentTimeMillis();
      this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = null;
      this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = null;
      this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = false;
      super.aM();
      if (var1 != null && this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null) {
         llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var2;
         var2 = this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
         var3 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
            .ae();
         label48:
         if (var1 != null) {
            if (!((Boolean)var3)) {
               LocalPlayer var4 = this.ap().player;
               Intrinsics.checkNotNull(var4);
               double var7;
               var3 = (var7 = var4.distanceToSqr(var2.d()) - 24.0) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
               if (var1 == null) {
                  break label48;
               }

               if ((((((Boolean)(Object)((Boolean)var3 ? 1 : 0)))) ? 1 : 0)  > 0
                  && IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .g()
                     != var2.c()) {
                  this.a(var2.c(), 3000);
                  if (var1 != null) {
                     return;
                  }
               }
            }

            this.bR();
            var3 = this.ac().isEmpty();
         }

         if (var1 != null) {
            var3 =((Boolean)(Object)( (Boolean)var3 ? 1 : 0));
         }

         label36: {
            if (!((Boolean)var3)) {
               var5 = this;
               if (var1 == null) {
                  break label36;
               }

               LocalPlayer var6 = this.ap().player;
               Intrinsics.checkNotNull(var6);
               if (var6.distanceToSqr(var2.d()) > 16.0) {
                  this.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                  );
                  this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
                  if (var1 != null) {
                     return;
                  }
               }
            }

            var5 = this;
         }

         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         );
      }
   }

   public void aB() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var10000 = this;
      if (var1 != null) {
         super.aB();
         if (!IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
            .ae()) {
            return;
         }

         var10000 = this;
      }

      if (var1 != null) {
         if (var10000.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI == null) {
            return;
         }

         this.bR();
         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         );
         var10000 = this;
      }

      var10000.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
   }

   public boolean af() {
      return IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   protected void bm() {
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var3;
      label28: {
         String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         super.bm();
         String var1 = var10000;
         boolean var2 = this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
         if (var1 != null) {
            if (this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII) {
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e()
                  .k();
            }

            this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = false;
            var3 = this;
            if (var1 == null) {
               break label28;
            }

            var2 = this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.c();
         }

         if (var2) {
            this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.q();
         }

         short var10001 = 31064;
         short var10002 = 29047;
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("use", false);
         this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = null;
         this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = null;
         this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = null;
         this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII = null;
         this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = false;
         this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI = null;
         this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl = false;
         this.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl = false;
         this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = 0L;
         this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.f();
         this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII.f();
         this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII.f();
         this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.f();
         this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI.f();
         this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl.f();
         this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl.f();
         this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI.f();
         this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll.f();
         this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII.f();
         this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl.f();
         this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.f();
         this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = false;
         this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = null;
         var3 = this;
      }

      var3.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = null;
      if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.b("UpkN1");
      }
   }

   public void aC() {
      Object var8 = null; // PX-FIX
      Object var7 = null; // PX-FIX
      Object llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII = null; // PX-FIX
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      int var10000 = ((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0);
      if (var1 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = ((this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl) ? 1 : 0);
      }

      if (var1 != null) {
         label130:
         if (var10000 != 0) {
            lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var3 = this;
            if (var1 != null) {
               if (((java.util.function.Supplier<Boolean>)(() -> { this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.a(2500); return false; })).get()) {
                  this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = false;
                  this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = null;
                  if (var1 != null) {
                     break label130;
                  }
               }

               var3 = this;
            }

            label137:
            if (var1 != null) {
               if (var3.W()
                  != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  )
                {
                  var3 = this;
                  if (var1 == null) {
                     break label137;
                  }

                  if (this.W()
                     != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                     )
                   {
                     break label130;
                  }
               }

               var3 = this;
            }

            String var10001 = this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
            Intrinsics.checkNotNull(this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI);
            Entity var2 = var3.i(var10001);
            if (var2 != null) {
               lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var4 = this;
               if (var1 != null) {
                  if (this.bj() != null) {
                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .j();
                  }

                  this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = var2;
                  this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
                  this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII.f();
                  this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl.f();
                  this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.f();
                  var4 = this;
               }

               var4.a(
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
               );
               return;
            }
         }

         var10000 = ((IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .ae()) ? 1 : 0);
      }

      label122:
      if (var1 != null) {
         label120: {
            if (var10000 != 0) {
               lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var5 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .f();
               short var10 = 31004;
               short var10002 = 20656;
               var10000 = ((var5.c("Melee")) ? 1 : 0);
               if (var1 == null) {
                  break label122;
               }

               if (var10000 == 0) {
                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var6 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .f();
                  var10 = 31026;
                  var10002 = 19183;
                  var10000 = ((var6.c("Flaming Flay")) ? 1 : 0);
                  if (var1 == null) {
                     break label122;
                  }

                  if (var10000 == 0) {
                     var7 = this;
                     if (var1 == null) {
                        break label120;
                     }

                     if (this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI != null) {
                        var7 = this;
                        if (var1 == null) {
                           break label120;
                        }

                        if (this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII == null) {
                           String var13 = this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
                           Intrinsics.checkNotNull(this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI);
                           this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = this.i(var13);
                           var7 = this;
                           if (var1 == null) {
                              break label120;
                           }

                           if (this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII != null) {
                              this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII.f();
                              this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.f();
                              this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = false;
                              this.a(
                                 IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                              );
                              return;
                           }
                        }
                     }
                  }
               }
            }

            var7 = this;
         }

         this.bt();
         long var14;
         var10000 = (var14 = System.currentTimeMillis() - this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI - 2000L)
               == 0L
            ? 0
            : (var14 < 0L ? -1 : 1);
      }

      label100: {
         if (var1 != null) {
            if (var10000 > 0) {
               this.bx();
               this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = System.currentTimeMillis();
            }

            var8 = this;
            if (var1 == null) {
               break label100;
            }

            var10000 = ((int[])lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.W()
               .ordinal()];
         }

         switch (var10000) {
            case 1:
               this.bu();
               if (var1 != null) {
                  return;
               }
            case 2:
               this.bv();
               if (var1 != null) {
                  return;
               }
            case 3:
               this.by();
               if (var1 != null) {
                  return;
               }
            case 4:
               this.bD();
               if (var1 != null) {
                  return;
               }
            case 5:
               this.bF();
               if (var1 != null) {
                  return;
               }
            case 6:
               this.bG();
               if (var1 != null) {
                  return;
               }
            case 7:
               this.bH();
               if (var1 != null) {
                  return;
               }
            case 8:
               this.bI();
               if (var1 != null) {
                  return;
               }
            case 9:
               this.bJ();
               if (var1 != null) {
                  return;
               }
            case 10:
               this.bM();
               if (var1 != null) {
                  return;
               }
            case 11:
               lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var9 = this;
               if (var1 != null) {
                  if (!this.bB()) {
                     return;
                  }

                  var9 = this;
               }

               var9.aC();
               if (var1 != null) {
                  return;
               }
            case 12:
               super.aC();
               if (var1 != null) {
                  return;
               }
            case 13:
               this.bs();
               if (var1 != null) {
                  return;
               }
            default:
               var8 = this;
         }
      }

      this.aC();
   }

   private final void bs() {
      Object var9 = null; // PX-FIX
      Object var10 = null; // PX-FIX
      Object var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var2 = this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
      String var1 = (String)var10000;
      if (var1 != null) {
         if (var2 != null) {
            int var5 = this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
            if (var1 != null) {
               if (this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl == 0) {
                  this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(800, 2300);
               }

               var5 = ((java.util.function.Supplier<Integer>)(() -> { this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll
                  .a(this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl); return 0; })).get();
            }

            if (var5 == 0) {
               return;
            }

            label70: {
               label81: {
                  label82: {
                     short var6 = 31012;
                     short var12 = 14885;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Escaping server...");
                     me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .g();
                     var10000 = var3;
                     me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var13 = var2.b();
                     if (var1 != null) {
                        if (var3 == var13) {
                           label85: {
                              boolean var8 = (Boolean)this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl.getFirst();
                              if (var1 != null) {
                                 if (var8) {
                                    return;
                                 }

                                 var9 = this;
                                 if (var1 == null) {
                                    break label85;
                                 }

                                 var8 = (Boolean)this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl.getSecond();
                              }

                              if (var8) {
                                 this.a(
                                    IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                                 );
                                 this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = new Pair(false, false);
                                 this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = 0;
                              }

                              this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = new Pair(true, false);
                              var9 = this;
                           }

                           this.a(
                              me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                              2000
                           );
                           if (var1 != null) {
                              return;
                           }
                        }

                        var10000 = var3;
                        if (var1 == null) {
                           break label82;
                        }

                        var13 = me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                     }

                     if (var10000 != var13) {
                        break label70;
                     }

                     var10 = this;
                     if (var1 == null) {
                        break label81;
                     }

                     var10000 = this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl.getSecond();
                  }

                  if ((Boolean)var10000) {
                     return;
                  }

                  this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = new Pair(false, true);
                  var10 = this;
               }

               this.a(var2.b(), 2000);
               if (var1 != null) {
                  return;
               }
            }

            short var11 = 31000;
            short var14 = -31166;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h(
               "An unrecoverable error has occurred within the fishing macro, please report this. How did this even happen? [0x02]"
            );
            this.N();
            return;
         }

         short var4 = 31029;
         short var10001 = 981;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h(
            "An unrecoverable error has occurred within the fishing macro, please report this. [0x01]"
         );
         this.N();
      }
   }

   private final void bt() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var10000 = this;
      if (var1 != null) {
         if (this.ba().b().isEmpty()) {
            return;
         }

         var10000 = this;
      }

      if (var1 != null) {
         if (var10000.bb() != null) {
            Iterable var2 = this.ba().b();
            boolean var3 = false;
            var var5 = new ArrayList();
            boolean var6 = false;
            Iterator var7 = var2.iterator();

            while (true) {
               if (var7.hasNext()) {
                  Object var8 = var7.next();
                  lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var9 = (lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII)var8;
                  boolean var10 = false;
                  int var20 = var9.b();
                  if (var1 == null) {
                     break;
                  }

                  label125: {
                     label142: {
                        if (var1 != null) {
                           lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var10001 = this.bb();
                           Intrinsics.checkNotNull(var10001);
                           if (var20 == var10001.b()) {
                              break label142;
                           }

                           var20 = ((this.bc().contains(var9.b())) ? 1 : 0);
                        }

                        if (var1 != null) {
                           if (var20 != 0) {
                              break label142;
                           }

                           var20 = ((var9.d()) ? 1 : 0);
                        }

                        if (var1 == null) {
                           break label125;
                        }

                        if (var20 != 0) {
                           var20 = 1;
                           break label125;
                        }
                     }

                     var20 = 0;
                  }

                  if (var20 == 0) {
                     continue;
                  }

                  var5.add(var8);
                  if (var1 != null) {
                     continue;
                  }
               }

               var2 = var5;
               boolean var21 = false;
               break;
            }

            for (Object var14 : var2) {
               lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var16 = (lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII)var14;
               boolean var18 = false;
               if (var1 != null) {
                  IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var22 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  LocalPlayer var28 = this.ap().player;
                  Intrinsics.checkNotNull(var28);
                  Vec3 var29 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var28);
                  lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var10002 = this.bb();
                  Intrinsics.checkNotNull(var10002);
                  double var23 = var22.a(var29, var10002.a());
                  IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var30 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  LocalPlayer var33 = this.ap().player;
                  Intrinsics.checkNotNull(var33);
                  double var34;
                  int var24 = (
                           var34 = var23
                              - var30.a(
                                 me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var33),
                                 var16.a()
                              )
                        )
                        == 0.0
                     ? 0
                     : (var34 < 0.0 ? -1 : 1);
                  label97:
                  if (var1 != null) {
                     if (var24 > 0) {
                        this.a(var16);
                        if (var1 != null) {
                           break label97;
                        }
                     }

                     this.bc().add(var16.b());
                  }

                  if (var1 != null) {
                     continue;
                  }
               }
               break;
            }

            if (var1 != null) {
               return;
            }
         }

         var10000 = this;
      }

      Iterable var11 = var10000.ba().b();
      boolean var12 = false;

      for (Object var15 : var11) {
         lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var17 = (lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII)var15;
         boolean var19 = false;
         if (var1 == null) {
            break;
         }

         if (var1 != null) {
            IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var25 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            LocalPlayer var31 = this.ap().player;
            Intrinsics.checkNotNull(var31);
            label76:
            if (var25.a(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var31), var17.a())
               < 20.0) {
               boolean var26 = var17.d();
               if (var1 != null) {
                  if (!var26) {
                     break label76;
                  }

                  llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll var27 = llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  AABB var32 = var17.e();
                  Intrinsics.checkNotNull(var32);
                  var26 = ((me.octo.client.PXDyn)(Object)(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                        var27, var32, null, null, 0.0, 0.0, 0.0)
                     )).isEmpty();
               }

               if (var1 != null) {
                  var26 = !var26;
               }

               if (var26) {
                  this.a(var17);
               }
            }
         }

         if (var1 == null) {
            break;
         }
      }
   }

   private final void bu() {
      String var1;
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var2;
      label53: {
         var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         boolean var10000 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .al();
         if (var1 != null) {
            if (var10000) {
               this.bx();
               this.a(
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               );
               return;
            }

            var2 = this;
            if (var1 == null) {
               break label53;
            }

            var10000 = this.aK();
         }

         if (!var10000) {
            return;
         }

         var2 = this;
      }

      if (var2.aJ().a()
         == (
            var1 != null && this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null
               ? this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI.c()
               : null
         )) {
         this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = 0;
         this.bR();
         boolean var3 = this.ac().isEmpty();
         if (var1 != null) {
            var3 = !var3;
         }

         if (var3) {
            this.a(
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
            );
            this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
            if (var1 != null) {
               return;
            }
         }

         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         );
      }
   }

   private final void bv() {
      Object llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII = null; // PX-FIX
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10000 = ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)(this));
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var10000x = null; // PX-FIX var-split (ctx B)
      if (var1 != null) {
         if (this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll >= this.ac().size()) {
            this.bw();
            return;
         }

         var10000 = this.ac()
            .get(this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll);
         short var10002 = 31054;
         short var10003 = -3523;
         Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      }

      label69: {
         IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)var10000;
         int var7 = ((int[])lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[var2.b()
            .ordinal()];
         if (var1 != null) {
            switch (var7) {
               case 1:
                  var10000x = this;
                  if (var1 == null) {
                     break label69;
                  }

                  if (this.X() == null) {
                     this.aP();
                     var10000x = this;
                     break label69;
                  }

                  llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl var9 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .f();
                  BlockPos var10001 = new BlockPos(var2.a());
                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12 = this.X();
                  Intrinsics.checkNotNull(var12);
                  int var10 = ((var9.a(var10001, var12.b())) ? 1 : 0);
                  if (var1 != null) {
                     if (var10 == 0) {
                        return;
                     }

                     var10 = this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
                  }

                  int var3 = var10;
                  this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = var3 + 1;
                  if (var1 != null) {
                     return;
                  }
               case 2:
                  int var11 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e()
                     .d()) ? 1 : 0);
                  if (var1 != null) {
                     if (var11 != 0) {
                        IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                           ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e())),
                           ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(new BlockPos(var2.a()))),
                           0,
                           false);
                     }

                     double var13;
                     var11 = (
                              var13 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .b(var2.a(), false)
                                 - 2.0
                           )
                           == 0.0
                        ? 0
                        : (var13 < 0.0 ? -1 : 1);
                  }

                  if (var1 != null) {
                     if (var11 >= 0) {
                        return;
                     }

                     var11 = this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
                  }

                  int var4 = var11;
                  this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = var4 + 1;
                  if (var1 != null) {
                     return;
                  }
               case 3:
                  this.bw();
                  if (var1 != null) {
                     return;
                  }
               default:
                  var7 = this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
            }
         }

         int var5 = var7;
         this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = var5 + 1;
         return;
      }

      int var6 = var10000x.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = var6 + 1;
   }

   private final void bw() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (var1 != null && this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null) {
         llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var2 = this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
         Pair var3 = var2.g();
         float var4 = ((Number)var3.component1()).floatValue();
         float var5 = ((Number)var3.component2()).floatValue();
         lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var6 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
            var4, var5
         );
         double var7 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(var6);
         double var9;
         int var10000 = (var9 = var7 - 1.0) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
         if (var1 != null) {
            if (var10000 < 0) {
               this.a(var4, var5);
               short var10001 = 31059;
               short var10002 = 23505;
               this.a(
                  "Rotation complete, starting to fish",
                  me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               );
               this.a(
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               );
               if (var1 != null) {
                  return;
               }
            }

            if (var1 == null) {
               return;
            }

            var10000 = ((IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .i()) ? 1 : 0);
         }

         if (var10000 == 0) {
            IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(var4, var5);
         }
      }
   }

   private final void bx() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var10000 = this;
      if (var1 != null) {
         if (this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI) {
            return;
         }

         var10000 = this;
      }

      if (var10000.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null) {
         llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var2 = var10000.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
         if (var1 != null) {
            LocalPlayer var7 = this.ap().player;
            if (var7 != null) {
               Vec3 var8 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var7);
               if (var8 != null) {
                  label63: {
                     Vec3 var3 = var8;
                     double var4 = var3.distanceTo(var2.d());
                     double var13;
                     int var9 = (var13 = var4 - 4.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
                     if (var1 != null) {
                        if (var9 > 0) {
                           break label63;
                        }

                        double var14;
                        var9 = (
                                 var14 = Math.abs(
                                       lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .a(this.a(var3))
                                             .getY()
                                          - lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                             .f(var2.d())
                                             .getCenter()
                                             .y
                                    )
                                    - 1.0
                              )
                              == 0.0
                           ? 0
                           : (var14 < 0.0 ? -1 : 1);
                     }

                     if (var9 <= 0) {
                        return;
                     }
                  }

                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10 = this.W();
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10001 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  if (var1 != null) {
                     if (var10
                        == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        )
                      {
                        return;
                     }

                     var10 = this.W();
                     var10001 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                  }

                  if (var1 != null) {
                     if (var10 == var10001) {
                        return;
                     }

                     var10 = this.W();
                     var10001 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
                  }

                  label76: {
                     if (var1 != null) {
                        if (var10 == var10001) {
                           return;
                        }

                        var10000 = this;
                        if (var1 == null) {
                           break label76;
                        }

                        var10 = this.W();
                        var10001 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                     }

                     if (var10 == var10001) {
                        return;
                     }

                     short var12 = 31023;
                     short var10002 = 32749;
                     this.a(
                        "Too far from fishing spot, repositioning...",
                        me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     );
                     this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = this.W();
                     this.a(
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll
                     );
                     var10000 = this;
                  }

                  var10000.by();
                  return;
               }
            }
         }
      }
   }

   private final void by() {
      Object var10 = null; // PX-FIX
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (var1 != null && this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null) {
         llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var2 = this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
         BlockPos var3 = lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .f(var2.d());
         if (var1 != null) {
            LocalPlayer var10000 = this.ap().player;
            if (var10000 != null) {
               Vec3 var9 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10000);
               if (var9 != null) {
                  Vec3 var4;
                  var4 = var9;
                  double var5 = var4.distanceTo(var2.d());
                  double var12;
                  var10 = (var12 = var5 - 2.0) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
                  label72:
                  if (var1 != null) {
                     if (((Boolean)var10)) {
                        double var13;
                        var10 = (
                                 var13 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .a(this.a(var4))
                                       .getY()
                                    - var2.d().y
                                    - 1.0
                              )
                              == 0.0
                           ? 0
                           : (var13 < 0.0 ? -1 : 1);
                        if (var1 == null) {
                           break label72;
                        }

                        if (((Boolean)var10)) {
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .t();
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e()
                              .k();
                           lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var11 = this;
                           if (var1 != null) {
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10001 = this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
                              if (this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll == null) {
                                 var10001 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                              }

                              this.a(var10001);
                              var11 = this;
                           }

                           var11.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = null;
                           return;
                        }
                     }

                     var10 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e()
                        .d();
                  }

                  if (var1 != null) {
                     if (((Boolean)(var10))) {
                        return;
                     }

                     var10 = this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll;
                  }

                  label63: {
                     int var7 =((Integer)( var10));
                     this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = var7 + 1;
                     Integer var8 = this.a(var2, var4);
                     if (var1 != null) {
                        if (var8 == null) {
                           break label63;
                        }

                        this.bR();
                        this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = var8;
                        this.a(
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                        );
                        this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = 0;
                     }

                     if (var1 != null) {
                        return;
                     }
                  }

                  if (var1 != null) {
                     if (this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll > 3) {
                        if (var1 == null) {
                           return;
                        }

                        if (!this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI) {
                           this.bC();
                           if (var1 != null) {
                              return;
                           }
                        }
                     }

                     IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                        ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e())),
                        ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var3)),
                        0,
                        true);
                  }

                  return;
               }
            }
         }
      }
   }

   private final boolean bz() {
      return !IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .al()
         && this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null;
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.f(var1.d());
   }

   private final void f(String var1) {
      String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (var2 != null && this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null) {
         llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var3 = this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
         if (var2 != null) {
            if (IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .al()) {
               return;
            }

            this.ae()
               .a(
                  new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     var3.c(),
                     (kotlin.jvm.functions.Function1)(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII::n),
                     var1,
                     0,
                     0,
                     0L,
                     0,
                     (kotlin.jvm.functions.Function1)(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII::o),
                     120,
                     null
                  )
               );
         }
      }
   }

   private final void bA() {
      this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = true;
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = 0;
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
      String var1 = var10000;
      this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = null;
      this.bm();
      if (var1 != null) {
         if (!IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d()) {
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .e()
               .k();
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .t();
      }
   }

   private final Integer a(llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var1, Vec3 var2) {
      String var3 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (this.X() == null) {
         return null;
      } else {
         double var4 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var2, var1.d())
            + 10;
         Integer var6 = null;
         double var18 = 0.0;
         var18 = var4;
         Iterable var7 = var1.e();
         boolean var8 = false;
         int var9 = 0;

         for (Object var11 : var7) {
            int var12 = var9++;
            if (var3 != null) {
               int var21 = var12;
               if (var3 != null) {
                  if (var12 < 0) {
                     CollectionsKt.throwIndexOverflow();
                  }

                  var21 = var12;
               }

               IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var13 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var11;
               int var14 = var21;
               boolean var15 = false;
               if (var3 != null
                  && var13.b()
                     == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  )
                {
                  double var16 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var13.c(), var1.d());
                  if (var3 != null && var16 < var18) {
                     me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.PXEvMid var22 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.a(
                        me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        var13.a(),
                        null);
                     if ((var22 != null ? var22.d() : null) != null) {
                        var6 = var14;
                        var18 = var16;
                     }
                  }
               }

               if (var3 != null) {
                  continue;
               }
            }
            break;
         }

         return var6;
      }
   }

   private final boolean bB() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (var1 != null && this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null) {
         llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var2 = this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
         if (var1 != null) {
            LocalPlayer var10000 = this.ap().player;
            if (var10000 != null) {
               Vec3 var12 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10000);
               if (var12 != null) {
                  Vec3 var3 = var12;
                  double var4 = var3.distanceTo(var2.d());
                  double var16;
                  int var13 = (var16 = var4 - 2.0) == 0.0 ? 0 : (var16 < 0.0 ? -1 : 1);
                  if (var1 != null) {
                     if (var13 <= 0) {
                        Pair var6 = var2.g();
                        float var7 = ((Number)var6.component1()).floatValue();
                        float var8 = ((Number)var6.component2()).floatValue();
                        lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var9 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
                           var7, var8
                        );
                        double var10 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .d(var9);
                        double var17;
                        int var14 = (var17 = var10 - 10.0) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
                        if (var1 != null) {
                           if (var14 > 0) {
                              boolean var15 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .i();
                              if (var1 != null) {
                                 if (var15) {
                                    return false;
                                 }

                                 IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(var7, var8);
                                 var15 = false;
                              }

                              return var15;
                           }

                           var14 = 1;
                        }

                        return (var14 != 0);
                     }

                     this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                     this.a(
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll
                     );
                     this.by();
                     var13 = 0;
                  }

                  return (var13 != 0);
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private final void bC() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (var1 != null) {
         if (IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .al()) {
            short var2 = 31102;
            short var3 = 18844;
            this.a(
               "Pathfinding failed, disabling macro...",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
            this.N();
            return;
         }

         short var10001 = 31050;
         short var10002 = 14471;
         this.f("Pathfinding failed");
      }
   }

   protected void be() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var10000 = this;
      if (var1 != null) {
         label43:
         if (this.a9()) {
            int var7 = ((IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .h()
               .ae()) ? 1 : 0);
            if (var1 != null) {
               if (var7 == 0) {
                  break label43;
               }

               lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var8 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .f();
               short var10001 = 31027;
               short var10002 = -23631;
               var7 = ((var8.c("Fire Veil")) ? 1 : 0);
            }

            label57: {
               if (var1 != null) {
                  if (var7 != 0) {
                     break label43;
                  }

                  var10000 = this;
                  if (var1 == null) {
                     break label57;
                  }

                  LocalPlayer var10 = this.ap().player;
                  Intrinsics.checkNotNull(var10);
                  float var13;
                  var7 = (var13 = var10.getXRot() - 85.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
               }

               if (var7 > 0) {
                  boolean var11 = this.a_();
                  if (var1 != null) {
                     if (!var11) {
                        this.bh();
                        this.f(true);
                     }

                     var11 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .i();
                  }

                  if (var11) {
                     return;
                  }

                  return;
               }

               var10000 = this;
            }

            if (var10000.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null) {
               llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var2 = var10000.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
               boolean var3 = false;
               Pair var4 = var2.g();
               float var5 = ((Number)var4.component1()).floatValue();
               float var6 = ((Number)var4.component2()).floatValue();
               this.a(var5, var6);
            }

            this.e(false);
            this.f(false);
         }

         var10000 = this;
      }

      var10000.be();
   }

   protected void bf() {
      Object var8 = null; // PX-FIX
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var10000;
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      var10000 = this;
      label69:
      if (var1 != null) {
         if (this.bl()) {
            var10000 = this;
            if (var1 == null) {
               break label69;
            }

            if (((java.util.function.Supplier<Boolean>)(() -> { this.a5().a(200); return false; })).get()) {
               Vec3 var3;
               label61: {
                  if (var1 != null) {
                     FishingHook var10001 = this.bj();
                     if (var10001 != null) {
                        var3 = llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var10001);
                        break label61;
                     }
                  }

                  var3 = null;
               }

               label72: {
                  this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII = var3;
                  me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .j();
                  this.a7().f();
                  this.a5().f();
                  this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.f();
                  int var2 = this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII++;
                  boolean var4 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .e()
                     .ae();
                  if (var1 != null) {
                     if (!var4) {
                        var8 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                        break label72;
                     }

                     lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var5 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .f();
                     short var10002 = 31049;
                     short var10003 = 32200;
                     var4 = var5.c("Melee");
                  }

                  if (var1 != null) {
                     if (var4) {
                        var8 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                        break label72;
                     }

                     lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var6 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .f();
                     short var9 = 31063;
                     short var11 = 15478;
                     var4 = var6.c("Flaming Flay");
                  }

                  if (var1 != null) {
                     if (var4) {
                        this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII.f();
                        var8 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                        break label72;
                     }

                     lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var7 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .f();
                     short var10 = 31002;
                     short var12 = -28712;
                     var4 = var7.c("Fire Veil");
                  }

                  if (var1 != null) {
                     if (var4) {
                        var8 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                        break label72;
                     }

                     var4 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .i()
                        .ae();
                  }

                  var8 = var4
                     ? IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                     : IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
               }

               this.a(var8);
               this.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl = false;
               return;
            }
         }

         var10000 = this;
      }

      var10000.bf();
   }

   private final void bD() {
      Object var31 = null; // PX-FIX
      Object var29 = null; // PX-FIX
      boolean var28 = false; // PX-FIX
      Object var26 = null; // PX-FIX
      boolean var24 = false; // PX-FIX
      Object var23 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      Object var19 = null; // PX-FIX
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var10000 = this;
      if (var1 != null) {
         if (this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI != null) {
            String var2 = this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
            var10000 = this;
            if (var1 != null) {
               if (!this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.c()) {
                  this.g(var2);
                  return;
               }

               var10000 = this;
            }

            label281: {
               Object var17 = var10000.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
               if (var1 != null) {
                  if (var10000.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll == null) {
                     var19 = null;
                     break label281;
                  }

                  var17 = var10000.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
               }

               int var6 = ((me.octo.client.PXDyn)var17).intValue();
               boolean var7 = false;
               if (var1 != null) {
                  ClientLevel var18 = this.ap().level;
                  if (var18 != null) {
                     var19 = var18.getEntity(var6);
                     break label281;
                  }
               }

               var19 = null;
            }

            Entity var3 =((Entity)( var19));
            int var20 = ((this.e(var3)) ? 1 : 0);
            if (var1 != null) {
               if (var20 == 0) {
                  if (var3 == null) {
                     return;
                  }

                  label283: {
                     var21 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .k()
                        .ae();
                     label256:
                     if (var1 != null) {
                        label254: {
                           if (!((Boolean)var21)) {
                              var21 = ((java.util.function.Supplier<Object>)(() -> { this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.a(3000); return null; })).get();
                              if (var1 == null) {
                                 break label256;
                              }

                              if (!((Boolean)var21)) {
                                 var10000 = this;
                                 if (var1 == null) {
                                    break label254;
                                 }

                                 LocalPlayer var11 = this.ap().player;
                                 if (var11 != null) {
                                    float var33;
                                    var21 = (
                                             var33 = var11.distanceTo(var3)
                                                - IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                   .l()
                                                   .M()
                                          )
                                          == 0.0F
                                       ? 0
                                       : (var33 < 0.0F ? -1 : 1);
                                    if (var1 == null) {
                                       break label256;
                                    }

                                    if (((Boolean)var21)) {
                                       this.bE();
                                       return;
                                    }
                                 }
                              }
                           }

                           var10000 = this;
                        }

                        if (var1 == null) {
                           break label283;
                        }

                        var21 = var10000.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.f();
                     }

                     if (!((Boolean)var21)) {
                        var10000 = this;
                        if (var1 == null) {
                           break label283;
                        }

                        if (!this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII) {
                           var23 = var3.onGround();
                           label232:
                           if (var1 != null) {
                              if (!((Boolean)var23)) {
                                 var23 = var3.isInWater();
                                 if (var1 == null) {
                                    break label232;
                                 }

                                 if (!((Boolean)var23)) {
                                    var23 = var3.isInLava();
                                    if (var1 == null) {
                                       break label232;
                                    }

                                    if (!((Boolean)var23)) {
                                       var23 = false;
                                       break label232;
                                    }
                                 }
                              }

                              var23 = true;
                           }

                           long var13;
                           label218: {
                              label287: {
                                 label288: {
                                    boolean var12 =((Boolean)( var23));
                                    long var5 = CollectionsKt.contains(
                                          this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI,
                                          this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI
                                       )
                                       ? 8000L
                                       : 3000L;
                                    var13 = CollectionsKt.contains(
                                          this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI,
                                          this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI
                                       )
                                       ? 1500L
                                          + IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .c(80, 300)
                                       : 70L
                                          + IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                             .c(10, 30);
                                    var24 = var12;
                                    if (var1 != null) {
                                       if (var12) {
                                          break label288;
                                       }

                                       var24 = ((java.util.function.Supplier<Boolean>)(() -> { this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI.a(var5); return false; })).get();
                                    }

                                    if (var1 == null) {
                                       break label218;
                                    }

                                    if (!var24) {
                                       break label287;
                                    }
                                 }

                                 label207: {
                                    LocalPlayer var9 = this.ap().player;
                                    label206:
                                    if (CollectionsKt.contains(
                                       this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI,
                                       this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI
                                    )) {
                                       LocalPlayer var25 = var9;
                                       if (var1 != null) {
                                          if (var9 == null) {
                                             break label206;
                                          }

                                          var25 = var9;
                                       }

                                       double var34;
                                       var26 = (var34 = var25.distanceTo(var3) - 3.0) == 0.0 ? 0 : (var34 < 0.0 ? -1 : 1);
                                       if (var1 != null) {
                                          if (((Boolean)var26)) {
                                             break label206;
                                          }

                                          var26 = this.d(var3);
                                       }

                                       if (var1 == null) {
                                          break label207;
                                       }

                                       if (((Boolean)(var26))) {
                                          var26 = 1;
                                          break label207;
                                       }
                                    }

                                    var26 = 0;
                                 }

                                 int var10 =((Integer)( var26));
                                 if (var1 != null) {
                                    if (var10 != 0) {
                                       boolean var32 = lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .i();
                                       if (var1 != null) {
                                          if (var32) {
                                             lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                .g();
                                          }

                                          this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = true;
                                          IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                                             ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                                .e())),
                                             lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                .a(
                                                   lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                      .f(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var3))
                                                ),
                                             null,
                                             true);
                                       }

                                       this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = null;
                                       this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll.f();
                                       return;
                                    }

                                    this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.d(false);
                                    this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.e(false);
                                    this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.f(false);
                                    this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = null;
                                    this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll.f();
                                 }

                                 if (var1 != null) {
                                    return;
                                 }
                              }

                              var24 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .g()
                                 .ae();
                           }

                           if (var1 != null) {
                              if (!var24) {
                                 return;
                              }

                              var24 = ((java.util.function.Supplier<Boolean>)(() -> { this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll
                                 .a(this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI); return false; })).get();
                           }

                           if (var1 != null) {
                              if (!var24) {
                                 return;
                              }

                              var24 = CollectionsKt.contains(
                                 this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI,
                                 this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI
                              );
                           }

                           label185: {
                              label290: {
                                 if (var1 != null) {
                                    if (var24) {
                                       label179: {
                                          LocalPlayer var27 = this.ap().player;
                                          Object var10001 = var27;
                                          if (var1 != null) {
                                             if (var27 == null) {
                                                var28 = false;
                                                break label179;
                                             }

                                             var10001 = var3;
                                          }

                                          var28 = var27.hasLineOfSight((Entity)var10001);
                                          if (var1 != null) {
                                             ;
                                          }
                                       }

                                       if (!var28) {
                                          return;
                                       }
                                    }

                                    var29 = lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                    if (var1 == null) {
                                       break label290;
                                    }

                                    var24 = lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .i();
                                 }

                                 if (!var24) {
                                    break label185;
                                 }

                                 var29 = lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              }

                              ((me.octo.client.PXDyn)var29).g();
                           }

                           this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = this.f(var3);
                           if (var1 == null) {
                              return;
                           }

                           if (this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI == null) {
                              return;
                           }

                           lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var15;
                           label293: {
                              Vec3 var14 = this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI;
                              var15 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var14);
                              boolean var30 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .i();
                              if (var1 != null) {
                                 if (var30) {
                                    return;
                                 }

                                 var31 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
                                 if (var1 == null) {
                                    break label293;
                                 }

                                 var30 = ((java.util.function.Supplier<Boolean>)(() -> { this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII.a(var13); return false; })).get();
                              }

                              if (!var30) {
                                 return;
                              }

                              var31 = this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
                           }

                           ((lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI)var31).f();
                           IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(var15.a(), var15.b());
                           return;
                        }
                     }

                     var10000 = this;
                  }

                  var10000.c(var3);
                  return;
               }

               this.bE();
               var20 = this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
            }

            int var4 = var20;
            this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = var4 + 1;
            return;
         }

         var10000 = this;
      }

      var10000.bE();
   }

   private final void g(String var1) {
      Object var10 = null; // PX-FIX
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      Entity var3 = this.i(var1);
      String var2 = var10000;
      if (var2 != null) {
         if (var3 == null) {
            lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var13 = this;
            if (var2 != null) {
               if (!((java.util.function.Supplier<Boolean>)(() -> { this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl.a(3000); return false; })).get()) {
                  return;
               }

               var13 = this;
            }

            var13.bE();
            return;
         }

         this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = var3.getId();
      }

      if (var2 != null && this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null) {
         llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII var5;
         label61: {
            var5 = this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
            boolean var6 = false;
            byte var9 = ((byte)((IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .o()
               .ae()) ? 1 : 0));
            if (var2 != null) {
               if (var9 == 0) {
                  var10 = CollectionsKt.emptyList();
                  break label61;
               }

               var9 = 2;
            }

            String[] var7 = new String[var9];
            short var10002 = 31069;
            short var10003 = 5266;
            var7[0] = "Squid";
            var10002 = 31036;
            var10003 = 18353;
            var7[1] = "Night Squid";
            var10 = CollectionsKt.listOf(var7);
         }

         List var8 =((List)( var10));
         this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI
            .a(
               var5.d(),
               IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .n(),
               var8
            );
      }

      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.a(var3.getId());
      boolean var11 = this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.o();
      if (var2 != null) {
         if (!var11) {
            short var10001 = 31006;
            short var15 = -29082;
            this.a(
               "No melee weapon found!",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
            this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.a((kotlin.jvm.functions.Function1)null);
            this.bE();
            return;
         }

         var11 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
            .ae();
      }

      boolean var4 = var11;
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.d(true);
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.e(var4);
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.f(var4);
      if (var2 != null) {
         label51:
         if (var4) {
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var12 = lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            if (var2 != null) {
               if (!lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .i()) {
                  break label51;
               }

               var12 = lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            var12.g();
         }

         this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = false;
         this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = Random.Default.nextLong(1000L, 1500L);
         this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = Random.Default.nextLong(300L, 600L);
         this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = null;
         this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = Random.Default.nextLong(100L, 200L);
         this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll.f();
         this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI.f();
         this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl.f();
         this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl.f();
         this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll.f();
      }
   }

   private final void c(Entity var1) {
      Object var9 = null; // PX-FIX
      Object var10 = null; // PX-FIX
      String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (var2 != null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            LocalPlayer var3;
            var3 = var10000;
            var9 = this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
            label80:
            if (var2 != null) {
               if (!this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII) {
                  var9 = ((java.util.function.Supplier<Object>)(() -> { this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll.a(3000); return null; })).get();
                  if (var2 == null) {
                     break label80;
                  }

                  if (!((Boolean)var9)) {
                     double var12;
                     var9 = (var12 = var3.distanceTo(var1) - 4.0) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
                     if (var2 == null) {
                        break label80;
                     }

                     if (((Boolean)var9)) {
                        this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = true;
                        this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.d(true);
                        IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                           ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e())),
                           lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(
                                 lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .f(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var1))
                              ),
                           null,
                           true);
                     }
                  }
               }

               var9 = this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
            }

            if (!((Boolean)var9)) {
               label67: {
                  label66: {
                     label88: {
                        float var4 = var3.distanceTo(var1);
                        boolean var5 = CollectionsKt.contains(
                           this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI,
                           this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI
                        );
                        double var6 = var5 ? 3.0 : 4.0;
                        double var13;
                        var10 = (var13 = var4 - var6) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
                        if (var2 != null) {
                           if (((Boolean)var10)) {
                              break label88;
                           }

                           var10 = var5;
                        }

                        if (var2 == null) {
                           break label67;
                        }

                        if (((Boolean)(var10))) {
                           break label66;
                        }

                        var10 = this.d(var1);
                        if (var2 == null) {
                           break label67;
                        }

                        if (!((Boolean)var10)) {
                           break label66;
                        }
                     }

                     var10 = 0;
                     break label67;
                  }

                  var10 = 1;
               }

               int var8 =((Integer)( var10));
               int var11 = var8;
               if (var2 != null) {
                  if (var8 != 0) {
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e()
                        .k();
                     this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = false;
                     this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.d(false);
                     this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.e(false);
                     this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.f(false);
                     this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll.f();
                     if (var2 != null) {
                        return;
                     }
                  }

                  var11 = ((IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e()
                     .d()) ? 1 : 0);
               }

               if (var2 != null && var11 != 0) {
                  IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                     ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e())),
                     lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(
                           lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .f(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var1))
                        ),
                     null,
                     true);
               }
            }

            return;
         }
      }
   }

   private final boolean d(Entity var1) {
      String var2;
      Object var17;
      var17 = var1.getBoundingBox();
      short var10002 = 31025;
      short var10003 = -12535;
      Intrinsics.checkNotNullExpressionValue(var17, "getBoundingBox(...)");
      AABB var3 = (AABB)var17;
      var17 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      double var4 = (var3.minX + var3.maxX) * 0.5;
      double var6 = (var3.minZ + var3.maxZ) * 0.5;
      Vec3[] var9 = new Vec3[]{
         new Vec3(var4, (var3.minY + var3.maxY) * 0.5, var6), new Vec3(var4, var3.maxY - 0.05, var6), new Vec3(var4, var3.minY + 0.05, var6)
      };
      List var8 = CollectionsKt.listOf(var9);
      var2 = (String)var17;
      var var15 = var8;
      boolean var10 = false;
      var17 = var15;
      label41:
      if (var2 != null) {
         if (var15 instanceof Collection) {
            var17 = (Collection)var15;
            if (var2 == null) {
               break label41;
            }

            if (((me.octo.client.PXDyn)var17).isEmpty()) {
               return false;
            }
         }

         var17 = var15;
      }

      for (Object var12 : (Iterable<?>)(var17)) {
         Vec3 var13 = (Vec3)var12;
         boolean var19 = false;

         while (
            ((me.octo.client.PXDyn)(Object)(llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a(
                     llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                     var13,
                     null,
                     null)
                  )).b()
               == me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         ) {
            if (var2 != null) {
               return true;
            }
         }
      }

      return false;
   }

   private final boolean e(Entity var1) {
      String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      Entity var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return (1 != 0);
         }

         var10000 = var1;
      }

      byte var3 = ((byte)((var10000.isAlive()) ? 1 : 0));
      if (var2 == null) {
         return (var3 != 0);
      } else if (var3 != 0) {
         int var5 = ((var1 instanceof LivingEntity) ? 1 : 0);
         if (var2 != null) {
            if (var5 == 0) {
               return (0 != 0);
            }

            float var4;
            var5 = (var4 = ((LivingEntity)var1).getHealth() - 1.1F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
         }

         if (var2 == null) {
            return (var5 != 0);
         } else {
            return (var5 < 0);
         }
      } else {
         return (1 != 0);
      }
   }

   private final void bE() {
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var2;
      label23: {
         String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         boolean var10000 = this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
         if (var1 != null) {
            if (this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII) {
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e()
                  .k();
            }

            var2 = this;
            if (var1 == null) {
               break label23;
            }

            var10000 = this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.c();
         }

         if (var10000) {
            this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.q();
         }

         this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = false;
         this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = null;
         this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = null;
         this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = null;
         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         );
         var2 = this;
      }

      var2.a5().f();
   }

   private final Vec3 f(Entity var1) {
      double var2 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(
            lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .f(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var1))
         )
         .getY();
      byte var4 = 5;
      double var5 = var1.getX() + var1.getDeltaMovement().x * var4 + Random.Default.nextDouble(-0.5, 0.5);
      double var7 = var1.getZ() + var1.getDeltaMovement().z * var4 + Random.Default.nextDouble(-0.5, 0.5);
      return new Vec3(var5, var2, var7);
   }

   private final void bF() {
      Object var43 = null; // PX-FIX
      Object var22 = null; // PX-FIX
      Object var18 = null; // PX-FIX
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      Entity var10000 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
      if (var1 != null) {
         if (this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII == null) {
            this.bL();
            return;
         }

         var10000 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
      }

      boolean var2 = var10000 instanceof LivingEntity;
      float var16;
      if (var2) {
         var10000 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
         short var10002 = 31103;
         short var10003 = 2727;
         Intrinsics.checkNotNull(
            this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII,
            "null cannot be cast to non-null type net.minecraft.world.entity.LivingEntity"
         );
         var16 = ((LivingEntity)var10000).getHealth();
      } else {
         var16 = 0.0F;
      }

      float var3 = var16;
      var10000 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
      Intrinsics.checkNotNull(this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII);
      var18 = var10000.isAlive();
      label228:
      if (var1 != null) {
         if (((Boolean)(var18))) {
            var18 = var2;
            if (var1 == null) {
               break label228;
            }

            if (var2) {
               float var71;
               int var19 = (var71 = var3 - 1.0F) == 0.0F ? 0 : (var71 < 0.0F ? -1 : 1);
               if (var1 != null) {
                  var19 = (((var19 == 0) ? 1 : 0));
               }

               if ((var19 == 0)) {
                  var18 = false;
                  break label228;
               }
            }
         }

         var18 = true;
      }

      boolean var4 =((Boolean)( var18));
      if (var4) {
         String var13 = this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
         if (var1 != null) {
            label129: {
               if (var13 != null) {
                  var43 = this;
                  if (var1 == null) {
                     break label129;
                  }

                  if (this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll.containsKey(var13)) {
                     var10000 = ((Entity)(Object)(this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll.get(var13)));
                     Intrinsics.checkNotNull(var10000);
                     String var14 = (String)(Object)var10000;
                     if (var1 != null) {
                        lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var45 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .f();
                        short var53 = 31002;
                        short var63 = -28712;
                        if (var45.c("Fire Veil")) {
                           this.bL();
                           return;
                        }

                        this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = var14;
                        this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = null;
                        this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI.f();
                        this.a(
                           IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                        );
                     }

                     return;
                  }
               }

               var43 = this;
            }

            this.bL();
         }
      } else {
         LocalPlayer var20 = this.ap().player;
         if (var20 != null) {
            label215: {
               label234: {
                  LocalPlayer var5 = var20;
                  var10000 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
                  Intrinsics.checkNotNull(this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII);
                  float var6 = var10000.distanceTo(var5);
                  var22 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .k()
                     .ae();
                  if (var1 != null) {
                     if (!((Boolean)var22)) {
                        float var72;
                        var22 = (
                                 var72 = var6
                                    - IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .l()
                                       .M()
                              )
                              == 0.0F
                           ? 0
                           : (var72 < 0.0F ? -1 : 1);
                        if (var1 == null) {
                           break label215;
                        }

                        if (((Boolean)var22)) {
                           lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var25 = this;
                           if (var1 != null) {
                              if (!((java.util.function.Supplier<Boolean>)(() -> { this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.a(3000); return false; })).get()) {
                                 return;
                              }

                              var25 = this;
                           }

                           var25.bL();
                           return;
                        }
                        break label234;
                     }

                     float var73;
                     var22 = (var73 = var6 - 10.0F) == 0.0F ? 0 : (var73 < 0.0F ? -1 : 1);
                  }

                  if (var1 == null) {
                     break label215;
                  }

                  if (((Boolean)var22)) {
                     lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var23 = this;
                     if (var1 != null) {
                        short var10001 = 31031;
                        short var54 = -13240;
                        if (!Intrinsics.areEqual(this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI, "Baby Magma Slug")
                           )
                         {
                           return;
                        }

                        var23 = this;
                     }

                     var23.bL();
                     return;
                  }
               }

               me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var24 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var46 = this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
               Intrinsics.checkNotNull(this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl);
               String var47 = var46.a().getHoverName().getString();
               short var64 = 31015;
               short var10004 = 23797;
               Intrinsics.checkNotNullExpressionValue(var47, "getString(...)");
               var22 = var24.c(var47);
            }

            if (var1 != null) {
               if (((Boolean)(var22))) {
                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var42 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var52 = this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
                  Intrinsics.checkNotNull(this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl);
                  var42.b(var52.b());
                  this.a6().f();
                  return;
               }

               var22 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h()
                  .ae();
            }

            label202:
            if (var1 != null) {
               if (!((Boolean)var22)) {
                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var26 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .f();
                  short var48 = 31002;
                  short var55 = -28712;
                  var22 = var26.c("Fire Veil");
                  if (var1 == null) {
                     break label202;
                  }

                  label198:
                  if (((Boolean)(var22))) {
                     LocalPlayer var27 = this.ap().player;
                     Intrinsics.checkNotNull(var27);
                     float var74;
                     var22 = (var74 = var27.getXRot() - 83.0F) == 0.0F ? 0 : (var74 < 0.0F ? -1 : 1);
                     label196:
                     if (var1 != null) {
                        if (((Boolean)var22)) {
                           var22 = this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
                           if (var1 == null) {
                              break label196;
                           }

                           if (!this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI) {
                              this.bK();
                              this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = true;
                              if (var1 != null) {
                                 break label198;
                              }
                           }
                        }

                        var22 = this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
                     }

                     if (var1 == null) {
                        break label202;
                     }

                     if (((Boolean)(var22))) {
                        this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = true;
                     }
                  }
               }

               var22 = ((java.util.function.Supplier<Object>)(() -> { this.a6().a(50); return null; })).get();
            }

            if (var1 != null) {
               if (((Boolean)(var22))) {
                  return;
               }

               var22 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h()
                  .ae();
            }

            label181:
            if (var1 != null) {
               if (!((Boolean)var22)) {
                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var28 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .f();
                  short var49 = 31002;
                  short var56 = -28712;
                  var22 = var28.c("Fire Veil");
                  if (var1 == null) {
                     break label181;
                  }

                  if (((Boolean)(var22))) {
                     var22 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .i();
                     if (var1 == null) {
                        break label181;
                     }

                     if (!((Boolean)var22)) {
                        return;
                     }
                  }
               }

               var22 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h()
                  .ae();
            }

            label171:
            if (var1 != null) {
               if (!((Boolean)var22)) {
                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var29 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .f();
                  short var50 = 31002;
                  short var57 = -28712;
                  var22 = var29.c("Fire Veil");
                  if (var1 == null) {
                     break label171;
                  }

                  if (((Boolean)(var22))) {
                     LocalPlayer var30 = this.ap().player;
                     Intrinsics.checkNotNull(var30);
                     float var75;
                     var22 = (var75 = var30.getXRot() - 80.0F) == 0.0F ? 0 : (var75 < 0.0F ? -1 : 1);
                     if (var1 == null) {
                        break label171;
                     }

                     if (((Boolean)var22)) {
                        LocalPlayer var31 = this.ap().player;
                        Intrinsics.checkNotNull(var31);
                        Vec3 var32 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var31)
                           .add(0.0, 1.72, 0.0);
                        var57 = 31089;
                        short var65 = -6503;
                        Intrinsics.checkNotNullExpressionValue(var32, "add(...)");
                        Vec3 var7 = var32;
                        LocalPlayer var33 = this.ap().player;
                        Intrinsics.checkNotNull(var33);
                        float var34 = var33.getXRot();
                        LocalPlayer var51 = this.ap().player;
                        Intrinsics.checkNotNull(var51);
                        Vec3 var35 = Vec3.directionFromRotation(var34, var51.getYRot());
                        var57 = 31074;
                        var65 = -6523;
                        Intrinsics.checkNotNullExpressionValue(var35, "directionFromRotation(...)");
                        Vec3 var8 = var35;
                        Vec3 var36 = var7.add(var8.scale(100.0));
                        var57 = 31089;
                        var65 = -6503;
                        Intrinsics.checkNotNullExpressionValue(var36, "add(...)");
                        Vec3 var9 = var36;
                        Block var70 = Block.OUTLINE;
                        Fluid var10005 = Fluid.ANY;
                        LocalPlayer var10006 = this.ap().player;
                        Intrinsics.checkNotNull(var10006);
                        ClipContext var10 = new ClipContext(var7, var9, var70, var10005, var10006);
                        ClientLevel var37 = this.ap().level;
                        Intrinsics.checkNotNull(var37);
                        BlockHitResult var38 = var37.clip(var10);
                        var57 = 31068;
                        var65 = 20897;
                        Intrinsics.checkNotNullExpressionValue(var38, "clip(...)");
                        BlockHitResult var11 = var38;
                        ClientLevel var39 = this.ap().level;
                        Intrinsics.checkNotNull(var39);
                        BlockState var40 = var39.getBlockState(var11.getBlockPos());
                        var57 = 31016;
                        var65 = -13305;
                        Intrinsics.checkNotNullExpressionValue(var40, "getBlockState(...)");
                        BlockState var12 = var40;
                        var22 = var12.getFluidState().isEmpty();
                        if (var1 == null) {
                           break label171;
                        }

                        if (((Boolean)(var22))) {
                           lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var41 = this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
                           if (var1 != null) {
                              if (!((java.util.function.Supplier<Boolean>)(() -> { this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.a(150); return false; })).get()) {
                                 return;
                              }

                              new Thread(() -> p(this)).start();
                              var41 = this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
                           }

                           var41.f();
                           return;
                        }
                     }
                  }
               }

               var22 = ((java.util.function.Supplier<Object>)(() -> { this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.a(100); return null; })).get();
            }

            if (var1 != null) {
               if (((Boolean)(var22))) {
                  return;
               }

               me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .j();
            }

            this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.f();
         }
      }
   }

   private final void h(String var1) {
      short var10001 = 31040;
      short var10002 = -26648;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("use", false);
      this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = null;
      this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = null;
      this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = var1;
      this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = true;
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.f();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
      );
      this.a5().f();
   }

   private final void bG() {
      Object var28 = null; // PX-FIX
      byte var23 = 0; // PX-FIX
      Object var15 = null; // PX-FIX
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var10000 = this;
      if (var1 != null) {
         if (this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl != null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var12 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var10001 = var2.a().getHoverName().getString();
            short var10003 = 31015;
            short var10004 = 23797;
            Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
            byte var13 = ((byte)((var12.c(var10001)) ? 1 : 0));
            if (var1 != null) {
               if (var13 == 0) {
                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .b(var2.b());
                  this.a6().f();
                  return;
               }

               var13 = ((java.util.function.Supplier<Byte>)(() -> { this.a6().a(100); return 0; })).get();
            }

            if (var1 != null) {
               if (var13 == 0) {
                  return;
               }

               var13 = (byte)(this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll
                  .a(
                     Long.valueOf((long)IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .j()
                        .M())
                  ) ? 1 : 0);
            }

            byte var3;
            label197: {
               label196: {
                  var3 = var13;
                  byte var14 = var3;
                  if (var1 != null) {
                     if (var3 == 0) {
                        break label196;
                     }

                     var14 = ((byte)((IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .i()
                        .ae()) ? 1 : 0));
                  }

                  if (var14 == 0) {
                     break label197;
                  }
               }

               short var29 = 31064;
               short var10002 = 29047;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("use", true);
            }

            label207: {
               var15 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
               label187:
               if (var1 != null) {
                  label185: {
                     if (this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII == null) {
                        var10000 = this;
                        if (var1 == null) {
                           break label185;
                        }

                        if (this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI != null) {
                           String var32 = this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
                           Intrinsics.checkNotNull(this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI);
                           this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = this.i(var32);
                           var15 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
                           if (var1 == null) {
                              break label187;
                           }

                           if (this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII != null) {
                              this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII.f();
                              this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl.f();
                           }
                        }
                     }

                     var10000 = this;
                  }

                  if (var1 == null) {
                     break label207;
                  }

                  var15 = var10000.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
               }

               if (var15 == null) {
                  var10000 = this;
                  if (var1 != null) {
                     if (this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI != null) {
                        return;
                     }

                     var10000 = this;
                  }

                  if (var1 != null) {
                     final var var10000f1 = var10000; // PX-FIX: lambda 捕获 final 副本
                     if (!((java.util.function.Supplier<Boolean>)(() -> { var10000f1.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII.a(500); return false; })).get()) {
                        return;
                     }

                     var10000 = this;
                  }

                  var10000.bL();
                  return;
               }

               var10000 = this;
            }

            if (var1 != null) {
               final var var10000f2 = var10000; // PX-FIX: lambda 捕获 final 副本
               if (((java.util.function.Supplier<Boolean>)(() -> { var10000f2.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl.a(10000); return false; })).get()) {
                  this.bL();
                  return;
               }

               var10000 = this;
            }

            LocalPlayer var18 = var10000.ap().player;
            if (var18 == null) {
               return;
            }

            LocalPlayer var4 = var18;
            byte var5 = ((byte)((this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII instanceof LivingEntity) ? 1 : 0));
            float var20;
            if (var5 != 0) {
               Entity var19 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
               short var33 = 31034;
               var10003 = -6976;
               Intrinsics.checkNotNull(
                  this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII,
                  "null cannot be cast to non-null type net.minecraft.world.entity.LivingEntity"
               );
               var20 = ((LivingEntity)var19).getHealth();
            } else {
               var20 = 0.0F;
            }

            label217: {
               float var6 = var20;
               var10000 = this;
               if (var1 != null) {
                  Entity var22 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
                  Intrinsics.checkNotNull(this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII);
                  label165:
                  if (var22.isAlive()) {
                     var23 = var5;
                     if (var1 != null) {
                        if (var5 == 0) {
                           break label165;
                        }

                        float var38;
                        var23 = (byte)((var38 = ((byte)((var6 - 1.1F != 0.0) ? 1 : 0))) == (byte)((0.0F != 0) ? 0 : (var38 < 0.0F ? -1 : 1)) ? 1 : 0);
                     }

                     if (var1 == null) {
                        break label217;
                     }

                     if (var23 >= 0) {
                        var23 = ((byte)((IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .k()
                           .ae()) ? 1 : 0));
                        break label217;
                     }
                  }

                  var10000 = this;
               }

               String var10;
               label150: {
                  var10 = var10000.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
                  if (var10 != null) {
                     var28 = this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll.containsKey(var10);
                     if (var1 == null) {
                        break label150;
                     }

                     if (!((Boolean)var28)) {
                        var10001 = this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll.get(var10);
                        Intrinsics.checkNotNull(var10001);
                        this.h(var10001);
                        return;
                     }
                  }

                  var28 = this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
               }

               int var11 =((Integer)( var28));
               this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = var11 + 1;
               if (var1 != null) {
                  if (var10 != null && Intrinsics.areEqual(var10, this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI)) {
                     this.h(var10);
                     return;
                  }

                  this.bL();
               }

               return;
            }

            label144:
            if (var1 != null) {
               if (var23 != 0) {
                  var23 = ((java.util.function.Supplier<Byte>)(() -> { this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.a(3000); return 0; })).get();
                  if (var1 == null) {
                     break label144;
                  }

                  if (var23 != 0) {
                     Entity var24 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
                     Intrinsics.checkNotNull(this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII);
                     float var39;
                     var23 = (byte)((var39 = var24.distanceTo(var4)
                                 - IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .l()
                                    .M()) == 0.0F
                        ? 0
                        : (var39 < 0.0F ? -1 : 1));
                     if (var1 == null) {
                        break label144;
                     }

                     if (var23 > 0) {
                        this.bL();
                        return;
                     }
                  }
               }

               short var30 = 31064;
               short var34 = 29047;
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("use", true);
               var23 = var3;
            }

            if (var1 != null) {
               if (var23 == 0) {
                  return;
               }

               var23 = ((byte)((IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .i()) ? 1 : 0));
            }

            label214: {
               if (var1 != null) {
                  if (var23 != 0) {
                     return;
                  }

                  var10000 = this;
                  if (var1 == null) {
                     break label214;
                  }

                  var23 = (byte)(this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII
                     .a(
                        Long.valueOf(70L
                           + IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .c(10, 40))
                     ) ? 1 : 0);
               }

               if (var23 == 0) {
                  return;
               }

               var10000 = this;
            }

            Entity var26 = var10000.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
            Intrinsics.checkNotNull(var10000.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII);
            AABB var27 = var26.getBoundingBox();
            short var35 = 31065;
            var10003 = 24510;
            Intrinsics.checkNotNullExpressionValue(var27, "getBoundingBox(...)");
            AABB var7 = var27;
            Vec3 var8 = new Vec3((var7.minX + var7.maxX) * 0.5, (var7.minY + var7.maxY) * 0.5, (var7.minZ + var7.maxZ) * 0.5);
            lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var9 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var8);
            IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(var9.a(), var9.b());
            this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII.f();
            return;
         }

         var10000 = this;
      }

      var10000.bL();
   }

   private final void bH() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var10000 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001 = this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
      Intrinsics.checkNotNull(this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl);
      String var6 = var10001.a().getHoverName().getString();
      short var10003 = 31015;
      short var10004 = 23797;
      Intrinsics.checkNotNullExpressionValue(var6, "getString(...)");
      int var2 = ((var10000.c(var6)) ? 1 : 0);
      if (var1 != null) {
         if (var2 == 0) {
            var10000 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var10001 = this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
            Intrinsics.checkNotNull(this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl);
            var10000.b(var10001.b());
            this.a6().f();
            return;
         }

         var2 = ((java.util.function.Supplier<Integer>)(() -> { this.a6().a(100); return 0; })).get();
      }

      if (var1 != null) {
         if (var2 == 0) {
            return;
         }

         var2 = ((IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h()
            .ae()) ? 1 : 0);
      }

      label76:
      if (var1 != null) {
         if (var2 != 0) {
            var2 = ((IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .i()) ? 1 : 0);
            if (var1 != null) {
               if (var2 != 0) {
                  return;
               }

               LocalPlayer var3 = this.ap().player;
               Intrinsics.checkNotNull(var3);
               float var8;
               var2 = (var8 = var3.getXRot() - 89.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
            }

            if (var1 == null) {
               break label76;
            }

            if (var2 < 0) {
               this.bK();
               return;
            }
         }

         var2 = ((this.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl) ? 1 : 0);
      }

      if (var1 != null) {
         if (var2 != 0) {
            label83: {
               boolean var4 = ((java.util.function.Supplier<Boolean>)(() -> { this.a5().a(50); return false; })).get();
               if (var1 != null) {
                  if (!var4) {
                     return;
                  }

                  me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .j();
                  this.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl = false;
                  if (var1 == null) {
                     break label83;
                  }

                  var4 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .h()
                     .ae();
               }

               if (var4) {
                  this.e(true);
               }

               this.a(
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               );
            }

            this.a5().f();
            return;
         }

         var2 = ((java.util.function.Supplier<Integer>)(() -> { this.a5().a(50); return 0; })).get();
      }

      if (var1 != null) {
         if (var2 == 0) {
            return;
         }

         me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .j();
      }

      this.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl = true;
      this.a5().f();
   }

   private final void bI() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var10000 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001 = this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
      Intrinsics.checkNotNull(this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl);
      String var4 = var10001.a().getHoverName().getString();
      short var10003 = 31015;
      short var10004 = 23797;
      Intrinsics.checkNotNullExpressionValue(var4, "getString(...)");
      boolean var2 = var10000.c(var4);
      if (var1 != null) {
         if (!var2) {
            var10000 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var10001 = this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
            Intrinsics.checkNotNull(this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl);
            var10000.b(var10001.b());
            this.a6().f();
            return;
         }

         var2 = ((java.util.function.Supplier<Boolean>)(() -> { this.a6().a(100); return false; })).get();
      }

      if (var1 != null) {
         if (!var2) {
            return;
         }

         var2 = ((java.util.function.Supplier<Boolean>)(() -> { this.a5().a(50); return false; })).get();
      }

      if (var1 != null) {
         if (!var2) {
            return;
         }

         me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .j();
      }

      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
      );
      this.a5().f();
   }

   private final void bJ() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var10000 = this;
      if (var1 != null) {
         if (((java.util.function.Supplier<Boolean>)(() -> { this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI.a(1000); return false; })).get()) {
            this.bL();
            return;
         }

         String var10002 = this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
         Intrinsics.checkNotNull(this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI);
         this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = this.i(var10002);
         var10000 = this;
      }

      if (var1 != null) {
         if (var10000.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII == null) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001 = this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
            Intrinsics.checkNotNull(this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl);
            if (var1 != null) {
               String var3 = var10001.a().getHoverName().getString();
               short var10003 = 31015;
               short var10004 = 23797;
               Intrinsics.checkNotNullExpressionValue(var3, "getString(...)");
               if (var2.c(var3)) {
                  return;
               }

               var2 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               var10001 = this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
               Intrinsics.checkNotNull(this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl);
            }

            var2.b(var10001.b());
            return;
         }

         this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.f();
         this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = false;
         var10000 = this;
      }

      var10000.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
   }

   private final void bK() {
      LocalPlayer var10000 = this.ap().player;
      Intrinsics.checkNotNull(var10000);
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(
         var10000.getYRot() + (float)Random.Default.nextDouble(-1.0, 1.0), (float)Random.Default.nextDouble(89.0, 89.9)
      );
   }

   private final void bL() {
      Object var4 = null; // PX-FIX
      short var10001 = 31064;
      short var10002 = 29047;
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("use", false);
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = null;
      String var1 = var10000;
      this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = null;
      if (var1 != null) {
         label25: {
            label24:
            if (IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .h()
               .ae()) {
               lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var2 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .f();
               var10001 = 31002;
               var10002 = -28712;
               int var3 = ((var2.c("Fire Veil")) ? 1 : 0);
               if (var1 != null) {
                  if (var3 != 0) {
                     break label24;
                  }

                  var4 = this;
                  if (var1 == null) {
                     break label25;
                  }

                  LocalPlayer var5 = this.ap().player;
                  Intrinsics.checkNotNull(var5);
                  float var8;
                  var3 = (var8 = var5.getXRot() - 85.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
               }

               if (var3 > 0) {
                  this.e(true);
               }
            }

            this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = false;
            this.a(
               IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            );
            var4 = this;
         }

         ((me.octo.client.PXDyn)(Object)(this.a5())).f();
      }
   }

   private final void bM() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (var1 != null) {
         if (System.currentTimeMillis() - this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl <= 5000L) {
            lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var4;
            label82: {
               ArmorStand var10000 = this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
               if (var1 != null) {
                  if (this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI == null) {
                     this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI = this.bN();
                     var4 = this;
                     if (var1 != null) {
                        if (this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI == null) {
                           return;
                        }

                        var4 = this;
                     }

                     var4.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = System.currentTimeMillis();
                     return;
                  }

                  var4 = this;
                  if (var1 == null) {
                     break label82;
                  }

                  var10000 = this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
                  Intrinsics.checkNotNull(this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI);
               }

               label69:
               if (var10000.isAlive()) {
                  LocalPlayer var5 = this.ap().player;
                  Intrinsics.checkNotNull(var5);
                  ArmorStand var10001 = this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
                  Intrinsics.checkNotNull(this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI);
                  float var10;
                  int var6 = (var10 = var5.distanceTo(var10001) - 10.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
                  if (var1 != null) {
                     if (var6 > 0) {
                        break label69;
                     }

                     var6 = ((this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl) ? 1 : 0);
                  }

                  if (var1 != null) {
                     if (var6 == 0) {
                        ArmorStand var7 = this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
                        Intrinsics.checkNotNull(this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI);
                        Vec3 var8 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var7)
                           .add(0.0, 1.0, 0.0);
                        short var10002 = 31081;
                        short var10003 = -14335;
                        Intrinsics.checkNotNullExpressionValue(var8, "add(...)");
                        Vec3 var2 = var8;
                        lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var3 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var2);
                        IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(var3.a(), var3.b());
                        this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl = true;
                        return;
                     }

                     var6 = ((IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .i()) ? 1 : 0);
                  }

                  if (var1 != null) {
                     if (var6 != 0) {
                        return;
                     }

                     var6 = ((this.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl) ? 1 : 0);
                  }

                  if (var1 != null) {
                     if (var6 != 0) {
                        return;
                     }

                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .j();
                  }

                  this.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl = true;
                  this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = System.currentTimeMillis();
                  return;
               }

               this.bO();
               this.a(
                  IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               );
               var4 = this;
            }

            var4.a5().f();
            return;
         }

         this.bO();
         this.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         );
         this.a5().f();
      }
   }

   private final ArmorStand bN() {
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      ClientLevel var10001 = this.ap().level;
      Intrinsics.checkNotNull(var10001);
      Iterator var2 = var10001.entitiesForRendering().iterator();
      String var1 = var10000;

      label62:
      while (var2.hasNext()) {
         var10000 = (String)var2.next();
         short var10002 = 31066;
         short var10003 = -20251;
         Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
         Entity var3 = (Entity)(Object)var10000;
         var10000 = String.valueOf(var3);

         do {
            int var10 = (((Object)var10000 instanceof ArmorStand) ? 1 : 0);
            if (var1 != null) {
               if (var10 == 0) {
                  continue label62;
               }

               LocalPlayer var11 = this.ap().player;
               Intrinsics.checkNotNull(var11);
               float var13;
               var10 = (var13 = var11.distanceTo(var3) - 7.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            }

            if (var1 != null) {
               if (var10 > 0) {
                  continue label62;
               }

               var10 = ((Intrinsics.areEqual(((ArmorStand)var3).getItemBySlot(EquipmentSlot.HEAD).getItem(), Items.AIR)) ? 1 : 0);
            }

            if (var1 != null) {
               var10 = var10 == 0 ? 1 : 0;
            }

            int var4 = var10;
            byte var5 = ((byte)((Intrinsics.areEqual(((ArmorStand)var3).getItemBySlot(EquipmentSlot.CHEST).getItem(), Items.AIR)) ? 1 : 0));
            byte var6 = ((byte)((Intrinsics.areEqual(((ArmorStand)var3).getItemBySlot(EquipmentSlot.LEGS).getItem(), Items.AIR)) ? 1 : 0));
            byte var7 = ((byte)((Intrinsics.areEqual(((ArmorStand)var3).getItemBySlot(EquipmentSlot.FEET).getItem(), Items.AIR)) ? 1 : 0));
            int var12 = var4;
            if (var1 != null) {
               if (var4 == 0) {
                  continue label62;
               }

               var12 = var5;
            }

            if (var1 != null) {
               if (var12 == 0) {
                  continue label62;
               }

               var12 = var6;
            }

            if (var1 != null) {
               if (var12 == 0) {
                  continue label62;
               }

               var12 = var7;
            }

            if (var12 == 0) {
               continue label62;
            }

            var10000 = String.valueOf((ArmorStand)var3);
         } while (var1 == null);

         return (ArmorStand)var3;
      }

      return null;
   }

   private final void bO() {
      this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI = null;
      this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl = false;
      this.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl = false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final Entity i(String var1) {
      Object var62 = null; // PX-FIX
      Object var37 = null; // PX-FIX
      String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (var2 != null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            LocalPlayer var3 = var10000;
            if (var2 != null) {
               ClientLevel var60 = this.ap().level;
               if (var60 != null) {
                  ClientLevel var4;
                  AABB var5;
                  label195: {
                     var4 = var60;
                     AABB var61 = var3.getBoundingBox().inflate(15.0, 10.0, 15.0);
                     short var10002 = 31052;
                     short var10003 = 10262;
                     Intrinsics.checkNotNullExpressionValue(var61, "inflate(...)");
                     var5 = var61;
                     if (var2 != null) {
                        var62 = this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
                        if (this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII != null) {
                           break label195;
                        }
                     }

                     var62 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var3);
                  }

                  Vec3 var6;
                  int var7;
                  label206: {
                     var6 =((Vec3)( var62));
                     var7 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .m()
                        .M();
                     List var63 = var4.getEntities(var3, var5, null);
                     short var81 = 31021;
                     short var84 = -15226;
                     Intrinsics.checkNotNullExpressionValue(var63, "getEntities(...)");
                     Iterable var9 = var63;
                     boolean var10 = false;
                     Iterator var11 = var9.iterator();
                     var10000 = ((LocalPlayer)(Object)(var11));
                     if (var2 != null) {
                        if (!var11.hasNext()) {
                           var10000 = null;
                           break label206;
                        }

                        var10000 = (LocalPlayer)var11.next();
                     }

                     Object var12 = var10000;
                     var10000 = ((LocalPlayer)(Object)(var11));
                     if (var2 != null) {
                        if (!var11.hasNext()) {
                           var10000 = (LocalPlayer)var12;
                           break label206;
                        }

                        var10000 = (LocalPlayer)var12;
                     }

                     Entity var13 = var10000;
                     boolean var15 = false;
                     Intrinsics.checkNotNull(var13);
                     double var38 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var13)
                        .distanceTo(var6);

                     label177:
                     while (true) {
                        Object var41 = var11.next();
                        Entity var16 = (Entity)var41;
                        boolean var18 = false;
                        Intrinsics.checkNotNull(var16);
                        double var46 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                              var16
                           )
                           .distanceTo(var6);
                        if (Double.compare(var38, var46) > 0) {
                           var12 = var41;
                           var38 = var46;
                        }

                        while (!var11.hasNext()) {
                           if (var2 != null) {
                              var10000 = (LocalPlayer)var12;
                              break label177;
                           }

                           var38 = var46;
                        }
                     }
                  }

                  Entity var8 = var10000;
                  if (var2 != null && var8 != null) {
                     return var8;
                  }

                  Object var35 = var4.getEntitiesOfClass(
                     ArmorStand.class, var5, (t) -> e((Entity)t)
                  );
                  short var10001 = 31077;
                  short var82 = -5104;
                  Intrinsics.checkNotNullExpressionValue(var35, "getEntitiesOfClass(...)");
                  boolean var67 = ((me.octo.client.PXDyn)var35).isEmpty();
                  if (var2 != null) {
                     if (var67) {
                        return null;
                     }

                     var35 = (Iterable)var35;
                     boolean var68 = false;
                  }

                  var var39 = new ArrayList();
                  boolean var42 = false;
                  boolean var50 = false;
                  Iterator var19 = ((me.octo.client.PXDyn)var35).iterator();

                  while (true) {
                     if (var19.hasNext()) {
                        label209: {
                           Object var20 = var19.next();
                           boolean var22 = false;
                           ArmorStand var23 = (ArmorStand)var20;
                           boolean var24 = false;
                           List var69 = var4.getEntities(
                              var3,
                              var23.getBoundingBox().inflate(1.5, 3.0, 1.5),
                              null
                           );
                           var82 = 31085;
                           short var85 = 31842;
                           Intrinsics.checkNotNullExpressionValue(var69, "getEntities(...)");
                           Iterable var25 = var69;
                           boolean var26 = false;
                           Iterator var27 = var25.iterator();
                           var10000 = ((LocalPlayer)(Object)(var27));
                           if (var2 != null) {
                              boolean var71 = var27.hasNext();
                              if (var2 == null) {
                                 break;
                              }

                              if (!var71) {
                                 var10000 = null;
                                 break label209;
                              }

                              var10000 = (LocalPlayer)var27.next();
                           }

                           Object var28 = var10000;
                           var10000 = ((LocalPlayer)(Object)(var27));
                           if (var2 != null) {
                              if (!var27.hasNext()) {
                                 var10000 = (LocalPlayer)var28;
                                 break label209;
                              }

                              var10000 = (LocalPlayer)var28;
                           }

                           Entity var29 = var10000;
                           boolean var30 = false;
                           float var57 = var29.distanceTo(var23);

                           label158:
                           while (true) {
                              Object var58 = var27.next();
                              Entity var31 = (Entity)var58;
                              boolean var32 = false;
                              float var59 = var31.distanceTo(var23);
                              if (Float.compare(var57, var59) > 0) {
                                 var28 = var58;
                                 var57 = var59;
                              }

                              while (!var27.hasNext()) {
                                 if (var2 != null) {
                                    var10000 = (LocalPlayer)var28;
                                    break label158;
                                 }

                                 var57 = var59;
                              }
                           }
                        }

                        Entity var74 = var10000;
                        if (var10000 != null) {
                           Entity var33 = var74;
                           boolean var34 = false;
                           var39.add(var33);
                        }

                        if (var2 != null) {
                           continue;
                        }
                     }

                     var35 = var39;
                     boolean var75 = false;
                     break;
                  }

                  HashSet var36 = new HashSet();
                  var39 = new ArrayList();
                  Iterator var43 = ((me.octo.client.PXDyn)var35).iterator();

                  while (true) {
                     if (var43.hasNext()) {
                        Object var47 = var43.next();
                        Entity var51 = (Entity)var47;
                        boolean var55 = false;
                        Integer var52 = var51.getId();
                        boolean var76 = var36.add(var52);
                        if (var2 == null) {
                           break;
                        }

                        if (var2 != null) {
                           if (!var76) {
                              continue;
                           }

                           var39.add(var47);
                        }

                        if (var2 != null) {
                           continue;
                        }
                     }

                     var35 = var39;
                     boolean var77 = false;
                     break;
                  }

                  label214: {
                     var37 = ((me.octo.client.PXDyn)var35).iterator();
                     boolean var78 = ((me.octo.client.PXDyn)var37).hasNext();
                     if (var2 != null) {
                        if (!var78) {
                           return (Entity)null;
                        }

                        var39 = (ArrayList)((me.octo.client.PXDyn)var37).next();
                        var10000 =((LocalPlayer)( var37));
                        if (var2 == null) {
                           break label214;
                        }

                        var78 = ((me.octo.client.PXDyn)var37).hasNext();
                     }

                     if (!var78) {
                        return (Entity)(Object)var39;
                     }

                     var10000 = ((LocalPlayer)(Object)(var39));
                  }

                  Entity var44 = var10000;
                  boolean var48 = false;
                  Comparable var45 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var44)
                     .distanceTo(var6);

                  while (true) {
                     Object var49 = ((me.octo.client.PXDyn)var37).next();
                     Entity var53 = (Entity)var49;
                     boolean var56 = false;
                     Comparable var54 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                           var53
                        )
                        .distanceTo(var6);
                     if (var45.compareTo(var54) > 0) {
                        var39 = (ArrayList)var49;
                        var45 = var54;
                     }

                     while (!(Boolean)((me.octo.client.PXDyn)var37).hasNext()) {
                        if (var2 != null) {
                           return (Entity)(Object)var39;
                        }

                        var45 = var54;
                     }
                  }
               }
            }

            return null;
         }
      }

      return null;
   }

   private final boolean g(Entity var1) {
      String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      int var10000 = ((var1 instanceof Player) ? 1 : 0);
      if (var2 != null) {
         if (var10000 == 0) {
            return false;
         }

         var10000 = ((Player)var1).getUUID().version();
      }

      if (var10000 == 4) {
         ClientPacketListener var3 = this.ap().getConnection();
         if ((var3 != null ? var3.getPlayerInfo(((Player)var1).getUUID()) : null) != null) {
            return true;
         }
      }

      return false;
   }

   @SubscribeEvent
   public final void a(@NotNull llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII var1) {
      String var2;
      Double var8;
      label44: {
         String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         short var10002 = 31010;
         short var10003 = 28380;
         Intrinsics.checkNotNullParameter(var1, "event");
         var2 = var10000;
         String var3 = var1.k();
         if (var2 != null) {
            var10002 = 31051;
            var10003 = 17974;
            MatchResult var5 = (new Regex("\\+(\\d+\\.?\\d*) Fishing")).find( var3, 0);
            label40:
            if (var5 != null) {
               Object var6 = var5.getGroupValues();
               if (var2 != null) {
                  if (var6 == null) {
                     break label40;
                  }

                  var6 = ((me.octo.client.PXDyn)var6).get(1);
               }

               String var7 = (String)var6;
               if ((String)var6 != null) {
                  var8 = StringsKt.toDoubleOrNull(var7);
                  if (var2 != null) {
                     break label44;
                  }
               }
            }
         }

         var8 = null;
      }

      Double var4 = var8;
      if (var2 != null) {
         if (var4 != null) {
            lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var9 = this;
            if (var2 != null) {
               if (!this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl) {
                  return;
               }

               this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll
                  + var4;
               short var10001 = 30996;
               short var11 = -12778;
               IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a("fishingXP", (long)var4.doubleValue());
               var9 = this;
            }

            var9.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = false;
            return;
         }

         this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = true;
      }
   }

   @SubscribeEvent
   public final void c(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var28 = null; // PX-FIX
      Object var26 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      Object var14 = null; // PX-FIX
      String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = var1;
      if (var2 != null) {
         short var10001 = 31087;
         short var10002 = 5725;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (!this.G()) {
            return;
         }

         var10000 = var1;
      }

      Packet var3 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Packet var11 = var3;
      if (var2 != null) {
         if (!(var3 instanceof ClientboundSystemChatPacket)) {
            return;
         }

         var11 = var3;
      }

      String var4;
      label225: {
         label231: {
            String var12 = ((ClientboundSystemChatPacket)var11).content().getString();
            short var47 = 30980;
            short var10003 = 25838;
            Intrinsics.checkNotNullExpressionValue(var12, "getString(...)");
            var4 = var12;
            CharSequence var13 = var4;
            short var32 = 31018;
            var47 = 10464;
            var14 = StringsKt.contains(var13, "You spot a Golden Fish surface from beneath the lava!", false);
            if (var2 != null) {
               if (((Boolean)(var14))) {
                  boolean var15 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .r()
                     .ae();
                  if (var2 != null) {
                     if (!var15) {
                        return;
                     }

                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .j();
                  }

                  this.bO();
                  this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = System.currentTimeMillis();
                  this.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
                  );
                  if (var2 != null) {
                     break label231;
                  }
               }

               CharSequence var16 = var4;
               var32 = 31058;
               var47 = 31638;
               var14 = StringsKt.contains(var16, "The Golden Fish is weak!", false);
            }

            if (var2 != null) {
               if (((Boolean)(var14))) {
                  lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var17 = this;
                  if (var2 != null) {
                     if (this.W()
                        != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
                        )
                      {
                        break label231;
                     }

                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .j();
                     var17 = this;
                  }

                  var17.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = System.currentTimeMillis();
                  if (var2 != null) {
                     break label231;
                  }
               }

               CharSequence var18 = var4;
               var32 = 31020;
               var47 = 21518;
               var14 = StringsKt.contains(var18, "TROPHY FISH! You caught a Golden Fish", false);
            }

            if (var2 != null) {
               if (((Boolean)(var14))) {
                  this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI = null;
                  new Thread(() -> q(this)).start();
                  if (var2 != null) {
                     break label231;
                  }
               }

               CharSequence var19 = var4;
               var32 = 31088;
               var47 = 14550;
               var14 = StringsKt.contains(var19, "The Golden Fish escapes your hook but looks weakened.", false);
            }

            if (var2 == null) {
               break label225;
            }

            if (((Boolean)var14)
               && this.W()
                  == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
               )
             {
               var14 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .r()
                  .ae();
               if (var2 == null) {
                  break label225;
               }

               if (((Boolean)(var14))) {
                  me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .j();
                  this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl = false;
                  this.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl = false;
                  this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = System.currentTimeMillis();
               }
            }
         }

         var14 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .ae();
      }

      if (((Boolean)(var14))) {
         for (Entry var6 : IllllllllIlIlIlllllIIlIlIlIllIIIIlIIIIIIIIIIllllIIlllIIIIIlIlllIlIlllIIIIIllIlllIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .entrySet()) {
            String var7 = (String)var6.getKey();
            String var8 = (String)var6.getValue();
            boolean var20 = StringsKt.contains(
               IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(var4),
               var7,
               false);

            while (var20) {
               int var9 = this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
               this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = var9 + -1;
               var20 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .o()
                  .ae();
               if (var2 != null) {
                  label182:
                  if (var2 != null) {
                     if (var20) {
                        short var36 = 31039;
                        short var52 = 32669;
                        var20 = Intrinsics.areEqual(var8, "Squid");
                        if (var2 != null) {
                           if (var20) {
                              return;
                           }

                           var36 = 31044;
                           var52 = 30647;
                           var20 = Intrinsics.areEqual(var8, "Night Squid");
                        }

                        if (var2 == null) {
                           break label182;
                        }

                        if (var20) {
                           return;
                        }
                     }

                     var20 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .q()
                        .ae();
                  }

                  label169: {
                     label168: {
                        label235: {
                           label236: {
                              label237: {
                                 label238: {
                                    label163:
                                    if (var2 != null) {
                                       if (var20) {
                                          short var38 = 31041;
                                          short var54 = 4590;
                                          var20 = Intrinsics.areEqual(var8, "Grinch");
                                          if (var2 == null) {
                                             break label163;
                                          }

                                          if (var20) {
                                             return;
                                          }
                                       }

                                       var21 = var8.toLowerCase(Locale.ROOT);
                                       short var55 = 31095;
                                       short var67 = -18268;
                                       Intrinsics.checkNotNullExpressionValue(var21, "toLowerCase(...)");
                                       if (var2 == null) {
                                          break label238;
                                       }

                                       CharSequence var22 =((CharSequence)( var21));
                                       short var39 = 31056;
                                       var55 = 12298;
                                       var20 = StringsKt.contains(var22, "jawbus", false);
                                    }

                                    if (!var20) {
                                       var21 = var8.toLowerCase(Locale.ROOT);
                                       short var57 = 31086;
                                       short var68 = 24696;
                                       Intrinsics.checkNotNullExpressionValue(var21, "toLowerCase(...)");
                                       if (var2 == null) {
                                          break label238;
                                       }

                                       CharSequence var23 =((CharSequence)( var21));
                                       short var40 = 31079;
                                       var57 = 9263;
                                       if (!StringsKt.contains(var23, "ragnarok", false)) {
                                          String var24 = var8.toLowerCase(Locale.ROOT);
                                          var57 = 31086;
                                          var68 = 24696;
                                          Intrinsics.checkNotNullExpressionValue(var24, "toLowerCase(...)");
                                          CharSequence var25 = var24;
                                          var40 = 31094;
                                          var57 = 17230;
                                          var26 = StringsKt.contains(var25, "thunder", false);
                                          if (var2 == null) {
                                             break label236;
                                          }

                                          if (!((Boolean)var26)) {
                                             break label237;
                                          }
                                       }
                                    }

                                    var21 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .p()
                                       .y();
                                 }

                                 String var10 =((String)( var21));
                                 short var42 = 31075;
                                 short var61 = -18857;
                                 var26 = Intrinsics.areEqual(var10, "Switch World");
                                 if (var2 != null) {
                                    if (((Boolean)(var26))) {
                                       this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll.f();
                                       this.a(
                                          IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl
                                       );
                                       return;
                                    }

                                    var42 = 30995;
                                    var61 = 2372;
                                    var26 = Intrinsics.areEqual(var10, "Stop Macro");
                                 }

                                 if (var2 == null) {
                                    break label236;
                                 }

                                 if (((Boolean)(var26))) {
                                    var61 = 31024;
                                    short var70 = -24167;
                                    var70 = 31061;
                                    short var10004 = 16477;
                                    this.a(
                                       "Hooked " + var8 + ", stopping macro.",
                                       me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                                    );
                                    this.N();
                                    return;
                                 }
                              }

                              this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = var8;
                              this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII.f();
                              if (var2 == null) {
                                 break label235;
                              }

                              lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var27 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .f();
                              short var44 = 31049;
                              short var63 = 32200;
                              var26 = var27.c("Melee");
                           }

                           if (!((Boolean)var26)) {
                              short var45 = 30997;
                              short var65 = 32647;
                              var28 = Intrinsics.areEqual(var8, "Grinch");
                              if (var2 == null) {
                                 break label169;
                              }

                              if (!((Boolean)var28)) {
                                 break label168;
                              }
                           }

                           this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl.f();
                           this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII.f();
                           this.a(
                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
                           );
                        }

                        if (var2 != null) {
                           return;
                        }
                     }

                     lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var29 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .f();
                     short var46 = 31063;
                     short var66 = 15478;
                     var28 = var29.c("Flaming Flay");
                  }

                  if (((Boolean)(var28))) {
                     lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var30 = this;
                     if (var2 != null) {
                        if (this.W()
                           != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                           )
                         {
                           return;
                        }

                        this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII.f();
                        var30 = this;
                     }

                     var30.a(
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                     );
                     if (var2 != null) {
                        return;
                     }
                  }

                  lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var31 = this;
                  if (var2 != null) {
                     if (this.W()
                        != IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                        )
                      {
                        return;
                     }

                     this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = this.i(var8);
                     var31 = this;
                  }

                  if (var2 != null) {
                     if (var31.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII == null) {
                        return;
                     }

                     this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII.f();
                     this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.f();
                     this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = false;
                     var31 = this;
                  }

                  var31.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                  );
                  return;
               }
            }
         }
      }
   }

   private final BlockPos bP() {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (var1 != null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            boolean var3 = false;
            return me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(var2);
         }
      }

      return null;
   }

   private final BlockPos a(Vec3 var1) {
      String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      if (var2 != null) {
         BlockPos var10000 = this.bP();
         if (var10000 != null) {
            var10000 = var10000.above();
            if (var10000 != null) {
               return var10000;
            }
         }
      }

      return lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .f(var1);
   }

   private final void bQ() {
      Object llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d ()Ljava/lang/String;
      // 003: aload 0
      // 004: aconst_null
      // 005: putfield me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI Lme/octo/client/llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII;
      // 008: astore 1
      // 009: aload 1
      // 00a: ifnull 04d
      // 00d: aload 0
      // 00e: invokevirtual me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.ap ()Lnet/minecraft/client/Minecraft;
      // 011: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 014: dup
      // 015: ifnull 04c
      // 018: goto 01f
      // 01b: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: checkcast net/minecraft/world/entity/Entity
      // 022: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 025: dup
      // 026: aload 1
      // 027: ifnull 049
      // 02a: goto 031
      // 02d: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: ifnull 04c
      // 034: goto 03b
      // 037: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: dconst_0
      // 03c: dconst_1
      // 03d: dconst_0
      // 03e: invokevirtual net/minecraft/world/phys/Vec3.subtract (DDD)Lnet/minecraft/world/phys/Vec3;
      // 041: dup
      // 042: goto 049
      // 045: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 048: athrow
      // 049: ifnonnull 04e
      // 04c: pop
      // 04d: return
      // 04e: astore 2
      // 04f: getstatic me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI;
      // 052: aload 1
      // 053: ifnull 120
      // 056: invokevirtual me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.a ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 059: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ae ()Z
      // 05c: ifeq 11c
      // 05f: goto 066
      // 062: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: aload 0
      // 067: invokespecial me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.bP ()Lnet/minecraft/core/BlockPos;
      // 06a: dup
      // 06b: ifnonnull 084
      // 06e: goto 075
      // 071: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074: athrow
      // 075: pop
      // 076: getstatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
      // 079: aload 2
      // 07a: invokevirtual me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.f (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/core/BlockPos;
      // 07d: goto 084
      // 080: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: astore 3
      // 085: aload 0
      // 086: new me/octo/client/llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII
      // 089: dup
      // 08a: sipush 31101
      // 08d: sipush 26157
      // 090: pop2
      // 091: ldc_w "In Place"
      // 094: getstatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
      // 097: invokevirtual me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.g ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 09a: getstatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
      // 09d: invokevirtual me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.g ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0a0: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 0a3: aload 3
      // 0a4: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.e (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 0a7: bipush 1
      // 0a8: anewarray 715
      // 0ab: astore 4
      // 0ad: aload 4
      // 0af: bipush 0
      // 0b0: new me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
      // 0b3: dup
      // 0b4: aload 3
      // 0b5: getstatic me/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 0b8: invokespecial me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.<init> (Lnet/minecraft/core/BlockPos;Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;)V
      // 0bb: aastore
      // 0bc: aload 4
      // 0be: invokestatic kotlin/collections/CollectionsKt.arrayListOf ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 0c1: checkcast java/util/List
      // 0c4: getstatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
      // 0c7: invokevirtual me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.g ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0ca: getstatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl [I
      // 0cd: swap
      // 0ce: invokevirtual me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ordinal ()I
      // 0d1: iaload
      // 0d2: bipush 1
      // 0d3: if_icmpne 0dc
      // 0d6: getstatic me/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 0d9: goto 0df
      // 0dc: getstatic me/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 0df: new kotlin/Pair
      // 0e2: dup
      // 0e3: aload 0
      // 0e4: invokevirtual me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.ap ()Lnet/minecraft/client/Minecraft;
      // 0e7: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 0ea: dup
      // 0eb: ifnull 0f4
      // 0ee: invokevirtual net/minecraft/client/player/LocalPlayer.getYRot ()F
      // 0f1: goto 0f6
      // 0f4: pop
      // 0f5: fconst_0
      // 0f6: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0f9: aload 0
      // 0fa: invokevirtual me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.ap ()Lnet/minecraft/client/Minecraft;
      // 0fd: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 100: dup
      // 101: ifnull 10a
      // 104: invokevirtual net/minecraft/client/player/LocalPlayer.getXRot ()F
      // 107: goto 10c
      // 10a: pop
      // 10b: fconst_0
      // 10c: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 10f: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 112: invokespecial me/octo/client/llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII.<init> (Ljava/lang/String;Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;Lnet/minecraft/world/phys/Vec3;Ljava/util/List;Lme/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;Lkotlin/Pair;)V
      // 115: putfield me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI Lme/octo/client/llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII;
      // 118: aload 1
      // 119: ifnonnull 32d
      // 11c: nop
      // 11d: getstatic me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI;
      // 120: invokevirtual me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.d ()Lme/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll;
      // 123: invokevirtual me/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll.V ()Ljava/lang/String;
      // 126: astore 3
      // 127: getstatic me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI;
      // 12a: invokevirtual me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.d ()Lme/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll;
      // 12d: invokevirtual me/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll.W ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 130: astore 4
      // 132: getstatic me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI;
      // 135: invokevirtual me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.d ()Lme/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll;
      // 138: invokevirtual me/octo/client/IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll.X ()Ljava/lang/String;
      // 13b: astore 5
      // 13d: aload 1
      // 13e: ifnull 17e
      // 141: aload 3
      // 142: ifnull 158
      // 145: goto 14c
      // 148: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: aload 5
      // 14e: ifnonnull 17f
      // 151: goto 158
      // 154: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157: athrow
      // 158: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 15b: ldc2_w 5000
      // 15e: sipush 31042
      // 161: sipush -15654
      // 164: pop2
      // 165: ldc "Fishing Macro"
      // 167: sipush 31096
      // 16a: sipush -20020
      // 16d: pop2
      // 16e: ldc_w "No route selected or invalid location"
      // 171: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 174: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 177: goto 17e
      // 17a: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17d: athrow
      // 17e: return
      // 17f: getstatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll;
      // 182: aload 5
      // 184: aload 3
      // 185: invokevirtual me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.c (Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
      // 188: astore 6
      // 18a: aload 1
      // 18b: ifnull 1d8
      // 18e: aload 6
      // 190: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 193: ifeq 1d9
      // 196: goto 19d
      // 199: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 1a0: ldc2_w 5000
      // 1a3: sipush 31028
      // 1a6: sipush 3876
      // 1a9: pop2
      // 1aa: ldc "Fishing Macro"
      // 1ac: aload 3
      // 1ad: aload 5
      // 1af: sipush 31046
      // 1b2: sipush 7695
      // 1b5: pop2
      // 1b6: ldc_w "Route '"
      // 1b9: dup_x2
      // 1ba: pop
      // 1bb: sipush 31073
      // 1be: sipush -2447
      // 1c1: pop2
      // 1c2: ldc_w "' is empty or not found in "
      // 1c5: swap
      // 1c6: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 1cb: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 1ce: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 1d1: goto 1d8
      // 1d4: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: return
      // 1d9: getstatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll;
      // 1dc: aload 1
      // 1dd: ifnull 1fc
      // 1e0: invokevirtual me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.p ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 1e3: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 1e6: if_acmpne 1f9
      // 1e9: goto 1f0
      // 1ec: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: aload 4
      // 1f2: goto 1ff
      // 1f5: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f8: athrow
      // 1f9: getstatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll;
      // 1fc: invokevirtual me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.p ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 1ff: astore 7
      // 201: aload 0
      // 202: aload 3
      // 203: aload 7
      // 205: dup
      // 206: aload 1
      // 207: ifnull 220
      // 20a: ifnonnull 21e
      // 20d: goto 214
      // 210: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 213: athrow
      // 214: pop
      // 215: aload 4
      // 217: goto 21e
      // 21a: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21d: athrow
      // 21e: aload 7
      // 220: dup
      // 221: ifnonnull 22e
      // 224: pop
      // 225: aload 4
      // 227: goto 22e
      // 22a: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22d: athrow
      // 22e: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 231: aload 6
      // 233: checkcast java/util/List
      // 236: invokestatic kotlin/collections/CollectionsKt.last (Ljava/util/List;)Ljava/lang/Object;
      // 239: checkcast me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
      // 23c: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.a ()Lnet/minecraft/core/BlockPos;
      // 23f: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.e (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 242: aload 6
      // 244: checkcast java/util/List
      // 247: aload 1
      // 248: ifnull 260
      // 24b: aload 7
      // 24d: dup
      // 24e: ifnonnull 262
      // 251: goto 258
      // 254: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 257: athrow
      // 258: pop
      // 259: goto 260
      // 25c: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25f: athrow
      // 260: aload 4
      // 262: getstatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl [I
      // 265: swap
      // 266: invokevirtual me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ordinal ()I
      // 269: iaload
      // 26a: bipush 1
      // 26b: if_icmpne 278
      // 26e: getstatic me/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 271: goto 27b
      // 274: invokestatic me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 277: athrow
      // 278: getstatic me/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 27b: getstatic me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll;
      // 27e: invokevirtual me/octo/client/llIIIIllllIIIIlIIIlIlllllIllllIlIlIlIlIlIlIIlIIIllllIIlIllllIIlIlllIlIlIlIIIlllllIlll.q ()Lme/octo/client/IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI;
      // 281: dup
      // 282: ifnull 2c5
      // 285: astore 8
      // 287: astore 16
      // 289: astore 15
      // 28b: astore 14
      // 28d: astore 13
      // 28f: astore 12
      // 291: astore 11
      // 293: astore 10
      // 295: bipush 0
      // 296: istore 9
      // 298: new kotlin/Pair
      // 29b: dup
      // 29c: aload 8
      // 29e: invokevirtual me/octo/client/IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI.a ()F
      // 2a1: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 2a4: aload 8
      // 2a6: invokevirtual me/octo/client/IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI.b ()F
      // 2a9: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 2ac: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2af: astore 17
      // 2b1: aload 10
      // 2b3: aload 11
      // 2b5: aload 12
      // 2b7: aload 13
      // 2b9: aload 14
      // 2bb: aload 15
      // 2bd: aload 16
      // 2bf: aload 17
      // 2c1: nop
      // 2c2: goto 2d5
      // 2c5: pop
      // 2c6: new kotlin/Pair
      // 2c9: dup
      // 2ca: fconst_0
      // 2cb: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 2ce: fconst_0
      // 2cf: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 2d2: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2d5: astore 18
      // 2d7: astore 19
      // 2d9: astore 20
      // 2db: astore 21
      // 2dd: astore 22
      // 2df: astore 23
      // 2e1: astore 24
      // 2e3: new me/octo/client/llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII
      // 2e6: dup
      // 2e7: aload 24
      // 2e9: aload 23
      // 2eb: aload 22
      // 2ed: aload 21
      // 2ef: aload 20
      // 2f1: aload 19
      // 2f3: aload 18
      // 2f5: invokespecial me/octo/client/llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII.<init> (Ljava/lang/String;Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;Lnet/minecraft/world/phys/Vec3;Ljava/util/List;Lme/octo/client/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;Lkotlin/Pair;)V
      // 2f8: putfield me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI Lme/octo/client/llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII;
      // 2fb: goto 32d
      // 2fe: astore 3
      // 2ff: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 302: ldc2_w 5000
      // 305: sipush 31028
      // 308: sipush 3876
      // 30b: pop2
      // 30c: ldc "Fishing Macro"
      // 30e: aload 3
      // 30f: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 312: sipush 31084
      // 315: sipush -21139
      // 318: pop2
      // 319: ldc_w "Error loading route: "
      // 31c: swap
      // 31d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 322: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 325: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 328: aload 0
      // 329: aconst_null
      // 32a: putfield me/octo/client/lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI Lme/octo/client/llIlIlIIlIIllIIIlIIIllllllIlIIllllllIIllIIIlIlIlllllIllIIlIIIlIlIIIIIIllIIIlIIIlIIIII;
      // 32d: return
   }

   private final void bR() {
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      this.ac().clear();
      String var1 = var10000;
      if (var1 != null && this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI != null) {
         List var4 = this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI.e();
         if (var4 != null) {
            List var2 = var4;
            boolean var3 = false;
            this.ac().addAll(var2);
         }
      }
   }

   public void O() {
      short var10001 = 31083;
      short var10002 = -30756;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Fishing Info");
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((String)null,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((String)null,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((String)null,  0);;
      var10001 = 31099;
      var10002 = -11306;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Fishing XP");
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((String)null,  1);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII::bT, 1);
   }

   private static final long a(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll(
         var0.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll,
         var0.ac().size(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
            (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)var0, 0.0, 1, null
         )
      );
   }

   private static final Object d(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
         var0.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll,
         var0.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
            (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)var0, 0.0, 1, null
         )
      );
   }

   private static final Object e(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      int var10002 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .K();
      boolean var10003 = var0.a9();
      boolean var10004 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i();
      FishingHook var10005 = var0.bj();
      return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var10002, var10003, var10004, var10005 != null ? var10005.getId() : null
      );
   }

   private static final long bS() {
      return llIlIIIIlIlIIlllIllIlIIIIIIIlIlIIlllIlIllIIIlllllIlllIlIIIIIIIllIIIlIIIlIIIlIIllllIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .a()
               .M()
            * 2000L
         + 10000L;
   }

   private static final Object f(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      FishingHook var2;
      int var14;
      Vec3 var15;
      Integer var10001;
      label24: {
         String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         var2 = var0.bj();
         String var1 = var10000;
         var14 = var0.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
         var10001 = var1 != null && var2 != null ? var2.getId() : null;
         if (var1 != null) {
            if (var2 == null) {
               var15 = null;
               break label24;
            }

         }

         var15 = llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((net.minecraft.world.entity.Entity)var2);
      }

      Boolean var10003;
      if (var2 != null) {
         Vec3 var7 = var15;
         Integer var6 = var10001;
         int var5 = var0.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
         boolean var4 = false;
         Boolean var8 = var0.a(var2);
         var14 = var5;
         var10001 = var6;
         var15 = var7;
         var10003 = var8;
      } else {
         var10003 = null;
      }

      Vec3 var9 = var0.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
      Boolean var10 = var10003;
      Vec3 var11 = var15;
      Integer var12 = var10001;
      int var13 = var14;
      return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         var13, var12, var11, var10, var9
      );
   }

   private static final boolean g(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      boolean var10000 = var0.bz();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .ae();
      }

      return var1 == null ? var10000 : var10000;
   }

   private static final Object h(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll,
         var0.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI,
         var0.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll,
         var0.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         var0.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI.k()
      );
   }

   private static final boolean i(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      boolean var10000 = var0.bz();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .ae();
      }

      return var1 == null ? var10000 : var10000;
   }

   private static final Object j(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      Integer var10004 = var0.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII != null
         ? var0.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII.getId()
         : null;
      Boolean var10005 = var0.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII != null
         ? var0.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII.isAlive()
         : null;
      Entity var1 = var0.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
      return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var0.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll,
         var0.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI,
         var10004,
         var10005,
         (var1 instanceof LivingEntity ? (LivingEntity)var1 : null) != null
            ? (int)(var1 instanceof LivingEntity ? (LivingEntity)var1 : null).getHealth()
            : null,
         var0.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI
      );
   }

   private static final boolean k(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      String var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      boolean var10000 = var0.bz();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .ae();
      }

      return var1 == null ? var10000 : var10000;
   }

   private static final Object l(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         var0.W(),
         var0.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI,
         var0.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII != null
            ? var0.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII.getId()
            : null,
         me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .K()
      );
   }

   private static final Object m(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
         var0.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI != null
            ? var0.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI.getId()
            : null,
         var0.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI != null
            ? var0.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI.isAlive()
            : null,
         var0.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl,
         var0.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl,
         var0.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl
      );
   }

   private static final Unit n(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      var0.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = false;
      String var1 = var10000;
      var0.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = 0;
      var0.bR();
      boolean var2 = var0.ac().isEmpty();
      if (var1 != null) {
         var2 = !var2;
      }

      if (var2) {
         var0.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
         var0.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         );
         if (var1 != null) {
            return Unit.INSTANCE;
         }
      }

      var0.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
      );
      return Unit.INSTANCE;
   }

   private static final Unit o(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      var0.bA();
      return Unit.INSTANCE;
   }

   private static final void p(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         new Vec3(var0.a8()),
         false);
      try {
         Thread.sleep(50L);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
   }

   private static final boolean a(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0, int var1, Entity var2) {
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      short var10002 = 31017;
      short var10003 = 25121;
      Intrinsics.checkNotNullParameter(var2, "entity");
      String var3 = var10000;
      int var4 = ((var2 instanceof ArmorStand) ? 1 : 0);
      if (var3 != null) {
         if (var4 != 0) {
            return (0 != 0);
         }

         var4 = ((var2 instanceof FishingHook) ? 1 : 0);
      }

      if (var3 != null) {
         if (var4 != 0) {
            return (0 != 0);
         }

         var4 = ((var0.g(var2)) ? 1 : 0);
      }

      if (var3 != null) {
         if (var4 != 0) {
            return (0 != 0);
         }

         var4 = ((var2.isAlive()) ? 1 : 0);
      }

      if (var3 != null) {
         if (var4 == 0) {
            return (0 != 0);
         }

         var4 = var2.tickCount;
      }

      if (var3 == null) {
         return (var4 != 0);
      } else {
         return (var4 < var1);
      }
   }

   private static final boolean c(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean a(
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0, int var1, String var2, Entity var3
   ) {
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      short var10002 = 31070;
      short var10003 = 28102;
      Intrinsics.checkNotNullParameter(var3, "entity");
      String var4 = var10000;
      int var5 = ((var3 instanceof LivingEntity) ? 1 : 0);
      if (var4 != null) {
         if (var5 == 0) {
            return (0 != 0);
         }

         var5 = ((var3 instanceof ArmorStand) ? 1 : 0);
      }

      if (var4 != null) {
         if (var5 != 0) {
            return (0 != 0);
         }

         var5 = ((var0.g(var3)) ? 1 : 0);
      }

      if (var4 != null) {
         if (var5 != 0) {
            return (0 != 0);
         }

         var5 = ((((LivingEntity)var3).isAlive() ? 1 : 0));
      }

      if (var4 != null) {
         if (var5 == 0) {
            return (0 != 0);
         }

         var5 = var3.tickCount;
      }

      if (var4 != null) {
         if (var5 >= var1) {
            return (0 != 0);
         }

         var10000 = ((LivingEntity)var3).getName().getString();
         var10002 = 31015;
         var10003 = 23797;
         Intrinsics.checkNotNullExpressionValue(var10000, "getString(...)");
         var5 = ((StringsKt.contains(var10000, var2, true)) ? 1 : 0);
      }

      if (var4 == null) {
         return (var5 != 0);
      } else {
         return (var5 != 0);
      }
   }

   private static final boolean d(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean a(String var0, ArmorStand var1) {
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      short var10002 = 31003;
      short var10003 = -1447;
      Intrinsics.checkNotNullParameter(var1, "stand");
      String var2 = var10000;
      ArmorStand var3 = var1;
      if (var2 != null) {
         if (!var1.hasCustomName()) {
            return false;
         }

         var3 = var1;
      }

      Component var4 = var3.getCustomName();
      if (var4 != null) {
         var10000 = var4.getString();
         Object var10001 = var10000;
         if (var2 != null) {
            if (var10000 == null) {
               return false;
            }

            var10000 = var10000;
            var10001 = var0;
         }

         boolean var6 = StringsKt.contains(var10000, (CharSequence)var10001, true);
         if (var2 != null) {
            ;
         }

         return var6;
      } else {
         return false;
      }
   }

   private static final boolean e(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final void q(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
      try {
         Thread.sleep(2000L);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      String var1 = var10000;
      lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var2 = var0;
      if (var1 != null) {
         if (!var0.G()) {
            return;
         }

         var0.a(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         );
         var2 = var0;
      }

      var2.a5().f();
   }

   private static final String r(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      short var10001 = 31033;
      short var10002 = 27856;
      return "Catches: " + var0.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   }

   private static final String s(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      short var10001 = 31082;
      short var10002 = 10687;
      return "Kills: " + var0.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
   }

   private static final String t(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      String var10000 = var0.W().name();
      short var10001 = 30992;
      short var10002 = 5726;
      return "State: " + var10000;
   }

   private static final String u(lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII var0) {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         (int)var0.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll
      ));
      short var10001 = 31071;
      short var10002 = 21756;
      return "XP Gained: " + var10000;
   }

   private static final String bT() {
      short var10001 = 31072;
      short var10002 = 24080;
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b("fishingXP")
      );
      var10001 = 31035;
      var10002 = -25395;
      return "Fishing XP / hr: " + var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[113];
      int var3 = 0;
      String var2 = "Æ½÷z¸>\u0082GCÖ\u000fÔ¾\u000fA\u00069Ñu\u001cÕi2Îº:&ÃùõÛÍ!Ý.\u0012\u0003Ù\u000f\u0097\u0002\u0091ð°Ì¢\u0018\nÉ¨9Ô_\u0011µ\u0097X$\"\u0095eËÐd \u0006w\u000b\u0097Öç\u0012\"ÎJüØ\u0004o\u0007<c:Å%V\u0087\u0010»¸óX\u0011Äpv\t¤«|º5ö>5rÔÇ}«Ì\u000f\u001b?×¬Âð\u001cVäøihyËc.·\u0003`kEò¦'|Ð\u0005Ç\u0095ø{+ùÃoí\u0091åÑ\u0099°¢\u001a¢¶\u0011\bêFFªÓ~\u0006i@Tå4ßz\u00987ßöð¶\u0014ûõ9JC oß\u0006½Kc¯>\u009c\u0081Jùï¾£\u0012\u0085íl¥Á\u0086ùà\f+Ì\u0086\u0003_ú\fÏÑyIGÍ\u0082ý?,\u0005«8\n\u0012\u009f\u00ad<;.D_oH\u009eç¨ÙG6\u009fa{>\u001apÊé\u0001^3F\u009e¸:q\u0083.ÑÞÃÄ\u009d8´\u007fm\u009c\u0006÷z\u0019A4÷\bù\u0004ÛÕ\u0012\u0084@\u001e\n×Õ\u001aØíëÝ v\t üt»¨\u000fí\u009eu&\u0014\b\"86VSÙQw&\u0094&\u008eC\u0090LoÍ}\r.ÿ\u0000\u0003§\u001bçDÄhì$\\\u0093V\u008e¥çó%ªC+\u007f¼\u0099aÄL\u001e\u0014>\u0097ÛX\u0087\u000e\u0089?D\u00988ëm\u008dÚo¿øÀ0\u0098Øú\u000bØ\u0015\u00827Õ\u0085òÅmï©hÖ\u0007\u0015ÎD-\u009bÇ\u0015¾A\u008aöîøëÙ\u009c\u0090D¥\u0097£Tð:^÷Ú\u000e¥[6ÔmòþK%íÝ(é\u0093\\=Q'¢\u0007ød$U´\u0006Ý\u009aÅH\u0089\u00191C/dÙ\u008cåè\u009c#ÀùéO\u0007aAã¦Õ÷ \r\u0085\u0016e9Qæ8ô\u001fªnâ\u008d\n\u0093Í½7\u001eÅY_¢\u00ad\u0013¾7\u0018hª.Ï\"O=¬\u009c9¬ª\n*:´\u0017W]'\u0085\u00ad\u0001ÆÊ¯ô`Å_äI\u008c\u0089\rÙº\u0081ö¨7\u0083K7\bPtaýã§=æë¤F\u008f·º¤+Ö\u0019ÍÈ7°Å\u008c_2\u0092\u00ady#\u001féÍE\u007f¢\u008brP¯s\u001eEUËbcÞR-ê\b\u0090\f{\u0000Xù\u0090\f\t¡\u0088ß\u009fRÐÐ\u0085\u009b\u001b\u001b×û\u000fÆ±(ëëH\u0005íÞ¦íÅX¸Jt/\u0006\u0000q#¹(\u001aDÞ X\u0086\u009e\u000f\"\u0091²AjQ$á²ízDò\u001b\u0090´#ñ{\füOý¦En>\u009bÖ\u008e\u0096T\u0015IÊ\u0084¨\u0003\u009f\u0089ÜëOû²tl\u0013\u009c\u0019Ç@\u0010X\u0010Ñ\u0081÷\u001e·r\u0085¤Ç9m\u001b¶Ùw£\u0010:mÃâ\u0017\u0093°\u009c\u0011ù¨×Ú@ú\u0090\u0005<\u0092\u0019&C\n·'Gfß\u0004\\¬\u009d!\b`V\u0017¨ù>Ca\u0007\u000fó\u009dôüm\u001b\f\u008c*^ËbZÖ¬Bíì¬)8\u0098ar\u009a;8\u0014È\u009aXAGPÈ\u0015\u001c(Æ\u0085eî·\u0017í\u001d\u0085¸\u0011\u0006ÈÀ\u0099a³üûD<?\u0087\u0011|!gÖCx#|.\u009eäèñ\u0007eÚ\u008c\f\u001c«Lû \\\u009elaúò»\f\u0087\u001f-Í\\?\u0011\u0000µzû\n\u0006÷V\u009cG¢\u009d$0(\u0003\u0004ø\u009f\u008e\u000f#×íjLØ\u0099J\"h`ní\u000bf\u0019\n$\"\u001eÐb|¥C|J·\u0018'\u008am¶þµ¥4j2\u0006~¥\u008bü\u0016¡7\u008d¤I\bÑ_#±vh\u008f^ýçñ\u0004Ìi&÷Ñ\u0081õ®Êá«Õmh¦ú\u009dT\u0089\u0011 ÊBÉ¹¬\tª!\u0001\u0017\u0091\u009a\u0088ò\u0089\u0005$üú\u000b=\u0006\u00ad+:\r\u0014´\u000b\u0016Â\u0083çè\u0012\u0087\u0007m!Ç\u0003\u0085í<\u0013«>¸î_\u008a¾\u008aGåi\u0080áÛòxohò\tj@¤\u0017\u0016\u001exb\u0097\u000e\t\u0091ï±<\u0081\u007f¡\u0010b\u0016Ô9\n\u000bÆÕ\n4cë|L\u0099\u008d.Aéöñ\u008d¢èAûÏbÀ\u0095\nJÝª«ç\u0006W¸ÅDlëÑ\u0005ç_ìð¼YîÀBÎ.ßF\u00030mø\u0000\u0011q\u008e)\u0019\u0087¨pØ\u0084n¢5uP×|\u0093¢B\u0007a\u001bs7\r\u0014ö\u0013L·\bú\u0096ûª:D´\u0097\u0007E\u001ch\u009c\u009c\u000e.\u0003\u0082#Ü\u0006ÕqNÞ38\r©\núÏöÚD¼\u0014à§þ¼\b:¦DEY ÁJ\f\u0018Y\u0013Ftu\u001f\u0018^2¬Y\bíÃ¾é\u0006µ*ø\b°\u001bÛ r/2C\b\u0017Ø \u009fA¯®È\rtìA\u0013\u0081AªÏö\u00805;0\u0005\u001e\u0097yüv\u0012Ã×d}Í\u008bÄ5\b\u0012\u0080\u001cÕ\u007f\u001d\u0094°µ\u0015\u0098\u008bÞÁOìä\u0099.¶Ûö\u0092(|\u0012@Ì¡º®\rîÈ\u0012\u0097ëÑçÝ`Ì){mX\u0093\u009a\t'¶e©\u0097É¹| \u000fã¤mg£gç\u0006Ö8¼à\\Y@\b³I©]DJ\u0005\u008cßÞ\n`ó\fóÿCgï\u0018@uN\u00077K¹HÎ\u0004\u001bMéÉ\u0011x\u0090\u0017ç÷þÛÉï\u0097ÖÆíðt:F§PY&w°'\u0010w\u0094K\u0007À»\u0082\u0090öa\u0084H\u009a \u008fÍ\u000fB\u0091\u0012¤\u0091§Î\u0013£º6\u0094¦g6\u0007\bS\u001d!\u0099nc\u0013Éåô\u0095Öå\u008fgaX\u00ad7y-á¦\r³¾\fà[ÁEÁ.¢\"Ã>5\u0082\tfO\u0002j\u0081úÈÎæ\u000b¸QÅ¤\u009aùC\u000e~ÅÒ\u000eRN\u0085G\u0019Ë¹\u009e\u0092·kamA0\u0017©,¶Dap½ñá\u0014¶Î\u0000ü\u0005\u000b`S\u0081}ù3\u0081-lÏPN\u001bØcy\u000f^bÛØ\u000f#zv*Ñò´$\u0096\u0005\u0094ìì\tÿ\u0014¾\u0000\u0018\u008eªòÏ¹YT¿ïðk\u001f|³Í\nË\t\u000e¼¬\u001bÚ!ô³ùL\u0084Ïmì±7Êã \u0082q/\u009e\u001d¹S@´ì\u0083ª_Õ5S¶í¢$Á\u0001[h\u001e>\u0094Ã\u0007\u009bê¼sq\u009a=1Á`ÛQ¥\u0095\u0092\u0084\u0094q9ù\u0090 \u0005¢$äÄ,\u0089uÏ4{9ÄOËü\u0011s_¡e\u009d\u008f)\u0016¬\u0084D8¤\u001c¦\u0086ú\u0012î¹aé\u008e1xaÖæ9n°-¸\u00187d\u000eðø|±\u007fV2\u0007[\u008e¶±ò\u0010\u000eq\náÏ\u0095Ú(¼¶î8àdù\u000eí\"p|]ì\u0081«IÌ.G(\u0093Bìb¨LwêÑ\u009c·BÆÐã\u008b\u0080\u0083&èXÍ\u000bÿ+o\u0017q»;\u0091\u0080j,xeç\u0084\u001dç¥d?\nã\u0007»\u000f_á\u0093Ì\u007f\u0015pßvup\u008d}\u009dÚDÃC°\u008e\u0014¤9[©Â\u0016Â%ä×\u0092\u008bþ!\u00115rä2î\u0005;²ù\"_\u0006ý\u008eÍ\u0010^ª%Ê\u0002úªl~U\u009f\u009d\u001c9Fn-âøÌ\u0005\u0001ò³\u0089ÓFC\u0011JÐî¦kðYÓßã\u008d\u0010Ûk¶C\u009fÙ\u0080Ñg\u0097yÎ4c'ôZ¬÷HÐð\u009c\u0084t\u0007ô\u00adÛðü1Ìò©Kt\u009cu\u008c dg\u0099÷\u0016Û\u0019à´\u0096í²Ì,ðÔ\u0012\u008d\u0005h\u007fçùLäÈcC Nº<ÃÈ.²T\u008e:\u0094Ü\u001doå\u009a#QV;ëE\u0019\u008e\u000213øR\u0019¥-³*ì\u0010\u000b+Ex+\u000f\\\u008cê\u0098]wÌb\u0013SKéwë8v=R©\n\u009d2A$\r\u00925ý\u0090þ\u0086. \u001c{}Ê³ø\u0012`[ÁBs\u0005U-¬åoïí\u0096>\u008b0\u0011\u0006\u001c\"\f,Ò\u00905¼¶¢Ö!¦ïº\u0005þ\u0006\b£{ö±j}uÊê\u0011:\u0006´r\u0003ªÍ'¤é\u001fÐ\u000bÜ\u0099èÑlÐ\u0089[±HØKvuïcãW\u001c6e\u0013/\u009eH\u0083ñaÖ\u007fF®Í;\u0018Mì\u00ad\u0099x\\v:\u0086ÌÐ}\tpSåä\u0015¿8h\u0086\u0006´íbM¶J\u0011°\u0088X\u0092L\u0093cT\u0094f|\u008eâåyO¤\u0016B;\u0087éY\u001e±$\u0086ðV\u0081Ï\u001c \u0003\u0013\u0089Ýù£\u0001\u0007ÈÓsV\u009b\"#,NÜi\u0081 @9Eþ\u0013-Ò\u000e¨\u0086¿\u0019\u000f³\u0010ã\u0012-S\u0084Oì\"ó¼ÙcD\nzlã\u0001\u0004Gø-óÆ\u000el\u008dï\u001f\r\u0083|½\u0092Ù\u008f[ÕM\n¤:ðoaöÐ=\u007fõ\u0005%Ù\u001e5\u009a%Å\u008b\u0097g¸'\u001a¤\u0080\u0083Ñ\u008c\u008aé\u0005*KËÌGÉø)IS±¯§\u0019G\u000bN2¤hÜÁ\u0016Iô¼Ó\u000bþt?=kDH\u0019\u0092Wª\u001d¼¡S2\u008c\t\u009ax-C\u0083ö\u0085nÿrFÑ³NáHC2\u0094\r×¶z1\n7²èÝ\u008eQûÒ\u0019½èòÖ}açó\u0088\u000fðlÛò4¯=G§e\u008a\u0091ÉµÍ\u000bÏ'P\u001a¡\u001c\u0015z¯\u008d8;gK\u00adÛ\u00ad\u008e Ó1l²#}P\u0098\"Ú`\u0093ìùom\u0015bM\u001då\u0086\u0094\u0019¶åsÆ{jÜ´|^\u009ai'\u0081U\u0011cBÓiK\u000fê|\u0007\u00193\u0010\u009aå)dgO\u008c\u001cs\tá\u0001ò£\u009fÃ\u000bé\u009e";
      int var4 = "Æ½÷z¸>\u0082GCÖ\u000fÔ¾\u000fA\u00069Ñu\u001cÕi2Îº:&ÃùõÛÍ!Ý.\u0012\u0003Ù\u000f\u0097\u0002\u0091ð°Ì¢\u0018\nÉ¨9Ô_\u0011µ\u0097X$\"\u0095eËÐd \u0006w\u000b\u0097Öç\u0012\"ÎJüØ\u0004o\u0007<c:Å%V\u0087\u0010»¸óX\u0011Äpv\t¤«|º5ö>5rÔÇ}«Ì\u000f\u001b?×¬Âð\u001cVäøihyËc.·\u0003`kEò¦'|Ð\u0005Ç\u0095ø{+ùÃoí\u0091åÑ\u0099°¢\u001a¢¶\u0011\bêFFªÓ~\u0006i@Tå4ßz\u00987ßöð¶\u0014ûõ9JC oß\u0006½Kc¯>\u009c\u0081Jùï¾£\u0012\u0085íl¥Á\u0086ùà\f+Ì\u0086\u0003_ú\fÏÑyIGÍ\u0082ý?,\u0005«8\n\u0012\u009f\u00ad<;.D_oH\u009eç¨ÙG6\u009fa{>\u001apÊé\u0001^3F\u009e¸:q\u0083.ÑÞÃÄ\u009d8´\u007fm\u009c\u0006÷z\u0019A4÷\bù\u0004ÛÕ\u0012\u0084@\u001e\n×Õ\u001aØíëÝ v\t üt»¨\u000fí\u009eu&\u0014\b\"86VSÙQw&\u0094&\u008eC\u0090LoÍ}\r.ÿ\u0000\u0003§\u001bçDÄhì$\\\u0093V\u008e¥çó%ªC+\u007f¼\u0099aÄL\u001e\u0014>\u0097ÛX\u0087\u000e\u0089?D\u00988ëm\u008dÚo¿øÀ0\u0098Øú\u000bØ\u0015\u00827Õ\u0085òÅmï©hÖ\u0007\u0015ÎD-\u009bÇ\u0015¾A\u008aöîøëÙ\u009c\u0090D¥\u0097£Tð:^÷Ú\u000e¥[6ÔmòþK%íÝ(é\u0093\\=Q'¢\u0007ød$U´\u0006Ý\u009aÅH\u0089\u00191C/dÙ\u008cåè\u009c#ÀùéO\u0007aAã¦Õ÷ \r\u0085\u0016e9Qæ8ô\u001fªnâ\u008d\n\u0093Í½7\u001eÅY_¢\u00ad\u0013¾7\u0018hª.Ï\"O=¬\u009c9¬ª\n*:´\u0017W]'\u0085\u00ad\u0001ÆÊ¯ô`Å_äI\u008c\u0089\rÙº\u0081ö¨7\u0083K7\bPtaýã§=æë¤F\u008f·º¤+Ö\u0019ÍÈ7°Å\u008c_2\u0092\u00ady#\u001féÍE\u007f¢\u008brP¯s\u001eEUËbcÞR-ê\b\u0090\f{\u0000Xù\u0090\f\t¡\u0088ß\u009fRÐÐ\u0085\u009b\u001b\u001b×û\u000fÆ±(ëëH\u0005íÞ¦íÅX¸Jt/\u0006\u0000q#¹(\u001aDÞ X\u0086\u009e\u000f\"\u0091²AjQ$á²ízDò\u001b\u0090´#ñ{\füOý¦En>\u009bÖ\u008e\u0096T\u0015IÊ\u0084¨\u0003\u009f\u0089ÜëOû²tl\u0013\u009c\u0019Ç@\u0010X\u0010Ñ\u0081÷\u001e·r\u0085¤Ç9m\u001b¶Ùw£\u0010:mÃâ\u0017\u0093°\u009c\u0011ù¨×Ú@ú\u0090\u0005<\u0092\u0019&C\n·'Gfß\u0004\\¬\u009d!\b`V\u0017¨ù>Ca\u0007\u000fó\u009dôüm\u001b\f\u008c*^ËbZÖ¬Bíì¬)8\u0098ar\u009a;8\u0014È\u009aXAGPÈ\u0015\u001c(Æ\u0085eî·\u0017í\u001d\u0085¸\u0011\u0006ÈÀ\u0099a³üûD<?\u0087\u0011|!gÖCx#|.\u009eäèñ\u0007eÚ\u008c\f\u001c«Lû \\\u009elaúò»\f\u0087\u001f-Í\\?\u0011\u0000µzû\n\u0006÷V\u009cG¢\u009d$0(\u0003\u0004ø\u009f\u008e\u000f#×íjLØ\u0099J\"h`ní\u000bf\u0019\n$\"\u001eÐb|¥C|J·\u0018'\u008am¶þµ¥4j2\u0006~¥\u008bü\u0016¡7\u008d¤I\bÑ_#±vh\u008f^ýçñ\u0004Ìi&÷Ñ\u0081õ®Êá«Õmh¦ú\u009dT\u0089\u0011 ÊBÉ¹¬\tª!\u0001\u0017\u0091\u009a\u0088ò\u0089\u0005$üú\u000b=\u0006\u00ad+:\r\u0014´\u000b\u0016Â\u0083çè\u0012\u0087\u0007m!Ç\u0003\u0085í<\u0013«>¸î_\u008a¾\u008aGåi\u0080áÛòxohò\tj@¤\u0017\u0016\u001exb\u0097\u000e\t\u0091ï±<\u0081\u007f¡\u0010b\u0016Ô9\n\u000bÆÕ\n4cë|L\u0099\u008d.Aéöñ\u008d¢èAûÏbÀ\u0095\nJÝª«ç\u0006W¸ÅDlëÑ\u0005ç_ìð¼YîÀBÎ.ßF\u00030mø\u0000\u0011q\u008e)\u0019\u0087¨pØ\u0084n¢5uP×|\u0093¢B\u0007a\u001bs7\r\u0014ö\u0013L·\bú\u0096ûª:D´\u0097\u0007E\u001ch\u009c\u009c\u000e.\u0003\u0082#Ü\u0006ÕqNÞ38\r©\núÏöÚD¼\u0014à§þ¼\b:¦DEY ÁJ\f\u0018Y\u0013Ftu\u001f\u0018^2¬Y\bíÃ¾é\u0006µ*ø\b°\u001bÛ r/2C\b\u0017Ø \u009fA¯®È\rtìA\u0013\u0081AªÏö\u00805;0\u0005\u001e\u0097yüv\u0012Ã×d}Í\u008bÄ5\b\u0012\u0080\u001cÕ\u007f\u001d\u0094°µ\u0015\u0098\u008bÞÁOìä\u0099.¶Ûö\u0092(|\u0012@Ì¡º®\rîÈ\u0012\u0097ëÑçÝ`Ì){mX\u0093\u009a\t'¶e©\u0097É¹| \u000fã¤mg£gç\u0006Ö8¼à\\Y@\b³I©]DJ\u0005\u008cßÞ\n`ó\fóÿCgï\u0018@uN\u00077K¹HÎ\u0004\u001bMéÉ\u0011x\u0090\u0017ç÷þÛÉï\u0097ÖÆíðt:F§PY&w°'\u0010w\u0094K\u0007À»\u0082\u0090öa\u0084H\u009a \u008fÍ\u000fB\u0091\u0012¤\u0091§Î\u0013£º6\u0094¦g6\u0007\bS\u001d!\u0099nc\u0013Éåô\u0095Öå\u008fgaX\u00ad7y-á¦\r³¾\fà[ÁEÁ.¢\"Ã>5\u0082\tfO\u0002j\u0081úÈÎæ\u000b¸QÅ¤\u009aùC\u000e~ÅÒ\u000eRN\u0085G\u0019Ë¹\u009e\u0092·kamA0\u0017©,¶Dap½ñá\u0014¶Î\u0000ü\u0005\u000b`S\u0081}ù3\u0081-lÏPN\u001bØcy\u000f^bÛØ\u000f#zv*Ñò´$\u0096\u0005\u0094ìì\tÿ\u0014¾\u0000\u0018\u008eªòÏ¹YT¿ïðk\u001f|³Í\nË\t\u000e¼¬\u001bÚ!ô³ùL\u0084Ïmì±7Êã \u0082q/\u009e\u001d¹S@´ì\u0083ª_Õ5S¶í¢$Á\u0001[h\u001e>\u0094Ã\u0007\u009bê¼sq\u009a=1Á`ÛQ¥\u0095\u0092\u0084\u0094q9ù\u0090 \u0005¢$äÄ,\u0089uÏ4{9ÄOËü\u0011s_¡e\u009d\u008f)\u0016¬\u0084D8¤\u001c¦\u0086ú\u0012î¹aé\u008e1xaÖæ9n°-¸\u00187d\u000eðø|±\u007fV2\u0007[\u008e¶±ò\u0010\u000eq\náÏ\u0095Ú(¼¶î8àdù\u000eí\"p|]ì\u0081«IÌ.G(\u0093Bìb¨LwêÑ\u009c·BÆÐã\u008b\u0080\u0083&èXÍ\u000bÿ+o\u0017q»;\u0091\u0080j,xeç\u0084\u001dç¥d?\nã\u0007»\u000f_á\u0093Ì\u007f\u0015pßvup\u008d}\u009dÚDÃC°\u008e\u0014¤9[©Â\u0016Â%ä×\u0092\u008bþ!\u00115rä2î\u0005;²ù\"_\u0006ý\u008eÍ\u0010^ª%Ê\u0002úªl~U\u009f\u009d\u001c9Fn-âøÌ\u0005\u0001ò³\u0089ÓFC\u0011JÐî¦kðYÓßã\u008d\u0010Ûk¶C\u009fÙ\u0080Ñg\u0097yÎ4c'ôZ¬÷HÐð\u009c\u0084t\u0007ô\u00adÛðü1Ìò©Kt\u009cu\u008c dg\u0099÷\u0016Û\u0019à´\u0096í²Ì,ðÔ\u0012\u008d\u0005h\u007fçùLäÈcC Nº<ÃÈ.²T\u008e:\u0094Ü\u001doå\u009a#QV;ëE\u0019\u008e\u000213øR\u0019¥-³*ì\u0010\u000b+Ex+\u000f\\\u008cê\u0098]wÌb\u0013SKéwë8v=R©\n\u009d2A$\r\u00925ý\u0090þ\u0086. \u001c{}Ê³ø\u0012`[ÁBs\u0005U-¬åoïí\u0096>\u008b0\u0011\u0006\u001c\"\f,Ò\u00905¼¶¢Ö!¦ïº\u0005þ\u0006\b£{ö±j}uÊê\u0011:\u0006´r\u0003ªÍ'¤é\u001fÐ\u000bÜ\u0099èÑlÐ\u0089[±HØKvuïcãW\u001c6e\u0013/\u009eH\u0083ñaÖ\u007fF®Í;\u0018Mì\u00ad\u0099x\\v:\u0086ÌÐ}\tpSåä\u0015¿8h\u0086\u0006´íbM¶J\u0011°\u0088X\u0092L\u0093cT\u0094f|\u008eâåyO¤\u0016B;\u0087éY\u001e±$\u0086ðV\u0081Ï\u001c \u0003\u0013\u0089Ýù£\u0001\u0007ÈÓsV\u009b\"#,NÜi\u0081 @9Eþ\u0013-Ò\u000e¨\u0086¿\u0019\u000f³\u0010ã\u0012-S\u0084Oì\"ó¼ÙcD\nzlã\u0001\u0004Gø-óÆ\u000el\u008dï\u001f\r\u0083|½\u0092Ù\u008f[ÕM\n¤:ðoaöÐ=\u007fõ\u0005%Ù\u001e5\u009a%Å\u008b\u0097g¸'\u001a¤\u0080\u0083Ñ\u008c\u008aé\u0005*KËÌGÉø)IS±¯§\u0019G\u000bN2¤hÜÁ\u0016Iô¼Ó\u000bþt?=kDH\u0019\u0092Wª\u001d¼¡S2\u008c\t\u009ax-C\u0083ö\u0085nÿrFÑ³NáHC2\u0094\r×¶z1\n7²èÝ\u008eQûÒ\u0019½èòÖ}açó\u0088\u000fðlÛò4¯=G§e\u008a\u0091ÉµÍ\u000bÏ'P\u001a¡\u001c\u0015z¯\u008d8;gK\u00adÛ\u00ad\u008e Ó1l²#}P\u0098\"Ú`\u0093ìùom\u0015bM\u001då\u0086\u0094\u0019¶åsÆ{jÜ´|^\u009ai'\u0081U\u0011cBÓiK\u000fê|\u0007\u00193\u0010\u009aå)dgO\u008c\u001cs\tá\u0001ò£\u009fÃ\u000bé\u009e"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 86;
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
                     case 0 -> 55;
                     case 1 -> 67;
                     case 2 -> 72;
                     case 3 -> 86;
                     case 4 -> 72;
                     case 5 -> 126;
                     default -> 44;
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
                     j = var5;
                     k = new String[113];
                     IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII = new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII();
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

                  var2 = "oý\u0093¹¶\u000e\u0097k\u000fe\u0082ÿJù\u0000¶78;L";
                  var4 = "oý\u0093¹¶\u000e\u0097k\u000fe\u0082ÿJù\u0000¶78;L".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 13;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ 31092) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 189;
            case 1 -> 161;
            case 2 -> 218;
            case 3 -> 229;
            case 4 -> 195;
            case 5 -> 103;
            case 6 -> 85;
            case 7 -> 112;
            case 8 -> 215;
            case 9 -> 60;
            case 10 -> 180;
            case 11 -> 128;
            case 12 -> 80;
            case 13 -> 242;
            case 14 -> 238;
            case 15 -> 188;
            case 16 -> 38;
            case 17 -> 159;
            case 18 -> 121;
            case 19 -> 143;
            case 20 -> 27;
            case 21 -> 93;
            case 22 -> 212;
            case 23 -> 105;
            case 24 -> 155;
            case 25 -> 108;
            case 26 -> 133;
            case 27 -> 126;
            case 28 -> 226;
            case 29 -> 44;
            case 30 -> 171;
            case 31 -> 147;
            case 32 -> 16;
            case 33 -> 19;
            case 34 -> 250;
            case 35 -> 231;
            case 36 -> 125;
            case 37 -> 68;
            case 38 -> 87;
            case 39 -> 220;
            case 40 -> 0;
            case 41 -> 43;
            case 42 -> 187;
            case 43 -> 233;
            case 44 -> 23;
            case 45 -> 199;
            case 46 -> 158;
            case 47 -> 99;
            case 48 -> 162;
            case 49 -> 244;
            case 50 -> 110;
            case 51 -> 117;
            case 52 -> 101;
            case 53 -> 30;
            case 54 -> 191;
            case 55 -> 140;
            case 56 -> 144;
            case 57 -> 194;
            case 58 -> 61;
            case 59 -> 131;
            case 60 -> 151;
            case 61 -> 209;
            case 62 -> 31;
            case 63 -> 179;
            case 64 -> 25;
            case 65 -> 224;
            case 66 -> 201;
            case 67 -> 35;
            case 68 -> 167;
            case 69 -> 124;
            case 70 -> 132;
            case 71 -> 176;
            case 72 -> 77;
            case 73 -> 182;
            case 74 -> 41;
            case 75 -> 71;
            case 76 -> 21;
            case 77 -> 173;
            case 78 -> 202;
            case 79 -> 156;
            case 80 -> 253;
            case 81 -> 234;
            case 82 -> 116;
            case 83 -> 208;
            case 84 -> 70;
            case 85 -> 51;
            case 86 -> 142;
            case 87 -> 22;
            case 88 -> 84;
            case 89 -> 122;
            case 90 -> 157;
            case 91 -> 73;
            case 92 -> 166;
            case 93 -> 37;
            case 94 -> 46;
            case 95 -> 186;
            case 96 -> 243;
            case 97 -> 181;
            case 98 -> 115;
            case 99 -> 255;
            case 100 -> 56;
            case 101 -> 207;
            case 102 -> 28;
            case 103 -> 64;
            case 104 -> 148;
            case 105 -> 120;
            case 106 -> 48;
            case 107 -> 236;
            case 108 -> 127;
            case 109 -> 134;
            case 110 -> 154;
            case 111 -> 164;
            case 112 -> 114;
            case 113 -> 183;
            case 114 -> 90;
            case 115 -> 190;
            case 116 -> 192;
            case 117 -> 196;
            case 118 -> 165;
            case 119 -> 205;
            case 120 -> 193;
            case 121 -> 6;
            case 122 -> 20;
            case 123 -> 55;
            case 124 -> 222;
            case 125 -> 9;
            case 126 -> 184;
            case 127 -> 150;
            case 128 -> 18;
            case 129 -> 40;
            case 130 -> 59;
            case 131 -> 33;
            case 132 -> 2;
            case 133 -> 136;
            case 134 -> 153;
            case 135 -> 3;
            case 136 -> 248;
            case 137 -> 221;
            case 138 -> 241;
            case 139 -> 175;
            case 140 -> 10;
            case 141 -> 97;
            case 142 -> 66;
            case 143 -> 91;
            case 144 -> 217;
            case 145 -> 89;
            case 146 -> 232;
            case 147 -> 45;
            case 148 -> 32;
            case 149 -> 107;
            case 150 -> 14;
            case 151 -> 152;
            case 152 -> 146;
            case 153 -> 141;
            case 154 -> 88;
            case 155 -> 240;
            case 156 -> 168;
            case 157 -> 137;
            case 158 -> 69;
            case 159 -> 74;
            case 160 -> 104;
            case 161 -> 203;
            case 162 -> 149;
            case 163 -> 50;
            case 164 -> 62;
            case 165 -> 54;
            case 166 -> 237;
            case 167 -> 206;
            case 168 -> 58;
            case 169 -> 100;
            case 170 -> 204;
            case 171 -> 15;
            case 172 -> 129;
            case 173 -> 36;
            case 174 -> 86;
            case 175 -> 67;
            case 176 -> 139;
            case 177 -> 119;
            case 178 -> 198;
            case 179 -> 225;
            case 180 -> 251;
            case 181 -> 170;
            case 182 -> 1;
            case 183 -> 185;
            case 184 -> 52;
            case 185 -> 213;
            case 186 -> 169;
            case 187 -> 12;
            case 188 -> 254;
            case 189 -> 95;
            case 190 -> 123;
            case 191 -> 24;
            case 192 -> 106;
            case 193 -> 96;
            case 194 -> 223;
            case 195 -> 94;
            case 196 -> 239;
            case 197 -> 174;
            case 198 -> 235;
            case 199 -> 42;
            case 200 -> 76;
            case 201 -> 200;
            case 202 -> 17;
            case 203 -> 249;
            case 204 -> 29;
            case 205 -> 216;
            case 206 -> 160;
            case 207 -> 4;
            case 208 -> 79;
            case 209 -> 135;
            case 210 -> 109;
            case 211 -> 178;
            case 212 -> 5;
            case 213 -> 245;
            case 214 -> 8;
            case 215 -> 13;
            case 216 -> 78;
            case 217 -> 26;
            case 218 -> 246;
            case 219 -> 210;
            case 220 -> 163;
            case 221 -> 92;
            case 222 -> 113;
            case 223 -> 227;
            case 224 -> 57;
            case 225 -> 211;
            case 226 -> 65;
            case 227 -> 82;
            case 228 -> 230;
            case 229 -> 53;
            case 230 -> 214;
            case 231 -> 75;
            case 232 -> 11;
            case 233 -> 219;
            case 234 -> 177;
            case 235 -> 138;
            case 236 -> 102;
            case 237 -> 49;
            case 238 -> 130;
            case 239 -> 7;
            case 240 -> 252;
            case 241 -> 172;
            case 242 -> 34;
            case 243 -> 83;
            case 244 -> 63;
            case 245 -> 247;
            case 246 -> 118;
            case 247 -> 197;
            case 248 -> 228;
            case 249 -> 145;
            case 250 -> 81;
            case 251 -> 72;
            case 252 -> 98;
            case 253 -> 47;
            case 254 -> 39;
            default -> 111;
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

         k[var2] = new String(var3).intern();
      }

      return k[var2];
   }

   private static final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {

      // PX-FIX phaseA S1c: synthetic default-argument wrapper restored from jar bytecode (name/descriptor exact)
      public static me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI arg0, java.lang.Integer arg1, java.lang.Boolean arg2, long arg3, boolean arg4, boolean arg5, int arg6, Object arg7) {
         if ((arg6 & 1) != 0) arg1 = arg0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((arg6 & 2) != 0) arg2 = arg0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((arg6 & 4) != 0) arg3 = arg0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((arg6 & 8) != 0) arg4 = arg0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if ((arg6 & 16) != 0) arg5 = arg0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         return arg0.a(arg1, arg2, arg3, arg4, arg5);
      }

      @Nullable
      private final Integer IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final Boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
         @Nullable Integer var1, @Nullable Boolean var2, long var3, boolean var5, boolean var6
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var6;
      }

      @Nullable
      public final Integer a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final Boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final Integer f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final Boolean g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(
         @Nullable Integer var1, @Nullable Boolean var2, long var3, boolean var5, boolean var6
      ) {
         return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            var1, var2, var3, var5, var6
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -17947;
         boolean var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         long var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Boolean var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         Integer var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 5807;
         short var10002 = -17948;
         short var10003 = 8584;
         short var10004 = -17945;
         short var10005 = 2488;
         short var10006 = -17946;
         short var10007 = 142;
         short var10008 = -17951;
         short var10009 = -5503;
         return "GoldenFishProgress(entityId="
            + var6
            + ", entityAlive="
            + var5
            + ", lastActivity="
            + var3
            + ", startedRotation="
            + var2
            + ", casted="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var6;
         label25: {
            var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
            Integer var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 != null) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
                  var6 = 0;
                  break label25;
               }

               var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            var6 = var10000.hashCode();
         }

         int var8;
         label19: {
            int var2 = var6;
            var6 = var2 * 31;
            Boolean var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var8 = 0;
                  break label19;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var8 = var10001.hashCode();
         }

         int var3 = var6 + var8;
         var3 = var3 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var3 = var3 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         return var3 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3 = (lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if ((var4 == 0)) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        - var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (var2 != null) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         }

         byte var10001 = ((byte)((var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0));
         if (var2 != null) {
            if (var4 !=( (!var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0)) {
               return false;
            }

            var4 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
            if (var2 == null) {
               return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }

            var10001 = ((byte)((var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0));
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "<Ø=\u008aþ.ÊÊ\u0006\fúK\u0093¨GYÞæ3]¿Ó\u009f\u008d¹ßü<\u000e?áR\u0001*\u0013Q\u009a3\u0010\u0011Hú\u0016\u000fF²tdÁLþÕ`¥÷DË/{";
         int var4 = "<Ø=\u008aþ.ÊÊ\u0006\fúK\u0093¨GYÞæ3]¿Ó\u009f\u008d¹ßü<\u000e?áR\u0001*\u0013Q\u009a3\u0010\u0011Hú\u0016\u000fF²tdÁLþÕ`¥÷DË/{".length();
         char var1 = 28;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 40;
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
                        case 0 -> 11;
                        case 1 -> 32;
                        case 2 -> 53;
                        case 3 -> 94;
                        case 4 -> 86;
                        case 5 -> 31;
                        default -> 125;
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

                     var2 = "çv}Ë,*\u0004û\u009e¿\u0001d\u0018ºÀBi¢\t\u0014Ú\u0013Ká\u008bü\bë";
                     var4 = "çv}Ë,*\u0004û\u009e¿\u0001d\u0018ºÀBi¢\t\u0014Ú\u0013Ká\u008bü\bë".length();
                     var1 = 18;
                     var8 = -1;
               }

               var10000 = 99;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -17947) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 98;
               case 1 -> 146;
               case 2 -> 151;
               case 3 -> 132;
               case 4 -> 177;
               case 5 -> 164;
               case 6 -> 38;
               case 7 -> 19;
               case 8 -> 112;
               case 9 -> 17;
               case 10 -> 219;
               case 11 -> 152;
               case 12 -> 59;
               case 13 -> 20;
               case 14 -> 91;
               case 15 -> 137;
               case 16 -> 247;
               case 17 -> 55;
               case 18 -> 58;
               case 19 -> 202;
               case 20 -> 185;
               case 21 -> 74;
               case 22 -> 255;
               case 23 -> 200;
               case 24 -> 154;
               case 25 -> 53;
               case 26 -> 43;
               case 27 -> 124;
               case 28 -> 88;
               case 29 -> 237;
               case 30 -> 76;
               case 31 -> 87;
               case 32 -> 191;
               case 33 -> 208;
               case 34 -> 172;
               case 35 -> 186;
               case 36 -> 45;
               case 37 -> 118;
               case 38 -> 135;
               case 39 -> 30;
               case 40 -> 158;
               case 41 -> 157;
               case 42 -> 18;
               case 43 -> 67;
               case 44 -> 10;
               case 45 -> 236;
               case 46 -> 27;
               case 47 -> 64;
               case 48 -> 136;
               case 49 -> 233;
               case 50 -> 254;
               case 51 -> 2;
               case 52 -> 226;
               case 53 -> 232;
               case 54 -> 110;
               case 55 -> 89;
               case 56 -> 75;
               case 57 -> 221;
               case 58 -> 207;
               case 59 -> 162;
               case 60 -> 125;
               case 61 -> 228;
               case 62 -> 62;
               case 63 -> 189;
               case 64 -> 81;
               case 65 -> 116;
               case 66 -> 142;
               case 67 -> 163;
               case 68 -> 108;
               case 69 -> 127;
               case 70 -> 69;
               case 71 -> 182;
               case 72 -> 212;
               case 73 -> 205;
               case 74 -> 230;
               case 75 -> 184;
               case 76 -> 66;
               case 77 -> 34;
               case 78 -> 216;
               case 79 -> 203;
               case 80 -> 82;
               case 81 -> 104;
               case 82 -> 107;
               case 83 -> 201;
               case 84 -> 139;
               case 85 -> 239;
               case 86 -> 97;
               case 87 -> 131;
               case 88 -> 16;
               case 89 -> 79;
               case 90 -> 194;
               case 91 -> 199;
               case 92 -> 96;
               case 93 -> 129;
               case 94 -> 211;
               case 95 -> 150;
               case 96 -> 160;
               case 97 -> 234;
               case 98 -> 245;
               case 99 -> 42;
               case 100 -> 0;
               case 101 -> 111;
               case 102 -> 52;
               case 103 -> 7;
               case 104 -> 29;
               case 105 -> 78;
               case 106 -> 121;
               case 107 -> 1;
               case 108 -> 4;
               case 109 -> 167;
               case 110 -> 192;
               case 111 -> 120;
               case 112 -> 54;
               case 113 -> 122;
               case 114 -> 57;
               case 115 -> 101;
               case 116 -> 93;
               case 117 -> 198;
               case 118 -> 144;
               case 119 -> 12;
               case 120 -> 217;
               case 121 -> 138;
               case 122 -> 65;
               case 123 -> 109;
               case 124 -> 49;
               case 125 -> 6;
               case 126 -> 156;
               case 127 -> 113;
               case 128 -> 153;
               case 129 -> 94;
               case 130 -> 206;
               case 131 -> 168;
               case 132 -> 130;
               case 133 -> 218;
               case 134 -> 31;
               case 135 -> 210;
               case 136 -> 240;
               case 137 -> 249;
               case 138 -> 143;
               case 139 -> 231;
               case 140 -> 170;
               case 141 -> 123;
               case 142 -> 159;
               case 143 -> 235;
               case 144 -> 47;
               case 145 -> 128;
               case 146 -> 222;
               case 147 -> 173;
               case 148 -> 56;
               case 149 -> 37;
               case 150 -> 26;
               case 151 -> 244;
               case 152 -> 36;
               case 153 -> 40;
               case 154 -> 166;
               case 155 -> 225;
               case 156 -> 204;
               case 157 -> 51;
               case 158 -> 14;
               case 159 -> 33;
               case 160 -> 220;
               case 161 -> 95;
               case 162 -> 188;
               case 163 -> 61;
               case 164 -> 5;
               case 165 -> 41;
               case 166 -> 133;
               case 167 -> 90;
               case 168 -> 85;
               case 169 -> 13;
               case 170 -> 246;
               case 171 -> 77;
               case 172 -> 179;
               case 173 -> 196;
               case 174 -> 22;
               case 175 -> 140;
               case 176 -> 44;
               case 177 -> 73;
               case 178 -> 28;
               case 179 -> 117;
               case 180 -> 214;
               case 181 -> 175;
               case 182 -> 105;
               case 183 -> 70;
               case 184 -> 193;
               case 185 -> 187;
               case 186 -> 80;
               case 187 -> 183;
               case 188 -> 21;
               case 189 -> 103;
               case 190 -> 155;
               case 191 -> 100;
               case 192 -> 149;
               case 193 -> 48;
               case 194 -> 190;
               case 195 -> 8;
               case 196 -> 165;
               case 197 -> 115;
               case 198 -> 215;
               case 199 -> 181;
               case 200 -> 224;
               case 201 -> 145;
               case 202 -> 84;
               case 203 -> 50;
               case 204 -> 99;
               case 205 -> 92;
               case 206 -> 213;
               case 207 -> 176;
               case 208 -> 11;
               case 209 -> 238;
               case 210 -> 72;
               case 211 -> 161;
               case 212 -> 253;
               case 213 -> 126;
               case 214 -> 243;
               case 215 -> 32;
               case 216 -> 106;
               case 217 -> 250;
               case 218 -> 35;
               case 219 -> 141;
               case 220 -> 252;
               case 221 -> 46;
               case 222 -> 248;
               case 223 -> 174;
               case 224 -> 223;
               case 225 -> 134;
               case 226 -> 229;
               case 227 -> 24;
               case 228 -> 15;
               case 229 -> 3;
               case 230 -> 119;
               case 231 -> 23;
               case 232 -> 63;
               case 233 -> 197;
               case 234 -> 209;
               case 235 -> 171;
               case 236 -> 83;
               case 237 -> 178;
               case 238 -> 180;
               case 239 -> 169;
               case 240 -> 86;
               case 241 -> 60;
               case 242 -> 114;
               case 243 -> 39;
               case 244 -> 195;
               case 245 -> 102;
               case 246 -> 251;
               case 247 -> 71;
               case 248 -> 148;
               case 249 -> 25;
               case 250 -> 147;
               case 251 -> 9;
               case 252 -> 227;
               case 253 -> 242;
               case 254 -> 68;
               default -> 241;
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

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {

      // PX-FIX phaseA S1c: synthetic default-argument wrapper restored from jar bytecode (name/descriptor exact)
      public static me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll arg0, int arg1, java.lang.String arg2, java.lang.Integer arg3, boolean arg4, boolean arg5, me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll arg6, int arg7, Object arg8) {
         if ((arg7 & 1) != 0) arg1 = arg0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((arg7 & 2) != 0) arg2 = arg0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((arg7 & 4) != 0) arg3 = arg0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((arg7 & 8) != 0) arg4 = arg0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if ((arg7 & 16) != 0) arg5 = arg0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if ((arg7 & 32) != 0) arg6 = arg0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         return arg0.a(arg1, arg2, arg3, arg4, arg5, arg6);
      }

      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final Integer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private final me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         int var1,
         @Nullable String var2,
         @Nullable Integer var3,
         boolean var4,
         boolean var5,
         @NotNull me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6
      ) {
         short var10001 = -17593;
         short var10002 = -24621;
         Intrinsics.checkNotNullParameter(var6, "bot");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final int g() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String h() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer i() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean j() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean k() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll l() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         int var1,
         @Nullable String var2,
         @Nullable Integer var3,
         boolean var4,
         boolean var5,
         @NotNull me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6
      ) {
         short var10001 = -17595;
         short var10002 = 12715;
         Intrinsics.checkNotNullParameter(var6, "bot");
         return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3, var4, var5, var6
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -17598;
         me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         Integer var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -31637;
         short var10002 = -17600;
         short var10003 = -3368;
         short var10004 = -17599;
         short var10005 = 25794;
         short var10006 = -17597;
         short var10007 = -4349;
         short var10008 = -17596;
         short var10009 = 6132;
         short var10010 = -17594;
         short var10011 = -17898;
         return "CombatProgress(kills="
            + var6
            + ", targetName="
            + var5
            + ", trackedEntityId="
            + var4
            + ", pathfinding="
            + var3
            + ", walkerFinished="
            + var2
            + ", bot="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var7;
         int var9;
         label25: {
            String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
            int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var1 = var10000;
            var7 = var2 * 31;
            String var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var9 = 0;
                  break label25;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var9 = var10001.hashCode();
         }

         label19: {
            int var3 = var7 + var9;
            var7 = var3 * 31;
            Integer var10 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var9 = 0;
                  break label19;
               }

               var10 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var9 = var10.hashCode();
         }

         int var4 = var7 + var9;
         var4 = var4 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var4 = var4 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         return var4 * 31 + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         }

         label72: {
            byte var10001 = ((byte)((var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0));
            if (var2 != null) {
               if (var4 !=( (!var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0)) {
                  return false;
               }

               var4 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
               if (var2 == null) {
                  break label72;
               }

               var10001 = ((byte)((var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0));
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            )) ? 1 : 0);
         }

         if (var2 != null) {
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
         String[] var5 = new String[8];
         int var3 = 0;
         String var2 = "yyÁ\\\u0013cm¶\u008d%ÒÀ§°\u0093u\u009eWqÊà\u000exS~¼O\u0000g^=CþdN\u0000\r·V\u0083\u001cr\u001b\u0005Î2ê?ÿ¨\u0012f¿¹2&«ðMi\u008d8¢\u007fÈ\u0080¿\u008a9\u0006ò\u0011=úwR\u0003ù«Í";
         int var4 = "yyÁ\\\u0013cm¶\u008d%ÒÀ§°\u0093u\u009eWqÊà\u000exS~¼O\u0000g^=CþdN\u0000\r·V\u0083\u001cr\u001b\u0005Î2ê?ÿ¨\u0012f¿¹2&«ðMi\u008d8¢\u007fÈ\u0080¿\u008a9\u0006ò\u0011=úwR\u0003ù«Í"
            .length();
         char var1 = 21;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 24;
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
                        case 0 -> 109;
                        case 1 -> 102;
                        case 2 -> 30;
                        case 3 -> 68;
                        case 4 -> 82;
                        case 5 -> 33;
                        default -> 67;
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
                        b = new String[8];
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

                     var2 = "óÙÚ?ö¡\u009aÀ\u001b7Â\u0093è\u009eå\u00152\u0003Æ^ø";
                     var4 = "óÙÚ?ö¡\u009aÀ\u001b7Â\u0093è\u009eå\u00152\u0003Æ^ø".length();
                     var1 = 17;
                     var8 = -1;
               }

               var10000 = 101;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -17598) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 175;
               case 1 -> 134;
               case 2 -> 155;
               case 3 -> 113;
               case 4 -> 207;
               case 5 -> 76;
               case 6 -> 125;
               case 7 -> 58;
               case 8 -> 217;
               case 9 -> 142;
               case 10 -> 86;
               case 11 -> 224;
               case 12 -> 28;
               case 13 -> 226;
               case 14 -> 164;
               case 15 -> 81;
               case 16 -> 23;
               case 17 -> 190;
               case 18 -> 93;
               case 19 -> 131;
               case 20 -> 173;
               case 21 -> 15;
               case 22 -> 73;
               case 23 -> 52;
               case 24 -> 87;
               case 25 -> 160;
               case 26 -> 19;
               case 27 -> 133;
               case 28 -> 9;
               case 29 -> 249;
               case 30 -> 218;
               case 31 -> 32;
               case 32 -> 148;
               case 33 -> 60;
               case 34 -> 64;
               case 35 -> 30;
               case 36 -> 166;
               case 37 -> 158;
               case 38 -> 209;
               case 39 -> 179;
               case 40 -> 118;
               case 41 -> 129;
               case 42 -> 197;
               case 43 -> 127;
               case 44 -> 244;
               case 45 -> 144;
               case 46 -> 72;
               case 47 -> 100;
               case 48 -> 150;
               case 49 -> 251;
               case 50 -> 3;
               case 51 -> 75;
               case 52 -> 183;
               case 53 -> 115;
               case 54 -> 165;
               case 55 -> 152;
               case 56 -> 230;
               case 57 -> 96;
               case 58 -> 191;
               case 59 -> 62;
               case 60 -> 92;
               case 61 -> 167;
               case 62 -> 10;
               case 63 -> 11;
               case 64 -> 213;
               case 65 -> 188;
               case 66 -> 36;
               case 67 -> 65;
               case 68 -> 14;
               case 69 -> 69;
               case 70 -> 198;
               case 71 -> 74;
               case 72 -> 181;
               case 73 -> 202;
               case 74 -> 196;
               case 75 -> 149;
               case 76 -> 101;
               case 77 -> 66;
               case 78 -> 79;
               case 79 -> 31;
               case 80 -> 239;
               case 81 -> 6;
               case 82 -> 169;
               case 83 -> 8;
               case 84 -> 250;
               case 85 -> 41;
               case 86 -> 240;
               case 87 -> 126;
               case 88 -> 48;
               case 89 -> 245;
               case 90 -> 206;
               case 91 -> 24;
               case 92 -> 20;
               case 93 -> 203;
               case 94 -> 189;
               case 95 -> 238;
               case 96 -> 253;
               case 97 -> 35;
               case 98 -> 22;
               case 99 -> 141;
               case 100 -> 1;
               case 101 -> 44;
               case 102 -> 120;
               case 103 -> 225;
               case 104 -> 26;
               case 105 -> 21;
               case 106 -> 117;
               case 107 -> 89;
               case 108 -> 0;
               case 109 -> 56;
               case 110 -> 53;
               case 111 -> 147;
               case 112 -> 42;
               case 113 -> 138;
               case 114 -> 91;
               case 115 -> 232;
               case 116 -> 216;
               case 117 -> 83;
               case 118 -> 54;
               case 119 -> 248;
               case 120 -> 204;
               case 121 -> 231;
               case 122 -> 94;
               case 123 -> 108;
               case 124 -> 200;
               case 125 -> 80;
               case 126 -> 2;
               case 127 -> 45;
               case 128 -> 105;
               case 129 -> 63;
               case 130 -> 102;
               case 131 -> 182;
               case 132 -> 132;
               case 133 -> 47;
               case 134 -> 124;
               case 135 -> 107;
               case 136 -> 68;
               case 137 -> 85;
               case 138 -> 27;
               case 139 -> 139;
               case 140 -> 229;
               case 141 -> 233;
               case 142 -> 109;
               case 143 -> 177;
               case 144 -> 156;
               case 145 -> 162;
               case 146 -> 195;
               case 147 -> 38;
               case 148 -> 215;
               case 149 -> 208;
               case 150 -> 254;
               case 151 -> 178;
               case 152 -> 37;
               case 153 -> 40;
               case 154 -> 5;
               case 155 -> 252;
               case 156 -> 25;
               case 157 -> 49;
               case 158 -> 106;
               case 159 -> 39;
               case 160 -> 194;
               case 161 -> 201;
               case 162 -> 168;
               case 163 -> 143;
               case 164 -> 103;
               case 165 -> 222;
               case 166 -> 88;
               case 167 -> 121;
               case 168 -> 146;
               case 169 -> 210;
               case 170 -> 154;
               case 171 -> 95;
               case 172 -> 227;
               case 173 -> 17;
               case 174 -> 185;
               case 175 -> 128;
               case 176 -> 116;
               case 177 -> 221;
               case 178 -> 46;
               case 179 -> 77;
               case 180 -> 16;
               case 181 -> 170;
               case 182 -> 174;
               case 183 -> 98;
               case 184 -> 180;
               case 185 -> 163;
               case 186 -> 122;
               case 187 -> 235;
               case 188 -> 104;
               case 189 -> 50;
               case 190 -> 153;
               case 191 -> 243;
               case 192 -> 34;
               case 193 -> 136;
               case 194 -> 234;
               case 195 -> 192;
               case 196 -> 82;
               case 197 -> 90;
               case 198 -> 219;
               case 199 -> 57;
               case 200 -> 205;
               case 201 -> 145;
               case 202 -> 112;
               case 203 -> 99;
               case 204 -> 13;
               case 205 -> 97;
               case 206 -> 255;
               case 207 -> 236;
               case 208 -> 51;
               case 209 -> 242;
               case 210 -> 123;
               case 211 -> 157;
               case 212 -> 135;
               case 213 -> 187;
               case 214 -> 140;
               case 215 -> 186;
               case 216 -> 151;
               case 217 -> 247;
               case 218 -> 211;
               case 219 -> 61;
               case 220 -> 223;
               case 221 -> 193;
               case 222 -> 176;
               case 223 -> 78;
               case 224 -> 237;
               case 225 -> 111;
               case 226 -> 241;
               case 227 -> 214;
               case 228 -> 159;
               case 229 -> 172;
               case 230 -> 84;
               case 231 -> 114;
               case 232 -> 59;
               case 233 -> 4;
               case 234 -> 246;
               case 235 -> 212;
               case 236 -> 137;
               case 237 -> 7;
               case 238 -> 70;
               case 239 -> 119;
               case 240 -> 43;
               case 241 -> 18;
               case 242 -> 110;
               case 243 -> 199;
               case 244 -> 55;
               case 245 -> 33;
               case 246 -> 12;
               case 247 -> 71;
               case 248 -> 130;
               case 249 -> 67;
               case 250 -> 171;
               case 251 -> 29;
               case 252 -> 228;
               case 253 -> 220;
               case 254 -> 184;
               default -> 161;
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

   public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(Object... px) {
        }
      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
      }

      @NotNull
      public final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII a() {
         return lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII;
      }
   }

   private static final class IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI {

      // PX-FIX phaseA S1c: synthetic default-argument wrapper restored from jar bytecode (name/descriptor exact)
      public static me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a(me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI arg0, me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll arg1, java.lang.String arg2, java.lang.Integer arg3, int arg4, int arg5, Object arg6) {
         if ((arg5 & 1) != 0) arg1 = arg0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((arg5 & 2) != 0) arg2 = arg0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((arg5 & 4) != 0) arg3 = arg0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((arg5 & 8) != 0) arg4 = arg0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         return arg0.a(arg1, arg2, arg3, arg4);
      }

      @NotNull
      private final IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final Integer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         @NotNull IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1,
         @Nullable String var2,
         @Nullable Integer var3,
         int var4
      ) {
         short var10001 = -2202;
         short var10002 = 19414;
         Intrinsics.checkNotNullParameter(var1, "state");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      @NotNull
      public final IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a(
         @NotNull IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1,
         @Nullable String var2,
         @Nullable Integer var3,
         int var4
      ) {
         short var10001 = -2204;
         short var10002 = 17816;
         Intrinsics.checkNotNullParameter(var1, "state");
         return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -2203;
         int var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         Integer var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 6902;
         short var10002 = -2201;
         short var10003 = -11696;
         short var10004 = -2207;
         short var10005 = 28984;
         short var10006 = -2208;
         short var10007 = -12843;
         return "QuickCombatProgress(state=" + var4 + ", targetName=" + var3 + ", targetId=" + var2 + ", heldSlot=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var5;
         int var7;
         label25: {
            String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
            int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            var1 = var10000;
            var5 = var2 * 31;
            String var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var7 = 0;
                  break label25;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var7 = var10001.hashCode();
         }

         label19: {
            int var3 = var5 + var7;
            var5 = var3 * 31;
            Integer var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var7 = 0;
                  break label19;
               }

               var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var7 = var8.hashCode();
         }

         int var4 = var5 + var7;
         return var4 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var3 = (lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI)var10000;
         var10000 = this;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var10000 = this;
         }

         int var5 = ((Intrinsics.areEqual(
            ((lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI)var10000).lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         )) ? 1 : 0);
         if (var2 != null) {
            if (var5 == 0) {
               return false;
            }

            var5 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var5 == 0) {
               return false;
            }

            var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         if (var2 != null) {
            if (var5 != var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               return false;
            }

            var5 = 1;
         }

         return (var5 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "\u0017q£êÇ\u001a\u0010\u0002-²\u0011me«Ðé\n»¾lÌáJ9heMµI\u0005Kü\u0005>Ö\u0086\u001ec\rýe_£ø)h\u009a\u0016õb\rÆ";
         int var4 = "\u0017q£êÇ\u001a\u0010\u0002-²\u0011me«Ðé\n»¾lÌáJ9heMµI\u0005Kü\u0005>Ö\u0086\u001ec\rýe_£ø)h\u009a\u0016õb\rÆ".length();
         char var1 = 5;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 8;
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
                        case 0 -> 3;
                        case 1 -> 17;
                        case 2 -> 84;
                        case 3 -> 97;
                        case 4 -> 24;
                        case 5 -> 82;
                        default -> 36;
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
                        b = new String[6];
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

                     var2 = "k}¨\u009d¾Pr÷½o{\u000bR5\u0093\u0090XvEH\u008d\u0093\u009f";
                     var4 = "k}¨\u009d¾Pr÷½o{\u000bR5\u0093\u0090XvEH\u008d\u0093\u009f".length();
                     var1 = 11;
                     var8 = -1;
               }

               var10000 = 91;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -2204) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 160;
               case 1 -> 188;
               case 2 -> 211;
               case 3 -> 74;
               case 4 -> 205;
               case 5 -> 67;
               case 6 -> 195;
               case 7 -> 8;
               case 8 -> 100;
               case 9 -> 117;
               case 10 -> 18;
               case 11 -> 137;
               case 12 -> 71;
               case 13 -> 9;
               case 14 -> 196;
               case 15 -> 202;
               case 16 -> 48;
               case 17 -> 237;
               case 18 -> 148;
               case 19 -> 46;
               case 20 -> 153;
               case 21 -> 7;
               case 22 -> 252;
               case 23 -> 110;
               case 24 -> 140;
               case 25 -> 72;
               case 26 -> 180;
               case 27 -> 172;
               case 28 -> 41;
               case 29 -> 244;
               case 30 -> 152;
               case 31 -> 135;
               case 32 -> 15;
               case 33 -> 82;
               case 34 -> 65;
               case 35 -> 10;
               case 36 -> 210;
               case 37 -> 174;
               case 38 -> 130;
               case 39 -> 63;
               case 40 -> 245;
               case 41 -> 40;
               case 42 -> 161;
               case 43 -> 97;
               case 44 -> 70;
               case 45 -> 228;
               case 46 -> 246;
               case 47 -> 217;
               case 48 -> 190;
               case 49 -> 112;
               case 50 -> 227;
               case 51 -> 182;
               case 52 -> 159;
               case 53 -> 144;
               case 54 -> 145;
               case 55 -> 59;
               case 56 -> 122;
               case 57 -> 106;
               case 58 -> 171;
               case 59 -> 255;
               case 60 -> 139;
               case 61 -> 198;
               case 62 -> 0;
               case 63 -> 37;
               case 64 -> 3;
               case 65 -> 1;
               case 66 -> 128;
               case 67 -> 101;
               case 68 -> 123;
               case 69 -> 186;
               case 70 -> 229;
               case 71 -> 164;
               case 72 -> 230;
               case 73 -> 11;
               case 74 -> 143;
               case 75 -> 75;
               case 76 -> 21;
               case 77 -> 124;
               case 78 -> 162;
               case 79 -> 238;
               case 80 -> 16;
               case 81 -> 247;
               case 82 -> 80;
               case 83 -> 61;
               case 84 -> 136;
               case 85 -> 207;
               case 86 -> 102;
               case 87 -> 146;
               case 88 -> 58;
               case 89 -> 192;
               case 90 -> 240;
               case 91 -> 94;
               case 92 -> 178;
               case 93 -> 179;
               case 94 -> 226;
               case 95 -> 104;
               case 96 -> 89;
               case 97 -> 115;
               case 98 -> 99;
               case 99 -> 96;
               case 100 -> 213;
               case 101 -> 225;
               case 102 -> 175;
               case 103 -> 132;
               case 104 -> 173;
               case 105 -> 142;
               case 106 -> 107;
               case 107 -> 167;
               case 108 -> 168;
               case 109 -> 214;
               case 110 -> 183;
               case 111 -> 127;
               case 112 -> 29;
               case 113 -> 30;
               case 114 -> 154;
               case 115 -> 91;
               case 116 -> 223;
               case 117 -> 187;
               case 118 -> 250;
               case 119 -> 208;
               case 120 -> 20;
               case 121 -> 52;
               case 122 -> 111;
               case 123 -> 232;
               case 124 -> 165;
               case 125 -> 43;
               case 126 -> 103;
               case 127 -> 204;
               case 128 -> 12;
               case 129 -> 215;
               case 130 -> 68;
               case 131 -> 181;
               case 132 -> 177;
               case 133 -> 231;
               case 134 -> 251;
               case 135 -> 36;
               case 136 -> 134;
               case 137 -> 42;
               case 138 -> 54;
               case 139 -> 216;
               case 140 -> 79;
               case 141 -> 155;
               case 142 -> 56;
               case 143 -> 14;
               case 144 -> 23;
               case 145 -> 239;
               case 146 -> 220;
               case 147 -> 151;
               case 148 -> 212;
               case 149 -> 121;
               case 150 -> 169;
               case 151 -> 83;
               case 152 -> 87;
               case 153 -> 98;
               case 154 -> 47;
               case 155 -> 51;
               case 156 -> 158;
               case 157 -> 6;
               case 158 -> 45;
               case 159 -> 95;
               case 160 -> 13;
               case 161 -> 236;
               case 162 -> 176;
               case 163 -> 200;
               case 164 -> 199;
               case 165 -> 84;
               case 166 -> 222;
               case 167 -> 235;
               case 168 -> 27;
               case 169 -> 163;
               case 170 -> 150;
               case 171 -> 113;
               case 172 -> 201;
               case 173 -> 81;
               case 174 -> 133;
               case 175 -> 120;
               case 176 -> 60;
               case 177 -> 170;
               case 178 -> 193;
               case 179 -> 242;
               case 180 -> 243;
               case 181 -> 64;
               case 182 -> 38;
               case 183 -> 85;
               case 184 -> 88;
               case 185 -> 31;
               case 186 -> 189;
               case 187 -> 76;
               case 188 -> 157;
               case 189 -> 224;
               case 190 -> 221;
               case 191 -> 50;
               case 192 -> 126;
               case 193 -> 141;
               case 194 -> 77;
               case 195 -> 105;
               case 196 -> 184;
               case 197 -> 249;
               case 198 -> 131;
               case 199 -> 93;
               case 200 -> 26;
               case 201 -> 69;
               case 202 -> 92;
               case 203 -> 241;
               case 204 -> 218;
               case 205 -> 203;
               case 206 -> 234;
               case 207 -> 44;
               case 208 -> 116;
               case 209 -> 32;
               case 210 -> 49;
               case 211 -> 66;
               case 212 -> 28;
               case 213 -> 138;
               case 214 -> 233;
               case 215 -> 253;
               case 216 -> 22;
               case 217 -> 53;
               case 218 -> 25;
               case 219 -> 33;
               case 220 -> 129;
               case 221 -> 119;
               case 222 -> 194;
               case 223 -> 254;
               case 224 -> 156;
               case 225 -> 2;
               case 226 -> 108;
               case 227 -> 109;
               case 228 -> 24;
               case 229 -> 34;
               case 230 -> 19;
               case 231 -> 73;
               case 232 -> 149;
               case 233 -> 114;
               case 234 -> 197;
               case 235 -> 219;
               case 236 -> 35;
               case 237 -> 4;
               case 238 -> 147;
               case 239 -> 5;
               case 240 -> 248;
               case 241 -> 125;
               case 242 -> 55;
               case 243 -> 191;
               case 244 -> 39;
               case 245 -> 17;
               case 246 -> 118;
               case 247 -> 86;
               case 248 -> 78;
               case 249 -> 90;
               case 250 -> 206;
               case 251 -> 209;
               case 252 -> 185;
               case 253 -> 166;
               case 254 -> 62;
               default -> 57;
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

   private static final class IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll {

      // PX-FIX phaseA S1c: synthetic default-argument wrapper restored from jar bytecode (name/descriptor exact)
      public static me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll a(me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll arg0, int arg1, int arg2, boolean arg3, kotlin.Triple arg4, int arg5, Object arg6) {
         if ((arg5 & 1) != 0) arg1 = arg0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((arg5 & 2) != 0) arg2 = arg0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((arg5 & 4) != 0) arg3 = arg0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((arg5 & 8) != 0) arg4 = arg0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         return arg0.a(arg1, arg2, arg3, arg4);
      }

      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll(
         int var1, int var2, boolean var3, @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = -14214;
         short var10002 = 9568;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI =((Triple)( var4));
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll a(
         int var1, int var2, boolean var3, @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = -14210;
         short var10002 = 21234;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll(
            var1, var2, var3,((Triple)( var4
         )));
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -14209;
         Triple var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -685;
         short var10002 = -14213;
         short var10003 = -25754;
         short var10004 = -14216;
         short var10005 = -3082;
         short var10006 = -14215;
         short var10007 = -18317;
         return "RouteProgress(index=" + var4 + ", routeSize=" + var3 + ", walkerFinished=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var3 = (lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label56: {
            if (var2 != null) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
               if (var2 == null) {
                  break label56;
               }

               var10001 = ((var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (var2 != null) {
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
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "^ã`¹¾,0óÁ\fª÷:è\u0094ÔR\u0016\u00045ü4\u0011¯À\u009f\u0000\u009c\u0019irL¯4Bi\u001ap¬N\fþ[²~Óh,\fòf*é";
         int var4 = "^ã`¹¾,0óÁ\fª÷:è\u0094ÔR\u0016\u00045ü4\u0011¯À\u009f\u0000\u009c\u0019irL¯4Bi\u001ap¬N\fþ[²~Óh,\fòf*é".length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 100;
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
                        case 0 -> 99;
                        case 1 -> 5;
                        case 2 -> 48;
                        case 3 -> 21;
                        case 4 -> 116;
                        case 5 -> 117;
                        default -> 24;
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
                        b = new String[6];
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

                     var2 = "\u001c\u0006ª\u0087eiÉÙ|\u0014\u0016·\u0099ß\u0095ìõ\u000f\u0089'\u0000³\u0007¿3Øp\u0002\u0086\t";
                     var4 = "\u001c\u0006ª\u0087eiÉÙ|\u0014\u0016·\u0099ß\u0095ìõ\u000f\u0089'\u0000³\u0007¿3Øp\u0002\u0086\t".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 11;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -14214) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 80;
               case 1 -> 198;
               case 2 -> 187;
               case 3 -> 194;
               case 4 -> 236;
               case 5 -> 106;
               case 6 -> 226;
               case 7 -> 217;
               case 8 -> 210;
               case 9 -> 122;
               case 10 -> 59;
               case 11 -> 7;
               case 12 -> 192;
               case 13 -> 143;
               case 14 -> 116;
               case 15 -> 29;
               case 16 -> 81;
               case 17 -> 205;
               case 18 -> 177;
               case 19 -> 169;
               case 20 -> 221;
               case 21 -> 89;
               case 22 -> 248;
               case 23 -> 127;
               case 24 -> 171;
               case 25 -> 13;
               case 26 -> 94;
               case 27 -> 85;
               case 28 -> 149;
               case 29 -> 166;
               case 30 -> 58;
               case 31 -> 203;
               case 32 -> 170;
               case 33 -> 90;
               case 34 -> 206;
               case 35 -> 104;
               case 36 -> 22;
               case 37 -> 95;
               case 38 -> 109;
               case 39 -> 152;
               case 40 -> 244;
               case 41 -> 252;
               case 42 -> 242;
               case 43 -> 250;
               case 44 -> 0;
               case 45 -> 131;
               case 46 -> 51;
               case 47 -> 74;
               case 48 -> 60;
               case 49 -> 157;
               case 50 -> 117;
               case 51 -> 52;
               case 52 -> 128;
               case 53 -> 11;
               case 54 -> 56;
               case 55 -> 62;
               case 56 -> 237;
               case 57 -> 135;
               case 58 -> 234;
               case 59 -> 44;
               case 60 -> 235;
               case 61 -> 165;
               case 62 -> 254;
               case 63 -> 84;
               case 64 -> 225;
               case 65 -> 245;
               case 66 -> 227;
               case 67 -> 147;
               case 68 -> 5;
               case 69 -> 93;
               case 70 -> 219;
               case 71 -> 202;
               case 72 -> 212;
               case 73 -> 191;
               case 74 -> 172;
               case 75 -> 66;
               case 76 -> 255;
               case 77 -> 99;
               case 78 -> 8;
               case 79 -> 79;
               case 80 -> 193;
               case 81 -> 161;
               case 82 -> 50;
               case 83 -> 249;
               case 84 -> 126;
               case 85 -> 189;
               case 86 -> 204;
               case 87 -> 36;
               case 88 -> 45;
               case 89 -> 55;
               case 90 -> 53;
               case 91 -> 43;
               case 92 -> 132;
               case 93 -> 232;
               case 94 -> 23;
               case 95 -> 71;
               case 96 -> 78;
               case 97 -> 173;
               case 98 -> 223;
               case 99 -> 174;
               case 100 -> 125;
               case 101 -> 146;
               case 102 -> 32;
               case 103 -> 4;
               case 104 -> 115;
               case 105 -> 88;
               case 106 -> 70;
               case 107 -> 184;
               case 108 -> 16;
               case 109 -> 24;
               case 110 -> 167;
               case 111 -> 15;
               case 112 -> 61;
               case 113 -> 48;
               case 114 -> 97;
               case 115 -> 63;
               case 116 -> 238;
               case 117 -> 68;
               case 118 -> 121;
               case 119 -> 183;
               case 120 -> 190;
               case 121 -> 253;
               case 122 -> 164;
               case 123 -> 3;
               case 124 -> 38;
               case 125 -> 73;
               case 126 -> 39;
               case 127 -> 199;
               case 128 -> 28;
               case 129 -> 178;
               case 130 -> 6;
               case 131 -> 110;
               case 132 -> 37;
               case 133 -> 160;
               case 134 -> 228;
               case 135 -> 144;
               case 136 -> 139;
               case 137 -> 2;
               case 138 -> 197;
               case 139 -> 134;
               case 140 -> 18;
               case 141 -> 10;
               case 142 -> 231;
               case 143 -> 154;
               case 144 -> 247;
               case 145 -> 224;
               case 146 -> 207;
               case 147 -> 241;
               case 148 -> 176;
               case 149 -> 87;
               case 150 -> 163;
               case 151 -> 119;
               case 152 -> 141;
               case 153 -> 33;
               case 154 -> 156;
               case 155 -> 145;
               case 156 -> 137;
               case 157 -> 30;
               case 158 -> 186;
               case 159 -> 140;
               case 160 -> 181;
               case 161 -> 230;
               case 162 -> 25;
               case 163 -> 118;
               case 164 -> 103;
               case 165 -> 65;
               case 166 -> 75;
               case 167 -> 136;
               case 168 -> 114;
               case 169 -> 123;
               case 170 -> 222;
               case 171 -> 155;
               case 172 -> 151;
               case 173 -> 229;
               case 174 -> 214;
               case 175 -> 233;
               case 176 -> 83;
               case 177 -> 216;
               case 178 -> 133;
               case 179 -> 34;
               case 180 -> 76;
               case 181 -> 96;
               case 182 -> 98;
               case 183 -> 243;
               case 184 -> 64;
               case 185 -> 86;
               case 186 -> 47;
               case 187 -> 35;
               case 188 -> 130;
               case 189 -> 91;
               case 190 -> 102;
               case 191 -> 138;
               case 192 -> 108;
               case 193 -> 113;
               case 194 -> 209;
               case 195 -> 179;
               case 196 -> 185;
               case 197 -> 208;
               case 198 -> 142;
               case 199 -> 49;
               case 200 -> 40;
               case 201 -> 19;
               case 202 -> 57;
               case 203 -> 196;
               case 204 -> 246;
               case 205 -> 14;
               case 206 -> 12;
               case 207 -> 1;
               case 208 -> 168;
               case 209 -> 105;
               case 210 -> 92;
               case 211 -> 180;
               case 212 -> 239;
               case 213 -> 188;
               case 214 -> 46;
               case 215 -> 240;
               case 216 -> 101;
               case 217 -> 100;
               case 218 -> 77;
               case 219 -> 112;
               case 220 -> 213;
               case 221 -> 195;
               case 222 -> 215;
               case 223 -> 72;
               case 224 -> 42;
               case 225 -> 107;
               case 226 -> 26;
               case 227 -> 182;
               case 228 -> 54;
               case 229 -> 148;
               case 230 -> 211;
               case 231 -> 27;
               case 232 -> 124;
               case 233 -> 150;
               case 234 -> 129;
               case 235 -> 159;
               case 236 -> 9;
               case 237 -> 20;
               case 238 -> 67;
               case 239 -> 82;
               case 240 -> 220;
               case 241 -> 251;
               case 242 -> 162;
               case 243 -> 153;
               case 244 -> 201;
               case 245 -> 17;
               case 246 -> 41;
               case 247 -> 120;
               case 248 -> 21;
               case 249 -> 158;
               case 250 -> 31;
               case 251 -> 218;
               case 252 -> 175;
               case 253 -> 111;
               case 254 -> 200;
               default -> 69;
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {

      // PX-FIX phaseA S1c: synthetic default-argument wrapper restored from jar bytecode (name/descriptor exact)
      public static me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI arg0, int arg1, boolean arg2, boolean arg3, java.lang.Integer arg4, int arg5, Object arg6) {
         if ((arg5 & 1) != 0) arg1 = arg0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((arg5 & 2) != 0) arg2 = arg0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((arg5 & 4) != 0) arg3 = arg0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((arg5 & 8) != 0) arg4 = arg0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         return arg0.a(arg1, arg2, arg3, arg4);
      }

      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final Integer lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(int var1, boolean var2, boolean var3, @Nullable Integer var4) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Integer d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Integer h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1, boolean var2, boolean var3, @Nullable Integer var4
      ) {
         return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -30466;
         Integer var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 3161;
         short var10002 = -30468;
         short var10003 = 19911;
         short var10004 = -30465;
         short var10005 = -26212;
         short var10006 = -30467;
         short var10007 = -21189;
         return "CastProgress(heldSlot=" + var4 + ", lookingUp=" + var3 + ", rotating=" + var2 + ", bobberId=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var2 = var2 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         String var1 = var10000;
         var2 = var2 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         int var5 = var2 * 31;
         Integer var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
               return var5 + 0;
            }

            var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         return var5 + var10001.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
            var10001 = ((var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
         }

         label56: {
            if (var2 != null) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
               if (var2 == null) {
                  break label56;
               }

               var10001 = ((var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (var2 != null) {
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
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "£\u008f~Í\u008e§wÒ\u0097æ¸j´«£õ\u008b\tùá9þ\u000böÞW\u0095®ÇÈ¡\u0004E\u001b";
         int var4 = "£\u008f~Í\u008e§wÒ\u0097æ¸j´«£õ\u008b\tùá9þ\u000böÞW\u0095®ÇÈ¡\u0004E\u001b".length();
         char var1 = 22;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 8;
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
                        case 1 -> 75;
                        case 2 -> 25;
                        case 3 -> 101;
                        case 4 -> 38;
                        case 5 -> 51;
                        default -> 94;
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
                        b = new String[4];
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

                     var2 = "uºùÙ}\u0084\u0017E\u0088Ì/\u0097\u000bn©\u0094»\u0012ÁZÙ\u0082ñÈ";
                     var4 = "uºùÙ}\u0084\u0017E\u0088Ì/\u0097\u000bn©\u0094»\u0012ÁZÙ\u0082ñÈ".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 101;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -30466) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 214;
               case 1 -> 198;
               case 2 -> 153;
               case 3 -> 243;
               case 4 -> 120;
               case 5 -> 181;
               case 6 -> 170;
               case 7 -> 62;
               case 8 -> 199;
               case 9 -> 26;
               case 10 -> 191;
               case 11 -> 71;
               case 12 -> 51;
               case 13 -> 123;
               case 14 -> 142;
               case 15 -> 35;
               case 16 -> 70;
               case 17 -> 209;
               case 18 -> 133;
               case 19 -> 18;
               case 20 -> 24;
               case 21 -> 97;
               case 22 -> 59;
               case 23 -> 64;
               case 24 -> 196;
               case 25 -> 6;
               case 26 -> 11;
               case 27 -> 4;
               case 28 -> 139;
               case 29 -> 101;
               case 30 -> 77;
               case 31 -> 151;
               case 32 -> 238;
               case 33 -> 173;
               case 34 -> 116;
               case 35 -> 14;
               case 36 -> 68;
               case 37 -> 34;
               case 38 -> 98;
               case 39 -> 211;
               case 40 -> 140;
               case 41 -> 1;
               case 42 -> 158;
               case 43 -> 229;
               case 44 -> 217;
               case 45 -> 132;
               case 46 -> 143;
               case 47 -> 48;
               case 48 -> 208;
               case 49 -> 228;
               case 50 -> 152;
               case 51 -> 121;
               case 52 -> 21;
               case 53 -> 219;
               case 54 -> 27;
               case 55 -> 138;
               case 56 -> 49;
               case 57 -> 180;
               case 58 -> 141;
               case 59 -> 146;
               case 60 -> 212;
               case 61 -> 182;
               case 62 -> 179;
               case 63 -> 31;
               case 64 -> 3;
               case 65 -> 135;
               case 66 -> 39;
               case 67 -> 50;
               case 68 -> 189;
               case 69 -> 235;
               case 70 -> 161;
               case 71 -> 169;
               case 72 -> 81;
               case 73 -> 124;
               case 74 -> 252;
               case 75 -> 166;
               case 76 -> 234;
               case 77 -> 240;
               case 78 -> 86;
               case 79 -> 154;
               case 80 -> 155;
               case 81 -> 103;
               case 82 -> 210;
               case 83 -> 69;
               case 84 -> 175;
               case 85 -> 93;
               case 86 -> 232;
               case 87 -> 207;
               case 88 -> 165;
               case 89 -> 247;
               case 90 -> 174;
               case 91 -> 197;
               case 92 -> 253;
               case 93 -> 66;
               case 94 -> 85;
               case 95 -> 20;
               case 96 -> 32;
               case 97 -> 244;
               case 98 -> 54;
               case 99 -> 131;
               case 100 -> 160;
               case 101 -> 126;
               case 102 -> 10;
               case 103 -> 254;
               case 104 -> 28;
               case 105 -> 215;
               case 106 -> 162;
               case 107 -> 58;
               case 108 -> 111;
               case 109 -> 177;
               case 110 -> 224;
               case 111 -> 145;
               case 112 -> 29;
               case 113 -> 43;
               case 114 -> 230;
               case 115 -> 89;
               case 116 -> 200;
               case 117 -> 99;
               case 118 -> 202;
               case 119 -> 63;
               case 120 -> 255;
               case 121 -> 88;
               case 122 -> 128;
               case 123 -> 156;
               case 124 -> 100;
               case 125 -> 221;
               case 126 -> 106;
               case 127 -> 246;
               case 128 -> 157;
               case 129 -> 90;
               case 130 -> 206;
               case 131 -> 127;
               case 132 -> 74;
               case 133 -> 36;
               case 134 -> 172;
               case 135 -> 231;
               case 136 -> 136;
               case 137 -> 30;
               case 138 -> 250;
               case 139 -> 23;
               case 140 -> 105;
               case 141 -> 67;
               case 142 -> 201;
               case 143 -> 19;
               case 144 -> 7;
               case 145 -> 242;
               case 146 -> 213;
               case 147 -> 15;
               case 148 -> 17;
               case 149 -> 245;
               case 150 -> 134;
               case 151 -> 241;
               case 152 -> 218;
               case 153 -> 41;
               case 154 -> 91;
               case 155 -> 37;
               case 156 -> 237;
               case 157 -> 216;
               case 158 -> 144;
               case 159 -> 176;
               case 160 -> 79;
               case 161 -> 80;
               case 162 -> 107;
               case 163 -> 87;
               case 164 -> 72;
               case 165 -> 65;
               case 166 -> 122;
               case 167 -> 148;
               case 168 -> 8;
               case 169 -> 115;
               case 170 -> 149;
               case 171 -> 167;
               case 172 -> 22;
               case 173 -> 188;
               case 174 -> 57;
               case 175 -> 183;
               case 176 -> 184;
               case 177 -> 44;
               case 178 -> 195;
               case 179 -> 5;
               case 180 -> 52;
               case 181 -> 46;
               case 182 -> 203;
               case 183 -> 109;
               case 184 -> 223;
               case 185 -> 95;
               case 186 -> 53;
               case 187 -> 178;
               case 188 -> 117;
               case 189 -> 137;
               case 190 -> 112;
               case 191 -> 192;
               case 192 -> 92;
               case 193 -> 40;
               case 194 -> 163;
               case 195 -> 76;
               case 196 -> 159;
               case 197 -> 12;
               case 198 -> 25;
               case 199 -> 56;
               case 200 -> 164;
               case 201 -> 227;
               case 202 -> 251;
               case 203 -> 110;
               case 204 -> 226;
               case 205 -> 96;
               case 206 -> 248;
               case 207 -> 249;
               case 208 -> 0;
               case 209 -> 205;
               case 210 -> 129;
               case 211 -> 38;
               case 212 -> 130;
               case 213 -> 119;
               case 214 -> 118;
               case 215 -> 150;
               case 216 -> 45;
               case 217 -> 187;
               case 218 -> 171;
               case 219 -> 222;
               case 220 -> 2;
               case 221 -> 75;
               case 222 -> 84;
               case 223 -> 125;
               case 224 -> 225;
               case 225 -> 78;
               case 226 -> 82;
               case 227 -> 94;
               case 228 -> 147;
               case 229 -> 60;
               case 230 -> 73;
               case 231 -> 33;
               case 232 -> 239;
               case 233 -> 190;
               case 234 -> 186;
               case 235 -> 233;
               case 236 -> 220;
               case 237 -> 9;
               case 238 -> 236;
               case 239 -> 168;
               case 240 -> 83;
               case 241 -> 108;
               case 242 -> 104;
               case 243 -> 55;
               case 244 -> 42;
               case 245 -> 13;
               case 246 -> 185;
               case 247 -> 102;
               case 248 -> 47;
               case 249 -> 114;
               case 250 -> 204;
               case 251 -> 194;
               case 252 -> 193;
               case 253 -> 113;
               case 254 -> 61;
               default -> 16;
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

   private static final class llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {

      // PX-FIX phaseA S1c: synthetic default-argument wrapper restored from jar bytecode (name/descriptor exact)
      public static me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl a(me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl arg0, int arg1, me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll arg2, boolean arg3, kotlin.Triple arg4, int arg5, Object arg6) {
         if ((arg5 & 1) != 0) arg1 = arg0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((arg5 & 2) != 0) arg2 = arg0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((arg5 & 4) != 0) arg3 = arg0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((arg5 & 8) != 0) arg4 = arg0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         return arg0.a(arg1, arg2, arg3, arg4);
      }

      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
         int var1,
         @Nullable IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
         boolean var3,
         @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = 11120;
         short var10002 = -19374;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI =((Triple)( var4));
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl a(
         int var1,
         @Nullable IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
         boolean var3,
         @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = 11125;
         short var10002 = 30473;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
            var1, var2, var3,((Triple)( var4
         )));
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 11123;
         Triple var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -26060;
         short var10002 = 11124;
         short var10003 = -11565;
         short var10004 = 11122;
         short var10005 = -30162;
         short var10006 = 11121;
         short var10007 = -27679;
         return "RepositionProgress(pathfindFailures=" + var4 + ", stateBefore=" + var3 + ", walkerFinished=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var5;
         int var6;
         label14: {
            String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
            int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            String var1 = var10000;
            var5 = var2 * 31;
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var6 = 0;
                  break label14;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var6 = var10001.hashCode();
         }

         int var3 = var5 + var6;
         var3 = var3 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var3 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = (lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl)var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl
            )) {
               return false;
            }

            var10000 = (lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl)var1;
         }

         lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var3 = var10000;
         var10000 = this;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var10000 = this;
         }

         if (var2 != null) {
            if (var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return false;
            }

            var10000 = this;
         }

         boolean var5 = var10000.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var2 != null) {
            if (var10000.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               return false;
            }

            var5 = Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 != null) {
            if (!var5) {
               return false;
            }

            var5 = true;
         }

         return var5;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "\n¶\u0096uÅ'Ivþ\fcç}\u008f\u008fÄ±}Q48\u0006\u0011\u0096\u0000Ä~RD¦=¥:oU\u0090î«\"I$nÁm¥\u009fòò²5´Oxq<\u001f\u0097ds\u0086®ô\u001eE\u0097\u009f\t~¬\u0087\u008c\u0019\u009b\u008f`Ö9";
         int var4 = "\n¶\u0096uÅ'Ivþ\fcç}\u008f\u008fÄ±}Q48\u0006\u0011\u0096\u0000Ä~RD¦=¥:oU\u0090î«\"I$nÁm¥\u009fòò²5´Oxq<\u001f\u0097ds\u0086®ô\u001eE\u0097\u009f\t~¬\u0087\u008c\u0019\u009b\u008f`Ö9"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 125;
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
                        case 0 -> 120;
                        case 1 -> 70;
                        case 2 -> 21;
                        case 3 -> 33;
                        case 4 -> 79;
                        case 5 -> 91;
                        default -> 83;
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
                        b = new String[6];
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

                     var2 = "wFq.àkÑ\u0099å\u001a¬)RÁ\t\"\u0092\u001e|Y\u008bWn°";
                     var4 = "wFq.àkÑ\u0099å\u001a¬)RÁ\t\"\u0092\u001e|Y\u008bWn°".length();
                     var1 = 14;
                     var8 = -1;
               }

               var10000 = 113;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 11120) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 5;
               case 1 -> 230;
               case 2 -> 30;
               case 3 -> 120;
               case 4 -> 250;
               case 5 -> 238;
               case 6 -> 39;
               case 7 -> 205;
               case 8 -> 106;
               case 9 -> 32;
               case 10 -> 241;
               case 11 -> 83;
               case 12 -> 42;
               case 13 -> 234;
               case 14 -> 72;
               case 15 -> 211;
               case 16 -> 144;
               case 17 -> 71;
               case 18 -> 53;
               case 19 -> 186;
               case 20 -> 90;
               case 21 -> 246;
               case 22 -> 245;
               case 23 -> 100;
               case 24 -> 87;
               case 25 -> 126;
               case 26 -> 47;
               case 27 -> 184;
               case 28 -> 137;
               case 29 -> 108;
               case 30 -> 164;
               case 31 -> 101;
               case 32 -> 255;
               case 33 -> 46;
               case 34 -> 217;
               case 35 -> 168;
               case 36 -> 177;
               case 37 -> 223;
               case 38 -> 157;
               case 39 -> 27;
               case 40 -> 247;
               case 41 -> 41;
               case 42 -> 6;
               case 43 -> 174;
               case 44 -> 195;
               case 45 -> 203;
               case 46 -> 43;
               case 47 -> 200;
               case 48 -> 38;
               case 49 -> 253;
               case 50 -> 127;
               case 51 -> 78;
               case 52 -> 12;
               case 53 -> 235;
               case 54 -> 176;
               case 55 -> 248;
               case 56 -> 218;
               case 57 -> 60;
               case 58 -> 244;
               case 59 -> 34;
               case 60 -> 51;
               case 61 -> 201;
               case 62 -> 84;
               case 63 -> 40;
               case 64 -> 193;
               case 65 -> 181;
               case 66 -> 243;
               case 67 -> 206;
               case 68 -> 91;
               case 69 -> 76;
               case 70 -> 213;
               case 71 -> 228;
               case 72 -> 97;
               case 73 -> 14;
               case 74 -> 192;
               case 75 -> 182;
               case 76 -> 197;
               case 77 -> 207;
               case 78 -> 33;
               case 79 -> 160;
               case 80 -> 190;
               case 81 -> 4;
               case 82 -> 196;
               case 83 -> 61;
               case 84 -> 249;
               case 85 -> 7;
               case 86 -> 155;
               case 87 -> 158;
               case 88 -> 11;
               case 89 -> 22;
               case 90 -> 117;
               case 91 -> 239;
               case 92 -> 9;
               case 93 -> 185;
               case 94 -> 69;
               case 95 -> 75;
               case 96 -> 139;
               case 97 -> 171;
               case 98 -> 35;
               case 99 -> 240;
               case 100 -> 237;
               case 101 -> 172;
               case 102 -> 151;
               case 103 -> 146;
               case 104 -> 29;
               case 105 -> 242;
               case 106 -> 152;
               case 107 -> 251;
               case 108 -> 132;
               case 109 -> 142;
               case 110 -> 208;
               case 111 -> 102;
               case 112 -> 119;
               case 113 -> 99;
               case 114 -> 123;
               case 115 -> 114;
               case 116 -> 63;
               case 117 -> 20;
               case 118 -> 170;
               case 119 -> 145;
               case 120 -> 254;
               case 121 -> 104;
               case 122 -> 70;
               case 123 -> 54;
               case 124 -> 18;
               case 125 -> 194;
               case 126 -> 129;
               case 127 -> 149;
               case 128 -> 56;
               case 129 -> 67;
               case 130 -> 52;
               case 131 -> 112;
               case 132 -> 17;
               case 133 -> 138;
               case 134 -> 73;
               case 135 -> 10;
               case 136 -> 28;
               case 137 -> 115;
               case 138 -> 81;
               case 139 -> 233;
               case 140 -> 231;
               case 141 -> 178;
               case 142 -> 131;
               case 143 -> 153;
               case 144 -> 175;
               case 145 -> 224;
               case 146 -> 24;
               case 147 -> 111;
               case 148 -> 58;
               case 149 -> 50;
               case 150 -> 159;
               case 151 -> 65;
               case 152 -> 169;
               case 153 -> 66;
               case 154 -> 173;
               case 155 -> 37;
               case 156 -> 96;
               case 157 -> 79;
               case 158 -> 74;
               case 159 -> 198;
               case 160 -> 212;
               case 161 -> 124;
               case 162 -> 88;
               case 163 -> 204;
               case 164 -> 199;
               case 165 -> 140;
               case 166 -> 143;
               case 167 -> 59;
               case 168 -> 134;
               case 169 -> 64;
               case 170 -> 214;
               case 171 -> 220;
               case 172 -> 77;
               case 173 -> 55;
               case 174 -> 135;
               case 175 -> 110;
               case 176 -> 147;
               case 177 -> 3;
               case 178 -> 31;
               case 179 -> 95;
               case 180 -> 221;
               case 181 -> 163;
               case 182 -> 57;
               case 183 -> 161;
               case 184 -> 62;
               case 185 -> 154;
               case 186 -> 25;
               case 187 -> 113;
               case 188 -> 103;
               case 189 -> 45;
               case 190 -> 44;
               case 191 -> 187;
               case 192 -> 219;
               case 193 -> 216;
               case 194 -> 136;
               case 195 -> 150;
               case 196 -> 222;
               case 197 -> 141;
               case 198 -> 148;
               case 199 -> 1;
               case 200 -> 236;
               case 201 -> 15;
               case 202 -> 36;
               case 203 -> 92;
               case 204 -> 82;
               case 205 -> 183;
               case 206 -> 165;
               case 207 -> 118;
               case 208 -> 122;
               case 209 -> 130;
               case 210 -> 109;
               case 211 -> 21;
               case 212 -> 229;
               case 213 -> 107;
               case 214 -> 202;
               case 215 -> 16;
               case 216 -> 0;
               case 217 -> 26;
               case 218 -> 23;
               case 219 -> 86;
               case 220 -> 116;
               case 221 -> 226;
               case 222 -> 232;
               case 223 -> 68;
               case 224 -> 2;
               case 225 -> 162;
               case 226 -> 94;
               case 227 -> 156;
               case 228 -> 166;
               case 229 -> 179;
               case 230 -> 188;
               case 231 -> 191;
               case 232 -> 98;
               case 233 -> 209;
               case 234 -> 180;
               case 235 -> 89;
               case 236 -> 13;
               case 237 -> 8;
               case 238 -> 252;
               case 239 -> 227;
               case 240 -> 49;
               case 241 -> 128;
               case 242 -> 85;
               case 243 -> 189;
               case 244 -> 48;
               case 245 -> 80;
               case 246 -> 210;
               case 247 -> 225;
               case 248 -> 215;
               case 249 -> 133;
               case 250 -> 125;
               case 251 -> 167;
               case 252 -> 121;
               case 253 -> 93;
               case 254 -> 19;
               default -> 105;
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

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {

      // PX-FIX phaseA S1c: synthetic default-argument wrapper restored from jar bytecode (name/descriptor exact)
      public static me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll arg0, int arg1, java.lang.String arg2, java.lang.Integer arg3, java.lang.Boolean arg4, java.lang.Integer arg5, boolean arg6, int arg7, Object arg8) {
         if ((arg7 & 1) != 0) arg1 = arg0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((arg7 & 2) != 0) arg2 = arg0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((arg7 & 4) != 0) arg3 = arg0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((arg7 & 8) != 0) arg4 = arg0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if ((arg7 & 16) != 0) arg5 = arg0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if ((arg7 & 32) != 0) arg6 = arg0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         return arg0.a(arg1, arg2, arg3, arg4, arg5, arg6);
      }

      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final Integer IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final Boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @Nullable
      private final Integer IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         int var1, @Nullable String var2, @Nullable Integer var3, @Nullable Boolean var4, @Nullable Integer var5, boolean var6
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final Integer e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final int g() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String h() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Integer i() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Boolean j() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final Integer k() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean l() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, @Nullable String var2, @Nullable Integer var3, @Nullable Boolean var4, @Nullable Integer var5, boolean var6
      ) {
         return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4, var5, var6
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -11802;
         boolean var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Integer var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Boolean var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         Integer var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -28491;
         short var10002 = -11804;
         short var10003 = 8373;
         short var10004 = -11808;
         short var10005 = 14663;
         short var10006 = -11803;
         short var10007 = -10514;
         short var10008 = -11801;
         short var10009 = -5543;
         short var10010 = -11807;
         short var10011 = -3713;
         return "AbilityProgress(kills="
            + var6
            + ", targetName="
            + var5
            + ", targetId="
            + var4
            + ", targetAlive="
            + var3
            + ", targetHealth="
            + var2
            + ", lookingDown="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var7;
         int var11;
         label47: {
            String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
            int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var1 = var10000;
            var7 = var2 * 31;
            String var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var11 = 0;
                  break label47;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var11 = var10001.hashCode();
         }

         label41: {
            int var3 = var7 + var11;
            var7 = var3 * 31;
            Integer var12 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var11 = 0;
                  break label41;
               }

               var12 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var11 = var12.hashCode();
         }

         label35: {
            int var4 = var7 + var11;
            var7 = var4 * 31;
            Boolean var14 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var1 != null) {
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  var11 = 0;
                  break label35;
               }

               var14 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var11 = var14.hashCode();
         }

         label29: {
            int var5 = var7 + var11;
            var7 = var5 * 31;
            Integer var16 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var1 != null) {
               if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == null) {
                  var11 = 0;
                  break label29;
               }

               var16 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }

            var11 = var16.hashCode();
         }

         int var6 = var7 + var11;
         return var6 * 31 + Boolean.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 !=( (!var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0)) {
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
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "\u008c\u001a\u001a¹çß@O\u0001$u\u0080\u0091\u000e¶÷]\u0004\u000fh]¹\u00ad÷\nE¢È\u0016ß¢\u00ad©´bN\u00adcÖ\u0088\u0006=jVöê%\u001bN\u0014^\u000f\u0016ÎI#\u008d\u008c\r%®mJ$²èÚ";
         int var4 = "\u008c\u001a\u001a¹çß@O\u0001$u\u0080\u0091\u000e¶÷]\u0004\u000fh]¹\u00ad÷\nE¢È\u0016ß¢\u00ad©´bN\u00adcÖ\u0088\u0006=jVöê%\u001bN\u0014^\u000f\u0016ÎI#\u008d\u008c\r%®mJ$²èÚ"
            .length();
         char var1 = '\r';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 24;
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
                        case 0 -> 114;
                        case 1 -> 23;
                        case 2 -> 3;
                        case 3 -> 70;
                        case 4 -> 87;
                        case 5 -> 17;
                        default -> 20;
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
                        b = new String[6];
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

                     var2 = "\u0082\u001dtö\u0085\u0099£(Õb÷\u000eÒ-fþÁ[\u0099ç1âÒdÛb";
                     var4 = "\u0082\u001dtö\u0085\u0099£(Õb÷\u000eÒ-fþÁ[\u0099ç1âÒdÛb".length();
                     var1 = 11;
                     var8 = -1;
               }

               var10000 = 95;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -11804) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 243;
               case 1 -> 150;
               case 2 -> 219;
               case 3 -> 16;
               case 4 -> 149;
               case 5 -> 72;
               case 6 -> 194;
               case 7 -> 7;
               case 8 -> 87;
               case 9 -> 155;
               case 10 -> 135;
               case 11 -> 245;
               case 12 -> 44;
               case 13 -> 67;
               case 14 -> 198;
               case 15 -> 238;
               case 16 -> 57;
               case 17 -> 12;
               case 18 -> 80;
               case 19 -> 140;
               case 20 -> 230;
               case 21 -> 30;
               case 22 -> 28;
               case 23 -> 249;
               case 24 -> 83;
               case 25 -> 121;
               case 26 -> 212;
               case 27 -> 180;
               case 28 -> 191;
               case 29 -> 255;
               case 30 -> 214;
               case 31 -> 27;
               case 32 -> 130;
               case 33 -> 117;
               case 34 -> 242;
               case 35 -> 206;
               case 36 -> 39;
               case 37 -> 215;
               case 38 -> 84;
               case 39 -> 35;
               case 40 -> 163;
               case 41 -> 103;
               case 42 -> 127;
               case 43 -> 247;
               case 44 -> 24;
               case 45 -> 233;
               case 46 -> 22;
               case 47 -> 221;
               case 48 -> 177;
               case 49 -> 147;
               case 50 -> 13;
               case 51 -> 146;
               case 52 -> 55;
               case 53 -> 68;
               case 54 -> 143;
               case 55 -> 199;
               case 56 -> 115;
               case 57 -> 34;
               case 58 -> 207;
               case 59 -> 20;
               case 60 -> 173;
               case 61 -> 187;
               case 62 -> 79;
               case 63 -> 58;
               case 64 -> 42;
               case 65 -> 25;
               case 66 -> 14;
               case 67 -> 15;
               case 68 -> 108;
               case 69 -> 226;
               case 70 -> 99;
               case 71 -> 184;
               case 72 -> 234;
               case 73 -> 21;
               case 74 -> 6;
               case 75 -> 89;
               case 76 -> 66;
               case 77 -> 237;
               case 78 -> 222;
               case 79 -> 253;
               case 80 -> 76;
               case 81 -> 158;
               case 82 -> 204;
               case 83 -> 188;
               case 84 -> 81;
               case 85 -> 61;
               case 86 -> 46;
               case 87 -> 96;
               case 88 -> 26;
               case 89 -> 95;
               case 90 -> 48;
               case 91 -> 11;
               case 92 -> 224;
               case 93 -> 88;
               case 94 -> 1;
               case 95 -> 94;
               case 96 -> 141;
               case 97 -> 156;
               case 98 -> 102;
               case 99 -> 217;
               case 100 -> 43;
               case 101 -> 239;
               case 102 -> 197;
               case 103 -> 201;
               case 104 -> 86;
               case 105 -> 23;
               case 106 -> 118;
               case 107 -> 162;
               case 108 -> 129;
               case 109 -> 47;
               case 110 -> 100;
               case 111 -> 209;
               case 112 -> 152;
               case 113 -> 231;
               case 114 -> 10;
               case 115 -> 167;
               case 116 -> 126;
               case 117 -> 70;
               case 118 -> 114;
               case 119 -> 174;
               case 120 -> 185;
               case 121 -> 19;
               case 122 -> 49;
               case 123 -> 153;
               case 124 -> 9;
               case 125 -> 208;
               case 126 -> 32;
               case 127 -> 52;
               case 128 -> 41;
               case 129 -> 252;
               case 130 -> 161;
               case 131 -> 225;
               case 132 -> 51;
               case 133 -> 119;
               case 134 -> 200;
               case 135 -> 116;
               case 136 -> 132;
               case 137 -> 62;
               case 138 -> 124;
               case 139 -> 74;
               case 140 -> 134;
               case 141 -> 107;
               case 142 -> 71;
               case 143 -> 56;
               case 144 -> 202;
               case 145 -> 240;
               case 146 -> 54;
               case 147 -> 151;
               case 148 -> 232;
               case 149 -> 65;
               case 150 -> 159;
               case 151 -> 213;
               case 152 -> 144;
               case 153 -> 223;
               case 154 -> 125;
               case 155 -> 148;
               case 156 -> 31;
               case 157 -> 53;
               case 158 -> 216;
               case 159 -> 78;
               case 160 -> 60;
               case 161 -> 139;
               case 162 -> 18;
               case 163 -> 248;
               case 164 -> 101;
               case 165 -> 166;
               case 166 -> 111;
               case 167 -> 29;
               case 168 -> 38;
               case 169 -> 183;
               case 170 -> 120;
               case 171 -> 195;
               case 172 -> 176;
               case 173 -> 175;
               case 174 -> 50;
               case 175 -> 196;
               case 176 -> 192;
               case 177 -> 190;
               case 178 -> 211;
               case 179 -> 171;
               case 180 -> 189;
               case 181 -> 193;
               case 182 -> 205;
               case 183 -> 2;
               case 184 -> 227;
               case 185 -> 109;
               case 186 -> 241;
               case 187 -> 246;
               case 188 -> 142;
               case 189 -> 45;
               case 190 -> 128;
               case 191 -> 64;
               case 192 -> 210;
               case 193 -> 168;
               case 194 -> 131;
               case 195 -> 170;
               case 196 -> 181;
               case 197 -> 113;
               case 198 -> 75;
               case 199 -> 218;
               case 200 -> 85;
               case 201 -> 178;
               case 202 -> 93;
               case 203 -> 236;
               case 204 -> 110;
               case 205 -> 63;
               case 206 -> 122;
               case 207 -> 123;
               case 208 -> 40;
               case 209 -> 244;
               case 210 -> 90;
               case 211 -> 105;
               case 212 -> 73;
               case 213 -> 229;
               case 214 -> 33;
               case 215 -> 92;
               case 216 -> 137;
               case 217 -> 97;
               case 218 -> 0;
               case 219 -> 77;
               case 220 -> 254;
               case 221 -> 112;
               case 222 -> 104;
               case 223 -> 220;
               case 224 -> 8;
               case 225 -> 36;
               case 226 -> 203;
               case 227 -> 17;
               case 228 -> 154;
               case 229 -> 37;
               case 230 -> 235;
               case 231 -> 59;
               case 232 -> 98;
               case 233 -> 251;
               case 234 -> 69;
               case 235 -> 133;
               case 236 -> 160;
               case 237 -> 169;
               case 238 -> 3;
               case 239 -> 138;
               case 240 -> 4;
               case 241 -> 164;
               case 242 -> 145;
               case 243 -> 5;
               case 244 -> 136;
               case 245 -> 91;
               case 246 -> 82;
               case 247 -> 182;
               case 248 -> 165;
               case 249 -> 250;
               case 250 -> 106;
               case 251 -> 186;
               case 252 -> 228;
               case 253 -> 179;
               case 254 -> 157;
               default -> 172;
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

   private static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {

      // PX-FIX phaseA S1c: synthetic default-argument wrapper restored from jar bytecode (name/descriptor exact)
      public static me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(me.octo.client.lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll arg0, int arg1, java.lang.Integer arg2, net.minecraft.world.phys.Vec3 arg3, java.lang.Boolean arg4, net.minecraft.world.phys.Vec3 arg5, int arg6, Object arg7) {
         if ((arg6 & 1) != 0) arg1 = arg0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if ((arg6 & 2) != 0) arg2 = arg0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if ((arg6 & 4) != 0) arg3 = arg0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if ((arg6 & 8) != 0) arg4 = arg0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if ((arg6 & 16) != 0) arg5 = arg0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         return arg0.a(arg1, arg2, arg3, arg4, arg5);
      }

      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final Integer lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final Vec3 IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final Boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @Nullable
      private final Vec3 IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         int var1, @Nullable Integer var2, @Nullable Vec3 var3, @Nullable Boolean var4, @Nullable Vec3 var5
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final Integer b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Vec3 c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final Vec3 e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final Integer g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Vec3 h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Boolean i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final Vec3 j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
         int var1, @Nullable Integer var2, @Nullable Vec3 var3, @Nullable Boolean var4, @Nullable Vec3 var5
      ) {
         return new lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
            var1, var2, var3, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 15499;
         Vec3 var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Boolean var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         Vec3 var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Integer var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 11498;
         short var10002 = 15498;
         short var10003 = -6321;
         short var10004 = 15496;
         short var10005 = 17355;
         short var10006 = 15497;
         short var10007 = -13936;
         short var10008 = 15500;
         short var10009 = 21356;
         return "FishProgress(catches=" + var5 + ", bobberId=" + var4 + ", bobberPos=" + var3 + ", bobberInLiquid=" + var2 + ", lastBobberPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var6;
         int var10;
         label47: {
            String var10000 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
            int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var1 = var10000;
            var6 = var2 * 31;
            Integer var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var10 = 0;
                  break label47;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var10 = var10001.hashCode();
         }

         label41: {
            int var3 = var6 + var10;
            var6 = var3 * 31;
            Vec3 var11 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != null) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var10 = 0;
                  break label41;
               }

               var11 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var10 = var11.hashCode();
         }

         label35: {
            int var4 = var6 + var10;
            var6 = var4 * 31;
            Boolean var13 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var1 != null) {
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  var10 = 0;
                  break label35;
               }

               var13 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var10 = var13.hashCode();
         }

         int var5 = var6 + var10;
         var6 = var5 * 31;
         Vec3 var15 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         if (var1 != null) {
            if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == null) {
               return var6 + 0;
            }

            var15 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         return var6 + var15.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var3 = (lIIlllIIIIIIIIllIIlIllIIIIIIlllIIIIIIlllIlIIlIIlIlIlIIlIIIlllIllIllIllIIIIlllIIIIlIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
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
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "\u0091\u0004]P]½\u008d\u0004¥w\u0006ë\u0011\u009eT¼Zaü\n,Ls>\u001e$\u009f]Áv\u000bú_0;ðÐ8©\nÉ\u0087";
         int var4 = "\u0091\u0004]P]½\u008d\u0004¥w\u0006ë\u0011\u009eT¼Zaü\n,Ls>\u001e$\u009f]Áv\u000bú_0;ðÐ8©\nÉ\u0087".length();
         char var1 = '\f';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 22;
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
                        case 0 -> 91;
                        case 1 -> 90;
                        case 2 -> 27;
                        case 3 -> 4;
                        case 4 -> 13;
                        case 5 -> 3;
                        default -> 24;
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

                     var2 = "ú\nú\nTý.÷DH õ\u008aQ\u000e ·ñÚ\u0083>\u0010X~\u0096í\u0006/\u000ecØÔ7\u0080ÔÒ \u0094";
                     var4 = "ú\nú\nTý.÷DH õ\u008aQ\u000e ·ñÚ\u0083>\u0010X~\u0096í\u0006/\u000ecØÔ7\u0080ÔÒ \u0094".length();
                     var1 = 21;
                     var8 = -1;
               }

               var10000 = 9;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 15496) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 161;
               case 1 -> 199;
               case 2 -> 107;
               case 3 -> 23;
               case 4 -> 246;
               case 5 -> 243;
               case 6 -> 223;
               case 7 -> 253;
               case 8 -> 33;
               case 9 -> 61;
               case 10 -> 70;
               case 11 -> 124;
               case 12 -> 69;
               case 13 -> 170;
               case 14 -> 115;
               case 15 -> 238;
               case 16 -> 184;
               case 17 -> 162;
               case 18 -> 91;
               case 19 -> 50;
               case 20 -> 48;
               case 21 -> 8;
               case 22 -> 128;
               case 23 -> 189;
               case 24 -> 175;
               case 25 -> 231;
               case 26 -> 159;
               case 27 -> 245;
               case 28 -> 5;
               case 29 -> 132;
               case 30 -> 130;
               case 31 -> 186;
               case 32 -> 225;
               case 33 -> 12;
               case 34 -> 118;
               case 35 -> 205;
               case 36 -> 55;
               case 37 -> 9;
               case 38 -> 251;
               case 39 -> 42;
               case 40 -> 49;
               case 41 -> 193;
               case 42 -> 123;
               case 43 -> 217;
               case 44 -> 192;
               case 45 -> 47;
               case 46 -> 46;
               case 47 -> 34;
               case 48 -> 220;
               case 49 -> 3;
               case 50 -> 174;
               case 51 -> 120;
               case 52 -> 1;
               case 53 -> 191;
               case 54 -> 241;
               case 55 -> 165;
               case 56 -> 110;
               case 57 -> 240;
               case 58 -> 35;
               case 59 -> 135;
               case 60 -> 134;
               case 61 -> 7;
               case 62 -> 83;
               case 63 -> 18;
               case 64 -> 20;
               case 65 -> 10;
               case 66 -> 163;
               case 67 -> 154;
               case 68 -> 36;
               case 69 -> 75;
               case 70 -> 254;
               case 71 -> 131;
               case 72 -> 178;
               case 73 -> 202;
               case 74 -> 112;
               case 75 -> 212;
               case 76 -> 78;
               case 77 -> 126;
               case 78 -> 38;
               case 79 -> 232;
               case 80 -> 17;
               case 81 -> 27;
               case 82 -> 216;
               case 83 -> 153;
               case 84 -> 43;
               case 85 -> 29;
               case 86 -> 76;
               case 87 -> 25;
               case 88 -> 136;
               case 89 -> 190;
               case 90 -> 85;
               case 91 -> 210;
               case 92 -> 229;
               case 93 -> 149;
               case 94 -> 4;
               case 95 -> 198;
               case 96 -> 63;
               case 97 -> 2;
               case 98 -> 81;
               case 99 -> 173;
               case 100 -> 201;
               case 101 -> 106;
               case 102 -> 14;
               case 103 -> 187;
               case 104 -> 39;
               case 105 -> 255;
               case 106 -> 239;
               case 107 -> 133;
               case 108 -> 150;
               case 109 -> 185;
               case 110 -> 113;
               case 111 -> 179;
               case 112 -> 94;
               case 113 -> 87;
               case 114 -> 109;
               case 115 -> 101;
               case 116 -> 209;
               case 117 -> 247;
               case 118 -> 84;
               case 119 -> 226;
               case 120 -> 236;
               case 121 -> 230;
               case 122 -> 82;
               case 123 -> 37;
               case 124 -> 98;
               case 125 -> 188;
               case 126 -> 0;
               case 127 -> 89;
               case 128 -> 100;
               case 129 -> 156;
               case 130 -> 72;
               case 131 -> 166;
               case 132 -> 57;
               case 133 -> 244;
               case 134 -> 206;
               case 135 -> 235;
               case 136 -> 249;
               case 137 -> 51;
               case 138 -> 58;
               case 139 -> 92;
               case 140 -> 122;
               case 141 -> 183;
               case 142 -> 31;
               case 143 -> 45;
               case 144 -> 40;
               case 145 -> 140;
               case 146 -> 73;
               case 147 -> 158;
               case 148 -> 168;
               case 149 -> 196;
               case 150 -> 116;
               case 151 -> 65;
               case 152 -> 60;
               case 153 -> 146;
               case 154 -> 105;
               case 155 -> 97;
               case 156 -> 157;
               case 157 -> 90;
               case 158 -> 172;
               case 159 -> 248;
               case 160 -> 148;
               case 161 -> 41;
               case 162 -> 181;
               case 163 -> 77;
               case 164 -> 80;
               case 165 -> 194;
               case 166 -> 79;
               case 167 -> 203;
               case 168 -> 252;
               case 169 -> 125;
               case 170 -> 218;
               case 171 -> 16;
               case 172 -> 93;
               case 173 -> 54;
               case 174 -> 6;
               case 175 -> 26;
               case 176 -> 234;
               case 177 -> 242;
               case 178 -> 71;
               case 179 -> 44;
               case 180 -> 144;
               case 181 -> 160;
               case 182 -> 237;
               case 183 -> 180;
               case 184 -> 250;
               case 185 -> 102;
               case 186 -> 139;
               case 187 -> 177;
               case 188 -> 129;
               case 189 -> 204;
               case 190 -> 227;
               case 191 -> 182;
               case 192 -> 11;
               case 193 -> 56;
               case 194 -> 127;
               case 195 -> 52;
               case 196 -> 28;
               case 197 -> 195;
               case 198 -> 99;
               case 199 -> 207;
               case 200 -> 103;
               case 201 -> 215;
               case 202 -> 68;
               case 203 -> 143;
               case 204 -> 141;
               case 205 -> 167;
               case 206 -> 59;
               case 207 -> 117;
               case 208 -> 197;
               case 209 -> 96;
               case 210 -> 66;
               case 211 -> 145;
               case 212 -> 164;
               case 213 -> 176;
               case 214 -> 224;
               case 215 -> 62;
               case 216 -> 138;
               case 217 -> 114;
               case 218 -> 155;
               case 219 -> 142;
               case 220 -> 219;
               case 221 -> 200;
               case 222 -> 171;
               case 223 -> 169;
               case 224 -> 121;
               case 225 -> 24;
               case 226 -> 208;
               case 227 -> 147;
               case 228 -> 228;
               case 229 -> 119;
               case 230 -> 221;
               case 231 -> 108;
               case 232 -> 32;
               case 233 -> 64;
               case 234 -> 74;
               case 235 -> 53;
               case 236 -> 104;
               case 237 -> 111;
               case 238 -> 86;
               case 239 -> 137;
               case 240 -> 152;
               case 241 -> 233;
               case 242 -> 222;
               case 243 -> 13;
               case 244 -> 21;
               case 245 -> 19;
               case 246 -> 88;
               case 247 -> 214;
               case 248 -> 30;
               case 249 -> 151;
               case 250 -> 22;
               case 251 -> 95;
               case 252 -> 213;
               case 253 -> 15;
               case 254 -> 211;
               default -> 67;
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
}
