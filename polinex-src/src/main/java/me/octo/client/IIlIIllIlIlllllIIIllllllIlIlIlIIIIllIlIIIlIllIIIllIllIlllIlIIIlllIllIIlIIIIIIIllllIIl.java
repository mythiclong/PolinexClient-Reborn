package me.octo.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
import me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
import me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import java.util.Collection;
import net.minecraft.world.inventory.ContainerInput;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import net.minecraft.world.item.ItemStack;
import java.util.Iterator;
import java.lang.invoke.LambdaMetafactory;
import net.minecraft.client.player.LocalPlayer;
import me.octo.client.utils.commission.PolinexDwarvenClaimPriorityGuard;
import me.octo.client.utils.dwarven.PolinexDwarvenSlayerTravelRecovery;
import net.minecraft.world.inventory.Slot;
import kotlin.text.StringsKt;
import me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;

public final class IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
    public static <T> T i(Object p0) { return null; } // PX-FIX mr4
    public static <T> T g(Object p0) { return null; } // PX-FIX mr4
    public static <T> T b(Object p0) { return null; } // PX-FIX mr4
    public static <T> T k(Object p0) { return null; } // PX-FIX mr3
   public static me.octo.client.PXDyn var10003 = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn var10004 = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn var10005 = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn var10006 = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn var4 = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn var5 = null; // PX-FIX missing field v2
   
   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @Nullable
   private IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @Nullable
   private IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @Nullable
   private IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private boolean lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   private boolean llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @NotNull
   private final ArrayList<BlockPos> lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @NotNull
   private final HashSet<Pair<String, BlockPos>> IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   private int lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   private int IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   private int lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   private boolean IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   @Nullable
   private BlockPos lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   @Nullable
   private IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI;
   private long IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   @Nullable
   private IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
   @Nullable
   private IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
   private int IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
   @NotNull
   private final List<Pair<String, Vec3>> llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll;
   @NotNull
   private static IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
   @NotNull
   private static List<String> IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
   @NotNull
   private static List<String> lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl;
   @NotNull
   private static List<String> lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll;
   @NotNull
   private static List<String> llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
   @NotNull
   private static Set<IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
   @NotNull
   private static Set<IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
   private static long IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
   private static long IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
   private static long llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
   private static int IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   private static int lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   private static double lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   private static String[] j;
   private static String[] k;

   public IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl() { me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4 = null; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
      short var10001 = -24396;
      short var10002 = -14509;
      var10002 = -24397;
       var10003 = -18947;
       var4 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
       var10004 = -24380;
       var10005 = -3352;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(),
         IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f(),
         IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
      };
      super("Dwarven Commission Macro", "Completes commissions in the Dwarven Mines.", var4, "Dwarven Mines", null, null, true, var1, 48, null);
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = new ArrayList<>();
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new HashSet<>();
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = 500;
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = 500;
      Pair[] var2 = new Pair[5];
      var10003 = -24354;
      var10004 = -1268;
      var2[0] = TuplesKt.to("e78c25ac8d793a73af31e5da3e8bf2d63a6c0026fde9a9682fc9caf615540c79", new Vec3(42.5, 134.5, 22.5));
      var10003 = -24379;
      var10004 = -26778;
      var2[1] = TuplesKt.to("e1172b17eb3318b841fa94be0b8fbd0b7cddb5add1d2b35ad5e6adc8ab7d5206", new Vec3(171.5, 150.0, 31.5));
      var10003 = -24374;
      var10004 = 22087;
      var2[2] = TuplesKt.to("c765fee97bcfae7c136b6a6b8ca95381af964d6aebc08bfdd2350af78e2cf51a", new Vec3(-72.5, 153.0, -10.5));
      var10003 = -24362;
      var10004 = 2853;
      var2[3] = TuplesKt.to("38dfab2a93e5b5030003cdb1e3ab82c115ae1fca75b45d756e274e0af2af5f50", new Vec3(58.5, 198.0, -8.5));
      var10003 = -24351;
      var10004 = -32457;
      var2[4] = TuplesKt.to("9a43322511f4bba710bd78c98c90e83ac92a2da0f05a0a6951089bace0cf203a", new Vec3(-132.5, 174.0, -50.5));
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = CollectionsKt.listOf(var2);
   }

   @NotNull
   @Override
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(true, true, true, false, false, null, 56, null);
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -24363;
      short var10002 = 278;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Dwarven commission travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = 10701;
                   var10005 = -28095;
                  var10005 = 10700;
                   var10006 = -14324;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = 10703;
                  short var10002x = 1448;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "0£ÚÚº®\u0004þ6ãz\u000bá\u001deþ\u0094ñ\u000fqcÉ]?û\u0085\u009eö\u0085dúPñëË.RsvÒ¹ôKÇ4À¨\u0085Z2¬w\u0093¾\u00106DtÙ\u0019\u001câ]\u0003È\u001b\u001b\u0005ë¾\u000fhGVÜgï\u0016ÀTæ¥þå\u0081%\u0002þËY©Ñ¬¬Ï\u009fZ\u0006\u0015ØµA\u0099®G\nÕVaÀ\u008fÈ\u008a¥ÇJòk\u008e\u0016HTv¥ìÀÃ%o\u007fÂL\tò¸Èh\u0013/²»ê`£\u0006s5\u0094\u009b\u0004\u008d\u008a\u0093¤\t\u008c·Ëü\u008d/M\u0002\u0003ï";
                   var4 = "0£ÚÚº®\u0004þ6ãz\u000bá\u001deþ\u0094ñ\u000fqcÉ]?û\u0085\u009eö\u0085dúPñëË.RsvÒ¹ôKÇ4À¨\u0085Z2¬w\u0093¾\u00106DtÙ\u0019\u001câ]\u0003È\u001b\u001b\u0005ë¾\u000fhGVÜgï\u0016ÀTæ¥þå\u0081%\u0002þËY©Ñ¬¬Ï\u009fZ\u0006\u0015ØµA\u0099®G\nÕVaÀ\u008fÈ\u008a¥ÇJòk\u008e\u0016HTv¥ìÀÃ%o\u007fÂL\tò¸Èh\u0013/²»ê`£\u0006s5\u0094\u009b\u0004\u008d\u008a\u0093¤\t\u008c·Ëü\u008d/M\u0002\u0003ï"
                     .length();
                  char var1 = 28;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 81;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 81;
                           var10006 = var6;
                        } else {
                           var13 = 81;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 81;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 111;
                              case 1 -> 36;
                              case 2 -> 65;
                              case 3 -> 120;
                              case 4 -> 125;
                              case 5 -> 12;
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

               private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
                  int var2 = (var0 ^ 10701) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 255;
                        case 1 -> 125;
                        case 2 -> 169;
                        case 3 -> 162;
                        case 4 -> 129;
                        case 5 -> 43;
                        case 6 -> 85;
                        case 7 -> 188;
                        case 8 -> 42;
                        case 9 -> 100;
                        case 10 -> 26;
                        case 11 -> 6;
                        case 12 -> 36;
                        case 13 -> 179;
                        case 14 -> 219;
                        case 15 -> 182;
                        case 16 -> 154;
                        case 17 -> 14;
                        case 18 -> 240;
                        case 19 -> 249;
                        case 20 -> 146;
                        case 21 -> 209;
                        case 22 -> 194;
                        case 23 -> 158;
                        case 24 -> 165;
                        case 25 -> 149;
                        case 26 -> 195;
                        case 27 -> 244;
                        case 28 -> 93;
                        case 29 -> 25;
                        case 30 -> 107;
                        case 31 -> 70;
                        case 32 -> 235;
                        case 33 -> 176;
                        case 34 -> 191;
                        case 35 -> 253;
                        case 36 -> 64;
                        case 37 -> 41;
                        case 38 -> 2;
                        case 39 -> 150;
                        case 40 -> 103;
                        case 41 -> 214;
                        case 42 -> 133;
                        case 43 -> 9;
                        case 44 -> 78;
                        case 45 -> 144;
                        case 46 -> 68;
                        case 47 -> 217;
                        case 48 -> 51;
                        case 49 -> 56;
                        case 50 -> 173;
                        case 51 -> 29;
                        case 52 -> 237;
                        case 53 -> 131;
                        case 54 -> 111;
                        case 55 -> 254;
                        case 56 -> 151;
                        case 57 -> 16;
                        case 58 -> 224;
                        case 59 -> 28;
                        case 60 -> 27;
                        case 61 -> 91;
                        case 62 -> 104;
                        case 63 -> 225;
                        case 64 -> 97;
                        case 65 -> 105;
                        case 66 -> 110;
                        case 67 -> 50;
                        case 68 -> 3;
                        case 69 -> 212;
                        case 70 -> 37;
                        case 71 -> 152;
                        case 72 -> 167;
                        case 73 -> 157;
                        case 74 -> 82;
                        case 75 -> 63;
                        case 76 -> 164;
                        case 77 -> 163;
                        case 78 -> 153;
                        case 79 -> 13;
                        case 80 -> 230;
                        case 81 -> 34;
                        case 82 -> 174;
                        case 83 -> 233;
                        case 84 -> 160;
                        case 85 -> 7;
                        case 86 -> 113;
                        case 87 -> 220;
                        case 88 -> 236;
                        case 89 -> 89;
                        case 90 -> 218;
                        case 91 -> 245;
                        case 92 -> 106;
                        case 93 -> 193;
                        case 94 -> 231;
                        case 95 -> 15;
                        case 96 -> 17;
                        case 97 -> 128;
                        case 98 -> 40;
                        case 99 -> 59;
                        case 100 -> 112;
                        case 101 -> 102;
                        case 102 -> 118;
                        case 103 -> 198;
                        case 104 -> 134;
                        case 105 -> 241;
                        case 106 -> 74;
                        case 107 -> 0;
                        case 108 -> 48;
                        case 109 -> 44;
                        case 110 -> 203;
                        case 111 -> 53;
                        case 112 -> 207;
                        case 113 -> 80;
                        case 114 -> 156;
                        case 115 -> 98;
                        case 116 -> 90;
                        case 117 -> 147;
                        case 118 -> 137;
                        case 119 -> 84;
                        case 120 -> 130;
                        case 121 -> 122;
                        case 122 -> 229;
                        case 123 -> 251;
                        case 124 -> 11;
                        case 125 -> 33;
                        case 126 -> 57;
                        case 127 -> 242;
                        case 128 -> 47;
                        case 129 -> 186;
                        case 130 -> 205;
                        case 131 -> 67;
                        case 132 -> 172;
                        case 133 -> 141;
                        case 134 -> 132;
                        case 135 -> 201;
                        case 136 -> 208;
                        case 137 -> 143;
                        case 138 -> 8;
                        case 139 -> 115;
                        case 140 -> 210;
                        case 141 -> 65;
                        case 142 -> 142;
                        case 143 -> 145;
                        case 144 -> 178;
                        case 145 -> 247;
                        case 146 -> 211;
                        case 147 -> 227;
                        case 148 -> 223;
                        case 149 -> 1;
                        case 150 -> 136;
                        case 151 -> 116;
                        case 152 -> 39;
                        case 153 -> 114;
                        case 154 -> 62;
                        case 155 -> 69;
                        case 156 -> 180;
                        case 157 -> 197;
                        case 158 -> 92;
                        case 159 -> 88;
                        case 160 -> 183;
                        case 161 -> 77;
                        case 162 -> 79;
                        case 163 -> 20;
                        case 164 -> 10;
                        case 165 -> 181;
                        case 166 -> 55;
                        case 167 -> 87;
                        case 168 -> 213;
                        case 169 -> 250;
                        case 170 -> 60;
                        case 171 -> 126;
                        case 172 -> 206;
                        case 173 -> 94;
                        case 174 -> 127;
                        case 175 -> 23;
                        case 176 -> 175;
                        case 177 -> 228;
                        case 178 -> 101;
                        case 179 -> 184;
                        case 180 -> 83;
                        case 181 -> 199;
                        case 182 -> 120;
                        case 183 -> 54;
                        case 184 -> 234;
                        case 185 -> 52;
                        case 186 -> 108;
                        case 187 -> 24;
                        case 188 -> 189;
                        case 189 -> 21;
                        case 190 -> 32;
                        case 191 -> 155;
                        case 192 -> 96;
                        case 193 -> 135;
                        case 194 -> 221;
                        case 195 -> 123;
                        case 196 -> 22;
                        case 197 -> 190;
                        case 198 -> 171;
                        case 199 -> 119;
                        case 200 -> 58;
                        case 201 -> 192;
                        case 202 -> 49;
                        case 203 -> 148;
                        case 204 -> 75;
                        case 205 -> 73;
                        case 206 -> 138;
                        case 207 -> 185;
                        case 208 -> 30;
                        case 209 -> 168;
                        case 210 -> 12;
                        case 211 -> 239;
                        case 212 -> 202;
                        case 213 -> 187;
                        case 214 -> 18;
                        case 215 -> 95;
                        case 216 -> 170;
                        case 217 -> 243;
                        case 218 -> 226;
                        case 219 -> 166;
                        case 220 -> 215;
                        case 221 -> 45;
                        case 222 -> 117;
                        case 223 -> 121;
                        case 224 -> 222;
                        case 225 -> 71;
                        case 226 -> 4;
                        case 227 -> 81;
                        case 228 -> 5;
                        case 229 -> 177;
                        case 230 -> 76;
                        case 231 -> 140;
                        case 232 -> 31;
                        case 233 -> 252;
                        case 234 -> 159;
                        case 235 -> 72;
                        case 236 -> 200;
                        case 237 -> 246;
                        case 238 -> 232;
                        case 239 -> 99;
                        case 240 -> 19;
                        case 241 -> 124;
                        case 242 -> 248;
                        case 243 -> 139;
                        case 244 -> 204;
                        case 245 -> 161;
                        case 246 -> 86;
                        case 247 -> 109;
                        case 248 -> 61;
                        case 249 -> 46;
                        case 250 -> 38;
                        case 251 -> 35;
                        case 252 -> 66;
                        case 253 -> 196;
                        case 254 -> 216;
                        default -> 238;
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
      var10000 = this;
      var10001 = -24392;
      var10002 = 8944;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Dwarven commission emissary",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI,
         120000L,
         0L,
         true,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = -30233;
                   var10005 = 5992;
                  var10005 = -30235;
                   var10006 = -16690;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -30236;
                  short var10002 = -32274;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "êï\u0086\u0081ºq\u0014\u001b¹XY÷1\u0092a\u0082\u0013¬tn\u001c4?\u0087e\u0019ùu\u0093râ»\u0016\u001d\u008dÞGÞ\\Ø!y\u0085\u0004ìf»\f\u009d¢¨\u00adè\u001cøÍ\u0098\u0006N\u0099ÄWrmUðr6\u000f\u0088ç\u008b¡\u008c9Qè\t\u0087ý(\u0097a\u0099\u008e((Ý¬ßþ|Ä÷eWl¤®\u000e\t<\tbJËR\u0001\u0092\u00896\u007fduuv\"\u008f®ÒÎ£\u0001ÝaÐ*\u0001\u0018ø|\u001bc\u0002¿V\u001c´RM6Ã\u0087;Å\\\u0083å\u008c¦ý\u0093oM\u0011¿ÙeÂ\u0010Y\u0080ÂE\u000e";
                   var4 = "êï\u0086\u0081ºq\u0014\u001b¹XY÷1\u0092a\u0082\u0013¬tn\u001c4?\u0087e\u0019ùu\u0093râ»\u0016\u001d\u008dÞGÞ\\Ø!y\u0085\u0004ìf»\f\u009d¢¨\u00adè\u001cøÍ\u0098\u0006N\u0099ÄWrmUðr6\u000f\u0088ç\u008b¡\u008c9Qè\t\u0087ý(\u0097a\u0099\u008e((Ý¬ßþ|Ä÷eWl¤®\u000e\t<\tbJËR\u0001\u0092\u00896\u007fduuv\"\u008f®ÒÎ£\u0001ÝaÐ*\u0001\u0018ø|\u001bc\u0002¿V\u001c´RM6Ã\u0087;Å\\\u0083å\u008c¦ý\u0093oM\u0011¿ÙeÂ\u0010Y\u0080ÂE\u000e"
                     .length();
                  char var1 = 133;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 52;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 52;
                           var10006 = var6;
                        } else {
                           var13 = 52;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 52;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 90;
                              case 1 -> 102;
                              case 2 -> 41;
                              case 3 -> 43;
                              case 4 -> 50;
                              case 5 -> 27;
                              default -> 18;
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

               private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
                  int var2 = (var0 ^ -30235) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 17;
                        case 1 -> 63;
                        case 2 -> 122;
                        case 3 -> 234;
                        case 4 -> 127;
                        case 5 -> 108;
                        case 6 -> 150;
                        case 7 -> 231;
                        case 8 -> 194;
                        case 9 -> 38;
                        case 10 -> 218;
                        case 11 -> 190;
                        case 12 -> 93;
                        case 13 -> 229;
                        case 14 -> 125;
                        case 15 -> 167;
                        case 16 -> 35;
                        case 17 -> 104;
                        case 18 -> 169;
                        case 19 -> 86;
                        case 20 -> 0;
                        case 21 -> 164;
                        case 22 -> 171;
                        case 23 -> 21;
                        case 24 -> 126;
                        case 25 -> 255;
                        case 26 -> 172;
                        case 27 -> 61;
                        case 28 -> 118;
                        case 29 -> 197;
                        case 30 -> 133;
                        case 31 -> 115;
                        case 32 -> 222;
                        case 33 -> 16;
                        case 34 -> 130;
                        case 35 -> 188;
                        case 36 -> 12;
                        case 37 -> 191;
                        case 38 -> 82;
                        case 39 -> 139;
                        case 40 -> 141;
                        case 41 -> 223;
                        case 42 -> 159;
                        case 43 -> 49;
                        case 44 -> 215;
                        case 45 -> 116;
                        case 46 -> 146;
                        case 47 -> 4;
                        case 48 -> 153;
                        case 49 -> 179;
                        case 50 -> 244;
                        case 51 -> 60;
                        case 52 -> 96;
                        case 53 -> 114;
                        case 54 -> 247;
                        case 55 -> 15;
                        case 56 -> 178;
                        case 57 -> 196;
                        case 58 -> 47;
                        case 59 -> 72;
                        case 60 -> 78;
                        case 61 -> 98;
                        case 62 -> 205;
                        case 63 -> 170;
                        case 64 -> 143;
                        case 65 -> 242;
                        case 66 -> 123;
                        case 67 -> 100;
                        case 68 -> 129;
                        case 69 -> 23;
                        case 70 -> 180;
                        case 71 -> 235;
                        case 72 -> 57;
                        case 73 -> 67;
                        case 74 -> 85;
                        case 75 -> 252;
                        case 76 -> 161;
                        case 77 -> 243;
                        case 78 -> 107;
                        case 79 -> 210;
                        case 80 -> 200;
                        case 81 -> 25;
                        case 82 -> 214;
                        case 83 -> 238;
                        case 84 -> 110;
                        case 85 -> 195;
                        case 86 -> 29;
                        case 87 -> 18;
                        case 88 -> 101;
                        case 89 -> 137;
                        case 90 -> 50;
                        case 91 -> 105;
                        case 92 -> 73;
                        case 93 -> 151;
                        case 94 -> 97;
                        case 95 -> 19;
                        case 96 -> 119;
                        case 97 -> 147;
                        case 98 -> 6;
                        case 99 -> 174;
                        case 100 -> 46;
                        case 101 -> 241;
                        case 102 -> 14;
                        case 103 -> 87;
                        case 104 -> 216;
                        case 105 -> 237;
                        case 106 -> 204;
                        case 107 -> 132;
                        case 108 -> 224;
                        case 109 -> 111;
                        case 110 -> 109;
                        case 111 -> 76;
                        case 112 -> 148;
                        case 113 -> 128;
                        case 114 -> 166;
                        case 115 -> 131;
                        case 116 -> 154;
                        case 117 -> 62;
                        case 118 -> 168;
                        case 119 -> 28;
                        case 120 -> 199;
                        case 121 -> 51;
                        case 122 -> 44;
                        case 123 -> 88;
                        case 124 -> 22;
                        case 125 -> 75;
                        case 126 -> 239;
                        case 127 -> 230;
                        case 128 -> 32;
                        case 129 -> 120;
                        case 130 -> 41;
                        case 131 -> 10;
                        case 132 -> 226;
                        case 133 -> 246;
                        case 134 -> 240;
                        case 135 -> 138;
                        case 136 -> 83;
                        case 137 -> 58;
                        case 138 -> 144;
                        case 139 -> 55;
                        case 140 -> 74;
                        case 141 -> 80;
                        case 142 -> 160;
                        case 143 -> 65;
                        case 144 -> 2;
                        case 145 -> 251;
                        case 146 -> 106;
                        case 147 -> 134;
                        case 148 -> 11;
                        case 149 -> 42;
                        case 150 -> 175;
                        case 151 -> 208;
                        case 152 -> 184;
                        case 153 -> 201;
                        case 154 -> 155;
                        case 155 -> 219;
                        case 156 -> 45;
                        case 157 -> 198;
                        case 158 -> 187;
                        case 159 -> 202;
                        case 160 -> 189;
                        case 161 -> 245;
                        case 162 -> 84;
                        case 163 -> 59;
                        case 164 -> 24;
                        case 165 -> 173;
                        case 166 -> 113;
                        case 167 -> 217;
                        case 168 -> 227;
                        case 169 -> 181;
                        case 170 -> 232;
                        case 171 -> 3;
                        case 172 -> 225;
                        case 173 -> 221;
                        case 174 -> 152;
                        case 175 -> 94;
                        case 176 -> 40;
                        case 177 -> 99;
                        case 178 -> 54;
                        case 179 -> 158;
                        case 180 -> 254;
                        case 181 -> 162;
                        case 182 -> 145;
                        case 183 -> 90;
                        case 184 -> 249;
                        case 185 -> 212;
                        case 186 -> 236;
                        case 187 -> 8;
                        case 188 -> 56;
                        case 189 -> 112;
                        case 190 -> 27;
                        case 191 -> 36;
                        case 192 -> 68;
                        case 193 -> 211;
                        case 194 -> 79;
                        case 195 -> 9;
                        case 196 -> 71;
                        case 197 -> 48;
                        case 198 -> 13;
                        case 199 -> 64;
                        case 200 -> 163;
                        case 201 -> 89;
                        case 202 -> 5;
                        case 203 -> 253;
                        case 204 -> 156;
                        case 205 -> 34;
                        case 206 -> 135;
                        case 207 -> 183;
                        case 208 -> 142;
                        case 209 -> 77;
                        case 210 -> 176;
                        case 211 -> 186;
                        case 212 -> 30;
                        case 213 -> 31;
                        case 214 -> 91;
                        case 215 -> 213;
                        case 216 -> 52;
                        case 217 -> 233;
                        case 218 -> 182;
                        case 219 -> 7;
                        case 220 -> 177;
                        case 221 -> 248;
                        case 222 -> 203;
                        case 223 -> 228;
                        case 224 -> 121;
                        case 225 -> 102;
                        case 226 -> 209;
                        case 227 -> 193;
                        case 228 -> 206;
                        case 229 -> 117;
                        case 230 -> 136;
                        case 231 -> 43;
                        case 232 -> 33;
                        case 233 -> 92;
                        case 234 -> 66;
                        case 235 -> 81;
                        case 236 -> 69;
                        case 237 -> 185;
                        case 238 -> 149;
                        case 239 -> 157;
                        case 240 -> 124;
                        case 241 -> 165;
                        case 242 -> 39;
                        case 243 -> 1;
                        case 244 -> 103;
                        case 245 -> 220;
                        case 246 -> 95;
                        case 247 -> 250;
                        case 248 -> 140;
                        case 249 -> 70;
                        case 250 -> 53;
                        case 251 -> 26;
                        case 252 -> 192;
                        case 253 -> 37;
                        case 254 -> 20;
                        default -> 207;
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
      var10000 = this;
      var10001 = -24337;
      var10002 = -1224;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Dwarven commission pigeon",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI,
         15000L,
         0L,
         true,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = -20761;
                   var10005 = -8244;
                  var10005 = -20764;
                   var10006 = -20200;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -20762;
                  short var10002 = 1565;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ÉR\u001cçÃã)¥áÊnG2«\têp}ûT®/«JëÐ¸µMfÂ\u0085¯ñêo\u0084)îwÃ\u0011;møü?j\u001c\u009c&ík#ô¡1nö¦\u0015-ö}'@\u0096\u0012\u0001\u0083¹À\u0018GÅæ \u0017\u0091§å°\u0082+\u0080\u007fp\u009cî\tDU6K\u0011\u0089\u001c¨v\u008e\n¢ ë\u009d\u00ad\rðSZÕSOñ\bhÄ3¥\u0093®\u0093\u0083\u0092Nî\u0019Çf\u008b\u0088Î\t\tºA\u0001È\u001e¥6®'¦!k\u0019\u0098\u001c×T¾´êcG¨¾té\u0017È.\u0098\u0014";
                   var4 = "ÉR\u001cçÃã)¥áÊnG2«\têp}ûT®/«JëÐ¸µMfÂ\u0085¯ñêo\u0084)îwÃ\u0011;møü?j\u001c\u009c&ík#ô¡1nö¦\u0015-ö}'@\u0096\u0012\u0001\u0083¹À\u0018GÅæ \u0017\u0091§å°\u0082+\u0080\u007fp\u009cî\tDU6K\u0011\u0089\u001c¨v\u008e\n¢ ë\u009d\u00ad\rðSZÕSOñ\bhÄ3¥\u0093®\u0093\u0083\u0092Nî\u0019Çf\u008b\u0088Î\t\tºA\u0001È\u001e¥6®'¦!k\u0019\u0098\u001c×T¾´êcG¨¾té\u0017È.\u0098\u0014"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
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
                              case 0 -> 98;
                              case 1 -> 82;
                              case 2 -> 91;
                              case 3 -> 49;
                              case 4 -> 126;
                              case 5 -> 108;
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

               private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
                  int var2 = (var0 ^ -20762) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 102;
                        case 1 -> 244;
                        case 2 -> 58;
                        case 3 -> 134;
                        case 4 -> 55;
                        case 5 -> 122;
                        case 6 -> 252;
                        case 7 -> 146;
                        case 8 -> 100;
                        case 9 -> 144;
                        case 10 -> 121;
                        case 11 -> 34;
                        case 12 -> 29;
                        case 13 -> 137;
                        case 14 -> 218;
                        case 15 -> 83;
                        case 16 -> 118;
                        case 17 -> 85;
                        case 18 -> 67;
                        case 19 -> 40;
                        case 20 -> 31;
                        case 21 -> 59;
                        case 22 -> 234;
                        case 23 -> 30;
                        case 24 -> 253;
                        case 25 -> 74;
                        case 26 -> 87;
                        case 27 -> 126;
                        case 28 -> 110;
                        case 29 -> 42;
                        case 30 -> 22;
                        case 31 -> 46;
                        case 32 -> 213;
                        case 33 -> 251;
                        case 34 -> 97;
                        case 35 -> 204;
                        case 36 -> 157;
                        case 37 -> 73;
                        case 38 -> 132;
                        case 39 -> 79;
                        case 40 -> 75;
                        case 41 -> 245;
                        case 42 -> 71;
                        case 43 -> 161;
                        case 44 -> 246;
                        case 45 -> 196;
                        case 46 -> 68;
                        case 47 -> 189;
                        case 48 -> 66;
                        case 49 -> 50;
                        case 50 -> 193;
                        case 51 -> 61;
                        case 52 -> 182;
                        case 53 -> 19;
                        case 54 -> 11;
                        case 55 -> 216;
                        case 56 -> 101;
                        case 57 -> 243;
                        case 58 -> 6;
                        case 59 -> 225;
                        case 60 -> 123;
                        case 61 -> 127;
                        case 62 -> 9;
                        case 63 -> 111;
                        case 64 -> 64;
                        case 65 -> 33;
                        case 66 -> 247;
                        case 67 -> 13;
                        case 68 -> 44;
                        case 69 -> 208;
                        case 70 -> 148;
                        case 71 -> 183;
                        case 72 -> 162;
                        case 73 -> 249;
                        case 74 -> 156;
                        case 75 -> 147;
                        case 76 -> 93;
                        case 77 -> 25;
                        case 78 -> 16;
                        case 79 -> 80;
                        case 80 -> 108;
                        case 81 -> 195;
                        case 82 -> 221;
                        case 83 -> 2;
                        case 84 -> 235;
                        case 85 -> 173;
                        case 86 -> 4;
                        case 87 -> 82;
                        case 88 -> 39;
                        case 89 -> 187;
                        case 90 -> 124;
                        case 91 -> 191;
                        case 92 -> 15;
                        case 93 -> 43;
                        case 94 -> 152;
                        case 95 -> 186;
                        case 96 -> 119;
                        case 97 -> 48;
                        case 98 -> 70;
                        case 99 -> 166;
                        case 100 -> 109;
                        case 101 -> 76;
                        case 102 -> 89;
                        case 103 -> 92;
                        case 104 -> 129;
                        case 105 -> 241;
                        case 106 -> 220;
                        case 107 -> 223;
                        case 108 -> 151;
                        case 109 -> 81;
                        case 110 -> 242;
                        case 111 -> 62;
                        case 112 -> 170;
                        case 113 -> 185;
                        case 114 -> 52;
                        case 115 -> 69;
                        case 116 -> 238;
                        case 117 -> 57;
                        case 118 -> 239;
                        case 119 -> 38;
                        case 120 -> 99;
                        case 121 -> 211;
                        case 122 -> 171;
                        case 123 -> 104;
                        case 124 -> 96;
                        case 125 -> 133;
                        case 126 -> 177;
                        case 127 -> 23;
                        case 128 -> 78;
                        case 129 -> 143;
                        case 130 -> 54;
                        case 131 -> 116;
                        case 132 -> 227;
                        case 133 -> 138;
                        case 134 -> 232;
                        case 135 -> 41;
                        case 136 -> 107;
                        case 137 -> 150;
                        case 138 -> 178;
                        case 139 -> 27;
                        case 140 -> 154;
                        case 141 -> 198;
                        case 142 -> 103;
                        case 143 -> 231;
                        case 144 -> 176;
                        case 145 -> 91;
                        case 146 -> 45;
                        case 147 -> 164;
                        case 148 -> 18;
                        case 149 -> 158;
                        case 150 -> 205;
                        case 151 -> 181;
                        case 152 -> 53;
                        case 153 -> 1;
                        case 154 -> 210;
                        case 155 -> 217;
                        case 156 -> 149;
                        case 157 -> 8;
                        case 158 -> 207;
                        case 159 -> 224;
                        case 160 -> 14;
                        case 161 -> 47;
                        case 162 -> 172;
                        case 163 -> 248;
                        case 164 -> 95;
                        case 165 -> 28;
                        case 166 -> 17;
                        case 167 -> 192;
                        case 168 -> 153;
                        case 169 -> 7;
                        case 170 -> 125;
                        case 171 -> 169;
                        case 172 -> 35;
                        case 173 -> 49;
                        case 174 -> 203;
                        case 175 -> 12;
                        case 176 -> 63;
                        case 177 -> 88;
                        case 178 -> 226;
                        case 179 -> 197;
                        case 180 -> 202;
                        case 181 -> 236;
                        case 182 -> 115;
                        case 183 -> 106;
                        case 184 -> 222;
                        case 185 -> 214;
                        case 186 -> 160;
                        case 187 -> 254;
                        case 188 -> 5;
                        case 189 -> 145;
                        case 190 -> 180;
                        case 191 -> 128;
                        case 192 -> 184;
                        case 193 -> 250;
                        case 194 -> 51;
                        case 195 -> 26;
                        case 196 -> 163;
                        case 197 -> 136;
                        case 198 -> 190;
                        case 199 -> 98;
                        case 200 -> 94;
                        case 201 -> 168;
                        case 202 -> 165;
                        case 203 -> 215;
                        case 204 -> 237;
                        case 205 -> 200;
                        case 206 -> 201;
                        case 207 -> 37;
                        case 208 -> 179;
                        case 209 -> 3;
                        case 210 -> 230;
                        case 211 -> 199;
                        case 212 -> 20;
                        case 213 -> 24;
                        case 214 -> 155;
                        case 215 -> 120;
                        case 216 -> 56;
                        case 217 -> 139;
                        case 218 -> 113;
                        case 219 -> 159;
                        case 220 -> 255;
                        case 221 -> 228;
                        case 222 -> 130;
                        case 223 -> 60;
                        case 224 -> 142;
                        case 225 -> 140;
                        case 226 -> 21;
                        case 227 -> 112;
                        case 228 -> 0;
                        case 229 -> 141;
                        case 230 -> 105;
                        case 231 -> 240;
                        case 232 -> 229;
                        case 233 -> 72;
                        case 234 -> 175;
                        case 235 -> 131;
                        case 236 -> 32;
                        case 237 -> 84;
                        case 238 -> 65;
                        case 239 -> 219;
                        case 240 -> 233;
                        case 241 -> 86;
                        case 242 -> 90;
                        case 243 -> 167;
                        case 244 -> 117;
                        case 245 -> 114;
                        case 246 -> 135;
                        case 247 -> 188;
                        case 248 -> 209;
                        case 249 -> 77;
                        case 250 -> 36;
                        case 251 -> 174;
                        case 252 -> 10;
                        case 253 -> 206;
                        case 254 -> 194;
                        default -> 212;
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
      var10000 = this;
      var10001 = -24338;
      var10002 = 18420;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Dwarven commission route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
         60000L,
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

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = 29190;
                   var10005 = 31166;
                  var10005 = 29188;
                   var10006 = 28694;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 29191;
                  short var10002 = 246;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "µI\u0003Òÿ\u0094ÍEâýµ¶#ËÁÉiBÎ<:\u009c\u009büv\u0083\u0014W\u0002\u001at\u0085Ì',\u001f\u001a-qru\u001bGj}P\nº\u0010,áñß%'Ëáeæ\u008b\u0092Í¬Ë*\u009c{\fùê\f«¤f×\u0087È\u0091Ê}Ân#Z\u001e\u0017©ÝPd9Rß¡`Qw\u0019±þøàûæL¦q\u009b\u0090²èäBA£24=\u0011ø~ôÕûÁiBq\u0007\u0011!Ø\u0096a\u000fFû\u00ad\u0004£ß(\u0010:B½ßè\u0082ÓË»\u0002à\u001f@-\u0012A9\u001bxé\u0084 ";
                   var4 = "µI\u0003Òÿ\u0094ÍEâýµ¶#ËÁÉiBÎ<:\u009c\u009büv\u0083\u0014W\u0002\u001at\u0085Ì',\u001f\u001a-qru\u001bGj}P\nº\u0010,áñß%'Ëáeæ\u008b\u0092Í¬Ë*\u009c{\fùê\f«¤f×\u0087È\u0091Ê}Ân#Z\u001e\u0017©ÝPd9Rß¡`Qw\u0019±þøàûæL¦q\u009b\u0090²èäBA£24=\u0011ø~ôÕûÁiBq\u0007\u0011!Ø\u0096a\u000fFû\u00ad\u0004£ß(\u0010:B½ßè\u0082ÓË»\u0002à\u001f@-\u0012A9\u001bxé\u0084 "
                     .length();
                  char var1 = 28;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 95;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 95;
                           var10006 = var6;
                        } else {
                           var13 = 95;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 95;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 59;
                              case 1 -> 3;
                              case 2 -> 109;
                              case 3 -> 6;
                              case 4 -> 73;
                              case 5 -> 55;
                              default -> 10;
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

               private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
                  int var2 = (var0 ^ 29190) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 6;
                        case 1 -> 46;
                        case 2 -> 245;
                        case 3 -> 54;
                        case 4 -> 166;
                        case 5 -> 27;
                        case 6 -> 231;
                        case 7 -> 191;
                        case 8 -> 171;
                        case 9 -> 152;
                        case 10 -> 168;
                        case 11 -> 200;
                        case 12 -> 247;
                        case 13 -> 45;
                        case 14 -> 26;
                        case 15 -> 89;
                        case 16 -> 136;
                        case 17 -> 99;
                        case 18 -> 235;
                        case 19 -> 218;
                        case 20 -> 2;
                        case 21 -> 242;
                        case 22 -> 42;
                        case 23 -> 141;
                        case 24 -> 221;
                        case 25 -> 105;
                        case 26 -> 123;
                        case 27 -> 214;
                        case 28 -> 55;
                        case 29 -> 146;
                        case 30 -> 151;
                        case 31 -> 0;
                        case 32 -> 64;
                        case 33 -> 60;
                        case 34 -> 175;
                        case 35 -> 75;
                        case 36 -> 3;
                        case 37 -> 137;
                        case 38 -> 194;
                        case 39 -> 4;
                        case 40 -> 149;
                        case 41 -> 103;
                        case 42 -> 101;
                        case 43 -> 23;
                        case 44 -> 222;
                        case 45 -> 130;
                        case 46 -> 61;
                        case 47 -> 112;
                        case 48 -> 176;
                        case 49 -> 252;
                        case 50 -> 110;
                        case 51 -> 108;
                        case 52 -> 62;
                        case 53 -> 67;
                        case 54 -> 197;
                        case 55 -> 129;
                        case 56 -> 58;
                        case 57 -> 162;
                        case 58 -> 243;
                        case 59 -> 217;
                        case 60 -> 240;
                        case 61 -> 7;
                        case 62 -> 29;
                        case 63 -> 249;
                        case 64 -> 114;
                        case 65 -> 188;
                        case 66 -> 170;
                        case 67 -> 189;
                        case 68 -> 178;
                        case 69 -> 253;
                        case 70 -> 85;
                        case 71 -> 88;
                        case 72 -> 24;
                        case 73 -> 234;
                        case 74 -> 131;
                        case 75 -> 118;
                        case 76 -> 30;
                        case 77 -> 233;
                        case 78 -> 134;
                        case 79 -> 204;
                        case 80 -> 111;
                        case 81 -> 209;
                        case 82 -> 68;
                        case 83 -> 254;
                        case 84 -> 91;
                        case 85 -> 11;
                        case 86 -> 65;
                        case 87 -> 180;
                        case 88 -> 154;
                        case 89 -> 133;
                        case 90 -> 206;
                        case 91 -> 120;
                        case 92 -> 185;
                        case 93 -> 161;
                        case 94 -> 119;
                        case 95 -> 83;
                        case 96 -> 251;
                        case 97 -> 246;
                        case 98 -> 138;
                        case 99 -> 169;
                        case 100 -> 66;
                        case 101 -> 193;
                        case 102 -> 227;
                        case 103 -> 183;
                        case 104 -> 143;
                        case 105 -> 76;
                        case 106 -> 17;
                        case 107 -> 237;
                        case 108 -> 144;
                        case 109 -> 21;
                        case 110 -> 78;
                        case 111 -> 15;
                        case 112 -> 79;
                        case 113 -> 236;
                        case 114 -> 50;
                        case 115 -> 248;
                        case 116 -> 51;
                        case 117 -> 211;
                        case 118 -> 40;
                        case 119 -> 196;
                        case 120 -> 207;
                        case 121 -> 135;
                        case 122 -> 230;
                        case 123 -> 74;
                        case 124 -> 73;
                        case 125 -> 195;
                        case 126 -> 232;
                        case 127 -> 127;
                        case 128 -> 219;
                        case 129 -> 140;
                        case 130 -> 117;
                        case 131 -> 165;
                        case 132 -> 163;
                        case 133 -> 190;
                        case 134 -> 63;
                        case 135 -> 69;
                        case 136 -> 115;
                        case 137 -> 177;
                        case 138 -> 142;
                        case 139 -> 220;
                        case 140 -> 150;
                        case 141 -> 34;
                        case 142 -> 121;
                        case 143 -> 59;
                        case 144 -> 98;
                        case 145 -> 182;
                        case 146 -> 38;
                        case 147 -> 216;
                        case 148 -> 1;
                        case 149 -> 192;
                        case 150 -> 37;
                        case 151 -> 122;
                        case 152 -> 31;
                        case 153 -> 202;
                        case 154 -> 39;
                        case 155 -> 49;
                        case 156 -> 81;
                        case 157 -> 198;
                        case 158 -> 148;
                        case 159 -> 125;
                        case 160 -> 203;
                        case 161 -> 18;
                        case 162 -> 36;
                        case 163 -> 87;
                        case 164 -> 57;
                        case 165 -> 9;
                        case 166 -> 184;
                        case 167 -> 19;
                        case 168 -> 86;
                        case 169 -> 25;
                        case 170 -> 94;
                        case 171 -> 32;
                        case 172 -> 90;
                        case 173 -> 93;
                        case 174 -> 174;
                        case 175 -> 187;
                        case 176 -> 244;
                        case 177 -> 145;
                        case 178 -> 107;
                        case 179 -> 212;
                        case 180 -> 14;
                        case 181 -> 255;
                        case 182 -> 167;
                        case 183 -> 84;
                        case 184 -> 82;
                        case 185 -> 77;
                        case 186 -> 238;
                        case 187 -> 139;
                        case 188 -> 160;
                        case 189 -> 97;
                        case 190 -> 225;
                        case 191 -> 158;
                        case 192 -> 10;
                        case 193 -> 213;
                        case 194 -> 215;
                        case 195 -> 12;
                        case 196 -> 226;
                        case 197 -> 102;
                        case 198 -> 106;
                        case 199 -> 113;
                        case 200 -> 179;
                        case 201 -> 109;
                        case 202 -> 250;
                        case 203 -> 153;
                        case 204 -> 104;
                        case 205 -> 70;
                        case 206 -> 100;
                        case 207 -> 56;
                        case 208 -> 95;
                        case 209 -> 5;
                        case 210 -> 157;
                        case 211 -> 20;
                        case 212 -> 43;
                        case 213 -> 205;
                        case 214 -> 210;
                        case 215 -> 223;
                        case 216 -> 48;
                        case 217 -> 199;
                        case 218 -> 13;
                        case 219 -> 155;
                        case 220 -> 156;
                        case 221 -> 71;
                        case 222 -> 172;
                        case 223 -> 173;
                        case 224 -> 52;
                        case 225 -> 47;
                        case 226 -> 224;
                        case 227 -> 33;
                        case 228 -> 228;
                        case 229 -> 16;
                        case 230 -> 181;
                        case 231 -> 186;
                        case 232 -> 159;
                        case 233 -> 208;
                        case 234 -> 164;
                        case 235 -> 132;
                        case 236 -> 229;
                        case 237 -> 126;
                        case 238 -> 72;
                        case 239 -> 239;
                        case 240 -> 53;
                        case 241 -> 92;
                        case 242 -> 44;
                        case 243 -> 96;
                        case 244 -> 35;
                        case 245 -> 80;
                        case 246 -> 41;
                        case 247 -> 8;
                        case 248 -> 147;
                        case 249 -> 201;
                        case 250 -> 241;
                        case 251 -> 28;
                        case 252 -> 128;
                        case 253 -> 22;
                        case 254 -> 116;
                        default -> 124;
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
      int var8 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var14 = this;
      var10002 = -24372;
      short var10003 = -9596;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var14,
         "Dwarven commission mining",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         15000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl::g),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = -22382;
                   var10005 = -18903;
                  var10005 = -22383;
                   var10006 = 4280;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -22381;
                  short var10002 = -817;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "qn\u001cßE¬·âÚà\u001dÇ\u0014õcÉÿ\rÏ\u0012fIZDÁÔµ{BWá\u0085¦W\u0083õ\u0007\u0092\\\u0014P5\u0007G\u0097{Æ_ktf\u0018¡\u0089h¼ìc¥Åk\u0084q\u0006yÇ\u009föåWkôª\u0003\u0087« ð?³ò&¥±*\u0082ÍáMcxV\u001fÃö\u008c%@\u001f=Ï\u0016\u008c¸@\u0089\u0018\u009c3Ã\u001c(80\u000e\u0092\u0010©w\u008eZØßï\u0000\t\u009e\u0095~\u0003\u009f\u001a£ÝA3¼\u0092l¦6`Ï½(Íp\u0002\u009flæÝ'Î_mÇ9\u008dÜ` nmÞ";
                   var4 = "qn\u001cßE¬·âÚà\u001dÇ\u0014õcÉÿ\rÏ\u0012fIZDÁÔµ{BWá\u0085¦W\u0083õ\u0007\u0092\\\u0014P5\u0007G\u0097{Æ_ktf\u0018¡\u0089h¼ìc¥Åk\u0084q\u0006yÇ\u009föåWkôª\u0003\u0087« ð?³ò&¥±*\u0082ÍáMcxV\u001fÃö\u008c%@\u001f=Ï\u0016\u008c¸@\u0089\u0018\u009c3Ã\u001c(80\u000e\u0092\u0010©w\u008eZØßï\u0000\t\u009e\u0095~\u0003\u009f\u001a£ÝA3¼\u0092l¦6`Ï½(Íp\u0002\u009flæÝ'Î_mÇ9\u008dÜ` nmÞ"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 27;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 27;
                           var10006 = var6;
                        } else {
                           var13 = 27;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 27;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 3;
                              case 1 -> 3;
                              case 2 -> 68;
                              case 3 -> 46;
                              case 4 -> 72;
                              case 5 -> 28;
                              default -> 104;
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

               private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
                  int var2 = (var0 ^ -22381) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 135;
                        case 1 -> 25;
                        case 2 -> 113;
                        case 3 -> 146;
                        case 4 -> 165;
                        case 5 -> 178;
                        case 6 -> 172;
                        case 7 -> 55;
                        case 8 -> 26;
                        case 9 -> 97;
                        case 10 -> 127;
                        case 11 -> 102;
                        case 12 -> 50;
                        case 13 -> 207;
                        case 14 -> 35;
                        case 15 -> 62;
                        case 16 -> 177;
                        case 17 -> 240;
                        case 18 -> 49;
                        case 19 -> 45;
                        case 20 -> 82;
                        case 21 -> 123;
                        case 22 -> 3;
                        case 23 -> 73;
                        case 24 -> 20;
                        case 25 -> 93;
                        case 26 -> 140;
                        case 27 -> 228;
                        case 28 -> 94;
                        case 29 -> 194;
                        case 30 -> 108;
                        case 31 -> 244;
                        case 32 -> 85;
                        case 33 -> 38;
                        case 34 -> 65;
                        case 35 -> 67;
                        case 36 -> 27;
                        case 37 -> 7;
                        case 38 -> 241;
                        case 39 -> 187;
                        case 40 -> 129;
                        case 41 -> 239;
                        case 42 -> 14;
                        case 43 -> 195;
                        case 44 -> 212;
                        case 45 -> 141;
                        case 46 -> 76;
                        case 47 -> 196;
                        case 48 -> 223;
                        case 49 -> 6;
                        case 50 -> 105;
                        case 51 -> 131;
                        case 52 -> 23;
                        case 53 -> 68;
                        case 54 -> 104;
                        case 55 -> 203;
                        case 56 -> 171;
                        case 57 -> 128;
                        case 58 -> 32;
                        case 59 -> 229;
                        case 60 -> 134;
                        case 61 -> 119;
                        case 62 -> 175;
                        case 63 -> 39;
                        case 64 -> 181;
                        case 65 -> 90;
                        case 66 -> 200;
                        case 67 -> 170;
                        case 68 -> 232;
                        case 69 -> 64;
                        case 70 -> 211;
                        case 71 -> 174;
                        case 72 -> 11;
                        case 73 -> 13;
                        case 74 -> 215;
                        case 75 -> 15;
                        case 76 -> 209;
                        case 77 -> 70;
                        case 78 -> 9;
                        case 79 -> 77;
                        case 80 -> 126;
                        case 81 -> 33;
                        case 82 -> 72;
                        case 83 -> 147;
                        case 84 -> 246;
                        case 85 -> 183;
                        case 86 -> 130;
                        case 87 -> 75;
                        case 88 -> 158;
                        case 89 -> 69;
                        case 90 -> 145;
                        case 91 -> 18;
                        case 92 -> 52;
                        case 93 -> 210;
                        case 94 -> 208;
                        case 95 -> 78;
                        case 96 -> 88;
                        case 97 -> 43;
                        case 98 -> 80;
                        case 99 -> 24;
                        case 100 -> 125;
                        case 101 -> 47;
                        case 102 -> 188;
                        case 103 -> 249;
                        case 104 -> 205;
                        case 105 -> 182;
                        case 106 -> 255;
                        case 107 -> 150;
                        case 108 -> 176;
                        case 109 -> 19;
                        case 110 -> 118;
                        case 111 -> 247;
                        case 112 -> 224;
                        case 113 -> 51;
                        case 114 -> 252;
                        case 115 -> 89;
                        case 116 -> 214;
                        case 117 -> 192;
                        case 118 -> 233;
                        case 119 -> 92;
                        case 120 -> 0;
                        case 121 -> 41;
                        case 122 -> 173;
                        case 123 -> 204;
                        case 124 -> 8;
                        case 125 -> 31;
                        case 126 -> 206;
                        case 127 -> 12;
                        case 128 -> 79;
                        case 129 -> 100;
                        case 130 -> 91;
                        case 131 -> 162;
                        case 132 -> 197;
                        case 133 -> 2;
                        case 134 -> 234;
                        case 135 -> 231;
                        case 136 -> 198;
                        case 137 -> 222;
                        case 138 -> 57;
                        case 139 -> 154;
                        case 140 -> 166;
                        case 141 -> 34;
                        case 142 -> 116;
                        case 143 -> 242;
                        case 144 -> 71;
                        case 145 -> 142;
                        case 146 -> 81;
                        case 147 -> 143;
                        case 148 -> 117;
                        case 149 -> 83;
                        case 150 -> 138;
                        case 151 -> 56;
                        case 152 -> 151;
                        case 153 -> 53;
                        case 154 -> 144;
                        case 155 -> 168;
                        case 156 -> 248;
                        case 157 -> 189;
                        case 158 -> 101;
                        case 159 -> 133;
                        case 160 -> 185;
                        case 161 -> 36;
                        case 162 -> 167;
                        case 163 -> 227;
                        case 164 -> 86;
                        case 165 -> 54;
                        case 166 -> 21;
                        case 167 -> 96;
                        case 168 -> 10;
                        case 169 -> 124;
                        case 170 -> 48;
                        case 171 -> 60;
                        case 172 -> 216;
                        case 173 -> 109;
                        case 174 -> 137;
                        case 175 -> 193;
                        case 176 -> 184;
                        case 177 -> 95;
                        case 178 -> 156;
                        case 179 -> 99;
                        case 180 -> 74;
                        case 181 -> 17;
                        case 182 -> 164;
                        case 183 -> 218;
                        case 184 -> 114;
                        case 185 -> 169;
                        case 186 -> 238;
                        case 187 -> 213;
                        case 188 -> 110;
                        case 189 -> 28;
                        case 190 -> 226;
                        case 191 -> 63;
                        case 192 -> 236;
                        case 193 -> 42;
                        case 194 -> 16;
                        case 195 -> 5;
                        case 196 -> 180;
                        case 197 -> 98;
                        case 198 -> 221;
                        case 199 -> 122;
                        case 200 -> 190;
                        case 201 -> 217;
                        case 202 -> 66;
                        case 203 -> 111;
                        case 204 -> 107;
                        case 205 -> 155;
                        case 206 -> 152;
                        case 207 -> 139;
                        case 208 -> 251;
                        case 209 -> 199;
                        case 210 -> 153;
                        case 211 -> 84;
                        case 212 -> 58;
                        case 213 -> 201;
                        case 214 -> 30;
                        case 215 -> 250;
                        case 216 -> 235;
                        case 217 -> 253;
                        case 218 -> 1;
                        case 219 -> 219;
                        case 220 -> 120;
                        case 221 -> 191;
                        case 222 -> 112;
                        case 223 -> 136;
                        case 224 -> 186;
                        case 225 -> 4;
                        case 226 -> 40;
                        case 227 -> 103;
                        case 228 -> 115;
                        case 229 -> 46;
                        case 230 -> 202;
                        case 231 -> 59;
                        case 232 -> 22;
                        case 233 -> 179;
                        case 234 -> 121;
                        case 235 -> 245;
                        case 236 -> 29;
                        case 237 -> 237;
                        case 238 -> 161;
                        case 239 -> 220;
                        case 240 -> 163;
                        case 241 -> 132;
                        case 242 -> 230;
                        case 243 -> 106;
                        case 244 -> 148;
                        case 245 -> 61;
                        case 246 -> 157;
                        case 247 -> 44;
                        case 248 -> 254;
                        case 249 -> 149;
                        case 250 -> 159;
                        case 251 -> 225;
                        case 252 -> 37;
                        case 253 -> 243;
                        case 254 -> 87;
                        default -> 160;
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
      int var1 = var8;
      var10000 = this;
      var10001 = -24364;
      var10002 = 16677;
      String var16 = "Dwarven commission combat";
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var2 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[2];

      try {
         var2[0] = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
         var2[1] = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
            var10000,
            var16,
            SetsKt.setOf(var2),
            60000L,
            0L,
            null,
            false,
            false,
            (kotlin.jvm.functions.Function1)(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl::i),
            (Function1)(
               new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs
 short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
        
      Object receiver = null; // PX-FIX
                  private static String[] a;
                  private static String[] b;

                  {
                     short var10004 = 22327;
                      var10005 = 15627;
                     var10005 = 22326;
                      var10006 = -29854;
                  }

                  public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
                     short var10001 = 22324;
                     short var10002 = -25058;
                     Intrinsics.checkNotNullParameter(var1, "p0");
                     ((IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl)this.receiver).a(var1);
                  }

                  // $VF: Irreducible bytecode was duplicated to produce valid code
                  static {
   pxClinit: { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
         // PX-FIX
                      var5 = new String[3];
                     int var3 = 0;
                     String var2 = "|?øPà/\u0084\fÑ\u0016\u009f«\u008dÂ*òÖiY²bs\u008aÃ\u0018\u00042\r6\u0007úÞ\u0080Õ\u0084\u001b\u001cÊüÏQ@WY\u001a\u0006ðd/s\u0084;¦[Uþñ\u001aÏÑa:\u001d\u001cÂrKóLëS\u009d\u009b\u0085ë\u0014i}ÍßªFUxÔnÏÞÅÛ\b `Ð:&ãQ\u0083Ê\u0000o½l\u0007Ö\u0081\u000e#ýd*ò¥\u000b§xÑ>Å¦íÇ\u0081Ý\u0080aqÝ=QÇ\u001d\u001cÎ¨®¢*qÝÇúoú\u0084!'¿Ndþ\u000f@¨-Ó\b3}W\"\u0002Â?";
                      var4 = "|?øPà/\u0084\fÑ\u0016\u009f«\u008dÂ*òÖiY²bs\u008aÃ\u0018\u00042\r6\u0007úÞ\u0080Õ\u0084\u001b\u001cÊüÏQ@WY\u001a\u0006ðd/s\u0084;¦[Uþñ\u001aÏÑa:\u001d\u001cÂrKóLëS\u009d\u009b\u0085ë\u0014i}ÍßªFUxÔnÏÞÅÛ\b `Ð:&ãQ\u0083Ê\u0000o½l\u0007Ö\u0081\u000e#ýd*ò¥\u000b§xÑ>Å¦íÇ\u0081Ý\u0080aqÝ=QÇ\u001d\u001cÎ¨®¢*qÝÇúoú\u0084!'¿Ndþ\u000f@¨-Ó\b3}W\"\u0002Â?"
                        .length();
                     char var1 = 133;
                     int var0 = -1;

                     while (true) {
                        char[] var10002;
                        label38: {
                            var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                            var10004 = var10003.length;
                           int var6 = 0;
                           byte var13 = 103;
                           var10002 = var10003;
                           int var8 = var10004;
                           byte var16;
                           char[] var10005;
                           int var10006;
                           if (var10004 <= 1) {
                              var10005 = var10003;
                              var16 = 103;
                              var10006 = var6;
                           } else {
                              var13 = 103;
                              var8 = var10004;
                              if (var10004 <= var6) {
                                 break label38;
                              }

                              var10005 = var10003;
                              var16 = 103;
                              var10006 = var6;
                           }

                           while (true) {
                              var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                                 case 0 -> 92;
                                 case 1 -> 97;
                                 case 2 -> 124;
                                 case 3 -> 57;
                                 case 4 -> 52;
                                 case 5 -> 4;
                                 default -> 48;
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
                     int var2 = (var0 ^ 22326) & 65535;
                     if (b[var2] == null) {
                        char[] var3 = a[var2].toCharArray();

                        short var4 = switch (var3[0] & 0xFF) {
                           case 0 -> 71;
                           case 1 -> 13;
                           case 2 -> 164;
                           case 3 -> 75;
                           case 4 -> 100;
                           case 5 -> 41;
                           case 6 -> 191;
                           case 7 -> 92;
                           case 8 -> 182;
                           case 9 -> 39;
                           case 10 -> 101;
                           case 11 -> 215;
                           case 12 -> 174;
                           case 13 -> 142;
                           case 14 -> 125;
                           case 15 -> 82;
                           case 16 -> 123;
                           case 17 -> 72;
                           case 18 -> 136;
                           case 19 -> 209;
                           case 20 -> 163;
                           case 21 -> 230;
                           case 22 -> 38;
                           case 23 -> 121;
                           case 24 -> 175;
                           case 25 -> 18;
                           case 26 -> 84;
                           case 27 -> 67;
                           case 28 -> 17;
                           case 29 -> 98;
                           case 30 -> 138;
                           case 31 -> 173;
                           case 32 -> 145;
                           case 33 -> 132;
                           case 34 -> 242;
                           case 35 -> 146;
                           case 36 -> 33;
                           case 37 -> 105;
                           case 38 -> 46;
                           case 39 -> 5;
                           case 40 -> 62;
                           case 41 -> 16;
                           case 42 -> 168;
                           case 43 -> 52;
                           case 44 -> 44;
                           case 45 -> 194;
                           case 46 -> 243;
                           case 47 -> 207;
                           case 48 -> 26;
                           case 49 -> 181;
                           case 50 -> 246;
                           case 51 -> 162;
                           case 52 -> 119;
                           case 53 -> 147;
                           case 54 -> 130;
                           case 55 -> 116;
                           case 56 -> 188;
                           case 57 -> 185;
                           case 58 -> 122;
                           case 59 -> 222;
                           case 60 -> 154;
                           case 61 -> 118;
                           case 62 -> 88;
                           case 63 -> 135;
                           case 64 -> 187;
                           case 65 -> 225;
                           case 66 -> 224;
                           case 67 -> 7;
                           case 68 -> 79;
                           case 69 -> 22;
                           case 70 -> 203;
                           case 71 -> 51;
                           case 72 -> 201;
                           case 73 -> 54;
                           case 74 -> 150;
                           case 75 -> 106;
                           case 76 -> 120;
                           case 77 -> 47;
                           case 78 -> 139;
                           case 79 -> 153;
                           case 80 -> 78;
                           case 81 -> 49;
                           case 82 -> 192;
                           case 83 -> 77;
                           case 84 -> 2;
                           case 85 -> 200;
                           case 86 -> 124;
                           case 87 -> 97;
                           case 88 -> 165;
                           case 89 -> 107;
                           case 90 -> 218;
                           case 91 -> 9;
                           case 92 -> 161;
                           case 93 -> 202;
                           case 94 -> 226;
                           case 95 -> 87;
                           case 96 -> 255;
                           case 97 -> 180;
                           case 98 -> 134;
                           case 99 -> 53;
                           case 100 -> 43;
                           case 101 -> 23;
                           case 102 -> 213;
                           case 103 -> 94;
                           case 104 -> 144;
                           case 105 -> 74;
                           case 106 -> 228;
                           case 107 -> 219;
                           case 108 -> 170;
                           case 109 -> 50;
                           case 110 -> 254;
                           case 111 -> 206;
                           case 112 -> 85;
                           case 113 -> 247;
                           case 114 -> 103;
                           case 115 -> 156;
                           case 116 -> 211;
                           case 117 -> 152;
                           case 118 -> 199;
                           case 119 -> 155;
                           case 120 -> 234;
                           case 121 -> 220;
                           case 122 -> 86;
                           case 123 -> 34;
                           case 124 -> 3;
                           case 125 -> 166;
                           case 126 -> 90;
                           case 127 -> 29;
                           case 128 -> 32;
                           case 129 -> 184;
                           case 130 -> 129;
                           case 131 -> 159;
                           case 132 -> 27;
                           case 133 -> 63;
                           case 134 -> 61;
                           case 135 -> 104;
                           case 136 -> 60;
                           case 137 -> 57;
                           case 138 -> 36;
                           case 139 -> 140;
                           case 140 -> 99;
                           case 141 -> 80;
                           case 142 -> 198;
                           case 143 -> 231;
                           case 144 -> 40;
                           case 145 -> 6;
                           case 146 -> 112;
                           case 147 -> 214;
                           case 148 -> 190;
                           case 149 -> 177;
                           case 150 -> 66;
                           case 151 -> 137;
                           case 152 -> 91;
                           case 153 -> 126;
                           case 154 -> 20;
                           case 155 -> 19;
                           case 156 -> 108;
                           case 157 -> 241;
                           case 158 -> 113;
                           case 159 -> 30;
                           case 160 -> 240;
                           case 161 -> 179;
                           case 162 -> 114;
                           case 163 -> 148;
                           case 164 -> 171;
                           case 165 -> 158;
                           case 166 -> 251;
                           case 167 -> 55;
                           case 168 -> 117;
                           case 169 -> 172;
                           case 170 -> 252;
                           case 171 -> 68;
                           case 172 -> 189;
                           case 173 -> 1;
                           case 174 -> 59;
                           case 175 -> 4;
                           case 176 -> 235;
                           case 177 -> 160;
                           case 178 -> 237;
                           case 179 -> 83;
                           case 180 -> 167;
                           case 181 -> 64;
                           case 182 -> 31;
                           case 183 -> 249;
                           case 184 -> 197;
                           case 185 -> 89;
                           case 186 -> 25;
                           case 187 -> 56;
                           case 188 -> 248;
                           case 189 -> 193;
                           case 190 -> 195;
                           case 191 -> 115;
                           case 192 -> 245;
                           case 193 -> 141;
                           case 194 -> 24;
                           case 195 -> 238;
                           case 196 -> 70;
                           case 197 -> 111;
                           case 198 -> 221;
                           case 199 -> 229;
                           case 200 -> 233;
                           case 201 -> 14;
                           case 202 -> 21;
                           case 203 -> 95;
                           case 204 -> 212;
                           case 205 -> 35;
                           case 206 -> 169;
                           case 207 -> 45;
                           case 208 -> 127;
                           case 209 -> 42;
                           case 210 -> 232;
                           case 211 -> 8;
                           case 212 -> 76;
                           case 213 -> 128;
                           case 214 -> 69;
                           case 215 -> 48;
                           case 216 -> 37;
                           case 217 -> 109;
                           case 218 -> 183;
                           case 219 -> 236;
                           case 220 -> 208;
                           case 221 -> 0;
                           case 222 -> 217;
                           case 223 -> 12;
                           case 224 -> 151;
                           case 225 -> 96;
                           case 226 -> 143;
                           case 227 -> 253;
                           case 228 -> 210;
                           case 229 -> 178;
                           case 230 -> 204;
                           case 231 -> 239;
                           case 232 -> 81;
                           case 233 -> 15;
                           case 234 -> 73;
                           case 235 -> 131;
                           case 236 -> 196;
                           case 237 -> 223;
                           case 238 -> 28;
                           case 239 -> 133;
                           case 240 -> 10;
                           case 241 -> 205;
                           case 242 -> 58;
                           case 243 -> 93;
                           case 244 -> 216;
                           case 245 -> 110;
                           case 246 -> 244;
                           case 247 -> 227;
                           case 248 -> 186;
                           case 249 -> 149;
                           case 250 -> 11;
                           case 251 -> 65;
                           case 252 -> 102;
                           case 253 -> 176;
                           case 254 -> 250;
                           default -> 157;
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
         var10000 = this;
         var10001 = -24325;
         var10002 = -31386;
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
            var10000,
            "Dwarven commission completion",
            IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII,
            900000L,
            0L,
            null,
            true,
            false,
            null,
            (Function1)(
               new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs
 short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
        
      Object receiver = null; // PX-FIX
                  private static String[] a;
                  private static String[] b;

                  {
                     short var10004 = 32715;
                      var10005 = -15941;
                     var10005 = 32713;
                      var10006 = -30791;
                  }

                  public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
                     short var10001 = 32714;
                     short var10002 = -11577;
                     Intrinsics.checkNotNullParameter(var1, "p0");
                     ((IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl)this.receiver).a(var1);
                  }

                  // $VF: Irreducible bytecode was duplicated to produce valid code
                  static {
   pxClinit: { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
         // PX-FIX
                      var5 = new String[3];
                     int var3 = 0;
                     String var2 = "2Z*\u0083\u009c\u009b7j+Á¿wGe\u0083\u008aø\u0019ºr\"\u009b\u000eÅ÷â\u0001í\u0002Óé\u0085\u007f'\u0083,©n\u0091Ôÿ\u0016%\u008d\u0014:éaµd\u0013Ý\u0017n¨{#5\u009b\u0017óÈYXÒËò(^·ËFyM¢t¿ÜbñA1Åhñ\u0017qK\u0085 Zéõó³Õ\u009bP\u001f\u0091\b\u009b+\u001f\u008fªO?ÁèTvæU\u0012&Ì)×Iàç\u0090Wÿ%¶¾¼~\u0098£x=\u0094è\u001e¶.\u0019©9û\u008eñ½pÛ1\u0090+\u001d\u0088í}§Dx¢â¾0\u001b¨h";
                      var4 = "2Z*\u0083\u009c\u009b7j+Á¿wGe\u0083\u008aø\u0019ºr\"\u009b\u000eÅ÷â\u0001í\u0002Óé\u0085\u007f'\u0083,©n\u0091Ôÿ\u0016%\u008d\u0014:éaµd\u0013Ý\u0017n¨{#5\u009b\u0017óÈYXÒËò(^·ËFyM¢t¿ÜbñA1Åhñ\u0017qK\u0085 Zéõó³Õ\u009bP\u001f\u0091\b\u009b+\u001f\u008fªO?ÁèTvæU\u0012&Ì)×Iàç\u0090Wÿ%¶¾¼~\u0098£x=\u0094è\u001e¶.\u0019©9û\u008eñ½pÛ1\u0090+\u001d\u0088í}§Dx¢â¾0\u001b¨h"
                        .length();
                     char var1 = 28;
                     int var0 = -1;

                     while (true) {
                        char[] var10002;
                        label38: {
                            var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                            var10004 = var10003.length;
                           int var6 = 0;
                           byte var13 = 77;
                           var10002 = var10003;
                           int var8 = var10004;
                           byte var16;
                           char[] var10005;
                           int var10006;
                           if (var10004 <= 1) {
                              var10005 = var10003;
                              var16 = 77;
                              var10006 = var6;
                           } else {
                              var13 = 77;
                              var8 = var10004;
                              if (var10004 <= var6) {
                                 break label38;
                              }

                              var10005 = var10003;
                              var16 = 77;
                              var10006 = var6;
                           }

                           while (true) {
                              var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                                 case 0 -> 39;
                                 case 1 -> 64;
                                 case 2 -> 103;
                                 case 3 -> 13;
                                 case 4 -> 30;
                                 case 5 -> 35;
                                 default -> 38;
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
                     int var2 = (var0 ^ 32715) & 65535;
                     if (b[var2] == null) {
                        char[] var3 = a[var2].toCharArray();

                        short var4 = switch (var3[0] & 0xFF) {
                           case 0 -> 138;
                           case 1 -> 200;
                           case 2 -> 129;
                           case 3 -> 100;
                           case 4 -> 116;
                           case 5 -> 204;
                           case 6 -> 253;
                           case 7 -> 184;
                           case 8 -> 127;
                           case 9 -> 78;
                           case 10 -> 42;
                           case 11 -> 32;
                           case 12 -> 190;
                           case 13 -> 43;
                           case 14 -> 19;
                           case 15 -> 20;
                           case 16 -> 220;
                           case 17 -> 187;
                           case 18 -> 246;
                           case 19 -> 118;
                           case 20 -> 148;
                           case 21 -> 60;
                           case 22 -> 87;
                           case 23 -> 62;
                           case 24 -> 75;
                           case 25 -> 126;
                           case 26 -> 39;
                           case 27 -> 27;
                           case 28 -> 186;
                           case 29 -> 219;
                           case 30 -> 128;
                           case 31 -> 188;
                           case 32 -> 80;
                           case 33 -> 9;
                           case 34 -> 238;
                           case 35 -> 202;
                           case 36 -> 227;
                           case 37 -> 115;
                           case 38 -> 18;
                           case 39 -> 12;
                           case 40 -> 181;
                           case 41 -> 149;
                           case 42 -> 6;
                           case 43 -> 51;
                           case 44 -> 85;
                           case 45 -> 29;
                           case 46 -> 230;
                           case 47 -> 222;
                           case 48 -> 52;
                           case 49 -> 135;
                           case 50 -> 122;
                           case 51 -> 150;
                           case 52 -> 36;
                           case 53 -> 40;
                           case 54 -> 168;
                           case 55 -> 109;
                           case 56 -> 124;
                           case 57 -> 156;
                           case 58 -> 11;
                           case 59 -> 197;
                           case 60 -> 198;
                           case 61 -> 169;
                           case 62 -> 178;
                           case 63 -> 225;
                           case 64 -> 111;
                           case 65 -> 72;
                           case 66 -> 112;
                           case 67 -> 142;
                           case 68 -> 174;
                           case 69 -> 177;
                           case 70 -> 96;
                           case 71 -> 213;
                           case 72 -> 152;
                           case 73 -> 164;
                           case 74 -> 207;
                           case 75 -> 108;
                           case 76 -> 210;
                           case 77 -> 131;
                           case 78 -> 167;
                           case 79 -> 155;
                           case 80 -> 215;
                           case 81 -> 119;
                           case 82 -> 217;
                           case 83 -> 125;
                           case 84 -> 209;
                           case 85 -> 95;
                           case 86 -> 151;
                           case 87 -> 231;
                           case 88 -> 139;
                           case 89 -> 106;
                           case 90 -> 239;
                           case 91 -> 92;
                           case 92 -> 185;
                           case 93 -> 89;
                           case 94 -> 203;
                           case 95 -> 82;
                           case 96 -> 242;
                           case 97 -> 101;
                           case 98 -> 21;
                           case 99 -> 41;
                           case 100 -> 22;
                           case 101 -> 241;
                           case 102 -> 14;
                           case 103 -> 68;
                           case 104 -> 104;
                           case 105 -> 28;
                           case 106 -> 73;
                           case 107 -> 1;
                           case 108 -> 103;
                           case 109 -> 65;
                           case 110 -> 218;
                           case 111 -> 221;
                           case 112 -> 13;
                           case 113 -> 205;
                           case 114 -> 110;
                           case 115 -> 120;
                           case 116 -> 0;
                           case 117 -> 79;
                           case 118 -> 145;
                           case 119 -> 199;
                           case 120 -> 233;
                           case 121 -> 245;
                           case 122 -> 70;
                           case 123 -> 77;
                           case 124 -> 38;
                           case 125 -> 67;
                           case 126 -> 132;
                           case 127 -> 71;
                           case 128 -> 30;
                           case 129 -> 47;
                           case 130 -> 133;
                           case 131 -> 46;
                           case 132 -> 74;
                           case 133 -> 157;
                           case 134 -> 144;
                           case 135 -> 81;
                           case 136 -> 98;
                           case 137 -> 15;
                           case 138 -> 147;
                           case 139 -> 35;
                           case 140 -> 66;
                           case 141 -> 113;
                           case 142 -> 249;
                           case 143 -> 136;
                           case 144 -> 195;
                           case 145 -> 59;
                           case 146 -> 214;
                           case 147 -> 172;
                           case 148 -> 234;
                           case 149 -> 194;
                           case 150 -> 34;
                           case 151 -> 86;
                           case 152 -> 158;
                           case 153 -> 180;
                           case 154 -> 130;
                           case 155 -> 84;
                           case 156 -> 141;
                           case 157 -> 206;
                           case 158 -> 31;
                           case 159 -> 37;
                           case 160 -> 161;
                           case 161 -> 232;
                           case 162 -> 223;
                           case 163 -> 170;
                           case 164 -> 216;
                           case 165 -> 243;
                           case 166 -> 159;
                           case 167 -> 57;
                           case 168 -> 25;
                           case 169 -> 7;
                           case 170 -> 143;
                           case 171 -> 153;
                           case 172 -> 196;
                           case 173 -> 134;
                           case 174 -> 247;
                           case 175 -> 16;
                           case 176 -> 48;
                           case 177 -> 137;
                           case 178 -> 91;
                           case 179 -> 244;
                           case 180 -> 44;
                           case 181 -> 224;
                           case 182 -> 53;
                           case 183 -> 83;
                           case 184 -> 64;
                           case 185 -> 254;
                           case 186 -> 248;
                           case 187 -> 55;
                           case 188 -> 33;
                           case 189 -> 117;
                           case 190 -> 173;
                           case 191 -> 26;
                           case 192 -> 3;
                           case 193 -> 49;
                           case 194 -> 192;
                           case 195 -> 121;
                           case 196 -> 24;
                           case 197 -> 235;
                           case 198 -> 45;
                           case 199 -> 140;
                           case 200 -> 93;
                           case 201 -> 237;
                           case 202 -> 97;
                           case 203 -> 105;
                           case 204 -> 88;
                           case 205 -> 56;
                           case 206 -> 229;
                           case 207 -> 162;
                           case 208 -> 179;
                           case 209 -> 76;
                           case 210 -> 4;
                           case 211 -> 23;
                           case 212 -> 228;
                           case 213 -> 191;
                           case 214 -> 2;
                           case 215 -> 240;
                           case 216 -> 212;
                           case 217 -> 193;
                           case 218 -> 58;
                           case 219 -> 17;
                           case 220 -> 201;
                           case 221 -> 107;
                           case 222 -> 189;
                           case 223 -> 94;
                           case 224 -> 250;
                           case 225 -> 5;
                           case 226 -> 69;
                           case 227 -> 236;
                           case 228 -> 63;
                           case 229 -> 171;
                           case 230 -> 176;
                           case 231 -> 252;
                           case 232 -> 160;
                           case 233 -> 251;
                           case 234 -> 208;
                           case 235 -> 226;
                           case 236 -> 182;
                           case 237 -> 10;
                           case 238 -> 114;
                           case 239 -> 175;
                           case 240 -> 165;
                           case 241 -> 102;
                           case 242 -> 183;
                           case 243 -> 99;
                           case 244 -> 255;
                           case 245 -> 166;
                           case 246 -> 123;
                           case 247 -> 154;
                           case 248 -> 163;
                           case 249 -> 8;
                           case 250 -> 61;
                           case 251 -> 211;
                           case 252 -> 90;
                           case 253 -> 50;
                           case 254 -> 146;
                           default -> 54;
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
         if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b(
               ++var1
            );
         }
      } catch (NoWhenBranchMatchedException var3) {
         throw (RuntimeException)a(var3);
      }
   }

   @Override
   public void aC() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: invokestatic me/octo/client/utils/commission/PolinexDwarvenClaimPriorityGuard.shouldForceClaimState ()Z
      // 0003: ifeq 0015
      // 0006: aload 0
      // 0007: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 000a: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 000d: if_acmpeq 0015
      // 0010: aload 0
      // 0011: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bz ()V
      // 0014: return
      // 0015: invokestatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()I
      // 0018: istore 1
      // 0019: iload 1
      // 001a: ifeq 0037
      // 001d: aload 0
      // 001e: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 0021: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 0024: dup
      // 0025: ifnonnull 0038
      // 0028: goto 002f
      // 002b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 002e: athrow
      // 002f: pop
      // 0030: goto 0037
      // 0033: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0036: athrow
      // 0037: return
      // 0038: astore 2
      // 0039: iload 1
      // 003a: ifeq 0057
      // 003d: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n ()Z
      // 0040: ifeq 0058
      // 0043: goto 004a
      // 0046: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0049: athrow
      // 004a: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 004d: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.t ()V
      // 0050: goto 0057
      // 0053: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0056: athrow
      // 0057: return
      // 0058: aload 0
      // 0059: iload 1
      // 005a: ifeq 00a6
      // 005d: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0060: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0063: if_acmpeq 00a5
      // 0066: goto 006d
      // 0069: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 006c: athrow
      // 006d: aload 0
      // 006e: iload 1
      // 006f: ifeq 00a6
      // 0072: goto 0079
      // 0075: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0078: athrow
      // 0079: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 007c: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 007f: if_acmpeq 00a5
      // 0082: goto 0089
      // 0085: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0088: athrow
      // 0089: aload 0
      // 008a: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 008d: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0090: iload 1
      // 0091: ifeq 01a0
      // 0094: goto 009b
      // 0097: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 009a: athrow
      // 009b: if_acmpne 0199
      // 009e: goto 00a5
      // 00a1: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 00a4: athrow
      // 00a5: aload 0
      // 00a6: iload 1
      // 00a7: ifeq 019a
      // 00aa: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl Z
      // 00ad: ifeq 0199
      // 00b0: goto 00b7
      // 00b3: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 00b6: athrow
      // 00b7: aload 0
      // 00b8: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.aO ()V
      // 00bb: aload 0
      // 00bc: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 00bf: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 00c2: iload 1
      // 00c3: ifeq 00e5
      // 00c6: goto 00cd
      // 00c9: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 00cc: athrow
      // 00cd: if_acmpeq 00e8
      // 00d0: goto 00d7
      // 00d3: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 00d6: athrow
      // 00d7: aload 0
      // 00d8: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 00db: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 00de: goto 00e5
      // 00e1: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 00e4: athrow
      // 00e5: if_acmpne 00f0
      // 00e8: bipush 1
      // 00e9: goto 00f1
      // 00ec: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 00ef: athrow
      // 00f0: bipush 0
      // 00f1: istore 3
      // 00f2: aload 0
      // 00f3: aload 0
      // 00f4: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 00f7: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 00fa: aload 0
      // 00fb: aconst_null
      // 00fc: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 00ff: aload 0
      // 0100: bipush 0
      // 0101: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl Z
      // 0104: aload 0
      // 0105: bipush 0
      // 0106: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Z
      // 0109: invokestatic me/octo/client/utils/commission/PolinexDwarvenClaimPriorityGuard.begin ()Z
      // 010c: ifeq 0114
      // 010f: aload 0
      // 0110: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bz ()V
      // 0113: return
      // 0114: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 0117: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.t ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 011a: astore 4
      // 011c: nop
      // 011d: iload 1
      // 011e: ifeq 0138
      // 0121: aload 4
      // 0123: ifnull 013c
      // 0126: goto 012d
      // 0129: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 012c: athrow
      // 012d: aload 0
      // 012e: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bz ()V
      // 0131: goto 0138
      // 0134: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0137: athrow
      // 0138: goto 013c
      // 013b: athrow
      // 013c: iload 3
      // 013d: iload 1
      // 013e: ifeq 0168
      // 0141: goto 0148
      // 0144: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0147: athrow
      // 0148: ifeq 0187
      // 014b: goto 0152
      // 014e: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0151: athrow
      // 0152: aload 0
      // 0153: iload 1
      // 0154: ifeq 018f
      // 0157: goto 015e
      // 015a: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 015d: athrow
      // 015e: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bu ()Z
      // 0161: goto 0168
      // 0164: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0167: athrow
      // 0168: ifeq 0187
      // 016b: aload 0
      // 016c: getstatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 016f: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll Lme/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 0172: aload 0
      // 0173: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0176: sipush 2000
      // 0179: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;I)V
      // 017c: iload 1
      // 017d: ifne 0198
      // 0180: goto 0187
      // 0183: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0186: athrow
      // 0187: aload 0
      // 0188: goto 018f
      // 018b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 018e: athrow
      // 018f: getstatic me/octo/client/IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl;
      // 0192: invokevirtual me/octo/client/IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl.S ()Lme/octo/client/utils/IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll;
      // 0195: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/utils/IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll;)V
      // 0198: return
      // 0199: aload 0
      // 019a: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 019d: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 01a0: iload 1
      // 01a1: ifeq 0327
      // 01a4: if_acmpne 0315
      // 01a7: goto 01ae
      // 01aa: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01ad: athrow
      // 01ae: aload 0
      // 01af: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 01b2: dup
      // 01b3: ifnull 01c7
      // 01b6: goto 01bd
      // 01b9: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01bc: athrow
      // 01bd: invokevirtual me/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII.h ()Lnet/minecraft/core/BlockPos;
      // 01c0: goto 01c9
      // 01c3: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01c6: athrow
      // 01c7: pop
      // 01c8: aconst_null
      // 01c9: astore 3
      // 01ca: aload 3
      // 01cb: iload 1
      // 01cc: ifeq 01da
      // 01cf: ifnull 0315
      // 01d2: goto 01d9
      // 01d5: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 01d8: athrow
      // 01d9: aload 3
      // 01da: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 01dd: dup
      // 01de: sipush -24394
      // 01e1: sipush 3810
      // 01e4: pop2
      // 01e5: ldc_w "getCenter(...)"
      // 01e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 01eb: astore 4
      // 01ed: iload 1
      // 01ee: ifeq 02df
      // 01f1: aload 0
      // 01f2: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 01f5: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 01f8: dup
      // 01f9: ifnull 02d7
      // 01fc: goto 0203
      // 01ff: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0202: athrow
      // 0203: invokevirtual net/minecraft/client/multiplayer/ClientLevel.entitiesForRendering ()Ljava/lang/Iterable;
      // 0206: dup
      // 0207: ifnull 02d7
      // 020a: goto 0211
      // 020d: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0210: athrow
      // 0211: astore 9
      // 0213: aload 9
      // 0215: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 021a: astore 10
      // 021c: aload 10
      // 021e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0223: ifeq 02cf
      // 0226: aload 10
      // 0228: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 022d: astore 11
      // 022f: aload 11
      // 0231: checkcast net/minecraft/world/entity/Entity
      // 0234: astore 12
      // 0236: bipush 0
      // 0237: istore 13
      // 0239: aload 12
      // 023b: invokevirtual net/minecraft/world/entity/Entity.getName ()Lnet/minecraft/network/chat/Component;
      // 023e: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0243: dup
      // 0244: sipush -24393
      // 0247: sipush 3580
      // 024a: pop2
      // 024b: ldc_w "getString(...)"
      // 024e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0251: checkcast java/lang/CharSequence
      // 0254: sipush -24322
      // 0257: sipush -22227
      // 025a: pop2
      // 025b: ldc_w "Star Sentry"
      // 025e: checkcast java/lang/CharSequence
      // 0261: bipush 0
      // 0262: bipush 2
      // 0263: aconst_null
      // 0264: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 0267: iload 1
      // 0268: ifeq 028a
      // 026b: ifeq 02c2
      // 026e: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 0271: aload 4
      // 0273: aload 12
      // 0275: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0278: aload 12
      // 027a: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 027d: ldc2_w 3.0
      // 0280: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 0283: goto 028a
      // 0286: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0289: athrow
      // 028a: iload 1
      // 028b: ifeq 02b0
      // 028e: ifeq 02c2
      // 0291: goto 0298
      // 0294: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0297: athrow
      // 0298: aload 2
      // 0299: invokevirtual net/minecraft/client/player/LocalPlayer.getY ()D
      // 029c: aload 12
      // 029e: invokevirtual net/minecraft/world/entity/Entity.getY ()D
      // 02a1: dsub
      // 02a2: invokestatic java/lang/Math.abs (D)D
      // 02a5: ldc2_w 3.0
      // 02a8: dcmpg
      // 02a9: goto 02b0
      // 02ac: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02af: athrow
      // 02b0: iload 1
      // 02b1: ifeq 02bf
      // 02b4: ifgt 02c2
      // 02b7: goto 02be
      // 02ba: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02bd: athrow
      // 02be: bipush 1
      // 02bf: goto 02c3
      // 02c2: bipush 0
      // 02c3: ifeq 021c
      // 02c6: aload 11
      // 02c8: iload 1
      // 02c9: ifeq 0231
      // 02cc: goto 02d0
      // 02cf: aconst_null
      // 02d0: checkcast net/minecraft/world/entity/Entity
      // 02d3: iload 1
      // 02d4: ifne 02e0
      // 02d7: pop
      // 02d8: goto 02df
      // 02db: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02de: athrow
      // 02df: aconst_null
      // 02e0: astore 5
      // 02e2: iload 1
      // 02e3: ifeq 0314
      // 02e6: aload 5
      // 02e8: ifnull 0315
      // 02eb: goto 02f2
      // 02ee: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02f1: athrow
      // 02f2: sipush -24368
      // 02f5: sipush 24463
      // 02f8: pop2
      // 02f9: ldc_w "§c[Star Sentry] Detected! Lobby hopping for safety"
      // 02fc: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 02ff: aload 0
      // 0300: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.aO ()V
      // 0303: aload 0
      // 0304: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0307: sipush 5000
      // 030a: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;I)V
      // 030d: goto 0314
      // 0310: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0313: athrow
      // 0314: return
      // 0315: aload 0
      // 0316: iload 1
      // 0317: ifeq 034e
      // 031a: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 031d: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0320: goto 0327
      // 0323: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0326: athrow
      // 0327: if_acmpeq 0346
      // 032a: aload 0
      // 032b: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 032e: iload 1
      // 032f: ifeq 0446
      // 0332: goto 0339
      // 0335: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0338: athrow
      // 0339: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 033c: if_acmpne 0442
      // 033f: goto 0346
      // 0342: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0345: athrow
      // 0346: aload 0
      // 0347: goto 034e
      // 034a: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 034d: athrow
      // 034e: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 0351: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 0354: dup
      // 0355: ifnull 0406
      // 0358: invokevirtual net/minecraft/client/multiplayer/ClientLevel.entitiesForRendering ()Ljava/lang/Iterable;
      // 035b: dup
      // 035c: ifnull 0406
      // 035f: goto 0366
      // 0362: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0365: athrow
      // 0366: astore 7
      // 0368: aload 7
      // 036a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 036f: astore 8
      // 0371: aload 8
      // 0373: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0378: ifeq 03fe
      // 037b: aload 8
      // 037d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0382: astore 9
      // 0384: aload 9
      // 0386: checkcast net/minecraft/world/entity/Entity
      // 0389: astore 10
      // 038b: bipush 0
      // 038c: istore 11
      // 038e: aload 10
      // 0390: invokevirtual net/minecraft/world/entity/Entity.getName ()Lnet/minecraft/network/chat/Component;
      // 0393: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0398: dup
      // 0399: sipush -24393
      // 039c: sipush 3580
      // 039f: pop2
      // 03a0: ldc_w "getString(...)"
      // 03a3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 03a6: checkcast java/lang/CharSequence
      // 03a9: sipush -24386
      // 03ac: sipush 3775
      // 03af: pop2
      // 03b0: ldc_w "Black Hole"
      // 03b3: checkcast java/lang/CharSequence
      // 03b6: bipush 0
      // 03b7: bipush 2
      // 03b8: aconst_null
      // 03b9: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 03bc: iload 1
      // 03bd: ifeq 03df
      // 03c0: ifeq 03f1
      // 03c3: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 03c6: aload 10
      // 03c8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 03cb: aload 10
      // 03cd: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 03d0: bipush 1
      // 03d1: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 03d4: ldc2_w 30.0
      // 03d7: dcmpg
      // 03d8: goto 03df
      // 03db: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03de: athrow
      // 03df: iload 1
      // 03e0: ifeq 03ee
      // 03e3: ifge 03f1
      // 03e6: goto 03ed
      // 03e9: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03ec: athrow
      // 03ed: bipush 1
      // 03ee: goto 03f2
      // 03f1: bipush 0
      // 03f2: ifeq 0371
      // 03f5: aload 9
      // 03f7: iload 1
      // 03f8: ifeq 0386
      // 03fb: goto 03ff
      // 03fe: aconst_null
      // 03ff: checkcast net/minecraft/world/entity/Entity
      // 0402: iload 1
      // 0403: ifne 040f
      // 0406: pop
      // 0407: aconst_null
      // 0408: goto 040f
      // 040b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 040e: athrow
      // 040f: astore 3
      // 0410: iload 1
      // 0411: ifeq 0441
      // 0414: aload 3
      // 0415: ifnull 0442
      // 0418: goto 041f
      // 041b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 041e: athrow
      // 041f: sipush -24361
      // 0422: sipush -19779
      // 0425: pop2
      // 0426: ldc_w "§c[Black Hole] Detected! Lobby hopping for safety"
      // 0429: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 042c: aload 0
      // 042d: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.aO ()V
      // 0430: aload 0
      // 0431: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0434: sipush 5000
      // 0437: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;I)V
      // 043a: goto 0441
      // 043d: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0440: athrow
      // 0441: return
      // 0442: aload 0
      // 0443: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0446: getstatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl [I
      // 0449: swap
      // 044a: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ordinal ()I
      // 044d: iaload
      // 044e: iload 1
      // 044f: ifeq 048f
      // 0452: tableswitch 3960 1 8 50 318 1239 1849 3547 3802 3873 3954
      // 0480: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0483: athrow
      // 0484: aload 0
      // 0485: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.aK ()Z
      // 0488: goto 048f
      // 048b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 048e: athrow
      // 048f: iload 1
      // 0490: ifeq 04b8
      // 0493: ifne 049e
      // 0496: goto 049d
      // 0499: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 049c: athrow
      // 049d: return
      // 049e: aload 0
      // 049f: iload 1
      // 04a0: ifeq 04d1
      // 04a3: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.aJ ()Lme/octo/client/lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI;
      // 04a6: invokevirtual me/octo/client/lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI.a ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 04a9: getstatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII [I
      // 04ac: swap
      // 04ad: invokevirtual me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ordinal ()I
      // 04b0: iaload
      // 04b1: goto 04b8
      // 04b4: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04b7: athrow
      // 04b8: tableswitch 210 1 2 24 40
      // 04d0: aload 0
      // 04d1: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 04d4: sipush 2000
      // 04d7: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;I)V
      // 04da: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 04dd: goto 13cd
      // 04e0: aload 0
      // 04e1: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll Lme/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 04e4: dup
      // 04e5: ifnonnull 04f1
      // 04e8: pop
      // 04e9: bipush -1
      // 04ea: goto 04f9
      // 04ed: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04f0: athrow
      // 04f1: getstatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 04f4: swap
      // 04f5: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.ordinal ()I
      // 04f8: iaload
      // 04f9: tableswitch 137 -1 3 127 137 35 91 112
      // 051c: aload 0
      // 051d: aconst_null
      // 051e: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll Lme/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 0521: aload 0
      // 0522: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 0525: astore 9
      // 0527: aload 0
      // 0528: aconst_null
      // 0529: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 052c: iload 1
      // 052d: ifeq 054a
      // 0530: aload 9
      // 0532: dup
      // 0533: ifnull 0549
      // 0536: goto 053d
      // 0539: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 053c: athrow
      // 053d: aload 0
      // 053e: swap
      // 053f: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.b (Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;)V
      // 0542: goto 054e
      // 0545: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0548: athrow
      // 0549: pop
      // 054a: aload 0
      // 054b: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ba ()V
      // 054e: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0551: goto 13cd
      // 0554: aload 0
      // 0555: aconst_null
      // 0556: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll Lme/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 0559: aload 0
      // 055a: getstatic me/octo/client/IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl;
      // 055d: invokevirtual me/octo/client/IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl.S ()Lme/octo/client/utils/IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll;
      // 0560: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/utils/IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll;)V
      // 0563: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0566: goto 13cd
      // 0569: aload 0
      // 056a: aconst_null
      // 056b: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll Lme/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 056e: aload 0
      // 056f: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bv ()V
      // 0572: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0575: goto 13cd
      // 0578: aload 0
      // 0579: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ba ()V
      // 057c: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 057f: goto 13cd
      // 0582: new kotlin/NoWhenBranchMatchedException
      // 0585: dup
      // 0586: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 0589: athrow
      // 058a: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 058d: goto 13cd
      // 0590: aload 0
      // 0591: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Lme/octo/client/utils/IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll;
      // 0594: dup
      // 0595: ifnonnull 059e
      // 0598: pop
      // 0599: return
      // 059a: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 059d: athrow
      // 059e: astore 5
      // 05a0: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 05a3: aload 5
      // 05a5: invokevirtual me/octo/client/utils/IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll.b ()Lnet/minecraft/world/phys/Vec3;
      // 05a8: bipush 1
      // 05a9: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 05ac: dstore 6
      // 05ae: dload 6
      // 05b0: ldc2_w 3.0
      // 05b3: dcmpg
      // 05b4: iload 1
      // 05b5: ifeq 0904
      // 05b8: ifge 08f4
      // 05bb: goto 05c2
      // 05be: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 05c1: athrow
      // 05c2: aload 0
      // 05c3: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bw ()V
      // 05c6: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 05c9: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 05cc: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 05cf: iload 1
      // 05d0: ifeq 0602
      // 05d3: goto 05da
      // 05d6: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 05d9: athrow
      // 05da: ifne 05f4
      // 05dd: goto 05e4
      // 05e0: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 05e3: athrow
      // 05e4: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 05e7: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 05ea: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 05ed: goto 05f4
      // 05f0: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 05f3: athrow
      // 05f4: aload 5
      // 05f6: invokevirtual me/octo/client/utils/IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll.b ()Lnet/minecraft/world/phys/Vec3;
      // 05f9: invokestatic me/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 05fc: pop
      // 05fd: aload 0
      // 05fe: bipush 0
      // 05ff: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.e (I)Z
      // 0602: iload 1
      // 0603: ifeq 061a
      // 0606: ifeq 0611
      // 0609: goto 0610
      // 060c: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 060f: athrow
      // 0610: return
      // 0611: getstatic me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI;
      // 0614: invokevirtual me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.d ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 0617: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 061a: ifeq 0668
      // 061d: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 0620: iload 1
      // 0621: ifeq 064f
      // 0624: goto 062b
      // 0627: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 062a: athrow
      // 062b: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.G ()Ljava/lang/Integer;
      // 062e: dup
      // 062f: ifnonnull 0681
      // 0632: goto 0639
      // 0635: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0638: athrow
      // 0639: pop
      // 063a: iload 1
      // 063b: ifeq 0664
      // 063e: goto 0645
      // 0641: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0644: athrow
      // 0645: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 0648: goto 064f
      // 064b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 064e: athrow
      // 064f: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.q ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0652: dup
      // 0653: ifnull 0663
      // 0656: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0659: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 065c: goto 0681
      // 065f: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0662: athrow
      // 0663: pop
      // 0664: aconst_null
      // 0665: goto 0681
      // 0668: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 066b: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.q ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 066e: dup
      // 066f: ifnull 067f
      // 0672: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0675: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0678: goto 0681
      // 067b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 067e: athrow
      // 067f: pop
      // 0680: aconst_null
      // 0681: astore 8
      // 0683: aload 8
      // 0685: iload 1
      // 0686: ifeq 069f
      // 0689: ifnull 06d6
      // 068c: goto 0693
      // 068f: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0692: athrow
      // 0693: aload 8
      // 0695: checkcast java/lang/Number
      // 0698: goto 069f
      // 069b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 069e: athrow
      // 069f: invokevirtual java/lang/Number.intValue ()I
      // 06a2: istore 10
      // 06a4: bipush 0
      // 06a5: istore 11
      // 06a7: iload 1
      // 06a8: ifeq 06d0
      // 06ab: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 06ae: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 06b1: iload 10
      // 06b3: if_icmpeq 06cb
      // 06b6: goto 06bd
      // 06b9: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06bc: athrow
      // 06bd: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 06c0: iload 10
      // 06c2: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 06c5: pop
      // 06c6: return
      // 06c7: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06ca: athrow
      // 06cb: nop
      // 06cc: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 06cf: pop
      // 06d0: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 06d3: goto 06d7
      // 06d6: aconst_null
      // 06d7: pop
      // 06d8: getstatic me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
      // 06db: aload 5
      // 06dd: invokevirtual me/octo/client/utils/IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll.b ()Lnet/minecraft/world/phys/Vec3;
      // 06e0: invokevirtual me/octo/client/utils/player/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.c (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
      // 06e3: invokevirtual me/octo/client/utils/player/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.a ()F
      // 06e6: invokestatic java/lang/Math.abs (F)F
      // 06e9: ldc_w 10.0
      // 06ec: fcmpg
      // 06ed: iload 1
      // 06ee: ifeq 071d
      // 06f1: ifge 0923
      // 06f4: goto 06fb
      // 06f7: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 06fa: athrow
      // 06fb: aload 0
      // 06fc: iload 1
      // 06fd: ifeq 0721
      // 0700: goto 0707
      // 0703: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0706: athrow
      // 0707: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 070a: sipush 500
      // 070d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0710: checkcast java/lang/Number
      // 0713: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0716: goto 071d
      // 0719: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 071c: athrow
      // 071d: ifeq 0923
      // 0720: aload 0
      // 0721: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 0724: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 0727: dup
      // 0728: ifnonnull 0731
      // 072b: pop
      // 072c: return
      // 072d: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0730: athrow
      // 0731: astore 8
      // 0733: aload 8
      // 0735: invokevirtual net/minecraft/client/multiplayer/ClientLevel.entitiesForRendering ()Ljava/lang/Iterable;
      // 0738: dup
      // 0739: sipush -24367
      // 073c: sipush 28020
      // 073f: pop2
      // 0740: ldc_w "entitiesForRendering(...)"
      // 0743: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0746: astore 11
      // 0748: nop
      // 0749: bipush 0
      // 074a: istore 12
      // 074c: aload 11
      // 074e: astore 13
      // 0750: new java/util/ArrayList
      // 0753: dup
      // 0754: invokespecial java/util/ArrayList.<init> ()V
      // 0757: checkcast java/util/Collection
      // 075a: astore 14
      // 075c: bipush 0
      // 075d: istore 15
      // 075f: aload 13
      // 0761: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0766: astore 16
      // 0768: aload 16
      // 076a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 076f: ifeq 07a7
      // 0772: aload 16
      // 0774: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0779: astore 17
      // 077b: aload 17
      // 077d: instanceof net/minecraft/client/player/RemotePlayer
      // 0780: iload 1
      // 0781: ifeq 07b3
      // 0784: iload 1
      // 0785: ifeq 07a2
      // 0788: goto 078f
      // 078b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 078e: athrow
      // 078f: ifeq 0768
      // 0792: goto 0799
      // 0795: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0798: athrow
      // 0799: aload 14
      // 079b: aload 17
      // 079d: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 07a2: pop
      // 07a3: iload 1
      // 07a4: ifne 0768
      // 07a7: aload 14
      // 07a9: checkcast java/util/List
      // 07ac: nop
      // 07ad: checkcast java/lang/Iterable
      // 07b0: astore 11
      // 07b2: bipush 0
      // 07b3: istore 12
      // 07b5: aload 11
      // 07b7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 07bc: astore 13
      // 07be: aload 13
      // 07c0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07c5: ifeq 08ce
      // 07c8: aload 13
      // 07ca: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 07cf: astore 14
      // 07d1: aload 14
      // 07d3: checkcast net/minecraft/client/player/RemotePlayer
      // 07d6: astore 15
      // 07d8: bipush 0
      // 07d9: istore 16
      // 07db: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 07de: aload 15
      // 07e0: checkcast net/minecraft/world/entity/Entity
      // 07e3: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 07e6: aload 5
      // 07e8: invokevirtual me/octo/client/utils/IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll.b ()Lnet/minecraft/world/phys/Vec3;
      // 07eb: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 07ee: ldc2_w 0.3
      // 07f1: dcmpg
      // 07f2: ifge 08c0
      // 07f5: aload 0
      // 07f6: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll Ljava/util/List;
      // 07f9: checkcast java/lang/Iterable
      // 07fc: astore 17
      // 07fe: bipush 0
      // 07ff: istore 18
      // 0801: aload 17
      // 0803: iload 1
      // 0804: ifeq 083d
      // 0807: instanceof java/util/Collection
      // 080a: ifeq 083b
      // 080d: goto 0814
      // 0810: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0813: athrow
      // 0814: aload 17
      // 0816: checkcast java/util/Collection
      // 0819: iload 1
      // 081a: ifeq 083d
      // 081d: goto 0824
      // 0820: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0823: athrow
      // 0824: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0829: ifeq 083b
      // 082c: goto 0833
      // 082f: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0832: athrow
      // 0833: bipush 0
      // 0834: goto 08b5
      // 0837: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 083a: athrow
      // 083b: aload 17
      // 083d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0842: astore 19
      // 0844: aload 19
      // 0846: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 084b: ifeq 08b4
      // 084e: aload 19
      // 0850: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0855: astore 20
      // 0857: aload 20
      // 0859: checkcast kotlin/Pair
      // 085c: astore 21
      // 085e: bipush 0
      // 085f: istore 22
      // 0861: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0864: aload 15
      // 0866: checkcast net/minecraft/world/entity/Entity
      // 0869: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 086c: aload 21
      // 086e: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 0871: checkcast net/minecraft/world/phys/Vec3
      // 0874: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 0877: ldc2_w 0.3
      // 087a: dcmpg
      // 087b: iload 1
      // 087c: ifeq 0896
      // 087f: ifge 08a8
      // 0882: aload 15
      // 0884: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/client/player/RemotePlayer;)Ljava/lang/String;
      // 0887: aload 21
      // 0889: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 088c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 088f: goto 0896
      // 0892: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0895: athrow
      // 0896: iload 1
      // 0897: ifeq 08a5
      // 089a: ifeq 08a8
      // 089d: goto 08a4
      // 08a0: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08a3: athrow
      // 08a4: bipush 1
      // 08a5: goto 08a9
      // 08a8: bipush 0
      // 08a9: ifeq 0844
      // 08ac: bipush 1
      // 08ad: iload 1
      // 08ae: ifeq 087b
      // 08b1: goto 08b5
      // 08b4: bipush 0
      // 08b5: ifeq 08c0
      // 08b8: bipush 1
      // 08b9: goto 08c1
      // 08bc: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08bf: athrow
      // 08c0: bipush 0
      // 08c1: nop
      // 08c2: ifeq 07be
      // 08c5: aload 14
      // 08c7: iload 1
      // 08c8: ifeq 07d3
      // 08cb: goto 08cf
      // 08ce: aconst_null
      // 08cf: checkcast net/minecraft/client/player/RemotePlayer
      // 08d2: dup
      // 08d3: ifnonnull 08dc
      // 08d6: pop
      // 08d7: return
      // 08d8: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08db: athrow
      // 08dc: astore 9
      // 08de: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 08e1: aload 9
      // 08e3: checkcast net/minecraft/world/entity/Entity
      // 08e6: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (Lnet/minecraft/world/entity/Entity;)V
      // 08e9: aload 0
      // 08ea: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 08ed: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 08f0: iload 1
      // 08f1: ifne 0923
      // 08f4: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 08f7: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 08fa: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 08fd: goto 0904
      // 0900: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0903: athrow
      // 0904: iload 1
      // 0905: ifeq 0922
      // 0908: ifeq 0923
      // 090b: goto 0912
      // 090e: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0911: athrow
      // 0912: aload 0
      // 0913: aload 5
      // 0915: invokevirtual me/octo/client/utils/IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll.a ()Lnet/minecraft/core/BlockPos;
      // 0918: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lnet/minecraft/core/BlockPos;)Z
      // 091b: goto 0922
      // 091e: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0921: athrow
      // 0922: pop
      // 0923: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0926: goto 13cd
      // 0929: getstatic me/octo/client/utils/player/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 092c: invokevirtual me/octo/client/utils/player/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.g ()Z
      // 092f: iload 1
      // 0930: ifeq 0958
      // 0933: ifne 0948
      // 0936: goto 093d
      // 0939: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 093c: athrow
      // 093d: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0940: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.t ()V
      // 0943: return
      // 0944: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0947: athrow
      // 0948: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 094b: sipush -24330
      // 094e: sipush -9275
      // 0951: pop2
      // 0952: ldc_w "attack"
      // 0955: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;)Z
      // 0958: iload 1
      // 0959: ifeq 0981
      // 095c: ifeq 097c
      // 095f: goto 0966
      // 0962: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0965: athrow
      // 0966: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 0969: sipush -24359
      // 096c: sipush -30317
      // 096f: pop2
      // 0970: ldc_w "attack"
      // 0973: bipush 0
      // 0974: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 0977: return
      // 0978: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 097b: athrow
      // 097c: aload 0
      // 097d: bipush 0
      // 097e: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.e (I)Z
      // 0981: iload 1
      // 0982: ifeq 09b0
      // 0985: ifeq 0990
      // 0988: goto 098f
      // 098b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 098e: athrow
      // 098f: return
      // 0990: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0993: getstatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
      // 0996: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0999: bipush 0
      // 099a: bipush 2
      // 099b: aconst_null
      // 099c: invokestatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.a (Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;IILjava/lang/Object;)Lme/octo/client/lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI;
      // 099f: invokevirtual me/octo/client/lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI.c ()Lnet/minecraft/world/phys/Vec3;
      // 09a2: aload 2
      // 09a3: checkcast net/minecraft/world/entity/Entity
      // 09a6: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 09a9: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)D
      // 09ac: ldc2_w 2.0
      // 09af: dcmpg
      // 09b0: ifge 09cf
      // 09b3: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 09b6: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.H ()Lnet/minecraft/world/phys/EntityHitResult;
      // 09b9: ifnull 09cf
      // 09bc: goto 09c3
      // 09bf: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09c2: athrow
      // 09c3: fconst_0
      // 09c4: fconst_0
      // 09c5: invokestatic me/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a (FF)Lme/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 09c8: goto 09d8
      // 09cb: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09ce: athrow
      // 09cf: getstatic me/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 09d2: invokevirtual me/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.g ()V
      // 09d5: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 09d8: pop
      // 09d9: iload 1
      // 09da: ifeq 09f6
      // 09dd: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 09e0: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.t ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 09e3: dup
      // 09e4: ifnonnull 09f7
      // 09e7: goto 09ee
      // 09ea: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09ed: athrow
      // 09ee: pop
      // 09ef: goto 09f6
      // 09f2: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09f5: athrow
      // 09f6: return
      // 09f7: astore 5
      // 09f9: aload 0
      // 09fa: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl Z
      // 09fd: iload 1
      // 09fe: ifeq 0a50
      // 0a01: ifne 0a47
      // 0a04: goto 0a0b
      // 0a07: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a0a: athrow
      // 0a0b: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0a0e: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 0a11: iload 1
      // 0a12: ifeq 0af5
      // 0a15: goto 0a1c
      // 0a18: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a1b: athrow
      // 0a1c: aload 5
      // 0a1e: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0a21: if_icmpeq 0af1
      // 0a24: goto 0a2b
      // 0a27: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a2a: athrow
      // 0a2b: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0a2e: aload 5
      // 0a30: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0a33: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.b (I)Z
      // 0a36: pop
      // 0a37: aload 0
      // 0a38: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0a3b: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0a3e: aload 0
      // 0a3f: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bA ()V
      // 0a42: return
      // 0a43: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a46: athrow
      // 0a47: getstatic me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI;
      // 0a4a: invokevirtual me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.d ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 0a4d: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 0a50: iload 1
      // 0a51: ifeq 0af5
      // 0a54: ifeq 0af1
      // 0a57: goto 0a5e
      // 0a5a: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a5d: athrow
      // 0a5e: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 0a61: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.G ()Ljava/lang/Integer;
      // 0a64: dup
      // 0a65: iload 1
      // 0a66: ifeq 0aa7
      // 0a69: goto 0a70
      // 0a6c: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a6f: athrow
      // 0a70: ifnonnull 0aa6
      // 0a73: goto 0a7a
      // 0a76: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a79: athrow
      // 0a7a: pop
      // 0a7b: iload 1
      // 0a7c: ifeq 0aa5
      // 0a7f: goto 0a86
      // 0a82: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a85: athrow
      // 0a86: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 0a89: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.q ()Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0a8c: dup
      // 0a8d: ifnull 0aa4
      // 0a90: goto 0a97
      // 0a93: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a96: athrow
      // 0a97: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 0a9a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a9d: goto 0aa6
      // 0aa0: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0aa3: athrow
      // 0aa4: pop
      // 0aa5: aconst_null
      // 0aa6: dup
      // 0aa7: ifnull 0aee
      // 0aaa: checkcast java/lang/Number
      // 0aad: invokevirtual java/lang/Number.intValue ()I
      // 0ab0: istore 8
      // 0ab2: bipush 0
      // 0ab3: istore 9
      // 0ab5: iload 1
      // 0ab6: ifeq 0ae8
      // 0ab9: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 0abc: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.K ()I
      // 0abf: iload 8
      // 0ac1: if_icmpeq 0ae3
      // 0ac4: goto 0acb
      // 0ac7: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0aca: athrow
      // 0acb: aload 0
      // 0acc: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 0acf: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 0ad2: dup
      // 0ad3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0ad6: invokevirtual net/minecraft/client/player/LocalPlayer.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 0ad9: iload 8
      // 0adb: invokevirtual net/minecraft/world/entity/player/Inventory.setSelectedSlot (I)V
      // 0ade: return
      // 0adf: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ae2: athrow
      // 0ae3: nop
      // 0ae4: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0ae7: pop
      // 0ae8: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0aeb: goto 0af0
      // 0aee: pop
      // 0aef: aconst_null
      // 0af0: pop
      // 0af1: aload 0
      // 0af2: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl Z
      // 0af5: iload 1
      // 0af6: ifeq 0b50
      // 0af9: ifeq 0b38
      // 0afc: goto 0b03
      // 0aff: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b02: athrow
      // 0b03: aload 0
      // 0b04: iload 1
      // 0b05: ifeq 0b30
      // 0b08: goto 0b0f
      // 0b0b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b0e: athrow
      // 0b0f: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0b12: sipush 400
      // 0b15: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b18: checkcast java/lang/Number
      // 0b1b: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0b1e: ifeq 0b85
      // 0b21: goto 0b28
      // 0b24: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b27: athrow
      // 0b28: aload 0
      // 0b29: goto 0b30
      // 0b2c: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b2f: athrow
      // 0b30: bipush 0
      // 0b31: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl Z
      // 0b34: iload 1
      // 0b35: ifne 0b85
      // 0b38: aload 0
      // 0b39: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0b3c: aload 0
      // 0b3d: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII I
      // 0b40: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b43: checkcast java/lang/Number
      // 0b46: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0b49: goto 0b50
      // 0b4c: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b4f: athrow
      // 0b50: iload 1
      // 0b51: ifeq 0b6b
      // 0b54: ifeq 0b85
      // 0b57: goto 0b5e
      // 0b5a: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b5d: athrow
      // 0b5e: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0b61: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.k ()Z
      // 0b64: goto 0b6b
      // 0b67: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b6a: athrow
      // 0b6b: ifeq 0b85
      // 0b6e: aload 0
      // 0b6f: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0b72: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0b75: aload 0
      // 0b76: bipush 1
      // 0b77: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl Z
      // 0b7a: aload 0
      // 0b7b: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bA ()V
      // 0b7e: goto 0b85
      // 0b81: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b84: athrow
      // 0b85: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0b88: goto 13cd
      // 0b8b: aload 0
      // 0b8c: iload 1
      // 0b8d: ifeq 0ba4
      // 0b90: bipush 1
      // 0b91: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.e (I)Z
      // 0b94: ifeq 0ba3
      // 0b97: goto 0b9e
      // 0b9a: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b9d: athrow
      // 0b9e: return
      // 0b9f: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ba2: athrow
      // 0ba3: aload 0
      // 0ba4: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 0ba7: dup
      // 0ba8: ifnonnull 0bb1
      // 0bab: pop
      // 0bac: return
      // 0bad: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bb0: athrow
      // 0bb1: astore 5
      // 0bb3: aload 5
      // 0bb5: invokevirtual me/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII.g ()Lnet/minecraft/core/BlockPos;
      // 0bb8: astore 6
      // 0bba: iload 1
      // 0bbb: ifeq 0be8
      // 0bbe: aload 6
      // 0bc0: ifnonnull 0be9
      // 0bc3: goto 0bca
      // 0bc6: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0bc9: athrow
      // 0bca: sipush -24333
      // 0bcd: sipush 21091
      // 0bd0: pop2
      // 0bd1: ldc_w "Every vein is being mined by another player"
      // 0bd4: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 0bd7: aload 0
      // 0bd8: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0bdb: sipush 10000
      // 0bde: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;I)V
      // 0be1: goto 0be8
      // 0be4: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0be7: athrow
      // 0be8: return
      // 0be9: aload 0
      // 0bea: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 0bed: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 0bf0: dup
      // 0bf1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0bf4: invokevirtual net/minecraft/client/multiplayer/ClientLevel.players ()Ljava/util/List;
      // 0bf7: dup
      // 0bf8: sipush -24334
      // 0bfb: sipush -28964
      // 0bfe: pop2
      // 0bff: ldc_w "players(...)"
      // 0c02: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c05: astore 7
      // 0c07: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0c0a: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()Lme/octo/client/lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl;
      // 0c0d: invokevirtual me/octo/client/lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl.a ()Lme/octo/client/IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII;
      // 0c10: invokevirtual me/octo/client/IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII.e ()Ljava/util/List;
      // 0c13: checkcast java/util/Collection
      // 0c16: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0c19: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.g ()Lme/octo/client/llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll;
      // 0c1c: invokevirtual me/octo/client/llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.a ()Lme/octo/client/IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII;
      // 0c1f: invokevirtual me/octo/client/IIllIIllllllIIlIIlIIIlllIIIlIllIlIIIllIIIlIIlllIlllIIlIIlIllIIlllIIIllIlIIIlIIIlIIlII.e ()Ljava/util/List;
      // 0c22: checkcast java/lang/Iterable
      // 0c25: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
      // 0c28: checkcast java/util/Collection
      // 0c2b: sipush -24327
      // 0c2e: sipush 24083
      // 0c31: pop2
      // 0c32: ldc_w "Treasuer Hunter"
      // 0c35: invokestatic kotlin/collections/CollectionsKt.plus (Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;
      // 0c38: astore 8
      // 0c3a: bipush 0
      // 0c3b: istore 9
      // 0c3d: aload 7
      // 0c3f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c44: astore 10
      // 0c46: aload 10
      // 0c48: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c4d: ifeq 0e58
      // 0c50: aload 10
      // 0c52: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c57: dup
      // 0c58: sipush -24353
      // 0c5b: sipush 2840
      // 0c5e: pop2
      // 0c5f: ldc_w "next(...)"
      // 0c62: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c65: checkcast net/minecraft/client/player/AbstractClientPlayer
      // 0c68: astore 11
      // 0c6a: iload 1
      // 0c6b: ifeq 0ee5
      // 0c6e: aload 11
      // 0c70: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getName ()Lnet/minecraft/network/chat/Component;
      // 0c73: iload 1
      // 0c74: ifeq 0c9b
      // 0c77: goto 0c7e
      // 0c7a: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c7d: athrow
      // 0c7e: aload 0
      // 0c7f: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 0c82: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 0c85: dup
      // 0c86: ifnull 0c9a
      // 0c89: goto 0c90
      // 0c8c: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c8f: athrow
      // 0c90: invokevirtual net/minecraft/client/player/LocalPlayer.getName ()Lnet/minecraft/network/chat/Component;
      // 0c93: goto 0c9c
      // 0c96: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c99: athrow
      // 0c9a: pop
      // 0c9b: aconst_null
      // 0c9c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0c9f: iload 1
      // 0ca0: ifeq 0c4d
      // 0ca3: ifne 0c46
      // 0ca6: aload 11
      // 0ca8: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getName ()Lnet/minecraft/network/chat/Component;
      // 0cab: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 0cb0: dup
      // 0cb1: sipush -24393
      // 0cb4: sipush 3580
      // 0cb7: pop2
      // 0cb8: ldc_w "getString(...)"
      // 0cbb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0cbe: astore 12
      // 0cc0: aload 8
      // 0cc2: checkcast java/lang/Iterable
      // 0cc5: astore 13
      // 0cc7: bipush 0
      // 0cc8: istore 14
      // 0cca: aload 13
      // 0ccc: iload 1
      // 0ccd: ifeq 0d06
      // 0cd0: instanceof java/util/Collection
      // 0cd3: ifeq 0d04
      // 0cd6: goto 0cdd
      // 0cd9: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cdc: athrow
      // 0cdd: aload 13
      // 0cdf: checkcast java/util/Collection
      // 0ce2: iload 1
      // 0ce3: ifeq 0d06
      // 0ce6: goto 0ced
      // 0ce9: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cec: athrow
      // 0ced: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0cf2: ifeq 0d04
      // 0cf5: goto 0cfc
      // 0cf8: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0cfb: athrow
      // 0cfc: bipush 0
      // 0cfd: goto 0d44
      // 0d00: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d03: athrow
      // 0d04: aload 13
      // 0d06: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0d0b: astore 15
      // 0d0d: aload 15
      // 0d0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d14: ifeq 0d43
      // 0d17: aload 15
      // 0d19: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d1e: astore 16
      // 0d20: aload 16
      // 0d22: checkcast java/lang/String
      // 0d25: astore 17
      // 0d27: bipush 0
      // 0d28: istore 18
      // 0d2a: aload 12
      // 0d2c: checkcast java/lang/CharSequence
      // 0d2f: aload 17
      // 0d31: checkcast java/lang/CharSequence
      // 0d34: bipush 1
      // 0d35: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
      // 0d38: ifeq 0d0d
      // 0d3b: bipush 1
      // 0d3c: iload 1
      // 0d3d: ifeq 0d38
      // 0d40: goto 0d44
      // 0d43: bipush 0
      // 0d44: ifeq 0d52
      // 0d47: iload 1
      // 0d48: ifne 0c46
      // 0d4b: goto 0d52
      // 0d4e: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d51: athrow
      // 0d52: aload 5
      // 0d54: invokevirtual me/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII.i ()Ljava/util/ArrayList;
      // 0d57: checkcast java/lang/Iterable
      // 0d5a: astore 13
      // 0d5c: bipush 0
      // 0d5d: istore 14
      // 0d5f: aload 13
      // 0d61: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0d66: astore 15
      // 0d68: aload 15
      // 0d6a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d6f: ifeq 0e53
      // 0d72: aload 15
      // 0d74: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d79: astore 16
      // 0d7b: aload 16
      // 0d7d: checkcast net/minecraft/core/BlockPos
      // 0d80: astore 17
      // 0d82: bipush 0
      // 0d83: istore 18
      // 0d85: iload 1
      // 0d86: ifeq 0e4f
      // 0d89: aload 0
      // 0d8a: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII Ljava/util/ArrayList;
      // 0d8d: aload 17
      // 0d8f: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 0d92: iload 1
      // 0d93: ifeq 0c4d
      // 0d96: goto 0d9d
      // 0d99: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d9c: athrow
      // 0d9d: ifne 0e4e
      // 0da0: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 0da3: aload 17
      // 0da5: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 0da8: dup
      // 0da9: sipush -24381
      // 0dac: sipush -14686
      // 0daf: pop2
      // 0db0: ldc_w "getCenter(...)"
      // 0db3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0db6: aload 11
      // 0db8: checkcast net/minecraft/world/entity/Entity
      // 0dbb: invokestatic me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 0dbe: ldc2_w 6.0
      // 0dc1: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 0dc4: iload 1
      // 0dc5: ifeq 0df3
      // 0dc8: goto 0dcf
      // 0dcb: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0dce: athrow
      // 0dcf: ifeq 0e4d
      // 0dd2: goto 0dd9
      // 0dd5: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0dd8: athrow
      // 0dd9: aload 11
      // 0ddb: invokevirtual net/minecraft/client/player/AbstractClientPlayer.getY ()D
      // 0dde: aload 17
      // 0de0: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 0de3: i2d
      // 0de4: dsub
      // 0de5: invokestatic java/lang/Math.abs (D)D
      // 0de8: ldc2_w 3.0
      // 0deb: dcmpg
      // 0dec: goto 0df3
      // 0def: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0df2: athrow
      // 0df3: ifge 0e4d
      // 0df6: new kotlin/Pair
      // 0df9: dup
      // 0dfa: aload 12
      // 0dfc: aload 17
      // 0dfe: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0e01: astore 19
      // 0e03: aload 0
      // 0e04: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII Ljava/util/HashSet;
      // 0e07: aload 19
      // 0e09: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0e0c: iload 1
      // 0e0d: ifeq 0e4b
      // 0e10: ifeq 0e4d
      // 0e13: goto 0e1a
      // 0e16: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e19: athrow
      // 0e1a: aload 12
      // 0e1c: sipush -24336
      // 0e1f: sipush -5181
      // 0e22: pop2
      // 0e23: ldc_w "Detected player "
      // 0e26: swap
      // 0e27: sipush -24348
      // 0e2a: sipush 3127
      // 0e2d: pop2
      // 0e2e: ldc_w " at a location"
      // 0e31: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 0e36: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 0e39: aload 0
      // 0e3a: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII Ljava/util/ArrayList;
      // 0e3d: aload 17
      // 0e3f: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0e42: pop
      // 0e43: bipush 1
      // 0e44: goto 0e4b
      // 0e47: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e4a: athrow
      // 0e4b: istore 9
      // 0e4d: nop
      // 0e4e: nop
      // 0e4f: iload 1
      // 0e50: ifne 0d68
      // 0e53: nop
      // 0e54: iload 1
      // 0e55: ifne 0c46
      // 0e58: iload 9
      // 0e5a: ifeq 0ee5
      // 0e5d: aload 0
      // 0e5e: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 0e61: dup
      // 0e62: ifnull 0e7d
      // 0e65: goto 0e6c
      // 0e68: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e6b: athrow
      // 0e6c: aload 0
      // 0e6d: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII Ljava/util/ArrayList;
      // 0e70: invokevirtual me/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII.b (Ljava/util/ArrayList;)V
      // 0e73: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 0e76: goto 0e7f
      // 0e79: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e7c: athrow
      // 0e7d: pop
      // 0e7e: aconst_null
      // 0e7f: pop
      // 0e80: iload 1
      // 0e81: ifeq 0e9e
      // 0e84: aload 0
      // 0e85: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 0e88: dup
      // 0e89: ifnull 0e9d
      // 0e8c: goto 0e93
      // 0e8f: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e92: athrow
      // 0e93: invokevirtual me/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII.g ()Lnet/minecraft/core/BlockPos;
      // 0e96: goto 0e9f
      // 0e99: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e9c: athrow
      // 0e9d: pop
      // 0e9e: aconst_null
      // 0e9f: ifnonnull 0ebe
      // 0ea2: sipush -24370
      // 0ea5: sipush -11292
      // 0ea8: pop2
      // 0ea9: ldc_w "All veins blacklisted after detection"
      // 0eac: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 0eaf: aload 0
      // 0eb0: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 0eb3: sipush 10000
      // 0eb6: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;I)V
      // 0eb9: return
      // 0eba: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ebd: athrow
      // 0ebe: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0ec1: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 0ec4: iload 1
      // 0ec5: ifeq 0ee2
      // 0ec8: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 0ecb: ifne 0ee5
      // 0ece: goto 0ed5
      // 0ed1: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ed4: athrow
      // 0ed5: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0ed8: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 0edb: goto 0ee2
      // 0ede: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ee1: athrow
      // 0ee2: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 0ee5: aload 5
      // 0ee7: invokevirtual me/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII.h ()Lnet/minecraft/core/BlockPos;
      // 0eea: astore 7
      // 0eec: iload 1
      // 0eed: ifeq 0f12
      // 0ef0: aload 7
      // 0ef2: ifnonnull 0f13
      // 0ef5: goto 0efc
      // 0ef8: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0efb: athrow
      // 0efc: sipush -24378
      // 0eff: bipush 21
      // 0f01: pop2
      // 0f02: aload 5
      // 0f04: aload 0
      // 0f05: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII Ljava/util/ArrayList;
      // 0f08: invokestatic me/octo/client/utils/dwarven/PolinexDwarvenRouteRecovery.onMissing (Ljava/lang/Object;Ljava/util/ArrayList;)V
      // 0f0b: goto 0f12
      // 0f0e: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f11: athrow
      // 0f12: return
      // 0f13: aload 5
      // 0f15: invokestatic me/octo/client/utils/dwarven/PolinexDwarvenRouteRecovery.onResolved (Ljava/lang/Object;)V
      // 0f18: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 0f1b: aload 7
      // 0f1d: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.g (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;
      // 0f20: astore 8
      // 0f22: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0f25: aload 8
      // 0f27: bipush 0
      // 0f28: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b (Lnet/minecraft/world/phys/Vec3;Z)D
      // 0f2b: dstore 9
      // 0f2d: aload 2
      // 0f2e: checkcast net/minecraft/world/entity/Entity
      // 0f31: invokestatic me/octo/client/utils/player/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a (Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;
      // 0f34: astore 11
      // 0f36: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 0f39: aload 11
      // 0f3b: aload 8
      // 0f3d: aconst_null
      // 0f3e: bipush 0
      // 0f3f: bipush 0
      // 0f40: dconst_0
      // 0f41: bipush 0
      // 0f42: bipush 1
      // 0f43: dconst_0
      // 0f44: sipush 380
      // 0f47: aconst_null
      // 0f48: invokestatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IZDZZDILjava/lang/Object;)Z
      // 0f4b: iload 1
      // 0f4c: ifeq 0f72
      // 0f4f: ifeq 0f80
      // 0f52: goto 0f59
      // 0f55: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f58: athrow
      // 0f59: aload 11
      // 0f5b: getfield net/minecraft/world/phys/Vec3.y D
      // 0f5e: aload 8
      // 0f60: getfield net/minecraft/world/phys/Vec3.y D
      // 0f63: dsub
      // 0f64: invokestatic java/lang/Math.abs (D)D
      // 0f67: ldc2_w 2.5
      // 0f6a: dcmpl
      // 0f6b: goto 0f72
      // 0f6e: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f71: athrow
      // 0f72: iload 1
      // 0f73: ifeq 0f94
      // 0f76: iflt 0f8e
      // 0f79: goto 0f80
      // 0f7c: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f7f: athrow
      // 0f80: aload 0
      // 0f81: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0f84: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 0f87: goto 0f8e
      // 0f8a: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f8d: athrow
      // 0f8e: dload 9
      // 0f90: ldc2_w 6.0
      // 0f93: dcmpg
      // 0f94: iload 1
      // 0f95: ifeq 120b
      // 0f98: ifge 11fb
      // 0f9b: goto 0fa2
      // 0f9e: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fa1: athrow
      // 0fa2: aload 0
      // 0fa3: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 0fa6: sipush 300
      // 0fa9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fac: checkcast java/lang/Number
      // 0faf: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0fb2: iload 1
      // 0fb3: ifeq 120b
      // 0fb6: goto 0fbd
      // 0fb9: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fbc: athrow
      // 0fbd: ifeq 11fb
      // 0fc0: goto 0fc7
      // 0fc3: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fc6: athrow
      // 0fc7: aload 0
      // 0fc8: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bw ()V
      // 0fcb: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0fce: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 0fd1: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 0fd4: iload 1
      // 0fd5: ifeq 1014
      // 0fd8: goto 0fdf
      // 0fdb: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fde: athrow
      // 0fdf: ifne 0ff9
      // 0fe2: goto 0fe9
      // 0fe5: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fe8: athrow
      // 0fe9: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0fec: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 0fef: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.k ()V
      // 0ff2: goto 0ff9
      // 0ff5: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0ff8: athrow
      // 0ff9: aload 5
      // 0ffb: invokevirtual me/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII.a ()Ljava/lang/String;
      // 0ffe: checkcast java/lang/CharSequence
      // 1001: sipush -24344
      // 1004: sipush 5235
      // 1007: pop2
      // 1008: ldc_w "Slayer"
      // 100b: checkcast java/lang/CharSequence
      // 100e: bipush 0
      // 100f: bipush 2
      // 1010: aconst_null
      // 1011: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 1014: iload 1
      // 1015: ifeq 1038
      // 1018: ifeq 102b
      // 101b: goto 1022
      // 101e: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1021: athrow
      // 1022: aload 0
      // 1023: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bt ()V
      // 1026: return
      // 1027: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 102a: athrow
      // 102b: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 102e: aload 8
      // 1030: aload 11
      // 1032: ldc2_w 0.7
      // 1035: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 1038: iload 1
      // 1039: ifeq 1083
      // 103c: ifeq 1076
      // 103f: goto 1046
      // 1042: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1045: athrow
      // 1046: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 1049: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.j ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 104c: sipush 500
      // 104f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1052: checkcast java/lang/Number
      // 1055: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 1058: iload 1
      // 1059: ifeq 1083
      // 105c: goto 1063
      // 105f: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1062: athrow
      // 1063: ifne 1076
      // 1066: goto 106d
      // 1069: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 106c: athrow
      // 106d: aload 0
      // 106e: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bt ()V
      // 1071: return
      // 1072: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1075: athrow
      // 1076: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 1079: aload 8
      // 107b: aload 11
      // 107d: ldc2_w 2.0
      // 1080: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 1083: ifeq 1096
      // 1086: getstatic me/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 1089: invokevirtual me/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.g ()V
      // 108c: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 108f: goto 10af
      // 1092: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1095: athrow
      // 1096: aload 8
      // 1098: invokestatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.g ()Lnet/minecraft/world/phys/Vec3;
      // 109b: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 109e: dup
      // 109f: sipush -24383
      // 10a2: sipush 14508
      // 10a5: pop2
      // 10a6: ldc_w "add(...)"
      // 10a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 10ac: invokestatic me/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a (Lnet/minecraft/world/phys/Vec3;)Lme/octo/client/utils/player/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
      // 10af: pop
      // 10b0: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 10b3: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.j ()Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 10b6: bipush 100
      // 10b8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10bb: checkcast java/lang/Number
      // 10be: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 10c1: iload 1
      // 10c2: ifeq 10d0
      // 10c5: ifne 10d3
      // 10c8: goto 10cf
      // 10cb: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10ce: athrow
      // 10cf: bipush 1
      // 10d0: goto 10d4
      // 10d3: bipush 0
      // 10d4: istore 12
      // 10d6: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 10d9: aload 8
      // 10db: aload 11
      // 10dd: dconst_1
      // 10de: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 10e1: ifeq 10ee
      // 10e4: ldc2_w 0.2
      // 10e7: goto 10f1
      // 10ea: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10ed: athrow
      // 10ee: ldc2_w 0.4
      // 10f1: dstore 13
      // 10f3: iload 12
      // 10f5: iload 1
      // 10f6: ifeq 113b
      // 10f9: ifeq 1121
      // 10fc: goto 1103
      // 10ff: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1102: athrow
      // 1103: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 1106: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.Q ()D
      // 1109: dload 13
      // 110b: dcmpl
      // 110c: iload 1
      // 110d: ifeq 113b
      // 1110: goto 1117
      // 1113: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1116: athrow
      // 1117: ifle 115a
      // 111a: goto 1121
      // 111d: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1120: athrow
      // 1121: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1124: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.p ()V
      // 1127: iload 1
      // 1128: ifeq 1186
      // 112b: goto 1132
      // 112e: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1131: athrow
      // 1132: iload 12
      // 1134: goto 113b
      // 1137: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 113a: athrow
      // 113b: ifne 1170
      // 113e: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1141: sipush -24391
      // 1144: sipush 21020
      // 1147: pop2
      // 1148: ldc_w "backward"
      // 114b: bipush 1
      // 114c: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 114f: iload 1
      // 1150: ifne 1170
      // 1153: goto 115a
      // 1156: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1159: athrow
      // 115a: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 115d: aload 11
      // 115f: aload 8
      // 1161: bipush 0
      // 1162: dconst_0
      // 1163: bipush 12
      // 1165: aconst_null
      // 1166: invokestatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;ZDILjava/lang/Object;)V
      // 1169: goto 1170
      // 116c: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 116f: athrow
      // 1170: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1173: sipush -24355
      // 1176: sipush -4588
      // 1179: pop2
      // 117a: ldc_w "jump"
      // 117d: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1180: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.j ()Z
      // 1183: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 1186: getstatic me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
      // 1189: sipush -24339
      // 118c: sipush 11026
      // 118f: pop2
      // 1190: ldc_w "sneak"
      // 1193: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 1196: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.P ()Z
      // 1199: iload 1
      // 119a: ifeq 11bf
      // 119d: ifne 11f3
      // 11a0: goto 11a7
      // 11a3: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11a6: athrow
      // 11a7: aload 2
      // 11a8: invokevirtual net/minecraft/client/player/LocalPlayer.getY ()D
      // 11ab: aload 8
      // 11ad: getfield net/minecraft/world/phys/Vec3.y D
      // 11b0: dsub
      // 11b1: invokestatic java/lang/Math.abs (D)D
      // 11b4: ldc2_w 0.5
      // 11b7: dcmpg
      // 11b8: goto 11bf
      // 11bb: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11be: athrow
      // 11bf: iload 1
      // 11c0: ifeq 11e1
      // 11c3: ifge 11f3
      // 11c6: goto 11cd
      // 11c9: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11cc: athrow
      // 11cd: getstatic me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;
      // 11d0: aload 8
      // 11d2: aload 11
      // 11d4: ldc2_w 1.5
      // 11d7: invokevirtual me/octo/client/utils/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;D)Z
      // 11da: goto 11e1
      // 11dd: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11e0: athrow
      // 11e1: iload 1
      // 11e2: ifeq 11f0
      // 11e5: ifeq 11f3
      // 11e8: goto 11ef
      // 11eb: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 11ee: athrow
      // 11ef: bipush 1
      // 11f0: goto 11f4
      // 11f3: bipush 0
      // 11f4: invokevirtual me/octo/client/utils/player/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a (Ljava/lang/String;Z)V
      // 11f7: iload 1
      // 11f8: ifne 1227
      // 11fb: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 11fe: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.e ()Lme/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll;
      // 1201: invokevirtual me/octo/client/IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.d ()Z
      // 1204: goto 120b
      // 1207: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 120a: athrow
      // 120b: iload 1
      // 120c: ifeq 1226
      // 120f: ifeq 1227
      // 1212: goto 1219
      // 1215: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1218: athrow
      // 1219: aload 0
      // 121a: aload 7
      // 121c: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lnet/minecraft/core/BlockPos;)Z
      // 121f: goto 1226
      // 1222: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1225: athrow
      // 1226: pop
      // 1227: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 122a: goto 13cd
      // 122d: aload 0
      // 122e: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 1231: dup
      // 1232: ifnonnull 123b
      // 1235: pop
      // 1236: return
      // 1237: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 123a: athrow
      // 123b: astore 5
      // 123d: iload 1
      // 123e: ifeq 1259
      // 1241: aload 5
      // 1243: invokevirtual me/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII.h ()Lnet/minecraft/core/BlockPos;
      // 1246: dup
      // 1247: ifnonnull 125a
      // 124a: goto 1251
      // 124d: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1250: athrow
      // 1251: pop
      // 1252: goto 1259
      // 1255: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1258: athrow
      // 1259: return
      // 125a: astore 6
      // 125c: getstatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 125f: invokevirtual me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII;
      // 1262: invokevirtual me/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.b ()Z
      // 1265: iload 1
      // 1266: ifeq 127e
      // 1269: ifne 1326
      // 126c: goto 1273
      // 126f: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1272: athrow
      // 1273: aload 0
      // 1274: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Z
      // 1277: goto 127e
      // 127a: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 127d: athrow
      // 127e: iload 1
      // 127f: ifeq 12a1
      // 1282: ifne 1326
      // 1285: goto 128c
      // 1288: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 128b: athrow
      // 128c: aload 0
      // 128d: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 1290: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1293: dup
      // 1294: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 1297: invokevirtual net/minecraft/client/player/LocalPlayer.onGround ()Z
      // 129a: goto 12a1
      // 129d: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 12a0: athrow
      // 12a1: ifeq 1326
      // 12a4: getstatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 12a7: invokevirtual me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII;
      // 12aa: getstatic me/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 12ad: invokevirtual me/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.a (Lme/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;)V
      // 12b0: getstatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 12b3: invokevirtual me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII;
      // 12b6: aload 5
      // 12b8: invokevirtual me/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII.f ()Ljava/lang/String;
      // 12bb: checkcast java/lang/CharSequence
      // 12be: sipush -24345
      // 12c1: sipush 5073
      // 12c4: pop2
      // 12c5: ldc_w "Titanium"
      // 12c8: checkcast java/lang/CharSequence
      // 12cb: bipush 0
      // 12cc: bipush 2
      // 12cd: aconst_null
      // 12ce: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 12d1: invokevirtual me/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.k (Z)V
      // 12d4: getstatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 12d7: invokevirtual me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII;
      // 12da: getstatic me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI;
      // 12dd: invokevirtual me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.b ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 12e0: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 12e3: invokevirtual me/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.d (Z)V
      // 12e6: getstatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 12e9: invokevirtual me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII;
      // 12ec: getstatic me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI;
      // 12ef: invokevirtual me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.c ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 12f2: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 12f5: invokevirtual me/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.l (Z)V
      // 12f8: getstatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 12fb: invokevirtual me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII;
      // 12fe: getstatic me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI;
      // 1301: invokevirtual me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.a ()Lme/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII;
      // 1304: sipush -24385
      // 1307: sipush 14420
      // 130a: pop2
      // 130b: ldc_w "Mining Ability"
      // 130e: invokevirtual me/octo/client/lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII.c (Ljava/lang/String;)Z
      // 1311: invokevirtual me/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.c (Z)V
      // 1314: getstatic me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI Lme/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1317: invokevirtual me/octo/client/lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII;
      // 131a: aload 6
      // 131c: invokevirtual me/octo/client/IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.c (Lnet/minecraft/core/BlockPos;)V
      // 131f: goto 1326
      // 1322: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1325: athrow
      // 1326: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1329: goto 13cd
      // 132c: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 132f: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.g ()Lme/octo/client/llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll;
      // 1332: invokevirtual me/octo/client/llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.c ()Z
      // 1335: iload 1
      // 1336: ifeq 134e
      // 1339: ifne 136d
      // 133c: goto 1343
      // 133f: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1342: athrow
      // 1343: aload 0
      // 1344: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Z
      // 1347: goto 134e
      // 134a: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 134d: athrow
      // 134e: iload 1
      // 134f: ifeq 136c
      // 1352: ifne 136d
      // 1355: goto 135c
      // 1358: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 135b: athrow
      // 135c: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 135f: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.g ()Lme/octo/client/llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll;
      // 1362: invokevirtual me/octo/client/llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll.o ()Z
      // 1365: goto 136c
      // 1368: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 136b: athrow
      // 136c: pop
      // 136d: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 1370: goto 13cd
      // 1373: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 1376: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()Lme/octo/client/lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl;
      // 1379: invokevirtual me/octo/client/lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl.c ()Z
      // 137c: iload 1
      // 137d: ifeq 1395
      // 1380: ifne 13be
      // 1383: goto 138a
      // 1386: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1389: athrow
      // 138a: aload 0
      // 138b: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Z
      // 138e: goto 1395
      // 1391: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1394: athrow
      // 1395: iload 1
      // 1396: ifeq 13bd
      // 1399: ifne 13be
      // 139c: goto 13a3
      // 139f: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13a2: athrow
      // 13a3: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 13a6: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()Lme/octo/client/lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl;
      // 13a9: bipush 0
      // 13aa: invokevirtual me/octo/client/lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl.c (Z)V
      // 13ad: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 13b0: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h ()Lme/octo/client/lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl;
      // 13b3: invokevirtual me/octo/client/lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl.o ()Z
      // 13b6: goto 13bd
      // 13b9: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13bc: athrow
      // 13bd: pop
      // 13be: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 13c1: goto 13cd
      // 13c4: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 13c7: goto 13cd
      // 13ca: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 13cd: pop
      // 13ce: return
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()I
      // 003: aload 1
      // 004: sipush -24328
      // 007: sipush 26545
      // 00a: pop2
      // 00b: ldc_w "event"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: istore 2
      // 012: iload 2
      // 013: ifeq 02d
      // 016: aload 1
      // 017: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.k ()Ljava/lang/String;
      // 01a: dup
      // 01b: ifnonnull 02e
      // 01e: goto 025
      // 021: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 024: athrow
      // 025: pop
      // 026: goto 02d
      // 029: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 02c: athrow
      // 02d: return
      // 02e: astore 3
      // 02f: iload 2
      // 030: ifeq 04a
      // 033: aload 1
      // 034: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 037: dup
      // 038: ifnonnull 04b
      // 03b: goto 042
      // 03e: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 041: athrow
      // 042: pop
      // 043: goto 04a
      // 046: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 049: athrow
      // 04a: return
      // 04b: astore 4
      // 04d: aload 0
      // 04e: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 051: getstatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl [I
      // 054: swap
      // 055: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ordinal ()I
      // 058: iaload
      // 059: iload 2
      // 05a: ifeq 08d
      // 05d: tableswitch 507 2 3 27 27
      // 074: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 077: athrow
      // 078: aload 3
      // 079: sipush -24329
      // 07c: sipush -7185
      // 07f: pop2
      // 080: ldc_w "Commissions"
      // 083: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 086: goto 08d
      // 089: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 08c: athrow
      // 08d: iload 2
      // 08e: ifeq 0b3
      // 091: ifeq 0b6
      // 094: goto 09b
      // 097: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 09a: athrow
      // 09b: aload 0
      // 09c: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 09f: aload 0
      // 0a0: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI I
      // 0a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a6: checkcast java/lang/Number
      // 0a9: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 0ac: goto 0b3
      // 0af: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b2: athrow
      // 0b3: ifne 0b7
      // 0b6: return
      // 0b7: aload 4
      // 0b9: checkcast java/lang/Iterable
      // 0bc: bipush 27
      // 0be: invokestatic kotlin/collections/CollectionsKt.take (Ljava/lang/Iterable;I)Ljava/util/List;
      // 0c1: checkcast java/lang/Iterable
      // 0c4: astore 5
      // 0c6: bipush 0
      // 0c7: istore 6
      // 0c9: aload 5
      // 0cb: iload 2
      // 0cc: ifeq 105
      // 0cf: instanceof java/util/Collection
      // 0d2: ifeq 103
      // 0d5: goto 0dc
      // 0d8: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0db: athrow
      // 0dc: aload 5
      // 0de: checkcast java/util/Collection
      // 0e1: iload 2
      // 0e2: ifeq 105
      // 0e5: goto 0ec
      // 0e8: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0eb: athrow
      // 0ec: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0f1: ifeq 103
      // 0f4: goto 0fb
      // 0f7: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fa: athrow
      // 0fb: bipush 0
      // 0fc: goto 13d
      // 0ff: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 102: athrow
      // 103: aload 5
      // 105: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 10a: astore 7
      // 10c: aload 7
      // 10e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 113: ifeq 13c
      // 116: aload 7
      // 118: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 11d: astore 8
      // 11f: aload 8
      // 121: checkcast net/minecraft/world/inventory/Slot
      // 124: astore 9
      // 126: bipush 0
      // 127: istore 10
      // 129: aload 9
      // 12b: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 12e: invokevirtual net/minecraft/world/item/ItemStack.isEmpty ()Z
      // 131: ifeq 10c
      // 134: bipush 1
      // 135: iload 2
      // 136: ifeq 131
      // 139: goto 13d
      // 13c: bipush 0
      // 13d: ifeq 141
      // 140: return
      // 141: aload 0
      // 142: aload 1
      // 143: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.b (Lme/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;)Ljava/lang/Integer;
      // 146: astore 5
      // 148: iload 2
      // 149: ifeq 17f
      // 14c: aload 5
      // 14e: ifnull 180
      // 151: goto 158
      // 154: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 157: athrow
      // 158: getstatic me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 15b: aload 5
      // 15d: invokevirtual java/lang/Integer.intValue ()I
      // 160: bipush 0
      // 161: getstatic net/minecraft/world/inventory/ContainerInput.PICKUP Lnet/minecraft/world/inventory/ContainerInput;
      // 164: invokevirtual me/octo/client/utils/player/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a (IILnet/minecraft/world/inventory/ContainerInput;)V
      // 167: aload 0
      // 168: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 16b: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 16e: aload 0
      // 16f: getstatic me/octo/client/IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI;
      // 172: invokevirtual me/octo/client/IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.e ()I
      // 175: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI I
      // 178: goto 17f
      // 17b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 17e: athrow
      // 17f: return
      // 180: aload 0
      // 181: aload 1
      // 182: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.c (Lme/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;)Ljava/util/List;
      // 185: dup
      // 186: ifnonnull 18f
      // 189: pop
      // 18a: return
      // 18b: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 18e: athrow
      // 18f: astore 6
      // 191: aload 6
      // 193: invokeinterface java/util/List.isEmpty ()Z 1
      // 198: ifeq 1a0
      // 19b: return
      // 19c: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.ap ()Lnet/minecraft/client/Minecraft;
      // 1a4: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 1a7: dup
      // 1a8: ifnull 1b5
      // 1ab: invokevirtual net/minecraft/client/player/LocalPlayer.closeContainer ()V
      // 1ae: goto 1b6
      // 1b1: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b4: athrow
      // 1b5: pop
      // 1b6: aload 0
      // 1b7: aload 6
      // 1b9: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.c (Ljava/util/List;)Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 1bc: astore 7
      // 1be: aload 0
      // 1bf: iload 2
      // 1c0: ifeq 253
      // 1c3: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.W ()Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 1c6: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 1c9: if_acmpne 24b
      // 1cc: goto 1d3
      // 1cf: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d2: athrow
      // 1d3: getstatic me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI;
      // 1d6: invokevirtual me/octo/client/IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.e ()Lme/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
      // 1d9: invokevirtual me/octo/client/IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.al ()Z
      // 1dc: iload 2
      // 1dd: ifeq 20b
      // 1e0: goto 1e7
      // 1e3: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1e6: athrow
      // 1e7: ifeq 24b
      // 1ea: goto 1f1
      // 1ed: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f0: athrow
      // 1f1: aload 0
      // 1f2: aload 0
      // 1f3: getfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 1f6: iload 2
      // 1f7: ifeq 255
      // 1fa: goto 201
      // 1fd: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 200: athrow
      // 201: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;)Z
      // 204: goto 20b
      // 207: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 20a: athrow
      // 20b: ifeq 24b
      // 20e: aload 0
      // 20f: aload 7
      // 211: iload 2
      // 212: ifeq 255
      // 215: goto 21c
      // 218: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 21b: athrow
      // 21c: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;)Z
      // 21f: ifne 24b
      // 222: goto 229
      // 225: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 228: athrow
      // 229: aload 0
      // 22a: aload 7
      // 22c: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;
      // 22f: aload 0
      // 230: getstatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 233: putfield me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll Lme/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 236: aload 0
      // 237: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 23a: sipush 2000
      // 23d: invokevirtual me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;I)V
      // 240: iload 2
      // 241: ifne 258
      // 244: goto 24b
      // 247: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 24a: athrow
      // 24b: aload 0
      // 24c: goto 253
      // 24f: invokestatic me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 252: athrow
      // 253: aload 7
      // 255: invokespecial me/octo/client/IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.b (Lme/octo/client/utils/IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII;)V
      // 258: return
   }

   @SubscribeEvent
   public final void c(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      net.minecraft.network.protocol.Packet var3 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (!(var3 instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket) || ((net.minecraft.network.protocol.game.ClientboundSystemChatPacket)var3).overlay()) {
         return;
      }

      String var4 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(((net.minecraft.network.protocol.game.ClientboundSystemChatPacket)var3).content().getString());
      if ((this.W() == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll || this.W() == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl || this.W() == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI) && !var4.startsWith("[") && var4.contains(" Commission Complete!")) {
         me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5 = this.W();
         new Thread(new Runnable() {
            public void run() {
               IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.this.a(var5);
            }
         }).start();
      }

      if (var4.startsWith("Oh no! Your")) {
         me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(1000L, new kotlin.jvm.functions.Function0<kotlin.Unit>() {
            public kotlin.Unit invoke() {
               return j(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.this);
            }
         });
      }
   }

   @SubscribeEvent
   public final void b(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      short var10001 = -24358;
      short var10002 = -8939;
      Intrinsics.checkNotNullParameter(var1, "event");
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = false;
   }

   private final boolean e(int param1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      boolean var3 = me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      if (!var3) {
         return true;
      }
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(false, 1, (Object)null);
      if (var4 == null) {
         return false;
      }
      if (!me.octo.client.IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().c("Claiming Commission")) {
         return false;
      }
      if (this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll != param1) {
         if (this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll == param1 + 1 && this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.a(Integer.valueOf(this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI))) {
            return true;
         }
         return false;
      }
      if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.K() != var4.b()) {
         me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var4.b());
         this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.f();
         this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
         return true;
      }
      if (!this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.a(Integer.valueOf(this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI))) {
         return true;
      }
      if (!me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) {
         return true;
      }
      int var5 = this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = var5 + 1;
      this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.f();
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
      return true;
   }

   private final void bp() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
      );
      this.aO();
   }

   private final void bq() {
      this.aO();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl
      );
   }

   private final void br() {
      this.aO();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
      );
   }

   private final void bs() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      if (var1 != 0) {
         if (!me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().d()) {
            me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().k();
         }
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q();
         this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl);
      }
   }

   private final void bt() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
      if (var1 != 0) {
        return;
      }
      var var2 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      if (var2 == null) {
        return;
      }
      String var3 = var2.a();
      if (Intrinsics.areEqual(var3, "Goblin Slayer")) {
        this.bq();
        return;
      }
      if (Intrinsics.areEqual(var3, "Glacite Walker Slayer")) {
        this.br();
        return;
      }
      this.bs();
   }

   private final boolean a(BlockPos param1) {
      param1 = (BlockPos)me.octo.client.utils.dwarven.PolinexDwarvenSlayerTravelRecovery.resolveMovementTarget((Object)param1);
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      boolean var3 = me.octo.client.IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e(), param1, (Vec3)null, false, 6, (Object)null);
      if (var3) {
         this.bw();
         return true;
      }
      long var4 = System.currentTimeMillis();
      if (!(kotlin.jvm.internal.Intrinsics.areEqual((Object)this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl, (Object)param1) && this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI == this.W() && this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII != 0L)) {
         this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = param1;
         this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = this.W();
         this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = var4;
         return false;
      }
      long var6 = var4 - this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
      if (this.W() == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll && this.a(this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl) && var6 >= 3000L) {
         if (this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll >= 4) {
            this.a(this.W(), "Slayer pathfinding failed after " + this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll + " forge warps");
            return false;
         }
         int var7 = this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
         this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = var7 + 1;
         this.bw();
         this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e[Dwarven] Slayer path failed — warping to forge (retry " + this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll + "/4)");
         this.a(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, 2000);
         return false;
      }
      if (var6 >= 10000L) {
         this.a(this.W(), "Dwarven commission pathfinding failed for " + var6 / 1000L + "s");
      }
      return false;
   }

   private final boolean a(IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII param1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      boolean var3 = false;
      if (param1 != null) {
         for (String var4 : lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll) {
            if (kotlin.text.StringsKt.contains((CharSequence)param1.a(), (CharSequence)var4, false)) {
               var3 = true;
               break;
            }
         }
      }
      return var3;
   }

   private final boolean bu() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      boolean var2 = me.octo.client.IIlIlIllllIlllIIlIIlIlIlllIIIIlllllllIIIIIIIIllIIllIlllllIIIllIlIlIIIlIlIlllIllIllIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().al();
      if (var1 != 0) {
         return var2;
      }
      if (var2) {
         return true;
      }
      return Math.random() < 0.8;
   }

   private final void bv() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var2 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      if (var1 != 0) {
         if (var2 != null) {
            this.aO();
            this.bw();
            this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl);
         } else {
            this.ba();
            return;
         }
      }
      var2.b(this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII);
   }

   private final void bw() {
      this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = null;
      this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = null;
      this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = 0L;
   }

   private final void b(IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII param1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      this.aO();
      this.bw();
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
      this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll);
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.clear();
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.clear();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = param1;
      if (var2 != 0 && this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl != null) {
        this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.b(this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII);
      }
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2 = var1.b();
      this.a(var2, var1.d());
   }

   private final void a(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1,
      String var2
   ) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
               (kotlin.jvm.functions.Function2)(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl::b),
               var2,
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl::k),
               120,
               null
            )
         );
   }

   private final void bx() {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = false;
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = false;
      this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = false;
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = 0;
      if (var1 != 0) {
         LocalPlayer var2 = this.ap().player;
         if (var2 != null) {
            var2.clientSideCloseContainer();
         }
      }
      this.bw();
      this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = null;
      this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI = null;
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
      this.aO();
   }

   private final void b(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1
   ) {
      int var2 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      this.bx();
      me.octo.client.utils.IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var3 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      if (var3 != null && IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl.contains(param1)) {
         var3.j();
         this.b(var3);
         if (var2 != 0) {
            return;
         }
      }
      this.ba();
   }

   private final IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll by() {
      IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var1 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;

      IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var10000;
      IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var10001;
      String var10002 = null; // PX-FIX: init（乱序赋值）
      label32: {
         try {
            var10000 = new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
               var10002,
                        var1 != null ? var1.h() : null,
                        var1 != null ? var1.g() : null,
                        this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.size(),
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(this, 0.0, 1, null)); // PX-FIX
            var10001 = var10000;
            if (var1 != null) {
               var10002 = var1.f();
               if (var10002 != null) {
                  break label32;
               }
            }
         } catch (NoWhenBranchMatchedException var2) {
            throw (RuntimeException)a(var2);
         }

         var10002 = var1 != null ? var1.a() : null;
      }

      return var10000;
   }

   private final void bz() {
      this.aO();
      this.bw();
      this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = false;
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = 0;
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
      this.bA();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI
      );
   }

   private final void a(IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var1) {
      this.aO();
      this.bw();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = var1;
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = 0;
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI
      );
   }

   private final void bA() {
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
   }

   private final void bB() {
      if (me.octo.client.utils.commission.PolinexDwarvenClaimPriorityGuard.begin()) {
         this.bz();
         return;
      }
      this.aO();
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      Object var2 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t();
      if (var1 == 0) {
         if (var2 == null) {
            this.a(me.octo.client.IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.S());
         } else {
            this.bz();
         }
      }
   }

   private final IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII c(
      List<IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII> param1
   ) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      for (IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var7 : param1) {
         var7.j();
      }
      java.util.Iterator<IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII> var5 = param1.iterator();
      IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var6 = var5.next();
      BlockPos var22 = null;
      boolean var23 = true;
      double var24 = 0.0;
      for (BlockPos var25 : var6.i()) {
         if (var23) {
            var22 = var25;
            var24 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var25, true);
            var23 = false;
         } else {
            double var26 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var25, true);
            if (java.lang.Double.compare(var24, var26) > 0) {
               var22 = var25;
               var24 = var26;
            }
         }
      }
      double var27 = var22 != null ? me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var22, true) : java.lang.Double.MAX_VALUE;
      while (var5.hasNext()) {
         IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var10 = var5.next();
         BlockPos var28 = null;
         boolean var29 = true;
         double var30 = 0.0;
         for (BlockPos var31 : var10.i()) {
            if (var29) {
               var28 = var31;
               var30 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var31, true);
               var29 = false;
            } else {
               double var32 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var31, true);
               if (java.lang.Double.compare(var30, var32) > 0) {
                  var28 = var31;
                  var30 = var32;
               }
            }
         }
         double var33 = var28 != null ? me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var28, true) : java.lang.Double.MAX_VALUE;
         if (java.lang.Double.compare(var27, var33) > 0) {
            var6 = var10;
            var27 = var33;
         }
      }
      return var6;
   }

   private final IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII bC() {
      IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var2 = null;
      double var3 = java.lang.Double.MAX_VALUE;
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      for (String var6 : llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII) {
         IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var7 = me.octo.client.IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.o(var6);
         if (var7 == null) {
            continue;
         }
         BlockPos var22 = null;
         boolean var23 = true;
         double var24 = 0.0;
         for (BlockPos var25 : var7.i()) {
            if (var23) {
               var22 = var25;
               var24 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var25, true);
               var23 = false;
            } else {
               double var26 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var25, true);
               if (java.lang.Double.compare(var24, var26) > 0) {
                  var22 = var25;
                  var24 = var26;
               }
            }
         }
         double var8 = var22 != null ? me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var22, true) : java.lang.Double.MAX_VALUE;
         if (var8 < var3) {
            var3 = var8;
            var2 = var7;
         }
      }
      return var2;
   }

   private final Integer b(me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      java.util.List var3 = param1.m();
      if (var3 == null) {
         var3 = CollectionsKt.emptyList();
      }
      java.util.List var4 = CollectionsKt.take((Iterable)var3, 27);
      boolean var5 = false;
      for (Object var6 : var4) {
         net.minecraft.world.inventory.Slot var8 = (net.minecraft.world.inventory.Slot)var6;
         if (!var8.getItem().isEmpty()) {
            var5 = true;
            break;
         }
      }
      if (!var5) {
         return null;
      }
      for (int var9 = 9; var9 < 17; var9++) {
         net.minecraft.world.inventory.Slot var7 = (net.minecraft.world.inventory.Slot)var3.get(var9);
         java.util.List var10 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var7.getItem());
         for (Object var11 : var10) {
            net.minecraft.network.chat.Component var12 = (net.minecraft.network.chat.Component)var11;
            if (kotlin.text.StringsKt.contains(me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var12.getString()), "COMPLETED", false)) {
               return var7.index;
            }
         }
      }
      return null;
   }

   private final List<IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII> c(
      me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1
   ) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      java.util.List var3 = param1.m();
      if (var3 == null) {
         var3 = CollectionsKt.emptyList();
      }
      java.util.List var4 = CollectionsKt.take((Iterable)var3, 27);
      boolean var5 = false;
      for (Object var6o : var4) {
         net.minecraft.world.inventory.Slot var6s = (net.minecraft.world.inventory.Slot)var6o;
         if (!var6s.getItem().isEmpty()) {
            var5 = true;
            break;
         }
      }
      if (!var5) {
         return null;
      }
      java.util.ArrayList var4r = new java.util.ArrayList();
      for (int var5i = 9; var5i < 17; var5i++) {
         if (var5i >= var3.size()) {
            continue;
         }
         net.minecraft.world.inventory.Slot var6 = (net.minecraft.world.inventory.Slot)var3.get(var5i);
         if (var6.getItem() == null) {
            continue;
         }
         net.minecraft.world.item.ItemStack var7 = var6.getItem();
         java.util.List var8 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var7);
         boolean var9f = false;
         for (Object var10o : var8) {
            net.minecraft.network.chat.Component var13 = (net.minecraft.network.chat.Component)var10o;
            if (kotlin.text.StringsKt.contains(me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var13.getString()), "COMPLETED", false)) {
               var9f = true;
               break;
            }
         }
         if (var9f) {
            continue;
         }
         if (var8.size() < 5) {
            continue;
         }
         String var9 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(((net.minecraft.network.chat.Component)var8.get(4)).getString());
         if (kotlin.text.StringsKt.contains(var9, "Elusive", false)) {
            continue;
         }
         if (kotlin.text.StringsKt.contains(var9, "Golden Goblin", false)) {
            continue;
         }
         boolean var10m = false;
         for (Object var11o : lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl) {
            if (kotlin.text.StringsKt.contains(var9, (String)var11o, false)) {
               var10m = true;
               break;
            }
         }
         if (var10m) {
            IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var10 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
            if (var10 != null) {
               boolean var11m = false;
               for (Object var12o : lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll) {
                  if (kotlin.text.StringsKt.contains(var10.a(), (String)var12o, false)) {
                     var11m = true;
                     break;
                  }
               }
               if (!var11m) {
                  IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var11 = new IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(var10.a(), var10.b(), var10.c(), var10.d(), var10.e());
                  var11.a(var9);
                  var4r.add(var11);
               } else {
                  IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var13 = this.bC();
                  if (var13 != null) {
                     var13.a(var9);
                     var4r.add(var13);
                  }
               }
            } else {
               IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var13 = this.bC();
               if (var13 != null) {
                  var13.a(var9);
                  var4r.add(var13);
               }
            }
         } else {
            boolean var11m2 = false;
            for (Object var12o2 : IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI) {
               if (kotlin.text.StringsKt.contains(var9, (String)var12o2, false)) {
                  var11m2 = true;
                  break;
               }
            }
            if (var11m2) {
               IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var12 = me.octo.client.IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.o(var9);
               if (var12 != null) {
                  var12.a(var9);
                  var4r.add(var12);
               }
            }
         }
      }
      return CollectionsKt.toList((Iterable)var4r);
   }

   private final List<IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII> bD() {
      java.util.ArrayList var2 = new java.util.ArrayList();
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      for (Object var5o : me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h()) {
         String var5 = (String)var5o;
         if (kotlin.text.StringsKt.contains(var5, "Elusive", false)) {
            continue;
         }
         if (kotlin.text.StringsKt.contains(var5, "Golden Goblin", false)) {
            continue;
         }
         if (kotlin.text.StringsKt.contains(var5, "DONE", false)) {
            continue;
         }
         boolean var6m = false;
         for (Object var7o : lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl) {
            if (kotlin.text.StringsKt.contains(var5, (String)var7o, false)) {
               var6m = true;
               break;
            }
         }
         if (var6m) {
            IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var6 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
            if (var6 != null) {
               boolean var7m = false;
               for (Object var8o : lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll) {
                  if (kotlin.text.StringsKt.contains(var6.a(), (String)var8o, false)) {
                     var7m = true;
                     break;
                  }
               }
               if (!var7m) {
                  IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var7 = new IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII(var6.a(), var6.b(), var6.c(), var6.d(), var6.e());
                  var7.a(var5);
                  var2.add(var7);
               } else {
                  IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var9 = this.bC();
                  if (var9 != null) {
                     var9.a(var5);
                     var2.add(var9);
                  }
               }
            } else {
               IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var9 = this.bC();
               if (var9 != null) {
                  var9.a(var5);
                  var2.add(var9);
               }
            }
         } else {
            String var6s = null;
            for (Object var11o : IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI) {
               if (kotlin.text.StringsKt.contains(var5, (String)var11o, false)) {
                  var6s = (String)var11o;
                  break;
               }
            }
            if (var6s != null) {
               IlIIIlIIIllIlIIIlIIIlIIIIlIIIlIIllIIIlIIlIIIlIllIllIIllIlIIIlllllIlllllIlIlIllIIIIIII var9 = me.octo.client.IIIIlllIlIlIIllllIlIlIIlIlIllIlIllllIIIIIlIIIIIIIlIIIlIIIlIllIlIIlIIllllIlIlllllIllIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.o(var6s);
               if (var9 != null) {
                  var9.a(var5);
                  var2.add(var9);
               }
            }
         }
      }
      return CollectionsKt.toList((Iterable)var2);
   }

   @Override
   public void ba() {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      if (var1 != 0) {
         if (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI) {
            this.a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, 5000);
         }
         return;
      }
      List var2 = this.bD();
      this.b(this.c(var2));
   }

   @Override
   public void M() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      this.aM();
      boolean var2 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != null;
      boolean var3 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q() != null;
      boolean var4 = this.a5() != null;
      boolean var5 = me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;

      if (var2 && var3 && var4 && var5) {
         super.M();
         this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = null;
         this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = null;
         this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = false;
         this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = false;
         this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = null;
         this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI = null;
         this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0;
         this.a(kotlin.collections.CollectionsKt.listOf(
            new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, new kotlin.jvm.functions.Function0<Boolean>() {
               public Boolean invoke() {
                  return IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.l(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.this);
               }
            }, true),
            new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, new kotlin.jvm.functions.Function0<Boolean>() {
               public Boolean invoke() {
                  return IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bF();
               }
            }, false),
            new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, new kotlin.jvm.functions.Function0<Boolean>() {
               public Boolean invoke() {
                  return IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bG();
               }
            }, false),
            new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, new kotlin.jvm.functions.Function0<Boolean>() {
               public Boolean invoke() {
                  return IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.bH();
               }
            }, false)
         ));
         this.ba();
      } else {
         if (!var2) {
            this.bg();
         }

         if (!var3) {
            this.c(4);
         }

         if (!var4) {
            this.bf();
         }

         if (!var5) {
            this.b(kotlin.collections.CollectionsKt.listOf(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl));
         }

         this.N();
      }
   }

   @Override
   public void O() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      me.octo.client.llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("Commission Info", 65535);
      Integer var3 = var1 != 0 ? Integer.valueOf(me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g().g()) : null;
      int var2 = 400;
      if (var3 != null) {
         int var3i = var3.intValue();
         if (var3i == 0 || var3i == 1) {
            var2 = 100;
         } else if (var3i == 2) {
            var2 = 200;
         }
      }

      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(0, var2);
      me.octo.client.llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("Mining Info", 65535);
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(1, false);
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(1, false);
   }

   @Override
   public boolean af() {
      try {
         if (this.W()
            == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )
          {
            return true;
         }
      } catch (NoWhenBranchMatchedException var1) {
         throw (RuntimeException)a(var1);
      }

      return false;
   }

   private static final long a(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();

      IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
      IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001;
      String var4 = null;
      int var10005 = 0;
      boolean var10006 = false;
      Triple var10003 = null;
      int var10004 = 0;
      BlockPos var10002 = null; // PX-FIX: init（乱序赋值）
      label27: {
         try {
            var10000 = new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var10002,
                        ((Triple<Integer,Integer,Integer>)(Object)(var10003)),
                        ((Integer)(Object)(var10004)),
                        var10005,
                        var10006,
                        var4,
                        IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .y()); // PX-FIX
            var10001 = var10000;
            if (var0.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll != null) {
               var10002 = var0.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.a();
               break label27;
            }
         } catch (NoWhenBranchMatchedException var2) {
            throw (RuntimeException)a(var2);
         }

         var10002 = null;
      }

      label20: {
         var10003 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null);
         var10004 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .K();
         var10005 = var0.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
         var10006 = var0.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
         Screen var10007 = var0.ap().screen;
         if (var10007 != null) {
            Component var3 = var10007.getTitle();
            if (var3 != null) {
               var4 = var3.getString();
               if (var1 != 0) {
                  break label20;
               }
            }
         }

         var4 = null;
      }

      return var10000;
   }

   private static final Object d(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) { Component var4 = null; // PX-FIX hoist
        
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();

      String var5 = null;
      int var10005 = 0;
      boolean var10006 = false;
      Triple var10003 = null;
      int var10004 = 0;
      Integer var3 = null; // PX-FIX: init（乱序赋值）
      IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
      IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001;
      label27: {
         try {
            var10000 = new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var3,
                        ((Triple<Integer,Integer,Integer>)(Object)(var10003)),
                        ((Integer)(Object)(var10004)),
                        var10005,
                        var10006,
                        var5,
                        IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .y()); // PX-FIX
            var10001 = var10000;
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10002 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .t();
            if (var10002 != null) {
               var3 = var10002.b();
               break label27;
            }
         } catch (NoWhenBranchMatchedException var2) {
            throw (RuntimeException)a(var2);
         }

         var3 = null;
      }

      label20: {
         var10003 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null);
         var10004 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .K();
         var10005 = var0.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
         var10006 = var0.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
         Screen var10007 = var0.ap().screen;
         if (var10007 != null) {
             var4 = var10007.getTitle();
            if (var4 != null) {
               var5 = var4.getString();
               if (var1 != 0) {
                  break label20;
               }
            }
         }

         var5 = null;
      }

      return var10000;
   }

   private static final Object e(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) {
      return var0.by();
   }

   private static final boolean f(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();

      try {
         if (var1 == 0) {
            return var0.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
         }

         if (!var0.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }

      return false;
   }

   private static final Object g(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) {
      return new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .l()
            + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .k(),
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .y(),
         var0.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl
      );
   }

   private static final boolean h(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();

      try {
         if (var1 != 0) {
            return var0.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
         }

         if (!var0.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }

      return false;
   }

   private static final Object i(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) {
      IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000;
      IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10001;
      me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10002 = null; // PX-FIX: init（乱序赋值）
      label16: {
         try {
            var10000 = new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var10002,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null),
                        IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .y(),
                        var0.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl); // PX-FIX
            var10001 = var10000;
            if (var0.W()
               == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl
               )
             {
               var10002 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .g()
                  .k();
               break label16;
            }
         } catch (NoWhenBranchMatchedException var1) {
            throw (RuntimeException)a(var1);
         }

         var10002 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .h()
            .k();
      }

      return var10000;
   }

   private static final Object bE() {
      return IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .y();
   }

   private static final void a(
      IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl param0,
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1
   ) {
      try {
         java.lang.Thread.sleep((long) me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.f());
      } catch (java.lang.InterruptedException var) {
         java.lang.Thread.currentThread().interrupt();
      }

      if (!param0.G()) {
         return;
      }

      if (param0.W() != param1) {
         param0.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = null;
         param0.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = false;
         return;
      }

      param0.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = true;
      param0.aO();
      try {
         java.lang.Thread.sleep((long) me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g());
      } catch (java.lang.InterruptedException var) {
         java.lang.Thread.currentThread().interrupt();
      }

      if (!param0.G()) {
         return;
      }

      if (param0.W() != param1) {
         return;
      }

      param0.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = true;
   }

   private static final Unit j(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) {
      var0.bp();
      return Unit.INSTANCE;
   }

   private static final Unit b(
      IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0,
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      var0.b(var1);
      return Unit.INSTANCE;
   }

   private static final Unit k(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl var0) {
      var0.bx();
      return Unit.INSTANCE;
   }

   private static final boolean l(IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl param0) {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
                    try {
                        try {
                            bl = param0.af();
                            if (n != 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a(noWhenBranchMatchedException);
                        }
                        bl = lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.b();
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a(noWhenBranchMatchedException);
                    }
                }
                try {
                    if (n != 0) break block8;
                    if (!bl) break block7;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.a(noWhenBranchMatchedException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
   }

   private static final boolean bF() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean bG() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean bH() {
      return IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
        
      char[] var26 = null; // PX-FIX
   pxClinit: {
       var5 = new String[78];
      int var3 = 0;
      String var2 = "\u000e¶y¥ \u0081Ü\u0014\u001f±Ã;²êA(\u0016¬qóó\u000b\u0090T<óÁ_\u0080B·ï\u0084\u0013JmuÔ¥ùãâåâ\u00061avaã.ÿÄ\u0010>úÄ\u0093\u00120\u0082ãÃéÅGì¸\\H\u001dî\u008d\u0006«Ðb5[|V\u001c\u000ed\u008bE\u001f¬8\u001c\u00891\u00adÎo3S\u0088\u0006Å\u0003\u0083¦å\u000f0\u000eËmèÛ\u009c,`\u0087¬ôt¡ø\u0005kI·\u000e`\u000b\u0093äB\u0082Ê\u00ad\u0097?\u009a»S\u0006\u000eJ\u008e#c\f9,´ûê\u0013¾p\u0012MâÌôr/ègC9ª%éP\u0002¦²ºÛ\u008f¤n\u000b⃀N·uã\u0089_Ðã×zO\u008f{K\u009cÂ3\r\u009d\u0081\nS´\u0010t\r¯]@¼§_äñÍ\u0085¦Ü\u0015+åªBnÓ\u009f£L¿XbêUÀ+CT>\u0082\nOò]\t\u009dãwØ\u001e6ÿ\u0015\u0003\u0006\u0006)3\u001fß×-+\u007f\f^\u007f¢\u0086Wº©½\u001cÂ·±\u000fC\b\\w\u0082yj¨v« \u001f¯½<\u0010Wá$a6ßU\u009bY\u009d\u0092\u0087\u0084!J×\u0019ûê¤G\u0084ÿ¿è- 6À!Rí$¹_¾vc)W·¼\u0018\u0086i\u000b7qñ\u0001)ú\u0018ÌÇ~²\u00068ÄÜ\u0011\u0004\u00907þ.\u0005ñj0~\u008f\u0016uÒ\u0093í¶Z\u009c\u0082ýTd\u0003\"Òü²E¼\u0016uà¹\r@Þî\u0006~\u0082fÊzb4F\u0019\rÑë\u008fj^\u0085Ûª*îZ±\u008a\fÌ$¤\u00adZ¢\u0019\u0014|\u001fC\u0087\u0006&ÉêP^`\bOß5/\u0019\u008f\f&\u000e>@Ncliç\u0081ÅÍì\u0091\u0016\t\u0007\u008cþ\u007f¼v²\u0016\u000e\u0096Õô&.\u008e\u001dd;\u0019í,fV\u0004ÙùÏ-\u000f'çÐ\u008a\u0013ÆX_0UhÀ¶F\u001f@o\u0002±Ï\u009cÐ\r¥þ`_\u0004m©\u001c6\u0089ÖoÆ\rö\t®ç\u0083´¶\u0013Âî÷ÀÄÜ\u0019Ç|\u001c|æp½Cbµg\u008cÐ@£Q\u008a\\`?ÚÂ\u0087ùæëbÔ\u000bd·p*è(g9¼Wª\t\u0005t\rÂÕÂ@cÐ@\u001dÓ$9¢S¸dx\u0091öÈr\u009fÒ\u0097\u009c0ÆÓ\u0011¦\u0095P\u0098\t0s¡h\u008c¾a\b¶Ñ\fstEÒÅks³¸&\u007fÿHòìÃÉ_»\u008e¨\u0085C8÷ÿ6\u0004ä® \u008f\u000bZ+²\u008fqV¦yDx©\fi\u0004¤ñ1uH±ýC\u008b\u0081\u0005â¦\u0086óF\u0006½ýøÕ\u00adÒ\u0007u\u0094@ñ\u0091\u001bê1oÑ\u0093\u0086\u0005õÛfNôs\u0098ÇVïbÊ\u0005Þw\u009fzwÑ×XÿUáçD3è=\u0016NÈ\u009ckUh\u008bQ$\u0019\u000e QM@ûµ8\u001e¥E2\u0019\u0011+¨.ð\u009aþé¯©Ø~·\u0000\u0081¯\u008aú·\u0091}4\u00852¥*;M\u0001p¥îÂ\\\u00156Ïáv¯ÐýÂ7éyñ~\u0090ª¯¶¦T\u008bî\u0019Ç\u0086#ÊtN¡ÞîæN\u0018.I\fG\u008539ÿ\u0088\u009aA\r\r\u0019ð\u0088Å\u000b¨v:Ù\u009d\u0006 \u0004ãÊµ7²=ß)I¹ÓàÑ \u0011 \fm\u0082Ç@JW5>\u0011\u0085\u001fn3=´\u000f5]\u009b\u0090$fF\u000bs¦»*o\tÔ\u0015\u008a¥Òå2êÆ\u0019Å¨s.Ë¦\u001f\u001dv§Ã\u000fon¾\u0011;s\u001e\u0003±;/ÔÖ2D\u001föN±ßGh\u009d:\u0015Ñ=@8dÃ<ëe\u001dïÓ\u0015cAk\u009a4©§Êá\\Ð\u0087\u0017\u00960z¥ý\u0092\u0007kT=ì\u0080Ó\u000eÇU$~;¥Hcè\u0097¡S[B%8\u008btA2'n½àB\u0092+S\u001e²ºO4ò°9\u0001´\u0014^f\rÜ\u0007À\nEó[á\u0000\f\u0015\u001e\r{Ò`oÔÉ\u001e\nãL¶\u0004Áõ\u0006\u0017s\u0084³\u0019¹¿ìí\u008dª\u009eB\tu²j±\u0007ÿ\u008eû\nöÁjhz¶\u009d\u000f\u0015Ð\u0092\u0004Ð}Ô%òø\rÞ¥$\u0086@öÜ\u0091\u008e\u008fiÇ#\u001cnÀ®8ã\u0083ÌæTÖóåÏ` 5r¶\u0081P\u0007×u\u008f\u0091|P¿è\u0082¿\u008b!% å¡Î0î\"\u001cs\u0017·üuó\u0000\u0005[\u0099\u001fQï\t\u001c\u000f\u0093æñ\u008dVçJ\u000bÌìigM ò¦\u000f¥à\u000b\u0019ãÚ\u0096|u\u0007\u001dpô/\u0014¿étê\u0014zRZ9\u0010C\u0003\u0084S9\u0014\"\" ½@\rg/=ëZÁ¬PP\u0001<\n\u0013Ê\u007f5\u0010Y:AÀN¹&·\u0084G3<\u000eüë\u009c1\u0006¶kh±j\u0016?ý\u001b\tS[dí\u001bn:r'gt«\u0082Î\u009fM©\u0015\ré\u0083æjÌZ¶\\\"°?\u001cy\u000e\u001eWJ\u0091ý9û\u001fít^¦@ï\f!Pá×\u008fª\\à\u00868\u0002ü\bF\u0098\u0097\"\u001f\tß\u001d\u000b\u007f\u0081ø\"\u000eg\u0094_\u0002¼a\u000e¥\nH\u009dïÞ\u0087ï¬\u008b&w\u001f*\n9):VJ«þÀè\u0089\f\u0099\u0087ö-mõ\u0000\u000b\rEsS\r\u000b»Úh7Ì{\u0097=ÜÎ\u0098³\rwÜU\u0084ÆQE$úª6V¬*\u0013\u0006¹Ú'LË\u009e£îç\u0019\u001biªCQ³£ëÈ\u0089&Û9\u0094I¡Q\rß½\u0095:j\u0098Ò\u008c%ñ2e\bõW\u0085=ã\u008en\u0006\u001b_ñ0$\u0016\u0093íeg\u0091\u007fö\b\u0094Èü\u001dD*\u0000õ^\u0017\u008ao\u0015\u0097\u000e\u0015i+FÀÍr\u0015w_ºÃÜC\u000e¾¿^\u008c\u007f\u009a«kçú\u001fwhÕ\u0010\u0099À0Ô\u008cØQþ¹J\u008a3\u00056a\u0099\u0018\u0088HÊ\u0013Iu\u0006¹:\nð\u0085ùúö1ÚýÒ\u001fæ\u009aùE";
       var4 = "\u000e¶y¥ \u0081Ü\u0014\u001f±Ã;²êA(\u0016¬qóó\u000b\u0090T<óÁ_\u0080B·ï\u0084\u0013JmuÔ¥ùãâåâ\u00061avaã.ÿÄ\u0010>úÄ\u0093\u00120\u0082ãÃéÅGì¸\\H\u001dî\u008d\u0006«Ðb5[|V\u001c\u000ed\u008bE\u001f¬8\u001c\u00891\u00adÎo3S\u0088\u0006Å\u0003\u0083¦å\u000f0\u000eËmèÛ\u009c,`\u0087¬ôt¡ø\u0005kI·\u000e`\u000b\u0093äB\u0082Ê\u00ad\u0097?\u009a»S\u0006\u000eJ\u008e#c\f9,´ûê\u0013¾p\u0012MâÌôr/ègC9ª%éP\u0002¦²ºÛ\u008f¤n\u000b⃀N·uã\u0089_Ðã×zO\u008f{K\u009cÂ3\r\u009d\u0081\nS´\u0010t\r¯]@¼§_äñÍ\u0085¦Ü\u0015+åªBnÓ\u009f£L¿XbêUÀ+CT>\u0082\nOò]\t\u009dãwØ\u001e6ÿ\u0015\u0003\u0006\u0006)3\u001fß×-+\u007f\f^\u007f¢\u0086Wº©½\u001cÂ·±\u000fC\b\\w\u0082yj¨v« \u001f¯½<\u0010Wá$a6ßU\u009bY\u009d\u0092\u0087\u0084!J×\u0019ûê¤G\u0084ÿ¿è- 6À!Rí$¹_¾vc)W·¼\u0018\u0086i\u000b7qñ\u0001)ú\u0018ÌÇ~²\u00068ÄÜ\u0011\u0004\u00907þ.\u0005ñj0~\u008f\u0016uÒ\u0093í¶Z\u009c\u0082ýTd\u0003\"Òü²E¼\u0016uà¹\r@Þî\u0006~\u0082fÊzb4F\u0019\rÑë\u008fj^\u0085Ûª*îZ±\u008a\fÌ$¤\u00adZ¢\u0019\u0014|\u001fC\u0087\u0006&ÉêP^`\bOß5/\u0019\u008f\f&\u000e>@Ncliç\u0081ÅÍì\u0091\u0016\t\u0007\u008cþ\u007f¼v²\u0016\u000e\u0096Õô&.\u008e\u001dd;\u0019í,fV\u0004ÙùÏ-\u000f'çÐ\u008a\u0013ÆX_0UhÀ¶F\u001f@o\u0002±Ï\u009cÐ\r¥þ`_\u0004m©\u001c6\u0089ÖoÆ\rö\t®ç\u0083´¶\u0013Âî÷ÀÄÜ\u0019Ç|\u001c|æp½Cbµg\u008cÐ@£Q\u008a\\`?ÚÂ\u0087ùæëbÔ\u000bd·p*è(g9¼Wª\t\u0005t\rÂÕÂ@cÐ@\u001dÓ$9¢S¸dx\u0091öÈr\u009fÒ\u0097\u009c0ÆÓ\u0011¦\u0095P\u0098\t0s¡h\u008c¾a\b¶Ñ\fstEÒÅks³¸&\u007fÿHòìÃÉ_»\u008e¨\u0085C8÷ÿ6\u0004ä® \u008f\u000bZ+²\u008fqV¦yDx©\fi\u0004¤ñ1uH±ýC\u008b\u0081\u0005â¦\u0086óF\u0006½ýøÕ\u00adÒ\u0007u\u0094@ñ\u0091\u001bê1oÑ\u0093\u0086\u0005õÛfNôs\u0098ÇVïbÊ\u0005Þw\u009fzwÑ×XÿUáçD3è=\u0016NÈ\u009ckUh\u008bQ$\u0019\u000e QM@ûµ8\u001e¥E2\u0019\u0011+¨.ð\u009aþé¯©Ø~·\u0000\u0081¯\u008aú·\u0091}4\u00852¥*;M\u0001p¥îÂ\\\u00156Ïáv¯ÐýÂ7éyñ~\u0090ª¯¶¦T\u008bî\u0019Ç\u0086#ÊtN¡ÞîæN\u0018.I\fG\u008539ÿ\u0088\u009aA\r\r\u0019ð\u0088Å\u000b¨v:Ù\u009d\u0006 \u0004ãÊµ7²=ß)I¹ÓàÑ \u0011 \fm\u0082Ç@JW5>\u0011\u0085\u001fn3=´\u000f5]\u009b\u0090$fF\u000bs¦»*o\tÔ\u0015\u008a¥Òå2êÆ\u0019Å¨s.Ë¦\u001f\u001dv§Ã\u000fon¾\u0011;s\u001e\u0003±;/ÔÖ2D\u001föN±ßGh\u009d:\u0015Ñ=@8dÃ<ëe\u001dïÓ\u0015cAk\u009a4©§Êá\\Ð\u0087\u0017\u00960z¥ý\u0092\u0007kT=ì\u0080Ó\u000eÇU$~;¥Hcè\u0097¡S[B%8\u008btA2'n½àB\u0092+S\u001e²ºO4ò°9\u0001´\u0014^f\rÜ\u0007À\nEó[á\u0000\f\u0015\u001e\r{Ò`oÔÉ\u001e\nãL¶\u0004Áõ\u0006\u0017s\u0084³\u0019¹¿ìí\u008dª\u009eB\tu²j±\u0007ÿ\u008eû\nöÁjhz¶\u009d\u000f\u0015Ð\u0092\u0004Ð}Ô%òø\rÞ¥$\u0086@öÜ\u0091\u008e\u008fiÇ#\u001cnÀ®8ã\u0083ÌæTÖóåÏ` 5r¶\u0081P\u0007×u\u008f\u0091|P¿è\u0082¿\u008b!% å¡Î0î\"\u001cs\u0017·üuó\u0000\u0005[\u0099\u001fQï\t\u001c\u000f\u0093æñ\u008dVçJ\u000bÌìigM ò¦\u000f¥à\u000b\u0019ãÚ\u0096|u\u0007\u001dpô/\u0014¿étê\u0014zRZ9\u0010C\u0003\u0084S9\u0014\"\" ½@\rg/=ëZÁ¬PP\u0001<\n\u0013Ê\u007f5\u0010Y:AÀN¹&·\u0084G3<\u000eüë\u009c1\u0006¶kh±j\u0016?ý\u001b\tS[dí\u001bn:r'gt«\u0082Î\u009fM©\u0015\ré\u0083æjÌZ¶\\\"°?\u001cy\u000e\u001eWJ\u0091ý9û\u001fít^¦@ï\f!Pá×\u008fª\\à\u00868\u0002ü\bF\u0098\u0097\"\u001f\tß\u001d\u000b\u007f\u0081ø\"\u000eg\u0094_\u0002¼a\u000e¥\nH\u009dïÞ\u0087ï¬\u008b&w\u001f*\n9):VJ«þÀè\u0089\f\u0099\u0087ö-mõ\u0000\u000b\rEsS\r\u000b»Úh7Ì{\u0097=ÜÎ\u0098³\rwÜU\u0084ÆQE$úª6V¬*\u0013\u0006¹Ú'LË\u009e£îç\u0019\u001biªCQ³£ëÈ\u0089&Û9\u0094I¡Q\rß½\u0095:j\u0098Ò\u008c%ñ2e\bõW\u0085=ã\u008en\u0006\u001b_ñ0$\u0016\u0093íeg\u0091\u007fö\b\u0094Èü\u001dD*\u0000õ^\u0017\u008ao\u0015\u0097\u000e\u0015i+FÀÍr\u0015w_ºÃÜC\u000e¾¿^\u008c\u007f\u009a«kçú\u001fwhÕ\u0010\u0099À0Ô\u008cØQþ¹J\u008a3\u00056a\u0099\u0018\u0088HÊ\u0013Iu\u0006¹:\nð\u0085ùúö1ÚýÒ\u001fæ\u009aùE"
         .length();
      char var1 = 21;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 116;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var46 = var10001.toCharArray();
                var10004 = var46.length;
               int var6 = 0;
               byte var49 = var10000;
               var26 = var46;
               int var20 = var10004;
               byte var70;
               char[] var74;
               int var10006;
               if (var10004 <= 1) {
                  var74 = var46;
                  var70 = var10000;
                  var10006 = var6;
               } else {
                  var49 = var10000;
                  var20 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var74 = var46;
                  var70 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var74[var10006] = (char)(var74[var10006] ^ var70 ^ switch (var6 % 7) {
                     case 0 -> 14;
                     case 1 -> 97;
                     case 2 -> 77;
                     case 3 -> 39;
                     case 4 -> 120;
                     case 5 -> 80;
                     default -> 12;
                  });
                  var6++;
                  if (var49 == 0) {
                     var10006 = var49;
                     var74 = var26;
                     var70 = var49;
                  } else {
                     if (var20 <= var6) {
                        break;
                     }

                     var74 = var26;
                     var70 = var49;
                     var10006 = var6;
                  }
               }
            }

            String var51 = new String(var26).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var51;
                  if ((var9 += var1) >= var4) {
                     j = var5;
                     k = new String[78];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl();
                     String[] var7 = new String[7];
                     var10002 = -24387;
                     short var52 = 23833;
                     var7[0] = "Lava Springs";
                     var10002 = -24356;
                     short var53 = 30108;
                     var7[1] = "Upper Mines";
                     var10002 = -24384;
                     short var54 = 24764;
                     var7[2] = "Royal Mines";
                     var10002 = -24350;
                     short var55 = 10665;
                     var7[3] = "Cliffside Veins";
                     var10002 = -24324;
                     short var56 = -9630;
                     var7[4] = "Rampart's Quarry";
                     var10002 = -24389;
                     short var57 = -17826;
                     var7[5] = "Goblin Slayer";
                     var10002 = -24321;
                     short var58 = 32739;
                     var7[6] = "Glacite Walker Slayer";
                     IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = CollectionsKt.listOf(var7);
                     var7 = new String[2];
                     var10002 = -24369;
                     short var59 = 17926;
                     var7[0] = "Titanium Miner";
                     var10002 = -24341;
                     short var60 = -18034;
                     var7[1] = "Mithril Miner";
                     lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = CollectionsKt.listOf(var7);
                     var7 = new String[2];
                     var10002 = -24388;
                     short var61 = 15280;
                     var7[0] = "Goblin Slayer";
                     var10002 = -24371;
                     short var62 = 5058;
                     var7[1] = "Glacite Walker Slayer";
                     lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = CollectionsKt.listOf(var7);
                     var7 = new String[5];
                     var10002 = -24382;
                     short var63 = 26201;
                     var7[0] = "Lava Springs";
                     var10002 = -24377;
                     short var64 = 25106;
                     var7[1] = "Upper Mines";
                     var10002 = -24398;
                     short var65 = 8143;
                     var7[2] = "Royal Mines";
                     var10002 = -24335;
                     short var66 = -505;
                     var7[3] = "Cliffside Veins";
                     var10002 = -24395;
                     short var67 = 7707;
                     var7[4] = "Rampart's Quarry";
                     llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII = CollectionsKt.listOf(var7);
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var13 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
                     };
                     IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = SetsKt.setOf(var13);
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var14 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
                     };
                     IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = SetsKt.setOf(var14);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var51;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "\u0018\u00135g'¿\u008e£Dí\u0001Û\nk\u0010ÂEÛ÷\u0019ðXv1]Ü¯ûHî*\u0087\u0083\u0083Ö^/U_\r\u0082\u008eO\u000béë,i\u0092\b\u0001´¶Çñ";
                  var4 = "\u0018\u00135g'¿\u008e£Dí\u0001Û\nk\u0010ÂEÛ÷\u0019ðXv1]Ü¯ûHî*\u0087\u0083\u0083Ö^/U_\r\u0082\u008eO\u000béë,i\u0092\b\u0001´¶Çñ"
                     .length();
                  var1 = '+';
                  var9 = -1;
            }

            var10000 = 31;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String e(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
      int var2 = (var0 ^ -24321) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

          var4 = switch (var3[0] & 0xFF) {
            case 0 -> 155;
            case 1 -> 216;
            case 2 -> 213;
            case 3 -> 81;
            case 4 -> 118;
            case 5 -> 101;
            case 6 -> 2;
            case 7 -> 68;
            case 8 -> 222;
            case 9 -> 179;
            case 10 -> 8;
            case 11 -> 55;
            case 12 -> 5;
            case 13 -> 20;
            case 14 -> 185;
            case 15 -> 201;
            case 16 -> 130;
            case 17 -> 61;
            case 18 -> 138;
            case 19 -> 203;
            case 20 -> 238;
            case 21 -> 11;
            case 22 -> 129;
            case 23 -> 169;
            case 24 -> 153;
            case 25 -> 59;
            case 26 -> 235;
            case 27 -> 82;
            case 28 -> 207;
            case 29 -> 46;
            case 30 -> 36;
            case 31 -> 65;
            case 32 -> 39;
            case 33 -> 83;
            case 34 -> 9;
            case 35 -> 199;
            case 36 -> 136;
            case 37 -> 143;
            case 38 -> 242;
            case 39 -> 35;
            case 40 -> 6;
            case 41 -> 14;
            case 42 -> 105;
            case 43 -> 196;
            case 44 -> 219;
            case 45 -> 90;
            case 46 -> 92;
            case 47 -> 146;
            case 48 -> 132;
            case 49 -> 64;
            case 50 -> 183;
            case 51 -> 58;
            case 52 -> 171;
            case 53 -> 112;
            case 54 -> 98;
            case 55 -> 113;
            case 56 -> 117;
            case 57 -> 141;
            case 58 -> 23;
            case 59 -> 67;
            case 60 -> 79;
            case 61 -> 198;
            case 62 -> 246;
            case 63 -> 38;
            case 64 -> 25;
            case 65 -> 149;
            case 66 -> 225;
            case 67 -> 190;
            case 68 -> 76;
            case 69 -> 160;
            case 70 -> 72;
            case 71 -> 40;
            case 72 -> 204;
            case 73 -> 247;
            case 74 -> 245;
            case 75 -> 212;
            case 76 -> 231;
            case 77 -> 144;
            case 78 -> 147;
            case 79 -> 119;
            case 80 -> 42;
            case 81 -> 151;
            case 82 -> 221;
            case 83 -> 152;
            case 84 -> 0;
            case 85 -> 50;
            case 86 -> 54;
            case 87 -> 45;
            case 88 -> 109;
            case 89 -> 223;
            case 90 -> 104;
            case 91 -> 66;
            case 92 -> 100;
            case 93 -> 139;
            case 94 -> 189;
            case 95 -> 124;
            case 96 -> 167;
            case 97 -> 211;
            case 98 -> 123;
            case 99 -> 220;
            case 100 -> 159;
            case 101 -> 186;
            case 102 -> 57;
            case 103 -> 10;
            case 104 -> 77;
            case 105 -> 177;
            case 106 -> 250;
            case 107 -> 205;
            case 108 -> 103;
            case 109 -> 15;
            case 110 -> 93;
            case 111 -> 244;
            case 112 -> 200;
            case 113 -> 122;
            case 114 -> 218;
            case 115 -> 70;
            case 116 -> 176;
            case 117 -> 74;
            case 118 -> 21;
            case 119 -> 84;
            case 120 -> 206;
            case 121 -> 180;
            case 122 -> 172;
            case 123 -> 91;
            case 124 -> 145;
            case 125 -> 78;
            case 126 -> 197;
            case 127 -> 7;
            case 128 -> 217;
            case 129 -> 115;
            case 130 -> 202;
            case 131 -> 53;
            case 132 -> 214;
            case 133 -> 31;
            case 134 -> 1;
            case 135 -> 251;
            case 136 -> 161;
            case 137 -> 4;
            case 138 -> 87;
            case 139 -> 26;
            case 140 -> 88;
            case 141 -> 71;
            case 142 -> 226;
            case 143 -> 47;
            case 144 -> 30;
            case 145 -> 121;
            case 146 -> 140;
            case 147 -> 17;
            case 148 -> 150;
            case 149 -> 233;
            case 150 -> 52;
            case 151 -> 234;
            case 152 -> 24;
            case 153 -> 128;
            case 154 -> 175;
            case 155 -> 12;
            case 156 -> 195;
            case 157 -> 166;
            case 158 -> 32;
            case 159 -> 137;
            case 160 -> 170;
            case 161 -> 86;
            case 162 -> 158;
            case 163 -> 135;
            case 164 -> 239;
            case 165 -> 165;
            case 166 -> 182;
            case 167 -> 192;
            case 168 -> 174;
            case 169 -> 3;
            case 170 -> 229;
            case 171 -> 163;
            case 172 -> 114;
            case 173 -> 230;
            case 174 -> 80;
            case 175 -> 43;
            case 176 -> 62;
            case 177 -> 127;
            case 178 -> 33;
            case 179 -> 254;
            case 180 -> 210;
            case 181 -> 89;
            case 182 -> 193;
            case 183 -> 168;
            case 184 -> 178;
            case 185 -> 187;
            case 186 -> 95;
            case 187 -> 28;
            case 188 -> 96;
            case 189 -> 29;
            case 190 -> 73;
            case 191 -> 154;
            case 192 -> 228;
            case 193 -> 75;
            case 194 -> 97;
            case 195 -> 253;
            case 196 -> 63;
            case 197 -> 99;
            case 198 -> 248;
            case 199 -> 237;
            case 200 -> 19;
            case 201 -> 110;
            case 202 -> 18;
            case 203 -> 209;
            case 204 -> 232;
            case 205 -> 131;
            case 206 -> 120;
            case 207 -> 181;
            case 208 -> 142;
            case 209 -> 134;
            case 210 -> 34;
            case 211 -> 208;
            case 212 -> 241;
            case 213 -> 13;
            case 214 -> 56;
            case 215 -> 173;
            case 216 -> 236;
            case 217 -> 252;
            case 218 -> 148;
            case 219 -> 240;
            case 220 -> 48;
            case 221 -> 22;
            case 222 -> 44;
            case 223 -> 194;
            case 224 -> 243;
            case 225 -> 51;
            case 226 -> 162;
            case 227 -> 106;
            case 228 -> 85;
            case 229 -> 191;
            case 230 -> 126;
            case 231 -> 224;
            case 232 -> 133;
            case 233 -> 69;
            case 234 -> 116;
            case 235 -> 156;
            case 236 -> 107;
            case 237 -> 94;
            case 238 -> 255;
            case 239 -> 215;
            case 240 -> 184;
            case 241 -> 102;
            case 242 -> 157;
            case 243 -> 164;
            case 244 -> 108;
            case 245 -> 16;
            case 246 -> 41;
            case 247 -> 27;
            case 248 -> 37;
            case 249 -> 125;
            case 250 -> 111;
            case 251 -> 49;
            case 252 -> 60;
            case 253 -> 188;
            case 254 -> 249;
            default -> 227;
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

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Object... px) {
        }
      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
      }

      @NotNull
      public final IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl a() {
         return IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
      }

      @NotNull
      public final List<String> b() {
         return IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
      }

      @NotNull
      public final List<String> c() {
         return IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl;
      }

      @NotNull
      public final List<String> d() {
         return IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll;
      }

      @NotNull
      public final List<String> e() {
         return IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
      }
   }

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(int var1, int var2, boolean var3) {
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

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         int var1, int var2, boolean var3
      ) {
         return new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() { short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
         short var10000 = -32356;
         boolean var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 10210;
         short var10002 = -32353;
          var10003 = -16667;
          var10004 = -32355;
          var10005 = -23457;
         return "MiningProgress(minedBlocks=" + var3 + ", commissionsCompleted=" + var2 + ", commissionDone=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) { int var4 = 0; // PX-FIX hoist
        
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
          var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 == 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 == 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
            if (var2 != 0) {
               return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var10001 = ((var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
          var5 = new String[3];
         int var3 = 0;
         String var2 = "³\u00ad\u0083\u008a*ò==7ìà\u008f\u0096ì Ýµ\u001bV`\u007fU\u001aÅa\u0091¾VS\u001cièÈÊb\u0083Uûð+ÜØ\u0006_·\u0017}\u0003Z_\u0011HZjÛ\u0006}Ò\u0012kà\u008cÑI\u0019ð^P\u0098";
          var4 = "³\u00ad\u0083\u008a*ò==7ìà\u008f\u0096ì Ýµ\u001bV`\u007fU\u001aÅa\u0091¾VS\u001cièÈÊb\u0083Uûð+ÜØ\u0006_·\u0017}\u0003Z_\u0011HZjÛ\u0006}Ò\u0012kà\u008cÑI\u0019ð^P\u0098"
            .length();
         char var1 = 17;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
                var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 49;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 49;
                  var10006 = var6;
               } else {
                  var13 = 49;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 49;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 9;
                     case 1 -> 80;
                     case 2 -> 9;
                     case 3 -> 105;
                     case 4 -> 14;
                     case 5 -> 118;
                     default -> 7;
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

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
         int var2 = (var0 ^ -32355) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 236;
               case 1 -> 246;
               case 2 -> 105;
               case 3 -> 3;
               case 4 -> 7;
               case 5 -> 179;
               case 6 -> 232;
               case 7 -> 121;
               case 8 -> 137;
               case 9 -> 26;
               case 10 -> 123;
               case 11 -> 160;
               case 12 -> 1;
               case 13 -> 67;
               case 14 -> 209;
               case 15 -> 171;
               case 16 -> 141;
               case 17 -> 23;
               case 18 -> 72;
               case 19 -> 157;
               case 20 -> 80;
               case 21 -> 235;
               case 22 -> 247;
               case 23 -> 132;
               case 24 -> 108;
               case 25 -> 165;
               case 26 -> 20;
               case 27 -> 66;
               case 28 -> 249;
               case 29 -> 146;
               case 30 -> 102;
               case 31 -> 11;
               case 32 -> 47;
               case 33 -> 166;
               case 34 -> 39;
               case 35 -> 151;
               case 36 -> 188;
               case 37 -> 122;
               case 38 -> 212;
               case 39 -> 254;
               case 40 -> 89;
               case 41 -> 81;
               case 42 -> 41;
               case 43 -> 76;
               case 44 -> 5;
               case 45 -> 12;
               case 46 -> 226;
               case 47 -> 42;
               case 48 -> 30;
               case 49 -> 181;
               case 50 -> 140;
               case 51 -> 222;
               case 52 -> 206;
               case 53 -> 155;
               case 54 -> 205;
               case 55 -> 213;
               case 56 -> 36;
               case 57 -> 174;
               case 58 -> 95;
               case 59 -> 106;
               case 60 -> 88;
               case 61 -> 197;
               case 62 -> 223;
               case 63 -> 233;
               case 64 -> 27;
               case 65 -> 21;
               case 66 -> 114;
               case 67 -> 49;
               case 68 -> 230;
               case 69 -> 124;
               case 70 -> 211;
               case 71 -> 145;
               case 72 -> 6;
               case 73 -> 75;
               case 74 -> 84;
               case 75 -> 250;
               case 76 -> 240;
               case 77 -> 40;
               case 78 -> 18;
               case 79 -> 112;
               case 80 -> 244;
               case 81 -> 253;
               case 82 -> 65;
               case 83 -> 129;
               case 84 -> 62;
               case 85 -> 175;
               case 86 -> 32;
               case 87 -> 19;
               case 88 -> 252;
               case 89 -> 71;
               case 90 -> 193;
               case 91 -> 10;
               case 92 -> 243;
               case 93 -> 22;
               case 94 -> 195;
               case 95 -> 149;
               case 96 -> 219;
               case 97 -> 13;
               case 98 -> 16;
               case 99 -> 96;
               case 100 -> 135;
               case 101 -> 4;
               case 102 -> 28;
               case 103 -> 97;
               case 104 -> 225;
               case 105 -> 24;
               case 106 -> 52;
               case 107 -> 159;
               case 108 -> 162;
               case 109 -> 154;
               case 110 -> 191;
               case 111 -> 107;
               case 112 -> 215;
               case 113 -> 43;
               case 114 -> 163;
               case 115 -> 0;
               case 116 -> 228;
               case 117 -> 234;
               case 118 -> 17;
               case 119 -> 101;
               case 120 -> 54;
               case 121 -> 239;
               case 122 -> 152;
               case 123 -> 200;
               case 124 -> 87;
               case 125 -> 251;
               case 126 -> 237;
               case 127 -> 187;
               case 128 -> 138;
               case 129 -> 164;
               case 130 -> 248;
               case 131 -> 161;
               case 132 -> 199;
               case 133 -> 119;
               case 134 -> 180;
               case 135 -> 85;
               case 136 -> 134;
               case 137 -> 142;
               case 138 -> 202;
               case 139 -> 184;
               case 140 -> 131;
               case 141 -> 117;
               case 142 -> 204;
               case 143 -> 73;
               case 144 -> 201;
               case 145 -> 178;
               case 146 -> 150;
               case 147 -> 183;
               case 148 -> 60;
               case 149 -> 207;
               case 150 -> 46;
               case 151 -> 198;
               case 152 -> 64;
               case 153 -> 229;
               case 154 -> 168;
               case 155 -> 68;
               case 156 -> 153;
               case 157 -> 210;
               case 158 -> 156;
               case 159 -> 177;
               case 160 -> 91;
               case 161 -> 44;
               case 162 -> 8;
               case 163 -> 63;
               case 164 -> 190;
               case 165 -> 125;
               case 166 -> 147;
               case 167 -> 34;
               case 168 -> 148;
               case 169 -> 100;
               case 170 -> 130;
               case 171 -> 103;
               case 172 -> 15;
               case 173 -> 51;
               case 174 -> 133;
               case 175 -> 238;
               case 176 -> 79;
               case 177 -> 255;
               case 178 -> 245;
               case 179 -> 50;
               case 180 -> 78;
               case 181 -> 192;
               case 182 -> 167;
               case 183 -> 90;
               case 184 -> 116;
               case 185 -> 59;
               case 186 -> 218;
               case 187 -> 185;
               case 188 -> 53;
               case 189 -> 203;
               case 190 -> 194;
               case 191 -> 136;
               case 192 -> 61;
               case 193 -> 118;
               case 194 -> 93;
               case 195 -> 109;
               case 196 -> 242;
               case 197 -> 99;
               case 198 -> 170;
               case 199 -> 111;
               case 200 -> 31;
               case 201 -> 58;
               case 202 -> 172;
               case 203 -> 110;
               case 204 -> 9;
               case 205 -> 69;
               case 206 -> 139;
               case 207 -> 186;
               case 208 -> 70;
               case 209 -> 227;
               case 210 -> 126;
               case 211 -> 113;
               case 212 -> 143;
               case 213 -> 144;
               case 214 -> 48;
               case 215 -> 29;
               case 216 -> 128;
               case 217 -> 182;
               case 218 -> 2;
               case 219 -> 120;
               case 220 -> 241;
               case 221 -> 208;
               case 222 -> 216;
               case 223 -> 127;
               case 224 -> 224;
               case 225 -> 37;
               case 226 -> 214;
               case 227 -> 92;
               case 228 -> 189;
               case 229 -> 176;
               case 230 -> 82;
               case 231 -> 25;
               case 232 -> 217;
               case 233 -> 221;
               case 234 -> 169;
               case 235 -> 33;
               case 236 -> 83;
               case 237 -> 173;
               case 238 -> 86;
               case 239 -> 220;
               case 240 -> 38;
               case 241 -> 35;
               case 242 -> 196;
               case 243 -> 98;
               case 244 -> 77;
               case 245 -> 14;
               case 246 -> 45;
               case 247 -> 55;
               case 248 -> 115;
               case 249 -> 104;
               case 250 -> 94;
               case 251 -> 231;
               case 252 -> 158;
               case 253 -> 74;
               case 254 -> 57;
               default -> 56;
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

      // PX-FIX PhaseA: Kotlin copy-default (static bridge) restored from jar bytecode
      public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var0, int var1, int var2, boolean var3, int var4, Object var5) {
         if ((var4 & 1) != 0) { var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((var4 & 2) != 0) { var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((var4 & 4) != 0) { var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         return var0.a(var1, var2, var3);
      }
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull Object var1, @NotNull Triple<Integer, Integer, Integer> var2, int var3, boolean var4
      ) {
         short var10001 = 14260;
         short var10002 = -6963;
         Intrinsics.checkNotNullParameter(var1, "botProgress");
         var10001 = 14263;
         var10002 = 11913;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      @NotNull
      public final Object a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Object e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull Object var1, @NotNull Triple<Integer, Integer, Integer> var2, int var3, boolean var4
      ) {
         short var10001 = 14258;
         short var10002 = 18989;
         Intrinsics.checkNotNullParameter(var1, "botProgress");
         var10001 = 14256;
         var10002 = 7926;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         return new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() { Object var4 = null; // PX-FIX hoist
         short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
         short var10000 = 14257;
         boolean var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Triple var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
          var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 25388;
         short var10002 = 14262;
          var10003 = -636;
          var10004 = 14259;
          var10005 = -10627;
          var10006 = 14261;
         short var10007 = 8218;
         return "CombatProgress(botProgress=" + var4 + ", playerPos=" + var3 + ", commissionsCompleted=" + var2 + ", commissionDone=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }

      @Override
      public boolean equals(@Nullable Object var1) { int var4 = 0; // PX-FIX hoist
        
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
          var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         int var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var2 == 0) {
            if (var4 != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               return false;
            }

            var4 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
            if (var2 != 0) {
               return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var10001 = ((var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
          var5 = new String[8];
         int var3 = 0;
         String var2 = "á0ÎðU!tçæ\fvuú\u0088ä\u0092óæ¦b\u0093W\u0011¥Õ\u0093\u009f´\u0007xÃyá3²»ÝE\u001dÛ\u000bºÚàç0Ò\u001a:ìåI\u00175¨\u00810öò0}p6\u0012H¨®÷Òá\u0098\u0083\u009d\u009b½Æ\u000bç¿KKEG´\u00889³ó";
          var4 = "á0ÎðU!tçæ\fvuú\u0088ä\u0092óæ¦b\u0093W\u0011¥Õ\u0093\u009f´\u0007xÃyá3²»ÝE\u001dÛ\u000bºÚàç0Ò\u001a:ìåI\u00175¨\u00810öò0}p6\u0012H¨®÷Òá\u0098\u0083\u009d\u009b½Æ\u000bç¿KKEG´\u00889³ó"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 105;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                   var10004 = var24.length;
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
                        case 1 -> 65;
                        case 2 -> 79;
                        case 3 -> 2;
                        case 4 -> 9;
                        case 5 -> 31;
                        default -> 34;
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

                     var2 = "ÿü\u008fÊ/Ãd»#\u001a!Ò«|\u000bj\u0015¢\u000f\u001cH\u0093cª\u0096\u00902\tZ\u0018b.\u001b!f<\u007f";
                     var4 = "ÿü\u008fÊ/Ãd»#\u001a!Ò«|\u000bj\u0015¢\u000f\u001cH\u0093cª\u0096\u00902\tZ\u0018b.\u001b!f<\u007f".length();
                     var1 = 27;
                     var8 = -1;
               }

               var10000 = 28;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
         int var2 = (var0 ^ 14263) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 200;
               case 1 -> 35;
               case 2 -> 90;
               case 3 -> 66;
               case 4 -> 232;
               case 5 -> 96;
               case 6 -> 107;
               case 7 -> 78;
               case 8 -> 156;
               case 9 -> 136;
               case 10 -> 154;
               case 11 -> 255;
               case 12 -> 176;
               case 13 -> 15;
               case 14 -> 120;
               case 15 -> 18;
               case 16 -> 185;
               case 17 -> 58;
               case 18 -> 155;
               case 19 -> 177;
               case 20 -> 97;
               case 21 -> 229;
               case 22 -> 191;
               case 23 -> 94;
               case 24 -> 59;
               case 25 -> 216;
               case 26 -> 163;
               case 27 -> 93;
               case 28 -> 235;
               case 29 -> 19;
               case 30 -> 210;
               case 31 -> 114;
               case 32 -> 99;
               case 33 -> 164;
               case 34 -> 198;
               case 35 -> 239;
               case 36 -> 197;
               case 37 -> 116;
               case 38 -> 143;
               case 39 -> 121;
               case 40 -> 128;
               case 41 -> 21;
               case 42 -> 244;
               case 43 -> 204;
               case 44 -> 205;
               case 45 -> 135;
               case 46 -> 1;
               case 47 -> 56;
               case 48 -> 75;
               case 49 -> 248;
               case 50 -> 207;
               case 51 -> 38;
               case 52 -> 247;
               case 53 -> 73;
               case 54 -> 10;
               case 55 -> 218;
               case 56 -> 89;
               case 57 -> 16;
               case 58 -> 166;
               case 59 -> 201;
               case 60 -> 111;
               case 61 -> 84;
               case 62 -> 50;
               case 63 -> 53;
               case 64 -> 159;
               case 65 -> 148;
               case 66 -> 83;
               case 67 -> 251;
               case 68 -> 147;
               case 69 -> 211;
               case 70 -> 246;
               case 71 -> 100;
               case 72 -> 14;
               case 73 -> 206;
               case 74 -> 178;
               case 75 -> 220;
               case 76 -> 144;
               case 77 -> 157;
               case 78 -> 202;
               case 79 -> 101;
               case 80 -> 145;
               case 81 -> 5;
               case 82 -> 81;
               case 83 -> 184;
               case 84 -> 61;
               case 85 -> 123;
               case 86 -> 195;
               case 87 -> 88;
               case 88 -> 203;
               case 89 -> 28;
               case 90 -> 167;
               case 91 -> 253;
               case 92 -> 132;
               case 93 -> 222;
               case 94 -> 224;
               case 95 -> 29;
               case 96 -> 194;
               case 97 -> 7;
               case 98 -> 47;
               case 99 -> 153;
               case 100 -> 109;
               case 101 -> 12;
               case 102 -> 252;
               case 103 -> 237;
               case 104 -> 217;
               case 105 -> 209;
               case 106 -> 225;
               case 107 -> 54;
               case 108 -> 34;
               case 109 -> 152;
               case 110 -> 254;
               case 111 -> 137;
               case 112 -> 187;
               case 113 -> 245;
               case 114 -> 8;
               case 115 -> 214;
               case 116 -> 33;
               case 117 -> 208;
               case 118 -> 63;
               case 119 -> 183;
               case 120 -> 44;
               case 121 -> 161;
               case 122 -> 77;
               case 123 -> 231;
               case 124 -> 0;
               case 125 -> 240;
               case 126 -> 179;
               case 127 -> 46;
               case 128 -> 190;
               case 129 -> 41;
               case 130 -> 6;
               case 131 -> 230;
               case 132 -> 76;
               case 133 -> 115;
               case 134 -> 106;
               case 135 -> 236;
               case 136 -> 118;
               case 137 -> 189;
               case 138 -> 250;
               case 139 -> 249;
               case 140 -> 134;
               case 141 -> 233;
               case 142 -> 25;
               case 143 -> 151;
               case 144 -> 4;
               case 145 -> 52;
               case 146 -> 219;
               case 147 -> 180;
               case 148 -> 173;
               case 149 -> 40;
               case 150 -> 226;
               case 151 -> 11;
               case 152 -> 212;
               case 153 -> 213;
               case 154 -> 129;
               case 155 -> 215;
               case 156 -> 13;
               case 157 -> 79;
               case 158 -> 192;
               case 159 -> 142;
               case 160 -> 113;
               case 161 -> 87;
               case 162 -> 57;
               case 163 -> 127;
               case 164 -> 182;
               case 165 -> 188;
               case 166 -> 24;
               case 167 -> 49;
               case 168 -> 108;
               case 169 -> 117;
               case 170 -> 241;
               case 171 -> 55;
               case 172 -> 171;
               case 173 -> 98;
               case 174 -> 172;
               case 175 -> 91;
               case 176 -> 51;
               case 177 -> 140;
               case 178 -> 9;
               case 179 -> 39;
               case 180 -> 122;
               case 181 -> 65;
               case 182 -> 174;
               case 183 -> 43;
               case 184 -> 36;
               case 185 -> 82;
               case 186 -> 158;
               case 187 -> 125;
               case 188 -> 165;
               case 189 -> 3;
               case 190 -> 138;
               case 191 -> 186;
               case 192 -> 243;
               case 193 -> 42;
               case 194 -> 27;
               case 195 -> 104;
               case 196 -> 85;
               case 197 -> 72;
               case 198 -> 228;
               case 199 -> 32;
               case 200 -> 124;
               case 201 -> 69;
               case 202 -> 196;
               case 203 -> 2;
               case 204 -> 60;
               case 205 -> 133;
               case 206 -> 119;
               case 207 -> 175;
               case 208 -> 74;
               case 209 -> 31;
               case 210 -> 23;
               case 211 -> 130;
               case 212 -> 149;
               case 213 -> 45;
               case 214 -> 181;
               case 215 -> 110;
               case 216 -> 150;
               case 217 -> 131;
               case 218 -> 48;
               case 219 -> 62;
               case 220 -> 64;
               case 221 -> 17;
               case 222 -> 223;
               case 223 -> 26;
               case 224 -> 168;
               case 225 -> 139;
               case 226 -> 95;
               case 227 -> 30;
               case 228 -> 71;
               case 229 -> 68;
               case 230 -> 227;
               case 231 -> 193;
               case 232 -> 20;
               case 233 -> 37;
               case 234 -> 102;
               case 235 -> 238;
               case 236 -> 141;
               case 237 -> 80;
               case 238 -> 221;
               case 239 -> 146;
               case 240 -> 234;
               case 241 -> 86;
               case 242 -> 103;
               case 243 -> 92;
               case 244 -> 126;
               case 245 -> 160;
               case 246 -> 22;
               case 247 -> 169;
               case 248 -> 105;
               case 249 -> 112;
               case 250 -> 70;
               case 251 -> 67;
               case 252 -> 170;
               case 253 -> 162;
               case 254 -> 242;
               default -> 199;
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

      // PX-FIX PhaseA: Kotlin copy-default (static bridge) restored from jar bytecode
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, Object var1, Triple<Integer, Integer, Integer> var2, int var3, boolean var4, int var5, Object var6) {
         if ((var5 & 1) != 0) { var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((var5 & 2) != 0) { var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((var5 & 4) != 0) { var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         if ((var5 & 8) != 0) { var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
         return var0.a(var1, var2, var3, var4);
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @Nullable
      private final Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @Nullable
      private final String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @Nullable Object var1, @NotNull Triple<Integer, Integer, Integer> var2, int var3, int var4, boolean var5, @Nullable String var6, int var7
      ) {
         short var10001 = -19178;
         short var10002 = 32605;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
      }

      @Nullable
      public final Object a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final int g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @Nullable
      public final Object h() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> i() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int j() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int k() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean l() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String m() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final int n() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @Nullable Object var1, @NotNull Triple<Integer, Integer, Integer> var2, int var3, int var4, boolean var5, @Nullable String var6, int var7
      ) {
         short var10001 = -19183;
         short var10002 = 4318;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         return new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() { int var5 = 0; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
         short var10000 = -19179;
         int var1 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         String var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
          var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
          var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Triple var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         Object var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 3103;
         short var10002 = -19177;
          var10003 = -30554;
          var10004 = -19181;
          var10005 = 18976;
          var10006 = -19182;
         short var10007 = 21903;
         short var10008 = -19184;
         short var10009 = 8136;
         short var10010 = -19180;
         short var10011 = -13370;
         short var10012 = -19175;
         short var10013 = 5229;
         return "ClaimProgress(target="
            + var7
            + ", playerPos="
            + var6
            + ", heldSlot="
            + var5
            + ", rodThrows="
            + var4
            + ", clicked="
            + var3
            + ", screenTitle="
            + var2
            + ", commissionsCompleted="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int var1;
         int var8;
         label25: {
            var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
            Object var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 == 0) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
                  var8 = 0;
                  break label25;
               }

               var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            var8 = var10000.hashCode();
         }

         int var10;
         label19: {
            int var2 = var8;
            var2 = var2 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
            var2 = var2 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            var2 = var2 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            var2 = var2 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            var8 = var2 * 31;
            String var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            if (var1 == 0) {
               if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == null) {
                  var10 = 0;
                  break label19;
               }

               var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            var10 = var10001.hashCode();
         }

         int var7 = var8 + var10;
         return var7 * 31 + Integer.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
      }

      @Override
      public boolean equals(@Nullable Object var1) { int var4 = 0; // PX-FIX hoist
        
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
          var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         int var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var2 == 0) {
            if (var4 != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               return false;
            }

            var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         label80: {
            if (var2 == 0) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
               if (var2 != 0) {
                  break label80;
               }

               var10001 = ((var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         }

         if (var2 == 0) {
            if (var4 != var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
          var5 = new String[9];
         int var3 = 0;
         String var2 = "(g\u0098ù\u0016Ðcm/\n\u0081[x®D\u009c\u009fÝûÍ\u000b\u0096M\u0091e\u0016ÊHù5(\u0094\f²õ\u000fx\u0094\u0012*Ê%\u0090Ø\u009b\u0015À\u009bÐv\u0017\u0011h3<\u0014äàí\u0011ð\u0004\u0014'öÐ\u0012\u000eEEðb\\íê>ª\u008frô\u001az\fm\u0082ö\u0095ìá\u008d<BVìX";
          var4 = "(g\u0098ù\u0016Ðcm/\n\u0081[x®D\u009c\u009fÝûÍ\u000b\u0096M\u0091e\u0016ÊHù5(\u0094\f²õ\u000fx\u0094\u0012*Ê%\u0090Ø\u009b\u0015À\u009bÐv\u0017\u0011h3<\u0014äàí\u0011ð\u0004\u0014'öÐ\u0012\u000eEEðb\\íê>ª\u008frô\u001az\fm\u0082ö\u0095ìá\u008d<BVìX"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 35;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                   var10004 = var24.length;
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
                        case 0 -> 110;
                        case 1 -> 111;
                        case 2 -> 8;
                        case 3 -> 39;
                        case 4 -> 107;
                        case 5 -> 104;
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

                     var2 = "d\u009bªÝëïg1\u0014\u0017À\u0014ëÿ\u0089`\u001b \u0085Iô\u0095\u001fÑ\u000e\u00ad\n/Ì\u0000¶\u0001ó";
                     var4 = "d\u009bªÝëïg1\u0014\u0017À\u0014ëÿ\u0089`\u001b \u0085Iô\u0095\u001fÑ\u000e\u00ad\n/Ì\u0000¶\u0001ó".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 31;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
         int var2 = (var0 ^ -19183) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 199;
               case 1 -> 176;
               case 2 -> 142;
               case 3 -> 28;
               case 4 -> 105;
               case 5 -> 193;
               case 6 -> 223;
               case 7 -> 12;
               case 8 -> 162;
               case 9 -> 59;
               case 10 -> 165;
               case 11 -> 226;
               case 12 -> 192;
               case 13 -> 159;
               case 14 -> 216;
               case 15 -> 152;
               case 16 -> 122;
               case 17 -> 11;
               case 18 -> 241;
               case 19 -> 10;
               case 20 -> 183;
               case 21 -> 248;
               case 22 -> 42;
               case 23 -> 164;
               case 24 -> 128;
               case 25 -> 103;
               case 26 -> 25;
               case 27 -> 127;
               case 28 -> 33;
               case 29 -> 230;
               case 30 -> 96;
               case 31 -> 18;
               case 32 -> 154;
               case 33 -> 221;
               case 34 -> 211;
               case 35 -> 21;
               case 36 -> 253;
               case 37 -> 23;
               case 38 -> 189;
               case 39 -> 44;
               case 40 -> 171;
               case 41 -> 86;
               case 42 -> 106;
               case 43 -> 34;
               case 44 -> 135;
               case 45 -> 206;
               case 46 -> 139;
               case 47 -> 57;
               case 48 -> 177;
               case 49 -> 74;
               case 50 -> 182;
               case 51 -> 79;
               case 52 -> 185;
               case 53 -> 234;
               case 54 -> 108;
               case 55 -> 144;
               case 56 -> 100;
               case 57 -> 244;
               case 58 -> 210;
               case 59 -> 184;
               case 60 -> 3;
               case 61 -> 112;
               case 62 -> 114;
               case 63 -> 180;
               case 64 -> 161;
               case 65 -> 85;
               case 66 -> 225;
               case 67 -> 77;
               case 68 -> 220;
               case 69 -> 17;
               case 70 -> 166;
               case 71 -> 117;
               case 72 -> 4;
               case 73 -> 48;
               case 74 -> 158;
               case 75 -> 70;
               case 76 -> 69;
               case 77 -> 88;
               case 78 -> 224;
               case 79 -> 168;
               case 80 -> 149;
               case 81 -> 104;
               case 82 -> 9;
               case 83 -> 109;
               case 84 -> 187;
               case 85 -> 82;
               case 86 -> 65;
               case 87 -> 205;
               case 88 -> 13;
               case 89 -> 26;
               case 90 -> 196;
               case 91 -> 93;
               case 92 -> 14;
               case 93 -> 52;
               case 94 -> 236;
               case 95 -> 131;
               case 96 -> 218;
               case 97 -> 240;
               case 98 -> 209;
               case 99 -> 99;
               case 100 -> 191;
               case 101 -> 201;
               case 102 -> 49;
               case 103 -> 37;
               case 104 -> 56;
               case 105 -> 153;
               case 106 -> 133;
               case 107 -> 194;
               case 108 -> 169;
               case 109 -> 1;
               case 110 -> 97;
               case 111 -> 32;
               case 112 -> 2;
               case 113 -> 239;
               case 114 -> 138;
               case 115 -> 51;
               case 116 -> 202;
               case 117 -> 46;
               case 118 -> 53;
               case 119 -> 8;
               case 120 -> 118;
               case 121 -> 213;
               case 122 -> 175;
               case 123 -> 151;
               case 124 -> 36;
               case 125 -> 78;
               case 126 -> 247;
               case 127 -> 27;
               case 128 -> 172;
               case 129 -> 19;
               case 130 -> 120;
               case 131 -> 190;
               case 132 -> 72;
               case 133 -> 123;
               case 134 -> 116;
               case 135 -> 75;
               case 136 -> 50;
               case 137 -> 91;
               case 138 -> 5;
               case 139 -> 54;
               case 140 -> 83;
               case 141 -> 81;
               case 142 -> 249;
               case 143 -> 30;
               case 144 -> 107;
               case 145 -> 219;
               case 146 -> 170;
               case 147 -> 198;
               case 148 -> 39;
               case 149 -> 38;
               case 150 -> 207;
               case 151 -> 45;
               case 152 -> 90;
               case 153 -> 246;
               case 154 -> 163;
               case 155 -> 147;
               case 156 -> 35;
               case 157 -> 22;
               case 158 -> 130;
               case 159 -> 237;
               case 160 -> 7;
               case 161 -> 134;
               case 162 -> 62;
               case 163 -> 214;
               case 164 -> 24;
               case 165 -> 125;
               case 166 -> 115;
               case 167 -> 64;
               case 168 -> 84;
               case 169 -> 124;
               case 170 -> 252;
               case 171 -> 243;
               case 172 -> 229;
               case 173 -> 212;
               case 174 -> 143;
               case 175 -> 16;
               case 176 -> 227;
               case 177 -> 208;
               case 178 -> 92;
               case 179 -> 31;
               case 180 -> 238;
               case 181 -> 186;
               case 182 -> 89;
               case 183 -> 66;
               case 184 -> 235;
               case 185 -> 145;
               case 186 -> 141;
               case 187 -> 136;
               case 188 -> 0;
               case 189 -> 157;
               case 190 -> 6;
               case 191 -> 119;
               case 192 -> 129;
               case 193 -> 111;
               case 194 -> 228;
               case 195 -> 43;
               case 196 -> 20;
               case 197 -> 132;
               case 198 -> 55;
               case 199 -> 231;
               case 200 -> 197;
               case 201 -> 179;
               case 202 -> 73;
               case 203 -> 68;
               case 204 -> 232;
               case 205 -> 215;
               case 206 -> 173;
               case 207 -> 87;
               case 208 -> 245;
               case 209 -> 94;
               case 210 -> 146;
               case 211 -> 71;
               case 212 -> 80;
               case 213 -> 40;
               case 214 -> 254;
               case 215 -> 58;
               case 216 -> 101;
               case 217 -> 217;
               case 218 -> 47;
               case 219 -> 41;
               case 220 -> 156;
               case 221 -> 160;
               case 222 -> 110;
               case 223 -> 195;
               case 224 -> 137;
               case 225 -> 140;
               case 226 -> 203;
               case 227 -> 121;
               case 228 -> 15;
               case 229 -> 200;
               case 230 -> 150;
               case 231 -> 251;
               case 232 -> 250;
               case 233 -> 255;
               case 234 -> 113;
               case 235 -> 102;
               case 236 -> 63;
               case 237 -> 242;
               case 238 -> 29;
               case 239 -> 67;
               case 240 -> 155;
               case 241 -> 233;
               case 242 -> 95;
               case 243 -> 148;
               case 244 -> 222;
               case 245 -> 126;
               case 246 -> 60;
               case 247 -> 178;
               case 248 -> 76;
               case 249 -> 167;
               case 250 -> 98;
               case 251 -> 181;
               case 252 -> 61;
               case 253 -> 204;
               case 254 -> 174;
               default -> 188;
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

      // PX-FIX PhaseA: Kotlin copy-default (static bridge) restored from jar bytecode
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, Object var1, Triple<Integer, Integer, Integer> var2, int var3, int var4, boolean var5, String var6, int var7, int var8, Object var9) {
         if ((var8 & 1) != 0) { var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((var8 & 2) != 0) { var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((var8 & 4) != 0) { var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         if ((var8 & 8) != 0) { var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
         if ((var8 & 16) != 0) { var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
         if ((var8 & 32) != 0) { var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
         if ((var8 & 64) != 0) { var7 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll; }
         return var0.a(var1, var2, var3, var4, var5, var6, var7);
      }
   }

   private static enum llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      // PX-FIX varargs-ctor: entry args lost by obfuscator
      llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI(Object... px) {
      }


      public static IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[] a() {
         return (IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI a(
         String var0
      ) {
         return Enum.valueOf(
            IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};
      private static final EnumEntries<llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   

  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[] c() { return new me.octo.client.IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl }; }

      // PX-FIX PhaseA: enum constructor restored from jar bytecode (javac adds the implicit String,int params)
      private llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI() {
      }
}

   private static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      @Nullable
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final BlockPos lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final BlockPos IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final Triple<Integer, Integer, Integer> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] a;
      private static String[] b;

      public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         @Nullable String var1, @Nullable BlockPos var2, @Nullable BlockPos var3, int var4, @NotNull Triple<Integer, Integer, Integer> var5
      ) {
        
         short var10001 = 30845;
         short var10002 = -32218;
         Intrinsics.checkNotNullParameter(var5, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII =((Triple)( var5));
      }

      @Nullable
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final BlockPos b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String f() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final BlockPos g() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos h() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int i() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> j() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
         @Nullable String var1, @Nullable BlockPos var2, @Nullable BlockPos var3, int var4, @NotNull Triple<Integer, Integer, Integer> var5
      ) {
         short var10001 = 30844;
         short var10002 = 18554;
         Intrinsics.checkNotNullParameter(var5, "playerPos");
         return new IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
            var1, var2, var3, var4,((Triple)( var5
         )));
      }

      @NotNull
      @Override
      public String toString() { String var5 = null; // PX-FIX hoist
         BlockPos var4 = null; // PX-FIX hoist
         short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
         short var10000 = 30840;
         Triple var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         BlockPos var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
          var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
          var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -28460;
         short var10002 = 30841;
          var10003 = -2176;
          var10004 = 30842;
          var10005 = 5174;
          var10006 = 30843;
         short var10007 = 13186;
         short var10008 = 30847;
         short var10009 = -395;
         return "MoveProgress(commissionName="
            + var5
            + ", walkPosition="
            + var4
            + ", bestPosition="
            + var3
            + ", blacklistedVeins="
            + var2
            + ", playerPos="
            + var1
            + ")";
      }

      @Override
      public int hashCode() { int var4 = 0; // PX-FIX hoist
        
         int var1;
         int var6;
         label36: {
            var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
            String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 != 0) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
                  var6 = 0;
                  break label36;
               }

               var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            var6 = var10000.hashCode();
         }

         int var9;
         label30: {
            int var2 = var6;
            var6 = var2 * 31;
            BlockPos var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != 0) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var9 = 0;
                  break label30;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var9 = var10001.hashCode();
         }

         label24: {
            int var3 = var6 + var9;
            var6 = var3 * 31;
            BlockPos var10 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != 0) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var9 = 0;
                  break label24;
               }

               var10 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var9 = var10.hashCode();
         }

          var4 = var6 + var9;
         var4 = var4 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         return var4 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) { int var4 = 0; // PX-FIX hoist
        
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         Object var10000 = this;
         if (var2 == 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == 0) {
            if (!(
               var10000 instanceof IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var3 = (IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var10000;
          var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 == 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         if (var2 == 0) {
            if (var4 != var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
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
      static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
          var5 = new String[7];
         int var3 = 0;
         String var2 = "\u0014õH\u007f¬.\u0082¡õËS\u0004\u0018\f±\u001c\b\u008a\u00872H\u001a\u009a\u0015/X.á\u0017ä\u00adrNc*¼\u0097èTÅÌ\u0002V\u001b\u0013\u0015,}I°L\u0096ç1z\u0092g+ÕåÃ\u000fË/\u000fOÅ6}Ëõ\u0092&÷;\u0013\u001a\u0010Ï°\tNÒÂF \u000b;?Â";
          var4 = "\u0014õH\u007f¬.\u0082¡õËS\u0004\u0018\f±\u001c\b\u008a\u00872H\u001a\u009a\u0015/X.á\u0017ä\u00adrNc*¼\u0097èTÅÌ\u0002V\u001b\u0013\u0015,}I°L\u0096ç1z\u0092g+ÕåÃ\u000fË/\u000fOÅ6}Ëõ\u0092&÷;\u0013\u001a\u0010Ï°\tNÒÂF \u000b;?Â"
            .length();
         char var1 = 15;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 123;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                   var10004 = var24.length;
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
                        case 1 -> 126;
                        case 2 -> 67;
                        case 3 -> 95;
                        case 4 -> 44;
                        case 5 -> 24;
                        default -> 55;
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

                     var2 = "\u009c6\u007f=p\u0083ÖÉ\u0098\fÑ\u0006\u0010ëªå<ruîäÕ";
                     var4 = "\u009c6\u007f=p\u0083ÖÉ\u0098\fÑ\u0006\u0010ëªå<ruîäÕ".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 124;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
         int var2 = (var0 ^ 30841) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 46;
               case 1 -> 147;
               case 2 -> 171;
               case 3 -> 128;
               case 4 -> 10;
               case 5 -> 45;
               case 6 -> 26;
               case 7 -> 94;
               case 8 -> 172;
               case 9 -> 161;
               case 10 -> 28;
               case 11 -> 208;
               case 12 -> 224;
               case 13 -> 53;
               case 14 -> 142;
               case 15 -> 57;
               case 16 -> 9;
               case 17 -> 174;
               case 18 -> 206;
               case 19 -> 152;
               case 20 -> 3;
               case 21 -> 141;
               case 22 -> 51;
               case 23 -> 109;
               case 24 -> 204;
               case 25 -> 38;
               case 26 -> 6;
               case 27 -> 251;
               case 28 -> 229;
               case 29 -> 211;
               case 30 -> 71;
               case 31 -> 19;
               case 32 -> 246;
               case 33 -> 27;
               case 34 -> 0;
               case 35 -> 250;
               case 36 -> 175;
               case 37 -> 81;
               case 38 -> 37;
               case 39 -> 126;
               case 40 -> 49;
               case 41 -> 186;
               case 42 -> 50;
               case 43 -> 191;
               case 44 -> 162;
               case 45 -> 75;
               case 46 -> 52;
               case 47 -> 199;
               case 48 -> 65;
               case 49 -> 104;
               case 50 -> 136;
               case 51 -> 66;
               case 52 -> 254;
               case 53 -> 114;
               case 54 -> 182;
               case 55 -> 132;
               case 56 -> 177;
               case 57 -> 140;
               case 58 -> 156;
               case 59 -> 47;
               case 60 -> 201;
               case 61 -> 209;
               case 62 -> 43;
               case 63 -> 222;
               case 64 -> 213;
               case 65 -> 20;
               case 66 -> 148;
               case 67 -> 87;
               case 68 -> 76;
               case 69 -> 91;
               case 70 -> 72;
               case 71 -> 108;
               case 72 -> 121;
               case 73 -> 5;
               case 74 -> 82;
               case 75 -> 194;
               case 76 -> 179;
               case 77 -> 195;
               case 78 -> 115;
               case 79 -> 236;
               case 80 -> 110;
               case 81 -> 130;
               case 82 -> 173;
               case 83 -> 223;
               case 84 -> 169;
               case 85 -> 197;
               case 86 -> 227;
               case 87 -> 61;
               case 88 -> 202;
               case 89 -> 98;
               case 90 -> 89;
               case 91 -> 149;
               case 92 -> 245;
               case 93 -> 103;
               case 94 -> 106;
               case 95 -> 125;
               case 96 -> 32;
               case 97 -> 160;
               case 98 -> 117;
               case 99 -> 64;
               case 100 -> 138;
               case 101 -> 120;
               case 102 -> 153;
               case 103 -> 235;
               case 104 -> 233;
               case 105 -> 176;
               case 106 -> 12;
               case 107 -> 234;
               case 108 -> 183;
               case 109 -> 84;
               case 110 -> 151;
               case 111 -> 58;
               case 112 -> 192;
               case 113 -> 99;
               case 114 -> 60;
               case 115 -> 158;
               case 116 -> 42;
               case 117 -> 39;
               case 118 -> 35;
               case 119 -> 15;
               case 120 -> 239;
               case 121 -> 80;
               case 122 -> 180;
               case 123 -> 21;
               case 124 -> 30;
               case 125 -> 187;
               case 126 -> 237;
               case 127 -> 83;
               case 128 -> 167;
               case 129 -> 144;
               case 130 -> 253;
               case 131 -> 184;
               case 132 -> 85;
               case 133 -> 95;
               case 134 -> 150;
               case 135 -> 166;
               case 136 -> 137;
               case 137 -> 143;
               case 138 -> 111;
               case 139 -> 54;
               case 140 -> 249;
               case 141 -> 154;
               case 142 -> 7;
               case 143 -> 185;
               case 144 -> 134;
               case 145 -> 139;
               case 146 -> 16;
               case 147 -> 48;
               case 148 -> 207;
               case 149 -> 102;
               case 150 -> 11;
               case 151 -> 44;
               case 152 -> 92;
               case 153 -> 1;
               case 154 -> 40;
               case 155 -> 217;
               case 156 -> 189;
               case 157 -> 228;
               case 158 -> 101;
               case 159 -> 33;
               case 160 -> 62;
               case 161 -> 79;
               case 162 -> 2;
               case 163 -> 196;
               case 164 -> 14;
               case 165 -> 23;
               case 166 -> 181;
               case 167 -> 67;
               case 168 -> 96;
               case 169 -> 70;
               case 170 -> 255;
               case 171 -> 188;
               case 172 -> 193;
               case 173 -> 113;
               case 174 -> 25;
               case 175 -> 163;
               case 176 -> 252;
               case 177 -> 135;
               case 178 -> 77;
               case 179 -> 118;
               case 180 -> 159;
               case 181 -> 124;
               case 182 -> 41;
               case 183 -> 218;
               case 184 -> 247;
               case 185 -> 18;
               case 186 -> 165;
               case 187 -> 93;
               case 188 -> 59;
               case 189 -> 225;
               case 190 -> 55;
               case 191 -> 219;
               case 192 -> 31;
               case 193 -> 74;
               case 194 -> 243;
               case 195 -> 78;
               case 196 -> 90;
               case 197 -> 131;
               case 198 -> 145;
               case 199 -> 168;
               case 200 -> 86;
               case 201 -> 63;
               case 202 -> 241;
               case 203 -> 155;
               case 204 -> 97;
               case 205 -> 232;
               case 206 -> 133;
               case 207 -> 238;
               case 208 -> 205;
               case 209 -> 170;
               case 210 -> 248;
               case 211 -> 212;
               case 212 -> 220;
               case 213 -> 116;
               case 214 -> 29;
               case 215 -> 34;
               case 216 -> 231;
               case 217 -> 100;
               case 218 -> 221;
               case 219 -> 157;
               case 220 -> 226;
               case 221 -> 244;
               case 222 -> 112;
               case 223 -> 56;
               case 224 -> 36;
               case 225 -> 24;
               case 226 -> 68;
               case 227 -> 105;
               case 228 -> 73;
               case 229 -> 190;
               case 230 -> 146;
               case 231 -> 4;
               case 232 -> 215;
               case 233 -> 127;
               case 234 -> 22;
               case 235 -> 88;
               case 236 -> 129;
               case 237 -> 203;
               case 238 -> 122;
               case 239 -> 230;
               case 240 -> 242;
               case 241 -> 178;
               case 242 -> 8;
               case 243 -> 13;
               case 244 -> 17;
               case 245 -> 164;
               case 246 -> 200;
               case 247 -> 119;
               case 248 -> 123;
               case 249 -> 69;
               case 250 -> 240;
               case 251 -> 107;
               case 252 -> 210;
               case 253 -> 216;
               case 254 -> 214;
               default -> 198;
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

      // PX-FIX PhaseA: Kotlin copy-default (static bridge) restored from jar bytecode
      public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0, String var1, BlockPos var2, BlockPos var3, int var4, Triple<Integer, Integer, Integer> var5, int var6, Object var7) {
         if ((var6 & 1) != 0) { var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((var6 & 2) != 0) { var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((var6 & 4) != 0) { var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         if ((var6 & 8) != 0) { var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
         if ((var6 & 16) != 0) { var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
         return var0.a(var1, var2, var3, var4, var5);
      }
   }

    // --- Phase A S1b: hand-written synthetic accessors/bridges (jar flags 0x1019) ---
    // javac cannot emit ACC_SYNTHETIC/ACC_BRIDGE; acceptance is descriptor-exact (name+descriptor).
    public static final me.octo.client.IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl bI() { return IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.List bJ() { return IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.List bK() { return lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.List bL() { return lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final java.util.List bM() { return llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII; }   /* flags 0x1019 -> written as public static final; ACC_SYNTHETIC/ACC_BRIDGE are unreproducible */
    public static final void a(me.octo.client.IIlIIllIlIlllllIIIllllllIlIlIlIIIIllIlIIIlIllIIIllIllIlllIlIIIlllIllIIlIIIIIIIllllIIl p0, me.octo.client.IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p1) { p0.a(p1); }   /* same-family gap: jar access 0x1019, absent from the S1b dispatch list */
}
