package me.octo.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.MultiPlayerGameModeProgressAccessor;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private ArrayList<lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final HashMap<Long, Long> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private long IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @Nullable
   private BlockPos IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private long IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @JvmField
   @NotNull
   public static lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static String[] f;
   private static String[] g;

   private lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll() {
      short var10001 = -13956;
      short var10002 = 20253;
      var10002 = -13963;
      short var10003 = -951;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      short var10004 = -13982;
      short var10005 = 14575;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIIllIlIIlllllIllIllIIlIIlIlllIlIllIIIllIllIIlllIIllIIllIllIIIllIllIIIllIllIlllIIIIII.a(),
         lIIllIlIIlllllIllIllIIlIIlIlllIlIllIIIllIllIIlllIIllIIllIllIIIllIllIIIllIllIlllIIIIII.b(),
         lIIllIlIIlllllIllIllIIlIIlIlllIlIllIIIllIllIIlllIIllIIllIllIIIllIllIIIllIllIlllIIIIII.c(),
         lIIllIlIIlllllIllIllIIlIIlIlllIlIllIIIllIllIIlllIIllIIllIllIIIllIllIIIllIllIlllIIIIII.d()
      };
      super(
         "Gemstone Route Nuker",
         "Scans your gemstone route's etherwarp line-of-sight and highlights blocking blocks in red. Enable Nuke to clear the reachable ones.",
         var3,
         "Crystal Hollows",
         var1
      );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
         255, 0, 0, 255
      );
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll(
         120, 0, 0, 255
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new ArrayList<>();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new HashMap<>();
   }

   @Override
   public void aB() {
      this.as();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new ArrayList<>();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0L;
      if (IlIlIllllIIlllIIIIlIlIIllllllIlIIIlIlIIIlIIlIIllIlIlIlllIIlIlIlIllIIIlIlIIllIlIIlIIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
         .o()
         .isEmpty()) {
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var10000 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var10002 = this.aj();
         short var10003 = -13981;
         short var10004 = -19327;
         var10000.b(
            2500L,
            var10002,
            "Your gemstone route is empty.",
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
      }
   }

   @Override
   public void aC() {
      this.at();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new ArrayList<>();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
      this.aH();
      if (lIIllIlIIlllllIllIllIIlIIlIlllIlIllIIIllIllIIlllIIllIIllIllIIIllIllIIIllIllIlllIIIIII.b().al()) {
         me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
      }
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var9 = null; // PX-FIX
      Object var8 = null; // PX-FIX
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = -13965;
      short var10003 = -7676;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         long var3;
         label89: {
            var3 = System.currentTimeMillis();
            if (var2 != null) {
               if (var3 - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl <= 250L) {
                  break label89;
               }

               this.ah();
            }

            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var3;
         }

         label94: {
            BlockPos var5 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
            if (var2 != null) {
               if (var5 != null) {
                  var8 = this.a(var5);
                  if (var2 == null) {
                     break label94;
                  }

                  if (!((Boolean)var8)) {
                     this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.put(var5.asLong(), var3);
                     this.aH();
                  }
               }

               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                  .values()
                  .removeIf(null);
            }

            if (var2 == null) {
               return;
            }

            var8 = lIIllIlIIlllllIllIllIIlIIlIlllIlIllIIIllIllIIlllIIllIIllIllIIIllIllIIIllIllIlllIIIIII.a().al();
         }

         label95: {
            label73: {
               if (((Boolean)var8)
                  && IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .g()
                     == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  )
                {
                  var9 = this;
                  if (var2 == null) {
                     break label95;
                  }

                  if (this.aI()) {
                     boolean var10 = lIIllIlIIlllllIllIllIIlIIlIlllIlIllIIIllIllIIlllIIllIIllIllIIIllIllIIIllIllIlllIIIIII.d().al();
                     if (var2 != null) {
                        if (!var10) {
                           break label73;
                        }

                        short var10001 = -13977;
                        var10002 = 4172;
                        var10 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a("attack");
                     }

                     if (var10) {
                        break label73;
                     }
                  }
               }

               var9 = this;
               break label95;
            }

            BlockPos var6 = this.ai();
            if (var2 != null) {
               if (var6 != null) {
                  Vec3 var7 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .d(var6);
                  if (var2 != null) {
                     if (lIIllIlIIlllllIllIllIIlIIlIlllIlIllIIIllIllIIlllIIllIIllIllIIIllIllIIIllIllIlllIIIIII.b().al()) {
                        me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.a(var7);
                        if (var2 == null) {
                           return;
                        }

                        if (me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .d(var7)
                              > lIIllIlIIlllllIllIllIIlIIlIlllIlIllIIIllIllIIlllIIllIIllIllIIIllIllIIIllIllIlllIIIIII.c().O()
                           && !me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .h()) {
                           return;
                        }
                     }

                     this.b(var6);
                  }

                  return;
               }

               this.ag();
            }

            return;
         }

         this.ag();
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var1) {
      Object var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = -13984;
      short var10003 = -26216;
      Intrinsics.checkNotNullParameter(var1, "event");
      Object var2 = var10000;
      lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll var5 = this;
      if (var2 != null) {
         if (this.ap().level == null) {
            return;
         }

         var5 = this;
      }

      Iterator var6 = var5.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.iterator();
      var10002 = -13968;
      var10003 = -1270;
      Intrinsics.checkNotNullExpressionValue(var6, "iterator(...)");
      Iterator var3 = var6;

      while (var3.hasNext()) {
         var10000 = var3.next();
         var10002 = -13954;
         var10003 = 26175;
         Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
         lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4 = (lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a(
            var4.a(),
            null,
            var4.c()
               ? this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               : this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
            2.0F,
            null,
            null,
            0.0F,
            false,
            0.0F);
         if (var2 == null) {
            break;
         }
      }
   }

   private final void ag() {
      this.aH();
      if (lIIllIlIIlllllIllIllIIlIIlIlllIlIllIIIllIllIIlllIIllIIllIllIIIllIllIIIllIllIlllIIIIII.b().al()) {
         me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .g();
      }
   }

   private final void ah() {
      int[] var1 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var1 != null) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var2 = var10000;
            ArrayList var3 = IlIlIllllIIlllIIIIlIlIIllllllIlIIIlIlIIIlIIlIIllIlIlIlllIIlIlIlIllIIIlIlIIllIlIIlIIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
               .o();
            ArrayList var4 = new ArrayList();
            if (var1 != null) {
               if (var3.size() >= 2) {
                  int var5 = 0;
                  int var6 = CollectionsKt.getLastIndex(var3);

                  label67:
                  do {
                     int var14 = var5;

                     label64:
                     while (true) {
                        if (var14 >= var6) {
                           break label67;
                        }

                        BlockPos var7 = ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var3.get(var5)).a();
                        BlockPos var8 = ((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var3.get(var5 + 1)).a();
                        Vec3 var15 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .d(var7)
                           .add(0.0, 1.27, 0.0);
                        short var10002 = -13966;
                        short var10003 = 2684;
                        Intrinsics.checkNotNullExpressionValue(var15, "add(...)");
                        Vec3 var9 = var15;
                        Vec3 var10 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .d(var8);
                        if (var1 == null) {
                           return;
                        }

                        Iterator var16 = me.octo.client.utils.llIIlIllllIllllIlIIIlllIllllIlllIlIllIIIIlIlIlllIIIllIIlllIIllllIlllIIIllIlIIIIIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(var9, var10)
                           .iterator();
                        var10002 = -13962;
                        var10003 = -29832;
                        Intrinsics.checkNotNullExpressionValue(var16, "iterator(...)");
                        Iterator var11 = var16;

                        while (true) {
                           if (!var11.hasNext()) {
                              break label64;
                           }

                           var10000 = (ClientLevel)var11.next();
                           var10002 = -13967;
                           var10003 = -22036;
                           Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                           BlockPos var12 = (BlockPos)(Object)var10000;
                           var14 = ((Intrinsics.areEqual(var12, var7)) ? 1 : 0);
                           if (var1 == null) {
                              break;
                           }

                           if (var1 != null) {
                              if (var14 != 0) {
                                 continue;
                              }

                              var14 = ((Intrinsics.areEqual(var12, var8)) ? 1 : 0);
                           }

                           if (var14 == 0) {
                              BlockState var18 = var2.getBlockState(var12);
                              var10002 = -13953;
                              var10003 = -8577;
                              Intrinsics.checkNotNullExpressionValue(var18, "getBlockState(...)");
                              BlockState var13 = var18;
                              boolean var19 = var13.isAir();
                              if (var1 != null) {
                                 if (var19) {
                                    continue;
                                 }

                                 var19 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(var13);
                              }

                              if (!var19) {
                                 BlockPos var26 = var12.immutable();
                                 short var10005 = -13960;
                                 short var10006 = 27654;
                                 Intrinsics.checkNotNullExpressionValue(var26, "immutable(...)");
                                 var4.add(
                                    new lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                                       var26, var5, !var13.is(Blocks.BEDROCK)
                                    )
                                 );
                                 if (var1 == null) {
                                    break label64;
                                 }
                              }
                           }
                        }
                     }

                     var5++;
                  } while (var1 != null);
               }

               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var4;
            }

            return;
         }
      }
   }

   private final BlockPos ai() {
      Object var4 = null; // PX-FIX
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      BlockPos var2 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      int[] var1 = var10000;
      BlockPos var3 = var2;
      if (var1 != null) {
         label17: {
            if (var2 != null) {
               var4 = this;
               if (var1 == null) {
                  break label17;
               }

               if (this.a(var2)) {
                  return var2;
               }
            }

            var4 = this;
         }

         var3 = this.aG();
      }

      return var3;
   }

   private final boolean a(BlockPos var1) {
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var2 != null) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var3 = var10000;
            if (var2 != null) {
               LocalPlayer var6 = this.ap().player;
               if (var6 != null) {
                  Vec3 var7 = var6.getEyePosition();
                  if (var7 != null) {
                     Vec3 var4 = var7;
                     BlockState var8 = var3.getBlockState(var1);
                     short var10002 = -13955;
                     short var10003 = -14841;
                     Intrinsics.checkNotNullExpressionValue(var8, "getBlockState(...)");
                     BlockState var5 = var8;
                     boolean var9 = var5.isAir();
                     if (var2 != null) {
                        if (!var9) {
                           boolean var12 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var5);
                           if (var2 == null) {
                              return var12;
                           }

                           label41:
                           if (!var12) {
                              int var10 = ((var5.is(Blocks.BEDROCK)) ? 1 : 0);
                              if (var2 != null) {
                                 if (var10 != 0) {
                                    break label41;
                                 }

                                 double var11;
                                 var10 = (
                                          var11 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                .d(var1)
                                                .distanceTo(var4)
                                             - 4.6
                                       )
                                       == 0.0
                                    ? 0
                                    : (var11 < 0.0 ? -1 : 1);
                              }

                              if (var2 != null) {
                                 var10 = var10 <= 0 ? 1 : 0;
                              }

                              return (var10 != 0);
                           }
                        }

                        var9 = false;
                     }

                     return var9;
                  }
               }
            }

            return false;
         }
      }

      return false;
   }

   private final BlockPos aG() {
      int[] var1 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var1 != null) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            ClientLevel var2 = var10000;
            if (var1 != null) {
               LocalPlayer var15 = this.ap().player;
               if (var15 != null) {
                  Vec3 var16 = var15.getEyePosition();
                  if (var16 != null) {
                     Vec3 var3 = var16;
                     BlockPos var4 = null;
                     double var5 = Double.MAX_VALUE;
                     Iterator var17 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.iterator();
                     short var10002 = -13962;
                     short var10003 = -29832;
                     Intrinsics.checkNotNullExpressionValue(var17, "iterator(...)");
                     Iterator var7 = var17;

                     while (var7.hasNext()) {
                        Object var1000w = var7.next(); // PX-FIX var-split (原 (ClientLevel) 伪影；checkcast 实为嵌套类)
                        var10002 = -13967;
                        var10003 = -22036;
                        Intrinsics.checkNotNullExpressionValue(var1000w, "next(...)");
                        lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var8 = (lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var1000w;
                        boolean var19 = var8.c();
                        if (var1 != null) {
                           if (!var19) {
                              continue;
                           }

                           var19 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.containsKey(var8.a().asLong());
                        }

                        if (!var19) {
                           BlockState var20 = var2.getBlockState(var8.a());
                           var10002 = -13955;
                           var10003 = -14841;
                           Intrinsics.checkNotNullExpressionValue(var20, "getBlockState(...)");
                           BlockState var9 = var20;
                           boolean var21 = var9.isAir();
                           if (var1 != null) {
                              if (var21) {
                                 continue;
                              }

                              var21 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var9);
                           }

                           if (!var21) {
                              Vec3 var10 = me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .d(var8.a());
                              double var11 = var10.distanceTo(var3);
                              double var22 = var11;
                              double var10001 = 4.6;
                              if (var1 != null) {
                                 if (var11 > 4.6) {
                                    continue;
                                 }

                                 var22 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .d(var10)
                                       * 0.1
                                    + var11;
                                 var10001 = var8.b();
                              }

                              double var13 = var22 + var10001;
                              double var23 = var13;
                              if (var1 != null) {
                                 if (!(var13 < var5)) {
                                    continue;
                                 }

                                 var23 = var13;
                              }

                              var5 = var23;
                              var4 = var8.a();
                              if (var1 == null) {
                                 break;
                              }
                           }
                        }
                     }

                     return var4;
                  }
               }
            }

            return null;
         }
      }

      return null;
   }

   private final void b(BlockPos var1) {
      Object var13 = null; // PX-FIX
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var2 != null) {
         MultiPlayerGameMode var10000 = this.ap().gameMode;
         if (var10000 != null) {
            MultiPlayerGameMode var3 = var10000;
            if (var2 != null) {
               LocalPlayer var11 = this.ap().player;
               if (var11 != null) {
                  LocalPlayer var4;
                  label65: {
                     label76: {
                        var4 = var11;
                        BlockPos var12 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
                        if (var2 != null) {
                           if (this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll == null) {
                              break label65;
                           }

                           var13 = this;
                           if (var2 == null) {
                              break label76;
                           }

                           var12 = this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
                        }

                        if (Intrinsics.areEqual(var12, var1)) {
                           break label65;
                        }

                        var13 = this;
                     }

                     this.aH();
                  }

                  Direction var14 = Direction.fromYRot(var4.getYRot());
                  short var10002 = -13959;
                  short var10003 = -32652;
                  Intrinsics.checkNotNullExpressionValue(var14, "fromYRot(...)");
                  Direction var5 = var14;
                  float var6 = ((MultiPlayerGameModeProgressAccessor)var3).getDestroyProgress();
                  float var18;
                  int var15 = (var18 = var6 - 0.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
                  if (var2 != null) {
                     var15 = (((var15 == 0) ? 1 : 0));
                  }

                  if ((var15 != 0)) {
                     label78: {
                        long var7;
                        long var9;
                        label49: {
                           var7 = var1.asLong();
                           var9 = System.currentTimeMillis();
                           long var19;
                           int var16 = (var19 = var7 - this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl) == 0L
                              ? 0
                              : (var19 < 0L ? -1 : 1);
                           if (var2 != null) {
                              if (var16 != 0) {
                                 break label49;
                              }

                              long var20;
                              var16 = (var20 = var9 - this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI - 300L) == 0L
                                 ? 0
                                 : (var20 < 0L ? -1 : 1);
                           }

                           if (var16 <= 0) {
                              break label78;
                           }
                        }

                        ClientPacketListener var17 = this.ap().getConnection();
                        if (var17 != null) {
                           var17.send(new ServerboundPlayerActionPacket(Action.START_DESTROY_BLOCK, var1, var5));
                        }

                        var4.swing(InteractionHand.MAIN_HAND);
                        this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var7;
                        this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var9;
                     }

                     this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = true;
                     this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var1;
                  }

                  if (var3.continueDestroyBlock(var1, var5)) {
                     var4.swing(InteractionHand.MAIN_HAND);
                  }

                  return;
               }
            }

            return;
         }
      }
   }

   private final void aH() {
      int[] var1 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll var10000 = this;
      if (var1 != null) {
         if (!this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) {
            return;
         }

         var10000 = this;
      }

      BlockPos var2 = var10000.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      MultiPlayerGameMode var3 = this.ap().gameMode;
      LocalPlayer var4 = this.ap().player;
      if (var1 != null) {
         if (var2 != null && var3 != null && var4 != null) {
            float var7;
            int var5 = (var7 = ((MultiPlayerGameModeProgressAccessor)var3).getDestroyProgress() - 0.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
            if (var1 != null) {
               var5 = (((var5 == 0) ? 1 : 0));
            }

            if ((var5 == 0)) {
               ClientPacketListener var6 = this.ap().getConnection();
               if (var6 != null) {
                  var6.send(new ServerboundPlayerActionPacket(Action.ABORT_DESTROY_BLOCK, var2, Direction.fromYRot(var4.getYRot())));
               }
            }
         }

         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = null;
      }
   }

   private final boolean aI() {
      int[] var1 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      if (var1 != null) {
         LocalPlayer var10000 = this.ap().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var4 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var10001 = var2.getMainHandItem().getHoverName().getString();
            short var10003 = -13961;
            short var10004 = 9633;
            Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
            String var3 = var4.a(var10001);
            CharSequence var5 = var3;
            short var9 = -13964;
            short var10002 = 4450;
            boolean var6 = StringsKt.contains(var5, "Pickaxe", true);
            if (var1 != null) {
               if (!var6) {
                  CharSequence var7 = var3;
                  short var10 = -13957;
                  var10002 = 26462;
                  boolean var14 = StringsKt.contains(var7, "Drill", true);
                  if (var1 == null) {
                     return var14;
                  }

                  if (!var14) {
                     CharSequence var8 = var3;
                     short var11 = -13983;
                     var10002 = 14575;
                     boolean var15 = StringsKt.contains(var8, "Gauntlet", true);
                     if (var1 == null) {
                        return var15;
                     }

                     if (!var15) {
                        return false;
                     }
                  }
               }

               var6 = true;
            }

            return var6;
         }
      }

      return false;
   }

   private static final boolean a(long var0, Long var2) {
      int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      short var10002 = -13958;
      short var10003 = -13211;
      Intrinsics.checkNotNullParameter(var2, "it");
      int[] var3 = var10000;
      long var5;
      int var4 = (var5 = var0 - var2 - 600L) == 0L ? 0 : (var5 < 0L ? -1 : 1);
      if (var3 != null) {
         var4 = var4 > 0 ? 1 : 0;
      }

      return (var4 != 0);
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[21];
      int var3 = 0;
      String var2 = " øWt\u0082\bäZZ6XÃ¹\u0011\tõ\u0010\u008a\u0002Û\u0092\u000f<ª\rQtä»á9i\u0004\u000e}\u007f¿+\u000e\u0097Àâ?\u0007ª\u0004¬*ñ]èh¨\r \tÊ\u0014$ÌÑº\u0019ª\u009dEw\u0083\u0000T·V\u001dO°\t¼>ÑI}¸¾*Jl{\b£á´%\u0095¬\u000e\u0001\u0012ù\f\u001dC\u001bB#ü\u00970j\u008f\u001bÔL\u009b\u009b\u007f\u0094â\u0015*\bc\u009eC'C \u0085\u0095\u0082¸¡\u0090Bë/×«Ì\\ù\u0002ê¶ØHøÁrlç\u00adÿT\u0012´¾\u001b6ÜÃX\u001bw\u0097£DXP\b\tò\u009ab\"$ãS)×?\u0019\"S¼\u0004Ðª\u001bùâ\u0085¨ý£²·^\u009bù\u0007#b²Þí£â\u0005\u0093·8\u001bú\u0002\n\u0087\rgNÆ%Ö0°Á5\u0003\u0018pÇ\u000e_Ô-\u0092ÄîwW,ÌßO8\\\u0012\u0093\u001bbU\u000fÉ\u0014{Wò\u000f\u0005Ï\u0005µ*\u009c:\t{\u0000[\u0000áÒH4B\u0012X²\u001b` oñ¯ëh\u0098V=oëgW\u0093\u0014\u0014Í¯¾\u0094£q8$srÖ¾\u0013¦ljÜ&é\u001d\u009c¶{\u009bA.\u001e\u0088ðJÑ\bÛõk|ËÄ\u0012D\u0095t_\u0019\u001fOQ\u0099U\u000f\u0081@\u008dúF%)b\u0005è0&\u008e%\u008b\bD\u0010½\u009cÍZQu";
      int var4 = " øWt\u0082\bäZZ6XÃ¹\u0011\tõ\u0010\u008a\u0002Û\u0092\u000f<ª\rQtä»á9i\u0004\u000e}\u007f¿+\u000e\u0097Àâ?\u0007ª\u0004¬*ñ]èh¨\r \tÊ\u0014$ÌÑº\u0019ª\u009dEw\u0083\u0000T·V\u001dO°\t¼>ÑI}¸¾*Jl{\b£á´%\u0095¬\u000e\u0001\u0012ù\f\u001dC\u001bB#ü\u00970j\u008f\u001bÔL\u009b\u009b\u007f\u0094â\u0015*\bc\u009eC'C \u0085\u0095\u0082¸¡\u0090Bë/×«Ì\\ù\u0002ê¶ØHøÁrlç\u00adÿT\u0012´¾\u001b6ÜÃX\u001bw\u0097£DXP\b\tò\u009ab\"$ãS)×?\u0019\"S¼\u0004Ðª\u001bùâ\u0085¨ý£²·^\u009bù\u0007#b²Þí£â\u0005\u0093·8\u001bú\u0002\n\u0087\rgNÆ%Ö0°Á5\u0003\u0018pÇ\u000e_Ô-\u0092ÄîwW,ÌßO8\\\u0012\u0093\u001bbU\u000fÉ\u0014{Wò\u000f\u0005Ï\u0005µ*\u009c:\t{\u0000[\u0000áÒH4B\u0012X²\u001b` oñ¯ëh\u0098V=oëgW\u0093\u0014\u0014Í¯¾\u0094£q8$srÖ¾\u0013¦ljÜ&é\u001d\u009c¶{\u009bA.\u001e\u0088ðJÑ\bÛõk|ËÄ\u0012D\u0095t_\u0019\u001fOQ\u0099U\u000f\u0081@\u008dúF%)b\u0005è0&\u008e%\u008b\bD\u0010½\u009cÍZQu"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 75;
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
                     case 0 -> 69;
                     case 1 -> 108;
                     case 2 -> 101;
                     case 3 -> 18;
                     case 4 -> 91;
                     case 5 -> 102;
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
                     f = var5;
                     g = new String[21];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new lllllIllllIllllIlIllIIIIIllIIllIIlIlIllIllllllllIIIIlIIIIIllIIIllIlIIIlIIIIIllllIIlll();
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

                  var2 = "8\u0001\u0006\tê\u0006\u0018h\u0097iüO";
                  var4 = "8\u0001\u0006\tê\u0006\u0018h\u0097iüO".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 73;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -13965) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 135;
            case 1 -> 217;
            case 2 -> 45;
            case 3 -> 180;
            case 4 -> 248;
            case 5 -> 8;
            case 6 -> 237;
            case 7 -> 121;
            case 8 -> 111;
            case 9 -> 250;
            case 10 -> 76;
            case 11 -> 193;
            case 12 -> 51;
            case 13 -> 21;
            case 14 -> 236;
            case 15 -> 11;
            case 16 -> 204;
            case 17 -> 123;
            case 18 -> 159;
            case 19 -> 122;
            case 20 -> 215;
            case 21 -> 47;
            case 22 -> 53;
            case 23 -> 72;
            case 24 -> 222;
            case 25 -> 41;
            case 26 -> 192;
            case 27 -> 223;
            case 28 -> 79;
            case 29 -> 37;
            case 30 -> 181;
            case 31 -> 213;
            case 32 -> 90;
            case 33 -> 158;
            case 34 -> 108;
            case 35 -> 130;
            case 36 -> 19;
            case 37 -> 170;
            case 38 -> 109;
            case 39 -> 247;
            case 40 -> 177;
            case 41 -> 148;
            case 42 -> 183;
            case 43 -> 64;
            case 44 -> 3;
            case 45 -> 229;
            case 46 -> 49;
            case 47 -> 203;
            case 48 -> 25;
            case 49 -> 141;
            case 50 -> 38;
            case 51 -> 56;
            case 52 -> 71;
            case 53 -> 97;
            case 54 -> 208;
            case 55 -> 127;
            case 56 -> 7;
            case 57 -> 98;
            case 58 -> 110;
            case 59 -> 58;
            case 60 -> 209;
            case 61 -> 60;
            case 62 -> 201;
            case 63 -> 1;
            case 64 -> 242;
            case 65 -> 134;
            case 66 -> 233;
            case 67 -> 29;
            case 68 -> 59;
            case 69 -> 102;
            case 70 -> 17;
            case 71 -> 80;
            case 72 -> 205;
            case 73 -> 150;
            case 74 -> 226;
            case 75 -> 156;
            case 76 -> 34;
            case 77 -> 28;
            case 78 -> 143;
            case 79 -> 185;
            case 80 -> 219;
            case 81 -> 206;
            case 82 -> 100;
            case 83 -> 33;
            case 84 -> 184;
            case 85 -> 255;
            case 86 -> 214;
            case 87 -> 107;
            case 88 -> 119;
            case 89 -> 254;
            case 90 -> 166;
            case 91 -> 70;
            case 92 -> 62;
            case 93 -> 69;
            case 94 -> 92;
            case 95 -> 212;
            case 96 -> 200;
            case 97 -> 73;
            case 98 -> 125;
            case 99 -> 66;
            case 100 -> 207;
            case 101 -> 67;
            case 102 -> 39;
            case 103 -> 113;
            case 104 -> 202;
            case 105 -> 101;
            case 106 -> 251;
            case 107 -> 117;
            case 108 -> 40;
            case 109 -> 84;
            case 110 -> 147;
            case 111 -> 20;
            case 112 -> 234;
            case 113 -> 68;
            case 114 -> 220;
            case 115 -> 54;
            case 116 -> 161;
            case 117 -> 36;
            case 118 -> 164;
            case 119 -> 131;
            case 120 -> 153;
            case 121 -> 165;
            case 122 -> 167;
            case 123 -> 31;
            case 124 -> 210;
            case 125 -> 13;
            case 126 -> 30;
            case 127 -> 178;
            case 128 -> 63;
            case 129 -> 145;
            case 130 -> 245;
            case 131 -> 83;
            case 132 -> 22;
            case 133 -> 227;
            case 134 -> 172;
            case 135 -> 160;
            case 136 -> 190;
            case 137 -> 146;
            case 138 -> 104;
            case 139 -> 179;
            case 140 -> 152;
            case 141 -> 9;
            case 142 -> 132;
            case 143 -> 35;
            case 144 -> 85;
            case 145 -> 50;
            case 146 -> 182;
            case 147 -> 238;
            case 148 -> 112;
            case 149 -> 24;
            case 150 -> 196;
            case 151 -> 75;
            case 152 -> 94;
            case 153 -> 163;
            case 154 -> 149;
            case 155 -> 128;
            case 156 -> 235;
            case 157 -> 133;
            case 158 -> 198;
            case 159 -> 61;
            case 160 -> 173;
            case 161 -> 95;
            case 162 -> 221;
            case 163 -> 46;
            case 164 -> 27;
            case 165 -> 186;
            case 166 -> 176;
            case 167 -> 4;
            case 168 -> 10;
            case 169 -> 44;
            case 170 -> 157;
            case 171 -> 211;
            case 172 -> 120;
            case 173 -> 78;
            case 174 -> 57;
            case 175 -> 65;
            case 176 -> 232;
            case 177 -> 52;
            case 178 -> 225;
            case 179 -> 230;
            case 180 -> 89;
            case 181 -> 55;
            case 182 -> 86;
            case 183 -> 197;
            case 184 -> 26;
            case 185 -> 126;
            case 186 -> 142;
            case 187 -> 174;
            case 188 -> 218;
            case 189 -> 191;
            case 190 -> 91;
            case 191 -> 224;
            case 192 -> 138;
            case 193 -> 189;
            case 194 -> 155;
            case 195 -> 43;
            case 196 -> 77;
            case 197 -> 139;
            case 198 -> 96;
            case 199 -> 18;
            case 200 -> 228;
            case 201 -> 115;
            case 202 -> 14;
            case 203 -> 195;
            case 204 -> 175;
            case 205 -> 188;
            case 206 -> 249;
            case 207 -> 253;
            case 208 -> 99;
            case 209 -> 106;
            case 210 -> 169;
            case 211 -> 103;
            case 212 -> 118;
            case 213 -> 239;
            case 214 -> 74;
            case 215 -> 16;
            case 216 -> 252;
            case 217 -> 114;
            case 218 -> 42;
            case 219 -> 105;
            case 220 -> 154;
            case 221 -> 6;
            case 222 -> 116;
            case 223 -> 23;
            case 224 -> 240;
            case 225 -> 140;
            case 226 -> 5;
            case 227 -> 144;
            case 228 -> 243;
            case 229 -> 199;
            case 230 -> 137;
            case 231 -> 2;
            case 232 -> 136;
            case 233 -> 194;
            case 234 -> 241;
            case 235 -> 171;
            case 236 -> 15;
            case 237 -> 81;
            case 238 -> 246;
            case 239 -> 129;
            case 240 -> 244;
            case 241 -> 12;
            case 242 -> 168;
            case 243 -> 93;
            case 244 -> 216;
            case 245 -> 32;
            case 246 -> 151;
            case 247 -> 48;
            case 248 -> 162;
            case 249 -> 0;
            case 250 -> 82;
            case 251 -> 87;
            case 252 -> 231;
            case 253 -> 88;
            case 254 -> 124;
            default -> 187;
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String a;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull BlockPos var1, int var2, boolean var3) {
         Intrinsics.checkNotNullParameter(var1, a);
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         char[] var10003 = "\u0018Up".toCharArray();
         int var10004 = var10003.length;
         int var0 = 0;
         byte var6 = 4;
         char[] var10002 = var10003;
         int var1 = var10004;
         byte var10;
         char[] var10005;
         int var10006;
         if (var10004 <= 1) {
            var10005 = var10003;
            var10 = 4;
            var10006 = var0;
         } else {
            var6 = 4;
            var1 = var10004;
            if (var10004 <= var0) {
               String var9 = new String(var10003).intern();
               byte var4 = -1;
               a = var9;
               break pxClinit;
            }

            var10005 = var10003;
            var10 = 4;
            var10006 = var0;
         }

         while (true) {
            var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
               case 0 -> 108;
               case 1 -> 62;
               case 2 -> 7;
               case 3 -> 72;
               case 4 -> 79;
               case 5 -> 17;
               default -> 52;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

    // PX-FIX TOP5F: Kotlin synthetic no-arg marker ctor (jar: <init>(DefaultConstructorMarker))
    public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker marker) {
        this();
    }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
