package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IllIlIIIIlIllIIIlIIIIlIlIIIIlIIllIIlIlllllllIllIlllIIIlllIIlllIIIIIllIlIIllllIIllIlll
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static IllIlIIIIlIllIIIlIIIIlIlIIIIlIIllIIlIlllllllIllIlllIIIlllIIlllIIIIIllIlIIllllIIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static IllIlIIIIlIllIIIlIIIIlIlIIIIlIIllIIlIlllllllIllIlllIIIlllIIlllIIIIIllIlIIllllIIllIlll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] f;
   private static String[] g;

   private IllIlIIIIlIllIIIlIIIIlIlIIIIlIIllIIlIlllllllIllIlllIIIlllIIlllIIIIIllIlIIllllIIllIlll() {
      short var10001 = -15010;
      short var10002 = -161;
      var10002 = -15032;
      short var10003 = -6509;
      short var10004 = -15035;
      short var10005 = 22338;
      super(
         "Obsidian Debugger",
         "Dumps obsidian detection data in 20x20 area when enabled",
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "Dev Modules"
      );
   }

   @Override
   public void aB() {
      lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.r();
      super.aB();
      this.ag();
      this.a(false);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            "i80T8b"
         );
      }
   }

   private final BlockPos a(Vec3 var1) {
      return new BlockPos((int)Math.floor(var1.x), (int)Math.floor(var1.y), (int)Math.floor(var1.z));
   }

   private final void ag() {
      byte var209 = 0; // PX-FIX
      int var160 = 0; // PX-FIX
      Object var146 = null; // PX-FIX
      Object var140 = null; // PX-FIX
      int var138 = 0; // PX-FIX
      String var10000 = lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.r();
      ClientLevel var2 = this.ap().level;
      String var1 = var10000;
      LocalPlayer var3 = this.ap().player;
      if (var1 == null) {
         if (var2 != null && var3 != null) {
            Vec3 var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
            short var120 = -15015;
            short var186 = 414;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§e========== OBSIDIAN DEBUG DUMP =========="
            );
            short var121 = -14997;
            var186 = 4126;
            String var6 = "%.1f";
            Object[] var7 = new Object[]{var4.x};
            var10000 = String.format(var6, Arrays.copyOf(var7, var7.length));
            short var10002 = -14991;
            short var10003 = 5291;
            Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
            var186 = -15005;
            var10002 = 7709;
            var6 = "%.1f";
            var7 = new Object[]{var4.y};
            String var189 = String.format(var6, Arrays.copyOf(var7, var7.length));
            var10003 = -15030;
            short var10004 = -7737;
            Intrinsics.checkNotNullExpressionValue(var189, "format(...)");
            var10002 = -15005;
            var10003 = 7709;
            var6 = "%.1f";
            var7 = new Object[]{var4.z};
            String var241 = String.format(var6, Arrays.copyOf(var7, var7.length));
            var10004 = -15030;
            short var10005 = -7737;
            Intrinsics.checkNotNullExpressionValue(var241, "format(...)");
            String var35 = var241;
            String var36 = var189;
            String var37 = var10000;
            short var123 = -15023;
            var186 = 32144;
            var10002 = -14980;
            var10003 = 26163;
            var10004 = -15034;
            var10005 = -4690;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§ePlayer Pos: [" + var37 + ", " + var36 + ", " + var35 + "]"
            );
            short var124 = -15005;
            var186 = 7709;
            var6 = "%.1f";
            var7 = new Object[]{var3.getYRot()};
            var10000 = String.format(var6, Arrays.copyOf(var7, var7.length));
            var10002 = -15030;
            var10003 = -7737;
            Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
            var186 = -15020;
            var10002 = 20596;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§ePlayer Yaw: " + var10000);
            short var126 = -15027;
            lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI var5 = new lIIIIllIIIlIIIlllIlllIIlIIIlIlIIllIIllIllIlIIIIlIllIIlIIllllllIllIIlIIIlIlIllIllllllI(
               var3.getYRot()
            );
            var186 = 29440;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e");
            short var127 = -14986;
            var186 = -31630;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§eDirection Vectors:");
            short var128 = -15000;
            var186 = 32493;
            String var55 = "%.2f";
            Object[] var8 = new Object[]{var5.b().x};
            var10000 = String.format(var55, Arrays.copyOf(var8, var8.length));
            var10002 = -15030;
            var10003 = -7737;
            Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
            var186 = -14979;
            var10002 = 31794;
            String var56 = "%.2f";
            var8 = new Object[]{var5.b().z};
            String var197 = String.format(var56, Arrays.copyOf(var8, var8.length));
            var10003 = -15030;
            var10004 = -7737;
            Intrinsics.checkNotNullExpressionValue(var197, "format(...)");
            var10002 = -15036;
            var10003 = -26262;
            var10003 = -15034;
            var10004 = -4690;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§e  Forward: [" + var10000 + ", " + var197 + "]"
            );
            short var130 = -14979;
            var186 = 31794;
            String var57 = "%.2f";
            var8 = new Object[]{var5.c().x};
            var10000 = String.format(var57, Arrays.copyOf(var8, var8.length));
            var10002 = -15030;
            var10003 = -7737;
            Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
            var186 = -14979;
            var10002 = 31794;
            String var58 = "%.2f";
            var8 = new Object[]{var5.c().z};
            String var200 = String.format(var58, Arrays.copyOf(var8, var8.length));
            var10003 = -15030;
            var10004 = -7737;
            Intrinsics.checkNotNullExpressionValue(var200, "format(...)");
            var10002 = -15038;
            var10003 = 26687;
            var10003 = -15034;
            var10004 = -4690;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§e  Left: [" + var10000 + ", " + var200 + "]"
            );
            short var132 = -14979;
            var186 = 31794;
            String var59 = "%.2f";
            var8 = new Object[]{var5.d().x};
            var10000 = String.format(var59, Arrays.copyOf(var8, var8.length));
            var10002 = -15030;
            var10003 = -7737;
            Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
            var186 = -14979;
            var10002 = 31794;
            String var60 = "%.2f";
            var8 = new Object[]{var5.d().z};
            String var203 = String.format(var60, Arrays.copyOf(var8, var8.length));
            var10003 = -15030;
            var10004 = -7737;
            Intrinsics.checkNotNullExpressionValue(var203, "format(...)");
            var10002 = -14987;
            var10003 = -18739;
            var10003 = -15034;
            var10004 = -4690;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§e  Right: [" + var10000 + ", " + var203 + "]"
            );
            short var134 = -14979;
            var186 = 31794;
            String var61 = "%.2f";
            var8 = new Object[]{var5.e().x};
            var10000 = String.format(var61, Arrays.copyOf(var8, var8.length));
            var10002 = -15030;
            var10003 = -7737;
            Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
            var186 = -14979;
            var10002 = 31794;
            String var62 = "%.2f";
            var8 = new Object[]{var5.e().z};
            String var206 = String.format(var62, Arrays.copyOf(var8, var8.length));
            var10003 = -15030;
            var10004 = -7737;
            Intrinsics.checkNotNullExpressionValue(var206, "format(...)");
            var10002 = -14993;
            var10003 = 12186;
            var10003 = -15034;
            var10004 = -4690;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§e  Backward: [" + var10000 + ", " + var206 + "]"
            );
            short var136 = -15022;
            byte var51 = 10;
            var186 = -6129;
            int var63 = 0;
            ArrayList var71 = new ArrayList();
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e");
            short var137 = -15019;
            var186 = 3544;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§eScanning 20x20 area at heights y+1, y+2, y+3..."
            );
            int var9 = 1;

            while (true) {
               if (var9 < 4) {
                  int var10 = -var51;
                  if (var1 == null) {
                     var138 = var10;
                     if (var1 != null) {
                        break;
                     }

                     if (var10 <= var51) {
                        do {
                           label372: {
                              label414: {
                                 int var11 = -var51;
                                 if (var11 <= var51) {
                                    do {
                                       Vec3 var139 = var4.add(var10, var9, var11);
                                       var10002 = -14989;
                                       var10003 = 13471;
                                       Intrinsics.checkNotNullExpressionValue(var139, "add(...)");
                                       Vec3 var12 = var139;
                                       var140 = Intrinsics.areEqual(var2.getBlockState(this.a(var12)).getBlock(), Blocks.OBSIDIAN);
                                       if (var1 != null) {
                                          break label414;
                                       }

                                       label366: {
                                          if (!((Boolean)var140)) {
                                             var71.add(var12);
                                             var140 = var63++;
                                             if (var1 != null) {
                                                break label366;
                                             }
                                          }

                                          var140 = var11;
                                       }

                                       var209 = var51;
                                       if (var1 != null) {
                                          break label372;
                                       }

                                       if ((Boolean)var140 == ((var51 == 0))) {
                                          break;
                                       }

                                       var11++;
                                    } while (var1 == null);
                                 }

                                 var140 = var10;
                              }

                              var209 = var51;
                           }

                           if ((Boolean)var140 == ((var209 == 0))) {
                              break;
                           }

                           var10++;
                        } while (var1 == null);
                     }

                     var9++;
                  }

                  if (var1 == null) {
                     continue;
                  }
               }

               short var141 = -15022;
               var186 = -6129;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e");
               var186 = -14978;
               var10002 = -16008;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§eTotal Obsidian Found: §a" + var63
               );
               var138 = ((var71.isEmpty()) ? 1 : 0);
               break;
            }

            if (var1 == null) {
               if (var138 != 0) {
                  short var185 = -15033;
                  var186 = -19751;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§cNo obsidian found in scan area!"
                  );
                  return;
               }

               var9 = 0;
               var138 = 0;
            }

            int var72 = var138;
            int var73 = 0;
            int var74 = 0;
            Iterator var142 = var71.iterator();
            var10002 = -15002;
            var10003 = 31243;
            Intrinsics.checkNotNullExpressionValue(var142, "iterator(...)");
            Iterator var13 = var142;

            while (true) {
               if (var13.hasNext()) {
                  var10000 = (String)var13.next();
                  var10002 = -15039;
                  var10003 = -11185;
                  Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                  Vec3 var14 = (Vec3)(Object)var10000;
                  Vec3 var144 = var14.subtract(var4);
                  var10002 = -14985;
                  var10003 = 12223;
                  Intrinsics.checkNotNullExpressionValue(var144, "subtract(...)");
                  Vec3 var15 = var144;
                  Vec3 var145 = new Vec3(var15.x, 0.0, var15.z).normalize();
                  var10002 = -14999;
                  var10003 = -3296;
                  Intrinsics.checkNotNullExpressionValue(var145, "normalize(...)");
                  Vec3 var16 = var145;
                  double var17 = var16.dot(var5.c());
                  double var19 = var16.dot(var5.d());
                  double var21 = var16.dot(var5.b());
                  double var23 = var16.dot(var5.e());
                  double[] var27 = new double[]{var19, var21, var23};
                  double var25 = ComparisonsKt.maxOf(var17, var27);
                  double var375;
                  var146 = (var375 = var25 - var17) == 0.0 ? 0 : (var375 < 0.0 ? -1 : 1);
                  if (var1 != null) {
                     break;
                  }

                  if (var1 == null) {
                     var146 =((Boolean)(Object)( (Boolean)var146 ? 1 : 0));
                  }

                  if (!((Boolean)var146)) {
                     var9++;
                     if (var1 == null) {
                        continue;
                     }
                  }

                  double var376;
                  int var147 = (var376 = var25 - var19) == 0.0 ? 0 : (var376 < 0.0 ? -1 : 1);
                  if (var1 == null) {
                     var147 = (((var147 == 0) ? 1 : 0));
                  }

                  if ((var147 != 0)) {
                     var72++;
                     if (var1 == null) {
                        continue;
                     }
                  }

                  double var377;
                  int var148 = (var377 = var25 - var21) == 0.0 ? 0 : (var377 < 0.0 ? -1 : 1);
                  if (var1 == null) {
                     var148 = (((var148 == 0) ? 1 : 0));
                  }

                  if ((var148 != 0)) {
                     var73++;
                     if (var1 == null) {
                        continue;
                     }
                  }

                  double var378;
                  int var149 = (var378 = var25 - var23) == 0.0 ? 0 : (var378 < 0.0 ? -1 : 1);
                  if (var1 == null) {
                     var149 = (((var149 == 0) ? 1 : 0));
                  }

                  if ((var149 == 0)) {
                     continue;
                  }

                  var74++;
                  if (var1 == null) {
                     continue;
                  }
               }

               short var150 = -15022;
               var186 = -6129;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e");
               short var151 = -15013;
               var186 = 14465;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§eObsidian by Direction (using dot product):"
               );
               var186 = -15007;
               var10002 = -31652;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e  Forward: §b" + var73);
               var186 = -15004;
               var10002 = -14379;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e  Left: §a" + var9);
               var186 = -15012;
               var10002 = 22874;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e  Right: §c" + var72);
               var186 = -14988;
               var10002 = -31594;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e  Backward: §d" + var74);
               short var152 = -15022;
               var186 = -6129;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e");
               short var153 = -14977;
               var186 = -17281;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§eFirst 10 Obsidian Blocks (relative to player):"
               );
               var146 = 0;
               break;
            }

            int var75 =((Integer)( var146));
            int var77 = 10;
            int var80 = var71.size();
            int var76 = Math.min(var77, var80);

            while (true) {
               if (var75 < var76) {
                  var10000 = (String)var71.get(var75);
                  var10002 = -15003;
                  var10003 = 28224;
                  Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
                  Vec3 var78 = (Vec3)(Object)var10000;
                  Vec3 var155 = var78.subtract(var4);
                  var10002 = -14995;
                  var10003 = 6945;
                  Intrinsics.checkNotNullExpressionValue(var155, "subtract(...)");
                  Vec3 var81 = var155;
                  var186 = -15005;
                  var10002 = 7709;
                  String var18 = "%.1f";
                  Object[] var87 = new Object[]{var81.x};
                  String var221 = String.format(var18, Arrays.copyOf(var87, var87.length));
                  var10003 = -15030;
                  var10004 = -7737;
                  Intrinsics.checkNotNullExpressionValue(var221, "format(...)");
                  var10002 = -15005;
                  var10003 = 7709;
                  var18 = "%.1f";
                  var87 = new Object[]{var81.y};
                  String var271 = String.format(var18, Arrays.copyOf(var87, var87.length));
                  var10004 = -15030;
                  var10005 = -7737;
                  Intrinsics.checkNotNullExpressionValue(var271, "format(...)");
                  var10003 = -15005;
                  var10004 = 7709;
                  var18 = "%.1f";
                  var87 = new Object[]{var81.z};
                  String var327 = String.format(var18, Arrays.copyOf(var87, var87.length));
                  var10005 = -15030;
                  short var10006 = -7737;
                  Intrinsics.checkNotNullExpressionValue(var327, "format(...)");
                  String var38 = var327;
                  String var39 = var271;
                  String var40 = var221;
                  short var156 = -15037;
                  var186 = 21783;
                  var10002 = -14992;
                  var10003 = 3937;
                  var10004 = -15034;
                  var10005 = -4690;
                  var10006 = -15034;
                  short var10007 = -4690;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§e  [" + var75 + "] Offset: [" + var40 + ", " + var39 + ", " + var38 + "]"
                  );
                  var75++;
                  if (var1 != null) {
                     break;
                  }

                  if (var1 == null) {
                     continue;
                  }
               }

               short var157 = -15022;
               var186 = -6129;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e");
               short var158 = -15014;
               var186 = 31828;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§eTesting 8-Direction Vector Scanning (1-8 blocks out):"
               );
               var75 = 0;
               var76 = 0;
               break;
            }

            var77 = 0;
            var80 = 0;
            int var83 = 0;
            int var86 = 0;
            int var90 = 0;
            int var20 = 0;
            int var91 = 1;

            label305:
            while (true) {
               int var159 = var91;

               label302:
               while (var159 < 4) {
                  Vec3 var22 = new Vec3(0.0, var91, 0.0);
                  var160 = 1;
                  if (var1 != null) {
                     break label305;
                  }

                  int var94 = 1;

                  while (var94 < 9) {
                     Vec3 var24 = null;
                     Vec3 var161 = var4.add(var22);
                     var10002 = -15028;
                     var10003 = 8710;
                     Intrinsics.checkNotNullExpressionValue(var161, "add(...)");
                     var24 = var161;
                     var159 = 0;
                     if (var1 != null) {
                        continue label302;
                     }

                     int var97 = 0;

                     while (true) {
                        if (var97 < var94) {
                           boolean var102 = false;
                           Vec3 var162 = var24.add(var5.c());
                           var10002 = -15028;
                           var10003 = 8710;
                           Intrinsics.checkNotNullExpressionValue(var162, "add(...)");
                           var24 = var162;
                           var97++;
                           if (var1 != null) {
                              break;
                           }

                           if (var1 == null) {
                              continue;
                           }
                        }

                        if (var1 == null && Intrinsics.areEqual(var2.getBlockState(this.a(var24)).getBlock(), Blocks.OBSIDIAN)) {
                           var75++;
                        }
                        break;
                     }

                     Object var98 = null;
                     Vec3 var163 = var4.add(var22);
                     var10002 = -15028;
                     var10003 = 8710;
                     Intrinsics.checkNotNullExpressionValue(var163, "add(...)");
                     Vec3 var99 = var163;
                     int var26 = 0;

                     while (true) {
                        if (var26 < var94) {
                           boolean var28 = false;
                           Vec3 var164 = var99.add(var5.d());
                           var10002 = -15028;
                           var10003 = 8710;
                           Intrinsics.checkNotNullExpressionValue(var164, "add(...)");
                           var99 = var164;
                           var26++;
                           if (var1 != null) {
                              break;
                           }

                           if (var1 == null) {
                              continue;
                           }
                        }

                        if (var1 == null && Intrinsics.areEqual(var2.getBlockState(this.a(var99)).getBlock(), Blocks.OBSIDIAN)) {
                           var76++;
                        }
                        break;
                     }

                     Object var100 = null;
                     Vec3 var165 = var4.add(var22);
                     var10002 = -15028;
                     var10003 = 8710;
                     Intrinsics.checkNotNullExpressionValue(var165, "add(...)");
                     Vec3 var101 = var165;
                     int var103 = 0;

                     while (true) {
                        if (var103 < var94) {
                           boolean var29 = false;
                           Vec3 var166 = var101.add(var5.b());
                           var10002 = -15028;
                           var10003 = 8710;
                           Intrinsics.checkNotNullExpressionValue(var166, "add(...)");
                           var101 = var166;
                           var103++;
                           if (var1 != null) {
                              break;
                           }

                           if (var1 == null) {
                              continue;
                           }
                        }

                        if (var1 == null && Intrinsics.areEqual(var2.getBlockState(this.a(var101)).getBlock(), Blocks.OBSIDIAN)) {
                           var77++;
                        }
                        break;
                     }

                     Object var104 = null;
                     Vec3 var167 = var4.add(var22);
                     var10002 = -15028;
                     var10003 = 8710;
                     Intrinsics.checkNotNullExpressionValue(var167, "add(...)");
                     Vec3 var105 = var167;
                     int var106 = 0;

                     while (true) {
                        if (var106 < var94) {
                           boolean var30 = false;
                           Vec3 var168 = var105.add(var5.e());
                           var10002 = -15028;
                           var10003 = 8710;
                           Intrinsics.checkNotNullExpressionValue(var168, "add(...)");
                           var105 = var168;
                           var106++;
                           if (var1 != null) {
                              break;
                           }

                           if (var1 == null) {
                              continue;
                           }
                        }

                        if (var1 == null && Intrinsics.areEqual(var2.getBlockState(this.a(var105)).getBlock(), Blocks.OBSIDIAN)) {
                           var80++;
                        }
                        break;
                     }

                     Object var107 = null;
                     Vec3 var169 = var4.add(var22);
                     var10002 = -15028;
                     var10003 = 8710;
                     Intrinsics.checkNotNullExpressionValue(var169, "add(...)");
                     Vec3 var108 = var169;
                     int var109 = 0;

                     while (true) {
                        if (var109 < var94) {
                           boolean var31 = false;
                           Vec3 var170 = var108.add(var5.b()).add(var5.c());
                           var10002 = -15028;
                           var10003 = 8710;
                           Intrinsics.checkNotNullExpressionValue(var170, "add(...)");
                           var108 = var170;
                           var109++;
                           if (var1 != null) {
                              break;
                           }

                           if (var1 == null) {
                              continue;
                           }
                        }

                        if (var1 == null && Intrinsics.areEqual(var2.getBlockState(this.a(var108)).getBlock(), Blocks.OBSIDIAN)) {
                           var83++;
                        }
                        break;
                     }

                     Object var110 = null;
                     Vec3 var171 = var4.add(var22);
                     var10002 = -15028;
                     var10003 = 8710;
                     Intrinsics.checkNotNullExpressionValue(var171, "add(...)");
                     Vec3 var111 = var171;
                     int var112 = 0;

                     while (true) {
                        if (var112 < var94) {
                           boolean var32 = false;
                           Vec3 var172 = var111.add(var5.b()).add(var5.d());
                           var10002 = -15028;
                           var10003 = 8710;
                           Intrinsics.checkNotNullExpressionValue(var172, "add(...)");
                           var111 = var172;
                           var112++;
                           if (var1 != null) {
                              break;
                           }

                           if (var1 == null) {
                              continue;
                           }
                        }

                        if (var1 == null && Intrinsics.areEqual(var2.getBlockState(this.a(var111)).getBlock(), Blocks.OBSIDIAN)) {
                           var86++;
                        }
                        break;
                     }

                     Object var113 = null;
                     Vec3 var173 = var4.add(var22);
                     var10002 = -15028;
                     var10003 = 8710;
                     Intrinsics.checkNotNullExpressionValue(var173, "add(...)");
                     Vec3 var114 = var173;
                     int var115 = 0;

                     while (true) {
                        if (var115 < var94) {
                           boolean var33 = false;
                           Vec3 var174 = var114.add(var5.e()).add(var5.c());
                           var10002 = -15028;
                           var10003 = 8710;
                           Intrinsics.checkNotNullExpressionValue(var174, "add(...)");
                           var114 = var174;
                           var115++;
                           if (var1 != null) {
                              break;
                           }

                           if (var1 == null) {
                              continue;
                           }
                        }

                        if (var1 == null && Intrinsics.areEqual(var2.getBlockState(this.a(var114)).getBlock(), Blocks.OBSIDIAN)) {
                           var90++;
                        }
                        break;
                     }

                     Object var116 = null;
                     Vec3 var175 = var4.add(var22);
                     var10002 = -15028;
                     var10003 = 8710;
                     Intrinsics.checkNotNullExpressionValue(var175, "add(...)");
                     Vec3 var117 = var175;
                     int var118 = 0;

                     while (true) {
                        if (var118 < var94) {
                           boolean var34 = false;
                           Vec3 var176 = var117.add(var5.e()).add(var5.d());
                           var10002 = -15028;
                           var10003 = 8710;
                           Intrinsics.checkNotNullExpressionValue(var176, "add(...)");
                           var117 = var176;
                           var118++;
                           if (var1 != null) {
                              break;
                           }

                           if (var1 == null) {
                              continue;
                           }
                        }

                        if (var1 == null && Intrinsics.areEqual(var2.getBlockState(this.a(var117)).getBlock(), Blocks.OBSIDIAN)) {
                           var20++;
                        }

                        var94++;
                        break;
                     }

                     if (var1 != null) {
                        break;
                     }
                  }

                  var91++;
                  if (var1 == null) {
                     continue label305;
                  }
                  break;
               }

               var91 = var75 + var76 + var77 + var80 + var83 + var86 + var90 + var20;
               short var177 = -15001;
               var186 = 24568;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e  Cardinal Directions:");
               short var178 = -15025;
               var186 = 20108;
               var10002 = -15017;
               var10003 = -11091;
               var10004 = -14998;
               var10005 = -30655;
               short var373 = -15026;
               short var374 = 16396;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§e    Left: §a" + var75 + " §e| Right: §c" + var76 + " §e| Forward: §b" + var77 + " §e| Backward: §d" + var80
               );
               short var179 = -15009;
               var186 = 17107;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e  Diagonal Directions:");
               var10002 = -15021;
               var10003 = -29952;
               var10003 = -14994;
               var10004 = -18768;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§e    Forward-Left: §2" + var83 + " §e| Forward-Right: §4" + var86
               );
               var10002 = -15016;
               var10003 = 6709;
               var10003 = -15018;
               var10004 = 5556;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§e    Backward-Left: §5" + var90 + " §e| Backward-Right: §6" + var20
               );
               var186 = -15040;
               var10002 = -3438;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                  "§e  Total (8-Dir): §f" + var91
               );
               var160 = var75 + var83 + var90;
               break;
            }

            int var93 = var160;
            short var180 = -15022;
            int var95 = var76 + var86 + var20 + var80;
            var186 = -6129;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§e");
            short var181 = -14990;
            var186 = -21560;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§eBot Decision Logic:");
            var186 = -15024;
            var10002 = -13529;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§e  Left Total (L+FL+BL): §a" + var93
            );
            var186 = -15008;
            var10002 = 18334;
            var10000 = "§e  Right Total (R+FR+BR+B): §c" + var95;
            if (var1 == null) {
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var10000);
               var10000 = var93 > var95 ? "a" : "c";
            }

            String var234;
            if (var93 > var95) {
               var186 = -15029;
               var10002 = -11013;
               var234 = "LEFT";
            } else {
               var186 = -15011;
               var10002 = 29554;
               var234 = "RIGHT";
            }

            String var46 = var234;
            String var47 = var10000;
            short var183 = -15006;
            var186 = 20087;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§e  Would mine: §" + var47 + var46
            );
            short var184 = -15031;
            var186 = -15680;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§e========================================"
            );
            return;
         }

         short var119 = -14996;
         short var10001 = -15809;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cNot in world!");
      }
   }

   @NotNull
   public static final IllIlIIIIlIllIIIlIIIIlIlIIIIlIIllIIlIlllllllIllIlllIIIlllIIlllIIIIIllIlIIllllIIllIlll ah() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[60];
      int var3 = 0;
      String var2 = "\u0080\u0082á0Wmg×\u0019\u000f8\u000eðÝ&Û8\u0010özòïþe7\u0087!h¹[ÞR\u0016\u0001¾\u0016åf«Æ\u0015\u0090\u0098\u0086vñm²jCÖ¦8\u0095gýËÜ\u00adí\u0002à\u0011\t^î[éªÉ[qØ\u0015ÔÊ¢9ºLðçùÚ\u007fÙÏM\u0095f\u0094C \u0092K\u0005ýÁ\u0087X\u0011\u000b\u001d¼\u009b÷\u0085\u009f\u001eÃ\"éë\u0002K8\bo2\u008f\u000f©Âý\u0017\u000e\u008f³É\u0016£æ\u0011\u0010ðô\u0007Ú\u001a\u0013\u0011+äo:\u009aÖ\u001b>4ôhë\u0004vÅe³*o\u0093È\u000f f®æ\u00030N?NMã\u007f\u0090Á+¿ÏÝ/WËÓþÐõÌR·sqÄ\u0004Nlç´{<8\u008eV;èJc6§Fø8¬®²5à¬\t§\u0098Døl~¦\u0096±C\u0097Ã\u009d»IÆ0Ys'³-\u0000\u0080Ð\u0088kÔ\u000f±\u0005}\u009bL;6\fN\u0004õ)v\u0015\u000bi:¾!\u0014°êO/g®1\u0083B;k¡,\u001aÂÿ0õ!\u008a%Ø\u0092\u0004\u008cH\u0099YWvñ*2$G§µ@)La\u008bÆb¤\u0015\u0005æÏ\u0005Xäçb§\u0084\u000eÅgðÀ» R½Ò\u0099\u0096¨\u0085¡\u000eVÄÀ>oF\u00ad:èóË:\u0083\r\u0017Ù\u00831ÖQKb\u008d\u001b\u0082\u008d%¸¸ \u00870UgÕ;í\u0004\u000f`«DY-\u0093\u0080Û\u0088\\Ó<â·÷\u001c'=ÜÇm\u0099\u0003\u0003\u009b\u0085±\u0084õ\u000b^Ùè´\u0000´¨\u009cfûºÍ\u00adñ\u0016×¤ÂôÂº7\u0091k\u008c¹ä>\u0080î\u008c5¥¨NÂR\u0002¯z\u00054\u001c\u0092\"7\rT©²U¾Ç¥Y:?\u0014£å\u0018?Pßj\u0005 \u0000ªSû\u0000.MmibG\u009aË\u0015á\u0005¼r\u0011\u0011`¼ÂpU\u008a\rM\ra\u0091°v'QV+_DÎõà9¶\r\u0000M.\u0090_Ê\u0000Ý\bO¶DõL\f£\u0086R½\u0098Ñ\u0013ðDDÏ\u009cÓE\u0096\u0086ëW×À\u0017°c.\f_¥\u0080|\bâð¥Õ\u0090&ÇbÒoê:\n',«\u009c\"±\u000fQ\u0095\u008aJ0\u00adYÈ(\u00869%\u008felÇ\u0095£[v¤°+è7Õ\u0080o¬B\u0092o\b<h,¯.D7ßù·\u001aÅÞÁÂj\u0090w\u0085µ\\\u0085Û¤Ol\\ª¤Ñ\u009eLðÉ\u009b\u0016mÎ|&\u008c\u0003Ñ2òlÕ\u00ad\u0098\u0090?\u0011/>,¶.ÕßÅ\u0097X\bKCÝ\u0000ñ#ö+\f8È?y\u0011N\u008cùp®]\u000e\u0018BSp\n÷$ª qÉ\u0082h\u001d¥c{\u0006¹ãqä\u0089\u001cã\rhægÝÚÓt\u007fU¶ \u008dæ\u000f\u0085S\u0088\ní*L=¥\u0007\u0014xjØ\u0086\u001ffñô^v¦¼u\u0019 \u0004Á\nÖZÆÉ'¡\u009a%{\u008f8YÃlE,\u0003\u0089\u0004äÒg^\u0011û,Gå\u0005×e\u0099b¹@ä\u0086°Ä\u008e\t\rîÞéýÿ\u0004\u00ad4ã\u0019öx<\u000f\u001d`õåÓ>ä\u0000\u0089\u009fó\u0086°\u0085[\u000fòqfN4¬â>UëÈÊ?\u009cL\u0016°\r\u001c\u0007ôuØß\u009fí\u0091\n\u0003ö\fÐæl\u001dwts\u000e%O>\u008f\u0004}©¹eaÂ±½ù\u0004ÛC\u0083l\u0004²\u009b\u00adw\u0010P\"\u0000âwÉ¨H\u0091\u001fPT,OÒÞ\fî)åETÅø\u0019\u00917a^\u0010Ü0£f\u008c©õ\u009e·ÿ\u0094H´ÌÁ¨\r¥\u000f\u0080ÇÒC\bÜW\u0004`Ûî\u0014·;ªNuÈü)\u0088û²C\u0083$\u0002Hk\b\u0002'\u000bðR\u008d,r\u0011&{¶á\u009d\u000bÚi©æk%¯@w\u0099A\b4päGÄËP6\u0015¼eÍ\u0083Yò\u0098\u0092Í¹L\u0084Û·Th\u008a&$\f÷\u0004\u008eç)ø\u0002\u008d\u008e";
      int var4 = "\u0080\u0082á0Wmg×\u0019\u000f8\u000eðÝ&Û8\u0010özòïþe7\u0087!h¹[ÞR\u0016\u0001¾\u0016åf«Æ\u0015\u0090\u0098\u0086vñm²jCÖ¦8\u0095gýËÜ\u00adí\u0002à\u0011\t^î[éªÉ[qØ\u0015ÔÊ¢9ºLðçùÚ\u007fÙÏM\u0095f\u0094C \u0092K\u0005ýÁ\u0087X\u0011\u000b\u001d¼\u009b÷\u0085\u009f\u001eÃ\"éë\u0002K8\bo2\u008f\u000f©Âý\u0017\u000e\u008f³É\u0016£æ\u0011\u0010ðô\u0007Ú\u001a\u0013\u0011+äo:\u009aÖ\u001b>4ôhë\u0004vÅe³*o\u0093È\u000f f®æ\u00030N?NMã\u007f\u0090Á+¿ÏÝ/WËÓþÐõÌR·sqÄ\u0004Nlç´{<8\u008eV;èJc6§Fø8¬®²5à¬\t§\u0098Døl~¦\u0096±C\u0097Ã\u009d»IÆ0Ys'³-\u0000\u0080Ð\u0088kÔ\u000f±\u0005}\u009bL;6\fN\u0004õ)v\u0015\u000bi:¾!\u0014°êO/g®1\u0083B;k¡,\u001aÂÿ0õ!\u008a%Ø\u0092\u0004\u008cH\u0099YWvñ*2$G§µ@)La\u008bÆb¤\u0015\u0005æÏ\u0005Xäçb§\u0084\u000eÅgðÀ» R½Ò\u0099\u0096¨\u0085¡\u000eVÄÀ>oF\u00ad:èóË:\u0083\r\u0017Ù\u00831ÖQKb\u008d\u001b\u0082\u008d%¸¸ \u00870UgÕ;í\u0004\u000f`«DY-\u0093\u0080Û\u0088\\Ó<â·÷\u001c'=ÜÇm\u0099\u0003\u0003\u009b\u0085±\u0084õ\u000b^Ùè´\u0000´¨\u009cfûºÍ\u00adñ\u0016×¤ÂôÂº7\u0091k\u008c¹ä>\u0080î\u008c5¥¨NÂR\u0002¯z\u00054\u001c\u0092\"7\rT©²U¾Ç¥Y:?\u0014£å\u0018?Pßj\u0005 \u0000ªSû\u0000.MmibG\u009aË\u0015á\u0005¼r\u0011\u0011`¼ÂpU\u008a\rM\ra\u0091°v'QV+_DÎõà9¶\r\u0000M.\u0090_Ê\u0000Ý\bO¶DõL\f£\u0086R½\u0098Ñ\u0013ðDDÏ\u009cÓE\u0096\u0086ëW×À\u0017°c.\f_¥\u0080|\bâð¥Õ\u0090&ÇbÒoê:\n',«\u009c\"±\u000fQ\u0095\u008aJ0\u00adYÈ(\u00869%\u008felÇ\u0095£[v¤°+è7Õ\u0080o¬B\u0092o\b<h,¯.D7ßù·\u001aÅÞÁÂj\u0090w\u0085µ\\\u0085Û¤Ol\\ª¤Ñ\u009eLðÉ\u009b\u0016mÎ|&\u008c\u0003Ñ2òlÕ\u00ad\u0098\u0090?\u0011/>,¶.ÕßÅ\u0097X\bKCÝ\u0000ñ#ö+\f8È?y\u0011N\u008cùp®]\u000e\u0018BSp\n÷$ª qÉ\u0082h\u001d¥c{\u0006¹ãqä\u0089\u001cã\rhægÝÚÓt\u007fU¶ \u008dæ\u000f\u0085S\u0088\ní*L=¥\u0007\u0014xjØ\u0086\u001ffñô^v¦¼u\u0019 \u0004Á\nÖZÆÉ'¡\u009a%{\u008f8YÃlE,\u0003\u0089\u0004äÒg^\u0011û,Gå\u0005×e\u0099b¹@ä\u0086°Ä\u008e\t\rîÞéýÿ\u0004\u00ad4ã\u0019öx<\u000f\u001d`õåÓ>ä\u0000\u0089\u009fó\u0086°\u0085[\u000fòqfN4¬â>UëÈÊ?\u009cL\u0016°\r\u001c\u0007ôuØß\u009fí\u0091\n\u0003ö\fÐæl\u001dwts\u000e%O>\u008f\u0004}©¹eaÂ±½ù\u0004ÛC\u0083l\u0004²\u009b\u00adw\u0010P\"\u0000âwÉ¨H\u0091\u001fPT,OÒÞ\fî)åETÅø\u0019\u00917a^\u0010Ü0£f\u008c©õ\u009e·ÿ\u0094H´ÌÁ¨\r¥\u000f\u0080ÇÒC\bÜW\u0004`Ûî\u0014·;ªNuÈü)\u0088û²C\u0083$\u0002Hk\b\u0002'\u000bðR\u008d,r\u0011&{¶á\u009d\u000bÚi©æk%¯@w\u0099A\b4päGÄËP6\u0015¼eÍ\u0083Yò\u0098\u0092Í¹L\u0084Û·Th\u008a&$\f÷\u0004\u008eç)ø\u0002\u008d\u008e"
         .length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 16;
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
                     case 1 -> 13;
                     case 2 -> 127;
                     case 3 -> 58;
                     case 4 -> 99;
                     case 5 -> 117;
                     default -> 115;
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
                     g = new String[60];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IllIlIIIIlIllIIIlIIIIlIlIIIIlIIllIIlIlllllllIllIlllIIIlllIIlllIIIIIllIlIIllllIIllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IllIlIIIIlIllIIIlIIIIlIlIIIIlIIllIIlIlllllllIllIlllIIIlllIIlllIIIIIllIlIIllllIIllIlll();
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

                  var2 = "¼\u0007iiï\u009a\u0018C\u0019\u0097=µaÎFq\u000e\u008eÕ<öâj5\u008dä\u0017\u0004\u0099\u0019\u0088¢ºðv\u0012\u0087\u0014\u0092f )6l\u0005\u0080~\u0096\u001a¨\u000fùn«®N\u0095¶\u001f*\u009a¼Ó3\u0081àüiäl\u000eÅâK'";
                  var4 = "¼\u0007iiï\u009a\u0018C\u0019\u0097=µaÎFq\u000e\u008eÕ<öâj5\u008dä\u0017\u0004\u0099\u0019\u0088¢ºðv\u0012\u0087\u0014\u0092f )6l\u0005\u0080~\u0096\u001a¨\u000fùn«®N\u0095¶\u001f*\u009a¼Ó3\u0081àüiäl\u000eÅâK'"
                     .length();
                  var1 = '0';
                  var8 = -1;
            }

            var10000 = 52;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -15035) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 46;
            case 1 -> 199;
            case 2 -> 204;
            case 3 -> 88;
            case 4 -> 182;
            case 5 -> 124;
            case 6 -> 134;
            case 7 -> 247;
            case 8 -> 66;
            case 9 -> 212;
            case 10 -> 226;
            case 11 -> 116;
            case 12 -> 98;
            case 13 -> 107;
            case 14 -> 171;
            case 15 -> 19;
            case 16 -> 118;
            case 17 -> 158;
            case 18 -> 192;
            case 19 -> 203;
            case 20 -> 13;
            case 21 -> 43;
            case 22 -> 73;
            case 23 -> 242;
            case 24 -> 95;
            case 25 -> 23;
            case 26 -> 126;
            case 27 -> 82;
            case 28 -> 117;
            case 29 -> 96;
            case 30 -> 26;
            case 31 -> 237;
            case 32 -> 253;
            case 33 -> 180;
            case 34 -> 152;
            case 35 -> 39;
            case 36 -> 90;
            case 37 -> 141;
            case 38 -> 157;
            case 39 -> 167;
            case 40 -> 232;
            case 41 -> 145;
            case 42 -> 218;
            case 43 -> 0;
            case 44 -> 147;
            case 45 -> 20;
            case 46 -> 160;
            case 47 -> 163;
            case 48 -> 224;
            case 49 -> 188;
            case 50 -> 30;
            case 51 -> 15;
            case 52 -> 159;
            case 53 -> 121;
            case 54 -> 81;
            case 55 -> 127;
            case 56 -> 112;
            case 57 -> 249;
            case 58 -> 40;
            case 59 -> 69;
            case 60 -> 164;
            case 61 -> 227;
            case 62 -> 146;
            case 63 -> 27;
            case 64 -> 3;
            case 65 -> 170;
            case 66 -> 106;
            case 67 -> 18;
            case 68 -> 8;
            case 69 -> 172;
            case 70 -> 217;
            case 71 -> 190;
            case 72 -> 153;
            case 73 -> 235;
            case 74 -> 70;
            case 75 -> 129;
            case 76 -> 254;
            case 77 -> 216;
            case 78 -> 215;
            case 79 -> 24;
            case 80 -> 189;
            case 81 -> 151;
            case 82 -> 176;
            case 83 -> 4;
            case 84 -> 150;
            case 85 -> 41;
            case 86 -> 184;
            case 87 -> 234;
            case 88 -> 213;
            case 89 -> 236;
            case 90 -> 233;
            case 91 -> 10;
            case 92 -> 201;
            case 93 -> 6;
            case 94 -> 102;
            case 95 -> 59;
            case 96 -> 53;
            case 97 -> 178;
            case 98 -> 238;
            case 99 -> 52;
            case 100 -> 246;
            case 101 -> 248;
            case 102 -> 207;
            case 103 -> 50;
            case 104 -> 32;
            case 105 -> 34;
            case 106 -> 51;
            case 107 -> 219;
            case 108 -> 174;
            case 109 -> 148;
            case 110 -> 202;
            case 111 -> 209;
            case 112 -> 243;
            case 113 -> 240;
            case 114 -> 28;
            case 115 -> 76;
            case 116 -> 239;
            case 117 -> 136;
            case 118 -> 221;
            case 119 -> 86;
            case 120 -> 103;
            case 121 -> 195;
            case 122 -> 214;
            case 123 -> 75;
            case 124 -> 154;
            case 125 -> 37;
            case 126 -> 197;
            case 127 -> 62;
            case 128 -> 130;
            case 129 -> 144;
            case 130 -> 194;
            case 131 -> 133;
            case 132 -> 200;
            case 133 -> 149;
            case 134 -> 17;
            case 135 -> 137;
            case 136 -> 222;
            case 137 -> 113;
            case 138 -> 84;
            case 139 -> 58;
            case 140 -> 132;
            case 141 -> 177;
            case 142 -> 230;
            case 143 -> 12;
            case 144 -> 36;
            case 145 -> 255;
            case 146 -> 80;
            case 147 -> 104;
            case 148 -> 92;
            case 149 -> 1;
            case 150 -> 65;
            case 151 -> 83;
            case 152 -> 91;
            case 153 -> 186;
            case 154 -> 21;
            case 155 -> 100;
            case 156 -> 155;
            case 157 -> 142;
            case 158 -> 162;
            case 159 -> 245;
            case 160 -> 94;
            case 161 -> 93;
            case 162 -> 211;
            case 163 -> 108;
            case 164 -> 89;
            case 165 -> 191;
            case 166 -> 11;
            case 167 -> 7;
            case 168 -> 123;
            case 169 -> 135;
            case 170 -> 56;
            case 171 -> 22;
            case 172 -> 179;
            case 173 -> 110;
            case 174 -> 131;
            case 175 -> 168;
            case 176 -> 42;
            case 177 -> 140;
            case 178 -> 33;
            case 179 -> 161;
            case 180 -> 74;
            case 181 -> 114;
            case 182 -> 63;
            case 183 -> 223;
            case 184 -> 228;
            case 185 -> 97;
            case 186 -> 165;
            case 187 -> 185;
            case 188 -> 48;
            case 189 -> 122;
            case 190 -> 85;
            case 191 -> 87;
            case 192 -> 115;
            case 193 -> 193;
            case 194 -> 205;
            case 195 -> 25;
            case 196 -> 128;
            case 197 -> 61;
            case 198 -> 120;
            case 199 -> 229;
            case 200 -> 208;
            case 201 -> 67;
            case 202 -> 16;
            case 203 -> 78;
            case 204 -> 181;
            case 205 -> 183;
            case 206 -> 47;
            case 207 -> 101;
            case 208 -> 54;
            case 209 -> 244;
            case 210 -> 68;
            case 211 -> 38;
            case 212 -> 99;
            case 213 -> 35;
            case 214 -> 71;
            case 215 -> 241;
            case 216 -> 210;
            case 217 -> 173;
            case 218 -> 250;
            case 219 -> 57;
            case 220 -> 156;
            case 221 -> 166;
            case 222 -> 169;
            case 223 -> 29;
            case 224 -> 77;
            case 225 -> 31;
            case 226 -> 206;
            case 227 -> 119;
            case 228 -> 49;
            case 229 -> 198;
            case 230 -> 139;
            case 231 -> 111;
            case 232 -> 79;
            case 233 -> 72;
            case 234 -> 252;
            case 235 -> 125;
            case 236 -> 45;
            case 237 -> 105;
            case 238 -> 225;
            case 239 -> 109;
            case 240 -> 138;
            case 241 -> 9;
            case 242 -> 231;
            case 243 -> 143;
            case 244 -> 2;
            case 245 -> 64;
            case 246 -> 175;
            case 247 -> 55;
            case 248 -> 220;
            case 249 -> 5;
            case 250 -> 14;
            case 251 -> 187;
            case 252 -> 196;
            case 253 -> 60;
            case 254 -> 251;
            default -> 44;
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

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IllIlIIIIlIllIIIlIIIIlIlIIIIlIIllIIlIlllllllIllIlllIIIlllIIlllIIIIIllIlIIllllIIllIlll a() {
         return IllIlIIIIlIllIIIlIIIIlIlIIIIlIIllIIlIlllllllIllIlllIIIlllIIlllIIIIIllIlIIllllIIllIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }
         public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker marker) {
         this();
      }
      public static void b() {
      }
}
      public static final me.octo.client.IllIlIIIIlIllIIIlIIIIlIlIIIIlIIllIIlIlllllllIllIlllIIIlllIIlllIIIIIllIlIIllllIIllIlll ai() {
         return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }
}
