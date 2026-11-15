package me.octo.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
import me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl
   extends lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl {
   public static final int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new int[]{0, 1, 0, 0, 0, 3, 0, 2, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static <T> T j(Object p0, Object p1) { return null; } // PX-FIX mr3
    public static <T> T i(Object p0, Object p1) { return null; } // PX-FIX mr3
   public static me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX missing field (typed to WhenMappings)

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   @NotNull
   private llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private boolean lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   private int llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @Nullable
   private Vec3 lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private final double IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private final double lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private final long IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   private final double IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private final double lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   private final double llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private final double lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private final double IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private final double lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private final double IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private final double lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   private final double lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   private final double IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   private final double lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   private final double IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   private final double lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   private final double llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI;
   private final double IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   private final double IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
   private final double IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
   private final double IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
   private final double llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll;
   private final long IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
   private final long IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
   private final double lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl;
   private final double lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll;
   private final double llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
   private final double IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
   private final double IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
   private final double IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
   private final int IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
   private final double llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
   @NotNull
   private final HashMap<Integer, Long> IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   private final long lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   private int lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   private int lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
   private int llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
   @NotNull
   private final IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   private double lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   private double IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   private double lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   private double IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
   private int llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
   private boolean IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
   private int IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
   private float IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl;
   private int IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl;
   private float IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI;
   private float lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll;
   private int IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll;
   private boolean IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI;
   private float IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI;
   @Nullable
   private boolean[] lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
   @NotNull
   private final List<boolean[]> IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl;
   private final long lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI;
   private final long IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII;
   private long llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII;
   private final long llllIIIIIIlIllIllIlIIllIlIlIlIIIlIIIIIIIIIlIIIllIIIIlIlIlllIlIllIIIIIlIlIllIIlIIllIIl;
   private long IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll;
   private final long llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll;
   private final int lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll;
   private final double llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl;
   private final double lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI;
   private final double lIIllIIlIIlIIllllIIlIllllllIlIIIllllIIlIIlIIIIlIlIIIlIIIIlIllIIIIIIlIlIIIlIlllIllIIlI;
   private final double lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl;
   private final int IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI;
   private final int IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI;
   private final int llllllIIlIlIIlIIIIlIlIIIIIIlIIlIllIIIlIlIlIllIIIIlIIlIIIIlIlllIIllllllIIlllIlIIllIIIl;
   private final int lllIlIlIllllIIIIlIllIIllIIIllllIlIllIllIIlIIlIIIIlIlllIlIIIlIlllIllllIIIllIllIIIIIIII;
   private final int IIlIlllllIIllIIIlllIIIIlIIIlIIIIlIlIllllIlIIlIIlIlIIIlIIllIllIIIlllIlIllllIIIIlllllII;
   private final double lIIllIIIIlIlIIIIlIlllllIIIlIIllIllIlllllIlIllIIIIIIlIlIIIIIIllIIlllIlllllllIllIlIllII;
   private final double lIIllIlIIIIlIIlIlIllIIllIIllIIIIIIlIIlIIIllllIlIlllIlIlllIlIllIIIIIllIIIIlIlIIIlIIIlI;
   private final double llIIllllIlIIIlIIIIIllIIlllllIllllIIIlllIlIIlIlllIIlIIllIlllllIlIIIlllIllIllllllIIIllI;
   private final double lIlIIlIlIIllIlIllIIIllIIllllIIllIIIIlllllIIlllIlIlIlIlIIIlIIIlIlIIllllllllIIIllIIIIIl;
   private final double lIIlIlIllIlIlIIlIIIllIIlIlllllIIIIllIlIIIlIIllIIIIlIIIlIIllIIllIlllIIIIlIlIIIIllllllI;
   private final double IlIllIlIIlIIlIIIIIIlIlIIIlllIIllIllIIIlIIlIIlIIIlIIllIIIIIIllllIlIlIllIlllIIIIllIIIII;
   private final double IlIllIIIIIIIIIIlIllIIlIlIlIllIIIlIIIIllIlllllIIIlIIIIIIlIllIIlIIlIIIIIIllIIllllllIlII;
   private final double llIlllIIIllllIIllIlIIIllIIIIlIlIllIIIIlIllIIIlIIllIlIllIIIIIlIIIlIIllIllIIIIlIIIllIIl;
   private final double IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI;
   private final double IlIIlIlIIIIlllIIIllIIlIIlIIlIIIllllllIIlIlIIlllIIllIlllIlIlIIIlIlIIlIIIlIlIlllIIIlIIl;
   @NotNull
   private final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIlIllIllIlllllIIllIlIIIIllllIllllIlIIllIlIlIIllIlllllIllIIIlIlIIIIIIIIlIlIlIIlIIIlll;
   @NotNull
   private final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IlllIIllIlIlllIIllIlIIIllIIIlllllIllIIllIlllIIIlllIIlIllIlIlllIIlIlIlIllIlllIlIIIIlll;
   @NotNull
   private List<? extends Creeper> IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl;
   private volatile int lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII;
   @NotNull
   private volatile List<llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl;
   private volatile int llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI;
   private volatile boolean IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl;
   private int lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI;
   private int lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI;
   private int lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl;
   private int IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI;
   private int IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll;
   @NotNull
   private final Regex lIlIIIIIIIllIlllIlIlIIIIIIIIlllllIIlllIIllIlllIIIlIIlllIlllIllIIlIllIIIlIllllllIIllII;
   @NotNull
   private final Regex lIIlIIIlIIlIlIlllIIllIIlIIIlllIllllIlIIlIIlIIIIllIIIllIlIlIIIlIIlllIllIIIlIlIlIllIIlI;
   private int IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIlIIlllIIllIIlIllIlllIllIIlIlllIllllllIlIllIIIIIlllIIIlIIIIllllIlIllIIllIllIlII;
   @NotNull
   private final ArrayList<BlockPos> IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII;
   @Nullable
   private BlockPos IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI;
   private boolean lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII;
   private volatile boolean lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl;
   private volatile int IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll;
   @Nullable
   private volatile BlockPos IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl;
   @Nullable
   private volatile BlockPos lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl;
   @Nullable
   private volatile List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII;
   private final boolean IllIIIllIIllIlIIllIIlIIIIIllIlllIlllllIIIIlIIIIlIIIIlIIlIlIlIIIlIIllIlIlIlIlIllIIlllI;
   @NotNull
   private static IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI;
   @NotNull
   private static llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll;
   private static String[] j;
   private static String[] k;

   public llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl() {
      short var10001 = -13817;
      short var10002 = -17129;
      var10002 = -13756;
      short var10003 = -7775;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var15 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -13772;
      short var10005 = -26633;
      String[] var1 = new String[4];
      short var10007 = -13768;
      short var10008 = 26456;
      var1[0] = "This macro kills ghosts in the Dwarven Mines";
      var10007 = -13722;
      var10008 = -8903;
      var1[1] = "Supports one tap mode for faster killing";
      var10007 = -13737;
      var10008 = -31237;
      var1[2] = "Can clear edge ghosts first";
      var10007 = -13808;
      var10008 = 2145;
      var1[3] = "Has player detection and avoidance";
      List var20 = CollectionsKt.listOf(var1);
      var1 = new String[3];
      var10008 = -13776;
      short var10009 = -28271;
      var1[0] = "Make sure you have a good combat pet";
      var10008 = -13820;
      var10009 = 26708;
      var1[1] = "Use a strong melee weapon";
      var10008 = -13739;
      var10009 = -13753;
      var1[2] = "Etherwarp is required for routes with WARP waypoints";
      List var10006 = CollectionsKt.listOf(var1);
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var4 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .l(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .m(),
         lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .k()
      };
      super("Ghost Macro", "Kills Ghosts in Dwarven Mines, with optional One-Tap Mode.", var15, "Dwarven", var20, var10006, true, var4);
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = 3.75;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
         + 0.75;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = 100L;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = 3.4;
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = 3.4;
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = 8.0;
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = 6.5;
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = 8.0;
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = 8.0;
      this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = 7.0;
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = 0.5;
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = 1.5;
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = 60.0;
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = 25.0;
      this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = 12.0;
      this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = 15.0;
      this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = 18.0;
      this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = 5.0;
      this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = 0.3;
      this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI = 0.5;
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 30.0;
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = 1.0;
      this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = 30000L;
      this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = 12000L;
      this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = 70.0;
      this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = 3.35;
      this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII = 2.35;
      this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = 12.0;
      this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = 0.75;
      this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = 35.0;
      this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = 3;
      this.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl = 3.5;
      this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = new HashMap<>();
      this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = 750L;
      this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = -1;
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = -1;
      this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = new IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII(
         net.minecraft.client.Minecraft.getInstance(), 100L
      );
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = Random.Default.nextDouble(2.8, 3.0);
      this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = Random.Default.nextDouble(-0.1, 0.0);
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = -1.0;
      this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = -1;
      this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl = (float)Random.Default.nextDouble(0.0, 5.0);
      this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl = -1;
      this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = -1;
      boolean[][] var5 = new boolean[8][];
      boolean[] var2 = new boolean[]{true, false, false, false};
      var5[0] = var2;
      var2 = new boolean[]{false, true, false, false};
      var5[1] = var2;
      var2 = new boolean[]{false, false, true, false};
      var5[2] = var2;
      var2 = new boolean[]{false, false, false, true};
      var5[3] = var2;
      var2 = new boolean[]{true, false, true, false};
      var5[4] = var2;
      var2 = new boolean[]{true, false, false, true};
      var5[5] = var2;
      var2 = new boolean[]{false, true, true, false};
      var5[6] = var2;
      var2 = new boolean[]{false, true, false, true};
      var5[7] = var2;
      this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = CollectionsKt.listOf(var5);
      this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl = 50L;
      this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII = 200L;
      this.llllIIIIIIlIllIllIlIIllIlIlIlIIIlIIIIIIIIIlIIIllIIIIlIlIlllIlIllIIIIIlIlIllIIlIIllIIl = 3500L;
      this.llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll = 6000L;
      this.lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll = 3;
      this.llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl = 96.0;
      this.lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI = 112.0;
      this.lIIllIIlIIlIIllllIIlIllllllIlIIIllllIIlIIlIIIIlIlIIIlIIIIlIllIIIIIIlIlIIIlIlllIllIIlI = 74.0;
      this.lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl = 91.0;
      this.IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI = 118;
      this.IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI = 168;
      this.llllllIIlIlIIlIIIIlIlIIIIIIlIIlIllIIIlIlIlIllIIIIlIIlIIIIlIlllIIllllllIIlllIlIIllIIIl = 45;
      this.lllIlIlIllllIIIIlIllIIllIIIllllIlIllIllIIlIIlIIIIlIlllIlIIIlIlllIllllIIIllIllIIIIIIII = 88;
      this.IIlIlllllIIllIIIlllIIIIlIIIlIIIIlIlIllllIlIIlIIlIlIIIlIIllIllIIIlllIlIllllIIIIlllllII = 56;
      this.lIIllIIIIlIlIIIIlIlllllIIIlIIllIllIlllllIlIllIIIIIIlIlIIIIIIllIIlllIlllllllIllIlIllII = 8.0;
      this.lIIllIlIIIIlIIlIlIllIIllIIllIIIIIIlIIlIIIllllIlIlllIlIlllIlIllIIIIIllIIIIlIlIIIlIIIlI = 22.0;
      this.llIIllllIlIIIlIIIIIllIIlllllIllllIIIlllIlIIlIlllIIlIIllIlllllIlIIIlllIllIllllllIIIllI = 15.0;
      this.lIlIIlIlIIllIlIllIIIllIIllllIIllIIIIlllllIIlllIlIlIlIlIIIlIIIlIlIIllllllllIIIllIIIIIl = 6.0;
      this.lIIlIlIllIlIlIIlIIIllIIlIlllllIIIIllIlIIIlIIllIIIIlIIIlIIllIIllIlllIIIIlIlIIIIllllllI = 2.0;
      this.IlIllIlIIlIIlIIIIIIlIlIIIlllIIllIllIIIlIIlIIlIIIlIIllIIIIIIllllIlIlIllIlllIIIIllIIIII = 1.0;
      this.IlIllIIIIIIIIIIlIllIIlIlIlIllIIIlIIIIllIlllllIIIlIIIIIIlIllIIlIIlIIIIIIllIIllllllIlII = 8.0;
      this.llIlllIIIllllIIllIlIIIllIIIIlIlIllIIIIlIllIIIlIIllIlIllIIIIIlIIIlIIllIllIIIIlIIIllIIl = 120.0;
      this.IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI = 100.0;
      this.IlIIlIlIIIIlllIIIllIIlIIlIIlIIIllllllIIlIlIIlllIIllIlllIlIlIIIlIlIIlIIIlIlIlllIIIlIIl = 1000.0;
      this.IIlIllIllIlllllIIllIlIIIIllllIllllIlIIllIlIlIIllIlllllIllIIIlIlIIIIIIIIlIlIlIIlIIIlll = new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         109.0,
         85.0,
         182.0,
         36.0,
         97.0,
         80.0,
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl::e,
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl::f
      );
      this.IlllIIllIlIlllIIllIlIIIllIIIlllllIllIIllIlllIIIlllIIlIllIlIlllIIlIlIlIllIlllIlIIIIlll = new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         -57.0, null, 95.0, 45.0, 160.0, 80.0, null, null, 192, null
      );
      this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl = CollectionsKt.emptyList();
      this.IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl = CollectionsKt.emptyList();
      this.llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI = -1;
      this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
      var10003 = -13733;
      var10004 = 13019;
      this.lIlIIIIIIIllIlllIlIlIIIIIIIIlllllIIlllIIllIlllIIIlIIlllIlllIllIIlIllIIIlIllllllIIllII = new Regex(
         "^\\+(\\d+)\\s+KILL\\s+COMBO!?", RegexOption.IGNORE_CASE
      );
      var10003 = -13730;
      var10004 = -23314;
      this.lIIlIIIlIIlIlIlllIIllIIlIIIlllIllllIlIIlIIlIIIIllIIIllIlIlIIIlIIlllIllIIIlIlIlIllIIlI = new Regex(
         "^Your Kill Combo has expired! You reached a ([\\d,]+)\\s+Kill\\s+Combo!?$", RegexOption.IGNORE_CASE
      );
      this.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll = new ArrayList<>();
      BlockPos[] var6 = new BlockPos[]{new BlockPos(131, 75, 56), new BlockPos(161, 75, 49), new BlockPos(152, 75, 78), new BlockPos(144, 75, 67)};
      this.IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII = CollectionsKt.arrayListOf(var6);
      this.IllIIIllIIllIlIIllIIlIIIIIllIlllIlllllIIIIlIIIIlIIIIlIIlIlIlIIIlIIllIlIlIlIlIllIIlllI = true;
   }

   protected void aD() {
      Object receiver = null; // PX-FIX
      String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10001 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      short var10002 = -13707;
      short var10003 = 7998;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10001),
         "Ghost travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -16332;
                  short var10005 = -28498;
                  var10005 = -16330;
                  short var10006 = 10787;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -16331;
                  short var10002x = 17887;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0081\u008aßj\"BuSî\u00989K+²Ff\u0002\r«yÜÀt#WkÛv;<\u0083ß| ¬4VÞ\u009cùë#Tvø\r|\u0090S\u0016¤m\u000e\u009cÕ%6èY\"\u0001ß³Ó\u009eAH¦6ÆJ0Ö\u009dÕ©\u008d\u001dØ½\u0080\u009d/\u0005Lì\u0097\u0087ýê\u00adPx\u00950½\u009d¥¾\\H5#=Ò\u008f\u0016ïØ×\u0001i-Å:\u0006H[\u001bC®vêÁã\u000fð\u00ad\u0081\u008a?ÊÐTs\u0015õ\u00adóÇô";
                  int var4 = "\u0081\u008aßj\"BuSî\u00989K+²Ff\u0002\r«yÜÀt#WkÛv;<\u0083ß| ¬4VÞ\u009cùë#Tvø\r|\u0090S\u0016¤m\u000e\u009cÕ%6èY\"\u0001ß³Ó\u009eAH¦6ÆJ0Ö\u009dÕ©\u008d\u001dØ½\u0080\u009d/\u0005Lì\u0097\u0087ýê\u00adPx\u00950½\u009d¥¾\\H5#=Ò\u008f\u0016ïØ×\u0001i-Å:\u0006H[\u001bC®vêÁã\u000fð\u00ad\u0081\u008a?ÊÐTs\u0015õ\u00adóÇô"
                     .length();
                  char var1 = 16;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003x = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003x.length;
                        int var6 = 0;
                        byte var13 = 71;
                        var10002x = var10003x;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003x;
                           var16 = 71;
                           var10006 = var6;
                        } else {
                           var13 = 71;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003x;
                           var16 = 71;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 112;
                              case 1 -> 108;
                              case 2 -> 69;
                              case 3 -> 48;
                              case 4 -> 17;
                              case 5 -> 43;
                              default -> 26;
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
                  int var2 = (var0 ^ -16332) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 107;
                        case 1 -> 166;
                        case 2 -> 64;
                        case 3 -> 71;
                        case 4 -> 218;
                        case 5 -> 189;
                        case 6 -> 140;
                        case 7 -> 3;
                        case 8 -> 89;
                        case 9 -> 194;
                        case 10 -> 26;
                        case 11 -> 159;
                        case 12 -> 87;
                        case 13 -> 104;
                        case 14 -> 31;
                        case 15 -> 122;
                        case 16 -> 253;
                        case 17 -> 154;
                        case 18 -> 172;
                        case 19 -> 60;
                        case 20 -> 198;
                        case 21 -> 157;
                        case 22 -> 216;
                        case 23 -> 68;
                        case 24 -> 250;
                        case 25 -> 195;
                        case 26 -> 180;
                        case 27 -> 191;
                        case 28 -> 224;
                        case 29 -> 96;
                        case 30 -> 30;
                        case 31 -> 13;
                        case 32 -> 188;
                        case 33 -> 90;
                        case 34 -> 232;
                        case 35 -> 35;
                        case 36 -> 84;
                        case 37 -> 158;
                        case 38 -> 244;
                        case 39 -> 212;
                        case 40 -> 254;
                        case 41 -> 240;
                        case 42 -> 111;
                        case 43 -> 76;
                        case 44 -> 52;
                        case 45 -> 176;
                        case 46 -> 127;
                        case 47 -> 252;
                        case 48 -> 112;
                        case 49 -> 204;
                        case 50 -> 91;
                        case 51 -> 132;
                        case 52 -> 236;
                        case 53 -> 102;
                        case 54 -> 4;
                        case 55 -> 23;
                        case 56 -> 14;
                        case 57 -> 38;
                        case 58 -> 149;
                        case 59 -> 46;
                        case 60 -> 245;
                        case 61 -> 231;
                        case 62 -> 121;
                        case 63 -> 133;
                        case 64 -> 145;
                        case 65 -> 69;
                        case 66 -> 95;
                        case 67 -> 171;
                        case 68 -> 209;
                        case 69 -> 165;
                        case 70 -> 227;
                        case 71 -> 249;
                        case 72 -> 148;
                        case 73 -> 110;
                        case 74 -> 39;
                        case 75 -> 173;
                        case 76 -> 37;
                        case 77 -> 67;
                        case 78 -> 170;
                        case 79 -> 33;
                        case 80 -> 186;
                        case 81 -> 19;
                        case 82 -> 181;
                        case 83 -> 238;
                        case 84 -> 135;
                        case 85 -> 197;
                        case 86 -> 229;
                        case 87 -> 63;
                        case 88 -> 153;
                        case 89 -> 73;
                        case 90 -> 134;
                        case 91 -> 59;
                        case 92 -> 92;
                        case 93 -> 57;
                        case 94 -> 101;
                        case 95 -> 146;
                        case 96 -> 77;
                        case 97 -> 47;
                        case 98 -> 74;
                        case 99 -> 221;
                        case 100 -> 215;
                        case 101 -> 155;
                        case 102 -> 28;
                        case 103 -> 103;
                        case 104 -> 36;
                        case 105 -> 233;
                        case 106 -> 11;
                        case 107 -> 136;
                        case 108 -> 58;
                        case 109 -> 243;
                        case 110 -> 5;
                        case 111 -> 72;
                        case 112 -> 199;
                        case 113 -> 50;
                        case 114 -> 203;
                        case 115 -> 177;
                        case 116 -> 18;
                        case 117 -> 182;
                        case 118 -> 201;
                        case 119 -> 120;
                        case 120 -> 82;
                        case 121 -> 169;
                        case 122 -> 54;
                        case 123 -> 25;
                        case 124 -> 242;
                        case 125 -> 214;
                        case 126 -> 61;
                        case 127 -> 49;
                        case 128 -> 40;
                        case 129 -> 228;
                        case 130 -> 116;
                        case 131 -> 93;
                        case 132 -> 151;
                        case 133 -> 152;
                        case 134 -> 185;
                        case 135 -> 237;
                        case 136 -> 156;
                        case 137 -> 53;
                        case 138 -> 75;
                        case 139 -> 106;
                        case 140 -> 105;
                        case 141 -> 193;
                        case 142 -> 10;
                        case 143 -> 43;
                        case 144 -> 230;
                        case 145 -> 210;
                        case 146 -> 138;
                        case 147 -> 128;
                        case 148 -> 234;
                        case 149 -> 0;
                        case 150 -> 97;
                        case 151 -> 150;
                        case 152 -> 187;
                        case 153 -> 88;
                        case 154 -> 117;
                        case 155 -> 143;
                        case 156 -> 9;
                        case 157 -> 175;
                        case 158 -> 179;
                        case 159 -> 139;
                        case 160 -> 83;
                        case 161 -> 251;
                        case 162 -> 94;
                        case 163 -> 178;
                        case 164 -> 196;
                        case 165 -> 137;
                        case 166 -> 27;
                        case 167 -> 192;
                        case 168 -> 202;
                        case 169 -> 32;
                        case 170 -> 45;
                        case 171 -> 12;
                        case 172 -> 124;
                        case 173 -> 125;
                        case 174 -> 21;
                        case 175 -> 239;
                        case 176 -> 255;
                        case 177 -> 213;
                        case 178 -> 142;
                        case 179 -> 16;
                        case 180 -> 85;
                        case 181 -> 100;
                        case 182 -> 208;
                        case 183 -> 81;
                        case 184 -> 205;
                        case 185 -> 41;
                        case 186 -> 17;
                        case 187 -> 190;
                        case 188 -> 206;
                        case 189 -> 6;
                        case 190 -> 126;
                        case 191 -> 114;
                        case 192 -> 141;
                        case 193 -> 86;
                        case 194 -> 2;
                        case 195 -> 184;
                        case 196 -> 161;
                        case 197 -> 247;
                        case 198 -> 78;
                        case 199 -> 15;
                        case 200 -> 80;
                        case 201 -> 44;
                        case 202 -> 65;
                        case 203 -> 34;
                        case 204 -> 248;
                        case 205 -> 235;
                        case 206 -> 246;
                        case 207 -> 1;
                        case 208 -> 108;
                        case 209 -> 62;
                        case 210 -> 200;
                        case 211 -> 164;
                        case 212 -> 115;
                        case 213 -> 226;
                        case 214 -> 70;
                        case 215 -> 222;
                        case 216 -> 174;
                        case 217 -> 223;
                        case 218 -> 207;
                        case 219 -> 168;
                        case 220 -> 109;
                        case 221 -> 22;
                        case 222 -> 29;
                        case 223 -> 51;
                        case 224 -> 220;
                        case 225 -> 225;
                        case 226 -> 162;
                        case 227 -> 55;
                        case 228 -> 8;
                        case 229 -> 123;
                        case 230 -> 119;
                        case 231 -> 219;
                        case 232 -> 241;
                        case 233 -> 113;
                        case 234 -> 98;
                        case 235 -> 160;
                        case 236 -> 163;
                        case 237 -> 48;
                        case 238 -> 183;
                        case 239 -> 118;
                        case 240 -> 56;
                        case 241 -> 167;
                        case 242 -> 144;
                        case 243 -> 211;
                        case 244 -> 42;
                        case 245 -> 147;
                        case 246 -> 7;
                        case 247 -> 66;
                        case 248 -> 131;
                        case 249 -> 217;
                        case 250 -> 129;
                        case 251 -> 130;
                        case 252 -> 20;
                        case 253 -> 79;
                        case 254 -> 99;
                        default -> 24;
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
         ));
      var10001 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      var10002 = -13701;
      var10003 = 28877;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10001),
         "Ghost route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
         25000L,
         0L,
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
                  short var10004 = 26966;
                  short var10005 = -18795;
                  var10005 = 26967;
                  short var10006 = -30817;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 26965;
                  short var10002 = -26393;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u00057¡\u008c\"Ìê¹%+\u0011ò|\u001a\u0097Kß`b|«¨dé¯1Ä\u0088\u007f-Ï[¬\b\u001e\u008cw3 \u0096|Ö'Êâ3\bº¡~\u0080ÉÞm\u0086(Ü\u0015\u001cí×ÅZ5Ú\u0004\u0014Uß/ÒÐyÔßÇÿÑÊ<\u0097ö\u008aÚÜK9&ò¼Û?Ná\u0007M½\u00ad\u009e¥ðûî\"üH+««\u0085(´\t£¦º\u0080\nÂ\bê\u0010¬\u0017\u0094\u0088\u0084L>©¿)B²\u0016\u0012ÚJ\u0002ô\u0016";
                  int var4 = "\u00057¡\u008c\"Ìê¹%+\u0011ò|\u001a\u0097Kß`b|«¨dé¯1Ä\u0088\u007f-Ï[¬\b\u001e\u008cw3 \u0096|Ö'Êâ3\bº¡~\u0080ÉÞm\u0086(Ü\u0015\u001cí×ÅZ5Ú\u0004\u0014Uß/ÒÐyÔßÇÿÑÊ<\u0097ö\u008aÚÜK9&ò¼Û?Ná\u0007M½\u00ad\u009e¥ðûî\"üH+««\u0085(´\t£¦º\u0080\nÂ\bê\u0010¬\u0017\u0094\u0088\u0084L>©¿)B²\u0016\u0012ÚJ\u0002ô\u0016"
                     .length();
                  char var1 = 'y';
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 20;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 20;
                           var10006 = var6;
                        } else {
                           var13 = 20;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 20;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 62;
                              case 1 -> 109;
                              case 2 -> 91;
                              case 3 -> 120;
                              case 4 -> 36;
                              case 5 -> 73;
                              default -> 26;
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
                  int var2 = (var0 ^ 26967) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 207;
                        case 1 -> 151;
                        case 2 -> 216;
                        case 3 -> 118;
                        case 4 -> 110;
                        case 5 -> 63;
                        case 6 -> 153;
                        case 7 -> 233;
                        case 8 -> 255;
                        case 9 -> 39;
                        case 10 -> 95;
                        case 11 -> 84;
                        case 12 -> 18;
                        case 13 -> 132;
                        case 14 -> 238;
                        case 15 -> 172;
                        case 16 -> 214;
                        case 17 -> 124;
                        case 18 -> 72;
                        case 19 -> 105;
                        case 20 -> 42;
                        case 21 -> 83;
                        case 22 -> 138;
                        case 23 -> 82;
                        case 24 -> 58;
                        case 25 -> 239;
                        case 26 -> 91;
                        case 27 -> 100;
                        case 28 -> 99;
                        case 29 -> 142;
                        case 30 -> 212;
                        case 31 -> 196;
                        case 32 -> 35;
                        case 33 -> 44;
                        case 34 -> 145;
                        case 35 -> 11;
                        case 36 -> 107;
                        case 37 -> 77;
                        case 38 -> 79;
                        case 39 -> 229;
                        case 40 -> 26;
                        case 41 -> 64;
                        case 42 -> 177;
                        case 43 -> 7;
                        case 44 -> 247;
                        case 45 -> 242;
                        case 46 -> 147;
                        case 47 -> 88;
                        case 48 -> 141;
                        case 49 -> 157;
                        case 50 -> 205;
                        case 51 -> 169;
                        case 52 -> 62;
                        case 53 -> 21;
                        case 54 -> 219;
                        case 55 -> 87;
                        case 56 -> 17;
                        case 57 -> 65;
                        case 58 -> 222;
                        case 59 -> 182;
                        case 60 -> 32;
                        case 61 -> 52;
                        case 62 -> 183;
                        case 63 -> 31;
                        case 64 -> 230;
                        case 65 -> 133;
                        case 66 -> 208;
                        case 67 -> 128;
                        case 68 -> 249;
                        case 69 -> 235;
                        case 70 -> 184;
                        case 71 -> 13;
                        case 72 -> 4;
                        case 73 -> 75;
                        case 74 -> 143;
                        case 75 -> 36;
                        case 76 -> 59;
                        case 77 -> 245;
                        case 78 -> 215;
                        case 79 -> 48;
                        case 80 -> 203;
                        case 81 -> 254;
                        case 82 -> 81;
                        case 83 -> 198;
                        case 84 -> 220;
                        case 85 -> 50;
                        case 86 -> 85;
                        case 87 -> 231;
                        case 88 -> 23;
                        case 89 -> 244;
                        case 90 -> 144;
                        case 91 -> 248;
                        case 92 -> 140;
                        case 93 -> 119;
                        case 94 -> 170;
                        case 95 -> 78;
                        case 96 -> 24;
                        case 97 -> 226;
                        case 98 -> 227;
                        case 99 -> 228;
                        case 100 -> 201;
                        case 101 -> 101;
                        case 102 -> 122;
                        case 103 -> 192;
                        case 104 -> 34;
                        case 105 -> 70;
                        case 106 -> 112;
                        case 107 -> 246;
                        case 108 -> 149;
                        case 109 -> 234;
                        case 110 -> 28;
                        case 111 -> 115;
                        case 112 -> 37;
                        case 113 -> 16;
                        case 114 -> 30;
                        case 115 -> 43;
                        case 116 -> 102;
                        case 117 -> 5;
                        case 118 -> 8;
                        case 119 -> 150;
                        case 120 -> 194;
                        case 121 -> 165;
                        case 122 -> 97;
                        case 123 -> 236;
                        case 124 -> 213;
                        case 125 -> 253;
                        case 126 -> 139;
                        case 127 -> 67;
                        case 128 -> 51;
                        case 129 -> 161;
                        case 130 -> 120;
                        case 131 -> 3;
                        case 132 -> 159;
                        case 133 -> 199;
                        case 134 -> 167;
                        case 135 -> 166;
                        case 136 -> 162;
                        case 137 -> 204;
                        case 138 -> 10;
                        case 139 -> 137;
                        case 140 -> 217;
                        case 141 -> 156;
                        case 142 -> 136;
                        case 143 -> 210;
                        case 144 -> 117;
                        case 145 -> 54;
                        case 146 -> 71;
                        case 147 -> 237;
                        case 148 -> 171;
                        case 149 -> 61;
                        case 150 -> 14;
                        case 151 -> 73;
                        case 152 -> 1;
                        case 153 -> 173;
                        case 154 -> 109;
                        case 155 -> 86;
                        case 156 -> 66;
                        case 157 -> 181;
                        case 158 -> 186;
                        case 159 -> 69;
                        case 160 -> 131;
                        case 161 -> 9;
                        case 162 -> 191;
                        case 163 -> 93;
                        case 164 -> 135;
                        case 165 -> 94;
                        case 166 -> 53;
                        case 167 -> 225;
                        case 168 -> 180;
                        case 169 -> 33;
                        case 170 -> 200;
                        case 171 -> 209;
                        case 172 -> 224;
                        case 173 -> 2;
                        case 174 -> 197;
                        case 175 -> 163;
                        case 176 -> 178;
                        case 177 -> 240;
                        case 178 -> 56;
                        case 179 -> 154;
                        case 180 -> 121;
                        case 181 -> 46;
                        case 182 -> 193;
                        case 183 -> 126;
                        case 184 -> 38;
                        case 185 -> 185;
                        case 186 -> 123;
                        case 187 -> 22;
                        case 188 -> 211;
                        case 189 -> 49;
                        case 190 -> 179;
                        case 191 -> 106;
                        case 192 -> 114;
                        case 193 -> 104;
                        case 194 -> 232;
                        case 195 -> 40;
                        case 196 -> 25;
                        case 197 -> 218;
                        case 198 -> 90;
                        case 199 -> 60;
                        case 200 -> 195;
                        case 201 -> 174;
                        case 202 -> 223;
                        case 203 -> 146;
                        case 204 -> 80;
                        case 205 -> 6;
                        case 206 -> 187;
                        case 207 -> 92;
                        case 208 -> 243;
                        case 209 -> 45;
                        case 210 -> 155;
                        case 211 -> 130;
                        case 212 -> 68;
                        case 213 -> 221;
                        case 214 -> 19;
                        case 215 -> 129;
                        case 216 -> 241;
                        case 217 -> 252;
                        case 218 -> 148;
                        case 219 -> 15;
                        case 220 -> 113;
                        case 221 -> 76;
                        case 222 -> 57;
                        case 223 -> 55;
                        case 224 -> 175;
                        case 225 -> 41;
                        case 226 -> 176;
                        case 227 -> 0;
                        case 228 -> 164;
                        case 229 -> 206;
                        case 230 -> 134;
                        case 231 -> 29;
                        case 232 -> 158;
                        case 233 -> 160;
                        case 234 -> 74;
                        case 235 -> 127;
                        case 236 -> 250;
                        case 237 -> 96;
                        case 238 -> 27;
                        case 239 -> 251;
                        case 240 -> 168;
                        case 241 -> 12;
                        case 242 -> 98;
                        case 243 -> 125;
                        case 244 -> 103;
                        case 245 -> 47;
                        case 246 -> 188;
                        case 247 -> 89;
                        case 248 -> 111;
                        case 249 -> 189;
                        case 250 -> 190;
                        case 251 -> 108;
                        case 252 -> 116;
                        case 253 -> 202;
                        case 254 -> 20;
                        default -> 152;
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
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var5 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      short var8 = -13764;
      var10002 = -16130;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var2 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
      };
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var5,
         "Ghost combat",
         SetsKt.setOf(var2),
         45000L,
         0L,
         null,
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
                  short var10004 = -12451;
                  short var10005 = -5669;
                  var10005 = -12450;
                  short var10006 = -10474;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -12449;
                  short var10002 = -15859;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
   pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "çýyv/#m\u0015&3ÁPÈ]é#FY\u008eê:£á¬>Ê×\u0098\u0091ô£\\\u0006GÜÚ.ïm\u0007ãÌë7Fk\u0096\u0087ZÃAç$\u0006nìþ\u0016eëò\u0016óñÐ¡²ë\u0018Ð±\u0091\u008c>ê\bq\u0096¥é¸Fýä©2\u000eî\u009f\u0093^Àe¢!/ÎÉÏ²ÂZ\u0006\u0084m\u0007&þí%ó\u0088é\u009a\u0006z»$[·à\u001bp\u009f\u0010¾\u0094:\u001a6ÈW\u001cÜsÌ\u009e\u0011¨\u001fS";
                  int var4 = "çýyv/#m\u0015&3ÁPÈ]é#FY\u008eê:£á¬>Ê×\u0098\u0091ô£\\\u0006GÜÚ.ïm\u0007ãÌë7Fk\u0096\u0087ZÃAç$\u0006nìþ\u0016eëò\u0016óñÐ¡²ë\u0018Ð±\u0091\u008c>ê\bq\u0096¥é¸Fýä©2\u000eî\u009f\u0093^Àe¢!/ÎÉÏ²ÂZ\u0006\u0084m\u0007&þí%ó\u0088é\u009a\u0006z»$[·à\u001bp\u009f\u0010¾\u0094:\u001a6ÈW\u001cÜsÌ\u009e\u0011¨\u001fS"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 100;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 100;
                           var10006 = var6;
                        } else {
                           var13 = 100;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 100;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 40;
                              case 1 -> 57;
                              case 2 -> 11;
                              case 3 -> 110;
                              case 4 -> 55;
                              case 5 -> 35;
                              default -> 57;
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
                  int var2 = (var0 ^ -12449) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 175;
                        case 1 -> 103;
                        case 2 -> 110;
                        case 3 -> 233;
                        case 4 -> 32;
                        case 5 -> 100;
                        case 6 -> 211;
                        case 7 -> 162;
                        case 8 -> 15;
                        case 9 -> 34;
                        case 10 -> 206;
                        case 11 -> 228;
                        case 12 -> 45;
                        case 13 -> 221;
                        case 14 -> 47;
                        case 15 -> 248;
                        case 16 -> 182;
                        case 17 -> 40;
                        case 18 -> 59;
                        case 19 -> 232;
                        case 20 -> 219;
                        case 21 -> 145;
                        case 22 -> 147;
                        case 23 -> 37;
                        case 24 -> 23;
                        case 25 -> 183;
                        case 26 -> 43;
                        case 27 -> 56;
                        case 28 -> 80;
                        case 29 -> 131;
                        case 30 -> 247;
                        case 31 -> 1;
                        case 32 -> 144;
                        case 33 -> 153;
                        case 34 -> 42;
                        case 35 -> 140;
                        case 36 -> 216;
                        case 37 -> 197;
                        case 38 -> 55;
                        case 39 -> 193;
                        case 40 -> 231;
                        case 41 -> 44;
                        case 42 -> 14;
                        case 43 -> 234;
                        case 44 -> 28;
                        case 45 -> 38;
                        case 46 -> 168;
                        case 47 -> 214;
                        case 48 -> 236;
                        case 49 -> 75;
                        case 50 -> 117;
                        case 51 -> 99;
                        case 52 -> 76;
                        case 53 -> 126;
                        case 54 -> 173;
                        case 55 -> 130;
                        case 56 -> 71;
                        case 57 -> 243;
                        case 58 -> 196;
                        case 59 -> 239;
                        case 60 -> 155;
                        case 61 -> 199;
                        case 62 -> 51;
                        case 63 -> 191;
                        case 64 -> 49;
                        case 65 -> 141;
                        case 66 -> 54;
                        case 67 -> 113;
                        case 68 -> 137;
                        case 69 -> 187;
                        case 70 -> 158;
                        case 71 -> 25;
                        case 72 -> 85;
                        case 73 -> 254;
                        case 74 -> 242;
                        case 75 -> 104;
                        case 76 -> 111;
                        case 77 -> 91;
                        case 78 -> 82;
                        case 79 -> 64;
                        case 80 -> 112;
                        case 81 -> 212;
                        case 82 -> 176;
                        case 83 -> 27;
                        case 84 -> 238;
                        case 85 -> 58;
                        case 86 -> 240;
                        case 87 -> 57;
                        case 88 -> 223;
                        case 89 -> 235;
                        case 90 -> 20;
                        case 91 -> 156;
                        case 92 -> 255;
                        case 93 -> 213;
                        case 94 -> 6;
                        case 95 -> 83;
                        case 96 -> 161;
                        case 97 -> 136;
                        case 98 -> 160;
                        case 99 -> 16;
                        case 100 -> 205;
                        case 101 -> 86;
                        case 102 -> 204;
                        case 103 -> 84;
                        case 104 -> 245;
                        case 105 -> 202;
                        case 106 -> 81;
                        case 107 -> 70;
                        case 108 -> 129;
                        case 109 -> 222;
                        case 110 -> 225;
                        case 111 -> 177;
                        case 112 -> 163;
                        case 113 -> 124;
                        case 114 -> 77;
                        case 115 -> 201;
                        case 116 -> 31;
                        case 117 -> 178;
                        case 118 -> 138;
                        case 119 -> 17;
                        case 120 -> 123;
                        case 121 -> 102;
                        case 122 -> 121;
                        case 123 -> 167;
                        case 124 -> 106;
                        case 125 -> 78;
                        case 126 -> 208;
                        case 127 -> 114;
                        case 128 -> 146;
                        case 129 -> 251;
                        case 130 -> 96;
                        case 131 -> 241;
                        case 132 -> 39;
                        case 133 -> 12;
                        case 134 -> 79;
                        case 135 -> 127;
                        case 136 -> 165;
                        case 137 -> 134;
                        case 138 -> 46;
                        case 139 -> 63;
                        case 140 -> 105;
                        case 141 -> 150;
                        case 142 -> 151;
                        case 143 -> 143;
                        case 144 -> 186;
                        case 145 -> 120;
                        case 146 -> 66;
                        case 147 -> 67;
                        case 148 -> 60;
                        case 149 -> 21;
                        case 150 -> 89;
                        case 151 -> 98;
                        case 152 -> 8;
                        case 153 -> 108;
                        case 154 -> 132;
                        case 155 -> 210;
                        case 156 -> 4;
                        case 157 -> 189;
                        case 158 -> 97;
                        case 159 -> 139;
                        case 160 -> 29;
                        case 161 -> 226;
                        case 162 -> 237;
                        case 163 -> 203;
                        case 164 -> 11;
                        case 165 -> 244;
                        case 166 -> 19;
                        case 167 -> 22;
                        case 168 -> 190;
                        case 169 -> 181;
                        case 170 -> 194;
                        case 171 -> 50;
                        case 172 -> 200;
                        case 173 -> 2;
                        case 174 -> 180;
                        case 175 -> 93;
                        case 176 -> 53;
                        case 177 -> 74;
                        case 178 -> 73;
                        case 179 -> 92;
                        case 180 -> 164;
                        case 181 -> 192;
                        case 182 -> 142;
                        case 183 -> 220;
                        case 184 -> 7;
                        case 185 -> 107;
                        case 186 -> 33;
                        case 187 -> 198;
                        case 188 -> 169;
                        case 189 -> 159;
                        case 190 -> 215;
                        case 191 -> 115;
                        case 192 -> 149;
                        case 193 -> 72;
                        case 194 -> 118;
                        case 195 -> 48;
                        case 196 -> 9;
                        case 197 -> 119;
                        case 198 -> 209;
                        case 199 -> 0;
                        case 200 -> 249;
                        case 201 -> 184;
                        case 202 -> 69;
                        case 203 -> 227;
                        case 204 -> 152;
                        case 205 -> 188;
                        case 206 -> 224;
                        case 207 -> 24;
                        case 208 -> 218;
                        case 209 -> 246;
                        case 210 -> 157;
                        case 211 -> 230;
                        case 212 -> 122;
                        case 213 -> 174;
                        case 214 -> 61;
                        case 215 -> 87;
                        case 216 -> 90;
                        case 217 -> 36;
                        case 218 -> 133;
                        case 219 -> 207;
                        case 220 -> 128;
                        case 221 -> 179;
                        case 222 -> 185;
                        case 223 -> 95;
                        case 224 -> 172;
                        case 225 -> 35;
                        case 226 -> 217;
                        case 227 -> 52;
                        case 228 -> 101;
                        case 229 -> 148;
                        case 230 -> 62;
                        case 231 -> 41;
                        case 232 -> 94;
                        case 233 -> 68;
                        case 234 -> 109;
                        case 235 -> 18;
                        case 236 -> 125;
                        case 237 -> 13;
                        case 238 -> 30;
                        case 239 -> 5;
                        case 240 -> 171;
                        case 241 -> 229;
                        case 242 -> 65;
                        case 243 -> 252;
                        case 244 -> 88;
                        case 245 -> 154;
                        case 246 -> 3;
                        case 247 -> 116;
                        case 248 -> 195;
                        case 249 -> 170;
                        case 250 -> 166;
                        case 251 -> 26;
                        case 252 -> 10;
                        case 253 -> 253;
                        case 254 -> 135;
                        default -> 250;
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
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var6 = (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this;
      short var9 = -13818;
      var10002 = -28402;
      String var10 = "Ghost kill progress";
      var2 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[2];

      try {
         var2[0] = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         var2[1] = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
            var6,
            var10,
            SetsKt.setOf(var2),
            90000L,
            0L,
            null,
            false,
            false,
            null,
            (Function1)(
               new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      Object receiver = null; // PX-FIX
                  private static String[] a;
                  private static String[] b;

                  {
                     short var10004 = 15628;
                     short var10005 = -1647;
                     var10005 = 15630;
                     short var10006 = -18169;
                  }

                  public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
                     short var10001 = 15629;
                     short var10002 = 16562;
                     Intrinsics.checkNotNullParameter(var1, "p0");
                     ((llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl)this.receiver).a(var1);
                  }

                  // $VF: Irreducible bytecode was duplicated to produce valid code
                  static {
   pxClinit: { // PX-FIX
                     String[] var5 = new String[3];
                     int var3 = 0;
                     String var2 = "P\u0099ó¬\tçÁ¨\u0093ñ2È7\u0013\u008a¹\u0002\u001cÖy:ù¾  fô\u00985÷æ\b\u00ad\u000bÙºî«%*\r\u0016cÆºµIVº%\u008f¯Å¹}ÎÈ\u0083\"á\u0013v¾\r)>\u00104ìÛú\u0085d\u0085þ{§¬\u008b/D²f¯\u008e¯kA\u001fã¾\u009a\fh\u0010\u007fH²ï¨Æ\u0005\u008fê\b\u009e[ißz0\u0093à\u008c'\u0081\u0096z\u008f\u008c*+Ô\u0017õ\u009aÙ\t\u0000°r\\6m¹\u0096\u0002 Ü)ú";
                     int var4 = "P\u0099ó¬\tçÁ¨\u0093ñ2È7\u0013\u008a¹\u0002\u001cÖy:ù¾  fô\u00985÷æ\b\u00ad\u000bÙºî«%*\r\u0016cÆºµIVº%\u008f¯Å¹}ÎÈ\u0083\"á\u0013v¾\r)>\u00104ìÛú\u0085d\u0085þ{§¬\u008b/D²f¯\u008e¯kA\u001fã¾\u009a\fh\u0010\u007fH²ï¨Æ\u0005\u008fê\b\u009e[ißz0\u0093à\u008c'\u0081\u0096z\u008f\u008c*+Ô\u0017õ\u009aÙ\t\u0000°r\\6m¹\u0096\u0002 Ü)ú"
                        .length();
                     char var1 = 16;
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
                                 case 0 -> 15;
                                 case 1 -> 55;
                                 case 2 -> 100;
                                 case 3 -> 39;
                                 case 4 -> 67;
                                 case 5 -> 108;
                                 default -> 89;
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
                           break pxClinit; // PX-FIX
                        }

                        var1 = var2.charAt(var0);
                     }
   } // PX-FIX end pxClinit
                  }

                  private static String a(int var0, int var1) {
                     int var2 = (var0 ^ 15628) & 65535;
                     if (b[var2] == null) {
                        char[] var3 = a[var2].toCharArray();

                        short var4 = switch (var3[0] & 0xFF) {
                           case 0 -> 182;
                           case 1 -> 163;
                           case 2 -> 192;
                           case 3 -> 120;
                           case 4 -> 169;
                           case 5 -> 193;
                           case 6 -> 46;
                           case 7 -> 255;
                           case 8 -> 20;
                           case 9 -> 14;
                           case 10 -> 245;
                           case 11 -> 24;
                           case 12 -> 101;
                           case 13 -> 187;
                           case 14 -> 30;
                           case 15 -> 130;
                           case 16 -> 110;
                           case 17 -> 116;
                           case 18 -> 11;
                           case 19 -> 119;
                           case 20 -> 210;
                           case 21 -> 67;
                           case 22 -> 9;
                           case 23 -> 221;
                           case 24 -> 55;
                           case 25 -> 179;
                           case 26 -> 115;
                           case 27 -> 175;
                           case 28 -> 0;
                           case 29 -> 57;
                           case 30 -> 122;
                           case 31 -> 28;
                           case 32 -> 96;
                           case 33 -> 147;
                           case 34 -> 159;
                           case 35 -> 53;
                           case 36 -> 25;
                           case 37 -> 128;
                           case 38 -> 87;
                           case 39 -> 66;
                           case 40 -> 225;
                           case 41 -> 79;
                           case 42 -> 19;
                           case 43 -> 173;
                           case 44 -> 40;
                           case 45 -> 189;
                           case 46 -> 251;
                           case 47 -> 51;
                           case 48 -> 60;
                           case 49 -> 248;
                           case 50 -> 6;
                           case 51 -> 50;
                           case 52 -> 219;
                           case 53 -> 61;
                           case 54 -> 62;
                           case 55 -> 85;
                           case 56 -> 206;
                           case 57 -> 83;
                           case 58 -> 222;
                           case 59 -> 215;
                           case 60 -> 111;
                           case 61 -> 145;
                           case 62 -> 199;
                           case 63 -> 172;
                           case 64 -> 178;
                           case 65 -> 17;
                           case 66 -> 184;
                           case 67 -> 157;
                           case 68 -> 165;
                           case 69 -> 88;
                           case 70 -> 47;
                           case 71 -> 44;
                           case 72 -> 149;
                           case 73 -> 16;
                           case 74 -> 124;
                           case 75 -> 80;
                           case 76 -> 52;
                           case 77 -> 226;
                           case 78 -> 236;
                           case 79 -> 230;
                           case 80 -> 200;
                           case 81 -> 220;
                           case 82 -> 100;
                           case 83 -> 68;
                           case 84 -> 239;
                           case 85 -> 71;
                           case 86 -> 58;
                           case 87 -> 98;
                           case 88 -> 174;
                           case 89 -> 228;
                           case 90 -> 89;
                           case 91 -> 141;
                           case 92 -> 191;
                           case 93 -> 137;
                           case 94 -> 3;
                           case 95 -> 202;
                           case 96 -> 69;
                           case 97 -> 72;
                           case 98 -> 15;
                           case 99 -> 41;
                           case 100 -> 102;
                           case 101 -> 211;
                           case 102 -> 158;
                           case 103 -> 106;
                           case 104 -> 177;
                           case 105 -> 223;
                           case 106 -> 109;
                           case 107 -> 151;
                           case 108 -> 121;
                           case 109 -> 224;
                           case 110 -> 31;
                           case 111 -> 112;
                           case 112 -> 186;
                           case 113 -> 12;
                           case 114 -> 153;
                           case 115 -> 10;
                           case 116 -> 254;
                           case 117 -> 152;
                           case 118 -> 140;
                           case 119 -> 94;
                           case 120 -> 243;
                           case 121 -> 56;
                           case 122 -> 246;
                           case 123 -> 238;
                           case 124 -> 208;
                           case 125 -> 78;
                           case 126 -> 86;
                           case 127 -> 5;
                           case 128 -> 198;
                           case 129 -> 76;
                           case 130 -> 146;
                           case 131 -> 131;
                           case 132 -> 33;
                           case 133 -> 136;
                           case 134 -> 229;
                           case 135 -> 195;
                           case 136 -> 252;
                           case 137 -> 35;
                           case 138 -> 244;
                           case 139 -> 167;
                           case 140 -> 129;
                           case 141 -> 36;
                           case 142 -> 114;
                           case 143 -> 99;
                           case 144 -> 201;
                           case 145 -> 138;
                           case 146 -> 103;
                           case 147 -> 75;
                           case 148 -> 185;
                           case 149 -> 134;
                           case 150 -> 95;
                           case 151 -> 247;
                           case 152 -> 196;
                           case 153 -> 81;
                           case 154 -> 117;
                           case 155 -> 2;
                           case 156 -> 108;
                           case 157 -> 105;
                           case 158 -> 29;
                           case 159 -> 7;
                           case 160 -> 190;
                           case 161 -> 133;
                           case 162 -> 64;
                           case 163 -> 107;
                           case 164 -> 168;
                           case 165 -> 148;
                           case 166 -> 54;
                           case 167 -> 234;
                           case 168 -> 180;
                           case 169 -> 232;
                           case 170 -> 233;
                           case 171 -> 218;
                           case 172 -> 150;
                           case 173 -> 43;
                           case 174 -> 104;
                           case 175 -> 162;
                           case 176 -> 91;
                           case 177 -> 160;
                           case 178 -> 8;
                           case 179 -> 249;
                           case 180 -> 188;
                           case 181 -> 22;
                           case 182 -> 34;
                           case 183 -> 93;
                           case 184 -> 156;
                           case 185 -> 227;
                           case 186 -> 194;
                           case 187 -> 26;
                           case 188 -> 90;
                           case 189 -> 170;
                           case 190 -> 183;
                           case 191 -> 65;
                           case 192 -> 13;
                           case 193 -> 171;
                           case 194 -> 231;
                           case 195 -> 164;
                           case 196 -> 216;
                           case 197 -> 4;
                           case 198 -> 142;
                           case 199 -> 242;
                           case 200 -> 176;
                           case 201 -> 237;
                           case 202 -> 250;
                           case 203 -> 18;
                           case 204 -> 139;
                           case 205 -> 49;
                           case 206 -> 214;
                           case 207 -> 240;
                           case 208 -> 155;
                           case 209 -> 143;
                           case 210 -> 42;
                           case 211 -> 45;
                           case 212 -> 235;
                           case 213 -> 212;
                           case 214 -> 123;
                           case 215 -> 125;
                           case 216 -> 27;
                           case 217 -> 126;
                           case 218 -> 127;
                           case 219 -> 77;
                           case 220 -> 197;
                           case 221 -> 39;
                           case 222 -> 203;
                           case 223 -> 213;
                           case 224 -> 144;
                           case 225 -> 1;
                           case 226 -> 97;
                           case 227 -> 38;
                           case 228 -> 166;
                           case 229 -> 73;
                           case 230 -> 59;
                           case 231 -> 113;
                           case 232 -> 37;
                           case 233 -> 209;
                           case 234 -> 207;
                           case 235 -> 21;
                           case 236 -> 23;
                           case 237 -> 82;
                           case 238 -> 118;
                           case 239 -> 48;
                           case 240 -> 204;
                           case 241 -> 63;
                           case 242 -> 32;
                           case 243 -> 205;
                           case 244 -> 84;
                           case 245 -> 92;
                           case 246 -> 181;
                           case 247 -> 74;
                           case 248 -> 132;
                           case 249 -> 154;
                           case 250 -> 135;
                           case 251 -> 70;
                           case 252 -> 241;
                           case 253 -> 253;
                           case 254 -> 161;
                           default -> 217;
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
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
            );
         }
      } catch (NoWhenBranchMatchedException var3) {
         throw (RuntimeException)a(var3);
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      String var2 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      Intrinsics.checkNotNullParameter(param1, "event");
      if (this.G()) {
         net.minecraft.world.entity.LivingEntity var3 = this.bx();
         if (var3 != null) {
            boolean var4 = this.d(this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI);
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var5 = var4 ? new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(230, 100, 50) : new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(50, 180, 255);
            net.minecraft.world.phys.AABB var6 = var3.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(var6, "getBoundingBox(...)");
            me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll var7 = new me.octo.client.llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(var5.a(0.3f).o());
            me.octo.client.IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(var6, var7, null, 0.0f, null, null, 0.0f, false, 0.0f, 508, null);
         }
      }
   }

   @SubscribeEvent
   public final void e(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      String var2 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         return;
      }
      super.c(param1);
      int var4 = me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.c() % 20;
      if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Blacklisted entities: " + this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.size());
      }
      this.by();
      String var3 = me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i().y();
      if (kotlin.jvm.internal.Intrinsics.areEqual(var3, "Ignore") || kotlin.jvm.internal.Intrinsics.areEqual(var3, "Warp out")) {
         if (this.W() != me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            if (this.bA()) {
               this.a(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, 3000);
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI param1) {
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      Intrinsics.checkNotNullParameter(param1, "event");
      if (var2 == null) { return; }
      net.minecraft.client.multiplayer.ClientLevel var3l = this.ap().level;
      if (var3l == null) { return; }
      net.minecraft.world.entity.Entity var3 = var3l.getEntity(param1.l());
      if (var3 == null) { return; }
      int var4 = 0;
      if (var3.isAlive()) { return; }
      if (var3 instanceof net.minecraft.world.entity.monster.Creeper && ((net.minecraft.world.entity.monster.Creeper)var3).isPowered()) {
         net.minecraft.client.player.LocalPlayer var5 = this.ap().player;
         if (var5 != null && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var3), true) < 8.0D) {
            int var6 = this.lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl;
            this.lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl = var6 + 1;
            me.octo.client.IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("ghostKills");
         }
      }
      var3.remove(net.minecraft.world.entity.Entity.RemovalReason.DISCARDED);
   }

   public void aC() {
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 40
      // 09: invokevirtual me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0c: getstatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 0f: swap
      // 10: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ordinal ()I
      // 13: iaload
      // 14: tableswitch 94 1 4 36 51 66 82
      // 34: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 37: athrow
      // 38: aload 0
      // 39: goto 40
      // 3c: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3f: athrow
      // 40: invokespecial me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.be ()V
      // 43: aload 1
      // 44: ifnonnull 72
      // 47: aload 0
      // 48: invokespecial me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.bf ()V
      // 4b: aload 1
      // 4c: ifnonnull 72
      // 4f: goto 56
      // 52: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 55: athrow
      // 56: aload 0
      // 57: bipush 1
      // 58: invokespecial me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.e (Z)V
      // 5b: aload 1
      // 5c: ifnonnull 72
      // 5f: goto 66
      // 62: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 65: athrow
      // 66: aload 0
      // 67: bipush 0
      // 68: invokespecial me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.e (Z)V
      // 6b: goto 72
      // 6e: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 71: athrow
      // 72: return
   }

   @SubscribeEvent
   public final void c(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      String var2 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      if (!this.G()) {
         return;
      }
      net.minecraft.network.protocol.Packet var3 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (!(var3 instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket)) {
         return;
      }
      String var4 = ((net.minecraft.network.protocol.game.ClientboundSystemChatPacket) var3).content().getString();
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var4, "getString(...)");
      if (var4.startsWith("RARE DROP! Sorrow")) {
         int var5 = this.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI;
         this.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI = var5 + 1;
         return;
      }
      kotlin.text.MatchResult var6 = this.lIIlIIIlIIlIlIlllIIllIIlIIIlllIllllIlIIlIIlIIIIllIIIllIlIlIIIlIIlllIllIIIlIlIlIllIIlI.find((CharSequence)var4, 0);
      if (var6 != null) {
         String var8 = ((String) var6.getGroupValues().get(1)).replace(",", "");
         Integer var7 = kotlin.text.StringsKt.toIntOrNull(var8);
         if (var7 == null) {
            return;
         }
         int var9 = var7.intValue();
         this.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI = 0;
         this.IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll = var9;
         return;
      }
      kotlin.text.MatchResult var6b = this.lIlIIIIIIIllIlllIlIlIIIIIIIIlllllIIlllIIllIlllIIIlIIlllIlllIllIIlIllIIIlIllllllIIllII.find((CharSequence)var4, 0);
      if (var6b != null) {
         Integer var7b = kotlin.text.StringsKt.toIntOrNull((String) var6b.getGroupValues().get(1));
         if (var7b == null) {
            return;
         }
         int var8b = var7b.intValue();
         this.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI = var8b;
         return;
      }
   }

   @NotNull
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII[] var1 = new llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII[4];
      short var10011 = -13754;
      short var10012 = -2407;
      var10012 = -13724;
      short var10013 = 7143;
      var1[0] = new llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII("Sorrow", "SORROW");
      var10011 = -13715;
      var10012 = -16044;
      var10012 = -13824;
      var10013 = 29807;
      var1[1] = new llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII("Plasma", "PLASMA");
      var10011 = -13748;
      var10012 = -28318;
      var10012 = -13718;
      var10013 = 23484;
      var1[2] = new llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII("Volta", "VOLTA");
      var10011 = -13712;
      var10012 = -29544;
      var10012 = -13746;
      var10013 = 1597;
      var1[3] = new llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII("Ghostly Boots", "GHOST_BOOTS");
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(true, true, true, true, true, CollectionsKt.listOf(var1));
   }

   private final void bd() {
      this.bC();
      this.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI = 0;
      this.lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl = 0;
      this.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI = 0;
      this.IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll = 0;
      short var10001 = -13766;
      short var10002 = -22042;
      IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c("ghostKills");
      this.bi();
   }

   public void M() {
      java.util.List var16 = null;
      String var1;
      boolean var2;
      boolean var3;
      boolean var4;
      boolean var19;
      label237: {
         label241: {
            this.bd();
            String var10000 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
            this.aM();
            var1 = var10000;
            var2 = this.a5() != null;
            var3 = me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            var4 = this.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll.isEmpty();
            llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var15 = this;
            if (var1 != null) {
               if (this.X() != null) {
                  break label241;
               }

               var15 = this;
            }

            label242: {
               var var6 = var15.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll;
               boolean var7 = false;
               var16 = var6;
               label229:
               if (var1 != null) {
                  if (var6 instanceof java.util.Collection) {
                     var16 = var6;
                     if (var1 == null) {
                        break label229;
                     }

                     if (var16.isEmpty()) {
                        var19 = true;
                        break label242;
                     }
                  }

                  var16 = var6;
               }

               java.util.Iterator var8 = var16.iterator();

               label222:
               while (true) {
                  if (!var8.hasNext()) {
                     var19 = true;
                     break;
                  }

                  Object var9 = var8.next();
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var9;
                  var19 = false;

                  while (
                     var10.b()
                        == me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  ) {
                     var19 = false;
                     if (var1 != null) {
                        break label222;
                     }
                  }
               }
            }

            if (!var19) {
               var19 = false;
               break label237;
            }
         }

         var19 = true;
      }

      boolean var5 = var19;
      var19 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d()
         .al();
      if (var1 != null) {
         var19 = !var19 || this.IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl != null;
      }

      boolean var12;
      var12 = var19;
      var19 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d()
         .al();
      label201:
      if (var1 != null) {
         if (var19) {
            var19 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()
               .al();
            if (var1 == null) {
               break label201;
            }

            if (var19 && this.lllIlIIlIIlllIIllIIlIllIlllIllIIlIlllIllllllIlIllIIIIIlllIIIlIIIIllllIlIllIIllIllIlII == null) {
               var19 = false;
               break label201;
            }
         }

         var19 = true;
      }

      boolean var13;
      var13 = var19;
      var19 = var5;
      label192:
      if (var1 != null) {
         if (var5) {
            var19 = var2;
            if (var1 == null) {
               break label192;
            }

            if (var2) {
               var19 = var3;
               if (var1 == null) {
                  break label192;
               }

               if (var3) {
                  var19 = var4;
                  if (var1 == null) {
                     break label192;
                  }

                  if (!var4) {
                     var19 = var12;
                     if (var1 == null) {
                        break label192;
                     }

                     if (var12) {
                        var19 = var13;
                        if (var1 == null) {
                           break label192;
                        }

                        if (var13) {
                           llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var14 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
                              new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                                 me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                                 () -> f(this),
                                 true
                              ),
                              new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                                 me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                                 llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl::bJ,
                                 false
                              ),
                              new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                                 me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                                 llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl::bK,
                                 false
                              ),
                              new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                                 me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                                 () -> g(this),
                                 false
                              )
                           };
                           this.a(kotlin.collections.CollectionsKt.listOf(var14));
                           super.M();
                           this.a9();
                           return;
                        }
                     }
                  }
               }
            }
         }

         var19 = var5;
      }

      if (var1 != null) {
         if (!var19) {
            this.aP();
         }

         var19 = var2;
      }

      if (var1 != null) {
         if (!var19) {
            this.a_();
         }

         var19 = var3;
      }

      if (var1 != null) {
         if (!var19) {
            this.b(
               kotlin.collections.CollectionsKt.listOf(
                  me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
               )
            );
         }

         var19 = var4;
      }

      if (var1 != null) {
         if (var19) {
            IIlIIIIIllIlIIIlIllIIlIlIIIIIllIllllllllIIIIlIlIlIIIIIllIlIIlIIIIlIllIlIIllIIIIIllIlI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
               .O();
         }

         var19 = var12;
      }

      if (var1 != null) {
         if (!var19) {
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(
                  5000L,
                  this.aj(),
                  "No drill found for Gemstone Infusion!",
                  me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§cPlease put a drill in your hotbar or disable Use Drill Ability"
            );
         }

         var19 = var13;
      }

      if (!var19) {
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               5000L,
               this.aj(),
               "No fishing rod found for rod swap!",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§cPlease put a fishing rod in your hotbar or disable Rod Swap"
         );
      }

      this.N();
   }

   public void N() {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .k();
      IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
      this.bv();
      this.aN();
      super.N();
   }

   public void a9() {
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
         int var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q().getY();
         if (75 < var2 && var2 < 78) {
            this.bg();
            if (var1 != null) {
               return;
            }
         }
      }

      this.a(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, 2000);
   }

   public void aB() {
      this.a9();
   }

   public void aH() {
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(1000L, null);
   }

   public void a(@NotNull me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1, int var2) {
      short var10001 = -13703;
      short var10002 = 18293;
      Intrinsics.checkNotNullParameter(var1, "location");
      super.a(var1, var2);
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .k();
      IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
      this.bv();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private final void be() {
      Object var10000 = null; // PX-FIX
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();

      label45: {
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var6;
         label44: {
            label43: {
               try {
                  var10000 = this.aK();
                  if (var1 == null) {
                     break label43;
                  }

                  if (((Boolean)(var10000))) {
                     return;
                  }
               } catch (NoWhenBranchMatchedException var5) {
                  throw (RuntimeException)a(var5);
               }

               try {
                  var6 = this;
                  if (var1 == null) {
                     break label44;
                  }

                  var10000 = ((Object[])llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.aJ()
                     .a()
                     .ordinal()];
               } catch (NoWhenBranchMatchedException var4) {
                  throw (RuntimeException)a(var4);
               }
            }

            switch ((Integer)(var10000)) {
               case 1:
                  var6 = this;
                  break;
               case 2:
                  break label45;
               default:
                  return;
            }
         }

         try {
            var6.a(
               me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
               2000
            );
            if (var1 != null) {
               return;
            }
         } catch (NoWhenBranchMatchedException var3) {
            throw (RuntimeException)a(var3);
         }
      }

      try {
         this.bC();
         this.bB();
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }
   }

   private final void bf() {
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2 = null;
      boolean var11b = false;
      int var11 = 0;
      llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl var10000 = null;
      boolean var10b = false;
      int var10i = 0;
      String var1 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var1 != null) {
         if (this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll
            >= this.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll.size()) {
            this.bg();
            return;
         }

         var2 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)this.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll
            .get(this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll);
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var2, "get(...)");
      }

      
      int var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var2.b().ordinal()];
      if (var1 != null) {
         switch (var8) {
            case 1:
               Integer var12;
               net.minecraft.core.BlockPos var10001;
               label83: {
                  var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .f();
                  var10001 = var2.a();
                  if (var1 != null) {
                     me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10002 = this.X();
                     if (var10002 != null) {
                        var12 = var10002.b();
                        break label83;
                     }
                  }

                  var12 = null;
               }

               var10b = var10000.a(var10001, var12);
               if (var1 != null) {
                  if (!var10b) {
                     return;
                  }

                  var10i = this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll;
               }

               int var3 = var10i;
               this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll = var3 + 1;
               if (var1 != null) {
                  return;
               }
            case 2:
               double var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var2.a(), false);
               var11b = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e()
                  .d();
               label77:
               if (var1 != null) {
                  if (var11b) {
                     double var13;
                     var11 = (var13 = var6 - 1.5) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
                     if (var1 == null) {
                        break label77;
                     }

                     if (var11 < 0) {
                        int var5 = this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll++;
                        if (var1 != null) {
                           return;
                        }
                     }
                  }

                  var11b = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e()
                     .d();
               }

               if (var1 != null) {
                  if (var11 == 0) {
                     return;
                  }

                  IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e(),
                     var2.a(),
                     null,
                     false,
                     6,
                     null
                  );
               }

               if (var1 != null) {
                  return;
               }
         }

         var8 = this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll;
      }

      int var7 = var8;
      this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll = var7 + 1;
   }

   private final void bg() {
      boolean var10001b = false;
      int var2;
      int var10001 = 0;
      label49: {
         label52: {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .t();
            String var10000 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
            var2 = this.bz();
            String var1 = var10000;
            var10001b = this.bs().i();
            if (var1 != null) {
               if (!var10001b) {
                  break label52;
               }

               var10001 = var2;
            }

            if (var1 != null) {
               if (var10001 <= 3) {
                  break label52;
               }

               var10001b = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g()
                  .al();
            }

            if (var1 == null) {
               break label49;
            }

            if (var10001 != 0) {
               var10001 = 1;
               break label49;
            }
         }

         var10001 = 0;
      }

      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var10001b;
      this.a(
         this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII
            ? me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            : me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
      );
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
      this.bv();
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§aStarting Combat: "
            + (this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII ? "EDGE-CLEAR" : "REGULAR-KILL")
            + " ("
            + var2
            + " edges)"
      );
   }

   private final void bh() {
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var1 == null) {
         return;
      }

      net.minecraft.client.multiplayer.ClientLevel var2 = this.ap().level;
      if (var2 == null) {
         return;
      }

      java.util.ArrayList<net.minecraft.world.entity.monster.Creeper> var3 = new java.util.ArrayList<>(Math.max(this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl.size(), 16));
      for (net.minecraft.world.entity.Entity var5 : var2.entitiesForRendering()) {
         if (!(var5 instanceof net.minecraft.world.entity.monster.Creeper)) {
            continue;
         }

         net.minecraft.world.entity.monster.Creeper var6 = (net.minecraft.world.entity.monster.Creeper)var5;
         if (!var6.isAlive()) {
            continue;
         }

         if (!var6.isPowered()) {
            continue;
         }

         if (var6.tickCount < this.lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll) {
            continue;
         }

         if (this.d(var6)) {
            continue;
         }

         if (this.f(var6.getId())) {
            continue;
         }

         if (var6.getHealth() <= 1.4F) {
            continue;
         }

         var3.add(var6);
      }

      this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl = var3;
   }

   private final void e(boolean param1) {
      String var2 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var2 == null) {
         return;
      }
      LocalPlayer var3 = this.ap().player;
      if (var3 == null) {
         return;
      }
      this.bh();
      if (!me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g()) {
         return;
      }
      this.bj();
      if (!me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g()) {
         return;
      }
      if (this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII) {
         LivingEntity var4 = this.k(param1);
         if (var4 != null) {
            if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7a[Idle] Ghosts respawned! Stopping idle walk");
            }
            this.bF();
            this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
         } else {
            this.bG();
            return;
         }
      }
      int var8 = var3.getInventory().getSelectedSlot();
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = this.a5();
      Intrinsics.checkNotNull(var6);
      if (var8 != var6.b()) {
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var9 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = this.a5();
         Intrinsics.checkNotNull(var7);
         var9.b(var7.b());
         return;
      }
      if (IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.c() && this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI != -1) {
         if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7c[Pathfind] Walker failed for" + this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI + ", blacklisting");
         }
         this.e(this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI);
         IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
      }
      LivingEntity var5 = this.bx();
      if (!(var5 != null && !this.f(this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI) && (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() || (var5.getHealth() > 1.4F && var5.isAlive())))) {
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
         this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
      }
      if (this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI != -1 && this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI != me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl && System.currentTimeMillis() - this.llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII > this.llllIIIIIIlIllIllIlIIllIlIlIlIIIlIIIIIIIIIlIIIllIIIIlIlIlllIlIllIIIIIlIlIllIIlIIllIIl) {
         if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7c[Timeout] Couldn't finish" + this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI + " in time, skipping");
         }
         this.e(this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI);
         IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
         this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
      }
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var10 = this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
      switch (me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var10.ordinal()]) {
         case 1:
            this.f(param1);
            break;
         case 2:
            this.br();
            break;
         case 3:
            this.j(param1);
            break;
         default:
            throw new NoWhenBranchMatchedException();
      }
   }

   private final void c(int var1) {
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var1;
      this.llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII = System.currentTimeMillis();
      this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = false;
      this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 0;
      this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = -1;
      this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = false;
      this.bp();
   }

   private final void bi() {
      String var1 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var1 != null) {
         if (!me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().al()) {
            this.IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl = null;
            this.lllIlIIlIIlllIIllIIlIllIlllIllIIlIlllIllllllIlIllIIIIIlllIIIlIIIIllllIlIllIIllIllIlII = null;
            return;
         }
         me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.D();
         this.IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q();
      }
      lllIlIIlIIlllIIllIIlIllIlllIllIIlIlllIllllllIlIllIIIIIlllIIIlIIIIllllIlIllIIllIllIlII = me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().al() ? me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(false) : null;
   }

   private final void bj() {
String var1 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
if (!me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().al() || (var1 != null && !me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.e(true))) {
   return;
}
me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2;
if (var1 == null) {
   var2 = this.IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl;
   if (var2 == null) {
      return;
   }
} else {
   var2 = this.IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl;
   if (var2 == null) {
      var2 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q();
      if (var2 == null) {
         return;
      }
   }
}
if (var1 == null) {
   return;
}
me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = this.a5();
if (var10000 == null) {
   return;
}
int var3 = var10000.b();
ArrayList<Integer> var4 = new ArrayList<Integer>();
if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().al()) {
   me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = this.lllIlIIlIIlllIIllIIlIllIlllIllIIlIlllIllllllIlIllIIIIIlllIIIlIIIIllllIlIllIIllIllIlII;
   if (var5 != null) {
      int var6 = 0;
      if (var1 != null) {
         if (var5.b() != var2.b()) {
            if (!var4.contains(Integer.valueOf(var5.b()))) {
               var4.add(Integer.valueOf(var5.b()));
            }
         }
      }
   }
}
me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.o();
if (var7 != null) {
   int var8 = 0;
   if (var1 != null) {
      if (var7.b() != var2.b()) {
         if (!var4.contains(Integer.valueOf(var7.b()))) {
            var4.add(Integer.valueOf(var7.b()));
         }
      }
   }
}
var4.add(Integer.valueOf(var2.b()));
me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.w();
me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(2, me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl::bL, CollectionsKt.toList(var4), Integer.valueOf(var3));
   }

   private final void a(LivingEntity param1, boolean param2) {
      String var3 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var3 != null) {
         LocalPlayer var4 = this.ap().player;
         if (var4 != null) {
            if (!me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al()) {
               this.b(param1, param2);
            } else {
               Vec3 var5 = this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI.c(param1);
               if (var5 != null) {
                  if (var4.getEyePosition().y > param1.getBoundingBox().maxY + 0.2) {
                     me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(var5);
                  } else {
                     me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(var5, 1.0F, true);
                  }
               }
            }
         }
      }
   }

   private final void b(LivingEntity param1, boolean param2) {
      String var3 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var3 == null) {
         return;
      }

      LocalPlayer var4 = this.ap().player;
      if (var4 == null) {
         return;
      }

      double var5 = param2 ? 2.0D : 1.25D;
      Vec3 var7 = param1.getDeltaMovement().scale(var5);
      kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var7, "scale(...)");
      Vec3 var8 = new Vec3(param1.getX() + var7.x, var4.getEyePosition().y, param1.getZ() + var7.z);
      float var9 = !param2 && this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI && param1.getId() == this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll ? this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI : 0.0F;
      if (this.a(param1)) {
         me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var10 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var4.getEyePosition(), var8);
         this.a(param1.getId(), var10.a() + var9, this.bk());
      } else {
         me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var11 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(this.c(param1, param2));
         this.a(param1.getId(), var11.a() + var9, var11.b());
      }
   }

   private final void a(int var1, float var2, float var3) {
      this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl = var1;
      this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI = var2;
      this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll = var3;
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(var2, var3);
   }

   private final Vec3 c(LivingEntity var1, boolean var2) {
      double var14 = 0; // PX-FIX
      double var13 = 0; // PX-FIX
      AABB var10000 = var1.getBoundingBox();
      short var10002 = -13796;
      short var10003 = -28681;
      Intrinsics.checkNotNullExpressionValue(var10000, "getBoundingBox(...)");
      AABB var3 = var10000;
      double var4 = var3.getYsize();

      label31: {
         try {
            if (this.a(var1)) {
               var13 = 0.46;
               break label31;
            }
         } catch (NoWhenBranchMatchedException var12) {
            throw (RuntimeException)a(var12);
         }

         var13 = 0.54;
      }

      double var6 = var13;

      label23: {
         try {
            if (var2) {
               var14 = 2.0;
               break label23;
            }
         } catch (NoWhenBranchMatchedException var11) {
            throw (RuntimeException)a(var11);
         }

         var14 = 1.25;
      }

      double var8 = var14;
      Vec3 var15 = var1.getDeltaMovement().scale(var8);
      var10002 = -13803;
      var10003 = -15935;
      Intrinsics.checkNotNullExpressionValue(var15, "scale(...)");
      Vec3 var10 = var15;
      return new Vec3(var1.getX() + var10.x, var3.minY + var4 * var6, var1.getZ() + var10.z);
   }

   private final boolean a(LivingEntity param1) {
      LocalPlayer var2 = this.ap().player;
      if (var2 == null) {
         return false;
      }

      double var3 = param1.getY() - var2.getY();
      return var3 >= -0.75 && var3 <= 1.25;
   }

   private final float bk() {
      String var1 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var1 != null && this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.a((Number)this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI)) {
         this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl = (float)Random.Default.nextDouble(0.0, 5.0);
         this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl.f();
      }

      return this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 41
      // 09: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0c: aload 0
      // 0d: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI J
      // 10: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13: checkcast java/lang/Number
      // 16: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 19: ifeq 40
      // 1c: goto 23
      // 1f: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 22: athrow
      // 23: aload 0
      // 24: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
      // 27: dconst_0
      // 28: ldc2_w 5.0
      // 2b: invokevirtual kotlin/random/Random$Default.nextDouble (DD)D
      // 2e: d2f
      // 2f: putfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl F
      // 32: aload 0
      // 33: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 36: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 39: goto 40
      // 3c: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl F
      // 44: freturn
   }

   private final boolean b(LivingEntity param1) {
      String var2 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
      IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.b(true);
      boolean var3 = IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.a(IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI, param1, (Vec3)null, false, me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al(), 6, (Object)null);
      if (var2 == null) {
         return var3;
      }

      if (var3) {
         this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = param1.getEyePosition();
         this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI.f();
         return true;
      }

      if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7c[Pathfind] No path point for " + param1.getId() + ", blacklisting");
      }

      this.e(param1.getId());
      IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
      if (this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI == param1.getId()) {
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
      }

      this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
      return false;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/lang/String;
      // 03: aload 0
      // 04: bipush -1
      // 05: putfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI I
      // 08: getstatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI Lme/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll;
      // 0b: bipush 1
      // 0c: invokevirtual me/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.b (Z)V
      // 0f: getstatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI Lme/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll;
      // 12: aload 1
      // 13: aconst_null
      // 14: bipush 0
      // 15: getstatic me/octo/client/lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII;
      // 18: invokevirtual me/octo/client/lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.k ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 1b: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 1e: bipush 6
      // 20: aconst_null
      // 21: invokestatic me/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.a (Lme/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll;Ljava/lang/Object;Lnet/minecraft/world/phys/Vec3;ZZILjava/lang/Object;)Z
      // 24: istore 3
      // 25: astore 2
      // 26: iload 3
      // 27: aload 2
      // 28: ifnull c9
      // 2b: ifne b9
      // 2e: goto 35
      // 31: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 34: athrow
      // 35: getstatic me/octo/client/lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII;
      // 38: invokevirtual me/octo/client/lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.k ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 3b: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 3e: aload 2
      // 3f: ifnull 8d
      // 42: goto 49
      // 45: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 48: athrow
      // 49: ifeq 7b
      // 4c: goto 53
      // 4f: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 52: athrow
      // 53: aload 1
      // 54: invokevirtual net/minecraft/world/entity/LivingEntity.getId ()I
      // 57: sipush -13783
      // 5a: sipush 23219
      // 5d: pop2
      // 5e: ldc_w "§c[Pathfind] No path point for "
      // 61: swap
      // 62: sipush -13793
      // 65: sipush 18051
      // 68: pop2
      // 69: ldc_w ", blacklisting"
      // 6c: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 71: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // 74: goto 7b
      // 77: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 7a: athrow
      // 7b: aload 0
      // 7c: aload 1
      // 7d: invokevirtual net/minecraft/world/entity/LivingEntity.getId ()I
      // 80: invokespecial me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.e (I)V
      // 83: getstatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI Lme/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll;
      // 86: invokevirtual me/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.v ()V
      // 89: aload 0
      // 8a: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI I
      // 8d: aload 2
      // 8e: ifnull b8
      // 91: aload 1
      // 92: invokevirtual net/minecraft/world/entity/LivingEntity.getId ()I
      // 95: if_icmpne b2
      // 98: goto 9f
      // 9b: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 9e: athrow
      // 9f: aload 0
      // a0: getstatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // a3: putfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI Lme/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // a6: aload 0
      // a7: bipush -1
      // a8: putfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI I
      // ab: goto b2
      // ae: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // b1: athrow
      // b2: aload 0
      // b3: bipush -1
      // b4: putfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI I
      // b7: bipush 0
      // b8: ireturn
      // b9: aload 0
      // ba: aload 1
      // bb: invokevirtual net/minecraft/world/entity/LivingEntity.getEyePosition ()Lnet/minecraft/world/phys/Vec3;
      // be: putfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII Lnet/minecraft/world/phys/Vec3;
      // c1: aload 0
      // c2: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // c5: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // c8: bipush 1
      // c9: ireturn
   }

   private final boolean a(
      LivingEntity param1,
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI param2
   ) {
      String var3 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
      if (var3 == null) {
         return false;
      }

      List var4 = param2.d();
      if (var4 == null) {
         return false;
      }

      IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.b(true);
      boolean var5 = IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.a(IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI, param1, var4, (Vec3)null, false, me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al(), 12, (Object)null);
      if (var5) {
         this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = param1.getEyePosition();
         this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI.f();
      }

      return var5;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/lang/String;
      // 03: aload 0
      // 04: bipush -1
      // 05: putfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI I
      // 08: astore 3
      // 09: aload 3
      // 0a: ifnull 24
      // 0d: aload 2
      // 0e: invokevirtual me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.d ()Ljava/util/List;
      // 11: dup
      // 12: ifnonnull 26
      // 15: goto 1c
      // 18: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b: athrow
      // 1c: pop
      // 1d: goto 24
      // 20: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 23: athrow
      // 24: bipush 0
      // 25: ireturn
      // 26: astore 4
      // 28: getstatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI Lme/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll;
      // 2b: bipush 1
      // 2c: invokevirtual me/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.b (Z)V
      // 2f: getstatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI Lme/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll;
      // 32: aload 1
      // 33: aload 4
      // 35: aconst_null
      // 36: bipush 0
      // 37: getstatic me/octo/client/lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII;
      // 3a: invokevirtual me/octo/client/lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.k ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 3d: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 40: bipush 12
      // 42: aconst_null
      // 43: invokestatic me/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.a (Lme/octo/client/IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll;Ljava/lang/Object;Ljava/util/List;Lnet/minecraft/world/phys/Vec3;ZZILjava/lang/Object;)Z
      // 46: istore 5
      // 48: iload 5
      // 4a: aload 3
      // 4b: ifnull 70
      // 4e: ifeq 6e
      // 51: goto 58
      // 54: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 57: athrow
      // 58: aload 0
      // 59: aload 1
      // 5a: invokevirtual net/minecraft/world/entity/LivingEntity.getEyePosition ()Lnet/minecraft/world/phys/Vec3;
      // 5d: putfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII Lnet/minecraft/world/phys/Vec3;
      // 60: aload 0
      // 61: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 64: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 67: goto 6e
      // 6a: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6d: athrow
      // 6e: iload 5
      // 70: ireturn
   }

   private final void c(LivingEntity var1) {
      this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = var1.getId();
      IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var1.getEyePosition();
      this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI.f();
   }

   private final void bl() {
      IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.b(false);
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .j();
      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
   }

   private final void bm() {
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var1 != null) {
         if (!IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.a()) {
            IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
         }
      }

      this.bl();
   }

   private final void a(LivingEntity param1, double param2) {
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokespecial me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.bm ()V
      // 07: astore 4
      // 09: aload 4
      // 0b: ifnull 4a
      // 0e: dload 2
      // 0f: aload 0
      // 10: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll D
      // 13: dcmpg
      // 14: ifgt 3a
      // 17: goto 1e
      // 1a: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d: athrow
      // 1e: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 21: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 24: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 27: sipush -13781
      // 2a: sipush -31007
      // 2d: pop2
      // 2e: ldc_w "sprint"
      // 31: bipush 0
      // 32: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 35: return
      // 36: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 39: athrow
      // 3a: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 3d: aload 1
      // 3e: checkcast net/minecraft/world/entity/Entity
      // 41: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 44: bipush 0
      // 45: bipush 2
      // 46: aconst_null
      // 47: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)V
      // 4a: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 4d: sipush -13781
      // 50: sipush -31007
      // 53: pop2
      // 54: ldc_w "sprint"
      // 57: dload 2
      // 58: aload 0
      // 59: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll D
      // 5c: aload 0
      // 5d: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI D
      // 60: dadd
      // 61: dcmpl
      // 62: aload 4
      // 64: ifnull 72
      // 67: ifle 75
      // 6a: goto 71
      // 6d: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 70: athrow
      // 71: bipush 1
      // 72: goto 76
      // 75: bipush 0
      // 76: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 79: return
   }

   private final void bn() {
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g();
   }

   private final void f(boolean param1) {
      String var3 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      boolean var4 = this.a(param1, false);
      boolean var5;
      if (var3 != null) {
         if (var4) {
            return;
         }

         var5 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al();
      } else {
         var5 = var4;
      }

      LivingEntity var6;
      if (var5) {
         var6 = this.g(param1);
         if (var3 != null) {
            if (var6 == null) {
               var6 = this.i(param1);
               if (var6 == null) {
                  var6 = this.a(param1, 2);
               }
            }
         }
      } else {
         var6 = this.i(param1);
         if (var3 != null) {
            if (var6 == null) {
               var6 = this.k(param1);
            }
         }
      }

      if (var6 == null) {
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var8 = this;
         boolean var9 = false;
         if (var3 == null) {
            var8.bE();
         } else if (param1) {
            var8.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = false;
            var8.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
         } else {
            var8.bE();
         }

         return;
      }

      if (var3 != null) {
         if (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al()) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§aFound target: " + var6.getId());
         }

         this.c(var6.getId());
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         this.bn();
      }

      LocalPlayer var7 = this.ap().player;
      boolean var10 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al();
      if (var3 == null) {
         if (var10) {
            this.d(var6, param1);
         }

         return;
      }

      boolean var11;
      if (!var10) {
         var11 = this.b(var6);
      } else if (var7 == null) {
         var11 = this.b(var6);
      } else {
         Vec3 var12 = var6.getEyePosition();
         Intrinsics.checkNotNullExpressionValue(var12, "getEyePosition(...)");
         if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var12, true) - this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll > 0.0) {
            var11 = this.b(var6);
         } else if (!var7.hasLineOfSight(var6)) {
            var11 = this.b(var6);
         } else {
            llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
            this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            this.d(var6, param1);
            return;
         }
      }

      if (var11) {
         this.d(var6, param1);
      }
   }

   private final LivingEntity a(boolean param1, int param2) {
      String var3 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      ArrayList var4 = new ArrayList(this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl.size());
      ArrayList var5 = param1 ? null : new ArrayList();
      for (Creeper var7 : this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl) {
         double var8 = this.a(var7);
         if (this.a(var7, param1)) {
            var4.add(TuplesKt.to(var7, Double.valueOf(var8)));
         } else if (var5 != null && this.b(var7)) {
            var5.add(TuplesKt.to(var7, Double.valueOf(var8)));
         }
      }
      ArrayList var6;
      if (!var4.isEmpty()) {
         var6 = var4;
      } else {
         if (var5 == null) {
            return null;
         }
         var6 = var5;
      }
      if (var6.isEmpty()) {
         return null;
      }
      List var7 = (List)var6;
      if (var7.size() > 1) {
         CollectionsKt.sortWith(var7, (java.util.Comparator)new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII());
      }
      kotlin.Pair var9 = (kotlin.Pair)CollectionsKt.getOrNull(var7, param2);
      if (var9 == null) {
         var9 = (kotlin.Pair)CollectionsKt.firstOrNull(var7);
      }
      return var9 == null ? null : (LivingEntity)(Creeper)var9.getFirst();
   }

   private final LivingEntity g(boolean param1) {
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      LocalPlayer var3 = this.ap().player;
      if (var3 == null) {
         return null;
      }

      Creeper var4 = null;
      double var5 = Double.MAX_VALUE;

      for (Creeper var8 : this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl) {
         if (!this.f(var8, param1)) {
            continue;
         }

         if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var8.getEyePosition(), true) > this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll) {
            continue;
         }

         if (Math.abs((double)me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var8).a()) > this.IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI) {
            continue;
         }

         if (!var3.hasLineOfSight(var8)) {
            continue;
         }

         double var9 = this.a(var8);
         if (var9 < var5) {
            var4 = var8;
            var5 = var9;
         }
      }

      return var4;
   }

   private final boolean a(boolean param1, boolean param2) {
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      String var3 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (!me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al()) {
         return false;
      }

      if (this.ap().player == null) {
         return false;
      }

      List<Creeper> var4 = this.h(param1);
      if (!param2 && var4.size() < this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI) {
         return false;
      }

      Creeper var5 = null;
      Iterator var6 = var4.iterator();
      if (var6.hasNext()) {
         var5 = (Creeper)var6.next();
         double var7 = this.a(var5);
         while (var6.hasNext()) {
            Creeper var9 = (Creeper)var6.next();
            double var10 = this.a(var9);
            if (Double.compare(var7, var10) > 0) {
               var5 = var9;
               var7 = var10;
            }
         }
      }

      if (var5 == null) {
         return false;
      }

      this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
      this.bl();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sprint", false);
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("jump", false);
      this.c(var5.getId());
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a(this, var5, false, 2, (Object)null);
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("§b[OneTap] Holding close cluster (" + var4.size() + " ghosts)");
      }

      return true;
   }

   private final List<Creeper> h(boolean param1) {
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (!me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al()) {
         return CollectionsKt.emptyList();
      }

      List var3 = this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl;
      ArrayList var6 = new ArrayList();
      for (Object var9 : var3) {
         Creeper var10 = (Creeper)var9;
         if (this.f((LivingEntity)var10, param1)
            && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var10.getEyePosition(), true) < this.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl) {
            var6.add(var9);
         }
      }

      return (List)var6;
   }

   private final LivingEntity i(boolean var1) {
      Object var23 = null; // PX-FIX
      double var22 = 0; // PX-FIX
      double var21 = 0; // PX-FIX
      double var20 = 0; // PX-FIX
      Creeper var3 = null;
      String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      double var4 = Double.MAX_VALUE;
      String var2 = var10000;
      Iterator var6 = this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl.iterator();

      label73:
      while (true) {
         boolean var17 = var6.hasNext();

         while (var17) {
            Creeper var18 = (Creeper)var6.next();
            if (var2 == null) {
               return var18;
            }

            Creeper var7 = var18;
            var17 = this.f(var7, var1);
            if (var2 != null) {
               if (!var17) {
                  continue label73;
               }

               me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var19 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               Vec3 var10001 = var7.getEyePosition();
               short var10003 = -13823;
               short var10004 = -12075;
               Intrinsics.checkNotNullExpressionValue(var10001, "getEyePosition(...)");
               double var8 = var19.b(var10001, true);

               label61: {
                  try {
                     var20 = var8;
                     if (var2 == null) {
                        break label61;
                     }

                     if (var8 > this.IlIllIIIIIIIIIIlIllIIlIlIlIllIIIlIIIIllIlllllIIIlIIIIIIlIllIIlIIlIIIIIIllIIllllllIlII) {
                        continue label73;
                     }
                  } catch (NoWhenBranchMatchedException var16) {
                     throw (RuntimeException)a(var16);
                  }

                  var20 = Math.abs(
                     (double)me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var7)
                        .a()
                  );
               }

               double var10 = var20;

               label54: {
                  try {
                     var21 = var10;
                     var23 = this.IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI;
                     if (var2 == null) {
                        break label54;
                     }

                     if (var10 > this.IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI) {
                        continue label73;
                     }
                  } catch (NoWhenBranchMatchedException var15) {
                     throw (RuntimeException)a(var15);
                  }

                  var21 = var8;
                  var23 = var10 / 20.0;
               }

               double var12 = var21 + ((Double)var23);

               label47: {
                  try {
                     var22 = var12;
                     if (var2 == null) {
                        break label47;
                     }

                     if (!(var12 < var4)) {
                        continue label73;
                     }
                  } catch (NoWhenBranchMatchedException var14) {
                     throw (RuntimeException)a(var14);
                  }

                  var3 = var7;
                  var22 = var12;
               }

               var4 = var22;
               if (var2 != null) {
                  continue label73;
               }
               break;
            }
         }

         return var3;
      }
   }

   private final void d(LivingEntity param1, boolean param2) {
      String var3 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      boolean var4 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al();
      boolean var5 = false;
      if (var3 != null) {
         if (!var4) {
            return;
         }

         if (this.IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl) {
            if (this.llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI == param1.getId()) {
               return;
            }
         } else {
            var5 = true;
         }
      } else {
         var5 = !var4;
      }

      if (var5) {
         boolean var6 = false;

         for (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7 : this.IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl) {
            if (var3 != null) {
               if (var7.a() != param1.getId()) {
                  continue;
               }
            } else if (var7.a() == 0) {
               continue;
            }

            var6 = true;
            break;
         }

         if (var6) {
            return;
         }
      }

      BlockPos var8;
      synchronized (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
         var8 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a((net.minecraft.world.entity.Entity)param1);
      }

      if (var8 == null) {
         return;
      }

      Vec3 var9 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var8);
      kotlin.sequences.Sequence var10 = kotlin.sequences.SequencesKt.mapNotNull(
         kotlin.sequences.SequencesKt.filter(
            kotlin.sequences.SequencesKt.filter(
               CollectionsKt.asSequence((Iterable)this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl),
               (Function1)(var11 -> llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a(param1, (Creeper)var11))
            ),
            (Function1)(var12 -> llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a(this, param2, (Creeper)var12))
         ),
         (Function1)(var13 -> llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.g((Creeper)var13))
      );
      List var14 = kotlin.sequences.SequencesKt.toList(
         kotlin.sequences.SequencesKt.take(
            kotlin.sequences.SequencesKt.sortedWith(var10, (java.util.Comparator)(new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll(var9))),
            3
         )
      );
      boolean var15 = var14.isEmpty();
      int var16;
      if (var3 == null) {
         var16 = var15 ? 1 : 0;
      } else {
         if (var15) {
            return;
         }

         var16 = ++this.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII;
      }

      int var17 = param1.getId();
      this.llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI = var17;
      this.IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl = true;
      this.IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl = CollectionsKt.emptyList();
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(() -> llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a(var14, var9, this, var17, var16, var8));
   }

   private final boolean e(LivingEntity param1, boolean param2) {
      String var3 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var3 != null && llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a(this, param2, false, 2, (Object)null)) {
         return true;
      }

      List var4 = this.IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl;
      ArrayList var6 = new ArrayList();
      for (Object var7 : var4) {
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var8 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var7;
         if (var8.a() == param1.getId()) {
            var6.add(var7);
         }
      }

      List var5 = CollectionsKt.sortedWith((Iterable)var6, (java.util.Comparator)(new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII()));
      for (Object var9 : var5) {
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var9;
         net.minecraft.world.entity.Entity var11 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var10.b());
         if (!(var11 instanceof LivingEntity)) {
            continue;
         }
         LivingEntity var12 = (LivingEntity)var11;
         if (this.f(var12, param2) && this.a(var12, param2, var10)) {
            return true;
         }
      }

      LivingEntity var13 = this.g(param2);
      if (var13 == null) {
         var13 = this.k(param2);
      }
      if (var13 == null) {
         return false;
      }
      return this.a(var13, param2, (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)null);
   }

   private final boolean a(
      LivingEntity param1,
      boolean param2,
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI param3
   ) {
      String var4 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var4 == null) {
         return false;
      }

      LocalPlayer var5 = this.ap().player;
      if (var5 == null) {
         return false;
      }

      this.c(param1.getId());
      double var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1.getEyePosition(), true);
      if (var6 <= this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll && var5.hasLineOfSight((net.minecraft.world.entity.Entity)param1)) {
         this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         this.d(param1, param2);
         return true;
      }

      if (param3 != null && this.a(param1, param3)) {
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         this.d(param1, param2);
         return true;
      }

      if ((param3 != null && param3.c()) || this.d(param1)) {
         this.c(param1);
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         this.d(param1, param2);
         return true;
      }

      if (this.b(param1)) {
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         this.d(param1, param2);
         return true;
      }

      return false;
   }

   private final void b(LivingEntity param1, double param2) {
      String var4 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var4 == null) {
         return;
      }

      if (param2 > this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll + this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI) {
         this.bo();
         this.b(param1);
         return;
      }

      if (!this.e(param1)) {
         this.bo();
         this.b(param1);
         return;
      }

      this.bl();
      if (!this.g(param1)) {
         this.a(param1, false);
         this.f(param1, param2);
      }

      if (param2 <= this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll) {
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
   }

   private final boolean d(LivingEntity param1) {
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      LocalPlayer var3 = this.ap().player;
      if (var3 == null) { return false; }
      double var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1.getEyePosition(), true);
      return var2 != null && var4 <= this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl && var3.hasLineOfSight((net.minecraft.world.entity.Entity)param1);
   }

   private final boolean e(LivingEntity param1) {
      return h(param1) || this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI.c((LivingEntity)param1) != null;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.h (Lnet/minecraft/world/entity/LivingEntity;)Z
      // 09: aload 2
      // 0a: ifnull 31
      // 0d: ifne 29
      // 10: goto 17
      // 13: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 16: athrow
      // 17: aload 0
      // 18: getfield me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI Lme/octo/client/IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII;
      // 1b: aload 1
      // 1c: invokevirtual me/octo/client/IlllIIIIlIIIllIIlIllIIIllIIlIllIIIllIIlIIlIlIlIIIIllIlIIlIIIIIIIlIIlIIIlIlIIIlIIllIII.c (Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/phys/Vec3;
      // 1f: ifnull 34
      // 22: goto 29
      // 25: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 31
      // 2d: invokestatic me/octo/client/llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 30: athrow
      // 31: goto 35
      // 34: bipush 0
      // 35: ireturn
   }

   private final void bo() {
      IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.b(true);
      this.bn();
      this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = false;
      this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 0;
   }

   private final boolean c(LivingEntity param1, double param2) {
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      String var4 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (param2 > this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl) { return false; }
      if (this.h(param1) || this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI.c((LivingEntity)param1) != null) { this.bp(); return false; }
      if (this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII != param1.getId()) { this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = param1.getId(); this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl.f(); this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.f(); this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = 0; if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) { me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7e[Target] No visible point for " + param1.getId() + ", trying angle recovery"); } }
      if (!this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl.a(Long.valueOf(this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII))) { this.d(param1, param2); return true; }
      if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) { me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7c[Target] No visible point for " + param1.getId() + " after recovery, blacklisting"); }
      this.e(param1.getId());
      this.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
      this.bn();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
      this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = false;
      this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 0;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
      this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
      return true;
   }

   private final void bp() {
      this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = -1;
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl.f();
      this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.f();
      this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = 0;
   }

   private final void d(LivingEntity var1, double var2) {
      this.e(var1, var2);
   }

   private final void e(net.minecraft.world.entity.LivingEntity var1, double var2) {
      boolean var14b = false;
      int var10i = 0;
      boolean var13b = false;
      byte var13 = 0;
      String var4 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var4 != null) {
         net.minecraft.client.player.LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            net.minecraft.client.player.LocalPlayer var5;
            label195: {
               var5 = var10000;
               boolean var10b = IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.a();
               if (var4 != null) {
                  if (!var10b) {
                     IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
                  }

                  IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.b(false);
                  this.bn();
                  if (var4 == null) {
                     break label195;
                  }

                  var10i = this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
               }

               if (var10i != var1.getId()) {
                  this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = var1.getId();
                  this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = 0;
                  this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.f();
               }

               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .p();
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("sneak", false);
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(
                     "jump",
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .j()
                  );
               me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a(1.0F);
               me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               net.minecraft.world.phys.Vec3 var10001 = var1.getBoundingBox().getCenter();
               kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10001, "getCenter(...)");
               var11.a(var10001);
            }

            double var6;
            me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var12 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            net.minecraft.world.phys.Vec3 var15 = var1.getBoundingBox().getCenter();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var15, "getCenter(...)");
            var6 = Math.abs((double)var12.c(var15).a());
            var13b = var5.horizontalCollision;
            label181:
            if (var4 != null) {
               if (!var5.horizontalCollision) {
                  var13b = me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .k();
                  if (var4 == null) {
                     break label181;
                  }

                  if (!var13b) {
                     var13 = 0;
                     break label181;
                  }
               }

               var13 = 1;
            }

            byte var8 = var13;
            int var14 = this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
            if (var4 != null) {
               if (this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII == 0) {
                  double var20;
                  int var16 = (
                           var20 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a((net.minecraft.world.entity.Entity)var1)
                                 .a()
                              - 0.0
                        )
                        == 0.0
                     ? 0
                     : (var20 < 0.0 ? -1 : 1);
                  if (var4 != null) {
                     var16 = var16 < 0 ? -1 : 1;
                  }

                  this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = var16;
               }

               var14 = var8;
            }

            label172:
            if (var4 != null) {
               if (var14b) {
                  var14b = this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.a((Number) 400);
                  if (var4 == null) {
                     break label172;
                  }

                  if (var14b) {
                     this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII *= -1;
                     this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.f();
                  }
               }

               double var21;
               var14 = (var21 = var6 - 70.0) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
            }

            if (var4 != null) {
               var14 = var14 < 0 ? 1 : 0;
            }

            int var9;
            int var10002;
            var9 = var14;
            var10002 = var9;
            label164:
            if (var4 != null) {
               if (var9 == 0) {
                  var10002 = var8;
                  if (var4 == null) {
                     break label164;
                  }

                  if (var8 == 0) {
                     var10002 = 0;
                     break label164;
                  }
               }

               var10002 = 1;
            }

            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("forward", var10002 != 0);
            if (var8 != 0) {
               var10002 = this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
               if (var4 != null) {
                  var10002 = this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII < 0 ? 1 : 0;
               }

               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("left", var10002 != 0);
               var10002 = this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
               if (var4 != null) {
                  var10002 = this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII > 0 ? 1 : 0;
               }

               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("right", var10002 != 0);
            }

            label155: {
               label198: {
                  var10002 = var9;
                  if (var4 != null) {
                     if (var9 == 0) {
                        break label198;
                     }

                     var10002 = var8;
                  }

                  if (var4 != null) {
                     if (var10002 != 0) {
                        break label198;
                     }

                     double var22;
                     var10002 = (var22 = var2 - this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll) == 0.0
                        ? 0
                        : (var22 < 0.0 ? -1 : 1);
                  }

                  if (var4 == null) {
                     break label155;
                  }

                  if (var10002 > 0) {
                     var10002 = 1;
                     break label155;
                  }
               }

               var10002 = 0;
            }

            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sprint", var10002 != 0);
            return;
         }
      }
   }

   private final boolean f(LivingEntity param1) {
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      LocalPlayer var3 = this.ap().player;
      if (var3 == null) { return false; }
      Vec3 var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var3);
      Vec3 var5 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)param1);
      double var6 = var5.x - var4.x;
      double var8 = var5.z - var4.z;
      double var10 = Math.hypot(var6, var8);
      if (var10 < 0.001) { return true; }
      double var12 = kotlin.ranges.RangesKt.coerceAtLeast(var10 - 1.5, 0.0);
      Vec3 var14 = new Vec3(var4.x + var6 / var10 * var12, var5.y, var4.z + var8 / var10 * var12);
      return me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var4, var14, Vec3.ZERO, 120, false, 0.0, true, true, 0.0, 304, (Object)null);
   }

   private final double bq() {
String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
if (var1 != null && this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.a((Number)this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll)) {
   this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = Random.Default.nextDouble(2.8, 3.0);
   this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = Random.Default.nextDouble(-0.1, 0.0);
   if (var1 != null && me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll.f();
      String var2 = "%.2f";
      Object[] var3 = new Object[]{Double.valueOf(this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI)};
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a77[OneTap] reach=" + String.format(var2, java.util.Arrays.copyOf(var3, var3.length)));
   }
}
return this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   }

   private final void f(LivingEntity param1, double param2) {
      String var4 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var4 != null) {
         LocalPlayer var5 = this.ap().player;
         if (var5 != null && (var5.hasLineOfSight((net.minecraft.world.entity.Entity)param1) || this.h(param1))) {
            if (this.a(param1)) {
               this.g(param1, param2);
            } else {
               this.h(param1, param2);
            }
         }
      }
   }

   private final void g(net.minecraft.world.entity.LivingEntity var1, double var2) {
      Object var45 = null;
      int var46 = 0;
      int var49 = 0;
      int var51 = 0;
      int var53 = 0;
      int var54 = 0;
      int var57 = 0;
      String var4 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var4 != null) {
         net.minecraft.client.player.LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            net.minecraft.client.player.LocalPlayer var5;
            double var6;
            net.minecraft.world.phys.Vec3 var8;
            double var9;
            label318: {
               double var10001;
               label317: {
                  label316: {
                     var5 = var10000;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .p();
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("sneak", false);
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(
                           "jump",
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .j()
                        );
                     var6 = this.bq();
                     var8 = this.c(var1, false);
                     var9 = Math.abs(
                        (double)me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .c(var8)
                           .a()
                     );
                     int var44 = this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
                     if (var4 != null) {
                        if (this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII != var1.getId()) {
                           break label316;
                        }

                        var45 = this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
                        var10001 = 0.0;
                        if (var4 == null) {
                           break label317;
                        }

                        double var70;
                        var44 = (var70 = this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI - 0.0) == 0.0
                           ? 0
                           : (var70 < 0.0 ? -1 : 1);
                     }

                     if (var44 >= 0) {
                        var45 = this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
                        var10001 = var9;
                        break label317;
                     }
                  }

                  var46 = (int)(0.0);
                  break label318;
               }

               var46 = (int)(((Number) (Object) var45).doubleValue() - var10001);
            }

            label305: {
               double var11;
               label304: {
                  var11 = var46;
                  llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var47 = this;
                  if (var4 != null) {
                     if (this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII == var1.getId()
                        && !(Math.abs(var11) > this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll)) {
                        break label304;
                     }

                     var47 = this;
                  }

                  var47.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = 0.0;
                  if (var4 != null) {
                     break label305;
                  }
               }

               this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI
                     * var11
                  + (1.0 - this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI)
                     * this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
            }

            label295: {
               this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = var9;
               this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = var1.getId();
               double var48 = this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
               double var60 = this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
               if (var4 != null) {
                  if (this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll
                     <= this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll) {
                     var49 = (int)(Double.MAX_VALUE);
                     break label295;
                  }

                  var48 = var9;
                  var60 = this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
               }

               var49 = (int)(var48 / var60);
            }

            double var13;
            net.minecraft.world.phys.Vec3 var15;
            double var16;
            double var18;
            double var22;
            double var24;
            label289: {
               var13 = var49;
               var15 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var5);
               var16 = var8.x;
               var18 = var8.z;
               double var20 = var16 - var15.x;
               var22 = var18 - var15.z;
               var24 = Math.hypot(var20, var22);
               double var50 = var24;
               double var61 = 0.001;
               if (var4 != null) {
                  if (!(var24 > 0.001)) {
                     var51 = (int)(0.0);
                     break label289;
                  }

                  var50 = var20;
                  var61 = var24;
               }

               var51 = (int)(var50 / var61);
            }

            double var26;
            label283: {
               var26 = var51;
               double var52 = var24;
               double var62 = 0.001;
               if (var4 != null) {
                  if (!(var24 > 0.001)) {
                     var53 = (int)(0.0);
                     break label283;
                  }

                  var52 = var22;
                  var62 = var24;
               }

               var53 = (int)(var52 / var62);
            }

            net.minecraft.world.phys.Vec3 var30;
            net.minecraft.world.phys.Vec3 var31;
            net.minecraft.world.phys.Vec3 var32;
            double var28 = var53;
            var30 = new net.minecraft.world.phys.Vec3(var16 - var26 * var6, var15.y, var18 - var28 * var6);
            var31 = new net.minecraft.world.phys.Vec3(var16, var15.y, var18);
            var32 = new net.minecraft.world.phys.Vec3(var15.x + var5.getDeltaMovement().x, var15.y, var15.z + var5.getDeltaMovement().z);
            var54 = (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() ? 1 : 0);
            label277:
            if (var4 != null) {
               if (var54 != 0) {
                  var54 = (this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI ? 1 : 0);
                  if (var4 == null) {
                     break label277;
                  }

                  if (this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI) {
                     var54 = var1.getId();
                     if (var4 == null) {
                        break label277;
                     }

                     if (var54 == this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll) {
                        this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = false;
                        this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 0;
                        double var33 = var5.getEyePosition().distanceTo(var8);
                        if (var4 != null) {
                           if (!(var33 <= var6)) {
                              boolean[] var35 = this.a(var32, var31, true, true, false);
                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a("forward", var35[0]);
                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a("backward", var35[1]);
                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a("left", var35[2]);
                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a("right", var35[3]);
                              double var71;
                              int var10002 = (
                                       var71 = var33 - (var6 + this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI)
                                    )
                                    == 0.0
                                 ? 0
                                 : (var71 < 0.0 ? -1 : 1);
                              if (var4 != null) {
                                 var10002 = var10002 > 0 ? 1 : 0;
                              }

                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a("sprint", (var10002 != 0));
                              return;
                           }

                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a("sprint", false);
                        }

                        return;
                     }
                  }
               }

               double var72;
               var54 = (var72 = var2 - var6) == 0.0 ? 0 : (var72 < 0.0 ? -1 : 1);
            }

            if (var54 > 0) {
               this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = false;
               this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 0;
               double var73;
               int var69 = (var73 = var9 - this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI) == 0.0
                  ? 0
                  : (var73 < 0.0 ? -1 : 1);
               if (var4 != null) {
                  var69 = var69 >= 0 ? 1 : 0;
               }

               boolean[] var41 = (this.a(var32, var30, true, (var69 != 0), false));
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("forward", var41[0]);
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("backward", var41[1]);
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("left", var41[2]);
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("right", var41[3]);
               double var74;
               int var68 = (var74 = var2 - (var6 + this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI)) == 0.0
                  ? 0
                  : (var74 < 0.0 ? -1 : 1);
               if (var4 != null) {
                  var68 = var68 > 0 ? 1 : 0;
               }

               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("sprint", (var68 != 0));
               return;
            }

            net.minecraft.world.phys.Vec3 var55 = var5.getDeltaMovement();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var55, "getDeltaMovement(...)");
            net.minecraft.world.phys.Vec3 var40 = var55;
            net.minecraft.world.phys.Vec3 var56 = var1.getDeltaMovement();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var56, "getDeltaMovement(...)");
            net.minecraft.world.phys.Vec3 var34 = var56;
            double var42 = this.a(var15.x - var16, var15.z - var18, var40.x - var34.x, var40.z - var34.z, var6);
            double var75;
            var57 = (var75 = var9 - this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII) == 0.0
               ? 0
               : (var75 < 0.0 ? -1 : 1);
            label266:
            if (var4 != null) {
               if (var57 > 0) {
                  double var76;
                  var57 = (var76 = var13 - (var42 - this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll)) == 0.0
                     ? 0
                     : (var76 < 0.0 ? -1 : 1);
                  if (var4 == null) {
                     break label266;
                  }

                  if (var57 > 0) {
                     var57 = 0;
                     break label266;
                  }
               }

               var57 = 1;
            }

            int var63;
            label258: {
               int var37 = var57;
               var63 = (this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII ? 1 : 0);
               if (var4 != null) {
                  if (this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII) {
                     double var77;
                     var63 = (var77 = var9 - this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII) == 0.0
                        ? 0
                        : (var77 < 0.0 ? -1 : 1);
                     if (var4 != null) {
                        var63 = var63 > 0 ? 1 : 0;
                     }
                     break label258;
                  }

                  var63 = var37;
               }

               if (var4 != null) {
                  var63 = var63 == 0 ? 1 : 0;
               }
            }

            this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = (var63 != 0);
            if (var4 != null) {
               if (!this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII) {
                  this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = 0;
                  double var78;
                  int var10004 = (var78 = var9 - this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI) == 0.0
                     ? 0
                     : (var78 < 0.0 ? -1 : 1);
                  if (var4 != null) {
                     var10004 = var10004 >= 0 ? 1 : 0;
                  }

                  boolean[] var43 = (this.a(var32, var31, true, (var10004 != 0), false));
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("forward", var43[0]);
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("backward", var43[1]);
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("left", var43[2]);
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("right", var43[3]);
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("sprint", false);
                  return;
               }

               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("sprint", false);
            }

            label327: {
               double var38 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .c(var8)
                  .a();
               llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var58 = this;
               if (var4 != null) {
                  if (this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII != 0) {
                     double var79;
                     int var59 = (var79 = var38 - 0.0) == 0.0 ? 0 : (var79 < 0.0 ? -1 : 1);
                     if (var4 != null) {
                        var59 = var59 < 0 ? 1 : 0;
                     }

                     var63 = this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
                     if (var4 != null) {
                        var63 = this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII < 0 ? 1 : 0;
                     }

                     if (var59 == var63) {
                        break label327;
                     }
                  }

                  var58 = this;
               }

               double var80;
               var63 = (var80 = var38 - 0.0) == 0.0 ? 0 : (var80 < 0.0 ? -1 : 1);
               if (var4 != null) {
                  var63 = var63 < 0 ? -1 : 1;
               }

               var58.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = var63;
            }

            int var66 = this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
            if (var4 != null) {
               var66 = this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII < 0 ? 1 : 0;
            }

            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("left", (var66 != 0));
            var66 = this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
            if (var4 != null) {
               var66 = this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII > 0 ? 1 : 0;
            }

            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("right", (var66 != 0));
            return;
         }
      }
   }

   private final boolean[] a(Vec3 param1, Vec3 param2, boolean param3, boolean param4, boolean param5) {
      String var6 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      LocalPlayer var7 = this.ap().player;
      if (var7 == null) {
         return this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl.get(0);
      }
      double var8 = param2.x - param1.x;
      double var10 = param2.z - param1.z;
      if (var8 * var8 + var10 * var10 < 1.0E-6) {
         return this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl.get(0);
      }
      float var12 = (float)Math.toDegrees(Math.atan2(-var8, var10));
      boolean[] var13 = this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl.get(0);
      double var14 = Double.POSITIVE_INFINITY;
      for (boolean[] var17 : this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl) {
         if (var17[0] || !param3) {
            if (var17[1] || !param5) {
               if (var17[2] || var17[3] || param4) {
                  float var18 = var7.getYRot();
                  if (var17[0] ? !var17[2] : var17[1] && !var17[2]) {
                     var18 -= 45.0F;
                  }
                  if (var17[3]) {
                     var18 += 45.0F;
                  }
                  if (var17[1] && !var17[2]) {
                     var18 -= 180.0F;
                  } else if (var17[2] && !var17[3]) {
                     var18 -= 90.0F;
                  } else if (var17[3]) {
                     var18 += 90.0F;
                  }
                  double var21 = (double)Math.abs(me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(var18 - var12));
                  if (var17[1]) {
                     var21 += this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
                  }
                  if (var17[0] || var17[2] || var17[3]) {
                     var21 += this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
                  }
                  if (var17[0]) {
                     var21 -= this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
                  }
                  if (java.util.Arrays.equals(var17, this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI)) {
                     var21 -= this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
                  }
                  var14 = var21 < var14 ? var21 : var14;
                  var13 = var21 < var14 ? var17 : var13;
               }
            }
         }
      }
      this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI = var13;
      return var13;
   }

   private final double a(double param1, double param3, double param5, double param7, double param9) {
String var11 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
double var12 = param5 * param5 + param7 * param7;
if (var12 < 1.0E-9) { return Double.MAX_VALUE; }
double var14 = 2.0 * (param1 * param5 + param3 * param7);
double var16 = param1 * param1 + param3 * param3 - param9 * param9;
double var18 = var14 * var14 - 4.0 * var12 * var16;
if (var18 < 0.0) { return Double.MAX_VALUE; }
double var20 = (-var14 + Math.sqrt(var18)) / (2.0 * var12);
return var20 > 0.0 ? var20 : Double.MAX_VALUE;
   }

   private final void h(net.minecraft.world.entity.LivingEntity var1, double var2) {
      boolean var11b = false;
      String var4;
      double var5;
      double var7;
      int var11;
      label132: {
         label135: {
            String var10000 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
            me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var10001 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            net.minecraft.world.phys.Vec3 var10002 = var1.getEyePosition();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10002, "getEyePosition(...)");
            var5 = var10001.c(var10002).a();
            var4 = var10000;
            var7 = Math.abs(var5);
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .p();
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sneak", false);
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a(
                  "jump",
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .j()
               );
            double var15;
            var11 = (var15 = var2 - this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll) == 0.0
               ? 0
               : (var15 < 0.0 ? -1 : 1);
            if (var4 != null) {
               if (var11 > 0) {
                  break label135;
               }

               double var16;
               var11 = (var16 = var7 - this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl) == 0.0
                  ? 0
                  : (var16 < 0.0 ? -1 : 1);
            }

            if (var4 != null) {
               if (var11 < 0) {
                  break label135;
               }

               var11b = a(this, var1, 0.0, 2, null);
            }

            if (var4 == null) {
               break label132;
            }

            if (var11 == 0) {
               var11 = 1;
               break label132;
            }
         }

         var11 = 0;
      }

      int var9;
      label116: {
         label136: {
            var9 = var11;
            double var17;
            var11 = (var17 = var2 - this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII) == 0.0
               ? 0
               : (var17 < 0.0 ? -1 : 1);
            if (var4 != null) {
               if (var11 > 0) {
                  break label136;
               }

               double var18;
               var11 = (var18 = var7 - this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl) == 0.0
                  ? 0
                  : (var18 < 0.0 ? -1 : 1);
            }

            if (var4 != null) {
               if (var11 < 0) {
                  break label136;
               }

               double var19;
               var11 = (var19 = var7 - this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl) == 0.0
                  ? 0
                  : (var19 < 0.0 ? -1 : 1);
            }

            if (var4 != null) {
               if (var11 >= 0) {
                  break label136;
               }

               var11b = a(this, var1, 0.0, 2, null);
            }

            if (var4 == null) {
               break label116;
            }

            if (var11 == 0) {
               var11 = 1;
               break label116;
            }
         }

         var11 = 0;
      }

      label137: {
         int var10 = var11;
         var11 = var9;
         if (var4 != null) {
            if (var9 != 0) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("backward", true);
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a("sprint", false);
               if (var4 != null) {
                  break label137;
               }
            }

            var11 = var10;
         }

         if (var11 != 0) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sprint", false);
            if (var4 != null) {
               break label137;
            }
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("forward", true);
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("sprint", true);
      }

      double var20;
      var11 = (var20 = var7 - this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
      if (var4 != null) {
         if (var11 < 0) {
            return;
         }

         double var21;
         var11 = (var21 = var5 - 0.0) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
      }

      if (var11 < 0) {
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("left", true);
         if (var4 != null) {
            return;
         }
      }

      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a("right", true);
   }

   private final boolean g(LivingEntity param1) {
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      LocalPlayer var3 = this.ap().player;
      if (var3 == null) { return false; }
      if (!me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al()) { return false; }
      if (!this.a(param1)) { return false; }
      double var4 = Math.hypot(param1.getX() - var3.getX(), param1.getZ() - var3.getZ());
      boolean var6 = var3.getBoundingBox().intersects(param1.getBoundingBox().inflate(0.08));
      if (var4 > this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII || !var6) { return false; }
      this.bn();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", false);
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("jump", false);
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sprint", false);
      double var7 = (double)me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(param1.getEyePosition()).a();
      double var9 = Math.abs(var7);
      if (var9 > 120.0) { me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("forward", true); } else { me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("backward", true); }
      if (var9 >= 35.0) { if (var7 >= 0.0) { me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("left", true); } else { me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("right", true); } }
      return true;
   }

   private final LivingEntity i(LivingEntity param1, double param2) {
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      LocalPlayer var3 = this.ap().player;
      if (var3 == null) { return null; }
      double var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(param1.getEyePosition(), true);
      float var5 = var3.getYRot();
      Creeper var6 = null;
      double var7 = 0.0;
      for (Creeper var8 : this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl) {
         if (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a(this, var8) && llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.b(param1, var8) && llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.b(this, var8) && llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a(var3, var5, param2, var8) && llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.a(var4, var8)) {
            double var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var8.getEyePosition(), true);
            if (var6 == null || Double.compare(var7, var9) > 0) { var6 = var8; var7 = var9; } } }
      return var6;
   }

   private final void br() {
      lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var14 = null;
      int var18 = 0;
      int var19 = 0;
      String var1 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var10000 = this;
      if (var1 != null) {
         net.minecraft.world.entity.LivingEntity var11 = this.bx();
         if (var11 != null) {
            net.minecraft.world.entity.LivingEntity var2 = var11;
            if (var1 != null && this.ap().player != null) {
               net.minecraft.world.phys.Vec3 var12 = var2.getEyePosition();
               kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var12, "getEyePosition(...)");
               net.minecraft.world.phys.Vec3 var4 = var12;
               double var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(var4, true);
               int var13 = (a(
                  this,
                  this.W()
                     == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  false,
                  2,
                  null
               ) ? 1 : 0);
               if (var1 != null) {
                  if (var13 != 0) {
                     return;
                  }

                  var13 = (this.c(var2, var9) ? 1 : 0);
               }

               if (var1 != null) {
                  if (var13 != 0) {
                     return;
                  }

                  var13 = (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() ? 1 : 0);
               }

               label456:
               if (var1 != null) {
                  if (var13 != 0) {
                     this.d(
                        var2,
                        this.W()
                           == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     );
                     var13 = this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI;
                     if (var1 == null) {
                        break label456;
                     }

                     if (this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI == var2.getId()) {
                        this.b(var2, var9);
                        return;
                     }
                  }

                  var13 = (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() ? 1 : 0);
               }

               label448:
               if (var1 != null) {
                  if (var13 != 0) {
                     var13 = (this.a(var2) ? 1 : 0);
                     if (var1 == null) {
                        break label448;
                     }

                     if (var13 != 0) {
                        double var21;
                        var13 = (var21 = var9 - this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII) == 0.0
                           ? 0
                           : (var21 < 0.0 ? -1 : 1);
                        if (var1 == null) {
                           break label448;
                        }

                        if (var13 <= 0) {
                           var13 = (this.e(var2) ? 1 : 0);
                           if (var1 == null) {
                              break label448;
                           }

                           if (var13 == 0) {
                              var13 = (this.f(var2) ? 1 : 0);
                              if (var1 == null) {
                                 break label448;
                              }

                              if (var13 != 0) {
                                 this.e(var2, var9);
                                 return;
                              }
                           }
                        }
                     }
                  }

                  double var22;
                  var13 = (var22 = var9 - 6.5) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
               }

               label432:
               if (var1 != null) {
                  label430: {
                     if (var13 > 0) {
                        this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl
                           .a(this.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl);
                        if (var1 == null) {
                           break label432;
                        }

                        if (var13 != 0) {
                           net.minecraft.world.entity.LivingEntity var7 = this.i(var2, 35.0);
                           var14 = this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl;
                           if (var1 == null) {
                              break label430;
                           }

                           this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl.f();
                           if (var7 != null) {
                              net.minecraft.world.entity.LivingEntity var10001;
                              label473: {
                                 boolean var15 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .k()
                                    .al();
                                 if (var1 != null) {
                                    if (var15) {
                                       me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                                          "§e[Pathfind] FOV retarget to closer ghost " + var7.getId()
                                       );
                                    }

                                    this.c(var7.getId());
                                    IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
                                    var10000 = this;
                                    var10001 = var7;
                                    if (var1 == null) {
                                       break label473;
                                    }

                                    var15 = this.b(var7);
                                 }

                                 if (!var15) {
                                    return;
                                 }

                                 var10000 = this;
                                 var10001 = var7;
                              }

                              var10000.d(
                                 var10001,
                                 this.W()
                                    == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              );
                              return;
                           }
                        }
                     }

                     var14 = this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI;
                  }

                  var13 = (var14.a((Number)(Object) this.IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII) ? 1 : 0);
               }

               label493: {
                  label408:
                  if (var1 != null) {
                     label417: {
                        if (var13 != 0) {
                           var10000 = this;
                           if (var1 == null) {
                              break label493;
                           }

                           if (this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII == null) {
                              break label417;
                           }

                           net.minecraft.world.phys.Vec3 var20 = this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
                           kotlin.jvm.internal.Intrinsics.checkNotNull(this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII);
                           double var23;
                           var13 = (var23 = var4.distanceTo(var20) - 1.5) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
                           if (var1 == null) {
                              break label408;
                           }

                           if (var13 > 0) {
                              break label417;
                           }
                        }

                        var13 = (this.a(var2) ? 1 : 0);
                        break label408;
                     }

                     IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
                     var10000 = this;
                     break label493;
                  }

                  byte var8;
                  label401: {
                     label478: {
                        int var10 = var13;
                        var8 = (byte)(this.e(var2) ? 1 : 0);
                        var18 = (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() ? 1 : 0);
                        label399:
                        if (var1 != null) {
                           if (var18 != 0) {
                              var18 = var10;
                              if (var1 == null) {
                                 break label399;
                              }

                              if (var10 != 0) {
                                 label479: {
                                    var19 = var8;
                                    if (var1 != null) {
                                       if (var8 == 0) {
                                          break label479;
                                       }

                                       var19 = (this.g(var2) ? 1 : 0);
                                    }

                                    if (var1 != null) {
                                       if (var19 != 0) {
                                          if (var9 <= this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll) {
                                             this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                                          }

                                          return;
                                       }

                                       double var24;
                                       var19 = (var24 = var9 - this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll)
                                             == 0.0
                                          ? 0
                                          : (var24 < 0.0 ? -1 : 1);
                                    }

                                    label389: {
                                       label388: {
                                          label480: {
                                             if (var1 != null) {
                                                if (var19 > 0) {
                                                   break label480;
                                                }

                                                var19 = this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI;
                                             }

                                             if (var1 == null) {
                                                break label389;
                                             }

                                             if (var19 == var2.getId()) {
                                                break label388;
                                             }

                                             this.c(var2);
                                             if (var1 != null) {
                                                break label388;
                                             }
                                          }

                                          this.bl();
                                       }

                                       a(this, var2, false, 2, null);
                                       double var25;
                                       var19 = (var25 = var9 - this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll)
                                             == 0.0
                                          ? 0
                                          : (var25 < 0.0 ? -1 : 1);
                                    }

                                    if (var1 == null) {
                                       break label401;
                                    }

                                    if (var19 > 0) {
                                       break label478;
                                    }

                                    this.f(var2, var9);
                                    if (var1 != null) {
                                       break label478;
                                    }
                                 }

                                 this.bo();
                                 if (var1 != null) {
                                    break label478;
                                 }
                              }
                           }

                           var18 = (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() ? 1 : 0);
                        }

                        label363:
                        if (var1 != null) {
                           if (var18 != 0) {
                              double var26;
                              var18 = (var26 = var9 - this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll) == 0.0
                                 ? 0
                                 : (var26 < 0.0 ? -1 : 1);
                              if (var1 == null) {
                                 break label363;
                              }

                              if (var18 <= 0) {
                                 if (var8 != 0) {
                                    this.bm();
                                    a(this, var2, false, 2, null);
                                    this.f(var2, var9);
                                    if (var1 != null) {
                                       break label478;
                                    }
                                 }

                                 this.bo();
                                 if (var1 != null) {
                                    break label478;
                                 }
                              }
                           }

                           double var27;
                           var18 = (var27 = var9 - this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII) == 0.0
                              ? 0
                              : (var27 < 0.0 ? -1 : 1);
                        }

                        label350: {
                           if (var1 != null) {
                              if (var18 > 0) {
                                 break label350;
                              }

                              var18 = var8;
                           }

                           if (var18 != 0) {
                              this.a(var2, var9);
                              a(this, var2, false, 2, null);
                              if (var1 != null) {
                                 break label478;
                              }
                           }
                        }

                        IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.b(true);
                     }

                     double var28;
                     var19 = (var28 = var9 - this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll) == 0.0
                        ? 0
                        : (var28 < 0.0 ? -1 : 1);
                  }

                  label338:
                  if (var1 != null) {
                     if (var19 <= 0) {
                        var19 = var8;
                        if (var1 == null) {
                           break label338;
                        }

                        if (var8 != 0) {
                           this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                           if (var1 != null) {
                              return;
                           }
                        }
                     }

                     double var29;
                     var19 = (var29 = var9 - this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII) == 0.0
                        ? 0
                        : (var29 < 0.0 ? -1 : 1);
                  }

                  label327:
                  if (var1 != null) {
                     if (var19 <= 0) {
                        var19 = var8;
                        if (var1 == null) {
                           break label327;
                        }

                        if (var8 != 0) {
                           return;
                        }
                     }

                     var19 = this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI;
                  }

                  if (var1 != null) {
                     if (var19 == var2.getId()) {
                        return;
                     }

                     var19 = (IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.a() ? 1 : 0);
                  }

                  if (var1 != null) {
                     if (var19 == 0) {
                        return;
                     }

                     var19 = (IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.d() ? 1 : 0);
                  }

                  if (var1 != null && var19 == 0) {
                     this.b(var2);
                  }

                  return;
               }

               if (!var10000.b(var2)) {
                  return;
               }

               return;
            }

            return;
         }

         var10000 = this;
      }

      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var5 = var10000;
      boolean var6 = false;
      var5.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   private final void j(boolean var1) {
      net.minecraft.world.entity.LivingEntity var1000L = null;
      net.minecraft.world.entity.monster.Creeper var29 = null;
      boolean var30 = false;
      byte var33 = 0;
      int var35 = 0;
      boolean var39 = false;
      String var2 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var10000 = this;
      if (var2 != null) {
         net.minecraft.world.entity.LivingEntity var23 = this.bx();
         if (var23 != null) {
            net.minecraft.world.entity.LivingEntity var3 = var23;
            if (var2 != null) {
               net.minecraft.client.player.LocalPlayer var24 = this.ap().player;
               if (var24 != null) {
                  net.minecraft.client.player.LocalPlayer var4 = var24;
                  me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var25 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  net.minecraft.world.phys.Vec3 var10001 = var3.getEyePosition();
                  kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10001, "getEyePosition(...)");
                  double var5 = var25.b(var10001, true);
                  int var26 = (this.c(var3, var5) ? 1 : 0);
                  if (var2 != null) {
                     if (var26 != 0) {
                        return;
                     }

                     double var41;
                     var26 = (var41 = var5 - this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll) == 0.0
                        ? 0
                        : (var41 < 0.0 ? -1 : 1);
                  }

                  label419: {
                     if (var2 != null) {
                        if (var26 > 0) {
                           break label419;
                        }

                        var26 = (this.e(var3) ? 1 : 0);
                     }

                     if (var2 != null) {
                        if (var26 == 0) {
                           break label419;
                        }

                        var26 = (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() ? 1 : 0);
                     }

                     label374:
                     if (var2 != null) {
                        label372:
                        if (var26 == 0) {
                           double var42;
                           var26 = (var42 = var5 - this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll) == 0.0
                              ? 0
                              : (var42 < 0.0 ? -1 : 1);
                           if (var2 != null) {
                              if (var26 <= 0) {
                                 IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
                                 if (var2 != null) {
                                    break label372;
                                 }
                              }

                              var26 = (IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.a() ? 1 : 0);
                           }

                           if (var2 == null) {
                              break label374;
                           }

                           if (var26 != 0) {
                              var26 = (IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.d() ? 1 : 0);
                              if (var2 == null) {
                                 break label374;
                              }

                              if (var26 == 0) {
                                 var26 = (this.b(var3) ? 1 : 0);
                                 if (var2 == null) {
                                    break label374;
                                 }

                                 if (var26 == 0) {
                                    return;
                                 }
                              }
                           }
                        }

                        this.bl();
                        this.i(var3);
                        var26 = (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() ? 1 : 0);
                     }

                     label355: {
                        label399: {
                           if (var2 != null) {
                              if (var26 == 0) {
                                 break label399;
                              }

                              var26 = (this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI ? 1 : 0);
                           }

                           if (var2 != null) {
                              if (var26 == 0) {
                                 break label399;
                              }

                              var26 = var3.getId();
                           }

                           if (var2 == null) {
                              break label355;
                           }

                           if (var26 == this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll) {
                              var26 = 1;
                              break label355;
                           }
                        }

                        var26 = 0;
                     }

                     int var19 = var26;
                     boolean var8 = this.g(var3);
                     boolean var27 = var8;
                     if (var2 != null) {
                        if (!var8) {
                           a(this, var3, false, 2, null);
                        }

                        var27 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al();
                     }

                     label338:
                     if (var2 != null) {
                        if (var27) {
                           var27 = var8;
                           if (var2 == null) {
                              break label338;
                           }

                           if (!var8) {
                              this.f(var3, var5);
                           }
                        }

                        var27 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al();
                     }

                     double var9;
                     double var11;
                     label330: {
                        var9 = var27 ? this.bq() : this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
                        var11 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .a()
                              .al()
                           ? var4.getEyePosition().distanceTo(this.c(var3, false))
                           : var5;
                        net.minecraft.world.entity.Entity var15 = this.ap().crosshairPickEntity;
                        net.minecraft.world.entity.Entity var28 = var15;
                        if (var2 != null) {
                           if (!(var15 instanceof net.minecraft.world.entity.monster.Creeper)) {
                              var29 = null;
                              break label330;
                           }

                           var28 = var15;
                        }

                        var29 = (net.minecraft.world.entity.monster.Creeper)var28;
                     }

                     net.minecraft.world.entity.monster.Creeper var31;
                     if (var29 != null) {
                        net.minecraft.world.entity.monster.Creeper var20;
                        label322: {
                           label400: {
                              var20 = var29;
                              boolean var17 = false;
                              var30 = var20.isPowered();
                              if (var2 != null) {
                                 if (!var30) {
                                    break label400;
                                 }

                                 var30 = var20.isAlive();
                              }

                              if (var2 == null) {
                                 break label322;
                              }

                              if (var30) {
                                 var30 = true;
                                 break label322;
                              }
                           }

                           var30 = false;
                        }

                        var31 = var30 ? var20 : null;
                     } else {
                        var31 = null;
                     }

                     net.minecraft.world.entity.monster.Creeper var13;
                     label311: {
                        label310: {
                           var13 = var31;
                           int var32 = var19;
                           if (var2 != null) {
                              if (var19 != 0) {
                                 break label310;
                              }

                              var32 = (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() ? 1 : 0);
                           }

                           if (var32 != 0 && var13 != null) {
                              var33 = 1;
                              break label311;
                           }
                        }

                        var33 = 0;
                     }

                     byte var14 = var33;
                     int var34 = var19;
                     if (var2 != null) {
                        var34 = ((var19 != 0 ? this.a(var3, 2.0F) : this.j(
                              var3,
                              (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a()
                                    .al()
                                 ? this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll
                                 : 0.1)
                           )) ? 1 : 0);
                     }

                     int var21 = var34;
                     var35 = var14;
                     label300:
                     if (var2 != null) {
                        label291:
                        if (var14 == 0) {
                           label402: {
                              double var43;
                              var35 = (var43 = var11 - var9) == 0.0 ? 0 : (var43 < 0.0 ? -1 : 1);
                              if (var2 != null) {
                                 if (var35 > 0) {
                                    break label402;
                                 }

                                 var35 = var21;
                              }

                              if (var2 == null) {
                                 break label300;
                              }

                              if (var35 != 0) {
                                 break label291;
                              }
                           }

                           var35 = 0;
                           break label300;
                        }

                        var35 = 1;
                     }

                     int var16 = var35;
                     this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.a(this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll);
                     int var36 = 0;
                     if (var2 != null) {
                        if (var36 == 0) {
                           return;
                        }

                        var36 = var16;
                     }

                     if (var2 != null) {
                        if (var36 == 0) {
                           return;
                        }

                        me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.l();
                        this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.f();
                        var36 = (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() ? 1 : 0);
                     }

                     if (var36 != 0) {
                        var1000L = var13;
                        if (var2 != null) {
                           var1000L = var13 != null ? (net.minecraft.world.entity.LivingEntity)var13 : var3;
                        }

                        Object var22 = var1000L;
                        int var38 = this.h(var1).size();
                        if (var2 != null) {
                           var38 = var38 >= this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI ? 1 : 0;
                        }

                        label405: {
                           int var18 = var38;
                           this.e(((net.minecraft.world.entity.Entity)var22).getId());
                           var39 = (var18 != 0);
                           label268:
                           if (var2 != null) {
                              if (var18 != 0) {
                                 var39 = this.a(var1, true);
                                 if (var2 == null) {
                                    break label268;
                                 }

                                 if (var39) {
                                    return;
                                 }
                              }

                              var10000 = this;
                              if (var2 == null) {
                                 break label405;
                              }

                              var39 = this.e((net.minecraft.world.entity.LivingEntity)var22, var1);
                           }

                           if (var39) {
                              return;
                           }

                           this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
                           var10000 = this;
                        }

                        var10000.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     }

                     return;
                  }

                  this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  this.bn();
                  return;
               }
            }

            return;
         }

         var10000 = this;
      }

      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var6 = var10000;
      boolean var7 = false;
      var6.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   private final LivingEntity k(boolean param1) {
      LivingEntity var3 = null;
      double var4 = Double.MAX_VALUE;
      Creeper var6 = null;
      double var7 = Double.MAX_VALUE;
      for (Creeper var10 : this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl) {
         if (this.a(var10, param1)) {
            double var11 = this.a(var10);
            if (var11 < var4) { var3 = var10; var4 = var11; } }
         else if (!param1) {
            if (this.b(var10)) {
               double var12 = this.a(var10);
               if (var12 < var7) { var6 = var10; var7 = var12; } } } }
      return var3 != null ? var3 : var6;
   }

   private final double a(Creeper param1) {
String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
Vec3 var3 = param1.getEyePosition();
Intrinsics.checkNotNullExpressionValue(var3, "getEyePosition(...)");
double var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var3, true);
double var6 = Math.abs((double)me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1).a());
double var8 = var4 + var6 / 8.0;
if (var4 > this.IlIllIIIIIIIIIIlIllIIlIlIlIllIIIlIIIIllIlllllIIIlIIIIIIlIllIIlIIlIIIIIIllIIllllllIlII && var6 > this.llIlllIIIllllIIllIlIIIllIIIIlIlIllIIIIlIllIIIlIIllIlIllIIIIIlIIIlIIllIllIIIIlIIIllIIl) { var8 -= 14.0; }
if (var6 > 120.0) { var8 += 18.0; }
if (param1.tickCount < 20 && var6 > this.llIlllIIIllllIIllIlIIIllIIIIlIlIllIIIIlIllIIIlIIllIlIllIIIIIlIIIlIIllIllIIIIlIIIllIIl) { var8 += 22.0; }
if (var6 > this.IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI) { var8 += this.IlIIlIlIIIIlllIIIllIIlIIlIIlIIIllllllIIlIlIIlllIIllIlllIlIlIIIlIlIIlIIIlIlIlllIIIlIIl; }
return var8;
   }

   private final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll bs() {
String var1 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f().B();
if (Intrinsics.areEqual(var1, "Both")) { return this.IlllIIllIlIlllIIllIlIIIllIIIlllllIllIIllIlllIIIlllIIlIllIlIlllIIlIlIlIllIlllIlIIIIlll; }
if (Intrinsics.areEqual(var1, "Secondary Area")) { return this.IlllIIllIlIlllIIllIlIIIllIIIlllllIllIIllIlllIIIlllIIlIllIlIlllIIlIlIlIllIlllIlIIIIlll; }
return this.IIlIllIllIlllllIIllIlIIIIllllIllllIlIIllIlIlIIllIlllllIllIIIlIlIIIIIIIIlIlIlIIlIIIlll;
   }

   private final boolean bt() {
      lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var10000 = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .f();
      short var10001 = -13797;
      short var10002 = 25026;
      return var10000.c("Both");
   }

   private final boolean bu() {
if (!lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f().c("Main Area")) { return false; }
return lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h().al();
   }

   private final boolean a(Creeper param1, boolean param2) {
      String var3 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var3 == null) { return this.bs().i() || (param2 && this.bs().a(param1)); }
      return this.bt() && param2 && this.c(param1);
   }

   private final boolean b(Creeper param1) {
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var2 == null) { return this.bu() && this.bs().a(param1); }
      return this.bu() && this.c(param1);
   }

   private final boolean c(Creeper param1) {
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var2 == null) { return this.bs().a(param1, this.bu()); }
      if (!this.bt()) { return this.bs().a(param1, this.bu()); }
      return this.IIlIllIllIlllllIIllIlIIIIllllIllllIlIIllIlIlIIllIlllllIllIIIlIlIIIIIIIIlIlIlIIlIIIlll.a(param1, false) ? true : this.IlllIIllIlIlllIIllIlIIIllIIIlllllIllIIllIlllIIIlllIIlIllIlIlllIIlIlIlIllIlllIlIIIIlll.a(param1, false);
   }

   private final boolean f(LivingEntity param1, boolean param2) {
      String var3 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      Creeper var4 = param1 instanceof Creeper && var3 != null ? (Creeper)param1 : null;
      if (var4 == null) { return false; }
      return var4.isAlive() && var4.isPowered() && (!(var4.getHealth() > 1.4F) || !(param1.getX() <= this.llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl && param1.getX() <= this.lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI)) && var4.getX() > this.llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl && var4.getX() <= this.lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI && var4.getZ() > this.lIIllIIlIIlIIllllIIlIllllllIlIIIllllIIlIIlIIIIlIlIIIlIIIIlIllIIIIIIlIlIIIlIlllIllIIlI && var4.getZ() <= this.lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl && (param2 && this.b(var4)) || var3 != null && param1.getX() > this.llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl && param1.getX() <= this.lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI && this.h((LivingEntity)var4) && this.f(var4.getId());
   }

   private final boolean d(Creeper param1) {
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      double var3 = this.llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl;
      double var5 = this.lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI;
      double var7 = param1.getX();
      if (!(var3 <= var7 && var7 <= var5)) { return false; }
      var3 = this.lIIllIIlIIlIIllllIIlIllllllIlIIIllllIIlIIlIIIIlIlIIIlIIIIlIllIIIIIIlIlIIIlIlllIllIIlI;
      var5 = this.lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl;
      var7 = param1.getZ();
      return var2 != null && var3 <= var7 && var7 <= var5;
   }

   private final void bv() {
      int var1 = this.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII++;
      this.IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl = CollectionsKt.emptyList();
      this.llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI = -1;
      this.IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl = false;
      this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
      this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl = -1;
   }

   private final boolean bw() {
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      net.minecraft.world.entity.Entity var2 = this.ap().crosshairPickEntity;
      return var1 != null && var2 instanceof Creeper && ((Creeper)var2).getHealth() > 1.4F;
   }

   private final boolean d(int param1) {
      if (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d() != null) { net.minecraft.world.entity.Entity var1 = this.ap().crosshairPickEntity; if (var1 != null) { int var2 = var1 instanceof Creeper ? ((Creeper)var1).getId() : 0; if (var1 instanceof Creeper && var2 == param1) { return true; } } } return false;
   }

   private final boolean h(LivingEntity param1) {
      if (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d() != null) { net.minecraft.world.entity.Entity var1 = this.ap().crosshairPickEntity; if (var1 != null && var1.getId() == param1.getId()) { return true; } } return false;
   }

   private final LivingEntity bx() {
      if (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d() != null && this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI != -1) { net.minecraft.world.entity.Entity var2 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI); if (var2 instanceof LivingEntity) { return (LivingEntity)var2; } } return null;
   }

   private final void i(LivingEntity param1) {
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var2 != null) {
         if (param1.getId() == this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll) {
            return;
         }

         this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = param1.getId();
      }

      LocalPlayer var3 = this.ap().player;
      if (var2 == null) {
         return;
      }

      if (var3 != null && me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().al() && me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().al()) {
         this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = kotlin.random.Random.Default.nextInt(100) < me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().M();
         if (this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI) {
            double var4 = kotlin.ranges.RangesKt.coerceAtLeast(Math.hypot(param1.getX() - var3.getX(), param1.getZ() - var3.getZ()), 0.6D);
            double var6 = (double)param1.getBbWidth() / 2.0D + 0.12D;
            double var8 = Math.toDegrees(Math.atan2(var6, var4)) + kotlin.random.Random.Default.nextDouble(1.5D, 4.0D);
            this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = (float)(kotlin.random.Random.Default.nextBoolean() ? var8 : -var8);
         }
      } else {
         this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = false;
      }
   }

   private final boolean a(LivingEntity param1, float param2) {
      String var3 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var3 != null) { LocalPlayer var4 = this.ap().player; if (var4 != null) { if (this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl == param1.getId()) { return Math.abs(net.minecraft.util.Mth.wrapDegrees(var4.getYRot() - this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI)) <= param2 && Math.abs(var4.getXRot() - this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll) <= param2; } } }
      return false;
   }

   private final boolean j(LivingEntity param1, double param2) {
      String var4 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var4 != null) { LocalPlayer var5 = this.ap().player; if (var5 != null) { if (this.h(param1)) { return true; } AABB var6 = param1.getBoundingBox().inflate(param2); if (var6.contains(var5.getEyePosition())) { return true; } Vec3 var7 = var5.getEyePosition(); Vec3 var8 = var7.add(var5.getLookAngle().scale(this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll + 0.5D)); return var6.clip(var7, var8).isPresent(); } }
      return false;
   }

   private final void e(int param1) {
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.put(param1, System.currentTimeMillis() + this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII);
      if (this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII == param1) {
         this.bp();
      }
   }

   private final boolean f(int param1) {
      String var2 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var2 != null) { Long var3 = this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.get(param1); if (var3 != null) { long var4 = ((Number)var3).longValue(); return var4 > System.currentTimeMillis(); } }
      return false;
   }

   private final void by() {
      long var1 = System.currentTimeMillis();
      this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII
         .entrySet()
         .removeIf((java.util.function.Predicate<Entry>)(new java.util.function.Predicate<Entry>() {
            public final boolean test(Entry var1x) {
               return ((Number)var1x.getValue()).longValue() > var1;
            }
         }));
   }

   private final int bz() {
      String var1 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var1 == null) {
         return 0;
      }

      net.minecraft.client.multiplayer.ClientLevel var2 = this.ap().level;
      if (var2 == null) {
         return 0;
      }

      me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = this.bs();
      if (!var3.i()) {
         return 0;
      }

      Iterable<net.minecraft.world.entity.Entity> var4 = var2.entitiesForRendering();
      Intrinsics.checkNotNullExpressionValue(var4, "entitiesForRendering(...)");
      if (var4 instanceof java.util.Collection && ((java.util.Collection)var4).isEmpty()) {
         return 0;
      }

      int var6 = 0;

      for (net.minecraft.world.entity.Entity var9 : var4) {
         if (var9 instanceof net.minecraft.world.entity.monster.Creeper && ((net.minecraft.world.entity.monster.Creeper)var9).isPowered() && ((net.minecraft.world.entity.monster.Creeper)var9).isAlive() && ((net.minecraft.world.entity.monster.Creeper)var9).getHealth() > 1.4F && this.d(((net.minecraft.world.entity.monster.Creeper)var9)) && var3.b(((net.minecraft.world.entity.monster.Creeper)var9))) {
            var6++;
            if (var6 < 0) {
               CollectionsKt.throwCountOverflow();
            }
         }
      }

      return var6;
   }

   private final boolean bA() {
      String var1 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      net.minecraft.client.multiplayer.ClientLevel var2 = this.ap().level;
      if (var2 == null) {
         return false;
      }
      net.minecraft.client.multiplayer.ClientLevel var3 = this.ap().level;
      if (var3 == null) {
         return false;
      }
      int var4 = me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j().M();
      Iterable<net.minecraft.world.entity.Entity> var5 = var2.entitiesForRendering();
      for (net.minecraft.world.entity.Entity var9 : var5) {
         if (var9 instanceof net.minecraft.client.player.RemotePlayer
               && !kotlin.jvm.internal.Intrinsics.areEqual(var9, var3)
               && !(me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var9), true) > (double)var4)
               && (this.W() == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI || this.W() == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI)) {
            return true;
         }
      }
      return false;
   }

   private final void bB() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll = 0;
   }

   private final void bC() {
      this.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll = IIlIIIIIllIlIIIlIllIIlIlIIIIIllIllllllllIIIIlIlIlIIIIIllIlIIlIIIIlIllIlIIllIIIIIllIlI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
         .S();
      this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll = 0;
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
               (kotlin.jvm.functions.Function2)(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl::i),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function2)(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl::j),
               120,
               null
            )
         );
   }

   private final void bD() {
      Object llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl = null; // PX-FIX
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = false;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
      this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = -1;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = null;
      this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII = false;
      this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI = null;
      this.bH();
      this.bv();
      IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .k();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      this.bn();
   }

   public boolean ai() {
      return this.IllIIIllIIllIlIIllIIlIIIIIllIlllIlllllIIIIlIIIIlIIIIlIIlIlIlIIIlIIllIlIlIlIlIllIIlllI;
   }

   public void ag() {
      this.bD();
      this.bl();
      super.ag();
   }

   private final void bE() {
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var1 != null) {
         if (this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII) {
            return;
         }

         this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII = true;
         BlockPos var2 = a(this, (BlockPos)null, 1, (Object)null);
         this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI = var2 != null ? var2 : (BlockPos)CollectionsKt.random(this.IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII, Random.Default);
         this.bn();
         IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.b(true);
         IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.a(IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI, this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI, (Vec3)null, false, false, 14, (Object)null);
         this.IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll = System.currentTimeMillis();
         if (!me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
            return;
         }
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7e[Idle] No ghosts - walking to" + this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI);
   }

   private final void bF() {
      if (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d() != null && this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII) {
         this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII = false;
         this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI = null;
      }

      this.bH();
      IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
   }

   private final void bG() {
      boolean var10000b = false;
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var17 = this;
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var20 = this;
      String var1 = me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      long var21;
      int var10000 = (
               var21 = System.currentTimeMillis()
                  - this.IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll
                  - this.llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll
            )
            == 0L
         ? 0
         : (var21 < 0L ? -1 : 1);
      if (var1 != null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      label305: {
         int var2;
         var2 = var10000;
         net.minecraft.core.BlockPos var3 = this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI;
         var10000b = IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.c();
         label251:
         if (var1 != null) {
            if (!var10000b) {
               var10000 = var2;
               if (var1 == null) {
                  break label251;
               }

               if (var2 == 0 && var3 != null) {
                  var10000b = IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.d();
                  if (var1 == null) {
                     break label251;
                  }

                  if (!var10000b) {
                     double var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var3, false);
                     double var22;
                     var10000 = (var22 = var4 - this.lIlIIlIlIIllIlIllIIIllIIllllIIllIIIIlllllIIlllIlIlIlIlIIIlIIIlIlIIllllllllIIIllIIIIIl) == 0.0
                        ? 0
                        : (var22 < 0.0 ? -1 : 1);
                     if (var1 != null) {
                        if (var10000 <= 0) {
                           this.a(var3);
                        }

                        double var23;
                        var10000 = (var23 = var4 - this.lIIlIlIllIlIlIIlIIIllIIlIlllllIIIIllIlIIIlIIllIIIIlIIIlIIllIIllIlllIIIIlIlIIIIllllllI) == 0.0
                           ? 0
                           : (var23 < 0.0 ? -1 : 1);
                     }

                     label267:
                     if (var1 != null) {
                        if (var10000 <= 0) {
                           var10000b = kotlin.jvm.internal.Intrinsics.areEqual(this.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl, var3);
                           if (var1 == null) {
                              break label267;
                           }

                           if (var10000b && this.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII != null) {
                              IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.b(false);
                              me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .j();
                           }
                        }

                        double var24;
                        var10000 = (var24 = var4 - this.IlIllIlIIlIIlIIIIIIlIlIIIlllIIllIllIIIlIIlIIlIIIlIIllIIIIIIllllIlIlIllIlllIIIIllIIIII) == 0.0
                           ? 0
                           : (var24 < 0.0 ? -1 : 1);
                     }

                     if (var1 == null) {
                        break label251;
                     }

                     if (var10000 <= 0) {
                        var10000b = kotlin.jvm.internal.Intrinsics.areEqual(this.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl, var3);
                        if (var1 == null) {
                           break label251;
                        }

                        label258:
                        if (var10000b) {
                           
                           if (var1 != null) {
                              if (this.lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl == null) {
                                 break label258;
                              }

                              
                           }

                           if (var1 == null) {
                              break label305;
                           }

                           if (var17.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII != null) {
                              
                              break label305;
                           }
                        }
                     }
                  }
               }
            }

            var10000b = IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.a();
         }

         label238:
         if (var1 != null) {
            if (!var10000b) {
               var10000b = IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.c();
               if (var1 == null) {
                  break label238;
               }

               if (!var10000b) {
                  var10000 = var2;
                  if (var1 == null) {
                     break label238;
                  }

                  if (var2 == 0) {
                     return;
                  }
               }
            }

            var10000b = lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .k()
               .al();
         }

         label289: {
            if (var1 != null) {
               if (!var10000b) {
                  break label289;
               }

               var10000b = IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.c();
            }

            label224:
            if (var1 != null) {
               if (!var10000b) {
                  var10000 = var2;
                  if (var1 == null) {
                     break label224;
                  }

                  if (var2 == 0) {
                     break label289;
                  }
               }

               var10000b = IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.c();
            }

            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
               "§e[Idle] Switching waypoint (" + (var10000b ? "failed" : "timed out") + ")"
            );
         }

         Iterable var5 = this.IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII;
         boolean var15 = false;
         var var8 = new java.util.ArrayList();
         boolean var9 = false;

         for (Object var11 : var5) {
            net.minecraft.core.BlockPos var12 = (net.minecraft.core.BlockPos)var11;
            boolean var13 = false;
            if (var1 == null) {
               return;
            }

            boolean var19 = kotlin.jvm.internal.Intrinsics.areEqual(var12, this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI);
            if (var1 != null) {
               var19 = !var19;
            }

            if (var19) {
               var8.add(var11);
               if (var1 == null) {
                  break;
               }
            }
         }

         java.util.List var14 = var8;
         
         label198:
         if (var1 != null) {
            net.minecraft.core.BlockPos var10001 = a(this, null, 1, null);
            if (var10001 == null) {
               if (var1 == null) {
                  break label198;
               }

               var10001 = (net.minecraft.core.BlockPos)kotlin.collections.CollectionsKt.randomOrNull(var14, (kotlin.random.Random)kotlin.random.Random.Default);
               if (var10001 == null) {
                  var10001 = (net.minecraft.core.BlockPos)kotlin.collections.CollectionsKt.random(
                     this.IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII, (kotlin.random.Random)kotlin.random.Random.Default
                  );
               }
            }

            this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI = var10001;
            this.bH();
            IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.v();
            IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.b(true);
            IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.a(
               IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI,
               this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI,
               null,
               false,
               false,
               14,
               null
            );
            
         }

         if (var1 != null) {
            var20.IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll = System.currentTimeMillis();
            if (!lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .k()
               .al()) {
               return;
            }

            
         }

         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            "§e[Idle] Moving to next waypoint: " + var20.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI
         );
         return;
      }

      if (var17.lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl != null) {
         net.minecraft.core.BlockPos var6 = var17.lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl;
         if (var1 != null && this.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII != null) {
            java.util.List var7 = this.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII;
            this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI = var6;
            IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll.a(
               IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI,
               var6,
               var7,
               null,
               false,
               lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .k()
                  .al(),
               12,
               null
            );
            IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.b(true);
            this.bH();
            this.IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll = System.currentTimeMillis();
            if (lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .k()
               .al()) {
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                  "§e[Idle] Prefetched roam swap: " + var6
               );
            }
         }
      }
   }

   private final void a(BlockPos param1) {
      if (this.lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl) {
         return;
      }

      if (kotlin.jvm.internal.Intrinsics.areEqual(this.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl, param1)
            && this.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII != null) {
         return;
      }

      net.minecraft.core.BlockPos var3 = this.b(param1);
      if (var3 == null) {
         java.util.ArrayList var14 = new java.util.ArrayList();
         for (net.minecraft.core.BlockPos var12 : (java.lang.Iterable<net.minecraft.core.BlockPos>) this.IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(var12, param1)) {
               var14.add(var12);
            }
         }

         var3 = (net.minecraft.core.BlockPos) kotlin.collections.CollectionsKt.randomOrNull((java.util.Collection) var14, (kotlin.random.Random) kotlin.random.Random.Default);
         if (var3 == null) {
            return;
         }
      }

      this.IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll = this.IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll + 1;
      int var4 = this.IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll;
      net.minecraft.core.BlockPos var13 = var3;
      this.lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl = true;
      this.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl = param1;
      this.lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl = var3;
      this.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII = null;
      me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0) () -> {
            this.a(var4, param1, var13);
            return kotlin.Unit.INSTANCE;
         });
   }

   private final void bH() {
      int var1 = this.IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll++;
      this.lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl = false;
      this.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl = null;
      this.lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl = null;
      this.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII = null;
   }

   private final BlockPos b(BlockPos param1) {
      String var2 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      LocalPlayer var3 = this.ap().player;
      if (var3 == null) {
         return null;
      }
      BlockPos var4;
      synchronized (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
         var4 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a((net.minecraft.world.entity.Entity)var3);
      }
      if (var4 == null) {
         return null;
      }
      Vec3 var5 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var3);
      java.util.ArrayList var6 = new java.util.ArrayList(this.IIlIlllllIIllIIIlllIIIIlIIIlIIIIlIlIllllIlIIlIIlIlIIIlIIllIllIIIlllIlIllllIIIIlllllII);
      for (int var8 = 0; var8 < this.IIlIlllllIIllIIIlllIIIIlIIIlIIIIlIlIllllIlIIlIIlIlIIIlIIllIllIIIlllIlIllllIIIIlllllII; var8++) {
         BlockPos var11 = new BlockPos(Random.Default.nextInt(this.IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI, this.IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI + 1), var4.getY(), Random.Default.nextInt(this.llllllIIlIlIIlIIIIlIlIIIIIIlIIlIllIIIlIlIlIllIIIIlIIlIIIIlIlllIIllllllIIlllIlIIllIIIl, this.lllIlIlIllllIIIIlIllIIllIIIllllIlIllIllIIlIIlIIIIlIlllIlIIIlIlllIllllIIIllIllIIIIIIII + 1));
         if (kotlin.jvm.internal.Intrinsics.areEqual(var11, this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI) || kotlin.jvm.internal.Intrinsics.areEqual(var11, param1) || !this.c(var11)) {
            continue;
         }
         Vec3 var12 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var11);
         double var13 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var5, var12);
         if (!(var13 >= this.lIIllIIIIlIlIIIIlIlllllIIIlIIllIllIlllllIlIllIIIIIIlIlIIIIIIllIIlllIlllllllIllIlIllII && var13 <= this.lIIllIlIIIIlIIlIlIllIIllIIllIIIIIIlIIlIIIllllIlIlllIlIlllIlIllIIIIIllIIIIlIlIIIlIIIlI)) {
            continue;
         }
         Vec3 var16 = param1 != null ? Vec3.ZERO : var3.getDeltaMovement();
         kotlin.jvm.internal.Intrinsics.checkNotNull(var16);
         Vec3 var18 = var16;
         if (!me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var5, var12, var18, 120, false, 1.0, false, true, 0.0)) {
            continue;
         }
         double var19 = this.a(var5, var12);
         double var21 = this.b(var19);
         double var23 = this.d(var11);
         double var25 = Math.abs(var13 - this.llIIllllIlIIIlIIIIIllIIlllllIllllIIIlllIlIIlIlllIIlIIllIlllllIlIIIlllIllIllllllIIIllI) * 0.75;
         double var27 = var21 + var23 * 18.0 + var25 + Random.Default.nextDouble(0.0, 10.0);
         var6.add(TuplesKt.to(var11, java.lang.Double.valueOf(var27)));
      }
      kotlin.Pair var28 = null;
      double var29 = 0.0;
      boolean var30 = false;
      for (Object var31 : var6) {
         kotlin.Pair var32 = (kotlin.Pair)var31;
         double var33 = ((Number)var32.getSecond()).doubleValue();
         if (!var30) {
            var28 = var32;
            var29 = var33;
            var30 = true;
         } else if (java.lang.Double.compare(var29, var33) > 0) {
            var28 = var32;
            var29 = var33;
         }
      }
      BlockPos var7 = var28 == null ? null : (BlockPos)var28.getFirst();
      if (var7 != null && me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
         double var34 = this.a(var5, me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var7));
         String var35 = java.lang.String.format("%.1f", java.lang.Double.valueOf(var34));
         String var36 = java.lang.String.format("%.1f", java.lang.Double.valueOf(this.d(var7)));
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7e[Idle] Dynamic roam: " + var7 + " yaw=" + var35 + " wall=" + var36);
      }
      return var7;
   }

   private final double a(Vec3 param1, Vec3 param2) {
      String var3 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var3 == null) {
         return 50.0;
      }
      LocalPlayer var4 = this.ap().player;
      if (var4 == null) {
         return 50.0;
      }
      float var5 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, param2).a();
      return Math.abs(me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(var5 - var4.getYRot()));
   }

   private final double b(double param1) {
      String var3 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (param1 < 30.0) {
         return (30.0 - param1) * 5.0 + 25.0;
      }
      if (param1 <= 70.0) {
         return Math.abs(param1 - 50.0) * 0.35;
      }
      return (param1 - 70.0) * 2.0 + 12.0;
   }

   private final boolean c(BlockPos param1) {
      int var3 = this.IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI;
      String var2 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      int var4 = this.IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI;
      int var5 = param1.getX();
      if (!(var3 <= var5 && var5 <= var4)) {
         return false;
      }
      var3 = this.llllllIIlIlIIlIIIIlIlIIIIIIlIIlIllIIIlIlIlIllIIIIlIIlIIIIlIlllIIllllllIIlllIlIIllIIIl;
      var4 = this.lllIlIlIllllIIIIlIllIIllIIIllllIlIllIllIIlIIlIIIIlIlllIlIIIlIlllIllllIIIllIllIIIIIIII;
      var5 = param1.getZ();
      if (!(var3 <= var5 && var5 <= var4)) {
         return false;
      }
      net.minecraft.client.multiplayer.ClientLevel var6 = this.ap().level;
      if (var6 == null) {
         return false;
      }
      net.minecraft.world.level.block.state.BlockState var7 = var6.getBlockState(param1);
      if (var7.isAir()) {
         return false;
      }
      if (var7.getCollisionShape(var6, param1).isEmpty()) {
         return false;
      }
      if (!var6.getBlockState(param1.above()).isAir()) {
         return false;
      }
      if (!var6.getBlockState(param1.above(2)).isAir()) {
         return false;
      }
      return !(this.d(param1) >= 6.0);
   }

   private final double d(BlockPos param1) {
      String var2 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var2 == null) {
         return 99.0;
      }
      net.minecraft.client.multiplayer.ClientLevel var3 = this.ap().level;
      if (var3 == null) {
         return 99.0;
      }
      double var4 = 0.0;
      for (int var6 = -3; var6 < 4; var6++) {
         for (int var7 = -3; var7 < 4; var7++) {
            if (var6 == 0 && var7 == 0) {
               continue;
            }
            int var8 = Math.max(Math.abs(var6), Math.abs(var7));
            BlockPos var9 = param1.offset(var6, 1, var7);
            BlockPos var10 = param1.offset(var6, 2, var7);
            boolean var11 = !var3.getBlockState(var9).isAir() || !var3.getBlockState(var10).isAir();
            if (!var11) {
               continue;
            }
            switch (var8) {
               case 1:
                  var4 += 6.0;
                  break;
               case 2:
                  var4 += 2.0;
                  break;
               default:
                  var4 += 0.6;
            }
         }
      }
      return var4;
   }

   @SubscribeEvent
   public final void b(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl param1) {
      String var2 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      Intrinsics.checkNotNullParameter(param1, "event");
      if (var2 != null && this.G()) {
         me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(5000L, new kotlin.jvm.functions.Function0<kotlin.Unit>() {
            @Override
            public kotlin.Unit invoke() {
               return k(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.this);
            }
         });
      }
   }

   public void O() {
      short var10001 = -13732;
      short var10002 = 10393;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Session Info");
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl::bM, 16777215, 0);
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
   }

   private final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll bI() {
      return new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI,
         this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI,
         this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI,
         this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII,
         IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.a(),
         IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.c(),
         IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI.d(),
         this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII,
         this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI,
         this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl.size(),
         this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII.size(),
         this.IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl.size(),
         this.IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl,
         this.lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
            (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)this, 0.0, 1, null
         )
      );
   }

   private static final boolean e(Creeper param0) {
      String var1 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      Intrinsics.checkNotNullParameter(param0, "e");
      if (!(param0.getX() > 100.0)) {
         return false;
      }
      double var2 = param0.getY();
      if (var2 >= 76.0 && var2 <= 81.0 && param0.getZ() >= 85.0) {
         return true;
      }
      return param0.getZ() <= 42.0 || param0.getX() >= 168.0;
   }

   private static final boolean f(Creeper param0) {
      String var1 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      Intrinsics.checkNotNullParameter(param0, "e");
      if (!(param0.getX() > 108.0)) {
         return false;
      }
      double var2 = param0.getY();
      if (var2 >= 76.0 && var2 <= 79.0 && param0.getZ() >= 85.0) {
         return true;
      }
      return param0.getZ() <= 45.0 || param0.getX() >= 168.0;
   }

   private static final long a(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      return new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         var0.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll,
         var0.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll.size(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
            (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI)var0, 0.0, 1, null
         )
      );
   }

   private static final Object d(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      return var0.bI();
   }

   private static final Object e(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      return new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         var0.lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl,
         var0.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI,
         var0.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI,
         var0.IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll
      );
   }

   private static final boolean f(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl param0) {
      String var1 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      return param0.af() && me.octo.client.lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.b();
   }

   private static final boolean bJ() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean bK() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean g(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl param0) {
      String var1 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      boolean var2 = param0.af();
      if (var1 != null) {
         var2 = var2 && me.octo.client.lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.b();
      }
      return var2;
   }

   private static final Unit h(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      try {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            )
          {
            var0.a(
               me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
               2000
            );
         }
      } catch (NoWhenBranchMatchedException var1) {
         throw (RuntimeException)a(var1);
      }

      return Unit.INSTANCE;
   }

   private static final Unit bL() {
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .x();
      return Unit.INSTANCE;
   }

   private static final boolean a(LivingEntity param0, Creeper param1) {
      String var2 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      Intrinsics.checkNotNullParameter(param1, "it");
      return param1.getId() != param0.getId();
   }

   private static final boolean a(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0, boolean var1, Creeper var2) {
      short var10001 = -13786;
      short var10002 = 26697;
      Intrinsics.checkNotNullParameter(var2, "it");
      return var0.f(var2, var1);
   }

   // $VF: Extended synchronized range to monitorexit
   private static final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI g(
      Creeper var0
   ) {
      short var10001 = -13791;
      short var10002 = -21332;
      Intrinsics.checkNotNullParameter(var0, "ghost");
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      BlockPos var10000;
      synchronized (var2) {
         boolean var3 = false;
         BlockPos var7 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var0);
         var10000 = var7;
      }

      try {
         if (var10000 == null) {
            return null;
         }
      } catch (NoWhenBranchMatchedException var6) {
         throw (RuntimeException)a(var6);
      }

      BlockPos var1 = var10000;
      return new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var0.getId(), var1
      );
   }

   private static final Unit a(
      List param0,
      Vec3 param1,
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl param2,
      int param3,
      int param4,
      BlockPos param5
   ) {
      java.util.ArrayList var7 = new java.util.ArrayList(param0.size());
      try {
         for (Object var8 : param0) {
            llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var8;
            Vec3 var10 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(var9.b());
            boolean var11 = !(me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1, var10) > param2.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI);
            java.util.List var12;
            if (var11) {
               var12 = null;
            } else {
               synchronized (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
                  var12 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var9.b(), param5, me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al());
               }
            }
            var7.add(new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(param3, var9.a(), var11, var12));
         }
         if (param2.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII == param4) {
            if (param2.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI == param3) {
               param2.IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl = var7;
               if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
                  int var13 = 0;
                  for (Object var14 : var7) {
                     llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var15 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var14;
                     if (var15.d() != null) {
                        var13++;
                     }
                  }
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7b[Prefetch] " + var13 + " paths for " + param3);
               }
            }
         }
      } finally {
         if (param2.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII == param4) {
            param2.IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl = false;
         }
      }
      return Unit.INSTANCE;
   }

   private static final boolean a(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0, Creeper var1) {
      String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      short var10002 = -13786;
      short var10003 = 26697;
      Intrinsics.checkNotNullParameter(var1, "it");
      String var2 = var10000;

      try {
         boolean var4 = var0.f(var1.getId());
         if (var2 == null) {
            return var4;
         }

         if (!var4) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var3) {
         throw (RuntimeException)a(var3);
      }

      return false;
   }

   private static final boolean b(LivingEntity param0, Creeper param1) {
      String var2 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      Intrinsics.checkNotNullParameter(param1, "it");
      return param1.getId() != param0.getId();
   }

   private static final boolean b(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0, Creeper var1) {
      short var10001 = -13789;
      short var10002 = 9189;
      Intrinsics.checkNotNullParameter(var1, "it");
      return var0.c(var1);
   }

   private static final boolean a(LocalPlayer var0, float var1, double var2, Creeper var4) {
      Object var12 = null; // PX-FIX
      short var10001 = -13744;
      short var10002 = -21896;
      Intrinsics.checkNotNullParameter(var4, "ghost");
      me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var10000 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var14 = var0.getEyePosition();
      short var10003 = -13823;
      short var10004 = -12075;
      Intrinsics.checkNotNullExpressionValue(var14, "getEyePosition(...)");
      Vec3 var15 = var4.getEyePosition();
      var10004 = -13823;
      short var10005 = -12075;
      Intrinsics.checkNotNullExpressionValue(var15, "getEyePosition(...)");
      float var6 = var10000.a(var14, var15).a();
      String var11 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      float var7 = var6 - var1;
      String var5 = var11;

      label53: {
         label52:
         while (true) {
            if (var7 > 180.0F) {
               var7 -= 360.0F;

               try {
                  if (var5 == null) {
                     break;
                  }

                  if (var5 != null) {
                     continue;
                  }
               } catch (NoWhenBranchMatchedException var10) {
                  throw (RuntimeException)a(var10);
               }
            }

            while (true) {
               if (!(var7 < -180.0F)) {
                  break label52;
               }

               var12 = var7 + 360.0F;
               if (var5 == null) {
                  break label53;
               }

               var7 =((Float)( var12));
               if (var5 == null) {
                  break label52;
               }
            }
         }

         var12 = Math.abs(var7);
      }

      float var8 =((Float)( var12));

      try {
         double var17;
         int var13 = (var17 = var8 - var2) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
         if (var5 == null) {
            return (var13 != 0);
         }

         if (var13 <= 0) {
            return (1 != 0);
         }
      } catch (NoWhenBranchMatchedException var9) {
         throw (RuntimeException)a(var9);
      }

      return (0 != 0);
   }

   private static final boolean a(double var0, Creeper var2) {
      short var10001 = -13791;
      short var10002 = -21332;
      Intrinsics.checkNotNullParameter(var2, "ghost");
      String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var8 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Vec3 var9 = var2.getEyePosition();
      short var10004 = -13823;
      short var10005 = -12075;
      Intrinsics.checkNotNullExpressionValue(var9, "getEyePosition(...)");
      double var4 = var8.b(var9, true);
      String var3 = var10000;

      try {
         double var10;
         int var7 = (var10 = var4 - (var0 - 1.0)) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
         if (var3 == null) {
            return (var7 != 0);
         }

         if (var7 < 0) {
            return (1 != 0);
         }
      } catch (NoWhenBranchMatchedException var6) {
         throw (RuntimeException)a(var6);
      }

      return (0 != 0);
   }

   private static final boolean a(long var0, Entry var2) {
      String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      short var10002 = -13786;
      short var10003 = 26697;
      Intrinsics.checkNotNullParameter(var2, "it");
      String var3 = var10000;

      try {
         long var6;
         int var5 = (var6 = ((Number)var2.getValue()).longValue() - var0) == 0L ? 0 : (var6 < 0L ? -1 : 1);
         if (var3 == null) {
            return (var5 != 0);
         }

         if (var5 <= 0) {
            return (1 != 0);
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw (RuntimeException)a(var4);
      }

      return (0 != 0);
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Unit i(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      var0.bC();
      var0.bB();
      return Unit.INSTANCE;
   }

   private static final Unit j(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      var0.bD();
      return Unit.INSTANCE;
   }

   private static final Unit a(
      llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl param0, int param1, BlockPos param2, BlockPos param3
   ) {
      java.util.List var5;
      synchronized (me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
         var5 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param3, param2, me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al());
      }
      if (param0.IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll == param1) {
         if (kotlin.jvm.internal.Intrinsics.areEqual(param0.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI, param2)) {
            if (var5 != null && !var5.isEmpty()) {
               param0.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII = var5;
               if (me.octo.client.lIIlllIllIIlIlIllIIIIIIllIlllIllIIIllIlllIllllIllIIIIllIIlllllIIIIIIIIIIllIIllIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k().al()) {
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("\u00a7e[Idle] Prefetched roam path: " + param2 + " -> " + param3 + " (" + var5.size() + ")");
               }
            } else {
               param0.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI = null;
               param0.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl = null;
               param0.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII = null;
            }
         }
      }
      if (param0.IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll == param1) {
         param0.lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl = false;
      }
      return Unit.INSTANCE;
   }

   private static final Unit k(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl param0) {
      String var1 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var1 != null && me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) { param0.a(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, 3000); }
      return Unit.INSTANCE;
   }

   private static final String l(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      String var10000 = var0.W().name();
      short var10001 = -13807;
      short var10002 = -320;
      return "Macro State: " + var10000;
   }

   private static final String m(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      short var10001 = -13816;
      short var10002 = 32438;
      return "Ghosts Killed: " + var0.lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl;
   }

   private static final String bM() {
      short var10001 = -13750;
      short var10002 = 25258;
      String var10000 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b("ghostKills")
      );
      var10001 = -13788;
      var10002 = -12567;
      return "Kills / hr: " + var10000;
   }

   private static final String n(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      short var10001 = -13709;
      short var10002 = -14234;
      return "Sorrow Gained: " + var0.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI;
   }

   private static final String o(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      short var10001 = -13719;
      short var10002 = 20907;
      return "Kill Combo: " + var0.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI;
   }

   private static final String p(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0) {
      short var10001 = -13806;
      short var10002 = 14782;
      return "Last Kill Combo: " + var0.IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll;
   }

   @NotNull
   public static final IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll bN() {
      return lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl.a();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[127];
      int var3 = 0;
      String var2 = "éîªIóè\u0090aEf#\u0012Ð½Hêê\u0090g¶}\u0006\u0001\u008asÚwF\u0013qú¹Í\u009b§Ì·³\u0018LÛ\fZ×ò\u0091\u0082É\u0005:=t\u0092H\u0002Z\b\fÉ\u001b\u001fR\u001b\u0089{\u008bo¶àM\u0005\u008dm\tF\u009c\u0004ª\n~ú\u0006\u0097\rñLP§\u000eÉË®êsy\u0080\u0015x+\u0004_$z(\u008fOÐ[2\u0006ãsFt\u009bP\u0091ä\u008bötÔü_+ß*Ø\u0084\u0080«\u0006P\u0019\u001a²\u0093`l\u009aE³>l=¸\u001e|¹\u0089ÖØ\u000eÆ\u0010\u00901\u0088îé\u0016\u0018\u0002\u0016U\u009au0?T\u0086I\u0002\u009fÄAÊ2Èî±vO7KÛWÔ\\PÊ~£¹÷öÝ\u0006\u0019ê\f\u0003Ú[\u001a»\u0006F¨c-tA\u0007\f\u00881ýB52\u000b>\u008aêBA >\u0093lÂ6\u001ft]î2°+È%\u0010jMK\u0092\u0096p\u0098ô`¦\u0084\u001d'\u001ec·æÄó\u008dé\u0087\t\u0015\u001c]»6ÿ\u0012RT\nYð?dö$j{hÅ\u000b¦\u001aX\u0083ýx\r'BI\u0093\u0004æ\u0098þ¡\u0004«\u0004®\u0014\b4?l\u001dÏæ?\n\"}{`\u0092xêpÕåñ&þîÔ\u0083ôSX¿Õ'ÈO©RB`CR\u0013q\u0007þí\u000bF\u0090`\u001dÃÿ£HÝ\u0097\u001c\u001f||ïÉ\u0095vÄ®ty·è_ïRÌ\u0004\u0004Í\b°¸5^\u009ew[3Ü^Q\f\u0005\u0017\bíÎá\u0004\u0096ûðNó\u000e_HÙ¶cQýLkýcÐ\u0001\u0014\f\u0014\u001bÈµëB\u0006fÇ§$\u000f\r\u0012\u001bêl\u0092\u009d\u0082\u008e¤òè\u0091\u008d\u0005\u0081!\u0003\u0011¦\u0013Z®#õ\u0005WÊC-#?\u0095Í§¥µ\u0086Ø3\u000f»\u007fT\u0006àêí\u007f\u0018A90\u0081¦\u0004\u0005Ë\u009fá\u001c\u0085\bÂ\u009eÿ÷Ú\u008eYÛ\u000bvêFV\u0003Í¯¾PMæ\u0004zn i\u000e¹´\u0094Çä\u001béü²e\u007fá\u001aL\u0002»\u009b\nÏRuEa\u009fìAUÒ\rTyêH&WÍº\u0087\u0095{ÙK:\b°''ODà8<yhx¶(`\u0081\u0083zäÅô\u001d¨\"â0·tÚ\u008b\u000e¶µZÉmÓ\u0091\u0095\u001cFú×pÿ¹\u008c\u0095LÓ\u0080¼d\u009d¦`Ï*\u000e¾æ@O®Í;\u0083\u000fùê\u0005ù1\u0006_^È\"sn\"\u009eË³\u0001\u0011\u0082\u0086\u0004\u009eø\u0094\u0098¸m\rÅO\u0082SÙq§\\{¯üÜ¶õ\u0099®¢\u0005!\bî\u0083\u009c©lW\u001bÔ\"æ\u0091¼«ú\u0018\u0081C9»uÜ$\u001e[ üF|E\u009d\u008fîÎI¥¨ÚÐ¬\u009e¼s,\fsØYºñ\u0088ú©ì\u009cê\u0086\u0004ï\u0093ßÀ\fÛ\u0006Ycf\u007fµ±¼\u0014\u0088w\u0016)³&íÛ¿G\u00998#\u0080´ü\u008fÞÛ=O\u0001¿\u00806F\u0011\u0006°ÞßAß\u0099Usrõd«\u0090:t´òá`¸°Æ\u0011íb¶Xþ?\u008dÙrÁó\u0085¼\u008cÄñ\"K drÄ{0&ds\u0087(m\u0000v®\u008eqz³B«îýk\u0089±C\u001d\u009dÿ\u0099ßÅ\u0012\u0002ðá)\u0083eö5\u0092VL\u0018ø-Î\u007fZèÀ\u0014\rE~\u001fèÇ}aÂA\u0086hÙÃt~µ0\u0094Lhú5×oMP.~LëÐ¤:¹\u0005ÃÛh \u0096\u0005\u0012Ê\u0086\u0096T\u0019¶G\u0000\u000e+éÊ\u0000«\u0017\u0090\u008dt\u008c^è\u0015øÅ\u007f\u008d÷ú½ß\u0007ª\u0007å\fØ\u000ba4\u008fa\u001cª\u00ad\u008a»Fª¼[ùn\u0003pÍÚ\u0096Ë\u0092rG ËÅâ\u0097DG\u009e>C\u0017cü}S\u001dAÿ¦\u0095\u0010\u007f/\u0016á\u009axCßÐ\u0005GC,§\u0001\u001b\u0084J½=N\u008eð\u00adE°èoÒ3\r(\u0085ø\u009f\u0088Î7BÃ\u0089v\u0018\u0005dg\u0000ãÏ ê\u0016=[Ê\u0006\u0087\u0080ùÀm\u0086)Ï=\u000f9\u0096Ä\u0083Ïs\\ó´Ï\u009f\u0089\u008c.²\u0006\u000b=2\u0017°\u0086ÃæP?§<\nÀ\u0088Ú\u0081àÿ\u008bm\u0015z\u0013\u0011\u009eµF\f!Ô~SL\u001a\u009d·Ê 4\u007fZ\u0014\b\u001bëFB\u0089N\u0089\u001c\u0004 æ\u0012/\u0015Ð×\u008dn\u0017\f\fýÖõQ`\u009eó\u0081#Ó©@\u0091\u0099\u000b\bÁ\u008døG\u0017ZÊ¨ôÎ\u001fõÂÞ\u001e³\u008c\u0000ñì\u0092¤\u0095=Y\u0010l\u0098Ñ ~\u008d&\u001a»¶~4\u000018ì\u0012æåK.ÆÁ\t-\u009d¿ò@\u0017\u0089ùÒ\u0092\u0081\u0006¸D\u0010\u0086i\u0081\f¸å1\u008d\u008d\u0011ÐÚXeM\u0089\t1¶Ãì%\u001e¡3\u0089\u0002Ýû*uêÎÝ±ô@þäs¥©\u001dÖ4âh«u\\Uÿ`Îê\t²9p&.½n1ñ3\u0085BMg>\u0082-lÙí&Ð©Äu\u0091wg\u0017\u009bGáÒ;\u0002\u0011\u0098\ræbH\u0092Øû\u001eÓu\u0098E=Ù×Dø . eù\u0015*ì\u0005\u0081Ô¼\u0095X\u000br³þ\u0080»ÅA\u0090Ë¿¢\u0002\n\u008f\f«\u009cÝ\u009ctÏDN\nAùK\u0006¸o:\u0001_\u009d@*p.tÃo\u00919ïöµí,u}g\u0091t[Çù\u008c\u0095\u009dqÁl\u009b\u008aÇrð\u0097äý\r\f\u009f:\u0092k\u009a´ÌßË\u0003\u0084döQ;eû\u009d\u0004\u008eÀÿ\u0001\u0084lVL\u0004a\u0014Ã&,u\u001cq\u008cs\u0080xOÐá\u001fìÏ¤-æ\f¿ôrÛDõ:Ó4\u007f\u0002_?Æs²¢î\u0093dÌ|N£\u0010©2\b`k(\u0090*\u0085x\u009f\njüÁ\u0090÷%>\u0016\u000f8\u0017\u0006\u0094uÝ\u0014\u008fé.^G\u0098û½Â\u008a\u0003x&\u0090Ü¦\u00ad\u0084\u0007\u0095\\wyì\u0017\u0018\u0019¿\u0090\"Áót²E9²Â¿`Ò]|Y6@\u0084ÐÉù\u0094ä\u0007\u0004\u009e¨d¡\u0015\u0087\u0011b\u0004nµÌ~¼°?ù\u0084Pº\u0012[ñH$.X\":[\u009ci\u0000stÇüºn\u0018hx<®N\u0082\u001fûo\u0080vúÖÁÚñ\u0018jè_ë\bÅ/\u009dÚò]æ~\u0012\u009a\u0091qOÀÅÜe\u0097-1Ó3_®\u001c\u00ad¹\u0006\u0089b6B\u00ad\u0019 \f\u0099á·T;óÂa¤ï\u0015×VògýØùR'w½Í¹lf]¬\u0000%»\b\u009f\u0005dXaiº\u0013\u0004j\u000e\u0095U%\r1nÙ¢ÛW¯Ë\u001a+¥èXbeomv·ÜÈÁÅS\u0015ìráäRSª¹táÍ\u000f\u0080½¸¸Ø\u0018\u0092©ÿ\u0013Îß=[\u0093\u0005\u0081Ó\u001dBê\u001cúÃ?:\u0087\u0095\u0082á\f¢\u001e·\u0017î@Óßì\r+\u0011\u0005\u008f\fÅhõc\u001d}ÛÏâ\u00941Lf\u0080\u0001ZIÇ]\u0096-±\u009f\u008cn\u0087Ñ-k«¸$Çª\u0019\u0089ÙÃ\u001fé\u0086P|\u0085rû\u0092\u009dç\u000e°\u0005\u008bp®\u001cÑÚpR\tpV½nÑxj6o\u0013~\u0088g\u001e#\u009f¦B^\b\u0013©Uw\rþ'\u0089g\u000bë@Õ\u0007u¼J..\u0092¼\u0006s0\u001d\u0089¾(\u0013¸ç\u0080iªÄ\u0000ÂÉÛIoÝ\u0094íÿÖ#!\u0005¸<\u0007\\{ u%Îæ±\u0011O\u0087ö\f\u001d\u0000\u0089ô93\u0084RÖ\u0003Â]\u0001\u0088.Ä\u0094Hò¢îï\u00136öQL\u0086\u0097o±ÇØÂÃÝYí\u0092Ö\u008e!\u0006\u0098Ûu\u0086FV\u0004\u008c(ã´\u000e\u0012\u0099ábJ¯<j\b·(»ð\u0007\u000e\u001cÍ\u0014:5mf\u0003\u000f\u0083]J\u000fØ\u0019\u0090\u008cÇBO\u0004%KËs\u009c\u0087«Õ$\u009cv*¥\u0007l¹n\u009a\u0016\u0010L¼ô¬\\\u0018g|\u0090¢\u0083GHD\u0006²\u0004é}+\\\u0011U\u0002ÊÇ>Zc\u001f\"\u009b\u0003Î@×^?\u0091\nW\u001dþÙÎ\u0093m\u008d\u0088\u001b\u0017úÜ?\u0002\u008a-\u008fåøf[W=w\u007f\u00adãÑ\u000e\u0006}K¯\u00040\u0099Þ§\" \u008aN%\u009d\u008dÿÕ7ö\u0016¿â8\f~T°&]5\u0095\fó\u001bÎP¨'\u0013©ý\"\u0018";
      int var4 = "éîªIóè\u0090aEf#\u0012Ð½Hêê\u0090g¶}\u0006\u0001\u008asÚwF\u0013qú¹Í\u009b§Ì·³\u0018LÛ\fZ×ò\u0091\u0082É\u0005:=t\u0092H\u0002Z\b\fÉ\u001b\u001fR\u001b\u0089{\u008bo¶àM\u0005\u008dm\tF\u009c\u0004ª\n~ú\u0006\u0097\rñLP§\u000eÉË®êsy\u0080\u0015x+\u0004_$z(\u008fOÐ[2\u0006ãsFt\u009bP\u0091ä\u008bötÔü_+ß*Ø\u0084\u0080«\u0006P\u0019\u001a²\u0093`l\u009aE³>l=¸\u001e|¹\u0089ÖØ\u000eÆ\u0010\u00901\u0088îé\u0016\u0018\u0002\u0016U\u009au0?T\u0086I\u0002\u009fÄAÊ2Èî±vO7KÛWÔ\\PÊ~£¹÷öÝ\u0006\u0019ê\f\u0003Ú[\u001a»\u0006F¨c-tA\u0007\f\u00881ýB52\u000b>\u008aêBA >\u0093lÂ6\u001ft]î2°+È%\u0010jMK\u0092\u0096p\u0098ô`¦\u0084\u001d'\u001ec·æÄó\u008dé\u0087\t\u0015\u001c]»6ÿ\u0012RT\nYð?dö$j{hÅ\u000b¦\u001aX\u0083ýx\r'BI\u0093\u0004æ\u0098þ¡\u0004«\u0004®\u0014\b4?l\u001dÏæ?\n\"}{`\u0092xêpÕåñ&þîÔ\u0083ôSX¿Õ'ÈO©RB`CR\u0013q\u0007þí\u000bF\u0090`\u001dÃÿ£HÝ\u0097\u001c\u001f||ïÉ\u0095vÄ®ty·è_ïRÌ\u0004\u0004Í\b°¸5^\u009ew[3Ü^Q\f\u0005\u0017\bíÎá\u0004\u0096ûðNó\u000e_HÙ¶cQýLkýcÐ\u0001\u0014\f\u0014\u001bÈµëB\u0006fÇ§$\u000f\r\u0012\u001bêl\u0092\u009d\u0082\u008e¤òè\u0091\u008d\u0005\u0081!\u0003\u0011¦\u0013Z®#õ\u0005WÊC-#?\u0095Í§¥µ\u0086Ø3\u000f»\u007fT\u0006àêí\u007f\u0018A90\u0081¦\u0004\u0005Ë\u009fá\u001c\u0085\bÂ\u009eÿ÷Ú\u008eYÛ\u000bvêFV\u0003Í¯¾PMæ\u0004zn i\u000e¹´\u0094Çä\u001béü²e\u007fá\u001aL\u0002»\u009b\nÏRuEa\u009fìAUÒ\rTyêH&WÍº\u0087\u0095{ÙK:\b°''ODà8<yhx¶(`\u0081\u0083zäÅô\u001d¨\"â0·tÚ\u008b\u000e¶µZÉmÓ\u0091\u0095\u001cFú×pÿ¹\u008c\u0095LÓ\u0080¼d\u009d¦`Ï*\u000e¾æ@O®Í;\u0083\u000fùê\u0005ù1\u0006_^È\"sn\"\u009eË³\u0001\u0011\u0082\u0086\u0004\u009eø\u0094\u0098¸m\rÅO\u0082SÙq§\\{¯üÜ¶õ\u0099®¢\u0005!\bî\u0083\u009c©lW\u001bÔ\"æ\u0091¼«ú\u0018\u0081C9»uÜ$\u001e[ üF|E\u009d\u008fîÎI¥¨ÚÐ¬\u009e¼s,\fsØYºñ\u0088ú©ì\u009cê\u0086\u0004ï\u0093ßÀ\fÛ\u0006Ycf\u007fµ±¼\u0014\u0088w\u0016)³&íÛ¿G\u00998#\u0080´ü\u008fÞÛ=O\u0001¿\u00806F\u0011\u0006°ÞßAß\u0099Usrõd«\u0090:t´òá`¸°Æ\u0011íb¶Xþ?\u008dÙrÁó\u0085¼\u008cÄñ\"K drÄ{0&ds\u0087(m\u0000v®\u008eqz³B«îýk\u0089±C\u001d\u009dÿ\u0099ßÅ\u0012\u0002ðá)\u0083eö5\u0092VL\u0018ø-Î\u007fZèÀ\u0014\rE~\u001fèÇ}aÂA\u0086hÙÃt~µ0\u0094Lhú5×oMP.~LëÐ¤:¹\u0005ÃÛh \u0096\u0005\u0012Ê\u0086\u0096T\u0019¶G\u0000\u000e+éÊ\u0000«\u0017\u0090\u008dt\u008c^è\u0015øÅ\u007f\u008d÷ú½ß\u0007ª\u0007å\fØ\u000ba4\u008fa\u001cª\u00ad\u008a»Fª¼[ùn\u0003pÍÚ\u0096Ë\u0092rG ËÅâ\u0097DG\u009e>C\u0017cü}S\u001dAÿ¦\u0095\u0010\u007f/\u0016á\u009axCßÐ\u0005GC,§\u0001\u001b\u0084J½=N\u008eð\u00adE°èoÒ3\r(\u0085ø\u009f\u0088Î7BÃ\u0089v\u0018\u0005dg\u0000ãÏ ê\u0016=[Ê\u0006\u0087\u0080ùÀm\u0086)Ï=\u000f9\u0096Ä\u0083Ïs\\ó´Ï\u009f\u0089\u008c.²\u0006\u000b=2\u0017°\u0086ÃæP?§<\nÀ\u0088Ú\u0081àÿ\u008bm\u0015z\u0013\u0011\u009eµF\f!Ô~SL\u001a\u009d·Ê 4\u007fZ\u0014\b\u001bëFB\u0089N\u0089\u001c\u0004 æ\u0012/\u0015Ð×\u008dn\u0017\f\fýÖõQ`\u009eó\u0081#Ó©@\u0091\u0099\u000b\bÁ\u008døG\u0017ZÊ¨ôÎ\u001fõÂÞ\u001e³\u008c\u0000ñì\u0092¤\u0095=Y\u0010l\u0098Ñ ~\u008d&\u001a»¶~4\u000018ì\u0012æåK.ÆÁ\t-\u009d¿ò@\u0017\u0089ùÒ\u0092\u0081\u0006¸D\u0010\u0086i\u0081\f¸å1\u008d\u008d\u0011ÐÚXeM\u0089\t1¶Ãì%\u001e¡3\u0089\u0002Ýû*uêÎÝ±ô@þäs¥©\u001dÖ4âh«u\\Uÿ`Îê\t²9p&.½n1ñ3\u0085BMg>\u0082-lÙí&Ð©Äu\u0091wg\u0017\u009bGáÒ;\u0002\u0011\u0098\ræbH\u0092Øû\u001eÓu\u0098E=Ù×Dø . eù\u0015*ì\u0005\u0081Ô¼\u0095X\u000br³þ\u0080»ÅA\u0090Ë¿¢\u0002\n\u008f\f«\u009cÝ\u009ctÏDN\nAùK\u0006¸o:\u0001_\u009d@*p.tÃo\u00919ïöµí,u}g\u0091t[Çù\u008c\u0095\u009dqÁl\u009b\u008aÇrð\u0097äý\r\f\u009f:\u0092k\u009a´ÌßË\u0003\u0084döQ;eû\u009d\u0004\u008eÀÿ\u0001\u0084lVL\u0004a\u0014Ã&,u\u001cq\u008cs\u0080xOÐá\u001fìÏ¤-æ\f¿ôrÛDõ:Ó4\u007f\u0002_?Æs²¢î\u0093dÌ|N£\u0010©2\b`k(\u0090*\u0085x\u009f\njüÁ\u0090÷%>\u0016\u000f8\u0017\u0006\u0094uÝ\u0014\u008fé.^G\u0098û½Â\u008a\u0003x&\u0090Ü¦\u00ad\u0084\u0007\u0095\\wyì\u0017\u0018\u0019¿\u0090\"Áót²E9²Â¿`Ò]|Y6@\u0084ÐÉù\u0094ä\u0007\u0004\u009e¨d¡\u0015\u0087\u0011b\u0004nµÌ~¼°?ù\u0084Pº\u0012[ñH$.X\":[\u009ci\u0000stÇüºn\u0018hx<®N\u0082\u001fûo\u0080vúÖÁÚñ\u0018jè_ë\bÅ/\u009dÚò]æ~\u0012\u009a\u0091qOÀÅÜe\u0097-1Ó3_®\u001c\u00ad¹\u0006\u0089b6B\u00ad\u0019 \f\u0099á·T;óÂa¤ï\u0015×VògýØùR'w½Í¹lf]¬\u0000%»\b\u009f\u0005dXaiº\u0013\u0004j\u000e\u0095U%\r1nÙ¢ÛW¯Ë\u001a+¥èXbeomv·ÜÈÁÅS\u0015ìráäRSª¹táÍ\u000f\u0080½¸¸Ø\u0018\u0092©ÿ\u0013Îß=[\u0093\u0005\u0081Ó\u001dBê\u001cúÃ?:\u0087\u0095\u0082á\f¢\u001e·\u0017î@Óßì\r+\u0011\u0005\u008f\fÅhõc\u001d}ÛÏâ\u00941Lf\u0080\u0001ZIÇ]\u0096-±\u009f\u008cn\u0087Ñ-k«¸$Çª\u0019\u0089ÙÃ\u001fé\u0086P|\u0085rû\u0092\u009dç\u000e°\u0005\u008bp®\u001cÑÚpR\tpV½nÑxj6o\u0013~\u0088g\u001e#\u009f¦B^\b\u0013©Uw\rþ'\u0089g\u000bë@Õ\u0007u¼J..\u0092¼\u0006s0\u001d\u0089¾(\u0013¸ç\u0080iªÄ\u0000ÂÉÛIoÝ\u0094íÿÖ#!\u0005¸<\u0007\\{ u%Îæ±\u0011O\u0087ö\f\u001d\u0000\u0089ô93\u0084RÖ\u0003Â]\u0001\u0088.Ä\u0094Hò¢îï\u00136öQL\u0086\u0097o±ÇØÂÃÝYí\u0092Ö\u008e!\u0006\u0098Ûu\u0086FV\u0004\u008c(ã´\u000e\u0012\u0099ábJ¯<j\b·(»ð\u0007\u000e\u001cÍ\u0014:5mf\u0003\u000f\u0083]J\u000fØ\u0019\u0090\u008cÇBO\u0004%KËs\u009c\u0087«Õ$\u009cv*¥\u0007l¹n\u009a\u0016\u0010L¼ô¬\\\u0018g|\u0090¢\u0083GHD\u0006²\u0004é}+\\\u0011U\u0002ÊÇ>Zc\u001f\"\u009b\u0003Î@×^?\u0091\nW\u001dþÙÎ\u0093m\u008d\u0088\u001b\u0017úÜ?\u0002\u008a-\u008fåøf[W=w\u007f\u00adãÑ\u000e\u0006}K¯\u00040\u0099Þ§\" \u008aN%\u009d\u008dÿÕ7ö\u0016¿â8\f~T°&]5\u0095\fó\u001bÎP¨'\u0013©ý\"\u0018"
         .length();
      char var1 = 21;
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
                     case 0 -> 114;
                     case 1 -> 40;
                     case 2 -> 41;
                     case 3 -> 19;
                     case 4 -> 19;
                     case 5 -> 12;
                     default -> 62;
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
                     k = new String[127];
                     lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI = new IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll();
                     IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll = new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl();
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

                  var2 = "Iù¸g0ïú/\u0099}|(y\u0011\u009etsÐ\u0014´âZê\u009c\u0098\u009fJ>dM8";
                  var4 = "Iù¸g0ïú/\u0099}|(y\u0011\u009etsÐ\u0014´âZê\u009c\u0098\u009fJ>dM8".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 19;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -13716) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 144;
            case 1 -> 14;
            case 2 -> 228;
            case 3 -> 84;
            case 4 -> 77;
            case 5 -> 66;
            case 6 -> 62;
            case 7 -> 149;
            case 8 -> 229;
            case 9 -> 151;
            case 10 -> 127;
            case 11 -> 120;
            case 12 -> 12;
            case 13 -> 15;
            case 14 -> 196;
            case 15 -> 219;
            case 16 -> 20;
            case 17 -> 106;
            case 18 -> 255;
            case 19 -> 161;
            case 20 -> 235;
            case 21 -> 134;
            case 22 -> 130;
            case 23 -> 249;
            case 24 -> 92;
            case 25 -> 79;
            case 26 -> 170;
            case 27 -> 115;
            case 28 -> 99;
            case 29 -> 36;
            case 30 -> 76;
            case 31 -> 173;
            case 32 -> 236;
            case 33 -> 143;
            case 34 -> 168;
            case 35 -> 148;
            case 36 -> 190;
            case 37 -> 44;
            case 38 -> 117;
            case 39 -> 183;
            case 40 -> 91;
            case 41 -> 176;
            case 42 -> 216;
            case 43 -> 237;
            case 44 -> 251;
            case 45 -> 231;
            case 46 -> 60;
            case 47 -> 35;
            case 48 -> 131;
            case 49 -> 155;
            case 50 -> 208;
            case 51 -> 69;
            case 52 -> 25;
            case 53 -> 71;
            case 54 -> 96;
            case 55 -> 22;
            case 56 -> 147;
            case 57 -> 203;
            case 58 -> 238;
            case 59 -> 171;
            case 60 -> 16;
            case 61 -> 74;
            case 62 -> 187;
            case 63 -> 31;
            case 64 -> 153;
            case 65 -> 63;
            case 66 -> 182;
            case 67 -> 46;
            case 68 -> 178;
            case 69 -> 47;
            case 70 -> 140;
            case 71 -> 244;
            case 72 -> 210;
            case 73 -> 72;
            case 74 -> 107;
            case 75 -> 146;
            case 76 -> 94;
            case 77 -> 53;
            case 78 -> 124;
            case 79 -> 28;
            case 80 -> 218;
            case 81 -> 198;
            case 82 -> 54;
            case 83 -> 162;
            case 84 -> 58;
            case 85 -> 27;
            case 86 -> 68;
            case 87 -> 189;
            case 88 -> 145;
            case 89 -> 123;
            case 90 -> 19;
            case 91 -> 2;
            case 92 -> 118;
            case 93 -> 188;
            case 94 -> 142;
            case 95 -> 86;
            case 96 -> 3;
            case 97 -> 199;
            case 98 -> 61;
            case 99 -> 174;
            case 100 -> 40;
            case 101 -> 232;
            case 102 -> 220;
            case 103 -> 29;
            case 104 -> 45;
            case 105 -> 97;
            case 106 -> 21;
            case 107 -> 13;
            case 108 -> 191;
            case 109 -> 154;
            case 110 -> 215;
            case 111 -> 230;
            case 112 -> 152;
            case 113 -> 122;
            case 114 -> 158;
            case 115 -> 163;
            case 116 -> 6;
            case 117 -> 102;
            case 118 -> 254;
            case 119 -> 67;
            case 120 -> 217;
            case 121 -> 95;
            case 122 -> 125;
            case 123 -> 202;
            case 124 -> 160;
            case 125 -> 82;
            case 126 -> 197;
            case 127 -> 119;
            case 128 -> 167;
            case 129 -> 116;
            case 130 -> 185;
            case 131 -> 83;
            case 132 -> 55;
            case 133 -> 26;
            case 134 -> 18;
            case 135 -> 225;
            case 136 -> 133;
            case 137 -> 165;
            case 138 -> 248;
            case 139 -> 9;
            case 140 -> 49;
            case 141 -> 65;
            case 142 -> 192;
            case 143 -> 180;
            case 144 -> 181;
            case 145 -> 224;
            case 146 -> 33;
            case 147 -> 250;
            case 148 -> 128;
            case 149 -> 37;
            case 150 -> 177;
            case 151 -> 41;
            case 152 -> 135;
            case 153 -> 247;
            case 154 -> 221;
            case 155 -> 87;
            case 156 -> 242;
            case 157 -> 137;
            case 158 -> 108;
            case 159 -> 73;
            case 160 -> 207;
            case 161 -> 156;
            case 162 -> 195;
            case 163 -> 93;
            case 164 -> 129;
            case 165 -> 159;
            case 166 -> 113;
            case 167 -> 226;
            case 168 -> 89;
            case 169 -> 7;
            case 170 -> 109;
            case 171 -> 209;
            case 172 -> 138;
            case 173 -> 50;
            case 174 -> 38;
            case 175 -> 110;
            case 176 -> 64;
            case 177 -> 104;
            case 178 -> 101;
            case 179 -> 78;
            case 180 -> 39;
            case 181 -> 105;
            case 182 -> 70;
            case 183 -> 222;
            case 184 -> 88;
            case 185 -> 59;
            case 186 -> 1;
            case 187 -> 240;
            case 188 -> 56;
            case 189 -> 57;
            case 190 -> 139;
            case 191 -> 17;
            case 192 -> 184;
            case 193 -> 126;
            case 194 -> 243;
            case 195 -> 213;
            case 196 -> 239;
            case 197 -> 81;
            case 198 -> 48;
            case 199 -> 246;
            case 200 -> 212;
            case 201 -> 166;
            case 202 -> 0;
            case 203 -> 227;
            case 204 -> 164;
            case 205 -> 253;
            case 206 -> 175;
            case 207 -> 103;
            case 208 -> 85;
            case 209 -> 205;
            case 210 -> 234;
            case 211 -> 193;
            case 212 -> 150;
            case 213 -> 223;
            case 214 -> 206;
            case 215 -> 169;
            case 216 -> 24;
            case 217 -> 132;
            case 218 -> 214;
            case 219 -> 51;
            case 220 -> 141;
            case 221 -> 245;
            case 222 -> 241;
            case 223 -> 32;
            case 224 -> 172;
            case 225 -> 121;
            case 226 -> 200;
            case 227 -> 252;
            case 228 -> 112;
            case 229 -> 23;
            case 230 -> 75;
            case 231 -> 98;
            case 232 -> 4;
            case 233 -> 204;
            case 234 -> 136;
            case 235 -> 5;
            case 236 -> 114;
            case 237 -> 179;
            case 238 -> 211;
            case 239 -> 34;
            case 240 -> 80;
            case 241 -> 100;
            case 242 -> 42;
            case 243 -> 194;
            case 244 -> 111;
            case 245 -> 201;
            case 246 -> 233;
            case 247 -> 157;
            case 248 -> 8;
            case 249 -> 43;
            case 250 -> 90;
            case 251 -> 52;
            case 252 -> 10;
            case 253 -> 30;
            case 254 -> 186;
            default -> 11;
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
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
         int var1,
         int var2,
         boolean var3,
         @Nullable List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var4
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
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

      @Nullable
      public final List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> d() {
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

      @Nullable
      public final List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(
         int var1,
         int var2,
         boolean var3,
         @Nullable List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var4
      ) {
         return new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            var1, var2, var3, var4
         );
      }
      public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var0, int var1, int var2, boolean var3, List var4, int var5, Object var6) {
         String var7 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         if ((var5 & 1) != 0 && var7 != null) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         if ((var5 & 2) != 0 && var7 != null) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if ((var5 & 4) != 0 && var7 != null) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if ((var5 & 8) != 0) {
            var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         return var0.a(var1, var2, var3, var4);
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -28314;
         List var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -10999;
         short var10002 = -28316;
         short var10003 = -2685;
         short var10004 = -28315;
         short var10005 = -10927;
         short var10006 = -28313;
         short var10007 = -27560;
         return "PrefetchedGhostPath(fromTargetId=" + var4 + ", targetId=" + var3 + ", directOnly=" + var2 + ", path=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         var2 = var2 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         String var1 = var10000;
         var2 = var2 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         int var5 = var2 * 31;
         List var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
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
         String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
            )) {
               return false;
            }

            var10000 = var1;
         }

         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var10000;
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
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "y³Ël}Ü)!\u0007\u0013âgþF4\u0094Ê®\u0088[¥<\u008cì7ìÍ;ûö\u009c²\u001aù\u009bTäS!«w";
         int var4 = "y³Ël}Ü)!\u0007\u0013âgþF4\u0094Ê®\u0088[¥<\u008cì7ìÍ;ûö\u009c²\u001aù\u009bTäS!«w".length();
         char var1 = 7;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 41;
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
                        case 0 -> 1;
                        case 1 -> 3;
                        case 2 -> 17;
                        case 3 -> 51;
                        case 4 -> 32;
                        case 5 -> 30;
                        default -> 73;
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

                     var2 = "=\u008fÖbÏ\u0098fá+\u0014q×\u0007\u000b\u008f\u000f\u0090z\u0015\u0090;¢@v\u008b";
                     var4 = "=\u008fÖbÏ\u0098fá+\u0014q×\u0007\u000b\u008f\u000f\u0090z\u0015\u0090;¢@v\u008b".length();
                     var1 = '\r';
                     var8 = -1;
               }

               var10000 = 12;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -28313) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 63;
               case 1 -> 247;
               case 2 -> 196;
               case 3 -> 175;
               case 4 -> 170;
               case 5 -> 121;
               case 6 -> 116;
               case 7 -> 0;
               case 8 -> 164;
               case 9 -> 66;
               case 10 -> 1;
               case 11 -> 3;
               case 12 -> 79;
               case 13 -> 60;
               case 14 -> 120;
               case 15 -> 22;
               case 16 -> 113;
               case 17 -> 181;
               case 18 -> 253;
               case 19 -> 159;
               case 20 -> 180;
               case 21 -> 70;
               case 22 -> 218;
               case 23 -> 61;
               case 24 -> 80;
               case 25 -> 237;
               case 26 -> 99;
               case 27 -> 11;
               case 28 -> 92;
               case 29 -> 232;
               case 30 -> 23;
               case 31 -> 117;
               case 32 -> 136;
               case 33 -> 115;
               case 34 -> 234;
               case 35 -> 122;
               case 36 -> 250;
               case 37 -> 197;
               case 38 -> 30;
               case 39 -> 208;
               case 40 -> 132;
               case 41 -> 223;
               case 42 -> 171;
               case 43 -> 160;
               case 44 -> 58;
               case 45 -> 35;
               case 46 -> 89;
               case 47 -> 138;
               case 48 -> 53;
               case 49 -> 41;
               case 50 -> 215;
               case 51 -> 238;
               case 52 -> 211;
               case 53 -> 91;
               case 54 -> 187;
               case 55 -> 76;
               case 56 -> 102;
               case 57 -> 248;
               case 58 -> 193;
               case 59 -> 157;
               case 60 -> 188;
               case 61 -> 225;
               case 62 -> 77;
               case 63 -> 65;
               case 64 -> 26;
               case 65 -> 183;
               case 66 -> 150;
               case 67 -> 252;
               case 68 -> 240;
               case 69 -> 229;
               case 70 -> 108;
               case 71 -> 18;
               case 72 -> 204;
               case 73 -> 28;
               case 74 -> 44;
               case 75 -> 200;
               case 76 -> 143;
               case 77 -> 43;
               case 78 -> 230;
               case 79 -> 96;
               case 80 -> 148;
               case 81 -> 219;
               case 82 -> 146;
               case 83 -> 8;
               case 84 -> 20;
               case 85 -> 221;
               case 86 -> 161;
               case 87 -> 36;
               case 88 -> 236;
               case 89 -> 134;
               case 90 -> 169;
               case 91 -> 19;
               case 92 -> 155;
               case 93 -> 235;
               case 94 -> 34;
               case 95 -> 82;
               case 96 -> 98;
               case 97 -> 100;
               case 98 -> 57;
               case 99 -> 42;
               case 100 -> 145;
               case 101 -> 46;
               case 102 -> 25;
               case 103 -> 184;
               case 104 -> 51;
               case 105 -> 38;
               case 106 -> 133;
               case 107 -> 154;
               case 108 -> 81;
               case 109 -> 75;
               case 110 -> 135;
               case 111 -> 224;
               case 112 -> 48;
               case 113 -> 189;
               case 114 -> 214;
               case 115 -> 167;
               case 116 -> 64;
               case 117 -> 158;
               case 118 -> 69;
               case 119 -> 210;
               case 120 -> 216;
               case 121 -> 32;
               case 122 -> 220;
               case 123 -> 198;
               case 124 -> 4;
               case 125 -> 112;
               case 126 -> 203;
               case 127 -> 123;
               case 128 -> 85;
               case 129 -> 72;
               case 130 -> 213;
               case 131 -> 68;
               case 132 -> 144;
               case 133 -> 217;
               case 134 -> 107;
               case 135 -> 27;
               case 136 -> 241;
               case 137 -> 255;
               case 138 -> 141;
               case 139 -> 95;
               case 140 -> 151;
               case 141 -> 110;
               case 142 -> 242;
               case 143 -> 140;
               case 144 -> 202;
               case 145 -> 205;
               case 146 -> 194;
               case 147 -> 165;
               case 148 -> 126;
               case 149 -> 106;
               case 150 -> 31;
               case 151 -> 244;
               case 152 -> 50;
               case 153 -> 153;
               case 154 -> 17;
               case 155 -> 139;
               case 156 -> 209;
               case 157 -> 226;
               case 158 -> 33;
               case 159 -> 125;
               case 160 -> 128;
               case 161 -> 190;
               case 162 -> 52;
               case 163 -> 74;
               case 164 -> 178;
               case 165 -> 185;
               case 166 -> 6;
               case 167 -> 222;
               case 168 -> 163;
               case 169 -> 83;
               case 170 -> 186;
               case 171 -> 119;
               case 172 -> 105;
               case 173 -> 93;
               case 174 -> 15;
               case 175 -> 227;
               case 176 -> 142;
               case 177 -> 90;
               case 178 -> 40;
               case 179 -> 176;
               case 180 -> 54;
               case 181 -> 84;
               case 182 -> 233;
               case 183 -> 207;
               case 184 -> 59;
               case 185 -> 55;
               case 186 -> 16;
               case 187 -> 94;
               case 188 -> 7;
               case 189 -> 56;
               case 190 -> 137;
               case 191 -> 212;
               case 192 -> 13;
               case 193 -> 101;
               case 194 -> 228;
               case 195 -> 182;
               case 196 -> 162;
               case 197 -> 71;
               case 198 -> 88;
               case 199 -> 245;
               case 200 -> 86;
               case 201 -> 78;
               case 202 -> 192;
               case 203 -> 2;
               case 204 -> 49;
               case 205 -> 62;
               case 206 -> 87;
               case 207 -> 114;
               case 208 -> 239;
               case 209 -> 243;
               case 210 -> 147;
               case 211 -> 199;
               case 212 -> 118;
               case 213 -> 109;
               case 214 -> 191;
               case 215 -> 249;
               case 216 -> 104;
               case 217 -> 10;
               case 218 -> 206;
               case 219 -> 14;
               case 220 -> 103;
               case 221 -> 21;
               case 222 -> 201;
               case 223 -> 39;
               case 224 -> 129;
               case 225 -> 47;
               case 226 -> 97;
               case 227 -> 172;
               case 228 -> 37;
               case 229 -> 111;
               case 230 -> 251;
               case 231 -> 124;
               case 232 -> 9;
               case 233 -> 24;
               case 234 -> 45;
               case 235 -> 168;
               case 236 -> 231;
               case 237 -> 29;
               case 238 -> 130;
               case 239 -> 195;
               case 240 -> 246;
               case 241 -> 149;
               case 242 -> 179;
               case 243 -> 254;
               case 244 -> 67;
               case 245 -> 156;
               case 246 -> 73;
               case 247 -> 131;
               case 248 -> 152;
               case 249 -> 166;
               case 250 -> 174;
               case 251 -> 127;
               case 252 -> 12;
               case 253 -> 5;
               case 254 -> 177;
               default -> 173;
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
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Object... px) {
           this(0.0, null, 0.0, 0.0, 0.0, 0.0, null, null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

      private final double IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final Double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @Nullable
      private final Function1<Creeper, Boolean> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @Nullable
      private final Function1<Creeper, Boolean> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         double var1,
         @Nullable Double var3,
         double var4,
         double var6,
         double var8,
         double var10,
         @Nullable Function1<? super Creeper, Boolean> var12,
         @Nullable Function1<? super Creeper, Boolean> var13
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var6;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var8;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var10;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll =((Function1)( var12));
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll =((Function1)( var13));
      }

      // PX-FIX RC2a row182: Kotlin default-args sibling ctor descriptor (DLjava/lang/Double;DDDDLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // jar bytecode: if ((mask & 64) != 0) slot12 = null; if ((mask & 128) != 0) slot13 = slot12; then <init>(d1,d3,d4,d6,d8,d10,slot12,slot13)
      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         double var1,
         @Nullable Double var3,
         double var4,
         double var6,
         double var8,
         double var10,
         @Nullable Function1<? super Creeper, Boolean> var12,
         @Nullable Function1<? super Creeper, Boolean> var13,
         int var14,
         kotlin.jvm.internal.DefaultConstructorMarker var15
      ) {
         this(var1, var3, var4, var6, var8, var10,
            (var14 & 64) != 0 ? (Function1<? super Creeper, Boolean>) null : var12,
            (var14 & 128) != 0 ? ((var14 & 64) != 0 ? (Function1<? super Creeper, Boolean>) null : var12) : var13);
      }

      public final double a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final Double b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final double f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final Function1<Creeper, Boolean> g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @Nullable
      public final Function1<Creeper, Boolean> h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final boolean a(@NotNull Creeper var1, boolean var2) {
         String var3;
         double var7;
         String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Intrinsics.checkNotNullParameter(var1, "e");
         var3 = var10000;
         label60:
         if (var2) {
            llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var6 = this;
            if (var3 != null) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
                  var7 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  break label60;
               }

               var6 = this;
            }

            var7 = var6.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         } else {
            var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         double var4 = var7;
         double var9;
         int var8 = (var9 = var1.getX() - var4) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
         if (var3 != null) {
            if (var8 <= 0) {
               return (0 != 0);
            }

            double var10;
            var8 = (var10 = var1.getX() - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) == 0.0
               ? 0
               : (var10 < 0.0 ? -1 : 1);
         }

         if (var3 != null) {
            if (var8 >= 0) {
               return (0 != 0);
            }

            double var11;
            var8 = (var11 = var1.getZ() - this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) == 0.0
               ? 0
               : (var11 < 0.0 ? -1 : 1);
         }

         if (var3 != null) {
            if (var8 <= 0) {
               return (0 != 0);
            }

            double var12;
            var8 = (var12 = var1.getZ() - this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) == 0.0
               ? 0
               : (var12 < 0.0 ? -1 : 1);
         }

         if (var3 != null) {
            if (var8 >= 0) {
               return (0 != 0);
            }

            double var13;
            var8 = (var13 = var1.getY() - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) == 0.0
               ? 0
               : (var13 < 0.0 ? -1 : 1);
         }

         if (var3 == null) {
            return (var8 != 0);
         } else {
            return (var8 < 0);
         }
      }

      public final boolean a(@NotNull Creeper var1) {
         String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Intrinsics.checkNotNullParameter(var1, "e");
         String var2 = var10000;
         boolean var3;
         if (var2 != null && this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
            var3 = (Boolean)this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.invoke(var1);
            if (var2 != null) {
               ;
            }
         } else {
            var3 = false;
         }

         return var3;
      }

      public final boolean b(@NotNull Creeper var1) {
         String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Intrinsics.checkNotNullParameter(var1, "e");
         String var2 = var10000;
         boolean var3;
         if (var2 != null && this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
            var3 = (Boolean)this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.invoke(var1);
            if (var2 != null) {
               ;
            }
         } else {
            var3 = false;
         }

         return var3;
      }

      public final boolean i() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null;
      }
   }

   private static enum IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

      public static llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll[] a() {
         return (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll a(
         String var0
      ) {
         return Enum.valueOf(
            llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};
      private static final EnumEntries<IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   

  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll[] c() { return new me.octo.client.llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl }; }
}

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @NotNull
      private final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final Vec3 lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private final boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @Nullable
      private final BlockPos IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private final int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private final int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private final int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      private final boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      private final boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      @NotNull
      private final Triple<Integer, Integer, Integer> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         @NotNull llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var1,
         int var2,
         int var3,
         @Nullable Vec3 var4,
         boolean var5,
         boolean var6,
         boolean var7,
         boolean var8,
         @Nullable BlockPos var9,
         int var10,
         int var11,
         int var12,
         boolean var13,
         boolean var14,
         @NotNull Triple<Integer, Integer, Integer> var15
      ) {
         short var10001 = 14139;
         short var10002 = 8172;
         Intrinsics.checkNotNullParameter(var1, "combatState");
         var10001 = 14120;
         var10002 = -25458;
         Intrinsics.checkNotNullParameter(var15, "playerPos");
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
      }

      @NotNull
      public final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Vec3 d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final boolean g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @Nullable
      public final BlockPos i() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final int j() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final int k() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final int l() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      public final boolean m() {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      public final boolean n() {
         return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> o() {
         return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      @NotNull
      public final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll p() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int q() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int r() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Vec3 s() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean t() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean u() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final boolean v() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean w() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @Nullable
      public final BlockPos x() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final int y() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final int z() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final int A() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      public final boolean B() {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      public final boolean C() {
         return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> D() {
         return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      @NotNull
      public final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @NotNull llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var1,
         int var2,
         int var3,
         @Nullable Vec3 var4,
         boolean var5,
         boolean var6,
         boolean var7,
         boolean var8,
         @Nullable BlockPos var9,
         int var10,
         int var11,
         int var12,
         boolean var13,
         boolean var14,
         @NotNull Triple<Integer, Integer, Integer> var15
      ) {
         short var10001 = 14118;
         short var10002 = -5330;
         Intrinsics.checkNotNullParameter(var1, "combatState");
         var10001 = 14112;
         var10002 = -5570;
         Intrinsics.checkNotNullParameter(var15, "playerPos");
         return new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15
         );
      }
      public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var0, llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var1, int var2, int var3, Vec3 var4, boolean var5, boolean var6, boolean var7, boolean var8, BlockPos var9, int var10, int var11, int var12, boolean var13, boolean var14, Triple<Integer, Integer, Integer> var15, int var16, Object var17) {
         String var18 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         if ((var16 & 1) != 0 && var18 != null) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if ((var16 & 2) != 0 && var18 != null) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if ((var16 & 4) != 0 && var18 != null) {
            var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         if ((var16 & 8) != 0 && var18 != null) {
            var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         if ((var16 & 16) != 0 && var18 != null) {
            var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         if ((var16 & 32) != 0 && var18 != null) {
            var7 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         }

         if ((var16 & 64) != 0 && var18 != null) {
            var8 = var0.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         }

         if ((var16 & 128) != 0 && var18 != null) {
            var9 = var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         }

         if ((var16 & 256) != 0 && var18 != null) {
            var10 = var0.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         }

         if ((var16 & 512) != 0 && var18 != null) {
            var11 = var0.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         }

         if ((var16 & 1024) != 0 && var18 != null) {
            var12 = var0.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         }

         if ((var16 & 2048) != 0 && var18 != null) {
            var13 = var0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }

         if ((var16 & 4096) != 0 && var18 != null) {
            var14 = var0.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         }

         if ((var16 & 8192) != 0) {
            var15 = var0.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         }

         return var0.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 14123;
         Triple var1 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         boolean var2 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         boolean var3 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         int var4 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         int var5 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         int var6 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         BlockPos var7 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         boolean var8 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         boolean var9 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         boolean var10 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var11 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Vec3 var12 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var13 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var14 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var15 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -23529;
         short var10002 = 14113;
         short var10003 = 7246;
         short var10004 = 14117;
         short var10005 = -271;
         short var10006 = 14114;
         short var10007 = 25410;
         short var10008 = 14116;
         short var10009 = 8781;
         short var10010 = 14124;
         short var10011 = -26758;
         short var10012 = 14137;
         short var10013 = 3225;
         short var10014 = 14121;
         short var10015 = -29805;
         short var10016 = 14127;
         short var10017 = -2466;
         short var10018 = 14125;
         short var10019 = -19750;
         short var10020 = 14119;
         short var10021 = -9465;
         short var10022 = 14122;
         short var10023 = 19808;
         short var10024 = 14126;
         short var10025 = -2155;
         short var10026 = 14115;
         short var10027 = 6839;
         short var10028 = 14138;
         short var10029 = 30540;
         return "GhostCombatProgress(combatState="
            + var15
            + ", targetId="
            + var14
            + ", directWalkTargetId="
            + var13
            + ", lastPathTargetPos="
            + var12
            + ", ghostWalkerFinished="
            + var11
            + ", ghostWalkerFailed="
            + var10
            + ", ghostWalkerComputing="
            + var9
            + ", idleWalking="
            + var8
            + ", idleWaypoint="
            + var7
            + ", cachedGhosts="
            + var6
            + ", blacklisted="
            + var5
            + ", prefetchedPaths="
            + var4
            + ", prefetchRunning="
            + var3
            + ", idlePrefetchRunning="
            + var2
            + ", playerPos="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var17;
         int var19;
         label29: {
            String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
            int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            var2 = var2 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var2 = var2 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            var1 = var10000;
            var17 = var2 * 31;
            Vec3 var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var1 != null) {
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  var19 = 0;
                  break label29;
               }

               var10001 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var19 = var10001.hashCode();
         }

         label23: {
            int var5 = var17 + var19;
            var5 = var5 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            var5 = var5 * 31 + Boolean.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
            var5 = var5 * 31 + Boolean.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
            var5 = var5 * 31 + Boolean.hashCode(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
            var17 = var5 * 31;
            BlockPos var20 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            if (var1 != null) {
               if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == null) {
                  var19 = 0;
                  break label23;
               }

               var20 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            }

            var19 = var20.hashCode();
         }

         int var10 = var17 + var19;
         var10 = var10 * 31 + Integer.hashCode(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         var10 = var10 * 31 + Integer.hashCode(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
         var10 = var10 * 31 + Integer.hashCode(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
         var10 = var10 * 31 + Boolean.hashCode(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
         var10 = var10 * 31 + Boolean.hashCode(this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
         var10 = var10 * 31 + this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.hashCode();
         if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
               "R7NKhb"
            );
         }

         return var10;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var5 = null; // PX-FIX
         String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var1;
         }

         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = var10000;
         var10000 = this;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var10000 = this;
         }

         label148: {
            var5 = var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            int var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 != null) {
               if (var10000.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
                  return false;
               }

               var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var2 == null) {
                  break label148;
               }

               var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if ((Boolean)var5 != ((var10001 == 0))) {
               return false;
            }

            var5 = Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 != null) {
            if (((Boolean)(var5))) {
               return false;
            }

            var5 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         int var6 = ((var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
         if (var2 != null) {
            if ((Boolean)var5 != (!var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII)) {
               return false;
            }

            var5 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var6 = ((var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) ? 1 : 0);
         }

         if (var2 != null) {
            if ((Boolean)var5 != ((var6 == 0))) {
               return false;
            }

            var5 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            var6 = ((var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
         }

         label150: {
            if (var2 != null) {
               if ((Boolean)var5 != ((var6 == 0))) {
                  return false;
               }

               var5 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
               if (var2 == null) {
                  break label150;
               }

               var6 = ((var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
            }

            if ((Boolean)var5 != ((var6 == 0))) {
               return false;
            }

            var5 = Intrinsics.areEqual(
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
               var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            );
         }

         if (var2 != null) {
            if (((Boolean)(var5))) {
               return false;
            }

            var5 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         }

         var6 = var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         if (var2 != null) {
            if ((Boolean)var5 != ((var3.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI == 0))) {
               return false;
            }

            var5 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            var6 = var3.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         }

         if (var2 != null) {
            if ((Boolean)var5 != ((var6 == 0))) {
               return false;
            }

            var5 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            var6 = var3.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         }

         if (var2 != null) {
            if ((Boolean)var5 != ((var6 == 0))) {
               return false;
            }

            var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            var6 = ((var3.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
         }

         label152: {
            if (var2 != null) {
               if ((Boolean)var5 != ((var6 == 0))) {
                  return false;
               }

               var5 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
               if (var2 == null) {
                  break label152;
               }

               var6 = ((var3.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) ? 1 : 0);
            }

            if ((Boolean)var5 != ((var6 == 0))) {
               return false;
            }

            var5 = Intrinsics.areEqual(
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
               var3.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            );
         }

         if (var2 != null) {
            if (((Boolean)(var5))) {
               return false;
            }

            var5 = 1;
         }

         return (boolean)var5;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[19];
         int var3 = 0;
         String var2 = "\u000e¹]¡â\b\u0094\r§\\.)/Mô\u008c,^\u0080\u009c3\u009bÑÏ\u001b\u001c\u001fPñQJm\u001295¢pð6ïR\u0082\u0084º.¬\u0011ñÒë\u0082\u000eÝÌ'YsÄ\u0085z´5\u009eq\u0092í\t\u008fp²\u0016Á\u0084ü\u0089c\u000f\u009akÏ\u00adnZ&©ÕT\u0003\"î)\t\u0012s\u0088ëÇÙÀÊ\u008c&_\u0019D7`f\u0014³\u009c\u000fã¢ê\u0091\u008euæå\u0087`°¥\u0082\u0087Ý\u0014f`^À\u0090l¹\u008dy<\u0089¼'Eó\u009a\u0003òZÈ\u0016®ÒI\u009a¾¼;f\u008dÊ\u009d8{ÈxÜ%®ÑzD\u009b\u0014Ì2\u0000\u0083-+µ´Mï\u0087F>¿ÔÝ_®}\b\u000bR}ËjN\u0005Í\u0015ì`@\t\u0082×\u0013âõ\u001azZ³\u000e\u00114µNF)³\fÌO).Ùl\u000b\\\u0080µp¨6V\u0002G\u0092@\u0015ua?áÂ\u007fZ\u0018ÆÄ\u0089\u0001æ\u001a:¼Bèwáî\u0016G\u000bz\u00ad\u0014Á)8k\u008aËjo\u009fòÆ/\u0088v\u000b\u0092ß\u000bñ½\u0000×\u001eÂ\u0080\u009c\u009dA\u001b";
         int var4 = "\u000e¹]¡â\b\u0094\r§\\.)/Mô\u008c,^\u0080\u009c3\u009bÑÏ\u001b\u001c\u001fPñQJm\u001295¢pð6ïR\u0082\u0084º.¬\u0011ñÒë\u0082\u000eÝÌ'YsÄ\u0085z´5\u009eq\u0092í\t\u008fp²\u0016Á\u0084ü\u0089c\u000f\u009akÏ\u00adnZ&©ÕT\u0003\"î)\t\u0012s\u0088ëÇÙÀÊ\u008c&_\u0019D7`f\u0014³\u009c\u000fã¢ê\u0091\u008euæå\u0087`°¥\u0082\u0087Ý\u0014f`^À\u0090l¹\u008dy<\u0089¼'Eó\u009a\u0003òZÈ\u0016®ÒI\u009a¾¼;f\u008dÊ\u009d8{ÈxÜ%®ÑzD\u009b\u0014Ì2\u0000\u0083-+µ´Mï\u0087F>¿ÔÝ_®}\b\u000bR}ËjN\u0005Í\u0015ì`@\t\u0082×\u0013âõ\u001azZ³\u000e\u00114µNF)³\fÌO).Ùl\u000b\\\u0080µp¨6V\u0002G\u0092@\u0015ua?áÂ\u007fZ\u0018ÆÄ\u0089\u0001æ\u001a:¼Bèwáî\u0016G\u000bz\u00ad\u0014Á)8k\u008aËjo\u009fòÆ/\u0088v\u000b\u0092ß\u000bñ½\u0000×\u001eÂ\u0080\u009c\u009dA\u001b"
            .length();
         char var1 = ' ';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 90;
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
                        case 0 -> 81;
                        case 1 -> 68;
                        case 2 -> 103;
                        case 3 -> 25;
                        case 4 -> 66;
                        case 5 -> 80;
                        default -> 4;
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
                        b = new String[19];
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

                     var2 = "t@I\u0082ËèN1Çk\u0013/\u00172¶\u0096XË=\u0090å\u001es'\u0017°wM?E\u0090_\u0080`;\u0005";
                     var4 = "t@I\u0082ËèN1Çk\u0013/\u00172¶\u0096XË=\u0090å\u001es'\u0017°wM?E\u0090_\u0080`;\u0005".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 88;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 14123) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 4;
               case 1 -> 151;
               case 2 -> 28;
               case 3 -> 55;
               case 4 -> 150;
               case 5 -> 213;
               case 6 -> 140;
               case 7 -> 205;
               case 8 -> 238;
               case 9 -> 146;
               case 10 -> 31;
               case 11 -> 125;
               case 12 -> 163;
               case 13 -> 5;
               case 14 -> 179;
               case 15 -> 229;
               case 16 -> 233;
               case 17 -> 155;
               case 18 -> 97;
               case 19 -> 241;
               case 20 -> 115;
               case 21 -> 114;
               case 22 -> 216;
               case 23 -> 15;
               case 24 -> 225;
               case 25 -> 121;
               case 26 -> 209;
               case 27 -> 60;
               case 28 -> 67;
               case 29 -> 128;
               case 30 -> 243;
               case 31 -> 56;
               case 32 -> 215;
               case 33 -> 62;
               case 34 -> 160;
               case 35 -> 61;
               case 36 -> 50;
               case 37 -> 23;
               case 38 -> 101;
               case 39 -> 39;
               case 40 -> 105;
               case 41 -> 63;
               case 42 -> 224;
               case 43 -> 45;
               case 44 -> 35;
               case 45 -> 235;
               case 46 -> 78;
               case 47 -> 211;
               case 48 -> 199;
               case 49 -> 84;
               case 50 -> 66;
               case 51 -> 207;
               case 52 -> 222;
               case 53 -> 143;
               case 54 -> 109;
               case 55 -> 113;
               case 56 -> 12;
               case 57 -> 177;
               case 58 -> 165;
               case 59 -> 130;
               case 60 -> 17;
               case 61 -> 147;
               case 62 -> 184;
               case 63 -> 195;
               case 64 -> 127;
               case 65 -> 131;
               case 66 -> 108;
               case 67 -> 252;
               case 68 -> 142;
               case 69 -> 182;
               case 70 -> 104;
               case 71 -> 134;
               case 72 -> 138;
               case 73 -> 88;
               case 74 -> 36;
               case 75 -> 33;
               case 76 -> 237;
               case 77 -> 85;
               case 78 -> 240;
               case 79 -> 234;
               case 80 -> 132;
               case 81 -> 40;
               case 82 -> 82;
               case 83 -> 49;
               case 84 -> 124;
               case 85 -> 246;
               case 86 -> 242;
               case 87 -> 250;
               case 88 -> 6;
               case 89 -> 217;
               case 90 -> 135;
               case 91 -> 18;
               case 92 -> 119;
               case 93 -> 112;
               case 94 -> 48;
               case 95 -> 175;
               case 96 -> 172;
               case 97 -> 176;
               case 98 -> 3;
               case 99 -> 248;
               case 100 -> 220;
               case 101 -> 38;
               case 102 -> 144;
               case 103 -> 212;
               case 104 -> 174;
               case 105 -> 107;
               case 106 -> 9;
               case 107 -> 37;
               case 108 -> 16;
               case 109 -> 57;
               case 110 -> 194;
               case 111 -> 166;
               case 112 -> 178;
               case 113 -> 86;
               case 114 -> 218;
               case 115 -> 1;
               case 116 -> 183;
               case 117 -> 145;
               case 118 -> 188;
               case 119 -> 141;
               case 120 -> 65;
               case 121 -> 162;
               case 122 -> 223;
               case 123 -> 227;
               case 124 -> 202;
               case 125 -> 251;
               case 126 -> 159;
               case 127 -> 43;
               case 128 -> 68;
               case 129 -> 7;
               case 130 -> 148;
               case 131 -> 111;
               case 132 -> 154;
               case 133 -> 133;
               case 134 -> 59;
               case 135 -> 19;
               case 136 -> 47;
               case 137 -> 69;
               case 138 -> 221;
               case 139 -> 167;
               case 140 -> 79;
               case 141 -> 14;
               case 142 -> 32;
               case 143 -> 187;
               case 144 -> 200;
               case 145 -> 161;
               case 146 -> 191;
               case 147 -> 11;
               case 148 -> 24;
               case 149 -> 231;
               case 150 -> 117;
               case 151 -> 90;
               case 152 -> 42;
               case 153 -> 190;
               case 154 -> 129;
               case 155 -> 120;
               case 156 -> 44;
               case 157 -> 123;
               case 158 -> 249;
               case 159 -> 72;
               case 160 -> 2;
               case 161 -> 126;
               case 162 -> 99;
               case 163 -> 10;
               case 164 -> 0;
               case 165 -> 46;
               case 166 -> 30;
               case 167 -> 196;
               case 168 -> 122;
               case 169 -> 208;
               case 170 -> 71;
               case 171 -> 106;
               case 172 -> 54;
               case 173 -> 100;
               case 174 -> 58;
               case 175 -> 73;
               case 176 -> 26;
               case 177 -> 189;
               case 178 -> 8;
               case 179 -> 185;
               case 180 -> 157;
               case 181 -> 98;
               case 182 -> 27;
               case 183 -> 118;
               case 184 -> 170;
               case 185 -> 255;
               case 186 -> 152;
               case 187 -> 25;
               case 188 -> 171;
               case 189 -> 186;
               case 190 -> 91;
               case 191 -> 169;
               case 192 -> 230;
               case 193 -> 74;
               case 194 -> 193;
               case 195 -> 245;
               case 196 -> 192;
               case 197 -> 34;
               case 198 -> 116;
               case 199 -> 87;
               case 200 -> 149;
               case 201 -> 75;
               case 202 -> 136;
               case 203 -> 89;
               case 204 -> 201;
               case 205 -> 181;
               case 206 -> 92;
               case 207 -> 203;
               case 208 -> 77;
               case 209 -> 168;
               case 210 -> 214;
               case 211 -> 70;
               case 212 -> 51;
               case 213 -> 93;
               case 214 -> 153;
               case 215 -> 76;
               case 216 -> 247;
               case 217 -> 226;
               case 218 -> 53;
               case 219 -> 206;
               case 220 -> 232;
               case 221 -> 29;
               case 222 -> 158;
               case 223 -> 197;
               case 224 -> 64;
               case 225 -> 253;
               case 226 -> 210;
               case 227 -> 204;
               case 228 -> 80;
               case 229 -> 81;
               case 230 -> 13;
               case 231 -> 102;
               case 232 -> 22;
               case 233 -> 95;
               case 234 -> 41;
               case 235 -> 244;
               case 236 -> 164;
               case 237 -> 21;
               case 238 -> 52;
               case 239 -> 219;
               case 240 -> 239;
               case 241 -> 94;
               case 242 -> 236;
               case 243 -> 137;
               case 244 -> 198;
               case 245 -> 110;
               case 246 -> 96;
               case 247 -> 254;
               case 248 -> 139;
               case 249 -> 20;
               case 250 -> 83;
               case 251 -> 173;
               case 252 -> 103;
               case 253 -> 228;
               case 254 -> 180;
               default -> 156;
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

   private static final class IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         int var1, int var2, boolean var3, @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = -11703;
         short var10002 = -10896;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
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
      public final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a(
         int var1, int var2, boolean var3, @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = -11704;
         short var10002 = 7509;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         return new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
            var1, var2, var3, var4
         );
      }

      // PX-FIX RC2a row179: jar public static synthetic accessor a(Self,IIZLTriple;ILjava/lang/Object;)L<Self>;
      public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var0, int var1, int var2, boolean var3, Triple<Integer, Integer, Integer> var4, int var5, Object var6) {
         String var7 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         if ((var5 & 1) != 0 && var7 != null) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         if ((var5 & 2) != 0 && var7 != null) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if ((var5 & 4) != 0 && var7 != null) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if ((var5 & 8) != 0) {
            var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         return var0.a(var1, var2, var3, var4);
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -11697;
         Triple var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -731;
         short var10002 = -11698;
         short var10003 = 30134;
         short var10004 = -11700;
         short var10005 = -10258;
         short var10006 = -11699;
         short var10007 = 3225;
         return "RouteProgress(routeIndex=" + var4 + ", routeSize=" + var3 + ", walkerFinished=" + var2 + ", playerPos=" + var1 + ")";
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
         String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
            )) {
               return false;
            }

            var10000 = var1;
         }

         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var3 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI)var10000;
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
         String var2 = "ÑáZ/¿]~\u0013\u008e\u0089g\u001d¢\u0082à\u009fV\f}ËÈg\u0007êÅµï[\u0082Õ\f¹ÓRg\u0002\u0084óõ\u0010Cua\u0019\u00ad]f\u000bsUØS\u008e$iÊ\ta\u0082 §´K»Ã¿pÙ¬";
         int var4 = "ÑáZ/¿]~\u0013\u008e\u0089g\u001d¢\u0082à\u009fV\f}ËÈg\u0007êÅµï[\u0082Õ\f¹ÓRg\u0002\u0084óõ\u0010Cua\u0019\u00ad]f\u000bsUØS\u008e$iÊ\ta\u0082 §´K»Ã¿pÙ¬"
            .length();
         char var1 = 17;
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
                        case 0 -> 26;
                        case 1 -> 63;
                        case 2 -> 47;
                        case 3 -> 99;
                        case 4 -> 54;
                        case 5 -> 32;
                        default -> 25;
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

                     var2 = "e\u0014\u009bÚÌw\u009bç\u0002\tã\u007fK·ÖÚØRj";
                     var4 = "e\u0014\u009bÚÌw\u009bç\u0002\tã\u007fK·ÖÚØRj".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 105;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -11700) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 179;
               case 1 -> 54;
               case 2 -> 233;
               case 3 -> 112;
               case 4 -> 245;
               case 5 -> 135;
               case 6 -> 170;
               case 7 -> 202;
               case 8 -> 244;
               case 9 -> 74;
               case 10 -> 132;
               case 11 -> 235;
               case 12 -> 219;
               case 13 -> 198;
               case 14 -> 32;
               case 15 -> 13;
               case 16 -> 163;
               case 17 -> 186;
               case 18 -> 191;
               case 19 -> 39;
               case 20 -> 12;
               case 21 -> 128;
               case 22 -> 239;
               case 23 -> 31;
               case 24 -> 124;
               case 25 -> 85;
               case 26 -> 99;
               case 27 -> 215;
               case 28 -> 171;
               case 29 -> 127;
               case 30 -> 248;
               case 31 -> 30;
               case 32 -> 122;
               case 33 -> 222;
               case 34 -> 119;
               case 35 -> 78;
               case 36 -> 137;
               case 37 -> 149;
               case 38 -> 118;
               case 39 -> 162;
               case 40 -> 95;
               case 41 -> 110;
               case 42 -> 246;
               case 43 -> 225;
               case 44 -> 224;
               case 45 -> 143;
               case 46 -> 182;
               case 47 -> 117;
               case 48 -> 11;
               case 49 -> 4;
               case 50 -> 77;
               case 51 -> 120;
               case 52 -> 20;
               case 53 -> 157;
               case 54 -> 251;
               case 55 -> 41;
               case 56 -> 150;
               case 57 -> 115;
               case 58 -> 216;
               case 59 -> 238;
               case 60 -> 38;
               case 61 -> 165;
               case 62 -> 183;
               case 63 -> 169;
               case 64 -> 172;
               case 65 -> 22;
               case 66 -> 81;
               case 67 -> 9;
               case 68 -> 152;
               case 69 -> 148;
               case 70 -> 63;
               case 71 -> 213;
               case 72 -> 26;
               case 73 -> 139;
               case 74 -> 66;
               case 75 -> 214;
               case 76 -> 220;
               case 77 -> 16;
               case 78 -> 249;
               case 79 -> 100;
               case 80 -> 17;
               case 81 -> 104;
               case 82 -> 61;
               case 83 -> 24;
               case 84 -> 15;
               case 85 -> 211;
               case 86 -> 91;
               case 87 -> 205;
               case 88 -> 94;
               case 89 -> 102;
               case 90 -> 123;
               case 91 -> 92;
               case 92 -> 72;
               case 93 -> 8;
               case 94 -> 208;
               case 95 -> 55;
               case 96 -> 197;
               case 97 -> 221;
               case 98 -> 223;
               case 99 -> 7;
               case 100 -> 131;
               case 101 -> 73;
               case 102 -> 195;
               case 103 -> 166;
               case 104 -> 98;
               case 105 -> 59;
               case 106 -> 146;
               case 107 -> 114;
               case 108 -> 201;
               case 109 -> 65;
               case 110 -> 34;
               case 111 -> 167;
               case 112 -> 140;
               case 113 -> 199;
               case 114 -> 51;
               case 115 -> 50;
               case 116 -> 82;
               case 117 -> 111;
               case 118 -> 254;
               case 119 -> 43;
               case 120 -> 153;
               case 121 -> 23;
               case 122 -> 126;
               case 123 -> 71;
               case 124 -> 108;
               case 125 -> 241;
               case 126 -> 79;
               case 127 -> 75;
               case 128 -> 62;
               case 129 -> 2;
               case 130 -> 40;
               case 131 -> 207;
               case 132 -> 180;
               case 133 -> 160;
               case 134 -> 243;
               case 135 -> 134;
               case 136 -> 178;
               case 137 -> 0;
               case 138 -> 6;
               case 139 -> 232;
               case 140 -> 192;
               case 141 -> 164;
               case 142 -> 230;
               case 143 -> 188;
               case 144 -> 144;
               case 145 -> 142;
               case 146 -> 58;
               case 147 -> 154;
               case 148 -> 48;
               case 149 -> 193;
               case 150 -> 105;
               case 151 -> 42;
               case 152 -> 56;
               case 153 -> 175;
               case 154 -> 10;
               case 155 -> 33;
               case 156 -> 250;
               case 157 -> 173;
               case 158 -> 37;
               case 159 -> 218;
               case 160 -> 234;
               case 161 -> 155;
               case 162 -> 109;
               case 163 -> 5;
               case 164 -> 90;
               case 165 -> 138;
               case 166 -> 27;
               case 167 -> 212;
               case 168 -> 204;
               case 169 -> 3;
               case 170 -> 80;
               case 171 -> 116;
               case 172 -> 101;
               case 173 -> 106;
               case 174 -> 68;
               case 175 -> 70;
               case 176 -> 76;
               case 177 -> 237;
               case 178 -> 36;
               case 179 -> 19;
               case 180 -> 194;
               case 181 -> 107;
               case 182 -> 84;
               case 183 -> 145;
               case 184 -> 200;
               case 185 -> 44;
               case 186 -> 184;
               case 187 -> 57;
               case 188 -> 147;
               case 189 -> 93;
               case 190 -> 151;
               case 191 -> 14;
               case 192 -> 53;
               case 193 -> 21;
               case 194 -> 103;
               case 195 -> 28;
               case 196 -> 229;
               case 197 -> 47;
               case 198 -> 113;
               case 199 -> 236;
               case 200 -> 96;
               case 201 -> 64;
               case 202 -> 141;
               case 203 -> 177;
               case 204 -> 121;
               case 205 -> 125;
               case 206 -> 97;
               case 207 -> 60;
               case 208 -> 217;
               case 209 -> 203;
               case 210 -> 240;
               case 211 -> 156;
               case 212 -> 226;
               case 213 -> 86;
               case 214 -> 228;
               case 215 -> 231;
               case 216 -> 161;
               case 217 -> 253;
               case 218 -> 174;
               case 219 -> 242;
               case 220 -> 87;
               case 221 -> 185;
               case 222 -> 196;
               case 223 -> 1;
               case 224 -> 49;
               case 225 -> 187;
               case 226 -> 209;
               case 227 -> 255;
               case 228 -> 89;
               case 229 -> 45;
               case 230 -> 83;
               case 231 -> 189;
               case 232 -> 210;
               case 233 -> 247;
               case 234 -> 227;
               case 235 -> 46;
               case 236 -> 29;
               case 237 -> 176;
               case 238 -> 25;
               case 239 -> 133;
               case 240 -> 18;
               case 241 -> 129;
               case 242 -> 130;
               case 243 -> 159;
               case 244 -> 158;
               case 245 -> 181;
               case 246 -> 88;
               case 247 -> 136;
               case 248 -> 206;
               case 249 -> 52;
               case 250 -> 67;
               case 251 -> 69;
               case 252 -> 190;
               case 253 -> 168;
               case 254 -> 252;
               default -> 35;
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

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final BlockPos lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(int var1, @NotNull BlockPos var2) {
         short var10001 = -21533;
         short var10002 = -22925;
         Intrinsics.checkNotNullParameter(var2, "pathPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockPos b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockPos d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1, @NotNull BlockPos var2
      ) {
         short var10001 = -21534;
         short var10002 = 1928;
         Intrinsics.checkNotNullParameter(var2, "pathPos");
         return new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2
         );
      }
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, int var1, BlockPos var2, int var3, Object var4) {
         String var5 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         if ((var3 & 1) != 0 && var5 != null) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         return var0.a(var1, var2);
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -21535;
         short var10003 = -31468;
         var10003 = -21536;
         short var10004 = -10214;
         return "GhostCandidateSnapshot(id="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", pathPos="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
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
         String var2 = "¼EÏ(\u001c\u0014zÒ\u009e\bÉ7ê¬áÊü\u001c²ÚF_\u009aà\u008cv\náÚ}\u0088¶{\u001ep\u0012)";
         int var4 = "¼EÏ(\u001c\u0014zÒ\u009e\bÉ7ê¬áÊü\u001c²ÚF_\u009aà\u008cv\náÚ}\u0088¶{\u001ep\u0012)".length();
         char var1 = 26;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 68;
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
                        case 0 -> 88;
                        case 1 -> 49;
                        case 2 -> 95;
                        case 3 -> 124;
                        case 4 -> 52;
                        case 5 -> 12;
                        default -> 40;
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

                     var2 = "w|\u00adíÝ)!\u0007\u0093d1îNIS";
                     var4 = "w|\u00adíÝ)!\u0007\u0093d1îNIS".length();
                     var1 = 7;
                     var8 = -1;
               }

               var10000 = 115;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -21535) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 90;
               case 1 -> 156;
               case 2 -> 224;
               case 3 -> 15;
               case 4 -> 172;
               case 5 -> 89;
               case 6 -> 8;
               case 7 -> 176;
               case 8 -> 204;
               case 9 -> 4;
               case 10 -> 127;
               case 11 -> 157;
               case 12 -> 79;
               case 13 -> 36;
               case 14 -> 96;
               case 15 -> 82;
               case 16 -> 76;
               case 17 -> 111;
               case 18 -> 60;
               case 19 -> 108;
               case 20 -> 66;
               case 21 -> 143;
               case 22 -> 244;
               case 23 -> 62;
               case 24 -> 147;
               case 25 -> 151;
               case 26 -> 246;
               case 27 -> 61;
               case 28 -> 30;
               case 29 -> 40;
               case 30 -> 80;
               case 31 -> 247;
               case 32 -> 182;
               case 33 -> 227;
               case 34 -> 199;
               case 35 -> 169;
               case 36 -> 193;
               case 37 -> 57;
               case 38 -> 19;
               case 39 -> 140;
               case 40 -> 137;
               case 41 -> 245;
               case 42 -> 54;
               case 43 -> 138;
               case 44 -> 212;
               case 45 -> 38;
               case 46 -> 158;
               case 47 -> 122;
               case 48 -> 160;
               case 49 -> 41;
               case 50 -> 26;
               case 51 -> 20;
               case 52 -> 7;
               case 53 -> 175;
               case 54 -> 109;
               case 55 -> 69;
               case 56 -> 16;
               case 57 -> 115;
               case 58 -> 184;
               case 59 -> 250;
               case 60 -> 163;
               case 61 -> 52;
               case 62 -> 249;
               case 63 -> 10;
               case 64 -> 107;
               case 65 -> 77;
               case 66 -> 129;
               case 67 -> 103;
               case 68 -> 141;
               case 69 -> 92;
               case 70 -> 216;
               case 71 -> 113;
               case 72 -> 162;
               case 73 -> 118;
               case 74 -> 241;
               case 75 -> 39;
               case 76 -> 28;
               case 77 -> 84;
               case 78 -> 116;
               case 79 -> 29;
               case 80 -> 56;
               case 81 -> 211;
               case 82 -> 22;
               case 83 -> 234;
               case 84 -> 101;
               case 85 -> 188;
               case 86 -> 35;
               case 87 -> 72;
               case 88 -> 155;
               case 89 -> 97;
               case 90 -> 251;
               case 91 -> 131;
               case 92 -> 71;
               case 93 -> 203;
               case 94 -> 254;
               case 95 -> 223;
               case 96 -> 0;
               case 97 -> 221;
               case 98 -> 195;
               case 99 -> 17;
               case 100 -> 53;
               case 101 -> 99;
               case 102 -> 222;
               case 103 -> 46;
               case 104 -> 217;
               case 105 -> 173;
               case 106 -> 34;
               case 107 -> 187;
               case 108 -> 86;
               case 109 -> 185;
               case 110 -> 78;
               case 111 -> 75;
               case 112 -> 237;
               case 113 -> 252;
               case 114 -> 132;
               case 115 -> 166;
               case 116 -> 59;
               case 117 -> 194;
               case 118 -> 161;
               case 119 -> 191;
               case 120 -> 91;
               case 121 -> 2;
               case 122 -> 209;
               case 123 -> 81;
               case 124 -> 44;
               case 125 -> 98;
               case 126 -> 126;
               case 127 -> 171;
               case 128 -> 9;
               case 129 -> 210;
               case 130 -> 225;
               case 131 -> 206;
               case 132 -> 154;
               case 133 -> 142;
               case 134 -> 31;
               case 135 -> 14;
               case 136 -> 220;
               case 137 -> 88;
               case 138 -> 230;
               case 139 -> 94;
               case 140 -> 68;
               case 141 -> 12;
               case 142 -> 63;
               case 143 -> 213;
               case 144 -> 231;
               case 145 -> 144;
               case 146 -> 139;
               case 147 -> 33;
               case 148 -> 255;
               case 149 -> 152;
               case 150 -> 236;
               case 151 -> 135;
               case 152 -> 121;
               case 153 -> 42;
               case 154 -> 124;
               case 155 -> 218;
               case 156 -> 130;
               case 157 -> 248;
               case 158 -> 159;
               case 159 -> 18;
               case 160 -> 45;
               case 161 -> 117;
               case 162 -> 202;
               case 163 -> 149;
               case 164 -> 32;
               case 165 -> 189;
               case 166 -> 110;
               case 167 -> 1;
               case 168 -> 153;
               case 169 -> 174;
               case 170 -> 125;
               case 171 -> 233;
               case 172 -> 119;
               case 173 -> 95;
               case 174 -> 242;
               case 175 -> 49;
               case 176 -> 43;
               case 177 -> 134;
               case 178 -> 228;
               case 179 -> 201;
               case 180 -> 207;
               case 181 -> 168;
               case 182 -> 214;
               case 183 -> 177;
               case 184 -> 192;
               case 185 -> 146;
               case 186 -> 58;
               case 187 -> 186;
               case 188 -> 51;
               case 189 -> 200;
               case 190 -> 21;
               case 191 -> 178;
               case 192 -> 145;
               case 193 -> 235;
               case 194 -> 64;
               case 195 -> 6;
               case 196 -> 232;
               case 197 -> 180;
               case 198 -> 85;
               case 199 -> 240;
               case 200 -> 65;
               case 201 -> 123;
               case 202 -> 197;
               case 203 -> 70;
               case 204 -> 150;
               case 205 -> 148;
               case 206 -> 24;
               case 207 -> 226;
               case 208 -> 105;
               case 209 -> 179;
               case 210 -> 83;
               case 211 -> 47;
               case 212 -> 87;
               case 213 -> 219;
               case 214 -> 238;
               case 215 -> 253;
               case 216 -> 3;
               case 217 -> 74;
               case 218 -> 25;
               case 219 -> 114;
               case 220 -> 50;
               case 221 -> 37;
               case 222 -> 196;
               case 223 -> 48;
               case 224 -> 27;
               case 225 -> 243;
               case 226 -> 190;
               case 227 -> 164;
               case 228 -> 102;
               case 229 -> 5;
               case 230 -> 128;
               case 231 -> 136;
               case 232 -> 112;
               case 233 -> 104;
               case 234 -> 13;
               case 235 -> 183;
               case 236 -> 100;
               case 237 -> 55;
               case 238 -> 106;
               case 239 -> 229;
               case 240 -> 198;
               case 241 -> 23;
               case 242 -> 93;
               case 243 -> 205;
               case 244 -> 170;
               case 245 -> 181;
               case 246 -> 67;
               case 247 -> 215;
               case 248 -> 165;
               case 249 -> 239;
               case 250 -> 11;
               case 251 -> 208;
               case 252 -> 120;
               case 253 -> 73;
               case 254 -> 167;
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
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      // PX-FIX RC2a row51: jar ctor (Lkotlin/jvm/internal/DefaultConstructorMarker;)V delegates to the private no-arg ctor (jar body: aload_0 / invokespecial <init>()V / return)
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var0) {
         this();
      }

      @NotNull
      public final IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll a() {
         return llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI;
      }

      @NotNull
      public final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl c() {
         return llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll;
      }

      public static void b(String var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static String d() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      static {
         if (d() == null) {
            b("nVWJBb");
         }
      }
   

  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: bare return
  public static void b() { }
}

   private static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(int var1, int var2, int var3, int var4) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
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

      public final int e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
         int var1, int var2, int var3, int var4
      ) {
         return new llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
            var1, var2, var3, var4
         );
      }
      // PX-FIX RC2a row173: jar public static synthetic accessor a(Self,IIIIILjava/lang/Object;) - 4 data ints + mask int + marker
      public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0, int var1, int var2, int var3, int var4, int var5, Object var6) {
         String var7 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         if ((var5 & 1) != 0 && var7 != null) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         if ((var5 & 2) != 0 && var7 != null) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if ((var5 & 4) != 0 && var7 != null) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if ((var5 & 8) != 0 && var7 != null) {
            var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         return var0.a(var1, var2, var3, var4);
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -28486;
         int var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 28551;
         short var10002 = -28485;
         short var10003 = 28842;
         short var10004 = -28487;
         short var10005 = 24304;
         short var10006 = -28488;
         short var10007 = -13436;
         return "KillProgress(kills=" + var4 + ", sorrow=" + var3 + ", killCombo=" + var2 + ", lastKillCombo=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var3 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var10000;
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

         if (var2 != null) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (var2 != null) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var2 == null) {
               return (boolean)(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != 0);
            }

            var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "<w\u0006MÜ\u001e\u0090\nË`½\u001b¦+\u0002&§Ý\u0085\tWDÿH=ÝÊbÏ";
         int var4 = "<w\u0006MÜ\u001e\u0090\nË`½\u001b¦+\u0002&§Ý\u0085\tWDÿH=ÝÊbÏ".length();
         char var1 = 19;
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
                        case 0 -> 98;
                        case 1 -> 51;
                        case 2 -> 81;
                        case 3 -> 63;
                        case 4 -> 85;
                        case 5 -> 17;
                        default -> 70;
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

                     var2 = "\u0083\u0087@\u0004\r§óÏ#$w\u009d¶WÑê\f^\u0095üNbÿêÙ\b.\u001fA";
                     var4 = "\u0083\u0087@\u0004\r§óÏ#$w\u009d¶WÑê\f^\u0095üNbÿêÙ\b.\u001fA".length();
                     var1 = 16;
                     var8 = -1;
               }

               var10000 = 100;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -28486) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 74;
               case 1 -> 10;
               case 2 -> 191;
               case 3 -> 161;
               case 4 -> 159;
               case 5 -> 232;
               case 6 -> 59;
               case 7 -> 151;
               case 8 -> 47;
               case 9 -> 160;
               case 10 -> 16;
               case 11 -> 171;
               case 12 -> 158;
               case 13 -> 231;
               case 14 -> 122;
               case 15 -> 130;
               case 16 -> 131;
               case 17 -> 225;
               case 18 -> 24;
               case 19 -> 50;
               case 20 -> 183;
               case 21 -> 112;
               case 22 -> 205;
               case 23 -> 138;
               case 24 -> 239;
               case 25 -> 213;
               case 26 -> 13;
               case 27 -> 0;
               case 28 -> 69;
               case 29 -> 223;
               case 30 -> 241;
               case 31 -> 33;
               case 32 -> 27;
               case 33 -> 244;
               case 34 -> 95;
               case 35 -> 31;
               case 36 -> 38;
               case 37 -> 9;
               case 38 -> 168;
               case 39 -> 193;
               case 40 -> 99;
               case 41 -> 251;
               case 42 -> 83;
               case 43 -> 252;
               case 44 -> 72;
               case 45 -> 118;
               case 46 -> 169;
               case 47 -> 253;
               case 48 -> 224;
               case 49 -> 60;
               case 50 -> 215;
               case 51 -> 139;
               case 52 -> 250;
               case 53 -> 40;
               case 54 -> 96;
               case 55 -> 166;
               case 56 -> 81;
               case 57 -> 7;
               case 58 -> 182;
               case 59 -> 54;
               case 60 -> 176;
               case 61 -> 73;
               case 62 -> 228;
               case 63 -> 48;
               case 64 -> 150;
               case 65 -> 17;
               case 66 -> 56;
               case 67 -> 245;
               case 68 -> 149;
               case 69 -> 2;
               case 70 -> 178;
               case 71 -> 188;
               case 72 -> 70;
               case 73 -> 91;
               case 74 -> 238;
               case 75 -> 218;
               case 76 -> 6;
               case 77 -> 222;
               case 78 -> 235;
               case 79 -> 53;
               case 80 -> 14;
               case 81 -> 5;
               case 82 -> 214;
               case 83 -> 63;
               case 84 -> 255;
               case 85 -> 71;
               case 86 -> 175;
               case 87 -> 85;
               case 88 -> 124;
               case 89 -> 128;
               case 90 -> 200;
               case 91 -> 216;
               case 92 -> 116;
               case 93 -> 207;
               case 94 -> 55;
               case 95 -> 249;
               case 96 -> 80;
               case 97 -> 41;
               case 98 -> 147;
               case 99 -> 20;
               case 100 -> 242;
               case 101 -> 145;
               case 102 -> 129;
               case 103 -> 102;
               case 104 -> 4;
               case 105 -> 30;
               case 106 -> 234;
               case 107 -> 146;
               case 108 -> 26;
               case 109 -> 62;
               case 110 -> 11;
               case 111 -> 233;
               case 112 -> 197;
               case 113 -> 212;
               case 114 -> 103;
               case 115 -> 44;
               case 116 -> 246;
               case 117 -> 65;
               case 118 -> 187;
               case 119 -> 201;
               case 120 -> 217;
               case 121 -> 86;
               case 122 -> 157;
               case 123 -> 154;
               case 124 -> 8;
               case 125 -> 107;
               case 126 -> 221;
               case 127 -> 75;
               case 128 -> 126;
               case 129 -> 79;
               case 130 -> 179;
               case 131 -> 61;
               case 132 -> 144;
               case 133 -> 219;
               case 134 -> 230;
               case 135 -> 45;
               case 136 -> 77;
               case 137 -> 117;
               case 138 -> 209;
               case 139 -> 92;
               case 140 -> 190;
               case 141 -> 134;
               case 142 -> 137;
               case 143 -> 123;
               case 144 -> 37;
               case 145 -> 109;
               case 146 -> 113;
               case 147 -> 172;
               case 148 -> 46;
               case 149 -> 25;
               case 150 -> 133;
               case 151 -> 174;
               case 152 -> 78;
               case 153 -> 100;
               case 154 -> 229;
               case 155 -> 115;
               case 156 -> 87;
               case 157 -> 18;
               case 158 -> 192;
               case 159 -> 1;
               case 160 -> 156;
               case 161 -> 180;
               case 162 -> 89;
               case 163 -> 164;
               case 164 -> 98;
               case 165 -> 243;
               case 166 -> 84;
               case 167 -> 194;
               case 168 -> 12;
               case 169 -> 196;
               case 170 -> 132;
               case 171 -> 93;
               case 172 -> 220;
               case 173 -> 198;
               case 174 -> 127;
               case 175 -> 181;
               case 176 -> 136;
               case 177 -> 189;
               case 178 -> 142;
               case 179 -> 186;
               case 180 -> 15;
               case 181 -> 120;
               case 182 -> 195;
               case 183 -> 148;
               case 184 -> 110;
               case 185 -> 36;
               case 186 -> 208;
               case 187 -> 125;
               case 188 -> 52;
               case 189 -> 165;
               case 190 -> 119;
               case 191 -> 170;
               case 192 -> 22;
               case 193 -> 49;
               case 194 -> 247;
               case 195 -> 162;
               case 196 -> 104;
               case 197 -> 106;
               case 198 -> 32;
               case 199 -> 97;
               case 200 -> 68;
               case 201 -> 3;
               case 202 -> 236;
               case 203 -> 23;
               case 204 -> 152;
               case 205 -> 254;
               case 206 -> 105;
               case 207 -> 184;
               case 208 -> 226;
               case 209 -> 101;
               case 210 -> 203;
               case 211 -> 29;
               case 212 -> 202;
               case 213 -> 19;
               case 214 -> 153;
               case 215 -> 57;
               case 216 -> 204;
               case 217 -> 167;
               case 218 -> 173;
               case 219 -> 21;
               case 220 -> 199;
               case 221 -> 35;
               case 222 -> 163;
               case 223 -> 121;
               case 224 -> 111;
               case 225 -> 210;
               case 226 -> 58;
               case 227 -> 51;
               case 228 -> 108;
               case 229 -> 94;
               case 230 -> 248;
               case 231 -> 240;
               case 232 -> 66;
               case 233 -> 64;
               case 234 -> 43;
               case 235 -> 39;
               case 236 -> 135;
               case 237 -> 76;
               case 238 -> 82;
               case 239 -> 211;
               case 240 -> 140;
               case 241 -> 90;
               case 242 -> 206;
               case 243 -> 143;
               case 244 -> 177;
               case 245 -> 185;
               case 246 -> 42;
               case 247 -> 34;
               case 248 -> 88;
               case 249 -> 28;
               case 250 -> 237;
               case 251 -> 114;
               case 252 -> 67;
               case 253 -> 227;
               case 254 -> 155;
               default -> 141;
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
   // ===== PX-FIX begin: convention (b) nested-inline pilot (agent N9) =====
   // Restored from me-octo-only.jar: llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl$lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII
   // Inlined as a REAL inner class of llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl so that it can reach the outer class'
   // private members; the jar's synthetic accessors / Kotlin \$default bridges it needs are
   // reconstructed below from javap -p -c (they are absent from our sources).

   public static final IIIIIllIIlIIlllIIllllllIllIlIlIllllllllIIIIlIlIIIIlIlIlIlIllIlIIIIIIlllIIIIllIlllIlll bO() { // PX-FIX synthetic accessor: getstatic IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI
      return IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI;
   }

   public static final llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl bP() { // PX-FIX synthetic accessor: getstatic IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll
      return IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll;
   }

   public static final void a(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) { // PX-FIX synthetic accessor: invokespecial a(LIIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll;)V
      var0.a(var1);
   }

   public static final double c(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0, Creeper var1) { // PX-FIX synthetic accessor: invokespecial a(LCreeper;)D
      return var0.a(var1);
   }

   static void a(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0, LivingEntity var1, boolean var2, int var3, Object var4) { // PX-FIX Kotlin \$default bridge (mask&2 -> var2=false)
      if ((var3 & 2) != 0) {
         var2 = false;
      }
      var0.a(var1, var2);
   }

   static boolean a(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0, boolean var1, boolean var2, int var3, Object var4) { // PX-FIX Kotlin \$default bridge (mask&2 -> var2=false)
      if ((var3 & 2) != 0) {
         var2 = false;
      }
      return var0.a(var1, var2);
   }

   static boolean a(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0, LivingEntity var1, double var2, int var4, Object var5) { // PX-FIX Kotlin \$default bridge (mask&2 -> var2=0.1D)
      if ((var4 & 2) != 0) {
         var2 = 0.1D;
      }
      return var0.j(var1, var2);
   }

   static BlockPos a(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl var0, BlockPos var1, int var2, Object var3) { // PX-FIX Kotlin \$default bridge (mask&1 -> var1=null)
      if ((var2 & 1) != 0) {
         var1 = null;
      }
      return var0.b(var1);
   }

   public final class lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII<T> implements java.util.Comparator<T> {
      @Override
      public final int compare(T var1, T var2) {
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var4 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var1;
         String var3 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Object var6 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var4.b());
         Creeper var7 = var3 != null && var6 instanceof Creeper ? (Creeper)var6 : null;
         double var8 = var3 != null && var7 != null ? c(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.this, var7) : Double.MAX_VALUE;
         llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var9 = (llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var2;
         String var10 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         Object var11 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var9.b());
         Creeper var12 = var10 != null && var11 instanceof Creeper ? (Creeper)var11 : null;
         double var13 = var10 != null && var12 != null ? c(llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.this, var12) : Double.MAX_VALUE;
         return kotlin.comparisons.ComparisonsKt.compareValues(Double.valueOf(var8), Double.valueOf(var13));
      }
   }
   // ===== PX-FIX end: convention (b) nested-inline pilot (agent N9) =====





}
