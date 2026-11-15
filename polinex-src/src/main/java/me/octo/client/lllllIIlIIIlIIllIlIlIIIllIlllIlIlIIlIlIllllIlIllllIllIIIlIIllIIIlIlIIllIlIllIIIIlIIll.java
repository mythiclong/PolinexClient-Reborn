package me.octo.client;

import java.util.Locale;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import org.graalvm.polyglot.HostAccess.Export;
import org.jetbrains.annotations.NotNull;

public final class lllllIIlIIIlIIllIlIlIIIllIlllIlIlIIlIlIllllIlIllllIllIIIlIIllIIIlIlIIllIlIllIIIIlIIll {
   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Set<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public lllllIIlIIIlIIllIlIlIIIllIlllIlIlIIlIlIllllIlIllllIllIIIlIIllIIIlIlIIllIlIllIIIIlIIll() {
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = -19440;
      short var10004 = 23736;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      String[] var1 = new String[3];
      var10003 = -19430;
      var10004 = 21691;
      var1[0] = "png";
      var10003 = -19435;
      var10004 = -14558;
      var1[1] = "jpg";
      var10003 = -19436;
      var10004 = -23529;
      var1[2] = "jpeg";
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = SetsKt.setOf(var1);
   }

   private final boolean a(String var1) {
      String var10000 = StringsKt.substringAfterLast(var1, '.', "").toLowerCase(Locale.ROOT);
      short var10002 = -19438;
      short var10003 = 28682;
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      String var2 = var10000;
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.contains(var2);
   }

