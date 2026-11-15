package me.octo.client;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll
   extends lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII {
   @NotNull
   public static llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] c;
   private static String[] d;

   public llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll() {
      super(0.02F, 0.03F, 1.0F);
   }

   @NotNull
   @Override
   public String m() {
      short var10000 = 21929;
      short var10001 = -5080;
      return "InventoryHUD";
   }

   @Override
   public void n() {
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = this.y();
      boolean var1 = var10000;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         0.0F, 0.0F, var2.e(), var2.f(), IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.b(), 10.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         0.0F, 0.0F, var2.e(), var2.f(), 1.0F, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c(), 10.0F
      );
      float var6 = var2.g();
      float var10001 = 0.0F;
      if (var1) {
         if (!(var6 > 0.0F)) {
            return;
         }

         var6 = var2.d() + 3.0F * var2.a() + var2.g() / 2.0F;
         var10001 = 0.5F;
      }

      float var3 = var6 - var10001;
      float var4 = var2.d() + 4.0F;
      float var5 = var2.e() - var2.d() - 4.0F;
      this.a(var4, var3, var5, IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d());
   }

   private final void a(
      float var1, float var2, float var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4
   ) {
      float var6 = 3.0F;
      float var7 = 3.0F;
      float var8 = 2.0F;
      float var9 = var6 + var7;
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      float var10 = var1;
      boolean var5 = var10000;

      while (var10 < var3) {
         float var11 = Math.min(var6, var3 - var10);
         float var12 = var11;
         float var10001 = 0.0F;
         if (var5) {
            if (var11 <= 0.0F) {
               break;
            }

            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var10, var2, var11, var8, var4, 0.0F);
            var12 = var10;
            var10001 = var9;
         }

         var10 = var12 + var10001;
         if (!var5) {
            break;
         }
      }
   }

   @Override
   public void u() {
      this.a(this.y());
   }

   private final void a(
      llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      Object var20 = null; // PX-FIX
      boolean var2 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      if (var2) {
         LocalPlayer var10000 = this.a().player;
         if (var10000 != null) {
            LocalPlayer var3 = var10000;
            byte var4 = ((me.octo.client.PXDyn)(Object)(IlllIIlIIIllIIIllIlIllIlIlIIIIllIIIllIIlIIIlllIllIlIllIllIIIIlIIIlIIlIlIIIIIIlIlllIlI.a())).ae();
            int var5 = 9;

            while (true) {
               if (var5 < 36) {
                  int var6 = var5 - 9;
                  ItemStack var19 = var3.getInventory().getItem(var5);
                  short var10002 = 21922;
                  short var10003 = 7899;
                  Intrinsics.checkNotNullExpressionValue(var19, "getItem(...)");
                  ItemStack var7 = var19;
                  if (var2) {
                     var20 = var7.isEmpty();
                     if (!var2) {
                        break;
                     }

                     label68:
                     if (((Boolean)(var20))) {
                        int var21 = var7.getCount();
                        int var10001 = 1;
                        if (var2) {
                           if (var21 <= 1) {
                              break label68;
                           }

                           var21 = var6;
                           var10001 = var1.b();
                        }

                        int var8 = var21 / var10001;
                        int var9 = var6 % var1.b();
                        float var10 = var1.d() + var9 * var1.a();
                        float var11 = var1.d() + var8 * var1.a();
                        this.a(String.valueOf(var7.getCount()), var10, var11, var1.a());
                     }

                     var5++;
                  }

                  if (var2) {
                     continue;
                  }
               }

               var20 = var4;
               break;
            }

            if (var2) {
               if (!((Boolean)var20)) {
                  return;
               }

               var20 = 0;
            }

            var5 =((Integer)( var20));

            while (var5 < 9) {
               ItemStack var22 = var3.getInventory().getItem(var5);
               short var25 = 21922;
               short var26 = 7899;
               Intrinsics.checkNotNullExpressionValue(var22, "getItem(...)");
               ItemStack var13 = var22;
               if (var2) {
                  label43:
                  if (!var13.isEmpty()) {
                     int var23 = var13.getCount();
                     int var24 = 1;
                     if (var2) {
                        if (var23 <= 1) {
                           break label43;
                        }

                        var23 = var5;
                        var24 = var1.c();
                     }

                     int var14 = var23 + var24;
                     int var15 = var14 / var1.b();
                     int var16 = var14 % var1.b();
                     float var17 = var1.d() + var16 * var1.a();
                     float var18 = var1.d() + var15 * var1.a() + var1.g();
                     this.a(String.valueOf(var13.getCount()), var17, var18, var1.a());
                  }

                  var5++;
               }

               if (!var2) {
                  break;
               }
            }

            return;
         }
      }
   }

   private final void a(String var1, float var2, float var3, float var4) {
      float var5 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var1, false, 2, null);
      float var6 = 4.0F;
      float var7 = var5 + var6 * 2.0F;
      float var8 = 12.0F;
      float var9 = var2 + var4 - var7 - 4.0F;
      float var10 = var3 + var4 - var8 - 4.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var10,
         var7,
         var8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.85F),
         4.0F
      );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var1, var9 + var6, var10 + 1.0, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, false, 16, null);
   }

   @Override
   public void o() {
      this.n();
   }

   @Override
   public void a(@NotNull GuiGraphicsExtractor var1) {
      Object var16 = null; // PX-FIX
      boolean var2;
      llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3;
      float var4;
      float var5;
      float var6;
      float var15;
      label37: {
         boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
         short var10002 = 21928;
         short var10003 = -3676;
         Intrinsics.checkNotNullParameter(var1, "context");
         var2 = var10000;
         short var10 = 21931;
         var3 = this.y();
         short var10001 = 7362;
         var4 = this.k();
         var5 = this.l();
         var6 = this.g();
         String var11 = System.getProperty("os.name");
         var10002 = 21933;
         var10003 = 17711;
         Intrinsics.checkNotNullExpressionValue(var11, "getProperty(...)");
         String var12 = var11.toLowerCase(Locale.ROOT);
         var10002 = 21934;
         var10003 = -23782;
         Intrinsics.checkNotNullExpressionValue(var12, "toLowerCase(...)");
         CharSequence var13 = var12;
         var10001 = 21935;
         var10002 = 3549;
         byte var7 = ((byte)((StringsKt.contains(var13, "mac", false)) ? 1 : 0));
         int var14 = var7;
         if (var2) {
            if (var7 != 0) {
               var15 = (float)this.a().getWindow().getScreenWidth() / RangesKt.coerceAtLeast(this.a().getWindow().getGuiScaledWidth(), 1);
               break label37;
            }

            var14 = this.a().getWindow().getGuiScale();
         }

         var15 = var14;
      }

      float var8;
      var8 = RangesKt.coerceAtLeast(var15, 1.0F);
      var16 = this.a().screen instanceof lllIIIlIllllIIlIlllIlIlIllIIIlIlllllIIIlIIIIlIllIlIlIllIllIIllIIllllIIllIIIllllIlIIlI;
      label31:
      if (var2) {
         if (!((Boolean)var16)) {
            var16 = this.a().screen instanceof lIIlIlIIllIllllIIIllIIIIIlIIlIllIllllIIlllIIIIIlIlIlllIlIIIlllIlIIlIlllllIIlIIIIIIIll;
            if (!var2) {
               break label31;
            }

            if (!((Boolean)var16)) {
               var16 = false;
               break label31;
            }
         }

         var16 = true;
      }

      boolean var9 =((Boolean)( var16));
      if (var2) {
         if (var9) {
            this.b(var1, var3, var4, var5, var6, var8);
         }

         this.a(var1, var3, var4, var5, var6, var8);
      }
   }

   private final void a(
      GuiGraphicsExtractor var1,
      llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2,
      float var3,
      float var4,
      float var5,
      float var6
   ) {
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
      boolean var8 = ((me.octo.client.PXDyn)(Object)(IlllIIlIIIllIIIllIlIllIlIlIIIIllIIIllIIlIIIlllIllIlIllIllIIIIlIIIlIIlIlIIIIIIlIlllIlI.a())).ae();
      boolean var7 = var10000;
      if (!var7) {
         LocalPlayer var31 = this.a().player;
         if (var31 != null) {
            LocalPlayer var9 = var31;
            float var10 = var3 + var2.d() * var5;
            float var11 = var4 + var2.d() * var5;
            float var12 = var2.a() * var5;
            float var13 = RangesKt.coerceAtLeast(2.5F * var5 / var6, 0.1F);
            float var14 = 16.0F * var6 * var13;
            float var15 = RangesKt.coerceAtLeast((var12 - var14) * 0.5F, 0.0F);
            int var16 = 9;

            while (true) {
               if (var16 < 36) {
                  int var17 = var16 - 9;
                  int var18 = var17 / var2.b();
                  int var19 = var17 % var2.b();
                  float var20 = var10 + var19 * var12 + var15;
                  float var21 = var11 + var18 * var12 + var15;
                  ItemStack var32 = var9.getInventory().getItem(var16);
                  short var10002 = 21932;
                  short var10003 = 30935;
                  Intrinsics.checkNotNullExpressionValue(var32, "getItem(...)");
                  ItemStack var22 = var32;
                  if (!var7) {
                     var10000 = var22.isEmpty();
                     if (var7) {
                        break;
                     }

                     if (!var10000) {
                        this.a(var1, var22, var20 / var6, var21 / var6, var13);
                     }

                     var16++;
                  }

                  if (!var7) {
                     continue;
                  }
               }

               var10000 = var8;
               break;
            }

            if (!var10000) {
               float var24 = var2.g() * var5;
               int var25 = 0;

               while (var25 < 9) {
                  int var26 = var25 + var2.c();
                  int var27 = var26 / var2.b();
                  int var28 = var26 % var2.b();
                  float var29 = var10 + var28 * var12 + var15;
                  float var30 = var11 + var27 * var12 + var15 + var24;
                  ItemStack var34 = var9.getInventory().getItem(var25);
                  short var35 = 21922;
                  short var36 = 7899;
                  Intrinsics.checkNotNullExpressionValue(var34, "getItem(...)");
                  ItemStack var23 = var34;
                  if (!var7) {
                     if (!var23.isEmpty()) {
                        this.a(var1, var23, var29 / var6, var30 / var6, var13);
                     }

                     var25++;
                  }

                  if (var7) {
                     break;
                  }
               }
            }

            return;
         }
      }
   }

   private final void b(
      GuiGraphicsExtractor var1,
      llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2,
      float var3,
      float var4,
      float var5,
      float var6
   ) {
      int var8 = (int)(var3 / var6);
      int var9 = (int)(var4 / var6);
      int var10 = (int)((var3 + var2.e() * var5) / var6);
      int var11 = (int)((var4 + var2.f() * var5) / var6);
      int var12 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.b().o();
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      int var13 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c().o();
      var1.fill(var8, var9, var10, var11, var12);
      boolean var7 = var10000;
      int var14 = RangesKt.coerceAtLeast((int)(1.0F * var5 / var6), 1);
      int var15 = 0;

      while (var15 < var14) {
         var1.fill(var8 + var15, var9 + var15, var10 - var15, var9 + var15 + 1, var13);
         var1.fill(var8 + var15, var11 - var15 - 1, var10 - var15, var11 - var15, var13);
         var1.fill(var8 + var15, var9 + var15, var8 + var15 + 1, var11 - var15, var13);
         var1.fill(var10 - var15 - 1, var9 + var15, var10 - var15, var11 - var15, var13);
         var15++;
         if (!var7) {
            break;
         }
      }
   }

   private final void a(GuiGraphicsExtractor var1, ItemStack var2, float var3, float var4, float var5) {
      var1.pose().pushMatrix();
      var1.pose().translate(var3, var4);
      var1.pose().scale(var5, var5);
      var1.item(var2, 0, 0);
      var1.pose().popMatrix();
   }

   private final llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI y() {
      int var10000 = ((lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w()) ? 1 : 0);
      float var2 = 50.0F;
      boolean var1 = (var10000 != 0);
      byte var3 = 9;
      byte var4 = 27;
      var10000 = ((me.octo.client.PXDyn)(Object)(IlllIIlIIIllIIIllIlIllIlIlIIIIllIIIllIIlIIIlllIllIlIllIllIIIIlIIIlIIlIlIIIIIIlIlllIlI.a())).ae();
      if (var1) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      int var5 = var10000;
      var10000 = var5;
      if (var1) {
         var10000 = var5 != 0 ? var4 + 9 : var4;
      }

      int var6 = var10000;
      int var7 = (int)((float)Math.ceil((float)var6 / var3));
      float var8 = 10.0F;
      float var9 = var5 != 0 ? 8.0F : 0.0F;
      float var10 = var3 * var2 + var8 * 2.0F;
      float var11 = var7 * var2 + var8 * 2.0F + var9;
      return new llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var2, var3, var4, var8, var10, var11, var9
      );
   }

   @Override
   public float q() {
      return this.y().e();
   }

   @Override
   public float r() {
      return this.y().f();
   }

   @Override
   public boolean p() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.ae();
   }

   @Override
   public void v() {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.af();
   }

   @Override
   public boolean s() {
      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "\u000eÔ!)ÞQ\u008c\u0086ò\rcmy\u0019Õ\u0099æ¥ÁFu2\u009b\u0016»CU\ráº\u0093\u0003ì^7\u0014\u008bMÈr\u0007\u0012\u0092x?¹Çò\u0007\u0013¼\u0095\u007fH\u0083Y\f.;E¿B¤i¬Ñw'×\u0010ï\u0015ÝQ5# ^N\u0005ÿ©öÛ«¾\u0003\u0091Û\u0007\f\u009aM:7õ\rÄðq\u008bõ\u008f\u0010Ý\u0083Ò÷î%|ó\u0084UËDïf\u0088\t\fÀñq \u009cÿé®Ô@Aö";
      int var4 = "\u000eÔ!)ÞQ\u008c\u0086ò\rcmy\u0019Õ\u0099æ¥ÁFu2\u009b\u0016»CU\ráº\u0093\u0003ì^7\u0014\u008bMÈr\u0007\u0012\u0092x?¹Çò\u0007\u0013¼\u0095\u007fH\u0083Y\f.;E¿B¤i¬Ñw'×\u0010ï\u0015ÝQ5# ^N\u0005ÿ©öÛ«¾\u0003\u0091Û\u0007\f\u009aM:7õ\rÄðq\u008bõ\u008f\u0010Ý\u0083Ò÷î%|ó\u0084UËDïf\u0088\t\fÀñq \u009cÿé®Ô@Aö"
         .length();
      char var1 = '(';
      int var9 = -1;

      label52:
while (true) {
         byte var10000 = 34;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var36;
               char[] var42;
               int var10006;
               if (var10004 <= 1) {
                  var42 = var26;
                  var36 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var42 = var26;
                  var36 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var42[var10006] = (char)(var42[var10006] ^ var36 ^ switch (var6 % 7) {
                     case 0 -> 22;
                     case 1 -> 96;
                     case 2 -> 50;
                     case 3 -> 116;
                     case 4 -> 28;
                     case 5 -> 6;
                     default -> 8;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var42 = var21;
                     var36 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var42 = var21;
                     var36 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[11];
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object[]) null
                     );
                     var10002 = 21920;
                     short var32 = 9927;
                     short var33 = 21930;
                     short var40 = -5794;
                     IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var41 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                     short var46 = 21923;
                     short var50 = -31426;
                     IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var7 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
                        IlllIIlIIIllIIIllIlIllIlIlIIIIllIIIllIIlIIIlllIllIlIllIllIIIIlIIIlIIlIlIIIIIIlIlllIlI.a()
                     };
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl(
                        "Inventory HUD", "Renders your entire inventory on screen.", var41, "Elements", var7
                     );
                     break label52;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "\u0086`\u000b[4î\u0013x\rúJ\u001aTl\u001ci~\u0014\u0080G\u0098Æ";
                  var4 = "\u0086`\u000b[4î\u0013x\rúJ\u001aTl\u001ci~\u0014\u0080G\u0098Æ".length();
                  var1 = '\b';
                  var9 = -1;
            }

            var10000 = 110;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 21930) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 100;
            case 1 -> 152;
            case 2 -> 191;
            case 3 -> 236;
            case 4 -> 10;
            case 5 -> 22;
            case 6 -> 163;
            case 7 -> 188;
            case 8 -> 177;
            case 9 -> 165;
            case 10 -> 83;
            case 11 -> 93;
            case 12 -> 242;
            case 13 -> 48;
            case 14 -> 158;
            case 15 -> 109;
            case 16 -> 89;
            case 17 -> 113;
            case 18 -> 166;
            case 19 -> 35;
            case 20 -> 139;
            case 21 -> 6;
            case 22 -> 106;
            case 23 -> 18;
            case 24 -> 30;
            case 25 -> 149;
            case 26 -> 213;
            case 27 -> 133;
            case 28 -> 155;
            case 29 -> 129;
            case 30 -> 135;
            case 31 -> 214;
            case 32 -> 222;
            case 33 -> 65;
            case 34 -> 29;
            case 35 -> 0;
            case 36 -> 13;
            case 37 -> 108;
            case 38 -> 121;
            case 39 -> 96;
            case 40 -> 16;
            case 41 -> 8;
            case 42 -> 232;
            case 43 -> 223;
            case 44 -> 92;
            case 45 -> 3;
            case 46 -> 157;
            case 47 -> 78;
            case 48 -> 127;
            case 49 -> 237;
            case 50 -> 186;
            case 51 -> 19;
            case 52 -> 138;
            case 53 -> 64;
            case 54 -> 142;
            case 55 -> 234;
            case 56 -> 111;
            case 57 -> 34;
            case 58 -> 246;
            case 59 -> 82;
            case 60 -> 52;
            case 61 -> 145;
            case 62 -> 173;
            case 63 -> 46;
            case 64 -> 245;
            case 65 -> 204;
            case 66 -> 67;
            case 67 -> 70;
            case 68 -> 69;
            case 69 -> 58;
            case 70 -> 144;
            case 71 -> 24;
            case 72 -> 164;
            case 73 -> 146;
            case 74 -> 243;
            case 75 -> 27;
            case 76 -> 38;
            case 77 -> 123;
            case 78 -> 202;
            case 79 -> 44;
            case 80 -> 154;
            case 81 -> 206;
            case 82 -> 102;
            case 83 -> 183;
            case 84 -> 94;
            case 85 -> 221;
            case 86 -> 229;
            case 87 -> 220;
            case 88 -> 126;
            case 89 -> 230;
            case 90 -> 49;
            case 91 -> 150;
            case 92 -> 105;
            case 93 -> 231;
            case 94 -> 86;
            case 95 -> 68;
            case 96 -> 7;
            case 97 -> 207;
            case 98 -> 115;
            case 99 -> 117;
            case 100 -> 116;
            case 101 -> 9;
            case 102 -> 85;
            case 103 -> 148;
            case 104 -> 25;
            case 105 -> 178;
            case 106 -> 192;
            case 107 -> 5;
            case 108 -> 190;
            case 109 -> 248;
            case 110 -> 62;
            case 111 -> 180;
            case 112 -> 36;
            case 113 -> 208;
            case 114 -> 47;
            case 115 -> 227;
            case 116 -> 28;
            case 117 -> 103;
            case 118 -> 130;
            case 119 -> 176;
            case 120 -> 174;
            case 121 -> 181;
            case 122 -> 59;
            case 123 -> 200;
            case 124 -> 194;
            case 125 -> 211;
            case 126 -> 114;
            case 127 -> 2;
            case 128 -> 132;
            case 129 -> 31;
            case 130 -> 252;
            case 131 -> 162;
            case 132 -> 104;
            case 133 -> 201;
            case 134 -> 87;
            case 135 -> 80;
            case 136 -> 197;
            case 137 -> 175;
            case 138 -> 215;
            case 139 -> 66;
            case 140 -> 118;
            case 141 -> 20;
            case 142 -> 209;
            case 143 -> 255;
            case 144 -> 75;
            case 145 -> 193;
            case 146 -> 240;
            case 147 -> 45;
            case 148 -> 217;
            case 149 -> 254;
            case 150 -> 147;
            case 151 -> 249;
            case 152 -> 151;
            case 153 -> 4;
            case 154 -> 40;
            case 155 -> 228;
            case 156 -> 196;
            case 157 -> 195;
            case 158 -> 185;
            case 159 -> 205;
            case 160 -> 32;
            case 161 -> 167;
            case 162 -> 54;
            case 163 -> 101;
            case 164 -> 187;
            case 165 -> 21;
            case 166 -> 253;
            case 167 -> 55;
            case 168 -> 97;
            case 169 -> 136;
            case 170 -> 159;
            case 171 -> 53;
            case 172 -> 179;
            case 173 -> 168;
            case 174 -> 14;
            case 175 -> 218;
            case 176 -> 56;
            case 177 -> 238;
            case 178 -> 39;
            case 179 -> 247;
            case 180 -> 203;
            case 181 -> 11;
            case 182 -> 184;
            case 183 -> 172;
            case 184 -> 171;
            case 185 -> 91;
            case 186 -> 112;
            case 187 -> 23;
            case 188 -> 98;
            case 189 -> 41;
            case 190 -> 57;
            case 191 -> 1;
            case 192 -> 239;
            case 193 -> 42;
            case 194 -> 160;
            case 195 -> 120;
            case 196 -> 119;
            case 197 -> 43;
            case 198 -> 235;
            case 199 -> 76;
            case 200 -> 210;
            case 201 -> 17;
            case 202 -> 226;
            case 203 -> 50;
            case 204 -> 225;
            case 205 -> 88;
            case 206 -> 71;
            case 207 -> 124;
            case 208 -> 99;
            case 209 -> 156;
            case 210 -> 199;
            case 211 -> 244;
            case 212 -> 251;
            case 213 -> 15;
            case 214 -> 51;
            case 215 -> 143;
            case 216 -> 141;
            case 217 -> 63;
            case 218 -> 125;
            case 219 -> 107;
            case 220 -> 61;
            case 221 -> 182;
            case 222 -> 12;
            case 223 -> 122;
            case 224 -> 233;
            case 225 -> 84;
            case 226 -> 212;
            case 227 -> 216;
            case 228 -> 33;
            case 229 -> 79;
            case 230 -> 137;
            case 231 -> 77;
            case 232 -> 170;
            case 233 -> 161;
            case 234 -> 95;
            case 235 -> 241;
            case 236 -> 128;
            case 237 -> 37;
            case 238 -> 90;
            case 239 -> 224;
            case 240 -> 60;
            case 241 -> 81;
            case 242 -> 74;
            case 243 -> 134;
            case 244 -> 72;
            case 245 -> 189;
            case 246 -> 153;
            case 247 -> 73;
            case 248 -> 140;
            case 249 -> 26;
            case 250 -> 198;
            case 251 -> 110;
            case 252 -> 169;
            case 253 -> 219;
            case 254 -> 131;
            default -> 250;
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         float var1, int var2, int var3, float var4, float var5, float var6, float var7
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
      }

      public final float a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final float f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final float g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final float h() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int i() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int j() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float k() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float l() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final float m() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final float n() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         float var1, int var2, int var3, float var4, float var5, float var6, float var7
      ) {
         return new llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -16991;
         float var1 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         float var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         float var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         float var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         float var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 7008;
         short var10002 = -16992;
         short var10003 = -23779;
         short var10004 = -16985;
         short var10005 = 11528;
         short var10006 = -16987;
         short var10007 = -29183;
         short var10008 = -16988;
         short var10009 = 32709;
         short var10010 = -16986;
         short var10011 = -10119;
         short var10012 = -16990;
         short var10013 = -17888;
         return "Layout(slotSize="
            + var7
            + ", itemsPerRow="
            + var6
            + ", inventorySlots="
            + var5
            + ", padding="
            + var4
            + ", totalWidth="
            + var3
            + ", totalHeight="
            + var2
            + ", hotbarGap="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Float.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var1 = var1 * 31 + Float.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var1 = var1 * 31 + Float.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         return var1 * 31 + Float.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
         Object var10000 = this;
         if (!var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (!var2) {
            if (!(
               var10000 instanceof llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = Float.compare(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (!var2) {
            if (var4 != 0) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label80: {
            int var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (!var2) {
               if (var4 != var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
                  return false;
               }

               var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var2) {
                  break label80;
               }

               var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (!var2) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         if (!var2) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            );
         }

         if (!var2) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            );
         }

         if (!var2) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "â®ÔçC÷R*ªÉ\u001cî¬\neð \"I\u0085\u0004øËÔ\u000eö_VÙ\u00130XÍçÄ+ãr\u0088\u0011ÊáÌ\u000füÏå\u008a\u0018\u008c\u0081©âÏ\u0007`r\u000eDØ\u001d2Õ9¬y\u0085RRNÍÚ";
         int var4 = "â®ÔçC÷R*ªÉ\u001cî¬\neð \"I\u0085\u0004øËÔ\u000eö_VÙ\u00130XÍçÄ+ãr\u0088\u0011ÊáÌ\u000füÏå\u008a\u0018\u008c\u0081©âÏ\u0007`r\u000eDØ\u001d2Õ9¬y\u0085RRNÍÚ"
            .length();
         char var1 = '\r';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 63;
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
                        case 0 -> 29;
                        case 1 -> 23;
                        case 2 -> 46;
                        case 3 -> 67;
                        case 4 -> 74;
                        case 5 -> 88;
                        default -> 61;
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
                        a = var5;
                        b = new String[7];
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

                     var2 = "Æ¾ \u009da¼bÁt\u000esV\u00044~÷\f \\\u0081¨g\fÊ\u0002*Yò\u001d";
                     var4 = "Æ¾ \u009da¼bÁt\u000esV\u00044~÷\f \\\u0081¨g\fÊ\u0002*Yò\u001d".length();
                     var1 = 16;
                     var8 = -1;
               }

               var10000 = 101;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -16988) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 56;
               case 1 -> 89;
               case 2 -> 11;
               case 3 -> 196;
               case 4 -> 221;
               case 5 -> 182;
               case 6 -> 83;
               case 7 -> 242;
               case 8 -> 74;
               case 9 -> 170;
               case 10 -> 46;
               case 11 -> 88;
               case 12 -> 96;
               case 13 -> 30;
               case 14 -> 79;
               case 15 -> 190;
               case 16 -> 103;
               case 17 -> 84;
               case 18 -> 48;
               case 19 -> 76;
               case 20 -> 222;
               case 21 -> 195;
               case 22 -> 238;
               case 23 -> 252;
               case 24 -> 207;
               case 25 -> 224;
               case 26 -> 245;
               case 27 -> 114;
               case 28 -> 65;
               case 29 -> 185;
               case 30 -> 77;
               case 31 -> 61;
               case 32 -> 200;
               case 33 -> 186;
               case 34 -> 125;
               case 35 -> 210;
               case 36 -> 131;
               case 37 -> 119;
               case 38 -> 124;
               case 39 -> 47;
               case 40 -> 6;
               case 41 -> 118;
               case 42 -> 117;
               case 43 -> 51;
               case 44 -> 192;
               case 45 -> 228;
               case 46 -> 52;
               case 47 -> 239;
               case 48 -> 177;
               case 49 -> 35;
               case 50 -> 251;
               case 51 -> 22;
               case 52 -> 184;
               case 53 -> 241;
               case 54 -> 178;
               case 55 -> 226;
               case 56 -> 60;
               case 57 -> 101;
               case 58 -> 181;
               case 59 -> 197;
               case 60 -> 160;
               case 61 -> 165;
               case 62 -> 153;
               case 63 -> 141;
               case 64 -> 193;
               case 65 -> 21;
               case 66 -> 163;
               case 67 -> 99;
               case 68 -> 216;
               case 69 -> 212;
               case 70 -> 90;
               case 71 -> 150;
               case 72 -> 26;
               case 73 -> 53;
               case 74 -> 91;
               case 75 -> 183;
               case 76 -> 127;
               case 77 -> 95;
               case 78 -> 97;
               case 79 -> 132;
               case 80 -> 44;
               case 81 -> 179;
               case 82 -> 71;
               case 83 -> 204;
               case 84 -> 156;
               case 85 -> 142;
               case 86 -> 253;
               case 87 -> 58;
               case 88 -> 172;
               case 89 -> 25;
               case 90 -> 126;
               case 91 -> 16;
               case 92 -> 27;
               case 93 -> 109;
               case 94 -> 122;
               case 95 -> 67;
               case 96 -> 102;
               case 97 -> 98;
               case 98 -> 203;
               case 99 -> 106;
               case 100 -> 246;
               case 101 -> 180;
               case 102 -> 211;
               case 103 -> 158;
               case 104 -> 173;
               case 105 -> 164;
               case 106 -> 147;
               case 107 -> 199;
               case 108 -> 73;
               case 109 -> 64;
               case 110 -> 134;
               case 111 -> 162;
               case 112 -> 213;
               case 113 -> 169;
               case 114 -> 215;
               case 115 -> 219;
               case 116 -> 244;
               case 117 -> 235;
               case 118 -> 225;
               case 119 -> 2;
               case 120 -> 66;
               case 121 -> 50;
               case 122 -> 57;
               case 123 -> 146;
               case 124 -> 75;
               case 125 -> 120;
               case 126 -> 202;
               case 127 -> 72;
               case 128 -> 168;
               case 129 -> 233;
               case 130 -> 115;
               case 131 -> 40;
               case 132 -> 175;
               case 133 -> 111;
               case 134 -> 69;
               case 135 -> 123;
               case 136 -> 19;
               case 137 -> 59;
               case 138 -> 7;
               case 139 -> 194;
               case 140 -> 55;
               case 141 -> 145;
               case 142 -> 247;
               case 143 -> 161;
               case 144 -> 87;
               case 145 -> 29;
               case 146 -> 20;
               case 147 -> 130;
               case 148 -> 154;
               case 149 -> 82;
               case 150 -> 63;
               case 151 -> 5;
               case 152 -> 231;
               case 153 -> 70;
               case 154 -> 105;
               case 155 -> 24;
               case 156 -> 43;
               case 157 -> 113;
               case 158 -> 112;
               case 159 -> 167;
               case 160 -> 243;
               case 161 -> 41;
               case 162 -> 166;
               case 163 -> 18;
               case 164 -> 3;
               case 165 -> 140;
               case 166 -> 128;
               case 167 -> 36;
               case 168 -> 227;
               case 169 -> 237;
               case 170 -> 39;
               case 171 -> 139;
               case 172 -> 108;
               case 173 -> 208;
               case 174 -> 86;
               case 175 -> 1;
               case 176 -> 49;
               case 177 -> 107;
               case 178 -> 37;
               case 179 -> 137;
               case 180 -> 249;
               case 181 -> 223;
               case 182 -> 250;
               case 183 -> 80;
               case 184 -> 81;
               case 185 -> 116;
               case 186 -> 9;
               case 187 -> 157;
               case 188 -> 220;
               case 189 -> 232;
               case 190 -> 110;
               case 191 -> 93;
               case 192 -> 217;
               case 193 -> 187;
               case 194 -> 159;
               case 195 -> 121;
               case 196 -> 230;
               case 197 -> 28;
               case 198 -> 42;
               case 199 -> 248;
               case 200 -> 255;
               case 201 -> 14;
               case 202 -> 8;
               case 203 -> 15;
               case 204 -> 143;
               case 205 -> 4;
               case 206 -> 171;
               case 207 -> 33;
               case 208 -> 189;
               case 209 -> 240;
               case 210 -> 12;
               case 211 -> 152;
               case 212 -> 129;
               case 213 -> 206;
               case 214 -> 133;
               case 215 -> 151;
               case 216 -> 176;
               case 217 -> 94;
               case 218 -> 236;
               case 219 -> 174;
               case 220 -> 54;
               case 221 -> 201;
               case 222 -> 155;
               case 223 -> 10;
               case 224 -> 38;
               case 225 -> 32;
               case 226 -> 34;
               case 227 -> 104;
               case 228 -> 149;
               case 229 -> 229;
               case 230 -> 85;
               case 231 -> 234;
               case 232 -> 68;
               case 233 -> 13;
               case 234 -> 254;
               case 235 -> 138;
               case 236 -> 205;
               case 237 -> 62;
               case 238 -> 23;
               case 239 -> 209;
               case 240 -> 188;
               case 241 -> 92;
               case 242 -> 17;
               case 243 -> 135;
               case 244 -> 136;
               case 245 -> 144;
               case 246 -> 218;
               case 247 -> 78;
               case 248 -> 0;
               case 249 -> 214;
               case 250 -> 45;
               case 251 -> 100;
               case 252 -> 31;
               case 253 -> 198;
               case 254 -> 191;
               default -> 148;
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
   
    public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, float var1, int var2, int var3, float var4, float var5, float var6, float var7, int var8, Object var9) {
        if ((var8 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var8 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        if ((var8 & 4) != 0) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }
        return var0.a(var1, var2, var3, var4, var5, var6, var7);
    }}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(me.octo.client.llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0) {
      return p0.b();
   }
   public static final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b(me.octo.client.llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0) {
      return p0.c();
   }
   public static final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll c(me.octo.client.llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0) {
      return p0.d();
   }
   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
      this();
   }

        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl a() {
         return llIlIIIllIIlllIIlIIIIIlllllllIIlIllIIllIlIlIlIlIlIIIllIllIIllllIlIlIlIllIIIIIlIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll b() {
         return IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.78F);
      }

      private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll c() {
         return IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.55F);
      }

      private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll d() {
         return this.c();
      }
   }

  // PX-FIX synth restored from jar bytecode
  public static final me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl z() { return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI; }
}
