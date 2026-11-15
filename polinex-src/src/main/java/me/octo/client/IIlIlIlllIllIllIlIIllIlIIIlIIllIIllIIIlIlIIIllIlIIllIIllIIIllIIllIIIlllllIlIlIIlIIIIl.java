package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private static Vec3 lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] c;
   private static String[] d;

   private IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl() {
   }

   public final boolean g() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI var1) {
      float var24 = 0; // PX-FIX
      Object var23 = null; // PX-FIX
      float var22 = 0; // PX-FIX
      int[] var2;
      me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var19;
      label140: {
         int[] var10000 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
         short var10002 = -21639;
         short var10003 = -2757;
         Intrinsics.checkNotNullParameter(var1, "event");
         var2 = var10000;
         boolean var18 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         if (var2 != null) {
            if (!IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
               return;
            }

            var19 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
            if (var2 == null) {
               break label140;
            }

            var18 = ((java.util.function.Supplier<Boolean>)(() -> { IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.a(10); return false; })).get();
         }

         if (!var18) {
            return;
         }

         var19 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      var19.f();
      if (var2 != null) {
         LocalPlayer var20 = this.a().player;
         if (var20 != null) {
            LocalPlayer var3 = var20;
            Vec3 var4 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.A();
            if (var2 != null && lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null) {
               float var8;
               float var9;
               float var10;
               label122: {
                  label121: {
                     label143: {
                        Vec3 var5 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                        lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var6 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .a(var4, var5);
                        float var7 = var6.b();
                        var8 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           .c(var6.a() - var3.getYRot());
                        var9 = var7 - var3.getXRot();
                        var10 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var8, var9);
                        float var26;
                        int var21 = (var26 = var10 - 0.03F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
                        if (var2 != null) {
                           if (var21 < 0) {
                              var3.setYRot(var6.a());
                              var3.setXRot(RangesKt.coerceIn(var7, -90.0F, 90.0F));
                              return;
                           }

                           var22 = var10;
                           if (var2 == null) {
                              break label143;
                           }

                           float var27;
                           var21 = (var27 = var10 - 1.0F) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
                        }

                        if (var21 > 0) {
                           int var11 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl++;
                           var23 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                           if (var2 != null) {
                              if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl >= 30 + Random.Default.nextInt(20)) {
                                 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0;
                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0.92F
                                    + Random.Default.nextFloat() * 0.16F;
                              }

                              var23 = Random.Default.nextInt(14);
                           }

                           if (var2 != null) {
                              if ((me.octo.client.PxTruth.truth(var23))) {
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.95F
                                    + Random.Default.nextFloat() * 0.1F;
                              }

                              var23 = Random.Default.nextInt(18);
                           }

                           if (var2 == null) {
                              break label122;
                           }

                           if (!(me.octo.client.PxTruth.truth(var23))) {
                              break label121;
                           }

                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0.94F + Random.Default.nextFloat() * 0.12F;
                           if (var2 != null) {
                              break label121;
                           }
                        }

                        llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 1.0F;
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 1.0F;
                        var22 = 1.0F;
                     }

                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var22;
                  }

                  float var28;
                  var23 = (var28 = var10 - 30.0F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
               }

               label146: {
                  if (var2 != null) {
                     if ((me.octo.client.PxTruth.truth(var23))) {
                        var24 = 0.22F;
                        break label146;
                     }

                     float var29;
                     var23 = (var29 = var10 - 10.0F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                  }

                  if (var2 != null) {
                     if ((me.octo.client.PxTruth.truth(var23))) {
                        var24 = 0.14F;
                        break label146;
                     }

                     float var30;
                     var23 = (var30 = var10 - 6.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                  }

                  if (var2 != null) {
                     if ((me.octo.client.PxTruth.truth(var23))) {
                        var24 = 0.16F;
                        break label146;
                     }

                     float var31;
                     var23 = (var31 = var10 - 1.0F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
                  }

                  if (var2 != null) {
                     if ((me.octo.client.PxTruth.truth(var23))) {
                        var24 = 0.22F;
                        break label146;
                     }

                     var24 = var10;
                     if (var2 == null) {
                        break label146;
                     }

                     float var32;
                     var23 = (var32 = var10 - 0.0F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
                  }

                  var24 = (me.octo.client.PxTruth.truth(var23)) ? 0.22F : 1.0F;
               }

               float var17 = var24;
               float var12 = var8
                  * var17
                  * llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                  * lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
               float var13 = var9
                  * var17
                  * llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                  * lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  * 0.85F;
               float var25 = var10;
               if (var2 != null) {
                  var25 = var10 < 1.0F ? 0.18F : 5.0F;
               }

               float var14 = var25;
               float var15 = RangesKt.coerceIn(var12, -var14, var14);
               float var16 = RangesKt.coerceIn(var13, -var14, var14);
               var3.setYRot(var3.getYRot() + var15);
               var3.setXRot(RangesKt.coerceIn(var3.getXRot() + var16, -90.0F, 90.0F));
               return;
            }

            return;
         }
      }
   }

   public final void a(@NotNull Vec3 var1) {
      int[] var10000 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
      short var10002 = -21640;
      short var10003 = 28797;
      Intrinsics.checkNotNullParameter(var1, "point");
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
      int[] var2 = var10000;
      boolean var3 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      if (var2 != null) {
         if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            return;
         }

         var3 = true;
      }

      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var3;
   }

   public final void h() {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = null;
   }

   public final double b(@NotNull Vec3 var1) {
      Object var8 = null; // PX-FIX
      int[] var2;
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var4;
      me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var7;
      float var9;
      float var13;
      label25: {
         short var10001 = -21638;
         short var10002 = 17942;
         Intrinsics.checkNotNullParameter(var1, "point");
         int[] var10000 = IllIllllIlIllIIIlIlIlIllllllllIlIlIIllIIIIIllllIIlllIllIlIlIIIIIlIlllIlllIllIIlllllll.l();
         Vec3 var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.A();
         var4 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a(var3, var1);
         var2 = var10000;
         var7 = me.octo.client.utils.player.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         var9 = var4.a();
         if (var2 != null) {
            LocalPlayer var12 = this.a().player;
            if (var12 != null) {
               var13 = var12.getYRot();
               break label25;
            }
         }

         var13 = 0.0F;
      }

      float var5;
      label19: {
         var5 = var7.c(var9 - var13);
         var8 = var4.b();
         if (var2 != null) {
            LocalPlayer var10 = this.a().player;
            if (var10 != null) {
               var9 = var10.getXRot();
               break label19;
            }
         }

         var9 = 0.0F;
      }

      float var6 = ((Float)var8) - var9;
      return me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var5, var6);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Ù¸«\u001f½\u0005/\u0007ÎÒ\u009c\u0005\u009a\u0004Ã\u0088°";
      int var4 = "Ù¸«\u001f½\u0005/\u0007ÎÒ\u009c\u0005\u009a\u0004Ã\u0088°".length();
      char var1 = 5;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 31;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 31;
               var10006 = var6;
            } else {
               var13 = 31;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 31;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 24;
                  case 1 -> 105;
                  case 2 -> 120;
                  case 3 -> 53;
                  case 4 -> 11;
                  case 5 -> 4;
                  default -> 61;
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
            c = var5;
            d = new String[3];
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlIlIlllIllIllIlIIllIlIIIlIIllIIllIIIlIlIIIllIlIIllIIllIIIllIIllIIIlllllIlIlIIlIIIIl();
            me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .a(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 1.0F;
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 1.0F;
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 1.0F;
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21640) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 195;
            case 1 -> 230;
            case 2 -> 215;
            case 3 -> 9;
            case 4 -> 88;
            case 5 -> 175;
            case 6 -> 13;
            case 7 -> 239;
            case 8 -> 1;
            case 9 -> 31;
            case 10 -> 143;
            case 11 -> 10;
            case 12 -> 163;
            case 13 -> 53;
            case 14 -> 83;
            case 15 -> 141;
            case 16 -> 252;
            case 17 -> 5;
            case 18 -> 188;
            case 19 -> 217;
            case 20 -> 108;
            case 21 -> 179;
            case 22 -> 131;
            case 23 -> 147;
            case 24 -> 165;
            case 25 -> 104;
            case 26 -> 105;
            case 27 -> 136;
            case 28 -> 93;
            case 29 -> 23;
            case 30 -> 185;
            case 31 -> 164;
            case 32 -> 198;
            case 33 -> 110;
            case 34 -> 44;
            case 35 -> 246;
            case 36 -> 218;
            case 37 -> 26;
            case 38 -> 70;
            case 39 -> 78;
            case 40 -> 238;
            case 41 -> 20;
            case 42 -> 203;
            case 43 -> 57;
            case 44 -> 210;
            case 45 -> 48;
            case 46 -> 106;
            case 47 -> 162;
            case 48 -> 133;
            case 49 -> 14;
            case 50 -> 176;
            case 51 -> 68;
            case 52 -> 103;
            case 53 -> 135;
            case 54 -> 219;
            case 55 -> 192;
            case 56 -> 152;
            case 57 -> 86;
            case 58 -> 18;
            case 59 -> 237;
            case 60 -> 241;
            case 61 -> 24;
            case 62 -> 244;
            case 63 -> 119;
            case 64 -> 63;
            case 65 -> 220;
            case 66 -> 59;
            case 67 -> 177;
            case 68 -> 55;
            case 69 -> 47;
            case 70 -> 60;
            case 71 -> 113;
            case 72 -> 17;
            case 73 -> 201;
            case 74 -> 116;
            case 75 -> 234;
            case 76 -> 167;
            case 77 -> 3;
            case 78 -> 216;
            case 79 -> 52;
            case 80 -> 15;
            case 81 -> 255;
            case 82 -> 206;
            case 83 -> 232;
            case 84 -> 197;
            case 85 -> 32;
            case 86 -> 102;
            case 87 -> 112;
            case 88 -> 75;
            case 89 -> 171;
            case 90 -> 81;
            case 91 -> 92;
            case 92 -> 245;
            case 93 -> 76;
            case 94 -> 148;
            case 95 -> 251;
            case 96 -> 221;
            case 97 -> 151;
            case 98 -> 30;
            case 99 -> 172;
            case 100 -> 37;
            case 101 -> 16;
            case 102 -> 159;
            case 103 -> 12;
            case 104 -> 2;
            case 105 -> 95;
            case 106 -> 111;
            case 107 -> 208;
            case 108 -> 183;
            case 109 -> 127;
            case 110 -> 235;
            case 111 -> 8;
            case 112 -> 134;
            case 113 -> 253;
            case 114 -> 144;
            case 115 -> 73;
            case 116 -> 137;
            case 117 -> 222;
            case 118 -> 38;
            case 119 -> 225;
            case 120 -> 190;
            case 121 -> 211;
            case 122 -> 205;
            case 123 -> 7;
            case 124 -> 33;
            case 125 -> 11;
            case 126 -> 43;
            case 127 -> 227;
            case 128 -> 89;
            case 129 -> 145;
            case 130 -> 194;
            case 131 -> 243;
            case 132 -> 247;
            case 133 -> 228;
            case 134 -> 223;
            case 135 -> 72;
            case 136 -> 69;
            case 137 -> 140;
            case 138 -> 233;
            case 139 -> 169;
            case 140 -> 149;
            case 141 -> 248;
            case 142 -> 28;
            case 143 -> 138;
            case 144 -> 150;
            case 145 -> 153;
            case 146 -> 200;
            case 147 -> 182;
            case 148 -> 125;
            case 149 -> 77;
            case 150 -> 120;
            case 151 -> 199;
            case 152 -> 161;
            case 153 -> 214;
            case 154 -> 123;
            case 155 -> 191;
            case 156 -> 115;
            case 157 -> 41;
            case 158 -> 25;
            case 159 -> 54;
            case 160 -> 117;
            case 161 -> 130;
            case 162 -> 66;
            case 163 -> 34;
            case 164 -> 61;
            case 165 -> 87;
            case 166 -> 158;
            case 167 -> 146;
            case 168 -> 122;
            case 169 -> 114;
            case 170 -> 96;
            case 171 -> 45;
            case 172 -> 126;
            case 173 -> 173;
            case 174 -> 84;
            case 175 -> 36;
            case 176 -> 187;
            case 177 -> 40;
            case 178 -> 189;
            case 179 -> 186;
            case 180 -> 82;
            case 181 -> 46;
            case 182 -> 193;
            case 183 -> 56;
            case 184 -> 174;
            case 185 -> 80;
            case 186 -> 21;
            case 187 -> 27;
            case 188 -> 64;
            case 189 -> 50;
            case 190 -> 240;
            case 191 -> 184;
            case 192 -> 231;
            case 193 -> 121;
            case 194 -> 90;
            case 195 -> 157;
            case 196 -> 129;
            case 197 -> 202;
            case 198 -> 154;
            case 199 -> 35;
            case 200 -> 79;
            case 201 -> 124;
            case 202 -> 51;
            case 203 -> 128;
            case 204 -> 142;
            case 205 -> 242;
            case 206 -> 62;
            case 207 -> 166;
            case 208 -> 204;
            case 209 -> 101;
            case 210 -> 71;
            case 211 -> 42;
            case 212 -> 229;
            case 213 -> 156;
            case 214 -> 132;
            case 215 -> 209;
            case 216 -> 168;
            case 217 -> 39;
            case 218 -> 100;
            case 219 -> 97;
            case 220 -> 107;
            case 221 -> 213;
            case 222 -> 207;
            case 223 -> 109;
            case 224 -> 91;
            case 225 -> 196;
            case 226 -> 181;
            case 227 -> 6;
            case 228 -> 139;
            case 229 -> 0;
            case 230 -> 98;
            case 231 -> 155;
            case 232 -> 85;
            case 233 -> 94;
            case 234 -> 4;
            case 235 -> 226;
            case 236 -> 65;
            case 237 -> 224;
            case 238 -> 254;
            case 239 -> 29;
            case 240 -> 160;
            case 241 -> 58;
            case 242 -> 118;
            case 243 -> 250;
            case 244 -> 236;
            case 245 -> 249;
            case 246 -> 74;
            case 247 -> 67;
            case 248 -> 170;
            case 249 -> 212;
            case 250 -> 99;
            case 251 -> 180;
            case 252 -> 22;
            case 253 -> 49;
            case 254 -> 178;
            default -> 19;
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
