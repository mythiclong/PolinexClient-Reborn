package me.octo.client;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;

public final class llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl
   implements IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl,
   IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
   @NotNull
   private final lIIlllIlIIIlIlIIllIlllIllllIlIIIIlllIIlIlIIllIlIIlIlIllIIlIIlllIlIlIllIllIlIIlIIlllll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private static llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] d;
   private static String[] e;

   public llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl(
      @NotNull lIIlllIlIIIlIlIIllIlllIllllIlIIIIlllIIlIlIIllIlIIlIlIllIIlIIlllIlIlIllIllIlIIlIIlllll var1
   ) {
      short var10001 = 14140;
      short var10002 = 3130;
      Intrinsics.checkNotNullParameter(var1, "setting");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 12.0F;
   }

   @NotNull
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor param1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll param2,
      int param3,
      int param4,
      int param5
   ) {
      Intrinsics.checkNotNullParameter(param1, "drawContext");
      Intrinsics.checkNotNullParameter(param2, "resolution");
      int[] var6 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      float var8 = param2.e() - 170.0F - 10.0F;
      int var9 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(
         param1, (int)param2.c(), param3, (int)(var8 - 150.0F)
      );
      int var10 = (var9 + param3) >> 1;
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K()),
         (int)(var8 - 130.0F),
         var10 - 8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(),
         false,
         16,
         null
      );
      float var11 = var8 - 75.0F;
      int var12 = var10 - 2;
      int var13 = this.a((int)var11, var12, param4, param5) ? 1 : 0;
      this.a(
         (int)var11,
         var12,
         "\u2212",
         var13 != 0,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            == IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      float var14 = 60.0F;
      float var15 = 26.0F;
      float var16 = var8 - var14 / 2.0F;
      float var17 = var10 - 13.0F;
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
          var16, var17 + 1.0F, var14, var15, new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 20), 6.0F
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var16,
         var17,
         var14,
         var15,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j(),
         6.0F
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var16,
         var17,
         var14,
         var15,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y().a(0.5F),
         6.0F
      );
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         .b(
            String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.M()),
            (int)var8,
            var10,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()
         );
      float var18 = var8 + 55.0F;
      int var19 = var10 - 2;
      int var20 = this.a((int)var18, var19, param4, param5) ? 1 : 0;
      this.a(
         (int)var18,
         var19,
         "+",
         var20 != 0,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            == IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(
         lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
         String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.L()),
         (int)(var8 + 85.0F),
         var10 - 8,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(),
         false,
         16,
         null
      );

      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var21 = null;
      if ((var13 != 0 || var20 != 0) && param5 > param2.d() + 100) {
         llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(true);
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var13 != 0
            ? IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            : IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var21 = this;
      }

      return new lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(
         var9, var21
      );
   }

   private final void a(int param1, int param2, String param3, boolean param4, boolean param5, long param6) {
      int[] var8 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      float var9 = param1 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      float var10 = param2 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      float var14 = var8 == null
         ? (param5 ? 1.1F : 1.0F)
         : (param5 ? 0.95F : (param4 ? 1.1F : 1.0F));
      float var15 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII * var14;
      if (var8 != null && param5) {
         long var16 = System.currentTimeMillis() - param6;
         if (var16 < 150L) {
            float var18 = RangesKt.coerceIn((float)var16 / 150.0F, 0.0F, 1.0F);
            float var19 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               * (1.0F + var18 * 0.8F);
            int var20 = (int)(60.0F * (1.0F - var18));
            lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var9, var10, var19, new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255, var20)
            );
         }
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var16;
      if (var8 == null) {
         var16 = param5
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.H().a(0.8F)
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.G();
      } else if (param5) {
         var16 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.H();
      } else {
         var16 = param4
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.H().a(0.8F)
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.G();
      }

      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9, var10 + 2.0F, var15, new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(0, 0, 0, 30)
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9, var10, var15, var16
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
         var9,
         var10,
         var15,
         1.2F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y().a(0.6F)
      );
      if (param4 || (var8 != null && param5)) {
         lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var9 - 3.0F,
            var10 - 3.0F,
            var15 * 0.5F,
            new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255, 30)
         );
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var17;
      if (var8 == null) {
         var17 = param5
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
      } else {
         var17 = param5 || param4
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
      }

      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         .b(
            param3,
            param1 + (int)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            param2 + (int)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            var17
         );
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l ()[I
      // 003: iload 1
      // 004: i2f
      // 005: aload 0
      // 006: getfield me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII F
      // 009: fadd
      // 00a: fstore 9
      // 00c: iload 2
      // 00d: i2f
      // 00e: aload 0
      // 00f: getfield me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII F
      // 012: fadd
      // 013: fstore 10
      // 015: fconst_1
      // 016: fstore 11
      // 018: ldc 1.1
      // 01a: fstore 12
      // 01c: astore 8
      // 01e: ldc 0.95
      // 020: fstore 13
      // 022: nop
      // 023: iload 5
      // 025: aload 8
      // 027: ifnull 03f
      // 02a: ifeq 03d
      // 02d: goto 034
      // 030: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 033: athrow
      // 034: fload 13
      // 036: goto 04d
      // 039: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 03c: athrow
      // 03d: iload 4
      // 03f: ifeq 04b
      // 042: fload 12
      // 044: goto 04d
      // 047: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 04a: athrow
      // 04b: fload 11
      // 04d: fstore 14
      // 04f: aload 0
      // 050: getfield me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII F
      // 053: fload 14
      // 055: fmul
      // 056: fstore 15
      // 058: iload 5
      // 05a: aload 8
      // 05c: ifnull 0ca
      // 05f: ifeq 0c7
      // 062: goto 069
      // 065: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 068: athrow
      // 069: invokestatic java/lang/System.currentTimeMillis ()J
      // 06c: lload 6
      // 06e: lsub
      // 06f: lstore 16
      // 071: lload 16
      // 073: ldc2_w 150
      // 076: lcmp
      // 077: aload 8
      // 079: ifnull 0ca
      // 07c: ifge 0c7
      // 07f: goto 086
      // 082: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 085: athrow
      // 086: lload 16
      // 088: l2f
      // 089: ldc 150.0
      // 08b: fdiv
      // 08c: fconst_0
      // 08d: fconst_1
      // 08e: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 091: fstore 18
      // 093: aload 0
      // 094: getfield me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII F
      // 097: fconst_1
      // 098: fload 18
      // 09a: ldc 0.8
      // 09c: fmul
      // 09d: fadd
      // 09e: fmul
      // 09f: fstore 19
      // 0a1: bipush 60
      // 0a3: i2f
      // 0a4: fconst_1
      // 0a5: fload 18
      // 0a7: fsub
      // 0a8: fmul
      // 0a9: f2i
      // 0aa: istore 20
      // 0ac: fload 9
      // 0ae: fload 10
      // 0b0: fload 19
      // 0b2: new me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll
      // 0b5: dup
      // 0b6: sipush 255
      // 0b9: sipush 255
      // 0bc: sipush 255
      // 0bf: iload 20
      // 0c1: invokespecial me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.<init> (IIII)V
      // 0c4: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 0c7: nop
      // 0c8: iload 5
      // 0ca: aload 8
      // 0cc: ifnull 0e8
      // 0cf: ifeq 0e6
      // 0d2: goto 0d9
      // 0d5: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0d8: athrow
      // 0d9: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0dc: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.H ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0df: goto 103
      // 0e2: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0e5: athrow
      // 0e6: iload 4
      // 0e8: ifeq 0fd
      // 0eb: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 0ee: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.H ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0f1: ldc 0.8
      // 0f3: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0f6: goto 103
      // 0f9: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0fc: athrow
      // 0fd: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 100: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.G ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 103: astore 16
      // 105: fload 9
      // 107: fload 10
      // 109: fconst_2
      // 10a: fadd
      // 10b: fload 15
      // 10d: new me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll
      // 110: dup
      // 111: bipush 0
      // 112: bipush 0
      // 113: bipush 0
      // 114: bipush 30
      // 116: invokespecial me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.<init> (IIII)V
      // 119: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 11c: fload 9
      // 11e: fload 10
      // 120: fload 15
      // 122: aload 16
      // 124: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 127: fload 9
      // 129: fload 10
      // 12b: fload 15
      // 12d: ldc 1.2
      // 12f: aload 8
      // 131: ifnull 17b
      // 134: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 137: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.y ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 13a: ldc 0.6
      // 13c: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 13f: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 142: iload 4
      // 144: ifne 166
      // 147: goto 14e
      // 14a: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 14d: athrow
      // 14e: iload 5
      // 150: aload 8
      // 152: ifnull 194
      // 155: goto 15c
      // 158: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 15b: athrow
      // 15c: ifeq 191
      // 15f: goto 166
      // 162: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 165: athrow
      // 166: fload 9
      // 168: ldc 3.0
      // 16a: fsub
      // 16b: fload 10
      // 16d: ldc 3.0
      // 16f: fsub
      // 170: fload 15
      // 172: ldc 0.5
      // 174: goto 17b
      // 177: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 17a: athrow
      // 17b: fmul
      // 17c: new me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll
      // 17f: dup
      // 180: sipush 255
      // 183: sipush 255
      // 186: sipush 255
      // 189: bipush 30
      // 18b: invokespecial me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.<init> (IIII)V
      // 18e: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)V
      // 191: nop
      // 192: iload 5
      // 194: aload 8
      // 196: ifnull 1b2
      // 199: ifeq 1b0
      // 19c: goto 1a3
      // 19f: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1a2: athrow
      // 1a3: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 1a6: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1a9: goto 1c8
      // 1ac: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1af: athrow
      // 1b0: iload 4
      // 1b2: ifeq 1c2
      // 1b5: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 1b8: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1bb: goto 1c8
      // 1be: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c1: athrow
      // 1c2: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 1c5: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.b ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 1c8: astore 17
      // 1ca: aload 3
      // 1cb: ldc "+"
      // 1cd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1d0: ifeq 1f1
      // 1d3: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 1d6: aload 3
      // 1d7: iload 1
      // 1d8: aload 0
      // 1d9: getfield me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII F
      // 1dc: f2i
      // 1dd: iadd
      // 1de: iload 2
      // 1df: aload 0
      // 1e0: getfield me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII F
      // 1e3: f2i
      // 1e4: iadd
      // 1e5: aload 17
      // 1e7: invokevirtual me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Ljava/lang/String;IILme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)D
      // 1ea: goto 208
      // 1ed: invokestatic me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f0: athrow
      // 1f1: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 1f4: aload 3
      // 1f5: iload 1
      // 1f6: aload 0
      // 1f7: getfield me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII F
      // 1fa: f2i
      // 1fb: iadd
      // 1fc: iload 2
      // 1fd: aload 0
      // 1fe: getfield me/octo/client/llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII F
      // 201: f2i
      // 202: iadd
      // 203: aload 17
      // 205: invokevirtual me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Ljava/lang/String;IILme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;)D
      // 208: pop2
      // 209: return
   }

   private final boolean a(int var1, int var2, int var3, int var4) {
      int[] var5 = lIlllIIlIllIlIlIIlllIllIlIIllIIIlllllIlIIlIIlllllIIlllIIllIlIIIlIlllIlIllIllIIIlIIlIl.l();
      float var6 = var1 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      float var7 = var2 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      float var8 = var3 - var6;
      float var9 = var4 - var7;
      return var5 == null
         || var8 * var8 + var9 * var9
            <= this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               * this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return (IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

    public void e() {
       switch (me.octo.client.llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.ordinal()]) {
          case -1:
             break;
          case 0:
             throw new kotlin.NoWhenBranchMatchedException();
          case 1:
             this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.P();
             this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = java.lang.System.currentTimeMillis();
             break;
          case 2:
             this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q();
             this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = java.lang.System.currentTimeMillis();
             break;
          default:
             throw new kotlin.NoWhenBranchMatchedException();
       }
    }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }
   @Override
   public float a() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a();
   }

   @Override
   public void a(char p0, int p1) {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1);
   }

   @Override
   public boolean a(int p0, int p1, int p2, int p3, int p4, int p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5);
   }

   @Override
   public int a(llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p0) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0);
   }

   @Override
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, float p3, float p4, float p5, float p6) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5, p6);
   }

   @Override
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, int p3, int p4, float p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.a(p0, p1, p2, p3, p4, p5);
   }

   @Override
   public int b() {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b();
   }

   @Override
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor p0, int p1, int p2, int p3, int p4, float p5) {
      return me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.b(p0, p1, p2, p3, p4, p5);
   }

   @Override
   public void d() {
      me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.super.d();
   }


   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "t\u0085\u0001;\u0010\u008b\u0014\u000bM\u0003Æ\u001du-Þ\u0096\u008c¶\u001a\n[\u008eÂA\u008a§ñ\u0083:¼";
      int var4 = "t\u0085\u0001;\u0010\u008b\u0014\u000bM\u0003Æ\u001du-Þ\u0096\u008c¶\u001a\n[\u008eÂA\u008a§ñ\u0083:¼".length();
      char var1 = 7;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 92;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 92;
               var10006 = var6;
            } else {
               var13 = 92;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 92;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 83;
                  case 1 -> 102;
                  case 2 -> 91;
                  case 3 -> 45;
                  case 4 -> 31;
                  case 5 -> 10;
                  default -> 1;
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
            d = var5;
            e = new String[3];
            break pxClinit;
         }

         var1 = var2.charAt(var0);
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 14140) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 16;
            case 1 -> 214;
            case 2 -> 95;
            case 3 -> 180;
            case 4 -> 205;
            case 5 -> 250;
            case 6 -> 202;
            case 7 -> 182;
            case 8 -> 184;
            case 9 -> 163;
            case 10 -> 27;
            case 11 -> 246;
            case 12 -> 15;
            case 13 -> 172;
            case 14 -> 147;
            case 15 -> 151;
            case 16 -> 239;
            case 17 -> 251;
            case 18 -> 111;
            case 19 -> 1;
            case 20 -> 127;
            case 21 -> 14;
            case 22 -> 72;
            case 23 -> 12;
            case 24 -> 236;
            case 25 -> 77;
            case 26 -> 84;
            case 27 -> 31;
            case 28 -> 135;
            case 29 -> 144;
            case 30 -> 117;
            case 31 -> 24;
            case 32 -> 10;
            case 33 -> 66;
            case 34 -> 183;
            case 35 -> 124;
            case 36 -> 159;
            case 37 -> 152;
            case 38 -> 161;
            case 39 -> 2;
            case 40 -> 125;
            case 41 -> 0;
            case 42 -> 219;
            case 43 -> 62;
            case 44 -> 227;
            case 45 -> 213;
            case 46 -> 52;
            case 47 -> 45;
            case 48 -> 34;
            case 49 -> 221;
            case 50 -> 48;
            case 51 -> 192;
            case 52 -> 225;
            case 53 -> 174;
            case 54 -> 37;
            case 55 -> 9;
            case 56 -> 185;
            case 57 -> 248;
            case 58 -> 166;
            case 59 -> 253;
            case 60 -> 204;
            case 61 -> 220;
            case 62 -> 46;
            case 63 -> 97;
            case 64 -> 93;
            case 65 -> 57;
            case 66 -> 206;
            case 67 -> 120;
            case 68 -> 224;
            case 69 -> 107;
            case 70 -> 142;
            case 71 -> 232;
            case 72 -> 162;
            case 73 -> 212;
            case 74 -> 211;
            case 75 -> 146;
            case 76 -> 116;
            case 77 -> 30;
            case 78 -> 80;
            case 79 -> 244;
            case 80 -> 74;
            case 81 -> 122;
            case 82 -> 132;
            case 83 -> 42;
            case 84 -> 150;
            case 85 -> 208;
            case 86 -> 186;
            case 87 -> 81;
            case 88 -> 148;
            case 89 -> 226;
            case 90 -> 138;
            case 91 -> 109;
            case 92 -> 175;
            case 93 -> 170;
            case 94 -> 105;
            case 95 -> 21;
            case 96 -> 168;
            case 97 -> 223;
            case 98 -> 209;
            case 99 -> 245;
            case 100 -> 108;
            case 101 -> 40;
            case 102 -> 160;
            case 103 -> 32;
            case 104 -> 118;
            case 105 -> 243;
            case 106 -> 201;
            case 107 -> 35;
            case 108 -> 241;
            case 109 -> 51;
            case 110 -> 231;
            case 111 -> 63;
            case 112 -> 22;
            case 113 -> 136;
            case 114 -> 86;
            case 115 -> 47;
            case 116 -> 18;
            case 117 -> 134;
            case 118 -> 249;
            case 119 -> 8;
            case 120 -> 154;
            case 121 -> 103;
            case 122 -> 145;
            case 123 -> 50;
            case 124 -> 196;
            case 125 -> 99;
            case 126 -> 76;
            case 127 -> 139;
            case 128 -> 141;
            case 129 -> 19;
            case 130 -> 149;
            case 131 -> 112;
            case 132 -> 190;
            case 133 -> 87;
            case 134 -> 181;
            case 135 -> 64;
            case 136 -> 198;
            case 137 -> 100;
            case 138 -> 237;
            case 139 -> 189;
            case 140 -> 110;
            case 141 -> 38;
            case 142 -> 73;
            case 143 -> 115;
            case 144 -> 60;
            case 145 -> 157;
            case 146 -> 119;
            case 147 -> 67;
            case 148 -> 41;
            case 149 -> 222;
            case 150 -> 178;
            case 151 -> 233;
            case 152 -> 85;
            case 153 -> 137;
            case 154 -> 164;
            case 155 -> 58;
            case 156 -> 102;
            case 157 -> 217;
            case 158 -> 13;
            case 159 -> 140;
            case 160 -> 20;
            case 161 -> 68;
            case 162 -> 255;
            case 163 -> 49;
            case 164 -> 94;
            case 165 -> 91;
            case 166 -> 26;
            case 167 -> 3;
            case 168 -> 17;
            case 169 -> 104;
            case 170 -> 70;
            case 171 -> 199;
            case 172 -> 78;
            case 173 -> 247;
            case 174 -> 83;
            case 175 -> 187;
            case 176 -> 171;
            case 177 -> 113;
            case 178 -> 53;
            case 179 -> 203;
            case 180 -> 5;
            case 181 -> 69;
            case 182 -> 71;
            case 183 -> 44;
            case 184 -> 56;
            case 185 -> 128;
            case 186 -> 194;
            case 187 -> 28;
            case 188 -> 254;
            case 189 -> 23;
            case 190 -> 240;
            case 191 -> 92;
            case 192 -> 188;
            case 193 -> 197;
            case 194 -> 61;
            case 195 -> 11;
            case 196 -> 89;
            case 197 -> 82;
            case 198 -> 143;
            case 199 -> 130;
            case 200 -> 79;
            case 201 -> 101;
            case 202 -> 123;
            case 203 -> 7;
            case 204 -> 55;
            case 205 -> 155;
            case 206 -> 234;
            case 207 -> 200;
            case 208 -> 4;
            case 209 -> 106;
            case 210 -> 156;
            case 211 -> 65;
            case 212 -> 235;
            case 213 -> 191;
            case 214 -> 131;
            case 215 -> 121;
            case 216 -> 179;
            case 217 -> 167;
            case 218 -> 43;
            case 219 -> 98;
            case 220 -> 29;
            case 221 -> 242;
            case 222 -> 59;
            case 223 -> 216;
            case 224 -> 158;
            case 225 -> 88;
            case 226 -> 54;
            case 227 -> 195;
            case 228 -> 252;
            case 229 -> 90;
            case 230 -> 133;
            case 231 -> 6;
            case 232 -> 169;
            case 233 -> 96;
            case 234 -> 218;
            case 235 -> 176;
            case 236 -> 215;
            case 237 -> 129;
            case 238 -> 153;
            case 239 -> 173;
            case 240 -> 75;
            case 241 -> 36;
            case 242 -> 210;
            case 243 -> 126;
            case 244 -> 207;
            case 245 -> 165;
            case 246 -> 228;
            case 247 -> 25;
            case 248 -> 177;
            case 249 -> 193;
            case 250 -> 33;
            case 251 -> 230;
            case 252 -> 39;
            case 253 -> 114;
            case 254 -> 229;
            default -> 238;
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

   public static enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      public static llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] a() {
         return (llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      }

      public static llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         String var0
      ) {
         return Enum.valueOf(
            llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII};
      private static final EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = kotlin.enums.EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
       private static final me.octo.client.llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] c() {
           me.octo.client.llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var0 = new me.octo.client.llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[2];
           var0[0] = me.octo.client.llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
           var0[1] = me.octo.client.llIIIllIllIlllIIlllIIIllllIlIIIIlIlIlIIIIllIIllIllIIIIllIIllIIIllIIlIIIllIlIIlIIIllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
           return var0;
       }
   }
}
