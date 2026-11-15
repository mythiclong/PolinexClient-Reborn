package me.octo.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import me.octo.client.utils.lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl;
import me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;

public final class lllIlIlllIIIlIIIllllIlIIlIIlllIIlIllllllIlllllIIIIIIlIlllllIIlIlIIIIllllIlllllllIIlII {
   @NotNull
   public static lllIlIlllIIIlIIIllllIlIIlIIlllIIlIllllllIlllllIIIIIIlIlllllIIlIlIIIIllllIlllllllIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll(
      75
   );
   @Nullable
   private IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final NumberFormat lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = NumberFormat.getNumberInstance(Locale.US);
   private static float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;

   @Nullable
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      @NotNull GuiGraphicsExtractor param1,
      @NotNull List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> param2,
      float param3,
      float param4,
      float param5,
      float param6,
      int param7,
      int param8,
      float param9
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10 = me.octo.client.IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "context");
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param2, "routes");
      if (param6 <= 50.0F) {
         return null;
      }
      me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var11 = null;
      float var12 = 16.0F + (float)param2.size() * 83.0F + 16.0F;
      float var13 = -(var12 - param6);
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll(new me.octo.client.llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll(1000.0F, 700.0F));
      }
      if (var12 > param6) {
         me.octo.client.IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll var18 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var18 != null) {
            var18.a(param3 + param5 - 8.0F, param4, param6, var13, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         }
      }
      float var14 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.e();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param3, param4, param5 - 10.0F, param6);
      java.lang.Iterable<me.octo.client.IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> var15 = (java.lang.Iterable<me.octo.client.IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl>)(java.lang.Object)param2;
      int var16 = 0;
      for (me.octo.client.IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var21 : var15) {
         int var20 = var16++;
         if (var20 < 0) {
            kotlin.collections.CollectionsKt.throwIndexOverflow();
         }
         float var24 = param4 + var14 + 16.0F + (float)var20 * 83.0F;
         if (var24 + 75.0F >= param4 - 50.0F && var24 <= param4 + param6 + 50.0F) {
            me.octo.client.IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var25 = this.b(var21, param3 + 12.0F, var24, param5 - 24.0F - 12.0F, 75.0F, param7, param8, param9);
            if (var25 != null && var11 == null) {
               var11 = var25;
            }
         }
      }
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.i();
      if (var12 > param6) {
         me.octo.client.IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll var23 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var23 != null) {
            var23.a(param1, param7, param8, param9);
         }
      }
      return var11;
   }

   @Nullable
   public final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII a(
      @NotNull IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      float var8
   ) {
      short var10001 = -31249;
      short var10002 = 10194;
      Intrinsics.checkNotNullParameter(var1, "route");
      return this.b(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private final IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII b(
      IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl param1,
      float param2,
      float param3,
      float param4,
      float param5,
      int param6,
      int param7,
      float param8
   ) {
      var animator = lIIIIIllIIIlIIlIllIlIllllIlIlIIIllIlllllIlIllIIllllIIlIllIIIlllIIIllIIlIlIlIlIIIIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var drawing = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var theme = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      var font = lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      boolean hovered = (float)param6 >= param2 && (float)param6 <= param2 + param4
         && (float)param7 >= param3 && (float)param7 <= param3 + param5;
      var routeType = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1.c());
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll routeColor = this.a(routeType);
      float hoverFade = animator.a(animator, "routecard:" + param1.a(), hovered, 0.0F, 4, null);
      if (hoverFade > 0.01F) {
         animator.a(animator, param2, param3, param4, param5, theme.aq(), routeColor,
            hoverFade * 0.45F, 5.0F, 0, 256, null);
      }

      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll surface =
         hovered ? theme.j().b(2.0F, 2.0F, 2.0F) : theme.j();
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll border =
         hovered ? routeColor.a(0.5F) : theme.A();
      drawing.a(param2, param3, param4, param5, surface, 0.0F, 0.0F, 8.0F, theme.aq());
      drawing.a(param2, param3, param4, param5, 1.0F, border, 0.0F, 0.0F, 8.0F, theme.aq());
      drawing.a(param2, param3, 4.0F, param5, routeColor.a(0.5F + hoverFade * 0.5F));

      float textX = param2 + 18.0F;
      float textY = param3 + 12.0F;
      String by = "by " + param1.f();
      double byWidth = lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         font, "by ", textX, textY + 7.0F, theme.a().a(0.5F), false, 16, null);
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         font, by, textX + byWidth + 10.0F, textY + 7.0F, theme.a().a(0.5F), false, 16, null);

      float pillY = textY + 30.0F;
      float pillX = textX;
      float pillWidth = (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(
         font, routeType.a(), false, 2, null) + 12.0F;
      drawing.a(pillX, pillY, pillWidth, 18.0F, theme.A().a(0.5F), theme.aq());
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         font, routeType.a(), pillX + 7.0F, pillY + 3.5F, theme.a().a(0.7F), false, 16, null);

      float cursorX = pillX + pillWidth + 8.0F;
      if (param1.e()) {
         drawing.b(
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.6\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n        <path d=\"M21 3c-1.5-1.5-6 0-9 3l4 4 2-2\"/>\n        <path d=\"M14 8l-9.5 9.5a2 2 0 1 0 2.8 2.8L16.8 10.8\"/>\n        <path d=\"M10 12l2 2\"/>\n    </svg>\n",
            cursorX, pillY + 2.0F, 14.0F, theme.ah().a(0.8F), param8);
         cursorX += 22.0F;
      }

      String points = param1.d() + " points";
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         font, points, cursorX, pillY + 3.5F, theme.a().a(0.6F), false, 16, null);
      float downloadX = cursorX + (float)lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         font, points, false, 2, null) + 10.0F;
      drawing.b(
         "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <path d=\"M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4\"/>\n            <polyline points=\"7,10 12,15 17,10\"/>\n            <line x1=\"12\" y1=\"15\" x2=\"12\" y2=\"3\"/>\n        </svg>\n    ",
         downloadX, pillY + 2.5F, 12.0F, theme.a().a(0.6F), param8);
      String downloads = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.format(param1.g());
      lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         font, downloads, downloadX + 16.0F, pillY + 3.5F, theme.a().a(0.6F), false, 16, null);

      float buttonY = param3 + 18.0F;
      float buttonHeight = 36.0F;
      float buttonGap = 8.0F;
      float buttonWidth = 85.0F;
      float loadX = param2 + param4 - 12.0F - buttonWidth;
      float previewX = loadX - buttonWidth - buttonGap;

      boolean loadHovered = (float)param6 >= loadX && (float)param6 <= loadX + buttonWidth
         && (float)param7 >= buttonY && (float)param7 <= buttonY + buttonHeight;
      float loadFade = animator.a(animator, "routecard:" + param1.a() + ":load", loadHovered, 0.0F, 4, null);
      if (loadFade > 0.01F) {
         animator.a(animator, loadX, buttonY, buttonWidth, buttonHeight, 6.0F, theme.ah(),
            loadFade * 0.55F, 4.0F, 0, 256, null);
      }
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll loadColor =
         loadHovered ? theme.r() : theme.G();
      drawing.a(loadX, buttonY, buttonWidth, buttonHeight, loadColor, 6.0F);
      animator.a("routecard:" + param1.a() + ":loadrip", loadX, buttonY, buttonWidth, buttonHeight, 6.0F);
      font.a(
         "Load", loadX + buttonWidth / 2.0F, buttonY + buttonHeight / 2.0F, theme.a());

      IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII loadClickable = null;
      if (loadHovered) {
         loadClickable = new lllIlIlllIIIlIIIllllIlIIlIIlllIIlIllllllIlllllIIIIIIlIlllllIIlIlIIIIllllIlllllllIIlII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            param1, (float)param6, (float)param7,
            animator.a(buttonWidth, buttonHeight, (float)param6, (float)param7, loadX, buttonY) + 4.0F);
      }

      boolean previewHovered = (float)param6 >= previewX && (float)param6 <= previewX + buttonWidth
         && (float)param7 >= buttonY && (float)param7 <= buttonY + buttonHeight;
      float previewFade = animator.a(animator, "routecard:" + param1.a() + ":preview", previewHovered, 0.0F, 4, null);
      if (previewFade > 0.01F) {
         animator.a(animator, previewX, buttonY, buttonWidth, buttonHeight, 6.0F, theme.ah(),
            previewFade * 0.45F, 4.0F, 0, 256, null);
      }
      llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll previewColor =
         previewHovered ? theme.G().b(5.0F, 5.0F, 5.0F) : theme.G().b(-5.0F, -5.0F, -5.0F);
      drawing.a(previewX, buttonY, buttonWidth, buttonHeight, previewColor, 6.0F);
      animator.a("routecard:" + param1.a() + ":previewrip", previewX, buttonY, buttonWidth, buttonHeight, 6.0F);
      font.a(
         "Preview", previewX + buttonWidth / 2.0F, buttonY + buttonHeight / 2.0F, theme.a());

      if (!previewHovered || loadClickable != null) {
         return loadClickable;
      }
      return new lllIlIlllIIIlIIIllllIlIIlIIlllIIlIllllllIlllllIIIIIIlIlllllIIlIlIIIIllllIlllllllIIlII$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         param1, (float)param6, (float)param7,
         animator.a(buttonWidth, buttonHeight, (float)param6, (float)param7, previewX, buttonY) + 4.0F);
   }

   private final llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll a(
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var1
   ) {
      switch (var1) {
         case lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(14239471);
         case IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(2282478);
         case IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(15381256);
         case IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(7041664);
         case lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(14427686);
         case IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(16096779);
         case llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(16498468);
         case lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(7041664);
         case lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(2278750);
         case lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(10980346);
         case lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(8141549);
         case IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl:
            return new llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(3718648);
         default:
            throw new NoWhenBranchMatchedException();
      }
   }

   public final void a(int param1, int param2, int param3, float param4, float param5, float param6, float param7) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (!((float)param1 >= param4)) { return; }
      if (!((float)param1 <= param4 + param6)) { return; }
      if (!((float)param2 >= param5)) { return; }
      if (!((float)param2 <= param5 + param7)) { return; }
      IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll var9 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var9 != null) {
         var9.a(param1, param2, param3);
      }
   }

   public final void a(int param1, int param2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var3 != null) {
         IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var4 != null) {
            var4.a(param1, param2);
         }
      }
   }

   public final void b(int param1, int param2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var3 != null) {
         IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var4 != null) {
            var4.b(param1, param2);
         }
      }
   }

   public final void a() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIIlIIIIlIlllIlIlIllIlIlIlIIIIIlIlIIlIIlllllIlIllIlIIllIIllIIIIllIIlIIIIllIlIIIIlIIll.i();
      if (var1 != null) {
         IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (var2 != null) {
            var2.b();
         }
      }
   }

   @NotNull
   public final List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> a(
      @NotNull List<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> param1,
      @NotNull String param2,
      @NotNull Set<? extends llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> param3,
      @NotNull String param4,
      @NotNull IntRange param5,
      @NotNull IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param6
   ) {
      Intrinsics.checkNotNullParameter(param1, "routes");
      Intrinsics.checkNotNullParameter(param2, "searchQuery");
      Intrinsics.checkNotNullParameter(param3, "selectedTypes");
      Intrinsics.checkNotNullParameter(param4, "hasEtherwarp");
      Intrinsics.checkNotNullParameter(param5, "pointRange");
      Intrinsics.checkNotNullParameter(param6, "sortType");
      java.util.ArrayList<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> var7 = new java.util.ArrayList<>();
      for (IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl var9 : param1) {
         boolean var10 = param2.isEmpty()
            || StringsKt.contains(var9.b(), param2, true)
            || StringsKt.contains(var9.f(), param2, true);
         if (!var10) {
            continue;
         }
         if (!(param3.isEmpty() || param3.contains(var9.k()))) {
            continue;
         }
         if ("yes".equals(param4) && !var9.e()) {
            continue;
         }
         if ("no".equals(param4) && var9.e()) {
            continue;
         }
         int var11 = var9.d();
         if (var11 < param5.getFirst() || var11 > param5.getLast()) {
            continue;
         }
         var7.add(var9);
      }

      switch (param6) {
         case lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII:
            java.util.Comparator<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> var12 =
               (var14, var15) -> Long.compare(var15.h(), var14.h());
            return CollectionsKt.sortedWith(var7, var12);
         case IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl:
         case lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI:
            java.util.Comparator<IlIllllllIlIlIllIlIIlllIIlIIIIllIllIIlIIIIlIIlIlIlllIIlIIllllIIIlIlIIlIIIlllIllIIlIIl> var16 =
               (var14, var15) -> Integer.compare(var15.g(), var14.g());
            return CollectionsKt.sortedWith(var7, var16);
         default:
            throw new NoWhenBranchMatchedException();
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
