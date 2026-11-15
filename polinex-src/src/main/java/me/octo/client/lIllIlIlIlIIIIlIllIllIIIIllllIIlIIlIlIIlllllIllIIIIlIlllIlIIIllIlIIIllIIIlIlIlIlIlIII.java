package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.NetherWartBlock;
import net.minecraft.world.level.block.StemBlock;
import net.minecraft.world.level.block.TallGrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllIlIlIlIIIIlIllIllIIIIllllIIlIIlIlIIlllllIllIIIIlIlllIlIIIllIlIIIllIIIlIlIlIlIlIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIllIlIlIlIIIIlIllIllIIIIllllIIlIIlIlIIlllllIllIIIIlIlllIlIIIllIlIIIllIIIlIlIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private BlockPos lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final HashSet<BlockPos> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   @NotNull
   public static lIllIlIlIlIIIIlIllIllIIIIllllIIlIIlIlIIlllllIllIIIIlIlllIlIIIllIlIIIllIIIlIlIlIlIlIII IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] f;
   private static String[] g;

   private lIllIlIlIlIIIIlIllIllIIIIllllIIlIIlIlIIlllllIllIIIIlIlllIlIIIllIlIIIllIIIlIlIlIlIlIII() {
      short var10001 = -10695;
      short var10002 = -6603;
      var10002 = -10693;
      short var10003 = 8597;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      short var10004 = -10690;
      short var10005 = -9643;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.a(),
         IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.b(),
         IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.c(),
         IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.d()
      };
      super("Nuker", "Automatically nukes blocks around you.", var3, "Nuker", var1);
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashSet<>();
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      int var10000 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      Intrinsics.checkNotNullParameter(var1, "e");
      int var2 = var10000;
      boolean var5 = IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.d().al();
      if (var2 != 0) {
         if (!var5) {
            return;
         }

         var5 = var1.c();
      }

      if (var2 != 0) {
         if (var5) {
            return;
         }

         var5 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      }

      if (var5) {
         BlockPos var6 = this.a(RangesKt.coerceAtMost((int)IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.c().q(), 6));
         if (var6 != null) {
            BlockPos var3 = var6;
            lIllIlIlIlIIIIlIllIllIIIIllllIIlIIlIlIIlllllIllIIIIlIlllIlIIIllIlIIIllIIIlIlIlIlIlIII var7 = this;
            if (var2 != 0) {
               if (!this.a(var3)) {
                  return;
               }

               var7 = this;
            }

            LocalPlayer var8 = var7.ap().player;
            Intrinsics.checkNotNull(var8);
            Direction var9 = Direction.fromYRot(var8.getYRot());
            short var10002 = -10699;
            short var10003 = -17754;
            Intrinsics.checkNotNullExpressionValue(var9, "fromYRot(...)");
            Direction var4 = var9;
            if (var2 != 0) {
               ClientPacketListener var10 = this.ap().getConnection();
               if (var10 != null) {
                  var10.send(new ServerboundPlayerActionPacket(Action.START_DESTROY_BLOCK, var3, var4));
               }
            }

            LocalPlayer var11 = this.ap().player;
            Intrinsics.checkNotNull(var11);
            var11.swing(InteractionHand.MAIN_HAND);
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.add(var3.immutable());
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      Object var5 = null; // PX-FIX
      int var10000 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      Intrinsics.checkNotNullParameter(var1, "e");
      int var2 = var10000;
      boolean var4 = IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.d().al();
      if (var2 == 0) {
         if (var4) {
            return;
         }

         var4 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      }

      if (var4) {
         label27: {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.a(
               RangesKt.coerceAtMost((int)IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.c().q(), 6)
            );
            BlockPos var3 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            if (var3 != null) {
               var5 = this;
               if (var2 != 0) {
                  break label27;
               }

               if (this.a(var3)) {
                  this.ap().hitResult = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var3);
                  this.d(true);
                  if (var2 == 0) {
                     return;
                  }
               }
            }

            var5 = this;
         }

         this.d(false);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1) {
      int var10000 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      Intrinsics.checkNotNullParameter(var1, "e");
      int var2 = var10000;
      boolean var5 = IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.d().al();
      if (var2 == 0) {
         if (var5) {
            return;
         }

         var5 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      }

      if (var5) {
         if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
            BlockPos var3 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
            boolean var4 = false;
            if (this.b(var3)) {
               var1.a(true);
            }
         }
      }
   }

   @SubscribeEvent
   public final void a(@NotNull IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
   }

   public void aB() {
      super.aB();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
      this.d(false);
   }

   public void aC() {
      super.aC();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
      this.d(false);
   }

   private final void d(boolean param1) {
      int var2 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      if (var2 == 0) {
        try {
          var var3 = this.ap();
          if (var3.options != null && var3.options.keyAttack != null) {
            var3.options.keyAttack.setDown(param1);
          }
        } catch (Throwable var4) {
        }
      }
   }

   private final boolean a(BlockPos var1) {
      int var10000 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      Vec3 var10001 = Vec3.atCenterOf(var1);
      short var10003 = -10703;
      short var10004 = 8633;
      Intrinsics.checkNotNullExpressionValue(var10001, "atCenterOf(...)");
      Vec3 var3 = var10001;
      int var2 = var10000;
      LocalPlayer var4 = this.ap().player;
      Intrinsics.checkNotNull(var4);
      double var6;
      var10000 = (var6 = Math.sqrt(var4.distanceToSqr(var3)) - IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.c().q())
            == 0.0
         ? 0
         : (var6 < 0.0 ? -1 : 1);
      if (var2 != 0) {
         var10000 = var10000 < 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   private final boolean b(BlockPos var1) {
       boolean var54 = false; // PX-FIX decl var54
      Object var30 = null; // PX-FIX
      int var2 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
      if (var2 != 0) {
         ClientLevel var10000 = this.ap().level;
         if (var10000 != null) {
            BlockState var17 = var10000.getBlockState(var1);
            if (var17 != null) {
               BlockState var3 = var17;
               Block var18 = var3.getBlock();
               short var10002 = -10692;
               short var10003 = 26349;
               Intrinsics.checkNotNullExpressionValue(var18, "getBlock(...)");
               Block var4 = var18;
               lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var19 = IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.a();
               short var10001 = -10701;
               var10002 = 26126;
               boolean var20 = var19.c("All");
               if (var2 != 0) {
                  if (var20) {
                     boolean var58 = Intrinsics.areEqual(var4, Blocks.BEDROCK);
                     if (var2 != 0) {
                        if (!var58) {
                           boolean var59 = Intrinsics.areEqual(var4, Blocks.AIR);
                           if (var2 == 0) {
                              return var59;
                           }

                           if (!var59) {
                              boolean var60 = Intrinsics.areEqual(var4, Blocks.CHEST);
                              if (var2 == 0) {
                                 return var60;
                              }

                              if (!var60) {
                                 return (1 != 0);
                              }
                           }
                        }

                        var58 = false;
                     }

                     return var58;
                  }

                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var21 = IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.a();
                  var10001 = -10694;
                  var10002 = -13148;
                  var20 = var21.c("Crops");
               }

               if (var2 != 0) {
                  if (var20) {
                     var10000 = this.ap().level;
                     if (var10000 == null) {
                        return false;
                     }

                     ClientLevel var13 = var10000;
                     var54 = var4 instanceof BonemealableBlock;
                     label145:
                     if (var2 != 0) {
                        if (var54) {
                           var54 = Intrinsics.areEqual(var4, Blocks.GRASS_BLOCK);
                           if (var2 == 0) {
                              break label145;
                           }

                           if (!var54) {
                              var54 = var4 instanceof StemBlock;
                              if (var2 == 0) {
                                 break label145;
                              }

                              if (!var54) {
                                 var54 = var4 instanceof TallGrassBlock;
                                 if (var2 == 0) {
                                    break label145;
                                 }

                                 if (!var54) {
                                    var54 = var4 instanceof DoublePlantBlock;
                                    if (var2 == 0) {
                                       break label145;
                                    }

                                    if (!var54) {
                                       byte var55 = (byte)(((BonemealableBlock)var4).isValidBonemealTarget(var13, var1, var3) ? 1 : 0);
                                       if (var2 == 0) {
                                          return (var55 != 0);
                                       }

                                       if (var55 == 0) {
                                          return (1 != 0);
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var54 = var4 instanceof CropBlock;
                     }

                     if (var2 != 0) {
                        if (var54) {
                           byte var56 = (byte)(((CropBlock)var4).isMaxAge(var3) ? 1 : 0);
                           if (var2 == 0) {
                              return (var56 != 0);
                           }

                           if (var56 != 0) {
                              return (1 != 0);
                           }
                        }

                        var54 = var4 instanceof NetherWartBlock;
                     }

                     if (var2 == 0) {
                        return var54;
                     }

                     if (var54) {
                        Integer var33 = var3.getValue(NetherWartBlock.AGE);
                        byte var16 = 3;
                        if (var33 != null) {
                           int var57 = var33;
                           if (var2 == 0) {
                              return (var57 != 0);
                           }

                           if (var57 == var16) {
                              return (1 != 0);
                           }
                        }
                     }

                     return (0 != 0);
                  }

                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var22 = IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.a();
                  var10001 = -10689;
                  var10002 = 4382;
                  var20 = var22.c("Ores");
               }

               if (var2 != 0) {
                  if (var20) {
                     return this.a(var4);
                  }

                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var23 = IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.a();
                  var10001 = -10711;
                  var10002 = 5985;
                  var20 = var23.c("Trees");
               }

               if (var2 != 0) {
                  if (var20) {
                     return var3.is(BlockTags.LOGS);
                  }

                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var24 = IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.a();
                  var10001 = -10697;
                  var10002 = 29928;
                  var20 = var24.c("Custom");
               }

               boolean var31;
               if (var20) {
                  String var15;
                  var15 = IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.b().U();
                  Locale var25 = Locale.ROOT;
                  var10002 = -10704;
                  var10003 = -4939;
                  Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
                  String var26 = var15.toLowerCase(var25);
                  var10002 = -10702;
                  var10003 = -17127;
                  Intrinsics.checkNotNullExpressionValue(var26, "toLowerCase(...)");
                  CharSequence var27 = var26;
                  String[] var14 = new String[]{","};
                  List var5 = (StringsKt.split(var27, var14, false, 0));
                  String var28 = BuiltInRegistries.BLOCK.getKey(var4).getPath();
                  var10002 = -10698;
                  var10003 = 18865;
                  Intrinsics.checkNotNullExpressionValue(var28, "getPath(...)");
                  String var29 = var28.toLowerCase(Locale.ROOT);
                  var10002 = -10700;
                  var10003 = -9846;
                  Intrinsics.checkNotNullExpressionValue(var29, "toLowerCase(...)");
                  var15 = var29;
                  var var7 = var5;
                  boolean var8 = false;
                  var30 = var7;
                  label97:
                  if (var2 != 0) {
                     if (var7 instanceof Collection) {
                        var30 = (Collection)var7;
                        if (var2 == 0) {
                           break label97;
                        }

                        if (((me.octo.client.PXDyn)var30).isEmpty()) {
                           return (0 != 0);
                        }
                     }

                     var30 = var7;
                  }

                  for (Object var10 : (Iterable<?>)(var30)) {
                     String var11 = (String)var10;
                     boolean var12 = false;
                     var10001 = -10691;
                     var10002 = -27822;
                     byte var53 = ((byte)((Intrinsics.areEqual(StringsKt.trim(StringsKt.replace(var11, "minecraft:", "", false)).toString(), var15)) ? 1 : 0));

                     while (var53 != 0) {
                        var53 = 1;
                        if (var2 != 0) {
                           return (1 != 0);
                        }
                     }
                  }

                  var31 = false;
               } else {
                  var31 = false;
               }

               return var31;
            }
         }
      }

      return false;
   }

   private final boolean a(Block var1) {
      int var2 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      boolean var10000 = Intrinsics.areEqual(var1, Blocks.COAL_ORE);
      if (var2 == 0) {
         if (!var10000) {
            var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_COAL_ORE);
            if (var2 != 0) {
               return var10000;
            }

            if (!var10000) {
               var10000 = Intrinsics.areEqual(var1, Blocks.IRON_ORE);
               if (var2 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_IRON_ORE);
                  if (var2 != 0) {
                     return var10000;
                  }

                  if (!var10000) {
                     var10000 = Intrinsics.areEqual(var1, Blocks.GOLD_ORE);
                     if (var2 != 0) {
                        return var10000;
                     }

                     if (!var10000) {
                        var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_GOLD_ORE);
                        if (var2 != 0) {
                           return var10000;
                        }

                        if (!var10000) {
                           var10000 = Intrinsics.areEqual(var1, Blocks.NETHER_GOLD_ORE);
                           if (var2 != 0) {
                              return var10000;
                           }

                           if (!var10000) {
                              var10000 = Intrinsics.areEqual(var1, Blocks.REDSTONE_ORE);
                              if (var2 != 0) {
                                 return var10000;
                              }

                              if (!var10000) {
                                 var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_REDSTONE_ORE);
                                 if (var2 != 0) {
                                    return var10000;
                                 }

                                 if (!var10000) {
                                    var10000 = Intrinsics.areEqual(var1, Blocks.LAPIS_ORE);
                                    if (var2 != 0) {
                                       return var10000;
                                    }

                                    if (!var10000) {
                                       var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_LAPIS_ORE);
                                       if (var2 != 0) {
                                          return var10000;
                                       }

                                       if (!var10000) {
                                          var10000 = Intrinsics.areEqual(var1, Blocks.DIAMOND_ORE);
                                          if (var2 != 0) {
                                             return var10000;
                                          }

                                          if (!var10000) {
                                             var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_DIAMOND_ORE);
                                             if (var2 != 0) {
                                                return var10000;
                                             }

                                             if (!var10000) {
                                                var10000 = Intrinsics.areEqual(var1, Blocks.EMERALD_ORE);
                                                if (var2 != 0) {
                                                   return var10000;
                                                }

                                                if (!var10000) {
                                                   var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_EMERALD_ORE);
                                                   if (var2 != 0) {
                                                      return var10000;
                                                   }

                                                   if (!var10000) {
                                                      var10000 = Intrinsics.areEqual(var1, Blocks.COPPER_ORE);
                                                      if (var2 != 0) {
                                                         return var10000;
                                                      }

                                                      if (!var10000) {
                                                         var10000 = Intrinsics.areEqual(var1, Blocks.DEEPSLATE_COPPER_ORE);
                                                         if (var2 != 0) {
                                                            return var10000;
                                                         }

                                                         if (!var10000) {
                                                            var10000 = Intrinsics.areEqual(var1, Blocks.NETHER_QUARTZ_ORE);
                                                            if (var2 != 0) {
                                                               return var10000;
                                                            }

                                                            if (!var10000) {
                                                               var10000 = Intrinsics.areEqual(var1, Blocks.ANCIENT_DEBRIS);
                                                               if (var2 != 0) {
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

         var10000 = true;
      }

      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final BlockPos a(int var1) {
      Object var43 = null; // PX-FIX
      int var2;
      BlockPos var3;
      List var5;
      List var6;
      label168: {
         int var10000 = me.octo.client.lIIlllllllIlIlIIlIIlllIIIIIIIllIIIlIIIIIIlIlIIlIIIIIllIIIllIlIIIIIllllIlllllllIllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.d();
         var3 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .r();
         LocalPlayer var10001 = this.ap().player;
         Intrinsics.checkNotNull(var10001);
         int var4 = var10001.blockPosition().getY() - 1;
         var5 = new ArrayList();
         var2 = var10000;
         var6 = new ArrayList();
         float var7 = IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.c().q();
         float var8 = var7 * var7;
         byte var9 = ((byte)((IIIllIlIIIIllllIllIIIIIlIllllIlIIlIllIIlIlIIIllIlIllIlIIlIIlIIllIlIIlIllllIlIIIlIlIll.d().al()) ? 1 : 0));
         int var10 = -var1;
         var10000 = var10;
         if (var2 != 0) {
            if (var10 > var1) {
               break label168;
            }

            var10000 = -var1;
         }

         while (true) {
            label181: {
               int var11 = var10000;
               if (var11 <= var1) {
                  do {
                     int var12 = -var1;
                     var10000 = var12;
                     var43 = var1;
                     if (var2 == 0) {
                        break label181;
                     }

                     label182: {
                        if (var12 <= var1) {
                           do {
                              BlockPos var35 = var3.offset(new Vec3i(var10, var11, var12));
                              short var10002 = -10696;
                              short var10003 = -27920;
                              Intrinsics.checkNotNullExpressionValue(var35, "offset(...)");
                              BlockPos var13 = var35;
                              var10000 = var13.getY();
                              var43 = var4;
                              if (var2 == 0) {
                                 break label182;
                              }

                              label155: {
                                 if (var10000 > var4) {
                                    int var14 = var13.getX() - var3.getX();
                                    int var15 = var13.getY() - var3.getY();
                                    int var17 = var13.getZ() - var3.getZ();
                                    float var45;
                                    var10000 = (var45 = var14 * var14 + var15 * var15 + var17 * var17 - var8) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
                                    if (var2 == 0 || var2 == 0) {
                                       break label155;
                                    }

                                    label152:
                                    if (var10000 <= 0) {
                                       var10000 = var9;
                                       if (var2 != 0) {
                                          if (var9 != 0) {
                                             var10000 = ((this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                                                .contains(var13)) ? 1 : 0);
                                             if (var2 == 0) {
                                                break label155;
                                             }

                                             if (var10000 != 0) {
                                                break label152;
                                             }
                                          }

                                          var10000 = ((this.b(var13)) ? 1 : 0);
                                       }

                                       if (var2 == 0) {
                                          break label155;
                                       }

                                       if (var10000 != 0) {
                                          label141: {
                                             int var18 = var13.getY() - var4;
                                             var10000 = 1;
                                             int var44 = var18;
                                             if (var2 != 0) {
                                                if (1 > var18) {
                                                   var10000 = 0;
                                                   break label141;
                                                }

                                                var10000 = var18;
                                                if (var2 == 0) {
                                                   break label141;
                                                }

                                                var44 = 4;
                                             }

                                             var10000 = var10000 < var44 ? 1 : 0;
                                          }

                                          if (var10000 != 0) {
                                             var5.add(var13);
                                          } else {
                                             var6.add(var13);
                                          }
                                       }
                                    }
                                 }

                                 var10000 = var12;
                              }

                              var43 = var1;
                              if (var2 == 0) {
                                 break label182;
                              }

                              if (var10000 == var1) {
                                 break;
                              }

                              var12++;
                           } while (var2 != 0);
                        }

                        var10000 = var11;
                        var43 = var1;
                     }

                     if (var2 == 0) {
                        break label181;
                     }

                     if (var10000 ==( ((var43 == null)) ? 1 : 0)) {
                        break;
                     }

                     var11++;
                  } while (var2 != 0);
               }

               var10000 = var10;
               var43 = var1;
            }

            if (var10000 ==( ((var43 == null)) ? 1 : 0)) {
               break;
            }

            var10++;
            if (var2 == 0) {
               break;
            }

            var10000 = -var1;
         }
      }

      Object var39;
      label99: {
         Collection var22 = var5;
         boolean var37 = var22.isEmpty();
         if (var2 != 0) {
            if (!var37) {
               var39 = var22;
               break label99;
            }

            boolean var38 = false;
         }

         var39 = var6;
      }

      List var21 = (List)var39;
      Iterable var23 = var21;
      boolean var24 = false;
      Iterator var25 = var23.iterator();
      var39 = var25;
      if (var2 != 0) {
         if (!var25.hasNext()) {
            return (BlockPos)null;
         }

         var39 = var25.next();
      }

      Object var26 = var39;
      var39 = var25;
      if (var2 != 0) {
         if (!var25.hasNext()) {
            return (BlockPos)var26;
         }

         var39 = var26;
      }

      BlockPos var27 = (BlockPos)var39;
      boolean var29 = false;
      double var28 = var3.distSqr(var27);

      while (true) {
         Object var30 = var25.next();
         BlockPos var31 = (BlockPos)var30;
         boolean var20 = false;
         double var32 = var3.distSqr(var31);
         if (Double.compare(var28, var32) > 0) {
            var26 = var30;
            var28 = var32;
         }

         while (!var25.hasNext()) {
            if (var2 != 0) {
               return (BlockPos)var26;
            }

            var28 = var32;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "@Üpm\u009c\u000bË°\t\u0087\bú¥(éT·&¤\b\u001dýÒ?«`²½}pT\u008a\u0011^~=\\-±N)ß\u0084aÕ\u0015OÞ4\u007fß\u000f/\t\u0098\u0019\u0005(uÕª\u00ad\n\u0081Ö\n³g®Ç,\u009f\u0081\r\u0084+û¦\u000fÒ&\u0010½¾üô>\u0004Ê\u0094\u000e\u0095\u0005\u00862¨°\u0087\u000fµÜ,L&WGÁ0öÀ¼x\u0017n\u0004(hÆ·\u0003nÿ\\\u0010©\u0002\u0017å¶8x.\f\táò¸\u0018q\u009f\rº\u008e\u0006ÈýèçÒ\b\u001aJ`è\u0010¼âµùâ»ò^]\u0007Ë3ý Ù\u0098\u0006$\u008aH¶\u009d\"";
      int var4 = "@Üpm\u009c\u000bË°\t\u0087\bú¥(éT·&¤\b\u001dýÒ?«`²½}pT\u008a\u0011^~=\\-±N)ß\u0084aÕ\u0015OÞ4\u007fß\u000f/\t\u0098\u0019\u0005(uÕª\u00ad\n\u0081Ö\n³g®Ç,\u009f\u0081\r\u0084+û¦\u000fÒ&\u0010½¾üô>\u0004Ê\u0094\u000e\u0095\u0005\u00862¨°\u0087\u000fµÜ,L&WGÁ0öÀ¼x\u0017n\u0004(hÆ·\u0003nÿ\\\u0010©\u0002\u0017å¶8x.\f\táò¸\u0018q\u009f\rº\u008e\u0006ÈýèçÒ\b\u001aJ`è\u0010¼âµùâ»ò^]\u0007Ë3ý Ù\u0098\u0006$\u008aH¶\u009d\""
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 109;
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
                     case 0 -> 42;
                     case 1 -> 62;
                     case 2 -> 17;
                     case 3 -> 79;
                     case 4 -> 4;
                     case 5 -> 74;
                     default -> 5;
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
                     g = new String[17];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIllIlIlIlIIIIlIllIllIIIIllllIIlIIlIlIIlllllIllIIIIlIlllIlIIIllIlIIIllIIIlIlIlIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new lIllIlIlIlIIIIlIllIllIIIIllllIIlIIlIlIIlllllIllIIIIlIlllIlIIIllIlIIIllIIIlIlIlIlIlIII();
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

                  var2 = "æhq\u001a\u0095È\u0014®Q\u0084ar\u0005\u0019åÊkÃ";
                  var4 = "æhq\u001a\u0095È\u0014®Q\u0084ar\u0005\u0019åÊkÃ".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 107;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -10695) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 231;
            case 1 -> 185;
            case 2 -> 155;
            case 3 -> 74;
            case 4 -> 201;
            case 5 -> 237;
            case 6 -> 121;
            case 7 -> 236;
            case 8 -> 107;
            case 9 -> 222;
            case 10 -> 3;
            case 11 -> 160;
            case 12 -> 86;
            case 13 -> 44;
            case 14 -> 207;
            case 15 -> 76;
            case 16 -> 10;
            case 17 -> 87;
            case 18 -> 50;
            case 19 -> 134;
            case 20 -> 39;
            case 21 -> 58;
            case 22 -> 125;
            case 23 -> 171;
            case 24 -> 109;
            case 25 -> 136;
            case 26 -> 91;
            case 27 -> 43;
            case 28 -> 105;
            case 29 -> 37;
            case 30 -> 108;
            case 31 -> 150;
            case 32 -> 151;
            case 33 -> 249;
            case 34 -> 27;
            case 35 -> 131;
            case 36 -> 255;
            case 37 -> 169;
            case 38 -> 72;
            case 39 -> 129;
            case 40 -> 246;
            case 41 -> 166;
            case 42 -> 26;
            case 43 -> 210;
            case 44 -> 36;
            case 45 -> 229;
            case 46 -> 189;
            case 47 -> 88;
            case 48 -> 152;
            case 49 -> 82;
            case 50 -> 23;
            case 51 -> 254;
            case 52 -> 79;
            case 53 -> 181;
            case 54 -> 226;
            case 55 -> 156;
            case 56 -> 223;
            case 57 -> 17;
            case 58 -> 66;
            case 59 -> 8;
            case 60 -> 16;
            case 61 -> 180;
            case 62 -> 230;
            case 63 -> 213;
            case 64 -> 135;
            case 65 -> 47;
            case 66 -> 62;
            case 67 -> 165;
            case 68 -> 133;
            case 69 -> 99;
            case 70 -> 161;
            case 71 -> 93;
            case 72 -> 239;
            case 73 -> 186;
            case 74 -> 68;
            case 75 -> 175;
            case 76 -> 28;
            case 77 -> 147;
            case 78 -> 52;
            case 79 -> 194;
            case 80 -> 112;
            case 81 -> 212;
            case 82 -> 69;
            case 83 -> 32;
            case 84 -> 123;
            case 85 -> 103;
            case 86 -> 25;
            case 87 -> 190;
            case 88 -> 85;
            case 89 -> 178;
            case 90 -> 122;
            case 91 -> 220;
            case 92 -> 203;
            case 93 -> 141;
            case 94 -> 100;
            case 95 -> 90;
            case 96 -> 55;
            case 97 -> 115;
            case 98 -> 57;
            case 99 -> 200;
            case 100 -> 128;
            case 101 -> 33;
            case 102 -> 14;
            case 103 -> 164;
            case 104 -> 183;
            case 105 -> 59;
            case 106 -> 119;
            case 107 -> 247;
            case 108 -> 172;
            case 109 -> 199;
            case 110 -> 6;
            case 111 -> 120;
            case 112 -> 101;
            case 113 -> 144;
            case 114 -> 182;
            case 115 -> 7;
            case 116 -> 94;
            case 117 -> 81;
            case 118 -> 179;
            case 119 -> 154;
            case 120 -> 138;
            case 121 -> 61;
            case 122 -> 153;
            case 123 -> 217;
            case 124 -> 191;
            case 125 -> 95;
            case 126 -> 184;
            case 127 -> 126;
            case 128 -> 71;
            case 129 -> 19;
            case 130 -> 170;
            case 131 -> 97;
            case 132 -> 149;
            case 133 -> 12;
            case 134 -> 206;
            case 135 -> 114;
            case 136 -> 64;
            case 137 -> 41;
            case 138 -> 145;
            case 139 -> 1;
            case 140 -> 13;
            case 141 -> 92;
            case 142 -> 245;
            case 143 -> 22;
            case 144 -> 143;
            case 145 -> 124;
            case 146 -> 158;
            case 147 -> 106;
            case 148 -> 240;
            case 149 -> 209;
            case 150 -> 18;
            case 151 -> 75;
            case 152 -> 104;
            case 153 -> 63;
            case 154 -> 215;
            case 155 -> 214;
            case 156 -> 168;
            case 157 -> 140;
            case 158 -> 188;
            case 159 -> 96;
            case 160 -> 218;
            case 161 -> 228;
            case 162 -> 21;
            case 163 -> 4;
            case 164 -> 225;
            case 165 -> 20;
            case 166 -> 77;
            case 167 -> 241;
            case 168 -> 84;
            case 169 -> 252;
            case 170 -> 54;
            case 171 -> 15;
            case 172 -> 148;
            case 173 -> 78;
            case 174 -> 142;
            case 175 -> 193;
            case 176 -> 196;
            case 177 -> 224;
            case 178 -> 137;
            case 179 -> 176;
            case 180 -> 0;
            case 181 -> 197;
            case 182 -> 110;
            case 183 -> 83;
            case 184 -> 163;
            case 185 -> 208;
            case 186 -> 80;
            case 187 -> 70;
            case 188 -> 205;
            case 189 -> 195;
            case 190 -> 102;
            case 191 -> 242;
            case 192 -> 146;
            case 193 -> 198;
            case 194 -> 157;
            case 195 -> 73;
            case 196 -> 116;
            case 197 -> 118;
            case 198 -> 167;
            case 199 -> 35;
            case 200 -> 162;
            case 201 -> 56;
            case 202 -> 45;
            case 203 -> 187;
            case 204 -> 24;
            case 205 -> 34;
            case 206 -> 202;
            case 207 -> 132;
            case 208 -> 29;
            case 209 -> 233;
            case 210 -> 253;
            case 211 -> 227;
            case 212 -> 234;
            case 213 -> 48;
            case 214 -> 51;
            case 215 -> 67;
            case 216 -> 232;
            case 217 -> 250;
            case 218 -> 211;
            case 219 -> 111;
            case 220 -> 2;
            case 221 -> 159;
            case 222 -> 5;
            case 223 -> 42;
            case 224 -> 174;
            case 225 -> 40;
            case 226 -> 60;
            case 227 -> 243;
            case 228 -> 235;
            case 229 -> 89;
            case 230 -> 130;
            case 231 -> 9;
            case 232 -> 49;
            case 233 -> 117;
            case 234 -> 192;
            case 235 -> 204;
            case 236 -> 216;
            case 237 -> 30;
            case 238 -> 127;
            case 239 -> 53;
            case 240 -> 244;
            case 241 -> 31;
            case 242 -> 38;
            case 243 -> 219;
            case 244 -> 238;
            case 245 -> 46;
            case 246 -> 113;
            case 247 -> 98;
            case 248 -> 177;
            case 249 -> 65;
            case 250 -> 173;
            case 251 -> 251;
            case 252 -> 221;
            case 253 -> 11;
            case 254 -> 139;
            default -> 248;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
