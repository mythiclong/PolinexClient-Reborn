package me.octo.client;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll {
   @NotNull
   public static llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static Minecraft lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;

   // PX-FIX TOP5F: jar public static final net.minecraft.client.Minecraft m() { return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl; }
   public static final net.minecraft.client.Minecraft m() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }
   private static int[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] a;
   private static String[] b;

   public llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll(float var1, float var2) {
      float var24 = 0; // PX-FIX
      float var22 = 0; // PX-FIX
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      int[] var3 = n();
      Minecraft var10000 = Minecraft.getInstance();
      short var10002 = 9170;
      short var10003 = -13955;
      Intrinsics.checkNotNullExpressionValue(var10000, "getInstance(...)");
      Minecraft var4 = var10000;
      short var15 = 9169;
      short var10001 = -10129;
      String var16 = System.getProperty("os.name");
      var10002 = 9168;
      var10003 = 22344;
      Intrinsics.checkNotNullExpressionValue(var16, "getProperty(...)");
      String var17 = var16.toLowerCase(Locale.ROOT);
      var10002 = 9174;
      var10003 = 10472;
      Intrinsics.checkNotNullExpressionValue(var17, "toLowerCase(...)");
      CharSequence var18 = var17;
      var10001 = 9175;
      var10002 = 7581;
      byte var5 = ((byte)((StringsKt.contains(var18, "mac", false)) ? 1 : 0));
      int var19 = var5;
      if (var3 == null) {
         var19 = var5 != 0 ? var4.getWindow().getScreenWidth() : var4.getWindow().getWidth();
      }

      int var6 = var19;
      int var20 = var5;
      if (var3 == null) {
         var20 = var5 != 0 ? var4.getWindow().getScreenHeight() : var4.getWindow().getHeight();
      }

      float var8;
      float var9;
      float var12;
      label38: {
         int var7 = var20;
         var8 = var6 / 2.0F;
         var9 = var7 / 2.0F;
         float var10 = 40.0F;
         float var11 = var6 - var10;
         var12 = var7 - var10;
         float var21 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         float var26 = var11;
         if (var3 == null) {
            if (!(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII > var11)) {
               var22 = 1.0F;
               break label38;
            }

            var21 = var11;
            var26 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         var22 = var21 / var26;
      }

      float var13;
      label32: {
         var13 = var22;
         float var23 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         float var27 = var12;
         if (var3 == null) {
            if (!(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl > var12)) {
               var24 = 1.0F;
               break label32;
            }

            var23 = var12;
            var27 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         var24 = var23 / var27;
      }

      float var14 = var24;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Math.min(var13, Math.min(var14, 1.0F));
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var8
         - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / 2.0F;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9
         - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / 2.0F;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var8
         + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII / 2.0F;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var9
         + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl / 2.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var8;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
   }

   public final float a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final float b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final float c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void a(float var1) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   public final float d() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final void b(float var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   public final float e() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final void c(float var1) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   public final float f() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void d(float var1) {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   public final float g() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final void e(float var1) {
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
   }

   public final float h() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final void f(float var1) {
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var1;
   }

   public final float i() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void g(float var1) {
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   public final float j() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final void h(float var1) {
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
   }

   public final float k() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final float l() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
   }

   public final int a(int var1) {
      return var1;
   }

   public final int b(int var1) {
      return var1;
   }

   public final boolean a(float var1, float var2) {
      int[] var3;
      int var5;
      label41: {
         int[] var10000 = n();
         float var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         var3 = var10000;
         float var7;
         var5 = (var7 = var1 - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
         if (var3 == null) {
            if (var5 > 0) {
               var5 = 0;
               break label41;
            }

            float var8;
            var5 = (var8 = var4 - var1) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
         }

         if (var3 == null) {
            var5 = var5 <= 0 ? 1 : 0;
         }
      }

      if (var5 != 0) {
         float var9;
         var5 = (var9 = var2 - this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
         if (var3 == null) {
            if (var5 < 0) {
               return (0 != 0);
            }

            float var10;
            var5 = (var10 = var2 - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) == 0.0F
               ? 0
               : (var10 < 0.0F ? -1 : 1);
         }

         if (var3 != null) {
            return (var5 != 0);
         }

         if (var5 <= 0) {
            return (1 != 0);
         }
      }

      return (0 != 0);
   }

   @NotNull
   public final llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll a(float var1, float var2, float var3, float var4) {
      llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll var5 = new llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      boolean var7 = false;
      var5.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
      var5.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var2;
      var5.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var3;
      var5.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var4;
      var5.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3 - var1;
      var5.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var4 - var2;
      var5.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = (var1 + var3) / 2.0F;
      var5.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = (var2 + var4) / 2.0F;
      return var5;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "¦Ò]~ßùLÔmÂÏ\u009f;\u00905 \u0010Mm \u0089p\u0007¹\u000bÓ9\u0018àÁ\u007fj]\u0007Æ\u001d\u0002t*e\r\u0010\u0014g\u000bÑ\t*\r5ÝmZ\u009f\u0016\u0090\u0090 ";
      int var4 = "¦Ò]~ßùLÔmÂÏ\u009f;\u00905 \u0010Mm \u0089p\u0007¹\u000bÓ9\u0018àÁ\u007fj]\u0007Æ\u001d\u0002t*e\r\u0010\u0014g\u000bÑ\t*\r5ÝmZ\u009f\u0016\u0090\u0090 "
         .length();
      b(null);
      char var1 = 16;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 82;
         String var10001 = var2.substring(++var8, var8 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var35;
               char[] var39;
               int var10006;
               if (var10004 <= 1) {
                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var39 = var26;
                  var35 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var39[var10006] = (char)(var39[var10006] ^ var35 ^ switch (var6 % 7) {
                     case 0 -> 73;
                     case 1 -> 39;
                     case 2 -> 71;
                     case 3 -> 88;
                     case 4 -> 16;
                     case 5 -> 54;
                     default -> 122;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var39 = var21;
                     var35 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var39 = var21;
                     var35 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[6];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     Minecraft var10 = Minecraft.getInstance();
                     var10002 = 9171;
                     short var32 = -31845;
                     Intrinsics.checkNotNullExpressionValue(var10, "getInstance(...)");
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var10;
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\\¾%\u0010ÛnÀÿ1FÖ®\u008c\u0080f¾uÏ\u00870";
                  var4 = "\\¾%\u0010ÛnÀÿ1FÖ®\u008c\u0080f¾uÏ\u00870".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 3;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(int[] var0) {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var0;
   }

   public static int[] n() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 9171) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 186;
            case 1 -> 133;
            case 2 -> 108;
            case 3 -> 172;
            case 4 -> 134;
            case 5 -> 131;
            case 6 -> 195;
            case 7 -> 136;
            case 8 -> 194;
            case 9 -> 37;
            case 10 -> 232;
            case 11 -> 105;
            case 12 -> 63;
            case 13 -> 228;
            case 14 -> 70;
            case 15 -> 224;
            case 16 -> 207;
            case 17 -> 59;
            case 18 -> 140;
            case 19 -> 222;
            case 20 -> 217;
            case 21 -> 16;
            case 22 -> 34;
            case 23 -> 122;
            case 24 -> 83;
            case 25 -> 191;
            case 26 -> 202;
            case 27 -> 94;
            case 28 -> 251;
            case 29 -> 129;
            case 30 -> 82;
            case 31 -> 184;
            case 32 -> 240;
            case 33 -> 78;
            case 34 -> 6;
            case 35 -> 166;
            case 36 -> 161;
            case 37 -> 220;
            case 38 -> 162;
            case 39 -> 226;
            case 40 -> 139;
            case 41 -> 177;
            case 42 -> 244;
            case 43 -> 219;
            case 44 -> 176;
            case 45 -> 158;
            case 46 -> 27;
            case 47 -> 80;
            case 48 -> 175;
            case 49 -> 254;
            case 50 -> 29;
            case 51 -> 234;
            case 52 -> 253;
            case 53 -> 154;
            case 54 -> 60;
            case 55 -> 255;
            case 56 -> 42;
            case 57 -> 182;
            case 58 -> 96;
            case 59 -> 225;
            case 60 -> 137;
            case 61 -> 33;
            case 62 -> 4;
            case 63 -> 111;
            case 64 -> 147;
            case 65 -> 148;
            case 66 -> 74;
            case 67 -> 12;
            case 68 -> 30;
            case 69 -> 199;
            case 70 -> 165;
            case 71 -> 143;
            case 72 -> 250;
            case 73 -> 52;
            case 74 -> 98;
            case 75 -> 9;
            case 76 -> 71;
            case 77 -> 49;
            case 78 -> 203;
            case 79 -> 144;
            case 80 -> 159;
            case 81 -> 201;
            case 82 -> 26;
            case 83 -> 245;
            case 84 -> 200;
            case 85 -> 236;
            case 86 -> 76;
            case 87 -> 218;
            case 88 -> 53;
            case 89 -> 210;
            case 90 -> 97;
            case 91 -> 181;
            case 92 -> 112;
            case 93 -> 205;
            case 94 -> 93;
            case 95 -> 153;
            case 96 -> 109;
            case 97 -> 123;
            case 98 -> 69;
            case 99 -> 121;
            case 100 -> 10;
            case 101 -> 99;
            case 102 -> 36;
            case 103 -> 208;
            case 104 -> 67;
            case 105 -> 213;
            case 106 -> 235;
            case 107 -> 173;
            case 108 -> 146;
            case 109 -> 91;
            case 110 -> 57;
            case 111 -> 192;
            case 112 -> 61;
            case 113 -> 65;
            case 114 -> 142;
            case 115 -> 198;
            case 116 -> 128;
            case 117 -> 169;
            case 118 -> 215;
            case 119 -> 81;
            case 120 -> 126;
            case 121 -> 39;
            case 122 -> 18;
            case 123 -> 43;
            case 124 -> 124;
            case 125 -> 1;
            case 126 -> 38;
            case 127 -> 104;
            case 128 -> 106;
            case 129 -> 87;
            case 130 -> 119;
            case 131 -> 101;
            case 132 -> 187;
            case 133 -> 17;
            case 134 -> 196;
            case 135 -> 206;
            case 136 -> 23;
            case 137 -> 164;
            case 138 -> 28;
            case 139 -> 116;
            case 140 -> 185;
            case 141 -> 246;
            case 142 -> 221;
            case 143 -> 102;
            case 144 -> 141;
            case 145 -> 3;
            case 146 -> 174;
            case 147 -> 110;
            case 148 -> 204;
            case 149 -> 7;
            case 150 -> 233;
            case 151 -> 248;
            case 152 -> 151;
            case 153 -> 190;
            case 154 -> 5;
            case 155 -> 115;
            case 156 -> 84;
            case 157 -> 113;
            case 158 -> 227;
            case 159 -> 237;
            case 160 -> 214;
            case 161 -> 72;
            case 162 -> 58;
            case 163 -> 55;
            case 164 -> 62;
            case 165 -> 13;
            case 166 -> 170;
            case 167 -> 163;
            case 168 -> 135;
            case 169 -> 160;
            case 170 -> 40;
            case 171 -> 167;
            case 172 -> 118;
            case 173 -> 47;
            case 174 -> 32;
            case 175 -> 183;
            case 176 -> 155;
            case 177 -> 120;
            case 178 -> 157;
            case 179 -> 15;
            case 180 -> 252;
            case 181 -> 239;
            case 182 -> 0;
            case 183 -> 44;
            case 184 -> 51;
            case 185 -> 156;
            case 186 -> 103;
            case 187 -> 180;
            case 188 -> 242;
            case 189 -> 193;
            case 190 -> 114;
            case 191 -> 56;
            case 192 -> 8;
            case 193 -> 150;
            case 194 -> 149;
            case 195 -> 230;
            case 196 -> 22;
            case 197 -> 90;
            case 198 -> 243;
            case 199 -> 216;
            case 200 -> 19;
            case 201 -> 92;
            case 202 -> 2;
            case 203 -> 64;
            case 204 -> 68;
            case 205 -> 85;
            case 206 -> 66;
            case 207 -> 11;
            case 208 -> 14;
            case 209 -> 238;
            case 210 -> 31;
            case 211 -> 231;
            case 212 -> 117;
            case 213 -> 75;
            case 214 -> 188;
            case 215 -> 48;
            case 216 -> 179;
            case 217 -> 127;
            case 218 -> 107;
            case 219 -> 168;
            case 220 -> 138;
            case 221 -> 189;
            case 222 -> 79;
            case 223 -> 145;
            case 224 -> 100;
            case 225 -> 89;
            case 226 -> 132;
            case 227 -> 241;
            case 228 -> 46;
            case 229 -> 223;
            case 230 -> 77;
            case 231 -> 73;
            case 232 -> 45;
            case 233 -> 88;
            case 234 -> 35;
            case 235 -> 209;
            case 236 -> 247;
            case 237 -> 20;
            case 238 -> 197;
            case 239 -> 130;
            case 240 -> 211;
            case 241 -> 212;
            case 242 -> 25;
            case 243 -> 95;
            case 244 -> 171;
            case 245 -> 24;
            case 246 -> 249;
            case 247 -> 229;
            case 248 -> 41;
            case 249 -> 178;
            case 250 -> 54;
            case 251 -> 125;
            case 252 -> 152;
            case 253 -> 50;
            case 254 -> 86;
            default -> 21;
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
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

    // PX-FIX TOP5F: Kotlin synthetic no-arg marker ctor (jar: <init>(DefaultConstructorMarker))
    public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker marker) {
        this();
    }

      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      public final float a() {
         return llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .getWindow()
            .getGuiScale();
      }

      public final float b() {
         int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         short var10001 = 21640;
         short var10002 = -25122;
         String var8 = System.getProperty("os.name");
         short var10003 = 21641;
         short var10004 = 16206;
         Intrinsics.checkNotNullExpressionValue(var8, "getProperty(...)");
         String var9 = var8.toLowerCase(Locale.ROOT);
         var10003 = 21642;
         var10004 = 32382;
         Intrinsics.checkNotNullExpressionValue(var9, "toLowerCase(...)");
         CharSequence var10 = var9;
         var10002 = 21644;
         var10003 = -31814;
         byte var2 = ((byte)((StringsKt.contains(var10, "mac", false)) ? 1 : 0));
         int[] var1 = var10000;
         double var3 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .mouseHandler
            .xpos();
         int var6 = var2;
         if (var1 == null) {
            if (var2 == 0) {
               return (float)(
                  var3
                     * llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                        .getWindow()
                        .getGuiScale()
               );
            }

            var6 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               .getWindow()
               .getScreenWidth();
         }

         int var5 = var6;
         return (float)(
            var3
               * var5
               * llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  .getWindow()
                  .getGuiScale()
               / llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  .getWindow()
                  .getWidth()
         );
      }

      public final float c() {
         int[] var10000 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.n();
         short var10001 = 21643;
         short var10002 = 6084;
         String var8 = System.getProperty("os.name");
         short var10003 = 21646;
         short var10004 = -21860;
         Intrinsics.checkNotNullExpressionValue(var8, "getProperty(...)");
         String var9 = var8.toLowerCase(Locale.ROOT);
         var10003 = 21645;
         var10004 = -21181;
         Intrinsics.checkNotNullExpressionValue(var9, "toLowerCase(...)");
         CharSequence var10 = var9;
         var10002 = 21647;
         var10003 = -25103;
         byte var2 = ((byte)((StringsKt.contains(var10, "mac", false)) ? 1 : 0));
         int[] var1 = var10000;
         double var3 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
            .mouseHandler
            .ypos();
         int var6 = var2;
         if (var1 == null) {
            if (var2 == 0) {
               return (float)(
                  var3
                     * llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                        .getWindow()
                        .getGuiScale()
               );
            }

            var6 = llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               .getWindow()
               .getScreenHeight();
         }

         int var5 = var6;
         return (float)(
            var3
               * var5
               * llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  .getWindow()
                  .getGuiScale()
               / llIlllIIIIIlllIIlIllllIIlIllIllIIllllIIllllllIIIllIIlIIllIllIIlIlllllllIIIlIlIIIlIlll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  .getWindow()
                  .getHeight()
         );
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[8];
         int var3 = 0;
         String var2 = "W4\u0089¢qçp\u00100ý6q\u0084fªºT%\u0098¼\u0016â\u0096\u0093\u0010)\u000e\\{óõã¥,#ú\u009bÅ\u0006ì\u000f\u0007ÿ\u0000\u009c$Ó7$\u0003]$Ç\u0010«ö\fdù\u0016¢Ù\u0004¬ÿje8øÈ";
         int var4 = "W4\u0089¢qçp\u00100ý6q\u0084fªºT%\u0098¼\u0016â\u0096\u0093\u0010)\u000e\\{óõã¥,#ú\u009bÅ\u0006ì\u000f\u0007ÿ\u0000\u009c$Ó7$\u0003]$Ç\u0010«ö\fdù\u0016¢Ù\u0004¬ÿje8øÈ"
            .length();
         char var1 = 7;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 43;
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
                        case 0 -> 125;
                        case 1 -> 65;
                        case 2 -> 46;
                        case 3 -> 49;
                        case 4 -> 65;
                        case 5 -> 21;
                        default -> 16;
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
                        break pxClinit; // PX-FIX
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "¸°ù\u0006£V\u0090bÍàuÚuð$\u000f\u0003Û?É";
                     var4 = "¸°ù\u0006£V\u0090bÍàuÚuð$\u000f\u0003Û?É".length();
                     var1 = 16;
                     var8 = -1;
               }

               var10000 = 127;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 21640) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 14;
               case 1 -> 112;
               case 2 -> 63;
               case 3 -> 225;
               case 4 -> 5;
               case 5 -> 196;
               case 6 -> 90;
               case 7 -> 214;
               case 8 -> 54;
               case 9 -> 26;
               case 10 -> 212;
               case 11 -> 84;
               case 12 -> 98;
               case 13 -> 180;
               case 14 -> 237;
               case 15 -> 173;
               case 16 -> 85;
               case 17 -> 20;
               case 18 -> 247;
               case 19 -> 82;
               case 20 -> 32;
               case 21 -> 211;
               case 22 -> 131;
               case 23 -> 59;
               case 24 -> 213;
               case 25 -> 67;
               case 26 -> 21;
               case 27 -> 210;
               case 28 -> 187;
               case 29 -> 189;
               case 30 -> 150;
               case 31 -> 161;
               case 32 -> 7;
               case 33 -> 42;
               case 34 -> 64;
               case 35 -> 199;
               case 36 -> 219;
               case 37 -> 233;
               case 38 -> 96;
               case 39 -> 198;
               case 40 -> 114;
               case 41 -> 3;
               case 42 -> 83;
               case 43 -> 157;
               case 44 -> 73;
               case 45 -> 13;
               case 46 -> 170;
               case 47 -> 95;
               case 48 -> 250;
               case 49 -> 185;
               case 50 -> 41;
               case 51 -> 75;
               case 52 -> 22;
               case 53 -> 209;
               case 54 -> 18;
               case 55 -> 146;
               case 56 -> 165;
               case 57 -> 241;
               case 58 -> 221;
               case 59 -> 45;
               case 60 -> 38;
               case 61 -> 217;
               case 62 -> 118;
               case 63 -> 195;
               case 64 -> 111;
               case 65 -> 251;
               case 66 -> 234;
               case 67 -> 188;
               case 68 -> 65;
               case 69 -> 121;
               case 70 -> 172;
               case 71 -> 60;
               case 72 -> 255;
               case 73 -> 49;
               case 74 -> 148;
               case 75 -> 149;
               case 76 -> 153;
               case 77 -> 135;
               case 78 -> 242;
               case 79 -> 144;
               case 80 -> 79;
               case 81 -> 125;
               case 82 -> 218;
               case 83 -> 36;
               case 84 -> 69;
               case 85 -> 178;
               case 86 -> 163;
               case 87 -> 100;
               case 88 -> 51;
               case 89 -> 194;
               case 90 -> 205;
               case 91 -> 183;
               case 92 -> 6;
               case 93 -> 154;
               case 94 -> 104;
               case 95 -> 57;
               case 96 -> 204;
               case 97 -> 0;
               case 98 -> 4;
               case 99 -> 223;
               case 100 -> 220;
               case 101 -> 15;
               case 102 -> 77;
               case 103 -> 62;
               case 104 -> 238;
               case 105 -> 46;
               case 106 -> 151;
               case 107 -> 55;
               case 108 -> 166;
               case 109 -> 208;
               case 110 -> 202;
               case 111 -> 222;
               case 112 -> 33;
               case 113 -> 158;
               case 114 -> 25;
               case 115 -> 105;
               case 116 -> 97;
               case 117 -> 107;
               case 118 -> 29;
               case 119 -> 226;
               case 120 -> 88;
               case 121 -> 87;
               case 122 -> 133;
               case 123 -> 181;
               case 124 -> 78;
               case 125 -> 227;
               case 126 -> 94;
               case 127 -> 115;
               case 128 -> 17;
               case 129 -> 34;
               case 130 -> 252;
               case 131 -> 130;
               case 132 -> 164;
               case 133 -> 126;
               case 134 -> 1;
               case 135 -> 47;
               case 136 -> 224;
               case 137 -> 113;
               case 138 -> 184;
               case 139 -> 229;
               case 140 -> 176;
               case 141 -> 110;
               case 142 -> 207;
               case 143 -> 116;
               case 144 -> 136;
               case 145 -> 235;
               case 146 -> 171;
               case 147 -> 2;
               case 148 -> 155;
               case 149 -> 74;
               case 150 -> 86;
               case 151 -> 140;
               case 152 -> 162;
               case 153 -> 56;
               case 154 -> 137;
               case 155 -> 236;
               case 156 -> 72;
               case 157 -> 58;
               case 158 -> 132;
               case 159 -> 215;
               case 160 -> 167;
               case 161 -> 168;
               case 162 -> 192;
               case 163 -> 122;
               case 164 -> 70;
               case 165 -> 248;
               case 166 -> 91;
               case 167 -> 68;
               case 168 -> 117;
               case 169 -> 254;
               case 170 -> 200;
               case 171 -> 109;
               case 172 -> 103;
               case 173 -> 239;
               case 174 -> 119;
               case 175 -> 124;
               case 176 -> 142;
               case 177 -> 190;
               case 178 -> 143;
               case 179 -> 35;
               case 180 -> 52;
               case 181 -> 253;
               case 182 -> 106;
               case 183 -> 147;
               case 184 -> 24;
               case 185 -> 203;
               case 186 -> 191;
               case 187 -> 232;
               case 188 -> 50;
               case 189 -> 66;
               case 190 -> 30;
               case 191 -> 39;
               case 192 -> 244;
               case 193 -> 89;
               case 194 -> 92;
               case 195 -> 43;
               case 196 -> 138;
               case 197 -> 156;
               case 198 -> 127;
               case 199 -> 141;
               case 200 -> 240;
               case 201 -> 193;
               case 202 -> 169;
               case 203 -> 120;
               case 204 -> 37;
               case 205 -> 179;
               case 206 -> 249;
               case 207 -> 152;
               case 208 -> 175;
               case 209 -> 177;
               case 210 -> 23;
               case 211 -> 81;
               case 212 -> 27;
               case 213 -> 99;
               case 214 -> 139;
               case 215 -> 160;
               case 216 -> 228;
               case 217 -> 61;
               case 218 -> 174;
               case 219 -> 31;
               case 220 -> 134;
               case 221 -> 108;
               case 222 -> 40;
               case 223 -> 101;
               case 224 -> 48;
               case 225 -> 76;
               case 226 -> 159;
               case 227 -> 206;
               case 228 -> 44;
               case 229 -> 71;
               case 230 -> 12;
               case 231 -> 11;
               case 232 -> 182;
               case 233 -> 245;
               case 234 -> 9;
               case 235 -> 216;
               case 236 -> 102;
               case 237 -> 93;
               case 238 -> 246;
               case 239 -> 19;
               case 240 -> 129;
               case 241 -> 80;
               case 242 -> 16;
               case 243 -> 123;
               case 244 -> 243;
               case 245 -> 145;
               case 246 -> 10;
               case 247 -> 28;
               case 248 -> 231;
               case 249 -> 128;
               case 250 -> 201;
               case 251 -> 197;
               case 252 -> 53;
               case 253 -> 186;
               case 254 -> 230;
               default -> 8;
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
}
