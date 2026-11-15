package me.octo.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI
   extends llIllIIIlIIlIIIlIlllIIIlIlllIllIllIIIIllllIIllllIlIIlIlllIIIlIlIlIIlIlIIIlIIllllIIIII {
   public static me.octo.client.PXDyn Object = null; // PX-FIX missing field

   private final List<LivingEntity> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] d;

   public IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI(String var1) {
      super(var1);
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll var1) {
      int[] var2 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
      Minecraft var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var2 != null) {
         if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            == null) {
            return;
         }

         var10000 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var10000.level != null) {
         Packet var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Packet var7 = var4;
         if (var2 != null) {
            if (!(var4 instanceof ClientboundSetEntityMotionPacket)) {
               return;
            }

            var7 = var4;
         }

         ClientboundSetEntityMotionPacket var3 = (ClientboundSetEntityMotionPacket)var7;
         int var8 = var3.id();
         if (var2 != null) {
            if (var8
               != me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player
                  .getId()) {
               return;
            }

            var8 = ((me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
               .onGround()) ? 1 : 0);
         }

         if (var8 != 0) {
            double var6 = var3.movement().y();
            double var10;
            int var9 = (var10 = var6 - 0.0) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
            if (var2 != null) {
               if (var9 <= 0) {
                  return;
               }

               double var11;
               var9 = (var11 = var6 - 12000.0) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
            }

            label40: {
               if (var2 != null) {
                  if (var9 != 0) {
                     break label40;
                  }

                  var9 = ((h()) ? 1 : 0);
               }

               if (var9 != 0) {
                  return;
               }
            }

            this.a((int)var6);
         }
      }
   }

   @SubscribeEvent
   public void a(llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII var1) {
      int[] var2 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
      long var3;
      int var10000 = (var3 = System.currentTimeMillis() - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI - 100L)
            == 0L
         ? 0
         : (var3 < 0L ? -1 : 1);
      if (var2 != null) {
         if (var10000 <= 0) {
            return;
         }

         long var4;
         var10000 = (var4 = System.currentTimeMillis() - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI - 250L)
               == 0L
            ? 0
            : (var4 < 0L ? -1 : 1);
      }

      if (var2 != null) {
         if (var10000 >= 0) {
            return;
         }

         var10000 = ((this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) ? 1 : 0);
      }

      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .a(
               (me.octo.client.events.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)(new me.octo.client.events.impl.IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI())
            );
      }

      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = false;
   }

   @SubscribeEvent
   public void a(me.octo.client.events.impl.IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI var1) {
      Object var4 = null; // PX-FIX
      IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI var5;
      label72: {
         label73: {
            int[] var2;
            label74: {
               int[] var10000 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
               this.i();
               var2 = var10000;
               int var3 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.isEmpty()) ? 1 : 0);
               if (var2 != null) {
                  if (var3 != 0) {
                     var4 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .player
                        .hurtTime;
                     if (var2 == null) {
                        break label73;
                     }

                     if (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                           .player
                           .hurtTime
                        == 0) {
                        break label74;
                     }
                  }

                  var3 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
               }

               short var10001 = 2886;
               if (var2 != null) {
                  if (var3 <= 2886) {
                     return;
                  }

                  var3 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                  var10001 = 3648;
               }

               label75: {
                  if (var2 != null) {
                     if (var3 == var10001) {
                        return;
                     }

                     var3 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                     if (var2 == null) {
                        break label75;
                     }

                     var10001 = 3200;
                  }

                  if (var3 == var10001) {
                     return;
                  }

                  var3 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player
                     .hurtTime;
               }

               if (var3 != 0) {
                  return;
               }

               if (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .g()
                  == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
                  )
                {
                  return;
               }

               short var10002 = -25383;
               short var10003 = -6976;
               this.a("MOB/HURT NEARBY VELOCITY DETECTED: " + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
               if (var2 != null) {
                  return;
               }
            }

            var5 = this;
            if (var2 == null) {
               break label72;
            }

            var4 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         }

         if (!((Boolean)var4)) {
            return;
         }

         var5 = this;
      }

      short var6 = -25384;
      short var7 = -31212;
      var5.a("UNKNOWN VELOCITY DETECTED: " + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
   }

   private static boolean h() {
      BlockPos var1 = BlockPos.containing(
         me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player
            .getX(),
         me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
               .getY()
            - 1.0,
         me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player
            .getZ()
      );
      int[] var10000 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
      int var2 = -3;
      int[] var0 = var10000;

      label59:
      while (true) {
         int var7 = var2;

         label56:
         while (var7 <= 3) {
            if (var0 == null) {
               return ((Boolean)(Object)((boolean)(Object)(-1)));
            }

            int var3 = -1;

            label53:
            while (true) {
               int var9 = var3;

               label51:
               while (true) {
                  if (var9 > 3) {
                     break label53;
                  }

                  var7 = -3;
                  if (var0 == null) {
                     continue label56;
                  }

                  int var4 = -3;

                  while (var4 <= 3) {
                     BlockPos var5 = var1.offset(var2, var3, var4);
                     Block var6 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .level
                        .getBlockState(var5)
                        .getBlock();
                     if (var0 != null) {
                        var9 = ((var6.equals(Blocks.SLIME_BLOCK)) ? 1 : 0);
                        if (var0 == null) {
                           continue label51;
                        }

                        if (var9 != 0) {
                           return true;
                        }

                        var4++;
                     }

                     if (var0 == null) {
                        break;
                     }
                  }

                  var3++;
                  if (var0 == null) {
                     break label53;
                  }
                  break;
               }
            }

            var2++;
            if (var0 != null) {
               continue label59;
            }
            break;
         }

         return (0 != 0);
      }
   }

   private void a(int var1) {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
   }

   private void i() {
      int[] var10000 = lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl.k();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
      int[] var1 = var10000;
      Iterator var2 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .level
         .entitiesForRendering()
         .iterator();

      while (true) {
         if (var2.hasNext()) {
            Entity var3 = (Entity)var2.next();
            if (var1 == null) {
               break;
            }

            label41: {
               Entity var5 = var3;
               if (var1 != null) {
                  if (!(var3 instanceof LivingEntity)) {
                     break label41;
                  }

                  var5 = var3;
               }

               LivingEntity var4 = (LivingEntity)var5;
               if (var4
                     != me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .player
                  && var1 != null
                  && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .player
                        .distanceTo(var4)
                     <= 5.0F) {
                  this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.add(var4);
               }
            }

            if (var1 != null) {
               continue;
            }
         }

         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            .sort(
               Comparator.comparingDouble(
                  me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player::distanceTo
               )
            );
         break;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "¯õý0¹\u0001Çq¬\u0010ó\u0080YØ\u0090]\u0098Í\u0087\u0083\u0095e¡;Í\u0015@ÙZÊ\\0UI¥\u001b\u0094i\u0088ã84\fá<óP\u0098\u0014\u001f\u0007¶°ç3ü-øpß\u0093h\u0006";
      int var4 = "¯õý0¹\u0001Çq¬\u0010ó\u0080YØ\u0090]\u0098Í\u0087\u0083\u0095e¡;Í\u0015@ÙZÊ\\0UI¥\u001b\u0094i\u0088ã84\fá<óP\u0098\u0014\u001f\u0007¶°ç3ü-øpß\u0093h\u0006"
         .length();
      char var1 = '#';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 73;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 73;
               var10006 = var6;
            } else {
               var13 = 73;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 73;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 60;
                  case 1 -> 72;
                  case 2 -> 73;
                  case 3 -> 110;
                  case 4 -> 13;
                  case 5 -> 53;
                  default -> 34;
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
            d = new String[2];
            break pxClinit; // PX-FIX
         }

         var1 = var2.charAt(var0);
      }
   } // PX-FIX end pxClinit
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -25383) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 190;
            case 1 -> 247;
            case 2 -> 228;
            case 3 -> 42;
            case 4 -> 229;
            case 5 -> 8;
            case 6 -> 5;
            case 7 -> 16;
            case 8 -> 152;
            case 9 -> 63;
            case 10 -> 33;
            case 11 -> 127;
            case 12 -> 99;
            case 13 -> 109;
            case 14 -> 201;
            case 15 -> 101;
            case 16 -> 3;
            case 17 -> 251;
            case 18 -> 95;
            case 19 -> 14;
            case 20 -> 76;
            case 21 -> 87;
            case 22 -> 15;
            case 23 -> 64;
            case 24 -> 32;
            case 25 -> 53;
            case 26 -> 174;
            case 27 -> 218;
            case 28 -> 137;
            case 29 -> 184;
            case 30 -> 108;
            case 31 -> 20;
            case 32 -> 6;
            case 33 -> 40;
            case 34 -> 157;
            case 35 -> 147;
            case 36 -> 92;
            case 37 -> 239;
            case 38 -> 110;
            case 39 -> 191;
            case 40 -> 187;
            case 41 -> 21;
            case 42 -> 2;
            case 43 -> 129;
            case 44 -> 81;
            case 45 -> 72;
            case 46 -> 30;
            case 47 -> 28;
            case 48 -> 138;
            case 49 -> 77;
            case 50 -> 149;
            case 51 -> 237;
            case 52 -> 94;
            case 53 -> 144;
            case 54 -> 146;
            case 55 -> 65;
            case 56 -> 245;
            case 57 -> 246;
            case 58 -> 197;
            case 59 -> 232;
            case 60 -> 128;
            case 61 -> 74;
            case 62 -> 185;
            case 63 -> 47;
            case 64 -> 206;
            case 65 -> 198;
            case 66 -> 181;
            case 67 -> 204;
            case 68 -> 124;
            case 69 -> 7;
            case 70 -> 160;
            case 71 -> 19;
            case 72 -> 154;
            case 73 -> 88;
            case 74 -> 25;
            case 75 -> 107;
            case 76 -> 177;
            case 77 -> 238;
            case 78 -> 70;
            case 79 -> 161;
            case 80 -> 209;
            case 81 -> 211;
            case 82 -> 163;
            case 83 -> 176;
            case 84 -> 121;
            case 85 -> 226;
            case 86 -> 196;
            case 87 -> 164;
            case 88 -> 84;
            case 89 -> 168;
            case 90 -> 22;
            case 91 -> 71;
            case 92 -> 56;
            case 93 -> 114;
            case 94 -> 242;
            case 95 -> 97;
            case 96 -> 195;
            case 97 -> 31;
            case 98 -> 24;
            case 99 -> 98;
            case 100 -> 112;
            case 101 -> 142;
            case 102 -> 120;
            case 103 -> 61;
            case 104 -> 23;
            case 105 -> 122;
            case 106 -> 52;
            case 107 -> 134;
            case 108 -> 143;
            case 109 -> 11;
            case 110 -> 241;
            case 111 -> 214;
            case 112 -> 254;
            case 113 -> 50;
            case 114 -> 158;
            case 115 -> 17;
            case 116 -> 208;
            case 117 -> 236;
            case 118 -> 37;
            case 119 -> 217;
            case 120 -> 166;
            case 121 -> 117;
            case 122 -> 26;
            case 123 -> 249;
            case 124 -> 73;
            case 125 -> 44;
            case 126 -> 223;
            case 127 -> 27;
            case 128 -> 141;
            case 129 -> 111;
            case 130 -> 255;
            case 131 -> 79;
            case 132 -> 58;
            case 133 -> 156;
            case 134 -> 36;
            case 135 -> 1;
            case 136 -> 10;
            case 137 -> 212;
            case 138 -> 115;
            case 139 -> 38;
            case 140 -> 244;
            case 141 -> 179;
            case 142 -> 202;
            case 143 -> 78;
            case 144 -> 188;
            case 145 -> 192;
            case 146 -> 199;
            case 147 -> 67;
            case 148 -> 215;
            case 149 -> 57;
            case 150 -> 69;
            case 151 -> 253;
            case 152 -> 235;
            case 153 -> 224;
            case 154 -> 170;
            case 155 -> 140;
            case 156 -> 167;
            case 157 -> 225;
            case 158 -> 116;
            case 159 -> 240;
            case 160 -> 100;
            case 161 -> 216;
            case 162 -> 4;
            case 163 -> 75;
            case 164 -> 39;
            case 165 -> 207;
            case 166 -> 220;
            case 167 -> 182;
            case 168 -> 194;
            case 169 -> 55;
            case 170 -> 178;
            case 171 -> 145;
            case 172 -> 62;
            case 173 -> 9;
            case 174 -> 34;
            case 175 -> 180;
            case 176 -> 205;
            case 177 -> 155;
            case 178 -> 106;
            case 179 -> 125;
            case 180 -> 89;
            case 181 -> 130;
            case 182 -> 80;
            case 183 -> 105;
            case 184 -> 234;
            case 185 -> 135;
            case 186 -> 243;
            case 187 -> 231;
            case 188 -> 213;
            case 189 -> 165;
            case 190 -> 103;
            case 191 -> 200;
            case 192 -> 45;
            case 193 -> 59;
            case 194 -> 49;
            case 195 -> 35;
            case 196 -> 126;
            case 197 -> 227;
            case 198 -> 162;
            case 199 -> 119;
            case 200 -> 221;
            case 201 -> 132;
            case 202 -> 13;
            case 203 -> 90;
            case 204 -> 136;
            case 205 -> 139;
            case 206 -> 86;
            case 207 -> 46;
            case 208 -> 173;
            case 209 -> 85;
            case 210 -> 219;
            case 211 -> 102;
            case 212 -> 29;
            case 213 -> 91;
            case 214 -> 0;
            case 215 -> 43;
            case 216 -> 93;
            case 217 -> 113;
            case 218 -> 41;
            case 219 -> 12;
            case 220 -> 133;
            case 221 -> 233;
            case 222 -> 175;
            case 223 -> 183;
            case 224 -> 252;
            case 225 -> 96;
            case 226 -> 66;
            case 227 -> 210;
            case 228 -> 222;
            case 229 -> 150;
            case 230 -> 153;
            case 231 -> 82;
            case 232 -> 250;
            case 233 -> 189;
            case 234 -> 18;
            case 235 -> 118;
            case 236 -> 131;
            case 237 -> 148;
            case 238 -> 104;
            case 239 -> 172;
            case 240 -> 230;
            case 241 -> 151;
            case 242 -> 186;
            case 243 -> 48;
            case 244 -> 203;
            case 245 -> 193;
            case 246 -> 83;
            case 247 -> 60;
            case 248 -> 159;
            case 249 -> 248;
            case 250 -> 54;
            case 251 -> 51;
            case 252 -> 123;
            case 253 -> 169;
            case 254 -> 68;
            default -> 171;
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
}
