package me.octo.client;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI {
   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final Function2<IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI, llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII, Unit> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final Function0<Unit> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final Lazy IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] a;
   private static String[] b;

   public IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull Function2<? super IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI, ? super llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII, Unit> var3,
      @NotNull Function0<Unit> var4
   ) {
      short var10001 = -24440;
      short var10002 = 3345;
      Intrinsics.checkNotNullParameter(var1, "title");
      var10001 = -24439;
      var10002 = 21730;
      Intrinsics.checkNotNullParameter(var2, "subtitle");
      var10001 = -24434;
      var10002 = -19951;
      Intrinsics.checkNotNullParameter(var3, "onPick");
      var10001 = -24438;
      var10002 = -20097;
      Intrinsics.checkNotNullParameter(var4, "onClose");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = ((Function2<IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI,llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII,Unit>)(Object)(var3));
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = LazyKt.lazy(
         IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI::f
      );
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
   }

   @NotNull
   public final String a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final String b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final Function2<IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI, llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII, Unit> c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final Function0<Unit> d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   private final List<IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> e() {
      Lazy var1 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      return (List<IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)var1.getValue();
   }

   @NotNull
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, float var4, int var5, int var6, float var7
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8;
      float var9;
      float var10;
      float var11;
      float var12;
      float var18;
      float var19;
      float var20;
      float var21;
      float var22;
      float var23;
      int var44;
      label157: {
         label160: {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1,
               var2,
               var3,
               var4,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e()
                  .a(0.75F * var7),
               0.0F
            );
            var9 = 620.0F;
            var10 = 82.0F;
            var11 = 10.0F;
            var12 = 22.0F;
            float var13 = 98.0F;
            int var14 = RangesKt.coerceAtLeast((this.e().size() + 1) / 2, 1);
            float var15 = var14 * var10 + RangesKt.coerceAtLeast(var14 - 1, 0) * var11;
            float var16 = var13 + var15;
            float var17 = RangesKt.coerceAtLeast(var4 - 40.0F, 360.0F);
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            var18 = RangesKt.coerceIn(var16, 360.0F, var17);
            var8 = var10000;
            var19 = var1 + (var3 - var9) / 2.0F;
            var20 = var2 + (var4 - var18) / 2.0F - 10.0F;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var19,
               var20,
               var9,
               var18,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e(),
               14.0F
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var19,
               var20,
               var9,
               var18,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.6F),
               14.0F
            );
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.b(
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var19 + var12,
               var20 + 18.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               true
            );
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.b(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var19 + var12,
               var20 + 38.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(),
               true
            );
            var21 = 24.0F;
            var22 = var19 + var9 - var12 - var21;
            var23 = var20 + 16.0F;
            float var51;
            var44 = (var51 = var5 - var22) == 0.0F ? 0 : (var51 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var44 < 0) {
                  break label160;
               }

               float var52;
               var44 = (var52 = var5 - (var22 + var21)) == 0.0F ? 0 : (var52 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var44 > 0) {
                  break label160;
               }

               float var53;
               var44 = (var53 = var6 - var23) == 0.0F ? 0 : (var53 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var44 < 0) {
                  break label160;
               }

               float var54;
               var44 = (var54 = var6 - (var23 + var21)) == 0.0F ? 0 : (var54 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label157;
            }

            if (var44 <= 0) {
               var44 = 1;
               break label157;
            }
         }

         var44 = 0;
      }

      int var24 = var44;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var22,
         var23,
         var21,
         var21,
         var24 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j(),
         6.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var22,
         var23,
         var21,
         var21,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.5F),
         6.0F
      );
      short var10001 = -24433;
      short var10002 = 14174;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
            var22 + 6.0F,
            var23 + 6.0F,
            12.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            1.0F
         );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var19 + var12,
         var20 + 66.0F,
         var9 - var12 * 2.0F,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.4F),
         0.5F
      );
      float var25 = var19 + var12;
      float var26 = var20 + 76.0F;
      float var27 = var9 - var12 * 2.0F;
      float var28 = var18 - 76.0F - var12;
      int var45 = ((this.e().isEmpty()) ? 1 : 0);
      if (var8 != null) {
         if (var45 != 0) {
            var10001 = -24437;
            var10002 = 26627;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               .a(
                  "No editable macros",
                  var25 + var27 / 2.0F,
                  var26 + var28 / 2.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
               );
            return var24 != 0
               ? this.a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI)
               : this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         }

         var45 = 2;
      }

      byte var29 = (byte)var45;
      float var30 = (var27 - var11) / var29;
      int var31 = (this.e().size() + var29 - 1) / var29;
      float var32 = var31 * var10 + RangesKt.coerceAtLeast(var31 - 1, 0) * var11;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = RangesKt.coerceAtLeast(var32 - var28, 0.0F);
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = RangesKt.coerceIn(
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
         0.0F,
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var25, var26, var27, var28);
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var33 = null;
      Iterator var34 = this.e().iterator();
      int var35 = 0;

      label135:
      while (true) {
         var45 = ((var34.hasNext()) ? 1 : 0);

         while (var45 != 0) {
            int var36 = var35++;
            IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var37 = (IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var34.next();
            int var38 = var36 % var29;
            int var39 = var36 / var29;
            float var40 = var25 + var38 * (var30 + var11);
            float var41 = var26 - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI + var39 * (var10 + var11);
            float var55;
            var45 = (var55 = var41 + var10 - var26) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1);
            if (var8 == null) {
               break label135;
            }

            if (var8 != null) {
               if (var45 < 0) {
                  continue label135;
               }

               float var56;
               var45 = (var56 = var41 - (var26 + var28)) == 0.0F ? 0 : (var56 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var45 > 0) {
                  continue label135;
               }

               float var57;
               var45 = (var57 = var5 - var40) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1);
            }

            label126: {
               label163: {
                  if (var8 != null) {
                     if (var45 < 0) {
                        break label163;
                     }

                     float var58;
                     var45 = (var58 = var5 - (var40 + var30)) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
                  }

                  if (var8 != null) {
                     if (var45 > 0) {
                        break label163;
                     }

                     float var59;
                     var45 = (var59 = var6 - var41) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1);
                  }

                  if (var8 != null) {
                     if (var45 < 0) {
                        break label163;
                     }

                     float var60;
                     var45 = (var60 = var6 - (var41 + var10)) == 0.0F ? 0 : (var60 < 0.0F ? -1 : 1);
                  }

                  if (var8 != null) {
                     if (var45 > 0) {
                        break label163;
                     }

                     float var61;
                     var45 = (var61 = var6 - var26) == 0.0F ? 0 : (var61 < 0.0F ? -1 : 1);
                  }

                  if (var8 != null) {
                     if (var45 < 0) {
                        break label163;
                     }

                     float var62;
                     var45 = (var62 = var6 - (var26 + var28)) == 0.0F ? 0 : (var62 < 0.0F ? -1 : 1);
                  }

                  if (var8 == null) {
                     break label126;
                  }

                  if (var45 <= 0) {
                     var45 = 1;
                     break label126;
                  }
               }

               var45 = 0;
            }

            int var42 = var45;
            this.a(var40, var41, var30, var10, var37, var42 != 0);
            var45 = var42;
            if (var8 != null) {
               if (var42 == 0 || var33 != null) {
                  continue label135;
               }

               var33 = this.a(null);
               if (var8 != null) {
                  continue label135;
               }
               break;
            }
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i();
         var45 = var24;
         break;
      }

      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var48;
      if (var45 != 0) {
         var48 = this.a(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      } else {
         var48 = var33;
         if (var33 == null) {
            var48 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         }
      }

      return var48;
   }

   private final void a(
      float var1,
      float var2,
      float var3,
      float var4,
      IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5,
      boolean var6
   ) { float var12 = 0.0f; // PX-FIX hoist
        
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var10001 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10002 = var5.a().aj();
      String var10003 = var5.b().a();
      short var10004 = -24435;
      short var10005 = -7835;
      float var8 = var10001.a("macropick:" + var10002 + ":" + var10003, var6, 14.0F);
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var7 = var10000;
      float var22;
      int var17 = (var22 = var8 - 0.01F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
      if (var7 != null) {
         if (var17 > 0) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
               var1,
               var2,
               var3,
               var4,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ar(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var8 * 0.5F,
               5.0F,
               3
            );
         }

         var17 =(( var6) ? 1 : 0);
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = var17 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
            .b(3.0F, 3.0F, 3.0F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10 = !var6
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .z()
            .a(0.7F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.35F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         var9,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         var10,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar()
      );
      float var11 = 52.0F;
       var12 = var1 + 10.0F;
      float var13 = var2 + (var4 - var11) / 2.0F;
      IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c(var5.b().d());
      me.octo.client.utils.IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var14.b(), var14.a(), var12, var13, var11, !var6 ? 1.0F : 0.92F, true);
      float var15 = var12 + var11 + 14.0F;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.b(
         var5.a().aj(),
         var15,
         var2 + 16.0F,
         !var6
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .a(0.92F),
         true
      );
      int var16 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .d(var5.a())
         .size();
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var18 = me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      var10002 = var5.b().a();
      short var20 = -24436;
      var10004 = 28439;
      var18.b(
         var16 + " routes · " + var10002,
         var15,
         var2 + 36.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         true
      );
   }

   public final boolean a(char var1, int var2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      int var10000 = var2;
      if (var3 != null) {
         if (var2 == 256) {
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.invoke();
            return true;
         }

         var10000 = 1;
      }

      return var10000 != 0;
   }

   public final void a(int var1) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = RangesKt.coerceIn(
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI - var1 * 0.5F,
         0.0F,
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
      );
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(final Function0<Unit> var1) {
      return new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
         @Override
         public void e() {
            var1.invoke();
         }

         @Override
         public void a(char var1x, int var2) {
         }
      };
   }

   private static final List f() {
       List var12 = null; // PX-FIX decl var12
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      IdentityHashMap var1 = new IdentityHashMap();
      List var2 = new ArrayList();
      Iterator var3 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII
         .iterator();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0 = var10000;

      while (true) {
         if (var3.hasNext()) {
            llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var4 = (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII)var3.next();
            var12 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var0 == null) {
               break;
            }

            Iterable var6 = lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            boolean var7 = false;
            Iterator var8 = var6.iterator();

            label46:
            while (true) {
               if (!var8.hasNext()) {
                  var10000 = null;
                  break;
               }

               Object var9 = var8.next();
               var10000 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var9;

               while (true) {
                  IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var10 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)(Object)var10000;
                  boolean var11 = false;
                  if (llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var10)
                     != var4) {
                     break;
                  }

                  var10000 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var9;
                  if (var0 != null) {
                     break label46;
                  }
               }
            }

            IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var14 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)(Object)var10000;
            if ((IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)(Object)var10000 == null) {
               continue;
            }

            IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var5 = var14;
            if (var0 != null) {
               if (var1.put(var4, true) != null) {
                  continue;
               }

               var2.add(
                  new IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     var5, var4
                  )
               );
            }

            if (var0 != null) {
               continue;
            }
         }

         var12 = var2;
         break;
      }

      return var12;
   }

   private static final Unit a(
      IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI var0,
      IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.invoke(var1.a(), var1.b());
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "Ý¶x«<\b\u0088R#°\u008f#\\ð\u0007ÚÃ×â\u0012u \u0012\u0094\u001axñã%e\u008aR=TÊ\u0095\u0099\u001ajnW\nx\u0098\t\u000f{äc~ \u0086\n&\u009c*ù\u0089È_\u000f¢\u0099";
      int var4 = "Ý¶x«<\b\u0088R#°\u008f#\\ð\u0007ÚÃ×â\u0012u \u0012\u0094\u001axñã%e\u008aR=TÊ\u0095\u0099\u001ajnW\nx\u0098\t\u000f{äc~ \u0086\n&\u009c*ù\u0089È_\u000f¢\u0099"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 119;
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
                     case 0 -> 127;
                     case 1 -> 53;
                     case 2 -> 59;
                     case 3 -> 106;
                     case 4 -> 82;
                     case 5 -> 111;
                     default -> 86;
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
                     b = new String[8];
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

                  var2 = "4\u009c³¦IêÍ\fE\rS£\u007f_J#¶Ì\u001dò\u0014\u0002\u0003z¬Âr\u0005P9G\u009eèÆ6i^J$\u0019\u0007\f\f\u008bNR\f¯§\u0099ßUí¹üw«uujC¥Thï³PÍû\u0003\u0099AGwòê!\u0093}Â·uY`wð\u0089&p}eD\f¶\u0015Ô·±Sþ\u0089$3\u0091M\u008b-DÕ¯(k±ëä)Ä\u0001¨\u009eÌ_SA?×X ¦\u00ad~à0¢ÜØ2¶\tÌ\u0090\r5\u0087ËåR\u0019\u0082À«\u001a`h©Ù\u009a\u0016Úò÷N'd.&\u0090;¬¾\u0019\u001d\u0089öÎa\u0003\u0081É\u009dv©pæÿH¯³\u0084âLã¶£¬_0#å\u009f¾úó6\u000e[¸ìßÙ^ó";
                  var4 = "4\u009c³¦IêÍ\fE\rS£\u007f_J#¶Ì\u001dò\u0014\u0002\u0003z¬Âr\u0005P9G\u009eèÆ6i^J$\u0019\u0007\f\f\u008bNR\f¯§\u0099ßUí¹üw«uujC¥Thï³PÍû\u0003\u0099AGwòê!\u0093}Â·uY`wð\u0089&p}eD\f¶\u0015Ô·±Sþ\u0089$3\u0091M\u008b-DÕ¯(k±ëä)Ä\u0001¨\u009eÌ_SA?×X ¦\u00ad~à0¢ÜØ2¶\tÌ\u0090\r5\u0087ËåR\u0019\u0082À«\u001a`h©Ù\u009a\u0016Úò÷N'd.&\u0090;¬¾\u0019\u001d\u0089öÎa\u0003\u0081É\u009dv©pæÿH¯³\u0084âLã¶£¬_0#å\u009f¾úó6\u000e[¸ìßÙ^ó"
                     .length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 17;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -24440) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 185;
            case 1 -> 104;
            case 2 -> 115;
            case 3 -> 18;
            case 4 -> 129;
            case 5 -> 63;
            case 6 -> 140;
            case 7 -> 195;
            case 8 -> 144;
            case 9 -> 24;
            case 10 -> 100;
            case 11 -> 247;
            case 12 -> 139;
            case 13 -> 189;
            case 14 -> 215;
            case 15 -> 161;
            case 16 -> 16;
            case 17 -> 235;
            case 18 -> 176;
            case 19 -> 81;
            case 20 -> 223;
            case 21 -> 118;
            case 22 -> 33;
            case 23 -> 89;
            case 24 -> 193;
            case 25 -> 233;
            case 26 -> 234;
            case 27 -> 40;
            case 28 -> 218;
            case 29 -> 86;
            case 30 -> 238;
            case 31 -> 69;
            case 32 -> 125;
            case 33 -> 158;
            case 34 -> 203;
            case 35 -> 23;
            case 36 -> 64;
            case 37 -> 202;
            case 38 -> 216;
            case 39 -> 99;
            case 40 -> 236;
            case 41 -> 130;
            case 42 -> 178;
            case 43 -> 108;
            case 44 -> 74;
            case 45 -> 114;
            case 46 -> 34;
            case 47 -> 48;
            case 48 -> 182;
            case 49 -> 254;
            case 50 -> 208;
            case 51 -> 122;
            case 52 -> 219;
            case 53 -> 103;
            case 54 -> 173;
            case 55 -> 1;
            case 56 -> 41;
            case 57 -> 245;
            case 58 -> 226;
            case 59 -> 241;
            case 60 -> 121;
            case 61 -> 240;
            case 62 -> 85;
            case 63 -> 79;
            case 64 -> 187;
            case 65 -> 221;
            case 66 -> 57;
            case 67 -> 183;
            case 68 -> 163;
            case 69 -> 71;
            case 70 -> 192;
            case 71 -> 113;
            case 72 -> 166;
            case 73 -> 4;
            case 74 -> 62;
            case 75 -> 168;
            case 76 -> 101;
            case 77 -> 66;
            case 78 -> 53;
            case 79 -> 46;
            case 80 -> 169;
            case 81 -> 75;
            case 82 -> 43;
            case 83 -> 152;
            case 84 -> 188;
            case 85 -> 70;
            case 86 -> 148;
            case 87 -> 90;
            case 88 -> 134;
            case 89 -> 20;
            case 90 -> 220;
            case 91 -> 109;
            case 92 -> 205;
            case 93 -> 227;
            case 94 -> 228;
            case 95 -> 111;
            case 96 -> 12;
            case 97 -> 84;
            case 98 -> 246;
            case 99 -> 196;
            case 100 -> 150;
            case 101 -> 22;
            case 102 -> 27;
            case 103 -> 137;
            case 104 -> 175;
            case 105 -> 87;
            case 106 -> 123;
            case 107 -> 82;
            case 108 -> 88;
            case 109 -> 212;
            case 110 -> 35;
            case 111 -> 180;
            case 112 -> 199;
            case 113 -> 214;
            case 114 -> 224;
            case 115 -> 225;
            case 116 -> 250;
            case 117 -> 249;
            case 118 -> 252;
            case 119 -> 47;
            case 120 -> 237;
            case 121 -> 94;
            case 122 -> 155;
            case 123 -> 116;
            case 124 -> 3;
            case 125 -> 73;
            case 126 -> 5;
            case 127 -> 61;
            case 128 -> 239;
            case 129 -> 65;
            case 130 -> 56;
            case 131 -> 38;
            case 132 -> 229;
            case 133 -> 7;
            case 134 -> 191;
            case 135 -> 253;
            case 136 -> 95;
            case 137 -> 97;
            case 138 -> 50;
            case 139 -> 30;
            case 140 -> 45;
            case 141 -> 52;
            case 142 -> 17;
            case 143 -> 55;
            case 144 -> 198;
            case 145 -> 78;
            case 146 -> 131;
            case 147 -> 92;
            case 148 -> 248;
            case 149 -> 171;
            case 150 -> 170;
            case 151 -> 29;
            case 152 -> 243;
            case 153 -> 211;
            case 154 -> 177;
            case 155 -> 68;
            case 156 -> 49;
            case 157 -> 98;
            case 158 -> 206;
            case 159 -> 105;
            case 160 -> 31;
            case 161 -> 110;
            case 162 -> 201;
            case 163 -> 127;
            case 164 -> 230;
            case 165 -> 13;
            case 166 -> 200;
            case 167 -> 54;
            case 168 -> 186;
            case 169 -> 154;
            case 170 -> 138;
            case 171 -> 181;
            case 172 -> 146;
            case 173 -> 8;
            case 174 -> 77;
            case 175 -> 135;
            case 176 -> 157;
            case 177 -> 9;
            case 178 -> 149;
            case 179 -> 117;
            case 180 -> 83;
            case 181 -> 145;
            case 182 -> 120;
            case 183 -> 21;
            case 184 -> 143;
            case 185 -> 107;
            case 186 -> 164;
            case 187 -> 132;
            case 188 -> 232;
            case 189 -> 15;
            case 190 -> 51;
            case 191 -> 153;
            case 192 -> 128;
            case 193 -> 32;
            case 194 -> 11;
            case 195 -> 172;
            case 196 -> 231;
            case 197 -> 14;
            case 198 -> 126;
            case 199 -> 44;
            case 200 -> 147;
            case 201 -> 124;
            case 202 -> 10;
            case 203 -> 80;
            case 204 -> 93;
            case 205 -> 160;
            case 206 -> 242;
            case 207 -> 59;
            case 208 -> 67;
            case 209 -> 165;
            case 210 -> 194;
            case 211 -> 58;
            case 212 -> 37;
            case 213 -> 112;
            case 214 -> 141;
            case 215 -> 2;
            case 216 -> 244;
            case 217 -> 251;
            case 218 -> 213;
            case 219 -> 28;
            case 220 -> 42;
            case 221 -> 136;
            case 222 -> 184;
            case 223 -> 204;
            case 224 -> 162;
            case 225 -> 133;
            case 226 -> 174;
            case 227 -> 156;
            case 228 -> 209;
            case 229 -> 197;
            case 230 -> 142;
            case 231 -> 60;
            case 232 -> 179;
            case 233 -> 207;
            case 234 -> 19;
            case 235 -> 217;
            case 236 -> 25;
            case 237 -> 119;
            case 238 -> 0;
            case 239 -> 106;
            case 240 -> 36;
            case 241 -> 96;
            case 242 -> 72;
            case 243 -> 26;
            case 244 -> 222;
            case 245 -> 39;
            case 246 -> 190;
            case 247 -> 159;
            case 248 -> 76;
            case 249 -> 151;
            case 250 -> 102;
            case 251 -> 210;
            case 252 -> 255;
            case 253 -> 6;
            case 254 -> 91;
            default -> 167;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      // PX-FIX RC4-310: Kotlin default-args bridge restored from jar bytecode (descriptor (Lme/octo/client/IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;Lme/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;ILjava/lang/Object;)Lme/octo/client/IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll self, me.octo.client.IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI p1, me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII p2, int mask, java.lang.Object marker) {
      if ((mask & 1) != 0) { p1 = self.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
      if ((mask & 2) != 0) { p2 = self.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
      return self.a(p1, p2);
      }
      @NotNull
      private final IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
         @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2
      ) {
         short var10001 = 13698;
         short var10002 = 18488;
         Intrinsics.checkNotNullParameter(var1, "macro");
         var10001 = 13700;
         var10002 = -30636;
         Intrinsics.checkNotNullParameter(var2, "editor");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      @NotNull
      public final IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var1,
         @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2
      ) {
         short var10001 = 13699;
         short var10002 = -29666;
         Intrinsics.checkNotNullParameter(var1, "macro");
         var10001 = 13696;
         var10002 = -31018;
         Intrinsics.checkNotNullParameter(var2, "editor");
         return new IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = 13701;
         short var10003 = 32128;
         var10003 = 13697;
         short var10004 = -18362;
         return "Entry(macro="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", editor="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         return var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IIllIIlllllllIIllllIlIlIIIIIllIllIIIlllIIIlIIIllllllIIlIIIlIlIlIIllIllIIIIIlIlIlIIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 != null) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "\u001f\u001b\u0080\u009eY~\tg°ã7¾_@oH\u0005:S'4æ\u0005bI,w\u0087";
         int var4 = "\u001f\u001b\u0080\u009eY~\tg°ã7¾_@oH\u0005:S'4æ\u0005bI,w\u0087".length();
         char var1 = 6;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 22;
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
                        case 0 -> 19;
                        case 1 -> 70;
                        case 2 -> 117;
                        case 3 -> 125;
                        case 4 -> 24;
                        case 5 -> 94;
                        default -> 107;
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
                        b = new String[6];
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

                     var2 = "äD6¼Fó\f\u008fübæd$Â\rÍ\u0094q8";
                     var4 = "äD6¼Fó\f\u008fübæd$Â\rÍ\u0094q8".length();
                     var1 = 6;
                     var8 = -1;
               }

               var10000 = 115;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 13696) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 38;
               case 1 -> 109;
               case 2 -> 13;
               case 3 -> 96;
               case 4 -> 86;
               case 5 -> 6;
               case 6 -> 220;
               case 7 -> 163;
               case 8 -> 195;
               case 9 -> 158;
               case 10 -> 130;
               case 11 -> 136;
               case 12 -> 3;
               case 13 -> 213;
               case 14 -> 58;
               case 15 -> 160;
               case 16 -> 129;
               case 17 -> 242;
               case 18 -> 229;
               case 19 -> 70;
               case 20 -> 243;
               case 21 -> 41;
               case 22 -> 30;
               case 23 -> 181;
               case 24 -> 94;
               case 25 -> 5;
               case 26 -> 87;
               case 27 -> 215;
               case 28 -> 1;
               case 29 -> 179;
               case 30 -> 29;
               case 31 -> 186;
               case 32 -> 37;
               case 33 -> 250;
               case 34 -> 53;
               case 35 -> 8;
               case 36 -> 76;
               case 37 -> 18;
               case 38 -> 43;
               case 39 -> 19;
               case 40 -> 110;
               case 41 -> 113;
               case 42 -> 167;
               case 43 -> 142;
               case 44 -> 46;
               case 45 -> 221;
               case 46 -> 205;
               case 47 -> 92;
               case 48 -> 12;
               case 49 -> 135;
               case 50 -> 48;
               case 51 -> 16;
               case 52 -> 36;
               case 53 -> 139;
               case 54 -> 128;
               case 55 -> 2;
               case 56 -> 219;
               case 57 -> 85;
               case 58 -> 185;
               case 59 -> 60;
               case 60 -> 226;
               case 61 -> 72;
               case 62 -> 143;
               case 63 -> 230;
               case 64 -> 51;
               case 65 -> 151;
               case 66 -> 57;
               case 67 -> 77;
               case 68 -> 165;
               case 69 -> 184;
               case 70 -> 24;
               case 71 -> 55;
               case 72 -> 231;
               case 73 -> 69;
               case 74 -> 170;
               case 75 -> 152;
               case 76 -> 255;
               case 77 -> 169;
               case 78 -> 62;
               case 79 -> 106;
               case 80 -> 66;
               case 81 -> 189;
               case 82 -> 56;
               case 83 -> 147;
               case 84 -> 154;
               case 85 -> 125;
               case 86 -> 171;
               case 87 -> 228;
               case 88 -> 104;
               case 89 -> 196;
               case 90 -> 32;
               case 91 -> 73;
               case 92 -> 121;
               case 93 -> 234;
               case 94 -> 227;
               case 95 -> 216;
               case 96 -> 132;
               case 97 -> 39;
               case 98 -> 248;
               case 99 -> 153;
               case 100 -> 21;
               case 101 -> 176;
               case 102 -> 26;
               case 103 -> 20;
               case 104 -> 159;
               case 105 -> 118;
               case 106 -> 164;
               case 107 -> 168;
               case 108 -> 11;
               case 109 -> 237;
               case 110 -> 235;
               case 111 -> 200;
               case 112 -> 50;
               case 113 -> 33;
               case 114 -> 198;
               case 115 -> 137;
               case 116 -> 209;
               case 117 -> 180;
               case 118 -> 107;
               case 119 -> 84;
               case 120 -> 161;
               case 121 -> 208;
               case 122 -> 191;
               case 123 -> 91;
               case 124 -> 236;
               case 125 -> 148;
               case 126 -> 71;
               case 127 -> 155;
               case 128 -> 207;
               case 129 -> 61;
               case 130 -> 79;
               case 131 -> 223;
               case 132 -> 115;
               case 133 -> 156;
               case 134 -> 108;
               case 135 -> 17;
               case 136 -> 49;
               case 137 -> 120;
               case 138 -> 177;
               case 139 -> 194;
               case 140 -> 126;
               case 141 -> 203;
               case 142 -> 103;
               case 143 -> 59;
               case 144 -> 249;
               case 145 -> 117;
               case 146 -> 65;
               case 147 -> 246;
               case 148 -> 101;
               case 149 -> 119;
               case 150 -> 218;
               case 151 -> 10;
               case 152 -> 197;
               case 153 -> 182;
               case 154 -> 239;
               case 155 -> 83;
               case 156 -> 188;
               case 157 -> 127;
               case 158 -> 172;
               case 159 -> 4;
               case 160 -> 0;
               case 161 -> 35;
               case 162 -> 81;
               case 163 -> 201;
               case 164 -> 7;
               case 165 -> 190;
               case 166 -> 89;
               case 167 -> 100;
               case 168 -> 82;
               case 169 -> 166;
               case 170 -> 78;
               case 171 -> 31;
               case 172 -> 122;
               case 173 -> 174;
               case 174 -> 42;
               case 175 -> 133;
               case 176 -> 67;
               case 177 -> 52;
               case 178 -> 14;
               case 179 -> 146;
               case 180 -> 123;
               case 181 -> 193;
               case 182 -> 157;
               case 183 -> 173;
               case 184 -> 144;
               case 185 -> 116;
               case 186 -> 93;
               case 187 -> 45;
               case 188 -> 175;
               case 189 -> 64;
               case 190 -> 88;
               case 191 -> 183;
               case 192 -> 199;
               case 193 -> 124;
               case 194 -> 15;
               case 195 -> 244;
               case 196 -> 232;
               case 197 -> 210;
               case 198 -> 241;
               case 199 -> 54;
               case 200 -> 47;
               case 201 -> 44;
               case 202 -> 251;
               case 203 -> 75;
               case 204 -> 114;
               case 205 -> 99;
               case 206 -> 178;
               case 207 -> 212;
               case 208 -> 95;
               case 209 -> 22;
               case 210 -> 98;
               case 211 -> 63;
               case 212 -> 222;
               case 213 -> 131;
               case 214 -> 253;
               case 215 -> 140;
               case 216 -> 102;
               case 217 -> 224;
               case 218 -> 206;
               case 219 -> 112;
               case 220 -> 245;
               case 221 -> 252;
               case 222 -> 80;
               case 223 -> 68;
               case 224 -> 134;
               case 225 -> 217;
               case 226 -> 162;
               case 227 -> 23;
               case 228 -> 254;
               case 229 -> 187;
               case 230 -> 111;
               case 231 -> 28;
               case 232 -> 225;
               case 233 -> 34;
               case 234 -> 27;
               case 235 -> 141;
               case 236 -> 247;
               case 237 -> 150;
               case 238 -> 149;
               case 239 -> 214;
               case 240 -> 204;
               case 241 -> 145;
               case 242 -> 192;
               case 243 -> 97;
               case 244 -> 240;
               case 245 -> 9;
               case 246 -> 211;
               case 247 -> 74;
               case 248 -> 138;
               case 249 -> 90;
               case 250 -> 238;
               case 251 -> 40;
               case 252 -> 105;
               case 253 -> 25;
               case 254 -> 233;
               default -> 202;
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

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI implements IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a(char var1, int var2) {
      }

      @Override
      public void d() {
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.d();
      }

      @Override
      public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
         return IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII.super.a(var1, var2, var3, var4, var5, var6);
      }
   }
}
