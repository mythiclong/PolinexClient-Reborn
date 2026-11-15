package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Options;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll
   extends lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII {
   @NotNull
   public static lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] c;
   private static String[] d;

   public lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll() {
      super(0.5F, 0.85F, 1.0F);
   }

   @NotNull
   @Override
   public String m() {
      short var10000 = 5536;
      short var10001 = -7105;
      return "Keystrokes";
   }

   @Override
   public boolean p() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.ae();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public void v() {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.af();
   }

   @Override
   public void n() {
      this.a(this.y());
   }

   @Override
   public void o() {
      this.a(this.y());
   }

   private final lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI y() {
      Options var10000 = this.a().options;
      short var10002 = 5543;
      short var10003 = -21136;
      Intrinsics.checkNotNullExpressionValue(var10000, "options");
      Options var1 = var10000;
      return new lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var1.keyUp.isDown(),
         var1.keyLeft.isDown(),
         var1.keyDown.isDown(),
         var1.keyRight.isDown(),
         var1.keyJump.isDown(),
         var1.keyAttack.isDown(),
         var1.keyUse.isDown()
      );
   }

   private final void a(
      lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      float var3 = this.z();
      float var4 = this.A();
      boolean var10000 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.w();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         0.0F,
         0.0F,
         var3,
         var4,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.78F),
         8.0F
      );
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         0.0F,
         0.0F,
         var3,
         var4,
         1.0F,
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.55F),
         8.0F
      );
      float var5 = 6.0F;
      float var6 = 92.0F;
      this.a(var5 + 28.0F + 4.0F, var5, 28.0F, 28.0F, "W", var1.a());
      float var8 = var5 + 32.0F;
      this.a(var5, var8, 28.0F, 28.0F, "A", var1.b());
      this.a(var5 + 28.0F + 4.0F, var8, 28.0F, 28.0F, "S", var1.c());
      this.a(var5 + 64.0F, var8, 28.0F, 28.0F, "D", var1.d());
      var8 += 32.0F;
      boolean var2 = var10000;
      var10000 = ((me.octo.client.PXDyn)(Object)(IlIllIIlIIIIlllllllIIIlllIlIIIIIIlIIllllllIIlIllIllIlllIllIlIIlIllIlIIlIllIIIIlIIIIlI.a())).ae();
      if (var2) {
         if (var10000) {
            float var9 = (var6 - 4.0F) / 2.0F;
            short var10005 = 5537;
            short var10006 = 29101;
            this.a(var5, var8, var9, 28.0F, "LMB", var1.f());
            float var10001 = var5 + var9 + 4.0F;
            var10005 = 5540;
            var10006 = -24937;
            this.a(var10001, var8, var9, 28.0F, "RMB", var1.g());
            var8 += 32.0F;
         }

         var10000 = ((me.octo.client.PXDyn)(Object)(IlIllIIlIIIIlllllllIIIlllIlIIIIIIlIIllllllIIlIllIllIlllIllIlIIlIllIlIIlIllIIIIlIIIIlI.b())).ae();
      }

      if (var10000) {
         short var13 = 5542;
         short var15 = -7725;
         this.a(var5, var8, var6, 14.0F, "______", var1.e());
      }
   }

   private final void a(float var1, float var2, float var3, float var4, String var5, boolean var6) {
      boolean var7 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var8 = var6
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
            .a(0.85F)
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .j()
            .a(0.7F);
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var9 = var6
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .ah()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .y()
            .a(0.55F);
      me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var10 = var6
         ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
         : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a();
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, var2, var3, var4, var8, 4.0F);
      float var10000 = var1;
      float var10001 = var2;
      if (!var7) {
         me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(var1, var2, var3, var4, 1.0F, var9, 4.0F);
         short var13 = 5544;
         short var10002 = 30373;
         if (!Intrinsics.areEqual(var5, "______")) {
            float var11 = (float)me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.a(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var5, false, 2, null);
            me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b(me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll, var5, var1 + (var3 - var11) / 2.0F, var2 + var4 / 2.0F - 6.0F, var10, false, 16, null);
            if (!var7) {
               return;
            }
         }

         var10000 = var3;
         var10001 = 0.5F;
      }

      float var12 = var10000 * var10001;
      me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         var1 + (var3 - var12) / 2.0F,
         var2 + var4 / 2.0F - 1.0F,
         var12,
         2.0F,
         var6
            ? IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .e()
            : IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()
               .a(0.7F),
         1.0F
      );
   }

   private final float z() {
      float var1 = 6.0F;
      return var1 * 2 + 84.0F + 8.0F;
   }

   private final float A() {
      float var1 = 6.0F;
      int var2 = 2;
      if (((me.octo.client.PXDyn)(Object)(IlIllIIlIIIIlllllllIIIlllIlIIIIIIlIIllllllIIlIllIllIlllIllIlIIlIllIlIIlIllIIIIlIIIIlI.a())).ae()) {
         var2++;
      }

      float var3 = var1 * 2 + var2 * 28.0F + (var2 - 1) * 4.0F;
      if (((me.octo.client.PXDyn)(Object)(IlIllIIlIIIIlllllllIIIlllIlIIIIIIlIIllllllIIlIllIllIlllIllIlIIlIllIlIIlIllIIIIlIIIIlI.b())).ae()) {
         var3 += 18.0F;
      }

      return var3;
   }

   @Override
   public float q() {
      return this.z();
   }

   @Override
   public float r() {
      return this.A();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "ý\u0000ìÌ\u0007\rãÝäÆ\u0003\u0090Õ\u009d(f\u0085{ò¦ºÚBR$w\u001få\u008eüËy\"\u0081>\u0003}î\u0019\u00969hÎ\u009cÐé&'ï5¹³f§\u0093\bòÒÞ ÏAÒÓ\u0003u\u0019ü\n\u0086¦\u0083\u0018ê\u0097^\u008eS¬\u0006ä®\u007fH¼\u0019";
      int var4 = "ý\u0000ìÌ\u0007\rãÝäÆ\u0003\u0090Õ\u009d(f\u0085{ò¦ºÚBR$w\u001få\u008eüËy\"\u0081>\u0003}î\u0019\u00969hÎ\u009cÐé&'ï5¹³f§\u0093\bòÒÞ ÏAÒÓ\u0003u\u0019ü\n\u0086¦\u0083\u0018ê\u0097^\u008eS¬\u0006ä®\u007fH¼\u0019"
         .length();
      char var1 = '\n';
      int var9 = -1;

      label52:
while (true) {
         byte var10000 = 69;
         String var10001 = var2.substring(++var9, var9 + var1);
         short var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var21 = var26;
               int var15 = var10004;
               byte var36;
               char[] var42;
               int var10006;
               if (var10004 <= 1) {
                  var42 = var26;
                  var36 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var42 = var26;
                  var36 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var42[var10006] = (char)(var42[var10006] ^ var36 ^ switch (var6 % 7) {
                     case 0 -> 100;
                     case 1 -> 28;
                     case 2 -> 105;
                     case 3 -> 24;
                     case 4 -> 120;
                     case 5 -> 21;
                     default -> 116;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var42 = var21;
                     var36 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var42 = var21;
                     var36 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var9 += var1) >= var4) {
                     c = var5;
                     d = new String[9];
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     var10002 = 5541;
                     short var32 = -25619;
                     short var33 = 5538;
                     short var40 = 25521;
                     IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var41 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                     short var46 = 5539;
                     short var50 = 7628;
                     IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var7 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
                        IlIllIIlIIIIlllllllIIIlllIlIIIIIIlIIllllllIIlIllIllIlllIllIlIIlIllIlIIlIllIIIIlIIIIlI.a(),
                        IlIllIIlIIIIlllllllIIIlllIlIIIIIIlIIllllllIIlIllIllIlllIllIlIIlIllIlIIlIllIIIIlIIIIlI.b()
                     };
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl(
                        "Keystrokes", "Displays your WASD/Mouse keys on screen.", var41, "Elements", var7
                     );
                     break label52;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "\u0085¥ÒIëd\u0086\u0006Z\u00134cIà";
                  var4 = "\u0085¥ÒIëd\u0086\u0006Z\u00134cIà".length();
                  var1 = 7;
                  var9 = -1;
            }

            var10000 = 19;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 5536) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 164;
            case 1 -> 129;
            case 2 -> 44;
            case 3 -> 180;
            case 4 -> 3;
            case 5 -> 218;
            case 6 -> 209;
            case 7 -> 124;
            case 8 -> 230;
            case 9 -> 182;
            case 10 -> 227;
            case 11 -> 120;
            case 12 -> 138;
            case 13 -> 62;
            case 14 -> 159;
            case 15 -> 122;
            case 16 -> 46;
            case 17 -> 136;
            case 18 -> 28;
            case 19 -> 71;
            case 20 -> 27;
            case 21 -> 128;
            case 22 -> 123;
            case 23 -> 245;
            case 24 -> 98;
            case 25 -> 143;
            case 26 -> 125;
            case 27 -> 49;
            case 28 -> 126;
            case 29 -> 60;
            case 30 -> 16;
            case 31 -> 142;
            case 32 -> 115;
            case 33 -> 133;
            case 34 -> 100;
            case 35 -> 235;
            case 36 -> 26;
            case 37 -> 21;
            case 38 -> 157;
            case 39 -> 97;
            case 40 -> 177;
            case 41 -> 114;
            case 42 -> 243;
            case 43 -> 39;
            case 44 -> 254;
            case 45 -> 51;
            case 46 -> 121;
            case 47 -> 141;
            case 48 -> 74;
            case 49 -> 250;
            case 50 -> 195;
            case 51 -> 36;
            case 52 -> 175;
            case 53 -> 200;
            case 54 -> 42;
            case 55 -> 150;
            case 56 -> 206;
            case 57 -> 34;
            case 58 -> 94;
            case 59 -> 89;
            case 60 -> 77;
            case 61 -> 226;
            case 62 -> 88;
            case 63 -> 68;
            case 64 -> 53;
            case 65 -> 169;
            case 66 -> 83;
            case 67 -> 59;
            case 68 -> 108;
            case 69 -> 35;
            case 70 -> 194;
            case 71 -> 174;
            case 72 -> 155;
            case 73 -> 217;
            case 74 -> 231;
            case 75 -> 80;
            case 76 -> 139;
            case 77 -> 12;
            case 78 -> 197;
            case 79 -> 116;
            case 80 -> 173;
            case 81 -> 135;
            case 82 -> 67;
            case 83 -> 196;
            case 84 -> 145;
            case 85 -> 190;
            case 86 -> 63;
            case 87 -> 22;
            case 88 -> 152;
            case 89 -> 156;
            case 90 -> 82;
            case 91 -> 4;
            case 92 -> 65;
            case 93 -> 24;
            case 94 -> 225;
            case 95 -> 203;
            case 96 -> 224;
            case 97 -> 10;
            case 98 -> 167;
            case 99 -> 160;
            case 100 -> 117;
            case 101 -> 172;
            case 102 -> 70;
            case 103 -> 249;
            case 104 -> 102;
            case 105 -> 201;
            case 106 -> 105;
            case 107 -> 17;
            case 108 -> 213;
            case 109 -> 146;
            case 110 -> 140;
            case 111 -> 188;
            case 112 -> 0;
            case 113 -> 151;
            case 114 -> 92;
            case 115 -> 5;
            case 116 -> 66;
            case 117 -> 32;
            case 118 -> 2;
            case 119 -> 210;
            case 120 -> 184;
            case 121 -> 52;
            case 122 -> 165;
            case 123 -> 112;
            case 124 -> 183;
            case 125 -> 233;
            case 126 -> 87;
            case 127 -> 185;
            case 128 -> 163;
            case 129 -> 25;
            case 130 -> 81;
            case 131 -> 130;
            case 132 -> 78;
            case 133 -> 246;
            case 134 -> 131;
            case 135 -> 207;
            case 136 -> 144;
            case 137 -> 8;
            case 138 -> 107;
            case 139 -> 228;
            case 140 -> 149;
            case 141 -> 193;
            case 142 -> 154;
            case 143 -> 137;
            case 144 -> 99;
            case 145 -> 147;
            case 146 -> 119;
            case 147 -> 162;
            case 148 -> 96;
            case 149 -> 19;
            case 150 -> 148;
            case 151 -> 189;
            case 152 -> 29;
            case 153 -> 76;
            case 154 -> 31;
            case 155 -> 205;
            case 156 -> 236;
            case 157 -> 239;
            case 158 -> 255;
            case 159 -> 251;
            case 160 -> 229;
            case 161 -> 73;
            case 162 -> 79;
            case 163 -> 75;
            case 164 -> 214;
            case 165 -> 72;
            case 166 -> 215;
            case 167 -> 1;
            case 168 -> 33;
            case 169 -> 113;
            case 170 -> 84;
            case 171 -> 91;
            case 172 -> 101;
            case 173 -> 166;
            case 174 -> 37;
            case 175 -> 186;
            case 176 -> 50;
            case 177 -> 176;
            case 178 -> 47;
            case 179 -> 93;
            case 180 -> 252;
            case 181 -> 199;
            case 182 -> 161;
            case 183 -> 216;
            case 184 -> 48;
            case 185 -> 244;
            case 186 -> 104;
            case 187 -> 232;
            case 188 -> 134;
            case 189 -> 64;
            case 190 -> 55;
            case 191 -> 15;
            case 192 -> 30;
            case 193 -> 7;
            case 194 -> 219;
            case 195 -> 111;
            case 196 -> 56;
            case 197 -> 57;
            case 198 -> 212;
            case 199 -> 110;
            case 200 -> 6;
            case 201 -> 220;
            case 202 -> 40;
            case 203 -> 106;
            case 204 -> 90;
            case 205 -> 132;
            case 206 -> 85;
            case 207 -> 11;
            case 208 -> 41;
            case 209 -> 241;
            case 210 -> 237;
            case 211 -> 54;
            case 212 -> 13;
            case 213 -> 238;
            case 214 -> 234;
            case 215 -> 223;
            case 216 -> 192;
            case 217 -> 14;
            case 218 -> 253;
            case 219 -> 170;
            case 220 -> 168;
            case 221 -> 248;
            case 222 -> 118;
            case 223 -> 221;
            case 224 -> 204;
            case 225 -> 178;
            case 226 -> 23;
            case 227 -> 38;
            case 228 -> 20;
            case 229 -> 242;
            case 230 -> 202;
            case 231 -> 208;
            case 232 -> 158;
            case 233 -> 95;
            case 234 -> 109;
            case 235 -> 58;
            case 236 -> 9;
            case 237 -> 187;
            case 238 -> 198;
            case 239 -> 61;
            case 240 -> 153;
            case 241 -> 127;
            case 242 -> 211;
            case 243 -> 247;
            case 244 -> 179;
            case 245 -> 181;
            case 246 -> 171;
            case 247 -> 191;
            case 248 -> 103;
            case 249 -> 86;
            case 250 -> 69;
            case 251 -> 45;
            case 252 -> 43;
            case 253 -> 18;
            case 254 -> 222;
            default -> 240;
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final boolean g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean h() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean i() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean j() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean k() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean l() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean m() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final boolean n() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7
      ) {
         return new lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 7703;
         boolean var1 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         boolean var2 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var3 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -8191;
         short var10002 = 7701;
         short var10003 = 3477;
         short var10004 = 7702;
         short var10005 = 10556;
         short var10006 = 7697;
         short var10007 = 393;
         short var10008 = 7698;
         short var10009 = -16816;
         short var10010 = 7696;
         short var10011 = -16378;
         short var10012 = 7700;
         short var10013 = 23773;
         return "KeyState(w=" + var7 + ", a=" + var6 + ", s=" + var5 + ", d=" + var4 + ", space=" + var3 + ", lmb=" + var2 + ", rmb=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         var1 = var1 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var1 = var1 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var1 = var1 * 31 + Boolean.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         return var1 * 31 + Boolean.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = lIllIIIlllIllllIIlIlllIIIlIlllllIIllIIlIIIlIllIIlIlIIlllIlllIIllllllIIllllIIIllllIlII.x();
         Object var10000 = this;
         if (!var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (!var2) {
            if (!(
               var10000 instanceof lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         boolean var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         boolean var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (!var2) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (!var2) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         if (!var2) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         if (!var2) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            var10001 = var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         }

         if (!var2) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            var10001 = var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         if (!var2) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            if (var2) {
               return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            }

            var10001 = var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         }

         return var4 == var10001;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[7];
         int var3 = 0;
         String var2 = "8Æ\"\u0005¾p\u0004\u0098o%`\u0004\u0081Ó\u0014÷\u000bÚäþ\u0092Y'/jC\rì\u0006/\u001aÞ\u009eü\u0003";
         int var4 = "8Æ\"\u0005¾p\u0004\u0098o%`\u0004\u0081Ó\u0014÷\u000bÚäþ\u0092Y'/jC\rì\u0006/\u001aÞ\u009eü\u0003".length();
         char var1 = 6;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 118;
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
                        case 0 -> 57;
                        case 1 -> 74;
                        case 2 -> 97;
                        case 3 -> 101;
                        case 4 -> 48;
                        case 5 -> 57;
                        default -> 52;
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

                     var2 = "Í:^\u001e\b\u0094Eb¼@s~.";
                     var4 = "Í:^\u001e\b\u0094Eb¼@s~.".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 96;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 7700) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 179;
               case 1 -> 141;
               case 2 -> 108;
               case 3 -> 147;
               case 4 -> 153;
               case 5 -> 201;
               case 6 -> 188;
               case 7 -> 251;
               case 8 -> 207;
               case 9 -> 102;
               case 10 -> 226;
               case 11 -> 127;
               case 12 -> 63;
               case 13 -> 232;
               case 14 -> 204;
               case 15 -> 9;
               case 16 -> 231;
               case 17 -> 183;
               case 18 -> 115;
               case 19 -> 185;
               case 20 -> 104;
               case 21 -> 109;
               case 22 -> 100;
               case 23 -> 96;
               case 24 -> 32;
               case 25 -> 206;
               case 26 -> 208;
               case 27 -> 45;
               case 28 -> 82;
               case 29 -> 219;
               case 30 -> 215;
               case 31 -> 60;
               case 32 -> 136;
               case 33 -> 67;
               case 34 -> 221;
               case 35 -> 7;
               case 36 -> 120;
               case 37 -> 101;
               case 38 -> 246;
               case 39 -> 1;
               case 40 -> 203;
               case 41 -> 235;
               case 42 -> 191;
               case 43 -> 103;
               case 44 -> 174;
               case 45 -> 166;
               case 46 -> 66;
               case 47 -> 5;
               case 48 -> 87;
               case 49 -> 223;
               case 50 -> 242;
               case 51 -> 14;
               case 52 -> 113;
               case 53 -> 116;
               case 54 -> 97;
               case 55 -> 237;
               case 56 -> 2;
               case 57 -> 162;
               case 58 -> 74;
               case 59 -> 44;
               case 60 -> 211;
               case 61 -> 78;
               case 62 -> 213;
               case 63 -> 198;
               case 64 -> 31;
               case 65 -> 0;
               case 66 -> 199;
               case 67 -> 81;
               case 68 -> 93;
               case 69 -> 16;
               case 70 -> 33;
               case 71 -> 20;
               case 72 -> 214;
               case 73 -> 118;
               case 74 -> 229;
               case 75 -> 114;
               case 76 -> 95;
               case 77 -> 112;
               case 78 -> 152;
               case 79 -> 253;
               case 80 -> 76;
               case 81 -> 65;
               case 82 -> 140;
               case 83 -> 250;
               case 84 -> 142;
               case 85 -> 94;
               case 86 -> 217;
               case 87 -> 212;
               case 88 -> 155;
               case 89 -> 151;
               case 90 -> 49;
               case 91 -> 160;
               case 92 -> 180;
               case 93 -> 8;
               case 94 -> 150;
               case 95 -> 80;
               case 96 -> 186;
               case 97 -> 55;
               case 98 -> 38;
               case 99 -> 133;
               case 100 -> 236;
               case 101 -> 252;
               case 102 -> 165;
               case 103 -> 169;
               case 104 -> 69;
               case 105 -> 59;
               case 106 -> 143;
               case 107 -> 77;
               case 108 -> 58;
               case 109 -> 24;
               case 110 -> 119;
               case 111 -> 37;
               case 112 -> 189;
               case 113 -> 72;
               case 114 -> 144;
               case 115 -> 132;
               case 116 -> 210;
               case 117 -> 157;
               case 118 -> 181;
               case 119 -> 130;
               case 120 -> 164;
               case 121 -> 56;
               case 122 -> 51;
               case 123 -> 43;
               case 124 -> 149;
               case 125 -> 128;
               case 126 -> 187;
               case 127 -> 137;
               case 128 -> 40;
               case 129 -> 163;
               case 130 -> 172;
               case 131 -> 220;
               case 132 -> 25;
               case 133 -> 216;
               case 134 -> 202;
               case 135 -> 4;
               case 136 -> 239;
               case 137 -> 241;
               case 138 -> 84;
               case 139 -> 30;
               case 140 -> 50;
               case 141 -> 184;
               case 142 -> 218;
               case 143 -> 197;
               case 144 -> 234;
               case 145 -> 233;
               case 146 -> 224;
               case 147 -> 193;
               case 148 -> 209;
               case 149 -> 35;
               case 150 -> 228;
               case 151 -> 176;
               case 152 -> 47;
               case 153 -> 34;
               case 154 -> 6;
               case 155 -> 122;
               case 156 -> 196;
               case 157 -> 222;
               case 158 -> 190;
               case 159 -> 173;
               case 160 -> 192;
               case 161 -> 200;
               case 162 -> 240;
               case 163 -> 19;
               case 164 -> 13;
               case 165 -> 158;
               case 166 -> 57;
               case 167 -> 123;
               case 168 -> 85;
               case 169 -> 26;
               case 170 -> 3;
               case 171 -> 126;
               case 172 -> 227;
               case 173 -> 177;
               case 174 -> 18;
               case 175 -> 145;
               case 176 -> 254;
               case 177 -> 79;
               case 178 -> 139;
               case 179 -> 135;
               case 180 -> 12;
               case 181 -> 161;
               case 182 -> 146;
               case 183 -> 64;
               case 184 -> 106;
               case 185 -> 42;
               case 186 -> 243;
               case 187 -> 244;
               case 188 -> 89;
               case 189 -> 247;
               case 190 -> 88;
               case 191 -> 71;
               case 192 -> 70;
               case 193 -> 22;
               case 194 -> 255;
               case 195 -> 138;
               case 196 -> 53;
               case 197 -> 134;
               case 198 -> 54;
               case 199 -> 159;
               case 200 -> 61;
               case 201 -> 98;
               case 202 -> 194;
               case 203 -> 148;
               case 204 -> 110;
               case 205 -> 111;
               case 206 -> 90;
               case 207 -> 156;
               case 208 -> 48;
               case 209 -> 41;
               case 210 -> 21;
               case 211 -> 36;
               case 212 -> 86;
               case 213 -> 170;
               case 214 -> 29;
               case 215 -> 154;
               case 216 -> 249;
               case 217 -> 39;
               case 218 -> 73;
               case 219 -> 107;
               case 220 -> 248;
               case 221 -> 230;
               case 222 -> 167;
               case 223 -> 46;
               case 224 -> 52;
               case 225 -> 91;
               case 226 -> 17;
               case 227 -> 178;
               case 228 -> 75;
               case 229 -> 62;
               case 230 -> 131;
               case 231 -> 99;
               case 232 -> 129;
               case 233 -> 121;
               case 234 -> 92;
               case 235 -> 238;
               case 236 -> 10;
               case 237 -> 83;
               case 238 -> 23;
               case 239 -> 105;
               case 240 -> 11;
               case 241 -> 182;
               case 242 -> 245;
               case 243 -> 168;
               case 244 -> 225;
               case 245 -> 175;
               case 246 -> 27;
               case 247 -> 195;
               case 248 -> 68;
               case 249 -> 171;
               case 250 -> 124;
               case 251 -> 15;
               case 252 -> 28;
               case 253 -> 117;
               case 254 -> 205;
               default -> 125;
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
   
    public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, int var8, Object var9) {
        if ((var8 & 1) != 0) {
            var1 = var0.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }
        if ((var8 & 2) != 0) {
            var2 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }
        if ((var8 & 4) != 0) {
            var3 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }
        return var0.a(var1, var2, var3, var4, var5, var6, var7);
    }}

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl a() {
         return lIlIIIIIIIIIIlIllIIIllllllIIIIIIIIIIlIllIIlllllIlllIlIIIlIlllIllIIIIllIllIllllllIllll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }
   }

  // PX-FIX synth restored from jar bytecode
  public static final me.octo.client.llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl B() { return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI; }
}
