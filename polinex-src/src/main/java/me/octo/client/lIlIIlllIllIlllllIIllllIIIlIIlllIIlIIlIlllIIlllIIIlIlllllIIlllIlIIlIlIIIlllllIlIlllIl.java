package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.player.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl
   extends lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl {
    public static <T> T e(Object p0) { return null; } // PX-FIX mr4
    public static <T> T b(Object p0) { return null; } // PX-FIX mr4
    public static <T> T h(Object p0) { return null; } // PX-FIX mr3
    public static <T> T g(Object p0) { return null; } // PX-FIX mr3

   public Object receiver; // PX-FIX kotlin lambda receiver

   @NotNull
   public static lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private int IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private int lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   private final Pattern llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   private boolean lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   @NotNull
   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private int lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private static lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private static String[] j;
   private static String[] k;

   public lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl() {
      short var10001 = -12016;
      short var10002 = 3204;
      var10002 = -12002;
      short var10003 = 17163;
      me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var9 = me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      short var10004 = -12003;
      short var10005 = 5990;
      String[] var1 = new String[3];
      short var10007 = -12019;
      short var10008 = 10494;
      var1[0] = "This macro kills zealots in the End";
      var10007 = -12011;
      var10008 = -8022;
      var1[1] = "Automatically prioritizes special zealots holding end frames";
      var10007 = -12021;
      var10008 = 25140;
      var1[2] = "Uses CombatBot for intelligent targeting and pathfinding";
      List var10 = CollectionsKt.listOf(var1);
      var1 = new String[3];
      var10008 = -12020;
      short var10009 = -5787;
      var1[0] = "Make sure you have a good combat pet";
      var10008 = -12029;
      var10009 = -29237;
      var1[1] = "Use a strong melee weapon";
      var10008 = -12032;
      var10009 = -7733;
      var1[2] = "Etherwarp recommended for movement";
      List var10006 = CollectionsKt.listOf(var1);
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var3 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIlIlIlIIllIIIlIIlllIIlIIllllllIlIlllIIlIllllIIlIllIlIllIIllIllllIIlIIIlllIIIllIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         IIlIlIlIIllIIIlIIlllIIlIIllllllIlIlllIIlIllllIIlIllIlIllIIllIllllIIlIIIlllIIIllIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         IIlIlIlIIllIIIlIIlllIIlIIllllllIlIlllIIlIllllIIlIllIlIllIIllIllllIIlIIIlllIIIllIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         IIlIlIlIIllIIIlIIlllIIlIIllllllIlIlllIIlIllllIIlIllIlIllIIllIllllIIlIIIlllIIIllIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d()
      };
      super("Zealot Macro", "Kills Zealots in the Dragon's Nest with special zealot prioritization.", var9, "Dragon's Nest", var10, var10006, true, var3);
      var10001 = -12023;
      var10002 = -9224;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = Pattern.compile(
         "^\\s{20}(PROTECTOR|OLD|STRONG|SUPERIOR|WISE|UNSTABLE|YOUNG) DRAGON DOWN!$"
      );
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var4 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-537, 100, -269),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-554, 64, -263),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-548, 19, -268),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-578, 22, -273),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-630, 14, -276),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-641, 4, -272),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         )
      };
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = CollectionsKt.arrayListOf(var4);
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[] var5 = new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll[]{
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-559, 83, -227),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         ),
         new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(
            new BlockPos(-638, 4, -272),
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         )
      };
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = CollectionsKt.arrayListOf(var5);
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new ArrayList<>();
   }

   @NotNull
   @Override
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      short var10009 = -12031;
      short var10010 = 21675;
      var10010 = -12001;
      short var10011 = -13237;
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(
         true,
         true,
         true,
         false,
         true,
         CollectionsKt.listOf(new llIIIlIIIlllIIlIIlllIIlIIlIllIlIIlIIIIllllllIllIIIIlIllllIIIlIIlIlIIlIlIIIIIIIIlIlIII("Summoning Eye", "SUMMONING_EYE")),
         8,
         null
      );
   }

   public final int bd() {
      return this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   }

   public final void c(int var1) {
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var1;
   }

   public final int be() {
      return this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   }

   public final void d(int var1) {
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var1;
   }

   @SubscribeEvent
   public final void c(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      Object var9 = null; // PX-FIX
      String var2 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var10000 = var1;
      if (var2 != null) {
         short var10001 = -12005;
         short var10002 = 23694;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (!this.G()) {
            return;
         }

         var10000 = var1;
      }

      Packet var3 = var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Packet var6 = var3;
      if (var2 != null) {
         if (!(var3 instanceof ClientboundSystemChatPacket)) {
            return;
         }

         var6 = var3;
      }

      String var7 = ((ClientboundSystemChatPacket)var6).content().getString();
      short var13 = -12012;
      short var10003 = -12918;
      Intrinsics.checkNotNullExpressionValue(var7, "getString(...)");
      String var4 = var7;
      short var11 = -12024;
      var13 = -15379;
      boolean var8 = StringsKt.startsWith(var4, "RARE DROP! Summoning Eye", false);
      if (var2 != null) {
         if (var8) {
            int var5 = this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI++;
            return;
         }

         var8 = IIlIlIlIIllIIIlIIlllIIlIIllllllIlIlllIIlIllllIIlIllIlIllIIllIllllIIlIIIlllIIIllIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d()
            .al();
      }

      label50: {
         if (var2 != null) {
            if (!var8) {
               return;
            }

            var9 = this;
            if (var2 == null) {
               break label50;
            }

            var8 = this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI.matcher(var4).matches();
         }

         if (!var8) {
            return;
         }

         short var10 = -12018;
         var11 = -5962;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§eDragon died! Checking for special zealots..."
         );
         var9 = this;
      }

      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = true;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1) {
      Entity var10 = null; // PX-FIX
      String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      short var10002 = -12022;
      short var10003 = 31420;
      Intrinsics.checkNotNullParameter(var1, "event");
      String var2 = var10000;
      lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var7 = this;
      if (var2 != null) {
         if (!this.G()) {
            return;
         }

         var7 = this;
      }

      ClientLevel var8 = var7.ap().level;
      if (var8 != null) {
         Entity var9 = var8.getEntity(var1.l());
         if (var9 != null) {
            Entity var3 = var9;
            boolean var4 = false;
            if (var2 != null && !var3.isAlive()) {
               var10 = var3;
               label42:
               if (var2 != null) {
                  if (var3 instanceof EnderMan) {
                     LocalPlayer var5 = this.ap().player;
                     var10 = var5;
                     if (var2 == null) {
                        break label42;
                     }

                     label38:
                     if (var5 != null) {
                        double var12;
                        int var11 = (
                                 var12 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                       .b(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var3), true)
                                    - 8.0
                              )
                              == 0.0
                           ? 0
                           : (var12 < 0.0 ? -1 : 1);
                        if (var2 != null) {
                           if (var11 >= 0) {
                              break label38;
                           }

                           var11 = this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
                        }

                        int var6 = var11;
                        this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var6 + 1;
                     }
                  }

                  var10 = var3;
               }

               var10.remove(RemovalReason.DISCARDED);
            }
         }
      }
   }

   @Override
   protected void aD() {
      Object receiver = null; // PX-FIX
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI var10000 = this;
      short var10001 = -12028;
      short var10002 = 27004;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Zealot travel",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         null,
         5000L,
         false,
         false,
         (kotlin.jvm.functions.Function1)(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl::b),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = -19113;
                  short var10005 = -20100;
                  var10005 = -19115;
                  short var10006 = 29958;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001x = -19116;
                  short var10002x = -11794;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "ð\u0014\u0097Ð¸\u0084\u008cYß\f¢\u0091\u0096\u009cû4MÚf\bL\u008b\u0011Z¯®3\u0014¥Ú²\nnÞ^=ù)ì-§-\u009d²\u0099!\u009fºß\u009amÝÚ³ÅÛPÈ ï\u008dc9¡\u0015\u009fqz1âÎÊÖ\u000bÒ[÷\u0002hOzáô´÷¤ÔG\u0013÷ê\u0016JÍ>±|\u009bæåöîWçG°[\u0098¸\u001b-ÎÌj\u0096»Úéö\u0082(Ø\u0002ðá\u00114\n\u000f\u0013«üîV\u0093í+\u00ad§\u001bÝÄ\u0089";
                  int var4 = "ð\u0014\u0097Ð¸\u0084\u008cYß\f¢\u0091\u0096\u009cû4MÚf\bL\u008b\u0011Z¯®3\u0014¥Ú²\nnÞ^=ù)ì-§-\u009d²\u0099!\u009fºß\u009amÝÚ³ÅÛPÈ ï\u008dc9¡\u0015\u009fqz1âÎÊÖ\u000bÒ[÷\u0002hOzáô´÷¤ÔG\u0013÷ê\u0016JÍ>±|\u009bæåöîWçG°[\u0098¸\u001b-ÎÌj\u0096»Úéö\u0082(Ø\u0002ðá\u00114\n\u000f\u0013«üîV\u0093í+\u00ad§\u001bÝÄ\u0089"
                     .length();
                  char var1 = 'z';
                  int var0 = -1;

                  while (true) {
                     char[] var10002x;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 97;
                        var10002x = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 97;
                           var10006 = var6;
                        } else {
                           var13 = 97;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 97;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 6;
                              case 1 -> 122;
                              case 2 -> 15;
                              case 3 -> 121;
                              case 4 -> 41;
                              case 5 -> 113;
                              default -> 72;
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
                  int var2 = (var0 ^ -19115) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 133;
                        case 1 -> 201;
                        case 2 -> 82;
                        case 3 -> 93;
                        case 4 -> 32;
                        case 5 -> 110;
                        case 6 -> 2;
                        case 7 -> 234;
                        case 8 -> 128;
                        case 9 -> 204;
                        case 10 -> 30;
                        case 11 -> 40;
                        case 12 -> 126;
                        case 13 -> 80;
                        case 14 -> 66;
                        case 15 -> 43;
                        case 16 -> 75;
                        case 17 -> 36;
                        case 18 -> 73;
                        case 19 -> 96;
                        case 20 -> 39;
                        case 21 -> 91;
                        case 22 -> 62;
                        case 23 -> 84;
                        case 24 -> 226;
                        case 25 -> 240;
                        case 26 -> 168;
                        case 27 -> 199;
                        case 28 -> 147;
                        case 29 -> 119;
                        case 30 -> 231;
                        case 31 -> 71;
                        case 32 -> 102;
                        case 33 -> 206;
                        case 34 -> 159;
                        case 35 -> 33;
                        case 36 -> 232;
                        case 37 -> 118;
                        case 38 -> 170;
                        case 39 -> 107;
                        case 40 -> 247;
                        case 41 -> 250;
                        case 42 -> 63;
                        case 43 -> 134;
                        case 44 -> 173;
                        case 45 -> 253;
                        case 46 -> 169;
                        case 47 -> 189;
                        case 48 -> 69;
                        case 49 -> 138;
                        case 50 -> 28;
                        case 51 -> 135;
                        case 52 -> 193;
                        case 53 -> 215;
                        case 54 -> 131;
                        case 55 -> 25;
                        case 56 -> 8;
                        case 57 -> 218;
                        case 58 -> 241;
                        case 59 -> 137;
                        case 60 -> 9;
                        case 61 -> 171;
                        case 62 -> 6;
                        case 63 -> 208;
                        case 64 -> 156;
                        case 65 -> 182;
                        case 66 -> 124;
                        case 67 -> 15;
                        case 68 -> 251;
                        case 69 -> 209;
                        case 70 -> 52;
                        case 71 -> 152;
                        case 72 -> 195;
                        case 73 -> 74;
                        case 74 -> 48;
                        case 75 -> 222;
                        case 76 -> 151;
                        case 77 -> 116;
                        case 78 -> 51;
                        case 79 -> 255;
                        case 80 -> 64;
                        case 81 -> 248;
                        case 82 -> 27;
                        case 83 -> 65;
                        case 84 -> 20;
                        case 85 -> 130;
                        case 86 -> 42;
                        case 87 -> 216;
                        case 88 -> 29;
                        case 89 -> 46;
                        case 90 -> 54;
                        case 91 -> 243;
                        case 92 -> 58;
                        case 93 -> 242;
                        case 94 -> 35;
                        case 95 -> 50;
                        case 96 -> 53;
                        case 97 -> 153;
                        case 98 -> 114;
                        case 99 -> 136;
                        case 100 -> 172;
                        case 101 -> 235;
                        case 102 -> 78;
                        case 103 -> 79;
                        case 104 -> 221;
                        case 105 -> 186;
                        case 106 -> 108;
                        case 107 -> 12;
                        case 108 -> 76;
                        case 109 -> 213;
                        case 110 -> 158;
                        case 111 -> 16;
                        case 112 -> 85;
                        case 113 -> 103;
                        case 114 -> 10;
                        case 115 -> 38;
                        case 116 -> 97;
                        case 117 -> 223;
                        case 118 -> 18;
                        case 119 -> 178;
                        case 120 -> 101;
                        case 121 -> 194;
                        case 122 -> 141;
                        case 123 -> 239;
                        case 124 -> 200;
                        case 125 -> 47;
                        case 126 -> 94;
                        case 127 -> 132;
                        case 128 -> 245;
                        case 129 -> 187;
                        case 130 -> 44;
                        case 131 -> 203;
                        case 132 -> 220;
                        case 133 -> 230;
                        case 134 -> 164;
                        case 135 -> 22;
                        case 136 -> 207;
                        case 137 -> 37;
                        case 138 -> 129;
                        case 139 -> 254;
                        case 140 -> 123;
                        case 141 -> 81;
                        case 142 -> 111;
                        case 143 -> 122;
                        case 144 -> 252;
                        case 145 -> 154;
                        case 146 -> 109;
                        case 147 -> 142;
                        case 148 -> 146;
                        case 149 -> 202;
                        case 150 -> 190;
                        case 151 -> 7;
                        case 152 -> 98;
                        case 153 -> 157;
                        case 154 -> 89;
                        case 155 -> 185;
                        case 156 -> 237;
                        case 157 -> 188;
                        case 158 -> 210;
                        case 159 -> 148;
                        case 160 -> 77;
                        case 161 -> 233;
                        case 162 -> 176;
                        case 163 -> 113;
                        case 164 -> 249;
                        case 165 -> 196;
                        case 166 -> 88;
                        case 167 -> 45;
                        case 168 -> 4;
                        case 169 -> 112;
                        case 170 -> 246;
                        case 171 -> 212;
                        case 172 -> 1;
                        case 173 -> 121;
                        case 174 -> 184;
                        case 175 -> 140;
                        case 176 -> 224;
                        case 177 -> 166;
                        case 178 -> 115;
                        case 179 -> 11;
                        case 180 -> 227;
                        case 181 -> 125;
                        case 182 -> 211;
                        case 183 -> 0;
                        case 184 -> 60;
                        case 185 -> 163;
                        case 186 -> 83;
                        case 187 -> 59;
                        case 188 -> 179;
                        case 189 -> 149;
                        case 190 -> 244;
                        case 191 -> 95;
                        case 192 -> 143;
                        case 193 -> 34;
                        case 194 -> 100;
                        case 195 -> 70;
                        case 196 -> 145;
                        case 197 -> 26;
                        case 198 -> 198;
                        case 199 -> 86;
                        case 200 -> 197;
                        case 201 -> 104;
                        case 202 -> 174;
                        case 203 -> 68;
                        case 204 -> 19;
                        case 205 -> 120;
                        case 206 -> 14;
                        case 207 -> 161;
                        case 208 -> 205;
                        case 209 -> 191;
                        case 210 -> 228;
                        case 211 -> 181;
                        case 212 -> 229;
                        case 213 -> 177;
                        case 214 -> 99;
                        case 215 -> 56;
                        case 216 -> 90;
                        case 217 -> 31;
                        case 218 -> 183;
                        case 219 -> 24;
                        case 220 -> 106;
                        case 221 -> 17;
                        case 222 -> 155;
                        case 223 -> 13;
                        case 224 -> 160;
                        case 225 -> 5;
                        case 226 -> 150;
                        case 227 -> 144;
                        case 228 -> 117;
                        case 229 -> 139;
                        case 230 -> 217;
                        case 231 -> 238;
                        case 232 -> 57;
                        case 233 -> 61;
                        case 234 -> 92;
                        case 235 -> 49;
                        case 236 -> 167;
                        case 237 -> 175;
                        case 238 -> 21;
                        case 239 -> 192;
                        case 240 -> 55;
                        case 241 -> 41;
                        case 242 -> 236;
                        case 243 -> 214;
                        case 244 -> 105;
                        case 245 -> 3;
                        case 246 -> 127;
                        case 247 -> 72;
                        case 248 -> 87;
                        case 249 -> 162;
                        case 250 -> 180;
                        case 251 -> 219;
                        case 252 -> 23;
                        case 253 -> 67;
                        case 254 -> 165;
                        default -> 225;
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
      var10000 = this;
      var10001 = -12008;
      var10002 = -18988;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(String.valueOf(
         var10000),
         "Zealot route",
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
                  short var10004 = -3930;
                  short var10005 = 21436;
                  var10005 = -3931;
                  short var10006 = -8733;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = -3932;
                  short var10002 = -22142;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "\r\u009fz\u0089µKÀÎbæå\fhüð¹\u0014~»\u000e\u000fãVX \rÜ\b\u0093#\u0017Ç$\rñtE¹.\u009b¸\u0084òNrÀÇÁ«y\u000f§LüôÌ{ãfôáGî\u008c§½Y\u001bs\u0094\niH¥\u0001HVì\u0014\u0094\u008b\u009a\u008d\u0000T_¦âx\u0085øÔä¶\u0014_~¸*HL\u0000\u0081ÙF_\u0016âîq Ùñå7µËJ«¬\u000f\u009c>û¼\u0011`ÉvOi\u0093\u0012Û\u0092¯/\bÃ\u000b1Xç";
                  int var4 = "\r\u009fz\u0089µKÀÎbæå\fhüð¹\u0014~»\u000e\u000fãVX \rÜ\b\u0093#\u0017Ç$\rñtE¹.\u009b¸\u0084òNrÀÇÁ«y\u000f§LüôÌ{ãfôáGî\u008c§½Y\u001bs\u0094\niH¥\u0001HVì\u0014\u0094\u008b\u009a\u008d\u0000T_¦âx\u0085øÔä¶\u0014_~¸*HL\u0000\u0081ÙF_\u0016âîq Ùñå7µËJ«¬\u000f\u009c>û¼\u0011`ÉvOi\u0093\u0012Û\u0092¯/\bÃ\u000b1Xç"
                     .length();
                  char var1 = 2;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
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
                              case 0 -> 100;
                              case 1 -> 111;
                              case 2 -> 87;
                              case 3 -> 24;
                              case 4 -> 40;
                              case 5 -> 94;
                              default -> 43;
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
                  int var2 = (var0 ^ -3932) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 12;
                        case 1 -> 14;
                        case 2 -> 161;
                        case 3 -> 18;
                        case 4 -> 247;
                        case 5 -> 155;
                        case 6 -> 156;
                        case 7 -> 142;
                        case 8 -> 183;
                        case 9 -> 228;
                        case 10 -> 55;
                        case 11 -> 254;
                        case 12 -> 186;
                        case 13 -> 221;
                        case 14 -> 15;
                        case 15 -> 3;
                        case 16 -> 31;
                        case 17 -> 100;
                        case 18 -> 180;
                        case 19 -> 20;
                        case 20 -> 231;
                        case 21 -> 46;
                        case 22 -> 109;
                        case 23 -> 200;
                        case 24 -> 176;
                        case 25 -> 202;
                        case 26 -> 10;
                        case 27 -> 80;
                        case 28 -> 234;
                        case 29 -> 51;
                        case 30 -> 36;
                        case 31 -> 238;
                        case 32 -> 215;
                        case 33 -> 25;
                        case 34 -> 248;
                        case 35 -> 49;
                        case 36 -> 72;
                        case 37 -> 35;
                        case 38 -> 101;
                        case 39 -> 21;
                        case 40 -> 53;
                        case 41 -> 62;
                        case 42 -> 50;
                        case 43 -> 27;
                        case 44 -> 48;
                        case 45 -> 190;
                        case 46 -> 30;
                        case 47 -> 189;
                        case 48 -> 163;
                        case 49 -> 164;
                        case 50 -> 233;
                        case 51 -> 67;
                        case 52 -> 225;
                        case 53 -> 210;
                        case 54 -> 159;
                        case 55 -> 185;
                        case 56 -> 149;
                        case 57 -> 71;
                        case 58 -> 158;
                        case 59 -> 42;
                        case 60 -> 107;
                        case 61 -> 4;
                        case 62 -> 39;
                        case 63 -> 132;
                        case 64 -> 69;
                        case 65 -> 240;
                        case 66 -> 117;
                        case 67 -> 148;
                        case 68 -> 41;
                        case 69 -> 129;
                        case 70 -> 157;
                        case 71 -> 56;
                        case 72 -> 223;
                        case 73 -> 244;
                        case 74 -> 13;
                        case 75 -> 103;
                        case 76 -> 174;
                        case 77 -> 2;
                        case 78 -> 40;
                        case 79 -> 85;
                        case 80 -> 47;
                        case 81 -> 201;
                        case 82 -> 121;
                        case 83 -> 241;
                        case 84 -> 111;
                        case 85 -> 191;
                        case 86 -> 38;
                        case 87 -> 68;
                        case 88 -> 173;
                        case 89 -> 144;
                        case 90 -> 70;
                        case 91 -> 167;
                        case 92 -> 104;
                        case 93 -> 197;
                        case 94 -> 19;
                        case 95 -> 7;
                        case 96 -> 193;
                        case 97 -> 34;
                        case 98 -> 178;
                        case 99 -> 251;
                        case 100 -> 182;
                        case 101 -> 218;
                        case 102 -> 134;
                        case 103 -> 219;
                        case 104 -> 88;
                        case 105 -> 75;
                        case 106 -> 96;
                        case 107 -> 150;
                        case 108 -> 84;
                        case 109 -> 252;
                        case 110 -> 112;
                        case 111 -> 184;
                        case 112 -> 102;
                        case 113 -> 146;
                        case 114 -> 226;
                        case 115 -> 255;
                        case 116 -> 32;
                        case 117 -> 44;
                        case 118 -> 250;
                        case 119 -> 61;
                        case 120 -> 207;
                        case 121 -> 237;
                        case 122 -> 92;
                        case 123 -> 87;
                        case 124 -> 125;
                        case 125 -> 94;
                        case 126 -> 118;
                        case 127 -> 177;
                        case 128 -> 120;
                        case 129 -> 83;
                        case 130 -> 172;
                        case 131 -> 23;
                        case 132 -> 78;
                        case 133 -> 217;
                        case 134 -> 152;
                        case 135 -> 115;
                        case 136 -> 89;
                        case 137 -> 242;
                        case 138 -> 22;
                        case 139 -> 0;
                        case 140 -> 98;
                        case 141 -> 139;
                        case 142 -> 166;
                        case 143 -> 140;
                        case 144 -> 76;
                        case 145 -> 154;
                        case 146 -> 194;
                        case 147 -> 5;
                        case 148 -> 133;
                        case 149 -> 160;
                        case 150 -> 60;
                        case 151 -> 57;
                        case 152 -> 165;
                        case 153 -> 65;
                        case 154 -> 216;
                        case 155 -> 169;
                        case 156 -> 227;
                        case 157 -> 249;
                        case 158 -> 28;
                        case 159 -> 126;
                        case 160 -> 81;
                        case 161 -> 114;
                        case 162 -> 136;
                        case 163 -> 119;
                        case 164 -> 214;
                        case 165 -> 1;
                        case 166 -> 99;
                        case 167 -> 232;
                        case 168 -> 37;
                        case 169 -> 246;
                        case 170 -> 17;
                        case 171 -> 26;
                        case 172 -> 239;
                        case 173 -> 213;
                        case 174 -> 73;
                        case 175 -> 168;
                        case 176 -> 52;
                        case 177 -> 91;
                        case 178 -> 123;
                        case 179 -> 212;
                        case 180 -> 235;
                        case 181 -> 253;
                        case 182 -> 110;
                        case 183 -> 208;
                        case 184 -> 66;
                        case 185 -> 175;
                        case 186 -> 58;
                        case 187 -> 138;
                        case 188 -> 224;
                        case 189 -> 108;
                        case 190 -> 29;
                        case 191 -> 128;
                        case 192 -> 45;
                        case 193 -> 127;
                        case 194 -> 187;
                        case 195 -> 135;
                        case 196 -> 141;
                        case 197 -> 124;
                        case 198 -> 90;
                        case 199 -> 145;
                        case 200 -> 86;
                        case 201 -> 236;
                        case 202 -> 54;
                        case 203 -> 16;
                        case 204 -> 79;
                        case 205 -> 205;
                        case 206 -> 147;
                        case 207 -> 230;
                        case 208 -> 162;
                        case 209 -> 195;
                        case 210 -> 153;
                        case 211 -> 188;
                        case 212 -> 8;
                        case 213 -> 199;
                        case 214 -> 9;
                        case 215 -> 196;
                        case 216 -> 11;
                        case 217 -> 170;
                        case 218 -> 93;
                        case 219 -> 82;
                        case 220 -> 181;
                        case 221 -> 137;
                        case 222 -> 179;
                        case 223 -> 229;
                        case 224 -> 245;
                        case 225 -> 143;
                        case 226 -> 116;
                        case 227 -> 43;
                        case 228 -> 222;
                        case 229 -> 220;
                        case 230 -> 171;
                        case 231 -> 209;
                        case 232 -> 151;
                        case 233 -> 24;
                        case 234 -> 192;
                        case 235 -> 206;
                        case 236 -> 77;
                        case 237 -> 203;
                        case 238 -> 204;
                        case 239 -> 97;
                        case 240 -> 243;
                        case 241 -> 211;
                        case 242 -> 131;
                        case 243 -> 74;
                        case 244 -> 105;
                        case 245 -> 59;
                        case 246 -> 106;
                        case 247 -> 198;
                        case 248 -> 95;
                        case 249 -> 63;
                        case 250 -> 130;
                        case 251 -> 64;
                        case 252 -> 6;
                        case 253 -> 33;
                        case 254 -> 113;
                        default -> 122;
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
      var10001 = -12006;
      var10002 = -2295;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(
         var10000,
         "Zealot combat",
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         60000L,
         0L,
         null,
         false,
         false,
         (kotlin.jvm.functions.Function1)(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl::e),
         (Function1)(
            new Function1<IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll, Unit>() {
   public Unit invoke(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll p0) { return null; } // PX-FIX abs

      public Object receiver; // PX-FIX kotlin lambda receiver

               private static String[] a;
               private static String[] b;

               {
                  short var10004 = 12416;
                  short var10005 = 21854;
                  var10005 = 12417;
                  short var10006 = 20571;
               }

               public final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      Object receiver = null; // PX-FIX
                  short var10001 = 12418;
                  short var10002 = 31218;
                  Intrinsics.checkNotNullParameter(var1, "p0");
                  ((lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl)this.receiver).a(var1);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               static {
                  pxClinit: {
                  String[] var5 = new String[3];
                  int var3 = 0;
                  String var2 = "KJº[1\r]»Z\nR}páô$öz\u0002\u0013\u0093p\u0014hù\u0017Î\u009fÀÏ\"·¾î¿Á\u0014\u0093â+{\u0014¢KjH]î÷Ìêþ.êH\u0089\u009a\u0015\u0091Ê\u0088ña\t¬GYö\u0002\nwe\u0088á*05°\u0003p\b\u0010\u008có\u0002Û§6Ïï¬ï±?{]Fþÿû¼\u0017-oÕ~\u001f(\u008b>Ù\u0092\fvÂ\u0083âY,9 åI#%°72$\u000b>m\u0092\u001bv\u0005\u0083Ì9K\u0002zÔ";
                  int var4 = "KJº[1\r]»Z\nR}páô$öz\u0002\u0013\u0093p\u0014hù\u0017Î\u009fÀÏ\"·¾î¿Á\u0014\u0093â+{\u0014¢KjH]î÷Ìêþ.êH\u0089\u009a\u0015\u0091Ê\u0088ña\t¬GYö\u0002\nwe\u0088á*05°\u0003p\b\u0010\u008có\u0002Û§6Ïï¬ï±?{]Fþÿû¼\u0017-oÕ~\u001f(\u008b>Ù\u0092\fvÂ\u0083âY,9 åI#%°72$\u000b>m\u0092\u001bv\u0005\u0083Ì9K\u0002zÔ"
                     .length();
                  char var1 = 17;
                  int var0 = -1;

                  while (true) {
                     char[] var10002;
                     label38: {
                        char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                        int var10004 = var10003.length;
                        int var6 = 0;
                        byte var13 = 94;
                        var10002 = var10003;
                        int var8 = var10004;
                        byte var16;
                        char[] var10005;
                        int var10006;
                        if (var10004 <= 1) {
                           var10005 = var10003;
                           var16 = 94;
                           var10006 = var6;
                        } else {
                           var13 = 94;
                           var8 = var10004;
                           if (var10004 <= var6) {
                              break label38;
                           }

                           var10005 = var10003;
                           var16 = 94;
                           var10006 = var6;
                        }

                        while (true) {
                           var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                              case 0 -> 105;
                              case 1 -> 126;
                              case 2 -> 96;
                              case 3 -> 97;
                              case 4 -> 48;
                              case 5 -> 82;
                              default -> 83;
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
                  int var2 = (var0 ^ 12416) & 65535;
                  if (b[var2] == null) {
                     char[] var3 = a[var2].toCharArray();

                     short var4 = switch (var3[0] & 0xFF) {
                        case 0 -> 81;
                        case 1 -> 83;
                        case 2 -> 150;
                        case 3 -> 141;
                        case 4 -> 165;
                        case 5 -> 140;
                        case 6 -> 95;
                        case 7 -> 14;
                        case 8 -> 6;
                        case 9 -> 25;
                        case 10 -> 193;
                        case 11 -> 229;
                        case 12 -> 50;
                        case 13 -> 151;
                        case 14 -> 121;
                        case 15 -> 169;
                        case 16 -> 143;
                        case 17 -> 176;
                        case 18 -> 4;
                        case 19 -> 42;
                        case 20 -> 243;
                        case 21 -> 211;
                        case 22 -> 10;
                        case 23 -> 103;
                        case 24 -> 54;
                        case 25 -> 158;
                        case 26 -> 79;
                        case 27 -> 97;
                        case 28 -> 131;
                        case 29 -> 37;
                        case 30 -> 160;
                        case 31 -> 221;
                        case 32 -> 129;
                        case 33 -> 197;
                        case 34 -> 32;
                        case 35 -> 164;
                        case 36 -> 184;
                        case 37 -> 138;
                        case 38 -> 89;
                        case 39 -> 145;
                        case 40 -> 248;
                        case 41 -> 177;
                        case 42 -> 220;
                        case 43 -> 94;
                        case 44 -> 173;
                        case 45 -> 39;
                        case 46 -> 241;
                        case 47 -> 130;
                        case 48 -> 91;
                        case 49 -> 73;
                        case 50 -> 230;
                        case 51 -> 19;
                        case 52 -> 180;
                        case 53 -> 254;
                        case 54 -> 20;
                        case 55 -> 199;
                        case 56 -> 245;
                        case 57 -> 117;
                        case 58 -> 253;
                        case 59 -> 71;
                        case 60 -> 200;
                        case 61 -> 170;
                        case 62 -> 218;
                        case 63 -> 93;
                        case 64 -> 207;
                        case 65 -> 168;
                        case 66 -> 31;
                        case 67 -> 11;
                        case 68 -> 60;
                        case 69 -> 45;
                        case 70 -> 202;
                        case 71 -> 87;
                        case 72 -> 246;
                        case 73 -> 205;
                        case 74 -> 174;
                        case 75 -> 155;
                        case 76 -> 111;
                        case 77 -> 181;
                        case 78 -> 34;
                        case 79 -> 101;
                        case 80 -> 123;
                        case 81 -> 58;
                        case 82 -> 62;
                        case 83 -> 213;
                        case 84 -> 227;
                        case 85 -> 122;
                        case 86 -> 51;
                        case 87 -> 118;
                        case 88 -> 210;
                        case 89 -> 126;
                        case 90 -> 21;
                        case 91 -> 136;
                        case 92 -> 98;
                        case 93 -> 172;
                        case 94 -> 127;
                        case 95 -> 41;
                        case 96 -> 194;
                        case 97 -> 57;
                        case 98 -> 77;
                        case 99 -> 175;
                        case 100 -> 204;
                        case 101 -> 252;
                        case 102 -> 187;
                        case 103 -> 96;
                        case 104 -> 12;
                        case 105 -> 23;
                        case 106 -> 113;
                        case 107 -> 46;
                        case 108 -> 185;
                        case 109 -> 189;
                        case 110 -> 5;
                        case 111 -> 167;
                        case 112 -> 146;
                        case 113 -> 22;
                        case 114 -> 133;
                        case 115 -> 63;
                        case 116 -> 17;
                        case 117 -> 30;
                        case 118 -> 116;
                        case 119 -> 135;
                        case 120 -> 182;
                        case 121 -> 186;
                        case 122 -> 59;
                        case 123 -> 214;
                        case 124 -> 74;
                        case 125 -> 236;
                        case 126 -> 55;
                        case 127 -> 8;
                        case 128 -> 161;
                        case 129 -> 152;
                        case 130 -> 178;
                        case 131 -> 250;
                        case 132 -> 244;
                        case 133 -> 92;
                        case 134 -> 132;
                        case 135 -> 191;
                        case 136 -> 15;
                        case 137 -> 239;
                        case 138 -> 190;
                        case 139 -> 75;
                        case 140 -> 64;
                        case 141 -> 108;
                        case 142 -> 251;
                        case 143 -> 1;
                        case 144 -> 203;
                        case 145 -> 102;
                        case 146 -> 208;
                        case 147 -> 233;
                        case 148 -> 159;
                        case 149 -> 225;
                        case 150 -> 237;
                        case 151 -> 157;
                        case 152 -> 65;
                        case 153 -> 43;
                        case 154 -> 76;
                        case 155 -> 84;
                        case 156 -> 240;
                        case 157 -> 242;
                        case 158 -> 0;
                        case 159 -> 13;
                        case 160 -> 154;
                        case 161 -> 222;
                        case 162 -> 100;
                        case 163 -> 209;
                        case 164 -> 153;
                        case 165 -> 223;
                        case 166 -> 163;
                        case 167 -> 198;
                        case 168 -> 147;
                        case 169 -> 219;
                        case 170 -> 61;
                        case 171 -> 128;
                        case 172 -> 33;
                        case 173 -> 68;
                        case 174 -> 139;
                        case 175 -> 217;
                        case 176 -> 249;
                        case 177 -> 112;
                        case 178 -> 29;
                        case 179 -> 144;
                        case 180 -> 80;
                        case 181 -> 104;
                        case 182 -> 196;
                        case 183 -> 66;
                        case 184 -> 40;
                        case 185 -> 49;
                        case 186 -> 107;
                        case 187 -> 67;
                        case 188 -> 53;
                        case 189 -> 52;
                        case 190 -> 156;
                        case 191 -> 24;
                        case 192 -> 179;
                        case 193 -> 109;
                        case 194 -> 224;
                        case 195 -> 85;
                        case 196 -> 44;
                        case 197 -> 119;
                        case 198 -> 212;
                        case 199 -> 149;
                        case 200 -> 124;
                        case 201 -> 18;
                        case 202 -> 110;
                        case 203 -> 114;
                        case 204 -> 171;
                        case 205 -> 9;
                        case 206 -> 48;
                        case 207 -> 188;
                        case 208 -> 234;
                        case 209 -> 82;
                        case 210 -> 72;
                        case 211 -> 228;
                        case 212 -> 216;
                        case 213 -> 120;
                        case 214 -> 206;
                        case 215 -> 99;
                        case 216 -> 90;
                        case 217 -> 255;
                        case 218 -> 26;
                        case 219 -> 125;
                        case 220 -> 192;
                        case 221 -> 134;
                        case 222 -> 183;
                        case 223 -> 148;
                        case 224 -> 195;
                        case 225 -> 88;
                        case 226 -> 16;
                        case 227 -> 35;
                        case 228 -> 115;
                        case 229 -> 86;
                        case 230 -> 27;
                        case 231 -> 235;
                        case 232 -> 226;
                        case 233 -> 28;
                        case 234 -> 56;
                        case 235 -> 142;
                        case 236 -> 106;
                        case 237 -> 78;
                        case 238 -> 137;
                        case 239 -> 232;
                        case 240 -> 47;
                        case 241 -> 166;
                        case 242 -> 69;
                        case 243 -> 247;
                        case 244 -> 3;
                        case 245 -> 7;
                        case 246 -> 105;
                        case 247 -> 36;
                        case 248 -> 201;
                        case 249 -> 2;
                        case 250 -> 231;
                        case 251 -> 215;
                        case 252 -> 162;
                        case 253 -> 238;
                        case 254 -> 70;
                        default -> 38;
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
   }

   @Override
   public void aC() {
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      label32: {
         String var1;
         label31: {
            lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var2;
            label30: {
               var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
               int var10000 = ((this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII) ? 1 : 0);
               if (var1 != null) {
                  if (this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII) {
                     this.bf();
                     return;
                  }

                  var2 = this;
                  if (var1 == null) {
                     break label30;
                  }

                  var10000 = ((int[])lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.W()
                     .ordinal()];
               }

               switch (var10000) {
                  case 1:
                     var2 = this;
                     break;
                  case 2:
                     break label31;
                  case 3:
                     break label32;
                  default:
                     return;
               }
            }

            var2.bg();
            if (var1 != null) {
               return;
            }
         }

         this.bi();
         if (var1 != null) {
            return;
         }
      }

      this.bj();
   }

   private final void bf() {
      byte var24 = 0; // PX-FIX
      Object var22 = null; // PX-FIX
      String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      ClientLevel var10001 = this.ap().level;
      Intrinsics.checkNotNull(var10001);
      Iterable var28 = var10001.entitiesForRendering();
      short var10003 = -12027;
      short var10004 = -4603;
      Intrinsics.checkNotNullExpressionValue(var28, "entitiesForRendering(...)");
      Iterable var3 = var28;
      String var1 = var10000;
      boolean var4 = false;
      Iterable var5 = var3;
      var var6 = new ArrayList();
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            boolean var19 = var9 instanceof EnderMan;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               if (!var19) {
                  continue;
               }

               var6.add(var9);
            }

            if (var1 != null) {
               continue;
            }
         }

         var3 = var6;
         var4 = false;
         var5 = var3;
         var6 = new ArrayList();
         boolean var20 = false;
         break;
      }

      for (Object var18 : var5) {
         EnderMan var10;
         label78: {
            label100: {
               var10 = (EnderMan)var18;
               boolean var11 = false;
               BlockState var12 = var10.getCarriedBlock();
               BlockState var21 = var12;
               if (var1 != null) {
                  if (var12 == null) {
                     break label100;
                  }

                  var21 = var12;
               }

               var22 = Intrinsics.areEqual(var21.getBlock(), Blocks.END_PORTAL_FRAME);
               if (var1 == null) {
                  break label78;
               }

               if (!((Boolean)var22)) {
                  var22 = 1;
                  break label78;
               }
            }

            var22 = 0;
         }

         byte var13 =((Byte)( var22));
         double var34;
         int var23 = (
                  var34 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.a(var10), true)
                     - 15.0
               )
               == 0.0
            ? 0
            : (var34 < 0.0 ? -1 : 1);
         if (var1 != null) {
            var23 = var23 < 0 ? 1 : 0;
         }

         label66: {
            label101: {
               int var14 = var23;
               var24 = var13;
               if (var1 != null) {
                  if (var13 == 0) {
                     break label101;
                  }

                  var24 =(byte)( var14);
               }

               if (var1 == null) {
                  break label66;
               }

               if (var24 != 0) {
                  var24 = 1;
                  break label66;
               }
            }

            var24 = 0;
         }

         if (var24 != 0) {
            var6.add(var18);
            if (var1 == null) {
               break;
            }
         }
      }

      List var2 = var6;
      int var25 = ((var2.isEmpty()) ? 1 : 0);
      if (var1 != null) {
         if (var25 != 0) {
            short var26 = -12013;
            short var29 = -22551;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§aNo special zealots nearby, swapping lobbies..."
            );
            short var27 = -12009;
            this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = false;
            short var30 = -6084;
            lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .a()
               .q();
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("/lobby");
            me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(3000L, null);
            if (var1 != null) {
               return;
            }
         }

         var25 = var2.size();
      }

      short var31 = -12026;
      short var10002 = 22152;
      var10002 = -12015;
      var10003 = -2882;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§eWaiting for " + var25 + " special zealot(s) to be killed..."
      );
   }

   private final void bg() {
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      label27: {
         String var1;
         lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var2;
         label26: {
            var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
            int var10000 = ((this.aK()) ? 1 : 0);
            if (var1 != null) {
               if (var10000 == 0) {
                  return;
               }

               var2 = this;
               if (var1 == null) {
                  break label26;
               }

               var10000 = ((int[])lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.aJ()
                  .a()
                  .ordinal()];
            }

            switch (var10000) {
               case 1:
                  var2 = this;
                  break;
               case 2:
                  break label27;
               default:
                  return;
            }
         }

         var2.a(
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
            3000
         );
         if (var1 != null) {
            return;
         }
      }

      this.bh();
      this.bl();
   }

   private final void bh() {
      ArrayList var3;
      label17: {
         String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         String var2 = IIlIlIlIIllIIIlIIlllIIlIIllllllIlIlllIIlIllllIIlIllIlIllIIllIllllIIlIIIlllIIIllIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .y();
         short var10002 = -12007;
         short var10003 = -868;
         boolean var10001 = Intrinsics.areEqual(var2, "Etherwarp");
         if (var1 != null) {
            if (var10001) {
               var3 = this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
               break label17;
            }

            var10002 = -12030;
            var10003 = 15196;
            var10001 = Intrinsics.areEqual(var2, "Walk");
         }

         var3 = var10001
            ? this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
            : this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
      }

      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = var3;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 0;
   }

   private final void bi() {
      Object var11 = null; // PX-FIX
      Object IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = null; // PX-FIX
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var10000 = ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)(this));
      llIlIlIIlIIlIlIllIIIIIIIIlIIIIlIIlIIllllllIIIllIIllllIlIlllIIIIllIIIIlllllIlIIllllIIl var10000x = null; // PX-FIX var-split (ctx B)
      if (var1 != null) {
         if (this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl
            >= this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.size()) {
            this.bk();
            return;
         }

         var10000 = this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll
            .get(this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl);
         short var10002 = -12010;
         short var10003 = -15467;
         Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      }

      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var2 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)(Object)var10000;
      int var8 = ((int[])lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)[var2.b()
         .ordinal()];
      if (var1 != null) {
         switch (var8) {
            case 1:
               Integer var13;
               BlockPos var10001;
               label60: {
                  var10000x = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .f();
                  var10001 = var2.a();
                  if (var1 != null) {
                     me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12 = this.X();
                     if (var12 != null) {
                        var13 = var12.b();
                        break label60;
                     }
                  }

                  var13 = null;
               }

               int var10 = ((var10000x.a(var10001, var13)) ? 1 : 0);
               if (var1 != null) {
                  if (var10 == 0) {
                     return;
                  }

                  var10 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
               }

               int var3 = var10;
               this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var3 + 1;
               if (var1 != null) {
                  return;
               }
            case 2:
               double var6 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var2.a(), false);
               var11 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                  .e()
                  .d();
               label54:
               if (var1 != null) {
                  if (!((Boolean)var11)) {
                     double var14;
                     var11 = (var14 = var6 - 1.5) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
                     if (var1 == null) {
                        break label54;
                     }

                     if (((Boolean)var11)) {
                        int var5 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl++;
                        if (var1 != null) {
                           return;
                        }
                     }
                  }

                  var11 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                     .e()
                     .d();
               }

               if (var1 != null) {
                  if (((Boolean)(var11))) {
                     return;
                  }

                  IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                     ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                        .e())),
                     ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(var2.a())),
                     0,
                     false);
               }

               if (var1 != null) {
                  return;
               }
         }

         var8 = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      }

      int var7 = var8;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var7 + 1;
   }

   private final void bj() {
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      short var10000 = ((short)((me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) ? 1 : 0));
      if (var1 != null) {
         if ((var10000 == 0)) {
            return;
         }

         var10000 = ((short)((lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a()
            .c()) ? 1 : 0));
      }

      if (var1 != null) {
         if ((var10000 != 0)) {
            return;
         }

         lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a()
            .b(
               IIlIlIlIIllIIIlIIlllIIlIIllllllIlIlllIIlIllllIIlIllIlIllIIllIllllIIlIIIlllIIIllIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b()
                  .ae()
            );
         lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a()
            .c(
               IIlIlIlIIllIIIlIIlllIIlIIllllllIlIlllIIlIllllIIlIllIlIllIIllIllllIIlIIIlllIIIllIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c()
                  .ae()
            );
         var10000 = ((short)((lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a()
            .o()) ? 1 : 0));
      }

      boolean var2 = (var10000 != 0);
      if (var1 != null) {
         if (var2) {
            return;
         }

         var10000 = -12017;
         short var10001 = 9003;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§cFailed to start macro - no weapon found?"
         );
      }

      this.N();
   }

   private final void bk() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
      );
   }

   private final void bl() {
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 0;
   }

   private final void a(IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      this.ae()
         .a(
            new lllIllIIllIIIIIIIlIIlIIIIIllllIlIIIIIllllIIlIIIIlllIIIIIIlIIIIlIlIIIIllIIllIIlllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
               (kotlin.jvm.functions.Function1)(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl::g),
               var1.d(),
               0,
               0,
               0L,
               0,
               (kotlin.jvm.functions.Function1)(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl::h),
               120,
               null
            )
         );
   }

   private final void bm() {
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = false;
      lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .a()
         .q();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 0;
      this.aO();
   }

   @Override
   public void a9() {
      Object var10000 = null; // PX-FIX
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
         == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
         )
       {
         boolean var8;
         label48: {
            var var2 = lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .a()
               .a()
               .a();
            boolean var3 = false;
            var10000 = var2;
            label42:
            if (var1 != null) {
               if (var2 instanceof Collection) {
                  var10000 = (Collection)var2;
                  if (var1 == null) {
                     break label42;
                  }

                  if (((me.octo.client.PXDyn)var10000).isEmpty()) {
                     var8 = false;
                     break label48;
                  }
               }

               var10000 = var2;
            }

            Iterator var4 = ((me.octo.client.PXDyn)var10000).iterator();

            label35:
            while (true) {
               if (!var4.hasNext()) {
                  var8 = false;
                  break;
               }

               Object var5 = var4.next();
               AABB var6 = (AABB)var5;
               boolean var7 = false;
               var8 = var6.contains(me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w());

               while (var8) {
                  var8 = true;
                  if (var1 != null) {
                     break label35;
                  }
               }
            }
         }

         if (var8) {
            this.bk();
            if (var1 != null) {
               return;
            }
         }
      }

      this.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
         3000
      );
   }

   @Override
   public void M() {
      Object var13 = null; // PX-FIX
      String var1;
      boolean var2;
      boolean var3;
      boolean var16;
      label116: {
         label120: {
            String var10000 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
            this.aM();
            var1 = var10000;
            this.bh();
            var2 = this.a5() != null;
            var3 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
            lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var12 = this;
            if (var1 != null) {
               if (this.X() != null) {
                  break label120;
               }

               var12 = this;
            }

            label121: {
               var var5 = var12.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
               boolean var6 = false;
               var13 = var5;
               label108:
               if (var1 != null) {
                  if (var5 instanceof Collection) {
                     var13 = var5;
                     if (var1 == null) {
                        break label108;
                     }

                     if (((me.octo.client.PXDyn)var13).isEmpty()) {
                        var16 = true;
                        break label121;
                     }
                  }

                  var13 = var5;
               }

               Iterator var7 = ((me.octo.client.PXDyn)var13).iterator();

               label101:
               while (true) {
                  if (!var7.hasNext()) {
                     var16 = true;
                     break;
                  }

                  Object var8 = var7.next();
                  IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var9 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var8;
                  var16 = false;

                  while (
                     var9.b()
                        == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                  ) {
                     var16 = false;
                     if (var1 != null) {
                        break label101;
                     }
                  }
               }
            }

            if (!var16) {
               var16 = false;
               break label116;
            }
         }

         var16 = true;
      }

      boolean var4;
      var4 = var16;
      var16 = var2;
      label86:
      if (var1 != null) {
         if (var2) {
            var16 = var3;
            if (var1 == null) {
               break label86;
            }

            if (var3) {
               var16 = var4;
               if (var1 == null) {
                  break label86;
               }

               if (var4) {
                  this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = 0;
                  this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 0;
                  this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = false;
                  llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[] var11 = new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI[]{
                     new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                        lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl::bn,
                        false
                     ),
                     new llIIIlllIllIIlIlIllllIlIlIIlIIIIIIlIllllIllllIllIIIlIllllIlIlIlllIlIIIIlIIllIlIIIIllI(
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                        lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl::bo,
                        false
                     )
                  };
                  this.a(CollectionsKt.listOf(var11));
                  lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var18 = this;
                  if (var1 != null) {
                     super.M();
                     if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .g()
                        == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
                        )
                      {
                        this.a9();
                        if (var1 != null) {
                           return;
                        }
                     }

                     var18 = this;
                  }

                  var18.a(
                     IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll,
                     3000
                  );
                  return;
               }
            }
         }

         var16 = var2;
      }

      if (var1 != null) {
         if (!var16) {
            this.a_();
         }

         var16 = var4;
      }

      if (var1 != null) {
         if (!var16) {
            this.aP();
         }

         var16 = var3;
      }

      if (!var16) {
         this.b(
            CollectionsKt.listOf(
               IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
            )
         );
      }

      this.N();
   }

   @Override
   public void N() {
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = false;
      lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .a()
         .q();
      this.aN();
      super.N();
   }

   @Override
   public void O() {
      short var10001 = -12014;
      short var10002 = 12085;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.a(String.valueOf(
         llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl),
         "Session Info");
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
      llIlllllIIlllIllllIllIIIlllIIIIlllIIlIlIlIllIlIllIIIlIlllIlIIllllIlIIlIlIIlllIllIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((kotlin.jvm.functions.Function0<String>)null,  16777215,  0);;
   }

   private static final long a(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      return var0.aJ().b() + 15000L;
   }

   private static final Object b(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      return TuplesKt.to(
         var0.aJ().a(),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g()
      );
   }

   private static final Object c(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      return new lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         IIlIlIlIIllIIIlIIlllIIlIIllllllIlIlllIIlIllllIIlIllIlIllIIllIllllIIlIIIlllIIIllIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()
            .y(),
         var0.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl,
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .e()
            .d(),
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.a(var0, 0.0, 1, null)
      );
   }

   private static final boolean d(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      String var1 = llllIIIIlllIlllllIllIIlIIIIIIllllIllIllIlIlIlIIIIlIlIllIllIIIIIllllIlIllllIIlIIllIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      boolean var10000 = lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .a()
         .c();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = var0.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
      }

      return var1 == null ? var10000 : !var10000;
   }

   private static final Object e(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      return new lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var0.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII,
         var0.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI,
         lllIllllIlIIllIlIIlIIllIIIIIIIIIlIIIIllllIlIllIlllIlIlIlIIIIIIlllIIIIIllIIIIIllIlIIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .a()
            .k()
      );
   }

   private static final Unit f(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      if (var0.G()
         && IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
         )
       {
         var0.a9();
      }

      return Unit.INSTANCE;
   }

   private static final Unit g(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      var0.bh();
      var0.bl();
      return Unit.INSTANCE;
   }

   private static final Unit h(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      var0.bm();
      return Unit.INSTANCE;
   }

   private static final boolean bn() {
      return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .e();
   }

   private static final boolean bo() {
      return IlllIIIIlIlllIlllllIlIlIIllIlllIlIIllllllIlllllIllIllllIllIIIllIIlIlIlllIIlIllIIlIlll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .a();
   }

   private static final String i(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      String var10000 = var0.W().name();
      short var10001 = -12004;
      short var10002 = 391;
      return "Macro State: " + var10000;
   }

   private static final String j(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      short var10001 = -11996;
      short var10002 = -25954;
      return "Zealots Killed: " + var0.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   }

   private static final String k(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0) {
      short var10001 = -12025;
      short var10002 = 32098;
      return "Eyes Gained: " + var0.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   }

   // PX-FIX TOP3d2: jar method bp ()LlIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl; (access 4121) - getstatic IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll
   public static lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl bp() {
      return lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   }

   // PX-FIX TOP3d2: jar method a (LlIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl;Lme/octo/client/IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll;)V (access 4121) - static delegate to instance a(me.octo.client.IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll)
   public static void a(lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl var0, me.octo.client.IIllIlIIlIIlIllIIlllllllIlllIIlIIllllIlIlIllIlllIIllIIllIlIlllIllIIIlIlIllIlIllllllll var1) {
      var0.a(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[33];
      int var3 = 0;
      String var2 = "¯µñNèÉ<\u0081\u001cß\u0094'Ó\u0019\u001b7ªq/\u0096ùÓ}|\u000e«\r\u0080:\u001b©\u009e\u0093ez?\u0081V¯\u000e©\tEÔ\u00886¿d\u0019{\u0093Ð?;\ro®\u0011\u00ad?z!¿Ê¢ÃS%\"<\u000bv£-_{6\u009f®¢`\u009e)\u0087\u0007!\u0013}1 ùW\u0000oV)\u0002¥j\u0015¼ø¿\rò\u00ad~^\u0094ðúå±K¥À©\u0004E\u0002\r;\u0019Û\u0093\u0095\u0012îÓ`\u001c®bÚ]MÎÞ¸\u0003Î}òm\u0090ÙDv$Ïw\u0002\u009b\u0092\\\u0080Òc2\u0081ù\u0086\u001eUKÍ\u001cÕ¾=Ë!é\u009fkí¥é\u0099è4\u0084\u0099R\u000f#ÆÄ\u001bÓó\u009f¸fåØý\u0006g)òzëuÈo?ù¿ºp×Ñ\u001dÛ\"\u0090\\jTG.w\u0097\u008d\u0014èL¼Zøø\u000ffT§t\u007f¶ü$¨aKÂ\u009eèlP¬s\fbÁ\u0018Ã¨#CQa{\u009by´6Ñ^*á-]\u0096¸fµ\u007f\u0092\u0007DÎì\n×\u0004·Á\u0095è\u0092\u0014ÿê\r\u00adÒ}ï\u0097ÈWT]\u0019?+Øç\u0003Ö\u007f\u0018óÆ@©Ä\tm\u0094(a\"\u008e\u0080\u0006\u0090¢Èâ ê\u0004¥\u0010HH|K\u001d\u0098x¢\u0085|ÿ\u0084·(\u0080\u001b\u009fÊ\u000bÞÂñ9±uå\u0098ÙÐY×\u001a(wKsN\u000f6OÔ§áRO? \u0016#/{öí\u0013T*8.\u0089¦ÊÁÛ §\u0014Øp\u0085\u0091¾Y}E\u0005\u0015èz\u0096\u00068þ\u001a1p;Å¯ÈØÌ\u001cb\u0083±äg£i\"í\u008d»º\u0095¯Îæ{\u000f\u001f\u00160s\u001bÇ\fÊU\u0090}\u0004Æü<hB¼×1Pçº\u0081i#\u008d\u000e\u0016GI/S;z\u0003¡\u009fÌ\u0004ÉÁ<\ffè%~ÒøHKXWÞç\u0099ì¨þ\u001b\u001d\u001dh¸@B\u0013U\u0099}}\u007f{Ü³cn\u001bT²õ7Ú¿\u0018q~\u0095³¡Ö\u0081ù\u000eÏ¶â\u0003¡ühq\b/cnÐí\u008cûe\u0006XÿÚ!Oæ\f¡\u00160:ÐG;iïÞ\u009fO\"\u0011¤\u0002±©\u0003Ø~» k¤]5\bÁüaVÁ\u0002Ôm¯þ£\u0007\u009dþú.å÷ì\f\">z ÏãPè-#þ\\0\"²-)öA\tfñ\u0018\rßYã\\åZÃ*\u001c\u001cÆ\u000fn\u0007\u00160CF\u007fïÎàq\u0088\bÿöEa¾O¦o\u0097W5º\rÿ}\fÍ\u00150ð`\u008bö\u0004êü\r%Ò}\\yû\t\u0099\u000f\u0014ý\u0082\u0097F\\V±¿P£Î\u0003d±óW\u001a³\u0001ñ0´¾\u009c\u0011(¹Ü1MV\u008f,ß¢çTÔ4!\u0006½±\u0099µäøLËº¥¯¬\u0082\f\u0081þQè#}¾\u0088¼\u000eJoÿ\u0005ÊÙ8\u0084(\rÈ_\u0019\u0004|¿ã\b\u0096\u00ade¬\u0091\fäô\u0098fÅÌ\u0099'µÙ\u001dq\t\u0015TSH\u0089\"ï\u0099\r\r =\u0000_ÖëûÒùL\u0082Ü\u009f";
      int var4 = "¯µñNèÉ<\u0081\u001cß\u0094'Ó\u0019\u001b7ªq/\u0096ùÓ}|\u000e«\r\u0080:\u001b©\u009e\u0093ez?\u0081V¯\u000e©\tEÔ\u00886¿d\u0019{\u0093Ð?;\ro®\u0011\u00ad?z!¿Ê¢ÃS%\"<\u000bv£-_{6\u009f®¢`\u009e)\u0087\u0007!\u0013}1 ùW\u0000oV)\u0002¥j\u0015¼ø¿\rò\u00ad~^\u0094ðúå±K¥À©\u0004E\u0002\r;\u0019Û\u0093\u0095\u0012îÓ`\u001c®bÚ]MÎÞ¸\u0003Î}òm\u0090ÙDv$Ïw\u0002\u009b\u0092\\\u0080Òc2\u0081ù\u0086\u001eUKÍ\u001cÕ¾=Ë!é\u009fkí¥é\u0099è4\u0084\u0099R\u000f#ÆÄ\u001bÓó\u009f¸fåØý\u0006g)òzëuÈo?ù¿ºp×Ñ\u001dÛ\"\u0090\\jTG.w\u0097\u008d\u0014èL¼Zøø\u000ffT§t\u007f¶ü$¨aKÂ\u009eèlP¬s\fbÁ\u0018Ã¨#CQa{\u009by´6Ñ^*á-]\u0096¸fµ\u007f\u0092\u0007DÎì\n×\u0004·Á\u0095è\u0092\u0014ÿê\r\u00adÒ}ï\u0097ÈWT]\u0019?+Øç\u0003Ö\u007f\u0018óÆ@©Ä\tm\u0094(a\"\u008e\u0080\u0006\u0090¢Èâ ê\u0004¥\u0010HH|K\u001d\u0098x¢\u0085|ÿ\u0084·(\u0080\u001b\u009fÊ\u000bÞÂñ9±uå\u0098ÙÐY×\u001a(wKsN\u000f6OÔ§áRO? \u0016#/{öí\u0013T*8.\u0089¦ÊÁÛ §\u0014Øp\u0085\u0091¾Y}E\u0005\u0015èz\u0096\u00068þ\u001a1p;Å¯ÈØÌ\u001cb\u0083±äg£i\"í\u008d»º\u0095¯Îæ{\u000f\u001f\u00160s\u001bÇ\fÊU\u0090}\u0004Æü<hB¼×1Pçº\u0081i#\u008d\u000e\u0016GI/S;z\u0003¡\u009fÌ\u0004ÉÁ<\ffè%~ÒøHKXWÞç\u0099ì¨þ\u001b\u001d\u001dh¸@B\u0013U\u0099}}\u007f{Ü³cn\u001bT²õ7Ú¿\u0018q~\u0095³¡Ö\u0081ù\u000eÏ¶â\u0003¡ühq\b/cnÐí\u008cûe\u0006XÿÚ!Oæ\f¡\u00160:ÐG;iïÞ\u009fO\"\u0011¤\u0002±©\u0003Ø~» k¤]5\bÁüaVÁ\u0002Ôm¯þ£\u0007\u009dþú.å÷ì\f\">z ÏãPè-#þ\\0\"²-)öA\tfñ\u0018\rßYã\\åZÃ*\u001c\u001cÆ\u000fn\u0007\u00160CF\u007fïÎàq\u0088\bÿöEa¾O¦o\u0097W5º\rÿ}\fÍ\u00150ð`\u008bö\u0004êü\r%Ò}\\yû\t\u0099\u000f\u0014ý\u0082\u0097F\\V±¿P£Î\u0003d±óW\u001a³\u0001ñ0´¾\u009c\u0011(¹Ü1MV\u008f,ß¢çTÔ4!\u0006½±\u0099µäøLËº¥¯¬\u0082\f\u0081þQè#}¾\u0088¼\u000eJoÿ\u0005ÊÙ8\u0084(\rÈ_\u0019\u0004|¿ã\b\u0096\u00ade¬\u0091\fäô\u0098fÅÌ\u0099'µÙ\u001dq\t\u0015TSH\u0089\"ï\u0099\r\r =\u0000_ÖëûÒùL\u0082Ü\u009f"
         .length();
      char var1 = '\r';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 60;
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
                     case 1 -> 125;
                     case 2 -> 98;
                     case 3 -> 73;
                     case 4 -> 3;
                     case 5 -> 7;
                     default -> 88;
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
                     k = new String[33];
                     lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl();
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "n;à\u0019 \u0010Óø\u008b\u0012R·Íï×1\u001c\u000fg\u0012Ü²";
                  var4 = "n;à\u0019 \u0010Óø\u008b\u0012R·Íï×1\u001c\u000fg\u0012Ü²".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 43;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ -12028) & 65535;
      if (k[var2] == null) {
         char[] var3 = j[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 232;
            case 1 -> 125;
            case 2 -> 233;
            case 3 -> 172;
            case 4 -> 230;
            case 5 -> 132;
            case 6 -> 152;
            case 7 -> 19;
            case 8 -> 188;
            case 9 -> 22;
            case 10 -> 115;
            case 11 -> 141;
            case 12 -> 235;
            case 13 -> 197;
            case 14 -> 0;
            case 15 -> 7;
            case 16 -> 159;
            case 17 -> 47;
            case 18 -> 224;
            case 19 -> 190;
            case 20 -> 25;
            case 21 -> 99;
            case 22 -> 111;
            case 23 -> 42;
            case 24 -> 205;
            case 25 -> 46;
            case 26 -> 112;
            case 27 -> 86;
            case 28 -> 200;
            case 29 -> 96;
            case 30 -> 180;
            case 31 -> 34;
            case 32 -> 139;
            case 33 -> 90;
            case 34 -> 185;
            case 35 -> 64;
            case 36 -> 84;
            case 37 -> 246;
            case 38 -> 53;
            case 39 -> 184;
            case 40 -> 65;
            case 41 -> 247;
            case 42 -> 226;
            case 43 -> 217;
            case 44 -> 18;
            case 45 -> 133;
            case 46 -> 11;
            case 47 -> 175;
            case 48 -> 23;
            case 49 -> 244;
            case 50 -> 194;
            case 51 -> 211;
            case 52 -> 156;
            case 53 -> 33;
            case 54 -> 167;
            case 55 -> 158;
            case 56 -> 44;
            case 57 -> 145;
            case 58 -> 189;
            case 59 -> 130;
            case 60 -> 66;
            case 61 -> 88;
            case 62 -> 231;
            case 63 -> 149;
            case 64 -> 94;
            case 65 -> 37;
            case 66 -> 104;
            case 67 -> 126;
            case 68 -> 155;
            case 69 -> 68;
            case 70 -> 61;
            case 71 -> 106;
            case 72 -> 181;
            case 73 -> 109;
            case 74 -> 214;
            case 75 -> 225;
            case 76 -> 255;
            case 77 -> 75;
            case 78 -> 186;
            case 79 -> 78;
            case 80 -> 93;
            case 81 -> 91;
            case 82 -> 13;
            case 83 -> 48;
            case 84 -> 116;
            case 85 -> 30;
            case 86 -> 39;
            case 87 -> 35;
            case 88 -> 89;
            case 89 -> 179;
            case 90 -> 237;
            case 91 -> 171;
            case 92 -> 227;
            case 93 -> 142;
            case 94 -> 97;
            case 95 -> 140;
            case 96 -> 6;
            case 97 -> 102;
            case 98 -> 10;
            case 99 -> 220;
            case 100 -> 202;
            case 101 -> 27;
            case 102 -> 28;
            case 103 -> 213;
            case 104 -> 151;
            case 105 -> 83;
            case 106 -> 117;
            case 107 -> 72;
            case 108 -> 121;
            case 109 -> 163;
            case 110 -> 240;
            case 111 -> 100;
            case 112 -> 215;
            case 113 -> 222;
            case 114 -> 243;
            case 115 -> 21;
            case 116 -> 54;
            case 117 -> 62;
            case 118 -> 137;
            case 119 -> 238;
            case 120 -> 15;
            case 121 -> 203;
            case 122 -> 131;
            case 123 -> 76;
            case 124 -> 201;
            case 125 -> 135;
            case 126 -> 124;
            case 127 -> 101;
            case 128 -> 228;
            case 129 -> 52;
            case 130 -> 182;
            case 131 -> 24;
            case 132 -> 177;
            case 133 -> 17;
            case 134 -> 85;
            case 135 -> 105;
            case 136 -> 110;
            case 137 -> 26;
            case 138 -> 236;
            case 139 -> 206;
            case 140 -> 138;
            case 141 -> 183;
            case 142 -> 40;
            case 143 -> 198;
            case 144 -> 245;
            case 145 -> 249;
            case 146 -> 73;
            case 147 -> 119;
            case 148 -> 63;
            case 149 -> 207;
            case 150 -> 144;
            case 151 -> 59;
            case 152 -> 234;
            case 153 -> 129;
            case 154 -> 196;
            case 155 -> 1;
            case 156 -> 57;
            case 157 -> 50;
            case 158 -> 146;
            case 159 -> 87;
            case 160 -> 127;
            case 161 -> 60;
            case 162 -> 253;
            case 163 -> 187;
            case 164 -> 174;
            case 165 -> 95;
            case 166 -> 82;
            case 167 -> 79;
            case 168 -> 192;
            case 169 -> 45;
            case 170 -> 153;
            case 171 -> 38;
            case 172 -> 209;
            case 173 -> 160;
            case 174 -> 164;
            case 175 -> 58;
            case 176 -> 20;
            case 177 -> 254;
            case 178 -> 241;
            case 179 -> 148;
            case 180 -> 166;
            case 181 -> 229;
            case 182 -> 5;
            case 183 -> 128;
            case 184 -> 165;
            case 185 -> 221;
            case 186 -> 12;
            case 187 -> 32;
            case 188 -> 120;
            case 189 -> 223;
            case 190 -> 16;
            case 191 -> 49;
            case 192 -> 168;
            case 193 -> 178;
            case 194 -> 103;
            case 195 -> 162;
            case 196 -> 92;
            case 197 -> 118;
            case 198 -> 193;
            case 199 -> 242;
            case 200 -> 114;
            case 201 -> 250;
            case 202 -> 71;
            case 203 -> 173;
            case 204 -> 143;
            case 205 -> 36;
            case 206 -> 56;
            case 207 -> 147;
            case 208 -> 107;
            case 209 -> 252;
            case 210 -> 3;
            case 211 -> 98;
            case 212 -> 239;
            case 213 -> 212;
            case 214 -> 169;
            case 215 -> 134;
            case 216 -> 9;
            case 217 -> 70;
            case 218 -> 55;
            case 219 -> 77;
            case 220 -> 2;
            case 221 -> 8;
            case 222 -> 108;
            case 223 -> 81;
            case 224 -> 113;
            case 225 -> 161;
            case 226 -> 14;
            case 227 -> 67;
            case 228 -> 29;
            case 229 -> 154;
            case 230 -> 248;
            case 231 -> 122;
            case 232 -> 191;
            case 233 -> 157;
            case 234 -> 80;
            case 235 -> 208;
            case 236 -> 4;
            case 237 -> 43;
            case 238 -> 31;
            case 239 -> 195;
            case 240 -> 218;
            case 241 -> 74;
            case 242 -> 136;
            case 243 -> 51;
            case 244 -> 204;
            case 245 -> 251;
            case 246 -> 176;
            case 247 -> 150;
            case 248 -> 41;
            case 249 -> 123;
            case 250 -> 69;
            case 251 -> 210;
            case 252 -> 199;
            case 253 -> 170;
            case 254 -> 216;
            default -> 219;
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

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull String var1, int var2, boolean var3, @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = 12528;
         short var10002 = -10054;
         Intrinsics.checkNotNullParameter(var1, "routeType");
         var10001 = 12529;
         var10002 = 13234;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI =((Triple)( var4));
      }

      @NotNull
      public final String a() {
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

      @NotNull
      public final String e() {
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
      public final lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         @NotNull String var1, int var2, boolean var3, @NotNull Triple<Integer, Integer, Integer> var4
      ) {
         short var10001 = 12532;
         short var10002 = 11124;
         Intrinsics.checkNotNullParameter(var1, "routeType");
         var10001 = 12533;
         var10002 = -29513;
         Intrinsics.checkNotNullParameter(var4, "playerPos");
         return new lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3,((Triple)( var4
         )));
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 12530;
         Triple var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 4783;
         short var10002 = 12531;
         short var10003 = 27851;
         short var10004 = 12534;
         short var10005 = -13064;
         short var10006 = 12535;
         short var10007 = -32198;
         return "RouteProgress(routeType=" + var4 + ", index=" + var3 + ", walkerFinished=" + var2 + ", playerPos=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
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
               var10000 instanceof lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label56: {
            int var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 != null) {
               if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
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
         String[] var5 = new String[8];
         int var3 = 0;
         String var2 = "ÙÄ\u0086B\u0010\u001c·2qpQ\u0016\u0088ß¬ò\u0002\f:Óý\u00ad\u0095_«\näq*¤\tQ\u0018\u0000j\u008b\u0091ðY%\t!ëXz\u0016\u0019jµl\u0018`Ó\u0002\u0013Ëºó§-gÔ\u0096RÖà\u00906{M³(\u001d>\u0083\bÏ\rZt^:jv";
         int var4 = "ÙÄ\u0086B\u0010\u001c·2qpQ\u0016\u0088ß¬ò\u0002\f:Óý\u00ad\u0095_«\näq*¤\tQ\u0018\u0000j\u008b\u0091ðY%\t!ëXz\u0016\u0019jµl\u0018`Ó\u0002\u0013Ëºó§-gÔ\u0096RÖà\u00906{M³(\u001d>\u0083\bÏ\rZt^:jv"
            .length();
         char var1 = 17;
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
                        case 0 -> 74;
                        case 1 -> 103;
                        case 2 -> 35;
                        case 3 -> 122;
                        case 4 -> 88;
                        case 5 -> 52;
                        default -> 51;
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
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "bp'&.Y\u0005\u0001Ú\tBòu\u0018ò\u0014·U\u0096";
                     var4 = "bp'&.Y\u0005\u0001Ú\tBòu\u0018ò\u0014·U\u0096".length();
                     var1 = '\t';
                     var8 = -1;
               }

               var10000 = 64;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 12534) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 181;
               case 1 -> 184;
               case 2 -> 195;
               case 3 -> 41;
               case 4 -> 163;
               case 5 -> 37;
               case 6 -> 25;
               case 7 -> 171;
               case 8 -> 141;
               case 9 -> 49;
               case 10 -> 232;
               case 11 -> 44;
               case 12 -> 203;
               case 13 -> 194;
               case 14 -> 9;
               case 15 -> 86;
               case 16 -> 233;
               case 17 -> 193;
               case 18 -> 79;
               case 19 -> 19;
               case 20 -> 255;
               case 21 -> 162;
               case 22 -> 1;
               case 23 -> 151;
               case 24 -> 249;
               case 25 -> 170;
               case 26 -> 227;
               case 27 -> 234;
               case 28 -> 10;
               case 29 -> 84;
               case 30 -> 66;
               case 31 -> 166;
               case 32 -> 95;
               case 33 -> 178;
               case 34 -> 63;
               case 35 -> 71;
               case 36 -> 192;
               case 37 -> 58;
               case 38 -> 6;
               case 39 -> 102;
               case 40 -> 216;
               case 41 -> 91;
               case 42 -> 150;
               case 43 -> 0;
               case 44 -> 210;
               case 45 -> 199;
               case 46 -> 13;
               case 47 -> 138;
               case 48 -> 209;
               case 49 -> 77;
               case 50 -> 130;
               case 51 -> 126;
               case 52 -> 27;
               case 53 -> 67;
               case 54 -> 218;
               case 55 -> 53;
               case 56 -> 202;
               case 57 -> 14;
               case 58 -> 50;
               case 59 -> 251;
               case 60 -> 205;
               case 61 -> 242;
               case 62 -> 128;
               case 63 -> 20;
               case 64 -> 157;
               case 65 -> 197;
               case 66 -> 176;
               case 67 -> 169;
               case 68 -> 62;
               case 69 -> 36;
               case 70 -> 215;
               case 71 -> 96;
               case 72 -> 122;
               case 73 -> 116;
               case 74 -> 188;
               case 75 -> 172;
               case 76 -> 39;
               case 77 -> 134;
               case 78 -> 110;
               case 79 -> 168;
               case 80 -> 118;
               case 81 -> 225;
               case 82 -> 45;
               case 83 -> 133;
               case 84 -> 214;
               case 85 -> 250;
               case 86 -> 187;
               case 87 -> 16;
               case 88 -> 82;
               case 89 -> 155;
               case 90 -> 183;
               case 91 -> 117;
               case 92 -> 78;
               case 93 -> 103;
               case 94 -> 165;
               case 95 -> 217;
               case 96 -> 73;
               case 97 -> 147;
               case 98 -> 60;
               case 99 -> 164;
               case 100 -> 247;
               case 101 -> 72;
               case 102 -> 191;
               case 103 -> 226;
               case 104 -> 160;
               case 105 -> 87;
               case 106 -> 112;
               case 107 -> 32;
               case 108 -> 161;
               case 109 -> 3;
               case 110 -> 40;
               case 111 -> 57;
               case 112 -> 158;
               case 113 -> 114;
               case 114 -> 180;
               case 115 -> 142;
               case 116 -> 239;
               case 117 -> 76;
               case 118 -> 254;
               case 119 -> 245;
               case 120 -> 230;
               case 121 -> 206;
               case 122 -> 52;
               case 123 -> 94;
               case 124 -> 146;
               case 125 -> 231;
               case 126 -> 88;
               case 127 -> 201;
               case 128 -> 98;
               case 129 -> 136;
               case 130 -> 105;
               case 131 -> 179;
               case 132 -> 55;
               case 133 -> 38;
               case 134 -> 137;
               case 135 -> 127;
               case 136 -> 81;
               case 137 -> 74;
               case 138 -> 101;
               case 139 -> 68;
               case 140 -> 54;
               case 141 -> 42;
               case 142 -> 143;
               case 143 -> 198;
               case 144 -> 120;
               case 145 -> 253;
               case 146 -> 222;
               case 147 -> 167;
               case 148 -> 83;
               case 149 -> 124;
               case 150 -> 244;
               case 151 -> 64;
               case 152 -> 154;
               case 153 -> 46;
               case 154 -> 140;
               case 155 -> 65;
               case 156 -> 100;
               case 157 -> 2;
               case 158 -> 23;
               case 159 -> 22;
               case 160 -> 7;
               case 161 -> 132;
               case 162 -> 200;
               case 163 -> 12;
               case 164 -> 28;
               case 165 -> 149;
               case 166 -> 113;
               case 167 -> 229;
               case 168 -> 211;
               case 169 -> 4;
               case 170 -> 173;
               case 171 -> 92;
               case 172 -> 219;
               case 173 -> 185;
               case 174 -> 104;
               case 175 -> 48;
               case 176 -> 174;
               case 177 -> 240;
               case 178 -> 189;
               case 179 -> 159;
               case 180 -> 90;
               case 181 -> 208;
               case 182 -> 235;
               case 183 -> 190;
               case 184 -> 182;
               case 185 -> 115;
               case 186 -> 89;
               case 187 -> 31;
               case 188 -> 47;
               case 189 -> 228;
               case 190 -> 145;
               case 191 -> 238;
               case 192 -> 207;
               case 193 -> 56;
               case 194 -> 221;
               case 195 -> 241;
               case 196 -> 119;
               case 197 -> 148;
               case 198 -> 248;
               case 199 -> 204;
               case 200 -> 144;
               case 201 -> 131;
               case 202 -> 220;
               case 203 -> 33;
               case 204 -> 43;
               case 205 -> 5;
               case 206 -> 29;
               case 207 -> 106;
               case 208 -> 152;
               case 209 -> 59;
               case 210 -> 30;
               case 211 -> 108;
               case 212 -> 8;
               case 213 -> 121;
               case 214 -> 51;
               case 215 -> 212;
               case 216 -> 243;
               case 217 -> 35;
               case 218 -> 69;
               case 219 -> 175;
               case 220 -> 97;
               case 221 -> 24;
               case 222 -> 252;
               case 223 -> 70;
               case 224 -> 21;
               case 225 -> 75;
               case 226 -> 236;
               case 227 -> 177;
               case 228 -> 237;
               case 229 -> 15;
               case 230 -> 135;
               case 231 -> 125;
               case 232 -> 26;
               case 233 -> 213;
               case 234 -> 107;
               case 235 -> 223;
               case 236 -> 109;
               case 237 -> 246;
               case 238 -> 80;
               case 239 -> 196;
               case 240 -> 129;
               case 241 -> 111;
               case 242 -> 93;
               case 243 -> 61;
               case 244 -> 85;
               case 245 -> 153;
               case 246 -> 99;
               case 247 -> 17;
               case 248 -> 139;
               case 249 -> 224;
               case 250 -> 34;
               case 251 -> 123;
               case 252 -> 18;
               case 253 -> 11;
               case 254 -> 156;
               default -> 186;
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
       public static me.octo.client.lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var0, java.lang.String var1, int var2, boolean var3, kotlin.Triple var4, int var5, java.lang.Object var6) {
           if ((var5 & 8) != 0) var4 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
           return var0.a(var1, var2, var3, var4);
       }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl a() {
         return lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
      }
       public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker var1) { this(); }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         int var1,
         int var2,
         @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3
      ) {
         short var10001 = -3858;
         short var10002 = -23330;
         Intrinsics.checkNotNullParameter(var3, "bot");
         super();
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

      @NotNull
      public final lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1,
         int var2,
         @NotNull lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3
      ) {
         short var10001 = -3863;
         short var10002 = -31913;
         Intrinsics.checkNotNullParameter(var3, "bot");
         return new lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -3859;
         lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -7644;
         short var10002 = -3857;
         short var10003 = -16221;
         short var10004 = -3860;
         short var10005 = -32361;
         return "CombatProgress(kills=" + var3 + ", eyes=" + var2 + ", bot=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
      Object var4 = null; // PX-FIX
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
               var10000 instanceof lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         label48: {
            lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            if (var2 != null) {
               if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                  return false;
               }

               var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var2 == null) {
                  break label48;
               }

               var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if ((Boolean)var4 != ((var10001 == 0))) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
            if (((Boolean)(var4))) {
               return false;
            }

            var4 = 1;
         }

         return (boolean)var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "`\u0081±~ï \u001d\u0018I£wâ\u0014\u001b#ÊÛ\u009d+\u0094D\u0006Ýì\u008bxS\u0005\u0007%\u0001\u0093Ó¦êÝ";
         int var4 = "`\u0081±~ï \u001d\u0018I£wâ\u0014\u001b#ÊÛ\u009d+\u0094D\u0006Ýì\u008bxS\u0005\u0007%\u0001\u0093Ó¦êÝ".length();
         char var1 = 21;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 11;
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
                        case 0 -> 29;
                        case 1 -> 22;
                        case 2 -> 50;
                        case 3 -> 6;
                        case 4 -> 84;
                        case 5 -> 31;
                        default -> 29;
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
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "£ïÕ\u0003óÁß";
                     var4 = "£ïÕ\u0003óÁß".length();
                     var1 = 3;
                     var8 = -1;
               }

               var10000 = 11;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -3859) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 58;
               case 1 -> 251;
               case 2 -> 179;
               case 3 -> 18;
               case 4 -> 102;
               case 5 -> 66;
               case 6 -> 116;
               case 7 -> 187;
               case 8 -> 231;
               case 9 -> 152;
               case 10 -> 157;
               case 11 -> 232;
               case 12 -> 115;
               case 13 -> 182;
               case 14 -> 90;
               case 15 -> 194;
               case 16 -> 196;
               case 17 -> 155;
               case 18 -> 200;
               case 19 -> 91;
               case 20 -> 89;
               case 21 -> 107;
               case 22 -> 42;
               case 23 -> 145;
               case 24 -> 146;
               case 25 -> 246;
               case 26 -> 136;
               case 27 -> 242;
               case 28 -> 248;
               case 29 -> 57;
               case 30 -> 34;
               case 31 -> 79;
               case 32 -> 85;
               case 33 -> 183;
               case 34 -> 53;
               case 35 -> 236;
               case 36 -> 61;
               case 37 -> 76;
               case 38 -> 112;
               case 39 -> 37;
               case 40 -> 9;
               case 41 -> 110;
               case 42 -> 129;
               case 43 -> 133;
               case 44 -> 118;
               case 45 -> 48;
               case 46 -> 190;
               case 47 -> 235;
               case 48 -> 38;
               case 49 -> 125;
               case 50 -> 16;
               case 51 -> 132;
               case 52 -> 99;
               case 53 -> 169;
               case 54 -> 139;
               case 55 -> 135;
               case 56 -> 142;
               case 57 -> 80;
               case 58 -> 252;
               case 59 -> 1;
               case 60 -> 167;
               case 61 -> 164;
               case 62 -> 95;
               case 63 -> 83;
               case 64 -> 123;
               case 65 -> 4;
               case 66 -> 63;
               case 67 -> 199;
               case 68 -> 216;
               case 69 -> 81;
               case 70 -> 33;
               case 71 -> 203;
               case 72 -> 230;
               case 73 -> 154;
               case 74 -> 238;
               case 75 -> 62;
               case 76 -> 114;
               case 77 -> 64;
               case 78 -> 127;
               case 79 -> 101;
               case 80 -> 0;
               case 81 -> 20;
               case 82 -> 162;
               case 83 -> 254;
               case 84 -> 189;
               case 85 -> 69;
               case 86 -> 185;
               case 87 -> 10;
               case 88 -> 124;
               case 89 -> 234;
               case 90 -> 253;
               case 91 -> 72;
               case 92 -> 41;
               case 93 -> 186;
               case 94 -> 174;
               case 95 -> 31;
               case 96 -> 19;
               case 97 -> 209;
               case 98 -> 97;
               case 99 -> 60;
               case 100 -> 59;
               case 101 -> 14;
               case 102 -> 214;
               case 103 -> 192;
               case 104 -> 188;
               case 105 -> 8;
               case 106 -> 191;
               case 107 -> 24;
               case 108 -> 205;
               case 109 -> 168;
               case 110 -> 47;
               case 111 -> 54;
               case 112 -> 68;
               case 113 -> 130;
               case 114 -> 82;
               case 115 -> 147;
               case 116 -> 25;
               case 117 -> 78;
               case 118 -> 239;
               case 119 -> 229;
               case 120 -> 12;
               case 121 -> 217;
               case 122 -> 13;
               case 123 -> 150;
               case 124 -> 87;
               case 125 -> 65;
               case 126 -> 228;
               case 127 -> 28;
               case 128 -> 29;
               case 129 -> 70;
               case 130 -> 35;
               case 131 -> 3;
               case 132 -> 215;
               case 133 -> 153;
               case 134 -> 108;
               case 135 -> 159;
               case 136 -> 219;
               case 137 -> 73;
               case 138 -> 74;
               case 139 -> 111;
               case 140 -> 211;
               case 141 -> 11;
               case 142 -> 221;
               case 143 -> 240;
               case 144 -> 161;
               case 145 -> 137;
               case 146 -> 6;
               case 147 -> 51;
               case 148 -> 39;
               case 149 -> 198;
               case 150 -> 141;
               case 151 -> 100;
               case 152 -> 149;
               case 153 -> 237;
               case 154 -> 106;
               case 155 -> 165;
               case 156 -> 212;
               case 157 -> 220;
               case 158 -> 244;
               case 159 -> 67;
               case 160 -> 166;
               case 161 -> 44;
               case 162 -> 104;
               case 163 -> 250;
               case 164 -> 71;
               case 165 -> 181;
               case 166 -> 172;
               case 167 -> 96;
               case 168 -> 143;
               case 169 -> 138;
               case 170 -> 210;
               case 171 -> 94;
               case 172 -> 113;
               case 173 -> 27;
               case 174 -> 88;
               case 175 -> 197;
               case 176 -> 5;
               case 177 -> 158;
               case 178 -> 17;
               case 179 -> 206;
               case 180 -> 26;
               case 181 -> 7;
               case 182 -> 218;
               case 183 -> 151;
               case 184 -> 249;
               case 185 -> 56;
               case 186 -> 75;
               case 187 -> 117;
               case 188 -> 227;
               case 189 -> 52;
               case 190 -> 173;
               case 191 -> 184;
               case 192 -> 128;
               case 193 -> 49;
               case 194 -> 36;
               case 195 -> 171;
               case 196 -> 195;
               case 197 -> 15;
               case 198 -> 222;
               case 199 -> 21;
               case 200 -> 241;
               case 201 -> 213;
               case 202 -> 126;
               case 203 -> 176;
               case 204 -> 156;
               case 205 -> 120;
               case 206 -> 160;
               case 207 -> 148;
               case 208 -> 45;
               case 209 -> 46;
               case 210 -> 84;
               case 211 -> 175;
               case 212 -> 163;
               case 213 -> 177;
               case 214 -> 92;
               case 215 -> 170;
               case 216 -> 30;
               case 217 -> 93;
               case 218 -> 105;
               case 219 -> 40;
               case 220 -> 121;
               case 221 -> 98;
               case 222 -> 77;
               case 223 -> 22;
               case 224 -> 86;
               case 225 -> 32;
               case 226 -> 119;
               case 227 -> 140;
               case 228 -> 233;
               case 229 -> 208;
               case 230 -> 224;
               case 231 -> 255;
               case 232 -> 103;
               case 233 -> 201;
               case 234 -> 50;
               case 235 -> 207;
               case 236 -> 134;
               case 237 -> 2;
               case 238 -> 23;
               case 239 -> 202;
               case 240 -> 178;
               case 241 -> 243;
               case 242 -> 122;
               case 243 -> 204;
               case 244 -> 131;
               case 245 -> 109;
               case 246 -> 245;
               case 247 -> 180;
               case 248 -> 223;
               case 249 -> 144;
               case 250 -> 226;
               case 251 -> 247;
               case 252 -> 225;
               case 253 -> 193;
               case 254 -> 43;
               default -> 55;
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
       public static me.octo.client.lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.lIlIIlllIllIlllllIIllllIIIlIIlllIIlIIlIlllIIlllIIIlIlllllIIlllIlIIlIlIIIlllllIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, int var1, int var2, me.octo.client.lIllIlIIIIIIIlIIIIIIllIlIlIIlllllllllllIIIIIIllIlIIlIIlllIIIIIlIlllllIlllIlIIIlIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3, int var4, java.lang.Object var5) {
           if ((var4 & 4) != 0) var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
           return var0.a(var1, var2, var3);
       }
   }
}
