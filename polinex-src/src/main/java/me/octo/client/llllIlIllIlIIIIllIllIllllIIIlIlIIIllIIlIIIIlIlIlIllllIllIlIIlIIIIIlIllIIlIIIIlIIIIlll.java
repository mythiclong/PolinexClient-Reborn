package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class llllIlIllIlIIIIllIllIllllIIIlIlIIIllIIlIIIIlIlIlIllllIllIlIIlIIIIIlIllIIlIIIIlIIIIlll
   implements IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl {
   private static String[] b;
   private static String[] c;

   @Override
   public void a(@NotNull lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      long var69 = 0; // PX-FIX
      Object var65 = null; // PX-FIX
      Object var62 = null; // PX-FIX
      Object var60 = null; // PX-FIX
      Object var52 = null; // PX-FIX
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      short var10002 = 6923;
      short var10003 = 21721;
      Intrinsics.checkNotNullParameter(var1, "context");
      long var3 = 2500L + var1.a(0L, 2500L);
      int[] var2 = var10000;
      long var5 = System.currentTimeMillis();
      if (var2 == null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var7;
         Vec3 var8;
         var7 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         var8 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var7);
         float var88;
         var52 = (var88 = var1.h() - 0.5F) == 0.0F ? 0 : (var88 < 0.0F ? -1 : 1);
         label317:
         if (var2 == null) {
            if (((Boolean)var52)) {
               var52 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b();
               if (var2 != null) {
                  break label317;
               }

               if (((Boolean)(var52))) {
                  var52 = 0;
                  break label317;
               }
            }

            var52 = 1;
         }

         int var9 =((Integer)( var52));
         if (var9 != 0) {
            short var10001 = 6917;
            var10002 = -12791;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sneak", true);
         }

         long var10 = var5;
         long var12 = var9 != 0 ? var5 : 0L;
         long var14 = var5 - 1000L;
         long var16 = var5;
         long var18 = var5;
         long var20 = var5;
         long var22 = 0L;
         int var24 = 0;
         this.b(var1, (var9 != 0), 0L);
         var24 = 1;
         var22 = var5 + 80 + var1.a(0L, 120L);
         this.b(var1);
         var14 = var5;

         while (true) {
            if (System.currentTimeMillis() - var5 < var3) {
               long var25 = System.currentTimeMillis();
               long var27 = var3 - (var25 - var5);
               if (var2 != null) {
                  break;
               }

               long var89;
               int var53 = (var89 = var25 - var16 - 500L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
               if (var2 == null) {
                  if (var53 > 0) {
                     var1.j();
                     var16 = var25;
                  }

                  long var90;
                  var53 = (var90 = var25 - var18 - 150L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
               }

               if (var2 == null) {
                  if (var53 > 0) {
                     label326: {
                        byte var29 = ((byte)((lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a()) ? 1 : 0));
                        int var54 = var29;
                        if (var2 == null) {
                           if (var29 == 0) {
                              break label326;
                           }

                           var54 = var9;
                        }

                        if (var2 == null) {
                           if (var54 != 0) {
                              break label326;
                           }

                           var54 = 1;
                        }

                        var9 = var54;
                        short var73 = 6933;
                        var10002 = -29722;
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a("sneak", true);
                        var12 = var25;
                        var10 = var25;
                     }

                     var18 = var25;
                  }

                  long var91;
                  var53 = (var91 = var25 - var10 - (600 + var1.a(0L, 700L))) == 0L ? 0 : (var91 < 0L ? -1 : 1);
               }

               label327: {
                  if (var2 == null) {
                     if (var53 <= 0) {
                        break label327;
                     }

                     var53 = ((lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()) ? 1 : 0);
                  }

                  label328: {
                     int var47 = var53;
                     int var55 = var47;
                     if (var2 == null) {
                        if (var47 != 0) {
                           int var56 = var9;
                           if (var2 == null) {
                              if (var9 != 0) {
                                 break label328;
                              }

                              var56 = 1;
                           }

                           var9 = var56;
                           short var74 = 6933;
                           var10002 = -29722;
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a("sneak", true);
                           var12 = var25;
                           if (var2 == null) {
                              break label328;
                           }
                        }

                        var55 = var9;
                     }

                     int var30 = var55;
                     int var57 = var9;
                     if (var2 == null) {
                        var57 = var9 == 0 ? 1 : 0;
                     }

                     var9 = var57;
                     short var75 = 6933;
                     var10002 = -29722;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("sneak", (var9 != 0));
                     int var58 = var9;
                     if (var2 == null) {
                        if (var9 != 0) {
                           var12 = var25;
                        }

                        var58 = var9;
                     }

                     if (var2 == null) {
                        if (var58 != 0) {
                           break label328;
                        }

                        var58 = var30;
                     }

                     if (var2 == null) {
                        if (var58 == 0) {
                           break label328;
                        }

                        float var92;
                        var58 = (var92 = var1.h() - 0.18F) == 0.0F ? 0 : (var92 < 0.0F ? -1 : 1);
                     }

                     if (var2 == null) {
                        if (var58 >= 0) {
                           break label328;
                        }

                        var58 = ((var7.onGround()) ? 1 : 0);
                     }

                     if (var2 == null) {
                        if (var58 == 0) {
                           break label328;
                        }

                        double var93;
                        var58 = (var93 = Math.abs(var7.getY() - var1.c()) - 1.0) == 0.0 ? 0 : (var93 < 0.0 ? -1 : 1);
                     }

                     if (var2 == null) {
                        var58 = var58 < 0 ? 1 : 0;
                     }

                     label329: {
                        int var31 = var58;
                        int var59 = var31;
                        if (var2 == null) {
                           if (var31 == 0) {
                              break label328;
                           }

                           var60 = var1;
                           if (var2 != null) {
                              break label329;
                           }

                           var59 = ((var1.g()) ? 1 : 0);
                        }

                        if (var59 == 0) {
                           break label328;
                        }

                        var75 = 6931;
                        var10002 = -23623;
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a("jump", true);
                        try {
                           var1.a(100L);
                        }
                        catch (InterruptedException exception) {
                           throw new RuntimeException(exception);
                        }
                        var75 = 6930;
                        var10002 = 9022;
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a("jump", false);
                        var60 = var1;
                     }

                     ((me.octo.client.PXDyn)var60).a(250L);
                  }

                  var10 = var25;
               }

               IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
               double var48 = lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
               double var94;
               int var61 = (var94 = var48 - 6.0) == 0.0 ? 0 : (var94 < 0.0 ? -1 : 1);
               if (var2 == null) {
                  var61 = var61 < 0 ? 1 : 0;
               }

               int var49;
               label234: {
                  label331: {
                     var49 = var61;
                     int var32 = IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a();
                     float var95;
                     var62 = (var95 = var7.getXRot() - 35.0F) == 0.0F ? 0 : (var95 < 0.0F ? -1 : 1);
                     if (var2 == null) {
                        if (((Boolean)var62)) {
                           break label331;
                        }

                        var62 = var32;
                     }

                     if (var2 != null) {
                        break label234;
                     }

                     if ((((((Boolean)(Object)((Boolean)var62 ? 1 : 0)))) ? 1 : 0)  < 3) {
                        var62 = 1;
                        break label234;
                     }
                  }

                  var62 = 0;
               }

               label345: {
                  int var33 =((Integer)( var62));
                  int var63 = var49;
                  if (var2 == null) {
                     label219:
                     if (var49 == 0) {
                        int var64 = var33;
                        if (var2 == null) {
                           if (var33 != 0) {
                              break label219;
                           }

                           var64 = 300;
                        }

                        var65 = var64 + var1.a(0L, 350L);
                        break label345;
                     }

                     var63 = 50;
                  }

                  var65 = var63 + var1.a(0L, 50L);
               }

               long var34 =((Long)( var65));
               long var66 = var25 - var14;
               long var78 = var34;
               if (var2 == null) {
                  if (var66 > var34
                     && !IIIIIIIIIIlllIIIIlIllIlIllIIlIlllIIIllIllIlllllIllIlIlIIlIIIlIllIIllIIlIlIIlIllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b()) {
                     this.b(var1);
                     var14 = var25;
                  }

                  var66 = 1000L;
                  var78 = var1.a(0L, 3000L);
               }

               label207: {
                  long var36 = var66 + var78;
                  long var67 = var25 - var20;
                  if (var2 == null) {
                     if (var67 <= var36) {
                        break label207;
                     }

                     this.c(var1);
                     var67 = var25;
                  }

                  var20 = var67;
               }

               label201: {
                  label200: {
                     Vec3 var38 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var7);
                     double var39 = var8.distanceTo(var38);
                     double var96;
                     int var68 = (var96 = var39 - 3.5) == 0.0 ? 0 : (var96 < 0.0 ? -1 : 1);
                     if (var2 == null) {
                        if (var68 > 0) {
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .p();
                           var22 = 0L;
                           var24 = 0;
                           if (var2 == null) {
                              break label200;
                           }
                        }

                        var69 = var25;
                        var78 = var22;
                        if (var2 != null) {
                           break label201;
                        }

                        long var97;
                        var68 = (var97 = var25 - var22) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                     }

                     label194:
                     if (var68 > 0) {
                        int var70 = var24;
                        if (var2 == null) {
                           if (var24 != 0) {
                              me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .p();
                              var24 = 0;
                              long var41 = var1.h() < 0.4F ? 80L + var1.a(0L, 120L) : 30L + var1.a(0L, 70L);
                              var22 = var25 + var41;
                              if (var2 == null) {
                                 break label194;
                              }
                           }

                           var70 = var9;
                        }

                        long var50 = var70 != 0 ? var25 - var12 : 0L;
                        float var98;
                        int var71 = (var98 = var1.h() - 0.45F) == 0.0F ? 0 : (var98 < 0.0F ? -1 : 1);
                        if (var2 == null) {
                           var71 = var71 < 0 ? 1 : 0;
                        }

                        int var43 = var71;
                        int var72 = var43;
                        if (var2 == null) {
                           if (var43 != 0) {
                              this.a(var1, (var9 != 0), var50);
                              var24 = 0;
                              if (var2 == null) {
                                 break label194;
                              }
                           }

                           this.b(var1, (var9 != 0), var50);
                           var72 = 1;
                        }

                        var24 = var72;
                        var22 = var25 + 80 + var1.a(0L, 120L);
                     }
                  }

                  var69 = 60L;
                  var78 = var27;
               }

               long var51 = Math.min(var69, var78);
               if (var2 == null) {
                  if (var51 <= 0L) {
                     continue;
                  }

                  try {
                     var1.a(var51);
                  }
                  catch (InterruptedException exception) {
                     throw new RuntimeException(exception);
                  }
               }

               if (var2 == null) {
                  continue;
               }
            }

            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .r();
            short var80 = 6933;
            var10002 = -29722;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sneak", false);
            break;
         }
      }
   }

   private final void a(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1, boolean var2, long var3) {
      int[] var5;
      String var6;
      long var13;
      label81: {
         long var10001;
         label80: {
            label79: {
               int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
               String[] var7 = new String[6];
               short var10004 = 6925;
               short var10005 = 4163;
               var7[0] = "CIRCLE";
               var10004 = 6912;
               var10005 = -27630;
               var7[1] = "ZIGZAG";
               var10004 = 6919;
               var10005 = 21435;
               var7[2] = "BACK_FORTH";
               var10004 = 6924;
               var10005 = 17751;
               var7[3] = "STRAFE_SIDE";
               var10004 = 6938;
               var10005 = -2097;
               var7[4] = "FORWARD_SHUFFLE";
               var10004 = 6922;
               var10005 = 30854;
               var7[5] = "PANIC_SHUFFLE";
               var6 = var1.a(CollectionsKt.listOf(var7));
               var5 = var10000;
               int var11 =(( var2) ? 1 : 0);
               if (var5 == null) {
                  if (var2) {
                     break label79;
                  }

                  var13 = var3;
                  var10001 = 100L;
                  if (var5 != null) {
                     break label80;
                  }

                  long var36;
                  var11 = (var36 = var3 - 100L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
               }

               if (var11 > 0) {
                  var13 = 250L + var1.a(0L, 350L);
                  break label81;
               }
            }

            var13 = 150L;
            var10001 = var1.a(0L, 250L);
         }

         var13 += var10001;
      }

      long var10;
      label88: {
         label89: {
            label90: {
               label61: {
                  label60: {
                     var10 = var13;
                     int var14 = var6.hashCode();
                     if (var5 == null) {
                        switch (var14) {
                           case -2072623887:
                              short var20 = 6939;
                              short var25 = 7276;
                              if (!var6.equals("PANIC_SHUFFLE")) {
                                 return;
                              }
                              break label88;
                           case -1648722936:
                              short var19 = 6914;
                              short var24 = 8191;
                              var14 = ((var6.equals("ZIGZAG")) ? 1 : 0);
                              break;
                           case -345169089:
                              short var18 = 6921;
                              short var23 = 24633;
                              if (!var6.equals("FORWARD_SHUFFLE")) {
                                 return;
                              }
                              break label89;
                           case -171086971:
                              short var17 = 6927;
                              short var22 = 32083;
                              if (!var6.equals("BACK_FORTH")) {
                                 return;
                              }
                              break label61;
                           case 1047210631:
                              short var16 = 6928;
                              short var21 = 9063;
                              if (!var6.equals("STRAFE_SIDE")) {
                                 return;
                              }
                              break label90;
                           case 1988079824:
                              short var15 = 6926;
                              short var10002 = 32336;
                              if (var6.equals("CIRCLE")) {
                                 this.a(var1, var10);
                                 if (var5 == null) {
                                    return;
                                 }
                                 break label60;
                              }

                              return;
                           default:
                              return;
                        }
                     }

                     if (var14 == 0) {
                        return;
                     }
                  }

                  this.b(var1, var10);
                  if (var5 == null) {
                     return;
                  }
               }

               this.c(var1, var10);
               if (var5 == null) {
                  return;
               }
            }

            this.d(var1, var10);
            if (var5 == null) {
               return;
            }
         }

         this.e(var1, var10);
         if (var5 == null) {
            return;
         }
      }

      this.f(var1, var10);
   }

   private final void a(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1, long var2) { int var8 = 0; // PX-FIX hoist
        
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      int var5 = 2 + var1.a(0, 3);
      int[] var4 = var10000;
      float var20;
      int var10 = (var20 = var1.h() - 0.5F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
      if (var4 == null) {
         var10 = var10 < 0 ? 1 : 0;
      }

      int var6 = var10;
      int var7 = IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      int var11 = var7;
      if (var4 == null) {
         if (var7 > 1) {
            return;
         }

         var11 = ((lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()) ? 1 : 0);
      }

      if (var4 == null) {
         if (var11 != 0) {
            return;
         }

         var11 = 0;
      }

       var8 = var11;

      while (true) {
         if (var8 < var5) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .p();
            if (var4 != null) {
               break;
            }

            int var12 = var8 % 2;
            if (var4 == null) {
               var12 = var12 == 0 ? 1 : 0;
            }

            float var9 = (var12 ^ var6) != 0 ? 1.0F : -1.0F;
            if (var4 != null) {
               break;
            }

            if (IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(1.0F, var9, 10)) {
               label51: {
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var13 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  short var10001 = 6918;
                  short var10002 = -25897;
                  String var14 = "forward";
                  short var17 = 1;
                  if (var4 == null) {
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("forward", true);
                     if (var9 > 0.0F) {
                        var10001 = 6916;
                        var17 = -31663;
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a("left", true);
                        if (var4 == null) {
                           break label51;
                        }
                     }

                     var13 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     var10001 = 6920;
                     var17 = -14893;
                     var14 = "right";
                     var17 = 1;
                  }

                  var13.a(var14, (var17 != 0));
               }

               try {
                  var1.a(var2 + var1.a(-50L, 50L));
               }
               catch (InterruptedException exception) {
                  throw new RuntimeException(exception);
               }
               var8++;
               if (var4 == null) {
                  continue;
               }
            }
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
         break;
      }
   }

   private final void b(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1, long var2) { float var8 = 0.0f; // PX-FIX hoist
        
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      int var5 = IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      int[] var4 = var10000;
      int var9 = var5;
      if (var4 == null) {
         if (var5 > 1) {
            return;
         }

         var9 = ((lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a()) ? 1 : 0);
      }

      if (var4 == null) {
         if (var9 != 0) {
            return;
         }

         var9 = 3 + var1.a(0, 3);
      }

      int var6 = var9;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .p();
            if (var4 != null) {
               break;
            }

             var8 = var7 % 2 == 0 ? 1.0F : -1.0F;
            if (var4 != null) {
               break;
            }

            if (IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(1.0F, var8, 10)) {
               label39: {
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var10 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                  short var10001 = 6918;
                  short var10002 = -25897;
                  String var11 = "forward";
                  short var14 = 1;
                  if (var4 == null) {
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("forward", true);
                     if (var8 > 0.0F) {
                        var10001 = 6932;
                        var14 = 8693;
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a("left", true);
                        if (var4 == null) {
                           break label39;
                        }
                     }

                     var10 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                     var10001 = 6915;
                     var14 = 14648;
                     var11 = "right";
                     var14 = 1;
                  }

                  var10.a(var11, (var14 != 0));
               }

               try {
                  var1.a((long)((float)var2 * 0.6F) + var1.a(-30L, 30L));
               }
               catch (InterruptedException exception) {
                  throw new RuntimeException(exception);
               }
               var7++;
               if (var4 == null) {
                  continue;
               }
            }
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
         break;
      }
   }

   private final void c(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1, long var2) { short var8 = (short)0; // PX-FIX hoist
        
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      int var5 = 2 + var1.a(0, 2);
      int[] var4 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .p();
            if (var4 != null) {
               break;
            }

            float var7 = var6 % 2 == 0 ? 1.0F : -1.0F;
            if (var4 != null) {
               break;
            }

            if (IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var7, 0.0F, 10)) {
               label28: {
                  if (var7 > 0.0F) {
                     short var10001 = 6929;
                     short var10002 = 919;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("forward", true);
                     if (var4 == null) {
                        break label28;
                     }
                  }

                   var8 = 6934;
                  short var9 = -6369;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("back", true);
               }

               try {
                  var1.a(var2 + var1.a(-50L, 100L));
               }
               catch (InterruptedException exception) {
                  throw new RuntimeException(exception);
               }
               var6++;
               if (var4 == null) {
                  continue;
               }
            }
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
         break;
      }
   }

   private final void d(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1, long var2) { short var8 = (short)0; // PX-FIX hoist
        
      int[] var4 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      int var10000 = ((lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()) ? 1 : 0);
      if (var4 == null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = 3 + var1.a(0, 2);
      }

      int var5 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .p();
            if (var4 != null) {
               break;
            }

            float var7 = var6 % 2 == 0 ? 1.0F : -1.0F;
            if (var4 != null) {
               break;
            }

            if (IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(0.0F, var7, 10)) {
               label36: {
                  if (var7 > 0.0F) {
                     short var10001 = 6916;
                     short var10002 = -31663;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("left", true);
                     if (var4 == null) {
                        break label36;
                     }
                  }

                   var8 = 6920;
                  short var9 = -14893;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("right", true);
               }

               try {
                  var1.a(var2 + var1.a(-40L, 80L));
               }
               catch (InterruptedException exception) {
                  throw new RuntimeException(exception);
               }
               var6++;
               if (var4 == null) {
                  continue;
               }
            }
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
         break;
      }
   }

   private final void e(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1, long var2) { float var8 = 0.0f; // PX-FIX hoist
        
      float var11 = 0; // PX-FIX
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      int var5 = 3 + var1.a(0, 3);
      int[] var4 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .p();
            if (var4 != null) {
               break;
            }

            float var17;
            int var9 = (var17 = var1.h() - 0.5F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
            if (var4 == null) {
               var9 = var9 < 0 ? 1 : 0;
            }

            label56: {
               int var7 = var9;
               int var10 = var7;
               if (var4 == null) {
                  if (var7 == 0) {
                     var11 = 0.0F;
                     break label56;
                  }

                  var11 = var1.h();
                  if (var4 != null) {
                     break label56;
                  }

                  float var18;
                  var10 = (var18 = var11 - 0.5F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
               }

               var11 = var10 < 0 ? 1.0F : -1.0F;
            }

             var8 = var11;
            if (var4 != null) {
               break;
            }

            if (IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(1.0F, var8, 10)) {
               label46: {
                  short var10001 = 6918;
                  short var10002 = -25897;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("forward", true);
                  float var19;
                  int var12 = (var19 = var8 - 0.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
                  if (var4 == null) {
                     if (var12 > 0) {
                        var10001 = 6916;
                        var10002 = -31663;
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a("left", true);
                        if (var4 == null) {
                           break label46;
                        }
                     }

                     float var20;
                     var12 = (var20 = var8 - 0.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
                  }

                  if (var12 < 0) {
                     var10001 = 6920;
                     var10002 = -14893;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("right", true);
                  }
               }

               try {
                  var1.a(var2 + var1.a(-60L, 60L));
               }
               catch (InterruptedException exception) {
                  throw new RuntimeException(exception);
               }
               var6++;
               if (var4 == null) {
                  continue;
               }
            }
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
         break;
      }
   }

   private final void f(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1, long var2) { float var8 = 0.0f; // PX-FIX hoist
        
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      int var5 = 4 + var1.a(0, 3);
      int var6 = 0;
      int[] var4 = var10000;

      while (true) {
         if (var6 < var5) {
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .p();
            if (var4 != null) {
               break;
            }
            float var7 = switch (var1.a(0, 3)) {
               case 0 -> 1.0F;
               case 1 -> -1.0F;
               default -> 0.0F;
            };

             var8 = switch (var1.a(0, 3)) {
               case 0 -> 1.0F;
               case 1 -> -1.0F;
               default -> 0.0F;
            };
            float var20;
            int var11 = (var20 = var7 - 0.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
            if (var4 == null) {
               var11 = (((var11 == 0) ? 1 : 0));
            }

            label98: {
               if ((var11 != 0)) {
                  float var21;
                  int var12 = (var21 = var8 - 0.0F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
                  if (var4 == null) {
                     var12 = (((var12 == 0) ? 1 : 0));
                  }

                  if ((var12 != 0)) {
                     break label98;
                  }
               }

               int var13 = ((IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var7, var8, 10)) ? 1 : 0);
               if (var4 == null) {
                  if (var13 == 0) {
                     break label98;
                  }

                  float var22;
                  var13 = (var22 = var7 - 0.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
               }

               label84: {
                  label99: {
                     if (var4 == null) {
                        if (var13 > 0) {
                           short var10001 = 6918;
                           short var10002 = -25897;
                           me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a("forward", true);
                           if (var4 == null) {
                              break label99;
                           }
                        }

                        float var23;
                        var13 = (var23 = var7 - 0.0F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
                     }

                     if (var4 != null) {
                        break label84;
                     }

                     if (var13 < 0) {
                        short var14 = 6913;
                        short var17 = 24875;
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a("back", true);
                     }
                  }

                  float var24;
                  var13 = (var24 = var8 - 0.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
               }

               label73: {
                  if (var4 == null) {
                     if (var13 > 0) {
                        short var15 = 6916;
                        short var18 = -31663;
                        me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a("left", true);
                        if (var4 == null) {
                           break label73;
                        }
                     }

                     float var25;
                     var13 = (var25 = var8 - 0.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
                  }

                  if (var13 < 0) {
                     short var16 = 6920;
                     short var19 = -14893;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("right", true);
                  }
               }

               try {
                  var1.a((long)((float)var2 * 0.5F) + var1.a(-30L, 30L));
               }
               catch (InterruptedException exception) {
                  throw new RuntimeException(exception);
               }
            }

            var6++;
            if (var4 == null) {
               continue;
            }
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
         break;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void b(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1, boolean var2, long var3) { Pair[] var8 = null; // PX-FIX hoist
        
      Object var84 = null; // PX-FIX
      Object var83 = null; // PX-FIX
      Object var82 = null; // PX-FIX
      Object var80 = null; // PX-FIX
      Object var72 = null; // PX-FIX
      List var68 = null; // PX-FIX
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
      int[] var5 = var10000;
      if (var5 == null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var6 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
          var8 = new Pair[]{
            new Pair(1.0F, 0.0F),
            new Pair(-1.0F, 0.0F),
            new Pair(0.0F, 1.0F),
            new Pair(0.0F, -1.0F),
            new Pair(1.0F, 1.0F),
            new Pair(1.0F, -1.0F),
            new Pair(-1.0F, 1.0F),
            new Pair(-1.0F, -1.0F)
         };
         List var7 = CollectionsKt.listOf(var8);
         Iterable var9 = var7;
         boolean var10 = false;
         var var12 = new ArrayList();
         boolean var13 = false;

         for (Object var15 : var9) {
            Pair var16 = (Pair)var15;
            boolean var17 = false;
            float var18 = ((Number)var16.component1()).floatValue();
            float var19 = ((Number)var16.component2()).floatValue();
            boolean var64 = IllIllllIIlIIIllllllIIIlllllIIlllIlllIIlllIlIIllllIlllIllIIllIIIlllllIIllIlIlIIlllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var18, var19, 10);
            if (var5 == null) {
               if (!var64) {
                  continue;
               }

               var12.add(var15);
            }

            if (var5 != null) {
               break;
            }
         }

         List var29 = var12;
         List var65 = var29;
         if (var5 == null) {
            if (var29.isEmpty()) {
               return;
            }

            var65 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c();
         }

         List var30 = var65;
         double var31 = lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
         double var91;
         int var66 = (var91 = var31 - 3.5) == 0.0 ? 0 : (var91 < 0.0 ? -1 : 1);
         if (var5 == null) {
            var66 = var66 < 0 ? 1 : 0;
         }

         int var32 = var66;
         boolean var67 = var30.isEmpty();
         if (var5 == null) {
            var67 = !var67;
         }

         label274:
         if (!var67 && var32 == 0) {
            Iterable var39 = var29;
            boolean var43 = false;
            var var48 = new ArrayList();
            boolean var52 = false;

            for (Object var58 : var39) {
               Pair var61 = (Pair)var58;
               boolean var63 = false;
               float var92;
               int var77 = (var92 = ((Number)var61.getFirst()).floatValue() - 0.0F) == 0.0F ? 0 : (var92 < 0.0F ? -1 : 1);
               if (var5 == null) {
                  var77 = var77 < 0 ? 1 : 0;
               }

               if (var77 != 0) {
                  var48.add(var58);
                  if (var5 != null) {
                     break;
                  }
               }
            }

            List var35 = var48;
            boolean var78 = var35.isEmpty();
            if (var5 == null) {
               var78 = !var78;
            }

            label214: {
               if (var78) {
                  var10000 = (int[])(Object)var1;
                  if (var5 != null) {
                     break label214;
                  }

                  if (var1.h() < 0.4F) {
                     var72 = (Pair)var35.get(var1.a(0, var35.size()));
                     break label274;
                  }
               }

               var10000 = (int[])var29.get(var1.a(0, var29.size()));
            }

            var72 = (Pair)(Object)var10000;
         } else {
            label318: {
               Iterable var37 = var29;
               boolean var41 = false;
               Collection var46 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var37, 10));
               boolean var49 = false;

               label269: {
                  for (Object var21 : var37) {
                     Pair var22 = (Pair)var21;
                     boolean var23 = false;
                     float var24 = ((Number)var22.component1()).floatValue();
                     float var25 = ((Number)var22.component2()).floatValue();
                     float var26 = this.a(var6.getYRot(), var24, var25);
                     var68 = var30;
                     if (var5 != null) {
                        break label269;
                     }

                     boolean var69 = var68.isEmpty();
                     if (var5 == null) {
                        var69 = !var69;
                     }

                     float var27 = var69 ? this.a(var26, var30) : 0.0F;
                     float var93;
                     int var70 = (var93 = var24 - 0.0F) == 0.0F ? 0 : (var93 < 0.0F ? -1 : 1);
                     if (var5 == null) {
                        if (var70 < 0) {
                           var27 += var32 != 0 ? 15.0F : 8.0F;
                        }

                        var46.add(new Triple(var24, var25, var27));
                     }

                     if (var5 != null) {
                        break;
                     }
                  }

                  var68 = ((List)(Object)(var46));
               }

               List var34 = (List)var68;
               var10000 = (int[])(Object)var1;
               if (var5 == null) {
                  if (var1.h() < 0.85F) {
                     label303: {
                        Iterable var42 = var34;
                        boolean var45 = false;
                        Iterator var47 = var42.iterator();
                        var10000 = (int[])(Object)var47;
                        if (var5 == null) {
                           if (!var47.hasNext()) {
                              var10000 = null;
                              break label303;
                           }

                           var10000 = (int[])var47.next();
                        }

                        Object var50 = var10000;
                        var10000 = (int[])(Object)var47;
                        if (var5 == null) {
                           if (!var47.hasNext()) {
                              var10000 = (int[])var50;
                              break label303;
                           }

                           var10000 = (int[])var50;
                        }

                        Triple var53 = (Triple)(Object)var10000;
                        boolean var56 = false;
                        float var54 = ((Number)var53.getThird()).floatValue();

                        label250:
                        while (true) {
                           Object var57 = var47.next();
                           Triple var59 = (Triple)var57;
                           boolean var62 = false;
                           float var60 = ((Number)var59.getThird()).floatValue();
                           if (Float.compare(var54, var60) < 0) {
                              var50 = var57;
                              var54 = var60;
                           }

                           while (!var47.hasNext()) {
                              if (var5 == null) {
                                 var10000 = (int[])var50;
                                 break label250;
                              }

                              var54 = var60;
                           }
                        }
                     }

                     Triple var38 = (Triple)(Object)var10000;
                     var10000 = (int[])(Object)var38;
                     if (var5 == null) {
                        if (var38 != null) {
                           var49 = false;
                           var72 = new Pair(var38.getFirst(), var38.getSecond());
                           break label318;
                        }

                        var10000 = (int[])var29.get(var1.a(0, var29.size()));
                     }

                     var72 = (Pair)(Object)var10000;
                     break label318;
                  }

                  var10000 = (int[])var29.get(var1.a(0, var29.size()));
               }

               var72 = (Pair)(Object)var10000;
            }
         }

         float var40;
         label206: {
            label305: {
               Pair var33 =((Pair)( var72));
               float var36 = ((Number)var33.component1()).floatValue();
               var40 = ((Number)var33.component2()).floatValue();
               float var94;
               var80 = (var94 = var36 - 0.0F) == 0.0F ? 0 : (var94 < 0.0F ? -1 : 1);
               if (var5 == null) {
                  if (((Boolean)var80)) {
                     short var10001 = 6918;
                     short var10002 = -25897;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("forward", true);
                     if (var5 == null) {
                        break label305;
                     }
                  }

                  float var95;
                  var80 = (var95 = var36 - 0.0F) == 0.0F ? 0 : (var95 < 0.0F ? -1 : 1);
               }

               if (var5 != null) {
                  break label206;
               }

               if (((Boolean)var80)) {
                  short var85 = 6913;
                  short var88 = 24875;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("back", true);
               }
            }

            float var96;
            var80 = (var96 = var40 - 0.0F) == 0.0F ? 0 : (var96 < 0.0F ? -1 : 1);
         }

         label195: {
            label306: {
               if (var5 == null) {
                  if (((Boolean)var80)) {
                     short var86 = 6916;
                     short var89 = -31663;
                     me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .a("left", true);
                     if (var5 == null) {
                        break label306;
                     }
                  }

                  float var97;
                  var80 = (var97 = var40 - 0.0F) == 0.0F ? 0 : (var97 < 0.0F ? -1 : 1);
               }

               if (var5 != null) {
                  break label195;
               }

               if (((Boolean)var80)) {
                  short var87 = 6920;
                  short var90 = -14893;
                  me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .a("right", true);
               }
            }

            var80 = var2;
         }

         label307: {
            label183:
            if (var5 == null) {
               if (!((Boolean)var80)) {
                  long var98;
                  var80 = (var98 = var3 - 100L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                  if (var5 != null) {
                     break label183;
                  }

                  if (((Boolean)var80)) {
                     label308: {
                        float var99;
                        int var81 = (var99 = var1.h() - 0.3F) == 0.0F ? 0 : (var99 < 0.0F ? -1 : 1);
                        if (var5 == null) {
                           if (var81 < 0) {
                              var83 = var1.a(300L, 500L);
                              break label307;
                           }

                           var82 = var1;
                           if (var5 != null) {
                              break label308;
                           }

                           float var100;
                           var81 = (var100 = var1.h() - 0.6F) == 0.0F ? 0 : (var100 < 0.0F ? -1 : 1);
                        }

                        if (var81 < 0) {
                           var83 = var1.a(400L, 700L);
                           break label307;
                        }

                        var82 = var1;
                     }

                     var83 = ((me.octo.client.PXDyn)var82).a(500L, 800L);
                     break label307;
                  }
               }

               float var101;
               var80 = (var101 = var1.h() - 0.4F) == 0.0F ? 0 : (var101 < 0.0F ? -1 : 1);
            }

            label310: {
               if (var5 == null) {
                  if (((Boolean)var80)) {
                     var83 = var1.a(60L, 120L);
                     break label307;
                  }

                  var84 = var1;
                  if (var5 != null) {
                     break label310;
                  }

                  float var102;
                  var80 = (var102 = var1.h() - 0.7F) == 0.0F ? 0 : (var102 < 0.0F ? -1 : 1);
               }

               if (((Boolean)var80)) {
                  var83 = var1.a(100L, 180L);
                  break label307;
               }

               var84 = var1;
            }

            var83 = ((me.octo.client.PXDyn)var84).a(140L, 250L);
         }

         long var44 =((Long)( var83));
         try {
            var1.a(var44);
         }
         catch (InterruptedException exception) {
            throw new RuntimeException(exception);
         }
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .p();
      }
   }

   private final float a(float var1, float var2, float var3) {
      double var4 = Math.atan2(var3, var2);
      float var6 = (float)Math.toDegrees(var4);
      return var1 + var6;
   }

   private final float a(float var1, List<Float> var2) {
       float var8 = 0.0F; // PX-FIX decl var8
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      float var4 = 0.0F;
      int[] var3 = var10000;
      Iterator var5 = var2.iterator();

      while (true) {
         if (var5.hasNext()) {
            float var6 = ((Number)var5.next()).floatValue();
            float var7 = Math.abs(this.a(var1 - var6));
            var8 = var4 + var7;
            if (var3 != null) {
               break;
            }

            var4 = var8;
            if (var3 == null) {
               continue;
            }
         }

         var8 = var4 / var2.size();
         break;
      }

      return var8;
   }

   private final float a(float var1) {
      int[] var10000 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      float var3 = var1 % 360.0F;
      int[] var2 = var10000;
      float var6;
      int var4 = (var6 = var3 - 180.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      if (var2 == null) {
         if (var4 > 0) {
            var3 -= 360.0F;
         }

         if (var2 != null) {
            return var3;
         }

         float var7;
         var4 = (var7 = var3 - -180.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      }

      if (var4 < 0) {
         var3 += 360.0F;
      }

      return var3;
   }

   private final void b(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) { float var8 = 0.0f; // PX-FIX hoist
        
      int[] var2 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      if (var2 == null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var3 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .player;
         double var4 = lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
         double var23;
         int var10000 = (var23 = var4 - 4.0) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
         if (var2 == null) {
            if (var10000 < 0) {
               Pair var6 = IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var1, true);
               if (var6 != null) {
                  float var16 = var1.f();
                  float var18 = (0.85F + var1.h() * 0.3F) * var16;
                  IIIIIIIIIIlllIIIIlIllIlIllIIlIlllIIIllIllIlllllIllIlIlIIlIIIlIllIIllIIlIlIIlIllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(((Number)var6.getFirst()).floatValue(), ((Number)var6.getSecond()).floatValue())
                     .a(var18);
                  var1.e(((Number)var6.getFirst()).floatValue());
                  return;
               }
            }

            float var24;
            var10000 = (var24 = var1.h() - 0.1F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
         }

         if (var2 == null) {
            var10000 = var10000 < 0 ? 1 : 0;
         }

         int var14 = var10000;
         if (var14 == 0) {
            Pair var15 = IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var1, false);
            if (var15 != null) {
               float var17 = var1.f();
               float var25;
               var10000 = (var25 = var1.h() - 0.15F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
               if (var2 == null) {
                  var10000 = var10000 < 0 ? 1 : 0;
               }

               int var19 = var10000;
               float var20 = var19 != 0 ? (1.2F + var1.h() * 0.4F) * var17 : (0.75F + var1.h() * 0.35F) * var17;
               IIIIIIIIIIlllIIIIlIllIlIllIIlIlllIIIllIllIlllllIllIlIlIIlIIIlIllIIllIIlIlIIlIllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(((Number)var15.getFirst()).floatValue(), ((Number)var15.getSecond()).floatValue())
                  .a(var20);
               var1.e(((Number)var15.getFirst()).floatValue());
            }
         } else {
            Pair var7 = IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var1, false);
            if (var7 != null) {
                var8 = var1.f();
               float var9 = (0.75F + var1.h() * 0.25F) * var8;
               IIIIIIIIIIlllIIIIlIllIlIllIIlIlllIIIllIllIlllllIllIlIlIIlIIIlIllIIllIIlIlIIlIllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(((Number)var7.getFirst()).floatValue(), ((Number)var7.getSecond()).floatValue())
                  .a(var9);
               var1.e(((Number)var7.getFirst()).floatValue());
               long var10 = 0L;

               while (
                  IIIIIIIIIIlllIIIIlIllIlIllIIlIlllIIIllIllIlllllIllIlIlIIlIIIlIllIIllIIlIlIIlIllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b()
               ) {
                  long var21 = var10;
                  long var10001 = 500L;
                  if (var2 == null) {
                     if (var10 >= 500L) {
                        break;
                     }

                     try {
                        var1.a(50L);
                     }
                     catch (InterruptedException exception) {
                        throw new RuntimeException(exception);
                     }
                     var21 = var10;
                     var10001 = 50;
                  }

                  var10 = var21 + var10001;
                  if (var2 != null) {
                     break;
                  }
               }

               Pair var12 = IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var1, false);
               if (var12 != null) {
                  float var13 = (0.7F + var1.h() * 0.25F) * var8;
                  IIIIIIIIIIlllIIIIlIllIlIllIIlIlllIIIllIllIlllllIllIlIlIIlIIIlIllIIllIIlIlIIlIllIllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(((Number)var12.getFirst()).floatValue(), ((Number)var12.getSecond()).floatValue())
                     .a(var13);
                  var1.e(((Number)var12.getFirst()).floatValue());
               }
            }
         }
      }
   }

   private final void c(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) { int var8 = 0; // PX-FIX hoist
        
      Object var24 = null; // PX-FIX
      Object var22 = null; // PX-FIX
      Object var19 = null; // PX-FIX
      int[] var2 = IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll.c();
      if (var2 == null
         && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player
            != null) {
         LocalPlayer var3;
         int var4;
         label211: {
            var3 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .player;
            var4 = var3.getInventory().getSelectedSlot();
            int var10000 = var4;
            if (var2 == null) {
               if (var4 != 8) {
                  break label211;
               }

               var10000 = var1.a(0, 8);
            }

            var4 = var10000;
         }

         float var5 = var1.h();
         float var26;
         int var16 = (var26 = var5 - 0.6F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
         if (var2 == null) {
            if (var16 < 0) {
               label220: {
                  var16 = var4;
                  if (var2 == null) {
                     if (var4 == 7) {
                        var16 = -1;
                        break label220;
                     }

                     var16 = var4;
                  }

                  if (var2 == null) {
                     if (var16 == 0) {
                        var16 = 1;
                        break label220;
                     }

                     var16 = var4;
                  }

                  label221: {
                     byte var10001 = 5;
                     if (var2 == null) {
                        if (var16 >= 5) {
                           float var27;
                           var16 = (var27 = var1.h() - 0.7F) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
                           if (var2 == null) {
                              var16 = var16 < 0 ? -1 : 1;
                           }
                           break label220;
                        }

                        var16 = var4;
                        if (var2 != null) {
                           break label221;
                        }

                        var10001 = 2;
                     }

                     if (var16 <= var10001) {
                        float var28;
                        var16 = (var28 = var1.h() - 0.7F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
                        if (var2 == null) {
                           var16 = var16 < 0 ? 1 : -1;
                        }
                        break label220;
                     }

                     float var29;
                     var16 = (var29 = var1.h() - 0.5F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                  }

                  if (var2 == null) {
                     var16 = var16 < 0 ? 1 : -1;
                  }
               }

               int var6 = var16;
               int var7 = var4 + var6;
               var16 = var7;
               if (var2 == null) {
                  if (var7 < 0) {
                     var7 = 7;
                  }

                  var16 = var7;
               }

               label223: {
                  if (var2 == null) {
                     if (var16 > 7) {
                        var7 = 0;
                     }

                     var3.getInventory().setSelectedSlot(var7);
                     var19 = var1;
                     if (var2 != null) {
                        break label223;
                     }

                     float var30;
                     var16 = (var30 = var1.h() - 0.4F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                  }

                  if (var16 >= 0) {
                     return;
                  }

                  var19 = var1;
               }

               ((me.octo.client.PXDyn)var19).a(var1.a(100L, 300L));
               var3.getInventory().setSelectedSlot(RangesKt.coerceIn(var4, 0, 7));
               if (var2 == null) {
                  return;
               }
            }

            float var31;
            var16 = (var31 = var5 - 0.9F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
         }

         if (var2 == null) {
            if (var16 < 0) {
               int var12;
               label160: {
                  label226: {
                     var12 = 2 + var1.a(0, 3);
                     var16 = var4;
                     byte var25 = 5;
                     if (var2 == null) {
                        if (var4 >= 5) {
                           var16 = -1;
                           break label160;
                        }

                        var16 = var4;
                        if (var2 != null) {
                           break label226;
                        }

                        var25 = 2;
                     }

                     if (var16 <= var25) {
                        var16 = 1;
                        break label160;
                     }

                     float var32;
                     var16 = (var32 = var1.h() - 0.5F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
                  }

                  if (var2 == null) {
                     var16 = var16 < 0 ? 1 : -1;
                  }
               }

               int var14 = var16;
                var8 = 0;
               var8 = var4;
               int var9 = 0;

               label228: {
                  while (true) {
                     if (var9 < var12) {
                        boolean var11 = false;
                        var8 += var14;
                        var16 = var8;
                        if (var2 != null) {
                           break;
                        }

                        if (var2 == null) {
                           if (var8 < 0) {
                              var8 = 7;
                           }

                           var16 = var8;
                        }

                        label141: {
                           if (var2 == null) {
                              if (var16 <= 7) {
                                 break label141;
                              }

                              var16 = 0;
                           }

                           var8 = var16;
                        }

                        var3.getInventory().setSelectedSlot(var8);
                        try {
                           var1.a(var1.a(40L, 70L));
                        }
                        catch (InterruptedException exception) {
                           throw new RuntimeException(exception);
                        }
                        var9++;
                        if (var2 == null) {
                           continue;
                        }
                     }

                     var22 = var1;
                     if (var2 != null) {
                        break label228;
                     }

                     float var33;
                     var16 = (var33 = var1.h() - 0.3F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
                     break;
                  }

                  if (var16 >= 0) {
                     return;
                  }

                  var22 = var1;
               }

               ((me.octo.client.PXDyn)var22).a(var1.a(150L, 350L));
               var3.getInventory().setSelectedSlot(RangesKt.coerceIn(var4, 0, 7));
               if (var2 == null) {
                  return;
               }
            }

            var16 = var1.a(0, 8);
         }

         label231: {
            int var13 = var16;
            var16 = var13;
            if (var2 == null) {
               if (var13 == var4) {
                  return;
               }

               var3.getInventory().setSelectedSlot(var13);
               var24 = var1;
               if (var2 != null) {
                  break label231;
               }

               float var34;
               var16 = (var34 = var1.h() - 0.5F) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
            }

            if (var16 >= 0) {
               return;
            }

            var24 = var1;
         }

         ((me.octo.client.PXDyn)var24).a(var1.a(200L, 500L));
         var3.getInventory().setSelectedSlot(RangesKt.coerceIn(var4, 0, 7));
      }
   }

   @NotNull
   @Override
   public String b() {
      short var10000 = 6935;
      short var10001 = -4846;
      return "Movement";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static { int var8 = 0; // PX-FIX hoist
        
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[26];
      int var3 = 0;
      String var2 = "\n(:IÔ\u0006ßÔ\u008dÀ3¬\u0004\u0086c½*\u0006(\u0085sêìé\n\b\u009bh1\u0015 \u0019\u0011QR\u00072@¾\u009dæºµ\u0005Å-à\u0007Ò\u0004P\u0012\u00ad\u009f\u0007©\u0012tÔ$úy\rãüHß¡&\fám\u001btÍ§\u000fH\"õÕ\u008b·\u001ch\u009cÑ\u009fQ¨¨\u0007\u0005ÝðÀR\u008b\nè\u008dtó\u0096øi\u001a_3\u0006\u000fë¸>/K\u0006J\u0087\u0010³:ú\u000bÇ\u000e³>D\t\u0019F^\u0095\u008e\u0004b_& \u0004\u0004>ê\f\u0007\u0000¥ø!.-¬\u000b\u001fd¨s' usÓ3?\b\u0011`\u0090\u008b«?\u009b\u0083\u0004|\u009fâµ\u0005£#,ÆK\u0004'ÊC\u0084";
      int var4 = "\n(:IÔ\u0006ßÔ\u008dÀ3¬\u0004\u0086c½*\u0006(\u0085sêìé\n\b\u009bh1\u0015 \u0019\u0011QR\u00072@¾\u009dæºµ\u0005Å-à\u0007Ò\u0004P\u0012\u00ad\u009f\u0007©\u0012tÔ$úy\rãüHß¡&\fám\u001btÍ§\u000fH\"õÕ\u008b·\u001ch\u009cÑ\u009fQ¨¨\u0007\u0005ÝðÀR\u008b\nè\u008dtó\u0096øi\u001a_3\u0006\u000fë¸>/K\u0006J\u0087\u0010³:ú\u000bÇ\u000e³>D\t\u0019F^\u0095\u008e\u0004b_& \u0004\u0004>ê\f\u0007\u0000¥ø!.-¬\u000b\u001fd¨s' usÓ3?\b\u0011`\u0090\u008b«?\u009b\u0083\u0004|\u009fâµ\u0005£#,ÆK\u0004'ÊC\u0084"
         .length();
      char var1 = 5;
       var8 = -1;

      label52:
      while (true) {
         byte var10000 = 103;
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
                     case 0 -> 119;
                     case 1 -> 79;
                     case 2 -> 69;
                     case 3 -> 2;
                     case 4 -> 79;
                     case 5 -> 41;
                     default -> 34;
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
                     b = var5;
                     c = new String[26];
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ñ\be.kw:¤ÄÜ.Z\u0083\u000fæ\u008fO\u000f³\u0083t\u0081þ\u0083¼t£c\t";
                  var4 = "ñ\be.kw:¤ÄÜ.Z\u0083\u000fæ\u008fO\u000f³\u0083t\u0081þ\u0083¼t£c\t".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 77;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) { int var8 = 0; // PX-FIX hoist
        
      int var2 = (var0 ^ 6915) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 40;
            case 1 -> 198;
            case 2 -> 86;
            case 3 -> 137;
            case 4 -> 102;
            case 5 -> 219;
            case 6 -> 229;
            case 7 -> 46;
            case 8 -> 236;
            case 9 -> 205;
            case 10 -> 119;
            case 11 -> 67;
            case 12 -> 247;
            case 13 -> 82;
            case 14 -> 143;
            case 15 -> 11;
            case 16 -> 33;
            case 17 -> 158;
            case 18 -> 178;
            case 19 -> 36;
            case 20 -> 192;
            case 21 -> 172;
            case 22 -> 70;
            case 23 -> 26;
            case 24 -> 97;
            case 25 -> 166;
            case 26 -> 208;
            case 27 -> 253;
            case 28 -> 105;
            case 29 -> 25;
            case 30 -> 239;
            case 31 -> 244;
            case 32 -> 180;
            case 33 -> 240;
            case 34 -> 147;
            case 35 -> 31;
            case 36 -> 110;
            case 37 -> 150;
            case 38 -> 225;
            case 39 -> 101;
            case 40 -> 136;
            case 41 -> 29;
            case 42 -> 64;
            case 43 -> 124;
            case 44 -> 189;
            case 45 -> 222;
            case 46 -> 230;
            case 47 -> 85;
            case 48 -> 76;
            case 49 -> 195;
            case 50 -> 74;
            case 51 -> 216;
            case 52 -> 80;
            case 53 -> 57;
            case 54 -> 210;
            case 55 -> 154;
            case 56 -> 176;
            case 57 -> 91;
            case 58 -> 232;
            case 59 -> 218;
            case 60 -> 3;
            case 61 -> 89;
            case 62 -> 171;
            case 63 -> 104;
            case 64 -> 37;
            case 65 -> 21;
            case 66 -> 12;
            case 67 -> 164;
            case 68 -> 188;
            case 69 -> 200;
            case 70 -> 249;
            case 71 -> 231;
            case 72 -> 146;
            case 73 -> 138;
            case 74 -> 241;
            case 75 -> 194;
            case 76 -> 95;
            case 77 -> 173;
            case 78 -> 175;
            case 79 -> 140;
            case 80 -> 43;
            case 81 -> 170;
            case 82 -> 75;
            case 83 -> 212;
            case 84 -> 58;
            case 85 -> 32;
            case 86 -> 252;
            case 87 -> 93;
            case 88 -> 27;
            case 89 -> 190;
            case 90 -> 42;
            case 91 -> 103;
            case 92 -> 14;
            case 93 -> 156;
            case 94 -> 41;
            case 95 -> 47;
            case 96 -> 15;
            case 97 -> 90;
            case 98 -> 174;
            case 99 -> 109;
            case 100 -> 35;
            case 101 -> 72;
            case 102 -> 51;
            case 103 -> 115;
            case 104 -> 157;
            case 105 -> 135;
            case 106 -> 48;
            case 107 -> 204;
            case 108 -> 17;
            case 109 -> 196;
            case 110 -> 121;
            case 111 -> 127;
            case 112 -> 69;
            case 113 -> 202;
            case 114 -> 161;
            case 115 -> 0;
            case 116 -> 181;
            case 117 -> 234;
            case 118 -> 203;
            case 119 -> 151;
            case 120 -> 233;
            case 121 -> 145;
            case 122 -> 184;
            case 123 -> 88;
            case 124 -> 128;
            case 125 -> 19;
            case 126 -> 185;
            case 127 -> 238;
            case 128 -> 87;
            case 129 -> 129;
            case 130 -> 167;
            case 131 -> 179;
            case 132 -> 114;
            case 133 -> 142;
            case 134 -> 160;
            case 135 -> 155;
            case 136 -> 149;
            case 137 -> 123;
            case 138 -> 134;
            case 139 -> 28;
            case 140 -> 66;
            case 141 -> 248;
            case 142 -> 169;
            case 143 -> 193;
            case 144 -> 73;
            case 145 -> 191;
            case 146 -> 148;
            case 147 -> 79;
            case 148 -> 251;
            case 149 -> 59;
            case 150 -> 55;
            case 151 -> 62;
            case 152 -> 220;
            case 153 -> 197;
            case 154 -> 183;
            case 155 -> 60;
            case 156 -> 206;
            case 157 -> 111;
            case 158 -> 116;
            case 159 -> 49;
            case 160 -> 8;
            case 161 -> 168;
            case 162 -> 113;
            case 163 -> 224;
            case 164 -> 144;
            case 165 -> 94;
            case 166 -> 16;
            case 167 -> 243;
            case 168 -> 22;
            case 169 -> 242;
            case 170 -> 221;
            case 171 -> 122;
            case 172 -> 159;
            case 173 -> 81;
            case 174 -> 13;
            case 175 -> 187;
            case 176 -> 77;
            case 177 -> 186;
            case 178 -> 215;
            case 179 -> 38;
            case 180 -> 152;
            case 181 -> 107;
            case 182 -> 52;
            case 183 -> 44;
            case 184 -> 214;
            case 185 -> 255;
            case 186 -> 235;
            case 187 -> 213;
            case 188 -> 125;
            case 189 -> 96;
            case 190 -> 245;
            case 191 -> 131;
            case 192 -> 92;
            case 193 -> 112;
            case 194 -> 182;
            case 195 -> 250;
            case 196 -> 223;
            case 197 -> 165;
            case 198 -> 34;
            case 199 -> 237;
            case 200 -> 217;
            case 201 -> 133;
            case 202 -> 108;
            case 203 -> 209;
            case 204 -> 24;
            case 205 -> 20;
            case 206 -> 6;
            case 207 -> 106;
            case 208 -> 120;
            case 209 -> 65;
            case 210 -> 141;
            case 211 -> 118;
            case 212 -> 18;
            case 213 -> 99;
            case 214 -> 2;
            case 215 -> 211;
            case 216 -> 100;
            case 217 -> 56;
            case 218 -> 68;
            case 219 -> 1;
            case 220 -> 53;
            case 221 -> 207;
            case 222 -> 4;
            case 223 -> 39;
            case 224 -> 78;
            case 225 -> 163;
            case 226 -> 139;
            case 227 -> 61;
            case 228 -> 177;
            case 229 -> 199;
            case 230 -> 228;
            case 231 -> 9;
            case 232 -> 201;
            case 233 -> 5;
            case 234 -> 23;
            case 235 -> 63;
            case 236 -> 71;
            case 237 -> 54;
            case 238 -> 50;
            case 239 -> 84;
            case 240 -> 254;
            case 241 -> 7;
            case 242 -> 83;
            case 243 -> 227;
            case 244 -> 246;
            case 245 -> 45;
            case 246 -> 226;
            case 247 -> 98;
            case 248 -> 153;
            case 249 -> 10;
            case 250 -> 130;
            case 251 -> 162;
            case 252 -> 126;
            case 253 -> 117;
            case 254 -> 30;
            default -> 132;
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
             var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   @Override
   public boolean a() {
      // PX-FIX PhaseA-RESe: exact jar bridge (jar body = invokespecial InterfaceMethod me.octo.client.IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl.a:()Z)
      return me.octo.client.IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl.super.a();
   }
}
