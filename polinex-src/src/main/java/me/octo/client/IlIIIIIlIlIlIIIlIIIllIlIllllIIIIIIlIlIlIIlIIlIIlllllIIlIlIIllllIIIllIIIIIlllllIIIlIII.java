package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class IlIIIIIlIlIlIIIlIIIllIlIllllIIIIIIlIlIlIIlIIlIIlllllIIlIlIIllllIIIllIIIIIlllllIIIlIII
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl {
   @NotNull
   private final lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] d;
   private static String[] e;

   public IlIIIIIlIlIlIIIlIIIllIlIllllIIIIIIlIlIlIIlIIlIIlllllIIlIlIIllllIIIllIIIIIlllllIIIlIII(
      @NotNull lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll var1
   ) {
      short var10001 = -5875;
      short var10002 = 192;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   private final String f() {
      String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      short var10001 = -5876;
      short var10002 = -4246;
      return "boolset:" + var10000;
   }

   private final String g() {
      String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      short var10001 = -5877;
      short var10002 = -28139;
      return "boolsetknob:" + var10000;
   }

   private final String h() {
      String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Z();
      short var10001 = -5874;
      short var10002 = 4034;
      return "boolsethover:" + var10000;
   }

   @NotNull
   @Override
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor var1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var2,
      int var3,
      int var4,
      int var5
   ) {
      Object var33 = null; // PX-FIX
      Object var31 = null; // PX-FIX
      String[] var6;
      float var29;
      label95: {
         short var10001 = -5873;
         short var10002 = -16138;
         Intrinsics.checkNotNullParameter(var1, "drawContext");
         var10001 = -5879;
         var10002 = 18937;
         Intrinsics.checkNotNullParameter(var2, "resolution");
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         long var7 = System.currentTimeMillis() - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         var6 = var10000;
         int var28 = ((this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ae()) ? 1 : 0);
         if (var6 != null) {
            if (var28 != 0) {
               long var30 = var7;
               if (var6 != null) {
                  if (var7 >= 250L) {
                     var29 = 1.0F;
                     break label95;
                  }

                  var30 = var7;
               }

               var29 = IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m((float)var30 / 250.0F);
               break label95;
            }

            long var37;
            var28 = (var37 = var7 - 250L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
         }

         var29 = var28 >= 0 ? 0.0F : 1.0F - IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.m((float)var7 / 250.0F);
      }

      float var9;
      llIIIlIIlllIlIlllllIIIlIlIIIllIIIIllIlIIIIIIIIlIllIIlIIllIlIIlllIlIIlIlIIIIIlIlIlIlIl var10;
      float var11;
      float var12;
      float var13;
      int var14;
      float var15;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var16;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var17;
      float var18;
      float var19;
      label84: {
         label98: {
            var9 = var29;
            var10 = null;
            var11 = 38.0F;
            var12 = 20.0F;
            var13 = var2.e() - 14.0F - var11;
            var14 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var1, (int)var2.c(), var3, (int)(var13 - 8));
            var15 = var3 + 18.0F;
            var16 = this.a(
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .q(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .r(),
               var9
            );
            var17 = this.a(
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .s(),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .t(),
               var9
            );
            var18 = var15 - var12 / 2.0F;
            var19 = RangesKt.coerceAtMost(
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .aq(),
               var12 / 2.0F
            );
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var13;
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var18;
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var11;
            this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var12;
            var31 = var6 == null
               || (var4 >= var13 - 2 && var4 <= var13 + var11 + 2
                  && var5 >= var18 - 2 && var5 <= var18 + var12 + 2)
               ? 1
               : 0;
         }
      }

      int var20 =((Integer)( var31));
      float var21 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         this.h(),
         (var20 != 0),
         0.0F,
         4,
         null
      );
      var29 = var21;
      float var35 = 0.01F;
      if (var6 != null) {
         if (var21 > 0.01F) {
            me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.a(
               me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
               var13,
               var18,
               var11,
               var12,
               var19,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ah(),
               var21 * 0.6F,
               2.5F);
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var13, var18, var11, var12, var16, var19);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var13,
            var18,
            var11,
            var12,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .u()
               .a(0.4F),
            var19
         );
         me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.f(), var13, var18, var11, var12, var19);
         var29 = var12 / 2.0F;
         var35 = 3.0F;
      }

      float var22 = var29 - var35;
      float var23 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.c(
         var13 + var22 + 3.0F, var13 + var11 - var22 - 3.0F, var9
      );
      float var24 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.g(), 0.2F);
      float var25 = var22 * var24;
      float var26 = RangesKt.coerceAtMost(
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq(),
         var25
      );
      label62:
      if (var6 != null) {
         if (var9 > 0.05F) {
            int var27 = RangesKt.coerceIn(
               (int)(
                  (
                        1.0F
                           - me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .b(this.g())
                     )
                     * 50.0F
                     * var9
               ),
               0,
               255
            );
            if (var27 > 0) {
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                  var23,
                  var15,
                  var25 * 1.22F,
                  IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .ah()
                     .a(var27)
               );
            }
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var23 - var25, var15 - var25, var25 * 2.0F, var25 * 2.0F, var17, var26
         );
         var33 = var20;
      }

      if (var6 != null) {
         var33 = var20;
      }

      if ((var6 == null || var20 != 0) && var5 > var2.d() + 5) {
         var10 = this;
         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
      }

      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var14 - 3, var10);
   }

   private final me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var1,
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      float var3
   ) {
      float var4 = RangesKt.coerceIn(var3, 0.0F, 1.0F);
      return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(
         (int)(var1.a() + (var2.a() - var1.a()) * var4),
         (int)(var1.b() + (var2.b() - var1.b()) * var4),
         (int)(var1.c() + (var2.c() - var1.c()) * var4),
         (int)(var1.d() + (var2.d() - var1.d()) * var4)
      );
   }

   @Override
   public int a(@NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var1) {
      String[] var2;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var6;
      label31: {
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         short var10002 = -5880;
         short var10003 = 1476;
         Intrinsics.checkNotNullParameter(var1, "resolution");
         var2 = var10000;
         lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll var5 = var4;
         if (var2 != null) {
            if (!(var4 instanceof IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)) {
               var6 = null;
               break label31;
            }

            var5 = var4;
         }

         var6 = (IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll)var5;
      }

      if (var6 == null) {
         return 28;
      } else {
         IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll var3 = var6;
         int var7 = var3.ab().length();
         if (var2 != null) {
            var7 = var7 > 0 ? 1 : 0;
         }

         return var7 != 0 ? 38 : 28;
      }
   }

   @NotNull
   @Override
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Override
   public void e() {
      String[] var1;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2;
      float var7;
      label29: {
         String[] var10000 = lllIIllIlllIIlllllllIIlIllllllIIlIlIIlIIIlIlllIllIlIlIlIllllIlIlIIllIlIIIlIllllIlIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.af();
         var1 = var10000;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = System.currentTimeMillis();
         var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ae()
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .t()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .r();
         var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         float var10001 = 0.0F;
         if (var1 != null) {
            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl > 0.0F) {
               var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               break label29;
            }

            var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            var10001 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll / 2.0F;
         }

         var7 += var10001;
      }

      float var3;
      label23: {
         var3 = var7;
         var7 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         float var10 = 0.0F;
         if (var1 != null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI > 0.0F) {
               var7 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               break label23;
            }

            var7 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var10 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll / 2.0F;
         }

         var7 += var10;
      }

      float var4 = var7;
      float var5 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
               var3,
               var4,
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            )
         + 4.0F;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.f(), var3, var4, var2.a(90), var5, 170L);
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(this.g());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "\u0012 \u001d3¬Y?\bi\u0085ZÄ&·$¾\u000bÍq\u0006ÿR¢\u0086\u0019\u0080\u00977\rÆ\u001c¯÷\u0098Ñó }!Òr\u0002\n\u008f,\u0088¹ük\u0083ds\u0090";
      int var4 = "\u0012 \u001d3¬Y?\bi\u0085ZÄ&·$¾\u000bÍq\u0006ÿR¢\u0086\u0019\u0080\u00977\rÆ\u001c¯÷\u0098Ñó }!Òr\u0002\n\u008f,\u0088¹ük\u0083ds\u0090"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 75;
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
                     case 0 -> 80;
                     case 1 -> 52;
                     case 2 -> 30;
                     case 3 -> 62;
                     case 4 -> 125;
                     case 5 -> 78;
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
                     d = var5;
                     e = new String[7];
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

                  var2 = "¨\u0004\u0087Wö])IÍÞ\f/Ëyæ©\u0018>ñ.\u008au\u009e";
                  var4 = "¨\u0004\u0087Wö])IÍÞ\f/Ëyæ©\u0018>ñ.\u008au\u009e".length();
                  var1 = '\n';
                  var8 = -1;
            }

            var10000 = 101;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -5875) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 91;
            case 1 -> 23;
            case 2 -> 2;
            case 3 -> 219;
            case 4 -> 236;
            case 5 -> 52;
            case 6 -> 172;
            case 7 -> 77;
            case 8 -> 164;
            case 9 -> 70;
            case 10 -> 92;
            case 11 -> 61;
            case 12 -> 145;
            case 13 -> 200;
            case 14 -> 126;
            case 15 -> 183;
            case 16 -> 64;
            case 17 -> 87;
            case 18 -> 175;
            case 19 -> 243;
            case 20 -> 211;
            case 21 -> 242;
            case 22 -> 153;
            case 23 -> 25;
            case 24 -> 155;
            case 25 -> 46;
            case 26 -> 157;
            case 27 -> 241;
            case 28 -> 253;
            case 29 -> 193;
            case 30 -> 82;
            case 31 -> 196;
            case 32 -> 132;
            case 33 -> 154;
            case 34 -> 75;
            case 35 -> 101;
            case 36 -> 38;
            case 37 -> 50;
            case 38 -> 74;
            case 39 -> 158;
            case 40 -> 248;
            case 41 -> 185;
            case 42 -> 80;
            case 43 -> 18;
            case 44 -> 106;
            case 45 -> 95;
            case 46 -> 221;
            case 47 -> 215;
            case 48 -> 39;
            case 49 -> 32;
            case 50 -> 134;
            case 51 -> 112;
            case 52 -> 9;
            case 53 -> 170;
            case 54 -> 227;
            case 55 -> 29;
            case 56 -> 160;
            case 57 -> 83;
            case 58 -> 60;
            case 59 -> 116;
            case 60 -> 184;
            case 61 -> 255;
            case 62 -> 212;
            case 63 -> 1;
            case 64 -> 239;
            case 65 -> 58;
            case 66 -> 146;
            case 67 -> 176;
            case 68 -> 186;
            case 69 -> 232;
            case 70 -> 163;
            case 71 -> 85;
            case 72 -> 123;
            case 73 -> 245;
            case 74 -> 84;
            case 75 -> 161;
            case 76 -> 26;
            case 77 -> 125;
            case 78 -> 234;
            case 79 -> 181;
            case 80 -> 37;
            case 81 -> 78;
            case 82 -> 113;
            case 83 -> 201;
            case 84 -> 168;
            case 85 -> 222;
            case 86 -> 118;
            case 87 -> 165;
            case 88 -> 171;
            case 89 -> 59;
            case 90 -> 103;
            case 91 -> 86;
            case 92 -> 224;
            case 93 -> 33;
            case 94 -> 115;
            case 95 -> 235;
            case 96 -> 104;
            case 97 -> 31;
            case 98 -> 137;
            case 99 -> 67;
            case 100 -> 178;
            case 101 -> 21;
            case 102 -> 208;
            case 103 -> 11;
            case 104 -> 10;
            case 105 -> 71;
            case 106 -> 15;
            case 107 -> 247;
            case 108 -> 128;
            case 109 -> 72;
            case 110 -> 189;
            case 111 -> 63;
            case 112 -> 149;
            case 113 -> 40;
            case 114 -> 90;
            case 115 -> 162;
            case 116 -> 144;
            case 117 -> 210;
            case 118 -> 166;
            case 119 -> 35;
            case 120 -> 96;
            case 121 -> 119;
            case 122 -> 150;
            case 123 -> 187;
            case 124 -> 182;
            case 125 -> 209;
            case 126 -> 8;
            case 127 -> 120;
            case 128 -> 41;
            case 129 -> 214;
            case 130 -> 231;
            case 131 -> 238;
            case 132 -> 199;
            case 133 -> 246;
            case 134 -> 177;
            case 135 -> 45;
            case 136 -> 109;
            case 137 -> 240;
            case 138 -> 62;
            case 139 -> 159;
            case 140 -> 156;
            case 141 -> 117;
            case 142 -> 65;
            case 143 -> 135;
            case 144 -> 28;
            case 145 -> 127;
            case 146 -> 206;
            case 147 -> 54;
            case 148 -> 19;
            case 149 -> 105;
            case 150 -> 217;
            case 151 -> 198;
            case 152 -> 195;
            case 153 -> 133;
            case 154 -> 12;
            case 155 -> 69;
            case 156 -> 124;
            case 157 -> 213;
            case 158 -> 55;
            case 159 -> 4;
            case 160 -> 43;
            case 161 -> 192;
            case 162 -> 204;
            case 163 -> 190;
            case 164 -> 22;
            case 165 -> 229;
            case 166 -> 143;
            case 167 -> 197;
            case 168 -> 53;
            case 169 -> 220;
            case 170 -> 233;
            case 171 -> 130;
            case 172 -> 93;
            case 173 -> 249;
            case 174 -> 237;
            case 175 -> 251;
            case 176 -> 16;
            case 177 -> 20;
            case 178 -> 98;
            case 179 -> 36;
            case 180 -> 173;
            case 181 -> 167;
            case 182 -> 188;
            case 183 -> 76;
            case 184 -> 49;
            case 185 -> 13;
            case 186 -> 244;
            case 187 -> 228;
            case 188 -> 5;
            case 189 -> 230;
            case 190 -> 48;
            case 191 -> 180;
            case 192 -> 108;
            case 193 -> 226;
            case 194 -> 111;
            case 195 -> 97;
            case 196 -> 151;
            case 197 -> 30;
            case 198 -> 218;
            case 199 -> 252;
            case 200 -> 107;
            case 201 -> 139;
            case 202 -> 66;
            case 203 -> 129;
            case 204 -> 0;
            case 205 -> 89;
            case 206 -> 225;
            case 207 -> 141;
            case 208 -> 148;
            case 209 -> 51;
            case 210 -> 56;
            case 211 -> 191;
            case 212 -> 136;
            case 213 -> 138;
            case 214 -> 68;
            case 215 -> 94;
            case 216 -> 27;
            case 217 -> 99;
            case 218 -> 216;
            case 219 -> 131;
            case 220 -> 254;
            case 221 -> 3;
            case 222 -> 7;
            case 223 -> 47;
            case 224 -> 114;
            case 225 -> 202;
            case 226 -> 6;
            case 227 -> 250;
            case 228 -> 73;
            case 229 -> 14;
            case 230 -> 142;
            case 231 -> 203;
            case 232 -> 102;
            case 233 -> 121;
            case 234 -> 79;
            case 235 -> 122;
            case 236 -> 88;
            case 237 -> 81;
            case 238 -> 169;
            case 239 -> 57;
            case 240 -> 24;
            case 241 -> 44;
            case 242 -> 34;
            case 243 -> 140;
            case 244 -> 205;
            case 245 -> 207;
            case 246 -> 179;
            case 247 -> 42;
            case 248 -> 110;
            case 249 -> 152;
            case 250 -> 100;
            case 251 -> 174;
            case 252 -> 17;
            case 253 -> 223;
            case 254 -> 194;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }
   // --- Phase A L3: descriptor-exact synthetics restored from .analysis/me-octo-only.jar bytecode (javap -c -s, agent W9-1) ---
   public float a() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }
   public void a(char var1, int var2) {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2);
   }
   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6, var7);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(var1, var2, var3, var4, var5, var6);
   }
   public int b() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(var1, var2, var3, var4, var5, var6);
   }
   public void d() {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }
}
