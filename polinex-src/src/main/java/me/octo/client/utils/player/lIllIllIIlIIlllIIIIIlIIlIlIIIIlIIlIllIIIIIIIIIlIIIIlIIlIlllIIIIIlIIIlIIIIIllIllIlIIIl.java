package me.octo.client.utils.player;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl
   extends IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI {
   @NotNull
   private final lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String b;

   public lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl(
      @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1
   ) {
      Intrinsics.checkNotNullParameter(var1, b);
      super(var1);
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI(
         var1
      );
   }

   @Override
   public void a(float var1, float var2, float var3, float var4) {
      Object var13 = null; // PX-FIX
      Object var11 = null; // PX-FIX
      int var5;
      float var6;
      float var12;
      label58: {
         int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
         var6 = RangesKt.coerceIn(var2, -89.9F, 89.9F);
         var5 = var10000;
         float var14;
         int var10 = (var14 = Math.abs(var6) - 87.5F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
         if (var5 != 0) {
            if (var10 <= 0) {
               var12 = var1;
               break label58;
            }

            var10 = ((this.a().h()) ? 1 : 0);
         }

         label49: {
            label48: {
               if (var5 != 0) {
                  if (var10 == 0) {
                     break label48;
                  }

                  var11 = this.a();
                  if (var5 == 0) {
                     break label49;
                  }

                  var10 = ((me.octo.client.PXDyn)var11).i();
               }

               if (var10 == 0) {
                  var11 = this.a();
                  break label49;
               }
            }

            var12 = var3;
            break label58;
         }

         var12 = ((me.octo.client.PXDyn)var11).l();
      }

      float var7;
      var7 = var12;
      var13 = this.a();
      label36:
      if (var5 != 0) {
         if (((me.octo.client.PXDyn)var13).h()) {
            var13 = this.a();
            if (var5 == 0) {
               break label36;
            }

            if (!(Boolean)((me.octo.client.PXDyn)var13).i()) {
               float var8 = Math.abs(
                  lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                     .c(var7 - this.a().l())
               );
               float var9 = Math.abs(var6 - this.a().m());
               if (var5 == 0) {
                  return;
               }

               if (var8 + var9 < 1.5F) {
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.b(var7, var6);
                  return;
               }
            }
         }

         var13 = this.a();
      }

      ((me.octo.client.PXDyn)var13).a(var3, var4, var7, var6, this);
   }

   @Override
   public void c() {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.b();
   }

   @Override
   public void b() {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.c();
   }

   @Override
   public void d() {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.d();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var10003 = "\u00050i\u0016".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 6;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 6;
         var10006 = var0;
      } else {
         var6 = 6;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            break pxClinit; // PX-FIX
         }

         var10005 = var10003;
         var10 = 6;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 96;
            case 1 -> 89;
            case 2 -> 29;
            case 3 -> 117;
            case 4 -> 125;
            case 5 -> 35;
            default -> 41;
         });
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               break pxClinit; // PX-FIX
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   } // PX-FIX end pxClinit
   }
}
