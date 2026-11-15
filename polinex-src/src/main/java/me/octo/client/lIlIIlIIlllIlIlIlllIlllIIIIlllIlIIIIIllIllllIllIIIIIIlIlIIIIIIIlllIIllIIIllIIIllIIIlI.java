package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI
   extends IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII {

   @NotNull
   public static lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final ArrayList<String> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final Map<String, Integer> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final Map<String, Integer> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private final List<Pair<BlockPos, Vec3>> IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private BlockPos IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private Vec3 IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private boolean IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private boolean lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private boolean llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private int IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private boolean IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @NotNull
   private String IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @NotNull
   private static me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private static boolean lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static String[] c;
   private static String[] d;

   public lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI() {
      short var10001 = -4601;
      short var10002 = 18881;
      super("Auto Forge");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[7];
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new ArrayList<>();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new LinkedHashMap<>();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new LinkedHashMap<>();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 500;
      Pair[] var2 = new Pair[]{
         new Pair(new BlockPos(22, 150, -88), new Vec3(23.5, 152.5, -87.5)),
         new Pair(new BlockPos(-22, 150, -80), new Vec3(-22.5, 152.5, -79.5)),
         new Pair(new BlockPos(22, 150, -58), new Vec3(23.5, 152.5, -57.5)),
         new Pair(new BlockPos(-22, 150, -50), new Vec3(-22.5, 152.5, -49.5))
      };
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = CollectionsKt.listOf(var2);
      BlockPos var3 = BlockPos.ZERO;
      short var10004 = -4589;
      short var10005 = 23099;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var3;
      Vec3 var4 = Vec3.ZERO;
      var10004 = -4605;
      var10005 = -11385;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var4;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = "";
      if (var1 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
         );
      }
   }

   @Override
   public void g() {
      Object var7 = null; // PX-FIX
      Object IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll = null; // PX-FIX
      lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI var5;
      label256: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1;
         label220: {
            label221: {
               label222: {
                  var1 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
                  int var10000 = ((int[])lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.c()
                     .ordinal()];
                  if (var1 == null) {
                     switch (var10000) {
                        case 1:
                           var10000 = ((this.f()) ? 1 : 0);
                           break;
                        case 2:
                           break label222;
                        case 3:
                           break label221;
                        case 4:
                           break label220;
                        default:
                           return;
                     }
                  }

                  label223: {
                     if (var1 == null) {
                        if (var10000 == 0) {
                           return;
                        }

                        var5 = this;
                        if (var1 != null) {
                           break label223;
                        }

                        var10000 = ((int[])lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[this.e()
                           .a()
                           .ordinal()];
                     }

                     if (var10000 != 1) {
                        return;
                     }

                     var5 = this;
                  }

                  var5.p();
                  if (var1 == null) {
                     return;
                  }
               }

               var5 = this;
               if (var1 != null) {
                  break label256;
               }

               if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                  == lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  )
                {
                  var5 = this;
                  break label256;
               }

               int var6 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .K();
               if (var1 == null) {
                  if (var6 != this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
                     me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .b(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
                     return;
                  }

                  double var23;
                  var6 = (
                           var23 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b(this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, true)
                              - 3.5
                        )
                        == 0.0
                     ? 0
                     : (var23 < 0.0 ? -1 : 1);
               }

               label198: {
                  label197: {
                     label225: {
                        if (var1 == null) {
                           if (var6 < 0) {
                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .t();
                              if (var1 != null) {
                                 break label198;
                              }

                              if (IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e()
                                 .d()) {
                                 break label197;
                              }

                              IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e()
                                 .k();
                              if (var1 == null) {
                                 break label197;
                              }
                           }

                           var7 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                              .e();
                           if (var1 != null) {
                              break label225;
                           }

                           var6 = ((me.octo.client.PXDyn)var7).d();
                        }

                        if (var6 != 0) {
                           IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.a(
                              ((BlockPos)(Object)(IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 .e())),
                              ((IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll)(Object)(this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll)),
                              0,
                              false);
                        }

                        var7 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                           .e();
                     }

                     ((me.octo.client.PXDyn)var7).c(false);
                  }

                  me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(
                     this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl
                  );
               }

               if (var1 != null) {
                  return;
               }

               EntityHitResult var8 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .H();
               if (var8 == null) {
                  return;
               }

               EntityHitResult var2 = var8;
               me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var9 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               Vec3 var10001 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
               Entity var10002 = var2.getEntity();
               short var10004 = -4602;
               short var10005 = 29855;
               Intrinsics.checkNotNullExpressionValue(var10002, "getEntity(...)");
               double var24;
               int var10 = (
                        var24 = var9.c(
                              var10001,
                              me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var10002)
                           )
                           - 0.2
                     )
                     == 0.0
                  ? 0
                  : (var24 < 0.0 ? -1 : 1);
               if (var1 == null) {
                  if (var10 >= 0) {
                     return;
                  }

                  var10 = ((java.util.function.Supplier<Integer>)(() -> { this.d().a(1000); return 0; })).get();
               }

               if (var1 == null) {
                  if (var10 == 0) {
                     return;
                  }

                  me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .j();
               }

               this.d().f();
               if (var1 == null) {
                  return;
               }
            }

            var5 = this;
            if (var1 == null) {
               if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                  == lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  )
                {
                  this.q();
                  return;
               }

               var5 = this;
            }

            int var12 = ((var5.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll) ? 1 : 0);
            if (var1 == null) {
               if (var5.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll) {
                  if (this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll
                     .a(Long.valueOf(this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl ? 2500L : 6000L))) {
                     this.o();
                  }

                  return;
               }

               var12 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .K();
            }

            if (var1 != null) {
               return;
            }

            if (var12 != this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI) {
               me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .b(this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI);
               return;
            }

            if (me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .g()
               != null) {
               return;
            }

            boolean var13 = ((java.util.function.Supplier<Boolean>)(() -> { this.d().a(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl); return false; })).get();
            if (var1 == null) {
               if (!var13) {
                  return;
               }

               var13 = me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .j();
            }

            if (!var13) {
               return;
            }

            this.s();
            if (var1 == null) {
               return;
            }
         }

         if (me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            != null) {
            me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g();
            return;
         }

         var5 = this;
         if (var1 == null) {
            if (this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) {
               var5 = this;
               if (var1 == null) {
                  if (!this.d().a((Number)Integer.valueOf(1000))) {
                     return;
                  }

                  var5 = this;
               }

               var5.n();
               return;
            }

            var5 = this;
         }

         me.octo.client.utils.player.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.a(
            var5.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl
         );
         if (var1 != null) {
            return;
         }

         EntityHitResult var15 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .H();
         if (var15 == null) {
            return;
         }

         EntityHitResult var3 = var15;
         me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl var16 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         Vec3 var19 = this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
         Entity var20 = var3.getEntity();
         short var21 = -4583;
         short var22 = 28968;
         Intrinsics.checkNotNullExpressionValue(var20, "getEntity(...)");
         double var25;
         int var17 = (
                  var25 = var16.c(
                        var19, me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var20)
                     )
                     - 0.2
               )
               == 0.0
            ? 0
            : (var25 < 0.0 ? -1 : 1);
         if (var1 == null) {
            if (var17 >= 0) {
               return;
            }

            var17 = ((java.util.function.Supplier<Integer>)(() -> { this.d().a(1000); return 0; })).get();
         }

         if (var1 == null) {
            if (var17 == 0) {
               return;
            }

            me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .j();
         }

         this.d().f();
         return;
      }

      var5.q();
   }

   @Override
   public void b(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var98 = null; // PX-FIX
      Object var88 = null; // PX-FIX
      Object var84 = null; // PX-FIX
      Integer var83 = null; // PX-FIX
      Object var80 = null; // PX-FIX
      Object var75 = null; // PX-FIX
      Integer var69 = null; // PX-FIX
      boolean var64 = false; // PX-FIX
      Object var63 = null; // PX-FIX
      Object var42 = null; // PX-FIX
      Object var36 = null; // PX-FIX
      Object var100 = null; // PX-FIX
      Object IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      short var10002 = -4592;
      short var10003 = -897;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var2 == null) {
         String var51 = var1.k();
         if (var51 != null) {
            String var3 = var51;
            if (var2 == null) {
               List var52 = var1.m();
               if (var52 != null) {
                  label468: {
                     List var4;
                     label469: {
                        label470: {
                           label471: {
                              var4 = var52;
                              int var53 = ((int[])lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)[this.c()
                                 .ordinal()];
                              if (var2 == null) {
                                 switch (var53) {
                                    case 2:
                                       short var10001 = -4604;
                                       var10002 = 2934;
                                       var53 = ((Intrinsics.areEqual(var3, "The Forge")) ? 1 : 0);
                                       break;
                                    case 3:
                                       break label471;
                                    case 4:
                                       break label469;
                                    case 5:
                                       break label470;
                                    default:
                                       return;
                                 }
                              }

                              if (var53 == 0) {
                                 return;
                              }

                              this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                              if (var2 == null) {
                                 return;
                              }
                           }

                           short var101 = -4580;
                           var10002 = -14106;
                           boolean var54 = Intrinsics.areEqual(var3, "The Forge");
                           if (var2 == null) {
                              if (var54) {
                                 this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                                 return;
                              }

                              var54 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
                           }

                           if (var2 == null) {
                              if (var54) {
                                 return;
                              }

                              CharSequence var55 = var3;
                              var101 = -4588;
                              var10002 = 5861;
                              var54 = StringsKt.contains(var55, "Abiphone", false);
                           }

                           if (var2 == null) {
                              if (!var54) {
                                 return;
                              }

                              var54 = ((java.util.function.Supplier<Boolean>)(() -> { this.d().a(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl); return false; })).get();
                           }

                           if (!var54) {
                              return;
                           }

                           Iterator var5 = var4.iterator();

                           label443:
                           while (true) {
                              if (!var5.hasNext()) {
                                 return;
                              }

                              Slot var6 = (Slot)var5.next();
                              me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var56 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                              String var103 = var6.getItem().getHoverName().getString();
                              var10003 = -4591;
                              short var10004 = -18410;
                              Intrinsics.checkNotNullExpressionValue(var103, "getString(...)");
                              String var7 = var56.a(var103);

                              do {
                                 CharSequence var57 = var7;
                                 var101 = -4586;
                                 var10002 = -31522;
                                 if (!StringsKt.contains(var57, "Fred", false)) {
                                    continue label443;
                                 }

                                 me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .a(var6.index, 0, ContainerInput.PICKUP);
                                 this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = true;
                                 this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = false;
                                 this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.f();
                                 this.s();
                              } while (var2 != null);

                              if (var2 == null) {
                                 return;
                              }
                              break;
                           }
                        }

                        boolean var58 = ((java.util.function.Supplier<Boolean>)(() -> { this.d().a(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl); return false; })).get();
                        if (var2 == null) {
                           if (!var58) {
                              return;
                           }

                           var58 = false;
                        }

                        boolean var16 = var58;
                        int var17 = 0;

                        label473: {
                           while (var17 < 7) {
                              Iterable var10 = var4;
                              if (var2 != null) {
                                 break label473;
                              }

                              Iterator var11 = var10.iterator();

                              label429:
                              while (true) {
                                 if (var11.hasNext()) {
                                    Object var12 = var11.next();
                                    var10000 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var12;

                                    while (true) {
                                       Slot var13 = (Slot)(Object)var10000;
                                       boolean var14 = false;
                                       int var60 = var13.index;
                                       if (var2 == null) {
                                          var60 = var13.index == 10 + var17 ? 1 : 0;
                                       }

                                       if (var60 == 0) {
                                          continue label429;
                                       }

                                       var10000 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var12;
                                       if (var2 == null) {
                                          break label429;
                                       }
                                    }
                                 }

                                 var10000 = null;
                                 break;
                              }

                              Slot var61 = (Slot)(Object)var10000;
                              if ((Slot)(Object)var10000 != null) {
                                 Slot var18;
                                 label476: {
                                    var18 = var61;
                                    me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var62 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                    ItemStack var105 = var18.getItem();
                                    var10003 = -4607;
                                    short var137 = 32099;
                                    Intrinsics.checkNotNullExpressionValue(var105, "getItem(...)");
                                    var var8 = var62.d(var105);
                                    boolean var9 = false;
                                    var63 = var8;
                                    label415:
                                    if (var2 == null) {
                                       if (var8 instanceof Collection) {
                                          var63 = (Collection)var8;
                                          if (var2 != null) {
                                             break label415;
                                          }

                                          if (((me.octo.client.PXDyn)var63).isEmpty()) {
                                             var64 = false;
                                             break label476;
                                          }
                                       }

                                       var63 = var8;
                                    }

                                    Iterator var32 = ((me.octo.client.PXDyn)var63).iterator();

                                    label408:
                                    while (true) {
                                       if (!var32.hasNext()) {
                                          var64 = false;
                                          break;
                                       }

                                       Object var39 = var32.next();
                                       Component var45 = (Component)var39;
                                       boolean var48 = false;
                                       me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var65 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                       String var106 = var45.getString();
                                       var10003 = -4591;
                                       var137 = -18410;
                                       Intrinsics.checkNotNullExpressionValue(var106, "getString(...)");
                                       CharSequence var66 = var65.a(var106);
                                       short var107 = -4579;
                                       var10002 = -14308;
                                       var64 = StringsKt.contains(var66, "Completed", false);

                                       while (var64) {
                                          var64 = true;
                                          if (var2 == null) {
                                             break label408;
                                          }
                                       }
                                    }
                                 }

                                 if (var64) {
                                    String var24;
                                    Map var28;
                                    label395: {
                                       me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var67 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                       String var108 = var18.getItem().getHoverName().getString();
                                       var10003 = -4591;
                                       short var139 = -18410;
                                       Intrinsics.checkNotNullExpressionValue(var108, "getString(...)");
                                       var24 = var67.a(var108);
                                       var28 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
                                       if (var2 == null) {
                                          Integer var68 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(var24);
                                          if (var68 != null) {
                                             var69 = var68;
                                             break label395;
                                          }
                                       }

                                       var69 = 0;
                                    }

                                    Integer var33 = var69 + 1;
                                    var28.put(var24, var33);
                                    var16 = true;
                                 }
                              }

                              var17++;
                              if (var2 != null) {
                                 break;
                              }
                           }

                           if (var16) {
                              me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(48, 0, ContainerInput.PICKUP);
                           }

                           this.a(
                              IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                           );
                           this.s();
                        }

                        if (var2 == null) {
                           return;
                        }
                     }

                     lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI var70 = this;
                     if (var2 == null) {
                        if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                           == lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           )
                         {
                           short var117 = -4580;
                           var10002 = -14106;
                           boolean var97 = Intrinsics.areEqual(var3, "The Forge");
                           if (var2 == null) {
                              if (var97) {
                                 this.r();
                                 return;
                              }

                              var97 = this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
                           }

                           label479: {
                              if (var2 == null) {
                                 if (var97) {
                                    label248: {
                                       label247: {
                                          boolean var99 = Intrinsics.areEqual(
                                             var3, this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
                                          );
                                          if (var2 == null) {
                                             if (!var99) {
                                                break label247;
                                             }

                                             var100 = this.d();
                                             if (var2 != null) {
                                                break label248;
                                             }

                                             var99 = ((me.octo.client.PXDyn)var100).a(2000);
                                          }

                                          if (!var99) {
                                             return;
                                          }
                                       }

                                       this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = false;
                                       var100 = this.d();
                                    }

                                    ((me.octo.client.PXDyn)var100).f();
                                    return;
                                 }

                                 var98 = this.d();
                                 if (var2 != null) {
                                    break label479;
                                 }

                                 var97 = ((me.octo.client.PXDyn)var98).a(200);
                              }

                              if (!var97) {
                                 return;
                              }

                              me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(48, 0, ContainerInput.PICKUP);
                              this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var3;
                              this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = true;
                              var98 = this.d();
                           }

                           ((me.octo.client.PXDyn)var98).f();
                           return;
                        }

                        var70 = this;
                     }

                     final var var70f = var70; // PX-FIX: lambda 捕获 final 副本
                     int var71 = ((java.util.function.Supplier<Integer>)(() -> { var70f.d().a(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl); return 0; })).get();
                     if (var2 == null) {
                        if (var71 == 0) {
                           return;
                        }

                        var71 = ((int[])lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)[this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                           .ordinal()];
                     }

                     label482: {
                        if (var2 == null) {
                           switch (var71) {
                              case 1:
                                 short var112 = -4580;
                                 var10002 = -14106;
                                 var71 = ((Intrinsics.areEqual(var3, "The Forge")) ? 1 : 0);
                                 break;
                              case 2:
                                 break label482;
                              case 3:
                                 var84 = this;
                                 if (var2 != null) {
                                    break label468;
                                 }

                                 lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var85 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl];
                                 if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl]
                                    == null) {
                                    var84 = this;
                                    break label468;
                                 }

                                 lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var20 = var85;
                                 if (!Intrinsics.areEqual(var3, var20.a())) {
                                    return;
                                 }

                                 label326:
                                 for (Slot var30 : (List<Slot>)var4) {
                                    do {
                                       boolean var86 = var30.hasItem();
                                       if (var2 == null) {
                                          if (!var86) {
                                             continue label326;
                                          }

                                          me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var87 = me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                          ItemStack var111 = var30.getItem();
                                          var10003 = -4581;
                                          short var141 = 27162;
                                          Intrinsics.checkNotNullExpressionValue(var111, "getItem(...)");
                                          var86 = Intrinsics.areEqual(var87.b(var111), var20.d());
                                       }

                                       if (!var86) {
                                          continue label326;
                                       }

                                       me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .a(var30.index, 0, ContainerInput.PICKUP);
                                       this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                                       this.s();
                                    } while (var2 != null);

                                    return;
                                 }

                                 return;
                              case 4:
                                 lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI var72 = this;
                                 if (var2 == null) {
                                    lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var73 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl];
                                    if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl]
                                       != null) {
                                       lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var19 = var73;
                                       Iterable var35 = var4;
                                       boolean var41 = false;
                                       Iterator var46 = var35.iterator();

                                       label307:
                                       while (true) {
                                          if (!var46.hasNext()) {
                                             var10000 = null;
                                             break;
                                          }

                                          Object var49 = var46.next();
                                          var10000 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var49;

                                          while (true) {
                                             label303: {
                                                label486: {
                                                   Slot var50 = (Slot)(Object)var10000;
                                                   boolean var15 = false;
                                                   var75 = var50.hasItem();
                                                   if (var2 == null) {
                                                      if (!((Boolean)var75)) {
                                                         break label486;
                                                      }

                                                      me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var76 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                                      String var109 = var50.getItem().getHoverName().getString();
                                                      var10003 = -4591;
                                                      short var140 = -18410;
                                                      Intrinsics.checkNotNullExpressionValue(var109, "getString(...)");
                                                      String var77 = StringsKt.trim(var76.a(var109)).toString();
                                                      short var110 = -4603;
                                                      var10002 = -20026;
                                                      var75 = Intrinsics.areEqual(var77, "Confirm");
                                                   }

                                                   if (var2 != null) {
                                                      break label303;
                                                   }

                                                   if (((Boolean)(var75))) {
                                                      var75 = true;
                                                      break label303;
                                                   }
                                                }

                                                var75 = false;
                                             }

                                             if (!((Boolean)var75)) {
                                                break;
                                             }

                                             var10000 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var49;
                                             if (var2 == null) {
                                                break label307;
                                             }
                                          }
                                       }

                                       Slot var78 = (Slot)(Object)var10000;
                                       if ((Slot)(Object)var10000 == null) {
                                          return;
                                       }

                                       Slot var25;
                                       var25 = var78;
                                       Item var29 = Item.BY_BLOCK.get(Blocks.RED_TERRACOTTA);
                                       label275:
                                       if (var29 != null) {
                                          label489: {
                                             boolean var79 = var25.getItem().is(var29);
                                             if (var2 == null) {
                                                if (!var79) {
                                                   break label275;
                                                }

                                                this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.add(var19.d());
                                                var80 = this;
                                                if (var2 != null) {
                                                   break label489;
                                                }

                                                var79 = this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
                                             }

                                             if (var79) {
                                                this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                                this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = false;
                                                this.d().f();
                                                if (var2 == null) {
                                                   return;
                                                }
                                             }

                                             var80 = this;
                                          }

                                          LocalPlayer var81 = this.a().player;
                                          if (var81 != null) {
                                             var81.closeContainer();
                                          }

                                          this.r();
                                          return;
                                       }

                                       label266: {
                                          var36 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                                          var42 = var19.c();
                                          if (var2 == null) {
                                             Integer var82 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
                                                .get(var19.c());
                                             if (var82 != null) {
                                                var83 = var82;
                                                break label266;
                                             }
                                          }

                                          var83 = 0;
                                       }

                                       Integer var47 = var83 + 1;
                                       ((me.octo.client.PXDyn)var36).put(var42, var47);
                                       me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                          .a(var25.index, 0, ContainerInput.PICKUP);
                                       this.r();
                                       return;
                                    }

                                    var72 = this;
                                 }

                                 lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI var34 = var72;
                                 boolean var40 = false;
                                 var34.r();
                                 return;
                              default:
                                 return;
                           }
                        }

                        if (var2 == null) {
                           if (var71 == 0) {
                              return;
                           }

                           var71 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        }

                        int var21 = var71;

                        while (true) {
                           if (var21 < 7) {
                              var88 = this;
                              if (var2 != null) {
                                 break;
                              }

                              label365: {
                                 lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var89 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var21];
                                 if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var21] != null) {
                                    lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var27 = var89;
                                    if (var2 != null) {
                                       break label365;
                                    }

                                    if (!this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.contains(var27.d())) {
                                       Slot var90 = (Slot)CollectionsKt.getOrNull(var4, 10 + var21);
                                       if (var90 != null) {
                                          Slot var31 = var90;
                                          if (var2 != null) {
                                             break label365;
                                          }

                                          if (var31.hasItem()) {
                                             me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var91 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                                             String var113 = var31.getItem().getHoverName().getString();
                                             var10003 = -4591;
                                             short var142 = -18410;
                                             Intrinsics.checkNotNullExpressionValue(var113, "getString(...)");
                                             CharSequence var92 = var91.a(var113);
                                             short var114 = -4578;
                                             var10002 = 7875;
                                             if (StringsKt.contains(var92, "Slot #", false)) {
                                                me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                                   .a(var31.index, 0, ContainerInput.PICKUP);
                                                this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var21;
                                                this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                                                this.s();
                                                return;
                                             }
                                          }
                                       }
                                    }
                                 }

                                 var21++;
                              }

                              if (var2 == null) {
                                 continue;
                              }
                           }

                           var88 = this;
                           break;
                        }

                        LocalPlayer var93 = this.a().player;
                        if (var93 != null) {
                           var93.closeContainer();
                        }

                        short var94 = -4585;
                        short var115 = -9757;
                        Pair[] var22 = new Pair[2];
                        var10003 = -4582;
                        short var143 = 3219;
                        var22[0] = TuplesKt.to(
                           "claimed", MapsKt.toMap(this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl)
                        );
                        var10003 = -4577;
                        byte var144 = 56;
                        var22[1] = TuplesKt.to(
                           "started", MapsKt.toMap(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI)
                        );
                        me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
                           "auto_forge_complete", MapsKt.mapOf(var22), false, true
                        );
                        this.a(true);
                        if (var2 == null) {
                           return;
                        }
                     }

                     short var116 = -4606;
                     var10002 = -7781;
                     if (!StringsKt.startsWith(var3, "Select Process", false)) {
                        return;
                     }

                     lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI var95 = this;
                     if (var2 == null) {
                        lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var96 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl];
                        if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl]
                           != null) {
                           lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var23 = var96;
                           me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var23.b(), 0, ContainerInput.PICKUP);
                           this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                           this.s();
                           return;
                        }

                        var95 = this;
                     }

                     lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI var38 = var95;
                     boolean var44 = false;
                     var38.r();
                     return;
                  }

                  lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI var37 =((lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI)( var84));
                  boolean var43 = false;
                  var37.r();
                  return;
               }
            }

            return;
         }
      }
   }

   @Override
   public void b(@NotNull me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      short var10002 = -4608;
      short var10003 = 14348;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI var4 = this;
      if (var2 == null) {
         if (this.c()
            != IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            )
          {
            return;
         }

         var4 = this;
      }

      if (var4.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll) {
         Packet var3 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var5 = var3 instanceof ClientboundSystemChatPacket;
         if (var2 == null) {
            if (!var5) {
               return;
            }

            var5 = ((ClientboundSystemChatPacket)var3).overlay();
         }

         if (var2 == null) {
            if (var5) {
               return;
            }

            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var6 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            String var10001 = ((ClientboundSystemChatPacket)var3).content().getString();
            var10003 = -4587;
            short var10004 = -22356;
            Intrinsics.checkNotNullExpressionValue(var10001, "getString(...)");
            String var7 = var6.a(var10001);
            short var8 = -4584;
            var10002 = -8817;
            var5 = StringsKt.startsWith(var7, "[NPC] Fred", false);
         }

         if (var5) {
            this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = true;
            this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.f();
         }
      }
   }

   private final void n() {
      this.a(
         IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      );
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = false;
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = false;
      this.s();
   }

   private final void o() {
      label21: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
         int var2 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
         this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var2 + 1;
         lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI var3 = this;
         if (var1 == null) {
            if (this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll >= 10) {
               llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.f();
               this.a(true);
               return;
            }

            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = false;
            this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = false;
            if (var1 != null) {
               break label21;
            }

            var3 = this;
         }

         LocalPlayer var4 = var3.a().player;
         if (var4 != null) {
            var4.closeContainer();
         }
      }

      this.s();
   }

   private final void p() {
      this.a(
         IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.s();
   }

   private final void q() {
      this.a(
         IlIlIIIllIIlIIlllIlIlIlIIlIIIlIllIllIIIllIIlIlIIllIIlIIlIlllIIIlllIlIIlIIIIlIllIlIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      this.s();
   }

   private final void r() {
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      int var1 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl++;
      this.s();
   }

   private final void s() {
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 500 + Random.Default.nextInt(500);
      this.d().f();
   }

   @Override
   public void j() {
      Object var8 = null; // PX-FIX
      Object var6 = null; // PX-FIX
      short var10000 = -4596;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10001 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      super.j();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10001;
      short var9 = 20230;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
      me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
         "auto_forge_start", MapsKt.emptyMap(), false, true
      );
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[7];
      int var2 = 1;

      label53: {
         while (true) {
            if (var2 < 8) {
               label43: {
                  IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI var5 = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  int var10 = var2;
                  if (var1 == null) {
                     var6 = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var2);
                     if (var1 != null) {
                        break;
                     }

                     if (((Boolean)(var6))) {
                        break label43;
                     }

                     var5 = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     var10 = var2;
                  }

                  String var7 = var5.a(var10);
                  if (var7 != null) {
                     String var3 = var7;
                     this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var2 - 1] = this.b(var3);
                  }
               }

               var2++;
               if (var1 == null) {
                  continue;
               }
            }

            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0;
            llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.f();
            this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = 0;
            var8 = IlIlIIlIlIlllIIIIllIlllIlIlllIlllIIlIlIllIIIllIllIllIlIllIllIIIIIIIllIllIllIlllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d()
               .y();
            if (var1 != null) {
               break label53;
            }

            short var11 = -4590;
            short var10002 = -20520;
            var6 = Intrinsics.areEqual(var8, "Abiphone Mode");
            break;
         }

         if (((Boolean)(var6))) {
            var8 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .u();
            if (var1 != null) {
               break label53;
            }

            if (var8 != null) {
               this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = true;
               me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12 = me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .u();
               Intrinsics.checkNotNull(var12);
               this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var12.b();
               this.n();
               if (var1 == null) {
                  return;
               }
            }
         }

         this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = false;
         var8 = CollectionsKt.random(this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, (Random)Random.Default);
      }

      Pair var4 = (Pair)var8;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = (BlockPos)var4.getFirst();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = (Vec3)var4.getSecond();
      this.a(
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
         2000
      );
   }

   @Override
   public void k() {
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = 0;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = false;
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = false;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = false;
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = false;
      IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .e()
         .c(true);
      super.k();
   }

   private final lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI b(
      String var1
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      if (var2 == null) {
         IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1);
         if (var10000 != null) {
            IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = var10000;
            return new lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var3.c(), var3.d(), var3.b(), var3.a()
            );
         }
      }

      return null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[25];
      int var3 = 0;
      String var2 = "ÙRJs'zoI\u000eõ\u00920¯Ê»JÄöb\u001c\rCã\u0004\u0085b*s\u0013¹Â\u007f\u008b\b\u0090Z+2MõA`Ê\u001fi\u0089ßß\u0005â\u000b\u0081ÐÏ\u000eÈÍ\u0097D>ÆÔk%\u0097f³\f4\réäL¥ç w\u0012ñ·\u00124 \u0004äa®é\t]zamáã@xÍ\t-\u008c\u0092\u0004¼\u009e\u0082\u009eR\u0006z\u0091hÀíÄ\u0007½\u001bº\u008c,Í\u009b\nÊhH®LÛ¹Ì@°\u000e\u0096¦\\?]{á\u0000\u009d£¬5Uä\u0007¶[É\u0084[´O\f\u0083¨þò\u0013^uËÜ\u000b9á\t\u0081{úM\u0092ç.ø\u0000\u0007\u00adÏ\u0081z¸\u0092¾\u000e\u0082&Þ/\ryë@Ü«\u00844PÄ\n9\u008cKBñ\u0089õ,Ç\u00ad\u0005&`\u0019½Ü\f\u0017\u0016l%A¤?\u0094\u0095à\u0010\u009c\u000eøm;f§t[Å¡ü\f:ø}";
      int var4 = "ÙRJs'zoI\u000eõ\u00920¯Ê»JÄöb\u001c\rCã\u0004\u0085b*s\u0013¹Â\u007f\u008b\b\u0090Z+2MõA`Ê\u001fi\u0089ßß\u0005â\u000b\u0081ÐÏ\u000eÈÍ\u0097D>ÆÔk%\u0097f³\f4\réäL¥ç w\u0012ñ·\u00124 \u0004äa®é\t]zamáã@xÍ\t-\u008c\u0092\u0004¼\u009e\u0082\u009eR\u0006z\u0091hÀíÄ\u0007½\u001bº\u008c,Í\u009b\nÊhH®LÛ¹Ì@°\u000e\u0096¦\\?]{á\u0000\u009d£¬5Uä\u0007¶[É\u0084[´O\f\u0083¨þò\u0013^uËÜ\u000b9á\t\u0081{úM\u0092ç.ø\u0000\u0007\u00adÏ\u0081z¸\u0092¾\u000e\u0082&Þ/\ryë@Ü«\u00844PÄ\n9\u008cKBñ\u0089õ,Ç\u00ad\u0005&`\u0019½Ü\f\u0017\u0016l%A¤?\u0094\u0095à\u0010\u009c\u000eøm;f§t[Å¡ü\f:ø}"
         .length();
      char var1 = '\b';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 96;
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
                     case 0 -> 32;
                     case 1 -> 89;
                     case 2 -> 25;
                     case 3 -> 32;
                     case 4 -> 13;
                     case 5 -> 109;
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
                     c = var5;
                     d = new String[25];
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
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

                  var2 = "@r\u008b:\u0010/\u008b\u001c\u0013Õ2PÎÂ@ZA?e?¸";
                  var4 = "@r\u008b:\u0010/\u008b\u001c\u0013Õ2PÎÂ@ZA?e?¸".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 30;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -4588) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 11;
            case 1 -> 70;
            case 2 -> 28;
            case 3 -> 55;
            case 4 -> 69;
            case 5 -> 208;
            case 6 -> 89;
            case 7 -> 151;
            case 8 -> 103;
            case 9 -> 252;
            case 10 -> 26;
            case 11 -> 127;
            case 12 -> 139;
            case 13 -> 47;
            case 14 -> 161;
            case 15 -> 136;
            case 16 -> 65;
            case 17 -> 150;
            case 18 -> 41;
            case 19 -> 23;
            case 20 -> 200;
            case 21 -> 174;
            case 22 -> 236;
            case 23 -> 44;
            case 24 -> 73;
            case 25 -> 83;
            case 26 -> 187;
            case 27 -> 231;
            case 28 -> 63;
            case 29 -> 157;
            case 30 -> 156;
            case 31 -> 147;
            case 32 -> 179;
            case 33 -> 155;
            case 34 -> 42;
            case 35 -> 105;
            case 36 -> 71;
            case 37 -> 6;
            case 38 -> 191;
            case 39 -> 167;
            case 40 -> 7;
            case 41 -> 193;
            case 42 -> 50;
            case 43 -> 153;
            case 44 -> 21;
            case 45 -> 25;
            case 46 -> 66;
            case 47 -> 189;
            case 48 -> 229;
            case 49 -> 32;
            case 50 -> 56;
            case 51 -> 124;
            case 52 -> 209;
            case 53 -> 33;
            case 54 -> 233;
            case 55 -> 201;
            case 56 -> 130;
            case 57 -> 77;
            case 58 -> 90;
            case 59 -> 132;
            case 60 -> 12;
            case 61 -> 79;
            case 62 -> 251;
            case 63 -> 241;
            case 64 -> 108;
            case 65 -> 230;
            case 66 -> 220;
            case 67 -> 14;
            case 68 -> 4;
            case 69 -> 76;
            case 70 -> 112;
            case 71 -> 52;
            case 72 -> 204;
            case 73 -> 181;
            case 74 -> 186;
            case 75 -> 20;
            case 76 -> 175;
            case 77 -> 219;
            case 78 -> 223;
            case 79 -> 166;
            case 80 -> 152;
            case 81 -> 183;
            case 82 -> 141;
            case 83 -> 101;
            case 84 -> 135;
            case 85 -> 46;
            case 86 -> 125;
            case 87 -> 51;
            case 88 -> 227;
            case 89 -> 146;
            case 90 -> 247;
            case 91 -> 57;
            case 92 -> 67;
            case 93 -> 158;
            case 94 -> 253;
            case 95 -> 202;
            case 96 -> 243;
            case 97 -> 86;
            case 98 -> 110;
            case 99 -> 95;
            case 100 -> 244;
            case 101 -> 180;
            case 102 -> 9;
            case 103 -> 78;
            case 104 -> 216;
            case 105 -> 195;
            case 106 -> 92;
            case 107 -> 120;
            case 108 -> 242;
            case 109 -> 238;
            case 110 -> 177;
            case 111 -> 43;
            case 112 -> 2;
            case 113 -> 31;
            case 114 -> 245;
            case 115 -> 215;
            case 116 -> 211;
            case 117 -> 72;
            case 118 -> 18;
            case 119 -> 210;
            case 120 -> 0;
            case 121 -> 137;
            case 122 -> 143;
            case 123 -> 188;
            case 124 -> 159;
            case 125 -> 60;
            case 126 -> 99;
            case 127 -> 196;
            case 128 -> 8;
            case 129 -> 16;
            case 130 -> 194;
            case 131 -> 199;
            case 132 -> 40;
            case 133 -> 169;
            case 134 -> 197;
            case 135 -> 68;
            case 136 -> 39;
            case 137 -> 19;
            case 138 -> 190;
            case 139 -> 117;
            case 140 -> 226;
            case 141 -> 81;
            case 142 -> 178;
            case 143 -> 173;
            case 144 -> 102;
            case 145 -> 203;
            case 146 -> 10;
            case 147 -> 37;
            case 148 -> 36;
            case 149 -> 213;
            case 150 -> 192;
            case 151 -> 58;
            case 152 -> 64;
            case 153 -> 13;
            case 154 -> 234;
            case 155 -> 126;
            case 156 -> 205;
            case 157 -> 149;
            case 158 -> 142;
            case 159 -> 74;
            case 160 -> 185;
            case 161 -> 107;
            case 162 -> 184;
            case 163 -> 94;
            case 164 -> 61;
            case 165 -> 59;
            case 166 -> 221;
            case 167 -> 133;
            case 168 -> 148;
            case 169 -> 240;
            case 170 -> 249;
            case 171 -> 138;
            case 172 -> 246;
            case 173 -> 97;
            case 174 -> 164;
            case 175 -> 123;
            case 176 -> 128;
            case 177 -> 85;
            case 178 -> 29;
            case 179 -> 84;
            case 180 -> 22;
            case 181 -> 218;
            case 182 -> 131;
            case 183 -> 100;
            case 184 -> 176;
            case 185 -> 111;
            case 186 -> 228;
            case 187 -> 232;
            case 188 -> 53;
            case 189 -> 255;
            case 190 -> 62;
            case 191 -> 34;
            case 192 -> 17;
            case 193 -> 225;
            case 194 -> 250;
            case 195 -> 118;
            case 196 -> 165;
            case 197 -> 91;
            case 198 -> 106;
            case 199 -> 160;
            case 200 -> 162;
            case 201 -> 207;
            case 202 -> 15;
            case 203 -> 140;
            case 204 -> 115;
            case 205 -> 3;
            case 206 -> 114;
            case 207 -> 212;
            case 208 -> 248;
            case 209 -> 235;
            case 210 -> 145;
            case 211 -> 171;
            case 212 -> 87;
            case 213 -> 98;
            case 214 -> 119;
            case 215 -> 104;
            case 216 -> 27;
            case 217 -> 144;
            case 218 -> 82;
            case 219 -> 224;
            case 220 -> 134;
            case 221 -> 48;
            case 222 -> 45;
            case 223 -> 206;
            case 224 -> 30;
            case 225 -> 217;
            case 226 -> 198;
            case 227 -> 38;
            case 228 -> 237;
            case 229 -> 163;
            case 230 -> 1;
            case 231 -> 168;
            case 232 -> 54;
            case 233 -> 129;
            case 234 -> 122;
            case 235 -> 93;
            case 236 -> 182;
            case 237 -> 24;
            case 238 -> 96;
            case 239 -> 154;
            case 240 -> 80;
            case 241 -> 109;
            case 242 -> 35;
            case 243 -> 121;
            case 244 -> 5;
            case 245 -> 239;
            case 246 -> 254;
            case 247 -> 88;
            case 248 -> 214;
            case 249 -> 75;
            case 250 -> 172;
            case 251 -> 116;
            case 252 -> 113;
            case 253 -> 170;
            case 254 -> 49;
            default -> 222;
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

   public static enum IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] c() {
         return new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[]{ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI };
      }


      public static lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] a() {
         return (lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.clone();
      }

      public static lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         String var0
      ) {
         return Enum.valueOf(
            lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> b() {
         return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI};
      private static final EnumEntries<IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = kotlin.enums.EnumEntriesKt.enumEntries(IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull String var1, int var2, @NotNull String var3, @NotNull String var4
      ) {
         short var10001 = -29851;
         short var10002 = -22373;
         Intrinsics.checkNotNullParameter(var1, "processName");
         var10001 = -29852;
         var10002 = 4798;
         Intrinsics.checkNotNullParameter(var3, "itemName");
         var10001 = -29850;
         var10002 = 11645;
         Intrinsics.checkNotNullParameter(var4, "skyblockId");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final String c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "/¬ã%!\u009f¼´\u000b_\nÝ9\u0086Á\u0018\u0004\u009aM\\\n\u0010:A\u0004È[éí\u009eø";
         int var4 = "/¬ã%!\u009f¼´\u000b_\nÝ9\u0086Á\u0018\u0004\u009aM\\\n\u0010:A\u0004È[éí\u009eø".length();
         char var1 = '\b';
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 107;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 107;
                  var10006 = var6;
               } else {
                  var13 = 107;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 107;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 106;
                     case 1 -> 40;
                     case 2 -> 108;
                     case 3 -> 36;
                     case 4 -> 81;
                     case 5 -> 24;
                     default -> 94;
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
         int var2 = (var0 ^ -29852) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 30;
               case 1 -> 199;
               case 2 -> 110;
               case 3 -> 147;
               case 4 -> 91;
               case 5 -> 184;
               case 6 -> 7;
               case 7 -> 164;
               case 8 -> 145;
               case 9 -> 194;
               case 10 -> 11;
               case 11 -> 221;
               case 12 -> 138;
               case 13 -> 139;
               case 14 -> 36;
               case 15 -> 135;
               case 16 -> 94;
               case 17 -> 27;
               case 18 -> 188;
               case 19 -> 81;
               case 20 -> 1;
               case 21 -> 245;
               case 22 -> 171;
               case 23 -> 172;
               case 24 -> 192;
               case 25 -> 45;
               case 26 -> 143;
               case 27 -> 200;
               case 28 -> 133;
               case 29 -> 213;
               case 30 -> 9;
               case 31 -> 241;
               case 32 -> 58;
               case 33 -> 159;
               case 34 -> 187;
               case 35 -> 166;
               case 36 -> 52;
               case 37 -> 79;
               case 38 -> 156;
               case 39 -> 75;
               case 40 -> 222;
               case 41 -> 179;
               case 42 -> 230;
               case 43 -> 8;
               case 44 -> 102;
               case 45 -> 238;
               case 46 -> 119;
               case 47 -> 113;
               case 48 -> 108;
               case 49 -> 71;
               case 50 -> 226;
               case 51 -> 198;
               case 52 -> 59;
               case 53 -> 26;
               case 54 -> 112;
               case 55 -> 98;
               case 56 -> 12;
               case 57 -> 64;
               case 58 -> 90;
               case 59 -> 165;
               case 60 -> 39;
               case 61 -> 140;
               case 62 -> 243;
               case 63 -> 117;
               case 64 -> 50;
               case 65 -> 228;
               case 66 -> 41;
               case 67 -> 227;
               case 68 -> 92;
               case 69 -> 186;
               case 70 -> 223;
               case 71 -> 46;
               case 72 -> 150;
               case 73 -> 87;
               case 74 -> 240;
               case 75 -> 206;
               case 76 -> 74;
               case 77 -> 190;
               case 78 -> 158;
               case 79 -> 107;
               case 80 -> 125;
               case 81 -> 232;
               case 82 -> 212;
               case 83 -> 48;
               case 84 -> 86;
               case 85 -> 89;
               case 86 -> 151;
               case 87 -> 235;
               case 88 -> 25;
               case 89 -> 54;
               case 90 -> 57;
               case 91 -> 173;
               case 92 -> 63;
               case 93 -> 134;
               case 94 -> 109;
               case 95 -> 67;
               case 96 -> 104;
               case 97 -> 118;
               case 98 -> 215;
               case 99 -> 116;
               case 100 -> 2;
               case 101 -> 218;
               case 102 -> 193;
               case 103 -> 146;
               case 104 -> 220;
               case 105 -> 123;
               case 106 -> 31;
               case 107 -> 80;
               case 108 -> 163;
               case 109 -> 70;
               case 110 -> 136;
               case 111 -> 56;
               case 112 -> 43;
               case 113 -> 141;
               case 114 -> 219;
               case 115 -> 10;
               case 116 -> 55;
               case 117 -> 77;
               case 118 -> 208;
               case 119 -> 185;
               case 120 -> 14;
               case 121 -> 32;
               case 122 -> 169;
               case 123 -> 175;
               case 124 -> 247;
               case 125 -> 174;
               case 126 -> 111;
               case 127 -> 176;
               case 128 -> 68;
               case 129 -> 47;
               case 130 -> 128;
               case 131 -> 130;
               case 132 -> 126;
               case 133 -> 115;
               case 134 -> 205;
               case 135 -> 224;
               case 136 -> 65;
               case 137 -> 153;
               case 138 -> 78;
               case 139 -> 76;
               case 140 -> 250;
               case 141 -> 96;
               case 142 -> 137;
               case 143 -> 49;
               case 144 -> 44;
               case 145 -> 60;
               case 146 -> 62;
               case 147 -> 249;
               case 148 -> 214;
               case 149 -> 229;
               case 150 -> 148;
               case 151 -> 217;
               case 152 -> 154;
               case 153 -> 40;
               case 154 -> 236;
               case 155 -> 162;
               case 156 -> 129;
               case 157 -> 97;
               case 158 -> 182;
               case 159 -> 196;
               case 160 -> 195;
               case 161 -> 204;
               case 162 -> 6;
               case 163 -> 22;
               case 164 -> 237;
               case 165 -> 157;
               case 166 -> 252;
               case 167 -> 66;
               case 168 -> 34;
               case 169 -> 181;
               case 170 -> 216;
               case 171 -> 246;
               case 172 -> 120;
               case 173 -> 160;
               case 174 -> 203;
               case 175 -> 4;
               case 176 -> 255;
               case 177 -> 149;
               case 178 -> 16;
               case 179 -> 161;
               case 180 -> 144;
               case 181 -> 127;
               case 182 -> 85;
               case 183 -> 21;
               case 184 -> 101;
               case 185 -> 202;
               case 186 -> 99;
               case 187 -> 18;
               case 188 -> 211;
               case 189 -> 84;
               case 190 -> 37;
               case 191 -> 239;
               case 192 -> 197;
               case 193 -> 33;
               case 194 -> 53;
               case 195 -> 131;
               case 196 -> 95;
               case 197 -> 29;
               case 198 -> 210;
               case 199 -> 152;
               case 200 -> 207;
               case 201 -> 15;
               case 202 -> 242;
               case 203 -> 191;
               case 204 -> 178;
               case 205 -> 13;
               case 206 -> 124;
               case 207 -> 19;
               case 208 -> 5;
               case 209 -> 73;
               case 210 -> 72;
               case 211 -> 35;
               case 212 -> 24;
               case 213 -> 180;
               case 214 -> 168;
               case 215 -> 122;
               case 216 -> 177;
               case 217 -> 83;
               case 218 -> 167;
               case 219 -> 105;
               case 220 -> 103;
               case 221 -> 142;
               case 222 -> 244;
               case 223 -> 17;
               case 224 -> 251;
               case 225 -> 28;
               case 226 -> 0;
               case 227 -> 132;
               case 228 -> 254;
               case 229 -> 253;
               case 230 -> 201;
               case 231 -> 69;
               case 232 -> 248;
               case 233 -> 170;
               case 234 -> 20;
               case 235 -> 23;
               case 236 -> 3;
               case 237 -> 61;
               case 238 -> 233;
               case 239 -> 42;
               case 240 -> 51;
               case 241 -> 231;
               case 242 -> 225;
               case 243 -> 121;
               case 244 -> 82;
               case 245 -> 209;
               case 246 -> 38;
               case 247 -> 155;
               case 248 -> 114;
               case 249 -> 234;
               case 250 -> 106;
               case 251 -> 183;
               case 252 -> 93;
               case 253 -> 88;
               case 254 -> 100;
               default -> 189;
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
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      private final List<String> a() {
      Object var24 = null; // PX-FIX
         Map var2 = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b();
         boolean var3 = false;
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
         LinkedHashMap var4 = new LinkedHashMap();
         Iterator var5 = var2.entrySet().iterator();
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;

         while (var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            int var7 = ((Number)var6.getKey()).intValue();
            boolean var8 = false;
            boolean var22 = IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var7);
            if (var1 == null) {
               var22 = !var22;
            }

            if (var22) {
               var4.put(var6.getKey(), var6.getValue());
               if (var1 != null) {
                  break;
               }
            }
         }

         Iterable var17 = var4.values();
         var3 = false;
         var var19 = new ArrayList();
         boolean var20 = false;
         boolean var21 = false;

         for (Object var10 : var17) {
            boolean var12 = false;
            String var13 = (String)var10;
            boolean var14 = false;
            if (var1 == null) {
               label38: {
                  if (var1 == null) {
                     IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var23 = IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a(var13);
                     if (var23 != null) {
                        var24 = var23.b();
                        break label38;
                     }
                  }

                  var24 = null;
               }

               if (var24 != null) {
                  String var15 =((String)( var24));
                  boolean var16 = false;
                  var19.add(var15);
               }

               if (var1 == null) {
                  continue;
               }
            }
            break;
         }

         return var19;
      }

      public final boolean b() {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
         boolean var10000 = IlIlIIlIlIlllIIIIllIlllIlIlllIlllIIlIlIllIIIllIllIllIlIllIllIIIIIIIllIllIllIlllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .aA();
         if (var1 == null) {
            if (!var10000) {
               return false;
            }

            var10000 = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
         }

         label60:
         if (var1 == null) {
            if (var10000) {
               var10000 = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                  .a(
                     Long.valueOf(IlIlIIlIlIlllIIIIllIlllIlIlllIlllIIlIlIllIIIllIllIllIlIllIllIIIIIIIllIllIllIlllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .c()
                           .M()
                        * 60000L)
                  );
               if (var1 != null) {
                  break label60;
               }

               if (!var10000) {
                  return false;
               }
            }

            var10000 = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
         }

         label53:
         if (var1 == null) {
            label51:
            if (var10000) {
               var10000 = IlIlIIlIlIlllIIIIllIlllIlIlllIlllIIlIlIllIIIllIllIllIlIllIllIIIIIIIllIllIllIlllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b()
                  .al();
               if (var1 == null) {
                  if (var10000) {
                     var10000 = ((java.util.function.Supplier<Boolean>)(() -> { lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .a(1800000L); return false; })).get();
                     if (var1 != null) {
                        break label53;
                     }

                     if (var10000) {
                        break label51;
                     }
                  }

                  var10000 = c();
               }

               if (var1 != null) {
                  break label53;
               }

               if (!var10000) {
                  var10000 = false;
                  break label53;
               }
            }

            var10000 = true;
         }

         boolean var2 = var10000;
         var10000 = var2;
         if (var1 == null) {
            if (var2) {
               lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = true;
            }

            var10000 = var2;
         }

         return var10000;
      }

      private static final boolean c() {
      boolean var23 = false; // PX-FIX
      Object var22 = null; // PX-FIX
      int var20 = 0; // PX-FIX
         List var1 = me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .h();
         List var2 = lIlIIlIIlllIlIlIlllIlllIIIIlllIlIIIIIllIllllIllIIIIIIlIlIIIIIIIlllIIllIIIllIIIllIIIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .a();
         short var10002 = -24534;
         short var10003 = -14107;
         Regex var3 = new Regex("^(\\d+)\\.\\s+EMPTY$");
         byte var4 = 0;
         int var5 = 0;
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
         Iterator var6 = var1.iterator();
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0 = var10000;

         while (true) {
            if (var6.hasNext()) {
               String var7 = (String)var6.next();
               String var8 = StringsKt.trim(var7).toString();
               MatchResult var9 = (var3).find( var8, 0);
               if (var0 != null) {
                  break;
               }

               label137: {
                  var10000 = ((me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])(Object)(var9));
                  if (var0 == null) {
                     if (var9 == null) {
                        break label137;
                     }

                     var10000 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])(Object)(var9.getGroupValues()
                        .get(1));
                  }

                  Integer var19 = StringsKt.toIntOrNull((String)(Object)var10000);
                  if (var19 == null) {
                     continue;
                  }

                  int var10;
                  label121: {
                     var10 = var19;
                     var20 = 1;
                     int var10001 = var10;
                     if (var0 == null) {
                        if (1 > var10) {
                           var20 = 0;
                           break label121;
                        }

                        var20 = var10;
                        if (var0 != null) {
                           break label121;
                        }

                        var10001 = 8;
                     }

                     var20 = var20 < var10001 ? 1 : 0;
                  }

                  label113:
                  if (var20 != 0) {
                     byte var21 = ((byte)((IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var10)) ? 1 : 0));
                     if (var0 == null) {
                        if (var21 != 0) {
                           break label113;
                        }

                        var21 = 1;
                     }

                     var4 = var21;
                  }

                  if (var0 == null) {
                     continue;
                  }
               }

               label139: {
                  var var16 = var2;
                  boolean var11 = false;
                  var22 = var16;
                  label102:
                  if (var0 == null) {
                     if (var16 instanceof Collection) {
                        var22 = (Collection)var16;
                        if (var0 != null) {
                           break label102;
                        }

                        if (((me.octo.client.PXDyn)var22).isEmpty()) {
                           var23 = false;
                           break label139;
                        }
                     }

                     var22 = var16;
                  }

                  Iterator var12 = ((me.octo.client.PXDyn)var22).iterator();

                  label95:
                  while (true) {
                     if (!var12.hasNext()) {
                        var23 = false;
                        break;
                     }

                     Object var13 = var12.next();
                     String var14 = (String)var13;
                     boolean var15 = false;
                     var23 = StringsKt.contains(var8, var14, false);

                     while (var23) {
                        var23 = true;
                        if (var0 == null) {
                           break label95;
                        }
                     }
                  }
               }

               if (!var23) {
                  continue;
               }

               short var27 = -24533;
               var10002 = -12526;
               int var24 = ((StringsKt.endsWith(var8, ": Ready!", false)) ? 1 : 0);
               if (var0 == null) {
                  if (var24 != 0) {
                     var4 = 1;
                     if (var0 == null) {
                        continue;
                     }
                  }

                  var24 = me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .b(var8);
               }

               int var17 = var24;
               int var25 = var17;
               if (var0 == null) {
                  if (var17 >= 300) {
                     continue;
                  }

                  var25 = 1;
               }

               var5 = var25;
               if (var0 == null) {
                  continue;
               }
            }

            int var26 = var4;
            if (var0 == null) {
               if (var4 == 0) {
                  break;
               }

               var26 = var5;
            }

            if (var0 != null) {
               return (var26 != 0);
            }

            if (var26 == 0) {
               return (1 != 0);
            }
            break;
         }

         return (0 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
         pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "1!´.!+ÌæY\u001f\u0094ð¾YÆcy\b\u000f\u0019\u0095!\u0080¦Þ¼";
         int var4 = "1!´.!+ÌæY\u001f\u0094ð¾YÆcy\b\u000f\u0019\u0095!\u0080¦Þ¼".length();
         char var1 = 17;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 42;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 42;
                  var10006 = var6;
               } else {
                  var13 = 42;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 42;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 99;
                     case 1 -> 42;
                     case 2 -> 88;
                     case 3 -> 105;
                     case 4 -> 47;
                     case 5 -> 109;
                     default -> 112;
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
               b = new String[2];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -24534) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 216;
               case 1 -> 108;
               case 2 -> 171;
               case 3 -> 206;
               case 4 -> 4;
               case 5 -> 168;
               case 6 -> 3;
               case 7 -> 61;
               case 8 -> 81;
               case 9 -> 66;
               case 10 -> 71;
               case 11 -> 84;
               case 12 -> 215;
               case 13 -> 2;
               case 14 -> 247;
               case 15 -> 159;
               case 16 -> 255;
               case 17 -> 42;
               case 18 -> 218;
               case 19 -> 145;
               case 20 -> 127;
               case 21 -> 99;
               case 22 -> 196;
               case 23 -> 87;
               case 24 -> 39;
               case 25 -> 140;
               case 26 -> 68;
               case 27 -> 1;
               case 28 -> 114;
               case 29 -> 151;
               case 30 -> 116;
               case 31 -> 27;
               case 32 -> 180;
               case 33 -> 21;
               case 34 -> 250;
               case 35 -> 72;
               case 36 -> 231;
               case 37 -> 20;
               case 38 -> 89;
               case 39 -> 48;
               case 40 -> 97;
               case 41 -> 199;
               case 42 -> 252;
               case 43 -> 80;
               case 44 -> 139;
               case 45 -> 125;
               case 46 -> 245;
               case 47 -> 50;
               case 48 -> 60;
               case 49 -> 14;
               case 50 -> 92;
               case 51 -> 62;
               case 52 -> 138;
               case 53 -> 249;
               case 54 -> 52;
               case 55 -> 220;
               case 56 -> 200;
               case 57 -> 190;
               case 58 -> 82;
               case 59 -> 227;
               case 60 -> 175;
               case 61 -> 75;
               case 62 -> 40;
               case 63 -> 246;
               case 64 -> 244;
               case 65 -> 79;
               case 66 -> 5;
               case 67 -> 212;
               case 68 -> 137;
               case 69 -> 188;
               case 70 -> 150;
               case 71 -> 235;
               case 72 -> 65;
               case 73 -> 70;
               case 74 -> 217;
               case 75 -> 111;
               case 76 -> 109;
               case 77 -> 187;
               case 78 -> 19;
               case 79 -> 251;
               case 80 -> 104;
               case 81 -> 64;
               case 82 -> 224;
               case 83 -> 88;
               case 84 -> 15;
               case 85 -> 129;
               case 86 -> 229;
               case 87 -> 208;
               case 88 -> 103;
               case 89 -> 41;
               case 90 -> 118;
               case 91 -> 106;
               case 92 -> 197;
               case 93 -> 130;
               case 94 -> 96;
               case 95 -> 85;
               case 96 -> 26;
               case 97 -> 179;
               case 98 -> 202;
               case 99 -> 233;
               case 100 -> 78;
               case 101 -> 242;
               case 102 -> 239;
               case 103 -> 28;
               case 104 -> 152;
               case 105 -> 143;
               case 106 -> 241;
               case 107 -> 225;
               case 108 -> 45;
               case 109 -> 240;
               case 110 -> 128;
               case 111 -> 47;
               case 112 -> 133;
               case 113 -> 172;
               case 114 -> 189;
               case 115 -> 12;
               case 116 -> 112;
               case 117 -> 205;
               case 118 -> 219;
               case 119 -> 223;
               case 120 -> 191;
               case 121 -> 102;
               case 122 -> 74;
               case 123 -> 237;
               case 124 -> 164;
               case 125 -> 122;
               case 126 -> 160;
               case 127 -> 110;
               case 128 -> 120;
               case 129 -> 8;
               case 130 -> 153;
               case 131 -> 0;
               case 132 -> 198;
               case 133 -> 156;
               case 134 -> 73;
               case 135 -> 148;
               case 136 -> 30;
               case 137 -> 194;
               case 138 -> 185;
               case 139 -> 228;
               case 140 -> 9;
               case 141 -> 163;
               case 142 -> 155;
               case 143 -> 124;
               case 144 -> 59;
               case 145 -> 209;
               case 146 -> 173;
               case 147 -> 24;
               case 148 -> 35;
               case 149 -> 69;
               case 150 -> 6;
               case 151 -> 232;
               case 152 -> 56;
               case 153 -> 221;
               case 154 -> 36;
               case 155 -> 176;
               case 156 -> 86;
               case 157 -> 248;
               case 158 -> 57;
               case 159 -> 204;
               case 160 -> 135;
               case 161 -> 55;
               case 162 -> 182;
               case 163 -> 166;
               case 164 -> 131;
               case 165 -> 234;
               case 166 -> 141;
               case 167 -> 49;
               case 168 -> 77;
               case 169 -> 147;
               case 170 -> 107;
               case 171 -> 158;
               case 172 -> 11;
               case 173 -> 210;
               case 174 -> 29;
               case 175 -> 32;
               case 176 -> 253;
               case 177 -> 13;
               case 178 -> 222;
               case 179 -> 161;
               case 180 -> 214;
               case 181 -> 142;
               case 182 -> 236;
               case 183 -> 170;
               case 184 -> 23;
               case 185 -> 44;
               case 186 -> 165;
               case 187 -> 157;
               case 188 -> 132;
               case 189 -> 144;
               case 190 -> 63;
               case 191 -> 37;
               case 192 -> 33;
               case 193 -> 134;
               case 194 -> 113;
               case 195 -> 207;
               case 196 -> 177;
               case 197 -> 186;
               case 198 -> 91;
               case 199 -> 46;
               case 200 -> 193;
               case 201 -> 38;
               case 202 -> 201;
               case 203 -> 230;
               case 204 -> 178;
               case 205 -> 149;
               case 206 -> 192;
               case 207 -> 7;
               case 208 -> 22;
               case 209 -> 90;
               case 210 -> 25;
               case 211 -> 169;
               case 212 -> 76;
               case 213 -> 211;
               case 214 -> 183;
               case 215 -> 119;
               case 216 -> 117;
               case 217 -> 94;
               case 218 -> 16;
               case 219 -> 51;
               case 220 -> 115;
               case 221 -> 121;
               case 222 -> 238;
               case 223 -> 136;
               case 224 -> 126;
               case 225 -> 93;
               case 226 -> 213;
               case 227 -> 34;
               case 228 -> 254;
               case 229 -> 123;
               case 230 -> 18;
               case 231 -> 243;
               case 232 -> 17;
               case 233 -> 226;
               case 234 -> 31;
               case 235 -> 83;
               case 236 -> 195;
               case 237 -> 54;
               case 238 -> 98;
               case 239 -> 162;
               case 240 -> 58;
               case 241 -> 10;
               case 242 -> 203;
               case 243 -> 105;
               case 244 -> 100;
               case 245 -> 146;
               case 246 -> 95;
               case 247 -> 174;
               case 248 -> 53;
               case 249 -> 154;
               case 250 -> 43;
               case 251 -> 167;
               case 252 -> 181;
               case 253 -> 184;
               case 254 -> 67;
               default -> 101;
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
    public static final void c(boolean var0) {
        lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var0;
    }

    public static final boolean t() {
        return lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
    }

    public static final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI u() {
        return llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
    }

}
