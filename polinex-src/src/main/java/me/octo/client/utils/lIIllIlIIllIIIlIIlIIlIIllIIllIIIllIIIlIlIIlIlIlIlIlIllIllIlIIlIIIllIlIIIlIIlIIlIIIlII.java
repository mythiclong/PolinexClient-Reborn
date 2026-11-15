package me.octo.client.utils;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonBuilder;
import me.octo.client.IIlIIIllllIIlIlIlIllIIlIIlIllIllllIIllIlIIIllllIIllIlIIllllIlllIIIlllIIIIIIIIIIIlIIll;
import me.octo.client.IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII;
import me.octo.client.llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.commission.PolinexRoyalPigeonRecovery;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.skeleton.Skeleton;
import net.minecraft.world.entity.monster.spider.Spider;
import net.minecraft.world.entity.monster.zombie.Zombie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import java.util.Collection;
import java.io.File;
import kotlin.io.FilesKt;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.world.item.ItemStack;
import kotlinx.serialization.json.JsonKt;
import java.lang.invoke.LambdaMetafactory;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;

public final class lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX ovld

   public static <T> T b(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   public static <T> T c(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

   @NotNull
   public static lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Regex IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static Regex lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static Regex IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static Regex llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static double lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static double lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static double llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static Function0<Double> IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @Nullable
   private static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static boolean llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static boolean lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static int llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static long IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private static long llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private static long lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static long IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static long IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @Nullable
   private static me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   @Nullable
   private static me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @Nullable
   private static me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   @Nullable
   private static me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   @Nullable
   private static me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   @Nullable
   private static me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   @Nullable
   private static me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   @Nullable
   private static me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   @NotNull
   private static Set<String> lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @NotNull
   private static Set<String> lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @NotNull
   private static Set<String> IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @NotNull
   private static Set<KClass<? extends Object>> llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   @NotNull
   private static List<String> llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private static String[] c;
   private static String[] d;

   private lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII() {
   }

   @Nullable
   public final llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll g() {
      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   public final void a(
      @Nullable llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var1;
   }

   public final boolean h() {
      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   public static final void a(boolean var1) {
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var1;
   }

   public final boolean i() {
      return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   }

   public final void b(boolean var1) {
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var1;
   }

   public final boolean j() {
      return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   }

   public final void c(boolean var1) {
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var1;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI k() {
      return IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   }

   public static final void a(@NotNull lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var1) {
      short var10001 = 31573;
      short var10002 = 362;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var1;
   }

   public final boolean l() {
      return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   }

   public final void d(boolean var1) {
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var1;
   }

   public final boolean m() {
      java.lang.Object var0 = llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl == null ? null : llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.f();
      return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl && var0 == (java.lang.Object) IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI n() {
      return IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll o() {
      return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   }

   public final void a(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p() {
      return lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   }

   public final void b(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll q() {
      return IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   }

   public final void c(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll r() {
      return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   }

   public final void d(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll s() {
      return IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   }

   public final void e(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll t() {
      if (IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII != null) {
         return IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
      } else {
         PolinexRoyalPigeonRecovery.ensureRoyalPigeonHotbar();
         this.D();
         return IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
      }
   }

   public final void f(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll u() {
      return IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   }

   public final void g(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll v() {
      return lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   }

   public final void h(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = var1;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c ()[I
      // 003: aload 1
      // 004: sipush 31607
      // 007: sipush 29018
      // 00a: pop2
      // 00b: ldc "event"
      // 00d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 010: astore 2
      // 011: aload 0
      // 012: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a ()Lnet/minecraft/client/Minecraft;
      // 015: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 018: astore 3
      // 019: aload 0
      // 01a: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a ()Lnet/minecraft/client/Minecraft;
      // 01d: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 020: astore 4
      // 022: aload 3
      // 023: ifnull 032
      // 026: aload 4
      // 028: ifnonnull 037
      // 02b: goto 032
      // 02e: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: return
      // 033: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 03a: sipush 1000
      // 03d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 040: checkcast java/lang/Number
      // 043: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 046: aload 2
      // 047: ifnull 25c
      // 04a: ifeq 24d
      // 04d: goto 054
      // 050: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 057: sipush 1500
      // 05a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05d: checkcast java/lang/Number
      // 060: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 063: ifeq 1a9
      // 066: goto 06d
      // 069: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: nop
      // 06e: nop
      // 06f: getstatic me/octo/client/utils/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
      // 072: invokevirtual me/octo/client/utils/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.g ()Ljava/util/concurrent/ConcurrentHashMap;
      // 075: invokevirtual java/util/concurrent/ConcurrentHashMap.values ()Ljava/util/Collection;
      // 078: dup
      // 079: sipush 31508
      // 07c: sipush -463
      // 07f: pop2
      // 080: ldc "<get-values>(...)"
      // 082: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 085: checkcast java/lang/Iterable
      // 088: astore 7
      // 08a: aload 7
      // 08c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 091: astore 8
      // 093: aload 8
      // 095: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09a: ifeq 112
      // 09d: aload 8
      // 09f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a4: astore 9
      // 0a6: aload 9
      // 0a8: checkcast java/lang/String
      // 0ab: astore 10
      // 0ad: bipush 0
      // 0ae: istore 11
      // 0b0: aload 10
      // 0b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0b5: aload 10
      // 0b7: checkcast java/lang/CharSequence
      // 0ba: sipush 31503
      // 0bd: sipush -23810
      // 0c0: pop2
      // 0c1: ldc_w "§6Bal"
      // 0c4: checkcast java/lang/CharSequence
      // 0c7: bipush 0
      // 0c8: bipush 2
      // 0c9: aconst_null
      // 0ca: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 0cd: aload 2
      // 0ce: ifnull 0f3
      // 0d1: ifeq 105
      // 0d4: aload 10
      // 0d6: checkcast java/lang/CharSequence
      // 0d9: sipush 31584
      // 0dc: sipush 14463
      // 0df: pop2
      // 0e0: ldc_w "Lvl"
      // 0e3: checkcast java/lang/CharSequence
      // 0e6: bipush 0
      // 0e7: bipush 2
      // 0e8: aconst_null
      // 0e9: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 0ec: goto 0f3
      // 0ef: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: aload 2
      // 0f4: ifnull 102
      // 0f7: ifeq 105
      // 0fa: goto 101
      // 0fd: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: bipush 1
      // 102: goto 106
      // 105: bipush 0
      // 106: ifeq 093
      // 109: aload 9
      // 10b: aload 2
      // 10c: ifnull 0a8
      // 10f: goto 113
      // 112: aconst_null
      // 113: checkcast java/lang/String
      // 116: astore 5
      // 118: aload 5
      // 11a: aload 2
      // 11b: ifnull 12a
      // 11e: ifnull 199
      // 121: goto 128
      // 124: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: aload 5
      // 12a: astore 8
      // 12c: bipush 0
      // 12d: istore 9
      // 12f: aload 2
      // 130: ifnull 186
      // 133: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lkotlin/text/Regex;
      // 136: aload 8
      // 138: checkcast java/lang/CharSequence
      // 13b: bipush 0
      // 13c: bipush 2
      // 13d: aconst_null
      // 13e: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // 141: dup
      // 142: ifnull 185
      // 145: goto 14c
      // 148: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 151: aload 2
      // 152: ifnull 174
      // 155: goto 15c
      // 158: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: dup
      // 15d: ifnull 185
      // 160: goto 167
      // 163: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: bipush 1
      // 168: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 16d: goto 174
      // 170: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: checkcast java/lang/String
      // 177: dup
      // 178: ifnull 185
      // 17b: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 17e: goto 187
      // 181: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 184: athrow
      // 185: pop
      // 186: bipush 0
      // 187: nop
      // 188: nop
      // 189: istore 10
      // 18b: bipush 0
      // 18c: istore 11
      // 18e: iload 10
      // 190: i2d
      // 191: ldc2_w 0.001
      // 194: dmul
      // 195: nop
      // 196: goto 19a
      // 199: dconst_0
      // 19a: dstore 5
      // 19c: goto 1a4
      // 19f: astore 7
      // 1a1: dconst_0
      // 1a2: dstore 5
      // 1a4: dload 5
      // 1a6: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI D
      // 1a9: nop
      // 1aa: nop
      // 1ab: getstatic me/octo/client/utils/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
      // 1ae: invokevirtual me/octo/client/utils/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.g ()Ljava/util/concurrent/ConcurrentHashMap;
      // 1b1: invokevirtual java/util/concurrent/ConcurrentHashMap.values ()Ljava/util/Collection;
      // 1b4: dup
      // 1b5: sipush 31513
      // 1b8: sipush -1803
      // 1bb: pop2
      // 1bc: ldc "<get-values>(...)"
      // 1be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1c1: checkcast java/lang/Iterable
      // 1c4: astore 5
      // 1c6: bipush 0
      // 1c7: istore 6
      // 1c9: aload 5
      // 1cb: checkcast java/util/Collection
      // 1ce: aload 2
      // 1cf: ifnull 1eb
      // 1d2: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 1d7: ifeq 1e9
      // 1da: goto 1e1
      // 1dd: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e0: athrow
      // 1e1: bipush 0
      // 1e2: goto 238
      // 1e5: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e8: athrow
      // 1e9: aload 5
      // 1eb: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1f0: astore 7
      // 1f2: aload 7
      // 1f4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f9: ifeq 237
      // 1fc: aload 7
      // 1fe: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 203: astore 8
      // 205: aload 8
      // 207: checkcast java/lang/String
      // 20a: astore 9
      // 20c: bipush 0
      // 20d: istore 10
      // 20f: aload 9
      // 211: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 214: aload 9
      // 216: checkcast java/lang/CharSequence
      // 219: sipush 31598
      // 21c: sipush -11951
      // 21f: pop2
      // 220: ldc_w "] Snail"
      // 223: checkcast java/lang/CharSequence
      // 226: bipush 0
      // 227: bipush 2
      // 228: aconst_null
      // 229: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 22c: ifeq 1f2
      // 22f: bipush 1
      // 230: aload 2
      // 231: ifnull 22c
      // 234: goto 238
      // 237: bipush 0
      // 238: istore 5
      // 23a: goto 242
      // 23d: astore 6
      // 23f: bipush 0
      // 240: istore 5
      // 242: iload 5
      // 244: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Z
      // 247: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 24a: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.f ()V
      // 24d: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 250: sipush 1500
      // 253: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 256: checkcast java/lang/Number
      // 259: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 25c: ifne 2b3
      // 25f: aload 0
      // 260: invokespecial me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.z ()D
      // 263: dstore 5
      // 265: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI D
      // 268: aload 2
      // 269: ifnull 284
      // 26c: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll D
      // 26f: dcmpl
      // 270: ifle 287
      // 273: goto 27a
      // 276: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 279: athrow
      // 27a: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI D
      // 27d: goto 284
      // 280: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 283: athrow
      // 284: goto 28a
      // 287: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll D
      // 28a: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll D
      // 28d: dload 5
      // 28f: aload 2
      // 290: ifnull 2aa
      // 293: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl D
      // 296: dcmpl
      // 297: ifle 2ad
      // 29a: goto 2a1
      // 29d: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a0: athrow
      // 2a1: dload 5
      // 2a3: goto 2aa
      // 2a6: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a9: athrow
      // 2aa: goto 2b0
      // 2ad: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl D
      // 2b0: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl D
      // 2b3: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 2b6: dup
      // 2b7: ifnonnull 2c0
      // 2ba: pop
      // 2bb: return
      // 2bc: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2bf: athrow
      // 2c0: astore 5
      // 2c2: aload 5
      // 2c4: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 2c7: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 2ca: if_acmpne 2d2
      // 2cd: return
      // 2ce: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d1: athrow
      // 2d2: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Z
      // 2d5: aload 2
      // 2d6: ifnull 315
      // 2d9: ifeq 312
      // 2dc: goto 2e3
      // 2df: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e2: athrow
      // 2e3: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 2e6: ldc2_w 3000
      // 2e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ec: checkcast java/lang/Number
      // 2ef: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 2f2: aload 2
      // 2f3: ifnull 315
      // 2f6: goto 2fd
      // 2f9: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fc: athrow
      // 2fd: ifeq 312
      // 300: goto 307
      // 303: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 306: athrow
      // 307: bipush 0
      // 308: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Z
      // 30b: goto 312
      // 30e: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 311: athrow
      // 312: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI Z
      // 315: aload 2
      // 316: ifnull 361
      // 319: ifne 35e
      // 31c: goto 323
      // 31f: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 322: athrow
      // 323: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 326: aload 2
      // 327: ifnull 361
      // 32a: goto 331
      // 32d: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 330: athrow
      // 331: ifne 35e
      // 334: goto 33b
      // 337: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33a: athrow
      // 33b: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 33e: aload 0
      // 33f: invokespecial me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.C ()I
      // 342: i2l
      // 343: ldc2_w 1000
      // 346: lmul
      // 347: ldc2_w 5000
      // 34a: ladd
      // 34b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34e: checkcast java/lang/Number
      // 351: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 354: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll Z
      // 357: goto 35e
      // 35a: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35d: athrow
      // 35e: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Z
      // 361: aload 2
      // 362: ifnull 38f
      // 365: ifeq 3a1
      // 368: goto 36f
      // 36b: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36e: athrow
      // 36f: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll Lme/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
      // 372: aload 0
      // 373: invokespecial me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.B ()I
      // 376: i2l
      // 377: ldc2_w 1000
      // 37a: lmul
      // 37b: ldc2_w 10000
      // 37e: ladd
      // 37f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 382: checkcast java/lang/Number
      // 385: invokevirtual me/octo/client/utils/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI.a (Ljava/lang/Number;)Z
      // 388: goto 38f
      // 38b: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38e: athrow
      // 38f: aload 2
      // 390: ifnull 39e
      // 393: ifeq 3a1
      // 396: goto 39d
      // 399: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39c: athrow
      // 39d: bipush 0
      // 39e: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Z
      // 3a1: return
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      int[] var2 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      net.minecraft.network.protocol.Packet var3 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var3 instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket) {
         if (((net.minecraft.network.protocol.game.ClientboundSystemChatPacket) var3).overlay()) {
            return;
         }
         String var4 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(((net.minecraft.network.protocol.game.ClientboundSystemChatPacket) var3).content().getString()).trim().toString();
         String var5 = ((net.minecraft.network.protocol.game.ClientboundSystemChatPacket) var3).content().getString();
         if (var4.startsWith("Autopet")) {
            java.lang.CharSequence var6 = (java.lang.CharSequence) var5;
            if (new kotlin.text.Regex("§6Bal").containsMatchIn(var6)
                  && !me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.a((Number) Integer.valueOf(1000))) {
               kotlin.text.MatchResult var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.find(var4, 0);
               String var7 = var9 != null ? (String) var9.getGroupValues().get(1) : null;
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var7 != null ? Double.parseDouble(var7) * 0.001D : 0.0D;
            }
         }
         this.a(var4);
      }
   }

   private final void a(String param1) {
         int[] var2 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
         if (param1.startsWith("Your Pickaxe ability is on cooldown")) {
            lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = true;
            return;
         }
         if (param1.startsWith("This ability is on cooldown for")) {
            IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = false;
            return;
         }
         if (lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI.contains(param1)) {
            IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = false;
            return;
         }
         if (lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI.contains(param1)) {
            IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = true;
            return;
         }
         if (IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.contains(param1)) {
            IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = true;
            lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = true;
            lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.f();
            IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.f();
         }
   }

   public final void w() {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0.0;
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0;
      IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.f();
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = true;
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = false;
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.f();
   }

   public final void x() {
      lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.f();
      IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.f();
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = false;
   }

   public final boolean e(boolean param1) {
      var var2 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      if (IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl) { return var2 == null; }
      if (llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI) { return false; }
      if (IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(Long.valueOf(1000L)) && var2 == null) { return true; }
      if (lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll && param1 && me.octo.client.utils.player.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g()) { return IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.a(Long.valueOf(1500L)); }
      return true;
   }

   public final void y() {
      // Decoy `sipush N; sipush M; pop2` (offsets 164/167/170) and every `a(Exception); athrow` rethrow shim dropped.
      // `me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c()` returns a REAL int[5] (built in that class's static initializer), so `var1 == null` is a constant-false
      // opaque predicate: the leading guard is kept for parity with sibling method z(), the later `aload_1` guards are dead.
      int[] var1 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      if (var1 == null) {
         return;
      }
      var var2 = this.a().player;
      if (var2 == null) {
         return;
      }
      llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = 1;
      if (IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl != null && lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI != null && !kotlin.jvm.internal.Intrinsics.areEqual(IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.b(), lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI.b())) {
         ++llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
      }
      java.io.File var3 = new java.io.File(me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(), var2.getStringUUID() + ".json");
      if (!var3.exists()) {
         return;
      }
      try {
         var var4 = kotlinx.serialization.json.JsonKt.Json(null, me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::a);
         var var5 = kotlin.io.FilesKt.readText(var3, (java.nio.charset.Charset)null);
         var var6 = (me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid)var4.decodeFromString((kotlinx.serialization.DeserializationStrategy)me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var5);
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var6.a(), var6.b(), var6.c(), var6.d(), var6.e(), me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var6.f()), var6.g(), var6.h(), var6.i(), var6.j(), var6.k());
      } catch (Exception var8) {
         var8.printStackTrace();
      }
      if (IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl != null && IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.h()) {
         ++llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
      }
   }

   private final double z() {
      int[] var1 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      if (var1 == null) { return 0.0; }
      ItemStack var2 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.L();
      if (var2 == null) { return 0.0; }
      String var3 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2.getHoverName().getString());
      if (!var3.contains("Drill")) { return 0.0; }
      Iterator<Component> var4 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var2).iterator();
      while (var4.hasNext()) {
         String var5 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var4.next().getString());
         if (var5.contains("Mithril-Infused Fuel Tank")) { return 0.02; }
         if (var5.contains("Titanium-Infused Fuel Tank")) { return 0.04; }
         if (var5.contains("Gemstone Fuel Tank")) { return 0.06; }
         if (var5.contains("Perfectly-Cut Fuel Tank")) { return 0.1; }
      }
      return 0.0;
   }

   public final double A() {
      // decoy `c()` padding array, `sipush N; sipush M; pop2` padding and the `a(Exception); athrow` rethrow shims dropped (COMMON decoy family).
      int[] var1 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      var var2 = me.octo.client.utils.IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d();
      if (var2 == null) {
         return 0.0;
      }
      String var3 = null;
      for (String var4 : var2) {
         if (me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var4).contains("Nearby Players")) {
            var3 = var4;
            break;
         }
      }
      if (var3 == null) {
         return 0.0;
      }
      MatchResult var5 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.find(me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var3), 0);
      if (var5 == null) {
         return 0.0;
      }
      String var6 = var5.getValue();
      if (var6 == null) {
         return 0.0;
      }
      Integer var7 = StringsKt.toIntOrNull(var6);
      int var8 = var7 != null ? var7.intValue() : 0;
      return var8 >= 1 ? 250.0 : 0.0;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c ()[I
      // 03: getstatic me/octo/client/utils/IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll;
      // 06: invokevirtual me/octo/client/utils/IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll.d ()Ljava/util/ArrayList;
      // 09: astore 3
      // 0a: astore 1
      // 0b: aload 3
      // 0c: aload 1
      // 0d: ifnull 25
      // 10: ifnull 96
      // 13: goto 1a
      // 16: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 3
      // 1b: checkcast java/lang/Iterable
      // 1e: goto 25
      // 21: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: astore 5
      // 27: nop
      // 28: bipush 0
      // 29: istore 6
      // 2b: aload 5
      // 2d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 32: astore 7
      // 34: aload 7
      // 36: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3b: ifeq 7b
      // 3e: aload 7
      // 40: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 45: astore 8
      // 47: aload 8
      // 49: checkcast java/lang/String
      // 4c: astore 9
      // 4e: bipush 0
      // 4f: istore 10
      // 51: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 54: aload 9
      // 56: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 59: checkcast java/lang/CharSequence
      // 5c: sipush 31517
      // 5f: sipush -32393
      // 62: pop2
      // 63: ldc_w "Nearby Players"
      // 66: checkcast java/lang/CharSequence
      // 69: bipush 0
      // 6a: bipush 2
      // 6b: aconst_null
      // 6c: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 6f: ifeq 34
      // 72: aload 8
      // 74: aload 1
      // 75: ifnull 49
      // 78: goto 7c
      // 7b: aconst_null
      // 7c: checkcast java/lang/String
      // 7f: astore 4
      // 81: aload 4
      // 83: aload 1
      // 84: ifnull 93
      // 87: ifnull 96
      // 8a: goto 91
      // 8d: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90: athrow
      // 91: aload 4
      // 93: goto 98
      // 96: dconst_0
      // 97: dreturn
      // 98: astore 2
      // 99: aload 1
      // 9a: ifnull e4
      // 9d: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lkotlin/text/Regex;
      // a0: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // a3: aload 2
      // a4: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // a7: checkcast java/lang/CharSequence
      // aa: bipush 0
      // ab: bipush 2
      // ac: aconst_null
      // ad: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // b0: dup
      // b1: ifnull e3
      // b4: goto bb
      // b7: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ba: athrow
      // bb: invokeinterface kotlin/text/MatchResult.getValue ()Ljava/lang/String; 1
      // c0: dup
      // c1: ifnull e3
      // c4: goto cb
      // c7: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ca: athrow
      // cb: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
      // ce: dup
      // cf: ifnull e3
      // d2: goto d9
      // d5: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d8: athrow
      // d9: invokevirtual java/lang/Integer.intValue ()I
      // dc: goto e6
      // df: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e2: athrow
      // e3: pop
      // e4: dconst_0
      // e5: dreturn
      // e6: istore 3
      // e7: iload 3
      // e8: bipush 1
      // e9: if_icmplt f6
      // ec: ldc2_w 250.0
      // ef: goto f7
      // f2: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f5: athrow
      // f6: dconst_0
      // f7: dreturn
   }

   private final int B() {
      int[] var1 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      var var2 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      if (var2 == null) {
         return 0;
      }
      if (var2.f() == PXEvMid.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
         return 0;
      }
      switch (var2.f()) {
         case IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl:
            if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl == 1) {
               return 10;
            }
            if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl == 2) {
               return 15;
            }
            return 20;
         case IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI:
            if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl == 1) {
               return 25;
            }
            if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl == 2) {
               return 30;
            }
            return 35;
         case IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll:
         case lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll:
            if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl == 1) {
               return 20;
            }
            if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl == 2) {
               return 25;
            }
            return 30;
         default:
            return 0;
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c ()[I
      // 003: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 006: astore 2
      // 007: astore 1
      // 008: aload 2
      // 009: aload 1
      // 00a: ifnull 018
      // 00d: ifnull 02c
      // 010: goto 017
      // 013: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 2
      // 018: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 01b: aload 1
      // 01c: ifnull 036
      // 01f: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 022: if_acmpne 032
      // 025: goto 02c
      // 028: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: bipush 0
      // 02d: ireturn
      // 02e: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: aload 2
      // 033: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 036: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 039: swap
      // 03a: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.ordinal ()I
      // 03d: iaload
      // 03e: aload 1
      // 03f: ifnull 067
      // 042: tableswitch 211 1 4 34 93 152 152
      // 060: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 067: bipush 1
      // 068: aload 1
      // 069: ifnull 08e
      // 06c: if_icmpne 07f
      // 06f: goto 076
      // 072: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: bipush 10
      // 078: goto 116
      // 07b: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 082: aload 1
      // 083: ifnull 09c
      // 086: bipush 2
      // 087: goto 08e
      // 08a: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: if_icmpne 09a
      // 091: bipush 15
      // 093: goto 116
      // 096: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: bipush 20
      // 09c: goto 116
      // 09f: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0a2: bipush 1
      // 0a3: aload 1
      // 0a4: ifnull 0c9
      // 0a7: if_icmpne 0ba
      // 0aa: goto 0b1
      // 0ad: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: bipush 25
      // 0b3: goto 116
      // 0b6: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0bd: aload 1
      // 0be: ifnull 0d7
      // 0c1: bipush 2
      // 0c2: goto 0c9
      // 0c5: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: if_icmpne 0d5
      // 0cc: bipush 30
      // 0ce: goto 116
      // 0d1: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: bipush 35
      // 0d7: goto 116
      // 0da: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0dd: bipush 1
      // 0de: aload 1
      // 0df: ifnull 104
      // 0e2: if_icmpne 0f5
      // 0e5: goto 0ec
      // 0e8: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: bipush 20
      // 0ee: goto 116
      // 0f1: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 0f8: aload 1
      // 0f9: ifnull 112
      // 0fc: bipush 2
      // 0fd: goto 104
      // 100: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: if_icmpne 110
      // 107: bipush 25
      // 109: goto 116
      // 10c: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: bipush 30
      // 112: goto 116
      // 115: bipush 0
      // 116: ireturn
   }
   private final int C() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 14[SWITCH]
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

   public final double a(@NotNull BlockPos param1, double param2, boolean param4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [44[TRYBLOCK]], but top level block is 59[SWITCH]
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

   public final int a(@NotNull BlockPos param1, int param2) {
      // decoy `aload_3; ifnull/ifnonnull` folds and the `a(Exception)` rethrow shims dropped (COMMON decoy family).
      int[] var3 = me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      var var4 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      if (var3 == null) {
         return 0;
      }
      var var10000 = this.a().level;
      var var5 = var10000 == null ? null : var10000.getBlockState(param1);
      if (var4 == null || var5 == null) {
         return 0;
      }
      int var6 = 0;
      if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.o(var5)) {
         var6 = 600;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i(var5)) {
         var6 = 800;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.h(var5)) {
         var6 = 1500;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j(var5)) {
         var6 = 500;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.k(var5)) {
         var6 = 2300;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.q(var5) || me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.r(var5)) {
         var6 = 3800;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.s(var5) || me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.t(var5) || me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.u(var5) || me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.v(var5)) {
         var6 = 3000;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.w(var5)) {
         var6 = 4800;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.x(var5) || me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y(var5) || me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.z(var5) || me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.A(var5)) {
         var6 = 5200;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.B(var5)) {
         var6 = 2300;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.n(var5)) {
         var6 = 6000;
      } else if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.l(var5) || me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.m(var5)) {
         var6 = 5600;
      }
      double var7 = var4.b();
      var7 += this.A();
      if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.D(var5)) {
         var7 = var7 + var4.c() + llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI + ((Number)IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.invoke()).doubleValue();
      }
      if (me.octo.client.utils.IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.F(var5)) {
         var7 += var4.d();
      }
      var7 += (double)(me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.A() * Math.min(200, me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.j()));
      if (IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl) {
         if (var4.f() == PXEvMid.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            double var8;
            if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl == 2) {
               var8 = 3.5;
            } else if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl == 3) {
               var8 = 4.0;
            } else {
               var8 = 3.0;
            }
            var7 *= var8;
         }
      }
      double var9 = 1.0 - Math.max((double)me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() - var4.i(), 0.0) / 200.0;
      if (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() == me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
         var7 *= var9;
      }
      int var11 = Math.max(4, (int)Math.rint(30.0 * (double)var6 / var7));
      if (param2 == -1) {
         int var12;
         if (me.octo.client.llIllIIIlIlIllllllIllllIIIIIIlIlIlIllIIIIIIlIIlIIlIllIlIlIllIlIlIlIllIIIIIllIllIllllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.aA()) {
            var12 = this.m() ? me.octo.client.IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d().O() : me.octo.client.IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c().O();
         } else {
            var12 = 40;
         }
         return var11 + var12;
      }
      return me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI >= (double)me.octo.client.IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().O() ? param2 - 1 : param2;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: sipush 31495
      // 004: sipush 6121
      // 007: pop2
      // 008: ldc_w "pos"
      // 00b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00e: invokestatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c ()[I
      // 011: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 014: astore 4
      // 016: astore 3
      // 017: aload 3
      // 018: ifnull 039
      // 01b: aload 0
      // 01c: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a ()Lnet/minecraft/client/Minecraft;
      // 01f: getfield net/minecraft/client/Minecraft.level Lnet/minecraft/client/multiplayer/ClientLevel;
      // 022: dup
      // 023: ifnull 038
      // 026: goto 02d
      // 029: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: aload 1
      // 02e: invokevirtual net/minecraft/client/multiplayer/ClientLevel.getBlockState (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
      // 031: goto 03a
      // 034: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: pop
      // 039: aconst_null
      // 03a: astore 5
      // 03c: aload 4
      // 03e: ifnull 04d
      // 041: aload 5
      // 043: ifnonnull 053
      // 046: goto 04d
      // 049: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: bipush 0
      // 04e: ireturn
      // 04f: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: nop
      // 054: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 057: aload 5
      // 059: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.o (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 05c: aload 3
      // 05d: ifnull 07c
      // 060: ifeq 074
      // 063: goto 06a
      // 066: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: sipush 600
      // 06d: goto 2ad
      // 070: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 077: aload 5
      // 079: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.i (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 07c: aload 3
      // 07d: ifnull 09c
      // 080: ifeq 094
      // 083: goto 08a
      // 086: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: sipush 800
      // 08d: goto 2ad
      // 090: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 097: aload 5
      // 099: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.h (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 09c: aload 3
      // 09d: ifnull 0bc
      // 0a0: ifeq 0b4
      // 0a3: goto 0aa
      // 0a6: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: sipush 1500
      // 0ad: goto 2ad
      // 0b0: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 0b7: aload 5
      // 0b9: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.j (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 0bc: aload 3
      // 0bd: ifnull 0dc
      // 0c0: ifeq 0d4
      // 0c3: goto 0ca
      // 0c6: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: sipush 500
      // 0cd: goto 2ad
      // 0d0: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 0d7: aload 5
      // 0d9: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.k (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 0dc: aload 3
      // 0dd: ifnull 0fc
      // 0e0: ifeq 0f4
      // 0e3: goto 0ea
      // 0e6: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: sipush 2300
      // 0ed: goto 2ad
      // 0f0: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 0f7: aload 5
      // 0f9: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.q (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 0fc: aload 3
      // 0fd: ifnull 12a
      // 100: ifne 127
      // 103: goto 10a
      // 106: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 10d: aload 5
      // 10f: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.r (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 112: aload 3
      // 113: ifnull 135
      // 116: goto 11d
      // 119: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: ifeq 12d
      // 120: goto 127
      // 123: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: sipush 3800
      // 12a: goto 2ad
      // 12d: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 130: aload 5
      // 132: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.s (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 135: aload 3
      // 136: ifnull 19d
      // 139: ifne 19a
      // 13c: goto 143
      // 13f: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 146: aload 5
      // 148: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.t (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 14b: aload 3
      // 14c: ifnull 19d
      // 14f: goto 156
      // 152: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: ifne 19a
      // 159: goto 160
      // 15c: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 163: aload 5
      // 165: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.u (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 168: aload 3
      // 169: ifnull 19d
      // 16c: goto 173
      // 16f: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: ifne 19a
      // 176: goto 17d
      // 179: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 180: aload 5
      // 182: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.v (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 185: aload 3
      // 186: ifnull 1a8
      // 189: goto 190
      // 18c: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18f: athrow
      // 190: ifeq 1a0
      // 193: goto 19a
      // 196: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: sipush 3000
      // 19d: goto 2ad
      // 1a0: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 1a3: aload 5
      // 1a5: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.w (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 1a8: aload 3
      // 1a9: ifnull 1c8
      // 1ac: ifeq 1c0
      // 1af: goto 1b6
      // 1b2: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b5: athrow
      // 1b6: sipush 4800
      // 1b9: goto 2ad
      // 1bc: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 1c3: aload 5
      // 1c5: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.x (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 1c8: aload 3
      // 1c9: ifnull 230
      // 1cc: ifne 22d
      // 1cf: goto 1d6
      // 1d2: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d5: athrow
      // 1d6: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 1d9: aload 5
      // 1db: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.y (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 1de: aload 3
      // 1df: ifnull 230
      // 1e2: goto 1e9
      // 1e5: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e8: athrow
      // 1e9: ifne 22d
      // 1ec: goto 1f3
      // 1ef: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f2: athrow
      // 1f3: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 1f6: aload 5
      // 1f8: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.z (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 1fb: aload 3
      // 1fc: ifnull 230
      // 1ff: goto 206
      // 202: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 205: athrow
      // 206: ifne 22d
      // 209: goto 210
      // 20c: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20f: athrow
      // 210: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 213: aload 5
      // 215: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.A (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 218: aload 3
      // 219: ifnull 23b
      // 21c: goto 223
      // 21f: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 222: athrow
      // 223: ifeq 233
      // 226: goto 22d
      // 229: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22c: athrow
      // 22d: sipush 5200
      // 230: goto 2ad
      // 233: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 236: aload 5
      // 238: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.B (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 23b: aload 3
      // 23c: ifnull 25b
      // 23f: ifeq 253
      // 242: goto 249
      // 245: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 248: athrow
      // 249: sipush 2300
      // 24c: goto 2ad
      // 24f: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 256: aload 5
      // 258: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.n (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 25b: aload 3
      // 25c: ifnull 27b
      // 25f: ifeq 273
      // 262: goto 269
      // 265: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 268: athrow
      // 269: sipush 6000
      // 26c: goto 2ad
      // 26f: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 272: athrow
      // 273: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 276: aload 5
      // 278: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.l (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 27b: aload 3
      // 27c: ifnull 2a9
      // 27f: ifne 2a6
      // 282: goto 289
      // 285: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 288: athrow
      // 289: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 28c: aload 5
      // 28e: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.m (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 291: aload 3
      // 292: ifnull 2a9
      // 295: goto 29c
      // 298: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29b: athrow
      // 29c: ifeq 2ac
      // 29f: goto 2a6
      // 2a2: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: sipush 5600
      // 2a9: goto 2ad
      // 2ac: bipush 0
      // 2ad: istore 6
      // 2af: aload 4
      // 2b1: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()D
      // 2b4: dstore 7
      // 2b6: dload 7
      // 2b8: aload 0
      // 2b9: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.A ()D
      // 2bc: dadd
      // 2bd: dstore 7
      // 2bf: nop
      // 2c0: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 2c3: aload 5
      // 2c5: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.D (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 2c8: aload 3
      // 2c9: ifnull 306
      // 2cc: ifeq 2f7
      // 2cf: goto 2d6
      // 2d2: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d5: athrow
      // 2d6: dload 7
      // 2d8: aload 4
      // 2da: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()D
      // 2dd: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI D
      // 2e0: dadd
      // 2e1: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lkotlin/jvm/functions/Function0;
      // 2e4: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 2e9: checkcast java/lang/Number
      // 2ec: invokevirtual java/lang/Number.doubleValue ()D
      // 2ef: dadd
      // 2f0: dadd
      // 2f1: dstore 7
      // 2f3: aload 3
      // 2f4: ifnonnull 31e
      // 2f7: getstatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl;
      // 2fa: aload 5
      // 2fc: invokevirtual me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.F (Lnet/minecraft/world/level/block/state/BlockState;)Z
      // 2ff: goto 306
      // 302: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 305: athrow
      // 306: aload 3
      // 307: ifnull 33e
      // 30a: ifeq 31e
      // 30d: goto 314
      // 310: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 313: athrow
      // 314: dload 7
      // 316: aload 4
      // 318: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d ()D
      // 31b: dadd
      // 31c: dstore 7
      // 31e: dload 7
      // 320: getstatic me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
      // 323: invokevirtual me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.A ()I
      // 326: sipush 200
      // 329: getstatic me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
      // 32c: invokevirtual me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.j ()I
      // 32f: invokestatic java/lang/Math.min (II)I
      // 332: imul
      // 333: i2d
      // 334: dadd
      // 335: aload 3
      // 336: ifnull 3a1
      // 339: dstore 7
      // 33b: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Z
      // 33e: ifeq 38a
      // 341: aload 4
      // 343: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 346: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 349: if_acmpne 38a
      // 34c: goto 353
      // 34f: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 352: athrow
      // 353: dload 7
      // 355: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl I
      // 358: tableswitch 44 2 3 28 38
      // 370: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 373: athrow
      // 374: ldc2_w 3.5
      // 377: goto 387
      // 37a: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37d: athrow
      // 37e: ldc2_w 4.0
      // 381: goto 387
      // 384: ldc2_w 3.0
      // 387: dmul
      // 388: dstore 7
      // 38a: dconst_1
      // 38b: getstatic me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI;
      // 38e: invokevirtual me/octo/client/utils/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.g ()I
      // 391: i2d
      // 392: aload 4
      // 394: invokevirtual me/octo/client/utils/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.i ()D
      // 397: dsub
      // 398: dconst_0
      // 399: invokestatic java/lang/Math.max (DD)D
      // 39c: ldc2_w 200.0
      // 39f: ddiv
      // 3a0: dsub
      // 3a1: dstore 9
      // 3a3: getstatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
      // 3a6: invokevirtual me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.g ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 3a9: getstatic me/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 3ac: if_acmpne 3b6
      // 3af: dload 7
      // 3b1: dload 9
      // 3b3: dmul
      // 3b4: dstore 7
      // 3b6: bipush 4
      // 3b7: ldc2_w 30.0
      // 3ba: iload 6
      // 3bc: i2d
      // 3bd: dmul
      // 3be: dload 7
      // 3c0: ddiv
      // 3c1: invokestatic java/lang/Math.rint (D)D
      // 3c4: d2i
      // 3c5: invokestatic java/lang/Math.max (II)I
      // 3c8: istore 11
      // 3ca: iload 2
      // 3cb: aload 3
      // 3cc: ifnull 444
      // 3cf: bipush -1
      // 3d0: if_icmpne 436
      // 3d3: goto 3da
      // 3d6: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d9: athrow
      // 3da: getstatic me/octo/client/llIllIIIlIlIllllllIllllIIIIIIlIlIlIllIIIIIIlIIlIIlIllIlIlIllIlIlIlIllIIIIIllIllIllllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Lme/octo/client/llIllIIIlIlIllllllIllllIIIIIIlIlIlIllIIIIIIlIIlIIlIllIlIlIllIlIlIlIllIIIIIllIllIllllI;
      // 3dd: invokevirtual me/octo/client/llIllIIIlIlIllllllIllllIIIIIIlIlIlIllIIIIIIlIIlIIlIllIlIlIllIlIlIlIllIIIIIllIllIllllI.aA ()Z
      // 3e0: aload 3
      // 3e1: ifnull 402
      // 3e4: goto 3eb
      // 3e7: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ea: athrow
      // 3eb: ifne 3fe
      // 3ee: goto 3f5
      // 3f1: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f4: athrow
      // 3f5: bipush 40
      // 3f7: goto 42c
      // 3fa: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fd: athrow
      // 3fe: aload 0
      // 3ff: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.m ()Z
      // 402: aload 3
      // 403: ifnull 420
      // 406: ifeq 423
      // 409: goto 410
      // 40c: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40f: athrow
      // 410: getstatic me/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI;
      // 413: invokevirtual me/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.d ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 416: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.O ()I
      // 419: goto 420
      // 41c: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41f: athrow
      // 420: goto 42c
      // 423: getstatic me/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI;
      // 426: invokevirtual me/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.c ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 429: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.O ()I
      // 42c: istore 12
      // 42e: iload 11
      // 430: iload 12
      // 432: iadd
      // 433: goto 45d
      // 436: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI D
      // 439: getstatic me/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI;
      // 43c: invokevirtual me/octo/client/IIlllIIIIIlIlIlllIlIIIIIllIlIlIlIlIlIIIIllIlIIIIIIlIllllIlIIlIlllllIIllIIllIlIllIlllI.b ()Lme/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl;
      // 43f: invokevirtual me/octo/client/IllIIlIllIIIllIlllllIIlIIIllllIlIllllllIIIllIllIIIIIIIIIIllIIIllIllIlIIllIIlIllIIIIIl.O ()I
      // 442: i2d
      // 443: dcmpg
      // 444: aload 3
      // 445: ifnull 45b
      // 448: ifge 45a
      // 44b: goto 452
      // 44e: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 451: athrow
      // 452: iload 2
      // 453: goto 45d
      // 456: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 459: athrow
      // 45a: iload 2
      // 45b: bipush 1
      // 45c: isub
      // 45d: ireturn
   }

   public final void D() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: sipush 31488
      // 003: sipush -21637
      // 006: pop2
      // 007: ldc_w "Jungle Pickaxe"
      // 00a: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
      // 00d: astore 2
      // 00e: bipush 5
      // 00f: anewarray 277
      // 012: astore 4
      // 014: aload 4
      // 016: bipush 0
      // 017: sipush 31564
      // 01a: sipush -23733
      // 01d: pop2
      // 01e: ldc_w "Pickonimbus"
      // 021: aastore
      // 022: aload 4
      // 024: bipush 1
      // 025: sipush 31575
      // 028: sipush -29034
      // 02b: pop2
      // 02c: ldc_w "Drill"
      // 02f: aastore
      // 030: aload 4
      // 032: bipush 2
      // 033: sipush 31559
      // 036: sipush 14656
      // 039: pop2
      // 03a: ldc_w "Gauntlet"
      // 03d: aastore
      // 03e: aload 4
      // 040: bipush 3
      // 041: sipush 31596
      // 044: sipush -2246
      // 047: pop2
      // 048: ldc_w "Titanium Pickaxe"
      // 04b: aastore
      // 04c: aload 4
      // 04e: bipush 4
      // 04f: sipush 31500
      // 052: sipush -21159
      // 055: pop2
      // 056: ldc_w "Mithril Pickaxe"
      // 059: aastore
      // 05a: aload 4
      // 05c: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 05f: astore 3
      // 060: bipush 7
      // 062: anewarray 277
      // 065: astore 5
      // 067: aload 5
      // 069: bipush 0
      // 06a: sipush 31509
      // 06d: sipush 8339
      // 070: pop2
      // 071: ldc_w "Mithril Drill SX-R226"
      // 074: aastore
      // 075: aload 5
      // 077: bipush 1
      // 078: sipush 31514
      // 07b: sipush 17712
      // 07e: pop2
      // 07f: ldc_w "Mithril Drill SX-R326"
      // 082: aastore
      // 083: aload 5
      // 085: bipush 2
      // 086: sipush 31547
      // 089: sipush 882
      // 08c: pop2
      // 08d: ldc_w "Ruby Drill TX-15"
      // 090: aastore
      // 091: invokestatic me/octo/client/utils/IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c ()[I
      // 094: aload 5
      // 096: bipush 3
      // 097: sipush 31539
      // 09a: sipush -4736
      // 09d: pop2
      // 09e: ldc_w "Gemstone Drill LT-522"
      // 0a1: aastore
      // 0a2: aload 5
      // 0a4: bipush 4
      // 0a5: sipush 31501
      // 0a8: sipush 2237
      // 0ab: pop2
      // 0ac: ldc_w "Topaz Drill KGR-12"
      // 0af: aastore
      // 0b0: aload 5
      // 0b2: bipush 5
      // 0b3: sipush 31552
      // 0b6: sipush 29759
      // 0b9: pop2
      // 0ba: ldc_w "Jasper Drill X"
      // 0bd: aastore
      // 0be: astore 1
      // 0bf: aload 5
      // 0c1: bipush 6
      // 0c3: sipush 31502
      // 0c6: sipush -11205
      // 0c9: pop2
      // 0ca: ldc_w "2000"
      // 0cd: aastore
      // 0ce: aload 5
      // 0d0: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 0d3: astore 4
      // 0d5: bipush 3
      // 0d6: anewarray 277
      // 0d9: astore 6
      // 0db: aload 6
      // 0dd: bipush 0
      // 0de: sipush 31496
      // 0e1: sipush -2367
      // 0e4: pop2
      // 0e5: ldc_w "Pickonimbus"
      // 0e8: aastore
      // 0e9: aload 6
      // 0eb: bipush 1
      // 0ec: sipush 31540
      // 0ef: sipush -27552
      // 0f2: pop2
      // 0f3: ldc_w "Drill"
      // 0f6: aastore
      // 0f7: aload 6
      // 0f9: bipush 2
      // 0fa: sipush 31492
      // 0fd: sipush 12963
      // 100: pop2
      // 101: ldc_w "Gauntlet"
      // 104: aastore
      // 105: aload 6
      // 107: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 10a: astore 5
      // 10c: aconst_null
      // 10d: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 110: aconst_null
      // 111: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 114: aconst_null
      // 115: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 118: aconst_null
      // 119: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 11c: aconst_null
      // 11d: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 120: aconst_null
      // 121: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 124: aconst_null
      // 125: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 128: aconst_null
      // 129: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 12c: new java/util/ArrayList
      // 12f: dup
      // 130: invokespecial java/util/ArrayList.<init> ()V
      // 133: checkcast java/util/List
      // 136: astore 6
      // 138: new java/util/ArrayList
      // 13b: dup
      // 13c: invokespecial java/util/ArrayList.<init> ()V
      // 13f: checkcast java/util/List
      // 142: astore 7
      // 144: aload 1
      // 145: ifnull 170
      // 148: aload 0
      // 149: invokevirtual me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a ()Lnet/minecraft/client/Minecraft;
      // 14c: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 14f: dup
      // 150: ifnull 168
      // 153: goto 15a
      // 156: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: invokevirtual net/minecraft/client/player/LocalPlayer.getInventory ()Lnet/minecraft/world/entity/player/Inventory;
      // 15d: dup
      // 15e: ifnonnull 171
      // 161: goto 168
      // 164: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: pop
      // 169: goto 170
      // 16c: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: return
      // 171: astore 8
      // 173: bipush 0
      // 174: istore 9
      // 176: iload 9
      // 178: bipush 9
      // 17a: if_icmpge 51f
      // 17d: aload 8
      // 17f: iload 9
      // 181: invokevirtual net/minecraft/world/entity/player/Inventory.getItem (I)Lnet/minecraft/world/item/ItemStack;
      // 184: dup
      // 185: sipush 31566
      // 188: sipush -30695
      // 18b: pop2
      // 18c: ldc_w "getItem(...)"
      // 18f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 192: astore 10
      // 194: aload 1
      // 195: ifnull 51b
      // 198: aload 10
      // 19a: invokevirtual net/minecraft/world/item/ItemStack.isEmpty ()Z
      // 19d: aload 1
      // 19e: ifnull 529
      // 1a1: goto 1a8
      // 1a4: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7: athrow
      // 1a8: ifne 518
      // 1ab: goto 1b2
      // 1ae: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b1: athrow
      // 1b2: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 1b5: aload 10
      // 1b7: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 1ba: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 1bf: dup
      // 1c0: sipush 31493
      // 1c3: sipush -14693
      // 1c6: pop2
      // 1c7: ldc_w "getString(...)"
      // 1ca: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1cd: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 1d0: astore 11
      // 1d2: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 1d5: aload 10
      // 1d7: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 1da: astore 12
      // 1dc: new me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 1df: dup
      // 1e0: aload 10
      // 1e2: iload 9
      // 1e4: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 1e7: invokespecial me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Lnet/minecraft/world/item/ItemStack;ILme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 1ea: astore 13
      // 1ec: nop
      // 1ed: aload 11
      // 1ef: sipush 31585
      // 1f2: sipush -1662
      // 1f5: pop2
      // 1f6: ldc_w "Royal Pigeon"
      // 1f9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1fc: aload 1
      // 1fd: ifnull 240
      // 200: ifeq 228
      // 203: goto 20a
      // 206: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 209: athrow
      // 20a: aload 13
      // 20c: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 20f: aload 1
      // 210: ifnonnull 3bd
      // 213: goto 21a
      // 216: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 219: athrow
      // 21a: bipush 4
      // 21b: anewarray 4
      // 21e: invokestatic me/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b ([Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;)V
      // 221: goto 228
      // 224: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 227: athrow
      // 228: aload 11
      // 22a: checkcast java/lang/CharSequence
      // 22d: sipush 31592
      // 230: sipush 14628
      // 233: pop2
      // 234: ldc_w "Abiphone"
      // 237: checkcast java/lang/CharSequence
      // 23a: bipush 0
      // 23b: bipush 2
      // 23c: aconst_null
      // 23d: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 240: ifeq 253
      // 243: aload 13
      // 245: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 248: aload 1
      // 249: ifnonnull 3bd
      // 24c: goto 253
      // 24f: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: aload 2
      // 254: checkcast java/lang/Iterable
      // 257: astore 14
      // 259: bipush 0
      // 25a: istore 15
      // 25c: aload 14
      // 25e: aload 1
      // 25f: ifnull 298
      // 262: instanceof java/util/Collection
      // 265: ifeq 296
      // 268: goto 26f
      // 26b: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26e: athrow
      // 26f: aload 14
      // 271: checkcast java/util/Collection
      // 274: aload 1
      // 275: ifnull 298
      // 278: goto 27f
      // 27b: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27e: athrow
      // 27f: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 284: ifeq 296
      // 287: goto 28e
      // 28a: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28d: athrow
      // 28e: bipush 0
      // 28f: goto 2d8
      // 292: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 295: athrow
      // 296: aload 14
      // 298: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 29d: astore 16
      // 29f: aload 16
      // 2a1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a6: ifeq 2d7
      // 2a9: aload 16
      // 2ab: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b0: astore 17
      // 2b2: aload 17
      // 2b4: checkcast java/lang/String
      // 2b7: astore 18
      // 2b9: bipush 0
      // 2ba: istore 19
      // 2bc: aload 11
      // 2be: checkcast java/lang/CharSequence
      // 2c1: aload 18
      // 2c3: checkcast java/lang/CharSequence
      // 2c6: bipush 0
      // 2c7: bipush 2
      // 2c8: aconst_null
      // 2c9: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 2cc: ifeq 29f
      // 2cf: bipush 1
      // 2d0: aload 1
      // 2d1: ifnull 2cc
      // 2d4: goto 2d8
      // 2d7: bipush 0
      // 2d8: ifeq 2eb
      // 2db: aload 13
      // 2dd: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 2e0: aload 1
      // 2e1: ifnonnull 3bd
      // 2e4: goto 2eb
      // 2e7: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ea: athrow
      // 2eb: aload 4
      // 2ed: checkcast java/lang/Iterable
      // 2f0: astore 14
      // 2f2: bipush 0
      // 2f3: istore 15
      // 2f5: aload 14
      // 2f7: aload 1
      // 2f8: ifnull 331
      // 2fb: instanceof java/util/Collection
      // 2fe: ifeq 32f
      // 301: goto 308
      // 304: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 307: athrow
      // 308: aload 14
      // 30a: checkcast java/util/Collection
      // 30d: aload 1
      // 30e: ifnull 331
      // 311: goto 318
      // 314: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 317: athrow
      // 318: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 31d: ifeq 32f
      // 320: goto 327
      // 323: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 326: athrow
      // 327: bipush 0
      // 328: goto 371
      // 32b: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32e: athrow
      // 32f: aload 14
      // 331: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 336: astore 16
      // 338: aload 16
      // 33a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 33f: ifeq 370
      // 342: aload 16
      // 344: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 349: astore 17
      // 34b: aload 17
      // 34d: checkcast java/lang/String
      // 350: astore 18
      // 352: bipush 0
      // 353: istore 19
      // 355: aload 11
      // 357: checkcast java/lang/CharSequence
      // 35a: aload 18
      // 35c: checkcast java/lang/CharSequence
      // 35f: bipush 0
      // 360: bipush 2
      // 361: aconst_null
      // 362: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 365: ifeq 338
      // 368: bipush 1
      // 369: aload 1
      // 36a: ifnull 365
      // 36d: goto 371
      // 370: bipush 0
      // 371: ifeq 384
      // 374: aload 13
      // 376: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 379: aload 1
      // 37a: ifnonnull 3bd
      // 37d: goto 384
      // 380: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 383: athrow
      // 384: aload 11
      // 386: checkcast java/lang/CharSequence
      // 389: sipush 31597
      // 38c: sipush -28788
      // 38f: pop2
      // 390: ldc_w "Chisel"
      // 393: checkcast java/lang/CharSequence
      // 396: bipush 0
      // 397: bipush 2
      // 398: aconst_null
      // 399: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 39c: aload 1
      // 39d: ifnull 3d6
      // 3a0: goto 3a7
      // 3a3: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a6: athrow
      // 3a7: ifeq 3bd
      // 3aa: goto 3b1
      // 3ad: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b0: athrow
      // 3b1: aload 13
      // 3b3: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 3b6: goto 3bd
      // 3b9: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bc: athrow
      // 3bd: aload 3
      // 3be: checkcast java/lang/Iterable
      // 3c1: astore 14
      // 3c3: bipush 0
      // 3c4: istore 15
      // 3c6: aload 14
      // 3c8: aload 1
      // 3c9: ifnull 402
      // 3cc: instanceof java/util/Collection
      // 3cf: goto 3d6
      // 3d2: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d5: athrow
      // 3d6: ifeq 400
      // 3d9: aload 14
      // 3db: checkcast java/util/Collection
      // 3de: aload 1
      // 3df: ifnull 402
      // 3e2: goto 3e9
      // 3e5: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e8: athrow
      // 3e9: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 3ee: ifeq 400
      // 3f1: goto 3f8
      // 3f4: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f7: athrow
      // 3f8: bipush 0
      // 3f9: goto 442
      // 3fc: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ff: athrow
      // 400: aload 14
      // 402: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 407: astore 16
      // 409: aload 16
      // 40b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 410: ifeq 441
      // 413: aload 16
      // 415: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 41a: astore 17
      // 41c: aload 17
      // 41e: checkcast java/lang/String
      // 421: astore 18
      // 423: bipush 0
      // 424: istore 19
      // 426: aload 11
      // 428: checkcast java/lang/CharSequence
      // 42b: aload 18
      // 42d: checkcast java/lang/CharSequence
      // 430: bipush 0
      // 431: bipush 2
      // 432: aconst_null
      // 433: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 436: ifeq 409
      // 439: bipush 1
      // 43a: aload 1
      // 43b: ifnull 436
      // 43e: goto 442
      // 441: bipush 0
      // 442: ifeq 518
      // 445: aload 12
      // 447: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.b (Ljava/util/List;)I
      // 44a: istore 14
      // 44c: aload 12
      // 44e: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/util/List;)Z
      // 451: istore 15
      // 453: aload 6
      // 455: aload 1
      // 456: ifnull 488
      // 459: new kotlin/Pair
      // 45c: dup
      // 45d: aload 13
      // 45f: iload 14
      // 461: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 464: invokespecial kotlin/Pair.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 467: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 46c: pop
      // 46d: iload 15
      // 46f: ifeq 483
      // 472: goto 479
      // 475: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 478: athrow
      // 479: aload 7
      // 47b: aload 13
      // 47d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 482: pop
      // 483: aload 5
      // 485: checkcast java/lang/Iterable
      // 488: astore 16
      // 48a: bipush 0
      // 48b: istore 17
      // 48d: aload 16
      // 48f: aload 1
      // 490: ifnull 4c9
      // 493: instanceof java/util/Collection
      // 496: ifeq 4c7
      // 499: goto 4a0
      // 49c: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49f: athrow
      // 4a0: aload 16
      // 4a2: checkcast java/util/Collection
      // 4a5: aload 1
      // 4a6: ifnull 4c9
      // 4a9: goto 4b0
      // 4ac: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4af: athrow
      // 4b0: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 4b5: ifeq 4c7
      // 4b8: goto 4bf
      // 4bb: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4be: athrow
      // 4bf: bipush 0
      // 4c0: goto 509
      // 4c3: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c6: athrow
      // 4c7: aload 16
      // 4c9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 4ce: astore 18
      // 4d0: aload 18
      // 4d2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4d7: ifeq 508
      // 4da: aload 18
      // 4dc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4e1: astore 19
      // 4e3: aload 19
      // 4e5: checkcast java/lang/String
      // 4e8: astore 20
      // 4ea: bipush 0
      // 4eb: istore 21
      // 4ed: aload 11
      // 4ef: checkcast java/lang/CharSequence
      // 4f2: aload 20
      // 4f4: checkcast java/lang/CharSequence
      // 4f7: bipush 0
      // 4f8: bipush 2
      // 4f9: aconst_null
      // 4fa: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 4fd: ifeq 4d0
      // 500: bipush 1
      // 501: aload 1
      // 502: ifnull 4fd
      // 505: goto 509
      // 508: bipush 0
      // 509: ifeq 518
      // 50c: aload 13
      // 50e: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 511: goto 518
      // 514: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 517: athrow
      // 518: iinc 9 1
      // 51b: aload 1
      // 51c: ifnonnull 176
      // 51f: aload 6
      // 521: checkcast java/util/Collection
      // 524: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 529: aload 1
      // 52a: ifnull 538
      // 52d: ifne 53b
      // 530: goto 537
      // 533: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 536: athrow
      // 537: bipush 1
      // 538: goto 53c
      // 53b: bipush 0
      // 53c: ifeq 613
      // 53f: aload 6
      // 541: checkcast java/lang/Iterable
      // 544: astore 10
      // 546: bipush 0
      // 547: istore 11
      // 549: aload 10
      // 54b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 550: astore 12
      // 552: aload 12
      // 554: aload 1
      // 555: ifnull 576
      // 558: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 55d: ifne 56f
      // 560: goto 567
      // 563: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 566: athrow
      // 567: aconst_null
      // 568: goto 5ec
      // 56b: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56e: athrow
      // 56f: aload 12
      // 571: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 576: astore 13
      // 578: aload 12
      // 57a: aload 1
      // 57b: ifnull 598
      // 57e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 583: ifne 596
      // 586: goto 58d
      // 589: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58c: athrow
      // 58d: aload 13
      // 58f: goto 5ec
      // 592: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 595: athrow
      // 596: aload 13
      // 598: checkcast kotlin/Pair
      // 59b: astore 14
      // 59d: bipush 0
      // 59e: istore 15
      // 5a0: aload 14
      // 5a2: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 5a5: checkcast java/lang/Number
      // 5a8: invokevirtual java/lang/Number.intValue ()I
      // 5ab: istore 14
      // 5ad: aload 12
      // 5af: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5b4: astore 15
      // 5b6: aload 15
      // 5b8: checkcast kotlin/Pair
      // 5bb: astore 16
      // 5bd: bipush 0
      // 5be: istore 17
      // 5c0: aload 16
      // 5c2: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
      // 5c5: checkcast java/lang/Number
      // 5c8: invokevirtual java/lang/Number.intValue ()I
      // 5cb: istore 16
      // 5cd: iload 14
      // 5cf: iload 16
      // 5d1: if_icmpge 5dc
      // 5d4: aload 15
      // 5d6: astore 13
      // 5d8: iload 16
      // 5da: istore 14
      // 5dc: aload 12
      // 5de: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5e3: ifne 5ad
      // 5e6: aload 1
      // 5e7: ifnull 5d8
      // 5ea: aload 13
      // 5ec: checkcast kotlin/Pair
      // 5ef: aload 1
      // 5f0: ifnull 608
      // 5f3: dup
      // 5f4: ifnull 60e
      // 5f7: goto 5fe
      // 5fa: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fd: athrow
      // 5fe: invokevirtual kotlin/Pair.getFirst ()Ljava/lang/Object;
      // 601: goto 608
      // 604: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 607: athrow
      // 608: checkcast me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 60b: goto 610
      // 60e: pop
      // 60f: aconst_null
      // 610: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 613: aload 7
      // 615: checkcast java/util/Collection
      // 618: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 61d: aload 1
      // 61e: ifnull 62c
      // 621: ifne 62f
      // 624: goto 62b
      // 627: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62a: athrow
      // 62b: bipush 1
      // 62c: goto 630
      // 62f: bipush 0
      // 630: ifeq 6d8
      // 633: aload 7
      // 635: checkcast java/lang/Iterable
      // 638: astore 10
      // 63a: bipush 0
      // 63b: istore 11
      // 63d: aload 10
      // 63f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 644: astore 12
      // 646: aload 12
      // 648: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 64d: ifeq 6b2
      // 650: aload 12
      // 652: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 657: astore 13
      // 659: aload 13
      // 65b: checkcast me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 65e: astore 14
      // 660: bipush 0
      // 661: istore 15
      // 663: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
      // 666: pop
      // 667: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 66a: astore 16
      // 66c: aload 16
      // 66e: aload 1
      // 66f: ifnull 677
      // 672: ifnull 699
      // 675: aload 14
      // 677: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 67a: aload 1
      // 67b: ifnull 696
      // 67e: aload 16
      // 680: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b ()I
      // 683: if_icmpne 695
      // 686: goto 68d
      // 689: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68c: athrow
      // 68d: bipush 1
      // 68e: goto 69a
      // 691: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 694: athrow
      // 695: bipush 0
      // 696: goto 69a
      // 699: bipush 0
      // 69a: ifne 6a5
      // 69d: bipush 1
      // 69e: goto 6a6
      // 6a1: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a4: athrow
      // 6a5: bipush 0
      // 6a6: ifeq 646
      // 6a9: aload 13
      // 6ab: aload 1
      // 6ac: ifnull 65b
      // 6af: goto 6b3
      // 6b2: aconst_null
      // 6b3: checkcast me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 6b6: aload 1
      // 6b7: ifnull 6d2
      // 6ba: dup
      // 6bb: ifnonnull 6d5
      // 6be: goto 6c5
      // 6c1: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c4: athrow
      // 6c5: pop
      // 6c6: aload 7
      // 6c8: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
      // 6cb: goto 6d2
      // 6ce: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d1: athrow
      // 6d2: checkcast me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 6d5: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 6d8: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 6db: aload 1
      // 6dc: ifnull 763
      // 6df: ifnonnull 760
      // 6e2: goto 6e9
      // 6e5: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e8: athrow
      // 6e9: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 6ec: aload 1
      // 6ed: ifnull 71c
      // 6f0: goto 6f7
      // 6f3: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f6: athrow
      // 6f7: ifnull 712
      // 6fa: goto 701
      // 6fd: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 700: athrow
      // 701: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 704: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 707: aload 1
      // 708: ifnonnull 760
      // 70b: goto 712
      // 70e: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 711: athrow
      // 712: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 715: goto 71c
      // 718: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71b: athrow
      // 71c: aload 1
      // 71d: ifnull 745
      // 720: ifnull 73b
      // 723: goto 72a
      // 726: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 729: athrow
      // 72a: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 72d: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 730: aload 1
      // 731: ifnonnull 760
      // 734: goto 73b
      // 737: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73a: athrow
      // 73b: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 73e: goto 745
      // 741: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 744: athrow
      // 745: aload 1
      // 746: ifnull 763
      // 749: ifnull 760
      // 74c: goto 753
      // 74f: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 752: athrow
      // 753: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 756: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 759: goto 760
      // 75c: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75f: athrow
      // 760: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 763: aload 1
      // 764: ifnull 808
      // 767: ifnonnull 805
      // 76a: goto 771
      // 76d: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 770: athrow
      // 771: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 774: aload 1
      // 775: ifnull 7c1
      // 778: goto 77f
      // 77b: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77e: athrow
      // 77f: ifnull 7b7
      // 782: goto 789
      // 785: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 788: athrow
      // 789: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 78c: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 78f: dup
      // 790: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 793: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/world/item/ItemStack;
      // 796: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 799: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/util/List;)Z
      // 79c: ifeq 7b7
      // 79f: goto 7a6
      // 7a2: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a5: athrow
      // 7a6: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 7a9: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 7ac: aload 1
      // 7ad: ifnonnull 805
      // 7b0: goto 7b7
      // 7b3: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b6: athrow
      // 7b7: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 7ba: goto 7c1
      // 7bd: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c0: athrow
      // 7c1: aload 1
      // 7c2: ifnull 7ea
      // 7c5: ifnull 7e0
      // 7c8: goto 7cf
      // 7cb: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7ce: athrow
      // 7cf: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 7d2: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 7d5: aload 1
      // 7d6: ifnonnull 805
      // 7d9: goto 7e0
      // 7dc: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7df: athrow
      // 7e0: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 7e3: goto 7ea
      // 7e6: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e9: athrow
      // 7ea: aload 1
      // 7eb: ifnull 808
      // 7ee: ifnull 805
      // 7f1: goto 7f8
      // 7f4: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f7: athrow
      // 7f8: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 7fb: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 7fe: goto 805
      // 801: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 804: athrow
      // 805: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 808: aload 1
      // 809: ifnull 85c
      // 80c: ifnonnull 859
      // 80f: goto 816
      // 812: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 815: athrow
      // 816: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 819: aload 1
      // 81a: ifnull 83e
      // 81d: goto 824
      // 820: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 823: athrow
      // 824: ifnull 83b
      // 827: goto 82e
      // 82a: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82d: athrow
      // 82e: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 831: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 834: goto 83b
      // 837: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83a: athrow
      // 83b: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 83e: aload 1
      // 83f: ifnull 85c
      // 842: ifnull 859
      // 845: goto 84c
      // 848: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84b: athrow
      // 84c: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 84f: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 852: goto 859
      // 855: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 858: athrow
      // 859: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 85c: aload 1
      // 85d: ifnull 87a
      // 860: ifnonnull 877
      // 863: goto 86a
      // 866: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 869: athrow
      // 86a: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 86d: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 870: goto 877
      // 873: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 876: athrow
      // 877: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 87a: dup
      // 87b: ifnull 9bd
      // 87e: astore 12
      // 880: bipush 0
      // 881: istore 13
      // 883: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 886: aload 12
      // 888: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/world/item/ItemStack;
      // 88b: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.d (Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;
      // 88e: astore 14
      // 890: aload 14
      // 892: checkcast java/lang/Iterable
      // 895: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 89a: astore 15
      // 89c: bipush 0
      // 89d: istore 16
      // 89f: aload 15
      // 8a1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8a6: ifeq 9ad
      // 8a9: iload 16
      // 8ab: istore 17
      // 8ad: iload 16
      // 8af: bipush 1
      // 8b0: iadd
      // 8b1: istore 16
      // 8b3: aload 15
      // 8b5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8ba: checkcast net/minecraft/network/chat/Component
      // 8bd: astore 18
      // 8bf: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 8c2: aload 18
      // 8c4: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 8c9: dup
      // 8ca: sipush 31493
      // 8cd: sipush -14693
      // 8d0: pop2
      // 8d1: ldc_w "getString(...)"
      // 8d4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 8d7: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 8da: astore 19
      // 8dc: aload 19
      // 8de: checkcast java/lang/CharSequence
      // 8e1: sipush 31614
      // 8e4: sipush 2339
      // 8e7: pop2
      // 8e8: ldc_w "when mining"
      // 8eb: checkcast java/lang/CharSequence
      // 8ee: bipush 0
      // 8ef: bipush 2
      // 8f0: aconst_null
      // 8f1: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 8f4: aload 1
      // 8f5: ifnull 8a6
      // 8f8: ifeq 89f
      // 8fb: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lkotlin/text/Regex;
      // 8fe: aload 19
      // 900: checkcast java/lang/CharSequence
      // 903: bipush 0
      // 904: bipush 2
      // 905: aconst_null
      // 906: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // 909: dup
      // 90a: ifnull 946
      // 90d: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 912: aload 1
      // 913: ifnull 935
      // 916: goto 91d
      // 919: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91c: athrow
      // 91d: dup
      // 91e: ifnull 946
      // 921: goto 928
      // 924: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 927: athrow
      // 928: bipush 1
      // 929: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 92e: goto 935
      // 931: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 934: athrow
      // 935: checkcast java/lang/String
      // 938: dup
      // 939: ifnull 946
      // 93c: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 93f: goto 94a
      // 942: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 945: athrow
      // 946: pop
      // 947: goto 89f
      // 94a: dstore 20
      // 94c: iload 17
      // 94e: aload 1
      // 94f: ifnull 99e
      // 952: aload 14
      // 954: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 957: if_icmpeq 89f
      // 95a: goto 961
      // 95d: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 960: athrow
      // 961: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 964: aload 14
      // 966: iload 17
      // 968: bipush 1
      // 969: iadd
      // 96a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 96f: checkcast net/minecraft/network/chat/Component
      // 972: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 977: dup
      // 978: sipush 31493
      // 97b: sipush -14693
      // 97e: pop2
      // 97f: ldc_w "getString(...)"
      // 982: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 985: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 988: checkcast java/lang/CharSequence
      // 98b: sipush 31528
      // 98e: sipush 416
      // 991: pop2
      // 992: ldc_w "Gemstones"
      // 995: checkcast java/lang/CharSequence
      // 998: bipush 0
      // 999: bipush 2
      // 99a: aconst_null
      // 99b: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // 99e: ifeq 89f
      // 9a1: dload 20
      // 9a3: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 9a6: aload 1
      // 9a7: ifnull 8ba
      // 9aa: goto 9ae
      // 9ad: aconst_null
      // 9ae: nop
      // 9af: dup
      // 9b0: ifnull 9bd
      // 9b3: invokevirtual java/lang/Double.doubleValue ()D
      // 9b6: goto 9bf
      // 9b9: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9bc: athrow
      // 9bd: pop
      // 9be: dconst_0
      // 9bf: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI D
      // 9c2: aload 1
      // 9c3: ifnull a5d
      // 9c6: getstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 9c9: dup
      // 9ca: ifnull a55
      // 9cd: goto 9d4
      // 9d0: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d3: athrow
      // 9d4: astore 12
      // 9d6: bipush 0
      // 9d7: istore 13
      // 9d9: getstatic me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll;
      // 9dc: aload 12
      // 9de: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/world/item/ItemStack;
      // 9e1: invokevirtual net/minecraft/world/item/ItemStack.getHoverName ()Lnet/minecraft/network/chat/Component;
      // 9e4: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 9e9: dup
      // 9ea: sipush 31493
      // 9ed: sipush -14693
      // 9f0: pop2
      // 9f1: ldc_w "getString(...)"
      // 9f4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 9f7: invokevirtual me/octo/client/utils/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a (Ljava/lang/String;)Ljava/lang/String;
      // 9fa: checkcast java/lang/CharSequence
      // 9fd: sipush 31527
      // a00: sipush 21027
      // a03: pop2
      // a04: ldc_w "Heated"
      // a07: checkcast java/lang/CharSequence
      // a0a: bipush 0
      // a0b: bipush 2
      // a0c: aconst_null
      // a0d: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
      // a10: ifne a1f
      // a13: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.I ()D, ()Ljava/lang/Double; ]
      // a18: goto a4f
      // a1b: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1e: athrow
      // a1f: getstatic me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // a22: aload 12
      // a24: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Lnet/minecraft/world/item/ItemStack;
      // a27: invokevirtual me/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.f (Lnet/minecraft/world/item/ItemStack;)Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // a2a: astore 14
      // a2c: aload 14
      // a2e: aload 1
      // a2f: ifnull a4a
      // a32: ifnonnull a48
      // a35: goto a3c
      // a38: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a3b: athrow
      // a3c: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.J ()D, ()Ljava/lang/Double; ]
      // a41: goto a4f
      // a44: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a47: athrow
      // a48: aload 14
      // a4a: invokedynamic invoke (Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Lme/octo/client/utils/player/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)D, ()Ljava/lang/Double; ]
      // a4f: nop
      // a50: nop
      // a51: dup
      // a52: ifnonnull a62
      // a55: pop
      // a56: goto a5d
      // a59: invokestatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a5c: athrow
      // a5d: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.K ()D, ()Ljava/lang/Double; ]
      // a62: putstatic me/octo/client/utils/lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lkotlin/jvm/functions/Function0;
      // a65: return
   }

   @NotNull
   public final ArrayList<Entity> E() {
      ArrayList<Entity> var2 = new ArrayList<Entity>();
      for (Entity var9 : this.a().level.entitiesForRendering()) {
         if (llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.contains(Reflection.getOrCreateKotlinClass(var9.getClass()))) {
            var2.add(var9);
         } else if (!(var9 instanceof net.minecraft.world.entity.decoration.ArmorStand) && var9.getDisplayName() != null) {
            boolean var16 = false;
            for (String var15 : llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll) {
               if (me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var9.getDisplayName().getString()).contains(var15)) {
                  var16 = true;
                  break;
               }
            }
            if (var16) {
               var2.add(var9);
            }
         }
      }
      return new ArrayList<Entity>(var2);
   }

   @NotNull
   public final ArrayList<Entity> F() {
      ArrayList<Entity> var2 = new ArrayList<Entity>();
      for (Entity var9 : this.a().level.entitiesForRendering()) {
         if (var9 instanceof RemotePlayer) {
            String var11 = ((RemotePlayer)var9).getName().getString();
            if (var11.contains("Golden Goblin") || var11.contains("Diamond Goblin")) {
               var2.add(var9);
            }
         }
      }
      return new ArrayList<Entity>(var2);
   }

   @Nullable
   public final Integer G() {
      Regex var2 = new Regex("\\b([1-9][0-9]?)\\b");
      ArrayList<kotlin.Pair<Integer, Integer>> var3 = new ArrayList<>();
      var var4 = this.a().player;
      if (var4 == null) {
         return null;
      }
      var var5 = var4.getInventory();
      for (int var6 = 0; var6 < 9; var6++) {
         var var7 = var5.getItem(var6);
         if (var7.isEmpty()) {
            continue;
         }
         for (Component var12 : me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.d(var7)) {
            String var13 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var12.getString());
            if (!var13.contains("Mining Wisdom:")) {
               continue;
            }
            MatchResult var14 = var2.find(var13, 0);
            if (var14 == null) {
               continue;
            }
            String var15 = var14.getValue();
            if (var15 == null) {
               continue;
            }
            Integer var16 = StringsKt.toIntOrNull(var15);
            if (var16 == null) {
               continue;
            }
            var3.add(new kotlin.Pair<>(var6, var16));
         }
      }
      if (var3.isEmpty()) {
         return IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl != null ? IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.b() : me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.K();
      }
      Iterator<kotlin.Pair<Integer, Integer>> var17 = var3.iterator();
      if (!var17.hasNext()) {
         return null;
      }
      kotlin.Pair<Integer, Integer> var18 = var17.next();
      int var19 = var18.getSecond();
      while (var17.hasNext()) {
         kotlin.Pair<Integer, Integer> var20 = var17.next();
         int var21 = var20.getSecond();
         if (var19 < var21) {
            var18 = var20;
            var19 = var21;
         }
      }
      return var18.getFirst();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void a(int var1, boolean var2) {
      label22: {
         int[] var3 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
         if (var2) {
            llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var4 = new llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll(
               0.0, 1, null
            );

            try {
               llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a((Function0<String>)null,  16777215,  var1);;
               if (var3 != null) {
                  break label22;
               }
            } catch (ConcurrentModificationException var7) {
               throw (RuntimeException)a(var7);
            }
         }

         try {
            llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::L, 16777215, var1);
         } catch (ConcurrentModificationException var6) {
            throw (RuntimeException)a(var6);
         }
      }

      try {
         ;
      } catch (ConcurrentModificationException var5) {
         throw (RuntimeException)a(var5);
      }
   }

   public final void b(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::M, 16777215, var1);
   }

   public final void c(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::N, 16777215, var1);
   }

   public final void d(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::O, 16777215, var1);
   }

   public final void e(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::P, 16777215, var1);
   }

   public final void f(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::Q, 16777215, var1);
   }

   public final void g(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::R, 16777215, var1);
   }

   public final void h(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::S, 16777215, var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void b(int var1, boolean var2) {
      label22: {
         int[] var3 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
         if (var2) {
            llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var4 = new llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll(
               0.0, 1, null
            );

            try {
               llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(() -> b(var4), 16777215, var1);
               if (var3 != null) {
                  break label22;
               }
            } catch (ConcurrentModificationException var7) {
               throw (RuntimeException)a(var7);
            }
         }

         try {
            llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::T, 16777215, var1);
         } catch (ConcurrentModificationException var6) {
            throw (RuntimeException)a(var6);
         }
      }

      try {
         ;
      } catch (ConcurrentModificationException var5) {
         throw (RuntimeException)a(var5);
      }
   }

   public final void a(int var1, int var2) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::U, 16777215, var1);
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::V, 16777215, var1);
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((Function0<String>)null,  16777215,  var1);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((Function0<String>)null,  16777215,  var1);;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void c(int var1, boolean var2) {
      label22: {
         int[] var3 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
         if (var2) {
            llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var4 = new llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll(
               0.0, 1, null
            );

            try {
               llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(() -> c(var4), 16777215, var1);
               if (var3 != null) {
                  break label22;
               }
            } catch (ConcurrentModificationException var7) {
               throw (RuntimeException)a(var7);
            }
         }

         try {
            llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::W, 16777215, var1);
         } catch (ConcurrentModificationException var6) {
            throw (RuntimeException)a(var6);
         }
      }

      try {
         ;
      } catch (ConcurrentModificationException var5) {
         throw (RuntimeException)a(var5);
      }
   }

   public final void i(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::X, 16777215, var1);
   }

   public final void j(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::Y, 16777215, var1);
   }

   public final void k(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::Z, 16777215, var1);
   }

   public final void l(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::aa, 16777215, var1);
   }

   public final void m(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::ab, 16777215, var1);
   }

   public final void n(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::ac, 16777215, var1);
   }

   public final void o(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::ad, 16777215, var1);
   }

   public final void p(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::ae, 16777215, var1);
   }

   public final void q(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::af, 16777215, var1);
   }

   public final void r(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::ag, 16777215, var1);
   }

   public final void s(int var1) {
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::ah, 16777215, var1);
   }

   private static final double H() {
      return 0.0;
   }

   private static final Unit a(JsonBuilder var0) {
      short var10001 = 31518;
      short var10002 = 14554;
      Intrinsics.checkNotNullParameter(var0, "$this$Json");
      var0.setIgnoreUnknownKeys(true);
      var0.setCoerceInputValues(true);
      return Unit.INSTANCE;
   }

   private static final double I() {
      return 0.0;
   }

   private static final double J() {
      return 0.0;
   }

   private static final double a(
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param0
   ) {
      me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI s = me.octo.client.utils.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      switch (param0.ordinal()) {
         case 0: return s.h() * 1.0;
         case 1: return s.h() * 1.4;
         case 2: return s.h() * 1.8;
         case 3: return s.h() * 2.2;
         case 4: return s.h() * 2.8;
         case 5: return s.h() * 3.4;
         case 6: return s.h() * 4.0;
         default: return 0.0;
      }
   }

   private static final boolean a(List<? extends Component> param0) {
      int[] var1 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Iterator<? extends Component> var2 = param0.iterator();
      while (var2.hasNext()) {
         String var3 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2.next().getString());
         if (var1 != null && var3.contains("Blue Cheese")) { return true; }
      }
      return false;
   }

   private static final int b(List<? extends Component> var0) {
      Object var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
      Iterator var2 = var0.iterator();
      Object var1 = var10000;

      label32:
      while (var2.hasNext()) {
         var10000 = var2.next();

         do {
            Component var3 = (Component)(Object)var10000;
            IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var8 = IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var10001 = var3.getString();
            short var10003 = 31493;
            short var10004 = -14693;
            Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
            String var4 = var8.a(var10001);
            MatchResult var5 = (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII).find( var4, 0);
            if (var5 == null) {
               continue label32;
            }

            var10000 = StringsKt.toIntOrNull(StringsKt.replace((String)var5.getGroupValues().get(1), ",", "", false));
         } while (var1 == null);

         try {
            if (var10000 != null) {
               return ((Integer)var10000).intValue();
            }
         } catch (ConcurrentModificationException var6) {
            throw (RuntimeException)a(var6);
         }

         return 0;
      }

      return 0;
   }

   private static final double K() {
      return 0.0;
   }

   private static final String a(llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var0) {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         Math.round(
            var0.a(
               IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e()
            )
         )
      ));
      short var10001 = 31586;
      short var10002 = 6583;
      return "Mithril Powder Gained: " + var10000;
   }

   private static final String L() {
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         Double.valueOf(
            IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()
         )
      );
      short var10001 = 31510;
      short var10002 = 9179;
      return "Mithril Powder Gained: " + var10000;
   }

   private static final String M() {
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         Double.valueOf(
            IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d()
         )
      );
      short var10001 = 31499;
      short var10002 = 10259;
      return "Gemstone Powder Gained: " + var10000;
   }

   private static final String N() {
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         Double.valueOf(
            IIIIIlIIIlIIIIlIllllIIIIIIIlllIlllIIIlIlIllllllIIIllIIIllIIIlIllIIIllIlIlIIlIIIllIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .f()
         )
      );
      short var10001 = 31490;
      short var10002 = -8743;
      return "Glacite Powder Gained: " + var10000;
   }

   private static final String O() {
      short var10001 = 31594;
      short var10002 = -5691;
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b("glacitePowder")
      );
      var10001 = 31562;
      var10002 = -7513;
      return "Glacite Powder / hr: " + var10000;
   }

   private static final String P() {
      short var10001 = 31489;
      short var10002 = -22152;
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b("mithrilPowder")
      );
      var10001 = 31587;
      var10002 = 25489;
      return "Mithril Powder / hr: " + var10000;
   }

   private static final String Q() {
      short var10001 = 31549;
      short var10002 = 11305;
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b("gemstonePowder")
      );
      var10001 = 31511;
      var10002 = 29249;
      return "Gemstone Powder / hr: " + var10000;
   }

   private static final String R() {
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         Double.valueOf(
            IIlIIIllllIIlIlIlIllIIlIIlIllIllllIIllIlIIIllllIIllIlIIllllIlllIIIlllIIIIIIIIIIIlIIll.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
               .b()
         )
      );
      short var10001 = 31546;
      short var10002 = 12563;
      return "Efficiency: " + var10000 + "%";
   }

   private static final String S() {
      short var10001 = 31599;
      short var10002 = -359;
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b("miningXp")
      );
      var10001 = 31610;
      var10002 = -9740;
      return "Mining XP / hr: " + var10000;
   }

   private static final String b(llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var0) {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         Math.round(
            var0.a(
               lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c()
            )
         )
      ));
      short var10001 = 31574;
      short var10002 = 25252;
      return "Mining XP Gained: " + var10000;
   }

   private static final String T() {
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         Double.valueOf(
            lIIllIlIlllIlIIIIIIIIlIllllIlIlIIlllIllIIIlIllIIlIIlIIlIlIlIIIIlIIIlllIIIlIlIIIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c()
         )
      );
      short var10001 = 31568;
      short var10002 = -23904;
      return "Mining XP Gained: " + var10000;
   }

   private static final String U() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .y()
      ));
      short var10001 = 31567;
      short var10002 = -6410;
      return "Commissions Completed: " + var10000;
   }

   private static final String V() {
      short var10001 = 31491;
      short var10002 = -17042;
      String var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(
         IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b("commissions")
      );
      var10001 = 31588;
      var10002 = 17530;
      return "Commissions / hr: " + var10000;
   }

   private static final String t(int var0) {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .y()
            * var0
      ));
      short var10001 = 31515;
      short var10002 = -8614;
      return "HOTM XP gained: " + var10000;
   }

   private static final String u(int param0) {
      java.lang.Double var2 = me.octo.client.IlllllllIlIIIlIlIIIlIIllIllIIIlllIlllIIIlIlIlIIIlIlIlIIlIlllIIlIllIlIlIlIlIllIllIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("commissions");
      if (var2 == null) { return "Calculating..."; }
      String var3 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.a(java.lang.Long.valueOf((long) (var2 * param0)));
      if (var3 == null) { return "Calculating..."; }
      return "HOTM XP / hr:" + var3;
   }

   private static final String c(llIllIllllIllIllIIllllIIIIlIlIIIlIIlIIllIIIlIlllIIIIlllllllllIIIlIlllllllIIIllIIlIlll var0) {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         Math.round(
            var0.a(
               IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .l()
            )
         )
      ));
      short var10001 = 31543;
      short var10002 = 145;
      return "Mithril Blocks Mined: " + var10000;
   }

   private static final String W() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .l()
      ));
      short var10001 = 31520;
      short var10002 = 25637;
      return "Mithril Blocks Mined: " + var10000;
   }

   private static final String X() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .k()
      ));
      short var10001 = 31545;
      short var10002 = -15928;
      return "Titanium Blocks Mined: " + var10000;
   }

   private static final String Y() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .m()
      ));
      short var10001 = 31606;
      short var10002 = -11673;
      return "Gemstone Blocks Mined: " + var10000;
   }

   private static final String Z() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .o()
      ));
      short var10001 = 31602;
      short var10002 = 19593;
      return "Tungsten Blocks Mined: " + var10000;
   }

   private static final String aa() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .n()
      ));
      short var10001 = 31551;
      short var10002 = 20175;
      return "Umber Blocks Mined: " + var10000;
   }

   private static final String ab() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p()
      ));
      short var10001 = 31565;
      short var10002 = 11585;
      return "Glacite Blocks Mined: " + var10000;
   }

   private static final String ac() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .r()
      ));
      short var10001 = 31522;
      short var10002 = 11547;
      return "Obsidian Blocks Mined: " + var10000;
   }

   private static final String ad() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .s()
      ));
      short var10001 = 31601;
      short var10002 = 1178;
      return "Endstone Blocks Mined: " + var10000;
   }

   private static final String ae() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .u()
      ));
      short var10001 = 31550;
      short var10002 = 15739;
      return "Cobblestone Blocks Mined: " + var10000;
   }

   private static final String af() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .q()
      ));
      short var10001 = 31535;
      short var10002 = 29873;
      return "Ore Blocks Mined: " + var10000;
   }

   private static final String ag() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .t()
      ));
      short var10001 = 31563;
      short var10002 = 1574;
      return "Hardstone Blocks Mined: " + var10000;
   }

   private static final String ah() {
      String var10000 = String.valueOf(((IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)null).a(
         IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
      ));
      short var10001 = 31600;
      short var10002 = -17238;
      return "Coins Per Hour: " + var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var25 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[119];
      int var3 = 0;
      String var2 = "\u009cJ'\u0086ì\u007f½\u0007¯\u0016ÊxRb÷¥¢c\"æ\u0094 B¶\u009f\u0092|ÊQãy\u008a²Ç\"#Øáj¹\n\u0091´ÿ·=ñ\u008f\u0004Æ\u000f\t\u0091\u0082W?,Â¼å§\u0016D\u000eÛã\u0013\u0005ÿ%£,¡DE_ºa]ZÙ¬\u0005\n\u008d\u000eÖ\u000b\u001c¡ù&b|\u009a\u0016\u000b\f\u0096\u0097.$\u008aÞ\u0083xìW\u008eÚ¤¥d\u0095¾ò\u0006ªï\u00035ôå\u0016\u0001}Æöì\u000fy\u008a\u0017oòÓj²d\u009d·Lk\u0093*µ\u001cË16|\u001a6\u0000\u008b5\u0095(z\u008f\u009f\u008d#\u0013³&ù\\á1oÐp\u008cz\u0017\b\u0012¢p\u0091þ\u000fú\u0017ÈßÀ¤Eç\u0015Ú\u009am¯Þ\t\u0088\u0006 \u0096.\"Å\u0014\u001fimìÎExZ$\u0092ß²zQÄrgJÓWg\u0015\u0083×à\u0001?\u0011êè\u008d³$ãµ\u0080îa#\u001b³¬\\û\u009aKM-W\"iÅc[\u0007\u0083ÝÑ¥\u001fRÀ\u0000OPÖö%\u0011\u000eµf?#Õò\u009d\u0003\u000b\u009d±\f.÷\u0012õ\u0094\u000bûVê\u001bÐ\u0011\u0010qî¾ãù º¹\t8¢³\u009b~Üïs¶\u0011k¯äõ<~\u001d\u0015}\u0012Çñð«ÎjÁ\u000f\u0012×\u008b+ ,ö1\u0018êN\u008e¦-ú\u001f\u001dÑÒ¿\u001dBF÷æNf\u009c¦j4û\u0082 N\u00128[ñe\u0017©!\u008d\nrß\u0005\u0083à£9à\u001e\u0000Éq¼i;Üâ$èÖÌE`-¶\u0002J¨Ñ·X\u0015!n\u0086\u001cEÔÛ\u0003¬ãî\u0016xÒé\u0003\t±Å]\u0080\u0095\u0000\u008c4Y¯àÎãDfÏ\u000b\u001e'À\u0018I}Óv7\u0018\u001aW.Þ$\u0083{uQÆU\u0094÷%Yð²@ÃL#\u0019¶G0±2ç¢\u009agÃ\u009f\u0012÷H\u0088{ÉKn\u0003\u0090ÚÌ\u009dÊ\u0017ì½Ãm\u009d¹º[OÑ\u0089{³ ÅÎ%\u001bñ\u000bÏÞD\u00157\u0093R½B\u0018hë\u0015\u0086\u0081É½¥y\u0082)ÍrÞ[\u0007N~\u0013cæ\u0094¼\u000e\u0011w²!^\u008bë\u0099\u0015ãú&~ê\u001a@37ó\u0018è%¯M\u0017;Ý1GLñ\u00167Xkòèä¬\u001aá\u0014\u0018¾è\u0007ýÔuÝPO\u0096))Ág)»\u00978ç\u001dS\u0007@\u0095\u000f\u0086/\u0094\u0082\u0005|3ò\u00855X\u009bªmpK-#ò4azÓ\u0080\u0017íÐaJ\u0004°â0<òº\u0087\b\u00adr\bh9;Û\u0014\u0087Ñ\fÏ×\u0004Lõy`\n=íçw\u0010ò_R<øHý£t*:LæÎ±ÿ\b\u0095\u001b\u001e5Ð´1\f\u000eíÛ4\u0094´\u0004±Ý\u008eF\u0001w8\u0098\u001c°&gA«\u0099\u008c\u0005%¶µ\u009d)©¸U\u0014\u009a(ãÉ/\u001b\u008d\u001a,ÆÙ\u0003\u0093ç\t\u000e7AýáÌ\u000fìwK¡3æÅ@\r\u0085ër$zU«±`m\u009fí´\u0017\u0017!ZÓÓÜïNÿô§ÄÕ¶\\6¸u\u0088Rb¶\u001f\u000b\u008fËåã©\u0012¶9?{c\u000f\u0083â\u0096\u0005æq8E-\u0093éá\u008eöö\u0012\u0096é\n«ùÅúáa\u001aq>Y\u0010T\u001bÕ¬\u0004ûyM\\\u0005`Tkn·\u000b\u0096ý\u009dåo\t²àëßU\u000eVô6Æ·&Á\u0017îZ\u0088\u0085I¼*\u000fK\u0090¾\u0000]\nÝ3\\X\u0014&Í¤n¾¸Ð#Ô ý\u0093\u0093á6Åð\f\u0006\u008aTÛ¶2MrñgÞ\u0083\u0018\u0006(tÊ\u0086öð6\u0006)þ´äÞ\t©,\u0005ÿ^j\u0003%Þ\u0011ê[õáæm\u0081v\u0093<¯Ì\u001dú¯\u0001A\u0015#\u008d\u0082èdÌhò3~¶##\u0011ÙÅYÌ-nS\u0017è\rûøKÎ\u008d²\u009bk+7DÈnùþ\u008c@m{Q<\u0016R¸þØ×´Ú~C V\u0095ñú«-\u0010Ô\u001c\u0011h1\u000e\u0018F2\u0093nÌÃ\u0003Ç\u0082®a\u00ad]\u0019\u000f{*ÐwêÅe¬¨\u001cy\u0007íBà¤ÉzÇpR\u0096ùe\u0003¿4ç\fNÛ@\u008e:\tdÏù\u008c\u008fï*Fê4\u0005÷^É\u001cö©°$^«9ÉbB\rÔQ}×]Æ»Üû°0\u001d\u009e\bú\u0094\u009d¥\u001e¨\u00030ñ\u000e<p\u0017Àq\u0080\u0094\u0019AnÅYA%\nÞ5e@\u0006µ#j\u0093H\u001f\u009a\u0097\u00952ÈTD2^ß\u00935\u0085°uÚ¼]`¢\u001a£\u008a.õXF<æWj\u000b@c\u001cö\u0096°QmÃñü\u0011¦á|¶×\u0087§+W\u00977¹\u000eTÍÔ\r\u0015«ý\u0093æF\r,Ê»y§Ã\u0001\r\u009dFÑ¼=`p\u0010-¯Æk\u009a\f\u0093ýÔ\u008c\r\u000e]²W\u0005\u0012]\u001e\u009bYfEOÓ\u0000&\u0084û\u007fÏB4aï\ru\u0089\u001b¢[\u000f6\n\u0016úY¤y\u000eý\u0091Ü¬Ùôûâ\u0091.å/>M\u001a\u00ad&i\u0094\u0005kÂK5\u00965h\u00ad`\u0004î\u001f\u0006\u000eöÂ8v4\u000b\u001c\u0003\u0004\u009c_\fbÏ[oí]¸é±j§V\u0017\u0084Ûv\"ú\u0095»Ù]\u0006ó\u009a_}\rO\u0092ZÍ·Ê\n\n\u0015\u0000ïæ¤èEùÃ\u0015Eúò~p)\u0086W\u0007\u0000b¨\u0010\u0086a\f|©vWè\u008aûiúß\u0085\u008a\u0003\u0006\u0090¥&×YV\u0007³W¥ÕP\u00ad\u009f\bBò\u0090\u0006c>#3\b«\u008a\u0003zð\u0083¡\u0098\u0003hãn\r\u0013]þ\\G-}\u0000\u0092[Á+\u007f\u0006JfòW¥¸\u0012â¿è8\u0015¨\u0082ýHF-\u009fÏ®C\u000b®2$ú\u0007.e\u0082\u0000©\u0085\u0083\u000b&^Á+kå¶ À\u0092É¬TÞm\"f\u009d»t¸å§@\u0018ï\u0017³\u001dÂlP\"*¬]h\u0096Ô\u008dÇÂE~\u0090ùîL!Ú\u0005Ã ¢§U\u0010ÅÞ\u008cB\u001a\u0016º\u008cä\u000e\u009d6Z\u0082¥×\u0017\u0087Ë\u000fÜÁ4\u0018n\u001b0^ß\u0094¦ái\u001a\u0015u^Ý7è\u0017u\u000eh\ba#àÿnhðÔAÇ[EM\u0090\u009fî\u0080!C\u0007ä:÷\u0086Èê§\ryí 9\u0085¤OÂ\u009cwhõ7\u001dbá=¹à\u0085äã\u0007±|ð\u0019VÍ\bàÕåqeYkä\u0006,<i`\u000bÝñ1@s\u001b\u0097ÂDãÞ\u0005\u0096sµ\u008al\u0005\u0087\u0017\u001eß\f#Á¨I\u0090n£4B2PM\u009e#Ï-F\u0091\u0090\u001bò\rnmßª\r*Õ\u0001A¸»%5ü\u0010È\u0088åIÍ×\u008e&>ÁÇ\u0080\u0087ò Ù\u0005\u0006À\u0011{¼+®ß¤,\u0086\u000fÚ\u0097)\u0015\u001b=Nè·Ã\n)?ß>¶\u0011*v(úÝ\u001d\u0019ú8\u009dòPÙ×MÍ8ñ\u008eê\u0005\u0087q*\u008dD\u0019\u0014jIò\u001b®Hí\u001d¹*[Á©\u009ah¿Ø\u0019å\u001c\u0016\u001bqÔ\blj!\u001b7qÍ´\u000e\u009cå\u0095ôvO\u0093\u009e¿\u0000Ò\u0094F\u009f\t\u0082á;ýL\u0081\u0089\u001d>\u000bÚÏR\b\rVY\u008b°½Ï1\u001d\u008fÒ&HN\u0003¿\u0012\u0010|\u009d¢ü*I¹qFÐÿÍ0\u0093hc9rc°ë\u0095üÅf\u008exÉ\u0004\u00ad\n\u0089\bª5\r\u008fA\u009e\u000b,´ÊÌ\u0085,ïD@K \u0016RtòyÆ\u0089Mä¹¢'jÐ\u00853{]\u00906\b\u0081Æ\f%O-\u001c\u0097[Ñ\u0085OÅYÆ\u0017 ¥$.\u0091«±\u000eß\u009d\u007f\u008clnÄ¤Búa.\u00069\u0093)\u00945ãqn¤Çâ\u008a»oèÀR{\u009c ÉØ\u0080X]>OI\u0018¹\u008e\u0017$êÙ¶n$Â]\u0003Káo\u000eC\u009d³ïè\u008eO]Ý\u0096\u0003\u0080ú+\u0015Ö/b\u0012Ôä\u000fIã\u0014$Ø¥5R.8\u0012íÀ\u0015\u0018\u0086V\u0095\u0096A\u0093îé¡ÈÊíá\u008bÚ\u0096\u000b÷\u0090©\u0087ý\u0098\u0001\f^øBx½~Ùøç½õø\u0007Bíà¡D,\u008a\u0012d'p¼\u007fiØñô;ö\u009eÅD\u0096ÔW'\u0005\u007fH<,\u0013\u0012Ôëf%½Z\u0080\u0097ÿ÷\u0097\u0007éw\u0013²çë";
      int var4 = "\u009cJ'\u0086ì\u007f½\u0007¯\u0016ÊxRb÷¥¢c\"æ\u0094 B¶\u009f\u0092|ÊQãy\u008a²Ç\"#Øáj¹\n\u0091´ÿ·=ñ\u008f\u0004Æ\u000f\t\u0091\u0082W?,Â¼å§\u0016D\u000eÛã\u0013\u0005ÿ%£,¡DE_ºa]ZÙ¬\u0005\n\u008d\u000eÖ\u000b\u001c¡ù&b|\u009a\u0016\u000b\f\u0096\u0097.$\u008aÞ\u0083xìW\u008eÚ¤¥d\u0095¾ò\u0006ªï\u00035ôå\u0016\u0001}Æöì\u000fy\u008a\u0017oòÓj²d\u009d·Lk\u0093*µ\u001cË16|\u001a6\u0000\u008b5\u0095(z\u008f\u009f\u008d#\u0013³&ù\\á1oÐp\u008cz\u0017\b\u0012¢p\u0091þ\u000fú\u0017ÈßÀ¤Eç\u0015Ú\u009am¯Þ\t\u0088\u0006 \u0096.\"Å\u0014\u001fimìÎExZ$\u0092ß²zQÄrgJÓWg\u0015\u0083×à\u0001?\u0011êè\u008d³$ãµ\u0080îa#\u001b³¬\\û\u009aKM-W\"iÅc[\u0007\u0083ÝÑ¥\u001fRÀ\u0000OPÖö%\u0011\u000eµf?#Õò\u009d\u0003\u000b\u009d±\f.÷\u0012õ\u0094\u000bûVê\u001bÐ\u0011\u0010qî¾ãù º¹\t8¢³\u009b~Üïs¶\u0011k¯äõ<~\u001d\u0015}\u0012Çñð«ÎjÁ\u000f\u0012×\u008b+ ,ö1\u0018êN\u008e¦-ú\u001f\u001dÑÒ¿\u001dBF÷æNf\u009c¦j4û\u0082 N\u00128[ñe\u0017©!\u008d\nrß\u0005\u0083à£9à\u001e\u0000Éq¼i;Üâ$èÖÌE`-¶\u0002J¨Ñ·X\u0015!n\u0086\u001cEÔÛ\u0003¬ãî\u0016xÒé\u0003\t±Å]\u0080\u0095\u0000\u008c4Y¯àÎãDfÏ\u000b\u001e'À\u0018I}Óv7\u0018\u001aW.Þ$\u0083{uQÆU\u0094÷%Yð²@ÃL#\u0019¶G0±2ç¢\u009agÃ\u009f\u0012÷H\u0088{ÉKn\u0003\u0090ÚÌ\u009dÊ\u0017ì½Ãm\u009d¹º[OÑ\u0089{³ ÅÎ%\u001bñ\u000bÏÞD\u00157\u0093R½B\u0018hë\u0015\u0086\u0081É½¥y\u0082)ÍrÞ[\u0007N~\u0013cæ\u0094¼\u000e\u0011w²!^\u008bë\u0099\u0015ãú&~ê\u001a@37ó\u0018è%¯M\u0017;Ý1GLñ\u00167Xkòèä¬\u001aá\u0014\u0018¾è\u0007ýÔuÝPO\u0096))Ág)»\u00978ç\u001dS\u0007@\u0095\u000f\u0086/\u0094\u0082\u0005|3ò\u00855X\u009bªmpK-#ò4azÓ\u0080\u0017íÐaJ\u0004°â0<òº\u0087\b\u00adr\bh9;Û\u0014\u0087Ñ\fÏ×\u0004Lõy`\n=íçw\u0010ò_R<øHý£t*:LæÎ±ÿ\b\u0095\u001b\u001e5Ð´1\f\u000eíÛ4\u0094´\u0004±Ý\u008eF\u0001w8\u0098\u001c°&gA«\u0099\u008c\u0005%¶µ\u009d)©¸U\u0014\u009a(ãÉ/\u001b\u008d\u001a,ÆÙ\u0003\u0093ç\t\u000e7AýáÌ\u000fìwK¡3æÅ@\r\u0085ër$zU«±`m\u009fí´\u0017\u0017!ZÓÓÜïNÿô§ÄÕ¶\\6¸u\u0088Rb¶\u001f\u000b\u008fËåã©\u0012¶9?{c\u000f\u0083â\u0096\u0005æq8E-\u0093éá\u008eöö\u0012\u0096é\n«ùÅúáa\u001aq>Y\u0010T\u001bÕ¬\u0004ûyM\\\u0005`Tkn·\u000b\u0096ý\u009dåo\t²àëßU\u000eVô6Æ·&Á\u0017îZ\u0088\u0085I¼*\u000fK\u0090¾\u0000]\nÝ3\\X\u0014&Í¤n¾¸Ð#Ô ý\u0093\u0093á6Åð\f\u0006\u008aTÛ¶2MrñgÞ\u0083\u0018\u0006(tÊ\u0086öð6\u0006)þ´äÞ\t©,\u0005ÿ^j\u0003%Þ\u0011ê[õáæm\u0081v\u0093<¯Ì\u001dú¯\u0001A\u0015#\u008d\u0082èdÌhò3~¶##\u0011ÙÅYÌ-nS\u0017è\rûøKÎ\u008d²\u009bk+7DÈnùþ\u008c@m{Q<\u0016R¸þØ×´Ú~C V\u0095ñú«-\u0010Ô\u001c\u0011h1\u000e\u0018F2\u0093nÌÃ\u0003Ç\u0082®a\u00ad]\u0019\u000f{*ÐwêÅe¬¨\u001cy\u0007íBà¤ÉzÇpR\u0096ùe\u0003¿4ç\fNÛ@\u008e:\tdÏù\u008c\u008fï*Fê4\u0005÷^É\u001cö©°$^«9ÉbB\rÔQ}×]Æ»Üû°0\u001d\u009e\bú\u0094\u009d¥\u001e¨\u00030ñ\u000e<p\u0017Àq\u0080\u0094\u0019AnÅYA%\nÞ5e@\u0006µ#j\u0093H\u001f\u009a\u0097\u00952ÈTD2^ß\u00935\u0085°uÚ¼]`¢\u001a£\u008a.õXF<æWj\u000b@c\u001cö\u0096°QmÃñü\u0011¦á|¶×\u0087§+W\u00977¹\u000eTÍÔ\r\u0015«ý\u0093æF\r,Ê»y§Ã\u0001\r\u009dFÑ¼=`p\u0010-¯Æk\u009a\f\u0093ýÔ\u008c\r\u000e]²W\u0005\u0012]\u001e\u009bYfEOÓ\u0000&\u0084û\u007fÏB4aï\ru\u0089\u001b¢[\u000f6\n\u0016úY¤y\u000eý\u0091Ü¬Ùôûâ\u0091.å/>M\u001a\u00ad&i\u0094\u0005kÂK5\u00965h\u00ad`\u0004î\u001f\u0006\u000eöÂ8v4\u000b\u001c\u0003\u0004\u009c_\fbÏ[oí]¸é±j§V\u0017\u0084Ûv\"ú\u0095»Ù]\u0006ó\u009a_}\rO\u0092ZÍ·Ê\n\n\u0015\u0000ïæ¤èEùÃ\u0015Eúò~p)\u0086W\u0007\u0000b¨\u0010\u0086a\f|©vWè\u008aûiúß\u0085\u008a\u0003\u0006\u0090¥&×YV\u0007³W¥ÕP\u00ad\u009f\bBò\u0090\u0006c>#3\b«\u008a\u0003zð\u0083¡\u0098\u0003hãn\r\u0013]þ\\G-}\u0000\u0092[Á+\u007f\u0006JfòW¥¸\u0012â¿è8\u0015¨\u0082ýHF-\u009fÏ®C\u000b®2$ú\u0007.e\u0082\u0000©\u0085\u0083\u000b&^Á+kå¶ À\u0092É¬TÞm\"f\u009d»t¸å§@\u0018ï\u0017³\u001dÂlP\"*¬]h\u0096Ô\u008dÇÂE~\u0090ùîL!Ú\u0005Ã ¢§U\u0010ÅÞ\u008cB\u001a\u0016º\u008cä\u000e\u009d6Z\u0082¥×\u0017\u0087Ë\u000fÜÁ4\u0018n\u001b0^ß\u0094¦ái\u001a\u0015u^Ý7è\u0017u\u000eh\ba#àÿnhðÔAÇ[EM\u0090\u009fî\u0080!C\u0007ä:÷\u0086Èê§\ryí 9\u0085¤OÂ\u009cwhõ7\u001dbá=¹à\u0085äã\u0007±|ð\u0019VÍ\bàÕåqeYkä\u0006,<i`\u000bÝñ1@s\u001b\u0097ÂDãÞ\u0005\u0096sµ\u008al\u0005\u0087\u0017\u001eß\f#Á¨I\u0090n£4B2PM\u009e#Ï-F\u0091\u0090\u001bò\rnmßª\r*Õ\u0001A¸»%5ü\u0010È\u0088åIÍ×\u008e&>ÁÇ\u0080\u0087ò Ù\u0005\u0006À\u0011{¼+®ß¤,\u0086\u000fÚ\u0097)\u0015\u001b=Nè·Ã\n)?ß>¶\u0011*v(úÝ\u001d\u0019ú8\u009dòPÙ×MÍ8ñ\u008eê\u0005\u0087q*\u008dD\u0019\u0014jIò\u001b®Hí\u001d¹*[Á©\u009ah¿Ø\u0019å\u001c\u0016\u001bqÔ\blj!\u001b7qÍ´\u000e\u009cå\u0095ôvO\u0093\u009e¿\u0000Ò\u0094F\u009f\t\u0082á;ýL\u0081\u0089\u001d>\u000bÚÏR\b\rVY\u008b°½Ï1\u001d\u008fÒ&HN\u0003¿\u0012\u0010|\u009d¢ü*I¹qFÐÿÍ0\u0093hc9rc°ë\u0095üÅf\u008exÉ\u0004\u00ad\n\u0089\bª5\r\u008fA\u009e\u000b,´ÊÌ\u0085,ïD@K \u0016RtòyÆ\u0089Mä¹¢'jÐ\u00853{]\u00906\b\u0081Æ\f%O-\u001c\u0097[Ñ\u0085OÅYÆ\u0017 ¥$.\u0091«±\u000eß\u009d\u007f\u008clnÄ¤Búa.\u00069\u0093)\u00945ãqn¤Çâ\u008a»oèÀR{\u009c ÉØ\u0080X]>OI\u0018¹\u008e\u0017$êÙ¶n$Â]\u0003Káo\u000eC\u009d³ïè\u008eO]Ý\u0096\u0003\u0080ú+\u0015Ö/b\u0012Ôä\u000fIã\u0014$Ø¥5R.8\u0012íÀ\u0015\u0018\u0086V\u0095\u0096A\u0093îé¡ÈÊíá\u008bÚ\u0096\u000b÷\u0090©\u0087ý\u0098\u0001\f^øBx½~Ùøç½õø\u0007Bíà¡D,\u008a\u0012d'p¼\u007fiØñô;ö\u009eÅD\u0096ÔW'\u0005\u007fH<,\u0013\u0012Ôëf%½Z\u0080\u0097ÿ÷\u0097\u0007éw\u0013²çë"
         .length();
      char var1 = '#';
      int var9 = -1;

      label52:
      while (true) {
         byte var10000 = 116;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var59 = var10001.toCharArray();
               int var10004 = var59.length;
               int var6 = 0;
               byte var62 = var10000;
               var25 = var59;
               int var19 = var10004;
               byte var97;
               char[] var101;
               int var10006;
               if (var10004 <= 1) {
                  var101 = var59;
                  var97 = var10000;
                  var10006 = var6;
               } else {
                  var62 = var10000;
                  var19 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var101 = var59;
                  var97 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var101[var10006] = (char)(var101[var10006] ^ var97 ^ switch (var6 % 7) {
                     case 0 -> 61;
                     case 1 -> 36;
                     case 2 -> 43;
                     case 3 -> 11;
                     case 4 -> 35;
                     case 5 -> 70;
                     default -> 42;
                  });
                  var6++;
                  if (var62 == 0) {
                     var10006 = var62;
                     var101 = var25;
                     var97 = var62;
                  } else {
                     if (var19 <= var6) {
                        break;
                     }

                     var101 = var25;
                     var97 = var62;
                     var10006 = var6;
                  }
               }
            }

            String var64 = new String(var25).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var64;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[119];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII();
                     var10002 = 31570;
                     short var65 = -32532;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new Regex("\\[Lvl (\\d+)]");
                     var10002 = 31548;
                     short var66 = -27997;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Regex("\\d{1,2}");
                     var10002 = 31516;
                     short var67 = 13989;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new Regex(
                        "Mining Speed\\s*:\\s*\\+?(\\d{1,3}(?:,\\d{3})*)"
                     );
                     var10002 = 31572;
                     short var68 = -12907;
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new Regex("\\+(\\d{2,3})!");
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII::H;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = true;
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     String[] var7 = new String[6];
                     var10002 = 31605;
                     short var69 = 21767;
                     var7[0] = "Your Mining Speed Boost has expired!";
                     var10002 = 31613;
                     short var70 = -6277;
                     var7[1] = "Your Sheer Force has expired!";
                     var10002 = 31541;
                     short var71 = -31843;
                     var7[2] = "Your Maniac Miner has expired!";
                     var10002 = 31525;
                     short var72 = -28807;
                     var7[3] = "Your Gemstone Infusion has expired!";
                     var10002 = 31531;
                     short var73 = -30039;
                     var7[4] = "Your Tunnel Vision has expired!";
                     var10002 = 31494;
                     short var74 = 26606;
                     var7[5] = "Your Pickobulus has expired!";
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = SetsKt.setOf(var7);
                     var7 = new String[6];
                     var10002 = 31533;
                     short var75 = -5306;
                     var7[0] = "Mining Speed Boost is now available!";
                     var10002 = 31544;
                     short var76 = 25967;
                     var7[1] = "Sheer Force is now available!";
                     var10002 = 31536;
                     short var77 = -2006;
                     var7[2] = "Maniac Miner is now available!";
                     var10002 = 31524;
                     short var78 = 7986;
                     var7[3] = "Gemstone Infusion is now available!";
                     var10002 = 31519;
                     short var79 = -27543;
                     var7[4] = "Tunnel Vision is now available!";
                     var10002 = 31521;
                     short var80 = 30272;
                     var7[5] = "Pickobulus is now available!";
                     lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = SetsKt.setOf(var7);
                     var7 = new String[6];
                     var10002 = 31555;
                     short var81 = 19625;
                     var7[0] = "You used your Mining Speed Boost Pickaxe Ability!";
                     var10002 = 31498;
                     short var82 = -31183;
                     var7[1] = "You used your Sheer Force Pickaxe Ability!";
                     var10002 = 31556;
                     short var83 = 15643;
                     var7[2] = "You used your Maniac Miner Pickaxe Ability!";
                     var10002 = 31569;
                     short var84 = 31322;
                     var7[3] = "You used your Gemstone Infusion Pickaxe Ability!";
                     var10002 = 31526;
                     short var85 = -17937;
                     var7[4] = "You used your Tunnel Vision Pickaxe Ability!";
                     var10002 = 31560;
                     short var86 = -28405;
                     var7[5] = "You used your Pickobulus Pickaxe Ability!";
                     IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = SetsKt.setOf(var7);
                     KClass[] var12 = new KClass[]{
                        Reflection.getOrCreateKotlinClass(Zombie.class),
                        Reflection.getOrCreateKotlinClass(Spider.class),
                        Reflection.getOrCreateKotlinClass(Creeper.class),
                        Reflection.getOrCreateKotlinClass(Skeleton.class),
                        Reflection.getOrCreateKotlinClass(Slime.class),
                        Reflection.getOrCreateKotlinClass(MagmaCube.class),
                        Reflection.getOrCreateKotlinClass(Silverfish.class)
                     };
                     llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = SetsKt.setOf(var12);
                     var7 = new String[8];
                     var10002 = 31593;
                     short var87 = -22203;
                     var7[0] = "Yog";
                     var10002 = 31523;
                     short var88 = -2554;
                     var7[1] = "Sludge";
                     var10002 = 31612;
                     short var89 = 13524;
                     var7[2] = "Boss Corleone";
                     var10002 = 31595;
                     short var90 = -19554;
                     var7[3] = "Goblin";
                     var10002 = 31530;
                     short var91 = 6727;
                     var7[4] = "Team Treasurite";
                     var10002 = 31611;
                     short var92 = 806;
                     var7[5] = "Thyst";
                     var10002 = 31553;
                     short var93 = 6109;
                     var7[6] = "Automaton";
                     var10002 = 31506;
                     short var94 = 8656;
                     var7[7] = "Bal";
                     llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = CollectionsKt.listOf(var7);
                     break pxClinit;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var64;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "ÑÞ\u009cÛV&\u0017eG\u009c\u0001ÛÚãøq|6P¾ýèp<æê\u0000çjÂÆX@LR~h\u0010\u0087>râ\u0096R^}\u009d~\f´Æ¬<W\u0015@\u0002\r\u001dÂÛ";
                  var4 = "ÑÞ\u009cÛV&\u0017eG\u009c\u0001ÛÚãøq|6P¾ýèp<æê\u0000çjÂÆX@LR~h\u0010\u0087>râ\u0096R^}\u009d~\f´Æ¬<W\u0015@\u0002\r\u001dÂÛ".length();
                  var1 = '0';
                  var9 = -1;
            }

            var10000 = 40;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ 31524) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 185;
            case 1 -> 214;
            case 2 -> 209;
            case 3 -> 90;
            case 4 -> 124;
            case 5 -> 96;
            case 6 -> 252;
            case 7 -> 72;
            case 8 -> 115;
            case 9 -> 49;
            case 10 -> 227;
            case 11 -> 51;
            case 12 -> 142;
            case 13 -> 251;
            case 14 -> 65;
            case 15 -> 99;
            case 16 -> 237;
            case 17 -> 250;
            case 18 -> 116;
            case 19 -> 54;
            case 20 -> 35;
            case 21 -> 148;
            case 22 -> 70;
            case 23 -> 74;
            case 24 -> 117;
            case 25 -> 198;
            case 26 -> 38;
            case 27 -> 229;
            case 28 -> 37;
            case 29 -> 102;
            case 30 -> 182;
            case 31 -> 218;
            case 32 -> 109;
            case 33 -> 205;
            case 34 -> 181;
            case 35 -> 248;
            case 36 -> 118;
            case 37 -> 222;
            case 38 -> 157;
            case 39 -> 17;
            case 40 -> 241;
            case 41 -> 112;
            case 42 -> 66;
            case 43 -> 9;
            case 44 -> 186;
            case 45 -> 68;
            case 46 -> 47;
            case 47 -> 166;
            case 48 -> 98;
            case 49 -> 21;
            case 50 -> 23;
            case 51 -> 244;
            case 52 -> 138;
            case 53 -> 183;
            case 54 -> 36;
            case 55 -> 172;
            case 56 -> 119;
            case 57 -> 162;
            case 58 -> 53;
            case 59 -> 231;
            case 60 -> 33;
            case 61 -> 155;
            case 62 -> 59;
            case 63 -> 87;
            case 64 -> 140;
            case 65 -> 13;
            case 66 -> 24;
            case 67 -> 230;
            case 68 -> 58;
            case 69 -> 130;
            case 70 -> 18;
            case 71 -> 144;
            case 72 -> 32;
            case 73 -> 141;
            case 74 -> 158;
            case 75 -> 220;
            case 76 -> 5;
            case 77 -> 126;
            case 78 -> 88;
            case 79 -> 11;
            case 80 -> 131;
            case 81 -> 203;
            case 82 -> 200;
            case 83 -> 184;
            case 84 -> 156;
            case 85 -> 48;
            case 86 -> 161;
            case 87 -> 197;
            case 88 -> 234;
            case 89 -> 191;
            case 90 -> 136;
            case 91 -> 56;
            case 92 -> 176;
            case 93 -> 20;
            case 94 -> 192;
            case 95 -> 171;
            case 96 -> 132;
            case 97 -> 73;
            case 98 -> 79;
            case 99 -> 139;
            case 100 -> 46;
            case 101 -> 22;
            case 102 -> 81;
            case 103 -> 253;
            case 104 -> 84;
            case 105 -> 235;
            case 106 -> 108;
            case 107 -> 100;
            case 108 -> 14;
            case 109 -> 111;
            case 110 -> 7;
            case 111 -> 180;
            case 112 -> 153;
            case 113 -> 106;
            case 114 -> 133;
            case 115 -> 243;
            case 116 -> 152;
            case 117 -> 60;
            case 118 -> 105;
            case 119 -> 217;
            case 120 -> 163;
            case 121 -> 123;
            case 122 -> 19;
            case 123 -> 16;
            case 124 -> 45;
            case 125 -> 178;
            case 126 -> 71;
            case 127 -> 0;
            case 128 -> 154;
            case 129 -> 40;
            case 130 -> 110;
            case 131 -> 245;
            case 132 -> 193;
            case 133 -> 145;
            case 134 -> 80;
            case 135 -> 254;
            case 136 -> 6;
            case 137 -> 196;
            case 138 -> 107;
            case 139 -> 236;
            case 140 -> 219;
            case 141 -> 44;
            case 142 -> 211;
            case 143 -> 199;
            case 144 -> 92;
            case 145 -> 177;
            case 146 -> 167;
            case 147 -> 26;
            case 148 -> 64;
            case 149 -> 77;
            case 150 -> 206;
            case 151 -> 39;
            case 152 -> 3;
            case 153 -> 42;
            case 154 -> 240;
            case 155 -> 175;
            case 156 -> 173;
            case 157 -> 208;
            case 158 -> 213;
            case 159 -> 207;
            case 160 -> 164;
            case 161 -> 239;
            case 162 -> 114;
            case 163 -> 146;
            case 164 -> 216;
            case 165 -> 97;
            case 166 -> 228;
            case 167 -> 224;
            case 168 -> 255;
            case 169 -> 1;
            case 170 -> 95;
            case 171 -> 12;
            case 172 -> 179;
            case 173 -> 101;
            case 174 -> 149;
            case 175 -> 247;
            case 176 -> 174;
            case 177 -> 151;
            case 178 -> 187;
            case 179 -> 29;
            case 180 -> 204;
            case 181 -> 89;
            case 182 -> 232;
            case 183 -> 134;
            case 184 -> 121;
            case 185 -> 30;
            case 186 -> 67;
            case 187 -> 137;
            case 188 -> 190;
            case 189 -> 82;
            case 190 -> 104;
            case 191 -> 31;
            case 192 -> 128;
            case 193 -> 202;
            case 194 -> 169;
            case 195 -> 61;
            case 196 -> 189;
            case 197 -> 143;
            case 198 -> 201;
            case 199 -> 85;
            case 200 -> 246;
            case 201 -> 69;
            case 202 -> 210;
            case 203 -> 83;
            case 204 -> 215;
            case 205 -> 55;
            case 206 -> 15;
            case 207 -> 159;
            case 208 -> 94;
            case 209 -> 91;
            case 210 -> 195;
            case 211 -> 226;
            case 212 -> 122;
            case 213 -> 160;
            case 214 -> 188;
            case 215 -> 223;
            case 216 -> 27;
            case 217 -> 242;
            case 218 -> 63;
            case 219 -> 249;
            case 220 -> 8;
            case 221 -> 135;
            case 222 -> 41;
            case 223 -> 50;
            case 224 -> 125;
            case 225 -> 233;
            case 226 -> 129;
            case 227 -> 120;
            case 228 -> 225;
            case 229 -> 2;
            case 230 -> 194;
            case 231 -> 93;
            case 232 -> 62;
            case 233 -> 76;
            case 234 -> 212;
            case 235 -> 86;
            case 236 -> 52;
            case 237 -> 147;
            case 238 -> 103;
            case 239 -> 34;
            case 240 -> 221;
            case 241 -> 150;
            case 242 -> 43;
            case 243 -> 165;
            case 244 -> 25;
            case 245 -> 10;
            case 246 -> 28;
            case 247 -> 168;
            case 248 -> 75;
            case 249 -> 78;
            case 250 -> 170;
            case 251 -> 127;
            case 252 -> 57;
            case 253 -> 4;
            case 254 -> 113;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static enum PXEvMid {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        PXEvMid(Object... px) {
           this(""); // PX-FIX: 委托主构造器（final 字段初始化）
        }

      @NotNull
      public static lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      private PXEvMid(String var3) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
      }

      @NotNull
      public final String a() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public static lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid[] b() {
         return (lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid[])llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.clone();
      }

      public static lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid a(
         String var0
      ) {
         return Enum.valueOf(
            lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid> c() {
         return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final PXEvMid[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new PXEvMid[]{IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII};
      private static final EnumEntries<PXEvMid> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = kotlin.enums.EnumEntriesKt.enumEntries(llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);

      public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
         private static String a;

         private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         }

         @NotNull
         public final lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid a(
            @NotNull String var1
         ) {
            Object var10000 = IIlIIIIlIIIIlllllIlIIlIIllIIlIIllllIlllIlIIlIIlIllIIIIlIlIllIlIIlIlIlIIlIIIIlllIIlIIl.c();
            Intrinsics.checkNotNullParameter(var1, a);
            Iterable var3 = (Iterable)lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid.c();
            Object var2 = var10000;
            Iterator var4 = var3.iterator();

            label24:
            while (true) {
               if (var4.hasNext()) {
                  Object var5 = var4.next();
                  var10000 = var5;

                  while (true) {
                     lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid var6 = (lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid)var10000;
                     boolean var7 = false;
                     if (!Intrinsics.areEqual(var6.a(), var1)) {
                        continue label24;
                     }

                     var10000 = var5;
                     if (var2 != null) {
                        break label24;
                     }
                  }
               }

               var10000 = null;
               break;
            }

            lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid var9 = (lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid)var10000;
            if ((lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid)var10000
               == null) {
               var9 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.PXEvMid.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            }

            return var9;
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
   pxClinit: {
            char[] var10003 = "f_2P~".toCharArray();
            int var10004 = var10003.length;
            int var0 = 0;
            byte var6 = 5;
            char[] var10002 = var10003;
            int var1 = var10004;
            byte var10;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10 = 5;
               var10006 = var0;
            } else {
               var6 = 5;
               var1 = var10004;
               if (var10004 <= var0) {
                  String var9 = new String(var10003).intern();
                  byte var4 = -1;
                  a = var9;
                  break pxClinit;
               }

               var10005 = var10003;
               var10 = 5;
               var10006 = var0;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
                  case 0 -> 21;
                  case 1 -> 59;
                  case 2 -> 91;
                  case 3 -> 32;
                  case 4 -> 30;
                  case 5 -> 80;
                  default -> 53;
               });
               var0++;
               if (var6 == 0) {
                  var10006 = var6;
                  var10005 = var10002;
                  var10 = var6;
               } else {
                  if (var1 <= var0) {
                     String var8 = new String(var10002).intern();
                     byte var3 = -1;
                     a = var8;
                     break pxClinit;
                  }

                  var10005 = var10002;
                  var10 = var6;
                  var10006 = var0;
               }
            }
         }
}
      }

   private static final PXEvMid[] d() {
      return new PXEvMid[]{IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII};
   }

   }

   public static void a(
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var0,
      int var1,
      boolean var2,
      int var3,
      java.lang.Object var4
   ) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }
      
      var0.a(var1, var2);
   }

   public static boolean a(
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var0,
      boolean var1,
      int var2,
      java.lang.Object var3
   ) {
      if ((var2 & 1) != 0) {
         var1 = false;
      }
      
      return var0.e(var1);
   }

   public static void b(
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var0,
      int var1,
      boolean var2,
      int var3,
      java.lang.Object var4
   ) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }
      
      var0.b(var1, var2);
   }

   public static void c(
      me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var0,
      int var1,
      boolean var2,
      int var3,
      java.lang.Object var4
   ) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }
      
      var0.c(var1, var2);
   }
}
