package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.numbers.NumberFormat;
import net.minecraft.network.chat.numbers.StyledFormat;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.scores.PlayerScoreEntry;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Scoreboard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private String lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final Regex llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @JvmField
   @NotNull
   public static llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private static Regex IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private static Set<Character> IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] f;
   private static String[] g;

   private llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll() {
      short var10001 = -31248;
      short var10002 = -4191;
      var10002 = -31245;
      short var10003 = 27957;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      short var10004 = -31235;
      short var10005 = 28905;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIlIllIlIlIlllIlllIIIlIlIlIlIlIIIlllIIllIIllIIlIIlIlIIlIlllllllIlIlIllllIIIlIIllIIllI.a()
      };
      super("Custom Scoreboard", "Makes the Scoreboard prettier.", var3, "Misc", true, var1);
      var10003 = -31233;
      var10004 = 9673;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new Regex("\\d{2}/\\d{2}/\\d{2}");
   }

   @Nullable
   public final llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] ag() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void a(
      @Nullable llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var1
   ) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   @Nullable
   public final String ah() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void e(@Nullable String var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   public final float ai() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void a(float var1) {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   private final void aG() {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0F;
   }

   @Override
   public void aB() {
      super.aB();
      this.aG();
   }

   @Override
   public void aC() {
      super.aC();
      this.aG();
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII var1) {
      float var31 = 0; // PX-FIX
      Object var18 = null; // PX-FIX
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Intrinsics.checkNotNullParameter(var1, "e");
      String var2 = var10000;
      if (var2 == null) {
         if (!this.aA()) {
            return;
         }

         var1.a(true);
      }

      Objective var3;
      Scoreboard var4;
      label57: {
         var3 = var1.l();
         Scoreboard var17 = var3.getScoreboard();
         short var10002 = -31239;
         short var10003 = -21485;
         Intrinsics.checkNotNullExpressionValue(var17, "getScoreboard(...)");
         var4 = var17;
         if (var2 == null) {
            var18 = var3.numberFormatOrDefault(StyledFormat.SIDEBAR_DEFAULT);
            if (var18 != null) {
               break label57;
            }
         }

         StyledFormat var19 = StyledFormat.SIDEBAR_DEFAULT;
         var10002 = -31240;
         var10003 = -18396;
         Intrinsics.checkNotNullExpressionValue(StyledFormat.SIDEBAR_DEFAULT, "SIDEBAR_DEFAULT");
         var18 = var19;
      }

      llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var6;
      String var27;
      label51: {
         NumberFormat var5 =((NumberFormat)( var18));
         Collection var20 = var4.listPlayerScores(var3);
         short var25 = -31236;
         short var33 = 27534;
         Intrinsics.checkNotNullExpressionValue(var20, "listPlayerScores(...)");
         Sequence var21 = SequencesKt.filter(
            CollectionsKt.asSequence(var20), (t) -> a((PlayerScoreEntry)t)
         );
         Comparator var7 = new llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll();
         Collection var14 = SequencesKt.toList(
            SequencesKt.map(
               SequencesKt.take(
                  SequencesKt.sortedWith(
                     var21,
                     new llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        var7
                     )
                  ),
                  15
               ),
               (t) -> a(var4, var5, this, (PlayerScoreEntry)t)
            )
         );
         boolean var8 = false;
         var6 = (llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])var14.toArray(
            new llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[0]
         );
         if (var2 == null) {
            Component var26 = var3.getDisplayName();
            if (var26 != null) {
               var27 = var26.getString();
               if (var27 != null) {
                  break label51;
               }
            }
         }

         var27 = "";
      }

      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b(
         var27
      );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var22 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid var10001 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      var27 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      Intrinsics.checkNotNull(this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
      float var15 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(String.valueOf(
         var22), var10001.a(var27), false);
      float var16 = var15;
      short var23 = -31246;
      short var29 = -11625;
      float var9 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, ": ", false, 2, null);
      int var10 = 0;
      int var11 = var6.length;

      while (true) {
         if (var10 < var11) {
            llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var12 = var6[var10];
            float var13 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var12.a()),
               false);
            if (var2 != null) {
               break;
            }

            label38: {
               float var30 = var12.c();
               float var34 = 0.0F;
               if (var2 == null) {
                  if (!(var30 > 0.0F)) {
                     var31 = 0.0F;
                     break label38;
                  }

                  var30 = var9;
                  var34 = var12.c();
               }

               var31 = var30 + var34;
            }

            var16 = Math.max(var16, var13 + var31);
            var10++;
            if (var2 == null) {
               continue;
            }
         }

         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var6;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var16;
         break;
      }
   }

   private static final boolean a(PlayerScoreEntry var0) {
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      short var10002 = -31234;
      short var10003 = 10620;
      Intrinsics.checkNotNullParameter(var0, "it");
      String var1 = var10000;
      boolean var2 = var0.isHidden();
      if (var1 == null) {
         var2 = !var2;
      }

      return var2;
   }

   private static final llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
      Scoreboard var0, NumberFormat var1, llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll var2, PlayerScoreEntry var3
   ) {
      Object var25 = null; // PX-FIX
      Object var24 = null; // PX-FIX
      Object var17 = null; // PX-FIX
      String var4;
      Component var7;
      Component var8;
      short var10001 = -31243;
      short var10002 = -7424;
      Intrinsics.checkNotNullParameter(var3, "scoreboardEntry");
      PlayerTeam var5 = var0.getPlayersTeam(var3.owner());
      String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
      Component var19 = var3.ownerName();
      short var10003 = -31241;
      short var10004 = 29553;
      Intrinsics.checkNotNullExpressionValue(var19, "ownerName(...)");
      Component var6 = var19;
      var7 = PlayerTeam.formatNameForTeam(var5, var6);
      var4 = var10000;
      var8 = var3.formatValue(var1);
      label80:
      if ((var4 == null && var7 != null ? var7.getString() : null) != null) {
         boolean var13 = ((me.octo.client.PXDyn)(Object)(lIlIllIlIlIlllIlllIIIlIlIlIlIlIIIlllIIllIIllIIlIIlIlIIlIlllllllIlIlIllllIIIlIIllIIllI.a())).al();
         if (var4 == null) {
            if (!var13) {
               break label80;
            }

            var13 = lIIlllllIIIIllIlIlllIlIIlIlIlIIlIlIllIIIlIIIIIllllllllIlllIIIIIlIIIlIlIlIIlllIllIlIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
               .a();
         }

         label74:
         if (!var13) {
            Regex var14 = var2.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            String var20 = var7.getString();
            var10003 = -31244;
            var10004 = 12202;
            Intrinsics.checkNotNullExpressionValue(var20, "getString(...)");
            MatchResult var9 = (var14).find( var20, 0);
            MatchResult var15 = var9;
            if (var4 == null) {
               if (var9 == null) {
                  break label74;
               }

               var15 = var9;
            }

            var7 = me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.m(var15.getValue());
         }
      }

      label92: {
         label65:
         if (var7 != null) {
            var10000 = var7.getString();
            Object var21 = var10000;
            if (var4 == null) {
               if (var10000 == null) {
                  break label65;
               }

               var10000 = var10000;
               var10001 = -31242;
               var10002 = 8544;
               var21 = "www.hypixel.ne";
            }

            var17 = StringsKt.contains(var10000, (CharSequence)var21, true);
            if (var4 == null) {
               ;
            }
            break label92;
         }

         var17 = false;
      }

      if (((Boolean)(var17))) {
         short var18 = -31237;
         var10001 = 16365;
         var7 = me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.m("polinexclient.com");
      }

      label56: {
         if (var4 == null && var7 != null) {
            var24 = var7.getString();
            if (var24 != null) {
               break label56;
            }
         }

         var24 = "";
      }

      String var12;
      label49: {
         var12 = ((String)(((String)(lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b((String)var24)))));
         if (var4 == null && var8 != null) {
            var25 = var8.getString();
            if (var25 != null) {
               break label49;
            }
         }

         var25 = "";
      }

      String var10 = ((String)(((String)(lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.b((String)var25)))));
      float var11 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a(var10),
         false);
      return new llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var12, var10, var11
      );
   }

   @NotNull
   public static final Regex aH() {
      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   @NotNull
   public static final Set<Character> aI() {
      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var22 = null; // PX-FIX
      String[] var5 = new String[16];
      int var3 = 0;
      String var2 = "\u0087\u00adô\u007fG\b³±\u00186ÒÍÿ}\u000eQ®,T|x\u009cjÓ\u0084W\u007f\u0005g\u000f\u0098\u0097\u0089¹Þ\t{4ÙGtfw\u001b7\u000egâûðù5ª®0¶\u0095Ý\u0017\u007f\u001es\u001b\t}\\&äÒE÷\u0004±¶Mk±#O\u009c \u0089Ö!)Z\u0090¸\u008b{Ð\u0002\u0004_bÝ»We¢¬ÖkTmâÙ\u0012wr&\b0ëiT<§àmÇ>ò±P¶°r¶¨\u0081D¯\u0094³\u009cúcßbÆo÷\u0084/}Ún[\u0085!\u0086ê\u0090¯þ\u009c\u008a\u00981\u0097r\u0004\u00899¡'Ü\u0081&Ï\u0003°mu´N\u008d\u0090\u0004\u001cý`3ºÄ\u009bM2ÓX4S\u0011\u009fGCq\u0012ÙæòÝàðó Þ\u0011mã\u0011¥\u0005ðL\u007f²g¢\u0006f\u009f\u009f\u001d[U÷+\u0002J¾\u0004ÖA¥9\u0015\u0007\u001b\u009ae\u0016Zÿ\u0089\u0091ý\u009eèåf\u0001Å)½.\u0012\u0001\u0011d\u0011vÿI¾ô'ÃjÊo\u0084fS\u000eà\rî0V-Í,\u008cô4ñÙÌ\u0084";
      int var4 = "\u0087\u00adô\u007fG\b³±\u00186ÒÍÿ}\u000eQ®,T|x\u009cjÓ\u0084W\u007f\u0005g\u000f\u0098\u0097\u0089¹Þ\t{4ÙGtfw\u001b7\u000egâûðù5ª®0¶\u0095Ý\u0017\u007f\u001es\u001b\t}\\&äÒE÷\u0004±¶Mk±#O\u009c \u0089Ö!)Z\u0090¸\u008b{Ð\u0002\u0004_bÝ»We¢¬ÖkTmâÙ\u0012wr&\b0ëiT<§àmÇ>ò±P¶°r¶¨\u0081D¯\u0094³\u009cúcßbÆo÷\u0084/}Ún[\u0085!\u0086ê\u0090¯þ\u009c\u008a\u00981\u0097r\u0004\u00899¡'Ü\u0081&Ï\u0003°mu´N\u008d\u0090\u0004\u001cý`3ºÄ\u009bM2ÓX4S\u0011\u009fGCq\u0012ÙæòÝàðó Þ\u0011mã\u0011¥\u0005ðL\u007f²g¢\u0006f\u009f\u009f\u001d[U÷+\u0002J¾\u0004ÖA¥9\u0015\u0007\u001b\u009ae\u0016Zÿ\u0089\u0091ý\u009eèåf\u0001Å)½.\u0012\u0001\u0011d\u0011vÿI¾ô'ÃjÊo\u0084fS\u000eà\rî0V-Í,\u008cô4ñÙÌ\u0084"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
while (true) {
         short var10000 = 106;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var27 = var10001.toCharArray();
               int var10004 = var27.length;
               int var6 = 0;
               byte var30 = (byte)var10000;
               var22 = var27;
               int var15 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var27;
                  var36 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var30 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var40 = var27;
                  var36 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var40[var10006] = (char)(var40[var10006] ^ var36 ^ switch (var6 % 7) {
                     case 0 -> 117;
                     case 1 -> 73;
                     case 2 -> 97;
                     case 3 -> 56;
                     case 4 -> 3;
                     case 5 -> 64;
                     default -> 65;
                  });
                  var6++;
                  if (var30 == 0) {
                     var10006 = var30;
                     var40 = var22;
                     var36 = var30;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var40 = var22;
                     var36 = var30;
                     var10006 = var6;
                  }
               }
            }

            String var32 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var32;
                  if ((var8 += var1) >= var4) {
                     f = var5;
                     g = new String[16];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll();
                     var10002 = -31238;
                     short var33 = -18748;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new Regex("§[0-9a-fk-or]");
                     var10000 = -31247;
                     short var17 = 587;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = StringsKt.toSet(
                        "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+[]{};:'\",.<>?/|\\`~ §\n\r"
                     );
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var32;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "¶a\u00adìHÇ\u001e)·\u0007ãtYðÛ7:~\u000f¿-\u000eÚ+ûW\u007f\u009c\u009aC\u009b¿<j";
                  var4 = "¶a\u00adìHÇ\u001e)·\u0007ãtYðÛ7:~\u000f¿-\u000eÚ+ûW\u007f\u009c\u009aC\u009b¿<j".length();
                  var1 = 18;
                  var8 = -1;
            }

            var10000 = 10;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -31241) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 245;
            case 1 -> 1;
            case 2 -> 90;
            case 3 -> 107;
            case 4 -> 213;
            case 5 -> 129;
            case 6 -> 42;
            case 7 -> 74;
            case 8 -> 43;
            case 9 -> 13;
            case 10 -> 36;
            case 11 -> 97;
            case 12 -> 2;
            case 13 -> 250;
            case 14 -> 83;
            case 15 -> 167;
            case 16 -> 79;
            case 17 -> 127;
            case 18 -> 215;
            case 19 -> 85;
            case 20 -> 71;
            case 21 -> 108;
            case 22 -> 3;
            case 23 -> 44;
            case 24 -> 26;
            case 25 -> 57;
            case 26 -> 28;
            case 27 -> 118;
            case 28 -> 141;
            case 29 -> 130;
            case 30 -> 11;
            case 31 -> 15;
            case 32 -> 8;
            case 33 -> 196;
            case 34 -> 172;
            case 35 -> 61;
            case 36 -> 132;
            case 37 -> 169;
            case 38 -> 25;
            case 39 -> 237;
            case 40 -> 153;
            case 41 -> 143;
            case 42 -> 33;
            case 43 -> 46;
            case 44 -> 126;
            case 45 -> 92;
            case 46 -> 185;
            case 47 -> 65;
            case 48 -> 128;
            case 49 -> 176;
            case 50 -> 140;
            case 51 -> 179;
            case 52 -> 104;
            case 53 -> 192;
            case 54 -> 177;
            case 55 -> 166;
            case 56 -> 88;
            case 57 -> 246;
            case 58 -> 17;
            case 59 -> 212;
            case 60 -> 48;
            case 61 -> 204;
            case 62 -> 121;
            case 63 -> 66;
            case 64 -> 16;
            case 65 -> 211;
            case 66 -> 142;
            case 67 -> 232;
            case 68 -> 188;
            case 69 -> 174;
            case 70 -> 63;
            case 71 -> 248;
            case 72 -> 6;
            case 73 -> 164;
            case 74 -> 229;
            case 75 -> 202;
            case 76 -> 91;
            case 77 -> 240;
            case 78 -> 39;
            case 79 -> 40;
            case 80 -> 194;
            case 81 -> 94;
            case 82 -> 37;
            case 83 -> 244;
            case 84 -> 138;
            case 85 -> 64;
            case 86 -> 35;
            case 87 -> 228;
            case 88 -> 82;
            case 89 -> 70;
            case 90 -> 49;
            case 91 -> 254;
            case 92 -> 195;
            case 93 -> 173;
            case 94 -> 106;
            case 95 -> 47;
            case 96 -> 251;
            case 97 -> 253;
            case 98 -> 135;
            case 99 -> 102;
            case 100 -> 184;
            case 101 -> 112;
            case 102 -> 29;
            case 103 -> 239;
            case 104 -> 186;
            case 105 -> 208;
            case 106 -> 21;
            case 107 -> 183;
            case 108 -> 20;
            case 109 -> 30;
            case 110 -> 230;
            case 111 -> 73;
            case 112 -> 72;
            case 113 -> 147;
            case 114 -> 193;
            case 115 -> 32;
            case 116 -> 233;
            case 117 -> 41;
            case 118 -> 151;
            case 119 -> 180;
            case 120 -> 139;
            case 121 -> 156;
            case 122 -> 206;
            case 123 -> 226;
            case 124 -> 34;
            case 125 -> 99;
            case 126 -> 114;
            case 127 -> 205;
            case 128 -> 222;
            case 129 -> 115;
            case 130 -> 77;
            case 131 -> 249;
            case 132 -> 133;
            case 133 -> 76;
            case 134 -> 50;
            case 135 -> 12;
            case 136 -> 95;
            case 137 -> 187;
            case 138 -> 93;
            case 139 -> 98;
            case 140 -> 117;
            case 141 -> 52;
            case 142 -> 252;
            case 143 -> 81;
            case 144 -> 0;
            case 145 -> 5;
            case 146 -> 234;
            case 147 -> 209;
            case 148 -> 223;
            case 149 -> 220;
            case 150 -> 62;
            case 151 -> 199;
            case 152 -> 122;
            case 153 -> 224;
            case 154 -> 59;
            case 155 -> 69;
            case 156 -> 10;
            case 157 -> 160;
            case 158 -> 113;
            case 159 -> 161;
            case 160 -> 111;
            case 161 -> 210;
            case 162 -> 60;
            case 163 -> 67;
            case 164 -> 144;
            case 165 -> 165;
            case 166 -> 58;
            case 167 -> 103;
            case 168 -> 231;
            case 169 -> 154;
            case 170 -> 134;
            case 171 -> 7;
            case 172 -> 24;
            case 173 -> 218;
            case 174 -> 148;
            case 175 -> 136;
            case 176 -> 216;
            case 177 -> 9;
            case 178 -> 96;
            case 179 -> 18;
            case 180 -> 242;
            case 181 -> 197;
            case 182 -> 149;
            case 183 -> 152;
            case 184 -> 243;
            case 185 -> 78;
            case 186 -> 227;
            case 187 -> 87;
            case 188 -> 4;
            case 189 -> 158;
            case 190 -> 170;
            case 191 -> 182;
            case 192 -> 145;
            case 193 -> 119;
            case 194 -> 89;
            case 195 -> 131;
            case 196 -> 54;
            case 197 -> 217;
            case 198 -> 27;
            case 199 -> 123;
            case 200 -> 200;
            case 201 -> 101;
            case 202 -> 178;
            case 203 -> 31;
            case 204 -> 45;
            case 205 -> 75;
            case 206 -> 189;
            case 207 -> 190;
            case 208 -> 219;
            case 209 -> 23;
            case 210 -> 247;
            case 211 -> 162;
            case 212 -> 241;
            case 213 -> 56;
            case 214 -> 22;
            case 215 -> 14;
            case 216 -> 125;
            case 217 -> 124;
            case 218 -> 51;
            case 219 -> 55;
            case 220 -> 146;
            case 221 -> 105;
            case 222 -> 157;
            case 223 -> 171;
            case 224 -> 168;
            case 225 -> 201;
            case 226 -> 203;
            case 227 -> 191;
            case 228 -> 86;
            case 229 -> 207;
            case 230 -> 236;
            case 231 -> 80;
            case 232 -> 225;
            case 233 -> 181;
            case 234 -> 175;
            case 235 -> 38;
            case 236 -> 255;
            case 237 -> 235;
            case 238 -> 109;
            case 239 -> 159;
            case 240 -> 53;
            case 241 -> 110;
            case 242 -> 19;
            case 243 -> 120;
            case 244 -> 137;
            case 245 -> 198;
            case 246 -> 68;
            case 247 -> 84;
            case 248 -> 155;
            case 249 -> 238;
            case 250 -> 214;
            case 251 -> 100;
            case 252 -> 163;
            case 253 -> 116;
            case 254 -> 221;
            default -> 150;
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

   @Environment(EnvType.CLIENT)
   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull String var1, @NotNull String var2, float var3) {
         short var10001 = -22994;
         short var10002 = 14488;
         Intrinsics.checkNotNullParameter(var1, "name");
         var10001 = -22995;
         var10002 = -4168;
         Intrinsics.checkNotNullParameter(var2, "score");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull String var1, @NotNull String var2, float var3
      ) {
         short var10001 = -23000;
         short var10002 = 3839;
         Intrinsics.checkNotNullParameter(var1, "name");
         var10001 = -22993;
         var10002 = -4211;
         Intrinsics.checkNotNullParameter(var2, "score");
         return new llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -22999;
         float var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 29435;
         short var10002 = -22996;
         short var10003 = 19719;
         short var10004 = -22997;
         short var10005 = -3689;
         return "SidebarEntry(name=" + var3 + ", score=" + var2 + ", scoreWidth=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + Float.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 == null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 == null) {
            if (var4 == 0) {
               return false;
            }

            var4 = Float.compare(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "\u0011¹\u0085\u0080\u009e\bÎkÖàaÕ\u008c©\u0005ß\u000e\\v¥\u0004õ9¥Å\u0012\u008c\\\u0019``\u0010\u0017\u0018£Oo£M\u000b÷¼\u0003 ";
         int var4 = "\u0011¹\u0085\u0080\u009e\bÎkÖàaÕ\u008c©\u0005ß\u000e\\v¥\u0004õ9¥Å\u0012\u008c\\\u0019``\u0010\u0017\u0018£Oo£M\u000b÷¼\u0003 ".length();
         char var1 = 5;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 37;
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
                        case 0 -> 49;
                        case 1 -> 82;
                        case 2 -> 114;
                        case 3 -> 1;
                        case 4 -> 6;
                        case 5 -> 21;
                        default -> 6;
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

                     var2 = "/r¿í\r¶?\u0098+éíÜ\u0085iý\u0096·à";
                     var4 = "/r¿í\r¶?\u0098+éíÜ\u0085iý\u0096·à".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 109;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -22995) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 49;
               case 1 -> 145;
               case 2 -> 143;
               case 3 -> 242;
               case 4 -> 5;
               case 5 -> 66;
               case 6 -> 98;
               case 7 -> 132;
               case 8 -> 139;
               case 9 -> 156;
               case 10 -> 252;
               case 11 -> 110;
               case 12 -> 101;
               case 13 -> 111;
               case 14 -> 227;
               case 15 -> 134;
               case 16 -> 185;
               case 17 -> 233;
               case 18 -> 175;
               case 19 -> 243;
               case 20 -> 187;
               case 21 -> 238;
               case 22 -> 118;
               case 23 -> 8;
               case 24 -> 160;
               case 25 -> 212;
               case 26 -> 193;
               case 27 -> 114;
               case 28 -> 35;
               case 29 -> 95;
               case 30 -> 40;
               case 31 -> 75;
               case 32 -> 53;
               case 33 -> 46;
               case 34 -> 152;
               case 35 -> 221;
               case 36 -> 16;
               case 37 -> 223;
               case 38 -> 125;
               case 39 -> 93;
               case 40 -> 150;
               case 41 -> 107;
               case 42 -> 168;
               case 43 -> 62;
               case 44 -> 219;
               case 45 -> 215;
               case 46 -> 112;
               case 47 -> 15;
               case 48 -> 169;
               case 49 -> 50;
               case 50 -> 87;
               case 51 -> 211;
               case 52 -> 80;
               case 53 -> 178;
               case 54 -> 218;
               case 55 -> 201;
               case 56 -> 228;
               case 57 -> 133;
               case 58 -> 20;
               case 59 -> 131;
               case 60 -> 210;
               case 61 -> 106;
               case 62 -> 126;
               case 63 -> 71;
               case 64 -> 241;
               case 65 -> 128;
               case 66 -> 147;
               case 67 -> 146;
               case 68 -> 234;
               case 69 -> 254;
               case 70 -> 55;
               case 71 -> 149;
               case 72 -> 2;
               case 73 -> 92;
               case 74 -> 180;
               case 75 -> 89;
               case 76 -> 11;
               case 77 -> 225;
               case 78 -> 43;
               case 79 -> 103;
               case 80 -> 25;
               case 81 -> 248;
               case 82 -> 47;
               case 83 -> 231;
               case 84 -> 76;
               case 85 -> 137;
               case 86 -> 59;
               case 87 -> 27;
               case 88 -> 21;
               case 89 -> 24;
               case 90 -> 158;
               case 91 -> 69;
               case 92 -> 32;
               case 93 -> 94;
               case 94 -> 79;
               case 95 -> 240;
               case 96 -> 161;
               case 97 -> 6;
               case 98 -> 30;
               case 99 -> 250;
               case 100 -> 249;
               case 101 -> 144;
               case 102 -> 153;
               case 103 -> 140;
               case 104 -> 102;
               case 105 -> 116;
               case 106 -> 64;
               case 107 -> 171;
               case 108 -> 141;
               case 109 -> 26;
               case 110 -> 54;
               case 111 -> 1;
               case 112 -> 28;
               case 113 -> 4;
               case 114 -> 148;
               case 115 -> 226;
               case 116 -> 97;
               case 117 -> 203;
               case 118 -> 18;
               case 119 -> 19;
               case 120 -> 52;
               case 121 -> 222;
               case 122 -> 14;
               case 123 -> 22;
               case 124 -> 176;
               case 125 -> 198;
               case 126 -> 255;
               case 127 -> 23;
               case 128 -> 196;
               case 129 -> 100;
               case 130 -> 83;
               case 131 -> 142;
               case 132 -> 86;
               case 133 -> 177;
               case 134 -> 12;
               case 135 -> 239;
               case 136 -> 163;
               case 137 -> 82;
               case 138 -> 34;
               case 139 -> 31;
               case 140 -> 77;
               case 141 -> 108;
               case 142 -> 220;
               case 143 -> 191;
               case 144 -> 123;
               case 145 -> 44;
               case 146 -> 151;
               case 147 -> 29;
               case 148 -> 85;
               case 149 -> 74;
               case 150 -> 186;
               case 151 -> 237;
               case 152 -> 48;
               case 153 -> 99;
               case 154 -> 60;
               case 155 -> 224;
               case 156 -> 245;
               case 157 -> 39;
               case 158 -> 202;
               case 159 -> 154;
               case 160 -> 122;
               case 161 -> 96;
               case 162 -> 205;
               case 163 -> 157;
               case 164 -> 190;
               case 165 -> 235;
               case 166 -> 68;
               case 167 -> 70;
               case 168 -> 135;
               case 169 -> 84;
               case 170 -> 120;
               case 171 -> 109;
               case 172 -> 57;
               case 173 -> 65;
               case 174 -> 181;
               case 175 -> 45;
               case 176 -> 51;
               case 177 -> 194;
               case 178 -> 188;
               case 179 -> 155;
               case 180 -> 207;
               case 181 -> 184;
               case 182 -> 63;
               case 183 -> 91;
               case 184 -> 166;
               case 185 -> 124;
               case 186 -> 73;
               case 187 -> 200;
               case 188 -> 78;
               case 189 -> 138;
               case 190 -> 104;
               case 191 -> 58;
               case 192 -> 232;
               case 193 -> 13;
               case 194 -> 199;
               case 195 -> 10;
               case 196 -> 113;
               case 197 -> 72;
               case 198 -> 88;
               case 199 -> 159;
               case 200 -> 90;
               case 201 -> 130;
               case 202 -> 136;
               case 203 -> 213;
               case 204 -> 81;
               case 205 -> 170;
               case 206 -> 61;
               case 207 -> 37;
               case 208 -> 42;
               case 209 -> 183;
               case 210 -> 246;
               case 211 -> 244;
               case 212 -> 67;
               case 213 -> 179;
               case 214 -> 41;
               case 215 -> 127;
               case 216 -> 56;
               case 217 -> 217;
               case 218 -> 17;
               case 219 -> 214;
               case 220 -> 208;
               case 221 -> 7;
               case 222 -> 121;
               case 223 -> 204;
               case 224 -> 105;
               case 225 -> 9;
               case 226 -> 0;
               case 227 -> 119;
               case 228 -> 174;
               case 229 -> 3;
               case 230 -> 230;
               case 231 -> 117;
               case 232 -> 167;
               case 233 -> 206;
               case 234 -> 209;
               case 235 -> 172;
               case 236 -> 197;
               case 237 -> 33;
               case 238 -> 216;
               case 239 -> 182;
               case 240 -> 247;
               case 241 -> 189;
               case 242 -> 162;
               case 243 -> 165;
               case 244 -> 251;
               case 245 -> 195;
               case 246 -> 115;
               case 247 -> 229;
               case 248 -> 129;
               case 249 -> 164;
               case 250 -> 192;
               case 251 -> 236;
               case 252 -> 38;
               case 253 -> 36;
               case 254 -> 253;
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

   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1, String var2, String var3, float var4, int var5, Object var6) {
      if ((var5 & 1) != 0) {
         var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var5 & 2) != 0) {
         var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var5 & 4) != 0) {
         var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      return var1.a(var2, var3, var4);
   }

   }

   public static final class PXEvMid {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvMid(Object... px) {
        }

      private static String[] a;
      private static String[] b;

      private PXEvMid() {
      }

      // jar: public <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
      public PXEvMid(kotlin.jvm.internal.DefaultConstructorMarker var0) {
         this();
      }

      // jar: public static final String a(L<self>;Ljava/lang/String;)Ljava/lang/String; (synthetic accessor)
      @NotNull
      public static String a(@NotNull PXEvMid var0, @NotNull String var1) {
         return var0.b(var1);
      }

      @NotNull
      public final String a(@NotNull String var1) {
         short var10001 = 20176;
         short var10002 = 4632;
         Intrinsics.checkNotNullParameter(var1, "text");
         CharSequence var2 = var1;
         Regex var3 = llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         String var4 = "";
         return var3.replace(var2, var4);
      }

      private final String b(String var1) {
         boolean var4 = false;
         String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         CharSequence var5 = var1;
         var var6 = new StringBuilder();
         boolean var7 = false;
         int var8 = 0;
         String var2 = var10000;
         int var9 = var5.length();

         while (var8 < var9) {
            char var10 = var5.charAt(var8);
            boolean var12 = false;
            if (var2 == null) {
               if (llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
                  .contains(var10)) {
                  var6.append(var10);
               }

               var8++;
            }

            if (var2 != null) {
               break;
            }
         }

         return var6.toString();
      }

      private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll c(String var1) {
         String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         String var10001 = var1.toLowerCase(Locale.ROOT);
         short var10003 = 20177;
         short var10004 = -24085;
         Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
         String var3 = var10001;
         String var2 = var10000;
         int var4 = var3.hashCode();
         if (var2 == null) {
            switch (var4) {
               case 5225:
                  short var21 = 20180;
                  short var36 = 12366;
                  var4 = ((var3.equals("§0")) ? 1 : 0);
                  break;
               case 5226:
                  short var20 = 20162;
                  short var35 = -13146;
                  if (var3.equals("§1")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 170);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5227:
                  short var19 = 20174;
                  short var34 = 8170;
                  if (var3.equals("§2")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 170, 0);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5228:
                  short var18 = 20181;
                  short var33 = 27129;
                  if (var3.equals("§3")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 170, 170);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5229:
                  short var17 = 20168;
                  short var32 = -18500;
                  if (var3.equals("§4")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(170, 0, 0);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5230:
                  short var16 = 20161;
                  short var31 = -778;
                  if (var3.equals("§5")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(170, 0, 170);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5231:
                  short var15 = 20163;
                  short var30 = -3434;
                  if (var3.equals("§6")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 170, 0);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5232:
                  short var14 = 20175;
                  short var29 = 16601;
                  if (var3.equals("§7")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(170, 170, 170);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5233:
                  short var13 = 20172;
                  short var28 = 22780;
                  if (var3.equals("§8")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(85, 85, 85);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5234:
                  short var12 = 20169;
                  short var27 = 6067;
                  if (var3.equals("§9")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(85, 85, 255);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5274:
                  short var11 = 20160;
                  short var26 = -2995;
                  if (var3.equals("§a")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(85, 255, 85);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5275:
                  short var10 = 20171;
                  short var25 = 12627;
                  if (var3.equals("§b")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(85, 255, 255);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5276:
                  short var9 = 20165;
                  short var24 = 6588;
                  if (var3.equals("§c")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 85, 85);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5277:
                  short var8 = 20170;
                  short var23 = 30045;
                  if (var3.equals("§d")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 85, 255);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5278:
                  short var7 = 20178;
                  short var22 = 23984;
                  if (var3.equals("§e")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 85);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               case 5279:
                  short var6 = 20166;
                  short var10002 = 8331;
                  if (var3.equals("§f")) {
                     return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
                  }

                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
               default:
                  return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
            }
         }

         return var4 != 0
            ? new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0)
            : new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255);
      }

      @NotNull
      public final List<llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> d(
         @NotNull String var1
      ) {
      int var8 = 0; // PX-FIX
         int var10001 = 20167;
         short var10002 = -4420;
         Intrinsics.checkNotNullParameter(var1, "text");
         String var10000 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
         List var3 = new ArrayList();
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4 = new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
            255, 255, 255
         );
         StringBuilder var5 = new StringBuilder();
         String var2 = var10000;
         int var6 = 0;

         while (true) {
            if (var6 < var1.length()) {
               var8 = var6;
               if (var2 != null) {
                  break;
               }

               label65: {
                  label66: {
                     var10001 = var1.length() - 1;
                     if (var2 == null) {
                        if (var6 >= var10001) {
                           break label65;
                        }

                        var8 = var1.charAt(var6);
                        if (var2 != null) {
                           break label66;
                        }

                        var10001 = 167;
                     }

                     if (var8 != var10001) {
                        break label65;
                     }

                     var8 = var5.length();
                  }

                  if (var2 == null) {
                     var8 = var8 > 0 ? 1 : 0;
                  }

                  if (var8 != 0) {
                     String var10003 = var5.toString();
                     short var10005 = 20173;
                     short var10006 = -18394;
                     Intrinsics.checkNotNullExpressionValue(var10003, "toString(...)");
                     var3.add(
                        new llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                           var10003, var4
                        )
                     );
                     var5 = new StringBuilder();
                  }

                  var10000 = var1.substring(var6, var6 + 2);
                  var10002 = 20179;
                  short var12 = -18076;
                  Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                  String var7 = var10000;
                  var4 = this.c(var7);
                  var6 += 2;
                  if (var2 == null) {
                     continue;
                  }
               }

               var5.append(var1.charAt(var6));
               var6++;
               if (var2 == null) {
                  continue;
               }
            }

            var8 = var5.length();
            break;
         }

         if (var2 == null) {
            var8 = var8 > 0 ? 1 : 0;
         }

         if (var8 != 0) {
            String var13 = var5.toString();
            short var14 = 20164;
            short var15 = 13053;
            Intrinsics.checkNotNullExpressionValue(var13, "toString(...)");
            var3.add(
               new llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                  var13, var4
               )
            );
         }

         return var3;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[22];
         int var3 = 0;
         String var2 = "«v\u0002Í9\u0002ãÃ\u0002øå\u0002*Ø\r\u001b\u009aâ;WDVnþ@B\u008d:\u0004ïùW\u001c\u0002îÑ\u0002\u0002e\u0002*é\u0002²À\u0002Ê´\rö*_-à\u0086 6 K\u0099ìA\u0002\u0091ÿ\u0002\u000bu\u0002\u0015\u0080\u0010gÿr\u008c¼Æ\u0092\u0097°\u0082 %CIhT\u0004Ô®0ö\u000eX\\\\½\u0091hO\u009auð\u0095]Ç\u0087\u0002H¨";
         int var4 = "«v\u0002Í9\u0002ãÃ\u0002øå\u0002*Ø\r\u001b\u009aâ;WDVnþ@B\u008d:\u0004ïùW\u001c\u0002îÑ\u0002\u0002e\u0002*é\u0002²À\u0002Ê´\rö*_-à\u0086 6 K\u0099ìA\u0002\u0091ÿ\u0002\u000bu\u0002\u0015\u0080\u0010gÿr\u008c¼Æ\u0092\u0097°\u0082 %CIhT\u0004Ô®0ö\u000eX\\\\½\u0091hO\u009auð\u0095]Ç\u0087\u0002H¨"
            .length();
         char var1 = 2;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 61;
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
                        case 0 -> 63;
                        case 1 -> 106;
                        case 2 -> 85;
                        case 3 -> 73;
                        case 4 -> 112;
                        case 5 -> 3;
                        default -> 122;
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
                        b = new String[22];
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

                     var2 = "ò£\u0002äD";
                     var4 = "ò£\u0002äD".length();
                     var1 = 2;
                     var8 = -1;
               }

               var10000 = 57;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 20161) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 12;
               case 1 -> 130;
               case 2 -> 88;
               case 3 -> 191;
               case 4 -> 10;
               case 5 -> 114;
               case 6 -> 75;
               case 7 -> 209;
               case 8 -> 138;
               case 9 -> 43;
               case 10 -> 28;
               case 11 -> 221;
               case 12 -> 48;
               case 13 -> 53;
               case 14 -> 127;
               case 15 -> 163;
               case 16 -> 15;
               case 17 -> 50;
               case 18 -> 83;
               case 19 -> 63;
               case 20 -> 250;
               case 21 -> 216;
               case 22 -> 253;
               case 23 -> 58;
               case 24 -> 46;
               case 25 -> 144;
               case 26 -> 23;
               case 27 -> 92;
               case 28 -> 33;
               case 29 -> 220;
               case 30 -> 117;
               case 31 -> 148;
               case 32 -> 49;
               case 33 -> 38;
               case 34 -> 241;
               case 35 -> 153;
               case 36 -> 237;
               case 37 -> 39;
               case 38 -> 14;
               case 39 -> 19;
               case 40 -> 45;
               case 41 -> 140;
               case 42 -> 164;
               case 43 -> 171;
               case 44 -> 42;
               case 45 -> 82;
               case 46 -> 54;
               case 47 -> 41;
               case 48 -> 156;
               case 49 -> 137;
               case 50 -> 175;
               case 51 -> 207;
               case 52 -> 206;
               case 53 -> 239;
               case 54 -> 236;
               case 55 -> 113;
               case 56 -> 176;
               case 57 -> 147;
               case 58 -> 77;
               case 59 -> 196;
               case 60 -> 128;
               case 61 -> 27;
               case 62 -> 145;
               case 63 -> 215;
               case 64 -> 224;
               case 65 -> 37;
               case 66 -> 109;
               case 67 -> 213;
               case 68 -> 165;
               case 69 -> 203;
               case 70 -> 179;
               case 71 -> 222;
               case 72 -> 5;
               case 73 -> 26;
               case 74 -> 195;
               case 75 -> 11;
               case 76 -> 181;
               case 77 -> 182;
               case 78 -> 141;
               case 79 -> 168;
               case 80 -> 44;
               case 81 -> 121;
               case 82 -> 160;
               case 83 -> 2;
               case 84 -> 7;
               case 85 -> 81;
               case 86 -> 242;
               case 87 -> 169;
               case 88 -> 66;
               case 89 -> 129;
               case 90 -> 59;
               case 91 -> 65;
               case 92 -> 89;
               case 93 -> 21;
               case 94 -> 125;
               case 95 -> 201;
               case 96 -> 86;
               case 97 -> 249;
               case 98 -> 192;
               case 99 -> 143;
               case 100 -> 173;
               case 101 -> 218;
               case 102 -> 225;
               case 103 -> 172;
               case 104 -> 6;
               case 105 -> 178;
               case 106 -> 211;
               case 107 -> 167;
               case 108 -> 57;
               case 109 -> 244;
               case 110 -> 40;
               case 111 -> 184;
               case 112 -> 151;
               case 113 -> 16;
               case 114 -> 161;
               case 115 -> 187;
               case 116 -> 24;
               case 117 -> 4;
               case 118 -> 25;
               case 119 -> 108;
               case 120 -> 180;
               case 121 -> 142;
               case 122 -> 248;
               case 123 -> 228;
               case 124 -> 136;
               case 125 -> 204;
               case 126 -> 122;
               case 127 -> 79;
               case 128 -> 31;
               case 129 -> 116;
               case 130 -> 217;
               case 131 -> 194;
               case 132 -> 107;
               case 133 -> 177;
               case 134 -> 170;
               case 135 -> 231;
               case 136 -> 134;
               case 137 -> 154;
               case 138 -> 198;
               case 139 -> 246;
               case 140 -> 158;
               case 141 -> 106;
               case 142 -> 149;
               case 143 -> 150;
               case 144 -> 104;
               case 145 -> 132;
               case 146 -> 212;
               case 147 -> 200;
               case 148 -> 252;
               case 149 -> 51;
               case 150 -> 36;
               case 151 -> 210;
               case 152 -> 55;
               case 153 -> 243;
               case 154 -> 223;
               case 155 -> 135;
               case 156 -> 119;
               case 157 -> 155;
               case 158 -> 99;
               case 159 -> 247;
               case 160 -> 157;
               case 161 -> 110;
               case 162 -> 233;
               case 163 -> 159;
               case 164 -> 70;
               case 165 -> 193;
               case 166 -> 67;
               case 167 -> 112;
               case 168 -> 34;
               case 169 -> 232;
               case 170 -> 52;
               case 171 -> 3;
               case 172 -> 22;
               case 173 -> 186;
               case 174 -> 245;
               case 175 -> 98;
               case 176 -> 60;
               case 177 -> 71;
               case 178 -> 162;
               case 179 -> 87;
               case 180 -> 152;
               case 181 -> 94;
               case 182 -> 226;
               case 183 -> 208;
               case 184 -> 188;
               case 185 -> 185;
               case 186 -> 202;
               case 187 -> 56;
               case 188 -> 0;
               case 189 -> 120;
               case 190 -> 189;
               case 191 -> 111;
               case 192 -> 69;
               case 193 -> 174;
               case 194 -> 90;
               case 195 -> 29;
               case 196 -> 240;
               case 197 -> 95;
               case 198 -> 20;
               case 199 -> 227;
               case 200 -> 238;
               case 201 -> 131;
               case 202 -> 72;
               case 203 -> 230;
               case 204 -> 234;
               case 205 -> 85;
               case 206 -> 205;
               case 207 -> 229;
               case 208 -> 68;
               case 209 -> 251;
               case 210 -> 105;
               case 211 -> 17;
               case 212 -> 101;
               case 213 -> 146;
               case 214 -> 118;
               case 215 -> 93;
               case 216 -> 32;
               case 217 -> 199;
               case 218 -> 78;
               case 219 -> 74;
               case 220 -> 126;
               case 221 -> 100;
               case 222 -> 103;
               case 223 -> 254;
               case 224 -> 61;
               case 225 -> 80;
               case 226 -> 9;
               case 227 -> 91;
               case 228 -> 84;
               case 229 -> 123;
               case 230 -> 13;
               case 231 -> 18;
               case 232 -> 96;
               case 233 -> 219;
               case 234 -> 214;
               case 235 -> 235;
               case 236 -> 64;
               case 237 -> 35;
               case 238 -> 62;
               case 239 -> 97;
               case 240 -> 190;
               case 241 -> 124;
               case 242 -> 255;
               case 243 -> 8;
               case 244 -> 166;
               case 245 -> 183;
               case 246 -> 139;
               case 247 -> 1;
               case 248 -> 102;
               case 249 -> 133;
               case 250 -> 73;
               case 251 -> 115;
               case 252 -> 47;
               case 253 -> 197;
               case 254 -> 30;
               default -> 76;
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

      public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
         @NotNull
         private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         @NotNull
         private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         private static String[] a;
         private static String[] b;

         public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            @NotNull String var1, @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2
         ) {
            short var10001 = -12607;
            short var10002 = -27904;
            Intrinsics.checkNotNullParameter(var1, "text");
            var10001 = -12603;
            var10002 = 10016;
            Intrinsics.checkNotNullParameter(var2, "color");
            super();
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         }

         @NotNull
         public final String a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         @NotNull
         public final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         @NotNull
         public final String c() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         @NotNull
         public final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll d() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         @NotNull
         public final llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
            @NotNull String var1, @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2
         ) {
            short var10001 = -12606;
            short var10002 = 32346;
            Intrinsics.checkNotNullParameter(var1, "text");
            var10001 = -12608;
            var10002 = -24059;
            Intrinsics.checkNotNullParameter(var2, "color");
            return new llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var1, var2
            );
         }

         // jar: public static a(L<self>;Ljava/lang/String;L<color>;ILjava/lang/Object;)L<self>; (Kotlin $default bridge)
         public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
            @NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
            @NotNull String var1,
            @NotNull me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
            int var3, @Nullable Object var4
         ) {
            if ((var3 & 1) != 0) {
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
            short var10002 = -12605;
            short var10003 = -26080;
            var10003 = -12604;
            short var10004 = -4614;
            return "ColoredSegment(text="
               + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               + ", color="
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
            String var2 = lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.l();
            Object var10000 = this;
            if (var2 == null) {
               if (this == var1) {
                  return true;
               }

               var10000 = var1;
            }

            if (var2 == null) {
               if (!(
                  var10000 instanceof llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
               )) {
                  return false;
               }

               var10000 = var1;
            }

            llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (llIllllIllllIllIlIIIIIIllIIIlIIIlllIlllIIIlIllIIIlIlllIIlIIlIIIIlIIllIlIllIllIlllIIll.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
            boolean var4 = Intrinsics.areEqual(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            if (var2 == null) {
               if (!var4) {
                  return false;
               }

               var4 = Intrinsics.areEqual(
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               );
            }

            if (var2 == null) {
               if (!var4) {
                  return false;
               }

               var4 = true;
            }

            return var4;
         }

         // $VF: Irreducible bytecode was duplicated to produce valid code
         static {
      char[] var20 = null; // PX-FIX
            String[] var5 = new String[6];
            int var3 = 0;
            String var2 = "U  Û\u0097\u0004Ô^ñT\u0004=\u0094Ì\r\u0014Þ\u0018uÌ=ÿ;ò\u0095é4Ó©\u0003)\u0091\u0084\u0092-\u0099";
            int var4 = "U  Û\u0097\u0004Ô^ñT\u0004=\u0094Ì\r\u0014Þ\u0018uÌ=ÿ;ò\u0095é4Ó©\u0003)\u0091\u0084\u0092-\u0099".length();
            char var1 = 5;
            int var8 = -1;

            label52:
            while (true) {
               byte var10000 = 19;
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
                           case 0 -> 5;
                           case 1 -> 97;
                           case 2 -> 56;
                           case 3 -> 127;
                           case 4 -> 118;
                           case 5 -> 31;
                           default -> 123;
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

                        var2 = "?D\u001f:[ðçí\u0005\u000e}\u0090»Z";
                        var4 = "?D\u001f:[ðçí\u0005\u000e}\u0090»Z".length();
                        var1 = '\b';
                        var8 = -1;
                  }

                  var10000 = 102;
                  var10001 = var2.substring(++var8, var8 + var1);
                  var10002 = 0;
               }
            }
         }

         private static String a(int var0, int var1) {
            int var2 = (var0 ^ -12608) & 65535;
            if (b[var2] == null) {
               char[] var3 = a[var2].toCharArray();

               short var4 = switch (var3[0] & 0xFF) {
                  case 0 -> 70;
                  case 1 -> 36;
                  case 2 -> 93;
                  case 3 -> 12;
                  case 4 -> 220;
                  case 5 -> 246;
                  case 6 -> 164;
                  case 7 -> 64;
                  case 8 -> 190;
                  case 9 -> 143;
                  case 10 -> 13;
                  case 11 -> 35;
                  case 12 -> 113;
                  case 13 -> 134;
                  case 14 -> 126;
                  case 15 -> 242;
                  case 16 -> 191;
                  case 17 -> 80;
                  case 18 -> 178;
                  case 19 -> 90;
                  case 20 -> 57;
                  case 21 -> 24;
                  case 22 -> 174;
                  case 23 -> 153;
                  case 24 -> 22;
                  case 25 -> 117;
                  case 26 -> 135;
                  case 27 -> 108;
                  case 28 -> 30;
                  case 29 -> 81;
                  case 30 -> 107;
                  case 31 -> 209;
                  case 32 -> 205;
                  case 33 -> 203;
                  case 34 -> 82;
                  case 35 -> 0;
                  case 36 -> 181;
                  case 37 -> 123;
                  case 38 -> 136;
                  case 39 -> 168;
                  case 40 -> 6;
                  case 41 -> 147;
                  case 42 -> 68;
                  case 43 -> 251;
                  case 44 -> 221;
                  case 45 -> 44;
                  case 46 -> 142;
                  case 47 -> 102;
                  case 48 -> 100;
                  case 49 -> 23;
                  case 50 -> 245;
                  case 51 -> 240;
                  case 52 -> 16;
                  case 53 -> 189;
                  case 54 -> 215;
                  case 55 -> 60;
                  case 56 -> 172;
                  case 57 -> 241;
                  case 58 -> 86;
                  case 59 -> 166;
                  case 60 -> 169;
                  case 61 -> 103;
                  case 62 -> 226;
                  case 63 -> 50;
                  case 64 -> 5;
                  case 65 -> 157;
                  case 66 -> 183;
                  case 67 -> 229;
                  case 68 -> 115;
                  case 69 -> 43;
                  case 70 -> 161;
                  case 71 -> 48;
                  case 72 -> 173;
                  case 73 -> 116;
                  case 74 -> 39;
                  case 75 -> 167;
                  case 76 -> 235;
                  case 77 -> 206;
                  case 78 -> 132;
                  case 79 -> 33;
                  case 80 -> 58;
                  case 81 -> 218;
                  case 82 -> 45;
                  case 83 -> 152;
                  case 84 -> 7;
                  case 85 -> 47;
                  case 86 -> 94;
                  case 87 -> 248;
                  case 88 -> 219;
                  case 89 -> 154;
                  case 90 -> 148;
                  case 91 -> 121;
                  case 92 -> 138;
                  case 93 -> 79;
                  case 94 -> 38;
                  case 95 -> 59;
                  case 96 -> 76;
                  case 97 -> 199;
                  case 98 -> 25;
                  case 99 -> 40;
                  case 100 -> 151;
                  case 101 -> 186;
                  case 102 -> 112;
                  case 103 -> 160;
                  case 104 -> 208;
                  case 105 -> 163;
                  case 106 -> 71;
                  case 107 -> 8;
                  case 108 -> 224;
                  case 109 -> 18;
                  case 110 -> 237;
                  case 111 -> 198;
                  case 112 -> 159;
                  case 113 -> 185;
                  case 114 -> 227;
                  case 115 -> 119;
                  case 116 -> 255;
                  case 117 -> 1;
                  case 118 -> 67;
                  case 119 -> 88;
                  case 120 -> 231;
                  case 121 -> 11;
                  case 122 -> 14;
                  case 123 -> 118;
                  case 124 -> 114;
                  case 125 -> 96;
                  case 126 -> 139;
                  case 127 -> 238;
                  case 128 -> 214;
                  case 129 -> 110;
                  case 130 -> 34;
                  case 131 -> 207;
                  case 132 -> 225;
                  case 133 -> 72;
                  case 134 -> 77;
                  case 135 -> 141;
                  case 136 -> 106;
                  case 137 -> 177;
                  case 138 -> 239;
                  case 139 -> 210;
                  case 140 -> 252;
                  case 141 -> 28;
                  case 142 -> 78;
                  case 143 -> 145;
                  case 144 -> 122;
                  case 145 -> 89;
                  case 146 -> 95;
                  case 147 -> 101;
                  case 148 -> 197;
                  case 149 -> 180;
                  case 150 -> 165;
                  case 151 -> 105;
                  case 152 -> 188;
                  case 153 -> 92;
                  case 154 -> 52;
                  case 155 -> 2;
                  case 156 -> 156;
                  case 157 -> 211;
                  case 158 -> 29;
                  case 159 -> 201;
                  case 160 -> 155;
                  case 161 -> 97;
                  case 162 -> 228;
                  case 163 -> 176;
                  case 164 -> 144;
                  case 165 -> 124;
                  case 166 -> 21;
                  case 167 -> 150;
                  case 168 -> 140;
                  case 169 -> 49;
                  case 170 -> 111;
                  case 171 -> 234;
                  case 172 -> 230;
                  case 173 -> 98;
                  case 174 -> 171;
                  case 175 -> 15;
                  case 176 -> 10;
                  case 177 -> 212;
                  case 178 -> 4;
                  case 179 -> 170;
                  case 180 -> 187;
                  case 181 -> 99;
                  case 182 -> 217;
                  case 183 -> 232;
                  case 184 -> 3;
                  case 185 -> 182;
                  case 186 -> 244;
                  case 187 -> 109;
                  case 188 -> 32;
                  case 189 -> 162;
                  case 190 -> 200;
                  case 191 -> 250;
                  case 192 -> 131;
                  case 193 -> 66;
                  case 194 -> 74;
                  case 195 -> 42;
                  case 196 -> 73;
                  case 197 -> 193;
                  case 198 -> 46;
                  case 199 -> 179;
                  case 200 -> 149;
                  case 201 -> 192;
                  case 202 -> 247;
                  case 203 -> 87;
                  case 204 -> 133;
                  case 205 -> 41;
                  case 206 -> 31;
                  case 207 -> 85;
                  case 208 -> 194;
                  case 209 -> 128;
                  case 210 -> 91;
                  case 211 -> 125;
                  case 212 -> 83;
                  case 213 -> 195;
                  case 214 -> 75;
                  case 215 -> 56;
                  case 216 -> 158;
                  case 217 -> 236;
                  case 218 -> 222;
                  case 219 -> 196;
                  case 220 -> 51;
                  case 221 -> 249;
                  case 222 -> 175;
                  case 223 -> 184;
                  case 224 -> 17;
                  case 225 -> 129;
                  case 226 -> 54;
                  case 227 -> 254;
                  case 228 -> 137;
                  case 229 -> 62;
                  case 230 -> 204;
                  case 231 -> 37;
                  case 232 -> 27;
                  case 233 -> 243;
                  case 234 -> 84;
                  case 235 -> 130;
                  case 236 -> 253;
                  case 237 -> 127;
                  case 238 -> 19;
                  case 239 -> 53;
                  case 240 -> 120;
                  case 241 -> 26;
                  case 242 -> 63;
                  case 243 -> 223;
                  case 244 -> 55;
                  case 245 -> 146;
                  case 246 -> 61;
                  case 247 -> 20;
                  case 248 -> 213;
                  case 249 -> 65;
                  case 250 -> 69;
                  case 251 -> 202;
                  case 252 -> 233;
                  case 253 -> 9;
                  case 254 -> 216;
                  default -> 104;
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
}
