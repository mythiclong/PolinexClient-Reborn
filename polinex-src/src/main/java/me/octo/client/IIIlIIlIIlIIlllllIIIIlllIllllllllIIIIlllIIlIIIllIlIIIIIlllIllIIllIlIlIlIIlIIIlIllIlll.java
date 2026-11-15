package me.octo.client;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll {
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld

   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIllll

// PX-DEDUP removed duplicate ovld: public static <T> T a(Object p0, Vec3 p1, Object p2) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlI

// PX-DEDUP removed duplicate ovld: public static <T> T a(lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllII

// PX-DEDUP removed duplicate ovld: public static <T> T a(lIllIlIIIIIllIlllIlIlIIIlIlllIIIIllIIlIIIlIIllllIIIlIIlIIIIIIIlllIIIlIIlIlllII

   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIllll

// PX-DEDUP removed duplicate ovld: public static <T> T a(IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllII

// PX-DEDUP removed duplicate ovld: public static <T> T a(IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIl

// PX-DEDUP removed duplicate ovld: public static <T> T a(lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlI

// PX-DEDUP removed duplicate ovld: public static <T> T a(lIIlIlllllllllIlllIIIllIIIlIlIIllIllIllIlIIlIlllllIllllIIIlIIlIIlIllIlIlllIIlI


        // PX-FIX DefaultConstructorMarker: synthesized Kotlin default-arg ctor
        public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll(boolean param0, int param1, kotlin.jvm.internal.DefaultConstructorMarker param2) {
           if ((param1 & 1) != 0) {
              param0 = true;
           }

           this(param0);
        }
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll(Object... px) {
           this(true, 1, (kotlin.jvm.internal.DefaultConstructorMarker)null); // PX-FIX: 委托 DCM 桥
        }

   @NotNull
   public static IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   public final Minecraft IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   public static boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   public static boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   public boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   public boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private Vec3 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private BlockPos lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private ArrayList<BlockPos> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @Nullable
   private IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private double IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private double IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @Nullable
   private Vec3 IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private boolean llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private boolean IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @Nullable
   private Vec3 lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @Nullable
   private BlockPos llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private ArrayList<BlockPos> lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private boolean IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @Nullable
   private Vec3 IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @Nullable
   private lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @NotNull
   private IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @NotNull
   private ArrayList<BlockPos> IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   @Nullable
   private ArrayList<Vec3> IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private int IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   private volatile boolean IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   @Nullable
   private Vec3 IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   @Nullable
   private IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   @Nullable
   private volatile ArrayList<Vec3> lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   private volatile int lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   private volatile boolean IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   private volatile int llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private double lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private int IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @Nullable
   private List<? extends RemotePlayer> lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private long IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private boolean lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   private int IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @Nullable
   private BlockPos llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private int lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private int IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   private boolean IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   @NotNull
   private BlockPos lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   private boolean IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   private boolean lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   private boolean llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI;
   private int IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   @NotNull
   private List<? extends BlockPos> IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
   @NotNull
   private List<? extends Vec3> IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
   @Nullable
   private Vec3 IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
   @Nullable
   private Vec3 llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll;
   private static boolean IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl;
   @Nullable
   private static Integer lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll;
   private static boolean llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
   @Nullable
   private static Integer IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
   @NotNull
   private static IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
   private static String[] a;
   private static String[] b;

   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll(boolean var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = -21472;
      short var10004 = 29062;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var10001;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 200;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new Vec3(0.0, 1.27, 0.0);
      BlockPos var2 = BlockPos.ZERO;
      var10003 = -21501;
      var10004 = 12742;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var2;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new ArrayList<>();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new ArrayList<>();
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new ArrayList<>();
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = Double.MAX_VALUE;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = -1;
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      BlockPos var3 = BlockPos.ZERO;
      var10003 = -21501;
      var10004 = 12742;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = var3;
      this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = true;
      this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = CollectionsKt.emptyList();
      this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI = CollectionsKt.emptyList();
   }

   @NotNull
   public final Minecraft a() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final boolean b() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void a(boolean var1) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   public final boolean c() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void b(boolean var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   public final boolean d() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final void c(boolean var1) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   public final boolean e() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void d(boolean var1) {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   public final boolean f() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final void e(boolean var1) {
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
   }

   @NotNull
   public final Vec3 g() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final BlockPos h() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final void a(@NotNull BlockPos var1) {
      short var10001 = -21461;
      short var10002 = -26930;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
   }

   @NotNull
   public final ArrayList<BlockPos> i() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void a(@NotNull ArrayList<BlockPos> var1) {
      short var10001 = -21461;
      short var10002 = -26930;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   public final boolean j() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void f(boolean var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   @Nullable
   public final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI k() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void a(
      @Nullable IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
   }

   @Nullable
   public final Vec3 l() {
      return this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   }

   public final void a(@Nullable Vec3 var1) {
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var1;
   }

   public final boolean m() {
      return this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   }

   public final void g(boolean var1) {
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var1;
   }

   private final BlockPos b(Vec3 param1) {

      ClientLevel clientLevel;
      String string;
      block6: {
          block5: {
              string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
              try {
                  try {
                      if (string == null) break block5;
                      clientLevel = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.level;
                      if (clientLevel != null) break block6;
                  }
                  catch (NoSuchElementException noSuchElementException) {
                      throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                  }
              }
              catch (NoSuchElementException noSuchElementException) {
                  throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
              }
          }
          BlockPos blockPos = BlockPos.containing((Position)((Position)param1));
          Intrinsics.checkNotNullExpressionValue((Object)blockPos, (String)"containing(...)");
          return blockPos;
      }
      ClientLevel clientLevel2 = clientLevel;
      BlockPos blockPos = BlockPos.containing((double)param1.x, (double)(param1.y - 1.0), (double)param1.z);
      Intrinsics.checkNotNullExpressionValue((Object)blockPos, (String)"containing(...)");
      BlockPos blockPos2 = blockPos;
      for (int i = 0; i < 4 && clientLevel2.getBlockState(blockPos2).isAir(); ++i) {
          Intrinsics.checkNotNullExpressionValue((Object)blockPos2.below(), (String)"below(...)");
          if (string != null) continue;
      }
      return blockPos2;

   }

   protected final boolean n() {
      return this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   }

   protected final void h(boolean var1) {
      this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = var1;
   }

   @Nullable
   protected final Vec3 o() {
      return this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   }

   protected final void c(@Nullable Vec3 var1) {
      this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = var1;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI p() {
      return this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI q() {
      return this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 003: aload 1
      // 004: sipush -21500
      // 007: sipush 25372
      // 00a: pop2
      // 00b: ldc_w "event"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: astore 2
      // 012: aload 0
      // 013: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Z
      // 016: aload 2
      // 017: ifnull 028
      // 01a: ifne 025
      // 01d: goto 024
      // 020: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: return
      // 025: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n ()Z
      // 028: aload 2
      // 029: ifnull 04c
      // 02c: ifeq 062
      // 02f: goto 036
      // 032: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: aload 0
      // 037: aload 2
      // 038: ifnull 063
      // 03b: goto 042
      // 03e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 045: goto 04c
      // 048: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: ifne 062
      // 04f: aload 0
      // 050: bipush 1
      // 051: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.i (Z)V
      // 054: aload 0
      // 055: aconst_null
      // 056: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 059: aload 0
      // 05a: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.r ()V
      // 05d: return
      // 05e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: aload 0
      // 063: aload 2
      // 064: ifnull 083
      // 067: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 06a: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.I ()Lnet/minecraft/world/phys/BlockHitResult;
      // 06d: dup
      // 06e: ifnull 082
      // 071: goto 078
      // 074: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: invokevirtual net/minecraft/world/phys/BlockHitResult.getBlockPos ()Lnet/minecraft/core/BlockPos;
      // 07b: goto 084
      // 07e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: pop
      // 083: aconst_null
      // 084: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl Lnet/minecraft/core/BlockPos;
      // 087: aload 0
      // 088: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Z
      // 08b: aload 2
      // 08c: ifnull 0ea
      // 08f: ifeq 0e6
      // 092: goto 099
      // 095: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 09c: sipush -21426
      // 09f: sipush 24611
      // 0a2: pop2
      // 0a3: ldc_w "attack"
      // 0a6: bipush 0
      // 0a7: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 0aa: aload 0
      // 0ab: aload 2
      // 0ac: ifnull 0e1
      // 0af: goto 0b6
      // 0b2: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0b9: sipush 200
      // 0bc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bf: checkcast java/lang/Number
      // 0c2: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0c5: ifeq 0e5
      // 0c8: goto 0cf
      // 0cb: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: bipush 0
      // 0d1: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Z
      // 0d4: aload 0
      // 0d5: bipush 1
      // 0d6: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI Z
      // 0d9: aload 0
      // 0da: goto 0e1
      // 0dd: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: bipush 1
      // 0e2: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl Z
      // 0e5: return
      // 0e6: aload 0
      // 0e7: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Z
      // 0ea: aload 2
      // 0eb: ifnull 1a3
      // 0ee: ifeq 19d
      // 0f1: goto 0f8
      // 0f4: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI Ljava/lang/Integer;
      // 0fb: aload 2
      // 0fc: ifnull 11b
      // 0ff: goto 106
      // 102: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: dup
      // 107: ifnull 19a
      // 10a: goto 111
      // 10d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: checkcast java/lang/Number
      // 114: goto 11b
      // 117: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: invokevirtual java/lang/Number.intValue ()I
      // 11e: istore 5
      // 120: bipush 0
      // 121: istore 6
      // 123: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 126: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 129: aload 2
      // 12a: ifnull 166
      // 12d: iload 5
      // 12f: if_icmpeq 14d
      // 132: goto 139
      // 135: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 138: athrow
      // 139: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 13c: iload 5
      // 13e: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 141: pop
      // 142: aload 2
      // 143: ifnonnull 196
      // 146: goto 14d
      // 149: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14c: athrow
      // 14d: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 150: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.k ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 153: sipush 200
      // 156: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 159: checkcast java/lang/Number
      // 15c: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 15f: goto 166
      // 162: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: aload 2
      // 167: ifnull 181
      // 16a: ifeq 196
      // 16d: goto 174
      // 170: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 177: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.j ()Z
      // 17a: goto 181
      // 17d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: ifeq 196
      // 184: aload 0
      // 185: bipush 0
      // 186: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Z
      // 189: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 18c: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 18f: goto 196
      // 192: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 195: athrow
      // 196: nop
      // 197: goto 19c
      // 19a: pop
      // 19b: nop
      // 19c: return
      // 19d: getstatic me/octo/client/lllllllIIlIIlIlllllIIIIllllIIIllIlIlllIllIllIIIllIIIlIlIIIlllIlIIllIllllIllllIlIIIIIl.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/lllllllIIlIIlIlllllIIIIllllIIIllIlIlllIllIllIIIllIIIlIlIIIlllIlIIllIllllIllllIlIIIIIl;
      // 1a0: invokevirtual me/octo/client/lllllllIIlIIlIlllllIIIIllllIIIllIlIlllIllIllIIIllIIIlIlIIIlllIlIIllIllllIllllIlIIIIIl.aA ()Z
      // 1a3: aload 2
      // 1a4: ifnull 1dc
      // 1a7: ifeq 1d8
      // 1aa: goto 1b1
      // 1ad: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b0: athrow
      // 1b1: aload 0
      // 1b2: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.s ()Z
      // 1b5: aload 2
      // 1b6: ifnull 1dc
      // 1b9: goto 1c0
      // 1bc: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: ifeq 1d8
      // 1c3: goto 1ca
      // 1c6: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c9: athrow
      // 1ca: aload 0
      // 1cb: bipush 1
      // 1cc: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Z
      // 1cf: bipush 1
      // 1d0: putstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll Z
      // 1d3: return
      // 1d4: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: aload 0
      // 1d9: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Z
      // 1dc: aload 2
      // 1dd: ifnull 295
      // 1e0: ifeq 28f
      // 1e3: goto 1ea
      // 1e6: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e9: athrow
      // 1ea: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll Ljava/lang/Integer;
      // 1ed: aload 2
      // 1ee: ifnull 20d
      // 1f1: goto 1f8
      // 1f4: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f7: athrow
      // 1f8: dup
      // 1f9: ifnull 28c
      // 1fc: goto 203
      // 1ff: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: checkcast java/lang/Number
      // 206: goto 20d
      // 209: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20c: athrow
      // 20d: invokevirtual java/lang/Number.intValue ()I
      // 210: istore 5
      // 212: bipush 0
      // 213: istore 6
      // 215: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 218: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 21b: aload 2
      // 21c: ifnull 258
      // 21f: iload 5
      // 221: if_icmpeq 23f
      // 224: goto 22b
      // 227: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22a: athrow
      // 22b: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 22e: iload 5
      // 230: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 233: pop
      // 234: aload 2
      // 235: ifnonnull 288
      // 238: goto 23f
      // 23b: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23e: athrow
      // 23f: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 242: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.k ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 245: sipush 200
      // 248: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 24b: checkcast java/lang/Number
      // 24e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 251: goto 258
      // 254: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 257: athrow
      // 258: aload 2
      // 259: ifnull 273
      // 25c: ifeq 288
      // 25f: goto 266
      // 262: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 265: athrow
      // 266: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 269: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.j ()Z
      // 26c: goto 273
      // 26f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 272: athrow
      // 273: ifeq 288
      // 276: aload 0
      // 277: bipush 0
      // 278: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Z
      // 27b: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 27e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 281: goto 288
      // 284: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 287: athrow
      // 288: nop
      // 289: goto 28e
      // 28c: pop
      // 28d: nop
      // 28e: return
      // 28f: getstatic me/octo/client/IllllIIIIlllIIllIIIIlIlIlllIIIllIIlIIIIllIIIlIllllllIIlllllIIlIIlIlIlIIlllIIIIlIIlllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/IllllIIIIlllIIllIIIIlIlIlllIIIllIIlIIIIllIIIlIllllllIIlllllIIlIIlIlIlIIlllIIIIlIIlllI;
      // 292: invokevirtual me/octo/client/IllllIIIIlllIIllIIIIlIlIlllIIIllIIlIIIIllIIIlIllllllIIlllllIIlIIlIlIlIIlllIIIIlIIlllI.aA ()Z
      // 295: aload 2
      // 296: ifnull 2ae
      // 299: ifeq 2cd
      // 29c: goto 2a3
      // 29f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a2: athrow
      // 2a3: aload 0
      // 2a4: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.t ()Z
      // 2a7: goto 2ae
      // 2aa: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ad: athrow
      // 2ae: aload 2
      // 2af: ifnull 2c9
      // 2b2: ifeq 2cd
      // 2b5: goto 2bc
      // 2b8: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2bb: athrow
      // 2bc: aload 0
      // 2bd: bipush 1
      // 2be: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll Z
      // 2c1: bipush 1
      // 2c2: goto 2c9
      // 2c5: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c8: athrow
      // 2c9: putstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII Z
      // 2cc: return
      // 2cd: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 2d0: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.q ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 2d3: dup
      // 2d4: ifnull 2e1
      // 2d7: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 2da: goto 2e3
      // 2dd: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e0: athrow
      // 2e1: pop
      // 2e2: return
      // 2e3: istore 3
      // 2e4: getstatic me/octo/client/utils/player/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 2e7: invokevirtual me/octo/client/utils/player/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.g ()Z
      // 2ea: aload 2
      // 2eb: ifnull 305
      // 2ee: ifeq 33f
      // 2f1: goto 2f8
      // 2f4: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f7: athrow
      // 2f8: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 2fb: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.j ()Z
      // 2fe: goto 305
      // 301: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 304: athrow
      // 305: aload 2
      // 306: ifnull 320
      // 309: ifne 33f
      // 30c: goto 313
      // 30f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 312: athrow
      // 313: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 316: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 319: goto 320
      // 31c: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31f: athrow
      // 320: aload 2
      // 321: ifnull 33d
      // 324: iload 3
      // 325: if_icmpeq 33f
      // 328: goto 32f
      // 32b: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32e: athrow
      // 32f: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 332: iload 3
      // 333: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 336: goto 33d
      // 339: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33c: athrow
      // 33d: pop
      // 33e: return
      // 33f: aload 0
      // 340: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 343: astore 4
      // 345: aload 4
      // 347: aload 2
      // 348: ifnull 72c
      // 34b: ifnull 71d
      // 34e: goto 355
      // 351: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 354: athrow
      // 355: aload 4
      // 357: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()Lnet/minecraft/world/phys/Vec3;
      // 35a: astore 5
      // 35c: aload 5
      // 35e: aload 2
      // 35f: ifnull 3af
      // 362: ifnonnull 399
      // 365: goto 36c
      // 368: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36b: athrow
      // 36c: aload 0
      // 36d: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 370: dup
      // 371: ifnull 394
      // 374: goto 37b
      // 377: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37a: athrow
      // 37b: aload 0
      // 37c: aload 4
      // 37e: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/core/BlockPos;
      // 381: aconst_null
      // 382: aconst_null
      // 383: bipush 0
      // 384: bipush 14
      // 386: aconst_null
      // 387: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)Lnet/minecraft/world/phys/Vec3;
      // 38a: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lnet/minecraft/world/phys/Vec3;)V
      // 38d: goto 430
      // 390: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 393: athrow
      // 394: pop
      // 395: aload 2
      // 396: ifnonnull 430
      // 399: aload 0
      // 39a: aload 2
      // 39b: ifnull 431
      // 39e: goto 3a5
      // 3a1: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a4: athrow
      // 3a5: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Lnet/minecraft/world/phys/Vec3;
      // 3a8: goto 3af
      // 3ab: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ae: athrow
      // 3af: ifnonnull 430
      // 3b2: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 3b5: aload 5
      // 3b7: aload 0
      // 3b8: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 3bb: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 3be: dup
      // 3bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 3c2: invokevirtual net/minecraft/client/player/LocalPlayer.blockInteractionRange ()D
      // 3c5: aconst_null
      // 3c6: aconst_null
      // 3c7: bipush 12
      // 3c9: aconst_null
      // 3ca: invokestatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a (Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;Lnet/minecraft/world/phys/Vec3;DLjava/util/List;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 3cd: astore 6
      // 3cf: aload 6
      // 3d1: aload 2
      // 3d2: ifnull 3ee
      // 3d5: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 3d8: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 3db: if_acmpne 407
      // 3de: goto 3e5
      // 3e1: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e4: athrow
      // 3e5: aload 6
      // 3e7: goto 3ee
      // 3ea: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ed: athrow
      // 3ee: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()Lnet/minecraft/core/BlockPos;
      // 3f1: aload 2
      // 3f2: ifnull 434
      // 3f5: aload 4
      // 3f7: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/core/BlockPos;
      // 3fa: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 3fd: ifne 430
      // 400: goto 407
      // 403: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 406: athrow
      // 407: aload 0
      // 408: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 40b: dup
      // 40c: ifnull 42f
      // 40f: goto 416
      // 412: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 415: athrow
      // 416: aload 0
      // 417: aload 4
      // 419: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/core/BlockPos;
      // 41c: aconst_null
      // 41d: aconst_null
      // 41e: bipush 0
      // 41f: bipush 14
      // 421: aconst_null
      // 422: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)Lnet/minecraft/world/phys/Vec3;
      // 425: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lnet/minecraft/world/phys/Vec3;)V
      // 428: goto 430
      // 42b: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42e: athrow
      // 42f: pop
      // 430: aload 0
      // 431: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl Lnet/minecraft/core/BlockPos;
      // 434: ifnull 460
      // 437: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 43a: sipush -21426
      // 43d: sipush 24611
      // 440: pop2
      // 441: ldc_w "attack"
      // 444: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;)Z
      // 447: aload 2
      // 448: ifnull 45d
      // 44b: goto 452
      // 44e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 451: athrow
      // 452: ifeq 460
      // 455: goto 45c
      // 458: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45b: athrow
      // 45c: bipush 1
      // 45d: goto 461
      // 460: bipush 0
      // 461: istore 6
      // 463: iload 6
      // 465: aload 2
      // 466: ifnull 485
      // 469: ifeq 550
      // 46c: goto 473
      // 46f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 472: athrow
      // 473: aload 0
      // 474: aload 4
      // 476: bipush 0
      // 477: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;Z)V
      // 47a: aload 0
      // 47b: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII I
      // 47e: goto 485
      // 481: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 484: athrow
      // 485: aload 0
      // 486: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll I
      // 489: aload 2
      // 48a: ifnull 4bd
      // 48d: if_icmpeq 4ad
      // 490: goto 497
      // 493: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 496: athrow
      // 497: aload 0
      // 498: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 49b: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 49e: aload 0
      // 49f: aload 0
      // 4a0: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII I
      // 4a3: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll I
      // 4a6: goto 4ad
      // 4a9: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ac: athrow
      // 4ad: aload 0
      // 4ae: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII I
      // 4b1: aload 2
      // 4b2: ifnull 4d0
      // 4b5: bipush 3
      // 4b6: goto 4bd
      // 4b9: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4bc: athrow
      // 4bd: if_icmplt 550
      // 4c0: getstatic me/octo/client/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII;
      // 4c3: invokevirtual me/octo/client/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.j ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 4c6: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 4c9: goto 4d0
      // 4cc: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4cf: athrow
      // 4d0: aload 2
      // 4d1: ifnull 4ec
      // 4d4: ifeq 550
      // 4d7: goto 4de
      // 4da: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4dd: athrow
      // 4de: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI D
      // 4e1: ldc2_w 16.0
      // 4e4: dcmpl
      // 4e5: goto 4ec
      // 4e8: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4eb: athrow
      // 4ec: aload 2
      // 4ed: ifnull 507
      // 4f0: iflt 550
      // 4f3: goto 4fa
      // 4f6: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f9: athrow
      // 4fa: getstatic me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
      // 4fd: invokevirtual me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.z ()Z
      // 500: goto 507
      // 503: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 506: athrow
      // 507: aload 2
      // 508: ifnull 522
      // 50b: ifne 550
      // 50e: goto 515
      // 511: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 514: athrow
      // 515: getstatic me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
      // 518: invokevirtual me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.i ()I
      // 51b: goto 522
      // 51e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 521: athrow
      // 522: aload 2
      // 523: ifnull 54a
      // 526: ifle 550
      // 529: goto 530
      // 52c: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52f: athrow
      // 530: getstatic me/octo/client/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 533: getfield me/octo/client/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/events/impl/base/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 536: new me/octo/client/events/impl/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII
      // 539: dup
      // 53a: invokespecial me/octo/client/events/impl/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.<init> ()V
      // 53d: checkcast me/octo/client/events/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 540: invokevirtual me/octo/client/events/impl/base/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Lme/octo/client/events/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)Z
      // 543: goto 54a
      // 546: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 549: athrow
      // 54a: pop
      // 54b: aload 0
      // 54c: bipush 0
      // 54d: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII I
      // 550: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 553: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.g ()Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 556: dup
      // 557: ifnonnull 560
      // 55a: pop
      // 55b: return
      // 55c: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55f: athrow
      // 560: astore 7
      // 562: iload 6
      // 564: aload 2
      // 565: ifnull 5f3
      // 568: ifeq 5ea
      // 56b: goto 572
      // 56e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 571: athrow
      // 572: aload 0
      // 573: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 576: aload 7
      // 578: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()D
      // 57b: ldc2_w 1000.0
      // 57e: dcmpg
      // 57f: aload 2
      // 580: ifnull 597
      // 583: goto 58a
      // 586: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 589: athrow
      // 58a: ifge 59a
      // 58d: goto 594
      // 590: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 593: athrow
      // 594: sipush 5000
      // 597: goto 59d
      // 59a: sipush 2000
      // 59d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5a0: checkcast java/lang/Number
      // 5a3: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 5a6: aload 2
      // 5a7: ifnull 5f3
      // 5aa: ifeq 5ea
      // 5ad: goto 5b4
      // 5b0: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b3: athrow
      // 5b4: aload 0
      // 5b5: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.r ()V
      // 5b8: aload 0
      // 5b9: aload 4
      // 5bb: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/core/BlockPos;
      // 5be: aload 2
      // 5bf: ifnull 5f0
      // 5c2: goto 5c9
      // 5c5: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c8: athrow
      // 5c9: aconst_null
      // 5ca: aconst_null
      // 5cb: bipush 0
      // 5cc: bipush 14
      // 5ce: aconst_null
      // 5cf: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)Lnet/minecraft/world/phys/Vec3;
      // 5d2: ifnull 5ea
      // 5d5: goto 5dc
      // 5d8: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5db: athrow
      // 5dc: aload 0
      // 5dd: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII I
      // 5e0: istore 8
      // 5e2: aload 0
      // 5e3: iload 8
      // 5e5: bipush 1
      // 5e6: iadd
      // 5e7: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII I
      // 5ea: aload 0
      // 5eb: aload 4
      // 5ed: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/core/BlockPos;
      // 5f0: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.b (Lnet/minecraft/core/BlockPos;)Z
      // 5f3: istore 8
      // 5f5: aload 0
      // 5f6: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl Z
      // 5f9: aload 2
      // 5fa: ifnull 6a3
      // 5fd: ifeq 6a1
      // 600: goto 607
      // 603: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 606: athrow
      // 607: aload 0
      // 608: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Z
      // 60b: aload 2
      // 60c: ifnull 6a3
      // 60f: goto 616
      // 612: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 615: athrow
      // 616: ifeq 6a1
      // 619: goto 620
      // 61c: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61f: athrow
      // 620: aload 0
      // 621: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl I
      // 624: aload 2
      // 625: ifnull 67a
      // 628: goto 62f
      // 62b: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62e: athrow
      // 62f: ifgt 66d
      // 632: goto 639
      // 635: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 638: athrow
      // 639: aload 0
      // 63a: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 63d: aload 2
      // 63e: ifnull 6b3
      // 641: goto 648
      // 644: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 647: athrow
      // 648: ifeq 6b1
      // 64b: goto 652
      // 64e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 651: athrow
      // 652: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 655: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.m ()Z
      // 658: aload 2
      // 659: ifnull 6b3
      // 65c: goto 663
      // 65f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 662: athrow
      // 663: ifne 6b1
      // 666: goto 66d
      // 669: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66c: athrow
      // 66d: aload 0
      // 66e: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl D
      // 671: dconst_0
      // 672: dcmpg
      // 673: goto 67a
      // 676: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 679: athrow
      // 67a: aload 2
      // 67b: ifnull 6a3
      // 67e: ifgt 6a1
      // 681: goto 688
      // 684: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 687: athrow
      // 688: aload 0
      // 689: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 68c: aload 2
      // 68d: ifnull 6b3
      // 690: goto 697
      // 693: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 696: athrow
      // 697: ifne 6b1
      // 69a: goto 6a1
      // 69d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a0: athrow
      // 6a1: iload 8
      // 6a3: aload 2
      // 6a4: ifnull 6b3
      // 6a7: ifeq 70f
      // 6aa: goto 6b1
      // 6ad: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b0: athrow
      // 6b1: iload 8
      // 6b3: aload 2
      // 6b4: ifnull 6d7
      // 6b7: ifne 700
      // 6ba: goto 6c1
      // 6bd: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c0: athrow
      // 6c1: aload 0
      // 6c2: aload 2
      // 6c3: ifnull 708
      // 6c6: goto 6cd
      // 6c9: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6cc: athrow
      // 6cd: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Z
      // 6d0: goto 6d7
      // 6d3: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d6: athrow
      // 6d7: ifeq 700
      // 6da: aload 0
      // 6db: aload 2
      // 6dc: ifnull 71e
      // 6df: goto 6e6
      // 6e2: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e5: athrow
      // 6e6: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 6e9: aload 0
      // 6ea: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI I
      // 6ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6f0: checkcast java/lang/Number
      // 6f3: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 6f6: ifeq 71d
      // 6f9: goto 700
      // 6fc: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6ff: athrow
      // 700: aload 0
      // 701: goto 708
      // 704: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 707: athrow
      // 708: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.C ()V
      // 70b: aload 2
      // 70c: ifnonnull 71d
      // 70f: aload 0
      // 710: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 713: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 716: goto 71d
      // 719: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71c: athrow
      // 71d: aload 0
      // 71e: aload 2
      // 71f: ifnull 76d
      // 722: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 725: goto 72c
      // 728: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72b: athrow
      // 72c: ifnonnull 76c
      // 72f: aload 0
      // 730: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII Z
      // 733: aload 2
      // 734: ifnull 770
      // 737: goto 73e
      // 73a: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73d: athrow
      // 73e: ifne 76c
      // 741: goto 748
      // 744: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 747: athrow
      // 748: aload 0
      // 749: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 74c: aload 2
      // 74d: ifnull 770
      // 750: goto 757
      // 753: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 756: athrow
      // 757: ifne 76c
      // 75a: goto 761
      // 75d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 760: athrow
      // 761: aload 0
      // 762: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.D ()V
      // 765: goto 76c
      // 768: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76b: athrow
      // 76c: aload 0
      // 76d: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.w ()Z
      // 770: aload 2
      // 771: ifnull 78d
      // 774: ifeq 789
      // 777: goto 77e
      // 77a: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77d: athrow
      // 77e: aload 0
      // 77f: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.z ()V
      // 782: goto 789
      // 785: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 788: athrow
      // 789: aload 0
      // 78a: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII Z
      // 78d: aload 2
      // 78e: ifnull 7dd
      // 791: ifeq 7c7
      // 794: goto 79b
      // 797: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79a: athrow
      // 79b: aload 0
      // 79c: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 79f: aload 2
      // 7a0: ifnull 7dd
      // 7a3: goto 7aa
      // 7a6: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a9: athrow
      // 7aa: ifne 7c7
      // 7ad: goto 7b4
      // 7b0: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b3: athrow
      // 7b4: aload 0
      // 7b5: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.y ()V
      // 7b8: aload 0
      // 7b9: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.B ()V
      // 7bc: aload 2
      // 7bd: ifnonnull 7f3
      // 7c0: goto 7c7
      // 7c3: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c6: athrow
      // 7c7: aload 0
      // 7c8: aload 2
      // 7c9: ifnull 7f4
      // 7cc: goto 7d3
      // 7cf: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d2: athrow
      // 7d3: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 7d6: goto 7dd
      // 7d9: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7dc: athrow
      // 7dd: ifne 7f3
      // 7e0: aload 0
      // 7e1: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.A ()V
      // 7e4: aload 0
      // 7e5: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.u ()V
      // 7e8: aload 0
      // 7e9: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.B ()V
      // 7ec: goto 7f3
      // 7ef: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f2: athrow
      // 7f3: aload 0
      // 7f4: aload 2
      // 7f5: ifnull 80d
      // 7f8: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 7fb: ifnonnull 83b
      // 7fe: goto 805
      // 801: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 804: athrow
      // 805: aload 0
      // 806: goto 80d
      // 809: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80c: athrow
      // 80d: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII Z
      // 810: aload 2
      // 811: ifnull 834
      // 814: ifne 83b
      // 817: goto 81e
      // 81a: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81d: athrow
      // 81e: aload 0
      // 81f: aload 2
      // 820: ifnull 838
      // 823: goto 82a
      // 826: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 829: athrow
      // 82a: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Z
      // 82d: goto 834
      // 830: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 833: athrow
      // 834: ifne 83b
      // 837: aload 0
      // 838: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.D ()V
      // 83b: return
   }

   private final void r() {
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = true;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.f();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.f();
   }

   private final boolean s() {
      @Nullable
      var var2 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("Powder Pie");
      if (me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j().contains("Powder Pie")) {
         IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI.f();
      }

      IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = var2 == null ? 0 : var2.b();
      return IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI.a(Integer.valueOf(4000))
         || IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll
         || lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl.a(Long.valueOf(3540000L));
   }

   private final boolean t() {
      @Nullable
      var var2 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("Filet O' Fortune");
      if (me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j().contains("Filet O' Fortune")) {
         IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl.f();
      }

      lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = var2 == null ? 0 : var2.b();
      return IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl.a(Integer.valueOf(4000))
         || llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII
         || IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII.a(Long.valueOf(3540000L));
   }

   public void u() {
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI param1) {
      String var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(param1, "event");
      net.minecraft.network.protocol.Packet var3 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var3 instanceof net.minecraft.network.protocol.game.ServerboundPlayerActionPacket) {
         net.minecraft.network.protocol.game.ServerboundPlayerActionPacket var8 = (net.minecraft.network.protocol.game.ServerboundPlayerActionPacket)var3;
         net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action var4 = var8.getAction();
         me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var5 != null && var4 == net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.START_DESTROY_BLOCK && Intrinsics.areEqual(var5.a(), var8.getPos());
         if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl && var5 != null) {
            this.a(var5, true);
            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         }
         if ((var4 == net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.START_DESTROY_BLOCK
                  || var4 == net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.ABORT_DESTROY_BLOCK
                  || var4 == net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.STOP_DESTROY_BLOCK)
               && this instanceof me.octo.client.IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl) {
            BlockPos var6 = var8.getPos();
            net.minecraft.client.multiplayer.ClientLevel var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.level;
            if (var9 != null) {
               net.minecraft.world.level.block.state.BlockState var7 = var9.getBlockState(var6);
               if (var7 != null && var7.is(net.minecraft.world.level.block.Blocks.COBBLESTONE)
                     && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var6.getCenter(), false) < 1.5) {
                  param1.a(true);
               }
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI param1) {
String var2 = me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
if (this instanceof me.octo.client.IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl) {
   return;
}
net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket var3 = param1.k();
if (kotlin.jvm.internal.Intrinsics.areEqual(var3.getParticle().getType(), net.minecraft.core.particles.ParticleTypes.CRIT)) {
   net.minecraft.world.phys.Vec3 var4 = new net.minecraft.world.phys.Vec3(var3.getX(), var3.getY(), var3.getZ());
   if (me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().j() < 20) {
      this.d(var4);
   }
   if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == null) {
      return;
   }
   me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   if (!this.a(var5.a(), var4)) {
      return;
   }
   if (!this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI) {
      return;
   }
   if (this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl != null) {
      return;
   }
   if (this.G()) {
      return;
   }
   if (!this.H()) {
      return;
   }
   double var6 = kotlin.ranges.RangesKt.coerceIn(0.27 - (double)me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.x() - 1.27, 0.0, 0.27);
   net.minecraft.world.phys.Vec3 var8 = var4.subtract(0.0, var6, 0.0);
   me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var9 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var8, this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player.blockInteractionRange(), (java.util.List)null, (net.minecraft.world.phys.Vec3)null);
   if (kotlin.jvm.internal.Intrinsics.areEqual(var9.b(), me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) && kotlin.jvm.internal.Intrinsics.areEqual(var9.c(), var5.a())) {
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var8;
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = var4;
   }
} else if (kotlin.jvm.internal.Intrinsics.areEqual(var3.getParticle().getType(), net.minecraft.core.particles.ParticleTypes.HAPPY_VILLAGER)) {
   this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = true;
}
   }

   @SubscribeEvent
   public final void a(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      String var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(param1, "event");
      if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m() && !(this instanceof me.octo.client.IlIIlIllIlIlllIlIllIIlIIlIlIlIlIlllIIlIIIIIIlIIIIIIIIIlllIIlIIlIIIIIIllIllllIIlllIIIl)) {
         net.minecraft.network.protocol.Packet var3 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if (var3 instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket
                  && me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().j() < 20
                  && kotlin.text.StringsKt.contains(((net.minecraft.network.protocol.game.ClientboundSystemChatPacket)var3).content().getString(), "You have successfully picked the lock on this chest!", false)) {
            net.minecraft.core.BlockPos var4 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
            if (var4 != null) {
               this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.add(var4);
            }
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = null;
            this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = null;
         }
      }
   }

   private final void d(Vec3 param1) {
String var2 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
if (var2 != null && this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl != null) {
   Vec3 var3 = new Vec3(this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.getX() + 0.5D, this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.getY() + 0.5D, this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.getZ() + 0.5D);
   if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player.distanceToSqr(var3) > 64.0D) {
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = null;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = null;
      return;
   }
   if (Math.abs(var3.x - param1.x) >= 0.7D) {
      return;
   }
   if (Math.abs(var3.y - param1.y) >= 0.7D) {
      return;
   }
   if (Math.abs(var3.z - param1.z) >= 0.7D) {
      return;
   }
   this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = param1;
   if (var2 != null) {
      return;
   }
}
if (var2 == null) {
   if (this.e(param1)) {
      return;
   }
} else {
   if (!this.e(param1)) {
      return;
   }
   if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player.distanceToSqr(param1) >= 64.0D) {
      return;
   }
}
BlockPos var4 = this.f(param1);
BlockState var5 = null;
if (var2 != null) {
   ClientLevel var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.level;
   if (var6 != null) {
      var5 = var6.getBlockState(var4);
   }
}
boolean var7 = false;
if (var5 != null) {
   var7 = var5.getBlock() instanceof net.minecraft.world.level.block.ChestBlock;
}
if (var2 == null) {
   if (var7) {
      return;
   }
} else {
   if (!var7) {
      return;
   }
   if (this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.contains(var4)) {
      return;
   }
}
this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = param1;
this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var4;
   }

   private final boolean e(Vec3 param1) {
      double var3 = param1.x;
      double var5 = param1.z;
      float var7 = this.a(Math.abs((float)(var3 - (double)((int)var3))));
      float var8 = this.a(Math.abs((float)(var5 - (double)((int)var5))));

      boolean var9;
      try {
         var9 = var7 == 0.1F || var7 == 0.9F || var8 == 0.1F || var8 == 0.9F;
      } catch (Exception var10) {
         var9 = false;
      }

      return var9;
   }

   private final BlockPos f(Vec3 var1) {
      Object var22 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      Object var20 = null; // PX-FIX
      Object var19 = null; // PX-FIX
      double var3 = var1.x;
      String var10000 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      double var5 = var1.y;
      double var7 = var1.z;
      String var2 = var10000;
      float var9 = this.a(Math.abs((float)(var3 - (int)var3)));
      float var10 = this.a(Math.abs((float)(var7 - (int)var7)));

      label115: {
         label114: {
            try {
               float var24;
               var19 = (var24 = var9 - 0.9F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
               if (var2 == null) {
                  break label115;
               }

               if (!(me.octo.client.PxTruth.truth(var19))) {
                  break label114;
               }
            } catch (NoSuchElementException var18) {
               throw (RuntimeException)a(var18);
            }

            var19 = 0;
            break label115;
         }

         var19 = 1;
      }

      try {
         if ((me.octo.client.PxTruth.truth(var19))) {
            return new BlockPos((int)var3 + 1, (int)var5, (int)var7);
         }
      } catch (NoSuchElementException var17) {
         throw (RuntimeException)a(var17);
      }

      label99: {
         label98: {
            try {
               float var25;
               var20 = (var25 = var9 - 0.1F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
               if (var2 == null) {
                  break label99;
               }

               if (!(me.octo.client.PxTruth.truth(var20))) {
                  break label98;
               }
            } catch (NoSuchElementException var16) {
               throw (RuntimeException)a(var16);
            }

            var20 = 0;
            break label99;
         }

         var20 = 1;
      }

      try {
         if ((me.octo.client.PxTruth.truth(var20))) {
            return new BlockPos((int)var3 - 1, (int)var5, (int)var7);
         }
      } catch (NoSuchElementException var15) {
         throw (RuntimeException)a(var15);
      }

      label84: {
         label83: {
            try {
               float var26;
               var21 = (var26 = var10 - 0.9F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
               if (var2 == null) {
                  break label84;
               }

               if (!(me.octo.client.PxTruth.truth(var21))) {
                  break label83;
               }
            } catch (NoSuchElementException var14) {
               throw (RuntimeException)a(var14);
            }

            var21 = 0;
            break label84;
         }

         var21 = 1;
      }

      try {
         if ((me.octo.client.PxTruth.truth(var21))) {
            return new BlockPos((int)var3, (int)var5, (int)var7 + 1);
         }
      } catch (NoSuchElementException var13) {
         throw (RuntimeException)a(var13);
      }

      label69: {
         label68: {
            try {
               float var27;
               var22 = (var27 = var10 - 0.1F) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
               if (var2 == null) {
                  break label69;
               }

               if (!(me.octo.client.PxTruth.truth(var22))) {
                  break label68;
               }
            } catch (NoSuchElementException var12) {
               throw (RuntimeException)a(var12);
            }

            var22 = 0;
            break label69;
         }

         var22 = 1;
      }

      try {
         if ((me.octo.client.PxTruth.truth(var22))) {
            return new BlockPos((int)var3, (int)var5, (int)var7 - 1);
         }
      } catch (NoSuchElementException var11) {
         throw (RuntimeException)a(var11);
      }

      return new BlockPos((int)var3, (int)var5, (int)var7);
   }

   private final float a(float var1) {
      float var2;
      try {
         var2 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(var1 * 10000)
            / 10000.0F;
      } catch (Exception var4) {
         var2 = 0.0F;
      }

      return var2;
   }

   @SubscribeEvent
   public final void a(@NotNull lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var1) {
      short var10001 = -21500;
      short var10002 = 25372;
      Intrinsics.checkNotNullParameter(var1, "event");
      ClientboundBlockDestructionPacket var2 = var1.k();

      try {
         if (var2.getPos().equals(this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl)) {
            this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = var2.getProgress();
         }
      } catch (NoSuchElementException var3) {
         throw (RuntimeException)a(var3);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1) {
      Object var6 = null; // PX-FIX
      String var10000 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = -21500;
      short var10003 = 25372;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;

      label36: {
         try {
            var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var2 == null) {
               break label36;
            }

            if (!this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
               return;
            }
         } catch (NoSuchElementException var5) {
            throw (RuntimeException)a(var5);
         }

         var6 = lIIllIlllllIlIIlIlIIIlIlIllIllIIIlIIlIIIIIlllIllIIIllIIlIIllIlIlIIIIlllIlIIlIIlIIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .ae();
      }

      if ((me.octo.client.PxTruth.truth(var6))) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;

         try {
            if (var3 != null) {
               var1.a(true);
            }
         } catch (NoSuchElementException var4) {
            throw (RuntimeException)a(var4);
         }
      }
   }

   private final boolean a(BlockPos param1, Vec3 param2) {
      var var3 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(param1);
      return Math.abs(var3.x - param2.x) <= 0.7
         && Math.abs(var3.y - param2.y) <= 0.7
         && Math.abs(var3.z - param2.z) <= 0.7;
   }

   private final boolean b(BlockPos param1) {
      var var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.level;
      Intrinsics.checkNotNull(var2);
      BlockState var3 = var2.getBlockState(param1);
      Intrinsics.checkNotNullExpressionValue(var3, "getBlockState(...)");
      return var3.isAir() || var3.is(net.minecraft.world.level.block.Blocks.BEDROCK);
   }

   @NotNull
   protected List<Vec3> v() {
      return CollectionsKt.emptyList();
   }

   protected boolean w() {
      return false;
   }

   private final void x() {
      int var1 = this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll++;
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
      this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = false;
      this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = null;
      this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = null;
      this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = null;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = 0;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = 0;
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = null;
      this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = null;
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.clear();
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.f();
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.f();
   }

   @Nullable
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI g(
      @NotNull Vec3 var1
   ) {
      short var10001 = -21427;
      short var10002 = -10139;
      Intrinsics.checkNotNullParameter(var1, "destination");
      return null;
   }

   public int h(@NotNull Vec3 var1) {
      short var10001 = -21497;
      short var10002 = -4806;
      Intrinsics.checkNotNullParameter(var1, "eyePos");
      return 0;
   }

   private final void y() {
      String var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var1 == null) {
         return;
      }
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
      if (var2 == null) {
         return;
      }
      if (this.b(var2.a())) {
         this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = null;
         return;
      }
      Vec3 var3 = var2.d();
      if (var3 == null) {
         var3 = var2.c();
      }
      this.a(var3, (Vec3)null);
   }

   protected void z() {

      block10: {
          IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll iIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll;
          String string;
          block8: {
              block9: {
                  string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
                  try {
                      try {
                          iIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll = this;
                          if (string == null) break block8;
                          if (iIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.w()) break block9;
                      }
                      catch (NoSuchElementException noSuchElementException) {
                          throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                      }
                      return;
                  }
                  catch (NoSuchElementException noSuchElementException) {
                      throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                  }
              }
              iIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll = this;
          }
          List<Vec3> list = iIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.v();
          try {
              boolean bl;
              try {
                  this.N();
                  bl = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
                  if (string == null || !bl) break block10;
              }
              catch (NoSuchElementException noSuchElementException) {
                  throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
              }
              this.c(list);
              bl = this.O();
          }
          catch (NoSuchElementException noSuchElementException) {
              throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
          }
      }

   }

   public void A() {
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
      // 005: ifnull 021
      // 008: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 00b: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.g ()Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 00e: dup
      // 00f: ifnonnull 022
      // 012: goto 019
      // 015: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: pop
      // 01a: goto 021
      // 01d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: return
      // 022: astore 2
      // 023: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 026: bipush 1
      // 027: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.e (Z)Z
      // 02a: ifeq 165
      // 02d: aload 2
      // 02e: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 031: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 034: if_acmpeq 165
      // 037: goto 03e
      // 03a: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d: athrow
      // 03e: getstatic me/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI;
      // 041: invokevirtual me/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.e ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 044: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 047: ifeq 068
      // 04a: goto 051
      // 04d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 054: bipush 1
      // 055: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.b (Z)V
      // 058: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 05b: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.n ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 05e: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 061: goto 068
      // 064: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 06b: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.q ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 06e: dup
      // 06f: ifnonnull 078
      // 072: pop
      // 073: return
      // 074: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: astore 3
      // 079: new java/util/ArrayList
      // 07c: dup
      // 07d: invokespecial java/util/ArrayList.<init> ()V
      // 080: astore 4
      // 082: aload 1
      // 083: ifnull 0ac
      // 086: aload 0
      // 087: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 08a: dup
      // 08b: ifnull 0ab
      // 08e: goto 095
      // 091: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: astore 6
      // 097: bipush 0
      // 098: istore 7
      // 09a: aload 4
      // 09c: aload 6
      // 09e: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0a1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a4: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0a7: pop
      // 0a8: goto 0ad
      // 0ab: pop
      // 0ac: nop
      // 0ad: aload 0
      // 0ae: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0b1: dup
      // 0b2: ifnull 0e5
      // 0b5: astore 6
      // 0b7: bipush 0
      // 0b8: istore 7
      // 0ba: aload 1
      // 0bb: ifnull 0e2
      // 0be: aload 0
      // 0bf: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Z
      // 0c2: ifeq 0e1
      // 0c5: goto 0cc
      // 0c8: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 4
      // 0ce: aload 6
      // 0d0: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0d3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d6: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0d9: pop
      // 0da: goto 0e1
      // 0dd: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: nop
      // 0e2: goto 0e7
      // 0e5: pop
      // 0e6: nop
      // 0e7: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 0ea: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.o ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0ed: astore 5
      // 0ef: aload 5
      // 0f1: aload 1
      // 0f2: ifnull 101
      // 0f5: ifnull 12d
      // 0f8: goto 0ff
      // 0fb: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: aload 5
      // 101: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 104: aload 1
      // 105: ifnull 12a
      // 108: aload 3
      // 109: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 10c: if_icmpeq 12d
      // 10f: goto 116
      // 112: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 4
      // 118: aload 5
      // 11a: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 11d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 120: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 123: goto 12a
      // 126: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: goto 139
      // 12d: aload 4
      // 12f: aload 3
      // 130: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 133: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 136: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 139: pop
      // 13a: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 13d: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.w ()V
      // 140: getstatic me/octo/client/utils/player/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 143: bipush 3
      // 144: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.S ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 149: aload 4
      // 14b: checkcast java/lang/Iterable
      // 14e: invokestatic kotlin/collections/CollectionsKt.toList (Ljava/lang/Iterable;)Ljava/util/List;
      // 151: aload 3
      // 152: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 155: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 158: invokevirtual me/octo/client/utils/player/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (ILkotlin/jvm/functions/Function0;Ljava/util/List;Ljava/lang/Integer;)V
      // 15b: aload 0
      // 15c: bipush 1
      // 15d: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI Z
      // 160: aload 0
      // 161: bipush 1
      // 162: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl Z
      // 165: return
   }

   private final void B() {
      String var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (!me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j() && me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() && me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k().a((Number)Integer.valueOf(100)) && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) {
         net.minecraft.world.phys.BlockHitResult var6 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.I();
         BlockPos var2 = var6 != null ? var6.getBlockPos() : null;
         if (var2 != null && this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl && (this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI || (this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl && Intrinsics.areEqual(this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll, var2)))) {
            net.minecraft.client.KeyMapping.click(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.options.keyAttack.getDefaultKey());
            this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = false;
            this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = false;
         }
         if (!this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl && me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.J()) {
            this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = true;
         }
         if (var2 != null) {
            this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = var2;
            this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = false;
         }
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("attack", true);
      } else {
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("attack", false);
      }
   }

   private final void C() {
      String var1 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();

      label49: {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000;
         label40:
         try {
            if (var1 != null) {
               var10000 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               if (this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
                  break label40;
               }
            }
            break label49;
         } catch (NoSuchElementException var5) {
            throw (RuntimeException)a(var5);
         }

         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = var10000;
         boolean var3 = false;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.add(var2.a());

         while (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.size() > 2) {
            try {
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.remove(0);
               if (var1 == null || var1 == null) {
                  break;
               }
            } catch (NoSuchElementException var4) {
               throw (RuntimeException)a(var4);
            }
         }
      }

      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = null;
   }

   private final void D() {
      String var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.E();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = null;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 0.0;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = false;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = me.octo.client.lllIlIlIIIIIllIlllIIIIIlIllIIlllllIlIIlIlIIllIllIIllIIlIIllIIllIIlllIlIIlIIIllllllllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.aA() && (double)me.octo.client.IIIllIllIIIlIIIllIlIIlllIlIIlIIllIlIIIlIIllIIlIlllIIIlIIlIlllIIIIIIIIIllIIIIIlllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().O() > 100.0 * kotlin.random.Random.Default.nextDouble();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = false;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = -1;
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = 0;
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = 0;
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.f();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 150 + kotlin.random.Random.Default.nextInt(100);
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = BlockPos.ZERO;
      this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = false;
      this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = true;
      this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = 0;
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = null;
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = null;
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      if (var2 != null) {
         this.a(var2, true);
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         var2.a(a(this, var2.a(), (Vec3)null, (Vec3)null, false, 14, null));
      }
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var2 == null;
   }

   @Nullable
   public final Vec3 a(@NotNull BlockPos param1, @Nullable Vec3 param2, @NotNull Vec3 param3, boolean param4) {
      Intrinsics.checkNotNullParameter(param1, "pos");
      Intrinsics.checkNotNullParameter(param3, "eyePos");
      var var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.level;
      if (var6 == null) {
         return null;
      }

      var var7 = var6.getBlockState(param1).getCollisionShape(var6, param1).toAabbs();
      Intrinsics.checkNotNullExpressionValue(var7, "toAabbs(...)");
      var var8 = new ArrayList();
      var var9 = var7.iterator();

      while (var9.hasNext()) {
         var var10 = (net.minecraft.world.phys.AABB)var9.next();
         var8.add(new net.minecraft.world.phys.AABB(param1.getX() + var10.minX, param1.getY() + var10.minY, param1.getZ() + var10.minZ, param1.getX() + var10.maxX, param1.getY() + var10.maxY, param1.getZ() + var10.maxZ));
      }

      var var11 = new ArrayList();
      var var12 = var8.iterator();

      while (var12.hasNext()) {
         var var13 = (net.minecraft.world.phys.AABB)var12.next();
         CollectionsKt.addAll(var11, me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var13, 0.0, 0.0, param3, 0.0, 22, (Object)null));
      }

      var var14 = new ArrayList();
      var var15 = var11.iterator();

      while (var15.hasNext()) {
         var var16 = (Vec3)var15.next();
         if (param2 != null && me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var16, param2) <= 0.01) {
            continue;
         }

         if (param4) {
            var var17 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var16, param3);
            var var18 = var16.add(var17.e().normalize().multiply(0.1, 0.1, 0.1));
            Intrinsics.checkNotNullExpressionValue(var18, "add(...)");
            var var19 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var18, 10.0, CollectionsKt.listOf(RemotePlayer.class), param3);
            if (var19.b() != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               continue;
            }

            if (!Intrinsics.areEqual(var19.c(), param1)) {
               continue;
            }

            var var20 = var16.add(var17.d().normalize().multiply(0.1, 0.1, 0.1));
            Intrinsics.checkNotNullExpressionValue(var20, "add(...)");
            var var21 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var20, 10.0, CollectionsKt.listOf(RemotePlayer.class), param3);
            if (var21.b() != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               continue;
            }

            if (!Intrinsics.areEqual(var21.c(), param1)) {
               continue;
            }
         }

         var var22 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var16, CollectionsKt.listOf(RemotePlayer.class), param3);
         if (Intrinsics.areEqual(var22.c(), param1)) {
            var14.add(var16);
         }
      }

      if (var14.size() < 3) {
         return null;
      }

      var var23 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.f(param1);
      var var24 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var23, 0.0, 0.0, param3, 0.0, 22, (Object)null);
      var var25 = var24.iterator();
      if (!var25.hasNext()) {
         throw new NoSuchElementException();
      }

      var var26 = (Vec3)var25.next();
      double var27 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param3, var26);

      while (var25.hasNext()) {
         var var28 = (Vec3)var25.next();
         double var29 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param3, var28);
         if (Double.compare(var27, var29) > 0) {
            var26 = var28;
            var27 = var29;
         }
      }

      Iterable var30i = var14;
      var var30 = CollectionsKt.take(CollectionsKt.sortedWith(var30i, new me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(var26)), 20);
      var var31 = new ArrayList();

      for (Object var32 : var30) {
         var var33 = (Vec3)var32;
         if (a(this, var33, param1, param3, 0.0, 8, (Object)null)) {
            var31.add(var33);
         }
      }

      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = (Vec3)CollectionsKt.randomOrNull((java.util.Collection)(var31.size() < 3 ? var30 : var31), (kotlin.random.Random)kotlin.random.Random.Default);
      return this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
   }

   protected final boolean a(@NotNull Vec3 param1, @NotNull BlockPos param2, @NotNull Vec3 param3, double param4) {
      if (param1.subtract(param3).lengthSqr() < 1.0E-6) return true;
      Vec3 var6 = param1.subtract(param3).normalize();
      Vec3 var7 = Math.abs(var6.y) > 0.9 ? new Vec3(1.0, 0.0, 0.0) : new Vec3(0.0, 1.0, 0.0);
      Vec3 var8 = var6.cross(var7).normalize();
      Vec3 var9 = var8.cross(var6).normalize();
      List var10 = CollectionsKt.listOf(RemotePlayer.class);
      Vec3[] var11 = new Vec3[]{var8.scale(param4), var8.scale(-param4), var9.scale(param4), var9.scale(-param4)};
      for (Vec3 var12 : var11) { var var13 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1.add(var12), var10, param3); if (var13 == null || var13.b() != me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII || !Intrinsics.areEqual(var13.c(), param2)) return false; }
      return true;
   }

   @Nullable
   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI E() {
      return null;
   }

   private final void a(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      boolean var2
   ) {
      double var9 = 0; // PX-FIX
      String var3 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();

      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll var10000;
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var10001;
      BlockPos var10002;
      int var10003;
      label34: {
         label33: {
            try {
               var10000 = this;
               var10001 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               var10002 = var1.a();
               var10003 =(( var2) ? 1 : 0);
               if (var3 == null) {
                  break label34;
               }

               if (!var2) {
                  break label33;
               }
            } catch (NoSuchElementException var5) {
               throw (RuntimeException)a(var5);
            }

            var10003 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
            break label34;
         }

         var10003 = -1;
      }

      label25: {
         try {
            var10000.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var10001.a(var10002, var10003);
            var10000 = this;
            var10001 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var10002 = var1.a();
            if (!var2) {
               var9 = -1.0;
               break label25;
            }
         } catch (NoSuchElementException var4) {
            throw (RuntimeException)a(var4);
         }

         var9 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      }

      var10000.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var10001.a(
         var10002, var9, this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
      );
   }

   private final int F() {

      double d;
      block4: {
          block5: {
              String string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
              try {
                  try {
                      double d2 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll - 0.0;
                      d = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                      if (string == null) break block4;
                      if (d > 0) break block5;
                  }
                  catch (NoSuchElementException noSuchElementException) {
                      throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                  }
                  return 0;
              }
              catch (NoSuchElementException noSuchElementException) {
                  throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
              }
          }
          d = RangesKt.coerceIn((int)((int)((1.0 - this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl / this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) * (double)100)), (int)0, (int)100);
      }
      return (int)d;

   }

   private final boolean G() {

      int n;
      block16: {
          block17: {
              String string;
              int n2;
              block12: {
                  block13: {
                      int n3;
                      block14: {
                          block15: {
                              n2 = IIIllIllIIIlIIIllIlIIlllIlIIlIIllIlIIIlIIllIIlIlllIIIlIIlIlllIIIIIIIIIllIIIIIlllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().O();
                              string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
                              int n4 = this.F();
                              try {
                                  try {
                                      try {
                                          try {
                                              n = n4;
                                              if (string == null) break block12;
                                              if (n <= 0) break block13;
                                          }
                                          catch (NoSuchElementException noSuchElementException) {
                                              throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                                          }
                                          n3 = n4;
                                          if (string == null) break block14;
                                      }
                                      catch (NoSuchElementException noSuchElementException) {
                                          throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                                      }
                                      if (n3 < n2) break block15;
                                  }
                                  catch (NoSuchElementException noSuchElementException) {
                                      throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                                  }
                                  n3 = 1;
                                  break block14;
                              }
                              catch (NoSuchElementException noSuchElementException) {
                                  throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                              }
                          }
                          n3 = 0;
                      }
                      return n3 != 0;
                  }
                  n = (this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII + 1) * 10;
              }
              try {
                  try {
                      if (string == null) break block16;
                      if (n < n2) break block17;
                  }
                  catch (NoSuchElementException noSuchElementException) {
                      throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                  }
                  n = 1;
                  break block16;
              }
              catch (NoSuchElementException noSuchElementException) {
                  throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
              }
          }
          n = 0;
      }
      return n != 0;

   }

   private final boolean H() {
      if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl <= 0) return false;
      float var2 = (me.octo.client.utils.player.lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g().s() + me.octo.client.utils.player.lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g().t()) / 2.0F * 0.75F;
      float var3 = (float)Math.pow((double)RangesKt.coerceAtLeast(var2, 0.1F), 0.65);
      float var4 = 150.0F / var3;
      int var5 = RangesKt.coerceIn((int)((var4 + 50.0F) / 50.0F), 2, 10);
      return this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl > var5;
   }

   public final void a(@Nullable Vec3 param1, @Nullable Vec3 param2) {
      String var3 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var3 != null && param1 != null) {
         if (me.octo.client.utils.player.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i()) {
            me.octo.client.utils.player.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
         }
         me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(param1);
         return;
      }
      if (var3 == null) {
         if (param1 == null) {
            return;
         }
      } else if (param2 == null) {
         return;
      }
      if (me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.i()) {
         me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      }
      if (me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(param2) > 0.5D) {
         me.octo.client.utils.player.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.a(param2);
      }
   }

   public final void i(boolean param1) {
      String disc = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.p();
      if (disc != null) {
         if (param1) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", false);
         }
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("attack", false);
         me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
         me.octo.client.utils.player.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      }
   }

    public void c(@NotNull BlockPos param1) {
       Intrinsics.checkNotNullParameter(param1, "pos");
       this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = true;
       this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = false;
       this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = param1;
       this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
       this.x();
       this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = false;
       this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = false;
       this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, false, 1, (java.lang.Object) null);
       this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t();
       this.D();
       this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = me.octo.client.IIlIllIllIlIIIIIllIlIllIIIIIIlIIIlllIIIlIllIIlIIIllIlIIIIIlIllIlllIIlIlllllIllIIlllII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.aA();
       if (!this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII) {
          me.octo.client.IIlIllIllIlIIIIIllIlIllIIIIIIlIIIlllIIIlIllIIlIIIllIlIIIIIlIllIlllIIlIlllllIllIIlllII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.aB();
       }
       me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(this);
    }

   public void j(boolean param1) {

      block4: {
          boolean bl2;
          block5: {
              this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = false;
              this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
              String string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
              try {
                  try {
                      this.i(param1);
                      this.x();
                      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = null;
                      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = null;
                      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.clear();
                      bl2 = this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
                      if (string == null) break block4;
                      if (bl2) break block5;
                  }
                  catch (NoSuchElementException noSuchElementException) {
                      throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                  }
                  IIlIllIllIlIIIIIllIlIllIIIIIIlIIIlllIIIlIllIIlIIIllIlIIIIIlIllIlllIIlIlllllIllIIlllII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.aC();
              }
              catch (NoSuchElementException noSuchElementException) {
                  throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
              }
          }
          bl2 = me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b(this);
      }

   }

   @NotNull
   public final List<BlockPos> I() {
      return ((List<BlockPos>)(Object)(this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll));
   }

   public final void a(@NotNull List<? extends BlockPos> var1) {
      short var10001 = -21461;
      short var10002 = -26930;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = var1;
   }

   @NotNull
   public final List<Vec3> J() {
      return ((List<Vec3>)(Object)(this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI));
   }

   public final void b(@NotNull List<? extends Vec3> var1) {
      short var10001 = -21503;
      short var10002 = -8480;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI = var1;
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: sipush -21500
      // 004: sipush 25372
      // 007: pop2
      // 008: ldc_w "event"
      // 00b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 011: aload 0
      // 012: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 015: astore 3
      // 016: astore 2
      // 017: aload 3
      // 018: ifnull 2a6
      // 01b: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.u ()Lnet/minecraft/world/phys/Vec3;
      // 01e: astore 4
      // 020: getstatic me/octo/client/lIIllIlllllIlIIlIlIIIlIlIllIllIIIlIIlIIIIIlllIllIIIllIIlIIllIlIlIIIIlllIlIIlIIlIIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/lIIllIlllllIlIIlIlIIIlIlIllIllIIIlIIlIIIIIlllIllIIIllIIlIIllIlIlIIIIlllIlIIlIIlIIIlll;
      // 023: invokevirtual me/octo/client/lIIllIlllllIlIIlIlIIIlIlIllIllIIIlIIlIIIIIlllIllIIIllIIlIIllIlIlIIIIlllIlIIlIIlIIIlll.ae ()Z
      // 026: aload 2
      // 027: ifnull 2ac
      // 02a: ifeq 2a6
      // 02d: goto 034
      // 030: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 037: aload 4
      // 039: aload 3
      // 03a: aload 2
      // 03b: ifnull 05c
      // 03e: goto 045
      // 041: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()Lnet/minecraft/world/phys/Vec3;
      // 048: dup
      // 049: ifnonnull 05f
      // 04c: goto 053
      // 04f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: pop
      // 054: aload 3
      // 055: goto 05c
      // 058: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()Lnet/minecraft/world/phys/Vec3;
      // 05f: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 062: ldc2_w 27.15
      // 065: dcmpg
      // 066: aload 2
      // 067: ifnull 2ac
      // 06a: ifge 2a6
      // 06d: goto 074
      // 070: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 077: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.g ()Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 07a: astore 5
      // 07c: fconst_0
      // 07d: fstore 6
      // 07f: invokestatic me/octo/client/IlIIIIIIllIlllllIlIIIllIIlIIllIllIIIlIlIllIlllIlIIlIIllllllIIIlIlIIIIIIlIlIlllIlllIII.c ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 082: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 085: aload 2
      // 086: ifnull 0dc
      // 089: ifeq 0d2
      // 08c: goto 093
      // 08f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092: athrow
      // 093: aload 0
      // 094: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 097: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 09a: dup
      // 09b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 09e: invokevirtual net/minecraft/client/player/LocalPlayer.getYRot ()F
      // 0a1: aload 2
      // 0a2: ifnull 0d0
      // 0a5: goto 0ac
      // 0a8: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 0af: aload 3
      // 0b0: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()Lnet/minecraft/world/phys/Vec3;
      // 0b3: dup
      // 0b4: ifnonnull 0c4
      // 0b7: goto 0be
      // 0ba: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: pop
      // 0bf: return
      // 0c0: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 0c7: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 0ca: invokestatic net/minecraft/util/Mth.degreesDifference (FF)F
      // 0cd: invokestatic java/lang/Math.abs (F)F
      // 0d0: fstore 6
      // 0d2: fload 6
      // 0d4: invokestatic me/octo/client/IlIIIIIIllIlllllIlIIIllIIlIIllIllIIIlIlIllIlllIlIIlIIllllllIIIlIlIIIIIIlIlIlllIlllIII.d ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 0d7: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 0da: i2f
      // 0db: fcmpg
      // 0dc: aload 2
      // 0dd: ifnull 2ac
      // 0e0: ifgt 2a6
      // 0e3: goto 0ea
      // 0e6: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII I
      // 0ee: aload 2
      // 0ef: ifnull 116
      // 0f2: goto 0f9
      // 0f5: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: invokestatic me/octo/client/IlIIIIIIllIlllllIlIIIllIIlIIllIllIIIlIlIllIlllIlIIlIIllllllIIIlIlIIIIIIlIlIlllIlllIII.b ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 0fc: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.M ()I
      // 0ff: if_icmpge 124
      // 102: goto 109
      // 105: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: invokestatic me/octo/client/IlIIIIIIllIlllllIlIIIllIIlIIllIllIIIlIlIllIlllIlIIlIIllllllIIIlIlIIIIIIlIlIlllIlllIII.a ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 10c: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 10f: goto 116
      // 112: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 2
      // 117: ifnull 2ac
      // 11a: ifne 2a6
      // 11d: goto 124
      // 120: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: aload 5
      // 126: aload 2
      // 127: ifnull 13d
      // 12a: goto 131
      // 12d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: ifnull 1d6
      // 134: goto 13b
      // 137: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: aload 5
      // 13d: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.j ()I
      // 140: aload 2
      // 141: ifnull 1e3
      // 144: bipush 20
      // 146: if_icmpge 1d6
      // 149: goto 150
      // 14c: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: aload 0
      // 151: aload 2
      // 152: ifnull 171
      // 155: goto 15c
      // 158: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lnet/minecraft/world/phys/Vec3;
      // 15f: ifnull 1d6
      // 162: goto 169
      // 165: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 168: athrow
      // 169: aload 0
      // 16a: goto 171
      // 16d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lnet/minecraft/core/BlockPos;
      // 174: ifnull 1d6
      // 177: new net/minecraft/world/phys/Vec3
      // 17a: dup
      // 17b: aload 0
      // 17c: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lnet/minecraft/world/phys/Vec3;
      // 17f: dup
      // 180: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 183: getfield net/minecraft/world/phys/Vec3.x D
      // 186: aload 0
      // 187: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 18a: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 18d: dup
      // 18e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 191: invokevirtual net/minecraft/client/player/LocalPlayer.getEyeY ()D
      // 194: aload 0
      // 195: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lnet/minecraft/world/phys/Vec3;
      // 198: dup
      // 199: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 19c: getfield net/minecraft/world/phys/Vec3.z D
      // 19f: invokespecial net/minecraft/world/phys/Vec3.<init> (DDD)V
      // 1a2: astore 7
      // 1a4: aload 0
      // 1a5: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 1a8: new net/minecraft/world/phys/BlockHitResult
      // 1ab: dup
      // 1ac: aload 7
      // 1ae: aload 0
      // 1af: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 1b2: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1b5: dup
      // 1b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1b9: invokevirtual net/minecraft/client/player/LocalPlayer.getYRot ()F
      // 1bc: f2d
      // 1bd: invokestatic net/minecraft/core/Direction.fromYRot (D)Lnet/minecraft/core/Direction;
      // 1c0: aload 0
      // 1c1: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lnet/minecraft/core/BlockPos;
      // 1c4: dup
      // 1c5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1c8: bipush 0
      // 1c9: invokespecial net/minecraft/world/phys/BlockHitResult.<init> (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Z)V
      // 1cc: checkcast net/minecraft/world/phys/HitResult
      // 1cf: putfield net/minecraft/client/Minecraft.hitResult Lnet/minecraft/world/phys/HitResult;
      // 1d2: aload 2
      // 1d3: ifnonnull 2a6
      // 1d6: invokestatic me/octo/client/IlIIIIIIllIlllllIlIIIllIIlIIllIllIIIlIlIllIlllIlIIlIIllllllIIIlIlIIIIIIlIlIlllIlllIII.f ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 1d9: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 1dc: goto 1e3
      // 1df: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: ifeq 21d
      // 1e6: aload 0
      // 1e7: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 1ea: new net/minecraft/world/phys/BlockHitResult
      // 1ed: dup
      // 1ee: aload 3
      // 1ef: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()Lnet/minecraft/world/phys/Vec3;
      // 1f2: aload 0
      // 1f3: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 1f6: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1f9: dup
      // 1fa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1fd: invokevirtual net/minecraft/client/player/LocalPlayer.getYRot ()F
      // 200: f2d
      // 201: invokestatic net/minecraft/core/Direction.fromYRot (D)Lnet/minecraft/core/Direction;
      // 204: aload 3
      // 205: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/core/BlockPos;
      // 208: bipush 0
      // 209: invokespecial net/minecraft/world/phys/BlockHitResult.<init> (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Z)V
      // 20c: checkcast net/minecraft/world/phys/HitResult
      // 20f: putfield net/minecraft/client/Minecraft.hitResult Lnet/minecraft/world/phys/HitResult;
      // 212: aload 2
      // 213: ifnonnull 2a6
      // 216: goto 21d
      // 219: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21c: athrow
      // 21d: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;
      // 220: aload 3
      // 221: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()Lnet/minecraft/world/phys/Vec3;
      // 224: aload 0
      // 225: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 228: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 22b: dup
      // 22c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 22f: invokevirtual net/minecraft/client/player/LocalPlayer.blockInteractionRange ()D
      // 232: aconst_null
      // 233: aconst_null
      // 234: bipush 12
      // 236: aconst_null
      // 237: invokestatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.a (Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll;Lnet/minecraft/world/phys/Vec3;DLjava/util/List;Lnet/minecraft/world/phys/Vec3;ILjava/lang/Object;)Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 23a: astore 7
      // 23c: aload 7
      // 23e: aload 2
      // 23f: ifnull 25b
      // 242: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 245: getstatic me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 248: if_acmpne 2a6
      // 24b: goto 252
      // 24e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 251: athrow
      // 252: aload 7
      // 254: goto 25b
      // 257: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25a: athrow
      // 25b: invokevirtual me/octo/client/utils/llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()Lnet/minecraft/core/BlockPos;
      // 25e: aload 3
      // 25f: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/core/BlockPos;
      // 262: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 265: aload 2
      // 266: ifnull 2ac
      // 269: ifeq 2a6
      // 26c: goto 273
      // 26f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 272: athrow
      // 273: aload 0
      // 274: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 277: new net/minecraft/world/phys/BlockHitResult
      // 27a: dup
      // 27b: aload 3
      // 27c: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()Lnet/minecraft/world/phys/Vec3;
      // 27f: aload 0
      // 280: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 283: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 286: dup
      // 287: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 28a: invokevirtual net/minecraft/client/player/LocalPlayer.getYRot ()F
      // 28d: f2d
      // 28e: invokestatic net/minecraft/core/Direction.fromYRot (D)Lnet/minecraft/core/Direction;
      // 291: aload 3
      // 292: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lnet/minecraft/core/BlockPos;
      // 295: bipush 0
      // 296: invokespecial net/minecraft/world/phys/BlockHitResult.<init> (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Z)V
      // 299: checkcast net/minecraft/world/phys/HitResult
      // 29c: putfield net/minecraft/client/Minecraft.hitResult Lnet/minecraft/world/phys/HitResult;
      // 29f: goto 2a6
      // 2a2: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 2a9: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ae ()Z
      // 2ac: aload 2
      // 2ad: ifnull 2c1
      // 2b0: ifne 2bb
      // 2b3: goto 2ba
      // 2b6: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b9: athrow
      // 2ba: return
      // 2bb: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 2be: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ae ()Z
      // 2c1: ifne 31d
      // 2c4: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 2c7: dup
      // 2c8: getstatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 2cb: ldc_w 0.75
      // 2ce: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 2d1: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.o ()I
      // 2d4: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 2d7: astore 4
      // 2d9: aload 0
      // 2da: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll Ljava/util/List;
      // 2dd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2e2: astore 5
      // 2e4: aload 5
      // 2e6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2eb: ifeq 31d
      // 2ee: aload 5
      // 2f0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2f5: checkcast net/minecraft/core/BlockPos
      // 2f8: astore 6
      // 2fa: aload 6
      // 2fc: aconst_null
      // 2fd: aload 4
      // 2ff: ldc_w 1.5
      // 302: aconst_null
      // 303: aconst_null
      // 304: fconst_0
      // 305: bipush 0
      // 306: fconst_0
      // 307: sipush 498
      // 30a: aconst_null
      // 30b: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/core/BlockPos;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 30e: aload 2
      // 30f: ifnull 36f
      // 312: aload 2
      // 313: ifnonnull 2e4
      // 316: goto 31d
      // 319: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: aload 0
      // 31e: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Lnet/minecraft/world/phys/Vec3;
      // 321: dup
      // 322: ifnull 36e
      // 325: astore 6
      // 327: bipush 0
      // 328: istore 7
      // 32a: new net/minecraft/world/phys/AABB
      // 32d: dup
      // 32e: aload 6
      // 330: ldc2_w 0.05
      // 333: ldc2_w 0.05
      // 336: ldc2_w 0.05
      // 339: invokevirtual net/minecraft/world/phys/Vec3.subtract (DDD)Lnet/minecraft/world/phys/Vec3;
      // 33c: aload 6
      // 33e: ldc2_w 0.05
      // 341: ldc2_w 0.05
      // 344: ldc2_w 0.05
      // 347: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 34a: invokespecial net/minecraft/world/phys/AABB.<init> (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)V
      // 34d: aconst_null
      // 34e: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 351: dup
      // 352: getstatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 355: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.o ()I
      // 358: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 35b: ldc_w 1.5
      // 35e: aconst_null
      // 35f: aconst_null
      // 360: fconst_0
      // 361: bipush 0
      // 362: fconst_0
      // 363: sipush 498
      // 366: aconst_null
      // 367: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 36a: nop
      // 36b: goto 370
      // 36e: pop
      // 36f: nop
      // 370: aload 0
      // 371: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 374: dup
      // 375: ifnull 3cf
      // 378: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()Lnet/minecraft/world/phys/Vec3;
      // 37b: dup
      // 37c: ifnull 3cf
      // 37f: goto 386
      // 382: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 385: athrow
      // 386: astore 7
      // 388: bipush 0
      // 389: istore 8
      // 38b: new net/minecraft/world/phys/AABB
      // 38e: dup
      // 38f: aload 7
      // 391: ldc2_w 0.05
      // 394: ldc2_w 0.05
      // 397: ldc2_w 0.05
      // 39a: invokevirtual net/minecraft/world/phys/Vec3.subtract (DDD)Lnet/minecraft/world/phys/Vec3;
      // 39d: aload 7
      // 39f: ldc2_w 0.05
      // 3a2: ldc2_w 0.05
      // 3a5: ldc2_w 0.05
      // 3a8: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 3ab: invokespecial net/minecraft/world/phys/AABB.<init> (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)V
      // 3ae: aconst_null
      // 3af: aconst_null
      // 3b0: fconst_0
      // 3b1: aconst_null
      // 3b2: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 3b5: dup
      // 3b6: getstatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 3b9: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.o ()I
      // 3bc: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 3bf: ldc_w 12.0
      // 3c2: bipush 0
      // 3c3: fconst_0
      // 3c4: sipush 414
      // 3c7: aconst_null
      // 3c8: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/world/phys/AABB;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 3cb: nop
      // 3cc: goto 3d1
      // 3cf: pop
      // 3d0: nop
      // 3d1: return
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI param1) {
      String disc = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(param1, "e");
      if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m() && me.octo.client.lIIllIlllllIlIIlIlIIIlIlIllIllIIIlIIlIIIIIlllIllIIIllIIlIIllIlIlIIIIlllIlIIlIIlIIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.aA()) {
         if (disc != null && this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null) {
            this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII + 1;
         }
      }
   }

   @NotNull
   protected final List<RemotePlayer> a(double param1, int param3) {
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player == null) return CollectionsKt.emptyList();
      LocalPlayer var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player;
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.level == null) return CollectionsKt.emptyList();
      ClientLevel var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.level;
      Vec3 var7 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var5);
      var var8 = new ArrayList();
      for (Object var9 : var6.players()) { if (var9 instanceof RemotePlayer) var8.add((RemotePlayer)var9); }
      var var10 = new ArrayList();
      for (Object var11 : var8) { RemotePlayer var12 = (RemotePlayer)var11; if (var12.getId() != var5.getId() && var12.isAlive() && this.a(var12) && var12.distanceToSqr(var7) <= param1 * param1) var10.add(var12); }
      Iterable var13 = var10;
      return CollectionsKt.take(CollectionsKt.sortedWith(var13, new me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(var7)), param3);
   }

   @NotNull
   protected final List<RemotePlayer> K() {

      List list;
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll iIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll;
      block13: {
          block14: {
              long l;
              String string;
              block12: {
                  block11: {
                      string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
                      try {
                          LocalPlayer localPlayer;
                          try {
                              if (string == null || (localPlayer = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player) == null) break block11;
                          }
                          catch (NoSuchElementException noSuchElementException) {
                              throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                          }
                          l = localPlayer.tickCount;
                          break block12;
                      }
                      catch (NoSuchElementException noSuchElementException) {
                          throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                      }
                  }
                  l = 0L;
              }
              long l2 = l;
              try {
                  try {
                      iIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll = this;
                      if (string == null) break block13;
                      if (iIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll == l2) break block14;
                  }
                  catch (NoSuchElementException noSuchElementException) {
                      throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                  }
                  this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = this.a(10.0, 3);
                  this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = l2;
              }
              catch (NoSuchElementException noSuchElementException) {
                  throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
              }
          }
          iIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll = this;
      }
      try {
          list = iIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
          if (list == null) {
              list = CollectionsKt.emptyList();
          }
      }
      catch (NoSuchElementException noSuchElementException) {
          throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
      }
      return list;

   }

   protected final double a(@NotNull Vec3 param1, double param2, double param4) {
      Intrinsics.checkNotNullParameter(param1, "center");
      String string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      double d = param2;
      for (RemotePlayer remotePlayer : this.K()) {
         double d2 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)remotePlayer));
         if (Math.abs(d2 - param2) <= 4.0) d += (4.0 - d2) * param4;
      }
      return d;
   }

   private final boolean a(RemotePlayer param1) {
      String string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      String string2 = param1.getName().getString().toLowerCase(java.util.Locale.ROOT);
      return kotlin.text.StringsKt.contains((CharSequence)string2, (CharSequence)"goblin", false) || kotlin.text.StringsKt.contains((CharSequence)string2, (CharSequence)"knifethrower", false) || kotlin.text.StringsKt.contains((CharSequence)string2, (CharSequence)"fireslinger", false);
   }

   @Nullable
   protected final LocalPlayer L() {
      String string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      LocalPlayer localPlayer = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player;
      if (localPlayer == null) return null;
      net.minecraft.world.entity.Entity entity = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.crosshairPickEntity;
      if (entity instanceof LocalPlayer) {
         LocalPlayer localPlayer2 = (LocalPlayer)entity;
         if (localPlayer2.getId() != localPlayer.getId() && (!(entity instanceof RemotePlayer) || !this.a((RemotePlayer)entity))) {
            return localPlayer2;
         }
      }
      return null;
   }

   private final boolean M() {
      String var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      LocalPlayer var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player;
      if (var2 == null) { return false; }
      boolean var3 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == null;
      Vec3 var4 = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var2.getYRot(), 0.0F).c();
      for (RemotePlayer var9 : this.K()) {
         double var11 = var9.distanceToSqr((net.minecraft.world.entity.Entity)var2);
         if (var11 < 0.0625D) { return true; }
         if (var11 >= 1.0D) { continue; }
         if (var3) { return true; }
         Vec3 var13 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var9).subtract(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var2));
         if (var13.lengthSqr() < 1.0E-6D) { return true; }
         if (var13.normalize().dot(var4) > 0.5D) { return true; }
      }
      return false;
   }

   public final boolean N() {

      boolean bl;
      block14: {
          boolean bl2;
          block15: {
              boolean bl3;
              String string;
              block12: {
                  block13: {
                      string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
                      try {
                          try {
                              bl3 = this.M();
                              if (string == null) break block12;
                              if (bl3) break block13;
                          }
                          catch (NoSuchElementException noSuchElementException) {
                              throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                          }
                          this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.f();
                      }
                      catch (NoSuchElementException noSuchElementException) {
                          throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                      }
                  }
                  bl3 = this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.a((Number)150);
              }
              bl2 = bl3;
              try {
                  try {
                      try {
                          try {
                              bl = bl2;
                              if (string == null) break block14;
                              if (!bl) break block15;
                          }
                          catch (NoSuchElementException noSuchElementException) {
                              throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                          }
                          bl = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
                          if (string == null) break block14;
                      }
                      catch (NoSuchElementException noSuchElementException) {
                          throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                      }
                      if (bl) break block15;
                  }
                  catch (NoSuchElementException noSuchElementException) {
                      throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                  }
                  this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = true;
                  this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.f();
                  this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.f();
                  this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = null;
                  this.i(false);
              }
              catch (NoSuchElementException noSuchElementException) {
                  throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
              }
          }
          bl = bl2;
      }
      return bl;

   }

   public final boolean O() {
      String var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      LocalPlayer var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player;
      List<RemotePlayer> var3 = this.K();
      boolean var4;
      if (var2 != null) {
         boolean var7 = true;
         for (RemotePlayer var9 : var3) {
            if (var9.distanceToSqr((net.minecraft.world.entity.Entity)var2) > 2.25D) { continue; }
            var7 = false;
            break;
         }
         var4 = var7;
      } else {
         var4 = false;
      }
      if (this.M()) { this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.f(); }
      boolean var5 = var4 || (this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.a(Integer.valueOf(100)) && this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.a(Integer.valueOf(1000)));
      if (var5) {
         this.i(false);
         this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
         this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = null;
         this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = null;
         this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = null;
         this.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = 0;
         this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.clear();
         this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI.f();
      }
      return var5;
   }

   public final void c(@NotNull List<? extends Vec3> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 003: aload 1
      // 004: sipush -21452
      // 007: sipush -12714
      // 00a: pop2
      // 00b: ldc_w "walkPoints"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: astore 2
      // 012: aload 2
      // 013: ifnull 030
      // 016: aload 0
      // 017: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lnet/minecraft/client/Minecraft;
      // 01a: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 01d: dup
      // 01e: ifnonnull 031
      // 021: goto 028
      // 024: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: pop
      // 029: goto 030
      // 02c: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: return
      // 031: astore 3
      // 032: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 035: sipush -21485
      // 038: sipush 22590
      // 03b: pop2
      // 03c: ldc_w "sneak"
      // 03f: bipush 1
      // 040: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 043: aload 0
      // 044: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 047: aload 2
      // 048: ifnull 0a2
      // 04b: sipush 500
      // 04e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 051: checkcast java/lang/Number
      // 054: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 057: ifne 097
      // 05a: goto 061
      // 05d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: aload 0
      // 062: aload 2
      // 063: ifnull 79d
      // 066: goto 06d
      // 069: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lnet/minecraft/world/phys/Vec3;
      // 070: ifnull 79c
      // 073: goto 07a
      // 076: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 079: athrow
      // 07a: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 07d: aload 0
      // 07e: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lnet/minecraft/world/phys/Vec3;
      // 081: dup
      // 082: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 085: bipush 0
      // 086: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Z)D
      // 089: ldc2_w 0.5
      // 08c: dcmpg
      // 08d: ifge 79c
      // 090: goto 097
      // 093: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 0
      // 098: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 09b: goto 0a2
      // 09e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0a5: aload 0
      // 0a6: invokevirtual me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.K ()Ljava/util/List;
      // 0a9: astore 4
      // 0ab: aload 4
      // 0ad: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/util/List;)Ljava/lang/Object;
      // 0b0: checkcast net/minecraft/client/player/RemotePlayer
      // 0b3: astore 5
      // 0b5: aload 2
      // 0b6: ifnull 0eb
      // 0b9: aload 5
      // 0bb: dup
      // 0bc: ifnull 0e3
      // 0bf: goto 0c6
      // 0c2: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: astore 9
      // 0c8: bipush 0
      // 0c9: istore 10
      // 0cb: aload 2
      // 0cc: ifnull 0eb
      // 0cf: aload 9
      // 0d1: checkcast net/minecraft/world/entity/Entity
      // 0d4: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 0d7: nop
      // 0d8: dup
      // 0d9: ifnonnull 0ec
      // 0dc: goto 0e3
      // 0df: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: pop
      // 0e4: goto 0eb
      // 0e7: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: return
      // 0ec: astore 6
      // 0ee: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 0f1: aload 6
      // 0f3: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 0f6: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 0f9: fconst_0
      // 0fa: fcmpg
      // 0fb: ifge 108
      // 0fe: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 101: goto 10b
      // 104: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 10b: astore 7
      // 10d: aload 3
      // 10e: checkcast net/minecraft/world/entity/Entity
      // 111: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 114: astore 8
      // 116: aload 1
      // 117: checkcast java/lang/Iterable
      // 11a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 11f: astore 13
      // 121: aload 13
      // 123: aload 2
      // 124: ifnull 145
      // 127: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 12c: ifne 13e
      // 12f: goto 136
      // 132: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: aconst_null
      // 137: goto 199
      // 13a: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: aload 13
      // 140: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 145: checkcast net/minecraft/world/phys/Vec3
      // 148: astore 14
      // 14a: bipush 0
      // 14b: istore 15
      // 14d: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 150: aload 14
      // 152: bipush 0
      // 153: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Z)D
      // 156: dstore 16
      // 158: aload 13
      // 15a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15f: ifeq 194
      // 162: aload 13
      // 164: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 169: checkcast net/minecraft/world/phys/Vec3
      // 16c: astore 19
      // 16e: bipush 0
      // 16f: istore 21
      // 171: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 174: aload 19
      // 176: bipush 0
      // 177: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Z)D
      // 17a: dstore 22
      // 17c: dload 16
      // 17e: dload 22
      // 180: invokestatic java/lang/Math.min (DD)D
      // 183: dstore 16
      // 185: aload 2
      // 186: ifnull 1a8
      // 189: aload 2
      // 18a: ifnonnull 158
      // 18d: goto 194
      // 190: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 193: athrow
      // 194: dload 16
      // 196: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 199: dup
      // 19a: ifnull 1a7
      // 19d: invokevirtual java/lang/Double.doubleValue ()D
      // 1a0: goto 1ab
      // 1a3: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6: athrow
      // 1a7: pop
      // 1a8: ldc2_w 1.7976931348623157E308
      // 1ab: dstore 9
      // 1ad: aload 2
      // 1ae: ifnull 62e
      // 1b1: dload 9
      // 1b3: ldc2_w 2.0
      // 1b6: dcmpl
      // 1b7: ifle 628
      // 1ba: goto 1c1
      // 1bd: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 1c5: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 1c8: aload 1
      // 1c9: checkcast java/lang/Iterable
      // 1cc: astore 12
      // 1ce: nop
      // 1cf: bipush 0
      // 1d0: istore 13
      // 1d2: aload 12
      // 1d4: astore 14
      // 1d6: new java/util/ArrayList
      // 1d9: dup
      // 1da: invokespecial java/util/ArrayList.<init> ()V
      // 1dd: checkcast java/util/Collection
      // 1e0: astore 15
      // 1e2: bipush 0
      // 1e3: istore 16
      // 1e5: aload 14
      // 1e7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1ec: astore 18
      // 1ee: aload 18
      // 1f0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f5: ifeq 319
      // 1f8: aload 18
      // 1fa: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1ff: astore 19
      // 201: aload 19
      // 203: checkcast net/minecraft/world/phys/Vec3
      // 206: astore 21
      // 208: bipush 0
      // 209: istore 22
      // 20b: aload 21
      // 20d: getfield net/minecraft/world/phys/Vec3.x D
      // 210: aload 21
      // 212: getfield net/minecraft/world/phys/Vec3.y D
      // 215: dconst_1
      // 216: dsub
      // 217: aload 21
      // 219: getfield net/minecraft/world/phys/Vec3.z D
      // 21c: invokestatic net/minecraft/core/BlockPos.containing (DDD)Lnet/minecraft/core/BlockPos;
      // 21f: dup
      // 220: sipush -21425
      // 223: sipush 28620
      // 226: pop2
      // 227: ldc_w "containing(...)"
      // 22a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 22d: astore 23
      // 22f: aload 0
      // 230: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Ljava/util/ArrayList;
      // 233: aload 23
      // 235: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 238: aload 2
      // 239: ifnull 326
      // 23c: aload 2
      // 23d: ifnull 265
      // 240: goto 247
      // 243: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 246: athrow
      // 247: ifne 307
      // 24a: goto 251
      // 24d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 254: aload 21
      // 256: bipush 0
      // 257: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Z)D
      // 25a: ldc2_w 2.5
      // 25d: dcmpl
      // 25e: goto 265
      // 261: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 264: athrow
      // 265: ifle 307
      // 268: aload 4
      // 26a: checkcast java/lang/Iterable
      // 26d: astore 24
      // 26f: bipush 0
      // 270: istore 25
      // 272: aload 24
      // 274: aload 2
      // 275: ifnull 2ae
      // 278: instanceof java/util/Collection
      // 27b: ifeq 2ac
      // 27e: goto 285
      // 281: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 284: athrow
      // 285: aload 24
      // 287: checkcast java/util/Collection
      // 28a: aload 2
      // 28b: ifnull 2ae
      // 28e: goto 295
      // 291: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 294: athrow
      // 295: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 29a: ifeq 2ac
      // 29d: goto 2a4
      // 2a0: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a3: athrow
      // 2a4: bipush 1
      // 2a5: goto 2fc
      // 2a8: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ab: athrow
      // 2ac: aload 24
      // 2ae: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2b3: astore 26
      // 2b5: aload 26
      // 2b7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2bc: ifeq 2fb
      // 2bf: aload 26
      // 2c1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c6: astore 27
      // 2c8: aload 27
      // 2ca: checkcast net/minecraft/client/player/RemotePlayer
      // 2cd: astore 28
      // 2cf: bipush 0
      // 2d0: istore 29
      // 2d2: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 2d5: aload 21
      // 2d7: aload 28
      // 2d9: checkcast net/minecraft/world/entity/Entity
      // 2dc: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 2df: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 2e2: dconst_1
      // 2e3: dcmpg
      // 2e4: aload 2
      // 2e5: ifnull 2ec
      // 2e8: ifge 2ef
      // 2eb: bipush 1
      // 2ec: goto 2f0
      // 2ef: bipush 0
      // 2f0: ifeq 2b5
      // 2f3: bipush 0
      // 2f4: aload 2
      // 2f5: ifnull 2e4
      // 2f8: goto 2fc
      // 2fb: bipush 1
      // 2fc: ifeq 307
      // 2ff: bipush 1
      // 300: goto 308
      // 303: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 306: athrow
      // 307: bipush 0
      // 308: ifeq 1ee
      // 30b: aload 15
      // 30d: aload 19
      // 30f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 314: pop
      // 315: aload 2
      // 316: ifnonnull 1ee
      // 319: aload 15
      // 31b: checkcast java/util/List
      // 31e: nop
      // 31f: checkcast java/lang/Iterable
      // 322: astore 12
      // 324: nop
      // 325: bipush 0
      // 326: istore 13
      // 328: aload 12
      // 32a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 32f: astore 14
      // 331: aload 14
      // 333: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 338: aload 2
      // 339: ifnull 369
      // 33c: ifne 34e
      // 33f: goto 346
      // 342: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 345: athrow
      // 346: aconst_null
      // 347: goto 3cc
      // 34a: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34d: athrow
      // 34e: aload 14
      // 350: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 355: astore 15
      // 357: aload 14
      // 359: aload 2
      // 35a: ifnull 377
      // 35d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 362: goto 369
      // 365: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 368: athrow
      // 369: ifne 375
      // 36c: aload 15
      // 36e: goto 3cc
      // 371: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 374: athrow
      // 375: aload 15
      // 377: checkcast net/minecraft/world/phys/Vec3
      // 37a: astore 16
      // 37c: bipush 0
      // 37d: istore 18
      // 37f: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 382: aload 16
      // 384: aload 6
      // 386: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 389: dstore 16
      // 38b: aload 14
      // 38d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 392: astore 18
      // 394: aload 18
      // 396: checkcast net/minecraft/world/phys/Vec3
      // 399: astore 19
      // 39b: bipush 0
      // 39c: istore 21
      // 39e: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 3a1: aload 19
      // 3a3: aload 6
      // 3a5: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 3a8: dstore 19
      // 3aa: dload 16
      // 3ac: dload 19
      // 3ae: invokestatic java/lang/Double.compare (DD)I
      // 3b1: ifge 3bc
      // 3b4: aload 18
      // 3b6: astore 15
      // 3b8: dload 19
      // 3ba: dstore 16
      // 3bc: aload 14
      // 3be: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3c3: ifne 38b
      // 3c6: aload 2
      // 3c7: ifnull 3b8
      // 3ca: aload 15
      // 3cc: checkcast net/minecraft/world/phys/Vec3
      // 3cf: astore 11
      // 3d1: aload 11
      // 3d3: aload 2
      // 3d4: ifnull 5a1
      // 3d7: ifnonnull 59f
      // 3da: goto 3e1
      // 3dd: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e0: athrow
      // 3e1: aload 0
      // 3e2: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Ljava/util/ArrayList;
      // 3e5: invokevirtual java/util/ArrayList.clear ()V
      // 3e8: aload 1
      // 3e9: checkcast java/lang/Iterable
      // 3ec: astore 12
      // 3ee: nop
      // 3ef: bipush 0
      // 3f0: istore 13
      // 3f2: aload 12
      // 3f4: astore 14
      // 3f6: new java/util/ArrayList
      // 3f9: dup
      // 3fa: invokespecial java/util/ArrayList.<init> ()V
      // 3fd: checkcast java/util/Collection
      // 400: astore 15
      // 402: bipush 0
      // 403: istore 16
      // 405: aload 14
      // 407: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 40c: astore 18
      // 40e: aload 18
      // 410: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 415: ifeq 4e7
      // 418: aload 18
      // 41a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 41f: astore 19
      // 421: aload 19
      // 423: checkcast net/minecraft/world/phys/Vec3
      // 426: astore 21
      // 428: bipush 0
      // 429: istore 22
      // 42b: aload 4
      // 42d: checkcast java/lang/Iterable
      // 430: astore 23
      // 432: bipush 0
      // 433: istore 24
      // 435: aload 23
      // 437: aload 2
      // 438: ifnull 47c
      // 43b: instanceof java/util/Collection
      // 43e: aload 2
      // 43f: ifnull 4f4
      // 442: goto 449
      // 445: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 448: athrow
      // 449: ifeq 47a
      // 44c: goto 453
      // 44f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 452: athrow
      // 453: aload 23
      // 455: checkcast java/util/Collection
      // 458: aload 2
      // 459: ifnull 47c
      // 45c: goto 463
      // 45f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 462: athrow
      // 463: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 468: ifeq 47a
      // 46b: goto 472
      // 46e: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 471: athrow
      // 472: bipush 1
      // 473: goto 4ca
      // 476: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 479: athrow
      // 47a: aload 23
      // 47c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 481: astore 25
      // 483: aload 25
      // 485: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 48a: ifeq 4c9
      // 48d: aload 25
      // 48f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 494: astore 26
      // 496: aload 26
      // 498: checkcast net/minecraft/client/player/RemotePlayer
      // 49b: astore 27
      // 49d: bipush 0
      // 49e: istore 28
      // 4a0: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 4a3: aload 21
      // 4a5: aload 27
      // 4a7: checkcast net/minecraft/world/entity/Entity
      // 4aa: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 4ad: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 4b0: dconst_1
      // 4b1: dcmpg
      // 4b2: aload 2
      // 4b3: ifnull 4ba
      // 4b6: ifge 4bd
      // 4b9: bipush 1
      // 4ba: goto 4be
      // 4bd: bipush 0
      // 4be: ifeq 483
      // 4c1: bipush 0
      // 4c2: aload 2
      // 4c3: ifnull 4b2
      // 4c6: goto 4ca
      // 4c9: bipush 1
      // 4ca: nop
      // 4cb: aload 2
      // 4cc: ifnull 4e2
      // 4cf: ifeq 40e
      // 4d2: goto 4d9
      // 4d5: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d8: athrow
      // 4d9: aload 15
      // 4db: aload 19
      // 4dd: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 4e2: pop
      // 4e3: aload 2
      // 4e4: ifnonnull 40e
      // 4e7: aload 15
      // 4e9: checkcast java/util/List
      // 4ec: nop
      // 4ed: checkcast java/lang/Iterable
      // 4f0: astore 12
      // 4f2: nop
      // 4f3: bipush 0
      // 4f4: istore 13
      // 4f6: aload 12
      // 4f8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 4fd: astore 14
      // 4ff: aload 14
      // 501: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 506: aload 2
      // 507: ifnull 537
      // 50a: ifne 51c
      // 50d: goto 514
      // 510: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 513: athrow
      // 514: aconst_null
      // 515: goto 59a
      // 518: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51b: athrow
      // 51c: aload 14
      // 51e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 523: astore 15
      // 525: aload 14
      // 527: aload 2
      // 528: ifnull 545
      // 52b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 530: goto 537
      // 533: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 536: athrow
      // 537: ifne 543
      // 53a: aload 15
      // 53c: goto 59a
      // 53f: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 542: athrow
      // 543: aload 15
      // 545: checkcast net/minecraft/world/phys/Vec3
      // 548: astore 16
      // 54a: bipush 0
      // 54b: istore 18
      // 54d: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 550: aload 16
      // 552: aload 6
      // 554: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 557: dstore 16
      // 559: aload 14
      // 55b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 560: astore 18
      // 562: aload 18
      // 564: checkcast net/minecraft/world/phys/Vec3
      // 567: astore 19
      // 569: bipush 0
      // 56a: istore 21
      // 56c: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 56f: aload 19
      // 571: aload 6
      // 573: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 576: dstore 19
      // 578: dload 16
      // 57a: dload 19
      // 57c: invokestatic java/lang/Double.compare (DD)I
      // 57f: ifge 58a
      // 582: aload 18
      // 584: astore 15
      // 586: dload 19
      // 588: dstore 16
      // 58a: aload 14
      // 58c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 591: ifne 559
      // 594: aload 2
      // 595: ifnull 586
      // 598: aload 15
      // 59a: checkcast net/minecraft/world/phys/Vec3
      // 59d: astore 11
      // 59f: aload 11
      // 5a1: aload 2
      // 5a2: ifnull 5d6
      // 5a5: ifnull 791
      // 5a8: goto 5af
      // 5ab: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ae: athrow
      // 5af: aload 0
      // 5b0: aload 11
      // 5b2: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lnet/minecraft/world/phys/Vec3;
      // 5b5: aload 0
      // 5b6: getstatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 5b9: aload 0
      // 5ba: aload 11
      // 5bc: invokespecial me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.b (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/core/BlockPos;
      // 5bf: aconst_null
      // 5c0: bipush 2
      // 5c1: aconst_null
      // 5c2: invokestatic me/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a (Lme/octo/client/utils/player/pathfinder/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;ILjava/lang/Object;)Ljava/util/ArrayList;
      // 5c5: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Ljava/util/ArrayList;
      // 5c8: aload 0
      // 5c9: bipush 1
      // 5ca: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI I
      // 5cd: aload 11
      // 5cf: goto 5d6
      // 5d2: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d5: athrow
      // 5d6: getfield net/minecraft/world/phys/Vec3.x D
      // 5d9: aload 11
      // 5db: getfield net/minecraft/world/phys/Vec3.y D
      // 5de: dconst_1
      // 5df: dsub
      // 5e0: aload 11
      // 5e2: getfield net/minecraft/world/phys/Vec3.z D
      // 5e5: invokestatic net/minecraft/core/BlockPos.containing (DDD)Lnet/minecraft/core/BlockPos;
      // 5e8: dup
      // 5e9: sipush -21425
      // 5ec: sipush 28620
      // 5ef: pop2
      // 5f0: ldc_w "containing(...)"
      // 5f3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 5f6: astore 12
      // 5f8: aload 0
      // 5f9: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Ljava/util/ArrayList;
      // 5fc: invokevirtual java/util/ArrayList.size ()I
      // 5ff: bipush 3
      // 600: if_icmple 61b
      // 603: aload 0
      // 604: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Ljava/util/ArrayList;
      // 607: bipush 0
      // 608: invokevirtual java/util/ArrayList.remove (I)Ljava/lang/Object;
      // 60b: pop
      // 60c: aload 2
      // 60d: ifnull 625
      // 610: aload 2
      // 611: ifnonnull 5f8
      // 614: goto 61b
      // 617: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61a: athrow
      // 61b: aload 0
      // 61c: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Ljava/util/ArrayList;
      // 61f: aload 12
      // 621: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 624: pop
      // 625: goto 791
      // 628: aload 0
      // 629: aload 7
      // 62b: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 62e: aload 1
      // 62f: checkcast java/lang/Iterable
      // 632: astore 12
      // 634: bipush 0
      // 635: istore 13
      // 637: aload 12
      // 639: instanceof java/util/Collection
      // 63c: aload 2
      // 63d: ifnull 672
      // 640: ifeq 671
      // 643: goto 64a
      // 646: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 649: athrow
      // 64a: aload 12
      // 64c: checkcast java/util/Collection
      // 64f: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 654: aload 2
      // 655: ifnull 672
      // 658: goto 65f
      // 65b: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65e: athrow
      // 65f: ifeq 671
      // 662: goto 669
      // 665: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 668: athrow
      // 669: bipush 0
      // 66a: goto 6e9
      // 66d: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 670: athrow
      // 671: bipush 0
      // 672: istore 14
      // 674: aload 12
      // 676: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 67b: astore 15
      // 67d: aload 15
      // 67f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 684: ifeq 6e7
      // 687: aload 15
      // 689: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 68e: astore 16
      // 690: aload 16
      // 692: checkcast net/minecraft/world/phys/Vec3
      // 695: astore 18
      // 697: bipush 0
      // 698: istore 19
      // 69a: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 69d: aload 18
      // 69f: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 6a2: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 6a5: invokestatic java/lang/Math.abs (F)F
      // 6a8: ldc_w 85.0
      // 6ab: fcmpg
      // 6ac: aload 2
      // 6ad: ifnull 6e9
      // 6b0: aload 2
      // 6b1: ifnull 6c6
      // 6b4: goto 6bb
      // 6b7: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6ba: athrow
      // 6bb: ifge 6c9
      // 6be: goto 6c5
      // 6c1: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c4: athrow
      // 6c5: bipush 1
      // 6c6: goto 6ca
      // 6c9: bipush 0
      // 6ca: ifeq 67d
      // 6cd: iinc 14 1
      // 6d0: aload 2
      // 6d1: ifnull 6e3
      // 6d4: iload 14
      // 6d6: ifge 67d
      // 6d9: goto 6e0
      // 6dc: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6df: athrow
      // 6e0: invokestatic kotlin/collections/CollectionsKt.throwCountOverflow ()V
      // 6e3: aload 2
      // 6e4: ifnonnull 67d
      // 6e7: iload 14
      // 6e9: istore 11
      // 6eb: aload 3
      // 6ec: invokevirtual net/minecraft/client/player/LocalPlayer.getYRot ()F
      // 6ef: fstore 12
      // 6f1: aload 0
      // 6f2: iload 11
      // 6f4: aload 1
      // 6f5: invokeinterface java/util/List.size ()I 1
      // 6fa: iload 11
      // 6fc: isub
      // 6fd: if_icmplt 744
      // 700: new me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI
      // 703: dup
      // 704: fload 12
      // 706: fconst_0
      // 707: invokespecial me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.<init> (FF)V
      // 70a: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.c ()Lnet/minecraft/world/phys/Vec3;
      // 70d: ldc2_w 2.0
      // 710: invokevirtual net/minecraft/world/phys/Vec3.scale (D)Lnet/minecraft/world/phys/Vec3;
      // 713: dup
      // 714: sipush -21484
      // 717: sipush 11757
      // 71a: pop2
      // 71b: ldc_w "scale(...)"
      // 71e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 721: astore 13
      // 723: aload 8
      // 725: aload 13
      // 727: getfield net/minecraft/world/phys/Vec3.x D
      // 72a: dconst_0
      // 72b: aload 13
      // 72d: getfield net/minecraft/world/phys/Vec3.z D
      // 730: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 733: aload 13
      // 735: getfield net/minecraft/world/phys/Vec3.x D
      // 738: dconst_0
      // 739: aload 13
      // 73b: getfield net/minecraft/world/phys/Vec3.z D
      // 73e: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 741: goto 789
      // 744: new me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI
      // 747: dup
      // 748: fload 12
      // 74a: ldc_w 180.0
      // 74d: fadd
      // 74e: fconst_0
      // 74f: invokespecial me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.<init> (FF)V
      // 752: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.c ()Lnet/minecraft/world/phys/Vec3;
      // 755: ldc2_w 2.0
      // 758: invokevirtual net/minecraft/world/phys/Vec3.scale (D)Lnet/minecraft/world/phys/Vec3;
      // 75b: dup
      // 75c: sipush -21494
      // 75f: sipush 31674
      // 762: pop2
      // 763: ldc_w "scale(...)"
      // 766: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 769: astore 13
      // 76b: aload 8
      // 76d: aload 13
      // 76f: getfield net/minecraft/world/phys/Vec3.x D
      // 772: dconst_0
      // 773: aload 13
      // 775: getfield net/minecraft/world/phys/Vec3.z D
      // 778: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 77b: aload 13
      // 77d: getfield net/minecraft/world/phys/Vec3.x D
      // 780: dconst_0
      // 781: aload 13
      // 783: getfield net/minecraft/world/phys/Vec3.z D
      // 786: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 789: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lnet/minecraft/world/phys/Vec3;
      // 78c: aload 0
      // 78d: aconst_null
      // 78e: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Ljava/util/ArrayList;
      // 791: aload 0
      // 792: aload 3
      // 793: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll;Lnet/minecraft/client/player/LocalPlayer;)V
      // 796: getstatic me/octo/client/utils/player/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 799: invokevirtual me/octo/client/utils/player/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.g ()V
      // 79c: aload 0
      // 79d: aload 2
      // 79e: ifnull 8ea
      // 7a1: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 7a4: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 7a7: if_acmpne 8e2
      // 7aa: goto 7b1
      // 7ad: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b0: athrow
      // 7b1: aload 0
      // 7b2: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lnet/minecraft/world/phys/Vec3;
      // 7b5: astore 4
      // 7b7: aload 0
      // 7b8: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Ljava/util/ArrayList;
      // 7bb: astore 5
      // 7bd: aload 4
      // 7bf: aload 2
      // 7c0: ifnull 8c5
      // 7c3: ifnull 8bc
      // 7c6: goto 7cd
      // 7c9: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7cc: athrow
      // 7cd: aload 5
      // 7cf: ifnull 8bc
      // 7d2: goto 7d9
      // 7d5: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d8: athrow
      // 7d9: aload 0
      // 7da: aload 2
      // 7db: ifnull 818
      // 7de: goto 7e5
      // 7e1: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e4: athrow
      // 7e5: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI I
      // 7e8: aload 5
      // 7ea: checkcast java/util/List
      // 7ed: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 7f0: if_icmpgt 8bc
      // 7f3: goto 7fa
      // 7f6: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f9: athrow
      // 7fa: aload 5
      // 7fc: aload 0
      // 7fd: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI I
      // 800: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 803: dup
      // 804: sipush -21504
      // 807: sipush 21538
      // 80a: pop2
      // 80b: ldc_w "get(...)"
      // 80e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 811: goto 818
      // 814: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 817: athrow
      // 818: checkcast net/minecraft/world/phys/Vec3
      // 81b: astore 6
      // 81d: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 820: aload 6
      // 822: aload 3
      // 823: checkcast net/minecraft/world/entity/Entity
      // 826: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 829: ldc2_w 0.2
      // 82c: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 82f: aload 2
      // 830: ifnull 84f
      // 833: ifeq 84b
      // 836: goto 83d
      // 839: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83c: athrow
      // 83d: aload 0
      // 83e: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI I
      // 841: istore 7
      // 843: aload 0
      // 844: iload 7
      // 846: bipush 1
      // 847: iadd
      // 848: putfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI I
      // 84b: aload 0
      // 84c: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI I
      // 84f: aload 5
      // 851: checkcast java/util/List
      // 854: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 857: if_icmpgt 8a6
      // 85a: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 85d: aload 5
      // 85f: aload 0
      // 860: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI I
      // 863: bipush 1
      // 864: isub
      // 865: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 868: dup
      // 869: sipush -21504
      // 86c: sipush 21538
      // 86f: pop2
      // 870: ldc_w "get(...)"
      // 873: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 876: checkcast net/minecraft/world/phys/Vec3
      // 879: aload 5
      // 87b: aload 0
      // 87c: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI I
      // 87f: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 882: dup
      // 883: sipush -21504
      // 886: sipush 21538
      // 889: pop2
      // 88a: ldc_w "get(...)"
      // 88d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 890: checkcast net/minecraft/world/phys/Vec3
      // 893: bipush 1
      // 894: dconst_0
      // 895: bipush 8
      // 897: aconst_null
      // 898: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZDILjava/lang/Object;)V
      // 89b: aload 2
      // 89c: ifnonnull 9a4
      // 89f: goto 8a6
      // 8a2: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a5: athrow
      // 8a6: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 8a9: aload 4
      // 8ab: bipush 0
      // 8ac: bipush 2
      // 8ad: aconst_null
      // 8ae: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)V
      // 8b1: aload 2
      // 8b2: ifnonnull 9a4
      // 8b5: goto 8bc
      // 8b8: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8bb: athrow
      // 8bc: aload 4
      // 8be: goto 8c5
      // 8c1: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c4: athrow
      // 8c5: dup
      // 8c6: ifnull 8dc
      // 8c9: astore 7
      // 8cb: bipush 0
      // 8cc: istore 8
      // 8ce: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 8d1: aload 7
      // 8d3: bipush 0
      // 8d4: bipush 2
      // 8d5: aconst_null
      // 8d6: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;ZILjava/lang/Object;)V
      // 8d9: goto 9a4
      // 8dc: pop
      // 8dd: nop
      // 8de: aload 2
      // 8df: ifnonnull 9a4
      // 8e2: aload 0
      // 8e3: goto 8ea
      // 8e6: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e9: athrow
      // 8ea: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lnet/minecraft/world/phys/Vec3;
      // 8ed: dup
      // 8ee: ifnull 95c
      // 8f1: astore 6
      // 8f3: bipush 0
      // 8f4: istore 7
      // 8f6: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 8f9: aload 6
      // 8fb: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 8fe: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 901: invokestatic java/lang/Math.abs (F)F
      // 904: fstore 8
      // 906: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 909: sipush -21455
      // 90c: sipush 6185
      // 90f: pop2
      // 910: ldc_w "forward"
      // 913: fload 8
      // 915: ldc_w 70.0
      // 918: fcmpg
      // 919: aload 2
      // 91a: ifnull 928
      // 91d: ifge 92b
      // 920: goto 927
      // 923: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 926: athrow
      // 927: bipush 1
      // 928: goto 92c
      // 92b: bipush 0
      // 92c: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 92f: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 932: sipush -21447
      // 935: sipush 12172
      // 938: pop2
      // 939: ldc_w "backward"
      // 93c: fload 8
      // 93e: ldc_w 110.0
      // 941: fcmpl
      // 942: aload 2
      // 943: ifnull 951
      // 946: ifle 954
      // 949: goto 950
      // 94c: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 94f: athrow
      // 950: bipush 1
      // 951: goto 955
      // 954: bipush 0
      // 955: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 958: nop
      // 959: goto 95e
      // 95c: pop
      // 95d: nop
      // 95e: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 961: sipush -21477
      // 964: sipush 26878
      // 967: pop2
      // 968: ldc_w "left"
      // 96b: aload 0
      // 96c: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 96f: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 972: if_acmpne 97d
      // 975: bipush 1
      // 976: goto 97e
      // 979: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97c: athrow
      // 97d: bipush 0
      // 97e: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 981: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 984: sipush -21498
      // 987: sipush 5914
      // 98a: pop2
      // 98b: ldc_w "right"
      // 98e: aload 0
      // 98f: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 992: getstatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 995: if_acmpne 9a0
      // 998: bipush 1
      // 999: goto 9a1
      // 99c: invokestatic me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99f: athrow
      // 9a0: bipush 0
      // 9a1: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 9a4: aload 0
      // 9a5: getfield me/octo/client/IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 9a8: dup
      // 9a9: ifnull 9ba
      // 9ac: astore 6
      // 9ae: bipush 0
      // 9af: istore 7
      // 9b1: aload 6
      // 9b3: invokestatic me/octo/client/utils/player/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;)Lme/octo/client/utils/player/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 9b6: pop
      // 9b7: goto 9bc
      // 9ba: pop
      // 9bb: nop
      // 9bc: return
   }

   private final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
      Vec3 param1, List<? extends RemotePlayer> param2
   ) {
Vec3 var4 = param1.add(0.0D, 0.3500000000000001D, 0.0D);
Intrinsics.checkNotNullExpressionValue((Object)var4, (String)"add(...)");
String var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
int var5 = this.h(var4);
IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6 = this.g(param1);
Double var7 = null;
java.util.Iterator<? extends RemotePlayer> var11 = param2.iterator();
if (var11.hasNext()) {
double var14 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var11.next()));
while (var11.hasNext()) {
double var18 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var11.next()));
var14 = Math.min(var14, var18);
}
var7 = Double.valueOf(var14);
}
double var9 = (var7 != null ? var7.doubleValue() : 0.0D) * 30.0D;
var9 += (double)RangesKt.coerceAtMost(var5, 8) * 3.0D;
if (var6 != null) {
var9 += 15.0D;
if (this.c(var6.a(), var4)) { var9 += 25.0D; }
}
return new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(param1, var9, var6);
   }

   private final boolean i(Vec3 param1) {

      boolean bl;
      block19: {
          block17: {
              String string;
              block18: {
                  BlockPos blockPos;
                  ClientLevel clientLevel;
                  block16: {
                      ClientLevel clientLevel2;
                      block15: {
                          block14: {
                              string = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
                              try {
                                  try {
                                      if (string == null) break block14;
                                      clientLevel2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.level;
                                      if (clientLevel2 != null) break block15;
                                  }
                                  catch (NoSuchElementException noSuchElementException) {
                                      throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                                  }
                              }
                              catch (NoSuchElementException noSuchElementException) {
                                  throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                              }
                          }
                          return false;
                      }
                      clientLevel = clientLevel2;
                      BlockPos blockPos2 = BlockPos.containing((double)param1.x, (double)(param1.y - 1.0), (double)param1.z);
                      Intrinsics.checkNotNullExpressionValue((Object)blockPos2, (String)"containing(...)");
                      BlockPos blockPos3 = blockPos2;
                      BlockPos blockPos4 = blockPos3.above();
                      Intrinsics.checkNotNullExpressionValue((Object)blockPos4, (String)"above(...)");
                      BlockPos blockPos5 = blockPos4;
                      BlockPos blockPos6 = blockPos5.above();
                      Intrinsics.checkNotNullExpressionValue((Object)blockPos6, (String)"above(...)");
                      blockPos = blockPos6;
                      try {
                          try {
                              bl = clientLevel.getBlockState(blockPos3).isAir();
                              if (string == null) break block16;
                              if (bl) break block17;
                          }
                          catch (NoSuchElementException noSuchElementException) {
                              throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                          }
                          bl = clientLevel.getBlockState(blockPos5).isAir();
                      }
                      catch (NoSuchElementException noSuchElementException) {
                          throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                      }
                  }
                  try {
                      try {
                          if (string == null) break block18;
                          if (!bl) break block17;
                      }
                      catch (NoSuchElementException noSuchElementException) {
                          throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                      }
                      bl = clientLevel.getBlockState(blockPos).isAir();
                  }
                  catch (NoSuchElementException noSuchElementException) {
                      throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
                  }
              }
              try {
                  if (string == null) break block19;
                  if (!bl) break block17;
              }
              catch (NoSuchElementException noSuchElementException) {
                  throw (RuntimeException)IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.a(noSuchElementException);
              }
              bl = true;
              break block19;
          }
          bl = false;
      }
      return bl;

   }

   private final void P() {
      int var1 = this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll++;
      this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = false;
      this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = null;
      this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = null;
      this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = null;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = 0;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = 0;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.f();
   }

   private final void a(
      IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1
   ) {
      String var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      int var3 = this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = var3 + 1;
      final int var8 = this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
      Vec3 var4 = param1.a();
      this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = var4;
      this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = true;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = null;
      this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = null;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = 0;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = Double.MAX_VALUE;
      this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = param1.c();
      if (this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII != null) {
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
         var7.a(this.b(var7.a(), var4.add(0.0, 0.3500000000000001, 0.0)));
      }
      BlockPos var5 = BlockPos.containing(var4);
      if (!this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll) {
         this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = true;
         me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(() -> a(var5, var8, this));
      }
      if (this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.a((Number)Integer.valueOf(10000))) {
         me.octo.client.utils.IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("Player Check!", "You're being player checked! Tab in!");
         this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.f();
      }
   }

   private final List<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> a(
      List<? extends Vec3> param1, List<? extends RemotePlayer> param2
   ) {
      String var6 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Vec3 var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      double var4 = var3.y;
      List var5 = new ArrayList();
      java.util.Iterator var7 = ((Iterable)param1).iterator();
      while (var7.hasNext()) { Vec3 var8 = (Vec3)var7.next(); if (Math.abs(var8.y - var4) - 1.0 >= 0.0) { continue; } boolean var9 = false; if (!(param2 instanceof java.util.Collection) || !((java.util.Collection)param2).isEmpty()) { java.util.Iterator var9it = ((Iterable)param2).iterator(); while (true) { if (!var9it.hasNext()) { var9 = false; break; } RemotePlayer var9rp = (RemotePlayer)var9it.next(); if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var8, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var9rp)) - 1.5 < 0.0) { var9 = true; break; } } } if (var9) { continue; } if (me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var3, var8, (Vec3)null, 0, false, 0.0, true, false, 0.0, 444, (Object)null)) { var5.add(this.a(var8, param2)); } }
      if (!var5.isEmpty()) { return var5; }
      java.util.Iterator var13 = ((Iterable)param2).iterator();
      RemotePlayer var14 = null;
      if (var13.hasNext()) { var14 = (RemotePlayer)var13.next(); }
      if (var13.hasNext()) { double var15 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var14), false); do { RemotePlayer var17 = (RemotePlayer)var13.next(); double var18 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var17), false); if (Double.compare(var15, var18) > 0) { var14 = var17; var15 = var18; } } while (var13.hasNext()); }
      if (var14 == null) { return var5; }
      Vec3 var19 = var3.subtract(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var14)).normalize();
      Intrinsics.checkNotNullExpressionValue(var19, "normalize(...)");
      java.util.Iterator var20 = CollectionsKt.listOf(new Double[]{0.0, 0.4, -0.4, 0.8, -0.8, 1.2, -1.2}).iterator();
      while (var20.hasNext()) { double var21 = ((Number)var20.next()).doubleValue(); double var22 = Math.atan2(var19.z, var19.x) + var21; java.util.Iterator var23 = CollectionsKt.listOf(new Double[]{3.0, 2.5, 2.0}).iterator(); while (var23.hasNext()) { double var24 = ((Number)var23.next()).doubleValue(); Vec3 var25 = var3.add(Math.cos(var22) * var24, 0.0, Math.sin(var22) * var24); Intrinsics.checkNotNullExpressionValue(var25, "add(...)"); if (!this.i(var25)) { continue; } if (!me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var3, var25, (Vec3)null, 0, false, 0.0, true, false, 0.0, 444, (Object)null)) { continue; } boolean var26 = false; if (!(param2 instanceof java.util.Collection) || !((java.util.Collection)param2).isEmpty()) { java.util.Iterator var26it = ((Iterable)param2).iterator(); while (true) { if (!var26it.hasNext()) { var26 = false; break; } RemotePlayer var26rp = (RemotePlayer)var26it.next(); if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var25, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var26rp)) - 1.5 < 0.0) { var26 = true; break; } } } if (var26) { continue; } Vec3 var29 = new Vec3((double)BlockPos.containing((net.minecraft.core.Position)var25).getX() + 0.5, (double)BlockPos.containing((net.minecraft.core.Position)var25).getY(), (double)BlockPos.containing((net.minecraft.core.Position)var25).getZ() + 0.5).add(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl); Intrinsics.checkNotNullExpressionValue(var29, "add(...)"); var5.add(this.a(var29, param2)); } }
      return var5;
   }

   protected final boolean d(@NotNull List<? extends Vec3> param1) {
      String var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(param1, "walkPositions");
      if (!this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll.a(Integer.valueOf(50))) {
         return this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
      }
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll.f();
      if (!this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII) {
         List var15 = this.K();
         if (var15.isEmpty()) {
            return false;
         }
         if (!this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.a(Integer.valueOf(1500))) {
            return false;
         }
         BlockPos var16 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != null ? this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.a() : null;
         Double var17 = null;
         java.util.Iterator var18 = ((Iterable)var15).iterator();
         if (var18.hasNext()) {
            double var19 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)(RemotePlayer)var18.next()), false);
            while (var18.hasNext()) {
               double var20 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)(RemotePlayer)var18.next()), false);
               var19 = Math.min(var19, var20);
            }
            var17 = Double.valueOf(var19);
         }
         double var21 = var17 != null ? var17.doubleValue() : Double.MAX_VALUE;
         boolean var22 = var16 != null && this.d(var16);
         boolean var23 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == null && var21 - 3.0 < 0.0;
         boolean var24 = this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI >= 2 && var21 - 4.0 < 0.0;
         if ((var21 - 1.0 < 0.0 && var22) || var23 || var24) {
            this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = 0;
            List var25 = this.a(param1, var15);
            java.util.Iterator var26 = ((Iterable)var25).iterator();
            me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var27 = null;
            if (var26.hasNext()) {
               var27 = (me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var26.next();
            }
            if (var26.hasNext()) {
               double var28 = var27.b();
               do {
                  me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var29 = (me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var26.next();
                  double var30 = var29.b();
                  if (Double.compare(var28, var30) < 0) {
                     var27 = var29;
                     var28 = var30;
                  }
               } while (var26.hasNext());
            }
            if (var27 != null) {
               this.a(var27);
            }
         }
         return this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
      }
         if (var2 == null) {
            return this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
         }
         Vec3 var3 = this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
         if (var3 == null) {
            return this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
         }
         List var4 = this.K();
         boolean var5 = false;
         if (!(var4 instanceof java.util.Collection) || !((java.util.Collection)var4).isEmpty()) {
            java.util.Iterator var6 = ((Iterable)var4).iterator();
            while (true) {
               if (!var6.hasNext()) {
                  var5 = false;
                  break;
               }
               RemotePlayer var7 = (RemotePlayer)var6.next();
               if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var3, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var7)) - 1.5 < 0.0) {
                  var5 = true;
                  break;
               }
            }
         }
         if (!var5) {
            return this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
         }
         this.P();
         List var8 = this.a(param1, var4);
         java.util.Iterator var9 = ((Iterable)var8).iterator();
         me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10 = null;
         if (var9.hasNext()) {
            var10 = (me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var9.next();
         }
         if (var9.hasNext()) {
            double var11 = var10.b();
            do {
               me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var13 = (me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var9.next();
               double var14 = var13.b();
               if (Double.compare(var11, var14) < 0) {
                  var10 = var13;
                  var11 = var14;
               }
            } while (var9.hasNext());
         }
         if (var10 != null) {
            this.a(var10);
         }
         return this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   }

   private final Vec3 b(BlockPos param1, Vec3 param2) {
      String var3 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var3 == null) { return null; }
      ClientLevel var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.level;
      if (var4 == null) { return null; }
      if (var3 == null) { return null; }
      BlockState var5 = var4.getBlockState(param1);
      if (var5 == null) { return null; }
      net.minecraft.world.phys.shapes.VoxelShape var6 = var5.getCollisionShape(var4, param1);
      if (var6 == null) { return null; }
      List var7 = var6.toAabbs();
      if (var7 == null) { return null; }
      java.util.Collection var8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var7, 10));
      for (Object var9 : var7) { net.minecraft.world.phys.AABB var10 = (net.minecraft.world.phys.AABB)var9; var8.add(new net.minecraft.world.phys.AABB((double)param1.getX() + var10.minX, (double)param1.getY() + var10.minY, (double)param1.getZ() + var10.minZ, (double)param1.getX() + var10.maxX, (double)param1.getY() + var10.maxY, (double)param1.getZ() + var10.maxZ)); }
      java.util.Collection var11 = new ArrayList();
      for (Object var12 : var8) { CollectionsKt.addAll((java.util.Collection)var11, (List)me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a((net.minecraft.world.phys.AABB)var12, 0.0, 0.0, (Vec3)null, 0.0)); }
      List var13 = new ArrayList();
      for (Object var14 : var11) { Vec3 var15 = (Vec3)var14; me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.PXEvMid var16 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var15, CollectionsKt.listOf(RemotePlayer.class), param2); if (var16.b() == me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII && Intrinsics.areEqual(var16.c(), param1)) { var13.add(var15); } }
      if (var13.size() < 3) { return null; }
      List var17 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.f(param1), 0.0, 0.0, (Vec3)null, 0.0);
      java.util.Iterator var18 = var17.iterator();
      if (!var18.hasNext()) { throw new NoSuchElementException(); }
      Object var19 = var18.next();
      Vec3 var21 = (Vec3)var19;
      if (var18.hasNext()) { double var20 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b((Vec3)var19, param2); do { Object var22 = var18.next(); double var23 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b((Vec3)var22, param2); if (Double.compare(var20, var23) > 0) { var21 = (Vec3)var22; var20 = var23; } } while (var18.hasNext()); }
      final Vec3 var24 = var21;
      return (Vec3)CollectionsKt.randomOrNull((java.util.Collection)CollectionsKt.take((Iterable)CollectionsKt.sortedWith((Iterable)var13, (java.util.Comparator)new java.util.Comparator<Vec3>() { public int compare(Vec3 var1, Vec3 var2) { return Double.compare(me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var1, var24), me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var2, var24)); } }), 20), (kotlin.random.Random)kotlin.random.Random.Default);
   }

   protected final boolean Q() {
      String var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (!this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII) { return false; }
      Vec3 var2 = this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
      if (var2 == null) { this.P(); return true; }
      LocalPlayer var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player;
      if (var3 == null) { this.P(); return true; }
      double var4 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var2, false);
      if (var4 - 0.8D < 0.0D) { this.P(); return true; }
      if (var4 - (this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl - 0.1D) < 0.0D) {
         this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = var4;
         this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.f();
      }
      if (this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.a(Integer.valueOf(500))) { this.P(); return true; }
      java.util.List var5 = this.K();
      boolean var6 = true;
      if (!(var5 instanceof java.util.Collection) || !((java.util.Collection)var5).isEmpty()) {
         java.util.Iterator var7 = ((Iterable)var5).iterator();
         while (true) {
            if (!var7.hasNext()) {
               var6 = true;
               break;
            }
            RemotePlayer var8 = (RemotePlayer)var7.next();
            if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var8), false) < 4.0D) {
               var6 = false;
               break;
            }
         }
      }
      if (var6) { this.P(); return true; }
      return false;
   }

   protected final void R() {
      String var1 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Vec3 var2 = this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
      if (var2 == null) {
         return;
      }
      ArrayList<Vec3> var3 = this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
      if (var3 != null && this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI <= kotlin.collections.CollectionsKt.getLastIndex(var3)) {
         Vec3 var4 = var3.get(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI);
         if (me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var4, me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(), 0.2)) {
            this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI + 1;
         }
         if (this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI > kotlin.collections.CollectionsKt.getLastIndex(var3)) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(), var2, true, 0.3);
         } else {
            Vec3 var6 = this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI > 0 ? var3.get(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI - 1) : me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var6, var3.get(this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI), true, 0.3);
         }
      } else {
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w(), var2, true, 0.3);
      }
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("sneak", true);
   }

   public final boolean d(@NotNull BlockPos param1) {
      String var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(param1, "targetPos");
      LocalPlayer var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player;
      if (var3 == null) { return false; }
      Vec3 var4 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var3);
      Vec3 var5 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(param1);
      double var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var5, true);
      Vec3 var8 = var5.subtract(var4).normalize();
      Intrinsics.checkNotNullExpressionValue(var8, "normalize(...)");
      List var9 = this.K();
      java.util.Iterator var10 = var9.iterator();
      while (var10.hasNext()) {
         RemotePlayer var11 = (RemotePlayer)var10.next();
         net.minecraft.world.phys.AABB var12 = var11.getBoundingBox();
         Intrinsics.checkNotNullExpressionValue(var12, "getBoundingBox(...)");
         net.minecraft.world.phys.AABB var13 = var12.inflate(0.25D, 0.25D, 0.25D);
         Intrinsics.checkNotNullExpressionValue(var13, "inflate(...)");
         double var14 = (var6 + 1.0D) * (var6 + 1.0D);
         double var15 = var3.distanceToSqr(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var11));
         if (!(var15 < var14)) { continue; }
         Vec3 var16 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var11);
         Vec3 var17 = var16.subtract(var4);
         Intrinsics.checkNotNullExpressionValue(var17, "subtract(...)");
         double var18 = var17.dot(var8);
         if (var17.length() < 0.8D) { return true; }
         if (!(var18 > 0.0D)) { continue; }
         if (!(var18 < var6)) { continue; }
         Vec3 var20 = var4.add(var8.scale(var18));
         Intrinsics.checkNotNullExpressionValue(var20, "add(...)");
         if (var13.contains(var20)) { return true; }
         if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var20, var16) < 0.8D) { return true; }
      }
      return false;
   }

   public final boolean b(@NotNull Vec3 param1, @NotNull Vec3 param2) {
      String var3 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(param1, "targetVec");
      Intrinsics.checkNotNullParameter(param2, "eyes");
      LocalPlayer var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player;
      if (var4 == null) { return false; }
      double var5 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param2, param1);
      Vec3 var7 = param1.subtract(param2).normalize();
      Intrinsics.checkNotNullExpressionValue(var7, "normalize(...)");
      List var8 = this.K();
      java.util.Iterator var9 = var8.iterator();
      while (var9.hasNext()) {
         RemotePlayer var10 = (RemotePlayer)var9.next();
         net.minecraft.world.phys.AABB var11 = var10.getBoundingBox();
         Intrinsics.checkNotNullExpressionValue(var11, "getBoundingBox(...)");
         net.minecraft.world.phys.AABB var12 = var11.inflate(0.25D, 0.25D, 0.25D);
         Intrinsics.checkNotNullExpressionValue(var12, "inflate(...)");
         double var13 = var4.distanceToSqr(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var10));
         if (!(var13 < (var5 + 1.0D) * (var5 + 1.0D))) { continue; }
         Vec3 var15 = var10.getEyePosition();
         Intrinsics.checkNotNullExpressionValue(var15, "getEyePosition(...)");
         Vec3 var16 = var15.subtract(param2);
         Intrinsics.checkNotNullExpressionValue(var16, "subtract(...)");
         double var17 = var16.dot(var7);
         if (!(var17 > 0.0D)) { continue; }
         if (!(var17 < var5)) { continue; }
         Vec3 var19 = param2.add(var7.scale(var17));
         Intrinsics.checkNotNullExpressionValue(var19, "add(...)");
         if (var12.contains(var19)) { return true; }
         if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var19, var15) < 0.8D) { return true; }
      }
      return false;
   }

   public final boolean c(@NotNull BlockPos param1, @NotNull Vec3 param2) {
      Intrinsics.checkNotNullParameter(param1, "blockPos");
      String var3 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Intrinsics.checkNotNullParameter(param2, "eyePos");
      net.minecraft.world.phys.AABB var4 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.f(param1);
      List<Vec3> var5 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4, param2);
      for (Vec3 var10 : var5) {
         if (!this.b(var10, param2)) { return true; }
      }
      return false;
   }

   private static final Unit S() {
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .x();
      return Unit.INSTANCE;
   }

   private static final void a(IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll param0, LocalPlayer param1) {
      String var2 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      Vec3 var3 = param0.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
      if (var3 == null) {
         return;
      }
      float var4 = param1.getYRot();
      float var5 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(var3).a();
      float var6;
      if (param0.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI == IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
         var6 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(var4 - 15.0f);
      } else if (param0.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI == IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl && var5 < 0.0f) {
         var6 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(var4 - 15.0f);
      } else if (param0.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI == IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         var6 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(var4 + 15.0f);
      } else if (param0.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI == IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl && var5 > 0.0f) {
         var6 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.c(var4 + 15.0f);
      } else {
         var6 = var4;
      }
      param0.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(var6, me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(-85.0f, 85.0f, param1.getXRot() + kotlin.random.Random.Default.nextFloat() * 10.0f - 5.0f));
   }

   private static final Unit a(BlockPos param0, int param1, IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll param2) {
      String var3 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      List var5 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a((Object)param0, false);
      ArrayList var4;
      if (var5 == null) { var4 = null; } else {
         ArrayList var9 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)var5, 10));
         for (Object var12 : var5) {
            me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var13 = (me.octo.client.utils.player.pathfinder.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var12;
            var9.add(var13.b());
         }
         var4 = var9;
      }
      try {
         if (param1 == param2.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll) {
            if (param2.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII) {
               param2.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = var4;
               param2.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = 1;
            }
         }
      } finally {
         param2.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = false;
      }
      return Unit.INSTANCE;
   }

   public IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll() {
      this(false, 1, null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[79];
      int var3 = 0;
      String var2 = "f¥\u0005BPÞ\u001e\u008eFø\u0004g\u008eDÝ\b\u009d\u0080§_7îÐI\n\u001b=ôj¡\u0082 \u0005\u0081\u0089\u000e\u0084jª\f\u001f+4¨çãµhu<\r\u001d\u007f½g\u0011\u0083øÍ6\u007fýÒH\u0004}Kèâ\b>¹\u0005Yq.\u0018Q\u0007]i\u009eê \u009eA\bMd½Ãt}¸;\u0004â1ô*\u000e=V³þï\u0092\u009dVÐª\u0011Aá\u0019\u0010ù\u00136íDRÎ\u001f\u001f\u008d\u0006Z0ñÄÀ\u0005\u0091\"u<\u0004\u0006\u0016\u0000\u0085¨\u0001:\u0005O\u0010Y\u0080Ã\u0005\u0012\u0090\u0005j\n$\u001e}/¤[4\u0084{\u0091Ã;Lâ\u0081Bo;kT\u0082&Jî¤Ñé^&UÕ\u0004¨úTæ¹\u0004³)\u001a6\nâ°õ\u001e?o£¸ñ>\bærvb0\u0015\u009cÝ\u0005úæ£\u009eSdû´Ý\u0086 ?¸ô4Tº\\;5ÜÊªö\u0003V;C\u0006,¯\t¥ø«¹ 7®0ü#\u0094X\u009e\u0095\u0084,mÔJÂ\u0007ÀúÏUvÓ\u0095ïWÏÃW^×\u0094ö!D\u0000wÓP^:\u001e\u0086ÕD¨,W´: x6zÎÚh\u009a\u0095\nîq\tæx!¥ý»\u0000\u000et´\u009a°Ý\r.b¯\rÖµ\u0019\u0087\u0006ºm\u0010\u0005³\u008f\u000e®ËÁ]°èX\u008dÃ»Äc[]\u0005\u0019\u0087°\u009c£\u000b»\u008aDÞÐx\u009dÖÐ÷M[\u008a\u0086óÀe÷\u0000í#wX8g¹W[ÛÄ-\u0010þ\u008b¾5¸*G\u009c÷5«¦ß\u0002ÒeQ\u0090&\u008c\u0093\u000f\u008f°\u0016N\u008cQ\u008bý{0\u0016]WNØàµ:\u008b\u0018}°52Y\u0095\u0095\u0096\u0082\u0007\u0091ö¦ÌpØ<¥Â&v¦6¬ÉôK\u001as\n\u0081(§ÈËÖm\u008f(Ø4\u0013z\u008eCu+N\u001b\u00112Ý/\u0005|\u008auÁhé¼V\u0000¬¦&ì¨\fª]ò\u009a\fð9Ê\u008e\u009d\u0016îfùÖì'W\u008d (Tø]\r©Q¡+\u007føCp\u000f1LôM\nS4¬Î~EÕ\u0092·\u0086\n {Â'³xl5\u0080r\u0007\u008faÄëk¾(\u0006S\u007fh¯]|\u000eçeè\u0098\u0084^ðÏ}\u0099¤'WÕ\u0016\u0084å\r¿pk\u0014C\u0083-bû±W+\u0083e·\u0096e\u000b\u000b\u0012²?w\u00938pµ.[è_ã\u0085ÊJ3û7\u000bÑQ.\u001dG\u008c±ôu°Â\fØg\u009f\u0087Å(êÛ\u0017Û«\u0087\u0010V\u001aÞmX¸/=1bN|(\u007f\u0096m\u000f\u00823Ú>\u008eR\u00011\u00adî\u0090o\u0017Ûv\rìÃMN\u0096ëÈT\u0015/\nPi\u0012\u0093JflMîØb\u0007Õ\u0016#ìE,ë«\u0011\u000eëPGK¢Ã\u0083µ\u0011@k\u001c®²\f\u009cäZý\u0097,)\u0001\u0082È;Ì\fÌÚÉ\u0016%ë\n-2M-|\b×J\\ÁäY\u0084TdÇNZÙPÔ¦\u0089÷ûÂ©4\u008b=\u001d\u0096\f\u0084\tË¨\u0018Ql¦Ý\r¤\u0007Áà\u0092Ê{|d³\u0080èG\u0083\u0015!E|æ\u0017Æ5Ò)#~ñ*\fl/«Ø*\u0017öxúð\u008c µ$cEz<U4Õ~ÕZ5eqr$£û\u0085\\Åó>ÊÅz\u0016s\u00ad¶\u0010£\u0004}\u000f-\u000eã\u0094ºü²t¦4\u0016x\u0003üCy\t\u00ad\u0083Öô\u0094gø/v\u0005\u0014ý\u0011Ó\u0097\fzJ»\u007fHÍ@û{\u0097\u0004'\u0003l\u000bk\u0007\u0019F\u0010\u0093H\u009fÓ\nÍQpÜþ\rËôü·\tî\u009a¾×\u0099\u0003_©T\u0013\u008f\u000eåã(òð®wÕ)\u0080¶É*ô\u00adõ`[h.¯ÕîUq¹\rý\u009diß\u0093@\u001e9lq\u0005u)Ïa\u0096 \u0082ÍO\u001f¼ã=ª\u008epÚ2WØ½\u0085Já®d\u009b\u0014iU'%\u009dÿ&\u001aöjpk32jõ×\u009a\u0005\u0080\u001e4óS¿|c\u0093ÞÛ\u001c\u000fËMP\u001f\"\u0099\u0094\u0005\u00ad\u0082ü\n\u008a]O#O\u000b)ÛU@\u0013\u00adì¡¸¶nÉ$³éûË\u009døO\u0006\u0001«õ\f\u0017B+)¹¶ìR:¢,\u0081\u0010å°áU\u0099K+µx\u0005\u0089\u0082Ð \u0089\u0096f\"Óÿ¢ß\fg\u0096þ\u0094·\u001fPB\u007f\u008bâ\u0092åu\u008dSÐÊuåà\u000eÈh\u008e\u0085ºü\u008dJvè\u008eÐ\u0016ÍÕ«ü\u001d\u0012\u001f\u00adÜ¹ïÜNÐ\u0094a\u001fäÎt\u009aõ/§ñ³øtÒ\u008e\u0001e.Çîy¡Í\u0011Z\u009blQ2?ï-4ïîº÷5³É:bÐ-º\u008eZ[\u0087Éà\"óèm>gû:\u0013ùÙS\nÅ\u00170¹\u008fVµ¥:ä\u009e\u0083u%®\u000e\u0003èE\u0016\u0094Î\f\u008e\u001f,²b\u000e\u0002YZüA\u0010QY¿ÎÅð\u00168ÿXó¸ä3cµÒ\u0092j\u0087\u008cæ\u0005À\u0012±\u009dNòó'¥ùEr5µ\u0090\r{<û\u00864M*Æ\"çé.ù\u000b\u009aW#ù\u0007\u00ad64¢øÐ\tç^ÌØÑÉÊªÛ\u000fÛCñ0ë\u0093\u00ad\t8é\"\u008fAÇ¼\u0006Jc\u009bYý\u000b\u0013ï\"éa¿UèC\u0097\u0005\u007fV\rK]pCe½\u0013O\u0097ýÐ+\u0094\u0090b{L¨³\u0086¯,8mlx\u0006½He<\"§\u0006>ØM\bx\u008f\b\u0001\u0007â\u008e\u008dÔ\u0087\u000e";
      int var4 = "f¥\u0005BPÞ\u001e\u008eFø\u0004g\u008eDÝ\b\u009d\u0080§_7îÐI\n\u001b=ôj¡\u0082 \u0005\u0081\u0089\u000e\u0084jª\f\u001f+4¨çãµhu<\r\u001d\u007f½g\u0011\u0083øÍ6\u007fýÒH\u0004}Kèâ\b>¹\u0005Yq.\u0018Q\u0007]i\u009eê \u009eA\bMd½Ãt}¸;\u0004â1ô*\u000e=V³þï\u0092\u009dVÐª\u0011Aá\u0019\u0010ù\u00136íDRÎ\u001f\u001f\u008d\u0006Z0ñÄÀ\u0005\u0091\"u<\u0004\u0006\u0016\u0000\u0085¨\u0001:\u0005O\u0010Y\u0080Ã\u0005\u0012\u0090\u0005j\n$\u001e}/¤[4\u0084{\u0091Ã;Lâ\u0081Bo;kT\u0082&Jî¤Ñé^&UÕ\u0004¨úTæ¹\u0004³)\u001a6\nâ°õ\u001e?o£¸ñ>\bærvb0\u0015\u009cÝ\u0005úæ£\u009eSdû´Ý\u0086 ?¸ô4Tº\\;5ÜÊªö\u0003V;C\u0006,¯\t¥ø«¹ 7®0ü#\u0094X\u009e\u0095\u0084,mÔJÂ\u0007ÀúÏUvÓ\u0095ïWÏÃW^×\u0094ö!D\u0000wÓP^:\u001e\u0086ÕD¨,W´: x6zÎÚh\u009a\u0095\nîq\tæx!¥ý»\u0000\u000et´\u009a°Ý\r.b¯\rÖµ\u0019\u0087\u0006ºm\u0010\u0005³\u008f\u000e®ËÁ]°èX\u008dÃ»Äc[]\u0005\u0019\u0087°\u009c£\u000b»\u008aDÞÐx\u009dÖÐ÷M[\u008a\u0086óÀe÷\u0000í#wX8g¹W[ÛÄ-\u0010þ\u008b¾5¸*G\u009c÷5«¦ß\u0002ÒeQ\u0090&\u008c\u0093\u000f\u008f°\u0016N\u008cQ\u008bý{0\u0016]WNØàµ:\u008b\u0018}°52Y\u0095\u0095\u0096\u0082\u0007\u0091ö¦ÌpØ<¥Â&v¦6¬ÉôK\u001as\n\u0081(§ÈËÖm\u008f(Ø4\u0013z\u008eCu+N\u001b\u00112Ý/\u0005|\u008auÁhé¼V\u0000¬¦&ì¨\fª]ò\u009a\fð9Ê\u008e\u009d\u0016îfùÖì'W\u008d (Tø]\r©Q¡+\u007føCp\u000f1LôM\nS4¬Î~EÕ\u0092·\u0086\n {Â'³xl5\u0080r\u0007\u008faÄëk¾(\u0006S\u007fh¯]|\u000eçeè\u0098\u0084^ðÏ}\u0099¤'WÕ\u0016\u0084å\r¿pk\u0014C\u0083-bû±W+\u0083e·\u0096e\u000b\u000b\u0012²?w\u00938pµ.[è_ã\u0085ÊJ3û7\u000bÑQ.\u001dG\u008c±ôu°Â\fØg\u009f\u0087Å(êÛ\u0017Û«\u0087\u0010V\u001aÞmX¸/=1bN|(\u007f\u0096m\u000f\u00823Ú>\u008eR\u00011\u00adî\u0090o\u0017Ûv\rìÃMN\u0096ëÈT\u0015/\nPi\u0012\u0093JflMîØb\u0007Õ\u0016#ìE,ë«\u0011\u000eëPGK¢Ã\u0083µ\u0011@k\u001c®²\f\u009cäZý\u0097,)\u0001\u0082È;Ì\fÌÚÉ\u0016%ë\n-2M-|\b×J\\ÁäY\u0084TdÇNZÙPÔ¦\u0089÷ûÂ©4\u008b=\u001d\u0096\f\u0084\tË¨\u0018Ql¦Ý\r¤\u0007Áà\u0092Ê{|d³\u0080èG\u0083\u0015!E|æ\u0017Æ5Ò)#~ñ*\fl/«Ø*\u0017öxúð\u008c µ$cEz<U4Õ~ÕZ5eqr$£û\u0085\\Åó>ÊÅz\u0016s\u00ad¶\u0010£\u0004}\u000f-\u000eã\u0094ºü²t¦4\u0016x\u0003üCy\t\u00ad\u0083Öô\u0094gø/v\u0005\u0014ý\u0011Ó\u0097\fzJ»\u007fHÍ@û{\u0097\u0004'\u0003l\u000bk\u0007\u0019F\u0010\u0093H\u009fÓ\nÍQpÜþ\rËôü·\tî\u009a¾×\u0099\u0003_©T\u0013\u008f\u000eåã(òð®wÕ)\u0080¶É*ô\u00adõ`[h.¯ÕîUq¹\rý\u009diß\u0093@\u001e9lq\u0005u)Ïa\u0096 \u0082ÍO\u001f¼ã=ª\u008epÚ2WØ½\u0085Já®d\u009b\u0014iU'%\u009dÿ&\u001aöjpk32jõ×\u009a\u0005\u0080\u001e4óS¿|c\u0093ÞÛ\u001c\u000fËMP\u001f\"\u0099\u0094\u0005\u00ad\u0082ü\n\u008a]O#O\u000b)ÛU@\u0013\u00adì¡¸¶nÉ$³éûË\u009døO\u0006\u0001«õ\f\u0017B+)¹¶ìR:¢,\u0081\u0010å°áU\u0099K+µx\u0005\u0089\u0082Ð \u0089\u0096f\"Óÿ¢ß\fg\u0096þ\u0094·\u001fPB\u007f\u008bâ\u0092åu\u008dSÐÊuåà\u000eÈh\u008e\u0085ºü\u008dJvè\u008eÐ\u0016ÍÕ«ü\u001d\u0012\u001f\u00adÜ¹ïÜNÐ\u0094a\u001fäÎt\u009aõ/§ñ³øtÒ\u008e\u0001e.Çîy¡Í\u0011Z\u009blQ2?ï-4ïîº÷5³É:bÐ-º\u008eZ[\u0087Éà\"óèm>gû:\u0013ùÙS\nÅ\u00170¹\u008fVµ¥:ä\u009e\u0083u%®\u000e\u0003èE\u0016\u0094Î\f\u008e\u001f,²b\u000e\u0002YZüA\u0010QY¿ÎÅð\u00168ÿXó¸ä3cµÒ\u0092j\u0087\u008cæ\u0005À\u0012±\u009dNòó'¥ùEr5µ\u0090\r{<û\u00864M*Æ\"çé.ù\u000b\u009aW#ù\u0007\u00ad64¢øÐ\tç^ÌØÑÉÊªÛ\u000fÛCñ0ë\u0093\u00ad\t8é\"\u008fAÇ¼\u0006Jc\u009bYý\u000b\u0013ï\"éa¿UèC\u0097\u0005\u007fV\rK]pCe½\u0013O\u0097ýÐ+\u0094\u0090b{L¨³\u0086¯,8mlx\u0006½He<\"§\u0006>ØM\bx\u008f\b\u0001\u0007â\u008e\u008dÔ\u0087\u000e"
         .length();
      char var1 = '\n';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 109;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var20 = var26;
               int var14 = var10004;
               byte var38;
               char[] var44;
               int var10006;
               if (var10004 <= 1) {
                  var44 = var26;
                  var38 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var44 = var26;
                  var38 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var44[var10006] = (char)(var44[var10006] ^ var38 ^ switch (var6 % 7) {
                     case 0 -> 114;
                     case 1 -> 11;
                     case 2 -> 101;
                     case 3 -> 15;
                     case 4 -> 123;
                     case 5 -> 39;
                     default -> 92;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var44 = var20;
                     var38 = var29;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var44 = var20;
                     var38 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[79];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     var10002 = -21460;
                     short var32 = 2026;
                     short var33 = -21433;
                     short var42 = -15174;
                     IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                        "Render Debug Positions", "Renders mineable blocks, mining position etc.", true
                     );
                     var10002 = -21457;
                     short var34 = -18333;
                     short var35 = -21432;
                     var42 = 2200;
                     llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl = new IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl(
                        "Only Render Target", "Skips rendering mineable blocks and only renders the mining target + precision miner if that's enabled", true
                     );
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

                  var2 = "Bçñ÷>\npI6øáÒKÿÉ\u0088\u0013¥/'¥vÎ\u0091\u00ad¥þvÛs5u\u0017cÐR\nmV(\u0086\u00806Z:\b\u0012\u0082C\u009cy\u0007M 'êÍo\fÐ§^ãcýS[¢Îkò£\u0084y\u001f=@¢°*\u008bçÊ-§çrä\u0084\u001bÂ2sûuRq\tB1y8k[\u0007ÏÇ#p¬^Ó«ì¦«##\u0081Â\u0002\u0085`\u0096³üknI";
                  var4 = "Bçñ÷>\npI6øáÒKÿÉ\u0088\u0013¥/'¥vÎ\u0091\u00ad¥þvÛs5u\u0017cÐR\nmV(\u0086\u00806Z:\b\u0012\u0082C\u009cy\u0007M 'êÍo\fÐ§^ãcýS[¢Îkò£\u0084y\u001f=@¢°*\u008bçÊ-§çrä\u0084\u001bÂ2sûuRq\tB1y8k[\u0007ÏÇ#p¬^Ó«ì¦«##\u0081Â\u0002\u0085`\u0096³üknI"
                     .length();
                  var1 = 'S';
                  var8 = -1;
            }

            var10000 = 117;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21495) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 126;
            case 1 -> 99;
            case 2 -> 73;
            case 3 -> 14;
            case 4 -> 67;
            case 5 -> 118;
            case 6 -> 201;
            case 7 -> 16;
            case 8 -> 48;
            case 9 -> 206;
            case 10 -> 176;
            case 11 -> 253;
            case 12 -> 107;
            case 13 -> 162;
            case 14 -> 234;
            case 15 -> 65;
            case 16 -> 250;
            case 17 -> 140;
            case 18 -> 219;
            case 19 -> 238;
            case 20 -> 192;
            case 21 -> 115;
            case 22 -> 205;
            case 23 -> 152;
            case 24 -> 38;
            case 25 -> 63;
            case 26 -> 156;
            case 27 -> 212;
            case 28 -> 127;
            case 29 -> 104;
            case 30 -> 184;
            case 31 -> 177;
            case 32 -> 12;
            case 33 -> 224;
            case 34 -> 160;
            case 35 -> 135;
            case 36 -> 172;
            case 37 -> 20;
            case 38 -> 214;
            case 39 -> 121;
            case 40 -> 123;
            case 41 -> 230;
            case 42 -> 17;
            case 43 -> 54;
            case 44 -> 161;
            case 45 -> 15;
            case 46 -> 157;
            case 47 -> 171;
            case 48 -> 86;
            case 49 -> 215;
            case 50 -> 29;
            case 51 -> 251;
            case 52 -> 7;
            case 53 -> 128;
            case 54 -> 96;
            case 55 -> 141;
            case 56 -> 142;
            case 57 -> 53;
            case 58 -> 61;
            case 59 -> 252;
            case 60 -> 103;
            case 61 -> 42;
            case 62 -> 148;
            case 63 -> 191;
            case 64 -> 45;
            case 65 -> 40;
            case 66 -> 98;
            case 67 -> 228;
            case 68 -> 136;
            case 69 -> 227;
            case 70 -> 188;
            case 71 -> 69;
            case 72 -> 95;
            case 73 -> 88;
            case 74 -> 82;
            case 75 -> 207;
            case 76 -> 144;
            case 77 -> 173;
            case 78 -> 231;
            case 79 -> 32;
            case 80 -> 248;
            case 81 -> 5;
            case 82 -> 237;
            case 83 -> 93;
            case 84 -> 158;
            case 85 -> 239;
            case 86 -> 70;
            case 87 -> 39;
            case 88 -> 190;
            case 89 -> 58;
            case 90 -> 8;
            case 91 -> 254;
            case 92 -> 218;
            case 93 -> 78;
            case 94 -> 84;
            case 95 -> 108;
            case 96 -> 35;
            case 97 -> 210;
            case 98 -> 147;
            case 99 -> 255;
            case 100 -> 179;
            case 101 -> 41;
            case 102 -> 202;
            case 103 -> 208;
            case 104 -> 89;
            case 105 -> 51;
            case 106 -> 168;
            case 107 -> 105;
            case 108 -> 155;
            case 109 -> 180;
            case 110 -> 197;
            case 111 -> 120;
            case 112 -> 81;
            case 113 -> 236;
            case 114 -> 74;
            case 115 -> 87;
            case 116 -> 220;
            case 117 -> 26;
            case 118 -> 170;
            case 119 -> 30;
            case 120 -> 22;
            case 121 -> 55;
            case 122 -> 145;
            case 123 -> 163;
            case 124 -> 216;
            case 125 -> 169;
            case 126 -> 131;
            case 127 -> 195;
            case 128 -> 249;
            case 129 -> 66;
            case 130 -> 101;
            case 131 -> 198;
            case 132 -> 204;
            case 133 -> 132;
            case 134 -> 71;
            case 135 -> 151;
            case 136 -> 23;
            case 137 -> 102;
            case 138 -> 174;
            case 139 -> 149;
            case 140 -> 175;
            case 141 -> 114;
            case 142 -> 49;
            case 143 -> 47;
            case 144 -> 34;
            case 145 -> 21;
            case 146 -> 44;
            case 147 -> 233;
            case 148 -> 240;
            case 149 -> 116;
            case 150 -> 80;
            case 151 -> 181;
            case 152 -> 244;
            case 153 -> 36;
            case 154 -> 56;
            case 155 -> 33;
            case 156 -> 3;
            case 157 -> 213;
            case 158 -> 0;
            case 159 -> 243;
            case 160 -> 200;
            case 161 -> 183;
            case 162 -> 18;
            case 163 -> 97;
            case 164 -> 9;
            case 165 -> 189;
            case 166 -> 209;
            case 167 -> 178;
            case 168 -> 222;
            case 169 -> 75;
            case 170 -> 46;
            case 171 -> 19;
            case 172 -> 62;
            case 173 -> 129;
            case 174 -> 203;
            case 175 -> 196;
            case 176 -> 94;
            case 177 -> 247;
            case 178 -> 122;
            case 179 -> 154;
            case 180 -> 4;
            case 181 -> 10;
            case 182 -> 13;
            case 183 -> 25;
            case 184 -> 125;
            case 185 -> 235;
            case 186 -> 109;
            case 187 -> 185;
            case 188 -> 91;
            case 189 -> 217;
            case 190 -> 167;
            case 191 -> 110;
            case 192 -> 138;
            case 193 -> 225;
            case 194 -> 57;
            case 195 -> 90;
            case 196 -> 37;
            case 197 -> 137;
            case 198 -> 2;
            case 199 -> 50;
            case 200 -> 226;
            case 201 -> 164;
            case 202 -> 106;
            case 203 -> 111;
            case 204 -> 193;
            case 205 -> 124;
            case 206 -> 76;
            case 207 -> 232;
            case 208 -> 211;
            case 209 -> 28;
            case 210 -> 199;
            case 211 -> 186;
            case 212 -> 100;
            case 213 -> 153;
            case 214 -> 246;
            case 215 -> 11;
            case 216 -> 112;
            case 217 -> 133;
            case 218 -> 245;
            case 219 -> 242;
            case 220 -> 79;
            case 221 -> 187;
            case 222 -> 92;
            case 223 -> 223;
            case 224 -> 27;
            case 225 -> 85;
            case 226 -> 117;
            case 227 -> 52;
            case 228 -> 59;
            case 229 -> 229;
            case 230 -> 119;
            case 231 -> 77;
            case 232 -> 60;
            case 233 -> 130;
            case 234 -> 139;
            case 235 -> 146;
            case 236 -> 143;
            case 237 -> 159;
            case 238 -> 221;
            case 239 -> 24;
            case 240 -> 194;
            case 241 -> 165;
            case 242 -> 83;
            case 243 -> 43;
            case 244 -> 113;
            case 245 -> 72;
            case 246 -> 182;
            case 247 -> 166;
            case 248 -> 150;
            case 249 -> 6;
            case 250 -> 241;
            case 251 -> 134;
            case 252 -> 64;
            case 253 -> 31;
            case 254 -> 1;
            default -> 68;
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

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull Vec3 var1,
         double var2,
         @Nullable IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4
      ) {
         short var10001 = -4695;
         short var10002 = -18504;
         Intrinsics.checkNotNullParameter(var1, "pos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
      }

      @NotNull
      public final Vec3 a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Vec3 d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull Vec3 var1,
         double var2,
         @Nullable IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4
      ) {
         short var10001 = -4694;
         short var10002 = 14569;
         Intrinsics.checkNotNullParameter(var1, "pos");
         return new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -4693;
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         double var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         Vec3 var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 27517;
         short var10002 = -4691;
         short var10003 = 22059;
         short var10004 = -4696;
         short var10005 = -3240;
         return "ScoredPosition(pos=" + var4 + ", score=" + var2 + ", miningTarget=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         String var10000 = IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
         int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         String var1 = var10000;
         var2 = var2 * 31 + Double.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         int var4 = var2 * 31;
         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var1 != null) {
            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
               return var4 + 0;
            }

            var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         return var4 + var10001.hashCode();
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
               var10000 instanceof IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = Double.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (var4 != 0) {
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
         String var2 = "\u009fáw\u000f\u0010ÃOûÊ\u008b\u0087¸Nt«)õÉ \u0013+oº^=J-$Åæ\u001f|¯¶µL}J\u009d";
         int var4 = "\u009fáw\u000f\u0010ÃOûÊ\u008b\u0087¸Nt«)õÉ \u0013+oº^=J-$Åæ\u001f|¯¶µL}J\u009d".length();
         char var1 = 3;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 44;
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
                        case 0 -> 65;
                        case 1 -> 35;
                        case 2 -> 8;
                        case 3 -> 3;
                        case 4 -> 37;
                        case 5 -> 16;
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

                     var2 = "]ñÈ\bN\u001b}\r·âåP";
                     var4 = "]ñÈ\bN\u001b}\r·âåP".length();
                     var1 = 3;
                     var8 = -1;
               }

               var10000 = 43;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -4695) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 164;
               case 1 -> 110;
               case 2 -> 63;
               case 3 -> 181;
               case 4 -> 31;
               case 5 -> 56;
               case 6 -> 102;
               case 7 -> 223;
               case 8 -> 183;
               case 9 -> 65;
               case 10 -> 195;
               case 11 -> 12;
               case 12 -> 236;
               case 13 -> 52;
               case 14 -> 167;
               case 15 -> 247;
               case 16 -> 107;
               case 17 -> 207;
               case 18 -> 237;
               case 19 -> 217;
               case 20 -> 82;
               case 21 -> 232;
               case 22 -> 108;
               case 23 -> 34;
               case 24 -> 233;
               case 25 -> 169;
               case 26 -> 209;
               case 27 -> 177;
               case 28 -> 155;
               case 29 -> 74;
               case 30 -> 240;
               case 31 -> 166;
               case 32 -> 200;
               case 33 -> 221;
               case 34 -> 111;
               case 35 -> 84;
               case 36 -> 35;
               case 37 -> 32;
               case 38 -> 187;
               case 39 -> 112;
               case 40 -> 239;
               case 41 -> 55;
               case 42 -> 147;
               case 43 -> 116;
               case 44 -> 25;
               case 45 -> 253;
               case 46 -> 235;
               case 47 -> 230;
               case 48 -> 136;
               case 49 -> 189;
               case 50 -> 172;
               case 51 -> 175;
               case 52 -> 8;
               case 53 -> 86;
               case 54 -> 165;
               case 55 -> 162;
               case 56 -> 72;
               case 57 -> 115;
               case 58 -> 99;
               case 59 -> 206;
               case 60 -> 213;
               case 61 -> 6;
               case 62 -> 30;
               case 63 -> 106;
               case 64 -> 255;
               case 65 -> 129;
               case 66 -> 69;
               case 67 -> 124;
               case 68 -> 45;
               case 69 -> 234;
               case 70 -> 104;
               case 71 -> 119;
               case 72 -> 143;
               case 73 -> 26;
               case 74 -> 231;
               case 75 -> 185;
               case 76 -> 66;
               case 77 -> 105;
               case 78 -> 16;
               case 79 -> 191;
               case 80 -> 210;
               case 81 -> 40;
               case 82 -> 0;
               case 83 -> 37;
               case 84 -> 23;
               case 85 -> 21;
               case 86 -> 98;
               case 87 -> 80;
               case 88 -> 5;
               case 89 -> 196;
               case 90 -> 64;
               case 91 -> 224;
               case 92 -> 1;
               case 93 -> 15;
               case 94 -> 188;
               case 95 -> 249;
               case 96 -> 85;
               case 97 -> 91;
               case 98 -> 128;
               case 99 -> 78;
               case 100 -> 94;
               case 101 -> 140;
               case 102 -> 146;
               case 103 -> 251;
               case 104 -> 114;
               case 105 -> 173;
               case 106 -> 22;
               case 107 -> 68;
               case 108 -> 211;
               case 109 -> 3;
               case 110 -> 178;
               case 111 -> 138;
               case 112 -> 42;
               case 113 -> 50;
               case 114 -> 14;
               case 115 -> 154;
               case 116 -> 149;
               case 117 -> 184;
               case 118 -> 248;
               case 119 -> 182;
               case 120 -> 161;
               case 121 -> 204;
               case 122 -> 133;
               case 123 -> 87;
               case 124 -> 179;
               case 125 -> 7;
               case 126 -> 2;
               case 127 -> 254;
               case 128 -> 101;
               case 129 -> 88;
               case 130 -> 158;
               case 131 -> 139;
               case 132 -> 96;
               case 133 -> 243;
               case 134 -> 57;
               case 135 -> 29;
               case 136 -> 47;
               case 137 -> 180;
               case 138 -> 89;
               case 139 -> 238;
               case 140 -> 132;
               case 141 -> 242;
               case 142 -> 77;
               case 143 -> 13;
               case 144 -> 70;
               case 145 -> 93;
               case 146 -> 71;
               case 147 -> 73;
               case 148 -> 130;
               case 149 -> 202;
               case 150 -> 43;
               case 151 -> 252;
               case 152 -> 60;
               case 153 -> 227;
               case 154 -> 121;
               case 155 -> 134;
               case 156 -> 219;
               case 157 -> 46;
               case 158 -> 53;
               case 159 -> 67;
               case 160 -> 11;
               case 161 -> 81;
               case 162 -> 27;
               case 163 -> 190;
               case 164 -> 241;
               case 165 -> 192;
               case 166 -> 137;
               case 167 -> 58;
               case 168 -> 83;
               case 169 -> 127;
               case 170 -> 216;
               case 171 -> 38;
               case 172 -> 156;
               case 173 -> 229;
               case 174 -> 225;
               case 175 -> 113;
               case 176 -> 90;
               case 177 -> 48;
               case 178 -> 97;
               case 179 -> 186;
               case 180 -> 125;
               case 181 -> 4;
               case 182 -> 49;
               case 183 -> 168;
               case 184 -> 226;
               case 185 -> 75;
               case 186 -> 148;
               case 187 -> 214;
               case 188 -> 174;
               case 189 -> 144;
               case 190 -> 33;
               case 191 -> 141;
               case 192 -> 150;
               case 193 -> 201;
               case 194 -> 18;
               case 195 -> 44;
               case 196 -> 152;
               case 197 -> 203;
               case 198 -> 20;
               case 199 -> 24;
               case 200 -> 126;
               case 201 -> 100;
               case 202 -> 212;
               case 203 -> 145;
               case 204 -> 153;
               case 205 -> 79;
               case 206 -> 160;
               case 207 -> 76;
               case 208 -> 122;
               case 209 -> 19;
               case 210 -> 123;
               case 211 -> 245;
               case 212 -> 59;
               case 213 -> 218;
               case 214 -> 117;
               case 215 -> 176;
               case 216 -> 250;
               case 217 -> 151;
               case 218 -> 198;
               case 219 -> 197;
               case 220 -> 61;
               case 221 -> 194;
               case 222 -> 39;
               case 223 -> 17;
               case 224 -> 205;
               case 225 -> 10;
               case 226 -> 28;
               case 227 -> 157;
               case 228 -> 109;
               case 229 -> 228;
               case 230 -> 92;
               case 231 -> 193;
               case 232 -> 159;
               case 233 -> 131;
               case 234 -> 220;
               case 235 -> 95;
               case 236 -> 51;
               case 237 -> 142;
               case 238 -> 120;
               case 239 -> 9;
               case 240 -> 171;
               case 241 -> 208;
               case 242 -> 54;
               case 243 -> 41;
               case 244 -> 163;
               case 245 -> 36;
               case 246 -> 222;
               case 247 -> 170;
               case 248 -> 103;
               case 249 -> 62;
               case 250 -> 199;
               case 251 -> 118;
               case 252 -> 135;
               case 253 -> 246;
               case 254 -> 215;
               default -> 244;
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
      public static final me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0, net.minecraft.world.phys.Vec3 var1, double var2, me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4, int var5, java.lang.Object var6) {
         java.lang.String var7 = me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
         if ((var5 & 1) != 0) {
            if (var7 != null) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var5 & 2) != 0) {
            if (var7 != null) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var5 & 4) != 0) {
            var4 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }
         return var0.a(var1, var2, var4);
      }
}

   private static enum IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl };


      public static IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] a() {
         return (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI a(
         String var0
      ) {
         return Enum.valueOf(
            IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   
      // PX-FIX-ok: synthetic array factory (jar: anewarray + getstatic fill + areturn)
      private static final me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] c() {
         return new me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[]{
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         };
      }
}

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final BlockState lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private Vec3 IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull BlockPos var1, @NotNull BlockState var2) {
         short var10001 = 583;
         short var10002 = 12013;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = 578;
         var10002 = -1195;
         Intrinsics.checkNotNullParameter(var2, "state");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockState b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Vec3 c() {
         return lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .d(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      }

      @Nullable
      public final Vec3 d() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final void a(@Nullable Vec3 var1) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      }

      @NotNull
      public final BlockPos e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockState f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull BlockPos var1, @NotNull BlockState var2
      ) {
         short var10001 = 577;
         short var10002 = 8831;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = 579;
         var10002 = -23452;
         Intrinsics.checkNotNullParameter(var2, "state");
         return new IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = 582;
         short var10003 = -32067;
         var10003 = 576;
         short var10004 = 7007;
         return "MiningBlock(pos="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", state="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = g();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      public static void b(String var0) {
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
      }

      public static String g() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "\u0099\u000bBr¶\u0005(\u0000t\u0013p\b\u0015:u\u008a\u0004\u0083¹\u001c\u0003×Èú";
         int var4 = "\u0099\u000bBr¶\u0005(\u0000t\u0013p\b\u0015:u\u008a\u0004\u0083¹\u001c\u0003×Èú".length();
         char var1 = 5;
         b("EIDLh");
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 70;
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
                        case 0 -> 7;
                        case 1 -> 104;
                        case 2 -> 99;
                        case 3 -> 30;
                        case 4 -> 52;
                        case 5 -> 17;
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

                     var2 = "`\u0010²\u008bt7G\u0093qÄcP\u007f`pO\u0003\u0003°Y";
                     var4 = "`\u0010²\u008bt7G\u0093qÄcP\u007f`pO\u0003\u0003°Y".length();
                     var1 = 16;
                     var8 = -1;
               }

               var10000 = 21;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 578) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 82;
               case 1 -> 145;
               case 2 -> 146;
               case 3 -> 127;
               case 4 -> 59;
               case 5 -> 203;
               case 6 -> 163;
               case 7 -> 20;
               case 8 -> 73;
               case 9 -> 220;
               case 10 -> 96;
               case 11 -> 190;
               case 12 -> 221;
               case 13 -> 47;
               case 14 -> 72;
               case 15 -> 201;
               case 16 -> 12;
               case 17 -> 140;
               case 18 -> 232;
               case 19 -> 222;
               case 20 -> 143;
               case 21 -> 241;
               case 22 -> 33;
               case 23 -> 105;
               case 24 -> 29;
               case 25 -> 31;
               case 26 -> 0;
               case 27 -> 13;
               case 28 -> 179;
               case 29 -> 39;
               case 30 -> 147;
               case 31 -> 129;
               case 32 -> 103;
               case 33 -> 225;
               case 34 -> 122;
               case 35 -> 209;
               case 36 -> 100;
               case 37 -> 77;
               case 38 -> 206;
               case 39 -> 215;
               case 40 -> 128;
               case 41 -> 184;
               case 42 -> 125;
               case 43 -> 156;
               case 44 -> 151;
               case 45 -> 226;
               case 46 -> 16;
               case 47 -> 55;
               case 48 -> 219;
               case 49 -> 63;
               case 50 -> 18;
               case 51 -> 174;
               case 52 -> 104;
               case 53 -> 166;
               case 54 -> 64;
               case 55 -> 50;
               case 56 -> 123;
               case 57 -> 187;
               case 58 -> 60;
               case 59 -> 54;
               case 60 -> 169;
               case 61 -> 25;
               case 62 -> 9;
               case 63 -> 30;
               case 64 -> 3;
               case 65 -> 183;
               case 66 -> 36;
               case 67 -> 61;
               case 68 -> 24;
               case 69 -> 249;
               case 70 -> 252;
               case 71 -> 124;
               case 72 -> 176;
               case 73 -> 79;
               case 74 -> 238;
               case 75 -> 17;
               case 76 -> 218;
               case 77 -> 99;
               case 78 -> 200;
               case 79 -> 108;
               case 80 -> 85;
               case 81 -> 87;
               case 82 -> 56;
               case 83 -> 139;
               case 84 -> 231;
               case 85 -> 49;
               case 86 -> 58;
               case 87 -> 15;
               case 88 -> 136;
               case 89 -> 161;
               case 90 -> 141;
               case 91 -> 40;
               case 92 -> 42;
               case 93 -> 155;
               case 94 -> 149;
               case 95 -> 94;
               case 96 -> 173;
               case 97 -> 111;
               case 98 -> 107;
               case 99 -> 6;
               case 100 -> 89;
               case 101 -> 121;
               case 102 -> 92;
               case 103 -> 109;
               case 104 -> 67;
               case 105 -> 74;
               case 106 -> 148;
               case 107 -> 246;
               case 108 -> 95;
               case 109 -> 102;
               case 110 -> 27;
               case 111 -> 101;
               case 112 -> 116;
               case 113 -> 244;
               case 114 -> 126;
               case 115 -> 168;
               case 116 -> 216;
               case 117 -> 210;
               case 118 -> 191;
               case 119 -> 167;
               case 120 -> 152;
               case 121 -> 130;
               case 122 -> 43;
               case 123 -> 233;
               case 124 -> 134;
               case 125 -> 211;
               case 126 -> 117;
               case 127 -> 138;
               case 128 -> 197;
               case 129 -> 113;
               case 130 -> 199;
               case 131 -> 230;
               case 132 -> 207;
               case 133 -> 37;
               case 134 -> 52;
               case 135 -> 214;
               case 136 -> 135;
               case 137 -> 196;
               case 138 -> 91;
               case 139 -> 19;
               case 140 -> 21;
               case 141 -> 204;
               case 142 -> 1;
               case 143 -> 88;
               case 144 -> 212;
               case 145 -> 48;
               case 146 -> 46;
               case 147 -> 235;
               case 148 -> 255;
               case 149 -> 98;
               case 150 -> 153;
               case 151 -> 45;
               case 152 -> 10;
               case 153 -> 237;
               case 154 -> 41;
               case 155 -> 160;
               case 156 -> 247;
               case 157 -> 34;
               case 158 -> 234;
               case 159 -> 250;
               case 160 -> 224;
               case 161 -> 110;
               case 162 -> 223;
               case 163 -> 172;
               case 164 -> 248;
               case 165 -> 228;
               case 166 -> 120;
               case 167 -> 171;
               case 168 -> 5;
               case 169 -> 38;
               case 170 -> 28;
               case 171 -> 164;
               case 172 -> 80;
               case 173 -> 2;
               case 174 -> 133;
               case 175 -> 114;
               case 176 -> 144;
               case 177 -> 57;
               case 178 -> 185;
               case 179 -> 62;
               case 180 -> 162;
               case 181 -> 213;
               case 182 -> 157;
               case 183 -> 65;
               case 184 -> 175;
               case 185 -> 253;
               case 186 -> 189;
               case 187 -> 242;
               case 188 -> 51;
               case 189 -> 158;
               case 190 -> 90;
               case 191 -> 22;
               case 192 -> 53;
               case 193 -> 150;
               case 194 -> 81;
               case 195 -> 119;
               case 196 -> 192;
               case 197 -> 205;
               case 198 -> 26;
               case 199 -> 66;
               case 200 -> 83;
               case 201 -> 194;
               case 202 -> 188;
               case 203 -> 11;
               case 204 -> 84;
               case 205 -> 208;
               case 206 -> 115;
               case 207 -> 23;
               case 208 -> 32;
               case 209 -> 198;
               case 210 -> 76;
               case 211 -> 254;
               case 212 -> 180;
               case 213 -> 217;
               case 214 -> 7;
               case 215 -> 69;
               case 216 -> 170;
               case 217 -> 181;
               case 218 -> 165;
               case 219 -> 245;
               case 220 -> 112;
               case 221 -> 229;
               case 222 -> 159;
               case 223 -> 182;
               case 224 -> 44;
               case 225 -> 8;
               case 226 -> 239;
               case 227 -> 70;
               case 228 -> 240;
               case 229 -> 118;
               case 230 -> 35;
               case 231 -> 178;
               case 232 -> 251;
               case 233 -> 137;
               case 234 -> 97;
               case 235 -> 131;
               case 236 -> 193;
               case 237 -> 106;
               case 238 -> 93;
               case 239 -> 227;
               case 240 -> 177;
               case 241 -> 86;
               case 242 -> 186;
               case 243 -> 132;
               case 244 -> 68;
               case 245 -> 71;
               case 246 -> 236;
               case 247 -> 142;
               case 248 -> 243;
               case 249 -> 75;
               case 250 -> 202;
               case 251 -> 14;
               case 252 -> 195;
               case 253 -> 154;
               case 254 -> 4;
               default -> 78;
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
      public static final me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, net.minecraft.core.BlockPos var1, net.minecraft.world.level.block.state.BlockState var2, int var3, java.lang.Object var4) {
         java.lang.String var5 = g();
         if ((var3 & 1) != 0) {
            if (var5 != null) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var3 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }
         return var0.a(var1, var2);
      }
}


   public static Vec3 a(@NotNull me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll param0, @NotNull BlockPos param1, @Nullable Vec3 param2, @NotNull Vec3 param3, boolean param4, int param5, @Nullable Object param6) {
      boolean var7 = true;

      if (param6 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVisiblePoint");
      }

      if ((param5 & 2) != 0) {
         param2 = null;
      }

      if ((param5 & 8) != 0) {
         param4 = var7;
      }

      return param0.a(param1, param2, param3, param4);
   }

   public static boolean a(@NotNull me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll param0, @NotNull Vec3 param1, @NotNull BlockPos param2, @NotNull Vec3 param3, double param4, int param5, @Nullable Object param6) {
      boolean var8 = true;

      if (param6 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isSolidlyOnBlock");
      }

      if ((param5 & 8) != 0) {
         param4 = 0.12;
      }

      return param0.a(param1, param2, param3, param4);
   }

   public static void a(@NotNull me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll param0, @Nullable Vec3 param1, @Nullable Vec3 param2, int param3, @Nullable Object param4) {
      boolean var5 = true;

      if (param4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotateTo");
      }

      if ((param3 & 1) != 0) {
         param1 = null;
      }

      if ((param3 & 2) != 0) {
         param2 = null;
      }

      param0.a(param1, param2);
   }

   public static java.util.List a(@NotNull me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll param0, double param1, int param2, int param3, @Nullable Object param4) {
      boolean var6 = true;

      if (param4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNearbyPlayers");
      }

      if ((param3 & 1) != 0) {
         param1 = 10.0;
      }

      if ((param3 & 2) != 0) {
         param2 = 3;
      }

      return param0.a(param1, param2);
   }

   public static double a(@NotNull me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll param0, @NotNull Vec3 param1, double param2, double param3, int param4, @Nullable Object param5) {
      boolean var7 = true;

      if (param5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPlayerAvoidancePenalty");
      }

      if ((param4 & 4) != 0) {
         param3 = 30.0;
      }

      return param0.a(param1, param2, param3);
   }

   public static boolean b(@NotNull me.octo.client.IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll param0, @NotNull Vec3 param1, @Nullable Vec3 param2, int param3, @Nullable Object param4) {
      boolean var5 = true;

      if (param4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isPlayerObstructingTarget");
      }

      if ((param3 & 2) != 0) {
         param2 = param0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.player.getEyePosition();
      }

      return param0.b(param1, param2);
   }

   @NotNull
   public static final me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl T() {
      return IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
   }

   @NotNull
   public static final me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl U() {
      return llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
   }
   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl a() {
         return IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
      }

      @NotNull
      public final IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl b() {
         return IIIlIIlIIlIIlllllIIIIlllIllllllllIIIIlllIIlIIIllIlIIIIIlllIllIIllIlIlIlIIlIIIlIllIlll.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
      }
   
      // PX-FIX-ok: Kotlin synthetic default-ctor bridge (jar: <init>(DefaultConstructorMarker)V -> this())
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) {
         this();
      }
}
}
