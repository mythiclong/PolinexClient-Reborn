package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll;
import me.octo.client.events.impl.IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll;
import me.octo.client.events.impl.lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII;
import me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.collections.ArraysKt;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import java.util.Collection;
import me.octo.client.utils.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI;
import me.octo.client.utils.IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import net.minecraft.client.player.LocalPlayer;
import kotlin.collections.MapsKt;
import kotlin.text.MatchResult;
import net.minecraft.sounds.SoundEvents;
import kotlin.text.StringsKt;
import kotlin.TuplesKt;
import me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll;
import me.octo.client.utils.lIlIlllllllIIlIlIlllIIllIlllllIlllllllllIIlIlllIlIlIllIlIlIIlIlIIIllllllIIIlIIllllIIl;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public class IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI
   extends IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI {
    public static <T> T a(Object... args) { return null; } // PX-FIX ovld-var
    public static <T> T b(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld2
    public static <T> T b(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld2
    public static <T> T b(Object p0, Object p1) { return null; } // PX-FIX ovld2
    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) { return null; } // PX-FIX ovld2
    public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; } // PX-FIX ovld2
    public static <T> T a(Object p0) { return null; } // PX-FIX ovld2
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) { return null; } // PX-FIX ovld

   public IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI(
      String var1,
      String var2,
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      String var4,
      List<String> var5,
      List<String> var6,
      boolean var7,
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var8,
      int var9,
      kotlin.jvm.internal.DefaultConstructorMarker var10
   ) {
      this(var1, var2, var3, var4, (var9 & 16) != 0 ? CollectionsKt.emptyList() : var5, (var9 & 32) != 0 ? CollectionsKt.emptyList() : var6, (var9 & 64) != 0 ? false : var7, var8);
   }

   @NotNull
   public static IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private List<llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI> IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private final lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private final IllIIIlIlIIlllllIIllIllIIIIllllIIllIllIIllllIIIllIlllIIIIlllIlIIIIIlIlIIIIIIIlIIlllll lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private final boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false; // PX-FIX: 字节码从不写该 final 字段（默认 false）
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @JvmField
   @NotNull
   public final lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @NotNull
   private static Regex IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @NotNull
   private static Regex lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   @NotNull
   private static Regex lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @NotNull
   private static lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   @NotNull
   private static IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   @NotNull
   private static llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   @NotNull
   private static llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   @NotNull
   private static lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   private static int lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   private static String[] f;
   private static String[] g;
   // PX-FIX phaseA S1c: synthetic accessors restored from jar bytecode (name/descriptor exact; ACC_SYNTHETIC unreproducible by javac)
   public static final me.octo.client.llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl a0() { return IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI; }
   public static final me.octo.client.llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll a1() { return IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII; }
   public static final me.octo.client.lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl a2() { return IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII; }
   public static final kotlin.text.Regex aV() { return IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI; }
   public static final kotlin.text.Regex aW() { return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI; }
   public static final kotlin.text.Regex aX() { return lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI; }
   public static final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI aY() { return IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl; }
   public static final me.octo.client.IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll aZ() { return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI; }


   public IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      @NotNull List<String> var5,
      @NotNull List<String> var6,
      boolean var7,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var8
   ) {
      short var10001 = 26742;
      short var10002 = -6315;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 26665;
      var10002 = -12542;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = 26668;
      var10002 = 1644;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = 26728;
      var10002 = 1529;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = 26751;
      var10002 = -16458;
      Intrinsics.checkNotNullParameter(var5, "instructions");
      var10001 = 26724;
      var10002 = -19633;
      Intrinsics.checkNotNullParameter(var6, "tips");
      var10001 = 26712;
      var10002 = -18081;
      Intrinsics.checkNotNullParameter(var8, "settings");
      super(var1, var2, var3, var4, var5, var6, var7, Arrays.copyOf(var8, var8.length));
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new ArrayList<>();
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = CollectionsKt.emptyList();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll(
         this
      );
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new IllIIIlIlIIlllllIIllIllIIIIllllIIllIllIIllllIIIllIlllIIIIlllIlIIIIIlIlIIIIIIIlIIlllll(
         this
      );
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10003 = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Vec3 var10005 = Vec3.ZERO;
      short var10007 = 26734;
      short var10008 = 25128;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      short var10006 = 26689;
      var10007 = -1550;
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI(
         var10003, Integer.MAX_VALUE, var10005, "/warp hub"
      );
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = new lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl();
   }

   @NotNull
   public final IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll W() {
      return this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   public final void a(
      @NotNull IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e ()Z
      // 03: aload 1
      // 04: sipush 26741
      // 07: sipush 15407
      // 0a: pop2
      // 0b: ldc "value"
      // 0d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: istore 2
      // 11: iload 2
      // 12: ifeq d4
      // 15: aload 1
      // 16: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 19: if_acmpne cf
      // 1c: goto 23
      // 1f: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 22: athrow
      // 23: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 26: invokevirtual java/lang/Thread.getStackTrace ()[Ljava/lang/StackTraceElement;
      // 29: dup
      // 2a: sipush 26723
      // 2d: sipush 28575
      // 30: pop2
      // 31: ldc "getStackTrace(...)"
      // 33: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 36: checkcast [Ljava/lang/Object;
      // 39: bipush 2
      // 3a: invokestatic kotlin/collections/ArraysKt.getOrNull ([Ljava/lang/Object;I)Ljava/lang/Object;
      // 3d: checkcast java/lang/StackTraceElement
      // 40: astore 3
      // 41: iload 2
      // 42: ifeq 85
      // 45: aload 3
      // 46: dup
      // 47: ifnull 7d
      // 4a: goto 51
      // 4d: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 50: athrow
      // 51: invokevirtual java/lang/StackTraceElement.getClassName ()Ljava/lang/String;
      // 54: iload 2
      // 55: ifeq 79
      // 58: goto 5f
      // 5b: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 5e: athrow
      // 5f: dup
      // 60: ifnull 7d
      // 63: goto 6a
      // 66: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 69: athrow
      // 6a: bipush 46
      // 6c: aconst_null
      // 6d: bipush 2
      // 6e: aconst_null
      // 6f: invokestatic kotlin/text/StringsKt.substringAfterLast$default (Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
      // 72: goto 79
      // 75: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 78: athrow
      // 79: iload 2
      // 7a: ifne 86
      // 7d: pop
      // 7e: goto 85
      // 81: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 84: athrow
      // 85: aconst_null
      // 86: aload 3
      // 87: dup
      // 88: ifnull 95
      // 8b: invokevirtual java/lang/StackTraceElement.getMethodName ()Ljava/lang/String;
      // 8e: goto 97
      // 91: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 94: athrow
      // 95: pop
      // 96: aconst_null
      // 97: aload 3
      // 98: dup
      // 99: ifnull a9
      // 9c: invokevirtual java/lang/StackTraceElement.getLineNumber ()I
      // 9f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a2: goto ab
      // a5: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // a8: athrow
      // a9: pop
      // aa: aconst_null
      // ab: astore 4
      // ad: astore 5
      // af: astore 6
      // b1: sipush 26694
      // b4: sipush 29510
      // b7: pop2
      // b8: ldc_w "state -> CAST by "
      // bb: aload 6
      // bd: ldc_w "."
      // c0: aload 5
      // c2: ldc_w ":"
      // c5: aload 4
      // c7: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001\u0001" ]
      // cc: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g (Ljava/lang/String;)V
      // cf: aload 0
      // d0: aload 1
      // d1: putfield me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // d4: return
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll X() {
      return this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   public final void a(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var1;
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll Y() {
      return this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   }

   public final void b(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var1;
   }

   @NotNull
   public final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> ac() {
      return this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   }

   public final void a(@NotNull ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1) {
      short var10001 = 26692;
      short var10002 = 6716;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var1;
   }

   @NotNull
   public final List<llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI> ad() {
      return this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   }

   public final void a(@NotNull List<llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI> param1) {
      Intrinsics.checkNotNullParameter(param1, "value");
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7e[Profit] Enable Sack Notifications if disabled ");
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = param1;
      if (!param1.isEmpty() && me.octo.client.IlIlIIlIlIlllIIIIllIlllIlIlllIlllIIlIlIllIIIllIllIllIlIllIllIIIIIIIllIllIllIlllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.e().aA()) {
         for (llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI var6 : param1) {
            if (var6.a() == me.octo.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7e[Auto Forge] \u00a7fenable the Forge widget so it can read your slots: \u00a7b/tablist \u00a7f\u2192 \u00a7bForge Widget");
               break;
            }
         }
      }
   }

   @NotNull
   public final lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll ae() {
      return this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         return;
      }

      if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
            == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         return;
      }

      if (!this.G()) {
         return;
      }

      boolean var3 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.a((Number) Integer.valueOf(1000))
         && IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.a((Number) Integer.valueOf(3000))
         && me.octo.client.llIIlIlllIlIllIllIllIlIlIlllllIlllIIIIlIIllIIIlIllIlIlIlIIIIIIlllIlIlllIlllIllIlIlIIl.a() == null;
      if (var3) {
         this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.f();
      }

      java.util.Iterator var4 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.iterator();
      while (var4.hasNext()) {
         me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI var5 =
            (me.octo.client.llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI) var4.next();
         if (!var3 && !var5.c()) {
            continue;
         }

         if (!var5.b().invoke().booleanValue()) {
            continue;
         }

         this.a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         this.ag();
         me.octo.client.llIIlIlllIlIllIllIllIlIlIlllllIlllIIIIlIIllIIIlIllIlIlIlIIIIIIlllIlIlllIlllIllIlIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a((java.lang.Runnable) () -> this.a());
         me.octo.client.llIIlIlllIlIllIllIllIlIlIlllllIlllIIIIlIIllIIIlIllIlIlIlIIIIIIlllIlIlllIlllIllIlIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var5.a());
      }
   }

   public boolean af() {
      return true;
   }

   public void ag() {
      this.aO();
   }

   public void ah() {
   }

   public boolean ai() {
      return this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl param1) {
      boolean var2 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");

      if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl == me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         return;
      }

      this.aA();
   }

   @SubscribeEvent
   public final void b(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         return;
      }

      me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var3 =
         me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g();
      if (var3 != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            && var3 != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.f();
      }

      if (this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.a((Number) Integer.valueOf(10000))) {
         if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
               != me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
            this.aA();
            return;
         }
      }

      if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
            != me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
      if (this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.a((Number) Integer.valueOf(5000))) {
         switch (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g()) {
            case me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII:
               this.a("Warping to the lobby", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("/l");
               break;
            case me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl:
               this.a("Warping to SkyBlock", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("/skyblock");
               break;
            default:
               this.a("Finished warping back", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
               this.aB();
         }
         this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.f();
      }
      }
   }

   private final void aA() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.f();
      this.ap().execute(null);
      short var10001 = 26722;
      short var10002 = -11950;
      this.a(
         "Detected a warp to the lobby",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
   }

   public void aB() {
   }

   @SubscribeEvent
   public final void c(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var8 = null; // PX-FIX
      boolean var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      short var10002 = 26750;
      short var10003 = -27486;
      Intrinsics.checkNotNullParameter(var1, "event");
      boolean var2 = var10000;

      label57: {
         try {
            var10000 = this.G();
            if (!var2) {
               break label57;
            }

            if (!var10000) {
               return;
            }
         } catch (UnsupportedOperationException var6) {
            throw b(var6);
         }

         var10000 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      }

      label62: {
         label46: {
            try {
               if (!var2) {
                  break label46;
               }

               if (!var10000) {
                  return;
               }
            } catch (UnsupportedOperationException var5) {
               throw b(var5);
            }

            try {
               var8 = this;
               if (!var2) {
                  break label62;
               }

               var10000 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.f();
            } catch (UnsupportedOperationException var3) {
               throw b(var3);
            }
         }

         try {
            if (var10000) {
               this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.b();
               return;
            }
         } catch (UnsupportedOperationException var4) {
            throw b(var4);
         }

         this.aC();
         var8 = this;
      }

      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.d();
   }

   public void aC() {
   }

   protected void aD() {
   }

   protected final void aE() {
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.a();
   }

   protected final void aF() {
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.b();
   }

   protected final void a(@NotNull IllIlIllllIIIIIlllIIllIIIIlllIIllIlIIIlIIIlIIlIllIIIIllIlIlllIIIllIIIllIIIlIIIllllIll var1) {
      short var10001 = 26711;
      short var10002 = -9094;
      Intrinsics.checkNotNullParameter(var1, "check");
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.a(var1);
   }

   protected final void a(
      @NotNull String var1,
      @NotNull IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      long var3,
      long var5,
      boolean var7,
      boolean var8,
      @NotNull Function0<? extends Object> var9,
      @NotNull Function1<? super IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit> var10
   ) {
      short var10001 = 26742;
      short var10002 = -6315;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 26716;
      var10002 = -2804;
      Intrinsics.checkNotNullParameter(var2, "state");
      var10001 = 26707;
      var10002 = 4717;
      Intrinsics.checkNotNullParameter(var9, "progress");
      var10001 = 26698;
      var10002 = -12709;
      Intrinsics.checkNotNullParameter(var10, "onStuck");
      this.a(
         var1,
         SetsKt.setOf(var2),
         null,
         var5,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI::aR,
         var7,
         var8,
         var9,
         var10
      );
   }

   protected final void a(
      @NotNull String var1,
      @NotNull IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      long var3,
      long var5,
      @NotNull Function0<Boolean> var7,
      boolean var8,
      boolean var9,
      @NotNull Function0<? extends Object> var10,
      @NotNull Function1<? super IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit> var11
   ) {
      short var10001 = 26742;
      short var10002 = -6315;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 26669;
      var10002 = 23482;
      Intrinsics.checkNotNullParameter(var2, "state");
      var10001 = 26730;
      var10002 = -9394;
      Intrinsics.checkNotNullParameter(var7, "active");
      var10001 = 26707;
      var10002 = 4717;
      Intrinsics.checkNotNullParameter(var10, "progress");
      var10001 = 26698;
      var10002 = -12709;
      Intrinsics.checkNotNullParameter(var11, "onStuck");
      this.a(
         var1,
         SetsKt.setOf(var2),
         null,
         var5,
         var7,
         var8,
         var9,
         var10,
         var11
      );
   }

   protected final void a(
      @NotNull String var1,
      @NotNull IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      @NotNull Function0<Long> var3,
      long var4,
      boolean var6,
      boolean var7,
      @NotNull Function0<? extends Object> var8,
      @NotNull Function1<? super IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit> var9
   ) {
      short var10001 = 26742;
      short var10002 = -6315;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 26669;
      var10002 = 23482;
      Intrinsics.checkNotNullParameter(var2, "state");
      var10001 = 26715;
      var10002 = -28969;
      Intrinsics.checkNotNullParameter(var3, "timeoutMs");
      var10001 = 26707;
      var10002 = 4717;
      Intrinsics.checkNotNullParameter(var8, "progress");
      var10001 = 26698;
      var10002 = -12709;
      Intrinsics.checkNotNullParameter(var9, "onStuck");
      this.a(
         var1,
         SetsKt.setOf(var2),
         var3,
         var4,
         null,
         var6,
         var7,
         var8,
         var9
      );
   }

   protected final void a(
      @NotNull String var1,
      @NotNull IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      @NotNull Function0<Long> var3,
      long var4,
      @NotNull Function0<Boolean> var6,
      boolean var7,
      boolean var8,
      @NotNull Function0<? extends Object> var9,
      @NotNull Function1<? super IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit> var10
   ) {
      short var10001 = 26742;
      short var10002 = -6315;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 26669;
      var10002 = 23482;
      Intrinsics.checkNotNullParameter(var2, "state");
      var10001 = 26715;
      var10002 = -28969;
      Intrinsics.checkNotNullParameter(var3, "timeoutMs");
      var10001 = 26730;
      var10002 = -9394;
      Intrinsics.checkNotNullParameter(var6, "active");
      var10001 = 26707;
      var10002 = 4717;
      Intrinsics.checkNotNullParameter(var9, "progress");
      var10001 = 26698;
      var10002 = -12709;
      Intrinsics.checkNotNullParameter(var10, "onStuck");
      this.a(var1, SetsKt.setOf(var2), var3, var4, var6, var7, var8, var9, var10);
   }

   protected final void a(
      @NotNull String var1,
      @NotNull Set<? extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var2,
      long var3,
      long var5,
      @NotNull Function0<Boolean> var7,
      boolean var8,
      boolean var9,
      @NotNull Function0<? extends Object> var10,
      @NotNull Function1<? super IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit> var11
   ) {
      short var10001 = 26742;
      short var10002 = -6315;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 26708;
      var10002 = -10785;
      Intrinsics.checkNotNullParameter(var2, "states");
      var10001 = 26730;
      var10002 = -9394;
      Intrinsics.checkNotNullParameter(var7, "active");
      var10001 = 26707;
      var10002 = 4717;
      Intrinsics.checkNotNullParameter(var10, "progress");
      var10001 = 26698;
      var10002 = -12709;
      Intrinsics.checkNotNullParameter(var11, "onStuck");
      this.a(var1, var2, null, var5, var7, var8, var9, var10, var11);
   }

   protected final void a(
      @NotNull String var1,
      @NotNull Set<? extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var2,
      @NotNull Function0<Long> var3,
      long var4,
      @NotNull Function0<Boolean> var6,
      boolean var7,
      boolean var8,
      @NotNull Function0<? extends Object> var9,
      @NotNull Function1<? super IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit> var10
   ) {
      short var10001 = 26690;
      short var10002 = -15236;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 26697;
      var10002 = -20620;
      Intrinsics.checkNotNullParameter(var2, "states");
      var10001 = 26664;
      var10002 = 3988;
      Intrinsics.checkNotNullParameter(var3, "timeoutMs");
      var10001 = 26740;
      var10002 = 3320;
      Intrinsics.checkNotNullParameter(var6, "active");
      var10001 = 26713;
      var10002 = 23423;
      Intrinsics.checkNotNullParameter(var9, "progress");
      var10001 = 26738;
      var10002 = -5620;
      Intrinsics.checkNotNullParameter(var10, "onStuck");
      this.a(
         new IllIlIllllIIIIIlllIIllIIIIlllIIllIlIIIlIIIlIIlIllIIIIllIlIlllIIIllIIIllIIIlIIIllllIll(
            var1, var2, var3, null, var4, var7, var8, var10
         )
      );
   }

   @NotNull
   protected final Triple<Integer, Integer, Integer> a(double var1) {
      Vec3 var3 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
      return new Triple((int)Math.floor(var3.x * var1), (int)Math.floor(var3.y * var1), (int)Math.floor(var3.z * var1));
   }

   @SubscribeEvent
   public final void a(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      if (!this.G()) {
         return;
      }
      net.minecraft.network.protocol.Packet var3 = param1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var3 instanceof net.minecraft.network.protocol.game.ClientboundSystemChatPacket) {
         String var4 = ((net.minecraft.network.protocol.game.ClientboundSystemChatPacket) var3).content().getString();
         kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var4, "getString(...)");
         if (kotlin.jvm.internal.Intrinsics.areEqual(var4, "Not enough soulflow!")) {
            this.a("Stopping because you don't have any soulflow left", true);
            me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a("no_soulflow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("macro_name", this.aj())), true, true);
         } else if (kotlin.jvm.internal.Intrinsics.areEqual(var4, "You haven't unlocked this fast travel destination!")) {
            this.a("Stopping because you don't have this fast travel destination", false);
         } else if (var4.startsWith(" ☠ You")) {
            this.aG();
         } else if (var4.startsWith("Couldn't warp you! Try again later.") && this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl == IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            new java.lang.Thread(this::c).start();
         }
      }
   }

   private final void a(String param1, boolean param2) {
      boolean var3 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      this.d(param1);
      if (var3) {
         if (param2) {
            LocalPlayer var4 = this.ap().player;
            if (var4 != null) {
               var4.playSound((net.minecraft.sounds.SoundEvent)net.minecraft.sounds.SoundEvents.NOTE_BLOCK_PLING.value(), 1.0F, 1.0F);
            }
         }
         IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }
   }

   private final void aG() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      this.aO();
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(2000L, null);
   }

   public void aH() {
   }

   @NotNull
   public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI aI() {
      return this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   }

   @NotNull
   public final lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI aJ() {
      return this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   }

   public final void a(@NotNull lIllllIllllIIllIlIllIlIlIIIIlIIlllllllIlIIIIIIlIlIlIIIlIIIIllIllllIllllIIIlllIIIIlIlI var1) {
      short var10001 = 26702;
      short var10002 = 28714;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var1;
   }

   public void a(@NotNull IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI param1, int param2) {
      boolean var3 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "location");
      this.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.f();
      IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.f();

      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1, param2);

      if (this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.b() == Integer.MAX_VALUE) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Travel waitTime is:" + this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.b() + " report this!");
         me.octo.client.IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(me.octo.client.IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      } else {
         this.aO();
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t();
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.d());
      }
   }

   public final boolean aK() {
         boolean var1 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
         double var2 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.c(), false);
         if (var1) {
            return var2 != 4.0d;
         }
         if (var2 > 4.0d) {
            if (me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g() != me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
               this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.f();
            }
         }
         return this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.a(java.lang.Integer.valueOf(this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.b()));
   }

   @Nullable
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      return null;
   }

   @SubscribeEvent
    public final void a(@NotNull lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII param1) {
       Intrinsics.checkNotNullParameter(param1, "event");
       if (!this.G()) return;
       lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll var3 = this.aL();
       if (var3 == null) return;
       switch (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[param1.m().ordinal()]) {
          case 1:
             if (!var3.a()) return;
             break;
          case 2:
             if (!var3.b()) return;
             break;
       }
       this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.a(param1.k(), param1.l());
    }

   @SubscribeEvent
   public final void d(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      boolean var2 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      Intrinsics.checkNotNullParameter(param1, "event");
      if (var2) {
        if (!this.G()) {
          return;
        }
      } else {
        if (this.aL() == null) {
          return;
        }
      }
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.e();
   }

   @SubscribeEvent
   public final void b(@NotNull IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d ()Z
      // 003: aload 1
      // 004: sipush 26727
      // 007: sipush 8704
      // 00a: pop2
      // 00b: ldc_w "event"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: istore 2
      // 012: aload 0
      // 013: iload 2
      // 014: ifne 02a
      // 017: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.G ()Z
      // 01a: ifne 029
      // 01d: goto 024
      // 020: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 023: athrow
      // 024: return
      // 025: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 028: athrow
      // 029: aload 0
      // 02a: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.aL ()Lme/octo/client/lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll;
      // 02d: dup
      // 02e: ifnonnull 037
      // 031: pop
      // 032: return
      // 033: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 036: athrow
      // 037: astore 3
      // 038: aload 1
      // 039: getfield me/octo/client/events/impl/IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lnet/minecraft/network/protocol/Packet;
      // 03c: astore 4
      // 03e: aload 4
      // 040: instanceof net/minecraft/network/protocol/game/ClientboundSystemChatPacket
      // 043: iload 2
      // 044: ifne 06b
      // 047: ifeq 06e
      // 04a: goto 051
      // 04d: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 050: athrow
      // 051: aload 4
      // 053: checkcast net/minecraft/network/protocol/game/ClientboundSystemChatPacket
      // 056: iload 2
      // 057: ifne 074
      // 05a: goto 061
      // 05d: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 060: athrow
      // 061: invokevirtual net/minecraft/network/protocol/game/ClientboundSystemChatPacket.overlay ()Z
      // 064: goto 06b
      // 067: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 06a: athrow
      // 06b: ifeq 06f
      // 06e: return
      // 06f: aload 4
      // 071: checkcast net/minecraft/network/protocol/game/ClientboundSystemChatPacket
      // 074: invokevirtual net/minecraft/network/protocol/game/ClientboundSystemChatPacket.content ()Lnet/minecraft/network/chat/Component;
      // 077: invokeinterface net/minecraft/network/chat/Component.getString ()Ljava/lang/String; 1
      // 07c: dup
      // 07d: sipush 26733
      // 080: sipush -29538
      // 083: pop2
      // 084: ldc_w "getString(...)"
      // 087: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 08a: astore 5
      // 08c: aload 3
      // 08d: invokevirtual me/octo/client/lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll.d ()Z
      // 090: iload 2
      // 091: ifne 111
      // 094: ifeq 10d
      // 097: goto 09e
      // 09a: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 09d: athrow
      // 09e: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI Lkotlin/text/Regex;
      // 0a1: aload 5
      // 0a3: checkcast java/lang/CharSequence
      // 0a6: bipush 0
      // 0a7: bipush 2
      // 0a8: aconst_null
      // 0a9: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // 0ac: astore 6
      // 0ae: aload 6
      // 0b0: iload 2
      // 0b1: ifne 0c0
      // 0b4: ifnull 10d
      // 0b7: goto 0be
      // 0ba: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0bd: athrow
      // 0be: aload 6
      // 0c0: astore 7
      // 0c2: bipush 0
      // 0c3: istore 8
      // 0c5: iload 2
      // 0c6: ifne 10b
      // 0c9: aload 7
      // 0cb: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 0d0: bipush 1
      // 0d1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d6: checkcast java/lang/String
      // 0d9: ldc_w ","
      // 0dc: ldc_w ""
      // 0df: bipush 0
      // 0e0: bipush 4
      // 0e1: aconst_null
      // 0e2: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
      // 0e5: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
      // 0e8: dup
      // 0e9: ifnull 10a
      // 0ec: goto 0f3
      // 0ef: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0f2: athrow
      // 0f3: checkcast java/lang/Number
      // 0f6: invokevirtual java/lang/Number.intValue ()I
      // 0f9: istore 9
      // 0fb: bipush 0
      // 0fc: istore 10
      // 0fe: aload 0
      // 0ff: getfield me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lme/octo/client/lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl;
      // 102: iload 9
      // 104: invokevirtual me/octo/client/lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.a (I)V
      // 107: goto 10c
      // 10a: pop
      // 10b: nop
      // 10c: return
      // 10d: aload 3
      // 10e: invokevirtual me/octo/client/lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll.e ()Z
      // 111: iload 2
      // 112: ifne 1a2
      // 115: ifeq 196
      // 118: goto 11f
      // 11b: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 11e: athrow
      // 11f: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI Lkotlin/text/Regex;
      // 122: aload 5
      // 124: checkcast java/lang/CharSequence
      // 127: bipush 0
      // 128: bipush 2
      // 129: aconst_null
      // 12a: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // 12d: astore 6
      // 12f: aload 6
      // 131: iload 2
      // 132: ifne 141
      // 135: ifnull 196
      // 138: goto 13f
      // 13b: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 13e: athrow
      // 13f: aload 6
      // 141: astore 7
      // 143: bipush 0
      // 144: istore 8
      // 146: iload 2
      // 147: ifne 173
      // 14a: aload 7
      // 14c: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 151: bipush 1
      // 152: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 157: checkcast java/lang/String
      // 15a: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
      // 15d: dup
      // 15e: ifnull 172
      // 161: goto 168
      // 164: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 167: athrow
      // 168: invokevirtual java/lang/Integer.intValue ()I
      // 16b: goto 174
      // 16e: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 171: athrow
      // 172: pop
      // 173: bipush 1
      // 174: istore 9
      // 176: aload 0
      // 177: getfield me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lme/octo/client/lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl;
      // 17a: getstatic me/octo/client/utils/lIlIlllllllIIlIlIlllIIllIlllllIlllllllllIIlIlllIlIlIllIlIlIIlIlIIIllllllIIIlIIllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/lIlIlllllllIIlIlIlllIIllIlllllIlllllllllIIlIlllIlIlIllIlIlIIlIlIIIllllllIIIlIIllllIIl;
      // 17d: aload 7
      // 17f: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 184: bipush 2
      // 185: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 18a: checkcast java/lang/String
      // 18d: invokevirtual me/octo/client/utils/lIlIlllllllIIlIlIlllIIllIlllllIlllllllllIIlIlllIlIlIllIlIlIIlIlIIIllllllIIIlIIllllIIl.b (Ljava/lang/String;)Ljava/lang/String;
      // 190: iload 9
      // 192: invokevirtual me/octo/client/lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.b (Ljava/lang/String;I)V
      // 195: return
      // 196: aload 3
      // 197: invokevirtual me/octo/client/lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll.f ()Ljava/util/List;
      // 19a: checkcast java/util/Collection
      // 19d: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 1a2: iload 2
      // 1a3: ifne 1b1
      // 1a6: ifne 1b4
      // 1a9: goto 1b0
      // 1ac: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1af: athrow
      // 1b0: bipush 1
      // 1b1: goto 1b5
      // 1b4: bipush 0
      // 1b5: ifeq 25c
      // 1b8: getstatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI Lkotlin/text/Regex;
      // 1bb: aload 5
      // 1bd: checkcast java/lang/CharSequence
      // 1c0: bipush 0
      // 1c1: bipush 2
      // 1c2: aconst_null
      // 1c3: invokestatic kotlin/text/Regex.find$default (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
      // 1c6: astore 6
      // 1c8: aload 6
      // 1ca: iload 2
      // 1cb: ifne 1da
      // 1ce: ifnull 25c
      // 1d1: goto 1d8
      // 1d4: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1d7: athrow
      // 1d8: aload 6
      // 1da: astore 7
      // 1dc: bipush 0
      // 1dd: istore 8
      // 1df: aload 3
      // 1e0: invokevirtual me/octo/client/lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll.f ()Ljava/util/List;
      // 1e3: checkcast java/lang/Iterable
      // 1e6: astore 9
      // 1e8: bipush 0
      // 1e9: istore 10
      // 1eb: aload 9
      // 1ed: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1f2: astore 11
      // 1f4: aload 11
      // 1f6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1fb: ifeq 23e
      // 1fe: aload 11
      // 200: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 205: astore 12
      // 207: aload 12
      // 209: checkcast me/octo/client/llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII
      // 20c: astore 13
      // 20e: bipush 0
      // 20f: istore 14
      // 211: aload 13
      // 213: invokevirtual me/octo/client/llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII.a ()Ljava/lang/String;
      // 216: aload 7
      // 218: invokeinterface kotlin/text/MatchResult.getGroupValues ()Ljava/util/List; 1
      // 21d: bipush 1
      // 21e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 223: checkcast java/lang/String
      // 226: checkcast java/lang/CharSequence
      // 229: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 22c: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 22f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 232: ifeq 1f4
      // 235: aload 12
      // 237: iload 2
      // 238: ifne 209
      // 23b: goto 23f
      // 23e: aconst_null
      // 23f: checkcast me/octo/client/llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII
      // 242: dup
      // 243: ifnonnull 24c
      // 246: pop
      // 247: return
      // 248: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 24b: athrow
      // 24c: astore 15
      // 24e: aload 0
      // 24f: getfield me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll Lme/octo/client/lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl;
      // 252: aload 15
      // 254: invokevirtual me/octo/client/llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII.b ()Ljava/lang/String;
      // 257: bipush 1
      // 258: invokevirtual me/octo/client/lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.b (Ljava/lang/String;I)V
      // 25b: return
      // 25c: return
   }

   @SubscribeEvent
   public final void a(@NotNull IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll param1) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "event");
      if (!this.G()) {
         return;
      }
      me.octo.client.lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll var3 = this.aL();
      if (var3 == null) {
         return;
      }
      if (!var3.c()) {
         return;
      }
      if (param1.m() != me.octo.client.events.impl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
         return;
      }
      double var4 = param1.k();
      if (var4 >= 200.0D && var4 <= 15000.0D) {
         this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.a((int)var4);
      }
   }

   public void aM() {
      boolean var1 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      if (var1) {
        if (this.aL() != null) {
          me.octo.client.lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
        }
        this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.g();
        this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.a();
        this.aD();
        me.octo.client.utils.IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.a(this.aj());
        me.octo.client.utils.IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.a(this.aj(), new java.util.function.BiConsumer<me.octo.client.utils.IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, java.lang.String>() {
          public void accept(me.octo.client.utils.IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1, java.lang.String var2) {
            me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.this, var1, var2);
          }
        });
        me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c();
        me.octo.client.utils.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(java.lang.System.currentTimeMillis());
        me.octo.client.utils.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(0);
        this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.n();
      }
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.o();
   }

   public void aN() {
      boolean flag = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      if (flag) {
         if (me.octo.client.lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI == this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll) {
            me.octo.client.lIIlllIIIIIllIIlIlIllllllIlIIlIlllIIlIllIIIIlIIllIlIlllIlIIlIIlIIllIlIIllIIIIlIlIIIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = null;
         }

         this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.g();
         this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.a();
         me.octo.client.utils.IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.b(this.aj());
         me.octo.client.IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d();
         me.octo.client.utils.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(0);
         me.octo.client.utils.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(-420L);
         me.octo.client.llIIlIlllIlIllIllIllIlIlIlllllIlllIIIIlIIllIIIlIllIlIlIlIIIIIIlllIlIlllIlllIllIlIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.c();
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.t();
         this.aO();
      }
   }

   public void aO() {
      boolean flag = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      boolean pre = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.d();
      if (flag) {
         if (!pre) {
            IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.k();
         }

         if (IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.c()) {
            IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII.q();
         }

         if (IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.c()) {
            IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.q();
         }
      }
   }

   @Override
   public void Q() {
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.c();
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.g();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.f();
      IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.f();
   }

   public final void a(
      @NotNull String var1, @NotNull me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2
   ) {
      short var10001 = 26745;
      short var10002 = -28410;
      Intrinsics.checkNotNullParameter(var1, "msg");
      var10001 = 26703;
      var10002 = -21625;
      Intrinsics.checkNotNullParameter(var2, "style");
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(5000L, this.aj(), var1, var2);
   }

   public final void aP() {
      short var10001 = 26726;
      short var10002 = -7516;
      this.a(
         "Missing: Etherwarp",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   public final void aQ() {
      short var10001 = 26714;
      short var10002 = 6100;
      this.a(
         "Missing: Aspect of the End",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   public final void b(@NotNull List<? extends IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> param1) {
      boolean var2 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "locations");
      List var3 = new java.util.ArrayList();
      for (Object var10 : param1) {
         var3.add(me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b((IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI) var10));
      }
      if (param1.size() == 2) {
         this.a("You're in the wrong starting area. Go to " + var3.get(0) + " or " + var3.get(1), me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      } else {
         this.a("You're in the wrong starting area. Go to " + var3.get(0), me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b(!var2);
      }
   }

   private static final void a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0) {
      var0.ah();
   }

   private static final void b(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0) {
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      var0.aO();
   }

   private static final long a(long var0) {
      return var0;
   }

   private static final boolean aR() {
      return true;
   }

   private static final long b(long var0) {
      return var0;
   }

   private static final boolean aS() {
      return true;
   }

   private static final boolean aT() {
      return true;
   }

   private static final long c(long var0) {
      return var0;
   }

   private static final boolean aU() {
      return true;
   }

   private static final llIllllIlIllIlIIIlIIIIlIlIIIIlIIIllIIIlIIlIIIllllIIIlIIIIlIlllllIIIlllIIllllIIllIIIlI a(Function0 var0, Function0 var1) {
      try {
         if ((Boolean)var0.invoke()) {
            return new llIllllIlIllIlIIIlIIIIlIlIIIIlIIIllIIIlIIlIIIllllIIIlIIIIlIlllllIIIlllIIllllIIllIIIlI(var1.invoke(), false, 2, null);
         }
      } catch (UnsupportedOperationException var2) {
         throw b(var2);
      }

      return llIllllIlIllIlIIIlIIIIlIlIIIIlIIIllIIIlIIlIIIllllIIIlIIIIlIlllllIIIlllIIllllIIllIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
   }

   private static final void c(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI param0) {
      boolean var1 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      try {
        Thread.sleep(2000L);
      } catch (InterruptedException var2) {
      }
      if (var1) {
        if (!param0.G()) {
          return;
        }
      }
      param0.a(param0.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.a(), param0.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.b());
   }

   private static final Unit d(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0) {
      var0.aH();
      return Unit.INSTANCE;
   }

   private static final void a(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI param0,
      String param1,
      me.octo.client.utils.IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param2
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d ()Z
      // 03: aload 0
      // 04: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.aj ()Ljava/lang/String;
      // 07: aload 1
      // 08: sipush 26731
      // 0b: sipush -29476
      // 0e: pop2
      // 0f: ldc_w "Macro Safety Status: "
      // 12: dup_x2
      // 13: pop
      // 14: ldc_w " "
      // 17: swap
      // 18: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 1d: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 20: istore 3
      // 21: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 24: ldc2_w 8000
      // 27: sipush 26732
      // 2a: sipush 11692
      // 2d: pop2
      // 2e: ldc_w "Macro Safety"
      // 31: aload 0
      // 32: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.aj ()Ljava/lang/String;
      // 35: aload 1
      // 36: sipush 26701
      // 39: sipush 27234
      // 3c: pop2
      // 3d: ldc_w " is now "
      // 40: swap
      // 41: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 46: aload 2
      // 47: getstatic me/octo/client/utils/IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 4a: if_acmpne 57
      // 4d: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 50: goto 5a
      // 53: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 56: athrow
      // 57: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 5a: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 5d: aload 0
      // 5e: invokevirtual me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.ap ()Lnet/minecraft/client/Minecraft;
      // 61: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 64: dup
      // 65: ifnull b5
      // 68: aload 2
      // 69: iload 3
      // 6a: ifne 97
      // 6d: goto 74
      // 70: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 73: athrow
      // 74: getstatic me/octo/client/utils/IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 77: if_acmpne 91
      // 7a: goto 81
      // 7d: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 80: athrow
      // 81: getstatic net/minecraft/sounds/SoundEvents.NOTE_BLOCK_BASS Lnet/minecraft/core/Holder$Reference;
      // 84: invokevirtual net/minecraft/core/Holder$Reference.value ()Ljava/lang/Object;
      // 87: checkcast net/minecraft/sounds/SoundEvent
      // 8a: goto 9a
      // 8d: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 90: athrow
      // 91: getstatic net/minecraft/sounds/SoundEvents.NOTE_BLOCK_PLING Lnet/minecraft/core/Holder$Reference;
      // 94: invokevirtual net/minecraft/core/Holder$Reference.value ()Ljava/lang/Object;
      // 97: checkcast net/minecraft/sounds/SoundEvent
      // 9a: fconst_1
      // 9b: aload 2
      // 9c: getstatic me/octo/client/utils/IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 9f: if_acmpne ac
      // a2: ldc_w 0.5
      // a5: goto af
      // a8: invokestatic me/octo/client/IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.b (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // ab: athrow
      // ac: ldc_w 1.5
      // af: invokevirtual net/minecraft/client/player/LocalPlayer.playSound (Lnet/minecraft/sounds/SoundEvent;FF)V
      // b2: goto b6
      // b5: pop
      // b6: return
   }

   private static final void a(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0,
      me.octo.client.utils.IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      String var2
   ) {
      var0.ap().execute(null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[70];
      int var3 = 0;
      String var2 = "»'Ú`µ,ïÝ>\u009d\u000b×Ë\u008bz°w\u008bþÚ(\u001b\u00156DO\f\u0007Þ\u0084\u0013ÂD=¶>f\u001a\u0099Ã°\u007f´g\u0006\\§¼)\u0095G\u000e!_ÕÊºQqõ\u0000;\u001eêE*\fXù\u0082»¾(³Í$\u009fáÍ\u000bÉ\\ËÁ,\u0013ÞR[\u0081F\u0004\u0019ÆnÁ\u0002ò\u008f#\u009dYã~M\u0003Ó:\u0094Älýó\u0016ô\u0084³\u0088\u0003\u0003\u0083JapÔ¬;\u0003\u008e¢\u009azõ\u0084ì\u0012\u009c b5L½¥\u001câùXî`Ofç\u0007\u0085\u001c\u001e²uA¹ÖèÉù¾\u0080c\u00162rWJ\u001a\u001döZÌ\u00032\u0090K±\u008b\u0014\u0012;ó\u0096ØEG³ \u0088\u0096\u008f\u0002÷ì\u00133\u008e\u0096¯\u0004î\u0099Y¿\u0005\u0005ú\u00022s\u0012l\b\u0014\u008dx\u0081\u0099$\u0095²Y]÷\tÍq\\¨\u0003+¬ÌXQæmÙ/\u0091\u000fú\u008fpØA2Ð&;\u0010ÝÍv¤\u009c¸2mS¸õÓUÊ¿jd\"r\u0002\u0097Yõ9f\u0001Ð\"W\u00937.ê\u00827<$W'\u0003\u0080+#Á~r§\u00995ÙìÀÿógZïF¢=ð\u0011\u008cÕ\u0086I)ÊfQÕ\u0006à☔\u0016D\u0007Ì\u0005ºn\u008dN»1Ï<¡¶H\u0082¬þ\u001b8\u0099ÄØW¨Y& \u0001d7¾ _\n²áqô0¸%1\u00ad§»Ü2H&÷ü¶\u0004zÎ\u0080\u001d\u0018\u009dé\u009c;±«@\u009an\u0080Úqf'õ¨\u0092P(\u001e\u0003,Ë§?\u0004\u009a(z¥\u008b\u009f±Yà´`\u0018vú$Ò|L§ønÚ\u000b\u0007p¦Ú\u0099\u0083ë\u009aÖq¢ÃËa'\u007fÞ:]kªØ\u0019ViKÆ¨\u0084·Ö¹ë\u0005½⅜>\u0015\u0088T\"Zeåq\u0019ℚ©\u0090Á·\u008f«9\u0018«Û↋rü¹[e³\u009d:VQïà\u0005·\u0082Ⅼï\u0097õþÖ5:ÜS\u009d\u0085\u0018\u0092E¢Õü\u0093?¶Ì\u00163\u0014ùþ±¸Á\u0006lÙ\u001cÅ\u0080\fee\u0095ÀSÔ\u0080¸{\u008cþî\u0005ÞÕy×\u001c-õk·tÀ\u0088×¶D'~¯\u009b¸âP ;m\u0000ÿ\u009a\nXö®Ô\u009cÖùç¨\u0082\\ãÄ\u001fÉ\u0014ïÖa\u0018ö1\u0004\u0084\u0096ÈË)ì\u0002\u0094^µ.\u001fè¤wø,ÃuKõ\u0091WY*f\u0098½\u00955iq» \u0090\\\u0081X\u0094Ó³<÷Ê;À\u0007ÔùESj°H\u0005çÁ&»Î\u0006[#\\¹\u0089U`rÞ\tÞ£q\u009eæ½ó\u009e1úÞ?ú3å©q(|)._Ðþ\u0085\u001b[Ó~I\\Fu\u008ewÈé\u000båG êY\u008aö\rÒæ0°ÄÆ;1\u0003mS\tpkfº\r½ëL\u001fb{hl\u0000Àåç;6Ð©\bQ5m\u008anH\n\u0019[\u0094\u0019S\u0085\u0004\u0081\u001eðP\u0006@\u0004zµé|X\u0000|G\u008ajû§·\u009aÙztfv¬ïAGç%áö\u0010\u007fxú\u001aÀ\u0087ó@k;þ\b!Gýñ¸,Ï£åvñ\u0019ã\u007fp¨dyNÿj\u0016)\u0089\u0016\u0095ØøsÈ¯ó¿\u0085\u0095[*OFä\u0097iV\u009bX\u0084\u001ccz\u008f\fù\u0098_\u0016J\u0085L2#¬¬ûºV\u0018ãû\u001c^Wq%ã¹.\u001bd\u0019\u00996¬\u0002~ðÚ-ÈÊç\u001f%ú£M¬\u008f\u0089ó|©RiFj¢!\u0096ôqwJ¥z\u0010UHÂÞ\u00991yÝMP1.%ÈùçÜ\u0001«Â¶¾XÂ.rç\u0093\u0096,6¥]%\u0007\u0019\u0099ü_]1®\bRí\u0013b\u009fD\u0092§\u000eT\u0090{3onË\u0012WÇôu\u0018Ù\u0005¤qþ\u0003b\u0007\u001e\u0005\u0013r\bÈ\u0002\t½Ð\u0012Jñ\u0016\u009d\u001e¹\u0014_Å\u0016¡Ó=iüÅ\"¨Ü\u001dFÀx\u009bqkÎ)\u001b\u008cj\u008fj\u0014ä¯Û\u009f\u00171>Öô\u0081fÙ§û¹¢FÒJ\u0081\u009e¦Ý3ãõ¯\u001a-bãÍ1|¿\u0004\u001b¢£Ç\r\bÿN\báN\u007fXlI¥±\u0092\u0007hOÝ;Ñá9<FÛ\u0090Jn\u001dh\r\u0083F\u008a\u000bº®äf¯Ç0\u0098\u0011!d¬\u0092Ìò¾\u0096Éô\u001a\u00adL\u0093\u0012\u001b7\u009d±É¾:\u008cÒ`ü\u009bÃ{4ú\u0080¥Ç$¢\u00adÏ$\u0011Y=Y\u0092\u008dËàî¹iéÛC×Yª+\b\u008f§î\u0014£/\u008eÒ\b\r³ÆpÅÙ.f\tÀ\u001c\u0081\u0019\u0011Üa\u0080¨\u001aq\u0018·\u008f\fÁ\u0017,D·da·\u0084Æ²C¯Dhq\u001ffa=+\u00140aÇª#\u0006òÎ¬\u009côë\u0091WúB\u001ap-\u001a\u00053C\u0014]$\té\t\u0092þ¸¦ãÛ\u0098\t¤d\u0018Ôöýþ\u0018#\u0013Ò\u0000\u009b\u0086¨\u0083\u0083~\u0082\u008a1\u000e*4\u008c±ú\u000f82\u0082\u0098Y\n\u0016GdMWI\u0086D\u001cw¹/»·\u0093×.ë\u0084à=ö\u009f.§ñÇ\u000b ¹û\u0092¦µêy\u0085'I}\u0002Ãê®Âû\bÏ(æå¢\u0011®\u0015\bÄ\u0005\u0014øwxÎ¨a\u0002ÕF\u0089\u0003oaºå\u0012û)eFÈ\u0094U\u001fà\bh\u00adKzo\u008d1A$nv\u0093\u0019\u009a(\u0093õ_\u0088\u009a»o±ÝÓP\u0090Ðâö<\u0001}óA¦4\u0092«\u0019\u0000/ý\u001a'¼\u009f$jw¼¹2\u0014é\u0086\u001amsþ\u0097←;À¬\u0000ÚG0ò\u0018MC~ðÌ¢\u0006EFÚýýu\u0005/È\u0081¤\u001c\u0015\u0099\u0097ÝdåãqðÊ\u008f§\u0094\u008arÌ`\u0014^IÅº\u000bUe?½\u0006\u00929ï=f6\t\u008c\u0004\b\u001a ¼G\u008cl\u001dÓ\u0011>µq\\í\u0085ø9Þ\u0084\u0092#\u000b\u000e\u009fIj\u0092ÙÓÏsõ¦\u0003RÅ*\u0003\u0018Ú\u0090]ñC\u009bAæ²\u0003ü\u0015mÞ÷\u009bÅ²Òµ8óÚ\u001c/µ\u0013í©W\u0019\u001dÚ±\u0013\u009c\u0094®á\u000e";
      int var4 = "»'Ú`µ,ïÝ>\u009d\u000b×Ë\u008bz°w\u008bþÚ(\u001b\u00156DO\f\u0007Þ\u0084\u0013ÂD=¶>f\u001a\u0099Ã°\u007f´g\u0006\\§¼)\u0095G\u000e!_ÕÊºQqõ\u0000;\u001eêE*\fXù\u0082»¾(³Í$\u009fáÍ\u000bÉ\\ËÁ,\u0013ÞR[\u0081F\u0004\u0019ÆnÁ\u0002ò\u008f#\u009dYã~M\u0003Ó:\u0094Älýó\u0016ô\u0084³\u0088\u0003\u0003\u0083JapÔ¬;\u0003\u008e¢\u009azõ\u0084ì\u0012\u009c b5L½¥\u001câùXî`Ofç\u0007\u0085\u001c\u001e²uA¹ÖèÉù¾\u0080c\u00162rWJ\u001a\u001döZÌ\u00032\u0090K±\u008b\u0014\u0012;ó\u0096ØEG³ \u0088\u0096\u008f\u0002÷ì\u00133\u008e\u0096¯\u0004î\u0099Y¿\u0005\u0005ú\u00022s\u0012l\b\u0014\u008dx\u0081\u0099$\u0095²Y]÷\tÍq\\¨\u0003+¬ÌXQæmÙ/\u0091\u000fú\u008fpØA2Ð&;\u0010ÝÍv¤\u009c¸2mS¸õÓUÊ¿jd\"r\u0002\u0097Yõ9f\u0001Ð\"W\u00937.ê\u00827<$W'\u0003\u0080+#Á~r§\u00995ÙìÀÿógZïF¢=ð\u0011\u008cÕ\u0086I)ÊfQÕ\u0006à☔\u0016D\u0007Ì\u0005ºn\u008dN»1Ï<¡¶H\u0082¬þ\u001b8\u0099ÄØW¨Y& \u0001d7¾ _\n²áqô0¸%1\u00ad§»Ü2H&÷ü¶\u0004zÎ\u0080\u001d\u0018\u009dé\u009c;±«@\u009an\u0080Úqf'õ¨\u0092P(\u001e\u0003,Ë§?\u0004\u009a(z¥\u008b\u009f±Yà´`\u0018vú$Ò|L§ønÚ\u000b\u0007p¦Ú\u0099\u0083ë\u009aÖq¢ÃËa'\u007fÞ:]kªØ\u0019ViKÆ¨\u0084·Ö¹ë\u0005½⅜>\u0015\u0088T\"Zeåq\u0019ℚ©\u0090Á·\u008f«9\u0018«Û↋rü¹[e³\u009d:VQïà\u0005·\u0082Ⅼï\u0097õþÖ5:ÜS\u009d\u0085\u0018\u0092E¢Õü\u0093?¶Ì\u00163\u0014ùþ±¸Á\u0006lÙ\u001cÅ\u0080\fee\u0095ÀSÔ\u0080¸{\u008cþî\u0005ÞÕy×\u001c-õk·tÀ\u0088×¶D'~¯\u009b¸âP ;m\u0000ÿ\u009a\nXö®Ô\u009cÖùç¨\u0082\\ãÄ\u001fÉ\u0014ïÖa\u0018ö1\u0004\u0084\u0096ÈË)ì\u0002\u0094^µ.\u001fè¤wø,ÃuKõ\u0091WY*f\u0098½\u00955iq» \u0090\\\u0081X\u0094Ó³<÷Ê;À\u0007ÔùESj°H\u0005çÁ&»Î\u0006[#\\¹\u0089U`rÞ\tÞ£q\u009eæ½ó\u009e1úÞ?ú3å©q(|)._Ðþ\u0085\u001b[Ó~I\\Fu\u008ewÈé\u000båG êY\u008aö\rÒæ0°ÄÆ;1\u0003mS\tpkfº\r½ëL\u001fb{hl\u0000Àåç;6Ð©\bQ5m\u008anH\n\u0019[\u0094\u0019S\u0085\u0004\u0081\u001eðP\u0006@\u0004zµé|X\u0000|G\u008ajû§·\u009aÙztfv¬ïAGç%áö\u0010\u007fxú\u001aÀ\u0087ó@k;þ\b!Gýñ¸,Ï£åvñ\u0019ã\u007fp¨dyNÿj\u0016)\u0089\u0016\u0095ØøsÈ¯ó¿\u0085\u0095[*OFä\u0097iV\u009bX\u0084\u001ccz\u008f\fù\u0098_\u0016J\u0085L2#¬¬ûºV\u0018ãû\u001c^Wq%ã¹.\u001bd\u0019\u00996¬\u0002~ðÚ-ÈÊç\u001f%ú£M¬\u008f\u0089ó|©RiFj¢!\u0096ôqwJ¥z\u0010UHÂÞ\u00991yÝMP1.%ÈùçÜ\u0001«Â¶¾XÂ.rç\u0093\u0096,6¥]%\u0007\u0019\u0099ü_]1®\bRí\u0013b\u009fD\u0092§\u000eT\u0090{3onË\u0012WÇôu\u0018Ù\u0005¤qþ\u0003b\u0007\u001e\u0005\u0013r\bÈ\u0002\t½Ð\u0012Jñ\u0016\u009d\u001e¹\u0014_Å\u0016¡Ó=iüÅ\"¨Ü\u001dFÀx\u009bqkÎ)\u001b\u008cj\u008fj\u0014ä¯Û\u009f\u00171>Öô\u0081fÙ§û¹¢FÒJ\u0081\u009e¦Ý3ãõ¯\u001a-bãÍ1|¿\u0004\u001b¢£Ç\r\bÿN\báN\u007fXlI¥±\u0092\u0007hOÝ;Ñá9<FÛ\u0090Jn\u001dh\r\u0083F\u008a\u000bº®äf¯Ç0\u0098\u0011!d¬\u0092Ìò¾\u0096Éô\u001a\u00adL\u0093\u0012\u001b7\u009d±É¾:\u008cÒ`ü\u009bÃ{4ú\u0080¥Ç$¢\u00adÏ$\u0011Y=Y\u0092\u008dËàî¹iéÛC×Yª+\b\u008f§î\u0014£/\u008eÒ\b\r³ÆpÅÙ.f\tÀ\u001c\u0081\u0019\u0011Üa\u0080¨\u001aq\u0018·\u008f\fÁ\u0017,D·da·\u0084Æ²C¯Dhq\u001ffa=+\u00140aÇª#\u0006òÎ¬\u009côë\u0091WúB\u001ap-\u001a\u00053C\u0014]$\té\t\u0092þ¸¦ãÛ\u0098\t¤d\u0018Ôöýþ\u0018#\u0013Ò\u0000\u009b\u0086¨\u0083\u0083~\u0082\u008a1\u000e*4\u008c±ú\u000f82\u0082\u0098Y\n\u0016GdMWI\u0086D\u001cw¹/»·\u0093×.ë\u0084à=ö\u009f.§ñÇ\u000b ¹û\u0092¦µêy\u0085'I}\u0002Ãê®Âû\bÏ(æå¢\u0011®\u0015\bÄ\u0005\u0014øwxÎ¨a\u0002ÕF\u0089\u0003oaºå\u0012û)eFÈ\u0094U\u001fà\bh\u00adKzo\u008d1A$nv\u0093\u0019\u009a(\u0093õ_\u0088\u009a»o±ÝÓP\u0090Ðâö<\u0001}óA¦4\u0092«\u0019\u0000/ý\u001a'¼\u009f$jw¼¹2\u0014é\u0086\u001amsþ\u0097←;À¬\u0000ÚG0ò\u0018MC~ðÌ¢\u0006EFÚýýu\u0005/È\u0081¤\u001c\u0015\u0099\u0097ÝdåãqðÊ\u008f§\u0094\u008arÌ`\u0014^IÅº\u000bUe?½\u0006\u00929ï=f6\t\u008c\u0004\b\u001a ¼G\u008cl\u001dÓ\u0011>µq\\í\u0085ø9Þ\u0084\u0092#\u000b\u000e\u009fIj\u0092ÙÓÏsõ¦\u0003RÅ*\u0003\u0018Ú\u0090]ñC\u009bAæ²\u0003ü\u0015mÞ÷\u009bÅ²Òµ8óÚ\u001c/µ\u0013í©W\u0019\u001dÚ±\u0013\u009c\u0094®á\u000e"
         .length();
      b(37);
      char var1 = '\n';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 63;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var27 = var10001.toCharArray();
               int var10004 = var27.length;
               int var6 = 0;
               byte var30 = var10000;
               var20 = var27;
               int var14 = var10004;
               byte var38;
               char[] var42;
               int var10006;
               if (var10004 <= 1) {
                  var42 = var27;
                  var38 = var10000;
                  var10006 = var6;
               } else {
                  var30 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var42 = var27;
                  var38 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var42[var10006] = (char)(var42[var10006] ^ var38 ^ switch (var6 % 7) {
                     case 0 -> 55;
                     case 1 -> 57;
                     case 2 -> 48;
                     case 3 -> 68;
                     case 4 -> 80;
                     case 5 -> 19;
                     default -> 103;
                  });
                  var6++;
                  if (var30 == 0) {
                     var10006 = var30;
                     var42 = var20;
                     var38 = var30;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var42 = var20;
                     var38 = var30;
                     var10006 = var6;
                  }
               }
            }

            String var32 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var32;
                  if ((var8 += var1) >= var4) {
                     f = var5;
                     g = new String[70];
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     var10002 = 26667;
                     short var33 = 29349;
                     IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = new Regex("RARE DROP! (.+?)(?: \\(.*\\))?$");
                     var10002 = 26666;
                     short var34 = 30301;
                     lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = new Regex(
                        "materialized ([\\d,]+) coins from the mists"
                     );
                     var10002 = 26737;
                     short var35 = 19694;
                     lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = new Regex(
                        "You caught(?: an?)?(?: x(\\d+))? (.+) Shards?!"
                     );
                     IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
                     IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = new IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll();
                     IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = new llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl();
                     IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = new llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll();
                     IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = new lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl();
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var32;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u000fe6<Å\b\u008a\u001c\u0081µ\u0086ö9\r";
                  var4 = "\u000fe6<Å\b\u008a\u001c\u0081µ\u0086ö9\r".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 58;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void b(int var0) {
      lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = var0;
   }

   public static int a3() {
      return lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   }

   public static int a4() {
      int var0 = a3();

      try {
         return var0 == 0 ? 15 : 0;
      } catch (UnsupportedOperationException var1) {
         throw b(var1);
      }
   }

   private static UnsupportedOperationException b(UnsupportedOperationException var0) {
      return var0;
   }

   private static String d(int var0, int var1) {
      int var2 = (var0 ^ 26729) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 240;
            case 1 -> 213;
            case 2 -> 73;
            case 3 -> 234;
            case 4 -> 157;
            case 5 -> 233;
            case 6 -> 96;
            case 7 -> 38;
            case 8 -> 43;
            case 9 -> 50;
            case 10 -> 66;
            case 11 -> 247;
            case 12 -> 20;
            case 13 -> 152;
            case 14 -> 10;
            case 15 -> 165;
            case 16 -> 49;
            case 17 -> 221;
            case 18 -> 19;
            case 19 -> 255;
            case 20 -> 252;
            case 21 -> 29;
            case 22 -> 0;
            case 23 -> 225;
            case 24 -> 177;
            case 25 -> 179;
            case 26 -> 14;
            case 27 -> 52;
            case 28 -> 106;
            case 29 -> 220;
            case 30 -> 133;
            case 31 -> 223;
            case 32 -> 32;
            case 33 -> 45;
            case 34 -> 64;
            case 35 -> 184;
            case 36 -> 39;
            case 37 -> 148;
            case 38 -> 215;
            case 39 -> 54;
            case 40 -> 102;
            case 41 -> 80;
            case 42 -> 235;
            case 43 -> 118;
            case 44 -> 97;
            case 45 -> 191;
            case 46 -> 244;
            case 47 -> 174;
            case 48 -> 144;
            case 49 -> 200;
            case 50 -> 86;
            case 51 -> 183;
            case 52 -> 98;
            case 53 -> 40;
            case 54 -> 135;
            case 55 -> 132;
            case 56 -> 204;
            case 57 -> 33;
            case 58 -> 242;
            case 59 -> 196;
            case 60 -> 151;
            case 61 -> 99;
            case 62 -> 105;
            case 63 -> 31;
            case 64 -> 107;
            case 65 -> 185;
            case 66 -> 226;
            case 67 -> 63;
            case 68 -> 202;
            case 69 -> 231;
            case 70 -> 103;
            case 71 -> 2;
            case 72 -> 57;
            case 73 -> 100;
            case 74 -> 190;
            case 75 -> 104;
            case 76 -> 137;
            case 77 -> 161;
            case 78 -> 72;
            case 79 -> 76;
            case 80 -> 143;
            case 81 -> 36;
            case 82 -> 112;
            case 83 -> 198;
            case 84 -> 25;
            case 85 -> 206;
            case 86 -> 115;
            case 87 -> 59;
            case 88 -> 153;
            case 89 -> 163;
            case 90 -> 232;
            case 91 -> 61;
            case 92 -> 24;
            case 93 -> 201;
            case 94 -> 158;
            case 95 -> 5;
            case 96 -> 224;
            case 97 -> 193;
            case 98 -> 101;
            case 99 -> 37;
            case 100 -> 123;
            case 101 -> 87;
            case 102 -> 56;
            case 103 -> 15;
            case 104 -> 58;
            case 105 -> 166;
            case 106 -> 162;
            case 107 -> 141;
            case 108 -> 22;
            case 109 -> 178;
            case 110 -> 175;
            case 111 -> 114;
            case 112 -> 149;
            case 113 -> 139;
            case 114 -> 62;
            case 115 -> 217;
            case 116 -> 85;
            case 117 -> 124;
            case 118 -> 4;
            case 119 -> 90;
            case 120 -> 109;
            case 121 -> 160;
            case 122 -> 236;
            case 123 -> 13;
            case 124 -> 69;
            case 125 -> 42;
            case 126 -> 254;
            case 127 -> 71;
            case 128 -> 125;
            case 129 -> 111;
            case 130 -> 197;
            case 131 -> 84;
            case 132 -> 164;
            case 133 -> 180;
            case 134 -> 117;
            case 135 -> 136;
            case 136 -> 12;
            case 137 -> 110;
            case 138 -> 44;
            case 139 -> 145;
            case 140 -> 211;
            case 141 -> 18;
            case 142 -> 51;
            case 143 -> 199;
            case 144 -> 251;
            case 145 -> 228;
            case 146 -> 238;
            case 147 -> 194;
            case 148 -> 172;
            case 149 -> 173;
            case 150 -> 222;
            case 151 -> 120;
            case 152 -> 94;
            case 153 -> 26;
            case 154 -> 113;
            case 155 -> 122;
            case 156 -> 249;
            case 157 -> 237;
            case 158 -> 188;
            case 159 -> 9;
            case 160 -> 208;
            case 161 -> 68;
            case 162 -> 8;
            case 163 -> 230;
            case 164 -> 126;
            case 165 -> 1;
            case 166 -> 6;
            case 167 -> 186;
            case 168 -> 205;
            case 169 -> 210;
            case 170 -> 253;
            case 171 -> 195;
            case 172 -> 168;
            case 173 -> 7;
            case 174 -> 55;
            case 175 -> 34;
            case 176 -> 171;
            case 177 -> 23;
            case 178 -> 17;
            case 179 -> 134;
            case 180 -> 218;
            case 181 -> 88;
            case 182 -> 78;
            case 183 -> 207;
            case 184 -> 169;
            case 185 -> 119;
            case 186 -> 128;
            case 187 -> 250;
            case 188 -> 108;
            case 189 -> 81;
            case 190 -> 146;
            case 191 -> 155;
            case 192 -> 48;
            case 193 -> 156;
            case 194 -> 41;
            case 195 -> 176;
            case 196 -> 46;
            case 197 -> 243;
            case 198 -> 245;
            case 199 -> 182;
            case 200 -> 27;
            case 201 -> 60;
            case 202 -> 214;
            case 203 -> 159;
            case 204 -> 67;
            case 205 -> 219;
            case 206 -> 187;
            case 207 -> 35;
            case 208 -> 129;
            case 209 -> 127;
            case 210 -> 227;
            case 211 -> 79;
            case 212 -> 138;
            case 213 -> 130;
            case 214 -> 239;
            case 215 -> 65;
            case 216 -> 70;
            case 217 -> 92;
            case 218 -> 154;
            case 219 -> 28;
            case 220 -> 89;
            case 221 -> 212;
            case 222 -> 82;
            case 223 -> 77;
            case 224 -> 203;
            case 225 -> 3;
            case 226 -> 248;
            case 227 -> 121;
            case 228 -> 91;
            case 229 -> 209;
            case 230 -> 189;
            case 231 -> 246;
            case 232 -> 241;
            case 233 -> 181;
            case 234 -> 192;
            case 235 -> 21;
            case 236 -> 116;
            case 237 -> 93;
            case 238 -> 75;
            case 239 -> 150;
            case 240 -> 229;
            case 241 -> 11;
            case 242 -> 167;
            case 243 -> 140;
            case 244 -> 47;
            case 245 -> 30;
            case 246 -> 83;
            case 247 -> 16;
            case 248 -> 53;
            case 249 -> 142;
            case 250 -> 170;
            case 251 -> 216;
            case 252 -> 147;
            case 253 -> 74;
            case 254 -> 131;
            default -> 95;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static enum IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl,
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl,
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI,
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll,
      llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl,
      lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll,
      IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll,
      IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII,
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll,
      llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII,
      IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll,
      IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI,
      lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI,
      lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI,
      IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl,
      IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI,
      IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI,
      IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII,
      IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII,
      lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII,
      lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI,
      lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI,
      IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll,
      llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll,
      llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll,
      IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII,
      llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl,
      lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl,
      IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   

      private static boolean lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;

      public static IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] a() {
         return (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[])lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.clone();
      }

      public static IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         String var0
      ) {
         return Enum.valueOf(
            IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> b() {
         return llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII, llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll, IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl, llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl, IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI, IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll, lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll, llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll, IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll, IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII, IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll, llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI, lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII, IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll, IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI, lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI, lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI, IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl, IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI, IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI, IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII, IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII, lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII, lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI, lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI, IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll, llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll, llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll, IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII, llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl, lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl, IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI};
   private static final EnumEntries<IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = kotlin.enums.EnumEntriesKt.enumEntries(lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII);

      public static void b(boolean var0) {
         lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var0;
      }

      public static boolean d() {
         return lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
      }

      public static boolean e() {
         boolean var0 = d();
         return !var0;
      }
       private static final me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] c() {
           me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var0 = new me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[49];
           var0[0] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
           var0[1] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
           var0[2] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
           var0[3] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
           var0[4] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
           var0[5] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
           var0[6] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
           var0[7] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
           var0[8] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
           var0[9] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
           var0[10] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
           var0[11] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
           var0[12] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
           var0[13] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
           var0[14] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
           var0[15] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
           var0[16] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
           var0[17] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
           var0[18] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
           var0[19] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
           var0[20] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
           var0[21] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
           var0[22] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
           var0[23] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
           var0[24] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
           var0[25] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
           var0[26] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
           var0[27] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
           var0[28] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
           var0[29] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
           var0[30] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
           var0[31] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
           var0[32] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
           var0[33] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
           var0[34] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
           var0[35] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
           var0[36] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
           var0[37] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
           var0[38] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
           var0[39] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
           var0[40] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
           var0[41] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
           var0[42] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
           var0[43] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
           var0[44] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
           var0[45] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
           var0[46] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
           var0[47] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
           var0[48] = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
           return var0;
       }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      public static Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX missing field
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final Regex a() {
         return IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
      }

      @NotNull
      public final Regex b() {
         return IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
      }

      @NotNull
      public final Regex c() {
         return IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
      }

      @NotNull
      public final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI d() {
         return IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
      }

      @NotNull
      public final IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll e() {
         return IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      }

      @NotNull
      public final llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl f() {
         return IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
      }

      @NotNull
      public final llIIIIlIIIIIIlllIIlIIIIIIlIIIlIIllIlllIlIIIlllIlIIIllIlIIIllIlIlIIlIIlIIIlIlIIllllIll g() {
         return IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
      }

      @NotNull
      public final lIlIIlIlIllIlIllIlIIlIIlllIlIIIllllllIIllIlIIIIIllIlIIllIlllllIlIIIlIllIIIlIllIllIIIl h() {
         return IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
      }
       public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }
   public static void a(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0,
      String var1,
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      Function0 var3,
      long var4,
      boolean var6,
      boolean var7,
      Function0 var8,
      Function1 var9,
      int var10,
      Object var11
   ) {
      if (var11 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addStuckCheck");
      }

      if ((var10 & 8) != 0) {
         var4 = 3000L;
      }

      if ((var10 & 16) != 0) {
         var6 = false;
      }

      if ((var10 & 32) != 0) {
         var7 = true;
      }

      var0.a(var1, var2, var3, var4, var6, var7, var8, var9);
   }

   public static void a(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0,
      String var1,
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      long var3,
      long var5,
      boolean var7,
      boolean var8,
      Function0 var9,
      Function1 var10,
      int var11,
      Object var12
   ) {
      boolean var13 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      if (var12 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addStuckCheck");
      }

      if (!var13 && (var11 & 8) != 0) {
         var5 = 3000L;
      }

      if (!var13 && (var11 & 16) != 0) {
         var7 = false;
      }

      if (!var13 && (var11 & 32) != 0) {
         var8 = true;
      }

      var0.a(var1, var2, var3, var5, var7, var8, var9, var10);
   }

   public static void a(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0,
      String var1,
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      long var3,
      long var5,
      Function0 var7,
      boolean var8,
      boolean var9,
      Function0 var10,
      Function1 var11,
      int var12,
      Object var13
   ) {
      boolean var14 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      if (var13 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addStuckCheck");
      }

      if (!var14 && (var12 & 8) != 0) {
         var5 = 3000L;
      }

      if (!var14 && (var12 & 32) != 0) {
         var8 = false;
      }

      if (!var14 && (var12 & 64) != 0) {
         var9 = true;
      }

      var0.a(var1, var2, var3, var5, var7, var8, var9, var10, var11);
   }

   public static void a(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0,
      String var1,
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      Function0 var3,
      long var4,
      Function0 var6,
      boolean var7,
      boolean var8,
      Function0 var9,
      Function1 var10,
      int var11,
      Object var12
   ) {
      if (var12 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addStuckCheck");
      }

      if ((var11 & 8) != 0) {
         var4 = 3000L;
      }

      if ((var11 & 32) != 0) {
         var7 = false;
      }

      if ((var11 & 64) != 0) {
         var8 = true;
      }

      var0.a(var1, var2, var3, var4, var6, var7, var8, var9, var10);
   }

   public static void a(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0,
      String var1,
      Set var2,
      long var3,
      long var5,
      Function0 var7,
      boolean var8,
      boolean var9,
      Function0 var10,
      Function1 var11,
      int var12,
      Object var13
   ) {
      if (var13 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addStuckCheck");
      }

      if ((var12 & 8) != 0) {
         var5 = 3000L;
      }

      if ((var12 & 16) != 0) {
         var7 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI::aT;
      }

      if ((var12 & 32) != 0) {
         var8 = false;
      }

      if ((var12 & 64) != 0) {
         var9 = true;
      }

      var0.a(var1, var2, var3, var5, var7, var8, var9, var10, var11);
   }

   public static void a(
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0,
      String var1,
      Set var2,
      Function0 var3,
      long var4,
      Function0 var6,
      boolean var7,
      boolean var8,
      Function0 var9,
      Function1 var10,
      int var11,
      Object var12
   ) {
      if (var12 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addStuckCheck");
      }

      if ((var11 & 8) != 0) {
         var4 = 3000L;
      }

      if ((var11 & 16) != 0) {
         var6 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI::aU;
      }

      if ((var11 & 32) != 0) {
         var7 = false;
      }

      if ((var11 & 64) != 0) {
         var8 = true;
      }

      var0.a(var1, var2, var3, var4, var6, var7, var8, var9, var10);
   }

   public static Triple a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0, double var1, int var3, Object var4) {
      if (var4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: coarsePlayerPosition");
      }

      if ((var3 & 1) != 0) {
         var1 = 2.0;
      }

      return var0.a(var1);
   }

   static void a(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var0, String var1, boolean var2, int var3, Object var4) {
      if (var4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopFromSystemMessage");
      }

      if ((var3 & 2) != 0) {
         var2 = false;
      }

      var0.a(var1, var2);
   }

}
