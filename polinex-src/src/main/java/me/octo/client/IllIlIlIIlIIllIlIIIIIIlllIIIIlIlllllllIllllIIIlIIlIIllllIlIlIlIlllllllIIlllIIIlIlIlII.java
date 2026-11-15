package me.octo.client;

import java.util.ArrayList;
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
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
import me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.phys.AABB;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import java.util.Collection;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.entity.Entity;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import net.minecraft.world.item.ItemStack;
import java.util.Iterator;
import java.lang.invoke.LambdaMetafactory;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.inventory.Slot;
import me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;

public final class IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII
   extends lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll {
   @NotNull
   public static IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @Nullable
   private llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private String IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @Nullable
   private llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @Nullable
   private lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @Nullable
   private BlockPos llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @NotNull
   private List<String> lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @Nullable
   private IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private boolean lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private boolean IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   @NotNull
   private final ArrayList<BlockPos> lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   private boolean IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   private boolean llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI;
   private boolean IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
   private int IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
   private int llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll;
   private int IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
   private boolean IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
   @Nullable
   private BlockPos lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl;
   @Nullable
   private IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll;
   private long llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
   @Nullable
   private IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
   @Nullable
   private IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
   private int IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
   @NotNull
   private final List<Pair<String, Vec3>> IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
   @NotNull
   private static IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
   @NotNull
   private static List<String> IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   @NotNull
   private static List<String> lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   @NotNull
   private static List<String> lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   @NotNull
   private static List<String> lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   @NotNull
   private static Set<IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   @NotNull
   private static Set<IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
   private static long llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
   private static long llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
   private static long IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
   private static int IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   private static int lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   private static double IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   private static long lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   private static long IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
   private static long llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
   private static long IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
   private static long IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
   private static String[] j;
   private static String[] k;

   public IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII() { me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4 = null; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
      short var10001 = -3214;
      short var10002 = 9631;
      var10002 = -3243;
       var10003 = -20291;
       var4 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
       var10004 = -3231;
       var10005 = -27682;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(),
         IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e(),
         IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .f(),
         IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g(),
         IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h(),
         IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i()
      };
      super("Dwarven Commission Macro V2", "Completes commissions in the Dwarven Mines.", var4, "Dwarven Mines", null, null, true, var1, 48, null);
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = "";
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = CollectionsKt.emptyList();
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = new ArrayList<>();
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 500;
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = 500;
      Pair[] var2 = new Pair[5];
      var10003 = -3291;
      var10004 = 5409;
      var2[0] = TuplesKt.to("e78c25ac8d793a73af31e5da3e8bf2d63a6c0026fde9a9682fc9caf615540c79", new Vec3(42.5, 134.5, 22.5));
      var10003 = -3279;
      var10004 = 23480;
      var2[1] = TuplesKt.to("e1172b17eb3318b841fa94be0b8fbd0b7cddb5add1d2b35ad5e6adc8ab7d5206", new Vec3(171.5, 150.0, 31.5));
      var10003 = -3216;
      var10004 = 11540;
      var2[2] = TuplesKt.to("c765fee97bcfae7c136b6a6b8ca95381af964d6aebc08bfdd2350af78e2cf51a", new Vec3(-72.5, 153.0, -10.5));
      var10003 = -3217;
      var10004 = 16029;
      var2[3] = TuplesKt.to("38dfab2a93e5b5030003cdb1e3ab82c115ae1fca75b45d756e274e0af2af5f50", new Vec3(58.5, 198.0, -8.5));
      var10003 = -3219;
      var10004 = -19369;
      var2[4] = TuplesKt.to("9a43322511f4bba710bd78c98c90e83ac92a2da0f05a0a6951089bace0cf203a", new Vec3(-132.5, 174.0, -50.5));
      this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = CollectionsKt.listOf(var2);
   }

   @NotNull
   @Override
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(true, true, true, false, false, null, 56, null);
   }

   private final boolean bp() {
      CharSequence var10000 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
      short var10001 = -3208;
      short var10002 = 12408;
      return StringsKt.contains(var10000, "Titanium", false);
   }

   private final void e(String var1) {
      try {
         if (IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
            .al()) {
            short var10001 = -3254;
            short var10002 = -29284;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7[DCv2] " + var1);
         }
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -3292;
      short var10002 = -5262;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Dwarven commission travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = -11698;
                   var10005 = 1011;
                  var10005 = -11699;
                   var10006 = 3062;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -11697;
                  short var10002x = 5780;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "|\u0098\u001c\u001c/\u009eØdwD\u000eÑ<\u0015¦\u00953 Ôý't2\u0097j,\u008aFe°q\u0085¯cèQªF\u009d(êør>y ½¶Nk\u0002»Y[õ¬}¡×é\u0083\u0083&ÄSß®SA©Ýë<\u0094óÛäÜgv\u008d8È8¥s|«Ý¨ \rÔèûO\u0006rY»G²;®üiOÀ\u00adîMÇ0\rOA\u009eQì³é?ÝµÂ\bäuqkØ\u0095\u0001\u000eÕ\tZs2Ðßn²\b!ù\u001b¦2¸'á\u009d\u0003*\u0014)bö5E?\nÎ&";
                   var4 = "|\u0098\u001c\u001c/\u009eØdwD\u000eÑ<\u0015¦\u00953 Ôý't2\u0097j,\u008aFe°q\u0085¯cèQªF\u009d(êør>y ½¶Nk\u0002»Y[õ¬}¡×é\u0083\u0083&ÄSß®SA©Ýë<\u0094óÛäÜgv\u008d8È8¥s|«Ý¨ \rÔèûO\u0006rY»G²;®üiOÀ\u00adîMÇ0\rOA\u009eQì³é?ÝµÂ\bäuqkØ\u0095\u0001\u000eÕ\tZs2Ðßn²\b!ù\u001b¦2¸'á\u009d\u0003*\u0014)bö5E?\nÎ&"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 12;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 12;
                           var10006 = var6;
                        } else {
                           var13 = 12;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 12;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 54;
                              case 1 -> 28;
                              case 2 -> 93;
                              case 3 -> 26;
                              case 4 -> 94;
                              case 5 -> 47;
                              default -> 43;
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
        
                  int var2 = (var0 ^ -11697) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 247;
                        case 1 -> 253;
                        case 2 -> 228;
                        case 3 -> 237;
                        case 4 -> 242;
                        case 5 -> 138;
                        case 6 -> 156;
                        case 7 -> 243;
                        case 8 -> 154;
                        case 9 -> 255;
                        case 10 -> 216;
                        case 11 -> 120;
                        case 12 -> 65;
                        case 13 -> 124;
                        case 14 -> 212;
                        case 15 -> 151;
                        case 16 -> 209;
                        case 17 -> 51;
                        case 18 -> 129;
                        case 19 -> 143;
                        case 20 -> 132;
                        case 21 -> 1;
                        case 22 -> 79;
                        case 23 -> 223;
                        case 24 -> 88;
                        case 25 -> 203;
                        case 26 -> 188;
                        case 27 -> 170;
                        case 28 -> 110;
                        case 29 -> 112;
                        case 30 -> 189;
                        case 31 -> 96;
                        case 32 -> 234;
                        case 33 -> 75;
                        case 34 -> 109;
                        case 35 -> 176;
                        case 36 -> 108;
                        case 37 -> 117;
                        case 38 -> 165;
                        case 39 -> 56;
                        case 40 -> 107;
                        case 41 -> 222;
                        case 42 -> 178;
                        case 43 -> 67;
                        case 44 -> 224;
                        case 45 -> 12;
                        case 46 -> 68;
                        case 47 -> 14;
                        case 48 -> 57;
                        case 49 -> 11;
                        case 50 -> 122;
                        case 51 -> 53;
                        case 52 -> 62;
                        case 53 -> 10;
                        case 54 -> 38;
                        case 55 -> 202;
                        case 56 -> 226;
                        case 57 -> 254;
                        case 58 -> 81;
                        case 59 -> 28;
                        case 60 -> 84;
                        case 61 -> 20;
                        case 62 -> 71;
                        case 63 -> 175;
                        case 64 -> 119;
                        case 65 -> 229;
                        case 66 -> 31;
                        case 67 -> 27;
                        case 68 -> 174;
                        case 69 -> 116;
                        case 70 -> 94;
                        case 71 -> 32;
                        case 72 -> 221;
                        case 73 -> 104;
                        case 74 -> 87;
                        case 75 -> 217;
                        case 76 -> 103;
                        case 77 -> 95;
                        case 78 -> 215;
                        case 79 -> 42;
                        case 80 -> 66;
                        case 81 -> 195;
                        case 82 -> 8;
                        case 83 -> 83;
                        case 84 -> 187;
                        case 85 -> 58;
                        case 86 -> 169;
                        case 87 -> 29;
                        case 88 -> 164;
                        case 89 -> 240;
                        case 90 -> 246;
                        case 91 -> 238;
                        case 92 -> 64;
                        case 93 -> 181;
                        case 94 -> 92;
                        case 95 -> 157;
                        case 96 -> 219;
                        case 97 -> 18;
                        case 98 -> 127;
                        case 99 -> 61;
                        case 100 -> 235;
                        case 101 -> 26;
                        case 102 -> 227;
                        case 103 -> 72;
                        case 104 -> 148;
                        case 105 -> 33;
                        case 106 -> 248;
                        case 107 -> 210;
                        case 108 -> 194;
                        case 109 -> 193;
                        case 110 -> 150;
                        case 111 -> 213;
                        case 112 -> 123;
                        case 113 -> 45;
                        case 114 -> 244;
                        case 115 -> 118;
                        case 116 -> 4;
                        case 117 -> 152;
                        case 118 -> 163;
                        case 119 -> 86;
                        case 120 -> 23;
                        case 121 -> 102;
                        case 122 -> 40;
                        case 123 -> 134;
                        case 124 -> 46;
                        case 125 -> 111;
                        case 126 -> 177;
                        case 127 -> 180;
                        case 128 -> 49;
                        case 129 -> 115;
                        case 130 -> 167;
                        case 131 -> 52;
                        case 132 -> 9;
                        case 133 -> 146;
                        case 134 -> 121;
                        case 135 -> 54;
                        case 136 -> 60;
                        case 137 -> 232;
                        case 138 -> 99;
                        case 139 -> 162;
                        case 140 -> 125;
                        case 141 -> 48;
                        case 142 -> 105;
                        case 143 -> 168;
                        case 144 -> 245;
                        case 145 -> 6;
                        case 146 -> 16;
                        case 147 -> 39;
                        case 148 -> 114;
                        case 149 -> 249;
                        case 150 -> 144;
                        case 151 -> 201;
                        case 152 -> 236;
                        case 153 -> 50;
                        case 154 -> 184;
                        case 155 -> 172;
                        case 156 -> 142;
                        case 157 -> 13;
                        case 158 -> 136;
                        case 159 -> 220;
                        case 160 -> 113;
                        case 161 -> 145;
                        case 162 -> 73;
                        case 163 -> 225;
                        case 164 -> 100;
                        case 165 -> 130;
                        case 166 -> 159;
                        case 167 -> 160;
                        case 168 -> 24;
                        case 169 -> 139;
                        case 170 -> 63;
                        case 171 -> 78;
                        case 172 -> 37;
                        case 173 -> 82;
                        case 174 -> 0;
                        case 175 -> 25;
                        case 176 -> 171;
                        case 177 -> 196;
                        case 178 -> 158;
                        case 179 -> 21;
                        case 180 -> 135;
                        case 181 -> 250;
                        case 182 -> 233;
                        case 183 -> 199;
                        case 184 -> 36;
                        case 185 -> 147;
                        case 186 -> 30;
                        case 187 -> 179;
                        case 188 -> 41;
                        case 189 -> 251;
                        case 190 -> 205;
                        case 191 -> 137;
                        case 192 -> 85;
                        case 193 -> 90;
                        case 194 -> 204;
                        case 195 -> 69;
                        case 196 -> 140;
                        case 197 -> 34;
                        case 198 -> 106;
                        case 199 -> 7;
                        case 200 -> 22;
                        case 201 -> 76;
                        case 202 -> 191;
                        case 203 -> 93;
                        case 204 -> 80;
                        case 205 -> 77;
                        case 206 -> 126;
                        case 207 -> 192;
                        case 208 -> 166;
                        case 209 -> 47;
                        case 210 -> 44;
                        case 211 -> 197;
                        case 212 -> 74;
                        case 213 -> 128;
                        case 214 -> 211;
                        case 215 -> 206;
                        case 216 -> 98;
                        case 217 -> 55;
                        case 218 -> 218;
                        case 219 -> 231;
                        case 220 -> 70;
                        case 221 -> 3;
                        case 222 -> 186;
                        case 223 -> 19;
                        case 224 -> 59;
                        case 225 -> 133;
                        case 226 -> 155;
                        case 227 -> 97;
                        case 228 -> 239;
                        case 229 -> 101;
                        case 230 -> 89;
                        case 231 -> 131;
                        case 232 -> 173;
                        case 233 -> 208;
                        case 234 -> 5;
                        case 235 -> 198;
                        case 236 -> 43;
                        case 237 -> 17;
                        case 238 -> 190;
                        case 239 -> 183;
                        case 240 -> 207;
                        case 241 -> 230;
                        case 242 -> 252;
                        case 243 -> 200;
                        case 244 -> 161;
                        case 245 -> 185;
                        case 246 -> 153;
                        case 247 -> 91;
                        case 248 -> 141;
                        case 249 -> 35;
                        case 250 -> 214;
                        case 251 -> 241;
                        case 252 -> 149;
                        case 253 -> 15;
                        case 254 -> 182;
                        default -> 2;
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
      var10001 = -3276;
      var10002 = -19839;
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
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = 27560;
                   var10005 = -4809;
                  var10005 = 27561;
                   var10006 = 9096;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 27562;
                  short var10002 = -9449;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u007f\u0000®\u0000®\u0003¾ä\t=3J>\r1\u0094\u0083\u0012wûT7Ó}\u0084W\u0087\u0094\u0085Jð\b\u001ezÀ$\u009cZ2Y«s1\u0098\u0013¶âÑå\u0080ôI\u0005×Xíu \u0097\u001e{\u0098Gt$\u009d\u001b{q\u0087dàBÚÒlØO\u0089\u0017RcòË8O].\u008eÙ÷ùÈÁÞ\u009câ\u0090:¥8s\u0086rR©ØJ]í\u0092\u009b\u0011`Üo?UÁé\u000eÃ#ùÜ½ý%Àâ\u0099e\u0094ï¤\u0003vÄv¾¨Äjûéâ>\u009eU-É\u0001\u0081#sÓ\u0090½¶Ù\u0090ÿ\u00023¿";
                   var4 = "\u007f\u0000®\u0000®\u0003¾ä\t=3J>\r1\u0094\u0083\u0012wûT7Ó}\u0084W\u0087\u0094\u0085Jð\b\u001ezÀ$\u009cZ2Y«s1\u0098\u0013¶âÑå\u0080ôI\u0005×Xíu \u0097\u001e{\u0098Gt$\u009d\u001b{q\u0087dàBÚÒlØO\u0089\u0017RcòË8O].\u008eÙ÷ùÈÁÞ\u009câ\u0090:¥8s\u0086rR©ØJ]í\u0092\u009b\u0011`Üo?UÁé\u000eÃ#ùÜ½ý%Àâ\u0099e\u0094ï¤\u0003vÄv¾¨Äjûéâ>\u009eU-É\u0001\u0081#sÓ\u0090½¶Ù\u0090ÿ\u00023¿"
                     .length();
                  char var1 = 28;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 60;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 60;
                           var10006 = var6;
                        } else {
                           var13 = 60;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 60;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 78;
                              case 1 -> 70;
                              case 2 -> 56;
                              case 3 -> 90;
                              case 4 -> 8;
                              case 5 -> 126;
                              default -> 116;
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
        
                  int var2 = (var0 ^ 27560) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 9;
                        case 1 -> 118;
                        case 2 -> 189;
                        case 3 -> 141;
                        case 4 -> 68;
                        case 5 -> 208;
                        case 6 -> 77;
                        case 7 -> 136;
                        case 8 -> 224;
                        case 9 -> 128;
                        case 10 -> 241;
                        case 11 -> 130;
                        case 12 -> 96;
                        case 13 -> 210;
                        case 14 -> 79;
                        case 15 -> 43;
                        case 16 -> 226;
                        case 17 -> 240;
                        case 18 -> 71;
                        case 19 -> 199;
                        case 20 -> 1;
                        case 21 -> 123;
                        case 22 -> 109;
                        case 23 -> 89;
                        case 24 -> 124;
                        case 25 -> 220;
                        case 26 -> 244;
                        case 27 -> 221;
                        case 28 -> 223;
                        case 29 -> 33;
                        case 30 -> 247;
                        case 31 -> 201;
                        case 32 -> 194;
                        case 33 -> 248;
                        case 34 -> 222;
                        case 35 -> 255;
                        case 36 -> 86;
                        case 37 -> 80;
                        case 38 -> 202;
                        case 39 -> 51;
                        case 40 -> 7;
                        case 41 -> 47;
                        case 42 -> 138;
                        case 43 -> 38;
                        case 44 -> 190;
                        case 45 -> 32;
                        case 46 -> 6;
                        case 47 -> 177;
                        case 48 -> 179;
                        case 49 -> 185;
                        case 50 -> 122;
                        case 51 -> 203;
                        case 52 -> 227;
                        case 53 -> 59;
                        case 54 -> 18;
                        case 55 -> 65;
                        case 56 -> 56;
                        case 57 -> 169;
                        case 58 -> 116;
                        case 59 -> 5;
                        case 60 -> 212;
                        case 61 -> 132;
                        case 62 -> 153;
                        case 63 -> 111;
                        case 64 -> 205;
                        case 65 -> 230;
                        case 66 -> 24;
                        case 67 -> 148;
                        case 68 -> 113;
                        case 69 -> 101;
                        case 70 -> 30;
                        case 71 -> 84;
                        case 72 -> 187;
                        case 73 -> 78;
                        case 74 -> 87;
                        case 75 -> 46;
                        case 76 -> 127;
                        case 77 -> 112;
                        case 78 -> 94;
                        case 79 -> 129;
                        case 80 -> 229;
                        case 81 -> 231;
                        case 82 -> 192;
                        case 83 -> 45;
                        case 84 -> 64;
                        case 85 -> 14;
                        case 86 -> 191;
                        case 87 -> 70;
                        case 88 -> 99;
                        case 89 -> 83;
                        case 90 -> 37;
                        case 91 -> 163;
                        case 92 -> 2;
                        case 93 -> 137;
                        case 94 -> 249;
                        case 95 -> 135;
                        case 96 -> 52;
                        case 97 -> 103;
                        case 98 -> 239;
                        case 99 -> 144;
                        case 100 -> 95;
                        case 101 -> 50;
                        case 102 -> 152;
                        case 103 -> 243;
                        case 104 -> 60;
                        case 105 -> 54;
                        case 106 -> 81;
                        case 107 -> 237;
                        case 108 -> 104;
                        case 109 -> 134;
                        case 110 -> 197;
                        case 111 -> 12;
                        case 112 -> 156;
                        case 113 -> 90;
                        case 114 -> 62;
                        case 115 -> 29;
                        case 116 -> 232;
                        case 117 -> 22;
                        case 118 -> 3;
                        case 119 -> 218;
                        case 120 -> 16;
                        case 121 -> 246;
                        case 122 -> 133;
                        case 123 -> 178;
                        case 124 -> 172;
                        case 125 -> 217;
                        case 126 -> 98;
                        case 127 -> 181;
                        case 128 -> 253;
                        case 129 -> 184;
                        case 130 -> 168;
                        case 131 -> 73;
                        case 132 -> 40;
                        case 133 -> 160;
                        case 134 -> 182;
                        case 135 -> 115;
                        case 136 -> 154;
                        case 137 -> 157;
                        case 138 -> 176;
                        case 139 -> 233;
                        case 140 -> 36;
                        case 141 -> 145;
                        case 142 -> 93;
                        case 143 -> 35;
                        case 144 -> 175;
                        case 145 -> 193;
                        case 146 -> 55;
                        case 147 -> 146;
                        case 148 -> 91;
                        case 149 -> 108;
                        case 150 -> 245;
                        case 151 -> 57;
                        case 152 -> 161;
                        case 153 -> 126;
                        case 154 -> 120;
                        case 155 -> 213;
                        case 156 -> 114;
                        case 157 -> 0;
                        case 158 -> 140;
                        case 159 -> 85;
                        case 160 -> 183;
                        case 161 -> 106;
                        case 162 -> 155;
                        case 163 -> 174;
                        case 164 -> 250;
                        case 165 -> 31;
                        case 166 -> 23;
                        case 167 -> 4;
                        case 168 -> 139;
                        case 169 -> 8;
                        case 170 -> 242;
                        case 171 -> 82;
                        case 172 -> 180;
                        case 173 -> 165;
                        case 174 -> 162;
                        case 175 -> 254;
                        case 176 -> 209;
                        case 177 -> 158;
                        case 178 -> 21;
                        case 179 -> 69;
                        case 180 -> 41;
                        case 181 -> 48;
                        case 182 -> 206;
                        case 183 -> 238;
                        case 184 -> 159;
                        case 185 -> 219;
                        case 186 -> 34;
                        case 187 -> 147;
                        case 188 -> 75;
                        case 189 -> 167;
                        case 190 -> 119;
                        case 191 -> 125;
                        case 192 -> 19;
                        case 193 -> 26;
                        case 194 -> 173;
                        case 195 -> 166;
                        case 196 -> 164;
                        case 197 -> 13;
                        case 198 -> 61;
                        case 199 -> 11;
                        case 200 -> 216;
                        case 201 -> 42;
                        case 202 -> 66;
                        case 203 -> 142;
                        case 204 -> 117;
                        case 205 -> 234;
                        case 206 -> 49;
                        case 207 -> 207;
                        case 208 -> 186;
                        case 209 -> 105;
                        case 210 -> 63;
                        case 211 -> 198;
                        case 212 -> 10;
                        case 213 -> 195;
                        case 214 -> 252;
                        case 215 -> 215;
                        case 216 -> 39;
                        case 217 -> 171;
                        case 218 -> 236;
                        case 219 -> 67;
                        case 220 -> 235;
                        case 221 -> 214;
                        case 222 -> 15;
                        case 223 -> 170;
                        case 224 -> 76;
                        case 225 -> 151;
                        case 226 -> 97;
                        case 227 -> 92;
                        case 228 -> 72;
                        case 229 -> 107;
                        case 230 -> 150;
                        case 231 -> 102;
                        case 232 -> 53;
                        case 233 -> 131;
                        case 234 -> 27;
                        case 235 -> 25;
                        case 236 -> 143;
                        case 237 -> 20;
                        case 238 -> 228;
                        case 239 -> 204;
                        case 240 -> 74;
                        case 241 -> 188;
                        case 242 -> 200;
                        case 243 -> 196;
                        case 244 -> 121;
                        case 245 -> 251;
                        case 246 -> 100;
                        case 247 -> 58;
                        case 248 -> 110;
                        case 249 -> 44;
                        case 250 -> 28;
                        case 251 -> 211;
                        case 252 -> 225;
                        case 253 -> 149;
                        case 254 -> 17;
                        default -> 88;
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
      var10001 = -3266;
      var10002 = -24421;
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
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { byte var10006 = (byte)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = -30250;
                   var10005 = -12956;
                  var10005 = -30249;
                   var10006 = 76;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -30251;
                  short var10002 = -28533;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "âè\u0011ÑU \u0099\u00824ýX^J×½\u0016\u001e\u008eÈqûdÿ\u001bÍ\u0097·Ôéz;\n0p9Àí\u008b¹oÆÿÊè\u0093KIò³ÎQ¶gbRr~Í\u0004P\u00905\u0088\u00926\u0099®\u0006ÏþLyBbX×´j0\u0007nÕò¡O\u0013\u0086\nd~\u0097ûÕ\u0091÷\u0086eî<{Í\"\u008cú\u008akv\u0083¦Äë¦lrâ&ÍÞ#KC\u0006\u0000t\u001a\u0095ö\u0095\u0015ÚÀ\u0004\u0084\u001cY¾f\u001b»yD©\u008f\u0098/ò¤B`¤¥Ø¿»\u0015=\"0vòÀx\u0002#1";
                   var4 = "âè\u0011ÑU \u0099\u00824ýX^J×½\u0016\u001e\u008eÈqûdÿ\u001bÍ\u0097·Ôéz;\n0p9Àí\u008b¹oÆÿÊè\u0093KIò³ÎQ¶gbRr~Í\u0004P\u00905\u0088\u00926\u0099®\u0006ÏþLyBbX×´j0\u0007nÕò¡O\u0013\u0086\nd~\u0097ûÕ\u0091÷\u0086eî<{Í\"\u008cú\u008akv\u0083¦Äë¦lrâ&ÍÞ#KC\u0006\u0000t\u001a\u0095ö\u0095\u0015ÚÀ\u0004\u0084\u001cY¾f\u001b»yD©\u008f\u0098/ò¤B`¤¥Ø¿»\u0015=\"0vòÀx\u0002#1"
                     .length();
                  char var1 = 133;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 108;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 108;
                           var10006 = var6;
                        } else {
                           var13 = 108;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 108;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 55;
                              case 1 -> 96;
                              case 2 -> 65;
                              case 3 -> 8;
                              case 4 -> 113;
                              case 5 -> 119;
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
                        break pxClinit;
                     }

                     var1 = var2.charAt(var0);
                  }
               }
}

               private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
                  int var2 = (var0 ^ -30249) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 187;
                        case 1 -> 109;
                        case 2 -> 250;
                        case 3 -> 215;
                        case 4 -> 122;
                        case 5 -> 149;
                        case 6 -> 169;
                        case 7 -> 179;
                        case 8 -> 132;
                        case 9 -> 129;
                        case 10 -> 220;
                        case 11 -> 117;
                        case 12 -> 147;
                        case 13 -> 146;
                        case 14 -> 173;
                        case 15 -> 226;
                        case 16 -> 205;
                        case 17 -> 78;
                        case 18 -> 114;
                        case 19 -> 18;
                        case 20 -> 170;
                        case 21 -> 92;
                        case 22 -> 194;
                        case 23 -> 210;
                        case 24 -> 162;
                        case 25 -> 83;
                        case 26 -> 22;
                        case 27 -> 101;
                        case 28 -> 233;
                        case 29 -> 142;
                        case 30 -> 251;
                        case 31 -> 167;
                        case 32 -> 212;
                        case 33 -> 224;
                        case 34 -> 68;
                        case 35 -> 195;
                        case 36 -> 74;
                        case 37 -> 80;
                        case 38 -> 182;
                        case 39 -> 121;
                        case 40 -> 231;
                        case 41 -> 227;
                        case 42 -> 39;
                        case 43 -> 157;
                        case 44 -> 198;
                        case 45 -> 17;
                        case 46 -> 136;
                        case 47 -> 26;
                        case 48 -> 0;
                        case 49 -> 201;
                        case 50 -> 3;
                        case 51 -> 70;
                        case 52 -> 219;
                        case 53 -> 31;
                        case 54 -> 75;
                        case 55 -> 64;
                        case 56 -> 168;
                        case 57 -> 217;
                        case 58 -> 252;
                        case 59 -> 204;
                        case 60 -> 139;
                        case 61 -> 127;
                        case 62 -> 86;
                        case 63 -> 118;
                        case 64 -> 181;
                        case 65 -> 191;
                        case 66 -> 175;
                        case 67 -> 66;
                        case 68 -> 151;
                        case 69 -> 174;
                        case 70 -> 6;
                        case 71 -> 242;
                        case 72 -> 140;
                        case 73 -> 193;
                        case 74 -> 164;
                        case 75 -> 107;
                        case 76 -> 124;
                        case 77 -> 12;
                        case 78 -> 63;
                        case 79 -> 145;
                        case 80 -> 138;
                        case 81 -> 188;
                        case 82 -> 47;
                        case 83 -> 237;
                        case 84 -> 38;
                        case 85 -> 96;
                        case 86 -> 77;
                        case 87 -> 44;
                        case 88 -> 221;
                        case 89 -> 113;
                        case 90 -> 34;
                        case 91 -> 239;
                        case 92 -> 87;
                        case 93 -> 184;
                        case 94 -> 135;
                        case 95 -> 29;
                        case 96 -> 67;
                        case 97 -> 54;
                        case 98 -> 42;
                        case 99 -> 171;
                        case 100 -> 33;
                        case 101 -> 133;
                        case 102 -> 82;
                        case 103 -> 206;
                        case 104 -> 100;
                        case 105 -> 243;
                        case 106 -> 189;
                        case 107 -> 10;
                        case 108 -> 37;
                        case 109 -> 48;
                        case 110 -> 62;
                        case 111 -> 216;
                        case 112 -> 125;
                        case 113 -> 16;
                        case 114 -> 240;
                        case 115 -> 89;
                        case 116 -> 72;
                        case 117 -> 246;
                        case 118 -> 59;
                        case 119 -> 183;
                        case 120 -> 131;
                        case 121 -> 207;
                        case 122 -> 126;
                        case 123 -> 99;
                        case 124 -> 69;
                        case 125 -> 229;
                        case 126 -> 230;
                        case 127 -> 128;
                        case 128 -> 148;
                        case 129 -> 234;
                        case 130 -> 50;
                        case 131 -> 203;
                        case 132 -> 71;
                        case 133 -> 248;
                        case 134 -> 32;
                        case 135 -> 94;
                        case 136 -> 91;
                        case 137 -> 235;
                        case 138 -> 130;
                        case 139 -> 247;
                        case 140 -> 23;
                        case 141 -> 218;
                        case 142 -> 244;
                        case 143 -> 153;
                        case 144 -> 112;
                        case 145 -> 95;
                        case 146 -> 253;
                        case 147 -> 98;
                        case 148 -> 103;
                        case 149 -> 150;
                        case 150 -> 209;
                        case 151 -> 213;
                        case 152 -> 9;
                        case 153 -> 163;
                        case 154 -> 223;
                        case 155 -> 254;
                        case 156 -> 111;
                        case 157 -> 13;
                        case 158 -> 88;
                        case 159 -> 141;
                        case 160 -> 14;
                        case 161 -> 199;
                        case 162 -> 24;
                        case 163 -> 27;
                        case 164 -> 180;
                        case 165 -> 143;
                        case 166 -> 236;
                        case 167 -> 45;
                        case 168 -> 160;
                        case 169 -> 20;
                        case 170 -> 51;
                        case 171 -> 202;
                        case 172 -> 165;
                        case 173 -> 90;
                        case 174 -> 1;
                        case 175 -> 211;
                        case 176 -> 115;
                        case 177 -> 155;
                        case 178 -> 156;
                        case 179 -> 190;
                        case 180 -> 196;
                        case 181 -> 30;
                        case 182 -> 255;
                        case 183 -> 197;
                        case 184 -> 2;
                        case 185 -> 123;
                        case 186 -> 172;
                        case 187 -> 134;
                        case 188 -> 137;
                        case 189 -> 85;
                        case 190 -> 161;
                        case 191 -> 40;
                        case 192 -> 52;
                        case 193 -> 104;
                        case 194 -> 186;
                        case 195 -> 192;
                        case 196 -> 81;
                        case 197 -> 200;
                        case 198 -> 119;
                        case 199 -> 208;
                        case 200 -> 57;
                        case 201 -> 105;
                        case 202 -> 102;
                        case 203 -> 185;
                        case 204 -> 4;
                        case 205 -> 177;
                        case 206 -> 76;
                        case 207 -> 238;
                        case 208 -> 176;
                        case 209 -> 241;
                        case 210 -> 7;
                        case 211 -> 245;
                        case 212 -> 108;
                        case 213 -> 8;
                        case 214 -> 36;
                        case 215 -> 21;
                        case 216 -> 19;
                        case 217 -> 222;
                        case 218 -> 56;
                        case 219 -> 84;
                        case 220 -> 154;
                        case 221 -> 97;
                        case 222 -> 214;
                        case 223 -> 49;
                        case 224 -> 35;
                        case 225 -> 166;
                        case 226 -> 28;
                        case 227 -> 79;
                        case 228 -> 53;
                        case 229 -> 58;
                        case 230 -> 65;
                        case 231 -> 159;
                        case 232 -> 15;
                        case 233 -> 55;
                        case 234 -> 46;
                        case 235 -> 73;
                        case 236 -> 120;
                        case 237 -> 116;
                        case 238 -> 41;
                        case 239 -> 11;
                        case 240 -> 5;
                        case 241 -> 232;
                        case 242 -> 178;
                        case 243 -> 43;
                        case 244 -> 144;
                        case 245 -> 225;
                        case 246 -> 61;
                        case 247 -> 110;
                        case 248 -> 25;
                        case 249 -> 249;
                        case 250 -> 228;
                        case 251 -> 93;
                        case 252 -> 152;
                        case 253 -> 106;
                        case 254 -> 158;
                        default -> 60;
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
      var10001 = -3264;
      var10002 = -19791;
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
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = -12767;
                   var10005 = 24851;
                  var10005 = -12768;
                   var10006 = -24948;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -12766;
                  short var10002 = 29966;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "¦Ó£Àß\u0083\u0093Ç¶o~Ð\u000f]$\u0084\u0017ª5t\u001fõ \u0013PJ\u00854\u009e¥ï\u0087v@ª÷\\Wù(OLÊ]©\u008bÒk\u009bÌ\u0097ÌÉñ\u0006[Å+Iúåá}9KÖw3u\u0003*\u0005´\u009bZi¯\u008c\u0090á\fÕ?úÇ»\u00adiÝ\u0093ûw\u009b:H/\u0013\u0080Ãu\b\u0095è\u008d]´OB÷ @a(IP7G})\u000eÁ\u0094&ú_\u001fo\u0007\u001cþ=\u0001`\u001cØÍl\u0003&û¬ÈQ\u008e\u0082ì\u0090Ú×ti´ú·æ\u008d\u009f\u001c·«y\b\u0002®\u0019";
                   var4 = "¦Ó£Àß\u0083\u0093Ç¶o~Ð\u000f]$\u0084\u0017ª5t\u001fõ \u0013PJ\u00854\u009e¥ï\u0087v@ª÷\\Wù(OLÊ]©\u008bÒk\u009bÌ\u0097ÌÉñ\u0006[Å+Iúåá}9KÖw3u\u0003*\u0005´\u009bZi¯\u008c\u0090á\fÕ?úÇ»\u00adiÝ\u0093ûw\u009b:H/\u0013\u0080Ãu\b\u0095è\u008d]´OB÷ @a(IP7G})\u000eÁ\u0094&ú_\u001fo\u0007\u001cþ=\u0001`\u001cØÍl\u0003&û¬ÈQ\u008e\u0082ì\u0090Ú×ti´ú·æ\u008d\u009f\u001c·«y\b\u0002®\u0019"
                     .length();
                  char var1 = 133;
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
                              case 0 -> 107;
                              case 1 -> 5;
                              case 2 -> 80;
                              case 3 -> 114;
                              case 4 -> 47;
                              case 5 -> 25;
                              default -> 105;
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
        
                  int var2 = (var0 ^ -12768) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 113;
                        case 1 -> 80;
                        case 2 -> 37;
                        case 3 -> 220;
                        case 4 -> 180;
                        case 5 -> 133;
                        case 6 -> 194;
                        case 7 -> 34;
                        case 8 -> 156;
                        case 9 -> 109;
                        case 10 -> 198;
                        case 11 -> 5;
                        case 12 -> 63;
                        case 13 -> 181;
                        case 14 -> 249;
                        case 15 -> 48;
                        case 16 -> 204;
                        case 17 -> 140;
                        case 18 -> 167;
                        case 19 -> 241;
                        case 20 -> 85;
                        case 21 -> 210;
                        case 22 -> 253;
                        case 23 -> 26;
                        case 24 -> 95;
                        case 25 -> 6;
                        case 26 -> 46;
                        case 27 -> 119;
                        case 28 -> 27;
                        case 29 -> 247;
                        case 30 -> 92;
                        case 31 -> 14;
                        case 32 -> 96;
                        case 33 -> 193;
                        case 34 -> 151;
                        case 35 -> 161;
                        case 36 -> 136;
                        case 37 -> 59;
                        case 38 -> 182;
                        case 39 -> 121;
                        case 40 -> 126;
                        case 41 -> 30;
                        case 42 -> 78;
                        case 43 -> 82;
                        case 44 -> 76;
                        case 45 -> 43;
                        case 46 -> 87;
                        case 47 -> 234;
                        case 48 -> 61;
                        case 49 -> 240;
                        case 50 -> 239;
                        case 51 -> 219;
                        case 52 -> 47;
                        case 53 -> 100;
                        case 54 -> 195;
                        case 55 -> 153;
                        case 56 -> 224;
                        case 57 -> 215;
                        case 58 -> 88;
                        case 59 -> 77;
                        case 60 -> 93;
                        case 61 -> 42;
                        case 62 -> 221;
                        case 63 -> 53;
                        case 64 -> 205;
                        case 65 -> 176;
                        case 66 -> 60;
                        case 67 -> 71;
                        case 68 -> 208;
                        case 69 -> 56;
                        case 70 -> 13;
                        case 71 -> 64;
                        case 72 -> 196;
                        case 73 -> 168;
                        case 74 -> 225;
                        case 75 -> 158;
                        case 76 -> 227;
                        case 77 -> 169;
                        case 78 -> 245;
                        case 79 -> 139;
                        case 80 -> 66;
                        case 81 -> 232;
                        case 82 -> 132;
                        case 83 -> 183;
                        case 84 -> 163;
                        case 85 -> 11;
                        case 86 -> 246;
                        case 87 -> 99;
                        case 88 -> 138;
                        case 89 -> 248;
                        case 90 -> 8;
                        case 91 -> 33;
                        case 92 -> 150;
                        case 93 -> 238;
                        case 94 -> 41;
                        case 95 -> 32;
                        case 96 -> 177;
                        case 97 -> 123;
                        case 98 -> 185;
                        case 99 -> 231;
                        case 100 -> 200;
                        case 101 -> 217;
                        case 102 -> 207;
                        case 103 -> 143;
                        case 104 -> 197;
                        case 105 -> 102;
                        case 106 -> 70;
                        case 107 -> 199;
                        case 108 -> 165;
                        case 109 -> 230;
                        case 110 -> 166;
                        case 111 -> 116;
                        case 112 -> 49;
                        case 113 -> 104;
                        case 114 -> 91;
                        case 115 -> 142;
                        case 116 -> 155;
                        case 117 -> 173;
                        case 118 -> 15;
                        case 119 -> 73;
                        case 120 -> 125;
                        case 121 -> 79;
                        case 122 -> 10;
                        case 123 -> 90;
                        case 124 -> 111;
                        case 125 -> 216;
                        case 126 -> 75;
                        case 127 -> 243;
                        case 128 -> 191;
                        case 129 -> 12;
                        case 130 -> 149;
                        case 131 -> 175;
                        case 132 -> 69;
                        case 133 -> 159;
                        case 134 -> 244;
                        case 135 -> 222;
                        case 136 -> 188;
                        case 137 -> 235;
                        case 138 -> 3;
                        case 139 -> 84;
                        case 140 -> 170;
                        case 141 -> 17;
                        case 142 -> 19;
                        case 143 -> 105;
                        case 144 -> 29;
                        case 145 -> 127;
                        case 146 -> 22;
                        case 147 -> 108;
                        case 148 -> 20;
                        case 149 -> 98;
                        case 150 -> 31;
                        case 151 -> 101;
                        case 152 -> 206;
                        case 153 -> 62;
                        case 154 -> 209;
                        case 155 -> 218;
                        case 156 -> 83;
                        case 157 -> 229;
                        case 158 -> 129;
                        case 159 -> 190;
                        case 160 -> 201;
                        case 161 -> 141;
                        case 162 -> 103;
                        case 163 -> 45;
                        case 164 -> 118;
                        case 165 -> 171;
                        case 166 -> 16;
                        case 167 -> 211;
                        case 168 -> 57;
                        case 169 -> 192;
                        case 170 -> 202;
                        case 171 -> 110;
                        case 172 -> 94;
                        case 173 -> 122;
                        case 174 -> 18;
                        case 175 -> 203;
                        case 176 -> 146;
                        case 177 -> 23;
                        case 178 -> 145;
                        case 179 -> 65;
                        case 180 -> 54;
                        case 181 -> 137;
                        case 182 -> 236;
                        case 183 -> 134;
                        case 184 -> 1;
                        case 185 -> 152;
                        case 186 -> 154;
                        case 187 -> 254;
                        case 188 -> 250;
                        case 189 -> 135;
                        case 190 -> 74;
                        case 191 -> 147;
                        case 192 -> 213;
                        case 193 -> 184;
                        case 194 -> 226;
                        case 195 -> 228;
                        case 196 -> 233;
                        case 197 -> 251;
                        case 198 -> 36;
                        case 199 -> 114;
                        case 200 -> 72;
                        case 201 -> 242;
                        case 202 -> 2;
                        case 203 -> 115;
                        case 204 -> 68;
                        case 205 -> 148;
                        case 206 -> 178;
                        case 207 -> 25;
                        case 208 -> 130;
                        case 209 -> 40;
                        case 210 -> 214;
                        case 211 -> 4;
                        case 212 -> 58;
                        case 213 -> 212;
                        case 214 -> 124;
                        case 215 -> 55;
                        case 216 -> 106;
                        case 217 -> 38;
                        case 218 -> 131;
                        case 219 -> 144;
                        case 220 -> 24;
                        case 221 -> 157;
                        case 222 -> 39;
                        case 223 -> 223;
                        case 224 -> 112;
                        case 225 -> 35;
                        case 226 -> 81;
                        case 227 -> 179;
                        case 228 -> 44;
                        case 229 -> 172;
                        case 230 -> 86;
                        case 231 -> 187;
                        case 232 -> 164;
                        case 233 -> 174;
                        case 234 -> 67;
                        case 235 -> 21;
                        case 236 -> 28;
                        case 237 -> 9;
                        case 238 -> 162;
                        case 239 -> 97;
                        case 240 -> 160;
                        case 241 -> 89;
                        case 242 -> 107;
                        case 243 -> 237;
                        case 244 -> 120;
                        case 245 -> 7;
                        case 246 -> 0;
                        case 247 -> 52;
                        case 248 -> 117;
                        case 249 -> 186;
                        case 250 -> 50;
                        case 251 -> 128;
                        case 252 -> 189;
                        case 253 -> 255;
                        case 254 -> 252;
                        default -> 51;
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
      var10001 = -3230;
      var10002 = 3341;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Dwarven commission mining",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         15000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1<me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII, java.lang.Object>)((commission) -> IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.g(commission)),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = -8968;
                   var10005 = -14174;
                  var10005 = -8965;
                   var10006 = -815;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -8967;
                  short var10002 = 9188;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u000eÑ\u001c\u001dp\u0089Ïc°w\u001a¤\u0089Gõú\u008a!ðê_s\u0018¤ÃY\u0088\u0014Àß\u0016\u0085J@cÉ>pÜ\u0002Ñ\u008aé\u0095/\u0086\u009bq½o\u0099\u001eù\u0003ò\u0090aÃqv»c\u0016$°æ\u0001\u0098§çýÇ\u001dÂ;\u0002Ê\u001bG«Zo!åd-a³\u0092¸þóê\u0012ïü\u00973\u0097v»ØHð¥^\u0081\u0003§z\u001fb\u0086\\¼¸\f}\u0089Ê 5'\u0018\u008e\u008a\u0091Àú\u000eE*\u0085\u0005 M'\u0017\u008ek´üú\u0089ÄÚ\u0090>¦\u008efË¦q±¿\u007fÄÐò¶;\u0091k\u0086";
                   var4 = "\u000eÑ\u001c\u001dp\u0089Ïc°w\u001a¤\u0089Gõú\u008a!ðê_s\u0018¤ÃY\u0088\u0014Àß\u0016\u0085J@cÉ>pÜ\u0002Ñ\u008aé\u0095/\u0086\u009bq½o\u0099\u001eù\u0003ò\u0090aÃqv»c\u0016$°æ\u0001\u0098§çýÇ\u001dÂ;\u0002Ê\u001bG«Zo!åd-a³\u0092¸þóê\u0012ïü\u00973\u0097v»ØHð¥^\u0081\u0003§z\u001fb\u0086\\¼¸\f}\u0089Ê 5'\u0018\u008e\u008a\u0091Àú\u000eE*\u0085\u0005 M'\u0017\u008ek´üú\u0089ÄÚ\u0090>¦\u008efË¦q±¿\u007fÄÐò¶;\u0091k\u0086"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 102;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 102;
                           var10006 = var6;
                        } else {
                           var13 = 102;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 102;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 93;
                              case 1 -> 3;
                              case 2 -> 32;
                              case 3 -> 34;
                              case 4 -> 51;
                              case 5 -> 42;
                              default -> 114;
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
        
                  int var2 = (var0 ^ -8967) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 240;
                        case 1 -> 90;
                        case 2 -> 199;
                        case 3 -> 161;
                        case 4 -> 242;
                        case 5 -> 118;
                        case 6 -> 21;
                        case 7 -> 41;
                        case 8 -> 155;
                        case 9 -> 32;
                        case 10 -> 153;
                        case 11 -> 70;
                        case 12 -> 218;
                        case 13 -> 232;
                        case 14 -> 196;
                        case 15 -> 82;
                        case 16 -> 131;
                        case 17 -> 182;
                        case 18 -> 40;
                        case 19 -> 142;
                        case 20 -> 249;
                        case 21 -> 117;
                        case 22 -> 211;
                        case 23 -> 157;
                        case 24 -> 29;
                        case 25 -> 124;
                        case 26 -> 66;
                        case 27 -> 120;
                        case 28 -> 9;
                        case 29 -> 92;
                        case 30 -> 110;
                        case 31 -> 248;
                        case 32 -> 8;
                        case 33 -> 94;
                        case 34 -> 129;
                        case 35 -> 93;
                        case 36 -> 219;
                        case 37 -> 45;
                        case 38 -> 84;
                        case 39 -> 183;
                        case 40 -> 195;
                        case 41 -> 85;
                        case 42 -> 88;
                        case 43 -> 49;
                        case 44 -> 237;
                        case 45 -> 204;
                        case 46 -> 116;
                        case 47 -> 239;
                        case 48 -> 114;
                        case 49 -> 212;
                        case 50 -> 206;
                        case 51 -> 77;
                        case 52 -> 229;
                        case 53 -> 159;
                        case 54 -> 98;
                        case 55 -> 6;
                        case 56 -> 97;
                        case 57 -> 201;
                        case 58 -> 18;
                        case 59 -> 5;
                        case 60 -> 132;
                        case 61 -> 65;
                        case 62 -> 136;
                        case 63 -> 26;
                        case 64 -> 245;
                        case 65 -> 187;
                        case 66 -> 86;
                        case 67 -> 235;
                        case 68 -> 205;
                        case 69 -> 36;
                        case 70 -> 227;
                        case 71 -> 220;
                        case 72 -> 169;
                        case 73 -> 125;
                        case 74 -> 43;
                        case 75 -> 192;
                        case 76 -> 253;
                        case 77 -> 252;
                        case 78 -> 133;
                        case 79 -> 22;
                        case 80 -> 135;
                        case 81 -> 52;
                        case 82 -> 188;
                        case 83 -> 89;
                        case 84 -> 95;
                        case 85 -> 194;
                        case 86 -> 228;
                        case 87 -> 140;
                        case 88 -> 243;
                        case 89 -> 247;
                        case 90 -> 99;
                        case 91 -> 224;
                        case 92 -> 231;
                        case 93 -> 250;
                        case 94 -> 130;
                        case 95 -> 209;
                        case 96 -> 74;
                        case 97 -> 121;
                        case 98 -> 198;
                        case 99 -> 68;
                        case 100 -> 78;
                        case 101 -> 30;
                        case 102 -> 17;
                        case 103 -> 119;
                        case 104 -> 33;
                        case 105 -> 108;
                        case 106 -> 175;
                        case 107 -> 221;
                        case 108 -> 61;
                        case 109 -> 223;
                        case 110 -> 37;
                        case 111 -> 181;
                        case 112 -> 35;
                        case 113 -> 184;
                        case 114 -> 16;
                        case 115 -> 3;
                        case 116 -> 246;
                        case 117 -> 69;
                        case 118 -> 31;
                        case 119 -> 156;
                        case 120 -> 81;
                        case 121 -> 230;
                        case 122 -> 202;
                        case 123 -> 91;
                        case 124 -> 10;
                        case 125 -> 154;
                        case 126 -> 58;
                        case 127 -> 106;
                        case 128 -> 44;
                        case 129 -> 24;
                        case 130 -> 72;
                        case 131 -> 203;
                        case 132 -> 79;
                        case 133 -> 225;
                        case 134 -> 214;
                        case 135 -> 101;
                        case 136 -> 111;
                        case 137 -> 226;
                        case 138 -> 148;
                        case 139 -> 67;
                        case 140 -> 172;
                        case 141 -> 42;
                        case 142 -> 190;
                        case 143 -> 163;
                        case 144 -> 189;
                        case 145 -> 54;
                        case 146 -> 164;
                        case 147 -> 216;
                        case 148 -> 105;
                        case 149 -> 210;
                        case 150 -> 170;
                        case 151 -> 1;
                        case 152 -> 138;
                        case 153 -> 11;
                        case 154 -> 162;
                        case 155 -> 137;
                        case 156 -> 208;
                        case 157 -> 146;
                        case 158 -> 177;
                        case 159 -> 87;
                        case 160 -> 122;
                        case 161 -> 104;
                        case 162 -> 178;
                        case 163 -> 27;
                        case 164 -> 76;
                        case 165 -> 145;
                        case 166 -> 234;
                        case 167 -> 197;
                        case 168 -> 152;
                        case 169 -> 14;
                        case 170 -> 53;
                        case 171 -> 254;
                        case 172 -> 171;
                        case 173 -> 109;
                        case 174 -> 59;
                        case 175 -> 0;
                        case 176 -> 193;
                        case 177 -> 75;
                        case 178 -> 123;
                        case 179 -> 46;
                        case 180 -> 143;
                        case 181 -> 15;
                        case 182 -> 215;
                        case 183 -> 56;
                        case 184 -> 166;
                        case 185 -> 213;
                        case 186 -> 48;
                        case 187 -> 149;
                        case 188 -> 158;
                        case 189 -> 39;
                        case 190 -> 50;
                        case 191 -> 167;
                        case 192 -> 200;
                        case 193 -> 173;
                        case 194 -> 126;
                        case 195 -> 73;
                        case 196 -> 151;
                        case 197 -> 217;
                        case 198 -> 83;
                        case 199 -> 47;
                        case 200 -> 207;
                        case 201 -> 2;
                        case 202 -> 102;
                        case 203 -> 241;
                        case 204 -> 19;
                        case 205 -> 186;
                        case 206 -> 23;
                        case 207 -> 80;
                        case 208 -> 25;
                        case 209 -> 34;
                        case 210 -> 233;
                        case 211 -> 64;
                        case 212 -> 57;
                        case 213 -> 96;
                        case 214 -> 185;
                        case 215 -> 62;
                        case 216 -> 139;
                        case 217 -> 7;
                        case 218 -> 165;
                        case 219 -> 51;
                        case 220 -> 20;
                        case 221 -> 147;
                        case 222 -> 255;
                        case 223 -> 12;
                        case 224 -> 180;
                        case 225 -> 115;
                        case 226 -> 71;
                        case 227 -> 244;
                        case 228 -> 13;
                        case 229 -> 128;
                        case 230 -> 103;
                        case 231 -> 236;
                        case 232 -> 160;
                        case 233 -> 107;
                        case 234 -> 63;
                        case 235 -> 174;
                        case 236 -> 191;
                        case 237 -> 113;
                        case 238 -> 4;
                        case 239 -> 112;
                        case 240 -> 55;
                        case 241 -> 144;
                        case 242 -> 134;
                        case 243 -> 176;
                        case 244 -> 168;
                        case 245 -> 141;
                        case 246 -> 127;
                        case 247 -> 28;
                        case 248 -> 150;
                        case 249 -> 179;
                        case 250 -> 222;
                        case 251 -> 251;
                        case 252 -> 238;
                        case 253 -> 38;
                        case 254 -> 100;
                        default -> 60;
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
      var10001 = -3258;
      var10002 = 7751;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var1 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
      };
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Dwarven commission combat",
         SetsKt.setOf(var1),
         60000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1<me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII, java.lang.Object>)(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII::i),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = 24327;
                   var10005 = 28712;
                  var10005 = 24325;
                   var10006 = 917;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 24324;
                  short var10002 = -29174;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\u009b$Ö\rÂ\u007f\u0083Ä)Ý¾5RR\u0013ø#\u0016\u0000¦\n3\u009f\u0019\u0084¸ZÙù\u0085Ñ°\u0002ã\u0097\u001ff\u0098\u008db\u0084¶/\u009fÇà¬CçU\u0085-¸~m\u00194þ¥sË\u0095\u000b+\u0018F.\u0092\u001b\u0084{hL\u0005öÿ\u0089ÂÉú\u0014\u0005yS\u0093\u0013õOe\u0012_Û\u0092}Zt\u0014X¿óUvð´í\u000fÄçµ'M2\u0015¾%úZ\u00819\r^&æ\u001f\u0002\u0010X{(B\bÓu\u00021ý\u001cT\u0085/9ýùd\u0014ÕÇ!v¡:mõì·ù\u00925µxÉx¢Å\u009a";
                   var4 = "\u009b$Ö\rÂ\u007f\u0083Ä)Ý¾5RR\u0013ø#\u0016\u0000¦\n3\u009f\u0019\u0084¸ZÙù\u0085Ñ°\u0002ã\u0097\u001ff\u0098\u008db\u0084¶/\u009fÇà¬CçU\u0085-¸~m\u00194þ¥sË\u0095\u000b+\u0018F.\u0092\u001b\u0084{hL\u0005öÿ\u0089ÂÉú\u0014\u0005yS\u0093\u0013õOe\u0012_Û\u0092}Zt\u0014X¿óUvð´í\u000fÄçµ'M2\u0015¾%úZ\u00819\r^&æ\u001f\u0002\u0010X{(B\bÓu\u00021ý\u001cT\u0085/9ýùd\u0014ÕÇ!v¡:mõì·ù\u00925µxÉx¢Å\u009a"
                     .length();
                  char var1 = 133;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 59;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 59;
                           var10006 = var6;
                        } else {
                           var13 = 59;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 59;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 109;
                              case 1 -> 109;
                              case 2 -> 95;
                              case 3 -> 81;
                              case 4 -> 96;
                              case 5 -> 37;
                              default -> 46;
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
        
                  int var2 = (var0 ^ 24325) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 192;
                        case 1 -> 237;
                        case 2 -> 190;
                        case 3 -> 94;
                        case 4 -> 156;
                        case 5 -> 73;
                        case 6 -> 159;
                        case 7 -> 201;
                        case 8 -> 246;
                        case 9 -> 62;
                        case 10 -> 215;
                        case 11 -> 10;
                        case 12 -> 35;
                        case 13 -> 179;
                        case 14 -> 181;
                        case 15 -> 17;
                        case 16 -> 8;
                        case 17 -> 221;
                        case 18 -> 236;
                        case 19 -> 30;
                        case 20 -> 119;
                        case 21 -> 147;
                        case 22 -> 93;
                        case 23 -> 170;
                        case 24 -> 21;
                        case 25 -> 137;
                        case 26 -> 149;
                        case 27 -> 42;
                        case 28 -> 173;
                        case 29 -> 115;
                        case 30 -> 84;
                        case 31 -> 64;
                        case 32 -> 231;
                        case 33 -> 100;
                        case 34 -> 25;
                        case 35 -> 27;
                        case 36 -> 224;
                        case 37 -> 188;
                        case 38 -> 47;
                        case 39 -> 114;
                        case 40 -> 235;
                        case 41 -> 57;
                        case 42 -> 151;
                        case 43 -> 245;
                        case 44 -> 229;
                        case 45 -> 9;
                        case 46 -> 39;
                        case 47 -> 32;
                        case 48 -> 24;
                        case 49 -> 184;
                        case 50 -> 78;
                        case 51 -> 161;
                        case 52 -> 82;
                        case 53 -> 113;
                        case 54 -> 211;
                        case 55 -> 220;
                        case 56 -> 85;
                        case 57 -> 75;
                        case 58 -> 169;
                        case 59 -> 166;
                        case 60 -> 133;
                        case 61 -> 143;
                        case 62 -> 96;
                        case 63 -> 145;
                        case 64 -> 218;
                        case 65 -> 239;
                        case 66 -> 40;
                        case 67 -> 209;
                        case 68 -> 150;
                        case 69 -> 146;
                        case 70 -> 2;
                        case 71 -> 165;
                        case 72 -> 91;
                        case 73 -> 58;
                        case 74 -> 163;
                        case 75 -> 225;
                        case 76 -> 185;
                        case 77 -> 158;
                        case 78 -> 204;
                        case 79 -> 174;
                        case 80 -> 31;
                        case 81 -> 69;
                        case 82 -> 65;
                        case 83 -> 142;
                        case 84 -> 102;
                        case 85 -> 206;
                        case 86 -> 178;
                        case 87 -> 148;
                        case 88 -> 227;
                        case 89 -> 103;
                        case 90 -> 126;
                        case 91 -> 79;
                        case 92 -> 54;
                        case 93 -> 160;
                        case 94 -> 95;
                        case 95 -> 250;
                        case 96 -> 124;
                        case 97 -> 92;
                        case 98 -> 244;
                        case 99 -> 228;
                        case 100 -> 123;
                        case 101 -> 255;
                        case 102 -> 29;
                        case 103 -> 243;
                        case 104 -> 111;
                        case 105 -> 59;
                        case 106 -> 203;
                        case 107 -> 112;
                        case 108 -> 121;
                        case 109 -> 138;
                        case 110 -> 81;
                        case 111 -> 186;
                        case 112 -> 132;
                        case 113 -> 144;
                        case 114 -> 107;
                        case 115 -> 80;
                        case 116 -> 155;
                        case 117 -> 86;
                        case 118 -> 152;
                        case 119 -> 60;
                        case 120 -> 76;
                        case 121 -> 89;
                        case 122 -> 213;
                        case 123 -> 183;
                        case 124 -> 131;
                        case 125 -> 139;
                        case 126 -> 28;
                        case 127 -> 4;
                        case 128 -> 197;
                        case 129 -> 37;
                        case 130 -> 134;
                        case 131 -> 120;
                        case 132 -> 70;
                        case 133 -> 219;
                        case 134 -> 36;
                        case 135 -> 180;
                        case 136 -> 61;
                        case 137 -> 49;
                        case 138 -> 67;
                        case 139 -> 14;
                        case 140 -> 210;
                        case 141 -> 122;
                        case 142 -> 226;
                        case 143 -> 104;
                        case 144 -> 154;
                        case 145 -> 207;
                        case 146 -> 51;
                        case 147 -> 171;
                        case 148 -> 6;
                        case 149 -> 135;
                        case 150 -> 191;
                        case 151 -> 66;
                        case 152 -> 48;
                        case 153 -> 41;
                        case 154 -> 15;
                        case 155 -> 195;
                        case 156 -> 108;
                        case 157 -> 222;
                        case 158 -> 7;
                        case 159 -> 109;
                        case 160 -> 34;
                        case 161 -> 189;
                        case 162 -> 38;
                        case 163 -> 199;
                        case 164 -> 238;
                        case 165 -> 16;
                        case 166 -> 99;
                        case 167 -> 56;
                        case 168 -> 101;
                        case 169 -> 193;
                        case 170 -> 217;
                        case 171 -> 1;
                        case 172 -> 202;
                        case 173 -> 167;
                        case 174 -> 45;
                        case 175 -> 233;
                        case 176 -> 118;
                        case 177 -> 194;
                        case 178 -> 177;
                        case 179 -> 63;
                        case 180 -> 200;
                        case 181 -> 164;
                        case 182 -> 50;
                        case 183 -> 5;
                        case 184 -> 46;
                        case 185 -> 105;
                        case 186 -> 175;
                        case 187 -> 141;
                        case 188 -> 232;
                        case 189 -> 130;
                        case 190 -> 140;
                        case 191 -> 125;
                        case 192 -> 128;
                        case 193 -> 254;
                        case 194 -> 157;
                        case 195 -> 127;
                        case 196 -> 20;
                        case 197 -> 90;
                        case 198 -> 223;
                        case 199 -> 19;
                        case 200 -> 98;
                        case 201 -> 252;
                        case 202 -> 234;
                        case 203 -> 198;
                        case 204 -> 71;
                        case 205 -> 240;
                        case 206 -> 172;
                        case 207 -> 248;
                        case 208 -> 249;
                        case 209 -> 136;
                        case 210 -> 55;
                        case 211 -> 247;
                        case 212 -> 253;
                        case 213 -> 88;
                        case 214 -> 205;
                        case 215 -> 23;
                        case 216 -> 176;
                        case 217 -> 162;
                        case 218 -> 182;
                        case 219 -> 44;
                        case 220 -> 22;
                        case 221 -> 251;
                        case 222 -> 33;
                        case 223 -> 212;
                        case 224 -> 216;
                        case 225 -> 87;
                        case 226 -> 26;
                        case 227 -> 74;
                        case 228 -> 3;
                        case 229 -> 110;
                        case 230 -> 241;
                        case 231 -> 230;
                        case 232 -> 196;
                        case 233 -> 117;
                        case 234 -> 129;
                        case 235 -> 106;
                        case 236 -> 77;
                        case 237 -> 52;
                        case 238 -> 53;
                        case 239 -> 18;
                        case 240 -> 187;
                        case 241 -> 68;
                        case 242 -> 168;
                        case 243 -> 116;
                        case 244 -> 43;
                        case 245 -> 214;
                        case 246 -> 97;
                        case 247 -> 12;
                        case 248 -> 13;
                        case 249 -> 242;
                        case 250 -> 83;
                        case 251 -> 208;
                        case 252 -> 153;
                        case 253 -> 72;
                        case 254 -> 11;
                        default -> 0;
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
      var10001 = -3203;
      var10002 = 4802;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Dwarven commission completion",
         lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII,
         900000L,
         0L,
         null,
         true,
         false,
         null,
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { this.a(p0); return Unit.INSTANCE; }

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               { short var10006 = (short)0; // PX-FIX hoist
         short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
        
                   var10004 = 1510;
                   var10005 = 9448;
                  var10005 = 1511;
                   var10006 = 12997;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 1508;
                  short var10002 = -8894;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
         char[] var10003 = null; // PX-FIX hoist
        
   pxClinit: {
                   var5 = new String[3];
                  int var3 = 0;
                  String var2 = "?Ëj\u0092ì¼\u001en¼ n#xÈ\u0084\u008dùÚâ\u000f\u000eÔ9Í2\u009b¼å\u0085zÕÂQùÄ¼aèAä\u001f)O®}¼ÄJÌ\u001b¬\u009bÂfz6Ù¦£\u0012\u0016Ã\u0007÷QLyªçP^g¤æå1Ó\f\u0095Þ\u001d±Á|¶Ä-\u0093k´¦¼\u009fÈøVü$\u0011NüÂõ\u009eÑÜÕE0çå7\u0017\u0088½¾øµÔ\u001dÑü\u0014õàÑ\u0092Õ\u008c0ûå5\u0017í½\u0093ø\u0010Ô\u008côO1¦a:\u0006¨\u009fº¼5y\råþ·\u0090B¹d\u0002N\u0082";
                   var4 = "?Ëj\u0092ì¼\u001en¼ n#xÈ\u0084\u008dùÚâ\u000f\u000eÔ9Í2\u009b¼å\u0085zÕÂQùÄ¼aèAä\u001f)O®}¼ÄJÌ\u001b¬\u009bÂfz6Ù¦£\u0012\u0016Ã\u0007÷QLyªçP^g¤æå1Ó\f\u0095Þ\u001d±Á|¶Ä-\u0093k´¦¼\u009fÈøVü$\u0011NüÂõ\u009eÑÜÕE0çå7\u0017\u0088½¾øµÔ\u001dÑü\u0014õàÑ\u0092Õ\u008c0ûå5\u0017í½\u0093ø\u0010Ô\u008côO1¦a:\u0006¨\u009fº¼5y\råþ·\u0090B¹d\u0002N\u0082"
                     .length();
                  char var1 = 28;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                         var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                         var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 3;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 3;
                           var10006 = var6;
                        } else {
                           var13 = 3;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 3;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 44;
                              case 1 -> 29;
                              case 2 -> 96;
                              case 3 -> 2;
                              case 4 -> 1;
                              case 5 -> 64;
                              default -> 101;
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
        
                  int var2 = (var0 ^ 1510) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                      var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 94;
                        case 1 -> 95;
                        case 2 -> 211;
                        case 3 -> 159;
                        case 4 -> 9;
                        case 5 -> 232;
                        case 6 -> 236;
                        case 7 -> 52;
                        case 8 -> 96;
                        case 9 -> 64;
                        case 10 -> 99;
                        case 11 -> 91;
                        case 12 -> 83;
                        case 13 -> 160;
                        case 14 -> 73;
                        case 15 -> 147;
                        case 16 -> 112;
                        case 17 -> 36;
                        case 18 -> 179;
                        case 19 -> 173;
                        case 20 -> 134;
                        case 21 -> 152;
                        case 22 -> 226;
                        case 23 -> 33;
                        case 24 -> 0;
                        case 25 -> 150;
                        case 26 -> 191;
                        case 27 -> 154;
                        case 28 -> 205;
                        case 29 -> 228;
                        case 30 -> 221;
                        case 31 -> 121;
                        case 32 -> 76;
                        case 33 -> 65;
                        case 34 -> 141;
                        case 35 -> 35;
                        case 36 -> 235;
                        case 37 -> 125;
                        case 38 -> 10;
                        case 39 -> 54;
                        case 40 -> 34;
                        case 41 -> 185;
                        case 42 -> 88;
                        case 43 -> 169;
                        case 44 -> 129;
                        case 45 -> 171;
                        case 46 -> 138;
                        case 47 -> 15;
                        case 48 -> 3;
                        case 49 -> 47;
                        case 50 -> 188;
                        case 51 -> 57;
                        case 52 -> 176;
                        case 53 -> 200;
                        case 54 -> 242;
                        case 55 -> 231;
                        case 56 -> 111;
                        case 57 -> 120;
                        case 58 -> 153;
                        case 59 -> 209;
                        case 60 -> 244;
                        case 61 -> 90;
                        case 62 -> 133;
                        case 63 -> 186;
                        case 64 -> 108;
                        case 65 -> 80;
                        case 66 -> 219;
                        case 67 -> 84;
                        case 68 -> 227;
                        case 69 -> 56;
                        case 70 -> 19;
                        case 71 -> 241;
                        case 72 -> 181;
                        case 73 -> 93;
                        case 74 -> 50;
                        case 75 -> 28;
                        case 76 -> 70;
                        case 77 -> 113;
                        case 78 -> 5;
                        case 79 -> 100;
                        case 80 -> 8;
                        case 81 -> 13;
                        case 82 -> 168;
                        case 83 -> 62;
                        case 84 -> 74;
                        case 85 -> 136;
                        case 86 -> 12;
                        case 87 -> 255;
                        case 88 -> 68;
                        case 89 -> 187;
                        case 90 -> 143;
                        case 91 -> 194;
                        case 92 -> 37;
                        case 93 -> 220;
                        case 94 -> 239;
                        case 95 -> 4;
                        case 96 -> 155;
                        case 97 -> 49;
                        case 98 -> 142;
                        case 99 -> 190;
                        case 100 -> 126;
                        case 101 -> 229;
                        case 102 -> 44;
                        case 103 -> 27;
                        case 104 -> 199;
                        case 105 -> 105;
                        case 106 -> 183;
                        case 107 -> 29;
                        case 108 -> 252;
                        case 109 -> 224;
                        case 110 -> 174;
                        case 111 -> 127;
                        case 112 -> 250;
                        case 113 -> 18;
                        case 114 -> 107;
                        case 115 -> 230;
                        case 116 -> 163;
                        case 117 -> 59;
                        case 118 -> 192;
                        case 119 -> 110;
                        case 120 -> 17;
                        case 121 -> 245;
                        case 122 -> 177;
                        case 123 -> 124;
                        case 124 -> 210;
                        case 125 -> 45;
                        case 126 -> 87;
                        case 127 -> 66;
                        case 128 -> 240;
                        case 129 -> 89;
                        case 130 -> 16;
                        case 131 -> 218;
                        case 132 -> 139;
                        case 133 -> 146;
                        case 134 -> 86;
                        case 135 -> 109;
                        case 136 -> 114;
                        case 137 -> 40;
                        case 138 -> 53;
                        case 139 -> 207;
                        case 140 -> 128;
                        case 141 -> 60;
                        case 142 -> 222;
                        case 143 -> 156;
                        case 144 -> 117;
                        case 145 -> 104;
                        case 146 -> 203;
                        case 147 -> 48;
                        case 148 -> 51;
                        case 149 -> 253;
                        case 150 -> 149;
                        case 151 -> 71;
                        case 152 -> 145;
                        case 153 -> 82;
                        case 154 -> 119;
                        case 155 -> 14;
                        case 156 -> 137;
                        case 157 -> 2;
                        case 158 -> 61;
                        case 159 -> 85;
                        case 160 -> 202;
                        case 161 -> 148;
                        case 162 -> 206;
                        case 163 -> 38;
                        case 164 -> 237;
                        case 165 -> 212;
                        case 166 -> 6;
                        case 167 -> 115;
                        case 168 -> 69;
                        case 169 -> 151;
                        case 170 -> 118;
                        case 171 -> 132;
                        case 172 -> 204;
                        case 173 -> 246;
                        case 174 -> 32;
                        case 175 -> 98;
                        case 176 -> 131;
                        case 177 -> 92;
                        case 178 -> 144;
                        case 179 -> 102;
                        case 180 -> 41;
                        case 181 -> 123;
                        case 182 -> 157;
                        case 183 -> 243;
                        case 184 -> 172;
                        case 185 -> 122;
                        case 186 -> 135;
                        case 187 -> 63;
                        case 188 -> 140;
                        case 189 -> 164;
                        case 190 -> 214;
                        case 191 -> 130;
                        case 192 -> 197;
                        case 193 -> 22;
                        case 194 -> 81;
                        case 195 -> 180;
                        case 196 -> 178;
                        case 197 -> 233;
                        case 198 -> 254;
                        case 199 -> 251;
                        case 200 -> 46;
                        case 201 -> 26;
                        case 202 -> 67;
                        case 203 -> 248;
                        case 204 -> 223;
                        case 205 -> 234;
                        case 206 -> 196;
                        case 207 -> 30;
                        case 208 -> 55;
                        case 209 -> 208;
                        case 210 -> 201;
                        case 211 -> 116;
                        case 212 -> 11;
                        case 213 -> 101;
                        case 214 -> 247;
                        case 215 -> 21;
                        case 216 -> 184;
                        case 217 -> 42;
                        case 218 -> 103;
                        case 219 -> 31;
                        case 220 -> 217;
                        case 221 -> 166;
                        case 222 -> 198;
                        case 223 -> 97;
                        case 224 -> 170;
                        case 225 -> 75;
                        case 226 -> 1;
                        case 227 -> 162;
                        case 228 -> 215;
                        case 229 -> 58;
                        case 230 -> 161;
                        case 231 -> 175;
                        case 232 -> 216;
                        case 233 -> 72;
                        case 234 -> 167;
                        case 235 -> 195;
                        case 236 -> 249;
                        case 237 -> 7;
                        case 238 -> 106;
                        case 239 -> 77;
                        case 240 -> 20;
                        case 241 -> 165;
                        case 242 -> 238;
                        case 243 -> 25;
                        case 244 -> 193;
                        case 245 -> 79;
                        case 246 -> 182;
                        case 247 -> 158;
                        case 248 -> 189;
                        case 249 -> 213;
                        case 250 -> 78;
                        case 251 -> 39;
                        case 252 -> 23;
                        case 253 -> 24;
                        case 254 -> 225;
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
   }

   @Override
   public void aC() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      net.minecraft.core.BlockPos var126 = null;
      boolean var133 = false;
      net.minecraft.world.entity.Entity var130 = null;
      boolean var140 = false;
      net.minecraft.world.entity.Entity var137 = null;
      Object var90 = null;
      boolean var168 = false;
      me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var152 = null;
      net.minecraft.client.player.LocalPlayer var10000 = this.ap().player;
      if (var10000 != null) {
         net.minecraft.client.player.LocalPlayer var2 = var10000;
         if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.n()) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .t();
         } else if ((
               this.W()
                     == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  || this.W()
                     == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl
                  || this.W()
                     == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
            )
            && this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll) {
            this.aO();
            boolean var40 = this.W()
                  == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl
               || this.W()
                  == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
            this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
            this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = null;
            this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
            this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = false;
            this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = false;
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var41 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .t();
            if (var41 != null) {
               this.bD();
            }

            if (var40 && this.by()) {
               this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               this.a(
                  me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
                  2000
               );
            } else {
               this.a(
                  IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                     .S()
               );
            }
         } else {
            if (this.W()
               == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               )
             {
               label1216: {
                  if (this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI != null) {
                     me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var125 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI
                        .a();
                     if (var125 != null) {
                        var126 = var125.b();
                        break label1216;
                     }
                  }

                  var126 = null;
               }

               net.minecraft.core.BlockPos var3 = var126;
               if (var3 != null) {
                  label1210: {
                     net.minecraft.world.phys.Vec3 var127 = var3.getCenter();
                     kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var127, "getCenter(...)");
                     net.minecraft.world.phys.Vec3 var4 = var127;
                     net.minecraft.client.multiplayer.ClientLevel var128 = this.ap().level;
                     if (var128 != null) {
                        Iterable var129 = var128.entitiesForRendering();
                        if (var129 != null) {
                           Iterable var9 = var129;
                           java.util.Iterator var10 = var9.iterator();

                           while (true) {
                              if (!var10.hasNext()) {
                                 var10000 = null;
                                 break;
                              }

                              Object var11;
                              label1202: {
                                 var11 = var10.next();
                                 net.minecraft.world.entity.Entity var12 = (net.minecraft.world.entity.Entity)var11;
                                 boolean var13 = false;
                                 String var131 = var12.getName().getString();
                                 kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var131, "getString(...)");
                                 if (var131.contains("Star Sentry")) {
                                    me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var132 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(var12);
                                    if (var132.a(
                                          var4,
                                          me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                                             var12
                                          ),
                                          3.0
                                       )
                                       && Math.abs(var2.getY() - var12.getY()) <= 3.0) {
                                       var133 = true;
                                       break label1202;
                                    }
                                 }

                                 var133 = false;
                              }

                              if (var133) {
                                 var10000 = (net.minecraft.client.player.LocalPlayer)var11;
                                 break;
                              }
                           }

                           var130 = (net.minecraft.world.entity.Entity)var10000;
                           break label1210;
                        }
                     }

                     var130 = null;
                  }

                  net.minecraft.world.entity.Entity var5 = var130;
                  if (var5 != null) {
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                        "§c[Star Sentry] Detected! Lobby hopping for safety"
                     );
                     this.aO();
                     this.a(
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                        5000
                     );
                     return;
                  }
               }
            }

            if (this.W()
                  == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
               || this.W()
                  == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl
               )
             {
               label1186: {
                  net.minecraft.client.multiplayer.ClientLevel var135 = this.ap().level;
                  if (var135 != null) {
                     Iterable var136 = var135.entitiesForRendering();
                     if (var136 != null) {
                        Iterable var7 = var136;
                        java.util.Iterator var8 = var7.iterator();

                        while (true) {
                           if (!var8.hasNext()) {
                              var10000 = null;
                              break;
                           }

                           Object var52;
                           label1178: {
                              var52 = var8.next();
                              net.minecraft.world.entity.Entity var59 = (net.minecraft.world.entity.Entity)var52;
                              boolean var65 = false;
                              String var138 = var59.getName().getString();
                              kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var138, "getString(...)");
                              if (var138.contains("Black Hole")) {
                                 me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var139 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                 kotlin.jvm.internal.Intrinsics.checkNotNull(var59);
                                 if (var139.b(
                                       me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                                          var59
                                       ),
                                       true
                                    )
                                    < 30.0) {
                                    var140 = true;
                                    break label1178;
                                 }
                              }

                              var140 = false;
                           }

                           if (var140) {
                              var10000 = (net.minecraft.client.player.LocalPlayer)var52;
                              break;
                           }
                        }

                        var137 = (net.minecraft.world.entity.Entity)var10000;
                        break label1186;
                     }
                  }

                  var137 = null;
               }

               net.minecraft.world.entity.Entity var39 = var137;
               if (var39 != null) {
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§c[Black Hole] Detected! Lobby hopping for safety"
                  );
                  this.aO();
                  this.a(
                     me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                     5000
                  );
                  return;
               }
            }

            switch (me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[this.W()
               .ordinal()]) {
               case 1:
                  if (!this.aK()) {
                     return;
                  }

                  switch (me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[this.aJ()
                     .a()
                     .ordinal()]) {
                     case 1:
                        this.a(
                           me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
                           2000
                        );
                        return;
                     case 2:
                        switch (this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl == null
                           ? -1
                           : me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl
                              .ordinal()]) {
                           case -1:
                              this.ba();
                              return;
                           case 0:
                           default:
                              throw new kotlin.NoWhenBranchMatchedException();
                           case 1:
                              this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = null;
                              me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var58 = this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
                              this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = null;
                              if (var58 != null) {
                                 this.a(var58);
                              } else {
                                 this.ba();
                              }

                              return;
                           case 2:
                              this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = null;
                              this.a(
                                 IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                                    .S()
                              );
                              return;
                           case 3:
                              this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = null;
                              this.bz();
                              return;
                           case 4:
                              this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = null;
                              this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.clear();
                              if (this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl != null) {
                                 this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
                                 this.a(
                                    me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
                                 );
                              } else {
                                 this.ba();
                              }

                              return;
                        }
                     default:
                        return;
                  }
               case 2:
                  if (this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII == null) {
                     return;
                  }

                  me.octo.client.utils.IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var45 = this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
                  double var46 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var45.b(), true);
                  if (var46 < 3.0) {
                     this.bA();
                     if (!IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e()
                        .d()) {
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e()
                           .k();
                     }

                     me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(var45.b());
                     if (this.e(0)) {
                        return;
                     }

                     Integer var161;
                     if (IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .c()
                        .al()) {
                        var161 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .G();
                        if (var161 == null) {
                           me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var162 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .q();
                           var161 = var162 != null ? var162.b() : null;
                        }
                     } else {
                        me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var163 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .q();
                        var161 = var163 != null ? var163.b() : null;
                     }

                     Integer var50 = var161;
                     if (var50 != null) {
                        int var64 = var50.intValue();
                        boolean var70 = false;
                        if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .K()
                           != var64) {
                           me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .b(var64);
                           return;
                        }
                     } else {
                        var10000 = null;
                     }

                     if (Math.abs(
                              me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .c(var45.b())
                                 .a()
                           )
                           < 10.0F
                        && this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI.a((Number) 500)) {
                        net.minecraft.client.multiplayer.ClientLevel var165 = this.ap().level;
                        if (var165 == null) {
                           return;
                        }

                        net.minecraft.client.multiplayer.ClientLevel var51 = var165;
                        Iterable var166 = var51.entitiesForRendering();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var166, "entitiesForRendering(...)");
                        Iterable var71 = var166;
                        boolean var77 = false;
                        var var89 = new java.util.ArrayList();
                        boolean var94 = false;

                        for (Object var106 : var71) {
                           if (var106 instanceof net.minecraft.client.player.RemotePlayer) {
                              var89.add(var106);
                           }
                        }

                        var71 = var89;
                        var77 = false;
                        java.util.Iterator var84 = var71.iterator();

                        while (true) {
                           if (!var84.hasNext()) {
                              var10000 = null;
                              break;
                           }

                           label1148: {
                              var90 = var84.next();
                              net.minecraft.client.player.RemotePlayer var95 = (net.minecraft.client.player.RemotePlayer)var90;
                              boolean var101 = false;
                              if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .c(me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((net.minecraft.world.entity.Entity)var95), var45.b())
                                 < 0.3) {
                                 var var107 = this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
                                 boolean var112 = false;
                                 boolean var167;
                                 if (var107 instanceof java.util.Collection && ((java.util.Collection)var107).isEmpty()) {
                                    var167 = false;
                                 } else {
                                    java.util.Iterator var116 = var107.iterator();

                                    while (true) {
                                       if (!var116.hasNext()) {
                                          var167 = false;
                                          break;
                                       }

                                       Object var120 = var116.next();
                                       kotlin.Pair var123 = (kotlin.Pair)var120;
                                       boolean var22 = false;
                                       if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                                .c(
                                                   me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((net.minecraft.world.entity.Entity)var95),
                                                   (net.minecraft.world.phys.Vec3)var123.getSecond()
                                                )
                                             < 0.3
                                          && kotlin.jvm.internal.Intrinsics.areEqual(
                                             me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(
                                                var95
                                             ),
                                             var123.getFirst()
                                          )) {
                                          var167 = true;
                                          break;
                                       }
                                    }
                                 }

                                 if (var167) {
                                    var168 = true;
                                    break label1148;
                                 }
                              }

                              var168 = false;
                           }

                           if (var168) {
                              Object tmp170 = var90;
                              break;
                           }
                        }

                        net.minecraft.client.player.RemotePlayer var170 = (net.minecraft.client.player.RemotePlayer)var90;
                        if (var170 == null) {
                           return;
                        }

                        net.minecraft.client.player.RemotePlayer var57 = var170;
                        me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a((net.minecraft.world.entity.Entity)var57);
                        this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI.f();
                     }
                  } else if (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e()
                     .d()) {
                     this.a(var45.a(), var45.b());
                  }
                  break;
               case 3:
                  if (!me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g()) {
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .t();
                     return;
                  }

                  if (me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("attack")) {
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("attack", false);
                     return;
                  }

                  if (this.e(0)) {
                     return;
                  }

                  if (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(
                              me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.a(
                                    me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                                    me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
                                    0,
                                    2,
                                    null
                                 )
                                 .c(),
                              me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((net.minecraft.world.entity.Entity)var2)
                           )
                        < 2.0
                     && me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .H()
                        != null) {
                     me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(0.0F, 0.0F);
                  } else {
                     me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .g();
                  }

                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var156 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .t();
                  if (var156 == null) {
                     return;
                  }

                  me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var44 = var156;
                  if (!this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI) {
                     if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .K()
                        != var44.b()) {
                        me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .b(var44.b());
                        this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI.f();
                        this.bE();
                        return;
                     }
                  } else if (IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                     .al()) {
                     Integer var157 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .G();
                     if (var157 == null) {
                        me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var158 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .q();
                        var157 = var158 != null ? var158.b() : null;
                     }

                     if (var157 != null) {
                        int var49 = var157.intValue();
                        boolean var56 = false;
                        if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .K()
                           != var49) {
                           var10000 = this.ap().player;
                           kotlin.jvm.internal.Intrinsics.checkNotNull(var10000);
                           var10000.getInventory().setSelectedSlot(var49);
                           return;
                        }
                     } else {
                        var10000 = null;
                     }
                  }

                  if (this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI) {
                     if (this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI.a((Number) 400)) {
                        this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = false;
                     }
                  } else if (this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI
                        .a((Number) this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll)
                     && me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .k()) {
                     this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI.f();
                     this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = true;
                     this.bE();
                  }
                  break;
               case 4:
                  if (this.e(1)) {
                     return;
                  }

                  if (this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl == null) {
                     return;
                  }

                  llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var43 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
                  if (var43.a().contains("Slayer") && this.f(var43.a())) {
                     this.bx();
                     return;
                  }

                  java.util.List var6 = this.bs();
                  me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var47 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI
                        != null
                     ? this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.a()
                     : null;
                  boolean var48 = var47 == null
                     || this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.contains(var47.a().a())
                     || lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var47.a().a(), var6);
                  if (var48) {
                     label1074: {
                        if (this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI != null) {
                           java.util.List var151 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.b();
                           if (var151 != null) {
                              Iterable var76 = var151;
                              boolean var81 = false;
                              java.util.Iterator var86 = var76.iterator();

                              me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var98 = null;
                              while (true) {
                                 if (!var86.hasNext()) {
                                    var10000 = null;
                                    break;
                                 }

                                 Object var91 = var86.next();
                                 var98 = (me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var91;
                                 boolean var104 = false;
                                 if (!this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.contains(var98.a().a())
                                    && !lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .a(var98.a().a(), var6)) {
                                    
                                    break;
                                 }
                              }

                              var152 = (me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var98;
                              break label1074;
                           }
                        }

                        var152 = null;
                     }

                     me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var54 = var152;
                     if (var54 != null) {
                        int var171 = var54.a().a().getX();
                        int var32 = var54.a().a().getZ();
                        int var33 = var54.a().a().getY();
                        int var34 = var171;
                        this.e("occupied, swap → " + var34 + "," + var33 + "," + var32);
                        me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var173 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI);
                        Iterable var61 = var173.b();
                        boolean var68 = false;
                        var var82 = new java.util.ArrayList();
                        boolean var87 = false;

                        for (Object var99 : var61) {
                           me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var105 = (me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var99;
                           boolean var111 = false;
                           if (var105 != var54) {
                              var82.add(var99);
                           }
                        }

                        java.util.List var124 = var82;
                        this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var54, var124
                        );
                     } else {
                        if (var47 != null && !this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII.a((Number) 750L)) {
                           return;
                        }

                        this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII.f();
                        me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var62 = lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(
                              var43.c(),
                              kotlin.collections.CollectionsKt.toSet(this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI),
                              var6,
                              this.bp(),
                              IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .g()
                                 .al()
                           );
                        if (var62 == null) {
                           this.bq();
                           return;
                        }

                        this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = var62;
                     }

                     this.br();
                     this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll.f();
                  } else if (this.bp() && this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll.a((Number) 2500L)) {
                     this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll.f();
                     me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var149 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
                     kotlin.jvm.internal.Intrinsics.checkNotNull(this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI);
                     me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var53 = var149;
                     java.util.List var60 = kotlin.collections.CollectionsKt.plus(kotlin.collections.CollectionsKt.listOf(var53.a()), var53.b());
                     Iterable var74 = var60;
                     boolean var79 = false;
                     java.util.LinkedHashMap var14 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(var74, 10)), 16));
                     java.util.Map var16 = var14;
                     boolean var17 = false;

                     for (Object var19 : var74) {
                        me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var20 = (me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var19;
                        boolean var21 = false;
                        Integer var25 = llIllllIIIIlIIlllIIllIIlIIlIllIlllIIllIIlIIlIllIllllIlIlIIIllIIlIllIIlIIlIIlIIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var20.a().a());
                        var16.put(var19, var25);
                     }

                     Iterable var15 = var16.entrySet();
                     java.util.Iterator var96 = var15.iterator();
                     if (!var96.hasNext()) {
                        var10000 = null;
                     } else {
                        Object var102 = var96.next();
                        if (!var96.hasNext()) {
                           var10000 = (net.minecraft.client.player.LocalPlayer)var102;
                        } else {
                           java.util.Map.Entry var108 = (java.util.Map.Entry)var102;
                           boolean var113 = false;
                           int var109 = ((Number)var108.getValue()).intValue();

                           do {
                              Object var114 = var96.next();
                              java.util.Map.Entry var117 = (java.util.Map.Entry)var114;
                              boolean var121 = false;
                              int var118 = ((Number)var117.getValue()).intValue();
                              if (var109 < var118) {
                                 var102 = var114;
                                 var109 = var118;
                              }
                           } while (var96.hasNext());

                           var10000 = (net.minecraft.client.player.LocalPlayer)var102;
                        }
                     }

                     me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var75 = (java.util.Map.Entry)var10000
                           != null
                        ? (me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)((java.util.Map.Entry)var10000)
                           .getKey()
                        : null;
                     if (var75 != null
                        && var75 != var53.a()
                        && ((Number)kotlin.collections.MapsKt.getValue(var16, var75)).intValue() > ((Number)kotlin.collections.MapsKt.getValue(var16, var53.a())).intValue()) {
                        int var10001 = var75.a().a().getX();
                        int var10002 = var75.a().a().getY();
                        int var10003 = var75.a().a().getZ();
                        Object var35 = kotlin.collections.MapsKt.getValue(var16, var75);
                        int var36 = var10003;
                        int var37 = var10002;
                        int var38 = var10001;
                        this.e("titanium re-target → " + var38 + "," + var37 + "," + var36 + " (Ti " + var35 + ")");
                        Iterable var80 = var60;
                        boolean var85 = false;
                        var var97 = new java.util.ArrayList();
                        var17 = false;

                        for (Object var115 : var80) {
                           me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var119 = (me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var115;
                           boolean var122 = false;
                           if (var119 != var75) {
                              var97.add(var115);
                           }
                        }

                        java.util.List var27 = var97;
                        this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var75, var27
                        );
                     }
                  }

                  lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var55State =
                     this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
                  if (this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI == null) {
                     return;
                  }

                  me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var55 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI
                     .a();
                  if (var55State.a().a().b()
                     == me.octo.client.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     )
                   {
                     llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl var155 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .f();
                     net.minecraft.core.BlockPos var172 = var55State.a().a().a();
                     me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var174 = this.X();
                     if (var155.a(var172, var174 != null ? var174.b() : null)) {
                        this.br();
                        this.bx();
                     }

                     return;
                  }

                  net.minecraft.world.phys.Vec3 var63 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g(var55State.a().b());
                  double var69 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var63, false);
                  net.minecraft.world.phys.Vec3 var83 = me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a((net.minecraft.world.entity.Entity)var2);
                  if (!me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.a(
                        me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        var83,
                        var63,
                        null,
                        0,
                        false,
                        0.0,
                        false,
                        true,
                        0.0,
                        380,
                        null
                     )
                     || Math.abs(var83.y - var63.y) >= 2.5) {
                     this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI.f();
                  }

                  if (var69 < 6.0 && this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI.a((Number) 300)) {
                     this.bA();
                     if (!IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e()
                        .d()) {
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e()
                           .k();
                     }

                     if (var43.a().contains("Slayer")) {
                        this.bx();
                        return;
                     }

                     if (me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var63, var83, 0.7)
                        && !me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .j()
                           .a((Number) 500)) {
                        this.bx();
                        return;
                     }

                     if (me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(var63, var83, 2.0)) {
                        me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .g();
                     } else {
                        net.minecraft.world.phys.Vec3 var154 = var63.add(
                           me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.g()
                        );
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var154, "add(...)");
                        me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(var154);
                     }

                     boolean var88 = !me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .j()
                        .a((Number) 100);
                     double var93 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var63, var83, 1.0)
                        ? 0.2
                        : 0.4;
                     if (var88
                        && !(
                           me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .Q()
                              > var93
                        )) {
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                           var83,
                           var63,
                           false,
                           0.0,
                           12,
                           null
                        );
                     } else {
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .p();
                        if (!var88) {
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a("backward", true);
                        }
                     }

                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(
                           "jump",
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .j()
                        );
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a(
                           "sneak",
                           !me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .P()
                              && Math.abs(var2.getY() - var63.y) < 0.5
                              && me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var63, var83, 1.5)
                        );
                  } else if (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e()
                        .d()
                     || !kotlin.jvm.internal.Intrinsics.areEqual(var55State.a().b(), this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl)) {
                     a(this, var55State.a().b(), null, 2, null);
                     this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = var55State.a().b();
                  }
                  break;
               case 5:
                  if (this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI == null) {
                     return;
                  }

                  me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var142 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI
                     .a();
                  if (var142 == null) {
                     return;
                  }

                  net.minecraft.core.BlockPos var143 = var142.b();
                  if (var143 == null) {
                     return;
                  }

                  net.minecraft.core.BlockPos var42 = var143;
                  if (!lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .a()
                        .b()
                     && !this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl) {
                     var10000 = this.ap().player;
                     kotlin.jvm.internal.Intrinsics.checkNotNull(var10000);
                     if (var10000.onGround()) {
                        lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .a(
                              IIlIIlIlIlIIIlIIIIIlIlllllIlIIIlllIllllIlIIlIlIIIllllIllIllllIlIlIIIlIIlIIlllllIIlIII.PXEvMid.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                           );
                        lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .k(this.bp());
                        lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .a(
                              IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .e()
                                 .M()
                           );
                        lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .d(
                              IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b()
                                 .al()
                           );
                        lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .l(false);
                        lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .c(
                              IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a()
                                 .c("Mining Ability")
                           );
                        lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .c(var42);
                        this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = false;
                     }
                  } else if (lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .a()
                        .b()
                     && !this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl
                     && !this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll
                     && IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .f()
                        .al()) {
                     if (!lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                        .a()
                        .aa()) {
                        this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = true;
                     } else if (this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl) {
                        label996: {
                           if (this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI != null) {
                              me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var144 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI
                                 .a();
                              if (var144 != null) {
                                 lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var145 = var144.a();
                                 if (var145 != null) {
                                    net.minecraft.core.BlockPos var146 = var145.a();
                                    if (var146 != null) {
                                       net.minecraft.core.BlockPos var66 = var146;
                                       boolean var73 = false;
                                       Boolean.valueOf(this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.add(var66));
                                       break label996;
                                    }
                                 }
                              }
                           }

                           var10000 = null;
                        }

                        this.e("no reachable target — retargeting");
                        lIllIIIIIlIIllIlllIIlIIIIIlIlIlIlIIIllIIlIlIlIIIIIIlllIIIlIllIlIIlIIllIIllIlIIIIIlIll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .a()
                           .j(false);
                        this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
                        this.a(
                           me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
                        );
                     }
                  }
                  break;
               case 6:
                  if (!IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .g()
                        .c()
                     && !this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl) {
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .g()
                        .o();
                  }
                  break;
               case 7:
                  if (!IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .h()
                        .c()
                     && !this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl) {
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .h()
                        .c(false);
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .h()
                        .b(true);
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .h()
                        .o();
                  }
               case 8:
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@org.jetbrains.annotations.NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "event");
      String var10000 = var1.k();
      if (var10000 != null) {
         String var3 = var10000;
         java.util.List var14 = var1.m();
         if (var14 != null) {
            java.util.List var4 = var14;
            switch (me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[this.W()
               .ordinal()]) {
               case 2:
               case 3:
                  if (!kotlin.jvm.internal.Intrinsics.areEqual(var3, "Commissions")
                     || !this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI
                        .a((Number) this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll)) {
                     return;
                  } else {
                     var var5 = kotlin.collections.CollectionsKt.take(var4, 27);
                     boolean var6 = false;
                     boolean var15;
                     if (var5 instanceof java.util.Collection && ((java.util.Collection)var5).isEmpty()) {
                        var15 = false;
                     } else {
                        java.util.Iterator var7 = var5.iterator();

                        while (true) {
                           if (!var7.hasNext()) {
                              var15 = false;
                              break;
                           }

                           Object var8 = var7.next();
                           net.minecraft.world.inventory.Slot var9 = (net.minecraft.world.inventory.Slot)var8;
                           boolean var10 = false;
                           if (var9.getItem().isEmpty()) {
                              var15 = true;
                              break;
                           }
                        }
                     }

                     if (var15) {
                        return;
                     } else {
                        Integer var11 = this.b(var1);
                        if (var11 != null) {
                           me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var11.intValue(), 0, net.minecraft.world.inventory.ContainerInput.PICKUP);
                           this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI.f();
                           this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .e();
                           return;
                        } else {
                           java.util.List var16 = this.c(var1);
                           if (var16 == null) {
                              return;
                           } else {
                              java.util.List var12 = var16;
                              if (var12.isEmpty()) {
                                 return;
                              } else {
                                 net.minecraft.client.player.LocalPlayer var17 = this.ap().player;
                                 if (var17 != null) {
                                    var17.closeContainer();
                                 }

                                 me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var13 = this.c(var12);
                                 if (this.W()
                                       == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI
                                    && IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .d()
                                       .al()
                                    && this.a(this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll)
                                    && !this.a(var13.a())) {
                                    this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = var13;
                                    this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                    this.a(
                                       me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
                                       2000
                                    );
                                 } else {
                                    this.a(var13);
                                 }
                              }
                           }
                        }
                     }
                  }
            }
         }
      }
   }

   @SubscribeEvent
   public final void c(@org.jetbrains.annotations.NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      net.minecraft.network.protocol.Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var3 instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket) {
         if (((net.minecraft.network.protocol.game.ClientboundSystemChatPacket)var3).overlay()) {
            return;
         }

         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var10000 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var10001 = ((net.minecraft.network.protocol.game.ClientboundSystemChatPacket)var3).content().getString();
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
         String var4 = var10000.a(var10001);
         if ((
               this.W()
                     == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  || this.W()
                     == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl
                  || this.W()
                     == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
            )
            && !var4.startsWith("[")
            && !var4.startsWith("From")
            && var4.contains(" Commission Complete! ")) {
            me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var5 = this.W();
            new Thread(() -> a(this)).start();
         }

         if (var4.startsWith("Oh no! Your")) {
            me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(1000L, () -> j(this));
         }
      }
   }

   @SubscribeEvent
   public final void b(@org.jetbrains.annotations.NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(var1, "event");
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = false;
   }

   private final boolean e(int param1) {
      if (!me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g()) { return true; }
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a(me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, false, 1, null);
      if (var3 != null && me.octo.client.IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a().c("Claiming Commission")) {
         if (this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll == param1) {
            if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.K() != var3.b()) {
               me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(var3.b());
               this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll.f();
               this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
               return true;
            }
            if (this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll.a((Number)this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll)) {
               if (me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.k()) {
                  this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll + 1;
                  this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll.f();
                  this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
               }
            }
            return true;
         }
         if (this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll == param1 + 1 && !this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll.a((Number)this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll)) { return true; }
      }
      return false;
   }

    private final void bq() {
       if (!this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI) {
          this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = true;
          this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl.f();
          this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = false;
       }
       this.aO();
       if (!this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII) {
          if (this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl.a((java.lang.Number) java.lang.Long.valueOf(8000L))) {
             this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = true;
             this.e("no veins 8s \u2192 warp forge & reselect");
             this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
             this.a(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, 2000);
             return;
          }
       }
       if (this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl.a((java.lang.Number) java.lang.Long.valueOf(16000L))) {
          me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7e[Dwarven] No reachable veins \u2192 lobby");
       }
       this.a(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, 10000);
    }

   private final void br() {
      this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = false;
      this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = false;
   }

   private final java.util.List<net.minecraft.world.phys.Vec3> bs() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      net.minecraft.client.multiplayer.ClientLevel var10000 = this.ap().level;
      if (var10000 == null) {
         return kotlin.collections.CollectionsKt.emptyList();
      } else {
         net.minecraft.client.multiplayer.ClientLevel var2 = var10000;
         java.util.List var35 = var2.players();
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var35, "players(...)");
         Iterable var3 = var35;
         boolean var4 = false;
         var var6 = new java.util.ArrayList();
         boolean var7 = false;

         for (Object var9 : var3) {
            net.minecraft.client.player.AbstractClientPlayer var10 = (net.minecraft.client.player.AbstractClientPlayer)var9;
            boolean var11 = false;
            net.minecraft.network.chat.Component var36 = var10.getName();
            net.minecraft.client.player.LocalPlayer var10001 = this.ap().player;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(var36, var10001 != null ? var10001.getName() : null)) {
               var6.add(var9);
            }
         }

         var3 = var6;
         var4 = false;
         var6 = new java.util.ArrayList();
         var7 = false;

         for (Object var29 : var3) {
            net.minecraft.client.player.AbstractClientPlayer var31 = (net.minecraft.client.player.AbstractClientPlayer)var29;
            boolean var33 = false;
            var var12 = this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
            boolean var13 = false;
            boolean var38;
            if (var12 instanceof java.util.Collection && ((java.util.Collection)var12).isEmpty()) {
               var38 = true;
            } else {
               java.util.Iterator var14 = var12.iterator();

               while (true) {
                  if (!var14.hasNext()) {
                     var38 = true;
                     break;
                  }

                  Object var15 = var14.next();
                  String var16 = (String)var15;
                  boolean var17 = false;
                  String var37 = var31.getName().getString();
                  kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var37, "getString(...)");
                  if (kotlin.text.StringsKt.contains(var37, var16, true)) {
                     var38 = false;
                     break;
                  }
               }
            }

            if (var38) {
               var6.add(var29);
            }
         }

         var3 = var6;
         var4 = false;
         var6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(var3, 10));
         var7 = false;

         for (Object var30 : var3) {
            net.minecraft.client.player.AbstractClientPlayer var32 = (net.minecraft.client.player.AbstractClientPlayer)var30;
            boolean var34 = false;
            kotlin.jvm.internal.Intrinsics.checkNotNull(var32);
            var6.add(me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a((net.minecraft.world.entity.Entity)var32));
         }

         return var6;
      }
   }

   private final void bt() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
      );
      this.aO();
   }

   private final void bu() {
      this.aO();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl
      );
   }

   private final void bv() {
      this.aO();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
      );
   }

   private final void bw() {
   int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
   if (var1 != 0) {
     if (!IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().d()) {
       IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.e().k();
     }
     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q();
     this.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
   }
   }

   private final void bx() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = 0;
      if (var1 != 0) {
        return;
      }
      me.octo.client.llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var2 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      if (var2 == null) {
        return;
      }
      String var3 = var2.a();
      if (Intrinsics.areEqual(var3, "Goblin Slayer")) {
        this.bu();
        return;
      }
      if (Intrinsics.areEqual(var3, "Glacite Walker Slayer")) {
        this.bv();
        return;
      }
      this.bw();
   }

   private final boolean a(net.minecraft.core.BlockPos var1, net.minecraft.world.phys.Vec3 var2) {
      long var20 = 0L;
      int var17i = 0;
      int var10000 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      boolean var4 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e(),
         var1,
         var2,
         false,
         4,
         null
      );
      int var3 = var10000;
      boolean var17 = var4;
      if (var3 != 0) {
         if (!var4) {
            long var5 = System.currentTimeMillis();
            var17 = kotlin.jvm.internal.Intrinsics.areEqual(this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl, var1);
            if (var3 != 0) {
               label173: {
                  long var10001;
                  label163: {
                     if (var17) {
                        
                        if (var3 == 0) {
                           break label173;
                        }

                        if (this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll == this.W()) {
                           var20 = this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
                           var10001 = 0L;
                           if (var3 == 0) {
                              break label163;
                           }

                           if (this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII != 0L) {
                              var20 = var5;
                              var10001 = this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
                              break label163;
                           }
                        }
                     }

                     this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = var1;
                     this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = this.W();
                     
                     break label173;
                  }

                  long var7;
                  label182: {
                     label147: {
                        label175: {
                           label176: {
                              var7 = var20 - var10001;
                              me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var21 = this.W();
                              me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var28 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
                              if (var3 != 0) {
                                 label142: {
                                    if (var21
                                       == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
                                       )
                                     {
                                       
                                       if (var3 == 0) {
                                          break label142;
                                       }

                                       if (this.a(this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl)) {
                                          long var30;
                                          var17i = (var30 = var7 - 3000L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
                                          if (var3 == 0) {
                                             break label147;
                                          }

                                          if (var17i >= 0) {
                                             var17i = this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
                                             break label147;
                                          }
                                       }
                                    }

                                    
                                 }

                                 if (var3 == 0) {
                                    break label176;
                                 }

                                 var21 = this.W();
                                 var28 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
                              }

                              if (var21 != var28) {
                                 break label175;
                              }

                              
                           }

                           var17 = this.a(this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl);
                           if (var3 == 0) {
                              break label182;
                           }

                           if (var17i == 0) {
                              long var31;
                              var17i = (var31 = var7 - 5000L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
                              if (var3 == 0) {
                                 break label182;
                              }

                              if (var17i >= 0) {
                                 if (this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI != null) {
                                    me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var25 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI
                                       .a();
                                    if (var25 != null) {
                                       lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var26 = var25.a();
                                       if (var26 != null) {
                                          net.minecraft.core.BlockPos var27 = var26.a();
                                          if (var27 != null) {
                                             net.minecraft.core.BlockPos var10 = var27;
                                             boolean var11 = false;
                                             this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.add(var10);
                                             int var29 = var10.getX();
                                             int var10002 = var10.getY();
                                             int var10003 = var10.getZ();
                                             long var12 = var7 / 1000;
                                             int var14 = var10003;
                                             int var15 = var10002;
                                             int var16 = var29;
                                             this.e("walker can't reach " + var16 + "," + var15 + "," + var14 + " (" + var12 + "s), blacklisted");
                                          }
                                       }
                                    }
                                 }

                                 this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
                                 this.bA();
                                 return false;
                              }
                           }
                        }

                        long var32;
                        var17i = (var32 = var7 - 10000L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
                        break label182;
                     }

                     if (var3 != 0) {
                        if (var17i >= 4) {
                           this.a(
                              this.W(),
                              "Slayer pathfinding failed after "
                                 + this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI
                                 + " forge warps"
                           );
                           if (var3 != 0) {
                              return false;
                           }
                        }

                        var17i = this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
                     }

                     int var9 = var17i;
                     this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = var9 + 1;
                     this.bA();
                     this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                        "§e[Dwarven] Slayer path failed — warping to forge (retry "
                           + this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI
                           + "/4)"
                     );
                     this.a(
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
                        2000
                     );
                     return false;
                  }

                  if (var3 != 0) {
                     if (var17i >= 0) {
                        this.a(this.W(), "Dwarven commission pathfinding failed for " + var7 / 1000 + "s");
                     }

                     var17i = 0;
                  }

                  return var17i != 0;
               }

               this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII = var5;
               var17i = 0;
            }

            return var17;
         }

         this.bA();
         var17i = 1;
      }

      return var17i != 0;
   }

   private final boolean a(llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl param1) {
      if (param1 == null) { return false; }
      for (String var2 : lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII) {
         if (StringsKt.contains(param1.a(), var2, false)) { return true; }
      }
      return false;
   }

   private final boolean f(String var1) {
      net.minecraft.world.phys.Vec3 var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      boolean var10000;
      if (kotlin.jvm.internal.Intrinsics.areEqual(var1, "Goblin Slayer")) {
         var var5 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .g()
            .a()
            .a();
         boolean var6 = false;
         if (var5 instanceof java.util.Collection && ((java.util.Collection)var5).isEmpty()) {
            var10000 = false;
         } else {
            java.util.Iterator var7 = var5.iterator();

            while (true) {
               if (!var7.hasNext()) {
                  var10000 = false;
                  break;
               }

               Object var8 = var7.next();
               net.minecraft.world.phys.AABB var9 = (net.minecraft.world.phys.AABB)var8;
               boolean var10 = false;
               if (var9.contains(var3)) {
                  var10000 = true;
                  break;
               }
            }
         }
      } else if (kotlin.jvm.internal.Intrinsics.areEqual(var1, "Glacite Walker Slayer")) {
         var var11 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .h()
            .a()
            .a();
         boolean var12 = false;
         if (var11 instanceof java.util.Collection && ((java.util.Collection)var11).isEmpty()) {
            var10000 = false;
         } else {
            java.util.Iterator var13 = var11.iterator();

            while (true) {
               if (!var13.hasNext()) {
                  var10000 = false;
                  break;
               }

               Object var14 = var13.next();
               net.minecraft.world.phys.AABB var15 = (net.minecraft.world.phys.AABB)var14;
               boolean var16 = false;
               if (var15.contains(var3)) {
                  var10000 = true;
                  break;
               }
            }
         }
      } else {
         var10000 = false;
      }

      return var10000;
   }

   private final boolean by() {
      return IlIllIlIlllIlIIIIIIIlIIlIllIllIIlllIIIIIIIlIllllIlIlIlIIlIIllIIlIIIIllIIllllIIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().al() || Math.random() < 0.8D;
   }

   private final void bz() {
   int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
   llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var2 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   if (var1 != 0) {
     if (var2 == null) {
       this.ba();
       return;
     }
     this.aO();
     this.bA();
     this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.clear();
     this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
     this.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll);
   }
   }

   private final void bA() {
      this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = null;
      this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = null;
      this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII = 0L;
   }

   private final void a(
      IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      this.aO();
      this.bA();
      this.br();
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll.f();
      this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = 0;
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
      );
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.clear();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var1.a();
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = var1.b();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = null;
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
               (kotlin.jvm.functions.Function2)(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII::b),
               var2,
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1<me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII, kotlin.Unit>)(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII::k),
               120,
               null
            )
         );
   }

   private final void bB() {
   int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
   this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = false;
   this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = false;
   this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = false;
   this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = 0;
   if (var1 == 0) {
     LocalPlayer var2 = this.ap().player;
     if (var2 != null) {
       var2.clientSideCloseContainer();
     }
   }
   this.bA();
   this.br();
   this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = null;
   this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = null;
   this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = 0;
   this.aO();
   }

   private final void b(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1
   ) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      this.bB();
      llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var3 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      if (var3 != null && IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll.contains(param1)) {
        this.a(new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var3, this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll));
        if (var2 != 0) {
          return;
        }
      }
      this.ba();
   }

   private final IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI bC() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      String var2;
      if (((CharSequence)this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll).length() == 0) {
         llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var3 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
         var2 = var3 != null ? var3.a() : null;
      } else {
         var2 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
      }

      BlockPos var4;
      if (this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI != null) {
         me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var5 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.a();
         if (var5 != null) {
            var4 = var5.b();
         } else {
            var4 = null;
         }
      } else {
         var4 = null;
      }

      BlockPos var6;
      if (this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI != null) {
         me.octo.client.lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.a();
         if (var7 != null) {
            me.octo.client.lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var8 = var7.a();
            if (var8 != null) {
               var6 = var8.a();
            } else {
               var6 = null;
            }
         } else {
            var6 = null;
         }
      } else {
         var6 = null;
      }

      return new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(var2, var4, var6, this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.size(), this.a(2.0));
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()I
      // 03: aload 0
      // 04: getfield me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll Ljava/lang/String;
      // 07: checkcast java/lang/CharSequence
      // 0a: astore 2
      // 0b: istore 1
      // 0c: aload 2
      // 0d: invokeinterface java/lang/CharSequence.length ()I 1
      // 12: iload 1
      // 13: ifeq 21
      // 16: ifne 24
      // 19: goto 20
      // 1c: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f: athrow
      // 20: bipush 1
      // 21: goto 25
      // 24: bipush 0
      // 25: ifeq 4c
      // 28: bipush 0
      // 29: istore 3
      // 2a: iload 1
      // 2b: ifeq 48
      // 2e: aload 0
      // 2f: getfield me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl Lme/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl;
      // 32: dup
      // 33: ifnull 47
      // 36: goto 3d
      // 39: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3c: athrow
      // 3d: invokevirtual me/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl.a ()Ljava/lang/String;
      // 40: goto 49
      // 43: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 46: athrow
      // 47: pop
      // 48: aconst_null
      // 49: goto 4d
      // 4c: aload 2
      // 4d: checkcast java/lang/String
      // 50: iload 1
      // 51: ifeq 87
      // 54: aload 0
      // 55: getfield me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 58: dup
      // 59: ifnull 7f
      // 5c: goto 63
      // 5f: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 62: athrow
      // 63: invokevirtual me/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 66: dup
      // 67: ifnull 7f
      // 6a: goto 71
      // 6d: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 70: athrow
      // 71: invokevirtual me/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Lnet/minecraft/core/BlockPos;
      // 74: iload 1
      // 75: ifne 88
      // 78: goto 7f
      // 7b: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 7e: athrow
      // 7f: pop
      // 80: goto 87
      // 83: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 86: athrow
      // 87: aconst_null
      // 88: aload 0
      // 89: getfield me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI Lme/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 8c: dup
      // 8d: ifnull ba
      // 90: invokevirtual me/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lme/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 93: dup
      // 94: ifnull ba
      // 97: goto 9e
      // 9a: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 9d: athrow
      // 9e: invokevirtual me/octo/client/lIlIIlIlIIlllIllIIlIIIlIllIlIlIlIlIlllIllllllIIIllIIIIlIIllIlIIIIIIIIllllIIIIIlIIIlIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Lme/octo/client/lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll;
      // a1: dup
      // a2: ifnull ba
      // a5: goto ac
      // a8: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // ab: athrow
      // ac: invokevirtual me/octo/client/lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll.a ()Lnet/minecraft/core/BlockPos;
      // af: iload 1
      // b0: ifne c3
      // b3: goto ba
      // b6: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // b9: athrow
      // ba: pop
      // bb: aconst_null
      // bc: goto c3
      // bf: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // c2: athrow
      // c3: aload 0
      // c4: getfield me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI Ljava/util/ArrayList;
      // c7: invokevirtual java/util/ArrayList.size ()I
      // ca: aload 0
      // cb: checkcast me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI
      // ce: dconst_0
      // cf: bipush 1
      // d0: aconst_null
      // d1: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a (Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI;DILjava/lang/Object;)Lkotlin/Triple;
      // d4: astore 4
      // d6: istore 5
      // d8: astore 6
      // da: astore 7
      // dc: astore 8
      // de: new me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
      // e1: dup
      // e2: aload 8
      // e4: aload 7
      // e6: aload 6
      // e8: iload 5
      // ea: aload 4
      // ec: invokespecial me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.<init> (Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;ILkotlin/Triple;)V
      // ef: areturn
   }

   private final void bD() {
      this.aO();
      this.bA();
      this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = false;
      this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = 0;
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
      this.bE();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI
      );
   }

   private final void a(IllllIIlIIIlIIIIlIlIIlIIIllIllIIIIIlIIIllIlIIlIllllllIIIlllllIIIIlIllIlIlllIllIIIIIll var1) {
      this.aO();
      this.bA();
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = var1;
      this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = 0;
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI
      );
   }

   private final void bE() {
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
   }

   private final void bF() {
   int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
   this.aO();
   this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   Object var2 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t();
   if (var1 != 0 && var2 != null) {
     this.bD();
   }
   this.a(me.octo.client.IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.S());
   }

   private final me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll c(
      java.util.List<me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var1
   ) {
      me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      Iterable var3 = var1;
      boolean var4 = false;
      java.util.Iterator var5 = var3.iterator();
      if (!var5.hasNext()) {
         throw new java.util.NoSuchElementException();
      } else {
         Object var6 = var5.next();
         Object var10000;
         if (!var5.hasNext()) {
            var10000 = (Double)var6;
         } else {
            me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var7 = (me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var6;
            boolean var9 = false;
            java.util.Iterator var10 = var7.a().c().iterator();
            if (!var10.hasNext()) {
               var10000 = null;
            } else {
               lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var12 = (lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll)var10.next();
               boolean var13 = false;
               double var14 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var12.a(), true);

               while (var10.hasNext()) {
                  lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var16 = (lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll)var10.next();
                  boolean var17 = false;
                  double var18 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(var16.a(), true);
                  var14 = Math.min(var14, var18);
               }

               var10000 = var14;
            }

            double var28 = var10000 != null ? ((Number) var10000).doubleValue() : Double.MAX_VALUE;

            do {
               Object var29 = var5.next();
               me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var30 = (me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var29;
               boolean var32 = false;
               java.util.Iterator var33 = var30.a().c().iterator();
               if (!var33.hasNext()) {
                  var10000 = null;
               } else {
                  lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var20 = (lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll)var33.next();
                  boolean var21 = false;
                  double var22 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(var20.a(), true);

                  while (var33.hasNext()) {
                     lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll var24 = (lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll)var33.next();
                     boolean var25 = false;
                     double var26 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .c(var24.a(), true);
                     var22 = Math.min(var22, var26);
                  }

                  var10000 = var22;
               }

               double var31 = var10000 != null ? ((Number) var10000).doubleValue() : Double.MAX_VALUE;
               if (Double.compare(var28, var31) > 0) {
                  var6 = var29;
                  var28 = var31;
               }
            } while (var5.hasNext());

            var10000 = (Double)var6;
         }

         return (me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
      }
   }

   private final llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl bG() {
      int var1 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var2 = null;
      double var3 = Double.MAX_VALUE;
      for (String var6 : lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl) {
         var var7 = IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.o(var6);
         var var10 = var7.c().iterator();
         Double var8 = null;
         if (var10.hasNext()) {
            var var11 = var10.next();
            double var13 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var11.a(), true);
            while (var10.hasNext()) {
               var var15 = var10.next();
               double var17 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c(var15.a(), true);
               var13 = Math.min(var13, var17);
            }

            var8 = var13;
         }

         double var9 = var8 != null ? var8 : Double.MAX_VALUE;
         if (var9 < var3) {
            var3 = var9;
            var2 = var7;
         }
      }

      return var2;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()I
      // 003: aconst_null
      // 004: astore 2
      // 005: istore 1
      // 006: ldc2_w 1.7976931348623157E308
      // 009: dstore 3
      // 00a: getstatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl Ljava/util/List;
      // 00d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 012: astore 5
      // 014: aload 5
      // 016: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01b: ifeq 116
      // 01e: aload 5
      // 020: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 025: checkcast java/lang/String
      // 028: astore 6
      // 02a: iload 1
      // 02b: ifne 054
      // 02e: getstatic me/octo/client/IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl;
      // 031: aload 6
      // 033: invokevirtual me/octo/client/IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.o (Ljava/lang/String;)Lme/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl;
      // 036: iload 1
      // 037: ifne 117
      // 03a: goto 041
      // 03d: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 040: athrow
      // 041: dup
      // 042: ifnonnull 057
      // 045: goto 04c
      // 048: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04b: athrow
      // 04c: pop
      // 04d: goto 054
      // 050: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 053: athrow
      // 054: goto 014
      // 057: astore 7
      // 059: aload 7
      // 05b: invokevirtual me/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl.c ()Ljava/util/List;
      // 05e: checkcast java/lang/Iterable
      // 061: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 066: astore 10
      // 068: aload 10
      // 06a: iload 1
      // 06b: ifne 08c
      // 06e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 073: ifne 085
      // 076: goto 07d
      // 079: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 07c: athrow
      // 07d: aconst_null
      // 07e: goto 0e6
      // 081: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 084: athrow
      // 085: aload 10
      // 087: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08c: checkcast me/octo/client/lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll
      // 08f: astore 11
      // 091: bipush 0
      // 092: istore 12
      // 094: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 097: aload 11
      // 099: invokevirtual me/octo/client/lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll.a ()Lnet/minecraft/core/BlockPos;
      // 09c: bipush 1
      // 09d: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/core/BlockPos;Z)D
      // 0a0: dstore 13
      // 0a2: aload 10
      // 0a4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a9: ifeq 0e1
      // 0ac: aload 10
      // 0ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b3: checkcast me/octo/client/lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll
      // 0b6: astore 15
      // 0b8: bipush 0
      // 0b9: istore 16
      // 0bb: getstatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
      // 0be: aload 15
      // 0c0: invokevirtual me/octo/client/lIIlIlIlIllIIIlllIlIlllIIlIlIlIIlIlIllIIlIlIIlIlIlIIIIIlllIlllllIllIlIIllIlIlllIlllll.a ()Lnet/minecraft/core/BlockPos;
      // 0c3: bipush 1
      // 0c4: invokevirtual me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c (Lnet/minecraft/core/BlockPos;Z)D
      // 0c7: dstore 17
      // 0c9: dload 13
      // 0cb: dload 17
      // 0cd: invokestatic java/lang/Math.min (DD)D
      // 0d0: dstore 13
      // 0d2: iload 1
      // 0d3: ifne 0f5
      // 0d6: iload 1
      // 0d7: ifeq 0a2
      // 0da: goto 0e1
      // 0dd: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e0: athrow
      // 0e1: dload 13
      // 0e3: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 0e6: dup
      // 0e7: ifnull 0f4
      // 0ea: invokevirtual java/lang/Double.doubleValue ()D
      // 0ed: goto 0f8
      // 0f0: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f3: athrow
      // 0f4: pop
      // 0f5: ldc2_w 1.7976931348623157E308
      // 0f8: dstore 8
      // 0fa: dload 8
      // 0fc: iload 1
      // 0fd: ifne 10e
      // 100: dload 3
      // 101: dcmpg
      // 102: ifge 014
      // 105: goto 10c
      // 108: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 10b: athrow
      // 10c: dload 8
      // 10e: dstore 3
      // 10f: aload 7
      // 111: astore 2
      // 112: iload 1
      // 113: ifeq 014
      // 116: aload 2
      // 117: areturn
   }

   private final Integer b(me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      java.util.List var10000 = var1.m();
      if (var10000 == null) {
         var10000 = kotlin.collections.CollectionsKt.emptyList();
      }

      java.util.List var3 = var10000;
      var var4 = kotlin.collections.CollectionsKt.take(var3, 27);
      boolean var5 = false;
      boolean var19;
      if (var4 instanceof java.util.Collection && ((java.util.Collection)var4).isEmpty()) {
         var19 = false;
      } else {
         java.util.Iterator var6 = var4.iterator();

         while (true) {
            if (!var6.hasNext()) {
               var19 = false;
               break;
            }

            Object var7 = var6.next();
            net.minecraft.world.inventory.Slot var8 = (net.minecraft.world.inventory.Slot)var7;
            boolean var9 = false;
            if (var8.getItem().isEmpty()) {
               var19 = true;
               break;
            }
         }
      }

      if (var19) {
         return null;
      } else {
         for (int var13 = 9; var13 < 17; var13++) {
            net.minecraft.world.inventory.Slot var14 = (net.minecraft.world.inventory.Slot)var3.get(var13);
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var20 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            net.minecraft.world.item.ItemStack var10001 = var14.getItem();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10001, "getItem(...)");
            java.util.List var15 = var20.d(var10001);
            var var16 = var15;
            boolean var17 = false;
            boolean var22;
            if (var16 instanceof java.util.Collection && ((java.util.Collection)var16).isEmpty()) {
               var22 = false;
            } else {
               java.util.Iterator var18 = var16.iterator();

               while (true) {
                  if (!var18.hasNext()) {
                     var22 = false;
                     break;
                  }

                  Object var10 = var18.next();
                  net.minecraft.network.chat.Component var11 = (net.minecraft.network.chat.Component)var10;
                  boolean var12 = false;
                  me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var21 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  String var23 = var11.getString();
                  kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var23, "getString(...)");
                  if (var21.a(var23).contains("COMPLETED")) {
                     var22 = true;
                     break;
                  }
               }
            }

            if (var22) {
               return var14.index;
            }
         }

         return null;
      }
   }

   private final java.util.List<me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> c(
      me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1
   ) {
      int var2 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      java.util.List var10000 = var1.m();
      if (var10000 == null) {
         var10000 = kotlin.collections.CollectionsKt.emptyList();
      }

      java.util.List var3 = var10000;
      var var4 = kotlin.collections.CollectionsKt.take(var3, 27);
      boolean var5 = false;
      boolean var45;
      if (var4 instanceof java.util.Collection && ((java.util.Collection)var4).isEmpty()) {
         var45 = false;
      } else {
         java.util.Iterator var6 = var4.iterator();

         while (true) {
            if (!var6.hasNext()) {
               var45 = false;
               break;
            }

            Object var7 = var6.next();
            net.minecraft.world.inventory.Slot var8 = (net.minecraft.world.inventory.Slot)var7;
            boolean var9 = false;
            if (var8.getItem().isEmpty()) {
               var45 = true;
               break;
            }
         }
      }

      if (var45) {
         return null;
      } else {
         java.util.ArrayList var17 = new java.util.ArrayList();

         for (int var18 = 9; var18 < 17; var18++) {
            if (var18 < var3.size()) {
               net.minecraft.world.inventory.Slot var19 = (net.minecraft.world.inventory.Slot)var3.get(var18);
               net.minecraft.world.item.ItemStack var46 = var19.getItem();
               if (var46 != null) {
                  net.minecraft.world.item.ItemStack var20 = var46;
                  java.util.List var21 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .d(var20);
                  var var22 = var21;
                  boolean var10 = false;
                  boolean var48;
                  if (var22 instanceof java.util.Collection && ((java.util.Collection)var22).isEmpty()) {
                     var48 = false;
                  } else {
                     java.util.Iterator var11 = var22.iterator();

                     while (true) {
                        if (!var11.hasNext()) {
                           var48 = false;
                           break;
                        }

                        Object var12 = var11.next();
                        net.minecraft.network.chat.Component var13 = (net.minecraft.network.chat.Component)var12;
                        boolean var14 = false;
                        me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var47 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        String var10001 = var13.getString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
                        if (var47.a(var10001).contains("COMPLETED")) {
                           var48 = true;
                           break;
                        }
                     }
                  }

                  if (!var48 && var21.size() >= 5) {
                     me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var49 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     String var55 = ((net.minecraft.network.chat.Component)var21.get(4)).getString();
                     kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var55, "getString(...)");
                     String var23 = var49.a(var55);
                     if (!var23.contains("Elusive") && !var23.contains("Golden Goblin")) {
                        var var24 = lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
                        boolean var27 = false;
                        boolean var50;
                        if (var24 instanceof java.util.Collection && ((java.util.Collection)var24).isEmpty()) {
                           var50 = false;
                        } else {
                           java.util.Iterator var30 = var24.iterator();

                           while (true) {
                              if (!var30.hasNext()) {
                                 var50 = false;
                                 break;
                              }

                              Object var34 = var30.next();
                              String var39 = (String)var34;
                              boolean var15 = false;
                              if (var23.contains(var39)) {
                                 var50 = true;
                                 break;
                              }
                           }
                        }

                        if (var50) {
                           llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var26 = this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
                           if (var26 != null) {
                              var var29 = lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
                              boolean var33 = false;
                              boolean var53;
                              if (var29 instanceof java.util.Collection && ((java.util.Collection)var29).isEmpty()) {
                                 var53 = false;
                              } else {
                                 java.util.Iterator var37 = var29.iterator();

                                 while (true) {
                                    if (!var37.hasNext()) {
                                       var53 = false;
                                       break;
                                    }

                                    Object var41 = var37.next();
                                    String var44 = (String)var41;
                                    boolean var16 = false;
                                    if (var26.a().contains(var44)) {
                                       var53 = true;
                                       break;
                                    }
                                 }
                              }

                              if (!var53) {
                                 var17.add(new me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var26, var23));
                                 continue;
                              }
                           }

                           llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var54 = this.bG();
                           if (var54 != null) {
                              llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var38 = var54;
                              boolean var42 = false;
                              var17.add(new me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var38, var23));
                           }
                        } else {
                           var var25 = IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
                           var27 = false;
                           boolean var51;
                           if (var25 instanceof java.util.Collection && ((java.util.Collection)var25).isEmpty()) {
                              var51 = false;
                           } else {
                              java.util.Iterator var31 = var25.iterator();

                              while (true) {
                                 if (!var31.hasNext()) {
                                    var51 = false;
                                    break;
                                 }

                                 Object var35 = var31.next();
                                 String var40 = (String)var35;
                                 boolean var43 = false;
                                 if (var23.contains(var40)) {
                                    var51 = true;
                                    break;
                                 }
                              }
                           }

                           if (var51) {
                              llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var52 = IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                                 .o(var23);
                              if (var52 != null) {
                                 llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var32 = var52;
                                 boolean var36 = false;
                                 var17.add(new me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var32, var23));
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return kotlin.collections.CollectionsKt.toList(var17);
      }
   }

   private final List<IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> bH() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      ArrayList<IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var2 = new ArrayList<IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll>();
      List<String> var3 = me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.h();
      for (String var5 : var3) {
         if (var5.contains("Elusive")) {
            continue;
         }
         if (var1 != 0) {
            if (var5.contains("Golden Goblin")) {
               continue;
            }
            if (var5.contains("DONE")) {
               continue;
            }
         }
         boolean var6 = false;
         for (String var10 : lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII) {
            if (var5.contains(var10)) {
               var6 = true;
               break;
            }
         }
         if (var6) {
            llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var7 = this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
            if (var1 != 0) {
               if (var7 == null) {
                  llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var9 = this.bG();
                  if (var9 != null) {
                     var2.add(new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var9, var5));
                  }
               } else {
                  boolean var8 = false;
                  for (String var11 : lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII) {
                     if (var7.a().contains(var11)) {
                        var8 = true;
                        break;
                     }
                  }
                  if (!var8) {
                     var2.add(new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var7, var5));
                  } else {
                     llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var9 = this.bG();
                     if (var9 != null) {
                        var2.add(new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var9, var5));
                     }
                  }
               }
            } else if (var7 != null) {
               var2.add(new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var7, var5));
            }
         } else {
            String var6_2 = null;
            for (String var12 : IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII) {
               if (var5.contains(var12)) {
                  var6_2 = var12;
                  break;
               }
            }
            if (var6_2 != null && var1 != 0) {
               llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var13 = me.octo.client.IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.o(var6_2);
               if (var13 != null) {
                  var2.add(new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var13, var5));
               }
            }
         }
      }
      return CollectionsKt.toList(var2);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()I
      // 003: new java/util/ArrayList
      // 006: dup
      // 007: invokespecial java/util/ArrayList.<init> ()V
      // 00a: astore 2
      // 00b: getstatic me/octo/client/utils/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
      // 00e: invokevirtual me/octo/client/utils/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.h ()Ljava/util/List;
      // 011: astore 3
      // 012: istore 1
      // 013: aload 3
      // 014: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 019: astore 4
      // 01b: aload 4
      // 01d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 022: ifeq 299
      // 025: aload 4
      // 027: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 02c: checkcast java/lang/String
      // 02f: astore 5
      // 031: aload 5
      // 033: checkcast java/lang/CharSequence
      // 036: sipush -3227
      // 039: sipush -26956
      // 03c: pop2
      // 03d: ldc_w "Elusive"
      // 040: checkcast java/lang/CharSequence
      // 043: bipush 0
      // 044: bipush 2
      // 045: aconst_null
      // 046: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 049: iload 1
      // 04a: ifeq 06f
      // 04d: ifne 01b
      // 050: goto 057
      // 053: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 056: athrow
      // 057: aload 5
      // 059: checkcast java/lang/CharSequence
      // 05c: sipush -3207
      // 05f: sipush -22139
      // 062: pop2
      // 063: ldc_w "Golden Goblin"
      // 066: checkcast java/lang/CharSequence
      // 069: bipush 0
      // 06a: bipush 2
      // 06b: aconst_null
      // 06c: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 06f: iload 1
      // 070: ifeq 095
      // 073: ifne 01b
      // 076: goto 07d
      // 079: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 07c: athrow
      // 07d: aload 5
      // 07f: checkcast java/lang/CharSequence
      // 082: sipush -3218
      // 085: sipush 15605
      // 088: pop2
      // 089: ldc_w "DONE"
      // 08c: checkcast java/lang/CharSequence
      // 08f: bipush 0
      // 090: bipush 2
      // 091: aconst_null
      // 092: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 095: ifeq 09b
      // 098: goto 01b
      // 09b: getstatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII Ljava/util/List;
      // 09e: checkcast java/lang/Iterable
      // 0a1: astore 6
      // 0a3: bipush 0
      // 0a4: istore 7
      // 0a6: aload 6
      // 0a8: iload 1
      // 0a9: ifeq 0e2
      // 0ac: instanceof java/util/Collection
      // 0af: ifeq 0e0
      // 0b2: goto 0b9
      // 0b5: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0b8: athrow
      // 0b9: aload 6
      // 0bb: checkcast java/util/Collection
      // 0be: iload 1
      // 0bf: ifeq 0e2
      // 0c2: goto 0c9
      // 0c5: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c8: athrow
      // 0c9: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0ce: ifeq 0e0
      // 0d1: goto 0d8
      // 0d4: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d7: athrow
      // 0d8: bipush 0
      // 0d9: goto 122
      // 0dc: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0df: athrow
      // 0e0: aload 6
      // 0e2: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0e7: astore 8
      // 0e9: aload 8
      // 0eb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f0: ifeq 121
      // 0f3: aload 8
      // 0f5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0fa: astore 9
      // 0fc: aload 9
      // 0fe: checkcast java/lang/String
      // 101: astore 10
      // 103: bipush 0
      // 104: istore 11
      // 106: aload 5
      // 108: checkcast java/lang/CharSequence
      // 10b: aload 10
      // 10d: checkcast java/lang/CharSequence
      // 110: bipush 0
      // 111: bipush 2
      // 112: aconst_null
      // 113: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 116: ifeq 0e9
      // 119: bipush 1
      // 11a: iload 1
      // 11b: ifeq 116
      // 11e: goto 122
      // 121: bipush 0
      // 122: ifeq 208
      // 125: aload 0
      // 126: getfield me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll Lme/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl;
      // 129: astore 6
      // 12b: aload 6
      // 12d: iload 1
      // 12e: ifeq 1e7
      // 131: ifnull 1e3
      // 134: goto 13b
      // 137: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 13a: athrow
      // 13b: getstatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII Ljava/util/List;
      // 13e: checkcast java/lang/Iterable
      // 141: astore 7
      // 143: bipush 0
      // 144: istore 8
      // 146: aload 7
      // 148: iload 1
      // 149: ifeq 182
      // 14c: instanceof java/util/Collection
      // 14f: ifeq 180
      // 152: goto 159
      // 155: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 158: athrow
      // 159: aload 7
      // 15b: checkcast java/util/Collection
      // 15e: iload 1
      // 15f: ifeq 182
      // 162: goto 169
      // 165: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 168: athrow
      // 169: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 16e: ifeq 180
      // 171: goto 178
      // 174: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 177: athrow
      // 178: bipush 0
      // 179: goto 1c5
      // 17c: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 17f: athrow
      // 180: aload 7
      // 182: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 187: astore 9
      // 189: aload 9
      // 18b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 190: ifeq 1c4
      // 193: aload 9
      // 195: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 19a: astore 10
      // 19c: aload 10
      // 19e: checkcast java/lang/String
      // 1a1: astore 11
      // 1a3: bipush 0
      // 1a4: istore 12
      // 1a6: aload 6
      // 1a8: invokevirtual me/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl.a ()Ljava/lang/String;
      // 1ab: checkcast java/lang/CharSequence
      // 1ae: aload 11
      // 1b0: checkcast java/lang/CharSequence
      // 1b3: bipush 0
      // 1b4: bipush 2
      // 1b5: aconst_null
      // 1b6: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 1b9: ifeq 189
      // 1bc: bipush 1
      // 1bd: iload 1
      // 1be: ifeq 1b9
      // 1c1: goto 1c5
      // 1c4: bipush 0
      // 1c5: ifne 1e3
      // 1c8: aload 2
      // 1c9: new me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 1cc: dup
      // 1cd: aload 6
      // 1cf: aload 5
      // 1d1: invokespecial me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.<init> (Lme/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl;Ljava/lang/String;)V
      // 1d4: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1d7: pop
      // 1d8: iload 1
      // 1d9: ifne 01b
      // 1dc: goto 1e3
      // 1df: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1e2: athrow
      // 1e3: aload 0
      // 1e4: invokespecial me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.bG ()Lme/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl;
      // 1e7: dup
      // 1e8: ifnull 203
      // 1eb: astore 9
      // 1ed: bipush 0
      // 1ee: istore 10
      // 1f0: aload 2
      // 1f1: new me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 1f4: dup
      // 1f5: aload 9
      // 1f7: aload 5
      // 1f9: invokespecial me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.<init> (Lme/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl;Ljava/lang/String;)V
      // 1fc: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1ff: pop
      // 200: goto 01b
      // 203: pop
      // 204: nop
      // 205: goto 01b
      // 208: getstatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII Ljava/util/List;
      // 20b: checkcast java/lang/Iterable
      // 20e: astore 9
      // 210: aload 9
      // 212: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 217: astore 10
      // 219: aload 10
      // 21b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 220: ifeq 252
      // 223: aload 10
      // 225: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22a: astore 11
      // 22c: aload 11
      // 22e: checkcast java/lang/String
      // 231: astore 12
      // 233: bipush 0
      // 234: istore 13
      // 236: aload 5
      // 238: checkcast java/lang/CharSequence
      // 23b: aload 12
      // 23d: checkcast java/lang/CharSequence
      // 240: bipush 0
      // 241: bipush 2
      // 242: aconst_null
      // 243: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 246: ifeq 219
      // 249: aload 11
      // 24b: iload 1
      // 24c: ifeq 22e
      // 24f: goto 253
      // 252: aconst_null
      // 253: checkcast java/lang/String
      // 256: dup
      // 257: ifnonnull 262
      // 25a: pop
      // 25b: goto 01b
      // 25e: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 261: athrow
      // 262: astore 6
      // 264: iload 1
      // 265: ifeq 295
      // 268: getstatic me/octo/client/IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI Lme/octo/client/IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl;
      // 26b: aload 6
      // 26d: invokevirtual me/octo/client/IIIIlIIllIIIIIIlllIllIIIllIllllIllllIIlIlIlIlIIlllIlIIllIIIlIlIlIIlIllIIlIllIIIIlIIIl.o (Ljava/lang/String;)Lme/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl;
      // 270: dup
      // 271: ifnull 293
      // 274: goto 27b
      // 277: invokestatic me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 27a: athrow
      // 27b: astore 9
      // 27d: bipush 0
      // 27e: istore 10
      // 280: aload 2
      // 281: new me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
      // 284: dup
      // 285: aload 9
      // 287: aload 5
      // 289: invokespecial me/octo/client/IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.<init> (Lme/octo/client/llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl;Ljava/lang/String;)V
      // 28c: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 28f: pop
      // 290: goto 01b
      // 293: pop
      // 294: nop
      // 295: iload 1
      // 296: ifne 01b
      // 299: aload 2
      // 29a: checkcast java/lang/Iterable
      // 29d: invokestatic kotlin/collections/CollectionsKt.toList (Ljava/lang/Iterable;)Ljava/util/List;
      // 2a0: areturn
   }

   @Override
   public void ba() {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
      List var2 = null;
      if (var1 != 0) {
        this.br();
        if (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
          this.a(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, 5000);
          return;
        }
        var2 = this.bH();
        if (!var2.isEmpty()) {
          this.a(this.c(var2));
        } else {
          this.bF();
        }
        return;
      }
      var2 = this.bH();
      this.a(this.c(var2));
   }

   @Override
   public void M() {
int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();
this.aM();
boolean var2 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != null;
boolean var3 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.q() != null;
boolean var4 = this.a5() != null;
boolean var5 = me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
block39: {
   boolean var6;
   block44: {
      block45: {
         block42: {
            block43: {
               block40: {
                  block41: {
                     block37: {
                        block38: {
                           var6 = var2;
                           if (var1 == 0) break block37;
                           if (!var6) break block38;
                           var6 = var3;
                           if (var1 == 0) break block37;
                           if (!var6) break block38;
                           var6 = var4;
                           if (var1 == 0) break block37;
                           if (!var6) break block38;
                           var6 = var5;
                           if (var1 == 0) break block37;
                           if (var6) break block39;
                        }
                        var6 = var2;
                     }
                     if (var1 == 0) break block40;
                     if (var6) break block41;
                     this.bg();
                  }
                  var6 = var3;
               }
               if (var1 == 0) break block42;
               if (var6) break block43;
               this.c(4);
            }
            var6 = var4;
         }
         if (var1 == 0) break block44;
         if (var6) break block45;
         this.bf();
      }
      var6 = var5;
   }
   if (!var6) {
      this.b(kotlin.collections.CollectionsKt.listOf(me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl));
   }
   this.N();
   return;
}
super.M();
this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = null;
this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = null;
this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = "";
this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = false;
this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = false;
this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = null;
this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = null;
this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = 0;
this.br();
this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = kotlin.collections.CollectionsKt.plus(kotlin.collections.CollectionsKt.plus(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.h().a().e(), me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.g().a().e()), "Treasuer Hunter");
this.a(kotlin.collections.CollectionsKt.listOf(
   new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, () -> me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.l(this), true),
   new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, () -> me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.bJ(), false),
   new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, () -> me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.bK(), false),
   new me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, () -> me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.bL(), false)
));
this.ba();
   }

   @Override
   public void O() {
      short var6;
      label65: {
         me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(
            llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            "Commission Info",
            0,
            2,
            null
         );
         me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
         Integer var3 = var10000 != null ? var10000.g() : null;
         if (var3 == null || var3 != 0) {
            byte var4 = 1;
            if (var3 == null || var3 != var4) {
               var4 = 2;
               if (var3 != null && var3 == var4) {
                  var6 = 200;
                  break label65;
               }

               var6 = 400;
               break label65;
            }
         }

         var6 = 100;
      }

      short var2 = var6;
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(0, var2);
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "Mining Info",
         0,
         2,
         null
      );
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .b(1, true);
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a(1, true);
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h(1);
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .e(1);
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .c(1, true);
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .i(1);
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

   private static final long a(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();

      IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
      IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001;
      String var4 = null;
      int var10005 = 0;
      boolean var10006 = false;
      Triple var10003 = null;
      int var10004 = 0;
      BlockPos var10002 = null; // PX-FIX: init（乱序赋值）
      label27: {
         try {
            var10000 = new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var10002,
                        ((Triple<Integer,Integer,Integer>)(Object)(var10003)),
                        ((Integer)(Object)(var10004)),
                        var10005,
                        var10006,
                        var4,
                        IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .y()); // PX-FIX
            var10001 = var10000;
            if (var0.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII != null) {
               var10002 = var0.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.a();
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
         var10005 = var0.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
         var10006 = var0.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
         Screen var10007 = var0.ap().screen;
         if (var10007 != null) {
            Component var3 = var10007.getTitle();
            if (var3 != null) {
               var4 = var3.getString();
               if (var1 == 0) {
                  break label20;
               }
            }
         }

         var4 = null;
      }

      return var10000;
   }

   private static final Object d(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) { Component var4 = null; // PX-FIX hoist
        
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();

      String var5 = null;
      int var10005 = 0;
      boolean var10006 = false;
      Triple var10003 = null;
      int var10004 = 0;
      Integer var3 = null; // PX-FIX: init（乱序赋值）
      IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
      IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001;
      label27: {
         try {
            var10000 = new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
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
         var10005 = var0.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
         var10006 = var0.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
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

   private static final Object e(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) {
      return var0.bC();
   }

   private static final boolean f(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();

      try {
         if (var1 != 0) {
            return var0.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
         }

         if (!var0.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }

      return false;
   }

   private static final Object g(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) {
      return new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .l()
            + IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .k(),
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .y(),
         var0.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll
      );
   }

   private static final boolean h(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) {
      int var1 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c();

      try {
         if (var1 == 0) {
            return var0.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
         }

         if (!var0.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var2) {
         throw (RuntimeException)a(var2);
      }

      return false;
   }

   private static final Object i(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) {
      IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000;
      IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10001;
      me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10002 = null; // PX-FIX: init（乱序赋值）
      label16: {
         try {
            var10000 = new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var10002,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null),
                        IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .y(),
                        var0.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll); // PX-FIX
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

   private static final Object bI() {
      return IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .y();
   }

    private static final void a(
       IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII param0,
       me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1
    ) {
       try {
          java.lang.Thread.sleep((long) me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g());
       } catch (InterruptedException var2) {
          throw sneakyThrow(var2);
       }
       if (!param0.G()) return;
       if (param0.W() != param1) {
          param0.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = null;
          param0.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
          param0.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = false;
          return;
       }
       param0.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = true;
       param0.aO();
       try {
          java.lang.Thread.sleep((long) me.octo.client.IIlllllIlIlllIllllIlllIllIllIIllIIIIlllIIlIlllIlIlIlIlIIllllIllIIIlIlIIIIlIIIlllIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.g());
       } catch (InterruptedException var3) {
          throw sneakyThrow(var3);
       }
       if (!param0.G()) return;
       if (param0.W() == param1) {
          param0.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = true;
       }
    }

    private static <T extends Throwable> RuntimeException sneakyThrow(Throwable throwable) throws T {
       throw (T) throwable;
    }

   private static final Unit j(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) {
      var0.bt();
      return Unit.INSTANCE;
   }

   private static final Unit b(
      IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0,
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      var0.b(var1);
      return Unit.INSTANCE;
   }

   private static final Unit k(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0) {
      var0.bB();
      return Unit.INSTANCE;
   }

   private static final boolean l(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII param0) {
      me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
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

   private static final boolean bL() {
      return IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
        
      char[] var26 = null; // PX-FIX
   pxClinit: {
       var5 = new String[83];
      int var3 = 0;
      String var2 = ":Cßw\u0093Ú³tH*r¨ãëò\u0092\u0011\u00977↊õ\r\u0016'\u00190\u0098\u0099`Å\u0081ö\u0092\nf\u000f,Ú(<C¯\u0007ZÌ)òöá\u000f²\nä\u0092áêæb\u0085\u0001XÑ\u000fP\b^¼\u0015^v´*Hà´ù&\u000e@¤Û»¥\u001dR{¼Tý\u0002\u000b>¹»X\u0081\rí\u0086l\u0099\u008e\n#ð*?;\u000fÚ¿ù\u0096\\Hd\u008b2\u0004Ã¸ÔÌ»÷Ò¤\u0083Hn^\u0092Å\u0012ÕÖËÁéÖ\u0017V\u0016\u0005Qã\u0090\u0090S\u001b\u0019¦\u0098\u0005Ôé[ÒN\u0007µó\u000fÚÐê~M\u0091W`kö\u001bøK\u0019\u001d[\u009aÐ\u0082Ý\u0019zÌJÄ\u0011\u008b\u009bÕB\u000b,qÛþ'»ÓÍ[ÐÛ\u0098W\u000bB\u0082ÑqÊ×?±¨\u0001ÿ\b¢\u0099kÉW*8\u0081\u0002ú´\r5{s³\u0016à<þ\t\u0004õ;!\bÍª\u0005JÈ}Ø\u0080\f£\u0094Ñ\u0084^\u009e\u0088\u009eÃ\u0097aÞ*I\u0080\u0092Á\u0095qsÁke5¿\u001fSÒÛ>k\u0099®aÙÌ±¯\u000eÅ\u001c8e\u0092{ë¼K°)é\u0091\u008aúä\u0007,%\u000b\f/úÓ\u000b$N\u0018Þ2èÒÙÕ+L\f\"c\u0019\u008e:\u0098û«ÿ\u0088ø¢\u0006Ó©4\u0097RÆ\rò\u0088åÀ{Q®Åþão¡-\u0006jA\u0003\u008a´e\u0005£i\u0012S@\u0019j[öº\u0019\u001eâ,YØs\b×¥Ë\u0005\u001d°ýÈå±Tí\u0093@\u0090\u0017.¦¸£g3lÒÆ\u0085\u0000wI2C\u009dáñ2è1\r+ s,\u0013N\u008e\u00ad\u001bÑICªWzÎtÈ\u0017\u008bWg\u0016\u0088\u00108d>¹fX\u0096%(\u0018oÂg\b½\fêD´2äS\u001c\u008d¨¤êª@\u001ct¤íáeTå\u0002Ô\u0001\u0006\u009bqkK}6UÓèMµfÇ\u0014@¢{\u008d%Îfë\u00ad\u008d\f\bÏ6Ñ©\u008fWü\u0006Ç\r\bQ\u0006Âº\u0010Å½î\r\u0000\u0089\u0084í!!\u0004Ç\u0015l{\få\u007fµMb\u009dá¡Ê!¦\u001a\u0016NS\u0094\u0016\u0081{\u0094^#¯t«~)\u008f\u0012Kc\u0000ÐÌõ!\u0097¨gßQ¶\u0097õY¯0B×â¹\u0011\u000bAbÑ₵8\u0097P\u0080^\u0088öNä\u007f20#ÊÑÌô$_4ÚÀhuîℱÎ\u0097Y\u000f,\u0001\u008d|o¯¢dG\u0098oTg0§Vf`+qJ~\u0081\u009f;qÍbF\b\u007fs\u0017Á\u0094\u0019Ü\u00ad¡S±Ûj%føD\\ÀÎ\u008fÎÚ\u0097\u008bÞ\u0089¬G¤/u\u000b\u0093£\"¡\u0011\u0097\u0002\u0080÷,5\u000e9\u0000Î «Oñ½Ø*\u0084ºE\u0082\u0007&³JÞ\u0007 Ö\u0013¥\u0084W\u008c\u0092õ¬ç\u0015\u008bòZ\u00adÔò\u0002â_\u008f\u000e}ÛFÛº ÓP\u009c\u0097\f\rTt.\u007fzñø\u0085¢Li\u0015í\fÂ)\u0004\u0084µÇÑ®\u000f¬àqAÕkë«Ü\u0087\u000e\u20c39\u0092{×J»}µô´jDK\u0091\u0004\u000bI\u0096B\r9*ü\u0091$\u00ad÷Cs&Ì\u0010\u00ad\r=år`6\u009a8±\u0089íå\u0006#\u0015·}.\u0017\u001d\u0089\u0095íéîÖ\u0007N\u0083&Ú\u009a97\u001fÕ\tï\u007f\u008d#åk:Ã\u0018\u000e\u0096Wnõ¥\u008au~\u0090Teü\u009dY\rÉÉ¿/\u0083ù7]\u008fðAÃé\u0019&`oü\u009f¢{e%Èb5\u0005Ç\u000bûíå\u0013\u008fþR\u0019\u0099Û\u0011\u0082\u0018§CwÊâ\u007f|1o\u0089\u0081Ï[⇐y1\u009f\u001cíô\u001då6\u009c,Ëô¨i¾Â \u000f\u0096±[\u009c\u0007È\u001eëv&~\"]\\¯<ðb\u000f\u0099Ô\u008a\u008b\n¾å]ïê)\u0093\u0082\u0003~u:\bÐzAS¬\u001di\u008c\u0019a\u007f\u0097>5\u008eg>é\u009ae@\u0015¬\u0093$\u0016\u0094\u009cBÏ,Ü2û2\\þ\u0095¹\n\u007fÞ\u0084qÇC¹©£RÇî\u0083\u0099Ì½\"\u0018ÌÑ\u00adcéÍ\u0018ø7Ý½¹Cån¥²I\n÷&§»sO§_\u0018uE\u0015yefm#¨9M4\u0010\"3õ\u0002®\u001e\u0014\u009fÍÀ\u0011\u000bø\u0011Q\u0090»m!ü\\X2\u0010Í÷Úù\u0006#îy\u0091ÚDö\u0082`i\u008c\u000f\u0001zp\u009a[ðKlÞ±C 2\u0015\u008c\u0010uSÍmä±²+\u001a\u00905¿¬I¬©\u000bÃ&èõª,àß\u0092ê\u0098\u0005 \u0003®\u008c\u0094\u0013\u0091^ny\u0011\u0012\u009bg52×ü\u0005!\u0015ÖÀ\u0092Î\u000bËn\u000e\u0014\u0007ÿ[´$¡n\u000fÒ\u009c\u000e.\u001f\f7þ\u0002\u0001å\u009dY\u0003\u001a\tÝX¥¤;>i$¼9%\u0098º¤ì)a\u0018°Ã¸\u0007¢¿\nª\u007fKú5\rªA\u0099\u0011\u008añg\u0019¬Ü⁓c\u009b>\u009e?\u0090ÍÍ*Q\b5ó×Z\u000f\u0005L\u0084Éâ\u008d÷%ä\u001bOOR8\u008dNp&\u000b\u00999 \u009e â¥8¤YBuîØü]\f\u008f\u000bù\u0013H»Ï\nB\n\u0007v\n\u0005Y×E\u0002ö@¥VZÐ\u0092¹\u0000(· 6õ²Ä%Z¨\u007f=\u0089#NÝ\b\u009fVí\u0095æ¹Ô\u0087g\u00adNØ\u0086Ð¥\u0011\u008dì;}ûÒ\u0098~ó±6\u0085TØ´Üþ\u0003³\u0010nÈy]\u0006e÷\u0083_\u0015Ý\u000bU\u008c3°\u0096ï´¶ÙáÑ\u000f\u0002\u009fgåÛä#\u0018\u0087v¥ \u0094{\n\u000e7¤\u000f$\u0082Ñúú\u0012¨jê\u0098\u0088\u0004\u0090KNø #î*\u007f\u0091ÛÌ1\u0019:<'\u009b7Ué:$8yUêNjvXW^ÕÁ$ë\u0019RXñÚù\u0012þ\u00adÚè\u0003\u000eÙe\n\u001d%³úµ\u0005©DÇ\u0015\u0015\u009eµ\u000b\u000e¹ª\u0001\u0089{b\u0084\u0096\u0004±o\u009c³ñ\u0012\u0006q\u0006À±7\u0097\u0083Ä\u000eA\u001d´´§¥`x\u008f\u0019\u0089ò´t\fU\\\u000f\u009d\u0085½óú¬\u001b\u008cO@`<ë\u000f\u008cË\u0093\u008fÂ\u008cj¼¿ÿ\u0093DÔ\u0081\u0018»$Sì\u008e|\u0005ò\u001c\u0001Zø38çsÔk³S\u008ahÒÄN&ÔC¬½ÊeÜú\u0018&oYí\u001f ¼Å\u0081\u0088";
       var4 = ":Cßw\u0093Ú³tH*r¨ãëò\u0092\u0011\u00977↊õ\r\u0016'\u00190\u0098\u0099`Å\u0081ö\u0092\nf\u000f,Ú(<C¯\u0007ZÌ)òöá\u000f²\nä\u0092áêæb\u0085\u0001XÑ\u000fP\b^¼\u0015^v´*Hà´ù&\u000e@¤Û»¥\u001dR{¼Tý\u0002\u000b>¹»X\u0081\rí\u0086l\u0099\u008e\n#ð*?;\u000fÚ¿ù\u0096\\Hd\u008b2\u0004Ã¸ÔÌ»÷Ò¤\u0083Hn^\u0092Å\u0012ÕÖËÁéÖ\u0017V\u0016\u0005Qã\u0090\u0090S\u001b\u0019¦\u0098\u0005Ôé[ÒN\u0007µó\u000fÚÐê~M\u0091W`kö\u001bøK\u0019\u001d[\u009aÐ\u0082Ý\u0019zÌJÄ\u0011\u008b\u009bÕB\u000b,qÛþ'»ÓÍ[ÐÛ\u0098W\u000bB\u0082ÑqÊ×?±¨\u0001ÿ\b¢\u0099kÉW*8\u0081\u0002ú´\r5{s³\u0016à<þ\t\u0004õ;!\bÍª\u0005JÈ}Ø\u0080\f£\u0094Ñ\u0084^\u009e\u0088\u009eÃ\u0097aÞ*I\u0080\u0092Á\u0095qsÁke5¿\u001fSÒÛ>k\u0099®aÙÌ±¯\u000eÅ\u001c8e\u0092{ë¼K°)é\u0091\u008aúä\u0007,%\u000b\f/úÓ\u000b$N\u0018Þ2èÒÙÕ+L\f\"c\u0019\u008e:\u0098û«ÿ\u0088ø¢\u0006Ó©4\u0097RÆ\rò\u0088åÀ{Q®Åþão¡-\u0006jA\u0003\u008a´e\u0005£i\u0012S@\u0019j[öº\u0019\u001eâ,YØs\b×¥Ë\u0005\u001d°ýÈå±Tí\u0093@\u0090\u0017.¦¸£g3lÒÆ\u0085\u0000wI2C\u009dáñ2è1\r+ s,\u0013N\u008e\u00ad\u001bÑICªWzÎtÈ\u0017\u008bWg\u0016\u0088\u00108d>¹fX\u0096%(\u0018oÂg\b½\fêD´2äS\u001c\u008d¨¤êª@\u001ct¤íáeTå\u0002Ô\u0001\u0006\u009bqkK}6UÓèMµfÇ\u0014@¢{\u008d%Îfë\u00ad\u008d\f\bÏ6Ñ©\u008fWü\u0006Ç\r\bQ\u0006Âº\u0010Å½î\r\u0000\u0089\u0084í!!\u0004Ç\u0015l{\få\u007fµMb\u009dá¡Ê!¦\u001a\u0016NS\u0094\u0016\u0081{\u0094^#¯t«~)\u008f\u0012Kc\u0000ÐÌõ!\u0097¨gßQ¶\u0097õY¯0B×â¹\u0011\u000bAbÑ₵8\u0097P\u0080^\u0088öNä\u007f20#ÊÑÌô$_4ÚÀhuîℱÎ\u0097Y\u000f,\u0001\u008d|o¯¢dG\u0098oTg0§Vf`+qJ~\u0081\u009f;qÍbF\b\u007fs\u0017Á\u0094\u0019Ü\u00ad¡S±Ûj%føD\\ÀÎ\u008fÎÚ\u0097\u008bÞ\u0089¬G¤/u\u000b\u0093£\"¡\u0011\u0097\u0002\u0080÷,5\u000e9\u0000Î «Oñ½Ø*\u0084ºE\u0082\u0007&³JÞ\u0007 Ö\u0013¥\u0084W\u008c\u0092õ¬ç\u0015\u008bòZ\u00adÔò\u0002â_\u008f\u000e}ÛFÛº ÓP\u009c\u0097\f\rTt.\u007fzñø\u0085¢Li\u0015í\fÂ)\u0004\u0084µÇÑ®\u000f¬àqAÕkë«Ü\u0087\u000e\u20c39\u0092{×J»}µô´jDK\u0091\u0004\u000bI\u0096B\r9*ü\u0091$\u00ad÷Cs&Ì\u0010\u00ad\r=år`6\u009a8±\u0089íå\u0006#\u0015·}.\u0017\u001d\u0089\u0095íéîÖ\u0007N\u0083&Ú\u009a97\u001fÕ\tï\u007f\u008d#åk:Ã\u0018\u000e\u0096Wnõ¥\u008au~\u0090Teü\u009dY\rÉÉ¿/\u0083ù7]\u008fðAÃé\u0019&`oü\u009f¢{e%Èb5\u0005Ç\u000bûíå\u0013\u008fþR\u0019\u0099Û\u0011\u0082\u0018§CwÊâ\u007f|1o\u0089\u0081Ï[⇐y1\u009f\u001cíô\u001då6\u009c,Ëô¨i¾Â \u000f\u0096±[\u009c\u0007È\u001eëv&~\"]\\¯<ðb\u000f\u0099Ô\u008a\u008b\n¾å]ïê)\u0093\u0082\u0003~u:\bÐzAS¬\u001di\u008c\u0019a\u007f\u0097>5\u008eg>é\u009ae@\u0015¬\u0093$\u0016\u0094\u009cBÏ,Ü2û2\\þ\u0095¹\n\u007fÞ\u0084qÇC¹©£RÇî\u0083\u0099Ì½\"\u0018ÌÑ\u00adcéÍ\u0018ø7Ý½¹Cån¥²I\n÷&§»sO§_\u0018uE\u0015yefm#¨9M4\u0010\"3õ\u0002®\u001e\u0014\u009fÍÀ\u0011\u000bø\u0011Q\u0090»m!ü\\X2\u0010Í÷Úù\u0006#îy\u0091ÚDö\u0082`i\u008c\u000f\u0001zp\u009a[ðKlÞ±C 2\u0015\u008c\u0010uSÍmä±²+\u001a\u00905¿¬I¬©\u000bÃ&èõª,àß\u0092ê\u0098\u0005 \u0003®\u008c\u0094\u0013\u0091^ny\u0011\u0012\u009bg52×ü\u0005!\u0015ÖÀ\u0092Î\u000bËn\u000e\u0014\u0007ÿ[´$¡n\u000fÒ\u009c\u000e.\u001f\f7þ\u0002\u0001å\u009dY\u0003\u001a\tÝX¥¤;>i$¼9%\u0098º¤ì)a\u0018°Ã¸\u0007¢¿\nª\u007fKú5\rªA\u0099\u0011\u008añg\u0019¬Ü⁓c\u009b>\u009e?\u0090ÍÍ*Q\b5ó×Z\u000f\u0005L\u0084Éâ\u008d÷%ä\u001bOOR8\u008dNp&\u000b\u00999 \u009e â¥8¤YBuîØü]\f\u008f\u000bù\u0013H»Ï\nB\n\u0007v\n\u0005Y×E\u0002ö@¥VZÐ\u0092¹\u0000(· 6õ²Ä%Z¨\u007f=\u0089#NÝ\b\u009fVí\u0095æ¹Ô\u0087g\u00adNØ\u0086Ð¥\u0011\u008dì;}ûÒ\u0098~ó±6\u0085TØ´Üþ\u0003³\u0010nÈy]\u0006e÷\u0083_\u0015Ý\u000bU\u008c3°\u0096ï´¶ÙáÑ\u000f\u0002\u009fgåÛä#\u0018\u0087v¥ \u0094{\n\u000e7¤\u000f$\u0082Ñúú\u0012¨jê\u0098\u0088\u0004\u0090KNø #î*\u007f\u0091ÛÌ1\u0019:<'\u009b7Ué:$8yUêNjvXW^ÕÁ$ë\u0019RXñÚù\u0012þ\u00adÚè\u0003\u000eÙe\n\u001d%³úµ\u0005©DÇ\u0015\u0015\u009eµ\u000b\u000e¹ª\u0001\u0089{b\u0084\u0096\u0004±o\u009c³ñ\u0012\u0006q\u0006À±7\u0097\u0083Ä\u000eA\u001d´´§¥`x\u008f\u0019\u0089ò´t\fU\\\u000f\u009d\u0085½óú¬\u001b\u008cO@`<ë\u000f\u008cË\u0093\u008fÂ\u008cj¼¿ÿ\u0093DÔ\u0081\u0018»$Sì\u008e|\u0005ò\u001c\u0001Zø38çsÔk³S\u008ahÒÄN&ÔC¬½ÊeÜú\u0018&oYí\u001f ¼Å\u0081\u0088"
         .length();
      char var1 = 21;
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 1;
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
                     case 0 -> 72;
                     case 1 -> 74;
                     case 2 -> 62;
                     case 3 -> 82;
                     case 4 -> 26;
                     case 5 -> 123;
                     default -> 117;
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
                     k = new String[83];
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl = new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII();
                     String[] var7 = new String[7];
                     var10002 = -3270;
                     short var52 = 218;
                     var7[0] = "Lava Springs";
                     var10002 = -3277;
                     short var53 = 16851;
                     var7[1] = "Upper Mines";
                     var10002 = -3256;
                     short var54 = -28650;
                     var7[2] = "Royal Mines";
                     var10002 = -3253;
                     short var55 = -15649;
                     var7[3] = "Cliffside Veins";
                     var10002 = -3252;
                     short var56 = -19801;
                     var7[4] = "Rampart's Quarry";
                     var10002 = -3212;
                     short var57 = -21825;
                     var7[5] = "Goblin Slayer";
                     var10002 = -3271;
                     short var58 = -23390;
                     var7[6] = "Glacite Walker Slayer";
                     IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = CollectionsKt.listOf(var7);
                     var7 = new String[2];
                     var10002 = -3239;
                     short var59 = 18269;
                     var7[0] = "Titanium Miner";
                     var10002 = -3240;
                     short var60 = -2087;
                     var7[1] = "Mithril Miner";
                     lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = CollectionsKt.listOf(var7);
                     var7 = new String[2];
                     var10002 = -3212;
                     short var61 = -21825;
                     var7[0] = "Goblin Slayer";
                     var10002 = -3271;
                     short var62 = -23390;
                     var7[1] = "Glacite Walker Slayer";
                     lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = CollectionsKt.listOf(var7);
                     var7 = new String[5];
                     var10002 = -3205;
                     short var63 = -29580;
                     var7[0] = "Lava Springs";
                     var10002 = -3204;
                     short var64 = 7104;
                     var7[1] = "Upper Mines";
                     var10002 = -3273;
                     short var65 = -26043;
                     var7[2] = "Royal Mines";
                     var10002 = -3215;
                     short var66 = 6725;
                     var7[3] = "Cliffside Veins";
                     var10002 = -3262;
                     short var67 = -31362;
                     var7[4] = "Rampart's Quarry";
                     lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = CollectionsKt.listOf(var7);
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var13 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
                     };
                     IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = SetsKt.setOf(var13);
                     IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var14 = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl,
                        IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
                     };
                     lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = SetsKt.setOf(var14);
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

                  var2 = "AïKôv\u000f×Ö'_d íxTf6\u0004@\u009f\u0091¶e0\u009a\t\u0012\u0084ê\u0084ÑGd\u009e\u000b";
                  var4 = "AïKôv\u000f×Ö'_d íxTf6\u0004@\u009f\u0091¶e0\u009a\t\u0012\u0084ê\u0084ÑGd\u009e\u000b".length();
                  var1 = 25;
                  var9 = -1;
            }

            var10000 = 62;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static final IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII bM() {
      return llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
   }

   public static final List<String> bN() {
      return IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   }

   public static final List<String> bO() {
      return lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   }

   public static final List<String> bP() {
      return lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   }

   public static final List<String> bQ() {
      return lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   }

   public static final void a(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0, IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }

   static boolean a(IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII var0, BlockPos var1, Vec3 var2, int var3, Object var4) {
      int var5 = me.octo.client.llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
      boolean var6;
      try {
         var6 = (var3 & 2) != 0;
         if (var5 != 0) {
            return var6;
         }
      } catch (NoWhenBranchMatchedException var7) {
         throw a(var7);
      }
      if (var6) {
         var2 = null;
      }
      return var0.a(var1, var2);
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   private static String e(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
      int var2 = (var0 ^ -3211) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

          var4 = switch (var3[0] & 0xFF) {
            case 0 -> 123;
            case 1 -> 169;
            case 2 -> 241;
            case 3 -> 190;
            case 4 -> 115;
            case 5 -> 198;
            case 6 -> 63;
            case 7 -> 77;
            case 8 -> 146;
            case 9 -> 207;
            case 10 -> 254;
            case 11 -> 98;
            case 12 -> 251;
            case 13 -> 220;
            case 14 -> 214;
            case 15 -> 79;
            case 16 -> 76;
            case 17 -> 177;
            case 18 -> 108;
            case 19 -> 23;
            case 20 -> 248;
            case 21 -> 225;
            case 22 -> 182;
            case 23 -> 164;
            case 24 -> 24;
            case 25 -> 235;
            case 26 -> 162;
            case 27 -> 60;
            case 28 -> 138;
            case 29 -> 40;
            case 30 -> 72;
            case 31 -> 36;
            case 32 -> 175;
            case 33 -> 152;
            case 34 -> 234;
            case 35 -> 166;
            case 36 -> 68;
            case 37 -> 111;
            case 38 -> 143;
            case 39 -> 4;
            case 40 -> 219;
            case 41 -> 213;
            case 42 -> 230;
            case 43 -> 245;
            case 44 -> 183;
            case 45 -> 92;
            case 46 -> 97;
            case 47 -> 217;
            case 48 -> 112;
            case 49 -> 174;
            case 50 -> 20;
            case 51 -> 171;
            case 52 -> 82;
            case 53 -> 222;
            case 54 -> 26;
            case 55 -> 255;
            case 56 -> 66;
            case 57 -> 52;
            case 58 -> 16;
            case 59 -> 204;
            case 60 -> 57;
            case 61 -> 231;
            case 62 -> 215;
            case 63 -> 33;
            case 64 -> 173;
            case 65 -> 153;
            case 66 -> 209;
            case 67 -> 185;
            case 68 -> 48;
            case 69 -> 22;
            case 70 -> 195;
            case 71 -> 94;
            case 72 -> 13;
            case 73 -> 242;
            case 74 -> 246;
            case 75 -> 133;
            case 76 -> 9;
            case 77 -> 59;
            case 78 -> 191;
            case 79 -> 228;
            case 80 -> 139;
            case 81 -> 180;
            case 82 -> 30;
            case 83 -> 193;
            case 84 -> 83;
            case 85 -> 55;
            case 86 -> 95;
            case 87 -> 249;
            case 88 -> 160;
            case 89 -> 233;
            case 90 -> 62;
            case 91 -> 116;
            case 92 -> 122;
            case 93 -> 188;
            case 94 -> 232;
            case 95 -> 167;
            case 96 -> 218;
            case 97 -> 1;
            case 98 -> 221;
            case 99 -> 38;
            case 100 -> 19;
            case 101 -> 148;
            case 102 -> 53;
            case 103 -> 44;
            case 104 -> 114;
            case 105 -> 189;
            case 106 -> 203;
            case 107 -> 11;
            case 108 -> 14;
            case 109 -> 21;
            case 110 -> 158;
            case 111 -> 102;
            case 112 -> 46;
            case 113 -> 145;
            case 114 -> 28;
            case 115 -> 35;
            case 116 -> 247;
            case 117 -> 5;
            case 118 -> 37;
            case 119 -> 113;
            case 120 -> 178;
            case 121 -> 136;
            case 122 -> 29;
            case 123 -> 127;
            case 124 -> 74;
            case 125 -> 50;
            case 126 -> 129;
            case 127 -> 200;
            case 128 -> 12;
            case 129 -> 216;
            case 130 -> 70;
            case 131 -> 124;
            case 132 -> 168;
            case 133 -> 208;
            case 134 -> 186;
            case 135 -> 107;
            case 136 -> 131;
            case 137 -> 45;
            case 138 -> 110;
            case 139 -> 126;
            case 140 -> 67;
            case 141 -> 157;
            case 142 -> 43;
            case 143 -> 250;
            case 144 -> 140;
            case 145 -> 101;
            case 146 -> 197;
            case 147 -> 147;
            case 148 -> 105;
            case 149 -> 142;
            case 150 -> 51;
            case 151 -> 236;
            case 152 -> 34;
            case 153 -> 93;
            case 154 -> 135;
            case 155 -> 7;
            case 156 -> 244;
            case 157 -> 8;
            case 158 -> 15;
            case 159 -> 196;
            case 160 -> 144;
            case 161 -> 205;
            case 162 -> 149;
            case 163 -> 199;
            case 164 -> 165;
            case 165 -> 170;
            case 166 -> 88;
            case 167 -> 89;
            case 168 -> 27;
            case 169 -> 227;
            case 170 -> 252;
            case 171 -> 58;
            case 172 -> 100;
            case 173 -> 229;
            case 174 -> 73;
            case 175 -> 192;
            case 176 -> 99;
            case 177 -> 81;
            case 178 -> 125;
            case 179 -> 6;
            case 180 -> 128;
            case 181 -> 61;
            case 182 -> 155;
            case 183 -> 151;
            case 184 -> 211;
            case 185 -> 17;
            case 186 -> 86;
            case 187 -> 223;
            case 188 -> 161;
            case 189 -> 141;
            case 190 -> 65;
            case 191 -> 243;
            case 192 -> 41;
            case 193 -> 87;
            case 194 -> 181;
            case 195 -> 104;
            case 196 -> 226;
            case 197 -> 78;
            case 198 -> 84;
            case 199 -> 201;
            case 200 -> 237;
            case 201 -> 0;
            case 202 -> 156;
            case 203 -> 154;
            case 204 -> 96;
            case 205 -> 49;
            case 206 -> 54;
            case 207 -> 184;
            case 208 -> 172;
            case 209 -> 159;
            case 210 -> 64;
            case 211 -> 121;
            case 212 -> 32;
            case 213 -> 117;
            case 214 -> 103;
            case 215 -> 18;
            case 216 -> 239;
            case 217 -> 119;
            case 218 -> 56;
            case 219 -> 202;
            case 220 -> 120;
            case 221 -> 212;
            case 222 -> 80;
            case 223 -> 210;
            case 224 -> 31;
            case 225 -> 179;
            case 226 -> 85;
            case 227 -> 137;
            case 228 -> 150;
            case 229 -> 106;
            case 230 -> 10;
            case 231 -> 69;
            case 232 -> 253;
            case 233 -> 25;
            case 234 -> 206;
            case 235 -> 71;
            case 236 -> 47;
            case 237 -> 134;
            case 238 -> 75;
            case 239 -> 39;
            case 240 -> 90;
            case 241 -> 240;
            case 242 -> 176;
            case 243 -> 91;
            case 244 -> 118;
            case 245 -> 224;
            case 246 -> 132;
            case 247 -> 238;
            case 248 -> 194;
            case 249 -> 42;
            case 250 -> 2;
            case 251 -> 163;
            case 252 -> 130;
            case 253 -> 3;
            case 254 -> 187;
            default -> 109;
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

   private static final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {
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

      public IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
         @Nullable String var1, @Nullable BlockPos var2, @Nullable BlockPos var3, int var4, @NotNull Triple<Integer, Integer, Integer> var5
      ) {
        
         short var10001 = -5713;
         short var10002 = 24796;
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
      public final IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(
         @Nullable String var1, @Nullable BlockPos var2, @Nullable BlockPos var3, int var4, @NotNull Triple<Integer, Integer, Integer> var5
      ) {
         short var10001 = -5716;
         short var10002 = 5005;
         Intrinsics.checkNotNullParameter(var5, "playerPos");
         return new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
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
        
         short var10000 = -5719;
         Triple var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         BlockPos var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
          var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
          var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 195;
         short var10002 = -5715;
          var10003 = -4620;
          var10004 = -5720;
          var10005 = -20484;
          var10006 = -5718;
         short var10007 = 5559;
         short var10008 = -5717;
         short var10009 = -16465;
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
               var10000 instanceof IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3 = (IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var10000;
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
         String var2 = "\"D\u008d\t¼Ó\u0014OQ\\\u0003Ô\u001cR¯\u000bA®~«\ri¨º±XW@\u000f\u000fµq\u0091\u0096Æ)#/ÔêR\u0081Öá\f\u0093¬ð»ä¦\u0002\u009eúÛ\u0010!\u0013ð]\u008e\u0085{{ÿb³\u0085 -Ó\u008c\u0099GÏ¹\u0082\u000f\u0013\u0007çÃì\u0017\u009aåY\f$IXµÚ";
          var4 = "\"D\u008d\t¼Ó\u0014OQ\\\u0003Ô\u001cR¯\u000bA®~«\ri¨º±XW@\u000f\u000fµq\u0091\u0096Æ)#/ÔêR\u0081Öá\f\u0093¬ð»ä¦\u0002\u009eúÛ\u0010!\u0013ð]\u008e\u0085{{ÿb³\u0085 -Ó\u008c\u0099GÏ¹\u0082\u000f\u0013\u0007çÃì\u0017\u009aåY\f$IXµÚ"
            .length();
         char var1 = 28;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 51;
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
                        case 0 -> 89;
                        case 1 -> 90;
                        case 2 -> 37;
                        case 3 -> 120;
                        case 4 -> 20;
                        case 5 -> 19;
                        default -> 97;
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

                     var2 = "äqâê«\n`F<\t¬/ë!\u008asDi¸";
                     var4 = "äqâê«\n`F<\t¬/ë!\u008asDi¸".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 42;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
         int var2 = (var0 ^ -5719) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 188;
               case 1 -> 178;
               case 2 -> 29;
               case 3 -> 87;
               case 4 -> 21;
               case 5 -> 38;
               case 6 -> 232;
               case 7 -> 205;
               case 8 -> 254;
               case 9 -> 82;
               case 10 -> 199;
               case 11 -> 84;
               case 12 -> 97;
               case 13 -> 96;
               case 14 -> 151;
               case 15 -> 26;
               case 16 -> 204;
               case 17 -> 170;
               case 18 -> 130;
               case 19 -> 57;
               case 20 -> 163;
               case 21 -> 203;
               case 22 -> 16;
               case 23 -> 164;
               case 24 -> 72;
               case 25 -> 77;
               case 26 -> 155;
               case 27 -> 115;
               case 28 -> 37;
               case 29 -> 81;
               case 30 -> 8;
               case 31 -> 95;
               case 32 -> 104;
               case 33 -> 210;
               case 34 -> 206;
               case 35 -> 0;
               case 36 -> 71;
               case 37 -> 30;
               case 38 -> 48;
               case 39 -> 12;
               case 40 -> 62;
               case 41 -> 192;
               case 42 -> 50;
               case 43 -> 202;
               case 44 -> 93;
               case 45 -> 152;
               case 46 -> 17;
               case 47 -> 195;
               case 48 -> 200;
               case 49 -> 209;
               case 50 -> 252;
               case 51 -> 235;
               case 52 -> 237;
               case 53 -> 236;
               case 54 -> 136;
               case 55 -> 161;
               case 56 -> 9;
               case 57 -> 233;
               case 58 -> 46;
               case 59 -> 243;
               case 60 -> 160;
               case 61 -> 112;
               case 62 -> 174;
               case 63 -> 182;
               case 64 -> 18;
               case 65 -> 162;
               case 66 -> 42;
               case 67 -> 197;
               case 68 -> 172;
               case 69 -> 214;
               case 70 -> 32;
               case 71 -> 168;
               case 72 -> 190;
               case 73 -> 238;
               case 74 -> 75;
               case 75 -> 92;
               case 76 -> 242;
               case 77 -> 230;
               case 78 -> 13;
               case 79 -> 105;
               case 80 -> 76;
               case 81 -> 142;
               case 82 -> 139;
               case 83 -> 108;
               case 84 -> 117;
               case 85 -> 156;
               case 86 -> 128;
               case 87 -> 165;
               case 88 -> 86;
               case 89 -> 113;
               case 90 -> 4;
               case 91 -> 110;
               case 92 -> 224;
               case 93 -> 189;
               case 94 -> 181;
               case 95 -> 176;
               case 96 -> 98;
               case 97 -> 225;
               case 98 -> 94;
               case 99 -> 135;
               case 100 -> 125;
               case 101 -> 179;
               case 102 -> 158;
               case 103 -> 14;
               case 104 -> 138;
               case 105 -> 101;
               case 106 -> 25;
               case 107 -> 44;
               case 108 -> 146;
               case 109 -> 220;
               case 110 -> 140;
               case 111 -> 175;
               case 112 -> 143;
               case 113 -> 217;
               case 114 -> 246;
               case 115 -> 191;
               case 116 -> 180;
               case 117 -> 47;
               case 118 -> 239;
               case 119 -> 250;
               case 120 -> 116;
               case 121 -> 159;
               case 122 -> 36;
               case 123 -> 148;
               case 124 -> 28;
               case 125 -> 184;
               case 126 -> 121;
               case 127 -> 208;
               case 128 -> 120;
               case 129 -> 52;
               case 130 -> 241;
               case 131 -> 119;
               case 132 -> 53;
               case 133 -> 99;
               case 134 -> 40;
               case 135 -> 171;
               case 136 -> 154;
               case 137 -> 100;
               case 138 -> 85;
               case 139 -> 6;
               case 140 -> 103;
               case 141 -> 167;
               case 142 -> 229;
               case 143 -> 245;
               case 144 -> 61;
               case 145 -> 49;
               case 146 -> 5;
               case 147 -> 231;
               case 148 -> 20;
               case 149 -> 35;
               case 150 -> 102;
               case 151 -> 166;
               case 152 -> 247;
               case 153 -> 249;
               case 154 -> 1;
               case 155 -> 127;
               case 156 -> 118;
               case 157 -> 65;
               case 158 -> 221;
               case 159 -> 226;
               case 160 -> 33;
               case 161 -> 244;
               case 162 -> 114;
               case 163 -> 107;
               case 164 -> 68;
               case 165 -> 27;
               case 166 -> 126;
               case 167 -> 234;
               case 168 -> 253;
               case 169 -> 149;
               case 170 -> 129;
               case 171 -> 70;
               case 172 -> 24;
               case 173 -> 255;
               case 174 -> 144;
               case 175 -> 153;
               case 176 -> 134;
               case 177 -> 56;
               case 178 -> 78;
               case 179 -> 186;
               case 180 -> 213;
               case 181 -> 183;
               case 182 -> 90;
               case 183 -> 194;
               case 184 -> 88;
               case 185 -> 74;
               case 186 -> 79;
               case 187 -> 157;
               case 188 -> 212;
               case 189 -> 185;
               case 190 -> 132;
               case 191 -> 83;
               case 192 -> 64;
               case 193 -> 177;
               case 194 -> 187;
               case 195 -> 109;
               case 196 -> 173;
               case 197 -> 11;
               case 198 -> 251;
               case 199 -> 55;
               case 200 -> 228;
               case 201 -> 7;
               case 202 -> 19;
               case 203 -> 215;
               case 204 -> 216;
               case 205 -> 41;
               case 206 -> 43;
               case 207 -> 111;
               case 208 -> 58;
               case 209 -> 137;
               case 210 -> 34;
               case 211 -> 227;
               case 212 -> 240;
               case 213 -> 80;
               case 214 -> 145;
               case 215 -> 89;
               case 216 -> 248;
               case 217 -> 39;
               case 218 -> 219;
               case 219 -> 3;
               case 220 -> 193;
               case 221 -> 31;
               case 222 -> 106;
               case 223 -> 45;
               case 224 -> 147;
               case 225 -> 124;
               case 226 -> 63;
               case 227 -> 141;
               case 228 -> 150;
               case 229 -> 196;
               case 230 -> 123;
               case 231 -> 60;
               case 232 -> 67;
               case 233 -> 69;
               case 234 -> 22;
               case 235 -> 169;
               case 236 -> 122;
               case 237 -> 222;
               case 238 -> 131;
               case 239 -> 207;
               case 240 -> 59;
               case 241 -> 10;
               case 242 -> 133;
               case 243 -> 54;
               case 244 -> 23;
               case 245 -> 223;
               case 246 -> 2;
               case 247 -> 201;
               case 248 -> 51;
               case 249 -> 218;
               case 250 -> 15;
               case 251 -> 198;
               case 252 -> 73;
               case 253 -> 91;
               case 254 -> 66;
               default -> 211;
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
       public static me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var0, java.lang.String var1, net.minecraft.core.BlockPos var2, net.minecraft.core.BlockPos var3, int var4, kotlin.Triple var5, int var6, java.lang.Object var7) {
           if ((var6 & 16) != 0) var5 = var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
           return var0.a(var1, var2, var3, var4, var5);
       }
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var1, @NotNull String var2
      ) {
         short var10001 = -4433;
         short var10002 = 5432;
         Intrinsics.checkNotNullParameter(var1, "area");
         var10001 = -4437;
         var10002 = 25988;
         Intrinsics.checkNotNullParameter(var2, "originalName");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var1, @NotNull String var2
      ) {
         short var10001 = -4440;
         short var10002 = 7164;
         Intrinsics.checkNotNullParameter(var1, "area");
         var10001 = -4434;
         var10002 = 3779;
         Intrinsics.checkNotNullParameter(var2, "originalName");
         return new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() { short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
         short var10002 = -4439;
          var10003 = 4370;
         var10003 = -4438;
          var10004 = 26623;
         return "CommissionChoice(area="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", originalName="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) { boolean var4 = false; // PX-FIX hoist
        
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
               var10000 instanceof IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
          var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 == 0) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { String[] var5 = null; // PX-FIX hoist
         int var4 = 0; // PX-FIX hoist
         int var10004 = 0; // PX-FIX hoist
        
      char[] var20 = null; // PX-FIX
   pxClinit: {
          var5 = new String[6];
         int var3 = 0;
         String var2 = "L\u009f¦\u0095\u007f\u0013·GÌÎª\u0019E~\u0095\f1¸$|é\u0090m\u001d±Êì1\u0004j)\u008cH\u0016\u0018D¬W|£ÍÀÔÛkðÓg[Ò¥Â«\u008a]e";
          var4 = "L\u009f¦\u0095\u007f\u0013·GÌÎª\u0019E~\u0095\f1¸$|é\u0090m\u001d±Êì1\u0004j)\u008cH\u0016\u0018D¬W|£ÍÀÔÛkðÓg[Ò¥Â«\u008a]e".length();
         char var1 = 15;
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
                        case 0 -> 25;
                        case 1 -> 110;
                        case 2 -> 95;
                        case 3 -> 104;
                        case 4 -> 62;
                        case 5 -> 98;
                        default -> 39;
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

                     var2 = "Pñ%xä=á\u0085\rôVÛ\u00043p\u008aN";
                     var4 = "Pñ%xä=á\u0085\rôVÛ\u00043p\u008aN".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var10000 = 118;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
         int var2 = (var0 ^ -4438) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 146;
               case 1 -> 185;
               case 2 -> 41;
               case 3 -> 84;
               case 4 -> 183;
               case 5 -> 24;
               case 6 -> 81;
               case 7 -> 250;
               case 8 -> 46;
               case 9 -> 134;
               case 10 -> 117;
               case 11 -> 216;
               case 12 -> 124;
               case 13 -> 82;
               case 14 -> 241;
               case 15 -> 189;
               case 16 -> 62;
               case 17 -> 49;
               case 18 -> 181;
               case 19 -> 60;
               case 20 -> 207;
               case 21 -> 219;
               case 22 -> 223;
               case 23 -> 63;
               case 24 -> 58;
               case 25 -> 55;
               case 26 -> 165;
               case 27 -> 15;
               case 28 -> 92;
               case 29 -> 163;
               case 30 -> 156;
               case 31 -> 153;
               case 32 -> 161;
               case 33 -> 86;
               case 34 -> 155;
               case 35 -> 122;
               case 36 -> 170;
               case 37 -> 12;
               case 38 -> 20;
               case 39 -> 242;
               case 40 -> 43;
               case 41 -> 74;
               case 42 -> 0;
               case 43 -> 25;
               case 44 -> 32;
               case 45 -> 176;
               case 46 -> 133;
               case 47 -> 131;
               case 48 -> 6;
               case 49 -> 97;
               case 50 -> 167;
               case 51 -> 110;
               case 52 -> 75;
               case 53 -> 252;
               case 54 -> 172;
               case 55 -> 159;
               case 56 -> 105;
               case 57 -> 7;
               case 58 -> 213;
               case 59 -> 157;
               case 60 -> 47;
               case 61 -> 205;
               case 62 -> 71;
               case 63 -> 115;
               case 64 -> 254;
               case 65 -> 142;
               case 66 -> 195;
               case 67 -> 113;
               case 68 -> 44;
               case 69 -> 123;
               case 70 -> 77;
               case 71 -> 127;
               case 72 -> 5;
               case 73 -> 235;
               case 74 -> 224;
               case 75 -> 22;
               case 76 -> 150;
               case 77 -> 30;
               case 78 -> 53;
               case 79 -> 152;
               case 80 -> 233;
               case 81 -> 208;
               case 82 -> 158;
               case 83 -> 106;
               case 84 -> 37;
               case 85 -> 137;
               case 86 -> 98;
               case 87 -> 214;
               case 88 -> 238;
               case 89 -> 171;
               case 90 -> 101;
               case 91 -> 255;
               case 92 -> 251;
               case 93 -> 211;
               case 94 -> 39;
               case 95 -> 246;
               case 96 -> 10;
               case 97 -> 178;
               case 98 -> 199;
               case 99 -> 212;
               case 100 -> 85;
               case 101 -> 169;
               case 102 -> 231;
               case 103 -> 36;
               case 104 -> 31;
               case 105 -> 151;
               case 106 -> 174;
               case 107 -> 144;
               case 108 -> 154;
               case 109 -> 226;
               case 110 -> 249;
               case 111 -> 138;
               case 112 -> 118;
               case 113 -> 11;
               case 114 -> 166;
               case 115 -> 83;
               case 116 -> 73;
               case 117 -> 190;
               case 118 -> 107;
               case 119 -> 164;
               case 120 -> 168;
               case 121 -> 78;
               case 122 -> 204;
               case 123 -> 29;
               case 124 -> 4;
               case 125 -> 192;
               case 126 -> 173;
               case 127 -> 8;
               case 128 -> 104;
               case 129 -> 197;
               case 130 -> 13;
               case 131 -> 218;
               case 132 -> 88;
               case 133 -> 64;
               case 134 -> 234;
               case 135 -> 93;
               case 136 -> 179;
               case 137 -> 236;
               case 138 -> 126;
               case 139 -> 72;
               case 140 -> 108;
               case 141 -> 103;
               case 142 -> 59;
               case 143 -> 100;
               case 144 -> 247;
               case 145 -> 220;
               case 146 -> 40;
               case 147 -> 147;
               case 148 -> 56;
               case 149 -> 210;
               case 150 -> 149;
               case 151 -> 141;
               case 152 -> 51;
               case 153 -> 191;
               case 154 -> 28;
               case 155 -> 69;
               case 156 -> 136;
               case 157 -> 230;
               case 158 -> 1;
               case 159 -> 21;
               case 160 -> 243;
               case 161 -> 143;
               case 162 -> 125;
               case 163 -> 50;
               case 164 -> 225;
               case 165 -> 203;
               case 166 -> 67;
               case 167 -> 90;
               case 168 -> 227;
               case 169 -> 33;
               case 170 -> 87;
               case 171 -> 3;
               case 172 -> 112;
               case 173 -> 96;
               case 174 -> 119;
               case 175 -> 27;
               case 176 -> 188;
               case 177 -> 201;
               case 178 -> 228;
               case 179 -> 245;
               case 180 -> 16;
               case 181 -> 217;
               case 182 -> 116;
               case 183 -> 80;
               case 184 -> 94;
               case 185 -> 129;
               case 186 -> 65;
               case 187 -> 66;
               case 188 -> 18;
               case 189 -> 38;
               case 190 -> 215;
               case 191 -> 109;
               case 192 -> 180;
               case 193 -> 248;
               case 194 -> 177;
               case 195 -> 89;
               case 196 -> 45;
               case 197 -> 121;
               case 198 -> 130;
               case 199 -> 194;
               case 200 -> 9;
               case 201 -> 198;
               case 202 -> 175;
               case 203 -> 221;
               case 204 -> 184;
               case 205 -> 140;
               case 206 -> 114;
               case 207 -> 79;
               case 208 -> 139;
               case 209 -> 91;
               case 210 -> 23;
               case 211 -> 95;
               case 212 -> 162;
               case 213 -> 253;
               case 214 -> 61;
               case 215 -> 148;
               case 216 -> 2;
               case 217 -> 99;
               case 218 -> 14;
               case 219 -> 209;
               case 220 -> 182;
               case 221 -> 229;
               case 222 -> 76;
               case 223 -> 26;
               case 224 -> 239;
               case 225 -> 120;
               case 226 -> 186;
               case 227 -> 68;
               case 228 -> 57;
               case 229 -> 128;
               case 230 -> 17;
               case 231 -> 42;
               case 232 -> 34;
               case 233 -> 196;
               case 234 -> 202;
               case 235 -> 48;
               case 236 -> 102;
               case 237 -> 145;
               case 238 -> 54;
               case 239 -> 160;
               case 240 -> 193;
               case 241 -> 132;
               case 242 -> 222;
               case 243 -> 187;
               case 244 -> 19;
               case 245 -> 35;
               case 246 -> 206;
               case 247 -> 135;
               case 248 -> 200;
               case 249 -> 237;
               case 250 -> 240;
               case 251 -> 244;
               case 252 -> 111;
               case 253 -> 70;
               case 254 -> 52;
               default -> 232;
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
       public static me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0, me.octo.client.llIlIIIllIlIlllIlllIIIIllIIlIlIllIllIIIIlIllIIIIIIlIllllllIlIIIIIlllIIlIIlllllIIlIIIl var1, java.lang.String var2, int var3, java.lang.Object var4) {
           if ((var3 & 2) != 0) var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
           return var0.a(var1, var2);
       }
   }

   public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(Object... px) {
        }

      private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
      }

      @NotNull
      public final IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII a() {
         return IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
      }

      @NotNull
      public final List<String> b() {
         return IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
      }

      @NotNull
      public final List<String> c() {
         return IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
      }

      @NotNull
      public final List<String> d() {
         return IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
      }

      @NotNull
      public final List<String> e() {
         return IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
      }
       public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }

   private static enum IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

      public static IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl[] a() {
         return (IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl[])IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clone();
      }

      public static IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl a(
         String var0
      ) {
         return Enum.valueOf(
            IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl> b() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI};
      private static final EnumEntries<IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = kotlin.enums.EnumEntriesKt.enumEntries(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
       private static final me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl[] c() {
           me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl[] var0 = new me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl[4];
           var0[0] = me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
           var0[1] = me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
           var0[2] = me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
           var0[3] = me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
           return var0;
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
         short var10001 = 20710;
         short var10002 = 4401;
         Intrinsics.checkNotNullParameter(var1, "botProgress");
         var10001 = 20707;
         var10002 = 29462;
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
      public final IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull Object var1, @NotNull Triple<Integer, Integer, Integer> var2, int var3, boolean var4
      ) {
         short var10001 = 20711;
         short var10002 = 9970;
         Intrinsics.checkNotNullParameter(var1, "botProgress");
         var10001 = 20704;
         var10002 = 10664;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         return new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
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
        
         short var10000 = 20709;
         boolean var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Triple var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
          var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -28871;
         short var10002 = 20708;
          var10003 = -25230;
          var10004 = 20706;
          var10005 = -31724;
          var10006 = 20705;
         short var10007 = -28138;
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
               var10000 instanceof IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
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
         String var2 = "Þ8\u0094\"®\u0080\u001fF\u0089\u009a\u0004 QiÁ\rs>!ÑÆ¿w\u0010d%2\fâ]\u008c&\u0013Â\u009d¢u\u000eBã\u000b²/\u0005òµõ:\u0090öT¡\u000bé n\u0003ØË\u0097WC¬\u0017\u0011 L×\u0007\u0005\u0091Þ_³\u0096Áe`·pN\u0099\td\u009d\u009aîæg\u0092a$";
          var4 = "Þ8\u0094\"®\u0080\u001fF\u0089\u009a\u0004 QiÁ\rs>!ÑÆ¿w\u0010d%2\fâ]\u008c&\u0013Â\u009d¢u\u000eBã\u000b²/\u0005òµõ:\u0090öT¡\u000bé n\u0003ØË\u0097WC¬\u0017\u0011 L×\u0007\u0005\u0091Þ_³\u0096Áe`·pN\u0099\td\u009d\u009aîæg\u0092a$"
            .length();
         char var1 = 27;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 21;
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
                        case 0 -> 37;
                        case 1 -> 65;
                        case 2 -> 26;
                        case 3 -> 90;
                        case 4 -> 105;
                        case 5 -> 98;
                        default -> 77;
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

                     var2 = "\u009e»6Ù\u0080r\u00ad00\u0017O\u0097Ù\u008f7skðö\u0090\u009aVÏ\u000e¦+Üÿî\u0007USò";
                     var4 = "\u009e»6Ù\u0080r\u00ad00\u0017O\u0097Ù\u008f7skðö\u0090\u009aVÏ\u000e¦+Üÿî\u0007USò".length();
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

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
         int var2 = (var0 ^ 20709) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 222;
               case 1 -> 216;
               case 2 -> 165;
               case 3 -> 229;
               case 4 -> 130;
               case 5 -> 135;
               case 6 -> 110;
               case 7 -> 1;
               case 8 -> 145;
               case 9 -> 238;
               case 10 -> 164;
               case 11 -> 169;
               case 12 -> 161;
               case 13 -> 29;
               case 14 -> 76;
               case 15 -> 194;
               case 16 -> 42;
               case 17 -> 93;
               case 18 -> 159;
               case 19 -> 62;
               case 20 -> 12;
               case 21 -> 108;
               case 22 -> 24;
               case 23 -> 235;
               case 24 -> 190;
               case 25 -> 174;
               case 26 -> 236;
               case 27 -> 86;
               case 28 -> 160;
               case 29 -> 60;
               case 30 -> 193;
               case 31 -> 168;
               case 32 -> 215;
               case 33 -> 219;
               case 34 -> 197;
               case 35 -> 223;
               case 36 -> 251;
               case 37 -> 15;
               case 38 -> 241;
               case 39 -> 172;
               case 40 -> 16;
               case 41 -> 105;
               case 42 -> 13;
               case 43 -> 103;
               case 44 -> 78;
               case 45 -> 53;
               case 46 -> 0;
               case 47 -> 213;
               case 48 -> 113;
               case 49 -> 75;
               case 50 -> 234;
               case 51 -> 123;
               case 52 -> 176;
               case 53 -> 28;
               case 54 -> 138;
               case 55 -> 111;
               case 56 -> 249;
               case 57 -> 243;
               case 58 -> 217;
               case 59 -> 41;
               case 60 -> 221;
               case 61 -> 122;
               case 62 -> 143;
               case 63 -> 23;
               case 64 -> 212;
               case 65 -> 117;
               case 66 -> 14;
               case 67 -> 177;
               case 68 -> 92;
               case 69 -> 157;
               case 70 -> 34;
               case 71 -> 133;
               case 72 -> 252;
               case 73 -> 214;
               case 74 -> 27;
               case 75 -> 240;
               case 76 -> 50;
               case 77 -> 82;
               case 78 -> 239;
               case 79 -> 74;
               case 80 -> 225;
               case 81 -> 48;
               case 82 -> 112;
               case 83 -> 37;
               case 84 -> 132;
               case 85 -> 99;
               case 86 -> 6;
               case 87 -> 20;
               case 88 -> 162;
               case 89 -> 88;
               case 90 -> 183;
               case 91 -> 10;
               case 92 -> 3;
               case 93 -> 228;
               case 94 -> 226;
               case 95 -> 11;
               case 96 -> 56;
               case 97 -> 146;
               case 98 -> 8;
               case 99 -> 171;
               case 100 -> 139;
               case 101 -> 126;
               case 102 -> 66;
               case 103 -> 201;
               case 104 -> 153;
               case 105 -> 191;
               case 106 -> 187;
               case 107 -> 96;
               case 108 -> 121;
               case 109 -> 155;
               case 110 -> 189;
               case 111 -> 242;
               case 112 -> 84;
               case 113 -> 25;
               case 114 -> 196;
               case 115 -> 51;
               case 116 -> 136;
               case 117 -> 39;
               case 118 -> 147;
               case 119 -> 170;
               case 120 -> 179;
               case 121 -> 181;
               case 122 -> 186;
               case 123 -> 36;
               case 124 -> 38;
               case 125 -> 30;
               case 126 -> 54;
               case 127 -> 218;
               case 128 -> 49;
               case 129 -> 149;
               case 130 -> 18;
               case 131 -> 89;
               case 132 -> 141;
               case 133 -> 120;
               case 134 -> 52;
               case 135 -> 231;
               case 136 -> 22;
               case 137 -> 68;
               case 138 -> 94;
               case 139 -> 200;
               case 140 -> 83;
               case 141 -> 150;
               case 142 -> 72;
               case 143 -> 101;
               case 144 -> 90;
               case 145 -> 199;
               case 146 -> 47;
               case 147 -> 87;
               case 148 -> 178;
               case 149 -> 151;
               case 150 -> 154;
               case 151 -> 79;
               case 152 -> 65;
               case 153 -> 167;
               case 154 -> 244;
               case 155 -> 7;
               case 156 -> 57;
               case 157 -> 80;
               case 158 -> 166;
               case 159 -> 195;
               case 160 -> 85;
               case 161 -> 173;
               case 162 -> 208;
               case 163 -> 45;
               case 164 -> 114;
               case 165 -> 58;
               case 166 -> 63;
               case 167 -> 19;
               case 168 -> 202;
               case 169 -> 40;
               case 170 -> 2;
               case 171 -> 188;
               case 172 -> 210;
               case 173 -> 246;
               case 174 -> 26;
               case 175 -> 33;
               case 176 -> 59;
               case 177 -> 158;
               case 178 -> 73;
               case 179 -> 119;
               case 180 -> 198;
               case 181 -> 137;
               case 182 -> 98;
               case 183 -> 67;
               case 184 -> 156;
               case 185 -> 106;
               case 186 -> 77;
               case 187 -> 180;
               case 188 -> 233;
               case 189 -> 255;
               case 190 -> 182;
               case 191 -> 203;
               case 192 -> 248;
               case 193 -> 211;
               case 194 -> 46;
               case 195 -> 32;
               case 196 -> 250;
               case 197 -> 175;
               case 198 -> 142;
               case 199 -> 184;
               case 200 -> 152;
               case 201 -> 148;
               case 202 -> 224;
               case 203 -> 232;
               case 204 -> 107;
               case 205 -> 207;
               case 206 -> 127;
               case 207 -> 134;
               case 208 -> 253;
               case 209 -> 230;
               case 210 -> 116;
               case 211 -> 102;
               case 212 -> 124;
               case 213 -> 64;
               case 214 -> 237;
               case 215 -> 61;
               case 216 -> 17;
               case 217 -> 118;
               case 218 -> 205;
               case 219 -> 245;
               case 220 -> 163;
               case 221 -> 104;
               case 222 -> 21;
               case 223 -> 95;
               case 224 -> 97;
               case 225 -> 128;
               case 226 -> 254;
               case 227 -> 125;
               case 228 -> 192;
               case 229 -> 206;
               case 230 -> 204;
               case 231 -> 100;
               case 232 -> 43;
               case 233 -> 185;
               case 234 -> 81;
               case 235 -> 35;
               case 236 -> 144;
               case 237 -> 4;
               case 238 -> 140;
               case 239 -> 91;
               case 240 -> 44;
               case 241 -> 55;
               case 242 -> 220;
               case 243 -> 247;
               case 244 -> 115;
               case 245 -> 209;
               case 246 -> 227;
               case 247 -> 5;
               case 248 -> 129;
               case 249 -> 71;
               case 250 -> 69;
               case 251 -> 9;
               case 252 -> 131;
               case 253 -> 109;
               case 254 -> 70;
               default -> 31;
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
       public static me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, java.lang.Object var1, kotlin.Triple var2, int var3, boolean var4, int var5, java.lang.Object var6) {
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
         short var10001 = 17470;
         short var10002 = -8946;
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
      public final IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @Nullable Object var1, @NotNull Triple<Integer, Integer, Integer> var2, int var3, int var4, boolean var5, @Nullable String var6, int var7
      ) {
         short var10001 = 17467;
         short var10002 = 22585;
         Intrinsics.checkNotNullParameter(var2, "playerPos");
         return new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
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
        
         short var10000 = 17465;
         int var1 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         String var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
          var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
          var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Triple var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         Object var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -3673;
         short var10002 = 17471;
          var10003 = 24876;
          var10004 = 17469;
          var10005 = 1130;
          var10006 = 17460;
         short var10007 = 21971;
         short var10008 = 17464;
         short var10009 = -32110;
         short var10010 = 17466;
         short var10011 = 2311;
         short var10012 = 17468;
         short var10013 = -23691;
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
               var10000 instanceof IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
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
         String var2 = "4²æÝÛJzþN\u0001{o\u0080¥fÄ\u0094ôì\u0015\u00998ñ\u000b\u000b5\n'-W¿j\u0097r\u008d\tmZ\u0018\u0013NXø\\\u0000\fHWzb5Ê&ykÖ\u0084\u0000\n!\u0005D(\u008b\u0099ö]\u008aõ\u0015yÄÏÐ¼\u0010\u008d3Ü<µ\u00ad\u0012(/\u007fÇ\u0005ÄAÄ\u000e`2|Á\u0085LA*\u0083%\u001aéÂI";
          var4 = "4²æÝÛJzþN\u0001{o\u0080¥fÄ\u0094ôì\u0015\u00998ñ\u000b\u000b5\n'-W¿j\u0097r\u008d\tmZ\u0018\u0013NXø\\\u0000\fHWzb5Ê&ykÖ\u0084\u0000\n!\u0005D(\u008b\u0099ö]\u008aõ\u0015yÄÏÐ¼\u0010\u008d3Ü<µ\u00ad\u0012(/\u007fÇ\u0005ÄAÄ\u000e`2|Á\u0085LA*\u0083%\u001aéÂI"
            .length();
         char var1 = 23;
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
                        case 0 -> 52;
                        case 1 -> 108;
                        case 2 -> 56;
                        case 3 -> 89;
                        case 4 -> 118;
                        case 5 -> 33;
                        default -> 114;
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

                     var2 = "ú¡\u0007\u0081@çÔFh\fÈ\u0002\u0085&`áÉyè#ÁH";
                     var4 = "ú¡\u0007\u0081@çÔFh\fÈ\u0002\u0085&`áÉyè#ÁH".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 62;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var5 = 0; // PX-FIX hoist
         short var4 = (short)0; // PX-FIX hoist
        
         int var2 = (var0 ^ 17468) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 232;
               case 1 -> 60;
               case 2 -> 218;
               case 3 -> 123;
               case 4 -> 6;
               case 5 -> 254;
               case 6 -> 236;
               case 7 -> 1;
               case 8 -> 113;
               case 9 -> 197;
               case 10 -> 124;
               case 11 -> 140;
               case 12 -> 198;
               case 13 -> 238;
               case 14 -> 41;
               case 15 -> 183;
               case 16 -> 20;
               case 17 -> 193;
               case 18 -> 251;
               case 19 -> 115;
               case 20 -> 29;
               case 21 -> 28;
               case 22 -> 18;
               case 23 -> 159;
               case 24 -> 133;
               case 25 -> 203;
               case 26 -> 109;
               case 27 -> 53;
               case 28 -> 52;
               case 29 -> 82;
               case 30 -> 26;
               case 31 -> 0;
               case 32 -> 190;
               case 33 -> 213;
               case 34 -> 188;
               case 35 -> 23;
               case 36 -> 150;
               case 37 -> 165;
               case 38 -> 237;
               case 39 -> 222;
               case 40 -> 85;
               case 41 -> 5;
               case 42 -> 164;
               case 43 -> 108;
               case 44 -> 144;
               case 45 -> 177;
               case 46 -> 204;
               case 47 -> 4;
               case 48 -> 181;
               case 49 -> 195;
               case 50 -> 241;
               case 51 -> 72;
               case 52 -> 88;
               case 53 -> 120;
               case 54 -> 50;
               case 55 -> 54;
               case 56 -> 66;
               case 57 -> 228;
               case 58 -> 51;
               case 59 -> 13;
               case 60 -> 255;
               case 61 -> 224;
               case 62 -> 64;
               case 63 -> 158;
               case 64 -> 8;
               case 65 -> 92;
               case 66 -> 33;
               case 67 -> 246;
               case 68 -> 2;
               case 69 -> 219;
               case 70 -> 121;
               case 71 -> 106;
               case 72 -> 194;
               case 73 -> 136;
               case 74 -> 172;
               case 75 -> 240;
               case 76 -> 100;
               case 77 -> 38;
               case 78 -> 239;
               case 79 -> 103;
               case 80 -> 63;
               case 81 -> 192;
               case 82 -> 101;
               case 83 -> 39;
               case 84 -> 173;
               case 85 -> 248;
               case 86 -> 220;
               case 87 -> 19;
               case 88 -> 191;
               case 89 -> 142;
               case 90 -> 152;
               case 91 -> 47;
               case 92 -> 217;
               case 93 -> 7;
               case 94 -> 9;
               case 95 -> 235;
               case 96 -> 155;
               case 97 -> 138;
               case 98 -> 46;
               case 99 -> 249;
               case 100 -> 119;
               case 101 -> 179;
               case 102 -> 96;
               case 103 -> 110;
               case 104 -> 178;
               case 105 -> 233;
               case 106 -> 107;
               case 107 -> 21;
               case 108 -> 151;
               case 109 -> 91;
               case 110 -> 80;
               case 111 -> 221;
               case 112 -> 43;
               case 113 -> 84;
               case 114 -> 55;
               case 115 -> 214;
               case 116 -> 156;
               case 117 -> 244;
               case 118 -> 215;
               case 119 -> 170;
               case 120 -> 145;
               case 121 -> 122;
               case 122 -> 209;
               case 123 -> 30;
               case 124 -> 34;
               case 125 -> 61;
               case 126 -> 76;
               case 127 -> 75;
               case 128 -> 79;
               case 129 -> 86;
               case 130 -> 137;
               case 131 -> 67;
               case 132 -> 201;
               case 133 -> 117;
               case 134 -> 94;
               case 135 -> 111;
               case 136 -> 206;
               case 137 -> 69;
               case 138 -> 128;
               case 139 -> 130;
               case 140 -> 16;
               case 141 -> 186;
               case 142 -> 45;
               case 143 -> 242;
               case 144 -> 3;
               case 145 -> 112;
               case 146 -> 231;
               case 147 -> 250;
               case 148 -> 22;
               case 149 -> 31;
               case 150 -> 202;
               case 151 -> 74;
               case 152 -> 95;
               case 153 -> 57;
               case 154 -> 44;
               case 155 -> 131;
               case 156 -> 184;
               case 157 -> 126;
               case 158 -> 49;
               case 159 -> 171;
               case 160 -> 78;
               case 161 -> 160;
               case 162 -> 17;
               case 163 -> 162;
               case 164 -> 141;
               case 165 -> 62;
               case 166 -> 154;
               case 167 -> 127;
               case 168 -> 243;
               case 169 -> 42;
               case 170 -> 59;
               case 171 -> 174;
               case 172 -> 149;
               case 173 -> 97;
               case 174 -> 132;
               case 175 -> 146;
               case 176 -> 118;
               case 177 -> 163;
               case 178 -> 40;
               case 179 -> 12;
               case 180 -> 98;
               case 181 -> 37;
               case 182 -> 157;
               case 183 -> 176;
               case 184 -> 212;
               case 185 -> 134;
               case 186 -> 182;
               case 187 -> 153;
               case 188 -> 125;
               case 189 -> 36;
               case 190 -> 200;
               case 191 -> 116;
               case 192 -> 114;
               case 193 -> 234;
               case 194 -> 229;
               case 195 -> 77;
               case 196 -> 161;
               case 197 -> 129;
               case 198 -> 70;
               case 199 -> 180;
               case 200 -> 56;
               case 201 -> 210;
               case 202 -> 139;
               case 203 -> 167;
               case 204 -> 226;
               case 205 -> 81;
               case 206 -> 15;
               case 207 -> 187;
               case 208 -> 105;
               case 209 -> 48;
               case 210 -> 90;
               case 211 -> 208;
               case 212 -> 25;
               case 213 -> 199;
               case 214 -> 230;
               case 215 -> 87;
               case 216 -> 10;
               case 217 -> 147;
               case 218 -> 247;
               case 219 -> 211;
               case 220 -> 207;
               case 221 -> 223;
               case 222 -> 32;
               case 223 -> 68;
               case 224 -> 205;
               case 225 -> 104;
               case 226 -> 99;
               case 227 -> 71;
               case 228 -> 252;
               case 229 -> 189;
               case 230 -> 35;
               case 231 -> 135;
               case 232 -> 196;
               case 233 -> 24;
               case 234 -> 245;
               case 235 -> 14;
               case 236 -> 27;
               case 237 -> 89;
               case 238 -> 216;
               case 239 -> 168;
               case 240 -> 185;
               case 241 -> 169;
               case 242 -> 93;
               case 243 -> 227;
               case 244 -> 143;
               case 245 -> 102;
               case 246 -> 11;
               case 247 -> 58;
               case 248 -> 73;
               case 249 -> 166;
               case 250 -> 65;
               case 251 -> 148;
               case 252 -> 175;
               case 253 -> 225;
               case 254 -> 253;
               default -> 83;
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
       public static me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, java.lang.Object var1, kotlin.Triple var2, int var3, int var4, boolean var5, java.lang.String var6, int var7, int var8, java.lang.Object var9) {
           return var0.a(var1, var2, var3, var4, var5, var6, var7);
       }
   }

   private static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(int var1, int var2, boolean var3) {
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
      public final IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(
         int var1, int var2, boolean var3
      ) {
         return new IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() { short var10005 = (short)0; // PX-FIX hoist
         short var10004 = (short)0; // PX-FIX hoist
         short var10003 = (short)0; // PX-FIX hoist
        
         short var10000 = 1067;
         boolean var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -30765;
         short var10002 = 1064;
          var10003 = 10889;
          var10004 = 1065;
          var10005 = -14601;
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
               var10000 instanceof IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var3 = (IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var10000;
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
         String var2 = "\u0080ûÁ®\u0007¶\fo·\u0082\u001e'\u0089m\u0099K¶\u0017\u0015^s\u001aQ Æ½îØ5lÛ(\u0003B\u0089~wÖ\u0007N\u0015\u001bÇqi\u0099½\u009c\u0001`\u0014Lè:Þ¸äfÃø\u0004TN\u0004\u00ad\u0019Æ\u0002o";
          var4 = "\u0080ûÁ®\u0007¶\fo·\u0082\u001e'\u0089m\u0099K¶\u0017\u0015^s\u001aQ Æ½îØ5lÛ(\u0003B\u0089~wÖ\u0007N\u0015\u001bÇqi\u0099½\u009c\u0001`\u0014Lè:Þ¸äfÃø\u0004TN\u0004\u00ad\u0019Æ\u0002o"
            .length();
         char var1 = 17;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
                var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                var10004 = var10003.length;
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
                     case 0 -> 39;
                     case 1 -> 1;
                     case 2 -> 23;
                     case 3 -> 82;
                     case 4 -> 87;
                     case 5 -> 46;
                     default -> 71;
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
        
         int var2 = (var0 ^ 1065) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

             var4 = switch (var3[0] & 0xFF) {
               case 0 -> 209;
               case 1 -> 172;
               case 2 -> 187;
               case 3 -> 43;
               case 4 -> 122;
               case 5 -> 249;
               case 6 -> 114;
               case 7 -> 65;
               case 8 -> 204;
               case 9 -> 84;
               case 10 -> 142;
               case 11 -> 150;
               case 12 -> 210;
               case 13 -> 132;
               case 14 -> 236;
               case 15 -> 27;
               case 16 -> 111;
               case 17 -> 208;
               case 18 -> 213;
               case 19 -> 24;
               case 20 -> 71;
               case 21 -> 76;
               case 22 -> 87;
               case 23 -> 30;
               case 24 -> 206;
               case 25 -> 34;
               case 26 -> 145;
               case 27 -> 22;
               case 28 -> 33;
               case 29 -> 164;
               case 30 -> 229;
               case 31 -> 6;
               case 32 -> 156;
               case 33 -> 223;
               case 34 -> 251;
               case 35 -> 250;
               case 36 -> 216;
               case 37 -> 44;
               case 38 -> 238;
               case 39 -> 245;
               case 40 -> 167;
               case 41 -> 53;
               case 42 -> 64;
               case 43 -> 109;
               case 44 -> 225;
               case 45 -> 228;
               case 46 -> 211;
               case 47 -> 190;
               case 48 -> 107;
               case 49 -> 100;
               case 50 -> 38;
               case 51 -> 50;
               case 52 -> 106;
               case 53 -> 58;
               case 54 -> 138;
               case 55 -> 54;
               case 56 -> 243;
               case 57 -> 234;
               case 58 -> 57;
               case 59 -> 49;
               case 60 -> 205;
               case 61 -> 183;
               case 62 -> 105;
               case 63 -> 59;
               case 64 -> 220;
               case 65 -> 154;
               case 66 -> 80;
               case 67 -> 222;
               case 68 -> 128;
               case 69 -> 5;
               case 70 -> 115;
               case 71 -> 230;
               case 72 -> 55;
               case 73 -> 14;
               case 74 -> 70;
               case 75 -> 29;
               case 76 -> 56;
               case 77 -> 62;
               case 78 -> 180;
               case 79 -> 247;
               case 80 -> 169;
               case 81 -> 86;
               case 82 -> 186;
               case 83 -> 255;
               case 84 -> 89;
               case 85 -> 179;
               case 86 -> 15;
               case 87 -> 90;
               case 88 -> 147;
               case 89 -> 23;
               case 90 -> 129;
               case 91 -> 140;
               case 92 -> 0;
               case 93 -> 83;
               case 94 -> 124;
               case 95 -> 85;
               case 96 -> 146;
               case 97 -> 198;
               case 98 -> 163;
               case 99 -> 41;
               case 100 -> 237;
               case 101 -> 202;
               case 102 -> 47;
               case 103 -> 231;
               case 104 -> 7;
               case 105 -> 26;
               case 106 -> 175;
               case 107 -> 212;
               case 108 -> 157;
               case 109 -> 224;
               case 110 -> 158;
               case 111 -> 242;
               case 112 -> 48;
               case 113 -> 60;
               case 114 -> 131;
               case 115 -> 28;
               case 116 -> 184;
               case 117 -> 99;
               case 118 -> 134;
               case 119 -> 170;
               case 120 -> 191;
               case 121 -> 174;
               case 122 -> 162;
               case 123 -> 125;
               case 124 -> 139;
               case 125 -> 94;
               case 126 -> 101;
               case 127 -> 127;
               case 128 -> 51;
               case 129 -> 155;
               case 130 -> 214;
               case 131 -> 1;
               case 132 -> 10;
               case 133 -> 252;
               case 134 -> 117;
               case 135 -> 182;
               case 136 -> 108;
               case 137 -> 97;
               case 138 -> 119;
               case 139 -> 52;
               case 140 -> 177;
               case 141 -> 40;
               case 142 -> 239;
               case 143 -> 82;
               case 144 -> 79;
               case 145 -> 11;
               case 146 -> 104;
               case 147 -> 45;
               case 148 -> 74;
               case 149 -> 126;
               case 150 -> 248;
               case 151 -> 93;
               case 152 -> 181;
               case 153 -> 173;
               case 154 -> 67;
               case 155 -> 2;
               case 156 -> 149;
               case 157 -> 92;
               case 158 -> 219;
               case 159 -> 68;
               case 160 -> 133;
               case 161 -> 66;
               case 162 -> 188;
               case 163 -> 37;
               case 164 -> 218;
               case 165 -> 144;
               case 166 -> 77;
               case 167 -> 168;
               case 168 -> 176;
               case 169 -> 165;
               case 170 -> 197;
               case 171 -> 61;
               case 172 -> 227;
               case 173 -> 148;
               case 174 -> 161;
               case 175 -> 195;
               case 176 -> 193;
               case 177 -> 143;
               case 178 -> 199;
               case 179 -> 18;
               case 180 -> 135;
               case 181 -> 160;
               case 182 -> 136;
               case 183 -> 113;
               case 184 -> 19;
               case 185 -> 253;
               case 186 -> 13;
               case 187 -> 25;
               case 188 -> 42;
               case 189 -> 9;
               case 190 -> 207;
               case 191 -> 171;
               case 192 -> 75;
               case 193 -> 232;
               case 194 -> 200;
               case 195 -> 8;
               case 196 -> 81;
               case 197 -> 63;
               case 198 -> 123;
               case 199 -> 159;
               case 200 -> 118;
               case 201 -> 241;
               case 202 -> 69;
               case 203 -> 12;
               case 204 -> 166;
               case 205 -> 72;
               case 206 -> 73;
               case 207 -> 151;
               case 208 -> 120;
               case 209 -> 217;
               case 210 -> 254;
               case 211 -> 3;
               case 212 -> 192;
               case 213 -> 244;
               case 214 -> 203;
               case 215 -> 201;
               case 216 -> 110;
               case 217 -> 221;
               case 218 -> 196;
               case 219 -> 141;
               case 220 -> 112;
               case 221 -> 226;
               case 222 -> 20;
               case 223 -> 233;
               case 224 -> 35;
               case 225 -> 16;
               case 226 -> 98;
               case 227 -> 246;
               case 228 -> 95;
               case 229 -> 96;
               case 230 -> 39;
               case 231 -> 91;
               case 232 -> 78;
               case 233 -> 21;
               case 234 -> 215;
               case 235 -> 103;
               case 236 -> 88;
               case 237 -> 130;
               case 238 -> 32;
               case 239 -> 116;
               case 240 -> 152;
               case 241 -> 153;
               case 242 -> 17;
               case 243 -> 121;
               case 244 -> 137;
               case 245 -> 194;
               case 246 -> 102;
               case 247 -> 36;
               case 248 -> 185;
               case 249 -> 235;
               case 250 -> 189;
               case 251 -> 178;
               case 252 -> 4;
               case 253 -> 31;
               case 254 -> 240;
               default -> 46;
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
       public static me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll a(me.octo.client.IllIlIlIIlIIllIlIIIIIIlllIIIIlIlllllllIllllIIIlIIlIIllllIlIlIlIlllllllIIlllIIIlIlIlII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var0, int var1, int var2, boolean var3, int var4, java.lang.Object var5) {
           return var0.a(var1, var2, var3);
       }
   }

}
