package me.octo.client;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI
   extends llIllIIlllIIIlIIIIlIIIIIllIllIIIlIIIlllIlIllIlIIIllIllllIIlIllIIllIIllIIIlIIIIlIlllll {
   public static <T> T a(Object p0) { return null; } // PX-FIX mr5
    public static <T> T impl(Object... args) { return null; } // PX-FIX ovld-var
   

   private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final Minecraft IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final List<String> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static int[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] c;
   private static String[] d;

   public lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI(boolean var1) {
      MutableComponent var10001 = Component.empty();
      short var10003 = -19859;
      short var10004 = -8907;
      Intrinsics.checkNotNullExpressionValue(var10001, "empty(...)");
      super(var10001);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      Minecraft var4 = Minecraft.getInstance();
      var10003 = -19842;
      var10004 = 10402;
      Intrinsics.checkNotNullExpressionValue(var4, "getInstance(...)");
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = System.currentTimeMillis();
      int[] var10000 = o();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 1440000L;
      int[] var2 = var10000;
      String[] var3 = new String[13];
      var10003 = -19858;
      var10004 = 22796;
      var3[0] = "go make some food ik ur fatass wants to";
      var10003 = -19844;
      var10004 = 13584;
      var3[1] = "this break brought to u by not getting banned :)";
      var10003 = -19884;
      var10004 = 21838;
      var3[2] = "staring at a loading bar is crazy work icl";
      var10003 = -19860;
      var10004 = -5689;
      var3[3] = "hi get to touching some grass stop peeping...";
      var10003 = -19892;
      var10004 = 32745;
      var3[4] = "yo stop staring at ur monitor ur using a macro for a reason go outside";
      var10003 = -19875;
      var10004 = -2438;
      var3[5] = "go get some water";
      var10003 = -19923;
      var10004 = -16593;
      var3[6] = "uve been sitting a while go stretch real quick";
      var10003 = -19845;
      var10004 = -15846;
      var3[7] = "go outside the sun misses ur pale ass";
      var10003 = -19897;
      var10004 = 1987;
      var3[8] = "ur blinking and breathing manually now fuck u";
      var10003 = -19857;
      var10004 = 4861;
      var3[9] = "go doomscroll for a lil";
      var10003 = -19895;
      var10004 = -15973;
      var3[10] = "fix ur posture";
      var10003 = -19880;
      var10004 = 18224;
      var3[11] = "go piss uve been holding it in i can tell";
      var10003 = -19876;
      var10004 = -29370;
      var3[12] = "go brush your teeth, i can smell that breath through the screen";
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = CollectionsKt.listOf(var3);
      if (var2 != null) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[5]
         );
      }
   }

   @Override
   protected void init() {
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var3;
      label25: {
         int[] var10000 = o();
         super.init();
         int[] var1 = var10000;
         IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var2 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 == null) {
            if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
               short var10007 = -19872;
               short var10008 = 15380;
               var10008 = -19843;
               short var10009 = -30361;
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
                  0.0F,
                  0.0F,
                  10.0F,
                  10.0F,
                  "Reconnect now",
                  "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.8\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n        <polyline points=\"23 4 23 10 17 10\"/>\n        <polyline points=\"1 20 1 14 7 14\"/>\n        <path d=\"M3.51 9a9 9 0 0 1 14.85-3.36L23 10M1 14l4.64 4.36A9 9 0 0 0 20.49 15\"/>\n    </svg>\n",
                  null,
                  () -> a(this),
                  64,
                  null
               );
            }

            var3 = this;
            if (var1 != null) {
               break label25;
            }

            var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         if (var2 != null) {
            return;
         }

         var3 = this;
      }

      short var4 = -19893;
      short var6 = -20300;
      var6 = -19847;
      short var8 = -23451;
      var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl(
         0.0F,
         0.0F,
         10.0F,
         10.0F,
         "Quit to menu",
         "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.9\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n        <path d=\"M12 15L15 12L12 9\"/>\n        <line x1=\"15\" y1=\"12\" x2=\"4\" y2=\"12\"/>\n        <path d=\"M4 7.2 C 4 5.5 4.4 4.7 5.1 4.2 C 5.5 4 6.1 4 7.2 4 H 16.8 C 17.9 4 18.5 4 18.9 4.2 C 19.6 4.7 20 5.5 20 7.2 V 16.8 C 20 18.5 19.6 19.3 18.9 19.8 C 18.5 20 17.9 20 16.8 20 H 7.2 C 6.1 20 5.5 20 5.1 19.8 C 4.4 19.3 4 18.5 4 16.8\"/>\n    </svg>\n",
         null,
         (kotlin.jvm.functions.Function0)(lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI::b),
         64,
         null
      );
   }

   private final void a() {
      label16: {
         int[] var1 = o();
         lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var10000 = this;
         if (var1 == null) {
            if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               break label16;
            }

            var10000 = this;
         }

         var10000.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.setScreen(null);
         if (var1 == null) {
            return;
         }
      }

      IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .g();
   }

   private final void c() {
      int[] var1 = o();
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var10000 = this;
      if (var1 == null) {
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.setScreen(null);
            return;
         }

         IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.a(
            IllIIlIIlIlIlIIIlIlIllIlllIIIllIIIIlllIllIlIIIlIllIIIlIlIlIIIIIIIlllIIIIlIIIIIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            null);
         IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .a(false);
         var10000 = this;
      }

      var10000.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.setScreen(new TitleScreen());
   }

   private final lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
      float var1, float var2
   ) {
      float var3 = RangesKt.coerceIn(Math.min(var1 / 1920.0F, var2 / 1080.0F), 0.55F, 2.2F);
      return new lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var1, var2, var3, 30.0F * var3, 104.0F * var3, 22.0F * var3, 15.0F * var3
      );
   }

   private final float a(
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      return 92.0F * var1.c();
   }

   private final float b(
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      return var1.b() - this.a(var1) - var1.d() * 0.45F;
   }

   @Override
   public void extractRenderState(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      int[] var5;
      byte var6;
      float var16;
      label41: {
         int[] var10000 = o();
         short var10002 = -19849;
         short var10003 = -3272;
         Intrinsics.checkNotNullParameter(var1, "context");
         short var10001 = -19902;
         var10002 = 10302;
         String var20 = System.getProperty("os.name");
         var10003 = -19871;
         short var10004 = -6145;
         Intrinsics.checkNotNullExpressionValue(var20, "getProperty(...)");
         String var21 = var20.toLowerCase(Locale.ROOT);
         var10003 = -19894;
         var10004 = -9534;
         Intrinsics.checkNotNullExpressionValue(var21, "toLowerCase(...)");
         CharSequence var22 = var21;
         var10002 = -19863;
         var10003 = -3885;
         var6 = ((byte)((StringsKt.contains(var22, "mac", false)) ? 1 : 0));
         var5 = var10000;
         int var15 = var6;
         if (var5 == null) {
            if (var6 != 0) {
               var16 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getWindow().getScreenWidth();
               break label41;
            }

            var15 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getWindow().getWidth();
         }

         var16 = var15;
      }

      float var7;
      label35: {
         var7 = var16;
         int var17 = var6;
         if (var5 == null) {
            if (var6 != 0) {
               var16 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getWindow().getScreenHeight();
               break label35;
            }

            var17 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getWindow().getHeight();
         }

         var16 = var17;
      }

      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9;
      float var13;
      float var14;
      label29: {
         float var8 = var16;
         var9 = this.a(var7, var8);
         var13 = 0.0F;
         var14 = 0.0F;
         int var19 = var6;
         if (var5 == null) {
            if (var6 != 0) {
               var13 = var2 * var7 / var1.guiWidth();
               var14 = var3 * var8 / var1.guiHeight();
               if (var5 == null) {
                  break label29;
               }
            }

            var19 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getWindow().getGuiScale();
         }

         float var12 = var19;
         var13 = var2 * var12;
         var14 = var3 * var12;
      }

      me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            var1,
            0,
            0,
            var1.guiWidth(),
            var1.guiHeight(),
            lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .o(),
            null
         );
      super.extractRenderState(var1, var2, var3, var4);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new int[4]);
      }
   }

   private final void c(
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      float var2 = var1.d();
      float var3 = var1.d();
      short var10001 = -19898;
      short var10002 = 21224;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         "\n        <svg width=\"100%\" height=\"100%\" viewBox=\"0 0 1000 1000\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xml:space=\"preserve\" xmlns:serif=\"http://www.serif.com/\" style=\"fill-rule:evenodd;clip-rule:evenodd;stroke-linecap:round;stroke-linejoin:round;stroke-miterlimit:1.5;\">\n    <g id=\"Circles\">\n        <g transform=\"matrix(1,0,0,1,-2.25144,-6.552205)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(1,0,0,1,584.806935,456.451612)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(0.82218,0,0,0.82218,222.150739,559.882122)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(1.574519,0,0,1.574519,-29.287141,-357.025146)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(1.574519,0,0,1.574519,630.504469,94.034301)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(0.747066,0,0,0.747066,545.885729,-137.813619)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n    </g>\n    <g id=\"Top\">\n        <path id=\"Top-Big\" serif:id=\"Top Big\" d=\"M570.165,259.847C570.165,259.847 632.989,289.24 670.928,341.694C671.152,342.004 677.997,337.709 683.361,331.034C688.725,324.359 615.639,251.994 583.949,247.118C582.4,246.88 573.46,246.999 574.413,246.88C575.367,246.761 569.493,256.246 570.165,259.847Z\" style=\"fill:none;stroke:currentColor;stroke-width:1px;\"/>\n        <path d=\"M402.904,514.909C402.904,514.909 404.99,533.533 410.354,533.235C415.718,532.937 453.917,514.704 457.587,511.035C458.034,510.588 454.435,497.142 452.223,493.602C451.478,492.41 402.904,514.909 402.904,514.909Z\" style=\"fill:none;stroke:currentColor;stroke-width:1px;\"/>\n        <g>\n            <path d=\"M269.436,319.737C269.436,319.737 336.262,207.094 500,204.285C661.479,201.514 746.785,319.369 772.1,380.128C772.899,382.046 769.351,390.736 737.424,424.837C699.641,465.194 484.252,636.917 245.047,635.628C243.263,635.619 230.418,631.098 221.664,604.464C212.911,577.831 220.36,582.115 220.919,580.066C221.478,578.017 234.702,581.928 267.854,579.88C301.006,577.831 373.36,554.46 385.376,542.444C385.655,542.164 387.604,531.549 386.307,527.171C384.817,522.143 327.595,554.208 251.091,561.441C246.238,561.9 219.802,562.745 214.959,561.441C210.117,560.137 205.833,550.825 206.392,545.238C206.951,539.65 201.391,510.34 206.578,464.034C206.906,461.107 212.579,454.53 219.627,454.22C228.304,453.838 242.799,463.47 304.115,453.171C332.396,448.421 490.326,396.76 546.095,314.676C547.59,312.475 544.513,311.898 537.726,315.462C530.94,319.026 404.044,425.119 275.254,434.992C266.957,435.628 242.508,435.281 242.508,435.281C242.508,435.281 215.712,435.377 217.715,414.302C219.717,393.228 249.946,347.551 250.423,346.598C250.9,345.644 253.366,343.165 259.1,343.165C260.722,343.165 259.048,349.489 284.561,354.226C313.836,359.662 404.822,334.819 461.628,271.206C463.797,268.777 455.673,268.398 451.889,271.084C448.105,273.769 385.574,327.086 315.159,332.115C312.551,332.301 267.524,335.131 269.436,319.737ZM402.904,514.909C402.904,514.909 404.99,533.533 410.354,533.235C415.718,532.937 453.917,514.704 457.587,511.035C458.034,510.588 454.435,497.142 452.223,493.602C451.478,492.41 402.904,514.909 402.904,514.909ZM574.499,246.915C574.482,246.887 574.454,246.875 574.413,246.88C574.291,246.895 574.332,246.906 574.499,246.915ZM574.499,246.915C574.881,247.554 569.522,256.398 570.165,259.847C570.165,259.847 632.989,289.24 670.928,341.694C671.152,342.004 677.997,337.709 683.361,331.034C688.725,324.359 615.639,251.994 583.949,247.118C582.599,246.91 575.634,246.974 574.499,246.915Z\" fill=\"currentColor\"/>\n            <path id=\"Main-Top\" serif:id=\"Main Top\" d=\"M269.436,319.737C269.436,319.737 336.262,207.094 500,204.285C661.479,201.514 746.785,319.369 772.1,380.128C772.899,382.046 769.351,390.736 737.424,424.837C699.641,465.194 484.252,636.917 245.047,635.628C243.263,635.619 230.418,631.098 221.664,604.464C212.911,577.831 220.36,582.115 220.919,580.066C221.478,578.017 234.702,581.928 267.854,579.88C301.006,577.831 373.36,554.46 385.376,542.444C385.655,542.164 387.604,531.549 386.307,527.171C384.817,522.143 327.595,554.208 251.091,561.441C246.238,561.9 219.802,562.745 214.959,561.441C210.117,560.137 205.833,550.825 206.392,545.238C206.951,539.65 201.391,510.34 206.578,464.034C206.906,461.107 212.579,454.53 219.627,454.22C228.304,453.838 242.799,463.47 304.115,453.171C332.396,448.421 490.326,396.76 546.095,314.676C547.59,312.475 544.513,311.898 537.726,315.462C530.94,319.026 404.044,425.119 275.254,434.992C266.957,435.628 242.508,435.281 242.508,435.281C242.508,435.281 215.712,435.377 217.715,414.302C219.717,393.228 249.946,347.551 250.423,346.598C250.9,345.644 253.366,343.165 259.1,343.165C260.722,343.165 259.048,349.489 284.561,354.226C313.836,359.662 404.822,334.819 461.628,271.206C463.797,268.777 455.673,268.398 451.889,271.084C448.105,273.769 385.574,327.086 315.159,332.115C312.551,332.301 267.524,335.131 269.436,319.737Z\" style=\"fill:none;stroke:currentColor;stroke-width:1px;\"/>\n        </g>\n    </g>\n    <g id=\"Middle\">\n        <g transform=\"matrix(1,0,0,1,3.005268,5.110119)\">\n            <path d=\"M549.076,603.525C549.076,603.525 669.009,552.288 789.524,438.74C789.955,438.334 823.354,459.839 732.777,515.494C715.297,526.235 514.82,670.053 302.808,701.742C301.054,702.004 289.532,704.908 268.145,681.145C267.072,679.953 351.25,680.668 429.777,651.107C508.305,621.546 482.919,631.876 549.076,603.525Z\" fill=\"currentColor\"/>\n            <path id=\"Small-ring\" serif:id=\"Small ring\" d=\"M549.076,603.525C549.076,603.525 669.009,552.288 789.524,438.74C789.955,438.334 823.354,459.839 732.777,515.494C715.297,526.235 514.82,670.053 302.808,701.742C301.054,702.004 289.532,704.908 268.145,681.145C267.072,679.953 351.25,680.668 429.777,651.107C508.305,621.546 482.919,631.876 549.076,603.525Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n        <g>\n            <path d=\"M553.455,572.592C553.455,572.592 732.261,493.331 826.988,348.082C837.646,331.741 853.276,287.691 818.463,262.114C783.649,236.537 727.468,243.25 699.849,241.03C693.075,240.486 667.954,219.845 720.103,219.612C767.363,219.401 793.671,219.612 816.951,230.321C840.232,241.03 865.25,270.6 864.212,303.19C863.048,339.741 843.593,376.654 788.782,434.728C730.864,496.093 498.732,668.516 265.096,678.839C244.501,679.749 84.167,674.121 126.866,546.519C130.7,535.062 134.183,524 152.249,500.084C170.315,476.168 179.069,495.351 171.06,506.34C163.051,517.328 146.848,553.646 145.358,564.076C143.868,574.506 120.587,655.896 269.585,655.524C291.025,655.47 438.525,637.816 553.455,572.592Z\" fill=\"currentColor\"/>\n            <path id=\"Big-Ring-2\" serif:id=\"Big Ring 2\" d=\"M553.455,572.592C553.455,572.592 732.261,493.331 826.988,348.082C837.646,331.741 853.276,287.691 818.463,262.114C783.649,236.537 727.468,243.25 699.849,241.03C693.075,240.486 667.954,219.845 720.103,219.612C767.363,219.401 793.671,219.612 816.951,230.321C840.232,241.03 865.25,270.6 864.212,303.19C863.048,339.741 843.593,376.654 788.782,434.728C730.864,496.093 498.732,668.516 265.096,678.839C244.501,679.749 84.167,674.121 126.866,546.519C130.7,535.062 134.183,524 152.249,500.084C170.315,476.168 179.069,495.351 171.06,506.34C163.051,517.328 146.848,553.646 145.358,564.076C143.868,574.506 120.587,655.896 269.585,655.524C291.025,655.47 438.525,637.816 553.455,572.592Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n        <g>\n            <path d=\"M172.542,421.374C189.382,421.294 181.679,441.787 171.344,450.192C138.241,477.11 76.765,549.863 66.943,571.567C-5.297,731.205 180.628,722.774 222.271,725.803C320.193,732.925 491.002,665.502 553.022,639.614C615.043,613.726 677.435,571.634 680.602,569.771C703.937,556.045 757.708,518.553 783.969,496.576C810.23,474.599 803.152,481.922 862.565,422.162C921.978,362.402 943.252,310.441 945.259,304.826C957.022,271.91 950.846,224.368 909.499,204.237C859.765,180.022 786.768,184.347 776.767,185.597C702.088,194.927 682.126,206.352 654.586,209.414C629.161,212.24 630.888,196.559 638.239,193.518C643.617,191.294 736.069,159.826 826.865,161.455C917.66,163.085 943.885,202.067 948.589,206.981C1013.775,275.078 939.21,368.958 934.659,374.875C714.472,661.176 321.981,741.78 309.317,742.807C282.398,744.989 197.718,767.918 98.179,730.799C-10.224,690.374 32.353,597.46 37.672,582.686C62.075,514.907 172.542,421.374 172.542,421.374Z\" fill=\"currentColor\"/>\n            <path id=\"Big-Ring\" serif:id=\"Big Ring\" d=\"M172.542,421.374C172.542,421.374 62.075,514.907 37.672,582.686C32.353,597.46 -10.224,690.374 98.179,730.799C197.718,767.918 282.398,744.989 309.317,742.807C321.981,741.78 714.472,661.176 934.659,374.875C939.21,368.958 1013.775,275.078 948.589,206.981C943.885,202.067 917.66,163.085 826.865,161.455C736.069,159.826 643.617,191.294 638.239,193.518C630.888,196.559 629.161,212.24 654.586,209.414C682.126,206.352 702.088,194.927 776.767,185.597C786.768,184.347 859.765,180.022 909.499,204.237C950.846,224.368 957.022,271.91 945.259,304.826C943.252,310.441 921.978,362.402 862.565,422.162C803.152,481.922 810.23,474.599 783.969,496.576C757.708,518.553 703.937,556.045 680.602,569.771C677.435,571.634 615.043,613.726 553.022,639.614C491.002,665.502 320.193,732.925 222.271,725.803C180.628,722.774 -5.297,731.205 66.943,571.567C76.765,549.863 138.241,477.11 171.344,450.192C181.679,441.787 189.382,421.294 172.542,421.374Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n    </g>\n    <g id=\"Bottom\">\n        <path id=\"Bottom-Hole\" serif:id=\"Bottom Hole\" d=\"M634.286,696.705C634.286,696.705 645.199,708.71 653.202,709.437C661.205,710.165 668.844,693.795 670.662,691.976C672.481,690.158 657.931,672.697 651.019,674.152C644.108,675.607 633.195,688.339 634.286,696.705Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        <g>\n            <path d=\"M358.606,759.376C349.201,750.386 362.573,743.726 366.556,742.903C592.089,696.342 783.21,541.627 785.976,540.651C792.16,538.468 795.705,546.094 795.891,553.019C796.348,570.115 766.909,636.005 764.566,639.698C592.169,911.542 358.606,759.376 358.606,759.376ZM634.286,696.705C634.286,696.705 645.199,708.71 653.202,709.437C661.205,710.165 668.844,693.795 670.662,691.976C672.481,690.158 657.931,672.697 651.019,674.152C644.108,675.607 633.195,688.339 634.286,696.705Z\" fill=\"currentColor\"/>\n            <path id=\"Bototm\" d=\"M358.606,759.376C358.606,759.376 592.169,911.542 764.566,639.698C766.909,636.005 796.348,570.115 795.891,553.019C795.705,546.094 792.16,538.468 785.976,540.651C783.21,541.627 592.089,696.342 366.556,742.903C362.573,743.726 349.201,750.386 358.606,759.376Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n    </g>\n</svg>\n    ",
         var2,
         var3,
         var1.e(),
         var1.e(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         0.0F,
         0.0F);
      short var10000 = -19856;
      float var4 = var2 + var1.e() + var1.e() * 0.15F;
      var10001 = 350;
      float var5 = var3 + var1.e() * 0.14F;
      float var6 = var1.e() * 0.5F;
      float var7 = var1.e() * 0.3F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         "POLINEX",
         var4,
         var5,
         var6,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         null);
      var10000 = -19882;
      var10001 = -28201;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         "Scheduler",
         var4,
         var5 + var6 * 0.9F,
         var7,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(13421772),
         null);
   }

   private final void d(
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      Object var23 = null; // PX-FIX
      Object constructor = null; // PX-FIX
      int[] var10000 = o();
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var5 = this;
      int[] var2 = var10000;

      Object var6;
      try {
         var6 = var5;
         boolean var7 = false;
         var6 = var5.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getUser().getName();
      } catch (Throwable var13) {
         var6 = ResultKt.createFailure(var13);
      }

      Object var14x = var6;
      var6 = "";

      String var10000x;
      label48: {
         try {
            if (var14x instanceof Result.Failure) {
               var10000x = (String)var6;
               break label48;
            }
         } catch (Throwable var15) {
            throw (RuntimeException)a(var15);
         }

         var10000x = (String)var14x;
      }

      short var10002 = -19868;
      short var10003 = -771;
      Intrinsics.checkNotNullExpressionValue(var10000x, "getOrDefault(...)");
      String var3 = var10000x;

      label40: {
         label39: {
            try {
               var23 = var3.length();
               if (var2 != null) {
                  break label40;
               }

               if (((Boolean)(var23))) {
                  break label39;
               }
            } catch (Throwable var14) {
               throw (RuntimeException)a(var14);
            }

            var23 = 0;
            break label40;
         }

         var23 = 1;
      }

      if (((Boolean)(var23))) {
         float var4 = var1.f() * 2.4F;
         float var17 = var1.f() * 0.6F;
         float var20 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var3,
            var1.f(),
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
         float var21 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
            var3,
            var1.f(),
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
         float var8 = var17 + var4 + var17 + var20 + var17;
         float var9 = var4 + var17 * 2.0F;
         float var10 = var1.a() - var8 - var1.d();
         float var11 = var1.d();
         float var12 = RangesKt.coerceAtMost(
            lIllIlIlIlllllIIIIIlIlIIIlIIlIIlIIllIlIIIlIlIlIIIIIIIlIlIIlIlIlIIIIlIlIlIlIIIllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            var9 / 2.0F
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var10,
            var11,
            var8,
            var9,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .ac(),
            var12
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var10,
            var11,
            var8,
            var9,
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .af(),
            var12
         );
         IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var3, var10 + var17 + var4 / 2.0F, var11 + var9 / 2.0F, var4);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            var3,
            var10 + var17 + var4 + var17,
            var11 + (var9 - var21) / 2.0F,
            var1.f(),
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(),
            null);
      }
   }

   private final void e(
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      float var3 = var1.c();
      float var4 = 28.0F * var3;
      float var5 = RangesKt.coerceAtMost(780.0F * var3, var1.a() - var1.d() * 2.0F);
      float var6 = (var1.a() - var5) / 2.0F;
      List var7 = this.d();
      List var8 = this.e();
      int var9 = Math.min(Math.max(var7.size(), var8.size()), 8);
      float var10 = var1.g() * 0.9F;
      float var11 = var1.f() * 1.15F;
      float var12 = var1.f() * 0.72F;
      float var13 = var1.f() * 2.7F;
      int[] var10000 = o();
      float var14 = var1.g();
      float var15 = var1.g() * 1.02F;
      float var16 = var15 * 1.7F;
      float var17 = Math.max(var10 * 1.4F + var11 * 1.25F + var12 * 1.8F, var13);
      float var18 = var14 * 1.9F;
      float var19 = var18 + var9 * var16;
      float var20 = var4 * 2.0F + var17 + (22.0F * var3 * 2.0F + 1.0F) + var19;
      float var21 = var1.d() + var1.e() + 18.0F * var3;
      float var22 = RangesKt.coerceAtLeast(var21 + (this.b(var1) - var21 - var20) / 2.0F, var21);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var6,
         var22,
         var5,
         var20,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ac(),
         20.0F * var3
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var6,
         var22,
         var5,
         var20,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .af(),
         20.0F * var3
      );
      float var23 = var6 + var4;
      float var24 = var22 + var4;
      short var10001 = -19854;
      short var10002 = -11761;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         "ON BREAK",
         var23,
         var24,
         var10,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         null);
      var10001 = -19846;
      var10002 = -14856;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         "Scheduler taking a break",
         var23,
         var24 + var10 * 1.4F,
         var11,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         null);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.f(),
         var23,
         var24 + var10 * 1.4F + var11 * 1.25F,
         var12,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         null);
      String var25 = this.k();
      float var26 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var25,
         var13,
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var25,
         var6 + var5 - var4 - var26,
         var24,
         var13,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         null);
      float var27 = var22 + var4 + var17 + 22.0F * var3;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var23,
         var27,
         var5 - var4 * 2.0F,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.45F),
         0.5F
      );
      var27 += 22.0F * var3;
      float var28 = 30.0F * var3;
      int[] var2 = var10000;
      short var39 = -19903;
      float var29 = (var5 - var4 * 2.0F - var28) / 2.0F;
      var10001 = -7390;
      float var30 = var23;
      float var31 = var23 + var29 + var28;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         "Macro stats",
         var23,
         var27,
         var14,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         null);
      short var40 = -19850;
      var10001 = -25786;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         "Session",
         var31,
         var27,
         var14,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         null);
      float var32 = var23 + var29 + var28 / 2.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var32,
         var27,
         1.0F,
         var18 + var9 * var16 - var16 * 0.4F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.3F),
         0.5F
      );
      float var33 = var27 + var18;
      Iterator var34 = CollectionsKt.take(var7, var9).iterator();

      while (true) {
         if (var34.hasNext()) {
            String var35 = (String)var34.next();
            this.a(var35, var30, var33, var29, var15);
            var33 += var16;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         var33 = var27 + var18;
         break;
      }

      for (String var38 : ((String[])(Object)(CollectionsKt.take(var8, var9)))) {
         this.a(var38, var31, var33, var29, var15);
         var33 += var16;
         if (var2 != null) {
            break;
         }
      }
   }

   private final void a(String var1, float var2, float var3, float var4, float var5) {
      label18: {
         int[] var10000 = o();
         int var7 = StringsKt.indexOf(var1, ':', 0, false);
         int[] var6 = var10000;
         int var11 = var7;
         if (var6 == null) {
            if (var7 <= 0) {
               break label18;
            }

            var11 = var7;
         }

         if (var11 < var1.length() - 1) {
            String var12 = var1.substring(0, var7);
            short var10002 = -19900;
            short var10003 = -3689;
            Intrinsics.checkNotNullExpressionValue(var12, "substring(...)");
            String var8 = StringsKt.trim(var12).toString();
            String var13 = var1.substring(var7 + 1);
            var10002 = -19885;
            var10003 = -24117;
            Intrinsics.checkNotNullExpressionValue(var13, "substring(...)");
            String var9 = StringsKt.trim(var13).toString();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var8,
               var2,
               var3,
               var5,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(),
               null);
            float var10 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var9,
               var5,
               me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var9,
               var2 + var4 - var10,
               var3,
               var5,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(),
               null);
            if (var6 == null) {
               return;
            }
         }
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var5,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(),
         null);
   }

   private final void a(
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      float var2,
      float var3,
      float var4
   ) {
      int[] var10000 = o();
      float var6 = var1.c();
      float var7 = this.a(var1);
      float var8 = this.b(var1);
      float var9 = 44.0F * var6;
      int[] var5 = var10000;
      float var10 = 12.0F * var6;
      float var11 = 196.0F * var6;
      float var12 = 152.0F * var6;
      float var13 = var1.a() - var1.d();
      float var14 = var13 - var11;
      float var15 = var14 - var10 - var12;
      float var16 = var8 + (var7 - var9) / 2.0F;
      if (var5 == null && this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
         IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var18 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var20 = false;
         var18.a(var15);
         var18.b(var16);
         var18.c(var12);
         var18.d(var9);
         var18.a(var2, var3, var4);
         var18.e();
      }

      if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
         IIllllIIIIlIlllIIIIIIlIlIIIlIllllIIIIlllllIllIIlIIlIlllIlIIlIllIlIllIlIIlIIllllIIlIIl var27 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var29 = false;
         var27.a(var14);
         var27.b(var16);
         var27.c(var11);
         var27.d(var9);
         var27.a(var2, var3, var4);
         var27.e();
      }

      float var17 = var1.d();
      float var28 = RangesKt.coerceAtLeast(var15 - 28.0F * var6 - var17, 120.0F * var6);
      float var19 = 8.0F * var6;
      float var30 = var1.g() + 11.0F * var6 + var19;
      float var21 = var8 + (var7 - var30) / 2.0F;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.m(),
         var17,
         var21,
         var1.g(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         null);
      String var22 = this.n();
      float var23 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var22,
         var1.g(),
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var22,
         var17 + var28 - var23,
         var21,
         var1.g(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         null);
      float var24 = var21 + var1.g() + 11.0F * var6;
      float var25 = this.l();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var17,
         var24,
         var28,
         var19,
         new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(255, 255, 255, 30),
         var19 / 2.0F
      );
      float var31 = var25;
      float var10001 = 0.0F;
      if (var5 == null) {
         if (!(var25 > 0.0F)) {
            return;
         }

         var31 = var28 * var25;
         var10001 = var19;
      }

      float var26 = RangesKt.coerceAtLeast(var31, var10001);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var17,
         var24,
         var26,
         var19,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(),
         var19 / 2.0F
      );
   }

   private final List<String> d() {
      int[] var1 = o();
      byte var10000 = ((byte)((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0));
      if (var1 == null) {
         if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            ArrayList var3 = new ArrayList<>(
               IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d()
            );
            Object var4 = var3;
            if (var1 == null) {
               if (var3.isEmpty()) {
                  short var10001 = -19870;
                  short var11 = 9391;
                  var3.add("No macro running");
               }

               var4 = var3;
            }

            return (List<String>)var4;
         }

         var10000 = 7;
      }

      String[] var2 = new String[var10000];
      short var10002 = -19865;
      short var10003 = 19673;
      var2[0] = "Runtime: 0m 0s";
      var10002 = -19861;
      var10003 = 765;
      var2[1] = "Mining XP Gained: 0";
      var10002 = -19890;
      var10003 = -25091;
      var2[2] = "Mithril Powder Gained: 0";
      var10002 = -19904;
      var10003 = -7376;
      var2[3] = "Mining XP / hr: 0";
      var10002 = -19869;
      var10003 = 572;
      var2[4] = "Mithril Powder / hr: 0";
      var10002 = -19873;
      var10003 = -12321;
      var2[5] = "Mithril Blocks Mined: 0";
      var10002 = -19891;
      var10003 = -9439;
      var2[6] = "Titanium Blocks Mined: 0";
      return CollectionsKt.listOf(var2);
   }

   private final List<String> e() {
      int[] var1 = o();
      short var10000 = ((short)((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0));
      if (var1 == null) {
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            var10000 = ((short)((IlIIIlIlIlIIIlIIIIlIlllIlllIlIIlIllIlIIllIIIllIlIlIlIIIIIllIlllIIlIlIIIllIllIIllllllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               .g()) ? 1 : 0));
            if (var1 == null) {
               if (var10000 != 0) {
                  String[] var9 = new String[3];
                  String var30 = IlIIIlIlIlIIIlIIIIlIlllIlllIlIIlIllIlIIllIIIllIlIlIlIIIIIllIlllIIlIlIIIllIllIIllllllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                     .f();
                  short var38 = -19886;
                  short var43 = 32429;
                  var9[0] = "Macro: " + var30;
                  int var31 = IlIIIlIlIlIIIlIIIIlIlllIlllIlIIlIllIlIIllIIIllIlIlIlIIIIIllIlllIIlIlIIIllIllIIllllllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                     .h();
                  var38 = -19851;
                  var43 = 15802;
                  var9[1] = "Breaks taken: " + var31;
                  var30 = IlIIIlIlIlIIIlIIIIlIlllIlllIlIIlIllIlIIllIIIllIlIlIlIIIIIllIlllIIlIlIIIllIllIIllllllI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                     .i();
                  var38 = -19862;
                  var43 = 24476;
                  var9[2] = "Total runtime: " + var30;
                  return CollectionsKt.listOf(var9);
               }

               var10000 = (byte)3;
            }

            String[] var8 = new String[var10000];
            short var27 = -19881;
            short var35 = 6146;
            var8[0] = "Macro: None";
            var27 = -19864;
            var35 = -7239;
            var8[1] = "Breaks taken: 0";
            var27 = -19899;
            var35 = 27459;
            var8[2] = "Total runtime: 0m 0s";
            return CollectionsKt.listOf(var8);
         }

         var10000 = 3;
      }

      String[] var2 = new String[var10000];
      String[] var14 = var2;
      short var10001 = 0;
      CharSequence var3 = IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      int var10002 = var3.length();
      if (var1 == null) {
         var10002 = var10002 == 0 ? 1 : 0;
      }

      Object var23;
      if (var10002 != 0) {
         byte var6 = 0;
         var10000 = -19853;
         boolean var4 = false;
         var10001 = 23477;
         String var7 = "Unknown";
         var14 = var2;
         var10001 = var6;
         var23 = var7;
      } else {
         var23 = var3;
      }

      short var10003 = -19841;
      short var10004 = 498;
      var14[var10001] = "Macro: " + var23;
      var10002 = IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
      var10003 = -19867;
      var10004 = 12744;
      var2[1] = "Breaks taken: " + var10002;
      String[] var16 = var2;
      short var21 = 2;
      var3 = IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b();
      var10002 = var3.length();
      if (var1 == null) {
         var10002 = var10002 == 0 ? 1 : 0;
      }

      Object var26;
      if (var10002 != 0) {
         byte var12 = 2;
         var10000 = -19878;
         boolean var11 = false;
         var21 = 24034;
         String var13 = "0m";
         var16 = var2;
         var21 = var12;
         var26 = var13;
      } else {
         var26 = var3;
      }

      var10003 = -19924;
      var10004 = -1049;
      var16[var21] = "Total runtime: " + var26;
      return CollectionsKt.listOf(var2);
   }

   private final String f() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         .get((int)(System.currentTimeMillis() / 30000L % this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.size()));
   }

   private final boolean g() {
      int[] var1 = o();
      boolean var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var1 == null) {
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return false;
         }

         var10000 = lllIlIIIIllIIIIlIIIllIllIIlllIIlIIIIIIllIllllIlIIIIllIIIllIlIIIlIIllIlIllIllllIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
            .ae();
      }

      return var1 != null ? var10000 : var10000;
   }

   private final long h() {
      int[] var1 = o();
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var10000 = this;
      if (var1 == null) {
         if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               .r();
         }

         var10000 = this;
      }

      return var10000.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   private final long i() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         ? (System.currentTimeMillis() - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI)
            % this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         : System.currentTimeMillis()
            - IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               .s();
   }

   private final long j() {
      int[] var1 = o();
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var10000 = this;
      if (var1 == null) {
         if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return RangesKt.coerceAtLeast(
               IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                  .p(),
               0L
            );
         }

         var10000 = this;
      }

      return (
            var10000.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
               - (System.currentTimeMillis() - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI)
                  % this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
         )
         / 1000L;
   }

   private final String k() {
      int[] var1 = o();
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var10000 = this;
      if (var1 == null) {
         if (this.g()) {
            short var8 = -19883;
            short var9 = 2100;
            return "—:—";
         }

         var10000 = this;
      }

      long var2 = RangesKt.coerceAtLeast(var10000.j(), 0L);
      short var6 = -19879;
      short var10001 = -11242;
      String var4 = "%d:%02d";
      Object[] var5 = new Object[]{var2 / 60L, var2 % 60L};
      String var7 = String.format(var4, Arrays.copyOf(var5, var5.length));
      short var10002 = -19901;
      short var10003 = -15728;
      Intrinsics.checkNotNullExpressionValue(var7, "format(...)");
      return var7;
   }

   private final float l() {
      int[] var1 = o();
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var10000 = this;
      if (var1 == null) {
         if (this.g()) {
            return 0.0F;
         }

         var10000 = this;
      }

      long var2 = var10000.h();
      long var4 = var2;
      if (var1 == null) {
         if (var2 <= 0L) {
            return 0.0F;
         }

         var4 = this.i();
      }

      return RangesKt.coerceIn((float)var4 / (float)var2, 0.0F, 1.0F);
   }

   private final String a(long var1) {
      short var10000 = -19887;
      ZonedDateTime var3 = Instant.ofEpochMilli(var1).atZone(ZoneId.systemDefault());
      short var10001 = -17800;
      String var4 = "%02d:%02d";
      Object[] var5 = new Object[]{var3.getHour(), var3.getMinute()};
      String var6 = String.format(var4, Arrays.copyOf(var5, var5.length));
      short var10002 = -19852;
      short var10003 = 31946;
      Intrinsics.checkNotNullExpressionValue(var6, "format(...)");
      return var6;
   }

   private final String m() {
      Object var4 = null; // PX-FIX
      long var5;
      label24: {
         label26: {
            int[] var1 = o();
            boolean var10000 = this.g();
            if (var1 == null) {
               if (var10000) {
                  short var7 = -19855;
                  short var8 = 22281;
                  return "Reconnect when you're ready";
               }

               var4 = this;
               if (var1 != null) {
                  break label26;
               }

               var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            if (!var10000) {
               var5 = IlllIIIIlIIlIlIlIIlIIlllIlIIIllllIlIlllIIlIIllIIllIlIIlIllIlllIIIlIIIIlllIIlllIIllIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                  .s();
               break label24;
            }

            var4 = this;
         }

         var5 = ((lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI)var4).IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      long var2 = var5;
      String var6 = this.a(var2);
      String var10001 = this.a(var2 + this.h());
      short var10002 = -19896;
      short var10003 = -21512;
      var10003 = -19877;
      short var10004 = 8918;
      return "Started " + var6 + " · ends " + var10001;
   }

   private final String n() {
      int[] var1 = o();
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var10000 = this;
      if (var1 == null) {
         if (this.g()) {
            return "";
         }

         var10000 = this;
      }

      long var2 = var10000.h();
      long var4 = RangesKt.coerceIn(this.i(), 0L, var2);
      int var10 = (int)(this.l() * 100.0F);
      long var10001 = var4 / 60000L;
      long var6 = var2 / 60000L;
      long var8 = var10001;
      short var11 = -19866;
      short var10002 = 23371;
      short var10003 = -19888;
      short var10004 = 11163;
      return var10 + "% · " + var8 + "m / " + var6 + "m";
   }

   @Override
   public boolean a(double var1, double var3, int var5) {
      int[] var10000 = o();
      short var10001 = -19889;
      short var10002 = -2114;
      String var13 = System.getProperty("os.name");
      short var10003 = -19874;
      short var10004 = -1778;
      Intrinsics.checkNotNullExpressionValue(var13, "getProperty(...)");
      String var14 = var13.toLowerCase(Locale.ROOT);
      var10003 = -19921;
      var10004 = -6938;
      Intrinsics.checkNotNullExpressionValue(var14, "toLowerCase(...)");
      CharSequence var15 = var14;
      var10002 = -19848;
      var10003 = 17635;
      boolean var7 = StringsKt.contains(var15, "mac", false);
      int[] var6 = var10000;
      float var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getWindow().getGuiScale();
      float var9 = (float)(var1 * var8);
      float var10 = (float)(var3 * var8);
      boolean var11;
      if (var6 == null && this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI != null) {
         var11 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(var9, var10, var5);
         if (var6 == null) {
            ;
         }
      } else {
         var11 = false;
      }

      if (var11) {
         return true;
      } else {
         boolean var12;
         if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
            var12 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.a(var9, var10, var5);
            if (var6 == null) {
               ;
            }
         } else {
            var12 = false;
         }

         return var12 ? true : super.a(var1, var3, var5);
      }
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }

   private static final Unit a(lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var0) {
      var0.a();
      return Unit.INSTANCE;
   }

   private static final Unit b(lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var0) {
      var0.c();
      return Unit.INSTANCE;
   }

   private static final Unit a(
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI var0,
      lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      float var2,
      float var3,
      float var4
   ) {
      IllIlIIlIIIIllIIllIlllllIIIIIIllllIIlIIIlIlIlllIllIllllIlIlIlIIIllIllIlIIIIlIlllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getWindow().getWidth(),
            var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getWindow().getHeight()
         );
      IlIlIIlIlIlIllIIlllIIlIlIlIlllIllIIlIlIIIIIlIIllIllIllIlllIlIIIlllIIIIIllllIIlIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var0.c(var1);
      var0.d(var1);
      var0.e(var1);
      var0.a(var1, var2, var3, var4);
      return Unit.INSTANCE;
   }

   public lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI() {
      this(false);
   }

   public static void b(int[] var0) {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var0;
   }

   public static int[] o() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[67];
      int var3 = 0;
      String var2 = "Å?g\"k\u0092å\u001eög-ñÜ\u001dÉbÂU\u0099n\u008fJ:ÂV¤#ù6<:<xï\u0089\"çªC$Ú\u008czcÁ>y\tRéj)\u009eçù_\u0017¢\u008b\u0099æø_\u0000U,£\u0094¤x¥ÇpFÝ\u0015»sul'F\u0017\u0005|e tm»\u0080vw*±A|¨\\\u0014À\u0016$\u001b\u0019HæÓ\u0000¼±Ì-\\VBU\u001d¥\u0099\u0003\u0082c\u0095\u000f¸h\u001e!á\u001eêå\u0097K«\u0081\u0082CR\u0013Çì\u0014ÁÏ\u001f\u008a\u007fªú9\u009aå\u0080ÒXÏ²4\u000f\u0098æßNí Þ\n\u0006\u0088{\u0006JÊï\u000e#¦mø\u008f%'\u0082.§\u009c\u001cdð\u0011¢«Í\u0082±¶\u009f3ÔßÊÔ\u0094¾Þ\u009d\u007f\u000e¡\u0019$ýÎ,\b0g-Ô3nÁ\u0004¦¹\u0084B\u0010ù\u0019¦ËÜH'¡gïØ¯g\u0006f\u008d\r+þx\bîéë²O\u001f\f(Q\u0016\u0011uÔó\u0092vòå`\u0091PTòàø\u0080}Ãy#Ãf\u0010Æ\u0098\u0019\u008dæ\u0016\u0013íñ+\u001e·rÌÌ5Ł\u0018\u001a\u000e6EÚ\u000fÙ\u0014Å\u000eu\u0018mÇÔìTH$¿Í|Ûî¯Y\u00152¿ ËBUd&÷«B\u0012Í[ã´ury\u00adä\u0011êWQÃwÚ\u001c4p°c\u0081<c\u001dZ½^äÜøª\u0098Ù£¿CÿLÑ×sá\u008b#\u0091\u0097\u0014\u0095\u00adç\u001bü$.¬¾\u0015ÄÅ÷\u0080\u0092«#òþhÁ\u0018k\u0014\t¨¦ëu°ø\u0017|ý\u007f×âCÿX\u0018¬ïHfBG*\u009dÁ³ÐmAÙ¢6o¹\u0083;¯]bC\u008c÷Ù§â!\fµÊ¹(\u0012áRû\u0002ã\u0011í¶\u008c?\u0086¨o\u000fiáÙw°\u008c\u007fE?JSK3\u0097Çu±ª®ß\u0094«QºÎ\u009e\u009a¶\u0087Õ\u0004Ó\u001f+\u0017á\u0006Üº\u0089i\u0080t\u007fz¤ÄöíZ¡ï¡xw¤o\u0089×© \u0099\u0015i\u0015ó¨Ö\u001e\u008cG»\u001c>\b¦tr\u009a\u0087\u0096¡¦åòÞs\u008d#!AÀ8²O\u001d©ÂÎÚæ\u0090\u008c¤f\u001eIîr\u009ba%¨\u008eá\u0098·s\u0083ê`÷A£Ü*\nt\r\u0099î\u008cÇ\u0015øJ[\u000e±Ê0Ü0\u001bâ\u0096;6\u001c`\u0087Þ4ÇbªýSÕ¿42\fý\u0014Çà0Á\fð\u0085Ft$O\u007f¤3\u008f#\u0003\r!\u0011Hk¨õG·\u0007>é&s$lÖ\u0010ß]bZX\\,¸\u009e_dLozg\u0002ǚD£\u0085\u00014<!\u0005Ñ^¶\u0006\u000f\u0003%\u0019°íÃ\u0013Î+R\u0007+4áf%ÑÂ\u0006\u001eìï\u0011\u0086MlÎ\bÀ[Çb\u001c\u009b`¸¨a` %Y\u0006Ù¯ÈÃtïÞ®Aã6i\u0095:Öv]B\u001bÌT\u0091®\u001c\u008aÊk¼rw½ÈÐ6OhéJ\u008caê¬Nò¦f¸wfiV\u001bÔvÉÙ]\u0011,Ü$VÒË9f×¤÷-]\u0095L\u0015e\u007f7¤möØZ\u001b£x!cp6\u000b/ä½\u00ad\u0010\u0002C¡|\u0019\u0019e\u0001¾\u008bÝ\tê\u001dÛ\u0096Ó],¦ðP\u001eþ\u0088To³¿ý&sú\u001dd\u0016#a\u001e\u0010ºf¼ýÌ¤#¦\u000bB/î\u0004\u0016t¬\u0018ú¥»o$Ç\\<¢£ß\u0016\u008eFÑ<m\\\u0011ð\u0087À\u0001Nex\u008fKp\u0093¢6\u0005³?v\u0090\u008b;Ü±\u0011´\u0019_¦\bneÃþüsó\u009f5ÀRIÏéC\u001ah7H¨¤G\u0010iø\u0081[\u0016\u001e¸Ã\u0097%D\n2½F]\u0094\u001d\u001c\u0019)#V7|\u008a5v¦½\u0087\u0001\u0090\u009a¸]g/T\u0087ám\u0001u¤åøHTînÆA´ÿÝZ_Pef>\u0087á\u0004Þ\u001d\u0084\u001aÛ;\u008f1j\u0014;\u001eZ9Ï\n\u0082\tøî.\u008fsºÔ³\u0082¿\u0019³j\u001aôa¥\u001f?\u009f\u008aJ_r\u0005Õ\u0092ÌÁ¤ \u0010§pÑ\u0089,ø\u0002[+\u000e±»ÂNÝL\u0001> *A\u000b\u00855$öw\u009bÇÞ(OU\u001aïnP\u009a\u0097n$IwK\u0080ã\u0092G\u009ez\u008c\u0013Ú\u0007¯,fÚ·\u0010UöfC\u0093Ñ;.ÏJ¯D\u0080\f\fz\u0006|Üx\u009a\u0003\\ýN%ô.SY»Ù/ç\u0013»ÛJ3&lñº<,M8U¿´èÿqY\u009aèp~¦\n\u008cY \u0018\u0095ú\u0085D10R÷Vqóëë©Z\u0099®¨Q>\u008cÃC¼\u000e¯\u0018ü/½ßaÝæL\u0085aG_\u000bt¥0*Ûõî%Q\u0007\u0099\u0007\u009dÀ´\u009fÐuW\u0007Ú½w|\u001aù\u0099\u001b\u009dv®\u00194Ë°ö$\u0097x>÷<XÒ&\bá¬jÆyÿ\u0003ÒP\u0007e\u00adÜ+\u0090D=\u0007\u0088\u0013ãÞ\u0095\u000b®\bØ.ûq\u0089e\u0098E\u00187J*\u001dQ\u0083\f\u0016õ&\u0087!v=ý\u000e\u0089ý;\u009aPïMÖFnÜÝ\u001bk\u0015\u0017O`ß\u0001ó\u0000Ül\u0097\u0001ÓÍñ\u001f\u008a=|xäÜG\\Å¤\u009fï¾Z*·\u0000\u0004j\u0080\u009d\u001a\u009f\u001aâß¼@\u0000%;ÑØ\u007f¶\u001a{V¼\u008eØ\u008a¹\u008f§(çx-\u0007²c\u009cn\u0099\u0007ë\u0018\b\u0086÷\u008dö¹~\u001cñ®b³´\u001c0w%Y\u0007\u000e×}½\u0084\u000e2íò¨ÜG\u0090ëÖ\u0016]*'\u000b\b\u0012\u008a|¨6H¨¯\fµ\u009fÂ-¼/,på)c\u0019\u0010\u001e\u0017\u0013~P,\u0011@ð6Gs\u000b\u009dëþ\u0014\u0097\u009e>AÑAY6ö\u000feö\u0089Ô\u0097XÝlËÞ\u000e»inô\u0017õ\u0081£\u009c\u0099G°)$-\u008eGLÇA»W\u0017¯ì§\u009e\u001ai%!H\u0003Â9\u0015M¾Ä\u0085\u009bRÆ«oÑ+\u009bùBH\u008c»B\b\u001d8\\§\u009e⬇J\u0094Dç\füuÔ%ä\u0082Ñ.Rv\u0088UPªÉâÝ\u0085úÒËÿ\u0087ñsö3¡:\u001c£Z5)2\u0080¦\u0012\u0086\u0017*\u00943Ý|\u009e¯¤q\u0097Ê\u009aÐ#lð®è\u008e\u0084§ ¾ªrhëÔ\u008d±ýà9¤_¬p?l6=RÄÛ\u0016KÜ´@ZføÒ\u0088bM¤Ì\u0083ÐÅÑØRÞòQ\u008b\u000e\tùº\u00955dLûæp÷`\u0095qÆNÒ\rû¼ML6¾,ÿ}JPÝ\u0099\u00050Á®oÂËB\u0006(ÎE¶aÉ&äF\u0086¤x¢\u0014ñ\u0019C\u001dDÈÇ\u000fínÒ\u0004EÞuÍ¦Ð;¾Íá¾¨´\u0084\u0018 \u001dÉxõa\r6`&Êï³0\u0002+bá×©®¡\f\u0088;\u008b\u001bzU(éð±Î\u008còrÚ\u0084ü¶\\À\u0017\u001c´\u0094\u0087ÿ\fM^qa\u0002#\u001cýª\u001eÂ\u0090ÇÊØC*þî~Ì\u000f7G?\u0017\u0094\u001eÏ\u0005snvR\u0016jØ|\u008d$\u0010\u0095Â\u001c÷T0b\u0088Ò\u008cu\f\u0091\u001dYÄËk_\nÄ\u00156\u0099\u0081Ê\u0015\bÞcàt¦]ò\u008b \u009c\u001e;(gñ»ò\u008aÍ\u0091Ä\b\u000e\u0081þf\u000f¢\u0083ðÜ\u00143ifÙ\u0087°\u0092cÊ+2Õ\u009fGÐVÛHìiú¾(ÔAê4\u007f\u009b)vò\u0004×c\u008ci¯F\u001c\u0001;\u0014@¥fdÜL/×@«\u0003»\u0019·\u0091\u009e\u001b÷è\u009ch\u0017\r\u0016êI?\\\u007fÈÍ+\u0011S9+\u0089ÉLãD_-s\u0012ó«$q\u0001wâÕz\u008c\\ÏjÚ\u0084Éd\\\u0015\u0091ù#\u0089\u0004\u0093*k'\"&ä\u009dÀt\u0011ÒÐ\u00952`ÿ\u001c%K/\u008bÅf\u0010CTeÿ(ÿñ´µèÌAiY»Ï\u0015\u008c&\u00910y\u0091\nØ>I¬4$%\u0087ü\u001bnÎµ¸s¨ù¡\u001cýäé\u0099?F¯Â±¸\u0011\u0002XÔ\u008dó\u0003Õ\u001díp¶ÕcäëÉ\u0014tÚ©é]\u0014\u008f\t\u0093Tö\u008a*\u001aÎ!¬¼Öµè\u001e+Ø$µ(Ëß´Ø3\u0083ÑíÓç~y\u0096íé\u009b\u000b`?íÄt\nz$Ö\u009e\u0081Â\u00868r\u00adW×¥8\u0014^Þ\fÒÝ¨t=\\\u001e\u009b\u0019»¨\u00955¥\u000e;\u0097j\u0087ÉðÍU2Ô<Æw©xÑmO)éÑv\u00adë_\u0002¹+*Ôæ\u0099\u0084Øa¶T·OI~\u009dì{ø\u0010F\u000b}b\u001b%\u0097\"s²¦×k\u0086¨\u0098ÞQÏ\nÒ\u0084\u0080GûbñD\u0095\u0010èð´«êû\u001fªñ\u008cj\u008c\u0014þv\u0094EðÝ\u009a»§<\u007fùÙmBzWªM\u008euç\u000b\u0018¼@zÏ\u0099o@\u0017kÎß©¢*¹ý£ìöp\u0003\u0095\u001fÝÈáÐuFâ¤N\u0090t\u009b)É\u0097@å\u0085Zf\u007f\u0000\u008f\u0091F\u0090ÔÔøBÛa_§\u0089\u0081µ0BQÌ\u0090\u001c\u0013^ù\u0080´rãÊ|±\u0083\"éc&:\nÍ¼\u0007\taÇ+°^O)-M\u0013åÏ\u0006/¤bÎ8xäx\u0099\fDìÛ\\î\u0088sÚ\u0012O\u0095Â\u001e\u008fp°dVcpòCsZéã¾=\u0080É\u0004\u008dÃ]¥0ÿ\u008d\u009dÄ7\u0098\u0012XÉiPêÜÐóÅr\bdYN1í\u0012é^~éæ\u008eÏ¥$\u0082\u0000¶ßÒT?]\u0091ù/M\u008d7\u001eHµ\u0080\u0003KýÿOý ñ¹}ÊLk¯RÖw>\u008bÏ\u0013\f³\u0012*rÓª\u0018 \u0087\u0004\u0004Ë\u0017\u0014Oöl÷©uWÛn{98ëúó\u0089á\u0093M8½®ØÐ\t¢©\u0086{Ã/äì\u0010Ù¯\u001c\u0015ðGª ¡\u0092µ¥~\u0019uõÊ9\u0003SÇ\u0096I).\u000e-LGs´MûÖrd=j!Ùt\u0081Ú-\u0002Ê´\u0012\u001d Ö\u0080Úä\u0010\u0017|ÔÝãlchËÖ¥ì\u0011yÿl\u0012J\u0094ßá\u0001_\fYñr!£\u009càÀ\u009eõ\u000e%¾Ëü#V-\u0096é¾/ÓXó¬Ä'áó±\u0098à'Ð\u0084\u008b'Óø¼}OkÀI\u0093K\u0007íàIK\u00adÓ0{Ûô0\u0015d×\búéS)ó\u0002e\u0016bH±·¨wóé6\u0006\u009f\"7,QÉ¤\u0080\u0003\u0012\u0083²ã\u0019\u009fTö\u0088©_ek_\nïmw¿.\u001aî\u0094'ÕÊ4p5\u0092í=I(\u0082\u0089u¥(\u0005_ã\u0007¡{\u007fä\u008dé5=RìÁÿQ8ü\u008a÷\u008eòattL\u0094\u00ad¦áÈ\u007f;ÆÔËî¤ë\u0010\u009bÝw\u0014\u008bU\u0007øým×3UÈÜ\u0090.IX¿ûõ6ðk]\u0090H /;ÆZ<.\u008f§\u0004%\u0013øR\u0089®S î\u0014)É²Tûþúö{U\rÃ* AÚ~VºNKz½\"\u0091LxCö\u0089ñ\u0017#»\u000b\u0083*û'\n`]¨>\u0090\u0084¹\u001cs\në\u0000\u0012ßmÃ¼Z~\u0086«\u0011\u001erÖ¿\u007f\u009f\u0016=üá¾ø\u009aÒ:Ì£\u0014\u000b96påâÌ=5\u0005~ñ\u001cüXÈT\u0015\u008b\tâäÒ\u001b\u0083±ã\u0018\u0086?íÅ\u0092ÿO~\u008f\u008d\u008e\fM)Üx\u008aF°«FG={c`,ZÅb4Õ\u0012iì\u0099(î\u00851>V\u0087eU\u0017\u001d0Kü\\Ä\u008d~zSîäµJo4\u0080z\u0003´\u0082½÷.°¨U\u0000<\u0092lèØ\u0007{k\u0007:\u0084 \u0094\u0013ª<Ò8Ïß]\u0090\u0085ÇWW\u0006]\u0018ñIaýtr\u0007-ó\u0086²~\u0080\u0015aªV\u0084[øDw\u0099¤ßWcúùÿ\r\u008425§©¼Ó{¸÷/bu Ì$b\u0015Þ³\u007f\u009a-Ë\u009cä;Ä=\u000b\u0004nI\u0098ÎY>²u\u0085é\u00050*\u001e\u0013sMÕºæ°±\u001b%Â\b8ÕÕç\u009fD¨Ú\u0090\u0099: cÈ.Âw\u0085¤ÅFÇËÕ\u0014éEÐe£zäÈ\u0012\u009bóbÞgÂ¹õ\\FtA)\u0095Û ²\u0013\u0081W~ôÚÍLÊ¬7\u0099Ïn[?\u0004\u0014¶ïA´(1\fÂV»\u0011\u0086LKÈiÝ\u0089ùÑ\u001c\u001ep\u009f>e#Î\u0011]\"_\u000f|Ó$ð¥4ú\u0010ó¤¬Dåß~F\u0094R\u0011\"Êò´ô1ïü©\u0090K.2ë¬µ\u0082w\u0018åÜkÂÈ*îÝR\u00997\u0097\u001a#¸\u0000?ï\u001dúÇ]Å^)%üR\u0085î;õ0\u0099a\u00142õ0\u0095º*ìK÷\u0087\nÛèÒlOÓç¡án\u0011\u0006\u0089×ð²\u001b\u0089vhÇz\framÇ1zÏmÄz\u000fÃ\u0091®¬[Ø+L\u0001\u0081'¬·ãzÉ\u0095¦½5~\u0094/;â\u001a\u000b\u009ckÅüç¾\u009eØMýeyq\u00989ýÑO\u008a\u008ez\\µ\u00adÙ¶\u0082\u0005Ã¥ãÎl]M¤ü`Í\u0098=û¥+ø\u000e\u0018]TÝ\u008e\u0006\u0087VÞ.\u0014R©à\u009f\u0002\u0084\u0097¸\u00adíî\u009eA \u0096gó\bìÂ\u000e<[ù-\u0013\u008e¢Lÿ\u001fç]$\u008b\u009e@E´\u0006nòëa^\u0011/Gí\u008aH\u0099Æ\u001fG90¦\\ênP²\u0005ð\u0085\u0093ÛÇa\u0004\u00121\u001bI\u0097by.ZAW\u009b }»µó¶\u008a\u009dÚÑ.¾Å#ï¿A\u008c\u008dO@¿MF\u008c\u009aØ}~ø-\u0017æ~@¹®\u0089B§¯\u0019÷r²çR\u0081yçÌ£Á,Ú\u0000ö\u0098Û\u00199ú\u0091ÌûfMTL¨Ä¤yñ\f uÒa$Ý×þv5\\\u0001$\u0083\\\u000b9ÂØl\u0083«Z\u009dóP\u001fm{\u009aó8\u000bÖy²æ4\u008e\u008cp8\u0019\u0014\u0093HÓ\\kê\u008c\u0015Çë¾õÏ\u00adIv\u009d¹\u0001\u001eAë¶_xk\u0099Zn,uÙð[Q\u00005\u0003çá +>-¶2-§\u008c=FG\"î\u001a§ÔsêøÏÒ9=w\u0000\u0001£»\u0003æMhû³ý\u009avÍ(\u0016ÃyÊú\u0010Bº\u0012z\u0085ã/[\bHÚø\u008aw\u00adZNêàÚ¤0úÁÇ¯j=÷µäw\u0017\u0004·/°I\u0005\u009d\u0094>.<~\u008a¥ß@º«ÙOÆ°\u0012*\u0012\u0018\u0082/\u009bóÑ\u0017<;ñ\u009b1\u000f\u0011Xk!\r\u0090åý\u0098D\n\u001fÀðL\u0088É»s%q\u0010?§\u0006þ\u0095\u009bôR\u008cþ\u0084_,½>\u0098¦ÿJ\u009fås\u000b\\7AÚz\u0007Áí}¬b\u001bÃ½\u0089Ï]\u0088\u009aêÒvö[ù\u008b\u001dd}\u001a\u0006q¼¼Ð¹¼fú\u0002XÚQë\u0083È}\u0095°&Al\u0095ü(^k \u001d\u008b\nÿ0+Z\u008cÒ\u0086\u0007\u00adÕf\u0092\u0017¥¿\"Ä\u0017w\u0095?î\u0080Ð\u009a\b\u0094ìRF<v\u0089» æ¥ò>n\u0007!Á¼\u008d\u0005\u001d\u0016S^\f*)\u0011\u0087I÷·¬Â8áÜ.²)z»êÝ¿¥ã`W0{ZM)Â¹_Wá4Äòó£®®\u0094úùB?/\u0005»´ê¿\t =§ê;\tMF$Ý1I\u008e\u009d§\u0001ÒO·¸³¹uÂ{\b¢ûç'´mÓ½¾\u0018yÌóÃ¼'À¿\u0011\u001d,³BÙ\u008bàeÁ\u0082KaÐ£4\u001c¶Î8ûÝ¬+\u0099ògÄ¬QÝ\u007fý¥Û/(t\u008d0àóû\u009aqÄã1ð[\u008e¸ýÌÀÀ\u0016¼,\f¡èwËy\u0004á{ësØF\u0018Qh@Ï\u0014À\u0013¸»Dm&&£\u0095ÂbÌ\rqÊs[-É9jQÇ\u0093ür\u008fü¦Õn`°\u0003y©~Ñf¸Þg\u008f!\u008f\u009cª¿¿|çjSëµ\u00adïÙ\u008e\fhÄ!}Vã'z]8<;\u0086\u0003\u001d]{='\u0099p/\u008c¨^C\u009a_Ê£ó7*á.:]6Y$\u0095òGW\bã\u0012YáC\n²\u0091X\u008a\u001b\rõ³å\u0098Âá\u0002\u001a\u008b«b\u0092\u0080¶È\u0000Ä«æc'/ÆÉe\u009b@y\u0090Ô\u0084\u0096¢\u0080É\u0096ù\u0098i\u0016\u0004\u0081\u0014£ý<\u0004\u0007ÅôíMò\u001d,\u0011!J\nÿ£R2ÜsËE\u0083=\"\u001c\u0099TÛÕJæÊÝ°$×iýóï\n\u0014¿\u0097NÙësÌ\u0002ÿd\u0080\u009a\u0086;îÕÅÞq3|\u0080MÑµi\u0082\u00adéö<B\u001b>Âx)Ûå\u009fudJ\"ËÞ\u000f\u000féÝîá÷û\u009dã\u0094ò³\u0084Æ`ÑðÍå6\u009e¥\u0001\u0094LPS3ûÀ¦\u008cÎ\u0012R¨\u001c»¦úÀéËóÄ¤\u0002\u009b*»±°\u0094Ó\u0089¯n<7·½Y]o¾\fÝ l¡¾\u009e®äÉÙ\u0012ß×\u0096\u0011Õ]ë7·\u009f¢f\u0011\u0005Éõ¼ôW\u0000\u009d4\u009c<\u0080ö÷;òÑÞ\u0091¿\r v\u001d\u0091Si\t¨(\u0080.XlÕ\u009bÎ\u001e/ÔUù\u0083<«ì\u0014P\u001aÝÓ\u001c\u00821M@Å£é°ÿ³êÂ¯ÕJJ\u0091+_Iø\u008a¼zÎ²\u0088\u009dÊÍ\u001e\u0090®=ÆdvÈXiUåq«s\u0012BÎZÙ¦ß\r)>\u000b°]+\u0080R{Xoæ\t\u0005ó\\Pð?@â!ðó?\u0092\u0001Ê´Ë;Ï·h¿@\u0096XºäÛ\u0005çsYÛÑä\u0012pM\u0090H¾+\u000f±2Ø\u009dêê\u001b\u009aïÆý\u0090RÎ³ï:\u0007ZÝg\u0096a\u008d\nÔG\u0086\u0092FÐö,Äà\u0013Ù7[ Á\u0002KÑÇ\u0085Ah!c.\u001c\u0086)\u0012TvØÀ£\u000b&\u0083\u0006ÜÐ±µ¾nÁsR\u0019¼\u001e6ïJ\u008fH\u001fÅ9Dºj\u000f7paCL4éä\u0091\u0006\u0087pX»x\u008b\u008d\u009etÀæ²~H\u009eØ\u001b\u0082p\râ\u0081>£Á\u0014\u001eZ\u0094ù\u009cÂ\u0080\u0082õsñþ\u009b»\u0093J Ø¥ÂèB~ÃÅ-ü\u0080¿\u000e`·ÂN\u008böQ´\u0002baæÈÎÌ\u0084U(?\\D#FqÎ$ûX©1\u009fRÏ\u0014×ª1£\u0083\u009d\u009c\u008eJF ¡é\u0091íBê\u008aà\n\u0086Â¸°¡û\u009eØ¢Á\u00007~Ú\u0094uxf\u0018\rKª¶\u0082\u008fõ\u0083Iè¦?©CÉ¹ÂSp\u0085ô·úôbkÝ\u0083b\u0086VtA¦\u007fó\u0088Y\u000f\\\u0097 N\u008cr\u009f$\u001dp\u0088§¸\u0085\u0002îN\u0006Ô\u009a·\u0098]\u0004jÈHÆ\u001c\u0081\u008aG¥ÕT\u0099a¯®\u001c÷¾)@©xã\u0091ò\u007f\u001e¸§\u001fó\u007f-\u0099)\u0086ÿOð\b×3\u001aÏD\u0084ßOñ¿¯¨Ôw\u0095pTÂL\u0085>§)\u0002ÕðÝ56\\àä\u001f%07\u0003}\u001a¿Ç7÷³\n$Õ\u0000R\u0002\u001e\f¨\u0086\u0089\u0087GôUÈ<7c)û\u000eÕk¤\u001aCk7\u0097½Ñ+&Îq\u000fQc\b¨¼_{)÷\u001ck'_3wÅáq`ÈnßTIYn\u009e´Lvj&=$\b\u0082º \u0085ÉJ\u0080\u0015\u001e£*è\u0084\u0093\u0096¬£á\u009cÇ äØ¿(r\u007f\u0098\u0090\u00970ø»\\\u009bIë\u0011à§D#\u001bÇl6ÚÇS>óu\u00adè\bD\u0097I\u0011ÁRØé\u0010\u000bÞ³\u0016\u008czË`Ä\u009d3\u0006°¿\u0094ÕV\u0007\u0080\fÒ\u0019c¶ÈäÎ\u0000z\u000f\u008a½9Õ\u0082#ã·\u0017N4ú\u0005½Eæåt\u009dÒ\u0005\u0089mê\u001f\u000f\u008a/\u0014yG¡oí?.É?\u0005Ú\u0082t\u0017ð`s/\u0095\u0012 ï¾-Ëì4ôÖð9y4\u001d²aãzïg\u009cî\r\u0097\u000f&a'£\u0094\u001d:\u0005\u001b\\±`Ì\\ËKÔ¢\tó¯Ø/Î\u0015\u0011Y47ÆÍ\u0095 PfM7±{\u0090;\u0081}V$cÐâ}ô·\u00ad¨\\®\u009e\u0089ó[U\u009fëZÿY\u008bw6\u0099¿j\u0017å\r¨¦>Õ\u001d&_c\u0098Øªº}ÑYpÆËa§±QnÜQ?ËÄ)ÙÊ\u0097ÀAËGÅ¶lØnõS\u0099É\u0019\u000fÿ32\u009cþÉåëàT\u0085^è\u000b\u0094®\u0080ñýwg4R\u008e?\u0007\u0098b1\u0088\u009b[\u009f©k\fø%4d7\u0088[\u0098Ì©+Lr\u0004¨V!\u0006DQ?\u0088û×\u001d\"gmÈ&{±ë6\u0089\u008dºÓ\"â\u0014vÇdDñHC3ðîõ\u008fW\u0002ý¡\u0090\fv@¥X¡ú\u00917Ë(^MÉì,êÊ\u0003¶±²^\u001c\u0018'\u009e&k\u009f5s/âòV\u0016c\u001ez\u009a#(X[%Co\u009eH:åzeØÅ\b+\u0096\u0002YÍy\u0099\u0082õÍ\rîÏi\u008a\u0093Ò\u0096¶G´\u0000V\u001cº\u001f\u0099ùç¢9zK\u001c\u0084\u000f<|2Øë§«Cô\u00886\u0002gâ\u0088KA¾Ë\u0088%LÌ©ÿ©z»\u008a´\u0085HZ~=\u0096\u008c\u0015Ö1_¨'Ã\u0012\u0005àW\n{\u0001@o\u0015LÁáâáÍ×`¯\u001c\u0094CÜ?\u001aã\u0004o\u0096Ù¸\u0084àH\u009eb\u001a\u0099¯\u009a}A¸uQøs@«f\u0019ÜÂ4zP\u009c{\u009a\u0015¤3\u0010H\u000b9EÌîæäI:xÕ\u009fÿ\u009f\u0013£\u0005\u009bÇíÍ\u0089\u0093\u008eËfp#\u0006wÁBÿ\u0090lÇÇå,æH\u001bjûouop\u0097zt³>\u008dä\u0093ÝÃÐ\u001fß½*%\u000e\u001e4ÚF³\u0001$ÀF\u0018Öµ¬t)Ð\u009e<½lÇ\u0002QÎ[\f2Jz=\u0012Úw\u0085ÀÇ,¢£\u0093\u009aëqV¡\u0014ãöØ)É´;»(K¡\u0001ñ~í\\¸\u0010l\u001c\"\u008c\u0004ÄçÞ\u009fÈC-b\u0018Þ\u0099\u009eR>Ô\u008f2W\u0016\u0017\u009f.K]7¤©\\$G\nN\u0096E\u0091<0î¡\u0002Ä\u0015ÒZ\u008f4\u001c®Â/\u001a\u0087¥\u000b\"ó²Ý»\u009cÎåK¡ÌYy>\u007fT\u0003\u0011Ô??\u008bè!ý¤¾\u0083G.Â}ì\u0090?\u007f\tü\u00023ã²\r\u0005L×\u001f¡#Þ¬ÎQÓ\u0088¡KéËGkyª\u0004x\u0015\u008dH\u0095W¢yýÛêè8üÂÊ6\u0013¢ý\u0005ªjì\u0018\u008fa\u0017\u00017¢Er\u009e\u0018\u0000+Û\u0094 Úâ\u0019Â\u0000\u0094§D\u0003õÍGj¶jù\u0081AsF¬P§\u009d7¬\u009d\u008a\u0015\u007fÃ«2\u0011\u008b\u001f§wv\u0092þMz\u0087C ê÷|ï?\u008bãÉ*\u0006j¯ ¤Q:)²ð\u0003Õ?Ì½½|\u001c\u009fF\\OW9ÐKhY\u0095\u0084\u009aÓ¥|Y¬\u0092kÄèªÍÁÿÐsGo«,ìÓNTw·xÿäò\u000bñÎ\u0091bà\u00999.~\u009b\u001b\"8\u008ey\u0084}ðmsº«\u001fð8\u009bÈè=tâV\u0007xdö{\u0080é8p\u009eè¹ß+ÂñÿBJWÎÄ°ÌPþiÎ\u009b¯½Ol\u0094£þ½íV\u0014ùáÚ>í\u0089\u0015vþÛ\frZ¿\u0012ÄôÎ]åÖç¿\u0016>Ñ öé\u0002ÊzÛ9L;ÎE~\u0015\u0083LqS¿ùê»8\u0096\u001b¡ö\u0099\u0083ål9À\fKÁ\u008a\u009cM\u0004\u009dH\u0007\u001bR£'±÷[Vh\u009aÞ\u0001Öv®\u0097²ZÚT^Ë\u008c \u0090\u009e\u008d\u0010\\B]»ÖX$\u001b=ã\u008bõl\u001dã\u0087ää\u0001¬k|\u008a²áÅ4/Qu\u0089Âù\rùëÙá¯JUýÜ\u0001\u0095ÇY\f«)\u0012yqøÁ@îUYé%ªa_£0¶ÈÁ\u0013pÌÓiaf^;SáEq¹ÎÝÞå\u0089)\u0090tO\u001d¬¬{ÄIV/T\u0093¾vc\u0093±0Û\u000b*Îêpæ\u001b\tk<¹Þû\u007f=p\u0087ã1£}!+Ø\u0093à×?ðw]\u008fmi\u001c¹§K\u008esRå¤à·\u0011S9ÜôU#pþ\u0001µèBÚê\u009eF\u0006\u0092\u000e\r\u0014ûe´£\u0083\u0095z\u0092\u0097ÀLtú¼æuö\u0005ja¤*©4¡n'ú~\u0016\u0006¤\u0095\u0014øà\u008b\u008a\u000e¹~\n\u001bH\u0083\u000bc Â¬Â¦\u008a9«²+ð&tZ¬\u0087\u0017-\u0093²\u009b\u00ada©í\u0017Y0@iÌ\u0094f\u001an¸Ü\u000b:NÌÔ\u007fú(æ\u0093N\u009esasN\u0002â\u0012\u0018ã\"iùß\u009fZ¦V¶¦ý\u0086û\u0012^[\u007fúaà¾Ä\u0094õ»\u00adu\u0019\f÷Ð ØÏD¦\u0082º\u0013EhE§\u007f\u008f¿R\u008d{ ì)pvL#hÝ}-bôþ\u0004½I\u0095~ÝÇø`\u0083þ×dIÜm\u007fdx`§\u0081¨\u0087À\u001e\u00058ú\u0005\u0098Å\u008e]~\n\u0012yU\u00adR\u00815\u0011\u008d/KG\u0005éz¯Ò\u009c\u000e\u0001ÞhõJíÉ=\\²ü¤µ.\u0004¸ãx\u007f^\u0085h]7P¸\u0006Ì\u009eÊÑºYF\bF¦\u001f&ÐÍcBpB%%1cÉ«ÂçÊ\u009bï/a\u0081ÍÙêúÑ^¥Y¡E\u0081Ù¯ü\u0010°´Ò9ô\u009cCF\u0080Õ$à¢¸»\u0082v\u0018\u000fÙ³ËÝ\u0085\u00adKöBõÑýY|ñ\u009b¨[+\u009b\u007f\u0017d\u000fÛ¡\u007f\u0091ù\u008f®Tk\u007f\u0094(ú&é\u008b\u0094\u0017\u0099áM¦\u009fÁå\u000f\u0090EaÁ\u009b\u0090¬mÈï\u0098\u0014)®º\u000f\u008f`¼&\u009bI\u0095ÿ\u00863°÷¡\\(T;\"\f!\u0099L~F®1\u0015éí\u000fÁ\u000eyd\u0013[ÄÃsx\u009aDØênÅÂ\u0094ã\u009cÃ\u0089ü1wb½ÞG\u0082\u0087¤»\u0003R\u008a(\u0015\u008c'É\u008dÈ\u0011\u0099_¿\u0093ýÚT[~ DfýTøá¯å\b\u009f¿2uÑÎ]JÜJß9ç\u0005áf9\u001bíê^+ÎE®\u0082\u00815E\u0083à\\Y\u0083ïÛZY¼J&\u0013\u0087\u008e-JîÂ¿-s¥\u009aÿØ\u009drg\u0090\u0016x\u0097h\u009aG\u0080K\u008fL\u000bÖ=ÞªRCï\u0001\u001dýõÇ\u0097\u0081),\u000f©®Gu\u0000í\u001c-\u0015\u008c\u0090E\u0080e>Í\u0093Ð\u0019±»g\u0085%\u0005\u0099??\u000b@ÿEW\u008f¶\u0087\u0003õ}Çðnk\u0091\nE\u0017öÍ\u0091Q'ÆîT\u0001\u001b\u001af3±¼T¹¤\u0007t\r\u0085\u0018f\u0094E\u0081ð§ù\u007f3¼æ\u001b¸ÿA\u0089\u0000\u0085÷m\u007fGD^Oh*;Q³\u0000J³\u00113§\u008fn0\u0085\fmb ]²%Ð~ï3\u0014\u0014\u0094\u001aÚh\u0013\u0098\fûácìüñ\b\b\u009aa»D&ì\n\u0098Ü\u0000ÌË$\n\u0012Å®ºK\u001aÀbeÿz\u00951H}+I'´Î9Wü8N->\u0015V\u0080å}Âh4Î\\È\u0018\u0092\u0098a\rá®T\u0084ÁRÞ_O\u0019C\u009bAV½úéÐ\u0086£\u0080{ö«\u000b:Ì!`3ß( R_nnfY\u0001B¬\u0097\u0005§\u008a\táû\u001aP©\u0017\u0097\u008fòäã\tÔ|Ã\u0095½9×t\u0095\u000e÷Õ¤i5\u0097×\u008f8\u0098\u008b\u0084w8È-XÛ\u0084P'¢<g1p=Ö~\u008c\u0082>JæÕÏ\u001e\u001aÔ\f%\u009b sð%\u0095ÆÇ\\ø\u007fH4µý\u0013a\u009e#%È\u001c\u0092ß\u000e\u0095\u0082GÀ:?6\u0003\\G\u0095Èì\u0097\u0011d=7îéuÞ\u0000|âB\n\u009b\u008fW\u0095\u0082ø\u0083¼ï²\u0007\t¼%\u009a-E\u0000ÁàåJÄ`á× Ð(Uw\n\u0006\u0002ÜÐ\r3\u0093²à\u009b2\u0012\u0012+)Î½\u0088EØ\u001d&<Èk¾ó\u009aÖt\u0086ø\u0005\u001a½:èÑhfj»\u001b)LjaXÀ\u0001\u0094ü\u0003¥eÄÑBXf%üDr\u0083÷¦i]>óP\u0099\u0081?cgà\u0088\u0080GfÀxïÒ|°$ C·«ÀaÌ\u0006¥sì+\u0018\u008c\u0099P{\u0000²ã[mÍ#?¾\u0012+«\u0017cz$dÌ\u0019÷Ë\u009ee\u0003<\f\u0010·\u0099\u0096Ûº*3\u008bcì\u007fÊ$ä÷\nz\u00adM+äÌ½ä\u0004Jê7§½ÖQ\u0098·9Y©ðçÏÖ\u000ejPo%\u0080Ú×79<6\u0014M\u0019\u009a=\u009e¨»D<Ja\\¸y½\u0097\u009e×FÊ\u0096Öic}cI¨üZ2-¿²$\u0018_T°®\u0093~æ\u0002µÌi\tx\u000bòÑ\u0084\u001c¿iê\u008f0ñ\u0013\u0083÷Ø£Bn\u008dFÑ\u009bUóïj§\u009eUiÛP¹c»ûq×\bÐ@d\u0092ºGAß\u0004_ó\u0082Éøæ`\u0081N± \f(\u001eß\u001bz.eÉ!ßòÏ\u0092\u0099Ã\u0084Ú\u008c\u0084¯8\u009ebË$4Kç\u0090<ÝÈ\u0089;\u0096¼d\u0012FqÊö\u009d÷\u0097u\u0090Û\u0096{&8@½\u008d¶lMÆ\"º1Ó&\u0092ÈXþ£4trÅÅÚÍß¹\u000f|v½e=\u008d\u008dÿ'SB¹\u009dgA\u0002\u0090¶-tË`\t+\u0082D\t9p\bÕ\u0011ä¡ÓÝk|ãNª\u0098$ßõiEo\u0085çã¹\u009d6\u0087PgáÿbiA\u0087®¬\u0095÷>gZ?ËR\f¶É>~3NÈ\u008f\u0083Â¥³©'j\u0000/`{f£+¬×'·\u0013Äó{\\á:u#)YÞ¹Õ\u008d¬®×ûð*[`n\u001bß=\u0017\u001eZÝcÑaÎ\u008fpÕ\u007f¬¶üê\u000b\u0000ï,¿\u0097Ö\u001f=9\u0003Íò\u0016\u001fd8zÖì!©8\u0016/ø\tk\u0093Ý\u0013\u0097.\u0080\u0002ü\u0084\u0007b|Gö_L(§¢¥\u0018z\u0003ÓÝ\f\u001289\u0015\u0087D^]ª\u0001ñ>©\u0010÷]§ñ2\u009aJÁÉ\u0097[+ýöW Ö½ô\u009cR\n\f-ã\u0091ï¡³¯\"í\rtÆÛ|=C¶\u0091 t¬Ðª;?l\u0013îÊ9jø\u001d\u009fY\u0086s\u0092ç[îH0®Ú3yûCÐIÀ\u0081ö!üª\u001f\u009aÛ\u000eÿy\u000eu\u0083exº\u000f>\u0005\u0011\u0004K\u0012\u0003í\u0085fN\u001dJ_T\u0010§-[¸\"vÈV\u0089W\u001e¾ÔÉý66\u0097d0\u0089\u001e(\u009d\u0082\u0006ÂS\u001c\u0000Jôª6<õ\u007fé\u0081 OYæ\u0007\u0015ÿ@¾H\u0001üQqQÕ\u009a¶{z\u0099kÝ%a^¹áf\u008f^´åzá)\u007fcuT\u001e\u0002}79ÎÈÖ\n;ëEcy½i.u\u009aB1!¹SÅ7\u009cÊ;HÅ\u0087»-¡¾\u009d§ã.°èPN©%\u0010<7\u0012Ãp&\u0096çY²cÔ\u0087¼\u008fÄc\u0013ÚVÌí\u0012q\u001el¡m«únSº>j\u0085b²]\u001bC@tþ\u0012RX¸\u00974ýÌê\u009f\u0017Ôxî¿\u0093L,Ù\u008fØ\u0090kZÁÄàBÃ@.Ù\u009b[0\u0002\u009a\u0000Ý§b\u001eÆÕ\u001bÓ ¡âøÎ]vN\u0014>rj°\u0098¯õÜ\u009c@ûiÞµã&ô<å\u009b\u0018>/\u0097E\u0011é6ï\u0015Ò\u001aF|Æà0Mâ\u0004Ü\u0016ª\u0092þ¨ÃH{%*µ\u00848\u0097Ø§Bº8\u0001Ý'\u0098\u000f\u008f`\u001cI:rÚÈ\u0003ªò\u001cpçR<(¢\u009daA\u0005\u0097vEJJCö)v¦\u0092\u0081\u0081zë\u0099!¥1ì#\u0080\u001fIA\u0081Â%ù®V\u000b3\u0019,TT·ïØ5+f\u008aíª\fÈ¯;ÒÖ^gBKòÛ'likûY³KçÞ^Ç\r\u009ay\u0097\u0006ÖK¸\u001c\u0093\u0083\u0086;[\u0005\u001e8\u0093-7\u000fZ\u009c\u008bîKJéB%\u0011A¤D\u0095Wi><v§áÈ3Z{Âê\u000f4ýbbñu\u0092K\u009aï\u0003\u000f6¤w¶¿rº`\u0006í\u000e\u009b[\"Û\u008aÏ\u0081$ujA\u007f/@â³\n§omÝÿ\u001e1Ï¾|ÝIb\u009cß?\r\u0017\u0011\u0080\n;».\u0010L\\°\u0017¿\u0097\u008aï8\u0091Gn\u008aÀ\u009d\u0004K´\u0001/\u0097û5\u0015\u008dV÷d\u009e\u001a\f\u001d\u0002xVS\u008cg\u001cò¦>³\u0011GSH\u0019\u007f\u009aà~Ò\u009c[}\u00adu\u0000;¬Ua9ÊÆu\u0088\u0001þ\u008cA#\u001c.=\u0010Rà¬µ@5¤¬Lh[Å\u0091®l\u0085Øâ]\nü\u001e\u009d\u00adÐ§9\u0019\u0080ÿ\u0095Ó/ß¤\u001eL0;(\u009c0\u008f\u0000ÒËÊÙ:|\u009d\u0097\"W\u009d\u001b«*¼,Çé\u001b\u0019q2;ÎÚ\u008cÁòP\\¼Å<ú×ì¨ô\u00ad\rèÃ1P1!n\u008e\u0012¢\u001bû\u0018ì³úZÑ9yÎâä\u0084\tÝp\u0086\u009bÝº=\u0006î\u000ex_»ßýDª?~\b\u008f\u0012\u0093ë´\u0000 ÒÎ \u008fLã\u0014!\u0007\u009c0ÍZè\u009aÖÊ«\u0012¹ sE\u0088\u0003×_M=@Ù\u001dióû,ü=\u008bø{q,;\u008fmXv\u001b\u0013Ã\u0014\u0005\u009eÄñw\u0083î\u009f>\bñ\u0090uÇZd¦m\u0093ñ÷\\>\u0015±\u0096<m\u001f\u001aï«S\u0081\u0002\u009cËK\u000f¶ê\u0080ìB\u009c\u0086½B[\tãýo\u0089 È½G¹ÂÝà\u001f\u007f\"5\u0017;m3\u001ax\u008f\u0000¹WW\u008dFªx\u0086\u0007m37C\u0088îa\u0092\u0082:Æ\u0091\u0087¬\u00159\u0002ÿW.¡\\ÆÒúþ6F\u0081ãx¥ö'\u0094\u001fFÿ\tÕÄaÑE\u009d×Br#²³\u00adÑ\u0098qL\rï\u0002\u00823ÌÍì¨\u0086¶t\u001a\u0010\u0000ÎÆ\u0002e\u0091\bÍÓ!x\u0007B\u0013\u00ad\u000f\u0012\u001a·Ö\u0019\u0087õî>ÒI\b` \u0082\u0003\u008eÐp¡ph mÌ\u0012_í\u000f\n7\u001dO:¿\u001aévëä\u0003.?×\u0094¨9\u00ad3ëe2ÁQúb=\u0091:)ÆS\u0088vÝáó-\u0012Hb°ß\u0086²$æ\u0014úî°\u008c\u001d_)pr\u009fCI\u0019;æ\u0088·\u0002ýì8Eýy\u0097¶\u0004\u008d!Wªs\u0014E\u0001\u007ft³æ\u008ch¬¢·\u0012Gæ\u008b\u0011«ùé\u0016H\u0016\u0015\u0003ï\u0089«ð3\u001epvqf\u0091¾êv1D\u0014I/;\u0004\u0080EäÄ4¾Ú\u0082\u008e\u0018Ì\u009bÃ~¿Einá,æò,w}>Ð\u00828¾ÌçÙio¹4\u008b<ëûvI©}ÜÌÖz²ºñ^Ú\u001c¸OònE\u0015qôc1v\u0007Ró÷Á\u0099ØÀ=\u007f\u0088¡¿F¡9tw-\u0086õð\u0005Ûñø)P\u009a\u0010×\u0002\u000e\u000bJ\u0003 ëÜyUy§ZpKú\"Ô:¨B\u0090a6§¤\u0081\u00100öMUËßá«\u00160hº}Îaþ4\u0083Åþy\u0004~Q\u0000×ò ~(á\u0018Ùa\u00959o»\u0005\u0002\u0091[µÁÜe½ã´d@Ò¦àla£A¸;QÅL£\u0099(\u009a\u009c\u0006Ì¥÷}íKqîø\b\rËß'\u0000í/·ô³qsÕ~/w£\u008d\u000brLåÚ|·¥nb_Ï]ë9§\u001edat=\u0090\u0001\u001dMñkü\u0011\u0085t^Óî9»¹g\u0003FÝø-¹I_·\u008d^ù\u0097Ç&\u0094ø Cõiq´\u000e½\u0007oU_\u0005\u00165\u0018\t(bÿL\u0097l¬z\bäU\u008f°\u0016\u009dÀåU\u0099\u008d*Â:ðúkÅ+×ï«=ß\u0086éac\u0003·t¯\u008e]Ü¾4Ý.eñ·5\u008a\u0012èå2öWÛ\u00038]\u0095=Ú\u0095ì!^+a2ÍN\u009fS¡Ú\u009aåæI\\Å\u0004&æn\u009eÓbªiíuáJ^&_@\u0082ä\u008cE§Ã\u000e¬üQ°f\u000b\u000e\u0001§\u0099â§:\u0088<\t(è@LÎK;qupMµÿêÑ=ñ\u0018\u009d®\u0096Cê=ÝøÎG\u0085ya&µ2äèRtÑäSx°Úæ\u0094+`ô&·§-ÞÆV\u0002{ÒFà\u001e\u0007GJâ\u001b\u001f¡.)\u001a0â¼\u000bêi2\u0005\u0017\u0086HÐ\u001b§<V}ÜñÙq39eo.6¶\u001bw\u0015´¾3ùd\u000fÇ\t\u0019=Y1\u00adw\rp\u008cC?>\u0085îvG{XÎ·\u0096XÇÕ\n;ø\u001f\u0001%K«¼\u0092;¿³\u0001-\u0088ÛJ)Æç»êQ4*Zö\u0012¸:`z!b\u008f\u001f5\u0003\u0001uÖ8Q5\u0018:à¦\u0094\u0086\u001d}-:v\u0019À\u009a\u000bA\u0083ËØ\tº\u008d1i6ók\tºs÷ÃWìoô)IÛuúX\r».^£\u0010õoüø*\u0089ë\u000fÎø\u009f÷\u007f¯î7\u001fó×\u008cò$\u008a\u0017\u0097\u008bðæRwL¾ý\u0081ù\faÜ\u000e·«áUtlU)a½\u008a½ß`\fP\u0000üP/ËË\u009cEÝÎó¦\u0083C²w\bþ!\u001f\u000b¶¬ó\u001ce°\u007fúSéÑÙZRô\t=á\u009dIëA`\u0099Q8\u0006gÓ¤¶2\u000b¿z°?n=\u0001\u008ae\u0002h®«\u000f¦pÜ¸@\u008d%x\f];\u001bxC!Bx-a\u008f8,Ôg/\u0097vW§ãc^ÀJÌQÆ\u0083\"\u000b\u0017Ï\u0001\u009a6w¯§\"+wÌ\u0093Î÷äl\u000fæz\fQÄ%t÷æ~ZÜ\u009c¯0I/\u008d~,^\fsÖ]ØL~}-\u0000ì»@¦æM'õêÜ¶\u000eU\u0089¬éå\u008fq\b\u009e_ñÇP\u0086¯·\u0011¨ü\u0089?D¶\u00952Þ)\u0087²\u008dÂÙ°YC/\"\u0083Ých¯°\u008cãv\u009fÇmÙ\u000eÖ÷\",.\u007f?¼Äxø\u009dYòM\u0080°d\u0091u¥ðX4b>,ª5_\u008a\u008a#\u001e\u008f¢\u008e¥LÓ²8Ì»P<\\¡¢0À6gLV\u0099»¶\u0091âúäH£m\u0014F=K\u000b{¦\u008càù¦\u008c©ÔTt\u0014ª \u0013|TÙÛ\u0019Ö #B³`)ö~ó)Ñ¹y¹îì\u008cL^t9T\u0007¦Îª<7\"\u001dõ3\u0090\u009e#Èã³\u0017%å^¬þeÝåõ\u0011ýß\\É\u00ad\u0006\u0096ý6ÚÎ9,ö\u0016\u0082òÆºº\"ÓD\u008eÃZ\u001a>ÇÛ\\î\u000e\u009ej_\tb¤\u001bý\u007fV2Û\u007f×\b \u0094A\rÇtà<\u0085ú\u008aÈÑ\u0012/\u001b¬åù²ò%ÇjßU§ézü\u0094ÎC\u0016\u00950h&!ê9¸J²²çÆÒ k\u001fêI6zÁÏ<ë©vf«@S\u0094=ä£!,²cµXÞ±hKH\bç\u009fØQ]R\u0098\u001cç¢S²ÑÆåóêê\u0000Ë-#\u0092;'> oßò]\u001f.;TÙ\u008eA\u0090¦Ê\nëç\u0081lË\u0088[¶¹\u009fTS¾|Bé\u0015D½j\u0099êf\u001d\u008a.Isw¦ZÈù\u0015R\bYì\u0089:*\u009a\u001e°½Jí/vLÜ\fvM\u0011Q\u0018G|ýU\u0095\u0089Ò\u00ad\u001cYã³¬êë3\u0019\u0003\u001e\u0016PÍ\u0091\u008a-\u0094\u008bû\"8ÄN\u008b\u0013Ei\u0010\u0095=\u009bÉ]IG\u0084b\u0006\u0016\u0097jï\u0010§^ \u001bæÛ«%Wç«g5\u0098\u001fuÏ\u0005\u008bg\u009e-(ö\u0096_E\u009c8±ks1¢Dø\u0015\u00adõó\u000b \u009d.\\§\u0098ÿ±u!ÿò6 óY{\u000bÈûV7\u00ad?\u0099i#oË\b®ò\u0085zÀ7Â*u\u0000ýÄQ>ð\u0014\u008f\u008aG\u0084ps\u0085áâUñ\u0005¦~&f{´»T\u0097\u0006áÅ\u0097ÿÍïfT\u009aÞ\u0001\u009fî8E©¢¸\u0088ª'õ\u0012ëò\u0019tÇU\u0097Ã²\u0007¨|\u009dúÌO¼)\u001dtoLE\u009b\u0091f\u0092w\u0005²\u0081>9q\u0007\u00804\u0090g\u0099ÞÒy\u007f8ÝÑyDtÒ\fþJCí\bxÜÞ\u008c\u0096náUû\u0084W¬Ïð\u009a\u0002çÜ}îÐÍ=ycy#\n\u0002VWz¢ôÃÂ\u009c9þ¹\u001f\u0094ÇËî%µÓ\u0000'íÈü\u0007Ú\u0080ZËÙ¤]ãÜA¶\u0005}ók\u009eÊÆ¯N~ûóë]\u0095Îï4¾*Jõ\u001e±}\u00049lÉì\u000bõÏ7cÔ¸U+Z8\"'\rzî\u0083¼\u00adc¢¥¬\u0080ê:w6O°³\nÓoxÝDSivWXlZ5Ô\u008föÙ\u008f\u001b?¤{\u0001\u0019\u00ad\u009aGAÂÎ8\fO,O|\u0015_JSx1\u008bÀr\u0085%\u001fe:úÔwg\u001f6¢ë>AíB1T²\u001büº®FR)+s/K)xÚyÐ\u00913Óü\f/\u0089Qê\u0094p~£Q~\u0086h\b×Þñ\u008d\u008aíðß\u0096jR\u0081,ï\u009c¨\u0016ë\u0018Ä\r¶NêÍ8Û\u001bçôZ\u0081Þ,zÈÀI}Ê\u008aAav£sÇô½ñRo\u0005@À\u009eÉ\u0080q\u0089ºiÔ¤s\u0085ª>ô\u001bªY^X\u007f²HyC>m.îøO\u0089\u0081\u0003\u0084ñ4s¬8÷.<[¾_pW»>õ%r\u001b\u000fÉe'\u001e4\u0089>æ\u009cyu'7çÍ{o»\u0090\u009aîÁ&qíJf\u008e«\u0017+Tö@EY³ËÜ\u009dÏÙýß¨,K\nÖø\u0002\u0013+Î°ü»ú\u00820\u000e/\u0006F\u0003þv\n¡\\`ÐIüÃ\u0002ÀøG6\u0086éÁù¶\u009d\u000fç\u001d\u0095Ø<\\^\u009fXÚð\u0080\u00022m\u0005ò¢8ûx\u0082\u009f\u009a\u000b\u0001\u007f¡à\u009bI\"~×íõÖîÝ2½ÞÅ)0\u0091Rï\u000b\u001e\b]F\u0006\u00819êõQD{Û\u008d\u0094\u001e\u0001\u008b@Üß\f§N\t;ûF]Ç\u001a\u001d!\u0006ßqk\u0000\u00951©¡\u009f_ ìî\u008dèT\u0002a°nJ\"E\u0004áÎ\u0096ÖÄç0ëÚ$´\u00151\n\u0095\u008dËLÔ \u00876v\"\t\u00adBC\u0088&\u000fÑ²-2\u0094Á\u001e\u0088G!óø?±!ø\u0091\u0005Î\u009eh\u008ab¥\u0007?\u0082\u0092ÔNaZW¬B~H;^ãqù/â~\u0017D\u009cº\u0088±¡\u0000q¾V)8@ß'cù5PRAÁJMÍµ\u001d#&'oh©\u0084°Çy÷YoL\r\u008e \u008dcvu\u0094`\u009bÝ©Á\u0006n6ao¥\u0097²(NÁ0ó/iiKI\u0001cóÌæÒÁ«k3\u008eïÎ]\u0098ìÌ\u0089£\u001b\nÖº^tÆ\u0012x£I@\u001e\u009c¨ãÁìùñÒc\u0012/ëxdX\u000b·áW)Ù×ÓGMrî'zs\u0003Çeê»\u000f9Ysp+ä\u008e\u008bV9Mþ{@E|\u0011Ñ!\u0015`³î\u0097\u009eÆAECð¼\u008dS¾%\u0085\u0000\u001dÂ7i\u0099\u008c\u0089È#Û\u0088öaø\u008e\u001cÆR\u0007\u0005¶Ö\u0088ñRxÔ®V½\u0016hô£fÇ³¾T_;j\u0007\fYV¾J\u008a\u0010OÂæ\u0094\u008dÑ\u0010ø\u0019+ði£sîc³æ\u0006\u001fj¤_\u0083³<k\u0092?t%dº\"7È:\u0085}\u0017ÞW n'Àx¸îQé\u001d©È?ÙV*jnT\u0098'x\u001cð\n¹üÉ\rð¶Éãwbû\u001fh\u0090(|\t¦|v}¡\\\u0002æ×\u0095ú\u0015VF\u001d+x\u0094a\tm!i\u00801¸\u009f ¹E\u0092\u0094\u00854\u0018m\u0003Y+ \u0007axkz£\u0019yV«Ê\u0081\u0012» \u0002\u0080@ø\u0013J\u000e\u001d\u009b¦\u009aQ\u000b\u0019ÁÎ\u0081 ¤Mè\u001f\u0001\u000fm\u0083þu<í\u009c!@\u0087µÄ,¼é9\u000fDCks^3#ÞT\u0087.ýè\u00ad\u0099XÑÖ-ÁéL/×$Ônªl¹î¯`a®?Äu=n¬\u0091üP7\u009eÐ¬V,Ü\u0097Ü\u001e6]Ç\u0000 &i)>bo\u000b½wä\u0085ëk!A)¢7\u0091\u000b²»gèCiú\u009d\u001e\u009e·\u0099\néº2z\u0083\u0010\u001en§ù «\u007f\t8<¦ë[ \u000fKäp\u0088q5\u009aÙá\u001dPL8\u008a¬ÞÅ\u0002å(ê·\u0002\u009f.¶Ô\u0013\u0014å\\nóæ\nJ\u001f\u0084Èø\u008cQzl0½\u0092;\"²Ö·ô>Ì\u00044Æ\u0018á7\u009bRÊ\u0097W\u0010\u0004½£\u001bÚ»\u008c 1Ku6\u000b¤i\n&\u008dMn\u009f\u0098»éî\u0000ô,²ûó\u001f\u0093Z\u008bß8\u0087±ìÚÐ9I\"ÓyY\b õò\u001c\u009c\u0094¥Mýÿ\t¤Á\u0011Òµø¼\u001f@QTc|Û?¸Ì¼\u0000TaÏ´«\u000bÔ5Â¿µ\u001fñ¶©\u0086¤\u0017ÙÊoy\u0086ìM\u0085þ\u0015aVº)º«\u00066j\u0007S´½øèi@\u000b(\u008b\u0098ß¼|LtX\u0085ý\u0002\u000f&ÃoÉ.[\u0085\u0090@\u0080Eª\u009bE¶h·^¸(Q\u001d\u0018\u0013Ì×kiHM\u0086\u0016±m\u0099\u001aÊ\u001d\u0011x»W\\cå}\u0018!Áò\u000f/\u0089\u0092\u0081o\u0013Ç\"L\nf\u00057ÓwÐX)\u0094åþp\u008bG\u001aaÙ\u0019\u008b\tÌ\u0097\u000f\u0011\u0006®4×%X\u0092^\u008c\u008cæì\u0084õ\u0015Ù:\u0099M3~Ô\u0093Ó\u0084Í z/ä\u0006K\u0080éY\u000bL2,Î\u0016 \u009b\u0002®\u009bDfËÑ¥\u0015Á\u008bx¬\u0094Þ\u0019¹V³Ê\u0082\u0012Û \u0012Ð\u009càùIU\u0018SÍBÿ¹tÈáÅ,õ\u0013\u0012Ä\u0097Mo[kÖÚ@\u0098d´¾ÝzXÙ8jå\u0096Ä\u0089ZÛÃhöÁsàý¢õ/nU\u008c\u0087ð£_\u009dD\u008eZAeÜ\u009e\t2\u000f\u008e³\u0012Û\u0004å¹\u0088\u0090¥«iyÀ\u0087I_\u0083LnQ\u0018c\u001eÝ\u0098¼õ|,\u000eÄ\u0082CÍ¹<ÏU\u0086©úXçÉ\u0090]&ðY\u009f\u007f ó°3<3îCt~\u009a°x«\u009aïñ\u0090Ô\u0001<\u0083\u0005JÕ\u001bÖ5îûâJ\u0089m,×Øt;Éô»þ]\u0007sR$±V*ÎkW2¬$÷\u0091i§ú°³4îWK¢[Áö\u009d\u001e¸\u009f~\u0091g¦Ú«\u0017Ìô\u008bÝ\u0093\u0097#QË\u000fÂÖ\u008a¶«ê.t@§\u009aõü\u007fG¿Z\u001a°Ð\n|h'ÖA»ÄïDiBQ\u00196Æ\u008b\u0092-WË©l¨\u007f\u0093RÅÐ{vÈüR2©É\u0017GxÞ\u001aÍt\u0095*Á,\u008f-.Ú\u0098\u0019\u0092Êhu\u0092t\u008a\u000f\u001cË\u008fô\u0017HÖÅº)à\u0087\u0000/>M¬Ì\u008dñüñþÇ\u001f7¬Ô·=-\u0011 è7\u001f>'îÀVz¿Ë÷\u008d©5\u008f#ð¹\u0085|;ñ\u001dbS=àL²D¬\nä×x\u0098z\u000bP¹ëy\u009d7²ù¥×û\u0011z\u0099£o9ÊTÅq\u00ad*1ã\u0080l\u0083¦\u000båÔ\u0002\u0004\u009d0&\u009dH\u0010º\u0007ÓÓ°x\u001cÅ[\u0011\u001f\u0081.¤\u0004o\u0099+÷sh\u000e·tT)d?Ój·Ü Ä»dÅö\u0082}¤¤\u0093Z\u008b\u0087P\"¿Ë|8»æ\u001eüÅhrÙ\u000fª]\u00815;O±¦\u009b&Ùx[Ãç\u0082ú:\u008a\u009dÀûwuÛ\u008fe\u001bñ4\u0017\u001c\"u\u0019¦+tN¢ç@þåSÕµ\u0091M\u0093jqÊì\u0010d\u0091\u0015Úªjéå¾gã¾\u0000$\u008aÉ\u0007ÆÃ\u0005Äm/\u000f)ûÂ²Û\u009br´<q³án\u0093|v§ANãÄj_D®z·\u001bb¿\u0089õ\u008a:rò`¼½§¡U\bå¬ÞÀ\u0011±\u0002±\u0002 ø\u0003 É\u20c4*IC3\u0091Âd\u008b@\u0014>\u009eÜÓJ~FO\u009dï\u0094\u008e4\u001b¼\u007fB¼Ü¦BÜ\u007f/þ4Ûâô1qeö\u000b\u0012\n£\u000f\u0094ãÀ\u0000Ü\u008f\r\t#WSñë\u0086\t!=\tV\u008b\u001fR-\u0083\u0018\u008cÞ\u0004¯x|z\u000e\u0089³(¯ß\u009e\u0098Î¿4#\u0005¥\u0092\u0007\u0088ÁðvþÌ\u008d.K²±¿\u001d²\u0018¾ea\u0090Å&Û\u001f×\u0006aD\u00124ý\u0000ø°1Y}\u0095p»à¿²\u00956*ái\u0019DC\u0096Ñ\fd";
      int var4 = "Å?g\"k\u0092å\u001eög-ñÜ\u001dÉbÂU\u0099n\u008fJ:ÂV¤#ù6<:<xï\u0089\"çªC$Ú\u008czcÁ>y\tRéj)\u009eçù_\u0017¢\u008b\u0099æø_\u0000U,£\u0094¤x¥ÇpFÝ\u0015»sul'F\u0017\u0005|e tm»\u0080vw*±A|¨\\\u0014À\u0016$\u001b\u0019HæÓ\u0000¼±Ì-\\VBU\u001d¥\u0099\u0003\u0082c\u0095\u000f¸h\u001e!á\u001eêå\u0097K«\u0081\u0082CR\u0013Çì\u0014ÁÏ\u001f\u008a\u007fªú9\u009aå\u0080ÒXÏ²4\u000f\u0098æßNí Þ\n\u0006\u0088{\u0006JÊï\u000e#¦mø\u008f%'\u0082.§\u009c\u001cdð\u0011¢«Í\u0082±¶\u009f3ÔßÊÔ\u0094¾Þ\u009d\u007f\u000e¡\u0019$ýÎ,\b0g-Ô3nÁ\u0004¦¹\u0084B\u0010ù\u0019¦ËÜH'¡gïØ¯g\u0006f\u008d\r+þx\bîéë²O\u001f\f(Q\u0016\u0011uÔó\u0092vòå`\u0091PTòàø\u0080}Ãy#Ãf\u0010Æ\u0098\u0019\u008dæ\u0016\u0013íñ+\u001e·rÌÌ5Ł\u0018\u001a\u000e6EÚ\u000fÙ\u0014Å\u000eu\u0018mÇÔìTH$¿Í|Ûî¯Y\u00152¿ ËBUd&÷«B\u0012Í[ã´ury\u00adä\u0011êWQÃwÚ\u001c4p°c\u0081<c\u001dZ½^äÜøª\u0098Ù£¿CÿLÑ×sá\u008b#\u0091\u0097\u0014\u0095\u00adç\u001bü$.¬¾\u0015ÄÅ÷\u0080\u0092«#òþhÁ\u0018k\u0014\t¨¦ëu°ø\u0017|ý\u007f×âCÿX\u0018¬ïHfBG*\u009dÁ³ÐmAÙ¢6o¹\u0083;¯]bC\u008c÷Ù§â!\fµÊ¹(\u0012áRû\u0002ã\u0011í¶\u008c?\u0086¨o\u000fiáÙw°\u008c\u007fE?JSK3\u0097Çu±ª®ß\u0094«QºÎ\u009e\u009a¶\u0087Õ\u0004Ó\u001f+\u0017á\u0006Üº\u0089i\u0080t\u007fz¤ÄöíZ¡ï¡xw¤o\u0089×© \u0099\u0015i\u0015ó¨Ö\u001e\u008cG»\u001c>\b¦tr\u009a\u0087\u0096¡¦åòÞs\u008d#!AÀ8²O\u001d©ÂÎÚæ\u0090\u008c¤f\u001eIîr\u009ba%¨\u008eá\u0098·s\u0083ê`÷A£Ü*\nt\r\u0099î\u008cÇ\u0015øJ[\u000e±Ê0Ü0\u001bâ\u0096;6\u001c`\u0087Þ4ÇbªýSÕ¿42\fý\u0014Çà0Á\fð\u0085Ft$O\u007f¤3\u008f#\u0003\r!\u0011Hk¨õG·\u0007>é&s$lÖ\u0010ß]bZX\\,¸\u009e_dLozg\u0002ǚD£\u0085\u00014<!\u0005Ñ^¶\u0006\u000f\u0003%\u0019°íÃ\u0013Î+R\u0007+4áf%ÑÂ\u0006\u001eìï\u0011\u0086MlÎ\bÀ[Çb\u001c\u009b`¸¨a` %Y\u0006Ù¯ÈÃtïÞ®Aã6i\u0095:Öv]B\u001bÌT\u0091®\u001c\u008aÊk¼rw½ÈÐ6OhéJ\u008caê¬Nò¦f¸wfiV\u001bÔvÉÙ]\u0011,Ü$VÒË9f×¤÷-]\u0095L\u0015e\u007f7¤möØZ\u001b£x!cp6\u000b/ä½\u00ad\u0010\u0002C¡|\u0019\u0019e\u0001¾\u008bÝ\tê\u001dÛ\u0096Ó],¦ðP\u001eþ\u0088To³¿ý&sú\u001dd\u0016#a\u001e\u0010ºf¼ýÌ¤#¦\u000bB/î\u0004\u0016t¬\u0018ú¥»o$Ç\\<¢£ß\u0016\u008eFÑ<m\\\u0011ð\u0087À\u0001Nex\u008fKp\u0093¢6\u0005³?v\u0090\u008b;Ü±\u0011´\u0019_¦\bneÃþüsó\u009f5ÀRIÏéC\u001ah7H¨¤G\u0010iø\u0081[\u0016\u001e¸Ã\u0097%D\n2½F]\u0094\u001d\u001c\u0019)#V7|\u008a5v¦½\u0087\u0001\u0090\u009a¸]g/T\u0087ám\u0001u¤åøHTînÆA´ÿÝZ_Pef>\u0087á\u0004Þ\u001d\u0084\u001aÛ;\u008f1j\u0014;\u001eZ9Ï\n\u0082\tøî.\u008fsºÔ³\u0082¿\u0019³j\u001aôa¥\u001f?\u009f\u008aJ_r\u0005Õ\u0092ÌÁ¤ \u0010§pÑ\u0089,ø\u0002[+\u000e±»ÂNÝL\u0001> *A\u000b\u00855$öw\u009bÇÞ(OU\u001aïnP\u009a\u0097n$IwK\u0080ã\u0092G\u009ez\u008c\u0013Ú\u0007¯,fÚ·\u0010UöfC\u0093Ñ;.ÏJ¯D\u0080\f\fz\u0006|Üx\u009a\u0003\\ýN%ô.SY»Ù/ç\u0013»ÛJ3&lñº<,M8U¿´èÿqY\u009aèp~¦\n\u008cY \u0018\u0095ú\u0085D10R÷Vqóëë©Z\u0099®¨Q>\u008cÃC¼\u000e¯\u0018ü/½ßaÝæL\u0085aG_\u000bt¥0*Ûõî%Q\u0007\u0099\u0007\u009dÀ´\u009fÐuW\u0007Ú½w|\u001aù\u0099\u001b\u009dv®\u00194Ë°ö$\u0097x>÷<XÒ&\bá¬jÆyÿ\u0003ÒP\u0007e\u00adÜ+\u0090D=\u0007\u0088\u0013ãÞ\u0095\u000b®\bØ.ûq\u0089e\u0098E\u00187J*\u001dQ\u0083\f\u0016õ&\u0087!v=ý\u000e\u0089ý;\u009aPïMÖFnÜÝ\u001bk\u0015\u0017O`ß\u0001ó\u0000Ül\u0097\u0001ÓÍñ\u001f\u008a=|xäÜG\\Å¤\u009fï¾Z*·\u0000\u0004j\u0080\u009d\u001a\u009f\u001aâß¼@\u0000%;ÑØ\u007f¶\u001a{V¼\u008eØ\u008a¹\u008f§(çx-\u0007²c\u009cn\u0099\u0007ë\u0018\b\u0086÷\u008dö¹~\u001cñ®b³´\u001c0w%Y\u0007\u000e×}½\u0084\u000e2íò¨ÜG\u0090ëÖ\u0016]*'\u000b\b\u0012\u008a|¨6H¨¯\fµ\u009fÂ-¼/,på)c\u0019\u0010\u001e\u0017\u0013~P,\u0011@ð6Gs\u000b\u009dëþ\u0014\u0097\u009e>AÑAY6ö\u000feö\u0089Ô\u0097XÝlËÞ\u000e»inô\u0017õ\u0081£\u009c\u0099G°)$-\u008eGLÇA»W\u0017¯ì§\u009e\u001ai%!H\u0003Â9\u0015M¾Ä\u0085\u009bRÆ«oÑ+\u009bùBH\u008c»B\b\u001d8\\§\u009e⬇J\u0094Dç\füuÔ%ä\u0082Ñ.Rv\u0088UPªÉâÝ\u0085úÒËÿ\u0087ñsö3¡:\u001c£Z5)2\u0080¦\u0012\u0086\u0017*\u00943Ý|\u009e¯¤q\u0097Ê\u009aÐ#lð®è\u008e\u0084§ ¾ªrhëÔ\u008d±ýà9¤_¬p?l6=RÄÛ\u0016KÜ´@ZføÒ\u0088bM¤Ì\u0083ÐÅÑØRÞòQ\u008b\u000e\tùº\u00955dLûæp÷`\u0095qÆNÒ\rû¼ML6¾,ÿ}JPÝ\u0099\u00050Á®oÂËB\u0006(ÎE¶aÉ&äF\u0086¤x¢\u0014ñ\u0019C\u001dDÈÇ\u000fínÒ\u0004EÞuÍ¦Ð;¾Íá¾¨´\u0084\u0018 \u001dÉxõa\r6`&Êï³0\u0002+bá×©®¡\f\u0088;\u008b\u001bzU(éð±Î\u008còrÚ\u0084ü¶\\À\u0017\u001c´\u0094\u0087ÿ\fM^qa\u0002#\u001cýª\u001eÂ\u0090ÇÊØC*þî~Ì\u000f7G?\u0017\u0094\u001eÏ\u0005snvR\u0016jØ|\u008d$\u0010\u0095Â\u001c÷T0b\u0088Ò\u008cu\f\u0091\u001dYÄËk_\nÄ\u00156\u0099\u0081Ê\u0015\bÞcàt¦]ò\u008b \u009c\u001e;(gñ»ò\u008aÍ\u0091Ä\b\u000e\u0081þf\u000f¢\u0083ðÜ\u00143ifÙ\u0087°\u0092cÊ+2Õ\u009fGÐVÛHìiú¾(ÔAê4\u007f\u009b)vò\u0004×c\u008ci¯F\u001c\u0001;\u0014@¥fdÜL/×@«\u0003»\u0019·\u0091\u009e\u001b÷è\u009ch\u0017\r\u0016êI?\\\u007fÈÍ+\u0011S9+\u0089ÉLãD_-s\u0012ó«$q\u0001wâÕz\u008c\\ÏjÚ\u0084Éd\\\u0015\u0091ù#\u0089\u0004\u0093*k'\"&ä\u009dÀt\u0011ÒÐ\u00952`ÿ\u001c%K/\u008bÅf\u0010CTeÿ(ÿñ´µèÌAiY»Ï\u0015\u008c&\u00910y\u0091\nØ>I¬4$%\u0087ü\u001bnÎµ¸s¨ù¡\u001cýäé\u0099?F¯Â±¸\u0011\u0002XÔ\u008dó\u0003Õ\u001díp¶ÕcäëÉ\u0014tÚ©é]\u0014\u008f\t\u0093Tö\u008a*\u001aÎ!¬¼Öµè\u001e+Ø$µ(Ëß´Ø3\u0083ÑíÓç~y\u0096íé\u009b\u000b`?íÄt\nz$Ö\u009e\u0081Â\u00868r\u00adW×¥8\u0014^Þ\fÒÝ¨t=\\\u001e\u009b\u0019»¨\u00955¥\u000e;\u0097j\u0087ÉðÍU2Ô<Æw©xÑmO)éÑv\u00adë_\u0002¹+*Ôæ\u0099\u0084Øa¶T·OI~\u009dì{ø\u0010F\u000b}b\u001b%\u0097\"s²¦×k\u0086¨\u0098ÞQÏ\nÒ\u0084\u0080GûbñD\u0095\u0010èð´«êû\u001fªñ\u008cj\u008c\u0014þv\u0094EðÝ\u009a»§<\u007fùÙmBzWªM\u008euç\u000b\u0018¼@zÏ\u0099o@\u0017kÎß©¢*¹ý£ìöp\u0003\u0095\u001fÝÈáÐuFâ¤N\u0090t\u009b)É\u0097@å\u0085Zf\u007f\u0000\u008f\u0091F\u0090ÔÔøBÛa_§\u0089\u0081µ0BQÌ\u0090\u001c\u0013^ù\u0080´rãÊ|±\u0083\"éc&:\nÍ¼\u0007\taÇ+°^O)-M\u0013åÏ\u0006/¤bÎ8xäx\u0099\fDìÛ\\î\u0088sÚ\u0012O\u0095Â\u001e\u008fp°dVcpòCsZéã¾=\u0080É\u0004\u008dÃ]¥0ÿ\u008d\u009dÄ7\u0098\u0012XÉiPêÜÐóÅr\bdYN1í\u0012é^~éæ\u008eÏ¥$\u0082\u0000¶ßÒT?]\u0091ù/M\u008d7\u001eHµ\u0080\u0003KýÿOý ñ¹}ÊLk¯RÖw>\u008bÏ\u0013\f³\u0012*rÓª\u0018 \u0087\u0004\u0004Ë\u0017\u0014Oöl÷©uWÛn{98ëúó\u0089á\u0093M8½®ØÐ\t¢©\u0086{Ã/äì\u0010Ù¯\u001c\u0015ðGª ¡\u0092µ¥~\u0019uõÊ9\u0003SÇ\u0096I).\u000e-LGs´MûÖrd=j!Ùt\u0081Ú-\u0002Ê´\u0012\u001d Ö\u0080Úä\u0010\u0017|ÔÝãlchËÖ¥ì\u0011yÿl\u0012J\u0094ßá\u0001_\fYñr!£\u009càÀ\u009eõ\u000e%¾Ëü#V-\u0096é¾/ÓXó¬Ä'áó±\u0098à'Ð\u0084\u008b'Óø¼}OkÀI\u0093K\u0007íàIK\u00adÓ0{Ûô0\u0015d×\búéS)ó\u0002e\u0016bH±·¨wóé6\u0006\u009f\"7,QÉ¤\u0080\u0003\u0012\u0083²ã\u0019\u009fTö\u0088©_ek_\nïmw¿.\u001aî\u0094'ÕÊ4p5\u0092í=I(\u0082\u0089u¥(\u0005_ã\u0007¡{\u007fä\u008dé5=RìÁÿQ8ü\u008a÷\u008eòattL\u0094\u00ad¦áÈ\u007f;ÆÔËî¤ë\u0010\u009bÝw\u0014\u008bU\u0007øým×3UÈÜ\u0090.IX¿ûõ6ðk]\u0090H /;ÆZ<.\u008f§\u0004%\u0013øR\u0089®S î\u0014)É²Tûþúö{U\rÃ* AÚ~VºNKz½\"\u0091LxCö\u0089ñ\u0017#»\u000b\u0083*û'\n`]¨>\u0090\u0084¹\u001cs\në\u0000\u0012ßmÃ¼Z~\u0086«\u0011\u001erÖ¿\u007f\u009f\u0016=üá¾ø\u009aÒ:Ì£\u0014\u000b96påâÌ=5\u0005~ñ\u001cüXÈT\u0015\u008b\tâäÒ\u001b\u0083±ã\u0018\u0086?íÅ\u0092ÿO~\u008f\u008d\u008e\fM)Üx\u008aF°«FG={c`,ZÅb4Õ\u0012iì\u0099(î\u00851>V\u0087eU\u0017\u001d0Kü\\Ä\u008d~zSîäµJo4\u0080z\u0003´\u0082½÷.°¨U\u0000<\u0092lèØ\u0007{k\u0007:\u0084 \u0094\u0013ª<Ò8Ïß]\u0090\u0085ÇWW\u0006]\u0018ñIaýtr\u0007-ó\u0086²~\u0080\u0015aªV\u0084[øDw\u0099¤ßWcúùÿ\r\u008425§©¼Ó{¸÷/bu Ì$b\u0015Þ³\u007f\u009a-Ë\u009cä;Ä=\u000b\u0004nI\u0098ÎY>²u\u0085é\u00050*\u001e\u0013sMÕºæ°±\u001b%Â\b8ÕÕç\u009fD¨Ú\u0090\u0099: cÈ.Âw\u0085¤ÅFÇËÕ\u0014éEÐe£zäÈ\u0012\u009bóbÞgÂ¹õ\\FtA)\u0095Û ²\u0013\u0081W~ôÚÍLÊ¬7\u0099Ïn[?\u0004\u0014¶ïA´(1\fÂV»\u0011\u0086LKÈiÝ\u0089ùÑ\u001c\u001ep\u009f>e#Î\u0011]\"_\u000f|Ó$ð¥4ú\u0010ó¤¬Dåß~F\u0094R\u0011\"Êò´ô1ïü©\u0090K.2ë¬µ\u0082w\u0018åÜkÂÈ*îÝR\u00997\u0097\u001a#¸\u0000?ï\u001dúÇ]Å^)%üR\u0085î;õ0\u0099a\u00142õ0\u0095º*ìK÷\u0087\nÛèÒlOÓç¡án\u0011\u0006\u0089×ð²\u001b\u0089vhÇz\framÇ1zÏmÄz\u000fÃ\u0091®¬[Ø+L\u0001\u0081'¬·ãzÉ\u0095¦½5~\u0094/;â\u001a\u000b\u009ckÅüç¾\u009eØMýeyq\u00989ýÑO\u008a\u008ez\\µ\u00adÙ¶\u0082\u0005Ã¥ãÎl]M¤ü`Í\u0098=û¥+ø\u000e\u0018]TÝ\u008e\u0006\u0087VÞ.\u0014R©à\u009f\u0002\u0084\u0097¸\u00adíî\u009eA \u0096gó\bìÂ\u000e<[ù-\u0013\u008e¢Lÿ\u001fç]$\u008b\u009e@E´\u0006nòëa^\u0011/Gí\u008aH\u0099Æ\u001fG90¦\\ênP²\u0005ð\u0085\u0093ÛÇa\u0004\u00121\u001bI\u0097by.ZAW\u009b }»µó¶\u008a\u009dÚÑ.¾Å#ï¿A\u008c\u008dO@¿MF\u008c\u009aØ}~ø-\u0017æ~@¹®\u0089B§¯\u0019÷r²çR\u0081yçÌ£Á,Ú\u0000ö\u0098Û\u00199ú\u0091ÌûfMTL¨Ä¤yñ\f uÒa$Ý×þv5\\\u0001$\u0083\\\u000b9ÂØl\u0083«Z\u009dóP\u001fm{\u009aó8\u000bÖy²æ4\u008e\u008cp8\u0019\u0014\u0093HÓ\\kê\u008c\u0015Çë¾õÏ\u00adIv\u009d¹\u0001\u001eAë¶_xk\u0099Zn,uÙð[Q\u00005\u0003çá +>-¶2-§\u008c=FG\"î\u001a§ÔsêøÏÒ9=w\u0000\u0001£»\u0003æMhû³ý\u009avÍ(\u0016ÃyÊú\u0010Bº\u0012z\u0085ã/[\bHÚø\u008aw\u00adZNêàÚ¤0úÁÇ¯j=÷µäw\u0017\u0004·/°I\u0005\u009d\u0094>.<~\u008a¥ß@º«ÙOÆ°\u0012*\u0012\u0018\u0082/\u009bóÑ\u0017<;ñ\u009b1\u000f\u0011Xk!\r\u0090åý\u0098D\n\u001fÀðL\u0088É»s%q\u0010?§\u0006þ\u0095\u009bôR\u008cþ\u0084_,½>\u0098¦ÿJ\u009fås\u000b\\7AÚz\u0007Áí}¬b\u001bÃ½\u0089Ï]\u0088\u009aêÒvö[ù\u008b\u001dd}\u001a\u0006q¼¼Ð¹¼fú\u0002XÚQë\u0083È}\u0095°&Al\u0095ü(^k \u001d\u008b\nÿ0+Z\u008cÒ\u0086\u0007\u00adÕf\u0092\u0017¥¿\"Ä\u0017w\u0095?î\u0080Ð\u009a\b\u0094ìRF<v\u0089» æ¥ò>n\u0007!Á¼\u008d\u0005\u001d\u0016S^\f*)\u0011\u0087I÷·¬Â8áÜ.²)z»êÝ¿¥ã`W0{ZM)Â¹_Wá4Äòó£®®\u0094úùB?/\u0005»´ê¿\t =§ê;\tMF$Ý1I\u008e\u009d§\u0001ÒO·¸³¹uÂ{\b¢ûç'´mÓ½¾\u0018yÌóÃ¼'À¿\u0011\u001d,³BÙ\u008bàeÁ\u0082KaÐ£4\u001c¶Î8ûÝ¬+\u0099ògÄ¬QÝ\u007fý¥Û/(t\u008d0àóû\u009aqÄã1ð[\u008e¸ýÌÀÀ\u0016¼,\f¡èwËy\u0004á{ësØF\u0018Qh@Ï\u0014À\u0013¸»Dm&&£\u0095ÂbÌ\rqÊs[-É9jQÇ\u0093ür\u008fü¦Õn`°\u0003y©~Ñf¸Þg\u008f!\u008f\u009cª¿¿|çjSëµ\u00adïÙ\u008e\fhÄ!}Vã'z]8<;\u0086\u0003\u001d]{='\u0099p/\u008c¨^C\u009a_Ê£ó7*á.:]6Y$\u0095òGW\bã\u0012YáC\n²\u0091X\u008a\u001b\rõ³å\u0098Âá\u0002\u001a\u008b«b\u0092\u0080¶È\u0000Ä«æc'/ÆÉe\u009b@y\u0090Ô\u0084\u0096¢\u0080É\u0096ù\u0098i\u0016\u0004\u0081\u0014£ý<\u0004\u0007ÅôíMò\u001d,\u0011!J\nÿ£R2ÜsËE\u0083=\"\u001c\u0099TÛÕJæÊÝ°$×iýóï\n\u0014¿\u0097NÙësÌ\u0002ÿd\u0080\u009a\u0086;îÕÅÞq3|\u0080MÑµi\u0082\u00adéö<B\u001b>Âx)Ûå\u009fudJ\"ËÞ\u000f\u000féÝîá÷û\u009dã\u0094ò³\u0084Æ`ÑðÍå6\u009e¥\u0001\u0094LPS3ûÀ¦\u008cÎ\u0012R¨\u001c»¦úÀéËóÄ¤\u0002\u009b*»±°\u0094Ó\u0089¯n<7·½Y]o¾\fÝ l¡¾\u009e®äÉÙ\u0012ß×\u0096\u0011Õ]ë7·\u009f¢f\u0011\u0005Éõ¼ôW\u0000\u009d4\u009c<\u0080ö÷;òÑÞ\u0091¿\r v\u001d\u0091Si\t¨(\u0080.XlÕ\u009bÎ\u001e/ÔUù\u0083<«ì\u0014P\u001aÝÓ\u001c\u00821M@Å£é°ÿ³êÂ¯ÕJJ\u0091+_Iø\u008a¼zÎ²\u0088\u009dÊÍ\u001e\u0090®=ÆdvÈXiUåq«s\u0012BÎZÙ¦ß\r)>\u000b°]+\u0080R{Xoæ\t\u0005ó\\Pð?@â!ðó?\u0092\u0001Ê´Ë;Ï·h¿@\u0096XºäÛ\u0005çsYÛÑä\u0012pM\u0090H¾+\u000f±2Ø\u009dêê\u001b\u009aïÆý\u0090RÎ³ï:\u0007ZÝg\u0096a\u008d\nÔG\u0086\u0092FÐö,Äà\u0013Ù7[ Á\u0002KÑÇ\u0085Ah!c.\u001c\u0086)\u0012TvØÀ£\u000b&\u0083\u0006ÜÐ±µ¾nÁsR\u0019¼\u001e6ïJ\u008fH\u001fÅ9Dºj\u000f7paCL4éä\u0091\u0006\u0087pX»x\u008b\u008d\u009etÀæ²~H\u009eØ\u001b\u0082p\râ\u0081>£Á\u0014\u001eZ\u0094ù\u009cÂ\u0080\u0082õsñþ\u009b»\u0093J Ø¥ÂèB~ÃÅ-ü\u0080¿\u000e`·ÂN\u008böQ´\u0002baæÈÎÌ\u0084U(?\\D#FqÎ$ûX©1\u009fRÏ\u0014×ª1£\u0083\u009d\u009c\u008eJF ¡é\u0091íBê\u008aà\n\u0086Â¸°¡û\u009eØ¢Á\u00007~Ú\u0094uxf\u0018\rKª¶\u0082\u008fõ\u0083Iè¦?©CÉ¹ÂSp\u0085ô·úôbkÝ\u0083b\u0086VtA¦\u007fó\u0088Y\u000f\\\u0097 N\u008cr\u009f$\u001dp\u0088§¸\u0085\u0002îN\u0006Ô\u009a·\u0098]\u0004jÈHÆ\u001c\u0081\u008aG¥ÕT\u0099a¯®\u001c÷¾)@©xã\u0091ò\u007f\u001e¸§\u001fó\u007f-\u0099)\u0086ÿOð\b×3\u001aÏD\u0084ßOñ¿¯¨Ôw\u0095pTÂL\u0085>§)\u0002ÕðÝ56\\àä\u001f%07\u0003}\u001a¿Ç7÷³\n$Õ\u0000R\u0002\u001e\f¨\u0086\u0089\u0087GôUÈ<7c)û\u000eÕk¤\u001aCk7\u0097½Ñ+&Îq\u000fQc\b¨¼_{)÷\u001ck'_3wÅáq`ÈnßTIYn\u009e´Lvj&=$\b\u0082º \u0085ÉJ\u0080\u0015\u001e£*è\u0084\u0093\u0096¬£á\u009cÇ äØ¿(r\u007f\u0098\u0090\u00970ø»\\\u009bIë\u0011à§D#\u001bÇl6ÚÇS>óu\u00adè\bD\u0097I\u0011ÁRØé\u0010\u000bÞ³\u0016\u008czË`Ä\u009d3\u0006°¿\u0094ÕV\u0007\u0080\fÒ\u0019c¶ÈäÎ\u0000z\u000f\u008a½9Õ\u0082#ã·\u0017N4ú\u0005½Eæåt\u009dÒ\u0005\u0089mê\u001f\u000f\u008a/\u0014yG¡oí?.É?\u0005Ú\u0082t\u0017ð`s/\u0095\u0012 ï¾-Ëì4ôÖð9y4\u001d²aãzïg\u009cî\r\u0097\u000f&a'£\u0094\u001d:\u0005\u001b\\±`Ì\\ËKÔ¢\tó¯Ø/Î\u0015\u0011Y47ÆÍ\u0095 PfM7±{\u0090;\u0081}V$cÐâ}ô·\u00ad¨\\®\u009e\u0089ó[U\u009fëZÿY\u008bw6\u0099¿j\u0017å\r¨¦>Õ\u001d&_c\u0098Øªº}ÑYpÆËa§±QnÜQ?ËÄ)ÙÊ\u0097ÀAËGÅ¶lØnõS\u0099É\u0019\u000fÿ32\u009cþÉåëàT\u0085^è\u000b\u0094®\u0080ñýwg4R\u008e?\u0007\u0098b1\u0088\u009b[\u009f©k\fø%4d7\u0088[\u0098Ì©+Lr\u0004¨V!\u0006DQ?\u0088û×\u001d\"gmÈ&{±ë6\u0089\u008dºÓ\"â\u0014vÇdDñHC3ðîõ\u008fW\u0002ý¡\u0090\fv@¥X¡ú\u00917Ë(^MÉì,êÊ\u0003¶±²^\u001c\u0018'\u009e&k\u009f5s/âòV\u0016c\u001ez\u009a#(X[%Co\u009eH:åzeØÅ\b+\u0096\u0002YÍy\u0099\u0082õÍ\rîÏi\u008a\u0093Ò\u0096¶G´\u0000V\u001cº\u001f\u0099ùç¢9zK\u001c\u0084\u000f<|2Øë§«Cô\u00886\u0002gâ\u0088KA¾Ë\u0088%LÌ©ÿ©z»\u008a´\u0085HZ~=\u0096\u008c\u0015Ö1_¨'Ã\u0012\u0005àW\n{\u0001@o\u0015LÁáâáÍ×`¯\u001c\u0094CÜ?\u001aã\u0004o\u0096Ù¸\u0084àH\u009eb\u001a\u0099¯\u009a}A¸uQøs@«f\u0019ÜÂ4zP\u009c{\u009a\u0015¤3\u0010H\u000b9EÌîæäI:xÕ\u009fÿ\u009f\u0013£\u0005\u009bÇíÍ\u0089\u0093\u008eËfp#\u0006wÁBÿ\u0090lÇÇå,æH\u001bjûouop\u0097zt³>\u008dä\u0093ÝÃÐ\u001fß½*%\u000e\u001e4ÚF³\u0001$ÀF\u0018Öµ¬t)Ð\u009e<½lÇ\u0002QÎ[\f2Jz=\u0012Úw\u0085ÀÇ,¢£\u0093\u009aëqV¡\u0014ãöØ)É´;»(K¡\u0001ñ~í\\¸\u0010l\u001c\"\u008c\u0004ÄçÞ\u009fÈC-b\u0018Þ\u0099\u009eR>Ô\u008f2W\u0016\u0017\u009f.K]7¤©\\$G\nN\u0096E\u0091<0î¡\u0002Ä\u0015ÒZ\u008f4\u001c®Â/\u001a\u0087¥\u000b\"ó²Ý»\u009cÎåK¡ÌYy>\u007fT\u0003\u0011Ô??\u008bè!ý¤¾\u0083G.Â}ì\u0090?\u007f\tü\u00023ã²\r\u0005L×\u001f¡#Þ¬ÎQÓ\u0088¡KéËGkyª\u0004x\u0015\u008dH\u0095W¢yýÛêè8üÂÊ6\u0013¢ý\u0005ªjì\u0018\u008fa\u0017\u00017¢Er\u009e\u0018\u0000+Û\u0094 Úâ\u0019Â\u0000\u0094§D\u0003õÍGj¶jù\u0081AsF¬P§\u009d7¬\u009d\u008a\u0015\u007fÃ«2\u0011\u008b\u001f§wv\u0092þMz\u0087C ê÷|ï?\u008bãÉ*\u0006j¯ ¤Q:)²ð\u0003Õ?Ì½½|\u001c\u009fF\\OW9ÐKhY\u0095\u0084\u009aÓ¥|Y¬\u0092kÄèªÍÁÿÐsGo«,ìÓNTw·xÿäò\u000bñÎ\u0091bà\u00999.~\u009b\u001b\"8\u008ey\u0084}ðmsº«\u001fð8\u009bÈè=tâV\u0007xdö{\u0080é8p\u009eè¹ß+ÂñÿBJWÎÄ°ÌPþiÎ\u009b¯½Ol\u0094£þ½íV\u0014ùáÚ>í\u0089\u0015vþÛ\frZ¿\u0012ÄôÎ]åÖç¿\u0016>Ñ öé\u0002ÊzÛ9L;ÎE~\u0015\u0083LqS¿ùê»8\u0096\u001b¡ö\u0099\u0083ål9À\fKÁ\u008a\u009cM\u0004\u009dH\u0007\u001bR£'±÷[Vh\u009aÞ\u0001Öv®\u0097²ZÚT^Ë\u008c \u0090\u009e\u008d\u0010\\B]»ÖX$\u001b=ã\u008bõl\u001dã\u0087ää\u0001¬k|\u008a²áÅ4/Qu\u0089Âù\rùëÙá¯JUýÜ\u0001\u0095ÇY\f«)\u0012yqøÁ@îUYé%ªa_£0¶ÈÁ\u0013pÌÓiaf^;SáEq¹ÎÝÞå\u0089)\u0090tO\u001d¬¬{ÄIV/T\u0093¾vc\u0093±0Û\u000b*Îêpæ\u001b\tk<¹Þû\u007f=p\u0087ã1£}!+Ø\u0093à×?ðw]\u008fmi\u001c¹§K\u008esRå¤à·\u0011S9ÜôU#pþ\u0001µèBÚê\u009eF\u0006\u0092\u000e\r\u0014ûe´£\u0083\u0095z\u0092\u0097ÀLtú¼æuö\u0005ja¤*©4¡n'ú~\u0016\u0006¤\u0095\u0014øà\u008b\u008a\u000e¹~\n\u001bH\u0083\u000bc Â¬Â¦\u008a9«²+ð&tZ¬\u0087\u0017-\u0093²\u009b\u00ada©í\u0017Y0@iÌ\u0094f\u001an¸Ü\u000b:NÌÔ\u007fú(æ\u0093N\u009esasN\u0002â\u0012\u0018ã\"iùß\u009fZ¦V¶¦ý\u0086û\u0012^[\u007fúaà¾Ä\u0094õ»\u00adu\u0019\f÷Ð ØÏD¦\u0082º\u0013EhE§\u007f\u008f¿R\u008d{ ì)pvL#hÝ}-bôþ\u0004½I\u0095~ÝÇø`\u0083þ×dIÜm\u007fdx`§\u0081¨\u0087À\u001e\u00058ú\u0005\u0098Å\u008e]~\n\u0012yU\u00adR\u00815\u0011\u008d/KG\u0005éz¯Ò\u009c\u000e\u0001ÞhõJíÉ=\\²ü¤µ.\u0004¸ãx\u007f^\u0085h]7P¸\u0006Ì\u009eÊÑºYF\bF¦\u001f&ÐÍcBpB%%1cÉ«ÂçÊ\u009bï/a\u0081ÍÙêúÑ^¥Y¡E\u0081Ù¯ü\u0010°´Ò9ô\u009cCF\u0080Õ$à¢¸»\u0082v\u0018\u000fÙ³ËÝ\u0085\u00adKöBõÑýY|ñ\u009b¨[+\u009b\u007f\u0017d\u000fÛ¡\u007f\u0091ù\u008f®Tk\u007f\u0094(ú&é\u008b\u0094\u0017\u0099áM¦\u009fÁå\u000f\u0090EaÁ\u009b\u0090¬mÈï\u0098\u0014)®º\u000f\u008f`¼&\u009bI\u0095ÿ\u00863°÷¡\\(T;\"\f!\u0099L~F®1\u0015éí\u000fÁ\u000eyd\u0013[ÄÃsx\u009aDØênÅÂ\u0094ã\u009cÃ\u0089ü1wb½ÞG\u0082\u0087¤»\u0003R\u008a(\u0015\u008c'É\u008dÈ\u0011\u0099_¿\u0093ýÚT[~ DfýTøá¯å\b\u009f¿2uÑÎ]JÜJß9ç\u0005áf9\u001bíê^+ÎE®\u0082\u00815E\u0083à\\Y\u0083ïÛZY¼J&\u0013\u0087\u008e-JîÂ¿-s¥\u009aÿØ\u009drg\u0090\u0016x\u0097h\u009aG\u0080K\u008fL\u000bÖ=ÞªRCï\u0001\u001dýõÇ\u0097\u0081),\u000f©®Gu\u0000í\u001c-\u0015\u008c\u0090E\u0080e>Í\u0093Ð\u0019±»g\u0085%\u0005\u0099??\u000b@ÿEW\u008f¶\u0087\u0003õ}Çðnk\u0091\nE\u0017öÍ\u0091Q'ÆîT\u0001\u001b\u001af3±¼T¹¤\u0007t\r\u0085\u0018f\u0094E\u0081ð§ù\u007f3¼æ\u001b¸ÿA\u0089\u0000\u0085÷m\u007fGD^Oh*;Q³\u0000J³\u00113§\u008fn0\u0085\fmb ]²%Ð~ï3\u0014\u0014\u0094\u001aÚh\u0013\u0098\fûácìüñ\b\b\u009aa»D&ì\n\u0098Ü\u0000ÌË$\n\u0012Å®ºK\u001aÀbeÿz\u00951H}+I'´Î9Wü8N->\u0015V\u0080å}Âh4Î\\È\u0018\u0092\u0098a\rá®T\u0084ÁRÞ_O\u0019C\u009bAV½úéÐ\u0086£\u0080{ö«\u000b:Ì!`3ß( R_nnfY\u0001B¬\u0097\u0005§\u008a\táû\u001aP©\u0017\u0097\u008fòäã\tÔ|Ã\u0095½9×t\u0095\u000e÷Õ¤i5\u0097×\u008f8\u0098\u008b\u0084w8È-XÛ\u0084P'¢<g1p=Ö~\u008c\u0082>JæÕÏ\u001e\u001aÔ\f%\u009b sð%\u0095ÆÇ\\ø\u007fH4µý\u0013a\u009e#%È\u001c\u0092ß\u000e\u0095\u0082GÀ:?6\u0003\\G\u0095Èì\u0097\u0011d=7îéuÞ\u0000|âB\n\u009b\u008fW\u0095\u0082ø\u0083¼ï²\u0007\t¼%\u009a-E\u0000ÁàåJÄ`á× Ð(Uw\n\u0006\u0002ÜÐ\r3\u0093²à\u009b2\u0012\u0012+)Î½\u0088EØ\u001d&<Èk¾ó\u009aÖt\u0086ø\u0005\u001a½:èÑhfj»\u001b)LjaXÀ\u0001\u0094ü\u0003¥eÄÑBXf%üDr\u0083÷¦i]>óP\u0099\u0081?cgà\u0088\u0080GfÀxïÒ|°$ C·«ÀaÌ\u0006¥sì+\u0018\u008c\u0099P{\u0000²ã[mÍ#?¾\u0012+«\u0017cz$dÌ\u0019÷Ë\u009ee\u0003<\f\u0010·\u0099\u0096Ûº*3\u008bcì\u007fÊ$ä÷\nz\u00adM+äÌ½ä\u0004Jê7§½ÖQ\u0098·9Y©ðçÏÖ\u000ejPo%\u0080Ú×79<6\u0014M\u0019\u009a=\u009e¨»D<Ja\\¸y½\u0097\u009e×FÊ\u0096Öic}cI¨üZ2-¿²$\u0018_T°®\u0093~æ\u0002µÌi\tx\u000bòÑ\u0084\u001c¿iê\u008f0ñ\u0013\u0083÷Ø£Bn\u008dFÑ\u009bUóïj§\u009eUiÛP¹c»ûq×\bÐ@d\u0092ºGAß\u0004_ó\u0082Éøæ`\u0081N± \f(\u001eß\u001bz.eÉ!ßòÏ\u0092\u0099Ã\u0084Ú\u008c\u0084¯8\u009ebË$4Kç\u0090<ÝÈ\u0089;\u0096¼d\u0012FqÊö\u009d÷\u0097u\u0090Û\u0096{&8@½\u008d¶lMÆ\"º1Ó&\u0092ÈXþ£4trÅÅÚÍß¹\u000f|v½e=\u008d\u008dÿ'SB¹\u009dgA\u0002\u0090¶-tË`\t+\u0082D\t9p\bÕ\u0011ä¡ÓÝk|ãNª\u0098$ßõiEo\u0085çã¹\u009d6\u0087PgáÿbiA\u0087®¬\u0095÷>gZ?ËR\f¶É>~3NÈ\u008f\u0083Â¥³©'j\u0000/`{f£+¬×'·\u0013Äó{\\á:u#)YÞ¹Õ\u008d¬®×ûð*[`n\u001bß=\u0017\u001eZÝcÑaÎ\u008fpÕ\u007f¬¶üê\u000b\u0000ï,¿\u0097Ö\u001f=9\u0003Íò\u0016\u001fd8zÖì!©8\u0016/ø\tk\u0093Ý\u0013\u0097.\u0080\u0002ü\u0084\u0007b|Gö_L(§¢¥\u0018z\u0003ÓÝ\f\u001289\u0015\u0087D^]ª\u0001ñ>©\u0010÷]§ñ2\u009aJÁÉ\u0097[+ýöW Ö½ô\u009cR\n\f-ã\u0091ï¡³¯\"í\rtÆÛ|=C¶\u0091 t¬Ðª;?l\u0013îÊ9jø\u001d\u009fY\u0086s\u0092ç[îH0®Ú3yûCÐIÀ\u0081ö!üª\u001f\u009aÛ\u000eÿy\u000eu\u0083exº\u000f>\u0005\u0011\u0004K\u0012\u0003í\u0085fN\u001dJ_T\u0010§-[¸\"vÈV\u0089W\u001e¾ÔÉý66\u0097d0\u0089\u001e(\u009d\u0082\u0006ÂS\u001c\u0000Jôª6<õ\u007fé\u0081 OYæ\u0007\u0015ÿ@¾H\u0001üQqQÕ\u009a¶{z\u0099kÝ%a^¹áf\u008f^´åzá)\u007fcuT\u001e\u0002}79ÎÈÖ\n;ëEcy½i.u\u009aB1!¹SÅ7\u009cÊ;HÅ\u0087»-¡¾\u009d§ã.°èPN©%\u0010<7\u0012Ãp&\u0096çY²cÔ\u0087¼\u008fÄc\u0013ÚVÌí\u0012q\u001el¡m«únSº>j\u0085b²]\u001bC@tþ\u0012RX¸\u00974ýÌê\u009f\u0017Ôxî¿\u0093L,Ù\u008fØ\u0090kZÁÄàBÃ@.Ù\u009b[0\u0002\u009a\u0000Ý§b\u001eÆÕ\u001bÓ ¡âøÎ]vN\u0014>rj°\u0098¯õÜ\u009c@ûiÞµã&ô<å\u009b\u0018>/\u0097E\u0011é6ï\u0015Ò\u001aF|Æà0Mâ\u0004Ü\u0016ª\u0092þ¨ÃH{%*µ\u00848\u0097Ø§Bº8\u0001Ý'\u0098\u000f\u008f`\u001cI:rÚÈ\u0003ªò\u001cpçR<(¢\u009daA\u0005\u0097vEJJCö)v¦\u0092\u0081\u0081zë\u0099!¥1ì#\u0080\u001fIA\u0081Â%ù®V\u000b3\u0019,TT·ïØ5+f\u008aíª\fÈ¯;ÒÖ^gBKòÛ'likûY³KçÞ^Ç\r\u009ay\u0097\u0006ÖK¸\u001c\u0093\u0083\u0086;[\u0005\u001e8\u0093-7\u000fZ\u009c\u008bîKJéB%\u0011A¤D\u0095Wi><v§áÈ3Z{Âê\u000f4ýbbñu\u0092K\u009aï\u0003\u000f6¤w¶¿rº`\u0006í\u000e\u009b[\"Û\u008aÏ\u0081$ujA\u007f/@â³\n§omÝÿ\u001e1Ï¾|ÝIb\u009cß?\r\u0017\u0011\u0080\n;».\u0010L\\°\u0017¿\u0097\u008aï8\u0091Gn\u008aÀ\u009d\u0004K´\u0001/\u0097û5\u0015\u008dV÷d\u009e\u001a\f\u001d\u0002xVS\u008cg\u001cò¦>³\u0011GSH\u0019\u007f\u009aà~Ò\u009c[}\u00adu\u0000;¬Ua9ÊÆu\u0088\u0001þ\u008cA#\u001c.=\u0010Rà¬µ@5¤¬Lh[Å\u0091®l\u0085Øâ]\nü\u001e\u009d\u00adÐ§9\u0019\u0080ÿ\u0095Ó/ß¤\u001eL0;(\u009c0\u008f\u0000ÒËÊÙ:|\u009d\u0097\"W\u009d\u001b«*¼,Çé\u001b\u0019q2;ÎÚ\u008cÁòP\\¼Å<ú×ì¨ô\u00ad\rèÃ1P1!n\u008e\u0012¢\u001bû\u0018ì³úZÑ9yÎâä\u0084\tÝp\u0086\u009bÝº=\u0006î\u000ex_»ßýDª?~\b\u008f\u0012\u0093ë´\u0000 ÒÎ \u008fLã\u0014!\u0007\u009c0ÍZè\u009aÖÊ«\u0012¹ sE\u0088\u0003×_M=@Ù\u001dióû,ü=\u008bø{q,;\u008fmXv\u001b\u0013Ã\u0014\u0005\u009eÄñw\u0083î\u009f>\bñ\u0090uÇZd¦m\u0093ñ÷\\>\u0015±\u0096<m\u001f\u001aï«S\u0081\u0002\u009cËK\u000f¶ê\u0080ìB\u009c\u0086½B[\tãýo\u0089 È½G¹ÂÝà\u001f\u007f\"5\u0017;m3\u001ax\u008f\u0000¹WW\u008dFªx\u0086\u0007m37C\u0088îa\u0092\u0082:Æ\u0091\u0087¬\u00159\u0002ÿW.¡\\ÆÒúþ6F\u0081ãx¥ö'\u0094\u001fFÿ\tÕÄaÑE\u009d×Br#²³\u00adÑ\u0098qL\rï\u0002\u00823ÌÍì¨\u0086¶t\u001a\u0010\u0000ÎÆ\u0002e\u0091\bÍÓ!x\u0007B\u0013\u00ad\u000f\u0012\u001a·Ö\u0019\u0087õî>ÒI\b` \u0082\u0003\u008eÐp¡ph mÌ\u0012_í\u000f\n7\u001dO:¿\u001aévëä\u0003.?×\u0094¨9\u00ad3ëe2ÁQúb=\u0091:)ÆS\u0088vÝáó-\u0012Hb°ß\u0086²$æ\u0014úî°\u008c\u001d_)pr\u009fCI\u0019;æ\u0088·\u0002ýì8Eýy\u0097¶\u0004\u008d!Wªs\u0014E\u0001\u007ft³æ\u008ch¬¢·\u0012Gæ\u008b\u0011«ùé\u0016H\u0016\u0015\u0003ï\u0089«ð3\u001epvqf\u0091¾êv1D\u0014I/;\u0004\u0080EäÄ4¾Ú\u0082\u008e\u0018Ì\u009bÃ~¿Einá,æò,w}>Ð\u00828¾ÌçÙio¹4\u008b<ëûvI©}ÜÌÖz²ºñ^Ú\u001c¸OònE\u0015qôc1v\u0007Ró÷Á\u0099ØÀ=\u007f\u0088¡¿F¡9tw-\u0086õð\u0005Ûñø)P\u009a\u0010×\u0002\u000e\u000bJ\u0003 ëÜyUy§ZpKú\"Ô:¨B\u0090a6§¤\u0081\u00100öMUËßá«\u00160hº}Îaþ4\u0083Åþy\u0004~Q\u0000×ò ~(á\u0018Ùa\u00959o»\u0005\u0002\u0091[µÁÜe½ã´d@Ò¦àla£A¸;QÅL£\u0099(\u009a\u009c\u0006Ì¥÷}íKqîø\b\rËß'\u0000í/·ô³qsÕ~/w£\u008d\u000brLåÚ|·¥nb_Ï]ë9§\u001edat=\u0090\u0001\u001dMñkü\u0011\u0085t^Óî9»¹g\u0003FÝø-¹I_·\u008d^ù\u0097Ç&\u0094ø Cõiq´\u000e½\u0007oU_\u0005\u00165\u0018\t(bÿL\u0097l¬z\bäU\u008f°\u0016\u009dÀåU\u0099\u008d*Â:ðúkÅ+×ï«=ß\u0086éac\u0003·t¯\u008e]Ü¾4Ý.eñ·5\u008a\u0012èå2öWÛ\u00038]\u0095=Ú\u0095ì!^+a2ÍN\u009fS¡Ú\u009aåæI\\Å\u0004&æn\u009eÓbªiíuáJ^&_@\u0082ä\u008cE§Ã\u000e¬üQ°f\u000b\u000e\u0001§\u0099â§:\u0088<\t(è@LÎK;qupMµÿêÑ=ñ\u0018\u009d®\u0096Cê=ÝøÎG\u0085ya&µ2äèRtÑäSx°Úæ\u0094+`ô&·§-ÞÆV\u0002{ÒFà\u001e\u0007GJâ\u001b\u001f¡.)\u001a0â¼\u000bêi2\u0005\u0017\u0086HÐ\u001b§<V}ÜñÙq39eo.6¶\u001bw\u0015´¾3ùd\u000fÇ\t\u0019=Y1\u00adw\rp\u008cC?>\u0085îvG{XÎ·\u0096XÇÕ\n;ø\u001f\u0001%K«¼\u0092;¿³\u0001-\u0088ÛJ)Æç»êQ4*Zö\u0012¸:`z!b\u008f\u001f5\u0003\u0001uÖ8Q5\u0018:à¦\u0094\u0086\u001d}-:v\u0019À\u009a\u000bA\u0083ËØ\tº\u008d1i6ók\tºs÷ÃWìoô)IÛuúX\r».^£\u0010õoüø*\u0089ë\u000fÎø\u009f÷\u007f¯î7\u001fó×\u008cò$\u008a\u0017\u0097\u008bðæRwL¾ý\u0081ù\faÜ\u000e·«áUtlU)a½\u008a½ß`\fP\u0000üP/ËË\u009cEÝÎó¦\u0083C²w\bþ!\u001f\u000b¶¬ó\u001ce°\u007fúSéÑÙZRô\t=á\u009dIëA`\u0099Q8\u0006gÓ¤¶2\u000b¿z°?n=\u0001\u008ae\u0002h®«\u000f¦pÜ¸@\u008d%x\f];\u001bxC!Bx-a\u008f8,Ôg/\u0097vW§ãc^ÀJÌQÆ\u0083\"\u000b\u0017Ï\u0001\u009a6w¯§\"+wÌ\u0093Î÷äl\u000fæz\fQÄ%t÷æ~ZÜ\u009c¯0I/\u008d~,^\fsÖ]ØL~}-\u0000ì»@¦æM'õêÜ¶\u000eU\u0089¬éå\u008fq\b\u009e_ñÇP\u0086¯·\u0011¨ü\u0089?D¶\u00952Þ)\u0087²\u008dÂÙ°YC/\"\u0083Ých¯°\u008cãv\u009fÇmÙ\u000eÖ÷\",.\u007f?¼Äxø\u009dYòM\u0080°d\u0091u¥ðX4b>,ª5_\u008a\u008a#\u001e\u008f¢\u008e¥LÓ²8Ì»P<\\¡¢0À6gLV\u0099»¶\u0091âúäH£m\u0014F=K\u000b{¦\u008càù¦\u008c©ÔTt\u0014ª \u0013|TÙÛ\u0019Ö #B³`)ö~ó)Ñ¹y¹îì\u008cL^t9T\u0007¦Îª<7\"\u001dõ3\u0090\u009e#Èã³\u0017%å^¬þeÝåõ\u0011ýß\\É\u00ad\u0006\u0096ý6ÚÎ9,ö\u0016\u0082òÆºº\"ÓD\u008eÃZ\u001a>ÇÛ\\î\u000e\u009ej_\tb¤\u001bý\u007fV2Û\u007f×\b \u0094A\rÇtà<\u0085ú\u008aÈÑ\u0012/\u001b¬åù²ò%ÇjßU§ézü\u0094ÎC\u0016\u00950h&!ê9¸J²²çÆÒ k\u001fêI6zÁÏ<ë©vf«@S\u0094=ä£!,²cµXÞ±hKH\bç\u009fØQ]R\u0098\u001cç¢S²ÑÆåóêê\u0000Ë-#\u0092;'> oßò]\u001f.;TÙ\u008eA\u0090¦Ê\nëç\u0081lË\u0088[¶¹\u009fTS¾|Bé\u0015D½j\u0099êf\u001d\u008a.Isw¦ZÈù\u0015R\bYì\u0089:*\u009a\u001e°½Jí/vLÜ\fvM\u0011Q\u0018G|ýU\u0095\u0089Ò\u00ad\u001cYã³¬êë3\u0019\u0003\u001e\u0016PÍ\u0091\u008a-\u0094\u008bû\"8ÄN\u008b\u0013Ei\u0010\u0095=\u009bÉ]IG\u0084b\u0006\u0016\u0097jï\u0010§^ \u001bæÛ«%Wç«g5\u0098\u001fuÏ\u0005\u008bg\u009e-(ö\u0096_E\u009c8±ks1¢Dø\u0015\u00adõó\u000b \u009d.\\§\u0098ÿ±u!ÿò6 óY{\u000bÈûV7\u00ad?\u0099i#oË\b®ò\u0085zÀ7Â*u\u0000ýÄQ>ð\u0014\u008f\u008aG\u0084ps\u0085áâUñ\u0005¦~&f{´»T\u0097\u0006áÅ\u0097ÿÍïfT\u009aÞ\u0001\u009fî8E©¢¸\u0088ª'õ\u0012ëò\u0019tÇU\u0097Ã²\u0007¨|\u009dúÌO¼)\u001dtoLE\u009b\u0091f\u0092w\u0005²\u0081>9q\u0007\u00804\u0090g\u0099ÞÒy\u007f8ÝÑyDtÒ\fþJCí\bxÜÞ\u008c\u0096náUû\u0084W¬Ïð\u009a\u0002çÜ}îÐÍ=ycy#\n\u0002VWz¢ôÃÂ\u009c9þ¹\u001f\u0094ÇËî%µÓ\u0000'íÈü\u0007Ú\u0080ZËÙ¤]ãÜA¶\u0005}ók\u009eÊÆ¯N~ûóë]\u0095Îï4¾*Jõ\u001e±}\u00049lÉì\u000bõÏ7cÔ¸U+Z8\"'\rzî\u0083¼\u00adc¢¥¬\u0080ê:w6O°³\nÓoxÝDSivWXlZ5Ô\u008föÙ\u008f\u001b?¤{\u0001\u0019\u00ad\u009aGAÂÎ8\fO,O|\u0015_JSx1\u008bÀr\u0085%\u001fe:úÔwg\u001f6¢ë>AíB1T²\u001büº®FR)+s/K)xÚyÐ\u00913Óü\f/\u0089Qê\u0094p~£Q~\u0086h\b×Þñ\u008d\u008aíðß\u0096jR\u0081,ï\u009c¨\u0016ë\u0018Ä\r¶NêÍ8Û\u001bçôZ\u0081Þ,zÈÀI}Ê\u008aAav£sÇô½ñRo\u0005@À\u009eÉ\u0080q\u0089ºiÔ¤s\u0085ª>ô\u001bªY^X\u007f²HyC>m.îøO\u0089\u0081\u0003\u0084ñ4s¬8÷.<[¾_pW»>õ%r\u001b\u000fÉe'\u001e4\u0089>æ\u009cyu'7çÍ{o»\u0090\u009aîÁ&qíJf\u008e«\u0017+Tö@EY³ËÜ\u009dÏÙýß¨,K\nÖø\u0002\u0013+Î°ü»ú\u00820\u000e/\u0006F\u0003þv\n¡\\`ÐIüÃ\u0002ÀøG6\u0086éÁù¶\u009d\u000fç\u001d\u0095Ø<\\^\u009fXÚð\u0080\u00022m\u0005ò¢8ûx\u0082\u009f\u009a\u000b\u0001\u007f¡à\u009bI\"~×íõÖîÝ2½ÞÅ)0\u0091Rï\u000b\u001e\b]F\u0006\u00819êõQD{Û\u008d\u0094\u001e\u0001\u008b@Üß\f§N\t;ûF]Ç\u001a\u001d!\u0006ßqk\u0000\u00951©¡\u009f_ ìî\u008dèT\u0002a°nJ\"E\u0004áÎ\u0096ÖÄç0ëÚ$´\u00151\n\u0095\u008dËLÔ \u00876v\"\t\u00adBC\u0088&\u000fÑ²-2\u0094Á\u001e\u0088G!óø?±!ø\u0091\u0005Î\u009eh\u008ab¥\u0007?\u0082\u0092ÔNaZW¬B~H;^ãqù/â~\u0017D\u009cº\u0088±¡\u0000q¾V)8@ß'cù5PRAÁJMÍµ\u001d#&'oh©\u0084°Çy÷YoL\r\u008e \u008dcvu\u0094`\u009bÝ©Á\u0006n6ao¥\u0097²(NÁ0ó/iiKI\u0001cóÌæÒÁ«k3\u008eïÎ]\u0098ìÌ\u0089£\u001b\nÖº^tÆ\u0012x£I@\u001e\u009c¨ãÁìùñÒc\u0012/ëxdX\u000b·áW)Ù×ÓGMrî'zs\u0003Çeê»\u000f9Ysp+ä\u008e\u008bV9Mþ{@E|\u0011Ñ!\u0015`³î\u0097\u009eÆAECð¼\u008dS¾%\u0085\u0000\u001dÂ7i\u0099\u008c\u0089È#Û\u0088öaø\u008e\u001cÆR\u0007\u0005¶Ö\u0088ñRxÔ®V½\u0016hô£fÇ³¾T_;j\u0007\fYV¾J\u008a\u0010OÂæ\u0094\u008dÑ\u0010ø\u0019+ði£sîc³æ\u0006\u001fj¤_\u0083³<k\u0092?t%dº\"7È:\u0085}\u0017ÞW n'Àx¸îQé\u001d©È?ÙV*jnT\u0098'x\u001cð\n¹üÉ\rð¶Éãwbû\u001fh\u0090(|\t¦|v}¡\\\u0002æ×\u0095ú\u0015VF\u001d+x\u0094a\tm!i\u00801¸\u009f ¹E\u0092\u0094\u00854\u0018m\u0003Y+ \u0007axkz£\u0019yV«Ê\u0081\u0012» \u0002\u0080@ø\u0013J\u000e\u001d\u009b¦\u009aQ\u000b\u0019ÁÎ\u0081 ¤Mè\u001f\u0001\u000fm\u0083þu<í\u009c!@\u0087µÄ,¼é9\u000fDCks^3#ÞT\u0087.ýè\u00ad\u0099XÑÖ-ÁéL/×$Ônªl¹î¯`a®?Äu=n¬\u0091üP7\u009eÐ¬V,Ü\u0097Ü\u001e6]Ç\u0000 &i)>bo\u000b½wä\u0085ëk!A)¢7\u0091\u000b²»gèCiú\u009d\u001e\u009e·\u0099\néº2z\u0083\u0010\u001en§ù «\u007f\t8<¦ë[ \u000fKäp\u0088q5\u009aÙá\u001dPL8\u008a¬ÞÅ\u0002å(ê·\u0002\u009f.¶Ô\u0013\u0014å\\nóæ\nJ\u001f\u0084Èø\u008cQzl0½\u0092;\"²Ö·ô>Ì\u00044Æ\u0018á7\u009bRÊ\u0097W\u0010\u0004½£\u001bÚ»\u008c 1Ku6\u000b¤i\n&\u008dMn\u009f\u0098»éî\u0000ô,²ûó\u001f\u0093Z\u008bß8\u0087±ìÚÐ9I\"ÓyY\b õò\u001c\u009c\u0094¥Mýÿ\t¤Á\u0011Òµø¼\u001f@QTc|Û?¸Ì¼\u0000TaÏ´«\u000bÔ5Â¿µ\u001fñ¶©\u0086¤\u0017ÙÊoy\u0086ìM\u0085þ\u0015aVº)º«\u00066j\u0007S´½øèi@\u000b(\u008b\u0098ß¼|LtX\u0085ý\u0002\u000f&ÃoÉ.[\u0085\u0090@\u0080Eª\u009bE¶h·^¸(Q\u001d\u0018\u0013Ì×kiHM\u0086\u0016±m\u0099\u001aÊ\u001d\u0011x»W\\cå}\u0018!Áò\u000f/\u0089\u0092\u0081o\u0013Ç\"L\nf\u00057ÓwÐX)\u0094åþp\u008bG\u001aaÙ\u0019\u008b\tÌ\u0097\u000f\u0011\u0006®4×%X\u0092^\u008c\u008cæì\u0084õ\u0015Ù:\u0099M3~Ô\u0093Ó\u0084Í z/ä\u0006K\u0080éY\u000bL2,Î\u0016 \u009b\u0002®\u009bDfËÑ¥\u0015Á\u008bx¬\u0094Þ\u0019¹V³Ê\u0082\u0012Û \u0012Ð\u009càùIU\u0018SÍBÿ¹tÈáÅ,õ\u0013\u0012Ä\u0097Mo[kÖÚ@\u0098d´¾ÝzXÙ8jå\u0096Ä\u0089ZÛÃhöÁsàý¢õ/nU\u008c\u0087ð£_\u009dD\u008eZAeÜ\u009e\t2\u000f\u008e³\u0012Û\u0004å¹\u0088\u0090¥«iyÀ\u0087I_\u0083LnQ\u0018c\u001eÝ\u0098¼õ|,\u000eÄ\u0082CÍ¹<ÏU\u0086©úXçÉ\u0090]&ðY\u009f\u007f ó°3<3îCt~\u009a°x«\u009aïñ\u0090Ô\u0001<\u0083\u0005JÕ\u001bÖ5îûâJ\u0089m,×Øt;Éô»þ]\u0007sR$±V*ÎkW2¬$÷\u0091i§ú°³4îWK¢[Áö\u009d\u001e¸\u009f~\u0091g¦Ú«\u0017Ìô\u008bÝ\u0093\u0097#QË\u000fÂÖ\u008a¶«ê.t@§\u009aõü\u007fG¿Z\u001a°Ð\n|h'ÖA»ÄïDiBQ\u00196Æ\u008b\u0092-WË©l¨\u007f\u0093RÅÐ{vÈüR2©É\u0017GxÞ\u001aÍt\u0095*Á,\u008f-.Ú\u0098\u0019\u0092Êhu\u0092t\u008a\u000f\u001cË\u008fô\u0017HÖÅº)à\u0087\u0000/>M¬Ì\u008dñüñþÇ\u001f7¬Ô·=-\u0011 è7\u001f>'îÀVz¿Ë÷\u008d©5\u008f#ð¹\u0085|;ñ\u001dbS=àL²D¬\nä×x\u0098z\u000bP¹ëy\u009d7²ù¥×û\u0011z\u0099£o9ÊTÅq\u00ad*1ã\u0080l\u0083¦\u000båÔ\u0002\u0004\u009d0&\u009dH\u0010º\u0007ÓÓ°x\u001cÅ[\u0011\u001f\u0081.¤\u0004o\u0099+÷sh\u000e·tT)d?Ój·Ü Ä»dÅö\u0082}¤¤\u0093Z\u008b\u0087P\"¿Ë|8»æ\u001eüÅhrÙ\u000fª]\u00815;O±¦\u009b&Ùx[Ãç\u0082ú:\u008a\u009dÀûwuÛ\u008fe\u001bñ4\u0017\u001c\"u\u0019¦+tN¢ç@þåSÕµ\u0091M\u0093jqÊì\u0010d\u0091\u0015Úªjéå¾gã¾\u0000$\u008aÉ\u0007ÆÃ\u0005Äm/\u000f)ûÂ²Û\u009br´<q³án\u0093|v§ANãÄj_D®z·\u001bb¿\u0089õ\u008a:rò`¼½§¡U\bå¬ÞÀ\u0011±\u0002±\u0002 ø\u0003 É\u20c4*IC3\u0091Âd\u008b@\u0014>\u009eÜÓJ~FO\u009dï\u0094\u008e4\u001b¼\u007fB¼Ü¦BÜ\u007f/þ4Ûâô1qeö\u000b\u0012\n£\u000f\u0094ãÀ\u0000Ü\u008f\r\t#WSñë\u0086\t!=\tV\u008b\u001fR-\u0083\u0018\u008cÞ\u0004¯x|z\u000e\u0089³(¯ß\u009e\u0098Î¿4#\u0005¥\u0092\u0007\u0088ÁðvþÌ\u008d.K²±¿\u001d²\u0018¾ea\u0090Å&Û\u001f×\u0006aD\u00124ý\u0000ø°1Y}\u0095p»à¿²\u00956*ái\u0019DC\u0096Ñ\fd"
         .length();
      char var1 = '\n';
      int var8 = -1;
      b((lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI)null);

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
                     case 0 -> 26;
                     case 1 -> 16;
                     case 2 -> 55;
                     case 3 -> 97;
                     case 4 -> 116;
                     case 5 -> 58;
                     default -> 108;
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
                     c = var5;
                     d = new String[67];
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

                  var2 = "ãæ8Æ\u00999Ø±Nwúqò¬p\u0010):}S\u0015\u00011m|\u001b^^ °\u0016Ó";
                  var4 = "ãæ8Æ\u00999Ø±Nwúqò¬p\u0010):}S\u0015\u00011m|\u001b^^ °\u0016Ó".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = 61;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -19859) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 159;
            case 1 -> 38;
            case 2 -> 174;
            case 3 -> 76;
            case 4 -> 102;
            case 5 -> 248;
            case 6 -> 54;
            case 7 -> 56;
            case 8 -> 117;
            case 9 -> 85;
            case 10 -> 12;
            case 11 -> 21;
            case 12 -> 2;
            case 13 -> 51;
            case 14 -> 108;
            case 15 -> 77;
            case 16 -> 41;
            case 17 -> 171;
            case 18 -> 79;
            case 19 -> 183;
            case 20 -> 98;
            case 21 -> 8;
            case 22 -> 132;
            case 23 -> 148;
            case 24 -> 173;
            case 25 -> 92;
            case 26 -> 223;
            case 27 -> 230;
            case 28 -> 197;
            case 29 -> 180;
            case 30 -> 47;
            case 31 -> 78;
            case 32 -> 131;
            case 33 -> 161;
            case 34 -> 64;
            case 35 -> 112;
            case 36 -> 165;
            case 37 -> 86;
            case 38 -> 209;
            case 39 -> 250;
            case 40 -> 82;
            case 41 -> 93;
            case 42 -> 200;
            case 43 -> 153;
            case 44 -> 169;
            case 45 -> 187;
            case 46 -> 40;
            case 47 -> 138;
            case 48 -> 80;
            case 49 -> 143;
            case 50 -> 172;
            case 51 -> 22;
            case 52 -> 121;
            case 53 -> 177;
            case 54 -> 96;
            case 55 -> 19;
            case 56 -> 61;
            case 57 -> 110;
            case 58 -> 199;
            case 59 -> 58;
            case 60 -> 23;
            case 61 -> 184;
            case 62 -> 50;
            case 63 -> 29;
            case 64 -> 158;
            case 65 -> 251;
            case 66 -> 202;
            case 67 -> 30;
            case 68 -> 130;
            case 69 -> 193;
            case 70 -> 126;
            case 71 -> 134;
            case 72 -> 1;
            case 73 -> 115;
            case 74 -> 208;
            case 75 -> 97;
            case 76 -> 225;
            case 77 -> 13;
            case 78 -> 33;
            case 79 -> 228;
            case 80 -> 101;
            case 81 -> 151;
            case 82 -> 124;
            case 83 -> 212;
            case 84 -> 35;
            case 85 -> 3;
            case 86 -> 168;
            case 87 -> 189;
            case 88 -> 71;
            case 89 -> 88;
            case 90 -> 11;
            case 91 -> 140;
            case 92 -> 255;
            case 93 -> 36;
            case 94 -> 15;
            case 95 -> 100;
            case 96 -> 25;
            case 97 -> 156;
            case 98 -> 60;
            case 99 -> 233;
            case 100 -> 204;
            case 101 -> 111;
            case 102 -> 157;
            case 103 -> 234;
            case 104 -> 254;
            case 105 -> 160;
            case 106 -> 245;
            case 107 -> 135;
            case 108 -> 53;
            case 109 -> 247;
            case 110 -> 5;
            case 111 -> 31;
            case 112 -> 243;
            case 113 -> 188;
            case 114 -> 94;
            case 115 -> 120;
            case 116 -> 4;
            case 117 -> 144;
            case 118 -> 103;
            case 119 -> 32;
            case 120 -> 20;
            case 121 -> 176;
            case 122 -> 128;
            case 123 -> 239;
            case 124 -> 216;
            case 125 -> 206;
            case 126 -> 178;
            case 127 -> 27;
            case 128 -> 253;
            case 129 -> 152;
            case 130 -> 222;
            case 131 -> 219;
            case 132 -> 210;
            case 133 -> 127;
            case 134 -> 81;
            case 135 -> 105;
            case 136 -> 238;
            case 137 -> 205;
            case 138 -> 133;
            case 139 -> 59;
            case 140 -> 244;
            case 141 -> 155;
            case 142 -> 215;
            case 143 -> 207;
            case 144 -> 203;
            case 145 -> 42;
            case 146 -> 214;
            case 147 -> 235;
            case 148 -> 95;
            case 149 -> 149;
            case 150 -> 26;
            case 151 -> 68;
            case 152 -> 142;
            case 153 -> 150;
            case 154 -> 232;
            case 155 -> 246;
            case 156 -> 186;
            case 157 -> 122;
            case 158 -> 252;
            case 159 -> 44;
            case 160 -> 34;
            case 161 -> 192;
            case 162 -> 242;
            case 163 -> 109;
            case 164 -> 57;
            case 165 -> 211;
            case 166 -> 67;
            case 167 -> 217;
            case 168 -> 46;
            case 169 -> 9;
            case 170 -> 220;
            case 171 -> 224;
            case 172 -> 194;
            case 173 -> 167;
            case 174 -> 24;
            case 175 -> 119;
            case 176 -> 218;
            case 177 -> 213;
            case 178 -> 201;
            case 179 -> 190;
            case 180 -> 137;
            case 181 -> 145;
            case 182 -> 48;
            case 183 -> 191;
            case 184 -> 231;
            case 185 -> 181;
            case 186 -> 164;
            case 187 -> 91;
            case 188 -> 146;
            case 189 -> 73;
            case 190 -> 0;
            case 191 -> 198;
            case 192 -> 185;
            case 193 -> 18;
            case 194 -> 229;
            case 195 -> 237;
            case 196 -> 87;
            case 197 -> 236;
            case 198 -> 43;
            case 199 -> 65;
            case 200 -> 249;
            case 201 -> 113;
            case 202 -> 10;
            case 203 -> 63;
            case 204 -> 45;
            case 205 -> 125;
            case 206 -> 83;
            case 207 -> 139;
            case 208 -> 195;
            case 209 -> 37;
            case 210 -> 114;
            case 211 -> 162;
            case 212 -> 221;
            case 213 -> 240;
            case 214 -> 170;
            case 215 -> 69;
            case 216 -> 116;
            case 217 -> 136;
            case 218 -> 49;
            case 219 -> 175;
            case 220 -> 75;
            case 221 -> 179;
            case 222 -> 141;
            case 223 -> 227;
            case 224 -> 99;
            case 225 -> 14;
            case 226 -> 182;
            case 227 -> 72;
            case 228 -> 104;
            case 229 -> 166;
            case 230 -> 89;
            case 231 -> 28;
            case 232 -> 16;
            case 233 -> 226;
            case 234 -> 147;
            case 235 -> 163;
            case 236 -> 17;
            case 237 -> 118;
            case 238 -> 241;
            case 239 -> 7;
            case 240 -> 196;
            case 241 -> 154;
            case 242 -> 62;
            case 243 -> 107;
            case 244 -> 66;
            case 245 -> 90;
            case 246 -> 55;
            case 247 -> 123;
            case 248 -> 70;
            case 249 -> 74;
            case 250 -> 106;
            case 251 -> 52;
            case 252 -> 6;
            case 253 -> 84;
            case 254 -> 129;
            default -> 39;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         float var1, float var2, float var3, float var4, float var5, float var6, float var7
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
      }

      public final float a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final float f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final float g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final float h() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float i() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float j() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float k() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float l() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final float m() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final float n() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         float var1, float var2, float var3, float var4, float var5, float var6, float var7
      ) {
         return new lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -17384;
         float var1 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         float var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         float var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         float var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         float var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         float var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         float var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -768;
         short var10002 = -17381;
         short var10003 = 28455;
         short var10004 = -17382;
         short var10005 = -21351;
         short var10006 = -17383;
         short var10007 = 26052;
         short var10008 = -17377;
         short var10009 = 4830;
         short var10010 = -17380;
         short var10011 = 17320;
         short var10012 = -17379;
         short var10013 = 24239;
         return "M(w=" + var7 + ", h=" + var6 + ", scale=" + var5 + ", margin=" + var4 + ", logo=" + var3 + ", font=" + var2 + ", small=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Float.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Float.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Float.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Float.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var1 = var1 * 31 + Float.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var1 = var1 * 31 + Float.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         return var1 * 31 + Float.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         int[] var2 = lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.o();
         Object var10000 = this;
         if (var2 == null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 == null) {
            if (!(
               var10000 instanceof lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = Float.compare(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = Float.compare(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            );
         }

         if (var2 == null) {
            if (var4 != 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "ÍÂÌf|pâÿ¼\u00047;Ä\f\u0004õMÎË\bBÑ#\u0006O5ùn\b\f¿êÅv\u0082×\u0098";
         int var4 = "ÍÂÌf|pâÿ¼\u00047;Ä\f\u0004õMÎË\bBÑ#\u0006O5ùn\b\f¿êÅv\u0082×\u0098".length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 94;
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
                        case 0 -> 72;
                        case 1 -> 36;
                        case 2 -> 45;
                        case 3 -> 106;
                        case 4 -> 103;
                        case 5 -> 78;
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
                        a = var5;
                        b = new String[7];
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

                     var2 = "\u0084Aá\u0017 \u008d½\u0007#\u0097\u001fÍ=Í&";
                     var4 = "\u0084Aá\u0017 \u008d½\u0007#\u0097\u001fÍ=Í&".length();
                     var1 = 7;
                     var8 = -1;
               }

               var10000 = 61;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -17383) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 195;
               case 1 -> 131;
               case 2 -> 84;
               case 3 -> 188;
               case 4 -> 71;
               case 5 -> 254;
               case 6 -> 213;
               case 7 -> 116;
               case 8 -> 34;
               case 9 -> 226;
               case 10 -> 207;
               case 11 -> 98;
               case 12 -> 2;
               case 13 -> 68;
               case 14 -> 61;
               case 15 -> 17;
               case 16 -> 220;
               case 17 -> 236;
               case 18 -> 222;
               case 19 -> 18;
               case 20 -> 114;
               case 21 -> 30;
               case 22 -> 231;
               case 23 -> 80;
               case 24 -> 187;
               case 25 -> 209;
               case 26 -> 121;
               case 27 -> 152;
               case 28 -> 128;
               case 29 -> 184;
               case 30 -> 206;
               case 31 -> 238;
               case 32 -> 48;
               case 33 -> 148;
               case 34 -> 29;
               case 35 -> 14;
               case 36 -> 79;
               case 37 -> 210;
               case 38 -> 15;
               case 39 -> 125;
               case 40 -> 16;
               case 41 -> 136;
               case 42 -> 160;
               case 43 -> 27;
               case 44 -> 31;
               case 45 -> 74;
               case 46 -> 91;
               case 47 -> 0;
               case 48 -> 255;
               case 49 -> 38;
               case 50 -> 83;
               case 51 -> 158;
               case 52 -> 51;
               case 53 -> 185;
               case 54 -> 240;
               case 55 -> 110;
               case 56 -> 132;
               case 57 -> 248;
               case 58 -> 21;
               case 59 -> 12;
               case 60 -> 56;
               case 61 -> 181;
               case 62 -> 144;
               case 63 -> 20;
               case 64 -> 174;
               case 65 -> 28;
               case 66 -> 67;
               case 67 -> 40;
               case 68 -> 253;
               case 69 -> 92;
               case 70 -> 249;
               case 71 -> 126;
               case 72 -> 107;
               case 73 -> 86;
               case 74 -> 235;
               case 75 -> 194;
               case 76 -> 65;
               case 77 -> 130;
               case 78 -> 115;
               case 79 -> 122;
               case 80 -> 197;
               case 81 -> 183;
               case 82 -> 225;
               case 83 -> 113;
               case 84 -> 33;
               case 85 -> 124;
               case 86 -> 100;
               case 87 -> 154;
               case 88 -> 245;
               case 89 -> 198;
               case 90 -> 3;
               case 91 -> 78;
               case 92 -> 99;
               case 93 -> 46;
               case 94 -> 103;
               case 95 -> 72;
               case 96 -> 159;
               case 97 -> 161;
               case 98 -> 237;
               case 99 -> 134;
               case 100 -> 212;
               case 101 -> 97;
               case 102 -> 111;
               case 103 -> 9;
               case 104 -> 199;
               case 105 -> 60;
               case 106 -> 49;
               case 107 -> 7;
               case 108 -> 102;
               case 109 -> 182;
               case 110 -> 242;
               case 111 -> 11;
               case 112 -> 190;
               case 113 -> 244;
               case 114 -> 180;
               case 115 -> 89;
               case 116 -> 105;
               case 117 -> 140;
               case 118 -> 243;
               case 119 -> 138;
               case 120 -> 232;
               case 121 -> 127;
               case 122 -> 164;
               case 123 -> 5;
               case 124 -> 223;
               case 125 -> 120;
               case 126 -> 117;
               case 127 -> 81;
               case 128 -> 162;
               case 129 -> 44;
               case 130 -> 169;
               case 131 -> 170;
               case 132 -> 146;
               case 133 -> 90;
               case 134 -> 8;
               case 135 -> 36;
               case 136 -> 241;
               case 137 -> 233;
               case 138 -> 229;
               case 139 -> 215;
               case 140 -> 228;
               case 141 -> 250;
               case 142 -> 168;
               case 143 -> 1;
               case 144 -> 55;
               case 145 -> 82;
               case 146 -> 101;
               case 147 -> 142;
               case 148 -> 32;
               case 149 -> 50;
               case 150 -> 133;
               case 151 -> 62;
               case 152 -> 39;
               case 153 -> 217;
               case 154 -> 75;
               case 155 -> 22;
               case 156 -> 47;
               case 157 -> 141;
               case 158 -> 219;
               case 159 -> 216;
               case 160 -> 26;
               case 161 -> 247;
               case 162 -> 179;
               case 163 -> 252;
               case 164 -> 208;
               case 165 -> 77;
               case 166 -> 123;
               case 167 -> 69;
               case 168 -> 35;
               case 169 -> 192;
               case 170 -> 87;
               case 171 -> 10;
               case 172 -> 251;
               case 173 -> 156;
               case 174 -> 45;
               case 175 -> 193;
               case 176 -> 6;
               case 177 -> 155;
               case 178 -> 13;
               case 179 -> 151;
               case 180 -> 167;
               case 181 -> 135;
               case 182 -> 147;
               case 183 -> 163;
               case 184 -> 64;
               case 185 -> 73;
               case 186 -> 175;
               case 187 -> 41;
               case 188 -> 211;
               case 189 -> 58;
               case 190 -> 165;
               case 191 -> 59;
               case 192 -> 137;
               case 193 -> 200;
               case 194 -> 145;
               case 195 -> 42;
               case 196 -> 63;
               case 197 -> 106;
               case 198 -> 108;
               case 199 -> 4;
               case 200 -> 95;
               case 201 -> 221;
               case 202 -> 24;
               case 203 -> 176;
               case 204 -> 157;
               case 205 -> 129;
               case 206 -> 172;
               case 207 -> 53;
               case 208 -> 93;
               case 209 -> 96;
               case 210 -> 234;
               case 211 -> 230;
               case 212 -> 109;
               case 213 -> 76;
               case 214 -> 186;
               case 215 -> 119;
               case 216 -> 153;
               case 217 -> 202;
               case 218 -> 178;
               case 219 -> 205;
               case 220 -> 246;
               case 221 -> 19;
               case 222 -> 204;
               case 223 -> 166;
               case 224 -> 227;
               case 225 -> 196;
               case 226 -> 173;
               case 227 -> 88;
               case 228 -> 177;
               case 229 -> 37;
               case 230 -> 214;
               case 231 -> 57;
               case 232 -> 218;
               case 233 -> 66;
               case 234 -> 189;
               case 235 -> 224;
               case 236 -> 104;
               case 237 -> 52;
               case 238 -> 171;
               case 239 -> 118;
               case 240 -> 150;
               case 241 -> 203;
               case 242 -> 112;
               case 243 -> 139;
               case 244 -> 23;
               case 245 -> 85;
               case 246 -> 201;
               case 247 -> 43;
               case 248 -> 94;
               case 249 -> 191;
               case 250 -> 149;
               case 251 -> 143;
               case 252 -> 25;
               case 253 -> 54;
               case 254 -> 239;
               default -> 70;
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
         public static me.octo.client.lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(me.octo.client.lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, int mask, java.lang.Object marker) {
         if ((mask & 1) != 0) { p1 = p0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl; }
         if ((mask & 2) != 0) { p2 = p0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII; }
         if ((mask & 4) != 0) { p3 = p0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl; }
         if ((mask & 8) != 0) { p4 = p0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI; }
         if ((mask & 16) != 0) { p5 = p0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
         if ((mask & 32) != 0) { p6 = p0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
         if ((mask & 64) != 0) { p7 = p0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll; }
         return p0.a(p1, p2, p3, p4, p5, p6, p7);
      }
}
      public lllIlIIllIIIIIIlllIllIlIIIllllIlIIlIIIIIlIlIlIlIIIIlIIIlllIIIIlIIIlIIIlllIIlllllIIllI(boolean p0, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
         this((mask & 1) != 0 ? false : p0);
      }
}
