package me.octo.client;

import java.util.Random;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.NotNull;

public final class lllIllIIlllllIIIIIIlIIllllllIlIIIlIlllIIlIIlllIIllIlllIlIllIIlIIllIlIllIIIIllIlIIIIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lllIllIIlllllIIIIIIlIIllllllIlIIIlIlllIIlIIlllIIllIlllIlIllIIlIIllIlIllIIIIllIlIIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final Random lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private double llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @JvmField
   public static boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @JvmField
   @NotNull
   public static lllIllIIlllllIIIIIIlIIllllllIlIIIlIlllIIlIIlllIIllIlllIlIllIIlIIllIlIllIIIIllIlIIIIII IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] f;
   private static String[] g;

   private lllIllIIlllllIIIIIIlIIllllllIlIIIlIlllIIlIIlllIIllIlllIlIllIIlIIllIlIllIIIIllIlIIIIII() {
      short var10001 = -7290;
      short var10002 = 9822;
      var10002 = -7289;
      short var10003 = -4002;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      short var10004 = -7293;
      short var10005 = -17601;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.a(),
         lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.b(),
         lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.c(),
         lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.d(),
         lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.e()
      };
      super("Auto Clicker", "Automatically clicks with human-like patterns.", var3, "Misc", var1);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new Random();
   }

   private final double a(double var1, double var3) {
      double var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble();
      return var3 * Math.pow(-Math.log(1.0 - var5), 1.0 / var1);
   }

   private final double b(double var1, double var3) {
      double var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble();
      double var7 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble();
      double var9 = Math.sqrt(-2.0 * Math.log(var5)) * Math.sin((Math.PI * 2) * var7);
      return var1 + var3 * var9;
   }

   private final void ag() {
      int[] var1;
      double var28;
      double var31;
      label43: {
         double var2 = lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.b().Q();
         double var4 = lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.b().R();
         double var6 = 1000.0 / var4;
         int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
         double var8 = 1000.0 / var2;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            + (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble() * 0.5 + 0.3);
         double var10 = Math.sin(this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl) * 0.25 + 0.75;
         double var12 = var2 + (var4 - var2) * var10;
         double var14 = 1000.0 / var12;
         double var16 = 1.5 + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble() * 0.3;
         double var18 = var14 * 0.92;
         var28 = this.a(var16, var18);
         double var22 = this.b(0.0, var14 * 0.15);
         var28 += var22;
         var1 = var10000;
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            + this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble() * 0.002;
         double var34;
         int var30 = (var34 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI - 0.15) == 0.0
            ? 0
            : (var34 < 0.0 ? -1 : 1);
         if (var1 == null) {
            if (var30 > 0) {
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0.0;
            }

            var28 *= 1.0 + this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
            var31 = RangesKt.coerceIn(var28, var6 * 0.7, var8 * 1.4);
            if (var1 != null) {
               break label43;
            }

            var28 = var31;
            var30 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         }

         var31 = var30 > 20 ? 0.08 : 0.03;
      }

      label36: {
         double var24 = var31;
         double var35;
         int var32 = (var35 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble() - var24) == 0.0
            ? 0
            : (var35 < 0.0 ? -1 : 1);
         if (var1 == null) {
            if (var32 < 0) {
               long var26 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextInt(80) + 30;
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = System.currentTimeMillis() + var26 + (long)var28;
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
               if (var1 == null) {
                  break label36;
               }
            }

            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = System.currentTimeMillis() + (long)var28;
            var32 = this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
         }

         int var29 = var32;
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var29 + 1;
      }

      lllIllIIlllllIIIIIIlIIllllllIlIIIlIlllIIlIIlllIIllIlllIlIllIIlIIllIlIllIIIIllIlIIIIII var33 = this;
      if (var1 == null) {
         if (!(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.nextDouble() < 0.05)) {
            return;
         }

         var33 = this;
      }

      var33.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0;
   }

   @SubscribeEvent
   public final void a(@NotNull lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var1) {
      Object var13 = null; // PX-FIX
      Object var12 = null; // PX-FIX
      int[] var10000 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      short var10002 = -7294;
      short var10003 = 8534;
      Intrinsics.checkNotNullParameter(var1, "event");
      int[] var2 = var10000;
      if (!var1.c()) {
         Minecraft var7 = this.ap();
         if (var2 == null) {
            if (var7.screen != null) {
               IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
               return;
            }

            var7 = this.ap();
         }

         label136: {
            label142: {
               HitResult var3 = var7.hitResult;
               HitResult var8 = var3;
               if (var2 == null) {
                  if (var3 == null) {
                     break label142;
                  }

                  var8 = var3;
               }

               if (var2 == null) {
                  if (var8.getType() != Type.BLOCK) {
                     break label142;
                  }

                  var8 = var3;
               }

               label124: {
                  BlockPos var9 = ((BlockHitResult)var8).getBlockPos();
                  var10002 = -7291;
                  var10003 = -29025;
                  Intrinsics.checkNotNullExpressionValue(var9, "getBlockPos(...)");
                  BlockPos var4 = var9;
                  if (var2 == null) {
                     ClientLevel var10 = this.ap().level;
                     if (var10 != null) {
                        BlockState var11 = var10.getBlockState(var4);
                        if (var11 != null) {
                           var12 = var11.isAir();
                           if (var2 == null) {
                              break label124;
                           }
                        }
                     }
                  }

                  var12 = null;
               }

               Intrinsics.checkNotNull(var12);
               var13 = var12;
               if (var2 != null) {
                  break label136;
               }

               if (!((Boolean)var13)) {
                  IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
                  this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
                  return;
               }
            }

            var13 = this.ae();
         }

         label113: {
            label112: {
               label143: {
                  if (var2 == null) {
                     if (!((Boolean)var13)) {
                        break label143;
                     }

                     lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var14 = lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.a();
                     short var10001 = -7296;
                     var10002 = -15839;
                     var13 = var14.c("Regular");
                  }

                  if (var2 != null) {
                     break label113;
                  }

                  if (((Boolean)(var13))) {
                     break label112;
                  }

                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var15 = lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.a();
                  short var20 = -7292;
                  var10002 = 15043;
                  var13 = var15.c("Held");
                  if (var2 == null) {
                     if (!((Boolean)var13)) {
                        break label143;
                     }

                     var13 = this.ap().options.keyAttack.isDown();
                  }

                  if (var2 != null) {
                     break label113;
                  }

                  if (((Boolean)(var13))) {
                     break label112;
                  }
               }

               var13 = false;
               break label113;
            }

            var13 = true;
         }

         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl =((Boolean)( var13));
         if (var2 == null) {
            if (IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) {
               long var6 = System.currentTimeMillis();
               long var29;
               int var16 = (var29 = var6 - this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) == 0L
                  ? 0
                  : (var29 < 0L ? -1 : 1);
               if (var2 == null) {
                  if (var16 < 0) {
                     return;
                  }

                  lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var17 = lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.a();
                  short var21 = -7295;
                  var10002 = 4974;
                  var16 = ((var17.c("Held")) ? 1 : 0);
               }

               label145: {
                  if (var2 == null) {
                     if (var16 != 0) {
                        boolean var18 = lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.c().al();
                        if (var2 == null) {
                           if (var18) {
                              me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.n();
                           }

                           var18 = lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.d().al();
                        }

                        if (!var18) {
                           break label145;
                        }

                        me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.o();
                        if (var2 == null) {
                           break label145;
                        }
                     }

                     lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var19 = lllIllIlIIIllIllIlIIlIlIIlIlIIlllIllIIIllllIlIllIIIIIllIlIlIlIllIIIIllIlIIIIllIlIIlll.e();
                     short var22 = -7282;
                     var10002 = 3168;
                     var16 = ((var19.c("Left")) ? 1 : 0);
                  }

                  if (var16 != 0) {
                     me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.n();
                     if (var2 == null) {
                        break label145;
                     }
                  }

                  me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.o();
               }

               this.ag();
               if (var2 == null) {
                  return;
               }
            }

            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
         }

         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0.0;
      }
   }

   @Override
   public void aB() {
      this.ag();
      this.as();
   }

   @Override
   public void aC() {
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
      this.at();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "ð$\u008fÿ\u0000\u0005Ð\u000e¤b1\u0013.ðr\u008f5M~\u0085\u0007\u0015I\u000e#b=\u0095ÓX7\u000f¡_²\u009a7°\u0017 +àã>Ó# vÙÔ\u000e\u0010à\u0000\u001bdøO]\u00041\u009f\u0087\u0091\u0010N§º°êHG\f\u008bd\u0097\rú:v¹\u0005f¶ìÏ\u000b\u0004ZêPµ\u0007y÷Ü\u008dW0á";
      int var4 = "ð$\u008fÿ\u0000\u0005Ð\u000e¤b1\u0013.ðr\u008f5M~\u0085\u0007\u0015I\u000e#b=\u0095ÓX7\u000f¡_²\u009a7°\u0017 +àã>Ó# vÙÔ\u000e\u0010à\u0000\u001bdøO]\u00041\u009f\u0087\u0091\u0010N§º°êHG\f\u008bd\u0097\rú:v¹\u0005f¶ìÏ\u000b\u0004ZêPµ\u0007y÷Ü\u008dW0á"
         .length();
      char var1 = '\f';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 113;
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
                     case 0 -> 94;
                     case 1 -> 70;
                     case 2 -> 24;
                     case 3 -> 88;
                     case 4 -> 119;
                     case 5 -> 111;
                     default -> 41;
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllIllIIlllllIIIIIIlIIllllllIlIIIlIlllIIlIIlllIIllIlllIlIllIIlIIllIlIllIIIIllIlIIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new lllIllIIlllllIIIIIIlIIllllllIlIIIlIlllIIlIIlllIIllIlllIlIllIIlIIllIlIllIIIIllIlIIIIII();
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

                  var2 = "ö\u0018°®\u0004Ð5ú\u001b";
                  var4 = "ö\u0018°®\u0004Ð5ú\u001b".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 127;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -7290) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 251;
            case 1 -> 156;
            case 2 -> 244;
            case 3 -> 193;
            case 4 -> 188;
            case 5 -> 56;
            case 6 -> 48;
            case 7 -> 33;
            case 8 -> 249;
            case 9 -> 206;
            case 10 -> 76;
            case 11 -> 8;
            case 12 -> 124;
            case 13 -> 229;
            case 14 -> 135;
            case 15 -> 250;
            case 16 -> 111;
            case 17 -> 4;
            case 18 -> 221;
            case 19 -> 196;
            case 20 -> 41;
            case 21 -> 200;
            case 22 -> 239;
            case 23 -> 13;
            case 24 -> 31;
            case 25 -> 235;
            case 26 -> 14;
            case 27 -> 22;
            case 28 -> 166;
            case 29 -> 122;
            case 30 -> 109;
            case 31 -> 164;
            case 32 -> 26;
            case 33 -> 184;
            case 34 -> 15;
            case 35 -> 34;
            case 36 -> 73;
            case 37 -> 191;
            case 38 -> 95;
            case 39 -> 86;
            case 40 -> 203;
            case 41 -> 75;
            case 42 -> 218;
            case 43 -> 240;
            case 44 -> 234;
            case 45 -> 228;
            case 46 -> 158;
            case 47 -> 45;
            case 48 -> 53;
            case 49 -> 66;
            case 50 -> 47;
            case 51 -> 246;
            case 52 -> 78;
            case 53 -> 120;
            case 54 -> 169;
            case 55 -> 96;
            case 56 -> 172;
            case 57 -> 145;
            case 58 -> 174;
            case 59 -> 150;
            case 60 -> 17;
            case 61 -> 16;
            case 62 -> 233;
            case 63 -> 143;
            case 64 -> 102;
            case 65 -> 58;
            case 66 -> 139;
            case 67 -> 123;
            case 68 -> 79;
            case 69 -> 24;
            case 70 -> 93;
            case 71 -> 115;
            case 72 -> 223;
            case 73 -> 42;
            case 74 -> 85;
            case 75 -> 146;
            case 76 -> 9;
            case 77 -> 159;
            case 78 -> 178;
            case 79 -> 148;
            case 80 -> 97;
            case 81 -> 52;
            case 82 -> 215;
            case 83 -> 67;
            case 84 -> 177;
            case 85 -> 1;
            case 86 -> 29;
            case 87 -> 241;
            case 88 -> 54;
            case 89 -> 129;
            case 90 -> 30;
            case 91 -> 108;
            case 92 -> 50;
            case 93 -> 57;
            case 94 -> 187;
            case 95 -> 112;
            case 96 -> 181;
            case 97 -> 153;
            case 98 -> 2;
            case 99 -> 252;
            case 100 -> 224;
            case 101 -> 60;
            case 102 -> 11;
            case 103 -> 236;
            case 104 -> 80;
            case 105 -> 208;
            case 106 -> 125;
            case 107 -> 77;
            case 108 -> 59;
            case 109 -> 19;
            case 110 -> 243;
            case 111 -> 103;
            case 112 -> 113;
            case 113 -> 171;
            case 114 -> 231;
            case 115 -> 214;
            case 116 -> 128;
            case 117 -> 7;
            case 118 -> 255;
            case 119 -> 55;
            case 120 -> 226;
            case 121 -> 74;
            case 122 -> 61;
            case 123 -> 127;
            case 124 -> 210;
            case 125 -> 147;
            case 126 -> 242;
            case 127 -> 182;
            case 128 -> 110;
            case 129 -> 194;
            case 130 -> 162;
            case 131 -> 65;
            case 132 -> 99;
            case 133 -> 82;
            case 134 -> 63;
            case 135 -> 38;
            case 136 -> 202;
            case 137 -> 248;
            case 138 -> 167;
            case 139 -> 209;
            case 140 -> 179;
            case 141 -> 119;
            case 142 -> 131;
            case 143 -> 180;
            case 144 -> 51;
            case 145 -> 132;
            case 146 -> 18;
            case 147 -> 185;
            case 148 -> 39;
            case 149 -> 12;
            case 150 -> 98;
            case 151 -> 64;
            case 152 -> 168;
            case 153 -> 220;
            case 154 -> 3;
            case 155 -> 211;
            case 156 -> 204;
            case 157 -> 138;
            case 158 -> 152;
            case 159 -> 118;
            case 160 -> 137;
            case 161 -> 88;
            case 162 -> 32;
            case 163 -> 130;
            case 164 -> 43;
            case 165 -> 10;
            case 166 -> 35;
            case 167 -> 144;
            case 168 -> 94;
            case 169 -> 91;
            case 170 -> 197;
            case 171 -> 230;
            case 172 -> 87;
            case 173 -> 140;
            case 174 -> 72;
            case 175 -> 81;
            case 176 -> 227;
            case 177 -> 25;
            case 178 -> 175;
            case 179 -> 198;
            case 180 -> 213;
            case 181 -> 186;
            case 182 -> 5;
            case 183 -> 62;
            case 184 -> 254;
            case 185 -> 176;
            case 186 -> 173;
            case 187 -> 100;
            case 188 -> 133;
            case 189 -> 104;
            case 190 -> 136;
            case 191 -> 247;
            case 192 -> 195;
            case 193 -> 183;
            case 194 -> 142;
            case 195 -> 160;
            case 196 -> 106;
            case 197 -> 114;
            case 198 -> 71;
            case 199 -> 68;
            case 200 -> 107;
            case 201 -> 245;
            case 202 -> 46;
            case 203 -> 20;
            case 204 -> 117;
            case 205 -> 232;
            case 206 -> 0;
            case 207 -> 212;
            case 208 -> 116;
            case 209 -> 189;
            case 210 -> 84;
            case 211 -> 199;
            case 212 -> 225;
            case 213 -> 222;
            case 214 -> 149;
            case 215 -> 207;
            case 216 -> 101;
            case 217 -> 165;
            case 218 -> 205;
            case 219 -> 253;
            case 220 -> 49;
            case 221 -> 28;
            case 222 -> 69;
            case 223 -> 192;
            case 224 -> 126;
            case 225 -> 154;
            case 226 -> 37;
            case 227 -> 219;
            case 228 -> 6;
            case 229 -> 90;
            case 230 -> 237;
            case 231 -> 141;
            case 232 -> 89;
            case 233 -> 70;
            case 234 -> 83;
            case 235 -> 190;
            case 236 -> 121;
            case 237 -> 105;
            case 238 -> 170;
            case 239 -> 161;
            case 240 -> 134;
            case 241 -> 163;
            case 242 -> 92;
            case 243 -> 157;
            case 244 -> 238;
            case 245 -> 151;
            case 246 -> 217;
            case 247 -> 216;
            case 248 -> 155;
            case 249 -> 36;
            case 250 -> 44;
            case 251 -> 21;
            case 252 -> 27;
            case 253 -> 40;
            case 254 -> 201;
            default -> 23;
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
