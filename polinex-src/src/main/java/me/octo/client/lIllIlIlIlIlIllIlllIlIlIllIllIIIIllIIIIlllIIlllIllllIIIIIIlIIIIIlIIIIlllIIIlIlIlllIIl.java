package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.mixin.accessors.MultiPlayerGameModeProgressAccessor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private BlockPos lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] f;
   private static String[] g;

   private lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl() {
      short var10001 = 25708;
      short var10002 = -7491;
      var10002 = 25702;
      short var10003 = -19936;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      short var10004 = 25709;
      short var10005 = -14664;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IllIIllIIIIIIlIIllllllIIllIIIIIIlIlIlIlIlIlllllllIIIIlIIIIlIlIllIIIIllIllIIllIlIlllIl.a()
      };
      super("Tree Nuker", "Nukes trees.", var3, "Misc", var1);
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 5;
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      Object var8 = null; // PX-FIX
      Object var10 = null; // PX-FIX
      String[] var10000 = lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      Intrinsics.checkNotNullParameter(var1, "e");
      String[] var2 = var10000;
      boolean var5 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      if (var2 != null) {
         if (!var5) {
            return;
         }

         lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var6 = IllIIllIIIIIIlIIllllllIIllIIIIIIlIlIlIlIlIlllllllIIIIlIIIIlIlIllIIIIllIllIIllIlIlllIl.a();
         short var10001 = 25706;
         short var10002 = 27470;
         var5 = var6.c("Normal");
      }

      label78: {
         label66: {
            if (var5) {
               BlockPos var7 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               if (var2 != null) {
                  if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl == null) {
                     this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.a(
                        this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                     );
                     return;
                  }

                  var7 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               }

               if (var7 == null) {
                  return;
               }

               BlockPos var3 = var7;
               var8 = this;
               if (var2 == null) {
                  break label66;
               }

               LocalPlayer var9 = this.ap().player;
               Intrinsics.checkNotNull(var9);
               if (!(
                  Math.sqrt(var9.distanceToSqr(Vec3.atCenterOf(var3)))
                     < this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
               )) {
                  Vec3 var14 = Vec3.atCenterOf(var3);
                  LocalPlayer var15 = this.ap().player;
                  Intrinsics.checkNotNull(var15);
                  this.a(new BlockHitResult(var14, Direction.fromYRot(var15.getYRot()), var3, false));
                  var8 = this;
                  break label66;
               }

               if (var1.b()) {
                  Vec3 var10003 = Vec3.atCenterOf(var3);
                  LocalPlayer var10004 = this.ap().player;
                  Intrinsics.checkNotNull(var10004);
                  this.b(new BlockHitResult(var10003, Direction.fromYRot(var10004.getYRot()), var3, false));
               }

               var10 = this;
               if (var2 == null) {
                  break label78;
               }

               ClientLevel var11 = this.ap().level;
               Intrinsics.checkNotNull(var11);
               if (var11.getBlockState(var3).getBlock() == Blocks.AIR) {
                  var10 = this;
                  break label78;
               }
            } else {
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = this.a(
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
               );
               if (var2 == null) {
                  return;
               }

               if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl == null) {
                  return;
               }

               BlockPos var4 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
               Minecraft var12 = this.ap();
               if (var2 != null) {
                  LocalPlayer var13 = var12.player;
                  Intrinsics.checkNotNull(var12.player);
                  if (!(
                     Math.sqrt(var13.distanceToSqr(Vec3.atCenterOf(var4)))
                        < this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                  )) {
                     return;
                  }

                  var12 = this.ap();
               }

               var12.hitResult = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var4);
            }

            return;
         }

         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
         return;
      }

      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1) {
      String[] var10000 = lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      Intrinsics.checkNotNullParameter(var1, "e");
      String[] var2 = var10000;
      boolean var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m();
      if (var2 != null) {
         if (!var3) {
            return;
         }

         lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var4 = IllIIllIIIIIIlIIllllllIIllIIIIIIlIlIlIlIlIlllllllIIIIlIIIIlIlIllIIIIllIllIIllIlIlllIl.a();
         short var10001 = 25703;
         short var10002 = 31351;
         var3 = var4.c("Legit");
      }

      if (var3 && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl != null) {
         var1.a(true);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var1) {
      Intrinsics.checkNotNullParameter(var1, "e");
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   @Override
   public void aB() {
      this.as();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   @Override
   public void aC() {
      this.at();
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   private final BlockPos a(int var1) {
      int var13 = 0; // PX-FIX
      BlockPos var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      String[] var10000 = lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      BlockPos var4 = null;
      double var5 = Double.MAX_VALUE;
      int var7 = -var1;
      String[] var2 = var10000;
      if (var7 <= var1) {
         do {
            int var10001;
            label87: {
               int var8 = -var1;
               if (var8 <= var1) {
                  do {
                     int var9 = -var1;
                     var13 = var9;
                     var10001 = var1;
                     if (var2 == null) {
                        break label87;
                     }

                     label71: {
                        label88: {
                           if (var9 <= var1) {
                              do {
                                 BlockPos var14 = var3.offset(new Vec3i(var7,((Integer)( var8)), var9));
                                 short var10002 = 25699;
                                 short var10003 = -31760;
                                 Intrinsics.checkNotNullExpressionValue(var14, "offset(...)");
                                 BlockPos var10 = var14;
                                 ClientLevel var15 = this.ap().level;
                                 Intrinsics.checkNotNull(var15);
                                 var13 = ((var15.getBlockState(var10).is(Blocks.MANGROVE_WOOD)) ? 1 : 0);
                                 if (var2 == null) {
                                    break label88;
                                 }

                                 label65: {
                                    label84: {
                                       if ((var13 != 0)) {
                                          ClientLevel var16 = this.ap().level;
                                          Intrinsics.checkNotNull(var16);
                                          var13 = var16.getBlockState(var10).is(Blocks.STRIPPED_SPRUCE_WOOD) ? 1 : 0;
                                          if (var2 == null || var2 == null) {
                                             break label65;
                                          }

                                          if ((var13 != 0)) {
                                             break label84;
                                          }
                                       }

                                       double var11 = var3.distSqr(var10);
                                       double var17;
                                       var13 = (var17 = var11 - var5) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
                                       if (var2 == null) {
                                          break label65;
                                       }

                                       if ((((var13 != 0) ? 1 : 0)) < 0) {
                                          var5 = var11;
                                          var4 =((BlockPos)( var10));
                                       }
                                    }

                                    var13 = var9;
                                 }

                                 var10001 = var1;
                                 if (var2 == null) {
                                    break label71;
                                 }

                                 if (var13 ==( ((var1 == 0)) ? 1 : 0)) {
                                    break;
                                 }

                                 var9++;
                              } while (var2 != null);
                           }

                           var13 = var8;
                        }

                        var10001 = var1;
                     }

                     if (var2 == null) {
                        break label87;
                     }

                     if (var13 == var10001) {
                        break;
                     }

                     var8++;
                  } while (var2 != null);
               }

               var13 = var7;
               var10001 = var1;
            }

            if (var13 == var10001) {
               break;
            }

            var7++;
         } while (var2 != null);
      }

      return var4;
   }

   public final void a(@NotNull BlockHitResult var1) {
      label30: {
         String[] var10000 = lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         short var10002 = 25698;
         short var10003 = 8103;
         Intrinsics.checkNotNullParameter(var1, "bhr");
         Direction var10001 = var1.getDirection();
         var10003 = 25705;
         short var10004 = 4639;
         Intrinsics.checkNotNullExpressionValue(var10001, "getDirection(...)");
         Direction var3 = var10001;
         String[] var2 = var10000;
         BlockPos var5 = var1.getBlockPos();
         var10002 = 25701;
         var10003 = 9012;
         Intrinsics.checkNotNullExpressionValue(var5, "getBlockPos(...)");
         BlockPos var4 = var5;
         int var6 = ((this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) ? 1 : 0);
         if (var2 != null) {
            if (!this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) {
               break label30;
            }

            MultiPlayerGameMode var7 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a()
               .gameMode;
            var10002 = 25711;
            var10003 = 29888;
            Intrinsics.checkNotNull(var7, "null cannot be cast to non-null type me.octo.client.mixin.accessors.MultiPlayerGameModeProgressAccessor");
            float var15;
            var6 = (var15 = ((MultiPlayerGameModeProgressAccessor)var7).getDestroyProgress() - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
         }

         if (var2 != null) {
            var6 = (((var6 == 0) ? 1 : 0));
         }

         if ((var6 == 0)) {
            ClientPacketListener var8 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a()
               .getConnection();
            Intrinsics.checkNotNull(var8);
            var8.send(new ServerboundPlayerActionPacket(Action.ABORT_DESTROY_BLOCK, var4, var3));
            LocalPlayer var9 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a()
               .player;
            Intrinsics.checkNotNull(var9);
            var9.swing(InteractionHand.MAIN_HAND);
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
         }
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            new String[1]
         );
      }
   }

   public final void b(@NotNull BlockHitResult var1) {
      Object var12 = null; // PX-FIX
      Object var11 = null; // PX-FIX
      String[] var10000 = lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      short var10002 = 25700;
      short var10003 = -25344;
      Intrinsics.checkNotNullParameter(var1, "bhr");
      Direction var10001 = var1.getDirection();
      var10003 = 25707;
      short var10004 = 30208;
      Intrinsics.checkNotNullExpressionValue(var10001, "getDirection(...)");
      Direction var3 = var10001;
      String[] var2 = var10000;
      BlockPos var5 = var1.getBlockPos();
      var10002 = 25710;
      var10003 = -6902;
      Intrinsics.checkNotNullExpressionValue(var5, "getBlockPos(...)");
      BlockPos var4 = var5;
      MultiPlayerGameMode var6 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .a()
         .gameMode;
      var10002 = 25704;
      var10003 = 18863;
      Intrinsics.checkNotNull(var6, "null cannot be cast to non-null type me.octo.client.mixin.accessors.MultiPlayerGameModeProgressAccessor");
      float var22;
      int var7 = (var22 = ((MultiPlayerGameModeProgressAccessor)var6).getDestroyProgress() - 0.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
      if (var2 != null) {
         var7 = (((var7 == 0) ? 1 : 0));
      }

      label44: {
         label45: {
            label46: {
               if ((var7 != 0)) {
                  ClientPacketListener var8 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a()
                     .getConnection();
                  Intrinsics.checkNotNull(var8);
                  var8.send(new ServerboundPlayerActionPacket(Action.START_DESTROY_BLOCK, var4, var3));
                  LocalPlayer var9 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a()
                     .player;
                  Intrinsics.checkNotNull(var9);
                  var9.swing(InteractionHand.MAIN_HAND);
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = true;
                  if (var2 != null) {
                     break label46;
                  }

                  me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
                     new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]
                  );
               }

               MultiPlayerGameMode var10 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .a()
                  .gameMode;
               var10002 = 25711;
               var10003 = 29888;
               Intrinsics.checkNotNull(var10, "null cannot be cast to non-null type me.octo.client.mixin.accessors.MultiPlayerGameModeProgressAccessor");
               float var23;
               var11 = (var23 = ((MultiPlayerGameModeProgressAccessor)var10).getDestroyProgress() - 1.0F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
               if (var2 == null) {
                  break label45;
               }

               if (((Boolean)var11)) {
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
               }
            }

            var12 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a();
            if (var2 == null) {
               break label44;
            }

            MultiPlayerGameMode var13 = ((MultiPlayerGameMode)(Object)(((me.octo.client.PXDyn)var12).gameMode));
            Intrinsics.checkNotNull(((me.octo.client.PXDyn)var12).gameMode);
            var11 = var13.continueDestroyBlock(var4, var3);
         }

         if (((Boolean)(var11))) {
            return;
         }

         var12 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a();
      }

      LocalPlayer var14 = ((LocalPlayer)(Object)(((me.octo.client.PXDyn)var12).player));
      Intrinsics.checkNotNull(((me.octo.client.PXDyn)var12).player);
      var14.swing(InteractionHand.MAIN_HAND);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "³.\u0090J¬|P#\u008f\u0014Ü\u0000øD\u009f\u0090ge²zå¦nÖé#è·\u0097>ô\u008cîÍ¥¨ÙÜ5\u009bS<\u008fx{·zX\u008a¶\\\u001býç\u0002¹\u0086Á\u001f\u008bY¼Î8ïÄ\u0092ÿÆlre$ð4Å\n¾{ì\u00905dS¶j\u000f\u0080\u0094\u0081<0ìÙðÅ\u0089áÛD±kl\u00931áC Ý0í¸É9t\b(¢s\u0013\n&\u001dfþ\r\b·¨\u0092x\u0004Ä\u008a\u0016r\u0006¿\u0085\u001b[\u0016\u0097\u0011¼Pq\u0083\u0095\u009eÔÉýF.Ê?\u0093¡mïgò7\u0088Uøx\u001d+Z°\u0098\u009cÛ\u00950ÂZ Zi\u0082#P\u0091E×WpR\u001bä¦!ÙéM¹\u0014rD¸G¤RY¯\u0084ÃS\u0017\rv2d®æ\u0089lê\u0001[\u001aP¼¢á¡\u00064\u0019KVød\u001fç<\u0091y¥v^¶\u00015zXó\u0098\u001b\u000fÖÕ\u008c\u0004å®ñú\u0098üeØ\u0011X/íl\u0006c¦v³±ç4\u0006L\u0086\u0096\u000b\f½\fB;\u0015Þ\u008cÈÔY$ä\u0005â°ç²+\u0003TCÏ\u0010\u0096ý4083ÂÊÝ)\u0096§±°¶\u000e";
      int var4 = "³.\u0090J¬|P#\u008f\u0014Ü\u0000øD\u009f\u0090ge²zå¦nÖé#è·\u0097>ô\u008cîÍ¥¨ÙÜ5\u009bS<\u008fx{·zX\u008a¶\\\u001býç\u0002¹\u0086Á\u001f\u008bY¼Î8ïÄ\u0092ÿÆlre$ð4Å\n¾{ì\u00905dS¶j\u000f\u0080\u0094\u0081<0ìÙðÅ\u0089áÛD±kl\u00931áC Ý0í¸É9t\b(¢s\u0013\n&\u001dfþ\r\b·¨\u0092x\u0004Ä\u008a\u0016r\u0006¿\u0085\u001b[\u0016\u0097\u0011¼Pq\u0083\u0095\u009eÔÉýF.Ê?\u0093¡mïgò7\u0088Uøx\u001d+Z°\u0098\u009cÛ\u00950ÂZ Zi\u0082#P\u0091E×WpR\u001bä¦!ÙéM¹\u0014rD¸G¤RY¯\u0084ÃS\u0017\rv2d®æ\u0089lê\u0001[\u001aP¼¢á¡\u00064\u0019KVød\u001fç<\u0091y¥v^¶\u00015zXó\u0098\u001b\u000fÖÕ\u008c\u0004å®ñú\u0098üeØ\u0011X/íl\u0006c¦v³±ç4\u0006L\u0086\u0096\u000b\f½\fB;\u0015Þ\u008cÈÔY$ä\u0005â°ç²+\u0003TCÏ\u0010\u0096ý4083ÂÊÝ)\u0096§±°¶\u000e"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 69;
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
                     case 0 -> 7;
                     case 1 -> 127;
                     case 2 -> 20;
                     case 3 -> 6;
                     case 4 -> 71;
                     case 5 -> 125;
                     default -> 66;
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
                     g = new String[14];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl();
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

                  var2 = "z\u0090ä\u000b\u0004ê\u0093n{\u001a'<ÓµR";
                  var4 = "z\u0090ä\u000b\u0004ê\u0093n{\u001a'<ÓµR".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 74;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 25710) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 39;
            case 1 -> 76;
            case 2 -> 130;
            case 3 -> 156;
            case 4 -> 186;
            case 5 -> 72;
            case 6 -> 65;
            case 7 -> 83;
            case 8 -> 200;
            case 9 -> 147;
            case 10 -> 88;
            case 11 -> 56;
            case 12 -> 172;
            case 13 -> 254;
            case 14 -> 177;
            case 15 -> 93;
            case 16 -> 206;
            case 17 -> 16;
            case 18 -> 149;
            case 19 -> 244;
            case 20 -> 235;
            case 21 -> 38;
            case 22 -> 140;
            case 23 -> 181;
            case 24 -> 142;
            case 25 -> 13;
            case 26 -> 162;
            case 27 -> 123;
            case 28 -> 198;
            case 29 -> 124;
            case 30 -> 0;
            case 31 -> 78;
            case 32 -> 77;
            case 33 -> 120;
            case 34 -> 62;
            case 35 -> 187;
            case 36 -> 63;
            case 37 -> 68;
            case 38 -> 30;
            case 39 -> 119;
            case 40 -> 90;
            case 41 -> 117;
            case 42 -> 253;
            case 43 -> 239;
            case 44 -> 246;
            case 45 -> 197;
            case 46 -> 91;
            case 47 -> 100;
            case 48 -> 216;
            case 49 -> 159;
            case 50 -> 14;
            case 51 -> 37;
            case 52 -> 191;
            case 53 -> 145;
            case 54 -> 241;
            case 55 -> 82;
            case 56 -> 7;
            case 57 -> 250;
            case 58 -> 47;
            case 59 -> 33;
            case 60 -> 29;
            case 61 -> 17;
            case 62 -> 104;
            case 63 -> 222;
            case 64 -> 87;
            case 65 -> 73;
            case 66 -> 18;
            case 67 -> 182;
            case 68 -> 247;
            case 69 -> 125;
            case 70 -> 99;
            case 71 -> 75;
            case 72 -> 4;
            case 73 -> 202;
            case 74 -> 86;
            case 75 -> 52;
            case 76 -> 50;
            case 77 -> 170;
            case 78 -> 84;
            case 79 -> 79;
            case 80 -> 67;
            case 81 -> 240;
            case 82 -> 9;
            case 83 -> 49;
            case 84 -> 228;
            case 85 -> 112;
            case 86 -> 138;
            case 87 -> 25;
            case 88 -> 233;
            case 89 -> 190;
            case 90 -> 61;
            case 91 -> 215;
            case 92 -> 135;
            case 93 -> 180;
            case 94 -> 205;
            case 95 -> 53;
            case 96 -> 163;
            case 97 -> 57;
            case 98 -> 85;
            case 99 -> 226;
            case 100 -> 141;
            case 101 -> 232;
            case 102 -> 107;
            case 103 -> 195;
            case 104 -> 3;
            case 105 -> 15;
            case 106 -> 42;
            case 107 -> 69;
            case 108 -> 150;
            case 109 -> 220;
            case 110 -> 251;
            case 111 -> 194;
            case 112 -> 179;
            case 113 -> 164;
            case 114 -> 27;
            case 115 -> 48;
            case 116 -> 110;
            case 117 -> 12;
            case 118 -> 201;
            case 119 -> 243;
            case 120 -> 121;
            case 121 -> 40;
            case 122 -> 229;
            case 123 -> 192;
            case 124 -> 131;
            case 125 -> 213;
            case 126 -> 153;
            case 127 -> 184;
            case 128 -> 81;
            case 129 -> 114;
            case 130 -> 36;
            case 131 -> 211;
            case 132 -> 106;
            case 133 -> 45;
            case 134 -> 237;
            case 135 -> 54;
            case 136 -> 166;
            case 137 -> 157;
            case 138 -> 108;
            case 139 -> 92;
            case 140 -> 151;
            case 141 -> 74;
            case 142 -> 231;
            case 143 -> 165;
            case 144 -> 21;
            case 145 -> 242;
            case 146 -> 255;
            case 147 -> 64;
            case 148 -> 70;
            case 149 -> 225;
            case 150 -> 55;
            case 151 -> 59;
            case 152 -> 24;
            case 153 -> 221;
            case 154 -> 183;
            case 155 -> 19;
            case 156 -> 133;
            case 157 -> 101;
            case 158 -> 89;
            case 159 -> 188;
            case 160 -> 139;
            case 161 -> 214;
            case 162 -> 32;
            case 163 -> 51;
            case 164 -> 178;
            case 165 -> 174;
            case 166 -> 224;
            case 167 -> 28;
            case 168 -> 227;
            case 169 -> 31;
            case 170 -> 126;
            case 171 -> 95;
            case 172 -> 2;
            case 173 -> 168;
            case 174 -> 34;
            case 175 -> 210;
            case 176 -> 209;
            case 177 -> 118;
            case 178 -> 152;
            case 179 -> 109;
            case 180 -> 144;
            case 181 -> 207;
            case 182 -> 20;
            case 183 -> 203;
            case 184 -> 161;
            case 185 -> 160;
            case 186 -> 236;
            case 187 -> 8;
            case 188 -> 127;
            case 189 -> 1;
            case 190 -> 5;
            case 191 -> 98;
            case 192 -> 218;
            case 193 -> 154;
            case 194 -> 204;
            case 195 -> 169;
            case 196 -> 148;
            case 197 -> 217;
            case 198 -> 238;
            case 199 -> 146;
            case 200 -> 171;
            case 201 -> 245;
            case 202 -> 132;
            case 203 -> 113;
            case 204 -> 199;
            case 205 -> 58;
            case 206 -> 94;
            case 207 -> 167;
            case 208 -> 97;
            case 209 -> 158;
            case 210 -> 10;
            case 211 -> 223;
            case 212 -> 129;
            case 213 -> 230;
            case 214 -> 46;
            case 215 -> 193;
            case 216 -> 96;
            case 217 -> 41;
            case 218 -> 175;
            case 219 -> 26;
            case 220 -> 80;
            case 221 -> 196;
            case 222 -> 122;
            case 223 -> 185;
            case 224 -> 6;
            case 225 -> 219;
            case 226 -> 105;
            case 227 -> 249;
            case 228 -> 234;
            case 229 -> 22;
            case 230 -> 137;
            case 231 -> 136;
            case 232 -> 115;
            case 233 -> 11;
            case 234 -> 208;
            case 235 -> 189;
            case 236 -> 173;
            case 237 -> 176;
            case 238 -> 212;
            case 239 -> 143;
            case 240 -> 248;
            case 241 -> 116;
            case 242 -> 60;
            case 243 -> 66;
            case 244 -> 71;
            case 245 -> 35;
            case 246 -> 134;
            case 247 -> 252;
            case 248 -> 44;
            case 249 -> 43;
            case 250 -> 128;
            case 251 -> 23;
            case 252 -> 102;
            case 253 -> 155;
            case 254 -> 103;
            default -> 111;
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
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
           this();
        }


      private static String[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl a() {
         return lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }

      public static void b(String[] var0) {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var0;
      }

      public static String[] b() {
         return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      static {
         if (b() == null) {
            b(new String[4]);
         }
      }
   }
      public static final me.octo.client.lIllIlIlIlIlIllIlllIlIlIllIllIIIIllIIIIlllIIlllIllllIIIIIIlIIIIIlIIIIlllIIIlIlIlllIIl ag() {
         return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
}
