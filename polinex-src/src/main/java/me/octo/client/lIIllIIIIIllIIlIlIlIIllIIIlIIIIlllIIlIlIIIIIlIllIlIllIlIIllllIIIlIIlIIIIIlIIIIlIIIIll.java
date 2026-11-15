package me.octo.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private BlockPos lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final List<lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @JvmField
   @NotNull
   public static lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] f;
   private static String[] g;

   private lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll() {
      short var10001 = 17105;
      short var10002 = -4488;
      var10002 = 17104;
      short var10003 = -17747;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      short var10004 = 17109;
      short var10005 = -13663;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.a(),
         lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.b(),
         lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.c(),
         lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.d(),
         lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.e()
      };
      super("Pingless Hardstone", "Makes Mining Hardstone Pingless.", var3, "Crystal Hollows", var1);
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new ArrayList<>();
   }

   @NotNull
   public final List<lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> ag() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      short var10001 = 17110;
      short var10002 = 1975;
      Intrinsics.checkNotNullParameter(var1, "event");
      Packet var2 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var2 instanceof ServerboundPlayerActionPacket) {
         if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .g()
            != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            )
          {
            return;
         }

         if (((ServerboundPlayerActionPacket)var2).getAction() == Action.START_DESTROY_BLOCK) {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = ((ServerboundPlayerActionPacket)var2).getPos();
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.f();
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var21 = null; // PX-FIX
      int[] var2;
      lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll var14;
      label164: {
         label163: {
            int[] var10000 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
            short var10002 = 17107;
            short var10003 = -16609;
            Intrinsics.checkNotNullParameter(var1, "event");
            var2 = var10000;
            int var13 = ((me.octo.client.PXDyn)(Object)(lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.d())).al();
            if (var2 != null) {
               if (var13 != 0) {
                  break label163;
               }

               var14 = this;
               if (var2 == null) {
                  break label164;
               }

               LocalPlayer var15 = this.ap().player;
               Intrinsics.checkNotNull(var15);
               float var38;
               var13 = (var38 = var15.getXRot() - 45.0F) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1);
            }

            if (var13 > 0) {
               return;
            }
         }

         var14 = this;
      }

      label154: {
         label181: {
            label100:
            if (var14.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
               BlockPos var5;
               BlockState var7;
               label177: {
                  Block var8;
                  label149: {
                     label171: {
                        var5 = var14.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        boolean var6 = false;
                        ClientLevel var17 = this.ap().level;
                        Intrinsics.checkNotNull(var17);
                        BlockState var18 = var17.getBlockState(var5);
                        short var31 = 17111;
                        short var34 = -716;
                        Intrinsics.checkNotNullExpressionValue(var18, "getBlockState(...)");
                        var7 = var18;
                        Block var19 = var7.getBlock();
                        var31 = 17115;
                        var34 = -15529;
                        Intrinsics.checkNotNullExpressionValue(var19, "getBlock(...)");
                        var8 = var19;
                        boolean var20 = Intrinsics.areEqual(var8, Blocks.STONE);
                        if (var2 != null) {
                           if (!var20) {
                              var21 = Intrinsics.areEqual(var8, Blocks.INFESTED_STONE);
                              if (var2 == null) {
                                 break label149;
                              }

                              if (!(me.octo.client.PxTruth.truth(var21))) {
                                 break label171;
                              }
                           }

                           var20 = ((java.util.function.Supplier<Boolean>)(() -> { this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(1); return false; })).get();
                        }

                        if (var2 == null) {
                           break label154;
                        }

                        if (var20) {
                           break label177;
                        }

                        var21 = ((me.octo.client.PXDyn)(Object)(lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.a())).al();
                        if (var2 == null) {
                           break label149;
                        }

                        if (!(me.octo.client.PxTruth.truth(var21))) {
                           break label177;
                        }
                     }

                     var21 = ((me.octo.client.PXDyn)(Object)(lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.b())).al();
                  }

                  label130:
                  if (var2 != null) {
                     label128:
                     if ((me.octo.client.PxTruth.truth(var21))) {
                        var21 = ((java.util.function.Supplier<Object>)(() -> { this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(1); return null; })).get();
                        if (var2 != null) {
                           if (!(me.octo.client.PxTruth.truth(var21))) {
                              var21 = ((me.octo.client.PXDyn)(Object)(lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.a())).al();
                              if (var2 == null) {
                                 break label130;
                              }

                              if ((me.octo.client.PxTruth.truth(var21))) {
                                 break label128;
                              }
                           }

                           var21 = this.a(var8);
                        }

                        if (var2 == null) {
                           break label130;
                        }

                        if ((me.octo.client.PxTruth.truth(var21))) {
                           this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                              .add(
                                 new lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                                    var5, var7, System.currentTimeMillis()
                                 )
                              );
                           ClientLevel var23 = this.ap().level;
                           Intrinsics.checkNotNull(var23);
                           var23.setBlock(var5, Blocks.AIR.defaultBlockState(), 3);
                           this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
                           return;
                        }
                     }

                     var21 = ((me.octo.client.PXDyn)(Object)(lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.c())).al();
                  }

                  if (var2 != null) {
                     if (!(me.octo.client.PxTruth.truth(var21))) {
                        break label100;
                     }

                     var21 = ((java.util.function.Supplier<Object>)(() -> { this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.a(1); return null; })).get();
                  }

                  label109:
                  if (var2 != null) {
                     if (!(me.octo.client.PxTruth.truth(var21))) {
                        var21 = ((me.octo.client.PXDyn)(Object)(lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.a())).al();
                        if (var2 == null) {
                           break label109;
                        }

                        if ((me.octo.client.PxTruth.truth(var21))) {
                           break label100;
                        }
                     }

                     var21 = this.b(var8);
                  }

                  if (var2 == null) {
                     break label181;
                  }

                  if ((me.octo.client.PxTruth.truth(var21))) {
                     this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                        .add(
                           new lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                              var5, var7, System.currentTimeMillis()
                           )
                        );
                     ClientLevel var24 = this.ap().level;
                     Intrinsics.checkNotNull(var24);
                     var24.setBlock(var5, Blocks.AIR.defaultBlockState(), 3);
                     break label181;
                  }
                  break label100;
               }

               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                  .add(
                     new lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        var5, var7, System.currentTimeMillis()
                     )
                  );
               ClientLevel var22 = this.ap().level;
               Intrinsics.checkNotNull(var22);
               var22.setBlock(var5, Blocks.AIR.defaultBlockState(), 3);
               break label154;
            }

            long var3 = System.currentTimeMillis();
            List var9 = new ArrayList();
            Iterator var10 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.iterator();

            label89:
            while (true) {
               int var25 = ((var10.hasNext()) ? 1 : 0);

               while (var25 != 0) {
                  lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var11 = (lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10.next();
                  long var39;
                  var25 = (var39 = var3 - (Long)var11.c() - ((Long)((me.octo.client.PXDyn)(Object)(lIlIIIlIlIllllIlIlIIlllllIlllIIlllIIIIllIllIIIlIlIIlIlIIlIlllllIIlIllIIIIIllllIllllll.e())).M())) == 0L
                     ? 0
                     : (var39 < 0L ? -1 : 1);
                  if (var2 == null) {
                     return;
                  }

                  if (var2 != null) {
                     if (var25 < 0) {
                        continue label89;
                     }

                     ClientLevel var26 = this.ap().level;
                     Intrinsics.checkNotNull(var26);
                     BlockState var27 = var26.getBlockState(var11.a());
                     short var33 = 17106;
                     short var36 = -20016;
                     Intrinsics.checkNotNullExpressionValue(var27, "getBlockState(...)");
                     BlockState var12 = var27;
                     boolean var28 = Intrinsics.areEqual(var12.getBlock(), Blocks.AIR);
                     label76:
                     if (var2 != null) {
                        if (!var28) {
                           Block var10001 = var12.getBlock();
                           var36 = 17108;
                           short var10004 = -24793;
                           Intrinsics.checkNotNullExpressionValue(var10001, "getBlock(...)");
                           boolean var29 = this.c(var10001);
                           if (var2 == null) {
                              break label76;
                           }

                           if (!var29) {
                              ClientLevel var30 = this.ap().level;
                              Intrinsics.checkNotNull(var30);
                              var30.setBlock(var11.a(), var11.b(), 3);
                           }
                        }

                        var9.add(var11);
                     }

                     if (var2 != null) {
                        continue label89;
                     }
                     break;
                  }
               }

               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.removeAll(var9);
               return;
            }
         }

         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
         return;
      }

      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   private final boolean a(Block var1) {
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      boolean var10000 = Intrinsics.areEqual(var1, Blocks.COAL_ORE);
      if (var2 != null) {
         if (!var10000) {
            var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_COAL_ORE);
            if (var2 == null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = Intrinsics.areEqual(var1, Blocks.REDSTONE_ORE);
               if (var2 == null) {
                  return var10000;
               }

               if (!var10000) {
                  var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_REDSTONE_ORE);
                  if (var2 == null) {
                     return var10000;
                  }

                  if (!var10000) {
                     var10000 = Intrinsics.areEqual(var1, Blocks.EMERALD_ORE);
                     if (var2 == null) {
                        return var10000;
                     }

                     if (!var10000) {
                        var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_EMERALD_ORE);
                        if (var2 == null) {
                           return var10000;
                        }

                        if (!var10000) {
                           var10000 = Intrinsics.areEqual(var1, Blocks.DIAMOND_ORE);
                           if (var2 == null) {
                              return var10000;
                           }

                           if (!var10000) {
                              var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_DIAMOND_ORE);
                              if (var2 == null) {
                                 return var10000;
                              }

                              if (!var10000) {
                                 var10000 = Intrinsics.areEqual(var1, Blocks.IRON_ORE);
                                 if (var2 == null) {
                                    return var10000;
                                 }

                                 if (!var10000) {
                                    var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_IRON_ORE);
                                    if (var2 == null) {
                                       return var10000;
                                    }

                                    if (!var10000) {
                                       var10000 = Intrinsics.areEqual(var1, Blocks.GOLD_ORE);
                                       if (var2 == null) {
                                          return var10000;
                                       }

                                       if (!var10000) {
                                          var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_GOLD_ORE);
                                          if (var2 == null) {
                                             return var10000;
                                          }

                                          if (!var10000) {
                                             var10000 = Intrinsics.areEqual(var1, Blocks.LAPIS_ORE);
                                             if (var2 == null) {
                                                return var10000;
                                             }

                                             if (!var10000) {
                                                var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_LAPIS_ORE);
                                                if (var2 == null) {
                                                   return var10000;
                                                }

                                                if (!var10000) {
                                                   return false;
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
                  }
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   private final boolean b(Block var1) {
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      boolean var10000 = Intrinsics.areEqual(var1, Blocks.TERRACOTTA);
      if (var2 != null) {
         if (!var10000) {
            var10000 = Intrinsics.areEqual(var1, Blocks.WHITE_TERRACOTTA);
            if (var2 == null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = Intrinsics.areEqual(var1, Blocks.ORANGE_TERRACOTTA);
               if (var2 == null) {
                  return var10000;
               }

               if (!var10000) {
                  var10000 = Intrinsics.areEqual(var1, Blocks.MAGENTA_TERRACOTTA);
                  if (var2 == null) {
                     return var10000;
                  }

                  if (!var10000) {
                     var10000 = Intrinsics.areEqual(var1, Blocks.LIGHT_BLUE_TERRACOTTA);
                     if (var2 == null) {
                        return var10000;
                     }

                     if (!var10000) {
                        var10000 = Intrinsics.areEqual(var1, Blocks.YELLOW_TERRACOTTA);
                        if (var2 == null) {
                           return var10000;
                        }

                        if (!var10000) {
                           var10000 = Intrinsics.areEqual(var1, Blocks.LIME_TERRACOTTA);
                           if (var2 == null) {
                              return var10000;
                           }

                           if (!var10000) {
                              var10000 = Intrinsics.areEqual(var1, Blocks.PINK_TERRACOTTA);
                              if (var2 == null) {
                                 return var10000;
                              }

                              if (!var10000) {
                                 var10000 = Intrinsics.areEqual(var1, Blocks.GRAY_TERRACOTTA);
                                 if (var2 == null) {
                                    return var10000;
                                 }

                                 if (!var10000) {
                                    var10000 = Intrinsics.areEqual(var1, Blocks.LIGHT_GRAY_TERRACOTTA);
                                    if (var2 == null) {
                                       return var10000;
                                    }

                                    if (!var10000) {
                                       var10000 = Intrinsics.areEqual(var1, Blocks.CYAN_TERRACOTTA);
                                       if (var2 == null) {
                                          return var10000;
                                       }

                                       if (!var10000) {
                                          var10000 = Intrinsics.areEqual(var1, Blocks.PURPLE_TERRACOTTA);
                                          if (var2 == null) {
                                             return var10000;
                                          }

                                          if (!var10000) {
                                             var10000 = Intrinsics.areEqual(var1, Blocks.BLUE_TERRACOTTA);
                                             if (var2 == null) {
                                                return var10000;
                                             }

                                             if (!var10000) {
                                                var10000 = Intrinsics.areEqual(var1, Blocks.BROWN_TERRACOTTA);
                                                if (var2 == null) {
                                                   return var10000;
                                                }

                                                if (!var10000) {
                                                   var10000 = Intrinsics.areEqual(var1, Blocks.GREEN_TERRACOTTA);
                                                   if (var2 == null) {
                                                      return var10000;
                                                   }

                                                   if (!var10000) {
                                                      var10000 = Intrinsics.areEqual(var1, Blocks.RED_TERRACOTTA);
                                                      if (var2 == null) {
                                                         return var10000;
                                                      }

                                                      if (!var10000) {
                                                         var10000 = Intrinsics.areEqual(var1, Blocks.BLACK_TERRACOTTA);
                                                         if (var2 == null) {
                                                            return var10000;
                                                         }

                                                         if (!var10000) {
                                                            var10000 = Intrinsics.areEqual(var1, Blocks.CLAY);
                                                            if (var2 == null) {
                                                               return var10000;
                                                            }

                                                            if (!var10000) {
                                                               var10000 = Intrinsics.areEqual(var1, Blocks.COBBLESTONE);
                                                               if (var2 == null) {
                                                                  return var10000;
                                                               }

                                                               if (!var10000) {
                                                                  var10000 = Intrinsics.areEqual(var1, Blocks.GRAY_WOOL);
                                                                  if (var2 == null) {
                                                                     return var10000;
                                                                  }

                                                                  if (!var10000) {
                                                                     var10000 = Intrinsics.areEqual(var1, Blocks.WHITE_WOOL);
                                                                     if (var2 == null) {
                                                                        return var10000;
                                                                     }

                                                                     if (!var10000) {
                                                                        return false;
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
         }

         var10000 = true;
      }

      return var10000;
   }

   private final boolean c(Block var1) {
      int[] var2 = lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g();
      boolean var10000 = Intrinsics.areEqual(var1, Blocks.CHEST);
      if (var2 != null) {
         if (!var10000) {
            var10000 = Intrinsics.areEqual(var1, Blocks.TRAPPED_CHEST);
            if (var2 == null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = Intrinsics.areEqual(var1, Blocks.ENDER_CHEST);
               if (var2 == null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   @Override
   public void aC() {
      super.aC();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "5Eê×B\u0012Ã!g\u0006Ø5ËÕð(ï)E¥Õb\u009f'\u0012sÓºð:`\u0087,\u00180ï\u0097Dï\u008eZ¥\u0005 jH\"\u0088\u0093hpÚQ\u0096NSÚû\u0084\u0099YÕ\u0015XdvÚ·¿`D\u0091üuÅ4\u0012.\u0016Úàoé=N.[4G>hºÛr\u0010\u0005Ô\u0094ÖíÅ\u000f\u0006Ýr]ÎG\u001d\u001fßH\u007fEñlU";
      int var4 = "5Eê×B\u0012Ã!g\u0006Ø5ËÕð(ï)E¥Õb\u009f'\u0012sÓºð:`\u0087,\u00180ï\u0097Dï\u008eZ¥\u0005 jH\"\u0088\u0093hpÚQ\u0096NSÚû\u0084\u0099YÕ\u0015XdvÚ·¿`D\u0091üuÅ4\u0012.\u0016Úàoé=N.[4G>hºÛr\u0010\u0005Ô\u0094ÖíÅ\u000f\u0006Ýr]ÎG\u001d\u001fßH\u007fEñlU"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 5;
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
                     case 0 -> 48;
                     case 1 -> 51;
                     case 2 -> 67;
                     case 3 -> 106;
                     case 4 -> 111;
                     case 5 -> 120;
                     default -> 26;
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
                     g = new String[9];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll();
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

                  var2 = "\u0098a\u0081\u0083\u0089\blÿòºy½ð\rÑ¤¨;¬\u001fÈ\u001dfæë6¢";
                  var4 = "\u0098a\u0081\u0083\u0089\blÿòºy½ð\rÑ¤¨;¬\u001fÈ\u001dfæë6¢".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 9;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 17107) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 186;
            case 1 -> 245;
            case 2 -> 55;
            case 3 -> 74;
            case 4 -> 138;
            case 5 -> 92;
            case 6 -> 168;
            case 7 -> 8;
            case 8 -> 145;
            case 9 -> 235;
            case 10 -> 189;
            case 11 -> 48;
            case 12 -> 249;
            case 13 -> 197;
            case 14 -> 18;
            case 15 -> 120;
            case 16 -> 114;
            case 17 -> 242;
            case 18 -> 28;
            case 19 -> 131;
            case 20 -> 167;
            case 21 -> 105;
            case 22 -> 239;
            case 23 -> 123;
            case 24 -> 85;
            case 25 -> 47;
            case 26 -> 86;
            case 27 -> 184;
            case 28 -> 127;
            case 29 -> 69;
            case 30 -> 21;
            case 31 -> 106;
            case 32 -> 190;
            case 33 -> 178;
            case 34 -> 165;
            case 35 -> 68;
            case 36 -> 229;
            case 37 -> 146;
            case 38 -> 156;
            case 39 -> 201;
            case 40 -> 164;
            case 41 -> 108;
            case 42 -> 181;
            case 43 -> 42;
            case 44 -> 75;
            case 45 -> 95;
            case 46 -> 58;
            case 47 -> 104;
            case 48 -> 77;
            case 49 -> 79;
            case 50 -> 143;
            case 51 -> 49;
            case 52 -> 29;
            case 53 -> 25;
            case 54 -> 217;
            case 55 -> 61;
            case 56 -> 94;
            case 57 -> 9;
            case 58 -> 204;
            case 59 -> 198;
            case 60 -> 140;
            case 61 -> 45;
            case 62 -> 115;
            case 63 -> 52;
            case 64 -> 196;
            case 65 -> 241;
            case 66 -> 166;
            case 67 -> 125;
            case 68 -> 171;
            case 69 -> 174;
            case 70 -> 98;
            case 71 -> 254;
            case 72 -> 133;
            case 73 -> 101;
            case 74 -> 191;
            case 75 -> 159;
            case 76 -> 99;
            case 77 -> 62;
            case 78 -> 160;
            case 79 -> 169;
            case 80 -> 150;
            case 81 -> 36;
            case 82 -> 230;
            case 83 -> 211;
            case 84 -> 109;
            case 85 -> 221;
            case 86 -> 162;
            case 87 -> 158;
            case 88 -> 13;
            case 89 -> 46;
            case 90 -> 124;
            case 91 -> 19;
            case 92 -> 179;
            case 93 -> 17;
            case 94 -> 225;
            case 95 -> 155;
            case 96 -> 126;
            case 97 -> 96;
            case 98 -> 60;
            case 99 -> 207;
            case 100 -> 188;
            case 101 -> 117;
            case 102 -> 215;
            case 103 -> 119;
            case 104 -> 208;
            case 105 -> 32;
            case 106 -> 212;
            case 107 -> 82;
            case 108 -> 121;
            case 109 -> 78;
            case 110 -> 10;
            case 111 -> 224;
            case 112 -> 132;
            case 113 -> 219;
            case 114 -> 244;
            case 115 -> 30;
            case 116 -> 26;
            case 117 -> 206;
            case 118 -> 247;
            case 119 -> 87;
            case 120 -> 187;
            case 121 -> 81;
            case 122 -> 67;
            case 123 -> 59;
            case 124 -> 57;
            case 125 -> 152;
            case 126 -> 193;
            case 127 -> 40;
            case 128 -> 103;
            case 129 -> 16;
            case 130 -> 180;
            case 131 -> 71;
            case 132 -> 153;
            case 133 -> 22;
            case 134 -> 44;
            case 135 -> 232;
            case 136 -> 134;
            case 137 -> 137;
            case 138 -> 218;
            case 139 -> 11;
            case 140 -> 236;
            case 141 -> 89;
            case 142 -> 88;
            case 143 -> 173;
            case 144 -> 163;
            case 145 -> 6;
            case 146 -> 154;
            case 147 -> 205;
            case 148 -> 33;
            case 149 -> 148;
            case 150 -> 183;
            case 151 -> 23;
            case 152 -> 76;
            case 153 -> 223;
            case 154 -> 112;
            case 155 -> 147;
            case 156 -> 39;
            case 157 -> 24;
            case 158 -> 175;
            case 159 -> 135;
            case 160 -> 102;
            case 161 -> 97;
            case 162 -> 90;
            case 163 -> 248;
            case 164 -> 34;
            case 165 -> 4;
            case 166 -> 233;
            case 167 -> 56;
            case 168 -> 141;
            case 169 -> 231;
            case 170 -> 110;
            case 171 -> 72;
            case 172 -> 216;
            case 173 -> 214;
            case 174 -> 27;
            case 175 -> 209;
            case 176 -> 222;
            case 177 -> 91;
            case 178 -> 252;
            case 179 -> 250;
            case 180 -> 246;
            case 181 -> 14;
            case 182 -> 66;
            case 183 -> 195;
            case 184 -> 64;
            case 185 -> 202;
            case 186 -> 243;
            case 187 -> 255;
            case 188 -> 176;
            case 189 -> 37;
            case 190 -> 80;
            case 191 -> 12;
            case 192 -> 144;
            case 193 -> 130;
            case 194 -> 43;
            case 195 -> 170;
            case 196 -> 227;
            case 197 -> 151;
            case 198 -> 93;
            case 199 -> 5;
            case 200 -> 234;
            case 201 -> 142;
            case 202 -> 107;
            case 203 -> 172;
            case 204 -> 238;
            case 205 -> 70;
            case 206 -> 38;
            case 207 -> 65;
            case 208 -> 84;
            case 209 -> 20;
            case 210 -> 35;
            case 211 -> 116;
            case 212 -> 0;
            case 213 -> 220;
            case 214 -> 31;
            case 215 -> 122;
            case 216 -> 161;
            case 217 -> 177;
            case 218 -> 194;
            case 219 -> 50;
            case 220 -> 41;
            case 221 -> 240;
            case 222 -> 1;
            case 223 -> 185;
            case 224 -> 203;
            case 225 -> 51;
            case 226 -> 210;
            case 227 -> 136;
            case 228 -> 2;
            case 229 -> 118;
            case 230 -> 199;
            case 231 -> 54;
            case 232 -> 200;
            case 233 -> 100;
            case 234 -> 53;
            case 235 -> 111;
            case 236 -> 228;
            case 237 -> 3;
            case 238 -> 139;
            case 239 -> 192;
            case 240 -> 15;
            case 241 -> 113;
            case 242 -> 129;
            case 243 -> 237;
            case 244 -> 73;
            case 245 -> 182;
            case 246 -> 63;
            case 247 -> 7;
            case 248 -> 251;
            case 249 -> 226;
            case 250 -> 253;
            case 251 -> 213;
            case 252 -> 149;
            case 253 -> 83;
            case 254 -> 128;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final BlockState lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static int[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull BlockPos var1, @NotNull BlockState var2, long var3) {
         short var10001 = 27708;
         short var10002 = 4710;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = 27707;
         var10002 = 32226;
         Intrinsics.checkNotNullParameter(var2, "originalState");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final BlockPos a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockState b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final BlockPos d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockState e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull BlockPos var1, @NotNull BlockState var2, long var3
      ) {
         short var10001 = 27710;
         short var10002 = 14080;
         Intrinsics.checkNotNullParameter(var1, "pos");
         var10001 = 27706;
         var10002 = 11069;
         Intrinsics.checkNotNullParameter(var2, "originalState");
         return new lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 27704;
         long var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         BlockState var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         BlockPos var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -26005;
         short var10002 = 27705;
         short var10003 = 31180;
         short var10004 = 27711;
         short var10005 = 2546;
         return "MinedBlock(pos=" + var4 + ", originalState=" + var3 + ", minedTime=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = g();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if ((var4 == 0)) {
               return false;
            }

            long var5;
            var4 = (
                     var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                        - var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
         }

         if (var2 != null) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      public static void b(int[] var0) {
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
      }

      public static int[] g() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var21 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "Ñ\u009dïMZT\u00ad\u0018ö¨#\u0011T\r(÷Ð\u0000½ýQ-i\u000eÐÅ*\u000fHÚ½ßúh\u00185Üq\u0019Òy\u0094Í\u0010Bü°lwÎ\u0000axÝ´¤ÖÙ¯¡\u0003uÔ\u009d";
         int var4 = "Ñ\u009dïMZT\u00ad\u0018ö¨#\u0011T\r(÷Ð\u0000½ýQ-i\u000eÐÅ*\u000fHÚ½ßúh\u00185Üq\u0019Òy\u0094Í\u0010Bü°lwÎ\u0000axÝ´¤ÖÙ¯¡\u0003uÔ\u009d"
            .length();
         int[] var10000 = new int[2];
         char var1 = '\r';
         int var8 = -1;
         b(var10000);

         label52:
         while (true) {
            byte var9 = 118;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var25 = var10001.toCharArray();
                  int var10004 = var25.length;
                  int var6 = 0;
                  byte var28 = var9;
                  var21 = var25;
                  int var15 = var10004;
                  byte var33;
                  char[] var37;
                  int var10006;
                  if (var10004 <= 1) {
                     var37 = var25;
                     var33 = var9;
                     var10006 = var6;
                  } else {
                     var28 = var9;
                     var15 = var10004;
                     if (var10004 <= var6) {
                        break label47;
                     }

                     var37 = var25;
                     var33 = var9;
                     var10006 = var6;
                  }

                  while (true) {
                     var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                        case 0 -> 36;
                        case 1 -> 67;
                        case 2 -> 2;
                        case 3 -> 117;
                        case 4 -> 114;
                        case 5 -> 14;
                        default -> 53;
                     });
                     var6++;
                     if (var28 == 0) {
                        var10006 = var28;
                        var37 = var21;
                        var33 = var28;
                     } else {
                        if (var15 <= var6) {
                           break;
                        }

                        var37 = var21;
                        var33 = var28;
                        var10006 = var6;
                     }
                  }
               }

               String var30 = new String(var21).intern();
               switch (var10002) {
                  case 0:
                     var5[var3++] = var30;
                     if ((var8 += var1) >= var4) {
                        a = var5;
                        b = new String[7];
                        break label52;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var30;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "C\u00018b\u0089ß\u009f\u0091\u0085\u0015\u009e\u007f\u0003\nÆØ";
                     var4 = "C\u00018b\u0089ß\u009f\u0091\u0085\u0015\u009e\u007f\u0003\nÆØ".length();
                     var1 = '\f';
                     var8 = -1;
               }

               var9 = 16;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 27706) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 135;
               case 1 -> 54;
               case 2 -> 182;
               case 3 -> 117;
               case 4 -> 247;
               case 5 -> 51;
               case 6 -> 62;
               case 7 -> 112;
               case 8 -> 143;
               case 9 -> 178;
               case 10 -> 0;
               case 11 -> 201;
               case 12 -> 184;
               case 13 -> 106;
               case 14 -> 251;
               case 15 -> 179;
               case 16 -> 144;
               case 17 -> 8;
               case 18 -> 50;
               case 19 -> 121;
               case 20 -> 93;
               case 21 -> 128;
               case 22 -> 78;
               case 23 -> 196;
               case 24 -> 36;
               case 25 -> 199;
               case 26 -> 20;
               case 27 -> 138;
               case 28 -> 38;
               case 29 -> 3;
               case 30 -> 100;
               case 31 -> 56;
               case 32 -> 155;
               case 33 -> 26;
               case 34 -> 82;
               case 35 -> 6;
               case 36 -> 174;
               case 37 -> 57;
               case 38 -> 241;
               case 39 -> 169;
               case 40 -> 224;
               case 41 -> 60;
               case 42 -> 186;
               case 43 -> 31;
               case 44 -> 77;
               case 45 -> 71;
               case 46 -> 234;
               case 47 -> 198;
               case 48 -> 14;
               case 49 -> 25;
               case 50 -> 140;
               case 51 -> 98;
               case 52 -> 10;
               case 53 -> 75;
               case 54 -> 153;
               case 55 -> 18;
               case 56 -> 165;
               case 57 -> 193;
               case 58 -> 250;
               case 59 -> 207;
               case 60 -> 63;
               case 61 -> 120;
               case 62 -> 24;
               case 63 -> 102;
               case 64 -> 37;
               case 65 -> 103;
               case 66 -> 254;
               case 67 -> 110;
               case 68 -> 141;
               case 69 -> 124;
               case 70 -> 187;
               case 71 -> 123;
               case 72 -> 119;
               case 73 -> 111;
               case 74 -> 125;
               case 75 -> 225;
               case 76 -> 46;
               case 77 -> 223;
               case 78 -> 96;
               case 79 -> 129;
               case 80 -> 160;
               case 81 -> 42;
               case 82 -> 74;
               case 83 -> 2;
               case 84 -> 195;
               case 85 -> 91;
               case 86 -> 134;
               case 87 -> 66;
               case 88 -> 73;
               case 89 -> 19;
               case 90 -> 209;
               case 91 -> 190;
               case 92 -> 245;
               case 93 -> 206;
               case 94 -> 104;
               case 95 -> 76;
               case 96 -> 130;
               case 97 -> 200;
               case 98 -> 226;
               case 99 -> 150;
               case 100 -> 7;
               case 101 -> 80;
               case 102 -> 27;
               case 103 -> 139;
               case 104 -> 188;
               case 105 -> 132;
               case 106 -> 194;
               case 107 -> 29;
               case 108 -> 68;
               case 109 -> 1;
               case 110 -> 204;
               case 111 -> 149;
               case 112 -> 222;
               case 113 -> 35;
               case 114 -> 220;
               case 115 -> 114;
               case 116 -> 107;
               case 117 -> 64;
               case 118 -> 55;
               case 119 -> 151;
               case 120 -> 230;
               case 121 -> 227;
               case 122 -> 205;
               case 123 -> 97;
               case 124 -> 13;
               case 125 -> 22;
               case 126 -> 211;
               case 127 -> 84;
               case 128 -> 163;
               case 129 -> 221;
               case 130 -> 61;
               case 131 -> 81;
               case 132 -> 219;
               case 133 -> 32;
               case 134 -> 87;
               case 135 -> 49;
               case 136 -> 237;
               case 137 -> 167;
               case 138 -> 176;
               case 139 -> 175;
               case 140 -> 34;
               case 141 -> 58;
               case 142 -> 189;
               case 143 -> 214;
               case 144 -> 105;
               case 145 -> 162;
               case 146 -> 122;
               case 147 -> 242;
               case 148 -> 99;
               case 149 -> 118;
               case 150 -> 212;
               case 151 -> 23;
               case 152 -> 53;
               case 153 -> 238;
               case 154 -> 17;
               case 155 -> 240;
               case 156 -> 166;
               case 157 -> 158;
               case 158 -> 246;
               case 159 -> 40;
               case 160 -> 33;
               case 161 -> 113;
               case 162 -> 5;
               case 163 -> 89;
               case 164 -> 185;
               case 165 -> 133;
               case 166 -> 239;
               case 167 -> 43;
               case 168 -> 95;
               case 169 -> 86;
               case 170 -> 213;
               case 171 -> 52;
               case 172 -> 109;
               case 173 -> 171;
               case 174 -> 69;
               case 175 -> 65;
               case 176 -> 147;
               case 177 -> 67;
               case 178 -> 172;
               case 179 -> 101;
               case 180 -> 21;
               case 181 -> 137;
               case 182 -> 94;
               case 183 -> 202;
               case 184 -> 116;
               case 185 -> 28;
               case 186 -> 159;
               case 187 -> 203;
               case 188 -> 235;
               case 189 -> 217;
               case 190 -> 183;
               case 191 -> 30;
               case 192 -> 249;
               case 193 -> 85;
               case 194 -> 152;
               case 195 -> 72;
               case 196 -> 244;
               case 197 -> 236;
               case 198 -> 252;
               case 199 -> 15;
               case 200 -> 145;
               case 201 -> 210;
               case 202 -> 248;
               case 203 -> 233;
               case 204 -> 126;
               case 205 -> 90;
               case 206 -> 44;
               case 207 -> 148;
               case 208 -> 218;
               case 209 -> 253;
               case 210 -> 4;
               case 211 -> 232;
               case 212 -> 83;
               case 213 -> 45;
               case 214 -> 177;
               case 215 -> 164;
               case 216 -> 228;
               case 217 -> 108;
               case 218 -> 146;
               case 219 -> 156;
               case 220 -> 170;
               case 221 -> 79;
               case 222 -> 47;
               case 223 -> 70;
               case 224 -> 216;
               case 225 -> 92;
               case 226 -> 131;
               case 227 -> 255;
               case 228 -> 16;
               case 229 -> 192;
               case 230 -> 88;
               case 231 -> 168;
               case 232 -> 142;
               case 233 -> 229;
               case 234 -> 11;
               case 235 -> 127;
               case 236 -> 215;
               case 237 -> 191;
               case 238 -> 173;
               case 239 -> 41;
               case 240 -> 231;
               case 241 -> 157;
               case 242 -> 161;
               case 243 -> 154;
               case 244 -> 180;
               case 245 -> 48;
               case 246 -> 136;
               case 247 -> 208;
               case 248 -> 197;
               case 249 -> 243;
               case 250 -> 9;
               case 251 -> 12;
               case 252 -> 59;
               case 253 -> 39;
               case 254 -> 115;
               default -> 181;
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
         public static me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.lIIllIIIIIllIIlIlIlIIllIIIlIIIIlllIIlIlIIIIIlIllIlIllIlIIllllIIIlIIlIIIIIlIIIIlIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, net.minecraft.core.BlockPos p1, net.minecraft.world.level.block.state.BlockState p2, long p3, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((mask & 4) != 0) { p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         return p0.a(p1, p2, p3);
      }
}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
