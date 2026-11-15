package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public interface IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl
   extends IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   String[] d = d_arr_init();
   String[] e = new String[16];

   @NotNull
   String k();

   @NotNull
   String l();

   @NotNull
   IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll m();

   default int n() {
      return 90;
   }

   default int b(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      short var10001 = 23939;
      short var10002 = -16549;
      Intrinsics.checkNotNullParameter(var1, "resolution");
      int var2 = (int)((var1.g() - 95 - 20 - 12) / 2.0F);
      return this.m().l(var2);
   }

   default int c(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      int var10000 = ((me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b()) ? 1 : 0);
      short var10002 = 23949;
      short var10003 = -7042;
      Intrinsics.checkNotNullParameter(var1, "resolution");
      boolean var2 = (var10000 != 0);
      IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var3 = this.m();
      int var4 = this.b(var1);
      var10000 = ((var3.aq()) ? 1 : 0);
      if (var2) {
         if (var10000 != 0) {
            IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] var5 = this.a(var3);
            float var6 = var4;
            int var7 = 0;
            int var8 = var5.length;

            while (true) {
               if (var7 < var8) {
                  IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var9 = var5[var7];
                  if (var2) {
                     var10000 = ((var9.c().b()) ? 1 : 0);
                     if (!var2) {
                        break;
                     }

                     if (var10000 != 0) {
                        var6 += var9.a(var1) + 7.0F;
                     }

                     var7++;
                  }

                  if (var2) {
                     continue;
                  }
               }

               var10000 = (int)var6 + 4;
               break;
            }

            return var10000;
         }

         var10000 = var4;
      }

      return var10000;
   }

   @NotNull
   default IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] a(
      @NotNull IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll param1
   ) {
      boolean var2 = llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
      Intrinsics.checkNotNullParameter(param1, "module");
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var3 = param1.an();
      java.util.ArrayList var4 = new java.util.ArrayList();
      boolean var5 = false;
      try {
         Class var6 = Class.forName("me.octo.client." + me.octo.client.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":" + ":13NNY5UCK5D!CK"))), false, (ClassLoader)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         java.lang.reflect.Field var7 = var6.getDeclaredField(me.octo.client.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":" + ":L0RY1SC00L229428!@#"))));
         var7.setAccessible(true);
         int var8 = ((Integer)var7.get((Object)null)).intValue();
         var5 = var8 == me.octo.client.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b();
      } catch (Exception var9) {
      }
      for (int var10 = 0; var10 < var3.length; var10++) {
         IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var11 = var3[var10];
         if (!me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII || !var11.c() || var5) {
            var4.add(var11.g());
         }
      }
      return (IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[])var4.toArray(new IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[0]);
   }

   @NotNull
   default IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] b(
      @NotNull IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll param1
   ) {
      boolean var2 = me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "module");
      me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var3 = param1.an();
      java.util.ArrayList var4 = new java.util.ArrayList();
      boolean var5 = false;
      try {
         java.lang.Class<?> var6 = java.lang.Class.forName("me.octo.client." + me.octo.client.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + ":" + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":13NNY5UCK5D!CK"))), false, (java.lang.ClassLoader)me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         java.lang.reflect.Field var7 = var6.getDeclaredField(me.octo.client.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.a(new java.util.Random(me.octo.client.utils.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.a(me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + ":" + me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll + ":L0RY1SC00L229428!@#"))));
         var7.setAccessible(true);
         java.lang.Object var12 = var7.get((java.lang.Object)null);
         kotlin.jvm.internal.Intrinsics.checkNotNull(var12, "null cannot be cast to non-null type kotlin.Int");
         int var8 = ((java.lang.Integer)var12).intValue();
         var5 = var8 == me.octo.client.IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.b();
      } catch (java.lang.Exception var9) {
      }
      for (int var10 = 0; var10 < var3.length; var10++) {
         me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var11 = var3[var10];
         if (!var2 && (me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII || !var11.c() || var5)) {
            var4.add(var11.h());
         }
      }
      return (me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[])((java.util.Collection)var4).toArray(new me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[0]);
   }

   @NotNull
   default lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] var2,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var3,
      int var4,
      int var5,
      int var6
   ) {
      short var10001 = 23945;
      short var10002 = -28041;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      var10001 = 23950;
      var10002 = 13914;
      Intrinsics.checkNotNullParameter(var2, "settings");
      int var10000 = ((me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b()) ? 1 : 0);
      var10002 = 23949;
      short var10003 = -7042;
      Intrinsics.checkNotNullParameter(var3, "resolution");
      boolean var7 = (var10000 != 0);
      var10000 = var2.length;
      if (var7) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var4, null);
      } else {
         IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var8 = this.m();
         float var9 = llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(var8);
         if (var9 <= 0.0F) {
            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var4, null);
         } else {
            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var10 = null;
            int var11 = var4;
            float var12 = RangesKt.coerceAtMost(0.6F / RangesKt.coerceAtLeast(var2.length, 1), 0.12F);
            int var13 = 0;
            int var14 = var2.length;

            while (var13 < var14) {
               IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var15 = var2[var13];
               if (var7) {
                  if (var15.c().b()) {
                     float var16 = RangesKt.coerceAtMost(var13 * var12, 0.85F);
                     float var17 = RangesKt.coerceIn((var9 - var16) / (1.0F - var16), 0.0F, 1.0F);
                     float var18 = var17 * var17 * (3.0F - 2.0F * var17);
                     lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                     lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .b(var18);
                     lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll var19 = var15.a(var1, var3, var11, var5, var6);
                     lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                     var10000 = ((var19.c()) ? 1 : 0);
                     label45:
                     if (var7) {
                        if (var10000 != 0) {
                           float var25;
                           var10000 = (var25 = var18 - 0.9F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
                           if (!var7) {
                              break label45;
                           }

                           if (var10000 > 0) {
                              var10 = var19.b();
                           }
                        }

                        var10000 = var19.a() + 7;
                     }

                     var11 = var10000;
                  }

                  var13++;
               }

               if (!var7) {
                  break;
               }
            }

            return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var11, var10);
         }
      }
   }

   @NotNull
   default lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] var2,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var3,
      int var4,
      int var5,
      int var6,
      float var7
   ) {
      short var10001 = 23937;
      short var10002 = 13349;
      Intrinsics.checkNotNullParameter(var1, "drawContext");
      int var10000 = ((me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b()) ? 1 : 0);
      var10002 = 23940;
      short var10003 = -9772;
      Intrinsics.checkNotNullParameter(var2, "settings");
      boolean var8 = (var10000 != 0);
      var10001 = 23949;
      var10002 = -7042;
      Intrinsics.checkNotNullParameter(var3, "resolution");
      var10000 = var2.length;
      if (var8) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      if (var10000 != 0) {
         return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var4, null);
      } else {
         IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var9 = null;
         int var10 = var4;
         int var11 = 0;
         int var12 = 0;
         int var13 = var2.length;

         while (var12 < var13) {
            IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var14 = var2[var12];
            if (var8) {
               label43:
               if (var14.c().b()) {
                  float var15 = var11 * 0.08F;
                  float var16 = RangesKt.coerceIn((var7 - var15) / (1.0F - var15), 0.0F, 1.0F);
                  float var26 = var16;
                  if (var8) {
                     if (var16 <= 0.01F) {
                        var11++;
                        if (var8) {
                           break label43;
                        }
                     }

                     var26 = IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .D(var16);
                  }

                  float var17;
                  var17 = var26;
                  float var18 = 0.6F + 0.4F * var17;
                  float var19 = var16 * var7;
                  float var20 = (1.0F - var17) * 30.0F;
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
                  float var21 = var3.c() + var3.g() / 2;
                  float var22 = var10 + 20.0F;
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var21, var22);
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var18, var18);
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(0.0F, var20);
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(-var21, -var22);
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .b(var19);
                  lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll var23 = var14.a(var1, var3, var10, var5, var6);
                  lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
                  var10000 = ((var23.c()) ? 1 : 0);
                  label50:
                  if (var8) {
                     if (var10000 != 0) {
                        float var31;
                        var10000 = (var31 = var19 - 0.8F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
                        if (!var8) {
                           break label50;
                        }

                        if (var10000 > 0) {
                           var9 = var23.b();
                        }
                     }

                     var10000 = var23.a() - var10;
                  }

                  int var24 = var10000;
                  var10 += (int)(var24 * var17) + 10;
                  var11++;
               }

               var12++;
            }

            if (!var8) {
               break;
            }
         }

         return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var10, var9);
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String[] d_arr_init() {
      String[] var5 = new String[16];
      var5[0] = "\127\116\045\176\145\115\351\310\036\325\024\030\032\102\115\342\354\040\244\071\032\154\231\141\170\341\240\361\351\361\212\377\304\242\022\147\034\116\310\273\367\344\161\366\304\133\214";
      var5[1] = "\166\224\200\313\013\247\323\323\252\316\113\277\333\170\065";
      var5[2] = "\057\004\214\075\002\063\143\266";
      var5[3] = "\152\172\003\026\173\034\335\244\153\040\163\142\334\303\325";
      var5[4] = "\064\210\313\206\026\371\343\153\165\166\324\312\155\024\355\256\067\200\231\066";
      var5[5] = "\363\200\061\266\127\041\177\226\172\370";
      var5[6] = "\006\301\144\317\010\107";
      var5[7] = "\270\231\236\170\335\371\376\311\031\273\236";
      var5[8] = "\363\071\027\232\161\307\015\050";
      var5[9] = "\124\206\144\166\004\070\340\323\375\375\331\073\021\332\257";
      var5[10] = "\232\167\367\031\172\235";
      var5[11] = "\213\072\076\341\266\313\103\313\375\123";
      var5[12] = "\156\044\200\023\177\113\316\075\320\274\140\223\373\077\077\313\155\054\322\243";
      var5[13] = "\131\151\344\232\135\321\356\133\376\247\010\126\231\213\075\333\342\007\145\335\042\360\236\362\230\223\274\277\152\070\372\306\312\205\323\203\044\322\317\050\027\226\155\270\107\222\374";
      var5[14] = "\066\037\050\105\215\136\321\037\333\144\035\010\211\274\274";
      var5[15] = "\177\104\146\303\302\216\035\047\145\146\021";
      return var5;
   }



   private static String c(int var0, int var1) {
      int var2 = (var0 ^ 23942) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 31;
            case 1 -> 51;
            case 2 -> 238;
            case 3 -> 122;
            case 4 -> 86;
            case 5 -> 48;
            case 6 -> 199;
            case 7 -> 207;
            case 8 -> 57;
            case 9 -> 95;
            case 10 -> 192;
            case 11 -> 36;
            case 12 -> 220;
            case 13 -> 90;
            case 14 -> 114;
            case 15 -> 191;
            case 16 -> 110;
            case 17 -> 111;
            case 18 -> 130;
            case 19 -> 52;
            case 20 -> 223;
            case 21 -> 171;
            case 22 -> 88;
            case 23 -> 59;
            case 24 -> 132;
            case 25 -> 128;
            case 26 -> 19;
            case 27 -> 179;
            case 28 -> 70;
            case 29 -> 16;
            case 30 -> 62;
            case 31 -> 11;
            case 32 -> 174;
            case 33 -> 172;
            case 34 -> 67;
            case 35 -> 165;
            case 36 -> 28;
            case 37 -> 119;
            case 38 -> 231;
            case 39 -> 40;
            case 40 -> 145;
            case 41 -> 112;
            case 42 -> 85;
            case 43 -> 143;
            case 44 -> 149;
            case 45 -> 139;
            case 46 -> 102;
            case 47 -> 120;
            case 48 -> 103;
            case 49 -> 32;
            case 50 -> 222;
            case 51 -> 202;
            case 52 -> 72;
            case 53 -> 177;
            case 54 -> 178;
            case 55 -> 146;
            case 56 -> 65;
            case 57 -> 66;
            case 58 -> 185;
            case 59 -> 200;
            case 60 -> 195;
            case 61 -> 205;
            case 62 -> 184;
            case 63 -> 55;
            case 64 -> 230;
            case 65 -> 37;
            case 66 -> 83;
            case 67 -> 7;
            case 68 -> 24;
            case 69 -> 255;
            case 70 -> 64;
            case 71 -> 115;
            case 72 -> 180;
            case 73 -> 211;
            case 74 -> 250;
            case 75 -> 229;
            case 76 -> 247;
            case 77 -> 44;
            case 78 -> 242;
            case 79 -> 107;
            case 80 -> 170;
            case 81 -> 248;
            case 82 -> 155;
            case 83 -> 53;
            case 84 -> 104;
            case 85 -> 25;
            case 86 -> 126;
            case 87 -> 253;
            case 88 -> 91;
            case 89 -> 153;
            case 90 -> 29;
            case 91 -> 206;
            case 92 -> 94;
            case 93 -> 246;
            case 94 -> 99;
            case 95 -> 20;
            case 96 -> 144;
            case 97 -> 82;
            case 98 -> 6;
            case 99 -> 105;
            case 100 -> 217;
            case 101 -> 168;
            case 102 -> 157;
            case 103 -> 134;
            case 104 -> 106;
            case 105 -> 42;
            case 106 -> 226;
            case 107 -> 254;
            case 108 -> 158;
            case 109 -> 17;
            case 110 -> 113;
            case 111 -> 14;
            case 112 -> 164;
            case 113 -> 71;
            case 114 -> 9;
            case 115 -> 43;
            case 116 -> 137;
            case 117 -> 27;
            case 118 -> 38;
            case 119 -> 162;
            case 120 -> 141;
            case 121 -> 77;
            case 122 -> 239;
            case 123 -> 161;
            case 124 -> 190;
            case 125 -> 227;
            case 126 -> 121;
            case 127 -> 92;
            case 128 -> 3;
            case 129 -> 10;
            case 130 -> 108;
            case 131 -> 39;
            case 132 -> 117;
            case 133 -> 23;
            case 134 -> 68;
            case 135 -> 81;
            case 136 -> 100;
            case 137 -> 129;
            case 138 -> 182;
            case 139 -> 133;
            case 140 -> 173;
            case 141 -> 244;
            case 142 -> 156;
            case 143 -> 60;
            case 144 -> 54;
            case 145 -> 140;
            case 146 -> 237;
            case 147 -> 125;
            case 148 -> 138;
            case 149 -> 136;
            case 150 -> 97;
            case 151 -> 80;
            case 152 -> 181;
            case 153 -> 5;
            case 154 -> 166;
            case 155 -> 50;
            case 156 -> 87;
            case 157 -> 34;
            case 158 -> 116;
            case 159 -> 152;
            case 160 -> 167;
            case 161 -> 61;
            case 162 -> 21;
            case 163 -> 150;
            case 164 -> 131;
            case 165 -> 109;
            case 166 -> 89;
            case 167 -> 135;
            case 168 -> 169;
            case 169 -> 232;
            case 170 -> 194;
            case 171 -> 2;
            case 172 -> 8;
            case 173 -> 18;
            case 174 -> 78;
            case 175 -> 196;
            case 176 -> 41;
            case 177 -> 69;
            case 178 -> 209;
            case 179 -> 118;
            case 180 -> 123;
            case 181 -> 186;
            case 182 -> 93;
            case 183 -> 188;
            case 184 -> 73;
            case 185 -> 45;
            case 186 -> 142;
            case 187 -> 219;
            case 188 -> 201;
            case 189 -> 98;
            case 190 -> 56;
            case 191 -> 127;
            case 192 -> 183;
            case 193 -> 101;
            case 194 -> 47;
            case 195 -> 212;
            case 196 -> 13;
            case 197 -> 22;
            case 198 -> 243;
            case 199 -> 84;
            case 200 -> 147;
            case 201 -> 245;
            case 202 -> 198;
            case 203 -> 4;
            case 204 -> 151;
            case 205 -> 221;
            case 206 -> 163;
            case 207 -> 203;
            case 208 -> 252;
            case 209 -> 215;
            case 210 -> 249;
            case 211 -> 228;
            case 212 -> 234;
            case 213 -> 1;
            case 214 -> 12;
            case 215 -> 208;
            case 216 -> 160;
            case 217 -> 189;
            case 218 -> 154;
            case 219 -> 75;
            case 220 -> 76;
            case 221 -> 235;
            case 222 -> 74;
            case 223 -> 213;
            case 224 -> 175;
            case 225 -> 210;
            case 226 -> 79;
            case 227 -> 159;
            case 228 -> 236;
            case 229 -> 225;
            case 230 -> 49;
            case 231 -> 193;
            case 232 -> 204;
            case 233 -> 148;
            case 234 -> 58;
            case 235 -> 63;
            case 236 -> 46;
            case 237 -> 240;
            case 238 -> 26;
            case 239 -> 216;
            case 240 -> 0;
            case 241 -> 96;
            case 242 -> 33;
            case 243 -> 218;
            case 244 -> 30;
            case 245 -> 224;
            case 246 -> 251;
            case 247 -> 124;
            case 248 -> 241;
            case 249 -> 197;
            case 250 -> 35;
            case 251 -> 176;
            case 252 -> 187;
            case 253 -> 214;
            case 254 -> 233;
            default -> 15;
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
      private static String[] a;
      private static String[] b;

      @Deprecated
      public static int a(@NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0) {
         return var0.n();
      }

      @Deprecated
      public static int a(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1
      ) {
         short var10001 = 21493;
         short var10002 = 23724;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         return var0.b(var1);
      }

      @Deprecated
      public static int b(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1
      ) {
         short var10001 = 21493;
         short var10002 = 23724;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         return var0.c(var1);
      }

      @Deprecated
      @NotNull
      public static IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] a(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         @NotNull IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var1
      ) {
         short var10001 = 21490;
         short var10002 = -4318;
         Intrinsics.checkNotNullParameter(var1, "module");
         return var0.a(var1);
      }

      @Deprecated
      @NotNull
      public static IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] b(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         @NotNull IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll var1
      ) {
         short var10001 = 21489;
         short var10002 = 18117;
         Intrinsics.checkNotNullParameter(var1, "module");
         return var0.b(var1);
      }

      @Deprecated
      @NotNull
      public static lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         @NotNull GuiGraphicsExtractor var1,
         @NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] var2,
         @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var3,
         int var4,
         int var5,
         int var6
      ) {
         boolean var10000 = me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         short var10002 = 21492;
         short var10003 = -24060;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         var10002 = 21495;
         var10003 = -5042;
         Intrinsics.checkNotNullParameter(var2, "settings");
         var10002 = 21493;
         var10003 = 23724;
         Intrinsics.checkNotNullParameter(var3, "resolution");
         boolean var7 = var10000;
         lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll var8 = var0.a(var1, var2, var3, var4, var5, var6);
         if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
            me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
               !var7
            );
         }

         return var8;
      }

      @Deprecated
      @NotNull
      public static lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         @NotNull GuiGraphicsExtractor var1,
         @NotNull IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] var2,
         @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var3,
         int var4,
         int var5,
         int var6,
         float var7
      ) {
         boolean var10000 = me.octo.client.llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b();
         short var10002 = 21488;
         short var10003 = 5888;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         var10002 = 21494;
         var10003 = -472;
         Intrinsics.checkNotNullParameter(var2, "settings");
         boolean var8 = var10000;
         short var10001 = 21491;
         var10002 = -18459;
         Intrinsics.checkNotNullParameter(var3, "resolution");
         lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll var9 = var0.a(var1, var2, var3, var4, var5, var6, var7);
         if (!var8) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
               new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
            );
         }

         return var9;
      }

      @Deprecated
      public static float b(@NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0) {
         return var0.a();
      }

      @Deprecated
      public static int c(@NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0) {
         return var0.b();
      }

      @Deprecated
      public static int c(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1
      ) {
         short var10001 = 21493;
         short var10002 = 23724;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         return var0.a(var1);
      }

      @Deprecated
      public static boolean a(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         @NotNull GuiGraphicsExtractor var1,
         int var2,
         int var3,
         int var4,
         int var5,
         float var6
      ) {
         short var10001 = 21492;
         short var10002 = -24060;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         return var0.a(var1, var2, var3, var4, var5, var6);
      }

      @Deprecated
      public static boolean b(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         @NotNull GuiGraphicsExtractor var1,
         int var2,
         int var3,
         int var4,
         int var5,
         float var6
      ) {
         short var10001 = 21492;
         short var10002 = -24060;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         return var0.b(var1, var2, var3, var4, var5, var6);
      }

      @Deprecated
      public static boolean a(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         @NotNull GuiGraphicsExtractor var1,
         int var2,
         int var3,
         float var4,
         float var5,
         float var6,
         float var7
      ) {
         short var10001 = 21492;
         short var10002 = -24060;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         return var0.a(var1, var2, var3, var4, var5, var6, var7);
      }

      @Deprecated
      public static void a(@NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0, char var1, int var2) {
         var0.a(var1, var2);
      }

      @Deprecated
      public static void d(@NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0) {
         var0.d();
      }

      @Deprecated
      public static boolean a(
         @NotNull IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl var0,
         int var1,
         int var2,
         int var3,
         int var4,
         int var5,
         int var6
      ) {
         return var0.a(var1, var2, var3, var4, var5, var6);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[8];
         int var3 = 0;
         String var2 = "\u0089,\u0002g\u000f\u0012\u0004^\b~Wü\bÐÿÿã\u000bM¬z\u0081\u009d¬0¯y-Í\n4\u008a\u0093¨ß\u0088¨o9\u009d\u0006:R¹âo\u0088\n¥Õ¡C\u0099õ`À h";
         int var4 = "\u0089,\u0002g\u000f\u0012\u0004^\b~Wü\bÐÿÿã\u000bM¬z\u0081\u009d¬0¯y-Í\n4\u008a\u0093¨ß\u0088¨o9\u009d\u0006:R¹âo\u0088\n¥Õ¡C\u0099õ`À h"
            .length();
         char var1 = '\b';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 99;
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
                        case 0 -> 3;
                        case 1 -> 90;
                        case 2 -> 53;
                        case 3 -> 27;
                        case 4 -> 117;
                        case 5 -> 6;
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
                        b = new String[8];
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

                     var2 = "o\u0017#ë«üë¸\u001fÒ\u001c\u0006`ºïâ¸\u0095";
                     var4 = "o\u0017#ë«üë¸\u001fÒ\u001c\u0006`ºïâ¸\u0095".length();
                     var1 = 11;
                     var8 = -1;
               }

               var10000 = 16;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 21494) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 95;
               case 1 -> 103;
               case 2 -> 141;
               case 3 -> 250;
               case 4 -> 221;
               case 5 -> 163;
               case 6 -> 138;
               case 7 -> 159;
               case 8 -> 236;
               case 9 -> 73;
               case 10 -> 69;
               case 11 -> 247;
               case 12 -> 212;
               case 13 -> 186;
               case 14 -> 2;
               case 15 -> 16;
               case 16 -> 165;
               case 17 -> 112;
               case 18 -> 118;
               case 19 -> 68;
               case 20 -> 206;
               case 21 -> 109;
               case 22 -> 192;
               case 23 -> 3;
               case 24 -> 51;
               case 25 -> 1;
               case 26 -> 22;
               case 27 -> 76;
               case 28 -> 11;
               case 29 -> 249;
               case 30 -> 225;
               case 31 -> 238;
               case 32 -> 99;
               case 33 -> 253;
               case 34 -> 70;
               case 35 -> 149;
               case 36 -> 67;
               case 37 -> 41;
               case 38 -> 64;
               case 39 -> 208;
               case 40 -> 222;
               case 41 -> 111;
               case 42 -> 115;
               case 43 -> 123;
               case 44 -> 185;
               case 45 -> 187;
               case 46 -> 96;
               case 47 -> 0;
               case 48 -> 28;
               case 49 -> 201;
               case 50 -> 252;
               case 51 -> 108;
               case 52 -> 136;
               case 53 -> 155;
               case 54 -> 60;
               case 55 -> 20;
               case 56 -> 81;
               case 57 -> 5;
               case 58 -> 171;
               case 59 -> 21;
               case 60 -> 48;
               case 61 -> 127;
               case 62 -> 219;
               case 63 -> 178;
               case 64 -> 183;
               case 65 -> 24;
               case 66 -> 106;
               case 67 -> 113;
               case 68 -> 233;
               case 69 -> 71;
               case 70 -> 175;
               case 71 -> 245;
               case 72 -> 63;
               case 73 -> 105;
               case 74 -> 19;
               case 75 -> 205;
               case 76 -> 29;
               case 77 -> 10;
               case 78 -> 49;
               case 79 -> 45;
               case 80 -> 128;
               case 81 -> 182;
               case 82 -> 234;
               case 83 -> 116;
               case 84 -> 134;
               case 85 -> 195;
               case 86 -> 47;
               case 87 -> 104;
               case 88 -> 131;
               case 89 -> 62;
               case 90 -> 235;
               case 91 -> 117;
               case 92 -> 121;
               case 93 -> 156;
               case 94 -> 107;
               case 95 -> 241;
               case 96 -> 145;
               case 97 -> 200;
               case 98 -> 198;
               case 99 -> 53;
               case 100 -> 174;
               case 101 -> 8;
               case 102 -> 15;
               case 103 -> 188;
               case 104 -> 248;
               case 105 -> 153;
               case 106 -> 244;
               case 107 -> 92;
               case 108 -> 137;
               case 109 -> 210;
               case 110 -> 27;
               case 111 -> 202;
               case 112 -> 216;
               case 113 -> 211;
               case 114 -> 215;
               case 115 -> 167;
               case 116 -> 173;
               case 117 -> 80;
               case 118 -> 17;
               case 119 -> 251;
               case 120 -> 55;
               case 121 -> 194;
               case 122 -> 169;
               case 123 -> 157;
               case 124 -> 232;
               case 125 -> 239;
               case 126 -> 227;
               case 127 -> 144;
               case 128 -> 72;
               case 129 -> 126;
               case 130 -> 177;
               case 131 -> 143;
               case 132 -> 33;
               case 133 -> 189;
               case 134 -> 229;
               case 135 -> 6;
               case 136 -> 56;
               case 137 -> 162;
               case 138 -> 190;
               case 139 -> 237;
               case 140 -> 132;
               case 141 -> 191;
               case 142 -> 166;
               case 143 -> 91;
               case 144 -> 94;
               case 145 -> 37;
               case 146 -> 180;
               case 147 -> 231;
               case 148 -> 30;
               case 149 -> 97;
               case 150 -> 243;
               case 151 -> 43;
               case 152 -> 34;
               case 153 -> 226;
               case 154 -> 86;
               case 155 -> 220;
               case 156 -> 203;
               case 157 -> 193;
               case 158 -> 13;
               case 159 -> 18;
               case 160 -> 217;
               case 161 -> 36;
               case 162 -> 39;
               case 163 -> 88;
               case 164 -> 209;
               case 165 -> 120;
               case 166 -> 57;
               case 167 -> 14;
               case 168 -> 196;
               case 169 -> 152;
               case 170 -> 110;
               case 171 -> 223;
               case 172 -> 59;
               case 173 -> 12;
               case 174 -> 125;
               case 175 -> 172;
               case 176 -> 170;
               case 177 -> 147;
               case 178 -> 150;
               case 179 -> 124;
               case 180 -> 130;
               case 181 -> 158;
               case 182 -> 197;
               case 183 -> 228;
               case 184 -> 151;
               case 185 -> 214;
               case 186 -> 31;
               case 187 -> 65;
               case 188 -> 181;
               case 189 -> 85;
               case 190 -> 207;
               case 191 -> 52;
               case 192 -> 58;
               case 193 -> 84;
               case 194 -> 44;
               case 195 -> 42;
               case 196 -> 176;
               case 197 -> 46;
               case 198 -> 38;
               case 199 -> 100;
               case 200 -> 23;
               case 201 -> 90;
               case 202 -> 82;
               case 203 -> 184;
               case 204 -> 35;
               case 205 -> 240;
               case 206 -> 230;
               case 207 -> 75;
               case 208 -> 102;
               case 209 -> 224;
               case 210 -> 89;
               case 211 -> 83;
               case 212 -> 79;
               case 213 -> 25;
               case 214 -> 168;
               case 215 -> 139;
               case 216 -> 129;
               case 217 -> 154;
               case 218 -> 146;
               case 219 -> 101;
               case 220 -> 7;
               case 221 -> 218;
               case 222 -> 199;
               case 223 -> 122;
               case 224 -> 66;
               case 225 -> 114;
               case 226 -> 93;
               case 227 -> 246;
               case 228 -> 161;
               case 229 -> 4;
               case 230 -> 242;
               case 231 -> 40;
               case 232 -> 255;
               case 233 -> 142;
               case 234 -> 50;
               case 235 -> 213;
               case 236 -> 26;
               case 237 -> 204;
               case 238 -> 98;
               case 239 -> 160;
               case 240 -> 78;
               case 241 -> 9;
               case 242 -> 87;
               case 243 -> 179;
               case 244 -> 148;
               case 245 -> 119;
               case 246 -> 61;
               case 247 -> 140;
               case 248 -> 164;
               case 249 -> 74;
               case 250 -> 133;
               case 251 -> 77;
               case 252 -> 32;
               case 253 -> 54;
               case 254 -> 135;
               default -> 254;
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

   public static boolean a(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, int p2, int p3, int p4, int p5, int p6, int p7) {
      return p1.a(p2, p3, p4, p5, p6, p7);
   }
   public static boolean a(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, net.minecraft.client.gui.GuiGraphicsExtractor p2, int p3, int p4, float p5, float p6, float p7, float p8) {
      return p1.a(p2, p3, p4, p5, p6, p7, p8);
   }
   public static boolean a(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, net.minecraft.client.gui.GuiGraphicsExtractor p2, int p3, int p4, int p5, int p6, float p7) {
      return p1.a(p2, p3, p4, p5, p6, p7);
   }
   public static boolean b(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, net.minecraft.client.gui.GuiGraphicsExtractor p2, int p3, int p4, int p5, int p6, float p7) {
      return p1.b(p2, p3, p4, p5, p6, p7);
   }
   public static float b(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1) {
      return p1.a();
   }
   public static int a(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1) {
      return p1.n();
   }
   public static int a(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p2) {
      return p1.b(p2);
   }
   public static int b(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p2) {
      return p1.c(p2);
   }
   public static int c(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1) {
      return p1.b();
   }
   public static int c(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p2) {
      return p1.a(p2);
   }
   public static me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] a(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, me.octo.client.IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll p2) {
      return p1.a(p2);
   }
   public static me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] b(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, me.octo.client.IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll p2) {
      return p1.b(p2);
   }
   public static me.octo.client.lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, net.minecraft.client.gui.GuiGraphicsExtractor p2, me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] p3, me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p4, int p5, int p6, int p7) {
      return p1.a(p2, p3, p4, p5, p6, p7);
   }
   public static me.octo.client.lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, net.minecraft.client.gui.GuiGraphicsExtractor p2, me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] p3, me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p4, int p5, int p6, int p7, float p8) {
      return p1.a(p2, p3, p4, p5, p6, p7, p8);
   }
   public static void a(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1, char p2, int p3) {
      p1.a(p2, p3);
   }
   public static void d(me.octo.client.IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl p1) {
      p1.d();
   }
}