   @Export
   public final int a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().getGuiScaledWidth();
   }

   @Export
   public final int b() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().getGuiScaledHeight();
   }

   @Export
   public final int c() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().getScreenWidth();
   }

   @Export
   public final int d() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().getScreenHeight();
   }

   @Export
   public final int e() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getWindow().getGuiScale();
   }

   @Export
   public final void a(double var1, double var3, double var5, double var7, int var9) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         (float)var1, (float)var3, (float)var5, (float)var7, var9
      );
   }

   @Export
   public final void a(double var1, double var3, double var5, double var7, int var9, double var10) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         (float)var1, (float)var3, (float)var5, (float)var7, var9, (float)var10
      );
   }

   @Export
   public final void a(double var1, double var3, double var5, double var7, double var9, int var11) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
         (float)var1, (float)var3, (float)var5, (float)var7, (float)var9, var11, 0.0F
      );
   }

   @Export
   public final void a(double var1, double var3, double var5, double var7, double var9, int var11, double var12) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
         (float)var1, (float)var3, (float)var5, (float)var7, (float)var9, var11, (float)var12
      );
   }

   @Export
   public final void a(double var1, double var3, double var5, int var7) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a((float)var1, (float)var3, (float)var5, var7);
   }

   @Export
   public final void b(double var1, double var3, double var5, double var7, int var9) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.b(
         (float)var1, (float)var3, (float)var5, (float)var7, var9
      );
   }

   @Export
   public final void a(@NotNull String var1, double var2, double var4, double var6, int var8) {
      short var10001 = -19434;
      short var10002 = 24618;
      Intrinsics.checkNotNullParameter(var1, "text");
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1, (float)var2, (float)var4, (float)var6, var8, null);
   }

   @Export
   public final double a(@NotNull String var1, double var2) {
      short var10001 = -19433;
      short var10002 = -10788;
      Intrinsics.checkNotNullParameter(var1, "text");
      return me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, (float)var2, null, 4, null);
   }

   @Export
   public final void b(double var1, double var3, double var5, double var7, double var9, int var11) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(
            (float)var1,
            (float)var3,
            (float)var5,
            (float)var7,
            (float)var9,
            new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var11)
         );
   }

   @Export
   public final void b(double var1, double var3, double var5, double var7, double var9, int var11, double var12) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.c(
         (float)var1, (float)var3, (float)var5, (float)var7, (float)var9, var11, (float)var12
      );
   }

   @Export
   public final void a(double var1, double var3, double var5, double var7) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((float)var1, (float)var3, (float)var5, (float)var7);
   }

   @Export
   public final void f() {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .i();
   }

   @Export
   public final void a(double var1) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b((float)var1);
   }

   @Export
   public final void g() {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
   }

   @Export
   public final void h() {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
   }

   @Export
   public final void a(double var1, double var3) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b((float)var1, (float)var3);
   }

   @Export
   public final void b(double var1, double var3) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((float)var1, (float)var3);
   }

   @Export
   public final void b(double var1) {
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a((float)var1);
   }

   @Export
   public final void a(@NotNull String var1, double var2, double var4, double var6, double var8) {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      short var10002 = -19437;
      short var10003 = 31049;
      Intrinsics.checkNotNullParameter(var1, "path");
      String[] var10 = var10000;
      if (var10 != null) {
         if (!this.a(var1)) {
            return;
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var1,
            (float)var2,
            (float)var4,
            (float)var6,
            (float)var8,
            0.0F,
            0.0F,
            0.0F,
            0.0F);
      }
   }

   @Export
   public final void a(@NotNull String var1, double var2, double var4, double var6, double var8, double var10) {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      short var10002 = -19439;
      short var10003 = -12272;
      Intrinsics.checkNotNullParameter(var1, "path");
      String[] var12 = var10000;
      if (var12 != null) {
         if (!this.a(var1)) {
            return;
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1, (float)var2, (float)var4, (float)var6, (float)var8, (float)var10, (float)var10, (float)var10, (float)var10);
      }
   }

   @Export
   public final void b(@NotNull String var1, double var2, double var4, double var6, double var8, double var10) {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      short var10002 = -19437;
      short var10003 = 31049;
      Intrinsics.checkNotNullParameter(var1, "path");
      String[] var12 = var10000;
      if (var12 != null) {
         if (!this.a(var1)) {
            return;
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1, (float)var2, (float)var4, (float)var6, (float)var8, 0.0F, 0.0F, 0.0F, 0.0F, (float)var10);
      }
   }

   @Export
   public final void a(@NotNull String var1, double var2, double var4, double var6, double var8, int var10) {
      String[] var10000 = IllIlIIIIlIIlIIllIIIlIlIIlIIlIIIlllllIIIIIlllllIIlIIIIlIIllIlIlIlIlIIIIllIIllllIIIIlI.b();
      short var10002 = -19437;
      short var10003 = 31049;
      Intrinsics.checkNotNullParameter(var1, "path");
      String[] var11 = var10000;
      if (var11 != null) {
         if (!this.a(var1)) {
            return;
         }

         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
            me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var1,
            (float)var2,
            (float)var4,
            (float)var6,
            (float)var8,
            var10,
            0.0F,
            0.0F);
      }
   }

   @Export
   public final int a(int var1, int var2, int var3, int var4) {
      return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1, var2, var3, var4).o();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "Äl\u00167àD\u0005\u0010ñbAé\u008aÌ\u0086W\u0004ÛCI\u001a\u0010à×Û-\u007fóÊ\u0010Á\u0014©5\u0097W%$\u0004{s]\u001c\u0004\u001b\u001dÙI\u0004\u009cÝ)Q\u0004Ø\u0016a\u008c";
      int var4 = "Äl\u00167àD\u0005\u0010ñbAé\u008aÌ\u0086W\u0004ÛCI\u001a\u0010à×Û-\u007fóÊ\u0010Á\u0014©5\u0097W%$\u0004{s]\u001c\u0004\u001b\u001dÙI\u0004\u009cÝ)Q\u0004Ø\u0016a\u008c"
         .length();
      char var1 = 16;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 124;
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
                     case 0 -> 14;
                     case 1 -> 87;
                     case 2 -> 10;
                     case 3 -> 78;
                     case 4 -> 34;
                     case 5 -> 127;
                     default -> 69;
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
                     b = new String[9];
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

                  var2 = "\u0014òo\u0003\u00ad\u0091\u0001";
                  var4 = "\u0014òo\u0003\u00ad\u0091\u0001".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 34;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -19438) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 170;
            case 1 -> 168;
            case 2 -> 159;
            case 3 -> 36;
            case 4 -> 176;
            case 5 -> 62;
            case 6 -> 118;
            case 7 -> 135;
            case 8 -> 55;
            case 9 -> 151;
            case 10 -> 137;
            case 11 -> 218;
            case 12 -> 128;
            case 13 -> 73;
            case 14 -> 234;
            case 15 -> 181;
            case 16 -> 79;
            case 17 -> 158;
            case 18 -> 30;
            case 19 -> 157;
            case 20 -> 32;
            case 21 -> 88;
            case 22 -> 141;
            case 23 -> 98;
            case 24 -> 145;
            case 25 -> 116;
            case 26 -> 225;
            case 27 -> 254;
            case 28 -> 111;
            case 29 -> 236;
            case 30 -> 10;
            case 31 -> 106;
            case 32 -> 164;
            case 33 -> 60;
            case 34 -> 252;
            case 35 -> 177;
            case 36 -> 204;
            case 37 -> 217;
            case 38 -> 86;
            case 39 -> 233;
            case 40 -> 242;
            case 41 -> 246;
            case 42 -> 154;
            case 43 -> 71;
            case 44 -> 101;
            case 45 -> 222;
            case 46 -> 136;
            case 47 -> 219;
            case 48 -> 223;
            case 49 -> 132;
            case 50 -> 9;
            case 51 -> 156;
            case 52 -> 185;
            case 53 -> 46;
            case 54 -> 42;
            case 55 -> 109;
            case 56 -> 208;
            case 57 -> 129;
            case 58 -> 155;
            case 59 -> 25;
            case 60 -> 52;
            case 61 -> 205;
            case 62 -> 253;
            case 63 -> 203;
            case 64 -> 174;
            case 65 -> 162;
            case 66 -> 2;
            case 67 -> 207;
            case 68 -> 187;
            case 69 -> 186;
            case 70 -> 149;
            case 71 -> 17;
            case 72 -> 213;
            case 73 -> 83;
            case 74 -> 167;
            case 75 -> 122;
            case 76 -> 65;
            case 77 -> 146;
            case 78 -> 0;
            case 79 -> 29;
            case 80 -> 247;
            case 81 -> 241;
            case 82 -> 48;
            case 83 -> 123;
            case 84 -> 194;
            case 85 -> 175;
            case 86 -> 1;
            case 87 -> 108;
            case 88 -> 183;
            case 89 -> 45;
            case 90 -> 147;
            case 91 -> 113;
            case 92 -> 44;
            case 93 -> 248;
            case 94 -> 99;
            case 95 -> 117;
            case 96 -> 206;
            case 97 -> 81;
            case 98 -> 63;
            case 99 -> 140;
            case 100 -> 127;
            case 101 -> 37;
            case 102 -> 57;
            case 103 -> 4;
            case 104 -> 232;
            case 105 -> 13;
            case 106 -> 210;
            case 107 -> 199;
            case 108 -> 226;
            case 109 -> 77;
            case 110 -> 172;
            case 111 -> 68;
            case 112 -> 173;
            case 113 -> 35;
            case 114 -> 53;
            case 115 -> 114;
            case 116 -> 197;
            case 117 -> 64;
            case 118 -> 23;
            case 119 -> 115;
            case 120 -> 191;
            case 121 -> 91;
            case 122 -> 184;
            case 123 -> 200;
            case 124 -> 243;
            case 125 -> 61;
            case 126 -> 51;
            case 127 -> 180;
            case 128 -> 82;
            case 129 -> 202;
            case 130 -> 212;
            case 131 -> 125;
            case 132 -> 70;
            case 133 -> 143;
            case 134 -> 33;
            case 135 -> 134;
            case 136 -> 43;
            case 137 -> 6;
            case 138 -> 153;
            case 139 -> 120;
            case 140 -> 104;
            case 141 -> 27;
            case 142 -> 214;
            case 143 -> 59;
            case 144 -> 179;
            case 145 -> 144;
            case 146 -> 195;
            case 147 -> 131;
            case 148 -> 7;
            case 149 -> 216;
            case 150 -> 78;
            case 151 -> 201;
            case 152 -> 244;
            case 153 -> 22;
            case 154 -> 21;
            case 155 -> 110;
            case 156 -> 50;
            case 157 -> 193;
            case 158 -> 3;
            case 159 -> 54;
            case 160 -> 178;
            case 161 -> 196;
            case 162 -> 84;
            case 163 -> 190;
            case 164 -> 163;
            case 165 -> 96;
            case 166 -> 150;
            case 167 -> 80;
            case 168 -> 166;
            case 169 -> 112;
            case 170 -> 87;
            case 171 -> 67;
            case 172 -> 231;
            case 173 -> 58;
            case 174 -> 40;
            case 175 -> 95;
            case 176 -> 133;
            case 177 -> 211;
            case 178 -> 138;
            case 179 -> 18;
            case 180 -> 255;
            case 181 -> 12;
            case 182 -> 72;
            case 183 -> 56;
            case 184 -> 119;
            case 185 -> 189;
            case 186 -> 161;
            case 187 -> 126;
            case 188 -> 16;
            case 189 -> 240;
            case 190 -> 103;
            case 191 -> 93;
            case 192 -> 198;
            case 193 -> 182;
            case 194 -> 26;
            case 195 -> 89;
            case 196 -> 24;
            case 197 -> 8;
            case 198 -> 227;
            case 199 -> 235;
            case 200 -> 249;
            case 201 -> 92;
            case 202 -> 102;
            case 203 -> 229;
            case 204 -> 28;
            case 205 -> 230;
            case 206 -> 169;
            case 207 -> 39;
            case 208 -> 124;
            case 209 -> 76;
            case 210 -> 107;
            case 211 -> 49;
            case 212 -> 5;
            case 213 -> 97;
            case 214 -> 90;
            case 215 -> 251;
            case 216 -> 47;
            case 217 -> 14;
            case 218 -> 31;
            case 219 -> 15;
            case 220 -> 20;
            case 221 -> 105;
            case 222 -> 142;
            case 223 -> 238;
            case 224 -> 41;
            case 225 -> 19;
            case 226 -> 38;
            case 227 -> 74;
            case 228 -> 121;
            case 229 -> 11;
            case 230 -> 94;
            case 231 -> 152;
            case 232 -> 34;
            case 233 -> 139;
            case 234 -> 215;
            case 235 -> 228;
            case 236 -> 69;
            case 237 -> 237;
            case 238 -> 66;
            case 239 -> 220;
            case 240 -> 245;
            case 241 -> 160;
            case 242 -> 85;
            case 243 -> 165;
            case 244 -> 75;
            case 245 -> 250;
            case 246 -> 100;
            case 247 -> 148;
            case 248 -> 171;
            case 249 -> 239;
            case 250 -> 188;
            case 251 -> 221;
            case 252 -> 209;
            case 253 -> 224;
            case 254 -> 192;
            default -> 130;
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
