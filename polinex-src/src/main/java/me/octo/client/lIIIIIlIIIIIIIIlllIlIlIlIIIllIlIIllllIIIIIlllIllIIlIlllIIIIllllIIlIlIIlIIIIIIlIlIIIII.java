package me.octo.client;

import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl;
import me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl;
import me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII {
   public static <T> T a(Object p0) { return null; } // PX-FIX ovld

   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final Function2<llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII, String, Unit> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final Function0<Unit> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final Lazy IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] a;
   private static String[] b;

   public lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII(
      @NotNull String var1,
      @NotNull String var2,
      @Nullable String var3,
      @NotNull Function2<? super llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII, ? super String, Unit> var4,
      @NotNull Function0<Unit> var5
   ) {
      short var10001 = 31941;
      short var10002 = 8012;
      Intrinsics.checkNotNullParameter(var1, "title");
      var10001 = 31942;
      var10002 = -3007;
      Intrinsics.checkNotNullParameter(var2, "subtitle");
      var10001 = 31939;
      var10002 = -12890;
      Intrinsics.checkNotNullParameter(var4, "onPick");
      var10001 = 31938;
      var10002 = -25890;
      Intrinsics.checkNotNullParameter(var5, "onClose");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = ((Function2<llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII,String,Unit>)(Object)(var4));
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = LazyKt.lazy(
         null
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

   @Nullable
   public final String c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final Function2<llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII, String, Unit> d() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final Function0<Unit> e() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   private final List<lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> f() {
      Lazy var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      return (List<lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)var1.getValue();
   }

   @Nullable
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      float var1, float var2, float var3, float var4, int var5, int var6, float var7
   ) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8;
      float var9;
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      float var15;
      float var16;
      int var45;
      label168: {
         label171: {
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1,
               var2,
               var3,
               var4,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e()
                  .a(0.75F * var7),
               0.0F
            );
            var9 = 560.0F;
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
            var10 = 440.0F;
            var11 = var1 + (var3 - var9) / 2.0F;
            var12 = var2 + (var4 - var10) / 2.0F - 10.0F;
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var11,
               var12,
               var9,
               var10,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .e(),
               14.0F
            );
            var8 = var10000;
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var11,
               var12,
               var9,
               var10,
               1.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .y()
                  .a(0.6F),
               14.0F
            );
            var13 = 22.0F;
            lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var11 + var13,
               var12 + 18.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               false, 16, null);
            lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var11 + var13,
               var12 + 38.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(),
               false, 16, null);
            var14 = 24.0F;
            var15 = var11 + var9 - var13 - var14;
            var16 = var12 + 16.0F;
            float var62;
            var45 = (var62 = var5 - var15) == 0.0F ? 0 : (var62 < 0.0F ? -1 : 1);
            if (var8 != null) {
               if (var45 < 0) {
                  break label171;
               }

               float var63;
               var45 = (var63 = var5 - (var15 + var14)) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var45 > 0) {
                  break label171;
               }

               float var64;
               var45 = (var64 = var6 - var16) == 0.0F ? 0 : (var64 < 0.0F ? -1 : 1);
            }

            if (var8 != null) {
               if (var45 < 0) {
                  break label171;
               }

               float var65;
               var45 = (var65 = var6 - (var16 + var14)) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
            }

            if (var8 == null) {
               break label168;
            }

            if (var45 <= 0) {
               var45 = 1;
               break label168;
            }
         }

         var45 = 0;
      }

      int var17 = var45;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var15,
         var16,
         var14,
         var14,
         var17 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j(),
         6.0F
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var15,
         var16,
         var14,
         var14,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.5F),
         6.0F
      );
      short var10001 = 31936;
      int var10002 = 20065;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
            var15 + 6.0F,
            var16 + 6.0F,
            12.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            1.0F
         );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var11 + var13,
         var12 + 66.0F,
         var9 - var13 * 2.0F,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.4F),
         0.5F
      );
      float var18 = var11 + var13;
      float var19 = var12 + 74.0F;
      float var20 = var9 - var13 * 2.0F;
      float var21 = var10 - 74.0F - var13;
      if (var8 != null) {
         if (this.f().isEmpty()) {
            var10001 = 31943;
            var10002 = (short)-22267;
            lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               .a(
                  "No matching local routes",
                  var18 + var20 / 2.0F,
                  var19 + var21 / 2.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
               );
            return var17 != 0
               ? this.a(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII)
               : this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         }

         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var18, var19, var20, var21);
      }

      float var22 = 46.0F;
      float var23 = 6.0F;
      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var24 = null;
      Iterable var25 = this.f();
      boolean var26 = false;
      int var27 = 0;
      Iterator var28 = var25.iterator();

      while (true) {
         if (var28.hasNext()) {
            Object var29 = var28.next();
            int var30 = var27++;
            var45 = var30;
            if (var8 == null) {
               break;
            }

            if (var8 != null) {
               if (var30 < 0) {
                  CollectionsKt.throwIndexOverflow();
               }

               var45 = var30;
            }

            lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var31 = (lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var29;
            int var32 = var45;
            boolean var33 = false;
            float var35 = var19 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + var32 * (var22 + var23);
            label112:
            if (var8 != null && !(var35 + var22 < var19)) {
               float var66;
               var45 = (var66 = var35 - (var19 + var21)) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
               if (var8 != null) {
                  if (var45 > 0) {
                     break label112;
                  }

                  float var67;
                  var45 = (var67 = var5 - var18) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
               }

               label132: {
                  label175: {
                     if (var8 != null) {
                        if (var45 < 0) {
                           break label175;
                        }

                        float var68;
                        var45 = (var68 = var5 - (var18 + var20)) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                     }

                     if (var8 != null) {
                        if (var45 > 0) {
                           break label175;
                        }

                        float var69;
                        var45 = (var69 = var6 - var35) == 0.0F ? 0 : (var69 < 0.0F ? -1 : 1);
                     }

                     if (var8 != null) {
                        if (var45 < 0) {
                           break label175;
                        }

                        float var70;
                        var45 = (var70 = var6 - (var35 + var22)) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
                     }

                     if (var8 == null) {
                        break label132;
                     }

                     if (var45 <= 0) {
                        var45 = 1;
                        break label132;
                     }
                  }

                  var45 = 0;
               }

               int var36 = var45;
               lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl var49 = lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               String var53 = var31.a().a();
               String var56 = var31.b();
               short var10003 = 31940;
               short var10004 = 28846;
               float var37 = lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(var49, "localroute:" + var53 + ":" + var56, (var36 != 0), 0.0F, 4, null
               );
               float var71;
               var45 = (var71 = var37 - 0.01F) == 0.0F ? 0 : (var71 < 0.0F ? -1 : 1);
               if (var8 != null) {
                  if (var45 > 0) {
                     lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
                        lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
                        var18,
                        var35,
                        var20,
                        var22,
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .aq(),
                        IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .ah(),
                        var37 * 0.4F,
                        4.0F);
                  }

                  var45 = var36;
               }

               llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var38 = var45 != 0
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .g()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .j();
               lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var18,
                  var35,
                  var20,
                  var22,
                  var38,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .aq()
               );
               lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var18,
                  var35,
                  var20,
                  var22,
                  1.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .y()
                     .a(var36 != 0 ? 0.65F : 0.3F),
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .aq()
               );
               me.octo.client.IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var39 = IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var31.a().d());
               float var40 = 36.0F;
               float var41 = var18 + 8.0F;
               float var42 = var35 + (var22 - var40) / 2.0F;
               IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var39.b(), var39.a(), var41, var42, var40, 1.0F, true);
               float var43 = var41 + var40 + 10.0F;
               lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
                  lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
                  var31.b(),
                  var43,
                  var35 + var22 / 2.0F - 7.0F,
                  var36 != 0
                     ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                     : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a()
                        .a(0.9F),
                  false, 16, null);
               lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll var51 = lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               String var54 = var31.a().a();
               var10002 = var31.c();
               var10003 = 31937;
               var10004 = -5775;
               var10004 = 31944;
               short var10005 = 15313;
               lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
                  var51,
                  var54 + " · " + var10002 + " waypoints",
                  var43,
                  var35 + var22 / 2.0F + 8.0F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c(),
                  false, 16, null);
               if (var36 != 0 && var24 == null) {
                  var24 = this.a((kotlin.jvm.functions.Function1)null);
               }
            }

            if (var8 != null) {
               continue;
            }
         }

         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .i();
         var45 = var17;
         break;
      }

      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var52;
      if (var45 != 0) {
         var52 = this.a(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      } else {
         var52 = var24;
         if (var24 == null) {
            var52 = ((IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll));
         }
      }

      return var52;
   }

   public final boolean a(char var1, int var2) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      int var10000 = var2;
      if (var3 != null) {
         if (var2 == 256) {
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.invoke();
            return true;
         }

         var10000 = 1;
      }

      return (var10000 != 0);
   }

   public final void a(int var1) {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = RangesKt.coerceAtMost(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + var1 * 0.5F, 0.0F
      );
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(final Function0<Unit> var1) {
      return new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII() {
         public void e() {
            var1.invoke();
         }

         public void a(char var1x, int var2) {
         }
      };
   }

   private static final List a(lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII param0) {
      var var1 = me.octo.client.IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      var var2 = new java.util.ArrayList();
      for (var var4 : me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII) {
         var var5 = param0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var5 != null && !var4.d().equalsIgnoreCase(var5)) {
            continue;
         }
         me.octo.client.IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var6 = null;
         for (var var7 : me.octo.client.lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
            if (me.octo.client.llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var7) == var4) {
               var6 = var7;
               break;
            }
         }
         if (var6 == null) {
            continue;
         }
         for (var var8 : me.octo.client.llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var6)) {
            if (me.octo.client.llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var4, var8)) {
               continue;
            }
            var var9 = var4.J();
            var var10 = var9 != null ? var9.d(var8) : null;
            if (var10 == null) {
               var10 = var8;
            }
            if (me.octo.client.llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var4.b(), var10) == null) {
               var2.add(new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var4, var8, me.octo.client.llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var6, var8)));
            }
         }
      }
      return var2;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: new java/util/ArrayList
      // 006: dup
      // 007: invokespecial java/util/ArrayList.<init> ()V
      // 00a: checkcast java/util/List
      // 00d: astore 2
      // 00e: astore 1
      // 00f: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII Ljava/util/List;
      // 012: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 017: astore 3
      // 018: aload 3
      // 019: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01e: ifeq 16d
      // 021: aload 3
      // 022: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 027: checkcast me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII
      // 02a: astore 4
      // 02c: aload 0
      // 02d: getfield me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/lang/String;
      // 030: aload 1
      // 031: ifnull 04a
      // 034: ifnull 059
      // 037: goto 03e
      // 03a: invokestatic me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d: athrow
      // 03e: aload 4
      // 040: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.d ()Ljava/lang/String;
      // 043: goto 04a
      // 046: invokestatic me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: aload 0
      // 04b: getfield me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/lang/String;
      // 04e: bipush 1
      // 04f: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 052: aload 1
      // 053: ifnull 01e
      // 056: ifeq 018
      // 059: getstatic me/octo/client/lIlIllIlIlIllIlllllIlIlIIIlIllIIIllIIlllIIIIIIlIlIIllIIlIlllllIIIlllIlIllIIIlllIllIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/util/List;
      // 05c: checkcast java/lang/Iterable
      // 05f: astore 7
      // 061: bipush 0
      // 062: istore 8
      // 064: aload 7
      // 066: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 06b: astore 9
      // 06d: aload 9
      // 06f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 074: ifeq 0a8
      // 077: aload 9
      // 079: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 07e: astore 10
      // 080: aload 10
      // 082: checkcast me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI
      // 085: astore 11
      // 087: bipush 0
      // 088: istore 12
      // 08a: getstatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII;
      // 08d: aload 11
      // 08f: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.b (Lme/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;)Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;
      // 092: aload 4
      // 094: if_acmpne 09b
      // 097: bipush 1
      // 098: goto 09c
      // 09b: bipush 0
      // 09c: ifeq 06d
      // 09f: aload 10
      // 0a1: aload 1
      // 0a2: ifnull 082
      // 0a5: goto 0a9
      // 0a8: aconst_null
      // 0a9: checkcast me/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI
      // 0ac: dup
      // 0ad: ifnonnull 0b8
      // 0b0: pop
      // 0b1: goto 018
      // 0b4: invokestatic me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: astore 5
      // 0ba: getstatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII;
      // 0bd: aload 5
      // 0bf: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.d (Lme/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;)Ljava/util/List;
      // 0c2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c7: astore 6
      // 0c9: aload 6
      // 0cb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d0: ifeq 018
      // 0d3: aload 6
      // 0d5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0da: checkcast java/lang/String
      // 0dd: astore 7
      // 0df: aload 1
      // 0e0: ifnull 0fc
      // 0e3: getstatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII;
      // 0e6: aload 4
      // 0e8: aload 7
      // 0ea: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.b (Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;Ljava/lang/String;)Z
      // 0ed: aload 1
      // 0ee: ifnull 01e
      // 0f1: goto 0f8
      // 0f4: invokestatic me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: ifne 0c9
      // 0fb: nop
      // 0fc: aload 1
      // 0fd: ifnull 128
      // 100: aload 4
      // 102: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.J ()Lme/octo/client/IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl;
      // 105: dup
      // 106: ifnull 120
      // 109: goto 110
      // 10c: invokestatic me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: aload 7
      // 112: invokevirtual me/octo/client/IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.d (Ljava/lang/String;)Ljava/lang/String;
      // 115: dup
      // 116: ifnonnull 12a
      // 119: goto 120
      // 11c: invokestatic me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: pop
      // 121: goto 128
      // 124: invokestatic me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: aload 7
      // 12a: astore 9
      // 12c: goto 135
      // 12f: astore 10
      // 131: aload 7
      // 133: astore 9
      // 135: aload 9
      // 137: astore 8
      // 139: getstatic me/octo/client/llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI;
      // 13c: aload 4
      // 13e: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.b ()Ljava/lang/String;
      // 141: aload 8
      // 143: invokevirtual me/octo/client/llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.a (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 146: ifnonnull 0c9
      // 149: getstatic me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII;
      // 14c: aload 5
      // 14e: aload 7
      // 150: invokevirtual me/octo/client/llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.b (Lme/octo/client/IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI;Ljava/lang/String;)I
      // 153: istore 9
      // 155: aload 2
      // 156: new me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 159: dup
      // 15a: aload 4
      // 15c: aload 7
      // 15e: iload 9
      // 160: invokespecial me/octo/client/lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.<init> (Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;Ljava/lang/String;I)V
      // 163: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 168: pop
      // 169: aload 1
      // 16a: ifnonnull 0c9
      // 16d: aload 2
      // 16e: areturn
   }

   private static final Unit a(
      lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII var0,
      lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.invoke(var1.a(), var1.b());
      return Unit.INSTANCE;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "J+Þ\u0003yô«\u0094dv¹¥Ý¬HÍ(è({÷Þ¾\u008dó\u0011ê¦C\u0095\u0014Àr\u001aÎ\u0000\nÔÿÿ\u009bv°<k\fÞA4³ÄmÁàQ\u008fYM\u008e\u0099ÊCL!qKìÓ\u0018ªbÕç?qÉOÊÌ%<E¿l³ôS\u0097Èf\u009dÆ¢ 2¦ÒPLW§\u0007só_e´e_TN\u0015Ø¢\u008c\u0003\u009b´#\u0086gfØÆÏ\u0088è\u0012\u008av\\\u0000>\u001e\u008aÿê2ÉÂ3I\u009eOq}ª¥X\u0000»)Æ&gÄZÏA-x´\u000f\u0001¶*\u0002\u0015P¡¼\u0000\u009aÎæÈÖóÓ\u008eA\u000f\u0013äÆ>§<p\u008d\u001fI\u0085\u008b8úÁö¾:ð\u000eõË¯\u0003\t\u001aÙ\u0007Ï6Äkzo(\u0006\u008aP\u007f¢pë\u000bä\u0019â¢\u0099û=8DE*\u0005¸ÌeÓ\u0095\b5º%\u009aEM\u00008";
      int var4 = "J+Þ\u0003yô«\u0094dv¹¥Ý¬HÍ(è({÷Þ¾\u008dó\u0011ê¦C\u0095\u0014Àr\u001aÎ\u0000\nÔÿÿ\u009bv°<k\fÞA4³ÄmÁàQ\u008fYM\u008e\u0099ÊCL!qKìÓ\u0018ªbÕç?qÉOÊÌ%<E¿l³ôS\u0097Èf\u009dÆ¢ 2¦ÒPLW§\u0007só_e´e_TN\u0015Ø¢\u008c\u0003\u009b´#\u0086gfØÆÏ\u0088è\u0012\u008av\\\u0000>\u001e\u008aÿê2ÉÂ3I\u009eOq}ª¥X\u0000»)Æ&gÄZÏA-x´\u000f\u0001¶*\u0002\u0015P¡¼\u0000\u009aÎæÈÖóÓ\u008eA\u000f\u0013äÆ>§<p\u008d\u001fI\u0085\u008b8úÁö¾:ð\u000eõË¯\u0003\t\u001aÙ\u0007Ï6Äkzo(\u0006\u008aP\u007f¢pë\u000bä\u0019â¢\u0099û=8DE*\u0005¸ÌeÓ\u0095\b5º%\u009aEM\u00008"
         .length();
      char var1 = 205;
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
                     case 0 -> 29;
                     case 1 -> 33;
                     case 2 -> 77;
                     case 3 -> 84;
                     case 4 -> 29;
                     case 5 -> 8;
                     default -> 49;
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
                     b = new String[9];
                     break pxClinit;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0016ï\u001bò\u0002øl\u0001|UL\r|è\u0081i- \u0012M\tÓ\b\u008d\nô\t¥!\u00ad\u000f \u0081³\u009e";
                  var4 = "\u0016ï\u001bò\u0002øl\u0001|UL\r|è\u0081i- \u0012M\tÓ\b\u008d\nô\t¥!\u00ad\u000f \u0081³\u009e".length();
                  var1 = 24;
                  var8 = -1;
            }

            var10000 = 127;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 31936) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 90;
            case 1 -> 82;
            case 2 -> 198;
            case 3 -> 135;
            case 4 -> 77;
            case 5 -> 96;
            case 6 -> 9;
            case 7 -> 25;
            case 8 -> 131;
            case 9 -> 73;
            case 10 -> 119;
            case 11 -> 43;
            case 12 -> 173;
            case 13 -> 65;
            case 14 -> 68;
            case 15 -> 100;
            case 16 -> 233;
            case 17 -> 176;
            case 18 -> 210;
            case 19 -> 21;
            case 20 -> 237;
            case 21 -> 60;
            case 22 -> 30;
            case 23 -> 105;
            case 24 -> 220;
            case 25 -> 64;
            case 26 -> 228;
            case 27 -> 229;
            case 28 -> 182;
            case 29 -> 75;
            case 30 -> 241;
            case 31 -> 141;
            case 32 -> 222;
            case 33 -> 224;
            case 34 -> 46;
            case 35 -> 239;
            case 36 -> 72;
            case 37 -> 6;
            case 38 -> 86;
            case 39 -> 212;
            case 40 -> 128;
            case 41 -> 7;
            case 42 -> 84;
            case 43 -> 204;
            case 44 -> 121;
            case 45 -> 179;
            case 46 -> 152;
            case 47 -> 109;
            case 48 -> 106;
            case 49 -> 38;
            case 50 -> 118;
            case 51 -> 253;
            case 52 -> 163;
            case 53 -> 223;
            case 54 -> 168;
            case 55 -> 183;
            case 56 -> 246;
            case 57 -> 213;
            case 58 -> 93;
            case 59 -> 113;
            case 60 -> 108;
            case 61 -> 36;
            case 62 -> 186;
            case 63 -> 62;
            case 64 -> 78;
            case 65 -> 51;
            case 66 -> 123;
            case 67 -> 197;
            case 68 -> 206;
            case 69 -> 129;
            case 70 -> 55;
            case 71 -> 20;
            case 72 -> 149;
            case 73 -> 50;
            case 74 -> 74;
            case 75 -> 87;
            case 76 -> 143;
            case 77 -> 91;
            case 78 -> 12;
            case 79 -> 28;
            case 80 -> 232;
            case 81 -> 132;
            case 82 -> 13;
            case 83 -> 188;
            case 84 -> 126;
            case 85 -> 52;
            case 86 -> 196;
            case 87 -> 171;
            case 88 -> 34;
            case 89 -> 177;
            case 90 -> 44;
            case 91 -> 70;
            case 92 -> 242;
            case 93 -> 178;
            case 94 -> 169;
            case 95 -> 110;
            case 96 -> 114;
            case 97 -> 159;
            case 98 -> 167;
            case 99 -> 240;
            case 100 -> 214;
            case 101 -> 193;
            case 102 -> 142;
            case 103 -> 120;
            case 104 -> 215;
            case 105 -> 247;
            case 106 -> 234;
            case 107 -> 69;
            case 108 -> 218;
            case 109 -> 92;
            case 110 -> 140;
            case 111 -> 165;
            case 112 -> 146;
            case 113 -> 99;
            case 114 -> 88;
            case 115 -> 227;
            case 116 -> 203;
            case 117 -> 155;
            case 118 -> 192;
            case 119 -> 172;
            case 120 -> 42;
            case 121 -> 231;
            case 122 -> 115;
            case 123 -> 85;
            case 124 -> 66;
            case 125 -> 79;
            case 126 -> 250;
            case 127 -> 148;
            case 128 -> 180;
            case 129 -> 83;
            case 130 -> 26;
            case 131 -> 254;
            case 132 -> 185;
            case 133 -> 181;
            case 134 -> 125;
            case 135 -> 190;
            case 136 -> 161;
            case 137 -> 130;
            case 138 -> 158;
            case 139 -> 144;
            case 140 -> 138;
            case 141 -> 157;
            case 142 -> 235;
            case 143 -> 184;
            case 144 -> 236;
            case 145 -> 2;
            case 146 -> 208;
            case 147 -> 10;
            case 148 -> 187;
            case 149 -> 136;
            case 150 -> 27;
            case 151 -> 200;
            case 152 -> 17;
            case 153 -> 39;
            case 154 -> 11;
            case 155 -> 54;
            case 156 -> 202;
            case 157 -> 32;
            case 158 -> 107;
            case 159 -> 166;
            case 160 -> 201;
            case 161 -> 156;
            case 162 -> 104;
            case 163 -> 31;
            case 164 -> 16;
            case 165 -> 219;
            case 166 -> 97;
            case 167 -> 226;
            case 168 -> 117;
            case 169 -> 71;
            case 170 -> 252;
            case 171 -> 61;
            case 172 -> 133;
            case 173 -> 194;
            case 174 -> 124;
            case 175 -> 221;
            case 176 -> 24;
            case 177 -> 58;
            case 178 -> 23;
            case 179 -> 217;
            case 180 -> 207;
            case 181 -> 139;
            case 182 -> 22;
            case 183 -> 8;
            case 184 -> 162;
            case 185 -> 0;
            case 186 -> 53;
            case 187 -> 67;
            case 188 -> 37;
            case 189 -> 29;
            case 190 -> 56;
            case 191 -> 101;
            case 192 -> 150;
            case 193 -> 102;
            case 194 -> 49;
            case 195 -> 95;
            case 196 -> 76;
            case 197 -> 216;
            case 198 -> 249;
            case 199 -> 137;
            case 200 -> 57;
            case 201 -> 225;
            case 202 -> 209;
            case 203 -> 189;
            case 204 -> 122;
            case 205 -> 94;
            case 206 -> 199;
            case 207 -> 134;
            case 208 -> 14;
            case 209 -> 4;
            case 210 -> 153;
            case 211 -> 147;
            case 212 -> 98;
            case 213 -> 255;
            case 214 -> 245;
            case 215 -> 191;
            case 216 -> 145;
            case 217 -> 48;
            case 218 -> 127;
            case 219 -> 18;
            case 220 -> 35;
            case 221 -> 1;
            case 222 -> 251;
            case 223 -> 230;
            case 224 -> 160;
            case 225 -> 164;
            case 226 -> 63;
            case 227 -> 244;
            case 228 -> 211;
            case 229 -> 205;
            case 230 -> 33;
            case 231 -> 40;
            case 232 -> 154;
            case 233 -> 41;
            case 234 -> 80;
            case 235 -> 170;
            case 236 -> 5;
            case 237 -> 151;
            case 238 -> 89;
            case 239 -> 81;
            case 240 -> 15;
            case 241 -> 47;
            case 242 -> 19;
            case 243 -> 195;
            case 244 -> 116;
            case 245 -> 111;
            case 246 -> 243;
            case 247 -> 175;
            case 248 -> 174;
            case 249 -> 45;
            case 250 -> 238;
            case 251 -> 112;
            case 252 -> 59;
            case 253 -> 3;
            case 254 -> 248;
            default -> 103;
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
      @NotNull
      private final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1, @NotNull String var2, int var3
      ) {
         short var10001 = 4647;
         short var10002 = 25847;
         Intrinsics.checkNotNullParameter(var1, "editor");
         var10001 = 4644;
         var10002 = -14309;
         Intrinsics.checkNotNullParameter(var2, "routeName");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var1, @NotNull String var2, int var3
      ) {
         short var10001 = 4643;
         short var10002 = 27340;
         Intrinsics.checkNotNullParameter(var1, "editor");
         var10001 = 4646;
         var10002 = -7675;
         Intrinsics.checkNotNullParameter(var2, "routeName");
         return new lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 4642;
         int var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -31106;
         short var10002 = 4641;
         short var10003 = 27155;
         short var10004 = 4640;
         short var10005 = 26214;
         return "Option(editor=" + var3 + ", routeName=" + var2 + ", points=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
         var1 = var1 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
         return var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (var2 != null) {
            if (var4 != var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "\u008a·Ð¬K\u0098LQçÙ-Ô\nª\u0006ï\u0086\u000e\u0001.\u008f\t\u009f\u0099y5üm ùä\feÊ$_\t:\u0010w\u008dWÔÓ\t\rù»\u0084\r\u0003\u0086\u000eß";
         int var4 = "\u008a·Ð¬K\u0098LQçÙ-Ô\nª\u0006ï\u0086\u000e\u0001.\u008f\t\u009f\u0099y5üm ùä\feÊ$_\t:\u0010w\u008dWÔÓ\t\rù»\u0084\r\u0003\u0086\u000eß"
            .length();
         char var1 = 14;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 13;
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
                        case 0 -> 109;
                        case 1 -> 103;
                        case 2 -> 82;
                        case 3 -> 13;
                        case 4 -> 34;
                        case 5 -> 42;
                        default -> 103;
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
                        break pxClinit;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "ß)X¤´k\tí\u008d÷ZÔ\u0088í/â";
                     var4 = "ß)X¤´k\tí\u008d÷ZÔ\u0088í/â".length();
                     var1 = 6;
                     var8 = -1;
               }

               var10000 = 31;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 4642) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 44;
               case 1 -> 141;
               case 2 -> 194;
               case 3 -> 3;
               case 4 -> 106;
               case 5 -> 234;
               case 6 -> 57;
               case 7 -> 197;
               case 8 -> 112;
               case 9 -> 50;
               case 10 -> 200;
               case 11 -> 37;
               case 12 -> 49;
               case 13 -> 185;
               case 14 -> 229;
               case 15 -> 133;
               case 16 -> 104;
               case 17 -> 225;
               case 18 -> 122;
               case 19 -> 151;
               case 20 -> 221;
               case 21 -> 180;
               case 22 -> 253;
               case 23 -> 89;
               case 24 -> 65;
               case 25 -> 224;
               case 26 -> 103;
               case 27 -> 48;
               case 28 -> 25;
               case 29 -> 62;
               case 30 -> 81;
               case 31 -> 137;
               case 32 -> 24;
               case 33 -> 41;
               case 34 -> 52;
               case 35 -> 227;
               case 36 -> 182;
               case 37 -> 55;
               case 38 -> 118;
               case 39 -> 18;
               case 40 -> 169;
               case 41 -> 146;
               case 42 -> 86;
               case 43 -> 1;
               case 44 -> 113;
               case 45 -> 157;
               case 46 -> 85;
               case 47 -> 117;
               case 48 -> 102;
               case 49 -> 176;
               case 50 -> 129;
               case 51 -> 189;
               case 52 -> 77;
               case 53 -> 17;
               case 54 -> 56;
               case 55 -> 59;
               case 56 -> 75;
               case 57 -> 11;
               case 58 -> 174;
               case 59 -> 60;
               case 60 -> 154;
               case 61 -> 165;
               case 62 -> 61;
               case 63 -> 76;
               case 64 -> 168;
               case 65 -> 73;
               case 66 -> 214;
               case 67 -> 190;
               case 68 -> 198;
               case 69 -> 108;
               case 70 -> 105;
               case 71 -> 6;
               case 72 -> 119;
               case 73 -> 193;
               case 74 -> 4;
               case 75 -> 5;
               case 76 -> 177;
               case 77 -> 188;
               case 78 -> 238;
               case 79 -> 136;
               case 80 -> 67;
               case 81 -> 201;
               case 82 -> 134;
               case 83 -> 252;
               case 84 -> 144;
               case 85 -> 58;
               case 86 -> 7;
               case 87 -> 15;
               case 88 -> 99;
               case 89 -> 208;
               case 90 -> 161;
               case 91 -> 186;
               case 92 -> 196;
               case 93 -> 156;
               case 94 -> 241;
               case 95 -> 34;
               case 96 -> 8;
               case 97 -> 216;
               case 98 -> 164;
               case 99 -> 10;
               case 100 -> 166;
               case 101 -> 248;
               case 102 -> 91;
               case 103 -> 19;
               case 104 -> 40;
               case 105 -> 242;
               case 106 -> 149;
               case 107 -> 69;
               case 108 -> 78;
               case 109 -> 230;
               case 110 -> 72;
               case 111 -> 35;
               case 112 -> 246;
               case 113 -> 16;
               case 114 -> 249;
               case 115 -> 202;
               case 116 -> 123;
               case 117 -> 232;
               case 118 -> 36;
               case 119 -> 84;
               case 120 -> 87;
               case 121 -> 63;
               case 122 -> 145;
               case 123 -> 20;
               case 124 -> 191;
               case 125 -> 43;
               case 126 -> 101;
               case 127 -> 83;
               case 128 -> 247;
               case 129 -> 98;
               case 130 -> 38;
               case 131 -> 71;
               case 132 -> 254;
               case 133 -> 206;
               case 134 -> 250;
               case 135 -> 195;
               case 136 -> 172;
               case 137 -> 223;
               case 138 -> 27;
               case 139 -> 120;
               case 140 -> 23;
               case 141 -> 53;
               case 142 -> 162;
               case 143 -> 226;
               case 144 -> 70;
               case 145 -> 32;
               case 146 -> 213;
               case 147 -> 131;
               case 148 -> 135;
               case 149 -> 167;
               case 150 -> 173;
               case 151 -> 96;
               case 152 -> 79;
               case 153 -> 235;
               case 154 -> 170;
               case 155 -> 142;
               case 156 -> 125;
               case 157 -> 178;
               case 158 -> 233;
               case 159 -> 46;
               case 160 -> 244;
               case 161 -> 239;
               case 162 -> 179;
               case 163 -> 150;
               case 164 -> 33;
               case 165 -> 88;
               case 166 -> 107;
               case 167 -> 181;
               case 168 -> 90;
               case 169 -> 45;
               case 170 -> 93;
               case 171 -> 127;
               case 172 -> 14;
               case 173 -> 47;
               case 174 -> 212;
               case 175 -> 237;
               case 176 -> 245;
               case 177 -> 140;
               case 178 -> 160;
               case 179 -> 138;
               case 180 -> 31;
               case 181 -> 205;
               case 182 -> 94;
               case 183 -> 95;
               case 184 -> 228;
               case 185 -> 187;
               case 186 -> 66;
               case 187 -> 130;
               case 188 -> 231;
               case 189 -> 114;
               case 190 -> 28;
               case 191 -> 159;
               case 192 -> 80;
               case 193 -> 115;
               case 194 -> 204;
               case 195 -> 124;
               case 196 -> 26;
               case 197 -> 92;
               case 198 -> 148;
               case 199 -> 183;
               case 200 -> 210;
               case 201 -> 171;
               case 202 -> 9;
               case 203 -> 51;
               case 204 -> 109;
               case 205 -> 243;
               case 206 -> 21;
               case 207 -> 220;
               case 208 -> 128;
               case 209 -> 100;
               case 210 -> 64;
               case 211 -> 68;
               case 212 -> 219;
               case 213 -> 163;
               case 214 -> 12;
               case 215 -> 82;
               case 216 -> 29;
               case 217 -> 175;
               case 218 -> 215;
               case 219 -> 207;
               case 220 -> 54;
               case 221 -> 97;
               case 222 -> 0;
               case 223 -> 192;
               case 224 -> 30;
               case 225 -> 209;
               case 226 -> 74;
               case 227 -> 139;
               case 228 -> 211;
               case 229 -> 126;
               case 230 -> 42;
               case 231 -> 240;
               case 232 -> 2;
               case 233 -> 158;
               case 234 -> 217;
               case 235 -> 132;
               case 236 -> 203;
               case 237 -> 153;
               case 238 -> 152;
               case 239 -> 222;
               case 240 -> 13;
               case 241 -> 155;
               case 242 -> 184;
               case 243 -> 143;
               case 244 -> 218;
               case 245 -> 110;
               case 246 -> 199;
               case 247 -> 39;
               case 248 -> 121;
               case 249 -> 116;
               case 250 -> 255;
               case 251 -> 236;
               case 252 -> 22;
               case 253 -> 111;
               case 254 -> 251;
               default -> 147;
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

   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1, me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var2, String var3, int var4, int var5, Object var6) {
      if ((var5 & 1) != 0) {
         var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var5 & 2) != 0) {
         var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var5 & 4) != 0) {
         var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      return var1.a(var2, var3, var4);
   }

   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI implements IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
      public void e() {
      }

      public void a(char var1, int var2x) {
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

   public lIIIIIlIIIIIIIIlllIlIlIlIIIllIlIIllllIIIIIlllIllIIlIlllIIIIllllIIlIlIIlIIIIIIlIlIIIII(String var1, String var2, String var3, kotlin.jvm.functions.Function2 var4, kotlin.jvm.functions.Function0 var5, int var6, kotlin.jvm.internal.DefaultConstructorMarker var7) {
      if ((var6 & 4) != 0) {
         var3 = null;
      }

      this(var1, var2, var3, var4, var5);
   }

}
