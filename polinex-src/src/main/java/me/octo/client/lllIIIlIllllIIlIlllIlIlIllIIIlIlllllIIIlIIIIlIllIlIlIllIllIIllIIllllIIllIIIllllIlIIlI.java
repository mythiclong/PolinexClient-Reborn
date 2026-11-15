package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

public final class lllIIIlIllllIIlIlllIlIlIllIIIlIlllllIIIlIIIIlIllIlIlIllIllIIllIIllllIIllIIIllllIlIIlI
   extends llllIIllIIlIIlllllllIIlIIIIllllllllIIIIIlIlIlIIlllIlIIIIIIllIlIlIIlIlIIlllIIIlllllIll {
   
   @NotNull
   private final List<IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayList<>();
   @Nullable
   private IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
   private int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 1;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] e;
   private static String[] f;

   private final float d() {
      return ((float[])lIllIlllllllIIlllIllIIlIllIIlIIlIIllllIIIllllIlllIllllIlIlIIllIIIIIIIlIIIIllllIllIIIl.a())[this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI];
   }

   @Override
   protected void init() {
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      super.init();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
      Iterable var2 = IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      boolean var3 = false;
      Iterator var4 = var2.iterator();
      boolean var1 = var10000;

      while (var4.hasNext()) {
         Object var5 = var4.next();
         lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII var6 = (lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII)var5;
         boolean var7 = false;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            .add(new IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl(var6));
         if (var1 && var1) {
            continue;
         }
         break;
      }
   }

   @Override
   public void a(int var1, int var2) {
   }

   @Override
   public void extractRenderState(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      boolean var5;
      byte var6;
      float var13;
      label29: {
         boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
         short var10002 = -22831;
         short var10003 = 2602;
         Intrinsics.checkNotNullParameter(var1, "context");
         short var10001 = -22843;
         var10002 = 31663;
         String var16 = System.getProperty("os.name");
         var10003 = -22845;
         short var10004 = 15046;
         Intrinsics.checkNotNullExpressionValue(var16, "getProperty(...)");
         String var17 = var16.toLowerCase(Locale.ROOT);
         var10003 = -22805;
         var10004 = 839;
         Intrinsics.checkNotNullExpressionValue(var17, "toLowerCase(...)");
         CharSequence var18 = var17;
         var10002 = -22801;
         var10003 = 23662;
         var6 = ((byte)((StringsKt.contains(var18, "mac", false)) ? 1 : 0));
         var5 = var10000;
         int var12 = var6;
         if (!var5) {
            if (var6 != 0) {
               var13 = this.a().getWindow().getScreenWidth();
               break label29;
            }

            var12 = this.a().getWindow().getWidth();
         }

         var13 = var12;
      }

      float var7;
      label23: {
         var7 = var13;
         int var14 = var6;
         if (!var5) {
            if (var6 != 0) {
               var13 = this.a().getWindow().getScreenHeight();
               break label23;
            }

            var14 = this.a().getWindow().getHeight();
         }

         var13 = var14;
      }

      float var8 = var13;
      Pair var9 = this.a(var2, var3, var7, var8, var1, (var6 != 0));
      float var10 = ((Number)var9.component1()).floatValue();
      float var11 = ((Number)var9.component2()).floatValue();
      me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            var1,
            0,
            0,
            var1.guiWidth(),
            var1.guiHeight(),
            lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .p(),
            null
         );
      super.extractRenderState(var1, var2, var3, var4);
      if (var5) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
         );
      }
   }

   private final void a(float var1, float var2) {
      Object var8 = null; // PX-FIX
      float var4 = this.d();
      int var5 = 419430399;
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      float var6 = var4;
      boolean var3 = var10000;

      while (true) {
         if (var6 < var1) {
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var6, 0.0F, 1.0F, var2, var5);
            var8 = var6 + var4;
            if (!var3) {
               break;
            }

            var6 =((Float)( var8));
            if (var3) {
               continue;
            }
         }

         var8 = var4;
         break;
      }

      float var7 =((Float)( var8));

      while (var7 < var2) {
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(0.0F, var7, var1, 1.0F, var5);
         var7 += var4;
         if (!var3) {
            break;
         }
      }
   }

   private final void b(float var1) {
      Collection var36 = null; // PX-FIX
      Pair[] var4 = new Pair[9];
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      int var10003 = -22837;
      short var10004 = 31823;
      var10004 = -22840;
      short var10005 = -16074;
      var4[0] = TuplesKt.to("Drag", "move");
      var10003 = (short)-22847;
      var10004 = -11260;
      var10004 = -22825;
      var10005 = -31690;
      var4[1] = TuplesKt.to("Mid", "toggle");
      boolean var2 = var10000;
      short var10002 = -22802;
      var10003 = (short)-28662;
      var10003 = (short)-22839;
      var10004 = -142;
      var4[2] = TuplesKt.to("Right", "help");
      var10002 = -22803;
      var10003 = (short)5437;
      var10003 = (short)-22836;
      var10004 = 26544;
      var4[3] = TuplesKt.to("Scroll", "scale");
      var10002 = -22829;
      var10003 = (short)21853;
      var10003 = (short)-22841;
      var10004 = 31627;
      var4[4] = TuplesKt.to("Shift", "free");
      var10002 = -22826;
      var10003 = (short)-7330;
      var10003 = (int)this.d();
      var10004 = -22813;
      var10005 = 11426;
      var4[5] = TuplesKt.to("↑↓", var10003 + "px");
      short var50 = -22823;
      var10004 = -8557;
      var4[6] = TuplesKt.to("G", "grid");
      var50 = -22806;
      var10004 = -7437;
      var4[7] = TuplesKt.to("R", "reset");
      var10002 = -22817;
      var50 = -22118;
      var50 = -22830;
      var10004 = -5087;
      var4[8] = TuplesKt.to("ESC", "save");
      List var3 = CollectionsKt.listOf(var4);
      float var25 = 8.0F;
      float var5 = 22.0F;
      float var6 = 11.0F;
      float var7 = 6.0F;
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e()
         .a(0.85F);
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .y()
         .a(0.5F);
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .ah();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var11 = IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      Iterable var13 = var3;
      boolean var14 = false;
      Collection var16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var13, 10));
      int var17 = 0;
      Iterator var18 = var13.iterator();

      while (true) {
         if (var18.hasNext()) {
            Object var19 = var18.next();
            var36 = var16;
            Pair var20 = (Pair)var19;
            if (!var2) {
               break;
            }

            boolean var21 = false;
            String var22 = (String)var20.component1();
            String var23 = (String)var20.component2();
            var16.add(
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var22, var6, null)
                  + 4.0F
                  + me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var23, var6, null)
                  + var25 * 2.0F
            );
            if (var2) {
               continue;
            }
         }

         var36 = var16;
         break;
      }

      List var12 = (List)var36;
      float var26 = CollectionsKt.sumOfFloat(var12) + var7 * (var3.size() - 1);
      float var27 = (var1 - var26) / 2.0F;
      float var15 = 14.0F;
      Iterator var28 = var3.iterator();
      var17 = 0;

      while (var28.hasNext()) {
         int var30 = var17++;
         Pair var31 = (Pair)var28.next();
         String var32 = (String)var31.component1();
         String var33 = (String)var31.component2();
         float var34 = ((Number)var12.get(var30)).floatValue();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var27, var15, var34, var5, var8, 6.0F);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var27, var15, var34, var5, 1.0F, var9, 6.0F
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var32, var27 + var25, var15 + 6.0F, var6, var10, null);
         float var35 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var32, var6, null);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var33, var27 + var25 + var35 + 4.0F, var15 + 6.0F, var6, var11, null);
         var27 += var34 + var7;
         if (!var2) {
            break;
         }
      }
   }

   private final void c(float var1) {
      Pair[] var4 = new Pair[14];
      int var10000 = ((lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w()) ? 1 : 0);
      short var10003 = -22848;
      short var10004 = -28759;
      var4[0] = TuplesKt.to("HUD EDITOR", true);
      var4[1] = TuplesKt.to("", false);
      var10003 = -22833;
      var10004 = 16526;
      var4[2] = TuplesKt.to("• Drag = move (snaps to grid)", false);
      var10003 = -22808;
      var10004 = 27754;
      var4[3] = TuplesKt.to("• Shift + drag = free placement", false);
      var10003 = -22807;
      var10004 = 29944;
      var4[4] = TuplesKt.to("• Middle-click = toggle on/off", false);
      var10003 = -22832;
      var10004 = 14472;
      var4[5] = TuplesKt.to("• Right-click panel = hide this help", false);
      var10003 = -22804;
      var10004 = -14741;
      var4[6] = TuplesKt.to("• Scroll on element = resize", false);
      var10003 = -22838;
      var10004 = -2064;
      var4[7] = TuplesKt.to("• ↑ / ↓ = grid density", false);
      var10003 = -22828;
      var10004 = -8306;
      var4[8] = TuplesKt.to("• R = reset selected to default", false);
      var10003 = -22835;
      var10004 = 17463;
      var4[9] = TuplesKt.to("• G = toggle grid", false);
      var10003 = -22824;
      var10004 = -20321;
      var4[10] = TuplesKt.to("• ESC = save & close", false);
      var4[11] = TuplesKt.to("", false);
      var10003 = -22814;
      var10004 = 7224;
      var4[12] = TuplesKt.to("Disabled elements are dimmed — middle-click", false);
      var10003 = -22822;
      var10004 = 10693;
      var4[13] = TuplesKt.to("to bring them back.", false);
      List var3 = CollectionsKt.listOf(var4);
      boolean var2 = (var10000 != 0);
      float var20 = 12.0F;
      float var5 = 4.0F;
      float var6 = 12.0F;
      float var7 = 10.5F;
      float var8 = 0.0F;
      float var9 = var20 * 2.0F;

      for (Pair var11 :((Pair[])(Object)( var3))) {
         String var12 = (String)var11.component1();
         boolean var13 = (Boolean)var11.component2();
         var10000 = var12.length();
         if (var2) {
            var10000 = var10000 == 0 ? 1 : 0;
         }

         if (var10000 != 0) {
            var9 += 6.0F;
            if (var2) {
               continue;
            }
         }

         float var14 = var13 ? var6 : var7;
         var8 = Math.max(
            var8, me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var12, var14, null)
         );
         var9 += var14 + var5;
         if (!var2) {
            break;
         }
      }

      float var21 = var8 + var20 * 2.0F;
      float var22 = 14.0F;
      float var23 = var1 - var9 - 14.0F;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var22;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var23;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var21;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var9;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var22,
         var23,
         var21,
         var9,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.85F),
         6.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var22,
         var23,
         var21,
         var9,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.5F),
         6.0F
      );
      float var24 = var23 + var20;

      for (Pair var15 :((Pair[])(Object)( var3))) {
         String var16 = (String)var15.component1();
         boolean var17 = (Boolean)var15.component2();
         var10000 = var16.length();
         if (var2) {
            var10000 = var10000 == 0 ? 1 : 0;
         }

         if (var10000 != 0) {
            var24 += 6.0F;
            if (var2) {
               continue;
            }
         }

         float var18 = var17 ? var6 : var7;
         me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var19 = var17
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ah()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var16, var22 + var20, var24, var18, var19, null);
         var24 += var18 + var5;
         if (!var2) {
            break;
         }
      }
   }

   private final void d(float var1) {
      short var10000 = -22827;
      short var10001 = -2929;
      String var2 = "? Help";
      float var3 = 8.0F;
      float var4 = 20.0F;
      float var5 = 11.0F;
      float var6 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var2, var5, null)
         + var3 * 2.0F;
      float var7 = 14.0F;
      float var8 = var1 - var4 - 14.0F;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var7;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var8;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var6;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var4;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var7,
         var8,
         var6,
         var4,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.85F),
         5.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var7,
         var8,
         var6,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.5F),
         5.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var2,
         var7 + var3,
         var8 + 5.0F,
         var5,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah(),
         null);
   }

   private final void a(IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var1) {
      Object var24 = null; // PX-FIX
      lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII var3 = var1.a();
      short var10000 = ((short)((lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x()) ? 1 : 0));
      float var4 = var3.k() + var3.d(var3.q()) * var3.g();
      boolean var2 = (var10000 != 0);
      float var5 = var3.l();
      float var6 = var3.q() * var3.g();
      float var7 = var3.r() * var3.g();
      String var19;
      if (var3.p()) {
         var10000 = -22834;
         short var10001 = -10226;
         var19 = "ON";
      } else {
         var10000 = -22846;
         short var25 = -21077;
         var19 = "OFF";
      }

      String var9;
      float var12;
      float var13;
      float var14;
      float var16;
      float var17;
      label18: {
         String var8 = var19;
         var10000 = -22844;
         short var26 = 4307;
         String var10 = "%s  •  %.1fx";
         Object[] var11 = new Object[]{var8, var3.g()};
         String var22 = String.format(var10, Arrays.copyOf(var11, var11.length));
         short var10002 = -22821;
         short var10003 = 27700;
         Intrinsics.checkNotNullExpressionValue(var22, "format(...)");
         var9 = var22;
         var16 = 11.0F;
         var17 = 8.0F;
         var12 = 18.0F;
         var13 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var9, var16, null)
            + var17 * 2.0F;
         var14 = var4 + var6 - var13;
         float var23 = var5 - var12 - 6.0F;
         float var27 = 6.0F;
         if (!var2) {
            if (var23 >= 6.0F) {
               var24 = var5 - var12 - 6.0F;
               break label18;
            }

            var23 = var5 + var7;
            var27 = 6.0F;
         }

         var24 = var23 + var27;
      }

      float var15 =((Float)( var24));
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var14,
         var15,
         var13,
         var12,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.9F),
         6.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var14,
         var15,
         var13,
         var12,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.55F),
         6.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var9,
         var14 + var17,
         var15 + 4.0F,
         var16,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         null);
   }

   private final IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl b(int var1, int var2) {
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
      Iterator var4 = CollectionsKt.asReversedMutable(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl).iterator();
      boolean var3 = var10000;

      while (var4.hasNext()) {
         IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var5 = (IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl)var4.next();
         IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var6 = var5;

         while (var6.a(var1, var2)) {
            var6 = var5;
            if (!var3) {
               return var5;
            }
         }
      }

      return null;
   }

   private final boolean a(float var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var7 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
      float var8;
      int var10000 = (var8 = var1 - var3) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
      if (!var7) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var9;
         var10000 = (var9 = var1 - (var3 + var5)) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      }

      if (!var7) {
         if (var10000 > 0) {
            return (0 != 0);
         }

         float var10;
         var10000 = (var10 = var2 - var4) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      }

      if (!var7) {
         if (var10000 < 0) {
            return (0 != 0);
         }

         float var11;
         var10000 = (var11 = var2 - (var4 + var6)) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      }

      if (var7) {
         return (var10000 != 0);
      } else {
         return (var10000 <= 0);
      }
   }

   private final Pair<Float, Float> a(int var1, int var2, float var3, float var4, GuiGraphicsExtractor var5, boolean var6) {
      boolean var7 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
      int var10000 =(( var6) ? 1 : 0);
      if (!var7) {
         if (!var6) {
            return TuplesKt.to(var1 * var3 / var5.guiWidth(), var2 * var4 / var5.guiHeight());
         }

         var10000 = var1 * this.a().getWindow().getGuiScale();
      }

      return TuplesKt.to((float)var10000, (float)(var2 * this.a().getWindow().getGuiScale()));
   }

   private final boolean e() {
      int var10000 = ((lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w()) ? 1 : 0);
      long var2 = this.a().getWindow().handle();
      boolean var1 = (var10000 != 0);
      var10000 = GLFW.glfwGetKey(var2, 340);
      if (var1) {
         if (var10000 != 1) {
            var10000 = GLFW.glfwGetKey(var2, 344);
            if (!var1) {
               return (var10000 != 0);
            }

            if (var10000 != 1) {
               return (0 != 0);
            }
         }

         var10000 = 1;
      }

      return (var10000 != 0);
   }

   private final Pair<Float, Float> a(double var1, double var3) {
      int var10000 = ((lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x()) ? 1 : 0);
      short var10001 = -22818;
      short var10002 = -32179;
      String var11 = System.getProperty("os.name");
      short var10003 = -22819;
      short var10004 = -25464;
      Intrinsics.checkNotNullExpressionValue(var11, "getProperty(...)");
      String var12 = var11.toLowerCase(Locale.ROOT);
      var10003 = -22820;
      var10004 = -7369;
      Intrinsics.checkNotNullExpressionValue(var12, "toLowerCase(...)");
      CharSequence var13 = var12;
      var10002 = -22842;
      var10003 = -11953;
      byte var6 = ((byte)((StringsKt.contains(var13, "mac", false)) ? 1 : 0));
      boolean var5 = (var10000 != 0);
      var10000 = var6;
      if (!var5) {
         if (var6 == 0) {
            return TuplesKt.to((float)(var1 * this.a().getWindow().getGuiScale()), (float)(var3 * this.a().getWindow().getGuiScale()));
         }

         var10000 = this.a().getWindow().getScreenWidth();
      }

      float var7 = var10000;
      float var8 = this.a().getWindow().getScreenHeight();
      return TuplesKt.to((float)var1 * var7 / this.a().getWindow().getGuiScaledWidth(), (float)var3 * var8 / this.a().getWindow().getGuiScaledHeight());
   }

   @Override
   public boolean a(double var1, double var3, int var5) {
      IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var13 = null; // PX-FIX
      boolean var6;
      float var8;
      float var9;
      int var12;
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
      Pair var7 = this.a(var1, var3);
      var6 = var10000;
      var8 = ((Number)var7.component1()).floatValue();
      var9 = ((Number)var7.component2()).floatValue();
      var12 = ((this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) ? 1 : 0);
      label72:
      if (!var6) {
         if (this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
            var12 = var5;
            if (var6) {
               break label72;
            }

            if (var5 == 1) {
               var12 = ((this.a(
                  var8,
                  var9,
                  this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll,
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
               )) ? 1 : 0);
               if (var6) {
                  break label72;
               }

               if (var12 != 0) {
                  this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = false;
                  return true;
               }
            }
         }

         var12 = ((this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) ? 1 : 0);
      }

      label62:
      if (!var6) {
         if (var12 == 0) {
            var12 = ((this.a(
               var8,
               var9,
               this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
               this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl,
               this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl,
               this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
            )) ? 1 : 0);
            if (var6) {
               break label62;
            }

            if (var12 != 0) {
               this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = true;
               return true;
            }
         }

         var12 = var5;
      }

      label80: {
         if (!var6) {
            if (var12 == 2) {
               IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var10 = this.b((int)var8, (int)var9);
               var13 = var10;
               if (var6) {
                  break label80;
               }

               if (var10 != null) {
                  var13 = var10;
                  break label80;
               }
            }

            var12 = var5;
         }

         if (!var6) {
            if (var12 == 0) {
               IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var11 = this.b((int)var8, (int)var9);
               if (var6) {
                  return true;
               }

               if (var11 != null) {
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var11;
                  this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var11;
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var8 - var11.a().k();
                  this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var9 - var11.a().l();
                  return true;
               }

               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = null;
            }

            var12 = ((super.a(var1, var3, var5)) ? 1 : 0);
         }

         return (var12 != 0);
      }

      var13.a().v();
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
      return true;
   }

   @Override
   public boolean b(double var1, double var3, int var5) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = null;
      return super.b(var1, var3, var5);
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      boolean var9;
      IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var15;
      label37: {
         boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
         Pair var10 = this.a(var1, var3);
         var9 = var10000;
         float var11 = ((Number)var10.component1()).floatValue();
         float var12 = ((Number)var10.component2()).floatValue();
         lllIIIlIllllIIlIlllIlIlIllIIIlIlllllIIIlIIIIlIllIlIlIllIllIIllIIllllIIllIIIllllIlIIlI var14 = this;
         if (!var9) {
            var15 = this.b((int)var11, (int)var12);
            if (var15 != null) {
               break label37;
            }

            var14 = this;
         }

         var15 = var14.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var13 = var15;
      if (var13 == null) {
         return super.mouseScrolled(var1, var3, var5, var7);
      } else {
         double var17;
         int var16 = (var17 = var7 - 0.0) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
         if (!var9) {
            if (var16 > 0) {
               var13.a().h();
               if (!var9) {
                  return (1 != 0);
               }
            }

            double var18;
            var16 = (var18 = var7 - 0.0) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
         }

         if (var9) {
            return (var16 != 0);
         } else {
            if (var16 < 0) {
               var13.a().i();
            }

            return (1 != 0);
         }
      }
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      boolean var4 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      int var10000 = var1;
      if (var4) {
         switch (var1) {
            case 71:
               boolean var10001 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               if (var4) {
                  var10001 = !this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               }

               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var10001;
               return true;
            case 82:
               if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
                  lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII var9 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                     .a();
                  if (var9 != null) {
                     var9.j();
                  }
               }

               return true;
            case 264:
               var10000 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
               if (var4) {
                  if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI > 0) {
                     int var6 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                     this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var6 + -1;
                  }

                  var10000 = 1;
               }

               return (var10000 != 0);
            case 265:
               var10000 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
               if (var4) {
                  if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                     < lIllIlllllllIIlllIllIIlIllIIlIIlIIllllIIIllllIlllIllllIlIlIIllIIIIIIIlIIIIllllIllIIIl.a().length - 1) {
                     int var5 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI++;
                  }

                  var10000 = 1;
               }

               return (var10000 != 0);
            default:
               var10000 = ((super.a(var1, var2, var3)) ? 1 : 0);
         }
      }

      return (var10000 != 0);
   }

   @Override
   public void onClose() {
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
      super.onClose();
   }

   private static final Unit a(
      float var0, float var1, lllIIIlIllllIIlIlllIlIlIllIIIlIlllllIIIlIIIIlIllIlIlIllIllIIllIIllllIIllIIIllllIlIIlI var2, float var3, float var4
   ) {
      IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var24 = null; // PX-FIX
      float var22 = 0; // PX-FIX
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(0.0F, 0.0F, var0, var1, -1341848315);
      boolean var5 = var10000;
      lllIIIlIllllIIlIlllIlIlIllIIIlIlllllIIIlIIIIlIllIlIlIllIllIIllIIllllIIllIIIllllIlIIlI var19 = var2;
      if (!var5) {
         if (var2.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
            var2.a(var0, var1);
         }

         var19 = var2;
      }

      if (var19.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
         IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var8;
         label89: {
            var8 = var19.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            boolean var9 = false;
            lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII var21 = var8.a();
            if (!var5) {
               if (!var21.t()) {
                  var22 = 0.0F;
                  break label89;
               }

               var21 = var8.a();
            }

            var22 = var21.q() * var8.a().g();
         }

         float var10 = var22;
         float var11 = var3 - var2.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + var10;
         float var12 = var4 - var2.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         if (!var5) {
            label81:
            if (var2.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
               lllIIIlIllllIIlIlllIlIlIllIIIlIlllllIIIlIIIIlIllIlIlIllIllIIllIIllllIIllIIIllllIlIIlI var23 = var2;
               if (!var5) {
                  if (var2.e()) {
                     break label81;
                  }

                  var23 = var2;
               }

               float var13 = var23.d();
               var11 = MathKt.roundToInt(var11 / var13) * var13;
               var12 = MathKt.roundToInt(var12 / var13) * var13;
            }

            var8.a().a(var11 / var0, var12 / var1);
         }
      }

      var2.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2.b((int)var3, (int)var4);
      Iterator var6 = var2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.iterator();

      IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var10001;
      while (true) {
         if (var6.hasNext()) {
            IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var7 = (IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl)var6.next();
            var24 = var7;
            var10001 = var2.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var5) {
               break;
            }

            boolean var14 = var7 == var2.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            boolean var16 = var7 == var2.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            boolean var18 = var7.a().p();
            var7.a(var14, var16, var18);
            if (!var5) {
               continue;
            }
         }

         var24 = var2.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         var10001 = var2.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         break;
      }

      if (!var5) {
         if (var10001 == null) {
            var24 = var2.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         var10001 = var24;
      }

      if (var10001 != null) {
         IlIIllIllIlIIlllIlllllIIllIIIllIlIIIIlIIlllIIlIIIIlllIIlIIlllIllIllIlIIIIIllllIllIlIl var15 = var24;
         boolean var17 = false;
         var2.a(var15);
      }

      var2.b(var0);
      lllIIIlIllllIIlIlllIlIlIllIIIlIlllllIIIlIIIIlIllIlIlIllIllIIllIIllllIIllIIIllllIlIIlI var25 = var2;
      if (!var5) {
         if (var2.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl) {
            var2.c(var1);
            if (!var5) {
               return Unit.INSTANCE;
            }
         }

         var25 = var2;
      }

      var25.d(var1);
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[42];
      int var3 = 0;
      String var2 = "#!^\u009f\u0016ₕ\u0089⇒Õâ\b⅋\u0010~\u0091ÒP\u000e\u001c°ÄÀþ\u0096£õ\\\u0004Ëjç\u0014\u0004Mã\u0088{\u001d⁇\u008a]ç2\u0011e\u0081cPÇ\u0088©ÇÁdì\u0010z\u008a_-kèh\u007fYùS\u0002*ü\u0011 \u0013\u0016\u0086db,\u0012Ó0}ÜØ{XFÄ\u0005o/\u0006fÜ\u0010\u001d\u008aË(Å\u0086º\"\u0090n·+8(×\f\u0003{m\u0018\u0003å¨«\n\u0015+0Z»\u009d\u009d>WÜ\u0004\u000f\u0012¹û\u0003¦1à\u0007/\u001eÞPerÊ\f<¶±\u000b Ó\u0088nÐêw\u0006\u000bi±b9%%\u008fe9þ\u0005\u0013¿!º$5uº\u0098\u001f{OÄW?]iqë;\u0004d£ùÌ\u0014₷½B Ò«\u0002db^Ç×Ö[Ë!¦¤rÅ\u0003ñï\u0007\u0007\u0093ÝI(\u0097}\u0094\u0010]jÃ4Ä\u0005\u009aR\u0094`7ê(\u0010Õ\u000b\u0010¥S\u0095g4½#(òÊ\u0096X\u0083F Á\u0005`:Ë¤}\u0004é·Á>\u0007\u0012ç´êdi\u007f$\u20fd\u0016\u001coÈw¨³G\u0005n\u0016T£éúº\u0097¬\u00ad\u0007¤ÙNÚÜ%hýU>.\u00862\u0097ê\u0006¬ü\u009f\u009a \u000b\u0002ℂ↔\u0006\u0083~wn÷Â\u001f⁇-KAx\u009a©\u0007±Û¿¦ÈÛ}\u001cºÞ\tó\u0086÷P³\f\u0003¹\u0086ý:\u0087\u0010;õF³N'l{\u001b «\u0015$ïTô\u0005üãG0µ\u001e\u2069ö\u0091s\u0086ø\u001a\u0087DÍ\u008cë¥\u001c\u008esB`7'M\u0016\u008c\u0094×ìá\u001f\u0085Ì\u001f‽$\u0005(Ä°æ\u0089Æ¢\u00126}Ó×\u0007iüOæþ \u00adÛJÍ×\u0095C×B\u0003\u0097tÆ\u0005\u00ad\t]í`\u0006ÓÂ¦Ø°C\u001c‒ìà:c\u0091rÉD \"\u00924T?ÍÜ÷\u0012ËËhZÛäïM\u0092";
      int var4 = "#!^\u009f\u0016ₕ\u0089⇒Õâ\b⅋\u0010~\u0091ÒP\u000e\u001c°ÄÀþ\u0096£õ\\\u0004Ëjç\u0014\u0004Mã\u0088{\u001d⁇\u008a]ç2\u0011e\u0081cPÇ\u0088©ÇÁdì\u0010z\u008a_-kèh\u007fYùS\u0002*ü\u0011 \u0013\u0016\u0086db,\u0012Ó0}ÜØ{XFÄ\u0005o/\u0006fÜ\u0010\u001d\u008aË(Å\u0086º\"\u0090n·+8(×\f\u0003{m\u0018\u0003å¨«\n\u0015+0Z»\u009d\u009d>WÜ\u0004\u000f\u0012¹û\u0003¦1à\u0007/\u001eÞPerÊ\f<¶±\u000b Ó\u0088nÐêw\u0006\u000bi±b9%%\u008fe9þ\u0005\u0013¿!º$5uº\u0098\u001f{OÄW?]iqë;\u0004d£ùÌ\u0014₷½B Ò«\u0002db^Ç×Ö[Ë!¦¤rÅ\u0003ñï\u0007\u0007\u0093ÝI(\u0097}\u0094\u0010]jÃ4Ä\u0005\u009aR\u0094`7ê(\u0010Õ\u000b\u0010¥S\u0095g4½#(òÊ\u0096X\u0083F Á\u0005`:Ë¤}\u0004é·Á>\u0007\u0012ç´êdi\u007f$\u20fd\u0016\u001coÈw¨³G\u0005n\u0016T£éúº\u0097¬\u00ad\u0007¤ÙNÚÜ%hýU>.\u00862\u0097ê\u0006¬ü\u009f\u009a \u000b\u0002ℂ↔\u0006\u0083~wn÷Â\u001f⁇-KAx\u009a©\u0007±Û¿¦ÈÛ}\u001cºÞ\tó\u0086÷P³\f\u0003¹\u0086ý:\u0087\u0010;õF³N'l{\u001b «\u0015$ïTô\u0005üãG0µ\u001e\u2069ö\u0091s\u0086ø\u001a\u0087DÍ\u008cë¥\u001c\u008esB`7'M\u0016\u008c\u0094×ìá\u001f\u0085Ì\u001f‽$\u0005(Ä°æ\u0089Æ¢\u00126}Ó×\u0007iüOæþ \u00adÛJÍ×\u0095C×B\u0003\u0097tÆ\u0005\u00ad\t]í`\u0006ÓÂ¦Ø°C\u001c‒ìà:c\u0091rÉD \"\u00924T?ÍÜ÷\u0012ËËhZÛäïM\u0092"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 108;
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
                     case 0 -> 27;
                     case 1 -> 2;
                     case 2 -> 21;
                     case 3 -> 65;
                     case 4 -> 119;
                     case 5 -> 127;
                     default -> 65;
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
                     f = new String[42];
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

                  var2 = "\u009c\u0003+\u007fg¢Lz{/\u009a¢,\u0099xl\u0088S\u0002H\u001f$f\u0087 ó«~\r¹.®ₗ#\u008cxæ\u0004(£;[ÒÞó\u0084";
                  var4 = "\u009c\u0003+\u007fg¢Lz{/\u009a¢,\u0099xl\u0088S\u0002H\u001f$f\u0087 ó«~\r¹.®ₗ#\u008cxæ\u0004(£;[ÒÞó\u0084".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 4;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ -22837) & 65535;
      if (f[var2] == null) {
         char[] var3 = e[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 57;
            case 1 -> 198;
            case 2 -> 228;
            case 3 -> 222;
            case 4 -> 207;
            case 5 -> 205;
            case 6 -> 244;
            case 7 -> 128;
            case 8 -> 246;
            case 9 -> 10;
            case 10 -> 182;
            case 11 -> 125;
            case 12 -> 104;
            case 13 -> 84;
            case 14 -> 121;
            case 15 -> 200;
            case 16 -> 161;
            case 17 -> 209;
            case 18 -> 241;
            case 19 -> 31;
            case 20 -> 187;
            case 21 -> 38;
            case 22 -> 96;
            case 23 -> 25;
            case 24 -> 69;
            case 25 -> 91;
            case 26 -> 76;
            case 27 -> 43;
            case 28 -> 214;
            case 29 -> 173;
            case 30 -> 188;
            case 31 -> 39;
            case 32 -> 178;
            case 33 -> 230;
            case 34 -> 171;
            case 35 -> 27;
            case 36 -> 103;
            case 37 -> 239;
            case 38 -> 119;
            case 39 -> 18;
            case 40 -> 183;
            case 41 -> 44;
            case 42 -> 59;
            case 43 -> 123;
            case 44 -> 87;
            case 45 -> 137;
            case 46 -> 150;
            case 47 -> 169;
            case 48 -> 124;
            case 49 -> 54;
            case 50 -> 0;
            case 51 -> 66;
            case 52 -> 47;
            case 53 -> 107;
            case 54 -> 100;
            case 55 -> 141;
            case 56 -> 116;
            case 57 -> 140;
            case 58 -> 223;
            case 59 -> 13;
            case 60 -> 56;
            case 61 -> 19;
            case 62 -> 72;
            case 63 -> 179;
            case 64 -> 254;
            case 65 -> 157;
            case 66 -> 202;
            case 67 -> 51;
            case 68 -> 74;
            case 69 -> 218;
            case 70 -> 184;
            case 71 -> 235;
            case 72 -> 5;
            case 73 -> 206;
            case 74 -> 2;
            case 75 -> 101;
            case 76 -> 15;
            case 77 -> 95;
            case 78 -> 129;
            case 79 -> 108;
            case 80 -> 40;
            case 81 -> 144;
            case 82 -> 35;
            case 83 -> 213;
            case 84 -> 63;
            case 85 -> 170;
            case 86 -> 208;
            case 87 -> 240;
            case 88 -> 120;
            case 89 -> 92;
            case 90 -> 132;
            case 91 -> 80;
            case 92 -> 155;
            case 93 -> 252;
            case 94 -> 11;
            case 95 -> 78;
            case 96 -> 20;
            case 97 -> 97;
            case 98 -> 127;
            case 99 -> 28;
            case 100 -> 99;
            case 101 -> 36;
            case 102 -> 176;
            case 103 -> 138;
            case 104 -> 77;
            case 105 -> 159;
            case 106 -> 185;
            case 107 -> 221;
            case 108 -> 61;
            case 109 -> 164;
            case 110 -> 106;
            case 111 -> 243;
            case 112 -> 114;
            case 113 -> 24;
            case 114 -> 231;
            case 115 -> 26;
            case 116 -> 152;
            case 117 -> 122;
            case 118 -> 168;
            case 119 -> 227;
            case 120 -> 109;
            case 121 -> 247;
            case 122 -> 89;
            case 123 -> 165;
            case 124 -> 50;
            case 125 -> 105;
            case 126 -> 167;
            case 127 -> 46;
            case 128 -> 12;
            case 129 -> 113;
            case 130 -> 238;
            case 131 -> 175;
            case 132 -> 75;
            case 133 -> 7;
            case 134 -> 215;
            case 135 -> 67;
            case 136 -> 174;
            case 137 -> 85;
            case 138 -> 224;
            case 139 -> 250;
            case 140 -> 98;
            case 141 -> 32;
            case 142 -> 112;
            case 143 -> 162;
            case 144 -> 117;
            case 145 -> 146;
            case 146 -> 37;
            case 147 -> 42;
            case 148 -> 34;
            case 149 -> 245;
            case 150 -> 68;
            case 151 -> 229;
            case 152 -> 197;
            case 153 -> 79;
            case 154 -> 110;
            case 155 -> 16;
            case 156 -> 191;
            case 157 -> 71;
            case 158 -> 52;
            case 159 -> 204;
            case 160 -> 199;
            case 161 -> 29;
            case 162 -> 14;
            case 163 -> 86;
            case 164 -> 70;
            case 165 -> 160;
            case 166 -> 156;
            case 167 -> 83;
            case 168 -> 220;
            case 169 -> 233;
            case 170 -> 62;
            case 171 -> 177;
            case 172 -> 232;
            case 173 -> 201;
            case 174 -> 136;
            case 175 -> 93;
            case 176 -> 142;
            case 177 -> 82;
            case 178 -> 139;
            case 179 -> 251;
            case 180 -> 190;
            case 181 -> 249;
            case 182 -> 1;
            case 183 -> 118;
            case 184 -> 60;
            case 185 -> 3;
            case 186 -> 212;
            case 187 -> 180;
            case 188 -> 158;
            case 189 -> 217;
            case 190 -> 4;
            case 191 -> 33;
            case 192 -> 189;
            case 193 -> 30;
            case 194 -> 181;
            case 195 -> 163;
            case 196 -> 102;
            case 197 -> 126;
            case 198 -> 153;
            case 199 -> 234;
            case 200 -> 9;
            case 201 -> 143;
            case 202 -> 219;
            case 203 -> 8;
            case 204 -> 58;
            case 205 -> 90;
            case 206 -> 17;
            case 207 -> 53;
            case 208 -> 151;
            case 209 -> 147;
            case 210 -> 145;
            case 211 -> 94;
            case 212 -> 45;
            case 213 -> 131;
            case 214 -> 237;
            case 215 -> 134;
            case 216 -> 88;
            case 217 -> 65;
            case 218 -> 130;
            case 219 -> 135;
            case 220 -> 64;
            case 221 -> 23;
            case 222 -> 172;
            case 223 -> 133;
            case 224 -> 225;
            case 225 -> 203;
            case 226 -> 48;
            case 227 -> 111;
            case 228 -> 194;
            case 229 -> 253;
            case 230 -> 211;
            case 231 -> 149;
            case 232 -> 22;
            case 233 -> 49;
            case 234 -> 148;
            case 235 -> 41;
            case 236 -> 248;
            case 237 -> 255;
            case 238 -> 195;
            case 239 -> 210;
            case 240 -> 226;
            case 241 -> 192;
            case 242 -> 193;
            case 243 -> 236;
            case 244 -> 196;
            case 245 -> 154;
            case 246 -> 216;
            case 247 -> 115;
            case 248 -> 73;
            case 249 -> 55;
            case 250 -> 21;
            case 251 -> 242;
            case 252 -> 81;
            case 253 -> 186;
            case 254 -> 6;
            default -> 166;
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
