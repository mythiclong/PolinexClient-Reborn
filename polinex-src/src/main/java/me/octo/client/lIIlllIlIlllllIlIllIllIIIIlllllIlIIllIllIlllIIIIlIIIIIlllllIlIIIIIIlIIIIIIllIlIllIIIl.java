package me.octo.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl
   extends llllIIllIIlIIlllllllIIlIIIIllllllllIIIIIlIlIlIIlllIlIIIIIIllIlIlIIlIlIIlllIIIlllllIll {
    public static <T> T a(Object... args) { return null; } // PX-FIX ovld-var
   private static final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 16.0F;
   private static final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 62.0F;
   private final float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 82.0F;
   private final float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @Nullable
   private IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @Nullable
   private IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] e;
   private static String[] f;

   public lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl() {
      int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 10.0F;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 70.0F;
      int var1 = var10000;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 10.0F;
      int var2 = RangesKt.coerceAtLeast(
         llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
            .size(),
         1
      );
      int var3 = (var2 + 1) / 2;
      float var4 = var3 * this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         + RangesKt.coerceAtLeast(var3 - 1, 0) * this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      float var5 = RangesKt.coerceIn(
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            + 10.0F
            + var4
            + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         240.0F,
         780.0F
      );
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll(
         620.0F, var5
      );
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = me.octo.client.utils.llIlllIIlllIlIlIllIllIIIIlllllllIIIIIIlIlIllllIlllllIIllllIIllIIIlIIlIlllIlllllIlllll.f();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = -1;
      if (var1 != 0) {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]
         );
      }
   }

   private final float d() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c()
         + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   private final float e() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.e()
         - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   private final float f() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d()
         + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         + 6.0F;
   }

   private final float g() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.f()
         - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   private final float h() {
      return this.e() - this.d();
   }

   private final float i() {
      return this.g() - this.f();
   }

   private final List<IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI> j() {
      Object var16 = null; // PX-FIX
      int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
      String var10001 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.toLowerCase(Locale.ROOT);
      short var10003 = 10011;
      short var10004 = -6066;
      Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
      String var2 = StringsKt.trim(var10001).toString();
      List var3 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .g();
      int var1 = var10000;
      var10000 = var2.length();
      if (var1 == 0) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      List var14;
      if (var10000 != 0) {
         var14 = var3;
      } else {
         Iterable var4 = var3;
         boolean var5 = false;
         var var7 = new ArrayList();
         boolean var8 = false;

         for (Object var10 : var4) {
            IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var11 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)var10;
            boolean var12 = false;
            String var15 = var11.aj().toLowerCase(Locale.ROOT);
            short var10002 = 10011;
            var10003 = -6066;
            Intrinsics.checkNotNullExpressionValue(var15, "toLowerCase(...)");
            var16 = StringsKt.contains(var15, var2, false);
            label37:
            if (var1 == 0) {
               if (!((Boolean)var16)) {
                  String var17 = var11.am().toLowerCase(Locale.ROOT);
                  var10002 = 10011;
                  var10003 = -6066;
                  Intrinsics.checkNotNullExpressionValue(var17, "toLowerCase(...)");
                  var16 = StringsKt.contains(var17, var2, false);
                  if (var1 != 0) {
                     break label37;
                  }

                  if (!((Boolean)var16)) {
                     var16 = false;
                     break label37;
                  }
               }

               var16 = true;
            }

            if (((Boolean)(var16))) {
               var7.add(var10);
               if (var1 != 0) {
                  break;
               }
            }
         }

         var14 = var7;
      }

      return var14;
   }

   @Override
   public void extractRenderState(@NotNull GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
      short var10002 = 10009;
      short var10003 = -6379;
      Intrinsics.checkNotNullParameter(var1, "context");
      int var5 = var10000;
      int var9 = 10012;
      short var10001 = 5419;
      String var10 = System.getProperty("os.name");
      var10002 = 10014;
      var10003 = 23409;
      Intrinsics.checkNotNullExpressionValue(var10, "getProperty(...)");
      String var11 = var10.toLowerCase(Locale.ROOT);
      var10002 = 10005;
      var10003 = -25901;
      Intrinsics.checkNotNullExpressionValue(var11, "toLowerCase(...)");
      CharSequence var12 = var11;
      var10001 = 10002;
      var10002 = -5118;
      byte var6 = ((byte)((StringsKt.contains(var12, "mac", false)) ? 1 : 0));
      var9 = var6;
      if (var5 == 0) {
         var9 = var6 != 0 ? this.a().getWindow().getScreenWidth() : this.a().getWindow().getWidth();
      }

      int var7 = var9;
      var9 = var6;
      if (var5 == 0) {
         var9 = var6 != 0 ? this.a().getWindow().getScreenHeight() : this.a().getWindow().getHeight();
      }

      int var8 = var9;
      me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1, 0, 0, var1.guiWidth(), var1.guiHeight(), (kotlin.jvm.functions.Function0)(() -> a(var7, var8, this, var6 != 0, var2, var1, var3)));
      super.extractRenderState(var1, var2, var3, var4);
   }

   @Override
   public void a(int var1, int var2) {
      int var3;
      label19: {
         int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c(),
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d(),
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.g(),
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.h(),
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()
               .a(0.98F),
            14.0F
         );
         var3 = var10000;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c(),
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d(),
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.g(),
            this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.h(),
            1.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .y()
               .a(0.55F),
            14.0F
         );
         this.b(var1, var2);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(this.d() - 2.0F, this.f(), this.h() + 4.0F, this.i() + 2.0F);
         lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl var5 = this;
         if (var3 != 0) {
            if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
               == lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               )
             {
               this.c(var1, var2);
               if (var3 != 0) {
                  break label19;
               }
            }

            var5 = this;
         }

         var5.d(var1, var2);
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i();
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.c(++var3);
      }
   }

   private final void b(int var1, int var2) {
      Object var24 = null; // PX-FIX
      int var3;
      float var4;
      float var5;
      String var16;
      String var17;
      label49: {
         int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
         var4 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c()
            + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            + 6.0F;
         var3 = var10000;
         var5 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d() + 18.0F;
         var16 = null;
         var17 = null;
         lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl var23 = this;
         if (var3 == 0) {
            if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
               == lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               )
             {
               short var28 = 10015;
               short var31 = -6294;
               var16 = "Route Editor";
               var28 = 9991;
               var31 = -27637;
               var17 = "Select a macro to edit its routes";
               break label49;
            }

            var23 = this;
         }

         IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var8;
         label39: {
            var8 = var23.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            if (var3 == 0 && var8 != null) {
               var24 = var8.aj();
               if (var24 != null) {
                  break label39;
               }
            }

            var24 = "";
         }

         var16 =((String)( var24));
         String var26;
         if (var3 == 0 && var8 != null) {
            String var27 = var8.am();
            short var30 = 10000;
            short var10002 = 30556;
            var26 = var27 + "  ·  pick a route to edit";
         } else {
            short var25 = 10007;
            short var10001 = 27528;
            var26 = "pick a route to edit";
         }

         var17 = var26;
      }

      label26: {
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var16, var4, var5, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(), false, 16, null);
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var17, var4, var5 + 15.0F, IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(), false, 16, null);
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
         this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
         float var18 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.e()
            - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            - 6.0F;
         float var9 = 26.0F;
         float var10 = var18 - var9;
         float var11 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d() + 17.0F;
         this.a(var10, var11, var9, var1, var2);
         if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            == lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            )
          {
            float var12 = 180.0F;
            float var13 = 26.0F;
            float var14 = var10 - 8.0F - var12;
            float var15 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d() + 17.0F;
            this.a(var14, var15, var12, var13);
            if (var3 == 0) {
               break label26;
            }
         }

         float var19 = 66.0F;
         float var20 = 26.0F;
         float var21 = var10 - 8.0F - var19;
         float var22 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d() + 17.0F;
         this.a(var21, var22, var19, var20, var1, var2);
      }

      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.c()
            + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.d()
            + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            - 6.0F,
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.g()
            - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl * 2.0F,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .A()
            .a(0.7F),
         0.5F
      );
   }

   private final void a(float var1, float var2, float var3, float var4) {
      int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j()
            .a(0.9F),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      int var5 = var10000;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.45F),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      short var10001 = 9985;
      short var10002 = 26424;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n        <svg viewBox=\"0 0 2048 2048\" fill=\"currentColor\">\n            <path d=\"m884 253h71l34 3 41 5 28 5 30 7 32 9 38 13 22 9 33 15 32 16 24 14 12 8 16 11 15 11 12 9 11 9 14 12 10 9 11 10 2 1v2l4 2 36 36 7 8 10 11 7 8 13 16 14 19 13 18 10 15 13 21 12 21 14 27 12 25 11 27 10 27 10 31 9 35 6 30 6 40 3 29 1 14v70l-3 41-5 39-4 23-7 33-7 28-9 28-12 35-17 40-16 32-16 28-8 12-16 23-8 11-9 12-11 14-11 13-7 8-15 16-43 43-11 9-9 8-10 8-16 13-15 12-15 10-26 16-22 13-23 13-31 15-25 10-35 13-53 15-29 7-33 6-35 5-46 4h-41l-37-3-63-9-29-6-36-10-43-15-21-8-26-12-28-14-23-13-23-14-16-10-14-10-14-11-13-10-16-13-13-11-15-14-9-9-8-7-19-19-7-8-10-10-7-8-11-13-13-17-10-14-20-30-13-21-12-23-10-19-14-30-11-27-14-41-8-29-13-62-6-37-3-29v-96l4-44 7-42 8-36 9-32 11-33 8-21 13-30 12-26 10-19 14-25 14-22 8-12 9-12 13-18 12-15 18-22 7-7 7-8 30-30 8-7 13-12 8-7 18-14 17-12 20-14 17-11 28-17 25-14 16-8 19-9 27-11 36-12 36-10 21-5 41-7 49-6zm16 189-34 3-39 6-26 6-29 9-31 11-21 9-22 11-18 10-16 10-23 16-11 8-13 10-16 15-20 18-7 8-3 3v2h-2l-7 8-9 10-8 10-11 14-10 12-11 15-13 22-14 27-12 25-12 29-9 25-6 21-5 25-4 28-4 36-1 34 2 38 4 33 5 26 8 30 10 30 11 28 12 26 10 19 9 16 18 27 10 14 11 13 7 8 9 10 11 12 6 7 8 7 12 12 8 7 12 11 17 13 21 14 17 11 27 15 29 14 36 15 20 6 36 9 38 6 31 3 13 1h28l5-1 38-1 33-5 36-9 29-9 29-11 23-11 16-7 16-9 24-14 16-10 16-12 13-11 11-9 15-13 33-33 8-10 14-17 13-18 12-19 12-21 16-32 12-29 9-25 8-29 8-34 4-22 3-35v-52l-1-28-3-24-7-34-8-28-14-41-14-33-16-32-13-23-18-27-11-14-13-16-14-15-11-12-13-13-8-7-13-12-13-10-19-13-16-11-15-9-18-10-25-12-34-14-37-12-28-7-35-7-32-4-16-1z\"/>\n            <path d=\"m1547 1336h7l10 4 16 10 13 10 20 18 44 44 7 8 15 16 97 97v2h2v2h2l7 8 9 10 8 10 11 14 10 15 7 15 5 15 2 13v20l-3 21-4 15-8 18-9 16-8 11-8 10-14 14-19 14-17 9-21 8-22 5-5 1h-20l-24-5-15-5-11-6-9-7-10-9-26-26-12-11-15-15-8-7-18-18-3-2v-2l-4-2-8-8v-2l-4-2-76-76v-2l-4-2-34-34-8-7-14-14-5-10-1-4v-10l5-14 6-16 12-21 12-15 9-11 6-7h2l2-4 48-48 8-7 10-9 14-11 13-10 13-8z\"/>\n            <path d=\"m748 557 19 1 18 5 16 8 13 12 9 13 6 13 3 11v19l-5 15-13 23-12 16-7 8-10 8-17 13-8 6-14 11-13 13-8 7-19 19-7 8-10 11-8 11-12 15-12 17-8 16-7 13-9 12-5 4-11 4-9 2h-13l-13-2-12-4-12-7-11-9-8-9-8-13-3-9-2-11v-11l2-17 6-25 7-16 8-16 12-20 12-17 9-12 9-10 10-13 11-12 5-6 7-6 7-8 39-39 8-7 9-8 16-11 16-8 22-7z\"/>\n            <path d=\"m1178 1010 20 1 14 4 14 7 10 8 9 10 7 11 5 11 2 9v19l-3 17-6 20-8 19-7 11-8 12-9 12-9 11-12 12-7 8-13 12-4 5-8 7-10 8-16 9-18 8-20 6-6 1h-20l-10-3-13-7-12-11-6-7-8-13-5-15-3-17v-8l5-22 5-17 8-16 8-14 10-15 8-11 9-11 10-11 7-8 7-7 11-9 8-7 14-10 18-10 11-5 11-3z\"/>\n        </svg>\n    ",
            var1 + 10.0F,
            var2 + 8.0F,
            10.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(),
            1.0F
         );
      var10000 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.length();
      if (var5 != 0) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      String var10;
      if (var10000 != 0) {
         short var9 = 10004;
         var10001 = 16511;
         var10 = "Search macros...";
      } else {
         var10 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      String var6 = var10;
      var10000 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.length();
      if (var5 != 0) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var7 = var10000 != 0
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
            .a(0.55F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         var6,
         var1 + 26.0F,
         var2 + var4 / 2.0F,
         var7,
         false, 16, null);
   }

   private final void a(float var1, float var2, float var3, float var4, int var5, int var6) {
      int var10000;
      label48: {
         label51: {
            int var7 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
            float var11;
            var10000 = (var11 = var5 - var1) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
            if (var7 != 0) {
               if (var10000 < 0) {
                  break label51;
               }

               float var12;
               var10000 = (var12 = var5 - (var1 + var3)) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
            }

            if (var7 != 0) {
               if (var10000 > 0) {
                  break label51;
               }

               float var13;
               var10000 = (var13 = var6 - var2) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            }

            if (var7 != 0) {
               if (var10000 < 0) {
                  break label51;
               }

               float var14;
               var10000 = (var14 = var6 - (var2 + var4)) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            }

            if (var7 == 0) {
               break label48;
            }

            if (var10000 <= 0) {
               var10000 = 1;
               break label48;
            }
         }

         var10000 = 0;
      }

      int var8 = var10000;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = (var8 != 0);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         var8 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.5F),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      short var10001 = 10008;
      short var10002 = 14834;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"15,18 9,12 15,6\"/>\n    </svg>\n",
            var1 + 9.0F,
            var2 + 8.0F,
            10.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            1.0F
         );
      var10001 = 9987;
      var10002 = -9365;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         "Back",
         var1 + 24.0F,
         var2 + var4 / 2.0F,
         var8 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
         false, 16, null);
   }

   private final void a(float var1, float var2, float var3, int var4, int var5) {
      int var10000;
      label43: {
         label46: {
            int var6 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
            float var8;
            var10000 = (var8 = var4 - var1) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
            if (var6 == 0) {
               if (var10000 < 0) {
                  break label46;
               }

               float var9;
               var10000 = (var9 = var4 - (var1 + var3)) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
            }

            if (var6 == 0) {
               if (var10000 > 0) {
                  break label46;
               }

               float var10;
               var10000 = (var10 = var5 - var2) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
            }

            if (var6 == 0) {
               if (var10000 < 0) {
                  break label46;
               }

               float var11;
               var10000 = (var11 = var5 - (var2 + var3)) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
            }

            if (var6 != 0) {
               break label43;
            }

            if (var10000 <= 0) {
               var10000 = 1;
               break label43;
            }
         }

         var10000 = 0;
      }

      int var7 = var10000;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = (var7 != 0);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var3,
         var7 != 0
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .j(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var3,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.5F),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .aq()
      );
      short var10001 = 9986;
      short var10002 = -18665;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n        <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n            <line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"/>\n            <line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"/>\n        </svg>\n    ",
            var1 + 8.0F,
            var2 + 8.0F,
            10.0F,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(),
            1.0F
         );
   }

   private final void c(int var1, int var2) {
      int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = null;
      int var3 = var10000;
      List var4 = this.j();
      if (var3 == 0) {
         if (!var4.isEmpty()) {
            float var5 = (this.h() - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) / 2.0F;
            Iterator var6 = var4.iterator();
            int var7 = 0;

            while (var6.hasNext()) {
               IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var9;
               float var12;
               float var13;
               label56: {
                  label68: {
                     int var8 = var7++;
                     var9 = (IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI)var6.next();
                     int var10 = var8 % 2;
                     int var11 = var8 / 2;
                     var12 = this.d() + var10 * (var5 + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
                     var13 = this.f()
                        + var11
                           * (
                              this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                                 + this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                           );
                     float var16;
                     var10000 = (var16 = var1 - var12) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
                     if (var3 == 0) {
                        if (var10000 < 0) {
                           break label68;
                        }

                        float var17;
                        var10000 = (var17 = var1 - (var12 + var5)) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
                     }

                     if (var3 == 0) {
                        if (var10000 > 0) {
                           break label68;
                        }

                        float var18;
                        var10000 = (var18 = var2 - var13) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
                     }

                     if (var3 == 0) {
                        if (var10000 < 0) {
                           break label68;
                        }

                        float var19;
                        var10000 = (var19 = var2 - (var13 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII))
                              == 0.0F
                           ? 0
                           : (var19 < 0.0F ? -1 : 1);
                     }

                     if (var3 != 0) {
                        break label56;
                     }

                     if (var10000 <= 0) {
                        var10000 = 1;
                        break label56;
                     }
                  }

                  var10000 = 0;
               }

               int var14 = var10000;
               if (var3 == 0) {
                  if (var14 != 0) {
                     this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var9;
                  }

                  this.a(var12, var13, var5, this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var9, (var14 != 0));
               }

               if (var3 != 0) {
                  break;
               }
            }

            return;
         }

         short var10001 = 10003;
         short var10002 = 22249;
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            .a(
               "No macros available for this location",
               (int)((this.d() + this.e()) / 2.0F),
               (int)(this.f() + 40.0F),
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c()
            );
      }
   }

   private final void a(
      float var1, float var2, float var3, float var4, IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var5, boolean var6
   ) {
      int var7 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
      boolean var14 = false;
      if (var7 == 0) {
         if (var6) {
            float var15 = var1 + var3 / 2.0F;
            float var16 = var2 + var4 / 2.0F;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var15, var16);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(1.012F, 1.012F);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(-var15, -var16);
            boolean var17 = false;
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var18 = var6
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g()
                  .b(3.0F, 3.0F, 3.0F)
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j();
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var19 = var6
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
               var18,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ar()
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1,
               var2,
               var3,
               var4,
               1.0F,
               var19,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ar()
            );
            llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var20 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var5);
            float var21 = 52.0F;
            float var22 = var1 + 10.0F;
            float var23 = var2 + (var4 - var21) / 2.0F;
            if (var20 != null) {
               IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var24 = IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var20.d());
               me.octo.client.utils.IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var24.b(), var24.a(), var22, var23, var21, var6 ? 1.0F : 0.92F, true);
            }

            float var33 = var22 + var21 + 14.0F;
            float var25 = var1 + var3 - 28.0F;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
               var5.aj(),
               var33,
               var2 + 16.0F,
               var6
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                     .a(0.92F),
               false, 16, null);
            String var26 = var5.ab();
            int var10000 = var26.length();
            if (var7 == 0) {
               var10000 = var10000 > 0 ? 1 : 0;
            }

            if (var10000 != 0) {
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  .a(
                     var26,
                     (double)var33,
                     (double)(var2 + 36.0F),
                     (double)var25,
                     IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .c()
                        .a(var6 ? 0.9F : 0.68F)
                  );
            }

            this.a(
               var1 + var3 - 24.0F,
               var2 + var4 / 2.0F - 7.0F,
               14.0F,
               var6
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                     .a(0.4F)
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
            if (var7 == 0) {
               return;
            }
         }

         boolean var38 = false;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var27 = var6
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
            .b(3.0F, 3.0F, 3.0F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var28 = var6
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
         var27,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         var28,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar()
      );
      llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var29 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var5);
      float var30 = 52.0F;
      float var31 = var1 + 10.0F;
      float var32 = var2 + (var4 - var30) / 2.0F;
      if (var29 != null) {
         IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var34 = IIIlllllIIllIlIllIIllIlIIllIIlIIlIIlllIlIIlIlIIIllllIllllllIIIIlIllIlllIIIIIIllIllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(var29.d());
         me.octo.client.utils.IllllllIllllIIIIIlIIlIlIIIllIlIllIIlllIIllIlllllllllIIIllIlIIlIIIllIIIIIllIIIIIllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var34.b(), var34.a(), var31, var32, var30, var6 ? 1.0F : 0.92F, true);
      }

      float var35 = var31 + var30 + 14.0F;
      float var36 = var1 + var3 - 28.0F;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
         var5.aj(),
         var35,
         var2 + 16.0F,
         var6
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .a(0.92F),
         false, 16, null);
      String var37 = var5.ab();
      int var39 = var37.length();
      if (var7 == 0) {
         var39 = var39 > 0 ? 1 : 0;
      }

      if (var39 != 0) {
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            .a(
               var37,
               (double)var35,
               (double)(var2 + 36.0F),
               (double)var36,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c()
                  .a(var6 ? 0.9F : 0.68F)
            );
      }

      this.a(
         var1 + var3 - 24.0F,
         var2 + var4 / 2.0F - 7.0F,
         14.0F,
         var6
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c()
               .a(0.4F)
      );
   }

   private final void d(int var1, int var2) {
      int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = -1;
      int var3 = var10000;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
      if (var3 != 0 && this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI != null) {
         List var5;
         byte var6;
         float var7;
         float var12;
         float var15;
         float var16;
         label165: {
            label172: {
               IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var4 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
               var5 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .d(var4);
               var6 = 2;
               var7 = (this.h() - this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) / var6;
               int var8 = 1 + var5.size();
               int var9 = (var8 + var6 - 1) / var6;
               float var10 = var9 * this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                  + RangesKt.coerceAtLeast(var9 - 1, 0) * this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
               float var11 = RangesKt.coerceAtLeast(var10 - this.i(), 0.0F);
               this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = RangesKt.coerceIn(
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll, 0.0F, var11
               );
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  .a(this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
               var12 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.e();
               byte var13 = 0;
               byte var14 = 0;
               var15 = this.d() + var13 * (var7 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
               var16 = this.f()
                  - var12
                  + var14
                     * (
                        this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                           + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                     );
               float var38;
               var10000 = (var38 = var1 - var15) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1);
               if (var3 != 0) {
                  if (var10000 < 0) {
                     break label172;
                  }

                  float var39;
                  var10000 = (var39 = var1 - (var15 + var7)) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1);
               }

               if (var3 != 0) {
                  if (var10000 > 0) {
                     break label172;
                  }

                  float var40;
                  var10000 = (var40 = var2 - var16) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
               }

               if (var3 != 0) {
                  if (var10000 < 0) {
                     break label172;
                  }

                  float var41;
                  var10000 = (var41 = var2 - (var16 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll)) == 0.0F
                     ? 0
                     : (var41 < 0.0F ? -1 : 1);
               }

               if (var3 != 0) {
                  if (var10000 > 0) {
                     break label172;
                  }

                  float var42;
                  var10000 = (var42 = var2 - this.f()) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
               }

               if (var3 != 0) {
                  if (var10000 < 0) {
                     break label172;
                  }

                  float var43;
                  var10000 = (var43 = var2 - this.g()) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
               }

               if (var3 == 0) {
                  break label165;
               }

               if (var10000 <= 0) {
                  var10000 = 1;
                  break label165;
               }
            }

            var10000 = 0;
         }

         label134: {
            int var17 = var10000;
            this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = (var17 != 0);
            float var44;
            var10000 = (var44 = var16 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll - (this.f() - 2.0F)) == 0.0F
               ? 0
               : (var44 < 0.0F ? -1 : 1);
            if (var3 != 0) {
               if (var10000 < 0) {
                  break label134;
               }

               float var45;
               var10000 = (var45 = var16 - (this.g() + 2.0F)) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
            }

            if (var10000 <= 0) {
               this.a(var15, var16, var7, this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, (var17 != 0));
            }
         }

         Iterable var18 = var5;
         boolean var19 = false;
         int var20 = 0;

         for (Object var22 : var18) {
            int var23 = var20++;
            if (var3 != 0) {
               var10000 = var23;
               if (var3 != 0) {
                  if (var23 < 0) {
                     CollectionsKt.throwIndexOverflow();
                  }

                  var10000 = var23;
               }

               String var24 = (String)var22;
               int var25 = var10000;
               boolean var26 = false;
               int var27 = var25 + 1;
               int var28 = var27 % var6;
               int var29 = var27 / var6;
               float var30 = this.d() + var28 * (var7 + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
               float var31 = this.f()
                  - var12
                  + var29
                     * (
                        this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                           + this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
                     );
               label83:
               if (var3 != 0 && var31 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll >= this.f() - 2.0F) {
                  float var46;
                  var10000 = (var46 = var31 - (this.g() + 2.0F)) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
                  if (var3 != 0) {
                     if (var10000 > 0) {
                        break label83;
                     }

                     float var47;
                     var10000 = (var47 = var1 - var30) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1);
                  }

                  label113: {
                     label176: {
                        if (var3 != 0) {
                           if (var10000 < 0) {
                              break label176;
                           }

                           float var48;
                           var10000 = (var48 = var1 - (var30 + var7)) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
                        }

                        if (var3 != 0) {
                           if (var10000 > 0) {
                              break label176;
                           }

                           float var49;
                           var10000 = (var49 = var2 - var31) == 0.0F ? 0 : (var49 < 0.0F ? -1 : 1);
                        }

                        if (var3 != 0) {
                           if (var10000 < 0) {
                              break label176;
                           }

                           float var50;
                           var10000 = (var50 = var2 - (var31 + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll))
                                 == 0.0F
                              ? 0
                              : (var50 < 0.0F ? -1 : 1);
                        }

                        if (var3 != 0) {
                           if (var10000 > 0) {
                              break label176;
                           }

                           float var51;
                           var10000 = (var51 = var2 - this.f()) == 0.0F ? 0 : (var51 < 0.0F ? -1 : 1);
                        }

                        if (var3 != 0) {
                           if (var10000 < 0) {
                              break label176;
                           }

                           float var52;
                           var10000 = (var52 = var2 - this.g()) == 0.0F ? 0 : (var52 < 0.0F ? -1 : 1);
                        }

                        if (var3 == 0) {
                           break label113;
                        }

                        if (var10000 <= 0) {
                           var10000 = 1;
                           break label113;
                        }
                     }

                     var10000 = 0;
                  }

                  int var32 = var10000;
                  if (var32 != 0) {
                     this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var25;
                  }

                  this.a(var30, var31, var7, this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var24, (var32 != 0));
               }

               if (var3 != 0) {
                  continue;
               }
            }
            break;
         }
      }
   }

   private final void a(float var1, float var2, float var3, float var4, boolean var5) {
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var6 = var5
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.6F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         var6,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(var5 ? 0.8F : 0.35F),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar()
      );
      short var10000 = 10001;
      short var10001 = 31784;
      String var7 = "Create new route";
      float var8 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var7, false, 2, null);
      float var9 = 14.0F;
      float var10 = var9 + 10.0F + var8;
      float var11 = var1 + (var3 - var10) / 2.0F;
      float var12 = var2 + var4 / 2.0F;
      var10001 = 10010;
      short var10002 = -24454;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <line x1=\"12\" y1=\"5\" x2=\"12\" y2=\"19\"/>\n        <line x1=\"5\" y1=\"12\" x2=\"19\" y2=\"12\"/>\n    </svg>\n",
            var11,
            var12 - var9 / 2.0F,
            var9,
            var5
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(),
            1.0F
         );
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
         var7,
         var11 + var9 + 10.0F,
         var12,
         var5
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c(),
         false, 16, null);
   }

   private final void a(float var1, float var2, float var3, float var4, String var5, boolean var6) {
      int var7 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
      boolean var14 = false;
      if (var7 == 0) {
         if (var6) {
            float var15 = var1 + var3 / 2.0F;
            float var16 = var2 + var4 / 2.0F;
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var15, var16);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(1.012F, 1.012F);
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(-var15, -var16);
            boolean var17 = false;
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var18 = var6
               ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .g()
                  .b(3.0F, 3.0F, 3.0F)
               : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .j();
            me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var19 = var6
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
               var18,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ar()
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
               var1,
               var2,
               var3,
               var4,
               1.0F,
               var19,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .ar()
            );
            float var20 = var1 + 16.0F;
            float var21 = var2 + var4 / 2.0F;
            String var10000 = var5;
            if (var7 == 0) {
               if (var5.length() > 22) {
                  var10000 = var5.substring(0, 21);
                  short var10002 = 9989;
                  short var10003 = 25345;
                  Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
                  var10000 = var10000 + "…";
               } else {
                  var10000 = var5;
               }
            }

            String var22 = var10000;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
               var22,
               var20,
               var21 - 9.0F,
               var6
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                     .a(0.92F),
               false, 16, null);
            int var23 = this.a(var5);
            short var34 = 10013;
            short var37 = -12000;
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
               me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var23 + " waypoints",
               var20,
               var21 + 10.0F,
               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(),
               false, 16, null);
            this.a(
               var1 + var3 - 22.0F,
               var21 - 7.0F,
               14.0F,
               var6
                  ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a()
                  : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .c()
                     .a(0.4F)
            );
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
            if (var7 == 0) {
               return;
            }
         }

         boolean var31 = false;
      }

      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var24 = var6
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .g()
            .b(3.0F, 3.0F, 3.0F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var25 = var6
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
         var24,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar()
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1,
         var2,
         var3,
         var4,
         1.0F,
         var25,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ar()
      );
      float var26 = var1 + 16.0F;
      float var27 = var2 + var4 / 2.0F;
      String var32 = var5;
      if (var7 == 0) {
         if (var5.length() > 22) {
            var32 = var5.substring(0, 21);
            short var35 = 9990;
            short var38 = 7659;
            Intrinsics.checkNotNullExpressionValue(var32, "substring(...)");
            var32 = var32 + "…";
         } else {
            var32 = var5;
         }
      }

      String var28 = var32;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll,
         var28,
         var26,
         var27 - 9.0F,
         var6
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .a(0.92F),
         false, 16, null);
      int var29 = this.a(var5);
      short var36 = 9988;
      short var39 = 31089;
      me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.d(
         me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         var29 + " waypoints",
         var26,
         var27 + 10.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c(),
         false, 16, null);
      this.a(
         var1 + var3 - 22.0F,
         var27 - 7.0F,
         14.0F,
         var6
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .c()
               .a(0.4F)
      );
   }

   private final void a(float var1, float var2, float var3, float var4, boolean var5, Function0<Unit> var6) {
      int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
      boolean var8 = false;
      int var7 = var10000;
      if (var5) {
         float var9 = var1 + var3 / 2.0F;
         float var10 = var2 + var4 / 2.0F;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var9, var10);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(1.012F, 1.012F);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(-var9, -var10);
         var6.invoke();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
         if (var7 != 0) {
            return;
         }
      }

      var6.invoke();
   }

   private final void a(
      float var1, float var2, float var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4
   ) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(var1 + var3 / 2.0F, var2 + var3 / 2.0F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(-1.0F, 1.0F);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(-(var1 + var3 / 2.0F), -(var2 + var3 / 2.0F));
      short var10001 = 10006;
      short var10002 = 5657;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            "\n    <svg viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\">\n        <polyline points=\"15,18 9,12 15,6\"/>\n    </svg>\n",
            var1,
            var2,
            var3,
            var4,
            1.0F
         );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   private final int a(String var1) {
      int var2 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
      if (var2 != 0 && this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI != null) {
         IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var3 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         return llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var3, var1);
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(double var1, double var3, int var5) {
      int var6;
      lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl var13;
      label112: {
         var6 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.k();
         int var10000 = var5;
         if (var6 == 0) {
            if (var5 != 0) {
               return false;
            }

            var13 = this;
            if (var6 != 0) {
               break label112;
            }

            var10000 = ((this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll) ? 1 : 0);
         }

         if (var10000 != 0) {
            Minecraft.getInstance().setScreen(null);
            return true;
         }

         var13 = this;
      }

      lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = var13.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001 = lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      if (var6 == 0) {
         label100: {
            if (var13.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
               == lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               )
             {
               var13 = this;
               if (var6 != 0) {
                  break label100;
               }

               if (this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl) {
                  this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0.0F;
                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.c(0.0F);
                  return true;
               }
            }

            var13 = this;
         }

         var14 = var13.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         var10001 = lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      if (var6 == 0) {
         if (var14 == var10001) {
            if (this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl == null) {
               return false;
            }

            IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var11 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var11;
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0.0F;
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.c(0.0F);
            return true;
         }

         var14 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         var10001 = lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      label115: {
         if (var6 == 0) {
            label88: {
               if (var14 == var10001) {
                  var13 = this;
                  if (var6 != 0) {
                     break label88;
                  }

                  if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) {
                     if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI == null) {
                        return false;
                     }

                     IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var7 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                     if (var6 == 0) {
                        String var17 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .e(var7);
                        if (var17 != null) {
                           String var8 = var17;
                           llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .c(var7, var8);
                           return true;
                        }
                     }

                     return true;
                  }
               }

               var13 = this;
            }

            if (var6 != 0) {
               break label115;
            }

            var14 = var13.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            var10001 = lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var14 != var10001) {
            return (0 != 0);
         }

         var13 = this;
      }

      if (var6 != 0) {
         return (boolean)(var13.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI != 0);
      } else if (var13.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI < 0) {
         return (0 != 0);
      } else if (this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI == null) {
         return false;
      } else {
         IllIllIlIIIlIllIllIllllllIlIllllllllIllIIlllIIIIIIIlllIIIllIlIllIIIlllIIllIIIlIIlIIlI var10 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         List var12 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d(var10);
         if (var6 == 0) {
            String var19 = (String)CollectionsKt.getOrNull(var12, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI);
            if (var19 != null) {
               String var9 = var19;
               llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .c(var10, var9);
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         == lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         )
       {
         float var9 = 32.0F;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = RangesKt.coerceAtLeast(
            this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll - (float)var7 * var9, 0.0F
         );
      }

      return true;
   }

   @Override
   public boolean a(int var1, int var2, int var3) {
      int var4 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
      int var10000 = var1;
      if (var4 != 0) {
         lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl var5;
         switch (var1) {
            case 256:
               lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl var7 = this;
               if (var4 != 0) {
                  if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                     != lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     )
                   {
                     Minecraft.getInstance().setScreen(null);
                     return true;
                  }

                  var7 = this;
               }

               var7.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
               return true;
            case 259:
               var5 = this;
               if (var4 == 0) {
                  break;
               }

               if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                  == lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  )
                {
                  var10000 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.length();
                  if (var4 != 0) {
                     var10000 = var10000 > 0 ? 1 : 0;
                  }

                  if (var10000 != 0) {
                     this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = StringsKt.dropLast(
                        this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, 1
                     );
                     return true;
                  }
               }
            case 257:
            case 258:
            default:
               var5 = this;
         }

         var10000 = ((var5.a(var1, var2, var3)) ? 1 : 0);
      }

      return (var10000 != 0);
   }

   @Override
   public boolean a(char var1, int var2) {
      int var3 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
      if (this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
         == lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )
       {
         int var10000;
         label25: {
            var10000 = 32;
            char var10001 = var1;
            if (var3 != 0) {
               if (' ' > var1) {
                  var10000 = 0;
                  break label25;
               }

               var10000 = var1;
               if (var3 == 0) {
                  break label25;
               }

               var10001 = 127;
            }

            var10000 = var10000 < var10001 ? 1 : 0;
         }

         if (var10000 != 0) {
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               + var1;
            return true;
         }
      }

      return false;
   }

   private static final Unit a(
      int var0,
      int var1,
      lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl var2,
      boolean var3,
      int var4,
      GuiGraphicsExtractor var5,
      int var6
   ) {
      float var8;
      float var9;
      float var10;
      int var15;
      int var16;
      label15: {
         int var10000 = llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.j();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            0.0F,
            0.0F,
            var0,
            var1,
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()
               .a(0.55F),
            0.0F
         );
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
         var8 = var0 / 2.0F;
         var9 = var1 / 2.0F;
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var8, var9);
         int var7 = var10000;
         var10 = lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .f()
               .P()
            * var2.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.k();
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var10, var10);
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(-var8, -var9);
         boolean var11 = false;
         boolean var12 = false;
         var10000 =(( var3) ? 1 : 0);
         if (var7 != 0) {
            if (!var3) {
               var15 = (int)((float)var4 * var0 / var5.guiWidth());
               var16 = (int)((float)var6 * var1 / var5.guiHeight());
               if (var7 != 0) {
                  break label15;
               }
            }

            var10000 = var2.a().getWindow().getGuiScale();
         }

         int var13 = var10000;
         var15 = var4 * var13;
         var16 = var6 * var13;
      }

      int var17 = (int)(var8 + (var15 - var8) / var10);
      int var14 = (int)(var9 + (var16 - var9) / var10);
      var2.a(var17, var14);
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[23];
      int var3 = 0;
      String var2 = "ÞñÌP<I\tÈ{ZØ\u007fåØ)ÐÈ\u001b3Û\u008a²°7ShVÐÙq©\u0092ò«ç \u001b|\u009dP=Æ\u007fÍáèâ¹Æ¿[ýgóà(\u0001à#\u0090\t·B=\tÂõ\u0085}\u0001\u009aÈJ%jÙ\u0095XC\u0094nõz\u0094\u008d\u0096ëübì!h\u008bæÍf\u001d\u0081:\u0089\t:Çº\u0019\u008d6¿\u0083yP½\u0080r\bô\u0006\u0085ÅO*ZOÖ!`*Úp±×)Òj|AÆ\u008dg\fw\u0081ßÔúa\u008d2y'jjqÌ84wAå\u0010S,Ö)âæ=\u0088ëC\u0014×As3½\u0010Ø\u0084Ij\u008d=\u0014qÖ\u0087¤\u001aÿe\u0012x%]ú\u0006ñ\u000f¹T\u0089Ô\u0099§ëü&`ð\u0085~q*\u000bÐ¨²\u001c\u00904\u008e<±Æõ±á\u0098w(\u0003½´\u001e\u0010Ñ\u001f~ÿøóO\u0007¹>\u009f¦\u009c\u0017»M\u0019Óãã9\u0097W5)\u0098\u00005\u008e½\u0010 å°'!\u008btHß£&\f3¸\u0001 \u0014ê\u0084Ã\u0005îÊß\u0010\u0098Kæ±Þ'\u001dÝ¾\fÓÙ&²ß\u0085\n\u0016Ù\u008d\u009a\u0006N]û\u008a¥\u0007\u0086¯vÇÎ\u0012{\u0010ó¹Â\u009b`°mBá\u001aUüi\u00166\u0011»\u0002Ù!~ªó\u0088mz?ó \u0087½¥PÌôF\u0010\u0004Ú\u0095UãtØ\u0014\u0093\u0001x,C\u0089>,\"\u0086È½¼Ô\\Ûî¯\u00006±óÞgçÏ\u0081!SÕõ¼Ù \u0011Æ&\u0082êO.\u00840?í[\u0007Ï\u00ad`\fB\u008a®¬4O\u0093ç7rÆÜNXLk\u0080ø\u008f\u008bÕÐ¯¥\u0085!{^P%Ä3\f®Ú\u0089±ï'#%cÅ{\u0099\u0014\u008cmØg\u0083\rP/Ðð\u0014[\u0010\u0007Z±{¿\u009fh\u009d²Â\u0003á>£\u0088Ëd<³\u0092â`\u009c\u0084)ÅQ\f\u0011\u001d\u0097äS\u0089ÕNh×Å\u009býý\u0083>fj¼\u008a\u009c\u0007¤±ÿ\u0081³\u0096A\u008ah lA\u0003\u0014½\u0091Ü 'Ó\u001dÃö\u009f¦\r\u000b/\u00ad= ©Eë\fç\t\u007f+ã)ps\u0013\u008baýA\u001aK\u0088(tÑSùÛ\n\u0093XN(´ÝõJ!OC^B\tL{§p\u0087c\u0005ÃKÄÓ<7\u001e_\u008dàWá\u000bætÒËÔY\b¡Ä,\"\u0082_U\u001481\r»iÍ#oQ\u0007óÿV°ì\u001aÔæ%a?,ÖaÛ×©äýýú1c§zY?ìì!GÍ·Tþ\u0013z'ZÎOðòô\u009cyÒ´7òÌ\u001cì\u001a\u008cþo:x\u001fó\u001c}\u000eGT\u009dcc'uh\u009c\u008cw\u0018\u000fK\u000e\u0002I5ÀvS×æÈ]ý\"^\f\nú\u009e\u0010rµS+XDÑ\u0004jò.9";
      int var4 = "ÞñÌP<I\tÈ{ZØ\u007fåØ)ÐÈ\u001b3Û\u008a²°7ShVÐÙq©\u0092ò«ç \u001b|\u009dP=Æ\u007fÍáèâ¹Æ¿[ýgóà(\u0001à#\u0090\t·B=\tÂõ\u0085}\u0001\u009aÈJ%jÙ\u0095XC\u0094nõz\u0094\u008d\u0096ëübì!h\u008bæÍf\u001d\u0081:\u0089\t:Çº\u0019\u008d6¿\u0083yP½\u0080r\bô\u0006\u0085ÅO*ZOÖ!`*Úp±×)Òj|AÆ\u008dg\fw\u0081ßÔúa\u008d2y'jjqÌ84wAå\u0010S,Ö)âæ=\u0088ëC\u0014×As3½\u0010Ø\u0084Ij\u008d=\u0014qÖ\u0087¤\u001aÿe\u0012x%]ú\u0006ñ\u000f¹T\u0089Ô\u0099§ëü&`ð\u0085~q*\u000bÐ¨²\u001c\u00904\u008e<±Æõ±á\u0098w(\u0003½´\u001e\u0010Ñ\u001f~ÿøóO\u0007¹>\u009f¦\u009c\u0017»M\u0019Óãã9\u0097W5)\u0098\u00005\u008e½\u0010 å°'!\u008btHß£&\f3¸\u0001 \u0014ê\u0084Ã\u0005îÊß\u0010\u0098Kæ±Þ'\u001dÝ¾\fÓÙ&²ß\u0085\n\u0016Ù\u008d\u009a\u0006N]û\u008a¥\u0007\u0086¯vÇÎ\u0012{\u0010ó¹Â\u009b`°mBá\u001aUüi\u00166\u0011»\u0002Ù!~ªó\u0088mz?ó \u0087½¥PÌôF\u0010\u0004Ú\u0095UãtØ\u0014\u0093\u0001x,C\u0089>,\"\u0086È½¼Ô\\Ûî¯\u00006±óÞgçÏ\u0081!SÕõ¼Ù \u0011Æ&\u0082êO.\u00840?í[\u0007Ï\u00ad`\fB\u008a®¬4O\u0093ç7rÆÜNXLk\u0080ø\u008f\u008bÕÐ¯¥\u0085!{^P%Ä3\f®Ú\u0089±ï'#%cÅ{\u0099\u0014\u008cmØg\u0083\rP/Ðð\u0014[\u0010\u0007Z±{¿\u009fh\u009d²Â\u0003á>£\u0088Ëd<³\u0092â`\u009c\u0084)ÅQ\f\u0011\u001d\u0097äS\u0089ÕNh×Å\u009býý\u0083>fj¼\u008a\u009c\u0007¤±ÿ\u0081³\u0096A\u008ah lA\u0003\u0014½\u0091Ü 'Ó\u001dÃö\u009f¦\r\u000b/\u00ad= ©Eë\fç\t\u007f+ã)ps\u0013\u008baýA\u001aK\u0088(tÑSùÛ\n\u0093XN(´ÝõJ!OC^B\tL{§p\u0087c\u0005ÃKÄÓ<7\u001e_\u008dàWá\u000bætÒËÔY\b¡Ä,\"\u0082_U\u001481\r»iÍ#oQ\u0007óÿV°ì\u001aÔæ%a?,ÖaÛ×©äýýú1c§zY?ìì!GÍ·Tþ\u0013z'ZÎOðòô\u009cyÒ´7òÌ\u001cì\u001a\u008cþo:x\u001fó\u001c}\u000eGT\u009dcc'uh\u009c\u008cw\u0018\u000fK\u000e\u0002I5ÀvS×æÈ]ý\"^\f\nú\u009e\u0010rµS+XDÑ\u0004jò.9"
         .length();
      char var1 = 20;
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
                     case 0 -> 56;
                     case 1 -> 19;
                     case 2 -> 47;
                     case 3 -> 1;
                     case 4 -> 77;
                     case 5 -> 38;
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
                     e = var5;
                     f = new String[23];
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

                  var2 = "\u0090ñ\u000b\u0003\u00978\u0004¥íÞÓä\\öÐúµUÏ\u0000y\u0019\u0013û\u001d\u008bû\u0087ÉÍË\u0090ÝÜIp\u0086T5»\u000e\u008cª\u001f¦33jû~AZ*Rà«ÇµÓÝ5\u0007Á\u0001¼Á\u000eÖ\u0088xØó> \u001eöÐ\u0085CB\u0096ý&\t($®Ö#\u0082\u0092ò?(Úó\u0003\u0088Þ0{°¼ÉÔ\u008a¹\u0016¥nÝ \u0002xY\u0003ux\u008c·îÎ²\u0087NÒp%\u0017Ë»{°Ù'\u0089\u0004¨Øã¹\u0011A\u001fÞ»-ÕÔ\u0080qmSÜ}ç\u0097ð¬\u0006·y\u008a6]\u0098³1ÎYáDe\u008akè\u001by1\u008bÑÝ©Â\u001f¡È\u0003ïÂ\u0090./3¡\u009fZ&C{\u001bêúÿ2ੀG7ñÛÈ#ïÆ\u0090²|i©GnÌb\u00935Ø&\u0002ø\u0098`çT\n8h{¦\u0090\u009c ;í\n\u0084þ\n\u0005;\nìk\u0012\u0098éçén\u0091x\u0083nv¦Ð4\u0083Þ\u0086y½Y\u008aÝ\tM\u0083ØVø2fnk½Õy\u0016\u008b;È\u008ez¯FËnb\u0080ë\\\u000eÓRÉ±i\u000b~!i\u0088@Ã%ÿù\t{^h¿û\u0086\u0091\u0003U\u0005¤5Þ\u00000mY\u0083¬Hv\u0098\u0007w¬YÛî\u001f¤Å.Z®:e\u0019\u0092\u001e®\u008d\u0010Ö~\u009fÐ\u0010qR\u009d\u0014ç\u00ad9¤Ñ\u001dFæß*\u0088§\u0080\u001etÍ9ñâ\u00971¯\n0;àöq¨Rµ3\u0090\u0080ºâjé\u0003º\u0005,§{\u0002Ú¶ó«;K\u0080\u0002ÂâØ*, î\u0082i\u000e\u009eè\u0016Â-Éã\\r\u001d\u000efi±h\bîj\u008düï\u008aÑ÷@\u001a\u0099lTà^P\u000e,»£®\u0090¾¦`éÜ\u0011^[*\u0099ÌU\u0097\\½-ñØ{'\u0088ÍÍ\u001bý\u0000óW&Ûvg¼Ñ¡rTíç¨Ø³h\u0080\u008di¢\u0091.Ó,\u000eDÒ¤7ê¼[ãaov1+Ùná\u0016Ùæ«Òÿ4\u009fr\u0007\u0090Z\"7Ç#ã\u0087¢;\u0099i$eé\rêä§xÐ¸\u0002Ið\fµÚìóâ6 \u008aoa\\\u001c\u0094\u0012n\u000b\u0005éa`\u0003ÄyÓ¾5µ¥ÇQ=ªÙ\u001d`ù¹Ä\u009fL¶\u00126$ð\u0099å \u0092ijfÜ\u008bàoF\u00973Z·\u000eÁ:j\u000bÜÉþ:I¦ìÐâR \u0005oð_M\u009d.\u0015XB\u0097ã:\u0011ðiÖì\b»\\\u0092íÆ¢Ä\u0000°ÈëV\u008f\u0001\u0097#\u0005\u0085'´\u009aÞ\n\u0092®ÄbË\u009fñUKQ-ø¢E¯7º5\u0098Ý\u008d÷\u007fÈ\u0005ï\u0083}\\É« d\u0094\u0010\u0003åOv%\u0090,¹ñ`[Ûa\u0083f\u0016<ßqíªu¨åêú\u008ak\u001dh\u0090\u0011A\u0016¡ifcP\u0085ÃÐîý\u0015~päSÒ\f+\u00996\u0080GØ³Uê@\u0097\u000b\u0007\u0081(\u0015Õê¥\u0014Ò\u0014DÑý½w*§Ùùò<ÈbÑÌîÑFt®÷Ö°\r\töu\u0089èéU+é\u0003æc\\»¼=ñR \u0019w¿õ\u000eBÞ\u001b\u008fá9\u0004n\u001cÀN\u001bÛ\u0087³Q£bÍ\u0006¼7\u0089÷D|@´Ci'åç\b\u001bª¡\u0084|®Ì³DlÛ~úE\u0004ã\u001c0NfÛ,³¥¦YÂ|\tÌÞß\u0012øÓùUÛfÊJÓ÷-?}\u0097¥\u0081V°¨³áó\\§p·Ý\u0016Î9\u0089kâÍ'\u00ad¬\u009c\" \u0017R`Í=B\f\u0098§\f\u0011ç¶âÊ)víÔñh\u0096kÑ\u0098×Ös£&Í\u008b±!\u0080wâmú½¤\u001fG¦\u009c/à\u00ad\u008d\u0099Ô0\fêDõ÷ö\u0082\u0091;bÝ\u001fÄ`>\u0013<\"FÐø\u0001ëÞÏÊ\u008eØVI1\u0087çbÒ\u0084bØÝ>ÀöBb¦Ð³Ôxë@µNe\u008cÓw\u007f\u001bõ=O\u008d!\ro0¡hTñiûh\u0007&{\u008a\u0004 4W<{{.§D5Ö\u008cq-e4áæ}ïI8È|\u0013w(\u0085ó\u0003N0XSB\u0007Î!N\u0000¤t\u0094µÿ2ñu~r{\n¡\rGô|\u0089\u0093kB]ª\r5Á\u0016°dmw&>ÃØ\u009f}$°¹J\u0007\u0097\u0006T#ö,ÁÇS\u0004ØÓný\b\"çØ\u0091Ò_Ì¥QÓú?I\u001c{ÊþT¹\u0089ÂÓ\u009d\u001dËëá74\u0013<1ý·¤£jzBo\u0016ÏÇ\\º»óæe\u0089X?M\u0081ªÌ¡e\u0086ÿ¥\u007fq\u0095Ì.s\u000f`\u0014FJ+\u0099 ,çã¬aË9V\u008cÓßë\u0012\u001c\"\u0091¢÷´\u0086½Kÿ\u0002KûY*º\u009b\u001aØ@Ú¸w¼\u0090Í\u0015Á\u0089¦k\b\u0083þ\u0012\u0005ú@{;a*N\t»yÂ\u0095DËµ\nýÆyµü\u009d9'ÑNGÎÖ?±\u0010\u0084\u001eåïy\u0084Áb_(å±ò\u00909obÓ£\u0011¡\u0080rp@=Hb¢6r\u001f¨\u0088à§B\u0005deöIO\"\u009f\u0094\u0005ÈV\u0090·WÈ\rruþðï#È<\u0002%!Òý¾Ô`*R{w\u0095¶ fJûeºÖ¶K_\få\u0014õ$>ý\u0082\u0005±Ë$ÊÚ\u000eqg\u0092\u000fÃ)\u0017H?E\"\u008f?ö\u001f=\u0088ô££\u0006Iñg¹\u0083Z/nb\u0098ºv+ÉxÏ7\u001cw\u008eÐÍµýNÕ\u0002`]â\u008f ÿY\u009ajÁ¹j\u0083\\Ë\u001a§\u0002_Á*fag_§z¸*wÓ\u000b¿á\u008ctoÔQz¶ï\fèc\u0018\u001d\u0019ýÒ\u0094\u0092\u000f\u0018pmn®þ3\u001a\u0085=øúT4^5\u0098ú\u0082\u0082\u001d\u0098§Á±gÓÈî\u0004Á\u009f\b\u000få$\u001dýë\u00050Ë\u0014ÈÑ\u000f³$$`\u0018 À\nÅ\u000bp\u0081Þ\u0016Ä\"þuÃ²Oy!5gT¢ñAq w«\u008a¶<\u0002Ò¾@ËüIíÏ\u001b\u0018\u0003\u0017ä3~\u0019ÓµQ_}\u0092í\u00adØbE\u0002\u00ad7¶m\u0018ì{d\u0090\u009a\"/Á-âîe\u0092bQ?Ím{z'µ¬\u0092\"O\u0017ü`44Ä\u001aü\u008eÿÃ\u001a°ÃÃ0ÂO>\u007fß¼H\u0012Á\u009dw/%.§\u0011\u0012ê¡\u008f|¬ÆóG}\u0089xèF{^s\u0098Y\u0091ã\n6Ý¨x\u0016Ò%\u0092f\u0085\u0084HÛo¯ö¦\u0006H\u001dåk\u0014¼Êª\u0016P\u0092\u0016\u0001÷¥tkÀñðó_l\rEAq\u0003\u001f7]©uøyÄg¼^\u0094!^'øJØõ*\f¥\u0018ìõ?Ó\u0091GÄ°n´¼°tî÷õYÎ\u0093\u0017×K+k\u009eÿý)\u0080êq=¼OR·¼Óì?e\u0001ÇÕIä?±\"n¢?:\u0089IÈey\u008cVqvØ{íÇÅ½#W\u000fÑTm\u0010\u0087\u0098O1\t\\\u0015b\u0016\u0019sDîþâ)/Ãt\u001føÔùñÊ\u008d\u0007åÉyæÉMWÊä\u000fÄó/ 19vj\u000bJ\f~¯\\ÎñgLL\u0018\u001cJ(ÌÄh°Åáâ\u0094)Ú\u001a\u00010À\u009a¹\u0089\u0000Öf\u0007Â\u0087>ó2\u009e\u0083ö\t\u0096\u009b\u0091\u0018ïµ®GS-Þ^Q\u001b\fuzÿ\u0007\rÈÚ\u0086\u0001.\u009eYíá\u009cÕ\u001cô|pX\u0095DÔÜ\u0099Pø\tÌØ¢\u0018\u0014Ô[Ð\rç¢¹\u0098W#\bÏf*\u00849ÛA¯3¦¶P\u001eý\u0094\u0011^°BÞ\u001a\u0099ßV,\u0094\u0089\u0097I°\u0019±¿D\u000e6Â¨Ô>â\u007f÷\u009c2aÚ\u009d¹½V`\u001fè\u009b¥ØÇ×\nfô,\u0014¢W^Y\u009c\u007fÄ©M}\u0013á\u0004I\u0083âº_¢\u0012\u0085\u001aF¸I\u009evíÊh\u001c°x\u008bCàÀx\u001b»\u0086ÑPEBÔ\u0007ñ¸\u0091Qù$ìÑ¨|\u009fô\u008c \u008dN\u0091¼ß¥¹zÂà9Æþ>¹:9\u0001E#Ù\u0081þ°¡^i\u0081FÅyë0¶é\u0090\u0097tB\u0097u\u0004öv|£ùIÉqÓÜÉã%TùaS²I\u009b2½¾\u0000\u001aÁ\u009a×8'¥«Ú{£7$RÚðfâ\u0087\u00992L\u0003ý\u0096Ì7\bìwe\u000bÇõZ³,.Q\u0018£\u0096É\b¢â2\f[ß~Õd\u0082ÄÁ´X\u0095>FÜgü&\u00918gûõ!,\nMpó¡\u001e\u0087F5\u0017A~g\u0006âV\u0017\u0002)\u0081_\u0000ùíú4+Îu\u0083\u001b\u008bË <*`#Ñj]*¨\u0091ó÷\u009d\u0086ûK7\u0002Qõy%¾X\u0099ÃR¹Ø\u0019Ó\u0013 ë{5\u0017ü\u0019d\u0006\\\u0085\u0091Kå36Cí\u0005ô\u0087\u0014\u0086P\u0098TD\u0093Àî1\n\u009c\tõ\u0090½\u009b|pS÷¾ý¸h\bZS\u0002öO\t¼vç\u0099\u001fãð\u007fe\n%Â\u0001o¦(oþ\u0089\u000b\u0017ü\u0019#oõLÅ¾ô¼\u00ad'æÐ]¼ðs\u0082B\u009dF©\u009dè¯CÊX\u0084ïU\\×ÃÄ1ó°ÍEí+xxô\f_4Û\u0093\u008fG^h\u00118Í#fsÐ:*½±\u00ad\u0099úéhÝk\u0088rO\u001aÂ\u008bÌ+2\u001am9\u00ad\u0088]ï\u0002V\u0012<\u001aqáCJU¿ò\u0001à\u001d´\u0090A\u0094Û-Ø u\u0007Ò=\rÀÇ\u0007\f\u008bwÃÓ\rGu¤k´\u0000g))üÓÙ\u0007~×9 Ñ\u009dGöÐ(¦âE\u0017Þy<DP*.eÓß]:ß\u0086íúuäôøã4KÜ;tûÎ¥\u0000Sf·Â\u0091<18ÒÚê\bb\u0090\u0091[úë\u008c8íãÛÍu9Õ\u0010óiè\u009dN\u0081XE^ñÅ_Ã22-º\n0\u008d\b\u008aT\u008c\u009cÏæÉ#ÝÂ\u001d8\u0017\u0096ÑÂò©\u008f_ÓÉ\u009eñpò\u0018ÜË¥.ò\u0016\u0016¾\u0089±â5òq\u008ey\u0083fìÅJ#\u0006\u0002\u0092C_¥³ºªAù\u008dì2;[\u009coE¨xî]\u0091:\u0093<EÉÃHÊZ,Ï@\u000eói®hÂö+\u0095ôýø¼êr\u0098Ès\u0082ÿªªA[¡\f7]\u0012\u007fí\u008eg\b\u000eg°òH+,\u00ad×ÿk\u0091\n1\u0091Òbé\u001fk(èC·\u000eFØõíæK~\u0004¥²\u008e¶YöÃu*X\u001d";
                  var4 = "\u0090ñ\u000b\u0003\u00978\u0004¥íÞÓä\\öÐúµUÏ\u0000y\u0019\u0013û\u001d\u008bû\u0087ÉÍË\u0090ÝÜIp\u0086T5»\u000e\u008cª\u001f¦33jû~AZ*Rà«ÇµÓÝ5\u0007Á\u0001¼Á\u000eÖ\u0088xØó> \u001eöÐ\u0085CB\u0096ý&\t($®Ö#\u0082\u0092ò?(Úó\u0003\u0088Þ0{°¼ÉÔ\u008a¹\u0016¥nÝ \u0002xY\u0003ux\u008c·îÎ²\u0087NÒp%\u0017Ë»{°Ù'\u0089\u0004¨Øã¹\u0011A\u001fÞ»-ÕÔ\u0080qmSÜ}ç\u0097ð¬\u0006·y\u008a6]\u0098³1ÎYáDe\u008akè\u001by1\u008bÑÝ©Â\u001f¡È\u0003ïÂ\u0090./3¡\u009fZ&C{\u001bêúÿ2ੀG7ñÛÈ#ïÆ\u0090²|i©GnÌb\u00935Ø&\u0002ø\u0098`çT\n8h{¦\u0090\u009c ;í\n\u0084þ\n\u0005;\nìk\u0012\u0098éçén\u0091x\u0083nv¦Ð4\u0083Þ\u0086y½Y\u008aÝ\tM\u0083ØVø2fnk½Õy\u0016\u008b;È\u008ez¯FËnb\u0080ë\\\u000eÓRÉ±i\u000b~!i\u0088@Ã%ÿù\t{^h¿û\u0086\u0091\u0003U\u0005¤5Þ\u00000mY\u0083¬Hv\u0098\u0007w¬YÛî\u001f¤Å.Z®:e\u0019\u0092\u001e®\u008d\u0010Ö~\u009fÐ\u0010qR\u009d\u0014ç\u00ad9¤Ñ\u001dFæß*\u0088§\u0080\u001etÍ9ñâ\u00971¯\n0;àöq¨Rµ3\u0090\u0080ºâjé\u0003º\u0005,§{\u0002Ú¶ó«;K\u0080\u0002ÂâØ*, î\u0082i\u000e\u009eè\u0016Â-Éã\\r\u001d\u000efi±h\bîj\u008düï\u008aÑ÷@\u001a\u0099lTà^P\u000e,»£®\u0090¾¦`éÜ\u0011^[*\u0099ÌU\u0097\\½-ñØ{'\u0088ÍÍ\u001bý\u0000óW&Ûvg¼Ñ¡rTíç¨Ø³h\u0080\u008di¢\u0091.Ó,\u000eDÒ¤7ê¼[ãaov1+Ùná\u0016Ùæ«Òÿ4\u009fr\u0007\u0090Z\"7Ç#ã\u0087¢;\u0099i$eé\rêä§xÐ¸\u0002Ið\fµÚìóâ6 \u008aoa\\\u001c\u0094\u0012n\u000b\u0005éa`\u0003ÄyÓ¾5µ¥ÇQ=ªÙ\u001d`ù¹Ä\u009fL¶\u00126$ð\u0099å \u0092ijfÜ\u008bàoF\u00973Z·\u000eÁ:j\u000bÜÉþ:I¦ìÐâR \u0005oð_M\u009d.\u0015XB\u0097ã:\u0011ðiÖì\b»\\\u0092íÆ¢Ä\u0000°ÈëV\u008f\u0001\u0097#\u0005\u0085'´\u009aÞ\n\u0092®ÄbË\u009fñUKQ-ø¢E¯7º5\u0098Ý\u008d÷\u007fÈ\u0005ï\u0083}\\É« d\u0094\u0010\u0003åOv%\u0090,¹ñ`[Ûa\u0083f\u0016<ßqíªu¨åêú\u008ak\u001dh\u0090\u0011A\u0016¡ifcP\u0085ÃÐîý\u0015~päSÒ\f+\u00996\u0080GØ³Uê@\u0097\u000b\u0007\u0081(\u0015Õê¥\u0014Ò\u0014DÑý½w*§Ùùò<ÈbÑÌîÑFt®÷Ö°\r\töu\u0089èéU+é\u0003æc\\»¼=ñR \u0019w¿õ\u000eBÞ\u001b\u008fá9\u0004n\u001cÀN\u001bÛ\u0087³Q£bÍ\u0006¼7\u0089÷D|@´Ci'åç\b\u001bª¡\u0084|®Ì³DlÛ~úE\u0004ã\u001c0NfÛ,³¥¦YÂ|\tÌÞß\u0012øÓùUÛfÊJÓ÷-?}\u0097¥\u0081V°¨³áó\\§p·Ý\u0016Î9\u0089kâÍ'\u00ad¬\u009c\" \u0017R`Í=B\f\u0098§\f\u0011ç¶âÊ)víÔñh\u0096kÑ\u0098×Ös£&Í\u008b±!\u0080wâmú½¤\u001fG¦\u009c/à\u00ad\u008d\u0099Ô0\fêDõ÷ö\u0082\u0091;bÝ\u001fÄ`>\u0013<\"FÐø\u0001ëÞÏÊ\u008eØVI1\u0087çbÒ\u0084bØÝ>ÀöBb¦Ð³Ôxë@µNe\u008cÓw\u007f\u001bõ=O\u008d!\ro0¡hTñiûh\u0007&{\u008a\u0004 4W<{{.§D5Ö\u008cq-e4áæ}ïI8È|\u0013w(\u0085ó\u0003N0XSB\u0007Î!N\u0000¤t\u0094µÿ2ñu~r{\n¡\rGô|\u0089\u0093kB]ª\r5Á\u0016°dmw&>ÃØ\u009f}$°¹J\u0007\u0097\u0006T#ö,ÁÇS\u0004ØÓný\b\"çØ\u0091Ò_Ì¥QÓú?I\u001c{ÊþT¹\u0089ÂÓ\u009d\u001dËëá74\u0013<1ý·¤£jzBo\u0016ÏÇ\\º»óæe\u0089X?M\u0081ªÌ¡e\u0086ÿ¥\u007fq\u0095Ì.s\u000f`\u0014FJ+\u0099 ,çã¬aË9V\u008cÓßë\u0012\u001c\"\u0091¢÷´\u0086½Kÿ\u0002KûY*º\u009b\u001aØ@Ú¸w¼\u0090Í\u0015Á\u0089¦k\b\u0083þ\u0012\u0005ú@{;a*N\t»yÂ\u0095DËµ\nýÆyµü\u009d9'ÑNGÎÖ?±\u0010\u0084\u001eåïy\u0084Áb_(å±ò\u00909obÓ£\u0011¡\u0080rp@=Hb¢6r\u001f¨\u0088à§B\u0005deöIO\"\u009f\u0094\u0005ÈV\u0090·WÈ\rruþðï#È<\u0002%!Òý¾Ô`*R{w\u0095¶ fJûeºÖ¶K_\få\u0014õ$>ý\u0082\u0005±Ë$ÊÚ\u000eqg\u0092\u000fÃ)\u0017H?E\"\u008f?ö\u001f=\u0088ô££\u0006Iñg¹\u0083Z/nb\u0098ºv+ÉxÏ7\u001cw\u008eÐÍµýNÕ\u0002`]â\u008f ÿY\u009ajÁ¹j\u0083\\Ë\u001a§\u0002_Á*fag_§z¸*wÓ\u000b¿á\u008ctoÔQz¶ï\fèc\u0018\u001d\u0019ýÒ\u0094\u0092\u000f\u0018pmn®þ3\u001a\u0085=øúT4^5\u0098ú\u0082\u0082\u001d\u0098§Á±gÓÈî\u0004Á\u009f\b\u000få$\u001dýë\u00050Ë\u0014ÈÑ\u000f³$$`\u0018 À\nÅ\u000bp\u0081Þ\u0016Ä\"þuÃ²Oy!5gT¢ñAq w«\u008a¶<\u0002Ò¾@ËüIíÏ\u001b\u0018\u0003\u0017ä3~\u0019ÓµQ_}\u0092í\u00adØbE\u0002\u00ad7¶m\u0018ì{d\u0090\u009a\"/Á-âîe\u0092bQ?Ím{z'µ¬\u0092\"O\u0017ü`44Ä\u001aü\u008eÿÃ\u001a°ÃÃ0ÂO>\u007fß¼H\u0012Á\u009dw/%.§\u0011\u0012ê¡\u008f|¬ÆóG}\u0089xèF{^s\u0098Y\u0091ã\n6Ý¨x\u0016Ò%\u0092f\u0085\u0084HÛo¯ö¦\u0006H\u001dåk\u0014¼Êª\u0016P\u0092\u0016\u0001÷¥tkÀñðó_l\rEAq\u0003\u001f7]©uøyÄg¼^\u0094!^'øJØõ*\f¥\u0018ìõ?Ó\u0091GÄ°n´¼°tî÷õYÎ\u0093\u0017×K+k\u009eÿý)\u0080êq=¼OR·¼Óì?e\u0001ÇÕIä?±\"n¢?:\u0089IÈey\u008cVqvØ{íÇÅ½#W\u000fÑTm\u0010\u0087\u0098O1\t\\\u0015b\u0016\u0019sDîþâ)/Ãt\u001føÔùñÊ\u008d\u0007åÉyæÉMWÊä\u000fÄó/ 19vj\u000bJ\f~¯\\ÎñgLL\u0018\u001cJ(ÌÄh°Åáâ\u0094)Ú\u001a\u00010À\u009a¹\u0089\u0000Öf\u0007Â\u0087>ó2\u009e\u0083ö\t\u0096\u009b\u0091\u0018ïµ®GS-Þ^Q\u001b\fuzÿ\u0007\rÈÚ\u0086\u0001.\u009eYíá\u009cÕ\u001cô|pX\u0095DÔÜ\u0099Pø\tÌØ¢\u0018\u0014Ô[Ð\rç¢¹\u0098W#\bÏf*\u00849ÛA¯3¦¶P\u001eý\u0094\u0011^°BÞ\u001a\u0099ßV,\u0094\u0089\u0097I°\u0019±¿D\u000e6Â¨Ô>â\u007f÷\u009c2aÚ\u009d¹½V`\u001fè\u009b¥ØÇ×\nfô,\u0014¢W^Y\u009c\u007fÄ©M}\u0013á\u0004I\u0083âº_¢\u0012\u0085\u001aF¸I\u009evíÊh\u001c°x\u008bCàÀx\u001b»\u0086ÑPEBÔ\u0007ñ¸\u0091Qù$ìÑ¨|\u009fô\u008c \u008dN\u0091¼ß¥¹zÂà9Æþ>¹:9\u0001E#Ù\u0081þ°¡^i\u0081FÅyë0¶é\u0090\u0097tB\u0097u\u0004öv|£ùIÉqÓÜÉã%TùaS²I\u009b2½¾\u0000\u001aÁ\u009a×8'¥«Ú{£7$RÚðfâ\u0087\u00992L\u0003ý\u0096Ì7\bìwe\u000bÇõZ³,.Q\u0018£\u0096É\b¢â2\f[ß~Õd\u0082ÄÁ´X\u0095>FÜgü&\u00918gûõ!,\nMpó¡\u001e\u0087F5\u0017A~g\u0006âV\u0017\u0002)\u0081_\u0000ùíú4+Îu\u0083\u001b\u008bË <*`#Ñj]*¨\u0091ó÷\u009d\u0086ûK7\u0002Qõy%¾X\u0099ÃR¹Ø\u0019Ó\u0013 ë{5\u0017ü\u0019d\u0006\\\u0085\u0091Kå36Cí\u0005ô\u0087\u0014\u0086P\u0098TD\u0093Àî1\n\u009c\tõ\u0090½\u009b|pS÷¾ý¸h\bZS\u0002öO\t¼vç\u0099\u001fãð\u007fe\n%Â\u0001o¦(oþ\u0089\u000b\u0017ü\u0019#oõLÅ¾ô¼\u00ad'æÐ]¼ðs\u0082B\u009dF©\u009dè¯CÊX\u0084ïU\\×ÃÄ1ó°ÍEí+xxô\f_4Û\u0093\u008fG^h\u00118Í#fsÐ:*½±\u00ad\u0099úéhÝk\u0088rO\u001aÂ\u008bÌ+2\u001am9\u00ad\u0088]ï\u0002V\u0012<\u001aqáCJU¿ò\u0001à\u001d´\u0090A\u0094Û-Ø u\u0007Ò=\rÀÇ\u0007\f\u008bwÃÓ\rGu¤k´\u0000g))üÓÙ\u0007~×9 Ñ\u009dGöÐ(¦âE\u0017Þy<DP*.eÓß]:ß\u0086íúuäôøã4KÜ;tûÎ¥\u0000Sf·Â\u0091<18ÒÚê\bb\u0090\u0091[úë\u008c8íãÛÍu9Õ\u0010óiè\u009dN\u0081XE^ñÅ_Ã22-º\n0\u008d\b\u008aT\u008c\u009cÏæÉ#ÝÂ\u001d8\u0017\u0096ÑÂò©\u008f_ÓÉ\u009eñpò\u0018ÜË¥.ò\u0016\u0016¾\u0089±â5òq\u008ey\u0083fìÅJ#\u0006\u0002\u0092C_¥³ºªAù\u008dì2;[\u009coE¨xî]\u0091:\u0093<EÉÃHÊZ,Ï@\u000eói®hÂö+\u0095ôýø¼êr\u0098Ès\u0082ÿªªA[¡\f7]\u0012\u007fí\u008eg\b\u000eg°òH+,\u00ad×ÿk\u0091\n1\u0091Òbé\u001fk(èC·\u000eFØõíæK~\u0004¥²\u008e¶YöÃu*X\u001d"
                     .length();
                  var1 = 205;
                  var8 = -1;
            }

            var10000 = 80;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String g(int var0, int var1) {
      int var2 = (var0 ^ 10007) & 65535;
      if (f[var2] == null) {
         char[] var3 = e[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 237;
            case 1 -> 253;
            case 2 -> 36;
            case 3 -> 30;
            case 4 -> 111;
            case 5 -> 73;
            case 6 -> 140;
            case 7 -> 191;
            case 8 -> 123;
            case 9 -> 181;
            case 10 -> 155;
            case 11 -> 203;
            case 12 -> 153;
            case 13 -> 184;
            case 14 -> 18;
            case 15 -> 161;
            case 16 -> 7;
            case 17 -> 94;
            case 18 -> 250;
            case 19 -> 126;
            case 20 -> 205;
            case 21 -> 245;
            case 22 -> 136;
            case 23 -> 180;
            case 24 -> 79;
            case 25 -> 16;
            case 26 -> 248;
            case 27 -> 225;
            case 28 -> 112;
            case 29 -> 202;
            case 30 -> 254;
            case 31 -> 64;
            case 32 -> 127;
            case 33 -> 55;
            case 34 -> 142;
            case 35 -> 194;
            case 36 -> 120;
            case 37 -> 210;
            case 38 -> 40;
            case 39 -> 44;
            case 40 -> 48;
            case 41 -> 234;
            case 42 -> 54;
            case 43 -> 107;
            case 44 -> 162;
            case 45 -> 133;
            case 46 -> 137;
            case 47 -> 19;
            case 48 -> 152;
            case 49 -> 228;
            case 50 -> 5;
            case 51 -> 60;
            case 52 -> 164;
            case 53 -> 128;
            case 54 -> 251;
            case 55 -> 74;
            case 56 -> 150;
            case 57 -> 113;
            case 58 -> 118;
            case 59 -> 39;
            case 60 -> 226;
            case 61 -> 21;
            case 62 -> 8;
            case 63 -> 193;
            case 64 -> 88;
            case 65 -> 217;
            case 66 -> 109;
            case 67 -> 189;
            case 68 -> 11;
            case 69 -> 98;
            case 70 -> 183;
            case 71 -> 105;
            case 72 -> 174;
            case 73 -> 33;
            case 74 -> 195;
            case 75 -> 110;
            case 76 -> 70;
            case 77 -> 13;
            case 78 -> 80;
            case 79 -> 207;
            case 80 -> 93;
            case 81 -> 214;
            case 82 -> 166;
            case 83 -> 163;
            case 84 -> 125;
            case 85 -> 223;
            case 86 -> 227;
            case 87 -> 146;
            case 88 -> 103;
            case 89 -> 57;
            case 90 -> 102;
            case 91 -> 130;
            case 92 -> 177;
            case 93 -> 101;
            case 94 -> 92;
            case 95 -> 243;
            case 96 -> 141;
            case 97 -> 252;
            case 98 -> 188;
            case 99 -> 157;
            case 100 -> 106;
            case 101 -> 219;
            case 102 -> 52;
            case 103 -> 77;
            case 104 -> 216;
            case 105 -> 206;
            case 106 -> 20;
            case 107 -> 89;
            case 108 -> 239;
            case 109 -> 47;
            case 110 -> 249;
            case 111 -> 45;
            case 112 -> 51;
            case 113 -> 255;
            case 114 -> 235;
            case 115 -> 204;
            case 116 -> 82;
            case 117 -> 215;
            case 118 -> 28;
            case 119 -> 58;
            case 120 -> 192;
            case 121 -> 230;
            case 122 -> 213;
            case 123 -> 149;
            case 124 -> 50;
            case 125 -> 208;
            case 126 -> 15;
            case 127 -> 27;
            case 128 -> 90;
            case 129 -> 23;
            case 130 -> 168;
            case 131 -> 232;
            case 132 -> 246;
            case 133 -> 156;
            case 134 -> 154;
            case 135 -> 75;
            case 136 -> 236;
            case 137 -> 200;
            case 138 -> 22;
            case 139 -> 104;
            case 140 -> 56;
            case 141 -> 43;
            case 142 -> 14;
            case 143 -> 172;
            case 144 -> 9;
            case 145 -> 148;
            case 146 -> 99;
            case 147 -> 134;
            case 148 -> 182;
            case 149 -> 231;
            case 150 -> 96;
            case 151 -> 165;
            case 152 -> 76;
            case 153 -> 197;
            case 154 -> 187;
            case 155 -> 17;
            case 156 -> 242;
            case 157 -> 83;
            case 158 -> 116;
            case 159 -> 238;
            case 160 -> 220;
            case 161 -> 84;
            case 162 -> 71;
            case 163 -> 29;
            case 164 -> 138;
            case 165 -> 199;
            case 166 -> 25;
            case 167 -> 159;
            case 168 -> 2;
            case 169 -> 65;
            case 170 -> 87;
            case 171 -> 135;
            case 172 -> 86;
            case 173 -> 171;
            case 174 -> 178;
            case 175 -> 53;
            case 176 -> 49;
            case 177 -> 173;
            case 178 -> 233;
            case 179 -> 170;
            case 180 -> 143;
            case 181 -> 175;
            case 182 -> 132;
            case 183 -> 209;
            case 184 -> 35;
            case 185 -> 240;
            case 186 -> 201;
            case 187 -> 211;
            case 188 -> 117;
            case 189 -> 4;
            case 190 -> 114;
            case 191 -> 0;
            case 192 -> 115;
            case 193 -> 78;
            case 194 -> 144;
            case 195 -> 10;
            case 196 -> 169;
            case 197 -> 176;
            case 198 -> 31;
            case 199 -> 3;
            case 200 -> 59;
            case 201 -> 46;
            case 202 -> 6;
            case 203 -> 72;
            case 204 -> 12;
            case 205 -> 42;
            case 206 -> 95;
            case 207 -> 121;
            case 208 -> 167;
            case 209 -> 212;
            case 210 -> 34;
            case 211 -> 186;
            case 212 -> 218;
            case 213 -> 38;
            case 214 -> 224;
            case 215 -> 97;
            case 216 -> 160;
            case 217 -> 62;
            case 218 -> 1;
            case 219 -> 67;
            case 220 -> 147;
            case 221 -> 68;
            case 222 -> 247;
            case 223 -> 129;
            case 224 -> 139;
            case 225 -> 81;
            case 226 -> 26;
            case 227 -> 190;
            case 228 -> 32;
            case 229 -> 85;
            case 230 -> 91;
            case 231 -> 119;
            case 232 -> 151;
            case 233 -> 179;
            case 234 -> 24;
            case 235 -> 229;
            case 236 -> 122;
            case 237 -> 131;
            case 238 -> 41;
            case 239 -> 196;
            case 240 -> 241;
            case 241 -> 63;
            case 242 -> 61;
            case 243 -> 69;
            case 244 -> 222;
            case 245 -> 145;
            case 246 -> 100;
            case 247 -> 108;
            case 248 -> 37;
            case 249 -> 66;
            case 250 -> 198;
            case 251 -> 244;
            case 252 -> 185;
            case 253 -> 124;
            case 254 -> 221;
            default -> 158;
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

   private static enum llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII };

      public static lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] a() {
         return (lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      }

      public static lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         String var0
      ) {
         return Enum.valueOf(
            lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> b() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = kotlin.enums.EnumEntriesKt.enumEntries(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   
  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] c() { return new me.octo.client.lIIlllIlIlllllIlIllIllIIIIlllllIlIIllIllIlllIIIIlIIIIIlllllIlIIIIIIlIIIIIIllIlIllIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII }; }
}
}
