package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll {
   @NotNull
   private final Function1<IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll, Unit> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Function1<lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl, Unit> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final Function0<Unit> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private volatile List<llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] a;
   private static String[] b;

   public lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll(
      @NotNull Function1<? super IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll, Unit> var1,
      @NotNull Function1<? super lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl, Unit> var2,
      @NotNull Function0<Unit> var3
   ) {
      short var10001 = 27379;
      short var10002 = -31973;
      Intrinsics.checkNotNullParameter(var1, "requestConfirm");
      var10001 = 27376;
      var10002 = -1163;
      Intrinsics.checkNotNullParameter(var2, "requestRating");
      var10001 = 27365;
      var10002 = -12434;
      Intrinsics.checkNotNullParameter(var3, "dismissPopup");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = ((Function1<IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll,Unit>)(Object)(var1));
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = ((Function1<lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl,Unit>)(Object)(var2));
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.emptyList();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll(
         75
      );
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
   }

   public final void a() {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
   }

   @Nullable
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8
   ) {
      Object var39 = null; // PX-FIX
      Object var38 = null; // PX-FIX
      float var36 = 0; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      short var10002 = 27344;
      short var10003 = -13751;
      Intrinsics.checkNotNullParameter(var1, "context");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var9 = var10000;
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var32 = this;
      if (var9 != null) {
         if (!this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
            this.a();
         }

         var32 = this;
      }

      List var10 = var32.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      byte var33 = ((byte)((var10.isEmpty()) ? 1 : 0));
      if (var9 != null) {
         if (var33 != 0) {
            short var10001 = 27364;
            var10002 = 27960;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               .a(
                  "No downloads yet — grab a route from the Browse tab",
                  var2 + var4 / 2.0F,
                  var3 + var5 / 2.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
               );
            return null;
         }

         var33 = 2;
      }

      byte var11;
      float var12;
      float var13;
      float var14;
      float var15;
      float var17;
      float var18;
      label139: {
         var11 = var33;
         var12 = 10.0F;
         var13 = 10.0F;
         var14 = (var4 - var12 - 10.0F) / var11;
         var15 = 70.0F;
         int var16 = (var10.size() + var11 - 1) / var11;
         var17 = var16 * (var15 + var13);
         var18 = -(var17 - var5);
         lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var34 = this;
         if (var9 != null) {
            if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
               break label139;
            }

            var34 = this;
         }

         var34.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll(
            new llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll(1000.0F, 700.0F)
         );
      }

      label133: {
         float var42;
         int var35 = (var42 = var17 - var5) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
         if (var9 != null) {
            if (var35 > 0) {
               if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                     .a(var2 + var4 - 8.0F, var3, var5, var18, this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
               }
            }

            var36 = var17;
            if (var9 == null) {
               break label133;
            }

            float var43;
            var35 = (var43 = var17 - var5) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
         }

         var36 = var35 > 0 ? this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.e() : 0.0F;
      }

      float var19 = var36;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var2, var3, var4 - 10.0F, var5);
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var20 = null;
      Iterator var21 = var10.iterator();
      int var22 = 0;

      label125:
      while (true) {
         int var37 = ((var21.hasNext()) ? 1 : 0);

         while (var37 != 0) {
            int var23 = var22++;
            llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var24 = (llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var21.next();
            int var25 = var23 % var11;
            int var26 = var23 / var11;
            float var27 = var2 + var25 * (var14 + var12);
            float var28 = var3 + var19 + var26 * (var15 + var13);
            float var44;
            var38 = (var44 = var28 + var15 - (var3 - 50)) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
            if (var9 == null) {
               break label125;
            }

            if (var9 != null) {
               if ((me.octo.client.PxTruth.truth(var38))) {
                  continue label125;
               }

               float var45;
               var38 = (var45 = var28 - (var3 + var5 + 50)) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
            }

            if (var9 != null) {
               if ((me.octo.client.PxTruth.truth(var38))) {
                  continue label125;
               }

               var38 = this.a(var24, var27, var28, var14, var15, var6, var7);
            }

            int var29;
            label116: {
               label148: {
                  var29 =((Integer)( var38));
                  float var46;
                  var39 = (var46 = var6 - var27) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
                  if (var9 != null) {
                     if ((me.octo.client.PxTruth.truth(var39))) {
                        break label148;
                     }

                     float var47;
                     var39 = (var47 = var6 - (var27 + var14)) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1);
                  }

                  if (var9 != null) {
                     if ((me.octo.client.PxTruth.truth(var39))) {
                        break label148;
                     }

                     float var48;
                     var39 = (var48 = var7 - var28) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
                  }

                  if (var9 != null) {
                     if ((me.octo.client.PxTruth.truth(var39))) {
                        break label148;
                     }

                     float var49;
                     var39 = (var49 = var7 - (var28 + var15)) == 0.0F ? 0 : (var49 < 0.0F ? -1 : 1);
                  }

                  if (var9 == null) {
                     break label116;
                  }

                  if ((me.octo.client.PxTruth.truth(var39))) {
                     var39 = 1;
                     break label116;
                  }
               }

               var39 = 0;
            }

            int var30 =((Integer)( var39));
            var37 = var30;
            if (var9 != null) {
               if (var30 == 0 || var20 != null) {
                  continue label125;
               }
               var20 = switch (var29) {
                  case 0 -> this.a(() -> a(this, var24));
                  case 1 -> this.a(() -> b(this, var24));
                  case 2 -> this.a(() -> c(this, var24));
                  default -> (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
               };
               if (var9 != null) {
                  continue label125;
               }
               break;
            }
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i();
         float var50;
         var38 = (var50 = var17 - var5) == 0.0F ? 0 : (var50 < 0.0F ? -1 : 1);
         break;
      }

      if ((me.octo.client.PxTruth.truth(var38))) {
         if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var1, var6, var7, var8);
         }
      }

      return var20;
   }

   private final int a(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7
   ) {
      Object var33 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8;
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var9;
      int var31;
      label98: {
         label101: {
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            var9 = var1.a();
            var8 = var10000;
            float var46;
            var31 = (var46 = var6 - var2) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var31 < 0) {
                  break label101;
               }

               float var47;
               var31 = (var47 = var6 - (var2 + var4)) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var31 > 0) {
                  break label101;
               }

               float var48;
               var31 = (var48 = var7 - var3) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var31 < 0) {
                  break label101;
               }

               float var49;
               var31 = (var49 = var7 - (var3 + var5)) == 0.0F ? 0 : (var49 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label98;
            }

            if (var31 <= 0) {
               var31 = 1;
               break label98;
            }
         }

         var31 = 0;
      }

      int var10;
      float var17;
      label76: {
         var10 = var31;
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = var10 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
               .b(3.0F, 3.0F, 3.0F)
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j();
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var12 = var10 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .z()
               .a(0.7F)
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.35F);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var2,
            var3,
            var4,
            var5,
            var11,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aq()
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var2,
            var3,
            var4,
            var5,
            1.0F,
            var12,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .aq()
         );
         IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var13 = IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(var9.c());
         float var14 = 44.0F;
         float var15 = var2 + 8.0F;
         float var16 = var3 + (var5 - var14) / 2.0F;
         me.octo.client.utils.IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var13.b(), var13.a(), var15, var16, var14, var10 != 0 ? 1.0F : 0.92F, true);
         var17 = var15 + var14 + 12.0F;
         IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var32 = var9;
         if (var8 != null) {
            if (var9.b().length() > 22) {
               String var34 = var9.b().substring(0, 21);
               short var10002 = 27342;
               short var10003 = 1115;
               Intrinsics.checkNotNullExpressionValue(var34, "substring(...)");
               var33 = var34 + "…";
               break label76;
            }

            var32 = var9;
         }

         var33 = var32.b();
      }

      String var18 =((String)( var33));
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
         var18,
         var17,
         var3 + var5 / 2.0F - 8.0F,
         var10 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .a(0.92F),
         false, 16, null);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var35 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      int var10001 = var9.d();
      String var42 = var9.f();
      short var43 = 27390;
      short var10004 = 14942;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         var35,
         var10001 + " pts · by " + var42,
         var17,
         var3 + var5 / 2.0F + 8.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         false, 16, null);
      float var19 = 50.0F;
      float var20 = 36.0F;
      float var21 = 26.0F;
      float var22 = 8.0F;
      float var23 = var2 + var4 - 16.0F - var19;
      float var24 = var3 + (var5 - var20) / 2.0F;
      float var25 = var23 - var21 - var22;
      float var26 = var3 + (var5 - var21) / 2.0F;
      float var27 = var25 - var21 - var22;
      float var28 = var3 + (var5 - var21) / 2.0F;
      String var37;
      if (IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var9.a())) {
         short var36 = 27335;
         short var40 = -21306;
         var37 = "\n        <svg viewBox=\"0 0 24 24\" fill=\"currentColor\" stroke=\"currentColor\" stroke-width=\"2\">\n            <polygon points=\"12,2 15.09,8.26 22,9.27 17,14.14 18.18,21.02 12,17.77 5.82,21.02 7,14.14 2,9.27 8.91,8.26 12,2\"/>\n        </svg>\n    ";
      } else {
         short var38 = 27387;
         short var41 = 31760;
         var37 = "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <polygon points=\"12,2 15.09,8.26 22,9.27 17,14.14 18.18,21.02 12,17.77 5.82,21.02 7,14.14 2,9.27 8.91,8.26 12,2\"/>\n        </svg>\n    ";
      }

      String var29 = var37;
      byte var30 = -1;
      var10004 = 27349;
      short var10005 = -10755;
      byte var39 = ((byte)((this.a(
         var27,
         var28,
         var21,
         "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
         var6,
         var7
      )) ? 1 : 0));
      if (var8 != null) {
         if (var39 != 0) {
            var30 = 1;
         }

         var39 = ((byte)((this.a(var25, var26, var21, var29, var6, var7)) ? 1 : 0));
      }

      if (var8 != null) {
         if (var39 != 0) {
            var30 = 2;
         }

         var10005 = 27359;
         short var10006 = 13481;
         var39 = ((byte)((this.a(
            var23,
            var24,
            var19,
            var20,
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.8\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n        <polyline points=\"23 4 23 10 17 10\"/>\n        <polyline points=\"1 20 1 14 7 14\"/>\n        <path d=\"M3.51 9a9 9 0 0 1 14.85-3.36L23 10M1 14l4.64 4.36A9 9 0 0 0 20.49 15\"/>\n    </svg>\n",
            var6,
            var7
         )) ? 1 : 0));
      }

      if (var8 != null) {
         if (var39 != 0) {
            var30 = 0;
         }

         var39 = var30;
      }

      return var39;
   }

   private final boolean a(float var1, float var2, float var3, float var4, String var5, int var6, int var7) {
      int var10000;
      label53: {
         label56: {
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            float var13;
            var10000 = (var13 = var6 - var1) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var10000 < 0) {
                  break label56;
               }

               float var14;
               var10000 = (var14 = var6 - (var1 + var3)) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10000 > 0) {
                  break label56;
               }

               float var15;
               var10000 = (var15 = var7 - var2) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var10000 < 0) {
                  break label56;
               }

               float var16;
               var10000 = (var16 = var7 - (var2 + var4)) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label53;
            }

            if (var10000 <= 0) {
               var10000 = 1;
               break label53;
            }
         }

         var10000 = 0;
      }

      int var9 = var10000;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10 = var9 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h()
            .b(8.0F, 8.0F, 8.0F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .h();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = var9 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .z()
            .a(0.8F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.5F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         var10,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         var11,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      float var12 = 18.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            var5,
            var1 + (var3 - var12) / 2.0F,
            var2 + (var4 - var12) / 2.0F,
            var12,
            var9 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
                  .a(0.9F),
            1.0F
         );
      return (var9 != 0);
   }

   private final boolean a(float var1, float var2, float var3, String var4, int var5, int var6) {
      int var10000;
      label53: {
         label56: {
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var7 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            float var11;
            var10000 = (var11 = var5 - var1) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
            if (var7 != null) {
               if (var10000 < 0) {
                  break label56;
               }

               float var12;
               var10000 = (var12 = var5 - (var1 + var3)) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var10000 > 0) {
                  break label56;
               }

               float var13;
               var10000 = (var13 = var6 - var2) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            }

            if (var7 != null) {
               if (var10000 < 0) {
                  break label56;
               }

               float var14;
               var10000 = (var14 = var6 - (var2 + var3)) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            }

            if (var7 == null) {
               break label53;
            }

            if (var10000 <= 0) {
               var10000 = 1;
               break label53;
            }
         }

         var10000 = 0;
      }

      int var8 = var10000;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = var8 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.3F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, var2, var3, var3, var9, 6.0F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var3,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(var8 != 0 ? 0.5F : 0.2F),
         6.0F
      );
      float var10 = var3 - 14.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            var4,
            var1 + (var3 - var10) / 2.0F,
            var2 + (var3 - var10) / 2.0F,
            var10,
            var8 != 0
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .b(),
            1.0F
         );
      return (var8 != 0);
   }

   private final void a(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      label16: {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
         if (var2 != null) {
            if (!IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var1.a().a())) {
               break label16;
            }

            Function1 var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            short var10003 = 27362;
            short var10004 = -21109;
            String var3 = var1.a().b();
            short var10005 = 27363;
            short var10006 = -4636;
            var10006 = 27356;
            short var10007 = 11002;
            String var4 = "You've already rated '" + var3 + "'. Want to change your rating?";
            var10005 = 27358;
            var10006 = -22741;
            var10006 = 27346;
            var10007 = 14906;
            var10000.invoke(
               new IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll(
                  "Change your rating?",
                  var4,
                  "Change",
                  "Keep",
                  false,
                  () -> e(this, var1),
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               )
            );
         }

         if (var2 != null) {
            return;
         }
      }

      this.b(var1);
   }

   private final void b(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .invoke(
            new lIIIllIlIlllIlIllIIIIlIlIIIllIIIlIlIIlIllIlllIlIlIllIlIIIlIllIIIIIIIllIlIlIIIIlIIIIIl(
               var1.a().b(),
               0,
               var2x -> a(this, var1, var2x),
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               2,
               null
            )
         );
   }

   private final void a(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      int var2
   ) {
      me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var10000 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10002 = 27345;
      short var10003 = -16888;
      String var3 = var1.a().b();
      short var10004 = 27360;
      short var10005 = 28942;
      var10000.b(
         1500L,
         "Routes",
         "Rating " + var3 + "…",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      new Thread(() -> b(var1, var2)).start();
   }

   private final void c(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      Function1 var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10003 = 27334;
      short var10004 = 22483;
      String var10005 = var1.a().b();
      short var10006 = 27378;
      short var10007 = 20472;
      String var2 = "'" + var10005 + "' will be removed from your local downloads. You can re-download it from Browse later.";
      short var3 = 27383;
      var10006 = -25190;
      var10006 = 27377;
      var10007 = 29321;
      var10000.invoke(
         new IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll(
            "Delete download?",
            var2,
            "Delete",
            "Cancel",
            true,
            () -> f(this, var1),
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         )
      );
   }

   private final void d(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      boolean var3 = llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e(var1.a().a());
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      if (var3) {
         Iterable var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var5 = false;
         var var7 = new ArrayList();
         boolean var8 = false;

         label30: {
            for (Object var10 : var4) {
               llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = (llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10;
               boolean var12 = false;
               if (var2 == null) {
                  break label30;
               }

               boolean var14 = Intrinsics.areEqual(var11.a().a(), var1.a().a());
               if (var2 != null) {
                  if (var14) {
                     continue;
                  }

                  var7.add(var10);
               }

               if (var2 == null) {
                  break;
               }
            }

            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var7;
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var15 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            short var10002 = 27380;
            short var10003 = -15684;
            String var17 = var1.a().b();
            short var10004 = 27332;
            short var10005 = 5378;
            var15.b(
               2500L,
               "Downloads",
               "Deleted " + var17,
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 != null) {
            return;
         }
      }

      short var16 = 27380;
      short var18 = -15684;
      var18 = 27336;
      short var20 = 11304;
      me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            3000L,
            "Downloads",
            "Delete failed",
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
   }

   private final void e(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var10000 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10002 = 27380;
      short var10003 = -15684;
      String var8 = var1.a().b();
      short var10004 = 27361;
      short var10005 = 29100;
      var10000.b(
         1500L,
         "Downloads",
         "Checking " + var8 + "…",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      short var5 = 27347;
      String var10001 = var1.a().a();
      long var2 = var1.c();
      String var4 = var10001;
      short var6 = 419;
      var10002 = 27343;
      var10003 = 24369;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
         "[Routes/Downloads] checking update for id=" + var4 + " localVersion=" + var2
      );
      new Thread(() -> a(var1, this)).start();
   }

   private final void a(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var2
   ) {
      Function1 var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10003 = 27389;
      short var10004 = -22966;
      String var3 = var1.a().b();
      short var10005 = 27337;
      short var10006 = -7795;
      var10006 = 27367;
      short var10007 = -29371;
      String var4 = "A newer version of '" + var3 + "' is up. Replace your local copy?";
      var10005 = 27329;
      var10006 = -6512;
      var10006 = 27381;
      var10007 = 24767;
      var10000.invoke(
         new IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll(
            "Update available",
            var4,
            "Update",
            "Cancel",
            false,
            () -> a(this, var1, var2),
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         )
      );
   }

   private final void b(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var2
   ) {
      me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var10000 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10002 = 27380;
      short var10003 = -15684;
      String var5 = var2.b();
      short var10004 = 27351;
      short var10005 = -1190;
      var10000.b(
         1500L,
         "Downloads",
         "Updating " + var5 + "…",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      String var3 = var2.a();
      short var10001 = 27330;
      var10002 = 12568;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
         "[Routes/Downloads] downloading update for id=" + var3
      );
      new Thread(() -> a(var2, this, var1)).start();
   }

   private final void f(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      Function1 var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var10003 = 27348;
      short var10004 = -7622;
      String var10005 = var1.a().b();
      short var10006 = 27353;
      short var10007 = 5524;
      String var2 = "'" + var10005 + "' was deleted by the uploader. Delete your local copy, or keep it as-is?";
      short var3 = 27374;
      var10006 = -22115;
      var10006 = 27350;
      var10007 = -21677;
      var10000.invoke(
         new IllIIlIIlIlIIllIIIlIIIIlIIllIIIlllllIIlllIIIllIIlllIlllIIIIlIIlllIlIllIIIIllIIlllIlll(
            "Route no longer exists",
            var2,
            "Delete",
            "Keep",
            true,
            () -> g(this, var1),
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         )
      );
   }

   public final void a(int var1, int var2, int var3) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var4 != null) {
         if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var1, var2, var3);
         }
      }
   }

   public final void a(int var1, int var2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var3 != null) {
         if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.a(var1, var2);
         }
      }
   }

   public final void b() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var1 != null) {
         if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.b();
         }
      }
   }

   public final void b(int var1, int var2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var3 != null) {
         if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.b(var1, var2);
         }
      }
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(final Function0<Unit> var1) {
      return new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
         @Override
         public void d() {
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
         }

         @Override
         public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
            return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
         }

         @Override
         public void e() {
            var1.invoke();
         }

         @Override
         public void a(char var1x, int var2) {
         }
      };
   }

   private static final Unit a(
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var0,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      var0.e(var1);
      return Unit.INSTANCE;
   }

   private static final Unit b(
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var0,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      var0.c(var1);
      return Unit.INSTANCE;
   }

   private static final Unit c(
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var0,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      var0.a(var1);
      return Unit.INSTANCE;
   }

   private static final void d(
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var0,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      var0.b(var1);
   }

   private static final Unit e(
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var0,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      Minecraft.getInstance().execute(() -> d(var0, var1));
      return Unit.INSTANCE;
   }

   private static final Unit a(
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var0,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      int var2
   ) {
      var0.a(var1, var2);
      return Unit.INSTANCE;
   }

   private static final void a(lllIIllIIlIIlllllIIlIIIIlIIlIIIllllIIIIlIllllIIIIllllllIlIlIlIIIlIlIllllIIlIIIllIllIl var0, int var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var0.a()) {
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var10000 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10002 = 27391;
         short var10003 = 17595;
         short var10004 = 27352;
         short var10005 = -5706;
         String var3 = "%.1f";
         Object[] var4 = new Object[]{var0.d()};
         String var7 = String.format(var3, Arrays.copyOf(var4, var4.length));
         short var10006 = 27375;
         short var10007 = -20741;
         Intrinsics.checkNotNullExpressionValue(var7, "format(...)");
         var10005 = 27354;
         var10006 = 29485;
         var10006 = 27333;
         var10007 = 12112;
         var10000.b(
            2500L,
            "Routes",
            "Rated " + var1 + "★ · avg " + var7,
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
         if (var2 != null) {
            return;
         }
      }

      short var5 = 27391;
      short var6 = 17595;
      me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            3000L,
            "Routes",
            var0.b(),
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
   }

   private static final void b(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0,
      int var1
   ) {
      lllIIllIIlIIlllllIIlIIIIlIIlIIIllllIIIIlIllllIIIIllllllIlIlIlIIIlIlIllllIIlIIIllIllIl var2 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var0.a().a(), var1);
      Minecraft.getInstance().execute(() -> a(var2, var1));
   }

   private static final Unit f(
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var0,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      var0.d(var1);
      return Unit.INSTANCE;
   }

   private static final void a(
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var0,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var2
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var10000 = var0;
      if (var3 != null) {
         if (var0 == null) {
            String var14 = var1.a().a();
            short var16 = 27331;
            short var18 = 19078;
            var18 = 27328;
            short var22 = -13723;
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
               "[Routes/Downloads] id=" + var14 + " — not found upstream, prompting delete"
            );
            var2.f(var1);
            return;
         }

         var10000 = var0;
      }

      Long var11 = var10000.i();
      long var4 = var11 != null ? var11 : 0L;
      short var12 = 27382;
      String var10001 = var1.a().a();
      long var6 = var1.c();
      String var10 = var10001;
      short var15 = -20289;
      short var10002 = 27357;
      short var10003 = -31567;
      short var10004 = 27366;
      short var10005 = -23012;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.e(
         "[Routes/Downloads] id=" + var10 + " remoteVersion=" + var4 + " localVersion=" + var6
      );
      if (var3 != null) {
         if (var4 <= var1.c()) {
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var13 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            var10002 = 27380;
            var10003 = -15684;
            String var21 = var1.a().b();
            var10004 = 27339;
            var10005 = -8787;
            var13.b(
               2500L,
               "Downloads",
               var21 + " is up to date",
               me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
            return;
         }

         var2.a(var1, var0);
      }
   }

   private static final void a(
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0,
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var1
   ) {
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var2 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var0.a().a());
      Minecraft.getInstance().execute(() -> a(var2, var0, var1));
   }

   private static final Unit a(
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var0,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var2
   ) {
      var0.b(var1, var2);
      return Unit.INSTANCE;
   }

   private static final void a(
      lIIIllllllllIIIlIIIIllIIIIlllllIlIIIllIIIIlIIIlIIIllIIlllIlIllIlllIIIlIllllIIllIlIlII var0,
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var1,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2
   ) {
      Object var19 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      short var10000 = ((short)((var0.b()) ? 1 : 0));
      if (var3 != null) {
         if ((var10000 != 0)) {
            var1.f(var2);
            return;
         }

         var10000 = ((short)((var0.a()) ? 1 : 0));
      }

      if (var3 != null) {
         label74: {
            if ((var10000 != 0)) {
               var19 = var0;
               if (var3 == null) {
                  break label74;
               }

               if (var0.e() != null) {
                  var19 = var0;
                  if (var3 == null) {
                     break label74;
                  }

                  if (var0.d() != null) {
                     label64: {
                        llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .a(var0.d(), var0.e());
                        if (var4 != null) {
                           Iterable var5 = var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                           boolean var6 = false;
                           var var8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, 10));
                           boolean var9 = false;

                           label60: {
                              for (Object var11 : var5) {
                                 llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12 = (llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var11;
                                 boolean var13 = false;
                                 if (var3 == null) {
                                    break label60;
                                 }

                                 llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var20 = var12;
                                 if (var3 != null) {
                                    var20 = Intrinsics.areEqual(var12.a().a(), var0.d().a()) ? var4 : var12;
                                 }

                                 var8.add(var20);
                                 if (var3 == null) {
                                    break;
                                 }
                              }

                              var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var8;
                           }

                           if (var3 != null) {
                              break label64;
                           }
                        }

                        String var21 = var0.d().a();
                        short var10001 = 27388;
                        short var10002 = 28022;
                        var10002 = 27340;
                        short var10003 = -29135;
                        me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(
                           "[Routes/Downloads] save returned null for id=" + var21 + " — type unrecognised"
                        );
                     }

                     me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var22 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                     short var28 = 27380;
                     short var31 = -15684;
                     String var32 = var0.d().b();
                     short var10004 = 27341;
                     short var10005 = -22368;
                     var22.b(
                        2500L,
                        "Downloads",
                        "Updated " + var32,
                        me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     );
                     return;
                  }
               }
            }

            var19 = var0;
         }

         var10000 = ((me.octo.client.PXDyn)var19).a();
      }

      short var25 = ((short)((var0.e() != null) ? 1 : 0));
      String var16 = var0.c();
      boolean var17 = (var25 != 0);
      boolean var18 = (var10000 != 0);
      var10000 = 27386;
      var25 = -1637;
      short var29 = 27355;
      short var33 = -13156;
      short var37 = 27384;
      short var39 = 26012;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.c(
         "[Routes/Downloads] update failed: success=" + var18 + " hasPayload=" + var17 + " msg=" + var16
      );
      if (var3 != null) {
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var24 = me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var29 = 27338;
         var33 = -25634;
         String var35 = var0.c();
         if (var35 == null) {
            var33 = 27385;
            var37 = 13721;
            var35 = "Update failed";
         }

         var24.b(
            3500L,
            "Downloads",
            var35,
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
      }
   }

   private static final void a(
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var0,
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var1,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2
   ) {
      lIIIllllllllIIIlIIIIllIIIIlllllIlIIIllIIIIlIIIlIIIllIIlllIlIllIlllIIIlIllllIIllIlIlII var3 = IIllIIIllllllIIllIIIlIllIllIIlIIlIlllIlllIIIIllIIlIIIIllIlIllIIlllIllllIllIIlllIlIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d(var0.a());
      Minecraft.getInstance().execute(() -> a(var3, var1, var2));
   }

   private static final Unit g(
      lIIlIllllIIlIlIlIlllIIlIIIllIIIIlIIllIIIlIIlIllIIIlllIlIlllIlIlllIIllIllIIlIIIllllIll var0,
      llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      var0.d(var1);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[58];
      int var3 = 0;
      String var2 = "tbåÞ\u00117¤?\u0099\u0004ä0+2Í¼\u009c\f\u001a´\u008f\u0080\u000f\u009a\t\u0089Ý\u00831wåÃ\u0002Â~8\u008aÜ\u000bPVÆÜ2A6µ¡ì&*\u008c\u009dÀA$3³\u000f\u0007\u0085Ä(åjeZ\u001a\u0091r3ÉA\u0090÷\u009eÖTgé\u008f\u0010ÜßÙn jnW»\u0019p\u009d~ù¹_a[ÎB?}+¹\u009b½\u0087>Å\u000b®\u0083\u0013R`ZGè\u0007Ù%\u001dË^t.\u0015^\u001aVÏ\b\u001d\u0099\u0019è¾\u0091\u0015×:a\u009c¶\u0005ñJèyIuå¸B\u009d¼:¢\u008bB\u008fÞI\u0084\u0097ycd÷6F[D©m®6m[!©À\u00ad¢nÎ[þ\u008eN7/\u0081\u0086|\u001f\u0011Ko\u0081N&7N\u0012@wØ÷)Ì¯\u0092ECÑ\u0096°\u0016\u0011Ö¿¡x&ºuZ°\u008d¨\u009cÁ\u0090_»:æ\u008bþå*á\u001c\u0093cµ\u001a-_r¾x\n2\u009f<\u009bIK%4ú\u0016×\u0090\u0011KÉø=Åè*°¥Þá\u001e\u0014ìæ\u0015·\u0004À¼¯£\u0006úßÂ\u0080×Q\u0007\u000fÖp¡ù~\u0090Ł\u007f\u0088t\u0098»Ã2O²\u0081&LÑ¨Kmë\u009f\u0019\u0091wÎd-\u0011Àj\u001aá_Ì+n\u0085\u0003\u0089\u001aÈ\u0003Ï)\u0002Ê\u009eÆË¾VþÛ¨\u0098å\u008b-1âH9Ãû#Í\u0082\"ð¦ºK¢¸d\u0006üÁ×íG\u0098P±òáY\u0096Ê·\u0083 \u0093³iwü£\u0006Ã¢Þ2\"\u0082\u0099' Ö\u008fz\u0013ëý\u0088n:ÜE\u008b©Å\u0081Ú¹Wî+\u0086sá\u001fg¾ý®A_Üb®\u0080ß¾¡5B\u001a¿Þ,ÖÌ\u001c¿§ÕÞó\u0014[æ÷¯\u0000ûç¦©\b\u0010ü\u009fX\u009e..Îg\u0097Å\u0014\u008dN§7~\u0012Z'Wäë\u009f²ñFuc\u001fõÿ\u0003\u001eoî¼\u0015B;-¨³Éèþ\u0015ê\u008a_\u009eø{R\u0087éæÃV\u008cC¤¸Ò7Þ3\u008cV@\u0012%\u0099\u009eÞ8 ;«Îès(\u0088\u0013íèJ\u0094^Jà9LÅ¤/:*¤\t\u0092ø\u0007Ã¨\u0085_fv\u0086\u0080\rnðí\u0015\u0086ë\u001f\u0093¤Ë>L!\u009fØyí¦\u0088\bYùw]L\u008btß,µ¬P Æ\u001e)\u0085iG\u009a¡\u0006?Ê]ß°õ\u000f\u0012Oó5éÚÈ\r;¿P\u0093°JS\u001eAJ;x\u0013\u0014Iû)ÄrHÊu¨\n#gåo\u008dçÄBP1æ \u0005\u0006\f\u009dw\u0006uì\u001a¬\u0098\"c/-\u0006\u0097¼n2bgH¾j\u0093\u0085©\u0015^\u0019Á\u007f rRµ:e¹\u0003J7\u001e \u0019S¿ÛÙA[A\u0087\n\u0080)®J÷cÃ\u0016\u0093 sÚÕTh!r\\\u008b\u0004\u0007ã^¨g9Kë;\f\u009clM\u0019¿E_Îê,\u0004û\u0097?òð°ö\u008dW\u0084&\u0086:Z¯\u0091\t\u0080«\u0017¶ÏhC3\b#Ú>\u0090ðÞ\b1ÛVæ\u00ad\u0086§g¼4Æté\u008fºÖþ\u0005S\u0088í¬Þööó\u0003<õ\u009c\u0019ù)\u001cÎj*\u0014\u0091áGÎ\u0087\u0010í\u001c,W\u0082@±mì{~ÃÔ\u000bZl½\u0002\rþeCø2ÓP\u0084\u0080d\u0099¹ÿ!\u0001²\u0084\u000f³Òâ\u00997a¸VÈ4ÓØM©3©O\u0089î\u0084A\u0098CÓ\u0088ÒfÚ ÇÔ\u0014L?\u0083úd\u0019\u0096¾\u0019º\u008f¦`ñµM'¡\"õ\u0085=Øp\r\u001f¥\\,@M§X\u0000-\u007f±h¬\u001c\u0094?\u0084M:A\u0099yÁAU\u009c\u0018\u0084&êBàB\u0001\\f\u0098Hå^¿,br\u001fê¯z\u0006\u001b±¶\u009e\u009b;Ðqä¤h\u001d8s\u001e\\ñ\u00015\u0090·k\bç\u0010\u008eA\u0081\t\u0094EZÿ\u008e\u0090°Ö\u0012H^õ\b☯y\u0007¦ñN\u0006«\b0VVën\u0019A0\u0016}b\u0000¬Çãc`»YAö\u0015\u0000ØhÕ5¶ñ\u0084½-Øº´·Q\u0080±\fáÔ\nG|6õ®pí\u0002ç\u0019\u0099A6iw\u0003Ø\u001c¶ð¥{Ãb\u001eêé\u007fGÿXPÅ\u0083\u0006¹d\\\u001e&#'P\u209dþÆ¥Ç\u0004\u009eEüÉ\u0011r\u00adà\u0093æ\u0090r\u0087økqDõ¨'õª'1J\u0094nÁ³\u001a\u0013b\u000e\u008fOJæ\u009bwz\u0090/X=HE¤\u000e·Ly¬D2\tî\u008c¦¹æ:\f\bÆ¹³¥ÛT÷\u0099\u0014\u0004\u20c1tWâ¨}±\u009d\u008c\u0097fex>mÕðª¯\u000e2\u0019áÊeÅEHm#Æ\u0010\u008c8\t+\u009f.\u0092\u0001V²Öæ\u0014=ZP\u0087ï\u0094\u0004\u0081D\u0081Ï»d\u0017\\Î·\u0016e\u0087\rV)\u009a\u0004÷ä6É\r\n\rQì\u0006\u001ep\u0093/Ö\u0081\u0016v<agë\u009aæO\u000b¼WJ×\u0097\u0080\u009aÞk×:¨Ä\u0006{tÚ-¬\u000e\t SO\u000b-e7°V\u000e\u000böÜï\u0090\u009d½\u0017¬Wü\u0011\u008f\u0019VC¯,5AFû±°È i\u009d\u0099ÿZÓ/Å{oÄÁÑþ(çìVX¸eE\t?\u0090ö\u000e¦<\u009csW&'û\u009e°cT§\u001b\u0014\u0083\u000bs6\u0007©\u0081ñ4¬\u009av\"\u0013\u00116fù\u0013mmÊ\u0000\u0000\u000br¬fá\u0091\u0006@©\u0006WH_ª\u001cþ\rç(A4#æËil±$\u0093o\u0006ýë\"\u0006Ë\u0081\n\u00106¢F¿ªá\u008cïo\u0010 \u008b\u007fãB\u009c\u0080ÁÌäÅ\u008cU\u0000qÅ-»ùØßÜ\u008d\u0000\u00ad×àÌÁ¤æî´\u0013®n\u0098\u009a\u0082õ8\u0088w\u0091@@3¡,ìËÞLâ¸VmÚ\u001dôm\u0017è¥A/¡Ðø\fá\u000bÔ»fÅF¿\u000bÚßáÅ\\ýPåÁ\u008bôgt6þ[¸1\u0005\u0091èêL¯µî\u0081´Aò\fÆü·Fá~æþÝX\u009c¢LØ¡\u009c\u0089ðR3g»®âÎû³e\u0000_\u0007U\u0090àd|Ú?¹ÎÑìö\u008b ûðö+\u0012s ´0\tÌo²òz}\u0089\u0089\u0015\u0013\u0088+ÞC¾\u009b\u0083\u0000»áÃ®bÝ\u0090²ï\u0006\u0098Ê\u0017û!\b\u0085ì,olX\u009d\u001b»(ºÈZõÿ\u0081ä\u0019k5Ç\f\u0010_U\u0007\u001fUð¢0\u009a\r9[\u0001\u0083û$\u001dPt^©@/\u0012ö\u008bÐ\u009fåaNï¾\\:\u0017¼\u0012\u001fh\\\u0013Ä}¿uÆ5Ò(Ã¤®¤\u0081ÎüÏasØç2?\u009c¡gBà ¿\u0002\t*ë\u0012Ò¢\u009d\"(XÒ^l\u0016°\u001clëCEdãÊ9ÈK¼\u0082ð\u0007'O5ád<\u0090,âÍ»ô\u0005¬\rá\nWÓG\u009a \u0006ÏóUnç\u0005Ú\u001eüé\u008e!õèäÇÉX\u007f\u0004?É+`\b\u0001y\u0086ðídVnË\u0013Âm\u008a\u0006.¸\u0000\u0098vc\u000eEÕ\u0013µ°\u001d\u001fÝ\u0083ñ¨}÷\u0002\fþB´ìÓæ_k\u0017·\u0098É3>6\u0090\u00adhâóS<\u001aìL\u009dÿ\bS\u0018 6\u0018\u0082\u0013\u0080ÿÒÊ\u00ad\u0000\u0006x\u008eXO\u0095>\u0019ëg¼B\u001aÑïÑFF\u0005=\u000f\u0018÷\u0016R\u000f½É+Wï¸;Ønw¨È'³Q³3 \u009d1\u0013=&\u001dB¸F®\u0082\u0010\u0083\u007fºi\u0000\u009fª\u0097û_\t\u0093!Ì¯\n[;²j\u0007¯ii\u0084\u0088{\u0080";
      int var4 = "tbåÞ\u00117¤?\u0099\u0004ä0+2Í¼\u009c\f\u001a´\u008f\u0080\u000f\u009a\t\u0089Ý\u00831wåÃ\u0002Â~8\u008aÜ\u000bPVÆÜ2A6µ¡ì&*\u008c\u009dÀA$3³\u000f\u0007\u0085Ä(åjeZ\u001a\u0091r3ÉA\u0090÷\u009eÖTgé\u008f\u0010ÜßÙn jnW»\u0019p\u009d~ù¹_a[ÎB?}+¹\u009b½\u0087>Å\u000b®\u0083\u0013R`ZGè\u0007Ù%\u001dË^t.\u0015^\u001aVÏ\b\u001d\u0099\u0019è¾\u0091\u0015×:a\u009c¶\u0005ñJèyIuå¸B\u009d¼:¢\u008bB\u008fÞI\u0084\u0097ycd÷6F[D©m®6m[!©À\u00ad¢nÎ[þ\u008eN7/\u0081\u0086|\u001f\u0011Ko\u0081N&7N\u0012@wØ÷)Ì¯\u0092ECÑ\u0096°\u0016\u0011Ö¿¡x&ºuZ°\u008d¨\u009cÁ\u0090_»:æ\u008bþå*á\u001c\u0093cµ\u001a-_r¾x\n2\u009f<\u009bIK%4ú\u0016×\u0090\u0011KÉø=Åè*°¥Þá\u001e\u0014ìæ\u0015·\u0004À¼¯£\u0006úßÂ\u0080×Q\u0007\u000fÖp¡ù~\u0090Ł\u007f\u0088t\u0098»Ã2O²\u0081&LÑ¨Kmë\u009f\u0019\u0091wÎd-\u0011Àj\u001aá_Ì+n\u0085\u0003\u0089\u001aÈ\u0003Ï)\u0002Ê\u009eÆË¾VþÛ¨\u0098å\u008b-1âH9Ãû#Í\u0082\"ð¦ºK¢¸d\u0006üÁ×íG\u0098P±òáY\u0096Ê·\u0083 \u0093³iwü£\u0006Ã¢Þ2\"\u0082\u0099' Ö\u008fz\u0013ëý\u0088n:ÜE\u008b©Å\u0081Ú¹Wî+\u0086sá\u001fg¾ý®A_Üb®\u0080ß¾¡5B\u001a¿Þ,ÖÌ\u001c¿§ÕÞó\u0014[æ÷¯\u0000ûç¦©\b\u0010ü\u009fX\u009e..Îg\u0097Å\u0014\u008dN§7~\u0012Z'Wäë\u009f²ñFuc\u001fõÿ\u0003\u001eoî¼\u0015B;-¨³Éèþ\u0015ê\u008a_\u009eø{R\u0087éæÃV\u008cC¤¸Ò7Þ3\u008cV@\u0012%\u0099\u009eÞ8 ;«Îès(\u0088\u0013íèJ\u0094^Jà9LÅ¤/:*¤\t\u0092ø\u0007Ã¨\u0085_fv\u0086\u0080\rnðí\u0015\u0086ë\u001f\u0093¤Ë>L!\u009fØyí¦\u0088\bYùw]L\u008btß,µ¬P Æ\u001e)\u0085iG\u009a¡\u0006?Ê]ß°õ\u000f\u0012Oó5éÚÈ\r;¿P\u0093°JS\u001eAJ;x\u0013\u0014Iû)ÄrHÊu¨\n#gåo\u008dçÄBP1æ \u0005\u0006\f\u009dw\u0006uì\u001a¬\u0098\"c/-\u0006\u0097¼n2bgH¾j\u0093\u0085©\u0015^\u0019Á\u007f rRµ:e¹\u0003J7\u001e \u0019S¿ÛÙA[A\u0087\n\u0080)®J÷cÃ\u0016\u0093 sÚÕTh!r\\\u008b\u0004\u0007ã^¨g9Kë;\f\u009clM\u0019¿E_Îê,\u0004û\u0097?òð°ö\u008dW\u0084&\u0086:Z¯\u0091\t\u0080«\u0017¶ÏhC3\b#Ú>\u0090ðÞ\b1ÛVæ\u00ad\u0086§g¼4Æté\u008fºÖþ\u0005S\u0088í¬Þööó\u0003<õ\u009c\u0019ù)\u001cÎj*\u0014\u0091áGÎ\u0087\u0010í\u001c,W\u0082@±mì{~ÃÔ\u000bZl½\u0002\rþeCø2ÓP\u0084\u0080d\u0099¹ÿ!\u0001²\u0084\u000f³Òâ\u00997a¸VÈ4ÓØM©3©O\u0089î\u0084A\u0098CÓ\u0088ÒfÚ ÇÔ\u0014L?\u0083úd\u0019\u0096¾\u0019º\u008f¦`ñµM'¡\"õ\u0085=Øp\r\u001f¥\\,@M§X\u0000-\u007f±h¬\u001c\u0094?\u0084M:A\u0099yÁAU\u009c\u0018\u0084&êBàB\u0001\\f\u0098Hå^¿,br\u001fê¯z\u0006\u001b±¶\u009e\u009b;Ðqä¤h\u001d8s\u001e\\ñ\u00015\u0090·k\bç\u0010\u008eA\u0081\t\u0094EZÿ\u008e\u0090°Ö\u0012H^õ\b☯y\u0007¦ñN\u0006«\b0VVën\u0019A0\u0016}b\u0000¬Çãc`»YAö\u0015\u0000ØhÕ5¶ñ\u0084½-Øº´·Q\u0080±\fáÔ\nG|6õ®pí\u0002ç\u0019\u0099A6iw\u0003Ø\u001c¶ð¥{Ãb\u001eêé\u007fGÿXPÅ\u0083\u0006¹d\\\u001e&#'P\u209dþÆ¥Ç\u0004\u009eEüÉ\u0011r\u00adà\u0093æ\u0090r\u0087økqDõ¨'õª'1J\u0094nÁ³\u001a\u0013b\u000e\u008fOJæ\u009bwz\u0090/X=HE¤\u000e·Ly¬D2\tî\u008c¦¹æ:\f\bÆ¹³¥ÛT÷\u0099\u0014\u0004\u20c1tWâ¨}±\u009d\u008c\u0097fex>mÕðª¯\u000e2\u0019áÊeÅEHm#Æ\u0010\u008c8\t+\u009f.\u0092\u0001V²Öæ\u0014=ZP\u0087ï\u0094\u0004\u0081D\u0081Ï»d\u0017\\Î·\u0016e\u0087\rV)\u009a\u0004÷ä6É\r\n\rQì\u0006\u001ep\u0093/Ö\u0081\u0016v<agë\u009aæO\u000b¼WJ×\u0097\u0080\u009aÞk×:¨Ä\u0006{tÚ-¬\u000e\t SO\u000b-e7°V\u000e\u000böÜï\u0090\u009d½\u0017¬Wü\u0011\u008f\u0019VC¯,5AFû±°È i\u009d\u0099ÿZÓ/Å{oÄÁÑþ(çìVX¸eE\t?\u0090ö\u000e¦<\u009csW&'û\u009e°cT§\u001b\u0014\u0083\u000bs6\u0007©\u0081ñ4¬\u009av\"\u0013\u00116fù\u0013mmÊ\u0000\u0000\u000br¬fá\u0091\u0006@©\u0006WH_ª\u001cþ\rç(A4#æËil±$\u0093o\u0006ýë\"\u0006Ë\u0081\n\u00106¢F¿ªá\u008cïo\u0010 \u008b\u007fãB\u009c\u0080ÁÌäÅ\u008cU\u0000qÅ-»ùØßÜ\u008d\u0000\u00ad×àÌÁ¤æî´\u0013®n\u0098\u009a\u0082õ8\u0088w\u0091@@3¡,ìËÞLâ¸VmÚ\u001dôm\u0017è¥A/¡Ðø\fá\u000bÔ»fÅF¿\u000bÚßáÅ\\ýPåÁ\u008bôgt6þ[¸1\u0005\u0091èêL¯µî\u0081´Aò\fÆü·Fá~æþÝX\u009c¢LØ¡\u009c\u0089ðR3g»®âÎû³e\u0000_\u0007U\u0090àd|Ú?¹ÎÑìö\u008b ûðö+\u0012s ´0\tÌo²òz}\u0089\u0089\u0015\u0013\u0088+ÞC¾\u009b\u0083\u0000»áÃ®bÝ\u0090²ï\u0006\u0098Ê\u0017û!\b\u0085ì,olX\u009d\u001b»(ºÈZõÿ\u0081ä\u0019k5Ç\f\u0010_U\u0007\u001fUð¢0\u009a\r9[\u0001\u0083û$\u001dPt^©@/\u0012ö\u008bÐ\u009fåaNï¾\\:\u0017¼\u0012\u001fh\\\u0013Ä}¿uÆ5Ò(Ã¤®¤\u0081ÎüÏasØç2?\u009c¡gBà ¿\u0002\t*ë\u0012Ò¢\u009d\"(XÒ^l\u0016°\u001clëCEdãÊ9ÈK¼\u0082ð\u0007'O5ád<\u0090,âÍ»ô\u0005¬\rá\nWÓG\u009a \u0006ÏóUnç\u0005Ú\u001eüé\u008e!õèäÇÉX\u007f\u0004?É+`\b\u0001y\u0086ðídVnË\u0013Âm\u008a\u0006.¸\u0000\u0098vc\u000eEÕ\u0013µ°\u001d\u001fÝ\u0083ñ¨}÷\u0002\fþB´ìÓæ_k\u0017·\u0098É3>6\u0090\u00adhâóS<\u001aìL\u009dÿ\bS\u0018 6\u0018\u0082\u0013\u0080ÿÒÊ\u00ad\u0000\u0006x\u008eXO\u0095>\u0019ëg¼B\u001aÑïÑFF\u0005=\u000f\u0018÷\u0016R\u000f½É+Wï¸;Ønw¨È'³Q³3 \u009d1\u0013=&\u001dB¸F®\u0082\u0010\u0083\u007fºi\u0000\u009fª\u0097û_\t\u0093!Ì¯\n[;²j\u0007¯ii\u0084\u0088{\u0080"
         .length();
      char var1 = '\t';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 112;
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
                     case 0 -> 39;
                     case 1 -> 117;
                     case 2 -> 106;
                     case 3 -> 93;
                     case 4 -> 2;
                     case 5 -> 29;
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
                     b = new String[58];
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

                  var2 = "ì\u0002hÿ¼^=8÷ïl\u0006\u0003dípÄ·";
                  var4 = "ì\u0002hÿ¼^=8÷ïl\u0006\u0003dípÄ·".length();
                  var1 = 11;
                  var8 = -1;
            }

            var10000 = 110;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ 27351) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 70;
            case 1 -> 227;
            case 2 -> 122;
            case 3 -> 196;
            case 4 -> 251;
            case 5 -> 136;
            case 6 -> 232;
            case 7 -> 62;
            case 8 -> 75;
            case 9 -> 193;
            case 10 -> 157;
            case 11 -> 19;
            case 12 -> 181;
            case 13 -> 219;
            case 14 -> 65;
            case 15 -> 61;
            case 16 -> 78;
            case 17 -> 63;
            case 18 -> 234;
            case 19 -> 236;
            case 20 -> 197;
            case 21 -> 7;
            case 22 -> 201;
            case 23 -> 164;
            case 24 -> 171;
            case 25 -> 119;
            case 26 -> 42;
            case 27 -> 203;
            case 28 -> 174;
            case 29 -> 241;
            case 30 -> 121;
            case 31 -> 11;
            case 32 -> 35;
            case 33 -> 69;
            case 34 -> 50;
            case 35 -> 228;
            case 36 -> 142;
            case 37 -> 18;
            case 38 -> 47;
            case 39 -> 199;
            case 40 -> 135;
            case 41 -> 108;
            case 42 -> 21;
            case 43 -> 48;
            case 44 -> 80;
            case 45 -> 175;
            case 46 -> 111;
            case 47 -> 106;
            case 48 -> 246;
            case 49 -> 206;
            case 50 -> 34;
            case 51 -> 44;
            case 52 -> 3;
            case 53 -> 131;
            case 54 -> 169;
            case 55 -> 184;
            case 56 -> 172;
            case 57 -> 30;
            case 58 -> 92;
            case 59 -> 129;
            case 60 -> 250;
            case 61 -> 112;
            case 62 -> 72;
            case 63 -> 147;
            case 64 -> 79;
            case 65 -> 41;
            case 66 -> 103;
            case 67 -> 88;
            case 68 -> 233;
            case 69 -> 76;
            case 70 -> 38;
            case 71 -> 247;
            case 72 -> 253;
            case 73 -> 141;
            case 74 -> 143;
            case 75 -> 2;
            case 76 -> 96;
            case 77 -> 110;
            case 78 -> 27;
            case 79 -> 214;
            case 80 -> 109;
            case 81 -> 84;
            case 82 -> 25;
            case 83 -> 190;
            case 84 -> 55;
            case 85 -> 207;
            case 86 -> 189;
            case 87 -> 71;
            case 88 -> 14;
            case 89 -> 208;
            case 90 -> 138;
            case 91 -> 248;
            case 92 -> 237;
            case 93 -> 152;
            case 94 -> 83;
            case 95 -> 33;
            case 96 -> 117;
            case 97 -> 102;
            case 98 -> 204;
            case 99 -> 113;
            case 100 -> 10;
            case 101 -> 104;
            case 102 -> 224;
            case 103 -> 223;
            case 104 -> 0;
            case 105 -> 17;
            case 106 -> 98;
            case 107 -> 188;
            case 108 -> 216;
            case 109 -> 245;
            case 110 -> 39;
            case 111 -> 125;
            case 112 -> 145;
            case 113 -> 53;
            case 114 -> 215;
            case 115 -> 99;
            case 116 -> 165;
            case 117 -> 40;
            case 118 -> 218;
            case 119 -> 137;
            case 120 -> 211;
            case 121 -> 173;
            case 122 -> 4;
            case 123 -> 255;
            case 124 -> 166;
            case 125 -> 66;
            case 126 -> 22;
            case 127 -> 26;
            case 128 -> 15;
            case 129 -> 212;
            case 130 -> 31;
            case 131 -> 6;
            case 132 -> 93;
            case 133 -> 114;
            case 134 -> 221;
            case 135 -> 97;
            case 136 -> 128;
            case 137 -> 123;
            case 138 -> 222;
            case 139 -> 73;
            case 140 -> 249;
            case 141 -> 239;
            case 142 -> 87;
            case 143 -> 68;
            case 144 -> 154;
            case 145 -> 220;
            case 146 -> 60;
            case 147 -> 140;
            case 148 -> 126;
            case 149 -> 59;
            case 150 -> 5;
            case 151 -> 94;
            case 152 -> 134;
            case 153 -> 107;
            case 154 -> 95;
            case 155 -> 118;
            case 156 -> 167;
            case 157 -> 225;
            case 158 -> 205;
            case 159 -> 148;
            case 160 -> 32;
            case 161 -> 67;
            case 162 -> 192;
            case 163 -> 151;
            case 164 -> 150;
            case 165 -> 56;
            case 166 -> 187;
            case 167 -> 226;
            case 168 -> 176;
            case 169 -> 161;
            case 170 -> 195;
            case 171 -> 170;
            case 172 -> 45;
            case 173 -> 9;
            case 174 -> 235;
            case 175 -> 12;
            case 176 -> 179;
            case 177 -> 90;
            case 178 -> 13;
            case 179 -> 91;
            case 180 -> 23;
            case 181 -> 183;
            case 182 -> 182;
            case 183 -> 36;
            case 184 -> 185;
            case 185 -> 8;
            case 186 -> 49;
            case 187 -> 242;
            case 188 -> 180;
            case 189 -> 132;
            case 190 -> 51;
            case 191 -> 20;
            case 192 -> 155;
            case 193 -> 229;
            case 194 -> 74;
            case 195 -> 162;
            case 196 -> 37;
            case 197 -> 202;
            case 198 -> 177;
            case 199 -> 127;
            case 200 -> 115;
            case 201 -> 133;
            case 202 -> 178;
            case 203 -> 29;
            case 204 -> 52;
            case 205 -> 230;
            case 206 -> 254;
            case 207 -> 156;
            case 208 -> 85;
            case 209 -> 130;
            case 210 -> 139;
            case 211 -> 160;
            case 212 -> 46;
            case 213 -> 210;
            case 214 -> 81;
            case 215 -> 238;
            case 216 -> 57;
            case 217 -> 54;
            case 218 -> 252;
            case 219 -> 194;
            case 220 -> 153;
            case 221 -> 86;
            case 222 -> 159;
            case 223 -> 1;
            case 224 -> 200;
            case 225 -> 149;
            case 226 -> 186;
            case 227 -> 244;
            case 228 -> 58;
            case 229 -> 77;
            case 230 -> 105;
            case 231 -> 217;
            case 232 -> 101;
            case 233 -> 198;
            case 234 -> 231;
            case 235 -> 28;
            case 236 -> 191;
            case 237 -> 16;
            case 238 -> 213;
            case 239 -> 82;
            case 240 -> 209;
            case 241 -> 163;
            case 242 -> 24;
            case 243 -> 43;
            case 244 -> 144;
            case 245 -> 89;
            case 246 -> 243;
            case 247 -> 168;
            case 248 -> 100;
            case 249 -> 116;
            case 250 -> 64;
            case 251 -> 120;
            case 252 -> 124;
            case 253 -> 158;
            case 254 -> 146;
            default -> 240;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
      @Override
      public void d() {
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
      }

      @Override
      public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
         return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
      }

      @Override
      public void e() {
      }

      @Override
      public void a(char var1, int var2x) {
      }
   }
}
