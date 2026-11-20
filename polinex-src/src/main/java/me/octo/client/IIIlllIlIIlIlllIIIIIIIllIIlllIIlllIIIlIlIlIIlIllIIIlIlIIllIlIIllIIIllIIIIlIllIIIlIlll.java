package me.octo.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII;
import me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
import me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.commission.PolinexRoyalPigeonRecovery;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import java.util.Collection;
import net.minecraft.world.inventory.ContainerInput;
import me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.phys.Vec3;

public final class IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
    public static <T> T i(Object p0) { return null; } // PX-FIX mr4
    public static <T> T g(Object p0) { return null; } // PX-FIX mr4
    public static <T> T e(Object p0) { return null; } // PX-FIX mr4
    public static <T> T b(Object p0) { return null; } // PX-FIX mr4
    public static <T> T k(Object p0) { return null; } // PX-FIX mr3

   @NotNull
   public static IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @Nullable
   private IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private boolean IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   private boolean IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private HashSet<BlockPos> lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private int lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private int IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private int lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   private boolean lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   @NotNull
   private static IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   @NotNull
   private static Set<IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   @NotNull
   private static Set<IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   private static long lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   private static String[] j;
   private static String[] k;

   public IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll() { short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
      short var10001 = 13953;
      short var10002 = -20681;
      var10002 = 13973;
       var10003 = 15195;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
       var10004 = 13961;
       var10005 = -5730;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIIllIIIlllIIIlIIllIIIllIlIIllIIlIIlIIIIlllllIIlIlIlIIIlIIIlIlllIllllIIIIIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         lIIIllIIIlllIIIlIIllIIIllIlIIllIIlIIlIIIIlllllIIlIlIlIIIlIIIlIlllIllllIIIIIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         lIIIllIIIlllIIIlIIllIIIllIlIIllIIlIIlIIIIlllllIIlIlIlIIIlIIIlIlllIllllIIIIIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
      };
      super("Glacite Commission Macro", "Completes commissions in the Glacite Tunnels.", var3, "Glacite Tunnels", null, null, false, var1, 112, null);
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new HashSet<>();
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = 500;
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = 500;
   }

   @NotNull
   @Override
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(true, true, true, false, false, null, 56, null);
   }

   @Override
   public boolean c() {
      return true;
   }

   @NotNull
   public final HashMap<String, IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII> bp() { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
      Pair[] var2 = new Pair[7];
      short var10002 = 13955;
       var10003 = -8485;
       var10005 = 14004;
       var10006 = -7504;
      var2[0] = TuplesKt.to(
         "Umber Collector",
         new IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII(
            "Umber Collector",
            CollectionsKt.emptyList(),
            IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g(),
            IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )
      );
      int var10000 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      var10003 = 14005;
       var10004 = 12408;
      var10006 = 13966;
      short var10007 = -4973;
      var2[1] = TuplesKt.to(
         "Tungsten Collector",
         new IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII(
            "Tungsten Collector",
            CollectionsKt.emptyList(),
            IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .f(),
            IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         )
      );
      var10003 = 14000;
      var10004 = -6832;
      var10006 = 13956;
      var10007 = 19814;
      var2[2] = TuplesKt.to(
         "Glacite Collector",
         new IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII(
            "Glacite Collector",
            CollectionsKt.emptyList(),
            IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(),
            IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
      );
      var10003 = 13982;
      var10004 = 23937;
      var10006 = 13962;
      var10007 = -14107;
      BlockPos[] var3 = new BlockPos[]{
         new BlockPos(-62, 129, 395),
         new BlockPos(-78, 130, 403),
         new BlockPos(-70, 129, 399),
         new BlockPos(75, 118, 400),
         new BlockPos(64, 116, 409),
         new BlockPos(6, 126, 309),
         new BlockPos(-1, 138, 426),
         new BlockPos(-13, 140, 430)
      };
      var2[3] = TuplesKt.to(
         "Onyx Gemstone Collector",
         new IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII(
            "Onyx Gemstone Collector",
            CollectionsKt.listOf(var3),
            IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(),
            IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
      );
      var10003 = 13971;
      var10004 = -7652;
      var10006 = 13957;
      var10007 = 3124;
      var3 = new BlockPos[]{
         new BlockPos(-22, 131, 375),
         new BlockPos(-24, 131, 392),
         new BlockPos(1, 137, 424),
         new BlockPos(19, 139, 413),
         new BlockPos(25, 135, 364),
         new BlockPos(51, 116, 302)
      };
      var2[4] = TuplesKt.to(
         "Aquamarine Gemstone Collector",
         new IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII(
            "Aquamarine Gemstone Collector",
            CollectionsKt.listOf(var3),
            IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
      );
      var10003 = 14013;
      var10004 = 23048;
      var10006 = 13967;
      var10007 = -30435;
      var3 = new BlockPos[]{
         new BlockPos(81, 150, 328),
         new BlockPos(79, 149, 342),
         new BlockPos(96, 150, 368),
         new BlockPos(-84, 142, 257),
         new BlockPos(-109, 143, 263),
         new BlockPos(-69, 143, 420),
         new BlockPos(-56, 142, 440),
         new BlockPos(-42, 127, 414),
         new BlockPos(-53, 124, 425),
         new BlockPos(38, 118, 386)
      };
      var2[5] = TuplesKt.to(
         "Citrine Gemstone Collector",
         new IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII(
            "Citrine Gemstone Collector",
            CollectionsKt.listOf(var3),
            IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
      );
      var10003 = 13975;
      var10004 = 13291;
      var10006 = 13974;
      var10007 = -10150;
      var3 = new BlockPos[]{
         new BlockPos(65, 143, 282),
         new BlockPos(96, 153, 287),
         new BlockPos(-51, 146, 308),
         new BlockPos(-74, 146, 309),
         new BlockPos(-77, 119, 281),
         new BlockPos(91, 121, 397),
         new BlockPos(-73, 122, 456)
      };
      var2[6] = TuplesKt.to(
         "Peridot Gemstone Collector",
         new IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII(
            "Peridot Gemstone Collector",
            CollectionsKt.listOf(var3),
            IIIlIllllllIlIlIIIllIIllIllllllllIlIlIlllIlIlIIIIlIlllIlIlIIlIlllllIIllIlllIllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e(),
            IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
      );
      int var1 = var10000;

      try {
         HashMap var8 = MapsKt.hashMapOf(var2);
         if (var1 != 0) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
            );
         }

         return var8;
      } catch (NoSuchElementException var4) {
         throw (RuntimeException)a(var4);
      }
   }

   @Nullable
   public final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII bq() {
      return this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   }

   public final void a(@Nullable IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII var1) {
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var1;
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = 14007;
      short var10002 = 4491;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Glacite commission travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         (kotlin.jvm.functions.Function0)(() -> a(this)),
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function0)(() -> b(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return kotlin.Unit.INSTANCE; } // PX-FIX abs

      public Object receiver = IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.this; // PX-FIX receiver bound to enclosing module

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = 31025;
                   var10005 = 24403;
                  var10005 = 31024;
                   var10006 = 6411;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = 31027;
                  short var10002x = 15664;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "z0BÝÓ\u009dF<H\u0003ßOqÊ¢Q½qP²ä\u000eø\u0016:Úuq\u0085W'ç?gÁÐ·\u009ar\u0085a:\u000fËé\u0090fõPPRn\u009dè«/_èï[¯Ðø)Ã\u000b«r\u0087\u0083îp.\u0084\u0084G7~d\f£Û,ù·\u0019\u0091¨Ìé\u009a«u¶%©}\u0013\u009dÅñ3d\u009a+àç^ö´\u0007\u0095÷±=\u0019Ø{\u0018x%Ì\nÃ\u0019ß\u0011y`%V}H¸/ÔKå1¿\u0014ôÀ±gKÊÿÛ<TøÒ9M\u0080j\u009b2ý%/\u0002\u0013\u0013";
                  int var4 = "z0BÝÓ\u009dF<H\u0003ßOqÊ¢Q½qP²ä\u000eø\u0016:Úuq\u0085W'ç?gÁÐ·\u009ar\u0085a:\u000fËé\u0090fõPPRn\u009dè«/_èï[¯Ðø)Ã\u000b«r\u0087\u0083îp.\u0084\u0084G7~d\f£Û,ù·\u0019\u0091¨Ìé\u009a«u¶%©}\u0013\u009dÅñ3d\u009a+àç^ö´\u0007\u0095÷±=\u0019Ø{\u0018x%Ì\nÃ\u0019ß\u0011y`%V}H¸/ÔKå1¿\u0014ôÀ±gKÊÿÛ<TøÒ9M\u0080j\u009b2ý%/\u0002\u0013\u0013"
                     .length();
                  char var1 = 28;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 29;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 29;
                           var10006 = var6;
                        } else {
                           var13 = 29;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 29;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 63;
                              case 1 -> 112;
                              case 2 -> 95;
                              case 3 -> 66;
                              case 4 -> 1;
                              case 5 -> 93;
                              default -> 4;
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
        
                  int var2 = (var0 ^ 31025) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 148;
                        case 1 -> 177;
                        case 2 -> 13;
                        case 3 -> 154;
                        case 4 -> 191;
                        case 5 -> 23;
                        case 6 -> 189;
                        case 7 -> 247;
                        case 8 -> 62;
                        case 9 -> 232;
                        case 10 -> 151;
                        case 11 -> 72;
                        case 12 -> 134;
                        case 13 -> 69;
                        case 14 -> 160;
                        case 15 -> 58;
                        case 16 -> 19;
                        case 17 -> 170;
                        case 18 -> 60;
                        case 19 -> 53;
                        case 20 -> 70;
                        case 21 -> 103;
                        case 22 -> 139;
                        case 23 -> 107;
                        case 24 -> 83;
                        case 25 -> 55;
                        case 26 -> 31;
                        case 27 -> 163;
                        case 28 -> 110;
                        case 29 -> 221;
                        case 30 -> 24;
                        case 31 -> 248;
                        case 32 -> 59;
                        case 33 -> 104;
                        case 34 -> 227;
                        case 35 -> 8;
                        case 36 -> 50;
                        case 37 -> 133;
                        case 38 -> 235;
                        case 39 -> 244;
                        case 40 -> 172;
                        case 41 -> 22;
                        case 42 -> 113;
                        case 43 -> 162;
                        case 44 -> 245;
                        case 45 -> 176;
                        case 46 -> 29;
                        case 47 -> 190;
                        case 48 -> 141;
                        case 49 -> 239;
                        case 50 -> 25;
                        case 51 -> 150;
                        case 52 -> 192;
                        case 53 -> 179;
                        case 54 -> 75;
                        case 55 -> 171;
                        case 56 -> 47;
                        case 57 -> 84;
                        case 58 -> 213;
                        case 59 -> 231;
                        case 60 -> 207;
                        case 61 -> 61;
                        case 62 -> 149;
                        case 63 -> 119;
                        case 64 -> 108;
                        case 65 -> 3;
                        case 66 -> 196;
                        case 67 -> 233;
                        case 68 -> 153;
                        case 69 -> 152;
                        case 70 -> 246;
                        case 71 -> 120;
                        case 72 -> 210;
                        case 73 -> 78;
                        case 74 -> 218;
                        case 75 -> 4;
                        case 76 -> 185;
                        case 77 -> 205;
                        case 78 -> 91;
                        case 79 -> 214;
                        case 80 -> 26;
                        case 81 -> 130;
                        case 82 -> 201;
                        case 83 -> 15;
                        case 84 -> 216;
                        case 85 -> 112;
                        case 86 -> 206;
                        case 87 -> 27;
                        case 88 -> 35;
                        case 89 -> 38;
                        case 90 -> 129;
                        case 91 -> 30;
                        case 92 -> 36;
                        case 93 -> 34;
                        case 94 -> 21;
                        case 95 -> 17;
                        case 96 -> 40;
                        case 97 -> 229;
                        case 98 -> 14;
                        case 99 -> 255;
                        case 100 -> 173;
                        case 101 -> 158;
                        case 102 -> 159;
                        case 103 -> 199;
                        case 104 -> 41;
                        case 105 -> 80;
                        case 106 -> 182;
                        case 107 -> 76;
                        case 108 -> 81;
                        case 109 -> 169;
                        case 110 -> 32;
                        case 111 -> 114;
                        case 112 -> 142;
                        case 113 -> 85;
                        case 114 -> 87;
                        case 115 -> 9;
                        case 116 -> 187;
                        case 117 -> 238;
                        case 118 -> 6;
                        case 119 -> 174;
                        case 120 -> 49;
                        case 121 -> 147;
                        case 122 -> 28;
                        case 123 -> 79;
                        case 124 -> 188;
                        case 125 -> 46;
                        case 126 -> 99;
                        case 127 -> 51;
                        case 128 -> 140;
                        case 129 -> 86;
                        case 130 -> 64;
                        case 131 -> 145;
                        case 132 -> 92;
                        case 133 -> 97;
                        case 134 -> 132;
                        case 135 -> 16;
                        case 136 -> 165;
                        case 137 -> 200;
                        case 138 -> 73;
                        case 139 -> 123;
                        case 140 -> 136;
                        case 141 -> 223;
                        case 142 -> 127;
                        case 143 -> 116;
                        case 144 -> 82;
                        case 145 -> 77;
                        case 146 -> 44;
                        case 147 -> 54;
                        case 148 -> 175;
                        case 149 -> 195;
                        case 150 -> 184;
                        case 151 -> 226;
                        case 152 -> 128;
                        case 153 -> 167;
                        case 154 -> 56;
                        case 155 -> 5;
                        case 156 -> 37;
                        case 157 -> 194;
                        case 158 -> 197;
                        case 159 -> 68;
                        case 160 -> 42;
                        case 161 -> 217;
                        case 162 -> 96;
                        case 163 -> 102;
                        case 164 -> 181;
                        case 165 -> 252;
                        case 166 -> 57;
                        case 167 -> 7;
                        case 168 -> 63;
                        case 169 -> 48;
                        case 170 -> 253;
                        case 171 -> 125;
                        case 172 -> 156;
                        case 173 -> 220;
                        case 174 -> 12;
                        case 175 -> 215;
                        case 176 -> 254;
                        case 177 -> 66;
                        case 178 -> 178;
                        case 179 -> 143;
                        case 180 -> 237;
                        case 181 -> 33;
                        case 182 -> 157;
                        case 183 -> 126;
                        case 184 -> 144;
                        case 185 -> 0;
                        case 186 -> 198;
                        case 187 -> 212;
                        case 188 -> 94;
                        case 189 -> 208;
                        case 190 -> 234;
                        case 191 -> 89;
                        case 192 -> 98;
                        case 193 -> 166;
                        case 194 -> 20;
                        case 195 -> 241;
                        case 196 -> 65;
                        case 197 -> 161;
                        case 198 -> 138;
                        case 199 -> 95;
                        case 200 -> 203;
                        case 201 -> 10;
                        case 202 -> 164;
                        case 203 -> 183;
                        case 204 -> 242;
                        case 205 -> 131;
                        case 206 -> 236;
                        case 207 -> 251;
                        case 208 -> 111;
                        case 209 -> 124;
                        case 210 -> 122;
                        case 211 -> 11;
                        case 212 -> 109;
                        case 213 -> 71;
                        case 214 -> 93;
                        case 215 -> 100;
                        case 216 -> 224;
                        case 217 -> 45;
                        case 218 -> 204;
                        case 219 -> 230;
                        case 220 -> 225;
                        case 221 -> 193;
                        case 222 -> 1;
                        case 223 -> 209;
                        case 224 -> 240;
                        case 225 -> 250;
                        case 226 -> 88;
                        case 227 -> 106;
                        case 228 -> 146;
                        case 229 -> 137;
                        case 230 -> 135;
                        case 231 -> 249;
                        case 232 -> 219;
                        case 233 -> 101;
                        case 234 -> 222;
                        case 235 -> 168;
                        case 236 -> 105;
                        case 237 -> 117;
                        case 238 -> 211;
                        case 239 -> 18;
                        case 240 -> 74;
                        case 241 -> 67;
                        case 242 -> 90;
                        case 243 -> 243;
                        case 244 -> 121;
                        case 245 -> 202;
                        case 246 -> 155;
                        case 247 -> 2;
                        case 248 -> 180;
                        case 249 -> 115;
                        case 250 -> 228;
                        case 251 -> 118;
                        case 252 -> 39;
                        case 253 -> 186;
                        case 254 -> 52;
                        default -> 43;
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
         ),
         48,
         null);
      var10000 = this;
      var10001 = 13963;
      var10002 = 13177;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Glacite commission pigeon",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI,
         15000L,
         0L,
         true,
         false,
          (kotlin.jvm.functions.Function0)(() -> c(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return kotlin.Unit.INSTANCE; } // PX-FIX abs

      public Object receiver = IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.this; // PX-FIX receiver bound to enclosing module

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = -2398;
                   var10005 = -7692;
                  var10005 = -2397;
                   var10006 = 31354;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -2400;
                  short var10002 = 18878;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "r\u0099NU8\u0080\u008em\u0096$¹Á±®H\u001aí¥0$].\b\u001f\u0099\u0091\r\u00ad\u0085\\D\u008bî\u0080÷\u0099\u0083tùåz:Ù9ôÃxõ\u009fåY\u001fñ{LQ\u0016Õ\u0001ñÏïø{1\u0086ø~\u0087\u000e[3_á\u0017\u0081I\u0013Yf\t+\u0013ëå©\u001c³Àà\u0017?6ã@¾»ýðê\u009bÛ\u0094í9»Wòí\u009c\u000e\u009ccbhnÏÿö]\n¯â\u0012néJMÌ®~fAnüÉ<ûµp1ÿ£Ý¶¬ü¶ïÒß\u0098É9\u009brwÈ,ýê\u009a\u0002z\u0096";
                  int var4 = "r\u0099NU8\u0080\u008em\u0096$¹Á±®H\u001aí¥0$].\b\u001f\u0099\u0091\r\u00ad\u0085\\D\u008bî\u0080÷\u0099\u0083tùåz:Ù9ôÃxõ\u009fåY\u001fñ{LQ\u0016Õ\u0001ñÏïø{1\u0086ø~\u0087\u000e[3_á\u0017\u0081I\u0013Yf\t+\u0013ëå©\u001c³Àà\u0017?6ã@¾»ýðê\u009bÛ\u0094í9»Wòí\u009c\u000e\u009ccbhnÏÿö]\n¯â\u0012néJMÌ®~fAnüÉ<ûµp1ÿ£Ý¶¬ü¶ïÒß\u0098É9\u009brwÈ,ýê\u009a\u0002z\u0096"
                     .length();
                  char var1 = 28;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 72;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 72;
                           var10006 = var6;
                        } else {
                           var13 = 72;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 72;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 89;
                              case 1 -> 72;
                              case 2 -> 97;
                              case 3 -> 7;
                              case 4 -> 83;
                              case 5 -> 6;
                              default -> 4;
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
        
                  int var2 = (var0 ^ -2398) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 172;
                        case 1 -> 151;
                        case 2 -> 19;
                        case 3 -> 109;
                        case 4 -> 212;
                        case 5 -> 152;
                        case 6 -> 70;
                        case 7 -> 188;
                        case 8 -> 31;
                        case 9 -> 42;
                        case 10 -> 138;
                        case 11 -> 164;
                        case 12 -> 204;
                        case 13 -> 88;
                        case 14 -> 65;
                        case 15 -> 231;
                        case 16 -> 194;
                        case 17 -> 10;
                        case 18 -> 207;
                        case 19 -> 74;
                        case 20 -> 69;
                        case 21 -> 184;
                        case 22 -> 5;
                        case 23 -> 203;
                        case 24 -> 219;
                        case 25 -> 181;
                        case 26 -> 66;
                        case 27 -> 247;
                        case 28 -> 37;
                        case 29 -> 137;
                        case 30 -> 33;
                        case 31 -> 46;
                        case 32 -> 87;
                        case 33 -> 93;
                        case 34 -> 251;
                        case 35 -> 130;
                        case 36 -> 108;
                        case 37 -> 177;
                        case 38 -> 180;
                        case 39 -> 128;
                        case 40 -> 105;
                        case 41 -> 246;
                        case 42 -> 95;
                        case 43 -> 91;
                        case 44 -> 150;
                        case 45 -> 4;
                        case 46 -> 178;
                        case 47 -> 106;
                        case 48 -> 94;
                        case 49 -> 249;
                        case 50 -> 16;
                        case 51 -> 209;
                        case 52 -> 98;
                        case 53 -> 168;
                        case 54 -> 228;
                        case 55 -> 199;
                        case 56 -> 68;
                        case 57 -> 80;
                        case 58 -> 202;
                        case 59 -> 67;
                        case 60 -> 197;
                        case 61 -> 58;
                        case 62 -> 51;
                        case 63 -> 125;
                        case 64 -> 75;
                        case 65 -> 160;
                        case 66 -> 56;
                        case 67 -> 236;
                        case 68 -> 206;
                        case 69 -> 78;
                        case 70 -> 248;
                        case 71 -> 243;
                        case 72 -> 237;
                        case 73 -> 26;
                        case 74 -> 18;
                        case 75 -> 24;
                        case 76 -> 64;
                        case 77 -> 85;
                        case 78 -> 242;
                        case 79 -> 99;
                        case 80 -> 127;
                        case 81 -> 120;
                        case 82 -> 12;
                        case 83 -> 182;
                        case 84 -> 200;
                        case 85 -> 23;
                        case 86 -> 81;
                        case 87 -> 148;
                        case 88 -> 221;
                        case 89 -> 131;
                        case 90 -> 1;
                        case 91 -> 144;
                        case 92 -> 112;
                        case 93 -> 6;
                        case 94 -> 154;
                        case 95 -> 54;
                        case 96 -> 211;
                        case 97 -> 174;
                        case 98 -> 107;
                        case 99 -> 233;
                        case 100 -> 79;
                        case 101 -> 187;
                        case 102 -> 190;
                        case 103 -> 193;
                        case 104 -> 134;
                        case 105 -> 155;
                        case 106 -> 232;
                        case 107 -> 163;
                        case 108 -> 45;
                        case 109 -> 22;
                        case 110 -> 122;
                        case 111 -> 217;
                        case 112 -> 149;
                        case 113 -> 253;
                        case 114 -> 119;
                        case 115 -> 223;
                        case 116 -> 183;
                        case 117 -> 166;
                        case 118 -> 7;
                        case 119 -> 241;
                        case 120 -> 36;
                        case 121 -> 252;
                        case 122 -> 255;
                        case 123 -> 63;
                        case 124 -> 230;
                        case 125 -> 162;
                        case 126 -> 32;
                        case 127 -> 77;
                        case 128 -> 185;
                        case 129 -> 218;
                        case 130 -> 186;
                        case 131 -> 235;
                        case 132 -> 205;
                        case 133 -> 175;
                        case 134 -> 171;
                        case 135 -> 0;
                        case 136 -> 53;
                        case 137 -> 141;
                        case 138 -> 167;
                        case 139 -> 159;
                        case 140 -> 142;
                        case 141 -> 240;
                        case 142 -> 153;
                        case 143 -> 226;
                        case 144 -> 103;
                        case 145 -> 250;
                        case 146 -> 195;
                        case 147 -> 43;
                        case 148 -> 29;
                        case 149 -> 210;
                        case 150 -> 52;
                        case 151 -> 35;
                        case 152 -> 143;
                        case 153 -> 73;
                        case 154 -> 238;
                        case 155 -> 90;
                        case 156 -> 72;
                        case 157 -> 50;
                        case 158 -> 170;
                        case 159 -> 146;
                        case 160 -> 60;
                        case 161 -> 136;
                        case 162 -> 14;
                        case 163 -> 161;
                        case 164 -> 215;
                        case 165 -> 116;
                        case 166 -> 104;
                        case 167 -> 84;
                        case 168 -> 111;
                        case 169 -> 245;
                        case 170 -> 114;
                        case 171 -> 176;
                        case 172 -> 117;
                        case 173 -> 8;
                        case 174 -> 71;
                        case 175 -> 198;
                        case 176 -> 25;
                        case 177 -> 15;
                        case 178 -> 9;
                        case 179 -> 28;
                        case 180 -> 44;
                        case 181 -> 201;
                        case 182 -> 47;
                        case 183 -> 57;
                        case 184 -> 239;
                        case 185 -> 234;
                        case 186 -> 20;
                        case 187 -> 41;
                        case 188 -> 76;
                        case 189 -> 61;
                        case 190 -> 133;
                        case 191 -> 13;
                        case 192 -> 97;
                        case 193 -> 55;
                        case 194 -> 208;
                        case 195 -> 113;
                        case 196 -> 132;
                        case 197 -> 21;
                        case 198 -> 147;
                        case 199 -> 165;
                        case 200 -> 17;
                        case 201 -> 225;
                        case 202 -> 192;
                        case 203 -> 59;
                        case 204 -> 96;
                        case 205 -> 129;
                        case 206 -> 189;
                        case 207 -> 227;
                        case 208 -> 89;
                        case 209 -> 191;
                        case 210 -> 110;
                        case 211 -> 121;
                        case 212 -> 123;
                        case 213 -> 179;
                        case 214 -> 27;
                        case 215 -> 157;
                        case 216 -> 2;
                        case 217 -> 158;
                        case 218 -> 124;
                        case 219 -> 30;
                        case 220 -> 139;
                        case 221 -> 244;
                        case 222 -> 101;
                        case 223 -> 3;
                        case 224 -> 100;
                        case 225 -> 38;
                        case 226 -> 34;
                        case 227 -> 48;
                        case 228 -> 156;
                        case 229 -> 220;
                        case 230 -> 145;
                        case 231 -> 254;
                        case 232 -> 216;
                        case 233 -> 140;
                        case 234 -> 224;
                        case 235 -> 229;
                        case 236 -> 11;
                        case 237 -> 173;
                        case 238 -> 86;
                        case 239 -> 126;
                        case 240 -> 115;
                        case 241 -> 49;
                        case 242 -> 102;
                        case 243 -> 196;
                        case 244 -> 40;
                        case 245 -> 92;
                        case 246 -> 39;
                        case 247 -> 169;
                        case 248 -> 62;
                        case 249 -> 135;
                        case 250 -> 83;
                        case 251 -> 222;
                        case 252 -> 118;
                        case 253 -> 214;
                        case 254 -> 213;
                        default -> 82;
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
          ),
          40,
          null);
      var10000 = this;
      var10001 = 13977;
      var10002 = -12596;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Glacite commission area route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl,
         60000L,
         0L,
         (kotlin.jvm.functions.Function0)(() -> d(this)),
         false,
         false,
         (kotlin.jvm.functions.Function0)(() -> e(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return kotlin.Unit.INSTANCE; } // PX-FIX abs

      public Object receiver = IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.this; // PX-FIX receiver bound to enclosing module

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = -14139;
                   var10005 = -18386;
                  var10005 = -14138;
                   var10006 = -25724;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -14137;
                  short var10002 = 14214;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "I\b\u0085\u009e®\u0099ÝÄs\u0092!æçÙ¿_â§`Z\u0084ÀâÀÄH\bÿu#²©f4MQJ/Uÿ>?YÄ\u0003X§Æfc\u0085Ìòn6DòäZz\u0018\u0083.à(¼ã`° £ÜpüxS\u0086ú\u0099Úq-c\tÙÌ\u001aZ´#:Pª+³\u0092\u009fÛÇ2ü\u0004éÍ´\fú ¹ãÞÐï÷ù=IÏ\u0085èx½M@Á¤\f\\ ìãQÐÈ\u0097¿\u001cG\u0094¢\u009a£\u009b~<{DjË)li±\u0083¾û¥§,¤\u0015bÖ\u0090Æ";
                  int var4 = "I\b\u0085\u009e®\u0099ÝÄs\u0092!æçÙ¿_â§`Z\u0084ÀâÀÄH\bÿu#²©f4MQJ/Uÿ>?YÄ\u0003X§Æfc\u0085Ìòn6DòäZz\u0018\u0083.à(¼ã`° £ÜpüxS\u0086ú\u0099Úq-c\tÙÌ\u001aZ´#:Pª+³\u0092\u009fÛÇ2ü\u0004éÍ´\fú ¹ãÞÐï÷ù=IÏ\u0085èx½M@Á¤\f\\ ìãQÐÈ\u0097¿\u001cG\u0094¢\u009a£\u009b~<{DjË)li±\u0083¾û¥§,¤\u0015bÖ\u0090Æ"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 10;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 10;
                           var10006 = var6;
                        } else {
                           var13 = 10;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 10;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 65;
                              case 1 -> 17;
                              case 2 -> 34;
                              case 3 -> 72;
                              case 4 -> 55;
                              case 5 -> 7;
                              default -> 1;
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
        
                  int var2 = (var0 ^ -14137) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 196;
                        case 1 -> 121;
                        case 2 -> 20;
                        case 3 -> 194;
                        case 4 -> 134;
                        case 5 -> 4;
                        case 6 -> 212;
                        case 7 -> 117;
                        case 8 -> 161;
                        case 9 -> 10;
                        case 10 -> 140;
                        case 11 -> 185;
                        case 12 -> 202;
                        case 13 -> 242;
                        case 14 -> 16;
                        case 15 -> 181;
                        case 16 -> 228;
                        case 17 -> 223;
                        case 18 -> 245;
                        case 19 -> 13;
                        case 20 -> 81;
                        case 21 -> 153;
                        case 22 -> 74;
                        case 23 -> 177;
                        case 24 -> 247;
                        case 25 -> 235;
                        case 26 -> 112;
                        case 27 -> 243;
                        case 28 -> 76;
                        case 29 -> 210;
                        case 30 -> 6;
                        case 31 -> 18;
                        case 32 -> 64;
                        case 33 -> 32;
                        case 34 -> 1;
                        case 35 -> 49;
                        case 36 -> 111;
                        case 37 -> 109;
                        case 38 -> 60;
                        case 39 -> 192;
                        case 40 -> 254;
                        case 41 -> 249;
                        case 42 -> 36;
                        case 43 -> 230;
                        case 44 -> 126;
                        case 45 -> 149;
                        case 46 -> 215;
                        case 47 -> 61;
                        case 48 -> 9;
                        case 49 -> 34;
                        case 50 -> 255;
                        case 51 -> 197;
                        case 52 -> 143;
                        case 53 -> 2;
                        case 54 -> 95;
                        case 55 -> 170;
                        case 56 -> 125;
                        case 57 -> 3;
                        case 58 -> 29;
                        case 59 -> 115;
                        case 60 -> 145;
                        case 61 -> 50;
                        case 62 -> 21;
                        case 63 -> 174;
                        case 64 -> 124;
                        case 65 -> 48;
                        case 66 -> 195;
                        case 67 -> 82;
                        case 68 -> 231;
                        case 69 -> 37;
                        case 70 -> 250;
                        case 71 -> 193;
                        case 72 -> 167;
                        case 73 -> 252;
                        case 74 -> 132;
                        case 75 -> 154;
                        case 76 -> 28;
                        case 77 -> 144;
                        case 78 -> 30;
                        case 79 -> 62;
                        case 80 -> 158;
                        case 81 -> 104;
                        case 82 -> 67;
                        case 83 -> 59;
                        case 84 -> 188;
                        case 85 -> 169;
                        case 86 -> 31;
                        case 87 -> 106;
                        case 88 -> 83;
                        case 89 -> 179;
                        case 90 -> 171;
                        case 91 -> 41;
                        case 92 -> 187;
                        case 93 -> 69;
                        case 94 -> 91;
                        case 95 -> 54;
                        case 96 -> 92;
                        case 97 -> 96;
                        case 98 -> 217;
                        case 99 -> 15;
                        case 100 -> 51;
                        case 101 -> 147;
                        case 102 -> 160;
                        case 103 -> 73;
                        case 104 -> 77;
                        case 105 -> 46;
                        case 106 -> 27;
                        case 107 -> 40;
                        case 108 -> 251;
                        case 109 -> 119;
                        case 110 -> 164;
                        case 111 -> 79;
                        case 112 -> 165;
                        case 113 -> 63;
                        case 114 -> 244;
                        case 115 -> 25;
                        case 116 -> 156;
                        case 117 -> 172;
                        case 118 -> 232;
                        case 119 -> 7;
                        case 120 -> 184;
                        case 121 -> 175;
                        case 122 -> 100;
                        case 123 -> 240;
                        case 124 -> 137;
                        case 125 -> 234;
                        case 126 -> 42;
                        case 127 -> 159;
                        case 128 -> 213;
                        case 129 -> 101;
                        case 130 -> 163;
                        case 131 -> 224;
                        case 132 -> 33;
                        case 133 -> 26;
                        case 134 -> 248;
                        case 135 -> 226;
                        case 136 -> 87;
                        case 137 -> 127;
                        case 138 -> 218;
                        case 139 -> 200;
                        case 140 -> 173;
                        case 141 -> 43;
                        case 142 -> 238;
                        case 143 -> 178;
                        case 144 -> 38;
                        case 145 -> 166;
                        case 146 -> 5;
                        case 147 -> 72;
                        case 148 -> 211;
                        case 149 -> 209;
                        case 150 -> 14;
                        case 151 -> 136;
                        case 152 -> 233;
                        case 153 -> 58;
                        case 154 -> 190;
                        case 155 -> 201;
                        case 156 -> 205;
                        case 157 -> 94;
                        case 158 -> 22;
                        case 159 -> 168;
                        case 160 -> 70;
                        case 161 -> 57;
                        case 162 -> 23;
                        case 163 -> 102;
                        case 164 -> 0;
                        case 165 -> 84;
                        case 166 -> 56;
                        case 167 -> 118;
                        case 168 -> 150;
                        case 169 -> 99;
                        case 170 -> 148;
                        case 171 -> 191;
                        case 172 -> 139;
                        case 173 -> 253;
                        case 174 -> 208;
                        case 175 -> 216;
                        case 176 -> 88;
                        case 177 -> 214;
                        case 178 -> 71;
                        case 179 -> 120;
                        case 180 -> 90;
                        case 181 -> 35;
                        case 182 -> 152;
                        case 183 -> 157;
                        case 184 -> 44;
                        case 185 -> 86;
                        case 186 -> 39;
                        case 187 -> 103;
                        case 188 -> 17;
                        case 189 -> 85;
                        case 190 -> 122;
                        case 191 -> 47;
                        case 192 -> 239;
                        case 193 -> 162;
                        case 194 -> 55;
                        case 195 -> 93;
                        case 196 -> 203;
                        case 197 -> 220;
                        case 198 -> 52;
                        case 199 -> 68;
                        case 200 -> 66;
                        case 201 -> 183;
                        case 202 -> 186;
                        case 203 -> 151;
                        case 204 -> 142;
                        case 205 -> 53;
                        case 206 -> 108;
                        case 207 -> 80;
                        case 208 -> 222;
                        case 209 -> 135;
                        case 210 -> 236;
                        case 211 -> 237;
                        case 212 -> 123;
                        case 213 -> 199;
                        case 214 -> 78;
                        case 215 -> 89;
                        case 216 -> 130;
                        case 217 -> 189;
                        case 218 -> 246;
                        case 219 -> 133;
                        case 220 -> 155;
                        case 221 -> 12;
                        case 222 -> 24;
                        case 223 -> 241;
                        case 224 -> 110;
                        case 225 -> 116;
                        case 226 -> 227;
                        case 227 -> 176;
                        case 228 -> 75;
                        case 229 -> 97;
                        case 230 -> 45;
                        case 231 -> 180;
                        case 232 -> 229;
                        case 233 -> 98;
                        case 234 -> 219;
                        case 235 -> 207;
                        case 236 -> 131;
                        case 237 -> 11;
                        case 238 -> 113;
                        case 239 -> 198;
                        case 240 -> 146;
                        case 241 -> 65;
                        case 242 -> 141;
                        case 243 -> 114;
                        case 244 -> 129;
                        case 245 -> 19;
                        case 246 -> 128;
                        case 247 -> 107;
                        case 248 -> 225;
                        case 249 -> 8;
                        case 250 -> 105;
                        case 251 -> 182;
                        case 252 -> 204;
                        case 253 -> 138;
                        case 254 -> 206;
                        default -> 221;
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
         ),
         104,
         null);
      var10000 = this;
      var10001 = 13969;
      var10002 = 13338;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Glacite commission vein route",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
         60000L,
         0L,
         (kotlin.jvm.functions.Function0<Boolean>)(() -> f(this)),
         false,
         false,
         (kotlin.jvm.functions.Function0<Object>)(() -> g(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return kotlin.Unit.INSTANCE; } // PX-FIX abs

      public Object receiver = IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.this; // PX-FIX receiver bound to enclosing module

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = 26399;
                   var10005 = -16713;
                  var10005 = 26398;
                   var10006 = -25771;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 26397;
                  short var10002 = 20858;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "çÿ\")ZP·*l\u0012Vè\u0013þAÍ\u0012ï 2*±;2OÛ\u0088\u0091\u0085Ð\u000bÄ·\u0086\u0083,P\u001f]8\u0001ÞÃøj%\u001bÆ¬öb H<\u0094æx~\u0011Z}uñ]M\u009f©íB#\u0096Ë; +V\u0091\u009c\u001fJ\u001f\u001e>\u00125ËÛ!\u0088]Aý¡fl¾Ñ¢È\\AÓ\u007f\u0003\u001b\u0013N:\u00105^ö\u001crZ²9\u008bw¦g\r\u0091öï*\u000fh¹Ô`ÆÝ\u000f28;uºþ¥sì\u0092ïª\u0088\u0003<¹{E²Ý\u0081³é.OÎÙ\u0089\u0002\u0098\u001b";
                  int var4 = "çÿ\")ZP·*l\u0012Vè\u0013þAÍ\u0012ï 2*±;2OÛ\u0088\u0091\u0085Ð\u000bÄ·\u0086\u0083,P\u001f]8\u0001ÞÃøj%\u001bÆ¬öb H<\u0094æx~\u0011Z}uñ]M\u009f©íB#\u0096Ë; +V\u0091\u009c\u001fJ\u001f\u001e>\u00125ËÛ!\u0088]Aý¡fl¾Ñ¢È\\AÓ\u007f\u0003\u001b\u0013N:\u00105^ö\u001crZ²9\u008bw¦g\r\u0091öï*\u000fh¹Ô`ÆÝ\u000f28;uºþ¥sì\u0092ïª\u0088\u0003<¹{E²Ý\u0081³é.OÎÙ\u0089\u0002\u0098\u001b"
                     .length();
                  char var1 = 28;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 69;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 69;
                           var10006 = var6;
                        } else {
                           var13 = 69;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 69;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 11;
                              case 1 -> 19;
                              case 2 -> 89;
                              case 3 -> 112;
                              case 4 -> 23;
                              case 5 -> 27;
                              default -> 85;
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
        
                  int var2 = (var0 ^ 26399) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 185;
                        case 1 -> 148;
                        case 2 -> 162;
                        case 3 -> 16;
                        case 4 -> 218;
                        case 5 -> 114;
                        case 6 -> 189;
                        case 7 -> 237;
                        case 8 -> 98;
                        case 9 -> 216;
                        case 10 -> 198;
                        case 11 -> 208;
                        case 12 -> 153;
                        case 13 -> 61;
                        case 14 -> 141;
                        case 15 -> 66;
                        case 16 -> 150;
                        case 17 -> 255;
                        case 18 -> 128;
                        case 19 -> 207;
                        case 20 -> 39;
                        case 21 -> 233;
                        case 22 -> 105;
                        case 23 -> 24;
                        case 24 -> 242;
                        case 25 -> 117;
                        case 26 -> 182;
                        case 27 -> 199;
                        case 28 -> 200;
                        case 29 -> 154;
                        case 30 -> 15;
                        case 31 -> 232;
                        case 32 -> 77;
                        case 33 -> 127;
                        case 34 -> 215;
                        case 35 -> 71;
                        case 36 -> 240;
                        case 37 -> 118;
                        case 38 -> 144;
                        case 39 -> 167;
                        case 40 -> 147;
                        case 41 -> 47;
                        case 42 -> 1;
                        case 43 -> 85;
                        case 44 -> 8;
                        case 45 -> 213;
                        case 46 -> 101;
                        case 47 -> 169;
                        case 48 -> 235;
                        case 49 -> 38;
                        case 50 -> 43;
                        case 51 -> 81;
                        case 52 -> 121;
                        case 53 -> 72;
                        case 54 -> 175;
                        case 55 -> 210;
                        case 56 -> 97;
                        case 57 -> 248;
                        case 58 -> 14;
                        case 59 -> 29;
                        case 60 -> 45;
                        case 61 -> 79;
                        case 62 -> 60;
                        case 63 -> 229;
                        case 64 -> 27;
                        case 65 -> 211;
                        case 66 -> 173;
                        case 67 -> 41;
                        case 68 -> 120;
                        case 69 -> 225;
                        case 70 -> 109;
                        case 71 -> 220;
                        case 72 -> 190;
                        case 73 -> 122;
                        case 74 -> 130;
                        case 75 -> 204;
                        case 76 -> 9;
                        case 77 -> 82;
                        case 78 -> 33;
                        case 79 -> 222;
                        case 80 -> 234;
                        case 81 -> 181;
                        case 82 -> 54;
                        case 83 -> 224;
                        case 84 -> 30;
                        case 85 -> 99;
                        case 86 -> 44;
                        case 87 -> 76;
                        case 88 -> 174;
                        case 89 -> 67;
                        case 90 -> 34;
                        case 91 -> 206;
                        case 92 -> 254;
                        case 93 -> 137;
                        case 94 -> 94;
                        case 95 -> 57;
                        case 96 -> 46;
                        case 97 -> 111;
                        case 98 -> 119;
                        case 99 -> 84;
                        case 100 -> 0;
                        case 101 -> 172;
                        case 102 -> 149;
                        case 103 -> 68;
                        case 104 -> 221;
                        case 105 -> 217;
                        case 106 -> 74;
                        case 107 -> 146;
                        case 108 -> 22;
                        case 109 -> 136;
                        case 110 -> 178;
                        case 111 -> 184;
                        case 112 -> 228;
                        case 113 -> 36;
                        case 114 -> 7;
                        case 115 -> 3;
                        case 116 -> 180;
                        case 117 -> 80;
                        case 118 -> 230;
                        case 119 -> 151;
                        case 120 -> 168;
                        case 121 -> 50;
                        case 122 -> 83;
                        case 123 -> 6;
                        case 124 -> 193;
                        case 125 -> 227;
                        case 126 -> 203;
                        case 127 -> 143;
                        case 128 -> 223;
                        case 129 -> 171;
                        case 130 -> 165;
                        case 131 -> 59;
                        case 132 -> 239;
                        case 133 -> 123;
                        case 134 -> 25;
                        case 135 -> 51;
                        case 136 -> 37;
                        case 137 -> 63;
                        case 138 -> 166;
                        case 139 -> 202;
                        case 140 -> 12;
                        case 141 -> 133;
                        case 142 -> 2;
                        case 143 -> 135;
                        case 144 -> 249;
                        case 145 -> 75;
                        case 146 -> 58;
                        case 147 -> 69;
                        case 148 -> 23;
                        case 149 -> 125;
                        case 150 -> 241;
                        case 151 -> 192;
                        case 152 -> 113;
                        case 153 -> 186;
                        case 154 -> 108;
                        case 155 -> 102;
                        case 156 -> 31;
                        case 157 -> 183;
                        case 158 -> 95;
                        case 159 -> 32;
                        case 160 -> 73;
                        case 161 -> 187;
                        case 162 -> 56;
                        case 163 -> 177;
                        case 164 -> 170;
                        case 165 -> 139;
                        case 166 -> 5;
                        case 167 -> 132;
                        case 168 -> 243;
                        case 169 -> 246;
                        case 170 -> 90;
                        case 171 -> 188;
                        case 172 -> 205;
                        case 173 -> 103;
                        case 174 -> 17;
                        case 175 -> 126;
                        case 176 -> 195;
                        case 177 -> 194;
                        case 178 -> 70;
                        case 179 -> 163;
                        case 180 -> 160;
                        case 181 -> 19;
                        case 182 -> 106;
                        case 183 -> 156;
                        case 184 -> 53;
                        case 185 -> 209;
                        case 186 -> 247;
                        case 187 -> 49;
                        case 188 -> 157;
                        case 189 -> 115;
                        case 190 -> 64;
                        case 191 -> 78;
                        case 192 -> 20;
                        case 193 -> 201;
                        case 194 -> 65;
                        case 195 -> 219;
                        case 196 -> 52;
                        case 197 -> 88;
                        case 198 -> 158;
                        case 199 -> 129;
                        case 200 -> 245;
                        case 201 -> 89;
                        case 202 -> 100;
                        case 203 -> 93;
                        case 204 -> 214;
                        case 205 -> 161;
                        case 206 -> 196;
                        case 207 -> 40;
                        case 208 -> 176;
                        case 209 -> 138;
                        case 210 -> 18;
                        case 211 -> 131;
                        case 212 -> 110;
                        case 213 -> 42;
                        case 214 -> 212;
                        case 215 -> 251;
                        case 216 -> 159;
                        case 217 -> 142;
                        case 218 -> 86;
                        case 219 -> 4;
                        case 220 -> 91;
                        case 221 -> 112;
                        case 222 -> 10;
                        case 223 -> 152;
                        case 224 -> 21;
                        case 225 -> 231;
                        case 226 -> 13;
                        case 227 -> 253;
                        case 228 -> 145;
                        case 229 -> 140;
                        case 230 -> 28;
                        case 231 -> 134;
                        case 232 -> 191;
                        case 233 -> 35;
                        case 234 -> 104;
                        case 235 -> 164;
                        case 236 -> 197;
                        case 237 -> 87;
                        case 238 -> 252;
                        case 239 -> 250;
                        case 240 -> 155;
                        case 241 -> 124;
                        case 242 -> 116;
                        case 243 -> 26;
                        case 244 -> 48;
                        case 245 -> 62;
                        case 246 -> 226;
                        case 247 -> 55;
                        case 248 -> 107;
                        case 249 -> 96;
                        case 250 -> 244;
                        case 251 -> 11;
                        case 252 -> 238;
                        case 253 -> 179;
                        case 254 -> 92;
                        default -> 236;
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
         ),
         104,
         null);
      var10000 = this;
      var10001 = 13978;
      var10002 = 20626;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Glacite commission mining",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         15000L,
         0L,
         (kotlin.jvm.functions.Function0<Boolean>)(() -> h(this)),
         false,
         false,
         (kotlin.jvm.functions.Function0<Object>)(() -> i(this)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return kotlin.Unit.INSTANCE; } // PX-FIX abs

      public Object receiver = IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.this; // PX-FIX receiver bound to enclosing module

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = 1627;
                   var10005 = 19160;
                  var10005 = 1626;
                   var10006 = -29581;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 1624;
                  short var10002 = 1921;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u0090Çè\u0092©Ææ\u0002d3ëfE\u0000q00ìÎ³Ø{GO|Þ\u000f\u001e¹ÿ\u0086\u001cD<T\u000e\u009cå1aYÝ~p²þ®Ê¬\u008en\t&Vô\u0017í½Áøë®\u0004¦{¨¡ã ¡æN \"ÇQ¤ýîB\u0013¾Ó/,\u001e]\rÜ\u0010cq\u0097w\u0019\u00996î\u0011§ß\u001f\rÓY\tÐxÔx+Ò3 ¾Ê\u0085ÍÉnÂ\u0015\u0096ÕFB:³;¸ÆÆ§\u001c\u0086\\*áñ¨íÏ\u0005\u008aÇQÀæÁì&w\fÀ\u0080\u0015L\u0082\u001dg#)\u0002NÁ";
                  int var4 = "\u0090Çè\u0092©Ææ\u0002d3ëfE\u0000q00ìÎ³Ø{GO|Þ\u000f\u001e¹ÿ\u0086\u001cD<T\u000e\u009cå1aYÝ~p²þ®Ê¬\u008en\t&Vô\u0017í½Áøë®\u0004¦{¨¡ã ¡æN \"ÇQ¤ýîB\u0013¾Ó/,\u001e]\rÜ\u0010cq\u0097w\u0019\u00996î\u0011§ß\u001f\rÓY\tÐxÔx+Ò3 ¾Ê\u0085ÍÉnÂ\u0015\u0096ÕFB:³;¸ÆÆ§\u001c\u0086\\*áñ¨íÏ\u0005\u008aÇQÀæÁì&w\fÀ\u0080\u0015L\u0082\u001dg#)\u0002NÁ"
                     .length();
                  char var1 = 133;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 96;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 96;
                           var10006 = var6;
                        } else {
                           var13 = 96;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 96;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 61;
                              case 1 -> 120;
                              case 2 -> 58;
                              case 3 -> 32;
                              case 4 -> 80;
                              case 5 -> 113;
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

               private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
                  int var2 = (var0 ^ 1626) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 17;
                        case 1 -> 100;
                        case 2 -> 54;
                        case 3 -> 221;
                        case 4 -> 44;
                        case 5 -> 41;
                        case 6 -> 3;
                        case 7 -> 57;
                        case 8 -> 124;
                        case 9 -> 65;
                        case 10 -> 104;
                        case 11 -> 88;
                        case 12 -> 126;
                        case 13 -> 199;
                        case 14 -> 214;
                        case 15 -> 68;
                        case 16 -> 166;
                        case 17 -> 132;
                        case 18 -> 26;
                        case 19 -> 30;
                        case 20 -> 207;
                        case 21 -> 66;
                        case 22 -> 136;
                        case 23 -> 74;
                        case 24 -> 222;
                        case 25 -> 138;
                        case 26 -> 204;
                        case 27 -> 170;
                        case 28 -> 113;
                        case 29 -> 141;
                        case 30 -> 27;
                        case 31 -> 111;
                        case 32 -> 158;
                        case 33 -> 173;
                        case 34 -> 154;
                        case 35 -> 188;
                        case 36 -> 23;
                        case 37 -> 146;
                        case 38 -> 248;
                        case 39 -> 14;
                        case 40 -> 212;
                        case 41 -> 32;
                        case 42 -> 208;
                        case 43 -> 119;
                        case 44 -> 53;
                        case 45 -> 210;
                        case 46 -> 118;
                        case 47 -> 133;
                        case 48 -> 69;
                        case 49 -> 237;
                        case 50 -> 233;
                        case 51 -> 148;
                        case 52 -> 125;
                        case 53 -> 46;
                        case 54 -> 156;
                        case 55 -> 122;
                        case 56 -> 77;
                        case 57 -> 228;
                        case 58 -> 83;
                        case 59 -> 192;
                        case 60 -> 20;
                        case 61 -> 50;
                        case 62 -> 73;
                        case 63 -> 150;
                        case 64 -> 49;
                        case 65 -> 129;
                        case 66 -> 127;
                        case 67 -> 183;
                        case 68 -> 107;
                        case 69 -> 225;
                        case 70 -> 140;
                        case 71 -> 241;
                        case 72 -> 167;
                        case 73 -> 43;
                        case 74 -> 244;
                        case 75 -> 213;
                        case 76 -> 236;
                        case 77 -> 218;
                        case 78 -> 151;
                        case 79 -> 250;
                        case 80 -> 35;
                        case 81 -> 92;
                        case 82 -> 197;
                        case 83 -> 177;
                        case 84 -> 85;
                        case 85 -> 90;
                        case 86 -> 81;
                        case 87 -> 109;
                        case 88 -> 84;
                        case 89 -> 29;
                        case 90 -> 93;
                        case 91 -> 12;
                        case 92 -> 24;
                        case 93 -> 191;
                        case 94 -> 115;
                        case 95 -> 227;
                        case 96 -> 157;
                        case 97 -> 142;
                        case 98 -> 165;
                        case 99 -> 18;
                        case 100 -> 94;
                        case 101 -> 95;
                        case 102 -> 25;
                        case 103 -> 98;
                        case 104 -> 247;
                        case 105 -> 251;
                        case 106 -> 203;
                        case 107 -> 243;
                        case 108 -> 175;
                        case 109 -> 112;
                        case 110 -> 16;
                        case 111 -> 254;
                        case 112 -> 189;
                        case 113 -> 89;
                        case 114 -> 200;
                        case 115 -> 8;
                        case 116 -> 130;
                        case 117 -> 239;
                        case 118 -> 48;
                        case 119 -> 91;
                        case 120 -> 209;
                        case 121 -> 58;
                        case 122 -> 174;
                        case 123 -> 217;
                        case 124 -> 114;
                        case 125 -> 64;
                        case 126 -> 116;
                        case 127 -> 190;
                        case 128 -> 71;
                        case 129 -> 79;
                        case 130 -> 45;
                        case 131 -> 226;
                        case 132 -> 135;
                        case 133 -> 230;
                        case 134 -> 101;
                        case 135 -> 164;
                        case 136 -> 78;
                        case 137 -> 40;
                        case 138 -> 121;
                        case 139 -> 55;
                        case 140 -> 186;
                        case 141 -> 169;
                        case 142 -> 202;
                        case 143 -> 117;
                        case 144 -> 60;
                        case 145 -> 185;
                        case 146 -> 28;
                        case 147 -> 86;
                        case 148 -> 182;
                        case 149 -> 110;
                        case 150 -> 246;
                        case 151 -> 10;
                        case 152 -> 61;
                        case 153 -> 235;
                        case 154 -> 195;
                        case 155 -> 198;
                        case 156 -> 33;
                        case 157 -> 193;
                        case 158 -> 82;
                        case 159 -> 187;
                        case 160 -> 4;
                        case 161 -> 31;
                        case 162 -> 42;
                        case 163 -> 172;
                        case 164 -> 5;
                        case 165 -> 178;
                        case 166 -> 194;
                        case 167 -> 0;
                        case 168 -> 96;
                        case 169 -> 51;
                        case 170 -> 63;
                        case 171 -> 7;
                        case 172 -> 38;
                        case 173 -> 139;
                        case 174 -> 229;
                        case 175 -> 181;
                        case 176 -> 152;
                        case 177 -> 87;
                        case 178 -> 22;
                        case 179 -> 2;
                        case 180 -> 171;
                        case 181 -> 9;
                        case 182 -> 134;
                        case 183 -> 219;
                        case 184 -> 196;
                        case 185 -> 249;
                        case 186 -> 1;
                        case 187 -> 59;
                        case 188 -> 123;
                        case 189 -> 161;
                        case 190 -> 120;
                        case 191 -> 216;
                        case 192 -> 47;
                        case 193 -> 253;
                        case 194 -> 128;
                        case 195 -> 232;
                        case 196 -> 211;
                        case 197 -> 231;
                        case 198 -> 145;
                        case 199 -> 56;
                        case 200 -> 220;
                        case 201 -> 184;
                        case 202 -> 36;
                        case 203 -> 34;
                        case 204 -> 105;
                        case 205 -> 206;
                        case 206 -> 255;
                        case 207 -> 11;
                        case 208 -> 143;
                        case 209 -> 131;
                        case 210 -> 176;
                        case 211 -> 160;
                        case 212 -> 39;
                        case 213 -> 62;
                        case 214 -> 6;
                        case 215 -> 103;
                        case 216 -> 245;
                        case 217 -> 149;
                        case 218 -> 76;
                        case 219 -> 37;
                        case 220 -> 80;
                        case 221 -> 179;
                        case 222 -> 70;
                        case 223 -> 242;
                        case 224 -> 159;
                        case 225 -> 97;
                        case 226 -> 67;
                        case 227 -> 215;
                        case 228 -> 252;
                        case 229 -> 13;
                        case 230 -> 205;
                        case 231 -> 19;
                        case 232 -> 224;
                        case 233 -> 153;
                        case 234 -> 72;
                        case 235 -> 102;
                        case 236 -> 147;
                        case 237 -> 201;
                        case 238 -> 155;
                        case 239 -> 144;
                        case 240 -> 99;
                        case 241 -> 75;
                        case 242 -> 163;
                        case 243 -> 180;
                        case 244 -> 52;
                        case 245 -> 234;
                        case 246 -> 106;
                        case 247 -> 15;
                        case 248 -> 108;
                        case 249 -> 137;
                        case 250 -> 240;
                        case 251 -> 162;
                        case 252 -> 21;
                        case 253 -> 223;
                        case 254 -> 238;
                        default -> 168;
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
         ),
         104,
         null);
      var10000 = this;
      var10001 = 13960;
      var10002 = 16166;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Glacite commission completion",
         IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl,
         900000L,
         0L,
         null,
         true,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return kotlin.Unit.INSTANCE; } // PX-FIX abs

      public Object receiver = IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.this; // PX-FIX receiver bound to enclosing module

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = 700;
                   var10005 = 14189;
                  var10005 = 701;
                   var10006 = 24047;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 703;
                  short var10002 = 30682;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ZÏÇ\u0094\u000e\u0001\u0099\u00878õgüÓØÞ\u0098³þüö\u0015®M\u0083:\u0005Àî=R`®Úm\fY$y!°\\l£õ\u007fIU;XÍC\u0017\u0084×§¬úyUg;Z\u0095Eú¢\u0096àAJ§\u0080þüN\u008d\u001e\u001b\nè\u0088©§Fß\u0080UÙ\u009f\u008d\u0080¿XØç.î\u0093w»e\u009b\u0018Dp\u0086Fÿ\u0001Ê\u0096\u000fù(\u0091Ì\"\n¶ë\u009eÓ\u001aOÐ\u009a\u0095\u001b¸ªô\u0083j\u001cS\"æ)*¶\u001dq¨+u'\u0091£\u0096÷º\u0013ÝK1\u0019ÉuªÛÒ5\u0002\u0087t";
                  int var4 = "ZÏÇ\u0094\u000e\u0001\u0099\u00878õgüÓØÞ\u0098³þüö\u0015®M\u0083:\u0005Àî=R`®Úm\fY$y!°\\l£õ\u007fIU;XÍC\u0017\u0084×§¬úyUg;Z\u0095Eú¢\u0096àAJ§\u0080þüN\u008d\u001e\u001b\nè\u0088©§Fß\u0080UÙ\u009f\u008d\u0080¿XØç.î\u0093w»e\u009b\u0018Dp\u0086Fÿ\u0001Ê\u0096\u000fù(\u0091Ì\"\n¶ë\u009eÓ\u001aOÐ\u009a\u0095\u001b¸ªô\u0083j\u001cS\"æ)*¶\u001dq¨+u'\u0091£\u0096÷º\u0013ÝK1\u0019ÉuªÛÒ5\u0002\u0087t"
                     .length();
                  char var1 = 133;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 80;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 80;
                           var10006 = var6;
                        } else {
                           var13 = 80;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 80;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 53;
                              case 1 -> 59;
                              case 2 -> 123;
                              case 3 -> 121;
                              case 4 -> 12;
                              case 5 -> 107;
                              default -> 37;
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
        
                  int var2 = (var0 ^ 701) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 69;
                        case 1 -> 232;
                        case 2 -> 185;
                        case 3 -> 202;
                        case 4 -> 1;
                        case 5 -> 145;
                        case 6 -> 194;
                        case 7 -> 24;
                        case 8 -> 246;
                        case 9 -> 188;
                        case 10 -> 130;
                        case 11 -> 182;
                        case 12 -> 169;
                        case 13 -> 156;
                        case 14 -> 98;
                        case 15 -> 53;
                        case 16 -> 201;
                        case 17 -> 27;
                        case 18 -> 210;
                        case 19 -> 251;
                        case 20 -> 25;
                        case 21 -> 203;
                        case 22 -> 228;
                        case 23 -> 12;
                        case 24 -> 95;
                        case 25 -> 253;
                        case 26 -> 218;
                        case 27 -> 91;
                        case 28 -> 4;
                        case 29 -> 143;
                        case 30 -> 196;
                        case 31 -> 189;
                        case 32 -> 171;
                        case 33 -> 47;
                        case 34 -> 33;
                        case 35 -> 76;
                        case 36 -> 144;
                        case 37 -> 81;
                        case 38 -> 3;
                        case 39 -> 125;
                        case 40 -> 93;
                        case 41 -> 162;
                        case 42 -> 56;
                        case 43 -> 52;
                        case 44 -> 157;
                        case 45 -> 155;
                        case 46 -> 184;
                        case 47 -> 192;
                        case 48 -> 150;
                        case 49 -> 46;
                        case 50 -> 190;
                        case 51 -> 164;
                        case 52 -> 183;
                        case 53 -> 79;
                        case 54 -> 15;
                        case 55 -> 23;
                        case 56 -> 55;
                        case 57 -> 220;
                        case 58 -> 85;
                        case 59 -> 236;
                        case 60 -> 83;
                        case 61 -> 242;
                        case 62 -> 131;
                        case 63 -> 152;
                        case 64 -> 206;
                        case 65 -> 168;
                        case 66 -> 225;
                        case 67 -> 212;
                        case 68 -> 66;
                        case 69 -> 193;
                        case 70 -> 209;
                        case 71 -> 121;
                        case 72 -> 255;
                        case 73 -> 197;
                        case 74 -> 205;
                        case 75 -> 20;
                        case 76 -> 44;
                        case 77 -> 107;
                        case 78 -> 211;
                        case 79 -> 134;
                        case 80 -> 71;
                        case 81 -> 170;
                        case 82 -> 245;
                        case 83 -> 37;
                        case 84 -> 123;
                        case 85 -> 237;
                        case 86 -> 104;
                        case 87 -> 217;
                        case 88 -> 106;
                        case 89 -> 179;
                        case 90 -> 124;
                        case 91 -> 215;
                        case 92 -> 105;
                        case 93 -> 117;
                        case 94 -> 172;
                        case 95 -> 41;
                        case 96 -> 176;
                        case 97 -> 8;
                        case 98 -> 5;
                        case 99 -> 36;
                        case 100 -> 181;
                        case 101 -> 204;
                        case 102 -> 138;
                        case 103 -> 234;
                        case 104 -> 88;
                        case 105 -> 30;
                        case 106 -> 70;
                        case 107 -> 80;
                        case 108 -> 92;
                        case 109 -> 247;
                        case 110 -> 89;
                        case 111 -> 68;
                        case 112 -> 219;
                        case 113 -> 78;
                        case 114 -> 42;
                        case 115 -> 186;
                        case 116 -> 140;
                        case 117 -> 65;
                        case 118 -> 22;
                        case 119 -> 250;
                        case 120 -> 208;
                        case 121 -> 177;
                        case 122 -> 249;
                        case 123 -> 99;
                        case 124 -> 6;
                        case 125 -> 180;
                        case 126 -> 174;
                        case 127 -> 74;
                        case 128 -> 39;
                        case 129 -> 224;
                        case 130 -> 59;
                        case 131 -> 109;
                        case 132 -> 108;
                        case 133 -> 158;
                        case 134 -> 60;
                        case 135 -> 230;
                        case 136 -> 120;
                        case 137 -> 214;
                        case 138 -> 57;
                        case 139 -> 86;
                        case 140 -> 54;
                        case 141 -> 198;
                        case 142 -> 11;
                        case 143 -> 118;
                        case 144 -> 50;
                        case 145 -> 141;
                        case 146 -> 115;
                        case 147 -> 195;
                        case 148 -> 244;
                        case 149 -> 129;
                        case 150 -> 133;
                        case 151 -> 229;
                        case 152 -> 126;
                        case 153 -> 63;
                        case 154 -> 96;
                        case 155 -> 31;
                        case 156 -> 19;
                        case 157 -> 7;
                        case 158 -> 127;
                        case 159 -> 18;
                        case 160 -> 9;
                        case 161 -> 167;
                        case 162 -> 48;
                        case 163 -> 40;
                        case 164 -> 132;
                        case 165 -> 114;
                        case 166 -> 239;
                        case 167 -> 151;
                        case 168 -> 226;
                        case 169 -> 51;
                        case 170 -> 2;
                        case 171 -> 231;
                        case 172 -> 26;
                        case 173 -> 216;
                        case 174 -> 227;
                        case 175 -> 149;
                        case 176 -> 223;
                        case 177 -> 90;
                        case 178 -> 38;
                        case 179 -> 16;
                        case 180 -> 136;
                        case 181 -> 159;
                        case 182 -> 77;
                        case 183 -> 175;
                        case 184 -> 139;
                        case 185 -> 122;
                        case 186 -> 67;
                        case 187 -> 173;
                        case 188 -> 191;
                        case 189 -> 13;
                        case 190 -> 163;
                        case 191 -> 112;
                        case 192 -> 213;
                        case 193 -> 64;
                        case 194 -> 62;
                        case 195 -> 166;
                        case 196 -> 73;
                        case 197 -> 161;
                        case 198 -> 199;
                        case 199 -> 240;
                        case 200 -> 235;
                        case 201 -> 58;
                        case 202 -> 100;
                        case 203 -> 113;
                        case 204 -> 75;
                        case 205 -> 28;
                        case 206 -> 135;
                        case 207 -> 101;
                        case 208 -> 238;
                        case 209 -> 45;
                        case 210 -> 200;
                        case 211 -> 248;
                        case 212 -> 160;
                        case 213 -> 32;
                        case 214 -> 82;
                        case 215 -> 178;
                        case 216 -> 119;
                        case 217 -> 116;
                        case 218 -> 17;
                        case 219 -> 10;
                        case 220 -> 254;
                        case 221 -> 49;
                        case 222 -> 84;
                        case 223 -> 87;
                        case 224 -> 233;
                        case 225 -> 94;
                        case 226 -> 72;
                        case 227 -> 153;
                        case 228 -> 102;
                        case 229 -> 103;
                        case 230 -> 222;
                        case 231 -> 154;
                        case 232 -> 243;
                        case 233 -> 187;
                        case 234 -> 241;
                        case 235 -> 146;
                        case 236 -> 252;
                        case 237 -> 221;
                        case 238 -> 0;
                        case 239 -> 110;
                        case 240 -> 147;
                        case 241 -> 61;
                        case 242 -> 148;
                        case 243 -> 34;
                        case 244 -> 137;
                        case 245 -> 128;
                        case 246 -> 111;
                        case 247 -> 142;
                        case 248 -> 165;
                        case 249 -> 29;
                        case 250 -> 43;
                        case 251 -> 35;
                        case 252 -> 21;
                        case 253 -> 14;
                        case 254 -> 207;
                        default -> 97;
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
         ),
         16,
         null);   }

   @Override
   public void aC() {
      try {
      me.octo.client.utils.player.etherwarp.PolinexGlaciteTunnelEtherwarpCompatibility.markActive("Glacite Commission Macro");
      final int control = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (control != 0) {
         return;
      }
      final LocalPlayer player = this.ap().player;
      if (player == null) {
         return;
      }
      final LocalPlayer localPlayer = player;
      if (IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n()) {
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t();
         return;
      }
      if (this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll) {
         this.bx();
         this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = false;
         this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = false;
         return;
      }
      if ((this.W() == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll || this.W() == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl || this.W() == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll) && this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll) {
         return;
      }
      if ((this.W() == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl || this.W() == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll) && IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() >= lIIIllIIIlllIIIlIIllIIIllIlIIllIIlIIlIIIIlllllIIlIlIlIIIlIIIlIlllIllllIIIIIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().O()) {
         this.a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl, 2000);
      }
      switch (me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[this.W().ordinal()]) {
         case 1: {
            if (!this.aK()) {
               return;
            }
            switch (me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[this.aJ().a().ordinal()]) {
               case 1: {
                  this.ba();
                  break;
               }
               case 2: {
                  this.ba();
                  break;
               }
            }
            break;
         }
         case 33: {
            if (!me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g()) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t();
               return;
            }
            if (me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("attack")) {
               me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a("attack", false);
               return;
            }
            if (this.e(0)) {
               return;
            }
            final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll t = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t();
            if (t == null) {
               return;
            }
            final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = t;
            if (!this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI) {
               if (IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.K() != llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b()) {
                  IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b());
                  this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.f();
                  this.by();
                  return;
               }
            }
            else if (lIIIllIIIlllIIIlIIllIIIllIlIIllIIlIIlIIIIlllllIIlIlIlIIIlIIIlIlllIllllIIIIIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().al()) {
                Number g;
                Number n;
               if ((n = (g = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.G())) == null) {
                  final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll q = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q();
                  g = (n = ((q != null) ? Integer.valueOf(q.b()) : null));
               }
               if (n != null) {
                  final int intValue = g.intValue();
                  if (IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.K() != intValue) {
                     final LocalPlayer player2 = this.ap().player;
                     Intrinsics.checkNotNull((Object)player2);
                     player2.getInventory().setSelectedSlot(intValue);
                     return;
                  }
               }
            }
            if (this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI) {
               if (this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.a((Number)400)) {
                  this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = false;
                  break;
               }
               break;
            }
            else {
               if (this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.a((Number)this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI) && me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) {
                  this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.f();
                  this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = true;
                  this.by();
                  break;
               }
               break;
            }
         }
         case 23: {
            final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
            if (liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl != null) {
               final BlockPos e = liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.e();
               if (e != null) {
                  final BlockPos blockPos = e;
                  if (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().d()) {
                     IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e(), (Object)blockPos, (Vec3)null, false, 6, (Object)null);
                  }
                  this.e(1);
                  if (IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(blockPos), me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)localPlayer)) < 6.0) {
                     this.bs();
                     break;
                  }
                  break;
               }
            }
            return;
         }
         case 22: {
            final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl2 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
            if (liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl2 != null) {
               final BlockPos f = liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl2.f();
               if (f != null) {
                  final BlockPos e2 = f;
                  final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl3 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
                  if (liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl3 != null) {
                     final BlockPos e3 = liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl3.e();
                     if (e3 != null) {
                        final BlockPos blockPos2 = e3;
                        final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl4 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
                        final Vec3 vec3 = (liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl4 != null) ? liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl4.g() : null;
                        if (this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.a((Number)5000) && vec3 != null && IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(vec3, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)localPlayer)) > 25.0) {
                           this.bs();
                        }
                        else if (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().d() && !IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e(), (Object)blockPos2, vec3, false, 4, (Object)null)) {
                           this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.add(e2);
                           this.bs();
                        }
                        this.e(1);
                        final Vec3 a = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)localPlayer);
                        final Vec3 eyePosition = localPlayer.getEyePosition();
                        Intrinsics.checkNotNullExpressionValue((Object)eyePosition, "getEyePosition(...)");
                        final Vec3 vec4 = eyePosition;
                        if (IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(blockPos2), a) >= 4.0) {
                           if (vec3 == null || IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(vec3, vec4) >= 5.0) {
                              break;
                           }
                           final me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll iiiiiiiiIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                           final BlockPos containing = BlockPos.containing((net.minecraft.core.Position)vec3);
                           Intrinsics.checkNotNullExpressionValue((Object)containing, "containing(...)");
                           if (!me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.b(iiiiiiiiIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, containing, (List)null, (Vec3)null, 6, (Object)null)) {
                              break;
                           }
                        }
                        this.br();
                        break;
                     }
                  }
               }
            }
            return;
         }
         case 6: {
            final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl5 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
            if (liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl5 != null) {
               final BlockPos f2 = liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl5.f();
               if (f2 != null) {
                  final BlockPos e4 = f2;
                  if (!lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().b()) {
                     lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().k(false);
                     lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().c(lIIIllIIIlllIIIlIIllIIIllIlIIllIIlIIlIIIIlllllIIlIlIlIIIlIIIlIlllIllllIIIIIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().c("Mining Ability"));
                     lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().c(e4);
                     break;
                  }
                  if (lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().c()) {
                     lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().j(true);
                     this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.add(e4);
                     this.bs();
                     break;
                  }
                  break;
               }
            }
         }
      }
      } catch (NoSuchElementException exception) {
         throw a(exception);
      }
   }
   @SubscribeEvent
   public final void a(@NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      if (var2 == 0) {
         return;
      }
      String var3 = param1.k();
      java.util.List var4 = param1.m();
      if (this.W() != me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI) {
         return;
      }
      if (!kotlin.jvm.internal.Intrinsics.areEqual(var3, "Commissions")) {
         return;
      }
      if (!this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.a(Integer.valueOf(this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll))) {
         return;
      }
      java.util.List var5 = kotlin.collections.CollectionsKt.take((Iterable) var4, 27);
      boolean var6 = false;
      java.util.Iterator var7 = var5.iterator();
      while (var7.hasNext()) {
         net.minecraft.world.inventory.Slot var9 = (net.minecraft.world.inventory.Slot) var7.next();
         if (var9.getItem().isEmpty()) {
            var6 = true;
            break;
         }
      }
      if (var6) {
         return;
      }
      java.lang.Integer var8 = this.b(param1);
      if (var8 != null) {
         me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var8.intValue(), 1, net.minecraft.world.inventory.ContainerInput.PICKUP);
         this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.f();
         this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e();
         return;
      }
      java.util.List var10 = this.c(param1);
      if (var10 == null) {
         return;
      }
      if (var10.isEmpty()) {
         return;
      }
      this.ap().player.closeContainer();
      this.b(this.c(var10));
   }

   @SubscribeEvent
   public final void c(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      net.minecraft.network.protocol.Packet var3 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

      if (var3 instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket) {
         net.minecraft.network.protocol.game.ClientboundSystemChatPacket var5 =
               (net.minecraft.network.protocol.game.ClientboundSystemChatPacket) var3;

         if (!var5.overlay()) {
            String var4 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var5.content().getString());

            if (!var4.startsWith("[") && var4.contains(" Commission Complete!")) {
               new Thread(new Runnable() {
                  @Override
                  public void run() {
                     me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.j(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.this);
                  }
               }).start();
            }
         }
      }
   }

   private final boolean e(int param1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();

      if (!me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g()) {
         return true;
      }

      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(false);

      if (var3 == null) {
         return false;
      }

      if (!me.octo.client.lIIIllIIIlllIIIlIIllIIIllIlIIllIIlIIlIIIIlllllIIlIlIlIIIlIIIlIlllIllllIIIIIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().c("Claiming Commission")) {
         return false;
      }

      if (this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII == param1) {
         if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.K() != var3.b()) {
            me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var3.b());
            this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.f();
            this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
            return true;
         }

         if (this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.a((Number)Integer.valueOf(this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll)) && me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j()) {
            int var4 = this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
            this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = var4 + 1;
            this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.f();
            this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
         }

         return true;
      }

      if (this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII == param1 + 1) {
         return !this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.a((Number)Integer.valueOf(this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll));
      }

      return false;
   }

   private final void br() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      this.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
      IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll var2 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e();
      if (var1 != 0) {
        if (var2.d()) {
          return;
        }
        var2 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e();
      }
      var2.k();
   }

   private final void bs() {
        final int control = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
        final var initialState = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e();
        if (control != 0 || !initialState.d()) {
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().k();
        }
        try {
        final ClientLevel level = this.ap().level;
        if (level == null) {
            return;
        }
        if (control != 0) {
            return;
        }
        final ClientLevel clientLevel = level;
        final LocalPlayer player = this.ap().player;
        if (player != null) {
            final Vec3 a = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)player);
            if (a != null) {
                final Vec3 vec3 = a;
                final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
                if (liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl == null) {
                    return;
                }
                final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII = liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
                final Iterable iterable = illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII.c();
                final Collection collection = new ArrayList();
                for (final Object next : iterable) {
                    if (!this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.contains(next)) {
                        collection.add(next);
                    }
                }
                final Iterable iterable2 = collection;
                final Collection collection2 = new ArrayList();
                for (final Object next2 : iterable2) {
                    if (clientLevel.isLoaded((BlockPos)next2)) {
                        collection2.add(next2);
                    }
                }
                final List list = (List)collection2;
                this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.f();
                if (list.isEmpty()) {
                    if (this.W() == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
                        me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("No veins left");
                        this.a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, 5000);
                    }
                    else {
                        this.bt();
                    }
                }
                else {
                    final HashMap hashMap = new HashMap();
                    for (final BlockPos blockPos : (Iterable<BlockPos>) (Iterable) illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII.b()) {
                        final Map map = hashMap;
                        final IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl iiiiiiiiIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        final Vec3 center = blockPos.getCenter();
                        Intrinsics.checkNotNullExpressionValue((Object)center, "getCenter(...)");
                        map.put(blockPos, iiiiiiiiIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(center, vec3));
                    }
                    final ArrayList list2 = (ArrayList)CollectionsKt.toCollection((Iterable)CollectionsKt.sortedWith((Iterable)list, (Comparator)new IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII, vec3, hashMap)), (Collection)new ArrayList());
                    while (!((Collection) list2).isEmpty()) {
                        int n = 0;
                        final Iterable iterable3;
                        final Collection collection3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3 = new ArrayList(CollectionsKt.take(CollectionsKt.withIndex((Iterable)list2), 5)), 10));
                        for (final Object next3 : iterable3) {
                            final Collection collection4 = collection3;
                            final IndexedValue indexedValue = (IndexedValue)next3;
                            collection4.add(TuplesKt.to((Object)indexedValue, (Object)lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().g((BlockPos)indexedValue.getValue())));
                        }
                        final Iterable iterable4;
                        final Collection collection5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable4 = collection3, 10));
                        for (final Object next4 : iterable4) {
                            final Collection collection6 = collection5;
                            final Pair pair = (Pair)next4;
                            collection6.add(TuplesKt.to((Object)pair, (Object)lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().g((List)lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().h((List)pair.getSecond()))));
                        }
                        final Iterable iterable5 = collection5;
                        final Collection collection7 = new ArrayList();
                        for (final Object next5 : iterable5) {
                            final Pair pair2 = (Pair)next5;
                            if (pair2.getSecond() == null) {
                                this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.add((BlockPos)list2.remove(((IndexedValue)((Pair)pair2.getFirst()).getFirst()).getIndex()));
                                ++n;
                            }
                            if (pair2.getSecond() != null) {
                                collection7.add(next5);
                            }
                        }
                        final Iterator iterator7 = ((Iterable) collection7).iterator();
                        Object o;
                        if (!iterator7.hasNext()) {
                            o = null;
                        }
                        else {
                            Object next6 = iterator7.next();
                            if (!iterator7.hasNext()) {
                                o = next6;
                            }
                            else {
                                final Pair pair3 = (Pair)next6;
                                final me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI iiiIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                final Object second = pair3.getSecond();
                                Intrinsics.checkNotNull(second);
                                final List b = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.b(iiiIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, (BlockPos)second, false, 2, (Object)null);
                                int n2 = (b != null) ? b.size() : Integer.MAX_VALUE;
                                do {
                                    final Object next7 = iterator7.next();
                                    final Pair pair4 = (Pair)next7;
                                    final me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI iiiIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI2 = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                    final Object second2 = pair4.getSecond();
                                    Intrinsics.checkNotNull(second2);
                                    final List b2 = me.octo.client.utils.player.pathfinder.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.b(iiiIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI2, (BlockPos)second2, false, 2, (Object)null);
                                    final int n3 = (b2 != null) ? b2.size() : Integer.MAX_VALUE;
                                    if (n2 > n3) {
                                        next6 = next7;
                                        n2 = n3;
                                    }
                                } while (iterator7.hasNext());
                                o = next6;
                            }
                        }
                        final Pair pair5 = (Pair)o;
                        if (pair5 != null) {
                            this.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll);
                            final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl2 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
                            if (liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl2 != null) {
                                liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl2.b((BlockPos)((IndexedValue)((Pair)pair5.getFirst()).getFirst()).getValue());
                            }
                            final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl3 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
                            if (liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl3 != null) {
                                liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl3.a((BlockPos)pair5.getSecond());
                            }
                            final BlockPos blockPos2 = (BlockPos)pair5.getSecond();
                            final Vec3 vec4 = (blockPos2 != null) ? me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(blockPos2).add(0.0, 1.27, 0.0) : null;
                            IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl4;
                            final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII2 = liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl4 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
                            if (illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII2 != null) {
                                Vec3 vec7;
                                if (vec4 != null) {
                                    final Iterable iterable6 = (Iterable)((Pair)pair5.getFirst()).getSecond();
                                    final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII3 = illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII2;
                                    final Iterable iterable7 = iterable6;
                                    final Collection collection8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable6, 10));
                                    final Iterator iterator8 = iterable7.iterator();
                                    while (iterator8.hasNext()) {
                                        collection8.add(((BlockPos)iterator8.next()).getCenter());
                                    }
                                    final List list3 = (List)collection8;
                                    final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII4 = illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII3;
                                    final Iterable iterable8 = list3;
                                    final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII5 = illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII4;
                                    final Iterator iterator9 = iterable8.iterator();
                                    Object o2;
                                    if (!iterator9.hasNext()) {
                                        o2 = null;
                                    }
                                    else {
                                        Object next8 = iterator9.next();
                                        if (!iterator9.hasNext()) {
                                            o2 = next8;
                                        }
                                        else {
                                            final Vec3 vec5 = (Vec3)next8;
                                            final IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl iiiiiiiiIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl2 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                            Intrinsics.checkNotNull((Object)vec5);
                                            double b3 = iiiiiiiiIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl2.b(vec5, vec4);
                                            do {
                                                final Object next9 = iterator9.next();
                                                final Vec3 vec6 = (Vec3)next9;
                                                final IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl iiiiiiiiIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl3 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                                Intrinsics.checkNotNull((Object)vec6);
                                                final double b4 = iiiiiiiiIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl3.b(vec6, vec4);
                                                if (Double.compare(b3, b4) > 0) {
                                                    next8 = next9;
                                                    b3 = b4;
                                                }
                                            } while (iterator9.hasNext());
                                            o2 = next8;
                                        }
                                    }
                                    liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl4 = illIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII5;
                                    vec7 = (Vec3)o2;
                                }
                                else {
                                    vec7 = null;
                                }
                                liIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl4.a(vec7);
                            }
                            return;
                        }
                        while (n < 5 && list2.size() != 0) {
                            this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.add((BlockPos)list2.remove(0));
                            ++n;
                        }
                    }
                    this.bt();
                }
            }
        }
        } catch (NoSuchElementException exception) {
            throw a(exception);
        }
    }

   private final void bt() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      if (var1 == 0) {
         return;
      }
      net.minecraft.world.phys.Vec3 var2 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(this.ap().player);
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Start Area");
      this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl);
      java.util.List var4 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.b();
      java.util.Iterator var5 = var4.iterator();
      net.minecraft.core.BlockPos var7 = (net.minecraft.core.BlockPos) var5.next();
      double var8 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var7.getCenter(), var2);
      while (var5.hasNext()) {
         net.minecraft.core.BlockPos var10 = (net.minecraft.core.BlockPos) var5.next();
         double var11 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var10.getCenter(), var2);
         if (java.lang.Double.compare(var8, var11) > 0) {
            var7 = var10;
            var8 = var11;
         }
      }
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl.a(var7);
   }

   private final void b(IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII param1) {
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = param1;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(param1.a());
      me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().V().clear();
      String var3 = param1.a();
      if (var3.contains("Umber")) {
         me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().V().add(me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      } else if (var3.contains("Tungsten")) {
         me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().V().add(me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      } else if (var3.contains("Gemstone")) {
         me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().V().add(me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      } else if (var3.contains("Glacite")) {
         me.octo.client.lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().V().add(me.octo.client.IlIIllIlIllIlIlllIIIIIllIIlIlllIlIIlllllIlIlIIlIIllIIIIIIlIlllIlIlIllIIlIlIlIlIlIIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.clear();
      this.bs();
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2 = var1.b();
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
               (kotlin.jvm.functions.Function2)(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll::a),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll::k),
               120,
               null
            )
         );
   }

   private final void bu() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = false;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = false;
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = false;
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = 0;
      if (var1 == 0) {
        LocalPlayer var2 = this.ap().player;
        if (var2 != null) {
          var2.clientSideCloseContainer();
        }
      }
      this.aO();
   }

   private final void b(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1
   ) {
      this.bu();
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII var3 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      if (var3 != null && lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll.contains(param1)) {
        this.b(var3);
        if (var2 != 0) {
          return;
        }
      }
      this.ba();
   }

   private final IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll bv() {
      IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII var1 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;

      IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10000;
      IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10001;
      String var10002 = null; // PX-FIX: init（乱序赋值，Phase A 还原原序）
      label32: {
         try {
            var10000 = new IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
               var10002,
                        var1 != null ? var1.e() : null,
                        var1 != null ? var1.f() : null,
                        var1 != null ? var1.g() : null,
                        this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.size(),
                        IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .g(),
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(this, 0.0, 1, null)); // PX-FIX
            var10001 = var10000;
            if (var1 != null) {
               var10002 = var1.a();
               break label32;
            }
         } catch (NoSuchElementException var2) {
            throw (RuntimeException)a(var2);
         }

         var10002 = null;
      }

      return var10000;
   }

   private final int bw() {
      return IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .n()
         + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .o()
         + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p()
         + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .m();
   }

   private final void bx() {
      PolinexRoyalPigeonRecovery.ensureRoyalPigeonHotbar();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI
      );
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = false;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = false;
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = 0;
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = false;
      this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
      this.by();
   }

   private final void by() {
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
   }

   private final IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII c(
      List<IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII> var1
   ) {
      return (IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII)CollectionsKt.first(var1);
   }

   private final Integer b(llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1) {
      List var3 = param1.m();
      if (var3 == null) {
         var3 = CollectionsKt.emptyList();
      }
      List var4 = CollectionsKt.take((Iterable)var3, 27);
      boolean var5 = false;
      for (Object var6 : var4) {
         Slot var8 = (Slot)var6;
         if (var8.getItem().isEmpty()) {
            var5 = true;
            break;
         }
      }
      if (var5) {
         return null;
      }
      for (int var9 = 9; var9 < 17; var9++) {
         Slot var7 = (Slot)var3.get(var9);
         List var10 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var7.getItem());
         for (Object var11 : var10) {
            Component var12 = (Component)var11;
            if (kotlin.text.StringsKt.contains(IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var12.getString()), "COMPLETED", false)) {
               return var7.index;
            }
         }
      }
      return null;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()I
      // 003: istore 2
      // 004: iload 2
      // 005: ifne 01f
      // 008: aload 1
      // 009: invokevirtual me/octo/client/events/impl/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.m ()Ljava/util/List;
      // 00c: dup
      // 00d: ifnonnull 022
      // 010: goto 017
      // 013: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 016: athrow
      // 017: pop
      // 018: goto 01f
      // 01b: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 01e: athrow
      // 01f: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
      // 022: astore 3
      // 023: aload 3
      // 024: checkcast java/lang/Iterable
      // 027: bipush 27
      // 029: invokestatic kotlin/collections/CollectionsKt.take (Ljava/lang/Iterable;I)Ljava/util/List;
      // 02c: checkcast java/lang/Iterable
      // 02f: astore 4
      // 031: bipush 0
      // 032: istore 5
      // 034: aload 4
      // 036: iload 2
      // 037: ifne 070
      // 03a: instanceof java/util/Collection
      // 03d: ifeq 06e
      // 040: goto 047
      // 043: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 046: athrow
      // 047: aload 4
      // 049: checkcast java/util/Collection
      // 04c: iload 2
      // 04d: ifne 070
      // 050: goto 057
      // 053: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 056: athrow
      // 057: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 05c: ifeq 06e
      // 05f: goto 066
      // 062: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 065: athrow
      // 066: bipush 0
      // 067: goto 0a8
      // 06a: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 06d: athrow
      // 06e: aload 4
      // 070: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 075: astore 6
      // 077: aload 6
      // 079: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07e: ifeq 0a7
      // 081: aload 6
      // 083: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 088: astore 7
      // 08a: aload 7
      // 08c: checkcast net/minecraft/world/inventory/Slot
      // 08f: astore 8
      // 091: bipush 0
      // 092: istore 9
      // 094: aload 8
      // 096: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 099: invokevirtual net/minecraft/world/item/ItemStack.isEmpty ()Z
      // 09c: ifeq 077
      // 09f: bipush 1
      // 0a0: iload 2
      // 0a1: ifne 09c
      // 0a4: goto 0a8
      // 0a7: bipush 0
      // 0a8: ifeq 0b1
      // 0ab: aconst_null
      // 0ac: areturn
      // 0ad: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0b0: athrow
      // 0b1: bipush 9
      // 0b3: istore 4
      // 0b5: iload 4
      // 0b7: bipush 17
      // 0b9: if_icmpge 1a2
      // 0bc: aload 3
      // 0bd: iload 4
      // 0bf: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0c4: checkcast net/minecraft/world/inventory/Slot
      // 0c7: astore 5
      // 0c9: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 0cc: aload 5
      // 0ce: invokevirtual net/minecraft/world/inventory/Slot.getItem ()Lnet/minecraft/world/item/ItemStack;
      // 0d1: dup
      // 0d2: sipush 13958
      // 0d5: sipush -22082
      // 0d8: pop2
      // 0d9: ldc_w "getItem(...)"
      // 0dc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0df: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 0e2: astore 6
      // 0e4: aload 6
      // 0e6: checkcast java/lang/Iterable
      // 0e9: astore 7
      // 0eb: bipush 0
      // 0ec: istore 8
      // 0ee: aload 7
      // 0f0: iload 2
      // 0f1: ifne 12a
      // 0f4: instanceof java/util/Collection
      // 0f7: ifeq 128
      // 0fa: goto 101
      // 0fd: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 100: athrow
      // 101: aload 7
      // 103: checkcast java/util/Collection
      // 106: iload 2
      // 107: ifne 12a
      // 10a: goto 111
      // 10d: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 110: athrow
      // 111: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 116: ifeq 128
      // 119: goto 120
      // 11c: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 11f: athrow
      // 120: bipush 0
      // 121: goto 18b
      // 124: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 127: athrow
      // 128: aload 7
      // 12a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 12f: astore 9
      // 131: aload 9
      // 133: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 138: ifeq 18a
      // 13b: aload 9
      // 13d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 142: astore 10
      // 144: aload 10
      // 146: checkcast net/minecraft/network/chat/Component
      // 149: astore 11
      // 14b: bipush 0
      // 14c: istore 12
      // 14e: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 151: aload 11
      // 153: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 158: dup
      // 159: sipush 13968
      // 15c: sipush -15618
      // 15f: pop2
      // 160: ldc_w "getString(...)"
      // 163: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 166: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 169: checkcast java/lang/CharSequence
      // 16c: sipush 13981
      // 16f: sipush 9754
      // 172: pop2
      // 173: ldc_w "COMPLETED"
      // 176: checkcast java/lang/CharSequence
      // 179: bipush 0
      // 17a: bipush 2
      // 17b: aconst_null
      // 17c: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 17f: ifeq 131
      // 182: bipush 1
      // 183: iload 2
      // 184: ifne 17f
      // 187: goto 18b
      // 18a: bipush 0
      // 18b: ifeq 19b
      // 18e: aload 5
      // 190: getfield net/minecraft/world/inventory/Slot.index I
      // 193: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 196: areturn
      // 197: invokestatic me/octo/client/IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 19a: athrow
      // 19b: iinc 4 1
      // 19e: iload 2
      // 19f: ifeq 0b5
      // 1a2: aconst_null
      // 1a3: areturn
   }

   private final List<IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII> c(
      llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI param1
   ) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      java.util.List var3 = var2 != 0 ? param1.m() : null;
      if (var3 == null) {
         var3 = kotlin.collections.CollectionsKt.emptyList();
      }
      java.util.List var4 = kotlin.collections.CollectionsKt.take((java.lang.Iterable)var3, 27);
      boolean var5 = false;
      if (!((java.util.Collection)var4).isEmpty()) {
         java.util.Iterator var6 = ((java.lang.Iterable)var4).iterator();
         while (var6.hasNext()) {
            net.minecraft.world.inventory.Slot var7 = (net.minecraft.world.inventory.Slot)var6.next();
            if (var7.getItem().isEmpty()) {
               var5 = true;
               break;
            }
         }
      }
      if (var5) {
         return null;
      }
      java.util.ArrayList var8 = new java.util.ArrayList();
      for (int var9 = 9; var9 < 17; var9++) {
         if (var9 >= var3.size()) {
            continue;
         }
         net.minecraft.world.inventory.Slot var10 = (net.minecraft.world.inventory.Slot)var3.get(var9);
         if (var2 == 0) {
            continue;
         }
         net.minecraft.world.item.ItemStack var11 = var10.getItem();
         if (var11 == null) {
            continue;
         }
         java.util.List var12 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var11);
         boolean var13 = false;
         if (!((java.util.Collection)var12).isEmpty()) {
            java.util.Iterator var14 = ((java.lang.Iterable)var12).iterator();
            while (var14.hasNext()) {
               net.minecraft.network.chat.Component var15 = (net.minecraft.network.chat.Component)var14.next();
               me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var16 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               java.lang.String var17 = var15.getString();
               kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var17, "getString(...)");
               if (kotlin.text.StringsKt.contains((java.lang.CharSequence)var16.a(var17), (java.lang.CharSequence)"COMPLETED", false)) {
                  var13 = true;
                  break;
               }
            }
         }
         if (var13) {
            continue;
         }
         if (var12.size() < 5) {
            continue;
         }
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var18 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         net.minecraft.network.chat.Component var19 = (net.minecraft.network.chat.Component)var12.get(4);
         java.lang.String var20 = var19.getString();
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var20, "getString(...)");
         java.lang.String var21 = var18.a(var20);
         if (var2 != 0) {
            me.octo.client.utils.IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII var22 = this.bp().get(var21);
            if (var22 != null) {
               var8.add(var22);
            }
         }
      }
      return kotlin.collections.CollectionsKt.toList((java.lang.Iterable)var8);
   }

   private final List<IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII> bz() { short var10003 = (short)0; // PX-FIX hoist
        
      Object var22 = null; // PX-FIX
      Object var21 = null; // PX-FIX
      Object var19 = null; // PX-FIX
      int var10000 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      ArrayList var2 = new ArrayList();
      int var1 = var10000;
      List var3 = lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
      Iterator var4 = var3.iterator();

      while (true) {
         boolean var16 = var4.hasNext();

         String var5;
         do {
            if (!var16) {
               return CollectionsKt.toList(var2);
            }

            var5 = (String)var4.next();
            CharSequence var17 = var5;
            short var10001 = 14003;
            short var10002 = -20455;
            var16 = StringsKt.contains(var17, "DONE", false);
         } while (var1 == 0);

         if (!var16) {
            Set var18 = this.bp().keySet();
            short var23 = 13952;
             var10003 = 12054;
            Intrinsics.checkNotNullExpressionValue(var18, "<get-keys>(...)");
            Iterable var7 = var18;
            Iterator var8 = var7.iterator();

            label61:
            while (true) {
               if (var8.hasNext()) {
                  Object var9 = var8.next();
                  var19 = var9;

                  while (true) {
                     String var10 = (String)var19;
                     boolean var11 = false;
                     CharSequence var20 = var5;
                     Intrinsics.checkNotNull(var10);
                     if (!StringsKt.contains(var20, var10, false)) {
                        continue label61;
                     }

                     var19 = var9;
                     if (var1 != 0) {
                        break label61;
                     }
                  }
               }

               var19 = null;
               break;
            }

            try {
               var21 = (String)var19;
               if ((String)var19 == null) {
                  continue;
               }
            } catch (NoSuchElementException var13) {
               throw (RuntimeException)a(var13);
            }

            String var6 =((String)( var21));

            label73: {
               try {
                  if (var1 != 0) {
                     var22 = this.bp().get(var6);
                     if (var22 != null) {
                        break label73;
                     }
                  }
               } catch (NoSuchElementException var12) {
                  throw (RuntimeException)a(var12);
               }

               if (var1 == 0) {
                  return CollectionsKt.toList(var2);
               }
               continue;
            }

            IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII var14 =((IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII)( var22));
            boolean var15 = false;
            var2.add(var14);
         }
      }
   }

   @Override
   public void ba() {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      if (var1 != 0) {
         if (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
            this.a(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl, 1000);
         }
         return;
      }
      List var2 = this.bz();
      this.b(this.c(var2));
   }

   @Override
   public void M() {
        block16: {
            boolean bl;
            boolean bl2;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            int n;
            block14: {
                boolean bl6;
                block15: {
                    n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
                    IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll iIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll = this;
                    if (n != 0) {
                        if (!IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI.a((IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)((IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)iIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll), (boolean)false, (int)1, null)) {
                            this.N();
                            return;
                        }
                        iIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll = this;
                    }
                    iIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.aM();
                    bl6 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != null;
                    bl5 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q() != null;
                    bl4 = this.X() != null;
                    bl3 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t() != null;
                    bl2 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                    bl = bl6;
                    if (n == 0) break block14;
                    if (!bl) break block15;
                    bl = bl5;
                    if (n == 0) break block14;
                    if (!bl) break block15;
                    bl = bl4;
                    if (n == 0) break block14;
                    if (!bl) break block15;
                    bl = bl3;
                    if (n == 0) break block14;
                    if (!bl) break block15;
                    bl = bl2;
                    if (n == 0) break block14;
                    if (bl) break block16;
                }
                bl = bl6;
            }
            if (n != 0) {
                if (!bl) {
                    this.bg();
                }
                bl = bl5;
            }
            if (n != 0) {
                if (!bl) {
                    this.c(4);
                }
                bl = bl4;
            }
            if (n != 0) {
                if (!bl) {
                    this.aP();
                }
                bl = bl3;
            }
            if (n != 0) {
                if (!bl) {
                    this.bb();
                }
                bl = bl2;
            }
            if (!bl) {
                this.b(CollectionsKt.listOf(IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl));
            }
            this.N();
            return;
        }
        super.M();
        llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] objectArray = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, () -> IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.l(this), true), new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll::bB, false), new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll::bC, false), new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll::bD, false), new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, () -> IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.m(this), false)};
        this.a(CollectionsKt.listOf(objectArray));
        this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.clear();
        this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = false;
        this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = false;
        this.ba();
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
      } catch (NoSuchElementException var1) {
         throw (RuntimeException)a(var1);
      }

      return false;
   }

   @Override
   public void O() {
      short var10001 = 13954;
      short var10002 = 17470;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Commission Info");
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(0, 750);
      var10001 = 14002;
      var10002 = -9047;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Mining Info");
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.b(
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         1,
         false);
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .c(1);
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h(1);
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .d(1);
   }

   private static final long a(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();

      Integer var3 = null; // PX-FIX: init（乱序赋值）
      String var5 = null;
      int var10005 = 0;
      boolean var10006 = false;
      IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
      IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001;
      Triple var10003 = null; // PX-FIX: init（乱序赋值）
      int var10004 = 0; // PX-FIX: init（乱序赋值）
      label27: {
         try {
            var10000 = new IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
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
         } catch (NoSuchElementException var2) {
            throw (RuntimeException)a(var2);
         }

         var3 = null;
      }

      label20: {
         var10003 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null);
         var10004 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .K();
         var10005 = var0.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
         var10006 = var0.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
         Screen var10007 = var0.ap().screen;
         if (var10007 != null) {
            Component var4 = var10007.getTitle();
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

   private static final boolean d(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();

      try {
         if (var1 == 0) {
            return var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
         }

         if (!var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll) {
            return true;
         }
      } catch (NoSuchElementException var2) {
         throw (RuntimeException)a(var2);
      }

      return false;
   }

   private static final Object e(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) {
      return var0.bv();
   }

   private static final boolean f(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();

      try {
         if (var1 == 0) {
            return var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
         }

         if (!var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll) {
            return true;
         }
      } catch (NoSuchElementException var2) {
         throw (RuntimeException)a(var2);
      }

      return false;
   }

   private static final Object g(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) {
      return var0.bv();
   }

   private static final boolean h(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();

      try {
         if (var1 == 0) {
            return var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
         }

         if (!var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll) {
            return true;
         }
      } catch (NoSuchElementException var2) {
         throw (RuntimeException)a(var2);
      }

      return false;
   }

   private static final Object i(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) {
      me.octo.client.utils.IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII var10008;
      try {
         return new IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var0.bw(),
            IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.y(),
            var0.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll,
            lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().b(),
            lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.e().c(),
            (var10008 = var0.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl) == null ? null : var10008.f()
         );
      } catch (NoSuchElementException var1) {
         throw (RuntimeException)a(var1);
      }
   }

   private static final Object bA() {
      return IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .y();
   }

   @SuppressWarnings("unchecked")
   private static <T extends Throwable> void sneakyThrow(Throwable throwable) throws T {
      throw (T)throwable;
   }

   private static final void j(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) { Object var5 = null; // PX-FIX hoist
        
       var5 = null; // PX-FIX
      Object var4 = null; // PX-FIX
      int var10000 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      try {
      Thread.sleep(
         IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f()
      );
      }
      catch (InterruptedException interruptedException) {
         sneakyThrow(interruptedException);
      }
      int var1 = var10000;

      label37: {
         label32: {
            try {
               var4 = var0.G();
               if (var1 != 0) {
                  break label32;
               }

               if (!(me.octo.client.PxTruth.truth(var4))) {
                  return;
               }
            } catch (NoSuchElementException var3) {
               throw (RuntimeException)a(var3);
            }

            try {
               var0.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = true;
               var0.aO();
               try {
               Thread.sleep(
                  IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .g()
               );
               }
               catch (InterruptedException interruptedException) {
                  sneakyThrow(interruptedException);
               }
               var5 = var0;
               if (var1 != 0) {
                  break label37;
               }

               var4 = var0.G();
            } catch (NoSuchElementException var2) {
               throw (RuntimeException)a(var2);
            }
         }

         if (!(me.octo.client.PxTruth.truth(var4))) {
            return;
         }

         var5 = var0;
      }

      var0.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = true;
   }

   private static final Unit a(
      IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0,
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      var0.b(var1);
      return Unit.INSTANCE;
   }

   private static final Unit k(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0) {
      var0.bu();
      return Unit.INSTANCE;
   }

   private static final boolean l(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll param0) {
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
                        catch (NoSuchElementException noSuchElementException) {
                            throw IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a(noSuchElementException);
                        }
                        bl = lllIIIIIIlllllIIIllIIllIIllIlIIIlIllIlllIIlIllIIlIlIlllIIIIIIIlIlIlIIlIlIlIllllIIIIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.b();
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a(noSuchElementException);
                    }
                }
                try {
                    if (n != 0) break block8;
                    if (!bl) break block7;
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a(noSuchElementException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
   }

   private static final boolean bB() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean bC() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean bD() {
      return IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final boolean m(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll param0) {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
                    try {
                        try {
                            bl = param0.af();
                            if (n == 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            throw IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a(noSuchElementException);
                        }
                        bl = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.b();
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a(noSuchElementException);
                    }
                }
                try {
                    if (n == 0) break block8;
                    if (!bl) break block7;
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.a(noSuchElementException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { String[] var5 = null; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
        
      char[] var22 = null; // PX-FIX
   pxClinit: {
       var5 = new String[50];
      int var3 = 0;
      String var2 = "ã\u0016Ø\u0007\u0007ì:Õþwx\u0010\u009c6í%²KY\t\u0083OöØÛ×\u001a\u0005Î\u0004\u001c\u009c\u008fI¹\u0090úµ¡%\u0000ÚãT\u0093\u0085\u0012\u0018,\u0085´µZ\u00052Xf¸5-àjÖÚ2g\u0095ª?0ü\tÚ\u0088\u0018¦¸Å!µ\u0093ß\u0002=A4C_Ça<\u0087Aó\u0015µ|§»\u0000å\u0080\u0099®p\u0013uÏÝ\u0010|\u00adÏùÔX\u0096b` L\u008d\u0006\u0011F\u001dsûþ$-\u008fQ?|Ji\u0083Kô9.Ù4\u0098\"ßå¸Þö\u001dD\u0085ê\u000eFÞ»$½èb¥k³\u00ad1W¢\u001dºé\u0015ÚÂ\u0007?ÐIÝ.\u0010K÷´\u008eh\u009eë!z\u001fì\u000b)nK}=\u0017\u0089Âbæ~ËÈQ§\u0012ã\u0092¼\u0097÷½5<f\"7Îj\u0013a\u0081êÝ9±Ïÿ~»áuôAÇ\u001b\u0000tn\rMý\u0082.U3K»î\u008aù\u0092¥\tF\u0010\"\u0091¨\nÂ\u0003Æ\u0019Uþè8}[È[·¬ñ>°2Ë6\u0087\u0089\u0016ØÉ_\u0010ªD\u000bÚ\u0098\u0091\u0099ß§\u008aj'ëp\u000e\u0087l\u0083rº\"\u0082üw\u0098.T'\u000e\u001dÇ´ºq7r\u0081~\u009e\bÔª\u0014 _d\u0015ÃD\u009d\u0098qJK\u0013f\f|Õ\f\u00054Óc°NÇÂ\u0012×â|\u0005¼ä·/\u000f\u0011ª¬\u0017r\u0082\u00127rh\u0089/\u009bF·\u009f\u0092÷\u001d\u0083Ýààî\u0017),s(\u0088Ïw}¾\u001f)\u0012\u0086æ\u001c}ÀÍù\u007f¥ÉÖ\u000f[;¡íÙ)J»?Ñ \u0094iÒ\u000b\u000fÊ·H6\u0011\b\u001b  vå\b&'¦\u000f§Ã¦âtê%È\u001aý\u0013,F\u0006à\u0018\u0017ò ¹tké]³lU&$1YVÕ\u0085\\y\u0088B*¤\u0012\u0084D¬Q\u0001ò\u001e .hë\u000e´\u0003þÙ3Ö\u001a\u0004ÔSÉ½LÐà\u0090ÑµÄ%¬ÚvT!\u0085D\u0018æ\u0085íµq\u0016³§±×\u009dtFS¸\u0094XtÌ\u00835\u0086\u0086®\u0001^½È\t|\u0016eQ@\u0012ß\u0000e\u0017C\u0001;\u009eUÄ\u00ad°\u000b.v\u0015\u000eg¡£ÿÿ?Z\u001cÁ\u000f\u0019\u0089\u009es4\u000eÚ¦kzªHþ\u0087*-5[é\u008dÉºÊr1\u008c\u001dá§~\u0013¯>\u0092÷ü9\u0098\u008c\u009ddnü3Ð\u0080ý\u001d7UÆÔ\t\u001dòc\u000fS\u0083(\u0097e®ËåàaÉÝØ2K\u000f\u0099ïÞn]yÎè\u0010²ì·¹u\u001f\u0019~\u0099\u008dÔÑÆ]è\u0005Ú§ðzë\u0092\r¬îs-~Ô\u0081>\u0081\u000f\u001d\u009d²sN ðµ]ÔJ\\Ó\u00ad\u0018\u0012\b7=?3?X\u0099æ_òè\u0097ß\u009aB¿¥\u000b\u007fPéB´LS¡$¾-\u0004\\è\u0085\u009b\u0011è\u0010_å\u008bà\u0016,LB«âÖ\u0098\u008dwµ\u0006¸7¢\u0018\u0089\u0002\n\u0010`Öá§\u0007\t\\)Z\u000eÀ\u000e\u001e\u0089J5\u008c\u0086Ó\\]â\u0019'\u000e$»÷\u0098%q_\u0002g-\u009bâ\u0091Ø\u001aëÙ®h\u0002x'fn\u0001jÞÞï¥\u001e»,xå§ÒrkK¡\u0006ô\u0016+<¸\u0086\u00057\f÷Aæ\u0007´~Ô(úY8\u000erÈ=ö|¼t»\u0002\u001a7\u0004\u0004\u0004";
      int var4 = "ã\u0016Ø\u0007\u0007ì:Õþwx\u0010\u009c6í%²KY\t\u0083OöØÛ×\u001a\u0005Î\u0004\u001c\u009c\u008fI¹\u0090úµ¡%\u0000ÚãT\u0093\u0085\u0012\u0018,\u0085´µZ\u00052Xf¸5-àjÖÚ2g\u0095ª?0ü\tÚ\u0088\u0018¦¸Å!µ\u0093ß\u0002=A4C_Ça<\u0087Aó\u0015µ|§»\u0000å\u0080\u0099®p\u0013uÏÝ\u0010|\u00adÏùÔX\u0096b` L\u008d\u0006\u0011F\u001dsûþ$-\u008fQ?|Ji\u0083Kô9.Ù4\u0098\"ßå¸Þö\u001dD\u0085ê\u000eFÞ»$½èb¥k³\u00ad1W¢\u001dºé\u0015ÚÂ\u0007?ÐIÝ.\u0010K÷´\u008eh\u009eë!z\u001fì\u000b)nK}=\u0017\u0089Âbæ~ËÈQ§\u0012ã\u0092¼\u0097÷½5<f\"7Îj\u0013a\u0081êÝ9±Ïÿ~»áuôAÇ\u001b\u0000tn\rMý\u0082.U3K»î\u008aù\u0092¥\tF\u0010\"\u0091¨\nÂ\u0003Æ\u0019Uþè8}[È[·¬ñ>°2Ë6\u0087\u0089\u0016ØÉ_\u0010ªD\u000bÚ\u0098\u0091\u0099ß§\u008aj'ëp\u000e\u0087l\u0083rº\"\u0082üw\u0098.T'\u000e\u001dÇ´ºq7r\u0081~\u009e\bÔª\u0014 _d\u0015ÃD\u009d\u0098qJK\u0013f\f|Õ\f\u00054Óc°NÇÂ\u0012×â|\u0005¼ä·/\u000f\u0011ª¬\u0017r\u0082\u00127rh\u0089/\u009bF·\u009f\u0092÷\u001d\u0083Ýààî\u0017),s(\u0088Ïw}¾\u001f)\u0012\u0086æ\u001c}ÀÍù\u007f¥ÉÖ\u000f[;¡íÙ)J»?Ñ \u0094iÒ\u000b\u000fÊ·H6\u0011\b\u001b  vå\b&'¦\u000f§Ã¦âtê%È\u001aý\u0013,F\u0006à\u0018\u0017ò ¹tké]³lU&$1YVÕ\u0085\\y\u0088B*¤\u0012\u0084D¬Q\u0001ò\u001e .hë\u000e´\u0003þÙ3Ö\u001a\u0004ÔSÉ½LÐà\u0090ÑµÄ%¬ÚvT!\u0085D\u0018æ\u0085íµq\u0016³§±×\u009dtFS¸\u0094XtÌ\u00835\u0086\u0086®\u0001^½È\t|\u0016eQ@\u0012ß\u0000e\u0017C\u0001;\u009eUÄ\u00ad°\u000b.v\u0015\u000eg¡£ÿÿ?Z\u001cÁ\u000f\u0019\u0089\u009es4\u000eÚ¦kzªHþ\u0087*-5[é\u008dÉºÊr1\u008c\u001dá§~\u0013¯>\u0092÷ü9\u0098\u008c\u009ddnü3Ð\u0080ý\u001d7UÆÔ\t\u001dòc\u000fS\u0083(\u0097e®ËåàaÉÝØ2K\u000f\u0099ïÞn]yÎè\u0010²ì·¹u\u001f\u0019~\u0099\u008dÔÑÆ]è\u0005Ú§ðzë\u0092\r¬îs-~Ô\u0081>\u0081\u000f\u001d\u009d²sN ðµ]ÔJ\\Ó\u00ad\u0018\u0012\b7=?3?X\u0099æ_òè\u0097ß\u009aB¿¥\u000b\u007fPéB´LS¡$¾-\u0004\\è\u0085\u009b\u0011è\u0010_å\u008bà\u0016,LB«âÖ\u0098\u008dwµ\u0006¸7¢\u0018\u0089\u0002\n\u0010`Öá§\u0007\t\\)Z\u000eÀ\u000e\u001e\u0089J5\u008c\u0086Ó\\]â\u0019'\u000e$»÷\u0098%q_\u0002g-\u009bâ\u0091Ø\u001aëÙ®h\u0002x'fn\u0001jÞÞï¥\u001e»,xå§ÒrkK¡\u0006ô\u0016+<¸\u0086\u00057\f÷Aæ\u0007´~Ô(úY8\u000erÈ=ö|¼t»\u0002\u001a7\u0004\u0004\u0004"
         .length();
      char var1 = 26;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 120;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
                var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var22 = var26;
               int var16 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 87;
                     case 1 -> 17;
                     case 2 -> 17;
                     case 3 -> 48;
                     case 4 -> 17;
                     case 5 -> 86;
                     default -> 19;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var16 <= var6) {
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
                  if ((var9 += var1) >= var4) {
                     j = var5;
                     k = new String[50];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (Object) null
                     );
                     IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = new IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll();
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var7 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                     };
                     lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = SetsKt.setOf(var7);
                     var7 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                     };
                     IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = SetsKt.setOf(var7);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "pçL[cÍ,¹\bô¾®v[åÇÏ";
                  var4 = "pçL[cÍ,¹\bô¾®v[åÇÏ".length();
                  var1 = '\b';
                  var9 = -1;
            }

            var10000 = 8;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }

   private static String e(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
      int var2 = (var0 ^ 13974) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 156;
            case 1 -> 100;
            case 2 -> 236;
            case 3 -> 163;
            case 4 -> 248;
            case 5 -> 203;
            case 6 -> 162;
            case 7 -> 169;
            case 8 -> 89;
            case 9 -> 250;
            case 10 -> 222;
            case 11 -> 9;
            case 12 -> 22;
            case 13 -> 118;
            case 14 -> 120;
            case 15 -> 77;
            case 16 -> 87;
            case 17 -> 206;
            case 18 -> 219;
            case 19 -> 13;
            case 20 -> 16;
            case 21 -> 197;
            case 22 -> 177;
            case 23 -> 50;
            case 24 -> 234;
            case 25 -> 161;
            case 26 -> 122;
            case 27 -> 86;
            case 28 -> 134;
            case 29 -> 249;
            case 30 -> 58;
            case 31 -> 46;
            case 32 -> 44;
            case 33 -> 143;
            case 34 -> 108;
            case 35 -> 166;
            case 36 -> 107;
            case 37 -> 18;
            case 38 -> 193;
            case 39 -> 5;
            case 40 -> 63;
            case 41 -> 1;
            case 42 -> 113;
            case 43 -> 181;
            case 44 -> 52;
            case 45 -> 198;
            case 46 -> 80;
            case 47 -> 223;
            case 48 -> 102;
            case 49 -> 12;
            case 50 -> 73;
            case 51 -> 105;
            case 52 -> 23;
            case 53 -> 186;
            case 54 -> 37;
            case 55 -> 141;
            case 56 -> 184;
            case 57 -> 91;
            case 58 -> 101;
            case 59 -> 33;
            case 60 -> 178;
            case 61 -> 176;
            case 62 -> 225;
            case 63 -> 95;
            case 64 -> 106;
            case 65 -> 26;
            case 66 -> 151;
            case 67 -> 182;
            case 68 -> 14;
            case 69 -> 27;
            case 70 -> 137;
            case 71 -> 0;
            case 72 -> 212;
            case 73 -> 82;
            case 74 -> 155;
            case 75 -> 97;
            case 76 -> 149;
            case 77 -> 220;
            case 78 -> 4;
            case 79 -> 196;
            case 80 -> 140;
            case 81 -> 117;
            case 82 -> 54;
            case 83 -> 114;
            case 84 -> 116;
            case 85 -> 67;
            case 86 -> 201;
            case 87 -> 242;
            case 88 -> 218;
            case 89 -> 125;
            case 90 -> 76;
            case 91 -> 159;
            case 92 -> 255;
            case 93 -> 17;
            case 94 -> 119;
            case 95 -> 170;
            case 96 -> 78;
            case 97 -> 30;
            case 98 -> 158;
            case 99 -> 42;
            case 100 -> 2;
            case 101 -> 111;
            case 102 -> 123;
            case 103 -> 128;
            case 104 -> 81;
            case 105 -> 240;
            case 106 -> 245;
            case 107 -> 214;
            case 108 -> 194;
            case 109 -> 200;
            case 110 -> 172;
            case 111 -> 205;
            case 112 -> 49;
            case 113 -> 131;
            case 114 -> 209;
            case 115 -> 226;
            case 116 -> 7;
            case 117 -> 227;
            case 118 -> 243;
            case 119 -> 6;
            case 120 -> 185;
            case 121 -> 74;
            case 122 -> 85;
            case 123 -> 235;
            case 124 -> 99;
            case 125 -> 224;
            case 126 -> 68;
            case 127 -> 217;
            case 128 -> 41;
            case 129 -> 62;
            case 130 -> 231;
            case 131 -> 195;
            case 132 -> 239;
            case 133 -> 164;
            case 134 -> 150;
            case 135 -> 47;
            case 136 -> 98;
            case 137 -> 15;
            case 138 -> 70;
            case 139 -> 232;
            case 140 -> 179;
            case 141 -> 31;
            case 142 -> 65;
            case 143 -> 124;
            case 144 -> 142;
            case 145 -> 79;
            case 146 -> 45;
            case 147 -> 252;
            case 148 -> 19;
            case 149 -> 72;
            case 150 -> 180;
            case 151 -> 139;
            case 152 -> 145;
            case 153 -> 187;
            case 154 -> 241;
            case 155 -> 175;
            case 156 -> 199;
            case 157 -> 57;
            case 158 -> 213;
            case 159 -> 230;
            case 160 -> 188;
            case 161 -> 38;
            case 162 -> 51;
            case 163 -> 53;
            case 164 -> 75;
            case 165 -> 121;
            case 166 -> 152;
            case 167 -> 167;
            case 168 -> 216;
            case 169 -> 133;
            case 170 -> 40;
            case 171 -> 148;
            case 172 -> 71;
            case 173 -> 144;
            case 174 -> 104;
            case 175 -> 88;
            case 176 -> 90;
            case 177 -> 93;
            case 178 -> 36;
            case 179 -> 112;
            case 180 -> 173;
            case 181 -> 84;
            case 182 -> 246;
            case 183 -> 202;
            case 184 -> 238;
            case 185 -> 130;
            case 186 -> 171;
            case 187 -> 228;
            case 188 -> 147;
            case 189 -> 66;
            case 190 -> 127;
            case 191 -> 135;
            case 192 -> 69;
            case 193 -> 146;
            case 194 -> 183;
            case 195 -> 168;
            case 196 -> 129;
            case 197 -> 28;
            case 198 -> 64;
            case 199 -> 208;
            case 200 -> 126;
            case 201 -> 210;
            case 202 -> 3;
            case 203 -> 251;
            case 204 -> 190;
            case 205 -> 115;
            case 206 -> 157;
            case 207 -> 207;
            case 208 -> 192;
            case 209 -> 56;
            case 210 -> 61;
            case 211 -> 59;
            case 212 -> 233;
            case 213 -> 48;
            case 214 -> 32;
            case 215 -> 174;
            case 216 -> 132;
            case 217 -> 92;
            case 218 -> 165;
            case 219 -> 244;
            case 220 -> 103;
            case 221 -> 247;
            case 222 -> 8;
            case 223 -> 138;
            case 224 -> 20;
            case 225 -> 237;
            case 226 -> 136;
            case 227 -> 94;
            case 228 -> 215;
            case 229 -> 43;
            case 230 -> 96;
            case 231 -> 221;
            case 232 -> 29;
            case 233 -> 60;
            case 234 -> 24;
            case 235 -> 204;
            case 236 -> 10;
            case 237 -> 55;
            case 238 -> 153;
            case 239 -> 83;
            case 240 -> 39;
            case 241 -> 229;
            case 242 -> 11;
            case 243 -> 191;
            case 244 -> 21;
            case 245 -> 160;
            case 246 -> 25;
            case 247 -> 254;
            case 248 -> 110;
            case 249 -> 35;
            case 250 -> 109;
            case 251 -> 189;
            case 252 -> 34;
            case 253 -> 211;
            case 254 -> 154;
            default -> 253;
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

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @Nullable
      private final BlockPos IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         int var1, int var2, boolean var3, boolean var4, boolean var5, @Nullable BlockPos var6
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

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final BlockPos f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final int g() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int h() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean i() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean j() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean k() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final BlockPos l() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         int var1, int var2, boolean var3, boolean var4, boolean var5, @Nullable BlockPos var6
      ) {
         return new IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3, var4, var5, var6
         );
      }

      @NotNull
      @Override
      public String toString() { int var5 = 0; // PX-FIX hoist
         short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
         short var10000 = 16509;
         BlockPos var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
          var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -11857;
         short var10002 = 16508;
          var10003 = -18944;
          var10004 = 16507;
          var10005 = -17671;
          var10006 = 16505;
         short var10007 = -24557;
         short var10008 = 16506;
         short var10009 = 5542;
         short var10010 = 16504;
         short var10011 = 12180;
         return "MiningProgress(minedBlocks="
            + var6
            + ", commissionsCompleted="
            + var5
            + ", commissionDone="
            + var4
            + ", botEnabled="
            + var3
            + ", botFinished="
            + var2
            + ", targetVein="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         int var10000 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         var2 = var2 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         int var1 = var10000;
         var2 = var2 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var2 = var2 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var2 = var2 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var10000 = var2 * 31;
         BlockPos var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if (var1 != 0) {
            if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == null) {
               return var10000 + 0;
            }

            var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         return var10000 + var10001.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != 0) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = ((this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
            var10001 = ((var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0);
         }

         if (var2 != 0) {
            if (var4 != var10001) {
               return false;
            }

            var4 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
            var10001 = ((var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         }

         label72: {
            if (var2 != 0) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
               if (var2 == 0) {
                  break label72;
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

         if (var2 != 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
          var5 = new String[6];
         int var3 = 0;
         String var2 = "é8\u000b\u0017®S2gi0=\u0016%\r\u001e§ãêa\u0001\u0006^±©\u0098\u0007\u001c\u0011\u0085\u0018\u0087\u0013\u0007û:M\u009e ú»ïÈÞ\u0010¸\u000et¥¸¤Ø&û¥¼\u0099àÞk\\";
         int var4 = "é8\u000b\u0017®S2gi0=\u0016%\r\u001e§ãêa\u0001\u0006^±©\u0098\u0007\u001c\u0011\u0085\u0018\u0087\u0013\u0007û:M\u009e ú»ïÈÞ\u0010¸\u000et¥¸¤Ø&û¥¼\u0099àÞk\\"
            .length();
         char var1 = '\r';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 94;
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
                        case 0 -> 88;
                        case 1 -> 22;
                        case 2 -> 99;
                        case 3 -> 12;
                        case 4 -> 108;
                        case 5 -> 98;
                        default -> 107;
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

                     var2 = "ÄLéùclêó\u0080Þ½¦\u0088\u001b£ûË\u008cË&\u0087Ç}\u0081\u001bß(\u0017±¥\u0007¢\u0011ËþM\u0000&/}d:yé&ÌL|P\u0096\u0016";
                     var4 = "ÄLéùclêó\u0080Þ½¦\u0088\u001b£ûË\u008cË&\u0087Ç}\u0081\u001bß(\u0017±¥\u0007¢\u0011ËþM\u0000&/}d:yé&ÌL|P\u0096\u0016".length();
                     var1 = 27;
                     var8 = -1;
               }

               var10000 = 53;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
         int var2 = (var0 ^ 16505) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 6;
               case 1 -> 51;
               case 2 -> 126;
               case 3 -> 143;
               case 4 -> 105;
               case 5 -> 141;
               case 6 -> 213;
               case 7 -> 135;
               case 8 -> 77;
               case 9 -> 227;
               case 10 -> 138;
               case 11 -> 190;
               case 12 -> 180;
               case 13 -> 134;
               case 14 -> 251;
               case 15 -> 236;
               case 16 -> 199;
               case 17 -> 164;
               case 18 -> 99;
               case 19 -> 188;
               case 20 -> 187;
               case 21 -> 3;
               case 22 -> 230;
               case 23 -> 217;
               case 24 -> 96;
               case 25 -> 55;
               case 26 -> 176;
               case 27 -> 177;
               case 28 -> 37;
               case 29 -> 228;
               case 30 -> 63;
               case 31 -> 66;
               case 32 -> 9;
               case 33 -> 32;
               case 34 -> 2;
               case 35 -> 214;
               case 36 -> 152;
               case 37 -> 65;
               case 38 -> 60;
               case 39 -> 115;
               case 40 -> 121;
               case 41 -> 218;
               case 42 -> 147;
               case 43 -> 57;
               case 44 -> 197;
               case 45 -> 226;
               case 46 -> 128;
               case 47 -> 101;
               case 48 -> 94;
               case 49 -> 191;
               case 50 -> 240;
               case 51 -> 112;
               case 52 -> 19;
               case 53 -> 168;
               case 54 -> 8;
               case 55 -> 93;
               case 56 -> 11;
               case 57 -> 79;
               case 58 -> 244;
               case 59 -> 170;
               case 60 -> 252;
               case 61 -> 146;
               case 62 -> 174;
               case 63 -> 221;
               case 64 -> 46;
               case 65 -> 47;
               case 66 -> 222;
               case 67 -> 231;
               case 68 -> 100;
               case 69 -> 76;
               case 70 -> 119;
               case 71 -> 149;
               case 72 -> 111;
               case 73 -> 148;
               case 74 -> 208;
               case 75 -> 26;
               case 76 -> 113;
               case 77 -> 87;
               case 78 -> 73;
               case 79 -> 127;
               case 80 -> 1;
               case 81 -> 132;
               case 82 -> 139;
               case 83 -> 229;
               case 84 -> 21;
               case 85 -> 186;
               case 86 -> 189;
               case 87 -> 98;
               case 88 -> 241;
               case 89 -> 54;
               case 90 -> 78;
               case 91 -> 160;
               case 92 -> 175;
               case 93 -> 212;
               case 94 -> 238;
               case 95 -> 163;
               case 96 -> 193;
               case 97 -> 224;
               case 98 -> 41;
               case 99 -> 25;
               case 100 -> 185;
               case 101 -> 202;
               case 102 -> 215;
               case 103 -> 23;
               case 104 -> 20;
               case 105 -> 107;
               case 106 -> 247;
               case 107 -> 33;
               case 108 -> 31;
               case 109 -> 40;
               case 110 -> 7;
               case 111 -> 58;
               case 112 -> 200;
               case 113 -> 38;
               case 114 -> 72;
               case 115 -> 192;
               case 116 -> 245;
               case 117 -> 118;
               case 118 -> 13;
               case 119 -> 157;
               case 120 -> 237;
               case 121 -> 195;
               case 122 -> 97;
               case 123 -> 225;
               case 124 -> 28;
               case 125 -> 171;
               case 126 -> 62;
               case 127 -> 216;
               case 128 -> 253;
               case 129 -> 117;
               case 130 -> 184;
               case 131 -> 74;
               case 132 -> 154;
               case 133 -> 18;
               case 134 -> 95;
               case 135 -> 255;
               case 136 -> 122;
               case 137 -> 17;
               case 138 -> 10;
               case 139 -> 210;
               case 140 -> 75;
               case 141 -> 220;
               case 142 -> 114;
               case 143 -> 83;
               case 144 -> 167;
               case 145 -> 36;
               case 146 -> 223;
               case 147 -> 27;
               case 148 -> 14;
               case 149 -> 50;
               case 150 -> 233;
               case 151 -> 5;
               case 152 -> 104;
               case 153 -> 68;
               case 154 -> 181;
               case 155 -> 234;
               case 156 -> 159;
               case 157 -> 91;
               case 158 -> 201;
               case 159 -> 90;
               case 160 -> 88;
               case 161 -> 165;
               case 162 -> 82;
               case 163 -> 206;
               case 164 -> 145;
               case 165 -> 232;
               case 166 -> 49;
               case 167 -> 12;
               case 168 -> 103;
               case 169 -> 203;
               case 170 -> 108;
               case 171 -> 166;
               case 172 -> 45;
               case 173 -> 86;
               case 174 -> 44;
               case 175 -> 22;
               case 176 -> 173;
               case 177 -> 110;
               case 178 -> 131;
               case 179 -> 153;
               case 180 -> 136;
               case 181 -> 89;
               case 182 -> 67;
               case 183 -> 162;
               case 184 -> 130;
               case 185 -> 123;
               case 186 -> 85;
               case 187 -> 81;
               case 188 -> 116;
               case 189 -> 48;
               case 190 -> 42;
               case 191 -> 248;
               case 192 -> 4;
               case 193 -> 249;
               case 194 -> 158;
               case 195 -> 124;
               case 196 -> 106;
               case 197 -> 39;
               case 198 -> 43;
               case 199 -> 211;
               case 200 -> 198;
               case 201 -> 246;
               case 202 -> 142;
               case 203 -> 204;
               case 204 -> 53;
               case 205 -> 196;
               case 206 -> 15;
               case 207 -> 250;
               case 208 -> 120;
               case 209 -> 64;
               case 210 -> 151;
               case 211 -> 172;
               case 212 -> 70;
               case 213 -> 59;
               case 214 -> 34;
               case 215 -> 182;
               case 216 -> 24;
               case 217 -> 169;
               case 218 -> 30;
               case 219 -> 92;
               case 220 -> 16;
               case 221 -> 144;
               case 222 -> 207;
               case 223 -> 156;
               case 224 -> 242;
               case 225 -> 84;
               case 226 -> 235;
               case 227 -> 150;
               case 228 -> 243;
               case 229 -> 205;
               case 230 -> 35;
               case 231 -> 29;
               case 232 -> 69;
               case 233 -> 61;
               case 234 -> 109;
               case 235 -> 0;
               case 236 -> 125;
               case 237 -> 102;
               case 238 -> 254;
               case 239 -> 80;
               case 240 -> 161;
               case 241 -> 219;
               case 242 -> 178;
               case 243 -> 239;
               case 244 -> 71;
               case 245 -> 194;
               case 246 -> 133;
               case 247 -> 209;
               case 248 -> 56;
               case 249 -> 183;
               case 250 -> 140;
               case 251 -> 155;
               case 252 -> 52;
               case 253 -> 129;
               case 254 -> 137;
               default -> 179;
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
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0, int var1, int var2, boolean var3, boolean var4, boolean var5, net.minecraft.core.BlockPos var6, int var7, java.lang.Object var8) {
         int var9 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         if ((var7 & 1) != 0) {
            if (var9 == 0) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var7 & 2) != 0) {
            if (var9 == 0) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var7 & 4) != 0) {
            if (var9 == 0) {
               var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }
         if ((var7 & 8) != 0) {
            if (var9 == 0) {
               var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }
         }
         if ((var7 & 16) != 0) {
            if (var9 == 0) {
               var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }
         }
         if ((var7 & 32) != 0) {
            var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }
         return var0.a(var1, var2, var3, var4, var5, var6);
      }
}

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @Nullable
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final BlockPos lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final BlockPos IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final Object lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private final Triple<Integer, Integer, Integer> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         @Nullable String var1,
         @Nullable BlockPos var2,
         @Nullable BlockPos var3,
         @Nullable Object var4,
         int var5,
         int var6,
         @NotNull Triple<Integer, Integer, Integer> var7
      ) {
         short var10001 = 30746;
         short var10002 = 17293;
         Intrinsics.checkNotNullParameter(var7, "playerPos");
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

      @Nullable
      public final Object d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @Nullable
      public final String h() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final BlockPos i() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final BlockPos j() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Object k() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int l() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final int m() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> n() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @Nullable String var1,
         @Nullable BlockPos var2,
         @Nullable BlockPos var3,
         @Nullable Object var4,
         int var5,
         int var6,
         @NotNull Triple<Integer, Integer, Integer> var7
      ) {
         short var10001 = 30744;
         short var10002 = 1631;
         Intrinsics.checkNotNullParameter(var7, "playerPos");
         return new IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3, var4, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() { BlockPos var5 = null; // PX-FIX hoist
         short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
         short var10000 = 30736;
         Triple var1 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         int var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         int var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Object var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
          var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         BlockPos var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 6759;
         short var10002 = 30750;
          var10003 = 21498;
          var10004 = 30751;
          var10005 = -15998;
          var10006 = 30747;
         short var10007 = -10190;
         short var10008 = 30749;
         short var10009 = 6704;
         short var10010 = 30745;
         short var10011 = -3989;
         short var10012 = 30748;
         short var10013 = 28291;
         return "MoveProgress(commissionName="
            + var7
            + ", walkPosition="
            + var6
            + ", targetVein="
            + var5
            + ", veinLookPoint="
            + var4
            + ", blacklistedVeins="
            + var3
            + ", cold="
            + var2
            + ", playerPos="
            + var1
            + ")";
      }

      @Override
      public int hashCode() { int var5 = 0; // PX-FIX hoist
        
         int var1;
         int var8;
         label47: {
            var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
            String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 != 0) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl == null) {
                  var8 = 0;
                  break label47;
               }

               var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }

            var8 = var10000.hashCode();
         }

         int var12;
         label41: {
            int var2 = var8;
            var8 = var2 * 31;
            BlockPos var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var1 != 0) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var12 = 0;
                  break label41;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var12 = var10001.hashCode();
         }

         label35: {
            int var3 = var8 + var12;
            var8 = var3 * 31;
            BlockPos var13 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var1 != 0) {
               if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
                  var12 = 0;
                  break label35;
               }

               var13 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            var12 = var13.hashCode();
         }

         label29: {
            int var4 = var8 + var12;
            var8 = var4 * 31;
            Object var15 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (var1 != 0) {
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  var12 = 0;
                  break label29;
               }

               var15 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            var12 = var15.hashCode();
         }

          var5 = var8 + var12;
         var5 = var5 * 31 + Integer.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var5 = var5 * 31 + Integer.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         return var5 * 31 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
         Object var10000 = this;
         if (var2 != 0) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != 0) {
            if (!(
               var10000 instanceof IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            )) ? 1 : 0);
         }

         if (var2 != 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (var2 != 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         label80: {
            int var10001 = var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var2 != 0) {
               if (var4 != var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
                  return false;
               }

               var4 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               if (var2 == 0) {
                  break label80;
               }

               var10001 = var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )) ? 1 : 0);
         }

         if (var2 != 0) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
          var5 = new String[9];
         int var3 = 0;
         String var2 = "´%\u008fÒ$FÌO/\u0007¼\u0013[Çõ&³\têfDº]KãîÊ\u0010I\u0089ð\u009e2L\u009f\u0091ÆÝä/\u0097Ø\u0016\u001a\f\u000e\u000f\u001eG!HÝù½jp\u000f\u0013)\u0015è\u0004¯:\u0002ð°\u008aÈÔ¿Ô®ðtÇí\u000fëº¥ü¼\u0081÷\u008dH\\\u008e[|\u0090ä";
         int var4 = "´%\u008fÒ$FÌO/\u0007¼\u0013[Çõ&³\têfDº]KãîÊ\u0010I\u0089ð\u009e2L\u009f\u0091ÆÝä/\u0097Ø\u0016\u001a\f\u000e\u000f\u001eG!HÝù½jp\u000f\u0013)\u0015è\u0004¯:\u0002ð°\u008aÈÔ¿Ô®ðtÇí\u000fëº¥ü¼\u0081÷\u008dH\\\u008e[|\u0090ä"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 8;
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
                        case 0 -> 90;
                        case 1 -> 124;
                        case 2 -> 68;
                        case 3 -> 104;
                        case 4 -> 124;
                        case 5 -> 60;
                        default -> 87;
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

                     var2 = "õ\u009e\u008e\u0093O\u008b\u008a±ºD§9^\u001c~7°\u0004èè\u0012yÆ,\u0092)´aë:\u007fëJ\u0099\u0007~¾î\u0010!ùã";
                     var4 = "õ\u009e\u008e\u0093O\u008b\u008a±ºD§9^\u001c~7°\u0004èè\u0012yÆ,\u0092)´aë:\u007fëJ\u0099\u0007~¾î\u0010!ùã".length();
                     var1 = '\r';
                     var8 = -1;
               }

               var10000 = 38;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
         int var2 = (var0 ^ 30744) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 137;
               case 1 -> 121;
               case 2 -> 24;
               case 3 -> 188;
               case 4 -> 92;
               case 5 -> 129;
               case 6 -> 156;
               case 7 -> 42;
               case 8 -> 108;
               case 9 -> 90;
               case 10 -> 243;
               case 11 -> 186;
               case 12 -> 77;
               case 13 -> 180;
               case 14 -> 185;
               case 15 -> 225;
               case 16 -> 195;
               case 17 -> 3;
               case 18 -> 146;
               case 19 -> 2;
               case 20 -> 123;
               case 21 -> 32;
               case 22 -> 6;
               case 23 -> 67;
               case 24 -> 7;
               case 25 -> 207;
               case 26 -> 189;
               case 27 -> 251;
               case 28 -> 239;
               case 29 -> 248;
               case 30 -> 74;
               case 31 -> 172;
               case 32 -> 102;
               case 33 -> 208;
               case 34 -> 33;
               case 35 -> 206;
               case 36 -> 183;
               case 37 -> 76;
               case 38 -> 224;
               case 39 -> 18;
               case 40 -> 73;
               case 41 -> 122;
               case 42 -> 97;
               case 43 -> 253;
               case 44 -> 214;
               case 45 -> 168;
               case 46 -> 12;
               case 47 -> 58;
               case 48 -> 125;
               case 49 -> 84;
               case 50 -> 219;
               case 51 -> 241;
               case 52 -> 99;
               case 53 -> 158;
               case 54 -> 192;
               case 55 -> 131;
               case 56 -> 56;
               case 57 -> 1;
               case 58 -> 142;
               case 59 -> 132;
               case 60 -> 193;
               case 61 -> 61;
               case 62 -> 116;
               case 63 -> 226;
               case 64 -> 228;
               case 65 -> 17;
               case 66 -> 140;
               case 67 -> 34;
               case 68 -> 249;
               case 69 -> 105;
               case 70 -> 39;
               case 71 -> 175;
               case 72 -> 53;
               case 73 -> 8;
               case 74 -> 127;
               case 75 -> 234;
               case 76 -> 179;
               case 77 -> 177;
               case 78 -> 176;
               case 79 -> 52;
               case 80 -> 184;
               case 81 -> 211;
               case 82 -> 191;
               case 83 -> 5;
               case 84 -> 0;
               case 85 -> 16;
               case 86 -> 111;
               case 87 -> 88;
               case 88 -> 49;
               case 89 -> 4;
               case 90 -> 222;
               case 91 -> 47;
               case 92 -> 19;
               case 93 -> 41;
               case 94 -> 157;
               case 95 -> 75;
               case 96 -> 155;
               case 97 -> 64;
               case 98 -> 63;
               case 99 -> 60;
               case 100 -> 114;
               case 101 -> 200;
               case 102 -> 85;
               case 103 -> 196;
               case 104 -> 14;
               case 105 -> 138;
               case 106 -> 160;
               case 107 -> 30;
               case 108 -> 182;
               case 109 -> 9;
               case 110 -> 82;
               case 111 -> 96;
               case 112 -> 235;
               case 113 -> 118;
               case 114 -> 86;
               case 115 -> 15;
               case 116 -> 66;
               case 117 -> 120;
               case 118 -> 13;
               case 119 -> 210;
               case 120 -> 128;
               case 121 -> 229;
               case 122 -> 212;
               case 123 -> 217;
               case 124 -> 167;
               case 125 -> 233;
               case 126 -> 242;
               case 127 -> 203;
               case 128 -> 89;
               case 129 -> 55;
               case 130 -> 245;
               case 131 -> 171;
               case 132 -> 21;
               case 133 -> 254;
               case 134 -> 150;
               case 135 -> 124;
               case 136 -> 62;
               case 137 -> 221;
               case 138 -> 95;
               case 139 -> 173;
               case 140 -> 247;
               case 141 -> 113;
               case 142 -> 65;
               case 143 -> 244;
               case 144 -> 252;
               case 145 -> 218;
               case 146 -> 209;
               case 147 -> 110;
               case 148 -> 187;
               case 149 -> 91;
               case 150 -> 227;
               case 151 -> 148;
               case 152 -> 100;
               case 153 -> 112;
               case 154 -> 48;
               case 155 -> 199;
               case 156 -> 27;
               case 157 -> 215;
               case 158 -> 223;
               case 159 -> 54;
               case 160 -> 87;
               case 161 -> 59;
               case 162 -> 152;
               case 163 -> 72;
               case 164 -> 68;
               case 165 -> 161;
               case 166 -> 164;
               case 167 -> 143;
               case 168 -> 162;
               case 169 -> 71;
               case 170 -> 133;
               case 171 -> 236;
               case 172 -> 149;
               case 173 -> 79;
               case 174 -> 238;
               case 175 -> 220;
               case 176 -> 50;
               case 177 -> 37;
               case 178 -> 10;
               case 179 -> 117;
               case 180 -> 36;
               case 181 -> 23;
               case 182 -> 246;
               case 183 -> 45;
               case 184 -> 197;
               case 185 -> 101;
               case 186 -> 144;
               case 187 -> 151;
               case 188 -> 165;
               case 189 -> 136;
               case 190 -> 166;
               case 191 -> 43;
               case 192 -> 69;
               case 193 -> 57;
               case 194 -> 109;
               case 195 -> 40;
               case 196 -> 240;
               case 197 -> 81;
               case 198 -> 94;
               case 199 -> 153;
               case 200 -> 174;
               case 201 -> 26;
               case 202 -> 178;
               case 203 -> 103;
               case 204 -> 130;
               case 205 -> 230;
               case 206 -> 181;
               case 207 -> 98;
               case 208 -> 44;
               case 209 -> 35;
               case 210 -> 28;
               case 211 -> 104;
               case 212 -> 93;
               case 213 -> 29;
               case 214 -> 83;
               case 215 -> 25;
               case 216 -> 78;
               case 217 -> 232;
               case 218 -> 237;
               case 219 -> 213;
               case 220 -> 154;
               case 221 -> 255;
               case 222 -> 22;
               case 223 -> 170;
               case 224 -> 38;
               case 225 -> 51;
               case 226 -> 115;
               case 227 -> 141;
               case 228 -> 163;
               case 229 -> 46;
               case 230 -> 201;
               case 231 -> 198;
               case 232 -> 205;
               case 233 -> 204;
               case 234 -> 20;
               case 235 -> 202;
               case 236 -> 80;
               case 237 -> 190;
               case 238 -> 169;
               case 239 -> 31;
               case 240 -> 145;
               case 241 -> 126;
               case 242 -> 231;
               case 243 -> 134;
               case 244 -> 70;
               case 245 -> 135;
               case 246 -> 147;
               case 247 -> 11;
               case 248 -> 106;
               case 249 -> 159;
               case 250 -> 250;
               case 251 -> 119;
               case 252 -> 107;
               case 253 -> 139;
               case 254 -> 216;
               default -> 194;
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
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var0, java.lang.String var1, net.minecraft.core.BlockPos var2, net.minecraft.core.BlockPos var3, java.lang.Object var4, int var5, int var6, kotlin.Triple var7, int var8, java.lang.Object var9) {
         int var10 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         if ((var8 & 1) != 0) {
            if (var10 == 0) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var8 & 2) != 0) {
            if (var10 == 0) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var8 & 4) != 0) {
            if (var10 == 0) {
               var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }
         if ((var8 & 8) != 0) {
            if (var10 == 0) {
               var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }
         }
         if ((var8 & 16) != 0) {
            if (var10 == 0) {
               var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }
         }
         if ((var8 & 32) != 0) {
            if (var10 == 0) {
               var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }
         }
         if ((var8 & 64) != 0) {
            var7 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         }
         return var0.a(var1, var2, var3, var4, var5, var6, var7);
      }
}

   public static final IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll bE() {
      return IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   }

   public static final void a(IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll var0, me.octo.client.IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
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
      public final IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll a() {
         return IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @Nullable
      private final Integer IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
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
         @Nullable Integer var1, @NotNull Triple<Integer, Integer, Integer> var2, int var3, int var4, boolean var5, @Nullable String var6, int var7
      ) {
         short var10001 = 19838;
         short var10002 = -20144;
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
      public final Integer a() {
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
      public final Integer h() {
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
      public final IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @Nullable Integer var1, @NotNull Triple<Integer, Integer, Integer> var2, int var3, int var4, boolean var5, @Nullable String var6, int var7
      ) {
         short var10001 = 19839;
         short var10002 = 29514;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         return new IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() { int var5 = 0; // PX-FIX hoist
         short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
         short var10000 = 19835;
         int var1 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         String var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
          var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Triple var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         Integer var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -24665;
         short var10002 = 19827;
          var10003 = 20277;
          var10004 = 19833;
          var10005 = 25857;
          var10006 = 19837;
         short var10007 = 3527;
         short var10008 = 19836;
         short var10009 = -2507;
         short var10010 = 19832;
         short var10011 = 907;
         short var10012 = 19834;
         short var10013 = -9549;
         return "ClaimProgress(pigeonSlot="
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
            var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
            Integer var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var1 != 0) {
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
            if (var1 != 0) {
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
      public boolean equals(@Nullable Object var1) {
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
               var10000 instanceof IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = ((Intrinsics.areEqual(
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
         int var10004 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
          var5 = new String[9];
         int var3 = 0;
         String var2 = "ksýç\u0001¿O\u0099Î\u00196ò+¶Sî©ýOOå}\u0096àl\u0017\b\f\u0011ËÞÁ¯Ð¾´¤\"2yo\u0015Å\u000f=#Ö¡R\u000b\"¥_ô|dàS6%x\u000e'\u009cäÕm\u0087)\fÄ\u00913\u0084®\u0091\t\u0087\u008b5è\u0010nFÅ\u009d\t\u0013¿§nB¾\fßÔ\f«2t\fH\u0000T÷üoo×";
         int var4 = "ksýç\u0001¿O\u0099Î\u00196ò+¶Sî©ýOOå}\u0096àl\u0017\b\f\u0011ËÞÁ¯Ð¾´¤\"2yo\u0015Å\u000f=#Ö¡R\u000b\"¥_ô|dàS6%x\u000e'\u009cäÕm\u0087)\fÄ\u00913\u0084®\u0091\t\u0087\u008b5è\u0010nFÅ\u009d\t\u0013¿§nB¾\fßÔ\f«2t\fH\u0000T÷üoo×"
            .length();
         char var1 = 25;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 23;
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
                        case 0 -> 43;
                        case 1 -> 4;
                        case 2 -> 74;
                        case 3 -> 116;
                        case 4 -> 34;
                        case 5 -> 44;
                        default -> 108;
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

                     var2 = "k\u0089ÿú\u0085\bÀ²\u0084ú\fkrì\u0085\u009eý¤BóCÔË";
                     var4 = "k\u0089ÿú\u0085\bÀ²\u0084ú\fkrì\u0085\u009eý¤BóCÔË".length();
                     var1 = '\n';
                     var8 = -1;
               }

               var10000 = 120;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
        
         int var2 = (var0 ^ 19835) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 231;
               case 1 -> 197;
               case 2 -> 161;
               case 3 -> 54;
               case 4 -> 65;
               case 5 -> 228;
               case 6 -> 210;
               case 7 -> 200;
               case 8 -> 55;
               case 9 -> 118;
               case 10 -> 86;
               case 11 -> 177;
               case 12 -> 100;
               case 13 -> 125;
               case 14 -> 138;
               case 15 -> 69;
               case 16 -> 18;
               case 17 -> 108;
               case 18 -> 111;
               case 19 -> 224;
               case 20 -> 36;
               case 21 -> 59;
               case 22 -> 164;
               case 23 -> 142;
               case 24 -> 62;
               case 25 -> 233;
               case 26 -> 56;
               case 27 -> 84;
               case 28 -> 145;
               case 29 -> 157;
               case 30 -> 207;
               case 31 -> 235;
               case 32 -> 217;
               case 33 -> 173;
               case 34 -> 2;
               case 35 -> 37;
               case 36 -> 250;
               case 37 -> 199;
               case 38 -> 50;
               case 39 -> 16;
               case 40 -> 129;
               case 41 -> 105;
               case 42 -> 135;
               case 43 -> 152;
               case 44 -> 158;
               case 45 -> 53;
               case 46 -> 30;
               case 47 -> 241;
               case 48 -> 140;
               case 49 -> 124;
               case 50 -> 205;
               case 51 -> 93;
               case 52 -> 155;
               case 53 -> 63;
               case 54 -> 194;
               case 55 -> 190;
               case 56 -> 33;
               case 57 -> 132;
               case 58 -> 32;
               case 59 -> 166;
               case 60 -> 168;
               case 61 -> 120;
               case 62 -> 66;
               case 63 -> 249;
               case 64 -> 70;
               case 65 -> 106;
               case 66 -> 180;
               case 67 -> 232;
               case 68 -> 181;
               case 69 -> 78;
               case 70 -> 35;
               case 71 -> 238;
               case 72 -> 94;
               case 73 -> 170;
               case 74 -> 8;
               case 75 -> 23;
               case 76 -> 5;
               case 77 -> 60;
               case 78 -> 185;
               case 79 -> 73;
               case 80 -> 212;
               case 81 -> 137;
               case 82 -> 103;
               case 83 -> 49;
               case 84 -> 91;
               case 85 -> 3;
               case 86 -> 128;
               case 87 -> 147;
               case 88 -> 52;
               case 89 -> 167;
               case 90 -> 15;
               case 91 -> 39;
               case 92 -> 110;
               case 93 -> 48;
               case 94 -> 219;
               case 95 -> 109;
               case 96 -> 163;
               case 97 -> 218;
               case 98 -> 175;
               case 99 -> 196;
               case 100 -> 203;
               case 101 -> 117;
               case 102 -> 187;
               case 103 -> 119;
               case 104 -> 6;
               case 105 -> 43;
               case 106 -> 220;
               case 107 -> 245;
               case 108 -> 51;
               case 109 -> 92;
               case 110 -> 11;
               case 111 -> 179;
               case 112 -> 40;
               case 113 -> 192;
               case 114 -> 47;
               case 115 -> 146;
               case 116 -> 25;
               case 117 -> 112;
               case 118 -> 208;
               case 119 -> 64;
               case 120 -> 85;
               case 121 -> 133;
               case 122 -> 83;
               case 123 -> 172;
               case 124 -> 82;
               case 125 -> 248;
               case 126 -> 183;
               case 127 -> 186;
               case 128 -> 98;
               case 129 -> 123;
               case 130 -> 174;
               case 131 -> 116;
               case 132 -> 139;
               case 133 -> 247;
               case 134 -> 150;
               case 135 -> 236;
               case 136 -> 7;
               case 137 -> 211;
               case 138 -> 21;
               case 139 -> 102;
               case 140 -> 222;
               case 141 -> 254;
               case 142 -> 31;
               case 143 -> 67;
               case 144 -> 13;
               case 145 -> 20;
               case 146 -> 96;
               case 147 -> 182;
               case 148 -> 160;
               case 149 -> 229;
               case 150 -> 237;
               case 151 -> 12;
               case 152 -> 255;
               case 153 -> 27;
               case 154 -> 246;
               case 155 -> 204;
               case 156 -> 107;
               case 157 -> 10;
               case 158 -> 68;
               case 159 -> 1;
               case 160 -> 45;
               case 161 -> 216;
               case 162 -> 19;
               case 163 -> 71;
               case 164 -> 44;
               case 165 -> 34;
               case 166 -> 201;
               case 167 -> 143;
               case 168 -> 17;
               case 169 -> 188;
               case 170 -> 221;
               case 171 -> 176;
               case 172 -> 114;
               case 173 -> 149;
               case 174 -> 144;
               case 175 -> 4;
               case 176 -> 209;
               case 177 -> 153;
               case 178 -> 178;
               case 179 -> 26;
               case 180 -> 159;
               case 181 -> 136;
               case 182 -> 206;
               case 183 -> 230;
               case 184 -> 169;
               case 185 -> 240;
               case 186 -> 24;
               case 187 -> 127;
               case 188 -> 95;
               case 189 -> 113;
               case 190 -> 72;
               case 191 -> 22;
               case 192 -> 148;
               case 193 -> 28;
               case 194 -> 101;
               case 195 -> 14;
               case 196 -> 9;
               case 197 -> 227;
               case 198 -> 251;
               case 199 -> 156;
               case 200 -> 226;
               case 201 -> 244;
               case 202 -> 104;
               case 203 -> 99;
               case 204 -> 154;
               case 205 -> 134;
               case 206 -> 79;
               case 207 -> 198;
               case 208 -> 239;
               case 209 -> 46;
               case 210 -> 74;
               case 211 -> 89;
               case 212 -> 131;
               case 213 -> 115;
               case 214 -> 193;
               case 215 -> 223;
               case 216 -> 213;
               case 217 -> 189;
               case 218 -> 234;
               case 219 -> 41;
               case 220 -> 58;
               case 221 -> 77;
               case 222 -> 242;
               case 223 -> 88;
               case 224 -> 215;
               case 225 -> 81;
               case 226 -> 162;
               case 227 -> 195;
               case 228 -> 126;
               case 229 -> 122;
               case 230 -> 61;
               case 231 -> 214;
               case 232 -> 253;
               case 233 -> 97;
               case 234 -> 171;
               case 235 -> 90;
               case 236 -> 76;
               case 237 -> 225;
               case 238 -> 38;
               case 239 -> 57;
               case 240 -> 75;
               case 241 -> 87;
               case 242 -> 0;
               case 243 -> 165;
               case 244 -> 80;
               case 245 -> 29;
               case 246 -> 141;
               case 247 -> 184;
               case 248 -> 202;
               case 249 -> 191;
               case 250 -> 121;
               case 251 -> 151;
               case 252 -> 252;
               case 253 -> 243;
               case 254 -> 130;
               default -> 42;
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
   
      // PX-FIX-ok: Kotlin $default bridge (synthetic; jar body translated 1:1)
      public static final me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, java.lang.Integer var1, kotlin.Triple var2, int var3, int var4, boolean var5, java.lang.String var6, int var7, int var8, java.lang.Object var9) {
         int var10 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         if ((var8 & 1) != 0) {
            if (var10 == 0) {
               var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            }
         }
         if ((var8 & 2) != 0) {
            if (var10 == 0) {
               var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
         }
         if ((var8 & 4) != 0) {
            if (var10 == 0) {
               var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
         }
         if ((var8 & 8) != 0) {
            if (var10 == 0) {
               var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }
         }
         if ((var8 & 16) != 0) {
            if (var10 == 0) {
               var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }
         }
         if ((var8 & 32) != 0) {
            if (var10 == 0) {
               var6 = var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }
         }
         if ((var8 & 64) != 0) {
            if (var10 == 0) {
               var7 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            }
         }
         return var0.a(var1, var2, var3, var4, var5, var6, var7);
      }
}
}
