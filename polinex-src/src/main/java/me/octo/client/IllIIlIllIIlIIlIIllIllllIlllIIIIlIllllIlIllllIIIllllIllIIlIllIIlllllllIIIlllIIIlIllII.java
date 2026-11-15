package me.octo.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.platform.InputConstants.Key;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.input.KeyEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII
   extends llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl
   implements IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
   @NotNull
   public static IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private static IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static Minecraft lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] d;
   private static String[] e;

   public IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII(
      @NotNull lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var1
   ) {
      short var10001 = -17482;
      short var10002 = 16100;
      Intrinsics.checkNotNullParameter(var1, "keybind");
      super();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   @Override
   public void e() {
      this.a(true);
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this;
   }

   @Override
   public void a(char var1, int var2) {
      boolean var3 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.ay();
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var10000 = this;
      if (!var3) {
         if (!this.ae()) {
            return;
         }

         var10000 = this;
      }

      var10000.c(var1, var2);
   }

   public final void c(int var1) {
      boolean var2 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.az();
      int var10000 = ((this.ae()) ? 1 : 0);
      if (var2) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1;
      }

      byte var10001 = 2;
      if (var2) {
         if (var10000 < 2) {
            return;
         }

         var10000 = var1;
         var10001 = 7;
      }

      if (var10000 <= var10001) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var1);
         llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e();
         this.a(false);
         this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = null;
      }
   }

   public final boolean a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5) {
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var27 = null; // PX-FIX
      Object var25 = null; // PX-FIX
      short var10001 = -17488;
      short var10002 = 5429;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      int var10000 = ((IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.az()) ? 1 : 0);
      float var7 = 8.0F;
      float var8 = 40.0F;
      float var9 = 40.0F;
      int var10 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
      boolean var6 = (var10000 != 0);
      List var11 = var10 != 0
         ? IIIlIllIIIllllllIllllIIIlIllIllIllIIIIlllllllIIIIlllllIllIIIIlIIlIIIIIlIlllllIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var10)
         : CollectionsKt.emptyList();
      var10000 = ((var11.isEmpty()) ? 1 : 0);
      if (var6) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      int var12;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var13;
      label132: {
         label131: {
            var12 = var10000;
            var13 = this.ae()
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .M()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .L();
            var10000 = var12;
            if (var6) {
               if (var12 == 0) {
                  break label131;
               }

               var10000 = ((this.ae()) ? 1 : 0);
            }

            if (var10000 == 0) {
               var25 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .P();
               break label132;
            }
         }

         var25 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var14;
      label123: {
         var14 = ((me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)(Object)(((llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll)( var25))));
         var10000 = ((this.ae()) ? 1 : 0);
         if (var6) {
            if (var10000 != 0) {
               var27 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .O();
               break label123;
            }

            var10000 = var12;
         }

         var27 = var10000 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .P()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .N();
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var15 = var27;
      String var29;
      if (var10 == 0) {
         short var28 = -17484;
         var10001 = 15630;
         var29 = "NONE";
      } else {
         var29 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(var10);
      }

      String var16;
      float var18;
      float var19;
      float var20;
      float var21;
      float var33;
      label116: {
         label115: {
            var16 = var29;
            float var17 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, var16, false, 2, null);
            var18 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(var17 + var7 * 2, var9);
            var19 = var4 - var18 + 17;
            var20 = var5 - var8 / 2.0F + 18;
            var21 = RangesKt.coerceAtMost(
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               var8 / 2.0F
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var19, var20, var18, var8, var13, var21
            );
            int var10004 = var12;
            if (var6) {
               if (var12 == 0) {
                  break label115;
               }

               var10004 = ((this.ae()) ? 1 : 0);
            }

            if (var10004 == 0) {
               var33 = 1.5F;
               break label116;
            }
         }

         var33 = 1.0F;
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var19, var20, var18, var8, var33, var15, var21
      );
      var10000 = ((this.ae()) ? 1 : 0);
      if (var6) {
         if (var10000 != 0) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(0.5F);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var19 - 1,
               var20 - 1,
               var18 + 2,
               var8 + 2,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               var21 + 1.0F
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
         }

         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .c(var16, var19 + var18 / 2.0F, var5 + 5, var14, false);
         float var34;
         var10000 = (var34 = var2 - var19) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
      }

      label106: {
         label139: {
            if (var6) {
               if (var10000 < 0) {
                  break label139;
               }

               float var35;
               var10000 = (var35 = var3 - var20) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
            }

            if (var6) {
               if (var10000 < 0) {
                  break label139;
               }

               float var36;
               var10000 = (var36 = var2 - (var19 + var18)) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
            }

            if (var6) {
               if (var10000 >= 0) {
                  break label139;
               }

               float var37;
               var10000 = (var37 = var3 - (var20 + var8)) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1);
            }

            if (!var6) {
               break label106;
            }

            if (var10000 < 0) {
               var10000 = 1;
               break label106;
            }
         }

         var10000 = 0;
      }

      int var22 = var10000;
      var10000 = var12;
      label85:
      if (var6) {
         if (var12 != 0) {
            var10000 = var22;
            if (!var6) {
               break label85;
            }

            if (var22 != 0) {
               IIIlIllIIIllllllIllllIIIlIllIllIllIIIIlllllllIIIIlllllIllIIIIlIIlIIIIIlIlllllIlIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var19 + var18 / 2.0F, var20, var11);
            }
         }

         var10000 = var22;
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.b(!var6);
      }

      return (var10000 != 0);
   }

   public final int al() {
      boolean var1 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.ay();
      int var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
      if (!var1) {
         if (var10000 != 0) {
            String var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b()
            );
            int var3 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
               var2,
               false,
               2,
               null
            );
            return me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(var3 + 10, 40)
               + me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
                  "[",
                  false,
                  2,
                  null
               );
         }

         var10000 = 40
            + me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
               "[",
               false,
               2,
               null
            );
      }

      return var10000;
   }

   @Override
   public void c(char var1, int var2) {
      boolean var3 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.az();
      int var10000 = ((this.ae()) ? 1 : 0);
      if (var3) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var2;
      }

      if (var3) {
         switch (var10000) {
            case 256:
            case 259:
            case 261:
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(0);
               llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e();
               this.a(false);
               this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = null;
               if (var3) {
                  return;
               }
            case 257:
            case 258:
            case 260:
            default:
               var10000 = var2;
         }
      }

      if (var3) {
         if (var10000 == -1) {
            return;
         }

         var10000 = var2;
      }

      if (var10000 > 0) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var2);
         llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e();
         this.a(false);
         this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = null;
      }
   }

   @Override
   public void ai() {
      this.a(false);
      if (Intrinsics.areEqual(IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, this)) {
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = null;
      }
   }

   @NotNull
   @Override
   public String ad() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b()
      );
   }

   public final int am() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
   }

   public final boolean an() {
      boolean var1 = IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll.az();
      int var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
      if (var1) {
         var10000 = var10000 != 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   @NotNull
   @Override
   public String Z() {
      int var10000 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b();
      short var10001 = -17483;
      short var10002 = -4723;
      return "macro-keybind-" + var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u0004|$\u007f\u000eÌ*WizPf\u000f\u001c'¯T¹Ä\u0007\u0081\u001b\"Û\u008bW\u0091";
      int var4 = "\u0004|$\u007f\u000eÌ*WizPf\u000f\u001c'¯T¹Ä\u0007\u0081\u001b\"Û\u008bW\u0091".length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 75;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 67;
                     case 1 -> 9;
                     case 2 -> 39;
                     case 3 -> 16;
                     case 4 -> 54;
                     case 5 -> 76;
                     default -> 36;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     d = var5;
                     e = new String[5];
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (Object) null
                     );
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = -17481;
                     short var32 = -19808;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var10;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0013I.d\u007f-&ï!`/\u0005°½å\u0004\u000bV*ðÃ><\u009cG$Ùô";
                  var4 = "\u0013I.d\u007f-&ï!`/\u0005°½å\u0004\u000bV*ðÃ><\u009cG$Ùô".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 31;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String d(int var0, int var1) {
      int var2 = (var0 ^ -17484) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 136;
            case 1 -> 143;
            case 2 -> 148;
            case 3 -> 129;
            case 4 -> 42;
            case 5 -> 246;
            case 6 -> 44;
            case 7 -> 80;
            case 8 -> 5;
            case 9 -> 175;
            case 10 -> 199;
            case 11 -> 151;
            case 12 -> 204;
            case 13 -> 26;
            case 14 -> 12;
            case 15 -> 21;
            case 16 -> 116;
            case 17 -> 43;
            case 18 -> 147;
            case 19 -> 235;
            case 20 -> 124;
            case 21 -> 244;
            case 22 -> 22;
            case 23 -> 87;
            case 24 -> 241;
            case 25 -> 238;
            case 26 -> 40;
            case 27 -> 156;
            case 28 -> 132;
            case 29 -> 24;
            case 30 -> 121;
            case 31 -> 230;
            case 32 -> 248;
            case 33 -> 98;
            case 34 -> 4;
            case 35 -> 38;
            case 36 -> 232;
            case 37 -> 117;
            case 38 -> 74;
            case 39 -> 253;
            case 40 -> 69;
            case 41 -> 95;
            case 42 -> 138;
            case 43 -> 240;
            case 44 -> 158;
            case 45 -> 106;
            case 46 -> 14;
            case 47 -> 181;
            case 48 -> 49;
            case 49 -> 239;
            case 50 -> 79;
            case 51 -> 84;
            case 52 -> 172;
            case 53 -> 56;
            case 54 -> 182;
            case 55 -> 162;
            case 56 -> 128;
            case 57 -> 27;
            case 58 -> 205;
            case 59 -> 180;
            case 60 -> 100;
            case 61 -> 179;
            case 62 -> 210;
            case 63 -> 99;
            case 64 -> 216;
            case 65 -> 85;
            case 66 -> 107;
            case 67 -> 229;
            case 68 -> 83;
            case 69 -> 66;
            case 70 -> 125;
            case 71 -> 15;
            case 72 -> 185;
            case 73 -> 17;
            case 74 -> 105;
            case 75 -> 237;
            case 76 -> 220;
            case 77 -> 11;
            case 78 -> 23;
            case 79 -> 120;
            case 80 -> 25;
            case 81 -> 113;
            case 82 -> 146;
            case 83 -> 30;
            case 84 -> 63;
            case 85 -> 149;
            case 86 -> 28;
            case 87 -> 33;
            case 88 -> 183;
            case 89 -> 58;
            case 90 -> 190;
            case 91 -> 20;
            case 92 -> 224;
            case 93 -> 18;
            case 94 -> 227;
            case 95 -> 139;
            case 96 -> 236;
            case 97 -> 217;
            case 98 -> 89;
            case 99 -> 50;
            case 100 -> 93;
            case 101 -> 171;
            case 102 -> 141;
            case 103 -> 34;
            case 104 -> 92;
            case 105 -> 160;
            case 106 -> 75;
            case 107 -> 201;
            case 108 -> 10;
            case 109 -> 188;
            case 110 -> 51;
            case 111 -> 61;
            case 112 -> 32;
            case 113 -> 226;
            case 114 -> 197;
            case 115 -> 222;
            case 116 -> 234;
            case 117 -> 47;
            case 118 -> 64;
            case 119 -> 196;
            case 120 -> 206;
            case 121 -> 168;
            case 122 -> 37;
            case 123 -> 254;
            case 124 -> 184;
            case 125 -> 127;
            case 126 -> 59;
            case 127 -> 215;
            case 128 -> 60;
            case 129 -> 145;
            case 130 -> 157;
            case 131 -> 70;
            case 132 -> 91;
            case 133 -> 223;
            case 134 -> 90;
            case 135 -> 94;
            case 136 -> 102;
            case 137 -> 2;
            case 138 -> 163;
            case 139 -> 126;
            case 140 -> 245;
            case 141 -> 211;
            case 142 -> 133;
            case 143 -> 187;
            case 144 -> 130;
            case 145 -> 119;
            case 146 -> 1;
            case 147 -> 152;
            case 148 -> 191;
            case 149 -> 169;
            case 150 -> 39;
            case 151 -> 164;
            case 152 -> 212;
            case 153 -> 123;
            case 154 -> 203;
            case 155 -> 41;
            case 156 -> 198;
            case 157 -> 77;
            case 158 -> 233;
            case 159 -> 82;
            case 160 -> 186;
            case 161 -> 73;
            case 162 -> 122;
            case 163 -> 242;
            case 164 -> 57;
            case 165 -> 115;
            case 166 -> 72;
            case 167 -> 155;
            case 168 -> 214;
            case 169 -> 255;
            case 170 -> 176;
            case 171 -> 193;
            case 172 -> 65;
            case 173 -> 81;
            case 174 -> 195;
            case 175 -> 142;
            case 176 -> 165;
            case 177 -> 111;
            case 178 -> 218;
            case 179 -> 7;
            case 180 -> 67;
            case 181 -> 36;
            case 182 -> 96;
            case 183 -> 251;
            case 184 -> 202;
            case 185 -> 173;
            case 186 -> 101;
            case 187 -> 109;
            case 188 -> 170;
            case 189 -> 104;
            case 190 -> 86;
            case 191 -> 68;
            case 192 -> 231;
            case 193 -> 3;
            case 194 -> 166;
            case 195 -> 194;
            case 196 -> 228;
            case 197 -> 140;
            case 198 -> 29;
            case 199 -> 6;
            case 200 -> 78;
            case 201 -> 114;
            case 202 -> 177;
            case 203 -> 159;
            case 204 -> 103;
            case 205 -> 88;
            case 206 -> 208;
            case 207 -> 108;
            case 208 -> 209;
            case 209 -> 131;
            case 210 -> 250;
            case 211 -> 252;
            case 212 -> 46;
            case 213 -> 213;
            case 214 -> 192;
            case 215 -> 45;
            case 216 -> 31;
            case 217 -> 110;
            case 218 -> 200;
            case 219 -> 189;
            case 220 -> 62;
            case 221 -> 97;
            case 222 -> 221;
            case 223 -> 135;
            case 224 -> 0;
            case 225 -> 207;
            case 226 -> 54;
            case 227 -> 178;
            case 228 -> 161;
            case 229 -> 225;
            case 230 -> 71;
            case 231 -> 137;
            case 232 -> 48;
            case 233 -> 8;
            case 234 -> 19;
            case 235 -> 219;
            case 236 -> 150;
            case 237 -> 118;
            case 238 -> 13;
            case 239 -> 53;
            case 240 -> 52;
            case 241 -> 249;
            case 242 -> 9;
            case 243 -> 154;
            case 244 -> 76;
            case 245 -> 153;
            case 246 -> 35;
            case 247 -> 243;
            case 248 -> 55;
            case 249 -> 144;
            case 250 -> 112;
            case 251 -> 174;
            case 252 -> 167;
            case 253 -> 16;
            case 254 -> 134;
            default -> 247;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
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

      @Nullable
      public final IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII a() {
         return IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final String a(int var1) {
         String var4;
         switch (var1) {
            case -1:
            case 0:
               short var5 = 23580;
               short var10001 = 9266;
               var4 = "NONE";
               break;
            default:
               Key var10000 = InputConstants.getKey(new KeyEvent(var1, 0, 0));
               short var10002 = 23582;
               short var10003 = 18000;
               Intrinsics.checkNotNullExpressionValue(var10000, "getKey(...)");
               Key var2 = var10000;
               String var3 = var2.getDisplayName().getString();
               var10002 = 23583;
               var10003 = 153;
               Intrinsics.checkNotNullExpressionValue(var3, "getString(...)");
               var4 = var3.toUpperCase(Locale.ROOT);
               var10002 = 23581;
               var10003 = 8278;
               Intrinsics.checkNotNullExpressionValue(var4, "toUpperCase(...)");
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "zz6\\ù3\u0083Ó\u0094w¾\\áf\u000b³Ì\u000f\u0092Ïú7À\"[\u000f";
         int var4 = "zz6\\ù3\u0083Ó\u0094w¾\\áf\u000b³Ì\u000f\u0092Ïú7À\"[\u000f".length();
         char var1 = 14;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 4;
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
                        case 0 -> 8;
                        case 1 -> 99;
                        case 2 -> 3;
                        case 3 -> 97;
                        case 4 -> 85;
                        case 5 -> 91;
                        default -> 1;
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
                        b = new String[4];
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

                     var2 = "«á·¬#\u0096¬Tä¿Ö\u0098%Ômt\u0004÷\u008bZð";
                     var4 = "«á·¬#\u0096¬Tä¿Ö\u0098%Ômt\u0004÷\u008bZð".length();
                     var1 = 16;
                     var8 = -1;
               }

               var10000 = 42;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 23583) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 102;
               case 1 -> 190;
               case 2 -> 144;
               case 3 -> 180;
               case 4 -> 48;
               case 5 -> 158;
               case 6 -> 233;
               case 7 -> 237;
               case 8 -> 154;
               case 9 -> 47;
               case 10 -> 121;
               case 11 -> 170;
               case 12 -> 98;
               case 13 -> 231;
               case 14 -> 73;
               case 15 -> 31;
               case 16 -> 183;
               case 17 -> 241;
               case 18 -> 74;
               case 19 -> 20;
               case 20 -> 0;
               case 21 -> 10;
               case 22 -> 187;
               case 23 -> 252;
               case 24 -> 174;
               case 25 -> 149;
               case 26 -> 17;
               case 27 -> 49;
               case 28 -> 142;
               case 29 -> 248;
               case 30 -> 135;
               case 31 -> 44;
               case 32 -> 131;
               case 33 -> 150;
               case 34 -> 13;
               case 35 -> 171;
               case 36 -> 115;
               case 37 -> 8;
               case 38 -> 18;
               case 39 -> 134;
               case 40 -> 227;
               case 41 -> 91;
               case 42 -> 205;
               case 43 -> 39;
               case 44 -> 139;
               case 45 -> 147;
               case 46 -> 216;
               case 47 -> 219;
               case 48 -> 182;
               case 49 -> 240;
               case 50 -> 148;
               case 51 -> 189;
               case 52 -> 169;
               case 53 -> 199;
               case 54 -> 71;
               case 55 -> 59;
               case 56 -> 69;
               case 57 -> 161;
               case 58 -> 93;
               case 59 -> 208;
               case 60 -> 164;
               case 61 -> 194;
               case 62 -> 209;
               case 63 -> 124;
               case 64 -> 4;
               case 65 -> 11;
               case 66 -> 15;
               case 67 -> 9;
               case 68 -> 105;
               case 69 -> 196;
               case 70 -> 90;
               case 71 -> 125;
               case 72 -> 64;
               case 73 -> 234;
               case 74 -> 195;
               case 75 -> 128;
               case 76 -> 76;
               case 77 -> 80;
               case 78 -> 246;
               case 79 -> 75;
               case 80 -> 38;
               case 81 -> 153;
               case 82 -> 2;
               case 83 -> 243;
               case 84 -> 103;
               case 85 -> 166;
               case 86 -> 236;
               case 87 -> 141;
               case 88 -> 226;
               case 89 -> 109;
               case 90 -> 50;
               case 91 -> 40;
               case 92 -> 78;
               case 93 -> 113;
               case 94 -> 51;
               case 95 -> 203;
               case 96 -> 88;
               case 97 -> 22;
               case 98 -> 239;
               case 99 -> 95;
               case 100 -> 57;
               case 101 -> 46;
               case 102 -> 176;
               case 103 -> 112;
               case 104 -> 173;
               case 105 -> 218;
               case 106 -> 99;
               case 107 -> 179;
               case 108 -> 201;
               case 109 -> 110;
               case 110 -> 202;
               case 111 -> 70;
               case 112 -> 116;
               case 113 -> 114;
               case 114 -> 156;
               case 115 -> 63;
               case 116 -> 26;
               case 117 -> 133;
               case 118 -> 136;
               case 119 -> 30;
               case 120 -> 186;
               case 121 -> 43;
               case 122 -> 188;
               case 123 -> 214;
               case 124 -> 127;
               case 125 -> 34;
               case 126 -> 107;
               case 127 -> 58;
               case 128 -> 212;
               case 129 -> 97;
               case 130 -> 65;
               case 131 -> 163;
               case 132 -> 28;
               case 133 -> 21;
               case 134 -> 36;
               case 135 -> 101;
               case 136 -> 62;
               case 137 -> 89;
               case 138 -> 5;
               case 139 -> 210;
               case 140 -> 178;
               case 141 -> 157;
               case 142 -> 140;
               case 143 -> 12;
               case 144 -> 167;
               case 145 -> 27;
               case 146 -> 138;
               case 147 -> 213;
               case 148 -> 55;
               case 149 -> 123;
               case 150 -> 108;
               case 151 -> 143;
               case 152 -> 249;
               case 153 -> 96;
               case 154 -> 185;
               case 155 -> 255;
               case 156 -> 67;
               case 157 -> 35;
               case 158 -> 23;
               case 159 -> 87;
               case 160 -> 14;
               case 161 -> 238;
               case 162 -> 79;
               case 163 -> 192;
               case 164 -> 235;
               case 165 -> 224;
               case 166 -> 215;
               case 167 -> 129;
               case 168 -> 204;
               case 169 -> 193;
               case 170 -> 220;
               case 171 -> 86;
               case 172 -> 230;
               case 173 -> 247;
               case 174 -> 225;
               case 175 -> 206;
               case 176 -> 197;
               case 177 -> 33;
               case 178 -> 16;
               case 179 -> 251;
               case 180 -> 72;
               case 181 -> 53;
               case 182 -> 168;
               case 183 -> 132;
               case 184 -> 253;
               case 185 -> 32;
               case 186 -> 6;
               case 187 -> 162;
               case 188 -> 126;
               case 189 -> 66;
               case 190 -> 229;
               case 191 -> 120;
               case 192 -> 146;
               case 193 -> 81;
               case 194 -> 160;
               case 195 -> 200;
               case 196 -> 7;
               case 197 -> 77;
               case 198 -> 3;
               case 199 -> 52;
               case 200 -> 84;
               case 201 -> 122;
               case 202 -> 242;
               case 203 -> 222;
               case 204 -> 217;
               case 205 -> 221;
               case 206 -> 130;
               case 207 -> 85;
               case 208 -> 175;
               case 209 -> 145;
               case 210 -> 111;
               case 211 -> 37;
               case 212 -> 41;
               case 213 -> 151;
               case 214 -> 56;
               case 215 -> 100;
               case 216 -> 1;
               case 217 -> 232;
               case 218 -> 61;
               case 219 -> 25;
               case 220 -> 244;
               case 221 -> 68;
               case 222 -> 45;
               case 223 -> 207;
               case 224 -> 228;
               case 225 -> 117;
               case 226 -> 54;
               case 227 -> 184;
               case 228 -> 165;
               case 229 -> 152;
               case 230 -> 19;
               case 231 -> 254;
               case 232 -> 118;
               case 233 -> 177;
               case 234 -> 181;
               case 235 -> 24;
               case 236 -> 250;
               case 237 -> 104;
               case 238 -> 83;
               case 239 -> 137;
               case 240 -> 223;
               case 241 -> 198;
               case 242 -> 191;
               case 243 -> 29;
               case 244 -> 119;
               case 245 -> 155;
               case 246 -> 245;
               case 247 -> 94;
               case 248 -> 211;
               case 249 -> 172;
               case 250 -> 159;
               case 251 -> 92;
               case 252 -> 60;
               case 253 -> 82;
               case 254 -> 106;
               default -> 42;
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
   public static final IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII ao() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public void d() {
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
   }
}
