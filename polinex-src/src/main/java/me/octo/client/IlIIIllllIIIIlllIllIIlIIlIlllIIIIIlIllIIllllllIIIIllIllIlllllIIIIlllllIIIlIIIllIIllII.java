package me.octo.client;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.ranges.RangesKt;
import me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl;
import me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public final class IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII
   implements IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl,
   IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII {
   public IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll c() {
      return (me.octo.client.IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll) this.m();
   }

   @NotNull
   private final IllllIIlIIlIIIIIlIIlIlIlllIIIIllIIlllIllIlIIllIIIllIIIlIIllIIlIllIIlIIIlIlIIIIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private static IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] f;
   private static String[] g;

   public IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII(
      @NotNull IllllIIlIIlIIIIIlIIlIlIlllIIIIllIIlllIllIlIIllIIIllIIIlIIllIIlIllIIlIIIlIlIIIIlIlIIll var1
   ) {
      short var10001 = 14533;
      short var10002 = 12674;
      Intrinsics.checkNotNullParameter(var1, "module");
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.a(
         (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 24.0F;
   }

   @NotNull
   public lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(
      @NotNull GuiGraphicsExtractor param1,
      @NotNull llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll param2,
      int param3,
      int param4,
      int param5
   ) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "drawContext");
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param2, "resolution");
      java.lang.String[] var6 = me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
      me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var7 = null;
      float var8 = 12.0F;
      float var9 = param2.e() - 20.0F - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      float var10 = 32.0F;
      float var11 = var9 - var8 - var10;
      float var12 = var11 - var8 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      int var13 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1, (int)param2.c(), param3, (int)(var12 - 6.0F));
      float var14 = (float)param3 + (float)(var13 - param3) / 2.0F;
      int var15 = (int)(var14 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / 2.0F);
      boolean var16 = this.a((int)var12, var15, param4, param5);
      if (!var16 && this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      }

      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var12 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / 2.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = (float)var15 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / 2.0F;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = (float)param4;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = (float)param5;
      this.a((int)var12, var15, "-", var16, this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      float var17 = 22.0F;
      float var18 = var14 - var17 / 2.0F;
      float var19 = var11 - 2.0F;
      float var20 = var10 + 4.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var19, var18, var20, var17, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.j(), 6.0F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var19, var18, var20, var17, 1.0F, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.y().a(0.5F), 6.0F);
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.b(java.lang.String.valueOf(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.M()), (int)(var11 + var10 / 2.0F), (int)var14, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a());
      boolean var21 = this.a((int)var9, var15, param4, param5);
      if (!var21 && this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = false;
      }

      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / 2.0F;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = (float)var15 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / 2.0F;
      this.a((int)var9, var15, "+", var21, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll, this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      if ((var16 || var21) && (float)param5 > param2.d() + 5.0F) {
         me.octo.client.llIIlIlllllIllIllllIlllIllIIlllllIllllllIlIIllIIIIlllIIIlllllIIIlIllllIllIIlllIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(true);
         me.octo.client.IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var16
            ? me.octo.client.IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            : me.octo.client.IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var7 = this;
      }

      int var22 = 0;
      float var23 = me.octo.client.llIlllIIIIlllllllIIllIIlIIllIlIIlIlllllIllIIIIIIIIlIIllllllIllIIIllIllIIIIlllllIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d((me.octo.client.IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      if (var23 > 0.0F) {
         me.octo.client.lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll var24 = this.a(param1, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, param2, var13, param4, param5);
         if (var24.c() && (float)param5 > param2.d() + 5.0F) {
            var7 = var24.b();
         }

         var22 = var24.a();
      } else {
         var22 = var13;
      }

      me.octo.client.lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll var25 = new me.octo.client.lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll(var22, var7);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.b(new java.lang.String[4]);
      }

      return var25;
   }

   private final void a(int param1, int param2, String param3, boolean param4, boolean param5, long param6) {
String[] var8 = me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
float var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
float var10;
if (var8 == null) {
   var10 = param5 ? 0.85F : 1.0F;
} else if (param5) {
   long var11 = System.currentTimeMillis() - param6;
   float var14 = kotlin.ranges.RangesKt.coerceIn((float)var11 / 250.0F, 0.0F, 1.0F);
   float var15 = var14 * var14 * (3.0F - 2.0F * var14);
   var10 = 1.0F + var15 * 0.15F;
} else {
   var10 = param4 ? 0.85F : 1.0F;
}
float var12 = param4 ? 0.8F : 1.0F;
float var13 = var9 * var10;
float var21 = (var13 - var9) / 2.0F;
String var16 = "pmmodbtn:" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aj() + ":" + param3;
float var17 = me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var16, param4, 0.0F);
me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var18;
if (var8 == null) {
   var18 = var17 == 0.01F ? me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K() : me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.J();
} else {
   if (var17 > 0.01F) {
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a((float)param1 - var21, (float)param2 - var21, var13, var13, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aq(), me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah(), var17 * 0.5F, 3.0F, 0);
   }
   var18 = param4 ? me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.J() : me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.K();
}
me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a((float)param1 - var21, (float)param2 - var21, var13, var13, var18, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aq());
me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("pmmodbtnrip:" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aj() + ":" + param3, (float)param1 - var21, (float)param2 - var21, var13, var13, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aq());
me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
float var19 = (float)param1 + var9 / 2.0F;
float var20 = (float)param2 + var9 / 2.0F + 1.0F;
me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var19, var20);
me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var12, var12);
me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(-var19, -var20);
me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.e(param3, (double)var19 + 0.75D, (double)var20 - 1.0D, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(), false);
me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
return;
   }

   private final boolean a(int param1, int param2, int param3, int param4) {
        int n5;
        int n6;
        block16: {
            String[] stringArray;
            block15: {
                block14: {
                    stringArray = IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
                    try {
                        try {
                            n6 = param3;
                            n5 = param1;
                            if (stringArray == null) break block14;
                            if (n6 < n5) return 0 != 0;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.a(noWhenBranchMatchedException);
                        }
                        n6 = param3;
                        n5 = param1 + (int)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.a(noWhenBranchMatchedException);
                    }
                }
                try {
                    try {
                        if (stringArray == null) break block15;
                        if (n6 > n5) return 0 != 0;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.a(noWhenBranchMatchedException);
                    }
                    n6 = param4;
                    n5 = param2;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.a(noWhenBranchMatchedException);
                }
            }
            try {
                try {
                    try {
                        if (stringArray == null) break block16;
                        if (n6 < n5) return 0 != 0;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.a(noWhenBranchMatchedException);
                    }
                    n6 = param4;
                    if (stringArray == null) return n6 != 0;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.a(noWhenBranchMatchedException);
                }
                n5 = param2 + (int)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                throw IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.a(noWhenBranchMatchedException);
            }
        }
        if (n6 > n5) return 0 != 0;
        return 1 != 0;
   }

   public void e() {
String[] var1 = me.octo.client.IllllIIIlllllIlIIIIlIIlIIllIIllIIIIllllIlIIllIlIlllIlllllllIIIIllllIIIlllllllllIIlIll.x();
switch (var1 != null && this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null ? me.octo.client.IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.ordinal()] : -1) {
   case -1:
      if (var1 != null) {
         return;
      }
      throw new kotlin.NoWhenBranchMatchedException();
   case 0:
      throw new kotlin.NoWhenBranchMatchedException();
   case 1: {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.Q();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
      float var2 = var1 != null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl > 0.0F ? this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl : this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      float var3 = var1 != null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll > 0.0F ? this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll : this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("pmmodbtnrip:" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aj() + ":+", var2, var3, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah().a(160), 0.9F * this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, 0L);
      if (var1 != null) {
         return;
      }
   }
   case 2: {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.R();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = System.currentTimeMillis();
      float var2 = var1 != null && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl > 0.0F ? this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl : this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      float var3 = var1 != null && this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll > 0.0F ? this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll : this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("pmmodbtnrip:" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.aj() + ":-", var2, var3, me.octo.client.IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.ah().a(160), 0.9F * this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, 0L);
      if (var1 != null) {
         return;
      }
      if (var1 != null) {
         return;
      }
   }
   default:
      throw new kotlin.NoWhenBranchMatchedException();
}
   }

   @NotNull
   @Override
   public String k() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.al().name();
   }

   @NotNull
   @Override
   public String l() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.am();
   }

   @NotNull
   @Override
   public IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll m() {
      return (IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "<xq·=s¿77\fÕ.L}\u009a*K\u001cá¬g\\\u0002½³\u000b\u0018íoáT¯K\u001a¯$_\n\u009e+yÔé\b,ª\u0010\u009a\f\u0086ü&'×aâuÔ\u0081Áù";
      int var4 = "<xq·=s¿77\fÕ.L}\u009a*K\u001cá¬g\\\u0002½³\u000b\u0018íoáT¯K\u001a¯$_\n\u009e+yÔé\b,ª\u0010\u009a\f\u0086ü&'×aâuÔ\u0081Áù".length();
      char var1 = '\t';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 74;
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
                     case 0 -> 23;
                     case 1 -> 35;
                     case 2 -> 4;
                     case 3 -> 112;
                     case 4 -> 52;
                     case 5 -> 104;
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
                     f = var5;
                     g = new String[8];
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

                  var2 = "³©\u0006Ú¿\u0001\f\bA";
                  var4 = "³©\u0006Ú¿\u0001\f\bA".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 82;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 14530) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 85;
            case 1 -> 49;
            case 2 -> 214;
            case 3 -> 86;
            case 4 -> 148;
            case 5 -> 139;
            case 6 -> 133;
            case 7 -> 110;
            case 8 -> 117;
            case 9 -> 238;
            case 10 -> 19;
            case 11 -> 116;
            case 12 -> 23;
            case 13 -> 233;
            case 14 -> 94;
            case 15 -> 198;
            case 16 -> 159;
            case 17 -> 220;
            case 18 -> 156;
            case 19 -> 244;
            case 20 -> 217;
            case 21 -> 204;
            case 22 -> 107;
            case 23 -> 18;
            case 24 -> 16;
            case 25 -> 170;
            case 26 -> 115;
            case 27 -> 20;
            case 28 -> 228;
            case 29 -> 163;
            case 30 -> 134;
            case 31 -> 182;
            case 32 -> 224;
            case 33 -> 183;
            case 34 -> 168;
            case 35 -> 113;
            case 36 -> 166;
            case 37 -> 92;
            case 38 -> 175;
            case 39 -> 112;
            case 40 -> 2;
            case 41 -> 160;
            case 42 -> 114;
            case 43 -> 149;
            case 44 -> 33;
            case 45 -> 218;
            case 46 -> 227;
            case 47 -> 1;
            case 48 -> 82;
            case 49 -> 43;
            case 50 -> 225;
            case 51 -> 141;
            case 52 -> 147;
            case 53 -> 171;
            case 54 -> 61;
            case 55 -> 70;
            case 56 -> 22;
            case 57 -> 6;
            case 58 -> 34;
            case 59 -> 111;
            case 60 -> 249;
            case 61 -> 128;
            case 62 -> 89;
            case 63 -> 41;
            case 64 -> 32;
            case 65 -> 80;
            case 66 -> 252;
            case 67 -> 118;
            case 68 -> 59;
            case 69 -> 162;
            case 70 -> 76;
            case 71 -> 232;
            case 72 -> 50;
            case 73 -> 154;
            case 74 -> 100;
            case 75 -> 9;
            case 76 -> 179;
            case 77 -> 3;
            case 78 -> 13;
            case 79 -> 219;
            case 80 -> 53;
            case 81 -> 189;
            case 82 -> 248;
            case 83 -> 88;
            case 84 -> 213;
            case 85 -> 109;
            case 86 -> 51;
            case 87 -> 54;
            case 88 -> 150;
            case 89 -> 203;
            case 90 -> 108;
            case 91 -> 208;
            case 92 -> 194;
            case 93 -> 99;
            case 94 -> 136;
            case 95 -> 123;
            case 96 -> 62;
            case 97 -> 250;
            case 98 -> 173;
            case 99 -> 31;
            case 100 -> 125;
            case 101 -> 253;
            case 102 -> 192;
            case 103 -> 158;
            case 104 -> 11;
            case 105 -> 140;
            case 106 -> 197;
            case 107 -> 71;
            case 108 -> 7;
            case 109 -> 39;
            case 110 -> 169;
            case 111 -> 215;
            case 112 -> 101;
            case 113 -> 172;
            case 114 -> 188;
            case 115 -> 207;
            case 116 -> 195;
            case 117 -> 66;
            case 118 -> 24;
            case 119 -> 237;
            case 120 -> 135;
            case 121 -> 93;
            case 122 -> 210;
            case 123 -> 103;
            case 124 -> 185;
            case 125 -> 35;
            case 126 -> 37;
            case 127 -> 131;
            case 128 -> 155;
            case 129 -> 187;
            case 130 -> 235;
            case 131 -> 56;
            case 132 -> 75;
            case 133 -> 77;
            case 134 -> 205;
            case 135 -> 124;
            case 136 -> 90;
            case 137 -> 211;
            case 138 -> 174;
            case 139 -> 69;
            case 140 -> 78;
            case 141 -> 177;
            case 142 -> 145;
            case 143 -> 223;
            case 144 -> 72;
            case 145 -> 240;
            case 146 -> 201;
            case 147 -> 167;
            case 148 -> 87;
            case 149 -> 47;
            case 150 -> 26;
            case 151 -> 246;
            case 152 -> 239;
            case 153 -> 68;
            case 154 -> 216;
            case 155 -> 119;
            case 156 -> 255;
            case 157 -> 254;
            case 158 -> 60;
            case 159 -> 144;
            case 160 -> 146;
            case 161 -> 5;
            case 162 -> 126;
            case 163 -> 234;
            case 164 -> 21;
            case 165 -> 241;
            case 166 -> 28;
            case 167 -> 200;
            case 168 -> 73;
            case 169 -> 178;
            case 170 -> 8;
            case 171 -> 10;
            case 172 -> 222;
            case 173 -> 142;
            case 174 -> 181;
            case 175 -> 180;
            case 176 -> 165;
            case 177 -> 64;
            case 178 -> 14;
            case 179 -> 15;
            case 180 -> 102;
            case 181 -> 193;
            case 182 -> 104;
            case 183 -> 161;
            case 184 -> 245;
            case 185 -> 25;
            case 186 -> 46;
            case 187 -> 202;
            case 188 -> 186;
            case 189 -> 55;
            case 190 -> 190;
            case 191 -> 152;
            case 192 -> 63;
            case 193 -> 247;
            case 194 -> 130;
            case 195 -> 164;
            case 196 -> 120;
            case 197 -> 91;
            case 198 -> 29;
            case 199 -> 65;
            case 200 -> 236;
            case 201 -> 121;
            case 202 -> 79;
            case 203 -> 58;
            case 204 -> 52;
            case 205 -> 242;
            case 206 -> 191;
            case 207 -> 212;
            case 208 -> 0;
            case 209 -> 42;
            case 210 -> 96;
            case 211 -> 44;
            case 212 -> 98;
            case 213 -> 4;
            case 214 -> 48;
            case 215 -> 231;
            case 216 -> 12;
            case 217 -> 105;
            case 218 -> 74;
            case 219 -> 36;
            case 220 -> 40;
            case 221 -> 122;
            case 222 -> 30;
            case 223 -> 45;
            case 224 -> 95;
            case 225 -> 132;
            case 226 -> 157;
            case 227 -> 209;
            case 228 -> 27;
            case 229 -> 137;
            case 230 -> 199;
            case 231 -> 57;
            case 232 -> 221;
            case 233 -> 81;
            case 234 -> 17;
            case 235 -> 143;
            case 236 -> 176;
            case 237 -> 229;
            case 238 -> 84;
            case 239 -> 230;
            case 240 -> 151;
            case 241 -> 184;
            case 242 -> 138;
            case 243 -> 83;
            case 244 -> 251;
            case 245 -> 206;
            case 246 -> 196;
            case 247 -> 226;
            case 248 -> 129;
            case 249 -> 67;
            case 250 -> 243;
            case 251 -> 38;
            case 252 -> 153;
            case 253 -> 97;
            case 254 -> 106;
            default -> 127;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII };

      public static IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] a() {
         return (IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      }

      public static IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         String var0
      ) {
         return Enum.valueOf(
            IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = kotlin.enums.EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   
public static me.octo.client.IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] c() {
         me.octo.client.IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var0 = new me.octo.client.IlIIIllllIIIIlllIllIIlIIlIlllIIIIIlIllIIllllllIIIIllIllIlllllIIIIlllllIIIlIIIllIIllII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[2];
         var0[0] = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         var0[1] = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         return var0;
      }
}

   public boolean a(int p1, int p2, int p3, int p4, int p5, int p6) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(p1, p2, p3, p4, p5, p6);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, float p4, float p5, float p6, float p7) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(p1, p2, p3, p4, p5, p6, p7);
   }
   public boolean a(net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, float p6) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(p1, p2, p3, p4, p5, p6);
   }
   public boolean b(net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, float p6) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.b(p1, p2, p3, p4, p5, p6);
   }
   public float a() {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a();
   }
   public int a(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p1) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(p1);
   }
   public int b() {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.b();
   }
   public int b(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p1) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.b(p1);
   }
   public int c(me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p1) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.c(p1);
   }
   public int n() {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.n();
   }
   public me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] a(me.octo.client.IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll p1) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(p1);
   }
   public me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] b(me.octo.client.IIIIIIlIIIIllIllllIIlIIlIIlllllIlIIIllIIlllIllllIlIllIlllIlllIIlIllllIlllIlIlIIIIIlll p1) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.b(p1);
   }
   public me.octo.client.lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(net.minecraft.client.gui.GuiGraphicsExtractor p1, me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] p2, me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p3, int p4, int p5, int p6) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(p1, p2, p3, p4, p5, p6);
   }
   public me.octo.client.lIIlllIIlIIIIIllIlIlllIllIIIIlIIlIlIIIlIIIlllllIIllllIIIIIllIIIlIIllllIIIIlIIlIllllll a(net.minecraft.client.gui.GuiGraphicsExtractor p1, me.octo.client.IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl[] p2, me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll p3, int p4, int p5, int p6, float p7) {
      return IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(p1, p2, p3, p4, p5, p6, p7);
   }
   public void a(char p1, int p2) {
      IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.a(p1, p2);
   }
   public void d() {
      IlIlllllllIllllIIlllllllIIlIlIIIIlIIIIIIllIIlIIlIlIIIIIlIIlIIllllllIllIlIIIIIIIIlIlIl.super.d();
   }
}
