package me.octo.client;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public abstract class lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII {
   @NotNull
   public final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   public final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   public final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   public float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] a;
   private static String[] b;

   public lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII(float var1, float var2, float var3) {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = 32377;
      short var10004 = 30855;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      boolean var10000 = w();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var3;
      boolean var4 = var10000;
      float[] var5 = IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .get(this.m());
      if (var4) {
         if (var5 != null) {
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5[0];
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var5[1];
            this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var5[2];
         }

         IlIllIIlIIIIllIIlIlIIIIIlIllllIIllIlIlIIllIlllIIlIlIllllIIIIlIllIlIIlllIIllllIIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b()
            .add(this);
      }
   }

   @NotNull
   protected final Minecraft a() {
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

   public final void a(float var1) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
   }

   public final float f() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final void b(float var1) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   public final float g() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void c(float var1) {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var1;
   }

   public final void a(float var1, float var2) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   public final void h() {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = RangesKt.coerceAtMost(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + 0.1F, 3.0F
      );
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   public final void i() {
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = RangesKt.coerceAtLeast(
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll - 0.1F, 0.5F
      );
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   public final void j() {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   public final int k() {
      int var10000 = ((x()) ? 1 : 0);
      short var10001 = 32369;
      short var10002 = -5746;
      String var7 = System.getProperty("os.name");
      short var10003 = 32376;
      short var10004 = 13366;
      Intrinsics.checkNotNullExpressionValue(var7, "getProperty(...)");
      String var8 = var7.toLowerCase(Locale.ROOT);
      var10003 = 32368;
      var10004 = 782;
      Intrinsics.checkNotNullExpressionValue(var8, "toLowerCase(...)");
      CharSequence var9 = var8;
      var10002 = 32379;
      var10003 = -15471;
      byte var2 = ((byte)((StringsKt.contains(var9, "mac", false)) ? 1 : 0));
      boolean var1 = (var10000 != 0);
      var10000 = var2;
      if (!var1) {
         var10000 = var2 != 0
            ? this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().getScreenWidth()
            : this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().getWidth();
      }

      int var3 = var10000;
      float var4 = var3 * this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      var10000 = ((this.t()) ? 1 : 0);
      if (!var1) {
         var10000 = var10000 != 0
            ? (int)(var4 - this.q() * this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll)
            : (int)var4;
      }

      return var10000;
   }

   public final int l() {
      int var10000 = ((x()) ? 1 : 0);
      short var10001 = 32381;
      short var10002 = -30699;
      String var5 = System.getProperty("os.name");
      short var10003 = 32380;
      short var10004 = 15467;
      Intrinsics.checkNotNullExpressionValue(var5, "getProperty(...)");
      String var6 = var5.toLowerCase(Locale.ROOT);
      var10003 = 32383;
      var10004 = 1075;
      Intrinsics.checkNotNullExpressionValue(var6, "toLowerCase(...)");
      CharSequence var7 = var6;
      var10002 = 32378;
      var10003 = 21544;
      byte var2 = ((byte)((StringsKt.contains(var7, "mac", false)) ? 1 : 0));
      boolean var1 = (var10000 != 0);
      var10000 = var2;
      if (!var1) {
         var10000 = var2 != 0
            ? this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().getScreenHeight()
            : this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().getHeight();
      }

      int var3 = var10000;
      return (int)(var3 * this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
   }

   @NotNull
   public abstract String m();

   public abstract void n();

   public abstract void o();

   public abstract boolean p();

   public abstract float q();

   public abstract float r();

   public abstract boolean s();

   public boolean t() {
      return false;
   }

   public float d(float var1) {
      return 0.0F;
   }

   public void a(@NotNull GuiGraphicsExtractor var1) {
      short var10001 = 32382;
      short var10002 = 13999;
      Intrinsics.checkNotNullParameter(var1, "context");
   }

   public void u() {
   }

   public void v() {
   }

   public static void b(boolean var0) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
   }

   public static boolean w() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public static boolean x() {
      boolean var0 = w();
      return !var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "X\u000f\u009fy¼¸\u0007ÃÊ®\u001dÀyÇÙ\u001c\u0010%g0mU\u001c¡Ì\u0086Ü\u0017{§°\u0002ò\u0003.\u001d\r\u0003=\u0014o\u0010\u0019\u009b·ë¹ê§\u0089Þç\u009fé)âÓ¸\u0007Q\u0093í\u0000ðlê\u0007Ã\u0015rUO\u008a\u0088\u0010\u0006\u009d\u001d_Ö®ílÆ¾ñ%{{\u0099\u008b";
      int var4 = "X\u000f\u009fy¼¸\u0007ÃÊ®\u001dÀyÇÙ\u001c\u0010%g0mU\u001c¡Ì\u0086Ü\u0017{§°\u0002ò\u0003.\u001d\r\u0003=\u0014o\u0010\u0019\u009b·ë¹ê§\u0089Þç\u009fé)âÓ¸\u0007Q\u0093í\u0000ðlê\u0007Ã\u0015rUO\u008a\u0088\u0010\u0006\u009d\u001d_Ö®ílÆ¾ñ%{{\u0099\u008b"
         .length();
      char var1 = 16;
      int var8 = -1;
      b(true);

      label52:
while (true) {
         byte var10000 = 39;
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
                     case 0 -> 84;
                     case 1 -> 7;
                     case 2 -> 34;
                     case 3 -> 34;
                     case 4 -> 64;
                     case 5 -> 37;
                     default -> 23;
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
                     b = new String[10];
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

                  var2 = ".k\u008b\u0012\u0097\u0094V¸\"·þ\u0097\t¾D \u0007jø\u0019þý Ø";
                  var4 = ".k\u008b\u0012\u0097\u0094V¸\"·þ\u0097\t¾D \u0007jø\u0019þý Ø".length();
                  var1 = 16;
                  var8 = -1;
            }

            var10000 = 18;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 32376) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 207;
            case 1 -> 141;
            case 2 -> 142;
            case 3 -> 107;
            case 4 -> 237;
            case 5 -> 23;
            case 6 -> 95;
            case 7 -> 166;
            case 8 -> 128;
            case 9 -> 172;
            case 10 -> 194;
            case 11 -> 112;
            case 12 -> 2;
            case 13 -> 154;
            case 14 -> 46;
            case 15 -> 9;
            case 16 -> 241;
            case 17 -> 135;
            case 18 -> 150;
            case 19 -> 5;
            case 20 -> 206;
            case 21 -> 130;
            case 22 -> 138;
            case 23 -> 168;
            case 24 -> 122;
            case 25 -> 201;
            case 26 -> 251;
            case 27 -> 15;
            case 28 -> 178;
            case 29 -> 74;
            case 30 -> 67;
            case 31 -> 49;
            case 32 -> 147;
            case 33 -> 42;
            case 34 -> 200;
            case 35 -> 66;
            case 36 -> 99;
            case 37 -> 17;
            case 38 -> 244;
            case 39 -> 89;
            case 40 -> 184;
            case 41 -> 223;
            case 42 -> 82;
            case 43 -> 234;
            case 44 -> 75;
            case 45 -> 161;
            case 46 -> 116;
            case 47 -> 92;
            case 48 -> 72;
            case 49 -> 231;
            case 50 -> 11;
            case 51 -> 61;
            case 52 -> 173;
            case 53 -> 65;
            case 54 -> 106;
            case 55 -> 28;
            case 56 -> 43;
            case 57 -> 191;
            case 58 -> 253;
            case 59 -> 250;
            case 60 -> 175;
            case 61 -> 165;
            case 62 -> 156;
            case 63 -> 64;
            case 64 -> 189;
            case 65 -> 118;
            case 66 -> 152;
            case 67 -> 188;
            case 68 -> 155;
            case 69 -> 96;
            case 70 -> 103;
            case 71 -> 219;
            case 72 -> 32;
            case 73 -> 53;
            case 74 -> 186;
            case 75 -> 245;
            case 76 -> 119;
            case 77 -> 127;
            case 78 -> 110;
            case 79 -> 69;
            case 80 -> 153;
            case 81 -> 139;
            case 82 -> 192;
            case 83 -> 169;
            case 84 -> 80;
            case 85 -> 133;
            case 86 -> 86;
            case 87 -> 117;
            case 88 -> 164;
            case 89 -> 125;
            case 90 -> 13;
            case 91 -> 137;
            case 92 -> 182;
            case 93 -> 248;
            case 94 -> 132;
            case 95 -> 6;
            case 96 -> 187;
            case 97 -> 249;
            case 98 -> 54;
            case 99 -> 83;
            case 100 -> 58;
            case 101 -> 240;
            case 102 -> 246;
            case 103 -> 247;
            case 104 -> 242;
            case 105 -> 129;
            case 106 -> 94;
            case 107 -> 185;
            case 108 -> 176;
            case 109 -> 123;
            case 110 -> 180;
            case 111 -> 113;
            case 112 -> 226;
            case 113 -> 25;
            case 114 -> 55;
            case 115 -> 193;
            case 116 -> 148;
            case 117 -> 50;
            case 118 -> 38;
            case 119 -> 252;
            case 120 -> 222;
            case 121 -> 3;
            case 122 -> 62;
            case 123 -> 213;
            case 124 -> 105;
            case 125 -> 157;
            case 126 -> 111;
            case 127 -> 56;
            case 128 -> 229;
            case 129 -> 26;
            case 130 -> 134;
            case 131 -> 30;
            case 132 -> 73;
            case 133 -> 144;
            case 134 -> 93;
            case 135 -> 190;
            case 136 -> 76;
            case 137 -> 35;
            case 138 -> 146;
            case 139 -> 126;
            case 140 -> 18;
            case 141 -> 47;
            case 142 -> 238;
            case 143 -> 183;
            case 144 -> 124;
            case 145 -> 224;
            case 146 -> 235;
            case 147 -> 171;
            case 148 -> 179;
            case 149 -> 36;
            case 150 -> 239;
            case 151 -> 225;
            case 152 -> 243;
            case 153 -> 140;
            case 154 -> 209;
            case 155 -> 68;
            case 156 -> 202;
            case 157 -> 196;
            case 158 -> 181;
            case 159 -> 197;
            case 160 -> 10;
            case 161 -> 100;
            case 162 -> 208;
            case 163 -> 14;
            case 164 -> 70;
            case 165 -> 57;
            case 166 -> 143;
            case 167 -> 39;
            case 168 -> 84;
            case 169 -> 52;
            case 170 -> 160;
            case 171 -> 19;
            case 172 -> 255;
            case 173 -> 29;
            case 174 -> 104;
            case 175 -> 167;
            case 176 -> 220;
            case 177 -> 91;
            case 178 -> 81;
            case 179 -> 170;
            case 180 -> 145;
            case 181 -> 90;
            case 182 -> 232;
            case 183 -> 115;
            case 184 -> 78;
            case 185 -> 218;
            case 186 -> 24;
            case 187 -> 159;
            case 188 -> 71;
            case 189 -> 151;
            case 190 -> 0;
            case 191 -> 212;
            case 192 -> 16;
            case 193 -> 4;
            case 194 -> 198;
            case 195 -> 121;
            case 196 -> 227;
            case 197 -> 216;
            case 198 -> 33;
            case 199 -> 101;
            case 200 -> 210;
            case 201 -> 85;
            case 202 -> 114;
            case 203 -> 77;
            case 204 -> 131;
            case 205 -> 217;
            case 206 -> 97;
            case 207 -> 228;
            case 208 -> 31;
            case 209 -> 27;
            case 210 -> 174;
            case 211 -> 48;
            case 212 -> 45;
            case 213 -> 136;
            case 214 -> 12;
            case 215 -> 8;
            case 216 -> 109;
            case 217 -> 22;
            case 218 -> 195;
            case 219 -> 233;
            case 220 -> 214;
            case 221 -> 108;
            case 222 -> 204;
            case 223 -> 158;
            case 224 -> 203;
            case 225 -> 88;
            case 226 -> 37;
            case 227 -> 211;
            case 228 -> 236;
            case 229 -> 7;
            case 230 -> 98;
            case 231 -> 215;
            case 232 -> 177;
            case 233 -> 41;
            case 234 -> 34;
            case 235 -> 120;
            case 236 -> 221;
            case 237 -> 1;
            case 238 -> 199;
            case 239 -> 40;
            case 240 -> 163;
            case 241 -> 20;
            case 242 -> 230;
            case 243 -> 254;
            case 244 -> 59;
            case 245 -> 21;
            case 246 -> 79;
            case 247 -> 51;
            case 248 -> 205;
            case 249 -> 63;
            case 250 -> 60;
            case 251 -> 102;
            case 252 -> 87;
            case 253 -> 44;
            case 254 -> 149;
            default -> 162;
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
    public lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII(float var0, float var1, float var2, int var3, kotlin.jvm.internal.DefaultConstructorMarker var4) { this(var0, var1, (var3 & 4) != 0 ? 1.0F : var2); }
}
