package me.octo.client;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;

public final class lllIIIIIIIlIllIlIllIIIlllIllIIlIIIllIlIIIlllIIllllllIIllIlIIIlIIlIIlIIIIllIlIIIllIllI
   extends llllIIllIIlIIlllllllIIlIIIIllllllllIIIIIlIlIlIIlllIlIIIIIIllIlIlIIlIlIIlllIIIlllllIll {
    public static <T> T a(Object... args) { return null; } // PX-FIX ovld-var
   @NotNull
   private final BlockPos IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final List<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] e;
   private static String[] f;

   public lllIIIIIIIlIllIlIllIIIlllIllIIlIIIllIlIIIlllIIllllllIIllIlIIIlIIlIIlIIIIllIlIIIllIllI(@NotNull BlockPos var1) {
      short var10001 = 4758;
      short var10002 = 4567;
      Intrinsics.checkNotNullParameter(var1, "targetPos");
      super();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 16.0F;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 54.0F;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 32.0F;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 6.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 40.0F;
      float var2 = 360.0F;
      float var3 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         + 10.0F
         + this.e()
         + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll(
         var2, var3
      );
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = -1;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i();
   }

   private final int d() {
      return (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.size() + 1) / 2;
   }

   private final float e() {
      return this.d() * this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         + RangesKt.coerceAtLeast(this.d() - 1, 0) * this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @Override
   public void extractRenderState(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
      short var10002 = 4753;
      short var10003 = -28752;
      Intrinsics.checkNotNullParameter(var1, "context");
      short var10001 = 4767;
      var10002 = 7052;
      String var11 = System.getProperty("os.name");
      var10003 = 4760;
      short var10004 = -22786;
      Intrinsics.checkNotNullExpressionValue(var11, "getProperty(...)");
      String var12 = var11.toLowerCase(Locale.ROOT);
      var10003 = 4763;
      var10004 = -28735;
      Intrinsics.checkNotNullExpressionValue(var12, "toLowerCase(...)");
      CharSequence var13 = var12;
      var10002 = 4755;
      var10003 = 15859;
      byte var6 = ((byte)((StringsKt.contains(var13, "mac", false)) ? 1 : 0));
      int var5 = var10000;
      var10000 = var6;
      if (var5 == 0) {
         var10000 = var6 != 0 ? this.a().getWindow().getScreenWidth() : this.a().getWindow().getWidth();
      }

      int var7 = var10000;
      var10000 = var6;
      if (var5 == 0) {
         var10000 = var6 != 0 ? this.a().getWindow().getScreenHeight() : this.a().getWindow().getHeight();
      }

      int var8 = var10000;
      me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1, 0, 0, var1.guiWidth(), var1.guiHeight(), (kotlin.jvm.functions.Function0)(() -> a(var7, var8, this, var6 != 0, var2, var1, var3)));
      super.extractRenderState(var1, var2, var3, var4);
   }

   @Override
   public void a(int var1, int var2) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.c(),
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.d(),
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.g(),
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.h(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.98F),
         14.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.c(),
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.d(),
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.g(),
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.h(),
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.6F),
         14.0F
      );
      this.b(var1, var2);
      this.c(var1, var2);
      this.d(var1, var2);
   }

   private final void b(int var1, int var2) {
      float var6;
      float var7;
      float var8;
      int var15;
      label43: {
         label46: {
            float var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.c()
               + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               + 6.0F;
            var15 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
            float var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.d() + 14.0F;
            short var10002 = 4764;
            short var10003 = 19574;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               "Add waypoint",
               var4,
               var5,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               false, 16, null);
            var10002 = 4765;
            var10003 = -19657;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               "Pick the type to place at this block",
               var4,
               var5 + 15.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(),
               false, 16, null);
            var6 = 22.0F;
            var7 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.e()
               - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               - var6
               - 4.0F;
            var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.d() + 15.0F;
            int var3 = var15;
            float var24;
            var15 = (var24 = var1 - var7) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
            if (var3 != 0) {
               if (var15 < 0) {
                  break label46;
               }

               float var25;
               var15 = (var25 = var1 - (var7 + var6)) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
            }

            if (var3 != 0) {
               if (var15 > 0) {
                  break label46;
               }

               float var26;
               var15 = (var26 = var2 - var8) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
            }

            if (var3 != 0) {
               if (var15 < 0) {
                  break label46;
               }

               float var27;
               var15 = (var27 = var2 - (var8 + var6)) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
            }

            if (var3 == 0) {
               break label43;
            }

            if (var15 <= 0) {
               var15 = 1;
               break label43;
            }
         }

         var15 = 0;
      }

      int var9 = var15;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = (var9 != 0);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var7,
         var8,
         var6,
         var6,
         var9 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j(),
         6.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var7,
         var8,
         var6,
         var6,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.5F),
         6.0F
      );
      int var10001 = 4766;
      int var19 = 6894;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
            var7 + 6.0F,
            var8 + 6.0F,
            10.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            1.0F
         );
      var15 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getX();
      var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getY();
      var19 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getZ();
      short var22 = 4756;
      short var10004 = -30061;
      var10004 = 4757;
      short var10005 = 413;
      String var10 = var15 + ", " + var10001 + ", " + var19;
      float var11 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var10, false, 2, null)
         + 14.0F;
      float var12 = 18.0F;
      float var13 = var7 - 8.0F - var11;
      float var14 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.d() + 17.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var13,
         var14,
         var11,
         var12,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j()
            .a(0.85F),
         5.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var13,
         var14,
         var11,
         var12,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.4F),
         5.0F
      );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         var10,
         var13 + 7.0F,
         var14 + var12 / 2.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         false);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.c()
            + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.d()
            + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            - 6.0F,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.g()
            - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI * 2.0F,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .A()
            .a(0.7F),
         0.5F
      );
   }

   private final void c(int var1, int var2) {
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = -1;
      float var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.c()
         + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
      float var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.d()
         + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         + 4.0F;
      float var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.g()
         - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI * 2.0F;
      int var3 = var10000;
      float var7 = (var6 - this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) / 2.0F;
      Iterator var8 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.iterator();
      int var9 = 0;

      while (var8.hasNext()) {
         int var10;
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var11;
         float var14;
         float var15;
         label116: {
            label124: {
               var10 = var9++;
               var11 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI)var8.next();
               int var12 = var10 % 2;
               int var13 = var10 / 2;
               var14 = var4 + var12 * (var7 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII);
               var15 = var5
                  + var13
                     * (
                        this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                           + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                     );
               float var40;
               var10000 = (var40 = var1 - var14) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
               if (var3 == 0) {
                  if (var10000 < 0) {
                     break label124;
                  }

                  float var41;
                  var10000 = (var41 = var1 - (var14 + var7)) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1);
               }

               if (var3 == 0) {
                  if (var10000 > 0) {
                     break label124;
                  }

                  float var42;
                  var10000 = (var42 = var2 - var15) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
               }

               if (var3 == 0) {
                  if (var10000 < 0) {
                     break label124;
                  }

                  float var43;
                  var10000 = (var43 = var2 - (var15 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)) == 0.0F
                     ? 0
                     : (var43 < 0.0F ? -1 : 1);
               }

               if (var3 != 0) {
                  break label116;
               }

               if (var10000 <= 0) {
                  var10000 = 1;
                  break label116;
               }
            }

            var10000 = 0;
         }

         int var16 = var10000;
         if (var16 != 0) {
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var10;
         }

         label125: {
            float var21 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            boolean var23 = false;
            if (var3 == 0) {
               if (var16 != 0) {
                  float var24 = var14 + var7 / 2.0F;
                  float var25 = var15 + var21 / 2.0F;
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var24, var25);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(1.012F, 1.012F);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(-var24, -var25);
                  boolean var26 = false;
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var27 = var16 != 0
                     ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .h()
                        .a(0.85F)
                     : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .j()
                        .a(0.78F);
                  me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var28 = var16 != 0
                     ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ah()
                        .a(0.55F)
                     : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .y()
                        .a(0.35F);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var14,
                     var15,
                     var7,
                     this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                     var27,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .aq()
                  );
                  float var36 = var14;
                  float var10001 = var15;
                  if (var3 == 0) {
                     me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                        var14,
                        var15,
                        var7,
                        this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                        1.0F,
                        var28,
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .aq()
                     );
                     if (var16 != 0) {
                        me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                           var14,
                           var15 + 6.0F,
                           2.5F,
                           this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll - 12.0F,
                           IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .ah()
                              .a(0.85F),
                           1.5F
                        );
                     }

                     var36 = var14;
                     var10001 = 14.0F;
                  }

                  float var29 = var36 + var10001;
                  float var30 = var15 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll / 2.0F;
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var29,
                     var30,
                     3.0F,
                     var16 != 0
                        ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .ah()
                        : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .c()
                           .a(0.5F)
                  );
                  me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
                     me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                     var11.a(),
                     var29 + 10.0F,
                     var30,
                     var16 != 0
                        ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a()
                        : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(),
                     false,
                     16,
                     null);
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                  if (var3 == 0) {
                     break label125;
                  }
               }

               boolean var37 = false;
            }

            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var31 = var16 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .h()
                  .a(0.85F)
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j()
                  .a(0.78F);
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var32 = var16 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah()
                  .a(0.55F)
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.35F);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var14,
               var15,
               var7,
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
               var31,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq()
            );
            float var38 = var14;
            float var39 = var15;
            if (var3 == 0) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var14,
                  var15,
                  var7,
                  this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                  1.0F,
                  var32,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .aq()
               );
               if (var16 != 0) {
                  me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                     var14,
                     var15 + 6.0F,
                     2.5F,
                     this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll - 12.0F,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .ah()
                        .a(0.85F),
                     1.5F
                  );
               }

               var38 = var14;
               var39 = 14.0F;
            }

            float var33 = var38 + var39;
            float var34 = var15 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll / 2.0F;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var33,
               var34,
               3.0F,
               var16 != 0
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                     .a(0.5F)
            );
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var11.a(),
               var33 + 10.0F,
               var34,
               var16 != 0
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(),
               false,
               16,
               null);
         }

         if (var3 != 0) {
            break;
         }
      }
   }

   private final void a(float var1, float var2, float var3, float var4, boolean var5, Function0<Unit> var6) {
      int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
      boolean var8 = false;
      int var7 = var10000;
      if (var5) {
         float var9 = var1 + var3 / 2.0F;
         float var10 = var2 + var4 / 2.0F;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var9, var10);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(1.012F, 1.012F);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(-var9, -var10);
         var6.invoke();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
         if (var7 != 0) {
            return;
         }
      }

      var6.invoke();
   }

   private final void d(int var1, int var2) {
      int var3;
      float var7;
      float var8;
      float var10;
      float var11;
      int var20;
      label94: {
         label97: {
            int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
            float var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.f()
               - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               - this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
               + 10.0F;
            var3 = var10000;
            float var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.c()
               + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            float var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.g()
               - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI * 2.0F;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var5,
               var4 - 8.0F,
               var6,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .A()
                  .a(0.7F),
               0.5F
            );
            short var10001 = 4762;
            short var10002 = 27147;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               "INSERT AT",
               var5 + 6.0F,
               var4 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI / 2.0F - 4.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(),
               false);
            var7 = 22.0F;
            var8 = 44.0F;
            float var9 = var7 * 2.0F + var8 + 8.0F;
            var10 = var5 + var6 - var9;
            var11 = var4 + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI / 2.0F - var7 / 2.0F - 4.0F;
            float var28;
            var20 = (var28 = var1 - var10) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
            if (var3 != 0) {
               if (var20 < 0) {
                  break label97;
               }

               float var29;
               var20 = (var29 = var1 - (var10 + var7)) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
            }

            if (var3 != 0) {
               if (var20 > 0) {
                  break label97;
               }

               float var30;
               var20 = (var30 = var2 - var11) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
            }

            if (var3 != 0) {
               if (var20 < 0) {
                  break label97;
               }

               float var31;
               var20 = (var31 = var2 - (var11 + var7)) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
            }

            if (var3 == 0) {
               break label94;
            }

            if (var20 <= 0) {
               var20 = 1;
               break label94;
            }
         }

         var20 = 0;
      }

      float var13;
      String var18;
      label72: {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = (var20 != 0);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var10,
            var11,
            var7,
            var7,
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j(),
            6.0F
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var10,
            var11,
            var7,
            var7,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.4F),
            6.0F
         );
         int var21 = 4761;
         short var26 = 6267;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"15,18 9,12 15,6\"/>\n    </svg>\n",
               var10 + 6.0F,
               var11 + 6.0F,
               10.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
               1.0F
            );
         var13 = var10 + var7 + 4.0F;
         int var14 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i();
         int var17 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         var21 = var14;
         if (var3 != 0) {
            if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl >= var14) {
               short var19 = 4752;
               short var23 = -24784;
               var18 = "End";
               break label72;
            }

            var17 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            var21 = 1;
         }

         var18 = "#" + (var17 + var21);
      }

      float var16;
      label66: {
         label98: {
            String var15 = var18;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
               var15,
               var13
                  + var8 / 2.0F
                  - (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var15, false, 2, null)
                     / 2.0F,
               var11 + var7 / 2.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               false);
            var16 = var13 + var8 + 4.0F;
            float var32;
            var20 = (var32 = var1 - var16) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
            if (var3 != 0) {
               if (var20 < 0) {
                  break label98;
               }

               float var33;
               var20 = (var33 = var1 - (var16 + var7)) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
            }

            if (var3 != 0) {
               if (var20 > 0) {
                  break label98;
               }

               float var34;
               var20 = (var34 = var2 - var11) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
            }

            if (var3 != 0) {
               if (var20 < 0) {
                  break label98;
               }

               float var35;
               var20 = (var35 = var2 - (var11 + var7)) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
            }

            if (var3 == 0) {
               break label66;
            }

            if (var20 <= 0) {
               var20 = 1;
               break label66;
            }
         }

         var20 = 0;
      }

      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = (var20 != 0);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var16,
         var11,
         var7,
         var7,
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j(),
         6.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var16,
         var11,
         var7,
         var7,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.4F),
         6.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var16 + var7 / 2.0F, var11 + var7 / 2.0F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(-1.0F, 1.0F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(-(var16 + var7 / 2.0F), -(var11 + var7 / 2.0F));
      short var25 = 4759;
      short var27 = 16476;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"15,18 9,12 15,6\"/>\n    </svg>\n",
            var16 + 6.0F,
            var11 + 6.0F,
            10.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            1.0F
         );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   @Override
   public boolean a(double var1, double var3, int var5) {
      int var6 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
      int var10000 = var5;
      if (var6 == 0) {
         if (var5 != 0) {
            return false;
         }

         var10000 = ((this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) ? 1 : 0);
      }

      if (var6 == 0) {
         if (var10000 != 0) {
            Minecraft.getInstance().setScreen(null);
            return true;
         }

         var10000 = ((this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
      }

      if (var6 == 0) {
         if (var10000 != 0) {
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = RangesKt.coerceAtLeast(
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl - 1, 0
            );
            return true;
         }

         var10000 = ((this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) ? 1 : 0);
      }

      if (var6 == 0) {
         if (var10000 != 0) {
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = RangesKt.coerceAtMost(
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 1,
               llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .i()
            );
            return true;
         }

         var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.size();
      }

      label51: {
         int var7 = var10000;
         int var8 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         var10000 = 0;
         int var10001 = var8;
         if (var6 == 0) {
            if (0 > var8) {
               var10000 = 0;
               break label51;
            }

            var10000 = var8;
            if (var6 != 0) {
               break label51;
            }

            var10001 = var7;
         }

         var10000 = var10000 < var10001 ? 1 : 0;
      }

      if (var10000 != 0) {
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var9 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .get(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
         llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var9,
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
            );
         Minecraft.getInstance().setScreen(null);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      int var9 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = RangesKt.coerceIn(
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl - (int)var7, 0, var9
      );
      return true;
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      int var4 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
      int var10000 = var1;
      if (var4 != 0) {
         switch (var1) {
            case 256:
               Minecraft.getInstance().setScreen(null);
               return true;
            case 262:
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = RangesKt.coerceAtMost(
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl + 1,
                  llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .i()
               );
               return true;
            case 263:
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = RangesKt.coerceAtLeast(
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl - 1, 0
               );
               return true;
            default:
               var10000 = ((super.a(var1, var2, var3)) ? 1 : 0);
         }
      }

      return (var10000 != 0);
   }

   private static final Unit a(
      int var0,
      int var1,
      lllIIIIIIIlIllIlIllIIIlllIllIIlIIIllIlIIIlllIIllllllIIllIlIIIlIIlIIlIIIIllIlIIIllIllI var2,
      boolean var3,
      int var4,
      GuiGraphicsExtractor var5,
      int var6
   ) {
      float var8;
      float var9;
      float var10;
      int var15;
      int var16;
      label15: {
         int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            0.0F,
            0.0F,
            var0,
            var1,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()
               .a(0.5F),
            0.0F
         );
         int var7 = var10000;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
         var8 = var0 / 2.0F;
         var9 = var1 / 2.0F;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var8, var9);
         var10 = lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .f()
               .P()
            * var2.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.k();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var10, var10);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(-var8, -var9);
         boolean var11 = false;
         boolean var12 = false;
         var10000 =(( var3) ? 1 : 0);
         if (var7 != 0) {
            if (!var3) {
               var15 = (int)((float)var4 * var0 / var5.guiWidth());
               var16 = (int)((float)var6 * var1 / var5.guiHeight());
               if (var7 != 0) {
                  break label15;
               }
            }

            var10000 = var2.a().getWindow().getGuiScale();
         }

         int var13 = var10000;
         var15 = var4 * var13;
         var16 = var6 * var13;
      }

      int var17 = (int)(var8 + (var15 - var8) / var10);
      int var14 = (int)(var9 + (var16 - var9) / var10);
      var2.a(var17, var14);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[15];
      int var3 = 0;
      String var2 = " ¨\u008b{ãÅK¥\u009f¿ïÀ\u0016=ý_ÓX\u008fÌ\b3\u009dx¢ß\u0002ÌQ<ø¹ê®¤¾\f9\u0007\u009ci±°\u00ad©?\u0094J\u001f\u0007NöÓìM\u008búÍ\u0090ÛÏ>@\u001bwåY\u0012=2\u0005¥ßJ\u0090;$I\u008d\u0014W\u009eíhar¾©ád×Æ\u0081\u0017E|5ñ\u008aL\u001eÝô\u00136êÒJ¾\u0018\u00adU\u0094ÂmBB[HSç¯¢Ðµ»{\\\u0082\u00ad±\u0013 \u0004\u008eÿRÉÌÃéGõ7ÑÌ\u0083E\u000f.Vw\u008fW-\u0095?I\u0083çì§Wc\u0013ï\u0088\u001eü§\u0002R\u009d>¢[ÿ÷Z\u0002\\Q\u0017\u0081\u007f\u00952¥P2DÔcìôKB\u0016ÎukëÔ¡å²\u0017¨q'×\u001cÉ%ÅÐ©\u0086\u009eMutÚ\u009fÇXd®pÂ\u0018ÞMF\u0005h\u008aæ\"ùó\u009c\u0090\u0012vñ±¸\u0081¥u\rnÑ\u00875<a»-g#[\u008aWç7¹_÷Ç±1\u0018\u009aóV6Ã\u0083¼\u008e\u007f£Òðí¬ì|Åäl½;»\u001c\u0087$±Ã\u0089ôkÇÿo\u001c4WlÕÍÓóßBïÉÔ\u0006Éã?,¬^\u000bm\u0087\u0083Øÿ\u0087Vý\u009d\u0003>8{Âtª\u0085\u0084±\u0080°§¤±-êÆ\u008b¿ÕM\u008aN¥j\u0084B\u009aâg\u0017¾\u0096^8%ä}\u008f+A,ºÆ\u001b\u001fÁnÜû\u009c\\ÑáçyEïØ·\u0014:E{\u0010*¥\fl´`¡i\u008b&u«\u000e\r\u0086Ð\u0010\u0012nBaG\u0013xjá£Uü\u0095çõ\u008d\t)¼ \u0014Âã\u001ba \u0002:g\u0002Bp\u008aÉºä\u0012%\u0082\u0088\u001fØÍ§Iña7i\"Ó¬\b¨\u0085¢\u0002\u0005©ø^ËêÏQ\u0082Ú÷\u001a¹ü»Å.*R¦\u0093\u0000\u0098?S\u008e t8\u009a\u0086zï\u001cÞ\u0085\u008bûªáóÚPs\u0085ò\u0019StÖ\u0003\u0082Ü\u0095\u0080@\u001bÙb+ÊÒë\u001fÄ?û1\u0018\u0082¹`Ðø¹/8ï\u00adÉþk«ä\u009fr\u0010\u0097\u0011v\u0092\u0087À³T±(»áA;\u000b%\u000by$\u0096D¢Â[\u0094¬®\t¬F«£\u0091SÐ}\u0080\u0007ö.\trZ\u0014\u008d";
      int var4 = " ¨\u008b{ãÅK¥\u009f¿ïÀ\u0016=ý_ÓX\u008fÌ\b3\u009dx¢ß\u0002ÌQ<ø¹ê®¤¾\f9\u0007\u009ci±°\u00ad©?\u0094J\u001f\u0007NöÓìM\u008búÍ\u0090ÛÏ>@\u001bwåY\u0012=2\u0005¥ßJ\u0090;$I\u008d\u0014W\u009eíhar¾©ád×Æ\u0081\u0017E|5ñ\u008aL\u001eÝô\u00136êÒJ¾\u0018\u00adU\u0094ÂmBB[HSç¯¢Ðµ»{\\\u0082\u00ad±\u0013 \u0004\u008eÿRÉÌÃéGõ7ÑÌ\u0083E\u000f.Vw\u008fW-\u0095?I\u0083çì§Wc\u0013ï\u0088\u001eü§\u0002R\u009d>¢[ÿ÷Z\u0002\\Q\u0017\u0081\u007f\u00952¥P2DÔcìôKB\u0016ÎukëÔ¡å²\u0017¨q'×\u001cÉ%ÅÐ©\u0086\u009eMutÚ\u009fÇXd®pÂ\u0018ÞMF\u0005h\u008aæ\"ùó\u009c\u0090\u0012vñ±¸\u0081¥u\rnÑ\u00875<a»-g#[\u008aWç7¹_÷Ç±1\u0018\u009aóV6Ã\u0083¼\u008e\u007f£Òðí¬ì|Åäl½;»\u001c\u0087$±Ã\u0089ôkÇÿo\u001c4WlÕÍÓóßBïÉÔ\u0006Éã?,¬^\u000bm\u0087\u0083Øÿ\u0087Vý\u009d\u0003>8{Âtª\u0085\u0084±\u0080°§¤±-êÆ\u008b¿ÕM\u008aN¥j\u0084B\u009aâg\u0017¾\u0096^8%ä}\u008f+A,ºÆ\u001b\u001fÁnÜû\u009c\\ÑáçyEïØ·\u0014:E{\u0010*¥\fl´`¡i\u008b&u«\u000e\r\u0086Ð\u0010\u0012nBaG\u0013xjá£Uü\u0095çõ\u008d\t)¼ \u0014Âã\u001ba \u0002:g\u0002Bp\u008aÉºä\u0012%\u0082\u0088\u001fØÍ§Iña7i\"Ó¬\b¨\u0085¢\u0002\u0005©ø^ËêÏQ\u0082Ú÷\u001a¹ü»Å.*R¦\u0093\u0000\u0098?S\u008e t8\u009a\u0086zï\u001cÞ\u0085\u008bûªáóÚPs\u0085ò\u0019StÖ\u0003\u0082Ü\u0095\u0080@\u001bÙb+ÊÒë\u001fÄ?û1\u0018\u0082¹`Ðø¹/8ï\u00adÉþk«ä\u009fr\u0010\u0097\u0011v\u0092\u0087À³T±(»áA;\u000b%\u000by$\u0096D¢Â[\u0094¬®\t¬F«£\u0091SÐ}\u0080\u0007ö.\trZ\u0014\u008d"
         .length();
      char var1 = '$';
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
                     case 0 -> 20;
                     case 1 -> 33;
                     case 2 -> 38;
                     case 3 -> 119;
                     case 4 -> 107;
                     case 5 -> 36;
                     default -> 4;
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
                     e = var5;
                     f = new String[15];
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

                  var2 = ";´¶\u0003h\u0007ö";
                  var4 = ";´¶\u0003h\u0007ö".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 31;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String g(int var0, int var1) {
      int var2 = (var0 ^ 4765) & 65535;
      if (f[var2] == null) {
         char[] var3 = e[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 225;
            case 1 -> 185;
            case 2 -> 157;
            case 3 -> 29;
            case 4 -> 116;
            case 5 -> 118;
            case 6 -> 85;
            case 7 -> 75;
            case 8 -> 174;
            case 9 -> 101;
            case 10 -> 193;
            case 11 -> 196;
            case 12 -> 188;
            case 13 -> 226;
            case 14 -> 189;
            case 15 -> 90;
            case 16 -> 192;
            case 17 -> 212;
            case 18 -> 11;
            case 19 -> 143;
            case 20 -> 209;
            case 21 -> 81;
            case 22 -> 95;
            case 23 -> 206;
            case 24 -> 65;
            case 25 -> 175;
            case 26 -> 42;
            case 27 -> 17;
            case 28 -> 45;
            case 29 -> 169;
            case 30 -> 207;
            case 31 -> 78;
            case 32 -> 238;
            case 33 -> 33;
            case 34 -> 71;
            case 35 -> 57;
            case 36 -> 195;
            case 37 -> 32;
            case 38 -> 154;
            case 39 -> 3;
            case 40 -> 39;
            case 41 -> 7;
            case 42 -> 2;
            case 43 -> 62;
            case 44 -> 36;
            case 45 -> 167;
            case 46 -> 181;
            case 47 -> 96;
            case 48 -> 187;
            case 49 -> 67;
            case 50 -> 5;
            case 51 -> 223;
            case 52 -> 86;
            case 53 -> 88;
            case 54 -> 232;
            case 55 -> 176;
            case 56 -> 227;
            case 57 -> 114;
            case 58 -> 140;
            case 59 -> 37;
            case 60 -> 214;
            case 61 -> 250;
            case 62 -> 139;
            case 63 -> 237;
            case 64 -> 170;
            case 65 -> 211;
            case 66 -> 239;
            case 67 -> 158;
            case 68 -> 26;
            case 69 -> 186;
            case 70 -> 41;
            case 71 -> 236;
            case 72 -> 252;
            case 73 -> 190;
            case 74 -> 103;
            case 75 -> 124;
            case 76 -> 153;
            case 77 -> 100;
            case 78 -> 156;
            case 79 -> 171;
            case 80 -> 166;
            case 81 -> 1;
            case 82 -> 23;
            case 83 -> 34;
            case 84 -> 255;
            case 85 -> 25;
            case 86 -> 144;
            case 87 -> 235;
            case 88 -> 248;
            case 89 -> 66;
            case 90 -> 204;
            case 91 -> 89;
            case 92 -> 50;
            case 93 -> 202;
            case 94 -> 102;
            case 95 -> 64;
            case 96 -> 110;
            case 97 -> 203;
            case 98 -> 38;
            case 99 -> 229;
            case 100 -> 135;
            case 101 -> 46;
            case 102 -> 132;
            case 103 -> 121;
            case 104 -> 213;
            case 105 -> 205;
            case 106 -> 173;
            case 107 -> 16;
            case 108 -> 119;
            case 109 -> 13;
            case 110 -> 108;
            case 111 -> 99;
            case 112 -> 63;
            case 113 -> 79;
            case 114 -> 83;
            case 115 -> 77;
            case 116 -> 60;
            case 117 -> 131;
            case 118 -> 201;
            case 119 -> 126;
            case 120 -> 115;
            case 121 -> 233;
            case 122 -> 199;
            case 123 -> 20;
            case 124 -> 241;
            case 125 -> 125;
            case 126 -> 183;
            case 127 -> 18;
            case 128 -> 133;
            case 129 -> 109;
            case 130 -> 68;
            case 131 -> 117;
            case 132 -> 128;
            case 133 -> 142;
            case 134 -> 164;
            case 135 -> 155;
            case 136 -> 145;
            case 137 -> 92;
            case 138 -> 253;
            case 139 -> 221;
            case 140 -> 113;
            case 141 -> 44;
            case 142 -> 72;
            case 143 -> 231;
            case 144 -> 194;
            case 145 -> 198;
            case 146 -> 148;
            case 147 -> 224;
            case 148 -> 80;
            case 149 -> 87;
            case 150 -> 150;
            case 151 -> 160;
            case 152 -> 215;
            case 153 -> 40;
            case 154 -> 49;
            case 155 -> 152;
            case 156 -> 120;
            case 157 -> 69;
            case 158 -> 134;
            case 159 -> 243;
            case 160 -> 141;
            case 161 -> 138;
            case 162 -> 228;
            case 163 -> 73;
            case 164 -> 230;
            case 165 -> 30;
            case 166 -> 54;
            case 167 -> 246;
            case 168 -> 251;
            case 169 -> 53;
            case 170 -> 184;
            case 171 -> 105;
            case 172 -> 51;
            case 173 -> 0;
            case 174 -> 177;
            case 175 -> 182;
            case 176 -> 97;
            case 177 -> 219;
            case 178 -> 59;
            case 179 -> 254;
            case 180 -> 104;
            case 181 -> 161;
            case 182 -> 111;
            case 183 -> 43;
            case 184 -> 8;
            case 185 -> 93;
            case 186 -> 48;
            case 187 -> 61;
            case 188 -> 222;
            case 189 -> 240;
            case 190 -> 247;
            case 191 -> 74;
            case 192 -> 127;
            case 193 -> 151;
            case 194 -> 220;
            case 195 -> 70;
            case 196 -> 94;
            case 197 -> 162;
            case 198 -> 56;
            case 199 -> 179;
            case 200 -> 208;
            case 201 -> 180;
            case 202 -> 122;
            case 203 -> 76;
            case 204 -> 217;
            case 205 -> 149;
            case 206 -> 165;
            case 207 -> 146;
            case 208 -> 98;
            case 209 -> 197;
            case 210 -> 245;
            case 211 -> 58;
            case 212 -> 106;
            case 213 -> 200;
            case 214 -> 47;
            case 215 -> 178;
            case 216 -> 10;
            case 217 -> 244;
            case 218 -> 129;
            case 219 -> 27;
            case 220 -> 210;
            case 221 -> 55;
            case 222 -> 4;
            case 223 -> 52;
            case 224 -> 82;
            case 225 -> 22;
            case 226 -> 172;
            case 227 -> 136;
            case 228 -> 137;
            case 229 -> 123;
            case 230 -> 163;
            case 231 -> 14;
            case 232 -> 242;
            case 233 -> 191;
            case 234 -> 84;
            case 235 -> 15;
            case 236 -> 168;
            case 237 -> 159;
            case 238 -> 234;
            case 239 -> 9;
            case 240 -> 28;
            case 241 -> 112;
            case 242 -> 31;
            case 243 -> 6;
            case 244 -> 147;
            case 245 -> 35;
            case 246 -> 249;
            case 247 -> 12;
            case 248 -> 130;
            case 249 -> 91;
            case 250 -> 21;
            case 251 -> 24;
            case 252 -> 218;
            case 253 -> 19;
            case 254 -> 216;
            default -> 107;
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

         f[var2] = new String(var3).intern();
      }

      return f[var2];
   }
}
