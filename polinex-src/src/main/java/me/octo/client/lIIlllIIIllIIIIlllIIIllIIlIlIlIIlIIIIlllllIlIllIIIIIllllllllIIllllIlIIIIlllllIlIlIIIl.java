package me.octo.client;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl {
   @NotNull
   public static lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.PXEvMid IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 24.0F;
   private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 2.0F;
   private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 6.0F;
   private final float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 32.0F;
   @NotNull
   private final String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static HashMap<String, lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] a;
   private static String[] b;

   public lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl() {
      short var10001 = 13982;
      short var10002 = 6505;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = "route_sort_dropdown";
   }

   private final float a() {
      Object var11 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var1 != null) {
         lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         );
         if (var10000 != null) {
            lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2;
            label45: {
               var2 = var10000;
               long var3 = System.currentTimeMillis();
               float var5 = (float)(var3 - var2.b());
               float var6 = var2.a() ? 250.0F : 125.0F;
               float var7 = RangesKt.coerceIn(var5 / var6, 0.0F, 1.0F);
               float var8 = var2.a()
                  ? IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .D(var7)
                  : IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .v(var7);
               var10000 = var2;
               if (var1 != null) {
                  if (var2.a()) {
                     var11 = var2.c() + (1.0F - var2.c()) * var8;
                     break label45;
                  }

                  var10000 = var2;
               }

               var11 = var10000.c() - var2.c() * var8;
            }

            float var9 =((Float)( var11));
            int var12 = ((var2.a()) ? 1 : 0);
            if (var1 != null) {
               if (var12 != 0) {
                  return var9;
               }

               if (var1 == null) {
                  return var9;
               }

               float var14;
               var12 = (var14 = var9 - 0.001F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            }

            if (var12 <= 0) {
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.remove(
                  this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               );
               return 0.0F;
            }

            return var9;
         }
      }

      return 0.0F;
   }

   private final void b() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1;
      long var2;
      lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4;
      label24: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
         var2 = System.currentTimeMillis();
         var4 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         );
         var1 = var10000;
         if (var1 != null) {
            if (var4 != null) {
               break label24;
            }

            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               new lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                  true, var2, 0.0F
               )
            );
         }

         if (var1 != null) {
            return;
         }
      }

      float var5 = this.a();
      boolean var10001 = var4.a();
      if (var1 != null) {
         var10001 = !var10001;
      }

      var4.a(var10001);
      var4.a(var2);
      var4.a(var5);
   }

   private final float a(int var1) {
      float var13 = 0; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var2 != null) {
         lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10000 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         );
         if (var10000 != null) {
            lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3;
            float var6;
            label33: {
               var3 = var10000;
               long var4 = System.currentTimeMillis();
               var6 = (float)(var4 - var3.b());
               int var12 = ((var3.a()) ? 1 : 0);
               if (var2 != null) {
                  if (var12 == 0) {
                     var13 = 0.0F;
                     break label33;
                  }

                  var12 = var1;
               }

               var13 = var12 * 20.0F;
            }

            float var7 = var13;
            float var8 = RangesKt.coerceAtLeast(var6 - var7, 0.0F);
            float var9 = var3.a() ? 250.0F : 125.0F;
            float var10 = RangesKt.coerceIn(var8 / var9, 0.0F, 1.0F);
            float var11 = var3.a()
               ? IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .D(var10)
               : IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .v(var10);
            return var3.a() ? var11 : 1.0F - var11;
         }
      }

      return 0.0F;
   }

   @Nullable
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      @NotNull GuiGraphicsExtractor var1,
      float var2,
      float var3,
      float var4,
      float var5,
      @NotNull IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var6,
      int var7,
      int var8,
      float var9,
      @NotNull final Function1<? super IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll, Unit> var10
   ) {
      Object var74 = null; // PX-FIX
      Object var71 = null; // PX-FIX
      Object var69 = null; // PX-FIX
      Object var67 = null; // PX-FIX
      short var10001 = 13979;
      int var10002 = 18684;
      Intrinsics.checkNotNullParameter(var1, "context");
      var10001 = 13983;
      var10002 = (short)-14381;
      Intrinsics.checkNotNullParameter(var6, "currentSort");
      var10001 = 13981;
      var10002 = (short)-32669;
      Intrinsics.checkNotNullParameter(var10, "onSelect");
      IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] var12 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.b();
      String var13 = var6.a();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      float var14 = this.a();
      float var15 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var13, false, 2, null)
         + 50.0F;
      IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] var18 = var12;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var11 = var10000;
      int var64 = var12.length;
      if (var11 != null) {
         var64 = var64 == 0 ? 1 : 0;
      }

      Float var65;
      if (var64 != 0) {
         var65 = null;
      } else {
         IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var19 = var12[0];
         int var20 = 0;
         float var53 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
            var19.a(),
            false, 2, null);
         var20 = 1;
         int var21 = ArraysKt.getLastIndex(var12);
         if (var20 <= var21) {
            do {
               IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var22 = var18[var20];
               boolean var23 = false;
               float var58 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                  var22.a(),
                  false, 2, null);
               var53 = Math.max(var53, var58);
               if (var20 == var21) {
                  break;
               }

               var20++;
            } while (var11 != null);
         }

         var65 = var53;
      }

      label256: {
         Float var17 = var65;
         Float var66 = var17;
         if (var11 != null) {
            if (var17 == null) {
               var67 = var4;
               break label256;
            }

            var66 = var17;
         }

         var67 = var66 + 50.0F;
      }

      float var16 =((Float)( var67));
      lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.PXEvMid.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var51 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      );
      boolean var52 = var11 != null && var51 != null ? var51.a() : false;
      float var68 = var14;
      if (var11 != null) {
         var68 = !(var14 > 0.01F) && !var52
            ? me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(var4, var15)
            : me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(var4, me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(var15, var16, var14));
      }

      float var54;
      float var57;
      float var59;
      label238: {
         label270: {
            var54 = var68;
            int var56 = var12.length;
            var57 = var56
                  * (
                     this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  )
               + 8.0F;
            var59 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII + var57 * var14;
            float var83;
            var69 = (var83 = var7 - var2) == 0.0F ? 0 : (var83 < 0.0F ? -1 : 1);
            if (var11 != null) {
               if (((Boolean)var69)) {
                  break label270;
               }

               float var84;
               var69 = (var84 = var7 - (var2 + var54)) == 0.0F ? 0 : (var84 < 0.0F ? -1 : 1);
            }

            if (var11 != null) {
               if (((Boolean)var69)) {
                  break label270;
               }

               float var85;
               var69 = (var85 = var8 - var3) == 0.0F ? 0 : (var85 < 0.0F ? -1 : 1);
            }

            if (var11 != null) {
               if (((Boolean)var69)) {
                  break label270;
               }

               float var86;
               var69 = (var86 = var8 - (var3 + var59)) == 0.0F ? 0 : (var86 < 0.0F ? -1 : 1);
            }

            if (var11 == null) {
               break label238;
            }

            if (((Boolean)var69)) {
               var69 = 1;
               break label238;
            }
         }

         var69 = 0;
      }

      label217: {
         label271: {
            int var60 =((Integer)( var69));
            var10001 = 13980;
            short var81 = -15084;
            var10002 = var60;
            if (var11 != null) {
               if (var60 == 0) {
                  break label271;
               }

               float var87;
               var10002 = (var87 = var14 - 0.1F) == 0.0F ? 0 : (var87 < 0.0F ? -1 : 1);
            }

            if (var11 == null) {
               break label217;
            }

            if (var10002 < 0) {
               var10002 = 1;
               break label217;
            }
         }

         var10002 = 0;
      }

      float var24 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "sortdrop:main",
         (var10002 != 0),
         0.0F,
         4,
         null
      );
      float var88;
      int var70 = (var88 = var24 - 0.01F) == 0.0F ? 0 : (var88 < 0.0F ? -1 : 1);
      if (var11 != null) {
         if (var70 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var2,
               var3,
               var54,
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var24 * 0.45F,
               3.0F);
         }

         float var89;
         var70 = (var89 = var24 - 0.01F) == 0.0F ? 0 : (var89 < 0.0F ? -1 : 1);
      }

      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var29;
      label203: {
         label272: {
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var25 = var70 > 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .B()
                  .a(
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .C(),
                     var24
                  )
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .B();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var2, var3, var54, var59, var25, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var2,
               var3,
               var54,
               var59,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.6F + var24 * 0.3F),
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var13, var2 + 14.0F, var3 + 8.0F, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(), false, 16, null);
            float var26 = var2 + var54 - 25.0F;
            float var27 = var3 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII / 2.0F;
            float var28 = var14 * 180.0F;
            me.octo.client.utils.IIlIlllllIIlIllllIlIlIIIllIlIIlIlllIIllIIIIIlIIIIlIIIIlIlIlIlIllIlllllIIIllIIlllllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .d(
                  var1,
                  var26 + 6,
                  var27,
                  16.0F,
                  8.0F,
                  var28,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .F(),
                  2.0F
               );
            var29 = null;
            float var90;
            var71 = (var90 = var7 - var2) == 0.0F ? 0 : (var90 < 0.0F ? -1 : 1);
            if (var11 != null) {
               if (((Boolean)var71)) {
                  break label272;
               }

               float var91;
               var71 = (var91 = var7 - (var2 + var54)) == 0.0F ? 0 : (var91 < 0.0F ? -1 : 1);
            }

            if (var11 != null) {
               if (((Boolean)var71)) {
                  break label272;
               }

               float var92;
               var71 = (var92 = var8 - var3) == 0.0F ? 0 : (var92 < 0.0F ? -1 : 1);
            }

            if (var11 != null) {
               if (((Boolean)var71)) {
                  break label272;
               }

               float var93;
               var71 = (var93 = var8 - (var3 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII)) == 0.0F
                  ? 0
                  : (var93 < 0.0F ? -1 : 1);
            }

            if (var11 == null) {
               break label203;
            }

            if (((Boolean)var71)) {
               var71 = 1;
               break label203;
            }
         }

         var71 = 0;
      }

      int var30 =((Integer)( var71));
      if (var30 != 0) {
         var29 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
            @Override
            public void e() {
               lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.this.b();
            }

            @Override
            public void a(char var1, int var2x) {
            }
         };
      }

      float var72 = var14;
      float var78 = 0.01F;
      if (var11 != null) {
         if (!(var14 > 0.01F)) {
            return var29;
         }

         var72 = var3 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         var78 = 4.0F;
      }

      float var31 = var72 + var78;
      float var32 = var57 * var14;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var2 + 5.0F, var31, var54 - 10.0F, var32);
      float var33 = var31;
      int var34 = 0;
      int var35 = var12.length;

      while (var34 < var35) {
         final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var36 = var12[var34];
         float var37 = this.a(var34);
         if (var11 == null) {
            return var29;
         }

         label275: {
            float var73 = var37;
            if (var11 != null) {
               if (var37 <= 0.02F) {
                  var33 += this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  if (var11 != null) {
                     break label275;
                  }
               }

               var73 = var37;
            }

            float var38;
            float var39;
            float var42;
            label164: {
               label276: {
                  var38 = var73;
                  var39 = 0.85F + 0.15F * var37;
                  float var40 = (1.0F - var37) * 20.0F;
                  float var41 = (1.0F - var37) * 5.0F;
                  var42 = var33 + var41;
                  float var43 = var2 + 12.0F + var40;
                  float var94;
                  var74 = (var94 = var7 - (var2 + 5.0F)) == 0.0F ? 0 : (var94 < 0.0F ? -1 : 1);
                  if (var11 != null) {
                     if (((Boolean)var74)) {
                        break label276;
                     }

                     float var95;
                     var74 = (var95 = var7 - (var2 + var54 - 5.0F)) == 0.0F ? 0 : (var95 < 0.0F ? -1 : 1);
                  }

                  if (var11 != null) {
                     if (((Boolean)var74)) {
                        break label276;
                     }

                     float var96;
                     var74 = (var96 = var8 - var42) == 0.0F ? 0 : (var96 < 0.0F ? -1 : 1);
                  }

                  if (var11 != null) {
                     if (((Boolean)var74)) {
                        break label276;
                     }

                     float var97;
                     var74 = (var97 = var8 - (var42 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)) == 0.0F
                        ? 0
                        : (var97 < 0.0F ? -1 : 1);
                  }

                  if (var11 != null) {
                     if (((Boolean)var74)) {
                        break label276;
                     }

                     float var98;
                     var74 = (var98 = var14 - 0.8F) == 0.0F ? 0 : (var98 < 0.0F ? -1 : 1);
                  }

                  if (var11 == null) {
                     break label164;
                  }

                  if (((Boolean)var74)) {
                     var74 = 1;
                     break label164;
                  }
               }

               var74 = 0;
            }

            int var44 =((Integer)( var74));
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var38);
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var45 = var36 == var6
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .D()
               : (
                  var44 != 0
                     ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .E()
                     : new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 0)
               );
            if (var45.d() > 0) {
               float var46 = var54 - 20.0F;
               float var47 = var46 * var39;
               float var48 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII * var39;
               float var49 = var2 + 10.0F + (var46 - var47) * 0.5F;
               float var50 = var42 + (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII - var48) * 0.5F;
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var49, var50, var47, var48, var45, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI * 0.6F
               );
            }

            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var61 = var36 == var6
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
            float var62 = var2 + var54 * 0.5F;
            float var63 = var42 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII * 0.5F;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var62, var63);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var39, var39);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(-var62, -var63);
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               var36.a(),
               var2 + 14.0F,
               var42 + 4.0F,
               var61,
               false, 16, null);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
            if (var44 != 0) {
               var29 = new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
                  @Override
                  public void e() {
                     var10.invoke(var36);
                     lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.this.b();
                  }

                  @Override
                  public void a(char var1, int var2) {
                  }
               };
            }

            var33 += this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         var34++;
         if (var11 == null) {
            break;
         }
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i();
      return var29;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "\u009a\u0084H´Ð¿ ¹(\u001a~\u0013\u0083R_1Õø\u0007z&ß*åø<íÈÊ\u000b5\bÂ\u001aï\b(Ö\u0080Ù";
      int var4 = "\u009a\u0084H´Ð¿ ¹(\u001a~\u0013\u0083R_1Õø\u0007z&ß*åø<íÈÊ\u000b5\bÂ\u001aï\b(Ö\u0080Ù".length();
      char var1 = 11;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 10;
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
                     case 0 -> 91;
                     case 1 -> 103;
                     case 2 -> 70;
                     case 3 -> 42;
                     case 4 -> 3;
                     case 5 -> 117;
                     default -> 44;
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
                     b = new String[5];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.PXEvMid(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap<>();
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

                  var2 = "Î¿Ë\u0097º\u001aÌª\u0093;øU\\\u0007 Ì\bù\\Ý*";
                  var4 = "Î¿Ë\u0097º\u001aÌª\u0093;øU\\\u0007 Ì\bù\\Ý*".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var10000 = 18;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 13983) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 105;
            case 1 -> 100;
            case 2 -> 118;
            case 3 -> 225;
            case 4 -> 165;
            case 5 -> 234;
            case 6 -> 152;
            case 7 -> 239;
            case 8 -> 47;
            case 9 -> 107;
            case 10 -> 14;
            case 11 -> 129;
            case 12 -> 172;
            case 13 -> 8;
            case 14 -> 52;
            case 15 -> 140;
            case 16 -> 74;
            case 17 -> 24;
            case 18 -> 62;
            case 19 -> 145;
            case 20 -> 133;
            case 21 -> 70;
            case 22 -> 245;
            case 23 -> 59;
            case 24 -> 142;
            case 25 -> 116;
            case 26 -> 204;
            case 27 -> 83;
            case 28 -> 177;
            case 29 -> 144;
            case 30 -> 48;
            case 31 -> 115;
            case 32 -> 13;
            case 33 -> 113;
            case 34 -> 106;
            case 35 -> 121;
            case 36 -> 175;
            case 37 -> 236;
            case 38 -> 196;
            case 39 -> 42;
            case 40 -> 68;
            case 41 -> 206;
            case 42 -> 119;
            case 43 -> 22;
            case 44 -> 143;
            case 45 -> 35;
            case 46 -> 25;
            case 47 -> 244;
            case 48 -> 182;
            case 49 -> 87;
            case 50 -> 54;
            case 51 -> 55;
            case 52 -> 18;
            case 53 -> 120;
            case 54 -> 19;
            case 55 -> 157;
            case 56 -> 49;
            case 57 -> 73;
            case 58 -> 30;
            case 59 -> 158;
            case 60 -> 230;
            case 61 -> 216;
            case 62 -> 159;
            case 63 -> 214;
            case 64 -> 125;
            case 65 -> 192;
            case 66 -> 237;
            case 67 -> 254;
            case 68 -> 179;
            case 69 -> 69;
            case 70 -> 112;
            case 71 -> 27;
            case 72 -> 155;
            case 73 -> 160;
            case 74 -> 215;
            case 75 -> 167;
            case 76 -> 45;
            case 77 -> 217;
            case 78 -> 223;
            case 79 -> 183;
            case 80 -> 153;
            case 81 -> 205;
            case 82 -> 4;
            case 83 -> 51;
            case 84 -> 67;
            case 85 -> 124;
            case 86 -> 95;
            case 87 -> 3;
            case 88 -> 102;
            case 89 -> 163;
            case 90 -> 218;
            case 91 -> 40;
            case 92 -> 178;
            case 93 -> 77;
            case 94 -> 0;
            case 95 -> 28;
            case 96 -> 33;
            case 97 -> 224;
            case 98 -> 109;
            case 99 -> 198;
            case 100 -> 170;
            case 101 -> 16;
            case 102 -> 208;
            case 103 -> 101;
            case 104 -> 220;
            case 105 -> 174;
            case 106 -> 213;
            case 107 -> 193;
            case 108 -> 235;
            case 109 -> 98;
            case 110 -> 186;
            case 111 -> 162;
            case 112 -> 194;
            case 113 -> 64;
            case 114 -> 76;
            case 115 -> 53;
            case 116 -> 50;
            case 117 -> 241;
            case 118 -> 232;
            case 119 -> 200;
            case 120 -> 61;
            case 121 -> 71;
            case 122 -> 38;
            case 123 -> 191;
            case 124 -> 173;
            case 125 -> 252;
            case 126 -> 85;
            case 127 -> 122;
            case 128 -> 5;
            case 129 -> 75;
            case 130 -> 108;
            case 131 -> 197;
            case 132 -> 166;
            case 133 -> 79;
            case 134 -> 226;
            case 135 -> 32;
            case 136 -> 253;
            case 137 -> 164;
            case 138 -> 149;
            case 139 -> 63;
            case 140 -> 250;
            case 141 -> 37;
            case 142 -> 248;
            case 143 -> 219;
            case 144 -> 88;
            case 145 -> 26;
            case 146 -> 240;
            case 147 -> 103;
            case 148 -> 72;
            case 149 -> 136;
            case 150 -> 86;
            case 151 -> 134;
            case 152 -> 2;
            case 153 -> 11;
            case 154 -> 36;
            case 155 -> 135;
            case 156 -> 156;
            case 157 -> 185;
            case 158 -> 80;
            case 159 -> 15;
            case 160 -> 111;
            case 161 -> 147;
            case 162 -> 60;
            case 163 -> 20;
            case 164 -> 188;
            case 165 -> 210;
            case 166 -> 249;
            case 167 -> 246;
            case 168 -> 66;
            case 169 -> 150;
            case 170 -> 41;
            case 171 -> 195;
            case 172 -> 130;
            case 173 -> 233;
            case 174 -> 146;
            case 175 -> 251;
            case 176 -> 110;
            case 177 -> 89;
            case 178 -> 96;
            case 179 -> 6;
            case 180 -> 242;
            case 181 -> 117;
            case 182 -> 21;
            case 183 -> 211;
            case 184 -> 65;
            case 185 -> 169;
            case 186 -> 123;
            case 187 -> 148;
            case 188 -> 181;
            case 189 -> 138;
            case 190 -> 10;
            case 191 -> 81;
            case 192 -> 92;
            case 193 -> 12;
            case 194 -> 207;
            case 195 -> 229;
            case 196 -> 128;
            case 197 -> 91;
            case 198 -> 222;
            case 199 -> 34;
            case 200 -> 255;
            case 201 -> 90;
            case 202 -> 137;
            case 203 -> 43;
            case 204 -> 31;
            case 205 -> 243;
            case 206 -> 199;
            case 207 -> 9;
            case 208 -> 97;
            case 209 -> 126;
            case 210 -> 201;
            case 211 -> 1;
            case 212 -> 212;
            case 213 -> 247;
            case 214 -> 23;
            case 215 -> 139;
            case 216 -> 184;
            case 217 -> 203;
            case 218 -> 209;
            case 219 -> 104;
            case 220 -> 132;
            case 221 -> 84;
            case 222 -> 227;
            case 223 -> 93;
            case 224 -> 141;
            case 225 -> 29;
            case 226 -> 171;
            case 227 -> 44;
            case 228 -> 202;
            case 229 -> 46;
            case 230 -> 176;
            case 231 -> 221;
            case 232 -> 39;
            case 233 -> 114;
            case 234 -> 17;
            case 235 -> 58;
            case 236 -> 94;
            case 237 -> 231;
            case 238 -> 82;
            case 239 -> 180;
            case 240 -> 56;
            case 241 -> 187;
            case 242 -> 168;
            case 243 -> 190;
            case 244 -> 127;
            case 245 -> 189;
            case 246 -> 151;
            case 247 -> 154;
            case 248 -> 238;
            case 249 -> 78;
            case 250 -> 57;
            case 251 -> 228;
            case 252 -> 131;
            case 253 -> 99;
            case 254 -> 7;
            default -> 161;
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

   public static final class PXEvMid implements IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public PXEvMid(Object... px) {
         this.this$0 = null;
        }
      public PXEvMid(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private PXEvMid() {
         this.this$0 = null;
      }

      // PX-RBPORT rbportB: jar anonymous inner-class body ported member-for-member
      final me.octo.client.lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl this$0;

      public PXEvMid(me.octo.client.lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl var0) {
         this.this$0 = var0;
      }

      public void e() {
         me.octo.client.lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl.a(this.this$0);
      }

      public void a(char var1, int var2) {
      }

      public void d() {
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
      }

      public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
         return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
      }

      private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
         private boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         private long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

         public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(boolean var1, long var2, float var4) {
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         }

         public final boolean a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }

         public final void a(boolean var1) {
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         }

         public final long b() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         public final void a(long var1) {
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
         }

         public final float c() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         public final void a(float var1) {
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
         }
      }
   }

  // PX-FIX synth restored from jar bytecode
  public static void a(me.octo.client.lIIlllIIIllIIIIlllIIIllIIlIlIlIIlIIIIlllllIlIllIIIIIllllllllIIllllIlIIIIlllllIlIlIIIl p0) { p0.b(); }
}
